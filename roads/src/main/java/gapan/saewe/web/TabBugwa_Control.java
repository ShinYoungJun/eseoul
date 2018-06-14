
package main.java.gapan.saewe.web;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.common.util.catUtil.Pageing;
import main.java.common.util.catUtil.Util;
import main.java.common.commonCode.model.UserBean;
import main.java.common.commonCode.service.CommonCodeService;
import main.java.gapan.saewe.model.AppealBean;
import main.java.gapan.saewe.model.PlaceBean;
import main.java.gapan.saewe.model.CalculationBean;
import main.java.gapan.saewe.model.SaeweBean;
import main.java.gapan.saewe.model.TaxationBean;
import main.java.gapan.saewe.service.ISaeweService;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class TabBugwa_Control	extends MultiActionController{

	private	ISaeweService		iSaeweService	= null;
	private	CommonCodeService	commonCode		= null;
	private	Util				util			= new Util();
	private	Pageing				pageing			= new Pageing();
	

	public void setGapan_saeweService(ISaeweService gapan_saeweService) 
	{
		this.iSaeweService = gapan_saeweService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode)
	{
		this.commonCode 	= commonCode;
	}
	
	
	//	부과정보 상세 화면
	public ModelAndView 	Bugwa_View(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{	
		
		System.out.println("bugwa View");
//		 삭제 세션
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		TaxationBean	Bean	= null;

		try{
			if(userId != null)
			{
				String GAPAN_NO 	= ServletRequestUtils.getStringParameter(request, "GAPAN_NO", "");
				String SEQ 		= ServletRequestUtils.getStringParameter(request, "SEQ", "");
				String GP_TYP 		= "001";
				String user_id = util.getSessionID(request, "sessionUserId");
				
				
				System.out.println("bugwa View :: " + GAPAN_NO);
				System.out.println("bugwa View :: " + SEQ);
				System.out.println("bugwa View :: " + GP_TYP);
				
				List		list 	= iSaeweService.executeBugwa_View_GpTyp(GAPAN_NO, SEQ);
				String		bukwa_id	= iSaeweService.executeBugwa_Id(user_id);
				
				System.out.println("list SIZE : "+list.size());
				
				Bean	= new TaxationBean();
				
				if(SEQ == null	||	SEQ.trim().equals("")){	//	산출정보가 하나도 없을경우 빈화면 출력
					return new ModelAndView("/gapan/saewe/tab/bugwa_view_sample");
					
				}
				
				if(list.size()<=0){
					return	Bugwa_Register(request, response);//Bean	= null;
				}
				else
				{
					Bean	= (TaxationBean)list.get(0);
					
					//	부과정보에 필요한 점용인, 점용지 정보를 가져온다.
					List	data	= iSaeweService.executeBugwa_DataInfo_GpTyp(GAPAN_NO, SEQ);
					SaeweBean	saeweBean	= new SaeweBean();
					saeweBean	= (SaeweBean)data.get(0);
			
					request.setAttribute("TAX_GUBUN", commonCode.executeSearchCommonCode("taxation_part", Bean.getTAX_GUBUN()));
					request.setAttribute("TAX_CD", commonCode.executeSearchTaxCode(Bean.getTAX_CD().substring(0,2), Bean.getTAX_CD())); //	세목코드
					request.setAttribute("LIVE", commonCode.executeSearchCommonCode("taxpayer_residence", Bean.getLIVE()));
					request.setAttribute("OBJ_SET", commonCode.executeSearchCommonCode("object_type", Bean.getOBJ_SET()));
					request.setAttribute("TAXPAYER_SET", commonCode.executeSearchCommonCode("taxpayer_group", Bean.getTAXPAYER_SET()));
					request.setAttribute("TAX_YN", Bean.getTAX_YN());			//	부과여부
					request.setAttribute("ADD_SET_NM", commonCode.executeCommonCodeNm("addition_part", Bean.getADD_SET()));
					
					Bean.setBONSE(util.Comma_Paste(Bean.getBONSE()));			//	본세
					Bean.setVAT(util.Comma_Paste(Bean.getVAT()));				//	부가가치세
					Bean.setINTAX(util.Comma_Paste(Bean.getINTAX()));			//	납기내금액
					Bean.setOVERTAX(util.Comma_Paste(Bean.getOVERTAX()));		//	납기후금액
					Bean.setLIMIT_SUM(util.Comma_Paste(Bean.getLIMIT_SUM()));	//	적용 상한율
					Bean.setRATE(util.Comma_Paste(Bean.getRATE()));				//	특별이율			
					Bean.setSISE(util.Comma_Paste(Bean.getSISE()));				//	시세
					Bean.setGIGUM(util.Comma_Paste(Bean.getGIGUM()));			//	기금
					Bean.setGUKSE(util.Comma_Paste(Bean.getGUKSE()));			//	국세
					Bean.setGUSE(util.Comma_Paste(Bean.getGUSE()));				//	구세
					
					Bean.setTAX_DATE(util.Date_Paste(Bean.getTAX_DATE()));		//	과세일자
					Bean.setINDATE(util.Date_Paste(Bean.getINDATE()));			//	납기내일자
					Bean.setOVERDATE(util.Date_Paste(Bean.getOVERDATE()));		//	납기후일자
//					request.setAttribute("ADD_SET_NM", commonCode.executeCommonCodeNm("addition_part", Bean.getADD_SET()));
//					request.setAttribute("BONSE", saeweBean.getSUM_ADJUST());
					if(Bean.getADD_YN()	!=	null){		//	가산금면제여부
						if(Bean.getADD_YN().trim().equals("1"))
							Bean.setADD_YN("가산금 면제");
						else{
							Bean.setADD_YN("가산금 비면제");
						}
					}
					//	년, 월
					if(Bean.getTAX_YM()	!= null)
					{
						String	ym	= Bean.getTAX_YM();
						if(Bean.getTAX_YM().length() == 6)
						{
							request.setAttribute("tax_year", ym.substring(0, 4));
							
							int	month	= Integer.parseInt(ym.substring(4, 6));
							
							request.setAttribute("tax_month", String.valueOf(month));
						}
					}
				}
		
				request.setAttribute("GAPAN_NO", GAPAN_NO);
				request.setAttribute("SEQ", SEQ);
				
				request.setAttribute("semok_cd", Bean.getTAX_CD());
				request.setAttribute("tax_ym", Bean.getTAX_YM());
				request.setAttribute("tax_gubun", Bean.getTAX_SET());
				request.setAttribute("user_id", user_id);
				request.setAttribute("bukwa_id", bukwa_id);
					
			}
		} catch(Exception e){
			e.printStackTrace();
		}
		
		return new ModelAndView("/gapan/saewe/tab/bugwa_view", "board", Bean);
	}
	
	
	//	부과정보 수정 화면
	public ModelAndView 	Bugwa_Modify(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		HttpSession 	session =	request.getSession();
		String 			userId	=	(String)session.getAttribute("sessionUserId");
		TaxationBean	Bean 	=	new TaxationBean();

		try{
			if(userId != null)
			{
				String 	GAPAN_NO 	= ServletRequestUtils.getStringParameter(request, "GAPAN_NO", "");
				String 	SEQ		 	= ServletRequestUtils.getStringParameter(request, "SEQ", "");
				
				//	부과 정보 상세 데이터를 가져온다.
				//List		list 	= iSaeweService.executeBugwa_View(ADMIN_NO, SEQ);
				List		list 	= iSaeweService.executeBugwa_View_GpTyp(GAPAN_NO, SEQ);
				
				if(list.size()<=0)//	데이터가 없으면 새로 추가
					return	Bugwa_Register(request, response);//Bean	= null;
				else
				{
					Bean	= (TaxationBean)list.get(0);
					
					//	점용인, 점용지 정보를 가져온다.
					//List	data	= iSaeweService.executeBugwa_DataInfo(ADMIN_NO, SEQ);
					List	data	= iSaeweService.executeBugwa_DataInfo_GpTyp(GAPAN_NO, SEQ);
					SaeweBean	saeweBean	= new SaeweBean();
					saeweBean	= (SaeweBean)data.get(0);
					
					request.setAttribute("taxation_part", commonCode.executeCommonCode("taxation_part", Bean.getTAX_GUBUN(), null));
					request.setAttribute("taxcode", commonCode.executeTaxCode(saeweBean.getTAX_SET(), null, "선택"));
					request.setAttribute("taxpayer_residence", commonCode.executeCommonCode("taxpayer_residence", Bean.getLIVE(), null));
					request.setAttribute("object_type", commonCode.executeCommonCode("object_type", Bean.getOBJ_SET(), null));
					request.setAttribute("taxpayer_group", commonCode.executeCommonCode("taxpayer_group", Bean.getTAXPAYER_SET(), null));
					
					Bean.setBONSE(util.Comma_Paste(saeweBean.getSUM_ADJUST()));			//	본세
					Bean.setVAT(util.Comma_Paste(saeweBean.getVAT()));				//	부가가치세
					Bean.setINTAX(util.Comma_Paste(saeweBean.getSUM_ADJUST()));			//	납기내금액
					
					double overtax = Double.parseDouble(saeweBean.getSUM_ADJUST());
					overtax = overtax + (overtax*0.03);
					long val = (long)overtax/10*10;
					
					Bean.setOVERTAX(util.Comma_Paste(String.valueOf(val)));		//	납기후금액
					Bean.setLIMIT_SUM(util.Comma_Paste(Bean.getLIMIT_SUM()));	//	적용 상한율
					Bean.setRATE(util.Comma_Paste(Bean.getRATE()));				//	특별이율
					
					if(saeweBean.getTAX_SET() == "10"){
						Bean.setSISE(util.Comma_Paste(saeweBean.getSUM_ADJUST()));				//	시세
						Bean.setGUSE("0");				//	구세
						
					}else{
						Bean.setSISE("0");				//	시세
						Bean.setGUSE(util.Comma_Paste(saeweBean.getSUM_ADJUST()));				//	구세
						
					}

					Bean.setGIGUM(util.Comma_Paste(Bean.getGIGUM()));			//	기금
					Bean.setGUKSE(util.Comma_Paste(Bean.getGUKSE()));			//	국세
										
					Bean.setTAX_DATE(util.Date_Paste(Bean.getTAX_DATE()));		//	과세일자
					Bean.setINDATE(util.Date_Paste(Bean.getINDATE()));			//	납기내일자
					Bean.setOVERDATE(util.Date_Paste(Bean.getOVERDATE()));		//	납기후일자
					request.setAttribute("ADD_SET_NM", commonCode.executeCommonCodeNm("addition_part", Bean.getADD_SET()));
					request.setAttribute("BONSE", saeweBean.getSUM_ADJUST());
					
					//	하나로 묶어놓은 년,월을  따로 분리시킨다.
					if(Bean.getTAX_YM()	!= null)
					{
						String	ym	= Bean.getTAX_YM();
						if(Bean.getTAX_YM().length() == 6)
						{
							request.setAttribute("tax_year", ym.substring(0, 4));
							request.setAttribute("tax_month", ym.substring(4, 6));
						}
					}
				}
				
				request.setAttribute("GAPAN_NO", GAPAN_NO);
				request.setAttribute("SEQ", SEQ);
			}
		} catch(Exception e){
			System.out.println(e.toString());
		}

		return new ModelAndView("/gapan/saewe/tab/bugwa_modify", "board", Bean);
	}
	
	//	부과정보 수정
	public ModelAndView 	Bugwa_Modify_Prc(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		String 	GAPAN_NO	= ServletRequestUtils.getStringParameter(request, "GAPAN_NO", "");
		String 	SEQ	= ServletRequestUtils.getStringParameter(request, "SEQ", "");
		
		String 	tax_year	= ServletRequestUtils.getStringParameter(request, "tax_year", "");
		String 	tax_month	= ServletRequestUtils.getStringParameter(request, "tax_month", "");
		
		String 	ADD_YN	= ServletRequestUtils.getStringParameter(request, "ADD_YN", "0");
		
		TaxationBean	Bean	= new TaxationBean();
		
		bind(request, Bean);
		
		Bean.setBONSE(util.Comma_Cut(Bean.getBONSE()));			//	본세
		Bean.setVAT(util.Comma_Cut(Bean.getVAT()));				//	부가가치세
		Bean.setINTAX(util.Comma_Cut(Bean.getINTAX()));			//	납기내금액
		Bean.setOVERTAX(util.Comma_Cut(Bean.getOVERTAX()));		//	납기후금액
		Bean.setLIMIT_SUM(util.Comma_Cut(Bean.getLIMIT_SUM()));	//	적용 상한율
		Bean.setRATE(util.Comma_Cut(Bean.getRATE()));			//	특별이율
		Bean.setSISE(util.Comma_Cut(Bean.getSISE()));			//	시세
		Bean.setGIGUM(util.Comma_Cut(Bean.getGIGUM()));			//	기금
		Bean.setGUKSE(util.Comma_Cut(Bean.getGUKSE()));			//	국세
		Bean.setGUSE(util.Comma_Cut(Bean.getGUSE()));			//	구세
		
		Bean.setTAX_DATE(util.Date_Cut(Bean.getTAX_DATE()));		//	과세일자
		Bean.setINDATE(util.Date_Cut(Bean.getINDATE()));			//	납기내일자
		Bean.setOVERDATE(util.Date_Cut(Bean.getOVERDATE()));		//	납기후일자
		
		int	month	= Integer.parseInt(tax_month);
		if(month <= 9)	//	0~9를 01~09 로 만든다. 
			tax_month	= "0" + tax_month;
		
	//	System.out.println(tax_year + tax_month);
		
		Bean.setTAX_YM(tax_year + tax_month);
		Bean.setGAPAN_NO(GAPAN_NO);
		Bean.setSEQ(SEQ);
		Bean.setADD_YN(ADD_YN);
		
		//	부과 정보 저장
		iSaeweService.executeBugwa_Modify(Bean);
		
		return Bugwa_View(request, response);
	}
	
	//	부과정보 입력 화면
	public ModelAndView 	Bugwa_Register(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
//		 삭제 세션
		System.out.println("Bugwa_Register ::");
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");

		try{
			if(userId != null)
			{
		
				String 	ADMIN_NO	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
				String 	SEQ 		= ServletRequestUtils.getStringParameter(request, "SEQ", "");
				String  GP_TYP 		= ServletRequestUtils.getStringParameter(request, "GP_TYP", "");
				
				//	데이터가 없으면 저장화면으로 이동
				if(SEQ == null	||	"".equals(SEQ))	//	ERROR
				{
					return new ModelAndView("/gapan/saewe/tab/bugwa_register");
				}
				
				//	부과정보에 필요한 점용인, 점용지 정보를 가져온다.
				List	list	= iSaeweService.executeBugwa_DataInfo(ADMIN_NO, SEQ);
				
				SaeweBean	Bean	= new SaeweBean();
		
				if(list.size()<=0)
					Bean	= null;
				else
				{
					Bean	= (SaeweBean)list.get(0);
				
					request.setAttribute("taxation_part", commonCode.executeCommonCode("taxation_part", null, "선택"));				//	과세구분
					request.setAttribute("taxcode", commonCode.executeTaxCode(Bean.getTAX_SET(), null, "선택"));						//	세목코드
					request.setAttribute("taxpayer_residence", commonCode.executeCommonCode("taxpayer_residence", null, "선택"));	//	거주상태
					request.setAttribute("object_type", commonCode.executeCommonCode("object_type", null, "선택"));					//	물건구분
					request.setAttribute("taxpayer_group", commonCode.executeCommonCode("taxpayer_group", null, "선택"));			//	납세자 구분	
					request.setAttribute("SUM_ADJUST", util.Comma_Paste(Bean.getSUM_ADJUST()));
					request.setAttribute("BONSE", Bean.getSUM_ADJUST());
					request.setAttribute("VAT", util.Comma_Paste(Bean.getVAT()));	
				}
				request.setAttribute("GP_TYP", GP_TYP);
				request.setAttribute("ADMIN_NO", ADMIN_NO);
				request.setAttribute("SEQ", SEQ);
				request.setAttribute("YEAR", Bean.getYEAR());
				request.setAttribute("TAX_SET", Bean.getTAX_SET());	//세입구분
				
				//	관리자 데이터를 가져온다.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
				//현재 년도
				SimpleDateFormat	formatter 	= new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA );
				Calendar 			cal 		= Calendar.getInstance();
				String	today		= formatter.format(cal.getTime());
				
				if(userBean	!= null)
				{
					request.setAttribute("ORG_CD", userBean.getORG_CD());
					request.setAttribute("GU_NM", userBean.getGU_NM());
					request.setAttribute("DEPT_CD", userBean.getDEPT_CD());
					request.setAttribute("DEPT_NM", userBean.getDEPT_NM());
					request.setAttribute("TAX_DATE", today);
				}
			}
		} catch(Exception e){
			System.out.println(e.toString());
		}
				
		return new ModelAndView("/gapan/saewe/tab/bugwa_register");
	}
	
	
	//	부과정보 입력하기
	public ModelAndView 	Bugwa_Register_Prc(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		BugaWebControl	bugaWebControl	= new BugaWebControl();
		
		String 	ADMIN_NO	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
		String 	SEQ			= ServletRequestUtils.getStringParameter(request, "SEQ", "");
		String 	tax_year	= ServletRequestUtils.getStringParameter(request, "tax_year", "");
		String 	tax_month	= ServletRequestUtils.getStringParameter(request, "tax_month", "");
		String 	ADD_YN	= ServletRequestUtils.getStringParameter(request, "ADD_YN", "0");
		
		
		String 	GP_TYP	= ServletRequestUtils.getStringParameter(request, "GP_TYP", "0");
		System.out.println("bugwa_register_prc :: "+GP_TYP);
		request.setAttribute("GP_TYP", GP_TYP);
		
		TaxationBean	Bean	= new TaxationBean();
		
		bind(request, Bean);
		
		Bean.setBONSE(util.Comma_Cut(Bean.getBONSE()));			//	본세
		Bean.setVAT(util.Comma_Cut(Bean.getVAT()));				//	부가가치세
		Bean.setINTAX(util.Comma_Cut(Bean.getINTAX()));			//	납기내금액
		Bean.setOVERTAX(util.Comma_Cut(Bean.getOVERTAX()));		//	납기후금액
		Bean.setLIMIT_SUM(util.Comma_Cut(Bean.getLIMIT_SUM()));	//	적용 상한율
		Bean.setRATE(util.Comma_Cut(Bean.getRATE()));			//	특별이율
		Bean.setSISE(util.Comma_Cut(Bean.getSISE()));			//	시세
		Bean.setGIGUM(util.Comma_Cut(Bean.getGIGUM()));			//	기금
		Bean.setGUKSE(util.Comma_Cut(Bean.getGUKSE()));			//	국세
		Bean.setGUSE(util.Comma_Cut(Bean.getGUSE()));			//	구세
		
		Bean.setTAX_DATE(util.Date_Cut(Bean.getTAX_DATE()));		//	과세일자
		Bean.setINDATE(util.Date_Cut(Bean.getINDATE()));			//	납기내일자
		Bean.setOVERDATE(util.Date_Cut(Bean.getOVERDATE()));		//	납기후일자
		
		int	month	= Integer.parseInt(tax_month);
		if(month <= 9)
			tax_month	= "0" + tax_month;
		
		Bean.setTAX_YM(tax_year + tax_month);
		Bean.setADMIN_NO(ADMIN_NO);
		Bean.setSEQ(SEQ);
		Bean.setADD_YN(ADD_YN);
		
		//	과세번호 생성
//		String	TAX_NO	= bugaWebControl.getNewTaxNo(Bean.getSIGU_CD(), Bean.getTAX_CD(), Bean.getTAX_YM(), Bean.getTAX_SET());
//		Bean.setTAX_NO(TAX_NO);
		
		//	데이터를 저장한다.
		
		iSaeweService.executeBugwa_Register(Bean);
		iSaeweService.SetCal_Sum_Info_taxseq(Bean.getSEQ());	//산출합계정보테이블에 부과등록여부 'TAX_SEQ'세팅
		
		//	뷰화면으로 이동
		return Bugwa_View(request, response);
	}
	
	
	//	세목코드
	public ModelAndView 	SemokInfo(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		try{
			BugaWebControl	bugaWebControl	= new BugaWebControl();
			
			String 	TAX_CD	= ServletRequestUtils.getStringParameter(request, "TAX_CD", "");
			String 	SIGU_CD	= ServletRequestUtils.getStringParameter(request, "SIGU_CD", "");
			String 	DEPT_CD	= ServletRequestUtils.getStringParameter(request, "DEPT_CD", "");
			
			String	Xml		= bugaWebControl.getSemokInfo(TAX_CD, SIGU_CD, DEPT_CD, commonCode);
			
	        response.setContentType("text/html;charset=utf-8");
	        response.setHeader("Cache-Control", "no-cache");
	        response.getWriter().write(Xml);
			
		}catch(Exception e){
			System.out.println("error:"+e.toString());
		}	
		return	null;
	}
}
