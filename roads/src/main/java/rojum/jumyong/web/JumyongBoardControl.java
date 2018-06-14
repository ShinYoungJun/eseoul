/***********************************
 * ������ : 2007.9.27
 * ���������� : ������
 * �������� :
 ***********************************/

package main.java.rojum.jumyong.web;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.common.commonCode.model.UserBean;
import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.util.BoardUtil;
import main.java.common.util.FileUploadUtil2;
import main.java.common.util.FileUtil;
import main.java.common.util.Globals;
import main.java.common.util.catUtil.Util;
import main.java.rojum.jumyong.model.GapanBaseBean;
import main.java.rojum.jumyong.model.GapanHeadBean;
import main.java.rojum.jumyong.model.GapanInfoBean;
import main.java.rojum.jumyong.model.PickupBean;
import main.java.rojum.jumyong.model.ProductBean;
import main.java.rojum.jumyong.model.ProductTaxBean;
import main.java.rojum.jumyong.model.SaleBean;
import main.java.rojum.jumyong.model.SearchBean;
import main.java.rojum.jumyong.model.TaxCodeBean;
import main.java.rojum.jumyong.service.IJumyongService;

import org.apache.derby.tools.sysinfo;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class JumyongBoardControl extends MultiActionController {
	
	private IJumyongService objJumyongService = null;	
	private	CommonCodeService	commonCode		= null;	
	private	Util				util			= new Util();
	
	
	
	public void setRojum_jumyongService(IJumyongService newObjJumyongService) {
		this.objJumyongService = newObjJumyongService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode) 
	{
		this.commonCode 	= commonCode;
	}

//@ ���� ��ȸ
	public ModelAndView jumyongList(HttpServletRequest request,HttpServletResponse response) throws Exception {
		
//		 ���� ����
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		SearchBean objSearchBean = null;
			
		try{
			if(userId != null)
			{
				//	������ �����͸� �����´�.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
				//		���ǿ��� �õ� �ڵ带 �����´�.
				String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				
                // ���⵵ ���
                Calendar cal = Calendar.getInstance();
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                String thisDate = formatter.format(cal.getTime());
                String toDate = formatter.format(cal.getTime());
                String thisYear = toDate.substring(0, 4);
                cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH)-1, cal.get(Calendar.DATE));
                String fromDate = formatter.format(cal.getTime());
                
				objSearchBean = new SearchBean();
				
				String section = ServletRequestUtils.getStringParameter(request,"section","1");
				String bj_cd = ServletRequestUtils.getStringParameter(request,"bj_cd","");
				String jumyongName = ServletRequestUtils.getStringParameter(request,"jumyongName","");
				String bonbun = ServletRequestUtils.getStringParameter(request,"bonbun","");
				String bubun = ServletRequestUtils.getStringParameter(request,"bubun","");
				String numberValue = ServletRequestUtils.getStringParameter(request,"numberValue","");
				String taxtation_at = ServletRequestUtils.getStringParameter(request,"taxtation_at","");
				String maintn_ob = ServletRequestUtils.getStringParameter(request,"maintn_ob","");
				String message = ServletRequestUtils.getStringParameter(request,"message","");
				String gu_cd = ServletRequestUtils.getStringParameter(request,"gu_cd",userBean.getSIGU_CD());
				String mg_typ = ServletRequestUtils.getStringParameter(request,"mg_typ","");
				toDate = ServletRequestUtils.getStringParameter(request,"toDate",toDate);
				fromDate = ServletRequestUtils.getStringParameter(request,"fromDate",fromDate);
				
				String ft_typ = ServletRequestUtils.getStringParameter(request,"ft_typ","");

				String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
				String strCountPerPage = ServletRequestUtils.getStringParameter(request, "countPerPage", "10");
				
				objSearchBean.setGU_CODE(gu_cd);
				
				
				System.out.println("$$$$$$$$$$$$$gu_cd: " + gu_cd);
				
				if(gu_cd.equals("000"))
					objSearchBean.setGU_CODE("%");
				
				
				objSearchBean.setSECTION(section);
				objSearchBean.setBJ_CD(bj_cd);
				objSearchBean.setJUMYONGNAME(jumyongName);
				objSearchBean.setBONBUN(bonbun);
				objSearchBean.setBUBUN(bubun);
				objSearchBean.setNUMBERVALUE(numberValue);
				objSearchBean.setTAXTAXION_AT(taxtation_at);
				objSearchBean.setTODATE(removeDash(toDate));
				objSearchBean.setFROMDATE(removeDash(fromDate));
				objSearchBean.setMAINTN_OB(maintn_ob);
				objSearchBean.setMANAGE_TYP(mg_typ);
				
				objSearchBean.setFT_TYP(ft_typ);
				
				objSearchBean.setCOUNTER_PER_PAGE(strCountPerPage);
				objSearchBean.setCURRENT_PAGE(strCurrentPage);
				
				
				//�Ϲ� �ڵ� ��		
				Map countMap = objJumyongService.getProductListCount(objSearchBean);
				int listCount = new Integer(countMap.get("TOTAL").toString());
				int unconfirmListCount = new Integer(countMap.get("UN_TOTAL").toString());
				
				
				
				//paging
				String strPageDivideForm = BoardUtil.getDividePageForm(Integer.parseInt(strCurrentPage),10,
						"&gu_cd="+gu_cd+"&bj_cd="+bj_cd+"&bonbun="+bonbun+"&bubun="+bubun
							+"&jumyongName="+jumyongName+"&numberValue="+numberValue
							+"&fromDate="+fromDate+"&toDate="+toDate+"&maintn_ob="
							+maintn_ob+"&section="+section+"&mg_typ="+mg_typ+"&ft_typ="+ft_typ
						,"", "/rojum/jumyong/search.do", listCount);
				
				//�Ϲ� �ڵ�.
				request.setAttribute("listCount", String.valueOf(listCount));
				request.setAttribute("unconfirmListCount", String.valueOf(unconfirmListCount));
				request.setAttribute("blist1",objJumyongService.retrieveBoardList(objSearchBean));
				
				System.out.println("ft_typ: " + objSearchBean.getFT_TYP());
				
				request.setAttribute("mg_typ", commonCode.executeGapanCode("MG_TYP", mg_typ, "��ü"));
				request.setAttribute("section", section);
				request.setAttribute("jumyongName", jumyongName);
				request.setAttribute("numberValue", numberValue);
				request.setAttribute("taxation_section", commonCode.executeCommonCode("taxation_section", objSearchBean.getTAX_SET(), "����"));
				request.setAttribute("taxtation_at", commonCode.executeCommonCode("taxtation_at", objSearchBean.getTAXTAXION_AT(), "����"));
				request.setAttribute("maintn_ob", commonCode.executeCommonCode("maintn_ob", objSearchBean.getMAINTN_OB(), "����"));
				request.setAttribute("gu_code", commonCode.executeGuCdList(userBean.getSIGU_CD(),gu_cd));	//	�ñ���
				request.setAttribute("bjdong_code", commonCode.CommonBJDongCodeSearch(SIDO_CD, gu_cd, objSearchBean.getBJ_CD()));	//	������
				request.setAttribute("bonbun", bonbun);
				request.setAttribute("bubun", bubun);
				
				request.setAttribute("message", message);
				request.setAttribute("toDate", toDate);
				request.setAttribute("fromDate", fromDate);
				request.setAttribute("thisDate", thisDate);
				request.setAttribute("YearVal", thisYear);
				
				request.setAttribute("currentPage", strCurrentPage);
				request.setAttribute("strPageDivideForm", strPageDivideForm);

				request.setAttribute("FT_TYP", ft_typ);
				
				
				System.out.println(objSearchBean);
			}
		} catch(Exception e){
			e.printStackTrace();
		}
		
		return new ModelAndView("/rojum/jumyong/search");
	}
	

