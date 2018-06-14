//	2009		Kim Yun Seo

package main.java.jumyong.jumyonginfo.web;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import main.java.common.commonCode.model.UserBean;
import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.util.catUtil.Pageing;
import main.java.common.util.catUtil.Util;
import main.java.jumyong.jumyong.model.SearchBean;
import main.java.jumyong.jumyonginfo.model.AppealBean;
import main.java.jumyong.jumyonginfo.model.MinwonBean;
import main.java.jumyong.jumyonginfo.model.PlaceBean;
import main.java.jumyong.jumyonginfo.service.IMinwoninfoService;
import main.java.jumyong.saewe.model.CalculationBean;



public class TabMinwon_Control	extends MultiActionController {

	private	IMinwoninfoService	IJumyonginfoService	= null;
	private	Util				util				= new Util();
	private	CommonCodeService	commonCode			= null;
	private	Pageing				pageing				= new Pageing();
	
	
	public void setJumyonginfoService(IMinwoninfoService jumyonginfoService) 
	{
		this.IJumyonginfoService = jumyonginfoService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode) 
	{
		this.commonCode 	= commonCode;
	}
	
	
	//	민원정보 보기
	public ModelAndView		Minwon_View(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		// 삭제 세션
		HttpSession session = request.getSession();
		
		String 		userId	= (String)session.getAttribute("sessionUserId");
		SearchBean objSearchBean = null;
		List	list	=	null;
		String 	adminno = ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
		String  SECTION = ServletRequestUtils.getStringParameter(request, "SECTION", "");
		

		try{
			if(userId != null)
			{
				int	currentPage	= Integer.parseInt(ServletRequestUtils.getStringParameter(request, "currentPage", "1"));
				int	iTotalCnt	= IJumyonginfoService.executeMinwon_Count(adminno);
				int	rowCol		= pageing.execute(request, iTotalCnt, currentPage, 2);
				
				list	= IJumyonginfoService.executeMinwon_View(adminno, rowCol, rowCol + 1);
				MinwonBean	Bean	= new MinwonBean();
				int	size	= list.size();
				
		//		System.out.println("iTotalCnt ; " + iTotalCnt);
				
				for(int i = 0	;	i < size	;	i++)
				{
					Bean	= (MinwonBean)list.get(i);	
					
					request.setAttribute("REQ_DATE", Bean.getREQ_DATE());
				}
				
				String seq = "";
				String referrense = "";
				if(list.size() > 0){
					seq = ((MinwonBean)list.get(0)).getSEQ();
					referrense = ((MinwonBean)list.get(0)).getREFERENCE();
				}
				
				request.setAttribute("ADMIN_NO", adminno);
				request.setAttribute("SEQ", seq);
				request.setAttribute("REFERENCE", referrense);
				request.setAttribute("SECTION", SECTION);
			}
		}catch(Exception e){
			System.out.println(e.toString());
		}
		
		return new ModelAndView("/jumyong/jumyonginfo/tab/minwon_view", "blist", list);
	}
	
	//	민원정보 보기
	public ModelAndView		Minwon_View_Search(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		String 	ADMIN_NO 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
		String 	SEQ 		= ServletRequestUtils.getStringParameter(request, "SEQ", "");	
		
		List	list	= IJumyonginfoService.executeMinwon_View_Search(ADMIN_NO, SEQ);
		List	ssn		= null;
		
		MinwonBean	Bean	= new MinwonBean();
		
		String	Xml	= "<?xml version=\"1.0\" encoding=\"euc-kr\"?>";
		Xml	+= "<lists>";
		
		for(int	i = 0	;	i < list.size()	;	i++)
		{
			Bean	= (MinwonBean)list.get(i);
			
			//	SSN
			ssn	= util.SubString_SSN(Bean.getSSN());
	
			Xml	+= util.XmlNodeMake("ADMIN_NO", Bean.getADMIN_NO());
			Xml	+= util.XmlNodeMake("SEQ", Bean.getSEQ());
			
			Xml	+= util.XmlNodeMake("REQ_NO", Bean.getREQ_NO());
			Xml	+= util.XmlNodeMake("GUBUN", Bean.getGUBUN());
			Xml	+= util.XmlNodeMake("REQ_DATE", util.Date_Paste(Bean.getREQ_DATE()));
			Xml	+= util.XmlNodeMake("PREDATE", util.Date_Paste(Bean.getPREDATE()));
			Xml	+= util.XmlNodeMake("REQ_DEP", Bean.getREQ_DEP());
			Xml	+= util.XmlNodeMake("MANAGE_DEP", Bean.getMANAGE_DEP());
			Xml	+= util.XmlNodeMake("REQ_NM", Bean.getREQ_NM());
			Xml	+= util.XmlNodeMake("MANAGER", Bean.getMANAGER());
			Xml	+= util.XmlNodeMake("NOTES", Bean.getNOTES());
			Xml	+= util.XmlNodeMake("AGENT_NM", Bean.getAGENT_NM());
			Xml	+= util.XmlNodeMake("AGENT_TEL", Bean.getAGENT_TEL());
			Xml	+= util.XmlNodeMake("NAME", Bean.getNAME());
			Xml	+= util.XmlNodeMake("SSN", ssn.get(0).toString() + "-" + ssn.get(1).toString());
			Xml	+= util.XmlNodeMake("POST", Bean.getPOST());
			Xml	+= util.XmlNodeMake("ADDR1", Bean.getADDR1());
			Xml	+= util.XmlNodeMake("ADDR2", Bean.getADDR2());
			Xml	+= util.XmlNodeMake("TEL", Bean.getTEL());
			Xml	+= util.XmlNodeMake("HP", Bean.getHP());
			//********** BEGIN_현진_20120215
			Xml	+= util.XmlNodeMake("DORO_ADDR1", Bean.getDORO_ADDR1());
			Xml	+= util.XmlNodeMake("DORO_ADDR2", Bean.getDORO_ADDR2());
			//********** END_현진_20120215

}
		
		Xml	+= "</lists>";
		
        response.setContentType("text/html;charset=utf-8");
        response.setHeader("Cache-Control", "no-cache");
        response.getWriter().write(Xml);
    
		return null;
	}
	
