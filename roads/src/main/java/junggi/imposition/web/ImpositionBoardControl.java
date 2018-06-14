/***********************************
 * 수정일 : 2007.9.27
 * 최종수정자 : 최진용
 * 수정내용 :
 ***********************************/

package main.java.junggi.imposition.web;

import main.java.common.commonCode.model.UserBean;
import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.util.BoardUtil;
import main.java.common.util.Globals;
import main.java.common.util.catUtil.Util;

import java.net.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import main.java.jumyong.jumyong.model.jumyongBean;
import main.java.jumyong.saewe.model.SaeweBean;
import main.java.jumyong.saewe.model.TaxationBean;
import main.java.jumyong.saewe.service.ISaeweService;
import main.java.junggi.imposition.service.*;

public class ImpositionBoardControl extends MultiActionController {
	
  	/**
  	 * QABoard 리스트 조회 (login 안한상태에 보이는 리스트)
	 * @param HttpServletRequest request
	 * @param HttpServletResponce responce
	 * @return ModelAndView
	 */
	
	private IImpositionService objImpositionService = null;
	private	CommonCodeService	commonCode		= null;	
	private	ISaeweService		iSaeweService	= null;
	private	Util				util			= new Util();
	
	
	public void setImpositionService (ImpositionService newObjImpositionService)
	{
		this.objImpositionService = newObjImpositionService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode) 
	{
		this.commonCode 	= commonCode;
	}
	
	public void setSaeweService(ISaeweService saeweService) 
	{
		this.iSaeweService = saeweService;
	}
	
	public ModelAndView impositionList(HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		//		세션에서 시도 코드를 가져온다.
		String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
		
		//	관리자 데이터를 가져온다.
		UserBean	userBean	= new UserBean();
		userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));

		
		String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
			
		String type = ServletRequestUtils.getStringParameter(request,"type","0");
		String check_type = ServletRequestUtils.getStringParameter(request,"check_type","");
		String taxation_yn = ServletRequestUtils.getStringParameter(request,"taxation_yn","");
		String tax_set = ServletRequestUtils.getStringParameter(request,"tax_set","");
		String purpose = ServletRequestUtils.getStringParameter(request,"purpose","000");		
		
		
		String numberValue = ServletRequestUtils.getStringParameter(request,"numberValue","");
		String jumyongName = ServletRequestUtils.getStringParameter(request,"jumyongName","");
		
		
		String bj_cd = ServletRequestUtils.getStringParameter(request,"bj_cd","");
		String hj_cd = ServletRequestUtils.getStringParameter(request,"hj_cd","");
		
		
		String bonbun = ServletRequestUtils.getStringParameter(request,"bonbun","");
		String bubun = ServletRequestUtils.getStringParameter(request,"bubun","");
		
		System.out.println(insertComma2("544855"));
		
		//일반 코드.	
		
		request.setAttribute("use_type", commonCode.executeCommonCode("use_type", type, "선택하세요"));
		request.setAttribute("taxation_yn", commonCode.executeCommonCode("taxation_yn", taxation_yn, "선택하세요"));
		request.setAttribute("taxation_section", commonCode.executeCommonCode("taxation_section", tax_set, "선택하세요"));
		request.setAttribute("check_type", commonCode.executeCommonCode("check_type", check_type, "선택하세요"));
		
		
		//request.setAttribute("bjdong_code", commonCode.CommonBJDongCodeSearch("서울", "강남구", bj_cd));	//	법정동
		//request.setAttribute("hjdong_code", commonCode.CommonHJDongCodeSearch("서울", "강남구", hj_cd));	//	행정동
		
		request.setAttribute("bjdong_code", commonCode.CommonBJDongCodeSearch(SIDO_CD, userBean.getSIGU_CD(), bj_cd));	//	법정동
		request.setAttribute("hjdong_code", commonCode.CommonHJDongCodeSearch(SIDO_CD, userBean.getSIGU_CD(), hj_cd));	//	행정동
		
		
		
		
		request.setAttribute("numberValue", numberValue);
		request.setAttribute("jumyongName", jumyongName);
		
		request.setAttribute("bonbun", bonbun);
		request.setAttribute("bubun", bubun);
		
		System.out.println("rnqns"+taxation_yn);
		
