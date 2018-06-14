/***********************************
 * ������ : 2007.9.27
 * ���������� : ������
 * �������� :
 ***********************************/

package main.java.gapan.jumyong.web;


import main.java.common.commonCode.model.UserBean;
import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.util.FileUploadUtil2;
import main.java.common.util.Globals;
import main.java.common.util.catUtil.Util;

import main.java.common.util.FileUtil;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import java.text.SimpleDateFormat;

import java.util.List;

import java.util.Calendar;

import main.java.gapan.gapan.service.IGapanService;
import main.java.gapan.jumyong.service.*;

import main.java.gapan.jumyong.model.GapanBaseBean;
import main.java.gapan.jumyong.model.GapanHeadBean;
import main.java.gapan.jumyong.model.GapanInfoBean;
import main.java.gapan.jumyong.model.SearchBean;
import main.java.gapan.jumyong.model.ProductBean;
import main.java.jumyong.minwon.model.MinwonBean;

public class JumyongBoardControl extends MultiActionController {
	
	private IJumyongService objJumyongService = null;	
	private	CommonCodeService	commonCode		= null;	
	private	Util				util			= new Util();
	
	/* 20150529 gapan register -kny */
	private IGapanService iGapanService = null;
	
	public void setGapan_jumyongService(IJumyongService newObjJumyongService) {
		this.objJumyongService = newObjJumyongService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode) 
	{
		this.commonCode 	= commonCode;
	}

	
	/** 20145029 gapan register -kny */
	public ModelAndView register(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		System.out.println("�����󿵾��ü� �űԵ�� register");
		return new ModelAndView("/gapan/jumyong/register");
	}

	/** 20145029 gapan register -kny */
	public ModelAndView infoRegister(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		System.out.println("�����󿵾��ü� info_register");
		
//		 ???? ????
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");

		try{
			if(userId != null)
			{
		
				//	??????? ?o? ??? ?????��?.
				String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				
				//	???? ??????? ?????��?.
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
				
				request.setAttribute("use_owner_Group", commonCode.executeCommonCode("use_ownerGroup", null, "����"));
				request.setAttribute("taxation_section", commonCode.executeCommonCode("taxation_section", null, "����"));
				request.setAttribute("mul_spc_cd", commonCode.executeCommonCode("MUL_SPC_CD", null, null));
				
				request.setAttribute("SIDO", SIDO_CD);
				request.setAttribute("SIDO_NM", commonCode.executeSiNm(SIDO_CD));
				
				request.setAttribute("GU_CD", commonCode.executeGuCode(null, null));
				//request.setAttribute("bjdong_code", commonCode.executeBJDongCode(SIDO_CD, userBean.getSIGU_CD(), null));
				//request.setAttribute("hjdong_code", commonCode.executeHJDongCode(SIDO_CD, userBean.getSIGU_CD(), null));
				
				request.setAttribute("pt_sel", commonCode.executeGapanCode("PT_SEL", null, "����"));
				request.setAttribute("lc_sel", commonCode.executeGapanCode("LC_SEL", null, "����"));
				request.setAttribute("rt_sel", commonCode.executeGapanCode("RT_SEL", null, "����"));
				//request.setAttribute("gp_typ", commonCode.executeGapanCode("GP_TYP", null, "����"));
				/*2014.07 KNY*/ request.setAttribute("gp_typ", "�����󿵾��ü���");
				

				request.setAttribute("ar_sel", commonCode.executeGapanCode("AR_SEL", null, "����"));
				request.setAttribute("uc_sel", commonCode.executeGapanCode("UC_SEL", null, "����"));
				request.setAttribute("dp_sel", commonCode.executeGapanCode("DP_SEL", null, "����"));
				request.setAttribute("mt_sel", commonCode.executeGapanCode("MT_SEL", null, "����"));
				request.setAttribute("sg_typ", commonCode.executeGapanCode("SG_TYP", null, "����"));
				request.setAttribute("sg_itm", commonCode.executeGapanCode("SG_ITM", null, "����"));
				request.setAttribute("sg_sel", commonCode.executeGapanCode("SG_SEL", null, "����"));
				request.setAttribute("un_typ", commonCode.executeGapanCode("UN_TYP", null, "����"));
			}
			
		} catch(Exception e){
			System.out.println(e.toString());
		}
		
		return new ModelAndView("/gapan/jumyong/tab/info_register");
	}
	
	/** 20145029 gapan register -kny */
	//	�űԵ�� (�ο�, ������, �ü���)
	public ModelAndView	infoRegisterPrc(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		Gapan_Head_Register_Execute(request, response);
		/*
		//GAPAN_BASE ���̺�  ���� �����Ͱ� �ִ��� Ȯ���Ѵ�. (������ �����ϰ� �����ڹ�ȣ�� �����Ѵ�.)
		String	GAPAN_NO	= Gapan_Base_Register_Execute(request, response);
		System.out.println("gapan_no: " + GAPAN_NO + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		if(GAPAN_NO	!=	null)
		{
			//	�ο������� �����Ѵ�.
			//Minwon_Register_Execute(request, response, GAPAN_NO);
			
			//	������ �����͸� �����Ѵ�.
			Gapan_Head_Register_Execute(request, response, GAPAN_NO);
			
			//	�ü��� ������ �����Ѵ�.
			Gapan_Info_Register_Execute(request, response, GAPAN_NO);
		}
		*/
		request.setAttribute("menu_param", "jumyong");
		
		return new ModelAndView("/gapan/jumyong/registerPrc");
	}
	

	//GAPAN_BASE ���
	public String	Gapan_Base_Register_Execute(HttpServletRequest request, HttpServletResponse response, String gu_cd) throws Exception 
	{
		//������ �����͸� �����´�.
		UserBean	userBean	= new UserBean();
		userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
		
		//	���ǿ��� �õ� �ڵ带 �����´�.
		/*
		String	min_ssn1		= "";
		if(!ServletRequestUtils.getStringParameter(request, "min_ssn1", "").equals(""))
			min_ssn1		= ServletRequestUtils.getStringParameter(request, "min_ssn1", "");
		
		String bj_cd = ServletRequestUtils.getStringParameter(request, "BJ_CD", "");
		bj_cd = bj_cd.substring(0,3);
		*/
		//String 	GAPAN_NO 	= Gapan_No_Maker(userBean.getSIGU_CD()+bj_cd);	//GAPAN_NO ����
		String 	GAPAN_NO 	= Gapan_No_Maker(gu_cd + "101");	//GAPAN_NO ����
		//String 	REGDATE 	= ServletRequestUtils.getStringParameter(request, "REQ_DATE_MIN", "");
		
		// ��������
		SimpleDateFormat	formatter 	= new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA);
		Calendar			cal			= Calendar.getInstance();
		String				REGDATE		= formatter.format(cal.getTime());

		String 	MANAGER 	= ServletRequestUtils.getStringParameter(request, "MANAGER_MIN", "");
		String 	CLOSEDATE 	= ServletRequestUtils.getStringParameter(request, "CLOSE_DATE", "");
		String 	GP_TYP 	= ServletRequestUtils.getStringParameter(request, "GP_TYP", "001");
		
