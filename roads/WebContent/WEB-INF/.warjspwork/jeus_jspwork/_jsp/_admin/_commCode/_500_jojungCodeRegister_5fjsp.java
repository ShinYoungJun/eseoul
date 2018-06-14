package jeus_jspwork._jsp._admin._commCode;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_jojungCodeRegister_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      out.write(_jspx_template3);
      out.write(_jspx_template4);
      // jsp code [from=(69,9);to=(69,12)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MSG}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template5);
      // jsp code [from=(70,22);to=(70,25)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MSG}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template6);
      // jsp code [from=(72,9);to=(72,11)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${YN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template7);
      // jsp code [from=(86,53);to=(86,57)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mode}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template8);
      // jsp code [from=(87,51);to=(87,54)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MSG}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template9);
      // jsp code [from=(88,67);to=(88,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${modyADD_SUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(89,59);to=(89,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${modyCNT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_0_fn(pageContext, null)) return;


      out.write(_jspx_template13);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_1_fn(pageContext, null)) return;


      out.write(_jspx_template16);
      // jsp code [from=(115,81);to=(115,99)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${JojungCodeBean.CNT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_2_fn(pageContext, null)) return;


      out.write(_jspx_template19);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_3_fn(pageContext, null)) return;


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
  private boolean _jspx_th_c_if_0_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:if ---- //
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = new org.apache.taglibs.standard.tag.rt.core.IfTag();
    _jspx_th_c_if_0.setPageContext(pageContext);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mode=='add'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template12);

        } while (_jspx_th_c_if_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_0.release();
    }
    return false;
  }

  private boolean _jspx_th_c_if_1_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:if ---- //
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = new org.apache.taglibs.standard.tag.rt.core.IfTag();
    _jspx_th_c_if_1.setPageContext(pageContext);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mode=='modify'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
      if (_jspx_eval_c_if_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template14);
          // jsp code [from=(111,108);to=(111,130)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${JojungCodeBean.ADD_SUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template15);

        } while (_jspx_th_c_if_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_1.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_1.release();
    }
    return false;
  }

  private boolean _jspx_th_c_if_2_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:if ---- //
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = new org.apache.taglibs.standard.tag.rt.core.IfTag();
    _jspx_th_c_if_2.setPageContext(pageContext);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mode=='add'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
      if (_jspx_eval_c_if_2 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template18);

        } while (_jspx_th_c_if_2.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_2.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_2.release();
    }
    return false;
  }

  private boolean _jspx_th_c_if_3_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:if ---- //
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = new org.apache.taglibs.standard.tag.rt.core.IfTag();
    _jspx_th_c_if_3.setPageContext(pageContext);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mode=='modify'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
      if (_jspx_eval_c_if_3 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template20);

        } while (_jspx_th_c_if_3.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_3.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_3.release();
    }
    return false;
  }

  private final static String _jspx_template0 = "\r\n\r\n";
  private final static String _jspx_template1 = "\r\n";
  private final static String _jspx_template2 = "\r\n";
  private final static String _jspx_template3 = "\r\n";
  private final static String _jspx_template4 = "\r\n\r\n<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>조정계수 등록</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody,td,th {\r\n\tfont-family: 돋움;\r\n\tfont-size: 12px;\r\n\tcolor: #053e8a;\r\n}\r\nbody {\r\n\tmargin-left: 0px;\r\n\tmargin-top: 0px;\r\n\tmargin-right: 0px;\r\n\tmargin-bottom: 0px;\r\n}\r\n.style1 {color: #000000}\r\n.style3 {color: #FF6600; font-weight: bold; }\r\n\r\n-->\r\n</style>\r\n<script language=\"JavaScript\" src=\"/js/common.js\"></script>\r\n<script language=\"javascript\">\r\n//<!--\r\n \tfunction register()\r\n\t{ \t\t\r\n \t\tvar w = document.form;\r\n \t\t \t \t\t\r\n\r\n\t\tif(w.ADD_SUM.value ==\"\"){\r\n\t\t\talert(\"산출사용료 증가율을 입력해주세요\");\r\n\t\t\tw.ADD_SUM.focus();\r\n\t\t\treturn\r\n\t\t}\r\n\t\tif(w.CNT.value ==\"\"){\r\n\t\t\talert(\"조정계수를 입력해주세요\");\r\n\t\t\tw.CNT.focus();\r\n\t\t\treturn\r\n\t\t}\r\n\t\tif(w.ADD_SUM.value >9999){\r\n\t\t\talert(\"입력하신 산출증가율 숫자가 너무 큽니다.\");\r\n\t\t\tw.ADD_SUM.focus();\r\n\t\t\treturn\r\n\t\t}\r\n\t\tif(w.CNT.value >= 10){\r\n\t\t\talert(\"입력하신 조정계수 숫자가 너무 큽니다.\");\r\n\t\t\tw.CNT.focus();\r\n\t\t\treturn\r\n\t\t}\r\n\t\tw.submit();\r\n\t\r\n\t\t\r\n\t}\r\n\r\n\tfunction cancel(){\r\n\t\twindow.close();\r\n\t}\r\n\t\t\r\n\tfunction InitPage(){\t\t\r\n\t\tif('";
  private final static String _jspx_template5 = "'.length > 0){\r\n            alert('";
  private final static String _jspx_template6 = "');\r\n        }\r\n\t\tif('";
  private final static String _jspx_template7 = "'== 'true'){\r\n\t\t\topener.location.reload('/admin/commCode/jojungCode.do'); \r\n\t\t\twindow.close();\r\n        }\t\r\n    }\r\n\r\n    \r\n\t\r\n//-->\r\n</script>\r\n</head>\r\n\r\n<body onload=\"javascript:InitPage();\">\r\n<form id=\"form\" name=\"form\" method=\"post\" action=\"/admin/commCode/jojungCodeRegister.do\">\r\n<input type=\"hidden\" id=\"mode\" name=\"mode\" value=\"";
  private final static String _jspx_template8 = "\"/>\r\n<input type=\"hidden\" id=\"MSG\" name=\"MSG\" value=\"";
  private final static String _jspx_template9 = "\"/>\r\n<input type=\"hidden\" id=\"modyADD_SUM\" name=\"modyADD_SUM\" value=\"";
  private final static String _jspx_template10 = "\"/>\r\n<input type=\"hidden\" id=\"modyCNT\" name=\"modyCNT\" value=\"";
  private final static String _jspx_template11 = "\"/>\r\n\r\n<table width=\"580\" height=\"130\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\r\n\t<tr>\r\n\t\t<td height=\"30px\" style=\"padding:6\" valign=\"bottom\"><span class=\"sub_stan_blue\"><b>* 조정계수 등록 </b></span></td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td style=\"padding:6\" valign=\"top\">\r\n\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\"\r\n\t\t\t\tstyle=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"\r\n\t\t\t\tclass=\"sub_table\">\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">산출사용료 증가율</td>\r\n\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조정계수</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t <tr>\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t<td height=\"26\" align=\"center\">\r\n\t\t\t\t\t\t";
  private final static String _jspx_template12 = "\r\n\t\t\t\t\t\t<input type=\"text\" name=\"ADD_SUM\" id=\"ADD_SUM\" size=\"10\" maxlength=\"4\" class=\"input_form1\" onchange=\"isNum(this,'산출사용료 증가율')\"/>\r\n\t\t\t\t\t\t";
  private final static String _jspx_template13 = "\r\n\t\t\t\t\t\t";
  private final static String _jspx_template14 = "\r\n\t\t\t\t\t\t<input type=\"text\" name=\"ADD_SUM\" id=\"ADD_SUM\" size=\"10\" maxlength=\"4\" class=\"input_form1\"  value=\"";
  private final static String _jspx_template15 = "\" onchange=\"isNum(this,'산출사용료 증가율')\"/>\r\n\t\t\t\t\t\t";
  private final static String _jspx_template16 = "\r\n\t\t\t\t\t</td>\r\n\t\t\t\t\t<td align=\"center\">\r\n\t\t\t\t\t\t<input type=\"text\" name=\"CNT\" id=\"CNT\" size=\"20\"  maxlength=\"6\"  value=\"";
  private final static String _jspx_template17 = "\"  class=\"input_form1\" />\t\t\t\t\t \r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t</table>\r\n\t\t</td>\r\n\t</tr>\t\r\n\t<tr>\r\n\t\t<td align=\"center\">\r\n\t\t\t";
  private final static String _jspx_template18 = "\r\n\t\t\t<img src=\"/img/register_icon2.gif\" alt=\"등록\" width=\"56\" height=\"18\" border=\"0\" style=\"cursor: pointer;\" onclick=\"javascript:register()\">\r\n\t\t\t";
  private final static String _jspx_template19 = "\r\n\t\t\t";
  private final static String _jspx_template20 = "\r\n\t\t\t<img src=\"/img/mod_icon.gif\" alt=\"수정\" width=\"56\" height=\"18\" border=\"0\" style=\"cursor: pointer;\" onclick=\"javascript:register()\">\r\n\t\t\t";
  private final static String _jspx_template21 = "\r\n\t\t\t<img src=\"/img/can_icon.gif\" alt=\"취소\" width=\"56\" height=\"18\" border=\"0\" style=\"cursor: pointer;\" onclick=\"javascript:cancel()\">\r\n\t\t</td>\r\n\t</tr>\r\n\t\r\n\t\r\n\t\r\n</table>\r\n\r\n</form>\r\n</body>\r\n</html>\r\n\t\t\t";
}
