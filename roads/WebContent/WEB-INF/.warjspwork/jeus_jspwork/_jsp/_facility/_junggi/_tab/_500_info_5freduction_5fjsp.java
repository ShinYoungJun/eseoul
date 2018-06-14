package jeus_jspwork._jsp._facility._junggi._tab;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_info_5freduction_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(25,21);to=(25,29)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${redirect}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // ----  spring:bind ---- //
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_0 = new org.springframework.web.servlet.tags.BindTag();
      _jspx_th_spring_bind_0.setPageContext(pageContext);
      _jspx_th_spring_bind_0.setPath("product.SEQ");
      try {
        try {
          int _jspx_eval_spring_bind_0 = _jspx_th_spring_bind_0.doStartTag();
          if (_jspx_eval_spring_bind_0 != Tag.SKIP_BODY) {
            do {
              org.springframework.web.servlet.support.BindStatus status = null;
              status = (org.springframework.web.servlet.support.BindStatus) pageContext.findAttribute("status");
              out.write(_jspx_template11);
              // jsp code [from=(52,44);to=(52,55)]
              out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

              out.write(_jspx_template12);

            } while (_jspx_th_spring_bind_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
          }
          if (_jspx_th_spring_bind_0.doEndTag() == Tag.SKIP_PAGE)
            return;
        } catch (Throwable t) {
          _jspx_th_spring_bind_0.doCatch(t);
        } finally {
          _jspx_th_spring_bind_0.doFinally();
        }
      } finally {
        _jspx_th_spring_bind_0.release();
      }

      out.write(_jspx_template13);
      // jsp code [from=(58,58);to=(58,62)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mode}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(58,131);to=(58,142)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${cal_sum_seq}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // ----  spring:bind ---- //
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_1 = new org.springframework.web.servlet.tags.BindTag();
      _jspx_th_spring_bind_1.setPageContext(pageContext);
      _jspx_th_spring_bind_1.setPath("product.REDUCTION_RATE");
      try {
        try {
          int _jspx_eval_spring_bind_1 = _jspx_th_spring_bind_1.doStartTag();
          if (_jspx_eval_spring_bind_1 != Tag.SKIP_BODY) {
            do {
              org.springframework.web.servlet.support.BindStatus status = null;
              status = (org.springframework.web.servlet.support.BindStatus) pageContext.findAttribute("status");
              out.write(_jspx_template16);
              // jsp code [from=(68,64);to=(68,86)]
              out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.REDUCTION_RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

              out.write(_jspx_template17);

            } while (_jspx_th_spring_bind_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
          }
          if (_jspx_th_spring_bind_1.doEndTag() == Tag.SKIP_PAGE)
            return;
        } catch (Throwable t) {
          _jspx_th_spring_bind_1.doCatch(t);
        } finally {
          _jspx_th_spring_bind_1.doFinally();
        }
      } finally {
        _jspx_th_spring_bind_1.release();
      }

      out.write(_jspx_template18);
      // ----  spring:bind ---- //
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_2 = new org.springframework.web.servlet.tags.BindTag();
      _jspx_th_spring_bind_2.setPageContext(pageContext);
      _jspx_th_spring_bind_2.setPath("product.REDUCTION_REASON");
      try {
        try {
          int _jspx_eval_spring_bind_2 = _jspx_th_spring_bind_2.doStartTag();
          if (_jspx_eval_spring_bind_2 != Tag.SKIP_BODY) {
            do {
              org.springframework.web.servlet.support.BindStatus status = null;
              status = (org.springframework.web.servlet.support.BindStatus) pageContext.findAttribute("status");
              out.write(_jspx_template19);
              // jsp code [from=(74,81);to=(74,105)]
              out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.REDUCTION_REASON}",java.lang.String.class , pageContext.getVariableResolver(), null));

              out.write(_jspx_template20);

            } while (_jspx_th_spring_bind_2.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
          }
          if (_jspx_th_spring_bind_2.doEndTag() == Tag.SKIP_PAGE)
            return;
        } catch (Throwable t) {
          _jspx_th_spring_bind_2.doCatch(t);
        } finally {
          _jspx_th_spring_bind_2.doFinally();
        }
      } finally {
        _jspx_th_spring_bind_2.release();
      }

      out.write(_jspx_template21);

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
  private final static String _jspx_template0 = "\r\n    \r\n";
  private final static String _jspx_template1 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('사용자의 사용시간이 종료되었습니다. 다시 접속 해주시기 바랍니다.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template2 = "\r\n";
  private final static String _jspx_template3 = "\r\n";
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "  \r\n";
  private final static String _jspx_template6 = "  \r\n";
  private final static String _jspx_template7 = "\r\n";
  private final static String _jspx_template8 = "\r\n";
  private final static String _jspx_template9 = "    \r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n<script>\r\n<!--\r\n\r\n\tfunction InitPage()\r\n\t{\r\n\t\tvar redirect = \"";
  private final static String _jspx_template10 = "\";\r\n\t\t\r\n\t\tif(redirect == \"1\")\r\n\t\t{\r\n\t\t\tparent.location.reload();\r\n\t\t}\r\n\t\r\n\t\r\n\t}\r\n\r\n\tfunction submitClick()\r\n\t{\r\n\t\tvar reductionForm = document.reductionForm;\r\n\t\t\r\n\t\t\r\n\t\tdocument.getElementById(\"mode\").value = \"add\";\r\n\t\t\r\n\t\treductionForm.submit();\r\n\t}\r\n\r\n\t-->\r\n</script>\r\n\r\n</head>\r\n\r\n<body onload=\"javascript:InitPage();\"  border=\"0\">\r\n\t";
  private final static String _jspx_template11 = "\r\n      \t<input name=\"SEQ\" ID=\"SEQ\" value=\"";
  private final static String _jspx_template12 = "\"  type=\"hidden\"  >\r\n  \t";
  private final static String _jspx_template13 = "\r\n<form name=\"reductionForm\" id=\"reductionForm\" method=\"post\" action = \"/facility/junggi/reduction.do\" >\r\n<table width=\"100%\" border=\"0\"  cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t<tr>\r\n    \t<td width=\"10%\" height=\"26\" align=\"left\"  class=\"sub_table_b\"><img src=\"/img/facility_view2.gif\" alt=\"감면적용\">\r\n    \t<input name=\"mode\" id=\"mode\" type=\"hidden\" value=\"";
  private final static String _jspx_template14 = "\"><input name=\"cal_sum_seq\" id=\"cal_sum_seq\" type=\"hidden\" value=\"";
  private final static String _jspx_template15 = "\">\r\n    \t</td>\t\t\r\n    </tr>\r\n</table>\t\r\n\r\n<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t<tr>\r\n    \t<td width=\"10%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">감면율</td>\r\n        \t<td width=\"10%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n            \t";
  private final static String _jspx_template16 = "\r\n\t\t\t\t\t<input name=\"REDUCTION_RATE\" ID=\"REDUCTION_RATE\" value=\"";
  private final static String _jspx_template17 = "\" type=\"text\" class=\"input_form1\" style=\"width:30px;ime-mode:disabled;text-align:right;\">%\r\n\t\t\t\t";
  private final static String _jspx_template18 = "\r\n\t\t</td>                     \r\n\t\t<td width=\"10%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">감면사유</td>\r\n              \t<td width=\"70%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\t\t\t";
  private final static String _jspx_template19 = "\r\n                 \t<input name=\"REDUCTION_REASON\" ID=\"REDUCTION_REASON\" value=\"";
  private final static String _jspx_template20 = "\"  type=\"text\" class=\"input_form1\" style=\"width:480px;\"  >\r\n \t             \t";
  private final static String _jspx_template21 = "\r\n\t\t</td> \r\n    </tr>\r\n    \r\n\t</table>\t\t\t\t\t\t\t\r\n\t<table align=\"right\">\r\n\t\t\t<tr> \r\n\t\t\t<td height=\"40\" >\r\n\t\t\t\t<img src=\"/img/save_icon2.gif\" alt=\"저장\" width=\"56\" height=\"18\" border=\"0\" onClick=\"javascript:submitClick();\" style=\"cursor:pointer\" >\r\n\t\t\t</td>\r\n\t\t</tr>\r\n\t\r\n\t</table>\r\n</form>\r\n</body>\r\n</html>            \r\n";
}
