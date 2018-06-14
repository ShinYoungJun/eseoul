
package main.java.facility.jumyong.web;


import main.java.common.util.Globals;



import java.text.SimpleDateFormat;
import java.util.*;
import java.net.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.validation.BindException;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import org.springframework.web.bind.RequestUtils;
import org.springframework.web.bind.ServletRequestUtils;

import main.java.common.util.*;
import main.java.common.util.catUtil.Util;
import main.java.facility.jumyong.service.IJumyongService;
import main.java.jumyong.jumyong.model.ConfBean;
import main.java.jumyong.jumyong.model.PlaceLocationBean;
import main.java.facility.jumyong.model.Equip_ProductBean;
import main.java.jumyong.jumyong.model.jumregBean;
import main.java.jumyong.jumyong.service.*;

public class ProductSubtractBoardFormControl extends SimpleFormController {	
	
  	/**
  	 * CALCULATION 리스트 조회
	 * @param HttpServletRequest request
	 * @param HttpServletResponce responce
	 * @return ModelAndView
	 */
	
	
	
	private IJumyongService objJumyongService = null;	
	
	
	public void setJumyongService_facility(IJumyongService newObjJumyongService) {
		this.objJumyongService = newObjJumyongService;
	}
	
	public ProductSubtractBoardFormControl() {
		setBindOnNewForm(true);
	}
	
	
	
	protected Object formBackingObject(HttpServletRequest request)
	throws ServletException {
		
			String gu_code = ServletRequestUtils.getStringParameter(request,"GU_CODE");		
			String corp_cd = ServletRequestUtils.getStringParameter(request,"CORP_CD");
			String admin_no = ServletRequestUtils.getStringParameter(request,"ADMIN_NO");
			String object_no = ServletRequestUtils.getStringParameter(request, "OBJECT_NO","");
			String mode = ServletRequestUtils.getStringParameter(request, "mode","");
			String year = ServletRequestUtils.getStringParameter(request, "YEAR","");			
			String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
			String strCountPerPage = ServletRequestUtils.getStringParameter(request, "countPerPage", "4");
			
			
			request.setAttribute("gu_code", gu_code);
			request.setAttribute("corp_cd", corp_cd);
			request.setAttribute("admin_no", admin_no);
			request.setAttribute("currentPage", strCurrentPage);
			request.setAttribute("mode", mode);
			request.setAttribute("year", year);
			
			Equip_ProductBean epb = new Equip_ProductBean();
			
			String request_no = "";
			
			
		/*	epb = objJumyongService.Equip_GetCalSumSeq(gu_code,corp_cd,admin_no,year);
			
			String cal = Integer.toString(epb.getCAL_SUM_SEQ());
			epb = null;*/
			
			List calSumList = objJumyongService.Equip_Cal_SumList(gu_code,corp_cd,year,admin_no);
			
			List placeList = objJumyongService.placeList(gu_code,corp_cd,request_no,Integer.parseInt(strCurrentPage));
			
			
			
			setSuccessView("redirect:/facility/jumyong/product_view.do?GU_CODE="+gu_code+"&CORP_CD="+corp_cd+"&REQUEST_NO="+request_no+"&YEAR="+year);
			//setSuccessView("redirect:/facility/jumyong/product_view.do?GU_CODE="+gu_code+"&CORP_CD="+corp_cd+"&REQUEST_NO="+request_no);
			request.setAttribute("calSumList", calSumList);
			request.setAttribute("placeList", placeList);
			
			if(object_no.equals("") )
			{		
				object_no = ((Equip_ProductBean)placeList.get(0)).getOBJECT_NO();
			}
			System.out.println("111111");
			request.setAttribute("object_no", object_no);
			
			Map subProduct = objJumyongService.getSubtractedProduct(gu_code,corp_cd,request_no,object_no,year);
			
			
			System.out.println("111111");
			request.setAttribute("prev_seq",subProduct.get("SEQ"));
			request.setAttribute("old_period",subProduct.get("PERIOD"));
			request.setAttribute("old_sum_adjust",subProduct.get("SUM_ADJUST"));
			request.setAttribute("old_quantity",subProduct.get("QUANTITY"));
			request.setAttribute("fromdate",subProduct.get("FROMDATE"));
			request.setAttribute("todate",subProduct.get("TODATE"));
			
			
			
			if(mode.equals("edit"))		//수정
				epb = objJumyongService.Equip_CalculationInfo(gu_code,corp_cd,object_no,year);
			else						//입력
				epb = objJumyongService.placeInfo(gu_code,corp_cd,request_no,object_no);
			
			System.out.println("111111");
			
			
			String strFormView = "/facility/jumyong/tab/info_product_subtract";
			setFormView(strFormView);
			epb.setYEAR(year);
			
			return epb;
	}	
		
