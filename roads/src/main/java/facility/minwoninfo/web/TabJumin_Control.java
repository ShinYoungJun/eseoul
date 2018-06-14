//	2009		Kim Yun Seo

package main.java.facility.minwoninfo.web;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import main.java.facility.minwoninfo.model.AppealBean;
import main.java.facility.minwoninfo.service.IMinwoninfoService;
import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.util.catUtil.Util;


public class TabJumin_Control	extends MultiActionController 
{
	private	IMinwoninfoService	iMinwoninfoService	= null;
//	private	CommonCodeService	commonCode		= null;
	private	Util				util			= new Util();
	
	
	public void setFacility_minwoninfoService(IMinwoninfoService facility_minwoninfoService)
	{
		this.iMinwoninfoService = facility_minwoninfoService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode) 
	{
//		this.commonCode 	= commonCode;
	}

	
	//	점용인정보 보기
	public ModelAndView		Jumin_View(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		HttpSession session 	= request.getSession();
		String 	userId	= (String)session.getAttribute("sessionUserId");		
		List		list		= null;
		AppealBean	Bean	= new AppealBean();
		
		try{
			if(userId != null){
				
				String 		adminno 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
				
				list 	= iMinwoninfoService.executeJumin_View(adminno);
				
				if(list.size()<=0)
					Bean	= null;
				else
				{
					Bean	= (AppealBean)list.get(0);
					
					//	SSN
					List	ssn	= util.SubString_SSN(Bean.getSSN());
					if(!ssn.get(0).equals(""))
						Bean.setSSN(ssn.get(0) + "-" + ssn.get(1));
					
					//	BIZSSN
					List	bizssn	= util.SubString_BIZSSN(Bean.getBIZSSN());
					if(!bizssn.get(0).equals(""))
						Bean.setBIZSSN(bizssn.get(0) + "-" + bizssn.get(1) + "-" + bizssn.get(2));
				}
				
				request.setAttribute("ADMIN_NO", adminno);
			}
		}catch(Exception e){
			System.out.println(e.toString());
		}	
			
		return new ModelAndView("/facility/minwoninfo/tab/jumin_view", "board", Bean);
	}
	
	//	점용인정보 보기 (수정불가)	
	public ModelAndView		JuminInfo_View(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		HttpSession session 	= request.getSession();
		String 	userId	= (String)session.getAttribute("sessionUserId");		
		List		list		= null;
		AppealBean	Bean	= new AppealBean();
		
		try{
			if(userId != null){
				String 	ADMIN_NO 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
				
				list 	= iMinwoninfoService.executeJumin_View(ADMIN_NO);
				
				if(list.size()<=0)
					Bean	= null;
				else
				{
					Bean	= (AppealBean)list.get(0);
					
					//	SSN
					List	ssn	= util.SubString_SSN(Bean.getSSN());
					if(!ssn.get(0).equals(""))
						Bean.setSSN(ssn.get(0) + "-" + ssn.get(1));
		
					//	BIZSSN
					List	bizssn	= util.SubString_BIZSSN(Bean.getBIZSSN());
					if(!bizssn.get(0).equals(""))
						Bean.setBIZSSN(bizssn.get(0) + "-" + bizssn.get(1) + "-" + bizssn.get(2));
				}
				
				request.setAttribute("ADMIN_NO", ADMIN_NO);
			}
		}catch(Exception e){
			System.out.println(e.toString());
		}	
		
		return new ModelAndView("/facility/minwoninfo/tab/jumininfo_view", "board", Bean);
	}
	
	//	점용인정보 수정
	public ModelAndView		Jumin_Modify(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		HttpSession session 	= request.getSession();
		String 	userId			= (String)session.getAttribute("sessionUserId");		
		List		list		= null;
		AppealBean	Bean 		= null;
		try{
			if(userId != null){
				String 		adminno 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
				
				list 	= iMinwoninfoService.executeJumin_View(adminno);
				Bean	= (AppealBean)list.get(0);
				
				if(list.size()<=0)
					Bean	= null;
				else
				{
					Bean	= (AppealBean)list.get(0);
					
					//	SSN
					List	ssn	= util.SubString_SSN(Bean.getSSN());
					request.setAttribute("jumin_ssn1", ssn.get(0));
					request.setAttribute("jumin_ssn2", ssn.get(1));
					
					//	BIZSSN
					List	bizssn	= util.SubString_BIZSSN(Bean.getBIZSSN());
					request.setAttribute("jumin_bizssn1", bizssn.get(0));
					request.setAttribute("jumin_bizssn2", bizssn.get(1));
					request.setAttribute("jumin_bizssn3", bizssn.get(2));
				}		
				
				request.setAttribute("ADMIN_NO", adminno);
			}
		}catch(Exception e){
			System.out.println(e.toString());
		}	
		
		return new ModelAndView("/facility/minwoninfo/tab/jumin_modify", "board", Bean);
	}
	
	//	점용인정보 수정 처리
	public ModelAndView		Jumin_Modify_Prc(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{		
		String 		adminno = ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
		
		Jumin_Modify_Execute(request, response, adminno);
		
		return	Jumin_View(request, response);
	}	
	
	
	//	점용인 정보  수정
	public void		Jumin_Modify_Execute(HttpServletRequest request,HttpServletResponse response, String adminno) throws Exception 
	{
		AppealBean	Bean	= new AppealBean();
		
		bind(request, Bean);
		
		String	jumin_ssn		= "";
		String	jumin_bizssn	= "";
		
		if(!ServletRequestUtils.getStringParameter(request, "jumin_ssn2", "").equals(""))
			jumin_ssn		= ServletRequestUtils.getStringParameter(request, "jumin_ssn1", "") + ServletRequestUtils.getStringParameter(request, "jumin_ssn2", "");
		if(!ServletRequestUtils.getStringParameter(request, "jumin_bizssn3", "").equals(""))
			jumin_bizssn	= ServletRequestUtils.getStringParameter(request, "jumin_bizssn1", "") + ServletRequestUtils.getStringParameter(request, "jumin_bizssn2", "") + ServletRequestUtils.getStringParameter(request, "jumin_bizssn3", "");

		Bean.setSSN(jumin_ssn);
		Bean.setBIZSSN(jumin_bizssn);
		Bean.setADMIN_NO(adminno);
		
		iMinwoninfoService.executeJumin_Modify(Bean);
	}
}
