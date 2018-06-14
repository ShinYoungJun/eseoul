package main.java.jumyong.jumyong.web;

import main.java.common.service.BoardFileService;
import main.java.common.commonCode.model.UserBean;
import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.util.BoardUtil;
import main.java.common.util.Globals;
import main.java.common.util.StringUtil;

import main.java.common.util.catUtil.Pageing;
import main.java.common.util.catUtil.Util;

import main.java.common.util.FileUtil;
import java.util.Map;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Calendar;
import java.util.Locale;

import main.java.jumyong.gigan.model.PlaceBean;
import main.java.jumyong.jumyong.service.*;
import main.java.jumyong.jumyong.model.ProductBean;
import main.java.jumyong.jumyong.model.SearchBean;
import main.java.jumyong.saewe.model.BugwaSearchBean;
import main.java.jumyong.saewe.model.SaeweBean;

public class JumyongBoardControl_bak20160711 extends MultiActionController {
	
  	/**
  	 * QABoard 리스트 조회 (login 안한상태에 보이는 리스트)
	 * @param HttpServletRequest request
	 * @param HttpServletResponce responce
	 * @return ModelAndView
	 */
	
	private IJumyongService objJumyongService = null;	
	private	CommonCodeService	commonCode		= null;	
	private	Util				util			= new Util();
	private BoardFileService objBoardFileService = null;
	private	Pageing				pageing			= new Pageing();
	private StringUtil			stringUtil = new StringUtil();
	
	public void setJumyongService(IJumyongService newObjJumyongService) {
		this.objJumyongService = newObjJumyongService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode) 
	{
		this.commonCode 	= commonCode;
	}
	
