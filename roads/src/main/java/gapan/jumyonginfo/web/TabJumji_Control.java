//	2009		Kim Yun Seo

package main.java.gapan.jumyonginfo.web;


import java.io.StringReader;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import main.java.gapan.jumyonginfo.model.GapanCodeBean;
import main.java.gapan.jumyonginfo.model.GapanInfoBean;
import main.java.gapan.jumyonginfo.service.IJumyonginfoService;
import main.java.jumyong.oldminwon.model.Apjy01mr1Bean;
import main.java.common.commonCode.model.UserBean;
import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.util.FileUploadUtil2;
import main.java.common.util.FileUtil;
import main.java.common.util.Globals;
import main.java.common.util.catUtil.Pageing;
import main.java.common.util.catUtil.Util;


public class TabJumji_Control	extends MultiActionController {

	private	IJumyonginfoService	iJumyonginfoService	= null;
	private	CommonCodeService	commonCode			= null;
	private	Util				util				= new Util();
	private	Pageing				pageing				= new Pageing();
	
	public void setGapan_jumyonginfoService(IJumyonginfoService gapan_jumyonginfoService) 
	{
		this.iJumyonginfoService = gapan_jumyonginfoService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode) 
	{
		this.commonCode 	= commonCode;
	}
	
	//	점용지정보 보기
	public ModelAndView		Jumji_View(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		
//		 삭제 세션
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		GapanInfoBean gapanInfoBean = null; 

		System.out.println("######################111111");
		try{
			if(userId != null)
			{

				System.out.println("######################222222222222");
				
				String 		gapanno 	= ServletRequestUtils.getStringParameter(request, "GAPAN_NO", "");
				String 		gu_code 	= ServletRequestUtils.getStringParameter(request, "GU_CODE", "");
				
				List		list 	= iJumyonginfoService.executeJumji_View(gapanno);
				gapanInfoBean = new GapanInfoBean();
				
				if(list.size()<=0)
					gapanInfoBean	= null;
				else
				{
					gapanInfoBean	= (GapanInfoBean)list.get(0);
				}
				
				gapanInfoBean.setOWNER_SET_NM(commonCode.executeCommonCodeNm("use_ownerGroup", gapanInfoBean.getOWNER_SET()));
				gapanInfoBean.setTAX_SET_NM(commonCode.executeCommonCodeNm("taxation_section", gapanInfoBean.getTAX_SET()));
				
				gapanInfoBean.setMUL_FROMDATE(util.Date_Paste(gapanInfoBean.getMUL_FROMDATE()));
				gapanInfoBean.setMUL_TODATE(util.Date_Paste(gapanInfoBean.getMUL_TODATE()));

				System.out.println("######################33333333333");
				List open_time_list = util.SubString_String(gapanInfoBean.getOPEN_TIME(),2);
				if(open_time_list != null){
					if(open_time_list.get(0) != ""){
						gapanInfoBean.setOPEN_TIME(open_time_list.get(0) + ":" + open_time_list.get(1));
					}
				}
				
				List close_time_list = util.SubString_String(gapanInfoBean.getCLOSE_TIME(),2);
				if(close_time_list != null){
					if(close_time_list.get(0) != ""){
						gapanInfoBean.setCLOSE_TIME(close_time_list.get(0) + ":" + close_time_list.get(1));
					}
				}
				
				String change_ym = gapanInfoBean.getCHANGE_YM();
				if(change_ym != null && change_ym.length() > 5){
					gapanInfoBean.setCHANGE_YM(change_ym.substring(0,4)+"년 "+change_ym.substring(4,6)+"월");
				}
				
				System.out.println("######################44444444444");
				gapanInfoBean.setDAY_SALES(util.Comma_Paste(gapanInfoBean.getDAY_SALES()));
				gapanInfoBean.setPERMIT_DATE(util.Date_Paste(gapanInfoBean.getPERMIT_DATE()));
				
				request.setAttribute("GAPAN_NO", gapanno);
				request.setAttribute("GU_CODE", gu_code);
				
//				관리자 데이터를 가져온다.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
//				세션에서 시도 코드를 가져온다.
				String SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
// 점용지 주소를 가져온다.	
				System.out.println("######################");
				System.out.println("@@@"+commonCode.executeSearchBJDongCode(SIDO_CD, userBean.getSIGU_CD(), gapanInfoBean.getWITH_PNU().substring(5,10)));
				
				String addr = "";
				String seoulGU_CD = "";
				
				/* 2014.06.08 kny  */
				if(userBean.getSIGU_CD().equals("000")){
					seoulGU_CD = gapanInfoBean.getWITH_PNU().substring(2, 5);
					
					addr = commonCode.executeSiNm(SIDO_CD)+"시 "+commonCode.SearchGuName(SIDO_CD, seoulGU_CD)+" "
					+commonCode.executeSearchBJDongCode(SIDO_CD, seoulGU_CD, gapanInfoBean.getWITH_PNU().substring(5,10));
					
					if(gapanInfoBean.getHJ_CD() != null && gapanInfoBean.getHJ_CD().length() > 1 ){
						addr +=" (";
						addr +=commonCode.executeSearchHJDongCode(SIDO_CD, seoulGU_CD, gapanInfoBean.getHJ_CD());
						addr +=")";
					}
				}else{
					addr = commonCode.executeSiNm(SIDO_CD)+" "+userBean.getGU_NM()+" "
					+commonCode.executeSearchBJDongCode(SIDO_CD, userBean.getSIGU_CD(), gapanInfoBean.getWITH_PNU().substring(5,10));
					
					if(gapanInfoBean.getHJ_CD() != null && gapanInfoBean.getHJ_CD().length() > 1 ){
						addr +=" (";
						addr +=commonCode.executeSearchHJDongCode(SIDO_CD, userBean.getSIGU_CD(), gapanInfoBean.getHJ_CD());
						addr +=")";
					}
				}
				
				String BONBUN = Integer.toString(Integer.parseInt(gapanInfoBean.getWITH_PNU().substring(11,15)));
				String BUBUN = Integer.toString(Integer.parseInt(gapanInfoBean.getWITH_PNU().substring(15,19)));
				String SPC_CD = gapanInfoBean.getWITH_PNU().substring(10,11);
				
				if("2".equals(SPC_CD))
					addr=addr+" 산)";
				if(BONBUN!=null)
					addr=addr+" "+BONBUN;
				if(BUBUN!=null)
					addr=addr+"-"+BUBUN;
				
				request.setAttribute("ADDR", addr);
				
				// 파일관련
				String filePath = Globals.IMAGEFILEPATH;		
				request.setAttribute("filePath", filePath );
				
				request.setAttribute("X_COORD", gapanInfoBean.getX_COORD());
				request.setAttribute("Y_COORD", gapanInfoBean.getY_COORD() );
				
				//********** BEGIN_DORO_NM_20140424
				request.setAttribute("WITH_DORO_NM", gapanInfoBean.getWITH_DORO_NM());
				request.setAttribute("WITH_BD_BON", gapanInfoBean.getWITH_BD_BON());
				request.setAttribute("WITH_BD_BU", gapanInfoBean.getWITH_BD_BU());
				//request.setAttribute("WITH_DORO_NM", gapanInfoBean.getWITH_DORO_NM());
			}
		} catch(Exception e){
			e.printStackTrace();
		}
		
		return new ModelAndView("/gapan/jumyonginfo/tab/jumji_view", "board", gapanInfoBean);
	}
	
