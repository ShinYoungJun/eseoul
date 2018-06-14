package jeus_jspwork._jsp._jumyong._jumyong;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_history_5fview_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(79,61);to=(79,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(80,59);to=(80,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${message}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(81,56);to=(81,60)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mode}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(82,67);to=(82,79)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(83,59);to=(83,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // ----  c:choose ---- invoke //
      if (_jspx_th_c_choose_0_fn(pageContext, null)) return;


      out.write(_jspx_template35);
      // jsp code [from=(135,30);to=(135,38)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${pageing }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template36);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_0_fn(pageContext, null)) return;


      out.write(_jspx_template44);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_1_fn(pageContext, null)) return;


      out.write(_jspx_template51);

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
          out.write(_jspx_template15);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template32);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_1_fn(pageContext, _jspx_th_c_choose_0)) return true;


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

  private boolean _jspx_th_c_if_0_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:if ---- //
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = new org.apache.taglibs.standard.tag.rt.core.IfTag();
    _jspx_th_c_if_0.setPageContext(pageContext);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ product != null }", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template37);
          // jsp code [from=(160,27);to=(160,41)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.GUBUN }",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template38);
          // jsp code [from=(166,27);to=(166,45)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.WRITEDATE }",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template39);
          // jsp code [from=(170,27);to=(170,43)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.WORK_NM }",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template40);
          // jsp code [from=(176,27);to=(176,41)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.GUNGE }",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template41);
          // jsp code [from=(182,27);to=(182,40)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.SAYU }",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template42);
          // jsp code [from=(189,27);to=(189,43)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.UP_DATE }",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template43);

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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION != '4'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
      if (_jspx_eval_c_if_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template45);
          // jsp code [from=(200,121);to=(200,129)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template46);
          // ----  c:if ---- invoke //
          if (_jspx_th_c_if_2_fn(pageContext, _jspx_th_c_if_1)) return true;


          out.write(_jspx_template50);

        } while (_jspx_th_c_if_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_1.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_1.release();
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
    _jspx_th_c_when_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${historyList != null && !empty historyList}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
      if (_jspx_eval_c_when_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template16);
          // ----  c:forEach ---- invoke //
          if (_jspx_th_c_forEach_0_fn(pageContext, _jspx_th_c_when_0)) return true;


          out.write(_jspx_template31);

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
          out.write(_jspx_template33);

        } while (_jspx_th_c_otherwise_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_otherwise_1.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_otherwise_1.release();
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
    _jspx_th_c_if_2.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ product.SEQ != null }", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
      if (_jspx_eval_c_if_2 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template47);
          // jsp code [from=(203,125);to=(203,136)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template48);
          // jsp code [from=(204,126);to=(204,137)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template49);

        } while (_jspx_th_c_if_2.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_2.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_2.release();
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${historyList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("history");
    _jspx_th_c_forEach_0.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template17);
            // ----  c:choose ---- invoke //
            if (_jspx_th_c_choose_1_fn(pageContext, _jspx_th_c_forEach_0)) return true;


            out.write(_jspx_template25);
            // jsp code [from=(113,44);to=(113,62)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${history.WRITEDATE }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template26);
            // jsp code [from=(114,55);to=(114,69)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${history.GUNGE }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template27);
            // jsp code [from=(114,74);to=(114,92)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${history.GUNGE_FIX }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template28);
            // jsp code [from=(115,55);to=(115,68)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${history.SAYU }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template29);
            // jsp code [from=(115,73);to=(115,90)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${history.SAYU_FIX }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template30);

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
          out.write(_jspx_template18);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_1_fn(pageContext, _jspx_th_c_choose_1)) return true;


          out.write(_jspx_template21);
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
    _jspx_th_c_when_1.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${history.SEQ != product.SEQ}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
      if (_jspx_eval_c_when_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template19);
          // jsp code [from=(107,43);to=(107,54)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${history.SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template20);

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
          out.write(_jspx_template22);
          // jsp code [from=(110,31);to=(110,43)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${history.SEQ }",java.lang.String.class , pageContext.getVariableResolver(), null));

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

  private final static String _jspx_template0 = "\r\n";
  private final static String _jspx_template1 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('사용자의 사용시간이 종료되었습니다. 다시 접속 해주시기 바랍니다.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template2 = "\r\n";
  private final static String _jspx_template3 = "\r\n";
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "  \r\n";
  private final static String _jspx_template6 = "  \r\n";
  private final static String _jspx_template7 = "\r\n";
  private final static String _jspx_template8 = "\r\n";
  private final static String _jspx_template9 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n\r\n<script>\r\n\r\n\t// 등록폼 체크\r\n\tfunction checkForm(){\r\n\t\tvar form1 = document.form1;\r\n\t\talert(form1.year.value);\r\n\r\n\t\tform1.submit();\r\n\t\t\r\n\t}\r\n\r\n\t// 추가폼 이동\r\n\tfunction goAdd(admin_no){\r\n\t\t\r\n\t\tdocument.form.action = \"/jumyong/jumyong/history_register.do?ADMIN_NO=\"+admin_no+\"&mode=add\";\r\n\t\tdocument.form.submit();\r\n\t}\r\n\r\n\t// 페이지이동\r\n\tfunction\tPage(page)\r\n\t{\r\n\t\tif(page\t==\t\"\")\r\n\t\t\treturn;\r\n\t\t\r\n\t\tvar ADMIN_NO = document.getElementById(\"ADMIN_NO\").value;\r\n\t\t\r\n\t\tlocation.href=\"history_view.do?currentPage=\"+page+\"&ADMIN_NO=\"+ADMIN_NO;\r\n\t}\r\n\r\n\t// 상세보기\r\n\tfunction goView(seq){\r\n\t\t\r\n\t\tvar page = document.form.currentPage.value;\r\n\t\tvar ADMIN_NO = document.getElementById(\"ADMIN_NO\").value;\r\n\t\tlocation.href=\"history_view.do?currentPage=\"+page+\"&SEQ=\"+seq+\"&ADMIN_NO=\"+ADMIN_NO;\r\n\t}\r\n\r\n\t// 수정하기\r\n\tfunction goModify(seq){\r\n\t\tdocument.form.action = \"/jumyong/jumyong/history_register.do?SEQ=\"+seq+\"&mode=edit\";\r\n\t\tdocument.form.submit();\r\n\t}\r\n\t\r\n\t// 삭제하기\r\n\tfunction goDelete(seq){\r\n\t\tif( confirm(\"삭제하시겠습니까? \") ){\r\n\t\t\tdocument.form.action = \"/jumyong/jumyong/history_del.do?SEQ=\"+seq+\"&mode=del\";\r\n\t\t\tdocument.form.submit();\r\n\t\t}\r\n\r\n\t}\r\n\t\t\t\r\n</script>\r\n\r\n</head>\r\n\r\n<body onload=\"InitPage();\">\r\n\r\n<form id=\"form\" name=\"form\" method=\"post\">\r\n<input type=\"hidden\" id=\"ADMIN_NO\" name=\"ADMIN_NO\" value=\"";
  private final static String _jspx_template10 = "\">\r\n<input type=\"hidden\" id=\"message\" name=\"message\" value=\"";
  private final static String _jspx_template11 = "\">\r\n<input type=\"hidden\" id = \"mode\" name=\"mode1\" value=\"";
  private final static String _jspx_template12 = "\">\r\n<input type=\"hidden\" id=\"currentPage\" name=\"currentPage\" value=\"";
  private final static String _jspx_template13 = "\">\r\n<input type=\"hidden\" id=\"SECTION\" name=\"SECTION\" value=\"";
  private final static String _jspx_template14 = "\">\r\n\r\n\r\n<table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t<tr>\r\n\t\t<td class=\"contborder_purple\">\t\r\n\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t<tr>\r\n               \t\t<td>\r\n               \t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n                 \t\t\t<tr>\r\n\t\t                   \t\t<td height=\"30px\" width=\"20%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">등록날짜</td>\r\n\t\t                   \t\t<td width=\"300px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">근거</td>\r\n\t\t                   \t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">사유</td>\r\n\t\t                   \t</tr>\r\n                 \t\t\t\r\n                 \t\t\t";
  private final static String _jspx_template15 = "\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template16 = "  \r\n\t\t                   \t";
  private final static String _jspx_template17 = "\r\n                    \t\t\r\n                    \t\t\r\n                    \t\t";
  private final static String _jspx_template18 = "\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template19 = "\r\n                    \t\t<tr onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\" \r\n                    \t\t\tonclick=\"goView('";
  private final static String _jspx_template20 = "')\" style=\"cursor:pointer\">\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template21 = "\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template22 = "\r\n\t\t\t\t\t\t\t<tr onclick=\"goView('";
  private final static String _jspx_template23 = "')\" bgcolor=\"#f6f7f8\">\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template24 = "\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template25 = "\r\n\t\t\t\t\t\t\t\t<td height=\"26px\" align=\"center\">";
  private final static String _jspx_template26 = "</td>\r\n\t\t                       \t<td align=\"center\" title=\"";
  private final static String _jspx_template27 = "\">";
  private final static String _jspx_template28 = "</td>\r\n\t\t                       \t<td align=\"center\" title=\"";
  private final static String _jspx_template29 = "\">";
  private final static String _jspx_template30 = "</td>\r\n                     \t\t</tr> \r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template31 = "\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template32 = "\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template33 = "\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\" class=\"sub_table\" colspan=\"4\" height=\"85\"> 내용이 없습니다</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template34 = "\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template35 = "\r\n\t\t\t\t\t\r\n               \t\t\t</table>\r\n               \t\t</td>\r\n             \t</tr>\r\n             \t<tr>\r\n               \t\t<td height=\"40\" align=\"center\">\r\n               \t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                   \t\t\t<tr>\r\n                     \t\t\t<td align=\"center\">\r\n                     \t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n                       \t\t\t\t";
  private final static String _jspx_template36 = "\r\n                     \t\t\t\t</table>\r\n                     \t\t\t</td>\r\n                     \t\t</tr>\r\n                 \t\t</table>\r\n                 \t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr><td height=\"20\"></td></tr>\r\n\t\t\t\t\r\n\t\t\t\t";
  private final static String _jspx_template37 = "\r\n\t\t\t\t<tr>\r\n\t            \t<td>\r\n\t                \t<table width=\"100%\" border=\"0\"  cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t    \t<td width=\"10%\" height=\"26\" align=\"left\"  class=\"sub_table_b\">* 변경 세부 내역</td>\t\t\r\n\t\t\t\t\t\t    </tr>\r\n\t\t\t\t\t\t</table>\t\r\n\t                </td>\r\n\t        \t</tr>\t\t\t\t\t              \r\n\t\t\t\t<tr>\r\n                \t<td>\r\n                \t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n                  \t\t\t<!-- tr>\r\n\t\t\t                \t<td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" >구분</td>\r\n\t\t\t                    <td width=\"42%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t                    \t";
  private final static String _jspx_template38 = "\r\n\t\t\t                    </td>\r\n                  \t\t\t</tr-->\r\n                  \t\t\t<tr>\r\n\t\t\t                \t<td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" >등록일자</td>\r\n\t\t\t                    <td width=\"42%\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t                    \t";
  private final static String _jspx_template39 = "\r\n\t\t\t                    </td>                  \t\t\t\r\n\t\t\t                    <td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" >담당자명</td>\r\n\t\t\t                    <td width=\"42%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\t\t\t                    \t";
  private final static String _jspx_template40 = "\r\n\t\t\t                    </td>\r\n                  \t\t\t</tr>\r\n                  \t\t\t<tr>\r\n\t\t\t                \t<td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" >근거</td>\r\n\t\t\t                    <td width=\"42%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t                    \t";
  private final static String _jspx_template41 = "\r\n\t\t\t                    </td>\r\n                  \t\t\t</tr>\r\n                  \t\t\t<tr>\r\n\t\t\t                \t<td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" >사유</td>\r\n\t\t\t                    <td width=\"42%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t                    \t";
  private final static String _jspx_template42 = "\r\n\t\t\t                    </td>\r\n                  \t\t\t</tr>\r\n                  \t\t\t\r\n                  \t\t\t<tr>\r\n\t\t\t                \t<td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" >수정일자</td>\r\n\t\t\t                    <td width=\"42%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t                    \t";
  private final static String _jspx_template43 = "\r\n\t\t\t                    </td>\r\n                  \t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t";
  private final static String _jspx_template44 = "\r\n\t\t\t\t\r\n\t\t\t\t<tr>              \r\n                \t<td height=\"40\" align=\"right\">\r\n                \t\t";
  private final static String _jspx_template45 = "\r\n\t                \t\t<img src=\"/img/add_icon.gif\" alt=\"추가\" width=\"56\" height=\"18\" border=\"0\" onClick=\"javascript:goAdd('";
  private final static String _jspx_template46 = "');\"  style=\"cursor:pointer\">\r\n\t                \t\t\r\n\t                \t\t";
  private final static String _jspx_template47 = "\r\n\t                \t\t\t<img src=\"/img/mod_icon.gif\" alt=\"수정\" width=\"56\" height=\"18\" border=\"0\" onClick=\"javascript:goModify('";
  private final static String _jspx_template48 = "');\"  style=\"cursor:pointer\">\r\n\t                \t\t\t<img src=\"/img/del_icon3.gif\" alt=\"삭제\" width=\"56\" height=\"18\" border=\"0\" onClick=\"javascript:goDelete('";
  private final static String _jspx_template49 = "');\"  style=\"cursor:pointer\">\r\n\t\t                \t";
  private final static String _jspx_template50 = "\r\n\t                \t";
  private final static String _jspx_template51 = "\r\n\t                </td>\r\n              \t</tr>\r\n\t\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n</table>\r\n            \r\n            \r\n</form>\r\n\r\n</body>\r\n<script>\r\n\r\n\tfunction InitPage()\r\n\t{\t\r\n\t\tvar obj = document.form.message.value;\r\n\t\t\r\n\t\tif(obj != \"\")\t\r\n\t\t\talert(obj);\r\n\t\t\treturn;\r\n\r\n\t}\r\n</script>\r\n</html>\r\n\r\n";
}