	protected ModelAndView onSubmit(HttpServletRequest request
			, HttpServletResponse response, Object command
			, BindException errors) throws Exception	 {
		
		Equip_ProductBean objProductBean = (Equip_ProductBean)command;
		
		
	
		String mode = ServletRequestUtils.getStringParameter(request, "mode","");
		
		
		String gu_code = objProductBean.getGU_CODE();
		String corp_cd = objProductBean.getCORP_CD();
		String request_no = objProductBean.getREQUEST_NO();
		String tax_set = objProductBean.getTAX_SET();
		String year = objProductBean.getYEAR();
		String admin_no = objProductBean.getADMIN_NO();
		
		try
		{
			Calendar cal = Calendar.getInstance();				
			SimpleDateFormat  sdf  =  new SimpleDateFormat("yyyyMMdd");      // 데이터 출력 형식 지정
			String toDay = sdf.format (cal.getTime());      // 오늘 날짜 변수에 저장
			
			objProductBean.setUP_DATE(toDay);
			objProductBean.setFROMDATE(removeDash(objProductBean.getFROMDATE()));
			//objProductBean.setTODATE(removeDash(objProductBean.getTODATE()));
			
			objProductBean.setYEAR(objProductBean.getFROMDATE().substring(0,4) );
			
			objProductBean.setSEQ(0);
			objProductBean.setFORM(objProductBean.getFORM_ADJUST());			
			objProductBean.setUSE_SECTION("2");
			objProductBean.setFIRST_SEQ(0);
		
		//cal_sum_info seq 조회 없으면 0
		int cal_sum_seq = objJumyongService.getEquip_Cal_Sum_Seq(gu_code,corp_cd,tax_set,year,admin_no);
		
		System.out.println("re "+cal_sum_seq);
		if(mode.equals("add"))
		{	
			if(cal_sum_seq == 0)	//cal_sum_info 최초 입력인지 확인 seq가 0이면 최초 입력,cal_sum_info에 먼저 입력후 cal_sum_info의 seq를 calculation의 cal_sum_seq에 넣음
			{
				cal_sum_seq = objJumyongService.getEquip_Cal_Sum_Seq();		// cal_sum_seq를 sequence에서 뽑아옴
				objProductBean.setSEQ(cal_sum_seq);							// cal_sum_info의seq를 set 함
				objProductBean.setCAL_SUM_SEQ(cal_sum_seq);					// calculation의 cal_sum_seq를 set함
				
				objProductBean.setSUM(objProductBean.getSUM_ADJUST());//최종점용료 입력
				
				objJumyongService.Equip_Cal_SumInsertQuery(objProductBean);
				
				objJumyongService.Equip_CalculationInsert(objProductBean);	// calculation의 seq는 sequence에 의해서 들어감 seq 변경 필요 없음
			}else
			{
				objProductBean.setSEQ(cal_sum_seq);							// cal_sum_info의seq를 set 함
				objProductBean.setCAL_SUM_SEQ(cal_sum_seq);					// calculation의 cal_sum_seq를 set함 
				
				objJumyongService.Equip_CalculationInsert(objProductBean);	//calculation 입력
				
				int sum_adjust = objJumyongService.Equip_Calculation_Sum_Adjust(gu_code,corp_cd,request_no,tax_set,admin_no);
				// cal_sum_info에 들어갈 sum_adjust  합계 구함

				objProductBean.setSEQ(cal_sum_seq);							//cal_sum_info seq set
				
				
				objProductBean.setSUM_ADJUST(sum_adjust);					//cal_sum_info sum_adjust set
				objProductBean.setSUM(sum_adjust * (100 - objProductBean.getREDUCTION_RATE())/100);		//최종점용료 입력
				objProductBean.setVAT(sum_adjust/10);						//cal_sum_info vat set
																			//fromdate min todate max 구해서 set
								
				objJumyongService.Equip_Cal_Sum_AddUpdate(objProductBean);
				
			}
		}else
		{
			//objJumyongService.Equip_CalculationUpdate(objProductBean);
			System.out.println("test: change");
			objProductBean.setSEQ(cal_sum_seq);							// cal_sum_info의seq를 set 함
			int sum_adjust = objJumyongService.Equip_Calculation_Sum_Adjust(gu_code,corp_cd,request_no,tax_set,admin_no);
			// cal_sum_info에 들어갈 sum_adjust  합계 구함

			objProductBean.setSEQ(cal_sum_seq);							//cal_sum_info seq set
			objProductBean.setSUM_ADJUST(sum_adjust);					//cal_sum_info sum_adjust set
			objProductBean.setVAT(sum_adjust/10);						//cal_sum_info vat set
							
			objJumyongService.Equip_Cal_Sum_AddUpdate(objProductBean);
		}
		
		
		
		
		
		
		}catch(Exception err)
		{
			System.out.println(err.toString());
		}
//	    GU_CODE,CORP_CD,REQUEST_NO,OBJECT_NO,YEAR,SEQ,RATE,DEPTH_RATE,SUM_ADJUST,FROMDATE,TODATE ,FORM_ADJUST,FORM,UP_DATE \
//		,PERIOD,USE_SECTION,FIRST_SEQ,CAL_SUM_SEQ,QUANTITY) \
		
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