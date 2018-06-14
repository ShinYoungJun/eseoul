
package main.java.facility.gigan.web;


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
import main.java.facility.gigan.model.AppealBean;
import main.java.facility.gigan.model.GiganBean;
import main.java.facility.gigan.model.GiyeonBean;
import main.java.facility.gigan.service.IGiganService;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class TabGigan_Control	extends MultiActionController{

	private	IGiganService		iGiganervice	= null;
	private	CommonCodeService	commonCode		= null;
	private	Util				util			= new Util();
	private	Pageing				pageing			= new Pageing();
	

	public void setFacility_giganService(IGiganService facility_giganService) 
	{
		this.iGiganervice = facility_giganService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode)
	{
		this.commonCode 	= commonCode;
	}
	
	
	//	최근 이력 데이터를 출력한다.
	public ModelAndView 	Gigan_View(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		HttpSession session 	= request.getSession();
		String 	userId	= (String)session.getAttribute("sessionUserId");		
		List		list		= null;
				
		try{
			if(userId != null){
				SimpleDateFormat	formatter 	= new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA );
				Calendar 			cal 		= Calendar.getInstance();
				String	today		= formatter.format(cal.getTime());
				
				String 	ADMIN_NO 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
			
				//	관리자 데이터를 가져온다.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
			
				//	관리자 데이터를 화면에 출력
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
				
				//	데어터의 총갯수
				int		iTotalCnt	= iGiganervice.executeGigan_Count(ADMIN_NO);
				
				//	페이징 처리
				int		rowCol		= pageing.execute(request, iTotalCnt, currentPage, 2);
				
			//	System.out.println("!Gigan_View!!!!!! " + ADMIN_NO + ", " + iTotalCnt);
				
				//	검색한 데이터를 가져온다.
				list	= iGiganervice.executeGigan_Search(ADMIN_NO, rowCol, rowCol);
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
			}
		}catch(Exception e){
			System.out.println(e.toString());
		}	
		
		return new ModelAndView("/facility/gigan/tab/gigan_view", "blist", list);
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
		
		//	이력 추가
		boolean	result	= iGiganervice.executeGigan_Register(Bean);	
			
		//	점용지 정보 수정
		if(result)
			result	= iGiganervice.executeGigan_Ext(Bean);	
		
		//	뷰화면으로 이동
		return Gigan_View(request, response);
	}
}
