//	2009		Kim Yun Seo

package main.java.jumyong.minwoninfo.web;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import main.java.jumyong.minwoninfo.model.PlaceBean;
import main.java.jumyong.minwoninfo.service.IMinwoninfoService;
import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.util.catUtil.Util;


public class TabJumji_Control	extends MultiActionController {

	private	IMinwoninfoService	iMinwoninfoService	= null;
	private	CommonCodeService	commonCode			= null;
	private	Util				util				= new Util();

	
	public void setMinwoninfoService(IMinwoninfoService minwoninfoService) 
	{
		this.iMinwoninfoService = minwoninfoService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode) 
	{
		this.commonCode 	= commonCode;
	}
	
	
	//	점용지정보 보기
	public ModelAndView		Jumji_View(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");		
		PlaceBean	Bean	= new PlaceBean();
		
		try{
			if(userId != null){
				String 		adminno 
				= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
		
				//	점용지 정보를 가져온다.
				List		list 	= iMinwoninfoService.executeJumji_View(adminno);				
		
				if(list.size()<=0)
					Bean	= null;
				else
				{
					Bean	= (PlaceBean)list.get(0);
					
					request.setAttribute("use_type", commonCode.executeSearchCommonCode("use_type", Bean.getTYPE()));
					request.setAttribute("occupancy_type", commonCode.executeSearchCommonCode("occupancy_type", Bean.getSECTION()));
					request.setAttribute("use_owner_Group", commonCode.executeSearchCommonCode("use_ownerGroup", Bean.getOWNER_SET()));
					request.setAttribute("taxation_section", commonCode.executeSearchCommonCode("taxation_section", Bean.getTAX_SET()));
					
					request.setAttribute("bjdong_code", commonCode.executeSearchBJDongCode(Bean.getSIDO(), Bean.getSIGUNGU(), Bean.getBJ_CD()));
					request.setAttribute("hjdong_code", commonCode.executeSearchHJDongCode(Bean.getSIDO(), Bean.getSIGUNGU(), Bean.getHJ_CD()));
				//	request.setAttribute("mul_spc_cd", commonCode.executeCommonCode("MUL_SPC_CD", null, "선택"));
					request.setAttribute("mul_spc_cd", commonCode.executeSearchCommonCode("MUL_SPC_CD", Bean.getSAN_CK()));
					
				
					Bean.setMUL_FROMDATE(util.Date_Paste(Bean.getMUL_FROMDATE()));		//	점용시작일
					Bean.setMUL_TODATE(util.Date_Paste(Bean.getMUL_TODATE()));			//	점용종료일
					Bean.setWORK_FROMDATE(util.Date_Paste(Bean.getWORK_FROMDATE()));	//	공사 시작일
					Bean.setWORK_TODATE(util.Date_Paste(Bean.getWORK_TODATE()));		//	공사 종료일
					Bean.setFINISH_DATE(util.Date_Paste(Bean.getFINISH_DATE()));		//	준공일자
					
					Bean.setSIGUNGU(commonCode.SearchGuName(Bean.getSIDO(), Bean.getSIGUNGU()));	//	시 이름입력
					
					//	점용지 지번
					if(Bean.getBUBUN()	!= null)
					{
						if(!Bean.getBUBUN().trim().equals(""))
							Bean.setBUBUN("-" + Bean.getBUBUN() + "번지");
						else	Bean.setBONBUN(Bean.getBONBUN() + "번지");
					}
					else	Bean.setBONBUN(Bean.getBONBUN() + "번지");
						
					if(Bean.getBAN()	!= null)
						if(!Bean.getBAN().trim().equals(""))
							Bean.setBAN("/" + Bean.getBAN());
					
					//	건물 정보
					if(Bean.getBD_DONG()	!= null)
						if(!Bean.getBD_DONG().trim().equals(""))
							Bean.setBD_NM(Bean.getBD_NM() + " " + Bean.getBD_DONG() + "동");
					
					if(Bean.getBD_HO()	!= null)
						if(!Bean.getBD_HO().trim().equals(""))
							Bean.setBD_NM(Bean.getBD_NM() + " " + Bean.getBD_HO() + "호");
					
					//	공사 기간
					if(Bean.getWORK_TODATE()	!= null)
						if(!Bean.getWORK_TODATE().trim().equals(""))
							Bean.setWORK_FROMDATE(Bean.getWORK_FROMDATE() + " ~ " + Bean.getWORK_TODATE());
				}
				
				request.setAttribute("ADMIN_NO", adminno);
			}
		}catch(Exception e){
			System.out.println("error:"+e.toString());
		}	
		return new ModelAndView("/jumyong/minwoninfo/tab/jumji_view", "board", Bean);
	}
	
