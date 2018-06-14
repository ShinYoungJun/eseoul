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
//********** BEGIN_����_20120306
import main.java.rojum.survey.service.ISurveyService;
import main.java.rojum.survey.model.GapanInfoBean;
import main.java.rojum.survey.model.GapanHeadBean;
import main.java.rojum.survey.model.GapanBaseBean;
//********** END_����_20120306
//********** BEGIN_����_20120309
import main.java.admin.model.SectionBean; 
//********** END_����_20120309

public class AdminControl extends MultiActionController {

	private IadminService adminService = null;
	private	CommonCodeService	commonCode		= null;	

	private Util util = new Util();

	public void setAdminService(IadminService newAdminService) {
		this.adminService = newAdminService;
	}
	//********** BEGIN_����_20120306
	private ISurveyService objSurveyService = null;	

	public void setRojum_SurveyService(ISurveyService newObjSurveyService) {
		this.objSurveyService = newObjSurveyService;
	}
	//********** END_����_20120306
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
				// ���ǿ��� �õ� �ڵ带 �����´�.
				String SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				
				
//				������ �����͸� �����´�.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));				
				
				String GU_CD = ServletRequestUtils.getStringParameter(request,"GU_CD",userBean.getSIGU_CD());				
				System.out.println("SIDO_CD : " + SIDO_CD);
				request.setAttribute("GU_CODE", commonCode.executeGuCdList(userBean.getSIGU_CD(),GU_CD));	//	�ñ���
				
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
			System.out.println("sectionList ���� : " + e);
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
				// ���ǿ��� �õ� �ڵ带 �����´�.
				String SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				String mode = ServletRequestUtils.getStringParameter(request,"mode","add");
				String MSG = (String)request.getAttribute("MSG");
				Boolean YN = (Boolean)request.getAttribute("YN");
				
				
				// ������ �����͸� �����´�.
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

