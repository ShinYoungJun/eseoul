//	2009		Kim Yun Seo

package main.java.junggi.gigan.web;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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

public class TabAnnae_Control	extends MultiActionController
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
	
	
	public ModelAndView 	Annae_View(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		Search_Data(request, response);
		
		//	관리자 데이터를 가져온다.
		UserBean	userBean	= new UserBean();
		userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
		
		if(userBean	!= null)
		{
		//	System.out.println(userBean.getNAME());
			
			request.setAttribute("MANAGER", userBean.getNAME());
			request.setAttribute("TEL", userBean.getTEL());
			request.setAttribute("GU_NM", userBean.getGU_NM());
			request.setAttribute("DEPT_NM", userBean.getDEPT_NM());
		}
		
		return new ModelAndView("/junggi/gigan/tab/annae_view");
	}
	
	
	public ModelAndView 	Annae_Print(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		Annae_Data(request, response);

	//	Map modelMap = new HashMap();
	//	modelMap.put("adminNo", ADMIN_NO);
		
	//	response.setHeader("Content-Disposition", "attachment;filename=점용기간연장(안내문).htm");
		
		return new ModelAndView("/junggi/gigan/annae_print");
	}
	
	
	public ModelAndView 	Annae_All_Print(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		Annae_Data(request, response);
		Search_Data(request, response);
	
	//	Map modelMap = new HashMap();
	//	modelMap.put("adminNo", ADMIN_NO);
		
	//	response.setHeader("Content-Disposition", "attachment;filename=점용기간연장(안내문).htm");
		
		return new ModelAndView("/junggi/gigan/annae_all_print");
	}
	
	
	public void	 	Annae_Data(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		String 	ADMIN_NO 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
		String 	YEAR 		= ServletRequestUtils.getStringParameter(request, "YEAR", "");
		String 	MONTH 		= ServletRequestUtils.getStringParameter(request, "MONTH", "");
		String 	FROMDATE 	= ServletRequestUtils.getStringParameter(request, "FROMDATE", "");
		String 	TODATE 		= ServletRequestUtils.getStringParameter(request, "TODATE", "");
		String 	MANAGER 	= ServletRequestUtils.getStringParameter(request, "MANAGER", "");
		String 	TEL 		= ServletRequestUtils.getStringParameter(request, "TEL", "");
		String 	ENDDATE 	= ServletRequestUtils.getStringParameter(request, "ENDDATE", "");
		String 	DEPT	 	= ServletRequestUtils.getStringParameter(request, "DEPT", "");
		String 	NOTES	 	= ServletRequestUtils.getStringParameter(request, "NOTES", "");
		
		request.setAttribute("ADMIN_NO", ADMIN_NO);
		request.setAttribute("YEAR", YEAR);
		request.setAttribute("MONTH", MONTH);
		request.setAttribute("FROMDATE", FROMDATE);
		request.setAttribute("TODATE", TODATE);
		request.setAttribute("MANAGER", MANAGER);
		request.setAttribute("TEL", TEL);
		request.setAttribute("ENDDATE", ENDDATE);
		request.setAttribute("DEPT", DEPT);
		request.setAttribute("NOTES", NOTES);
		
//		System.out.println("ADMIN_NO : " + ADMIN_NO);
//		System.out.println("YEAR : " + YEAR);
//		System.out.println("MONTH : " + MONTH);
//		System.out.println("FROMDATE : " + FROMDATE);
//		System.out.println("TODATE : " + TODATE);
//		System.out.println("MANAGER : " + MANAGER);
//		System.out.println("TEL : " + TEL);
//		System.out.println("ENDDATE : " + ENDDATE);
//		System.out.println("DEPT : " + DEPT);
//		System.out.println("NOTES : " + NOTES);
	}
	
	
	public void	 	Search_Data(HttpServletRequest request, HttpServletResponse response) throws Exception 
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
		
    	if(TYPE.equals("")	||	TYPE == null)
    		TYPE="%";
    	if(OWNER_SET.equals("")	||	OWNER_SET == null)
    		OWNER_SET="%";
    	if(TAX_SET.equals("")	||	TAX_SET == null)
    		TAX_SET="%";
    	if(PURPOSE_CD.equals("000")	||	PURPOSE_CD.equals("")	||	PURPOSE_CD == null)
    		PURPOSE_CD	= "%";
    	if(BJ_CD.equals("")	||	BJ_CD == null)
    		BJ_CD="%";
    	if(HJ_CD.equals("")	||	HJ_CD == null)
    		HJ_CD="%";
    	
    	if(BONBUN.equals("")	||	BONBUN.equals("%")	||	BONBUN == null)
    		BONBUN	= "%";
    	else
    		BONBUN = "%" + BONBUN + "%";
    	
    	if(BUBUN.equals("")	||	BUBUN.equals("%")	||	BUBUN == null)
    		BUBUN	= "%";
    	else
    		BUBUN = "%" + BUBUN + "%";
    	
    	if(NAME.equals("")	||	NAME.equals("%")	||	NAME == null)
    		NAME	= "%";
    	else
    		NAME = "%" + NAME + "%";
    	
    	if(ADMIN_NO.equals("")	||	ADMIN_NO.equals("%")	||	ADMIN_NO == null)
    		ADMIN_NO	= "%";
    	else
    		ADMIN_NO = "%" + ADMIN_NO + "%";
    	
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
	