	//	점용지정보 보기 (수정 불가)
	public ModelAndView		JumjiInfo_View(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");		
		PlaceBean	Bean	= new PlaceBean();
		
		try{
			if(userId != null){
				
				String 	ADMIN_NO 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
			//	String 	SEQ	 		= ServletRequestUtils.getStringParameter(request, "SEQ", "");
			//	String	currentPage	= ServletRequestUtils.getStringParameter(request, "currentPage", "1");
				
				//	점용지 데이터를 가져온다.
				List		list 	= iMinwoninfoService.executeJumji_View(ADMIN_NO);				
		
				if(list.size()<=0)
					Bean	= null;
				else
				{
					Bean	= (PlaceBean)list.get(0);
					
					request.setAttribute("use_type", commonCode.executeSearchCommonCode("use_type", Bean.getTYPE()));
					request.setAttribute("occupancy_type", commonCode.executeSearchCommonCode("occupancy_type", Bean.getSECTION()));
					request.setAttribute("use_owner_Group", commonCode.executeSearchCommonCode("use_ownerGroup", Bean.getOWNER_SET()));
					request.setAttribute("taxation_section", commonCode.executeSearchCommonCode("taxation_section", Bean.getTAX_SET()));
					
					request.setAttribute("bjdong_code", commonCode.executeSearchBJDongCode(Bean.getSIDO(), Bean.getSIGUNGU(), Bean.getBJ_CD()));
					request.setAttribute("hjdong_code", commonCode.executeSearchHJDongCode(Bean.getSIDO(), Bean.getSIGUNGU(), Bean.getHJ_CD()));
				//	request.setAttribute("mul_spc_cd", commonCode.executeCommonCode("MUL_SPC_CD", null, "선택"));
					request.setAttribute("mul_spc_cd", commonCode.executeSearchCommonCode("MUL_SPC_CD", Bean.getSAN_CK()));
					
				
					Bean.setMUL_FROMDATE(util.Date_Paste(Bean.getMUL_FROMDATE()));		//	점용시작일
					Bean.setMUL_TODATE(util.Date_Paste(Bean.getMUL_TODATE()));			//	점용종료일
					Bean.setWORK_FROMDATE(util.Date_Paste(Bean.getWORK_FROMDATE()));	//	공사 시작일
					Bean.setWORK_TODATE(util.Date_Paste(Bean.getWORK_TODATE()));		//	공사 종료일
					Bean.setFINISH_DATE(util.Date_Paste(Bean.getFINISH_DATE()));		//	준공일자
					
					Bean.setSIGUNGU(commonCode.SearchGuName(Bean.getSIDO(), Bean.getSIGUNGU()));	//	시 이름입력
					
					//	점용지 지번
					if(Bean.getBUBUN()	!= null)
					{
						if(!Bean.getBUBUN().trim().equals(""))
							Bean.setBUBUN("-" + Bean.getBUBUN() + "번지");
						else	Bean.setBONBUN(Bean.getBONBUN() + "번지");
					}
					else	Bean.setBONBUN(Bean.getBONBUN() + "번지");
						
					if(Bean.getBAN()	!= null)
						if(!Bean.getBAN().trim().equals(""))
							Bean.setBAN("/" + Bean.getBAN());
					
					//	건물 정보
					if(Bean.getBD_DONG()	!= null)
						if(!Bean.getBD_DONG().trim().equals(""))
							Bean.setBD_NM(Bean.getBD_NM() + " " + Bean.getBD_DONG() + "동");
					
					if(Bean.getBD_HO()	!= null)
						if(!Bean.getBD_HO().trim().equals(""))
							Bean.setBD_NM(Bean.getBD_NM() + " " + Bean.getBD_HO() + "호");
					
					//	공사 기간
					if(Bean.getWORK_TODATE()	!= null)
						if(!Bean.getWORK_TODATE().trim().equals(""))
							Bean.setWORK_FROMDATE(Bean.getWORK_FROMDATE() + " ~ " + Bean.getWORK_TODATE());
				}
				
				request.setAttribute("ADMIN_NO", ADMIN_NO);
			//	request.setAttribute("SEQ", SEQ);
			//	request.setAttribute("currentPage", currentPage);
				
			}
		}catch(Exception e){
			System.out.println("error:"+e.toString());
		}	
		return new ModelAndView("/jumyong/minwoninfo/tab/jumjiinfo_view", "board", Bean);
	}
	
