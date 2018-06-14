
package main.java.facility.junggi.web;


import main.java.common.commonCode.model.UserBean;
import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.util.Globals;



import java.sql.Types;
import java.text.SimpleDateFormat;
import java.util.*;
import java.net.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.jdbc.core.SqlParameter;
import org.springframework.validation.BindException;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import org.springframework.web.bind.RequestUtils;
import org.springframework.web.bind.ServletRequestUtils;

import main.java.common.util.*;
import main.java.common.util.catUtil.Pageing;
import main.java.common.util.catUtil.Util;
import main.java.facility.jumyong.service.IJumyongService;
import main.java.jumyong.jumyong.model.ConfBean;
import main.java.jumyong.jumyong.model.PlaceLocationBean;
import main.java.facility.jumyong.model.Equip_ProductBean;
import main.java.facility.junggi.service.IJunggiService;
import main.java.jumyong.jumyong.model.jumregBean;
import main.java.jumyong.jumyong.service.*;

public class ProductBoardFormControl_facility extends SimpleFormController {	
	
  	/**
  	 * CALCULATION ����Ʈ ��ȸ
	 * @param HttpServletRequest request
	 * @param HttpServletResponce responce
	 * @return ModelAndView
	 */
	
	
	private	Pageing	pageing	= new Pageing();
	private	Util util = new Util();
	private IJunggiService objJunggiService = null;
	private IJumyongService objJumyongService = null;
	private	CommonCodeService	commonCode		= null;
	
	
	public void setJunggiService_facility(IJunggiService newObjJunggiService) {
		this.objJunggiService = newObjJunggiService;
	}
	
	public void setJumyongService_facility(IJumyongService newObjJumyongService) {
		this.objJumyongService = newObjJumyongService;
	}
	
