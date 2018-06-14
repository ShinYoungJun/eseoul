package jeus_jspwork._jsp._test;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_semokList_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template17);
      // jsp code [from=(83,25);to=(83,44)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${resultBean.sigu_cd }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(84,13);to=(84,33)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${resultBean.buseo_cd }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(85,13);to=(85,33)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${resultBean.semok_cd }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(86,13);to=(86,35)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${resultBean.ocrBuseoCd }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(87,13);to=(87,34)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${resultBean.ocrSiguCd }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(88,13);to=(88,34)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${resultBean.suBuseoCd }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);

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
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${semokList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("semokList");
    _jspx_th_c_forEach_0.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template10);
            // jsp code [from=(58,26);to=(58,44)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${semokList.sigu_cd }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template11);
            // jsp code [from=(59,14);to=(59,33)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${semokList.buseo_cd }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template12);
            // jsp code [from=(60,14);to=(60,33)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${semokList.semok_cd }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template13);
            // jsp code [from=(61,14);to=(61,35)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${semokList.ocrBuseoCd }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template14);
            // jsp code [from=(62,14);to=(62,34)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${semokList.ocrSiguCd }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template15);
            // jsp code [from=(63,14);to=(63,34)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${semokList.suBuseoCd }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template16);

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
  private final static String _jspx_template1 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('사용자의 사용시간이 종료되었습니다. 다시 접속 해주시기 바랍니다.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template2 = "\r\n";
  private final static String _jspx_template3 = "\r\n";
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "  \r\n";
  private final static String _jspx_template6 = "  \r\n";
  private final static String _jspx_template7 = "\r\n";
  private final static String _jspx_template8 = "\r\n";
  private final static String _jspx_template9 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html>\r\n    <head>\r\n        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n        <title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n        <style type=\"text/css\">\r\n            <!--\r\n            body {\r\n                margin: 0px;\r\n                background-image: url(/img/left_back.gif);\r\n            }\r\n            -->\r\n        </style>\r\n        <link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n        <script type=\"text/javascript\">\r\n\t\t<!--\r\n\t\t\r\n\t\t\tfunction gogo()\r\n\t\t\t{\r\n\t\t\t\tvar tax_code = document.getElementById(\"TAX_CD\").value;\r\n\t\t\t\tvar w = document.form;\r\n\t\t\t\tw.action = \"/jumyong/junggi/semokListTest.do?TAX_CD=\" + tax_code;\t\r\n\t\t\t\tw.submit();\r\n\t\t\t}\r\n\t\t-->\t\r\n\t</script>\r\n    </head>\r\n\r\n    <body>\r\n\t<br/>\r\n\t<br/>\r\n\t<br/>\r\n\t<table align=\"left\">\r\n\t\t<tr>\r\n\t\t\t<td>\r\n\t\t\t\t<form id=\"form\" name=\"form\"><span class=\"sub_table_b\">테스트 TAX_CD :</span> <input type=\"text\" id=\"TAX_CD\" name=\"TAX_CD\"/><input type=\"submit\" value=\"전송\" onclick=\"javascript:gogo();\"/></form>\t\t\t\r\n\t\t\t</td>\r\n\t\t</tr>\r\n\t\t<tr>\r\n\t\t\t<td>\r\n\t\t\t\t<table width=\"500px\" border=\"1\" bordercolor=\"#c9dfed\"\r\n\t\t\t\t\t\t\t\t\tstyle=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"\r\n\t\t\t\t\t\t\t\t\tclass=\"sub_table\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"28\" align=\"center\" bgcolor=\"e5eff8\"\r\n\t\t\t\t\t\t\t\t\t\t\tclass=\"sub_table_b\">sigu_cd </td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">buseo_cd </td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">semok_cd </td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">ocrBuseoCd </td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">ocrSiguCd </td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">suBuseoCd </td>\t\t\t\t\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t";
  private final static String _jspx_template10 = "\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td height=\"28\">";
  private final static String _jspx_template11 = "</td>\r\n\t\t\t\t\t\t\t<td>";
  private final static String _jspx_template12 = "</td>\r\n\t\t\t\t\t\t\t<td>";
  private final static String _jspx_template13 = "</td>\r\n\t\t\t\t\t\t\t<td>";
  private final static String _jspx_template14 = "</td>\r\n\t\t\t\t\t\t\t<td>";
  private final static String _jspx_template15 = "</td>\r\n\t\t\t\t\t\t\t<td>";
  private final static String _jspx_template16 = "</td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t";
  private final static String _jspx_template17 = "\t\t\t\r\n\t\t\t\t</table>\r\n\t\t\t\t\r\n\t\t\t\t<br/><br/>\r\n\t\t\t\t\r\n\t\t\t\t<table width=\"500px\" border=\"1\" bordercolor=\"#c9dfed\"\r\n\t\t\t\t\t\t\t\t\tstyle=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"\r\n\t\t\t\t\t\t\t\t\tclass=\"sub_table\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"28\" align=\"center\" bgcolor=\"e5eff8\"\r\n\t\t\t\t\t\t\t\t\t\t\tclass=\"sub_table_b\">sigu_cd </td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">buseo_cd </td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">semok_cd </td>\t\t\t\t \r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">ocrBuseoCd </td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">ocrSiguCd </td>\t\t\t\t\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">suBuseoCd </td>\r\n\t\t\t\t\t</tr>\t\t\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"28\">";
  private final static String _jspx_template18 = "</td>\r\n\t\t\t\t\t\t<td>";
  private final static String _jspx_template19 = "</td>\r\n\t\t\t\t\t\t<td>";
  private final static String _jspx_template20 = "</td>\r\n\t\t\t\t\t\t<td>";
  private final static String _jspx_template21 = "</td>\r\n\t\t\t\t\t\t<td>";
  private final static String _jspx_template22 = "</td>\r\n\t\t\t\t\t\t<td>";
  private final static String _jspx_template23 = "</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t</table>\r\n\t\t  \t\r\n\t\t\t</td>\r\n\t\t</tr>\r\n\t</table>\r\n\t<br/>\r\n\t<br/>\r\n\t\t\r\n    </body>\r\n</html>\r\n";
}