	//	점용지정보 수정
	public ModelAndView		Jumji_Modify(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
//		 삭제 세션
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		GapanInfoBean gapanInfoBean = null;

		try{
			if(userId != null)
			{
		
				String 		gapanno 	= ServletRequestUtils.getStringParameter(request, "GAPAN_NO", "");
				String 		gu_code 	= ServletRequestUtils.getStringParameter(request, "GU_CODE", "");
		
				//	세션에서 시도 코드를 가져온다.
				String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				
				//	관리자 데이터를 가져온다.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
				if(userBean	!= null)
				{
					request.setAttribute("MANAGER_MIN", userBean.getNAME());
					request.setAttribute("SIGUNGU", userBean.getGU_NM());
					request.setAttribute("SIGU_CD", userBean.getSIGU_CD());
					request.setAttribute("MANAGE_DEP_MIN", userBean.getDEPT_NM());
				}
				
				request.setAttribute("SIDO_NM", commonCode.executeSiNm(SIDO_CD));
				
				List		list 	= iJumyonginfoService.executeJumji_View(gapanno);
				gapanInfoBean = new GapanInfoBean();
				
				if(list.size()<=0)
					gapanInfoBean	= null;
				else
				{
					gapanInfoBean	= (GapanInfoBean)list.get(0);
				}
				//System.out.println("######################## gapanInfoBean.getOWNER_SET() ==> " + gapanInfoBean.getOWNER_SET());
				request.setAttribute("use_owner_Group", commonCode.executeCommonCode("use_ownerGroup", gapanInfoBean.getOWNER_SET(), "선택"));
				request.setAttribute("taxation_section", commonCode.executeCommonCode("taxation_section", gapanInfoBean.getTAX_SET(), "선택"));
				request.setAttribute("ar_sel", commonCode.executeGapanCode("AR_SEL", gapanInfoBean.getAR_SEL(), "선택"));
				request.setAttribute("uc_sel", commonCode.executeGapanCode("UC_SEL", gapanInfoBean.getUC_SEL(), "선택"));

				request.setAttribute("ft_typ", gapanInfoBean.getFT_TYP());
				request.setAttribute("ft_sel", gapanInfoBean.getFT_SEL());
				request.setAttribute("dp_sel", commonCode.executeGapanCode("DP_SEL", gapanInfoBean.getDP_SEL(), "선택"));
				request.setAttribute("mt_sel", commonCode.executeGapanCode("MT_SEL", gapanInfoBean.getMT_SEL(), "선택"));
				request.setAttribute("sg_typ", commonCode.executeGapanCode("SG_TYP", gapanInfoBean.getSG_TYP(), "선택"));
				request.setAttribute("sg_itm", commonCode.executeGapanCode("SG_ITM", gapanInfoBean.getSG_ITM(), "선택"));
				request.setAttribute("sg_sel", commonCode.executeGapanCode("SG_SEL", gapanInfoBean.getSG_SEL(), "선택"));
				request.setAttribute("un_typ", commonCode.executeGapanCode("UN_TYP", gapanInfoBean.getUN_TYP(), "선택"));
				
				request.setAttribute("X_COORD", gapanInfoBean.getX_COORD());
				request.setAttribute("Y_COORD", gapanInfoBean.getY_COORD());
				
				//********** BEGIN_DORO_NM_20140424
				request.setAttribute("WITH_DORO_NM", gapanInfoBean.getWITH_DORO_NM());
				request.setAttribute("WITH_BD_BON", gapanInfoBean.getWITH_BD_BON());
				request.setAttribute("WITH_BD_BU", gapanInfoBean.getWITH_BD_BU());
				//********** END_DORO_NM_20140424
				
				// with_pnu 값이 필수가 아니라 substring 수정함 - 나중에 지도서비스후 수정해야함
				if( gapanInfoBean.getWITH_PNU() != null && !"".equals(gapanInfoBean.getWITH_PNU()) ){
					
					/* 2014.06.08 kny  */
					if(userBean.getSIGU_CD().equals("000")){
						request.setAttribute("bjdong_code", commonCode.executeBJDongCode(SIDO_CD, gapanInfoBean.getWITH_PNU().substring(2, 5), gapanInfoBean.getWITH_PNU().substring(5,10)));	//gapanInfoBean.getWITH_PNU().substring(5,8)
						request.setAttribute("hjdong_code", commonCode.executeHJDongCode(SIDO_CD, gapanInfoBean.getWITH_PNU().substring(2, 5), gapanInfoBean.getHJ_CD()));
						
						request.setAttribute("SIGUNGU", commonCode.SearchGuName(SIDO_CD, gapanInfoBean.getWITH_PNU().substring(2, 5)));
					}else{
						request.setAttribute("bjdong_code", commonCode.executeBJDongCode(SIDO_CD, userBean.getSIGU_CD(), gapanInfoBean.getWITH_PNU().substring(5,10)));	//gapanInfoBean.getWITH_PNU().substring(5,8)
						request.setAttribute("hjdong_code", commonCode.executeHJDongCode(SIDO_CD, userBean.getSIGU_CD(), gapanInfoBean.getHJ_CD()));
					}
					request.setAttribute("mul_spc_cd", commonCode.executeSearchCommonCode("MUL_SPC_CD", gapanInfoBean.getWITH_PNU().substring(10,11)));
					request.setAttribute("BONBUN", gapanInfoBean.getWITH_PNU().substring(11,15));
					request.setAttribute("BUBUN", gapanInfoBean.getWITH_PNU().substring(15,19));
				}else{
					request.setAttribute("bjdong_code", commonCode.executeBJDongCode(SIDO_CD, userBean.getSIGU_CD(), null));
					request.setAttribute("hjdong_code", commonCode.executeHJDongCode(SIDO_CD, userBean.getSIGU_CD(), null));
					request.setAttribute("mul_spc_cd", "1");
					request.setAttribute("BONBUN", "");
					request.setAttribute("BUBUN", "");
				}
				
				request.setAttribute("SIDO", SIDO_CD);			
				
				
				gapanInfoBean.setMUL_FROMDATE(util.Date_Paste(gapanInfoBean.getMUL_FROMDATE()));
				gapanInfoBean.setMUL_TODATE(util.Date_Paste(gapanInfoBean.getMUL_TODATE()));		
				gapanInfoBean.setFOUND_DATE(util.Date_Paste(gapanInfoBean.getFOUND_DATE()));
				gapanInfoBean.setPERMIT_DATE(util.Date_Paste(gapanInfoBean.getPERMIT_DATE()));
				
				List open_time_list = util.SubString_String(gapanInfoBean.getOPEN_TIME(),2);
				if(open_time_list != null){
					if(open_time_list.get(0) != ""){
						gapanInfoBean.setOPEN_TIME1(open_time_list.get(0).toString());
						gapanInfoBean.setOPEN_TIME2(open_time_list.get(1).toString());
					}
				}
				
				List close_time_list = util.SubString_String(gapanInfoBean.getCLOSE_TIME(),2);
				if(close_time_list != null){
					if(close_time_list.get(0) != ""){
						gapanInfoBean.setCLOSE_TIME1(close_time_list.get(0).toString());
						gapanInfoBean.setCLOSE_TIME2(close_time_list.get(1).toString());
					}
				}
				
				String change_ym = gapanInfoBean.getCHANGE_YM();
				if(change_ym != null && change_ym.length() > 5){
					gapanInfoBean.setCHANGE_YM(change_ym.substring(0,4)+"년 "+change_ym.substring(4,6)+"월");
					request.setAttribute("CHANGE_Y", change_ym.substring(0,4));
					request.setAttribute("CHANGE_M", change_ym.substring(4,6));
				}
				
				
				request.setAttribute("GAPAN_NO", gapanno);
				request.setAttribute("GU_CODE", gu_code);
			}
		} catch(Exception e){
			System.out.println(e.toString());
		}
		
		
		return new ModelAndView("/gapan/jumyonginfo/tab/jumji_modify", "board", gapanInfoBean);
	}
	
