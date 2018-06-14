package main.java.admin.web;

import java.text.SimpleDateFormat;
import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.admin.service.AdminService;
import main.java.admin.service.IadminService;
import main.java.common.util.BoardUtil;
import main.java.common.util.Globals;
import main.java.common.util.catUtil.Util;
import main.java.common.commonCode.model.UserBean;
import main.java.common.commonCode.service.CommonCodeService;
import main.java.admin.model.GapanDeleteMoveBean;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
//********** BEGIN_현진_20120306
import main.java.rojum.survey.service.ISurveyService;
import main.java.rojum.survey.model.GapanInfoBean;
import main.java.rojum.survey.model.GapanHeadBean;
import main.java.rojum.survey.model.GapanBaseBean;
//********** END_현진_20120306
//********** BEGIN_현진_20120309
import main.java.admin.model.SectionBean; 
//********** END_현진_20120309

public class AdminControl extends MultiActionController {

	private IadminService adminService = null;
	private	CommonCodeService	commonCode		= null;	

	private Util util = new Util();

	public void setAdminService(IadminService newAdminService) {
		this.adminService = newAdminService;
	}
	//********** BEGIN_현진_20120306
	private ISurveyService objSurveyService = null;	

	public void setRojum_SurveyService(ISurveyService newObjSurveyService) {
		this.objSurveyService = newObjSurveyService;
	}
	//********** END_현진_20120306
	public void setCommonCodeService(CommonCodeService commonCode) 
	{
		this.commonCode 	= commonCode;
	}
	
	public ModelAndView sectionList(HttpServletRequest request, HttpServletResponse response,  String message) throws Exception 
	{
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		List<SectionBean> sectionList = null;
		try{
			if(userId != null){
				// 세션에서 시도 코드를 가져온다.
				String SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				
				
//				관리자 데이터를 가져온다.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));				
				
				String GU_CD = ServletRequestUtils.getStringParameter(request,"GU_CD",userBean.getSIGU_CD());				
				System.out.println("SIDO_CD : " + SIDO_CD);
				request.setAttribute("GU_CODE", commonCode.executeGuCdList(userBean.getSIGU_CD(),GU_CD));	//	시군구
				
				int intCurrentPage = 0;
				int intCountPerPage = 0;
				
				String strCurrentPage = ServletRequestUtils.getStringParameter(request,	"currentPage", Globals.DEFAULT_CURRENT_PAGE);
				String strCountPerPage = ServletRequestUtils.getStringParameter(request, "countPerPage", Globals.DEFAULT_COUNTPER_PAGE);
				String strSiName = ServletRequestUtils.getStringParameter(request,"siName", "");
				String strGuName = ServletRequestUtils.getStringParameter(request,"guName", "");
				String strHdName = ServletRequestUtils.getStringParameter(request,"hdName", "");				
				String strActionUrl = request.getContextPath();
				String strParams = "&GU_CD=" + GU_CD;
				
				intCurrentPage = Integer.parseInt(strCurrentPage);
				intCountPerPage = Integer.parseInt(strCountPerPage);
				request.setAttribute("currentPage", strCurrentPage);
				request.setAttribute("countPerPage", strCountPerPage);				
				
				int totalCount = adminService.getSectionCount(GU_CD);
				sectionList = adminService.getSectionList(GU_CD, intCurrentPage, intCountPerPage);
				String strPageDivideForm = BoardUtil.getDividePageForm(intCurrentPage,intCountPerPage, strParams, "", strActionUrl, totalCount);
				
				request.setAttribute("totalCount",totalCount);
				request.setAttribute("strPageDivideForm",strPageDivideForm);
				request.setAttribute("MSG", message);
				
				request.setAttribute("MenuCheck",userBean.getSIGU_CD());	

			}
		}catch(Exception e){
			System.out.println("sectionList 에러 : " + e);
		}		
		return new ModelAndView("/admin/section/list", "sectionList", sectionList);
	}
	

