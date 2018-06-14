package main.java.admin.web;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.admin.service.CommCodeService;
import main.java.admin.service.ICommCodeService;
import main.java.common.commonCode.model.UserBean;
import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.util.BoardUtil;
import main.java.common.util.Globals;
import main.java.common.util.catUtil.Util;
import main.java.admin.model.OfficeCodeBean;
import main.java.admin.model.OfficeRegBean;
import main.java.admin.model.PurposeCodeBean;
import main.java.admin.model.SectionBean;
import main.java.admin.model.UserRegBean;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
//********** BEGIN_현진_20120313
import main.java.admin.model.OrgCodeBean;
import main.java.admin.model.JojungCodeBean;

import java.text.DecimalFormat;
import java.text.NumberFormat;
//********** END_현진_20120313

//********** BEGIN_현진_20120315
import java.io.InputStream;
import com.file.FileCommand;
import java.io.File;
import java.io.FileInputStream;
import org.springframework.util.FileCopyUtils;
import java.io.FileOutputStream;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
//********** END_현진_20120315


public class CommCodeControl extends MultiActionController {

	private ICommCodeService objCommCodeService = null;
	private CommonCodeService commonCode = null;
	private Util util = new Util();

	public void setCommCodeService(ICommCodeService newObjCommCodeService) {
		this.objCommCodeService = newObjCommCodeService;
	}

	public void setCommonCodeService(CommonCodeService commonCode) {
		this.commonCode = commonCode;
	}

	/**
	 * 지역코드List 조회
	 * 
	 * @param HttpServletRequest
	 *            request
	 * @param HttpServletResponse
	 *            response
	 * @return ModelAndView
	 */
	public ModelAndView areaCodelist(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		int intCurrentPage = 0;
		int intCountPerPage = 0;

		String strCurrentPage = ServletRequestUtils.getStringParameter(request,
				"currentPage", Globals.DEFAULT_CURRENT_PAGE);
		String strCountPerPage = ServletRequestUtils.getStringParameter(
				request, "countPerPage", Globals.DEFAULT_COUNTPER_PAGE);
		String strSiName = ServletRequestUtils.getStringParameter(request,
				"siName", "");
		String strGuName = ServletRequestUtils.getStringParameter(request,
				"guName", "");
		String strHdName = ServletRequestUtils.getStringParameter(request,
				"hdName", "");
		String strActionUrl = request.getContextPath();
		String strParams = "&siName=" + "서울" + "&guName=" + strGuName
				+ "&hdName=" + strHdName;

		intCurrentPage = Integer.parseInt(strCurrentPage);
		intCountPerPage = Integer.parseInt(strCountPerPage);

		request.setAttribute("currentPage", strCurrentPage);
		request.setAttribute("countPerPage", strCountPerPage);
		request.setAttribute("siName", strSiName);
		request.setAttribute("guName", strGuName);
		request.setAttribute("hdName", strHdName);

		int totalCount = objCommCodeService.getAreaTotalCount("서울", strGuName,
				strHdName);

		List areaCodeList = objCommCodeService.retrieveAreaCodeList(
				intCurrentPage, intCountPerPage, "서울", strGuName, strHdName);
		String strPageDivideForm = BoardUtil.getDividePageForm(intCurrentPage,
				intCountPerPage, strParams, "", strActionUrl, totalCount);

		request.setAttribute("strPageDivideForm", strPageDivideForm);
		request.setAttribute("listSize", String.valueOf(areaCodeList.size()));
		request.setAttribute("totalCount", String.valueOf(totalCount));
		return new ModelAndView("/admin/commCode/areaCodeList", "areaCodelist",
				areaCodeList);
	}

	/**
	 * 기관코드List 조회
	 * 
	 * @param HttpServletRequest
	 *            request
	 * @param HttpServletResponse
	 *            response
	 * @return ModelAndView
	 */
	public ModelAndView orgCodelist(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		int intCurrentPage = 0;
		int intCountPerPage = 0;

		String strCurrentPage = ServletRequestUtils.getStringParameter(request,
				"currentPage", Globals.DEFAULT_CURRENT_PAGE);
		String strCountPerPage = ServletRequestUtils.getStringParameter(
				request, "countPerPage", Globals.DEFAULT_COUNTPER_PAGE);
		String guNm = ServletRequestUtils.getStringParameter(request, "guNm",
				"");
		String excel = ServletRequestUtils.getStringParameter(request, "excel",
				"");
		String strActionUrl = request.getContextPath();
		String strParams = "guNm=" + guNm;

		intCurrentPage = Integer.parseInt(strCurrentPage);
		intCountPerPage = Integer.parseInt(strCountPerPage);

		List orgCodelist = objCommCodeService.retrieveOrgCodeList(
				intCurrentPage, intCountPerPage, guNm);

		String strPageDivideForm = BoardUtil.getDividePageFormByParams(
				intCurrentPage, intCountPerPage, strParams, strActionUrl, 1000);

		request.setAttribute("currentPage", strCurrentPage);
		request.setAttribute("countPerPage", strCountPerPage);
		request.setAttribute("guNm", guNm);
		request.setAttribute("strPageDivideForm", strPageDivideForm);
		request.setAttribute("listSize", String.valueOf(orgCodelist.size()));

		if (excel.equals("Y")) {
			return new ModelAndView("/admin/commCode/excel_orgCodeList",
					"orgCodelist", orgCodelist);
		}

		return new ModelAndView("/admin/commCode/orgCodeList", "orgCodelist",
				orgCodelist);
	}
	//********** BEGIN_현진_20120313
	public ModelAndView orgCodelistNew(HttpServletRequest request,HttpServletResponse response,  String message) throws Exception {
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");	
		List<OrgCodeBean> orgCodelist = null;
		try{
			if(userId != null){
				// 세션에서 시도 코드를 가져온다.
				String SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				
				//관리자 데이터를 가져온다.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));	
				
				String GU_CD = ServletRequestUtils.getStringParameter(request,"GU_CD",userBean.getSIGU_CD());				
				logger.warn("SIDO_CD : " + SIDO_CD + ", GU_CD : " + GU_CD);
				request.setAttribute("GU_CODE", commonCode.executeGuCdList(userBean.getSIGU_CD(),GU_CD));	//	시군구
				
				int intCurrentPage = 0;
				int intCountPerPage = 0;
				String strCurrentPage = ServletRequestUtils.getStringParameter(request,"currentPage", Globals.DEFAULT_CURRENT_PAGE);
				String strCountPerPage = ServletRequestUtils.getStringParameter(request, "countPerPage", Globals.DEFAULT_COUNTPER_PAGE);
				String strActionUrl = request.getContextPath();
				String strParams = "&GU_CD=" + GU_CD;
				
				intCurrentPage = Integer.parseInt(strCurrentPage);
				intCountPerPage = Integer.parseInt(strCountPerPage);
				request.setAttribute("currentPage", strCurrentPage);
				request.setAttribute("countPerPage", strCountPerPage);
				
				orgCodelist = objCommCodeService.OrgCodeList(intCurrentPage, intCountPerPage, GU_CD);
				int totalCount = objCommCodeService.getOrgCodeCount(GU_CD);
				String strPageDivideForm = BoardUtil.getDividePageForm(intCurrentPage,intCountPerPage, strParams, "", strActionUrl, totalCount);

				request.setAttribute("totalCount", totalCount);
				request.setAttribute("GU_CD", GU_CD);
				request.setAttribute("strPageDivideForm", strPageDivideForm);				
				request.setAttribute("MSG", message);
			}
	
		}catch(Exception e){
			
		}
		
		return new ModelAndView("/admin/commCode/orgCodeListNew", "orgCodelist", orgCodelist);
	}
	
