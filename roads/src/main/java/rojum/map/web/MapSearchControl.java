/***********************************
 * ������ : 2007.9.27
 * ���������� : ������
 * �������� :
 ***********************************/

package main.java.rojum.map.web;


import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.admin.model.UserRegBean;
import main.java.admin.service.IUserRegService;
import main.java.common.commonCode.dao.CommonCodeDao;
import main.java.common.commonCode.model.UserBean;
import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.util.BoardUtil;
import main.java.common.util.Globals;
import main.java.common.util.catUtil.Util;
import main.java.rojum.map.model.RojumBean;
import main.java.rojum.map.model.SearchBean;
import main.java.rojum.map.service.IMapSearchService;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.web.bind.RequestUtils;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class MapSearchControl extends MultiActionController {
	
  	/**
  	 * ��������
	 * @param HttpServletRequest request
	 * @param HttpServletResponce responce
	 * @return ModelAndView
	 */
	private IMapSearchService objMapSearchService = null;
	private IUserRegService objUserRegService = null;
	private	CommonCodeService	commonCode		= null;
	private	CommonCodeDao	commonCodeDao	= null;
	private	Util				util			= new Util();
	
	public void setMapSearchService(IMapSearchService newObjMapSearchService) {
		this.objMapSearchService = newObjMapSearchService;
	}
	
	public void setUserRegService(IUserRegService newObjUserRegService) {
		this.objUserRegService = newObjUserRegService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode) 
	{
		this.commonCode 	= commonCode;
	}
	
	public void setCommonCodeDao(CommonCodeDao commonCodeDao) {
	    this.commonCodeDao = commonCodeDao;
	}
	
	public ModelAndView MapIndex(HttpServletRequest request,HttpServletResponse response) throws Exception{
		return new ModelAndView("/rojum/map/index");
	}
		
//		�˻� ����Ʈ
	public ModelAndView MapSearch(HttpServletRequest request,HttpServletResponse response) throws Exception {
		
//		 ���� ����
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		SearchBean objSearchBean = new SearchBean();
			
		try{
			if(userId != null)
			{
				System.out.println("##### here #####");
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
			
           		// ���⵵ ���
           		Calendar cal = Calendar.getInstance();
            	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            	String toDate = formatter.format(cal.getTime());
           		String thisYear = toDate.substring(0, 4);
            
				String mgTyp = ServletRequestUtils.getStringParameter(request, "MG_TYP", "");
				String surveyYear = ServletRequestUtils.getStringParameter(request, "SURVEY_YEAR", thisYear);		//������� ����
			
				String guCd = ServletRequestUtils.getStringParameter(request, "GU_CD", userBean.getSIGU_CD());			//�ñ���
				String bjCd = ServletRequestUtils.getStringParameter(request,"BJ_CD","");				//���鵿
				String bonbun = ServletRequestUtils.getStringParameter(request,"BONBUN","");			//����
				String bubun = ServletRequestUtils.getStringParameter(request,"BUBUN","");				//�ι�
				String ownerName = ServletRequestUtils.getStringParameter(request,"OWNER_NAME","");	//�����θ�
				String maintnOb = ServletRequestUtils.getStringParameter(request, "MAINTN_OB", "");		//������� ����
				//********** BEGIN_����_20120313
				String gugancd = ServletRequestUtils.getStringParameter(request, "GUGAN_CD","");
				//********** END_����_20120313
				logger.info("GUGAN_CD"+gugancd);	
			 
			
				if(bjCd.length() > 5){
					bjCd = "";
				}
			
			
				if(mgTyp.equals("")){
					mgTyp = "0";
				}
			
				if(!mgTyp.equals("0")){
					surveyYear = "";
				}
			
				objSearchBean.setMANAGE_TYP(mgTyp);
				objSearchBean.setSURVEY_YEAR(surveyYear);
				objSearchBean.setGU_CD(guCd);
				objSearchBean.setBJ_CD(bjCd);
				objSearchBean.setBONBUN(bonbun);
				objSearchBean.setBUBUN(bubun);
				objSearchBean.setOWNER_NAME(ownerName);
				objSearchBean.setMAINTN_OB(maintnOb);
				//********** BEGIN_����_20120313
				objSearchBean.setGUGAN_CD(gugancd);
				//********** END_����_20120313
			
				List rojumList = objMapSearchService.getRojumList(objSearchBean);
			/*		
				int mainCount = 0;
				int jungbiCount = 0;
				int taxCount = 0;
			
			
				for(int i = 0 ; i < rojumList.size(); i++){
					RojumBean bean = (RojumBean) rojumList.get(i);
						if(bean.getMAINTN_OB().equals("1")){
							mainCount++;
						}else{
							jungbiCount++;
					}
						if(bean.getTAX_YN().equals("1")){
						taxCount++;
					}
				}
			*/	
				request.setAttribute("guNm", userBean.getGU_NM());
				request.setAttribute("name", userBean.getNAME());
				
	//			request.setAttribute("mainCount", mainCount);
	//			request.setAttribute("jungbiCount", jungbiCount);
	//			request.setAttribute("taxCount", taxCount);
				request.setAttribute("rojumList", rojumList);
				
				logger.info("mgTyp"+mgTyp);
				request.setAttribute("mgTyp", commonCode.executeGapanCode("MG_TYP", mgTyp, "��������"));
				request.setAttribute("surveyYear", surveyYear);
				request.setAttribute("guList", commonCode.executeGuCdList(userBean.getSIGU_CD(),guCd));	//	�ñ���
				request.setAttribute("bjList", commonCode.CommonBJDongCodeSearch(SIDO_CD, guCd, bjCd));	//	������
				request.setAttribute("ownerName", ownerName);
				request.setAttribute("bonbun", bonbun);
				request.setAttribute("bubun", bubun);
				request.setAttribute("maintnOb", maintnOb);
				//********** BEGIN_����_20120313
				logger.info("guCd = "+guCd);
				logger.info("GUGAN_CD = "+gugancd);
				String gapanGuganList = commonCode.CommonGapanGuganCodeSearch(guCd, gugancd);
				logger.info("GUGAN_CD_LIST"+gapanGuganList);
				request.setAttribute("GUGAN_CD_LIST",gapanGuganList);
			
				//********** END_����_20120313
			
		}
	}catch(Exception e){
		e.printStackTrace();
	}	
		return new ModelAndView("/rojum/map/left");
	}	
	
	/**
	 * �������� �˻� ����Ʈ
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public String MapSearchByJson(HttpServletRequest request,HttpServletResponse response) throws Exception {
	
		/* MapSearch() ���� */
	//	 ���� ����
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		SearchBean objSearchBean = new SearchBean();
		JSONObject jObj = new JSONObject();	
		String logMsg = "";
		String result = "error";
		String message = "Access denied";
		long size = 0;
		
		try{
			if(userId != null)
			{
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				
	            // ���⵵ ���
	            Calendar cal = Calendar.getInstance();
	            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	            String toDate = formatter.format(cal.getTime());
	            String thisYear = toDate.substring(0, 4);
	            
				String mgTyp = ServletRequestUtils.getStringParameter(request, "MG_TYP", "");
				String surveyYear = ServletRequestUtils.getStringParameter(request, "SURVEY_YEAR", thisYear);		//������� ����
				
				String guCd = ServletRequestUtils.getStringParameter(request, "GU_CD", userBean.getSIGU_CD());			//�ñ���
				String bjCd = ServletRequestUtils.getStringParameter(request,"BJ_CD","");				//���鵿
				String bonbun = ServletRequestUtils.getStringParameter(request,"BONBUN","");			//����
				String bubun = ServletRequestUtils.getStringParameter(request,"BUBUN","");				//�ι�
				String ownerName = ServletRequestUtils.getStringParameter(request,"OWNER_NAME","");	//�����θ�
				String maintnOb = ServletRequestUtils.getStringParameter(request, "MAINTN_OB", "");		//������� ����
				String GUGAN_CD = ServletRequestUtils.getStringParameter(request, "GUGAN_CD","");
								
				if(bjCd.length() > 5){
					bjCd = "";
				}
				
				
				if(mgTyp.equals("")){
					mgTyp = "0";
				}
				
				if(!mgTyp.equals("0")){
					surveyYear = "";
				}
				
				/* [20130607] yjmoon ::���� ����::�� value�� ""�� ���;� �ϳ� �ؽ�Ʈ�� ���� �켱 ��� �ڵ� */
				if (GUGAN_CD.contains("���� ����")) {
					GUGAN_CD = "";
				}
				objSearchBean.setMANAGE_TYP(mgTyp);
				objSearchBean.setSURVEY_YEAR(surveyYear);
				objSearchBean.setGU_CD(guCd);
				objSearchBean.setBJ_CD(bjCd);
				objSearchBean.setBONBUN(bonbun);
				objSearchBean.setBUBUN(bubun);
				objSearchBean.setOWNER_NAME(ownerName);
				objSearchBean.setMAINTN_OB(maintnOb);
				//********** BEGIN_����_20120313
				objSearchBean.setGUGAN_CD(GUGAN_CD);
				//********** END_����_20120313
				// �������� ������ �����ͼ� JSONObject�� ���
				@SuppressWarnings("unchecked")
				List<RojumBean> rojumList = objMapSearchService.getRojumList(objSearchBean);
//				logger.fatal(rojumList == null ? "rojumList is null" : "rojumlist len = " + rojumList.size());
				if(rojumList != null && rojumList.size() >0){			     
					result = "success";
					message = "success";
					// TODO insert list
					JSONArray jArray = new JSONArray();
					size = rojumList.size();		
					for (int i = 0; i < size; i++) {
						JSONObject jItem = new JSONObject();
						RojumBean bean = rojumList.get(i);
						jItem.put("taxyn",bean.getTAX_YN());
						jItem.put("maintnob",bean.getMAINTN_OB());
						jItem.put("no", bean.getGAPAN_NO());
						jItem.put("name",URLEncoder.encode(bean.getOWNER_NAME(), "utf-8"));
						jItem.put("xc" ,bean.getXC());
						jItem.put("yc", bean.getYC());					
						jArray.put(jItem);
					}
					jObj.put("list", jArray);
				} else{
					result = "fail";
					message = "empty";
				}
			}
		} catch(Exception e){
			e.printStackTrace();
			result = "error";
		    message = e.getMessage();
		}
		jObj.put("result", result);
		jObj.put("message", message);

		/* Make logMessage */
		logMsg = String.format("user : %s, result : %s, message : %s, list : %d", 
				userId == null ? "nil" : userId,
				result,
				message, 
				size
			);
		
		response.setContentType("text/html;charset=utf-8");
	    response.getWriter().write(jObj.toString());
	    logger.fatal(logMsg);
		return null;
		
	}	
		
