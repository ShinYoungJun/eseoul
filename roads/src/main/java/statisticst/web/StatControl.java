package main.java.statisticst.web;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.java.admin.model.SysHistoryBean;
import main.java.admin.service.IUserRegService;
import main.java.common.commonCode.model.UserBean;
import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.util.catUtil.Util;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class StatControl extends MultiActionController {

	private IUserRegService objUserRegService = null;
	private	CommonCodeService	commonCode		= null;
	private	Util util = new Util();
	
	public void setUserRegService(IUserRegService newObjUserRegService) {
		this.objUserRegService = newObjUserRegService;
	}

	public void setCommonCodeService(CommonCodeService commonCode) 
	{
		this.commonCode 	= commonCode;
	}
	
   	/**
   	 * 구코드 조회
 	 * @param HttpServletRequest request 
 	 * @param HttpServletResponse response
	 * @return ModelAndView
	 */
	public ModelAndView getGuCd(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		//	관리자 데이터를 가져온다.
		UserBean	userBean	= new UserBean();
		userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
		String sigu_cd = userBean.getORG_CD();
		
		//현재 년도
		SimpleDateFormat	formatter 	= new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA );
		Calendar 			cal 		= Calendar.getInstance();
		String currentYear = formatter.format(cal.getTime()).substring(0, 4);
		String	today		= currentYear+"-12-31";
		System.out.println(today);
		cal.add(Calendar.DATE, -6);
		String	beforeDay		= currentYear+"-01-01";
		
		String 	fromDate 	= ServletRequestUtils.getStringParameter(request, "fromDate", beforeDay);
		String 	toDate 		= ServletRequestUtils.getStringParameter(request, "toDate", today);
		String 	type 		= ServletRequestUtils.getStringParameter(request, "type", "");
		
		String mode = ServletRequestUtils.getStringParameter(request, "mode","");
		String param;
		
		List guCdList = objUserRegService.getGuCode();
		
		List taxList = commonCode.getTaxCodeList();
		
		List blist = new ArrayList();
		
		int year = Integer.parseInt(getCurrentYear());
		
		for(int i = 0	;	i < 10	;	i++)
		{
			blist.add(i, String.valueOf(year));
			year--;
		}
		
		request.setAttribute("blist",blist);
		request.setAttribute("fromDate", fromDate);
		request.setAttribute("toDate", toDate);
		request.setAttribute("type", commonCode.executeCommonCode("use_type", type , "전체"));	//	점용종류
		request.setAttribute("siguCode",sigu_cd);
		request.setAttribute("taxList", taxList);
		
		if(mode.equals("stat")){
		
			param = "/statistics/statistics";
		}
		else if(mode.equals("purpose")){
			
			param = "/statistics/purpose_view";
		}
		else if(mode.equals("all")){
			
			param = "/statistics/all";
		}
		else{
		
			param = "/statistics/semok_view";
		}
	
		return new ModelAndView(param, "guCdList", guCdList);
	}
	
	public static String getCurrentYear() {
        java.text.SimpleDateFormat dateFormat  = new java.text.SimpleDateFormat("yyyy", java.util.Locale.KOREA);
        return dateFormat.format(new java.util.Date());
    }
}