	//	점용지정보 수정
	public ModelAndView		Jumji_Modify(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");		
		PlaceBean	Bean	= new PlaceBean();
		
		try{
			if(userId != null){
				
				String 		adminno = ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
		
				//	점용지 데이터를 가져온다.
				List		list 	= iMinwoninfoService.executeJumji_View(adminno);								
				
				Bean	= (PlaceBean)list.get(0);
				
				request.setAttribute("use_type", commonCode.executeCommonCode("use_type", Bean.getTYPE(), null));
				request.setAttribute("occupancy_type", commonCode.executeCommonCode("occupancy_type", Bean.getSECTION(), null));
				request.setAttribute("use_owner_Group", commonCode.executeCommonCode("use_ownerGroup", Bean.getOWNER_SET(), null));
				request.setAttribute("taxation_section", commonCode.executeCommonCode("taxation_section", Bean.getTAX_SET(), null));
				
				//	점용지
				request.setAttribute("bjdong_code", commonCode.executeBJDongCode(Bean.getSIDO(), Bean.getSIGUNGU(), Bean.getBJ_CD()));
				request.setAttribute("hjdong_code", commonCode.executeHJDongCode(Bean.getSIDO(), Bean.getSIGUNGU(), Bean.getHJ_CD()));
				request.setAttribute("mul_spc_cd", commonCode.executeCommonCode("MUL_SPC_CD", Bean.getSAN_CK(), null));
				
				Bean.setSIGUNGU(commonCode.SearchGuName(Bean.getSIDO(), Bean.getSIGUNGU()));	//	시 이름입력
				
				Bean.setMUL_FROMDATE(util.Date_Paste(Bean.getMUL_FROMDATE()));		//	점용시작일
				Bean.setMUL_TODATE(util.Date_Paste(Bean.getMUL_TODATE()));			//	점용종료일
				Bean.setWORK_FROMDATE(util.Date_Paste(Bean.getWORK_FROMDATE()));	//	공사 시작일
				Bean.setWORK_TODATE(util.Date_Paste(Bean.getWORK_TODATE()));		//	공사 종료일
				Bean.setFINISH_DATE(util.Date_Paste(Bean.getFINISH_DATE()));		//	준공일자
				
				request.setAttribute("ADMIN_NO", adminno);
				
			}
		}catch(Exception e){
			System.out.println("error:"+e.toString());
		}	
		return new ModelAndView("/jumyong/minwoninfo/tab/jumji_modify", "board", Bean);
	}
	
	//	점용지 정보 수정 처리
	public ModelAndView		Jumji_Modify_Prc(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		try{
			
			String 	adminno = ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
		
		//	int		count	= iMinwoninfoService.executeJumji_Check(adminno);
	
		//	if(count == 0)	//	테이블에 데이터가 없을경우 새로 추가한다.
		//		Jumji_Register_Execute(request, response, adminno);
		//	else
			
			//	점용지 데이터 수정
			Jumji_Modify_Execute(request, response, adminno);
			
			request.setAttribute("ADMIN_NO", adminno);
			
		}catch(Exception e){
			System.out.println("error:"+e.toString());
		}	
		//	뷰화면으로 이동
		return	Jumji_View(request, response);
	}

	//	점용지 정보 수정
	public void		Jumji_Modify_Execute(HttpServletRequest request,HttpServletResponse response, String adminno) throws Exception 
	{
		try{
			PlaceBean	Bean	= new PlaceBean();
			
			bind(request, Bean);
			
			Bean.setMUL_FROMDATE(util.Date_Cut(Bean.getMUL_FROMDATE()));	//	점용시작일
			Bean.setMUL_TODATE(util.Date_Cut(Bean.getMUL_TODATE()));		//	점용종료일
			Bean.setWORK_FROMDATE(util.Date_Cut(Bean.getWORK_FROMDATE()));	//	공사 시작일
			Bean.setWORK_TODATE(util.Date_Cut(Bean.getWORK_TODATE()));		//	공사 종료일
			Bean.setFINISH_DATE(util.Date_Cut(Bean.getFINISH_DATE()));		//	준공일자
			
			Bean.setADMIN_NO(adminno);
			
			Bean.setSIDO("11");
			Bean.setSIGUNGU("680");
			
		//	System.out.println("EXE_INFO ; " + Bean.getROAD_ADD());
			
			//	점용지 수정
			iMinwoninfoService.executeJumji_Modify(Bean);
		}catch(Exception e){
			System.out.println("error:"+e.toString());
		}	
	}
/*	
	//	점용지 정보 추가
	public void		Jumji_Register_Execute(HttpServletRequest request,HttpServletResponse response, String adminno) throws Exception 
	{
		Place_Register_Execute(request, response, adminno);
		
//		PlaceBean	Bean	= new PlaceBean();
//		
//		bind(request, Bean);
//		
//		Bean.setMUL_POST(ServletRequestUtils.getStringParameter(request, "jumji_post", ""));
//		Bean.setADMIN_NO(adminno);
//		
//		iMinwonService.executeJumji_Register(Bean);
	}
	
	
	//	민원등록 추가
	public boolean		Place_Register_Execute(HttpServletRequest request,HttpServletResponse response, String adminno) throws Exception 
	{
		PlaceBean	palceBean	= new PlaceBean();
		bind(request, palceBean);
		palceBean.setADMIN_NO(adminno);
		
		palceBean.setMUL_FROMDATE(util.Date_Cut(palceBean.getMUL_FROMDATE()));		//	점용시작일
		palceBean.setMUL_TODATE(util.Date_Cut(palceBean.getMUL_TODATE()));			//	점용종료일
		palceBean.setWORK_FROMDATE(util.Date_Cut(palceBean.getWORK_FROMDATE()));	//	공사 시작일
		palceBean.setWORK_TODATE(util.Date_Cut(palceBean.getWORK_TODATE()));		//	공사 종료일
		palceBean.setFINISH_DATE(util.Date_Cut(palceBean.getFINISH_DATE()));		//	준공일자
		
		palceBean.setSIDO("11");
		palceBean.setSIGUNGU("680");
		
		return	iMinwonService.executePlace_Register(palceBean);
	}
	*/
}