		/*System.out.println("GAPAN_NO: " + GAPAN_NO + "@@@@@");
		System.out.println("MANAGER: " + MANAGER + "@@@@@");
		System.out.println("CLOSEDATE: " + CLOSEDATE + "@@@@@");
		System.out.println("REGDATE: " + REGDATE + "@@@@@");
		System.out.println("userBean.getSIGU_CD()+bj_cd: " + userBean.getSIGU_CD()+bj_cd + "@@@@@");
		System.out.println("userBean: " + userBean.getNAME() + "@@@@@");*/
		
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
		objJumyongService.executeGapan_Base_Register(Bean);
		System.out.println("����~");
		return	GAPAN_NO;
	}
	
	//���� 	��� ����/������ ����
	public String Gapan_Head_Register_Execute(HttpServletRequest request,HttpServletResponse response) throws Exception
	{
		String gu_cd = ServletRequestUtils.getStringParameter(request, "GU_CD", "");
		System.out.println("gu_cd: " + gu_cd);
		String	GAPAN_NO	= Gapan_Base_Register_Execute(request, response, gu_cd);
		
		if(GAPAN_NO != null) {
		/* GAPAN_NO, GP_TYP, OWNER_NAME, OWNER_IDCHK, OWNER_SSN, OWNER_GENDER */
			try{
			
				GapanHeadBean gapanHeadBean = new GapanHeadBean();
				GapanInfoBean gapanInfoBean = new GapanInfoBean();
				
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
	
				// 20140602 �߰�
				String SI = ServletRequestUtils.getStringParameter(request, "SI", "");
				String GUN = ServletRequestUtils.getStringParameter(request, "GUN", "");
				String DORO_NM = ServletRequestUtils.getStringParameter(request, "DORO_NM", "");
				String BD_BON = ServletRequestUtils.getStringParameter(request, "BD_BON", "");
				String BD_BU = ServletRequestUtils.getStringParameter(request, "BD_BU", "");
				String BD_NM = ServletRequestUtils.getStringParameter(request, "BD_NM", ""); 
				String BD_DET_NM = ServletRequestUtils.getStringParameter(request, "BD_DET_NM", ""); 
				
				
				String TOSI = ServletRequestUtils.getStringParameter(request, "TOSI", "");
				String TOGUN = ServletRequestUtils.getStringParameter(request, "TOGUN", "");
				String TODORO_NM = ServletRequestUtils.getStringParameter(request, "TODORO_NM", "");
				String TOBD_BON = ServletRequestUtils.getStringParameter(request, "TOBD_BON", "");
				String TOBD_BU = ServletRequestUtils.getStringParameter(request, "TOBD_BU", "");
				String TOBD_NM = ServletRequestUtils.getStringParameter(request, "TOBD_NM", ""); 
				String TOBD_DET_NM = ServletRequestUtils.getStringParameter(request, "TOBD_DET_NM", ""); 
				
				/* 20140727 seoul administrator only */
				String gp_typ = "001";
				String ft_typ = "120";//ServletRequestUtils.getStringParameter(request, "ft_typ", "");
				String purpose_cd = "710";
				String section = "1";
				String with_pnu = "11" + gu_cd + 101 + "00000000000";
				System.out.println("with_pnu: " + with_pnu);
				
				gapanInfoBean.setGAPAN_NO(GAPAN_NO);
				gapanInfoBean.setGP_TYP(gp_typ);
				gapanInfoBean.setFT_TYP(ft_typ);
				gapanInfoBean.setPURPOSE_CD(purpose_cd);
				gapanInfoBean.setSECTION(section);
				gapanInfoBean.setWITH_PNU(with_pnu);
				
				//********** BEGIN_����_20120328
				String DONG = ServletRequestUtils.getStringParameter(request, "EMD_NM", gapanHeadBean.getDONG());
				String TDONG = ServletRequestUtils.getStringParameter(request, "TOEMD_NM", gapanHeadBean.getTDONG());
				gapanHeadBean.setDONG(DONG);
				gapanHeadBean.setTDONG(TDONG);
				
				gapanHeadBean.setGP_TYP(gp_typ);
				gapanHeadBean.setBON(owner_bonbun);
				gapanHeadBean.setBU(owner_bubun);
				gapanHeadBean.setTBON(owner_tobonbun);
				gapanHeadBean.setTBU(owner_tobubun);
				// gapanHeadBean.setSI(SI);
				gapanHeadBean.setSI(TOSI);			
				//********** END_����_20120328
				
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
				
				/*
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
				*/
	//			System.out.println("�̹��� ���ε� ��....");
				
				//GAPAN_HEAD  ���̺� �����Ѵ�.
				//boolean result = iGapanService.executeGapan_Head_Register(gapanHeadBean);
				//boolean result = objJumyongService.executeGapan_Head_Register(gapanHeadBean);
				//System.out.println("����! " + result);
				boolean result = objJumyongService.executeGapan_Head_Register(gapanHeadBean);
				System.out.println("gapanHead: " + result);
				boolean gapan_info_result = objJumyongService.executeGapan_Info_Register_Seoulonly(gapanInfoBean);
				System.out.println("gapanInfo " + gapan_info_result);
			
			}catch(Exception e){
				System.out.println(e.toString());
			}
		}
		return "";
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
		
		System.out.println("���������: " + mul_fromdate);
		System.out.println("���������: " + mul_todate);
		
		/* 2014.06.08 doro_nm -kny*/
		String WITH_DORO_NM = ServletRequestUtils.getStringParameter(request, "WITH_DORO_NM", "");
		String WITH_BD_BON = ServletRequestUtils.getStringParameter(request, "WITH_BD_BON", "");
		String WITH_BD_BU = ServletRequestUtils.getStringParameter(request, "WITH_BD_BU", "");
		
		gapanInfoBean.setWITH_DORO_NM(WITH_DORO_NM);
		gapanInfoBean.setWITH_BD_BON(WITH_BD_BON);
		gapanInfoBean.setWITH_BD_BU(WITH_BD_BU);
		
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
		//boolean result = iGapanService.executeGapan_Info_Register(gapanInfoBean);
		boolean result = objJumyongService.executeGapan_Info_Register(gapanInfoBean);
		System.out.println("�����  " + result);
		return	"";
	}
	
	//	���� ��ȣ ����
	private	String	Gapan_No_Maker(String gapan_num)	//gapan_num�� ���ڵ�+�������ڵ� 
	{
		String	GAPAN_NO	= null;
		
		try
		{
			System.out.println("Gapan_No_Maker1: " + GAPAN_NO);
			//	���� ������ȣ üũ
			//GAPAN_NO	= iGapanService.executeCheck_Gapanno(gapan_num);
			GAPAN_NO = objJumyongService.executeCheck_Gapanno(gapan_num);
		}
		catch(Exception e)
		{
			GAPAN_NO	= null;
			
			System.out.println("�ű԰�����ȣ ����");
		}
		
		System.out.println("Gapan_No_Maker2: " + GAPAN_NO);
		return	GAPAN_NO;
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////////////
// ���� ��ȸ
	//public ModelAndView jumyongList(HttpServletRequest request,HttpServletResponse response) throws Exception {
	public ModelAndView jumyongList(HttpServletRequest request,HttpServletResponse response, String flag) throws Exception {
		
//		 ���� ����
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		SearchBean objSearchBean = null;
			
		try{
			
			logger.fatal("userid = " + (userId == null ? "null" : userId));
			if(userId != null)
			{
				//		���ǿ��� �õ� �ڵ带 �����´�.
				String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				
				//	������ �����͸� �����´�.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
				String message = ServletRequestUtils.getStringParameter(request,"message", "");
				
				objSearchBean = new SearchBean();
				
				
				String type = ServletRequestUtils.getStringParameter(request,"type","1");
				String section = ServletRequestUtils.getStringParameter(request,"section","1");
				String tax_set = ServletRequestUtils.getStringParameter(request,"tax_set","");
				String ft_typ = ServletRequestUtils.getStringParameter(request,"ft_typ","%");
				String bj_cd = ServletRequestUtils.getStringParameter(request,"bj_cd","");
				String jumyongName = ServletRequestUtils.getStringParameter(request,"jumyongName","");
				String bonbun = ServletRequestUtils.getStringParameter(request,"bonbun","");
				String bubun = ServletRequestUtils.getStringParameter(request,"bubun","");
				String numberValue = ServletRequestUtils.getStringParameter(request,"numberValue","");
				//********** BEGIN_KANG_20120423
				String Facility_No = ServletRequestUtils.getStringParameter(request,"FACILITY_NO","");
				//********** END_KANG_20120423
				
				String gu_cd = ServletRequestUtils.getStringParameter(request,"gu_cd",userBean.getSIGU_CD());
								
		
				objSearchBean.setGU_CODE(gu_cd);
				
				//20189-05-25
				if(gu_cd.equals("000"))
					objSearchBean.setGU_CODE("%");
					
					
				objSearchBean.setTYPE(type);
				objSearchBean.setSECTION(section);
				objSearchBean.setTAX_SET(tax_set);
				objSearchBean.setFT_TYP(ft_typ);
				objSearchBean.setBJ_CD(bj_cd);
				objSearchBean.setJUMYONGNAME(jumyongName);
				objSearchBean.setBONBUN(bonbun);
				objSearchBean.setBUBUN(bubun);		
				objSearchBean.setNUMBERVALUE(numberValue);
				//********** BEGIN_KANG_20120423
				objSearchBean.setFacility_No(Facility_No);
				//********** END_KANG_20120423

				
				//���� ��¥ 
				Calendar  cal  =  Calendar.getInstance();		
				SimpleDateFormat  sdf  =  new SimpleDateFormat("yyyy");      // ������ ��� ���� ����
				String  yearVal  =  sdf.format (cal.getTime());      // ���� ��¥ ������ ����
				

				
				request.setAttribute("jumyongName", objSearchBean.getJUMYONGNAME());
				request.setAttribute("numberValue", objSearchBean.getNUMBERVALUE());
				request.setAttribute("type", objSearchBean.getTYPE());
				request.setAttribute("ft_typ", objSearchBean.getFT_TYP());
				request.setAttribute("tax_set", objSearchBean.getTAX_SET());
				request.setAttribute("message", message);
				//********** BEGIN_KANG_20120423
				request.setAttribute("FACILITY_NO", Facility_No);
				//********** END_KANG_20120423
				
				//�Ϲ� �ڵ�.	
				request.setAttribute("use_type", commonCode.executeCommonCode("use_type", objSearchBean.getTYPE(), "����"));
				request.setAttribute("use_section", commonCode.executeCommonCode("occupancy_type", objSearchBean.getSECTION(), "����"));
				request.setAttribute("taxation_section", commonCode.executeCommonCode("taxation_section", objSearchBean.getTAX_SET(), "����"));
				request.setAttribute("bjdong_code", commonCode.CommonBJDongCodeSearch(SIDO_CD, userBean.getSIGU_CD(), objSearchBean.getBJ_CD()));	//	������
				request.setAttribute("gu_code", commonCode.executeGuCdList(userBean.getSIGU_CD(),gu_cd));	//	�ñ���
				request.setAttribute("yearVal", yearVal);	//	�⵵
				
				request.setAttribute("SECTION",objSearchBean.getSECTION());

				//�Ϲ� �ڵ� ��		
				int listCount = objJumyongService.getProductListCount(objSearchBean);
				
				request.setAttribute("listCount", String.valueOf(listCount));
								
				if(objSearchBean.getBJ_CD().equals("00000"))
					objSearchBean.setBJ_CD("%");
		System.out.println(objSearchBean);
			}
		} catch(Exception e){
			System.out.println("::::::::::::::::::::::::::::::ERROR:::::::::::::::::::::::");
			e.printStackTrace();
		}
		//********** BEGIN_KANG_20120423
		//return new ModelAndView("/gapan/jumyong/search","blist1",objJumyongService.retrieveBoardList(objSearchBean));
		if(flag.equals("Excel")){
//			return new  ModelAndView("/gapan/jumyong/excel_search","blist1",objJumyongService.retrieveBoardList(objSearchBean));
			return new ModelAndView("/gapan/jumyong/excel_search", "blist1", objJumyongService.retrieveBoardListExcel(objSearchBean));
		}else{
			return new ModelAndView("/gapan/jumyong/search","blist1",objJumyongService.retrieveBoardList(objSearchBean));			
		}		
		//********** END_KANG_20120423
		
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////
//********** BEGIN_KANG_20120423
/*
	// ������ȸ excel ���Ϸ� ����
public ModelAndView excel_jumyongList(HttpServletRequest request,HttpServletResponse response) throws Exception {
	
//	 ���� ����
	HttpSession session = request.getSession();
	String userId	= (String)session.getAttribute("sessionUserId");
	SearchBean objSearchBean = null;
		
	try{
		if(userId != null)
		{
			//		���ǿ��� �õ� �ڵ带 �����´�.
			String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
			
			//	������ �����͸� �����´�.
			UserBean	userBean	= new UserBean();
			userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
			
			
			
			objSearchBean = new SearchBean();

			

			String type = ServletRequestUtils.getStringParameter(request,"type","1");
			String section = ServletRequestUtils.getStringParameter(request,"section","1");
			String tax_set = ServletRequestUtils.getStringParameter(request,"tax_set","");
			String ft_typ = ServletRequestUtils.getStringParameter(request,"ft_typ","%");
			String bj_cd = ServletRequestUtils.getStringParameter(request,"bj_cd","");
			String jumyongName = ServletRequestUtils.getStringParameter(request,"jumyongName","");
			String bonbun = ServletRequestUtils.getStringParameter(request,"bonbun","");
			String bubun = ServletRequestUtils.getStringParameter(request,"bubun","");
			String numberValue = ServletRequestUtils.getStringParameter(request,"numberValue","");
			String gu_cd = ServletRequestUtils.getStringParameter(request,"gu_cd",userBean.getSIGU_CD());
			
			objSearchBean.setGU_CODE(gu_cd);
			objSearchBean.setTYPE(type);
			objSearchBean.setSECTION(section);
			objSearchBean.setTAX_SET(tax_set);
			objSearchBean.setFT_TYP(ft_typ);
			objSearchBean.setBJ_CD(bj_cd);
			objSearchBean.setJUMYONGNAME(jumyongName);
			objSearchBean.setBONBUN(bonbun);
			objSearchBean.setBUBUN(bubun);		
			objSearchBean.setNUMBERVALUE(numberValue);
			
			//���� ��¥ 
			Calendar  cal  =  Calendar.getInstance();		
			SimpleDateFormat  sdf  =  new SimpleDateFormat("yyyy");      // ������ ��� ���� ����
			String  yearVal  =  sdf.format (cal.getTime());      // ���� ��¥ ������ ����
			

			
			request.setAttribute("jumyongName", objSearchBean.getJUMYONGNAME());
			request.setAttribute("numberValue", objSearchBean.getNUMBERVALUE());
			request.setAttribute("type", objSearchBean.getTYPE());
			request.setAttribute("ft_typ", objSearchBean.getFT_TYP());
			request.setAttribute("tax_set", objSearchBean.getTAX_SET());
			
			//�Ϲ� �ڵ�.	
			request.setAttribute("use_type", commonCode.executeCommonCode("use_type", objSearchBean.getTYPE(), "����"));
			request.setAttribute("use_section", commonCode.executeCommonCode("occupancy_type", objSearchBean.getSECTION(), "����"));
			request.setAttribute("taxation_section", commonCode.executeCommonCode("taxation_section", objSearchBean.getTAX_SET(), "����"));
			request.setAttribute("gu_code", commonCode.executeGuCdList(userBean.getSIGU_CD(),gu_cd));	//	�ñ���
			request.setAttribute("bjdong_code", commonCode.CommonBJDongCodeSearch(SIDO_CD, userBean.getSIGU_CD(), objSearchBean.getBJ_CD()));	//	������
			request.setAttribute("yearVal", yearVal);	//	�⵵
			
			request.setAttribute("SECTION",objSearchBean.getSECTION());
			
			//�Ϲ� �ڵ� ��		
			int listCount = objJumyongService.getProductListCount(objSearchBean);
			
			request.setAttribute("listCount", String.valueOf(listCount));
							
			if(objSearchBean.getBJ_CD().equals("00000"))
				objSearchBean.setBJ_CD("%");
	System.out.println(objSearchBean);
		}
	} catch(Exception e){
		System.out.println("::::::::::::::::::::::::::::::ERROR:::::::::::::::::::::::");
		e.printStackTrace();
	}
	
		return new ModelAndView("/gapan/jumyong/excel_search","blist1",	objJumyongService.retrieveBoardList(objSearchBean));
	}	
*/
	// ������ȸ excel ���Ϸ� ����
	public ModelAndView excel_jumyongList(HttpServletRequest request,HttpServletResponse response) throws Exception {
			return jumyongList(request,response,"Excel");
			//return new ModelAndView("/gapan/jumyong/excel_search","blist1",	objJumyongService.retrieveBoardList(objSearchBean));
		}	
		

//********** END_KANG_20120423
	
	//product�� ajax�� rate ����.
	public ModelAndView getRate(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String addsum = ServletRequestUtils.getStringParameter(request,"addsum");
		
		 
		
		response.setCharacterEncoding("UTF-8");
		
		
		
		try
		{	//���� ���� ���ϱ�
			System.out.println("1111");
			if(!addsum.equals("NaN"))
			{
				int numAddsum = Integer.parseInt(addsum);
				
				if(numAddsum > 500 && numAddsum%2 == 1) 
				{
					numAddsum = numAddsum-1;
					addsum = String.valueOf(numAddsum);
				}
				String result = objJumyongService.getProductRate(addsum);
				response.getWriter().write(String.valueOf(result));
				
				System.out.println("222");
			}else
				response.getWriter().write("1");
				
		}catch(Exception err)
		{
			System.out.println(err.toString());
		}        
        return null;
	}
	
//	product�� ajax�� ���㼼 ����.
	public ModelAndView getLicenseTax(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		String area = ServletRequestUtils.getStringParameter(request,"area");
		System.out.println("���㼼=");
		response.setCharacterEncoding("UTF-8");
		
		try
		{	
			if(!area.equals("NaN"))
			{
				int result = objJumyongService.getLicenseTax( Float.valueOf(area).floatValue());
				
				System.out.println("���㼼="+result);
				response.getWriter().write(String.valueOf(result));
			}
		}catch(Exception err)
		{
			System.out.println(err.toString());
		}
        return null;
	}
	
	
	public ModelAndView deleteLocation(HttpServletRequest request,
			HttpServletResponse response) throws Exception {	
		// delete

		String seq = ServletRequestUtils.getStringParameter(request,"seq");
		String adminNo = ServletRequestUtils.getStringParameter(request,"no");
		String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
		
		try
		{
			System.out.println("seq="+seq);
			objJumyongService.deleteLocation(Integer.parseInt(seq));
		}catch(Exception err)
		{
			System.out.println("err="+err.toString());
		}
		
		//return new ModelAndView("redirect:/jumyong/placeLocationEdit.do?no="+adminNo+"&currentPage="+strCurrentPage);
		return new ModelAndView("redirect:/jumyong/placeLocationEdit.do?no="+adminNo);
	}
	
	

	public ModelAndView deleteFile(HttpServletRequest request,
			HttpServletResponse response) throws Exception {	
		// delete

		String seq = ServletRequestUtils.getStringParameter(request,"seq");
		String adminNo = ServletRequestUtils.getStringParameter(request,"no");
		String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
		String strFileNm = ServletRequestUtils.getStringParameter(request,"filename");
		
		FileUtil.delete(Globals.IMAGEFILEUPLOADPATH_GAPAN+strFileNm);
		
		
		
		try
		{
			System.out.println("seq="+seq);
			//objJumyongService.deleteFile(Integer.parseInt(seq));
		}catch(Exception err)
		{
			System.out.println("err="+err.toString());
		}
		
		//return new ModelAndView("redirect:/jumyong/placeFileEdit.do?no="+adminNo+"&currentPage="+strCurrentPage);
		return new ModelAndView("redirect:/jumyong/placeFileEdit.do?no="+adminNo);
		
		
		
		
		
	}
	
	public ModelAndView View(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		// ���� ����
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		String 	GAPAN_NO 	= "";
		
		try{
			if(userId != null)
			{		
		
				GAPAN_NO 	= ServletRequestUtils.getStringParameter(request, "GAPAN_NO", "");
				String type = ServletRequestUtils.getStringParameter(request,"type","0");
				String ft_typ = ServletRequestUtils.getStringParameter(request,"ft_typ","%");
				String tax_set = ServletRequestUtils.getStringParameter(request,"tax_set","0");
				String bj_cd = ServletRequestUtils.getStringParameter(request,"bj_cd","");
				String bonbun = ServletRequestUtils.getStringParameter(request,"bonbun","");
				String bubun = ServletRequestUtils.getStringParameter(request,"bubun","");
				String jumyongName = ServletRequestUtils.getStringParameter(request,"jumyongName","");
				String numberValue = ServletRequestUtils.getStringParameter(request,"numberValue","");
				String cal_mode =  ServletRequestUtils.getStringParameter(request,"CAL_MODE","cal1");
				
				String section = ((Map)objJumyongService.getSection(GAPAN_NO)).get("SECTION").toString();
				
					
				request.setAttribute("userId", userId);
				request.setAttribute("use_type", type);
				request.setAttribute("use_section", section);		
				request.setAttribute("taxation_section",tax_set);
				request.setAttribute("bjdong_code", bj_cd);
				request.setAttribute("bonbun", bonbun);
				request.setAttribute("bubun", bubun);		
				request.setAttribute("jumyongName", jumyongName);
				request.setAttribute("numberValue", numberValue);
				request.setAttribute("CAL_MODE", cal_mode);
				
				
				//			���� ��¥ , 7���� ��¥ ���ϱ�
				Calendar cal = Calendar.getInstance();
				
				SimpleDateFormat  sdf  =  new SimpleDateFormat("yyyyMMdd");      // ������ ��� ���� ����
				String thisYear = (sdf.format (cal.getTime())).substring(0,4);      // ���� ��¥ ������ ����
				
				
				String showLicense = "false";
				if(objJumyongService.getLicenseYnCount(GAPAN_NO,thisYear)>0)		//  �⵵�� ������ �������� �Ǵ� �������� ����
					showLicense = "true";
				
		
				String showExamination = "false";
				
				int productCount = objJumyongService.getProductYnCount(GAPAN_NO,thisYear);	//���⵵ ���� ī��Ʈ 
				
				if(productCount>0)
				{
					if(section.equals("3"))
					{
						request.setAttribute("showMudanExamination", "true");
					}else{
						showExamination = "true";
					}
				}
				
				request.setAttribute("showLicense", showLicense);
				request.setAttribute("showExamination", showExamination);
		
			}
		}catch(Exception e){
			System.out.println("error:"+e.toString());
		}
		
		return new ModelAndView("/gapan/jumyong/view", "GAPAN_NO",GAPAN_NO);
	}
	
	//��� �� �κ�
	//�ο�����
	
	// ���Һ� ���� ���� ����Ʈ
	public ModelAndView 	productSubList(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		
		// ���� ����
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");

		try{
			if(userId != null)
			{
				String 	ADMIN_NO 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
				String area = ServletRequestUtils.getStringParameter(request, "area", ""); 
				String year = ServletRequestUtils.getStringParameter(request, "year", "");
				
				year =  String.valueOf(Integer.parseInt(year)-1);
				
				request.setAttribute("ADMIN_NO",ADMIN_NO);
				request.setAttribute("area",area);
				
				
				//List list1 =objJumyongService.productSubList(ADMIN_NO);
				List list1 =objJumyongService.productSubList(ADMIN_NO,year);
				request.setAttribute("productList",list1);
			}
		} catch(Exception e){
			System.out.println(e.toString());
		}
	
		return new ModelAndView("/jumyong/jumyong/info_productsublist" );
	}


	
//	 ����� ���� ���� ����Ʈ
	public ModelAndView 	productaddList(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		
//		 ���� ����
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");

		try{
			if(userId != null)
			{
				String 	ADMIN_NO 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
				String area = ServletRequestUtils.getStringParameter(request, "area", ""); 
				String year = ServletRequestUtils.getStringParameter(request, "year", "");
				
				request.setAttribute("ADMIN_NO",ADMIN_NO);
				request.setAttribute("area",area);
				
				List list1 =objJumyongService.productSubList(ADMIN_NO,year);
				request.setAttribute("productList",list1);
			}
		} catch(Exception e){
			System.out.println(e.toString());
		}
	
		return new ModelAndView("/jumyong/jumyong/info_productaddlist" );
	}
	
//	�⵵�� first_seq�� ajax�� seq ����.
	public ModelAndView getSeqByFirstSeq(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String year = ServletRequestUtils.getStringParameter(request,"year","");
		String first_seq = ServletRequestUtils.getStringParameter(request,"first_seq","");
		
		String seq = String.valueOf(objJumyongService.getCalSeqbyFirstSeq(year,first_seq));
		
		System.out.println("seq==========="+seq);
		
		response.getWriter().write(seq);
		
        return null;
	}	
	
//	 ����� ���� ���� ����Ʈ?
// �������� ��ȸ�� �������µ�...  	
	public ModelAndView 	getPrice(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		
//		 ���� ����
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");

		try{
			if(userId != null)
			{
				String 	admin_no 	= ServletRequestUtils.getStringParameter(request, "GAPAN_NO", "");
				String gp_typ = ServletRequestUtils.getStringParameter(request, "gp_typ", "");
				String year = ServletRequestUtils.getStringParameter(request, "year", "");
						
				System.out.println(admin_no);
				System.out.println(gp_typ);	
				System.out.println(year);											
				
				//���� ��¥ 
				Calendar  cal2  =  Calendar.getInstance();		
				SimpleDateFormat  sdf  =  new SimpleDateFormat("yyyy");      // ������ ��� ���� ����
				String  toDate  =  sdf.format (cal2.getTime());      // ���� ��¥ ������ ����
				System.out.println("�������� ��ȸ~!!!");
				try
				{
					Map a = objJumyongService.get_Price(admin_no);
					request.setAttribute("gp_typ",gp_typ);
					request.setAttribute("year",year);
					
					if(a.size() > 0)
					{
					
					request.setAttribute("SI_NM",a.get("SI_NM")+"��");
					request.setAttribute("GU_NM",a.get("GU_NM"));
					request.setAttribute("BJ_NM",a.get("BJ_NM"));
					if(a.get("BUBUN").equals("") || a.get("BUBUN")==null){
						request.setAttribute("BUNJI",a.get("BONBUN"));
					}else{
						request.setAttribute("BUNJI",a.get("BONBUN")+"-"+a.get("BUBUN"));
					}			
						int i = Integer.parseInt(a.get("DB_CRE_MON").toString().substring(0,4)) - Integer.parseInt(year);
						String giga = "";
						
						if(i == 0 || i < 0)
							giga = a.get("JIGA").toString();
						else if(i == 1)
							giga = a.get("JIGA_PY").toString();
						else if(i == 2)
							giga = a.get("JIGA_2PY").toString();
						else if(i == 3)
							giga = a.get("JIGA_3PY").toString();
						else if(i == 4)
							giga = a.get("JIGA_4PY").toString();
						
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
		} catch(Exception e){
			System.out.println(e.toString());
		}
		
		return new ModelAndView("/gapan/jumyong/officialLandPrice" );
	}
	
	

//	 ����� ���� ���� ����Ʈ
	public ModelAndView 	inspectDel(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		
		String 	admin_no 	= ServletRequestUtils.getStringParameter(request, "admin_no", "");
		String seq = ServletRequestUtils.getStringParameter(request, "seq", "");
		
		try
		{
			objJumyongService.Delete_Inspect(Integer.parseInt(seq));
		}catch(Exception err)
		{	
		}

		return new ModelAndView("redirect:/jumyong/inspectEdit.do?no="+admin_no);
		
	}
	
	


//	 ����� ���� ���� ����Ʈ
	public ModelAndView 	confDel(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		
		String 	admin_no 	= ServletRequestUtils.getStringParameter(request, "admin_no", "");
		String seq = ServletRequestUtils.getStringParameter(request, "seq", "");
		
		try
		{
			objJumyongService.Delete_Conf(Integer.parseInt(seq));
		}catch(Exception err)
		{	
		}

		return new ModelAndView("redirect:/jumyong/confEdit.do?no="+admin_no);
		
	}
	
	//	 ���� �߱� 
	public ModelAndView 	publishDoc(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		// ���� ����
			HttpSession session = request.getSession();
			String userId	= (String)session.getAttribute("sessionUserId");
			
			
		String 	GAPAN_NO 	= ServletRequestUtils.getStringParameter(request, "GAPAN_NO", "");
		
		request.setAttribute("GAPAN_NO", GAPAN_NO);
		request.setAttribute("GP_TYP", "001");
		request.setAttribute("USER_ID", userId);
		System.out.println(objJumyongService.get_DocInfo(GAPAN_NO).get("SF_VALUE"));
		request.setAttribute("SF_VALUE", objJumyongService.get_DocInfo(GAPAN_NO).get("SF_VALUE").toString());
		
		return new ModelAndView("/gapan/jumyong/publish_doc" );
	}
	
	
////////////////////////////////////////////////////////////////////////////////////////////////////
	// �ϰ������ ����
	public ModelAndView batch_cal1(HttpServletRequest request,HttpServletResponse response) throws Exception {

		//���� ����
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		SearchBean objSearchBean = null;
		try{
			if(userId != null)
			{
				//		���ǿ��� �õ� �ڵ带 �����´�.
				String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				
				//	������ �����͸� �����´�.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
				String YEAR = ServletRequestUtils.getStringParameter(request,"YEAR1","");
			    String[] ITEM_CHECK_ARR = request.getParameterValues("ITEM_CHECK");
	            String[] GAPAN_NO_ARR = request.getParameterValues("GAPAN_NO");
	            String CAL_MODE = ServletRequestUtils.getStringParameter(request,"CAL_MODE","");
	            String TAX_SET = ServletRequestUtils.getStringParameter(request,"TAX_SET","");
	            
	            int listCount = 0;
	            System.out.println("-------(20100511)-----");
	            System.out.println("CAL_MODE : "+CAL_MODE);
	            
	            ArrayList productList = new ArrayList();
	       
	            for(int i = 0 ; i < ITEM_CHECK_ARR.length ; i++){
	            	if(ITEM_CHECK_ARR[i].equals("true")){
	            		ProductBean product = (ProductBean)objJumyongService.getBatchCalculationProductList(GAPAN_NO_ARR[i],YEAR);
	            		listCount++;

	            		productList.add(product);
	            	}
	            }
	            
				request.setAttribute("taxation_part", commonCode.executeCommonCode("taxation_part", null, "����"));//	��������
				request.setAttribute("taxcode", commonCode.executeTaxCode(TAX_SET, null, "����"));//	�����ڵ�
				request.setAttribute("taxpayer_residence", commonCode.executeCommonCode("taxpayer_residence", null, "����"));//	���ֻ���
				request.setAttribute("object_type", commonCode.executeCommonCode("object_type", null, "����"));//	���Ǳ���
				request.setAttribute("taxpayer_group", commonCode.executeCommonCode("taxpayer_group", null, "����"));//	������ ����
				request.setAttribute("TAX_SET", TAX_SET);	//���Ա���
				
				//���� �⵵
				SimpleDateFormat	formatter 	= new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA );
				Calendar 			cal 		= Calendar.getInstance();
				String	today		= formatter.format(cal.getTime());
				
				if(userBean	!= null)
				{
					request.setAttribute("ORG_CD", userBean.getORG_CD());
					request.setAttribute("GU_NM", userBean.getGU_NM());
					request.setAttribute("DEPT_CD", userBean.getDEPT_CD());
					request.setAttribute("DEPT_NM", userBean.getDEPT_NM());
					request.setAttribute("TAX_DATE", today);
				}
	        
	            
	            
	            request.setAttribute("YEAR", YEAR);
	            
	            request.setAttribute("FROMDATE", YEAR+"-01-01");
	            request.setAttribute("TODATE", YEAR+"-12-31");
	            request.setAttribute("PERIOD", "12");
	            
	            request.setAttribute("productList", productList);
	            request.setAttribute("listCount", String.valueOf(listCount));
	            request.setAttribute("CAL_MODE", CAL_MODE);
	            
	            
	            
			}
		} catch(Exception e){
			System.out.println("Batch cal ERROR");
			e.printStackTrace();
		}
		
		return new ModelAndView("/gapan/jumyong/batch_Cal1");
	}

	/////////////////////////////////////////////////////////////////////////////////////////////////////////

	// �ϰ��������� ����
	public ModelAndView batch_cal1_prc(HttpServletRequest request,HttpServletResponse response) throws Exception {

		  // ���� ����
	    HttpSession session = request.getSession();
	    String userId = (String) session.getAttribute("sessionUserId");
	    String param = "";
	    String result_message = "";
	    int failCnt = 0;
	    int okCnt = 0;
	    String failNo = "";

	    try {
	        if (userId != null) {
	            // ������ �����͸� �����´�.
	            UserBean userBean = new UserBean();
	            userBean = commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));

	            // ���⵵ ���
	            Calendar cal = Calendar.getInstance();
	            SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
	            String thisDate = formatter.format(cal.getTime());
	            String thisYear = thisDate.substring(0, 4);

	            // ��� ���� param start
	            String YEAR = ServletRequestUtils.getStringParameter(request,"YEAR", "");
	            String FROMDATE = ServletRequestUtils.getStringParameter(request, "FROMDATE", "");
	            String TODATE = ServletRequestUtils.getStringParameter(request,"TODATE", "");
	            String PERIOD = ServletRequestUtils.getStringParameter(request,"PERIOD", "");
	            
	            String TAX_GUBUN = ServletRequestUtils.getStringParameter(request,"TAX_GUBUN", "");
	            String ADD_SET = ServletRequestUtils.getStringParameter(request,"ADD_SET", "");
	            
	            String ADD_YN = ServletRequestUtils.getStringParameter(request,"ADD_YN", "");
	            String SUBUSEO_CD = ServletRequestUtils.getStringParameter(request,"SUBUSEO_CD", "");
	            String gasanRate = ServletRequestUtils.getStringParameter(request,"gasanRate", "");
	            String OCR_BUSEO_CD = ServletRequestUtils.getStringParameter(request,"OCR_BUSEO_CD", "");
	            String OCR_SIGU_CD = ServletRequestUtils.getStringParameter(request,"OCR_SIGU_CD", "");
	            
	            String TAX_DATE = ServletRequestUtils.getStringParameter(request,"TAX_DATE", "");
	            String INDATE = ServletRequestUtils.getStringParameter(request,"INDATE", "");
	            String OVERDATE = ServletRequestUtils.getStringParameter(request,"OVERDATE", "");
	            
	            String OBJ_SET = ServletRequestUtils.getStringParameter(request,"OBJ_SET", "");
	            String TAXPAYER_SET = ServletRequestUtils.getStringParameter(request,"TAXPAYER_SET", "");
	            String LIVE = ServletRequestUtils.getStringParameter(request,"LIVE", "");
	            String TAX_CD = ServletRequestUtils.getStringParameter(request,"TAX_CD", "");
	            String CAL_MODE = ServletRequestUtils.getStringParameter(request,"CAL_MODE", "");

	            // ����Ʈ ��� - �迭 param start
	            String[] GAPAN_NO_ARR = request.getParameterValues("GAPAN_NO");
	            
	            String[] PRICE_ARR = request.getParameterValues("PRICE");
	            String[] RATE_ARR = request.getParameterValues("RATE");
	            String[] AREA_AFTER_ARR = request.getParameterValues("AREA_AFTER");
	            String[] SUM_LASTYEAR_ARR = request.getParameterValues("SUM_LASTYEAR");
	            String[] SUM_YEAR_ARR = request.getParameterValues("SUM_YEAR");
	            String[] FORM_ARR = request.getParameterValues("FORM");
	            
	            String[] ADJUSTMENT_ARR = request.getParameterValues("ADJUSTMENT");
	            String[] SUM_ADJUST_ARR = request.getParameterValues("SUM_ADJUST");
	            String[] VAT_ARR = request.getParameterValues("VAT");
	            String[] OVERTAX_ARR = request.getParameterValues("OVERTAX");
	            String[] FORM_ADJUST_ARR = request.getParameterValues("FORM_ADJUST");
	            
	            String[] REDUCTION_RATE_ARR = request.getParameterValues("REDUCTION_RATE");
	            String[] REDUCTION_REASON_ARR = request.getParameterValues("REDUCTION_REASON");
	            int exist = 0;
	            System.out.println("CAL_MODE : "+CAL_MODE);
	            
	            if(CAL_MODE.equals("cal1")){
	            	CAL_MODE = "1";
	            }else if(CAL_MODE.equals("cal2")){
	            	CAL_MODE = "2";
	            }else if(CAL_MODE.equals("cal3")){
	            	CAL_MODE = "3";
	            }else if(CAL_MODE.equals("cal4")){
	            	CAL_MODE = "4";
	            }
	            System.out.println("cal_mode : "+CAL_MODE);

//	            System.out.println("ADMIN_NO_ARR.length == " + ADMIN_NO_ARR.length);
	            if (GAPAN_NO_ARR != null && !"".equals(GAPAN_NO_ARR)) {
	                for (int i = 0; i < GAPAN_NO_ARR.length; i++) {
	                    ProductBean objProductBean = new ProductBean();
	                        int cal_sum_seq = 0;
	                        int calculation_seq = 0;
//	                        System.out.println("�ش翬�� ����� �� �ߺ�����***** " + objJunggiService.cal_sum_exist(ADMIN_NO_ARR[i], YEAR));
	                       
	             
	                      //20100512 ����
	        				List leep = objJumyongService.getCalculationDate(GAPAN_NO_ARR[i], CAL_MODE);
	        				int from = 0;
	        				int to = 0;
	        				
	        				for(int k =0; k<leep.size();k++){
	        					ProductBean bb = (ProductBean)leep.get(k);

	        					from = Integer.parseInt(removeDash(FROMDATE));
	        					to = Integer.parseInt(removeDash(TODATE));
	        					
	        					if(Integer.parseInt(bb.getFROMDATE())<=from && Integer.parseInt(bb.getTODATE())>=from){
	        						
	        						exist = 1;
	        					
	        						
	        					}else if(Integer.parseInt(bb.getFROMDATE())<=to && Integer.parseInt(bb.getTODATE())>=to){
	        						
	        					   exist = 1;
	        					}
	        					
	        					
	        				
	        				}
	        				
	        				//20100512 ��
	        				System.out.println("---(100513)---");

	    					System.out.println("getfromdate : "+FROMDATE);
	    					System.out.println("gettodate : "+TODATE);
	    					System.out.println("TAX_CD : "+TAX_CD);
	        					
	        					
	                        if (objJumyongService.cal_sum_exist(GAPAN_NO_ARR[i],YEAR,CAL_MODE) < 1 || exist == 0) {
	                        	
	                        	// cal_sum_seq ���� ���� ��������
	                            cal_sum_seq = objJumyongService.getCal_Sum_Seq();
	                            

	                            // System.out.println("************* ���밪 ���� start ****************");
	                            // 1.2.3 ���밪 ����
	                            objProductBean.setCAL_MODE(CAL_MODE);
	                            objProductBean.setYEAR(YEAR);
	                            objProductBean.setFROMDATE(util.Date_Cut(FROMDATE));
	                            objProductBean.setTODATE(util.Date_Cut(TODATE));
	                            objProductBean.setPERIOD(PERIOD);
	                            
	                            objProductBean.setGAPAN_NO(GAPAN_NO_ARR[i]);
	                            objProductBean.setADMIN_NO(GAPAN_NO_ARR[i]);

	                            if (PRICE_ARR[i] != null && !"".equals(PRICE_ARR[i])){
	                            	objProductBean.setPRICE(util.nullTo(PRICE_ARR[i],"0"));
	                            }
	                            if (AREA_AFTER_ARR[i] != null && !"".equals(AREA_AFTER_ARR[i])) {
	                                objProductBean.setAREA_AFTER(util.nullTo(AREA_AFTER_ARR[i], "0"));
	                            }
	                            if (RATE_ARR[i] != null && !"".equals(RATE_ARR[i])){
	                                objProductBean.setRATE((util.nullTo(RATE_ARR[i], "0")));
	                            }
	                            if (SUM_LASTYEAR_ARR[i] != null && !"".equals(SUM_LASTYEAR_ARR[i])) {
	                                objProductBean.setSUM_LASTYEAR(util.nullTo(SUM_LASTYEAR_ARR[i], "0"));
	                            }
	                            
	                            if (SUM_YEAR_ARR[i] != null && !"".equals(SUM_YEAR_ARR[i])) {
	                                objProductBean.setSUM_YEAR(util.nullTo(SUM_YEAR_ARR[i], "0"));
	                            }
	                            if (FORM_ARR[i] != null && !"".equals(FORM_ARR[i])) {
	                                objProductBean.setFORM(util.nullTo(FORM_ARR[i], ""));
	                            }
	                            if (ADJUSTMENT_ARR[i] != null && !"".equals(ADJUSTMENT_ARR[i])) {
	                                objProductBean.setADJUSTMENT((util.nullTo(ADJUSTMENT_ARR[i],"1")));
	                            }
	                            if (SUM_ADJUST_ARR[i] != null && !"".equals(SUM_ADJUST_ARR[i])) {
	                                objProductBean.setSUM_ADJUST(util.nullTo(SUM_ADJUST_ARR[i], "0"));
	                            }
	                            if (SUM_ADJUST_ARR[i] != null && !"".equals(SUM_ADJUST_ARR[i])) {
	                                objProductBean.setSUM(util.nullTo(SUM_ADJUST_ARR[i], "0"));
	                            }
	                            if (VAT_ARR[i] != null && !"".equals(VAT_ARR[i])) {
	                                objProductBean.setVAT(util.nullTo(VAT_ARR[i], "0"));
	                            }
	                            if (FORM_ADJUST_ARR[i] != null && !"".equals(FORM_ADJUST_ARR[i])) {
	                                objProductBean.setFORM_ADJUST(util.nullTo(FORM_ADJUST_ARR[i], ""));
	                            }

	                            if (REDUCTION_RATE_ARR[i] != null && !"".equals(REDUCTION_RATE_ARR[i])) {
	                                objProductBean.setREDUCTION_RATE((util.nullTo(REDUCTION_RATE_ARR[i],"0")));
	                            }
	                            if (REDUCTION_REASON_ARR[i] != null && !"".equals(REDUCTION_REASON_ARR[i])) {
	                                objProductBean.setREDUCTION_REASON(util.nullTo(REDUCTION_REASON_ARR[i],""));
	                            }
	                            if(SUM_LASTYEAR_ARR[i] != null && !"".equals(SUM_LASTYEAR_ARR[i])){
	                            	objProductBean.setUSE_SECTION("1");
	                            }else{
	                            	objProductBean.setUSE_SECTION("2");
	                            }
	                            
	                            // System.out.println("************* ���밪 ���� end ***************");
	                            // ******************************************************************//
	                            // 1.CALCULATION �� �Է�
	                            objProductBean.setCAL_SUM_SEQ(String.valueOf(cal_sum_seq));
	                            objProductBean.setPREV_SEQ("2"); // PREV_SEQ
	                            objProductBean.setFIRST_SEQ(""); // FIRST_SEQ ���
	                            objProductBean.setUP_DATE(thisDate);
	                            
	                            objJumyongService.insertProduct(objProductBean);
	                             System.out.println("********* calculation_info �Է� end ************");
	                            // ******************************************************************//

	                            // *************************************************************//
	                            // 2. cal_sum_info �� �Է�
	                            objProductBean.setSEQ(String.valueOf(cal_sum_seq));
	                            objProductBean.setTAX_SEQ(String.valueOf(cal_sum_seq));
	                            objJumyongService.Cal_Sum_InfoInsert(objProductBean);
	                            System.out.println("********* cal_sum_info �Է� end ************");
	                            // *************************************************************//
	                         
	                            
	                            //�Ʒ��� 4���� �׸� �ܿ� �͵��� �ñ��� ��� ���� ��� �ü��� ����.
	            				//���� ���� ¡���ý��ۿ��� �׷��� �϶�� ��(20100512)
	            			//	System.out.println("�ñ��� ���� : "+objProductBean.getTAX_CD().substring(0,1));
	            			//	String a = objProductBean.getTAX_CD().substring(0,1);  ����

	            					if(TAX_CD.equals("10212807")){						
	            						long sum = Math.round(Long.parseLong(objProductBean.getSUM_ADJUST())/2);
	            						String sumTemp = Long.toString(sum);
	            						long partOne = Long.valueOf(sumTemp.substring(sumTemp.length()-1,sumTemp.length())).longValue();
	            						
	            						objProductBean.setBONSE(objProductBean.getSUM_ADJUST());
	            						objProductBean.setSISE(Long.toString(sum+partOne));
	            						objProductBean.setGUSE(Long.toString(sum-partOne));
	            						
	            					}else if(TAX_CD.equals("10212808")){
	            						long sum = Math.round(Long.parseLong(objProductBean.getSUM_ADJUST())/2);
	            						String sumTemp = Long.toString(sum);
	            						long partOne = Long.valueOf(sumTemp.substring(sumTemp.length()-1,sumTemp.length())).longValue();
	            						
	            						objProductBean.setBONSE(objProductBean.getSUM_ADJUST());
	            						objProductBean.setSISE(Long.toString(sum+partOne));
	            						objProductBean.setGUSE(Long.toString(sum-partOne));
	            						
	            					}else if(TAX_CD.equals("10211201")){
	            						
	            						long sum = Math.round(Long.parseLong(objProductBean.getSUM_ADJUST())/2);
	            						String sumTemp = Long.toString(sum);
	            						long partOne = Long.valueOf(sumTemp.substring(sumTemp.length()-1,sumTemp.length())).longValue();
	            						
	            						objProductBean.setBONSE(objProductBean.getSUM_ADJUST());
	            						objProductBean.setSISE(Long.toString(sum+partOne));
	            						objProductBean.setGUSE(Long.toString(sum-partOne));
	            						
	            					}else if(TAX_CD.equals("10228202")){
	            						long sise = Math.round(Long.parseLong(objProductBean.getSUM_ADJUST())*60/100);
	            						long guse = Math.round(Long.parseLong(objProductBean.getSUM_ADJUST())*40/100);
	            						
	            						String sumTemp = Long.toString(guse);
	            						long partOne = Long.valueOf(sumTemp.substring(sumTemp.length()-1,sumTemp.length())).longValue();
	            							            						
	            						objProductBean.setBONSE(objProductBean.getSUM_ADJUST());
	            						objProductBean.setSISE(Long.toString(sise+partOne));
	            						objProductBean.setGUSE(Long.toString(guse-partOne));
	            					}else{
	            						objProductBean.setBONSE(objProductBean.getSUM_ADJUST());
	            						objProductBean.setSISE(objProductBean.getSUM_ADJUST());
	            						objProductBean.setGUSE("0");
	            					}
	            					//��

	                           // objProductBean.setBONSE(objProductBean.getSUM_ADJUST());			//	����
	                            objProductBean.setINTAX(objProductBean.getSUM_ADJUST());			//	���⳻�ݾ�
	                            objProductBean.setOVERTAX(OVERTAX_ARR[i]);		//	�����ıݾ�
	            				//objProductBean.setSISE(objProductBean.getSUM_ADJUST());			//	�ü�
	            				//objProductBean.setGUSE("0");			//	����
	            				objProductBean.setGIGUM("0");			//	���
	            				objProductBean.setGUKSE("0");			//	����
	            				objProductBean.setFORM1(objProductBean.getFORM());
	            				objProductBean.setFORM2(objProductBean.getFORM_ADJUST());
	            				
	            				objProductBean.setTAX_DATE(util.Date_Cut(TAX_DATE));		//	��������
	            				objProductBean.setINDATE(util.Date_Cut(INDATE));			//	���⳻����
	            				objProductBean.setOVERDATE(util.Date_Cut(OVERDATE));		//	����������
	            				objProductBean.setTAX_YM(objProductBean.getTAX_DATE().substring(0,6));
	            				objProductBean.setADD_YN(ADD_YN);
	            				objProductBean.setADD_SET(ADD_SET);
	            				objProductBean.setTAX_GUBUN(TAX_GUBUN);
	            				
	            				objProductBean.setOBJ_SET(OBJ_SET);
	            				objProductBean.setTAXPAYER_SET(TAXPAYER_SET);
	            				objProductBean.setLIVE(LIVE);
	            				objProductBean.setTAX_CD(TAX_CD);
	            				
	            				objProductBean.setSIGU_CD(userBean.getORG_CD());
	        					objProductBean.setDEPT_CD(userBean.getDEPT_CD());
	            				objProductBean.setSUBUSEO_CD(SUBUSEO_CD);
	            				objProductBean.setOCR_BUSEO_CD(OCR_BUSEO_CD);
	            				objProductBean.setOCR_SIGU_CD(OCR_SIGU_CD);
	            				objProductBean.setRATE(gasanRate);
	            				
	            				// gapan_taxation_info ���� ����
	            				objJumyongService.executeBugwa_Register(objProductBean);
	            				
	            				 System.out.println("********* gapan_taxation_info �Է� end ************");
	            				                                
	                            
	                            // ADMIN_BASE ������Ʈ ��¥ ����
	                            objJumyongService.Admin_baseUp_dateUpdateQuery(thisDate, GAPAN_NO_ARR[i]);
	                            
	                    	    okCnt++;

	                            

	                        }else {
	                        	// �ߺ����� true end
	                            failCnt++;
	                            failNo += "'" + GAPAN_NO_ARR[i] + ", ";
	                        }
	                    }// for�� end

	            }
	        

	    } 
	    }catch (Exception e) {
	        e.printStackTrace();
	        result_message = e.toString();// "����� ���⿡�� ������ �߻� ";
	    }

	    if (result_message == null || "".equals(result_message)) {

	        if (failCnt > 0) {
	        	result_message = "����Ⱓ�� ��ġ�� ���� " + failCnt + "�� �ֽ��ϴ�. �� ���� "+okCnt+"�Ǹ� ����Ǿ����ϴ�. ";
	        } else {
	            result_message = okCnt+"���� ����Ǿ����ϴ�.";
	        }

	    }
	    System.out.println("failNo : "+failNo);

	    System.out.println("result_message== " + result_message);
	    return new ModelAndView("redirect:/gapan/jumyong/search.do?&message=" + result_message);
	}
	//////////////////////////////////////////////////////////////////////////////////////////////////
	
	
////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////
	// �ϰ��Ӵ�� ����
	public ModelAndView batch_cal4(HttpServletRequest request,HttpServletResponse response) throws Exception {

		//���� ����
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		SearchBean objSearchBean = null;

		try{
			if(userId != null)
			{
				//		���ǿ��� �õ� �ڵ带 �����´�.
				String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				
				//	������ �����͸� �����´�.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
				String YEAR = ServletRequestUtils.getStringParameter(request,"YEAR4","");
			    String[] ITEM_CHECK_ARR = request.getParameterValues("ITEM_CHECK");
	            String[] GAPAN_NO_ARR = request.getParameterValues("GAPAN_NO");
	            String CAL_MODE = ServletRequestUtils.getStringParameter(request,"CAL_MODE","");
	            String TAX_SET = ServletRequestUtils.getStringParameter(request,"TAX_SET","");
	            
	            int listCount = 0;
	            System.out.println("YEAR:"+YEAR);
	            System.out.println("CAL_MODE : "+CAL_MODE);
	            
	            ArrayList productList = new ArrayList();
	       
	            for(int i = 0 ; i < ITEM_CHECK_ARR.length ; i++){
	            	if(ITEM_CHECK_ARR[i].equals("true")){
	            		ProductBean product = (ProductBean)objJumyongService.getBatchCalculationProductList(GAPAN_NO_ARR[i],YEAR);
	            		listCount++;
	            		productList.add(product);
	            	}
	            }
	            
				request.setAttribute("taxation_part", commonCode.executeCommonCode("taxation_part", null, "����"));//	��������
				request.setAttribute("taxcode", commonCode.executeTaxCode("10", null, "����"));//	�����ڵ�
				request.setAttribute("taxpayer_residence", commonCode.executeCommonCode("taxpayer_residence", null, "����"));//	���ֻ���
				request.setAttribute("object_type", commonCode.executeCommonCode("object_type", null, "����"));//	���Ǳ���
				request.setAttribute("taxpayer_group", commonCode.executeCommonCode("taxpayer_group", null, "����"));//	������ ����
				request.setAttribute("TAX_SET", TAX_SET);	//���Ա���
				
				//���� �⵵
				SimpleDateFormat	formatter 	= new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA );
				Calendar 			cal 		= Calendar.getInstance();
				String	today		= formatter.format(cal.getTime());
				
				if(userBean	!= null)
				{
					request.setAttribute("ORG_CD", userBean.getORG_CD());
					request.setAttribute("GU_NM", userBean.getGU_NM());
					request.setAttribute("DEPT_CD", userBean.getDEPT_CD());
					request.setAttribute("DEPT_NM", userBean.getDEPT_NM());
					request.setAttribute("TAX_DATE", today);
				}
				
				
				System.out.println("::::::::productList Size:::::::::"+productList.size());
	        
	            
	            
	            request.setAttribute("YEAR", YEAR);
	            
	            request.setAttribute("FROMDATE", YEAR+"-01-01");
	            request.setAttribute("TODATE", YEAR+"-12-31");
	            request.setAttribute("PERIOD", "365");
	            
	            request.setAttribute("productList", productList);
	            request.setAttribute("listCount", String.valueOf(listCount));
	            request.setAttribute("CAL_MODE", CAL_MODE);
	            
	            
	            
			}
		} catch(Exception e){
			System.out.println("Batch cal ERROR");
			e.printStackTrace();
		}
		
		return new ModelAndView("/gapan/jumyong/batch_Cal4");
	}

	/////////////////////////////////////////////////////////////////////////////////////////////////////////

	// �ϰ��Ӵ����� ����
	public ModelAndView batch_cal4_prc(HttpServletRequest request,HttpServletResponse response) throws Exception {

		  // ���� ����
	    HttpSession session = request.getSession();
	    String userId = (String) session.getAttribute("sessionUserId");
	    String param = "";
	    String result_message = "";
	    int failCnt = 0;
	    int okCnt = 0;
	    String failNo = "";

	    try {
	        if (userId != null) {
	            // ������ �����͸� �����´�.
	            UserBean userBean = new UserBean();
	            userBean = commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));

	            // ���⵵ ���
	            Calendar cal = Calendar.getInstance();
	            SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
	            String thisDate = formatter.format(cal.getTime());
	            String thisYear = thisDate.substring(0, 4);

	            // ��� ���� param start
	            String YEAR = ServletRequestUtils.getStringParameter(request,"YEAR", "");
	            String FROMDATE = ServletRequestUtils.getStringParameter(request, "FROMDATE", "");
	            String TODATE = ServletRequestUtils.getStringParameter(request,"TODATE", "");
	            String PERIOD = ServletRequestUtils.getStringParameter(request,"PERIOD", "");
	            
	            String TAX_GUBUN = ServletRequestUtils.getStringParameter(request,"TAX_GUBUN", "");
	            String ADD_SET = ServletRequestUtils.getStringParameter(request,"ADD_SET", "");
	            
	            String ADD_YN = ServletRequestUtils.getStringParameter(request,"ADD_YN", "");
	            String SUBUSEO_CD = ServletRequestUtils.getStringParameter(request,"SUBUSEO_CD", "");
	            String gasanRate = ServletRequestUtils.getStringParameter(request,"gasanRate", "");
	            String OCR_BUSEO_CD = ServletRequestUtils.getStringParameter(request,"OCR_BUSEO_CD", "");
	            String OCR_SIGU_CD = ServletRequestUtils.getStringParameter(request,"OCR_SIGU_CD", "");
	            
	            String TAX_DATE = ServletRequestUtils.getStringParameter(request,"TAX_DATE", "");
	            String INDATE = ServletRequestUtils.getStringParameter(request,"INDATE", "");
	            String OVERDATE = ServletRequestUtils.getStringParameter(request,"OVERDATE", "");
	            
	            String OBJ_SET = ServletRequestUtils.getStringParameter(request,"OBJ_SET", "");
	            String TAXPAYER_SET = ServletRequestUtils.getStringParameter(request,"TAXPAYER_SET", "");
	            String LIVE = ServletRequestUtils.getStringParameter(request,"LIVE", "");
	            String TAX_CD = ServletRequestUtils.getStringParameter(request,"TAX_CD", "");
	            String CAL_MODE = ServletRequestUtils.getStringParameter(request,"CAL_MODE", "");

	            // ����Ʈ ��� - �迭 param start
	            String[] GAPAN_NO_ARR = request.getParameterValues("GAPAN_NO");
	            
	            String[] PRICE_ARR = request.getParameterValues("PRICE");
	            String[] RATE_ARR = request.getParameterValues("RATE");
	            String[] AREA_AFTER_ARR = request.getParameterValues("AREA_AFTER");
	            String[] SUM_LASTYEAR_ARR = request.getParameterValues("SUM_LASTYEAR");
	            String[] SUM_YEAR_ARR = request.getParameterValues("SUM_YEAR");
	            String[] FORM_ARR = request.getParameterValues("FORM");
	            
	            String[] ADJUSTMENT_ARR = request.getParameterValues("ADJUSTMENT");
	            String[] SUM_ADJUST_ARR = request.getParameterValues("SUM_ADJUST");
	            String[] VAT_ARR = request.getParameterValues("VAT");
	            String[] OVERTAX_ARR = request.getParameterValues("OVERTAX");
	            String[] FORM_ADJUST_ARR = request.getParameterValues("FORM_ADJUST");
	            
	            String[] REDUCTION_RATE_ARR = request.getParameterValues("REDUCTION_RATE");
	            String[] REDUCTION_REASON_ARR = request.getParameterValues("REDUCTION_REASON");
	            int exist = 0;
	            System.out.println("CAL_MODE : "+CAL_MODE);
	            
	            if(CAL_MODE.equals("cal1")){
	            	CAL_MODE = "1";
	            }else if(CAL_MODE.equals("cal2")){
	            	CAL_MODE = "2";
	            }else if(CAL_MODE.equals("cal3")){
	            	CAL_MODE = "3";
	            }else if(CAL_MODE.equals("cal4")){
	            	CAL_MODE = "4";
	            }
	            System.out.println("cal_mode : "+CAL_MODE);

//	            System.out.println("ADMIN_NO_ARR.length == " + ADMIN_NO_ARR.length);
	            if (GAPAN_NO_ARR != null && !"".equals(GAPAN_NO_ARR)) {
	                for (int i = 0; i < GAPAN_NO_ARR.length; i++) {
	                    ProductBean objProductBean = new ProductBean();
	                        int cal_sum_seq = 0;
	                        int calculation_seq = 0;
//	                        System.out.println("�ش翬�� ����� �� �ߺ�����***** " + objJunggiService.cal_sum_exist(ADMIN_NO_ARR[i], YEAR));
	                       
	             
	                      //20100512 ����
	        				List leep = objJumyongService.getCalculationDate(GAPAN_NO_ARR[i], CAL_MODE);
	        				int from = 0;
	        				int to = 0;
	        				
	        				for(int k =0; k<leep.size();k++){
	        					ProductBean bb = (ProductBean)leep.get(k);

	        					from = Integer.parseInt(removeDash(FROMDATE));
	        					to = Integer.parseInt(removeDash(TODATE));
	        					
	        					if(Integer.parseInt(bb.getFROMDATE())<=from && Integer.parseInt(bb.getTODATE())>=from){
	        						
	        						exist = 1;
	        					
	        						
	        					}else if(Integer.parseInt(bb.getFROMDATE())<=to && Integer.parseInt(bb.getTODATE())>=to){
	        						
	        					   exist = 1;
	        					}
	        					
	        					
	        				
	        				}
	        				
	        				//20100512 ��
	        				System.out.println("---(100513)---");

	    					System.out.println("getfromdate : "+FROMDATE);
	    					System.out.println("gettodate : "+TODATE);
	    					System.out.println("TAX_CD : "+TAX_CD);
	        					
	        					
	                        if (objJumyongService.cal_sum_exist(GAPAN_NO_ARR[i],YEAR,CAL_MODE) < 1 || exist == 0) {
	                        	
	                        	// cal_sum_seq ���� ���� ��������
	                            cal_sum_seq = objJumyongService.getCal_Sum_Seq();
	                            

	                            // System.out.println("************* ���밪 ���� start ****************");
	                            // 1.2.3 ���밪 ����
	                            objProductBean.setCAL_MODE(CAL_MODE);
	                            objProductBean.setYEAR(YEAR);
	                            objProductBean.setFROMDATE(util.Date_Cut(FROMDATE));
	                            objProductBean.setTODATE(util.Date_Cut(TODATE));
	                            objProductBean.setPERIOD(PERIOD);
	                            
	                            objProductBean.setGAPAN_NO(GAPAN_NO_ARR[i]);
	                            objProductBean.setADMIN_NO(GAPAN_NO_ARR[i]);

	                            if (PRICE_ARR[i] != null && !"".equals(PRICE_ARR[i])){
	                            	objProductBean.setPRICE(util.nullTo(PRICE_ARR[i],"0"));
	                            }
	                            if (AREA_AFTER_ARR[i] != null && !"".equals(AREA_AFTER_ARR[i])) {
	                                objProductBean.setAREA_AFTER(util.nullTo(AREA_AFTER_ARR[i], "0"));
	                            }
	                            if (RATE_ARR[i] != null && !"".equals(RATE_ARR[i])){
	                                objProductBean.setRATE((util.nullTo(RATE_ARR[i], "0")));
	                            }
	                            if (SUM_LASTYEAR_ARR[i] != null && !"".equals(SUM_LASTYEAR_ARR[i])) {
	                                objProductBean.setSUM_LASTYEAR(util.nullTo(SUM_LASTYEAR_ARR[i], "0"));
	                            }
	                            
	                            if (SUM_YEAR_ARR[i] != null && !"".equals(SUM_YEAR_ARR[i])) {
	                                objProductBean.setSUM_YEAR(util.nullTo(SUM_YEAR_ARR[i], "0"));
	                            }
	                            if (FORM_ARR[i] != null && !"".equals(FORM_ARR[i])) {
	                                objProductBean.setFORM(util.nullTo(FORM_ARR[i], ""));
	                            }
	                            if (ADJUSTMENT_ARR[i] != null && !"".equals(ADJUSTMENT_ARR[i])) {
	                                objProductBean.setADJUSTMENT((util.nullTo(ADJUSTMENT_ARR[i],"1")));
	                            }
	                            if (SUM_ADJUST_ARR[i] != null && !"".equals(SUM_ADJUST_ARR[i])) {
	                                objProductBean.setSUM_ADJUST(util.nullTo(SUM_ADJUST_ARR[i], "0"));
	                            }
	                            if (SUM_ADJUST_ARR[i] != null && !"".equals(SUM_ADJUST_ARR[i])) {
	                                objProductBean.setSUM(util.nullTo(SUM_ADJUST_ARR[i], "0"));
	                            }
	                            if (VAT_ARR[i] != null && !"".equals(VAT_ARR[i])) {
	                                objProductBean.setVAT(util.nullTo(VAT_ARR[i], "0"));
	                            }
	                            if (FORM_ADJUST_ARR[i] != null && !"".equals(FORM_ADJUST_ARR[i])) {
	                                objProductBean.setFORM_ADJUST(util.nullTo(FORM_ADJUST_ARR[i], ""));
	                            }

	                            if (REDUCTION_RATE_ARR[i] != null && !"".equals(REDUCTION_RATE_ARR[i])) {
	                                objProductBean.setREDUCTION_RATE((util.nullTo(REDUCTION_RATE_ARR[i],"0")));
	                            }
	                            if (REDUCTION_REASON_ARR[i] != null && !"".equals(REDUCTION_REASON_ARR[i])) {
	                                objProductBean.setREDUCTION_REASON(util.nullTo(REDUCTION_REASON_ARR[i],""));
	                            }
	                            if(SUM_LASTYEAR_ARR[i] != null && !"".equals(SUM_LASTYEAR_ARR[i])){
	                            	objProductBean.setUSE_SECTION("1");
	                            }else{
	                            	objProductBean.setUSE_SECTION("2");
	                            }
	                            
	                            // System.out.println("************* ���밪 ���� end ***************");
	                            // ******************************************************************//
	                            // 1.CALCULATION �� �Է�
	                            objProductBean.setCAL_SUM_SEQ(String.valueOf(cal_sum_seq));
	                            objProductBean.setPREV_SEQ("2"); // PREV_SEQ
	                            objProductBean.setFIRST_SEQ(""); // FIRST_SEQ ���
	                            objProductBean.setUP_DATE(thisDate);
	                            
	                            objJumyongService.insertProduct(objProductBean);
	                             System.out.println("********* calculation_info �Է� end ************");
	                            // ******************************************************************//

	                            // *************************************************************//
	                            // 2. cal_sum_info �� �Է�
	                            objProductBean.setSEQ(String.valueOf(cal_sum_seq));
	                            objProductBean.setTAX_SEQ(String.valueOf(cal_sum_seq));
	                            objJumyongService.Cal_Sum_InfoInsert(objProductBean);
	                            System.out.println("********* cal_sum_info �Է� end ************");
	                            // *************************************************************//
	                         
	                            
	                            //�Ʒ��� 4���� �׸� �ܿ� �͵��� �ñ��� ��� ���� ��� �ü��� ����.
	            				//���� ���� ¡���ý��ۿ��� �׷��� �϶�� ��(20100512)
	            			//	System.out.println("�ñ��� ���� : "+objProductBean.getTAX_CD().substring(0,1));
	            			//	String a = objProductBean.getTAX_CD().substring(0,1);  ����

	                            if(TAX_CD.equals("10212807")){						
            						long sum = Math.round(Long.parseLong(objProductBean.getSUM_ADJUST())/2);
            						String sumTemp = Long.toString(sum);
            						long partOne = Long.valueOf(sumTemp.substring(sumTemp.length()-1,sumTemp.length())).longValue();
            						
            						objProductBean.setBONSE(objProductBean.getSUM_ADJUST());
            						objProductBean.setSISE(Long.toString(sum+partOne));
            						objProductBean.setGUSE(Long.toString(sum-partOne));
            						
            					}else if(TAX_CD.equals("10212808")){
            						long sum = Math.round(Long.parseLong(objProductBean.getSUM_ADJUST())/2);
            						String sumTemp = Long.toString(sum);
            						long partOne = Long.valueOf(sumTemp.substring(sumTemp.length()-1,sumTemp.length())).longValue();
            						
            						objProductBean.setBONSE(objProductBean.getSUM_ADJUST());
            						objProductBean.setSISE(Long.toString(sum+partOne));
            						objProductBean.setGUSE(Long.toString(sum-partOne));
            						
            					}else if(TAX_CD.equals("10211201")){
            						
            						long sum = Math.round(Long.parseLong(objProductBean.getSUM_ADJUST())/2);
            						String sumTemp = Long.toString(sum);
            						long partOne = Long.valueOf(sumTemp.substring(sumTemp.length()-1,sumTemp.length())).longValue();
            						
            						objProductBean.setBONSE(objProductBean.getSUM_ADJUST());
            						objProductBean.setSISE(Long.toString(sum+partOne));
            						objProductBean.setGUSE(Long.toString(sum-partOne));
            						
            					}else if(TAX_CD.equals("10228202")){
            						long sise = Math.round(Long.parseLong(objProductBean.getSUM_ADJUST())*60/100);
            						long guse = Math.round(Long.parseLong(objProductBean.getSUM_ADJUST())*40/100);
            						
            						String sumTemp = Long.toString(guse);
            						long partOne = Long.valueOf(sumTemp.substring(sumTemp.length()-1,sumTemp.length())).longValue();
            							            						
            						objProductBean.setBONSE(objProductBean.getSUM_ADJUST());
            						objProductBean.setSISE(Long.toString(sise+partOne));
            						objProductBean.setGUSE(Long.toString(guse-partOne));
            					}else{
            						objProductBean.setBONSE(objProductBean.getSUM_ADJUST());
            						objProductBean.setSISE(objProductBean.getSUM_ADJUST());
            						objProductBean.setGUSE("0");
            					}
	            					//��

	                           // objProductBean.setBONSE(objProductBean.getSUM_ADJUST());			//	����
	                            objProductBean.setINTAX(objProductBean.getSUM_ADJUST());			//	���⳻�ݾ�
	                            objProductBean.setOVERTAX(OVERTAX_ARR[i]);		//	�����ıݾ�
	            				//objProductBean.setSISE(objProductBean.getSUM_ADJUST());			//	�ü�
	            				//objProductBean.setGUSE("0");			//	����
	            				objProductBean.setGIGUM("0");			//	���
	            				objProductBean.setGUKSE("0");			//	����
	            				objProductBean.setFORM1(objProductBean.getFORM());
	            				objProductBean.setFORM2(objProductBean.getFORM_ADJUST());
	            				
	            				objProductBean.setTAX_DATE(util.Date_Cut(TAX_DATE));		//	��������
	            				objProductBean.setINDATE(util.Date_Cut(INDATE));			//	���⳻����
	            				objProductBean.setOVERDATE(util.Date_Cut(OVERDATE));		//	����������
	            				objProductBean.setTAX_YM(objProductBean.getTAX_DATE().substring(0,6));
	            				objProductBean.setADD_YN(ADD_YN);
	            				objProductBean.setADD_SET(ADD_SET);
	            				objProductBean.setTAX_GUBUN(TAX_GUBUN);
	            				
	            				objProductBean.setOBJ_SET(OBJ_SET);
	            				objProductBean.setTAXPAYER_SET(TAXPAYER_SET);
	            				objProductBean.setLIVE(LIVE);
	            				objProductBean.setTAX_CD(TAX_CD);
	            				
	            				objProductBean.setSIGU_CD(userBean.getORG_CD());
	        					objProductBean.setDEPT_CD(userBean.getDEPT_CD());
	            				objProductBean.setSUBUSEO_CD(SUBUSEO_CD);
	            				objProductBean.setOCR_BUSEO_CD(OCR_BUSEO_CD);
	            				objProductBean.setOCR_SIGU_CD(OCR_SIGU_CD);
	            				objProductBean.setRATE(gasanRate);
	            				
	            				// gapan_taxation_info ���� ����
	            				objJumyongService.executeBugwa_Register(objProductBean);
	            				
	            				 System.out.println("********* gapan_taxation_info �Է� end ************");
	            				                                
	                            
	                            // ADMIN_BASE ������Ʈ ��¥ ����
	                            objJumyongService.Admin_baseUp_dateUpdateQuery(thisDate, GAPAN_NO_ARR[i]);
	                            
	                            okCnt++;

	                            

	                        }else {
	                        	// �ߺ����� true end
	                            failCnt++;
	                            failNo += "'" + GAPAN_NO_ARR[i] + ", ";
	                        }
	                    }// for�� end

	            }
	        

	    } 
	    }catch (Exception e) {
	        e.printStackTrace();
	        result_message = e.toString();// "����� ���⿡�� ������ �߻� ";
	    }

	    if (result_message == null || "".equals(result_message)) {

	        if (failCnt > 0) {
	            result_message = "����Ⱓ�� ��ġ�� ���� " + failCnt + "�� �ֽ��ϴ�. �� ���� " +okCnt+"�Ǹ� ����Ǿ����ϴ�. ";
	        } else {
	            result_message = okCnt+"���� ����Ǿ����ϴ�. ";
	        }

	    }
	    System.out.println("failNo : "+failNo);

	    System.out.println("result_message== " + result_message);
	    return new ModelAndView("redirect:/gapan/jumyong/search.do?&message=" + result_message);
	}
	//////////////////////////////////////////////////////////////////////////////////////////////////
	
	public String removeDash(String val1)
	{			
		String[] components = val1.split("-");		
		String returnVal = "";		
		for(int i=0;i<components.length;i++)
			returnVal = returnVal + components[i].toString();
		
		return returnVal;		
	}
	
	// �ϰ�������� ����
	public ModelAndView batch_extention(HttpServletRequest request,HttpServletResponse response) throws Exception {

		//���� ����
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		SearchBean objSearchBean = null;
		int listCount = 0;

		try{
			if(userId != null)
			{
				//		���ǿ��� �õ� �ڵ带 �����´�.
				String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				
				//	������ �����͸� �����´�.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
			    String[] ITEM_CHECK_ARR = request.getParameterValues("ITEM_CHECK");
	            String[] GAPAN_NO_ARR = request.getParameterValues("GAPAN_NO");
	            String NEW_MUL_FROMDATE = removeDash(ServletRequestUtils.getStringParameter(request,"NEW_MUL_FROMDATE", ""));
	            String NEW_MUL_TODATE = removeDash(ServletRequestUtils.getStringParameter(request,"NEW_MUL_TODATE", ""));
	            
	            
	       
	            for(int i = 0 ; i < ITEM_CHECK_ARR.length ; i++){
	            	if(ITEM_CHECK_ARR[i].equals("true")){
	            		listCount++;
	            		objJumyongService.executeGiganUpdate(GAPAN_NO_ARR[i],NEW_MUL_FROMDATE,NEW_MUL_TODATE);

	            	}
	            }
	            
	            
			}
		} catch(Exception e){
			System.out.println("::::::::::::::Batch extention ERROR::::::::::::::");
			e.printStackTrace();
		}
		
		return new ModelAndView("redirect:/gapan/jumyong/search.do?&message=" + listCount+"�ǿ� ���ؼ� �㰡�Ⱓ�� ����Ǿ����ϴ�.");
	}
	
	/**
	 * ����� �ϰ� ���� ó��. 
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public ModelAndView batchRemoveJumyongByAjax(HttpServletRequest request,HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
//		SearchBean objSearchBean = null;
//		int listCount = 0;
		String msg = ServletRequestUtils.getStringParameter(request, "msg");
		
		logger.info("userId = " + userId + ", msg = " + msg);
		/* spec
		 * result : success, error(Exception)
		 * status : { total : int, success : int}
		 */
		JSONObject jContent = new JSONObject();
		try{
			if(userId != null && msg != null) {
				JSONObject jReq = new JSONObject(msg);
				/* Year, Gapan_NO�� �̿��Ͽ� seq ��ȸ. */
				int year = jReq.optInt("year", 0);
				if (year > 0) {
					JSONArray list = jReq.optJSONArray("list");
					int total = list.length();
					int success = 0;
					for (int i = 0; i < total; i++) {
						JSONObject item = list.optJSONObject(i);
						String gapanNo = item.optString("no", null);
						logger.warn("gapan : " + gapanNo);
						if (gapanNo != null) {
							ProductBean product = objJumyongService.getCalculationItem(""+ year, gapanNo);
							if (product == null) {
								logger.fatal(String.format("Product : %s,  %s is no calculation", year, gapanNo));
							} else {
								logger.fatal(String.format("Product : %s,%s,%s", product.getYEAR(), product.getGAPAN_NO(), product.getSEQ()));
								// remove calculation, calc_sum, tax
								success += objJumyongService.executeDeleteCalTax(product.getGAPAN_NO(), product.getSEQ());								
							}
						}
					}
					JSONObject status = new JSONObject();
					status.put("year", year);
					status.put("total", total);
					status.put("success", success);
					jContent.put("status", status);
					jContent.put("result", "success");
				}
			}
		} catch(Exception e){
			logger.error(e.getMessage(), e);
			jContent.put("message", e.getMessage());
			jContent.put("result", "error");
		}
		
		/* json �� ��� cache ���� �߻� Cache-Control:no-cache�� ���� */
		response.setContentType("application/json;charset=utf-8");
		response.setHeader("Cache-Control", "no-cache");
		response.getWriter().write(jContent.toString());
		return null;
	}	
	
}