	public ModelAndView orgCodeRegisterView(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");

		try{
			if(userId != null){
				// 세션에서 시도 코드를 가져온다.
				String SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				
//				String MSG = (String)request.getAttribute("MSG");
//				Boolean YN = (Boolean)request.getAttribute("YN");
				
//				logger.info(String.format("orgCodeRegisterView() YN = %b", YN));
				// 관리자 데이터를 가져온다.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));				
				
				String GU_CD = ServletRequestUtils.getStringParameter(request,"GU_CD",userBean.getSIGU_CD());				
				logger.fatal("SIDO_CD : " + SIDO_CD +", GU_CD : " + GU_CD);

				request.setAttribute("GU_CODE", commonCode.executeGuCdList(userBean.getSIGU_CD(),GU_CD));	//	시군구

			}
		}catch(Exception e){
			logger.error(e.getMessage(), e);
		}		

		return new ModelAndView("/admin/commCode/orgCodeRegister");
	}


	public ModelAndView orgCodeRegister(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		OrgCodeBean bean = new OrgCodeBean();
		String message = "";

		boolean YN = true;
		try{
			bind(request,bean);
			if(userId != null){		
				// 세션에서 시도 코드를 가져온다.
				String action = ServletRequestUtils.getStringParameter(request, "ACTION", "add");
				String SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				
				// 관리자 데이터를 가져온다.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));	
				
				String GU_CD = ServletRequestUtils.getStringParameter(request,"GU_CD",userBean.getSIGU_CD());
				System.out.println("bean.getDEPT_CD().substring(0,3) : " + bean.getDEPT_CD().substring(0,3));
				
				bean.setORG_CD(bean.getDEPT_CD().substring(0,3)+"0000");
				bean.setSIGU_CD(SIDO_CD+GU_CD+"00000");
				bean.setGU_NM(commonCode.SearchGuName(SIDO_CD,GU_CD));
				
				if (action.equals("add") ) {
					YN = objCommCodeService.addOrgCode(bean);
					message = "입력되었습니다.";					
				} else if (action.equals("mod")){
					YN = objCommCodeService.updateOrgCode(bean);
					message = "변경되었습니다.";
				}
				
				if(!YN){
					message = "입력/변경에 실패하였습니다.";
				} else {
					request.setAttribute("DEPT_CD", bean.getDEPT_CD());
					request.setAttribute("DEPT_NM", bean.getDEPT_NM());
					request.setAttribute("MANAGE_WORK", bean.getMANAGE_WORK());
				}
				
				request.setAttribute("act", action);
				request.setAttribute("MSG", message);
				request.setAttribute("YN", YN);
			}
		}catch(Exception e){
			logger.error(e.getMessage(), e);
		}		

		return orgCodeRegisterView(request, response);
	}
	
	public ModelAndView orgCodeDelete(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		OrgCodeBean bean = new OrgCodeBean();
		String message = "";
		try{			
			if(userId != null){		
				String[] ITEM_CHECK_ARR = request.getParameterValues("ITEM_CHECK");
		        String[] ORG_CD_ARR = request.getParameterValues("ORG_CD_ARR");
		        String[] DEPT_CD_ARR = request.getParameterValues("DEPT_CD_ARR");
				
		        int listCount = 0;	    

		        for(int i = 0 ; i < ITEM_CHECK_ARR.length ; i++){
					System.out.println("ITEM_CHECK_ARR[i] : " + ITEM_CHECK_ARR[i]);

		        	if(ITEM_CHECK_ARR[i].equals("true")){
		        		bean.setORG_CD(ORG_CD_ARR[i]);
		        		bean.setDEPT_CD(DEPT_CD_ARR[i]);
		        		objCommCodeService.removeOorgCode(bean);
		        		listCount++;
	            	}
		        }
		        message = listCount + "건 삭제되었습니다.";
			}
		}catch(Exception e){
			System.out.println("orgCodeDelete 에러 : " + e);
		}		

		return orgCodelistNew(request, response, message);
	}
	
	
	//********** END_현진_20120313
	/**
	 * 점용목적코드List 조회
	 * 
	 * @param HttpServletRequest
	 *            request
	 * @param HttpServletResponse
	 *            response
	 * @return ModelAndView
	 */
	public ModelAndView purposeCodelist(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		int intCurrentPage = 0;
		int intCountPerPage = 0;

		String strCurrentPage = ServletRequestUtils.getStringParameter(request,
				"currentPage", Globals.DEFAULT_CURRENT_PAGE);
		String strCountPerPage = ServletRequestUtils.getStringParameter(
				request, "countPerPage", Globals.DEFAULT_COUNTPER_PAGE);
		String section = ServletRequestUtils.getStringParameter(request,
				"section", "");
		String code = ServletRequestUtils.getStringParameter(request,
				"codeName", "");
		String excel = ServletRequestUtils.getStringParameter(request, "excel",
				"");
		int index = ServletRequestUtils.getIntParameter(request, "index", 0);
		String strActionUrl = request.getContextPath();

		intCurrentPage = Integer.parseInt(strCurrentPage);
		intCountPerPage = Integer.parseInt(strCountPerPage);

		List purposeCodelist = objCommCodeService.retrievePurposeCodeList(
				intCurrentPage, intCountPerPage, section, code);
		String strPageDivideForm = BoardUtil.getDividePageForm(intCurrentPage,
				intCountPerPage, "1", "", strActionUrl, 1000);

		request.setAttribute("currentPage", strCurrentPage);
		request.setAttribute("countPerPage", strCountPerPage);

		request.setAttribute("section", commonCode.executeCommonCode(
				"use_type", section, "전체"));
		request.setAttribute("codeName", code);
		request.setAttribute("strPageDivideForm", strPageDivideForm);
		request
				.setAttribute("listSize", String
						.valueOf(purposeCodelist.size()));

		if (purposeCodelist.size() != 0)
			request.setAttribute("purposeIndex",
					(PurposeCodeBean) purposeCodelist.get(index));

		if (excel.equals("Y"))
			return new ModelAndView("/admin/commCode/excel_purposeCodeList",
					"purposeCodeList", purposeCodelist);

		return new ModelAndView("/admin/commCode/purposeCodeList",
				"purposeCodeList", purposeCodelist);
	}
	
