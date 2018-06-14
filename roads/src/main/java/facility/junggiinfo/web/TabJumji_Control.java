//	2009		Kim Yun Seo

package main.java.facility.junggiinfo.web;


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

import main.java.facility.junggiinfo.model.AppealBean;
import main.java.facility.junggiinfo.model.PlaceBean;
import main.java.facility.junggiinfo.service.IJunggiinfoService;
import main.java.facility.minwon.model.Admin_BaseBean;
import main.java.facility.minwoninfo.model.MinwonBean;
import main.java.common.commonCode.model.UserBean;
import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.util.catUtil.Pageing;
import main.java.common.util.catUtil.Util;


public class TabJumji_Control	extends MultiActionController {

	private	IJunggiinfoService	iJunggiinfoService	= null;
	private	CommonCodeService	commonCode			= null;
	private	Util				util				= new Util();
	private	Pageing				pageing				= new Pageing();
	
	public void setFacility_junggiinfoService(IJunggiinfoService facility_junggiinfoService) 
	{
		this.iJunggiinfoService = facility_junggiinfoService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode) 
	{
		this.commonCode 	= commonCode;
	}
	
	
	//	점용지정보 보기
	public ModelAndView		Jumji_View(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		
		HttpSession session 	= request.getSession();
		String 	userId	= (String)session.getAttribute("sessionUserId");		
		List		list		= null;
				
		try{
			if(userId != null){
				String 		adminno 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
				String 		gu_code 	= ServletRequestUtils.getStringParameter(request, "GU_CODE", "");
				String 		corp_cd 	= ServletRequestUtils.getStringParameter(request, "CORP_CD", "");
				String 		request_no 	= ServletRequestUtils.getStringParameter(request, "REQUEST_NO", "");
				String 		object_no 	= ServletRequestUtils.getStringParameter(request, "object_no", "");
				
				int	currentPage	= Integer.parseInt(ServletRequestUtils.getStringParameter(request, "currentPage", "1"));
				int	iTotalCnt	= iJunggiinfoService.executeJumji_Count(corp_cd, gu_code, request_no);
				int	rowCol		= pageing.execute(request, iTotalCnt, currentPage, 10);
		
				list 	= iJunggiinfoService.executeJumji_View(corp_cd, gu_code, request_no, rowCol, rowCol + 9);
				PlaceBean	Bean	= new PlaceBean();
				int	size	= list.size();
				
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
			}
		}catch(Exception e){
			System.out.println(e.toString());
		}	
		
		return new ModelAndView("/facility/junggiinfo/tab/jumji_view", "blist", list);
	}
	
	//	점용지정보 수정
	public ModelAndView		Jumji_Modify(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		HttpSession session 	= request.getSession();
		String 	userId	= (String)session.getAttribute("sessionUserId");		
		List		list		= null;
				
		try{
			if(userId != null){
				String 		adminno 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
				String 		gu_code 	= ServletRequestUtils.getStringParameter(request, "GU_CODE", "");
				String 		corp_cd 	= ServletRequestUtils.getStringParameter(request, "CORP_CD", "");
				String 		request_no 	= ServletRequestUtils.getStringParameter(request, "REQUEST_NO", "");
				String 		object_no 	= ServletRequestUtils.getStringParameter(request, "object_no", "");
				
				int	currentPage	= Integer.parseInt(ServletRequestUtils.getStringParameter(request, "currentPage", "1"));
				int	iTotalCnt	= iJunggiinfoService.executeJumji_Count(corp_cd, gu_code, request_no);
				int	rowCol		= pageing.execute(request, iTotalCnt, currentPage, 10);
		
				list 	= iJunggiinfoService.executeJumji_View(corp_cd, gu_code, request_no, rowCol, rowCol + 9);
				PlaceBean	Bean	= new PlaceBean();
				int	size	= list.size();
				
				List list2	= iJunggiinfoService.executeSearch_Depth();
				
				for(int i = 0	;	i < size	;	i++)
				{
					Bean	= (PlaceBean)list.get(i);
					
					Bean.setSIGUNGU(commonCode.SearchGuName(Bean.getSIDO(), Bean.getSIGUNGU()));	//	시 이름입력
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
					}
				}
				
				request.setAttribute("clist", list2);
		
			}
		}catch(Exception e){
			System.out.println(e.toString());
		}	
		
