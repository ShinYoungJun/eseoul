//	2009		Kim Yun Seo

package main.java.gapan.jumyonginfo.web;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.common.commonCode.model.UserBean;
import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.util.catUtil.Pageing;
import main.java.common.util.catUtil.Util;
import main.java.gapan.jumyonginfo.model.MinwonBean;
import main.java.gapan.jumyonginfo.service.IJumyonginfoService;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;



public class TabJumyong_Control	extends MultiActionController {

	private	IJumyonginfoService	iJumyonginfoService	= null;
	private	Util				util				= new Util();
	private	CommonCodeService	commonCode			= null;
	private	Pageing				pageing				= new Pageing();
	
	
	public void setGapan_jumyonginfoService(IJumyonginfoService gapan_jumyonginfoService)
	{
		this.iJumyonginfoService = gapan_jumyonginfoService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode)
	{
		this.commonCode 	= commonCode;
	}
	
	//	민원정보 보기
	public ModelAndView		Minwon_View(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		
//		 삭제 세션
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		List		list	= null;

		try{
			if(userId != null)
			{
		
				String 	adminno = ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
				String 	GP_TYP = ServletRequestUtils.getStringParameter(request, "GP_TYP", "");
				String 	section = ServletRequestUtils.getStringParameter(request, "SECTION", "");
				
				
				list	= iJumyonginfoService.executeMinwon_View(adminno);
				
				MinwonBean	Bean	= new MinwonBean();
				bind(request, Bean);
				
				int	size	= list.size();
				
				for(int i = 0	;	i < size	;	i++)
				{
					Bean	= (MinwonBean)list.get(i);	
					
					Bean.setREQ_DATE_MIN(util.Date_Paste(Bean.getREQ_DATE_MIN()));
					Bean.setPREDATE_MIN(util.Date_Paste(Bean.getPREDATE_MIN()));
					
					System.out.println("민원인 주민번호 : : "+Bean.getSSN_MIN());
					
					List	ssn	= util.SubString_SSN(Bean.getSSN_MIN());
					if(!ssn.get(0).equals(""))
						Bean.setSSN_MIN(ssn.get(0) + "-" + ssn.get(1));
					
					//	BIZSSN
					List	bizssn	= util.SubString_BIZSSN(Bean.getBIZSSN_MIN());
					if(!bizssn.get(0).equals(""))
						Bean.setBIZSSN_MIN(bizssn.get(0) + "-" + bizssn.get(1) + "-" + bizssn.get(2));
					
					// POST
					String	post	= util.Post_Paste(Bean.getPOST_MIN());
					Bean.setPOST_MIN(post);
				}
				
				String seq = "";
				
				if(list.size() > 0)
					seq = ((MinwonBean)list.get(0)).getSEQ_MIN();
				
				request.setAttribute("ADMIN_NO", adminno);
				request.setAttribute("GP_TYP", GP_TYP);
				request.setAttribute("SEQ", seq);
				request.setAttribute("SECTION", section);
			}
		} catch(Exception e){
			System.out.println(e.toString());
		}
				
		return new ModelAndView("/gapan/jumyonginfo/tab/minwon_view","blist", list); 
	}

