package jeus_jspwork._jsp._gapan._jumyong;

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
      out.write(_jspx_template10);
      out.write(_jspx_template11);
      out.write(_jspx_template12);
      // jsp code [from=(492,79);to=(492,87)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(492,99);to=(492,110)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${use_section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(506,61);to=(506,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(507,49);to=(507,52)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(509,55);to=(509,61)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${userId}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(513,53);to=(513,61)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${use_type}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(514,59);to=(514,70)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${use_section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(560,55);to=(560,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(573,69);to=(573,77)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(574,68);to=(574,76)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(575,68);to=(575,76)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(582,174);to=(582,182)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // jsp code [from=(582,194);to=(582,205)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${use_section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);
      // ----  c:choose ---- invoke //
      if (_jspx_th_c_choose_0_fn(pageContext, null)) return;


      out.write(_jspx_template35);
      // jsp code [from=(606,67);to=(606,75)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template36);
      // jsp code [from=(607,67);to=(607,75)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template37);
      // jsp code [from=(608,67);to=(608,75)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template38);
      // ----  c:choose ---- invoke //
      if (_jspx_th_c_choose_1_fn(pageContext, null)) return;


      out.write(_jspx_template48);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_0_fn(pageContext, null)) return;


      out.write(_jspx_template50);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_1_fn(pageContext, null)) return;


      out.write(_jspx_template52);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_2_fn(pageContext, null)) return;


      out.write(_jspx_template54);

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
          out.write(_jspx_template26);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template30);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template34);

        } while (_jspx_th_c_choose_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_choose_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_choose_0.release();
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
    try {
      int _jspx_eval_c_choose_1 = _jspx_th_c_choose_1.doStartTag();
      if (_jspx_eval_c_choose_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template39);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_1_fn(pageContext, _jspx_th_c_choose_1)) return true;


          out.write(_jspx_template43);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_1_fn(pageContext, _jspx_th_c_choose_1)) return true;


          out.write(_jspx_template47);

        } while (_jspx_th_c_choose_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_choose_1.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_choose_1.release();
    }
    return false;
  }

  private boolean _jspx_th_c_if_0_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:if ---- //
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = new org.apache.taglibs.standard.tag.rt.core.IfTag();
    _jspx_th_c_if_0.setPageContext(pageContext);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ use_section == 1 }", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template49);

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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ use_section == 4 }", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
      if (_jspx_eval_c_if_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template51);

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
    _jspx_th_c_if_2.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${showExamination == 'true'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
      if (_jspx_eval_c_if_2 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template53);

        } while (_jspx_th_c_if_2.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_2.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_2.release();
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
    _jspx_th_c_when_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${CAL_MODE == 'cal4'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
      if (_jspx_eval_c_when_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template27);
          // jsp code [from=(598,58);to=(598,66)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template28);
          // jsp code [from=(599,57);to=(599,65)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template29);

        } while (_jspx_th_c_when_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_when_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_when_0.release();
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
          out.write(_jspx_template31);
          // jsp code [from=(602,58);to=(602,66)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template32);
          // jsp code [from=(603,57);to=(603,65)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template33);

        } while (_jspx_th_c_otherwise_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_otherwise_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_otherwise_0.release();
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
    _jspx_th_c_when_1.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${CAL_MODE == 'cal4'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
      if (_jspx_eval_c_when_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template40);
          // jsp code [from=(617,166);to=(617,174)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template41);
          // jsp code [from=(617,186);to=(617,197)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${use_section}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template42);

        } while (_jspx_th_c_when_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_when_1.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_when_1.release();
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
          out.write(_jspx_template44);
          // jsp code [from=(620,167);to=(620,175)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template45);
          // jsp code [from=(620,187);to=(620,198)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${use_section}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template46);

        } while (_jspx_th_c_otherwise_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_otherwise_1.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_otherwise_1.release();
    }
    return false;
  }

  private final static String _jspx_template0 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n";
  private final static String _jspx_template1 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('사용자의 사용시간이 종료되었습니다. 다시 접속 해주시기 바랍니다.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template2 = "\r\n";
  private final static String _jspx_template3 = "\r\n";
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "  \r\n";
  private final static String _jspx_template6 = "  \r\n";
  private final static String _jspx_template7 = "\r\n";
  private final static String _jspx_template8 = "\r\n";
  private final static String _jspx_template9 = "\r\n\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script language=\"javascript\" src=\"/js/common.js\"></script>\r\n<script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script>\r\n<script language=\"javascript\" src=\"/js/calculation.js\"></script>\r\n<script language=\"javascript\" src=\"/js/selectItem.js\"></script>\r\n<script language=\"javascript\" src=\"/js/Check_inputbox.js\"></script>\r\n<script language=\"javascript\" src=\"/js/Ajax_request.js\"></script>\r\n<script language=\"javascript\" src=\"/jsp/RexServer/rexscript/rexpert.js\"></script>\r\n<script language=\"javascript\" src=\"/jsp/RexServer/rexscript/rexpert_properties.js\"></script>\r\n\r\n<script type=\"text/javascript\">\r\n//<![CDATA[\r\n\r\n\tfunction\tSearch()\r\n\t{\r\n\t\tvar form = document.form;\r\n\r\n\t\tform.action = \"search.do\";\r\n\t\tform.submit();\r\n\t}\r\n\r\n\tfunction iFrameResize(obj)\r\n\t{\r\n\t\tvar iFrm = obj;\r\n\t\tvar the_height = iFrm.contentWindow.document.body.scrollHeight;\r\n\t\tiFrm.style.height = the_height + \"px\";\r\n\t}\r\n\r\n\tfunction \tTabUp_Img(Tab_Value)\r\n\t{\r\n\t\tvar\timg1\t= document.getElementById(\"minwon_img\");\r\n\t\tvar\timg2\t= document.getElementById(\"unyong_img\");\r\n\t\tvar\timg3\t= document.getElementById(\"jumin_img\");\r\n\t\tvar\timg4\t= document.getElementById(\"jumji_img\");\r\n\r\n\t\timg1.src\t= \"/img/sub_petition_title9_off.gif\";\r\n\t\timg2.src\t= \"/img/sub_gapan_title4_off.gif\";\r\n\t\timg3.src\t= \"/img/sub_gapan_title5_off.gif\";\r\n\t\timg4.src\t= \"/img/sub_petition_title10_off.gif\";\r\n\r\n\t\tif(Tab_Value\t== \"minwon\")\r\n\t\t{\r\n\t\t\timg1.src\t\t= \"/img/sub_petition_title9_on.gif\";\r\n\t\t}\r\n\t\telse if(Tab_Value\t== \"unyong\")\r\n\t\t{\r\n\t\t\timg2.src\t\t= \"/img/sub_gapan_title4_on.gif\";\r\n\t\t}\r\n\t\telse if(Tab_Value\t== \"jumin\")\r\n\t\t{\r\n\t\t\timg3.src\t\t= \"/img/sub_petition_title3_on.gif\";\r\n\t\t}\r\n\t\telse if(Tab_Value\t== \"jumji\")\r\n\t\t{\r\n\t\t\timg4.src\t\t= \"/img/sub_petition_title10_on.gif\";\r\n\t\t}\r\n\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABUP\");\r\n\t\ttab.value\t= Tab_Value;\r\n\t}\r\n\t\r\n\tfunction \tTab_Img(Tab_Value)\r\n\t{\r\n\t\tvar\timg2\t= document.getElementById(\"unyong_img\");\r\n\t\tvar\timg3\t= document.getElementById(\"jumin_img\");\r\n\t\tvar\timg4\t= document.getElementById(\"jumji_img\");\r\n\t\r\n\t\timg2.src\t= \"/img/sub_gapan_title4_off.gif\";\r\n\t\timg3.src\t= \"/img/sub_gapan_title5_off.gif\";\r\n\t\timg4.src\t= \"/img/sub_petition_title10_off.gif\";\r\n\t\t\r\n\t\tif(Tab_Value\t== \"unyong\")\r\n\t\t{\r\n\t\t\timg2.src\t\t= \"/img/sub_gapan_title4_on.gif\";\r\n\t\t}\r\n\t\telse if(Tab_Value\t== \"jumin\")\r\n\t\t{\r\n\t\t\timg3.src\t\t= \"/img/sub_gapan_title5_on.gif\";\r\n\t\t}\r\n\t\telse if(Tab_Value\t== \"jumji\")\r\n\t\t{\r\n\t\t\timg4.src\t\t= \"/img/sub_petition_title10_on.gif\";\r\n\t\t}\r\n\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABUP\");\r\n\r\n\t\ttab.value\t= Tab_Value;\r\n\t}\r\n\t\r\n\tfunction \tTabDown_Img(Tab_Value)\r\n\t{\r\n\t\tvar\timg1\t= document.getElementById(\"product_img\");\r\n\t\t//var\timg2\t= document.getElementById(\"place_img\");\r\n\t\tvar img3\t= document.getElementById(\"violation\");\r\n       \tvar img4\t= document.getElementById(\"documents\");\r\n    \tvar img5\t= document.getElementById(\"rental_img\");\r\n\r\n\r\n\t\timg1.src\t= \"/img/rojum_cal1_title_off.gif\";\r\n\t\t//img2.src\t= \"/img/sub_petition_title7_off.gif\";\t\t\t\t\r\n\t\timg3.src\t= \"/img/sub_petition_title18_off.gif\";\r\n    \timg4.src\t= \"/img/sub_petition_title19_off.gif\";\r\n\t\timg5.src\t= \"/img/gapan_cal4_title_off.gif\";\r\n\t\t\r\n\t\t\r\n\t\tif(Tab_Value\t== \"product\")\r\n\t\t{\r\n\t\t\timg1.src\t\t= \"/img/rojum_cal1_title_on.gif\";\r\n\t\t}\r\n\t\telse if(Tab_Value\t== \"rental\")\r\n\t\t{\r\n\t\t\timg5.src\t\t= \"/img/gapan_cal4_title_on.gif\";\r\n\t\t}\r\n\t\t//else if(Tab_Value\t== \"place\")\r\n\t\t//{\r\n\t\t//\timg2.src\t\t= \"/img/sub_petition_title7_on.gif\";\r\n\t\t//}\r\n\t\telse if(Tab_Value\t== \"history\")\r\n\t\t{\r\n\t\t\timg3.src\t\t= \"/img/sub_petition_title8_on.gif\";\r\n\t\t}\r\n\t\telse if(Tab_Value\t== \"violation\")\r\n\t\t{\r\n\t\t\timg3.src\t\t= \"/img/sub_petition_title18_on.gif\";\r\n\t\t}\r\n        else if(Tab_Value\t== \"documents\")\r\n\t\t{\r\n\t\t\timg4.src\t\t= \"/img/sub_petition_title19_on.gif\";\r\n\t\t}\r\n\t\t\r\n\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABDOWN\");\r\n\t\ttab.value\t= Tab_Value";
  private final static String _jspx_template10 = ";\r\n\r\n\t}\r\n\r\n\tfunction Tab_Minwon(adminno)\r\n\t{\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABUP\");\r\n\t\tvar section = document.getElementById(\"SECTION\").value;\r\n\t\t\r\n\t\tif(tab.value\t== \"minwon\")\r\n\t\t\treturn;\r\n\t\telse\r\n\t\t\ttab.value\t= \"minwon\";\r\n\r\n\t\tvar tabs \t= document.getElementById(\"tabUp\");\r\n\t\tTabUp_Img(\"minwon\");\r\n\t\ttabs.src\t= \"/gapan/jumyonginfo/minwon_view.do?GAPAN_NO=\" + adminno+\"&SECTION=\"+section;\t\t\r\n\t}\r\n\r\n\tfunction Tab_Unyong(gapanno)\r\n\t{\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABUP\");\r\n\t\tvar section = document.getElementById(\"SECTION\").value;\r\n\t\t\r\n\t\tif(tab.value\t== \"unyong\")\r\n\t\t\treturn;\r\n\t\telse\r\n\t\t\ttab.value\t= \"unyong\";\r\n\t\t\r\n\t\tvar tabs \t= document.getElementById(\"tabUp\");\r\n\t\ttabs.src\t= \"/gapan/jumyonginfo/unyong_view.do?GAPAN_NO=\" + gapanno+\"&SECTION=\"+section;\r\n\t}\r\n\r\n\tfunction Tab_Jumin(gapanno)\r\n\t{\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABUP\");\r\n\t\tvar section = document.getElementById(\"SECTION\").value; \r\n\t\t\r\n\t\tif(tab.value\t== \"jumin\")\r\n\t\t\treturn;\r\n\t\telse\r\n\t\t\ttab.value\t= \"jumin\";\r\n\t\t\r\n\t\tvar tabs \t= document.getElementById(\"tabUp\");\r\n\t\ttabs.src\t= \"/gapan/jumyonginfo/jumin_view.do?GAPAN_NO=\"+gapanno+\"&SECTION=\"+section;\r\n\t}\r\n\t\r\n\tfunction Tab_Jumji(gapanno)\r\n\t{\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABUP\");\r\n\r\n\t\tif(tab.value\t== \"jumji\")\r\n\t\t\treturn;\r\n\t\telse\r\n\t\t\ttab.value\t= \"jumji\";\r\n\r\n\t\tvar tabs\t= document.getElementById(\"tabUp\");\r\n\t\ttabs.src\t= \"/gapan/jumyonginfo/jumji_view.do?GAPAN_NO=\" + gapanno;\r\n\t}\r\n\r\n\tfunction Tab_Product(gapanno)\r\n\t{\t\t\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABDOWN\");\r\n\t\tif(tab.value\t== \"product\")\r\n\t\t\treturn;\r\n\t\telse\r\n\t\t\ttab.value\t= \"product\";\r\n\r\n\t\tvar\tseq\t= document.getElementById(\"SEQ\").value;\r\n\r\n\t\tTabDown_Img(\"product\");\t\t\r\n\t\tvar tabs\t= document.getElementById(\"tabDown\");\r\n\t\ttabs.src\t= \"/gapan/jumyong/productInsert.do?GAPAN_NO=\" + gapanno + \"&SEQ=\" + seq;\t\t\r\n\t\t\r\n\t}\r\n\r\n\tfunction Tab_Rental(gapanno)\r\n\t{\t\t\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABDOWN\");\r\n\t\tif(tab.value\t== \"rental\")\r\n\t\t\treturn;\r\n\t\telse\r\n\t\t\ttab.value\t= \"rental\";\r\n\r\n\t\tvar\tseq\t= document.getElementById(\"SEQ\").value;\r\n\r\n\t\tTabDown_Img(\"rental\");\t\t\r\n\t\tvar tabs\t= document.getElementById(\"tabDown\");\r\n\t\ttabs.src\t= \"/gapan/jumyong/rentalInsert.do?GAPAN_NO=\" + gapanno + \"&SEQ=\" + seq;\t\t\r\n\t\t\r\n\t}\r\n\t\r\n\t\r\n\tfunction Tab_Inspect(gapanno)\r\n\t{\t\t\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABDOWN\");\r\n\t\tif(tab.value\t== \"inspect\")\r\n\t\t\treturn;\r\n\t\telse\r\n\t\t\ttab.value\t= \"inspect\";\r\n\t\t\r\n\t\tTabDown_Img(\"inspect\");\r\n\t\tvar tabs\t= document.getElementById(\"tabDown\");\r\n\t\ttabs.src\t= \"/jumyong/inspectEdit.do?no=\" + gapanno;\r\n\t}\r\n\t\r\n\tfunction Tab_Conf(gapanno)\r\n\t{\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABDOWN\");\r\n\t\t\r\n\t\tif(tab.value\t== \"conf\")\r\n\t\t\treturn;\r\n\t\telse if(tab.value == null)\r\n\t\t\ttab.value\t= \"conf\";\r\n\t\t\r\n\t\tTabDown_Img(\"conf\");\r\n\t\tvar tabs\t= document.getElementById(\"tabDown\");\r\n\t\ttabs.src\t= \"/jumyong/confEdit.do?no=\" + gapanno;\r\n\r\n\t}\r\n\r\n\tfunction Tab_Place(gapanno,gpTyp)\r\n\t{\t\t\r\n\t\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABDOWN\");\r\n\t\tif(tab.value\t== \"place\")\r\n\t\t\treturn;\r\n\t\telse\r\n\t\t\ttab.value\t= \"place\";\r\n\t\t\r\n\t\tTabDown_Img(\"place\");\r\n\t\tvar tabs\t= document.getElementById(\"tabDown\");\r\n\t\ttabs.src\t= \"/jsp/jumyong/jumyong/info_place.jsp?no=\" + gapanno+\"&gp_typ=\"+gpTyp+\"&GP_TYP=\"+gpTyp;\r\n\t}\r\n\t\r\n\tfunction Tab_History(gapanno)\r\n\t{\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABDOWN\");\r\n\t\tif(tab.value\t== \"history\")\r\n\t\t\treturn;\r\n\t\telse\r\n\t\t\ttab.value\t= \"history\";\r\n\t\t\r\n\t\tTabDown_Img(\"history\");\t\t\r\n\t\tvar tabs\t= document.getElementById(\"tabDown\");\r\n\t\t\r\n\t\ttabs.src\t= \"/jumyong/saewe/sunap_view.do?GAPAN_NO=\" + gapanno;\r\n\t}\r\n\r\n\tfunction Tab_Violation(gapanno, gptyp)\r\n\t{\t\t\r\n\t\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABDOWN\");\r\n\t\tif(tab.value\t== \"violation\")\r\n\t\t\treturn;\r\n\t\telse\r\n\t\t\ttab.value\t= \"violation\";\r\n\t\t\r\n\t\tTabDown_Img(\"violation\");\r\n\t\tvar tabs\t= document.getElementById(\"tabDown\");\r\n\t\ttabs.src\t= \"/gapan/jumyong/info_violation.do?GAPAN_NO=\" + gapanno + \"&GP_TYP=\" + gptyp;\r\n\t}\r\n\r\n\tfunction Tab_Documents(gapanno, gptyp)\r\n\t{\t\t\r\n\t\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABDOWN\");\r\n\t\tif(tab.value\t== \"documents\")";
  private final static String _jspx_template11 = "\r\n\t\t\treturn;\r\n\t\telse\r\n\t\t\ttab.value\t= \"documents\";\r\n\t\t\r\n\t\tTabDown_Img(\"documents\");\r\n\t\tvar tabs\t= document.getElementById(\"tabDown\");\r\n\t\ttabs.src\t= \"/gapan/jumyong/info_documents.do?GAPAN_NO=\" + gapanno + \"&GP_TYP=\" + gptyp;\r\n\t}\r\n\r\n\tvar historyBack;\r\n\tfunction \tInit()\r\n\t{\r\n\t\thistoryBack = document.referrer;\r\n\t}\r\n\r\n\r\n\t\r\n\t\r\n\tfunction fnPreView()\r\n\t{\t\r\n\t\tvar oRptMainParam;\r\n\t\toRptMainParam = rex_GetgoDictionay(); \r\n\r\n\t\t// 옵션 - viewer\t\r\n\t\toRptMainParam.put(\"rex_open_window\", \"center=yes,scrollbars=no,status=no,toolbar=no,resizable=0,location=no,menu=no,width=1000,height=1000\");\r\n\t\t\r\n\t\t// 필수 - 레포트명\r\n\t\toRptMainParam.put(\"rex_rptname\", \"Rojum_examin\");\r\n\r\n\t\t// 필수 - 데이터 타입 설정\r\n\t\toRptMainParam.put(\"rex_datatype\", \"XML\");  // XML, CSV\r\n\r\n\t\t// 옵션 - 다른 DB를 연결시\r\n\t\toRptMainParam.put(\"rex_userservice\", \"oracle_jndi\");\r\n\r\n\t\t// 옵션 - 파라메터 설정\r\n\t\tvar form \t= document.form;\r\n\t\t\r\n\t\toRptMainParam.put(\"GAPAN_NO\" ,form.GAPAN_NO.value);\r\n\t\toRptMainParam.put(\"YEAR\" ,form.year.value);\r\n\t\toRptMainParam.put(\"SEQ\" ,form.SEQ.value);\r\n\t\toRptMainParam.put(\"USER_ID\" ,form.USER_ID.value);\r\n\t\r\n\t\t// preview 팝업 열기\r\n\t\trex_gfRexRptOpen(\"popup\", oRptMainParam);\r\n\t\t\t\r\n\t\treturn oRptMainParam;\t\t\t\r\n\t}\r\n\r\n\tfunction fnPreView_pay()\r\n\t{\t\r\n\t\tvar oRptMainParam;\r\n\t\toRptMainParam = rex_GetgoDictionay(); \r\n\r\n\t\t// 옵션 - viewer\t\r\n\t\toRptMainParam.put(\"rex_open_window\", \"center=yes,scrollbars=no,status=no,toolbar=no,resizable=0,location=no,menu=no,width=1000,height=1000\");\r\n\t\t\r\n\t\t// 필수 - 레포트명\r\n\t\toRptMainParam.put(\"rex_rptname\", \"examination_pay\");\r\n\r\n\t\t// 필수 - 데이터 타입 설정\r\n\t\toRptMainParam.put(\"rex_datatype\", \"XML\");  // XML, CSV\r\n\r\n\t\t// 옵션 - 다른 DB를 연결시\r\n\t\toRptMainParam.put(\"rex_userservice\", \"oracle_jndi\");\r\n\r\n\t\t// 옵션 - 파라메터 설정\r\n\t\tvar form \t= document.form;\r\n\t\tvar mudanForm  = tabDown.productForm.mudanForm.value;\r\n\t\tvar mudanPrice = tabDown.productForm.mudanPrice.value;\r\n\t\tvar mudanTotalSum = tabDown.productForm.mudanTotalSum.value;\r\n\t\t\tmudanForm = mudanForm.split('-').join(\"\\n -\");\r\n\t\t\tmudanPrice = mudanPrice.split('-').join(\"\\n\");\r\n\r\n\t\toRptMainParam.put(\"GAPAN_NO\" ,form.GAPAN_NO.value);\r\n\t\toRptMainParam.put(\"SEQ\" ,form.SEQ.value);\r\n\t\toRptMainParam.put(\"CAL_INFO\" ,mudanForm);\r\n\t\toRptMainParam.put(\"PRICE\" ,mudanPrice);\r\n\t\toRptMainParam.put(\"TOTAL_SUM\" ,mudanTotalSum);\r\n\t\r\n\t\t// preview 팝업 열기\r\n\t\trex_gfRexRptOpen(\"popup\", oRptMainParam);\r\n\t\t\t\r\n\t\treturn oRptMainParam;\t\t\t\r\n\t}\r\n\t\r\n\tfunction fnOccupancyLicense()\r\n\t{\r\n\t\tvar oRptMainParam;\r\n\t\toRptMainParam = rex_GetgoDictionay(); \r\n\r\n\t\t// 옵션 - viewer\t\r\n\t\toRptMainParam.put(\"rex_open_window\", \"center=yes,scrollbars=no,status=no,toolbar=no,resizable=0,location=no,menu=no,width=1000,height=1000\");\r\n\t\t\r\n\t\t// 필수 - 레포트명\r\n\t\toRptMainParam.put(\"rex_rptname\", \"Rojum_license\");\r\n\r\n\t\t// 필수 - 데이터 타입 설정\r\n\t\toRptMainParam.put(\"rex_datatype\", \"XML\");  // XML, CSV\r\n\r\n\t\t// 옵션 - 다른 DB를 연결시\r\n\t\toRptMainParam.put(\"rex_userservice\", \"oracle_jndi\");\r\n\r\n\t\t// 옵션 - 파라메터 설정\r\n\t\tvar form \t= document.form;\r\n\t\t\r\n\t\toRptMainParam.put(\"GAPAN_NO\" ,form.GAPAN_NO.value);\r\n\t\toRptMainParam.put(\"YEAR\" ,form.year.value);\r\n\t\toRptMainParam.put(\"SEQ\" ,form.SEQ.value);\r\n\t\toRptMainParam.put(\"GP_TYP\" ,form.GP_TYP.value);\r\n\r\n\t\t// preview 팝업 열기\r\n\t\trex_gfRexRptOpen(\"popup\", oRptMainParam);\r\n\t\t\t\r\n\t\treturn oRptMainParam;\t\r\n\t}\r\n\r\n\tfunction fnRojumContract()\r\n\t{\r\n\t\tvar oRptMainParam;\r\n\t\toRptMainParam = rex_GetgoDictionay(); \r\n\r\n\t\t// 옵션 - viewer\t\r\n\t\toRptMainParam.put(\"rex_open_window\", \"center=yes,scrollbars=no,status=no,toolbar=no,resizable=0,location=no,menu=no,width=1000,height=1000\");\r\n\t\t\r\n\t\t// 필수 - 레포트명\r\n\t\toRptMainParam.put(\"rex_rptname\", \"Rojum_contract\");\r\n\t\r\n\t\t// 필수 - 데이터 타입 설정\r\n\t\toRptMainParam.put(\"rex_datatype\", \"XML\");  // XML, CSV\r\n\r\n\t\t// 옵션 - 다른 DB를 연결시\r\n\t\toRptMainParam.put(\"rex_userservice\", \"oracle_jndi\");\r\n\r\n\t\t// 옵션 - 파라메터 설정\r\n\t\tvar form \t= document.form;\r\n\t\t\r\n\t\toRptMainParam.put(\"GAPAN_NO\" ,form.GAPAN_NO.value);\r\n\t\toRptMainParam.put(\"GP_TYP\" ,form.GP_TYP.value);\r\n\t\toRptMainParam.put(\"USER_ID\" ,form.USER_ID.value);\r\n\t\toRptMainParam.put(\"GU_MANAGER\" ,\"김권태\");\r\n\t\toRptMainParam.put(\"SERVICE_ITEM\" ,\"디스,디스플러스,레종,타임\");\r\n\t\toRptMainParam.put(\"LOAN_PRICE\" ,\"9999999\");\r\n\t\r\n\t\t// preview 팝업 열기\r\n";
  private final static String _jspx_template12 = "\r\n\t\trex_gfRexRptOpen(\"popup\", oRptMainParam);\r\n\t\t\t\r\n\t\treturn oRptMainParam;\t\r\n\t}\r\n\t\r\n\tvar i = 0;\r\n\t\r\n\tfunction resizeTabup(value)\r\n\t{\r\n\t\tif(i%2 == 0)\r\n\t\tiFrameResize(document.getElementById(value));\t\r\n\t\telse\r\n\t\t{\t\t\r\n\t\t\tvar iFrm = document.getElementById(\"tabUp1\");\r\n\t\t\tvar the_height = 0;\r\n\t\t\tiFrm.style.height = the_height;\r\n\t\t}\t\r\n\t\ti=i+1;\r\n\t}\r\n\r\n\tfunction PopupDisUse(){\r\n\t\tif(document.getElementById(\"DlgDisuse\").style.visibility == \"hidden\"){\r\n\t\t\tdocument.getElementById(\"DisFrm\").src=\"/gapan/jumyong/disUse.do?GAPAN_NO=";
  private final static String _jspx_template13 = "&SECTION=";
  private final static String _jspx_template14 = "\";\r\n\t\t\tMessage_Display('DlgDisuse','DlgDisuseMain',1);\r\n\t\t}else{\r\n\t\t\tMessage_Display('DlgDisuse','DlgDisuseMain',0);\r\n\t\t}\r\n\t}\r\n\t\r\n//]]>\r\n</script>\r\n\r\n<body onload=\"Init();\">\r\n<form id=\"form\"  name=\"form\" method=\"post\">\r\n\r\n\r\n<input type=\"hidden\" id=\"GAPAN_NO\" name=\"GAPAN_NO\" value=\"";
  private final static String _jspx_template15 = "\">\r\n<input type=hidden id=\"SEQ\" name=\"SEQ\" value=\"";
  private final static String _jspx_template16 = "\">\r\n<input type=\"hidden\" id=\"year\" name=\"year\" value=\"\">\r\n<input type=hidden id=\"USER_ID\" name=USER_ID value=\"";
  private final static String _jspx_template17 = "\">\r\n\r\n<input type=\"hidden\" id=\"CURRENT_TABUP\" name=\"CURRENT_TABUP\" value=\"minwon\">\r\n<input type=\"hidden\" id=\"CURRENT_TABDOWN\" name=\"CURRENT_TABDOWN\" value=\"product\">\r\n<input type=\"hidden\" id=\"TYPE\" name=\"TYPE\" value=\"";
  private final static String _jspx_template18 = "\">\r\n<input type=\"hidden\" id=\"SECTION\" name=\"SECTION\" value=\"";
  private final static String _jspx_template19 = "\">\r\n<input type=\"hidden\" id=\"GP_TYP\" name=\"GP_TYP\" value=\"001\">\r\n\r\n\r\n<span id=\"DlgDisuse\" style=\"position: absolute; visibility: hidden;\">\r\n\t<table id=\"DlgDisuseMain\" width=\"510\" height=\"110px\" border=\"2\" bordercolor=\"#c9dfed\" style=\"border-collapse: collapse; background-color:white;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t<tr>\r\n\t\t<td height=\"20px\" align=\"center\">\r\n\t\t<font color=\"red\"> '폐쇄' 또는 '폐쇄 해지' 버튼을 다시 누르시면 이 창이 닫힙니다.</font>\r\n\t\t\r\n\t\t</td>\r\n\t\t\r\n\t\t</tr>\r\n\t\t<tr>\r\n\t\t\t<td align=\"center\">\r\n\t\t\t<table width=\"510\" height=\"90px\" border=\"0\" style=\"border-collapse: collapse; background-color: white;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td align=\"center\">\r\n\t\t\t\t\t\t<iframe width=\"100%\" height=\"100%\" id=\"DisFrm\" name=\"DisFrm\" align=\"middle\" frameborder=\"0\" onload=\"iFrameResize(this)\" scrolling=\"no\" ></iframe>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t</table>\r\n\t\t\t</td>\r\n\t\t</tr>\r\n\t</table>\r\n</span>\r\n\r\n\r\n<table width=\"800\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\r\n  <tr>\r\n    <td height=\"43\">\r\n    \t<img src=\"/img/sub9_cont1_title.gif\" width=\"800\" height=\"43\"></td>\r\n  </tr>\r\n  \r\n  <tr>\r\n    <td align=\"center\">\r\n    <table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n      <tr>\r\n        <td height=\"1\" bgcolor=\"eaeaea\"></td>\r\n      </tr>\r\n \r\n      <tr>\r\n        <td height=\"14\"></td>\r\n      </tr>\r\n      <tr>\r\n      \t<td align=\"right\" class=\"sub_table_b\">관리번호 : ";
  private final static String _jspx_template20 = "</td>\r\n      </tr>\r\n      \r\n      \r\n      \r\n      <tr>\r\n        <td align=\"left\">\r\n        <table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n        \r\n        <tr>\r\n            <td height=\"22\" background=\"/img/tab_line_purple.gif\">\r\n            <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                <tr>\r\n                  <td width=\"111\"><a href=\"javascript:Tab_Unyong('";
  private final static String _jspx_template21 = "')\"><img id=\"unyong_img\" name=\"unyong_img\" src=\"/img/sub_gapan_title4_off.gif\" alt=\"운영자 정보\" width=\"110\" height=\"22\" border=\"0\"></a></td>\r\n                  <td width=\"111\"><a href=\"javascript:Tab_Jumin('";
  private final static String _jspx_template22 = "')\"><img id=\"jumin_img\" name=\"jumin_img\" src=\"/img/sub_gapan_title5_off.gif\" alt=\"동업자 정보\" width=\"110\" height=\"22\" border=\"0\"></a></td>\r\n                  <td width=\"111\"><a href=\"javascript:Tab_Jumji('";
  private final static String _jspx_template23 = "')\"><img id=\"jumji_img\" name=\"jumji_img\" src=\"/img/sub_petition_title10_off.gif\" alt=\"시설/운영 정보\" width=\"110\" height=\"22\" border=\"0\"></a></td>\r\n                </tr>\r\n            </table>\r\n            </td>\r\n\t\t</tr>\r\n\t  <tr>\r\n\t\t<td>\r\n\t\t  \t<iframe width=\"100%\" height=\"100%\" id=\"tabUp\" name=\"tabUp\" frameborder=\"0\" onload=\"iFrameResize(this)\" scrolling=\"no\" src=\"/gapan/jumyonginfo/unyong_view.do?GAPAN_NO=";
  private final static String _jspx_template24 = "&SECTION=";
  private final static String _jspx_template25 = "\"></iframe>\r\n\t\t</td>\r\n\t  </tr>\r\n      <tr>\r\n        <td height=\"30\"></td>\r\n      </tr>\r\n\r\n      <tr>\r\n        <td align=\"left\">\r\n        <table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n          <tr>\r\n            <td height=\"22\" background=\"/img/tab_line_blue.gif\">\r\n            <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                <tr>\r\n\t\t\t\t  ";
  private final static String _jspx_template26 = "\r\n\t\t\t\t  ";
  private final static String _jspx_template27 = "\r\n\t\t\t\t\t<td width=\"111\" onclick =\"javascript:Tab_Product('";
  private final static String _jspx_template28 = "')\"><img id=\"product_img\" name=\"product_img\" src=\"/img/rojum_cal1_title_off.gif\" alt=\"점용료 산출내역\" width=\"110\" height=\"22\" border=\"0\" style=\"cursor:pointer\" ></td>\r\n\t\t\t\t\t<td width=\"111\" onclick =\"javascript:Tab_Rental('";
  private final static String _jspx_template29 = "')\"><img id=\"rental_img\" name=\"rental_img\" src=\"/img/gapan_cal4_title_on.gif\" alt=\"임대료 산출내역\" width=\"110\" height=\"22\" border=\"0\" style=\"cursor:pointer\" ></td>\r\n\t\t\t\t  ";
  private final static String _jspx_template30 = "\r\n\t\t\t\t  ";
  private final static String _jspx_template31 = "\r\n\t\t\t\t\t<td width=\"111\" onclick =\"javascript:Tab_Product('";
  private final static String _jspx_template32 = "')\"><img id=\"product_img\" name=\"product_img\" src=\"/img/rojum_cal1_title_on.gif\" alt=\"점용료 산출내역\" width=\"110\" height=\"22\" border=\"0\" style=\"cursor:pointer\" ></td>\r\n\t\t\t\t\t<td width=\"111\" onclick =\"javascript:Tab_Rental('";
  private final static String _jspx_template33 = "')\"><img id=\"rental_img\" name=\"rental_img\" src=\"/img/gapan_cal4_title_off.gif\" alt=\"임대료 산출내역\" width=\"110\" height=\"22\" border=\"0\" style=\"cursor:pointer\" ></td>\r\n\t\t\t\t  ";
  private final static String _jspx_template34 = "\r\n\t\t\t\t  ";
  private final static String _jspx_template35 = "\r\n<!--\t\t          <td width=\"111\" onclick =\"javascript:Tab_Place('";
  private final static String _jspx_template36 = "','001')\"><img id=\"place_img\"  name=\"place_img\" src=\"/img/sub_petition_title7_off.gif\" alt=\"첨부자료\" width=\"110\" height=\"22\" border=\"0\" style=\"cursor:pointer\" ></td>-->\r\n\t\t          <td width=\"111\" onclick =\"javascript:Tab_Violation('";
  private final static String _jspx_template37 = "','001')\"><img id=\"violation\"  name=\"violation\" src=\"/img/sub_petition_title18_off.gif\" alt=\"위반조치내역\" width=\"110\" height=\"22\" border=\"0\" style=\"cursor:pointer\" ></td>\r\n\t\t          <td width=\"111\" onclick =\"javascript:Tab_Documents('";
  private final static String _jspx_template38 = "','001')\"><img id=\"documents\"  name=\"documents\" src=\"/img/sub_petition_title19_off.gif\" alt=\"증서 발급\" width=\"110\" height=\"22\" border=\"0\" style=\"cursor:pointer\" ></td>\r\n                </tr>\r\n            </table>\r\n            </td>\r\n          </tr>\t\t  \r\n          <tr>\r\n  \t\t\t<td>\r\n  \t\t\t\t";
  private final static String _jspx_template39 = "\r\n  \t\t\t\t";
  private final static String _jspx_template40 = "\r\n  \t\t\t\t\t<iframe width=\"100%\" id = \"tabDown\" name=\"tabDown\" frameborder=\"0\" onload=\"iFrameResize(this);\" scrolling=\"no\" src=\"/gapan/jumyong/rentalInsert.do?GAPAN_NO=";
  private final static String _jspx_template41 = "&SECTION=";
  private final static String _jspx_template42 = "\"></iframe>\r\n  \t\t\t\t";
  private final static String _jspx_template43 = "\r\n  \t\t\t\t";
  private final static String _jspx_template44 = "\r\n\t  \t\t\t\t<iframe width=\"100%\" id = \"tabDown\" name=\"tabDown\" frameborder=\"0\" onload=\"iFrameResize(this);\" scrolling=\"no\" src=\"/gapan/jumyong/productInsert.do?GAPAN_NO=";
  private final static String _jspx_template45 = "&SECTION=";
  private final static String _jspx_template46 = "\"></iframe>\r\n  \t\t\t\t";
  private final static String _jspx_template47 = "\r\n  \t\t\t\t";
  private final static String _jspx_template48 = "\r\n  \t\t\t\t\r\n  \t\t\t</td>\r\n          </tr>\r\n        </table>\r\n        </td>\r\n      </tr>\t\t\r\n\t\t\r\n\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n\t<tr>\r\n      <td height=\"40\" align=\"right\">\r\n\t\t\t";
  private final static String _jspx_template49 = " \t\r\n\t\t\t\t<img src=\"/img/popup_disuse.gif\" alt=\"폐쇄처리\" id=\"disuse_img\"  border=\"0\" onclick=\"javascript:PopupDisUse();\" style=\"cursor:pointer\">\r\n\t\t  ";
  private final static String _jspx_template50 = "\r\n\t\t  ";
  private final static String _jspx_template51 = " \t\r\n\t\t\t\t<img src=\"/img/popup_undisuse.gif\" alt=\"폐쇄해지\" id=\"disuse_img\"  border=\"0\" onclick=\"javascript:PopupDisUse();\" style=\"cursor:pointer\">\r\n\t\t  ";
  private final static String _jspx_template52 = "\r\n\t\t\t";
  private final static String _jspx_template53 = " \t\t\t\t\t\t\t\t                \t\r\n\t\t\t\t<img src=\"/img/produ_icon.gif\" alt=\"산출조사서\" width=\"84\" height=\"22\" border=\"0\" onclick=\"javascript:fnPreView();\" style=\"cursor:pointer\">\r\n\t\t\t";
  private final static String _jspx_template54 = "\r\n\t\t\t\t<img src=\"/img/occu_icon.gif\" alt=\"점용허가증\" width=\"84\" height=\"22\" onclick=\"javascript:fnOccupancyLicense();\"  border=\"0\" style=\"cursor:pointer\">\r\n\t      <img src=\"/img/list_icon.gif\" alt=\"리스트\" width=\"66\" height=\"22\" border=\"0\" onclick=\"document.location.href = historyBack;\" style=\"cursor:pointer\" >\r\n      </td>\r\n\t</tr>\r\n\t<tr>\r\n      <td height=\"20\" ></td>\r\n\t</tr>\r\n\t\r\n\t</table>\r\n  </td>\r\n </tr>\r\n </table>\r\n</form>\r\n\r\n</body>\r\n</html>";
}
