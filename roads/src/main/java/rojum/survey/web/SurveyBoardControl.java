package main.java.rojum.survey.web;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.common.commonCode.model.UserBean;
import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.util.BoardUtil;
import main.java.common.util.FileUploadUtil2;
import main.java.common.util.Globals;
import main.java.common.util.catUtil.Util;
import main.java.rojum.jumyong.model.ProductBean;
import main.java.rojum.jumyong.model.SaleBean;
import main.java.rojum.survey.model.GapanBaseBean;
import main.java.rojum.survey.model.GapanHeadBean;
import main.java.rojum.survey.model.GapanInfoBean;
import main.java.rojum.survey.model.SearchBean;
import main.java.rojum.survey.service.ISurveyService;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;


public class SurveyBoardControl extends MultiActionController {
	
		
	private ISurveyService objSurveyService = null;	
	private	CommonCodeService	commonCode		= null;	
	private	Util				util			= new Util();
	SearchBean objSearchBean = null;
	
	
	
	public void setRojum_SurveyService(ISurveyService newObjSurveyService) {
		this.objSurveyService = newObjSurveyService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode) 
	{
		this.commonCode 	= commonCode;
	}

	
	// ������ȸ excel ���Ϸ� ����
	public ModelAndView Excel_Search(HttpServletRequest request,HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		SearchBean objSearchBean = new SearchBean();
		
		try{
			if(userId != null)
			{
				// ���ǿ��� �õ� �ڵ带 �����´�.
				String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				
                // ���⵵ ���
                Calendar cal = Calendar.getInstance();
                SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
                String thisDate = formatter.format(cal.getTime());
                String thisYear = thisDate.substring(0, 4);
                
				//	������ �����͸� �����´�.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
				String YEAR = ServletRequestUtils.getStringParameter(request,"YEAR",thisYear);
				String GU_CD = ServletRequestUtils.getStringParameter(request,"GU_CD",userBean.getSIGU_CD());
				String BJ_CD = ServletRequestUtils.getStringParameter(request,"BJ_CD","");
				String BONBUN = ServletRequestUtils.getStringParameter(request,"BONBUN","");
				String BUBUN = ServletRequestUtils.getStringParameter(request,"BUBUN","");
				String OWNER_NAME = ServletRequestUtils.getStringParameter(request,"OWNER_NAME","");
				String GAPAN_NO = ServletRequestUtils.getStringParameter(request,"GAPAN_NO","");
				String SECTION = ServletRequestUtils.getStringParameter(request,"SECTION","1");
				String EXCEL = ServletRequestUtils.getStringParameter(request,"EXCEL","N");
				String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
				String strCountPerPage = ServletRequestUtils.getStringParameter(request, "countPerPage", "10");
				//********** BEGIN_����_20120313
				String GUGAN_CD = ServletRequestUtils.getStringParameter(request, "GUGAN_CD", "");
				String FT_TYP = ServletRequestUtils.getStringParameter(request, "FT_TYP", "");
				//********** END_����_20120313
				String reqMSG = ServletRequestUtils.getStringParameter(request, "MSG", "");
				 
				
				
				objSearchBean.setYEAR(YEAR);
				objSearchBean.setGU_CD(GU_CD);
				
				
				objSearchBean.setBJ_CD(BJ_CD);
				objSearchBean.setBONBUN(BONBUN);
				objSearchBean.setBUBUN(BUBUN);
				objSearchBean.setOWNER_NAME(OWNER_NAME);
				objSearchBean.setGAPAN_NO(GAPAN_NO);
				objSearchBean.setSECTION(SECTION);
				objSearchBean.setEXCEL(EXCEL);
System.out.println("objSearchBean.getEXCEL() : " + objSearchBean.getEXCEL());
				objSearchBean.setCURRENT_PAGE(strCurrentPage);
				objSearchBean.setCOUNTER_PER_PAGE(strCountPerPage);
				//********** BEGIN_����_20120313
				objSearchBean.setGUGAN_CD(GUGAN_CD);
				//********** END_����_20120313
				objSearchBean.setFT_TYP(FT_TYP);
				
				Map countMap = objSurveyService.getSurveyListCount(objSearchBean);
				
				System.out.println(countMap);
				
				int listCount = new Integer(countMap.get("TOTAL").toString());
				int unconfirmListCount = new Integer(countMap.get("UN_TOTAL").toString());
				
				
				//paging
				String strPageDivideForm = BoardUtil.getDividePageForm(Integer.parseInt(strCurrentPage),10,
						"&YEAR="+YEAR+"&GU_CD="+GU_CD+"&BJ_CD="+BJ_CD+"&BONBUN="+BONBUN+
						"&BUBUN="+BUBUN+"&OWNER_NAME="+OWNER_NAME+"&GAPAN_NO="+GAPAN_NO+"&SECTION="+SECTION
						, "", "/rojum/survey/search.do", listCount);
				
				//�Ϲ� �ڵ�.
				request.setAttribute("YEAR", YEAR);
				request.setAttribute("GU_CODE", commonCode.executeGuCdList(userBean.getSIGU_CD(),GU_CD));	//	�ñ���
				request.setAttribute("BJ_CODE", commonCode.CommonBJDongCodeSearch(SIDO_CD, GU_CD, BJ_CD));	//	������
				request.setAttribute("BONBUN", BONBUN);
				request.setAttribute("BUBUN", BUBUN);
				request.setAttribute("OWNER_NAME", OWNER_NAME);
				request.setAttribute("GAPAN_NO", GAPAN_NO);
				request.setAttribute("SECTION", SECTION);
				request.setAttribute("currentPage", strCurrentPage);
				request.setAttribute("strPageDivideForm", strPageDivideForm);
				request.setAttribute("listCount", String.valueOf(listCount));
				request.setAttribute("unconfirmListCount", String.valueOf(unconfirmListCount));
				request.setAttribute("FT_TYP", FT_TYP);
			}
		} catch(Exception e){
			e.printStackTrace();
		}
		return new ModelAndView("/rojum/survey/excel_search","blist",objSurveyService.getSurveyList(objSearchBean));	
		 
//		 ���� ����
		/*
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
				
				System.out.println(" Survey Board Control.....");
				System.out.println(" Survey Board Control.....");
				System.out.println(" Survey Board Control.....");
				System.out.println(" Survey Board Control.....");
				
				objSearchBean = new SearchBean();

				 
				String sYear = ServletRequestUtils.getStringParameter(request,"YEAR",""); 
				String sGu_cd = ServletRequestUtils.getStringParameter(request,"GU_CD",""); 
				String sBj_cd = ServletRequestUtils.getStringParameter(request,"BJ_CD","");
				String sBonbun = ServletRequestUtils.getStringParameter(request,"BONBUN",""); 
				String sBubun = ServletRequestUtils.getStringParameter(request,"BUBUN",""); 
				String sOwner_name = ServletRequestUtils.getStringParameter(request,"OWNER_NAME",""); 
				String sGapan_no = ServletRequestUtils.getStringParameter(request,"GAPAN_NO",""); 
				String sSection = ServletRequestUtils.getStringParameter(request,"SECTION",""); 
				String sExcel = ServletRequestUtils.getStringParameter(request,"EXCEL",""); 
				
				objSearchBean.setYEAR(sYear);
				objSearchBean.setGU_CD(sGu_cd);
				objSearchBean.setBJ_CD(sBj_cd);
				objSearchBean.setBONBUN(sBonbun);
				objSearchBean.setBUBUN(sBubun);
				objSearchBean.setOWNER_NAME(sOwner_name);
				objSearchBean.setGAPAN_NO(sGapan_no);
				objSearchBean.setSECTION(sSection);
				objSearchBean.setEXCEL(sExcel);
				  
				
				//���� ��¥ 
				Calendar  cal  =  Calendar.getInstance();		
				SimpleDateFormat  sdf  =  new SimpleDateFormat("yyyy");      // ������ ��� ���� ����
				String  yearVal  =  sdf.format (cal.getTime());      // ���� ��¥ ������ ����
				
 
				//�Ϲ� �ڵ�.	
	 			request.setAttribute("use_section", commonCode.executeCommonCode("occupancy_type", objSearchBean.getSECTION(), "����"));
		 		request.setAttribute("bjdong_code", commonCode.CommonBJDongCodeSearch(SIDO_CD, userBean.getSIGU_CD(), objSearchBean.getBJ_CD()));	//	������
				request.setAttribute("yearVal", yearVal);	//	�⵵
				 
				 				
				if(objSearchBean.getBJ_CD().equals("00000"))
					objSearchBean.setBJ_CD("%");
				 
			}
		} catch(Exception e){
			System.out.println("::::::::::::::::::::::::::::::ERROR:::::::::::::::::::::::");
			e.printStackTrace();
		}
		 
			return new ModelAndView("/rojum/survey/excel_search","blist1",	objSurveyService.retrieveBoardList(objSearchBean));
	*/
	}	
	
///////////////////////////////////////////////////////////////////////////////////////////////////////
	//	�ű� ��� ������
	public ModelAndView register(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		return new ModelAndView("/rojum/survey/register");
	}
	
