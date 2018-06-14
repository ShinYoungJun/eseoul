//	2009		Kim Yun Seo
//	기간연장처리-일괄처리-기간연장

package main.java.junggi.gigan.web;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.java.common.util.catUtil.Pageing;
import main.java.common.util.catUtil.Util;
import main.java.common.commonCode.model.UserBean;
import main.java.common.commonCode.service.CommonCodeService;
import main.java.junggi.gigan.model.AppealBean;
import main.java.junggi.gigan.model.GiganBean;
import main.java.junggi.gigan.model.GiganSearchBean;
import main.java.junggi.gigan.model.GiyeonBean;
import main.java.junggi.gigan.service.IGiganService;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;


public class TabGiganIlgwal_Control	extends MultiActionController
{
	private	IGiganService		iGiganervice	= null;
	private	CommonCodeService	commonCode		= null;
	private	Util				util			= new Util();
	private	Pageing				pageing			= new Pageing();
	

	public void setJunggi_giganService(IGiganService junggi_giganService) 
	{
		this.iGiganervice = junggi_giganService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode)
	{
		this.commonCode 	= commonCode;
	}
	
	
	public ModelAndView 	GiganIlgwal_View(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		SimpleDateFormat	formatter 	= new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA );
		Calendar 			cal 		= Calendar.getInstance();
		String	today		= formatter.format(cal.getTime());
		
		Search_Date(request, response);
		
		//	관리자 데이터를 가져온다.
		UserBean	userBean	= new UserBean();
		userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
		
		if(userBean	!= null)
		{
			request.setAttribute("MANAGER", userBean.getNAME());
		}
		
		request.setAttribute("EXT_REGDATE", util.Date_Paste(today));
		
		return new ModelAndView("/junggi/gigan/tab/giganilgwal_view");
	}
	
	
	public ModelAndView 	GiganIlgwal_Ext(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
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
	
		boolean	result	= iGiganervice.executeGigan_All_Register(giyeonBean, giganSearchBean);//	이력 추가
		
		if(result)
			iGiganervice.executeGigan_All_Ext(giyeonBean, giganSearchBean);	//	점용지 정보 변경
		
	//	Search_Date(request, response);
		
		return GiganIlgwal_View(request, response);//new ModelAndView("/junggi/gigan/tab/giganilgwal_view");
	}
	
	
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
		String 	OWNER_SET	= ServletRequestUtils.getStringParameter(request, "OWNER_SET", "");
		String 	TAX_SET	 	= ServletRequestUtils.getStringParameter(request, "TAX_SET", "");
		String 	BJ_CD	 	= ServletRequestUtils.getStringParameter(request, "BJ_CD", "");
		String 	HJ_CD	 	= ServletRequestUtils.getStringParameter(request, "HJ_CD", "");
		
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
