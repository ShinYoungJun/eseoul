package jeus_jspwork._jsp._facility._jumyong;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_info_5fplace_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(58,27);to=(58,29)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${no}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(60,44);to=(60,49)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mode1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(62,56);to=(62,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${InspectDate}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(65,3);to=(65,42)]
      String no = request.getParameter("no");

      out.write(_jspx_template13);
      // jsp code [from=(74,50);to=(74,52)]
      out.print(no);

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
  private final static String _jspx_template2 = "\r\n";
  private final static String _jspx_template3 = "\r\n";
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "  \r\n";
  private final static String _jspx_template6 = "  \r\n";
  private final static String _jspx_template7 = "\r\n";
  private final static String _jspx_template8 = "\r\n";
  private final static String _jspx_template9 = "    \r\n\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n\r\n<script>\r\n\r\n\tfunction submitClick()\r\n\t{\r\n\t\tvar placeDetailForm = document.placeDetailForm;\r\n\t\talert(\"FSAFDDF\");\r\n\t\tplaceDetailForm.submit();\r\n\t}\r\n\t\r\n\t\r\n\t\r\n\t\r\n\t// 등록폼 체크\r\n\tfunction checkForm(){\r\n\t\tvar form1 = document.form1;\r\n\t\talert(form1.year.value);\r\n\r\n\t\tform1.submit();\r\n\t\t//\t특수문자 입력시 글 끝에 공백과 줄바꿈을 넣어야 깨지지 않음. 이유는 모르겠슴\r\n\t\t//\t\tw.content.value = w.content.value+' '+'\\n';\t\r\n\t\t\r\n\t}\r\n\t\r\n\t\r\n\t\r\n\r\n\t\r\n</script>\r\n\r\n</head>\r\n\r\n<body >\r\n\r\n\r\n\r\n<form name=\"placeDetailForm\" id=\"placeDetailForm\" method=\"post\" action = \"/jumyong/inspectEdit.do\" >\r\n\r\n<input name=\"no\" value=\"";
  private final static String _jspx_template10 = "\" type=\"hidden\" >\r\n\r\n<input name=\"mode1\"  id = \"mode1\" value=\"";
  private final static String _jspx_template11 = "\" type=\"hidden\" >\r\n\r\n<input name=\"InspectDate\"  id = \"InspectDate\" value=\"";
  private final static String _jspx_template12 = "\" type=\"hidden\" >\r\n\r\n\r\n";
  private final static String _jspx_template13 = "\r\n\r\n<table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n          <tr>\r\n            <td class=\"contborder_purple\">\t\t\t\t\t\t\t            \r\n\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n        \t\t    <tr>\r\n\t\t\t            <td>\r\n\t\t\t            <iframe name='iframe1' frameborder=\"NO\" border=\"0\" framespacing=\"0\" \r\n\t\t\t\t        src=\"/jumyong/placeFileEdit.do?no=";
  private final static String _jspx_template14 = "\" width=\"100%\" height=\"240\" scrolling=\"NO\"></iframe>\r\n\t\t\t            </td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t</table>\r\n            </td>\r\n\t\t  </tr>      \r\n</table>\r\n</body>\r\n</html>\r\n\r\n";
}
