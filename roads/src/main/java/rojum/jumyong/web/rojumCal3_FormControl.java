
package main.java.rojum.jumyong.web;


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


import main.java.rojum.jumyong.model.GapanBaseBean;
import main.java.rojum.jumyong.model.ProductBean;

import main.java.rojum.jumyong.service.*;

public class rojumCal3_FormControl extends SimpleFormController {	
	
  	/**
  	 * CALCULATION ����Ʈ ��ȸ
	 * @param HttpServletRequest request
	 * @param HttpServletResponce responce
	 * @return ModelAndView
	 */
	
	private	CommonCodeService	commonCode		= null;	
	private IJumyongService objJumyongService = null;
	private	Util				util			= new Util();
	
	
	public void setRojum_jumyongService(IJumyongService newObjJumyongService) {
		this.objJumyongService = newObjJumyongService;
	}
	public void setCommonCodeService(CommonCodeService commonCode) 
	{
		this.commonCode 	= commonCode;
	}
	
	public rojumCal3_FormControl() {
		setBindOnNewForm(true);
	}
	
	protected Object formBackingObject(HttpServletRequest request) throws ServletException {
		System.out.println("rojumCal3_FormControl : : formBackingObject");

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
					String use_section = ServletRequestUtils.getStringParameter(request,"USE_SECTION");
					
					System.out.println("@@@@@@@@@@@ GAPAN_NO :"+gapanNo);
					System.out.println("@@@@@@@@@@@ seq :"+seq);
					
					
					//	������ �����͸� �����´�.
					UserBean	userBean	= new UserBean();
					userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
					
					//���� ��¥
					Calendar  cal  =  Calendar.getInstance();
					SimpleDateFormat  sdf  =  new SimpleDateFormat("yyyy");      // ������ ��� ���� ����
					String  strYear  =  sdf.format (cal.getTime());
					
												
					String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
					
					request.setAttribute("GAPAN_NO", gapanNo);
					request.setAttribute("seq", seq);
					request.setAttribute("currentPage", strCurrentPage);
					request.setAttribute("USE_SECTION", use_section);
					
					pb = new ProductBean();
					
					List productList = objJumyongService.ProductList(Integer.parseInt(strCurrentPage),5,gapanNo,"3");
					
					int listSize = productList.size();	
					request.setAttribute("listSize", String.valueOf((listSize)));
					
		//			����Ʈ�� ����¡ html
					
					int totalProductCount = objJumyongService.getProductListCount(gapanNo,"3");
					request.setAttribute("totalProductCount", String.valueOf((totalProductCount)));
					
					String strPageDivideForm = BoardUtil.getDividePageForm(Integer.parseInt(strCurrentPage),5, "", "GAPAN_NO="+gapanNo, "/rojum/jumyong/rojumCal3.do", totalProductCount);
					request.setAttribute("strPageDivideForm", strPageDivideForm);
					
					//section ����
									
					Map mapSection = (Map)objJumyongService.getSection(gapanNo);
					String section = mapSection.get("SECTION").toString();	
					request.setAttribute("SECTION", section);
					
					Map mapTaxAt = (Map)objJumyongService.getTaxtationAt(gapanNo);
					String tax_at = mapTaxAt.get("TAXTATION_AT").toString();	
					request.setAttribute("tax_at", tax_at);
					
					String existOwner = objJumyongService.getExistOwner(gapanNo);
					request.setAttribute("existOwner", existOwner);
					
					String strFormView = "/rojum/jumyong/info_product_penalty";
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
							
							String sum_lastyear;
							String last_area_after;
							String year;
							String reduction_rate;
							String reduction_reason;
							String tax_set;
							
		
							
							Map retVal = objJumyongService.getInitCal(gapanNo,"3");
					

							System.out.println(retVal.toString());
							
							if(retVal.get("SUM_LASTYEAR") != null){
								sum_lastyear = retVal.get("SUM_LASTYEAR").toString();
							}else{
								sum_lastyear = "0";
							}
							
							if(retVal.get("LAST_AREA_AFTER") != null){
								last_area_after = retVal.get("LAST_AREA_AFTER").toString();
							}else{
								last_area_after = "0";
							}
							
							if(retVal.get("YEAR") != null){
								year = retVal.get("YEAR").toString();
								year = String.valueOf(Integer.parseInt(year)+1);
							}else{
								year = strYear;
							}
							
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
							
							pb.setYEAR(strYear);
							pb.setFROMDATE(year+"0101");
							pb.setTODATE(year+"1231");
							pb.setPERIOD("12");
							pb.setSUM_LASTYEAR(sum_lastyear);
							pb.setLAST_AREA_AFTER(last_area_after);
							pb.setAREA_AFTER(place_a);
							pb.setREDUCTION_RATE(reduction_rate);
							pb.setREDUCTION_REASON(reduction_reason);
							pb.setLT_SEL_YN(retVal.get("LT_SEL_YN").toString());
							pb.setPRICE(retVal.get("PENALTY_PRICE").toString());
							
						}else if(mode.equals("edit")){ //edit �϶�
							Map retVal = objJumyongService.getInitCal(gapanNo,"3");
							String yoyul = retVal.get("YOYUL").toString();
							String place_a = retVal.get("PLACE_A").toString();
							
							if(retVal.get("TAX_SET") != null){
								pb.setTAX_SET(retVal.get("TAX_SET").toString());

							}
							pb.setRATE(yoyul);
							pb.setAREA_AFTER(place_a);	
							pb.setLT_SEL_YN(retVal.get("LT_SEL_YN").toString());
						}else if(mode.equals("del")){
							// ���� �Ǽ�
							objJumyongService.executeDeleteCalTax(gapanNo,seq);
							request.setAttribute("ck_del", "1");
						}else{
							
							Map retVal = objJumyongService.getInitCal(gapanNo,"3");
							if(retVal.get("TAX_SET") != null){
								pb.setTAX_SET(retVal.get("TAX_SET").toString());
							}
						}
					