	//********** BEGIN_현진_20120314
	public ModelAndView purposeCodelistNew(HttpServletRequest request, HttpServletResponse response, String massage) throws Exception 
	{
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		List<PurposeCodeBean> purposeCodeList = null;
		PurposeCodeBean bean = new PurposeCodeBean();
		try{
			if(userId != null){
				bind(request,bean);
				//관리자 데이터를 가져온다.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));

				String SIGU_CD = userBean.getSIGU_CD();
				request.setAttribute("SIGU_CD", SIGU_CD);
				
				String SECTION = ServletRequestUtils.getStringParameter(request,"SECTION_CD","0");
				String SECTION_CD = ServletRequestUtils.getStringParameter(request,"SECTION_CD","0");
				String CLASS_CD = ServletRequestUtils.getStringParameter(request,"CLASS_CD","");
				String SORT_CD = ServletRequestUtils.getStringParameter(request,"SORT_CD","");
				String KIND_CD = ServletRequestUtils.getStringParameter(request,"KIND_CD","");
				String CODE = ServletRequestUtils.getStringParameter(request,"CODE","");
				String USING_MODE = ServletRequestUtils.getStringParameter(request,"USING_MODE","1");
				bean.setSECTION(SECTION);
				
				System.out.println("SECTION : " + SECTION);
				System.out.println("CLASS_CD : " + CLASS_CD);
				System.out.println("SORT_CD : " + SORT_CD);
				System.out.println("KIND_CD : " + KIND_CD);
				System.out.println("CODE : " + CODE);
				
				int intCurrentPage = 0;
				int intCountPerPage = 0;
				
				String strCurrentPage = ServletRequestUtils.getStringParameter(request,	"currentPage", Globals.DEFAULT_CURRENT_PAGE);
				String strCountPerPage = ServletRequestUtils.getStringParameter(request, "countPerPage", Globals.DEFAULT_COUNTPER_PAGE);
				String strActionUrl = request.getContextPath();
				String strParams = "&SECTION_CD="+SECTION+"&CLASS_CD="+CLASS_CD+"&SORT_CD="+SORT_CD+"&KIND_CD="+KIND_CD+"&CODE="+CODE+"&USING_MODE="+USING_MODE;
				
				intCurrentPage = Integer.parseInt(strCurrentPage);
				intCountPerPage = Integer.parseInt(strCountPerPage);
				request.setAttribute("currentPage", strCurrentPage);
				request.setAttribute("countPerPage", strCountPerPage);				
				
				int totalCount = objCommCodeService.getPurposeCodeCount(bean);
				purposeCodeList = objCommCodeService.getPurposeCodeList(bean, intCurrentPage, intCountPerPage);
				String strPageDivideForm = BoardUtil.getDividePageForm(intCurrentPage,intCountPerPage, strParams, "", strActionUrl, totalCount);
				
				request.setAttribute("SECTION_CD_LIST", commonCode.executeSectionList(USING_MODE,SECTION_CD));
				request.setAttribute("USING_MODE_LIST", commonCode.executeSectionUsing(USING_MODE));
				
				
				
				request.setAttribute("totalCount",totalCount);
				request.setAttribute("strPageDivideForm",strPageDivideForm);
				request.setAttribute("SECTION",SECTION);
				request.setAttribute("CODE",CODE);
				request.setAttribute("MSG",massage);
				
			}
		}catch(Exception e){
			System.out.println("purposeCodelistNew 에러 : " + e);
		}		
		return new ModelAndView("/admin/commCode/purposeCodeListNew", "purposeCodeList", purposeCodeList);
	}
	
	//********** BEGIN_현진_20120319
	public ModelAndView purposeCodeDetailModify(HttpServletRequest request, HttpServletResponse response)  throws Exception {
		PurposeCodeBean bean = new PurposeCodeBean();
        try {
        		bind(request, bean);

        		String CLASS_CD = bean.getCODE().substring(0,1);
				String SORT_CD = bean.getCODE().substring(1,2);
				String KIND_CD = bean.getCODE().substring(2,3);
				bean.setCLASS_CD(CLASS_CD);
				bean.setSORT_CD(SORT_CD);
				bean.setKIND_CD(KIND_CD);
				
				String purposeCodeDetailList = commonCode.executePurposeCodeDetailModify(bean);
				
				
		        response.setContentType("text/html;charset=EUC-KR");
		        response.setHeader("Cache-Control", "no-cache");
		        response.getWriter().write(purposeCodeDetailList);
				
        } catch (Exception e) {
        	e.printStackTrace();
        }
        return null;
    }
	
	public ModelAndView purposeCodeDetailSelect(HttpServletRequest request, HttpServletResponse response)  throws Exception {
		PurposeCodeBean bean = new PurposeCodeBean();
        try {
        		bind(request, bean);
        		bean.setCODE(bean.getCLASS_CD()+bean.getSORT_CD()+bean.getKIND_CD());
				String purposeCodeDetailList = commonCode.executePurposeCodeDetailSelect(bean);
				
		        response.setContentType("text/html;charset=EUC-KR");
		        response.setHeader("Cache-Control", "no-cache");
		        response.getWriter().write(purposeCodeDetailList);
				
        } catch (Exception e) {
        	e.printStackTrace();
        }
        return null;
    }
	
	//********** END_현진_20120319
	//********** BEGIN_현진_20120320
	
	public ModelAndView purposeRegisterView(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		PurposeCodeBean bean = new PurposeCodeBean();
		PurposeCodeBean bean2 = new PurposeCodeBean();
		
		try{
			if(userId != null){
				// 세션에서 시도 코드를 가져온다.
				String SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				String mode = ServletRequestUtils.getStringParameter(request,"mode","add");
				String MSG = (String)request.getAttribute("MSG");
				Boolean YN = (Boolean)request.getAttribute("YN");
				
				// 관리자 데이터를 가져온다.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));				
				String SECTION = request.getParameter("SECTION");
								
				
				if(mode.equals("modify")){
					String modySECTION = request.getParameter("modySECTION");
					String modyCODE = request.getParameter("modyCODE");
					
			        bean.setSECTION(modySECTION);
			        bean.setCODE(modyCODE);
			        bean.setCLASS_CD(bean.getCODE().substring(0,1));
			        bean.setSORT_CD(bean.getCODE().substring(1,2));
			        bean.setKIND_CD(bean.getCODE().substring(2,3));
			        
			        List<PurposeCodeBean> list = commonCode.executePurposeCodeSelect(bean);
			        bean = (PurposeCodeBean)list.get(0);
			        
			        request.setAttribute("modySECTION", modySECTION);
					request.setAttribute("modyCODE", modyCODE);
				}else if(mode.equals("add")){
					bind(request, bean);	
					bind(request, bean2);
					String SortCd = bean.getSORT_CD();
					String KindCd = bean.getKIND_CD();
					String ClassCd = bean.getCLASS_CD();
					
					System.out.println("SortCd : " +SortCd);
					System.out.println("KindCd : " +KindCd);
					System.out.println("ClassCd : " +ClassCd);
					
					
					bean2 = commonCode.executePurposeNewInsertList(bean);
					
					if(bean2.getKIND_CD() == "0" || bean2.getSORT_NM() == null || bean2.getSORT_NM().equals("")){
						SortCd = commonCode.executePurposeNewSortCd(bean);
						SortCd = returnCD(SortCd);
						KindCd = "1";
					}else{
						KindCd = commonCode.executePurposeNewKindCd(bean);						
						KindCd = returnCD(KindCd);
					}	
					System.out.println("=================" + bean.getSECTION());
					bean = commonCode.executePurposeNewInsertList(bean);
					bean.setCLASS_CD(ClassCd);
					bean.setSORT_CD(SortCd);
					bean.setKIND_CD(KindCd);
					
					bean.setCODE(bean.getCLASS_CD()+bean.getSORT_CD()+bean.getKIND_CD());
				}else if(mode.equals("add2")){
					bind(request, bean);
					int classCd = 0;
					String ClassCd = commonCode.executePurposeNewClassCd(bean);
					bean = commonCode.executePurposeNewInsertList(bean);
					
					/*classCd = ClassCd.charAt(0);
					
					if(classCd == 57){
						classCd = 65;
						ClassCd = Character.toString((char)classCd);
					}else if(classCd > 57){
						classCd = classCd+1;
						ClassCd = Character.toString((char)classCd);
					}
					*/
					
					ClassCd = returnCD(ClassCd);
					bean.setCLASS_CD(ClassCd);						
					bean.setSORT_CD("1");
					bean.setKIND_CD("1");
					bean.setCODE(bean.getCLASS_CD()+bean.getSORT_CD()+bean.getKIND_CD());
				}

				request.setAttribute("mode", mode);
				request.setAttribute("MSG", MSG);
				request.setAttribute("YN", YN);
				
				request.setAttribute("list", bean);
				request.setAttribute("SECTION", SECTION);
				
			}
		}catch(Exception e){
			System.out.println("purposeRegisterView 에러 : " + e);
		}		

		return new ModelAndView("/admin/commCode/purposeRegister");
	}

