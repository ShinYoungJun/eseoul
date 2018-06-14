package jeus_jspwork._jsp._menu._left;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_statistics_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
  private final static String _jspx_template0 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin-left: 0px;\r\n\tmargin-top: 0px;\r\n\tmargin-right: 0px;\r\n\tmargin-bottom: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script type=\"text/javascript\">\r\n<!--\r\n           \r\n\tfunction\tmenuBtn_chk(o)\r\n\t{\r\n\t\tdocument.getElementById(\"stat0\").className = \"leftM2\";\r\n\t\tdocument.getElementById(\"stat1\").className = \"leftM2\";\r\n\t\tdocument.getElementById(\"stat2\").className = \"leftM2\";\r\n\t\tdocument.getElementById(\"stat3\").className = \"leftM2\";\r\n\r\n\t\tdocument.getElementById(o.id).className = \"leftM1\";\r\n\t}\r\n-->\t\r\n\r\n</script>\r\n\r\n<body>\r\n<table width=\"200\" height=\"100%\" border=\"0\" cellpadding=\"0\"\r\n\tcellspacing=\"0\">\r\n\t<tr>\r\n\t\t<td align=\"center\" valign=\"top\">\r\n\t\t<table width=\"170\" height=\"100%\" border=\"0\" cellpadding=\"0\"\r\n\t\t\tcellspacing=\"0\">\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"17\">&nbsp;</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"35\"><img src=\"/img/sub4_title.gif\" alt=\"점용관리\"\r\n\t\t\t\t\twidth=\"170\" height=\"35\"></td>\r\n\t\t\t</tr>\r\n\r\n\t\t\t<tr>\r\n\t\t\t\t<td align=\"center\" valign=\"top\" bgcolor=\"f8f8f8\" class=\"leftborder\">\r\n\t\t\t\t<!--좌측 메뉴시작-->\r\n\t\t\t\t<table width=\"150\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"12\" colspan=\"2\"></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td width=\"29\" height=\"27\"><img\r\n\t\t\t\t\t\t\tsrc=\"/img/sub_menuicon.gif\" width=\"29\" height=\"27\"></td>\r\n\t\t\t\t\t\t<td align=\"left\"><a href=\"/statistics/statistics.do?mode=all\" class=\"leftM1\"\r\n\t\t\t\t\t\t\ttarget=\"cont\" id=\"stat0\" onclick=\"javascript:menuBtn_chk(this);\">전체\r\n\t\t\t\t\t\t</a></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"1\" colspan=\"2\" bgcolor=\"e0e0df\"></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td width=\"29\" height=\"27\"><img\r\n\t\t\t\t\t\t\tsrc=\"/img/sub_menuicon.gif\" width=\"29\" height=\"27\"></td>\r\n\t\t\t\t\t\t<td align=\"left\"><a href=\"/statistics/statistics.do?mode=stat\" class=\"leftM2\"\r\n\t\t\t\t\t\t\ttarget=\"cont\" id=\"stat1\" onclick=\"javascript:menuBtn_chk(this);\">법정동별\r\n\t\t\t\t\t\t</a></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"1\" colspan=\"2\" bgcolor=\"e0e0df\"></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"27\"><img src=\"/img/sub_menuicon.gif\"\r\n\t\t\t\t\t\t\twidth=\"29\" height=\"27\"></td>\r\n\t\t\t\t\t\t<td align=\"left\"><a href=\"/statistics/statistics.do?mode=purpose\" class=\"leftM2\"\r\n\t\t\t\t\t\t\ttarget=\"cont\" id=\"stat2\" onclick=\"javascript:menuBtn_chk(this);\">점용목적별\r\n\t\t\t\t\t\t</a></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"1\" colspan=\"2\" bgcolor=\"e0e0df\"></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td width=\"29\" height=\"27\"><img\r\n\t\t\t\t\t\t\tsrc=\"/img/sub_menuicon.gif\" width=\"29\" height=\"27\"></td>\r\n\t\t\t\t\t\t<td align=\"left\">\r\n\t\t\t\t\t\t<a href=\"/statistics/statistics.do?mode=semok\" class=\"leftM2\"\r\n\t\t\t\t\t\t\ttarget=\"cont\" id=\"stat3\" onclick=\"javascript:menuBtn_chk(this);\">세목코드별</a>\t\t\t\t\t\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"12\" colspan=\"2\"></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t</table>\r\n\t\t\t\t<!--좌측 메뉴시작--></td>\r\n\t\t\t</tr>\r\n\r\n\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td height=\"174\" align=\"center\" valign=\"bottom\"><!--좌측하단 배너-->\r\n\t\t<!--<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t<tr>\r\n\t\t\t\t<td><a href=\"#\"><img src=\"/img/left_banner1.gif\"\r\n\t\t\t\t\talt=\"서울시세외수입 종합징수시스템\" width=\"176\" height=\"58\" border=\"0\"></a></td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td><a href=\"#\"><img src=\"/img/left_banner2.gif\"\r\n\t\t\t\t\talt=\"실시간민원통보시스템\" width=\"176\" height=\"47\" border=\"0\"></a></td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td><a href=\"#\"><img src=\"/img/left_banner3.gif\"\r\n\t\t\t\t\talt=\"새올민원행정시스템\" width=\"176\" height=\"52\" border=\"0\"></a></td>\r\n\t\t\t</tr>\r\n\t\t</table>-->\r\n\t\t<!--좌측하단 배너 끝--></td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td height=\"60\" align=\"center\"><!--관련사이트--> <!--<select\r\n\t\t\tname=\"select2\" class=\"related\" style=\"width:170px; background:f1f2f2\">\r\n\t\t\t<option selected>관련사이트</option>\r\n\t\t</select>-->\r\n\t\t</td>\r\n\t\t<!--관련사이트 끝-->\r\n\t</tr>\r\n</table>\r\n</body>\r\n</html>\r\n\r\n";
}
