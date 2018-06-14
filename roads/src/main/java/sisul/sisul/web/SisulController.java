//	2009		Kim Yun Seo
//	사용안함...
package main.java.sisul.sisul.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.java.common.util.catUtil.Pageing;
import main.java.common.util.catUtil.Util;
import main.java.common.commonCode.service.CommonCodeService;

import main.java.sisul.sisul.model.AppealBean;
import main.java.sisul.sisul.model.EqCalculationBean;
import main.java.sisul.sisul.service.ISisulService;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class SisulController	extends MultiActionController{

	private	ISisulService		iSisulService	= null;
	private	CommonCodeService	commonCode		= null;
	private	Util				util			= new Util();
	private	Pageing				pageing			= new Pageing();
	
	public void setSisulService(ISisulService sisulService)
	{
		this.iSisulService = sisulService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode)
	{
		this.commonCode 	= commonCode;
	}
	
	public ModelAndView 	Search(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		int	currentPage	= Integer.parseInt(ServletRequestUtils.getStringParameter(request, "currentPage", "1"));
		
		int	iTotalCnt	= iSisulService.executeCount();
		int	rowCol		= pageing.execute(request, iTotalCnt, currentPage, 10);
		
		request.setAttribute("use_type", commonCode.executeCommonCode("use_type", null, "전체"));
		request.setAttribute("occupancy_type", commonCode.executeCommonCode("occupancy_type", null, "전체"));
		request.setAttribute("use_owner_Group", commonCode.executeCommonCode("use_ownerGroup", null, "전체"));
		request.setAttribute("taxation_section", commonCode.executeCommonCode("taxation_section", null, "전체"));
		
		request.setAttribute("bjdong_code", commonCode.executeBJDongCode("서울", "강남구", null));
		request.setAttribute("hjdong_code", commonCode.executeHJDongCode("서울", "강남구", null));	
		
		return new ModelAndView("/sisul/sisul/search", "blist", 
				iSisulService.executeSearch(rowCol, rowCol + 9));
	}

	
	public ModelAndView 	View(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		String 	ADMIN_NO 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");

		return new ModelAndView("/sisul/sisul/view", "ADMIN_NO", ADMIN_NO);
	}
	
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////
	//	점용인정보 보기
	public ModelAndView		Jumin_View(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		String 		adminno 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
		
		List		list 	= iSisulService.executeJumin_View(adminno);
		AppealBean	Bean	= new AppealBean();
		
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
		
		return new ModelAndView("/sisul/sisul/tab/jumin_view");//, "board", Bean);
	}
	
	//	점용인정보 수정
	public ModelAndView		Jumin_Modify(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		String 		adminno 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
		
		List		list 	= iSisulService.executeJumin_View(adminno);
		AppealBean	Bean	= (AppealBean)list.get(0);
		
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
		
		return new ModelAndView("/sisul/sisul/tab/jumin_modify", "board", Bean);
	}
	
	//	점용인정보 수정 처리
	public ModelAndView		Jumin_Modify_Prc(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{		
		String 		adminno = ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
		
		Jumin_Modify_Execute(request, response, adminno);
		
		return	Jumin_View(request, response);
	}
	
	
	//	점용지정보 보기
	public ModelAndView		Jumji_View(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		String 		adminno 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");

		request.setAttribute("ADMIN_NO", adminno);
		
		return new ModelAndView("/sisul/sisul/tab/jumji_view");
	}
	
	//	점용지정보 보기
	public ModelAndView		Jumji_Modify(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		String 		adminno 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");

		request.setAttribute("ADMIN_NO", adminno);
		
		return new ModelAndView("/sisul/sisul/tab/jumji_modify");
	}
	
	//	점용지정보 보기
	public ModelAndView		Jumji_Modify_Prc(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		String 		adminno 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");

		request.setAttribute("ADMIN_NO", adminno);
		
		return new ModelAndView("/sisul/sisul/tab/jumji_modify_prc");
	}
	
	
	
	//	물건정보
	public ModelAndView 	Mulgun_View(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		String 	ADMIN_NO 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");

		return new ModelAndView("/sisul/sisul/tab/mulgun_view", "ADMIN_NO", ADMIN_NO);
	}	
	
	
	//	물건정보 추가 
	public ModelAndView 	Mulgun_Register(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		String 	ADMIN_NO 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");

		return new ModelAndView("/sisul/sisul/tab/mulgun_register", "ADMIN_NO", ADMIN_NO);
	}
	
	public ModelAndView 	Mulgun_Register_Prc(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		String 	ADMIN_NO 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
		
		EqCalculationBean	Bean	= new EqCalculationBean();
		
		bind(request, Bean);
		
		iSisulService.executeMulgun_Register(Bean);

		return Mulgun_View(request, response);
	}
	
	
	//	 산출 내역
	public ModelAndView 	Sanchul_View(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		String 	ADMIN_NO 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
		
		request.setAttribute("ADMIN_NO", ADMIN_NO);

		return new ModelAndView("/sisul/sisul/tab/sanchul_view");
	}
	
	
	//	부과정보 보기
	public ModelAndView		Bugwa_View(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		String 		adminno 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");

		request.setAttribute("ADMIN_NO", adminno);
		
		return new ModelAndView("/sisul/sisul/tab/bugwa_view");
	}
	
	
	//	수납정보 보기
	public ModelAndView		Sunap_View(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		String 		adminno 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");

		request.setAttribute("ADMIN_NO", adminno);
		
		return new ModelAndView("/sisul/sisul/tab/sunap_view");
	}
	
	
	
	//	신규 등록 페이지
	public 	ModelAndView	Register(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		request.setAttribute("use_type", commonCode.executeCommonCode("use_type", null, "선택"));
		request.setAttribute("occupancy_type", commonCode.executeCommonCode("occupancy_type", null, "선택"));
		request.setAttribute("use_owner_Group", commonCode.executeCommonCode("use_ownerGroup", null, "선택"));
		request.setAttribute("taxation_section", commonCode.executeCommonCode("taxation_section", null, "선택"));
		
		request.setAttribute("bjdong_code", commonCode.executeBJDongCode("서울", "강남구", null));
		request.setAttribute("hjdong_code", commonCode.executeHJDongCode("서울", "강남구", null));
		
		return new ModelAndView("/sisul/sisul/register");
	}

	public 	ModelAndView	Register_Prc(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		
		return Search(request, response);
	}
	
	
	//	점용인 정보  수정
	public void		Jumin_Modify_Execute(HttpServletRequest request, HttpServletResponse response, String adminno) throws Exception 
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
		
		iSisulService.executeJumin_Modify(Bean);
	}
}
