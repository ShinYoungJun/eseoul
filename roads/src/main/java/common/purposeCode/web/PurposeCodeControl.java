//	2009		Kim Yun Seo

package main.java.common.purposeCode.web;

//import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.java.common.purposeCode.model.PurposeCodeBean;
import main.java.common.purposeCode.model.PurposeSebuCodeBean;
import main.java.common.purposeCode.service.IPurposeCodeService;

import org.apache.commons.lang.StringEscapeUtils;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;


public class PurposeCodeControl	extends MultiActionController{

	private	IPurposeCodeService		iPurposeCodeService	= null;
	
	public void setPurposeCodeService(IPurposeCodeService purposeCodeService)
	{
		this.iPurposeCodeService = purposeCodeService;
	}
	
	public	ModelAndView	PurposeCode(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		String 	code 		= ServletRequestUtils.getStringParameter(request, "code", "");
        String  SectionCode	= ServletRequestUtils.getStringParameter(request, "SectionCode", "");
        
		//System.out.println("PurposeCode : " + SectionCode);
		
		if(SectionCode	== null)						return	null;
		else if(SectionCode.trim().equals(""))			return	null;
		
		List	Purpose_code	= iPurposeCodeService.executePurposeCodeList(SectionCode, code);
		
		PurposeCodeBean	Bean	= new PurposeCodeBean();
		
		
		String	Xml	= "<?xml version=\"1.0\" encoding=\"euc-kr\"?>";
		Xml	+= "<lists>";
		
		for(int	i = 0	;	i < Purpose_code.size()	;	i++)
		{
			Bean	= (PurposeCodeBean)Purpose_code.get(i);
			
			Xml	+= "<list>";
			Xml	+= XmlNodeMake("MOMEY", Bean.getMOMEY());
			Xml	+= XmlNodeMake("YOYUL", Bean.getYOYUL());
			Xml	+= XmlNodeMake("CHECK_YN", Bean.getCHECK_YN());
			Xml	+= XmlNodeMake("DANWII", Bean.getDANWII());
			Xml	+= XmlNodeMake("GIGAN", Bean.getGIGAN());
			Xml	+= "</list>";
		}
		
		Xml	+= "</lists>";
		
        response.setContentType("text/html;charset=euc-kr");
        response.setHeader("Cache-Control", "no-cache");
        response.getWriter().write(Xml);
        
    //    System.out.println(Xml);

		return null;
	}	

	public	ModelAndView	PurposeClassCode(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
        String  SectionCode	= ServletRequestUtils.getStringParameter(request, "SectionCode", "");
        
        //System.out.println("PurposeClassCode : " + SectionCode);
        
        if(SectionCode	== null)						return	null;
		else if(SectionCode.trim().equals(""))			return	null;
		
		List	class_code	= iPurposeCodeService.executePurposeClassCodeList(SectionCode);
		
		PurposeCodeBean	Bean	= new PurposeCodeBean();
			
		String	Xml	= "<?xml version=\"1.0\" encoding=\"euc-kr\"?>";
		Xml	+= "<select>";
		
		for(int	i = 0	;	i < class_code.size()	;	i++)
		{
			Bean	= (PurposeCodeBean)class_code.get(i);
			
		//	Xml	+= "<option label='" + Bean.getCLASS_NM() + "' value='" + Bean.getCLASS_CD() + "'/>";
			Xml	+= XmlNodeMake2(Bean.getCLASS_NM(), Bean.getCLASS_CD());
		}
		
		Xml	+= "</select>";

        response.setContentType("text/html;charset=euc-kr");
        response.setHeader("Cache-Control", "no-cache");
        response.getWriter().write(Xml);
        

		return null;
	}
	