	public ProductBoardFormControl_facility() {
		setBindOnNewForm(true);
	}
	public void setCommonCodeService(CommonCodeService commonCode) 
	{
		this.commonCode 	= commonCode;
	}
	
	
	protected Object formBackingObject(HttpServletRequest request) throws ServletException {
		
		System.out.println("********* formBackingObject ����л��� *******");
		String gu_code = ServletRequestUtils.getStringParameter(request,"GU_CODE");		
		String corp_cd = ServletRequestUtils.getStringParameter(request,"CORP_CD");
		String admin_no = ServletRequestUtils.getStringParameter(request,"ADMIN_NO");
		String object_no = ServletRequestUtils.getStringParameter(request, "OBJECT_NO","");
		String cal_sum_seq = ServletRequestUtils.getStringParameter(request, "cal_sum_seq","");
		String seq = ServletRequestUtils.getStringParameter(request, "SEQ","0");
		
		String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
		
		// ���⵵ ���
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");			  
		String thisDate = formatter.format(cal.getTime());			
		String thisYear = thisDate.substring(0,4);
		
		String year = ServletRequestUtils.getStringParameter(request, "year", thisYear);
		String tax_set = ServletRequestUtils.getStringParameter(request, "tax_set", "");
		String mode = ServletRequestUtils.getStringParameter(request, "mode", "");
		String sigu_cd = ServletRequestUtils.getStringParameter(request, "sigu_cd", "");
		String taxation_check = "0";	// �̻���Ȱ� üũ�ϱ����� 
		
		System.out.println("mode === " + mode);
		System.out.println("year === " + year);
		
		request.setAttribute("gu_code", gu_code);
		request.setAttribute("corp_cd", corp_cd);			
		request.setAttribute("admin_no", admin_no);
		request.setAttribute("object_no", object_no);
		request.setAttribute("cal_sum_seq", cal_sum_seq);
		request.setAttribute("SEQ", seq);
		request.setAttribute("currentPage", strCurrentPage);
		request.setAttribute("tax_set", tax_set);
		request.setAttribute("mode", mode);
		request.setAttribute("sigu_cd", sigu_cd);
				
		int gubunja = 0;
		
		Equip_ProductBean pb = new Equip_ProductBean();
				
		// 1 �������� ����Ʈ ī��Ʈ
		int listCount = objJunggiService.Cal_sumListCount(gu_code, corp_cd, admin_no, tax_set);
		
		// 1 ����¡
		int	rowCol = pageing.execute(request, listCount, Integer.parseInt(strCurrentPage), 10);
		
		// 1�������� ����Ʈ
		List calSumList = objJunggiService.Cal_sumList(gu_code, corp_cd, tax_set,admin_no,  rowCol, rowCol+3);
		
		
		request.setAttribute("calSumList", calSumList);
		//System.out.println("calSumList == " + calSumList.size() );
		
		System.out.println("======��������� �׽�Ʈ===========");
		System.out.println("rowCol : "+rowCol);
		System.out.println("calSumList.size() : "+calSumList.size());
		System.out.println("");
		
		if(calSumList.size()>0)
		{
			if(cal_sum_seq.equals("") )
			{
				cal_sum_seq = String.valueOf( ((Equip_ProductBean)calSumList.get(0)).getSEQ());
				year = String.valueOf( ((Equip_ProductBean)calSumList.get(0)).getYEAR() );
			}
			
			//System.out.println("cal_sum_seq=== " + cal_sum_seq);
			
			List CalculationList = objJunggiService.CalculationList(Integer.parseInt(cal_sum_seq) , year, gu_code,admin_no);
			List CalculationLists = objJunggiService.CalculationLists(gu_code, corp_cd, year,tax_set,admin_no);
	
			//List CalculationList = objJunggiService.CalculationList_purpose(Integer.parseInt(cal_sum_seq));
			
			request.setAttribute("CalculationList", CalculationList);
			request.setAttribute("listSize", String.valueOf(CalculationList.size()));
			request.setAttribute("listsSize", String.valueOf(CalculationLists.size()));
			
			System.out.println("======��������� �׽�Ʈ===========");
			System.out.println("size="+CalculationList.size());
			System.out.println("CalculationList.size() : " + CalculationList.size());
			System.out.println("CalculationLists.size() : "+ CalculationLists.size());
			System.out.println("cal_sum_seq : "+cal_sum_seq);
			System.out.println("year : "+year);
			System.out.println();
			
			
			if(CalculationList.size()>0)
			{
				if("0".equals(seq) || seq == null || "".equals(seq)){
					seq = String.valueOf( ((Equip_ProductBean)CalculationList.get(0)).getSEQ()); 
				}
			
				// �̻���Ȱ� �ִ��� üũ
			
				
				int taxationCheck = 0;	
				
				System.out.println("======��������� �׽�Ʈ===========");
				System.out.println("�̻���� �� �ִ��� üũ");
				System.out.println("taxationCheck : "+taxationCheck);
				System.out.println();
				
				//���ó� ���Ⱑ 1���� �ۿ� ������.
				if(CalculationList.size() == CalculationLists.size()){
				for(int i = 0; i<CalculationList.size();i++)
				{
					Equip_ProductBean bean = (Equip_ProductBean)CalculationList.get(i);
					//bean.setREQUEST_NO(  bean.getREQUEST_NO().replaceAll("0",""));
					
					System.out.println("======��������� �׽�Ʈ===========");
					System.out.println("tax�� �˻�");
					System.out.println("i�� : "+i);
					
					System.out.println(i + " bean.getCAL_STATUS() == " + bean.getCAL_STATUS() );
					if( CalculationList.size() > 1 ){
						if(	bean.getCAL_STATUS() == null || "".equals(bean.getCAL_STATUS()) ){
							taxationCheck += 1;
						}
					}
					System.out.println("for�� �ȿ� �ִ� taxationCheck :"+taxationCheck);
					
				}
				}else{
					// �������� ���ú��� ������.
					System.out.println("----------�������� ���ú� �׽�Ʈ-----------");
					System.out.println("�������� ���ú��� ������ ");
					System.out.println("before taxationCheck : "+taxationCheck);
					for(int i = 0; i<CalculationLists.size();i++)
					{
						Equip_ProductBean bean = (Equip_ProductBean)CalculationLists.get(i);
						//bean.setREQUEST_NO(  bean.getREQUEST_NO().replaceAll("0",""));
						
						System.out.println("======��������� �׽�Ʈ===========");
						System.out.println("tax�� �˻�");
						System.out.println("i�� : "+i);
						
						System.out.println(i + " bean.getCAL_STATUS() == " + bean.getCAL_STATUS() );
						if( CalculationLists.size() > 1 ){
							if(	bean.getCAL_STATUS() == null || "".equals(bean.getCAL_STATUS())){
								taxationCheck += 1;
							}
						}
						System.out.println("for�� �ȿ� �ִ� taxationCheck :"+taxationCheck);
						
					}
					System.out.println("after taxationCheck : "+taxationCheck);
				}
				System.out.println("for�� �ۿ� �ִ� taxationCheck == " + taxationCheck);
				System.out.println("CalculationList.size() : "+ CalculationList.size());
				System.out.println();
				
				if( taxationCheck+1 == CalculationList.size()){ // �̻���� ���� +1 ��  ��ü ������ ������ ��� insert
					taxation_check = "1";
				}
				
				if( taxationCheck == 1){ // �̻���� ���� +1 ��  ��ü ������ ������ ��� insert
					taxation_check = "1";
				}else if(taxationCheck == CalculationLists.size()){
					taxation_check = "0";
				}else{
					taxation_check = "2";
				}
				
				System.out.println("���� taxation_check : "+taxation_check);
			}
//			System.out.println("info ���� ������ seq === " + seq);
			pb = objJunggiService.CalculationInfo(gu_code,Integer.parseInt(seq)); 
			
			request.setAttribute("year", year);
			request.setAttribute("SEQ", seq);
			request.setAttribute("yearAdd", String.valueOf(Integer.parseInt(thisYear)+1));
			request.setAttribute("taxation_check" , taxation_check);
		
		}
		
		if(pb.getSUM_LASTYEAR() == 0)
		{	
			//�۳⵵ ����� ���
			//System.out.println("########################## seq ==> " + seq);
			Map lastYearData = null;
			//lastYearData = objJunggiService.getLastSum(Integer.parseInt(seq));  // �ü��� ������� �۳⵵ ����� �ʿ���� 
			
			if( lastYearData != null ){
				int sum_lastYear = Integer.parseInt(lastYearData.get("SUM_LASTYEAR").toString());			
				int last_period = Integer.parseInt(lastYearData.get("PERIOD").toString());
				int quantity = Integer.parseInt(lastYearData.get("QUANTITY").toString());
				int last_quantity = Math.round(pb.getQUANTITY());
				if(last_period != 12)
					sum_lastYear = Math.round(sum_lastYear * 12/last_period  * quantity / last_quantity);
				pb.setSUM_LASTYEAR(sum_lastYear);
			}
		}
		
		
		if( "add".equals(mode) ) {
			
			
			String yearVal1  = String.valueOf(Integer.parseInt(pb.getYEAR())+1);				
			//System.out.println("yearVal1 == "+ yearVal1);
			request.setAttribute("yearVal1", yearVal1);
			request.setAttribute("yearAdd", String.valueOf(Integer.parseInt(thisYear)+1));
			
			// ����� ������ ���� ���⵵ ����, ����  �հ� ���ϱ�
//			float areaSum = objJunggiService.getAreaSum(gu_code, corp_cd, year, tax_set);
//			System.out.println("areaSum == " + areaSum);
//			pb.setAREA_AFTER(areaSum);
			
			if(objJunggiService.GetCountSameCal(String.valueOf(pb.getFIRST_SEQ()),pb.getYEAR()) >1)
			{
				pb.setUSE_SECTION("2");
				//pb.setUSE_SECTIONNAME("����");				
			}
			
			if(pb.getUSE_SECTION().trim().equals("2")) //����
			{	
				System.out.println("����111111");
				double sum_lastYear = pb.getAREA_AFTER()*pb.getPRICE()*pb.getRATE();
				
				sum_lastYear = Math.floor( sum_lastYear);					
				pb.setSUM_LASTYEAR((int)sum_lastYear);
				request.setAttribute("old_form", pb.getAREA_AFTER()+"�� * " +pb.getRATE()+" * "+pb.getPRICE()+" * 12/12");
				
			}else
			{
				System.out.println("����111111");
				pb.setSUM_LASTYEAR(pb.getSUM_ADJUST());
				
				request.setAttribute("old_form",pb.getYEAR()+"�⵵ �����");
			}
			
			
			pb.setSUM_YEAR(0);
			pb.setSUM_ADJUST(0);				
			pb.setFORM("");
			pb.setFORM_ADJUST("");				
			pb.setFROMDATE(yearVal1+"0101");
			pb.setTODATE(yearVal1+"1231");
			pb.setTAX_DATE(yearVal1+"-03-10");		// �ΰ�����
			pb.setINDATE(yearVal1+"-03-31");		// ���⳻����
			pb.setOVERDATE(yearVal1+"-04-30");		// ����������
			
			request.setAttribute("old_use_section",pb.getUSE_SECTION());				
			request.setAttribute("old_price",String.valueOf(pb.getPRICE()));
			request.setAttribute("old_rate",String.valueOf(pb.getRATE()));
			
			request.setAttribute("old_area_after",String.valueOf(pb.getAREA_AFTER()));
			
			pb.setPRICE(0);
			
			//pb.setRATE( Float.valueOf(objJumyongService.getYoyul(gapan_no)).floatValue()  );
			pb.setRATE(pb.getRATE());
			
			
			pb.setPERIOD("12");
			pb.setYEAR( yearVal1 );
			
		}else
		{
			
			String yearVal1  = pb.getYEAR();
			System.out.println("yearVal1 == "+ yearVal1);
			request.setAttribute("yearVal1", yearVal1);
			
			request.setAttribute("old_use_section",pb.getUSE_SECTION());
			request.setAttribute("old_price",String.valueOf(pb.getPRICE()));
			request.setAttribute("old_rate",String.valueOf(pb.getRATE()));
			request.setAttribute("old_area_after",String.valueOf(pb.getAREA_AFTER()));
			
			// ������ ������ �ݾ� ����ϱ� ����  
			long sum_adjust = (long) objJunggiService.Equip_Calculation_Sum_Adjust(gu_code,corp_cd,tax_set,year);
			request.setAttribute("sum_adjust", String.valueOf(sum_adjust));
			
		}
		
		
		//��¥�� �뽬(-) �߰�						
		if(pb.getFROMDATE() != null) pb.setFROMDATE(addDash(pb.getFROMDATE()));			
		if(pb.getTODATE() != null) pb.setTODATE(addDash(pb.getTODATE()));			
		
		
		
		String strFormView = "/facility/junggi/tab/info_product";
		setFormView(strFormView);
		setSuccessView("redirect:/facility/junggi/product_view.do?GU_CODE="+gu_code+"&CORP_CD="+corp_cd+"&ADMIN_NO="+admin_no+"&year="+year+"&tax_set="+tax_set);
		
		return pb;
	}	
		