					if(seq == null) seq = "0";
						request.setAttribute("seq",  seq);
					//������ ������ ���ư� ������
					System.out.println("############view PLACE_A :::"+pb.getAREA_AFTER());
					setSuccessView("redirect:/rojum/jumyong/rojumCal3.do?GAPAN_NO="+gapanNo);

					//��¥���Ŀ� - �߰�
					if(pb.getFROMDATE() != null)
						pb.setFROMDATE(addDash(pb.getFROMDATE()));
					if(pb.getTODATE() != null)
						pb.setTODATE(addDash(pb.getTODATE()));
					
					
					
					request.setAttribute("taxation_part", commonCode.executeCommonCode("taxation_part", null, "����"));//	��������
					request.setAttribute("taxcode", commonCode.executeTaxCode("50", pb.getTAX_CD(), "����"));//	�����ڵ�
					request.setAttribute("taxpayer_residence", commonCode.executeCommonCode("taxpayer_residence", pb.getLIVE(), "����"));//	���ֻ���
					request.setAttribute("object_type", commonCode.executeCommonCode("object_type", pb.getOBJ_SET(), "����"));//	���Ǳ���
					request.setAttribute("taxpayer_group", commonCode.executeCommonCode("taxpayer_group", pb.getTAXPAYER_SET(), "����"));//	������ ����
					request.setAttribute("TAX_SET", "50");	//���Ա���
					
