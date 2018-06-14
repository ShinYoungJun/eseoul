/***********************************
 * 수정일 : 2007.9.27
 * 최종수정자 : 최진용
 * 수정내용 :
 ***********************************/

package main.java.jumyong.map.web;


import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.admin.model.UserRegBean;
import main.java.admin.service.IUserRegService;
import main.java.common.commonCode.dao.CommonCodeDao;
import main.java.common.commonCode.model.UserBean;
import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.util.catUtil.Util;
import main.java.jumyong.map.model.JumyongBean;
import main.java.jumyong.map.model.SearchBean;
import main.java.jumyong.map.service.IMapSearchService;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class MapSearchControl extends MultiActionController {
	
  	/**
  	 * 점용지도
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
		return new ModelAndView("/jumyong/map/index");
	}
		
//		검색 리스트
	public ModelAndView MapSearch(HttpServletRequest request,HttpServletResponse response) throws Exception {
		
//		 삭제 세션
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		SearchBean objSearchBean = new SearchBean();
			
		
		try{
			UserRegBean info = null;
			
			if(userId != null)
			{
				info = objUserRegService.getUserDetail(userId);
				System.out.println("인포:" + info.getSECTION());
			}	
			if(userId != null)
			{
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				
                String type = ServletRequestUtils.getStringParameter(request, "TYPE", "");
                System.out.println("타입:"+type);
                String section = ServletRequestUtils.getStringParameter(request,"section","");
				System.out.println("섹션로그:"+section);	
				String taxSet = ServletRequestUtils.getStringParameter(request,"TAX_SET","");
                String guCd = ServletRequestUtils.getStringParameter(request, "GU_CD", userBean.getSIGU_CD());			//시군구
				String bjCd = ServletRequestUtils.getStringParameter(request,"BJ_CD","");				//읍면동
				String bonbun = ServletRequestUtils.getStringParameter(request,"BONBUN","");			//본번
				String bubun = ServletRequestUtils.getStringParameter(request,"BUBUN","");				//부번
				String ownerName = ServletRequestUtils.getStringParameter(request,"OWNER_NAME","");	//점용인명
				
				
				if(bjCd.length() > 5){
					bjCd = "";
				}
				
				
				objSearchBean.setTYPE(type);
				objSearchBean.setSECTION(section);
				objSearchBean.setTAX_SET(taxSet);
				objSearchBean.setGU_CD(guCd);
				objSearchBean.setBJ_CD(bjCd);
				objSearchBean.setBONBUN(bonbun);
				objSearchBean.setBUBUN(bubun);
				objSearchBean.setOWNER_NAME(ownerName);
				
				
				List jumyongList = objMapSearchService.getJumyongList(objSearchBean);
				
				
				request.setAttribute("guNm", userBean.getGU_NM());
				request.setAttribute("name", userBean.getNAME());
				
				request.setAttribute("jumyongList", jumyongList);
				
				request.setAttribute("use_type", commonCode.executeCommonCode("use_type", objSearchBean.getTYPE(), "선택"));
				request.setAttribute("occupancy_type", commonCode.executeCommonCode("occupancy_type", objSearchBean.getSECTION(), "선택"));
				request.setAttribute("taxation_section", commonCode.executeCommonCode("taxation_section", objSearchBean.getTAX_SET(), "선택"));
				
				request.setAttribute("guList", commonCode.executeGuCdList(userBean.getSIGU_CD(),guCd));	//	시군구
				request.setAttribute("bjList", commonCode.CommonBJDongCodeSearch(SIDO_CD, guCd, bjCd));	//	법정동
				request.setAttribute("ownerName", ownerName);
				request.setAttribute("bonbun", bonbun);
				request.setAttribute("bubun", bubun);
				
			}
		} catch(Exception e){
			e.printStackTrace();
		}
			
			
			return new ModelAndView("/jumyong/map/left");
		}
	
	/**
	 * 점용관리 데이터 처리  
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public String MapSearchByJson(HttpServletRequest request,HttpServletResponse response) throws Exception {
				
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		SearchBean objSearchBean = new SearchBean();
	    
		JSONObject jObj = new JSONObject();
		String logMsg = "";
		String result = "error";
		String message = "Access denied";
		long size = 0;
		try{
			if(userId != null) {
				UserRegBean info = null;
				
				if(userId != null) {
					info = objUserRegService.getUserDetail(userId);
					logger.fatal("인포:" + info.getSECTION());
				}	
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				
                String type = ServletRequestUtils.getStringParameter(request, "type", "");
				System.out.println("타입:"+type);
		        String section = ServletRequestUtils.getStringParameter(request,"section",""); 
				String taxSet = ServletRequestUtils.getStringParameter(request,"tax_set","");
                String guCd = ServletRequestUtils.getStringParameter(request, "gucd", userBean.getSIGU_CD());			//시군구
				String bjCd = ServletRequestUtils.getStringParameter(request,"bjcd","");				//읍면동
				String bonbun = ServletRequestUtils.getStringParameter(request,"bonbun","");			//본번
				String bubun = ServletRequestUtils.getStringParameter(request,"bubun","");				//부번
				String ownerName = ServletRequestUtils.getStringParameter(request,"OWNER_NAME","");	//점용인명
		
				if(bjCd.length() > 5) {
					bjCd = "";
				}
				
				objSearchBean.setTYPE(type);
				objSearchBean.setSECTION(section);
				objSearchBean.setTAX_SET(taxSet);
				objSearchBean.setGU_CD(guCd);
				objSearchBean.setBJ_CD(bjCd);
				objSearchBean.setBONBUN(bonbun);
				objSearchBean.setBUBUN(bubun);
				objSearchBean.setOWNER_NAME(ownerName);
				// 점용지 데이터 가져 와서 JSONObject에 담기
				@SuppressWarnings("unchecked")
				List<JumyongBean> jumyongList = objMapSearchService.getJumyongList(objSearchBean);	
				
		        if(jumyongList != null && jumyongList.size() >0){
		        	result = "success";
		        	message = "success";
					// TODO insert list
					JSONArray jArray = new JSONArray();
					size = jumyongList.size();		
					for (int i = 0; i < size; i++) {
						JSONObject jItem = new JSONObject();
						JumyongBean bean = jumyongList.get(i);
						jItem.put("no", bean.getADMIN_NO());
						jItem.put("name",URLEncoder.encode(bean.getNAME(), "utf-8"));
						jItem.put("xc" ,bean.getXC());
						jItem.put("yc", bean.getYC());					
						jArray.put(jItem);
					}
					jObj.put("list", jArray);
					
		        } else {
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
        response.setHeader("Cache-Control", "no-cache");
        response.getWriter().write(jObj.toString());
        logger.fatal(logMsg);
        return null;

	}	
//		상세정보
		public ModelAndView MapView(HttpServletRequest request,HttpServletResponse response) throws Exception 
		{
			String adminNo = ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
			HttpSession session = request.getSession();
			String userId	= (String)session.getAttribute("sessionUserId");
			JumyongBean bean = new JumyongBean();
				
			
			try{
				if(userId != null)
				{
					if(!adminNo.equals("")){
						 bean = (JumyongBean)objMapSearchService.getJumyongInfo(adminNo).get(0);
					}
					request.setAttribute("adminNo", adminNo);
					request.setAttribute("board", bean);
					
				}
			}catch(Exception e){
				e.printStackTrace();
			}
			
			return new ModelAndView("/jumyong/map/jumyong_result");
		}
		
		
		
//		미니맵
		public ModelAndView MiniMap(HttpServletRequest request,HttpServletResponse response) throws Exception 
		{
			
			HttpSession session = request.getSession();
			String userId	= (String)session.getAttribute("sessionUserId");
			
			
			String X_COORD	= ServletRequestUtils.getStringParameter(request, "X_COORD", "");
			String Y_COORD	= ServletRequestUtils.getStringParameter(request, "Y_COORD", "");
			String PNU		= ServletRequestUtils.getStringParameter(request, "PNU", "");
			String TYPE		= request.getParameter("TYPE").toString();
			
			//MK 마커 표기 on 미표기 off
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
			
			return new ModelAndView("/jumyong/map/miniMap");
		}
		

}
