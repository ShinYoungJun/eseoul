
package main.java.rojum.saewe.web;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.common.util.catUtil.Pageing;
import main.java.common.util.catUtil.Util;
import main.java.common.commonCode.service.CommonCodeService;
import main.java.rojum.saewe.model.CalculationBean;
import main.java.rojum.saewe.service.ISaeweService;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;


public class TabSanchul_Control	extends MultiActionController{

	private	ISaeweService		iSaeweService	= null;
//	private	CommonCodeService	commonCode		= null;
	private	Util				util			= new Util();
	private	Pageing				pageing			= new Pageing();
	

	public void setRojum_saeweService(ISaeweService rojum_saeweService) 
	{
		this.iSaeweService = rojum_saeweService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode)
	{
//		this.commonCode 	= commonCode;
	}
	
	
	public ModelAndView 	Sanchul_View(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
//		 ���� ����
		HttpSession session = request.getSession();
		String userId	= (String)session.getAttribute("sessionUserId");
		List	blist		= null;

		try{
			if(userId != null)
			{
		
				String 	ADMIN_NO 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
				String 	SEQ 		= ServletRequestUtils.getStringParameter(request, "SEQ", "");
				
				
				int		currentPage	= Integer.parseInt(ServletRequestUtils.getStringParameter(request, "currentPage", "1"));
				System.out.println("SEQ="+SEQ);
				//	���������� �� ������ �����´�.
				int		iTotalCnt	= iSaeweService.executeSanchulCount(ADMIN_NO,SEQ);
				
				//	����¡ ó��
				int		rowCol		= pageing.execute(request, iTotalCnt, currentPage, 2);
				
				//	���ⵥ���͸� �����´�.
				List	list		= iSaeweService.executeSanchulSearch(ADMIN_NO, SEQ, rowCol, rowCol + 1);
				blist		= new ArrayList();
				
				CalculationBean	Bean	= new CalculationBean();
				
				//	����Ʈ ��ȣ�� 1�ΰ��� ȭ�鿡 �ڷḦ ����Ѵ�.
				if(list.size()<=0)
					;
				else
				{
					Bean	= (CalculationBean)list.get(0);
					
					//	ó�� ȭ�� �����ϸ� �����Ѱ� ��� ù��° �����͸� �����Ѱɷ� �Ѵ�.
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
										
						//	õ�������� �޸��� ����ش�.
						Bean.setPRICE(util.Comma_Paste(Bean.getPRICE()));
						Bean.setSUM_YEAR(util.Comma_Paste(Bean.getSUM_YEAR()));
						Bean.setSUM_ADJUST(util.Comma_Paste(Bean.getSUM_ADJUST()));
						
			        	if(Bean.getFROMDATE() != null	||	Bean.getFROMDATE().trim().equals(""))
			        		Bean.setSANCHUL_DATE(util.Date_Paste(Bean.getFROMDATE()) + " ~ " + util.Date_Paste(Bean.getTODATE()));
			        	
						blist.add(i, Bean);
					}
				}
			}
		} catch(Exception e){
			System.out.println(e.toString());
		}
		
		return new ModelAndView("/rojum/saewe/tab/sanchul_view", "blist", blist);
	}
	
	//	���������� �����ش�.
	public ModelAndView 	SanchulInfo_View(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		String 	ADMIN_NO 	= ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
		String 	SEQ 		= ServletRequestUtils.getStringParameter(request, "SEQ", "");

		//	���� ������ �����͸� �����´�.
		List	list	= iSaeweService.executeSanchulInfo_View(ADMIN_NO, SEQ);
		
		CalculationBean	Bean	= new CalculationBean();
		
		//	XML�� ���� ������.
		String	Xml	= "<?xml version=\"1.0\" encoding=\"euc-kr\"?>";
		Xml	+= "<lists>";
		
		for(int	i = 0	;	i < list.size()	;	i++)
		{
			Bean	= (CalculationBean)list.get(i);
			
		//	Xml	+= "<list>";
			Xml	+= util.XmlNodeMake("ADMIN_NO", Bean.getADMIN_NO());
			Xml	+= util.XmlNodeMake("YEAR", Bean.getYEAR() + " ��");
			Xml	+= util.XmlNodeMake("SEQ", Bean.getSEQ());
			Xml	+= util.XmlNodeMake("PRICE", util.Comma_Paste(Bean.getPRICE()) + " ��");				//	��������
			Xml	+= util.XmlNodeMake("AREA_AFTER", Bean.getAREA_AFTER() + " �� ");					//	�������
			Xml	+= util.XmlNodeMake("RATE", Bean.getRATE());
			Xml	+= util.XmlNodeMake("SUM_LASTYEAR", util.Comma_Paste(Bean.getSUM_LASTYEAR()) + " ��");	//	�۳⵵ �����
			Xml	+= util.XmlNodeMake("SUM_YEAR", util.Comma_Paste(Bean.getSUM_YEAR()) + " ��");			//	���⵵ �����
			Xml	+= util.XmlNodeMake("SUM_ADJUST", util.Comma_Paste(Bean.getSUM_ADJUST()) + " ��");		//	���� �����
			Xml	+= util.XmlNodeMake("FROMDATE", util.Date_Paste(Bean.getFROMDATE()));	//	����Ⱓ
			Xml	+= util.XmlNodeMake("TODATE", util.Date_Paste(Bean.getTODATE()));		//	����Ⱓ
			Xml	+= util.XmlNodeMake("FORM_ADJUST", Bean.getFORM_ADJUST());
			Xml	+= util.XmlNodeMake("FORM", Bean.getFORM());
			Xml	+= util.XmlNodeMake("ADJUSTMENT", Bean.getADJUSTMENT());			//	�������

			if(Bean.getFROMDATE().length() >= 6)
				Xml	+= util.XmlNodeMake("SANCHUL_DATE", util.Date_Paste(Bean.getFROMDATE()) + " ~ " + util.Date_Paste(Bean.getTODATE()));
			else
				Xml	+= util.XmlNodeMake("SANCHUL_DATE", "");
					
		//	Xml	+= "</list>";
			
		//	System.out.println(":" + Bean.getFROMDATE() + ";");
		}
		
		Xml	+= "</lists>";
		
        response.setContentType("text/html;charset=utf-8");
        response.setHeader("Cache-Control", "no-cache");
        response.getWriter().write(Xml);
        
		return null;
	}
}