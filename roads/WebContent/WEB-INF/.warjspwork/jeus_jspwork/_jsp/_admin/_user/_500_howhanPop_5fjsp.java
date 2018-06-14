package jeus_jspwork._jsp._admin._user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_howhanPop_5fjsp extends jeus.servlet.jsp.HttpJspBase {

  public final String[] __jeusGetIncludedJspFiles() {
    return new String[] {
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
      out.write(_jspx_template1);
      out.write(_jspx_template2);
      out.write(_jspx_template3);
      out.write(_jspx_template4);
      out.write(_jspx_template5);
      out.write(_jspx_template6);
      out.write(_jspx_template7);

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
  private final static String _jspx_template2 = "  \r\n";
  private final static String _jspx_template3 = "  \r\n";
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "\r\n";
  private final static String _jspx_template6 = "\r\n";
  private final static String _jspx_template7 = "\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody { \r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\nhtml {overflow-x : hidden;}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script language=\"javascript\" src=\"/js/common.js\"></script> \r\n<script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script>\r\n\r\n<body>\r\n\r\n\r\n<form name=\"regForm\" id=\"regForm\" method=\"post\">\r\n<table width=\"750\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t<tr>\r\n\t\t<td align=\"center\">\r\n\t\t<table width=\"700\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"1\" bgcolor=\"eaeaea\"></td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"14\"></td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td align=\"left\">\r\n\t\t\t\t<table width=\"700\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td align=\"center\" class=\"\">\r\n\t\t\t\t\t\t\t<input name=\"modeType\" type=\"hidden\" value=\"edit\">\r\n\r\n\t\t\t\t\t\t<table width=\"700\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td align=\"center\">\r\n\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\"></table>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"15\"></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td valign=\"top\">\r\n\t\t\t\t\t\t\t\t<div \tstyle=\"width:97%; height:300px; border: 1px solid black; font: 11.8px;\">\r\n\t\t\t\t\t\t\t\t<p style=\"margin: 5px; font-size: 12px; font-weight: bold;\">[Internet Explorer 호환성보기 설정 안내]</p><br>\r\n\t\t\t\t\t\t\t\t<p style=\"margin: 3px; font-size: 12px;\">도로점용관리 시스템은 Internet Explorer(이하 IE)를 통하여만 접속이 가능하고, 호환성보기 설정을 해 주셔야 합니다. \r\n\t\t\t\t\t\t\t\tIE의 버전마다 호환성보기 설정할 수 있는 방법 다르니 아래의 내용을 참고하여 호환성보기설정을 반드시 해 주시기 바랍니다.</p><br>\r\n\t\t\t\t\t\t\t\t<a style=\"font-weight: bold;\">1. IE 8</a><br>\r\n\t\t\t\t\t\t\t\t&nbsp 1) 도구 > 호환성보기설정 클릭<br>\r\n\t\t\t\t\t\t\t\t<img alt=\"\" src=\"/img/noticePopup/ie8_1.gif\" style=\"margin: 3px 10px 3px 30px;\"><br><br>\r\n\t\t\t\t\t\t\t\t&nbsp  2) 98.33.1.88 추가 후 닫기<br>\r\n\t\t\t\t\t\t\t\t<img alt=\"\" src=\"/img/noticePopup/ie8_2.gif\" style=\"margin: 3px 10px 3px 30px;\"><br><br><br>\r\n\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t<a style=\"font-weight: bold;\">2. IE9, IE10</a><br>\r\n\t\t\t\t\t\t\t\t&nbsp 1) 도로점용관리시스템에 접속한 후 아래처럼 ‘도구’ 메뉴가 안 보이면 ‘Alt' 키나 ’F10‘ 버튼을 누르면 메뉴가 나타납니다.<br>\r\n\t\t\t\t\t\t\t\t<img alt=\"\" src=\"/img/noticePopup/ie9ie10_1.gif\" style=\"margin: 3px 10px 3px 30px;\"><br><br>\r\n\t\t\t\t\t\t\t\t&nbsp 2) 도구 > 호환성보기설정 클릭<br>\r\n\t\t\t\t\t\t\t\t<img alt=\"\" src=\"/img/noticePopup/ie9ie10_2.gif\" style=\"margin: 3px 10px 3px 30px;\"><br><br>\r\n\t\t\t\t\t\t\t\t&nbsp 3) 98.33.1.88 추가 후 닫기<br>\r\n\t\t\t\t\t\t\t\t<img alt=\"\" src=\"/img/noticePopup/ie9ie10_3.gif\" style=\"margin: 3px 10px 3px 30px;\"><br><br>\r\n\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t<a style=\"font-weight: bold;\">2. IE11</a><br>\r\n\t\t\t\t\t\t\t\t&nbsp 1) 도로점용관리시스템에 접속한 후 인터넷창 오른쪽 상단의 '도구 > 호환성 보기 설정'을 클릭합니다.<br>\r\n\t\t\t\t\t\t\t\t<img alt=\"\" src=\"/img/noticePopup/ie11_1.bmp\" style=\"margin: 3px 10px 3px 30px;\"><br><br>\r\n\t\t\t\t\t\t\t\t&nbsp 2) 98.33.1.88(도로점용관리시스템 URL) 추가 후 닫기<br>\r\n\t\t\t\t\t\t\t\t<img alt=\"\" src=\"/img/noticePopup/ie11_2.bmp\" style=\"margin: 3px 10px 3px 30px;\"><br><br>\r\n\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\r\n\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"30\"></td>\r\n\t\t\t</tr>\r\n\t\t</table>\r\n\t\t\r\n</form>\r\n</body>\r\n</html>\r\n\r\n";
}
