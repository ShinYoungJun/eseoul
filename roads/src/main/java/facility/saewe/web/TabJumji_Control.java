
package main.java.facility.saewe.web;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.util.catUtil.Pageing;
import main.java.common.util.catUtil.Util;
import main.java.facility.saewe.model.PlaceBean;
import main.java.facility.saewe.service.ISaeweService;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class TabJumji_Control	extends MultiActionController{

	private	ISaeweService		iSaeweService	= null;
	private	CommonCodeService	commonCode		= null;
	private	Util				util			= new Util();
	private	Pageing				pageing				= new Pageing();

	public void setFacility_saeweService(ISaeweService facility_saeweService) 
	{
		//System.out.println(">> TabJumji_Control.Jumji_View");

		this.iSaeweService = facility_saeweService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode)
	{
		//System.out.println(">> TabJumji_Control.Jumji_View");

		this.commonCode 	= commonCode;
	}
	
	//	점용지 정보 상세보기
	public ModelAndView 	Jumji_View(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{

		//System.out.println(">> TabJumji_Control.Jumji_View");
		
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
				String 		tax_set		= ServletRequestUtils.getStringParameter(request, "TAX_SET", "");
				
/*				
				int	currentPage	= Integer.parseInt(ServletRequestUtils.getStringParameter(request, "currentPage", "1"));
				int	iTotalCnt	= iJumyonginfoService.executeJumji_Count(corp_cd, gu_code, adminno);
				int	rowCol		= pageing.execute(request, iTotalCnt, currentPage, 5);
		
				list 	= iJumyonginfoService.executeJumji_View(corp_cd, gu_code, adminno,year, rowCol, rowCol + 4);
				PlaceBean	Bean	= new PlaceBean();
				int	size	= list.size();
				
				//System.out.println("list : "+list.size());
*/
				
				//int currentPage	= Integer.parseInt(ServletRequestUtils.getStringParameter(request, "currentPage", "1"));
				String currentPage	= ServletRequestUtils.getStringParameter(request, "currentPage", "1");
				int	iTotalCnt	= iSaeweService.executeJumji_Count(corp_cd, gu_code, adminno,tax_set);
				//System.out.println("Saewe paging test -> "+"currentPage : "+currentPage+" iTotalCnt : "+iTotalCnt);
				int	rowCol		= pageing.execute(request, iTotalCnt, Integer.parseInt(currentPage), 10);
		
				list 	= iSaeweService.executeJumji_View(corp_cd, gu_code, adminno, tax_set,rowCol, rowCol + 9);

				int	size	= list.size();

				PlaceBean	Bean	= new PlaceBean();

				//System.out.println("**********************");
				//System.out.println("ADMIN_NO : "+adminno);
				//System.out.println("GU_CODE : "+gu_code);
				//System.out.println("CORP_CD : "+corp_cd);
				//System.out.println("REQUEST_NO : "+request_no);
				//System.out.println("object_no : "+object_no);
				//System.out.println("TAX_SET : "+tax_set);
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
						request.setAttribute("use_type", "도로");
						request.setAttribute("object_no", Bean.getOBJECT_NO());
						request.setAttribute("section", Bean.getSECTION().trim());
						request.setAttribute("purpose_cd", Bean.getPURPOSE_CD());
						request.setAttribute("purpose_nm", Bean.getPURPOSE_NM());
						request.setAttribute("owner_set", Bean.getOWNER_SET().trim());
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

						//System.out.println("*************** TabJumji_Control.Jumji_View      test 8 ***************");
					}
					else if(i == 0)
					{
						request.setAttribute("CORP_CD", Bean.getCORP_CD());
						request.setAttribute("GU_CODE", Bean.getGU_CODE());						
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
						
						//System.out.println("*************** TabJumji_Control.Jumji_View      test 9 ***************");

						//점용지 지번
						if(Bean.getBUBUN()	!= null)
						{

							//System.out.println("*************** TabJumji_Control.Jumji_View      test 10 ***************");

							if(!Bean.getBUBUN().trim().equals(""))
							{
								request.setAttribute("bubun", "-" + Bean.getBUBUN() + "번지");
								//System.out.println("*************** TabJumji_Control.Jumji_View      test 11 ***************");

							}
							else
							{	
								request.setAttribute("bonbun", Bean.getBONBUN() + "번지");
								//System.out.println("*************** TabJumji_Control.Jumji_View      test 12 ***************");

							}
						}
						else
						{
							request.setAttribute("bonbun", Bean.getBONBUN() + "번지");
							//System.out.println("*************** TabJumji_Control.Jumji_View      test 13 ***************");

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

						//System.out.println("*************** TabJumji_Control.Jumji_View      test 14 ***************");

					}
					//System.out.println("*************** TabJumji_Control.Jumji_View      test 15 ***************");
				}
				//System.out.println("*************** TabJumji_Control.Jumji_View      test 16 ***************");
			}
			//System.out.println("*************** TabJumji_Control.Jumji_View      test 17 ***************");

		}catch(Exception e){
			//System.out.println(e.toString());
		}	
		
		return new ModelAndView("/facility/saewe/tab/jumji_view", "blist", list);
	}
}
