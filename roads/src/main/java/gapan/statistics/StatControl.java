package main.java.gapan.statistics;

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
	public ModelAndView statistics(HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		System.out.println(" : : statistics START : :");
		//	관리자 데이터를 가져온다.
		UserBean	userBean	= new UserBean();
		userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
		String sigu_cd = userBean.getSIGU_CD();
		
		System.out.println(":::::::::::::::::::::::::::::::::::::::"+sigu_cd);
		
        // 현년도 계산
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String toDate = formatter.format(cal.getTime());
        String thisYear = toDate.substring(0, 4);
        cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), 1);
        String fromDate = formatter.format(cal.getTime());
		
		List guCdList = objUserRegService.getNewGuCode();
		
		List taxList = commonCode.getTaxCodeList();
		
		request.setAttribute("YearVal", thisYear);
		request.setAttribute("fromDate", fromDate);
		request.setAttribute("toDate", toDate);
		request.setAttribute("siguCode",sigu_cd);
		request.setAttribute("taxList", taxList);

		
		System.out.println(" : : statistics END : :");
		
	
		return new ModelAndView("/gapan/statistics/all", "guCdList", guCdList);
	}
	
}