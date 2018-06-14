//	2009		Kim Yun Seo

package main.java.facility.jumyonginfo.web;


import java.io.StringReader;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import main.java.facility.jumyonginfo.model.AppealBean;
import main.java.facility.jumyonginfo.model.PlaceBean;
import main.java.facility.jumyonginfo.service.IJumyonginfoService;
import main.java.facility.minwon.model.Admin_BaseBean;
import main.java.facility.minwoninfo.model.MinwonBean;
import main.java.common.commonCode.model.UserBean;
import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.util.catUtil.Pageing;
import main.java.common.util.catUtil.Util;


public class TabJumji_Control	extends MultiActionController {

	private	IJumyonginfoService	iJumyonginfoService	= null;
	private	CommonCodeService	commonCode			= null;
	private	Util				util				= new Util();
	private	Pageing				pageing				= new Pageing();
	
	public void setFacility_jumyonginfoService(IJumyonginfoService facility_jumyonginfoService) 
	{
		//System.out.println(">> TabJumji_Control.setFacility_jumyonginfoService");

		this.iJumyonginfoService = facility_jumyonginfoService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode) 
	{
		//System.out.println(">> TabJumji_Control.setCommonCodeService");

		this.commonCode 	= commonCode;
	}
	
	//	점용지정보 보기
	public ModelAndView		Jumji_View(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		//System.out.println(">> TabJumji_Control.Jumji_View");

		HttpSession session 	= request.getSession();
		String 	userId	= (String)session.getAttribute("sessionUserId");		
		List		list		= null;
				
		
		//System.out.println("=====2======");
		try{
			if(userId != null){
				String 		adminno 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
				String 		gu_code 	= ServletRequestUtils.getStringParameter(request, "GU_CODE", "");
				String 		corp_cd 	= ServletRequestUtils.getStringParameter(request, "CORP_CD", "");
				String 		object_no 	= ServletRequestUtils.getStringParameter(request, "object_no", "");
				String 		year 		= ServletRequestUtils.getStringParameter(request, "YEAR", "");

				int	currentPage	= Integer.parseInt(ServletRequestUtils.getStringParameter(request, "currentPage", "1"));
				int	iTotalCnt	= iJumyonginfoService.executeJumji_Count(corp_cd, gu_code, adminno);
				int	rowCol		= pageing.execute(request, iTotalCnt, currentPage, 5);
		
				list 	= iJumyonginfoService.executeJumji_View(corp_cd, gu_code, adminno,year, rowCol, rowCol + 4);
				
				int	size	= list.size();
				
				PlaceBean	Bean	= new PlaceBean();
				
				//System.out.println("**********************");
				//System.out.println("ADMIN_NO : "+adminno);
				//System.out.println("GU_CODE : "+gu_code);
				//System.out.println("CORP_CD : "+corp_cd);
				//System.out.println("object_no : "+object_no);
				//System.out.println("YEAR : "+year);
				//System.out.println("rowCol : "+rowCol);
				//System.out.println("list.size : "+size);
				//System.out.println("**********************");

				//System.out.println("*************** TabJumji_Control.Jumji_View      test 1 ***************");

				for(int i = 0	;	i < size	;	i++)
				{
					Bean	= (PlaceBean)list.get(i);
					
					Bean.setSIGUNGU(commonCode.SearchGuName(Bean.getSIDO(), Bean.getSIGUNGU()));	//	시 이름입력
					Bean.setMUL_FROMDATE(util.Date_Paste(Bean.getMUL_FROMDATE()));
					Bean.setMUL_TODATE(util.Date_Paste(Bean.getMUL_TODATE()));
					Bean.setWORK_FROMDATE(util.Date_Paste(Bean.getWORK_FROMDATE()));				//	공사 시작일
					Bean.setWORK_TODATE(util.Date_Paste(Bean.getWORK_TODATE()));					//	공사 종료일
					Bean.setWORK_FROMDATE(util.Date_Paste(Bean.getWORK_FROMDATE()));	//	공사 시작일
					Bean.setWORK_TODATE(util.Date_Paste(Bean.getWORK_TODATE()));		//	공사 종료일
					Bean.setFINISH_DATE(util.Date_Paste(Bean.getFINISH_DATE()));		//	준공일자
					Bean.setCOMPLETION_DATE(util.Date_Paste(Bean.getCOMPLETION_DATE()));		//
					
					//System.out.println("*************** TabJumji_Control.Jumji_View      test 2 ***************");

					
					if(object_no.equals(Bean.getOBJECT_NO()))
					{

						request.setAttribute("CORP_CD", Bean.getCORP_CD());
						request.setAttribute("GU_CODE", Bean.getGU_CODE());
						request.setAttribute("REQUEST_NO", Bean.getREQUEST_NO());
						request.setAttribute("use_type", "도로");
						request.setAttribute("object_no", Bean.getOBJECT_NO());
						request.setAttribute("section", Bean.getSECTION());
						request.setAttribute("purpose_cd", Bean.getPURPOSE_CD());
						request.setAttribute("purpose_nm", Bean.getPURPOSE_NM());
						request.setAttribute("owner_set", Bean.getOWNER_SET());
						request.setAttribute("owner_nm", commonCode.executeSearchCommonCode("use_ownerGroup", Bean.getOWNER_SET().trim()));
						request.setAttribute("sido", Bean.getSIDO());
						request.setAttribute("sigungu", Bean.getSIGUNGU());
						request.setAttribute("sigungu_nm", commonCode.SearchGuName(Bean.getSIDO(), Bean.getSIGUNGU()));
						request.setAttribute("bj_cd", Bean.getBJ_CD());
						request.setAttribute("hj_cd", Bean.getHJ_CD());
						request.setAttribute("tax_set", Bean.getTAX_SET());
						request.setAttribute("tax_set_nm", commonCode.executeSearchCommonCode("taxation_section", Bean.getTAX_SET().trim()));
						request.setAttribute("bjdong_code", commonCode.executeSearchBJDongCode(Bean.getSIDO(), Bean.getSIGUNGU(), Bean.getBJ_CD()));
						request.setAttribute("hjdong_code", commonCode.executeSearchHJDongCode(Bean.getSIDO(), Bean.getSIGUNGU(), Bean.getHJ_CD()));
						request.setAttribute("mul_spc_cd", commonCode.executeSearchCommonCode("SPC_CD", Bean.getSPC_CD()));
						request.setAttribute("section_nm", commonCode.executeSearchCommonCode("occupancy_type", Bean.getSECTION().trim()));
						
						//System.out.println("*************** TabJumji_Control.Jumji_View      test 3 ***************");

						//점용지 지번
						if(Bean.getBUBUN()	!= null)
						{
							//System.out.println("*************** TabJumji_Control.Jumji_View      test 4 ***************");

							if(!Bean.getBUBUN().trim().equals(""))
							{
								request.setAttribute("bubun", "-" + Bean.getBUBUN() + "번지");
								//System.out.println("*************** TabJumji_Control.Jumji_View      test 5 ***************");

							}
							else
							{	
								request.setAttribute("bonbun", Bean.getBONBUN() + "번지");
								//System.out.println("*************** TabJumji_Control.Jumji_View      test 6 ***************");
							}
						}
						else
						{
							request.setAttribute("bonbun", Bean.getBONBUN() + "번지");
							//System.out.println("*************** TabJumji_Control.Jumji_View      test 7 ***************");

						}
						
						String san = Bean.getSPC_CD();
						
						//System.out.println("*************** TabJumji_Control.Jumji_View      test 8 ***************");

						if(san.equals("2")){
							san = "산 ";
							//System.out.println("*************** TabJumji_Control.Jumji_View      test 9 ***************");

						}else{
							san= "";
							//System.out.println("*************** TabJumji_Control.Jumji_View      test 10 ***************");

						}
						String bunji  = "";
						//System.out.println("*************** TabJumji_Control.Jumji_View      test 11 ***************");

						if(!Bean.getBONBUN().equals("") && !Bean.getBUBUN().equals("") ){
							bunji = Bean.getBONBUN() + " - " +Bean.getBUBUN();
							//System.out.println("*************** TabJumji_Control.Jumji_View      test 12 ***************");

						}else if(!Bean.getBONBUN().equals("") && Bean.getBUBUN().equals("")){
							bunji = Bean.getBONBUN() ;
							//System.out.println("*************** TabJumji_Control.Jumji_View      test 13 ***************");

						}else{
							//System.out.println("*************** TabJumji_Control.Jumji_View      test 14 ***************");

						}
						
						request.setAttribute("mul_fromdate", Bean.getMUL_FROMDATE());		//	점용시작일
						request.setAttribute("mul_todate", Bean.getMUL_TODATE());			//	점용종료일
						request.setAttribute("work_fromdate", Bean.getWORK_FROMDATE());	//	공사 시작일
						request.setAttribute("work_todate", Bean.getWORK_TODATE());		//	공사 종료일
						request.setAttribute("finish_date", Bean.getFINISH_DATE());		//	준공일자
						request.setAttribute("struts", Bean.getSTRUTS());
						request.setAttribute("exe_info", Bean.getEXE_INFO());
						request.setAttribute("purposesebu_cd", Bean.getPURPOSESEBU_CD());
						request.setAttribute("standard", Bean.getSTANDARD());
						request.setAttribute("quantity", Bean.getQUANTITY());
						request.setAttribute("depth_ck", Bean.getDEPTH_CK());
						request.setAttribute("depth_num", Bean.getDEPTH_NUM());
						request.setAttribute("completion_date", Bean.getCOMPLETION_DATE());
						request.setAttribute("with_addr_ck", Bean.getWITH_ADDR_CK());
						request.setAttribute("partly_period", Bean.getPARTLY_PERIOD());
						request.setAttribute("total_period", Bean.getTOTAL_PERIOD());
						request.setAttribute("sisul_addr", Bean.getSISUL_ADDR());
						request.setAttribute("addr_ck", Bean.getADDR_CK());
						request.setAttribute("sisul_addr_ck", Bean.getSISUL_ADDR_CK());
						request.setAttribute("san_ck", Bean.getSAN_CK());
						request.setAttribute("admin_no", Bean.getADMIN_NO());
						request.setAttribute("sisul_post", Bean.getSISUL_POST());
						request.setAttribute("sisul_addr1", Bean.getSISUL_ADDR1());
						request.setAttribute("sisul_addr2", Bean.getSISUL_ADDR2());
						request.setAttribute("bunji", san + bunji);
						request.setAttribute("year", Bean.getYEAR());
						request.setAttribute("purposesebu_nm", Bean.getPURPOSESEBU_NM());
						request.setAttribute("sum_adjust", Bean.getSUM_ADJUST());
						//System.out.println("*************** TabJumji_Control.Jumji_View      test 15 ***************");

					}
					else if(i == 0)
					{
						request.setAttribute("CORP_CD", Bean.getCORP_CD());
						request.setAttribute("GU_CODE", Bean.getGU_CODE());
						request.setAttribute("REQUEST_NO", Bean.getREQUEST_NO());
						request.setAttribute("use_type", "도로");
						request.setAttribute("object_no", Bean.getOBJECT_NO());
						request.setAttribute("section", Bean.getSECTION());
						request.setAttribute("purpose_cd", Bean.getPURPOSE_CD());
						request.setAttribute("purpose_nm", Bean.getPURPOSE_NM());
						request.setAttribute("owner_set", Bean.getOWNER_SET());
						request.setAttribute("owner_nm", commonCode.executeSearchCommonCode("use_ownerGroup", Bean.getOWNER_SET().trim()));
						request.setAttribute("sido", Bean.getSIDO());
						request.setAttribute("sigungu", Bean.getSIGUNGU());
						request.setAttribute("sigungu_nm", commonCode.SearchGuName(Bean.getSIDO(), Bean.getSIGUNGU()));
						request.setAttribute("bj_cd", Bean.getBJ_CD());
						request.setAttribute("hj_cd", Bean.getHJ_CD());
						request.setAttribute("tax_set", Bean.getTAX_SET());
						request.setAttribute("tax_set_nm", commonCode.executeSearchCommonCode("taxation_section", Bean.getTAX_SET().trim()));
						request.setAttribute("bjdong_code", commonCode.executeSearchBJDongCode(Bean.getSIDO(), Bean.getSIGUNGU(), Bean.getBJ_CD()));
						request.setAttribute("hjdong_code", commonCode.executeSearchHJDongCode(Bean.getSIDO(), Bean.getSIGUNGU(), Bean.getHJ_CD()));
						request.setAttribute("mul_spc_cd", commonCode.executeSearchCommonCode("SPC_CD", Bean.getSPC_CD()));
						request.setAttribute("section_nm", commonCode.executeSearchCommonCode("occupancy_type", Bean.getSECTION().trim()));
						//System.out.println("*************** TabJumji_Control.Jumji_View      test 16 ***************");

						//점용지 지번
						if(Bean.getBUBUN()	!= null)
						{
							//System.out.println("*************** TabJumji_Control.Jumji_View      test 17 ***************");

							if(!Bean.getBUBUN().trim().equals(""))
							{
								request.setAttribute("bubun", "-" + Bean.getBUBUN() + "번지");
								//System.out.println("*************** TabJumji_Control.Jumji_View      test 18 ***************");

							}
							else
							{	
								request.setAttribute("bonbun", Bean.getBONBUN() + "번지");
								//System.out.println("*************** TabJumji_Control.Jumji_View      test 19 ***************");

							}
						}
						else
						{
							request.setAttribute("bonbun", Bean.getBONBUN() + "번지");
							//System.out.println("*************** TabJumji_Control.Jumji_View      test 20 ***************");

						}
						
						String san = Bean.getSPC_CD();
						
						if(san.equals("2")){
							san = "산 ";
							//System.out.println("*************** TabJumji_Control.Jumji_View      test 21 ***************");

						}else{
							san= "";
							//System.out.println("*************** TabJumji_Control.Jumji_View      test 22 ***************");

						}
						String bunji  = "";
						
						if(!Bean.getBONBUN().equals("") && !Bean.getBUBUN().equals("") ){
							bunji = Bean.getBONBUN() + " - " +Bean.getBUBUN()+" 번지";
							//System.out.println("*************** TabJumji_Control.Jumji_View      test 23 ***************");

						}else if(!Bean.getBONBUN().equals("") && Bean.getBUBUN().equals("")){
							bunji = Bean.getBONBUN() +" 번지";
							//System.out.println("*************** TabJumji_Control.Jumji_View      test 24 ***************");

						}else{
							//System.out.println("*************** TabJumji_Control.Jumji_View      test 25 ***************");

						}
						
						request.setAttribute("mul_fromdate", Bean.getMUL_FROMDATE());		//	점용시작일
						request.setAttribute("mul_todate", Bean.getMUL_TODATE());			//	점용종료일
						request.setAttribute("work_fromdate", Bean.getWORK_FROMDATE());	//	공사 시작일
						request.setAttribute("work_todate", Bean.getWORK_TODATE());		//	공사 종료일
						request.setAttribute("finish_date", Bean.getFINISH_DATE());		//	준공일자
						request.setAttribute("struts", Bean.getSTRUTS());
						request.setAttribute("exe_info", Bean.getEXE_INFO());
						request.setAttribute("purposesebu_cd", Bean.getPURPOSESEBU_CD());
						request.setAttribute("standard", Bean.getSTANDARD());
						request.setAttribute("quantity", Bean.getQUANTITY());
						request.setAttribute("depth_ck", Bean.getDEPTH_CK());
						request.setAttribute("depth_num", Bean.getDEPTH_NUM());
						request.setAttribute("completion_date", Bean.getCOMPLETION_DATE());
						request.setAttribute("with_addr_ck", Bean.getWITH_ADDR_CK());
						request.setAttribute("partly_period", Bean.getPARTLY_PERIOD());
						request.setAttribute("total_period", Bean.getTOTAL_PERIOD());
						request.setAttribute("sisul_addr", Bean.getSISUL_ADDR());
						request.setAttribute("addr_ck", Bean.getADDR_CK());
						request.setAttribute("sisul_addr_ck", Bean.getSISUL_ADDR_CK());
						request.setAttribute("san_ck", Bean.getSAN_CK());
						request.setAttribute("admin_no", Bean.getADMIN_NO());
						request.setAttribute("sisul_post", Bean.getSISUL_POST());
						request.setAttribute("sisul_addr1", Bean.getSISUL_ADDR1());
						request.setAttribute("sisul_addr2", Bean.getSISUL_ADDR2());
						request.setAttribute("bunji", san + bunji);
						request.setAttribute("year", Bean.getYEAR());
						request.setAttribute("purposesebu_nm", Bean.getPURPOSESEBU_NM());
						request.setAttribute("sum_adjust", Bean.getSUM_ADJUST());
						
						//System.out.println("*************** TabJumji_Control.Jumji_View      test 26 ***************");

					}
					//System.out.println("*************** TabJumji_Control.Jumji_View      test 27 ***************");

				}
				//System.out.println("*************** TabJumji_Control.Jumji_View      test 28 ***************");

			}
			//System.out.println("*************** TabJumji_Control.Jumji_View      test 29 ***************");

		}catch(Exception e){
			//System.out.println(e.toString());
		}	
		
		return new ModelAndView("/facility/jumyonginfo/tab/jumji_view", "blist", list);
	}
	