	public ModelAndView registerView(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		SectionBean bean = new SectionBean();
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
				
				String GU_CD = ServletRequestUtils.getStringParameter(request,"GU_CD",userBean.getSIGU_CD());				
				System.out.println("SIDO_CD : " + SIDO_CD);
				

				if(mode.equals("modify")){
					String modyGU_CD = request.getParameter("modyGU_CD");
					String modyGUGAN_CD = request.getParameter("modyGUGAN_CD");
					
			        bean.setGU_CD(modyGU_CD);
			        bean.setGUGAN_CD(modyGUGAN_CD);
			        
			        List<SectionBean> list = adminService.getSectionSelectList(bean);
			        bean = (SectionBean)list.get(0);
			        GU_CD = bean.getGU_CD();
			        
			        request.setAttribute("modyGU_CD", modyGU_CD);
					request.setAttribute("modyGUGAN_CD", modyGUGAN_CD);
				}

				request.setAttribute("GU_CODE", commonCode.executeGuCdList(userBean.getSIGU_CD(),GU_CD));	//	시군구
				request.setAttribute("mode", mode);
				request.setAttribute("MSG", MSG);
				request.setAttribute("YN", YN);
				
				
				request.setAttribute("SectionBean", bean);
				

			}
		}catch(Exception e){
			System.out.println("registerView 에러 : " + e);
		}		

		return new ModelAndView("/admin/section/register");
	}


	public ModelAndView sectionRegister(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		SectionBean bean = new SectionBean();
		String massage = "";
		boolean YN = true;
		try{
			bind(request,bean);
			if(userId != null){		
				String mode = ServletRequestUtils.getStringParameter(request,"mode","add");
			
				if(mode.equals("add")){
					YN = adminService.setSectionInsert(bean);
					massage = "입력되었습니다.";
				}else if(mode.equals("modify")){
					String modyGU_CD = request.getParameter("modyGU_CD");
					String modyGUGAN_CD = request.getParameter("modyGUGAN_CD");
					YN = adminService.setSectionUpdate(bean, modyGU_CD, modyGUGAN_CD);
					massage = "수정되었습니다.";
				}
				
				if(!YN){
					massage = "이미 입력되어있는 구간입니다.";
				}
				
				request.setAttribute("MSG", massage);
				request.setAttribute("YN", YN);
			}
		}catch(Exception e){
			System.out.println("sectionRegister 에러 : " + e);
		}		

		return registerView(request, response);
	}
	
	public ModelAndView sectionDelete(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		SectionBean bean = new SectionBean();
		String message = "";
		try{			
			if(userId != null){		
				String[] ITEM_CHECK_ARR = request.getParameterValues("ITEM_CHECK");
		        String[] GU_CD_ARR = request.getParameterValues("GU_CD_ARR");
		        String[] GUGAN_CD_ARR = request.getParameterValues("GUGAN_CD_ARR");
				
		        int listCount = 0;	    

		        for(int i = 0 ; i < ITEM_CHECK_ARR.length ; i++){
					System.out.println("ITEM_CHECK_ARR[i] : " + ITEM_CHECK_ARR[i]);

		        	if(ITEM_CHECK_ARR[i].equals("true")){
		        		bean.setGU_CD(GU_CD_ARR[i]);
		        		bean.setGUGAN_CD(GUGAN_CD_ARR[i]);
		        		adminService.sectionDelete(bean);
		        		listCount++;
	            	}
		        }
		        message = listCount + "건 삭제되었습니다.";
			}
		}catch(Exception e){
			System.out.println("sectionDelete 에러 : " + e);
		}		

		return sectionList(request, response, message);
	}
	

	// 가판 일괄삭제 및 폐쇄 화면 리스트 노출
	public ModelAndView gapanDeleteMove(HttpServletRequest request, HttpServletResponse response, String massage) throws Exception {
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		
		try{
			if(userId != null){
				// 세션에서 시도 코드를 가져온다.
				String SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				
//				관리자 데이터를 가져온다.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
				
				String YEAR = ServletRequestUtils.getStringParameter(request,"YEAR",thisYear());				
				String GU_CD = ServletRequestUtils.getStringParameter(request,"GU_CD",userBean.getSIGU_CD());
				
				request.setAttribute("GU_CODE", commonCode.executeGuCdList(userBean.getSIGU_CD(),GU_CD));	//	시군구
				request.setAttribute("YEAR", YEAR);
				request.setAttribute("MSG", massage);
				
				
			}
		}catch(Exception e){
			System.out.println("deleteMove 에러 : " + e);
		}		
		return new ModelAndView("/admin/deleteMove/list");
	}
	
	// 가판 삭제
	public ModelAndView gapanDelete(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		
		String massage = "";
		GapanDeleteMoveBean bean = new GapanDeleteMoveBean();
		bind(request,bean);
		
		try{
			if(userId != null){
				// 세션에서 시도 코드를 가져온다.
				String SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				
//				관리자 데이터를 가져온다.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));				
				int cnt = 0;
/*
				if(!(userBean.getSIGU_CD().equals("000"))){
					massage = "삭제는 서울시 담당자만 가능합니다.";
				}else{
					
					try{
						cnt = gapanDeleteMoveCount(bean.getGU_CD(), bean.getGAPAN_NO(), bean.getSURVEY_YEAR());
						if(cnt > 0){
							adminService.executeDeleteGapan(bean.getGU_CD(), bean.getGAPAN_NO(), bean.getSURVEY_YEAR());	
							massage = "삭제되었습니다";	
						}else{
							massage = "삭제 대상이 존재하지 않습니다.";
						}
						
					}catch(Exception ex){
						System.out.println("gapanDelete - 쿼리에서 에러 : " + ex);
						massage = "에러 : 삭제에 실패하였습니다.";
					}
				}*/
				try{
					cnt = gapanDeleteMoveCount(bean.getGU_CD(), bean.getGAPAN_NO(), bean.getSURVEY_YEAR());
					if(cnt > 0){
						adminService.executeDeleteGapan(bean.getGU_CD(), bean.getGAPAN_NO(), bean.getSURVEY_YEAR());	
						massage = "삭제되었습니다";	
					}else{
						massage = "삭제 대상이 존재하지 않습니다.";
					}
					
				}catch(Exception ex){
					System.out.println("gapanDelete - 쿼리에서 에러 : " + ex);
					massage = "에러 : 삭제에 실패하였습니다.";
				}
			}
		}catch(Exception e){
			System.out.println("delete 에러 : " + e);
		}		
		return gapanDeleteMove(request, response, massage);
	}
	
	// 가판 복사
	public ModelAndView gapanMove(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		
		String massage = "";
		GapanDeleteMoveBean bean = new GapanDeleteMoveBean();
		bind(request,bean);
		
		try{
			if(userId != null){
				// 세션에서 시도 코드를 가져온다.
				String SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				
//				관리자 데이터를 가져온다.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
				int cnt = 0;
				/*
				if(!(userBean.getSIGU_CD().equals("000"))){
					massage = "서울시 담당자만 가능합니다.";
				}else{					
					try{
						cnt = gapanDeleteMoveCount(bean.getGU_CD(), bean.getGAPAN_NO(), bean.getBEFORE_SURVEY_YEAR());
						if(cnt > 0){
							//********** BEGIN_현진_20120306							
							GapanBaseBean gapanBaseBean = new GapanBaseBean();  
							GapanHeadBean gapanHeadBean = new GapanHeadBean();  
							GapanInfoBean gapanInfoBean = new GapanInfoBean();  
							GapanInfoBean Bean = new GapanInfoBean();
							
							String gapanNo = "";
							String NewGapanNo = "";
							List gapanNoList = adminService.getBeforeGapanNo(bean.getGU_CD(), bean.getGAPAN_NO(), bean.getBEFORE_SURVEY_YEAR());
							
							List tempGapanBaseList = null;
							List tempBapanHeadList = null;							
							List tempGapanInfoList = null;
							
							
							int succCount = 0;
							int failCount = 0;
							System.out.println("gapanNoList.size() : " + gapanNoList.size());
							if(gapanNoList.size() > 0){
								for(int i = 0; i < gapanNoList.size();i++ ){
									try{
										Bean = (GapanInfoBean)gapanNoList.get(i);									
										gapanNo = Bean.getGAPAN_NO();
										NewGapanNo = Gapan_No_Maker(gapanNo.substring(0,6));
										System.out.println("gapanNo : " + gapanNo);
										System.out.println("NewGapanNo : " + NewGapanNo);
										
										// ADMIN_BASE에 저장한다.										
										tempGapanBaseList = adminService.getGapanBase(gapanNo);
										gapanBaseBean = (GapanBaseBean)tempGapanBaseList.get(0);
										gapanBaseBean.setGAPAN_NO(NewGapanNo);
										
										//********** BEGIN_현진_20120316
										Calendar cal = Calendar.getInstance();
								        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
								        String thisDate = formatter.format(cal.getTime());
								        System.out.println("===========================" + thisDate);
										gapanBaseBean.setUP_DATE(thisDate);
										//********** END_현진_20120316
										
										objSurveyService.executeGapan_Base_Register(gapanBaseBean);

										// GAPAN_HEAD  테이블에 저장한다.
										tempBapanHeadList = adminService.getGapanHead(gapanNo);
										gapanHeadBean = (GapanHeadBean)tempBapanHeadList.get(0);
										gapanHeadBean.setGAPAN_NO(NewGapanNo);
										objSurveyService.executeGapan_Head_Register(gapanHeadBean);
										
										// GAPAN_INFO  테이블에 저장한다.
										tempGapanInfoList = adminService.getGapanInfo(gapanNo,bean.getBEFORE_SURVEY_YEAR());
										gapanInfoBean = (GapanInfoBean)tempGapanInfoList.get(0);
										gapanInfoBean.setGAPAN_NO(NewGapanNo);
										gapanInfoBean.setSURVEY_YEAR(bean.getAFTER_SURVEY_YEAR());
										objSurveyService.executeGapan_Info_Register(gapanInfoBean);

										succCount++;
									}catch(Exception ee){
										System.out.println("gapanMove - 저장에서 에러 : " + ee);
										failCount++;
									}
								}						
							}
														
							//adminService.executeMoveGapan(bean.getGU_CD(), bean.getGAPAN_NO(), bean.getBEFORE_SURVEY_YEAR(), bean.getAFTER_SURVEY_YEAR());
							//********** END_현진_20120306
							massage = cnt + "건 중 " + succCount + "복사, " + failCount + " 실패하였습니다";	
						}else{
							massage = "복사 대상이 없습니다.";
						}
						
					}catch(Exception ex){
						System.out.println("gapanMove - 쿼리에서 에러 : " + ex);
						massage = "에러 : 복사에 실패하였습니다.";
					}
				}*/
				try{
					cnt = gapanDeleteMoveCount(bean.getGU_CD(), bean.getGAPAN_NO(), bean.getBEFORE_SURVEY_YEAR());
					if(cnt > 0){
						//********** BEGIN_현진_20120306							
						GapanBaseBean gapanBaseBean = new GapanBaseBean();  
						GapanHeadBean gapanHeadBean = new GapanHeadBean();  
						GapanInfoBean gapanInfoBean = new GapanInfoBean();  
						GapanInfoBean Bean = new GapanInfoBean();
						
						String gapanNo = "";
						String NewGapanNo = "";
						List gapanNoList = adminService.getBeforeGapanNo(bean.getGU_CD(), bean.getGAPAN_NO(), bean.getBEFORE_SURVEY_YEAR());
						
						List tempGapanBaseList = null;
						List tempBapanHeadList = null;							
						List tempGapanInfoList = null;
						
						
						int succCount = 0;
						int failCount = 0;
						System.out.println("gapanNoList.size() : " + gapanNoList.size());
						if(gapanNoList.size() > 0){
							for(int i = 0; i < gapanNoList.size();i++ ){
								try{
									Bean = (GapanInfoBean)gapanNoList.get(i);									
									gapanNo = Bean.getGAPAN_NO();
									NewGapanNo = Gapan_No_Maker(gapanNo.substring(0,6));
									System.out.println("gapanNo : " + gapanNo);
									System.out.println("NewGapanNo : " + NewGapanNo);
									
									// ADMIN_BASE에 저장한다.										
									tempGapanBaseList = adminService.getGapanBase(gapanNo);
									gapanBaseBean = (GapanBaseBean)tempGapanBaseList.get(0);
									gapanBaseBean.setGAPAN_NO(NewGapanNo);
									
									//********** BEGIN_현진_20120316
									Calendar cal = Calendar.getInstance();
							        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
							        String thisDate = formatter.format(cal.getTime());
							        System.out.println("===========================" + thisDate);
									gapanBaseBean.setUP_DATE(thisDate);
									//********** END_현진_20120316
									
									objSurveyService.executeGapan_Base_Register(gapanBaseBean);

									// GAPAN_HEAD  테이블에 저장한다.
									tempBapanHeadList = adminService.getGapanHead(gapanNo);
									gapanHeadBean = (GapanHeadBean)tempBapanHeadList.get(0);
									gapanHeadBean.setGAPAN_NO(NewGapanNo);
									objSurveyService.executeGapan_Head_Register(gapanHeadBean);
									
									// GAPAN_INFO  테이블에 저장한다.
									tempGapanInfoList = adminService.getGapanInfo(gapanNo,bean.getBEFORE_SURVEY_YEAR());
									gapanInfoBean = (GapanInfoBean)tempGapanInfoList.get(0);
									gapanInfoBean.setGAPAN_NO(NewGapanNo);
									gapanInfoBean.setSURVEY_YEAR(bean.getAFTER_SURVEY_YEAR());
									objSurveyService.executeGapan_Info_Register(gapanInfoBean);

									succCount++;
								}catch(Exception ee){
									System.out.println("gapanMove - 저장에서 에러 : " + ee);
									failCount++;
								}
							}						
						}
													
						//adminService.executeMoveGapan(bean.getGU_CD(), bean.getGAPAN_NO(), bean.getBEFORE_SURVEY_YEAR(), bean.getAFTER_SURVEY_YEAR());
						//********** END_현진_20120306
						massage = cnt + "건 중 " + succCount + "복사, " + failCount + " 실패하였습니다";	
					}else{
						massage = "복사 대상이 없습니다.";
					}
					
				}catch(Exception ex){
					System.out.println("gapanMove - 쿼리에서 에러 : " + ex);
					massage = "에러 : 복사에 실패하였습니다.";
				}
			}
		}catch(Exception e){
			System.out.println("gapanMove 에러 : " + e);
		}		
		return gapanDeleteMove(request, response, massage);
	}
	
	
	
	// 당해년도 가져오기
	public String thisYear(){
		Calendar cal = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        String thisDate = formatter.format(cal.getTime());
        String thisYear = thisDate.substring(0, 4);
        
        return thisYear;
	}
	
	// 가판 일괄삭제 및 복사 대상 Count
	public int gapanDeleteMoveCount(String guCd,String gapanNo,String surveyYear){
		int cnt = 0;
		try{
			cnt = adminService.executeCountGapan(guCd, gapanNo, surveyYear);	
		}catch(Exception ex){
			System.out.println("gapanDeleteMoveCount - 쿼리에서 에러 : " + ex);
		}
		return cnt;
	}
	
	//********** BEGIN_현진_20120319
	//********** END_현진_20120319
	