	//	민원정보 수정
	public ModelAndView		Minwon_Modify(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		HttpSession session = request.getSession();		
		String 		userId	= (String)session.getAttribute("sessionUserId");					
		MinwonBean	Bean	= new MinwonBean();
		
		try{
			if(userId != null){
				
				String 	ADMIN_NO 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
				String 	SEQ 		= ServletRequestUtils.getStringParameter(request, "SEQ", "");
				
			//	System.out.println("ADMIN_NO ; " + ADMIN_NO);
			//	System.out.println("SEQ ; " + SEQ);
		
				int	currentPage	= Integer.parseInt(ServletRequestUtils.getStringParameter(request, "currentPage", "1"));
				int	iTotalCnt	= IJumyonginfoService.executeMinwon_Count(ADMIN_NO);
				int	rowCol		= pageing.execute(request, iTotalCnt, currentPage, 2);
				
				//List list	= IJumyonginfoService.executeMinwon_View(ADMIN_NO, rowCol, rowCol + 1);
				
				List	list	= IJumyonginfoService.executeMinwon_View_Search(ADMIN_NO, SEQ);
				List	ssn		= null;								
				
				if(list.size()<=0)
					Bean	= null;
				else
				{
					Bean	= (MinwonBean)list.get(0);
					
					request.setAttribute("REQ_NO", Bean.getREQ_NO());
					request.setAttribute("GUBUN", Bean.getGUBUN());
					request.setAttribute("REQ_DATE", util.Date_Paste(Bean.getREQ_DATE()));
					request.setAttribute("PREDATE", util.Date_Paste(Bean.getPREDATE()));
					request.setAttribute("REQ_DEP", Bean.getREQ_DEP());
					request.setAttribute("MANAGE_DEP", Bean.getMANAGE_DEP());
					request.setAttribute("REQ_NM", Bean.getREQ_NM());
					request.setAttribute("MANAGER", Bean.getMANAGER());
					request.setAttribute("AGENT_NM", Bean.getAGENT_NM());
		
					List AGENT_TEL = util.StringToken_Three(Bean.getAGENT_TEL());
					request.setAttribute("AGENT_TEL1", AGENT_TEL.get(0));
					request.setAttribute("AGENT_TEL2", AGENT_TEL.get(1));
					request.setAttribute("AGENT_TEL3", AGENT_TEL.get(2));
					
					request.setAttribute("NAME", Bean.getNAME());
					
					List SSN = util.SubString_SSN(Bean.getSSN());
					request.setAttribute("SSN1", SSN.get(0));
					request.setAttribute("SSN2", SSN.get(1));
					
					request.setAttribute("POST", util.Post_Paste(Bean.getPOST()));
					request.setAttribute("ADDR1", Bean.getADDR1());
					request.setAttribute("ADDR2", Bean.getADDR2());
					
					List TEL = util.StringToken_Three(Bean.getTEL());
					request.setAttribute("TEL1", TEL.get(0));
					request.setAttribute("TEL2", TEL.get(1));
					request.setAttribute("TEL3", TEL.get(2));
					
					List HP = util.StringToken_Three(Bean.getHP());
					request.setAttribute("HP1", HP.get(0));
					request.setAttribute("HP2", HP.get(1));
					request.setAttribute("HP3", HP.get(2));
					
					ssn	= util.SubString_SSN(Bean.getSSN());
					request.setAttribute("min_ssn1", ssn.get(0).toString());
					request.setAttribute("min_ssn2", ssn.get(1).toString());

					request.setAttribute("REFERENCE", Bean.getREFERENCE());
				}
				
				request.setAttribute("ADMIN_NO", ADMIN_NO);
				request.setAttribute("SEQ", SEQ);
				
			}
		}catch(Exception e){	
			System.out.println("error:"+e.toString());	
		}	
		return new ModelAndView("/jumyong/jumyonginfo/tab/minwon_modify", "board", Bean);
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
		HttpSession session = request.getSession();		
		String 		userId	= (String)session.getAttribute("sessionUserId");							
		
		try{
			if(userId != null){
							
				//	세션에서 시도 코드를 가져온다.
				String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				
				//	관리자 데이터를 가져온다.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
			//	System.out.println(" !!USER : " + userBean.getNAME());
				
				if(userBean	!= null)
				{
					request.setAttribute("MANAGER", userBean.getNAME());
					request.setAttribute("SIGUNGU", userBean.getGU_NM());
					request.setAttribute("MANAGE_DEP", userBean.getDEPT_NM());
				}
				
				//	접수일자
				SimpleDateFormat	formatter 	= new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA);
				Calendar 			cal 		= Calendar.getInstance();
				String	today		= formatter.format(cal.getTime());
				request.setAttribute("REQ_DATE", today);
				
				String 		ADMIN_NO 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
				
				request.setAttribute("ADMIN_NO", ADMIN_NO);
			}
		}catch(Exception e){	
			System.out.println("error:"+e.toString());	
		}	
		return new ModelAndView("/jumyong/jumyonginfo/tab/minwon_register");
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
		try{
					
			String 	ADMIN_NO 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
			String 	SEQ 		= ServletRequestUtils.getStringParameter(request, "SEQ", "");
			String 	SSN1 		= ServletRequestUtils.getStringParameter(request, "SSN1", "");
			String 	SSN2		= ServletRequestUtils.getStringParameter(request, "SSN2", "");
			
			MinwonBean	Bean	= new MinwonBean();
			
			bind(request, Bean);
			
			String AGENT_TEL = "";
			String AGENT_TEL1 = ServletRequestUtils.getStringParameter(request, "AGENT_TEL1", "");
			String AGENT_TEL2 = ServletRequestUtils.getStringParameter(request, "AGENT_TEL2", "");
			String AGENT_TEL3 = ServletRequestUtils.getStringParameter(request, "AGENT_TEL3", "");
			
			if(!AGENT_TEL1.equals("") && !AGENT_TEL2.equals("") && !AGENT_TEL3.equals("")){
				AGENT_TEL = AGENT_TEL1 + "-" + AGENT_TEL2 + "-"+ AGENT_TEL3;
			}
			
			String TEL = "";
			String TEL1 = ServletRequestUtils.getStringParameter(request, "TEL1", "");
			String TEL2 = ServletRequestUtils.getStringParameter(request, "TEL2", "");
			String TEL3 = ServletRequestUtils.getStringParameter(request, "TEL3", "");
			
			if(!TEL1.equals("") && !TEL2.equals("") && !TEL3.equals("")){
				TEL = TEL1 + "-" + TEL2 + "-"+ TEL3;
			}
			
			String HP = "";
			String HP1 = ServletRequestUtils.getStringParameter(request, "HP1", "");
			String HP2 = ServletRequestUtils.getStringParameter(request, "HP2", "");
			String HP3 = ServletRequestUtils.getStringParameter(request, "HP3", "");
			
			if(!HP1.equals("") && !HP2.equals("") && !HP3.equals("")){
				HP = HP1 + "-" + HP2 + "-"+ HP3;
			}
			
			String POST = ServletRequestUtils.getStringParameter(request, "POST", "");
			
			Bean.setPOST(util.Post_Cut(POST));
			Bean.setREQ_DATE(util.Date_Cut(Bean.getREQ_DATE()));
			Bean.setPREDATE(util.Date_Cut(Bean.getPREDATE()));
			Bean.setAGENT_TEL(AGENT_TEL);
			Bean.setTEL(TEL);
			Bean.setHP(HP);
			Bean.setSSN(SSN1 + SSN2);
			Bean.setADMIN_NO(ADMIN_NO);
			Bean.setSEQ(SEQ);
			
		//	System.out.println("min_agenttel ; " + SSN1);
			
			IJumyonginfoService.executeMinwon_Modify(Bean);
		}catch(Exception e){	
			System.out.println("error:"+e.toString());	
		}	
	}
	
	
	//	민원정보 추가
	public String	Minwon_Register_Execute(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		try{
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
		
			
			minwonBean.setREQ_DATE(util.Date_Cut(minwonBean.getREQ_DATE()));
			minwonBean.setPREDATE(util.Date_Cut(minwonBean.getPREDATE()));
			minwonBean.setAGENT_TEL(min_agent_tel);
			minwonBean.setTEL(min_tel);
			minwonBean.setHP(min_hp);
			minwonBean.setSSN(min_ssn);
			minwonBean.setADMIN_NO(ADMIN_NO);
		
			IJumyonginfoService.executeMinwon_Register(minwonBean);
		}catch(Exception e){	
			System.out.println("error:"+e.toString());	
		}	

		return	null;
	}
}