	//	점용지정보 수정
	public ModelAndView		Jumji_Modify(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		//System.out.println(">> TabJumji_Control.Jumji_Modify");

		HttpSession session 	= request.getSession();
		String 	userId	= (String)session.getAttribute("sessionUserId");		
		List		list		= null;
				
		try{
			if(userId != null){
				String 		adminno 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
				String 		gu_code 	= ServletRequestUtils.getStringParameter(request, "GU_CODE", "");
				String 		corp_cd 	= ServletRequestUtils.getStringParameter(request, "CORP_CD", "");				
				String 		object_no 	= ServletRequestUtils.getStringParameter(request, "object_no", "");
				String 		year 		= ServletRequestUtils.getStringParameter(request, "year", "");
				
				int	currentPage	= Integer.parseInt(ServletRequestUtils.getStringParameter(request, "currentPage", "1"));
				int	iTotalCnt	= iJumyonginfoService.executeJumji_Count(corp_cd, gu_code, adminno);
				int	rowCol		= pageing.execute(request, iTotalCnt, currentPage, 5);
		
				list 	= iJumyonginfoService.executeJumji_View(corp_cd, gu_code, adminno,year, rowCol, rowCol + 4);
				PlaceBean	Bean	= new PlaceBean();
				int	size	= list.size();
				
			
				List list2	= iJumyonginfoService.executeSearch_Depth();
				
				for(int i = 0	;	i < size	;	i++)
				{
					Bean	= (PlaceBean)list.get(i);
					
	//				Bean.setSIGUNGU(commonCode.SearchGuName("11", Bean.getSIGUNGU()));	//	시 이름입력
					Bean.setMUL_FROMDATE(util.Date_Paste(Bean.getMUL_FROMDATE()));
					Bean.setMUL_TODATE(util.Date_Paste(Bean.getMUL_TODATE()));
					Bean.setWORK_FROMDATE(util.Date_Paste(Bean.getWORK_FROMDATE()));				//	공사 시작일
					Bean.setWORK_TODATE(util.Date_Paste(Bean.getWORK_TODATE()));					//	공사 종료일
					Bean.setWORK_FROMDATE(util.Date_Paste(Bean.getWORK_FROMDATE()));				//	공사 시작일
					Bean.setWORK_TODATE(util.Date_Paste(Bean.getWORK_TODATE()));					//	공사 종료일
					Bean.setFINISH_DATE(util.Date_Paste(Bean.getFINISH_DATE()));					//	준공일자
					Bean.setCOMPLETION_DATE(util.Date_Paste(Bean.getCOMPLETION_DATE()));			//
					
					if(object_no.equals(Bean.getOBJECT_NO()))
					{

						request.setAttribute("CORP_CD", Bean.getCORP_CD());
						request.setAttribute("GU_CODE", Bean.getGU_CODE());						
						request.setAttribute("use_type", "도로");
						request.setAttribute("object_no", Bean.getOBJECT_NO());
						request.setAttribute("section", Bean.getSECTION());
						request.setAttribute("purpose_cd", Bean.getPURPOSE_CD());
						request.setAttribute("purpose_nm", Bean.getPURPOSE_NM());
						request.setAttribute("owner_set", Bean.getOWNER_SET());
						request.setAttribute("owner_nm", commonCode.executeSearchCommonCode("use_ownerGroup", Bean.getOWNER_SET()));
						request.setAttribute("sido", Bean.getSIDO());
						request.setAttribute("sigungu", Bean.getSIGUNGU());
						request.setAttribute("sigungu_nm", commonCode.SearchGuName("11", Bean.getGU_CODE().trim()));
						request.setAttribute("bj_cd", Bean.getBJ_CD());
						request.setAttribute("hj_cd", Bean.getHJ_CD());
						request.setAttribute("tax_set", Bean.getTAX_SET());
						request.setAttribute("tax_set_nm", commonCode.executeSearchCommonCode("taxation_section", Bean.getTAX_SET()));
						//request.setAttribute("bjdong_code", commonCode.executeSearchBJDongCode(Bean.getSIDO(), Bean.getSIGUNGU(), Bean.getBJ_CD()));
						//request.setAttribute("hjdong_code", commonCode.executeSearchHJDongCode(Bean.getSIDO(), Bean.getSIGUNGU(), Bean.getHJ_CD()));
						//request.setAttribute("mul_spc_cd", commonCode.executeSearchCommonCode("SPC_CD", Bean.getSPC_CD()));
						request.setAttribute("section_nm", commonCode.executeSearchCommonCode("occupancy_type", Bean.getSECTION()));
						
					
						
						
						//점용지 지번
						if(Bean.getBUBUN()	!= null)
						{
							if(!Bean.getBUBUN().trim().equals(""))
							{
								request.setAttribute("bubun", "-" + Bean.getBUBUN() + "번지");
							}
							else
							{	
								request.setAttribute("bonbun", Bean.getBONBUN() + "번지");
							}
						}
						else
						{
							request.setAttribute("bonbun", Bean.getBONBUN() + "번지");
						}
						
						request.setAttribute("mul_fromdate", Bean.getMUL_FROMDATE());		//	점용시작일
						request.setAttribute("mul_todate", Bean.getMUL_TODATE());			//	점용종료일
						request.setAttribute("work_fromdate", Bean.getWORK_FROMDATE());	//	공사 시작일
						request.setAttribute("work_todate", Bean.getWORK_TODATE());		//	공사 종료일
						request.setAttribute("finish_date", Bean.getFINISH_DATE());		//	준공일자
						request.setAttribute("struts", Bean.getSTRUTS());
						request.setAttribute("exe_info", Bean.getEXE_INFO());
						request.setAttribute("purposesebu_cd", Bean.getPURPOSESEBU_CD());
						request.setAttribute("standard", Bean.getSTANDARD());
						request.setAttribute("quantity", Bean.getQUANTITY());
						request.setAttribute("depth_ck", Bean.getDEPTH_CK());
						request.setAttribute("depth_num", Bean.getDEPTH_NUM());
						request.setAttribute("completion_date", Bean.getCOMPLETION_DATE());
						request.setAttribute("with_addr_ck", Bean.getWITH_ADDR_CK());
						request.setAttribute("partly_period", Bean.getPARTLY_PERIOD());
						request.setAttribute("total_period", Bean.getTOTAL_PERIOD());
						request.setAttribute("sisul_addr", Bean.getSISUL_ADDR());
						request.setAttribute("addr_ck", Bean.getADDR_CK());
						request.setAttribute("sisul_addr_ck", Bean.getSISUL_ADDR_CK());
						request.setAttribute("san_ck", Bean.getSAN_CK());
						request.setAttribute("ADMIN_NO", Bean.getADMIN_NO());
						request.setAttribute("sisul_post", Bean.getSISUL_POST());
						request.setAttribute("sisul_addr1", Bean.getSISUL_ADDR1());
						request.setAttribute("sisul_addr2", Bean.getSISUL_ADDR2());
						request.setAttribute("year", Bean.getYEAR());
						request.setAttribute("purposesebu_nm", Bean.getPURPOSESEBU_NM());
						request.setAttribute("BONBUN",Bean.getBONBUN());
						request.setAttribute("BUBUN", Bean.getBUBUN());
						
						//세션에서 시도 코드를 가져온다.
						String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
		
						//	관리자 데이터를 가져온다.
						UserBean	userBean	= new UserBean();
						userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
						
						request.setAttribute("use_type", commonCode.executeCommonCode("use_type", null, "선택"));
						request.setAttribute("occupancy_type", commonCode.executeCommonCode("occupancy_type", null, "선택"));
						request.setAttribute("use_owner_Group", commonCode.executeCommonCode("use_ownerGroup", Bean.getOWNER_SET().trim(), "선택"));
						request.setAttribute("taxation_section", commonCode.executeCommonCode("taxation_section", Bean.getTAX_SET().trim(), "선택"));
						request.setAttribute("bjdong_code", commonCode.executeBJDongCode(SIDO_CD, userBean.getSIGU_CD().trim(), Bean.getBJ_CD()));
						request.setAttribute("hjdong_code", commonCode.executeHJDongCode(SIDO_CD, userBean.getSIGU_CD().trim(), Bean.getHJ_CD()));
						request.setAttribute("mul_spc_cd", commonCode.executeCommonCode("MUL_SPC_CD", Bean.getSPC_CD().trim(), "선택"));
	
					}
				/*	else if(i == 0)
					{
						request.setAttribute("CORP_CD", Bean.getCORP_CD());
						request.setAttribute("GU_CODE", Bean.getGU_CODE());
						request.setAttribute("REQUEST_NO", Bean.getREQUEST_NO());
						request.setAttribute("use_type", "도로");
						request.setAttribute("object_no", Bean.getOBJECT_NO());
						request.setAttribute("section", Bean.getSECTION());
						request.setAttribute("purpose_cd", Bean.getPURPOSE_CD());
						request.setAttribute("purpose_nm", Bean.getPURPOSE_NM());
						request.setAttribute("owner_set", Bean.getOWNER_SET());
						request.setAttribute("owner_nm", commonCode.executeSearchCommonCode("use_ownerGroup", Bean.getOWNER_SET()));
						request.setAttribute("sido", Bean.getSIDO());
						request.setAttribute("sigungu", Bean.getSIGUNGU());
						request.setAttribute("sigungu_nm", commonCode.SearchGuName(Bean.getSIDO(), Bean.getSIGUNGU()));
						request.setAttribute("bj_cd", Bean.getBJ_CD());
						request.setAttribute("hj_cd", Bean.getHJ_CD());
						request.setAttribute("tax_set", Bean.getTAX_SET());
						request.setAttribute("tax_set_nm", commonCode.executeSearchCommonCode("taxation_section", Bean.getTAX_SET()));
						request.setAttribute("bjdong_code", commonCode.executeSearchBJDongCode(Bean.getSIDO(), Bean.getSIGUNGU(), Bean.getBJ_CD()));
						request.setAttribute("hjdong_code", commonCode.executeSearchHJDongCode(Bean.getSIDO(), Bean.getSIGUNGU(), Bean.getHJ_CD()));
						request.setAttribute("mul_spc_cd", commonCode.executeSearchCommonCode("SPC_CD", Bean.getSPC_CD()));
						request.setAttribute("section_nm", commonCode.executeSearchCommonCode("occupancy_type", Bean.getSECTION()));
						
						//점용지 지번
						if(Bean.getBUBUN()	!= null)
						{
							if(!Bean.getBUBUN().trim().equals(""))
							{
								request.setAttribute("bubun", "-" + Bean.getBUBUN() + "번지");
							}
							else
							{	
								request.setAttribute("bonbun", Bean.getBONBUN() + "번지");
							}
						}
						else
						{
							request.setAttribute("bonbun", Bean.getBONBUN() + "번지");
						}
						
						request.setAttribute("mul_fromdate", Bean.getMUL_FROMDATE());		//	점용시작일
						request.setAttribute("mul_todate", Bean.getMUL_TODATE());			//	점용종료일
						request.setAttribute("work_fromdate", Bean.getWORK_FROMDATE());	//	공사 시작일
						request.setAttribute("work_todate", Bean.getWORK_TODATE());		//	공사 종료일
						request.setAttribute("finish_date", Bean.getFINISH_DATE());		//	준공일자
						request.setAttribute("struts", Bean.getSTRUTS());
						request.setAttribute("exe_info", Bean.getEXE_INFO());
						request.setAttribute("purposesebu_cd", Bean.getPURPOSESEBU_CD());
						request.setAttribute("standard", Bean.getSTANDARD());
						request.setAttribute("quantity", Bean.getQUANTITY());
						request.setAttribute("depth_ck", Bean.getDEPTH_CK());
						request.setAttribute("depth_num", Bean.getDEPTH_NUM());
						request.setAttribute("completion_date", Bean.getCOMPLETION_DATE());
						request.setAttribute("with_addr_ck", Bean.getWITH_ADDR_CK());
						request.setAttribute("partly_period", Bean.getPARTLY_PERIOD());
						request.setAttribute("total_period", Bean.getTOTAL_PERIOD());
						request.setAttribute("sisul_addr", Bean.getSISUL_ADDR());
						request.setAttribute("addr_ck", Bean.getADDR_CK());
						request.setAttribute("sisul_addr_ck", Bean.getSISUL_ADDR_CK());
						request.setAttribute("san_ck", Bean.getSAN_CK());
						request.setAttribute("admin_no", Bean.getADMIN_NO());
						request.setAttribute("sisul_post", Bean.getSISUL_POST());
						request.setAttribute("sisul_addr1", Bean.getSISUL_ADDR1());
						request.setAttribute("sisul_addr2", Bean.getSISUL_ADDR2());
						request.setAttribute("year", Bean.getYEAR());
						request.setAttribute("purposesebu_nm", Bean.getPURPOSESEBU_NM());
						
						
						//세션에서 시도 코드를 가져온다.
						String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
		
						//	관리자 데이터를 가져온다.
						UserBean	userBean	= new UserBean();
						userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
						
						request.setAttribute("use_type", commonCode.executeCommonCode("use_type", null, "선택"));
						request.setAttribute("occupancy_type", commonCode.executeCommonCode("occupancy_type", null, "선택"));
						request.setAttribute("use_owner_Group", commonCode.executeCommonCode("use_ownerGroup", Bean.getOWNER_SET(), "선택"));
						request.setAttribute("taxation_section", commonCode.executeCommonCode("taxation_section", Bean.getTAX_SET(), "선택"));
						request.setAttribute("bjdong_code", commonCode.executeBJDongCode(SIDO_CD, userBean.getSIGU_CD(), null));
						request.setAttribute("hjdong_code", commonCode.executeHJDongCode(SIDO_CD, userBean.getSIGU_CD(), null));
						request.setAttribute("mul_spc_cd", commonCode.executeCommonCode("MUL_SPC_CD", null, "선택"));
					}*/
				}
				request.setAttribute("clist", list2);
			}
		}catch(Exception e){
			//System.out.println(e.toString());
		}	
		
		return new ModelAndView("/facility/jumyonginfo/tab/jumji_modify", "blist", list);
	}
	