	public void setBoardFileService(BoardFileService objBoardFileService) 
	{
		this.objBoardFileService  	= objBoardFileService;
	}

	
	////////////////////////////////////////////////////////////////////////////////////////////////////////
	// 점용 조회
	public ModelAndView jumyongList(HttpServletRequest request,HttpServletResponse response) throws Exception {
		// 삭제 세션
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		SearchBean objSearchBean = null;
		List	list	=	null;

		try{
			if(userId != null)
			{
				System.out.println("점용조회 시작~!!!");
				//		세션에서 시도 코드를 가져온다.
				String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				
				
				//	관리자 데이터를 가져온다.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
				objSearchBean = new SearchBean();
			
				String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
				String strCountPerPage = ServletRequestUtils.getStringParameter(request, "countPerPage", "4");
				
				objSearchBean.setINTCURPAGE(Integer.parseInt(strCurrentPage));
		
				//오늘 날짜 , 7일전 날짜 구하기
				Calendar  cal  =  Calendar.getInstance();
				SimpleDateFormat  sdf  =  new SimpleDateFormat("yyyyMMdd");      // 데이터 출력 형식 지정
				String  toDate  =  sdf.format (cal.getTime());      // 오늘 날짜 변수에 저장
				//cal.set (cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DATE)-6);     // 7일전 날짜 Set
				cal.set (cal.get(Calendar.YEAR), 0, 1);     //해당년도 1월1일 set
				String  lastDate  =  sdf.format (cal.getTime());    // 7일전 날짜 변수에 저장
				
				
				String tDate = ServletRequestUtils.getStringParameter(request, "tDate", toDate);
				String fDate = ServletRequestUtils.getStringParameter(request, "fDate", "20030101");
				String type = ServletRequestUtils.getStringParameter(request,"type","0");
				String section = ServletRequestUtils.getStringParameter(request,"section","0");
				String tax_set = ServletRequestUtils.getStringParameter(request,"tax_set","0");
				String purpose = ServletRequestUtils.getStringParameter(request,"purpose","");
				String gu_cd = ServletRequestUtils.getStringParameter(request,"gu_cd",userBean.getSIGU_CD());
				String bj_cd = ServletRequestUtils.getStringParameter(request,"bj_cd","");
				String hj_cd = ServletRequestUtils.getStringParameter(request,"hj_cd","");
				String jumyongName = ServletRequestUtils.getStringParameter(request,"jumyongName","");
				String bonbun = ServletRequestUtils.getStringParameter(request,"bonbun","");
				String bubun = ServletRequestUtils.getStringParameter(request,"bubun","");
				String check_yn = ServletRequestUtils.getStringParameter(request,"check_yn","");
				String numberValue = ServletRequestUtils.getStringParameter(request,"numberValue","");
				String search = ServletRequestUtils.getStringParameter(request,"search","0");
				
				objSearchBean.setGU_CODE(gu_cd);
				objSearchBean.setTODATE(tDate);
				objSearchBean.setFROMDATE(fDate);
				objSearchBean.setTYPE(type);
				objSearchBean.setSECTION(section);
				objSearchBean.setTAX_SET(tax_set);
				objSearchBean.setPURPOSE(purpose);
				objSearchBean.setBJ_CD(bj_cd);
				objSearchBean.setHJ_CD(hj_cd);
				objSearchBean.setJUMYONGNAME(jumyongName);
				objSearchBean.setBONBUN(bonbun);
				objSearchBean.setBUBUN(bubun);		
				objSearchBean.setCHECK_YN(check_yn);		
				
				objSearchBean.setNUMBERVALUE(numberValue);
				
				request.setAttribute("search", search);
				request.setAttribute("currentPage", strCurrentPage);
				request.setAttribute("countPerPage", strCountPerPage);
				
				request.setAttribute("toDate", objSearchBean.getTODATE());
				request.setAttribute("fromDate", objSearchBean.getFROMDATE());
				request.setAttribute("jumyongName", objSearchBean.getJUMYONGNAME());
				request.setAttribute("numberValue", objSearchBean.getNUMBERVALUE());
				request.setAttribute("bonbun", objSearchBean.getBONBUN());
				request.setAttribute("bubun", objSearchBean.getBUBUN());
				request.setAttribute("type", objSearchBean.getTYPE());
				request.setAttribute("purpose_cd", objSearchBean.getPURPOSE());
				
				//일반 코드
				request.setAttribute("use_type", commonCode.executeCommonCode("use_type", objSearchBean.getTYPE(), "선택"));
				request.setAttribute("use_section", commonCode.executeCommonCode("occupancy_type", objSearchBean.getSECTION(), "선택"));
				request.setAttribute("section", section);
				
				request.setAttribute("taxation_section", commonCode.executeCommonCode("taxation_section", objSearchBean.getTAX_SET(), "선택"));
				request.setAttribute("check_yn", commonCode.executeCommonCode("check_yn", objSearchBean.getCHECK_YN(), "선택"));
				
				request.setAttribute("gu_code", commonCode.executeGuCdList(userBean.getSIGU_CD(),gu_cd));	//	시군구
				request.setAttribute("bjdong_code", commonCode.CommonBJDongCodeSearch(SIDO_CD, userBean.getSIGU_CD(), objSearchBean.getBJ_CD()));	//	법정동
				request.setAttribute("hjdong_code", commonCode.CommonHJDongCodeSearch(SIDO_CD, userBean.getSIGU_CD(), objSearchBean.getHJ_CD()));	//	법정동
				System.out.println("type2 ==> " + type);
				//일반 코드 끝		
				int listCount = objJumyongService.getProductListCount(objSearchBean);
				
				String strPageDivideForm = BoardUtil.getDividePageForm(Integer.parseInt(strCurrentPage),10, "&tDate="+tDate+"&fDate="+fDate+"&type="+type
				+"&section="+section+"&tax_set="+tax_set+"&purpose="+purpose+"&bj_cd="+bj_cd +"&hj_cd="+hj_cd +"&bonbun="+bonbun+"&bubun="+bubun+"&jumyongName="
				+jumyongName+"&check_yn="+check_yn+"&gu_cd="+gu_cd+"&numberValue="+numberValue, "", "/jumyong/jumyong/search.do", listCount);
				
				request.setAttribute("strPageDivideForm", strPageDivideForm);
				request.setAttribute("listCount", String.valueOf(listCount));
				request.setAttribute("currentPage", strCurrentPage);
				
				if(objSearchBean.getBJ_CD().equals("00000"))
					objSearchBean.setBJ_CD("%");
				if(objSearchBean.getHJ_CD().equals("00000"))
					objSearchBean.setHJ_CD("%");
				
				list = objJumyongService.retrieveBoardList(objSearchBean);
				
				//점용목적 클래스코드 셀렉트박스가 선택으로 되어 있으면...search_flag값을 1로... 
				if("".equals(purpose)){
					request.setAttribute("search_flag", "1");
				}
				
				request.setAttribute("blist1", list);
			}
		}catch(Exception e){
			System.out.println(e.toString());
		}
		
		return new ModelAndView("/jumyong/jumyong/search");
	}
	
