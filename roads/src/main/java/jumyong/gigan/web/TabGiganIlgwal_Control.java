//	2009		Kim Yun Seo
//	기간연장처리-일괄처리-기간연장

package main.java.jumyong.gigan.web;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.common.util.catUtil.Pageing;
import main.java.common.util.catUtil.Util;
import main.java.common.commonCode.model.UserBean;
import main.java.common.commonCode.service.CommonCodeService;
import main.java.jumyong.gigan.model.AppealBean;
import main.java.jumyong.gigan.model.GiganBean;
import main.java.jumyong.gigan.model.GiganSearchBean;
import main.java.jumyong.gigan.model.GiyeonBean;
import main.java.jumyong.gigan.service.IGiganService;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;


public class TabGiganIlgwal_Control	extends MultiActionController
{
	private	IGiganService		iGiganervice	= null;
	private	CommonCodeService	commonCode		= null;
	private	Util				util			= new Util();
	private	Pageing				pageing			= new Pageing();
	

	public void setJumyong_giganService(IGiganService jumyong_giganService) 
	{
		this.iGiganervice = jumyong_giganService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode)
	{
		this.commonCode 	= commonCode;
	}
	
	//	기간연장 일괄처리
	public ModelAndView 	GiganIlgwal_View(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");	
		
		try{
			if(userId != null)
			{
				SimpleDateFormat	formatter 	= new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA );
				Calendar 			cal 		= Calendar.getInstance();
				String	today		= formatter.format(cal.getTime());
				
				//	검색 조건 저장
				Search_Date(request, response);
				
				//	관리자 데이터를 가져온다.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
				//	관리자 데이터 화면에 출력
				if(userBean	!= null)
				{
					request.setAttribute("MANAGER", userBean.getNAME());
				}
				
				request.setAttribute("EXT_REGDATE", util.Date_Paste(today));
			}
		}catch(Exception e){
			System.out.println("error:"+e.toString());
		}
		return new ModelAndView("/jumyong/gigan/tab/giganilgwal_view");
	}
	
	//	기간연장 일관처리 실행
	public ModelAndView 	GiganIlgwal_Ext(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
//		관리자 데이터를 가져온다.
		UserBean	userBean	= new UserBean();
		userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
		
	//	String 	ADMIN_NO 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
		String 	MANAGER 	= ServletRequestUtils.getStringParameter(request, "MANAGER", "");
		String 	REGDATE 	= ServletRequestUtils.getStringParameter(request, "EXT_REGDATE", "");
		String 	FROMDATE 	= ServletRequestUtils.getStringParameter(request, "EXT_FROMDATE", "");
		String 	TODATE	 	= ServletRequestUtils.getStringParameter(request, "EXT_TODATE", "");
		String 	NOTES	 	= ServletRequestUtils.getStringParameter(request, "EXT_NOTES", "");
		
		REGDATE		= util.Date_Cut(REGDATE);
		FROMDATE	= util.Date_Cut(FROMDATE);
		TODATE		= util.Date_Cut(TODATE);
		
		GiyeonBean	giyeonBean	= new GiyeonBean();
		
	//	giyeonBean.setADMIN_NO(ADMIN_NO);
		giyeonBean.setREGDATE(REGDATE);
		giyeonBean.setAFTER_FROMDATE(FROMDATE);
		giyeonBean.setAFTER_TODATE(TODATE);
		giyeonBean.setNOTES(NOTES);
		giyeonBean.setMANAGER(MANAGER);
		
		GiganSearchBean	giganSearchBean	= new GiganSearchBean();
	
		bind(request, giyeonBean);
		bind(request, giganSearchBean);
		
		giganSearchBean.setSIGUNGU(userBean.getSIGU_CD());
		
//		System.out.println("GIGAN1 : " + giganSearchBean.getGIGAN1());
//		System.out.println("GIGAN2 : " + giganSearchBean.getGIGAN2());
//		System.out.println("PURPOSE_CD : " + giganSearchBean.getPURPOSE_CD());
//		System.out.println("BONBUN : " + giganSearchBean.getBONBUN());
//		System.out.println("BUBUN : " + giganSearchBean.getBUBUN());
//		System.out.println("NAME : " + giganSearchBean.getNAME());
//		System.out.println("ADMINNO : " + giganSearchBean.getADMINNO());
//		System.out.println("TYPE : " + giganSearchBean.getTYPE());
//		System.out.println("OWNER_SET : " + giganSearchBean.getOWNER_SET());
//		System.out.println("TAX_SET : " + giganSearchBean.getTAX_SET());
//		System.out.println("BJ_CD : " + giganSearchBean.getBJ_CD());
//		System.out.println("HJ_CD : " + giganSearchBean.getHJ_CD());	
	System.out.println("giganSearchBean:"+giganSearchBean.getPURPOSE_CD());
	System.out.println("시군구 코드:"+giganSearchBean.getSIGUNGU());
		//	기간 연장 이력정보 전체 추가
		boolean	result	= iGiganervice.executeGigan_All_Register(giyeonBean, giganSearchBean);
		
		//	점용지 정보의 기간연장 전체 수정
		if(result)
			iGiganervice.executeGigan_All_Ext(giyeonBean, giganSearchBean);
		
	//	Search_Date(request, response);
		
		return GiganIlgwal_View(request, response);
		//return new ModelAndView("/jumyong/gigan/search");
	}
	
	//	검색 조건 저장
	public void	 	Search_Date(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		String 	GIGAN1	 	= ServletRequestUtils.getStringParameter(request, "GIGAN1", "");
		String 	GIGAN2	 	= ServletRequestUtils.getStringParameter(request, "GIGAN2", "");
		String 	PURPOSE_CD 	= ServletRequestUtils.getStringParameter(request, "PURPOSE_CD", "");
		String 	BONBUN	 	= ServletRequestUtils.getStringParameter(request, "BONBUN", "");
		String 	BUBUN	 	= ServletRequestUtils.getStringParameter(request, "BUBUN", "");
		String 	NAME	 	= ServletRequestUtils.getStringParameter(request, "NAME", "");
		String 	ADMIN_NO	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
		String 	TYPE	 	= ServletRequestUtils.getStringParameter(request, "TYPE", "");
		String 	SECTION	 	= ServletRequestUtils.getStringParameter(request, "SECTION", "");
		String 	OWNER_SET	= ServletRequestUtils.getStringParameter(request, "OWNER_SET", "");
		String 	TAX_SET	 	= ServletRequestUtils.getStringParameter(request, "TAX_SET", "");
		String 	BJ_CD	 	= ServletRequestUtils.getStringParameter(request, "BJ_CD", "");
		String 	HJ_CD	 	= ServletRequestUtils.getStringParameter(request, "HJ_CD", "");
		
		
// 	 점용목적 조건 
    	String str1 = "";
    	String str2 = "";
    	String str3 = "";
    	if(PURPOSE_CD.length()>1){
	    	str1 = PURPOSE_CD.substring(0,1);
	    	str2 = PURPOSE_CD.substring(1,2);
	    	str3 = PURPOSE_CD.substring(2,3);
    	}

    	if(PURPOSE_CD.equals("")	||	PURPOSE_CD == null || PURPOSE_CD.length() == 0){  
    		PURPOSE_CD = "%";
    	}else if(str3.equals("0")){
    		if(str2.equals("0")){
    			PURPOSE_CD = str1 + "%";
    		}else{
    			PURPOSE_CD = str1 + str2 + "%";
    		}
    	}
		
//    	if(TYPE.equals("")	||	TYPE == null)
//    		TYPE="%";
//    	if(OWNER_SET.equals("")	||	OWNER_SET == null)
//    		OWNER_SET="%";
//    	if(TAX_SET.equals("")	||	TAX_SET == null)
//    		TAX_SET="%";
//    	if(PURPOSE_CD.equals("000")	||	PURPOSE_CD.equals("")	||	PURPOSE_CD == null)
//    		PURPOSE_CD	= "%";
//    	if(BJ_CD.equals("")	||	BJ_CD == null)
//    		BJ_CD="%";
//    	if(HJ_CD.equals("")	||	HJ_CD == null)
//    		HJ_CD="%";
//    	
//    	if(BONBUN.equals("")	||	BONBUN.equals("%")	||	BONBUN == null)
//    		BONBUN	= "%";
//    	else
//    		BONBUN = "%" + BONBUN + "%";
//    	
//    	if(BUBUN.equals("")	||	BUBUN.equals("%")	||	BUBUN == null)
//    		BUBUN	= "%";
//    	else
//    		BUBUN = "%" + BUBUN + "%";
//    	
//    	if(NAME.equals("")	||	NAME.equals("%")	||	NAME == null)
//    		NAME	= "%";
//    	else
//    		NAME = "%" + NAME + "%";
//    	
//    	if(ADMIN_NO.equals("")	||	ADMIN_NO.equals("%")	||	ADMIN_NO == null)
//    		ADMIN_NO	= "%";
//    	else
//    		ADMIN_NO = "%" + ADMIN_NO + "%";
    	
		request.setAttribute("GIGAN1", GIGAN1);
		request.setAttribute("GIGAN2", GIGAN2);
		request.setAttribute("PURPOSE_CD", PURPOSE_CD);
		request.setAttribute("BONBUN", BONBUN);
		request.setAttribute("BUBUN", BUBUN);
		request.setAttribute("NAME", NAME);
		request.setAttribute("ADMIN_NO", ADMIN_NO);
		request.setAttribute("TYPE", TYPE);
		request.setAttribute("SECTION", SECTION);
		request.setAttribute("OWNER_SET", OWNER_SET);
		request.setAttribute("TAX_SET", TAX_SET);
		request.setAttribute("BJ_CD", BJ_CD);
		request.setAttribute("HJ_CD", HJ_CD);
		
//		System.out.println("GIGAN1 : " + GIGAN1);
//		System.out.println("GIGAN2 : " + GIGAN2);
//		System.out.println("PURPOSE_CD : " + PURPOSE_CD);
//		System.out.println("BONBUN : " + BONBUN);
//		System.out.println("BUBUN : " + BUBUN);
//		System.out.println("NAME : " + NAME);
//		System.out.println("ADMIN_NO : " + ADMIN_NO);
//		System.out.println("TYPE : " + TYPE);
//		System.out.println("OWNER_SET : " + OWNER_SET);
//		System.out.println("TAX_SET : " + TAX_SET);
//		System.out.println("BJ_CD : " + BJ_CD);
//		System.out.println("HJ_CD : " + HJ_CD);		
	}
	
}