//		������
		public ModelAndView MapView(HttpServletRequest request,HttpServletResponse response) throws Exception 
		{
			String gapanNo = ServletRequestUtils.getStringParameter(request, "GAPAN_NO", "");
			HttpSession session = request.getSession();
			String userId	= (String)session.getAttribute("sessionUserId");
			RojumBean bean = new RojumBean();
				
			
			try{
				if(userId != null)
				{
					if(!gapanNo.equals("")){
						 bean = (RojumBean)objMapSearchService.getRojumInfo(gapanNo).get(0);
					}
					
					System.out.println("TEST"+gapanNo);

					request.setAttribute("gapanNo", gapanNo);
					request.setAttribute("board", bean);
					
				}
			}catch(Exception e){
				e.printStackTrace();
			}
			
			return new ModelAndView("/rojum/map/rojum_result");
		}
		
		
		
//		�̴ϸ�
		public ModelAndView MiniMap(HttpServletRequest request,HttpServletResponse response) throws Exception 
		{
			
			HttpSession session = request.getSession();
			String userId	= (String)session.getAttribute("sessionUserId");
			
			
			String X_COORD	= ServletRequestUtils.getStringParameter(request, "X_COORD", "");
			String Y_COORD	= ServletRequestUtils.getStringParameter(request, "Y_COORD", "");
			String PNU		= ServletRequestUtils.getStringParameter(request, "PNU", "");
			String TYPE		= request.getParameter("TYPE").toString();
			
			//MK ��Ŀ ǥ�� on ��ǥ�� off
			//TYPE view / edit
				
			
			try{
				if(X_COORD.equals("") && Y_COORD.equals("")){
					PNU = objMapSearchService.getEnablePnu(PNU);
				}
				
			}catch(Exception e){
				e.printStackTrace();
			}
			
			request.setAttribute("X_COORD", X_COORD);
			request.setAttribute("Y_COORD", Y_COORD);
			request.setAttribute("PNU", PNU);
			request.setAttribute("TYPE", TYPE);
			
			return new ModelAndView("/rojum/map/miniMap");
		}
		

}