//		현년도 계산								
		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");			  
		String thisDate = formatter.format(cal.getTime());			
		String thisYear = thisDate.substring(0,4);
		
		
		String year = ServletRequestUtils.getStringParameter(request,"year",thisYear);	//year없을시 현년도로..	
		request.setAttribute("year", year);
		
		if(strCurrentPage.equals(""))
			strCurrentPage = "1090";
		
		List junggiList =  objImpositionService.junggiSearchList(year, type, check_type, taxation_yn, tax_set, purpose, numberValue
	    		,jumyongName, bj_cd,hj_cd,bonbun,bubun, Integer.parseInt(strCurrentPage),10);
		
		for(int i=0;i<junggiList.size();i++)
		{
			jumyongBean objJumyongBean = new jumyongBean();
			
			((jumyongBean)junggiList.get(i)).setSUM_ADJUST(insertComma2(((jumyongBean)junggiList.get(i)).getSUM_ADJUST()));
			((jumyongBean)junggiList.get(i)).setSUM_LASTYEAR(insertComma2(((jumyongBean)junggiList.get(i)).getSUM_LASTYEAR()));
			((jumyongBean)junggiList.get(i)).setSUM_YEAR(insertComma2(((jumyongBean)junggiList.get(i)).getSUM_YEAR()));			
			
		}
		
		
		
//		리스트의 페이징 html 
		//	(int intCurrentPage, int intCountPerPage,  String strSearchType, String strKeyword, String strActionUrl, int intTotCount) {
		
		int listCount = objImpositionService.getJunggiSearchListCount(year, type, check_type, taxation_yn, tax_set
				, purpose, numberValue,jumyongName, bj_cd,hj_cd,bonbun,bubun);
		
		String strPageDivideForm = BoardUtil.getDividePageForm(Integer.parseInt(strCurrentPage),4, "type="+type+"&check_type="+check_type+"&taxation_yn="+taxation_yn+"&tax_set="+tax_set+"&purpose="+purpose+"&numberValue="
				+numberValue+"&jumyongName="+jumyongName+"&bj_cd="+bj_cd+"&hj_cd="+hj_cd+"&bonbun="+bonbun+"&bubun="+bubun+"&year="+year
		, ""
		, "/junggi/imposition/search.do", listCount);
		
		System.out.println("listCount"+listCount);
		
		request.setAttribute("strPageDivideForm", strPageDivideForm);		
		request.setAttribute("listCount", String.valueOf(listCount));
		
		
		
		
		
		
		
		
		
		if(taxation_yn.equals("0") && junggiList.size() >0)
			request.setAttribute("showBatch", "true");
		else
			request.setAttribute("showBatch", "false");
		
		System.out.println("크기는"+junggiList.size());
			
		return new ModelAndView("/junggi/imposition/search","blist",junggiList);
	}
	
	
	public ModelAndView 	View(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		String 	ADMIN_NO 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
	//	String 	TAX_SET 	= ServletRequestUtils.getStringParameter(request, "TAX_SET", "");
		
	//	request.setAttribute("TAX_SET", TAX_SET);
		
		return new ModelAndView("/junggi/imposition/view", "ADMIN_NO", ADMIN_NO);
	}
	