	//	점용지 정보 수정 처리
	public ModelAndView		Jumji_Modify_Prc(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		
		String SHOP_IMG_NAME = ServletRequestUtils.getStringParameter(request, "SHOP_IMG_NAME", "");		
		
		// 파일업로드 관련
		MultipartHttpServletRequest mpRequest = (MultipartHttpServletRequest) request;
		MultipartFile SHOP_IMG = mpRequest.getFile("SHOP_IMG");
		
		if (SHOP_IMG.getSize() > 0) {
			
			// 기존파일 삭제 
			FileUtil.delete(Globals.IMAGEFILEUPLOADPATH_GAPAN+SHOP_IMG_NAME); 
			
			
			SHOP_IMG_NAME = FileUploadUtil2.uploadFormFile(SHOP_IMG,Globals.IMAGEFILEUPLOADPATH_GAPAN);			
			//System.out.println("수정후 ==> " + SHOP_IMG_NAME);
		}
		
		Jumji_Modify_Execute(request, response , SHOP_IMG_NAME);
		
		return Jumji_View(request,response);
	}

	//	점용지 정보 수정
	public void		Jumji_Modify_Execute(HttpServletRequest request,HttpServletResponse response, String SHOP_IMG_NAME) throws Exception 
	{
		
//		 삭제 세션
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");

		try{
			if(userId != null)
			{
				
				System.out.println("점용지 정보 수정 START!!!!!!!!!");
		
				String 		gapanno 	= ServletRequestUtils.getStringParameter(request, "GAPAN_NO", "");
				
				GapanInfoBean gapanInfoBean = new GapanInfoBean();
				
				bind(request, gapanInfoBean);
				
				// 개점 시간 OPEN_TIME1 + OPEN_TIME2
				String open_time	=	"";
				String open_time1	=	ServletRequestUtils.getStringParameter(request, "OPEN_TIME1", "");
				String open_time2	=	ServletRequestUtils.getStringParameter(request, "OPEN_TIME2", "");
				
				if(!open_time1.equals("") && !open_time2.equals(""))
				{
					open_time 	= open_time1 + open_time2;
				}
		
				//폐점 시간 CLOSE_TIME1 + CLOSE_TIME2
				String close_time	=	"";
				String close_time1	=	ServletRequestUtils.getStringParameter(request, "CLOSE_TIME1", "");
				String close_time2	=	ServletRequestUtils.getStringParameter(request, "CLOSE_TIME2", "");
				
				if(!close_time1.equals("") && !close_time2.equals(""))
				{
					close_time 	= close_time1 + close_time2;
				}
				
				String change_y = ServletRequestUtils.getStringParameter(request, "CHANGE_Y", "");
				String change_m = ServletRequestUtils.getStringParameter(request, "CHANGE_M", "");
				
				String  found_date = ServletRequestUtils.getStringParameter(request, "FOUND_DATE", "");
				String  permit_date = ServletRequestUtils.getStringParameter(request, "PERMIT_DATE", "");
				String  mul_fromdate = ServletRequestUtils.getStringParameter(request, "MUL_FROMDATE", "");
				String  mul_todate = ServletRequestUtils.getStringParameter(request, "MUL_TODATE", "");
				
				gapanInfoBean.setGAPAN_NO(gapanno);
				gapanInfoBean.setFOUND_DATE(util.Date_Cut(found_date));		//설치일자
				gapanInfoBean.setPERMIT_DATE(util.Date_Cut(permit_date));	//허가일자
				gapanInfoBean.setOPEN_TIME(open_time);						//개점시간
				gapanInfoBean.setCLOSE_TIME(close_time);					//폐점시간
				gapanInfoBean.setCHANGE_YM(change_y+change_m);
				
				
				gapanInfoBean.setX_COORD(ServletRequestUtils.getStringParameter(request, "X_COORD", ""));
				gapanInfoBean.setY_COORD(ServletRequestUtils.getStringParameter(request, "Y_COORD", ""));
				
				gapanInfoBean.setTYPE(ServletRequestUtils.getStringParameter(request, "TYPE", "1"));
				gapanInfoBean.setSECTION(ServletRequestUtils.getStringParameter(request, "SECTION", "1"));

				gapanInfoBean.setMUL_FROMDATE(util.Date_Cut(mul_fromdate));
				gapanInfoBean.setMUL_TODATE(util.Date_Cut(mul_todate));
				
				//begin******* WITH_DORO_NM_2014_04_27
				String WITH_DORO_NM = ServletRequestUtils.getStringParameter(request, "WITH_DORO_NM", "");
				gapanInfoBean.setWITH_DORO_NM(WITH_DORO_NM);
				String WITH_BD_BON = ServletRequestUtils.getStringParameter(request, "WITH_BD_BON", "");
				gapanInfoBean.setWITH_BD_BON(WITH_BD_BON);
				String WITH_BD_BU = ServletRequestUtils.getStringParameter(request, "WITH_BD_BU", "");
				gapanInfoBean.setWITH_BD_BU(WITH_BD_BU);
				//end*******
				
				//파일 실제 저장 , 저장된 실제파일 이름 가져오기 
				if( SHOP_IMG_NAME != null && !"".equals(SHOP_IMG_NAME) ){
					gapanInfoBean.setSHOP_IMG_NAME(SHOP_IMG_NAME);
				}else{
					gapanInfoBean.setSHOP_IMG_NAME(gapanInfoBean.getSHOP_IMG_NAME());
				}
				
				//	GAPAN_INFO  테이블에 업데이트 한다.
				iJumyonginfoService.executeJumji_Modify(gapanInfoBean);
			}
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	
//	시설물 규격 받아오기
	public ModelAndView		Get_FT_TYP(HttpServletRequest request,HttpServletResponse response, String SHOP_IMG_NAME) throws Exception 
	{
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		String 	GP_TYP 	= ServletRequestUtils.getStringParameter(request, "GP_TYP");
		
		List 		list		= null;
		
		System.out.println("Get GP_TYP : : : : : " + GP_TYP);
		System.out.println("Get userID : : : : : " + userId);
		
		if(userId != null)
		{
			
			//String	Xml	= "";
			
			
			String	Xml	= "<?xml version='1.0' encoding='utf-8'?>";
			Xml	+= "<ROOT>";
			
			if(GP_TYP == null || GP_TYP.equals("")){
				Xml	+= XmlNodeMake2("", "::선택::");
			}else{
				list = iJumyonginfoService.executeGetFtTyp(GP_TYP);
				
				GapanCodeBean Bean = new GapanCodeBean();
			
				for(int	i = 0	;	i < list.size()	;	i++)
				{
					Bean	= (GapanCodeBean)list.get(i);
					Xml	+= XmlNodeMake2(Bean.getNAME(), Bean.getCODE());
				}
			}
			Xml	+= "</ROOT>";

	        response.setContentType("text/html;charset=EUC-KR");
	        response.setHeader("Cache-Control", "no-cache");
	        response.getWriter().write(Xml);
	        
	        System.out.println("Get_FT_TYP :::::::::"+Xml);

		}
		return null;	
	}
	
	
	
	
	//	시설물 규격 받아오기
	public ModelAndView		Get_FT_SEL(HttpServletRequest request,HttpServletResponse response, String SHOP_IMG_NAME) throws Exception 
	{
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		String 	FT_TYP 	= ServletRequestUtils.getStringParameter(request, "FT_TYP");
		
		List 		list		= null;
		
		System.out.println("Get FT_TYP : : : : : " + FT_TYP);
		System.out.println("Get userID : : : : : " + userId);
		
		if(userId != null)
		{
			
			//String	Xml	= "";
			
			
			String	Xml	= "<?xml version='1.0' encoding='utf-8'?>";
			Xml	+= "<ROOT>";
			
			if(FT_TYP == null || FT_TYP.equals("")){
				Xml	+= XmlNodeMake2("", "::선택::");
			}else{
				list = iJumyonginfoService.executeGetFtSel(FT_TYP);
				GapanCodeBean Bean = new GapanCodeBean();
			
				for(int	i = 0	;	i < list.size()	;	i++)
				{
					Bean	= (GapanCodeBean)list.get(i);
					Xml	+= XmlNodeMake2(Bean.getNAME(), Bean.getCODE());
				}
			}
			Xml	+= "</ROOT>";

	        response.setContentType("text/html;charset=EUC-KR");
	        response.setHeader("Cache-Control", "no-cache");
	        response.getWriter().write(Xml);
	        
	        System.out.println("Get_FT_SEL :::::::::"+Xml);

		}
		return null;	
	}
	
//	XML 노드 생성
	public	String	XmlNodeMake2(String Label, String Value)
	{
		String	XML	= "";
		
		XML	= "<option label='" + Label + "'\t value='"+Value+"'/>\n";
		
		return	XML;
	}
	
	
	
}
