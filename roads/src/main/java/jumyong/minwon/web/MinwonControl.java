//	2009		Kim Yun Seo

package main.java.jumyong.minwon.web;


import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.common.commonCode.model.ContactSysInfoBean;
import main.java.common.commonCode.model.RefDeptCodeBean;
import main.java.common.commonCode.model.UserBean;
import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.util.catUtil.Pageing;
import main.java.common.util.catUtil.Util;
import main.java.jumyong.jumyong.model.ProductBean;
import main.java.jumyong.minwon.model.AppealBean;
import main.java.jumyong.minwon.service.IMinwonService;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;


public class MinwonControl	extends MultiActionController {

	private	IMinwonService		iMinwonService	= null;
	private	CommonCodeService	commonCode		= null;
	private	Util				util			= new Util();
	private	Pageing				pageing			= new Pageing();
	
	
	public void setJumyong_minwonService(IMinwonService jumyong_minwonService) 
	{
		this.iMinwonService = jumyong_minwonService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode) 
	{
		this.commonCode 	= commonCode;
	}
	
	//	민원조회 검색 및 리스트(새올 데이터를 가져온다)
	public ModelAndView 	Search(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{		
		HttpSession session = request.getSession();		
		String 		userId	= (String)session.getAttribute("sessionUserId");							
		List list = null;
		
		try{
			if(userId != null){

				SOWNN00214Control	sown00214Control	= new SOWNN00214Control();
					
				SimpleDateFormat	formatter 	= new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA );
				Calendar 			cal 		= Calendar.getInstance();
				String	today					= formatter.format(cal.getTime());
				cal.add(Calendar.DATE, -2);
				String	beforeDay				= formatter.format(cal.getTime());
				
				
				String 	LISTVIEW	= ServletRequestUtils.getStringParameter(request, "LISTVIEW", "0");
				String 	GIGAN1 		= ServletRequestUtils.getStringParameter(request, "GIGAN1", beforeDay);
				String 	GIGAN2 		= ServletRequestUtils.getStringParameter(request, "GIGAN2", today);
				String 	MIN_NAME 	= ServletRequestUtils.getStringParameter(request, "MIN_NAME", "");
		//		String 	MIN_REQNO 	= ServletRequestUtils.getStringParameter(request, "MIN_REQNO", "");
				String 	MIN_CHECK 	= ServletRequestUtils.getStringParameter(request, "MIN_CHECK", "");
				String 	MIN_PROCESS	= ServletRequestUtils.getStringParameter(request, "MIN_PROCESS", "");
		
				int	 	currentPage	= Integer.parseInt(ServletRequestUtils.getStringParameter(request, "currentPage", "1"));
				
				request.setAttribute("check_yn", commonCode.executeCommonCode("check_yn", MIN_CHECK, "전체"));	//	접수
				request.setAttribute("process_flag", commonCode.executeCommonCode("process_flag", MIN_PROCESS, "전체"));	//	처리
				request.setAttribute("GIGAN1", GIGAN1);
				request.setAttribute("GIGAN2", GIGAN2);
				request.setAttribute("MIN_NAME", MIN_NAME);
		//		request.setAttribute("MIN_REQNO", MIN_REQNO);
				/*
				if(LISTVIEW.trim().equals("0"))	//	이 페이지를 처음 시작할때는 빈페이지를 출력한 다음 다시 이 페이지를 호출한다.
				{
					request.setAttribute("LISTVIEW", "0");
					request.setAttribute("currentPage", "1");
					request.setAttribute("totalcnt", "0");
					return new ModelAndView("/jumyong/minwon/search");
				}
				*/
				//	새올 데이터를 가져온다
		//		List	list	= sown00214Control.SaewolList(util.Date_Cut(GIGAN1), util.Date_Cut(GIGAN2), MIN_REQNO, MIN_NAME, currentPage, 10);
		
				//세션에서 시도 코드를 가져온다.
				String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				String dept_cd = (String)session.getAttribute("dept_cd");
				
				//관리자 데이터를 가져온다.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
				System.out.println("SIDO_CD== " + SIDO_CD);
				System.out.println("userBean.getSIGU_CD()== " + userBean.getSIGU_CD());
				System.out.println("dept_cd=== " + dept_cd);
				ContactSysInfoBean contactSysInfoBean = commonCode.executeContactsys_Info(SIDO_CD, userBean.getSIGU_CD());
				RefDeptCodeBean refDeptCodeBean = commonCode.getRef_DeptCode(SIDO_CD + userBean.getSIGU_CD());

				int	iTotalCnt = 0;
				
				if(!refDeptCodeBean.getORG_CD().equals("0000000")){

				list	= sown00214Control.SaewolList(util.Date_Cut(GIGAN1), util.Date_Cut(GIGAN2), MIN_NAME, currentPage, 10
						,contactSysInfoBean.getSAEALL_IP(),contactSysInfoBean.getSAEALL_PATH(),contactSysInfoBean.getSAEALL_PORT()
						//,refDeptCodeBean.getDEPT_CD()
						,dept_cd
						,refDeptCodeBean.getORG_CD());
				
				
				iTotalCnt	= sown00214Control._Size;
				}
				
				//	페이징 처리
				pageing.execute(request, iTotalCnt, currentPage, 10);
		
				AppealBean	Bean	= new AppealBean();
				int			size	= list.size();
			//	String		yn		= "1";
		
				for(int i = 0	;	i < size	;	i++)
				{
					Bean	= (AppealBean)list.get(i);
		
		     //   	if(Bean.getTODATE() == null	||	Bean.getTODATE().trim().equals(""))
		     //   		yn	= "0";
		
		        	Bean.setREQ_DATE(util.Date_Paste(Bean.getREQ_DATE()));	//	접수일자
		        	Bean.setTODATE(util.Date_Paste(Bean.getTODATE()));		//	처리일자
				}
				
				request.setAttribute("LISTVIEW", "1");
				
				sown00214Control	= null;
				
			}
		}catch(Exception e)
		{
			logger.error(e.getMessage(), e);
		}	
		return new ModelAndView("/jumyong/minwon/search", "blist", list);
	}

