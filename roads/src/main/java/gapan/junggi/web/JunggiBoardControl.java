/***********************************
 * 수정일 : 2007.9.27
 * 최종수정자 : 최진용
 * 수정내용 :
 ***********************************/

package main.java.gapan.junggi.web;

import main.java.common.commonCode.model.UserBean;
import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.util.BoardUtil;
import main.java.common.util.Globals;
import main.java.common.util.catUtil.Pageing;
import main.java.common.util.catUtil.Util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Map;


import java.util.List;


import main.java.gapan.jumyong.model.ProductBean;
import main.java.gapan.jumyong.model.SearchBean;

import main.java.gapan.jumyong.model.jumyongBean;
import main.java.gapan.jumyong.service.IJumyongService;


import main.java.gapan.junggi.service.JunggiService;
import main.java.gapan.junggi.service.IJunggiService;

public class JunggiBoardControl extends MultiActionController {
	
  	/**
  	 * QABoard 리스트 조회 (login 안한상태에 보이는 리스트)
	 * @param HttpServletRequest request
	 * @param HttpServletResponce responce
	 * @return ModelAndView
	 */
	
	private IJunggiService objJunggiService = null;
	private IJumyongService objJumyongService = null;
	private	CommonCodeService	commonCode		= null;
	private IJunggiService objJunggiService_j = null;
	
	private	Util				util			= new Util();
	private	Pageing				pageing			= new Pageing();
	
	
	public void setGapan_junggiService (JunggiService newObjJunggiService)
	{
		this.objJunggiService = newObjJunggiService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode) 
	{
		this.commonCode 	= commonCode;
	}
	
	
	public void setGapan_jumyongService(IJumyongService newObjJumyongService) {
		this.objJumyongService = newObjJumyongService;
	}
	
	public ModelAndView landPriceAllAplly(HttpServletRequest request,HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();		
		String 		userId	= (String)session.getAttribute("sessionUserId");
		
		List junggiList = null;
		
		try{
			if(userId != null)
			{
//				관리자 데이터를 가져온다.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
				// 현년도 계산
				Calendar cal = Calendar.getInstance();
				SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");			  
				String thisDate = formatter.format(cal.getTime());			
				String thisYear = thisDate.substring(0,4);
				
				// 세션에서 시도 코드를 가져온다.
				//String SIDO_CD 		= util.getSidoCode(getMessageSourceAccessor());
				String sigu_cd 		= userBean.getSIGU_CD();	
				String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
				String year 		= ServletRequestUtils.getStringParameter(request,"year", thisYear);
				String type 		= ServletRequestUtils.getStringParameter(request,"type","");
				String tax_set 		= ServletRequestUtils.getStringParameter(request,"tax_set","");
				
				String tax_yn 		= ServletRequestUtils.getStringParameter(request,"tax_yn","");
				String mul_fromdate = ServletRequestUtils.getStringParameter(request,"mul_fromdate",thisYear+"-01-01");
				String mul_todate 	= ServletRequestUtils.getStringParameter(request,"mul_todate",thisYear+"-12-31");
				String cal_status 	= ServletRequestUtils.getStringParameter(request,"cal_status","");
				String purpose 		= ServletRequestUtils.getStringParameter(request,"purpose_cd","");
				
				String bj_cd 		= ServletRequestUtils.getStringParameter(request,"bj_cd", "");				
				String jumyongName 	= ServletRequestUtils.getStringParameter(request,"jumyongName","");		
									
				mul_fromdate = util.Date_Cut(mul_fromdate);
				mul_todate = util.Date_Cut(mul_todate);
				
				request.setAttribute("sigu_cd", sigu_cd);
				request.setAttribute("currentPage", strCurrentPage);
				request.setAttribute("year", year);				
				request.setAttribute("type", type);
				request.setAttribute("tax_set", tax_set);
				
				request.setAttribute("tax_yn", tax_yn);				
				request.setAttribute("mul_fromdate", mul_fromdate);
				request.setAttribute("mul_todate", mul_todate);
				request.setAttribute("cal_status", cal_status);
				request.setAttribute("purpose", purpose);
				
				request.setAttribute("bj_cd", bj_cd);								
				request.setAttribute("jumyongName", jumyongName);
				
				
				int listCount = objJunggiService.getlandPriceAllApllyCount(sigu_cd, year,  type,  tax_set,  tax_yn, mul_fromdate, mul_todate, cal_status, purpose, bj_cd, jumyongName);
				request.setAttribute("listCount", String.valueOf(listCount));	
				System.out.println("listCount:"+listCount);
				// 페이징 처리
				int	rowCol = pageing.execute(request, listCount, Integer.parseInt(strCurrentPage), 10);
				
				//junggiList =  objJunggiService.getlandPriceAllAplly(sigu_cd, year,  type,  tax_set,  tax_yn,  mul_fromdate, mul_todate, purpose, bj_cd, hj_cd, jumyongName, SECTION, rowCol, rowCol + 9);
				junggiList =  objJunggiService.getlandPriceAllAplly(sigu_cd, year,  type,  tax_set,  tax_yn, mul_fromdate, mul_todate, cal_status, purpose, bj_cd, jumyongName, rowCol, rowCol + 9);
			}					
		}catch(Exception err)
		{
			System.out.println("공시지가 일괄적용 View error:"+err.toString());
		}
		return new ModelAndView("/gapan/junggi/landPriceAllAplly", "blist",junggiList);			
	}
	
	public ModelAndView priceApllyUpdate(HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		SearchBean sb = new SearchBean();
		
//		관리자 데이터를 가져온다.
		UserBean	userBean	= new UserBean();
		userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
		
		// 현년도 계산
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");			  
		String thisDate = formatter.format(cal.getTime());			
		String thisYear = thisDate.substring(0,4);
		
		
		// 세션에서 시도 코드를 가져온다.
		String SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
		String sigu_cd = userBean.getSIGU_CD();			 		
		String year = ServletRequestUtils.getStringParameter(request,"YEAR", thisYear);
		String type = ServletRequestUtils.getStringParameter(request,"TYPE","");
		String tax_set = ServletRequestUtils.getStringParameter(request,"TAX_SET","");
		String tax_yn = ServletRequestUtils.getStringParameter(request,"TAX_YN","");
		String mul_fromdate = ServletRequestUtils.getStringParameter(request,"MUL_FROMDATE",thisYear+"-01-01");
		String mul_todate = ServletRequestUtils.getStringParameter(request,"MUL_TODATE",thisYear+"-12-31");
		String purpose = ServletRequestUtils.getStringParameter(request,"PURPOSE","");
		String bj_cd = ServletRequestUtils.getStringParameter(request,"BJ_CD", "");
		String cal_status = ServletRequestUtils.getStringParameter(request,"cal_status", "");
		String jumyongName = ServletRequestUtils.getStringParameter(request,"jumyongName","");		
		
		
		// 날짜 검색 있을시 '-' 제거 
		if(mul_fromdate != null && !"".equals(mul_fromdate) ) {
			mul_fromdate = util.Date_Cut(mul_fromdate);
		}
		if(mul_todate != null && !"".equals(mul_todate) ) {
			mul_todate = util.Date_Cut(mul_todate);
		}
		
		sb.setGU_CODE(sigu_cd);
		sb.setYEAR(year);
		sb.setTYPE(type);
		sb.setTAX_SET(tax_set);
		sb.setTAX_YN(tax_yn);
		sb.setFROMDATE(mul_fromdate);
		sb.setTODATE(mul_todate);
		sb.setPURPOSE(purpose);
		sb.setBJ_CD(bj_cd);
		sb.setCAL_STATUS(cal_status);
		sb.setJUMYONGNAME(jumyongName);
		if(objJunggiService.priceApllyUpdate(sb))
			request.setAttribute("result", "1");
		else
			request.setAttribute("result", "0");
		
		return new ModelAndView("/jumyong/junggi/landPriceAllAplly");
	}
	 
