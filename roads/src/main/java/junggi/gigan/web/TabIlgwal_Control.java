//	2009		Kim Yun Seo
//	기간 연장처리 - 일괄처리 리스트
package main.java.junggi.gigan.web;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.java.common.util.catUtil.Pageing;
import main.java.common.util.catUtil.Util;
import main.java.common.commonCode.model.UserBean;
import main.java.common.commonCode.service.CommonCodeService;
import main.java.junggi.gigan.model.AppealBean;
import main.java.junggi.gigan.model.GiganBean;
import main.java.junggi.gigan.model.GiganSearchBean;
import main.java.junggi.gigan.model.GiyeonBean;
import main.java.junggi.gigan.service.IGiganService;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class TabIlgwal_Control	extends MultiActionController{

	private	IGiganService		iGiganervice	= null;
	private	CommonCodeService	commonCode		= null;
	private	Util				util			= new Util();
	private	Pageing				pageing			= new Pageing();
	

	public void setJunggi_giganService(IGiganService junggi_giganService) 
	{
		this.iGiganervice = junggi_giganService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode)
	{
		this.commonCode 	= commonCode;
	}
	
	//	연장조회에서 검색한 리스트를 출력한다.
	public ModelAndView 	Ilgwal_View(HttpServletRequest request, HttpServletResponse response) throws Exception 
	{
		//	세션에서 시도 코드를 가져온다.
		String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
		
		//	관리자 데이터를 가져온다.
		UserBean	userBean	= new UserBean();
		userBean	= commonCode.executeUserSearch(util.getSessionID(request, "sessionUserId"));
		
		String 	GIGAN1 		= ServletRequestUtils.getStringParameter(request, "GIGAN1", "");
		String 	GIGAN2 		= ServletRequestUtils.getStringParameter(request, "GIGAN2", "");
	//	String 	ADMIN_NO 	= ServletRequestUtils.getStringParameter(request, "ADMINNO", "");
		
	//	System.out.println("!Ilgwal_View!!!!!! " + GIGAN1 + ", " + GIGAN2);
		
	//	System.out.println(ADMIN_NO);
		GiganSearchBean	giganSearchBean	= new GiganSearchBean();
		
		bind(request, giganSearchBean);
		
		giganSearchBean.setSIDO(SIDO_CD);
		giganSearchBean.setSIGUNGU(userBean.getSIGU_CD());
		
		giganSearchBean.setGIGAN1(GIGAN1);
		giganSearchBean.setGIGAN2(GIGAN2);
		
		int	 	currentPage	= Integer.parseInt(ServletRequestUtils.getStringParameter(request, "currentPage", "1"));
		int		iTotalCnt	= iGiganervice.executeCount(giganSearchBean);
		int		rowCol		= pageing.execute(request, iTotalCnt, currentPage, 10);
		
		List		list	= iGiganervice.executeSearch(giganSearchBean, rowCol, rowCol + 9);
	//	List		blist	= new ArrayList();
		GiganBean	Bean	= new GiganBean();
		int			size	= list.size();
		String		jumyongji	= "";
		
		for(int i = 0	;	i < size	;	i++)
		{
			Bean	= (GiganBean)list.get(i);
			
			Bean.setTYPE(commonCode.executeSearchCommonCode("use_type", Bean.getTYPE()));	//	점용종류
			
			//	점용지
			jumyongji	= commonCode.executeSearchBJDongCode("서울", "강남구", Bean.getBJ_CD());
			
			if(Bean.getSPC_CD()	!= null)
				if(Bean.getSPC_CD().trim().equals("2"))
					jumyongji += " 산";
			
			if(Bean.getBONBUN()	!= null)
				if(!Bean.getBONBUN().trim().equals(""))
					jumyongji	+= " " + Bean.getBONBUN();
			
			if(Bean.getBUBUN()	!= null)
				if(!Bean.getBUBUN().trim().equals(""))
					jumyongji	+= "-" + Bean.getBUBUN();
			
			Bean.setJUMYONGJI(jumyongji);
			
			//	점용목적 KIND
			if(Bean.getPURPOSE_KIND()	!= null)
				if(!Bean.getPURPOSE_KIND().trim().equals(""))
					Bean.setPURPOSE_KIND("(" + Bean.getPURPOSE_KIND() + ")");
			
			Bean.setGIGAN(util.Date_Paste(Bean.getMUL_FROMDATE()) + " ~ " + util.Date_Paste(Bean.getMUL_TODATE()));
		}

		request.setAttribute("GIGAN1", GIGAN1);
		request.setAttribute("GIGAN2", GIGAN2);
		
		return new ModelAndView("/junggi/gigan/tab/ilgwal_view", "blist", list);
	}
}
