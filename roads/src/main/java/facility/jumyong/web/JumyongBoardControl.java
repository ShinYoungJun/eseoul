/***********************************
 * 수정일 : 2007.9.27
 * 최종수정자 : 최진용
 * 수정내용 :
 ***********************************/

package main.java.facility.jumyong.web;


import main.java.common.util.BoardUtil;
import main.java.common.util.Globals;
import main.java.common.util.catUtil.Pageing;
import main.java.common.util.catUtil.Util;
import main.java.common.util.BoardUtil;

import g4c.db160.resident.app.ResidentCheckApp;
import g4c.dc000.driver.resident.RequestTokenBean;
import main.java.common.util.FileUtil;
import main.java.common.commonCode.model.UserBean;
import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.model.BoardFileBean;
import main.java.common.util.UUID;



import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.validation.BindException;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.Calendar;

import main.java.facility.jumyong.model.Equip_ProductBean;
import main.java.facility.jumyong.model.jumyongBean;
import main.java.facility.jumyong.service.IJumyongService;
import main.java.jumyong.jumyong.model.SearchBean;

public class JumyongBoardControl extends MultiActionController {
	
  	/**
  	 * QABoard 리스트 조회 (login 안한상태에 보이는 리스트)
	 * @param HttpServletRequest request
	 * @param HttpServletResponce responce
	 * @return ModelAndView
	 */
		
	private IJumyongService objJumyongService = null;
	private	CommonCodeService	commonCode		= null;	
	private	Util				util			= new Util();
	private	Pageing				pageing				= new Pageing();
	
