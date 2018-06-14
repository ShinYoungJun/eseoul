package jeus_jspwork._jsp._admin._user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_noticePop_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(33,16);to=(33,21)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${today}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template8);
      // jsp code [from=(34,24);to=(34,37)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${notice_todate}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template9);
      // jsp code [from=(58,47);to=(58,55)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${listSize}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(62,45);to=(62,51)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${result}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template15);

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
  private boolean _jspx_th_c_forEach_0_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:forEach ---- //
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = new org.apache.taglibs.standard.tag.rt.core.ForEachTag();
    _jspx_th_c_forEach_0.setPageContext(pageContext);
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${noticeList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("noticeList");
    _jspx_th_c_forEach_0.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template12);
            // jsp code [from=(80,73);to=(80,89)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${noticeList.TITLE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template13);
            // jsp code [from=(85,94);to=(85,112)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${noticeList.CONTENT}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template14);

          } while (_jspx_th_c_forEach_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
        }
        if (_jspx_th_c_forEach_0.doEndTag() == Tag.SKIP_PAGE)
          return true;
      } catch (Throwable t) {
        _jspx_th_c_forEach_0.doCatch(t);
      } finally {
        _jspx_th_c_forEach_0.doFinally();
      }
    } finally {
      _jspx_th_c_forEach_0.release();
    }
    return false;
  }

  private final static String _jspx_template0 = "\r\n";
  private final static String _jspx_template1 = "\r\n";
  private final static String _jspx_template2 = "  \r\n";
  private final static String _jspx_template3 = "  \r\n";
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "\r\n";
  private final static String _jspx_template6 = "\r\n";
  private final static String _jspx_template7 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\nhtml {overflow-x : hidden;}\r\n\r\n.popdiv{\r\n\twidth: 98%; height: 300px;\r\n\tpadding: 4px; margin-bottom: 20px;\r\n\toverflow-y: scroll; border: 1px solid black;\r\n\tfont-size: 1.26em; line-height: 17px;\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script language=\"javascript\" src=\"/js/common.js\"></script>\r\n<script type=\"text/javascript\"><!--\r\n//<![CDATA[\r\n\t\r\nvar today = \"";
  private final static String _jspx_template8 = "\";\r\nvar notice_todate = \"";
  private final static String _jspx_template9 = "\";\r\n\r\nif(today >= notice_todate){\r\n\twindow.close();\r\n}\r\n\tfunction notice_setCookie( name, value, expiredays ) \r\n    { \r\n        var todayDate = new Date(); \r\n        todayDate.setDate( todayDate.getDate() + expiredays ); \r\n        document.cookie = name + \"=\" + escape( value ) \r\n                  + \"; path=/; expires=\" + todayDate.toGMTString() + \";\" ;\r\n    }\r\n    function closeme()\r\n    { \r\n        if ( document.getElementById(\"check1\").checked ) \r\n              notice_setCookie( \"Notice\", \"done\" , 1);// 1=하루동안 공지 창을 열지 않음 \r\n        self.close(); \r\n    } \r\n\r\n//]]>\r\n--></script>\r\n\r\n<body >\r\n<form name=\"listForm\" id=\"listForm\" method=\"post\" >\r\n<input name=\"listSize\" id=\"listSize\" value=\"";
  private final static String _jspx_template10 = "\" type=\"hidden\">\r\n<input name=\"menuCode\" id=\"menuCode\" type=\"hidden\">\r\n<input name=\"chk\" id=\"chk\" type=\"hidden\">\r\n<input name=\"modeType\" type=\"hidden\" value=\"updateAuthority\"> \r\n<input name=\"result\" type=\"hidden\" value=\"";
  private final static String _jspx_template11 = "\"> \r\n\r\n<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t";
  private final static String _jspx_template12 = "\r\n\t<tr>\r\n\t\t<td width=\"520\" height=\"104\"><img src=\"/img/n_pop1.gif\" width=\"520\" height=\"104\"></td>\r\n\t  <td background=\"/img/n_pop2.gif\">&nbsp;</td>\r\n\t\t<td width=\"10\"><img src=\"/img/n_pop3.gif\" width=\"10\" height=\"104\"></td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\r\n\t\t\t<table align=center width=\"90%\" cellpadding=\"0\" cellspacing=\"0\"\r\n\t\t\t\tstyle=\"border-collapse:collapse;\" class=\"sub_table\">\r\n\t\t\t\t\r\n\t\t\t\t\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td colspan=\"10\" align=\"left\" valign=\"top\" class=\"text_box\">\r\n\t\t\t\t\t<font style=\"font-family:TTche;font-size:13pt;\" color=\"black\"><b>";
  private final static String _jspx_template13 = "</b></font>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td colspan=\"10\" align=\"left\" valign=\"top\" class=\"text_box\">\r\n\t\t\t\t\t\t<textarea name=\"CONTENT\" class=\"text_box\" style=\"width:97%;height:240px\" readonly=\"\">";
  private final static String _jspx_template14 = "</textarea>\t\t\t\t\t\r\n\t\t\t\t\t\t<!-- <div name=\"CONTENT\" class=\"text_box popdiv\" style=\"font-size:10pt;\">\r\n\t\t\t\t\t\t<font style=\"font-family:TTche;font-size:10pt;\" color=\"black\"><b>** 건축물 요율 변경 안내<br></font>\r\n\t\t\t\t\t\t건축물의 요율이 다음과 같이 변경되었습니다.<br><br>\r\n\t\t\t\t\t\t[변경 전]<br>\r\n\t\t\t\t\t\t <img alt=\"\" src=\"/img/noticePopup/building_before.png\"><br><br>\r\n\t\t\t\t\t\t[변경 후]<br>\r\n\t\t\t\t\t\t<img alt=\"\" src=\"/img/noticePopup/building_after.png\">\r\n \t\t\t\t\t\t</div> -->\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t";
  private final static String _jspx_template15 = "\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td class=\"table_bl_left\">\r\n\t\t\t\t\t<input type=\"checkbox\" id=\"check1\" name=\"check1\" value=\"checkbox\" ><font style=\"font-family:TTche;font-size:10pt\">오늘은 이창 띄우지 않기</font></td>\r\n\t\t\t\t\t<td class=\"table_bl_left\" align=\"right\"><input type=\"button\" value=\"닫기\" onClick=\"closeme()\">&nbsp;</td>\r\n\t\t\t\t</tr>\r\n\t\t\t</table>\t\r\n\t\t</table>\t\r\n\t</table>\r\n</form>\r\n\r\n</body>\r\n</html>\r\n\r\n";
}