	//	점용지 정보 수정 처리
	public ModelAndView		Jumji_Modify_Prc(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		//System.out.println(">> TabJumji_Control.Jumji_Modify_Prc");

		Jumji_Modify_Execute(request, response);
		
		//System.out.println("====1=====");
		
		return Jumji_View(request,response);
	}

	//	점용지 정보 수정
	public void		Jumji_Modify_Execute(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		//System.out.println(">> TabJumji_Control.Jumji_Modify_Execute");

		PlaceBean	Bean	= new PlaceBean();
		
		bind(request, Bean);
		
		Bean.setGU_CODE(ServletRequestUtils.getStringParameter(request, "GU_CODE", ""));
	//	Bean.setCORP_CD(ServletRequestUtils.getStringParameter(request, "CORP_CD", ""));		
		Bean.setOBJECT_NO(ServletRequestUtils.getStringParameter(request, "object_no", ""));
		Bean.setMUL_FROMDATE(util.Date_Cut(Bean.getMUL_FROMDATE()));	//	점용시작일
		Bean.setMUL_FROMDATE(util.Date_Cut(Bean.getMUL_FROMDATE()));	//	점용시작일
		Bean.setMUL_TODATE(util.Date_Cut(Bean.getMUL_TODATE()));		//	점용종료일
		Bean.setWORK_FROMDATE(util.Date_Cut(Bean.getWORK_FROMDATE()));	//	공사 시작일
		Bean.setWORK_TODATE(util.Date_Cut(Bean.getWORK_TODATE()));		//	공사 종료일
		Bean.setFINISH_DATE(util.Date_Cut(Bean.getFINISH_DATE()));		//	준공일자
		Bean.setCOMPLETION_DATE(util.Date_Cut(Bean.getCOMPLETION_DATE()));		//준공년월일
		

		Bean.setYEAR(Bean.getMUL_FROMDATE().substring(0, 4));
		
		//System.out.println("====== 시설물 수정 테스트 =====");
		//System.out.println(Bean.getADMIN_NO());
		//System.out.println(Bean.getSISUL_ADDR1());
		//System.out.println(Bean.getSISUL_ADDR2());
		//System.out.println(Bean.getCORP_CD());
		//System.out.println(Bean.getHJ_CD());
		
//		Bean.setADMIN_NO(ServletRequestUtils.getStringParameter(request, "ADMIN_NO", ""));
//		Bean.setBJ_CD(ServletRequestUtils.getStringParameter(request, "BJ_CD", ""));
//		Bean.setHJ_CD(ServletRequestUtils.getStringParameter(request, "HJ_CD", ""));
//		Bean.setSPC_CD(ServletRequestUtils.getStringParameter(request, "SPC_CD", ""));
//		Bean.setBONBUN(ServletRequestUtils.getStringParameter(request, "BONBUN", ""));
//		Bean.setBUBUN(ServletRequestUtils.getStringParameter(request, "BUBUN", ""));
		
//		Bean.setSIDO("11");
//		Bean.setSIGUNGU("680");
		
	iJumyonginfoService.executeJumji_Modify(Bean);
	}

