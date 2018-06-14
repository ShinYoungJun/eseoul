
package main.java.facility.saewe.web;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.common.commonCode.service.CommonCodeService;
import main.java.common.util.catUtil.Pageing;
import main.java.common.util.catUtil.Util;
import main.java.facility.saewe.model.CalculationBean;
import main.java.facility.saewe.service.ISaeweService;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;


public class TabSanchul_Control	extends MultiActionController{

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
	
	public ModelAndView 	Sanchul_View(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		HttpSession session 	= request.getSession();
		String 		userId		= (String)session.getAttribute("sessionUserId");		
		List		list		= null;
		List		blist		= null;
		
		try{
			if(userId != null){
				String 	guCode 	= ServletRequestUtils.getStringParameter(request, "GU_CODE", "");
				String 	corpCd 	= ServletRequestUtils.getStringParameter(request, "CORP_CD", "");				
				String 	seq 	= ServletRequestUtils.getStringParameter(request, "SEQ", "");
				String admin_no =ServletRequestUtils.getStringParameter(request, "ADMIN_NO", "");
				
				int		currentPage	= Integer.parseInt(ServletRequestUtils.getStringParameter(request, "currentPage", "1"));
				
				//	���������� �� ������ �����´�.
				int		iTotalCnt	= iSaeweService.executeSanchulCount(guCode,corpCd,seq);
				
				//	����¡ ó��
				int		rowCol		= pageing.execute(request, iTotalCnt, currentPage, 2);
				
				//	���ⵥ���͸� �����´�.
				list		= iSaeweService.executeSanchulSearch(guCode,corpCd,seq,rowCol, rowCol + 1);
				blist		= new ArrayList();
				
				CalculationBean	Bean	= new CalculationBean();
		
				//	����Ʈ ��ȣ�� 1�ΰ��� ȭ�鿡 �ڷḦ ����Ѵ�.
				if(list.size()<=0)
					;
				else
				{
					Bean	= (CalculationBean)list.get(0);
					
					//	ó�� ȭ�� �����ϸ� �����Ѱ� ��� ù��° �����͸� �����Ѱɷ� �Ѵ�.
					if(guCode.trim().equals(""))
					{
						request.setAttribute("GU_CODE", Bean.getGU_CODE());	
						request.setAttribute("CORP_CD", Bean.getCORP_CD());
						
						request.setAttribute("SEQ", Bean.getSEQ());
					}
					else
					{
						request.setAttribute("GU_CODE", guCode);
						request.setAttribute("CORP_CD", corpCd);
						
						request.setAttribute("SEQ", seq);
					}
					
					request.setAttribute("ADMIN_NO", admin_no);
					
					for(int i = 0	;	i < list.size()	;	i++)
					{
						Bean	= (CalculationBean)list.get(i);
						System.out.println("-----------------------2010-02-03");
						System.out.println("vat : "+Bean.getVAT());
						System.out.println("-----------------------2010-02-03");
						System.out.println("Bean.getTAX_SET()="+Bean.getTAX_SET());
						System.out.println("����="+commonCode.executeSearchCommonCode("taxation_section", Bean.getTAX_SET()));
						Bean.setUSE_SECTION(commonCode.executeSearchCommonCode("taxation_part", Bean.getUSE_SECTION().trim()));	//��������
						Bean.setTAX_SET(commonCode.executeSearchCommonCode("taxation_section", Bean.getTAX_SET().trim()));		//���Ա���
						//	õ�������� �޸��� ����ش�.
						Bean.setSUM(util.Comma_Paste(Bean.getSUM()));
						Bean.setSUM_ADJUST(util.Comma_Paste(Bean.getSUM_ADJUST()));
						
			        	if(Bean.getFROMDATE() != null	||	Bean.getFROMDATE().trim().equals(""))
			        		Bean.setSANCHUL_DATE(util.Date_Paste(Bean.getFROMDATE()) + " ~ " + util.Date_Paste(Bean.getTODATE()));
			        	
						blist.add(i, Bean);
					}
				}
			}
		}catch(Exception e){
			System.out.println(e.toString());
		}	
		 
		return new ModelAndView("/facility/saewe/tab/sanchul_view", "blist", blist);
	}
	
	//	���������� �����ش�.
	public ModelAndView 	SanchulInfo_View(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		String 	guCode 	= ServletRequestUtils.getStringParameter(request, "GU_CODE", "");
		String 	corpCd 	= ServletRequestUtils.getStringParameter(request, "CORP_CD", "");
		String 	requestNo 	= ServletRequestUtils.getStringParameter(request, "REQUEST_NO", "");
		String 	seq 	= ServletRequestUtils.getStringParameter(request, "SEQ", "");
	
		int a = 10;
		String s= Integer.toString(a);
		//	���� ������ �����͸� �����´�.
		List	list	= iSaeweService.executeSanchulInfo_View(guCode,corpCd,seq);
		
		CalculationBean	Bean	= new CalculationBean();
		
		//	XML�� ���� ������.
		String	Xml	= "<?xml version=\"1.0\" encoding=\"euc-kr\"?>";
		Xml	+= "<lists>";
		
		for(int	i = 0	;	i < list.size()	;	i++)
		{
			Bean	= (CalculationBean)list.get(i);
		
			Xml	+= util.XmlNodeMake("GU_CODE", Bean.getGU_CODE());
			Xml	+= util.XmlNodeMake("CORP_CD", Bean.getCORP_CD());			
			Xml	+= util.XmlNodeMake("YEAR", Bean.getYEAR() + " ��");
			Xml	+= util.XmlNodeMake("SUM_ADJUST", util.Comma_Paste(Bean.getSUM_ADJUST()) + " ��");		//	���� �����
			Xml	+= util.XmlNodeMake("SUM", util.Comma_Paste(Bean.getSUM()) + " ��");		//	�ΰ� �����
			Xml	+= util.XmlNodeMake("FROMDATE", util.Date_Paste(Bean.getFROMDATE()));	//	����Ⱓ
			Xml	+= util.XmlNodeMake("TODATE", util.Date_Paste(Bean.getTODATE()));		//	����Ⱓ
			Xml	+= util.XmlNodeMake("USE_SECTION", commonCode.executeSearchCommonCode("taxation_part", Bean.getUSE_SECTION().trim()));	//	��������
			Xml	+= util.XmlNodeMake("TAX_SET", commonCode.executeSearchCommonCode("taxation_section", Bean.getTAX_SET().trim()));		//	���Ա���
			Xml	+= util.XmlNodeMake("FORM_ADJUST", Bean.getFORM_ADJUST());
			Xml += util.XmlNodeMake("VAT", util.Comma_Paste(Bean.getVAT())+" ��");
			
			System.out.println("--------------------------------------2010-02-03");
			System.out.println("vat : "+Bean.getVAT());
			System.out.println("sum : "+Bean.getSUM());
			System.out.println("--------------------------------------2010-02-03");

			if(Bean.getFROMDATE().length() >= 6)
				Xml	+= util.XmlNodeMake("SANCHUL_DATE", util.Date_Paste(Bean.getFROMDATE()) + " ~ " + util.Date_Paste(Bean.getTODATE()));
			else
				Xml	+= util.XmlNodeMake("SANCHUL_DATE", "");
					
		}
		
		Xml	+= "</lists>";
		
        response.setContentType("text/html;charset=utf-8");
        response.setHeader("Cache-Control", "no-cache");
        response.getWriter().write(Xml);
        
		return null;
	}
}