//@ ������ȸ excel ���Ϸ� ����
public ModelAndView excel_jumyongList(HttpServletRequest request,HttpServletResponse response) throws Exception {
	
//	 ���� ����
	HttpSession session = request.getSession();
	String userId	= (String)session.getAttribute("sessionUserId");
	SearchBean objSearchBean = null;
		
	try{
		if(userId != null)
		{
			//	������ �����͸� �����´�.
			UserBean	userBean	= new UserBean();
			userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
			
			//		���ǿ��� �õ� �ڵ带 �����´�.
			String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
			
           // ���⵵ ���
           Calendar cal = Calendar.getInstance();
           SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
           String thisDate = formatter.format(cal.getTime());
           String toDate = formatter.format(cal.getTime());
           String thisYear = toDate.substring(0, 4);
           cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH)-3, cal.get(Calendar.DATE));
           String fromDate = formatter.format(cal.getTime());
           
			objSearchBean = new SearchBean();
			
			String section = ServletRequestUtils.getStringParameter(request,"section","1");
			String tax_set = ServletRequestUtils.getStringParameter(request,"tax_set","0");
			String bj_cd = ServletRequestUtils.getStringParameter(request,"bj_cd","");
			String jumyongName = ServletRequestUtils.getStringParameter(request,"jumyongName","");
			String bonbun = ServletRequestUtils.getStringParameter(request,"bonbun","");
			String bubun = ServletRequestUtils.getStringParameter(request,"bubun","");
			String numberValue = ServletRequestUtils.getStringParameter(request,"numberValue","");
			String taxtation_at = ServletRequestUtils.getStringParameter(request,"taxtation_at","");
			String maintn_ob = ServletRequestUtils.getStringParameter(request,"maintn_ob","");
			String message = ServletRequestUtils.getStringParameter(request,"message","");
			
			String gu_cd = ServletRequestUtils.getStringParameter(request,"gu_cd",userBean.getSIGU_CD());
			
			String mg_typ = ServletRequestUtils.getStringParameter(request,"mg_typ","");
			
			toDate = ServletRequestUtils.getStringParameter(request,"toDate",toDate);
			fromDate = ServletRequestUtils.getStringParameter(request,"fromDate",fromDate);
			
			objSearchBean.setGU_CODE(gu_cd);
			
			//2018-05-30
			if(gu_cd.equals("000"))
				objSearchBean.setGU_CODE("%");
			
			objSearchBean.setSECTION(section);
			objSearchBean.setTAX_SET(tax_set);
			objSearchBean.setBJ_CD(bj_cd);
			objSearchBean.setJUMYONGNAME(jumyongName);
			objSearchBean.setBONBUN(bonbun);
			objSearchBean.setBUBUN(bubun);
			objSearchBean.setNUMBERVALUE(numberValue);
			objSearchBean.setTAXTAXION_AT(taxtation_at);
			objSearchBean.setTODATE(removeDash(toDate));
			objSearchBean.setFROMDATE(removeDash(fromDate));
			objSearchBean.setMAINTN_OB(maintn_ob);
			objSearchBean.setMANAGE_TYP(mg_typ);
			
			//�Ϲ� �ڵ�.
			request.setAttribute("blist1",objJumyongService.retrieveBoardListExcel(objSearchBean));
			
			request.setAttribute("mg_typ", commonCode.executeGapanCode("MG_TYP", mg_typ, "��ü"));
			request.setAttribute("section", section);
			request.setAttribute("tax_set", tax_set);
			request.setAttribute("jumyongName", jumyongName);
			request.setAttribute("numberValue", numberValue);
			request.setAttribute("taxation_section", commonCode.executeCommonCode("taxation_section", objSearchBean.getTAX_SET(), "����"));
			request.setAttribute("taxtation_at", commonCode.executeCommonCode("taxtation_at", objSearchBean.getTAXTAXION_AT(), "����"));
			request.setAttribute("maintn_ob", commonCode.executeCommonCode("maintn_ob", objSearchBean.getMAINTN_OB(), "����"));
			request.setAttribute("gu_code", commonCode.executeGuCdList(userBean.getSIGU_CD(),gu_cd));	//	�ñ���
			request.setAttribute("bjdong_code", commonCode.CommonBJDongCodeSearch(SIDO_CD, userBean.getSIGU_CD(), objSearchBean.getBJ_CD()));	//	������
			request.setAttribute("bonbun", bonbun);
			request.setAttribute("bubun", bubun);
			
			request.setAttribute("message", message);
			request.setAttribute("toDate", toDate);
			request.setAttribute("fromDate", fromDate);
			request.setAttribute("thisDate", thisDate);
			request.setAttribute("YearVal", thisYear);
			
		}
	} catch(Exception e){
		e.printStackTrace();
	}
	
	return new ModelAndView("/rojum/jumyong/excel_search");
}