	//점용지정보 추가
	public ModelAndView		Jumji_Register(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		//System.out.println(">> TabJumji_Control.Jumji_Register");

		String 		adminno 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
		String 		gu_code 	= ServletRequestUtils.getStringParameter(request, "GU_CODE", "");
		String 		corp_cd 	= ServletRequestUtils.getStringParameter(request, "CORP_CD", "");
		String 		request_no 	= ServletRequestUtils.getStringParameter(request, "REQUEST_NO", "");
		String 		object_no 	= ServletRequestUtils.getStringParameter(request, "object_no", "");
		String 		year	 	= ServletRequestUtils.getStringParameter(request, "YEAR", "");
		
		//세션에서 시도 코드를 가져온다.
		String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
		HttpSession session = request.getSession();
		
		String 		userId	= (String)session.getAttribute("sessionUserId");
		List	list = null;
		
		try{		
			if(userId != null)
			{
				//	관리자 데이터를 가져온다.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
				int	currentPage	= Integer.parseInt(ServletRequestUtils.getStringParameter(request, "currentPage", "1"));
				int	iTotalCnt	= iJumyonginfoService.executeJumji_Count(corp_cd, gu_code, adminno);
				int	rowCol		= pageing.execute(request, iTotalCnt, currentPage, 10);
	
				request.setAttribute("ADMIN_NO",adminno);		//
				request.setAttribute("GU_CODE",gu_code);		//	구코드
				request.setAttribute("CORP_CD",corp_cd);		//
				request.setAttribute("REQUEST_NO",request_no);	//
				request.setAttribute("use_type", commonCode.executeCommonCode("use_type", null, "선택"));
				request.setAttribute("occupancy_type", commonCode.executeCommonCode("occupancy_type", null, "선택"));
				request.setAttribute("use_owner_Group", commonCode.executeCommonCode("use_ownerGroup", null, "선택"));
				request.setAttribute("taxation_section", commonCode.executeCommonCode("taxation_section", null, "선택"));
				request.setAttribute("bjdong_code", commonCode.executeBJDongCode(SIDO_CD, userBean.getSIGU_CD(), null));
				request.setAttribute("hjdong_code", commonCode.executeHJDongCode(SIDO_CD, userBean.getSIGU_CD(), null));
				request.setAttribute("mul_spc_cd", commonCode.executeCommonCode("MUL_SPC_CD", null, "선택"));
				request.setAttribute("sigungu_nm", commonCode.SearchGuName("11", userBean.getSIGU_CD().trim()));
				
				list	= iJumyonginfoService.executeSearch_Depth();
			}
		}
		catch(Exception e)
		{
			//System.out.println(e.toString());
		}
		
		request.setAttribute("YEAR", year);
		return new ModelAndView("/facility/jumyonginfo/tab/jumji_register", "blist", list);
	}
	
	
	//점용지 등록
	public ModelAndView		Jumji_Register_Prc(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		//System.out.println(">> TabJumji_Control.Jumji_Register_Prc");

		//	세션에서 시도 코드를 가져온다.
		String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
		UserBean	userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
		
		String 	sXMLFile 	= ServletRequestUtils.getStringParameter(request, "XMLDATA", "");
		
		String 		adminno 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
		String 		gu_code 	= ServletRequestUtils.getStringParameter(request, "GU_CODE", "");
		String 		corp_cd 	= ServletRequestUtils.getStringParameter(request, "CORP_CD", "");		
		String 		object_no 	= ServletRequestUtils.getStringParameter(request, "object_no", "");
		String 		year 		= ServletRequestUtils.getStringParameter(request, "YEAR", "");
		
		System.out.println("여기들어오긴 하냐?");
		System.out.println(sXMLFile);
		
		if(sXMLFile	== null)  System.out.println("널 이라네~~~");;
		
		try
		{		
			SAXBuilder 		builder 	= new SAXBuilder();
			Document 		document 	= builder.build(new StringReader(sXMLFile));
	
			Element	element				= document.getRootElement();
			List 	childElementList	= element.getChildren();
			
			PlaceBean	placeBean	= new PlaceBean();
			
			System.out.println("XML : " + childElementList.size());
			
			for(int i = 0	; i < childElementList.size()	;	i++)
			{
				placeBean.setADMIN_NO(adminno);
				placeBean.setCORP_CD(corp_cd);
				placeBean.setGU_CODE(gu_code);
				placeBean.setYEAR(year);
		
				////System.out.println(((Element)childElementList.get(i)).getChildText("SECTION"));
				////System.out.println(((Element)childElementList.get(i)).getChildText("OWNER_SET"));
				
				
				//위의 4개의 값을 가지고 해당 코드가 존재하는지 유무 체크... 
				//존재한다면		OBJECT_NO = OBJECT_NO + 1
				//존재하지 않다면	OBJECT_NO = 0001
				String OBJECT_NO = iJumyonginfoService.getObject_No(placeBean);
				
				placeBean.setTYPE("1");
			
				placeBean.setOBJECT_NO(OBJECT_NO);
				placeBean.setSECTION("1");
				
				placeBean.setOWNER_SET(((Element)childElementList.get(i)).getChildText("OWNER_SET")); //
				placeBean.setTAX_SET(((Element)childElementList.get(i)).getChildText("TAX_SET"));
				
				placeBean.setPURPOSE_CD(((Element)childElementList.get(i)).getChildText("PURPOSE_CD"));
				placeBean.setPURPOSESEBU_CD(((Element)childElementList.get(i)).getChildText("PURPOSESEBU_CD"));
				placeBean.setSTANDARD(((Element)childElementList.get(i)).getChildText("STANDARD"));
				placeBean.setQUANTITY(((Element)childElementList.get(i)).getChildText("QUANTITY"));
				
				placeBean.setDEPTH_CK(((Element)childElementList.get(i)).getChildText("DEPTH_CK"));
				placeBean.setDEPTH_NUM(((Element)childElementList.get(i)).getChildText("DEPTH_NUM"));
				placeBean.setMUL_FROMDATE(util.Date_Cut(((Element)childElementList.get(i)).getChildText("MUL_FROMDATE")));
				placeBean.setMUL_TODATE(util.Date_Cut(((Element)childElementList.get(i)).getChildText("MUL_TODATE")));
				placeBean.setPARTLY_PERIOD(((Element)childElementList.get(i)).getChildText("PARTLY_PERIOD"));
				placeBean.setTOTAL_PERIOD(((Element)childElementList.get(i)).getChildText("TOTAL_PERIOD"));

				
				placeBean.setBJ_CD(((Element)childElementList.get(i)).getChildText("BJ_CD"));
				placeBean.setHJ_CD(((Element)childElementList.get(i)).getChildText("HJ_CD"));
				placeBean.setSPC_CD(((Element)childElementList.get(i)).getChildText("SPC_CD"));
				placeBean.setBONBUN(((Element)childElementList.get(i)).getChildText("BONBUN"));
				placeBean.setBUBUN(((Element)childElementList.get(i)).getChildText("BUBUN"));
//				placeBean.setADDR_CK(((Element)childElementList.get(i)).getChildText("ADDR_CK"));
//				placeBean.setSISUL_ADDR_CK(((Element)childElementList.get(i)).getChildText("SISUL_ADDR_CK"));
//				placeBean.setSISUL_ADDR(((Element)childElementList.get(i)).getChildText("SISUL_ADDR"));

				placeBean.setWORK_FROMDATE(util.Date_Cut(((Element)childElementList.get(i)).getChildText("WORK_FROMDATE")));
				
				
				placeBean.setWORK_TODATE(util.Date_Cut(((Element)childElementList.get(i)).getChildText("WORK_TODATE")));
				placeBean.setCOMPLETION_DATE(util.Date_Cut(((Element)childElementList.get(i)).getChildText("COMPLETION_DATE")));
				placeBean.setEXE_INFO(((Element)childElementList.get(i)).getChildText("EXE_INFO"));
				placeBean.setSISUL_POST(((Element)childElementList.get(i)).getChildText("SISUL_POST"));
				placeBean.setSISUL_ADDR1(((Element)childElementList.get(i)).getChildText("SISUL_ADDR1"));
				placeBean.setSISUL_ADDR2(((Element)childElementList.get(i)).getChildText("SISUL_ADDR2"));
		    	
				iJumyonginfoService.executeJumji_Register(placeBean);
				
			}
			
			
		}
		catch(Exception e)
		{
			//System.out.println("시설물 데이터가 없는거 같습니다.");
		}
		
		int	currentPage	= Integer.parseInt(ServletRequestUtils.getStringParameter(request, "currentPage", "1"));
		int	iTotalCnt	= iJumyonginfoService.executeJumji_Count(corp_cd, gu_code, adminno);
		int	rowCol		= pageing.execute(request, iTotalCnt, currentPage, 10);

		List		list 	= iJumyonginfoService.executeJumji_View(corp_cd, gu_code, adminno,year, rowCol, rowCol + 9);
		PlaceBean	Bean	= new PlaceBean();
		int	size	= list.size();
		
		List list2;
		
		
		for(int i = 0	;	i < size	;	i++)
		{
			Bean	= (PlaceBean)list.get(i);
			
			Bean.setSIGUNGU(commonCode.SearchGuName(Bean.getSIDO(), Bean.getSIGUNGU()));	//	시 이름입력
			Bean.setMUL_FROMDATE(util.Date_Paste(Bean.getMUL_FROMDATE()));
			Bean.setMUL_TODATE(util.Date_Paste(Bean.getMUL_TODATE()));
			Bean.setWORK_FROMDATE(util.Date_Paste(Bean.getWORK_FROMDATE()));				//	공사 시작일
			Bean.setWORK_TODATE(util.Date_Paste(Bean.getWORK_TODATE()));					//	공사 종료일
			Bean.setWORK_FROMDATE(util.Date_Paste(Bean.getWORK_FROMDATE()));	//	공사 시작일
			Bean.setWORK_TODATE(util.Date_Paste(Bean.getWORK_TODATE()));		//	공사 종료일
			Bean.setFINISH_DATE(util.Date_Paste(Bean.getFINISH_DATE()));		//	준공일자
			Bean.setCOMPLETION_DATE(util.Date_Paste(Bean.getCOMPLETION_DATE()));		//
			
			
			if(object_no.equals(Bean.getOBJECT_NO()))
			{
				request.setAttribute("CORP_CD", Bean.getCORP_CD());
				request.setAttribute("GU_CODE", Bean.getGU_CODE());
				request.setAttribute("REQUEST_NO", Bean.getREQUEST_NO());
				request.setAttribute("use_type", "도로");
				request.setAttribute("object_no", Bean.getOBJECT_NO());
				request.setAttribute("section", Bean.getSECTION());
				request.setAttribute("purpose_cd", Bean.getPURPOSE_CD());
				request.setAttribute("purpose_nm", Bean.getPURPOSE_NM());
				request.setAttribute("owner_set", Bean.getOWNER_SET());
				request.setAttribute("owner_nm", commonCode.executeSearchCommonCode("use_ownerGroup", Bean.getOWNER_SET()));
				request.setAttribute("sido", Bean.getSIDO());
				request.setAttribute("sigungu", Bean.getSIGUNGU());
				request.setAttribute("sigungu_nm", commonCode.SearchGuName(Bean.getSIDO(), Bean.getSIGUNGU()));
				request.setAttribute("bj_cd", Bean.getBJ_CD());
				request.setAttribute("hj_cd", Bean.getHJ_CD());
				request.setAttribute("tax_set", Bean.getTAX_SET());
				request.setAttribute("tax_set_nm", commonCode.executeSearchCommonCode("taxation_section", Bean.getTAX_SET()));
				request.setAttribute("bjdong_code", commonCode.executeSearchBJDongCode(Bean.getSIDO(), Bean.getSIGUNGU(), Bean.getBJ_CD()));
				request.setAttribute("hjdong_code", commonCode.executeSearchHJDongCode(Bean.getSIDO(), Bean.getSIGUNGU(), Bean.getHJ_CD()));
				request.setAttribute("mul_spc_cd", commonCode.executeSearchCommonCode("SPC_CD", Bean.getSPC_CD()));
				request.setAttribute("section_nm", commonCode.executeSearchCommonCode("occupancy_type", Bean.getSECTION()));
				
				//점용지 지번
				if(Bean.getBUBUN()	!= null)
				{
					if(!Bean.getBUBUN().trim().equals(""))
					{
						request.setAttribute("bubun", "-" + Bean.getBUBUN() + "번지");
					}
					else
					{	
						request.setAttribute("bonbun", Bean.getBONBUN() + "번지");
					}
				}
				else
				{
					request.setAttribute("bonbun", Bean.getBONBUN() + "번지");
				}
				
				request.setAttribute("mul_fromdate", Bean.getMUL_FROMDATE());		//	점용시작일
				request.setAttribute("mul_todate", Bean.getMUL_TODATE());			//	점용종료일
				request.setAttribute("work_fromdate", Bean.getWORK_FROMDATE());	//	공사 시작일
				request.setAttribute("work_todate", Bean.getWORK_TODATE());		//	공사 종료일
				request.setAttribute("finish_date", Bean.getFINISH_DATE());		//	준공일자
				request.setAttribute("struts", Bean.getSTRUTS());
				request.setAttribute("exe_info", Bean.getEXE_INFO());
				request.setAttribute("purposesebu_cd", Bean.getPURPOSESEBU_CD());
				request.setAttribute("standard", Bean.getSTANDARD());
				request.setAttribute("quantity", Bean.getQUANTITY());
				request.setAttribute("depth_ck", Bean.getDEPTH_CK());
				request.setAttribute("depth_num", Bean.getDEPTH_NUM());
				request.setAttribute("completion_date", Bean.getCOMPLETION_DATE());
				request.setAttribute("with_addr_ck", Bean.getWITH_ADDR_CK());
				request.setAttribute("partly_period", Bean.getPARTLY_PERIOD());
				request.setAttribute("total_period", Bean.getTOTAL_PERIOD());
				request.setAttribute("sisul_addr", Bean.getSISUL_ADDR());
				request.setAttribute("addr_ck", Bean.getADDR_CK());
				request.setAttribute("sisul_addr_ck", Bean.getSISUL_ADDR_CK());
				request.setAttribute("san_ck", Bean.getSAN_CK());
				request.setAttribute("admin_no", Bean.getADMIN_NO());
				request.setAttribute("sisul_post", Bean.getSISUL_POST());
				request.setAttribute("sisul_addr1", Bean.getSISUL_ADDR1());
				request.setAttribute("sisul_addr2", Bean.getSISUL_ADDR2());
				request.setAttribute("year", Bean.getYEAR());
				request.setAttribute("purposesebu_nm", Bean.getPURPOSESEBU_NM());
			}
			else if(i == 0)
			{
				request.setAttribute("CORP_CD", Bean.getCORP_CD());
				request.setAttribute("GU_CODE", Bean.getGU_CODE());
				request.setAttribute("REQUEST_NO", Bean.getREQUEST_NO());
				request.setAttribute("use_type", "도로");
				request.setAttribute("object_no", Bean.getOBJECT_NO());
				request.setAttribute("section", Bean.getSECTION());
				request.setAttribute("purpose_cd", Bean.getPURPOSE_CD());
				request.setAttribute("purpose_nm", Bean.getPURPOSE_NM());
				request.setAttribute("owner_set", Bean.getOWNER_SET());
				request.setAttribute("owner_nm", commonCode.executeSearchCommonCode("use_ownerGroup", Bean.getOWNER_SET()));
				request.setAttribute("sido", Bean.getSIDO());
				request.setAttribute("sigungu", Bean.getSIGUNGU());
				request.setAttribute("sigungu_nm", commonCode.SearchGuName(Bean.getSIDO(), Bean.getSIGUNGU()));
				request.setAttribute("bj_cd", Bean.getBJ_CD());
				request.setAttribute("hj_cd", Bean.getHJ_CD());
				request.setAttribute("tax_set", Bean.getTAX_SET());
				request.setAttribute("tax_set_nm", commonCode.executeSearchCommonCode("taxation_section", Bean.getTAX_SET()));
				request.setAttribute("bjdong_code", commonCode.executeSearchBJDongCode(Bean.getSIDO(), Bean.getSIGUNGU(), Bean.getBJ_CD()));
				request.setAttribute("hjdong_code", commonCode.executeSearchHJDongCode(Bean.getSIDO(), Bean.getSIGUNGU(), Bean.getHJ_CD()));
				request.setAttribute("mul_spc_cd", commonCode.executeSearchCommonCode("SPC_CD", Bean.getSPC_CD()));
				request.setAttribute("section_nm", commonCode.executeSearchCommonCode("occupancy_type", Bean.getSECTION()));
				
				//점용지 지번
				if(Bean.getBUBUN()	!= null)
				{
					if(!Bean.getBUBUN().trim().equals(""))
					{
						request.setAttribute("bubun", "-" + Bean.getBUBUN() + "번지");
					}
					else
					{	
						request.setAttribute("bonbun", Bean.getBONBUN() + "번지");
					}
				}
				else
				{
					request.setAttribute("bonbun", Bean.getBONBUN() + "번지");
				}
				
				request.setAttribute("mul_fromdate", Bean.getMUL_FROMDATE());		//	점용시작일
				request.setAttribute("mul_todate", Bean.getMUL_TODATE());			//	점용종료일
				request.setAttribute("work_fromdate", Bean.getWORK_FROMDATE());	//	공사 시작일
				request.setAttribute("work_todate", Bean.getWORK_TODATE());		//	공사 종료일
				request.setAttribute("finish_date", Bean.getFINISH_DATE());		//	준공일자
				request.setAttribute("struts", Bean.getSTRUTS());
				request.setAttribute("exe_info", Bean.getEXE_INFO());
				request.setAttribute("purposesebu_cd", Bean.getPURPOSESEBU_CD());
				request.setAttribute("standard", Bean.getSTANDARD());
				request.setAttribute("quantity", Bean.getQUANTITY());
				request.setAttribute("depth_ck", Bean.getDEPTH_CK());
				request.setAttribute("depth_num", Bean.getDEPTH_NUM());
				request.setAttribute("completion_date", Bean.getCOMPLETION_DATE());
				request.setAttribute("with_addr_ck", Bean.getWITH_ADDR_CK());
				request.setAttribute("partly_period", Bean.getPARTLY_PERIOD());
				request.setAttribute("total_period", Bean.getTOTAL_PERIOD());
				request.setAttribute("sisul_addr", Bean.getSISUL_ADDR());
				request.setAttribute("addr_ck", Bean.getADDR_CK());
				request.setAttribute("sisul_addr_ck", Bean.getSISUL_ADDR_CK());
				request.setAttribute("san_ck", Bean.getSAN_CK());
				request.setAttribute("admin_no", Bean.getADMIN_NO());
				request.setAttribute("sisul_post", Bean.getSISUL_POST());
				request.setAttribute("sisul_addr1", Bean.getSISUL_ADDR1());
				request.setAttribute("sisul_addr2", Bean.getSISUL_ADDR2());
				request.setAttribute("year", Bean.getYEAR());
				request.setAttribute("purposesebu_nm", Bean.getPURPOSESEBU_NM());
			}
		}
		
		request.setAttribute("GU_CODE",gu_code);
		request.setAttribute("CORP_CD",corp_cd);
		
		request.setAttribute("ADMIN_NO", adminno);
		//System.out.println("year==>"+year);
		request.setAttribute("YEAR", year);
		
	//	return new ModelAndView("/menu/left/facility");
		
		return Jumji_View(request, response);
	}

}
