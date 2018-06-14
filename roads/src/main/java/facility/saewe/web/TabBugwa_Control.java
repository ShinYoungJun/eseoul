
package main.java.facility.saewe.web;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.common.commonCode.model.UserBean;
import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.util.catUtil.Pageing;
import main.java.common.util.catUtil.Util;
import main.java.facility.saewe.model.SaeweBean;
import main.java.facility.saewe.model.TaxationBean;
import main.java.facility.saewe.service.ISaeweService;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class TabBugwa_Control	extends MultiActionController{

	private	ISaeweService		iSaeweService	= null;
	private	CommonCodeService	commonCode		= null;
	private	Util				util			= new Util();
	private	Pageing				pageing			= new Pageing();
	

	public void setFacility_saeweService(ISaeweService facility_saeweService) 
	{
		this.iSaeweService = facility_saeweService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode)
	{
		this.commonCode 	= commonCode;
	}
	
	
	//	부과정보 상세 화면
	public ModelAndView 	Bugwa_View(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{	
		HttpSession session 	= request.getSession();
		String 	userId	= (String)session.getAttribute("sessionUserId");		
		List		list		= null;
		TaxationBean	Bean	= new TaxationBean();
		
		
		try{
			if(userId != null){
				String 	guCode 	= ServletRequestUtils.getStringParameter(request, "GU_CODE", "");
				String 	corpCd 	= ServletRequestUtils.getStringParameter(request, "CORP_CD", "");				
				String 	seq 	= ServletRequestUtils.getStringParameter(request, "SEQ", "");
				String use_section = ServletRequestUtils.getStringParameter(request, "USE_SECTION", "");
				String admin_no = ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
				//String  user_id = util.getSessionID(request, "sessionUserId");
				String		bukwa_id	= iSaeweService.executeBugwa_Id(userId);			
			
				
				System.out.println("------------------");
				System.out.println(guCode);
				System.out.println(corpCd);
				System.out.println(admin_no);
				System.out.println(seq);
				System.out.println("------------------");
				
				
				list 	= iSaeweService.executeBugwa_View(guCode, corpCd, admin_no, seq);
				
				if(guCode == null	||	guCode.trim().equals("")){	//	산출정보가 하나도 없을경우 빈화면 출력
					
					System.out.println("정기분일때 여기가 출력되나?");
					return new ModelAndView("/facility/saewe/tab/bugwa_view_sample");
					
				}
				System.out.println("---------------------------");
				System.out.println("list.size() : "+list.size());
				System.out.println("use_section : "+use_section);
				System.out.println("---------------------------");
				
				if(list.size() <= 0){
					
					System.out.println("여기 안 들어오냐!!@@@@");
					return	Bugwa_Register(request, response);//Bean	= null;
				}	
					else
				{
					Bean	= (TaxationBean)list.get(0);
					
					request.setAttribute("TAX_SET", commonCode.executeSearchCommonCode("taxation_part", Bean.getTAX_GUBUN().trim()));	//과세구분
					request.setAttribute("TAX_CD", commonCode.executeSearchTaxCode(Bean.getTAX_SET().trim(), Bean.getTAX_CD())); 		//세목코드 (TAX_SET:시세/구세)
					request.setAttribute("LIVE", commonCode.executeSearchCommonCode("taxpayer_residence", Bean.getLIVE()));
					System.out.println("object_type"+ Bean.getOBJ_SET());
					
					request.setAttribute("OBJ_SET", commonCode.executeSearchCommonCode("object_type", Bean.getOBJ_SET()));
					request.setAttribute("TAXPAYER_SET", commonCode.executeSearchCommonCode("taxpayer_group", Bean.getTAXPAYER_SET()));
					if(Bean.getTAX_YN() != null)  request.setAttribute("TAX_YN", Bean.getTAX_YN().trim());			//	부과여부
					else request.setAttribute("TAX_YN", Bean.getTAX_YN());			//	부과여부
					request.setAttribute("ADD_SET_NM", commonCode.executeCommonCodeNm("addition_part", Bean.getADD_SET()));
					
					Bean.setBONSE(util.Comma_Paste(Bean.getBONSE().trim()));			//	본세
					Bean.setVAT(util.Comma_Paste(Bean.getVAT().trim()));				//	부가가치세
					Bean.setINTAX(util.Comma_Paste(Bean.getINTAX().trim()));			//	납기내금액
					Bean.setOVERTAX(util.Comma_Paste(Bean.getOVERTAX().trim()));		//	납기후금액
					Bean.setLIMIT_SUM(util.Comma_Paste(Bean.getLIMIT_SUM()));	//	적용 상한율
					Bean.setRATE(util.Comma_Paste(Bean.getRATE()));				//	특별이율
					Bean.setSISE(util.Comma_Paste(Bean.getSISE().trim()));				//	시세
					Bean.setGIGUM(util.Comma_Paste(Bean.getGIGUM()));			//	기금
					Bean.setGUKSE(util.Comma_Paste(Bean.getGUKSE()));			//	국세
					Bean.setGUSE(util.Comma_Paste(Bean.getGUSE().trim()));				//	구세
					
					Bean.setTAX_DATE(util.Date_Paste(Bean.getTAX_DATE()));		//	과세일자
					Bean.setINDATE(util.Date_Paste(Bean.getINDATE()));			//	납기내일자
					Bean.setOVERDATE(util.Date_Paste(Bean.getOVERDATE()));		//	납기후일자
				System.out.println("################## ADD_YN 1 ==> " + Bean.getADD_YN());
				System.out.println("BONSE : "+Bean.getBONSE());
					if(Bean.getADD_YN()	!=	null){		//	가산금면제여부
						if(Bean.getADD_YN().trim().equals("1"))
							Bean.setADD_YN("가산금 면제");
						else{
							Bean.setADD_YN("가산금 비면제");
						}
					}
				System.out.println("################## ADD_YN 2 ==> " + Bean.getADD_YN());
					//	년, 월
					if(Bean.getTAX_YM()	!= null)
					{
						System.out.println("이곳이 실행될때는 뷰이때일거야");
						String	ym	= Bean.getTAX_YM();
						if(Bean.getTAX_YM().length() == 6)
						{
							request.setAttribute("tax_year", ym.substring(0, 4));
							
							int	month	= Integer.parseInt(ym.substring(4, 6));
							
							request.setAttribute("tax_month", String.valueOf(month));
						}
					}
				}
			
				
				request.setAttribute("GU_CODE", guCode);
				request.setAttribute("CORP_CD", corpCd);
				request.setAttribute("ADMIN_NO", admin_no);
				request.setAttribute("SEQ", seq);
				
				request.setAttribute("semok_cd", Bean.getTAX_CD());
				request.setAttribute("tax_ym", Bean.getTAX_YM());
				request.setAttribute("tax_gubun", Bean.getTAX_SET().trim());
				request.setAttribute("user_id", userId);
				request.setAttribute("bukwa_id", bukwa_id);
			}
		}catch(Exception e){
			System.out.println(e.toString());
		}	
				
		return new ModelAndView("/facility/saewe/tab/bugwa_view", "board", Bean);
	}
	
	
	//	부과정보 수정 화면
	public ModelAndView 	Bugwa_Modify(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		HttpSession session 	= request.getSession();
		String 	userId	= (String)session.getAttribute("sessionUserId");		
		List		list		= null;
		TaxationBean	Bean	= new TaxationBean();
		
		try{
			if(userId != null){
				String 	guCode 	= ServletRequestUtils.getStringParameter(request, "GU_CODE", "");
				String 	corpCd 	= ServletRequestUtils.getStringParameter(request, "CORP_CD", "");
				String 	adminNo 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
				String 	seq 	= ServletRequestUtils.getStringParameter(request, "SEQ", "");
				
				//	부과 정보 상세 데이터를 가져온다.
				list 	= iSaeweService.executeBugwa_View(guCode, corpCd, adminNo, seq);
		
				if(list.size()<=0)//	데이터가 없으면 새로 추가
					return	Bugwa_Register(request, response);//Bean	= null;
				else
				{
					Bean	= (TaxationBean)list.get(0);
					
					//	부과정보에 필요한 점용인, 점용지 정보를 가져온다.
					List	data	= iSaeweService.executeBugwa_DataInfo(guCode, corpCd, adminNo, seq);
					SaeweBean	saeweBean	= new SaeweBean();
					saeweBean	= (SaeweBean)data.get(0);
					
					System.out.println("taxcd = "+Bean.getTAX_CD());
					System.out.println(commonCode.executeTaxCode(Bean.getTAX_SET().trim(), Bean.getTAX_CD().trim(), null));
					
					request.setAttribute("taxation_part", commonCode.executeCommonCode("taxation_part", Bean.getTAX_GUBUN(), null));
					request.setAttribute("taxcode", commonCode.executeTaxCode(Bean.getTAX_SET().trim(), Bean.getTAX_CD().trim(), null));
					request.setAttribute("taxpayer_residence", commonCode.executeCommonCode("taxpayer_residence", Bean.getLIVE(), null));
					request.setAttribute("object_type", commonCode.executeCommonCode("object_type", Bean.getOBJ_SET(), null));
					request.setAttribute("taxpayer_group", commonCode.executeCommonCode("taxpayer_group", Bean.getTAXPAYER_SET().trim(), null));
					
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
				
				request.setAttribute("GU_CODE", guCode);
				request.setAttribute("CORP_CD", corpCd);
				request.setAttribute("ADMIN_NO", adminNo);
				request.setAttribute("SEQ", seq);
			}
		}catch(Exception e){
			System.out.println(e.toString());
		}

		return new ModelAndView("/facility/saewe/tab/bugwa_modify", "board", Bean);
	}
	
	//	부과정보 수정
	public ModelAndView 	Bugwa_Modify_Prc(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		String 	guCode 	= ServletRequestUtils.getStringParameter(request, "GU_CODE", "");
		String 	corpCd 	= ServletRequestUtils.getStringParameter(request, "CORP_CD", "");
		String 	adminNo 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
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
		Bean.setGU_CODE(guCode);
		Bean.setCORP_CD(corpCd);
		Bean.setADMIN_NO(adminNo);
		Bean.setADD_YN(ADD_YN);
		
		System.out.println("=-=-=-==-=-modify-=-=-=-==-=-=");
		System.out.println(Bean.getSEQ());
		System.out.println(Bean.getADD_SET());
		
		if(Bean.getADD_SET() != null && !Bean.getADD_SET().equals("") ) Bean.setADD_SET(Bean.getADD_SET().trim());
		
//		System.out.println(" guCode : "  + guCode+ " corpCd : "  + corpCd+ " requestNo : "  + requestNo);

		
		//	부과 정보 저장
		iSaeweService.executeBugwa_Modify(Bean);
		
		return Bugwa_View(request, response);
	}
	
	
	
	//	부과정보 입력 화면
	public ModelAndView 	Bugwa_Register(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		String 	guCode 	= ServletRequestUtils.getStringParameter(request, "GU_CODE", "");
		String 	corpCd 	= ServletRequestUtils.getStringParameter(request, "CORP_CD", "");
		String 	adminNo 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
		String 	seq 	= ServletRequestUtils.getStringParameter(request, "SEQ", "");
		
		System.out.println("seq="+seq);
		//	데이터가 없으면 저장화면으로 이동
		if(guCode == null	||	guCode.trim().equals(""))	//	ERROR
		{	
			return new ModelAndView("/facility/saewe/tab/bugwa_register");
		}
		
		//	부과정보에 필요한 점용인, 점용지 정보를 가져온다.
		List	list	= iSaeweService.executeBugwa_DataInfo(guCode, corpCd, adminNo, seq);
	
		SaeweBean	Bean	= new SaeweBean();

		if(list.size()<=0)
			Bean	= null;
		else
		{
			Bean	= (SaeweBean)list.get(0);
			request.setAttribute("taxation_part", commonCode.executeCommonCode("taxation_part", null, "선택"));				//	과세구분
			request.setAttribute("taxcode", commonCode.executeTaxCode(Bean.getTAX_SET().trim(), null, "선택"));						//	세목코드
			request.setAttribute("taxpayer_residence", commonCode.executeCommonCode("taxpayer_residence", null, "선택"));	//	거주상태
			request.setAttribute("object_type", commonCode.executeCommonCode("object_type", null, "선택"));					//	물건구분
			request.setAttribute("taxpayer_group", commonCode.executeCommonCode("taxpayer_group", null, "선택"));			//	납세자 구분
			request.setAttribute("SUM", util.Comma_Paste(Bean.getSUM_ADJUST()));
			request.setAttribute("VAT", util.Comma_Paste(Bean.getVAT()));
			request.setAttribute("BONSE", Bean.getSUM_ADJUST());
			
			System.out.println("--------tabBugwa_Control(2010.2.1)--------");
			System.out.println("vat : "+ Bean.getVAT());
			System.out.println("sum : "+ Bean.getSUM_ADJUST());
			System.out.println("---------------------han");
			System.out.println("yn : "+Bean.getTAX_YN());
			System.out.println("---------------------han");
		}
		
		
	
		
		request.setAttribute("GU_CODE", guCode);
		request.setAttribute("CORP_CD", corpCd);
		request.setAttribute("ADMIN_NO", adminNo);
		request.setAttribute("SEQ", seq);
		request.setAttribute("TAX_SET", Bean.getTAX_SET().trim());	//세입구분
			
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
			request.setAttribute("tax_year1", today.substring(0,4));
			if(today.substring(5,6).equals("0")) request.setAttribute("tax_month1", today.substring(6,7));
			else request.setAttribute("tax_month1", today.substring(0,4));
			
			System.out.println("tax_year : "+today.substring(0,4));
			if(today.substring(5,6).equals("0")) System.out.println("tax_month"+today.substring(6,7));
			else System.out.println("tax_month : "+ today.substring(5,7));
			
		}
		
		return new ModelAndView("/facility/saewe/tab/bugwa_register");
	}
	
	
	//	부과정보 입력하기
	public ModelAndView 	Bugwa_Register_Prc(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		BugaWebControl	bugaWebControl	= new BugaWebControl();
		
		String 	guCode 	= ServletRequestUtils.getStringParameter(request, "GU_CODE", "");
		String 	corpCd 	= ServletRequestUtils.getStringParameter(request, "CORP_CD", "");
		String 	adminNo = ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");		
		String 	seq 	= ServletRequestUtils.getStringParameter(request, "SEQ", "");
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
		if(month <= 9)
			tax_month	= "0" + tax_month;
		
		Bean.setTAX_YM(tax_year + tax_month);
		Bean.setGU_CODE(guCode);
		Bean.setCORP_CD(corpCd);
		
		Bean.setSEQ(seq);
		Bean.setADD_YN(ADD_YN);
		
		//	과세번호 생성
	//	String	TAX_NO	= bugaWebControl.getNewTaxNo(Bean.getSIGU_CD(), Bean.getTAX_CD(), Bean.getTAX_YM(), Bean.getTAX_SET());
	//	Bean.setTAX_NO(TAX_NO);
		
		//	데이터를 저장한다.
		
		iSaeweService.executeBugwa_Register(Bean);
		iSaeweService.SetCal_Sum_Info_taxseq(guCode,corpCd,adminNo);	//산출합계정보테이블에 부과등록여부 '1'세팅
		
		//	뷰화면으로 이동
		return Bugwa_View(request, response);
	}
	
	
	//	세목코드
	public ModelAndView 	SemokInfo(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		BugaWebControl	bugaWebControl	= new BugaWebControl();
		
		String 	TAX_CD	= ServletRequestUtils.getStringParameter(request, "TAX_CD", "");
		String 	SIGU_CD	= ServletRequestUtils.getStringParameter(request, "SIGU_CD", "");
		String 	DEPT_CD	= ServletRequestUtils.getStringParameter(request, "DEPT_CD", "");
		
		String	Xml		= bugaWebControl.getSemokInfo(TAX_CD, SIGU_CD, DEPT_CD, commonCode);
		
        response.setContentType("text/html;charset=utf-8");
        response.setHeader("Cache-Control", "no-cache");
        response.getWriter().write(Xml);
		
        System.out.println("han---------------------");
        System.out.println(Xml);
        System.out.println("han---------------------");
        
		return	null;
	}
}