/////////////////////////////////////////////////////�󼼺��� ȭ�� ///////////////////////////////////////
public ModelAndView View(HttpServletRequest request,HttpServletResponse response) throws Exception 
{
	// ���� ����
	HttpSession session = request.getSession();
	String userId	= (String)session.getAttribute("sessionUserId");
	String 	GAPAN_NO 	= "";
	
	try{
		if(userId != null)
		{
			//	������ �����͸� �����´�.
			UserBean	userBean	= new UserBean();
			userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
			
			//		���ǿ��� �õ� �ڵ带 �����´�.
			String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
			
	
			 // ���⵵ ���
            Calendar cal = Calendar.getInstance();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            String thisDate = formatter.format(cal.getTime());
            String thisYear = thisDate.substring(0, 4);
            
            GAPAN_NO = ServletRequestUtils.getStringParameter(request, "GAPAN_NO", "");
			String cal_mode = ServletRequestUtils.getStringParameter(request, "cal_mode", "cal1");
			String section = ServletRequestUtils.getStringParameter(request,"section","1");
			String bj_cd = ServletRequestUtils.getStringParameter(request,"bj_cd","");
			String jumyongName = ServletRequestUtils.getStringParameter(request,"jumyongName","");
			String bonbun = ServletRequestUtils.getStringParameter(request,"bonbun","");
			String bubun = ServletRequestUtils.getStringParameter(request,"bubun","");
			String numberValue = ServletRequestUtils.getStringParameter(request,"numberValue","");
			String taxtation_at = ServletRequestUtils.getStringParameter(request,"taxtation_at","");
			String maintn_ob = ServletRequestUtils.getStringParameter(request,"maintn_ob","");
			String gu_cd = ServletRequestUtils.getStringParameter(request,"gu_cd",userBean.getSIGU_CD());
			String mg_typ = ServletRequestUtils.getStringParameter(request,"mg_typ","");
			String toDate = ServletRequestUtils.getStringParameter(request,"toDate","");
			String fromDate = ServletRequestUtils.getStringParameter(request,"fromDate","");
			
			
			//�Ϲ� �ڵ�.
			request.setAttribute("cal_mode", cal_mode);
			request.setAttribute("thisDate", thisDate);
			request.setAttribute("YearVal", thisYear);
			
			request.setAttribute("section", section);
			request.setAttribute("bj_cd", bj_cd);
			request.setAttribute("jumyongName", jumyongName);
			request.setAttribute("bonbun", bonbun);
			request.setAttribute("bubun", bubun);
			request.setAttribute("numberValue", numberValue);
			request.setAttribute("taxtation_at", taxtation_at);
			request.setAttribute("maintn_ob", maintn_ob);
			request.setAttribute("gu_cd", gu_cd);
			request.setAttribute("mg_typ", mg_typ); 
			request.setAttribute("toDate", toDate);
			request.setAttribute("fromDate", fromDate);
			
			

			String section_value = ((Map)objJumyongService.getSection(GAPAN_NO)).get("SECTION").toString();
			request.setAttribute("use_section", section_value);
			
	
		}
	}catch(Exception e){
		System.out.println("error:"+e.toString());
	}
	
	return new ModelAndView("/rojum/jumyong/view", "GAPAN_NO",GAPAN_NO);
	
	
}
//@	�ű� ��� ������
public ModelAndView Register(HttpServletRequest request,HttpServletResponse response) throws Exception 
{
	return new ModelAndView("/rojum/jumyong/register");
}

/////////////////////////////////////////////////////////////////////////////////////////////

//@ �ű� ��� ȭ�� ���
public	ModelAndView info_register(HttpServletRequest request, HttpServletResponse response) throws Exception
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
			
			request.setAttribute("mg_typ", commonCode.executeGapanCode("MG_TYP", null, "����"));
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
		}
		
	} catch(Exception e){
		System.out.println(e.toString());
	}
	
	return new ModelAndView("/rojum/jumyong/tab/info_register");
}



//@ �űԵ�� (�ο�, ������, �ü���)
public ModelAndView	info_registerPrc(HttpServletRequest request,HttpServletResponse response) throws Exception 
{
	System.out.println("info_registerPrc....");
	//GAPAN_BASE ���̺�  ���� �����Ͱ� �ִ��� Ȯ���Ѵ�. (������ �����ϰ� �����ڹ�ȣ�� �����Ѵ�.)
	String	GAPAN_NO	= Gapan_Base_Register_Execute(request, response);
	
	if(GAPAN_NO	!=	null)
	{
		//	������ �����͸� �����Ѵ�.
		Gapan_Head_Register_Execute(request, response, GAPAN_NO);
		
		System.out.println("info_registerPrc....2");
		
		//	�ü��� ������ �����Ѵ�.
		Gapan_Info_Register_Execute(request, response, GAPAN_NO);
	}

	System.out.println("info_registerPrc....3");
	request.setAttribute("menu_param", "jumyong");
	System.out.println("info_registerPrc....4");
	
	return new ModelAndView("/rojum/jumyong/registerPrc");
}

