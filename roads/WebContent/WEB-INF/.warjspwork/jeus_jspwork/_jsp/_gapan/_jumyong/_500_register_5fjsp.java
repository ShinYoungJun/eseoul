package jeus_jspwork._jsp._gapan._jumyong;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_register_5fjsp extends jeus.servlet.jsp.HttpJspBase {

  public final String[] __jeusGetIncludedJspFiles() {
    return new String[] {
      "/jsp/common/loginCheck.jsp",
      "/jsp/common/include.jsp"
    };
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
      pageContext = _jspxFactory.getPageContext(this, request, response, "/jsp/common/error.jsp", true, 8192, true);
      session = pageContext.getSession();
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();

      response.setContentType("text/html;charset=MS949");

      out.write(_jspx_template0);
      // jsp code [from=(1,3);to=(6,1)]
      
      	String 		userId	= (String)session.getAttribute("sessionUserId");
      	
      	if(userId == null)
      	{

      out.write(_jspx_template1);
      // jsp code [from=(11,3);to=(13,1)]
      
      	}

      out.write(_jspx_template2);
      out.write(_jspx_template3);
      out.write(_jspx_template4);
      out.write(_jspx_template5);
      out.write(_jspx_template6);
      out.write(_jspx_template7);
      out.write(_jspx_template8);
      out.write(_jspx_template9);
      // jsp code [from=(82,14);to=(82,19)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${test1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(83,14);to=(83,19)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${test2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(113,62);to=(113,70)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${NAME_MIN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(114,58);to=(114,62)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SSN1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(115,58);to=(115,62)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SSN2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);

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
  private final static String _jspx_template1 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('사용자의 사용시간이 종료되었습니다. 다시 접속 해주시기 바랍니다.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template2 = "    \r\n";
  private final static String _jspx_template3 = "\r\n";
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "  \r\n";
  private final static String _jspx_template6 = "  \r\n";
  private final static String _jspx_template7 = "\r\n";
  private final static String _jspx_template8 = "\r\n";
  private final static String _jspx_template9 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script language=\"javascript\" src=\"/js/Check_inputbox.js\"></script>\r\n\r\n\r\n<script type=\"text/javascript\">\r\n//<![CDATA[\r\n\r\n\tfunction iFrameResize(obj)\r\n\t{\r\n\t\tvar iFrm = obj;\r\n\t\t//alert(iFrm.contentWindow.document.body.scrollHeight);\r\n\t\tvar the_height = iFrm.contentWindow.document.body.scrollHeight;\r\n\r\n\t\tiFrm.style.height = the_height;\r\n\t}\r\n\r\n\tfunction iFrameResizeTab(obj)\r\n\t{\r\n\t\tvar iFrm = document.getElementById(obj);\r\n\t\tvar the_height = iFrm.contentWindow.document.body.scrollHeight;\r\n\r\n\t\tiFrm.style.height = the_height;\r\n\r\n\t}\r\n\r\n\tfunction\tRegisterPrc()\r\n\t{\r\n\t\tvar\tresult\t= tab1.RegisterPrc();\r\n/*\r\n\t\t//싱크를 맞추기 위해 임시 방편으로....\r\n\t\tfor(var i=0; i < 1000000; i++){\r\n\t\t\tif(result == true)\r\n\t\t\t\tbreak;\r\n\t\t}\r\n\r\n\t\t//\t필수 항목이 비어 있으면 ..\r\n\t\tif(result == false)\r\n\t\t\treturn;\r\n\r\n\t\tvar form = document.form;\r\n\r\n\t\ttop.frames[1].location=\"/jsp/menu/left/gapan.jsp?menu_param=jumyong\";\t//왼쪽 메뉴 링크\r\n\t\tform.action = \"/gapan/jumyong/search.do\";\t\t\t//점용허가 및 부과\r\n\t\tform.submit();\r\n*/\r\n\t}\r\n\t\r\n\tfunction\tSearch()\r\n\t{\r\n\t\tvar form = document.form;\r\n\r\n\t\tform.action = \"search.do\";\r\n\t\tform.submit();\r\n\t}\r\n\t\r\n\tfunction \tInit()\r\n\t{\r\n\t\t//alert(\"";
  private final static String _jspx_template10 = "\");\r\n\t\t//alert(\"";
  private final static String _jspx_template11 = "\");\r\n\t\t/*\r\n\t\tdocument.getElementById(\"NAME_MIN\").value\t\t= tab1.document.getElementById(\"NAME_MIN\").value;\r\n\t\tdocument.getElementById(\"SSN1\").value\t= tab1.document.getElementById(\"min_ssn1\").value;\r\n\t\tdocument.getElementById(\"SSN2\").value\t= tab1.document.getElementById(\"min_ssn2\").value;\r\n\r\n\t\tvar\tNAME\t= document.getElementById(\"NAME_MIN\").value;\r\n\t\tvar\tSSN1\t= document.getElementById(\"SSN1\").value;\r\n\t\tvar\tSSN2\t= document.getElementById(\"SSN2\").value;\r\n\r\n\t\tvar tabs\t= document.getElementById(\"tab2\");\r\n\t\ttabs.src\t= \"/gapan/gapan/jumji_search.do?NAME=\" + NAME + \"&SSN1=\" + SSN1 + \"&SSN2=\" + SSN2;\r\n\t\t*/\r\n\t}\r\n\t\r\n\tfunction\tGoJumyongSearch(gapanno)\r\n\t{\r\n\t\tvar form = document.form;\r\n\t\t\r\n\t\ttop.frames[1].location=\"/jsp/menu/left/gapan.jsp?menu_param=jumyong\";\t//왼쪽 메뉴 링크\r\n\t\tform.action = \"/gapan/jumyong/view.do?GAPAN_NO=\" + gapanno;\r\n\t\tform.submit();\r\n\t}\r\n\r\n//]]>\r\n</script>\r\n\r\n<body onload=\"Init();\">\r\n\r\n<form name=\"form\" method=\"post\">\r\n\t<input type=\"hidden\" id=\"NAME_MIN\" name=\"NAME_MIN\" value=\"";
  private final static String _jspx_template12 = "\">\r\n\t<input type=\"hidden\" id=\"NAME_MIN\" name=\"SSN1\" value=\"";
  private final static String _jspx_template13 = "\">\r\n\t<input type=\"hidden\" id=\"NAME_MIN\" name=\"SSN2\" value=\"";
  private final static String _jspx_template14 = "\">\r\n\r\n<table width=\"800\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t<tr>\r\n    \t<td height=\"43\"><img src=\"/img/sub6_cont1_title.gif\" width=\"800\" height=\"43\"></td>\r\n  \t</tr>\r\n  \t<tr>\r\n\t\t<td align=\"center\">\r\n\t    <table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"1\" bgcolor=\"eaeaea\"></td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t        <td height=\"14\"></td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td align=\"left\">\r\n\t\t          \t<tr>\r\n\t\t  \t\t\t\t<TD>\r\n\t\t\t  \t\t\t\t<iframe width=\"100%\" height=\"100%\" id=\"tab1\" name=\"tab1\" frameborder=\"0\" onload=\"iFrameResize(this)\" scrolling=\"no\" src=\"/gapan/jumyong/tab/info_register.do\"></iframe>\r\n\t\t  \t\t\t\t</TD>\r\n\t\t          \t</tr>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"40\" align=\"right\">\r\n\t\t\t\t\t<img src=\"/img/save_icon.gif\" alt=\"전체저장\" border=\"0\" onClick=\"javascript:RegisterPrc();\" style=\"CURSOR:hand\">\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\t\t\r\n\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n</table>\r\n\r\n</body>\r\n</html>";
}
