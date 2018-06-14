//	2009		Kim Yun Seo

package main.java.jumyong.oldminwon.web;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.admin.model.UserRegBean;
import main.java.common.commonCode.model.UserBean;
import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.purposeCode.model.PurposeCodeBean;
import main.java.common.util.catUtil.Pageing;
import main.java.common.util.catUtil.Util;
import main.java.jumyong.oldminwon.model.Apjy01mr1Bean;
import main.java.jumyong.oldminwon.model.Apjy20mr1Bean;
import main.java.jumyong.oldminwon.model.SangseMinwonBean;
import main.java.jumyong.oldminwon.model.SearchBean;
import main.java.jumyong.oldminwon.model.ZipBean;
import main.java.jumyong.oldminwon.service.IMinwonService;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;


public class MinwonControl	extends MultiActionController {

	private	IMinwonService		iMinwonService	= null;
	private	CommonCodeService	commonCode		= null;
	private	Util				util			= new Util();
	private	Pageing				pageing			= new Pageing();
	
	
	public void setOldminwonService(IMinwonService oldminwonService) 
	{
		this.iMinwonService = oldminwonService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode) 
	{
		this.commonCode 	= commonCode;
	}
	
	//	민원조회 검색 및 리스트(새올 데이터를 가져온다)
	public ModelAndView 	Search(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		HttpSession session 	= request.getSession();
		String 		userId		= (String)session.getAttribute("sessionUserId");
		List 		list		= null;
		int	rowCol = 0;
		int listCount = 0;
		
		try
		{
			if(userId != null)
			{
				//	세션에서 시도 코드를 가져온다.
				String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				
				//관리자 데이터를 가져온다.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
				String 	SERIAL_NBR	= ServletRequestUtils.getStringParameter(request, "SERIAL_NBR", "");
				String 	JUMNM 		= ServletRequestUtils.getStringParameter(request, "JUMNM", "");
				String 	HEOGA 		= ServletRequestUtils.getStringParameter(request, "HEOGA", "");
				String 	HJCD 		= ServletRequestUtils.getStringParameter(request, "HJCD", "");
				String 	BUN 		= ServletRequestUtils.getStringParameter(request, "BUN", "");
				String 	JI		 	= ServletRequestUtils.getStringParameter(request, "JI", "");
				String 	JIBUN		= ServletRequestUtils.getStringParameter(request, "JIBUN", "");
				String 	LISTVIEW	= ServletRequestUtils.getStringParameter(request, "LISTVIEW", "0");
				
				
				//점용목적
				String JIMOK = ServletRequestUtils.getStringParameter(request, "JIMOK", "");
				String JUMMOK = ServletRequestUtils.getStringParameter(request, "JUMMOK", "");
				
				request.setAttribute("SERIAL_NBR", SERIAL_NBR);
				request.setAttribute("JUMNM", JUMNM);
				request.setAttribute("HEOGA", HEOGA);
				request.setAttribute("HJCD", HJCD);
				request.setAttribute("BUN", BUN);
				request.setAttribute("JI", JI);
				request.setAttribute("JIBUN", JIBUN);
				request.setAttribute("hjdong_code", commonCode.CommonHJDongCodeSearch(SIDO_CD, userBean.getSIGU_CD(), HJCD));	//	행정동
				//점용목적
				request.setAttribute("JIMOK", JIMOK);
				request.setAttribute("JUMMOK", JUMMOK);
				
				if("0".equals(LISTVIEW)){
					request.setAttribute("listCount", new Integer(listCount));
					return new ModelAndView("/jumyong/oldminwon/search", "blist", list);
				}
				
				int	currentPage	= Integer.parseInt(ServletRequestUtils.getStringParameter(request, "currentPage", "1"));
				
				SearchBean searchBean = new SearchBean();
				bind(request, searchBean);

				searchBean.setORG_CD(userBean.getORG_CD());
				
				//일반 코드 끝
				listCount 	= iMinwonService.executeCount(searchBean);
				request.setAttribute("listCount", new Integer(listCount));
				
				// 페이징 처리
				rowCol		= pageing.execute(request, listCount, currentPage, 10);
				
				list = iMinwonService.executeSearch(searchBean, rowCol, rowCol+9);
			}
		}
		catch(Exception err)
		{
			System.out.println("error:"+err.toString());
		}
		
		return new ModelAndView("/jumyong/oldminwon/search", "blist", list);
	}

//	민원조회 검색 및 리스트(새올 데이터를 가져온다)
	public ModelAndView 	Excel_Search(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		HttpSession session 	= request.getSession();
		String 		userId		= (String)session.getAttribute("sessionUserId");
		List 		list		= null;
		int listCount = 0;
		
		try
		{
			if(userId != null)
			{
				//	세션에서 시도 코드를 가져온다.
				String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				
				//관리자 데이터를 가져온다.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
				String 	SERIAL_NBR	= ServletRequestUtils.getStringParameter(request, "SERIAL_NBR", "");
				String 	JUMNM 		= ServletRequestUtils.getStringParameter(request, "JUMNM", "");
				String 	HEOGA 		= ServletRequestUtils.getStringParameter(request, "HEOGA", "");
				String 	HJCD 		= ServletRequestUtils.getStringParameter(request, "HJCD", "");
				String 	BUN 		= ServletRequestUtils.getStringParameter(request, "BUN", "");
				String 	JI		 	= ServletRequestUtils.getStringParameter(request, "JI", "");
				String 	JIBUN		= ServletRequestUtils.getStringParameter(request, "JIBUN", "");
				String 	LISTVIEW	= ServletRequestUtils.getStringParameter(request, "LISTVIEW", "0");
				
				
				//점용목적
				String JIMOK = ServletRequestUtils.getStringParameter(request, "JIMOK", "");
				String JUMMOK = ServletRequestUtils.getStringParameter(request, "JUMMOK", "");
				
				request.setAttribute("SERIAL_NBR", SERIAL_NBR);
				request.setAttribute("JUMNM", JUMNM);
				request.setAttribute("HEOGA", HEOGA);
				request.setAttribute("HJCD", HJCD);
				request.setAttribute("BUN", BUN);
				request.setAttribute("JI", JI);
				request.setAttribute("JIBUN", JIBUN);
				request.setAttribute("hjdong_code", commonCode.CommonHJDongCodeSearch(SIDO_CD, userBean.getSIGU_CD(), HJCD));	//	행정동
				//점용목적
				request.setAttribute("JIMOK", JIMOK);
				request.setAttribute("JUMMOK", JUMMOK);
				
				int	currentPage	= Integer.parseInt(ServletRequestUtils.getStringParameter(request, "currentPage", "1"));
				
				SearchBean searchBean = new SearchBean();
				bind(request, searchBean);

				searchBean.setORG_CD(userBean.getORG_CD());
				
				
				//일반 코드 끝
				listCount 	= iMinwonService.executeCount(searchBean);
				request.setAttribute("listCount", new Integer(listCount));
				
				list = iMinwonService.executeSearch(searchBean, 0, listCount);
			}
		}
		catch(Exception err)
		{
			System.out.println("error:"+err.toString());
		}
		
		return new ModelAndView("/jumyong/oldminwon/excel_search", "blist", list);
	}
	