	//	부과 조회 화면(excel)
	public ModelAndView 	Excel_Search(HttpServletRequest request,HttpServletResponse response, String message) throws Exception 
	{
		// 삭제 세션
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		SearchBean objSearchBean = null;
		List	list	=	null;

		try{
			if(userId != null)
			{
				System.out.println("점용조회 시작~!!!");
				//		세션에서 시도 코드를 가져온다.
				String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				
				//	관리자 데이터를 가져온다.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
				objSearchBean = new SearchBean();
			
				String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
				String strCountPerPage = ServletRequestUtils.getStringParameter(request, "countPerPage", "4");
				
				objSearchBean.setINTCURPAGE(Integer.parseInt(strCurrentPage));
		
				//오늘 날짜 , 7일전 날짜 구하기
				Calendar  cal  =  Calendar.getInstance();
				SimpleDateFormat  sdf  =  new SimpleDateFormat("yyyyMMdd");      // 데이터 출력 형식 지정
				String  toDate  =  sdf.format (cal.getTime());      // 오늘 날짜 변수에 저장
				//cal.set (cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DATE)-6);     // 7일전 날짜 Set
				cal.set (cal.get(Calendar.YEAR), 0, 1);     //해당년도 1월1일 set
				String  lastDate  =  sdf.format (cal.getTime());    // 7일전 날짜 변수에 저장
				
				
				String tDate = ServletRequestUtils.getStringParameter(request, "tDate", toDate);
				String fDate = ServletRequestUtils.getStringParameter(request, "fDate", "20030101");
				String type = ServletRequestUtils.getStringParameter(request,"type","0");
				String section = ServletRequestUtils.getStringParameter(request,"section","0");
				String tax_set = ServletRequestUtils.getStringParameter(request,"tax_set","0");
				String purpose = ServletRequestUtils.getStringParameter(request,"purpose","");
				String gu_cd = ServletRequestUtils.getStringParameter(request,"gu_cd",userBean.getSIGU_CD());
				String bj_cd = ServletRequestUtils.getStringParameter(request,"bj_cd","");
				String hj_cd = ServletRequestUtils.getStringParameter(request,"hj_cd","");
				String jumyongName = ServletRequestUtils.getStringParameter(request,"jumyongName","");
				String bonbun = ServletRequestUtils.getStringParameter(request,"bonbun","");
				String bubun = ServletRequestUtils.getStringParameter(request,"bubun","");
				String check_yn = ServletRequestUtils.getStringParameter(request,"check_yn","");
				
				String numberValue = ServletRequestUtils.getStringParameter(request,"numberValue","");
				String search = ServletRequestUtils.getStringParameter(request,"search","0");

				objSearchBean.setTODATE(tDate);
				objSearchBean.setFROMDATE(fDate);
				objSearchBean.setTYPE(type);
				objSearchBean.setSECTION(section);
				objSearchBean.setTAX_SET(tax_set);
				objSearchBean.setPURPOSE(purpose);
				objSearchBean.setBJ_CD(bj_cd);
				objSearchBean.setHJ_CD(hj_cd);
				objSearchBean.setJUMYONGNAME(jumyongName);
				objSearchBean.setBONBUN(bonbun);
				objSearchBean.setBUBUN(bubun);		
				objSearchBean.setCHECK_YN(check_yn);	
				objSearchBean.setGU_CODE(gu_cd);
				objSearchBean.setNUMBERVALUE(numberValue);
				
				//2012.01.19 추가 (line 264) : count 가지고 오는 함수에서 getpurpose 파라미터 값을 재정의해주는 기능이 들어있음.				
				int listCount = objJumyongService.getProductListCount(objSearchBean);
				
				System.out.println("[listCount]엑셀 검색 결과가 몇개인지? ="+listCount);
				
				if(objSearchBean.getBJ_CD().equals("00000"))
					objSearchBean.setBJ_CD("%");
				if(objSearchBean.getHJ_CD().equals("00000"))
					objSearchBean.setHJ_CD("%");
				
				
				list = objJumyongService.retrieveBoardList_Excel(objSearchBean);
				
				System.out.println("[list.size()]엑셀 검색 결과(실체)가 몇 개 인지list .size ="+list.size());
				
				request.setAttribute("blist1", list);
				
			}
		}catch(Exception e){
			System.out.println(e.toString());
		}
		return new ModelAndView("/jumyong/jumyong/excel_search", "blist1", list);
	}	
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////

	
	//product에 ajax로 rate 제공.
	public ModelAndView getRate(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String addsum = ServletRequestUtils.getStringParameter(request,"addsum");
		String idx = ServletRequestUtils.getStringParameter(request,"idx","");
		//System.out.println("addsum == " + addsum);
		//System.out.println("idx ===  " + idx);
		
		response.setCharacterEncoding("UTF-8");
		
		
		
		try
		{	//산출 요율 구하기
			if(!addsum.equals("NaN"))
			{
				int numAddsum = Integer.parseInt(addsum);
				
				if(numAddsum > 500 && numAddsum%2 == 1) 
				{
					numAddsum = numAddsum-1;
					addsum = String.valueOf(numAddsum);
				}
				String result = objJumyongService.getProductRate(addsum);
				
				if("".equals(idx)){
					response.getWriter().write(String.valueOf(result));
				}else if( !"0".equals(idx) ){
					response.getWriter().write(String.valueOf(result+"@@"+idx));
					System.out.println("요율 반환값 반환값 : : : "+String.valueOf(result+"@@"+idx));
				}else{
					response.getWriter().write(String.valueOf(result));
				}
				// @@가 왜 들어가는지 모르겠음 그래서 위에 idx가 ""인 if문을 추가				
			}else
				response.getWriter().write("1");
				
		}catch(Exception err)
		{
			System.out.println(err.toString());
		}        
        return null;
	}
	
//	product에 ajax로 면허세 제공.
	public ModelAndView getLicenseTax(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		String area = ServletRequestUtils.getStringParameter(request,"area");
		//System.out.println("면허세=");
		response.setCharacterEncoding("UTF-8");
		
		try
		{	
			if(!area.equals("NaN"))
			{
				int result = objJumyongService.getLicenseTax( Float.valueOf(area).floatValue());
				
				//System.out.println("면허세="+result);
				response.getWriter().write(String.valueOf(result));
			}
		}catch(Exception err)
		{
			System.out.println(err.toString());
		}
        return null;
	}
	
	
	public ModelAndView deleteLocation(HttpServletRequest request,
			HttpServletResponse response) throws Exception {	
		// delete

		String seq = ServletRequestUtils.getStringParameter(request,"seq");
		String adminNo = ServletRequestUtils.getStringParameter(request,"no");
		String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
		
		try
		{
			//System.out.println("seq="+seq);
			objJumyongService.deleteLocation(Integer.parseInt(seq));
		}catch(Exception err)
		{
			System.out.println("err="+err.toString());
		}
		
		//return new ModelAndView("redirect:/jumyong/placeLocationEdit.do?no="+adminNo+"&currentPage="+strCurrentPage);
		return new ModelAndView("redirect:/jumyong/placeLocationEdit.do?no="+adminNo);
	}
	
	