	public	ModelAndView	PurposeSortCode(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		String 	ClassCode 	= ServletRequestUtils.getStringParameter(request, "ClassCode", "");
        String  SectionCode = ServletRequestUtils.getStringParameter(request, "SectionCode", "");
        
		//System.out.println("PurposeSortCode : " + SectionCode);
		
		if(SectionCode	== null)						return	null;
		else if(SectionCode.trim().equals(""))			return	null;
		
		List	sort_code	= iPurposeCodeService.executePurposeSortCodeList(SectionCode, ClassCode);
		
		PurposeCodeBean	Bean	= new PurposeCodeBean();
		
		
		String	Xml	= "<?xml version=\"1.0\" encoding=\"euc-kr\"?>";
		Xml	+= "<select>";
		
		for(int	i = 0	;	i < sort_code.size()	;	i++)
		{
			Bean	= (PurposeCodeBean)sort_code.get(i);
			
		//	Xml	+= "<option label='" + Bean.getSORT_NM() + "' value='" + Bean.getSORT_CD() + "'/>";
			Xml	+= XmlNodeMake2(Bean.getSORT_NM(), Bean.getSORT_CD());
		}
		
		Xml	+= "</select>";

        response.setContentType("text/html;charset=euc-kr");
        response.setHeader("Cache-Control", "no-cache");
        response.getWriter().write(Xml);

		return null;	
	}
	
	public	ModelAndView	PurposeKindCode(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		String 	ClassCode 	= ServletRequestUtils.getStringParameter(request, "ClassCode", "");
		String 	SortCode 	= ServletRequestUtils.getStringParameter(request, "SortCode", "");
        String  SectionCode = ServletRequestUtils.getStringParameter(request, "SectionCode", "");
        
		//System.out.println("PurposeKindCode : " + SectionCode);
		
        if(SectionCode	== null)						return	null;
		else if(SectionCode.trim().equals(""))			return	null;
		
		List	kind_code	= iPurposeCodeService.executePurposeKindCodeList(SectionCode, ClassCode, SortCode);
		
		PurposeCodeBean	Bean	= new PurposeCodeBean();
		
		
		String	Xml	= "<?xml version=\"1.0\" encoding=\"euc-kr\"?>";
		Xml	+= "<select>";
		
		for(int	i = 0	;	i < kind_code.size()	;	i++)
		{
			Bean	= (PurposeCodeBean)kind_code.get(i);
			
		//	Xml	+= "<option label='" + Bean.getKIND_NM() + "' value='" + Bean.getKIND_CD() + "'/>";
			Xml	+= XmlNodeMake2(Bean.getKIND_NM(), Bean.getKIND_CD());
		}
		
		Xml	+= "</select>";

        response.setContentType("text/html;charset=euc-kr");
        response.setHeader("Cache-Control", "no-cache");
        response.getWriter().write(Xml);

		return null;	
	}
	
	
	
	//	상세시설물
	public	String	PurposeSebuCode(HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		String 	CODE 	= ServletRequestUtils.getStringParameter(request, "CODE", "");
		
		if(CODE	== null)
			return	null;
		else if(CODE.trim().equals(""))
			return	null;
		
		List	kind_code	= iPurposeCodeService.executePurposeSebuCode(CODE);
		
		PurposeSebuCodeBean	Bean	= new PurposeSebuCodeBean();
		
		
		String	Xml	= "<?xml version=\"1.0\" encoding=\"euc-kr\"?>";
		Xml	+= "<select>";
		
		for(int	i = 0	;	i < kind_code.size()	;	i++)
		{
			Bean	= (PurposeSebuCodeBean)kind_code.get(i);
			
			Xml	+= XmlNodeMake2(Bean.getSEBU_NM(), Bean.getSEBU_CD());
		}
		
		Xml	+= "</select>";

        response.setContentType("text/html;charset=euc-kr");
        response.setHeader("Cache-Control", "no-cache");
        response.getWriter().write(Xml);

		return null;	
	}
	
	
	//	XML 노드 생성
	public	String	XmlNodeMake(String NodeName, String Value)
	{
		String	XML	= "";
		
		XML	= "<" + NodeName + ">" + StringEscapeUtils.escapeXml(Value) + "</" + NodeName + ">";
		
		return	XML;
	}
	
	
	//	XML 노드 생성
	public	String	XmlNodeMake2(String Label, String Value)
	{
		String	XML	= "";
		
		XML	= "<option label='" + Label + "' value='" + Value + "'/>";
		
		return	XML;
	}
}