	protected ModelAndView onSubmit(HttpServletRequest request
			, HttpServletResponse response, Object command
			, BindException errors) throws Exception	 {
		
		
		System.out.println("onSubmit ******************* ");
		Equip_ProductBean objProductBean = (Equip_ProductBean)command;
		Equip_ProductBean objProductBean2 = new Equip_ProductBean();
		
		// ���⵵ ���
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");			  
		String thisDate = formatter.format(cal.getTime());
		
		String prev_cal_sum_seq = ServletRequestUtils.getStringParameter(request, "cal_sum_seq","");
		String gu_code = ServletRequestUtils.getStringParameter(request,"GU_CODE");		
		String corp_cd = ServletRequestUtils.getStringParameter(request,"CORP_CD");
		String admin_no = ServletRequestUtils.getStringParameter(request,"ADMIN_NO");
		String object_no = ServletRequestUtils.getStringParameter(request, "OBJECT_NO");
		String seq = ServletRequestUtils.getStringParameter(request, "SEQ","0");
		String year = ServletRequestUtils.getStringParameter(request, "year", "");
		//String tax_set = ServletRequestUtils.getStringParameter(request, "tax_set", "");
		String mode = ServletRequestUtils.getStringParameter(request, "mode", "");
		int listSize = ServletRequestUtils.getIntParameter(request, "listSize", 0);
		int listsSize = ServletRequestUtils.getIntParameter(request, "listsSize", 0);
		String sigu_cd_param = ServletRequestUtils.getStringParameter(request, "sigu_cd_param", "");
		String taxation_check = ServletRequestUtils.getStringParameter(request,"taxation_check","");
		
		String tax_set = objProductBean.getTAX_SET();
		
		if(tax_set != null && !tax_set.equals("")){
			tax_set = tax_set.trim();
			objProductBean.setTAX_SET(objProductBean.getTAX_SET().trim());
		}
		
		
		
		System.out.println("======������� �׽�Ʈ===========");
		System.out.println("mode==== " + mode);
		System.out.println("tax_set=== " + tax_set);
		System.out.println("taxation_check== " +taxation_check);
		System.out.println("listSize : "+listSize);
		System.out.println("listsSize : "+listsSize);
		System.out.println("======������� �׽�Ʈ===========");
		System.out.println("�� ó�� prev_cal_sum_seq : " + prev_cal_sum_seq);
		
		try
		{
			objProductBean.setFROMDATE(removeDash(objProductBean.getFROMDATE()));
			objProductBean.setTODATE(removeDash(objProductBean.getTODATE()));
			
			objProductBean.setYEAR(objProductBean.getFROMDATE().substring(0,4) );
			objProductBean.setSEQ(0);
			objProductBean.setFORM(objProductBean.getFORM_ADJUST());
			objProductBean.setUP_DATE(thisDate);
			objProductBean.setUSE_SECTION("1");
			//use_section = 1 ���� ����� 
			objProductBean.setFIRST_SEQ(0);
			
			int cal_sum_seq = 0;
		
			//cal_sum_info seq ��ȸ ������ 0
			if(listSize == listsSize){

				cal_sum_seq = objJumyongService.getEquip_Cal_Sum_Seq(gu_code,corp_cd,tax_set,objProductBean.getYEAR(),admin_no);
			}else{
				cal_sum_seq = objJumyongService.getEquip_Cal_Sum_Seq_Han(gu_code, corp_cd, tax_set, objProductBean.getYEAR());
			}
			System.out.println("cal_sum_seq=== " + cal_sum_seq);
			System.out.println("prev_cal_sum_seq ==="+ prev_cal_sum_seq);
			
			if("add".equals(mode))
			{
				System.out.println("======������� �׽�Ʈ===========");
				System.out.println("add����϶�");
				System.out.println("======������� �׽�Ʈ===========");
				
				
				// �̹� �ش翬�� ����� ���� �� ������ return
				//�̹� �ش翬�� ����� ���� �������� �Ǵ��� ���̳İ� �����̴�.
				//CalculationList �޼ҵ带 �̿��ϴ°��� �����ҵ� ���⵵�� ����л����� �⵵�� �ٸ��� ���ؼ� ����Ǿ����� �ľ�
				
				int testExist = objJunggiService.getcal_sum_exist(gu_code,corp_cd,objProductBean.getYEAR(),tax_set);
				
				System.out.println("�̹� �ش翬�� ����� ���� �� ������  "+ testExist );
				System.out.println(gu_code);
				System.out.println(corp_cd);
				System.out.println(objProductBean.getYEAR());
				System.out.println(tax_set);
				
				
				if(testExist > 0){
					System.out.println("======������� �׽�Ʈ===========");
					System.out.println("getYear() : "+objProductBean.getYEAR());
					System.out.println("getFromDate() : "+objProductBean.getFROMDATE().substring(0,4));
					System.out.println("equip_cal_sum_info�� �����⵵ ����� ���� �� ���� ���");
					System.out.println("======������� �׽�Ʈ===========");
					String strFormView = "redirect:/facility/junggi/product_view.do?GU_CODE="+gu_code+"&CORP_CD="+corp_cd+"&year="+objProductBean.getYEAR()+"&tax_set="+tax_set+"&message=�̹� �ش�⵵ ������� �ֽ��ϴ�";
					
					setFormView(strFormView);
					setSuccessView(strFormView);
				} 
				
				else {
					System.out.println("======������� �׽�Ʈ===========");
					System.out.println("equip_cal_sum_info�� �����⵵ ����� ���� �������");
					System.out.println("======������� �׽�Ʈ===========");
					// cal_sum_info �� ���� calculation_info �� �ϳ��� ���

						if( listsSize < 2 ){
						System.out.println("listSize 1���ΰ�� === " + listSize);
						System.out.println("======������� �׽�Ʈ===========");
						System.out.println("listsSize���� 2���� ������ ��µ�");
						System.out.println("======������� �׽�Ʈ===========");
						
						//cal_sum_info ���� �Է����� Ȯ�� seq�� 0�̸� ���� �Է�,cal_sum_info�� ���� �Է��� cal_sum_info�� seq�� calculation�� cal_sum_seq�� ����
						if(cal_sum_seq == 0){
							cal_sum_seq = objJumyongService.getEquip_Cal_Sum_Seq();		// cal_sum_seq�� sequence���� �̾ƿ�
						}
							
							// ���������, 100���� ����, ���� ��� 
							long sum_adjust = (long)(objProductBean.getSUM_ADJUST());
							//float sum = sum_adjust*(100 - objProductBean.getREDUCTION_RATE())/100;
							long sum = (long)(sum_adjust/100)*100;
							long vat = sum/10 ;							
							
							// 1. EQUIP_CALCULATION_INFO insert
							objProductBean.setSUM_YEAR_FLOAT(sum);
							objProductBean.setCAL_SUM_SEQ(cal_sum_seq);
							if(objProductBean.getTAX_SET() != null){
								objProductBean.setTAX_SET(objProductBean.getTAX_SET().trim()); 
							}
							
							
							
							objJumyongService.Equip_CalculationInsert(objProductBean); 
							
							
							// 2. EQUIP_CAL_SUM_INFO  insert							
							sum = sum_adjust*(100 - objProductBean.getREDUCTION_RATE())/100;
							sum = (long)(sum/100)*100;	// 100�� ����
							vat = sum/10;
							objProductBean.setSEQ(cal_sum_seq);							// cal_sum_info��seq�� set ��
							objProductBean.setCAL_SUM_SEQ(cal_sum_seq);					// calculation�� cal_sum_seq�� set��
							objProductBean.setSUM(Integer.parseInt(String.valueOf(sum)));
							objProductBean.setVAT(Integer.parseInt(String.valueOf(vat)));
							objJumyongService.Equip_Cal_SumInsertQuery(objProductBean); 
							
							
							// 3.EQUIP_TAXATION_INFO insert
							if( objProductBean.getSIGU_CD() == null || "".equals(objProductBean.getSIGU_CD()) ){
								objProductBean.setSIGU_CD(sigu_cd_param);
							}
							System.out.println("������ prev_cal_sum_seq : " + prev_cal_sum_seq);
							objProductBean2 = (Equip_ProductBean)objJunggiService.Equip_Prev_Taxation_infoSelect(prev_cal_sum_seq);
							
							//	
							  	
							 // objProductBean.setTAX_NO(objProductBean2.getTAX_NO()); //��������� �ѱ涧 ������ȣ�� �� �Ѱܵ� �ȴ�.
				        	  objProductBean.setDEPT_CD(objProductBean2.getDEPT_CD());
				        	  //objProductBean.setTAX_GUBUN(rs.getString("TAX_GUBUN"));
				        	  objProductBean.setOBJ_SET(objProductBean2.getOBJ_SET());
				        	  objProductBean.setTAXPAYER_SET(objProductBean2.getTAXPAYER_SET());
				        	  objProductBean.setLIVE(objProductBean2.getLIVE());
				        	  if(objProductBean2.getADD_SET() != null){
				        		  objProductBean2.setADD_SET(objProductBean2.getADD_SET().trim());
				        	  }
				        	  objProductBean.setADD_SET(objProductBean2.getADD_SET());
				        	  objProductBean.setADD_YN(objProductBean2.getADD_YN());
				        	  objProductBean.setBUNNAP_NO(objProductBean2.getBUNNAP_NO());
				        	  //objProductBean.setSUSI_NO(rs.getString("SUSI_NO"));
				        	  objProductBean.setTAX_CD(objProductBean2.getTAX_CD());
				        	  objProductBean.setOCR_SIGU_CD(objProductBean2.getOCR_SIGU_CD());
				        	  objProductBean.setOCR_BUSEO_CD(objProductBean2.getOCR_BUSEO_CD());
				        	  objProductBean.setSUBUSEO_CD(objProductBean2.getSUBUSEO_CD());
							
				        	  //
							objProductBean.setTAX_DATE(util.Date_Cut(objProductBean.getTAX_DATE()));
							objProductBean.setINDATE(util.Date_Cut(objProductBean.getINDATE()));							
							objProductBean.setOVERDATE(util.Date_Cut(objProductBean.getOVERDATE()));
							objProductBean.setFORM1(objProductBean.getFORM_ADJUST());
							objProductBean.setFORM2(objProductBean.getFORM());
							objProductBean.setTAX_NO("");
							objProductBean.setTAX_YM(objProductBean.getTAX_DATE().substring(0,6));
							objProductBean.setSEQ(cal_sum_seq);
							objProductBean.setTAX_GUBUN("2");
							
							if( "10".equals(tax_set) ){
								objProductBean.setBONSE(String.valueOf(sum));
								objProductBean.setSISE(String.valueOf(sum));
								objProductBean.setGUSE(String.valueOf(0));
							}else if( "50".equals(tax_set) ){
								objProductBean.setBONSE(String.valueOf(sum));
								objProductBean.setGUSE(String.valueOf(sum));
								objProductBean.setSISE(String.valueOf(0));						
							}
							objProductBean.setINTAX(String.valueOf(sum));
							objProductBean.setVAT(Integer.parseInt(String.valueOf(vat)));
							objProductBean.setTAX_YN("0");
							objJunggiService.Equip_Taxation_InfoInsert(objProductBean); 
						
					}
					else{
						
						
						if(cal_sum_seq == 0){
							cal_sum_seq = objJumyongService.getEquip_Cal_Sum_Seq();
						}
												
						// EQUIP_CALCULATION_INFO insert	�� ����
						// ���������, 100���� ����, ���� ��� 
						long sum_adjust = (long)(objProductBean.getSUM_ADJUST());
						//long sum = sum_adjust*(100 - objProductBean.getREDUCTION_RATE())/100;
						long sum = (long)(sum_adjust/100)*100;
						long vat = sum/10 ;
						System.out.println("CALCULATION sum_adjust== " + sum_adjust);
						System.out.println("CALCULATION sum == " + sum);
						System.out.println("CALCULATION vat == " + vat);
						System.out.println("taxation_check == " + taxation_check);
						
						if( "0".equals(taxation_check) ){
							// 1. EQUIP_CAL_SUM_INFO  insert							
							objProductBean.setSEQ(cal_sum_seq);
							objProductBean.setCAL_SUM_SEQ(cal_sum_seq);
							objProductBean.setSUM_ADJUST(0);	// ������ �� ����Ȱ� �ƴϱ⶧���� 0���� ����
							objJumyongService.Equip_Cal_SumInsertQuery(objProductBean); 
						}
						
						// 2. EQUIP_CALCULATION_INFO insert					
						objProductBean.setSUM_YEAR_FLOAT(sum);
						objProductBean.setVAT(Integer.parseInt(String.valueOf(vat)));
						objProductBean.setCAL_SUM_SEQ(cal_sum_seq);
						objProductBean.setSUM_ADJUST(Integer.parseInt(String.valueOf(sum_adjust)));
						objJumyongService.Equip_CalculationInsert(objProductBean);
						
							
						
						// ���� ���빰�� ��� �� ����� ��� 
						if( "1".equals(taxation_check) ){
							System.out.println("���� ���빰�� ��� �� ����� ���  *** ");
							
							// ���������, 100���� ����, ���� ���
							//sum_adjust = (long) objJunggiService.Equip_Calculation_Sum_Adjust(gu_code,corp_cd,request_no,tax_set,objProductBean.getYEAR());							
							sum_adjust = (long) objJunggiService.Equip_Calculation_Sum_Adjust(gu_code,corp_cd,tax_set,objProductBean.getYEAR());
							sum = sum_adjust*(100 - objProductBean.getREDUCTION_RATE())/100;
							sum = (long)(sum/100)*100;	// 100�� ����
							vat = sum/10;
							
							System.out.println("======������� �׽�Ʈ===========");
							System.out.println("CAL_SUM sum_adjust=== " + sum_adjust);
							System.out.println("CAL_SUM sum === " + sum);
							System.out.println("CAL_SUM vat === " + vat);
							System.out.println("======������� �׽�Ʈ===========");
							
							// 1. EQUIP_CAL_SUM_INFO update (��ü ���빰 ������ update)
							//objProductBean.setSEQ(cal_sum_seq);
							objProductBean.setSUM_ADJUST(Integer.parseInt(String.valueOf(sum_adjust)));
							objProductBean.setSUM(Integer.parseInt(String.valueOf(sum)));
							objProductBean.setVAT(Integer.parseInt(String.valueOf(vat)));
							objProductBean.setYEAR(Integer.toString(Integer.parseInt(year)+1));
							objProductBean.setCORP_CD(corp_cd);
							objProductBean.setGU_CODE(gu_code);
							objProductBean.setSEQ(cal_sum_seq);
							objJunggiService.Equip_Cal_Sum_AddUpdate(objProductBean); 
							
							// 2.EQUIP_TAXATION_INFO insert
							if( objProductBean.getSIGU_CD() == null || "".equals(objProductBean.getSIGU_CD()) ){
								objProductBean.setSIGU_CD(sigu_cd_param);
							}
							
							
							System.out.println("������ prev_cal_sum_seq : " + prev_cal_sum_seq);
							//�̰��� equip_taxation_info ���� ���ú� seq�� �Ű��� ���� �ҷ��ͼ� ������. 
							objProductBean2 = (Equip_ProductBean)objJunggiService.Equip_Prev_Taxation_infoSelect(prev_cal_sum_seq);
							
						//	
							 //objProductBean.setTAX_NO(objProductBean2.getTAX_NO()); //��������� �ѱ涧 ������ȣ�� �� �Ѱܵ� �ȴ�.
				        	  objProductBean.setDEPT_CD(objProductBean2.getDEPT_CD());
				        	  //objProductBean.setTAX_GUBUN(rs.getString("TAX_GUBUN"));
				        	  objProductBean.setOBJ_SET(objProductBean2.getOBJ_SET());
				        	  objProductBean.setTAXPAYER_SET(objProductBean2.getTAXPAYER_SET());
				        	  objProductBean.setLIVE(objProductBean2.getLIVE());
				        	  objProductBean.setADD_SET(objProductBean2.getADD_SET());
				        	  objProductBean.setADD_YN(objProductBean2.getADD_YN());
				        	  objProductBean.setBUNNAP_NO(objProductBean2.getBUNNAP_NO());
				        	  //objProductBean.setSUSI_NO(rs.getString("SUSI_NO"));
				        	  objProductBean.setTAX_CD(objProductBean2.getTAX_CD());
				        	  objProductBean.setOCR_SIGU_CD(objProductBean2.getOCR_SIGU_CD());
				        	  objProductBean.setOCR_BUSEO_CD(objProductBean2.getOCR_BUSEO_CD());
				        	  objProductBean.setSUBUSEO_CD(objProductBean2.getSUBUSEO_CD());
							
				        	  //
							
							
							objProductBean.setTAX_DATE(util.Date_Cut(objProductBean.getTAX_DATE()));
							objProductBean.setINDATE(util.Date_Cut(objProductBean.getINDATE()));							
							objProductBean.setOVERDATE(util.Date_Cut(objProductBean.getOVERDATE()));
							objProductBean.setFORM1(objProductBean.getFORM_ADJUST());
							objProductBean.setFORM2(objProductBean.getFORM());
							objProductBean.setTAX_NO("");
							objProductBean.setTAX_YM(objProductBean.getTAX_DATE().substring(0,6));
							objProductBean.setSEQ(cal_sum_seq);
							objProductBean.setTAX_GUBUN("2");
							
							if( "10".equals(objProductBean.getTAX_SET()) ){
								objProductBean.setBONSE(String.valueOf(sum));
								objProductBean.setSISE(String.valueOf(sum));
								objProductBean.setGUSE(String.valueOf(0));
							}else if( "50".equals(objProductBean.getTAX_SET()) ){
								objProductBean.setBONSE(String.valueOf(sum));
								objProductBean.setGUSE(String.valueOf(sum));
								objProductBean.setSISE(String.valueOf(0));						
							}
							objProductBean.setINTAX(String.valueOf(sum));
							objProductBean.setVAT(Integer.parseInt(String.valueOf(vat)));
							objProductBean.setTAX_YN("0");
							long overtax = (long)((sum * 3.0 / 100) + sum )/100 * 100 ;	// �����ıݾ��� ��ü ������ �ٽ� ���
							objProductBean.setOVERTAX(String.valueOf(overtax));
							objJunggiService.Equip_Taxation_InfoInsert(objProductBean); 
							
						}

		
					} // �������� ��� end
					
					
					String strFormView = "redirect:/facility/junggi/product_view.do?GU_CODE="+gu_code+"&CORP_CD="+corp_cd+"&ADMIN_NO="+admin_no+"&year="+objProductBean.getYEAR()+"&tax_set="+tax_set+"&message=����Ǿ����ϴ�.";
					setFormView(strFormView);
					setSuccessView(strFormView);
				
				} // �ش翬�� ����� check end
				
			} // add end
			
			else{	
				
				// edit����
				
				
				// 1. EQUIP_CALCULATION
				long sum_adjust = (long)(objProductBean.getSUM_ADJUST());
				//float sum = sum_adjust*(100 - objProductBean.getREDUCTION_RATE())/100;
				long sum = (long)(sum_adjust/100)*100;
				long vat = sum/10 ;
				objProductBean.setSUM(Integer.parseInt(String.valueOf(sum)));
				objProductBean.setVAT(Integer.parseInt(String.valueOf(vat)));
				objProductBean.setSUM_YEAR_FLOAT(sum);
				objProductBean.setCAL_SUM_SEQ(cal_sum_seq);
				objProductBean.setGU_CODE(gu_code);
	      		objProductBean.setCORP_CD(corp_cd);
	      		objProductBean.setADMIN_NO(admin_no);
	      		objProductBean.setOBJECT_NO(object_no);
	      		objProductBean.setYEAR(year);
				
				
				 objJumyongService.Equip_CalculationUpdateHan(objProductBean);
				System.out.println("*** EQUIP_CALCULATION EDIT HAN***");
				System.out.println("year : "+year);
				System.out.println("gu_code : "+gu_code);
				System.out.println("object_no : "+object_no);
				System.out.println("corp_cd : "+corp_cd);
				System.out.println("admin_no : "+admin_no);
				
				
								
				// cal_sum_info�� �� sum_adjust  �հ� ���� EQUIP_Calculation_Sum_adust���� request_no���� �߰��ؾ� ���� ������?
				sum_adjust = (long) objJunggiService.Equip_Calculation_Sum_Adjust(gu_code,corp_cd,tax_set,objProductBean.getYEAR());							
				sum = sum_adjust*(100 - objProductBean.getREDUCTION_RATE())/100;
				sum = (long)(sum/100)*100;	// 100�� ����
				vat = sum/10;
				System.out.println("CAL_SUM sum_adjust=== " + sum_adjust);
				System.out.println("CAL_SUM sum === " + sum);
				System.out.println("CAL_SUM vat === " + vat);
				
				// 2. EQUIP_CAL_SUM_INFO
				objProductBean.setSEQ(cal_sum_seq);							//cal_sum_info seq set
				objProductBean.setSUM_ADJUST(Integer.parseInt(String.valueOf(sum_adjust)));//cal_sum_info sum_adjust set
				objProductBean.setSUM(Integer.parseInt(String.valueOf(sum)));
				objProductBean.setVAT(Integer.parseInt(String.valueOf(vat)));
				objJunggiService.Equip_Cal_Sum_AddUpdate(objProductBean);
				System.out.println("EQUIP_CAL_SUM_INFO  **** ");
				
				
				// 3. EQUIP_TAXATION_INFO 
				if( objProductBean.getSIGU_CD() == null || "".equals(objProductBean.getSIGU_CD()) ){
					objProductBean.setSIGU_CD(sigu_cd_param);
				}
				objProductBean.setTAX_DATE(util.Date_Cut(objProductBean.getTAX_DATE()));
				objProductBean.setINDATE(util.Date_Cut(objProductBean.getINDATE()));							
				objProductBean.setOVERDATE(util.Date_Cut(objProductBean.getOVERDATE()));
				objProductBean.setFORM1(objProductBean.getFORM_ADJUST());
				objProductBean.setFORM2(objProductBean.getFORM());
				objProductBean.setTAX_NO("");
				objProductBean.setTAX_YM(objProductBean.getTAX_DATE().substring(0,6));
				objProductBean.setSEQ(cal_sum_seq);
				
				if( "10".equals(objProductBean.getTAX_SET()) ){
					objProductBean.setBONSE(String.valueOf(sum));
					objProductBean.setSISE(String.valueOf(sum));
					objProductBean.setGUSE(String.valueOf(0));
				}else if( "50".equals(objProductBean.getTAX_SET()) ){
					objProductBean.setBONSE(String.valueOf(sum));
					objProductBean.setGUSE(String.valueOf(sum));
					objProductBean.setSISE(String.valueOf(0));						
				}
				objProductBean.setINTAX(String.valueOf(sum));
				objProductBean.setVAT(Integer.parseInt(String.valueOf(vat)));
				objProductBean.setTAX_YN("0");
				long overtax = (long)((sum * 3.0 / 100) + sum )/100 * 100 ;	// �����ıݾ��� ��ü ������ �ٽ� ���
				objProductBean.setOVERTAX(String.valueOf(overtax));
				objJunggiService.Equip_Taxation_InfoUpdate(objProductBean);			
				System.out.println(" EQUIP_TAXATION_INFO  **** ");
				
				
				
				String strFormView = "redirect:/facility/junggi/product_view.do?GU_CODE="+gu_code+"&CORP_CD="+corp_cd+"&ADMIN_NO="+admin_no+"&year="+objProductBean.getYEAR()+"&tax_set="+tax_set+"&message=�����Ǿ����ϴ�.";
				setFormView(strFormView);
				setSuccessView(strFormView);
				
			} // edit end
		
		
		
		
		
		}catch(Exception err)
		{
			System.out.println(err.toString());
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