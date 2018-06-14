//	2009		Kim Yun Seo

package main.java.jumyong.minwoninfo.web;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import main.java.jumyong.minwoninfo.model.AppealBean;
import main.java.jumyong.minwoninfo.service.IMinwoninfoService;
import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.util.catUtil.Util;


public class TabJumin_Control	extends MultiActionController 
{
	private	IMinwoninfoService	iMinwoninfoService	= null;
//	private	CommonCodeService	commonCode		= null;
	private	Util				util			= new Util();
	
	
	public void setMinwoninfoService(IMinwoninfoService minwoninfoService) 
	{
		this.iMinwoninfoService = minwoninfoService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode) 
	{
//		this.commonCode 	= commonCode;
	}

	
	//	점용인정보 보기
	public ModelAndView		Jumin_View(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");		
		AppealBean	Bean	= new AppealBean();
		
		try{
			if(userId != null){
				
				String 		adminno 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
				
				//	점용인 정보를 가져온다.
				List		list 	= iMinwoninfoService.executeJumin_View(adminno);				
				
				if(list.size()<=0)
					Bean	= null;
				else
				{
					Bean	= (AppealBean)list.get(0);
					
					//	"-" 추가
					//	SSN
					List	ssn	= util.SubString_SSN(Bean.getSSN());
					if(!ssn.get(0).equals(""))
						Bean.setSSN(ssn.get(0) + "-" + ssn.get(1));
				//	request.setAttribute("jumin_ssn1", ssn.get(0));
				//	request.setAttribute("jumin_ssn2", ssn.get(1));
					
					//	BIZSSN
					List	bizssn	= util.SubString_BIZSSN(Bean.getBIZSSN());
					if(!bizssn.get(0).equals(""))
						Bean.setBIZSSN(bizssn.get(0) + "-" + bizssn.get(1) + "-" + bizssn.get(2));
				//	request.setAttribute("jumin_bizssn1", bizssn.get(0));
				//	request.setAttribute("jumin_bizssn2", bizssn.get(1));
				//	request.setAttribute("jumin_bizssn3", bizssn.get(2));
				}
				
				request.setAttribute("ADMIN_NO", adminno);
				
			}
		}catch(Exception e){
			System.out.println("error:"+e.toString());
		}	
		return new ModelAndView("/jumyong/minwoninfo/tab/jumin_view", "board", Bean);
	}
	
	//	점용인정보 보기 (수정불가능한 화면)	
	public ModelAndView		JuminInfo_View(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");				
		AppealBean	Bean	= new AppealBean();
		
		try{
			if(userId != null){
				
				String 	ADMIN_NO 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
			//	String 	SEQ	 		= ServletRequestUtils.getStringParameter(request, "SEQ", "");
			//	String	currentPage	= ServletRequestUtils.getStringParameter(request, "currentPage", "1");
				
				//	점용인 정보를 가져온다.
				List		list 	= iMinwoninfoService.executeJumin_View(ADMIN_NO);				
				
				if(list.size()<=0)
					Bean	= null;
				else
				{
					Bean	= (AppealBean)list.get(0);
					
					//	"-" 추가
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
			//	request.setAttribute("SEQ", SEQ);
			//	request.setAttribute("currentPage", currentPage);
				
			}
		}catch(Exception e){
			System.out.println("error:"+e.toString());
		}	
		return new ModelAndView("/jumyong/minwoninfo/tab/jumininfo_view", "board", Bean);
	}
	
	//	점용인정보 수정 화면
	public ModelAndView		Jumin_Modify(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");				
		AppealBean	Bean	= new AppealBean();
		
		try{
			if(userId != null){
				String 		adminno 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
				
				//	점용인 정보를 가져온다.
				List		list 	= iMinwoninfoService.executeJumin_View(adminno);
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
					
					List	tel	= util.StringToken_Three(Bean.getTEL());
					if(!tel.get(0).equals("") || !tel.get(1).equals("") || !tel.get(2).equals("")){
						Bean.setTEL1((String)tel.get(0));
						Bean.setTEL2((String)tel.get(1));
						Bean.setTEL3((String)tel.get(2));
					}
					
					List	hp	= util.StringToken_Three(Bean.getHP());
					if(!hp.get(0).equals("") || !hp.get(1).equals("") || !hp.get(2).equals("")){
						Bean.setHP1((String)hp.get(0));
						Bean.setHP2((String)hp.get(1));
						Bean.setHP3((String)hp.get(2));
					}
					
					List	totel	= util.StringToken_Three(Bean.getTOTEL());
					if(!totel.get(0).equals("") || !totel.get(1).equals("") || !totel.get(2).equals("")){
						Bean.setTOTEL1((String)totel.get(0));
						Bean.setTOTEL2((String)totel.get(1));
						Bean.setTOTEL3((String)totel.get(2));
					}
					
					List	tohp	= util.StringToken_Three(Bean.getTOHP());
					if(!tohp.get(0).equals("") || !tohp.get(1).equals("") || !tohp.get(2).equals("")){
						Bean.setTOHP1((String)tohp.get(0));
						Bean.setTOHP2((String)tohp.get(1));
						Bean.setTOHP3((String)tohp.get(2));
					}
				}		
				request.setAttribute("ADMIN_NO", adminno);
			}
		}catch(Exception e){
			System.out.println("error:"+e.toString());
		}	
		return new ModelAndView("/jumyong/minwoninfo/tab/jumin_modify", "board", Bean);
	}
	
