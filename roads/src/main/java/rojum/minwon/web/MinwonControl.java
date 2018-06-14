/***********************************
 * ������ : 2007.9.27
 * ���������� : ������
 * �������� :
 ***********************************/

package main.java.rojum.minwon.web;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.common.commonCode.model.UserBean;
import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.util.BoardUtil;
import main.java.common.util.Globals;
import main.java.common.util.catUtil.Util;
import main.java.rojum.minwon.model.MinwonBean;
import main.java.rojum.minwon.service.IMinwonService;

import org.omg.PortableInterceptor.ForwardRequest;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;


public class MinwonControl extends MultiActionController {
	
  	/**
  	 * QABoard ����Ʈ ��ȸ (login ���ѻ��¿� ���̴� ����Ʈ)
	 * @param HttpServletRequest request
	 * @param HttpServletResponce responce
	 * @return ModelAndView
	 */
		
	private IMinwonService objMinwonService = null;	
	private	CommonCodeService	commonCode		= null;	
	private	Util				util			= new Util();
	
	
	
	public void setRojum_minwonService(IMinwonService newObjMinwonService) {
		this.objMinwonService = newObjMinwonService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode) 
	{
		this.commonCode 	= commonCode;
	}

// �ο���ȸ
	public ModelAndView searchList(HttpServletRequest request,HttpServletResponse response,String MSG) throws Exception {
		
//		 ���� ����
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		MinwonBean objMinwonBean = new MinwonBean();
		
		// �⺻ ��¥ ���
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        String toDate = formatter.format(cal.getTime());
        String thisYear = toDate.substring(0, 4);
        cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DATE)-10);
        String fromDate = formatter.format(cal.getTime());
        
		//	������ �����͸� �����´�.
		UserBean	userBean	= new UserBean();
		userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
		
		String GU_CODE = ServletRequestUtils.getStringParameter(request,"GU_CODE",userBean.getSIGU_CD());
		String FROMDATE = ServletRequestUtils.getStringParameter(request,"FROMDATE",fromDate);
		String TODATE = ServletRequestUtils.getStringParameter(request,"TODATE",toDate);
		String EXCEL = ServletRequestUtils.getStringParameter(request,"EXCEL","N");
		
		String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
		String strCountPerPage = ServletRequestUtils.getStringParameter(request, "countPerPage", "10");
		
		
		try{
			if(userId != null)
			{
				objMinwonBean.setGU_CD(GU_CODE);
				objMinwonBean.setFROMDATE(FROMDATE);
				objMinwonBean.setTODATE(TODATE);
				objMinwonBean.setEXCEL(EXCEL);
				objMinwonBean.setCOUNTER_PER_PAGE(strCountPerPage);
				objMinwonBean.setCURRENT_PAGE(strCurrentPage);
				

				//�Ϲ� �ڵ� ��		
				int listCount = objMinwonService.getMinwonListCount(objMinwonBean);
				
				
				//paging
				String strPageDivideForm = BoardUtil.getDividePageForm(Integer.parseInt(strCurrentPage),10,
						"&GU_CODE="+GU_CODE+"&FROMDATE="+FROMDATE+"&TODATE="+TODATE
						, "", "/rojum/minwon/search.do", listCount);
						
				request.setAttribute("strPageDivideForm", strPageDivideForm);
				request.setAttribute("listCount", String.valueOf(listCount));
				request.setAttribute("currentPage", strCurrentPage);
				request.setAttribute("GU_LIST", commonCode.executeGuCdList(userBean.getSIGU_CD(),GU_CODE));
				request.setAttribute("GU_CODE", GU_CODE);
				request.setAttribute("FROMDATE", FROMDATE);
				request.setAttribute("TODATE", TODATE);
				request.setAttribute("MSG", MSG);
				//�Ϲ� �ڵ�.

			}
		} catch(Exception e){
			e.printStackTrace();
		}
		
		if(EXCEL.equals("Y")){
			return new ModelAndView("/rojum/minwon/excel_search","blist",objMinwonService.getMinwonList(objMinwonBean));	
		}else{
			return new ModelAndView("/rojum/minwon/search","blist",objMinwonService.getMinwonList(objMinwonBean));
		}
	}
	
	// �űԹο���Ȳ
	public ModelAndView newMinwon(HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		System.out.println("newMinwon");
		
//		 ���� ����
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		MinwonBean objMinwonBean = new MinwonBean();
		String MSG = "";
		try{
			if(userId != null)
			{
				bind(request, objMinwonBean);
				objMinwonBean.setREGIST_ID(userId);
				
				
				if(objMinwonService.insertMinwon(objMinwonBean)){
					MSG = "��ϵǾ����ϴ�.";
				}else{
					MSG = "�̹� ��ϵ� �����Դϴ�.";
				}
			}
		} catch(Exception e){
			e.printStackTrace();
		}
		
		return searchList(request, response,MSG);
	}
	
	// �����ο���Ȳ
	public ModelAndView modifyMinwon(HttpServletRequest request,HttpServletResponse response) throws Exception {
		
//		 ���� ����
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		MinwonBean objMinwonBean = new MinwonBean();
		String MSG = "";
		try{
			if(userId != null)
			{
				bind(request, objMinwonBean);
				objMinwonBean.setUPDATE_ID(userId);
				
				if(objMinwonService.updateMinwon(objMinwonBean)){
					MSG = "�����Ǿ����ϴ�.";
				}else{
					MSG = "�ý��� �����Դϴ�.";
				}

			}
		} catch(Exception e){
			e.printStackTrace();
		}
		
		return searchList(request, response,MSG);	
	}
	
	// �����ο���Ȳ
	public ModelAndView delMinwon(HttpServletRequest request,HttpServletResponse response) throws Exception {
		
//		 ���� ����
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		MinwonBean objMinwonBean = new MinwonBean();
		String MSG = "";
		try{
			if(userId != null)
			{
				bind(request, objMinwonBean);
				if(objMinwonService.deleteMinwon(objMinwonBean)){
					MSG = "�����Ǿ����ϴ�.";
				}else{
					MSG = "�ý��� �����Դϴ�.";
				}

			}
		} catch(Exception e){
			e.printStackTrace();
		}
		
		return searchList(request, response,MSG);		
	}
	
}