/*
select T1.*,
	(select NAME from REF_COMMONCODE where CODE=T1.TYPE and TYPE='use_type') TYPE_NM,
	(select BJ_NM from REF_DONGCODE where BJ_CD=T1.BJ_CD and SI_CD=T1.SIDO and GU_CD=T1.SIGUNGU group by BJ_NM) BJ_NM,
	(select KIND_NM from REF_PURPOSECODE where CODE=T1.PURPOSE_CD and SECTION=T1.TYPE and rownum=1) PURPOSE_NM,
	(select AREA_AFTER from CALCULATION_INFO where SEQ=(select MAX(SEQ) from CALCULATION_INFO where ADMIN_NO=T1.ADMIN_NO)) AREA
from(
 select A.ADMIN_NO, A.TOADDR1, A.TOADDR2, P.TYPE, P.SIDO, P.SIGUNGU, P.BJ_CD, P.BONBUN, P.BUBUN, 
 		P.PURPOSE_CD, A.NAME, P.MUL_FROMDATE, P.MUL_TODATE,
		DECODE(P.SAN_CK, null, '', '산') SAN_CK
	from APPEAL A, PLACE P
	where A.ADMIN_NO=P.ADMIN_NO
	and A.ADMIN_NO='200911680107-1-0001'
)T1
 */
	
/*
select T1.*,
	(select NAME from REF_COMMONCODE where CODE=T1.TYPE and TYPE='use_type') TYPE_NM,
	(select BJ_NM from REF_DONGCODE where BJ_CD=T1.BJ_CD and SI_CD=T1.SIDO and GU_CD=T1.SIGUNGU group by BJ_NM) BJ_NM,
	(select KIND_NM from REF_PURPOSECODE where CODE=T1.PURPOSE_CD and SECTION=T1.TYPE and rownum=1) PURPOSE_NM,
	(select AREA_AFTER from CALCULATION_INFO where SEQ=(select MAX(SEQ) from CALCULATION_INFO where ADMIN_NO=T1.ADMIN_NO)) AREA
from(
 select A.ADMIN_NO, A.TOADDR1, A.TOADDR2, P.TYPE, P.SIDO, P.SIGUNGU, P.BJ_CD, P.BONBUN, P.BUBUN, 
 		P.PURPOSE_CD, A.NAME, P.MUL_FROMDATE, P.MUL_TODATE,
		DECODE(P.SAN_CK, null, '', '산') SAN_CK
	from APPEAL A, PLACE P
	where A.ADMIN_NO=P.ADMIN_NO
	and P.TYPE like '%'
	and P.OWNER_SET like '%'
	and P.TAX_SET like '%'
	and A.REQ_DATE >= '20090101'
	and A.REQ_DATE <= '20091212'
	and P.PURPOSE_CD like '%'
	and P.ADMIN_NO like '%'
	and A.NAME like '%'
	and P.BJ_CD like '%'
	and P.HJ_CD like '%'
	and P.BONBUN like '%'
	and P.BUBUN like '%'
	order by P.MUL_TODATE DESC
)T1
 */
}
