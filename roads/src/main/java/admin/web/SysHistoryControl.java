package main.java.admin.web;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.java.admin.model.SysConnectBean;
import main.java.admin.model.SysHistoryBean;
import main.java.admin.service.ISysHistoryService;

import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.util.BoardUtil;
import main.java.common.util.Globals;
import main.java.common.util.catUtil.Util;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class SysHistoryControl extends MultiActionController {

	private ISysHistoryService objSysHistoryService = null;
	private	CommonCodeService	commonCode		= null;
	private	Util util = new Util();

	public void setSysHistoryService(ISysHistoryService newSysHistoryService) {
		this.objSysHistoryService = newSysHistoryService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode)
	{
		this.commonCode = commonCode;
	}

	/**
	 * 시스템이력 조회 
	 * 
	 * @param HttpServletRequest 
	 *            request
	 * @param HttpServletResponce
	 *            responce
	 * @return ModelAndView
	 */
	public ModelAndView historyList(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		// 현재 년도
		SimpleDateFormat	formatter 	= new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA );
		Calendar 			cal 		= Calendar.getInstance();
		String	today		= formatter.format(cal.getTime());
		cal.add(Calendar.DATE, -6);
		String	beforeDay		= formatter.format(cal.getTime());
		
		int intCurrentPage = 0;
		int intCountPerPage = 0;
		
		String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
		String strCountPerPage = ServletRequestUtils.getStringParameter(request, "countPerPage", Globals.DEFAULT_COUNTPER_PAGE);		
		String section = ServletRequestUtils.getStringParameter(request,"section","");
		String fromDate = ServletRequestUtils.getStringParameter(request,"fromDate",beforeDay);	
		String toDate = ServletRequestUtils.getStringParameter(request,"toDate",today);	
		String userName = ServletRequestUtils.getStringParameter(request,"userName","");
		String eventType = ServletRequestUtils.getStringParameter(request,"eventType","");		
		String strParams ="&section="+section+"&fromDate="+fromDate+"&toDate="+toDate+"&userName="+userName+"&eventType="+eventType;		
		String strActionUrl = request.getContextPath();
		
		intCurrentPage = Integer.parseInt(strCurrentPage);
		intCountPerPage = Integer.parseInt(strCountPerPage);
		
		int totalCount = objSysHistoryService.getTotalCount(section, removeDash(fromDate), removeDash(toDate), userName, eventType);
		String strPageDivideForm = BoardUtil.getDividePageForm(intCurrentPage,intCountPerPage, strParams,"",strActionUrl, totalCount);

		List		list	= objSysHistoryService.retrieveSysHistoryList(intCurrentPage, intCountPerPage,section, removeDash(fromDate), removeDash(toDate), userName, eventType ); 
		List		blist	= new ArrayList();
		SysHistoryBean	bean	= new SysHistoryBean();
		int			size	= list.size();
	
		for(int i = 0	;	i < size	;	i++)
		{
			bean	= (SysHistoryBean)list.get(i);
			
			if(bean.getREG_DATE() != null)	
				bean.setREG_DATE(util.Date_Paste(bean.getREG_DATE()));
        		
			blist.add(i, bean);
		}
		
		request.setAttribute("section",section);
		request.setAttribute("fromDate",fromDate);
		request.setAttribute("toDate",toDate);
		request.setAttribute("userName",userName);
		request.setAttribute("eventType", commonCode.executeCommonCode("cud_type", eventType, "전체"));	
		request.setAttribute("strPageDivideForm", strPageDivideForm);
		request.setAttribute("listSize",String.valueOf(blist.size()));
		request.setAttribute("totalCount",String.valueOf(totalCount));
		
		return new ModelAndView("/admin/sysHistory", "blist", blist);

	}
	
	/**
	 * 시스템연계이력 조회 
	 * 
	 * @param HttpServletRequest 
	 *            request
	 * @param HttpServletResponce
	 *            responce
	 * @return ModelAndView
	 */

	public ModelAndView connectList(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		// 현재 년도
		SimpleDateFormat	formatter 	= new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA );
		Calendar 			cal 		= Calendar.getInstance();
		String	today		= formatter.format(cal.getTime());
		cal.add(Calendar.DATE, -6);
		String	beforeDay		= formatter.format(cal.getTime());

		int intCurrentPage = 0;
		int intCountPerPage = 0;
		
		String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
		String strCountPerPage = ServletRequestUtils.getStringParameter(request, "countPerPage", Globals.DEFAULT_COUNTPER_PAGE);		
		String systemSet = ServletRequestUtils.getStringParameter(request,"systemSet","");
		String fromDate = ServletRequestUtils.getStringParameter(request,"fromDate",beforeDay);	
		String toDate = ServletRequestUtils.getStringParameter(request,"toDate",today);	
		String userName = ServletRequestUtils.getStringParameter(request,"userName","");
		String result = ServletRequestUtils.getStringParameter(request,"result","");		
		String strParams ="&systemSet="+systemSet+"&fromDate="+fromDate+"&toDate="+toDate+"&userName="+userName+"&result="+result;		
		String strActionUrl = request.getContextPath();
		
		intCurrentPage = Integer.parseInt(strCurrentPage);
		intCountPerPage = Integer.parseInt(strCountPerPage);
	
		int totalCount = objSysHistoryService.getTotalCount1(systemSet, removeDash(fromDate), removeDash(toDate), userName, result);
		String strPageDivideForm = BoardUtil.getDividePageForm(intCurrentPage,intCountPerPage, strParams,"",strActionUrl, totalCount);
		
		List		list	= objSysHistoryService.retrieveSysConnectList(intCurrentPage, intCountPerPage, systemSet, removeDash(fromDate), removeDash(toDate), userName, result ); 
		List		blist	= new ArrayList();
		SysConnectBean	bean	= new SysConnectBean();
		int			size	= list.size();
	
		for(int i = 0	;	i < size	;	i++)
		{
			bean	= (SysConnectBean)list.get(i);
			
			if(bean.getREG_DATE() != null)	
				bean.setREG_DATE(util.Date_Paste(bean.getREG_DATE()));
        		
			blist.add(i, bean);
		}

		request.setAttribute("systemSet", commonCode.executeCommonCode("system_type", systemSet, "전체"));	
		request.setAttribute("fromDate",fromDate);
		request.setAttribute("toDate",toDate);
		request.setAttribute("userName",userName);
		request.setAttribute("result", commonCode.executeCommonCode("result_type", result, "전체"));				
		request.setAttribute("strPageDivideForm", strPageDivideForm);
		request.setAttribute("listSize",String.valueOf(blist.size()));
		request.setAttribute("totalCount",String.valueOf(totalCount));
		
		return new ModelAndView("/admin/sysConnect", "blist", blist);

	}
	
   	/**
   	 * DateFormat 변경
	 */
	public String removeDash(String val1)
	{			
		String[] components = val1.split("-");		
		String returnVal = "";		
		for(int i=0;i<components.length;i++)
			returnVal = returnVal + components[i].toString();
		
		return returnVal;		
	}	
}