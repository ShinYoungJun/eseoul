
package main.java.facility.saewe.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.util.catUtil.Pageing;
import main.java.common.util.catUtil.Util;
import main.java.facility.saewe.service.ISaeweService;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class TabSunap_Control	extends MultiActionController{

	private	ISaeweService		iSaeweService	= null;
	private	CommonCodeService	commonCode		= null;
	private	Util				util			= new Util();
	private	Pageing				pageing			= new Pageing();
	

	public void setFacility_saeweService(ISaeweService facility_saeweService) 
	{
		this.iSaeweService = facility_saeweService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode)
	{
		this.commonCode 	= commonCode;
	}
		
	//	수납정보 (미구현)
	public ModelAndView 	Sunap_View(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		return new ModelAndView("/facility/saewe/tab/sunap_view");
	}
}