	//	민원정보 보기
	public ModelAndView	Minwon_View_Search(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
//		 삭제 세션
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");

		try{
			if(userId != null)
			{
				
			
				String 	ADMIN_NO 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
				String 	GP_TYP		= ServletRequestUtils.getStringParameter(request, "GP_TYP", "");
				String 	SEQ 		= ServletRequestUtils.getStringParameter(request, "SEQ", "");	
				
				List	list	= iJumyonginfoService.executeMinwon_View_Search(ADMIN_NO, SEQ);
				List	ssn		= null;
				
				MinwonBean	Bean	= new MinwonBean();
				
				String	Xml	= "<?xml version=\"1.0\" encoding=\"euc-kr\"?>";
				Xml	+= "<lists>";
				
				for(int	i = 0	;	i < list.size()	;	i++)
				{
					Bean	= (MinwonBean)list.get(i);
					
					//	SSN
					ssn	= util.SubString_SSN(Bean.getSSN_MIN());
			
					Xml	+= util.XmlNodeMake("ADMIN_NO", Bean.getADMIN_NO_MIN());
					Xml	+= util.XmlNodeMake("SEQ", Bean.getSEQ_MIN());
					
					Xml	+= util.XmlNodeMake("REQ_NO_MIN", Bean.getREQ_NO_MIN());
					Xml	+= util.XmlNodeMake("GUBUN_MIN", Bean.getGUBUN_MIN());
					Xml	+= util.XmlNodeMake("REQ_DATE_MIN", util.Date_Paste(Bean.getREQ_DATE_MIN()));
					Xml	+= util.XmlNodeMake("PREDATE_MIN", util.Date_Paste(Bean.getPREDATE_MIN()));
					Xml	+= util.XmlNodeMake("REQ_DEP_MIN", Bean.getREQ_DEP_MIN());
					Xml	+= util.XmlNodeMake("MANAGE_DEP_MIN", Bean.getMANAGE_DEP_MIN());
					Xml	+= util.XmlNodeMake("REQ_NM_MIN", Bean.getREQ_NM_MIN());
					Xml	+= util.XmlNodeMake("MANAGER_MIN", Bean.getMANAGER_MIN());
					Xml	+= util.XmlNodeMake("NOTES_MIN", Bean.getNOTES_MIN());
					Xml	+= util.XmlNodeMake("AGENT_NM_MIN", Bean.getAGENT_NM_MIN());
					Xml	+= util.XmlNodeMake("AGENT_TEL_MIN", Bean.getAGENT_TEL_MIN());
					Xml	+= util.XmlNodeMake("NAME_MIN", Bean.getNAME_MIN());
					Xml	+= util.XmlNodeMake("SSN_MIN", ssn.get(0).toString() + "-" + ssn.get(1).toString());
					Xml	+= util.XmlNodeMake("POST_MIN", Bean.getPOST_MIN());
					Xml	+= util.XmlNodeMake("ADDR1_MIN", Bean.getADDR1_MIN());
					Xml	+= util.XmlNodeMake("ADDR2_MIN", Bean.getADDR2_MIN());
					Xml	+= util.XmlNodeMake("TEL_MIN", Bean.getTEL_MIN());
					Xml	+= util.XmlNodeMake("HP_MIN", Bean.getHP_MIN());
				}
				
				Xml	+= "</lists>";
				
		        response.setContentType("text/html;charset=utf-8");
		        response.setHeader("Cache-Control", "no-cache");
		        response.getWriter().write(Xml);
			}
		} catch(Exception e){
			System.out.println(e.toString());
		}
    
		return null;
	}
	