		return new ModelAndView("/facility/junggiinfo/tab/jumji_modify", "blist", list);
	}
	
	//	점용지 정보 수정 처리
	public ModelAndView		Jumji_Modify_Prc(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		Jumji_Modify_Execute(request, response);
		
		return Jumji_Modify(request,response);
	}

	//	점용지 정보 수정
	public void		Jumji_Modify_Execute(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		PlaceBean	Bean	= new PlaceBean();
		
		bind(request, Bean);
		
		Bean.setGU_CODE(ServletRequestUtils.getStringParameter(request, "GU_CODE", ""));
		Bean.setCORP_CD(ServletRequestUtils.getStringParameter(request, "CORP_CD", ""));
		Bean.setREQUEST_NO(ServletRequestUtils.getStringParameter(request, "REQUEST_NO", ""));
		Bean.setOBJECT_NO(ServletRequestUtils.getStringParameter(request, "object_no", ""));
		Bean.setMUL_FROMDATE(util.Date_Cut(Bean.getMUL_FROMDATE()));	//	점용시작일
		Bean.setMUL_FROMDATE(util.Date_Cut(Bean.getMUL_FROMDATE()));	//	점용시작일
		Bean.setMUL_TODATE(util.Date_Cut(Bean.getMUL_TODATE()));		//	점용종료일
		Bean.setWORK_FROMDATE(util.Date_Cut(Bean.getWORK_FROMDATE()));	//	공사 시작일
		Bean.setWORK_TODATE(util.Date_Cut(Bean.getWORK_TODATE()));		//	공사 종료일
		Bean.setFINISH_DATE(util.Date_Cut(Bean.getFINISH_DATE()));		//	준공일자
		Bean.setCOMPLETION_DATE(util.Date_Cut(Bean.getCOMPLETION_DATE()));		//준공년월일
		
		Bean.setADMIN_NO(Bean.getGU_CODE()+Bean.getCORP_CD()+Bean.getREQUEST_NO()+Bean.getOBJECT_NO());
		Bean.setYEAR(Bean.getMUL_FROMDATE().substring(0, 4));
		
//		Bean.setSIDO("11");
//		Bean.setSIGUNGU("680");
		
		iJunggiinfoService.executeJumji_Modify(Bean);
	}

	//점용지정보 추가
	public ModelAndView		Jumji_Register(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		
		String 		adminno 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
		String 		gu_code 	= ServletRequestUtils.getStringParameter(request, "GU_CODE", "");
		String 		corp_cd 	= ServletRequestUtils.getStringParameter(request, "CORP_CD", "");
		String 		request_no 	= ServletRequestUtils.getStringParameter(request, "REQUEST_NO", "");
		String 		object_no 	= ServletRequestUtils.getStringParameter(request, "object_no", "");
		
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
				int	iTotalCnt	= iJunggiinfoService.executeJumji_Count(corp_cd, gu_code, request_no);
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
				
				list	= iJunggiinfoService.executeSearch_Depth();
			}
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		
		return new ModelAndView("/facility/junggiinfo/tab/jumji_register", "blist", list);
	}
	
	
	//점용지 등록
	public ModelAndView		Jumji_Register_Prc(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		//	세션에서 시도 코드를 가져온다.
		String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
		UserBean	userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
		
		String 	sXMLFile 	= ServletRequestUtils.getStringParameter(request, "XMLDATA", "");
		
		String 		adminno 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
		String 		gu_code 	= ServletRequestUtils.getStringParameter(request, "GU_CODE", "");
		String 		corp_cd 	= ServletRequestUtils.getStringParameter(request, "CORP_CD", "");
		String 		request_no 	= ServletRequestUtils.getStringParameter(request, "REQUEST_NO", "");
		String 		object_no 	= ServletRequestUtils.getStringParameter(request, "object_no", "");
		
		HttpSession session 	= request.getSession();
		String 	userId	= (String)session.getAttribute("sessionUserId");		
		List		list		= null;
				
		try
		{
			if(userId != null){
				SAXBuilder 		builder 	= new SAXBuilder();
				Document 		document 	= builder.build(new StringReader(sXMLFile));
		
				Element	element				= document.getRootElement();
				List 	childElementList	= element.getChildren();
				
				PlaceBean	placeBean	= new PlaceBean();
				
			//	System.out.println("XML : " + childElementList.size());
				
				for(int i = 0	; i < childElementList.size()	;	i++)
				{
					placeBean.setADMIN_NO(adminno);
					placeBean.setCORP_CD(corp_cd);
					placeBean.setGU_CODE(gu_code);
					placeBean.setREQUEST_NO(request_no);
					
					//위의 4개의 값을 가지고 해당 코드가 존재하는지 유무 체크... 
					//존재한다면		OBJECT_NO = OBJECT_NO + 1
					//존재하지 않다면	OBJECT_NO = 0001
					String OBJECT_NO = iJunggiinfoService.getObject_No(placeBean);
					
					placeBean.setOBJECT_NO(OBJECT_NO);
					//placeBean.setSECTION(((Element)childElementList.get(i)).getChildText("SECTION"));
					placeBean.setSECTION("1");
					placeBean.setOWNER_SET(((Element)childElementList.get(i)).getChildText("OWNER_SET"));
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
					placeBean.setWORK_FROMDATE(util.Date_Cut(((Element)childElementList.get(i)).getChildText("WORK_FROMDATE")));
					placeBean.setWORK_TODATE(util.Date_Cut(((Element)childElementList.get(i)).getChildText("WORK_TODATE")));
					placeBean.setCOMPLETION_DATE(util.Date_Cut(((Element)childElementList.get(i)).getChildText("COMPLETION_DATE")));
					placeBean.setEXE_INFO(((Element)childElementList.get(i)).getChildText("EXE_INFO"));
					placeBean.setSISUL_POST(((Element)childElementList.get(i)).getChildText("SISUL_POST"));
					placeBean.setSISUL_ADDR1(((Element)childElementList.get(i)).getChildText("SISUL_ADDR1"));
					placeBean.setSISUL_ADDR2(((Element)childElementList.get(i)).getChildText("SISUL_ADDR2"));
				
					placeBean.setADMIN_NO(placeBean.getGU_CODE()+placeBean.getCORP_CD()+placeBean.getREQUEST_NO()+placeBean.getOBJECT_NO());
					placeBean.setYEAR(placeBean.getMUL_FROMDATE().substring(0, 4));
			    	
					iJunggiinfoService.executeJumji_Register(placeBean);
					
					}
			}
		}
		catch(Exception e)
		{
			System.out.println("시설물 데이터가 없는거 같습니다.");
		}
		
		try{
			if(userId != null){
				int	currentPage	= Integer.parseInt(ServletRequestUtils.getStringParameter(request, "currentPage", "1"));
				int	iTotalCnt	= iJunggiinfoService.executeJumji_Count(corp_cd, gu_code, request_no);
				int	rowCol		= pageing.execute(request, iTotalCnt, currentPage, 10);
		
				list 		= iJunggiinfoService.executeJumji_View(corp_cd, gu_code, request_no, rowCol, rowCol + 9);
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
			}
		}catch(Exception e){
			System.out.println(e.toString());
		}	
		
		return new ModelAndView("/facility/junggiinfo/tab/jumji_view", "blist", list);
	}
}