	//	상세보기
	public ModelAndView		View(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		HttpSession session = request.getSession();		
		String 		userId	= (String)session.getAttribute("sessionUserId");							
		
		try{
			if(userId != null){
				String 	ADMIN_NO	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
				String 	GIGAN1 		= ServletRequestUtils.getStringParameter(request, "GIGAN1", "");
				String 	GIGAN2 		= ServletRequestUtils.getStringParameter(request, "GIGAN2", "");
				String 	MIN_NAME 	= ServletRequestUtils.getStringParameter(request, "MIN_NAME", "");
				String 	MIN_REQNO 	= ServletRequestUtils.getStringParameter(request, "MIN_REQNO", "");
				String 	MIN_CHECK 	= ServletRequestUtils.getStringParameter(request, "MIN_CHECK", "");
				String 	MIN_PROCESS	= ServletRequestUtils.getStringParameter(request, "MIN_PROCESS", "");
				
				request.setAttribute("ADMIN_NO", ADMIN_NO);
				request.setAttribute("MIN_CHECK", MIN_CHECK);		//	접수
				request.setAttribute("MIN_PROCESS", MIN_PROCESS);	//	처리
				request.setAttribute("GIGAN1", GIGAN1);
				request.setAttribute("GIGAN2", GIGAN2);
				request.setAttribute("MIN_NAME", MIN_NAME);
				request.setAttribute("MIN_REQNO", MIN_REQNO);
				
			//	System.out.println("!!!!!!!!!!!!//	상세보기!!!!!!!!! : " + ADMIN_NO);
			}
		}catch(Exception err)
		{
			System.out.println("error:"+err.toString());
		}
		return new ModelAndView("/jumyong/minwon/view");
	}

	
	//	신규 등록 페이지
	public ModelAndView		Register(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		System.out.println("MinwonControl.Register");
		//	 삭제 세션
	//	HttpSession session = request.getSession();
	//	session.setAttribute("sessionUserId", "장구경");
		
		return new ModelAndView("/jumyong/minwon/register");
	}

	
//	//	ADMIN_BASE 등록
//	public String	Admin_Base_Register_Execute(HttpServletRequest request, HttpServletResponse response) throws Exception 
//	{
//		//	세션에서 시도 코드를 가져온다.
//		String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
//		
//		//	관리자 데이터를 가져온다.
//		UserBean	userBean	= new UserBean();
//		userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
//
//		String 	REGDATE 	= ServletRequestUtils.getStringParameter(request, "REQ_DATE", "");
//		String 	MANAGER 	= ServletRequestUtils.getStringParameter(request, "MANAGER", "");
//		
//		String 	BJ_CD 	= ServletRequestUtils.getStringParameter(request, "BJ_CD", "");
//		String 	TYPE 	= ServletRequestUtils.getStringParameter(request, "TYPE", "");
//		String 	SI_CD 	= SIDO_CD;	//	시도 코드를 가져온다.
//		String 	GU_CD 	= userBean.getSIGU_CD();
//		
//		Admin_BaseBean	Bean	= new Admin_BaseBean();
//
//		//	관리자 번호 생성
//		String	adminno	= Adminno_Maker(SI_CD, GU_CD, BJ_CD, TYPE);
//		Bean.setADMIN_NO(adminno);
////		Bean.setSEQ("0");
//		Bean.setREGDATE(util.Date_Cut(REGDATE));
//		Bean.setUP_DATE(util.Date_Cut(REGDATE));
//		Bean.setMANAGER(MANAGER);
//		Bean.setFINISH_ID("ADMIN");
//		Bean.setCHECK_YN("0");
//		
//		//	ADMIN_BASE 테이블에 더이터를 등록한다.
//		boolean	result	= iMinwonService.executeAdmin_Base_Register(Bean);
//		
//		if(result == false)
//			return	null;
//		
//		return	adminno;
//	}
	
//	//	민원등록 추가
//	public String		Appeal_Register_Execute(HttpServletRequest request,HttpServletResponse response, String adminno) throws Exception 
//	{
//		//	세션에 있는 관리자 데이터를 가져온다.
//		UserBean	userBean	= new UserBean();
//		userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
//		
//		AppealBean	appealBean	= new AppealBean();
//		bind(request, appealBean);
//		
//		//	"-" 을 삭제한다.
//		//	주민번호
//		String	jumin_ssn		= "";
//		if(!ServletRequestUtils.getStringParameter(request, "jumin_ssn2", "").equals(""))
//			jumin_ssn		= ServletRequestUtils.getStringParameter(request, "jumin_ssn1", "") + ServletRequestUtils.getStringParameter(request, "jumin_ssn2", "");
//	
//		//	사업자 등록번호
//		String	jumin_bizssn	= "";
//		if(!ServletRequestUtils.getStringParameter(request, "jumin_bizssn3", "").equals(""))
//			jumin_bizssn	= ServletRequestUtils.getStringParameter(request, "jumin_bizssn1", "") + ServletRequestUtils.getStringParameter(request, "jumin_bizssn2", "") + ServletRequestUtils.getStringParameter(request, "jumin_bizssn3", "");
//
//		//	민원 전화번호
//		String	min_agent_tel	= "";
//		if(!ServletRequestUtils.getStringParameter(request, "min_agent_tel3", "").equals(""))
//		{
//			min_agent_tel	= ServletRequestUtils.getStringParameter(request, "min_agent_tel1", "") + "-" +
//			ServletRequestUtils.getStringParameter(request, "min_agent_tel2", "") + "-" +
//				ServletRequestUtils.getStringParameter(request, "min_agent_tel3", "");
//		}
//		
//		//	점용인 전화번호
//		String	jumin_tel	= "";
//		if(!ServletRequestUtils.getStringParameter(request, "jumin_tel3", "").equals(""))
//		{
//			jumin_tel	= ServletRequestUtils.getStringParameter(request, "jumin_tel1", "") + "-" +
//			ServletRequestUtils.getStringParameter(request, "jumin_tel2", "") + "-" +
//				ServletRequestUtils.getStringParameter(request, "jumin_tel3", "");
//		}
//		
//		//	점용인 휴대폰
//		String	jumin_hp	= "";
//		if(!ServletRequestUtils.getStringParameter(request, "jumin_hp3", "").equals(""))
//		{
//			jumin_hp	= ServletRequestUtils.getStringParameter(request, "jumin_hp1", "") + "-" +
//			ServletRequestUtils.getStringParameter(request, "jumin_hp2", "") + "-" +
//				ServletRequestUtils.getStringParameter(request, "jumin_hp3", "");
//		}
//		
//		//	점용인 수령인 전화번호
//		String	jumin_totel	= "";
//		if(!ServletRequestUtils.getStringParameter(request, "jumin_totel3", "").equals(""))
//		{
//			jumin_totel	= ServletRequestUtils.getStringParameter(request, "jumin_totel1", "") + "-" +
//			ServletRequestUtils.getStringParameter(request, "jumin_totel2", "") + "-" +
//				ServletRequestUtils.getStringParameter(request, "jumin_totel3", "");
//		}
//		
//		//	점용인 수령인 휴대폰
//		String	jumin_tohp	= "";
//		if(!ServletRequestUtils.getStringParameter(request, "jumin_tohp3", "").equals(""))
//		{
//			jumin_tohp	= ServletRequestUtils.getStringParameter(request, "jumin_tohp1", "") + "-" +
//			ServletRequestUtils.getStringParameter(request, "jumin_tohp2", "") + "-" +
//				ServletRequestUtils.getStringParameter(request, "jumin_tohp3", "");
//		}
//		
//		appealBean.setSSN(jumin_ssn);
//		appealBean.setBIZSSN(jumin_bizssn);
//		
//		appealBean.setAGENT_TEL(min_agent_tel);
//		appealBean.setTEL(jumin_tel);
//		appealBean.setHP(jumin_hp);
//		appealBean.setTOTEL(jumin_totel);
//		appealBean.setTOHP(jumin_tohp);
//		
//		
//		appealBean.setREQ_DATE(util.Date_Cut(appealBean.getREQ_DATE()));	//	접수일자
//		appealBean.setPREDATE(util.Date_Cut(appealBean.getPREDATE()));		//	처리예정일자
//		appealBean.setTODATE(util.Date_Cut(appealBean.getTODATE()));		//	처리만료일자
//		
//		appealBean.setREQ_CK("1");
//		appealBean.setGU_CODE("IN" + userBean.getSIGU_CD());
//		
//		//	관리자 번호 생성
//		appealBean.setADMIN_NO(adminno);
//		
//		//	점용인 테이블에 저장(APPEAL => 나중에 APPEAL_INFO 로 변경 가능)
//		iMinwonService.executeAppeal_Register(appealBean);
//		
//
//		return	null;
//	}
	

//	//	민원등록 추가
//	public boolean		Place_Register_Execute(HttpServletRequest request,HttpServletResponse response, String adminno) throws Exception 
//	{
//		//	세션에서 시도 코드를 가져온다.
//		String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
//		
//		//	세션에 있는 관리자 데이터를 가져온다.
//		UserBean	userBean	= new UserBean();
//		userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
//
//		PlaceBean	palceBean	= new PlaceBean();
//		bind(request, palceBean);
//		palceBean.setADMIN_NO(adminno);
//		
//		palceBean.setMUL_FROMDATE(util.Date_Cut(palceBean.getMUL_FROMDATE()));		//	점용시작일
//		palceBean.setMUL_TODATE(util.Date_Cut(palceBean.getMUL_TODATE()));			//	점용종료일
//		palceBean.setWORK_FROMDATE(util.Date_Cut(palceBean.getWORK_FROMDATE()));	//	공사 시작일
//		palceBean.setWORK_TODATE(util.Date_Cut(palceBean.getWORK_TODATE()));		//	공사 종료일
//		palceBean.setFINISH_DATE(util.Date_Cut(palceBean.getFINISH_DATE()));		//	준공일자
//		
//		palceBean.setSIDO(SIDO_CD);
//		palceBean.setSIGUNGU(userBean.getSIGU_CD());
//		
//		//	점용지 정보 저장(PLACE => 나중에 PLACE_INFO 로 변경 가능)
//		return	iMinwonService.executePlace_Register(palceBean);
//	}
	
