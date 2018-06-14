package jeus_jspwork._jsp._RexServer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;
import java.text.*;


public class _500_RexService_5fjsp extends jeus.servlet.jsp.HttpJspBase {

  public final String[] __jeusGetIncludedJspFiles() {
    return null;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse  response)
      throws ServletException, IOException {

    JspFactory	_jspxFactory = null;
    PageContext	pageContext = null;
    HttpSession	session = null;
    ServletContext	application = null;
    ServletConfig	config = null;
    JspWriter	out = null;
    Object		page = this;
    String		_value = null;

    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      pageContext = _jspxFactory.getPageContext(this, request, response, "", true, 8192, true);
      session = pageContext.getSession();
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();

      response.setContentType("text/html;charset=MS949");

      // jsp code [from=(1,46);to=(112,1)]
      
      	
      	// rexpert.properties.dir
      	//System.out.println("test");
      	// application.getRealPath("");
      	//System.setProperty("rexpert.properties.dir", "/inspsappl/web/rexpert/WEB-INF/classes");
      	System.setProperty("rexpert.properties.dir", "D:/workspace/roads/WebContent/WEB-INF/classes");
      
      	
      	//request.setCharacterEncoding("EUC-KR");
       	//String srequestEncoding = config.getInitParameter("requestEncoding");
       	
       	//Date  firstDt = new Date();
       	//SimpleDateFormat sdf = new  SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
       	//System.out.println("firstDt : " + sdf.format(firstDt));
       	
      
      	String designtype = (request.getParameter("designtype") == null ? "" : request.getParameter("designtype"));
      
      	String sDataType = "";
      	sDataType = (request.getParameter("datatype") == null ? "" : request.getParameter("datatype"));
      	
      	//System.out.println(request.getParameter("SAPUSERID"));
      	//System.out.println(request.getParameter("other"));
      
      	if (designtype.equals("service"))
      	{
      		response.setContentType("text/xml;charset=EUC-KR");
      		RexService.CRexDesign oRexDesign = new RexService.CRexDesign(request, response);
      		oRexDesign.getServiceList();
      		//out.print(oRexDesign.getServiceList());
      	} else if (designtype.equals("schema"))
      	{
      		response.setContentType("text/xml;charset=EUC-KR");
      		RexService.CRexDesign oRexDesign = new RexService.CRexDesign(request, response);
      		oRexDesign.getSchemaList();
      		//out.print(oRexDesign.getTableList());
      	} else if (designtype.equals("table"))
      	{
      		response.setContentType("text/xml;charset=EUC-KR");
      		RexService.CRexDesign oRexDesign = new RexService.CRexDesign(request, response);
      		oRexDesign.getTableList();
      		//out.print(oRexDesign.getTableList());
      	} else if (designtype.equals("field"))
      	{
      		response.setContentType("text/xml;charset=EUC-KR");
      		RexService.CRexDesign oRexDesign = new RexService.CRexDesign(request, response);
      		oRexDesign.getFieldList();
      		//out.print(oRexDesign.getFieldList());
      	} else if (designtype.equals("execfield"))
      	{
      		response.setContentType("text/xml;charset=EUC-KR");
      
      		RexService.CRexDesign oRexDesign = new RexService.CRexDesign(request, response);
      
      		oRexDesign.getExecFieldList();
      		//out.print(oRexDesign.getExecFieldList());
      	} else if (designtype.equals("data"))
      	{
      		/*
      		if (sDataType.equals("CSV")) {
      			response.setContentType("text/html;charset=EUC-KR");
      		} else {    // XML
      			response.setContentType("text/xml;charset=EUC-KR");
      			//response.setContentType("text/xml;charset=UTF-8");
      		}
      		*/
      
      		RexService.CRexDesign oRexDesign = new RexService.CRexDesign(request, response);
      		//request.setCharacterEncoding("UTF-16");
      		if (oRexDesign.m_sDataType.equals("CSV")) {
      			//response.setContentType("text/html;charset=EUC-KR");
      			response.setContentType(oRexDesign.m_sNlsContentTypeCsv);
      		} else {    // XML
      			//response.setContentType("text/xml;charset=EUC-KR");
      			response.setContentType(oRexDesign.m_sNlsContentTypeXml);
      		}
      
      		oRexDesign.getData();
      		//out.print(oRexDesign.getData());
      	} else if (designtype.equals("version"))
      	{
      		response.setContentType("text/xml;charset=EUC-KR");
      		RexService.CRexService oRexService = new RexService.CRexService(request, response);
      		oRexService.getVersion();
      	} else // run
      	{
      		/*
      		if (sDataType.equals("CSV")) {
      			response.setContentType("text/html;charset=EUC-KR");
      		} else {    // XML
      			response.setContentType("text/xml;charset=EUC-KR");
      			//response.setContentType("text/xml;charset=UTF-8");
      		}
      		*/
      
      		RexService.CRexService oRexService = new RexService.CRexService(request, response);
      
      		if (oRexService.m_sDataType.equals("CSV")) {
      			//response.setContentType("text/html;charset=EUC-KR");
      			response.setContentType(oRexService.m_sNlsContentTypeCsv);
      		} else {    // XML
      			//response.setContentType("text/xml;charset=EUC-KR");
      			response.setContentType(oRexService.m_sNlsContentTypeXml);
      		}
      
      		oRexService.getData();
      	}
      	
      	//Date  lastDt = new Date();
       	//System.out.println("lastDt : " + sdf.format(lastDt)); 	


    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)) {
        if (out.getBufferSize() != 0) {
          try {
            out.clear();
          } catch (Exception _exc) { }
        }
        pageContext.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(pageContext);
    }
  }
}
