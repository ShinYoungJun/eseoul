package jeus_jspwork._jsp._admin._commCode;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_purposeRegister_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(57,9);to=(57,12)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MSG}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template5);
      // jsp code [from=(58,22);to=(58,25)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MSG}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template6);
      // jsp code [from=(60,9);to=(60,11)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${YN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template7);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_0_fn(pageContext, null)) return;


      out.write(_jspx_template26);
      // jsp code [from=(120,57);to=(120,61)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mode}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // jsp code [from=(121,55);to=(121,58)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MSG}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template28);
      // jsp code [from=(122,71);to=(122,82)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${modySECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template29);
      // jsp code [from=(123,65);to=(123,73)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${modyCODE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template30);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_5_fn(pageContext, null)) return;


      out.write(_jspx_template37);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_6_fn(pageContext, null)) return;


      out.write(_jspx_template39);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_7_fn(pageContext, null)) return;


      out.write(_jspx_template41);

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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mode=='add' || mode=='add2'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template8);
          // jsp code [from=(91,57);to=(91,66)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.CODE}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template9);
          // jsp code [from=(92,63);to=(92,70)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template10);
          // jsp code [from=(94,41);to=(94,58)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.SECTION_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template11);
          // jsp code [from=(95,27);to=(95,36)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.CODE}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template12);
          // ----  c:if ---- invoke //
          if (_jspx_th_c_if_1_fn(pageContext, _jspx_th_c_if_0)) return true;


          out.write(_jspx_template14);
          // ----  c:if ---- invoke //
          if (_jspx_th_c_if_2_fn(pageContext, _jspx_th_c_if_0)) return true;


          out.write(_jspx_template18);
          // ----  c:if ---- invoke //
          if (_jspx_th_c_if_3_fn(pageContext, _jspx_th_c_if_0)) return true;


          out.write(_jspx_template21);
          // ----  c:if ---- invoke //
          if (_jspx_th_c_if_4_fn(pageContext, _jspx_th_c_if_0)) return true;


          out.write(_jspx_template25);

        } while (_jspx_th_c_if_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_0.release();
    }
    return false;
  }

  private boolean _jspx_th_c_if_5_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:if ---- //
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = new org.apache.taglibs.standard.tag.rt.core.IfTag();
    _jspx_th_c_if_5.setPageContext(pageContext);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mode=='modify'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
      if (_jspx_eval_c_if_5 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template31);
          // jsp code [from=(126,41);to=(126,58)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.SECTION_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template32);
          // jsp code [from=(127,27);to=(127,36)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.CODE}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template33);
          // jsp code [from=(128,143);to=(128,156)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.CLASS_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template34);
          // jsp code [from=(129,141);to=(129,153)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.SORT_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template35);
          // jsp code [from=(130,127);to=(130,139)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.KIND_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template36);

        } while (_jspx_th_c_if_5.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_5.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_5.release();
    }
    return false;
  }

  private boolean _jspx_th_c_if_6_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:if ---- //
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = new org.apache.taglibs.standard.tag.rt.core.IfTag();
    _jspx_th_c_if_6.setPageContext(pageContext);
    _jspx_th_c_if_6.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mode=='add' || mode=='add2'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
      if (_jspx_eval_c_if_6 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template38);

        } while (_jspx_th_c_if_6.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_6.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_6.release();
    }
    return false;
  }

  private boolean _jspx_th_c_if_7_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:if ---- //
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_7 = new org.apache.taglibs.standard.tag.rt.core.IfTag();
    _jspx_th_c_if_7.setPageContext(pageContext);
    _jspx_th_c_if_7.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mode=='modify'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_7 = _jspx_th_c_if_7.doStartTag();
      if (_jspx_eval_c_if_7 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template40);

        } while (_jspx_th_c_if_7.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_7.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_7.release();
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
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.CLASS_NM == null || list.CLASS_NM == ''}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
      if (_jspx_eval_c_if_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template13);

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
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.CLASS_NM != null && list.CLASS_NM != ''}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
      if (_jspx_eval_c_if_2 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template15);
          // jsp code [from=(101,10);to=(101,23)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.CLASS_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template16);
          // jsp code [from=(102,114);to=(102,127)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.CLASS_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template17);

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
    _jspx_th_c_if_3.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.SORT_NM == null || list.SORT_NM == ''}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
      if (_jspx_eval_c_if_3 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template19);
          // jsp code [from=(107,110);to=(107,122)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.SORT_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

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

  private boolean _jspx_th_c_if_4_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:if ---- //
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = new org.apache.taglibs.standard.tag.rt.core.IfTag();
    _jspx_th_c_if_4.setPageContext(pageContext);
    _jspx_th_c_if_4.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.SORT_NM != null && list.SORT_NM != ''}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
      if (_jspx_eval_c_if_4 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template22);
          // jsp code [from=(110,10);to=(110,23)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.SORT_NM }",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template23);
          // jsp code [from=(111,112);to=(111,124)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.SORT_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template24);

        } while (_jspx_th_c_if_4.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_4.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_4.release();
    }
    return false;
  }

  private final static String _jspx_template0 = "\r\n\r\n";
  private final static String _jspx_template1 = "\r\n";
  private final static String _jspx_template2 = "\r\n";
  private final static String _jspx_template3 = "\r\n";
  private final static String _jspx_template4 = "\r\n\r\n<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>점용별 목적코드 설정</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody,td,th {\r\n\tfont-family: 돋움;\r\n\tfont-size: 12px;\r\n\tcolor: #053e8a;\r\n}\r\nbody {\r\n\tmargin-left: 0px;\r\n\tmargin-top: 0px;\r\n\tmargin-right: 0px;\r\n\tmargin-bottom: 0px;\r\n}\r\n.style1 {color: #000000}\r\n.style3 {color: #FF6600; font-weight: bold; }\r\n\r\n-->\r\n</style>\r\n<script language=\"JavaScript\" src=\"/js/common.js\"></script>\r\n<script language=\"javascript\">\r\n//<!--\r\n \tfunction register()\r\n\t{ \t\t\r\n \t\tvar w = document.addForm;\r\n \t\tw.action = \"/admin/commCode/purposeRegister.do\";\t\r\n \t\tw.submit();\r\n\r\n\t}\r\n \tfunction modify()\r\n\t{ \t\t\r\n \t\tif(!(confirm(\"현재 데이터와  같은 카테고리의 대분류, 중분류의 데이터도 함께 변경됩니다. 진행하시겠습니까?\"))){\r\n\t\t\treturn;\r\n\t\t}\r\n \t\tvar w = document.modyForm;\r\n \t\tw.action = \"/admin/commCode/purposeRegister.do\";\t\r\n \t\tw.submit();\r\n\r\n\t}\r\n \t\r\n\tfunction cancel(){\r\n\t\twindow.close();\r\n\t}\r\n\t\t\r\n\tfunction InitPage(){\t\t\r\n\t\tif('";
  private final static String _jspx_template5 = "'.length > 0){\r\n            alert('";
  private final static String _jspx_template6 = "');\r\n        }\r\n\t\tif('";
  private final static String _jspx_template7 = "'== 'true'){\r\n\t\t\topener.location.reload('/admin/commCode/purposeCode.do'); \r\n\t\t\twindow.close();\r\n        }\t\r\n    }\r\n\r\n    \r\n\t\r\n//-->\r\n</script>\r\n</head>\r\n\r\n<body onload=\"javascript:InitPage();\">\r\n<table width=\"800\" height=\"130\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\r\n\t<tr>\r\n\t\t<td height=\"30px\" style=\"padding:6\" valign=\"bottom\"><span class=\"sub_stan_blue\"><b>* 점용 목적 설정 </b></span></td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td style=\"padding:6\" valign=\"top\">\r\n\t\t\t<table width=\"788px\" border=\"1\" bordercolor=\"#c9dfed\"\r\n\t\t\t\tstyle=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"\r\n\t\t\t\tclass=\"sub_table\">\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td width=\"80px\" height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용구분</td>\r\n\t\t\t\t\t<td width=\"80px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">분류코드</td>\r\n\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" colspan=\"3\">점용물 종류</td>\t\t\t\t\t\t\t\t\r\n\t\t\t\t</tr>\r\n\t\t\t\t\r\n\t\t\t\t";
  private final static String _jspx_template8 = "\r\n\t\t\t\t<form id=\"addForm\" name=\"addForm\">\r\n\t\t\t\t<input type=\"hidden\" name=\"CODE\" id=\"CODE\" value=\"";
  private final static String _jspx_template9 = "\"/>\r\n\t\t\t\t<input type=\"hidden\" name=\"SECTION\" id=\"SECTION\" value=\"";
  private final static String _jspx_template10 = "\"/>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"26px\" align=\"center\">";
  private final static String _jspx_template11 = "</td>\r\n\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template12 = "</td>\r\n\t\t\t\t\t<td width=\"200px\" align=\"center\">\r\n\t\t\t\t\t\t";
  private final static String _jspx_template13 = "\r\n\t\t\t\t\t\t\t<input type=\"text\" name=\"CLASS_NM\" id=\"CLASS_NM\" size=\"20\"  maxlength=\"25\" class=\"input_form1\" value=\"\"/>\r\n\t\t\t\t\t\t";
  private final static String _jspx_template14 = "\r\n\t\t\t\t\t\t";
  private final static String _jspx_template15 = "\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template16 = "\r\n\t\t\t\t\t\t\t<input type=\"hidden\" name=\"CLASS_NM\" id=\"CLASS_NM\" size=\"20\"  maxlength=\"25\" class=\"input_form1\" value=\"";
  private final static String _jspx_template17 = "\"/>\r\n\t\t\t\t\t\t";
  private final static String _jspx_template18 = "\r\n\t\t\t\t\t</td>\r\n\t\t\t\t\t<td width=\"200px\" align=\"center\">\t\t\t\t\t\t\r\n\t\t\t\t\t\t";
  private final static String _jspx_template19 = "\r\n\t\t\t\t\t\t\t<input type=\"text\" name=\"SORT_NM\" id=\"SORT_NM\" size=\"25\"  maxlength=\"50\" class=\"input_form1\" value=\"";
  private final static String _jspx_template20 = "\"/>\r\n\t\t\t\t\t\t";
  private final static String _jspx_template21 = "\r\n\t\t\t\t\t\t";
  private final static String _jspx_template22 = "\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template23 = "\r\n\t\t\t\t\t\t\t<input type=\"hidden\" name=\"SORT_NM\" id=\"SORT_NM\" size=\"25\"  maxlength=\"50\" class=\"input_form1\" value=\"";
  private final static String _jspx_template24 = "\"/>\r\n\t\t\t\t\t\t";
  private final static String _jspx_template25 = "\r\n\t\t\t\t\t</td>\r\n\t\t\t\t\t<td  width=\"228px\" align=\"center\"><input type=\"text\" name=\"KIND_NM\" id=\"KIND_NM\" size=\"25\"  maxlength=\"50\" class=\"input_form1\" value=\"\"/></td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t</form>\r\n\t\t\t\t";
  private final static String _jspx_template26 = "\r\n\t\t\t\t\r\n\t\t\t\t<form id=\"modyForm\" name=\"modyForm\">\r\n\t\t\t\t<input type=\"hidden\" id=\"mode\" name=\"mode\" value=\"";
  private final static String _jspx_template27 = "\"/>\r\n\t\t\t\t<input type=\"hidden\" id=\"MSG\" name=\"MSG\" value=\"";
  private final static String _jspx_template28 = "\"/>\r\n\t\t\t\t<input type=\"hidden\" id=\"modySECTION\" name=\"modySECTION\" value=\"";
  private final static String _jspx_template29 = "\"/>\r\n\t\t\t\t<input type=\"hidden\" id=\"modyCODE\" name=\"modyCODE\" value=\"";
  private final static String _jspx_template30 = "\"/>\t\r\n\t\t\t\t";
  private final static String _jspx_template31 = "\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"26px\" align=\"center\">";
  private final static String _jspx_template32 = "</td>\r\n\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template33 = "</td>\r\n\t\t\t\t\t<td width=\"200px\" align=\"center\"><input type=\"text\" name=\"CLASS_NM\" id=\"CLASS_NM\" size=\"20\"  maxlength=\"20\" class=\"input_form1\" value=\"";
  private final static String _jspx_template34 = "\"/></td>\r\n\t\t\t\t\t<td width=\"250px\" align=\"center\"><input type=\"text\" name=\"SORT_NM\" id=\"SORT_NM\" size=\"20\"  maxlength=\"20\" class=\"input_form1\" value=\"";
  private final static String _jspx_template35 = "\"/></td>\r\n\t\t\t\t\t<td align=\"center\"><input type=\"text\" name=\"KIND_NM\" id=\"KIND_NM\" size=\"20\"  maxlength=\"20\" class=\"input_form1\" value=\"";
  private final static String _jspx_template36 = "\"/></td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t</form>\r\n\t\t\t\t";
  private final static String _jspx_template37 = "\r\n\t\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td align=\"center\">\r\n\t\t\t";
  private final static String _jspx_template38 = "\r\n\t\t\t<img src=\"/img/register_icon2.gif\" alt=\"등록\" width=\"56\" height=\"18\" border=\"0\" style=\"cursor: pointer;\" onclick=\"javascript:register()\">\r\n\t\t\t";
  private final static String _jspx_template39 = "\r\n\t\t\t";
  private final static String _jspx_template40 = "\r\n\t\t\t<img src=\"/img/mod_icon.gif\" alt=\"수정\" width=\"56\" height=\"18\" border=\"0\" style=\"cursor: pointer;\" onclick=\"javascript:modify()\">\r\n\t\t\t";
  private final static String _jspx_template41 = "\r\n\t\t\t<img src=\"/img/can_icon.gif\" alt=\"취소\" width=\"56\" height=\"18\" border=\"0\" style=\"cursor: pointer;\" onclick=\"javascript:cancel()\">\r\n\t\t</td>\r\n\t</tr>\r\n</table>\r\n\r\n</body>\r\n</html>\r\n\t\t\t";
}
