
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

public class rojumCal2_FormControl extends SimpleFormController {	
	
  	/**
  	 * CALCULATION 리스트 조회
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
	
	public rojumCal2_FormControl() {
		setBindOnNewForm(true);
	}
	
	protected Object formBackingObject(HttpServletRequest request) throws ServletException {
		
		
		System.out.println("rojumCal1_FormControl : : formBackingObject");

		// 삭제 세션
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		ProductBean pb = null;


			if(userId != null)
			{
				String gapanNo = ServletRequestUtils.getStringParameter(request,"GAPAN_NO");		
				String mode = ServletRequestUtils.getStringParameter(request,"mode","view");
				String seq = ServletRequestUtils.getStringParameter(request,"seq");
				String SECTION = ServletRequestUtils.getStringParameter(request,"SECTION");				
				
				System.out.println("@@@@@@@@@@@ GAPAN_NO :"+gapanNo);
				System.out.println("@@@@@@@@@@@ seq :"+seq);
				
				
				//	관리자 데이터를 가져온다.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
				//오늘 날짜
				Calendar  cal  =  Calendar.getInstance();
				SimpleDateFormat  sdf  =  new SimpleDateFormat("yyyy");      // 데이터 출력 형식 지정
				String  strYear  =  sdf.format (cal.getTime());
				
											
				String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
				String strCountPerPage = ServletRequestUtils.getStringParameter(request, "countPerPage", "5");
				
				request.setAttribute("GAPAN_NO", gapanNo);
				request.setAttribute("seq", seq);
				request.setAttribute("currentPage", strCurrentPage);
				
				pb = new ProductBean();
				
				List productList = objJumyongService.ProductList(Integer.parseInt(strCurrentPage),5,gapanNo,"2");
				
				int listSize = productList.size();	
				request.setAttribute("listSize", String.valueOf((listSize)));
				
	//			리스트의 페이징 html
				
				int totalProductCount = objJumyongService.getProductListCount(gapanNo,"2");
				request.setAttribute("totalProductCount", String.valueOf((totalProductCount)));
				
				String strPageDivideForm = BoardUtil.getDividePageForm(Integer.parseInt(strCurrentPage),5, "", "GAPAN_NO="+gapanNo, "/rojum/jumyong/rojumCal2.do", totalProductCount);
				request.setAttribute("strPageDivideForm", strPageDivideForm);
				
				//section 검출
								
				Map mapSection = (Map)objJumyongService.getSection(gapanNo);
				String section = mapSection.get("SECTION").toString();	
				request.setAttribute("SECTION", section);
				
				Map mapTaxAt = (Map)objJumyongService.getTaxtationAt(gapanNo);
				String tax_at = mapTaxAt.get("TAXTATION_AT").toString();	
				request.setAttribute("tax_at", tax_at);
				
				String existOwner = objJumyongService.getExistOwner(gapanNo);
				request.setAttribute("existOwner", existOwner);
				
				String strFormView = "/rojum/jumyong/info_product_noPermission";
				setFormView(strFormView);
			
					if(listSize > 0)	//기존에 리스트가 있는지...
					{
						System.out.println("기존에 리스트 존재");
						
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
						System.out.println("기존에 리스트 없다.");
						
						mode = "add";		//없으면 mode를 'add'로  인식
					}
						
					request.setAttribute("mode", mode);
					
					if(mode.equals("add"))		//add 일때 요율 구하기
					{
						
						String sum_lastyear;
						String last_area_after;
						String year;
						String reduction_rate;
						String reduction_reason;
						String tax_set;
						
						
						Map retVal = objJumyongService.getInitCal(gapanNo,"2");
						System.out.println(" 111111111111111 : " + pb.getRATE());
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
						//********** BEGIN_KANG_20120426
						//String yoyul = "400";
						String yoyul = retVal.get("YOYUL").toString();
						//********** END_KANG_20120426
						
						String place_a = retVal.get("PLACE_A").toString();
						pb.setRATE(yoyul);
						pb.setTAX_SET(tax_set);
						
						pb.setYEAR(year);
						//pb.setFROMDATE(year+"0101");
						//pb.setTODATE(year+"1231");
						//pb.setPERIOD("12");
						pb.setSUM_LASTYEAR(sum_lastyear);
						pb.setLAST_AREA_AFTER(last_area_after);
						pb.setAREA_AFTER(place_a);
						pb.setREDUCTION_RATE(reduction_rate);
						pb.setREDUCTION_REASON(reduction_reason);
						
					}else if(mode.equals("edit")){ //edit 일때
						Map retVal = objJumyongService.getInitCal(gapanNo,"2");
						//********** BEGIN_KANG_20120426
						//String yoyul = "400";
						String yoyul = retVal.get("YOYUL").toString();
						//********** END_KANG_20120426
						String place_a = retVal.get("PLACE_A").toString();
						
						if(retVal.get("TAX_SET") != null){
							pb.setTAX_SET(retVal.get("TAX_SET").toString());

						}
						pb.setRATE(yoyul);
						pb.setAREA_AFTER(place_a);	
					}else if(mode.equals("del")){
						// 삭제 건수
						objJumyongService.executeDeleteCalTax(gapanNo,seq);
						
						
						request.setAttribute("ck_del", "1");
					}else{
						
						Map retVal = objJumyongService.getInitCal(gapanNo,"2");
						if(retVal.get("TAX_SET") != null){
							pb.setTAX_SET(retVal.get("TAX_SET").toString());
						}
					}
					System.out.println(" 3222222222222222222333 : " + pb.getRATE());
				if(seq == null) seq = "0";
					request.setAttribute("seq",  seq);
					
				//페이지 성공후 돌아갈 페이지
				System.out.println("############view PLACE_A :::"+pb.getAREA_AFTER());
				setSuccessView("redirect:/rojum/jumyong/rojumCal2.do?GAPAN_NO="+gapanNo);

				//날짜형식에 - 추가
				if(pb.getFROMDATE() != null)
					pb.setFROMDATE(addDash(pb.getFROMDATE()));
				if(pb.getTODATE() != null)
					pb.setTODATE(addDash(pb.getTODATE()));
				pb.setSURCHARGE_RATE("1.2");
				
				
				System.out.println("-------------------------------");
				System.out.println("pb.getTAX_CD() : "+pb.getTAX_CD());
				
				request.setAttribute("taxation_part", commonCode.executeCommonCode("taxation_part", pb.getTAX_GUBUN(), "선택"));//	과세구분
				//********** BEGIN_현진_20120222
				//request.setAttribute("taxcode", commonCode.executeTaxCode("50", null, "선택"));//	세목코드
				if(pb.getTAX_CD() == null || pb.getTAX_CD().equals("")){
					
				}else{
					request.setAttribute("TAX_CD", commonCode.executeSearchTaxCode(pb.getTAX_CD().substring(0,2), pb.getTAX_CD())); //	세목코드
				}
				//request.setAttribute("TAX_SET", "50");	//세입구분
				//request.setAttribute("TAX_CD", commonCode.executeSearchTaxCode("50", pb.getTAX_CD())); //	세목코드
				//********** END_현진_20120222
				request.setAttribute("taxpayer_residence", commonCode.executeCommonCode("taxpayer_residence", pb.getLIVE(), "선택"));//	거주상태
				request.setAttribute("object_type", commonCode.executeCommonCode("object_type", pb.getOBJ_SET(), "선택"));//	물건구분
				request.setAttribute("taxpayer_group", commonCode.executeCommonCode("taxpayer_group", pb.getTAXPAYER_SET(), "선택"));//	납세자 구분
				
				
				request.setAttribute("TAX_GUBUN", commonCode.executeSearchCommonCode("taxation_part", pb.getTAX_GUBUN()));
				
				request.setAttribute("LIVE", commonCode.executeSearchCommonCode("taxpayer_residence", pb.getLIVE()));
				request.setAttribute("OBJ_SET", commonCode.executeSearchCommonCode("object_type", pb.getOBJ_SET()));
				request.setAttribute("TAXPAYER_SET", commonCode.executeSearchCommonCode("taxpayer_group", pb.getTAXPAYER_SET()));
				request.setAttribute("TAX_YN", pb.getTAX_YN());	//	부과여부
				request.setAttribute("ADD_SET_NM", commonCode.executeCommonCodeNm("addition_part", pb.getADD_SET()));
				
				request.setAttribute("ORG_CD", userBean.getORG_CD());
				request.setAttribute("GU_NM", userBean.getGU_NM());
				request.setAttribute("DEPT_CD", userBean.getDEPT_CD());
				request.setAttribute("DEPT_NM", userBean.getDEPT_NM());
				
				SimpleDateFormat  todayFormat  =  new SimpleDateFormat("yyyy-MM-dd");      // 데이터 출력 형식 지정
				String  today  =  todayFormat.format (cal.getTime());
				request.setAttribute("TAX_DATE", today);
				System.out.println(" 33333333333333333333 : " + pb.getRATE());
				
				
			}
		return pb;
	}	
		
	protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command, BindException errors) throws Exception	 {
		
		System.out.println("rojumCal1_FormControl : : onSubmit 문제2..");
		System.out.println("점용료 입력하면서 같이 실행되는 함수(tab2).!!!!!!!!");
		try{							
			ProductBean objProductBean = (ProductBean)command;						
			
			//오늘 날짜 , 7일전 날짜 구하기
			Calendar  cal  =  Calendar.getInstance();
			SimpleDateFormat  sdf  =  new SimpleDateFormat("yyyyMMdd");      // 데이터 출력 형식 지정
			String  toDate  =  sdf.format (cal.getTime());      // 오늘 날짜 변수에 저장
					
			
			objProductBean.setUP_DATE(toDate);
			
			
			String gapanNo = ServletRequestUtils.getStringParameter(request,"GAPAN_NO");
			String mode = ServletRequestUtils.getStringParameter(request,"mode");
			
			
			objProductBean.setGAPAN_NO(gapanNo);
			objProductBean.setFROMDATE(removeDash(objProductBean.getFROMDATE()));	//fromdate
			objProductBean.setTODATE(removeDash(objProductBean.getTODATE()));		//todate
			
			objProductBean.setUSE_SECTION(objProductBean.getTAX_GUBUN());
			objProductBean.setFIRST_SEQ("");
			
			//업데이트 날짜 갱신
			HttpSession session = request.getSession();
			String userId	= (String)session.getAttribute("sessionUserId");
			
			GapanBaseBean bean = new GapanBaseBean();
			bean.setFINISH_ID(userId);
			bean.setGAPAN_NO(gapanNo);

			objJumyongService.GapanBaseUpdate(bean);		
			
			
			if(mode.equals("add")){
				
				if(objProductBean.getPRICE() == null || objProductBean.getPRICE().equals(""))
					objProductBean.setPRICE("0");
				
				int cal_tax_seq = objJumyongService.getCal_Sum_Seq();
				System.out.println("cal_tax_seq:cal_tax_seq:"+cal_tax_seq);
				ProductBean pb2 = objProductBean;
				pb2.setSEQ(String.valueOf(cal_tax_seq));
				objProductBean.setTAX_SEQ(objProductBean.getSEQ());
				objProductBean.setSUM(objProductBean.getSUM_ADJUST());
				objProductBean.setCAL_MODE("2");

				System.out.println("2getSUM_YEAR ="+objProductBean.getSUM_YEAR());
				System.out.println("2getSUM_ADJUST ="+objProductBean.getSUM_ADJUST());
				
				objJumyongService.Cal_Sum_InfoInsert(pb2);		//GAPAN_CAL_SUM_INFO 입력
				
				objProductBean.setCAL_SUM_SEQ(String.valueOf(cal_tax_seq));
				objJumyongService.insertProduct(objProductBean);	// 산출물 입력	 GAPAN_CALCULATION_INFO
				
				
				// 부과정보 추가입력
				objProductBean.setBJ_CD(objProductBean.getGAPAN_NO().substring(3,6)+"00");
				objProductBean.setTAX_YM(objProductBean.getTAX_DATE().substring(0,6));
				objProductBean.setFORM1(objProductBean.getFORM());
				objProductBean.setFORM2(objProductBean.getFORM_ADJUST());
				objProductBean.setBONSE(objProductBean.getSUM_ADJUST());
				objProductBean.setSISE(objProductBean.getSUM_ADJUST());
				objProductBean.setINTAX(objProductBean.getSUM_ADJUST());
				
				objProductBean.setGP_TYP("002");
				
				
				if(objProductBean.getGasanRate().equals("")) objProductBean.setGasanRate("0");
											
				double bonse = Double.parseDouble(objProductBean.getBONSE());
				long overtax = (long)(bonse/100*Double.parseDouble(objProductBean.getGasanRate())+bonse);
				
				
				
				if(objProductBean.getGasanRate().equals("0") || objProductBean.getGasanRate().equals("")){
					objProductBean.setOVERTAX(String.valueOf(overtax));
				
				}else{
					objProductBean.setOVERTAX("0");
				
				}
System.out.println("objProductBean.getGAPAN_NO() : " + objProductBean.getGAPAN_NO());
System.out.println("objProductBean.getSEQ() : " + objProductBean.getSEQ());
				//gapan_taxation_info 정보 생성
				objJumyongService.executeBugwa_Register(objProductBean);

			}else if(mode.equals("edit")){
				
				if(objProductBean.getPRICE() == null || objProductBean.getPRICE().equals(""))
					objProductBean.setPRICE("0");
			
				//********** BEGIN_현진_20120218					
				objProductBean.setSUM(objProductBean.getSUM_ADJUST());
				//********** END_현진_20120218
				objJumyongService.updateProduct(objProductBean);	// 산출물 수정
				
				objProductBean.setSEQ(objProductBean.getCAL_SUM_SEQ());
				
				objJumyongService.CalSumUpdate(objProductBean);		// CAL_SUM_INFO 업데이트
				
				// 부과정보 추가입력
				objProductBean.setBJ_CD(objProductBean.getGAPAN_NO().substring(3,6)+"00");
				objProductBean.setTAX_YM(objProductBean.getTAX_DATE().substring(0,6));
				objProductBean.setFORM1(objProductBean.getFORM());
				objProductBean.setFORM2(objProductBean.getFORM_ADJUST());
				objProductBean.setBONSE(objProductBean.getSUM_ADJUST());
				objProductBean.setSISE(objProductBean.getSUM_ADJUST());
				objProductBean.setINTAX(objProductBean.getSUM_ADJUST());
				
				objProductBean.setGP_TYP("002");
				objProductBean.setCAL_MODE("2");

				System.out.println("2-2getSUM_YEAR ="+objProductBean.getSUM_YEAR());
				System.out.println("2-2getSUM_ADJUST ="+objProductBean.getSUM_ADJUST());
				
				//double bonse = Double.parseDouble(objProductBean.getSUM_ADJUST());
				double bonse = Double.parseDouble(objProductBean.getSUM_YEAR()); // MODIFIED BY SAM LEE 2012.01.20 REFERENCING IS UP SIDE DOWN
				System.out.println("2-2objProductBean.getGasanRate() ="+objProductBean.getGasanRate());
				System.out.println("objProductBean.getREDUCTION_RATE() ="+objProductBean.getREDUCTION_RATE());
				System.out.println("objProductBean.getREDUCTION_REASON() ="+objProductBean.getREDUCTION_REASON());
				
				
				long overtax = 0;
				
				try{
					if(objProductBean.getGasanRate()==null){
						overtax = (long)(bonse/100+bonse);
					}else if(objProductBean.getGasanRate().equals("")){
						overtax = (long)(bonse/100+bonse);
					}else{
						overtax = (long)(bonse/100*Double.parseDouble(objProductBean.getGasanRate())+bonse);
					} 
					if(objProductBean.getGasanRate().equals("0") || objProductBean.getGasanRate().equals("")){
						objProductBean.setOVERTAX("0");
					}else{
						objProductBean.setOVERTAX(String.valueOf(overtax));
					}
				}catch(Exception e){
					e.printStackTrace();
				}
				System.out.println("objProductBean.getGAPAN_NO() : " + objProductBean.getGAPAN_NO());
				System.out.println("objProductBean.getSEQ() : " + objProductBean.getSEQ());				
System.out.println("objProductBean : " + objProductBean.getSUM_ADJUST());				
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