	//	민원정보 수정
	public ModelAndView		Minwon_Modify(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		
//		 삭제 세션
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		MinwonBean	Bean	= null;

		try{
			if(userId != null)
			{
				String 	ADMIN_NO 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
				String 	SEQ 		= ServletRequestUtils.getStringParameter(request, "SEQ", "");
				
			//	System.out.println("ADMIN_NO ; " + ADMIN_NO);
			//	System.out.println("SEQ ; " + SEQ);
		
				List	list	= iJumyonginfoService.executeMinwon_View_Search(ADMIN_NO, SEQ);
				List	ssn		= null;
				
				Bean	= new MinwonBean();
				
				if(list.size()<=0)
					Bean	= null;
				else
				{
					Bean	= (MinwonBean)list.get(0);
		
					request.setAttribute("ADMIN_NO", ADMIN_NO);
					request.setAttribute("SEQ", SEQ);
					request.setAttribute("REQ_NO", Bean.getREQ_NO_MIN());	//접수번호
					request.setAttribute("GUBUN", Bean.getGUBUN_MIN());		//민원구분
					request.setAttribute("REQ_DATE", util.Date_Paste(Bean.getREQ_DATE_MIN()));	//REQ_DATE
					request.setAttribute("PREDATE", util.Date_Paste(Bean.getPREDATE_MIN()));
					request.setAttribute("REQ_DEP", Bean.getREQ_DEP_MIN());
					request.setAttribute("MANAGE_DEP", Bean.getMANAGE_DEP_MIN());
					request.setAttribute("REQ_NM", Bean.getREQ_NM_MIN());
					request.setAttribute("MANAGER", Bean.getMANAGER_MIN());
					request.setAttribute("NOTES", Bean.getNOTES_MIN());
					request.setAttribute("AGENT_NM", Bean.getAGENT_NM_MIN());
					
					List agent_tel_list	= util.StringToken_Three(Bean.getAGENT_TEL_MIN());
					if(!agent_tel_list.get(0).equals("")){
						request.setAttribute("AGENT_TEL1", agent_tel_list.get(0).toString());
						request.setAttribute("AGENT_TEL2", agent_tel_list.get(1).toString());
						request.setAttribute("AGENT_TEL3", agent_tel_list.get(2).toString());
					}
					
					request.setAttribute("NAME", Bean.getNAME_MIN());
					
					ssn	= util.SubString_SSN(Bean.getSSN_MIN());
					if(!ssn.get(0).equals("")){
						request.setAttribute("SSN1", ssn.get(0).toString());
						request.setAttribute("SSN2", ssn.get(1).toString());
					}
					
					request.setAttribute("POST", util.Post_Cut(Bean.getPOST_MIN()));
					request.setAttribute("ADDR1", Bean.getADDR1_MIN());
					request.setAttribute("ADDR2", Bean.getADDR2_MIN());
					
					List tel_list	= util.StringToken_Three(Bean.getTEL_MIN());
					List hp_list	= util.StringToken_Three(Bean.getHP_MIN());
					
					if(!tel_list.get(0).equals(""))
					{
						request.setAttribute("TEL1", tel_list.get(0).toString());
						request.setAttribute("TEL2", tel_list.get(1).toString());
						request.setAttribute("TEL3", tel_list.get(2).toString());
					}
					
					if(!hp_list.get(0).equals(""))
					{
						request.setAttribute("HP1", hp_list.get(0).toString());
						request.setAttribute("HP2", hp_list.get(1).toString());
						request.setAttribute("HP3", hp_list.get(2).toString());
					}
					
					request.setAttribute("POST", util.Post_Paste(Bean.getPOST_MIN()));
				
					}
				}
			} catch(Exception e){
				System.out.println(e.toString());
			}
		
		return new ModelAndView("/gapan/jumyonginfo/tab/minwon_modify", "board", Bean);
	}
	
	//	민원정보 수정 처리
	public ModelAndView		Minwon_Modify_Prc(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
//		String 	ADMIN_NO 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
//		String 	SEQ 		= ServletRequestUtils.getStringParameter(request, "SEQ", "");

		Minwon_Modify_Execute(request, response);
		
		return	Minwon_View(request, response);
	}
	
	//	민원정보 추가
	public ModelAndView		Minwon_Register(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		
		// 삭제 세션
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");

		try{
			if(userId != null)
			{
				//	세션에서 시도 코드를 가져온다.
				String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				
				//	관리자 데이터를 가져온다.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
			//	System.out.println(" !!USER : " + userBean.getNAME());
				
				if(userBean	!= null)
				{
					request.setAttribute("MANAGER_MIN", userBean.getNAME());
					request.setAttribute("SIGUNGU", userBean.getGU_NM());
					request.setAttribute("MANAGE_DEP_MIN", userBean.getDEPT_NM());
				}
				
				//	접수일자
				SimpleDateFormat	formatter 	= new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA);
				Calendar 			cal 		= Calendar.getInstance();
				String	today		= formatter.format(cal.getTime());
				request.setAttribute("REQ_DATE_MIN", today);
				
				String 		ADMIN_NO 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
				
				request.setAttribute("ADMIN_NO", ADMIN_NO);
			}
		} catch(Exception e){
			System.out.println(e.toString());
		}
		
