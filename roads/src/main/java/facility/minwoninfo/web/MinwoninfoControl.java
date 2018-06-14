package main.java.facility.minwoninfo.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.util.catUtil.Pageing;
import main.java.common.util.catUtil.Util;
import main.java.facility.minwoninfo.service.IMinwoninfoService;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public	class	MinwoninfoControl	extends MultiActionController
{
	private	IMinwoninfoService	iMinwoninfoService	= null;
	private	CommonCodeService	commonCode			= null;
	private	Util				util				= new Util();
	private	Pageing				pageing				= new Pageing();
	
	
	public void setFacility_minwoninfoService(IMinwoninfoService facility_minwoninfoService)
	{
		this.iMinwoninfoService = facility_minwoninfoService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode)
	{
		this.commonCode 	= commonCode;
	}
	
	
	public ModelAndView	View(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
//		request.setAttribute("ADMIN_NO", "200911680101-2-0019");
		
		return new ModelAndView("/facility/minwoninfo/view");
	}
	
	public ModelAndView	Info_View(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
//		request.setAttribute("ADMIN_NO", "200911680101-2-0019");
		
		return new ModelAndView("/facility/minwoninfo/info_view");
	}
}
