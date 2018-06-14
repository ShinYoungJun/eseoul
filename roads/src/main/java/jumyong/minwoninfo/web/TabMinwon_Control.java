//	2009		Kim Yun Seo

package main.java.jumyong.minwoninfo.web;


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
import main.java.jumyong.minwoninfo.model.AppealBean;
import main.java.jumyong.minwoninfo.model.MinwonBean;
import main.java.jumyong.minwoninfo.model.PlaceBean;
import main.java.jumyong.minwoninfo.service.IMinwoninfoService;
import main.java.jumyong.saewe.model.CalculationBean;
import main.java.junggi.gigan.model.GiganBean;


public class TabMinwon_Control	extends MultiActionController {

	private	IMinwoninfoService	iMinwoninfoService	= null;
	private	Util				util				= new Util();
	private	CommonCodeService	commonCode			= null;
	private	Pageing				pageing				= new Pageing();
	
	
	public void setMinwoninfoService(IMinwoninfoService minwoninfoService) 
	{
		this.iMinwoninfoService = minwoninfoService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode) 
	{
		this.commonCode 	= commonCode;
	}
	
	
	//	민원정보 보기
	public ModelAndView		Minwon_View(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");		
		List		list	= null;
		
		try{
			if(userId != null){
				
				String 	ADMIN_NO 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
				String 	SEQ	 		= ServletRequestUtils.getStringParameter(request, "SEQ", "");
		
				int	currentPage	= Integer.parseInt(ServletRequestUtils.getStringParameter(request, "currentPage", "1"));
				
				//	총 데이터 갯수를 가져온다.
				int	iTotalCnt	= iMinwoninfoService.executeMinwon_Count(ADMIN_NO);
				
				//	페이징 처리
				int	rowCol		= pageing.execute(request, iTotalCnt, currentPage, 2);
				
				//	검색한 더이터를 가져온다.
				list	= iMinwoninfoService.executeMinwon_View(ADMIN_NO, rowCol, rowCol + 1);
				MinwonBean	Bean	= new MinwonBean();
				int	size	= list.size();
				
		//		System.out.println("iTotalCnt ; " + iTotalCnt);
				
				for(int i = 0	;	i < size	;	i++)
				{
					Bean	= (MinwonBean)list.get(i);	
					
					//	날짜에 "-" 를 추가한다.
					Bean.setREQ_DATE_MIN(util.Date_Paste(Bean.getREQ_DATE_MIN()));
					Bean.setPREDATE_MIN(util.Date_Paste(Bean.getPREDATE_MIN()));
				}
				
				request.setAttribute("ADMIN_NO", ADMIN_NO);
				request.setAttribute("SEQ", SEQ);
				
			}
		}catch(Exception e){
			System.out.println("error:"+e.toString());
		}	
		return new ModelAndView("/jumyong/minwoninfo/tab/minwon_view", "blist", list);
	}
	
	//	민원정보 보기(수정 불가 화면)
	public ModelAndView		MinwonInfo_View(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");		
		List		list	= null;
		
		try{
			if(userId != null){
				
				String 	ADMIN_NO 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
				String 	SEQ	 		= ServletRequestUtils.getStringParameter(request, "SEQ", "");
				
				int	currentPage	= Integer.parseInt(ServletRequestUtils.getStringParameter(request, "currentPage", "1"));
				
				//	총 데이터 갯수를 가져온다.
				int	iTotalCnt	= iMinwoninfoService.executeMinwon_Count(ADMIN_NO);
				
				//	페이징 처리
				int	rowCol		= pageing.execute(request, iTotalCnt, currentPage, 2);
				
				//	검색한 더이터를 가져온다.		
				list	= iMinwoninfoService.executeMinwon_View(ADMIN_NO, rowCol, rowCol + 1);
				MinwonBean	Bean	= new MinwonBean();
				int	size	= list.size();
				
				
				if(size	>	0)
				{
					for(int i = 0	;	i < size	;	i++)
					{
						Bean	= (MinwonBean)list.get(i);	
						
						//	날짜에 "-" 를 추가
						Bean.setREQ_DATE_MIN(util.Date_Paste(Bean.getREQ_DATE_MIN()));
						Bean.setPREDATE_MIN(util.Date_Paste(Bean.getPREDATE_MIN()));
					}
					
					//	SEQ 를 가져온다.
					if(SEQ.equals(""))
					{
						Bean	= (MinwonBean)list.get(0);
						SEQ		= Bean.getSEQ_MIN();
					}
				}
				
				request.setAttribute("ADMIN_NO", ADMIN_NO);
				request.setAttribute("SEQ", SEQ);
				request.setAttribute("currentPage", String.valueOf(currentPage));
				
			//	System.out.println("SEQ ; " + SEQ);
				
			}
		}catch(Exception e){
			System.out.println("error:"+e.toString());
		}		
		return new ModelAndView("/jumyong/minwoninfo/tab/minwoninfo_view", "blist", list);
	}
	