	//	점용인정보 수정 처리
	public ModelAndView		Jumin_Modify_Prc(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{		
		try{
			String 		adminno = ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
			
			//	점용인 정보 수정
			Jumin_Modify_Execute(request, response, adminno);
		}catch(Exception e){
			System.out.println("error:"+e.toString());
		}	
		return	Jumin_View(request, response);
	}	
	
	
	//	점용인 정보  수정
	public void		Jumin_Modify_Execute(HttpServletRequest request,HttpServletResponse response, String adminno) throws Exception 
	{
		AppealBean	Bean	= new AppealBean();
		
		try{
			
			bind(request, Bean);
			
			String	jumin_ssn		= "";
			String	jumin_bizssn	= "";
			
			//	"-" 없이 저장
			if(!ServletRequestUtils.getStringParameter(request, "jumin_ssn2", "").equals(""))
				jumin_ssn		= ServletRequestUtils.getStringParameter(request, "jumin_ssn1", "") + ServletRequestUtils.getStringParameter(request, "jumin_ssn2", "");
			if(!ServletRequestUtils.getStringParameter(request, "jumin_bizssn3", "").equals(""))
				jumin_bizssn	= ServletRequestUtils.getStringParameter(request, "jumin_bizssn1", "") + ServletRequestUtils.getStringParameter(request, "jumin_bizssn2", "") + ServletRequestUtils.getStringParameter(request, "jumin_bizssn3", "");
	
			//전화번호
			String tel	= 	"";
			String tel1	=	ServletRequestUtils.getStringParameter(request, "TEL1", "");
			String tel2	=	ServletRequestUtils.getStringParameter(request, "TEL2", "");
			String tel3	=	ServletRequestUtils.getStringParameter(request, "TEL3", "");
			
			if(!tel1.equals("") && !tel2.equals("") && !tel3.equals(""))
				tel		= tel1 + "-" + tel2  + "-" + tel3;
			
			//휴대폰 번호
			String hp		=	"";
			String hp1	=	ServletRequestUtils.getStringParameter(request, "HP1", "");
			String hp2	=	ServletRequestUtils.getStringParameter(request, "HP2", "");
			String hp3	=	ServletRequestUtils.getStringParameter(request, "HP3", "");
			
			if(!hp1.equals("") && !hp2.equals("") && !hp3.equals(""))
				hp		= hp1 + "-" + hp2 + "-" + hp3;
			
			//송달지 전화번호
			String totel	= 	"";
			String totel1	=	ServletRequestUtils.getStringParameter(request, "TOTEL1", "");
			String totel2	=	ServletRequestUtils.getStringParameter(request, "TOTEL2", "");
			String totel3	=	ServletRequestUtils.getStringParameter(request, "TOTEL3", "");
			
			if(!totel1.equals("") && !totel2.equals("") && !totel3.equals(""))
				totel		= totel1 + "-" + totel2  + "-" + totel3;
			
			//송달지 휴대폰 번호
			String tohp		=	"";
			String tohp1	=	ServletRequestUtils.getStringParameter(request, "TOHP1", "");
			String tohp2	=	ServletRequestUtils.getStringParameter(request, "TOHP2", "");
			String tohp3	=	ServletRequestUtils.getStringParameter(request, "TOHP3", "");
			
			if(!tohp1.equals("") && !tohp2.equals("") && !tohp3.equals(""))
				tohp		= tohp1 + "-" + tohp2 + "-" + tohp3;
			
			//기존 허가번호
			String b_permission = ServletRequestUtils.getStringParameter(request, "B_PERMISSION", "");			
			
			Bean.setTEL(tel);
			Bean.setHP(hp);
			Bean.setTOTEL(totel);
			Bean.setTOHP(tohp);						
			
			Bean.setSSN(jumin_ssn);
			Bean.setBIZSSN(jumin_bizssn);
			Bean.setADMIN_NO(adminno);
			Bean.setADDR_CHECK(ServletRequestUtils.getStringParameter(request, "ADDR_CHECK", "0"));
			Bean.setBEFORE_PERMISSION(b_permission);
		
		}catch(Exception e){
			System.out.println("error:"+e.toString());
		}	
		iMinwoninfoService.executeJumin_Modify(Bean);
	}
}