	//	관리 번호 생성
	private	String	Adminno_Maker(String SI_CD, String GU_CD, String BJ_CD, String TYPE)
	{
		String	ADMIN_NO	= null;
		try{
			Calendar 	cal 	= Calendar.getInstance();
				
			String	Year		= Integer.toString(cal.get(Calendar.YEAR));
			String	Si			= SI_CD;
			String	Gu			= GU_CD;
			String	Bj			= BJ_CD.substring(0, 3);
			String	Type		= TYPE;
			String	Seq			= null;
			int		Count		= iMinwonService.executeCheck_AdminnoCount(BJ_CD);
			int		Result		= 0;
			
			//	예외로 동일 관리번호가 있을경우, 다시 번호를 생성하고 같은 관리번호가 있는지 확인한다.
			for(int i = 0	;	i < 10	;	i++)
			{
				Count	+= (10001 + i);
				Seq		= Integer.toString(Count).substring(1, 5);
				
				ADMIN_NO	= Year + Si + Gu + Bj + "-" + Type + "-" + Seq;
				
				//	같은 관리번호가 있는지 확인
				Result	= iMinwonService.executeCheck_Adminno(ADMIN_NO);
				
				if(Result	== 0)
					break;
			}
			
			//System.out.println(" 신규 관리번호 : " + ADMIN_NO);
		}catch(Exception err)
		{
			System.out.println("error:"+err.toString());
		}
		return	ADMIN_NO;
	}
	
	
	
//	//	새올연동
//	//	신규등록 (민원, 점용인, 점용지) 새울에서 가져온 데이터를 등록한다.
//	public ModelAndView		RegisterPrc_Saewol(HttpServletRequest request,HttpServletResponse response) throws Exception 
//	{
//		//	새올과 연동해서 가져온 데이터를 ADMIN_BASE 에 저장한다.
//		String	adminno	= AdminBase_RegisterSaewol_Execute(request, response); 
//		
//		if(adminno	!=	null)
//		{
//			//	새올과 연동해서 가져온 데이터를 APPEAL 에 저장한다.
//			Appeal_RegisterSaewol_Execute(request, response, adminno);
//	
//			//	새올과 연동해서 가져온 데이터를 PLACE 에 저장한다.
//			Place_Register_Execute(request, response, adminno);
//		}
//
//		return Search(request, response);
//	}
	
//	//	민원등록 추가
//	public String	AdminBase_RegisterSaewol_Execute(HttpServletRequest request, HttpServletResponse response) throws Exception 
//	{
//		//	properties 파일에 있는 시도 코드를 가져온다.
//		String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
//		
//		//	관리자 데이터를 가져온다.
//		UserBean	userBean	= new UserBean();
//		userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
//
//		String 	REGDATE 	= ServletRequestUtils.getStringParameter(request, "REQ_DATE", "");
//		System.out.println(" REGDATE : " + REGDATE);
//		
//		String 	MANAGER 	= ServletRequestUtils.getStringParameter(request, "MANAGER", "");
//		
//		String 	BJ_CD 	= ServletRequestUtils.getStringParameter(request, "BJ_CD", "");
//		String 	TYPE 	= ServletRequestUtils.getStringParameter(request, "TYPE", "");
//		String 	SI_CD 	= SIDO_CD;	//	시도 코드를 가져온다.
//		String 	GU_CD 	= userBean.getSIGU_CD();
//		
//		System.out.println(" GU_CD : " + GU_CD);
//		
//		Admin_BaseBean	Bean	= new Admin_BaseBean();
//		
//		//	관리자 번호 생성
//		String	adminno	= Adminno_Maker(SI_CD, GU_CD, BJ_CD, TYPE);
//		Bean.setADMIN_NO(adminno);
////		Bean.setSEQ("0");
//		Bean.setREGDATE(util.Date_Cut(REGDATE));
//		Bean.setUP_DATE(util.Date_Cut(REGDATE));
//		Bean.setMANAGER(MANAGER);
//		Bean.setFINISH_ID("ADMIN");
//		Bean.setCHECK_YN("0");
//	
//		//	ADMIN_BASE 에 저장한다.
//		boolean	result	= iMinwonService.executeAdmin_Base_Register(Bean);
//		
//		if(result == false)
//			return	null;
//		
//		return	adminno;
//	}
	
	
//	//	민원등록 추가
//	public String		Appeal_RegisterSaewol_Execute(HttpServletRequest request,HttpServletResponse response, String adminno) throws Exception 
//	{
//		//	관리자 데이터를 가져온다.
//		UserBean	userBean	= new UserBean();
//		userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
//		
//		AppealBean	appealBean	= new AppealBean();
//		bind(request, appealBean);
//		
//		//	"-" 을 삭제 한다.
//		String	jumin_ssn		= "";
//		if(!ServletRequestUtils.getStringParameter(request, "jumin_ssn2", "").equals(""))
//			jumin_ssn		= ServletRequestUtils.getStringParameter(request, "jumin_ssn1", "") + ServletRequestUtils.getStringParameter(request, "jumin_ssn2", "");
//	
//		String	jumin_bizssn	= "";
//		if(!ServletRequestUtils.getStringParameter(request, "jumin_bizssn3", "").equals(""))
//			jumin_bizssn	= ServletRequestUtils.getStringParameter(request, "jumin_bizssn1", "") + ServletRequestUtils.getStringParameter(request, "jumin_bizssn2", "") + ServletRequestUtils.getStringParameter(request, "jumin_bizssn3", "");		
//
//		appealBean.setSSN(jumin_ssn);
//		appealBean.setBIZSSN(jumin_bizssn);
//		
//		appealBean.setREQ_DATE(util.Date_Cut(appealBean.getREQ_DATE()));	//	접수일자
//		appealBean.setPREDATE(util.Date_Cut(appealBean.getPREDATE()));		//	처리예정일자
//		appealBean.setTODATE(util.Date_Cut(appealBean.getTODATE()));		//	처리만료일자
//		
//		appealBean.setREQ_CK("1");
//		appealBean.setGU_CODE("IN" + userBean.getSIGU_CD());
//		
//		appealBean.setADMIN_NO(adminno);
//
//		//	점용인 데이터 저장
//		iMinwonService.executeAppeal_Register(appealBean);
//
//		return	null;
//	}
}
