//	2009		Kim Yun Seo

package main.java.jumyong.saewe.web;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.common.util.catUtil.Pageing;
import main.java.common.util.catUtil.Util;
import main.java.common.commonCode.service.CommonCodeService;
import main.java.jumyong.saewe.model.CalculationBean;
import main.java.jumyong.saewe.model.PlaceBean;
import main.java.jumyong.saewe.service.ISaeweService;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;


public class TabSanchul_Control	extends MultiActionController{

	private	ISaeweService		iSaeweService	= null;
//	private	CommonCodeService	commonCode		= null;
	private	Util				util			= new Util();
	private	Pageing				pageing			= new Pageing();
	

	public void setJumyong_saeweService(ISaeweService jumyong_saeweService) 
	{
		this.iSaeweService = jumyong_saeweService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode)
	{
//		this.commonCode 	= commonCode;
	}
	
	
	public ModelAndView 	Sanchul_View(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");					
		List	blist		= new ArrayList();
		
		try{
			if(userId != null){
				String 	ADMIN_NO 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
				String 	SEQ 		= ServletRequestUtils.getStringParameter(request, "SEQ", "");
				
				int		currentPage	= Integer.parseInt(ServletRequestUtils.getStringParameter(request, "currentPage", "1"));
				System.out.println("SEQ="+SEQ);
				//	산출정보의 총 갯수를 가져온다.
				int		iTotalCnt	= iSaeweService.executeSanchulCount(ADMIN_NO,SEQ);
				
				//	페이징 처리
				int		rowCol		= pageing.execute(request, iTotalCnt, currentPage, 2);
				
				//	산출데이터를 가져온다.
				List	list		= iSaeweService.executeSanchulSearch(ADMIN_NO, SEQ,rowCol, rowCol + 1);				
				
				CalculationBean	Bean	= new CalculationBean();
				
				//	리스트 번호가 1인것은 화면에 자료를 출력한다.
				if(list.size()<=0)
					;
				else
				{
					Bean	= (CalculationBean)list.get(0);
					
					//	처음 화면 시작하면 선택한게 없어서 첫번째 데이터를 선택한걸로 한다.
					if(SEQ.trim().equals(""))
					{
						request.setAttribute("ADMIN_NO", Bean.getADMIN_NO());
						request.setAttribute("SEQ", Bean.getSEQ());
					}
					else
					{
						request.setAttribute("ADMIN_NO", ADMIN_NO);
						request.setAttribute("SEQ", SEQ);
					}
					
					for(int i = 0	;	i < list.size()	;	i++)
					{
						Bean	= (CalculationBean)list.get(i);
										
						//	천단위마다 콤마를 찍어준다.
						Bean.setPRICE(util.Comma_Paste(Bean.getPRICE()));
						Bean.setSUM_YEAR(util.Comma_Paste(Bean.getSUM_YEAR()));
						Bean.setSUM_ADJUST(util.Comma_Paste(Bean.getSUM_ADJUST()));
						
			        	if(Bean.getFROMDATE() != null	||	Bean.getFROMDATE().trim().equals(""))
			        		Bean.setSANCHUL_DATE(util.Date_Paste(Bean.getFROMDATE()) + " ~ " + util.Date_Paste(Bean.getTODATE()));
			        	
			        	// 일시점용일때 산출기간 
			        	if( Bean.getSECTION() != null && "2".equals(Bean.getSECTION())){
			        		Bean.setSANCHUL_DATE(Bean.getPARTLY_PERIOD()+" ("+ Bean.getPERIOD() +"일)");
			        	}
			        	
						blist.add(i, Bean);
					}
				}
			}
		}catch(Exception e){
			System.out.println("error:"+e.toString());
		}	
		return new ModelAndView("/jumyong/saewe/tab/sanchul_view", "blist", blist);
	}
	
	//	산출정보를 보여준다.
	public ModelAndView 	SanchulInfo_View(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		String 	ADMIN_NO 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
		String 	SEQ 		= ServletRequestUtils.getStringParameter(request, "SEQ", "");

		//	산출 정보의 데이터를 가져온다.
		List	list	= iSaeweService.executeSanchulInfo_View(ADMIN_NO, SEQ);
		
		CalculationBean	Bean	= new CalculationBean();
		
		//	XML로 만들어서 보낸다.
		String	Xml	= "<?xml version=\"1.0\" encoding=\"euc-kr\"?>";
		Xml	+= "<lists>";
		
		for(int	i = 0	;	i < list.size()	;	i++)
		{
			Bean	= (CalculationBean)list.get(i);
			
		//	Xml	+= "<list>";
			Xml	+= util.XmlNodeMake("ADMIN_NO", Bean.getADMIN_NO());
			Xml	+= util.XmlNodeMake("YEAR", Bean.getYEAR() + " 년");
			Xml	+= util.XmlNodeMake("SEQ", Bean.getSEQ());
			Xml	+= util.XmlNodeMake("PRICE", util.Comma_Paste(Bean.getPRICE()) + " 원");				//	공시지가
			Xml	+= util.XmlNodeMake("AREA_AFTER", Bean.getAREA_AFTER() + " ㎡ ");					//	점용면적
			Xml	+= util.XmlNodeMake("RATE", Bean.getRATE());
			Xml	+= util.XmlNodeMake("SUM_LASTYEAR", util.Comma_Paste(Bean.getSUM_LASTYEAR()) + " 원");	//	작년도 점용료
			Xml	+= util.XmlNodeMake("SUM_YEAR", util.Comma_Paste(Bean.getSUM_YEAR()) + " 원");			//	현년도 점용료
			Xml	+= util.XmlNodeMake("SUM_ADJUST", util.Comma_Paste(Bean.getSUM_ADJUST()) + " 원");		//	조정 점용료
			Xml	+= util.XmlNodeMake("FROMDATE", util.Date_Paste(Bean.getFROMDATE()));	//	산출기간
			Xml	+= util.XmlNodeMake("TODATE", util.Date_Paste(Bean.getTODATE()));		//	산출기간
			Xml	+= util.XmlNodeMake("FORM_ADJUST", Bean.getFORM_ADJUST());
			Xml	+= util.XmlNodeMake("FORM", Bean.getFORM());
			Xml	+= util.XmlNodeMake("ADJUSTMENT", Bean.getADJUSTMENT());			//	조정계수
			Xml	+= util.XmlNodeMake("PERIOD", Bean.getPERIOD());					//	일시일때 기간
			Xml	+= util.XmlNodeMake("PARTLY_PERIOD", Bean.getPARTLY_PERIOD());
			Xml	+= util.XmlNodeMake("TOTAL_PERIOD", Bean.getTOTAL_PERIOD());
			Xml	+= util.XmlNodeMake("SECTION", Bean.getSECTION());					//  점용구분

			if(Bean.getFROMDATE().length() >= 6)
				Xml	+= util.XmlNodeMake("SANCHUL_DATE", util.Date_Paste(Bean.getFROMDATE()) + " ~ " + util.Date_Paste(Bean.getTODATE()));
			else
				Xml	+= util.XmlNodeMake("SANCHUL_DATE", "");
					
		//	Xml	+= "</list>";
			
			System.out.println("getSECTION:" + Bean.getSECTION() + ";");
		}
		
		Xml	+= "</lists>";
		
        response.setContentType("text/html;charset=utf-8");
        response.setHeader("Cache-Control", "no-cache");
        response.getWriter().write(Xml);
        
		return null;
	}
}