	public String returnCD(String CD){
		int tempCd = 0;
		tempCd = CD.charAt(0);
		
		//********** BEGIN_현진_20120321
		/*
		if(tempCd == 57){
			tempCd = 65;
		}else if(tempCd > 57){
			tempCd = tempCd+1;
		}
		*/
		if(tempCd == 57){
			tempCd = 65;
		}else{
			tempCd = tempCd+1;
		}
		//********** END_현진_20120321


		CD = Character.toString((char)tempCd);
		return CD;
	}

	public ModelAndView purposeRegister(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		PurposeCodeBean bean = new PurposeCodeBean();
		String massage = "";
		boolean YN = true;
		boolean updateClassNm = true;
		boolean updateSortNm = true;
		boolean updateKindNm = true;
		try{
			bind(request,bean);
			if(userId != null){		
				String mode = ServletRequestUtils.getStringParameter(request,"mode","add");
			
				if(mode.equals("add") || mode.equals("add2")){
					bean.setCLASS_CD(bean.getCODE().substring(0,1));
					bean.setSORT_CD(bean.getCODE().substring(1,2));
					bean.setKIND_CD(bean.getCODE().substring(2,3));
					YN = commonCode.purposeCodeNewListInsert(bean);
					massage = "입력되었습니다.";
				}else if(mode.equals("modify")){
					String modySECTION = request.getParameter("modySECTION");
					String modyCODE = request.getParameter("modyCODE");
					updateClassNm = commonCode.purposeCodeNewListUpdateClassNm(bean, modySECTION, modyCODE);
					updateSortNm = commonCode.purposeCodeNewListUpdateSortNm(bean, modySECTION, modyCODE);
					updateKindNm = commonCode.purposeCodeNewListUpdateKindNm(bean, modySECTION, modyCODE);
					if(!(updateClassNm || updateSortNm || updateKindNm)){
						YN = false;
					}
					massage = "수정되었습니다.";
				}
				
				if(!YN){
					massage = "실패하였습니다.";
				}
				
				request.setAttribute("MSG", massage);				
				request.setAttribute("YN", YN);
			}
		}catch(Exception e){
			System.out.println("purposeRegister 에러 : " + e);
		}
		
		return purposeRegisterView(request, response);
	}

	public ModelAndView purposeDelete(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		PurposeCodeBean bean = new PurposeCodeBean();
		String message = "";
		
		 try{			
			if(userId != null){		
				String[] ITEM_CHECK_ARR = request.getParameterValues("ITEM_CHECK");
		        String[] CODE_ARR = request.getParameterValues("CODE_ARR");
		        String[] SECTION_ARR = request.getParameterValues("SECTION_ARR");
				
		        int listCount = 0;	    

		        for(int i = 0 ; i < ITEM_CHECK_ARR.length ; i++){
					System.out.println("ITEM_CHECK_ARR[i] : " + ITEM_CHECK_ARR[i]);
					System.out.println("SECTION_ARR[i] : " + SECTION_ARR[i]);
					System.out.println("CODE_ARR[i] : " + CODE_ARR[i]);

		        	if(ITEM_CHECK_ARR[i].equals("true")){
		        		bean.setCODE(CODE_ARR[i]);
		        		bean.setSECTION(SECTION_ARR[i]);
		        		commonCode.purposeCodeNewListDelete(bean);
		        		listCount++;
	            	}
		        }
		        message = listCount + "건 삭제되었습니다.";
			}
		}catch(Exception e){
			System.out.println("purposeDelete 에러 : " + e);
		}		

		return purposeCodelistNew(request, response, message);
	}
	
	//********** END_현진_20120320
	public ModelAndView getSectionCode(HttpServletRequest request, HttpServletResponse response)  throws Exception {
		
        try {
				String USING_MODE = ServletRequestUtils.getStringParameter(request, "USING_MODE", "");
				String SECTION_CD = ServletRequestUtils.getStringParameter(request, "SECTION_CD", "");
				
				String sectionCodeList = commonCode.executeSectionList(USING_MODE, SECTION_CD);
				
		        response.setContentType("text/html;charset=EUC-KR");
		        response.setHeader("Cache-Control", "no-cache");
		        response.getWriter().write(sectionCodeList);
				
        } catch (Exception e) {
        	e.printStackTrace();
        }
        return null;
    }
	
	
	//********** END_현진_20120314
	//********** BEGIN_현진_20120315
	public ModelAndView seal(HttpServletRequest request, HttpServletResponse response, String massage) throws Exception 
	{
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		try{
			if(userId != null){
				//관리자 데이터를 가져온다.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));

				String SIGU_CD = userBean.getSIGU_CD();
				request.setAttribute("SIGU_CD", SIGU_CD);
				
				String GU_CD = ServletRequestUtils.getStringParameter(request,"GU_CD",userBean.getSIGU_CD());				
				request.setAttribute("GU_CODE", commonCode.executeGuCdList(userBean.getSIGU_CD(),GU_CD));	//	시군구				
				request.setAttribute("MSG", massage);				

			}
		}catch(Exception e){
			System.out.println("seal 에러 : " + e);
		}		
		return new ModelAndView("/admin/commCode/seal");
	}

	public ModelAndView sealRegister(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		String massage = "";
		try{
			if(userId != null){
				MultipartHttpServletRequest mpRequest = (MultipartHttpServletRequest) request;
				MultipartFile sealFile = mpRequest.getFile("Upload");
				
				String fileName = ServletRequestUtils.getStringParameter(request,"GU_CD","");	
				String root = session.getServletContext().getRealPath("/");
				String path =  "E:\\roads\\stamp";

				InputStream is = sealFile.getInputStream();
				massage = doFileUpload(is, sealFile.getOriginalFilename(), path, fileName);
			}
		}catch(Exception e){
			System.out.println("seal 에러 : " + e);
		}		
		return seal(request, response, massage);		
	}
	