	public ModelAndView deleteFile(HttpServletRequest request,
			HttpServletResponse response) throws Exception {	
		// delete

		String seq = ServletRequestUtils.getStringParameter(request,"seq");
		String adminNo = ServletRequestUtils.getStringParameter(request,"no");
		String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
		String strFileNm = ServletRequestUtils.getStringParameter(request,"filename");
		
		objBoardFileService.mapDeleteImageFile(Globals.IMAGEFILEUPLOADPATH+strFileNm); 
		
		try
		{
			//System.out.println("seq="+seq);
			objJumyongService.deleteFile(Integer.parseInt(seq));
		}catch(Exception err)
		{
			System.out.println("err="+err.toString());
		}
		
		//return new ModelAndView("redirect:/jumyong/placeFileEdit.do?no="+adminNo+"&currentPage="+strCurrentPage);
		return new ModelAndView("redirect:/jumyong/placeFileEdit.do?no="+adminNo);
		
		
		
		
		
	}
	
	public ModelAndView View(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		// 삭제 세션
		HttpSession session = request.getSession();
		
		String 		userId	= (String)session.getAttribute("sessionUserId");
		String ADMIN_NO = ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");

		try{
			if(userId != null)
			{
				String tDate 	= ServletRequestUtils.getStringParameter(request, "tDate", "");
				String fDate = ServletRequestUtils.getStringParameter(request, "fDate", "");
				String type = ServletRequestUtils.getStringParameter(request,"type","0");
				String use_type = ServletRequestUtils.getStringParameter(request,"useType","0");
				String section = ServletRequestUtils.getStringParameter(request,"section","0");
				String purpose = ServletRequestUtils.getStringParameter(request,"purpose","0");
				String tax_set = ServletRequestUtils.getStringParameter(request,"tax_set","0");
				String bj_cd = ServletRequestUtils.getStringParameter(request,"bj_cd","");
				String hj_cd = ServletRequestUtils.getStringParameter(request,"hj_cd","");
				String bonbun = ServletRequestUtils.getStringParameter(request,"bonbun","");
				String bubun = ServletRequestUtils.getStringParameter(request,"bubun","");
				String jumyongName = ServletRequestUtils.getStringParameter(request,"jumyongName","");
				String check_yn = ServletRequestUtils.getStringParameter(request,"check_yn","");
				String numberValue = ServletRequestUtils.getStringParameter(request,"numberValue","");
				String currentPage = ServletRequestUtils.getStringParameter(request,"currentPage","");
						 
				request.setAttribute("userId", userId);
				request.setAttribute("toDate", tDate);
				request.setAttribute("fromDate", fDate);
				request.setAttribute("use_type", type);
				request.setAttribute("useType", use_type);
				request.setAttribute("use_section", section);		
				request.setAttribute("purpose", purpose);
				request.setAttribute("taxation_section",tax_set);
				request.setAttribute("bjdong_code", bj_cd);
				request.setAttribute("hjdong_code", hj_cd);
				request.setAttribute("bonbun", bonbun);
				request.setAttribute("bubun", bubun);		
				request.setAttribute("jumyongName", jumyongName);
				request.setAttribute("check_yn", check_yn);
				request.setAttribute("numberValue", numberValue);
				request.setAttribute("currentPage", currentPage);
				
				
				//			오늘 날짜 , 7일전 날짜 구하기
				Calendar cal = Calendar.getInstance();
				
				SimpleDateFormat  sdf  =  new SimpleDateFormat("yyyyMMdd");      // 데이터 출력 형식 지정
				String thisYear = (sdf.format (cal.getTime())).substring(0,4);      // 오늘 날짜 변수에 저장
				
				
				
				
				
				String showLicense = "false";
				if(objJumyongService.getLicenseYnCount(ADMIN_NO,thisYear)>0)
					showLicense = "true";
				
		
				String showExamination = "false";
				
				int productCount = objJumyongService.getProductYnCount(ADMIN_NO,thisYear);
				//System.out.println("Ccount="+productCount+"  "+thisYear);
				
				if(productCount>0)
				{
					String section_value = ((Map)objJumyongService.getSection(ADMIN_NO)).get("SECTION").toString();
					int intSection = Integer.parseInt(section_value.trim());
					request.setAttribute("POP_SECTION", section_value);
					if(intSection == 3)
					{
						request.setAttribute("showMudanExamination", "true");
					}else		showExamination = "true";
					
					//System.out.println("intSection="+String.valueOf(intSection));
				}
				
				
				
				//System.out.println("showExamination="+showExamination);
				
				request.setAttribute("showLicense", showLicense);
				request.setAttribute("showExamination", showExamination);
				
				request.setAttribute("purpose_cd", objJumyongService.getPurposeCd(ADMIN_NO));
				request.setAttribute("use_type", objJumyongService.getUseType(ADMIN_NO));
		
				/*
				var toDate = document.getElementById("searchToDate").value;
				var fromDate = document.getElementById("searchFromDate").value;
				var type = document.getElementById("TYPE").value;
				var section = document.getElementById("SECTION").value;		
				var purpose = document.getElementById("PURPOSE_CD").value;	
				var tax_set = document.getElementById("TAX_SET").value;
				var bj_cd = document.getElementById("BJ_CD").value;
				var hj_cd = document.getElementById("HJ_CD").value;
				var bonbun = document.getElementById("BONBUN").value;
				var bubun = document.getElementById("BUBUN").value;
				var jumyongName = document.getElementById("jumyongName").value;
				var check_type = document.getElementById("check_type").value;
				var numberValue = document.getElementById("numberValue").value;
				 */
				
				request.setAttribute("view_admin_no",ADMIN_NO.substring(9));
			}
		}catch(Exception e){
			System.out.println(e.toString());
		}
		
		return new ModelAndView("/jumyong/jumyong/view", "ADMIN_NO",ADMIN_NO);
	}
	