//	부과정보 상세보기
	public ModelAndView 	Bugwa_View(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{	
		String 	ADMIN_NO 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
		String 	SEQ 		= ServletRequestUtils.getStringParameter(request, "SEQ", "");
	//	String 	TAX_SET 	= ServletRequestUtils.getStringParameter(request, "TAX_SET", "");
		
		List		list 	= iSaeweService.executeBugwa_View(ADMIN_NO, SEQ);
		
		TaxationBean	Bean	= new TaxationBean();
		
		if(SEQ == null	||	SEQ.trim().equals(""))	//	산출정보가 하나도 없을경우 빈화면 출력
			return new ModelAndView("/jumyong/saewe/tab/bugwa_view_sample");
		
		if(list.size()<=0)
			return	Bugwa_Register(request, response);//Bean	= null;
		else
		{
			Bean	= (TaxationBean)list.get(0);
			
			List	data	= iSaeweService.executeBugwa_DataInfo(ADMIN_NO, SEQ);
			SaeweBean	saeweBean	= new SaeweBean();
			saeweBean	= (SaeweBean)data.get(0);
			
			request.setAttribute("TAX_SET", commonCode.executeSearchCommonCode("taxation_part", Bean.getTAX_SET()));
			request.setAttribute("TAX_CD", commonCode.executeSearchTaxCode(saeweBean.getTAX_SET(), Bean.getTAX_CD()));
			request.setAttribute("LIVE", commonCode.executeSearchCommonCode("taxpayer_residence", Bean.getLIVE()));
			request.setAttribute("OBJ_SET", commonCode.executeSearchCommonCode("object_type", Bean.getOBJ_SET()));
			request.setAttribute("TAXPAYER_SET", commonCode.executeSearchCommonCode("taxpayer_group", Bean.getTAXPAYER_SET()));
			request.setAttribute("TAX_YN", Bean.getTAX_YN());
			
			Bean.setBONSE(util.Comma_Paste(Bean.getBONSE()));			//	본세
			Bean.setVAT(util.Comma_Paste(Bean.getVAT()));				//	부가가치세
			Bean.setINTAX(util.Comma_Paste(Bean.getINTAX()));			//	납기내금액
			Bean.setOVERTAX(util.Comma_Paste(Bean.getOVERTAX()));		//	납기후금액
//			Bean.setLIMIT_SUM(util.Comma_Paste(Bean.getLIMIT_SUM()));	//	적용 상한율
//			Bean.setRATE(util.Comma_Paste(Bean.getRATE()));				//	특별이율
			Bean.setGIGUM(util.Comma_Paste(Bean.getGIGUM()));			//	기금
			Bean.setGUKSE(util.Comma_Paste(Bean.getGUKSE()));			//	국세
			Bean.setGUSE(util.Comma_Paste(Bean.getGUSE()));				//	구세
			
			if(Bean.getTAX_YM()	!= null)
			{
				String	ym	= Bean.getTAX_YM();
				if(Bean.getTAX_YM().length() == 6)
				{
					request.setAttribute("tax_year", ym.substring(0, 4));
					request.setAttribute("tax_month", ym.substring(4, 6));
				}
			}
		}
		
		request.setAttribute("ADMIN_NO", ADMIN_NO);
		request.setAttribute("SEQ", SEQ);
		
		return new ModelAndView("/jumyong/saewe/tab/bugwa_view", "board", Bean);
	}
	
//	부과정보 입력하기
	public ModelAndView 	Bugwa_Register(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
	//	System.out.println("!! Bugwa_Register");
		
		String 	ADMIN_NO	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
		String 	SEQ 		= ServletRequestUtils.getStringParameter(request, "SEQ", "");
		
		if(SEQ == null	||	SEQ.trim().equals(""))	//	ERROR
		{
			return new ModelAndView("/jumyong/saewe/tab/bugwa_register");
		}
		
	//	System.out.println("!! ADMIN_NO :" + ADMIN_NO);
	//	System.out.println("!! SEQ :" + SEQ);
		
		List	list	= iSaeweService.executeBugwa_DataInfo(ADMIN_NO, SEQ);
		
		SaeweBean	Bean	= new SaeweBean();

		if(list.size()<=0)
			Bean	= null;
		else
		{
			Bean	= (SaeweBean)list.get(0);
			
		//	System.out.println("!! Bean.getTAX_SET() :" + Bean.getTAX_SET());
			
			request.setAttribute("taxation_part", commonCode.executeCommonCode("taxation_part", null, "선택하세요"));				//	과세구분
			request.setAttribute("taxcode", commonCode.executeTaxCode(Bean.getTAX_SET(), null, "선택하세요"));						//	세목코드
			request.setAttribute("taxpayer_residence", commonCode.executeCommonCode("taxpayer_residence", null, "선택하세요"));	//	거주상태
			request.setAttribute("object_type", commonCode.executeCommonCode("object_type", null, "선택하세요"));					//	물건구분
			request.setAttribute("taxpayer_group", commonCode.executeCommonCode("taxpayer_group", null, "선택하세요"));			//	납세자 구분

		//	System.out.println("!! getADMIN_NO : " + Bean.getADMIN_NO());
			
			request.setAttribute("SUM_YEAR", util.Comma_Paste(Bean.getSUM_YEAR()));
			request.setAttribute("VAT", util.Comma_Paste(Bean.getVAT()));
			
		//	System.out.println("!! getADMIN_NO : " + Bean.getSUM_YEAR());
		}
		
		request.setAttribute("ADMIN_NO", ADMIN_NO);
		request.setAttribute("SEQ", SEQ);

		return new ModelAndView("/jumyong/saewe/tab/bugwa_register");
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
	
}