	//�ű� ��� ȭ�� ���
	public	ModelAndView infoRegister(HttpServletRequest request, HttpServletResponse response) throws Exception
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
				request.setAttribute("SIGU_CD", userBean.getSIGU_CD());
				request.setAttribute("SIDO_NM", commonCode.executeSiNm(SIDO_CD));
				request.setAttribute("bjdong_code", commonCode.executeBJDongCode(SIDO_CD, userBean.getSIGU_CD(), null));
				request.setAttribute("hjdong_code", commonCode.executeHJDongCode(SIDO_CD, userBean.getSIGU_CD(), null));
				
				request.setAttribute("yn_pkp", commonCode.executeGapanCode("YN_PKP", null, "����"));
				request.setAttribute("dp_sel", commonCode.executeGapanCode("DP_SEL", null, "����"));
				request.setAttribute("sg_typ", commonCode.executeGapanCode("SG_TYP", null, "����"));
				request.setAttribute("mt_sel", commonCode.executeGapanCode("MT_SEL", null, "����"));
				
				request.setAttribute("ar_sel", commonCode.executeGapanCode("AR_SEL", null, "����"));
				request.setAttribute("uc_sel", commonCode.executeGapanCode("UC_SEL", null, "����"));
				request.setAttribute("dp_sel", commonCode.executeGapanCode("DP_SEL", null, "����"));
				request.setAttribute("mt_sel", commonCode.executeGapanCode("MT_SEL", null, "����"));
				request.setAttribute("sg_typ", commonCode.executeGapanCode("SG_TYP", null, "����"));
				request.setAttribute("sg_itm", commonCode.executeGapanCode("SG_ITM", null, "����"));
				request.setAttribute("sg_sel", commonCode.executeGapanCode("SG_SEL", null, "����"));
				request.setAttribute("un_typ", commonCode.executeGapanCode("UN_TYP", null, "����"));
				request.setAttribute("at_tax", commonCode.executeGapanCode("AT_TAX", null, "����"));
				//********** BEGIN_����_20120312
				String GU_CD = ServletRequestUtils.getStringParameter(request,"GU_CD",userBean.getSIGU_CD());				
				request.setAttribute("GU_CODE", commonCode.executeGuCdList(userBean.getSIGU_CD(),GU_CD));	//	�ñ���				
				//********** END_����_20120312
				//********** BEGIN_����_20120317				
				String gapanGuganList = commonCode.CommonGapanGuganCodeSearch(GU_CD, "");
				request.setAttribute("GUGAN_CD_LIST",gapanGuganList);
				//********** END_����_20120317
				
			}
			
		} catch(Exception e){
			System.out.println(e.toString());
		}
		
		return new ModelAndView("/rojum/survey/tab/info_register");
	}
	
	//�űԵ�� (�ο�, ������, �ü���)
	public ModelAndView	infoRegisterPrc(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{

		//GAPAN_BASE ���̺�  ���� �����Ͱ� �ִ��� Ȯ���Ѵ�. (������ �����ϰ� �����ڹ�ȣ�� �����Ѵ�.)
		String	GAPAN_NO	= Gapan_Base_Register_Execute(request, response);
		
		if(GAPAN_NO	!=	null)
		{
			//	������ �����͸� �����Ѵ�.
			Gapan_Head_Register_Execute(request, response, GAPAN_NO);
			
			
			//	�ü��� ������ �����Ѵ�.
			Gapan_Info_Register_Execute(request, response, GAPAN_NO);
		}

		return new ModelAndView("/rojum/survey/tab/register_sucess");
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
		
		//	��������
		SimpleDateFormat	formatter 	= new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA);
		Calendar 			cal 		= Calendar.getInstance();
		String 	REGDATE 	= formatter.format(cal.getTime());
		
		
		String 	GAPAN_NO 	= Gapan_No_Maker(userBean.getSIGU_CD()+bj_cd);	//GAPAN_NO ����
		String 	MANAGER 	= userBean.getNAME();
		String 	GP_TYP 	= "002";
		String  USERID 		= util.getSessionID(request, "sessionUserId");
		
		GapanBaseBean	Bean	= new GapanBaseBean();
		
		Bean.setGAPAN_NO(GAPAN_NO);
		Bean.setREG_DATE(util.Date_Cut(REGDATE));
		Bean.setUP_DATE(util.Date_Cut(REGDATE));
		Bean.setMANAGER(MANAGER);
		Bean.setGP_TYPE(GP_TYP);
		Bean.setFINISH_ID(USERID);
		
		//	ADMIN_BASE�� �����Ѵ�.
		objSurveyService.executeGapan_Base_Register(Bean);
		
		return	GAPAN_NO;
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////
	//���� 	��� ����/������ ����
	public String Gapan_Head_Register_Execute(HttpServletRequest request,HttpServletResponse response, String GAPAN_NO) throws Exception
	{
		
		try{
			System.out.println("Gapan_Head_Register_Execute START");
		
			GapanHeadBean gapanHeadBean = new GapanHeadBean();
			bind(request, gapanHeadBean);
			

			//��� �ź��� Ȯ�� ����
			String OWNER_IDCHK = ServletRequestUtils.getStringParameter(request, "OWNER_IDCHK", "0");

			//��� �ֹι�ȣ
			String	owner_ssn = "";
			String owner_ssn1 = ServletRequestUtils.getStringParameter(request, "OWNER_SSN1", "");
			String owner_ssn2 = ServletRequestUtils.getStringParameter(request, "OWNER_SSN2", "");

			if(!owner_ssn1.equals("") && !owner_ssn2.equals(""))
				owner_ssn		= owner_ssn1 +"-" + owner_ssn2;
			
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
			
			String owner_post = ServletRequestUtils.getStringParameter(request, "OWNER_POST", "");
			String owner_topost = ServletRequestUtils.getStringParameter(request, "OWNER_TOPOST", "");
			
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
			
			
			//********** BEGIN_����_20120328
			String DONG = ServletRequestUtils.getStringParameter(request, "EMD_NM", gapanHeadBean.getDONG());
			String TDONG = ServletRequestUtils.getStringParameter(request, "TOEMD_NM", gapanHeadBean.getTDONG());
			gapanHeadBean.setDONG(DONG);
			gapanHeadBean.setTDONG(TDONG);
			gapanHeadBean.setBON(owner_bonbun);
			gapanHeadBean.setBU(owner_bubun);
			gapanHeadBean.setTBON(owner_tobonbun);
			gapanHeadBean.setTBU(owner_tobubun);
			// gapanHeadBean.setSI(SI);
			gapanHeadBean.setSI(TOSI);			
			//********** END_����_20120328

			
			gapanHeadBean.setGUN(GUN);
			gapanHeadBean.setDORO_NM(DORO_NM);
			gapanHeadBean.setBD_BON(BD_BON);
			gapanHeadBean.setBD_BU(BD_BU);
			gapanHeadBean.setBD_NM(BD_NM);
			gapanHeadBean.setBD_DET_NM(BD_DET_NM);
			
			gapanHeadBean.setTOSI(SI);
			gapanHeadBean.setTOGUN(TOGUN);
			gapanHeadBean.setTODORO_NM(TODORO_NM);
			gapanHeadBean.setTOBD_BON(TOBD_BON);
			gapanHeadBean.setTOBD_BU(TOBD_BU);
			gapanHeadBean.setTOBD_NM(TOBD_NM);
			gapanHeadBean.setTOBD_DET_NM(TOBD_DET_NM);
			
			
			
			gapanHeadBean.setGAPAN_NO(GAPAN_NO);
			gapanHeadBean.setGP_TYP("002");
			gapanHeadBean.setOWNER_IDCHK(OWNER_IDCHK);
			gapanHeadBean.setOWNER_SSN(owner_ssn);
			gapanHeadBean.setOWNER_TEL(owner_tel);
			gapanHeadBean.setOWNER_HP(owner_hp);
			gapanHeadBean.setOWNER_JIBUN(owner_jibun);
			gapanHeadBean.setOWNER_TOJIBUN(owner_tojibun);
			gapanHeadBean.setOWNER_POST(util.Post_Cut(owner_post));		//�����ȣ "-" ����.
			gapanHeadBean.setOWNER_TOPOST(util.Post_Cut(owner_topost));	//�����ȣ "-" ����.
			
			// ���Ͼ��ε� ����
			String OWNER_IMG_NAME = "";
			
			MultipartHttpServletRequest mpRequest = (MultipartHttpServletRequest) request;
			MultipartFile OWNER_IMG = mpRequest.getFile("OWNER_IMG");

			
			if (OWNER_IMG.getSize() > 0) {
				OWNER_IMG_NAME =FileUploadUtil2.uploadFormFile(OWNER_IMG,Globals.IMAGEFILEUPLOADPATH_ROJUM);
				gapanHeadBean.setOWNER_IMG_NAME(OWNER_IMG_NAME);
			}
			
			//GAPAN_HEAD  ���̺� �����Ѵ�.
			boolean result = objSurveyService.executeGapan_Head_Register(gapanHeadBean);
			
			System.out.println("Gapan_Head_Register_Execute END result : "+result);
		
		}catch(Exception e){
			e.printStackTrace();
		}
		return "";
	}


	////////////////////////////////////////////////////////////////////////////////////////////////////
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
		String  special_date = ServletRequestUtils.getStringParameter(request, "SPECIAL_DATE", "");
		
		
		gapanInfoBean.setGAPAN_NO(GAPAN_NO);
		
		gapanInfoBean.setPERMIT_DATE(util.Date_Cut(permit_date));	//�㰡����
		gapanInfoBean.setOPEN_TIME(open_time);						//�����ð�
		gapanInfoBean.setCLOSE_TIME(close_time);					//�����ð�
		
		
		gapanInfoBean.setFOUND_DATE(util.Date_Cut(found_date));		//��ġ����
		gapanInfoBean.setPICKUP_DATE("");   //��������

		
		gapanInfoBean.setGP_TYP("002");

		gapanInfoBean.setPURPOSE_CD("720");					//��������ڵ�(�������Ÿ�ü���)

		gapanInfoBean.setX_COORD(ServletRequestUtils.getStringParameter(request, "X_COORD", ""));			//�����߽���X��ǥ
		gapanInfoBean.setY_COORD(ServletRequestUtils.getStringParameter(request, "Y_COORD", ""));			//�����߽���Y��ǥ
		
		/* 2014.06 DORO JIBUNU KNY */
		gapanInfoBean.setJIBUN(ServletRequestUtils.getStringParameter(request, "JIBUN", "")); //��������
		
		gapanInfoBean.setTYPE(ServletRequestUtils.getStringParameter(request, "TYPE", "1"));
		gapanInfoBean.setSECTION(ServletRequestUtils.getStringParameter(request, "SECTION", "1"));
		gapanInfoBean.setOWNER_SET(ServletRequestUtils.getStringParameter(request, "OWNER_SET", ""));
		gapanInfoBean.setTAX_SET(ServletRequestUtils.getStringParameter(request, "TAX_SET", ""));
		gapanInfoBean.setMUL_FROMDATE(util.Date_Cut(mul_fromdate));
		
		gapanInfoBean.setMUL_TODATE(util.Date_Cut(mul_todate));
		gapanInfoBean.setTAXTATION_AT(ServletRequestUtils.getStringParameter(request, "TAXTATION_AT", "0"));			//�����ΰ�
		gapanInfoBean.setPICKUP_YN("0");
		gapanInfoBean.setMANAGE_TYP("0");
		gapanInfoBean.setSPECIAL_DATE(util.Date_Cut(special_date));
		
		//���Ͼ��ε� ����
		MultipartHttpServletRequest mpRequest = (MultipartHttpServletRequest) request;
		MultipartFile SHOP_IMG = mpRequest.getFile("SHOP_IMG");
		String SHOP_IMG_NAME = "";
		
		if (SHOP_IMG.getSize() > 0) {
			//********** BEGIN_����_20120323
			/*
			FileUploadUtil2.uploadFormFile(SHOP_IMG,Globals.IMAGEFILEUPLOADPATH_ROJUM);
			SHOP_IMG_NAME = SHOP_IMG.getOriginalFilename();
			*/
			SHOP_IMG_NAME = FileUploadUtil2.uploadFormFile(SHOP_IMG,Globals.IMAGEFILEUPLOADPATH_ROJUM);		
			//********** END_����_20120323				
			gapanInfoBean.setSHOP_IMG_NAME(SHOP_IMG_NAME);
		}
		
		MultipartFile SHOP_IMG2 = mpRequest.getFile("SHOP_IMG2");
		String SHOP_IMG2_NAME = "";
		
		if (SHOP_IMG2.getSize() > 0) {
			//********** BEGIN_����_20120323
			/*
			FileUploadUtil2.uploadFormFile(SHOP_IMG2,Globals.IMAGEFILEUPLOADPATH_ROJUM);
			SHOP_IMG2_NAME = SHOP_IMG2.getOriginalFilename();
			*/
			SHOP_IMG2_NAME = FileUploadUtil2.uploadFormFile(SHOP_IMG2,Globals.IMAGEFILEUPLOADPATH_ROJUM);
			//********** END_����_20120323
			gapanInfoBean.setSHOP_IMG2_NAME(SHOP_IMG2_NAME);
		}
		
		//	GAPAN_INFO  ���̺� �����Ѵ�.
		//********** BEGIN_KANG_20120416
		if(gapanInfoBean.getCAR_NO() != null && !(gapanInfoBean.getCAR_NO().equals(""))){
			gapanInfoBean.setCAR_NO(gapanInfoBean.getCAR_NO().replaceAll("%00", ""));
			gapanInfoBean.setCAR_NO(gapanInfoBean.getCAR_NO().replaceAll("%02", ""));
			gapanInfoBean.setCAR_NO(gapanInfoBean.getCAR_NO().replaceAll(" ", ""));
		}
		//********** END_KANG_20120416
		
		boolean result = objSurveyService.executeGapan_Info_Register(gapanInfoBean);
		
		return	"";
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////
//		���� ��ȣ ����
	private	String	Gapan_No_Maker(String gapan_num)	//gapan_num�� ���ڵ�+�������ڵ� 
	{
		
		String	GAPAN_NO	= null;
		
		try
		{
			//	���� ������ȣ üũ
			GAPAN_NO	= objSurveyService.executeCheck_Gapanno(gapan_num);
		}
		catch(Exception e)
		{
			GAPAN_NO	= null;
			
//			System.out.println(" �ű� ������ȣ ���� ");
		}
		
		return	GAPAN_NO;
	}
	
	// �̼��� ���� ���
	public ModelAndView unPickup(HttpServletRequest request,HttpServletResponse response, String MSG) throws Exception {	
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		
		try{
			if(userId != null)
			{
				// ���ǿ��� �õ� �ڵ带 �����´�.
				String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				
                // ���⵵ ���
                Calendar cal = Calendar.getInstance();
                SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
                String thisDate = formatter.format(cal.getTime());
                String thisYear = thisDate.substring(0, 4);
                
			    String[] ITEM_CHECK_ARR = request.getParameterValues("ITEM_CHECK");
	            String[] GAPAN_NO_ARR = request.getParameterValues("GAPAN_NO_ARR");
	            
	            
	            for(int i = 0 ; i < ITEM_CHECK_ARR.length ; i ++){
	            	if(ITEM_CHECK_ARR[i].equals("true")){
	            		
	            		String newGapanNo = objSurveyService.executeCheck_Gapanno(GAPAN_NO_ARR[i].substring(0,6));
	            		String oldGapanNo = GAPAN_NO_ARR[i];
	            		
	            		objSurveyService.insertCopyGapanBase(newGapanNo, oldGapanNo);
	            		objSurveyService.insertCopyGapanHead(newGapanNo, oldGapanNo);
	            		objSurveyService.insertCopyGapanInfo(newGapanNo, oldGapanNo);
	            		
	            	}
	            }
	            
	            
			}
		} catch(Exception e){
			e.printStackTrace();
		}
		
		return surveyList(request, response, "����޴��� ��ϵǾ����ϴ�.");
	}
	
	
	
	// �������� ��ȸ
	public ModelAndView surveyList(HttpServletRequest request,HttpServletResponse response, String MSG) throws Exception {	
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		SearchBean objSearchBean = new SearchBean();
		
		try{
			if(userId != null)
			{
				// ���ǿ��� �õ� �ڵ带 �����´�.
				String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				
                // ���⵵ ���
                Calendar cal = Calendar.getInstance();
                SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
                String thisDate = formatter.format(cal.getTime());
                String thisYear = thisDate.substring(0, 4);
                
				//	������ �����͸� �����´�.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
				String YEAR = ServletRequestUtils.getStringParameter(request,"YEAR",thisYear);
				String GU_CD = ServletRequestUtils.getStringParameter(request,"GU_CD",userBean.getSIGU_CD());
				String BJ_CD = ServletRequestUtils.getStringParameter(request,"BJ_CD","");
				String BONBUN = ServletRequestUtils.getStringParameter(request,"BONBUN","");
				String BUBUN = ServletRequestUtils.getStringParameter(request,"BUBUN","");
				String OWNER_NAME = ServletRequestUtils.getStringParameter(request,"OWNER_NAME","");
				String GAPAN_NO = ServletRequestUtils.getStringParameter(request,"GAPAN_NO","");
				String SECTION = ServletRequestUtils.getStringParameter(request,"SECTION","1");
				String EXCEL = ServletRequestUtils.getStringParameter(request,"EXCEL","N");
				String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
				String strCountPerPage = ServletRequestUtils.getStringParameter(request, "countPerPage", "10");
				//********** BEGIN_����_20120312
				String GUGAN_CD = ServletRequestUtils.getStringParameter(request, "GUGAN_CD", "");
				//********** END_����_20120312
				
				/* 2014.08.10 ft_typ kny */
				String FT_TYP = ServletRequestUtils.getStringParameter(request, "FT_TYP", "");
				
				String reqMSG = ServletRequestUtils.getStringParameter(request, "MSG", "");
				
				if(!reqMSG.equals("")){
					MSG = reqMSG;
				}
				
				
				objSearchBean.setYEAR(YEAR);
				objSearchBean.setGU_CD(GU_CD);
				
				
				//2018-05-30
				String doSearch = ServletRequestUtils.getStringParameter(request, "doSearch", "");
				
				System.out.println("::::::::::GU_CD : "  + GU_CD);
				System.out.println("***********doSearch: " + doSearch);
				
				if(GU_CD.equals("000"))
					if(!doSearch.equals("none"))
						objSearchBean.setGU_CD("%");
				
				System.out.println("::::::::::GU_CD : "  + GU_CD);
				
				
				objSearchBean.setBJ_CD(BJ_CD);
				
				objSearchBean.setBONBUN(BONBUN);
				objSearchBean.setBUBUN(BUBUN);
				objSearchBean.setOWNER_NAME(OWNER_NAME);
				objSearchBean.setGAPAN_NO(GAPAN_NO);
				objSearchBean.setSECTION(SECTION);
				objSearchBean.setEXCEL(EXCEL);
				objSearchBean.setCURRENT_PAGE(strCurrentPage);
				objSearchBean.setCOUNTER_PER_PAGE(strCountPerPage);
				//********** BEGIN_����_20120312
				objSearchBean.setGUGAN_CD(GUGAN_CD);
				//********** END_����_20120312
				objSearchBean.setFT_TYP(FT_TYP);
				
				
				System.out.println("objSearchBean : " + objSearchBean.getGUGAN_CD());
				Map countMap = objSurveyService.getSurveyListCount(objSearchBean);
				
				System.out.println(countMap);
				
				int listCount = new Integer(countMap.get("TOTAL").toString());
				int unconfirmListCount = new Integer(countMap.get("UN_TOTAL").toString());
				
				
				//********** BEGIN_����_20120312
				/*
				//paging
				String strPageDivideForm = BoardUtil.getDividePageForm(Integer.parseInt(strCurrentPage),10,
						"&YEAR="+YEAR+"&GU_CD="+GU_CD+"&BJ_CD="+BJ_CD+"&BONBUN="+BONBUN+
						"&BUBUN="+BUBUN+"&OWNER_NAME="+OWNER_NAME+"&GAPAN_NO="+GAPAN_NO+"&SECTION="+SECTION
						, "", "/rojum/survey/search.do", listCount);
				*/
				//paging
				String strPageDivideForm = BoardUtil.getDividePageForm(Integer.parseInt(strCurrentPage),10,
						"&YEAR="+YEAR+"&GU_CD="+GU_CD+"&BJ_CD="+BJ_CD+"&BONBUN="+BONBUN+
						"&BUBUN="+BUBUN+"&OWNER_NAME="+OWNER_NAME+"&GAPAN_NO="+GAPAN_NO+"&SECTION="
						+SECTION+"&GUGAN_CD="+GUGAN_CD+"&FT_TYP="+FT_TYP
						, "", "/rojum/survey/search.do", listCount);
				//********** END_����_20120312
				
				
				//�Ϲ� �ڵ�.
				request.setAttribute("YEAR", YEAR);
				request.setAttribute("GU_CODE", commonCode.executeGuCdList(userBean.getSIGU_CD(),GU_CD));	//	�ñ���
				request.setAttribute("BJ_CODE", commonCode.CommonBJDongCodeSearch(SIDO_CD, GU_CD, BJ_CD));	//	������
				request.setAttribute("BONBUN", BONBUN);
				request.setAttribute("BUBUN", BUBUN);
				request.setAttribute("OWNER_NAME", OWNER_NAME);
				request.setAttribute("GAPAN_NO", GAPAN_NO);
				request.setAttribute("SECTION", SECTION);
				request.setAttribute("currentPage", strCurrentPage);
				request.setAttribute("strPageDivideForm", strPageDivideForm);
				request.setAttribute("listCount", String.valueOf(listCount));
				request.setAttribute("unconfirmListCount", String.valueOf(unconfirmListCount));
				request.setAttribute("MSG", MSG);
				
				//********** BEGIN_����_20120312
				System.out.println("GUGAN_CD : " + GUGAN_CD);
				String gapanGuganList = commonCode.CommonGapanGuganCodeSearch(GU_CD, GUGAN_CD);
				request.setAttribute("GUGAN", gapanGuganList);
				//********** END_����_20120312
				
				request.setAttribute("FT_TYP", FT_TYP);
			}
		} catch(Exception e){
			e.printStackTrace();
		}
		
		if(objSearchBean.getEXCEL().equals("EXCEL")){
			return new ModelAndView("/rojum/survey/excel_search","blist",objSurveyService.getSurveyList(objSearchBean));	
		}else{
			return new ModelAndView("/rojum/survey/search","blist",objSurveyService.getSurveyList(objSearchBean));
		}
		
	}
	
	
	//batchModSpecial
	public ModelAndView batchModSpecial(HttpServletRequest request,HttpServletResponse response) throws Exception {
		//���� ����
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		SearchBean objSearchBean = null;
		String MSG = "";
		
		GapanInfoBean bean = new GapanInfoBean();
			
		try{
			if(userId != null)
			{
				String specialSt = ServletRequestUtils.getStringParameter(request,"SPECIAL_ST","");
				String specialDate = ServletRequestUtils.getStringParameter(request,"SPECIAL_DATE","");

				String[] GAPAN_NO_ARR = request.getParameterValues("GAPAN_NO_ARR");
				String[] ITEM_CHECK_ARR = request.getParameterValues("ITEM_CHECK");
				
				for(int i = 0 ; i < ITEM_CHECK_ARR.length ; i++){
		        	if(ITEM_CHECK_ARR[i].equals("true")){
		        		bean.setGAPAN_NO(GAPAN_NO_ARR[i]);
		        		bean.setSPECIAL_ST(specialSt);
		        		bean.setSPECIAL_DATE(util.Date_Cut(specialDate));
		        		objSurveyService.modifySpecialStreet(bean);
	            	}
	            }
				
				MSG = "�Ÿ������� ����Ǿ����ϴ�.";

			}
		} catch(Exception e){
			System.out.println(e.toString());
			MSG = "�ý��� �����Դϴ�.";
		}
		
		return surveyList(request,response,MSG);
	}
	
	//********** BEGIN_����_20120312

	public ModelAndView getSectionCode(HttpServletRequest request, HttpServletResponse response)  throws Exception {
		
		// ���� ����
		HttpSession session = request.getSession();
		
		String 		userId	= (String)session.getAttribute("sessionUserId");
		
        try {
        	if(userId != null)
			{
				//	���ǿ��� �õ� �ڵ带 �����´�.
				String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				//	������ �����͸� �����´�.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
				String guCd = ServletRequestUtils.getStringParameter(request, "guCd", "");
				String GUGAN_CD = ServletRequestUtils.getStringParameter(request, "GUGAN_CD", "");
				
				String gapanGuganList = commonCode.CommonGapanGuganCodeSearch(guCd, GUGAN_CD);
				
		        response.setContentType("text/html;charset=EUC-KR");
		        response.setHeader("Cache-Control", "no-cache");
		        response.getWriter().write(gapanGuganList);
				
			}
        } catch (Exception e) {
        	e.printStackTrace();
        }
        return null;
    }

	public ModelAndView getSectionRegName(HttpServletRequest request, HttpServletResponse response)  throws Exception {
		
		// ���� ����
		HttpSession session = request.getSession();
		
		String 		userId	= (String)session.getAttribute("sessionUserId");
		
        try {
        	if(userId != null)
			{
				//	���ǿ��� �õ� �ڵ带 �����´�.
				String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				//	������ �����͸� �����´�.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));

				String GU_CD = ServletRequestUtils.getStringParameter(request, "GU_CD", "");
				String SURVEY_YEAR = ServletRequestUtils.getStringParameter(request, "SURVEY_YEAR", "");
				String GUGAN_CD = ServletRequestUtils.getStringParameter(request, "GUGAN_CD", "");
				
				String gapanGuganReqSEQ = commonCode.CommonGapanGuganCodeName(GU_CD, SURVEY_YEAR);
				String guName = commonCode.SearchGuName(SIDO_CD,GU_CD);
				
				String gapanGuganReqName = guName + "-" + SURVEY_YEAR.substring(2,4) + "-" + gapanGuganReqSEQ;
				
		        response.setContentType("text/html;charset=EUC-KR");
		        response.setHeader("Cache-Control", "no-cache");
		        response.getWriter().write(gapanGuganReqSEQ +"/"+gapanGuganReqName);
				
			}
        } catch (Exception e) {
        	e.printStackTrace();
        }
        return null;
    }
	//********** END_����_20120312

	
	
	
	
	
	
	
	
	
	
}