//@GAPAN_BASE ���
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
	
	
	String 	GAPAN_NO 	= objJumyongService.executeCheck_Gapanno(userBean.getSIGU_CD()+bj_cd);	//GAPAN_NO ����
	String 	MANAGER 	= ServletRequestUtils.getStringParameter(request, "MANAGER_MIN", "");
	String 	CLOSEDATE 	= ServletRequestUtils.getStringParameter(request, "CLOSE_DATE", "");
	String  USERID 		= util.getSessionID(request, "sessionUserId");
	
	GapanBaseBean	Bean	= new GapanBaseBean();
	
	Bean.setGAPAN_NO(GAPAN_NO);
	Bean.setREG_DATE(util.Date_Cut(REGDATE));
	Bean.setUP_DATE(util.Date_Cut(REGDATE));
	Bean.setMANAGER(MANAGER);
	Bean.setCLOSE_DATE(CLOSEDATE);
	Bean.setGP_TYPE("002");
	Bean.setFINISH_ID(USERID);
	
	//	ADMIN_BASE�� �����Ѵ�.
	objJumyongService.executeGapan_Base_Register(Bean);
	
	return	GAPAN_NO;
}

//@ ���� 	��� ����/������ ����
public String Gapan_Head_Register_Execute(HttpServletRequest request,HttpServletResponse response, String GAPAN_NO) throws Exception
{
	
	try{
		System.out.println("Gapan_Head_Register_Execute START");
	
		GapanHeadBean gapanHeadBean = new GapanHeadBean();
		bind(request, gapanHeadBean);
		

		//��� �ź��� Ȯ�� ����
		String OWNER_IDCHK = ServletRequestUtils.getStringParameter(request, "OWNER_IDCHK", "0");
		System.out.println(OWNER_IDCHK);

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
		boolean result = objJumyongService.executeGapan_Head_Register(gapanHeadBean);
		
		System.out.println("Gapan_Head_Register_Execute END result : "+result);
	
	}catch(Exception e){
		e.printStackTrace();
	}
	return "";
}

