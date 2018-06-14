//	2009		Kim Yun Seo

package main.java.jumyong.minwon.web;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import main.java.jumyong.minwon.model.Admin_BaseBean;
import main.java.jumyong.minwon.model.AppealBean;
import main.java.jumyong.minwon.model.JumjiSearchBean;
import main.java.jumyong.minwon.model.PlaceBean;
import main.java.jumyong.minwon.service.IMinwonService;
import main.java.common.util.catUtil.Pageing;
import main.java.common.util.catUtil.Util;
import main.java.common.commonCode.model.UserBean;
import main.java.common.commonCode.service.CommonCodeService;


public class TabJumji_Control	extends MultiActionController {

	private	IMinwonService		iMinwonService	= null;
	private	CommonCodeService	commonCode		= null;
	private	Util				util			= new Util();
	private	Pageing				pageing			= new Pageing();
	
	
	public void setJumyong_minwonService(IMinwonService jumyong_minwonService)
	{
		this.iMinwonService = jumyong_minwonService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode) 
	{
		this.commonCode 	= commonCode;
	}
	
	//	점용지 조회 화면을 출력한다.
	public	ModelAndView 	Search(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		// 삭제 세션
		HttpSession session = request.getSession();
		
		String 		userId	= (String)session.getAttribute("sessionUserId");
		List	list	=	null;

		try{
			if(userId != null)
			{
				String 	FIRST 	= ServletRequestUtils.getStringParameter(request, "FIRST", "");
				
				//	properties 파일에 있는 시도 코드를 가져온다.
				String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				
				//	관리자 데이터를 가져온다.
				UserBean	userBean	= new UserBean();
				userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
				
				//	관리자 데이터가 있으면 "GU_NM" 을  "SIGUNGU" 변경한후  request한다.
				if(userBean	!= null)
				{
					request.setAttribute("SIGUNGU", userBean.getGU_NM());
				}
				
				//	현재 페이지를 가져온다.
				int	 	currentPage	= Integer.parseInt(ServletRequestUtils.getStringParameter(request, "currentPage", "1"));
				
				JumjiSearchBean 	Bean	= new JumjiSearchBean();
				list	= new ArrayList();
				
				//	검색조건 을 가져온다.
				String 	ADMIN_NO 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "").trim();
				String 	NAME	 	= ServletRequestUtils.getStringParameter(request, "NAME", "").trim();
				String 	SSN1 		= ServletRequestUtils.getStringParameter(request, "SSN1", "").trim();
				String 	SSN2 		= ServletRequestUtils.getStringParameter(request, "SSN2", "").trim();
				String 	BJ_CD 		= ServletRequestUtils.getStringParameter(request, "BJ_CD", "");
				String 	HJ_CD 		= ServletRequestUtils.getStringParameter(request, "HJ_CD", "");
				String 	SPC_CD 		= ServletRequestUtils.getStringParameter(request, "SPC_CD", "");
				String 	BONBUN 		= ServletRequestUtils.getStringParameter(request, "BONBUN", "").trim();
				String 	BUBUN 		= ServletRequestUtils.getStringParameter(request, "BUBUN", "").trim();
				String 	TONG 		= ServletRequestUtils.getStringParameter(request, "TONG", "").trim();
				String 	BAN 		= ServletRequestUtils.getStringParameter(request, "BAN", "").trim();
				
				Bean.setSIDO(SIDO_CD);
				Bean.setSIGUNGU(userBean.getSIGU_CD());
				Bean.setADMIN_NO(ADMIN_NO);
				Bean.setNAME(NAME);
				Bean.setSSN(SSN1 + SSN2);
				Bean.setBJ_CD(BJ_CD);
				Bean.setHJ_CD(HJ_CD);
				Bean.setSPC_CD(SPC_CD);
				Bean.setBONBUN(BONBUN);
				Bean.setBUBUN(BUBUN);
				Bean.setTONG(TONG);
				Bean.setBAN(BAN);
				
				int	totalcnt	= 0;
				int	rowCol		= 0;
				FIRST = "?";
				if(FIRST != "")
				{
					if(!(NAME.equals("")&&SSN1.equals("")&&SSN2.equals(""))){
						//	총 몇건인지 확인한다.
						totalcnt	= iMinwonService.executeSearch_JumjiCount(Bean);
						
						//	현재 페이지 건수를 가져온다.
						rowCol		= pageing.execute(request, totalcnt, currentPage, 10);
						
						//	조회한 데이터를 가져온다.
						list	= iMinwonService.executeSearch_Jumji(Bean, rowCol, rowCol + 9);
					}
				}
				else
					request.setAttribute("FIRST", "1");
				
				int		size	= list.size();
				
				//	페이징 처리
				pageing.execute(request, totalcnt, currentPage, 10);
				
				//	가져온 데이터를 수정한다.
				for(int i = 0	;	i < size	; 	i++)
				{
					Bean	= (JumjiSearchBean)list.get(i);
					
					Bean.setTYPE(commonCode.executeSearchCommonCode("use_type", Bean.getTYPE()));	//	점용종류	
					Bean.setBJ_CD(commonCode.executeSearchBJDongCode(Bean.getSIDO(), Bean.getSIGUNGU(), Bean.getBJ_CD()));
					Bean.setHJ_CD(commonCode.executeSearchHJDongCode(Bean.getSIDO(), Bean.getSIGUNGU(), Bean.getHJ_CD()));
					Bean.setSPC_CD(commonCode.executeSearchCommonCode("MUL_SPC_CD", Bean.getSPC_CD()));
					
					//	점용지 지번
					if(Bean.getBUBUN()	!= null)
					{
						if(!Bean.getBUBUN().trim().equals(""))
							Bean.setBUBUN("-" + Bean.getBUBUN() + "번지");
						else	Bean.setBONBUN(Bean.getBONBUN() + "번지");
					}
					else
						Bean.setBONBUN(Bean.getBONBUN() + "번지");
					
					if(Bean.getBAN()	!= null)
						if(!Bean.getBAN().trim().equals(""))
							Bean.setBAN("/" + Bean.getBAN());
					
					Bean.setSIGUNGU(commonCode.SearchGuName(Bean.getSIDO(), Bean.getSIGUNGU()));	//	시 이름입력
				}
				
				request.setAttribute("totalcnt", String.valueOf(totalcnt));
				
				request.setAttribute("bjdong_code", commonCode.CommonBJDongCodeSearch(SIDO_CD, userBean.getSIGU_CD(), BJ_CD));
				request.setAttribute("hjdong_code", commonCode.CommonHJDongCodeSearch(SIDO_CD, userBean.getSIGU_CD(), HJ_CD));
				request.setAttribute("mul_spc_cd", commonCode.executeCommonCode("MUL_SPC_CD", SPC_CD, "전체"));
				
				request.setAttribute("ADMIN_NO", ADMIN_NO);
				request.setAttribute("NAME", NAME);
				request.setAttribute("SSN1", SSN1);
				request.setAttribute("SSN2", SSN2);
				
				request.setAttribute("BJ_CD", BJ_CD);
				request.setAttribute("HJ_CD", HJ_CD);
				request.setAttribute("SPC_CD", SPC_CD);
				request.setAttribute("BONBUN", BONBUN);
				request.setAttribute("BUBUN", BUBUN);
				request.setAttribute("TONG", TONG);
				request.setAttribute("BAN", BAN);
				
				request.setAttribute("currentPage", String.valueOf(currentPage));
			}
		} catch(Exception e){
			System.out.println(e.toString());
		}
		
		return new ModelAndView("/jumyong/minwon/tab/jumji_search", "blist", list);
	}
	
}
