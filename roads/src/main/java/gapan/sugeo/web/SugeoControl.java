package main.java.gapan.sugeo.web;

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
import main.java.gapan.sugeo.model.SugeoBean;
import main.java.gapan.sugeo.service.ISugeoService;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class SugeoControl	extends MultiActionController{

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
	
	
	//	조회 화면
	public ModelAndView 	Search(HttpServletRequest request,HttpServletResponse response, String message) throws Exception 
	{	
		
//		 삭제 세션
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		List		list	= null;

		try{
			if(userId != null)
			{
		
				//	관리자 데이터를 가져온다.
				UserBean	userBean	= new UserBean();
				try{
					userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				}
				catch (Exception e){
					String errReason = e.toString();
					System.out.println(errReason);
				}
				
				// 시도코드
				String SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				// 시구코드
				String SIGU_CD = userBean.getSIGU_CD();
				
				
				//	현재 년도
				SimpleDateFormat	formatter 	= new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA );
				Calendar 			cal 		= Calendar.getInstance();
				String	today		= formatter.format(cal.getTime());
				cal.add(Calendar.DATE, -6);
				String	beforeDay		= formatter.format(cal.getTime());
				
				
				String 	rem_date_from 		= ServletRequestUtils.getStringParameter(request, "rem_date_from", beforeDay);
				String 	rem_date_to 		= ServletRequestUtils.getStringParameter(request, "rem_date_to", today);
				
				SugeoBean sugeoBean = new SugeoBean();
				bind(request, sugeoBean);
				
				// 날짜 검색이 있을시 셋팅해주기
				if( rem_date_from == null || "".equals(rem_date_from) ){
					sugeoBean.setRem_date_from(util.Date_Cut(sugeoBean.getRem_date_from()));
				}else{
					sugeoBean.setRem_date_from(util.Date_Cut(rem_date_from));
				}
				if( rem_date_to == null || "".equals(rem_date_to) ){
					sugeoBean.setRem_date_to(util.Date_Cut(sugeoBean.getRem_date_to()));
				}else{
					sugeoBean.setRem_date_to(util.Date_Cut(rem_date_to));
				}
				
				if( sugeoBean.getRem_bjcd_search() != null && !"".equals(sugeoBean.getRem_bjcd_search()) ){
					sugeoBean.setRem_bjcd_search(sugeoBean.getRem_bjcd_search().substring(0,3));
				}
				if( sugeoBean.getRem_hjcd_search() != null && !"".equals(sugeoBean.getRem_hjcd_search()) ){
					sugeoBean.setRem_hjcd_search(sugeoBean.getRem_hjcd_search().substring(0,3));
				}
				sugeoBean.setSigu_cd(SIGU_CD);
			
				int	currentPage	= Integer.parseInt(ServletRequestUtils.getStringParameter(request, "currentPage", "1"));
				
				// 검색한 데이터 총갯수를 가져온다.
				int	iTotalCnt	= iSugeoService.executeCount(sugeoBean);
				
				// 페이징 처리
				int	rowCol		= pageing.execute(request, iTotalCnt, currentPage, 10);
				
				// 검색한 데이터를 가져온다.
				list	= iSugeoService.executeSearch(sugeoBean, rowCol, rowCol + 9);
				SugeoBean	bean	= new SugeoBean();
				int			size	= list.size();
		
				for(int i = 0	;	i < size	;	i++)
				{
					bean	= (SugeoBean)list.get(i);
					
					
					if ( bean.getRem_date() != null && !"".equals(bean.getRem_date()) && bean.getRem_date().length() > 8 ){
						bean.setRem_date(util.Date_Paste(bean.getRem_date().substring(0,8))+"  "+ bean.getRem_date().substring(8,10)+"시  "+ bean.getRem_date().substring(10,12)+"분" );
					}
					//System.out.println("법정동 ==== " + bean.getRem_bjcd()+"00");
					//System.out.println("행정동 ==== " + bean.getRem_hjcd()+"00");
					bean.setRem_bjcd(getBjhjName(SIDO_CD, SIGU_CD, bean.getRem_bjcd()+"00", bean.getRem_hjcd()+"00"));	// 법정동+행정동이름        	
		        	
				}
				
				request.setAttribute("re_typ", commonCode.executeGapanCode("RE_TYP", null, "선택"));		// 수거물품코드
				request.setAttribute("gu_nm", commonCode.SearchGuName(SIDO_CD, SIGU_CD));	
				request.setAttribute("bjdong_code", commonCode.CommonBJDongCodeSearch(SIDO_CD, SIGU_CD, ""));	//	법정동
				//request.setAttribute("hjdong_code", commonCode.CommonHJDongCodeSearch(SIDO_CD, SIGU_CD, ""));	//	행정동
				request.setAttribute("gd_sta", commonCode.executeGapanCode("GD_STA", null, "선택"));		// 처리상태
		 
				request.setAttribute("rem_date_from", rem_date_from);
				request.setAttribute("rem_date_to", rem_date_to);
				request.setAttribute("rem_mulnm_search", sugeoBean.getRem_mulnm_search());
				request.setAttribute("rem_addr_search", sugeoBean.getRem_addr_search());
				request.setAttribute("rem_nm_search", sugeoBean.getRem_nm_search());
				request.setAttribute("SIDO_CD", SIDO_CD);
				request.setAttribute("currentPage", String.valueOf(currentPage));
				request.setAttribute("totalcnt", String.valueOf(iTotalCnt));
				request.setAttribute("message", message);
			}
		} catch(Exception e){
			System.out.println(e.toString());
		}

		return new ModelAndView("/gapan/sugeo/search", "blist", list);
	}

	
	
	
	// 엑셀변환
	public ModelAndView Excel_Search(HttpServletRequest request,HttpServletResponse response, String message) throws Exception 
	{
		
//		 삭제 세션
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		List		list	= null;

		try{
			if(userId != null)
			{
				// 관리자 데이터를 가져온다.
				UserBean	userBean	= new UserBean();
				try{
					userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				}
				catch (Exception e){
					String errReason = e.toString();
					System.out.println(errReason);
				}
				
				// 시도코드
				String SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				// 시구코드
				String SIGU_CD = userBean.getSIGU_CD();
				
				
				//	현재 년도
				SimpleDateFormat	formatter 	= new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA );
				Calendar 			cal 		= Calendar.getInstance();
				String	today		= formatter.format(cal.getTime());
				cal.add(Calendar.DATE, -6);
				String	beforeDay		= formatter.format(cal.getTime());
				
				
				String 	rem_date_from 		= ServletRequestUtils.getStringParameter(request, "rem_date_from", beforeDay);
				String 	rem_date_to 		= ServletRequestUtils.getStringParameter(request, "rem_date_to", today);
				
				SugeoBean sugeoBean = new SugeoBean();
				bind(request, sugeoBean);
				
				// 날짜 검색이 있을시 셋팅해주기
				if( rem_date_from == null || "".equals(rem_date_from) ){
					sugeoBean.setRem_date_from(util.Date_Cut(sugeoBean.getRem_date_from()));
				}else{
					sugeoBean.setRem_date_from(util.Date_Cut(rem_date_from));
				}
				if( rem_date_to == null || "".equals(rem_date_to) ){
					sugeoBean.setRem_date_to(util.Date_Cut(sugeoBean.getRem_date_to()));
				}else{
					sugeoBean.setRem_date_to(util.Date_Cut(rem_date_to));
				}
				
				if( sugeoBean.getRem_bjcd_search() != null && !"".equals(sugeoBean.getRem_bjcd_search()) ){
					sugeoBean.setRem_bjcd_search(sugeoBean.getRem_bjcd_search().substring(0,3));
				}
				if( sugeoBean.getRem_hjcd_search() != null && !"".equals(sugeoBean.getRem_hjcd_search()) ){
					sugeoBean.setRem_hjcd_search(sugeoBean.getRem_hjcd_search().substring(0,3));
				}
				sugeoBean.setSigu_cd(SIGU_CD);
			
				int	currentPage	= Integer.parseInt(ServletRequestUtils.getStringParameter(request, "currentPage", "1"));
				
				// 검색한 데이터 총갯수를 가져온다.
				int	iTotalCnt	= iSugeoService.executeCount(sugeoBean);
				
				// 페이징 처리
				int	rowCol		= pageing.execute(request, iTotalCnt, currentPage, 10);
				
				// 검색한 데이터를 가져온다.
				list	= iSugeoService.executeSearch(sugeoBean, 1, iTotalCnt);
				SugeoBean	bean	= new SugeoBean();
				int			size	= list.size();
		
				for(int i = 0	;	i < size	;	i++)
				{
					bean	= (SugeoBean)list.get(i);
					
					if ( bean.getRem_date() != null && !"".equals(bean.getRem_date()) && bean.getRem_date().length() > 8 ){
						bean.setRem_date(util.Date_Paste(bean.getRem_date().substring(0,8))+"  "+ bean.getRem_date().substring(8,10)+"시  "+ bean.getRem_date().substring(10,12)+"분" );
					}
					
					//System.out.println("법정동 ==== " + bean.getRem_bjcd()+"00");
					//System.out.println("행정동 ==== " + bean.getRem_hjcd()+"00");
					bean.setRem_bjcd(getBjhjName(SIDO_CD, SIGU_CD, bean.getRem_bjcd()+"00", bean.getRem_hjcd()+"00"));	// 법정동+행정동이름
					
				}
				
				request.setAttribute("re_typ", commonCode.executeGapanCode("RE_TYP", null, "선택"));		// 수거물품코드
				request.setAttribute("gu_nm", commonCode.SearchGuName(SIDO_CD, SIGU_CD));	
				request.setAttribute("bjdong_code", commonCode.CommonBJDongCodeSearch(SIDO_CD, SIGU_CD, ""));	//	법정동
				//request.setAttribute("hjdong_code", commonCode.CommonHJDongCodeSearch(SIDO_CD, SIGU_CD, ""));	//	행정동
				request.setAttribute("gd_sta", commonCode.executeGapanCode("GD_STA", null, "선택"));		// 처리상태
		 
				request.setAttribute("rem_date_from", rem_date_from);
				request.setAttribute("rem_date_to", rem_date_to);
				request.setAttribute("rem_mulnm_search", sugeoBean.getRem_mulnm_search());
				request.setAttribute("rem_addr_search", sugeoBean.getRem_addr_search());
				request.setAttribute("rem_nm_search", sugeoBean.getRem_nm_search());
				request.setAttribute("SIDO_CD", SIDO_CD);
				request.setAttribute("currentPage", String.valueOf(currentPage));
				request.setAttribute("totalcnt", String.valueOf(iTotalCnt));
				request.setAttribute("message", message);
				
				
			}
		} catch(Exception e){
			System.out.println(e.toString());
		}
		
		return new ModelAndView("/gapan/sugeo/excel_search", "blist", list);
	}
	
	
	
	//	신규 등록 페이지
	public ModelAndView	Register(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		return new ModelAndView("/gapan/sugeo/register");
	}
	
	
	// 법정동,행정동코드로 위치 이름 가져오기
	public String getBjhjName(String sidu_cd, String sigu_cd, String bj_cd, String hj_cd)
	{
		String bj_nm = "";
		List returnVal = iSugeoService.getBjhjName(sidu_cd, sigu_cd, bj_cd, hj_cd);
		
		if( returnVal != null && returnVal.size() > 0 ){
			for( int i = 0; i < returnVal.size(); i++ ){
				SugeoBean bean = (SugeoBean) returnVal.get(i);
				bj_nm = bean.getBj_nm();
			}
		}
		
		return bj_nm;		
	}
	
	
	// view 페이지 
	public ModelAndView View(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
//		 삭제 세션
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");

		try{
			if(userId != null)
			{
				String 	mul_no 	= ServletRequestUtils.getStringParameter(request, "mul_no", "");
				String 	message	= ServletRequestUtils.getStringParameter(request, "message", "");
				//System.out.println("view 페이지  mul_no============ " + mul_no);
				
				SugeoBean	sugeoBean	= new SugeoBean();
				bind(request, sugeoBean);
				
				request.setAttribute("mul_no", mul_no);
				request.setAttribute("message", message);
			}
		} catch(Exception e){
			System.out.println(e.toString());
		}
		
		return new ModelAndView("/gapan/sugeo/view");
	}



}