//@ ���� �ü� ����/��� ����
public String Gapan_Info_Register_Execute(HttpServletRequest request,HttpServletResponse response, String GAPAN_NO) throws Exception
{
	GapanInfoBean gapanInfoBean = new GapanInfoBean();
	
	bind(request, gapanInfoBean);
	
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
	
	String  manage_typ = ServletRequestUtils.getStringParameter(request, "MG_TYP", "");
	String  REG_DATE = ServletRequestUtils.getStringParameter(request, "REG_DATE", ""); 
	String  permit_date = ServletRequestUtils.getStringParameter(request, "PERMIT_DATE", "");
	String  mul_fromdate = ServletRequestUtils.getStringParameter(request, "MUL_FROMDATE", "");
	String  mul_todate = ServletRequestUtils.getStringParameter(request, "MUL_TODATE", "");
	String  special_date = ServletRequestUtils.getStringParameter(request, "SPECIAL_DATE", "");
	
	/* 2014.07. kny ����/�赵/���� ������ ���θ��ּ� �߰� */
	String with_doro_nm = ServletRequestUtils.getStringParameter(request, "WITH_DORO_NM", "");
	String with_bd_bon = ServletRequestUtils.getStringParameter(request, "WITH_BD_BON", "");
	String with_bd_bu = ServletRequestUtils.getStringParameter(request, "WITH_BD_BU", "");
	String jibun = ServletRequestUtils.getStringParameter(request, "JIBUN", "");
	
	gapanInfoBean.setWITH_DORO_NM(with_doro_nm);
	gapanInfoBean.setWITH_BD_BON(with_bd_bon);
	gapanInfoBean.setWITH_BD_BU(with_bd_bu);
	gapanInfoBean.setJIBUN(jibun);
	/*												*/
	
	gapanInfoBean.setGAPAN_NO(GAPAN_NO);
	gapanInfoBean.setMANAGE_TYP(manage_typ);
	
	gapanInfoBean.setPERMIT_DATE(util.Date_Cut(permit_date));	//�㰡����
	gapanInfoBean.setOPEN_TIME(open_time);						//�����ð�
	gapanInfoBean.setCLOSE_TIME(close_time);					//�����ð�
	
	/*
	 * WITH_DORO_NM
	 * WITH_BD_BON
	 * WITH_BD_BU
	 */
	
	if(manage_typ.equals("1")){ 		//��ġ����
		gapanInfoBean.setFOUND_DATE(util.Date_Cut(REG_DATE));
		gapanInfoBean.setPICKUP_DATE("");
		gapanInfoBean.setPICKUP_YN("0");
	}else if(manage_typ.equals("2")){ 	//��������
		gapanInfoBean.setFOUND_DATE("");
		gapanInfoBean.setPICKUP_DATE(util.Date_Cut(REG_DATE));   //��������
		gapanInfoBean.setPICKUP_YN("1");
		gapanInfoBean.setGUIDE_DATE("");
	}else{ 								//�赵 ����
		gapanInfoBean.setFOUND_DATE("");
		gapanInfoBean.setPICKUP_DATE("");
		gapanInfoBean.setPICKUP_YN("0");
		gapanInfoBean.setGUIDE_DATE(util.Date_Cut(REG_DATE));
	}
	
	
	
	gapanInfoBean.setGP_TYP("002");
	gapanInfoBean.setPURPOSE_CD("720");					//��������ڵ�(�������Ÿ�ü���)

	gapanInfoBean.setX_COORD(ServletRequestUtils.getStringParameter(request, "X_COORD", ""));			//�����߽���X��ǥ
	gapanInfoBean.setY_COORD(ServletRequestUtils.getStringParameter(request, "Y_COORD", ""));			//�����߽���Y��ǥ
	
	gapanInfoBean.setTYPE(ServletRequestUtils.getStringParameter(request, "TYPE", "1"));
	gapanInfoBean.setSECTION(ServletRequestUtils.getStringParameter(request, "SECTION", "1"));
	gapanInfoBean.setOWNER_SET(ServletRequestUtils.getStringParameter(request, "OWNER_SET", ""));
	gapanInfoBean.setTAX_SET(ServletRequestUtils.getStringParameter(request, "TAX_SET", ""));
	gapanInfoBean.setMUL_FROMDATE(util.Date_Cut(mul_fromdate));
	gapanInfoBean.setMUL_TODATE(util.Date_Cut(mul_todate));
	
	gapanInfoBean.setTAXTATION_AT(ServletRequestUtils.getStringParameter(request, "TAXTATION_AT", "0"));			//�����ΰ�
	
	gapanInfoBean.setSPECIAL_DATE(util.Date_Cut(special_date));
	
	//���Ͼ��ε� ����
	MultipartHttpServletRequest mpRequest = (MultipartHttpServletRequest) request;
	MultipartFile SHOP_IMG = mpRequest.getFile("SHOP_IMG");
	String SHOP_IMG_NAME = "";
	
	if (SHOP_IMG.getSize() > 0) {
		//********** BEGIN_����_20120402		
		//FileUploadUtil2.uploadFormFile(SHOP_IMG,Globals.IMAGEFILEUPLOADPATH_ROJUM);
		//SHOP_IMG_NAME = SHOP_IMG.getOriginalFilename();
		SHOP_IMG_NAME = FileUploadUtil2.uploadFormFile(SHOP_IMG,Globals.IMAGEFILEUPLOADPATH_ROJUM);
		//********** END_����_20120402
		gapanInfoBean.setSHOP_IMG_NAME(SHOP_IMG_NAME);
	}
	
	MultipartFile SHOP_IMG2 = mpRequest.getFile("SHOP_IMG2");
	String SHOP_IMG2_NAME = "";
	
	if (SHOP_IMG2.getSize() > 0) {
		//********** BEGIN_����_20120402
		//FileUploadUtil2.uploadFormFile(SHOP_IMG2,Globals.IMAGEFILEUPLOADPATH_ROJUM);
		//SHOP_IMG2_NAME = SHOP_IMG2.getOriginalFilename();
		SHOP_IMG2_NAME = FileUploadUtil2.uploadFormFile(SHOP_IMG2,Globals.IMAGEFILEUPLOADPATH_ROJUM);
		//********** END_����_20120402		
		gapanInfoBean.setSHOP_IMG2_NAME(SHOP_IMG2_NAME);
	}
	//********** BEGIN_KANG_20120416
	if(gapanInfoBean.getCAR_NO() != null && !(gapanInfoBean.getCAR_NO().equals(""))){
		gapanInfoBean.setCAR_NO(gapanInfoBean.getCAR_NO().replaceAll("%00", ""));
		gapanInfoBean.setCAR_NO(gapanInfoBean.getCAR_NO().replaceAll("%02", ""));
		gapanInfoBean.setCAR_NO(gapanInfoBean.getCAR_NO().replaceAll(" ", ""));
	}
	//********** END_KANG_20120416
	//	GAPAN_INFO  ���̺� �����Ѵ�.
	boolean result = objJumyongService.executeGapan_Info_Register(gapanInfoBean);
	
	return	"";
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
			
			String YEAR = ServletRequestUtils.getStringParameter(request,"YEAR","");
		    String[] ITEM_CHECK_ARR = request.getParameterValues("ITEM_CHECK");
            String[] GAPAN_NO_ARR = request.getParameterValues("GAPAN_NO");
            
            
            
            int listCount = 0;
            
            ArrayList productList = new ArrayList();
            
            for(int i = 0 ; i < ITEM_CHECK_ARR.length ; i++){
            	if(ITEM_CHECK_ARR[i].equals("true")){
            		ProductBean product = (ProductBean)objJumyongService.getBatchCalculationProductList(GAPAN_NO_ARR[i],YEAR);
            		listCount++;
            		productList.add(product);
            	}
            }
            
			request.setAttribute("taxation_part", commonCode.executeCommonCode("taxation_part", null, "����"));//	��������
			request.setAttribute("taxpayer_residence", commonCode.executeCommonCode("taxpayer_residence", null, "����"));//	���ֻ���
			request.setAttribute("object_type", commonCode.executeCommonCode("object_type", null, "����"));//	���Ǳ���
			request.setAttribute("taxpayer_group", commonCode.executeCommonCode("taxpayer_group", null, "����"));//	������ ����
			
			
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
            
            
            
            
		}
	} catch(Exception e){
		System.out.println("Batch cal ERROR");
		e.printStackTrace();
	}
	
	return new ModelAndView("/rojum/jumyong/batch_Cal1");
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////

