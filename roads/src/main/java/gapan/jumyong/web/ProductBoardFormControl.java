
package main.java.gapan.jumyong.web;


import main.java.common.commonCode.model.UserBean;
import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.util.Globals;



import java.text.SimpleDateFormat;
import java.util.*;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import org.springframework.validation.BindException;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import org.springframework.web.bind.ServletRequestUtils;

import main.java.common.util.*;
import main.java.common.util.catUtil.Util;


import main.java.gapan.jumyong.model.ProductBean;

import main.java.gapan.jumyong.service.*;

public class ProductBoardFormControl extends SimpleFormController {	
	
  	/**
  	 * CALCULATION ����Ʈ ��ȸ
	 * @param HttpServletRequest request
	 * @param HttpServletResponce responce
	 * @return ModelAndView
	 */
	
	private	CommonCodeService	commonCode		= null;	
	private IJumyongService objJumyongService = null;
	private	Util				util			= new Util();
	
	
	public void setGapan_jumyongService(IJumyongService newObjJumyongService) {
		this.objJumyongService = newObjJumyongService;
	}
	public void setCommonCodeService(CommonCodeService commonCode) 
	{
		this.commonCode 	= commonCode;
	}
	
	public ProductBoardFormControl() {
		setBindOnNewForm(true);
	}
	
