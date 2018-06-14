//	2009		Kim Yun Seo

package main.java.jumyong.saewe.web;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.java.common.util.catUtil.Pageing;
import main.java.common.util.catUtil.Util;
import main.java.common.commonCode.service.CommonCodeService;
import main.java.jumyong.saewe.model.AppealBean;
import main.java.jumyong.saewe.model.PlaceBean;
import main.java.jumyong.saewe.model.CalculationBean;
import main.java.jumyong.saewe.model.SaeweBean;
import main.java.jumyong.saewe.model.TaxationBean;
import main.java.jumyong.saewe.service.ISaeweService;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class TabSunap_Control	extends MultiActionController{

	private	ISaeweService		iSaeweService	= null;
	private	CommonCodeService	commonCode		= null;
	private	Util				util			= new Util();
	private	Pageing				pageing			= new Pageing();
	

	public void setJumyong_saeweService(ISaeweService jumyong_saeweService) 
	{
		this.iSaeweService = jumyong_saeweService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode)
	{
		this.commonCode 	= commonCode;
	}
		
	//	수납정보 (미구현)
	public ModelAndView 	Sunap_View(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		System.out.println("!! sunap_View");
		
		return new ModelAndView("/jumyong/saewe/tab/sunap_view");
	}
}