// �ϰ��������� ����
public ModelAndView batch_cal1_prc(HttpServletRequest request,HttpServletResponse response) throws Exception {

	// 
	System.out.println("����� �Է��ϸ鼭 ���� ����Ǵ� �Լ�.!!!!!!!!");
	  // ���� ����
    HttpSession session = request.getSession();
    String userId = (String) session.getAttribute("sessionUserId");
    String param = "";
    String result_message = "";
    int failCnt = 0;
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

//            System.out.println("ADMIN_NO_ARR.length == " + ADMIN_NO_ARR.length);
            if (GAPAN_NO_ARR != null && !"".equals(GAPAN_NO_ARR)) {
                for (int i = 0; i < GAPAN_NO_ARR.length; i++) {
                    ProductBean objProductBean = new ProductBean();
                        int cal_sum_seq = 0;
                        int calculation_seq = 0;
//                        System.out.println("�ش翬�� ����� �� �ߺ�����***** " + objJunggiService.cal_sum_exist(ADMIN_NO_ARR[i], YEAR));
                        if (objJumyongService.cal_sum_exist(GAPAN_NO_ARR[i],YEAR) < 1) {
                        	
                        	// cal_sum_seq ���� ���� ��������
                            cal_sum_seq = objJumyongService.getCal_Sum_Seq();
                            

                            // System.out.println("************* ���밪 ���� start ****************");
                            // 1.2.3 ���밪 ����
                            objProductBean.setCAL_MODE("1");
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
                            

                            objProductBean.setBONSE(objProductBean.getSUM_ADJUST());			//	����
                            objProductBean.setINTAX(objProductBean.getSUM_ADJUST());			//	���⳻�ݾ�
                            objProductBean.setOVERTAX(OVERTAX_ARR[i]);		//	�����ıݾ�
            				objProductBean.setSISE(objProductBean.getSUM_ADJUST());			//	�ü�
            				objProductBean.setGUSE("0");			//	����
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
        					GapanBaseBean bean = new GapanBaseBean();
        					bean.setFINISH_ID(userId);
        					bean.setGAPAN_NO(GAPAN_NO_ARR[i]);

        					objJumyongService.GapanBaseUpdate(bean);

                            

                        }else {
                        	// �ߺ����� true end
                            failCnt++;
                            failNo += "'" + GAPAN_NO_ARR[i] + ", ";
                        }
                    }// for�� end

            }
        

    } 
    }catch (Exception e) {
        System.out.println(e.toString());
        result_message = e.toString();// "����� ���⿡�� ������ �߻� ";
    }

    if (result_message == null || "".equals(result_message)) {

        if (failCnt > 0) {
            result_message = "�̹� ����� ������� " + failCnt + "�� �ֽ��ϴ�. �� ���� �Ǹ� ����Ǿ����ϴ�. ";
        } else {
            result_message = "����Ǿ����ϴ�. ";
        }

    }

    System.out.println("result_message== " + result_message);
    return new ModelAndView("redirect:/rojum/jumyong/search.do?&message=" + result_message);
}




	
	
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
				String 	gapanNo 	= ServletRequestUtils.getStringParameter(request, "GAPAN_NO", "");
				String year = ServletRequestUtils.getStringParameter(request, "year", "");
						
				System.out.println(gapanNo);
				System.out.println(year);											
				
				//���� ��¥ 
				Calendar  cal2  =  Calendar.getInstance();		
				SimpleDateFormat  sdf  =  new SimpleDateFormat("yyyy");      // ������ ��� ���� ����
				String  toDate  =  sdf.format (cal2.getTime());      // ���� ��¥ ������ ����
				System.out.println("�������� ��ȸ~!!!");
				try
				{
					Map a = objJumyongService.get_Price(gapanNo);
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
		
		return new ModelAndView("/rojum/jumyong/officialLandPrice" );
	}
	
	
	
	public ModelAndView 	dlg_batch_cal1(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		// ���� ����
			HttpSession session = request.getSession();
			String userId	= (String)session.getAttribute("sessionUserId");
			String 	YearVal 	= ServletRequestUtils.getStringParameter(request, "YearVal", "");
			request.setAttribute("YearVal", YearVal);
			
		return new ModelAndView("/rojum/jumyong/dlg_batchCal1" );
		

	}
	
	//	�̷��������� 
	public ModelAndView history_info(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		// ���� ����
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		String GAPAN_NO 	= "";
		
		try{
			if(userId != null)
			{		
				GAPAN_NO = ServletRequestUtils.getStringParameter(request, "GAPAN_NO", "");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return new ModelAndView("/rojum/jumyong/history_info", "GAPAN_NO",GAPAN_NO);
	}
	
	//	�̷��������� 
	public ModelAndView owner_history(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		// ���� ����
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		String GAPAN_NO 	= "";
		String SEARCH = "";
		List list = null;
		
		System.out.println("owner_history");
		
		try{
			if(userId != null)
			{		
		
				GAPAN_NO = ServletRequestUtils.getStringParameter(request, "GAPAN_NO", "");
				SEARCH	= ServletRequestUtils.getStringParameter(request, "SEARCH", "N");

				//	������ �����͸� �����´�.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
				
				//�Ϲ� �ڵ�.
				list = objJumyongService.executeGapan_Head(GAPAN_NO);
				GapanHeadBean jumin = (GapanHeadBean)list.get(0);
				String OWNER_NAME = jumin.getOWNER_NAME();
				String SSN = jumin.getOWNER_SSN().replace("-","").substring(0,13);
				String GU_CD = GAPAN_NO.substring(0,3);
				//********** BEGIN_KANG_20120416
				List list2 = objJumyongService.executeGapan_Info(GAPAN_NO);
				GapanInfoBean carinfo = (GapanInfoBean)list2.get(0);
				String FT_SEL = carinfo.getFT_SEL();				
				String CAR_NO = "";
				
				if(FT_SEL.equals("214")){
					CAR_NO = carinfo.getCAR_NO();	
				}				
				
				System.out.println("CAR_NO : " + CAR_NO);
				System.out.println("FT_SEL : " + FT_SEL);
				//********** END_KANG_20120416
				if(SEARCH.equals("N")){
					// ����� ����
					list = objJumyongService.executeJumyongInfo(OWNER_NAME,SSN,GU_CD);
					request.setAttribute("JumyongList", list); 
					//���� ����
					//********** BEGIN_KANG_20120416
					//list = objJumyongService.executePickupInfo(OWNER_NAME,SSN,GU_CD);
					if(CAR_NO == null || CAR_NO.equals("")){
						list = objJumyongService.executePickupInfo(OWNER_NAME,SSN,GU_CD);
					}else{					
						list = objJumyongService.executePickupInfo(OWNER_NAME,SSN,GU_CD,CAR_NO);
					}
					//********** END_KANG_20120416					
					request.setAttribute("PickupList", list);
					//�赵 ����
					//********** BEGIN_KANG_20120416
					//list = objJumyongService.executeGuideInfo(OWNER_NAME,SSN,GU_CD);
					if(CAR_NO == null || CAR_NO.equals("")){
						list = objJumyongService.executeGuideInfo(OWNER_NAME,SSN,GU_CD);
					}else{					
						list = objJumyongService.executeGuideInfo(OWNER_NAME,SSN,GU_CD,CAR_NO);
					}
					//********** END_KANG_20120416
					System.out.println("list.size : " + list.size());
					
					request.setAttribute("GuideList", list);
					//��� / �Ű� ����
					list = objJumyongService.executeSaleInfo(OWNER_NAME,SSN,GU_CD);
					request.setAttribute("SaleList", list);
					
					//��� ����
					list = objJumyongService.executeAccuseInfo(OWNER_NAME,SSN,GU_CD);
					request.setAttribute("AccuseList", list);
					
					//�������� ����
					list = objJumyongService.executeChangeJobInfo(OWNER_NAME,SSN,GU_CD);
					request.setAttribute("ChangeJobList", list);
				
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return new ModelAndView("/rojum/jumyong/owner_history", "GAPAN_NO",GAPAN_NO);
		

	}
	
	
//	��ȯó��
	public ModelAndView 	returnProduct(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		// ���� ����
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		String GAPAN_NO 	= "";
		String param = "";

		
		try{
			if(userId != null)
			{
				String section = ServletRequestUtils.getStringParameter(request,"View_Disuse","1");
				String tax_set = ServletRequestUtils.getStringParameter(request,"TAX_SET","0");
				String bj_cd = ServletRequestUtils.getStringParameter(request,"BJ_CD","");
				String bonbun = ServletRequestUtils.getStringParameter(request,"BONBUN","");
				String bubun = ServletRequestUtils.getStringParameter(request,"BUBUN","");
				String jumyongName = ServletRequestUtils.getStringParameter(request,"jumyongName","");
				String numberValue = ServletRequestUtils.getStringParameter(request,"numberValue","");
				String taxtation_at = ServletRequestUtils.getStringParameter(request,"taxtation_at","");
				String fromDate = ServletRequestUtils.getStringParameter(request,"fromDate","");
				String toDate = ServletRequestUtils.getStringParameter(request,"toDate","");
				String maintn_ob = ServletRequestUtils.getStringParameter(request,"MAINTN_OB","");
				
				param = "&section="+section+"&tax_set="+tax_set+"&bj_cd="+bj_cd+"&bonbun="+bonbun+"&bubun="+bubun
				   +"&jumyongName="+jumyongName+"&numberValue="+numberValue+"&taxtation_at="+taxtation_at
				   +"&fromDate="+fromDate+"&toDate="+toDate+"&maintn_ob="+maintn_ob;
				
				
				String returnDate = ServletRequestUtils.getStringParameter(request,"ReturnDate","");
				String[] ITEM_CHECK_ARR = request.getParameterValues("ITEM_CHECK");
		        String[] GAPAN_NO_ARR = request.getParameterValues("GAPAN_NO");
		            
		        int listCount = 0;
		            
		        
		        for(int i = 0 ; i < ITEM_CHECK_ARR.length ; i++){
		        	if(ITEM_CHECK_ARR[i].equals("true")){
		        		objJumyongService.executeReturnProduct(GAPAN_NO_ARR[i],removeDash(returnDate));
		        		listCount++;
		        		
		        		 // ADMIN_BASE ������Ʈ ��¥ ����
    					GapanBaseBean bean = new GapanBaseBean();
    					bean.setFINISH_ID(userId);
    					bean.setGAPAN_NO(GAPAN_NO_ARR[i]);

    					objJumyongService.GapanBaseUpdate(bean);
	            	}
	            }
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return new ModelAndView("redirect:/rojum/jumyong/search.do?&message=" + "��ȯó���Ǿ����ϴ�."+param);
	}
	
//	�̷��������� 
	public ModelAndView 	owner_list(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		// ���� ����
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		String owner_name = "";
		String mode = "";
		
		try{
			if(userId != null)
			{		
				owner_name = ServletRequestUtils.getStringParameter(request,"OWNER_NAME","");
				mode  = ServletRequestUtils.getStringParameter(request,"mode");
				
				request.setAttribute("mode", mode);
				if(mode.equals("short")){
					request.setAttribute("target_name", ServletRequestUtils.getStringParameter(request,"target_name"));
					request.setAttribute("target_ssn", ServletRequestUtils.getStringParameter(request,"target_ssn"));
				}
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return new ModelAndView("/rojum/jumyong/owner_list", "OwnerList",objJumyongService.executeOwnerList(owner_name));
	}
	
	
	//�ϰ� ���/ �Ű� ó��
	public ModelAndView batch_destroy_prc(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		//���� ����
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		SearchBean objSearchBean = null;
		String param = "";
		
		SaleBean objSaleBean = new SaleBean();
			
		try{
			if(userId != null)
			{
				String section = ServletRequestUtils.getStringParameter(request,"View_Disuse","1");
				String tax_set = ServletRequestUtils.getStringParameter(request,"TAX_SET","0");
				String bj_cd = ServletRequestUtils.getStringParameter(request,"BJ_CD","");
				String bonbun = ServletRequestUtils.getStringParameter(request,"BONBUN","");
				String bubun = ServletRequestUtils.getStringParameter(request,"BUBUN","");
				String jumyongName = ServletRequestUtils.getStringParameter(request,"jumyongName","");
				String numberValue = ServletRequestUtils.getStringParameter(request,"numberValue","");
				String taxtation_at = ServletRequestUtils.getStringParameter(request,"taxtation_at","");
				String fromDate = ServletRequestUtils.getStringParameter(request,"fromDate","");
				String toDate = ServletRequestUtils.getStringParameter(request,"toDate","");
				String maintn_ob = ServletRequestUtils.getStringParameter(request,"MAINTN_OB","");
				
				
				param = "&section="+section+"&tax_set="+tax_set+"&bj_cd="+bj_cd+"&bonbun="+bonbun+"&bubun="+bubun
							   +"&jumyongName="+jumyongName+"&numberValue="+numberValue+"&taxtation_at="+taxtation_at
							   +"&fromDate="+fromDate+"&toDate="+toDate+"&maintn_ob="+maintn_ob;
				//�Ϲ� �ڵ� ��	
				
				
				//��� �Ű�
				bind(request, objSaleBean);
				
				String[] GAPAN_NO_ARR = request.getParameterValues("GAPAN_NO");
				String[] SALE_STATUS_ARR = request.getParameterValues("SALE_STATUS_ARR");
				String[] ITEM_CHECK_ARR = request.getParameterValues("ITEM_CHECK");
				
				String desType = ServletRequestUtils.getStringParameter(request,"desType","");
				String SALE_STATUS = ServletRequestUtils.getStringParameter(request,"SALE_STATUS","");
				
				
				
				objSaleBean.setHND_DESDATE(removeDash(objSaleBean.getHND_DESDATE()));
				objSaleBean.setHND_OPEDATE(removeDash(objSaleBean.getHND_OPEDATE()));
				objSaleBean.setSALE_DATE(removeDash(objSaleBean.getSALE_DATE()));
				
				
				
				if(desType.equals("Progress")){
					System.out.println(":::::::::::Progress::::::::::");
					for(int i = 0 ; i < ITEM_CHECK_ARR.length ; i++){
			        	if(ITEM_CHECK_ARR[i].equals("true")){
			        		objSaleBean.setGAPAN_NO(GAPAN_NO_ARR[i]);
			        		objSaleBean.setSALE_STATUS(SALE_STATUS);
							objJumyongService.ExecuteSale_Register(objSaleBean);
							
							 // ADMIN_BASE ������Ʈ ��¥ ����
        					GapanBaseBean bean = new GapanBaseBean();
        					bean.setFINISH_ID(userId);
        					bean.setGAPAN_NO(GAPAN_NO_ARR[i]);
        					objJumyongService.GapanBaseUpdate(bean);
		            	}
		            }
				}else if(desType.equals("Complete")){
					System.out.println(":::::::::::Complete::::::::::");
					for(int i = 0 ; i < ITEM_CHECK_ARR.length ; i++){
			        	if(ITEM_CHECK_ARR[i].equals("true")){
			        		objSaleBean.setGAPAN_NO(GAPAN_NO_ARR[i]);
							objSaleBean.setSALE_STATUS(String.valueOf(Integer.parseInt(SALE_STATUS_ARR[i])+2));
							objJumyongService.UpdateSale_Register(objSaleBean);
							
							 // ADMIN_BASE ������Ʈ ��¥ ����
        					GapanBaseBean bean = new GapanBaseBean();
        					bean.setFINISH_ID(userId);
        					bean.setGAPAN_NO(GAPAN_NO_ARR[i]);
        					objJumyongService.GapanBaseUpdate(bean);
		            	}
		            }
				}

			}
		} catch(Exception e){
			System.out.println(e.toString());
		}
		
		return new ModelAndView("redirect:/rojum/jumyong/search.do?&message=" + "���/�Ű� �ϰ�ó���� �Ϸ�Ǿ����ϴ�."+param);
	}
	
	
	//�ϰ� ���/ �Ű� ó��
	public ModelAndView getTaxCodeInfo(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
				String TAX_SET = ServletRequestUtils.getStringParameter(request,"TAX_SET");
				String TAX_CD = ServletRequestUtils.getStringParameter(request,"TAX_CD");
		
		List 		list		= null;

		
		if(userId != null)
		{
			String	Xml	= "<?xml version='1.0' encoding='utf-8'?>";
			Xml	+= "<ROOT>";
			
			list = objJumyongService.ExecuteTaxCodeInfo(TAX_SET,TAX_CD);
			TaxCodeBean Bean = new TaxCodeBean();
		
			for(int	i = 0	;	i < list.size()	;	i++)
			{
				Bean	= (TaxCodeBean)list.get(i);
				Xml	+= XmlNodeMake2(Bean.getTAXNAME(), Bean.getTAXCODE());
			}
			
			Xml	+= "</ROOT>";

	        response.setContentType("text/html;charset=EUC-KR");
	        response.setHeader("Cache-Control", "no-cache");
	        response.getWriter().write(Xml);
		}
		return null;	
	}
	
//	XML ��� ����
	public	String	XmlNodeMake2(String Label, String Value)
	{
		String	XML	= "";
		
		XML	= "<option label='" + Label + "'\t value='"+Value+"'/>\n";
		
		return	XML;
	}
	
	/**
   	 * DateFormat ����
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
