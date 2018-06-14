
package main.java.gapan.sugeo.web;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.common.commonCode.model.UserBean;
import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.util.BoardUtil;
import main.java.common.util.Globals;
import main.java.common.util.catUtil.Pageing;
import main.java.common.util.catUtil.Util;
import main.java.gapan.sugeo.model.SugeoBean;
import main.java.gapan.sugeo.service.ISugeoService;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class TabSugeo_Control	extends MultiActionController {

	private	ISugeoService		iSugeoService	= null;
	private	CommonCodeService	commonCode		= null;
	private	Util				util			= new Util();
	private	Pageing				pageing			= new Pageing();
	
	
	public void setSugeoService(ISugeoService sugeoService) 
	{
		this.iSugeoService = sugeoService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode)
	{
		this.commonCode 	= commonCode;
	}
	
	// 등록화면
	public	ModelAndView Register(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		
		//		 삭제 세션
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");

		try{
			if(userId != null)
			{
		
				// 세션
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
				// 시도코드
				String SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				// 시구코드
				String SIGU_CD = userBean.getSIGU_CD();
				
				
				
				if(userBean	!= null)
				{
					request.setAttribute("gu_nm", commonCode.SearchGuName(SIDO_CD, SIGU_CD));
					request.setAttribute("org_cd", userBean.getORG_CD());
					request.setAttribute("dept_cd", userBean.getDEPT_CD());
					request.setAttribute("dept_nm", userBean.getDEPT_NM());
					request.setAttribute("chg_org", userBean.getORG_CD());
					request.setAttribute("chg_nm", userBean.getNAME());
					
					request.setAttribute("bjdong_code", commonCode.executeBJDongCode(SIDO_CD, SIGU_CD, null));
					request.setAttribute("hjdong_code", commonCode.executeHJDongCode(SIDO_CD, SIGU_CD, null));
					
				}
				
				request.setAttribute("re_typ", commonCode.executeGapanCode("RE_TYP", null, "전체"));
				request.setAttribute("gd_sta", commonCode.executeGapanCode("GD_STA", null, "전체"));	// 진행상황
				
				
				// 현재날짜
				SimpleDateFormat	formatter 	= new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA);
				Calendar 			cal 		= Calendar.getInstance();
				String	today		= formatter.format(cal.getTime());
				request.setAttribute("today", today);
				
				// 수거물관리번호
				request.setAttribute("mul_no", "");
			}
		} catch(Exception e){
			System.out.println(e.toString());
		}
		
		return new ModelAndView("/gapan/sugeo/tab/sugeo_register");
	}
	
	// 수거 등록
	public ModelAndView	RegisterPrc(HttpServletRequest request,HttpServletResponse response) throws Exception
	{
		
		SugeoBean bean = new SugeoBean();
		bind(request, bean);

		// 수거물 관리번호 생성
		String mul_no	= Gapan_MulNo_Execute(request, response, bean.getRem_bjcd());
		
		if(mul_no != null)
		{
			//************** 수거정보 등록 *************/
			RemInfo_Execute(request, response, mul_no);			
			
			
			//*************** 수거물품 등록 *****************/
			Goods_Register_Execute(request, response, mul_no);			
			
		}
		
		
		// 수거물관리번호
		request.setAttribute("message","저장되었습니다.");
		request.setAttribute("mul_no", mul_no);
		//System.out.println("mul_no===================" + mul_no);
		
		return new ModelAndView("redirect:/gapan/sugeo/view.do?mul_no="+mul_no+"&message=저장되었습니다.");		
		
	}
	
	// 수거물 관리번호 생성
	public String	Gapan_MulNo_Execute(HttpServletRequest request, HttpServletResponse response, String rem_bjcd_param) throws Exception 
	{
		
		UserBean	userBean	= new UserBean();
		userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
		
		
		
		// 법정동코드 
		//System.out.println("sigu_cd  구코드 ===== " + userBean.getSIGU_CD());
		//System.out.println("rem_bjcd_param 법정동 ===== " + rem_bjcd_param);
		
		// 수거물관리번호에 쓸 법정동코드 앞3자리 짜르기
		String rem_bjcd = "";
		if( rem_bjcd_param != null && !"".equals(rem_bjcd_param) ){
			rem_bjcd = rem_bjcd_param.substring(0,3);
		}
		
		// 법정동 코드별로 수거물 관리번호 생성
		String mul_no_db = iSugeoService.executeGapan_MulNo(userBean.getSIGU_CD(), rem_bjcd);

		// 수거물 관리번호:시구코드 + 법정코드 + (max+1)값
		String mul_no = userBean.getSIGU_CD()+rem_bjcd+mul_no_db;
		
		//System.out.println("수거물 관리번호=====" + mul_no);
		return	mul_no;
	}
	

	// 수거정보 등록
	public ModelAndView	RemInfo_Execute(HttpServletRequest request,HttpServletResponse response, String mul_no) throws Exception 
	{
		//		 삭제 세션
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");

		try{
			if(userId != null)
			{
				SugeoBean sugeoBean = new SugeoBean();
				bind(request, sugeoBean);
				
				sugeoBean.setMul_no(mul_no);
				if( sugeoBean.getRem_date_hh() != null && !"".equals(sugeoBean.getRem_date_hh()) ){
					if(sugeoBean.getRem_date_hh().length() == 1 ){
						sugeoBean.setRem_date_hh("0"+sugeoBean.getRem_date_hh());
					}
				}else{
					sugeoBean.setRem_date_hh("00");
				}
				
				if( sugeoBean.getRem_date_mm() != null && !"".equals(sugeoBean.getRem_date_mm()) ){
					if(sugeoBean.getRem_date_mm().length() == 1 ){
						sugeoBean.setRem_date_mm("0"+sugeoBean.getRem_date_mm());
					}
				}else{
					sugeoBean.setRem_date_mm("00");
				}
				
				sugeoBean.setRem_date(removeDash(sugeoBean.getRem_date())+sugeoBean.getRem_date_hh()+sugeoBean.getRem_date_mm());
				sugeoBean.setRem_svfrom(removeDash(sugeoBean.getRem_svfrom()));
				sugeoBean.setRem_svto(removeDash(sugeoBean.getRem_svto()));
				sugeoBean.setRem_badfrom(removeDash(sugeoBean.getRem_badfrom()));
				sugeoBean.setRem_badto(removeDash(sugeoBean.getRem_badto()));
				sugeoBean.setAnn_date(removeDash(sugeoBean.getAnn_date()));
				
				if( sugeoBean.getRem_bjcd() != null && !"".equals( sugeoBean.getRem_bjcd()) ){
					sugeoBean.setRem_bjcd(sugeoBean.getRem_bjcd().substring(0,3));
				}
				if( sugeoBean.getRem_hjcd() != null && !"".equals( sugeoBean.getRem_hjcd()) ){
					sugeoBean.setRem_hjcd(sugeoBean.getRem_hjcd().substring(0,3));
				}
		
				iSugeoService.executeRemInfo(sugeoBean);
			}
		} catch(Exception e){
			System.out.println(e.toString());
		}

		//return new ModelAndView("redirect:/gapan/sugeo/search.do");
		return null;
	}
	

	// 수거물품 등록
	public ModelAndView	Goods_Register_Execute(HttpServletRequest request,HttpServletResponse response, String mul_no) throws Exception 
	{
		//	UserBean	userBean	= new UserBean();
		//	userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
		
		// 등록시 두가지 경우때문에 파라미터 나눠줌 
		String mul_no_param = ServletRequestUtils.getStringParameter(request,"mul_no","");
		String showTab = ServletRequestUtils.getStringParameter(request,"showTab","");
		String message = ServletRequestUtils.getStringParameter(request,"message","");
		
		if( mul_no == null || "".equals(mul_no) ){
			mul_no = mul_no_param;
		}
		
		
		SugeoBean sugeoBean = new SugeoBean();
		bind(request, sugeoBean);
		
		sugeoBean.setMul_no(mul_no);
		sugeoBean.setGoods_svfrom(removeDash(sugeoBean.getGoods_svfrom()));
		sugeoBean.setGoods_svto(removeDash(sugeoBean.getGoods_svto()));
		sugeoBean.setGoods_date(removeDash(sugeoBean.getGoods_date()));
		
		if( sugeoBean.getGoods_status() != null && !"".equals(sugeoBean.getGoods_status())){
			sugeoBean.setGoods_status(Integer.parseInt(sugeoBean.getGoods_status())+"");
		}else{sugeoBean.setGoods_status("0");}

		iSugeoService.executeGoodsRegister(sugeoBean);
		
		//System.out.println("수거물품 리스트 mul_no ========" + mul_no);
		//System.out.println("showTab ========" + showTab);
		request.setAttribute("mul_no" , mul_no);
		request.setAttribute("showTab" , showTab);		

		return new ModelAndView("redirect:/gapan/sugeo/sugeo_view.do?mul_no="+mul_no+"&showTab="+showTab+"&message="+message);
	}
	
	
	
	// 과태료, 폐기/매각  등록화면
	public	ModelAndView Bugwa_Register(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		//		 삭제 세션
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");

		try{
			if(userId != null)
			{
				String mul_no = ServletRequestUtils.getStringParameter(request,"mul_no","");
				String showTab = ServletRequestUtils.getStringParameter(request,"showTab","");
				
				
				// 시도코드
				String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				
				// 세션체크
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
				//System.out.println(" !!USER : " + userBean.getNAME());
				
				if(userBean	!= null)
				{
					request.setAttribute("gu_nm", commonCode.SearchGuName(SIDO_CD, userBean.getSIGU_CD()));
					request.setAttribute("org_cd", userBean.getORG_CD());
					request.setAttribute("dept_cd", userBean.getDEPT_CD());
					request.setAttribute("dept_nm", userBean.getDEPT_NM());
					request.setAttribute("chg_org", userBean.getORG_CD());
					request.setAttribute("chg_nm", userBean.getNAME());
					
					request.setAttribute("bjdong_code", commonCode.executeBJDongCode(SIDO_CD, userBean.getSIGU_CD(), null));
					request.setAttribute("hjdong_code", commonCode.executeHJDongCode(SIDO_CD, userBean.getSIGU_CD(), null));
					
				}
				
				request.setAttribute("re_typ", commonCode.executeGapanCode("RE_TYP", null, "전체"));
				request.setAttribute("gd_sta", commonCode.executeGapanCode("GD_STA", null, "전체"));	// 진행상황
				request.setAttribute("sa_typ", commonCode.executeGapanCode("SA_TYP", null, "전체"));	// 폐기/매각 진행상황
				
				
				// 현재날짜
				SimpleDateFormat	formatter 	= new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA);
				Calendar 			cal 		= Calendar.getInstance();
				String	today		= formatter.format(cal.getTime());
				request.setAttribute("today", today);
				
				// 수거물관리번호
				request.setAttribute("mul_no", mul_no);		 
				request.setAttribute("showTab", showTab);	// 폐기/매각탭으로 이동하기 위해
			}
		} catch(Exception e){
			System.out.println(e.toString());
		}
				
		return new ModelAndView("/gapan/sugeo/tab/sugeo_bugwa_register");
	}
	
	
	
	// 과태료 등록
	public ModelAndView	Bugwa_RegisterPrc(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		//		 삭제 세션
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");

		try{
			if(userId != null)
			{
		
				// 수거물관리번호 
				String mul_no = ServletRequestUtils.getStringParameter(request, "mul_no", "");
				
				SugeoBean sugeoBean = new SugeoBean();
				bind(request, sugeoBean);
						
				sugeoBean.setMul_no(mul_no);
				//sugeoBean.setMul_no("680101_5_0001");//테스트용 나중에 삭제!!!!!!!!!!!!!!
		
				iSugeoService.executeBugwa_RegisterPrc(sugeoBean);
				
				request.setAttribute("mul_no",mul_no);
				request.setAttribute("showTab","showTab");
			}
		} catch(Exception e){
			System.out.println(e.toString());
		}
		
		//return null;
		//return new ModelAndView("redirect:/gapan/sugeo/sugeo_bugwa_register.do?showTab=sale&mul_no="+mul_no);
		return new ModelAndView("/gapan/sugeo/sugeo_bugwa_register");
	}
	
	
	// 폐기/매각 등록
	public ModelAndView	Sale_RegisterPrc(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		//	UserBean	userBean	= new UserBean();
		//	userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
		
		// 수거물관리번호 
		String mul_no = ServletRequestUtils.getStringParameter(request, "mul_no", "");
		
		SugeoBean sugeoBean = new SugeoBean();
		bind(request, sugeoBean);
				
		sugeoBean.setMul_no(mul_no);
		//sugeoBean.setMul_no("680101_5_0001");//테스트용 나중에 삭제!!!!!!!!!!!!!!
		sugeoBean.setSale_date(removeDash(sugeoBean.getSale_date()));
		sugeoBean.setHnd_desdate(removeDash(sugeoBean.getHnd_desdate()));
		sugeoBean.setHnd_opedate(removeDash(sugeoBean.getHnd_opedate()));
		
		sugeoBean.setBugwa_danga(util.Comma_Paste(sugeoBean.getBugwa_danga()));
		sugeoBean.setBugwa_red_tax(util.Comma_Paste(sugeoBean.getBugwa_red_tax()));
		sugeoBean.setBugwa_tax(util.Comma_Paste(sugeoBean.getBugwa_tax()));

		iSugeoService.executeSale_RegisterPrc(sugeoBean);

		return new ModelAndView("redirect:/gapan/sugeo/search.do");
	}
	
	
	
	// 수거정보 view화면
	public	ModelAndView sugeo_view(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		
		//		 삭제 세션
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		SugeoBean sugeoBean = new SugeoBean();

		try{
			if(userId != null)
			{
		
				// 수거물관리번호
				String 	mul_no 	= ServletRequestUtils.getStringParameter(request, "mul_no", "");
				String 	message	= ServletRequestUtils.getStringParameter(request, "message", "");
				
				// 세션
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
				// 시도코드
				String SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				// 시구코드
				String SIGU_CD = userBean.getSIGU_CD();
				
				
				
				if(userBean	!= null)
				{
					request.setAttribute("gu_nm", commonCode.SearchGuName(SIDO_CD, SIGU_CD));
					request.setAttribute("org_cd", userBean.getORG_CD());
					request.setAttribute("dept_cd", userBean.getDEPT_CD());
					request.setAttribute("dept_nm", userBean.getDEPT_NM());
					request.setAttribute("chg_org", userBean.getORG_CD());
					request.setAttribute("chg_nm", userBean.getNAME());
					
					request.setAttribute("bjdong_code", commonCode.executeBJDongCode(SIDO_CD, SIGU_CD, null));
					request.setAttribute("hjdong_code", commonCode.executeHJDongCode(SIDO_CD, SIGU_CD, null));
					
				}
				
				request.setAttribute("re_typ", commonCode.executeGapanCode("RE_TYP", null, "전체"));
				request.setAttribute("gd_sta", commonCode.executeGapanCode("GD_STA", null, "전체"));	// 진행상황
				
				
				// 현재날짜
				SimpleDateFormat	formatter 	= new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA);
				Calendar 			cal 		= Calendar.getInstance();
				String	today		= formatter.format(cal.getTime());
				request.setAttribute("today", today);
				
				// 수거물관리번호
				request.setAttribute("mul_no", mul_no);
				request.setAttribute("message", message);
				
				sugeoBean = new SugeoBean();
				//System.out.println("SIDO_CD=== " + SIDO_CD);
				//System.out.println("SIGU_CD=== " + SIGU_CD);
				//System.out.println("mul_no=== " + mul_no);
				sugeoBean = iSugeoService.getSugeoView(SIDO_CD, SIGU_CD, mul_no);
				
				
		
				if( sugeoBean.getRem_date() != null && !"".equals( sugeoBean.getRem_date()) && sugeoBean.getRem_date().length() == 12){
					String rem_date = util.Date_Paste(sugeoBean.getRem_date().substring(0,8));
					//sugeoBean.setRem_date(rem_date);  //셋팅하면 이상하게 에러발생..
					request.setAttribute("rem_date",rem_date);
					sugeoBean.setRem_date_hh(sugeoBean.getRem_date().substring(8,10));
					sugeoBean.setRem_date_mm(sugeoBean.getRem_date().substring(10,12));
				}
				if( sugeoBean.getRem_bjcd() != null && !"".equals( sugeoBean.getRem_bjcd()) ){
					sugeoBean.setRem_bjcd(sugeoBean.getRem_bjcd()+"00");
				}
				if( sugeoBean.getRem_hjcd() != null && !"".equals( sugeoBean.getRem_hjcd()) ){
					sugeoBean.setRem_hjcd(sugeoBean.getRem_hjcd()+"00");
				}
				if ( sugeoBean.getRem_svfrom() != null && !"".equals(sugeoBean.getRem_svfrom()) ){
					sugeoBean.setRem_svfrom( sugeoBean.getRem_svfrom()+" ~ ");
				}
				if ( sugeoBean.getRem_badfrom() != null && !"".equals(sugeoBean.getRem_badfrom()) ){
					sugeoBean.setRem_badfrom( util.Date_Paste(sugeoBean.getRem_badfrom())+" ~ ");
				}
				
				sugeoBean.setRem_svto(util.Date_Paste(sugeoBean.getRem_svto()));
				sugeoBean.setRem_badto(util.Date_Paste(sugeoBean.getRem_badto()));
				sugeoBean.setAnn_date(util.Date_Paste(sugeoBean.getAnn_date()));
				
				
				// 수거물품 리스트 관련 정보 start
				int intCurrentPage = 0;
				int intCountPerPage = 0;
		
				String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
				String strCountPerPage = ServletRequestUtils.getStringParameter(request, "countPerPage", "3");
				String strActionUrl = request.getContextPath();
				//String strParams ="&gubun="+gubun+"&content="+content+"&fromDate="+fromDate+"&toDate="+toDate+"&certYN="+certYN;
		
				intCurrentPage = Integer.parseInt(strCurrentPage);
				intCountPerPage = Integer.parseInt(strCountPerPage);
		
				
				int totalCount = iSugeoService.getGoodsTotalCount(mul_no);
				
				// 페이징 처리
				int	rowCol = pageing.execute(request, totalCount, intCurrentPage, 3);
				//String paging = BoardUtil.getDividePageForm(intCurrentPage,intCountPerPage, "","",strActionUrl, totalCount);
				
				
				//List		list	= iSugeoService.goodsList(mul_no,intCurrentPage,intCountPerPage);
				List		list	= iSugeoService.goodsList(mul_no, rowCol, rowCol + 2);
				List		blist	= new ArrayList();
				SugeoBean	bean	= new SugeoBean();
				bind(request, sugeoBean);
				int			size	= list.size();
			
				for(int i = 0	;	i < size	;	i++)
				{
					bean	= (SugeoBean)list.get(i);
					
					if(bean.getGoods_status() != null)	
						bean.setGoods_status(gapanCodeNm("GD_STA",bean.getGoods_status()));
						bean.setGoods_svfrom(util.Date_Paste(bean.getGoods_svfrom()));
						bean.setGoods_svto(util.Date_Paste(bean.getGoods_svto()));
			        		
						blist.add(i, bean);
				}
				
				request.setAttribute("currentPage", strCurrentPage);
				request.setAttribute("countPerPage", strCountPerPage);
				//request.setAttribute("mul_no", mul_no);
				request.setAttribute("listSize",String.valueOf(blist.size()));
				request.setAttribute("totalCount",String.valueOf(totalCount));
				request.setAttribute("blist", blist);
				// 수거물품 리스트 정보 end 
				
				
				// 수거물품 리스트 상세 보기 goods_seq
				String goods_seq = ServletRequestUtils.getStringParameter(request, "goods_seq", "");
				String showTab = ServletRequestUtils.getStringParameter(request, "showTab", "");
				request.setAttribute("showTab", showTab);
				if( goods_seq != null && !"".equals(goods_seq) ){
					
					SugeoBean goodsBean = new SugeoBean();
					goodsBean = iSugeoService.goods_view(goods_seq);
					
					goodsBean.setGoods_svfrom(util.Date_Paste(goodsBean.getGoods_svfrom()));
					goodsBean.setGoods_svto(util.Date_Paste(goodsBean.getGoods_svto()));
					goodsBean.setGoods_date(util.Date_Paste(goodsBean.getGoods_date()));
					request.setAttribute("goods_seq", goods_seq);
					request.setAttribute("mul_no", mul_no);
					//request.setAttribute("showTab", showTab);
					request.setAttribute("goodsBean", goodsBean);
				}
			}
		} catch(Exception e){
			System.out.println(e.toString());
		}
		
		return new ModelAndView("/gapan/sugeo/tab/sugeo_view", "sugeo", sugeoBean);
	}
	
	
	
	// 수거물품리스트 엑셀변환 
	public ModelAndView	goods_excel_search(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		//		 삭제 세션
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		List		blist	= null;

		try{
			if(userId != null)
			{
				int intCurrentPage = 0;
				int intCountPerPage = 0;
		
				String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
				String strCountPerPage = ServletRequestUtils.getStringParameter(request, "countPerPage", "3");
				String strActionUrl = request.getContextPath();
				//String strParams ="&gubun="+gubun+"&content="+content+"&fromDate="+fromDate+"&toDate="+toDate+"&certYN="+certYN;
		
				intCurrentPage = Integer.parseInt(strCurrentPage);
				intCountPerPage = Integer.parseInt(strCountPerPage);
		
				String 	mul_no 	= ServletRequestUtils.getStringParameter(request, "mul_no", "");
				
				int totalCount = iSugeoService.getGoodsTotalCount(mul_no);
				
				// 페이징 처리
				int	rowCol = pageing.execute(request, totalCount, intCurrentPage, 3);
				//String paging = BoardUtil.getDividePageForm(intCurrentPage,intCountPerPage, "","",strActionUrl, totalCount);
				
				//List		list	= iSugeoService.goodsList(mul_no, rowCol, rowCol + 2);
				List		list	= iSugeoService.goodsList(mul_no, 1, totalCount);
				blist	= new ArrayList();
				SugeoBean	bean	= new SugeoBean();
				bind(request, bean);
				int			size	= list.size();
			
				for(int i = 0	;	i < size	;	i++)
				{
					bean	= (SugeoBean)list.get(i);
					
					if(bean.getGoods_status() != null){
						bean.setGoods_status(gapanCodeNm("GD_STA",bean.getGoods_status()));
					}
					
					bean.setGoods_svfrom(util.Date_Paste(bean.getGoods_svfrom()));
					bean.setGoods_svto(util.Date_Paste(bean.getGoods_svto()));
		        	
					blist.add(i, bean);
				}
				
				request.setAttribute("currentPage", String.valueOf(intCurrentPage));
				request.setAttribute("countPerPage", strCountPerPage);
				request.setAttribute("mul_no", mul_no);
				request.setAttribute("listSize",String.valueOf(blist.size()));
				request.setAttribute("totalCount",String.valueOf(totalCount));
				request.setAttribute("blist", blist);
			}
		} catch(Exception e){
			System.out.println(e.toString());
		}
		
		
		return new ModelAndView("/gapan/sugeo/tab/excel_goods_search", "blist", blist);
	}
	
	
	// 과태료, 폐기/매각 정보 view화면
	public	ModelAndView sugeo_bugwa_view(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		
		//		 삭제 세션
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		SugeoBean sugeoBean = null;

		try{
			if(userId != null)
			{
		
				// 수거물관리번호
				String 	mul_no 	= ServletRequestUtils.getStringParameter(request, "mul_no", "");
				String 	showTab	 	= ServletRequestUtils.getStringParameter(request, "showTab", "");		
		 
				request.setAttribute("mul_no", mul_no);
				
				sugeoBean = new SugeoBean();
				// 정보 가져오기
				sugeoBean = iSugeoService.getSugeoBugwaView(mul_no);
		
				if( sugeoBean != null ){
				
					if( sugeoBean.getOwner_ssn() != null && !"".equals(sugeoBean.getOwner_ssn()) && sugeoBean.getOwner_ssn().length() == 13){
						sugeoBean.setOwner_ssn1(sugeoBean.getOwner_ssn().substring(0,6));
						sugeoBean.setOwner_ssn2(sugeoBean.getOwner_ssn().substring(6,13));
					}
					if( sugeoBean.getOwner_tel() != null && !"".equals(sugeoBean.getOwner_tel()) ){
						String[] owner_tel = sugeoBean.getOwner_tel().split("-");
						//for( int i = 0; i < owner_tel.length; i++ ){
							sugeoBean.setOwner_tel1(owner_tel[0] + " - ");
							sugeoBean.setOwner_tel2(owner_tel[1] + " - ");
							sugeoBean.setOwner_tel3(owner_tel[2]);
						//}
					}
					if( sugeoBean.getOwner_hp() != null && !"".equals(sugeoBean.getOwner_hp()) ){
						String[] hp_tel = sugeoBean.getOwner_hp().split("-");
						//for( int i = 0; i < hp_tel.length; i++ ){
							sugeoBean.setOwner_hp1(hp_tel[0] + " - ");
							sugeoBean.setOwner_hp2(hp_tel[1] + " - ");
							sugeoBean.setOwner_hp3(hp_tel[2]);
						//}
					}
					
					if( sugeoBean.getBugwa_area() != null && !"".equals(sugeoBean.getBugwa_area()) ){
						sugeoBean.setBugwa_area(sugeoBean.getBugwa_area() + " ㎡");
					}
					if( sugeoBean.getBugwa_danga() != null && !"".equals(sugeoBean.getBugwa_danga()) ){
						sugeoBean.setBugwa_danga(util.Comma_Paste(sugeoBean.getBugwa_danga()) + " 원");
					}
					if( sugeoBean.getBugwa_tax() != null && !"".equals(sugeoBean.getBugwa_tax()) ){
						sugeoBean.setBugwa_tax(util.Comma_Paste(sugeoBean.getBugwa_tax()) + " 원");
					}
					if( sugeoBean.getBugwa_red_rate() != null && !"".equals(sugeoBean.getBugwa_area()) ){
						sugeoBean.setBugwa_red_rate(sugeoBean.getBugwa_red_rate() + " %");
					}
					if( sugeoBean.getBugwa_red_tax() != null && !"".equals(sugeoBean.getBugwa_area()) ){
						sugeoBean.setBugwa_red_tax(util.Comma_Paste(sugeoBean.getBugwa_red_tax()) + " 원");
					}
					
					sugeoBean.setSale_date(util.Date_Paste(sugeoBean.getSale_date()));
					sugeoBean.setHnd_desdate(util.Date_Paste(sugeoBean.getHnd_desdate()));
					sugeoBean.setHnd_opedate(util.Date_Paste(sugeoBean.getHnd_opedate()));
					
					sugeoBean.setSale_type_name(gapanCodeNm("SA_TYP", sugeoBean.getSale_type()));
					sugeoBean.setHnd_type_name(gapanCodeNm("SA_TYP", sugeoBean.getHnd_type()));
				
				}
				
				// 테이블 중복 체크하기위해 
				int fine_cnt = iSugeoService.getFineCnt(mul_no);
		
				// 테이블 중복 체크하기위해 
				int sale_cnt = iSugeoService.getSaleCnt(mul_no);
				
				request.setAttribute("fine_cnt" , String.valueOf(fine_cnt));
				request.setAttribute("sale_cnt" , String.valueOf(sale_cnt));
				
				request.setAttribute("sa_typ", commonCode.executeGapanCode("SA_TYP", null, "전체"));	// 폐기/매각 진행상황
				request.setAttribute("showTab", showTab);
			}
		} catch(Exception e){
			System.out.println(e.toString());
		}
		
		return new ModelAndView("/gapan/sugeo/tab/sugeo_bugwa_view", "sugeo", sugeoBean);
	}
	
	
	
	// 수거정보 수정
	public ModelAndView	sugeo_modify(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		//	UserBean	userBean	= new UserBean();
		//	userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
		String 	mul_no 	= ServletRequestUtils.getStringParameter(request, "mul_no", "");
		//System.out.println("수거정보 수정 mul_no====  " + mul_no);
		
		SugeoBean sugeoBean = new SugeoBean();
		bind(request, sugeoBean);
		

		sugeoBean.setMul_no(mul_no);
		if( sugeoBean.getRem_date_hh() != null && !"".equals(sugeoBean.getRem_date_hh()) ){
			System.out.println("sugeoBean.getRem_date_hh().length()    " + sugeoBean.getRem_date_hh().length());
			if(sugeoBean.getRem_date_hh().length() == 1 ){
				sugeoBean.setRem_date_hh("0"+sugeoBean.getRem_date_hh());
			}
		}else{
			sugeoBean.setRem_date_hh("00");
		}
		
		if( sugeoBean.getRem_date_mm() != null && !"".equals(sugeoBean.getRem_date_mm()) ){
			System.out.println("sugeoBean.getRem_date_mm().length()    " + sugeoBean.getRem_date_mm().length());
			if(sugeoBean.getRem_date_mm().length() == 1 ){
				sugeoBean.setRem_date_mm("0"+sugeoBean.getRem_date_mm());
			}
		}else{
			sugeoBean.setRem_date_mm("00");
		}
		sugeoBean.setRem_date(removeDash(sugeoBean.getRem_date())+sugeoBean.getRem_date_hh()+sugeoBean.getRem_date_mm());
		sugeoBean.setRem_svfrom(removeDash(sugeoBean.getRem_svfrom()));
		sugeoBean.setRem_svto(removeDash(sugeoBean.getRem_svto()));
		sugeoBean.setRem_badfrom(removeDash(sugeoBean.getRem_badfrom()));
		sugeoBean.setRem_badto(removeDash(sugeoBean.getRem_badto()));
		sugeoBean.setAnn_date(removeDash(sugeoBean.getAnn_date()));
		
		if( sugeoBean.getRem_bjcd() != null && !"".equals( sugeoBean.getRem_bjcd()) ){
			sugeoBean.setRem_bjcd(sugeoBean.getRem_bjcd().substring(0,3));
		}
		if( sugeoBean.getRem_hjcd() != null && !"".equals( sugeoBean.getRem_hjcd()) ){
			sugeoBean.setRem_hjcd(sugeoBean.getRem_hjcd().substring(0,3));
		}

		iSugeoService.sugeo_modify(sugeoBean);

		return new ModelAndView("redirect:/gapan/sugeo/sugeo_view.do?mul_no="+mul_no);
		//return null;
	}
	
	
	// 수거물품 수정
	public ModelAndView	sugeo_bugwa_modify(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		//	UserBean	userBean	= new UserBean();
		//	userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
		
		String 	mul_no 	= ServletRequestUtils.getStringParameter(request, "mul_no", "");
		String 	goods_seq 	= ServletRequestUtils.getStringParameter(request, "goods_seq", "");
		String 	showTab 	= ServletRequestUtils.getStringParameter(request, "showTab", "");
		int	currentPage	= Integer.parseInt(ServletRequestUtils.getStringParameter(request, "currentPage", "1"));
		
		//System.out.println("수거물품 수정mul_no== " + mul_no);
		//System.out.println("수거물품 수정goods_seq== " + goods_seq);
		
		SugeoBean sugeoBean = new SugeoBean();
		bind(request, sugeoBean);
		
		sugeoBean.setGoods_seq(goods_seq);
		sugeoBean.setMul_no(sugeoBean.getMul_no());
		sugeoBean.setGoods_svfrom(removeDash(sugeoBean.getGoods_svfrom()));
		sugeoBean.setGoods_svto(removeDash(sugeoBean.getGoods_svto()));
		sugeoBean.setGoods_date(removeDash(sugeoBean.getGoods_date()));		
		if( sugeoBean.getGoods_status() != null && !"".equals(sugeoBean.getGoods_status())){
			sugeoBean.setGoods_status(Integer.parseInt(sugeoBean.getGoods_status())+"");
		}else{sugeoBean.setGoods_status("0");}
		

		iSugeoService.sugeo_bugwa_modify(sugeoBean);
		
		request.setAttribute("mul_no", mul_no);
		request.setAttribute("goods_seq", goods_seq);
		request.setAttribute("showTab",showTab);

		return new ModelAndView("redirect:/gapan/sugeo/sugeo_view.do?mul_no="+mul_no+"&goods_seq="+goods_seq+"&showTab="+showTab+"&currentPage="+currentPage);
	}
	
	
	
	// 과태료 수정
	public ModelAndView	sugeo_fine_modify(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		//	UserBean	userBean	= new UserBean();
		//	userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
		
		// 수거물관리번호 
		String mul_no = ServletRequestUtils.getStringParameter(request, "mul_no", "");
		
		SugeoBean sugeoBean = new SugeoBean();
		bind(request, sugeoBean);
				
		sugeoBean.setMul_no(mul_no);
		sugeoBean.setBugwa_danga(util.Comma_Cut(sugeoBean.getBugwa_danga()));
		sugeoBean.setBugwa_tax(util.Comma_Cut(sugeoBean.getBugwa_tax()));
		sugeoBean.setBugwa_red_tax(util.Comma_Cut(sugeoBean.getBugwa_red_tax()));		
		
		// 테이블 중복 체크하기위해 
		int fine_cnt = iSugeoService.getFineCnt(mul_no);

		// 테이블이 정보 있는 경우 수정, 없는 경우 등록
		if( fine_cnt > 0 ){
			iSugeoService.sugeo_fine_modify(sugeoBean);
		}
		else{
			iSugeoService.executeBugwa_RegisterPrc(sugeoBean);
		}
		
		return new ModelAndView("redirect:/gapan/sugeo/sugeo_bugwa_view.do?mul_no="+mul_no);
	}
	
	
	
	// 폐기/매각 수정
	public ModelAndView	sugeo_sale_modify(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		//	UserBean	userBean	= new UserBean();
		//	userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
		
		// 수거물관리번호 
		String mul_no = ServletRequestUtils.getStringParameter(request, "mul_no", "");
		
		SugeoBean sugeoBean = new SugeoBean();
		bind(request, sugeoBean);
				
		sugeoBean.setMul_no(mul_no);
		sugeoBean.setSale_date(removeDash(sugeoBean.getSale_date()));
		sugeoBean.setHnd_desdate(removeDash(sugeoBean.getHnd_desdate()));
		sugeoBean.setHnd_opedate(removeDash(sugeoBean.getHnd_opedate()));
		
		// 테이블 중복 체크하기위해 
		int sale_cnt = iSugeoService.getSaleCnt(mul_no);

		//	 테이블이 정보 있는 경우 수정, 없는 경우 등록
		if( sale_cnt > 0 ){
			iSugeoService.sugeo_sale_modify(sugeoBean);
		}
		else{
			iSugeoService.executeSale_RegisterPrc(sugeoBean);
		}
		

		return new ModelAndView("redirect:/gapan/sugeo/sugeo_bugwa_view.do?showTab=sale&mul_no="+mul_no);
	}
	
	
	
	// '-' 없애기
	public String removeDash(String val1)
	{			
		String[] components = val1.split("-");		
		String returnVal = "";		
		for(int i=0;i<components.length;i++)
			returnVal = returnVal + components[i].toString();
		
		return returnVal;		
	}
	
	// 가판코드 이름가져오기
	public String gapanCodeNm(String cd_type, String cd_value ){
		
		String cd_nm = "";
		if( cd_type == null || "".equals(cd_type.trim()) ){			
			return "";
		}
		if( cd_value == null || "".equals(cd_value.trim()) ){			
			return "";
		}
		cd_nm = iSugeoService.gapanCodeNm(cd_type, cd_value);
		
		return cd_nm;
	}
	
	
	
	// 수거정보  수정화면
	public	ModelAndView sugeo_register_view(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		
		//		 삭제 세션
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		SugeoBean sugeoBean = null;

		try{
			if(userId != null)
			{
		
				// 수거물관리번호
				String 	mul_no 	= ServletRequestUtils.getStringParameter(request, "mul_no", "");
				String 	message	= ServletRequestUtils.getStringParameter(request, "message", "");
				
				// 세션
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
				// 시도코드
				String SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				// 시구코드
				String SIGU_CD = userBean.getSIGU_CD();
				
				
				
				if(userBean	!= null)
				{
					request.setAttribute("gu_nm", commonCode.SearchGuName(SIDO_CD, SIGU_CD));
					request.setAttribute("org_cd", userBean.getORG_CD());
					request.setAttribute("dept_cd", userBean.getDEPT_CD());
					request.setAttribute("dept_nm", userBean.getDEPT_NM());
					request.setAttribute("chg_org", userBean.getORG_CD());
					request.setAttribute("chg_nm", userBean.getNAME());
					
					request.setAttribute("bjdong_code", commonCode.executeBJDongCode(SIDO_CD, SIGU_CD, null));
					request.setAttribute("hjdong_code", commonCode.executeHJDongCode(SIDO_CD, SIGU_CD, null));
					
				}
				
				request.setAttribute("re_typ", commonCode.executeGapanCode("RE_TYP", null, "전체"));
				request.setAttribute("gd_sta", commonCode.executeGapanCode("GD_STA", null, "전체"));	// 진행상황
				
				
				// 현재날짜
				SimpleDateFormat	formatter 	= new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA);
				Calendar 			cal 		= Calendar.getInstance();
				String	today		= formatter.format(cal.getTime());
				request.setAttribute("today", today);
				
				// 수거물관리번호
				request.setAttribute("mul_no", mul_no);
				request.setAttribute("message", message);
				
				sugeoBean = new SugeoBean();
				sugeoBean = iSugeoService.getSugeoView(SIDO_CD, SIGU_CD, mul_no);
				
				
				sugeoBean.setRem_svfrom(util.Date_Paste(sugeoBean.getRem_svfrom()));
				sugeoBean.setRem_svto(util.Date_Paste(sugeoBean.getRem_svto()));
				sugeoBean.setRem_badfrom(util.Date_Paste(sugeoBean.getRem_badfrom()));
				sugeoBean.setRem_badto(util.Date_Paste(sugeoBean.getRem_badto()));
				sugeoBean.setAnn_date(util.Date_Paste(sugeoBean.getAnn_date()));
				
				
				if( sugeoBean.getRem_date() != null && !"".equals( sugeoBean.getRem_date()) && sugeoBean.getRem_date().length() == 12){
					String rem_date = util.Date_Paste(sugeoBean.getRem_date().substring(0,8));
					//sugeoBean.setRem_date(rem_date);  //셋팅하면 이상하게 에러발생..
					request.setAttribute("rem_date",rem_date);
					sugeoBean.setRem_date_hh(sugeoBean.getRem_date().substring(8,10));
					sugeoBean.setRem_date_mm(sugeoBean.getRem_date().substring(10,12));
				}
				if( sugeoBean.getRem_bjcd() != null && !"".equals( sugeoBean.getRem_bjcd()) ){
					sugeoBean.setRem_bjcd(sugeoBean.getRem_bjcd()+"00");
				}
				if( sugeoBean.getRem_hjcd() != null && !"".equals( sugeoBean.getRem_hjcd()) ){
					sugeoBean.setRem_hjcd(sugeoBean.getRem_hjcd()+"00");
				}
				if ( sugeoBean.getRem_svfrom() != null && !"".equals(sugeoBean.getRem_svfrom()) ){
					sugeoBean.setRem_svfrom( sugeoBean.getRem_svfrom());
				}
				if ( sugeoBean.getRem_badfrom() != null && !"".equals(sugeoBean.getRem_badfrom()) ){
					sugeoBean.setRem_badfrom( sugeoBean.getRem_badfrom());
				}
				
				// 수거물품 리스트 관련 정보 start
				int intCurrentPage = 0;
		
				String strCurrentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
				String strCountPerPage = ServletRequestUtils.getStringParameter(request, "countPerPage", "3");
				String strActionUrl = request.getContextPath();
				//String strParams ="&gubun="+gubun+"&content="+content+"&fromDate="+fromDate+"&toDate="+toDate+"&certYN="+certYN;
		
				intCurrentPage = Integer.parseInt(strCurrentPage);
		
				
				int totalCount = iSugeoService.getGoodsTotalCount(mul_no);
				
				// 페이징 처리
				int	rowCol = pageing.execute(request, totalCount, intCurrentPage, 3);
				//String paging = BoardUtil.getDividePageForm(intCurrentPage,intCountPerPage, "","",strActionUrl, totalCount);
				
				
				//List		list	= iSugeoService.goodsList(mul_no,intCurrentPage,intCountPerPage);
				List		list	= iSugeoService.goodsList(mul_no, rowCol, rowCol + 2);
				List		blist	= new ArrayList();
				SugeoBean	bean	= new SugeoBean();
				bind(request, sugeoBean);
				int			size	= list.size();
			
				for(int i = 0	;	i < size	;	i++)
				{
					bean	= (SugeoBean)list.get(i);
					
					if(bean.getGoods_status() != null)	
						bean.setGoods_status(gapanCodeNm("GD_STA",bean.getGoods_status()));
						bean.setGoods_svfrom(util.Date_Paste(bean.getGoods_svfrom()));
						bean.setGoods_svto(util.Date_Paste(bean.getGoods_svto()));
		        		
					blist.add(i, bean);
				}
				
				request.setAttribute("currentPage", strCurrentPage);
				request.setAttribute("countPerPage", strCountPerPage);
				//request.setAttribute("mul_no", mul_no);
				request.setAttribute("listSize",String.valueOf(blist.size()));
				request.setAttribute("totalCount",String.valueOf(totalCount));
				request.setAttribute("blist", blist);
				// 수거물품 리스트 정보 end 
				
				
				// 수거물품 리스트 상세 보기 goods_seq
				String goods_seq = ServletRequestUtils.getStringParameter(request, "goods_seq", "");
				String showTab = ServletRequestUtils.getStringParameter(request, "showTab", "");
				request.setAttribute("showTab", showTab);
				if( goods_seq != null && !"".equals(goods_seq) ){
					
					SugeoBean goodsBean = new SugeoBean();
					goodsBean = iSugeoService.goods_view(goods_seq);
					
					goodsBean.setGoods_svfrom(util.Date_Paste(goodsBean.getGoods_svfrom()));
					goodsBean.setGoods_svto(util.Date_Paste(goodsBean.getGoods_svto()));
					goodsBean.setGoods_date(util.Date_Paste(goodsBean.getGoods_date()));
					request.setAttribute("goods_seq", goods_seq);
					request.setAttribute("mul_no", mul_no);
					//request.setAttribute("showTab", showTab);
					request.setAttribute("goodsBean", goodsBean);
				}
			}
		} catch(Exception e){
			System.out.println(e.toString());
		}
				
		
		return new ModelAndView("/gapan/sugeo/tab/sugeo_register_view", "sugeo", sugeoBean);
	}
	
	
	// 과태료, 폐기/매각 정보 수정화면
	public	ModelAndView sugeo_bugwa_register_view(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		
		//	 삭제 세션
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		SugeoBean sugeoBean = null;
		
		try{
			if(userId != null)
			{
		
				// 수거물관리번호
				String 	mul_no 	= ServletRequestUtils.getStringParameter(request, "mul_no", "");
				String 	showTab	 	= ServletRequestUtils.getStringParameter(request, "showTab", "");		
		 
				request.setAttribute("mul_no", mul_no);
				
				sugeoBean = new SugeoBean();
				// 정보 가져오기
				sugeoBean = iSugeoService.getSugeoBugwaView(mul_no);
		
				if( sugeoBean != null ){
				
					if( sugeoBean.getOwner_ssn() != null && !"".equals(sugeoBean.getOwner_ssn()) && sugeoBean.getOwner_ssn().length() == 13){
						sugeoBean.setOwner_ssn1(sugeoBean.getOwner_ssn().substring(0,6));
						sugeoBean.setOwner_ssn2(sugeoBean.getOwner_ssn().substring(6,13));
					}
					if( sugeoBean.getOwner_tel() != null && !"".equals(sugeoBean.getOwner_tel()) ){
						String[] owner_tel = sugeoBean.getOwner_tel().split("-");
						//for( int i = 0; i < owner_tel.length; i++ ){
							sugeoBean.setOwner_tel1(owner_tel[0]);
							sugeoBean.setOwner_tel2(owner_tel[1]);
							sugeoBean.setOwner_tel3(owner_tel[2]);
						//}
					}
					if( sugeoBean.getOwner_hp() != null && !"".equals(sugeoBean.getOwner_hp()) ){
						String[] hp_tel = sugeoBean.getOwner_hp().split("-");
						//for( int i = 0; i < hp_tel.length; i++ ){
							sugeoBean.setOwner_hp1(hp_tel[0]);
							sugeoBean.setOwner_hp2(hp_tel[1]);
							sugeoBean.setOwner_hp3(hp_tel[2]);
						//}
					}
					
					if( sugeoBean.getBugwa_area() != null && !"".equals(sugeoBean.getBugwa_area()) ){
						sugeoBean.setBugwa_area(sugeoBean.getBugwa_area());
					}
					if( sugeoBean.getBugwa_danga() != null && !"".equals(sugeoBean.getBugwa_danga()) ){
						sugeoBean.setBugwa_danga(util.Comma_Paste(sugeoBean.getBugwa_danga()));
					}
					if( sugeoBean.getBugwa_tax() != null && !"".equals(sugeoBean.getBugwa_tax()) ){
						sugeoBean.setBugwa_tax(util.Comma_Paste(sugeoBean.getBugwa_tax()));
					}
					if( sugeoBean.getBugwa_red_rate() != null && !"".equals(sugeoBean.getBugwa_area()) ){
						sugeoBean.setBugwa_red_rate(sugeoBean.getBugwa_red_rate());
					}
					if( sugeoBean.getBugwa_red_tax() != null && !"".equals(sugeoBean.getBugwa_area()) ){
						sugeoBean.setBugwa_red_tax(util.Comma_Paste(sugeoBean.getBugwa_red_tax()));
					}
					
					sugeoBean.setSale_date(util.Date_Paste(sugeoBean.getSale_date()));
					sugeoBean.setHnd_desdate(util.Date_Paste(sugeoBean.getHnd_desdate()));
					sugeoBean.setHnd_opedate(util.Date_Paste(sugeoBean.getHnd_opedate()));
					
					sugeoBean.setSale_type_name(gapanCodeNm("SA_TYP", sugeoBean.getSale_type()));
					sugeoBean.setHnd_type_name(gapanCodeNm("SA_TYP", sugeoBean.getHnd_type()));
				
				}
				
				// 테이블 중복 체크하기위해 
				int fine_cnt = iSugeoService.getFineCnt(mul_no);
		
				// 테이블 중복 체크하기위해 
				int sale_cnt = iSugeoService.getSaleCnt(mul_no);
				
				request.setAttribute("fine_cnt" , String.valueOf(fine_cnt));
				request.setAttribute("sale_cnt" , String.valueOf(sale_cnt));
				
				request.setAttribute("sa_typ", commonCode.executeGapanCode("SA_TYP", null, "전체"));	// 폐기/매각 진행상황
				request.setAttribute("showTab", showTab);
			}
		} catch(Exception e){
			System.out.println(e.toString());
		}
		
		return new ModelAndView("/gapan/sugeo/tab/sugeo_bugwa_register_view", "sugeo", sugeoBean);
	}
	
}