//	관리 번호 생성 main.java.rojum.survey.web.SurveyBoardControl 에도 같은 함수 존재함  
	
	private	String	Gapan_No_Maker(String gapan_num){
		
		String	GAPAN_NO	= null;		
		try	{
			GAPAN_NO	= objSurveyService.executeCheck_Gapanno(gapan_num);
		}catch(Exception e){
			GAPAN_NO	= null;
		}		
		return	GAPAN_NO;
	}
	//********** BEGIN_현진_20120319
	public ModelAndView changeGapanUpdate(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		
		String massage = "";
		try{
			if(userId != null){
				// 세션에서 시도 코드를 가져온다.
				String SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				String UPDATE = ServletRequestUtils.getStringParameter(request,"UPDATE","");
				String SURVEY_YEAR = ServletRequestUtils.getStringParameter(request,"YEAR","");				
				UPDATE = UPDATE.replace("-", "");
		        System.out.println("===========================" + UPDATE);
//				관리자 데이터를 가져온다.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));				
				int cnt = 0;
/*
				if(!(userBean.getSIGU_CD().equals("000"))){
					massage = "서울시 담당자만 가능합니다.";
				}else{
					
					try{
						adminService.changeGapanUpdate(UPDATE, SURVEY_YEAR);	
						massage = "변경되었습니다.";	
						
					}catch(Exception ex){
						System.out.println("gapanDelete - 쿼리에서 에러 : " + ex);
						massage = "에러 : 갱신일 변경 실패하였습니다.";
					}
				}*/
				try{
					adminService.changeGapanUpdate(UPDATE, SURVEY_YEAR);	
					massage = "변경되었습니다.";	
					
				}catch(Exception ex){
					System.out.println("gapanDelete - 쿼리에서 에러 : " + ex);
					massage = "에러 : 갱신일 변경 실패하였습니다.";
				}
			}
		}catch(Exception e){
			System.out.println("changeGapanUpdate 에러 : " + e);
		}		
		return gapanDeleteMove(request, response, massage);
	}
	//********** END_현진_20120319

}
