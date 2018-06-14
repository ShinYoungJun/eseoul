//	2009		Kim Yun Seo

package main.java.facility.adminbiz.web;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.Servlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.common.commonCode.model.UserBean;
import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.util.catUtil.Pageing;
import main.java.common.util.catUtil.Util;
import main.java.facility.adminbiz.model.AdminBizBean;
import main.java.facility.adminbiz.service.IAdminBizService;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;


public class AdminBizControl	 extends MultiActionController {

	private	IAdminBizService		iAdminBizService	= null;
	private	CommonCodeService	commonCode		= null;
	private	Util				util			= new Util();
	private	Pageing				pageing			= new Pageing();
	
	
	public void setFacility_adminbizService(IAdminBizService facility_adminbizService) 
	{
		this.iAdminBizService = facility_adminbizService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode) 
	{
		this.commonCode 	= commonCode;
	}
//	민원조회 검색 및 리스트
	public ModelAndView 	Search(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");		
				
		UserBean	userBean	= new UserBean();		 
		userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
		String gu_code	= userBean.getSIGU_CD().substring(0, 3);
		List		list	= null;
		int count = 0;
		int	 	currentPage	 = 1;
		
		String currentPageStr = ServletRequestUtils.getStringParameter(request, "currentPage", "1");
		
		if(currentPageStr != null && !currentPageStr.equals("")){		
			System.out.println("error"+currentPageStr);
			currentPage	= Integer.parseInt(currentPageStr);
		}
		System.out.println("currentPaGE : "+currentPage);
		
		String adminBiz = ServletRequestUtils.getStringParameter(request, "adminBiz", "");
		String MIN_NAME = ServletRequestUtils.getStringParameter(request, "MIN_NAME", "");
		
		
		Object obj_adminBiz = request.getAttribute("obj_adminBiz");
		Object obj_MIN_NAME = request.getAttribute("obj_MIN_NAME");
		
		//삭제 후 리스트의 검색조건을 동일하게 표출하기 위한 조건들 
		if(obj_adminBiz != null && !obj_adminBiz.equals("")) adminBiz = obj_adminBiz.toString();		
		if(obj_MIN_NAME != null && !obj_MIN_NAME.equals("")) MIN_NAME = obj_MIN_NAME.toString();
		
		
		int pageSize = 10;
		
		int startPage = (currentPage-1)*pageSize+1;
		int endPage = currentPage*pageSize ;
		
		try{
			
			if(userId != null){
				list = iAdminBizService.adminBizSearch(adminBiz,MIN_NAME,gu_code,startPage,endPage);
				count = iAdminBizService.adminBizSearchCount(adminBiz, MIN_NAME, gu_code);
				
				
				AdminBizBean bean = new AdminBizBean();	
				bean = (AdminBizBean)list.get(0);
			
				pageing.execute(request, count, currentPage, pageSize);
				
			}
		}catch(Exception e){
			
			
		}
		
		request.setAttribute("adminBiz", adminBiz);
		request.setAttribute("MIN_NAME", MIN_NAME);
		request.setAttribute("totalcnt", count);
				
		return new ModelAndView("/facility/adminbiz/search", "blist", list);
	}
	
	public ModelAndView 	View(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");	
		AdminBizBean bean = new AdminBizBean();

		String corp_cd = ServletRequestUtils.getStringParameter(request, "CORP_CD","");
		String currentPage = ServletRequestUtils.getStringParameter(request, "currentPage","1");
		String adminBiz = ServletRequestUtils.getStringParameter(request, "adminBiz", "");
		String MIN_NAME = ServletRequestUtils.getStringParameter(request, "MIN_NAME", "");
		
		String gu_code	= "";
		
		Object obj_corp = request.getAttribute("modify_corp");
		Object obj_current = request.getAttribute("modify_current");
		Object obj_adminBiz = request.getAttribute("obj_adminBiz");
		Object obj_MIN_NAME = request.getAttribute("obj_MIN_NAME");
		
		//관리업체를 수정한 뒤에  ModifyPrc() 메소드 에서 값을 보낼때 해당 변수에 치환  
		if(obj_corp != null && !obj_corp.equals("")) corp_cd = obj_corp.toString();		
		if(obj_current != null && !obj_current.equals("")) currentPage = obj_current.toString();

		//수정후 리스트의 검색조건을 동일하게 표출하기 위한 조건들 
		if(obj_adminBiz != null && !obj_adminBiz.equals("")) adminBiz = obj_adminBiz.toString();		
		if(obj_MIN_NAME != null && !obj_MIN_NAME.equals("")) MIN_NAME = obj_MIN_NAME.toString();
		
		try{
			
			if(userId != null){
		
				UserBean	userBean	= new UserBean();		 
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				gu_code	= userBean.getSIGU_CD().substring(0, 3);
				
				bean = iAdminBizService.adminBizView(gu_code, corp_cd);
				
//				if(bean.getSPC_CD() != null && bean.getSPC_CD().equals("1")){
//					bean.setSPC_CD(" 산 ");				
//				}else{
//					bean.setSPC_CD("");
//				}
//				
//				if(bean.getTO_SPC_CD() != null && bean.getTO_SPC_CD().equals("1")){
//					bean.setTO_SPC_CD(" 산 ");				
//				}else{
//					bean.setTO_SPC_CD("");
//				}
			}
			
		}catch(Exception e){
			
		}
		request.setAttribute("adminBiz", adminBiz);
		request.setAttribute("MIN_NAME", MIN_NAME);
		
		request.setAttribute("currentPage",currentPage);
		request.setAttribute("GU_CODE", gu_code);
		request.setAttribute("CORP_CD", corp_cd);
		
		return new ModelAndView("/facility/adminbiz/view", "board", bean);
	}
	