	public void setJumyongService_facility(IJumyongService newObjJumyongService) {
		this.objJumyongService = newObjJumyongService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode) 
	{
		this.commonCode 	= commonCode;
	}
	

////////////////////////////////////////////////////////////////////////////////////////////////////////
// 점용 조회
	public ModelAndView jumyongList(HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		HttpSession session = request.getSession();		
		UserBean	userBean	= new UserBean();
		userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
		String gu_code	= userBean.getSIGU_CD().substring(0, 3);
		String userId	= (String)session.getAttribute("sessionUserId");
		String strYear = ServletRequestUtils.getStringParameter(request, "year", "");
		String strReq_nm = ServletRequestUtils.getStringParameter(request, "req_nm", "");		
		String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
		String strCountPerPage = ServletRequestUtils.getStringParameter(request, "countPerPage", "4");
		List list = null;
		jumyongBean objJumyongBean = new jumyongBean();
		
		
		try{
			if(userId != null){				
				
				request.setAttribute("year", strYear);
				request.setAttribute("req_nm", strReq_nm);
				request.setAttribute("currentPage", strCurrentPage);
				request.setAttribute("countPerPage", strCountPerPage);
				
				int listCount = objJumyongService.getsearhListCount(strYear,strReq_nm,"", gu_code);
				request.setAttribute("searchlistCount",String.valueOf(listCount));
				String strPageDivideForm = BoardUtil.getDividePageForm(
						Integer.parseInt(strCurrentPage),10, "&year="+strYear+"&req_nm="+strReq_nm, "", "/facility/jumyong/search.do", listCount);
			
				
				request.setAttribute("strPageDivideForm",strPageDivideForm);
				
				
				list = objJumyongService.searhList(strYear, strReq_nm, "", Integer.valueOf(strCurrentPage).intValue(), gu_code);
				
				
				System.out.println("list.size() : "+list.size());
		/*
				if( list.size() > 0 ){
					for( int i=0; i < list.size(); i++ ){
						objJumyongBean = (jumyongBean) list.get(i);
						objJumyongBean.setREQUEST_NO_STR(objJumyongBean.getREQUEST_NO().replaceAll("0",""));						
					}
				}
		*/		
				
				
			}
		}catch(Exception e){ 
			System.out.println(e.toString());
		}
		return new ModelAndView("/facility/jumyong/search","searchList", list);
	}
	
	
	
////////////////////////////////////////////////////////////////////////////////////////////////////////
//	 점용 view
		public ModelAndView view(HttpServletRequest request,HttpServletResponse response) throws Exception {
			
			String corp_cd = ServletRequestUtils.getStringParameter(request, "corp_cd", "");
			String gu_code = ServletRequestUtils.getStringParameter(request, "gu_code", "");
			String ADMIN_NO = ServletRequestUtils.getStringParameter(request, "admin_no", "");
			String Admin_no2 = ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
			String year = ServletRequestUtils.getStringParameter(request, "YEAR", "");
			String flag = ServletRequestUtils.getStringParameter(request, "flag", "");
			
			request.setAttribute("corp_cd", corp_cd);
			request.setAttribute("gu_code", gu_code);

			request.setAttribute("year", year);
			if(ADMIN_NO != null && !ADMIN_NO.equals("")){
				request.setAttribute("ADMIN_NO", ADMIN_NO);
				request.setAttribute("adminno", ADMIN_NO);
			}else{
				request.setAttribute("ADMIN_NO", Admin_no2);
				request.setAttribute("adminno", Admin_no2);
			}
			
			request.setAttribute("flag", flag);
			
			
			System.out.println("admin No = "+ADMIN_NO);
			System.out.println("이곳은 view.do");
			return new ModelAndView("/facility/jumyong/view");
		}
		
////////////////////////////////////////////////////////////////////////////////////////////////////////
//		 점용  product_view
		public ModelAndView product_view(HttpServletRequest request,HttpServletResponse response) throws Exception {
			HttpSession session 	= request.getSession();
			String 	userId	= (String)session.getAttribute("sessionUserId");		
			List		list		= null;
			int j=0;		
			
			try{
				if(userId != null){
					String gu_code = ServletRequestUtils.getStringParameter(request,"GU_CODE");
					String corp_cd = ServletRequestUtils.getStringParameter(request,"CORP_CD");					
					String object_no = ServletRequestUtils.getStringParameter(request, "OBJECT_NO","");
					String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
					String strCountPerPage = ServletRequestUtils.getStringParameter(request, "countPerPage", "5");
					String year = ServletRequestUtils.getStringParameter(request,"YEAR","");
					String tax_set = ServletRequestUtils.getStringParameter(request,"TAX_SET",""); 
					String admin_no =  ServletRequestUtils.getStringParameter(request,"ADMIN_NO","");
					String cal_status = "";
					
					System.out.println("2010.02.17 수요일");
					System.out.println("before tax_set : "+tax_set);
					System.out.println("gu_code : "+gu_code);
					System.out.println("corp_cd : "+corp_cd);
					
					System.out.println("year : "+year);
					
					request.setAttribute("gu_code", gu_code);
					request.setAttribute("corp_cd", corp_cd);					
					request.setAttribute("currentPage", strCurrentPage);
					System.out.println(admin_no);
				
					//임시
					String request_no = "";
					
					Equip_ProductBean epb = new Equip_ProductBean();
					int placeListCount = objJumyongService.placeListCount(gu_code,corp_cd,admin_no);
					
					
					//임시
					System.out.println("placeListCount : "+placeListCount);
					
					int	rowCol		= 0;
					//List placeList = objJumyongService.placeBoardList(gu_code,corp_cd,request_no, rowCol, rowCol + 4);
					List placeList = new ArrayList();
					//List placeLists =  objJumyongService.placeBoardList(gu_code,corp_cd,request_no,rowCol, rowCol + 4);
					System.out.println("placeListCount : "+placeListCount);
					if(placeListCount > 0)
					{
					/*	epb = objJumyongService.Equip_GetCalSumSeq(gu_code,corp_cd,admin_no,year);
						
						System.out.println("calsumseq = "+epb.getCAL_SUM_SEQ());
						
						String cal = Integer.toString(epb.getCAL_SUM_SEQ());
						epb = null;*/
						
						List calSumList = objJumyongService.Equip_Cal_SumList(gu_code,corp_cd,year,admin_no);
						j = objJumyongService.Euip_CalculationCount(gu_code,corp_cd,year,admin_no);
							System.out.println("J : "+j);
						if(j == placeListCount){
							
							if(tax_set.equals("") || tax_set ==""){
								tax_set = ((Equip_ProductBean)calSumList.get(0)).getTAX_SET();
							}
							System.out.println("after tax_set :"+tax_set+"@@@@@@@@@@@");
							
							int placeTaxCount = objJumyongService.placeListTaxCount(gu_code,corp_cd,admin_no,tax_set);
							
							
							System.out.println("placeTaxCount:"+placeTaxCount);
							
							rowCol = pageing.execute(request, placeTaxCount, Integer.parseInt(strCurrentPage), 5);
							
							placeList = objJumyongService.placeBoardListHan(gu_code,corp_cd,admin_no,tax_set, rowCol, rowCol + 4);
						
						}else{
							System.out.println("after tax_set :"+tax_set);
							
							rowCol = pageing.execute(request, placeListCount, Integer.parseInt(strCurrentPage), 5);							
							placeList = objJumyongService.placeBoardList(gu_code,corp_cd,admin_no,rowCol, rowCol + 4);
						}
						
					
						
						System.out.println("placeList.size() : "+placeList.size());
						
						request.setAttribute("placeList", placeList);
						request.setAttribute("calSumList", calSumList);
						
						if(object_no.equals(""))
						{	
							object_no = ((Equip_ProductBean)placeList.get(0)).getOBJECT_NO();
							year = ((Equip_ProductBean)placeList.get(0)).getYEAR();
							cal_status = ((Equip_ProductBean)placeList.get(0)).getCAL_STATUS();
						}
						else
						{
							for(int i=0; i<placeList.size(); i++){
								Equip_ProductBean equip_ProductBean = (Equip_ProductBean)placeList.get(i);
								
								if(equip_ProductBean.getOBJECT_NO().equals(object_no)){
									object_no = equip_ProductBean.getOBJECT_NO();
									year = equip_ProductBean.getYEAR();
									cal_status = equip_ProductBean.getCAL_STATUS();
								}
							}
						}
						
						request.setAttribute("year", year);
						request.setAttribute("cal_status", cal_status);
						request.setAttribute("object_no", object_no);
						request.setAttribute("admin_no", admin_no);
						
						epb = objJumyongService.Equip_CalculationInfo(gu_code,corp_cd,object_no,year);
						
						System.out.println("epb.tax_set : "+epb.getTAX_SET());
						
						request.setAttribute("product", epb);
						
						int quantity = objJumyongService.getQuantity(gu_code,corp_cd, admin_no,object_no);
						
						request.setAttribute("quantity", String.valueOf(quantity));
						
						request.setAttribute("countPerPage", strCountPerPage);
					}
					
					System.out.println("cal_status : "+cal_status);
					
					System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=");
					if(cal_status.equals("1")){
						System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-= equal 1");
						
						return new ModelAndView("redirect:/facility/jumyong/productGo.do?GU_CODE="+gu_code+"&CORP_CD="+corp_cd
		+"&ADMIN_NO="+admin_no+"&currentPage="+strCurrentPage+"&OBJECT_NO="+object_no+"&mode=add&YEAR="+year+"&quantity="+1+"&direct=direct"+"&TAX_SET="+tax_set);

					}else{
						System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-= equal 2");
						return new ModelAndView("/facility/jumyong/tab/info_product_view");
					}
				}
			}catch(Exception e){
				System.out.println(e.toString());
			}	
			
			
			return new ModelAndView("/facility/jumyong/tab/info_product_view");
		}	
		

