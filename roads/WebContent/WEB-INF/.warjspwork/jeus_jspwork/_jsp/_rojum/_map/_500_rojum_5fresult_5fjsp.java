package jeus_jspwork._jsp._rojum._map;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_rojum_5fresult_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // ----  c:choose ---- invoke //
      if (_jspx_th_c_choose_0_fn(pageContext, null)) return;


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
          out.write(_jspx_template10);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template12);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template50);

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
    _jspx_th_c_when_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${gapanNo == ''}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
      if (_jspx_eval_c_when_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template11);

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
          out.write(_jspx_template13);
          // jsp code [from=(25,50);to=(25,57)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${gapanNo}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template14);
          // jsp code [from=(29,50);to=(29,66)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template15);
          // jsp code [from=(33,50);to=(33,65)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_TEL}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template16);
          // jsp code [from=(39,7);to=(39,21)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_HP}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template17);
          // jsp code [from=(43,50);to=(43,69)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_TOADDR1}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template18);
          // jsp code [from=(44,7);to=(44,26)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_TOADDR2}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template19);
          // jsp code [from=(44,30);to=(44,49)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_TOJIBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template20);
          // jsp code [from=(48,50);to=(48,65)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.WITH_INFO}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template21);
          // jsp code [from=(54,8);to=(54,18)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADDR}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template22);
          // jsp code [from=(60,50);to=(60,67)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PICKUP_DATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template23);
          // jsp code [from=(64,50);to=(64,61)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PLACE}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template24);
          // jsp code [from=(68,50);to=(68,61)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.FACIL}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template25);
          // ----  c:choose ---- invoke //
          if (_jspx_th_c_choose_1_fn(pageContext, _jspx_th_c_otherwise_0)) return true;


          out.write(_jspx_template31);
          // ----  c:choose ---- invoke //
          if (_jspx_th_c_choose_2_fn(pageContext, _jspx_th_c_otherwise_0)) return true;


          out.write(_jspx_template37);
          // ----  c:choose ---- invoke //
          if (_jspx_th_c_choose_3_fn(pageContext, _jspx_th_c_otherwise_0)) return true;


          out.write(_jspx_template43);
          // ----  c:choose ---- invoke //
          if (_jspx_th_c_choose_4_fn(pageContext, _jspx_th_c_otherwise_0)) return true;


          out.write(_jspx_template49);

        } while (_jspx_th_c_otherwise_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_otherwise_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_otherwise_0.release();
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
          out.write(_jspx_template26);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_1_fn(pageContext, _jspx_th_c_choose_1)) return true;


          out.write(_jspx_template28);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_1_fn(pageContext, _jspx_th_c_choose_1)) return true;


          out.write(_jspx_template30);

        } while (_jspx_th_c_choose_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_choose_1.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_choose_1.release();
    }
    return false;
  }

  private boolean _jspx_th_c_choose_2_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:choose ---- //
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_2 = new org.apache.taglibs.standard.tag.common.core.ChooseTag();
    _jspx_th_c_choose_2.setPageContext(pageContext);
    _jspx_th_c_choose_2.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    try {
      int _jspx_eval_c_choose_2 = _jspx_th_c_choose_2.doStartTag();
      if (_jspx_eval_c_choose_2 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template32);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_2_fn(pageContext, _jspx_th_c_choose_2)) return true;


          out.write(_jspx_template34);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_2_fn(pageContext, _jspx_th_c_choose_2)) return true;


          out.write(_jspx_template36);

        } while (_jspx_th_c_choose_2.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_choose_2.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_choose_2.release();
    }
    return false;
  }

  private boolean _jspx_th_c_choose_3_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:choose ---- //
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_3 = new org.apache.taglibs.standard.tag.common.core.ChooseTag();
    _jspx_th_c_choose_3.setPageContext(pageContext);
    _jspx_th_c_choose_3.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    try {
      int _jspx_eval_c_choose_3 = _jspx_th_c_choose_3.doStartTag();
      if (_jspx_eval_c_choose_3 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template38);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_3_fn(pageContext, _jspx_th_c_choose_3)) return true;


          out.write(_jspx_template40);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_3_fn(pageContext, _jspx_th_c_choose_3)) return true;


          out.write(_jspx_template42);

        } while (_jspx_th_c_choose_3.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_choose_3.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_choose_3.release();
    }
    return false;
  }

  private boolean _jspx_th_c_choose_4_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:choose ---- //
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_4 = new org.apache.taglibs.standard.tag.common.core.ChooseTag();
    _jspx_th_c_choose_4.setPageContext(pageContext);
    _jspx_th_c_choose_4.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    try {
      int _jspx_eval_c_choose_4 = _jspx_th_c_choose_4.doStartTag();
      if (_jspx_eval_c_choose_4 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template44);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_4_fn(pageContext, _jspx_th_c_choose_4)) return true;


          out.write(_jspx_template46);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_4_fn(pageContext, _jspx_th_c_choose_4)) return true;


          out.write(_jspx_template48);

        } while (_jspx_th_c_choose_4.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_choose_4.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_choose_4.release();
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
    _jspx_th_c_when_1.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.CAR_TON == '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
      if (_jspx_eval_c_when_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template27);

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
          out.write(_jspx_template29);

        } while (_jspx_th_c_otherwise_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_otherwise_1.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_otherwise_1.release();
    }
    return false;
  }

  private boolean _jspx_th_c_when_2_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:when ---- //
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_2 = new org.apache.taglibs.standard.tag.rt.core.WhenTag();
    _jspx_th_c_when_2.setPageContext(pageContext);
    _jspx_th_c_when_2.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_when_2.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.MAINTN_OB == '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_2 = _jspx_th_c_when_2.doStartTag();
      if (_jspx_eval_c_when_2 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template33);

        } while (_jspx_th_c_when_2.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_when_2.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_when_2.release();
    }
    return false;
  }

  private boolean _jspx_th_c_otherwise_2_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:otherwise ---- //
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_2 = new org.apache.taglibs.standard.tag.common.core.OtherwiseTag();
    _jspx_th_c_otherwise_2.setPageContext(pageContext);
    _jspx_th_c_otherwise_2.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    try {
      int _jspx_eval_c_otherwise_2 = _jspx_th_c_otherwise_2.doStartTag();
      if (_jspx_eval_c_otherwise_2 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template35);

        } while (_jspx_th_c_otherwise_2.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_otherwise_2.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_otherwise_2.release();
    }
    return false;
  }

  private boolean _jspx_th_c_when_3_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:when ---- //
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_3 = new org.apache.taglibs.standard.tag.rt.core.WhenTag();
    _jspx_th_c_when_3.setPageContext(pageContext);
    _jspx_th_c_when_3.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_when_3.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.LIQUOR_SL == '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_3 = _jspx_th_c_when_3.doStartTag();
      if (_jspx_eval_c_when_3 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template39);

        } while (_jspx_th_c_when_3.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_when_3.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_when_3.release();
    }
    return false;
  }

  private boolean _jspx_th_c_otherwise_3_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:otherwise ---- //
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_3 = new org.apache.taglibs.standard.tag.common.core.OtherwiseTag();
    _jspx_th_c_otherwise_3.setPageContext(pageContext);
    _jspx_th_c_otherwise_3.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    try {
      int _jspx_eval_c_otherwise_3 = _jspx_th_c_otherwise_3.doStartTag();
      if (_jspx_eval_c_otherwise_3 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template41);

        } while (_jspx_th_c_otherwise_3.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_otherwise_3.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_otherwise_3.release();
    }
    return false;
  }

  private boolean _jspx_th_c_when_4_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:when ---- //
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_4 = new org.apache.taglibs.standard.tag.rt.core.WhenTag();
    _jspx_th_c_when_4.setPageContext(pageContext);
    _jspx_th_c_when_4.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_when_4.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.LPGAS_US == '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_4 = _jspx_th_c_when_4.doStartTag();
      if (_jspx_eval_c_when_4 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template45);

        } while (_jspx_th_c_when_4.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_when_4.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_when_4.release();
    }
    return false;
  }

  private boolean _jspx_th_c_otherwise_4_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:otherwise ---- //
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_4 = new org.apache.taglibs.standard.tag.common.core.OtherwiseTag();
    _jspx_th_c_otherwise_4.setPageContext(pageContext);
    _jspx_th_c_otherwise_4.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    try {
      int _jspx_eval_c_otherwise_4 = _jspx_th_c_otherwise_4.doStartTag();
      if (_jspx_eval_c_otherwise_4 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template47);

        } while (_jspx_th_c_otherwise_4.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_otherwise_4.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_otherwise_4.release();
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
  private final static String _jspx_template9 = "\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<link href=\"/css/Mroads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n<body>\r\n";
  private final static String _jspx_template10 = "\r\n";
  private final static String _jspx_template11 = "\r\n<br>\r\n<br>\r\n<font style='font-family: 돋움;font-size: 12px;color: gray;'>&nbsp;&nbsp;&nbsp;상세정보를 확인할 거리가게를 클릭하세요.</font>\r\n";
  private final static String _jspx_template12 = "\r\n";
  private final static String _jspx_template13 = "\r\n<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t<tr>\r\n\t\t<td>\r\n\t\t<table width=\"235px\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse: collapse;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t<tr>\r\n\t\t\t\t<td width=\"70\"  height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">관리번호</td>\r\n\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template14 = "</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">운영자명</td>\r\n\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template15 = "</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"26\"  align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">전화번호</td>\r\n\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template16 = "\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"26\"  align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">핸드폰번호</td>\r\n\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t";
  private final static String _jspx_template17 = "</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">운영자주소</td>\r\n\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template18 = "\r\n\t\t\t\t";
  private final static String _jspx_template19 = " ";
  private final static String _jspx_template20 = "</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">주변정보</td>\r\n\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template21 = "</td>\r\n\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">인접지주소</td>\r\n\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t";
  private final static String _jspx_template22 = "\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\r\n\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">수거일자</td>\r\n\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template23 = "</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용면적</td>\r\n\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template24 = "</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">시설규격</td>\r\n\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template25 = "</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">특화거리</td>\r\n\t\t\t\t";
  private final static String _jspx_template26 = "\r\n\t\t\t\t\t";
  private final static String _jspx_template27 = "\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">조성</td>\r\n\t\t\t\t\t";
  private final static String _jspx_template28 = "\r\n\t\t\t\t\t";
  private final static String _jspx_template29 = "\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">미조성</td>\r\n\t\t\t\t\t";
  private final static String _jspx_template30 = "\r\n\t\t\t\t";
  private final static String _jspx_template31 = "\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">관리여부</td>\r\n\t\t\t\t";
  private final static String _jspx_template32 = "\r\n\t\t\t\t\t";
  private final static String _jspx_template33 = "\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">관리대상</td>\r\n\t\t\t\t\t";
  private final static String _jspx_template34 = "\r\n\t\t\t\t\t";
  private final static String _jspx_template35 = "\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">정비대상</td>\r\n\t\t\t\t\t";
  private final static String _jspx_template36 = "\r\n\t\t\t\t";
  private final static String _jspx_template37 = "\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">주류판매</td>\r\n\t\t\t\t";
  private final static String _jspx_template38 = "\r\n\t\t\t\t\t";
  private final static String _jspx_template39 = "\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">판매</td>\r\n\t\t\t\t\t";
  private final static String _jspx_template40 = "\r\n\t\t\t\t\t";
  private final static String _jspx_template41 = "\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">미판매</td>\r\n\t\t\t\t\t";
  private final static String _jspx_template42 = "\r\n\t\t\t\t";
  private final static String _jspx_template43 = "\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">LPG사용</td>\r\n\t\t\t\t";
  private final static String _jspx_template44 = "\r\n\t\t\t\t\t";
  private final static String _jspx_template45 = "\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">사용</td>\r\n\t\t\t\t\t";
  private final static String _jspx_template46 = "\r\n\t\t\t\t\t";
  private final static String _jspx_template47 = "\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">미사용</td>\r\n\t\t\t\t\t";
  private final static String _jspx_template48 = "\r\n\t\t\t\t";
  private final static String _jspx_template49 = "\r\n\t\t\t</tr>\r\n\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n</table>\r\n";
  private final static String _jspx_template50 = "\r\n";
  private final static String _jspx_template51 = "\r\n</body>\r\n</html>";
}
