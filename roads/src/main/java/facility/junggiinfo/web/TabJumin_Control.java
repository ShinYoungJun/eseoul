//	2009		Kim Yun Seo

package main.java.facility.junggiinfo.web;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.util.catUtil.Util;
import main.java.facility.junggiinfo.model.AppealBean;
import main.java.facility.junggiinfo.service.IJunggiinfoService;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;


public class TabJumin_Control	extends MultiActionController 
{
	private	IJunggiinfoService	iJunggiinfoService	= null;
	private	CommonCodeService	commonCode		= null;
	private	Util				util			= new Util();
	
	
	public void setFacility_junggiinfoService(IJunggiinfoService facility_junggiinfoService) 
	{
		this.iJunggiinfoService = facility_junggiinfoService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode) 
	{
		this.commonCode 	= commonCode;
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
				String 		gu_code 	= ServletRequestUtils.getStringParameter(request, "GU_CODE", "");
				String 		corp_cd 	= ServletRequestUtils.getStringParameter(request, "CORP_CD", "");
		//		String 		request_no 	= ServletRequestUtils.getStringParameter(request, "request_no", "");
		
				list 	= iJunggiinfoService.executeJumin_View(corp_cd, gu_code);
				
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
					
					Bean.setREGDATE(util.Date_Paste(Bean.getREGDATE()));
				}
				
