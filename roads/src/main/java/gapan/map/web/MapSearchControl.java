/***********************************
 * 수정일 : 2007.9.27
 * 최종수정자 : 최진용
 * 수정내용 :
 ***********************************/

package main.java.gapan.map.web;


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
import main.java.gapan.map.model.GapanBean;
import main.java.gapan.map.model.SearchBean;
import main.java.gapan.map.service.IMapSearchService;
import main.java.jumyong.map.model.JumyongBean;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.web.bind.RequestUtils;
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
		return new ModelAndView("/gapan/map/index");
	}
		
//		검색 리스트
	public ModelAndView MapSearch(HttpServletRequest request,HttpServletResponse response) throws Exception {
		
//		 삭제 세션
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		SearchBean objSearchBean = new SearchBean();
			
		
		try{
			if(userId != null)
			{
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				
				String ftTyp = ServletRequestUtils.getStringParameter(request, "FT_TYP", "");
				
				String guCd = ServletRequestUtils.getStringParameter(request, "GU_CD", userBean.getSIGU_CD());			//시군구
				String bjCd = ServletRequestUtils.getStringParameter(request,"BJ_CD","");				//읍면동
				String bonbun = ServletRequestUtils.getStringParameter(request,"BONBUN","");			//본번
				String bubun = ServletRequestUtils.getStringParameter(request,"BUBUN","");				//부번
				String ownerName = ServletRequestUtils.getStringParameter(request,"OWNER_NAME","");	//점용인명
				
				
				if(bjCd.length() > 5){
					bjCd = "";
				}
				
				
				objSearchBean.setFT_TYP(ftTyp);
				objSearchBean.setGU_CD(guCd);
				objSearchBean.setBJ_CD(bjCd);
				objSearchBean.setBONBUN(bonbun);
				objSearchBean.setBUBUN(bubun);
				objSearchBean.setOWNER_NAME(ownerName);
				
				
				List gapanList = objMapSearchService.getGapanList(objSearchBean);
			/*
				int fixCount = 0;
				int saleCount = 0;
				
				
				for(int i = 0 ; i < gapanList.size(); i++){
					GapanBean bean = (GapanBean) gapanList.get(i);
					if(bean.getFT_TYP().equals("011")){
						saleCount++;
					}else if(bean.getFT_TYP().equals("012")){
						fixCount++;
					}
				}
			*/
				request.setAttribute("guNm", userBean.getGU_NM());
				request.setAttribute("name", userBean.getNAME());
				
			//	request.setAttribute("fixCount", fixCount);
			//	request.setAttribute("saleCount", saleCount);
				request.setAttribute("gapanList", gapanList);
				
				request.setAttribute("ftTyp", ftTyp);
				request.setAttribute("guList", commonCode.executeGuCdList(userBean.getSIGU_CD(),guCd));	//	시군구
				request.setAttribute("bjList", commonCode.CommonBJDongCodeSearch(SIDO_CD, guCd, bjCd));	//	법정동
				request.setAttribute("ownerName", ownerName);
				request.setAttribute("bonbun", bonbun);
				request.setAttribute("bubun", bubun);
				
			}
		} catch(Exception e){
			e.printStackTrace();
		}
			
			
			return new ModelAndView("/gapan/map/left");
		}
	/**
	 * 보도상영업시설 데이터 처리  
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public String MapSearchbyjson(HttpServletRequest request,HttpServletResponse response) throws Exception {
		
//		 삭제 세션
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
				String ftTyp = ServletRequestUtils.getStringParameter(request, "ftTyp", "");				
				String guCd = ServletRequestUtils.getStringParameter(request, "gucd", userBean.getSIGU_CD());			//시군구
				String bjCd = ServletRequestUtils.getStringParameter(request,"bjcd","");				//읍면동
				String bonbun = ServletRequestUtils.getStringParameter(request,"bonbun","");			//본번
				String bubun = ServletRequestUtils.getStringParameter(request,"bubun","");				//부번
				String ownerName = ServletRequestUtils.getStringParameter(request,"ownername","");	//점용인명
				
				if(bjCd.length() > 5){
					bjCd = "";
				}
			
				objSearchBean.setFT_TYP(ftTyp);
				objSearchBean.setGU_CD(guCd);
				objSearchBean.setBJ_CD(bjCd);
				objSearchBean.setBONBUN(bonbun);
				objSearchBean.setBUBUN(bubun);
				objSearchBean.setOWNER_NAME(ownerName);
				// 보도상영업시설 데이터 가져와서 JSONObject에 담기
				@SuppressWarnings("unchecked")
				List<GapanBean>  gapanList = objMapSearchService.getGapanList(objSearchBean);
				
			      if(gapanList != null && gapanList.size() >0){
			    	  result = "success";
			    	  message = "success";
			    	  // TODO insert list
			    	  JSONArray jArray = new JSONArray();
			    	  size = gapanList.size();		
			    	  for (int i = 0; i < size; i++) {
						JSONObject jItem = new JSONObject();
						GapanBean bean = gapanList.get(i);
						jItem.put("ftTyp", bean.getFT_TYP());
						jItem.put("no", bean.getGAPAN_NO());
						jItem.put("name",URLEncoder.encode(bean.getOWNER_NAME(), "utf-8"));
						jItem.put("xc" ,bean.getXC());
						jItem.put("yc", bean.getYC());					
						jArray.put(jItem);
			    	  }
			    	  jObj.put("list", jArray);

			        }else{
			        	result = "fail";
			        	message = "empty";
			        }
				
			}			
			}catch(Exception e){
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
	
//		상세정보
		public ModelAndView MapView(HttpServletRequest request,HttpServletResponse response) throws Exception 
		{
			String gapanNo = ServletRequestUtils.getStringParameter(request, "GAPAN_NO", "");
			HttpSession session = request.getSession();
			String userId	= (String)session.getAttribute("sessionUserId");
			GapanBean bean = new GapanBean();
				
			
			try{
				if(userId != null)
				{
					if(!gapanNo.equals("")){
						 bean = (GapanBean)objMapSearchService.getGapanInfo(gapanNo).get(0);
					}
					
					request.setAttribute("gapanNo", gapanNo);
					request.setAttribute("board", bean);
					
				}
			}catch(Exception e){
				e.printStackTrace();
			}
			
			return new ModelAndView("/gapan/map/gapan_result");
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
			
			return new ModelAndView("/gapan/map/miniMap");
		}
		

}