	//	민원정보 보기 (리스트 클릭)
	public ModelAndView		Minwon_View_Search(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		String 	ADMIN_NO 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
		String 	SEQ 		= ServletRequestUtils.getStringParameter(request, "SEQ", "");
		
		//	민원정보 데이터를 가져온다.
		List	list	= iMinwoninfoService.executeMinwon_View_Search(ADMIN_NO, SEQ);
		List	ssn		= null;
		
		MinwonBean	Bean	= new MinwonBean();
		
		//	XML로 만들어서 데이터를 돌려보낸다.
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
		
		request.setAttribute("ADMIN_NO", ADMIN_NO);
		request.setAttribute("SEQ", SEQ);
    
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
		
				//	검색한 민원정보 데이터를 가져온다.
				List	list	= iMinwoninfoService.executeMinwon_View_Search(ADMIN_NO, SEQ);
				List	ssn		= null;								
				
				if(list.size()<=0)
					Bean	= null;
				else
				{
					Bean	= (MinwonBean)list.get(0);
					
					ssn	= util.SubString_SSN(Bean.getSSN_MIN());
				}
				
				//	주민번호를 가져와서 앞 6자리, 뒤 7자리로 분리한다.
				request.setAttribute("min_ssn1", ssn.get(0).toString());
				request.setAttribute("min_ssn2", ssn.get(1).toString());
				
				request.setAttribute("ADMIN_NO", ADMIN_NO);
				request.setAttribute("SEQ", SEQ);
				
			}
		}catch(Exception e){
			System.out.println("error:"+e.toString());
		}		
		return new ModelAndView("/jumyong/minwoninfo/tab/minwon_modify", "board", Bean);
	}
	
	//	민원정보 수정 처리
	public ModelAndView		Minwon_Modify_Prc(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
//		String 	ADMIN_NO 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
//		String 	SEQ 		= ServletRequestUtils.getStringParameter(request, "SEQ", "");

		//	민원 정보 수정
		Minwon_Modify_Execute(request, response);
		
		//	뷰 화면으로 이동
		return	Minwon_View(request, response);
	}
	
	//	민원정보 추가
	public ModelAndView		Minwon_Register(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");						
		
		try{
			if(userId != null){
				//	 삭제 세션
			//	HttpSession session = request.getSession();
			//	session.setAttribute("sessionUserId", "장구경");
				
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
		}catch(Exception e){
			System.out.println("error:"+e.toString());
		}		
		return new ModelAndView("/jumyong/minwoninfo/tab/minwon_register");
	}
	
	//	민원정보 추가 처리
	public ModelAndView		Minwon_Register_Prc(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		try{
			String 		ADMIN_NO 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
			
			if(ADMIN_NO	!=	null)
			{
				//	민원정보를 저장한다.
				Minwon_Register_Execute(request, response);
			}
		}catch(Exception e){
			System.out.println("error:"+e.toString());
		}	
		//	뷰화면으로 이동
		return	Minwon_View(request, response);
	}
	
	
	//	민원정보 수정
	public void		Minwon_Modify_Execute(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		MinwonBean	Bean	= new MinwonBean();
		try{
			String 	ADMIN_NO 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
			String 	SEQ 		= ServletRequestUtils.getStringParameter(request, "SEQ", "");
			String 	SSN1 		= ServletRequestUtils.getStringParameter(request, "min_ssn1", "");
			String 	SSN2		= ServletRequestUtils.getStringParameter(request, "min_ssn2", "");						
			
			bind(request, Bean);
			
			Bean.setSSN_MIN(SSN1 + SSN2);
			Bean.setADMIN_NO_MIN(ADMIN_NO);
			Bean.setSEQ_MIN(SEQ);
			
		//	System.out.println("min_agenttel ; " + SSN1);
		}catch(Exception e){
			System.out.println("error:"+e.toString());
		}	
		iMinwoninfoService.executeMinwon_Modify(Bean);
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
			
			//	"-"	추가
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
		
			//	날짜는 "-" 빼고 저장한다.
			minwonBean.setREQ_DATE_MIN(util.Date_Cut(minwonBean.getREQ_DATE_MIN()));
			minwonBean.setPREDATE_MIN(util.Date_Cut(minwonBean.getPREDATE_MIN()));
			
			minwonBean.setAGENT_TEL_MIN(min_agent_tel);
			minwonBean.setTEL_MIN(min_tel);
			minwonBean.setHP_MIN(min_hp);
			minwonBean.setSSN_MIN(min_ssn);
			minwonBean.setADMIN_NO_MIN(ADMIN_NO);
		
			//	민원 데이터 저장
			iMinwoninfoService.executeMinwon_Register(minwonBean);
		}catch(Exception e){
			System.out.println("error:"+e.toString());
		}	
		return	null;
	}
}
