//	2009		Kim Yun Seo

package main.java.jumyong.minwon.web;


import java.io.StringReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.common.commonCode.model.ContactSysInfoBean;
import main.java.common.commonCode.model.RefDeptCodeBean;
import main.java.common.commonCode.model.UserBean;
import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.util.catUtil.Pageing;
import main.java.common.util.catUtil.Util;
import main.java.jumyong.minwon.model.Admin_BaseBean;
import main.java.jumyong.minwon.model.AppealBean;
import main.java.jumyong.minwon.model.MinwonBean;
import main.java.jumyong.minwon.model.PlaceBean;
import main.java.jumyong.minwon.model.TotalWIthBean;
import main.java.jumyong.minwon.service.IMinwonService;

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
	private	Pageing				pageing			= new Pageing();
	
	
	public void setJumyong_minwonService(IMinwonService jumyong_minwonService) 
	{
		this.iMinwonService = jumyong_minwonService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode)
	{
		this.commonCode 	= commonCode;
	}
	
	//	�ű� ��� ȭ�� ���
	public	ModelAndView Register(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		// ���� ����
		HttpSession session = request.getSession();
		
		String 		userId	= (String)session.getAttribute("sessionUserId");
		
		try{
			if(userId != null)
			{
				//	���ǿ��� �õ� �ڵ带 �����´�.
				String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				
				//	������ �����͸� �����´�.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
			//	System.out.println(" !!USER : " + userBean.getNAME());
				
				if(userBean	!= null)
				{
					request.setAttribute("MANAGER_MIN", userBean.getNAME());
					request.setAttribute("SIGUNGU", userBean.getSIGU_CD());
					request.setAttribute("GU_NM", userBean.getGU_NM());
					request.setAttribute("MANAGE_DEP_MIN", userBean.getDEPT_NM());
				}
		
				request.setAttribute("use_type", commonCode.executeCommonCode("use_type", null, "����"));
				request.setAttribute("occupancy_type", commonCode.executeCommonCode_occupancy("occupancy_type", null, "����"));
				request.setAttribute("use_owner_Group", commonCode.executeCommonCode("use_ownerGroup", null, "����"));
				request.setAttribute("taxation_section", commonCode.executeCommonCode("taxation_section", null, "����"));
		
				request.setAttribute("sigungu_code", commonCode.executeGuCode(SIDO_CD, userBean.getSIGU_CD()));
				request.setAttribute("bjdong_code", commonCode.executeBJDongCode(SIDO_CD, userBean.getSIGU_CD(), null));
				request.setAttribute("hjdong_code", commonCode.executeHJDongCode(SIDO_CD, userBean.getSIGU_CD(), null));
				request.setAttribute("mul_spc_cd", commonCode.executeCommonCode("MUL_SPC_CD", null, null));
				
				//	��������
				SimpleDateFormat	formatter 	= new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA);
				Calendar 			cal 		= Calendar.getInstance();
				String	today		= formatter.format(cal.getTime());
				request.setAttribute("REQ_DATE_MIN", today);
				request.setAttribute("ADMIN_NO", ServletRequestUtils.getStringParameter(request, "ADMIN_NO", ""));
				
			}
		} catch(Exception e){
			System.out.println(e.toString());
		}
		
		return new ModelAndView("/jumyong/minwon/tab/info_register");
	}
	
	
	//	������ �����͸� �����´�.
	public ModelAndView		Saewol_Register(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{		
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");		
		
		try{
			if(userId != null){
		
				//	���ǿ��� �õ� �ڵ带 �����´�.
				String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				
				//	������ �����͸� �����´�.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
				if(userBean	!= null)
				{
					request.setAttribute("MANAGER", userBean.getNAME());
					request.setAttribute("SIGUNGU", userBean.getSIGU_CD());
					request.setAttribute("GU_NM", userBean.getGU_NM());
					request.setAttribute("MANAGE_DEPT", userBean.getDEPT_NM());
				}
				
				SOWNN00216Control	sown00216Control	= new SOWNN00216Control();
				
				String 	GIGAN1 		= ServletRequestUtils.getStringParameter(request, "GIGAN1", "");
				String 	GIGAN2 		= ServletRequestUtils.getStringParameter(request, "GIGAN2", "");
				String 	MIN_NAME 	= ServletRequestUtils.getStringParameter(request, "MIN_NAME", "");
				String 	MIN_REQNO 	= ServletRequestUtils.getStringParameter(request, "MIN_REQNO", "");
				String 	MIN_CHECK 	= ServletRequestUtils.getStringParameter(request, "MIN_CHECK", "");
				String 	MIN_PROCESS	= ServletRequestUtils.getStringParameter(request, "MIN_PROCESS", "");
				
				request.setAttribute("MIN_CHECK", MIN_CHECK);		//	����
				request.setAttribute("MIN_PROCESS", MIN_PROCESS);	//	ó��
				request.setAttribute("GIGAN1", GIGAN1);
				request.setAttribute("GIGAN2", GIGAN2);
				request.setAttribute("MIN_NAME", MIN_NAME);
				request.setAttribute("MIN_REQNO", MIN_REQNO);
				
				request.setAttribute("use_type", commonCode.executeCommonCode("use_type", null, "����"));
				request.setAttribute("occupancy_type", commonCode.executeCommonCode("occupancy_type", null, "����"));
				request.setAttribute("use_owner_Group", commonCode.executeCommonCode("use_ownerGroup", null, "����"));
				request.setAttribute("taxation_section", commonCode.executeCommonCode("taxation_section", null, "����"));
				
				request.setAttribute("sigungu_code", commonCode.executeGuCode(SIDO_CD, userBean.getSIGU_CD()));
				request.setAttribute("bjdong_code", commonCode.executeBJDongCode(SIDO_CD, userBean.getSIGU_CD(), null));
				request.setAttribute("hjdong_code", commonCode.executeHJDongCode(SIDO_CD, userBean.getSIGU_CD(), null));
				request.setAttribute("mul_spc_cd", commonCode.executeCommonCode("MUL_SPC_CD", null, "����"));
		
				String 	ADMIN_NO = ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
				
				//������ �����͸� �����´�.
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				ContactSysInfoBean contactSysInfoBean = commonCode.executeContactsys_Info(SIDO_CD, userBean.getSIGU_CD());
				RefDeptCodeBean refDeptCodeBean = commonCode.getRef_DeptCode(SIDO_CD + userBean.getSIGU_CD());
				
				//	������ ���� ������ �Ѱ��� ȭ�鿡 ����Ѵ�.
				sown00216Control.SaewolView(ADMIN_NO, request,contactSysInfoBean.getSAEALL_IP(),contactSysInfoBean.getSAEALL_PATH(),contactSysInfoBean.getSAEALL_PORT()
						,refDeptCodeBean.getDEPT_CD()
						,refDeptCodeBean.getORG_CD());

				sown00216Control	= null;
				
//				��������
				SimpleDateFormat	formatter 	= new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA);
				Calendar 			cal 		= Calendar.getInstance();
				String	today		= formatter.format(cal.getTime());
				request.setAttribute("REQ_DATE_MIN", today);
				
			}
		}catch(Exception e){
			System.out.println("error:"+e.toString());
		}	
		
		return new ModelAndView("/jumyong/minwon/tab/saewol_register");
	}
	
	//	�űԵ�� (�ο�, ������, ������)
	public ModelAndView	RegisterPrc(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");		

		try{
			if(userId != null){
				
				//	ADMIN_BASE ���̺�  ���� �����Ͱ� �ִ��� Ȯ���Ѵ�. (������ �����ϰ� �����ڹ�ȣ�� �����Ѵ�.)
				String adminno	= Admin_Base_Register_Execute(request, response);
				
				if(adminno	!=	null)				
				{ 					
					//	�ο������� �����Ѵ�.
					Minwon_Register_Execute(request, response, adminno);
					
					//	������ �����͸� �����Ѵ�.
					Appeal_Register_Execute(request, response, adminno); 
					
					//	������ �����͸� �����Ѵ�.
					Place_Register_Execute(request, response, adminno);					
					
				}
				
				request.setAttribute("menu_param", "jumyong");
			}
		}catch(Exception e){
			System.out.println("error:"+e.toString());
		}	
		return new ModelAndView("/jumyong/jumyong/registerPrc");
		
	}
	
	
	
	//	���� �����͸� �űԵ�� (�ο�, ������, ������)
	public ModelAndView	Saewol_RegisterPrc(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");		

		try{
			if(userId != null){
				
				//	ADMIN_BASE ���̺�  ���� �����Ͱ� �ִ��� Ȯ���Ѵ�. (������ �����ϰ� �����ڹ�ȣ�� �����Ѵ�.)
				String	adminno	= Admin_Base_Register_Execute(request, response);
		
				if(adminno	!=	null)
				{
					//	�ο������� �����Ѵ�.
					Saewol_Minwon_Register_Execute(request, response, adminno);
		
					//	������ �����͸� �����Ѵ�.
					Appeal_Register_Execute(request, response, adminno);
		
					//	������ �����͸� �����Ѵ�.
					Place_Register_Execute(request, response, adminno);
				}
				request.setAttribute("menu_param", "jumyong");
				
			}
		}catch(Exception e){
			System.out.println("error:"+e.toString());
		}	
		return new ModelAndView("/jumyong/jumyong/registerPrc");
	}
	
	//	ADMIN_BASE ���
	public String	Admin_Base_Register_Execute(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		String	adminno	= null;
		try{
			//	���ǿ��� �õ� �ڵ带 �����´�.
			String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
			
			//	������ �����͸� �����´�.
			UserBean	userBean	= new UserBean();
			userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
	
			String 	REGDATE 	= ServletRequestUtils.getStringParameter(request, "REQ_DATE_MIN", "");
			String 	MANAGER 	= ServletRequestUtils.getStringParameter(request, "MANAGER_MIN", "");
			
			String 	BJ_CD 	= ServletRequestUtils.getStringParameter(request, "BJ_CD", "");
			String 	TYPE 	= ServletRequestUtils.getStringParameter(request, "TYPE", "");
			String 	SI_CD 	= SIDO_CD;	//	�õ� �ڵ带 �����´�.
			String 	GU_CD 	= userBean.getSIGU_CD();
			
			//
			String PURPOSE_CD = ServletRequestUtils.getStringParameter(request, "PURPOSE_CD", "");
			System.out.println("@@@@@@@@@ PURPOSE_CD : "+PURPOSE_CD);
	        if(PURPOSE_CD.equals("320")){
	        	TYPE = "5";
	        }
			
			Admin_BaseBean	Bean	= new Admin_BaseBean();
			
			//	������ ��ȣ ����
			adminno	= Adminno_Maker(SI_CD, GU_CD, BJ_CD, TYPE);
			
			System.out.println("@@@@@@@@@ ADMIN_NO : "+adminno);
			
			if(adminno	==	null)
				return	null;
			
			Bean.setADMIN_NO(adminno);
			Bean.setREGDATE(util.Date_Cut(REGDATE));
			Bean.setUP_DATE(util.Date_Cut(REGDATE));
			Bean.setMANAGER(MANAGER);
			Bean.setFINISH_ID(util.getSessionID(request,"sessionUserId"));
			Bean.setCHECK_YN("0");
		
			//	ADMIN_BASE�� �����Ѵ�.
			boolean	result	= iMinwonService.executeAdmin_Base_Register(Bean);
			
			if(result == false)
				return	null;
		}catch(Exception e){
			System.out.println("error:"+e.toString());
		}	
		return	adminno;
	}
	
	
	//	�ο����� ���
	public String	Minwon_Register_Execute(HttpServletRequest request,HttpServletResponse response, String adminno) throws Exception 
	{
		try{
			
			//	UserBean	userBean	= new UserBean();
			//	userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
				MinwonBean	minwonBean	= new MinwonBean();
				bind(request, minwonBean);
				
				String	min_ssn		= "";
				if(!ServletRequestUtils.getStringParameter(request, "min_ssn2", "").equals(""))
					min_ssn		= ServletRequestUtils.getStringParameter(request, "min_ssn1", "") + ServletRequestUtils.getStringParameter(request, "min_ssn2", "");
				
				String tel = "";
				String tel1 = ServletRequestUtils.getStringParameter(request, "min_tel1", "");
				String tel2 =ServletRequestUtils.getStringParameter(request, "min_tel2", "");
				String tel3 =ServletRequestUtils.getStringParameter(request, "min_tel3", "");
				
				if(!tel3.equals("")){			tel = tel1 + "-" + tel2 + "-" + tel3;		}
				
				String hp = "";
				String hp1 = ServletRequestUtils.getStringParameter(request, "min_hp1", "");
				String hp2 = ServletRequestUtils.getStringParameter(request, "min_hp2", "");
				String hp3 = ServletRequestUtils.getStringParameter(request, "min_hp3", "");
			
				if(!hp3.equals("")){			hp = hp1 + "-" + hp2 + "-" + hp3;		}
				
				String min_agent_tel = "";
				String min_agent_tel1 = ServletRequestUtils.getStringParameter(request, "min_agent_tel1", "");
				String min_agent_tel2 = ServletRequestUtils.getStringParameter(request, "min_agent_tel2", "");
				String min_agent_tel3 = ServletRequestUtils.getStringParameter(request, "min_agent_tel3", "");
			
				if(!min_agent_tel3.equals("")){			min_agent_tel = min_agent_tel1 + "-" + min_agent_tel2 + "-" + min_agent_tel3;		}
				
				//********** BEGIN_����_20120215
				String bizssn = "";
				String jumin_bizssn1 = ServletRequestUtils.getStringParameter(request, "jumin_bizssn1", "");
				String jumin_bizssn2 =ServletRequestUtils.getStringParameter(request, "jumin_bizssn2", "");
				String jumin_bizssn3 =ServletRequestUtils.getStringParameter(request, "jumin_bizssn3", "");
				
				if(!jumin_bizssn3.equals("")){			bizssn = jumin_bizssn1 + "-" + jumin_bizssn2 + "-" + jumin_bizssn3;		}
				
				minwonBean.setBIZSSN_MIN(bizssn);
				//********** END_����_20120215
				
				minwonBean.setPOST_MIN(util.Post_Cut(minwonBean.getPOST_MIN()));
				minwonBean.setREQ_DATE_MIN(util.Date_Cut(minwonBean.getREQ_DATE_MIN()));
				minwonBean.setPREDATE_MIN(util.Date_Cut(minwonBean.getPREDATE_MIN()));
				//********** BEGIN_����_20120216
				/*
				minwonBean.setTEL_MIN(tel);
				minwonBean.setHP_MIN(hp);				
				minwonBean.setAGENT_TEL_MIN(min_agent_tel);
				minwonBean.setSSN_MIN(min_ssn);				 
				 */
				
				if(tel != ""){
					minwonBean.setTEL_MIN(tel);	
				}
				if(hp != ""){
					minwonBean.setHP_MIN(hp);
				}
				if(min_agent_tel != ""){
					minwonBean.setAGENT_TEL_MIN(min_agent_tel);
				}
				if(min_ssn != ""){
					minwonBean.setSSN_MIN(min_ssn);
				}				
				//********** END_����_20120216
				
				minwonBean.setADMIN_NO_MIN(adminno);			
				minwonBean.setMINWON_REFERENCE(ServletRequestUtils.getStringParameter(request, "MINWON_REFERENCE", ""));

				//	�ο� ���̺� �����Ѵ�.
				iMinwonService.executeMinwon_Register(minwonBean);
				
		}catch(Exception e){
			System.out.println("error:"+e.toString());
		}	
		return	null;
	}
	
	//	�ο����� ���
	public String	Saewol_Minwon_Register_Execute(HttpServletRequest request,HttpServletResponse response, String adminno) throws Exception 
	{
		try{
			
			//	UserBean	userBean	= new UserBean();
			//	userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
				MinwonBean	minwonBean	= new MinwonBean();
				bind(request, minwonBean);
				
				String	min_ssn		= "";
				if(!ServletRequestUtils.getStringParameter(request, "min_ssn2", "").equals(""))
					min_ssn		= ServletRequestUtils.getStringParameter(request, "min_ssn1", "") + ServletRequestUtils.getStringParameter(request, "min_ssn2", "");
				
				minwonBean.setPOST_MIN(util.Post_Cut(minwonBean.getPOST_MIN()));
				minwonBean.setREQ_DATE_MIN(util.Date_Cut(minwonBean.getREQ_DATE_MIN()));
				minwonBean.setPREDATE_MIN(util.Date_Cut(minwonBean.getPREDATE_MIN()));
				minwonBean.setTEL_MIN(ServletRequestUtils.getStringParameter(request, "min_tel", ""));
				minwonBean.setHP_MIN(ServletRequestUtils.getStringParameter(request, "min_hp", ""));
				minwonBean.setAGENT_TEL_MIN(ServletRequestUtils.getStringParameter(request, "min_agent_tel", ""));
				minwonBean.setSSN_MIN(min_ssn);
				minwonBean.setADMIN_NO_MIN(adminno);
				
				minwonBean.setMINWON_REFERENCE(ServletRequestUtils.getStringParameter(request, "MINWON_REFERENCE", ""));
				
				//	�ο� ���̺� �����Ѵ�.
				iMinwonService.executeMinwon_Register(minwonBean);
				
		}catch(Exception e){
			System.out.println("error:"+e.toString());
		}	
		return	null;
	}
	
	//	������ ���
	public String	Appeal_Register_Execute(HttpServletRequest request,HttpServletResponse response, String adminno) throws Exception 
	{
		try{
			
			//	���ǿ� �ִ� �������� �����͸� �����´�.
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
			if(!ServletRequestUtils.getStringParameter(request, "jumin_hp3", "").equals(""))
			{
				jumin_hp	= ServletRequestUtils.getStringParameter(request, "jumin_hp1", "") + "-" +
				ServletRequestUtils.getStringParameter(request, "jumin_hp2", "") + "-" +
					ServletRequestUtils.getStringParameter(request, "jumin_hp3", "");
			}
			
			String	jumin_totel	= "";
			if(!ServletRequestUtils.getStringParameter(request, "jumin_totel3", "").equals(""))
			{
				jumin_totel	= ServletRequestUtils.getStringParameter(request, "jumin_totel1", "") + "-" +
				ServletRequestUtils.getStringParameter(request, "jumin_totel2", "") + "-" +
					ServletRequestUtils.getStringParameter(request, "jumin_totel3", "");
			}
			
			String	jumin_tohp	= "";
			if(!ServletRequestUtils.getStringParameter(request, "jumin_tohp3", "").equals(""))
			{
				jumin_tohp	= ServletRequestUtils.getStringParameter(request, "jumin_tohp1", "") + "-" +
				ServletRequestUtils.getStringParameter(request, "jumin_tohp2", "") + "-" +
					ServletRequestUtils.getStringParameter(request, "jumin_tohp3", "");
			}
			
			String b_permission = ServletRequestUtils.getStringParameter(request, "B_PERMISSION", "");
			
			
			String san = ServletRequestUtils.getStringParameter(request, "SAN", "");
			if(san.equals("on")){
				appealBean.setSAN("1");
			}else{
				appealBean.setSAN("0");
			}
			String tosan = ServletRequestUtils.getStringParameter(request, "TOSAN", "");
			if(tosan.equals("on")){
				appealBean.setTOSAN("1");
			}else{
				appealBean.setTOSAN("0");
			}
			
			appealBean.setSSN(jumin_ssn);
			appealBean.setBIZSSN(jumin_bizssn);
			appealBean.setTEL(jumin_tel);
			appealBean.setHP(jumin_hp);
			appealBean.setTOTEL(jumin_totel);
			appealBean.setTOHP(jumin_tohp);
			appealBean.setTODATE(util.Date_Cut(appealBean.getTODATE()));		//	ó����������		
			appealBean.setREQ_CK("1");
			appealBean.setADMIN_NO(adminno);
			appealBean.setPOST(util.Post_Cut(appealBean.getPOST()));
			appealBean.setTOPOST(util.Post_Cut(appealBean.getTOPOST()));
			appealBean.setADDR_CHECK(ServletRequestUtils.getStringParameter(request, "ADDR_CHECK", "0"));
		
			appealBean.setAPPEAL_REFERENCE(ServletRequestUtils.getStringParameter(request, "APPEAL_REFERENCE", ""));
			appealBean.setB_PERMISSION(b_permission);
			
			//********** BEGIN_����_20120215
			appealBean.setBD_NM(ServletRequestUtils.getStringParameter(request, "BD_NM_NEW", ""));	
			//********** END_����_20120215
			
			System.out.println("Appeal_Register_ExecuteAppeal_Register_ExecuteAppeal_Register_ExecuteAppeal_Register_Execute");
			//	������ �����͸� �����Ѵ�.
			iMinwonService.executeAppeal_Register(appealBean);
			
		}catch(Exception e){
			System.out.println("error:"+e.toString());
		}	
		return	null;
	}
	

	//	������ ���
	public boolean	Place_Register_Execute(HttpServletRequest request,HttpServletResponse response, String adminno) throws Exception 
	{
		PlaceBean	palceBean	= new PlaceBean();
		
		try{
			//	���ǿ��� �õ� �ڵ带 �����´�.
			String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
			
			//	������ �����͸� �����´�.
			UserBean	userBean	= new UserBean();
			userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
			bind(request, palceBean);
			palceBean.setADMIN_NO(adminno);
			
			palceBean.setMUL_FROMDATE(util.Date_Cut(palceBean.getMUL_FROMDATE()));		//	���������
			palceBean.setMUL_TODATE(util.Date_Cut(palceBean.getMUL_TODATE()));			//	����������
			palceBean.setWORK_FROMDATE(util.Date_Cut(palceBean.getWORK_FROMDATE()));	//	���� ������
			palceBean.setWORK_TODATE(util.Date_Cut(palceBean.getWORK_TODATE()));		//	���� ������
			palceBean.setFINISH_DATE(util.Date_Cut(palceBean.getFINISH_DATE()));		//	�ذ�����
			palceBean.setMUL_POST(util.Post_Cut(palceBean.getMUL_POST()));		//	�ذ�����
			palceBean.setDUE_DATE(util.Date_Cut(palceBean.getDUE_DATE()));	// �Ͻ����� ������
			palceBean.setSIDO(SIDO_CD);
			palceBean.setSIGUNGU(userBean.getSIGU_CD());
			
			palceBean.setAREA_SIZE(ServletRequestUtils.getStringParameter(request, "AREA_SIZE",""));
			
			palceBean.setPLACE_REFERENCE(ServletRequestUtils.getStringParameter(request, "PLACE_REFERENCE", ""));
			
			String reduction_rate = ServletRequestUtils.getStringParameter(request,"REDUCTION_RATE","");
			if(reduction_rate == null || reduction_rate.equals("0") || reduction_rate.equals("")){
				palceBean.setREDUCTION_RATE("0");
			}else{
				palceBean.setREDUCTION_RATE(reduction_rate);
			}
			String percent_rate = ServletRequestUtils.getStringParameter(request,"PERCENT_RATE","");
			if(percent_rate == null || percent_rate.equals("0") || percent_rate.equals("")){
				palceBean.setPERCENT_RATE("0");
			}else{
				palceBean.setPERCENT_RATE(percent_rate);
			}
			
			//�������� ���� ���� ����
			iMinwonService.executeDeletePlaceWithAddr(adminno);
			
            String[] WITH_ADDR_PNU = request.getParameterValues("WITH_ADDR_PNU");
            String[] WITH_ADDR_TEXT = request.getParameterValues("WITH_ADDR_TEXT");
            
            for(int i = 0 ; i < WITH_ADDR_PNU.length ; i++){
            	iMinwonService.executeInsertPlaceWithAddr(adminno, WITH_ADDR_PNU[i], WITH_ADDR_TEXT[i]);	
            }
            
			//	������ ������ ����
		}catch(Exception e){
			System.out.println("error:"+e.toString());
		}	
		return	iMinwonService.executePlace_Register(palceBean);
	}
	
	
	//	���� ��ȣ ����
	private	String	Adminno_Maker(String SI_CD, String GU_CD, String BJ_CD, String TYPE)
	{
		String	ADMIN_NO	= null;
		
		try
		{
			Calendar 	cal 	= Calendar.getInstance();
	
			String	Year		= Integer.toString(cal.get(Calendar.YEAR));
			String	Si			= SI_CD;
			String	Gu			= GU_CD;
			String	Bj			= BJ_CD.substring(0, 3);
			String	Type		= TYPE;
			String	Seq			= null;
			int		Count		= iMinwonService.executeCheck_AdminnoCount(BJ_CD);
			int		Result		= 0;

			//	���ܷ� ���� ������ȣ�� �������, �ٽ� ��ȣ�� �����ϰ� ���� ������ȣ�� �ִ��� Ȯ���Ѵ�.
			for(int i = 0	;	i < 10	;	i++)
			{
				Count	+= (10001 + i);
				//Seq		= Integer.toString(Count).substring(1, 5);
				Seq		= Integer.toString(Count);

				ADMIN_NO	= Year + Si + Gu + Bj + "_" + Type + "_" + Seq;
				
				//	���� ������ȣ üũ
				Result	= iMinwonService.executeCheck_Adminno(ADMIN_NO);
				
				if(Result	== 0)
					break;
			}
			
//			System.out.println(" �ű� ������ȣ : " + ADMIN_NO);
		}
		catch(Exception e)
		{
			ADMIN_NO	= null;
			
			System.out.println(" �ű� ������ȣ ���� ");
		}
		
		return	ADMIN_NO;
	}
	
	
	//	����
	//	�űԵ�� (�ο�, ������, ������) ���￡�� ������ �����͸� ����Ѵ�.
	public ModelAndView		RegisterPrc_Saewol(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		try{
			
			//	ADMIN_BASE �� ���� ������ȣ�� �ִ��� Ȯ���ϰ� ������ �����Ѵ�.
			String	adminno	= AdminBase_RegisterSaewol_Execute(request, response); 
			
			if(adminno	!=	null)
			{
				//	������ ����
				Appeal_RegisterSaewol_Execute(request, response, adminno);
	
				//	������ ����
				Place_Register_Execute(request, response, adminno);
			}
			
		}catch(Exception e){
			System.out.println("error:"+e.toString());
		}	
		return null;//Search(request, response);
	}
	
	//	���ÿ� �ִ� �����͸� ������ ADMIN_BASE�� �����Ѵ�.
	public String	AdminBase_RegisterSaewol_Execute(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		String	adminno	= null;
		try{
			//	properties ���Ͽ� �ִ� �õ� �ڵ带 �����´�.
			String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
	
			//	������ �����͸� �����´�.
			UserBean	userBean	= new UserBean();
			userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
	
			String 	REGDATE 	= ServletRequestUtils.getStringParameter(request, "REQ_DATE", "");
	//		System.out.println(" REGDATE : " + REGDATE);
			
			String 	MANAGER 	= ServletRequestUtils.getStringParameter(request, "MANAGER", "");
			
			String 	BJ_CD 	= ServletRequestUtils.getStringParameter(request, "BJ_CD", "");
			String 	TYPE 	= ServletRequestUtils.getStringParameter(request, "TYPE", "");
			String 	SI_CD 	= SIDO_CD;	//	�õ� �ڵ带 �����´�.
			String 	GU_CD 	= userBean.getSIGU_CD();
			
	//		System.out.println(" GU_CD : " + GU_CD);
			
			Admin_BaseBean	Bean	= new Admin_BaseBean();
			
			//	������ ��ȣ ����
			adminno	= Adminno_Maker(SI_CD, GU_CD, BJ_CD, TYPE);
			Bean.setADMIN_NO(adminno);
	//		Bean.setSEQ("0");
			Bean.setREGDATE(util.Date_Cut(REGDATE));
			Bean.setUP_DATE(util.Date_Cut(REGDATE));
			Bean.setMANAGER(MANAGER);
			Bean.setFINISH_ID(util.getSessionID(request,"sessionUserId"));
			Bean.setCHECK_YN("0");
			
	//		System.out.println(" adminno : " + adminno);
			
			//	ADMIN_BASE�� �����Ѵ�.
			boolean	result	= iMinwonService.executeAdmin_Base_Register(Bean);
			
	//		System.out.println(" result : " + result);
			
			if(result == false)
				return	null;
			
		}catch(Exception e){
			System.out.println("error:"+e.toString());
		}	
		return	adminno;
	}
	
	
	//	�ο���� �߰�
	public String		Appeal_RegisterSaewol_Execute(HttpServletRequest request,HttpServletResponse response, String adminno) throws Exception 
	{
		try{
			//	������ ������ �����´�
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
			
			appealBean.setREQ_DATE(util.Date_Cut(appealBean.getREQ_DATE()));	//	��������
			appealBean.setPREDATE(util.Date_Cut(appealBean.getPREDATE()));		//	ó����������
			appealBean.setTODATE(util.Date_Cut(appealBean.getTODATE()));		//	ó����������
			
			appealBean.setREQ_CK("1");
			appealBean.setADMIN_NO(adminno);
			
			//	������ ���� ����
			iMinwonService.executeAppeal_Register(appealBean);
		}catch(Exception e){
			System.out.println("error:"+e.toString());
		}	
		return	null;
	}
	
	//	�����ڵ�
	public ModelAndView 	Jumyong_JibunInfo(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		
		JibunWebControl	jibunWebControl	= new JibunWebControl();
		
		try{
			
			String 	BJ_CD	= ServletRequestUtils.getStringParameter(request, "BJ_CD", "");
			String 	HJ_CD	= ServletRequestUtils.getStringParameter(request, "HJ_CD", "");
			String 	SPC_CD	= ServletRequestUtils.getStringParameter(request, "SPC_CD", "");
			String 	BONBUN_CD	= ServletRequestUtils.getStringParameter(request, "BONBUN_CD", "");
			String 	BUBUN_CD	= ServletRequestUtils.getStringParameter(request, "BUBUN_CD", "");
			
			String	Xml		= jibunWebControl.getJumyong_JibunInfo(BJ_CD, HJ_CD, SPC_CD, BONBUN_CD, BUBUN_CD, iMinwonService);
			
	        response.setContentType("text/html;charset=utf-8");
	        response.setHeader("Cache-Control", "no-cache");
	        response.getWriter().write(Xml);
	        
		}catch(Exception e){
			System.out.println("error:"+e.toString());
		}
		
		return	null;
	}
	
	//	������ ����  ����
	public ModelAndView		Total_With(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		HttpSession session = request.getSession();		
		String 		userId	= (String)session.getAttribute("sessionUserId");					
		
		List list = null;
		
		try{
			if(userId != null){
				
				String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
				String 	GU_CD 	= userBean.getSIGU_CD();
				String BJ_CD = ServletRequestUtils.getStringParameter(request,"bjCD","");
				String HJ_CD = ServletRequestUtils.getStringParameter(request,"hjCD","");
				String SPC_CD = ServletRequestUtils.getStringParameter(request,"spcCD","");
							
				SimpleDateFormat	formatter 	= new SimpleDateFormat("yyyy", Locale.KOREA);
				Calendar 			cal 		= Calendar.getInstance();
				String	 year = formatter.format(cal.getTime());

				request.setAttribute("SIDO_CD", SIDO_CD);
				request.setAttribute("GU_CD", GU_CD);
				request.setAttribute("BJ_CD",BJ_CD );
				request.setAttribute("HJ_CD",HJ_CD );
				request.setAttribute("SPC_CD",SPC_CD );
				request.setAttribute("YEAR",year );
				
				System.out.println("@@@@@@@@@@SIDO_CD : "+SIDO_CD +" GUCD :"+GU_CD+" BJ_CD : "+BJ_CD+" SPC_CD : "+SPC_CD+" HJ_CD : "+HJ_CD);
				
				System.out.println("#############BJDONG : " + commonCode.executeBJDongName("11",GU_CD,BJ_CD) );
				
				request.setAttribute("BJ_NM",commonCode.executeBJDongName("11",GU_CD,BJ_CD));
		
			}
		}catch(Exception e){	
			System.out.println("error:"+e.toString());	
		}	
		return new ModelAndView("/jumyong/minwon/tab/total_with", "blist", list);
	}
	
