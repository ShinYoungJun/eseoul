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
  private final static String _jspx_template7 = "\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: ����� ������������ý��� :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody { \r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\nhtml {overflow-x : hidden;}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script language=\"javascript\" src=\"/js/common.js\"></script> \r\n<script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script>\r\n\r\n<body>\r\n\r\n\r\n<form name=\"regForm\" id=\"regForm\" method=\"post\">\r\n<table width=\"750\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t<tr>\r\n\t\t<td align=\"center\">\r\n\t\t<table width=\"700\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"1\" bgcolor=\"eaeaea\"></td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"14\"></td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td align=\"left\">\r\n\t\t\t\t<table width=\"700\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td align=\"center\" class=\"\">\r\n\t\t\t\t\t\t\t<input name=\"modeType\" type=\"hidden\" value=\"edit\">\r\n\r\n\t\t\t\t\t\t<table width=\"700\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td align=\"center\">\r\n\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\"></table>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"15\"></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td valign=\"top\">\r\n\t\t\t\t\t\t\t\t<div \tstyle=\"width:97%; height:300px; border: 1px solid black; font: 11.8px;\">\r\n\t\t\t\t\t\t\t\t<p style=\"margin: 5px; font-size: 12px; font-weight: bold;\">[Internet Explorer ȣȯ������ ���� �ȳ�]</p><br>\r\n\t\t\t\t\t\t\t\t<p style=\"margin: 3px; font-size: 12px;\">����������� �ý����� Internet Explorer(���� IE)�� ���Ͽ��� ������ �����ϰ�, ȣȯ������ ������ �� �ּž� �մϴ�. \r\n\t\t\t\t\t\t\t\tIE�� �������� ȣȯ������ ������ �� �ִ� ��� �ٸ��� �Ʒ��� ������ �����Ͽ� ȣȯ�����⼳���� �ݵ�� �� �ֽñ� �ٶ��ϴ�.</p><br>\r\n\t\t\t\t\t\t\t\t<a style=\"font-weight: bold;\">1. IE 8</a><br>\r\n\t\t\t\t\t\t\t\t&nbsp 1) ���� > ȣȯ�����⼳�� Ŭ��<br>\r\n\t\t\t\t\t\t\t\t<img alt=\"\" src=\"/img/noticePopup/ie8_1.gif\" style=\"margin: 3px 10px 3px 30px;\"><br><br>\r\n\t\t\t\t\t\t\t\t&nbsp  2) 98.33.1.88 �߰� �� �ݱ�<br>\r\n\t\t\t\t\t\t\t\t<img alt=\"\" src=\"/img/noticePopup/ie8_2.gif\" style=\"margin: 3px 10px 3px 30px;\"><br><br><br>\r\n\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t<a style=\"font-weight: bold;\">2. IE9, IE10</a><br>\r\n\t\t\t\t\t\t\t\t&nbsp 1) ������������ý��ۿ� ������ �� �Ʒ�ó�� �������� �޴��� �� ���̸� ��Alt' Ű�� ��F10�� ��ư�� ������ �޴��� ��Ÿ���ϴ�.<br>\r\n\t\t\t\t\t\t\t\t<img alt=\"\" src=\"/img/noticePopup/ie9ie10_1.gif\" style=\"margin: 3px 10px 3px 30px;\"><br><br>\r\n\t\t\t\t\t\t\t\t&nbsp 2) ���� > ȣȯ�����⼳�� Ŭ��<br>\r\n\t\t\t\t\t\t\t\t<img alt=\"\" src=\"/img/noticePopup/ie9ie10_2.gif\" style=\"margin: 3px 10px 3px 30px;\"><br><br>\r\n\t\t\t\t\t\t\t\t&nbsp 3) 98.33.1.88 �߰� �� �ݱ�<br>\r\n\t\t\t\t\t\t\t\t<img alt=\"\" src=\"/img/noticePopup/ie9ie10_3.gif\" style=\"margin: 3px 10px 3px 30px;\"><br><br>\r\n\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t<a style=\"font-weight: bold;\">2. IE11</a><br>\r\n\t\t\t\t\t\t\t\t&nbsp 1) ������������ý��ۿ� ������ �� ���ͳ�â ������ ����� '���� > ȣȯ�� ���� ����'�� Ŭ���մϴ�.<br>\r\n\t\t\t\t\t\t\t\t<img alt=\"\" src=\"/img/noticePopup/ie11_1.bmp\" style=\"margin: 3px 10px 3px 30px;\"><br><br>\r\n\t\t\t\t\t\t\t\t&nbsp 2) 98.33.1.88(������������ý��� URL) �߰� �� �ݱ�<br>\r\n\t\t\t\t\t\t\t\t<img alt=\"\" src=\"/img/noticePopup/ie11_2.bmp\" style=\"margin: 3px 10px 3px 30px;\"><br><br>\r\n\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\r\n\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"30\"></td>\r\n\t\t\t</tr>\r\n\t\t</table>\r\n\t\t\r\n</form>\r\n</body>\r\n</html>\r\n\r\n";
}