		////////////////////////////////////////////////////////////////////////////////////////////////////////
		//점용 view
		public ModelAndView productGo(HttpServletRequest request,HttpServletResponse response) throws Exception {
		
			String GU_CODE = ServletRequestUtils.getStringParameter(request, "GU_CODE", "");
			String CORP_CD = ServletRequestUtils.getStringParameter(request, "CORP_CD", "");
			String ADMIN_NO = ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
			String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
			String strCountPerPage = ServletRequestUtils.getStringParameter(request, "countPerPage", "5");
			String OBJECT_NO = ServletRequestUtils.getStringParameter(request, "OBJECT_NO", "");
			String mode = ServletRequestUtils.getStringParameter(request, "mode", "");
			String year = ServletRequestUtils.getStringParameter(request, "YEAR", "");
			String quantity = ServletRequestUtils.getStringParameter(request, "quantity", "");
			String tax_set = ServletRequestUtils.getStringParameter(request, "TAX_SET", "");
			
			System.out.println("여기는 productgo.do");
			System.out.println("tax_set : "+tax_set);
			
			//임시
			
			
			int tax_yn = objJumyongService.getProductTax_ynByYear( GU_CODE,  CORP_CD, ADMIN_NO,  OBJECT_NO,  year );
			
			if(Float.parseFloat(quantity)<0 && tax_yn >= 0){
				System.out.println("productSubtractinsert.do");
				return new ModelAndView("redirect:/facility/jumyong/productSubtractInsert.do?GU_CODE="+GU_CODE
						+"&CORP_CD="+CORP_CD+"&ADMIN_NO="+ADMIN_NO+"&currentPage="+strCurrentPage+"&OBJECT_NO="
						+OBJECT_NO+"&mode="+mode+"&YEAR="+year);
			}
			else if(Float.parseFloat(quantity)<0 && tax_yn < 0){
				System.out.println("productsubbeforetax.do");
				return new ModelAndView("redirect:/facility/jumyong/productSubBeforeTax.do?GU_CODE="+GU_CODE
						+"&CORP_CD="+CORP_CD+"&ADMIN_NO="+ADMIN_NO+"&currentPage="+strCurrentPage+"&OBJECT_NO="
						+OBJECT_NO+"&mode="+mode+"&YEAR="+year);
			}
			else {
				System.out.println("productinsert.do");
				return new ModelAndView("redirect:/facility/jumyong/productInsert.do?GU_CODE="+GU_CODE
					+"&CORP_CD="+CORP_CD+"&ADMIN_NO="+ADMIN_NO+"&currentPage="+strCurrentPage+"&OBJECT_NO="
					+OBJECT_NO+"&mode="+mode+"&YEAR="+year+"&TAX_SET="+tax_set);
			}
			
			//return new ModelAndView("/facility/jumyong/view");
		}
	
}
