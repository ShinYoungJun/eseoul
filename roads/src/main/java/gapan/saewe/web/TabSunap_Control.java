
package main.java.gapan.saewe.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.util.catUtil.Pageing;
import main.java.common.util.catUtil.Util;
import main.java.gapan.saewe.service.ISaeweService;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class TabSunap_Control	extends MultiActionController{

	private	ISaeweService		iSaeweService	= null;
	private	CommonCodeService	commonCode		= null;
	private	Util				util			= new Util();
	private	Pageing				pageing			= new Pageing();
	

	public void setGapan_saeweService(ISaeweService gapan_saeweService) 
	{
		this.iSaeweService = gapan_saeweService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode)
	{
		this.commonCode 	= commonCode;
	}
		
	//	수납정보 (미구현)
	public ModelAndView 	Sunap_View(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
//		System.out.println("!! sunap_View");
		
		return new ModelAndView("/gapan/saewe/tab/sunap_view");
	}
}