	public String doFileUpload(InputStream is, String originalFileName, String path, String fileName) throws Exception {
		String massage = "등록되었습니다.";
		try{
			if(is == null)
				return null;
			
			// 클라이언트가 업로드한 파일의 이름
			if(originalFileName.equals(""))
				return null;
			
			// 확장자
			String fileExt = originalFileName.substring(originalFileName.lastIndexOf("."));
			System.out.println("originalFileName : " + originalFileName);
			System.out.println("fileExt : " + fileExt);
			if(fileExt == null || fileExt.equals("")|| !(fileExt.equals(".png")))
				return "파일 확장자는 반드시 png 여야 합니다.";
			
			// 업로드할 경로가 존재하지 않는 경우 폴더를 생성 한다.
			File dir = new File(path);
			if(!dir.exists())
				dir.mkdirs();
			
			String fullFileName = path + File.separator + fileName+".png";
			System.out.println("fullFileName :" + fullFileName);
			FileCopyUtils.copy(is, new FileOutputStream(fullFileName));	
		}catch(Exception e){
			System.out.println("doFileUpload 에러 : " + e);
			massage = "등록에 실패하였습니다.";
		}
		
		
		return massage;
	}
	

	//********** END_현진_20120315
	/**
	 * 과세구분코드List 조회
	 * 
	 * @param HttpServletRequest
	 *            request
	 * @param HttpServletResponse
	 *            response
	 * @return ModelAndView
	 */
	public ModelAndView taxCodelist(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		int intCurrentPage = 0;
		int intCountPerPage = 0;

		String strCurrentPage = ServletRequestUtils.getStringParameter(request,
				"currentPage", Globals.DEFAULT_CURRENT_PAGE);
		String strCountPerPage = ServletRequestUtils.getStringParameter(
				request, "countPerPage", Globals.DEFAULT_COUNTPER_PAGE);
		String taxcode = ServletRequestUtils.getStringParameter(request,
				"taxcode", "");
		String taxname = ServletRequestUtils.getStringParameter(request,
				"taxname", "");
		String taxacc = ServletRequestUtils.getStringParameter(request,
				"taxacc", "");
		String strActionUrl = request.getContextPath();

		intCurrentPage = Integer.parseInt(strCurrentPage);
		intCountPerPage = Integer.parseInt(strCountPerPage);

		List taxCodelist = objCommCodeService.retrieveTaxCodeList(
				intCurrentPage, intCountPerPage, taxcode, taxname, taxacc);
		String strPageDivideForm = BoardUtil.getDividePageForm(intCurrentPage,
				intCountPerPage, "1", "", strActionUrl, 1000);

		request.setAttribute("currentPage", strCurrentPage);
		request.setAttribute("countPerPage", strCountPerPage);
		request.setAttribute("taxcode", taxcode);
		request.setAttribute("taxname", taxname);
		request.setAttribute("taxacc", taxacc);
		request.setAttribute("strPageDivideForm", strPageDivideForm);
		request.setAttribute("listSize", String.valueOf(taxCodelist.size()));

		return new ModelAndView("/admin/commCode/taxCodeList", "taxCodelist",
				taxCodelist);
	}

	/**
	 * 우편번호코드List 조회
	 * 
	 * @param HttpServletRequest
	 *            request
	 * @param HttpServletResponse
	 *            response
	 * @return ModelAndView
	 */
	public ModelAndView zipCodelist(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		int intCurrentPage = 0;
		int intCountPerPage = 0;

		String strCurrentPage = ServletRequestUtils.getStringParameter(request,
				"currentPage", Globals.DEFAULT_CURRENT_PAGE);
		String strCountPerPage = ServletRequestUtils.getStringParameter(
				request, "countPerPage", Globals.DEFAULT_COUNTPER_PAGE);
		String areaName = ServletRequestUtils.getStringParameter(request,
				"areaName", "");
		String strActionUrl = request.getContextPath();

		intCurrentPage = Integer.parseInt(strCurrentPage);
		intCountPerPage = Integer.parseInt(strCountPerPage);

		List zipCodelist = objCommCodeService.retrieveZipCodeList(
				intCurrentPage, intCountPerPage, areaName);
		String strPageDivideForm = BoardUtil.getDividePageForm(intCurrentPage,
				intCountPerPage, "1", "", strActionUrl, 1000);

		request.setAttribute("currentPage", strCurrentPage);
		request.setAttribute("countPerPage", strCountPerPage);
		request.setAttribute("areaName", areaName);
		request.setAttribute("strPageDivideForm", strPageDivideForm);
		request.setAttribute("listSize", String.valueOf(zipCodelist.size()));

		return new ModelAndView("/admin/commCode/zipCodeList", "zipCodelist",
				zipCodelist);
	}

	/**
	 * 조정계수코드List 조회
	 * 
	 * @param HttpServletRequest
	 *            request
	 * @param HttpServletResponse
	 *            response
	 * @return ModelAndView
	 */
	public ModelAndView jojungCodelist(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		int intCurrentPage = 0;
		int intCountPerPage = 0;

		String strCurrentPage = ServletRequestUtils.getStringParameter(request,
				"currentPage", Globals.DEFAULT_CURRENT_PAGE);
		String strCountPerPage = ServletRequestUtils.getStringParameter(
				request, "countPerPage", Globals.DEFAULT_COUNTPER_PAGE);
		String cnt = ServletRequestUtils.getStringParameter(request, "cnt", "");
		String strActionUrl = request.getContextPath();
		String strParams = "cnt=" + cnt;

		intCurrentPage = Integer.parseInt(strCurrentPage);
		intCountPerPage = Integer.parseInt(strCountPerPage);

		List jojungCodelist = objCommCodeService.retrieveJojungCodeList(
				intCurrentPage, intCountPerPage, cnt);

		String strPageDivideForm = BoardUtil.getDividePageFormByParams(
				intCurrentPage, intCountPerPage, strParams, strActionUrl, 1000);

		request.setAttribute("currentPage", strCurrentPage);
		request.setAttribute("countPerPage", strCountPerPage);
		request.setAttribute("cnt", cnt);
		request.setAttribute("strPageDivideForm", strPageDivideForm);
		request.setAttribute("listSize", String.valueOf(jojungCodelist.size()));

		return new ModelAndView("/admin/commCode/jojungCodeList",
				"jojungCodelist", jojungCodelist);
	}

