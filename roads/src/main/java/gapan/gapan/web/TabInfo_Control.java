//	2009		Kim Yun Seo

package main.java.gapan.gapan.web;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.common.commonCode.model.ContactSysInfoBean;
import main.java.common.commonCode.model.RefDeptCodeBean;
import main.java.common.commonCode.model.UserBean;
import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.util.FileUploadUtil2;
import main.java.common.util.Globals;
import main.java.common.util.catUtil.Pageing;
import main.java.common.util.catUtil.Util;
import main.java.facility.minwon.model.Admin_BaseBean;
import main.java.facility.minwon.web.SOWNN00216Control;
import main.java.gapan.gapan.model.GapanBaseBean;
import main.java.gapan.gapan.model.GapanHeadBean;
import main.java.gapan.gapan.model.GapanInfoBean;
import main.java.gapan.gapan.service.IGapanService;
import main.java.jumyong.minwon.model.MinwonBean;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.MultipartRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class TabInfo_Control	extends MultiActionController {

	private	IGapanService		iGapanService	= null;
	private	CommonCodeService	commonCode		= null;
	private	Util				util			= new Util();
	private	Pageing				pageing			= new Pageing();
	
	
	public void setGapanService(IGapanService gapanService) 
	{
		this.iGapanService = gapanService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode)
	{
		this.commonCode 	= commonCode;
	}
	
	//	�ű� ��� ȭ�� ���
	public	ModelAndView Register(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		//	 ���� ����
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");

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
					request.setAttribute("SIGUNGU", userBean.getGU_NM());
					request.setAttribute("SIGU_CD", userBean.getSIGU_CD());
					request.setAttribute("MANAGE_DEP_MIN", userBean.getDEPT_NM());
				}
		
				request.setAttribute("use_type", commonCode.executeCommonCode("use_type", null, "����"));
				request.setAttribute("occupancy_type", commonCode.executeCommonCode("occupancy_type", null, "����"));
				request.setAttribute("use_owner_Group", commonCode.executeCommonCode("use_ownerGroup", null, "����"));
				request.setAttribute("taxation_section", commonCode.executeCommonCode("taxation_section", null, "����"));
				request.setAttribute("mul_spc_cd", commonCode.executeCommonCode("MUL_SPC_CD", null, null));
				
				request.setAttribute("SIDO", SIDO_CD);
				request.setAttribute("SIDO_NM", commonCode.executeSiNm(SIDO_CD));
				request.setAttribute("bjdong_code", commonCode.executeBJDongCode(SIDO_CD, userBean.getSIGU_CD(), null));
				request.setAttribute("hjdong_code", commonCode.executeHJDongCode(SIDO_CD, userBean.getSIGU_CD(), null));
				
				request.setAttribute("gp_typ", commonCode.executeGapanCode("GP_TYP", null, "����"));
				request.setAttribute("rt_sel", commonCode.executeGapanCode("RT_SEL", null, "����"));
				request.setAttribute("lc_sel", commonCode.executeGapanCode("LC_SEL", null, "����"));
				request.setAttribute("pt_sel", commonCode.executeGapanCode("PT_SEL", null, "����"));
				request.setAttribute("ar_sel", commonCode.executeGapanCode("AR_SEL", null, "����"));
				request.setAttribute("uc_sel", commonCode.executeGapanCode("UC_SEL", null, "����"));
				request.setAttribute("dp_sel", commonCode.executeGapanCode("DP_SEL", null, "����"));
				request.setAttribute("ft_typ", commonCode.executeGapanCode("FT_TYP", null, "����"));
				request.setAttribute("ft_sel", commonCode.executeGapanCode("FT_SEL", null, "����"));
				request.setAttribute("sg_typ", commonCode.executeGapanCode("SG_TYP", null, "����"));
				request.setAttribute("mt_sel", commonCode.executeGapanCode("MT_SEL", null, "����"));
				request.setAttribute("sg_itm", commonCode.executeGapanCode("SG_ITM", null, "����"));
				request.setAttribute("sg_sel", commonCode.executeGapanCode("SG_SEL", null, "����"));
				request.setAttribute("un_typ", commonCode.executeGapanCode("UN_TYP", null, "����"));
				
				
				//	��������
				SimpleDateFormat	formatter 	= new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA);
				Calendar 			cal 		= Calendar.getInstance();
				String	today		= formatter.format(cal.getTime());
				request.setAttribute("REQ_DATE_MIN", today);}
			
		} catch(Exception e){
			System.out.println(e.toString());
		}
		
		return new ModelAndView("/gapan/gapan/tab/info_register");
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
					request.setAttribute("SIGUNGU", userBean.getGU_NM());
					request.setAttribute("MANAGE_DEPT", userBean.getDEPT_NM());
					
					request.setAttribute("MANAGER_MIN", userBean.getNAME());
					request.setAttribute("SIGUNGU", userBean.getGU_NM());
					request.setAttribute("SIGU_CD", userBean.getSIGU_CD());
					request.setAttribute("MANAGE_DEP_MIN", userBean.getDEPT_NM());
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
				
				request.setAttribute("bjdong_code", commonCode.executeBJDongCode(SIDO_CD, userBean.getSIGU_CD(), null));
				request.setAttribute("hjdong_code", commonCode.executeHJDongCode(SIDO_CD, userBean.getSIGU_CD(), null));
				request.setAttribute("mul_spc_cd", commonCode.executeCommonCode("MUL_SPC_CD", null, "����"));
				
				request.setAttribute("SIDO", SIDO_CD);
				request.setAttribute("SIDO_NM", commonCode.executeSiNm(SIDO_CD));
				request.setAttribute("bjdong_code", commonCode.executeBJDongCode(SIDO_CD, userBean.getSIGU_CD(), null));
				request.setAttribute("hjdong_code", commonCode.executeHJDongCode(SIDO_CD, userBean.getSIGU_CD(), null));
				
				request.setAttribute("gp_typ", commonCode.executeGapanCode("GP_TYP", null, "����"));
				request.setAttribute("rt_sel", commonCode.executeGapanCode("RT_SEL", null, "����"));
				request.setAttribute("lc_sel", commonCode.executeGapanCode("LC_SEL", null, "����"));
				request.setAttribute("pt_sel", commonCode.executeGapanCode("PT_SEL", null, "����"));
				request.setAttribute("ar_sel", commonCode.executeGapanCode("AR_SEL", null, "����"));
				request.setAttribute("uc_sel", commonCode.executeGapanCode("UC_SEL", null, "����"));
				request.setAttribute("dp_sel", commonCode.executeGapanCode("DP_SEL", null, "����"));
				request.setAttribute("ft_typ", commonCode.executeGapanCode("FT_TYP", null, "����"));
				request.setAttribute("ft_sel", commonCode.executeGapanCode("FT_SEL", null, "����"));
				request.setAttribute("sg_typ", commonCode.executeGapanCode("SG_TYP", null, "����"));
				request.setAttribute("mt_sel", commonCode.executeGapanCode("MT_SEL", null, "����"));
				request.setAttribute("sg_itm", commonCode.executeGapanCode("SG_ITM", null, "����"));
				request.setAttribute("sg_sel", commonCode.executeGapanCode("SG_SEL", null, "����"));
				request.setAttribute("un_typ", commonCode.executeGapanCode("UN_TYP", null, "����"));
				
				
				//	��������
				SimpleDateFormat	formatter 	= new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA);
				Calendar 			cal 		= Calendar.getInstance();
				String	today		= formatter.format(cal.getTime());
				request.setAttribute("REQ_DATE_MIN", today);
				
				
				
				
				
				
				
				String 	ADMIN_NO = ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
				
				//������ �����͸� �����´�.
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
		return new ModelAndView("/gapan/gapan/tab/saewol_register");
	}
	
	
	//	�űԵ�� (�ο�, ������, �ü���)
	public ModelAndView	RegisterPrc(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{

		//GAPAN_BASE ���̺�  ���� �����Ͱ� �ִ��� Ȯ���Ѵ�. (������ �����ϰ� �����ڹ�ȣ�� �����Ѵ�.)
		String	GAPAN_NO	= Gapan_Base_Register_Execute(request, response);
		
		if(GAPAN_NO	!=	null)
		{
			//	�ο������� �����Ѵ�.
			Minwon_Register_Execute(request, response, GAPAN_NO);
			
			//	������ �����͸� �����Ѵ�.
			Gapan_Head_Register_Execute(request, response, GAPAN_NO);
			
			
			//	�ü��� ������ �����Ѵ�.
			Gapan_Info_Register_Execute(request, response, GAPAN_NO);
		}
	
		request.setAttribute("menu_param", "jumyong");
		
		return new ModelAndView("/gapan/jumyong/registerPrc");
	}
	
//	���� �����͸� �űԵ�� (�ο�, ������, ������)
	public ModelAndView	Saewol_RegisterPrc(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{		
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");		
		
		try{
			if(userId != null){
				//GAPAN_BASE ���̺�  ���� �����Ͱ� �ִ��� Ȯ���Ѵ�. (������ �����ϰ� �����ڹ�ȣ�� �����Ѵ�.)
				String	GAPAN_NO	= Gapan_Base_Register_Execute(request, response);
				
				if(GAPAN_NO	!=	null)
				{
					//	�ο������� �����Ѵ�.
					Saewol_Minwon_Register_Execute(request, response, GAPAN_NO);
					
					//	������ �����͸� �����Ѵ�.
					Gapan_Head_Register_Execute(request, response, GAPAN_NO);
					
					//	�ü��� ������ �����Ѵ�.
					Gapan_Info_Register_Execute(request, response, GAPAN_NO);
				}
			}
		}catch(Exception e){
			System.out.println(e.toString());
		}									

		request.setAttribute("menu_param", "jumyong");
		
		return new ModelAndView("/gapan/jumyong/registerPrc");
	}
	
	//GAPAN_BASE ���
	public String	Gapan_Base_Register_Execute(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		
		//������ �����͸� �����´�.
		UserBean	userBean	= new UserBean();
		userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
		
		//	���ǿ��� �õ� �ڵ带 �����´�.
		String	min_ssn1		= "";
		if(!ServletRequestUtils.getStringParameter(request, "min_ssn1", "").equals(""))
			min_ssn1		= ServletRequestUtils.getStringParameter(request, "min_ssn1", "");
		
		String bj_cd = ServletRequestUtils.getStringParameter(request, "BJ_CD", "");
		bj_cd = bj_cd.substring(0,3);
		
		String 	GAPAN_NO 	= Gapan_No_Maker(userBean.getSIGU_CD()+bj_cd);	//GAPAN_NO ����
		String 	REGDATE 	= ServletRequestUtils.getStringParameter(request, "REQ_DATE_MIN", "");
		String 	MANAGER 	= ServletRequestUtils.getStringParameter(request, "MANAGER_MIN", "");
		String 	CLOSEDATE 	= ServletRequestUtils.getStringParameter(request, "CLOSE_DATE", "");
		String 	GP_TYP 	= ServletRequestUtils.getStringParameter(request, "GP_TYP", "");
		String  USERID 		= util.getSessionID(request, "sessionUserId");
		
		GapanBaseBean	Bean	= new GapanBaseBean();
		
		Bean.setGAPAN_NO(GAPAN_NO);
		Bean.setREG_DATE(util.Date_Cut(REGDATE));
		Bean.setUP_DATE(util.Date_Cut(REGDATE));
		Bean.setMANAGER(MANAGER);
		Bean.setCLOSE_DATE(CLOSEDATE);
		Bean.setGP_TYPE(GP_TYP);
		Bean.setFINISH_ID(USERID);
		
		//	ADMIN_BASE�� �����Ѵ�.
		iGapanService.executeGapan_Base_Register(Bean);
		
		return	GAPAN_NO;
	}
	
//	���ÿ���
	//	���� �����͸� �ο����� ���
	public String	Saewol_Minwon_Register_Execute(HttpServletRequest request,HttpServletResponse response, String GAPAN_NO) throws Exception 
	{
		try{
		
			MinwonBean	minwonBean	= new MinwonBean();
			bind(request, minwonBean);
			

			String	min_ssn		= "";
			if(!ServletRequestUtils.getStringParameter(request, "min_ssn2", "").equals(""))
				min_ssn		= ServletRequestUtils.getStringParameter(request, "min_ssn1", "") + ServletRequestUtils.getStringParameter(request, "min_ssn2", "");
		
			
			minwonBean.setREQ_DATE_MIN(util.Date_Cut(minwonBean.getREQ_DATE_MIN()));
			minwonBean.setPREDATE_MIN(util.Date_Cut(minwonBean.getPREDATE_MIN()));
			minwonBean.setAGENT_TEL_MIN(ServletRequestUtils.getStringParameter(request, "min_agent_tel", ""));
			minwonBean.setTEL_MIN(ServletRequestUtils.getStringParameter(request, "min_tel", ""));
			minwonBean.setHP_MIN(ServletRequestUtils.getStringParameter(request, "min_hp", ""));
			minwonBean.setSSN_MIN(min_ssn);
			minwonBean.setADMIN_NO_MIN(GAPAN_NO);	// CORP_CD + GU_CD + REQUEST_NO
		
			//	�ο� ������ ����
			iGapanService.executeMinwon_Register(minwonBean);
		}catch(Exception e){
			e.printStackTrace();
		}	
		return	null;
	}
	
	//	���� ��ȣ ����
	private	String	Gapan_No_Maker(String gapan_num)	//gapan_num�� ���ڵ�+�������ڵ� 
	{
		
		String	GAPAN_NO	= null;
		
		try
		{
			//	���� ������ȣ üũ
			GAPAN_NO	= iGapanService.executeCheck_Gapanno(gapan_num);
		}
		catch(Exception e)
		{
			GAPAN_NO	= null;
			
//			System.out.println(" �ű� ������ȣ ���� ");
		}
		
		return	GAPAN_NO;
	}
	
	//�ο����� ���
	public String	Minwon_Register_Execute(HttpServletRequest request,HttpServletResponse response, String GAPAN_NO) throws Exception 
	{
		
		MinwonBean	minwonBean	= new MinwonBean();
		bind(request, minwonBean);
		
		String	min_ssn		= "";
		if(!ServletRequestUtils.getStringParameter(request, "min_ssn2", "").equals(""))
			min_ssn		= ServletRequestUtils.getStringParameter(request, "min_ssn1", "") + ServletRequestUtils.getStringParameter(request, "min_ssn2", "");
		
		minwonBean.setREQ_DATE_MIN(util.Date_Cut(minwonBean.getREQ_DATE_MIN()));
		minwonBean.setPREDATE_MIN(util.Date_Cut(minwonBean.getPREDATE_MIN()));

		minwonBean.setSSN_MIN(min_ssn);
		minwonBean.setADMIN_NO_MIN(GAPAN_NO);
		
		//	�ο� ���̺� �����Ѵ�.
		boolean result = iGapanService.executeMinwon_Register(minwonBean);
		
		return "";
	}
	
	//���� 	��� ����/������ ����
	public String Gapan_Head_Register_Execute(HttpServletRequest request,HttpServletResponse response, String GAPAN_NO) throws Exception
	{
		
		try{
		
			GapanHeadBean gapanHeadBean = new GapanHeadBean();
			
			bind(request, gapanHeadBean);
			
			//����� 2009.11.09 ����
			//��� �ź��� Ȯ�� ����
			String OWNER_IDCHK = ServletRequestUtils.getStringParameter(request, "OWNER_IDCHK", "0");
			System.out.println(OWNER_IDCHK);
			
			//������
			//��� �ֹι�ȣ
			String	owner_ssn = "";
			String owner_ssn1 = ServletRequestUtils.getStringParameter(request, "OWNER_SSN1", "");
			String owner_ssn2 = ServletRequestUtils.getStringParameter(request, "OWNER_SSN2", "");

			if(!owner_ssn1.equals("") && !owner_ssn2.equals(""))
				owner_ssn		= owner_ssn1 + owner_ssn2;
			
			//��� ��ȭ��ȣ
			String owner_tel	= 	"";
			String owner_tel1	=	ServletRequestUtils.getStringParameter(request, "OWNER_TEL1", "");
			String owner_tel2	=	ServletRequestUtils.getStringParameter(request, "OWNER_TEL2", "");
			String owner_tel3	=	ServletRequestUtils.getStringParameter(request, "OWNER_TEL3", "");
			
			if(!owner_tel1.equals("") && !owner_tel2.equals("") && !owner_tel3.equals(""))
				owner_tel		= owner_tel1 + "-" + owner_tel2  + "-" + owner_tel3;
			
			//��� �޴��� ��ȣ
			String owner_hp		=	"";
			String owner_hp1	=	ServletRequestUtils.getStringParameter(request, "OWNER_HP1", "");
			String owner_hp2	=	ServletRequestUtils.getStringParameter(request, "OWNER_HP2", "");
			String owner_hp3	=	ServletRequestUtils.getStringParameter(request, "OWNER_HP3", "");
			
			if(!owner_hp1.equals("") && !owner_hp2.equals("") && !owner_hp3.equals(""))
				owner_hp		= owner_hp1 + "-" + owner_hp2 + "-" + owner_hp3;
	
			//������ �ֹι�ȣ
			String partn_ssn		= "";
			String partn_ssn1 = ServletRequestUtils.getStringParameter(request, "PARTN_SSN1", "");
			String partn_ssn2 = ServletRequestUtils.getStringParameter(request, "PARTN_SSN2", "");
			
			if(!partn_ssn1.equals("") && !partn_ssn2.equals(""))
				partn_ssn		= partn_ssn1 + partn_ssn2;
			
			//������ ��ȭ��ȣ
			String partn_tel		=	"";
			String partn_tel1	=	ServletRequestUtils.getStringParameter(request, "PARTN_TEL1", "");
			String partn_tel2	=	ServletRequestUtils.getStringParameter(request, "PARTN_TEL2", "");
			String partn_tel3	=	ServletRequestUtils.getStringParameter(request, "PARTN_TEL3", "");
			
			if(!partn_tel1.equals("") && !partn_tel2.equals("") && !partn_tel3.equals(""))
				partn_tel		= partn_tel1 + "-" + partn_tel2 + "-" + partn_tel3;
			
			//������ �޴��ȣ
			String partn_hp		=	"";
			String partn_hp1	=	ServletRequestUtils.getStringParameter(request, "PARTN_HP1", "");
			String partn_hp2	=	ServletRequestUtils.getStringParameter(request, "PARTN_HP2", "");
			String partn_hp3	=	ServletRequestUtils.getStringParameter(request, "PARTN_HP3", "");
			
			if(!partn_hp1.equals("") && !partn_hp2.equals("") && !partn_hp3.equals(""))
				partn_hp		= partn_hp1 + "-" + partn_hp2 + "-" + partn_hp3;
			
			//��� ���� OWNER_BONBUN + OWNER_BUBUN
			String owner_jibun	=	"";
			String owner_bonbun	=	ServletRequestUtils.getStringParameter(request, "OWNER_BONBUN", "");
			String owner_bubun	=	ServletRequestUtils.getStringParameter(request, "OWNER_BUBUN", "");
			
			if(!owner_bonbun.equals("") && !owner_bubun.equals(""))
			{
				owner_jibun 	= owner_bonbun + "-" + owner_bubun;
			}
			
			//��� ���� OWNER_BONBUN + OWNER_BUBUN
			String owner_tojibun	=	"";
			String owner_tobonbun	=	ServletRequestUtils.getStringParameter(request, "OWNER_TOBONBUN", "");
			String owner_tobubun	=	ServletRequestUtils.getStringParameter(request, "OWNER_TOBUBUN", "");
			
			if(!owner_tobonbun.equals("") && !owner_tobubun.equals(""))
			{
				owner_tojibun 	= owner_tobonbun + "-" + owner_tobubun;
			}
			
			//������ ���� PARTN_BONBUN + OWNER_BUBUN
			String partn_jibun	=	"";
			String partn_bonbun	=	ServletRequestUtils.getStringParameter(request, "PARTN_BONBUN", "");
			String partn_bubun	=	ServletRequestUtils.getStringParameter(request, "PARTN_BUBUN", "");
			
			if(!partn_bonbun.equals("") && !partn_bubun.equals(""))
			{
				partn_jibun 	= partn_bonbun + "-" + partn_bubun;
			}
			
			//������ ���� OWNER_BONBUN + OWNER_BUBUN
			String partn_tojibun	=	"";
			String partn_tobonbun	=	ServletRequestUtils.getStringParameter(request, "PARTN_TOBONBUN", "");
			String partn_tobubun	=	ServletRequestUtils.getStringParameter(request, "PARTN_TOBUBUN", "");
			
			if(!partn_tobonbun.equals("") && !partn_tobubun.equals(""))
			{
				partn_tojibun 	= partn_tobonbun + "-" + partn_tobubun;
			}
			

			String owner_post = ServletRequestUtils.getStringParameter(request, "OWNER_POST", "");
			String owner_topost = ServletRequestUtils.getStringParameter(request, "OWNER_TOPOST", "");
			String partn_post = ServletRequestUtils.getStringParameter(request, "PARTN_POST", "");
			String partn_topost = ServletRequestUtils.getStringParameter(request, "PARTN_TOPOST", "");

			gapanHeadBean.setGAPAN_NO(GAPAN_NO);
			gapanHeadBean.setOWNER_IDCHK(OWNER_IDCHK);
			gapanHeadBean.setOWNER_SSN(owner_ssn);
			gapanHeadBean.setOWNER_TEL(owner_tel);
			gapanHeadBean.setOWNER_HP(owner_hp);
			gapanHeadBean.setPARTN_SSN(partn_ssn);
			gapanHeadBean.setPARTN_TEL(partn_tel);
			gapanHeadBean.setPARTN_HP(partn_hp);
			gapanHeadBean.setOWNER_JIBUN(owner_jibun);
			gapanHeadBean.setOWNER_TOJIBUN(owner_tojibun);
			gapanHeadBean.setPARTN_JIBUN(partn_jibun);
			gapanHeadBean.setPARTN_TOJIBUN(partn_tojibun);
			gapanHeadBean.setOWNER_POST(util.Post_Cut(owner_post));		//�����ȣ "-" ����.
			gapanHeadBean.setOWNER_TOPOST(util.Post_Cut(owner_topost));	//�����ȣ "-" ����.
			gapanHeadBean.setPARTN_POST(util.Post_Cut(partn_post));		//�����ȣ "-" ����.
			gapanHeadBean.setPARTN_TOPOST(util.Post_Cut(partn_topost));	//�����ȣ "-" ����.
			
			//���� ���� ���� , ����� �������� �̸� �������� 
			//strSavedFileName = uploadImageFiles(request);
//			System.out.println("�̹��� ���ε� ��....");
			//uploadImageFiles(request);
			
			//����� �����̸� set
//			String OWNER_IMG = ServletRequestUtils.getStringParameter(request, "OWNER_IMG", "");
//			String PARTN_IMG = ServletRequestUtils.getStringParameter(request, "PARTN_IMG", "");
//			System.out.println("OWNER_IMG ==>"+OWNER_IMG);
//			System.out.println("PARTN_IMG ==>"+PARTN_IMG);
			//gapanHeadBean.setOWNER_IMG(OWNER_IMG);
			//gapanHeadBean.setPARTN_IMG(PARTN_IMG);
			
			// ���Ͼ��ε� ����
			MultipartHttpServletRequest mpRequest = (MultipartHttpServletRequest) request;
			
			MultipartFile OWNER_IMG = mpRequest.getFile("OWNER_IMG");
			String OWNER_IMG_NAME = ""; //OWNER_IMG.getOriginalFilename();
			
			MultipartFile PARTN_IMG = mpRequest.getFile("PARTN_IMG");
			String PARTN_IMG_NAME = "";
			
			if (OWNER_IMG.getSize() > 0) {
				FileUploadUtil2.uploadFormFile(OWNER_IMG,Globals.IMAGEFILEUPLOADPATH_GAPAN);
				OWNER_IMG_NAME = OWNER_IMG.getOriginalFilename();
				gapanHeadBean.setOWNER_IMG_NAME(OWNER_IMG_NAME);
//				System.out.println("OWNER_IMG_NAME 00 ==> " + gapanHeadBean.getOWNER_IMG_NAME());				
			}
			if (PARTN_IMG.getSize() > 0) {
				FileUploadUtil2.uploadFormFile(PARTN_IMG,Globals.IMAGEFILEUPLOADPATH_GAPAN);
				PARTN_IMG_NAME = PARTN_IMG.getOriginalFilename();
				gapanHeadBean.setPARTN_IMG_NAME(PARTN_IMG_NAME);
//				System.out.println("PARTN_IMG_NAME 00 ==> " + gapanHeadBean.getPARTN_IMG_NAME());
			}
			
//			System.out.println("�̹��� ���ε� ��....");
			
			//GAPAN_HEAD  ���̺� �����Ѵ�.
			boolean result = iGapanService.executeGapan_Head_Register(gapanHeadBean);
		
		}catch(Exception e){
			System.out.println(e.toString());
		}
		return "";
	}
	
	//���� 	�ü� ����/��� ����
	public String Gapan_Info_Register_Execute(HttpServletRequest request,HttpServletResponse response, String GAPAN_NO) throws Exception
	{
		GapanInfoBean gapanInfoBean = new GapanInfoBean();
		
		bind(request, gapanInfoBean);
		
		
		
		
		
		
		System.out.println("Gapan_Info_Register_Execute HJ_CD :: "+ gapanInfoBean.getHJ_CD());
		
		
		// ���� �ð� OPEN_TIME1 + OPEN_TIME2
		String open_time	=	"";
		String open_time1	=	ServletRequestUtils.getStringParameter(request, "OPEN_TIME1", "");
		String open_time2	=	ServletRequestUtils.getStringParameter(request, "OPEN_TIME2", "");
		
		if(!open_time1.equals("") && !open_time2.equals(""))
		{
			open_time 	= open_time1 + open_time2;
		}

		//���� �ð� CLOSE_TIME1 + CLOSE_TIME2
		String close_time	=	"";
		String close_time1	=	ServletRequestUtils.getStringParameter(request, "CLOSE_TIME1", "");
		String close_time2	=	ServletRequestUtils.getStringParameter(request, "CLOSE_TIME2", "");
		
		if(!close_time1.equals("") && !close_time2.equals(""))
		{
			close_time 	= close_time1 + close_time2;
		}
		
		String  found_date = ServletRequestUtils.getStringParameter(request, "FOUND_DATE", "");
		String  permit_date = ServletRequestUtils.getStringParameter(request, "PERMIT_DATE", "");
		String  mul_fromdate = ServletRequestUtils.getStringParameter(request, "MUL_FROMDATE", "");
		String  mul_todate = ServletRequestUtils.getStringParameter(request, "MUL_TODATE", "");
		
		gapanInfoBean.setGAPAN_NO(GAPAN_NO);
		gapanInfoBean.setFOUND_DATE(util.Date_Cut(found_date));		//��ġ����
		gapanInfoBean.setPERMIT_DATE(util.Date_Cut(permit_date));	//�㰡����
		gapanInfoBean.setOPEN_TIME(open_time);						//�����ð�
		gapanInfoBean.setCLOSE_TIME(close_time);					//�����ð�

		//�ӽ�
		if(gapanInfoBean.getGP_TYP().equals("001")){
			gapanInfoBean.setPURPOSE_CD("710");					//��������ڵ�(�����󿵾��ü���)
		}else{
			gapanInfoBean.setPURPOSE_CD("720");					//��������ڵ�(�������Ÿ�ü���)
		}
//		System.out.println("X_COORD ==>"+ServletRequestUtils.getStringParameter(request, "X_COORD", ""));
//		System.out.println("Y_COORD ==>"+ServletRequestUtils.getStringParameter(request, "Y_COORD", ""));
//		System.out.println("WITH_PNU ==>"+ServletRequestUtils.getStringParameter(request, "WITH_PNU", ""));
		gapanInfoBean.setX_COORD(ServletRequestUtils.getStringParameter(request, "X_COORD", ""));			//�����߽���X��ǥ
		gapanInfoBean.setY_COORD(ServletRequestUtils.getStringParameter(request, "Y_COORD", ""));			//�����߽���Y��ǥ
//		gapanInfoBean.setWITH_PNU("1168010100103120074");	//������ ����(PNU)
		
		gapanInfoBean.setTYPE(ServletRequestUtils.getStringParameter(request, "TYPE", "1"));
		gapanInfoBean.setSECTION(ServletRequestUtils.getStringParameter(request, "SECTION", "1"));
//		gapanInfoBean.setOWNER_SET(ServletRequestUtils.getStringParameter(request, "OWNER_SET", ""));
//		gapanInfoBean.setTAX_SET(ServletRequestUtils.getStringParameter(request, "TAX_SET", ""));
		gapanInfoBean.setMUL_FROMDATE(util.Date_Cut(mul_fromdate));
		
		gapanInfoBean.setMUL_TODATE(util.Date_Cut(mul_todate));
		gapanInfoBean.setTAXTATION_AT(ServletRequestUtils.getStringParameter(request, "TAXTATION_AT", "0"));			//�����ΰ�
		
		
		//���Ͼ��ε� ����
		MultipartHttpServletRequest mpRequest = (MultipartHttpServletRequest) request;
		MultipartFile SHOP_IMG = mpRequest.getFile("SHOP_IMG");
		String SHOP_IMG_NAME = "";
		
		if (SHOP_IMG.getSize() > 0) {
			FileUploadUtil2.uploadFormFile(SHOP_IMG,Globals.IMAGEFILEUPLOADPATH_GAPAN);
			SHOP_IMG_NAME = SHOP_IMG.getOriginalFilename();
			gapanInfoBean.setSHOP_IMG_NAME(SHOP_IMG_NAME);
//			System.out.println("SHOP_IMG_NAME 00 ==> " + gapanInfoBean.getSHOP_IMG_NAME());
		}
		
		//	GAPAN_INFO  ���̺� �����Ѵ�.
		boolean result = iGapanService.executeGapan_Info_Register(gapanInfoBean);
		
		return	"";
	}
	
	public void uploadImageFiles(HttpServletRequest request){
//		System.out.println(" ##### ���ε� start ########### ");
		List listBoardFiles	=	new ArrayList();
		
		//���� ���
		MultipartHttpServletRequest mpRequest = (MultipartHttpServletRequest) request;
		Iterator fileNameIterator = mpRequest.getFileNames();
		String strFileName = "";
		
		int i=1;
		
		 while (fileNameIterator.hasNext()) {
			MultipartFile multiFile = mpRequest.getFile((String) fileNameIterator.next());
			
			if (multiFile.getSize() > 0) {
			    strFileName = FileUploadUtil2.uploadFormFile(multiFile,Globals.IMAGEFILEUPLOADPATH_GAPAN);		
//				System.out.println("multiFile ==> " + multiFile);
//				strFileName = FileUploadUtil2.uploadFormFile(multiFile,"C:/roads/filedown/");

			}
//			System.out.println("strFileName==>" + strFileName);
//			System.out.println("i ==> " + i);
			if(i == 1){
				request.setAttribute("OWNER_IMG",strFileName);
			}else if(i == 2){
				request.setAttribute("PARTN_IMG",strFileName);
			}else if(i == 3){
				request.setAttribute("SHOP_IMG",strFileName);
			}
			
			i++;
		}
		
//		 return strFileName;
	}
	
}
