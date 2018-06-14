package jeus_jspwork._jsp._mdb;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;
import java.net.URLDecoder;


public class _500_download_5finit_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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

      out.write(_jspx_template0);
      out.write(_jspx_template1);
      out.write(_jspx_template2);
      // jsp code [from=(55,59);to=(55,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${fileName}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template3);
      // jsp code [from=(61,3);to=(61,11)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${fileName}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template4);
      // jsp code [from=(65,3);to=(74,1)]
      
      //	String filename = request.getAttribute("fileName").toString();
      
      	
      //	request.setAttribute("fileName",filename);
      //	RequestDispatcher dis = request.getRequestDispatcher("download.jsp");
      	
      //	dis.forward(request,response);
      	//response.sendRedirect("download.jsp?fileName="+filename);

      out.write(_jspx_template5);

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
  private final static String _jspx_template0 = "\r\n";
  private final static String _jspx_template1 = "\r\n";
  private final static String _jspx_template2 = "\r\n\r\n<!--%@ page contentType=\"application;charset=utf-8\" %>-->\r\n\r\n<html>\r\n<head>\r\n<script>\r\n\r\nvar ie = parent.document.all;\r\nvar moz = parent.document.getElementById && !parent.document.all;\r\nvar intr;\r\n\r\nfunction Message_UpdatePos(msg,dy){\r\n var el = parent.document.getElementById(msg);\r\n\t   if(ie){\r\n\t\tel.style.pixelTop = parent.document.body.scrollTop+dy;\r\n\r\n\t   }\r\n\t   else if(moz){\r\n\t\tel.style.top = window.pageYOffset + dy + 'px';\r\n\r\n\t   }\r\n }\r\nfunction Message_Display(msg,msgMain,vis){\r\n\tvar _msg = parent.document.getElementById(msg);\r\n\t\r\n\tvar dx = parseInt(parent.document.body.clientWidth/2)+parseInt(parent.document.getElementById(msgMain).width/2);\r\n\tvar dy = parseInt(parent.document.body.clientHeight/2)-parseInt(parent.document.getElementById(msgMain).height/2);\r\n\t\t\r\n\tif(ie){\r\n\t\t_msg.style.pixelTop = parent.document.body.scrollTop + dy;\r\n\t\t_msg.style.pixelLeft = parent.document.body.clientWidth - dx;\r\n\t}\r\n\telse if(moz){\r\n\t\t_msg.style.top = window.pageYOffset + dy + 'px';\r\n\t\t_msg.style.left = window.innerWidth - dx + 'px';\r\n\t}\r\n\r\n\r\n\tif(vis){\r\n\t\t_msg.style.visibility = \"visible\";\r\n\t\tintr = setInterval(\"Message_UpdatePos('\" + msg + \"', \" + dy + \")\",1);\r\n\t}else{\r\n\t\t_msg.style.visibility = \"hidden\";\r\n\t\tif(intr)\r\n\t\t\tclearInterval(intr);\r\n\t}\r\n}\r\n\r\nfunction init(){\r\n\r\n\tMessage_Display('filedown','FILEDOWNValue',0);\r\n\tdocument.location.href=\"/jsp/mdb/download.jsp?fileName=";
  private final static String _jspx_template3 = "\";\r\n}\r\n</script>\r\n</head>\r\n<body onload=\"javascript:init();\">\r\n\r\n";
  private final static String _jspx_template4 = "\r\n\r\n</body>\r\n</html>\r\n";
  private final static String _jspx_template5 = "\r\n\r\n\r\n";
}