	//********** BEGIN_현진_20120313
	public ModelAndView jojungCodelistNew(HttpServletRequest request, HttpServletResponse response,  String message) throws Exception 
	{
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		List<JojungCodeBean> jojungList = null;
		try{
			if(userId != null){
				//관리자 데이터를 가져온다.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
System.out.println("userBean.getSIGU_CD() : " + userBean.getSIGU_CD());
				String SIGU_CD = userBean.getSIGU_CD();
				request.setAttribute("SIGU_CD", SIGU_CD);
				String ADD_SUM = ServletRequestUtils.getStringParameter(request,"ADD_SUM","");				
				
				int intCurrentPage = 0;
				int intCountPerPage = 0;
				
				String strCurrentPage = ServletRequestUtils.getStringParameter(request,	"currentPage", Globals.DEFAULT_CURRENT_PAGE);
				String strCountPerPage = ServletRequestUtils.getStringParameter(request, "countPerPage", Globals.DEFAULT_COUNTPER_PAGE);
				String strActionUrl = request.getContextPath();
				String strParams = "&ADD_SUM=" + ADD_SUM;
				
				intCurrentPage = Integer.parseInt(strCurrentPage);
				intCountPerPage = Integer.parseInt(strCountPerPage);
				request.setAttribute("currentPage", strCurrentPage);
				request.setAttribute("countPerPage", strCountPerPage);				
				
				int totalCount = objCommCodeService.getJojungCount(ADD_SUM);
				jojungList = objCommCodeService.getJojungList(ADD_SUM, intCurrentPage, intCountPerPage);
				String strPageDivideForm = BoardUtil.getDividePageForm(intCurrentPage,intCountPerPage, strParams, "", strActionUrl, totalCount);
				
				request.setAttribute("totalCount",totalCount);
				request.setAttribute("strPageDivideForm",strPageDivideForm);
				request.setAttribute("MSG", message);
				request.setAttribute("ADD_SUM", ADD_SUM);
				

			}
		}catch(Exception e){
			System.out.println("jojungCodelistNew 에러 : " + e);
		}		
		return new ModelAndView("/admin/commCode/jojungCodeListNew", "jojungList", jojungList);
	}
	

	public ModelAndView jojungCodeRegisterView(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		JojungCodeBean bean = new JojungCodeBean();
		
		try{
			if(userId != null){
				
				// 관리자 데이터를 가져온다.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));				
				
				String GU_CD = ServletRequestUtils.getStringParameter(request,"GU_CD",userBean.getSIGU_CD());				
				String mode = ServletRequestUtils.getStringParameter(request,"mode","add");
				String MSG = (String)request.getAttribute("MSG");
				Boolean YN = (Boolean)request.getAttribute("YN");
				
				if(mode.equals("modify")){
					String modyADD_SUM = request.getParameter("modyADD_SUM");
					String modyCNT = request.getParameter("modyCNT");
					
					bean.setADD_SUM(Integer.parseInt(modyADD_SUM));
			        bean.setCNT(modyCNT);
			        List<JojungCodeBean> list = objCommCodeService.getJojungSelectList(bean);
			        bean = (JojungCodeBean)list.get(0);
			        
			        request.setAttribute("modyADD_SUM", modyADD_SUM);
					request.setAttribute("modyCNT", modyCNT);
				}

				request.setAttribute("mode", mode);
				request.setAttribute("MSG", MSG);
				request.setAttribute("YN", YN);
				
				request.setAttribute("JojungCodeBean", bean);
				

			}
		}catch(Exception e){
			System.out.println("jojungCodeRegisterView 에러 : " + e);
		}		

		return new ModelAndView("/admin/commCode/jojungCodeRegister");
	}


	public ModelAndView jojungCodeRegister(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		JojungCodeBean bean = new JojungCodeBean();
		String massage = "";
		boolean YN = true;
		
		try{
			bind(request,bean);
			if(userId != null){		
				String mode = ServletRequestUtils.getStringParameter(request,"mode","add");
				
				NumberFormat formatter = new DecimalFormat("0.####");
				Double d = Double.parseDouble(bean.getCNT());
				String cnt = formatter.format(d);
				bean.setCNT(cnt);
				
				if(mode.equals("add")){
					YN = objCommCodeService.setJojungInsert(bean);
					massage = "입력되었습니다.";
				}else if(mode.equals("modify")){
					String modyADD_SUM = request.getParameter("modyADD_SUM");
					String modyCNT = request.getParameter("modyCNT");
					YN = objCommCodeService.setJojungUpdate(bean, modyADD_SUM, modyCNT);
					massage = "수정되었습니다.";
				}
				
				if(!YN){
					massage = "정상적으로 처리되지 않았습니다. ";
				}
				
				request.setAttribute("MSG", massage);
				request.setAttribute("YN", YN);
			}
		}catch(Exception e){
			System.out.println("jojungCodeRegister 에러 : " + e);
		}		

		return jojungCodeRegisterView(request, response);
	}
	
	public ModelAndView jojungCodeDelete(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		JojungCodeBean bean = new JojungCodeBean();
		String message = "";
		try{			
			if(userId != null){		
				String[] ITEM_CHECK_ARR = request.getParameterValues("ITEM_CHECK");
		        String[] ADD_SUM_ARR = request.getParameterValues("ADD_SUM_ARR");
		        String[] CNT_ARR = request.getParameterValues("CNT_ARR");
				
		        int listCount = 0;	    

		        for(int i = 0 ; i < ITEM_CHECK_ARR.length ; i++){
					System.out.println("ITEM_CHECK_ARR[i] : " + ITEM_CHECK_ARR[i]);

		        	if(ITEM_CHECK_ARR[i].equals("true")){
		        		bean.setADD_SUM(Integer.parseInt(ADD_SUM_ARR[i]));
		        		bean.setCNT(CNT_ARR[i]);
		        		objCommCodeService.jojungDelete(bean);
		        		listCount++;
	            	}
		        }
		        message = listCount + "건 삭제되었습니다.";
			}
		}catch(Exception e){
			System.out.println("jojungCodeDelete 에러 : " + e);
		}		

		return jojungCodelistNew(request, response, message);
	}
	

	
	
	
	//********** END_현진_20120313

	
	
	
	/**
	 * 등급코드List 조회
	 * 
	 * @param HttpServletRequest
	 *            request
	 * @param HttpServletResponse
	 *            response
	 * @return ModelAndView
	 */
	public ModelAndView gradeCodelist(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		int intCurrentPage = 0;
		int intCountPerPage = 0;

		String strCurrentPage = ServletRequestUtils.getStringParameter(request,
				"currentPage", Globals.DEFAULT_CURRENT_PAGE);
		String strCountPerPage = ServletRequestUtils.getStringParameter(
				request, "countPerPage", Globals.DEFAULT_COUNTPER_PAGE);
		String gradeName = ServletRequestUtils.getStringParameter(request,
				"gradeName", "");
		String strActionUrl = request.getContextPath();
		String strParams = "gradeName=" + gradeName;

		intCurrentPage = Integer.parseInt(strCurrentPage);
		intCountPerPage = Integer.parseInt(strCountPerPage);

		List gradeCodelist = objCommCodeService.retrieveGradeCodeList(
				intCurrentPage, intCountPerPage, gradeName);

		String strPageDivideForm = BoardUtil.getDividePageFormByParams(
				intCurrentPage, intCountPerPage, strParams, strActionUrl, 1000);

		request.setAttribute("currentPage", strCurrentPage);
		request.setAttribute("countPerPage", strCountPerPage);
		request.setAttribute("gradeName", gradeName);
		request.setAttribute("strPageDivideForm", strPageDivideForm);
		request.setAttribute("listSize", String.valueOf(gradeCodelist.size()));

		return new ModelAndView("/admin/commCode/gradeCodeList",
				"gradeCodelist", gradeCodelist);
	}