				request.setAttribute("GU_CODE", commonCode.executeGuCdList(userBean.getSIGU_CD(),GU_CD));	//	�ñ���
				request.setAttribute("mode", mode);
				request.setAttribute("MSG", MSG);
				request.setAttribute("YN", YN);
				
				
				request.setAttribute("SectionBean", bean);
				

			}
		}catch(Exception e){
			System.out.println("registerView ���� : " + e);
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
					massage = "�ԷµǾ����ϴ�.";
				}else if(mode.equals("modify")){
					String modyGU_CD = request.getParameter("modyGU_CD");
					String modyGUGAN_CD = request.getParameter("modyGUGAN_CD");
					YN = adminService.setSectionUpdate(bean, modyGU_CD, modyGUGAN_CD);
					massage = "�����Ǿ����ϴ�.";
				}
				
				if(!YN){
					massage = "�̹� �ԷµǾ��ִ� �����Դϴ�.";
				}
				
				request.setAttribute("MSG", massage);
				request.setAttribute("YN", YN);
			}
		}catch(Exception e){
			System.out.println("sectionRegister ���� : " + e);
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
		        message = listCount + "�� �����Ǿ����ϴ�.";
			}
		}catch(Exception e){
			System.out.println("sectionDelete ���� : " + e);
		}		

		return sectionList(request, response, message);
	}
	

	// ���� �ϰ����� �� ��� ȭ�� ����Ʈ ����
	public ModelAndView gapanDeleteMove(HttpServletRequest request, HttpServletResponse response, String massage) throws Exception {
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		
		try{
			if(userId != null){
				// ���ǿ��� �õ� �ڵ带 �����´�.
				String SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				
//				������ �����͸� �����´�.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
				
				String YEAR = ServletRequestUtils.getStringParameter(request,"YEAR",thisYear());				
				String GU_CD = ServletRequestUtils.getStringParameter(request,"GU_CD",userBean.getSIGU_CD());
				
				request.setAttribute("GU_CODE", commonCode.executeGuCdList(userBean.getSIGU_CD(),GU_CD));	//	�ñ���
				request.setAttribute("YEAR", YEAR);
				request.setAttribute("MSG", massage);
				
				
			}
		}catch(Exception e){
			System.out.println("deleteMove ���� : " + e);
		}		
		return new ModelAndView("/admin/deleteMove/list");
	}
	
	// ���� ����
	public ModelAndView gapanDelete(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		
		String massage = "";
		GapanDeleteMoveBean bean = new GapanDeleteMoveBean();
		bind(request,bean);
		
		try{
			if(userId != null){
				// ���ǿ��� �õ� �ڵ带 �����´�.
				String SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				
//				������ �����͸� �����´�.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));				
				int cnt = 0;
/*
				if(!(userBean.getSIGU_CD().equals("000"))){
					massage = "������ ����� ����ڸ� �����մϴ�.";
				}else{
					
					try{
						cnt = gapanDeleteMoveCount(bean.getGU_CD(), bean.getGAPAN_NO(), bean.getSURVEY_YEAR());
						if(cnt > 0){
							adminService.executeDeleteGapan(bean.getGU_CD(), bean.getGAPAN_NO(), bean.getSURVEY_YEAR());	
							massage = "�����Ǿ����ϴ�";	
						}else{
							massage = "���� ����� �������� �ʽ��ϴ�.";
						}
						
					}catch(Exception ex){
						System.out.println("gapanDelete - �������� ���� : " + ex);
						massage = "���� : ������ �����Ͽ����ϴ�.";
					}
				}*/
				try{
					cnt = gapanDeleteMoveCount(bean.getGU_CD(), bean.getGAPAN_NO(), bean.getSURVEY_YEAR());
					if(cnt > 0){
						adminService.executeDeleteGapan(bean.getGU_CD(), bean.getGAPAN_NO(), bean.getSURVEY_YEAR());	
						massage = "�����Ǿ����ϴ�";	
					}else{
						massage = "���� ����� �������� �ʽ��ϴ�.";
					}
					
				}catch(Exception ex){
					System.out.println("gapanDelete - �������� ���� : " + ex);
					massage = "���� : ������ �����Ͽ����ϴ�.";
				}
			}
		}catch(Exception e){
			System.out.println("delete ���� : " + e);
		}		
		return gapanDeleteMove(request, response, massage);
	}
	
	// ���� ����
	public ModelAndView gapanMove(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		
		String massage = "";
		GapanDeleteMoveBean bean = new GapanDeleteMoveBean();
		bind(request,bean);
		
		try{
			if(userId != null){
				// ���ǿ��� �õ� �ڵ带 �����´�.
				String SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				
//				������ �����͸� �����´�.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
				int cnt = 0;
				/*
				if(!(userBean.getSIGU_CD().equals("000"))){
					massage = "����� ����ڸ� �����մϴ�.";
				}else{					
					try{
						cnt = gapanDeleteMoveCount(bean.getGU_CD(), bean.getGAPAN_NO(), bean.getBEFORE_SURVEY_YEAR());
						if(cnt > 0){
							//********** BEGIN_����_20120306							
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
										
										// ADMIN_BASE�� �����Ѵ�.										
										tempGapanBaseList = adminService.getGapanBase(gapanNo);
										gapanBaseBean = (GapanBaseBean)tempGapanBaseList.get(0);
										gapanBaseBean.setGAPAN_NO(NewGapanNo);
										
										//********** BEGIN_����_20120316
										Calendar cal = Calendar.getInstance();
								        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
								        String thisDate = formatter.format(cal.getTime());
								        System.out.println("===========================" + thisDate);
										gapanBaseBean.setUP_DATE(thisDate);
										//********** END_����_20120316
										
										objSurveyService.executeGapan_Base_Register(gapanBaseBean);

										// GAPAN_HEAD  ���̺� �����Ѵ�.
										tempBapanHeadList = adminService.getGapanHead(gapanNo);
										gapanHeadBean = (GapanHeadBean)tempBapanHeadList.get(0);
										gapanHeadBean.setGAPAN_NO(NewGapanNo);
										objSurveyService.executeGapan_Head_Register(gapanHeadBean);
										
										// GAPAN_INFO  ���̺� �����Ѵ�.
										tempGapanInfoList = adminService.getGapanInfo(gapanNo,bean.getBEFORE_SURVEY_YEAR());
										gapanInfoBean = (GapanInfoBean)tempGapanInfoList.get(0);
										gapanInfoBean.setGAPAN_NO(NewGapanNo);
										gapanInfoBean.setSURVEY_YEAR(bean.getAFTER_SURVEY_YEAR());
										objSurveyService.executeGapan_Info_Register(gapanInfoBean);

										succCount++;
									}catch(Exception ee){
										System.out.println("gapanMove - ���忡�� ���� : " + ee);
										failCount++;
									}
								}						
							}
														
							//adminService.executeMoveGapan(bean.getGU_CD(), bean.getGAPAN_NO(), bean.getBEFORE_SURVEY_YEAR(), bean.getAFTER_SURVEY_YEAR());
							//********** END_����_20120306
							massage = cnt + "�� �� " + succCount + "����, " + failCount + " �����Ͽ����ϴ�";	
						}else{
							massage = "���� ����� �����ϴ�.";
						}
						
					}catch(Exception ex){
						System.out.println("gapanMove - �������� ���� : " + ex);
						massage = "���� : ���翡 �����Ͽ����ϴ�.";
					}
				}*/
				try{
					cnt = gapanDeleteMoveCount(bean.getGU_CD(), bean.getGAPAN_NO(), bean.getBEFORE_SURVEY_YEAR());
					if(cnt > 0){
						//********** BEGIN_����_20120306							
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
									
									// ADMIN_BASE�� �����Ѵ�.										
									tempGapanBaseList = adminService.getGapanBase(gapanNo);
									gapanBaseBean = (GapanBaseBean)tempGapanBaseList.get(0);
									gapanBaseBean.setGAPAN_NO(NewGapanNo);
									
									//********** BEGIN_����_20120316
									Calendar cal = Calendar.getInstance();
							        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
							        String thisDate = formatter.format(cal.getTime());
							        System.out.println("===========================" + thisDate);
									gapanBaseBean.setUP_DATE(thisDate);
									//********** END_����_20120316
									
									objSurveyService.executeGapan_Base_Register(gapanBaseBean);

									// GAPAN_HEAD  ���̺� �����Ѵ�.
									tempBapanHeadList = adminService.getGapanHead(gapanNo);
									gapanHeadBean = (GapanHeadBean)tempBapanHeadList.get(0);
									gapanHeadBean.setGAPAN_NO(NewGapanNo);
									objSurveyService.executeGapan_Head_Register(gapanHeadBean);
									
									// GAPAN_INFO  ���̺� �����Ѵ�.
									tempGapanInfoList = adminService.getGapanInfo(gapanNo,bean.getBEFORE_SURVEY_YEAR());
									gapanInfoBean = (GapanInfoBean)tempGapanInfoList.get(0);
									gapanInfoBean.setGAPAN_NO(NewGapanNo);
									gapanInfoBean.setSURVEY_YEAR(bean.getAFTER_SURVEY_YEAR());
									objSurveyService.executeGapan_Info_Register(gapanInfoBean);

									succCount++;
								}catch(Exception ee){
									System.out.println("gapanMove - ���忡�� ���� : " + ee);
									failCount++;
								}
							}						
						}
													
						//adminService.executeMoveGapan(bean.getGU_CD(), bean.getGAPAN_NO(), bean.getBEFORE_SURVEY_YEAR(), bean.getAFTER_SURVEY_YEAR());
						//********** END_����_20120306
						massage = cnt + "�� �� " + succCount + "����, " + failCount + " �����Ͽ����ϴ�";	
					}else{
						massage = "���� ����� �����ϴ�.";
					}
					
				}catch(Exception ex){
					System.out.println("gapanMove - �������� ���� : " + ex);
					massage = "���� : ���翡 �����Ͽ����ϴ�.";
				}
			}
		}catch(Exception e){
			System.out.println("gapanMove ���� : " + e);
		}		
		return gapanDeleteMove(request, response, massage);
	}
	
	
	
	// ���س⵵ ��������
	public String thisYear(){
		Calendar cal = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        String thisDate = formatter.format(cal.getTime());
        String thisYear = thisDate.substring(0, 4);
        
        return thisYear;
	}
	
	// ���� �ϰ����� �� ���� ��� Count
	public int gapanDeleteMoveCount(String guCd,String gapanNo,String surveyYear){
		int cnt = 0;
		try{
			cnt = adminService.executeCountGapan(guCd, gapanNo, surveyYear);	
		}catch(Exception ex){
			System.out.println("gapanDeleteMoveCount - �������� ���� : " + ex);
		}
		return cnt;
	}
	
	//********** BEGIN_����_20120319
	//********** END_����_20120319
	