	public ModelAndView 	Register(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		UserBean	userBean	= new UserBean();		 
		userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
		String gu_code	= userBean.getSIGU_CD().substring(0, 3);
		List list = null;
		
		try{			
			if(userBean!=null){
				list = iAdminBizService.adminBizCompanyList(gu_code);				
				System.out.println(list.size());
			}		
		}catch(Exception e){
			System.out.println("Register 에러 : " + e);
		}
		
		request.setAttribute("mul_spc_cd", commonCode.executeCommonCode("MUL_SPC_CD", null, "선택"));
		request.setAttribute("mul_to_spc_cd", commonCode.executeCommonCode("MUL_TO_SPC_CD", null, "선택"));
		
		return new ModelAndView("/facility/adminbiz/register","companyList",list);
	}
	
	//********** BEGIN_KANG_20120409
	public ModelAndView office(HttpServletRequest request, HttpServletResponse response)  throws Exception {
		UserBean	userBean	= new UserBean();		 
		userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
		String gu_code	= userBean.getSIGU_CD().substring(0,3);
		
		try {
			String office = ServletRequestUtils.getStringParameter(request, "office", "");
			
			String officeList = commonCode.executeOfficeList(gu_code,office);
				
			response.setContentType("text/html;charset=EUC-KR");
			response.setHeader("Cache-Control", "no-cache");
			response.getWriter().write(officeList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	//********** END_KANG_20120409

	
	public ModelAndView 	RegisterPrc(HttpServletRequest request, HttpServletResponse response) throws Exception {

		
		UserBean	userBean	= new UserBean();		 
		userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
		String gu_code	= userBean.getSIGU_CD().substring(0, 3);
		
		
		
		String selectCompany = ServletRequestUtils.getStringParameter(request, "selectCompany",""); //기존업체 및 새 업체 등록여부
		String NAME = ServletRequestUtils.getStringParameter(request, "NAME","");  // 업체 이름
		String jumin_ssn1 = ServletRequestUtils.getStringParameter(request, "jumin_ssn1","");   //주민(법인)번호
		String jumin_ssn2 = ServletRequestUtils.getStringParameter(request, "jumin_ssn2","");  
		String TOPOST_NM = ServletRequestUtils.getStringParameter(request, "TOPOST_NM","");   //대표자명
		String jumin_bizssn1 = ServletRequestUtils.getStringParameter(request, "jumin_bizssn1","");   //사업자 등록번호
		String jumin_bizssn2 = ServletRequestUtils.getStringParameter(request, "jumin_bizssn2",""); 
		String jumin_bizssn3 = ServletRequestUtils.getStringParameter(request, "jumin_bizssn3",""); 
		String BON_POST = ServletRequestUtils.getStringParameter(request, "BON_POST",""); //점용인 주소

		String BON_ADDR2 = ServletRequestUtils.getStringParameter(request, "ADDR2","");
		String LNBR1 = ServletRequestUtils.getStringParameter(request, "LNBR1","");//지번
		String LNBR2 = ServletRequestUtils.getStringParameter(request, "LNBR2","");
		String BIZ_STATUS = ServletRequestUtils.getStringParameter(request, "BIZ_STATUS",""); //업태
		String BIZ_TYPES = ServletRequestUtils.getStringParameter(request, "BIZ_TYPES",""); //종목
		String TO_POST = ServletRequestUtils.getStringParameter(request, "TO_POST",""); //송달지 주소

		String TO_ADDR2 = ServletRequestUtils.getStringParameter(request, "TOADDR2","");
		String TO_LNBR1 = ServletRequestUtils.getStringParameter(request, "TO_LNBR1","");//송달지 지번
		String TO_LNBR2= ServletRequestUtils.getStringParameter(request, "TO_LNBR2","");
		String OFFICE = ServletRequestUtils.getStringParameter(request, "OFFICE",""); //지점명
		String MANAGER = ServletRequestUtils.getStringParameter(request, "MANAGER",""); //담당자명
		String jumin_tel1 = ServletRequestUtils.getStringParameter(request, "jumin_tel1",""); //전화번호
		String jumin_tel2 = ServletRequestUtils.getStringParameter(request, "jumin_tel2",""); 
		String jumin_tel3 = ServletRequestUtils.getStringParameter(request, "jumin_tel3",""); 
		String TEL_EXT = ServletRequestUtils.getStringParameter(request, "TEL_EXT",""); //내선
		String jumin_fax1 = ServletRequestUtils.getStringParameter(request, "jumin_fax1",""); //팩스
		String jumin_fax2 = ServletRequestUtils.getStringParameter(request, "jumin_fax2",""); 
		String jumin_fax3 = ServletRequestUtils.getStringParameter(request, "jumin_fax3","");
		String jumin_hp1 = ServletRequestUtils.getStringParameter(request, "jumin_hp1","");  //휴대전화
		String jumin_hp2 = ServletRequestUtils.getStringParameter(request, "jumin_hp2","");
		String jumin_hp3 = ServletRequestUtils.getStringParameter(request, "jumin_hp3","");
				
		String SPC_CD = ServletRequestUtils.getStringParameter(request, "SPC_CD","");
		String TO_SPC_CD = ServletRequestUtils.getStringParameter(request, "TO_SPC_CD","");
		
		String SI = ServletRequestUtils.getStringParameter(request, "SI","");
		String GUN = ServletRequestUtils.getStringParameter(request, "GUN","");
		String DONG = ServletRequestUtils.getStringParameter(request, "DONG","");
		String RI = ServletRequestUtils.getStringParameter(request, "RI","");
		String DORO_NM = ServletRequestUtils.getStringParameter(request, "ROAD_ADDR","");
		String BD_BON = ServletRequestUtils.getStringParameter(request, "ROAD_BON","");
		String BD_BU = ServletRequestUtils.getStringParameter(request, "ROAD_BU","");
		String BD_NM = ServletRequestUtils.getStringParameter(request, "BD_NM","");
		String BD_DET_NM = ServletRequestUtils.getStringParameter(request, "BD_DET_NM","");
		
		String TOSI = ServletRequestUtils.getStringParameter(request, "TOSI","");
		String TOGUN = ServletRequestUtils.getStringParameter(request, "TOGUN","");
		String TODONG = ServletRequestUtils.getStringParameter(request, "TODONG","");
		String TORI = ServletRequestUtils.getStringParameter(request, "TORI","");
		String TO_DORO_NM = ServletRequestUtils.getStringParameter(request, "TO_DORO_NM","");
		String TO_BD_BON = ServletRequestUtils.getStringParameter(request, "TO_BD_BON","");
		String TO_BD_BU = ServletRequestUtils.getStringParameter(request, "TO_BD_BU","");
		String TO_BD_NM = ServletRequestUtils.getStringParameter(request, "TO_BD_NM","");
		String TO_BD_DET_NM = ServletRequestUtils.getStringParameter(request, "TO_BD_DET_NM","");
		
		String ADDR_CHECK = ServletRequestUtils.getStringParameter(request, "ADDR_CHECK","");

		// hoban
		String BON_ADDR1 = SI+" "+GUN+" "+DONG+" "+RI; //주소
		String TO_ADDR1 = TOSI+" "+TOGUN+" "+TODONG+" "+TORI; 
		String SANGSE = ServletRequestUtils.getStringParameter(request, "SANGSE","");
		String TOSANGSE = ServletRequestUtils.getStringParameter(request, "TOSANGSE","");

		AdminBizBean bean = new AdminBizBean();
		
		bean.setSI(SI);
		bean.setGUN(GUN);
		bean.setDONG(DONG);
		bean.setRI(RI);
		bean.setROAD_ADDR(DORO_NM);
		bean.setROAD_BON(BD_BON);
		bean.setROAD_BU(BD_BU);
		bean.setBD_NM(BD_NM);
		bean.setBD_DET_NM(BD_DET_NM);

		bean.setTOSI(TOSI);
		bean.setTOGUN(TOGUN);
		bean.setTODONG(TODONG);
		System.out.println("hoban : bean.setTODONG = "+TODONG);
		bean.setTORI(TORI);
		bean.setTO_DORO_NM(TO_DORO_NM);
		bean.setTO_BD_BON(TO_BD_BON);
		bean.setTO_BD_BU(TO_BD_BU);
		bean.setTO_BD_NM(TO_BD_NM);
		bean.setTO_BD_DET_NM(TO_BD_DET_NM);

		bean.setGU_CODE(gu_code);
		bean.setNAME(NAME);
		bean.setSSN(jumin_ssn1+jumin_ssn2);
		bean.setTOPOST_NM(TOPOST_NM);
		bean.setBIZSSN(jumin_bizssn1+jumin_bizssn2+jumin_bizssn3);
		bean.setPOST(BON_POST);
		bean.setADDR1(BON_ADDR1);
		bean.setADDR2(BON_ADDR2);
		bean.setBIZ_STATUS(BIZ_STATUS);
		bean.setBIZ_TYPES(BIZ_TYPES);
		bean.setTOPOST(TO_POST);
		bean.setTOADDR1(TO_ADDR1);
		bean.setTOADDR2(TO_ADDR2);
		bean.setOFFICE(OFFICE);
		bean.setMANAGER(MANAGER);
		if(jumin_tel1 != null && !jumin_tel1.equals("")) bean.setTOTEL(jumin_tel1+"-"+jumin_tel2+"-"+jumin_tel3);
		bean.setTOTEL_EXT(TEL_EXT);
		if(jumin_fax1 != null && !jumin_fax1.equals("")) bean.setTOFAX(jumin_fax1+"-"+jumin_fax2+"-"+jumin_fax3);
		if(jumin_hp1 != null && !jumin_hp1.equals("")) bean.setTOHP(jumin_hp1+"-"+jumin_hp2+"-"+jumin_hp3);
		bean.setLNBR1(LNBR1);
		bean.setLNBR2(LNBR2);
		bean.setTO_LNBR1(TO_LNBR1);
		bean.setTO_LNBR2(TO_LNBR2);
		bean.setSPC_CD(SPC_CD);
		bean.setTO_SPC_CD(TO_SPC_CD);
		
		bean.setADDR_CHECK(ADDR_CHECK);
		
		System.out.println("===========================================");
		System.out.println("gu_code = "+gu_code);
		System.out.println("NAME = "+NAME);
		System.out.println("jumin_ssn1+jumin_ssn2 = "+jumin_ssn1+jumin_ssn2);
		System.out.println("TOPOST_NM = "+TOPOST_NM);
		System.out.println("jumin_bizssn1+jumin_bizssn2+jumin_bizssn3 = "+jumin_bizssn1+jumin_bizssn2+jumin_bizssn3);
		System.out.println("===========================================");
		System.out.println("BON_POST = "+BON_POST);
		System.out.println("BON_ADDR1 = "+BON_ADDR1);
		System.out.println("BON_ADDR2 = "+BON_ADDR2);
		System.out.println("BIZ_STATUS = "+BIZ_STATUS);
		System.out.println("BIZ_TYPES = "+BIZ_TYPES);
		System.out.println("===========================================");
		System.out.println("TO_POST = "+TO_POST);
		System.out.println("TO_ADDR1 = "+TO_ADDR1);
		System.out.println("TO_ADDR2 = "+TO_ADDR2);
		System.out.println("OFFICE = "+OFFICE);
		System.out.println("MANAGER = "+MANAGER);
		System.out.println("===========================================");
		System.out.println("jumin_tel1+\"-\"+jumin_tel2+\"-\"+jumin_tel3 = "+jumin_tel1+"-"+jumin_tel2+"-"+jumin_tel3);
		System.out.println("TEL_EXT = "+TEL_EXT);
		System.out.println("jumin_fax1+\"-\"+jumin_fax2+\"-\"+jumin_fax3 = "+jumin_fax1+"-"+jumin_fax2+"-"+jumin_fax3);
		System.out.println("jumin_hp1+\"-\"+jumin_hp2+\"-\"+jumin_hp3 = "+jumin_hp1+"-"+jumin_hp2+"-"+jumin_hp3);
		System.out.println("LNBR1 = "+LNBR1);
		System.out.println("===========================================");
		System.out.println("LNBR2 = "+LNBR2);
		System.out.println("TO_LNBR1 = "+TO_LNBR1);
		System.out.println("TO_LNBR2 = "+TO_LNBR2);
		System.out.println("SPC_CD = "+SPC_CD);
		System.out.println("TO_SPC_CD = "+TO_SPC_CD);
		System.out.println("===========================================");
		System.out.println("SI = "+SI);	
		System.out.println("GUN = "+GUN);	
		System.out.println("DONG = "+DONG);	
		System.out.println("SANGSE = "+SANGSE);	
		System.out.println("TOSI = "+TOSI);	
		System.out.println("TOGUN = "+TOGUN);	
		System.out.println("TODONG = "+TODONG);	
		System.out.println("TOSANGSE = "+TOSANGSE);	
		System.out.println("RI = "+RI);	
		System.out.println("BD_NM = "+BD_NM);	
		System.out.println("BD_DET_NM = "+BD_DET_NM);	
		System.out.println("TORI = "+TORI);	
		System.out.println("TO_DORO_NM = "+TO_DORO_NM);	
		System.out.println("TO_BD_BON = "+TO_BD_BON);	
		System.out.println("TO_BD_BU = "+TO_BD_BU);	
		System.out.println("TO_BD_NM = "+TO_BD_NM );	
		System.out.println("TO_BD_DET_NM = "+TO_BD_DET_NM);	
		System.out.println("===========================================");
		
		String arrayCompany[] = selectCompany.split("/");

		selectCompany = arrayCompany[0].toString();
		
		try{
				if(selectCompany.equals("99")){					
					
					String office_cd_str  = iAdminBizService.maxOffice_cd(gu_code);
					//********** BEGIN_KANG_20120409
					if(office_cd_str.length() == 1){
						office_cd_str = "0" + office_cd_str;
					}
					//********** END_KANG_20120409
					bean.setOFFICE_CD(office_cd_str);
					//********** BEGIN_KANG_20120409
					//if(office_cd_str.equals("") || office_cd_str.equals("null")) {	office_cd_str = "00";	}
					//bean.setJIJUM_CD("00");
					bean.setJIJUM_CD("01");
					//********** END_KANG_20120409
					
					System.out.println("OFFICE_CD = "+bean.getOFFICE_CD());
					System.out.println("JIJUM_CD = "+bean.getJIJUM_CD());
					
				}else{
					
					String jijum_cd_str = iAdminBizService.maxJijum_cd(gu_code, selectCompany);
					
					System.out.println(selectCompany);
					System.out.println(jijum_cd_str);

					if(selectCompany.equals("") || selectCompany.equals("null")){ 	selectCompany = "00"; 	}
					if(jijum_cd_str.equals("") || jijum_cd_str.equals("null")) 	{	jijum_cd_str = "00"; 	}
					if(jijum_cd_str.length() == 1){
						jijum_cd_str = "0"+jijum_cd_str;
					}
					
					bean.setOFFICE_CD(selectCompany);
					bean.setJIJUM_CD(jijum_cd_str);
					System.out.println("OFFICE_CD = "+selectCompany);
					System.out.println("JIJUM_CD = "+jijum_cd_str);
				}
			
				bean.setCORP_CD(bean.getOFFICE_CD()+bean.getJIJUM_CD());

				System.out.println("CORP_CD = "+bean.getOFFICE_CD()+bean.getJIJUM_CD());
				
				
		int a = iAdminBizService.adminBizInsert(bean);
		
		System.out.println(a);
		
		}catch(Exception e){
			System.out.println(e);
		}
		
		return Search(request,response);
		
	}
	
public ModelAndView 	Modify(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");	
		AdminBizBean bean = new AdminBizBean();

		String corp_cd = ServletRequestUtils.getStringParameter(request, "CORP_CD","");
		String currentPage = ServletRequestUtils.getStringParameter(request, "currentPage","1");
		String adminBiz = ServletRequestUtils.getStringParameter(request, "adminBiz","");
		String MIN_NAME = ServletRequestUtils.getStringParameter(request, "MIN_NAME","");
		
		String gu_code	= "";
		
		List list = null;
		
		try{
			if(userId != null){
		
				UserBean	userBean	= new UserBean();		 
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				gu_code	= userBean.getSIGU_CD().substring(0, 3);
				
				bean = iAdminBizService.adminBizView(gu_code, corp_cd);
				list = iAdminBizService.adminBizCompanyList(gu_code);
				
				// hoban
				request.setAttribute("mul_spc_cd", commonCode.executeCommonCode("MUL_SPC_CD", bean.getSPC_CD(), "선택"));
				request.setAttribute("mul_to_spc_cd", commonCode.executeCommonCode("MUL_TO_SPC_CD", bean.getTO_SPC_CD(), "선택"));
			}
			
		}catch(Exception e){
			System.out.println("Modify 에러 : " + e);
		}
		
		String jumin_ssn1 = "";
		String jumin_ssn2 = "";
		String jumin_bizssn1 = "";
		String jumin_bizssn2 = "";
		String jumin_bizssn3 = "";
		String [] jumin_tel = new String[3];		
		String [] jumin_fax = new String[3];		
		String [] jumin_hp = new String[3];
System.out.println("1 ======================== " );
		
		if(bean.getSSN() != null && !bean.getSSN().equals("")){
			jumin_ssn1 = bean.getSSN().substring(0,6);
			jumin_ssn2 = bean.getSSN().substring(6,13);
			 
			request.setAttribute("jumin_ssn1", jumin_ssn1);
			request.setAttribute("jumin_ssn2", jumin_ssn2);
		}
System.out.println("2 ======================== " );	
		if(bean.getBIZSSN() != null && !bean.getBIZSSN().equals("")){
			jumin_bizssn1 = bean.getBIZSSN().substring(0,3);
			jumin_bizssn2 = bean.getBIZSSN().substring(3,5);			
			jumin_bizssn3 = bean.getBIZSSN().substring(5,10);	
			
			request.setAttribute("jumin_bizssn1", jumin_bizssn1);
			request.setAttribute("jumin_bizssn2", jumin_bizssn2);
			request.setAttribute("jumin_bizssn3", jumin_bizssn3);
		}
		System.out.println("3 ======================== " );		
		if(bean.getTOTEL() != null && !bean.getTOTEL().equals("")){			
			jumin_tel =  bean.getTOTEL().split("-");
			
			request.setAttribute("jumin_tel1", jumin_tel[0]);
			request.setAttribute("jumin_tel2", jumin_tel[1]);
			request.setAttribute("jumin_tel3", jumin_tel[2]);
		}
		System.out.println("4 ======================== " );
		if(bean.getTOFAX() != null && !bean.getTOFAX().equals("")){
			jumin_fax =bean.getTOFAX().split("-"); 
			
			request.setAttribute("jumin_fax1", jumin_fax[0]);
			request.setAttribute("jumin_fax2", jumin_fax[1]);
			request.setAttribute("jumin_fax3", jumin_fax[2]);
		}
		System.out.println("5 ======================== " );
		if(bean.getTOHP() != null && !bean.getTOHP().equals("")){
			jumin_hp = bean.getTOHP().split("-");		
			
			request.setAttribute("jumin_hp1", jumin_hp[0]);
			request.setAttribute("jumin_hp2", jumin_hp[1]);
			request.setAttribute("jumin_hp3", jumin_hp[2]);
		}
		
		System.out.println("6 ======================== " );
		System.out.println(jumin_ssn1+"-"+jumin_ssn2);
		System.out.println(jumin_bizssn1+"-"+jumin_bizssn2+"-"+jumin_bizssn3);
		System.out.println(jumin_tel[0]+"-"+jumin_tel[1]+"-"+jumin_tel[2]);
		System.out.println(jumin_fax[0]+"-"+jumin_fax[1]+"-"+jumin_fax[2]);
		System.out.println(jumin_tel[0]+"-"+jumin_tel[1]+"-"+jumin_tel[2]);

		request.setAttribute("adminBiz",adminBiz);
		request.setAttribute("MIN_NAME", MIN_NAME);
		
		request.setAttribute("currentPage",currentPage);
		request.setAttribute("GU_CODE", gu_code);
		request.setAttribute("CORP_CD", corp_cd);
		request.setAttribute("companyList", list);
		
		return new ModelAndView("/facility/adminbiz/modify", "board", bean);
	}

	public ModelAndView 	ModifyPrc(HttpServletRequest request, HttpServletResponse response) throws Exception {
	
		String modify_corp = ServletRequestUtils.getStringParameter(request, "CORP_CD",""); 
		String modify_current  = ServletRequestUtils.getStringParameter(request, "currentPage",""); 
		String adminBiz = ServletRequestUtils.getStringParameter(request, "adminBiz","");
		String MIN_NAME = ServletRequestUtils.getStringParameter(request, "MIN_NAME","");

		UserBean	userBean	= new UserBean();		 
		userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
		String gu_code	= userBean.getSIGU_CD().substring(0, 3);

		String selectCompany = ServletRequestUtils.getStringParameter(request, "selectCompany",""); //기존업체 및 새 업체 등록여부
		String NAME = ServletRequestUtils.getStringParameter(request, "NAME","");  // 업체 이름
		String jumin_ssn1 = ServletRequestUtils.getStringParameter(request, "jumin_ssn1","");   //주민(법인)번호
		String jumin_ssn2 = ServletRequestUtils.getStringParameter(request, "jumin_ssn2","");  
		String TOPOST_NM = ServletRequestUtils.getStringParameter(request, "TOPOST_NM","");   //대표자명
		String jumin_bizssn1 = ServletRequestUtils.getStringParameter(request, "jumin_bizssn1","");   //사업자 등록번호
		String jumin_bizssn2 = ServletRequestUtils.getStringParameter(request, "jumin_bizssn2",""); 
		String jumin_bizssn3 = ServletRequestUtils.getStringParameter(request, "jumin_bizssn3",""); 
		String BON_POST = ServletRequestUtils.getStringParameter(request, "BON_POST",""); //점용인 주소

		String BON_ADDR2 = ServletRequestUtils.getStringParameter(request, "ADDR2","");
		String LNBR1 = ServletRequestUtils.getStringParameter(request, "LNBR1","");//지번
		String LNBR2 = ServletRequestUtils.getStringParameter(request, "LNBR2","");
		String BIZ_STATUS = ServletRequestUtils.getStringParameter(request, "BIZ_STATUS",""); //업태
		String BIZ_TYPES = ServletRequestUtils.getStringParameter(request, "BIZ_TYPES",""); //종목
		String TO_POST = ServletRequestUtils.getStringParameter(request, "TO_POST",""); //송달지 주소

		String TO_ADDR2 = ServletRequestUtils.getStringParameter(request, "TOADDR2","");
		String TO_LNBR1 = ServletRequestUtils.getStringParameter(request, "TO_LNBR1","");//송달지 지번
		String TO_LNBR2= ServletRequestUtils.getStringParameter(request, "TO_LNBR2","");
		String OFFICE = ServletRequestUtils.getStringParameter(request, "OFFICE",""); //지점명
		String MANAGER = ServletRequestUtils.getStringParameter(request, "MANAGER",""); //담당자명
		String jumin_tel1 = ServletRequestUtils.getStringParameter(request, "jumin_tel1",""); //전화번호
		String jumin_tel2 = ServletRequestUtils.getStringParameter(request, "jumin_tel2",""); 
		String jumin_tel3 = ServletRequestUtils.getStringParameter(request, "jumin_tel3",""); 
		String TEL_EXT = ServletRequestUtils.getStringParameter(request, "TEL_EXT",""); //내선
		String jumin_fax1 = ServletRequestUtils.getStringParameter(request, "jumin_fax1",""); //팩스
		String jumin_fax2 = ServletRequestUtils.getStringParameter(request, "jumin_fax2",""); 
		String jumin_fax3 = ServletRequestUtils.getStringParameter(request, "jumin_fax3","");
		String jumin_hp1 = ServletRequestUtils.getStringParameter(request, "jumin_hp1","");  //휴대전화
		String jumin_hp2 = ServletRequestUtils.getStringParameter(request, "jumin_hp2","");
		String jumin_hp3 = ServletRequestUtils.getStringParameter(request, "jumin_hp3","");
				
		String SPC_CD = ServletRequestUtils.getStringParameter(request, "SPC_CD","");
		String TO_SPC_CD = ServletRequestUtils.getStringParameter(request, "TO_SPC_CD","");
		
		String SI = ServletRequestUtils.getStringParameter(request, "SI","");
		String GUN = ServletRequestUtils.getStringParameter(request, "GUN","");
		String DONG = ServletRequestUtils.getStringParameter(request, "DONG","");
		String RI = ServletRequestUtils.getStringParameter(request, "RI","");
		String DORO_NM = ServletRequestUtils.getStringParameter(request, "ROAD_ADDR","");
		String BD_BON = ServletRequestUtils.getStringParameter(request, "ROAD_BON","");
		String BD_BU = ServletRequestUtils.getStringParameter(request, "ROAD_BU","");
		String BD_NM = ServletRequestUtils.getStringParameter(request, "BD_NM","");
		String BD_DET_NM = ServletRequestUtils.getStringParameter(request, "BD_DET_NM","");
		
		String TOSI = ServletRequestUtils.getStringParameter(request, "TOSI","");
		String TOGUN = ServletRequestUtils.getStringParameter(request, "TOGUN","");
		String TODONG = ServletRequestUtils.getStringParameter(request, "TODONG","");
		String TORI = ServletRequestUtils.getStringParameter(request, "TORI","");
		String TO_DORO_NM = ServletRequestUtils.getStringParameter(request, "TO_DORO_NM","");
		String TO_BD_BON = ServletRequestUtils.getStringParameter(request, "TO_BD_BON","");
		String TO_BD_BU = ServletRequestUtils.getStringParameter(request, "TO_BD_BU","");
		String TO_BD_NM = ServletRequestUtils.getStringParameter(request, "TO_BD_NM","");
		String TO_BD_DET_NM = ServletRequestUtils.getStringParameter(request, "TO_BD_DET_NM","");
		
		String ADDR_CHECK = ServletRequestUtils.getStringParameter(request, "ADDR_CHECK","");

		// hoban
		String BON_ADDR1 = SI+" "+GUN+" "+DONG+" "+RI; //주소
		String TO_ADDR1 = TOSI+" "+TOGUN+" "+TODONG+" "+TORI; 
		String SANGSE = ServletRequestUtils.getStringParameter(request, "SANGSE","");
		String TOSANGSE = ServletRequestUtils.getStringParameter(request, "TOSANGSE","");

		AdminBizBean bean = new AdminBizBean();
		

		System.out.println("===========================================");
		System.out.println("gu_code = "+gu_code);
		System.out.println("NAME = "+NAME);
		System.out.println("jumin_ssn1+jumin_ssn2 = "+jumin_ssn1+jumin_ssn2);
		System.out.println("TOPOST_NM = "+TOPOST_NM);
		System.out.println("jumin_bizssn1+jumin_bizssn2+jumin_bizssn3 = "+jumin_bizssn1+jumin_bizssn2+jumin_bizssn3);
		System.out.println("===========================================");
		System.out.println("BON_POST = "+BON_POST);
		System.out.println("BON_ADDR1 = "+BON_ADDR1);
		System.out.println("BON_ADDR2 = "+BON_ADDR2);
		System.out.println("BIZ_STATUS = "+BIZ_STATUS);
		System.out.println("BIZ_TYPES = "+BIZ_TYPES);
		System.out.println("===========================================");
		System.out.println("TO_POST = "+TO_POST);
		System.out.println("TO_ADDR1 = "+TO_ADDR1);
		System.out.println("TO_ADDR2 = "+TO_ADDR2);
		System.out.println("OFFICE = "+OFFICE);
		System.out.println("MANAGER = "+MANAGER);
		System.out.println("===========================================");
		System.out.println("jumin_tel1+\"-\"+jumin_tel2+\"-\"+jumin_tel3 = "+jumin_tel1+"-"+jumin_tel2+"-"+jumin_tel3);
		System.out.println("TEL_EXT = "+TEL_EXT);
		System.out.println("jumin_fax1+\"-\"+jumin_fax2+\"-\"+jumin_fax3 = "+jumin_fax1+"-"+jumin_fax2+"-"+jumin_fax3);
		System.out.println("jumin_hp1+\"-\"+jumin_hp2+\"-\"+jumin_hp3 = "+jumin_hp1+"-"+jumin_hp2+"-"+jumin_hp3);
		System.out.println("LNBR1 = "+LNBR1);
		System.out.println("===========================================");
		System.out.println("LNBR2 = "+LNBR2);
		System.out.println("TO_LNBR1 = "+TO_LNBR1);
		System.out.println("TO_LNBR2 = "+TO_LNBR2);
		System.out.println("SPC_CD = "+SPC_CD);
		System.out.println("TO_SPC_CD = "+TO_SPC_CD);
		System.out.println("===========================================");
		System.out.println("SI = "+SI);	
		System.out.println("GUN = "+GUN);	
		System.out.println("DONG = "+DONG);	
		System.out.println("SANGSE = "+SANGSE);	
		System.out.println("TOSI = "+TOSI);	
		System.out.println("TOGUN = "+TOGUN);	
		System.out.println("TODONG = "+TODONG);	
		System.out.println("TOSANGSE = "+TOSANGSE);	
		System.out.println("RI = "+RI);	
		System.out.println("BD_NM = "+BD_NM);	
		System.out.println("BD_DET_NM = "+BD_DET_NM);	
		System.out.println("TORI = "+TORI);	
		System.out.println("TO_DORO_NM = "+TO_DORO_NM);	
		System.out.println("TO_BD_BON = "+TO_BD_BON);	
		System.out.println("TO_BD_BU = "+TO_BD_BU);	
		System.out.println("TO_BD_NM = "+TO_BD_NM );	
		System.out.println("TO_BD_DET_NM = "+TO_BD_DET_NM);	
		System.out.println("===========================================");
		
		bean.setSI(SI);
		bean.setGUN(GUN);
		bean.setDONG(DONG);
		bean.setRI(RI);
		bean.setROAD_ADDR(DORO_NM);
		bean.setROAD_BON(BD_BON);
		bean.setROAD_BU(BD_BU);
		bean.setBD_NM(BD_NM);
		bean.setBD_DET_NM(BD_DET_NM);

		bean.setTOSI(TOSI);
		bean.setTOGUN(TOGUN);
		bean.setTODONG(TODONG);
		bean.setTORI(TORI);
		bean.setTO_DORO_NM(TO_DORO_NM);
		bean.setTO_BD_BON(TO_BD_BON);
		bean.setTO_BD_BU(TO_BD_BU);
		bean.setTO_BD_NM(TO_BD_NM);
		bean.setTO_BD_DET_NM(TO_BD_DET_NM);

		bean.setGU_CODE(gu_code);
		bean.setNAME(NAME);
		bean.setSSN(jumin_ssn1+jumin_ssn2);
		bean.setTOPOST_NM(TOPOST_NM);
		bean.setBIZSSN(jumin_bizssn1+jumin_bizssn2+jumin_bizssn3);
		bean.setPOST(BON_POST);
		bean.setADDR1(BON_ADDR1);
		bean.setADDR2(BON_ADDR2);
		bean.setBIZ_STATUS(BIZ_STATUS);
		bean.setBIZ_TYPES(BIZ_TYPES);
		bean.setTOPOST(TO_POST);
		bean.setTOADDR1(TO_ADDR1);
		bean.setTOADDR2(TO_ADDR2);
		bean.setOFFICE(OFFICE);
		bean.setMANAGER(MANAGER);
		if(jumin_tel1 != null && !jumin_tel1.equals("")) bean.setTOTEL(jumin_tel1+"-"+jumin_tel2+"-"+jumin_tel3);
		bean.setTOTEL_EXT(TEL_EXT);
		if(jumin_fax1 != null && !jumin_fax1.equals("")) bean.setTOFAX(jumin_fax1+"-"+jumin_fax2+"-"+jumin_fax3);
		if(jumin_hp1 != null && !jumin_hp1.equals("")) bean.setTOHP(jumin_hp1+"-"+jumin_hp2+"-"+jumin_hp3);
		bean.setLNBR1(LNBR1);
		bean.setLNBR2(LNBR2);
		bean.setTO_LNBR1(TO_LNBR1);
		bean.setTO_LNBR2(TO_LNBR2);
		bean.setSPC_CD(SPC_CD);
		bean.setTO_SPC_CD(TO_SPC_CD);
		
		bean.setADDR_CHECK(ADDR_CHECK);

		System.out.println("selectCompany : " + selectCompany);
		System.out.println("modify_corp : " + modify_corp);
		String arrayCompany[] = selectCompany.split("/");

		selectCompany = arrayCompany[0].toString();
		
		try{
			
			System.out.println(selectCompany +" : "+modify_corp.substring(0,2));
			//********** BEGIN_KANG_20120409
			/*

			if(!selectCompany.equals(modify_corp.substring(0,2))){
				
				 
				if(selectCompany.equals("99")){		
					
					System.out.println("-99-");
					
					String office_cd_str  = iAdminBizService.maxOffice_cd(gu_code);
					bean.setOFFICE_CD(office_cd_str);
					bean.setJIJUM_CD("00");
					
				}else{
					
					
					String jijum_cd_str = iAdminBizService.maxJijum_cd(gu_code, selectCompany);
					
					System.out.println(selectCompany);
					System.out.println(jijum_cd_str);
					
					if(jijum_cd_str.length() == 1){
						jijum_cd_str = "0"+jijum_cd_str;
					}
					
					bean.setOFFICE_CD(selectCompany);
					bean.setJIJUM_CD(jijum_cd_str);
				}
			
				bean.setCORP_CD(bean.getOFFICE_CD()+bean.getJIJUM_CD());
			}else{
				
				
				bean.setCORP_CD(modify_corp);
				bean.setOFFICE_CD(modify_corp.substring(0,2));
				bean.setJIJUM_CD(modify_corp.substring(2,4));
			}
			*/
			bean.setCORP_CD(modify_corp);
			bean.setOFFICE_CD(modify_corp.substring(0,2));
			bean.setJIJUM_CD(modify_corp.substring(2,4));
			//********** END_KANG_20120409	
			
		int a = iAdminBizService.adminBizUpdate(bean,modify_corp);
		
		System.out.println(a);
		
		}catch(Exception e){
			System.out.println(e);
		}
		
		request.setAttribute("obj_adminBiz", adminBiz);
		request.setAttribute("obj_MIN_NAME", MIN_NAME);
		request.setAttribute("modify_corp", bean.getCORP_CD());
		request.setAttribute("modify_current", modify_current);

		return View(request,response);
	}
	
	public ModelAndView 	Delete(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		
		UserBean	userBean	= new UserBean();		 
		userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
		String gu_code	= userBean.getSIGU_CD().substring(0, 3);
		
		String CORP_CD  = ServletRequestUtils.getStringParameter(request, "CORP_CD","");
		String adminBiz = ServletRequestUtils.getStringParameter(request, "adminBiz","");
		String MIN_NAME= ServletRequestUtils.getStringParameter(request, "MIN_NAME","");
		
		
		
		try{
			
			int a = iAdminBizService.adminBizDelete(gu_code, CORP_CD);
			
			System.out.println(a);
			
		}catch(Exception e){
			
		}
		
		request.setAttribute("obj_adminBiz",adminBiz);
		request.setAttribute("obj_MIN_NAME",MIN_NAME);
		
		return Search(request, response);
	}

}



