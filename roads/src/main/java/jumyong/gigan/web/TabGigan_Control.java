//	2009		Kim Yun Seo

package main.java.jumyong.gigan.web;


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
import main.java.jumyong.gigan.model.AppealBean;
import main.java.jumyong.gigan.model.GiganBean;
import main.java.jumyong.gigan.model.GiyeonBean;
import main.java.jumyong.gigan.model.PlaceBean;
import main.java.jumyong.gigan.service.IGiganService;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class TabGigan_Control	extends MultiActionController{

	private	IGiganService		iGiganervice	= null;
	private	CommonCodeService	commonCode		= null;
	private	Util				util			= new Util();
	private	Pageing				pageing			= new Pageing();
	

	public void setJumyong_giganService(IGiganService jumyong_giganService) 
	{
		this.iGiganervice = jumyong_giganService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode)
	{
		this.commonCode 	= commonCode;
	}
	
	
	//	최근 이력 데이터를 출력한다.
	public ModelAndView 	Gigan_View(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");	
		GiyeonBean	Bean	= new GiyeonBean();
		
		try{
			if(userId != null)
			{
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
				List	list	= iGiganervice.executeGigan_Search(ADMIN_NO, rowCol, rowCol);
				int		size	= list.size();
		
				
				
				for(int i = 0	;	i < size	;	i++)
				{
					Bean	= (GiyeonBean)list.get(i);
						
					Bean.setREGDATE(util.Date_Paste(Bean.getREGDATE()));
					Bean.setBEFORE_FROMDATE(util.Date_Paste(Bean.getBEFORE_FROMDATE()));
					Bean.setBEFORE_TODATE(util.Date_Paste(Bean.getBEFORE_TODATE()));
					Bean.setAFTER_FROMDATE(util.Date_Paste(Bean.getAFTER_FROMDATE()));
					Bean.setAFTER_TODATE(util.Date_Paste(Bean.getAFTER_TODATE()));
				}
				//	기존 점용기간  가져온다.
				List		list_ 	= iGiganervice.executeJumji_View(ADMIN_NO);
				PlaceBean	Bean_	= new PlaceBean();
				
				if(list_.size()<=0)
					Bean_	= null;
				else{
					Bean_	= (PlaceBean)list_.get(0);
					Bean_.setMUL_FROMDATE(util.Date_Paste(Bean_.getMUL_FROMDATE()));		//	점용시작일
					Bean_.setMUL_TODATE(util.Date_Paste(Bean_.getMUL_TODATE()));			//	점용종료일
					
					request.setAttribute("FromDate", Bean_.getMUL_FROMDATE());
					request.setAttribute("ToDate", Bean_.getMUL_TODATE());
				}
						
				request.setAttribute("guNm", userBean.getGU_NM());
				request.setAttribute("ADMIN_NO", ADMIN_NO);
				request.setAttribute("EXT_REGDATE", util.Date_Paste(today));
				request.setAttribute("AFTER_FROMDATE", Bean.getAFTER_FROMDATE());
				request.setAttribute("AFTER_TODATE", Bean.getAFTER_TODATE());
				request.setAttribute("NOTES", Bean.getNOTES());
			}
		}catch(Exception e){
			System.out.println(e.toString());
		}
		return new ModelAndView("/jumyong/gigan/tab/gigan_view", "blist", Bean);
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
		
		// 	ADMIN_BASE UP_DATE 현재 날짜로 수정
		if(result)
			result = iGiganervice.executeGigan_Update(Bean);
		else
			System.out.println("이력 추가 실패!");
			
		//	점용지 정보 수정
		if(result)
			result	= iGiganervice.executeGigan_Ext(Bean);	
		else
			System.out.println("ADMIN_BASE UP_DATE 현재 날짜로 수정 실패!");
		
		if(!result)
			System.out.println("점용지 정보 수정 수정 실패!");
		
		//	뷰화면으로 이동
		return Gigan_View(request, response);
	}
}