//	���� ��ȣ ���� main.java.rojum.survey.web.SurveyBoardControl ���� ���� �Լ� ������  
	
	private	String	Gapan_No_Maker(String gapan_num){
		
		String	GAPAN_NO	= null;		
		try	{
			GAPAN_NO	= objSurveyService.executeCheck_Gapanno(gapan_num);
		}catch(Exception e){
			GAPAN_NO	= null;
		}		
		return	GAPAN_NO;
	}
	//********** BEGIN_����_20120319
	public ModelAndView changeGapanUpdate(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		
		String massage = "";
		try{
			if(userId != null){
				// ���ǿ��� �õ� �ڵ带 �����´�.
				String SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				String UPDATE = ServletRequestUtils.getStringParameter(request,"UPDATE","");
				String SURVEY_YEAR = ServletRequestUtils.getStringParameter(request,"YEAR","");				
				UPDATE = UPDATE.replace("-", "");
		        System.out.println("===========================" + UPDATE);
//				������ �����͸� �����´�.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));				
				int cnt = 0;
/*
				if(!(userBean.getSIGU_CD().equals("000"))){
					massage = "����� ����ڸ� �����մϴ�.";
				}else{
					
					try{
						adminService.changeGapanUpdate(UPDATE, SURVEY_YEAR);	
						massage = "����Ǿ����ϴ�.";	
						
					}catch(Exception ex){
						System.out.println("gapanDelete - �������� ���� : " + ex);
						massage = "���� : ������ ���� �����Ͽ����ϴ�.";
					}
				}*/
				try{
					adminService.changeGapanUpdate(UPDATE, SURVEY_YEAR);	
					massage = "����Ǿ����ϴ�.";	
					
				}catch(Exception ex){
					System.out.println("gapanDelete - �������� ���� : " + ex);
					massage = "���� : ������ ���� �����Ͽ����ϴ�.";
				}
			}
		}catch(Exception e){
			System.out.println("changeGapanUpdate ���� : " + e);
		}		
		return gapanDeleteMove(request, response, massage);
	}
	//********** END_����_20120319

}