	public ModelAndView junggi_view(HttpServletRequest request,HttpServletResponse response) throws Exception {
		
//		 삭제 세션
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");

		try{
			if(userId != null)
			{
		
			
				// 현년도 계산
				Calendar cal = Calendar.getInstance();
				SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");			  
				String thisDate = formatter.format(cal.getTime());			
				String thisYear = thisDate.substring(0,4);
				
				String gapan_no = ServletRequestUtils.getStringParameter(request,"gapan_no");
				String year = ServletRequestUtils.getStringParameter(request,"year");
				String cal_sum_seq = ServletRequestUtils.getStringParameter(request,"cal_sum_seq","");
				String seq = ServletRequestUtils.getStringParameter(request,"seq","");			
				String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
				String strCountPerPage = ServletRequestUtils.getStringParameter(request, "countPerPage", "4");
				String message = ServletRequestUtils.getStringParameter(request,"message","");
				
				int countPerPage = Integer.parseInt(strCountPerPage);
				
				request.setAttribute("gapan_no", gapan_no);
				request.setAttribute("currentPage", strCurrentPage);
				request.setAttribute("message", message);
				
				
				//////////////합계리스트
				// 합계리스트 개수 및 페이징
				int listCount = objJunggiService.getcal_sum_infoListCount(gapan_no, year);
				
				int	rowCol = pageing.execute(request, listCount, Integer.parseInt(strCurrentPage), 10);
				
				List cal_sum_infoList = objJunggiService.cal_sum_infoList(gapan_no, year, rowCol, rowCol+3);
				request.setAttribute("cal_sum_infoList", cal_sum_infoList);
				
							
			
				////////////년도별 리스트
				if(cal_sum_seq == null || cal_sum_seq.equals("")||cal_sum_seq.equals("null"))  
				{					
					cal_sum_seq = ((ProductBean)cal_sum_infoList.get(0)).getSEQ();
				}
				request.setAttribute("cal_sum_seq", cal_sum_seq);			
				
				List ImpositionInfoByCalSumList = objJunggiService.ImpositionInfoByCalSumList(cal_sum_seq);
				request.setAttribute("ImpositionInfoByCalSumList", ImpositionInfoByCalSumList);			
				
				int listSize = ImpositionInfoByCalSumList.size();
				request.setAttribute("listSize", String.valueOf((listSize)));
				
				
				ProductBean pb = new ProductBean();		
				
				////////////info
				if(listSize > 0) // 년도별 리스트가 있을때
				{	
					if(seq == null || seq.equals("")||seq.equals("null"))  
					{	
						seq = ((ProductBean)ImpositionInfoByCalSumList.get(0)).getSEQ();
					}
					
					//System.out.println("seq === " + seq);
					//info정보
					pb = objJunggiService.impositionInfo(gapan_no, seq);
					//날짜에 대쉬(-) 추가
					if(pb.getFROMDATE() != null) pb.setFROMDATE(addDash(pb.getFROMDATE()));			
					if(pb.getTODATE() != null) pb.setTODATE(addDash(pb.getTODATE()));		
					
					
					//정기만 수정 버튼 활성화
					int intUseSection = objJunggiService.getUseSection(seq);
					
					if(intUseSection == 1)
						request.setAttribute("showModify","true");
					
				}
				request.setAttribute("seq", seq);
				request.setAttribute("product",pb);		
				request.setAttribute("yearAdd", String.valueOf(Integer.parseInt(thisYear)+1));
				request.setAttribute("year", year);
				
			}
		}catch(Exception err)
		{
			ProductBean pb = new ProductBean();			
			request.setAttribute("product",pb);
			System.out.println(err.toString());
		}
			
		return new ModelAndView("/gapan/junggi/info_product_view");
	}
	
	
	