		return new ModelAndView("/gapan/jumyonginfo/tab/minwon_register");
	}
	
	//	민원정보 추가 처리
	public ModelAndView		Minwon_Register_Prc(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		String 		ADMIN_NO 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
		
		if(ADMIN_NO	!=	null)
		{
			//	민원정보를 저장한다.
			Minwon_Register_Execute(request, response);
		}
		
		return	Minwon_View(request, response);
	}
	
	
	//	민원정보 수정
	public void		Minwon_Modify_Execute(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		String 	ADMIN_NO 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
		String 	SEQ 		= ServletRequestUtils.getStringParameter(request, "SEQ", "");
		String 	REQ_DATE 	= ServletRequestUtils.getStringParameter(request, "REQ_DATE", "");
		String 	PREDATE 	= ServletRequestUtils.getStringParameter(request, "PREDATE", "");
		String 	REQ_NO 		= ServletRequestUtils.getStringParameter(request, "REQ_NO", "");

		String 	GUBUN 		= ServletRequestUtils.getStringParameter(request, "GUBUN", "");
		String 	REQ_DEP 	= ServletRequestUtils.getStringParameter(request, "REQ_DEP", "");
		String 	MANAGE_DEP 	= ServletRequestUtils.getStringParameter(request, "MANAGE_DEP", "");
		String 	REQ_NM 		= ServletRequestUtils.getStringParameter(request, "REQ_NM", "");
		String 	MANAGER	 	= ServletRequestUtils.getStringParameter(request, "MANAGER", "");

		String 	NOTES	 	= ServletRequestUtils.getStringParameter(request, "NOTES", "");
		String 	AGENT_NM 	= ServletRequestUtils.getStringParameter(request, "AGENT_NM", "");
		String AGENT_TEL = "";
		String AGENT_TEL1 = ServletRequestUtils.getStringParameter(request, "AGENT_TEL1", "");
		String AGENT_TEL2 = ServletRequestUtils.getStringParameter(request, "AGENT_TEL2", "");
		String AGENT_TEL3 = ServletRequestUtils.getStringParameter(request, "AGENT_TEL3", "");
		if(!AGENT_TEL1.equals("")){			AGENT_TEL = AGENT_TEL1 + "-" + AGENT_TEL2 + "-" + AGENT_TEL3;		}		

		String 	NAME 	= ServletRequestUtils.getStringParameter(request, "NAME", "");
		
		String 	SSN1 		= ServletRequestUtils.getStringParameter(request, "SSN1", "");
		String 	SSN2		= ServletRequestUtils.getStringParameter(request, "SSN2", "");
		String	SSN		= "";
		if(!SSN1.equals(""))
			SSN		= SSN1 + SSN2;
		
		System.out.println("::민원주민번호::"+SSN);
		
		String 	POST 	= util.Post_Cut(ServletRequestUtils.getStringParameter(request, "POST", ""));
		String 	ADDR1 	= ServletRequestUtils.getStringParameter(request, "ADDR1", "");
		String 	ADDR2 	= ServletRequestUtils.getStringParameter(request, "ADDR2", "");
		
		String TEL = "";
		String TEL1 = ServletRequestUtils.getStringParameter(request, "TEL1", "");
		String TEL2 =ServletRequestUtils.getStringParameter(request, "TEL2", "");
		String TEL3 =ServletRequestUtils.getStringParameter(request, "TEL3", "");
		if(!TEL1.equals("")){			TEL = TEL1 + "-" + TEL2 + "-" + TEL3;		}
		
		String HP = "";
		String HP1 = ServletRequestUtils.getStringParameter(request, "HP1", "");
		String HP2 = ServletRequestUtils.getStringParameter(request, "HP2", "");
		String HP3 = ServletRequestUtils.getStringParameter(request, "HP3", "");
	
		if(!HP1.equals("")){			HP = HP1 + "-" + HP2 + "-" + HP3;		}
		
		MinwonBean	Bean	= new MinwonBean();
		
		bind(request, Bean);
		
		Bean.setADMIN_NO_MIN(ADMIN_NO);
		Bean.setSEQ_MIN(SEQ);
		Bean.setREQ_NO_MIN(REQ_NO);
		Bean.setGUBUN_MIN(GUBUN);
		Bean.setREQ_DATE_MIN(util.Date_Cut(REQ_DATE));
		Bean.setPREDATE_MIN(util.Date_Cut(PREDATE));
		Bean.setREQ_DEP_MIN(REQ_DEP);
		Bean.setMANAGE_DEP_MIN(MANAGE_DEP);
		Bean.setREQ_NM_MIN(REQ_NM);
		Bean.setMANAGER_MIN(MANAGER);
		Bean.setNOTES_MIN(NOTES);
		Bean.setAGENT_NM_MIN(AGENT_NM);
		Bean.setAGENT_TEL_MIN(AGENT_TEL);
		Bean.setNAME_MIN(NAME);
		Bean.setSSN_MIN(SSN);
		Bean.setPOST_MIN(POST);
		Bean.setADDR1_MIN(ADDR1);
		Bean.setADDR2_MIN(ADDR2);
		Bean.setTEL_MIN(TEL);
		Bean.setHP_MIN(HP);
		
		iJumyonginfoService.executeMinwon_Modify(Bean);
	}
	
	
	//	민원정보 추가
	public String	Minwon_Register_Execute(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		String 		ADMIN_NO 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
		
	//	UserBean	userBean	= new UserBean();
	//	userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
		
		MinwonBean	minwonBean	= new MinwonBean();
		bind(request, minwonBean);
		
		String	min_agent_tel	= "";
		if(!ServletRequestUtils.getStringParameter(request, "min_agent_tel3", "").equals(""))
		{
			min_agent_tel	= ServletRequestUtils.getStringParameter(request, "min_agent_tel1", "") + "-" +
			ServletRequestUtils.getStringParameter(request, "min_agent_tel2", "") + "-" +
				ServletRequestUtils.getStringParameter(request, "min_agent_tel3", "");
		}
		
		String	min_tel	= "";
		if(!ServletRequestUtils.getStringParameter(request, "min_tel3", "").equals(""))
		{
			min_tel	= ServletRequestUtils.getStringParameter(request, "min_tel1", "") + "-" +
			ServletRequestUtils.getStringParameter(request, "min_tel2", "") + "-" +
				ServletRequestUtils.getStringParameter(request, "min_tel3", "");
		}
		
		String	min_hp	= "";
		if(!ServletRequestUtils.getStringParameter(request, "min_hp3", "").equals(""))
		{
			min_hp	= ServletRequestUtils.getStringParameter(request, "min_hp1", "") + "-" +
			ServletRequestUtils.getStringParameter(request, "min_hp2", "") + "-" +
				ServletRequestUtils.getStringParameter(request, "min_hp3", "");
		}
		
		String	min_ssn		= "";
		if(!ServletRequestUtils.getStringParameter(request, "min_ssn2", "").equals(""))
			min_ssn		= ServletRequestUtils.getStringParameter(request, "min_ssn1", "") + ServletRequestUtils.getStringParameter(request, "min_ssn2", "");
	
		
		minwonBean.setREQ_DATE_MIN(util.Date_Cut(minwonBean.getREQ_DATE_MIN()));
		minwonBean.setPREDATE_MIN(util.Date_Cut(minwonBean.getPREDATE_MIN()));
		minwonBean.setAGENT_TEL_MIN(min_agent_tel);
		minwonBean.setTEL_MIN(min_tel);
		minwonBean.setHP_MIN(min_hp);
		minwonBean.setSSN_MIN(min_ssn);
		minwonBean.setADMIN_NO_MIN(ADMIN_NO);
	
		iJumyonginfoService.executeMinwon_Register(minwonBean);

		return	null;
	}
}
