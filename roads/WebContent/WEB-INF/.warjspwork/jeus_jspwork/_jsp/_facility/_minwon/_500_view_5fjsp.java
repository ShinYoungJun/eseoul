package jeus_jspwork._jsp._facility._minwon;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_view_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(81,61);to=(81,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(102,175);to=(102,183)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);

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
  private final static String _jspx_template9 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script language=\"javascript\" src=\"/js/Check_inputbox.js\"></script>\r\n\r\n\r\n<script type=\"text/javascript\">\r\n//<![CDATA[\r\n\r\n\tfunction iFrameResize(obj)\r\n\t{\r\n\t\tvar iFrm = obj;\r\n\t\tvar the_height = iFrm.contentWindow.document.body.scrollHeight;\r\n\r\n\t\tiFrm.style.height = the_height;\r\n\t}\r\n\r\n\tfunction iFrameResizeTab(obj)\r\n\t{\r\n\t\tvar iFrm = document.getElementById(obj);\r\n\t\tvar the_height = iFrm.contentWindow.document.body.scrollHeight;\r\n\r\n\t\tiFrm.style.height = the_height;\r\n\t}\r\n\r\n\tfunction\tRegisterPrc()\r\n\t{\r\n\t\tvar\tresult\t= tab1.RegisterPrc();\r\n/*\r\n\t\t//\t필수 항목이 비어 있으면 ..\r\n\t\tif(result == false)\r\n\t\t\treturn;\r\n\r\n\t\tvar form = document.form;\r\n\r\n\t\tform.action = \"/junggi/gigan/search.do\";\t//\t점용조회및관리 페이지로 이동\r\n\t\tform.submit();\r\n*/\r\n\t}\r\n\r\n\tfunction\tSearch()\r\n\t{\r\n\t\tvar form = document.form;\r\n\r\n\t\tform.action = \"search.do\";\r\n\t\tform.submit();\r\n\t}\r\n\r\n\t//점용인 정보의 검색 조건인 점용인, 주민(법인)번호에 선택한 민원 정보의 민원인명, 민원인 주민번호를 넣는다.\r\n\tfunction getSearchData( NAME_MIN, min_ssn1, min_ssn2)\r\n\t{\r\n\t\ttab2.document.location.href = \"/facility/minwon/jumin_search.do?NAME=\" + NAME_MIN + \"&SSN1=\" + min_ssn1 + \"&SSN2=\" + min_ssn2;\r\n\t}\r\n//]]>\r\n</script>\r\n\r\n<body>\r\n<table width=\"800\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n<form name=\"form\" id=\"form\" method=\"post\">\r\n<input type=\"hidden\" name=\"ADMIN_NO\" id=\"ADMIN_NO\" value=\"";
  private final static String _jspx_template10 = "\">\r\n<input type=\"hidden\" name=\"NAME_MIN\" id=\"NAME_MIN\" value=\"\">\r\n<input type=\"hidden\" name=\"jumin_ssn1\" id=\"jumin_ssn1\" value=\"\">\r\n<input type=\"hidden\" name=\"jumin_ssn2\" id=\"jumin_ssn2\" value=\"\">\r\n\r\n\t<tr>\r\n    \t<td height=\"43\"><img src=\"/img/sub1_cont1_title.gif\" width=\"800\" height=\"43\"></td>\r\n  \t</tr>\r\n       \r\n\t<tr>\r\n\t\t<td height=\"1\" bgcolor=\"eaeaea\"></td>\r\n\t</tr>\r\n \r\n\t<tr>\r\n        <td height=\"14\"></td>\r\n\t</tr>    \r\n        \r\n\t<tr>\r\n\t\t<td align=\"left\">\r\n          \t<tr>\r\n  \t\t\t\t<TD>\r\n  \t\t\t\t<iframe width=\"100%\" height=\"100%\" name=\"tab1\" id=\"tab1\" frameborder=\"0\" onload=\"iFrameResize(this)\" scrolling=\"no\" src=\"/facility/minwon/saewol_register.do?ADMIN_NO=";
  private final static String _jspx_template11 = "\"></iframe>\r\n  \t\t\t\t</TD>\r\n          \t</tr>\r\n          \t<tr>\r\n\t          \t<td height=\"40\" align=\"right\">\r\n\t\t\t\t\t<img src=\"/img/save_icon.gif\" alt=\"전체저장\" border=\"0\" onClick=\"javascript:RegisterPrc();\" style=\"CURSOR:hand;\" >&nbsp;&nbsp;&nbsp;&nbsp;\r\n\t\t\t\t</td>\r\n          \t</tr>\r\n\t\t</td>\r\n\t</tr>\r\n\t\r\n\t<tr>\r\n\t\t<td height=\"30\"></td>\r\n\t</tr>\r\n    \r\n      <tr>\r\n        <td align=\"left\">\r\n        <table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n        <tr>\r\n            <td height=\"22\" background=\"/img/tab_line_purple.gif\">\r\n            <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                <tr>\r\n                  \t<td width=\"111\"><img name=\"jumin_img\" id=\"jumin_img\" src=\"/img/sub_petition_title2_on.gif\" alt=\"관련점용지\" width=\"110\" height=\"22\" border=\"0\"></td>\r\n                </tr>\r\n            </table>\r\n            </td>\r\n\t\t</tr>\r\n\t\t<td>\r\n\t\t  \t<iframe width=\"100%\" height=\"100%\" id=\"tab2\" name=\"tab2\" frameborder=\"0\" scrolling=\"no\" onload=\"iFrameResize(this)\" src=\"about:blank\"></iframe>\r\n\t\t</td>\r\n\t\t<tr>\r\n\t\t\t<td height=\"40\" align=\"right\">\r\n\t\t\t\t<img src=\"/img/list_icon.gif\" alt=\"리스트\" border=\"0\" onClick=\"javascript:Search();\" style=\"CURSOR:hand\">\r\n\t\t\t</td>\r\n\t\t</tr>\r\n\t\t\r\n\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n\t\t</table>\r\n\t</td>\r\n\t</tr>\r\n\t\r\n</table>\r\n\r\n</body>\r\n</html>";
}