	public ModelAndView search(HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		//		 삭제 세션
		HttpSession session = request.getSession();
		
		String 		userId	= (String)session.getAttribute("sessionUserId");
		SearchBean objSearchBean = null;
		List	junggiList	=	null;

		try{
			if(userId != null)
			{
				//관리자 데이터를 가져온다.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
				// 현년도 계산
				Calendar cal = Calendar.getInstance();
				SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");			  
				String thisDate = formatter.format(cal.getTime());			
				String thisYear = thisDate.substring(0,4);
				
				
				// 세션에서 시도 코드를 가져온다.
				String SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				String sigu_cd = userBean.getSIGU_CD();
				String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
				String year = ServletRequestUtils.getStringParameter(request,"year", thisYear);
				String type = ServletRequestUtils.getStringParameter(request,"type","0");
				String tax_set = ServletRequestUtils.getStringParameter(request,"tax_set","");
				String tax_yn = ServletRequestUtils.getStringParameter(request,"tax_yn","");
				String mul_fromdate = ServletRequestUtils.getStringParameter(request,"mul_fromdate",thisYear+"-01-01");
				String mul_todate = ServletRequestUtils.getStringParameter(request,"mul_todate",thisYear+"-12-31");
				String purpose = ServletRequestUtils.getStringParameter(request,"purpose","000");
				String bj_cd = ServletRequestUtils.getStringParameter(request,"bj_cd","");
				String jumyongName = ServletRequestUtils.getStringParameter(request,"jumyongName","");
				String cal_status = ServletRequestUtils.getStringParameter(request,"cal_status","");
				String message = ServletRequestUtils.getStringParameter(request,"message","");
				
				//String numberValue = ServletRequestUtils.getStringParameter(request,"numberValue","");			
				//String bonbun = ServletRequestUtils.getStringParameter(request,"bonbun","");
				//String bubun = ServletRequestUtils.getStringParameter(request,"bubun","");
				
				
				//일반 코드.	
				request.setAttribute("use_type", commonCode.executeCommonCode("use_type", type, "선택하세요"));		
				request.setAttribute("taxation_section", commonCode.executeCommonCode("taxation_section", tax_set, "선택하세요"));
				request.setAttribute("taxation_yn", commonCode.executeCommonCode("taxation_yn", tax_yn, "선택하세요"));
				request.setAttribute("bjdong_code", commonCode.CommonBJDongCodeSearch(SIDO_CD, userBean.getSIGU_CD(), bj_cd));	//	법정동
				request.setAttribute("cal_status", commonCode.executeCommonCode("cal_status", cal_status, "선택하세요"));
				request.setAttribute("GP_TYP", commonCode.executeGapanCode("GP_TYP", type, "선택"));		// 처리상태
				
				// 날짜 검색 있을시 '-' 제거 
				if(mul_fromdate != null && !"".equals(mul_fromdate) ) {
					mul_fromdate = util.Date_Cut(mul_fromdate);
				}
				if(mul_todate != null && !"".equals(mul_todate) ) {
					mul_todate = util.Date_Cut(mul_todate);
				}
				
				
				// 리스트의 페이징 html 
				int listCount = objJunggiService.getJunggiSearchListCount(sigu_cd, year,  type,  tax_set,  tax_yn,  mul_fromdate, mul_todate, purpose, bj_cd, jumyongName, cal_status);
				//System.out.println("listCount::::"+listCount);
				
				// 페이징 처리
				int	rowCol = pageing.execute(request, listCount, Integer.parseInt(strCurrentPage), 10);
				
				junggiList =  objJunggiService.junggiSearchList(sigu_cd, year,  type,  tax_set,  tax_yn,  mul_fromdate, mul_todate, purpose, bj_cd, jumyongName, cal_status, rowCol, rowCol + 9, "");
				
				
			
				if( junggiList != null ){
					for(int i=0;i<junggiList.size();i++)
					{	
						jumyongBean jumyong_bean = (jumyongBean)junggiList.get(i);
						
						if(jumyong_bean.getSUM_ADJUST() != null)
							jumyong_bean.setSUM_ADJUST(insertComma2(jumyong_bean.getSUM_ADJUST()));
						if(jumyong_bean.getLAST_FROMDATE() != null){
							jumyong_bean.setLAST_FROMDATE(util.Date_Paste(jumyong_bean.getLAST_FROMDATE()));
						}else{
							jumyong_bean.setLAST_FROMDATE("-");
						}
						if(jumyong_bean.getLAST_TODATE() != null){
							jumyong_bean.setLAST_TODATE(util.Date_Paste(jumyong_bean.getLAST_TODATE()));
						}else{
							jumyong_bean.setLAST_TODATE("-");
						}
						if(jumyong_bean.getFROMDATE() != null)
							jumyong_bean.setFROMDATE(util.Date_Paste(jumyong_bean.getFROMDATE()));
						if(jumyong_bean.getTODATE() != null)
							jumyong_bean.setTODATE(util.Date_Paste(jumyong_bean.getTODATE()));
						if(jumyong_bean.getPRICE() != null)
							jumyong_bean.setPRICE(insertComma2(jumyong_bean.getPRICE()));
						if(jumyong_bean.getRATE() != null)
							jumyong_bean.setRATE(String.valueOf(Float.parseFloat(jumyong_bean.getRATE())));
						if(jumyong_bean.getTAX_NO() == null || "".equals(jumyong_bean.getTAX_NO()))
							jumyong_bean.setTAX_NO("-");
						
						if(jumyong_bean.getBUBUN() != null){
							jumyong_bean.setBONBUN(jumyong_bean.getBONBUN() +"-"+ jumyong_bean.getBUBUN());
						}else {
							jumyong_bean.setBONBUN(jumyong_bean.getBONBUN());
						}
						
					}
				}
			
			
				request.setAttribute("listCount", String.valueOf(listCount));
				request.setAttribute("currentPage", strCurrentPage);
				request.setAttribute("year", year);
				request.setAttribute("mul_fromdate", util.Date_Paste(mul_fromdate));
				request.setAttribute("mul_todate", util.Date_Paste(mul_todate));
				request.setAttribute("TYPE", type);
				request.setAttribute("PURPOSE_CD", purpose);
				request.setAttribute("jumyongName", jumyongName);
				request.setAttribute("BJ_CD", bj_cd);
				request.setAttribute("message", message);
				
			
			}
			
		} catch(Exception e){
			System.out.println(e.toString());
		}
		
		return new ModelAndView("/gapan/junggi/search","blist",junggiList);
	}
	
	
	// view 페이지
	public ModelAndView view(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
//		 삭제 세션
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");

		try{
			if(userId != null)
			{
				String 	gapan_no 	= ServletRequestUtils.getStringParameter(request, "gapan_no", "");
				String 	year 	= ServletRequestUtils.getStringParameter(request, "year", "");
				
				//System.out.println("gapan_no== " + gapan_no);
				//System.out.println("year== " + year);
				
				request.setAttribute("gapan_no", gapan_no);
				request.setAttribute("year", year);
			}
		} catch(Exception e){
			System.out.println(e.toString());
		}
		
		return new ModelAndView("/gapan/junggi/view");
	}
	
	
	
	
	public String insertComma2(String value1)
	{	
		int length1 = value1.length();		
		int divideNum = length1%3;
		
		String returnValue2 ="";
		if(divideNum != 0)
		{
			returnValue2 = value1.substring(0,divideNum)+",";
		}
		if(length1 >3)
		{
			while(true)
			{	
				returnValue2 = returnValue2 + value1.substring(divideNum,divideNum+3)+",";
				divideNum = divideNum+3;
				if(length1 < divideNum+3)
					break;
			}
		}
		
		if(returnValue2 == "")
			returnValue2 = value1;
		else
			returnValue2 = returnValue2.substring(0,returnValue2.length() - 1);
			
		return returnValue2;
	}
	
	public String addDash(String val1)
	{
		if(val1.length() > 8)
		return val1.substring(0,4)+"-"+val1.substring(4,6)+"-"+val1.substring(6,8);
		else return val1;
	}
	