				request.setAttribute("ADMIN_NO", adminno);
				request.setAttribute("GU_CODE", gu_code);
				request.setAttribute("CORP_CD", corp_cd);
			}
		}catch(Exception e){
			System.out.println(e.toString());
		}	

		return new ModelAndView("/facility/junggiinfo/tab/jumin_view", "board", Bean);
	}
	
	//	점용인정보 수정
	public ModelAndView		Jumin_Modify(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		HttpSession session 	= request.getSession();
		String 		userId		= (String)session.getAttribute("sessionUserId");		
		List		list		= null;
		AppealBean	Bean		= null;
		
		try{
			if(userId != null){
				String 		adminno 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
				String 		gu_code 	= ServletRequestUtils.getStringParameter(request, "GU_CODE", "");
				String 		corp_cd 	= ServletRequestUtils.getStringParameter(request, "CORP_CD", "");
		//		System.out.println("################################################");
		//		System.out.println("adminno ==>"+adminno);
		//		System.out.println("gu_code ==>"+gu_code);
		//		System.out.println("corp_cd ==>"+corp_cd);
		//		System.out.println("################################################");
				list 	= iJunggiinfoService.executeJumin_View(corp_cd, gu_code);
				Bean	= (AppealBean)list.get(0);
				
				if(list.size()<=0)
					Bean	= null;
				else
				{
					Bean	= (AppealBean)list.get(0);
					
					//	SSN
					List	ssn	= util.SubString_SSN(Bean.getSSN());
					request.setAttribute("SSN1", ssn.get(0));
					request.setAttribute("SSN2", ssn.get(1));
					
					//	BIZSSN
					List	bizssn	= util.SubString_BIZSSN(Bean.getBIZSSN());
					request.setAttribute("BIZSSN1", bizssn.get(0));
					request.setAttribute("BIZSSN2", bizssn.get(1));
					request.setAttribute("BIZSSN3", bizssn.get(2));
					
					List totel_list	= util.StringToken_Three(Bean.getTOTEL());
					if(!totel_list.get(0).equals("")){
						request.setAttribute("TOTEL1", totel_list.get(0).toString());
						request.setAttribute("TOTEL2", totel_list.get(1).toString());
						request.setAttribute("TOTEL3", totel_list.get(2).toString());
					}
//					System.out.println("################   TEST  #############");
//					System.out.println("Bean.getHP() ==> " + Bean.getHP());
					List hp_list	= util.StringToken_Three(Bean.getHP());
					if(!hp_list.get(0).equals("")){
						request.setAttribute("HP1", hp_list.get(0).toString());
						request.setAttribute("HP2", hp_list.get(1).toString());
						request.setAttribute("HP3", hp_list.get(2).toString());
					}
//					System.out.println("Bean.getTOFAX() ==> " + Bean.getTOFAX());
					List tofax_list	= util.StringToken_Three(Bean.getTOFAX());
					if(!tofax_list.get(0).equals("")){
						request.setAttribute("TOFAX1", tofax_list.get(0).toString());
						request.setAttribute("TOFAX2", tofax_list.get(1).toString());
						request.setAttribute("TOFAX3", tofax_list.get(2).toString());
					}
				}
				
				request.setAttribute("ADMIN_NO", adminno);
				request.setAttribute("GU_CODE", gu_code);
				request.setAttribute("CORP_CD", corp_cd);
			}
		}catch(Exception e){
			System.out.println(e.toString());
		}	
		
		return new ModelAndView("/facility/junggiinfo/tab/jumin_modify", "board", Bean);
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

		String	SSN			= "";
		String	SSN1		= ServletRequestUtils.getStringParameter(request, "SSN1", "");
		String	SSN2		= ServletRequestUtils.getStringParameter(request, "SSN2", "");
		
		if(!SSN2.equals(""))
				SSN				= SSN1 + SSN2;
		
		String	BIZSSN	= "";
		String	BIZSSN1	= ServletRequestUtils.getStringParameter(request, "BIZSSN1", "");
		String	BIZSSN2	= ServletRequestUtils.getStringParameter(request, "BIZSSN2", "");
		String	BIZSSN3	= ServletRequestUtils.getStringParameter(request, "BIZSSN3", "");
		
		if(!BIZSSN3.equals(""))
				BIZSSN			= BIZSSN1 + BIZSSN2 + BIZSSN3;
		
		String TEL = "";
		String TEL1 = ServletRequestUtils.getStringParameter(request, "TEL1", "");
		String TEL2 = ServletRequestUtils.getStringParameter(request, "TEL2", "");
		String TEL3 = ServletRequestUtils.getStringParameter(request, "TEL3", "");
		if(!TEL1.equals("")){			TEL = TEL1 + "-" + TEL2 + "-" + TEL3;		}
		
		String HP = "";
		String HP1 = ServletRequestUtils.getStringParameter(request, "HP1", "");
		String HP2 = ServletRequestUtils.getStringParameter(request, "HP2", "");
		String HP3 = ServletRequestUtils.getStringParameter(request, "HP3", "");
		if(!HP1.equals("")){			HP = HP1 + "-" + HP2 + "-" + HP3;		}
		
		ServletRequestUtils.getStringParameter(request, "TOPOST", "");
		
		String TOTEL = "";
		String TOTEL1 = ServletRequestUtils.getStringParameter(request, "TOTEL1", "");
		String TOTEL2 = ServletRequestUtils.getStringParameter(request, "TOTEL2", "");
		String TOTEL3 = ServletRequestUtils.getStringParameter(request, "TOTEL3", "");
		if(!TOTEL1.equals("")){			TOTEL = TOTEL1 + "-" + TOTEL2 + "-" + TOTEL3;		}
		
		String TOHP = "";
		String TOHP1 = ServletRequestUtils.getStringParameter(request, "TOHP1", "");
		String TOHP2 = ServletRequestUtils.getStringParameter(request, "TOHP2", "");
		String TOHP3 = ServletRequestUtils.getStringParameter(request, "TOHP3", "");
		if(!TOHP.equals("")){			TOHP = TOHP1 + "-" + TOHP2 + "-" + TOHP3;		}
		
		String TOFAX = "";
		String TOFAX1 = ServletRequestUtils.getStringParameter(request, "TOFAX1", "");
		String TOFAX2 = ServletRequestUtils.getStringParameter(request, "TOFAX2", "");
		String TOFAX3 = ServletRequestUtils.getStringParameter(request, "TOFAX3", "");
		if(!TOFAX1.equals("")){			TOFAX = TOFAX1 + "-" + TOFAX2 + "-" + TOFAX3;		}
		
		Bean.setADMIN_NO(adminno);
		Bean.setSSN(SSN);
		Bean.setBIZSSN(BIZSSN);
		Bean.setTEL(TEL);
		Bean.setHP(HP);
		Bean.setTOTEL(TOTEL);
		Bean.setTOHP(TOHP);
		Bean.setTOFAX(TOFAX);
		Bean.setPOST(util.Post_Cut(Bean.getPOST()));
		Bean.setTOPOST(util.Post_Cut(Bean.getTOPOST()));
		
		Bean.setCORP_CD(ServletRequestUtils.getStringParameter(request, "CORP_CD", ""));
		Bean.setGU_CODE(ServletRequestUtils.getStringParameter(request, "GU_CODE", ""));
				
		iJunggiinfoService.executeJumin_Modify(Bean);
	}
}