	/**
	 * 업체코드 List 조회
	 * 
	 * @param HttpServletRequest
	 *            request
	 * @param HttpServletResponse
	 *            response
	 * @return ModelAndView
	 */

	public ModelAndView officeCodelist(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		HttpSession session = request.getSession();
		String userId = (String) session.getAttribute("sessionUserId");
		List blist = null;

		try {
			if (userId != null) {

				// 세션에서 시도 코드를 가져온다.
				String SIDO_CD = util.getSidoCode(getMessageSourceAccessor());

				System.out.println("############SIDO_CD :" + SIDO_CD);

				// 관리자 데이터를 가져온다.
				UserBean userBean = new UserBean();
				userBean = commonCode.executeUserSearch(util.getSessionID(
						request, "sessionUserId"));
				String sigu_cd = userBean.getSIGU_CD();

				System.out.println("############sigu_cd :" + sigu_cd);

				int intCurrentPage = 0;
				int intCountPerPage = 0;

				String strCurrentPage = ServletRequestUtils.getStringParameter(
						request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
				String strCountPerPage = ServletRequestUtils
						.getStringParameter(request, "countPerPage",
								Globals.DEFAULT_COUNTPER_PAGE);

				String searchOfficeName = ServletRequestUtils.getStringParameter(request, "searchOfficeName", "");

				System.out.println("############strCurrentPage :" + strCurrentPage);
				System.out.println("############strCountPerPage :" + strCountPerPage);
				System.out.println("############searchOfficeName :" + searchOfficeName);

				String strParams = "&searchOfficeName=" + searchOfficeName;

				String strActionUrl = request.getContextPath();

				intCurrentPage = Integer.parseInt(strCurrentPage);
				intCountPerPage = Integer.parseInt(strCountPerPage);

				System.out.println("##################*************############");

				int totalCount = objCommCodeService.getOfficeTotalCount(
						searchOfficeName, sigu_cd);

				System.out.println("############totalCount :" + totalCount);

				String strPageDivideForm = BoardUtil.getDividePageForm(intCurrentPage, intCountPerPage, strParams,"/admin/commCode/officeCode.do", strActionUrl,totalCount);

				System.out.println("############ sigu_cd :" + sigu_cd);

				List list = objCommCodeService.retrieveOfficeCodeList(intCurrentPage, intCountPerPage, searchOfficeName,sigu_cd);

				System.out.println("############ list size :" + list.size());

				blist = new ArrayList();
				OfficeCodeBean bean = new OfficeCodeBean();
				int size = list.size();

				for (int i = 0; i < size; i++) {
					bean = (OfficeCodeBean) list.get(i);

					blist.add(i, bean);
				}

				request.setAttribute("strPageDivideForm", strPageDivideForm);
				request.setAttribute("searchOfficeName", searchOfficeName);
				request.setAttribute("listSize", String.valueOf(list.size()));
				request.setAttribute("totalCount", String.valueOf(totalCount));

			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return new ModelAndView("/admin/commCode/officeCodeList", "blist",blist);
	}

	public ModelAndView insertOfficeCode(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		HttpSession session = request.getSession();

		OfficeRegBean bean = new OfficeRegBean();

		String result = "";

		String mode = ServletRequestUtils.getStringParameter(request, "mode","");
		String office_nm = ServletRequestUtils.getStringParameter(request, "office_nm", "");
		String jijum_nm = ServletRequestUtils.getStringParameter(request, "jijum_nm", "");
		String office_cd = ServletRequestUtils.getStringParameter(request, "office_cd", "");
		String jijum_cd = ServletRequestUtils.getStringParameter(request, "jijum_cd", "");

		System.out.println("@@@@@@@@@@@@@@@@mode :" + mode);
		System.out.println("@@@@@@@@@@@@@@@@office_nm :" + office_nm);
		System.out.println("@@@@@@@@@@@@@@@@jijum_nm :" + jijum_nm);
		System.out.println("@@@@@@@@@@@@@@@@office_cd :" + office_cd);
		System.out.println("@@@@@@@@@@@@@@@@jijum_cd :" + jijum_cd);

		request.setAttribute("mode", mode);
		request.setAttribute("office_nm", office_nm);
		request.setAttribute("jijum_nm", jijum_nm);
		request.setAttribute("office_cd", office_cd);
		request.setAttribute("jijum_cd", jijum_cd);

		request.setAttribute("result", result);

		return new ModelAndView("/admin/commCode/insertOfficeCode");
	}

	public ModelAndView insertOfficeCodePrc(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		HttpSession session = request.getSession();

		String officeNm = ServletRequestUtils.getStringParameter(request, "office_nm", "");
		String jijumNm = ServletRequestUtils.getStringParameter(request, "jijum_nm", "");

		// 관리자 데이터를 가져온다.
		UserBean userBean = new UserBean();
		userBean = commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
		String sigu_cd = userBean.getSIGU_CD();

		if (officeNm.length() < 1) {
			request.setAttribute("result", "업체명을 입력하세요.");
		} else {
			if (!objCommCodeService.verifyOfficeNm(officeNm, sigu_cd)) {
				String officeCD = objCommCodeService.verifyMaxOfficeCD(sigu_cd);
				String jijumCD = "";
				String jijumCK = "";

				if (jijumNm.length() < 1) {
					jijumCK = "0";
					jijumCD = "00";
				} else {
					jijumCK = "1";
					jijumCD = "01";
				}
				System.out.println(" :::1:::: " + officeNm + ":" + officeCD
						+ ":" + jijumNm + ":" + jijumCD + ":" + jijumCK + ":"
						+ sigu_cd + ":::::::::");
				boolean result = objCommCodeService
						.insertOfficeCode(insertOffceRegBean(officeNm,
								officeCD, jijumNm, jijumCD, jijumCK, sigu_cd));
				System.out.println("result: " + result);
				if (result) {
					// MSG :DB입력 성공
					//********** BEGIN_KANG_20120416
					/*
					request.setAttribute("result", "true");
					*/
					request.setAttribute("result", "insert");
					//********** END_KANG_20120416
					
				} else {
					// MSG :DB입력 실패
					request.setAttribute("result", "입력시스템 오류 입니다.");
				}

			} else {

				if (jijumNm.length() < 1) {
				} else {
					if (!objCommCodeService.verifyJijumNm(officeNm, jijumNm,
							sigu_cd)) {

						String officeCD = objCommCodeService.verifyOfficeCD(
								officeNm, sigu_cd);
						String jijumCD = objCommCodeService.verifyMaxJijumCD(
								officeNm, sigu_cd);

						System.out.println(" ::::2:::: " + officeNm + ":"
								+ officeCD + ":" + jijumNm + ":" + jijumCD
								+ ":" + "1" + ":" + sigu_cd + ":::::::::");
						boolean result = objCommCodeService
								.insertOfficeCode(insertOffceRegBean(officeNm,
										officeCD, jijumNm, jijumCD, "1",
										sigu_cd));
						System.out.println("result: " + result);
						if (result) {
							// MSG :DB입력 성공
							//********** BEGIN_KANG_20120416
							/*
							request.setAttribute("result", "true");
							*/
							request.setAttribute("result", "insert");
							//********** END_KANG_20120416
						} else {
							// MSG :DB입력 실패
							request.setAttribute("result", "입력시스템 오류입니다.");
						}

					} else {
						// MSG : 이미 지점명이 입력되있다.
						request.setAttribute("result", "이미 업체명/지점명이 존재합니다..");
					}
				}
			}
		}

		request.setAttribute("mode", "reg");
		request.setAttribute("office_nm", officeNm);
		request.setAttribute("jijum_nm", jijumNm);

		return new ModelAndView("/admin/commCode/insertOfficeCode");

	}

	
	public ModelAndView modifyOfficeCodePrc(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		HttpSession session = request.getSession();

		String officeNm = ServletRequestUtils.getStringParameter(request,
				"office_nm", "");
		String jijumNm = ServletRequestUtils.getStringParameter(request,
				"jijum_nm", "");
		String officeCD = ServletRequestUtils.getStringParameter(request,
				"office_cd", "");
		String jijumCD = ServletRequestUtils.getStringParameter(request,
				"jijum_cd", "");

		// 관리자 데이터를 가져온다.
		UserBean userBean = new UserBean();
		userBean = commonCode.executeUserSearch(util.getSessionID(request,
				"sessionUserId"));
		String guCD = userBean.getSIGU_CD();

		// 오리지널 업체명과 지점명을 가져온다.
		Map retVal = objCommCodeService.selectOfficeJijumNm(officeCD, jijumCD,
				guCD);
		String orgOffceNm = retVal.get("OFFICE_NM").toString();
		String orgJijumNm = "";
		try{
			orgJijumNm = retVal.get("JIJUM_NM").toString();
		}catch(Exception err){
			System.out.println("Error"+err);
		}
		int prcNum = 0;
		boolean result = false;

		if (officeNm.equals(orgOffceNm)) {
			prcNum = 0;

		} else {
			prcNum = 1;

		}
		if (jijumNm.equals(orgJijumNm)) {
			prcNum += 0;

		} else {
			prcNum += 2;

		}
		
		System.out.println("prcNum : "+prcNum);

		switch (prcNum) {

		case 0:
			request.setAttribute("result", "변경된 값이 없습니다.");
			
			break;

		case 1: // 업체명만 변경
			if (officeNm.length() < 1) {
				request.setAttribute("result", "변경할 업체명을 입력하세요");

			} else {
				// 업체명만 update
				if (objCommCodeService.verifyOfficeNm(officeNm, guCD)) {
					request.setAttribute("result", "업체명이 이미 존재합니다.");
				} else {
					result = objCommCodeService.updateOfficeNm(officeNm, officeCD, guCD);
					if(result){
						request.setAttribute("result", "true");
						
					}else{
						request.setAttribute("result", "수정에 실패했습니다.");
					}
									
				}

			}
			
			break;

		case 2: // 지점명만 변경
			// 지점명만 update
			if (objCommCodeService.verifyJijumNm(officeNm, jijumNm, guCD)) {
				request.setAttribute("result", "지점명이 이미 존재합니다.");
			} else {
				if (jijumNm.length() < 1) {
					result = objCommCodeService.updateJijumNm(jijumNm, "0", officeCD,
							jijumCD, guCD);
					if(result){
						request.setAttribute("result", "true");
						
					}else{
						request.setAttribute("result", "수정에 실패했습니다.");
					}
				} else {
					result = objCommCodeService.updateJijumNm(jijumNm, "1", officeCD,
							jijumCD, guCD);
					if(result){
						request.setAttribute("result", "true");
						
					}else{
						request.setAttribute("result", "수정에 실패했습니다.");
					}
				}
			}
			
			break;

		case 3: // 둘다 변경
			if (officeNm.length() < 1) {
				request.setAttribute("result", "변경할 업체명을 입력하세요");

			} else {
				if (objCommCodeService.verifyOfficeNm(officeNm, guCD)) {
					request.setAttribute("result", "업체명이 이미 존재합니다.");
				} else {
					if (objCommCodeService.verifyJijumNm(officeNm, jijumNm,
							guCD)) {
						request.setAttribute("result", "지점명이 이미 존재합니다.");
					} else {
						result = objCommCodeService.updateOfficeNm(officeNm, officeCD, guCD);
						if(result == false){
							request.setAttribute("result", "수정에 실패했습니다.");
							break;
						}

						if (jijumNm.length() < 1) {
							result = objCommCodeService.updateJijumNm(jijumNm, "0", officeCD,
									jijumCD, guCD);
							if(result){
								request.setAttribute("result", "true");
								
							}else{
								request.setAttribute("result", "수정에 실패했습니다.");
							}
						} else {
							result = objCommCodeService.updateJijumNm(jijumNm, "1", officeCD,
									jijumCD, guCD);
							if(result){
								request.setAttribute("result", "true");
								
							}else{
								request.setAttribute("result", "수정에 실패했습니다.");
							}
						}

					}
				}

			}
			break;
		}
		
		
		request.setAttribute("office_nm", officeNm);
		request.setAttribute("jijum_nm", jijumNm);
		request.setAttribute("office_cd", officeCD);
		request.setAttribute("jijum_cd", jijumCD);
		
		request.setAttribute("mode", "modify");

		return new ModelAndView("/admin/commCode/insertOfficeCode");

	}

	public OfficeRegBean insertOffceRegBean(String officeNm, String officeCD,
			String jijumNm, String jijumCD, String jijumCK, String guCD) {
		OfficeRegBean bean = new OfficeRegBean();
		bean.setOFFICE_NM(officeNm);
		bean.setOFFICE_CD(officeCD);
		bean.setJIJUM_NM(jijumNm);
		bean.setJIJUM_CD(jijumCD);
		bean.setJIJUM_CK(jijumCK);
		bean.setGU_CD(guCD);

		return bean;
	}
	//********** BEGIN_KANG_20120416
	public ModelAndView deleteOfficeCodePrc(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		HttpSession session = request.getSession();

		String officeCD = ServletRequestUtils.getStringParameter(request, "office_cd", "");
		String jijumCD = ServletRequestUtils.getStringParameter(request, "jijum_cd", "");
		
		// 관리자 데이터를 가져온다.
		UserBean userBean = new UserBean();
		userBean = commonCode.executeUserSearch(util.getSessionID(request,"sessionUserId"));
		String guCD = userBean.getSIGU_CD();		
		boolean result = objCommCodeService.deleteOffice(officeCD, jijumCD, guCD);
		System.out.println("111111111111111111111111111111111");
		if(result){
			request.setAttribute("result", "delete");	
		}else{
			request.setAttribute("result", "삭제에 실패하였습니다.");
		}
		System.out.println("22222222222222222222222222222222222");
		request.setAttribute("mode", "delete");
		return new ModelAndView("/admin/commCode/insertOfficeCode");

	}

	//********** END_KANG_20120416
}