	//	 정기분 면적 선택 리스트
	public ModelAndView	productaddList(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{	
//		 삭제 세션
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");

		try{
			if(userId != null)
			{
		
				String 	ADMIN_NO 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");		 
				String year = ServletRequestUtils.getStringParameter(request, "year", "");
				
				request.setAttribute("ADMIN_NO",ADMIN_NO);
				request.setAttribute("year",year);
				
				List list1 =objJunggiService.Productjunggi_addList(ADMIN_NO,year);
				request.setAttribute("productList",list1);
			}
		} catch(Exception e){
			System.out.println(e.toString());
		}
	
		return new ModelAndView("/gapan/junggi/info_productaddlist" );
	}
	
	
	// 감소분 정할 산출 리스트
	public ModelAndView 	productSubList(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		
//		 삭제 세션
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");

		try{
			if(userId != null)
			{
				String 	ADMIN_NO 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
				String year = ServletRequestUtils.getStringParameter(request, "year", "");
				String area = ServletRequestUtils.getStringParameter(request, "area", ""); 
				
				
				
				request.setAttribute("ADMIN_NO",ADMIN_NO);
				request.setAttribute("year",year);
				request.setAttribute("area",area);
				
		
				//List list1 =objJunggiService.Productjunggi_addList(ADMIN_NO,year);
				List list1 =objJumyongService.productSubList(ADMIN_NO,year);
				
				
				request.setAttribute("productList",list1);
			}
		} catch(Exception e){
			System.out.println(e.toString());
		}
	
		return new ModelAndView("/gapan/jumyong/info_productsublist" );
	}	
	
	
	

////////////////////////////////////////////////////////////////////////////////////////////////////////
	//정기 product_temp_insert
	public ModelAndView product_temp_insert(HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		String admin_no = ServletRequestUtils.getStringParameter(request, "admin_no", "");
		String year = ServletRequestUtils.getStringParameter(request, "year", "");
		
		//EQUIP 정기분 산출 목록 입력//YEAR,FROMDATE,TODATE,UP_DATE,CAL_SUM_SEQ,GU_CODE,CORP_CD			
		
		Calendar cal = Calendar.getInstance();				
		SimpleDateFormat  sdf  =  new SimpleDateFormat("yyyyMMdd");      // 데이터 출력 형식 지정
		String toDay = sdf.format (cal.getTime());      // 오늘 날짜 변수에 저장
		
		
		//if(objJunggiService.getcal_sum_exist(gu_code,corp_cd,year)> 0)		//이미 해당연도 정기분 값이 들어가 있으면 return		
		//return new ModelAndView("redirect:/facility/junggi/product_view.do?GU_CODE="+gu_code+"&CORP_CD="+corp_cd);
		
		if(objJunggiService.cal_sum_exist(admin_no,year)> 0)		//이미 해당연도 정기분 값이 들어가 있으면 return		
			return new ModelAndView("redirect:/gapan/junggi/view.do?ADMIN_NO="+admin_no+"&year="+year);

		
		ProductBean pb = new ProductBean();
		
		//pb.getYEAR(),pb.getFROMDATE(),pb.getTODATE(),pb.getUP_DATE(),
		//pb.getCAL_SUM_SEQ(),pb.getADMIN_NO()
		
		
		pb.setYEAR( year);
		pb.setFROMDATE(year+"0101");
		pb.setTODATE(year+"1231");
		pb.setUP_DATE(toDay);
		pb.setADMIN_NO(admin_no);
		pb.setUSE_SECTION("1");
				
		int cal_sum_seq = objJunggiService.GetCal_sum_seq(admin_no,year);
		
		if( cal_sum_seq == 0 )
		{
		cal_sum_seq = objJumyongService.getCal_Sum_Seq(); 
		pb.setSEQ(String.valueOf(cal_sum_seq));					
		objJumyongService.Cal_Sum_InfoInsert(pb);			    
		}
		
		pb.setCAL_SUM_SEQ(String.valueOf(cal_sum_seq));
		objJunggiService.CalculationTempInsert(pb);	
		
		return new ModelAndView("redirect:/gapan/junggi/view.do?ADMIN_NO="+admin_no+"&year="+year);
	}
	
	
	// 엑셀변환
	public ModelAndView excel_search(HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		// 삭제 세션
		HttpSession session = request.getSession();
		
		String 		userId	= (String)session.getAttribute("sessionUserId");
		List	junggiList	=	null;

		try{
			
			if(userId != null)
			{
				
				//	관리자 데이터를 가져온다.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
				// 현년도 계산
				Calendar cal = Calendar.getInstance();
				SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");			  
				String thisDate = formatter.format(cal.getTime());			
				String thisYear = thisDate.substring(0,4);
				
				
				// 세션에서 시도 코드를 가져온다.
				String SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				String sigu_cd = userBean.getSIGU_CD();
				String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
				String year = ServletRequestUtils.getStringParameter(request,"year", thisYear);
				String type = ServletRequestUtils.getStringParameter(request,"type","0");
				String tax_set = ServletRequestUtils.getStringParameter(request,"tax_set","");
				String tax_yn = ServletRequestUtils.getStringParameter(request,"tax_yn","");
				String mul_fromdate = ServletRequestUtils.getStringParameter(request,"mul_fromdate",thisYear+"-01-01");
				String mul_todate = ServletRequestUtils.getStringParameter(request,"mul_todate",thisYear+"-12-31");
				String purpose = ServletRequestUtils.getStringParameter(request,"purpose","000");
				String bj_cd = ServletRequestUtils.getStringParameter(request,"bj_cd","");
				String jumyongName = ServletRequestUtils.getStringParameter(request,"jumyongName","");
				String cal_status = ServletRequestUtils.getStringParameter(request,"cal_status","");
				
				//String numberValue = ServletRequestUtils.getStringParameter(request,"numberValue","");			
				//String bonbun = ServletRequestUtils.getStringParameter(request,"bonbun","");
				//String bubun = ServletRequestUtils.getStringParameter(request,"bubun","");
				
				//일반 코드.	
				request.setAttribute("use_type", commonCode.executeCommonCode("use_type", type, "선택하세요"));		
				request.setAttribute("taxation_section", commonCode.executeCommonCode("taxation_section", tax_set, "선택하세요"));
				request.setAttribute("taxation_yn", commonCode.executeCommonCode("taxation_yn", tax_yn, "선택하세요"));
				request.setAttribute("bjdong_code", commonCode.CommonBJDongCodeSearch(SIDO_CD, userBean.getSIGU_CD(), bj_cd));	//	법정동
				request.setAttribute("cal_status", commonCode.executeCommonCode("cal_status", cal_status, "선택하세요"));
				request.setAttribute("GP_TYP", commonCode.executeGapanCode("GP_TYP", null, "선택"));		// 처리상태
				
				// 날짜 검색 있을시 '-' 제거 
				if(mul_fromdate != null && !"".equals(mul_fromdate) ) {
					mul_fromdate = util.Date_Cut(mul_fromdate);
				}
				if(mul_todate != null && !"".equals(mul_todate) ) {
					mul_todate = util.Date_Cut(mul_todate);
				}
				
				
				// 리스트의 페이징 html 
				int listCount = objJunggiService.getJunggiSearchListCount(sigu_cd, year,  type,  tax_set,  tax_yn,  mul_fromdate, mul_todate, purpose, bj_cd, jumyongName, cal_status);
				
				
				// 페이징 처리
				int	rowCol = pageing.execute(request, listCount, Integer.parseInt(strCurrentPage), 10);
				
				junggiList =  objJunggiService.junggiSearchList(sigu_cd, year,  type,  tax_set,  tax_yn,  mul_fromdate, mul_todate, purpose, bj_cd, jumyongName, cal_status, 1, listCount, "");
				
				
			
				if( junggiList != null ){
					for(int i=0;i<junggiList.size();i++)
					{	
						jumyongBean jumyong_bean = (jumyongBean)junggiList.get(i);
						
						
						if(jumyong_bean.getSUM_ADJUST() != null)
							jumyong_bean.setSUM_ADJUST(insertComma2(jumyong_bean.getSUM_ADJUST()));
						if(jumyong_bean.getLAST_FROMDATE() != null)
							jumyong_bean.setLAST_FROMDATE(util.Date_Paste(jumyong_bean.getLAST_FROMDATE()));
						if(jumyong_bean.getLAST_TODATE() != null)
							jumyong_bean.setLAST_TODATE(util.Date_Paste(jumyong_bean.getLAST_TODATE()));
						if(jumyong_bean.getFROMDATE() != null)
							jumyong_bean.setFROMDATE(util.Date_Paste(jumyong_bean.getFROMDATE()));
						if(jumyong_bean.getTODATE() != null)
							jumyong_bean.setTODATE(util.Date_Paste(jumyong_bean.getTODATE()));
						if(jumyong_bean.getPRICE() != null)
							jumyong_bean.setPRICE(insertComma2(jumyong_bean.getPRICE()));
						if(jumyong_bean.getRATE() != null)
							jumyong_bean.setRATE(String.valueOf(Float.parseFloat(jumyong_bean.getRATE())));
						if(jumyong_bean.getLAST_FROMDATE() == null || "".equals(jumyong_bean.getLAST_FROMDATE()))
							jumyong_bean.setLAST_FROMDATE("-");
						if(jumyong_bean.getLAST_TODATE() == null || "".equals(jumyong_bean.getLAST_TODATE()))
							jumyong_bean.setLAST_TODATE("-");
						
						
						jumyong_bean.setSIDO( commonCode.executeSearchBJDongCode(jumyong_bean.getSIDO(), jumyong_bean.getSIGUNGU(), jumyong_bean.getBJ_CD()));
						jumyong_bean.setSPC_CD(commonCode.executeSearchCommonCode("MUL_SPC_CD", jumyong_bean.getSAN_CK()));
						jumyong_bean.setSIGUNGU(commonCode.SearchGuName(jumyong_bean.getSIDO(), jumyong_bean.getSIGUNGU()));
						
					}
				}
				
				
				request.setAttribute("listCount", String.valueOf(listCount));
				request.setAttribute("currentPage", strCurrentPage);
				request.setAttribute("year", year);
				request.setAttribute("mul_fromdate", util.Date_Paste(mul_fromdate));
				request.setAttribute("mul_todate", util.Date_Paste(mul_todate));
				request.setAttribute("TYPE", type);
				request.setAttribute("PURPOSE_CD", purpose);
				request.setAttribute("jumyongName", jumyongName);
				
			}

		}catch(Exception e){System.out.println(e.toString());}
		
		return new ModelAndView("/jumyong/junggi/excel_search","blist",junggiList);
	}
	
	
	// 점용목적코드, 타입으로 클래스명 가져오기
	public String getPurposeNm(String type, String cd)
	{
		String nm = objJunggiService.getPurposeNm(type, cd);
		
		return nm;
	}
	
	
	
	// 일괄산출
	public ModelAndView junggiAllCal(HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		// 삭제 세션
		HttpSession session = request.getSession();
		
		String userId	= (String)session.getAttribute("sessionUserId");
		List junggiList	=	null;

		try{
			if(userId != null)
			{
				System.out.println("******** 노점 정기분 조회 리스트      *********");
				//	관리자 데이터를 가져온다.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
				// 현년도 계산
				Calendar cal = Calendar.getInstance();
				SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");			  
				String thisDate = formatter.format(cal.getTime());			
				String thisYear = thisDate.substring(0,4);
				
				
				// 세션에서 시도 코드를 가져온다.
				String SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				String sigu_cd = userBean.getSIGU_CD();
				String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
				String year = ServletRequestUtils.getStringParameter(request,"YEAR", thisYear);
				String type = ServletRequestUtils.getStringParameter(request,"TYPE","0");
				String tax_set = ServletRequestUtils.getStringParameter(request,"TAX_SET","");
				String tax_yn = ServletRequestUtils.getStringParameter(request,"TAX_YN","");
				String mul_fromdate = ServletRequestUtils.getStringParameter(request,"mul_fromdate",thisYear+"-01-01");
				String mul_todate = ServletRequestUtils.getStringParameter(request,"mul_todate",thisYear+"-12-31");
				String purpose = ServletRequestUtils.getStringParameter(request,"PURPOSE_CD","000");
				String bj_cd = ServletRequestUtils.getStringParameter(request,"BJ_CD","");
				String jumyongName = ServletRequestUtils.getStringParameter(request,"jumyongName","");
				String cal_status = ServletRequestUtils.getStringParameter(request,"cal_status","");
				String yearVal1  = String.valueOf(Integer.parseInt(year)+1);
				
				//일반 코드.	
				request.setAttribute("use_type", commonCode.executeCommonCode("use_type", type, "선택하세요"));		
				request.setAttribute("taxation_section", commonCode.executeCommonCode("taxation_section", tax_set, "선택하세요"));
				request.setAttribute("taxation_yn", commonCode.executeCommonCode("taxation_yn", tax_yn, "선택하세요"));
				request.setAttribute("bjdong_code", commonCode.CommonBJDongCodeSearch(SIDO_CD, userBean.getSIGU_CD(), bj_cd));	//	법정동
				request.setAttribute("cal_status", commonCode.executeCommonCode("cal_status", cal_status, "선택하세요"));
				request.setAttribute("GP_TYP", commonCode.executeGapanCode("GP_TYP", type, "선택"));		// 처리상태
				
				// 날짜 검색 있을시 '-' 제거 
				if(mul_fromdate != null && !"".equals(mul_fromdate) ) {
					mul_fromdate = util.Date_Cut(mul_fromdate);
				}
				if(mul_todate != null && !"".equals(mul_todate) ) {
					mul_todate = util.Date_Cut(mul_todate);
				}
				
				// 리스트의 페이징 html 
				int listCount = objJunggiService.getJunggiSearchListCount(sigu_cd, year,  type,  tax_set,  tax_yn,  mul_fromdate, mul_todate, purpose, bj_cd, jumyongName, cal_status);
				
				
				// 페이징 처리
				int	rowCol = pageing.execute(request, listCount, Integer.parseInt(strCurrentPage), 10);
				
				junggiList =  objJunggiService.junggiSearchList(sigu_cd, year,  type,  tax_set,  tax_yn,  mul_fromdate, mul_todate, purpose, bj_cd, jumyongName, cal_status, 1, listCount , "AllCal");
				
				//System.out.println("일괄 listCount == " + listCount);
				//System.out.println("일괄 junggiList.size() == " + junggiList.size());
				if( junggiList != null ){
					for(int i=0;i<junggiList.size();i++)
					{	
						jumyongBean jumyong_bean = (jumyongBean)junggiList.get(i);
						
						if(jumyong_bean.getSUM_ADJUST() != null)
							jumyong_bean.setSUM_ADJUST(insertComma2(jumyong_bean.getSUM_ADJUST()));
						if(jumyong_bean.getLAST_FROMDATE() != null){
							jumyong_bean.setLAST_FROMDATE(util.Date_Paste(jumyong_bean.getLAST_FROMDATE()));
						}else{
							jumyong_bean.setLAST_FROMDATE("-");
						}
						if(jumyong_bean.getLAST_TODATE() != null){
							jumyong_bean.setLAST_TODATE(util.Date_Paste(jumyong_bean.getLAST_TODATE()));
						}else{
							jumyong_bean.setLAST_TODATE("-");
						}
						if(jumyong_bean.getFROMDATE() != null)
							jumyong_bean.setFROMDATE(util.Date_Paste(jumyong_bean.getFROMDATE()));
						if(jumyong_bean.getTODATE() != null)
							jumyong_bean.setTODATE(util.Date_Paste(jumyong_bean.getTODATE()));
						if(jumyong_bean.getRATE() != null)
							jumyong_bean.setRATE(String.valueOf(Float.parseFloat(jumyong_bean.getRATE())));
						if(jumyong_bean.getTAX_NO() == null || "".equals(jumyong_bean.getTAX_NO()))
							jumyong_bean.setTAX_NO("-");
						
						if(jumyong_bean.getBUBUN() != null){
							jumyong_bean.setBONBUN(jumyong_bean.getBONBUN() +"-"+ jumyong_bean.getBUBUN());
						}else {
							jumyong_bean.setBONBUN(jumyong_bean.getBONBUN());
						}
						
						if(jumyong_bean.getPURPOSE_CD() != null || !"".equals(jumyong_bean.getPURPOSE_CD())){
							
							String PURPOSE_CLASSNM_ARR = getPurposeNm("5",jumyong_bean.getPURPOSE_CD());
							
							String[] PURPOSE_CLASSNM = null;
							
							if( PURPOSE_CLASSNM_ARR != null && !"".equals(PURPOSE_CLASSNM_ARR) ){
								PURPOSE_CLASSNM = PURPOSE_CLASSNM_ARR.split("@");
							}
							
							if( !"null".equals(PURPOSE_CLASSNM[0]) && !"null".equals(PURPOSE_CLASSNM[1]) ) {
								jumyong_bean.setCHECK_YN(PURPOSE_CLASSNM[1]);
							}
						}
						
						
						if("2".equals(jumyong_bean.getTAX_GUBUN().trim()) ) { //수시
							System.out.println("수시111111");						
							
							// 전년도 점용료 계산
							double sum_lastYear = 0;//jumyong_bean.getAREA() * Integer.parseInt((jumyong_bean.getPRICE())) * new Float(jumyong_bean.getRATE()).floatValue();
							float area_after = jumyong_bean.getAREA_AFTER_FLOAT();
							float price = new Float(util.nullTo(jumyong_bean.getPRICE(),"1")).floatValue();
							float rate = new Float(util.nullTo(jumyong_bean.getRATE(),"1")).floatValue();
							float reduction_rate = new Float(util.nullTo(jumyong_bean.getREDUCTION_RATE(),"0")).floatValue();
							float reduction_rate_100 = new Float(util.nullTo(jumyong_bean.getREDUCTION_RATE(),"100")).floatValue();
							float surcharge_rate = jumyong_bean.getSURCHARGE_RATE();
							if( surcharge_rate < 1 ){ surcharge_rate = 1; }
							
							if( "2".equals(jumyong_bean.getCHECK_YN().trim()) ){
								if("3".equals(jumyong_bean.getSECTION().trim())){
									sum_lastYear = area_after*price*rate*surcharge_rate*(reduction_rate_100/100);
								}else{
									sum_lastYear = area_after*price*rate*((100-reduction_rate)/100);
								}
							}else{
								if("3".equals(jumyong_bean.getSECTION().trim())){
									sum_lastYear = area_after*rate*surcharge_rate*(reduction_rate_100/100);
								}else{
									sum_lastYear = area_after*rate*((100-reduction_rate)/100);
								}
							}
							sum_lastYear = (Math.floor( sum_lastYear / 100 )) * 100;
							jumyong_bean.setSUM_ADJUST(insertComma2(String.valueOf((long)sum_lastYear)));
						
						}else if ( "1".equals(jumyong_bean.getTAX_GUBUN().trim())  ){
							System.out.println("정기111111");
							if(jumyong_bean.getSUM_ADJUST() != null)
								jumyong_bean.setSUM_ADJUST(jumyong_bean.getSUM_ADJUST());
						}
						
						
						// old_rate
						jumyong_bean.setOLD_RATE(jumyong_bean.getRATE());
						
						// check_yn에 따라서  momey, yoyul 가져오기
						String rate = "";
						if( rate == null || "".equals(rate) ){
							rate = "0.0";
						}
						//System.out.println("요율==== " + rate);
						jumyong_bean.setRATE(rate);
						
						
						// 공시지가 가져오기  
						// 1:gapan_now_price 테이블에서 찾고 없을시							
						int price = objJunggiService.getNowPrice(jumyong_bean.getGAPAN_NO(), yearVal1);							
						// 2.CP_BD_600 테이블에서 가져옴

						
						
					}// for end
					
				}
			
			
				request.setAttribute("listCount", String.valueOf(listCount));
				request.setAttribute("currentPage", strCurrentPage);
				request.setAttribute("year", year);
				request.setAttribute("mul_fromdate", util.Date_Paste(mul_fromdate));
				request.setAttribute("mul_todate", util.Date_Paste(mul_todate));
				request.setAttribute("TYPE", type);
				request.setAttribute("PURPOSE_CD", purpose);
				request.setAttribute("jumyongName", jumyongName);
				request.setAttribute("BJ_CD", bj_cd);
				request.setAttribute("REDUCTION_NAME", "감면율");
				request.setAttribute("REDUCTION_REASON_NAME", "감면사유");
				
				//String yearVal1 = year;
				request.setAttribute("PERIOD", "12");
				request.setAttribute("YEAR", yearVal1);
				request.setAttribute("FROMDATE", yearVal1+"-01-01");
				request.setAttribute("TODATE", yearVal1+"-12-31");
				request.setAttribute("TAX_DATE", util.Date_Paste(thisDate));
			
			}

		}catch(Exception e){System.out.println(e.toString());}
		
		return new ModelAndView("/gapan/junggi/junggiAllCal","blist",junggiList);
	}
	
	
	// 일괄산출  저장
	public ModelAndView junggiAllCalPrc(HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		// 삭제 세션
		HttpSession session = request.getSession();		
		String userId	= (String)session.getAttribute("sessionUserId");
		String param = "";
		String result_message = "";
		int failCnt = 0;
		String failNo = "";

		try{
			if(userId != null)
			{
				// 관리자 데이터를 가져온다.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
				// 현년도 계산
				Calendar cal = Calendar.getInstance();
				SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");			  
				String thisDate = formatter.format(cal.getTime());			
				String thisYear = thisDate.substring(0,4);
				
				
				// 세션에서 시도 코드를 가져온다.
				String SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				String sigu_cd = userBean.getSIGU_CD();
				String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
				//String year = ServletRequestUtils.getStringParameter(request,"YEAR", thisYear);
				String year_search = ServletRequestUtils.getStringParameter(request,"YEAR_search", thisYear);
				String type = ServletRequestUtils.getStringParameter(request,"TYPE","0");
				String tax_set = ServletRequestUtils.getStringParameter(request,"TAX_SET","");
				String tax_yn = ServletRequestUtils.getStringParameter(request,"TAX_YN","");
				String mul_fromdate = ServletRequestUtils.getStringParameter(request,"mul_fromdate",thisYear+"-01-01");
				String mul_todate = ServletRequestUtils.getStringParameter(request,"mul_todate",thisYear+"-12-31");
				String purpose = ServletRequestUtils.getStringParameter(request,"PURPOSE_CD","000");
				String bj_cd = ServletRequestUtils.getStringParameter(request,"BJ_CD","");
				String jumyongName = ServletRequestUtils.getStringParameter(request,"jumyongName","");
				String cal_status = ServletRequestUtils.getStringParameter(request,"cal_status","");
				
				
				// 계산 공통 param start 
				String YEAR = ServletRequestUtils.getStringParameter(request,"YEAR","");
				String FROMDATE = ServletRequestUtils.getStringParameter(request,"FROMDATE","");
				String TODATE = ServletRequestUtils.getStringParameter(request,"TODATE","");
				String PERIOD = ServletRequestUtils.getStringParameter(request,"PERIOD","");
				String TAX_DATE = ServletRequestUtils.getStringParameter(request,"TAX_DATE","");
				String INDATE = ServletRequestUtils.getStringParameter(request,"INDATE","");
				String OVERDATE = ServletRequestUtils.getStringParameter(request,"OVERDATE","");
				String SURCHARGE_RATE = ServletRequestUtils.getStringParameter(request,"SURCHARGE_RATE","");
				
				// 리스트 계산  -  배열 param start
				String[] SUM_LASTYEAR_ARR  = request.getParameterValues("SUM_LASTYEAR");
				String[] PRICE_ARR = request.getParameterValues("PRICE");
				String[] RATE_ARR = request.getParameterValues("RATE");
				String[] SUM_YEAR_ARR = request.getParameterValues("SUM_YEAR");
				String[] SUM_ADJUST_ARR = request.getParameterValues("SUM_ADJUST");
				String[] ADJUSTMENT_ARR = request.getParameterValues("ADJUSTMENT");
				String[] FORM_ARR = request.getParameterValues("FORM");
				String[] FORM_ADJUST_ARR = request.getParameterValues("FORM_ADJUST");
				String[] OVERTAX_ARR = request.getParameterValues("OVERTAX");

				String[] GAPAN_NO_ARR = request.getParameterValues("GAPAN_NO");
				String[] GP_TYP_ARR = request.getParameterValues("GP_TYP");
				String[] CHECK_YN_ARR = request.getParameterValues("CHECK_YN");
				String[] AREA_AFTER_ARR = request.getParameterValues("AREA_AFTER");
				String[] SUM_ARR = request.getParameterValues("SUM");
				String[] SECTION_ARR = request.getParameterValues("SECTION");

				String[] SIGU_CD_ARR = request.getParameterValues("SIGU_CD");
				String[] BJ_CD_ARR = request.getParameterValues("BJ_CD_ARR");
				String[] DEPT_CD_ARR = request.getParameterValues("DEPT_CD");
				String[] TAX_GUBUN_ARR = request.getParameterValues("TAX_GUBUN");
				String[] OBJ_SET_ARR = request.getParameterValues("OBJ_SET");
				String[] TAXPAYER_ID_ARR = request.getParameterValues("TAXPAYER_ID");
				String[] TAXPAYER_SET_ARR = request.getParameterValues("TAXPAYER_SET");
				String[] OCR_SIGU_CD_ARR = request.getParameterValues("OCR_SIGU_CD");
				String[] OCR_BUSEO_CD_ARR = request.getParameterValues("OCR_BUSEO_CD");
				String[] TAX_CD_ARR = request.getParameterValues("TAX_CD");
				String[] LIVE_ARR = request.getParameterValues("LIVE");
				String[] ADD_SET_ARR = request.getParameterValues("ADD_SET");
				String[] ADD_YN_ARR = request.getParameterValues("ADD_YN");
				String[] SUBUSEO_CD_ARR = request.getParameterValues("SUBUSEO_CD");
				String[] REDUCTION_RATE_ARR = request.getParameterValues("REDUCTION_RATE");
				String[] REDUCTION_REASON_ARR = request.getParameterValues("REDUCTION_REASON");
				
				
				//System.out.println("GAPAN_NO_ARR.length == " + GAPAN_NO_ARR.length);
				if( GAPAN_NO_ARR != null && !"".equals(GAPAN_NO_ARR)){
					for(int i = 0; i < GAPAN_NO_ARR.length; i++ ){
						
						if( SUM_ADJUST_ARR[i] != null && !"".equals(SUM_ADJUST_ARR[i]) ){
							
							ProductBean objProductBean = new ProductBean();
							//bind(request, objProductBean);
							
							//*********************  파라미터   check **************************
							/*System.out.println(i + "  GAPAN_NO_ARR[i]);  " + GAPAN_NO_ARR[i]);
							System.out.println(i + "  YEAR);             " + YEAR);
							System.out.println(i + "  PRICE_ARR[i]));    " + PRICE_ARR[i]);
							System.out.println(i + "  AREA_AFTER_ARR[i]  " + AREA_AFTER_ARR[i]);
							System.out.println(i + "  RATE_ARR[i]);      " + RATE_ARR[i]);
							System.out.println(i + "  SUM_LASTYEAR_ARR[  " + SUM_LASTYEAR_ARR[i]);
							System.out.println(i + "  SUM_YEAR_ARR[i]))  " + SUM_YEAR_ARR[i]);
							System.out.println(i + "  SUM_ADJUST_ARR[i]  " + SUM_ADJUST_ARR[i]);
							System.out.println(i + "  FORM_ADJUST_ARR[i  " + FORM_ADJUST_ARR[i]);
							System.out.println(i + "  FORM_ARR[i]);      " + FORM_ARR[i]);
							System.out.println(i + "  PERIOD(Integer.pa  " + PERIOD);
							System.out.println(i + "  ADJUSTMENT_ARR[i]  " + ADJUSTMENT_ARR[i]);
							System.out.println(i + "  REDUCTION_RATE_AR  " + REDUCTION_RATE_ARR[i]);
							System.out.println(i + "  REDUCTION_REASON_AR " + REDUCTION_REASON_ARR[i]);
							System.out.println(i + "  SURCHARGE_RATE  " + SURCHARGE_RATE);*/
							//***************************************************************
							
							int cal_sum_seq = 0;
							//System.out.println("해당연도 정기분 값 중복여부***** " + objJunggiService.cal_sum_exist(GAPAN_NO_ARR[i],YEAR));
							if(objJunggiService.cal_sum_exist(GAPAN_NO_ARR[i],YEAR) < 1){
						
								//cal_sum_seq 새로 생성 가져오기
								cal_sum_seq = objJumyongService.getCal_Sum_Seq();
								
								// 점용료, 부가가치세 계산
								long sum = Long.parseLong(String.valueOf(util.nullTo(SUM_ADJUST_ARR[i],"0")));	
								sum = sum/100*100;			
								long vat = sum/10 ;
								
								// 무단일때  부가가치세 '0' 
								if( "3".equals(SECTION_ARR[i]) ){
									objProductBean.setVAT("0");
								}else{
									objProductBean.setVAT(String.valueOf(vat));
								}
								
								//System.out.println("************* 공통값 셋팅 start ****************");
								// 1.2.3 공통값 셋팅
								objProductBean.setSECTION(SECTION_ARR[i]);
								objProductBean.setGAPAN_NO(GAPAN_NO_ARR[i]);
								objProductBean.setADMIN_NO(GAPAN_NO_ARR[i]);	// 점용산출쪽에 admin_no를 사용하고있음. 그래서 셋팅..
								objProductBean.setGP_TYP(GP_TYP_ARR[i]);
								objProductBean.setYEAR(YEAR);
								objProductBean.setFROMDATE( util.Date_Cut(FROMDATE));
								objProductBean.setTODATE(util.Date_Cut(TODATE));
	
								
								objProductBean.setUSE_SECTION("1");
								objProductBean.setTAX_GUBUN("1");
								//System.out.println("************* 공통값 셋팅 end ***************");
								
								
								//******************************************************************//
								// 1.CALCULATION 에 입력
								objProductBean.setCAL_SUM_SEQ(String.valueOf(cal_sum_seq));
								objProductBean.setPREV_SEQ("2");	// PREV_SEQ null아닐시 : 1. 산출전  , null 2. 산출후
								objProductBean.setFIRST_SEQ("");	// FIRST_SEQ 사용 이유가 없어서 null 셋팅
								objProductBean.setUP_DATE(thisDate);
								objJumyongService.insertProduct(objProductBean);
								//System.out.println("********* calculation_info 입력 end ************");
								//******************************************************************//
								
								
								//*************************************************************//
								// 2. cal_sum_info 에 입력
								objProductBean.setSEQ(String.valueOf(cal_sum_seq));
								objProductBean.setTAX_SEQ(String.valueOf(cal_sum_seq));
								objJumyongService.Cal_Sum_InfoInsert(objProductBean);							
								//System.out.println("********* cal_sum_info 입력 end ************");
								//*************************************************************//
								
								
								
								//*************************************************************//
								// 3. taxation_info 에 입력
								objProductBean.setTAX_DATE(util.Date_Cut(TAX_DATE));
								objProductBean.setINDATE(util.Date_Cut(INDATE));
								objProductBean.setOVERDATE(util.Date_Cut(OVERDATE));
								objProductBean.setFORM1(objProductBean.getFORM_ADJUST());
								objProductBean.setFORM2(objProductBean.getFORM());
								objProductBean.setTAX_NO("");
								objProductBean.setTAX_YM((util.Date_Cut(TAX_DATE)).substring(0,6));
								objProductBean.setSEQ(String.valueOf(cal_sum_seq));
								objProductBean.setINTAX(String.valueOf(sum));
								objProductBean.setBONSE(String.valueOf(sum));
								objProductBean.setSISE(String.valueOf(sum));
								objProductBean.setGUSE(String.valueOf(0));
								if( objProductBean.getGIGUM() == null || "".equals(objProductBean.getGIGUM()) ){objProductBean.setGIGUM("0");}
								if( objProductBean.getGUKSE() == null || "".equals(objProductBean.getGUKSE()) ){objProductBean.setGUKSE("0");}
								
								if( OVERTAX_ARR[i] != null && !"".equals(OVERTAX_ARR[i]) ){ objProductBean.setOVERTAX(util.nullTo(OVERTAX_ARR[i],"0")); }
								if( SIGU_CD_ARR[i] != null && !"".equals(SIGU_CD_ARR[i]) ){	objProductBean.setSIGU_CD(util.nullTo(SIGU_CD_ARR[i],"")); }
								if( BJ_CD_ARR[i] != null && !"".equals(BJ_CD_ARR[i]) ){ objProductBean.setBJ_CD(util.nullTo(BJ_CD_ARR[i],"")); }
								if( DEPT_CD_ARR[i] != null && !"".equals(DEPT_CD_ARR[i]) ){ objProductBean.setDEPT_CD(util.nullTo(DEPT_CD_ARR[i],"")); }							
								if( OBJ_SET_ARR[i] != null && !"".equals(OBJ_SET_ARR[i]) ){	objProductBean.setOBJ_SET(util.nullTo(OBJ_SET_ARR[i],"")); }
								if( TAXPAYER_ID_ARR[i] != null && !"".equals(TAXPAYER_ID_ARR[i]) ){ objProductBean.setTAXPAYER_ID(util.nullTo(TAXPAYER_ID_ARR[i],"")); }
								if( TAXPAYER_SET_ARR[i] != null && !"".equals(TAXPAYER_SET_ARR[i]) ){ objProductBean.setTAXPAYER_SET(util.nullTo(TAXPAYER_SET_ARR[i],"")); }
								if( OCR_SIGU_CD_ARR[i] != null && !"".equals(OCR_SIGU_CD_ARR[i]) ){ objProductBean.setOCR_SIGU_CD(util.nullTo(OCR_SIGU_CD_ARR[i],"")); }
								if( OCR_BUSEO_CD_ARR[i] != null && !"".equals(OCR_BUSEO_CD_ARR[i]) ){ objProductBean.setOCR_BUSEO_CD(util.nullTo(OCR_BUSEO_CD_ARR[i],"")); }
								if( TAX_CD_ARR[i] != null && !"".equals(TAX_CD_ARR[i]) ){ objProductBean.setTAX_CD(util.nullTo(TAX_CD_ARR[i],"")); }
								if( LIVE_ARR[i] != null && !"".equals(LIVE_ARR[i]) ){ objProductBean.setLIVE(util.nullTo(LIVE_ARR[i],"")); }
								if( ADD_SET_ARR[i] != null && !"".equals(ADD_SET_ARR[i]) ){ objProductBean.setADD_SET(util.nullTo(ADD_SET_ARR[i],""));	}
								if( ADD_YN_ARR[i] != null && !"".equals(ADD_YN_ARR[i]) ){ objProductBean.setADD_YN(util.nullTo(ADD_YN_ARR[i],"")); }
								if( SUBUSEO_CD_ARR[i] != null && !"".equals(SUBUSEO_CD_ARR[i]) ){ objProductBean.setSUBUSEO_CD(util.nullTo(SUBUSEO_CD_ARR[i],"")); }
								
								objJunggiService.executeBugwa_Register(objProductBean);							
								//System.out.println("********* taxation_info 입력 end ************");
								//**************************************************************//
								
								objJunggiService.SetCal_Sum_Info_taxseq(String.valueOf(cal_sum_seq));
								
							
							
							}// 중복여부 true end
							else{
								failCnt++;
								failNo += "'"+GAPAN_NO_ARR[i]+"' ";
							}// 중복여부 false end
						}// SUM_ADJUST_ARR
					}// GAPAN_NO_ARR   for end
				}// GAPAN_NO_ARR null  if end
				
				param = "?year="+year_search+"&currentPage="+strCurrentPage+"&type="+type+"&tax_set="+tax_set+"&tax_yn="+tax_yn+"&mul_fromdate="+mul_fromdate
				+"&mul_todate="+mul_todate+"&purpose_cd="+purpose+"&bj_cd="+bj_cd+"&jumyongName="+jumyongName+"&cal_status="+cal_status;
				
			}
		

		}catch(Exception e){
			System.out.println(e.toString());
			result_message = e.toString();//"정기분 산출에서 오류가 발생 ";
		}
		
		if( result_message == null || "".equals(result_message) ){
			
			if( failCnt > 0 ){
				result_message = "이미 산출된 정기분이 "+failCnt+"건 있습니다. (이미 산출된 관리번호:"+failNo+")  그 외의 건만 저장되었습니다. ";
			}else{
				result_message = "저장되었습니다. ";
			}
			
		}
		
		System.out.println("result_message== " + result_message);
		return new ModelAndView("redirect:/gapan/junggi/search.do"+param+"&message="+result_message);
	}


	
	
	
}