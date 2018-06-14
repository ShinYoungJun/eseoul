//	2009		Kim Yun Seo

package main.java.facility.minwon.web;


import java.io.StringReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.common.commonCode.model.ContactSysInfoBean;
import main.java.common.commonCode.model.RefDeptCodeBean;
import main.java.common.commonCode.model.UserBean;
import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.util.catUtil.Util;
import main.java.facility.minwon.model.Admin_BaseBean;
import main.java.facility.minwon.model.AppealBean;
import main.java.facility.minwon.model.MinwonBean;
import main.java.facility.minwon.model.PlaceBean;
import main.java.facility.minwon.service.IMinwonService;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;


public class TabInfo_Control	extends MultiActionController {

	private	IMinwonService		iMinwonService	= null;
	private	CommonCodeService	commonCode		= null;
	private	Util				util			= new Util();
//	private	Pageing				pageing			= new Pageing();
	
	
	public void setFacility_minwonService(IMinwonService facility_minwonService) 
	{
		this.iMinwonService = facility_minwonService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode) 
	{
		this.commonCode 	= commonCode;
	}
	
	/*
	 * 사용 테이블
	 * EQUIP_ADMIN_BASE
	 * MINWON_INFO
	 * EQUIP_APPEAL
	 * EQUIP_PLACE
	 */
	//	 신규 등록
	public	ModelAndView Register(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		System.out.println(">> Register");
		
		//	 삭제 세션
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		List	list = null;
		
		try{
		
			if(userId != null)
			{
				//	세션에서 시도 코드를 가져온다.
				String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				
				//	관리자 데이터를 가져온다.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
				if(userBean	!= null)
				{
					request.setAttribute("MANAGER_MIN", userBean.getNAME());
					request.setAttribute("SIGUNGU", userBean.getGU_NM());
					request.setAttribute("MANAGE_DEP_MIN", userBean.getDEPT_NM());
				}
		
				request.setAttribute("use_type", commonCode.executeCommonCode("use_type", null, "선택"));
				request.setAttribute("occupancy_type", commonCode.executeCommonCode("occupancy_type", null, "선택"));
				request.setAttribute("use_owner_Group", commonCode.executeCommonCode("use_ownerGroup", null, "선택"));
				request.setAttribute("taxation_section", commonCode.executeCommonCode("taxation_section", null, "선택"));
		
				request.setAttribute("bjdong_code", commonCode.executeBJDongCode(SIDO_CD, userBean.getSIGU_CD(), null));
				request.setAttribute("hjdong_code", commonCode.executeHJDongCode(SIDO_CD, userBean.getSIGU_CD(), null));
				request.setAttribute("mul_spc_cd", commonCode.executeCommonCode("MUL_SPC_CD", null, "선택"));
				
				//	접수일자
				SimpleDateFormat	formatter 	= new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA);
				Calendar 			cal 		= Calendar.getInstance();
				String	today		= formatter.format(cal.getTime());
				request.setAttribute("REQ_DATE_MIN", today);
				
				list	= iMinwonService.executeSearch_Depth();
				
				AppealBean	appealBean	= new AppealBean();
				String 	corp_cd 	= ServletRequestUtils.getStringParameter(request, "corp_cd", "");
				String 	gu_code 	= ServletRequestUtils.getStringParameter(request, "gu_code", "");
				
				
				
				if(!corp_cd.equals("") && !gu_code.equals(""))
				{
					//EQUIP_APPEAL값을 가져온다.
					appealBean = iMinwonService.getAppeal(corp_cd, gu_code);
					Util util = new Util();
					
					List ssn_list = util.SubString_SSN(appealBean.getSSN());
					List bizssn_list = util.SubString_BIZSSN(appealBean.getBIZSSN());
					
					request.setAttribute("CORP_CD", appealBean.getCORP_CD());
					request.setAttribute("GU_CODE", appealBean.getGU_CODE());
					request.setAttribute("NAME", appealBean.getNAME());
//					System.out.println("#########################################    Register   #################");
//					System.out.println("CORP_CD ==>" + appealBean.getCORP_CD());
//					System.out.println("GU_CODE ==>" + appealBean.getGU_CODE());
//					System.out.println("NAME ==>" + appealBean.getNAME());
//					System.out.println("OFFICE ==>" + appealBean.getOFFICE());
//					System.out.println("ssn_list.size ==>" + ssn_list.size());
//					System.out.println("BON_POST ==>" + util.Post_Paste(appealBean.getBON_POST()));
//					System.out.println("BON_ADDR1 ==>" + appealBean.getBON_ADDR1());
//					System.out.println("BON_ADDR2 ==>" + appealBean.getBON_ADDR2());
					
					if(ssn_list != null){
//						System.out.println("jumin_ssn1 ==>" + ssn_list.get(0));
//						System.out.println("jumin_ssn2 ==>" + ssn_list.get(1));
						request.setAttribute("jumin_ssn1", ssn_list.get(0));
						request.setAttribute("jumin_ssn2", ssn_list.get(1));
					}
					else
					{
						request.setAttribute("jumin_ssn1", "");
						request.setAttribute("jumin_ssn2", "");
					}
					
					if(bizssn_list != null){
						request.setAttribute("jumin_bizssn1", bizssn_list.get(0));
						request.setAttribute("jumin_bizssn2", bizssn_list.get(1));
						request.setAttribute("jumin_bizssn3", bizssn_list.get(2));
					}
					else
					{
						request.setAttribute("jumin_bizssn1", "");
						request.setAttribute("jumin_bizssn2", "");
						request.setAttribute("jumin_bizssn3", "");
					}
					
					if(appealBean.getTEL() != null)
					{
						if(appealBean.getTEL().length() == 11)
						{
							request.setAttribute("jumin_tel1", appealBean.getTEL().substring(0, 3));
							request.setAttribute("jumin_tel2", appealBean.getTEL().substring(3, 7));
							request.setAttribute("jumin_tel3", appealBean.getTEL().substring(7, 10));
						}
						else if(appealBean.getTEL().length() == 10)
						{
							request.setAttribute("jumin_tel1", appealBean.getTEL().substring(0, 2));
							request.setAttribute("jumin_tel2", appealBean.getTEL().substring(2, 6));
							request.setAttribute("jumin_tel3", appealBean.getTEL().substring(6, 9));
						}
						
					}
				
					if(appealBean.getHP() != null)
					{
						
						if(appealBean.getHP().length() == 11)
						{
							request.setAttribute("jumin_hp1", appealBean.getHP().substring(0,3));
							request.setAttribute("jumin_hp2", appealBean.getHP().substring(3,7));
							request.setAttribute("jumin_hp3", appealBean.getHP().substring(7,10));
						}
						else if(appealBean.getHP().length() == 10)
						{
							request.setAttribute("jumin_hp1", appealBean.getHP().substring(0,3));
							request.setAttribute("jumin_hp2", appealBean.getHP().substring(3,6));
							request.setAttribute("jumin_hp3", appealBean.getHP().substring(6,9));
						}
					}
					
					if(appealBean.getFAX() != null)
					{
						if(appealBean.getFAX().length() == 11)
						{
							request.setAttribute("jumin_fax1", appealBean.getFAX().substring(0,3));
							request.setAttribute("jumin_fax2", appealBean.getFAX().substring(3,7));
							request.setAttribute("jumin_fax3", appealBean.getFAX().substring(7,10));
						}
						else if(appealBean.getHP().length() == 10)
						{
							request.setAttribute("jumin_fax1", appealBean.getFAX().substring(0,3));
							request.setAttribute("jumin_fax2", appealBean.getFAX().substring(3,6));
							request.setAttribute("jumin_fax3", appealBean.getFAX().substring(6,9));
						}
					}
					
					request.setAttribute("BON_POST", util.Post_Paste(appealBean.getBON_POST()));
					request.setAttribute("BON_ADDR1", appealBean.getBON_ADDR1());
					request.setAttribute("BON_ADDR2", appealBean.getBON_ADDR2());
					request.setAttribute("BIZ_STATUS", appealBean.getBIZ_STATUS());
					request.setAttribute("BIZ_TYPES", appealBean.getBIZ_TYPES());
					request.setAttribute("TO_POST", util.Post_Paste(appealBean.getTO_POST()));
					request.setAttribute("TO_ADDR1", appealBean.getTO_ADDR1());
					request.setAttribute("TO_ADDR2", appealBean.getTO_ADDR2());
					request.setAttribute("OFFICE", appealBean.getOFFICE());
					request.setAttribute("TEL_EXT", appealBean.getTEL_EXT());
					request.setAttribute("TOPOST_NM", appealBean.getTOPOST_NM());
					request.setAttribute("MANAGER", appealBean.getMANAGER());
				}
				else
				{
					String 	GU_CD 	= userBean.getSIGU_CD();
					request.setAttribute("GU_CODE", GU_CD);
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		
		return new ModelAndView("/facility/minwon/tab/info_register", "blist", list);
	}
	
	
	//	신규등록 (민원, 점용인, 시설물)
	public ModelAndView	RegisterPrc(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{

		System.out.println(">> RegisterPrc");
		
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");		
		
		UserBean	userBean	= new UserBean();		 
		userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
		String gu_code	= userBean.getSIGU_CD().substring(0, 3);
		
		System.out.println("=========");
		System.out.println(gu_code);
		
		
		String 	BJ_CD = ServletRequestUtils.getStringParameter(request, "BJ_CD", "");
		String CORP_CD= ServletRequestUtils.getStringParameter(request, "CORP_CD", "");
//		String 	HJ_CD = ServletRequestUtils.getStringParameter(request, "HJ_CD", "");
//		String 	BONBUN = ServletRequestUtils.getStringParameter(request, "BONBUN", "");
//		String 	BUBUN = ServletRequestUtils.getStringParameter(request, "BUBUN", "");
//		String 	SPC_CD = ServletRequestUtils.getStringParameter(request, "SPC_CD", "");
		System.out.println(BJ_CD);
		System.out.println(CORP_CD);
		
		try{
			if(userId != null){
				
				 
				Date today = new Date();
				
			SimpleDateFormat dateForm = new SimpleDateFormat("yyyy");
				
			String year = dateForm.format(today);
				
				int maxPrevAdminNo = iMinwonService.MaxAdminNo(year+"11"+ gu_code);
				
				maxPrevAdminNo+=1;
				
				String strMaxPrevAdminNo = Integer.toString(maxPrevAdminNo);
				
				if(strMaxPrevAdminNo.length() == 1){
					strMaxPrevAdminNo = "0000"+strMaxPrevAdminNo;
				}else if(strMaxPrevAdminNo.length() == 2){
					strMaxPrevAdminNo = "000"+strMaxPrevAdminNo;
				}else if(strMaxPrevAdminNo.length() == 3){
					strMaxPrevAdminNo = "00"+strMaxPrevAdminNo;
				}else if(strMaxPrevAdminNo.length() == 4){
					strMaxPrevAdminNo = "0"+strMaxPrevAdminNo;
				}
				
				//관리자 번호 생성
				String adminno = year+"11"+gu_code+BJ_CD.substring(0,3)+"_1_"+strMaxPrevAdminNo; 
				
				System.out.println("========");
				System.out.println("maxPrevAdminNo"+maxPrevAdminNo);
				System.out.println("adminno "+adminno);
		
				System.out.println("========");
				
				//	ADMIN_BASE 테이블에  같은 데이터가 있는지 확인한다. (없으면 저장하고 관리자번호를 생성한다.)
		//		Admin_BaseBean	admin_BaseBean	= Admin_Base_Register_Execute(request, response);
		
				PlaceBean	admin_placeBean= new PlaceBean();
				
				
				admin_placeBean.setCORP_CD(CORP_CD);
				admin_placeBean.setGU_CODE(gu_code);
				admin_placeBean.setYEAR(year);
				admin_placeBean.setADMIN_NO(adminno);
				
				
	
				//	민원정보를 저장한다.
			Minwon_Register_Execute(request, response, adminno);
				
				//	점용인 데이터를 저장한다.
				//Appeal_Register_Execute(request, response, admin_BaseBean);
				
				//	시설물 정보를 저장한다.
		Place_Register_Execute(request, response, admin_placeBean);
				
				
				//return null;//Search(request, response);
			}
		}catch(Exception e){
			System.out.println(e.toString());
		}
		
		request.setAttribute("menu_param", "jumyong");
		
		return new ModelAndView("/facility/jumyong/registerPrc");
		
	}
	
	
	//	새올의 데이터를 가져온다.
	public ModelAndView		Saewol_Register(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{

		System.out.println(">> Saewol_Register");
		
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");		
		
		try{
			if(userId != null){
				//	 삭제 세션
			//	HttpSession session = request.getSession();
			//	session.setAttribute("sessionUserId", "장구경");
				
				//	세션에서 시도 코드를 가져온다.
				String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				
				//	관리자 데이터를 가져온다.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
				if(userBean	!= null)
				{
					request.setAttribute("MANAGER", userBean.getNAME());
					request.setAttribute("SIGUNGU", userBean.getGU_NM());
					request.setAttribute("MANAGE_DEPT", userBean.getDEPT_NM());
				}
				
				SOWNN00216Control	sown00216Control	= new SOWNN00216Control();
				
				String 	GIGAN1 		= ServletRequestUtils.getStringParameter(request, "GIGAN1", "");
				String 	GIGAN2 		= ServletRequestUtils.getStringParameter(request, "GIGAN2", "");
				String 	MIN_NAME 	= ServletRequestUtils.getStringParameter(request, "MIN_NAME", "");
				String 	MIN_REQNO 	= ServletRequestUtils.getStringParameter(request, "MIN_REQNO", "");
				String 	MIN_CHECK 	= ServletRequestUtils.getStringParameter(request, "MIN_CHECK", "");
				String 	MIN_PROCESS	= ServletRequestUtils.getStringParameter(request, "MIN_PROCESS", "");
				
				request.setAttribute("MIN_CHECK", MIN_CHECK);		//	접수
				request.setAttribute("MIN_PROCESS", MIN_PROCESS);	//	처리
				request.setAttribute("GIGAN1", GIGAN1);
				request.setAttribute("GIGAN2", GIGAN2);
				request.setAttribute("MIN_NAME", MIN_NAME);
				request.setAttribute("MIN_REQNO", MIN_REQNO);
				
				request.setAttribute("use_type", commonCode.executeCommonCode("use_type", null, "선택"));
				request.setAttribute("occupancy_type", commonCode.executeCommonCode("occupancy_type", null, "선택"));
				request.setAttribute("use_owner_Group", commonCode.executeCommonCode("use_ownerGroup", null, "선택"));
				request.setAttribute("taxation_section", commonCode.executeCommonCode("taxation_section", null, "선택"));
				
				request.setAttribute("bjdong_code", commonCode.executeBJDongCode(SIDO_CD, userBean.getSIGU_CD(), null));
				request.setAttribute("hjdong_code", commonCode.executeHJDongCode(SIDO_CD, userBean.getSIGU_CD(), null));
				request.setAttribute("mul_spc_cd", commonCode.executeCommonCode("MUL_SPC_CD", null, "선택"));
		
				String 	ADMIN_NO = ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
				
				//관리자 데이터를 가져온다.
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				ContactSysInfoBean contactSysInfoBean = commonCode.executeContactsys_Info(SIDO_CD, userBean.getSIGU_CD());
				RefDeptCodeBean refDeptCodeBean = commonCode.getRef_DeptCode(SIDO_CD + userBean.getSIGU_CD());
				
				sown00216Control.SaewolView(ADMIN_NO, request,
						contactSysInfoBean.getSAEALL_IP(),contactSysInfoBean.getSAEALL_PATH(),contactSysInfoBean.getSAEALL_PORT()
						,refDeptCodeBean.getDEPT_CD()
						,refDeptCodeBean.getORG_CD());
				
				sown00216Control	= null;
			}
		}catch(Exception e){
			System.out.println(e.toString());
		}				
		return new ModelAndView("/facility/minwon/tab/saewol_register");
	}
	
	
	//	새올 데이터를 신규등록 (민원, 점용인, 점용지)
	public ModelAndView	Saewol_RegisterPrc(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{		
		System.out.println(">> Saewol_RegisterPrc");

		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");		
		
		UserBean	userBean	= new UserBean();		 
		userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
		String gu_code	= userBean.getSIGU_CD().substring(0, 3);
		
		System.out.println("=========");
		System.out.println(gu_code);
		
		
		String 	BJ_CD = ServletRequestUtils.getStringParameter(request, "BJ_CD", "");
		String CORP_CD= ServletRequestUtils.getStringParameter(request, "CORP_CD", "");
//		String 	HJ_CD = ServletRequestUtils.getStringParameter(request, "HJ_CD", "");
//		String 	BONBUN = ServletRequestUtils.getStringParameter(request, "BONBUN", "");
//		String 	BUBUN = ServletRequestUtils.getStringParameter(request, "BUBUN", "");
//		String 	SPC_CD = ServletRequestUtils.getStringParameter(request, "SPC_CD", "");
		System.out.println(BJ_CD);
		System.out.println(CORP_CD);

		try{
			if(userId != null){
				Date today = new Date();
				
				SimpleDateFormat dateForm = new SimpleDateFormat("yyyy");
					
				String year = dateForm.format(today);
					
					int maxPrevAdminNo = iMinwonService.MaxAdminNo(year+"11"+ gu_code);
					
					maxPrevAdminNo+=1;
					
					String strMaxPrevAdminNo = Integer.toString(maxPrevAdminNo);
					
					if(strMaxPrevAdminNo.length() == 1){
						strMaxPrevAdminNo = "0000"+strMaxPrevAdminNo;
					}else if(strMaxPrevAdminNo.length() == 2){
						strMaxPrevAdminNo = "000"+strMaxPrevAdminNo;
					}else if(strMaxPrevAdminNo.length() == 3){
						strMaxPrevAdminNo = "00"+strMaxPrevAdminNo;
					}else if(strMaxPrevAdminNo.length() == 4){
						strMaxPrevAdminNo = "0"+strMaxPrevAdminNo;
					}
					
					//관리자 번호 생성
					String adminno = year+"11"+gu_code+BJ_CD.substring(0,3)+"_1_"+strMaxPrevAdminNo; 
					
					System.out.println("========");
					System.out.println("maxPrevAdminNo"+maxPrevAdminNo);
					System.out.println("adminno "+adminno);
			
					System.out.println("========");
					
					//	ADMIN_BASE 테이블에  같은 데이터가 있는지 확인한다. (없으면 저장하고 관리자번호를 생성한다.)
			//		Admin_BaseBean	admin_BaseBean	= Admin_Base_Register_Execute(request, response);
			
					PlaceBean	admin_placeBean= new PlaceBean();
					
					
					admin_placeBean.setCORP_CD(CORP_CD);
					admin_placeBean.setGU_CODE(gu_code);
					admin_placeBean.setYEAR(year);
					admin_placeBean.setADMIN_NO(adminno);
				
				//	민원정보를 저장한다.
				Saewol_Minwon_Register_Execute(request, response, adminno);
				//	점용인 데이터를 저장한다.
		//		Appeal_Register_Execute(request, response, admin_BaseBean);
				//	점용지 데이터를 저장한다.
				Place_Register_Execute(request, response, admin_placeBean);
			}
		}catch(Exception e){
			System.out.println(e.toString());
		}
		request.setAttribute("menu_param", "jumyong");
		
		return new ModelAndView("/facility/jumyong/registerPrc");
	}
	
	
	//	ADMIN_BASE 등록
	public Admin_BaseBean	Admin_Base_Register_Execute(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{

		System.out.println(">> Admin_Base_Register_Execute");
		
		Admin_BaseBean	Bean	= new Admin_BaseBean();
		
		try{
			//	세션에서 시도 코드를 가져온다.
			String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
			
			//	관리자 데이터를 가져온다.
			UserBean	userBean	= new UserBean();
			userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
	
			String 	CORP_CD 	= ServletRequestUtils.getStringParameter(request, "CORP_CD", "001");	//"001" 업체코드
			String 	REGDATE 	= ServletRequestUtils.getStringParameter(request, "REQ_DATE_MIN", "");	//접수일자
			String 	MANAGER 	= ServletRequestUtils.getStringParameter(request, "MANAGER_MIN", "");
		
			String 	SI_CD 	= SIDO_CD;	//	시도 코드를 가져온다.
			String 	GU_CD 	= userBean.getSIGU_CD();					
			
			//	관리자 번호 생성
	//		String	adminno	= Adminno_Maker(GU_CD, CORP_CD);
			
	//		if(adminno	==	null)	return	null;
			
	//		Bean.setADMIN_NO(adminno);
	//		Bean.setSEQ("0");
			Bean.setCORP_CD(CORP_CD);
			Bean.setGU_CODE(GU_CD);
			
			//점용코드, 구코드가 같은 항목이 있으면 뒤의 순번값에서 +1을 한다.
			String REQUEST_NO = iMinwonService.getRequest_No(Bean);
			
			Bean.setREQUEST_NO(REQUEST_NO);
			Bean.setREGDATE(util.Date_Cut(REGDATE));
			Bean.setUP_DATE(util.Date_Cut(REGDATE));
			Bean.setMANAGER(MANAGER);
			Bean.setFINISH_ID(util.getSessionID(request,"sessionUserId"));
			Bean.setCHECK_YN("0");
			Bean.setTAX_YN("0");
			
			Bean	= iMinwonService.executeAdmin_Base_Register(Bean);
			
	//		if(result == false) return	null;
		}catch(Exception e){
			System.out.println("error:"+e.toString());
		}	
		return	Bean;
	}
	
	
	//	민원정보 등록
	public String	Minwon_Register_Execute(HttpServletRequest request,HttpServletResponse response, String adminno) throws Exception 
	{

		System.out.println(">> Minwon_Register_Execute");
		
		try{
		//	UserBean	userBean	= new UserBean();
		//	userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
			
			MinwonBean	minwonBean	= new MinwonBean();
			bind(request, minwonBean);
			
			String	min_ssn		= "";
			if(!ServletRequestUtils.getStringParameter(request, "min_ssn2", "").equals(""))
				min_ssn		= ServletRequestUtils.getStringParameter(request, "min_ssn1", "") + ServletRequestUtils.getStringParameter(request, "min_ssn2", "");
			
			minwonBean.setREQ_DATE_MIN(util.Date_Cut(minwonBean.getREQ_DATE_MIN()));
			minwonBean.setPREDATE_MIN(util.Date_Cut(minwonBean.getPREDATE_MIN()));
	
			minwonBean.setSSN_MIN(min_ssn);
			minwonBean.setADMIN_NO_MIN(adminno);
	//		minwonBean.setADMIN_NO_MIN(admin_BaseBean.getCORP_CD() + admin_BaseBean.getGU_CODE() + admin_BaseBean.getREQUEST_NO());	// CORP_CD + GU_CD + REQUEST_NO
			
			String tel = "";
			String tel1 = ServletRequestUtils.getStringParameter(request, "min_tel1", "");
			String tel2 =ServletRequestUtils.getStringParameter(request, "min_tel2", "");
			String tel3 =ServletRequestUtils.getStringParameter(request, "min_tel3", "");
			
			if(!tel1.equals("")){			tel = tel1 + "-" + tel2 + "-" + tel3;		}
			minwonBean.setTEL_MIN(tel);
			
			String hp = "";
			String hp1 = ServletRequestUtils.getStringParameter(request, "min_hp1", "");
			String hp2 = ServletRequestUtils.getStringParameter(request, "min_hp2", "");
			String hp3 = ServletRequestUtils.getStringParameter(request, "min_hp3", "");
		
			if(!hp1.equals("")){			hp = hp1 + "-" + hp2 + "-" + hp3;		}
			minwonBean.setHP_MIN(hp);
			
			String min_agent_tel = "";
			String min_agent_tel1 = ServletRequestUtils.getStringParameter(request, "min_agent_tel1", "");
			String min_agent_tel2 = ServletRequestUtils.getStringParameter(request, "min_agent_tel2", "");
			String min_agent_tel3 = ServletRequestUtils.getStringParameter(request, "min_agent_tel3", "");
		
			if(!min_agent_tel1.equals("")){			min_agent_tel = min_agent_tel1 + "-" + min_agent_tel2 + "-" + min_agent_tel3;		}
			minwonBean.setAGENT_TEL_MIN(min_agent_tel);
			
			iMinwonService.executeMinwon_Register(minwonBean);
		}catch(Exception e){
			System.out.println("error:"+e.toString());
		}	
		return	null;
	}
	
	//	새올연계
	//	새올 데이터를 민원정보 등록
	public String	Saewol_Minwon_Register_Execute(HttpServletRequest request,HttpServletResponse response, String adminno) throws Exception 
	{

		System.out.println(">> Saewol_Minwon_Register_Execute");

		try{
			
			MinwonBean	minwonBean	= new MinwonBean();
			bind(request, minwonBean);
			
			String	min_ssn		= "";
			if(!ServletRequestUtils.getStringParameter(request, "min_ssn2", "").equals(""))
				min_ssn		= ServletRequestUtils.getStringParameter(request, "min_ssn1", "") + ServletRequestUtils.getStringParameter(request, "min_ssn2", "");
			
			minwonBean.setREQ_DATE_MIN(util.Date_Cut(minwonBean.getREQ_DATE_MIN()));
			minwonBean.setPREDATE_MIN(util.Date_Cut(minwonBean.getPREDATE_MIN()));
	
			minwonBean.setSSN_MIN(min_ssn);
			minwonBean.setADMIN_NO_MIN(adminno);
	//		minwonBean.setADMIN_NO_MIN(admin_BaseBean.getCORP_CD() + admin_BaseBean.getGU_CODE() + admin_BaseBean.getREQUEST_NO());	// CORP_CD + GU_CD + REQUEST_NO
			
			String tel = "";
			String tel1 = ServletRequestUtils.getStringParameter(request, "min_tel1", "");
			String tel2 =ServletRequestUtils.getStringParameter(request, "min_tel2", "");
			String tel3 =ServletRequestUtils.getStringParameter(request, "min_tel3", "");
			
			if(!tel1.equals("")){			tel = tel1 + "-" + tel2 + "-" + tel3;		}
			minwonBean.setTEL_MIN(tel);
			
			String hp = "";
			String hp1 = ServletRequestUtils.getStringParameter(request, "min_hp1", "");
			String hp2 = ServletRequestUtils.getStringParameter(request, "min_hp2", "");
			String hp3 = ServletRequestUtils.getStringParameter(request, "min_hp3", "");
		
			if(!hp1.equals("")){			hp = hp1 + "-" + hp2 + "-" + hp3;		}
			minwonBean.setHP_MIN(hp);
			
			String min_agent_tel = "";
			String min_agent_tel1 = ServletRequestUtils.getStringParameter(request, "min_agent_tel1", "");
			String min_agent_tel2 = ServletRequestUtils.getStringParameter(request, "min_agent_tel2", "");
			String min_agent_tel3 = ServletRequestUtils.getStringParameter(request, "min_agent_tel3", "");
		
			if(!min_agent_tel1.equals("")){			min_agent_tel = min_agent_tel1 + "-" + min_agent_tel2 + "-" + min_agent_tel3;		}
			minwonBean.setAGENT_TEL_MIN(min_agent_tel);
			
			//	민원 데이터 저장
			iMinwonService.executeMinwon_Register(minwonBean);
		}catch(Exception e){
			System.out.println("error:"+e.toString());
		}	
		return	null;
	}
	
	
	//	점용인 등록
	public String	Appeal_Register_Execute(HttpServletRequest request,HttpServletResponse response, Admin_BaseBean admin_BaseBean) throws Exception 
	{

		System.out.println(">> Appeal_Register_Execute");
		
		try{
			//	세션에서 시도 코드를 가져온다.
			String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
			
			//	관리자 데이터를 가져온다.
			UserBean	userBean	= new UserBean();
			userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
			
			AppealBean	appealBean	= new AppealBean();
			bind(request, appealBean);
			
			String	jumin_ssn		= "";
			if(!ServletRequestUtils.getStringParameter(request, "jumin_ssn2", "").equals(""))
				jumin_ssn		= ServletRequestUtils.getStringParameter(request, "jumin_ssn1", "") + ServletRequestUtils.getStringParameter(request, "jumin_ssn2", "");
		
			String	jumin_bizssn	= "";
			if(!ServletRequestUtils.getStringParameter(request, "jumin_bizssn3", "").equals(""))
				jumin_bizssn	= ServletRequestUtils.getStringParameter(request, "jumin_bizssn1", "") + ServletRequestUtils.getStringParameter(request, "jumin_bizssn2", "") + ServletRequestUtils.getStringParameter(request, "jumin_bizssn3", "");
			
			String	jumin_tel	= "";
			if(!ServletRequestUtils.getStringParameter(request, "jumin_tel3", "").equals(""))
			{
				jumin_tel	= ServletRequestUtils.getStringParameter(request, "jumin_tel1", "") + "-" +
				ServletRequestUtils.getStringParameter(request, "jumin_tel2", "") + "-" +
					ServletRequestUtils.getStringParameter(request, "jumin_tel3", "");
			}
			
			String	jumin_hp	= "";
			String	jumin_hp1	= ServletRequestUtils.getStringParameter(request, "jumin_hp1", "");
			String	jumin_hp2	= ServletRequestUtils.getStringParameter(request, "jumin_hp2", "");
			String	jumin_hp3	= ServletRequestUtils.getStringParameter(request, "jumin_hp3", "");
			if(!jumin_hp3.equals(""))
			{
				jumin_hp	= jumin_hp1 + "-" + jumin_hp2 + "-" + jumin_hp3;
			}
			
			String	jumin_fax	= "";
			String	jumin_fax1	= ServletRequestUtils.getStringParameter(request, "jumin_fax1", "");
			String	jumin_fax2	= ServletRequestUtils.getStringParameter(request, "jumin_fax2", "");
			String	jumin_fax3	= ServletRequestUtils.getStringParameter(request, "jumin_fax3", "");
			if(!jumin_fax3.equals(""))
			{
				jumin_fax	= jumin_fax1 + "-" + jumin_fax2 + jumin_fax3;
			}
			
			appealBean.setSSN(jumin_ssn);
			appealBean.setBIZSSN(jumin_bizssn);
			appealBean.setTEL(jumin_tel);
			appealBean.setHP(jumin_hp);
			appealBean.setFAX(jumin_fax);
			appealBean.setGU_CODE(userBean.getSIGU_CD());
			appealBean.setADDR_CHECK(ServletRequestUtils.getStringParameter(request, "ADDR_CHECK", "0"));
			appealBean.setSIDO(SIDO_CD);
			appealBean.setSIGUNGU(userBean.getSIGU_CD());		
//			System.out.println("################    HP  ####################");
//			System.out.println("ADDR_CHECK ==>" + ServletRequestUtils.getStringParameter(request, "ADDR_CHECK", "0"));
//			System.out.println("####################################");		
			
			String appealChk = iMinwonService.getAppeal_Check(appealBean);

			//등록된 EQUIP_APPEAL이 없는 경우
			if(appealChk.equals("0"))
			{
				iMinwonService.executeAppeal_Register(appealBean);
			}
			else
			{
				iMinwonService.executeAppeal_Update(appealBean);
			}
		}catch(Exception e){
			System.out.println("error:"+e.toString());
		}	
		return	null;
	}
	
	//	민원등록 추가
	public String		Appeal_RegisterSaewol_Execute(HttpServletRequest request,HttpServletResponse response, Admin_BaseBean	admin_BaseBean) throws Exception 
	{

		System.out.println(">> Appeal_RegisterSaewol_Execute");
		
		try{
			UserBean	userBean	= new UserBean();
			userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
			
			AppealBean	appealBean	= new AppealBean();
			bind(request, appealBean);
			
			String	jumin_ssn		= "";
			if(!ServletRequestUtils.getStringParameter(request, "jumin_ssn2", "").equals(""))
				jumin_ssn		= ServletRequestUtils.getStringParameter(request, "jumin_ssn1", "") + ServletRequestUtils.getStringParameter(request, "jumin_ssn2", "");
		
			String	jumin_bizssn	= "";
			if(!ServletRequestUtils.getStringParameter(request, "jumin_bizssn3", "").equals(""))
				jumin_bizssn	= ServletRequestUtils.getStringParameter(request, "jumin_bizssn1", "") + ServletRequestUtils.getStringParameter(request, "jumin_bizssn2", "") + ServletRequestUtils.getStringParameter(request, "jumin_bizssn3", "");		
	
			appealBean.setSSN(jumin_ssn);
			appealBean.setBIZSSN(jumin_bizssn);
			appealBean.setGU_CODE(userBean.getSIGU_CD());
			appealBean.setCORP_CD(admin_BaseBean.getCORP_CD());
			appealBean.setGU_CODE(admin_BaseBean.getGU_CODE());
			
			iMinwonService.executeAppeal_Register(appealBean);
			
		}catch(Exception e){
			System.out.println("error:"+e.toString());
		}	
		
		return	null;
	}
	

	//	점용지 등록
	public void		Place_Register_Execute(HttpServletRequest request,HttpServletResponse response, 	PlaceBean 	placeBean) throws Exception 
	{

		System.out.println(">> Place_Register_Execute");
		
		//	세션에서 시도 코드를 가져온다.
		String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
		UserBean	userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
		
		String 	sXMLFile 	= ServletRequestUtils.getStringParameter(request, "XMLDATA", "");
		
		
		System.out.println(sXMLFile);
		
		if(sXMLFile	== null)
			return;
		
		
		try
		{
			SAXBuilder 		builder 	= new SAXBuilder();
			Document 		document 	= builder.build(new StringReader(sXMLFile));
	
			Element	element				= document.getRootElement();
			List 	childElementList	= element.getChildren();
			
		//	PlaceBean	placeBean	= new PlaceBean();
			
			for(int i = 0	; i < childElementList.size()	;	i++)
			{
	//			placeBean.setADMIN_NO(adminno);
	
				
	//			placeBean.setCORP_CD(admin_BaseBean.getCORP_CD());
	//			placeBean.setGU_CODE(admin_BaseBean.getGU_CODE());
	//			placeBean.setYEAR(admin_BaseBean.getYEAR());
				
				
				
				placeBean.setTYPE("1");
				
				//위의 4개의 값을 가지고 해당 코드가 존재하는지 유무 체크... 
				//존재한다면		OBJECT_NO = OBJECT_NO + 1
				//존재하지 않다면	OBJECT_NO = 0001
			//	placeBean.setYEAR(placeBean.getMUL_FROMDATE().substring(0, 4));
			
				String OBJECT_NO = iMinwonService.getObject_No(placeBean);
				placeBean.setOBJECT_NO(OBJECT_NO);
				placeBean.setSECTION("1");
				
				placeBean.setOWNER_SET(((Element)childElementList.get(i)).getChildText("OWNER_SET"));
				placeBean.setTAX_SET(((Element)childElementList.get(i)).getChildText("TAX_SET"));
				placeBean.setPURPOSE_CD(((Element)childElementList.get(i)).getChildText("PURPOSE_CD"));
				placeBean.setPURPOSESEBU_CD(((Element)childElementList.get(i)).getChildText("PURPOSESEBU_CD"));
				placeBean.setSTANDARD(((Element)childElementList.get(i)).getChildText("STANDARD"));
				placeBean.setQUANTITY(((Element)childElementList.get(i)).getChildText("QUANTITY"));
				
				placeBean.setDEPTH_CK(((Element)childElementList.get(i)).getChildText("DEPTH_CK"));
				placeBean.setDEPTH_NUM(((Element)childElementList.get(i)).getChildText("DEPTH_NUM"));
				placeBean.setMUL_FROMDATE(util.Date_Cut(((Element)childElementList.get(i)).getChildText("MUL_FROMDATE")));
				placeBean.setMUL_TODATE(util.Date_Cut(((Element)childElementList.get(i)).getChildText("MUL_TODATE")));
				placeBean.setPARTLY_PERIOD(((Element)childElementList.get(i)).getChildText("PARTLY_PERIOD"));
				placeBean.setTOTAL_PERIOD(((Element)childElementList.get(i)).getChildText("TOTAL_PERIOD"));

				placeBean.setBJ_CD(((Element)childElementList.get(i)).getChildText("BJ_CD"));
				placeBean.setHJ_CD(((Element)childElementList.get(i)).getChildText("HJ_CD"));
				placeBean.setSPC_CD(((Element)childElementList.get(i)).getChildText("SPC_CD"));
				placeBean.setBONBUN(((Element)childElementList.get(i)).getChildText("BONBUN"));
				placeBean.setBUBUN(((Element)childElementList.get(i)).getChildText("BUBUN"));
//				placeBean.setADDR_CK(((Element)childElementList.get(i)).getChildText("ADDR_CK"));
//				placeBean.setSISUL_ADDR_CK(((Element)childElementList.get(i)).getChildText("SISUL_ADDR_CK"));
//				placeBean.setSISUL_ADDR(((Element)childElementList.get(i)).getChildText("SISUL_ADDR"));

				placeBean.setWORK_FROMDATE(util.Date_Cut(((Element)childElementList.get(i)).getChildText("WORK_FROMDATE")));
				
				placeBean.setWORK_TODATE(util.Date_Cut(((Element)childElementList.get(i)).getChildText("WORK_TODATE")));
				placeBean.setCOMPLETION_DATE(util.Date_Cut(((Element)childElementList.get(i)).getChildText("COMPLETION_DATE")));
				placeBean.setEXE_INFO(((Element)childElementList.get(i)).getChildText("EXE_INFO"));
				placeBean.setSISUL_POST(((Element)childElementList.get(i)).getChildText("SISUL_POST"));
				placeBean.setSISUL_ADDR1(((Element)childElementList.get(i)).getChildText("SISUL_ADDR1"));			
				placeBean.setSISUL_ADDR2(((Element)childElementList.get(i)).getChildText("SISUL_ADDR2"));
			
			//	System.out.println("placeBean : " + placeBean);
//				System.out.println("##############################################");
//				System.out.println(util.Date_Cut(((Element)childElementList.get(i)).getChildText("COMPLETION_DATE")));
//				System.out.println("##############################################");
				
//				placeBean.setADMIN_NO(placeBean.getGU_CODE()+placeBean.getCORP_CD()+placeBean.getREQUEST_NO()+placeBean.getOBJECT_NO());
				

				iMinwonService.executePlace_Register(placeBean);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("시설물 데이터가 없습니다.");
		}
	}
	
	
	//	관리 번호 생성
	private	String	Adminno_Maker(String GU_CD, String CORP_CD)
	{

		System.out.println(">> Adminno_Maker");
		
		String	ADMIN_NO	= null;
		
		try
		{
			String	Corp_Seq	= "";
			String	Seq			= "";
			int		Corp_cnt	= iMinwonService.executeCheck_CorpcdCount(CORP_CD);
			int		Count		= iMinwonService.executeCheck_AdminnoCount();
			int		Result		= 0;
			
			Corp_cnt	+= (101 + Corp_cnt);
			Corp_Seq	= Integer.toString(Corp_cnt).substring(1, 3);
			
			//	예외로 동일 관리번호가 있을경우, 다시 번호를 생성하고 같은 관리번호가 있는지 확인한다.
			for(int i = 0	;	i < 10	;	i++)
			{
				Count	+= (10001 + i);
				Seq		= Integer.toString(Count).substring(1, 5);
				
				ADMIN_NO	= GU_CD + "_" + CORP_CD + "_" + Corp_Seq + "_" + Seq;
				
				Result	= iMinwonService.executeCheck_Adminno(ADMIN_NO);
				
				if(Result	== 0)
					break;
			}
			
			System.out.println(" 신규 시설물 관리번호 : " + ADMIN_NO);
		}
		catch(Exception e)
		{
			ADMIN_NO	= null;
			
			System.out.println(" 신규 시설물 관리번호생성 실패 ");
		}
		
		return	ADMIN_NO;
	}
	
	
	//	새올
	//	신규등록 (민원, 점용인, 점용지) 새울에서 가져온 데이터를 등록한다.
	public ModelAndView		RegisterPrc_Saewol(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{		

		System.out.println(">> RegisterPrc_Saewol");
		
		try{
			Admin_BaseBean	admin_BaseBean	= AdminBase_RegisterSaewol_Execute(request, response); 
			
			Appeal_RegisterSaewol_Execute(request, response, admin_BaseBean);

			//Place_Register_Execute(request, response, admin_BaseBean);

		}catch(Exception e){
			System.out.println("error:"+e.toString());
		}	
		return null;
	}
	
	public Admin_BaseBean	AdminBase_RegisterSaewol_Execute(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{

		System.out.println(">> AdminBase_RegisterSaewol_Execute");
		
		Admin_BaseBean	Bean	= new Admin_BaseBean();
		
		try{
			//	properties 파일에 있는 시도 코드를 가져온다.
			String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());

			//	관리자 데이터를 가져온다.
			UserBean	userBean	= new UserBean();
			userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
	
			String 	CORP_CD 	= ServletRequestUtils.getStringParameter(request, "CORP_CD", "");
			String 	REGDATE 	= ServletRequestUtils.getStringParameter(request, "REQ_DATE", "");
			String 	MANAGER 	= ServletRequestUtils.getStringParameter(request, "MANAGER", "");
			
			String 	BJ_CD 	= ServletRequestUtils.getStringParameter(request, "BJ_CD", "");
			String 	TYPE 	= ServletRequestUtils.getStringParameter(request, "TYPE", "");
			String 	SI_CD 	= SIDO_CD;	//	시도 코드를 가져온다.
			String 	GU_CD 	= userBean.getSIGU_CD();						
			
			//	관리자 번호 생성
//			String	adminno	= Adminno_Maker(GU_CD, CORP_CD);
			
	//		점용코드, 구코드가 같은 항목이 있으면 뒤의 순번값에서 +1을 한다.
			Bean.setCORP_CD(CORP_CD);
			Bean.setCORP_CD(GU_CD);
			String REQUEST_NO = iMinwonService.getRequest_No(Bean);
			
			Bean.setREQUEST_NO(REQUEST_NO);
			Bean.setREGDATE(util.Date_Cut(REGDATE));
			Bean.setUP_DATE(util.Date_Cut(REGDATE));
			Bean.setMANAGER(MANAGER);
			Bean.setFINISH_ID(util.getSessionID(request,"sessionUserId"));
			Bean.setCHECK_YN("0");
			
			Bean	= iMinwonService.executeAdmin_Base_Register(Bean);
			
		}catch(Exception e){
			System.out.println("error:"+e.toString());
		}	
		return	Bean;
	}
	
	public String		getAjaxRefDongName(HttpServletRequest request,HttpServletResponse response) throws Exception{
		
		System.out.println(">> getAjaxRefDongName");
		
		String bj_cd = ServletRequestUtils.getStringParameter(request, "bj_cd","");
		String Xml = "";
		

		UserBean	userBean	= new UserBean();
		userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
		
		//if(bj_cd != null && !bj_cd.equals("")) sbj_cd = bj_cd.substring(0,3);
		String 	GU_NM 	= userBean.getGU_NM();
		String 	GU_CD 	= userBean.getSIGU_CD();		
		
		System.out.println(GU_CD);
		System.out.println(bj_cd);
		
		
		try{
		Xml	= "<?xml version=\"1.0\" encoding=\"euc-kr\"?>";
		Xml	+= "<lists>";
			
		String bj_nm = iMinwonService.GetRefDongName(GU_CD, bj_cd);
		Xml	+= XmlNodeMake("SISUL_ADDR1", "서울시 "+GU_NM+"  "+bj_nm);
		
		
//		if(Bean.getBIZSSN() != null && !Bean.getBIZSSN().equals("")){
			
//			Xml	+= XmlNodeMake("jumin_bizssn3",Bean.getBIZSSN().substring(5,10));
//		}else{
//		}
		
		Xml	+= "</lists>";
		
		
	}catch(Exception e){
		
	}		
	  response.setContentType("text/html;charset=euc-kr");
      response.setHeader("Cache-Control", "no-cache");
      response.getWriter().write(Xml);	
		
		
		return null;
	}
	
	public	String	XmlNodeMake(String NodeName, String Value)
	{

		System.out.println(">> XmlNodeMake");

		String	XML	= "";
		
		if(Value == null || Value.equals("")) Value = "";
		
		XML	= "<" + NodeName + ">" + Value + "</" + NodeName + ">";
		
		System.out.println(XML);
		return	XML;
	}
	
}