//	 �������� ��������
	public ModelAndView 	getPrice(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");	
		
		try{
			if(userId != null)
			{
				String ADDRESS = ServletRequestUtils.getStringParameter(request,"ADDRESS","");
				String BONBUN = ServletRequestUtils.getStringParameter(request,"BONBUN","");
				String BUBUN = ServletRequestUtils.getStringParameter(request,"BUBUN","");
				String YEAR = ServletRequestUtils.getStringParameter(request,"YEAR","");
				
				System.out.println("ADDRESS : "+ADDRESS + "BONBUN : "+BONBUN + "BUBUN : "+BUBUN + "YEAR : "+YEAR);
				
										
							
				//���� ��¥ 
				Calendar  cal  =  Calendar.getInstance();
				SimpleDateFormat  sdf  =  new SimpleDateFormat("yyyyMMdd");      // ������ ��� ���� ����
				String  toDate  =  sdf.format (cal.getTime());      // ���� ��¥ ������ ����
			
				
				try
				{
					Map a = iMinwonService.get_Price(ADDRESS,BONBUN,BUBUN);
					request.setAttribute("YEAR",YEAR);
					
					//System.out.println("a.size()==== " + a.size() );
					if(a.size() > 0)
					{
					
					request.setAttribute("SI_NM",a.get("SI_NM")+"��");
					request.setAttribute("GU_NM",a.get("GU_NM"));
					request.setAttribute("BJ_NM",a.get("BJ_NM"));
					if(BUBUN==null ||BUBUN.equals("")){
						request.setAttribute("BUNJI",BONBUN);
					}else{
						request.setAttribute("BUNJI",BONBUN+"-"+BUBUN);
					}								
						
						int i = Integer.parseInt(toDate.substring(0,4)) - Integer.parseInt(YEAR);
						String giga = "";
						//System.out.println("#################i:"+i);
						if(i == 0 || i == -1)
							giga = a.get("JIGA").toString();
						else if(i == 1)
							giga = a.get("JIGA_2PY").toString();
						else if(i == 2)
							giga = a.get("JIGA_3PY").toString();
						else if(i == 3)
							giga = a.get("JIGA_4PY").toString();
						
						//System.out.println("%%%%%%%%%%%%%%%%giga:"+giga);
						request.setAttribute("giga",giga);
					}else
						request.setAttribute("SI_NM","�ش� �ּ��� ���������� �����ϴ�.");
				}catch(Exception err)
				{
					request.setAttribute("SI_NM","�ش� �ּ��� ���������� �����ϴ�.");
					request.setAttribute("giga","0");
					System.out.println(err.toString());
				}
			}
		}catch(Exception e){
			System.out.println("error:"+e.toString());
		}
		return new ModelAndView("/jumyong/minwon/tab/officialLandPrice" );
	}
}