					request.setAttribute("TAX_GUBUN", commonCode.executeSearchCommonCode("taxation_part", pb.getTAX_GUBUN()));
					request.setAttribute("TAX_CD", commonCode.executeSearchTaxCode("50", pb.getTAX_CD())); //	�����ڵ�
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
					
					
				}

		}catch(Exception e){
			System.out.println("��������");
		}
		return pb;	
		
	}	
		
	protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command, BindException errors) throws Exception	 {
		
		System.out.println("rojumCal1_FormControl : : onSubmit ����3..");
		System.out.println("����� �Է��ϸ鼭 ���� ����Ǵ� �Լ�.(tab3)!!!!!!!!");
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
			
			//������Ʈ ��¥ ����
			HttpSession session = request.getSession();
			String userId	= (String)session.getAttribute("sessionUserId");
			
			GapanBaseBean bean = new GapanBaseBean();
			bean.setFINISH_ID(userId);
			bean.setGAPAN_NO(gapanNo);

			objJumyongService.GapanBaseUpdate(bean);
			
			
			if(mode.equals("add")){
				
				int cal_tax_seq = objJumyongService.getCal_Sum_Seq();
				System.out.println("3]cal_tax_seq:cal_tax_seq:"+cal_tax_seq);
				ProductBean pb2 = objProductBean;
				pb2.setSEQ(String.valueOf(cal_tax_seq));
				objProductBean.setTAX_SEQ(objProductBean.getSEQ());
				objProductBean.setSUM(objProductBean.getSUM_ADJUST());
				objProductBean.setCAL_MODE("3");
				
				objJumyongService.Cal_Sum_InfoInsert(pb2);		//GAPAN_CAL_SUM_INFO �Է�
				
				objProductBean.setCAL_SUM_SEQ(String.valueOf(cal_tax_seq));
				objJumyongService.insertProduct(objProductBean);	// ���⹰ �Է�	 GAPAN_CALCULATION_INFO
				
				
				// �ΰ����� �߰��Է�
				objProductBean.setBJ_CD(objProductBean.getGAPAN_NO().substring(3,6)+"00");
				objProductBean.setTAX_YM(objProductBean.getTAX_DATE().substring(0,6));
				objProductBean.setFORM1(objProductBean.getFORM());
				objProductBean.setFORM2(objProductBean.getFORM_ADJUST());
				objProductBean.setBONSE(objProductBean.getSUM_ADJUST());
				objProductBean.setSISE(objProductBean.getSUM_ADJUST());
				objProductBean.setINTAX(objProductBean.getSUM_ADJUST());
				
				objProductBean.setGP_TYP("002");
				
				System.out.println("3getSUM_YEAR ="+objProductBean.getSUM_YEAR());
				System.out.println("3getSUM_ADJUST ="+objProductBean.getSUM_ADJUST());
				
				if(objProductBean.getGasanRate().equals("")) objProductBean.setGasanRate("0");
				
				double bonse = Double.parseDouble(objProductBean.getBONSE());
				long overtax = (long)(bonse/100*Double.parseDouble(objProductBean.getGasanRate())+bonse);
				if(objProductBean.getGasanRate().equals("0") || objProductBean.getGasanRate().equals("")){
					objProductBean.setOVERTAX(String.valueOf(overtax));
				}else{
					objProductBean.setOVERTAX("0");
				}
				
				//gapan_taxation_info ���� ����
				objJumyongService.executeBugwa_Register(objProductBean);

			}else if(mode.equals("edit")){
				
				objJumyongService.updateProduct(objProductBean);	// ���⹰ ����
				
				objProductBean.setSEQ(objProductBean.getCAL_SUM_SEQ());
				
				objJumyongService.CalSumUpdate(objProductBean);		// CAL_SUM_INFO ������Ʈ
				
				// �ΰ����� �߰��Է�
				objProductBean.setBJ_CD(objProductBean.getGAPAN_NO().substring(3,6)+"00");
				objProductBean.setTAX_YM(objProductBean.getTAX_DATE().substring(0,6));
				objProductBean.setFORM1(objProductBean.getFORM());
				objProductBean.setFORM2(objProductBean.getFORM_ADJUST());
				objProductBean.setBONSE(objProductBean.getSUM_ADJUST());
				objProductBean.setSISE(objProductBean.getSUM_ADJUST());
				objProductBean.setINTAX(objProductBean.getSUM_ADJUST());
				System.out.println("3-2getSUM_YEAR ="+objProductBean.getSUM_YEAR());
				System.out.println("3-2getSUM_ADJUST ="+objProductBean.getSUM_ADJUST());
				objProductBean.setGP_TYP("002");
				objProductBean.setCAL_MODE("3");
				
				System.out.println("TESTTEST::::"+objProductBean.getGasanRate());
				
				//********** BEGIN_����_20120214
				if(objProductBean.getGasanRate().equals("")) objProductBean.setGasanRate("0");
				//********** END_����_20120214
				
				double bonse = Double.parseDouble(objProductBean.getSUM_ADJUST());
				long overtax = (long)(bonse/100*Double.parseDouble(objProductBean.getGasanRate())+bonse);
				if(objProductBean.getGasanRate().equals("0") || objProductBean.getGasanRate().equals("")){
					objProductBean.setOVERTAX("0");
				}else{
					objProductBean.setOVERTAX(String.valueOf(overtax));
				}
				
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