	//	상세보기
	public ModelAndView		View(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		List 		list		= null;
		int	rowCol = 0;
		int listCount = 0;
		
		try
		{
			if(userId != null)
			{
				String 	SERIAL_NBR	= ServletRequestUtils.getStringParameter(request, "SERIAL_NBR", "");
				String 	GU_CODE		= ServletRequestUtils.getStringParameter(request, "GU_CODE", "");
				
				System.out.println("SERIAL_NBR ==> " + SERIAL_NBR);
				System.out.println("GU_CODE ==> " + GU_CODE);
				
				Apjy20mr1Bean apjy20mr1Bean = iMinwonService.executeView(SERIAL_NBR, GU_CODE);
				
				request.setAttribute("bjdong_code", commonCode.executeSearchBJDongCode(apjy20mr1Bean.getBJDONG().substring(0, 2), apjy20mr1Bean.getBJDONG().substring(2,5), apjy20mr1Bean.getBJDONG().substring(5,apjy20mr1Bean.getBJDONG().length())));
				request.setAttribute("hjdong_code", commonCode.executeSearchHJDongCode(apjy20mr1Bean.getHJDONG().substring(0, 2), apjy20mr1Bean.getHJDONG().substring(2,5), apjy20mr1Bean.getHJDONG().substring(5,apjy20mr1Bean.getHJDONG().length())));
				
				ZipBean zipBean = iMinwonService.executeZip(apjy20mr1Bean.getPOST1(), apjy20mr1Bean.getPOST2());
				
				//일반 코드 끝
				listCount 	= iMinwonService.executeSangseCount(SERIAL_NBR, GU_CODE);
				request.setAttribute("listCount", new Integer(listCount));
				
				int	currentPage	= Integer.parseInt(ServletRequestUtils.getStringParameter(request, "currentPage", "1"));
				
				// 페이징 처리
				rowCol	= pageing.execute(request, listCount, currentPage, 10);
				list 	= iMinwonService.executeSangseSearch(SERIAL_NBR, GU_CODE, rowCol, rowCol+9);
				
				request.setAttribute("zipBean", zipBean);
				request.setAttribute("apjy20mr1Bean", apjy20mr1Bean);
				request.setAttribute("SERIAL_NBR", SERIAL_NBR);
				request.setAttribute("GU_CODE", GU_CODE);
			}
		}
		catch(Exception err)
		{
			System.out.println("error:"+err.toString());
		}
		
		return new ModelAndView("/jumyong/oldminwon/view","blist",list);
	}
	
	
	//	상세 보기
	public ModelAndView		Sangse_View(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		List 		list		= null;
		
		try
		{
			if(userId != null)
			{
				String 	SERIAL_NBR	= ServletRequestUtils.getStringParameter(request, "SERIAL_NBR", "");
				String 	GU_CODE		= ServletRequestUtils.getStringParameter(request, "GU_CODE", "");
				String 	ILKWAL_NBR		= ServletRequestUtils.getStringParameter(request, "ILKWAL_NBR", "");
				String 	YY		= ServletRequestUtils.getStringParameter(request, "YY", "");
				
				SangseMinwonBean sangseMinwonBean = iMinwonService.executeSangseMinwonBean(SERIAL_NBR, GU_CODE, ILKWAL_NBR, YY);
				
				String	Xml	= "<?xml version=\"1.0\" encoding=\"euc-kr\"?>";
				Xml	+= "<lists>";
				
				//	년도
				Xml	+= util.XmlNodeMake("YY", util.nullTo(sangseMinwonBean.getYY(), ""));
				
				//구분
				if("1".equals(sangseMinwonBean.getGUBUN()))
				{
					Xml	+= util.XmlNodeMake("GUBUN", "정기");
				}
				else if("2".equals(sangseMinwonBean.getGUBUN()))
				{
					Xml	+= util.XmlNodeMake("GUBUN", "수시");
				}
				else
				{
					Xml	+= util.XmlNodeMake("GUBUN", "");
				}
				
				//허가구분
				if("1".equals(sangseMinwonBean.getHEOGA()))
				{
					Xml	+= util.XmlNodeMake("HEOGA", "허가");
				}
				else if("2".equals(sangseMinwonBean.getHEOGA()))
				{
					Xml	+= util.XmlNodeMake("HEOGA", "직권");
				}
				else if("3".equals(sangseMinwonBean.getHEOGA()))
				{
					Xml	+= util.XmlNodeMake("HEOGA", "폐쇄");
				}
				else
				{
					Xml	+= util.XmlNodeMake("HEOGA", "");
				}
				
				//세입구분
				if("1".equals(sangseMinwonBean.getSEGUBUN()))
				{
					Xml	+= util.XmlNodeMake("SEGUBUN", "시세");
				}
				else if("2".equals(sangseMinwonBean.getSEGUBUN()))
				{
					Xml	+= util.XmlNodeMake("SEGUBUN", "구세");
				}
				else
				{
					Xml	+= util.XmlNodeMake("SEGUBUN", "");
				}
				
				Xml	+= util.XmlNodeMake("HF_DATE", util.Date_Paste(sangseMinwonBean.getHF_DATE()));				//부과점용시작일
				
				Xml	+= util.XmlNodeMake("HL_DATE", util.Date_Paste(sangseMinwonBean.getHL_DATE()));				//부과점용종료일
				Xml	+= util.XmlNodeMake("JUN_JUMACK", util.Comma_Paste(sangseMinwonBean.getJUN_JUMACK()));		//전년도 점용액
				Xml	+= util.XmlNodeMake("CUR_JUMACK", util.Comma_Paste(sangseMinwonBean.getCUR_JUMACK()));		//조정점용액
				Xml	+= util.XmlNodeMake("SANCHUL1", util.nullTo(sangseMinwonBean.getSANCHUL1(),""));							//현년도 점용산출식
				Xml	+= util.XmlNodeMake("SANCHUL2", util.nullTo(sangseMinwonBean.getSANCHUL2(),""));							//현년도 조정산출식
				
				Xml	+= util.XmlNodeMake("BUKWA_NBR", util.nullTo(sangseMinwonBean.getBUKWA_NBR(),""));							//부과번호
				Xml	+= util.XmlNodeMake("BUKWA_AMT", util.Comma_Paste(sangseMinwonBean.getBUKWA_AMT()));		//부과금액
				Xml	+= util.XmlNodeMake("BUKWA_DATE", util.Date_Paste(sangseMinwonBean.getBUKWA_DATE()));		//부과일
				Xml	+= util.XmlNodeMake("ACC", util.nullTo(sangseMinwonBean.getACC(),""));										//회계과목 ACC + MOK + SEMOK
				Xml	+= util.XmlNodeMake("MOK", util.nullTo(sangseMinwonBean.getMOK(),""));
				
				Xml	+= util.XmlNodeMake("SEMOK", util.nullTo(sangseMinwonBean.getSEMOK(),""));
				
				Xml	+= "</lists>";
				
		        response.setContentType("text/html;charset=utf-8");
		        response.setHeader("Cache-Control", "no-cache");
		        response.getWriter().write(Xml);
			}
		}
		catch(Exception err)
		{
			System.out.println("error:"+err.toString());
		}
		
		return null;
	}
	
	
	//	상세 보기
//	public ModelAndView		Sangse_View(HttpServletRequest request,HttpServletResponse response) throws Exception 
//	{
//		HttpSession session = request.getSession();
//		String 		userId	= (String)session.getAttribute("sessionUserId");
//		List 		list		= null;
//		
//		try
//		{
//			if(userId != null)
//			{
//				String 	SERIAL_NBR	= ServletRequestUtils.getStringParameter(request, "SERIAL_NBR", "");
//				String 	GU_CODE		= ServletRequestUtils.getStringParameter(request, "GU_CODE", "");
//				String 	ILKWAL_NBR		= ServletRequestUtils.getStringParameter(request, "ILKWAL_NBR", "");
//				String 	YY		= ServletRequestUtils.getStringParameter(request, "YY", "");
//				
//				System.out.println("SERIAL_NBR ==> " + SERIAL_NBR);
//				System.out.println("GU_CODE ==> " + GU_CODE);
//				System.out.println("ILKWAL_NBR ==> " + ILKWAL_NBR);
//				System.out.println("YY ==> " + YY);
//				
//				SangseMinwonBean sangseMinwonBean = iMinwonService.executeSangseMinwonBean(SERIAL_NBR, GU_CODE, ILKWAL_NBR, YY);
//				
//				request.setAttribute("sangseMinwonBean", sangseMinwonBean);
//				request.setAttribute("SERIAL_NBR", SERIAL_NBR);
//				request.setAttribute("GU_CODE", GU_CODE);
//				request.setAttribute("ILKWAL_NBR", ILKWAL_NBR);
//				request.setAttribute("YY", YY);
//				
//			}
//		}
//		catch(Exception err)
//		{
//			System.out.println("error:"+err.toString());
//		}
//		
//		return new ModelAndView("/jumyong/oldminwon/sangse_view");
//	}
	
	
	
	
	//	상세 보기
	public ModelAndView	Get_Jummok(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		String 	JIMOK 	= ServletRequestUtils.getStringParameter(request, "JIMOK");
		
		List 		list		= null;
		
		System.out.println("Get JIMOK : : : : : " + JIMOK);
		System.out.println("Get userID : : : : : " + userId);
		
		if(userId != null)
		{
			list = iMinwonService.executeGuMinwonSearch(userId,JIMOK);
			Apjy01mr1Bean Bean = new Apjy01mr1Bean();
			
			String	Xml	= "<?xml version='1.0' encoding='utf-8'?>";
			
			//String	Xml	= "";
			
			
			
			Xml	+= "<ROOT>";
			
			for(int	i = 0	;	i < list.size()	;	i++)
			{
				Bean	= (Apjy01mr1Bean)list.get(i);
				
				Xml	+= XmlNodeMake2(Bean.getNAME(), Bean.getNO());
			}
			
			Xml	+= "</ROOT>";

	        response.setContentType("text/html;charset=EUC-KR");
	        response.setHeader("Cache-Control", "no-cache");
	        response.getWriter().write(Xml);

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
	
	
//	민원조회 검색 및 리스트(새올 데이터를 가져온다)
	public ModelAndView 	Get_History(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		HttpSession session 	= request.getSession();
		String 		userId		= (String)session.getAttribute("sessionUserId");
		List 		list		= null;
		int listCount = 0;
		
		try
		{
			if(userId != null)
			{
				//	세션에서 시도 코드를 가져온다.
				String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				
				//관리자 데이터를 가져온다.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
				String 	SERIAL_NBR	= ServletRequestUtils.getStringParameter(request, "SERIAL_NBR", "");
				String 	GU_CODE 	= ServletRequestUtils.getStringParameter(request, "GU_CODE", "");
			
				request.setAttribute("SERIAL_NBR", SERIAL_NBR);
				request.setAttribute("GU_CODE", GU_CODE);
				
				list = iMinwonService.executeHistoryList(SERIAL_NBR,GU_CODE);
			}
		}
		catch(Exception err)
		{
			System.out.println("error:"+err.toString());
		}
		
		return new ModelAndView("/jumyong/oldminwon/history_list", "blist", list);
	}
	
}