	//상단 탭 부분
	//민원정보
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	// 감소분 정할 산출 리스트
	public ModelAndView 	productSubList(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");	
		
		try{
			if(userId != null)
			{
				
				String 	ADMIN_NO 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
				String area = ServletRequestUtils.getStringParameter(request, "area", ""); 
				String year = ServletRequestUtils.getStringParameter(request, "year", "");
				
				year =  String.valueOf(Integer.parseInt(year)-1);
				
				request.setAttribute("ADMIN_NO",ADMIN_NO);
				request.setAttribute("area",area);
				
				//System.out.println("year    ===="+year);
				
				//List list1 =objJumyongService.productSubList(ADMIN_NO);
				List list1 =objJumyongService.productSubList(ADMIN_NO,year);
				request.setAttribute("productList",list1);
				
			}
		}catch(Exception e){
			System.out.println("error:"+e.toString());
		}
		return new ModelAndView("/jumyong/jumyong/info_productsublist" );
	}


	
//	 정기분 면적 선택 리스트
	public ModelAndView 	productaddList(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");	
		
		try{
			if(userId != null)
			{
				
				String 	ADMIN_NO 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
				String area = ServletRequestUtils.getStringParameter(request, "area", ""); 
				String year = ServletRequestUtils.getStringParameter(request, "year", "");
				
				request.setAttribute("ADMIN_NO",ADMIN_NO);
				request.setAttribute("area",area);
				
				List list1 =objJumyongService.productSubList(ADMIN_NO,year);
				request.setAttribute("productList",list1);
				
			}
		}catch(Exception e){
			System.out.println("error:"+e.toString());
		}
		return new ModelAndView("/jumyong/jumyong/info_productaddlist" );
	}
	
//	년도별 first_seq별 ajax로 seq 제공.
	public ModelAndView getSeqByFirstSeq(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String year = ServletRequestUtils.getStringParameter(request,"year","");
		String first_seq = ServletRequestUtils.getStringParameter(request,"first_seq","");
		
		String seq = String.valueOf(objJumyongService.getCalSeqbyFirstSeq(year,first_seq));
		
		//System.out.println("seq==========="+seq);
		
		response.getWriter().write(seq);
		
        return null;
	}
	
//	 공시지가 리스트 가져오기
	public ModelAndView 	getPriceList(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");	
		
		try{
			if(userId != null)
			{
				String 	admin_no 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
				String year = ServletRequestUtils.getStringParameter(request, "year", "");
				String idx = ServletRequestUtils.getStringParameter(request, "idx", "");
				try
				{
					
					List priceList = objJumyongService.getPriceList(admin_no,year);
					
					request.setAttribute("year",year);
					request.setAttribute("idx",idx);
					request.setAttribute("priceList",priceList);
					
					
				}catch(Exception err)
				{
					err.printStackTrace();
				}
			}
		}catch(Exception e){
			System.out.println("error:"+e.toString());
		}
		return new ModelAndView("/jumyong/jumyong/landPriceList" );
	}
	
//	 정기분 면적 선택 리스트
	public ModelAndView 	getPrice(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");	
		
		try{
			if(userId != null)
			{
				String 	admin_no 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
				String year = ServletRequestUtils.getStringParameter(request, "year", "");
				
				
				//System.out.println(admin_no);
				//System.out.println(year);								
							
				//오늘 날짜 
				Calendar  cal  =  Calendar.getInstance();
				SimpleDateFormat  sdf  =  new SimpleDateFormat("yyyyMMdd");      // 데이터 출력 형식 지정
				String  toDate  =  sdf.format (cal.getTime());      // 오늘 날짜 변수에 저장
				System.out.println("공시지가 가져오기 admin_no ==== " + admin_no);
				
				try
				{
					Map a = objJumyongService.get_Price(admin_no);
					request.setAttribute("year",year);
					
					//System.out.println("a.size()==== " + a.size() );
					if(a.size() > 0)
					{
					
					request.setAttribute("SI_NM",a.get("SI_NM")+"시");
					request.setAttribute("GU_NM",a.get("GU_NM"));
					request.setAttribute("BJ_NM",a.get("BJ_NM"));
					if(a.get("BUBUN")==null ||a.get("BUBUN").equals("")){
						request.setAttribute("BUNJI",a.get("BONBUN"));
					}else{
						request.setAttribute("BUNJI",a.get("BONBUN")+"-"+a.get("BUBUN"));
					}								
						
						//System.out.println("toDate === " + toDate);
						//System.out.println("year ===" + year);
						
						int i = Integer.parseInt(a.get("DB_CRE_MON").toString().substring(0,4)) - Integer.parseInt(year);
						String giga = "";
						//System.out.println("#################i:"+i);
						if(i == 0 || i < 0)
							giga = a.get("JIGA").toString();
						else if(i == 1)
							giga = a.get("JIGA_PY").toString();
						else if(i == 2)
							giga = a.get("JIGA_2PY").toString();
						else if(i == 3)
							giga = a.get("JIGA_3PY").toString();
						else if(i == 4)
							giga = a.get("JIGA_4PY").toString();
							
						
						//System.out.println("%%%%%%%%%%%%%%%%giga:"+giga);
						request.setAttribute("giga",giga);
					}else
						request.setAttribute("SI_NM","해당 주소의 공시지가가 없습니다.");
				}catch(Exception err)
				{
					request.setAttribute("SI_NM","해당 주소의 공시지가가 없습니다.");
					request.setAttribute("giga","0");
					System.out.println(err.toString());
				}
			}
		}catch(Exception e){
			System.out.println("error:"+e.toString());
		}
		return new ModelAndView("/jumyong/jumyong/officialLandPrice" );
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

//	 정기분 면적 선택 리스트
	public ModelAndView 	inspectDel(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		
		String 	admin_no 	= ServletRequestUtils.getStringParameter(request, "admin_no", "");
		String seq = ServletRequestUtils.getStringParameter(request, "seq", "");
		
		try
		{
			objJumyongService.Delete_Inspect(Integer.parseInt(seq));
		}catch(Exception err)
		{	
		}

		return new ModelAndView("redirect:/jumyong/inspectEdit.do?no="+admin_no+"&seq="+seq);
		
	}
	
	


//	 정기분 면적 선택 리스트
	public ModelAndView 	confDel(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		
		String 	admin_no 	= ServletRequestUtils.getStringParameter(request, "admin_no", "");
		String seq = ServletRequestUtils.getStringParameter(request, "seq", "");
		
		try
		{
			objJumyongService.Delete_Conf(Integer.parseInt(seq));
		}catch(Exception err)
		{	
		}

		return new ModelAndView("redirect:/jumyong/confEdit.do?no="+admin_no);
		
	}
	
	
	
	
	
	
	
	// 이력내역 view
	public ModelAndView history_view(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");	
		List historyList = new ArrayList();
		
		try{
			if(userId != null)
			{
				
				String ADMIN_NO	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
				String currentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
				String message = ServletRequestUtils.getStringParameter(request, "message", "");
				String SEQ = ServletRequestUtils.getStringParameter(request, "SEQ", "");
				String SECTION = ServletRequestUtils.getStringParameter(request, "SECTION", "");
				request.setAttribute("ADMIN_NO", ADMIN_NO);
				request.setAttribute("currentPage", currentPage);
				request.setAttribute("message", message);
				request.setAttribute("SECTION", SECTION);
				
				//System.out.println(" view ADMIN_NO ======= " + ADMIN_NO );
				
				
				// 이력정보 count
				int listCount = objJumyongService.getHistoryListCount(ADMIN_NO);
				
				int	rowCol = pageing.execute(request, listCount, Integer.parseInt(currentPage), 5);
				
				historyList = objJumyongService.getHistoryList(ADMIN_NO , rowCol, rowCol+4);
				//System.out.println("historyList == " + historyList.size());
				
				if( historyList.size() > 0 ){
					
					for( int i = 0; i < historyList.size(); i++ ){
						ProductBean pb = (ProductBean) historyList.get(i);
						
						if( pb.getGUNGE() != null && !"".equals(pb.getGUNGE()) ){
							pb.setGUNGE_FIX(stringUtil.fixLength(pb.getGUNGE(), 30, "..." ));
						}
						if( pb.getSAYU() != null && !"".equals(pb.getSAYU()) ){
							pb.setSAYU_FIX(stringUtil.fixLength(pb.getSAYU(), 30, "..." ));
						}
						if( pb.getGUBUN() != null && !"".equals(pb.getGUBUN()) ){
							pb.setGUBUN(commonCode.executeCommonCodeNm("history_type", pb.getGUBUN()));
						}
						pb.setWRITEDATE(util.Date_Paste(pb.getWRITEDATE()));
					}
					
				}
				
				request.setAttribute("historyList", historyList);
				
				
				// 상세정보
				ProductBean product = new ProductBean();
				if( SEQ != null && !"".equals(SEQ)){
					product = objJumyongService.getHistoryView(ADMIN_NO, SEQ);
					if( product.getGUBUN() != null && !"".equals(product.getGUBUN()) ){
						product.setGUBUN(commonCode.executeCommonCodeNm("history_type", product.getGUBUN()));
					}
					if( product.getWRITEDATE() != null && !"".equals(product.getWRITEDATE()) ){
						product.setWRITEDATE(util.Date_Paste(product.getWRITEDATE()));
					}
					if( product.getUP_DATE() != null && !"".equals(product.getUP_DATE()) ){
						product.setUP_DATE(util.Date_Paste(product.getUP_DATE()));
					}
					request.setAttribute("product", product);
				}
				
			}
			
		}catch(Exception err){	
			System.out.println(err.toString());
		}

		return new ModelAndView("/jumyong/jumyong/history_view");
		
	}
	
	// 이력내역 삭제
	public ModelAndView history_del(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");	
		List historyList = new ArrayList();
		
		try{
			if(userId != null)
			{
				
				String ADMIN_NO	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
				String currentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
				String message = ServletRequestUtils.getStringParameter(request, "message", "");
				String SEQ = ServletRequestUtils.getStringParameter(request, "SEQ", "");
				String SECTION = ServletRequestUtils.getStringParameter(request, "SECTION", "");
				
				request.setAttribute("ADMIN_NO", ADMIN_NO);
				request.setAttribute("currentPage", currentPage);
				request.setAttribute("message", message);
				request.setAttribute("SECTION", SECTION);
				
				
				System.out.println("히스토리 삭제");
				System.out.println("SEQ::"+SEQ);
				System.out.println("ADMIN_NO::"+ADMIN_NO);
				objJumyongService.deleteHistoryInfo(ADMIN_NO, SEQ);
				
				// 이력정보 count
				int listCount = objJumyongService.getHistoryListCount(ADMIN_NO);
				int	rowCol = pageing.execute(request, listCount, Integer.parseInt(currentPage), 5);
				historyList = objJumyongService.getHistoryList(ADMIN_NO , rowCol, rowCol+4);
				
				if( historyList.size() > 0 ){
					
					for( int i = 0; i < historyList.size(); i++ ){
						ProductBean pb = (ProductBean) historyList.get(i);
						
						if( pb.getGUNGE() != null && !"".equals(pb.getGUNGE()) ){
							pb.setGUNGE_FIX(stringUtil.fixLength(pb.getGUNGE(), 30, "..." ));
						}
						if( pb.getSAYU() != null && !"".equals(pb.getSAYU()) ){
							pb.setSAYU_FIX(stringUtil.fixLength(pb.getSAYU(), 30, "..." ));
						}
						if( pb.getGUBUN() != null && !"".equals(pb.getGUBUN()) ){
							pb.setGUBUN(commonCode.executeCommonCodeNm("history_type", pb.getGUBUN()));
						}
						pb.setWRITEDATE(util.Date_Paste(pb.getWRITEDATE()));
					}
					
				}
				
				request.setAttribute("historyList", historyList);
				
				
			}
			
		}catch(Exception err){	
			System.out.println(err.toString());
		}

		return new ModelAndView("/jumyong/jumyong/history_view");
		
	}
	
	
	// 이력내역 등록,수정폼
	public ModelAndView history_register(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");	
		
		try{
			if(userId != null)
			{
			
				String ADMIN_NO	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
				String mode	= ServletRequestUtils.getStringParameter(request, "mode", "");
				String SEQ	= ServletRequestUtils.getStringParameter(request, "SEQ", "");
				String currentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
				request.setAttribute("ADMIN_NO", ADMIN_NO);
				request.setAttribute("mode", mode);
				request.setAttribute("SEQ", SEQ);
				request.setAttribute("currentPage", currentPage);
				
				// 현재 년도
				SimpleDateFormat	formatter 	= new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA );
				Calendar 			cal 		= Calendar.getInstance();
				String	today		= formatter.format(cal.getTime());
				
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				String name = userBean.getNAME();
				String org_cd = userBean.getORG_CD();
				String DEPT_CD = userBean.getDEPT_CD();
				String PNU = userBean.getPNU();
				System.out.println("org_Cd = " + org_cd);
				System.out.println("dept_cd == " + DEPT_CD);
				System.out.println("pnu == " + PNU);
				
				
				//일반코드
				request.setAttribute("history_type", commonCode.executeCommonCode("history_type", "", "선택하세요"));
				
				// 수정일때 상세정보
				ProductBean product = new ProductBean();
				if( "edit".equals(mode) ){
					if( SEQ != null && !"".equals(SEQ)){					
						product = objJumyongService.getHistoryView(ADMIN_NO, SEQ);
						if( product.getWRITEDATE() != null && !"".equals(product.getWRITEDATE()) ){
							request.setAttribute("date", util.Date_Paste(product.getWRITEDATE()));
						}
						request.setAttribute("product", product);
						request.setAttribute("history_type", commonCode.executeCommonCode("history_type", product.getGUBUN(), "선택하세요"));						
					}
				}
				else{
					//product.setWORK_NM(util.);
					product.setWORK_NM(name);
					request.setAttribute("product", product);
					request.setAttribute("history_type", commonCode.executeCommonCode("history_type", "", "선택하세요"));
					request.setAttribute("date", today);
				}
			
			}
		}catch(Exception err){	
			System.out.println(err.toString());
		}

		return new ModelAndView("/jumyong/jumyong/history_register");
		
	}
	
	
	// 이력내역 등록,수정
	public ModelAndView history_registerPrc(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		//관리자 데이터를 가져온다.
		HttpSession session = request.getSession();		
		String 		userId	= (String)session.getAttribute("sessionUserId");
		UserBean	userBean	= new UserBean();
		userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
		String mode	= ServletRequestUtils.getStringParameter(request, "mode", "");
		String currentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
		String sigu_cd = userBean.getSIGU_CD();
		String message = "";
		
		//System.out.println("mode === " + mode);
		
		ProductBean pb = new ProductBean();
		bind(request, pb);
		
		//pb.setWORK_ID(userId);
		pb.setGU_CODE(sigu_cd);
		
		if( pb.getWRITEDATE() != null && !"".equals(pb.getWRITEDATE()) ){
			pb.setWRITEDATE(util.Date_Cut(pb.getWRITEDATE()));
		}

		Calendar cal = Calendar.getInstance();
		
		SimpleDateFormat  sdf  =  new SimpleDateFormat("yyyyMMdd");      // 데이터 출력 형식 지정
		String currentdate = (sdf.format (cal.getTime()));      // 오늘 날짜 변수에 저장
		
		try
		{	
			
			if( "add".equals(mode)){
				String max_seq = objJumyongService.getHistoryMaxSeq(pb);
				pb.setSEQ(max_seq);
				objJumyongService.insertHistoryInfo(pb);
				message = "추가되었습니다.";
			}
			else{
				pb.setUP_DATE(currentdate);
				objJumyongService.updateHistoryInfo(pb);
				message = "수정되었습니다.";				
			}
			
			
		}catch(Exception err){
			System.out.println(err.toString());
		}

		return new ModelAndView("redirect:/jumyong/jumyong/history_view.do?ADMIN_NO="+pb.getADMIN_NO()+"&message="+message+"&currentPage="+currentPage);
		
	}
	
	
	// 인접지 평균 공시지가 구하기
	public ModelAndView totalWith(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		
		HttpSession session = request.getSession();		
		String 		userId	= (String)session.getAttribute("sessionUserId");					
		
		List list = null;
		
		try{
			if(userId != null){
				
				String ADMIN_NO = ServletRequestUtils.getStringParameter(request,"ADMIN_NO","");			
				String YEAR = ServletRequestUtils.getStringParameter(request,"YEAR","");
				String IDX = ServletRequestUtils.getStringParameter(request,"IDX","");
					
				
				Map withaddrInfo = objJumyongService.getWithAddrInfo(ADMIN_NO);
				
				String sido = "";
				String sigungu = "";
				String bj_cd = "";
				String bonbun = "";
				String bubun = "";
				
				sido = withaddrInfo.get("SIDO").toString();
				sigungu = withaddrInfo.get("SIGUNGU").toString();
				bj_cd = withaddrInfo.get("BJ_CD").toString();
				bonbun = withaddrInfo.get("BONBUN").toString();
				if(withaddrInfo.get("BUBUN") != null){
				bubun = withaddrInfo.get("BUBUN").toString();
				}
				
				System.out.println("FDSAFDSAFDSAFDSA : ADMIN_NO : "+ ADMIN_NO);
				System.out.println("FDSAFDSAFDSAFDSA : YEAR : "+ YEAR);
				System.out.println("FDSAFDSAFDSAFDSA : IDX : "+ IDX);
				
								
				request.setAttribute("ADMIN_NO",ADMIN_NO );
				request.setAttribute("GU_CD", sigungu);
				request.setAttribute("BJ_CD",bj_cd);
				request.setAttribute("BJ_NM",commonCode.executeBJDongName(sido,sigungu,bj_cd));
				request.setAttribute("YEAR",YEAR);
				request.setAttribute("ORG_BONBUN", bonbun);
				request.setAttribute("ORG_BUBUN",bubun);
				request.setAttribute("IDX",IDX);
				
				
				
				

			}
		}catch(Exception e){	
			System.out.println("error:"+e.toString());	
		}	
		return new ModelAndView("/jumyong/jumyong/total_with");
	}
	
}
