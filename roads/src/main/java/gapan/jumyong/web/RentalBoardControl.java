package main.java.gapan.jumyong.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.util.catUtil.Util;
import main.java.gapan.jumyong.model.ProductBean;
import main.java.gapan.jumyong.service.IJumyongService;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class RentalBoardControl extends MultiActionController {

	private IJumyongService objJumyongService = null;	
	private	CommonCodeService	commonCode		= null;	
	private	Util				util			= new Util();
	
	
	
	public void setGapan_jumyongService(IJumyongService newObjJumyongService) {
		this.objJumyongService = newObjJumyongService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode) 
	{
		this.commonCode 	= commonCode;
	}
 
	
	/**
	 * 대부료 일괄삭제.
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	public String batchRemoveRentalByAjax(HttpServletRequest request,HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
//		SearchBean objSearchBean = null;
//		int listCount = 0;
		String msg = ServletRequestUtils.getStringParameter(request, "msg");
		
		logger.info("userId = " + userId + ", msg = " + msg);
		/* spec
		 * result : success, error(Exception)
		 * status : { total : int, success : int}
		 */
		JSONObject jContent = new JSONObject();
		try{
			if(userId != null && msg != null) {
				JSONObject jReq = new JSONObject(msg);
				/* Year, Gapan_NO를 이용하여 seq 조회. */
				int year = jReq.optInt("year", 0);
				if (year > 0) {
					JSONArray list = jReq.optJSONArray("list");
					int total = list.length();
					int success = 0;
					for (int i = 0; i < total; i++) {
						JSONObject item = list.optJSONObject(i);
						String gapanNo = item.optString("no", null);
						logger.warn("gapan : " + gapanNo);
						if (gapanNo != null) {
							ProductBean product = objJumyongService.getCalculationItem(""+ year, gapanNo);
							if (product == null) {
								logger.fatal(String.format("Product : %s,  %s is no calculation", year, gapanNo));
							} else {
								logger.fatal(String.format("Product : %s,%s,%s", product.getYEAR(), product.getGAPAN_NO(), product.getSEQ()));
								// remove calculation, calc_sum, tax
								success += objJumyongService.executeDeleteCalTax(product.getGAPAN_NO(), product.getSEQ());								
							}
						}
					}
					JSONObject status = new JSONObject();
					status.put("year", year);
					status.put("total", total);
					status.put("success", success);
					jContent.put("status", status);
					jContent.put("result", "success");
				}
			}
		} catch(Exception e){
			logger.error(e.getMessage(), e);
			jContent.put("message", e.getMessage());
			jContent.put("result", "error");
		}
		
		/* json 인 경우 cache 문제 발생 Cache-Control:no-cache로 설정 */
		response.setContentType("application/json;charset=utf-8");
		response.setHeader("Cache-Control", "no-cache");
		response.getWriter().write(jContent.toString());
		return null;

	}

}
