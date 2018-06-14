//	2009		Kim Yun Seo

package main.java.facility.jumyonginfo.web;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.util.catUtil.Util;
import main.java.facility.jumyonginfo.model.AppealBean;
import main.java.facility.jumyonginfo.service.IJumyonginfoService;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;


public class TabJumin_Control	extends MultiActionController 
{
	private	IJumyonginfoService	iJumyonginfoService	= null;
	private	CommonCodeService	commonCode		= null;
	private	Util				util			= new Util();
	
	
	public void setFacility_jumyonginfoService(IJumyonginfoService facility_jumyonginfoService) 
	{
		this.iJumyonginfoService = facility_jumyonginfoService;
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
		
				list 	= iJumyonginfoService.executeJumin_View(corp_cd, gu_code);
				
				
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
					

					
					if(Bean.getSPC_CD() != null && Bean.getSPC_CD().equals("2")){
						Bean.setSPC_CD(" 산 ");				
					}else{
						Bean.setSPC_CD("");
					}
					
					if(Bean.getTO_SPC_CD() != null && Bean.getTO_SPC_CD().equals("2")){
						Bean.setTO_SPC_CD(" 산 ");				
					}else{
						Bean.setTO_SPC_CD("");
					}
					
					
					if((Bean.getLNBR1() != null && !Bean.getLNBR1().equals("")) && (Bean.getLNBR2() != null && !Bean.getLNBR2().equals("")) ){
						Bean.setLNBR1(Bean.getLNBR1()+" - "+Bean.getLNBR2()+" 번지");
					}else if(Bean.getLNBR1() != null && !Bean.getLNBR1().equals("") && Bean.getLNBR2() == null || Bean.getLNBR2().equals("") ){
						Bean.setLNBR1(Bean.getLNBR1()+" 번지");
					}
					
					if((Bean.getTO_LNBR1() != null && !Bean.getTO_LNBR1().equals("")) && (Bean.getTO_LNBR2() != null && !Bean.getTO_LNBR2().equals(""))){
						Bean.setTO_LNBR1(Bean.getTO_LNBR1()+" - "+Bean.getTO_LNBR2()+" 번지");
					}else if((Bean.getTO_LNBR1() != null && !Bean.getTO_LNBR1().equals("")) && (Bean.getTO_LNBR2() == null || Bean.getTO_LNBR2().equals("")) ){
						Bean.setTO_LNBR1(Bean.getTO_LNBR1()+" 번지");
					}
					
				}
				
				request.setAttribute("ADMIN_NO", adminno);
				request.setAttribute("GU_CODE", gu_code);
				request.setAttribute("CORP_CD", corp_cd);
			}
		}catch(Exception e){
			System.out.println(e.toString());
		}	
		
		return new ModelAndView("/facility/jumyonginfo/tab/jumin_view", "board", Bean);
	}
	
	//	점용인정보 수정
	public ModelAndView		Jumin_Modify(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		HttpSession session 	= request.getSession();
		String 	userId	= (String)session.getAttribute("sessionUserId");		
		List		list		= null;
		AppealBean	Bean		= null;
		try{
			if(userId != null){
			
				String 		adminno 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
				String 		gu_code 	= ServletRequestUtils.getStringParameter(request, "GU_CODE", "");
				String 		corp_cd 	= ServletRequestUtils.getStringParameter(request, "CORP_CD", "");
				
				list 	= iJumyonginfoService.executeJumin_View(corp_cd, gu_code);
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
		
					List hp_list	= util.StringToken_Three(Bean.getHP());
					if(!hp_list.get(0).equals("")){
						request.setAttribute("HP1", hp_list.get(0).toString());
						request.setAttribute("HP2", hp_list.get(1).toString());
						request.setAttribute("HP3", hp_list.get(2).toString());
					}
		
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
		
		return new ModelAndView("/facility/jumyonginfo/tab/jumin_modify", "board", Bean);
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
//		System.out.println("영계백숙 오오오~~==>"+request.getParameter("ADDR_CHECK"));
		Bean.setADDR_CHECK(ServletRequestUtils.getStringParameter(request, "ADDR_CHECK", "0"));
		
		iJumyonginfoService.executeJumin_Modify(Bean);
	}
}
