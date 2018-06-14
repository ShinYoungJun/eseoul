//	2009		Kim Yun Seo

package main.java.junggi.gigan.web;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.common.util.catUtil.Pageing;
import main.java.common.util.catUtil.Util;
import main.java.common.commonCode.model.UserBean;
import main.java.common.commonCode.service.CommonCodeService;
import main.java.junggi.gigan.model.AppealBean;
import main.java.junggi.gigan.model.GiganBean;
import main.java.junggi.gigan.model.GiyeonBean;
import main.java.junggi.gigan.service.IGiganService;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class TabGigan_Control	extends MultiActionController{

	private	IGiganService		iGiganervice	= null;
	private	CommonCodeService	commonCode		= null;
	private	Util				util			= new Util();
	private	Pageing				pageing			= new Pageing();
	

	public void setJunggi_giganService(IGiganService junggi_giganService) 
	{
		this.iGiganervice = junggi_giganService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode)
	{
		this.commonCode 	= commonCode;
	}
	
	
	//	최근 이력 데이터를 출력한다.
	public ModelAndView 	Gigan_View(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		SimpleDateFormat	formatter 	= new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA );
		Calendar 			cal 		= Calendar.getInstance();
		String	today		= formatter.format(cal.getTime());
		
		String 	ADMIN_NO 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
	
		//	관리자 데이터를 가져온다.
		UserBean	userBean	= new UserBean();
		userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
		
		if(userBean	!= null)
		{
		//	System.out.println(userBean.getNAME());
			
			request.setAttribute("MANAGER", userBean.getNAME());
			request.setAttribute("TEL", userBean.getTEL());
			request.setAttribute("GU_NM", userBean.getGU_NM());
			request.setAttribute("DEPT_NM", userBean.getDEPT_NM());
		}

		
		//	점용기간연장 데이터를 출력한다.
		int	 	currentPage	= Integer.parseInt(ServletRequestUtils.getStringParameter(request, "currentPage", "1"));
		int		iTotalCnt	= iGiganervice.executeGigan_Count(ADMIN_NO);
		int		rowCol		= pageing.execute(request, iTotalCnt, currentPage, 2);
		
	//	System.out.println("!Gigan_View!!!!!! " + ADMIN_NO + ", " + iTotalCnt);
		
		List	list	= iGiganervice.executeGigan_Search(ADMIN_NO, rowCol, rowCol);
		int		size	= list.size();

		GiyeonBean	Bean	= new GiyeonBean();
		
		for(int i = 0	;	i < size	;	i++)
		{
			Bean	= (GiyeonBean)list.get(i);
				
			Bean.setREGDATE(util.Date_Paste(Bean.getREGDATE()));
			Bean.setBEFORE_FROMDATE(util.Date_Paste(Bean.getBEFORE_FROMDATE()));
			Bean.setBEFORE_TODATE(util.Date_Paste(Bean.getBEFORE_TODATE()));
			Bean.setAFTER_FROMDATE(util.Date_Paste(Bean.getAFTER_FROMDATE()));
			Bean.setAFTER_TODATE(util.Date_Paste(Bean.getAFTER_TODATE()));
		}
		
		request.setAttribute("ADMIN_NO", ADMIN_NO);
		request.setAttribute("EXT_REGDATE", util.Date_Paste(today));
		
		return new ModelAndView("/junggi/gigan/tab/gigan_view", "blist", list);
	}
	
	
	//	기간을 연장한다.
	public ModelAndView 	Gigan_Register(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		String 	ADMIN_NO 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
		String 	MANAGER 	= ServletRequestUtils.getStringParameter(request, "MANAGER", "");
		String 	REGDATE 	= ServletRequestUtils.getStringParameter(request, "EXT_REGDATE", "");
		String 	FROMDATE 	= ServletRequestUtils.getStringParameter(request, "EXT_FROMDATE", "");
		String 	TODATE	 	= ServletRequestUtils.getStringParameter(request, "EXT_TODATE", "");
		String 	NOTES	 	= ServletRequestUtils.getStringParameter(request, "EXT_NOTES", "");
		
		REGDATE		= util.Date_Cut(REGDATE);
		FROMDATE	= util.Date_Cut(FROMDATE);
		TODATE		= util.Date_Cut(TODATE);
		
		GiyeonBean	Bean	= new GiyeonBean();
		
		Bean.setADMIN_NO(ADMIN_NO);
		Bean.setREGDATE(REGDATE);
		Bean.setAFTER_FROMDATE(FROMDATE);
		Bean.setAFTER_TODATE(TODATE);
		Bean.setNOTES(NOTES);
		Bean.setMANAGER(MANAGER);
		
		boolean	result	= iGiganervice.executeGigan_Register(Bean);	//	이력 추가
			
		if(result)
			result	= iGiganervice.executeGigan_Ext(Bean);	//	점용지 정보 수정
		
		return Gigan_View(request, response);
	}
}
