package jeus_jspwork._jsp._common._corpCode;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_CorpCode_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(73,49);to=(73,61)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${openerCorpNm}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template5);
      // jsp code [from=(74,51);to=(74,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${openerOffice}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template6);
      // jsp code [from=(75,51);to=(75,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${openerCorpCd}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template7);
      // ----  c:choose ---- invoke //
      if (_jspx_th_c_choose_0_fn(pageContext, null)) return;


      out.write(_jspx_template29);

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
  private boolean _jspx_th_c_choose_0_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:choose ---- //
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = new org.apache.taglibs.standard.tag.common.core.ChooseTag();
    _jspx_th_c_choose_0.setPageContext(pageContext);
    try {
      int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
      if (_jspx_eval_c_choose_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template8);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template26);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_1_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template28);

        } while (_jspx_th_c_choose_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_choose_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_choose_0.release();
    }
    return false;
  }

  private boolean _jspx_th_c_when_0_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:when ---- //
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = new org.apache.taglibs.standard.tag.rt.core.WhenTag();
    _jspx_th_c_when_0.setPageContext(pageContext);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mode == 'result'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
      if (_jspx_eval_c_when_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template9);
          // ----  c:choose ---- invoke //
          if (_jspx_th_c_choose_1_fn(pageContext, _jspx_th_c_when_0)) return true;


          out.write(_jspx_template25);

        } while (_jspx_th_c_when_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_when_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_when_0.release();
    }
    return false;
  }

  private boolean _jspx_th_c_otherwise_1_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:otherwise ---- //
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_1 = new org.apache.taglibs.standard.tag.common.core.OtherwiseTag();
    _jspx_th_c_otherwise_1.setPageContext(pageContext);
    _jspx_th_c_otherwise_1.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    try {
      int _jspx_eval_c_otherwise_1 = _jspx_th_c_otherwise_1.doStartTag();
      if (_jspx_eval_c_otherwise_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template27);

        } while (_jspx_th_c_otherwise_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_otherwise_1.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_otherwise_1.release();
    }
    return false;
  }

  private boolean _jspx_th_c_choose_1_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:choose ---- //
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_1 = new org.apache.taglibs.standard.tag.common.core.ChooseTag();
    _jspx_th_c_choose_1.setPageContext(pageContext);
    _jspx_th_c_choose_1.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    try {
      int _jspx_eval_c_choose_1 = _jspx_th_c_choose_1.doStartTag();
      if (_jspx_eval_c_choose_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template10);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_1_fn(pageContext, _jspx_th_c_choose_1)) return true;


          out.write(_jspx_template22);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_0_fn(pageContext, _jspx_th_c_choose_1)) return true;


          out.write(_jspx_template24);

        } while (_jspx_th_c_choose_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_choose_1.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_choose_1.release();
    }
    return false;
  }

  private boolean _jspx_th_c_when_1_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:when ---- //
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = new org.apache.taglibs.standard.tag.rt.core.WhenTag();
    _jspx_th_c_when_1.setPageContext(pageContext);
    _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_when_1.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${corpCode!= null && !empty corpCode}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
      if (_jspx_eval_c_when_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template11);
          // ----  c:forEach ---- invoke //
          if (_jspx_th_c_forEach_0_fn(pageContext, _jspx_th_c_when_1)) return true;


          out.write(_jspx_template21);

        } while (_jspx_th_c_when_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_when_1.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_when_1.release();
    }
    return false;
  }

  private boolean _jspx_th_c_otherwise_0_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:otherwise ---- //
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = new org.apache.taglibs.standard.tag.common.core.OtherwiseTag();
    _jspx_th_c_otherwise_0.setPageContext(pageContext);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    try {
      int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
      if (_jspx_eval_c_otherwise_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template23);

        } while (_jspx_th_c_otherwise_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_otherwise_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_otherwise_0.release();
    }
    return false;
  }

  private boolean _jspx_th_c_forEach_0_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:forEach ---- //
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = new org.apache.taglibs.standard.tag.rt.core.ForEachTag();
    _jspx_th_c_forEach_0.setPageContext(pageContext);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${corpCode}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("corpCode");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template12);
            // jsp code [from=(136,98);to=(136,109)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${corpCode.RN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template13);
            // jsp code [from=(139,28);to=(139,46)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${corpCode.OFFICE_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template14);
            // jsp code [from=(144,28);to=(144,45)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${corpCode.JIJUM_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template15);
            // jsp code [from=(149,28);to=(149,46)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${corpCode.OFFICE_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            // jsp code [from=(149,49);to=(149,66)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${corpCode.JIJUM_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template16);
            // jsp code [from=(153,60);to=(153,78)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${corpCode.OFFICE_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template17);
            // jsp code [from=(153,85);to=(153,102)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${corpCode.JIJUM_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template18);
            // jsp code [from=(153,109);to=(153,127)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${corpCode.OFFICE_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template19);
            // jsp code [from=(153,133);to=(153,150)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${corpCode.JIJUM_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template20);

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

  private final static String _jspx_template0 = "\r\n\r\n";
  private final static String _jspx_template1 = "\r\n";
  private final static String _jspx_template2 = "\r\n";
  private final static String _jspx_template3 = "\r\n";
  private final static String _jspx_template4 = "\r\n\r\n<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>점용 업체 찾기</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody,td,th {\r\n\tfont-family: 돋움;\r\n\tfont-size: 12px;\r\n\tcolor: #053e8a;\r\n}\r\nbody {\r\n\tmargin-left: 0px;\r\n\tmargin-top: 0px;\r\n\tmargin-right: 0px;\r\n\tmargin-bottom: 0px;\r\n}\r\n.style1 {color: #000000}\r\n.style3 {color: #FF6600; font-weight: bold; }\r\n\r\n-->\r\n</style>\r\n<script language=\"JavaScript\" src=\"/js/common.js\"></script>\r\n<script language=\"javascript\">\r\n//<!--\r\n\tfunction retrieveCorpCode()\r\n\t{\r\n\t\r\n\t\tvar w = document.form;\r\n\t\t\r\n\t//\tif(!checkStrNVMsg(w.corpNm, \"업체명\"))\r\n\t//\t\treturn;\r\n\r\n\t\tw.submit();\r\n\t}\r\n\t\r\n\tfunction selectCorp(corpNm, jijumNm, office_code, jijum_code)\r\n\t{\r\n\t\tvar w = document.form;\r\n\t\t\r\n\t\tif(w.openerCorpNm.value\t!= \"\")\r\n\t\t{\r\n\t\t\tvar\tofficeNmValue\t= eval(\"opener.document.\" + w.openerCorpNm.value);\r\n\t\t\tofficeNmValue.value\t= corpNm;\r\n\t\t}\r\n\t\tif(w.openerOffice.value\t!= \"\")\r\n\t\t{\r\n\t\t\tvar\tjijumNmValue\t\t= eval(\"opener.document.\" + w.openerOffice.value);\r\n\t\t\tjijumNmValue.value\t\t= jijumNm;\r\n\t\t}\r\n\t\tif(w.openerCorpCd.value\t!= \"\")\r\n\t\t{\r\n\t\t\tvar\tcodeValue\t\t= eval(\"opener.document.\" + w.openerCorpCd.value);\r\n\t\t\tcodeValue.value\t\t= trim(office_code)+trim(jijum_code);\r\n\t\t}\r\n\t\twindow.close();\r\n\t}\r\n\t\t\r\n//-->\r\n</script>\r\n</head>\r\n\r\n<body onLoad=\"javascript:document.form.corpNm.focus();\">\r\n<form name=\"form\" method=\"post\" action=\"corpcode.do\">\r\n<input type=\"hidden\" name=openerCorpNm value=\"";
  private final static String _jspx_template5 = "\">\r\n<input type=\"hidden\" name=\"openerOffice\" value=\"";
  private final static String _jspx_template6 = "\">\r\n<input type=\"hidden\" name=\"openerCorpCd\" value=\"";
  private final static String _jspx_template7 = "\">\r\n\r\n<table width=\"400\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n  <tr>\r\n    <td background=\"/img/zipcode/border_bg.gif\" style=\"padding:6\">\r\n\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t  <tr>\r\n\t\t\t<td background=\"/img/zipcode/title_bg.gif\" style=\"font-size:14px; font-weight:bold; color:#FFFFFF\"><img src=\"/img/zipcode/title_po.gif\" align=\"absmiddle\"> 업체찾기</td>\r\n\t\t  </tr>\r\n\t\t  <tr>\r\n\t\t\t<td align=\"center\" bgcolor=\"#FFFFFF\" style=\"padding:20 5 20 5\">\r\n\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t\t\t  <tr>\r\n\t\t\t\t    <td style=\"padding:10 10 10 5\"><img src=\"/img/zipcode/pop_icon.gif\"></td>\r\n\t\t\t        <td style=\"padding:5\">\r\n\t\t\t\t\t  <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t\t<td width=\"3\" bgcolor=\"#053e8a\"></td>\r\n\t\t\t\t\t\t\t<td style=\"padding-left:5; line-height:15px\"><b>찾고자하는 업체명을 입력하세요.</b><br>\r\n\t\t\t\t\t\t\t\t<font color=\"#FF6600\">(예: 한국전력공사)</font></td>\r\n\t\t\t\t\t\t  </tr>\r\n\t\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t    <td></td>\r\n\t\t\t\t\t\t    <td height=\"12\"></td>\r\n\t\t\t\t\t    </tr>\r\n\t\t\t\t\t\t  \r\n\t\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t    <td></td>\r\n\t\t\t\t\t\t    <td style=\"padding-left:5; line-height:15px\">업체명: \r\n\t\t\t\t\t\t      <input type=\"text\" name=\"corpNm\" class=\"text_box\" style=\"width:120px;height:19px\" maxlength=\"20\" value=\"\" title=\"지역명\" style=\"ime-mode:active\">\r\n\t\t\t\t\t\t      <a href=\"javascript:retrieveCorpCode();\"><img src=\"/img/zipcode/pop_search.gif\" align=\"absmiddle\" border=\"0\"></a>\r\n\t\t\t\t\t    </tr>\r\n\t\t\t\t\t  </table>\t\t\t\t\t</td>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td colspan=\"2\" height=\"1\" background=\"/img/zipcode/dot.gif\"></td>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t  <tr>\r\n\t\t\t\t  <td colspan=\"2\" align=\"center\" style=\"color: red\">※존재하지 않는 업체에 경우 관리자에게 문의하세요.</td>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t  <tr>\r\n\t\t\t\t    <td colspan=\"2\" align=\"center\" style=\"padding:10 10 0 10\">\r\n\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"1\" cellpadding=\"0\" bgcolor=\"#D8E2EB\">\r\n                      <tr>\r\n                        <td colspan=\"5\" bgcolor=\"#3A77A9\" height=\"2\"></td>\r\n                      </tr>\r\n\t\t\t\t\t  ";
  private final static String _jspx_template8 = "\r\n\t\t\t\t\t  ";
  private final static String _jspx_template9 = "\r\n                      <!-- choose start -->\r\n\t\t\t\t\t  ";
  private final static String _jspx_template10 = "\r\n\t\t\t\t\t  ";
  private final static String _jspx_template11 = "\r\n                      <tr>\r\n                        <td width=\"30\" height=\"22\" align=\"center\" bgcolor=\"#F8FBFE\"><strong>번호</strong></td>\r\n                        <td width=\"120\" height=\"22\" align=\"center\" bgcolor=\"#F8FBFE\"><strong>시설물 관련 업체명</strong></td>\r\n                        <td width=\"90\" height=\"22\" align=\"center\" bgcolor=\"#F8FBFE\"><strong>지사 및 지점명</strong> </td>\r\n                        <td width=\"50\" height=\"22\" align=\"center\" bgcolor=\"#F8FBFE\"><strong>코드값</strong> </td>\r\n                        <td width=\"50\" height=\"22\" align=\"center\" bgcolor=\"#F8FBFE\"><strong>선 택</strong></td>\r\n                      </tr>\r\n                      <!--  loop start -->\r\n\t\t\t\t\t  ";
  private final static String _jspx_template12 = "\r\n                      <tr>\r\n                         <td height=\"22\" align=\"center\" bgcolor=\"#FFFFFF\"><span class=\"style1\">";
  private final static String _jspx_template13 = "</span></td>\r\n                         <td bgcolor=\"#FFFFFF\" style=\"padding-right:5; padding-left:5\">\r\n                        \t<span class=\"style1\">\r\n                        \t";
  private final static String _jspx_template14 = "\r\n                        \t</span>\r\n                         </td>\r\n                         <td bgcolor=\"#FFFFFF\" style=\"padding-right:5; padding-left:5\">\r\n                        \t<span class=\"style1\">\r\n                        \t";
  private final static String _jspx_template15 = "\r\n                        \t</span>\r\n                         </td>\r\n                         <td bgcolor=\"#FFFFFF\" align=\"center\" style=\"padding-right:5; padding-left:5\">\r\n                        \t<span class=\"style3\">\r\n                        \t";
  private final static String _jspx_template16 = "\r\n                        \t</span>\r\n                         </td>\r\n                         <td align=\"center\" bgcolor=\"#FFFFFF\">\r\n                        \t<a href=\"javascript:selectCorp('";
  private final static String _jspx_template17 = "', '";
  private final static String _jspx_template18 = "', '";
  private final static String _jspx_template19 = "','";
  private final static String _jspx_template20 = "');\"><img src=\"/img/zipcode/select.gif\" align=\"absmiddle\" border=\"0\">\r\n                        \t</a>\r\n                         </td>\r\n                      </tr>\r\n                      ";
  private final static String _jspx_template21 = "\r\n\t\t\t\t\t   <!-- loop end -->\r\n\t\t\t\t\t  ";
  private final static String _jspx_template22 = "\r\n\t\t\t\t\t  \r\n\t\t   \t\t\t  ";
  private final static String _jspx_template23 = "\r\n\t\t\t\t  \t   <tr>\r\n\t                    <td align=\"center\" bgcolor=\"#FFFFFF\" colspan=\"3\" height=\"85\">검색된 내용이 없습니다</td>\r\n\t                  </tr>\t\t\t\t  \t\t\t\t  \r\n\t\t   \t\t\t";
  private final static String _jspx_template24 = "\r\n\t\t   \t\t\t";
  private final static String _jspx_template25 = "\r\n\t\t   \t\t\t<!-- choose end -->\r\n\t\t\t\t      ";
  private final static String _jspx_template26 = "\r\n\t\t\t\t      ";
  private final static String _jspx_template27 = "\r\n\t\t\t\t      <tr>\r\n\t\t\t\t      \t<td align=\"center\" bgcolor=\"#FFFFFF\" colspan=\"3\" height=\"85\">검색해 주세요</td>\r\n\t\t\t\t      </tr>\r\n\t\t\t\t      ";
  private final static String _jspx_template28 = "\r\n\t\t\t\t      ";
  private final static String _jspx_template29 = "\r\n                    </table></td>\r\n\t\t\t      </tr>\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td colspan=\"2\" align=\"right\" style=\"padding:10 10 0 10\">\r\n\t\t\t\t\t<a href=\"javascript:window.close();\"><img src=\"/img/zipcode/pop_close.gif\" align=\"absmiddle\" border=\"0\"></a></td>\r\n\t\t\t\t  </tr>\r\n\t\t\t  </table></td>\r\n\t\t  </tr>\r\n\t\t</table></td>\r\n  </tr>\r\n</table>\r\n</form>\r\n</body>\r\n</html>\r\n";
}
