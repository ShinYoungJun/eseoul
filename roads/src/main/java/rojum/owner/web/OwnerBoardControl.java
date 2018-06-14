/***********************************
 * 수정일 : 2007.9.27
 * 최종수정자 : 최진용
 * 수정내용 :
 ***********************************/

package main.java.rojum.owner.web;


import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.common.commonCode.model.UserBean;
import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.util.BoardUtil;
import main.java.common.util.Globals;
import main.java.common.util.catUtil.Util;
import main.java.rojum.minwon.model.MinwonBean;
import main.java.rojum.owner.model.AccuseBean;
import main.java.rojum.owner.model.ChangeJobBean;
import main.java.rojum.owner.model.SearchBean;
import main.java.rojum.owner.service.IOwnerService;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class OwnerBoardControl extends MultiActionController {
	
	private IOwnerService objOwnerService = null;	
	private	CommonCodeService	commonCode		= null;	
	private	Util				util			= new Util();
	
	
	
	public void setRojum_ownerService(IOwnerService newObjOwnerService) {
		this.objOwnerService = newObjOwnerService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode) 
	{
		this.commonCode 	= commonCode;
	}
	
	//조회화면 이동
	public ModelAndView search(HttpServletRequest request,HttpServletResponse response,String MSG) throws Exception {
		return new ModelAndView("/rojum/owner/search");
	}

	//@ 고발 조회
	public ModelAndView accuseSearch(HttpServletRequest request,HttpServletResponse response,String MSG) throws Exception {
		
//		 삭제 세션
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		SearchBean objSearchBean = null;
			
		try{
			if(userId != null)
			{
				//	관리자 데이터를 가져온다.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
				//		세션에서 시도 코드를 가져온다.
				String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				
                // 현년도 계산
                Calendar cal = Calendar.getInstance();
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                String thisDate = formatter.format(cal.getTime());
                String to_date = formatter.format(cal.getTime());
                String thisYear = to_date.substring(0, 4);
                cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH)-3, cal.get(Calendar.DATE));
                String from_date = formatter.format(cal.getTime());
                
				objSearchBean = new SearchBean();
				
				String gu_cd = ServletRequestUtils.getStringParameter(request,"gu_cd",userBean.getSIGU_CD());
				String owner_name = ServletRequestUtils.getStringParameter(request,"owner_name","");
				
				String fromDate = ServletRequestUtils.getStringParameter(request,"fromDate",from_date);
				String toDate = ServletRequestUtils.getStringParameter(request,"toDate",to_date);
				
				String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
				String strCountPerPage = ServletRequestUtils.getStringParameter(request, "countPerPage", "10");
				
				objSearchBean.setGU_CD(gu_cd);
				objSearchBean.setOWNER_NAME(owner_name);
				objSearchBean.setTODATE(removeDash(toDate));
				objSearchBean.setFROMDATE(removeDash(fromDate));
				objSearchBean.setCOUNTER_PER_PAGE(strCountPerPage);
				objSearchBean.setCURRENT_PAGE(strCurrentPage);
				
				
				//일반 코드 끝		
				int listCount = objOwnerService.getAccuseListCount(objSearchBean);
				
				//paging
				String strPageDivideForm = BoardUtil.getDividePageForm(Integer.parseInt(strCurrentPage),10,
						"&gu_cd="+gu_cd+"&owner_name="+owner_name+"&toDate="+toDate+"&fromDate="+fromDate
						,"", "/rojum/owner/accuse_search.do", listCount);
				
				//일반 코드.
				request.setAttribute("listCount", String.valueOf(listCount));
				request.setAttribute("blist",objOwnerService.getAccuseList(objSearchBean));
				
				request.setAttribute("gu_code", userBean.getSIGU_CD());
				request.setAttribute("gu_list", commonCode.executeGuCdList(userBean.getSIGU_CD(),gu_cd));
				request.setAttribute("owner_name", owner_name);
				request.setAttribute("toDate", removeDash(toDate));
				request.setAttribute("fromDate", removeDash(fromDate));
				request.setAttribute("currentPage", strCurrentPage);
				request.setAttribute("strPageDivideForm", strPageDivideForm);
				request.setAttribute("MSG", MSG);
			}
		} catch(Exception e){
			e.printStackTrace();
		}
		
		return new ModelAndView("/rojum/owner/accuse_search");
	}
	
	// 신규고발
	public ModelAndView newAccuse(HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		System.out.println("newAccuse");
		
//		 삭제 세션
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		AccuseBean bean = new AccuseBean();
		String MSG = "";
		try{
			if(userId != null)
			{
//				//관리자 데이터를 가져온다.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
				
				String ACCUSE_DATE = ServletRequestUtils.getStringParameter(request,"ACCUSE_DATE","");
				String ACCUSE_DATA = ServletRequestUtils.getStringParameter(request,"ACCUSE_DATA","");
				String OWNER_NAME = ServletRequestUtils.getStringParameter(request,"OWNER_NAME","");
				String OWNER_SSN1 = ServletRequestUtils.getStringParameter(request,"OWNER_SSN1","");
				String OWNER_SSN2 = ServletRequestUtils.getStringParameter(request,"OWNER_SSN2","");
				String OWNER_SSN = OWNER_SSN1+OWNER_SSN2;
				
				
				bean.setACCUSE_DATA(ACCUSE_DATA);
				bean.setACCUSE_DATE(removeDash(ACCUSE_DATE));
				bean.setOWNER_NAME(OWNER_NAME);
				bean.setOWNER_SSN(OWNER_SSN);
				bean.setGU_CD(userBean.getSIGU_CD());
				
				
				if(objOwnerService.insertAccuseInfo(bean)){
					MSG = "등록되었습니다.";
				}else{
					MSG = "시스템 오류입니다.";
				}
			}
		} catch(Exception e){
			e.printStackTrace();
		}
		
		return accuseSearch(request, response,MSG);
	}
	
	// 수정고발
	public ModelAndView modifyAccuse(HttpServletRequest request,HttpServletResponse response) throws Exception {
		System.out.println("modifyAccuse");

		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		AccuseBean bean = new AccuseBean();
		String MSG = "";
		try{
			if(userId != null)
			{
				//관리자 데이터를 가져온다.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
				
				String SEQ = ServletRequestUtils.getStringParameter(request,"SEQ","");
				String ACCUSE_DATE = ServletRequestUtils.getStringParameter(request,"ACCUSE_DATE","");
				String ACCUSE_DATA = ServletRequestUtils.getStringParameter(request,"ACCUSE_DATA","");
				String OWNER_NAME = ServletRequestUtils.getStringParameter(request,"OWNER_NAME","");
				String OWNER_SSN1 = ServletRequestUtils.getStringParameter(request,"OWNER_SSN1","");
				String OWNER_SSN2 = ServletRequestUtils.getStringParameter(request,"OWNER_SSN2","");
				String OWNER_SSN = OWNER_SSN1+OWNER_SSN2;
				
				
				bean.setACCUSE_DATA(ACCUSE_DATA);
				bean.setACCUSE_DATE(removeDash(ACCUSE_DATE));
				bean.setOWNER_NAME(OWNER_NAME);
				bean.setOWNER_SSN(OWNER_SSN);
				bean.setSEQ(SEQ);
				bean.setGU_CD(userBean.getSIGU_CD());
				
				
				if(objOwnerService.modifyAccuseInfo(bean)){
					MSG = "수정되었습니다.";
				}else{
					MSG = "시스템 오류입니다.";
				}
			}
		} catch(Exception e){
			e.printStackTrace();
		}
		
		return accuseSearch(request, response,MSG);
	}
	
	// 삭제고발
	public ModelAndView delAccuse(HttpServletRequest request,HttpServletResponse response) throws Exception {
		
//		 삭제 세션
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		AccuseBean bean = new AccuseBean();
		String MSG = "";
		try{
			if(userId != null)
			{
				//관리자 데이터를 가져온다.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
				
				String SEQ = ServletRequestUtils.getStringParameter(request,"SEQ","");
				bean.setSEQ(SEQ);
				bean.setGU_CD(userBean.getSIGU_CD());
				
				if(objOwnerService.deleteAccuseInfo(bean)){
					MSG = "삭제되었습니다.";
				}else{
					MSG = "시스템 오류입니다.";
				}

			}
		} catch(Exception e){
			e.printStackTrace();
		}
		
		return accuseSearch(request, response,MSG);
	}
	
	
	
	
	public String removeDash(String val1)
	{			
		String[] components = val1.split("-");		
		String returnVal = "";		
		for(int i=0;i<components.length;i++)
			returnVal = returnVal + components[i].toString();
		
		return returnVal;		
	}
	
	
	//@ 전업지원 조회
	public ModelAndView changejobSearch(HttpServletRequest request,HttpServletResponse response,String MSG) throws Exception {
		
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		SearchBean objSearchBean = null;
			
		try{
			if(userId != null)
			{
				//	관리자 데이터를 가져온다.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
				//		세션에서 시도 코드를 가져온다.
				String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				
                // 현년도 계산
                Calendar cal = Calendar.getInstance();
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                String thisDate = formatter.format(cal.getTime());
                String to_date = formatter.format(cal.getTime());
                String thisYear = to_date.substring(0, 4);
                cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH)-3, cal.get(Calendar.DATE));
                String from_date = formatter.format(cal.getTime());
                
				objSearchBean = new SearchBean();
				
				String gu_cd = ServletRequestUtils.getStringParameter(request,"gu_cd",userBean.getSIGU_CD());
				String owner_name = ServletRequestUtils.getStringParameter(request,"owner_name","");
				
				String fromDate = ServletRequestUtils.getStringParameter(request,"fromDate",from_date);
				String toDate = ServletRequestUtils.getStringParameter(request,"toDate",to_date);
				
				String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
				String strCountPerPage = ServletRequestUtils.getStringParameter(request, "countPerPage", "10");
				
				objSearchBean.setGU_CD(gu_cd);
				objSearchBean.setOWNER_NAME(owner_name);
				objSearchBean.setTODATE(removeDash(toDate));
				objSearchBean.setFROMDATE(removeDash(fromDate));
				objSearchBean.setCOUNTER_PER_PAGE(strCountPerPage);
				objSearchBean.setCURRENT_PAGE(strCurrentPage);
				
				
				//일반 코드 끝		
				int listCount = objOwnerService.getChangeJobListCount(objSearchBean);
				
				//paging
				String strPageDivideForm = BoardUtil.getDividePageForm(Integer.parseInt(strCurrentPage),10,
						"&gu_cd="+gu_cd+"&owner_name="+owner_name+"&toDate="+toDate+"&fromDate="+fromDate
						,"", "/rojum/owner/changejob_search.do", listCount);
				
				//일반 코드.
				request.setAttribute("listCount", String.valueOf(listCount));
				request.setAttribute("blist",objOwnerService.getChangeJobList(objSearchBean));
				
				request.setAttribute("gu_code", userBean.getSIGU_CD());
				request.setAttribute("gu_list", commonCode.executeGuCdList(userBean.getSIGU_CD(),gu_cd));
				request.setAttribute("cj_typ", commonCode.executeGapanCode("CJ_TYP", "", "선택"));
				request.setAttribute("cj_sec", commonCode.executeGapanCode("CJ_SEC", "", "선택"));
				request.setAttribute("owner_name", owner_name);
				request.setAttribute("toDate", removeDash(toDate));
				request.setAttribute("fromDate", removeDash(fromDate));
				request.setAttribute("currentPage", strCurrentPage);
				request.setAttribute("strPageDivideForm", strPageDivideForm);
				request.setAttribute("MSG", MSG);
			}
		} catch(Exception e){
			e.printStackTrace();
		}
		
		return new ModelAndView("/rojum/owner/changejob_search");
	}
	
	// 신규 전업지원
	public ModelAndView newChangejob(HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		System.out.println("newChangejob");
		
//		 삭제 세션
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		ChangeJobBean bean = new ChangeJobBean();
		String MSG = "";
		try{
			if(userId != null)
			{
//				//관리자 데이터를 가져온다.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
				
				String CHANGE_JOB_DATE = ServletRequestUtils.getStringParameter(request,"CHANGE_JOB_DATE","");
				String OWNER_NAME = ServletRequestUtils.getStringParameter(request,"OWNER_NAME","");
				String OWNER_SSN1 = ServletRequestUtils.getStringParameter(request,"OWNER_SSN1","");
				String OWNER_SSN2 = ServletRequestUtils.getStringParameter(request,"OWNER_SSN2","");
				String OWNER_SSN = OWNER_SSN1+OWNER_SSN2;
				String CHANGE_JOB_TYPE = ServletRequestUtils.getStringParameter(request,"CHANGE_JOB_TYPE","");
				String CHANGE_JOB_SECTION = ServletRequestUtils.getStringParameter(request,"CHANGE_JOB_SECTION","");
				
				
				bean.setCHANGE_JOB_DATE(removeDash(CHANGE_JOB_DATE));
				bean.setOWNER_NAME(OWNER_NAME);
				bean.setOWNER_SSN(OWNER_SSN);
				bean.setCHANGE_JOB_TYPE(CHANGE_JOB_TYPE);
				bean.setCHANGE_JOB_SECTION(CHANGE_JOB_SECTION);
				bean.setGU_CD(userBean.getSIGU_CD());
				
				
				if(objOwnerService.insertChangeJobInfo(bean)){
					MSG = "등록되었습니다.";
				}else{
					MSG = "시스템 오류입니다.";
				}
			}
		} catch(Exception e){
			e.printStackTrace();
		}
		
		return changejobSearch(request, response,MSG);
	}
	
	// 수정 전업지원
	public ModelAndView modifyChangejob(HttpServletRequest request,HttpServletResponse response) throws Exception {
		System.out.println("modifyChangejob");

		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		ChangeJobBean bean = new ChangeJobBean();
		String MSG = "";
		try{
			if(userId != null)
			{
				//관리자 데이터를 가져온다.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
				
				String SEQ = ServletRequestUtils.getStringParameter(request,"SEQ","");
				String CHANGE_JOB_DATE = ServletRequestUtils.getStringParameter(request,"CHANGE_JOB_DATE","");
				String OWNER_NAME = ServletRequestUtils.getStringParameter(request,"OWNER_NAME","");
				String OWNER_SSN1 = ServletRequestUtils.getStringParameter(request,"OWNER_SSN1","");
				String OWNER_SSN2 = ServletRequestUtils.getStringParameter(request,"OWNER_SSN2","");
				String OWNER_SSN = OWNER_SSN1+OWNER_SSN2;
				String CHANGE_JOB_TYPE = ServletRequestUtils.getStringParameter(request,"CHANGE_JOB_TYPE","");
				String CHANGE_JOB_SECTION = ServletRequestUtils.getStringParameter(request,"CHANGE_JOB_SECTION","");
				
				
				
				bean.setCHANGE_JOB_DATE(removeDash(CHANGE_JOB_DATE));
				bean.setOWNER_NAME(OWNER_NAME);
				bean.setOWNER_SSN(OWNER_SSN);
				bean.setCHANGE_JOB_TYPE(CHANGE_JOB_TYPE);
				bean.setCHANGE_JOB_SECTION(CHANGE_JOB_SECTION);
				bean.setSEQ(SEQ);
				bean.setGU_CD(userBean.getSIGU_CD());
				
				
				if(objOwnerService.modifyChangeJobInfo(bean)){
					MSG = "수정되었습니다.";
				}else{
					MSG = "시스템 오류입니다.";
				}
			}
		} catch(Exception e){
			e.printStackTrace();
		}
		
		return changejobSearch(request, response,MSG);
	}
	
	// 삭제 전업지원
	public ModelAndView delChangejob(HttpServletRequest request,HttpServletResponse response) throws Exception {
		
//		 삭제 세션
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		ChangeJobBean bean = new ChangeJobBean();
		String MSG = "";
		try{
			if(userId != null)
			{
				//관리자 데이터를 가져온다.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
				
				String SEQ = ServletRequestUtils.getStringParameter(request,"SEQ","");
				bean.setSEQ(SEQ);
				bean.setGU_CD(userBean.getSIGU_CD());
				
				if(objOwnerService.deleteChangeJob(bean)){
					MSG = "삭제되었습니다.";
				}else{
					MSG = "시스템 오류입니다.";
				}

			}
		} catch(Exception e){
			e.printStackTrace();
		}
		
		return changejobSearch(request, response,MSG);
	}
	
	
	
	
}