	protected Object formBackingObject(HttpServletRequest request) throws ServletException {
		
		
		
		System.out.println("ProductBoardFormControl : : formBackingObject");

		// ���� ����
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		ProductBean pb = null;
		
		try{


			if(userId != null)
			{
				String gapanNo = ServletRequestUtils.getStringParameter(request,"GAPAN_NO");		
				String mode = ServletRequestUtils.getStringParameter(request,"mode","view");
				String seq = ServletRequestUtils.getStringParameter(request,"seq");
				String SECTION = ServletRequestUtils.getStringParameter(request,"SECTION");	
				String message = ServletRequestUtils.getStringParameter(request,"message", "");
				
				System.out.println("@@@@@@@@@@@ GAPAN_NO :"+gapanNo);
				System.out.println("@@@@@@@@@@@ seq :"+seq);
				System.out.println("@@@@@@@@@@@ message :"+message);
				
				//	������ �����͸� �����´�.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
				//���� ��¥
				Calendar  cal  =  Calendar.getInstance();
				SimpleDateFormat  sdf  =  new SimpleDateFormat("yyyy");      // ������ ��� ���� ����
				String  strYear  =  sdf.format (cal.getTime());
				
											
				String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
				String strCountPerPage = ServletRequestUtils.getStringParameter(request, "countPerPage", "5");
				
				request.setAttribute("GAPAN_NO", gapanNo);
				request.setAttribute("seq", seq);
				request.setAttribute("currentPage", strCurrentPage);
				
				pb = new ProductBean();
				
				List productList = objJumyongService.ProductList(Integer.parseInt(strCurrentPage),5,gapanNo,"1");
				
				int listSize = productList.size();	
				request.setAttribute("listSize", String.valueOf((listSize)));
				
	//			����Ʈ�� ����¡ html
				
				int totalProductCount = objJumyongService.getProductListCount(gapanNo,"1");
				request.setAttribute("totalProductCount", String.valueOf((totalProductCount)));
				
				String strPageDivideForm = BoardUtil.getDividePageForm(Integer.parseInt(strCurrentPage),5, "", "GAPAN_NO="+gapanNo, "/gapan/jumyong/productInsert.do", totalProductCount);
				request.setAttribute("strPageDivideForm", strPageDivideForm);
				
				//section ����
								
				Map mapSection = (Map)objJumyongService.getSection(gapanNo);
				String section = mapSection.get("SECTION").toString();	
				
				request.setAttribute("SECTION", section);
				
				String strFormView = "/gapan/jumyong/info_product";
				setFormView(strFormView);
			
					if(listSize > 0)	//������ ����Ʈ�� �ִ���...
					{
						System.out.println("������ ����Ʈ ����");
						
						if(!mode.equals("add"))		//	view	 
						{	
							if(seq == null || seq.equals("")||seq.equals("null"))
							{					
								seq = String.valueOf(((ProductBean)productList.get(0)).getSEQ());
							}							

								pb = objJumyongService.productInfo(gapanNo,seq);
								request.setAttribute("sum_seq",pb.getCAL_SUM_SEQ());
								request.setAttribute("bugwa_yn", pb.getBUGWA_YN());
						}else	
						{
							
						}
						request.setAttribute("productList", productList);
					}else{
						System.out.println("������ ����Ʈ ����.");
						
						mode = "add";		//������ mode�� 'add'��  �ν�
					}
						
					request.setAttribute("mode", mode);
					
					if(mode.equals("add"))		//add �϶� ���� ���ϱ�
					{
						
						String sum_lastyear = "";
						String last_area_after;
						String year;
						String reduction_rate;
						String reduction_reason;
						String tax_set;
						
						 int intFromdate = 0;
					     int intTodate = 0;
					     
						//���� �� ���⵵ ���� ����, ����� ������ �� ������ ��
						//gapan_calculation_info�� ������ �ҷ��ͼ� ���� �˻� �� �ϳ��� ������ ��� ������ �ÿ� �ƴҽ÷� ����
						List leep = objJumyongService.getCalculationDate(gapanNo, "1");
						
						Map retVal = objJumyongService.getInitCal(gapanNo,"1");
						
						for(int i =0; i<leep.size();i++){
							ProductBean bb = (ProductBean)leep.get(i);
							
							
							 
							if(retVal.get("YEAR") != null){
								if(bb.getFROMDATE().equals(retVal.get("YEAR")+"0101")){
									
									intFromdate = 1;
								}
				
								if(bb.getTODATE().equals(retVal.get("YEAR")+"1231")){
									intTodate = 1;
								}
								
							}else{
							 
							if(bb.getFROMDATE().equals(strYear+"0101")){
								
								intFromdate = 1;
							}
			
							if(bb.getTODATE().equals(strYear+"1231")){
								intTodate = 1;
							}
							
							}
				
							
							System.out.println("---(100510)---");
							System.out.println("fromdate : "+bb.getFROMDATE());
							System.out.println("todate" + bb.getTODATE());
							System.out.println("intFromdate : "+intFromdate);
							System.out.println("intTodate : "+intTodate);
							
						}
						
						
						System.out.println("sum_lastyear : "+retVal.get("SUM_LASTYEAR"));
						
						double z = 0;
						
						if(retVal.get("SUM_LASTYEAR") != null){
							if(intTodate == 1 && intFromdate == 1){
								z = Double.parseDouble(retVal.get("SUM_LASTYEAR").toString());
								
								z = (z/100)*100;
								
								sum_lastyear = String.valueOf((int)Math.floor(z));
								
							}else if(intTodate == 0 && intFromdate == 1){
								System.out.println("���� ���� �� �Ǵ°ž�?");
								
								List list = objJumyongService.getCalculationDate(gapanNo,"1");
								for(int c=0;c<list.size();c++){
									ProductBean obj = (ProductBean)list.get(c);
									System.out.println("---->"+retVal.get("YEAR").toString());
									System.out.println("====>"+obj.getYEAR());
									System.out.println(obj.getRATE().toString());
									System.out.println(obj.getAREA_AFTER().toString());
									System.out.println(obj.getPRICE().toString());
									//long overtax = (long)(bonse/100*Double.parseDouble(objProductBean.getGasanRate())+bonse);
									if(Integer.parseInt(retVal.get("YEAR").toString())-1 == Integer.parseInt(obj.getYEAR())){
										//a = Float.parseFloat(obj.getPRICE().toString())*Float.parseFloat(obj.getRATE().toString())*Float.parseFloat(obj.getAREA_AFTER().toString()); 
										z = Double.parseDouble(obj.getPRICE().toString())*Double.parseDouble(obj.getRATE().toString())*Double.parseDouble(obj.getAREA_AFTER().toString()); 
										
										z = (z/100)*100;
										
										sum_lastyear = String.valueOf((int)Math.floor(z));
							
										break;
									}
								}
								
							}else{
								sum_lastyear = "0";
							}	
						}else{
							sum_lastyear = "0";
						}
						
						if(retVal.get("LAST_AREA_AFTER") != null){
							last_area_after = retVal.get("LAST_AREA_AFTER").toString();
						}else{
							last_area_after = "0";
						}
						
						//20100511 ����
						if(intTodate == 1 && intFromdate == 1){
							year = retVal.get("YEAR").toString();
							year = String.valueOf(Integer.parseInt(year)+1);
						}else{
							if(retVal.get("YEAR") != null){
								year = retVal.get("YEAR").toString();
								}else{
								year= strYear;
								}
						}
						// ��
						
						if(retVal.get("REDUCTION_RATE") != null){
							reduction_rate = retVal.get("REDUCTION_RATE").toString();
						}else{
							reduction_rate = "0";
						}
						
						if(retVal.get("REDUCTION_REASON") != null){
							reduction_reason = retVal.get("REDUCTION_REASON").toString();
						}else{
							reduction_reason = "";
						}
						if(retVal.get("TAX_SET") != null){
							tax_set = retVal.get("TAX_SET").toString();
						}else{
							tax_set = "";
						}
						
						String yoyul = retVal.get("YOYUL").toString();
						String place_a = retVal.get("PLACE_A").toString();
						pb.setRATE(yoyul);
						pb.setTAX_SET(tax_set);
						
						pb.setYEAR(year);
						pb.setFROMDATE(year+"0101");
						pb.setTODATE(year+"1231");
						pb.setPERIOD("12");
						pb.setSUM_LASTYEAR(sum_lastyear);
						pb.setLAST_AREA_AFTER(last_area_after);
						pb.setAREA_AFTER(place_a);
						pb.setREDUCTION_RATE(reduction_rate);
						pb.setREDUCTION_REASON(reduction_reason);
						
					}else if(mode.equals("edit")){ //edit �϶�
						Map retVal = objJumyongService.getInitCal(gapanNo,"1");
						String yoyul = retVal.get("YOYUL").toString();
						String place_a = retVal.get("PLACE_A").toString();
						
						if(retVal.get("TAX_SET") != null){
							pb.setTAX_SET(retVal.get("TAX_SET").toString());

						}
						pb.setRATE(yoyul);
						pb.setAREA_AFTER(place_a);	
					}else if(mode.equals("del")){
						// ���� �Ǽ�
						objJumyongService.executeDeleteCalTax(gapanNo,seq);
						request.setAttribute("ck_del", "1");
					}else{
						
						Map retVal = objJumyongService.getInitCal(gapanNo,"1");
						if(retVal.get("TAX_SET") != null){
							pb.setTAX_SET(retVal.get("TAX_SET").toString());
						}
					}
				
				if(seq == null) seq = "0";
					request.setAttribute("seq",  seq);
					
				//������ ������ ���ư� ������
				System.out.println("############view PLACE_A :::"+pb.getAREA_AFTER());
				setSuccessView("redirect:/gapan/jumyong/productInsert.do?GAPAN_NO="+gapanNo);

				//��¥���Ŀ� - �߰�
				if(pb.getFROMDATE() != null)
					pb.setFROMDATE(addDash(pb.getFROMDATE()));
				if(pb.getTODATE() != null)
					pb.setTODATE(addDash(pb.getTODATE()));
				
				
				request.setAttribute("taxation_part", commonCode.executeCommonCode("taxation_part", pb.getTAX_GUBUN(), "����"));//	��������
				request.setAttribute("taxcode", commonCode.executeTaxCode(pb.getTAX_SET(), null, "����"));//	�����ڵ�
				
				request.setAttribute("taxpayer_residence", commonCode.executeCommonCode("taxpayer_residence", pb.getLIVE(), "����"));//	���ֻ���
				request.setAttribute("object_type", commonCode.executeCommonCode("object_type", pb.getOBJ_SET(), "����"));//	���Ǳ���
				request.setAttribute("taxpayer_group", commonCode.executeCommonCode("taxpayer_group", pb.getTAXPAYER_SET(), "����"));//	������ ����
				request.setAttribute("TAX_SET", pb.getTAX_SET());	//���Ա���
				
				request.setAttribute("TAX_GUBUN", commonCode.executeSearchCommonCode("taxation_part", pb.getTAX_GUBUN()));
				request.setAttribute("TAX_CD", commonCode.executeSearchTaxCode(pb.getTAX_SET(), pb.getTAX_CD())); //	�����ڵ�
				request.setAttribute("LIVE", commonCode.executeSearchCommonCode("taxpayer_residence", pb.getLIVE()));
				request.setAttribute("OBJ_SET", commonCode.executeSearchCommonCode("object_type", pb.getOBJ_SET()));
				request.setAttribute("TAXPAYER_SET", commonCode.executeSearchCommonCode("taxpayer_group", pb.getTAXPAYER_SET()));
				request.setAttribute("TAX_YN", pb.getTAX_YN());	//	�ΰ�����
				request.setAttribute("ADD_SET_NM", commonCode.executeCommonCodeNm("addition_part", pb.getADD_SET()));
				
				request.setAttribute("ORG_CD", userBean.getORG_CD());
				request.setAttribute("GU_NM", userBean.getGU_NM());
				request.setAttribute("DEPT_CD", userBean.getDEPT_CD());
				request.setAttribute("DEPT_NM", userBean.getDEPT_NM());
				
				SimpleDateFormat  todayFormat  =  new SimpleDateFormat("yyyy-MM-dd");      // ������ ��� ���� ����
				String  today  =  todayFormat.format (cal.getTime());
				request.setAttribute("TAX_DATE", today);
				
				if(message.length()>0){
					request.setAttribute("message", message);
				}
				
				if (!mode.equals("del") && (pb.getTAX_SET() == null || pb.getTAX_SET().equals(""))){
	    			
	    			request.setAttribute("message", "�ü�������ǿ��� ���� ���Ա����� �Է����ּ���");
	    		}
				
			}
			
		}catch(Exception e){
			e.printStackTrace();
			
		}
			
		
			
			
		return pb;
	}	
		
	protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command, BindException errors) throws Exception	 {
		
		System.out.println("productBoardFormControl : : onSubmit");
		
		try{							
			ProductBean objProductBean = (ProductBean)command;						
			
			//���� ��¥ , 7���� ��¥ ���ϱ�
			Calendar  cal  =  Calendar.getInstance();
			SimpleDateFormat  sdf  =  new SimpleDateFormat("yyyyMMdd");      // ������ ��� ���� ����
			String  toDate  =  sdf.format (cal.getTime());      // ���� ��¥ ������ ����
					
			
			objProductBean.setUP_DATE(toDate);
			
			
			String gapanNo = ServletRequestUtils.getStringParameter(request,"GAPAN_NO");
			String mode = ServletRequestUtils.getStringParameter(request,"mode");
			
			
			objProductBean.setGAPAN_NO(gapanNo);
			objProductBean.setFROMDATE(removeDash(objProductBean.getFROMDATE()));	//fromdate
			objProductBean.setTODATE(removeDash(objProductBean.getTODATE()));		//todate			
			objProductBean.setUSE_SECTION(objProductBean.getTAX_GUBUN());
			objProductBean.setFIRST_SEQ("");
			
			System.out.println("mode : "+mode);
			objJumyongService.Admin_baseUp_dateUpdateQuery(toDate, objProductBean.getGAPAN_NO());	//GAPAN_BASE�� �ڷ��Է� ��¥ ����(UPATE)									
			
			if(mode.equals("add")){
				//20100512 ����
				List leep = objJumyongService.getCalculationDate(gapanNo, "1");
				int from = 0;
				int to = 0;
				
				for(int i =0; i<leep.size();i++){
					ProductBean bb = (ProductBean)leep.get(i);
			
					from = Integer.parseInt(objProductBean.getFROMDATE());
					to = Integer.parseInt(objProductBean.getTODATE());
					
					if(Integer.parseInt(bb.getFROMDATE())<=from && Integer.parseInt(bb.getTODATE())>=from){
			
						return new ModelAndView(getSuccessView()+"&message=����Ⱓ�� �߸� �Է��ϼ̽��ϴ�");
					
						
					}else if(Integer.parseInt(bb.getFROMDATE())<=to && Integer.parseInt(bb.getTODATE())>=to){
						
						return new ModelAndView(getSuccessView()+"&message=����Ⱓ�� �߸� �Է��ϼ̽��ϴ�");
					}
					
					System.out.println("---(100510)---");
					System.out.println("fromdate : "+bb.getFROMDATE());
					System.out.println("todate" + bb.getTODATE());
				
				}
				//20100512 ��
				
				int cal_tax_seq = objJumyongService.getCal_Sum_Seq();
				System.out.println("cal_tax_seq:cal_tax_seq:"+cal_tax_seq);
				ProductBean pb2 = objProductBean;
				pb2.setSEQ(String.valueOf(cal_tax_seq));
				objProductBean.setTAX_SEQ(objProductBean.getSEQ());
				objProductBean.setSUM(objProductBean.getSUM_ADJUST());
				objProductBean.setCAL_MODE("1");
				
				objJumyongService.Cal_Sum_InfoInsert(pb2);		//GAPAN_CAL_SUM_INFO �Է�
				
				objProductBean.setCAL_SUM_SEQ(String.valueOf(cal_tax_seq));
				objJumyongService.insertProduct(objProductBean);	// ���⹰ �Է�	 GAPAN_CALCULATION_INFO
				
				
				// �ΰ����� �߰��Է�
				objProductBean.setBJ_CD(objProductBean.getGAPAN_NO().substring(3,6)+"00");
				objProductBean.setTAX_YM(objProductBean.getTAX_DATE().substring(0,6));
				objProductBean.setFORM1(objProductBean.getFORM());
				objProductBean.setFORM2(objProductBean.getFORM_ADJUST());

				if(objProductBean.getTAX_CD().equals("10212807")){						
					long sum = Math.round(Long.parseLong(objProductBean.getSUM_ADJUST())/2);
					
					String sumTemp = Long.toString(sum);
					long partOne = Long.valueOf(sumTemp.substring(sumTemp.length()-1,sumTemp.length())).longValue();
				
					objProductBean.setBONSE(objProductBean.getSUM_ADJUST());
					objProductBean.setSISE(Long.toString(sum+partOne));
					objProductBean.setGUSE(Long.toString(sum-partOne));		
				}else if(objProductBean.getTAX_CD().equals("10212808")){
					long sum = Math.round(Long.parseLong(objProductBean.getSUM_ADJUST())/2);
					
					String sumTemp = Long.toString(sum);
					long partOne = Long.valueOf(sumTemp.substring(sumTemp.length()-1,sumTemp.length())).longValue();
				
					objProductBean.setBONSE(objProductBean.getSUM_ADJUST());
					objProductBean.setSISE(Long.toString(sum+partOne));
					objProductBean.setGUSE(Long.toString(sum-partOne));
					
				}else if(objProductBean.getTAX_CD().equals("10211201")){
					
					long sum = Math.round(Long.parseLong(objProductBean.getSUM_ADJUST())/2);
					
					String sumTemp = Long.toString(sum);
					long partOne = Long.valueOf(sumTemp.substring(sumTemp.length()-1,sumTemp.length())).longValue();
				
					objProductBean.setBONSE(objProductBean.getSUM_ADJUST());
					objProductBean.setSISE(Long.toString(sum+partOne));
					objProductBean.setGUSE(Long.toString(sum-partOne));
					
				}else if(objProductBean.getTAX_CD().equals("10228202")){
					
					long sise = Math.round(Long.parseLong(objProductBean.getSUM_ADJUST())*60/100);
					long guse = Math.round(Long.parseLong(objProductBean.getSUM_ADJUST())*40/100);
					
					String sumTemp = Long.toString(guse);
					long partOne = Long.valueOf(sumTemp.substring(sumTemp.length()-1,sumTemp.length())).longValue();
															
					objProductBean.setBONSE(objProductBean.getSUM_ADJUST());
					objProductBean.setSISE(Long.toString(sise+partOne));
					objProductBean.setGUSE(Long.toString(guse-partOne));
		
				}else{
					objProductBean.setBONSE(objProductBean.getSUM_ADJUST());
					objProductBean.setSISE(objProductBean.getSUM_ADJUST());
					objProductBean.setGUSE("0");
				}
					
				objProductBean.setINTAX(objProductBean.getSUM_ADJUST());
				
				objProductBean.setGP_TYP("001");
				objProductBean.setCAL_MODE("1");
				
				System.out.println("------(20100511)-------");				
				System.out.println("sise : "+objProductBean.getSISE());
				System.out.println("guse : "+objProductBean.getGUSE());
				System.out.println("tax_cd : "+objProductBean.getTAX_CD());
				System.out.println("gasanrate :"+objProductBean.getGasanRate());
				
				
				double bonse = Double.parseDouble(objProductBean.getSUM_ADJUST());
				if(objProductBean.getGasanRate().equals("0") || objProductBean.getGasanRate().equals("")){
					objProductBean.setGasanRate("0");
				}
				
				long overtax = (long)(bonse/100*Double.parseDouble(objProductBean.getGasanRate())+bonse);
			
				
				objProductBean.setOVERTAX(String.valueOf(overtax));
				//���� ��
				
				System.out.println("overtax : "+overtax);
				System.out.println("getOvertax :"+objProductBean.getOVERTAX());
				
				//gapan_taxation_info ���� ����
				objJumyongService.executeBugwa_Register(objProductBean);

			}else if(mode.equals("edit")){
				
				System.out.println("����");
				objJumyongService.updateProduct(objProductBean);	// ���⹰ ����
				
				objProductBean.setSEQ(objProductBean.getCAL_SUM_SEQ());
				
				objJumyongService.CalSumUpdate(objProductBean);		// CAL_SUM_INFO ������Ʈ
				
				// �ΰ����� �߰��Է�
				objProductBean.setBJ_CD(objProductBean.getGAPAN_NO().substring(3,6)+"00");
				objProductBean.setTAX_YM(objProductBean.getTAX_DATE().substring(0,6));
				objProductBean.setFORM1(objProductBean.getFORM());
				objProductBean.setFORM2(objProductBean.getFORM_ADJUST());
		
				//���⿡ �ڵ��ؾ� �� (20100511)
				//�Ʒ��� 4���� �׸� �ܿ� �͵��� �ñ��� ��� ���� ��� �ü��� ����.
				//���� ���� ¡���ý��ۿ��� �׷��� �϶�� ��(20100512)
					//��
					System.out.println("------(20100511)-------");				
					System.out.println("sise : "+objProductBean.getSISE());
					System.out.println("guse : "+objProductBean.getGUSE());
					System.out.println("tax_cd : "+objProductBean.getTAX_CD());
					System.out.println("gasanRate : "+objProductBean.getGasanRate());

				objProductBean.setINTAX(objProductBean.getSUM_ADJUST());
				
				objProductBean.setGP_TYP("001");
				objProductBean.setCAL_MODE("1");
				
				//20100512 lhw ����
				double bonse = Double.parseDouble(objProductBean.getSUM_ADJUST());
				if(objProductBean.getGasanRate().equals("0") || objProductBean.getGasanRate().equals("")){
					objProductBean.setGasanRate("0");
				}
				
				long overtax = (long)(bonse/100*Double.parseDouble(objProductBean.getGasanRate())+bonse);
			
				
				objProductBean.setOVERTAX(String.valueOf(overtax));
				//���� ��
				
				if(objProductBean.getTAX_CD().equals("10212807")){						
					long sum = Math.round(Long.parseLong(objProductBean.getSUM_ADJUST())/2);
					
					String sumTemp = Long.toString(sum);
					long partOne = Long.valueOf(sumTemp.substring(sumTemp.length()-1,sumTemp.length())).longValue();
				
					objProductBean.setBONSE(objProductBean.getSUM_ADJUST());
					objProductBean.setSISE(Long.toString(sum+partOne));
					objProductBean.setGUSE(Long.toString(sum-partOne));		
				}else if(objProductBean.getTAX_CD().equals("10212808")){
					long sum = Math.round(Long.parseLong(objProductBean.getSUM_ADJUST())/2);
					
					String sumTemp = Long.toString(sum);
					long partOne = Long.valueOf(sumTemp.substring(sumTemp.length()-1,sumTemp.length())).longValue();
				
					objProductBean.setBONSE(objProductBean.getSUM_ADJUST());
					objProductBean.setSISE(Long.toString(sum+partOne));
					objProductBean.setGUSE(Long.toString(sum-partOne));
					
				}else if(objProductBean.getTAX_CD().equals("10211201")){
					
					long sum = Math.round(Long.parseLong(objProductBean.getSUM_ADJUST())/2);
					
					String sumTemp = Long.toString(sum);
					long partOne = Long.valueOf(sumTemp.substring(sumTemp.length()-1,sumTemp.length())).longValue();
				
					objProductBean.setBONSE(objProductBean.getSUM_ADJUST());
					objProductBean.setSISE(Long.toString(sum+partOne));
					objProductBean.setGUSE(Long.toString(sum-partOne));
					
				}else if(objProductBean.getTAX_CD().equals("10228202")){
					
					long sise = Math.round(Long.parseLong(objProductBean.getSUM_ADJUST())*60/100);
					long guse = Math.round(Long.parseLong(objProductBean.getSUM_ADJUST())*40/100);
					
					String sumTemp = Long.toString(guse);
					long partOne = Long.valueOf(sumTemp.substring(sumTemp.length()-1,sumTemp.length())).longValue();
															
					objProductBean.setBONSE(objProductBean.getSUM_ADJUST());
					objProductBean.setSISE(Long.toString(sise+partOne));
					objProductBean.setGUSE(Long.toString(guse-partOne));
		
				}else{
					objProductBean.setBONSE(objProductBean.getSUM_ADJUST());
					objProductBean.setSISE(objProductBean.getSUM_ADJUST());
					objProductBean.setGUSE("0");
				}
				
				
				System.out.println("-------numberformatexception");
				System.out.println("bonse : "+bonse);
		//		System.out.println("overtax : "+overtax);
				
				objJumyongService.updateBugwa_Register(objProductBean);
				
			}
			
		
		}catch(Exception err)
		{
			err.printStackTrace();
		}
		
		return new ModelAndView(getSuccessView());
	}
	
	public String removeDash(String val1)
	{			
		String[] components = val1.split("-");		
		String returnVal = "";		
		for(int i=0;i<components.length;i++)
			returnVal = returnVal + components[i].toString();
		
		return returnVal;		
	}
	
	public String addDash(String val1)
	{	
		if(val1.length() >= 8)
			val1 = val1.substring(0,4)+"-"+val1.substring(4,6)+"-"+val1.substring(6,8);
		else if(val1.length() >= 6)
			val1 = val1.substring(0,4)+"-"+val1.substring(4,6);
		
		return val1;
	}
}