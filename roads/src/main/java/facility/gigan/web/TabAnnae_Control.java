
package main.java.facility.gigan.web;


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
import main.java.facility.gigan.model.GiganBean;
import main.java.facility.gigan.model.GiganSearchBean;
import main.java.facility.gigan.model.GiyeonBean;
import main.java.facility.gigan.service.IGiganService;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class TabAnnae_Control	extends MultiActionController
{
	private	IGiganService		iGiganervice	= null;
	private	CommonCodeService	commonCode		= null;
	private	Util				util			= new Util();
	private	Pageing				pageing			= new Pageing();
	
	
	public void setFacility_giganService(IGiganService facility_giganService) 
	{
		this.iGiganervice = facility_giganService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode)
	{
		this.commonCode 	= commonCode;
	}
	
	//	안내문
	public ModelAndView 	Annae_View(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		//	검색조건 저장
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
		
		return new ModelAndView("/facility/gigan/tab/annae_view");
	}
	
	//	안내문 출력(선택한 한건만)
	public ModelAndView 	Annae_Print(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		//	렉스포트로 보낸 데이터
		Annae_Data(request, response);

	//	Map modelMap = new HashMap();
	//	modelMap.put("adminNo", ADMIN_NO);
		
	//	response.setHeader("Content-Disposition", "attachment;filename=점용기간연장(안내문).htm");
		
		return new ModelAndView("/facility/gigan/annae_print");
	}
	
	//	안내문 출력(검색한 모든 건)
	public ModelAndView 	Annae_All_Print(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		//	렉스포트로 보낸 데이터
		Annae_Data(request, response);
		
		//	검색조건 저장
		Search_Data(request, response);
	
	//	Map modelMap = new HashMap();
	//	modelMap.put("adminNo", ADMIN_NO);
		
	//	response.setHeader("Content-Disposition", "attachment;filename=점용기간연장(안내문).htm");
		
		return new ModelAndView("/facility/gigan/annae_all_print");
	}
	
	//	렉스포트로 보낼 데이터
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
	}
	
	//	검색 조건저장
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
	}
}
