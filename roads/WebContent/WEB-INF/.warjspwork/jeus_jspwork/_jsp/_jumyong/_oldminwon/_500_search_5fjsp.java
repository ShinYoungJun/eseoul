package jeus_jspwork._jsp._jumyong._oldminwon;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_search_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(177,25);to=(177,31)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${JUMMOK}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(223,67);to=(223,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(262,112);to=(262,122)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SERIAL_NBR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(268,125);to=(268,130)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${JUMNM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_0_fn(pageContext, null)) return;


      out.write(_jspx_template16);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_1_fn(pageContext, null)) return;


      out.write(_jspx_template18);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_2_fn(pageContext, null)) return;


      out.write(_jspx_template20);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_3_fn(pageContext, null)) return;


      out.write(_jspx_template22);
      // jsp code [from=(294,102);to=(294,113)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${hjdong_code}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(304,99);to=(304,102)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${BUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // jsp code [from=(305,97);to=(305,99)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${JI}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);
      // jsp code [from=(309,121);to=(309,126)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${JIBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template26);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_4_fn(pageContext, null)) return;


      out.write(_jspx_template28);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_5_fn(pageContext, null)) return;


      out.write(_jspx_template30);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_6_fn(pageContext, null)) return;


      out.write(_jspx_template32);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_7_fn(pageContext, null)) return;


      out.write(_jspx_template34);
      // jsp code [from=(351,88);to=(351,97)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${listCount}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template35);
      // ----  c:choose ---- invoke //
      if (_jspx_th_c_choose_0_fn(pageContext, null)) return;


      out.write(_jspx_template57);
      // jsp code [from=(402,10);to=(402,17)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${pageing}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template58);

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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${HEOGA == ''}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template15);

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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${HEOGA == '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
      if (_jspx_eval_c_if_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template17);

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
    _jspx_th_c_if_2.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${HEOGA == '2'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
      if (_jspx_eval_c_if_2 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template19);

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
    _jspx_th_c_if_3.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${HEOGA == '3'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
      if (_jspx_eval_c_if_3 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template21);

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
    _jspx_th_c_if_4.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${JIMOK == ''}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
      if (_jspx_eval_c_if_4 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template27);

        } while (_jspx_th_c_if_4.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_4.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_4.release();
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
    _jspx_th_c_if_5.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${JIMOK == '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
      if (_jspx_eval_c_if_5 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template29);

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
    _jspx_th_c_if_6.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${JIMOK == '2'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
      if (_jspx_eval_c_if_6 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template31);

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
    _jspx_th_c_if_7.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${JIMOK == '3'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_7 = _jspx_th_c_if_7.doStartTag();
      if (_jspx_eval_c_if_7 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template33);

        } while (_jspx_th_c_if_7.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_7.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_7.release();
    }
    return false;
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
          out.write(_jspx_template36);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template54);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template56);

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
    _jspx_th_c_when_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist != null && !empty blist}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
      if (_jspx_eval_c_when_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template37);
          // ----  c:forEach ---- invoke //
          if (_jspx_th_c_forEach_0_fn(pageContext, _jspx_th_c_when_0)) return true;


          out.write(_jspx_template53);

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
          out.write(_jspx_template55);

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
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("board");
    _jspx_th_c_forEach_0.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template38);
            // jsp code [from=(372,176);to=(372,192)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SERIAL_NBR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template39);
            // jsp code [from=(372,198);to=(372,211)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GU_CODE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template40);
            // jsp code [from=(373,44);to=(373,60)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SERIAL_NBR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template41);
            // jsp code [from=(374,50);to=(374,61)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.JUMNM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template42);
            // jsp code [from=(375,50);to=(375,64)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.HEOGA_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template43);
            // jsp code [from=(376,50);to=(376,64)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.JIMOK_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template44);
            // jsp code [from=(377,41);to=(377,56)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.JUMMOK_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template45);
            // jsp code [from=(378,50);to=(378,61)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.JUMYO}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template46);
            // jsp code [from=(379,50);to=(379,62)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.JUMDAN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template47);
            // jsp code [from=(380,50);to=(380,63)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.HH_DATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template48);
            // jsp code [from=(381,50);to=(381,60)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.HJNM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template49);
            // jsp code [from=(382,50);to=(382,61)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.JIBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template50);
            // jsp code [from=(384,32);to=(384,41)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            // ----  c:if ---- invoke //
            if (_jspx_th_c_if_8_fn(pageContext, _jspx_th_c_forEach_0)) return true;


            // jsp code [from=(384,85);to=(384,93)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.JI}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template52);

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

  private boolean _jspx_th_c_if_8_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:if ---- //
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_8 = new org.apache.taglibs.standard.tag.rt.core.IfTag();
    _jspx_th_c_if_8.setPageContext(pageContext);
    _jspx_th_c_if_8.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_if_8.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.JI != null}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_8 = _jspx_th_c_if_8.doStartTag();
      if (_jspx_eval_c_if_8 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template51);

        } while (_jspx_th_c_if_8.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_8.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_8.release();
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
  private final static String _jspx_template9 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script> \r\n<script language='JavaScript' src='/js/Check_inputbox.js'></script>\r\n\r\n<script type=\"text/javascript\">\r\n//<![CDATA[\r\n\r\n\tfunction\tPage(page)\r\n\t{\r\n\t\tif(page\t==\t\"\")\r\n\t\t\treturn;\r\n\t\t\r\n\t\tvar form = document.form;\r\n\r\n\t\tform.currentPage.value\t= page;\r\n\r\n\t\tform.action = \"search.do\";\r\n\t\tform.submit();\r\n\t}\r\n\t\r\n\tfunction\tSearch()\r\n\t{\r\n\t\tvar form \t\t= document.form;\r\n\t\tvar\tLISTVIEW\t= document.getElementById(\"LISTVIEW\");\r\n\t\t\tLISTVIEW.value\t= \"1\";\r\n\t\t\r\n\t\tform.currentPage.value\t= 1;\r\n\r\n\t\tform.action = \"search.do\";\r\n\t\tform.submit();\r\n\t}\r\n\t\r\n\tfunction\texcel_Search()\r\n\t{\r\n\t\tvar form \t\t= document.form;\r\n\t\tvar\tLISTVIEW\t= document.getElementById(\"LISTVIEW\");\r\n\t\t\tLISTVIEW.value\t= \"1\";\r\n\t\t\r\n\t\tform.currentPage.value\t= 1;\r\n\r\n\t\tform.action = \"excel_search.do\";\r\n\t\tform.submit();\r\n\t}\r\n\r\n\tfunction\tView(SERIAL_NBR, GU_CODE)\r\n\t{\r\n\t\tvar form = document.form;\r\n\t\tform.action = \"view.do?SERIAL_NBR=\" + SERIAL_NBR + \"&GU_CODE=\" + GU_CODE+\"&currentPage=1\";\r\n\t\tform.submit();\r\n\t}\r\n\r\n\r\n\r\n\r\n\r\n\t////////////////////////////////AJAX////////////////////////////////////////////\r\n\tfunction getXMLHTTPRequest()\r\n\t{\r\n\t\tvar xRequest = null;\r\n\t\txRequest = new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n\r\n\t\treturn xRequest;\r\n\t}\r\n\r\n\tvar req;\r\n\tvar\tcall;\r\n\t\r\n\tfunction sendRequest(url, params, HttpMethod, callback)\r\n\t{\r\n\t\treq = getXMLHTTPRequest();\r\n\r\n\t\tcall\t= callback;\r\n\t\tif(req){\r\n\t\t\treq.onreadystatechange = onReadyStateChange;\r\n\t\t\treq.open(HttpMethod, url, true);\r\n\t\t\treq.setRequestHeader(\"Content-Type\",\"application/x-www-form-urlencoded;charset=utf-8\");\r\n\t\t\treq.send(params);\r\n\t\t}\r\n\t}\r\n\r\n\tfunction onReadyStateChange()\r\n\t{\r\n\t\tvar ready = req.readyState;\r\n\t\tvar data = null;\r\n\t\tif(ready == 4){\r\n\t\t\tif(this.call\t!= null)\r\n\t\t\t{\r\n\t\t\t\tthis.call(req.responseText);\r\n\t\t\t}\r\n\t\t}\r\n\t}\r\n\r\n\t\r\n\tfunction fncSelectBoxSetting(strParam, selectBoxId, defaultSel, topLabel)\r\n\t{\r\n        var xmldoc = new ActiveXObject(\"Microsoft.XMLDOM\");\r\n        var selectBoxLabel;\r\n        var root;\r\n        var selectBoxValue;\r\n        var opt \t= document.getElementById(selectBoxId);\r\n        var tags\t= \"\";\r\n        var\ttext\t= \"\";\r\n\r\n        for(var i = opt.options.length - 1 ; i > -1 ; i--)\r\n        {\r\n        \topt.options[i]\t= null;\r\n        }\r\n\r\n        xmldoc.async\t= false;\r\n\r\n\t\txmldoc.loadXML(strParam);\r\n\r\n\r\n\t\troot = xmldoc.getElementsByTagName(\"option\").length;\r\n\r\n\r\n        if(root <= 0)\r\n        {\r\n            tags \t= document.createElement(\"option\");\r\n            text\t= document.createTextNode(\"\");\r\n            tags.setAttribute(\"label\", \"\");\r\n            tags.appendChild(text);\r\n            tags.value = 0;\r\n            opt.appendChild(tags);\r\n            return;\r\n        }\r\n\r\n        if(topLabel != null && topLabel != \"\")\r\n\t\t{\r\n            tags \t= document.createElement(\"option\");\r\n            text\t= document.createTextNode(topLabel);\r\n            tags.setAttribute(\"label\", topLabel);\r\n            tags.appendChild(text);\r\n            tags.value = '';\r\n            opt.appendChild(tags);\r\n        }\r\n    \t\r\n        for(var i = 0; i < root; i++)\r\n        {\r\n        \t\r\n        \tselectBoxValue = xmldoc.getElementsByTagName(\"option/@value\").item(i).text;\r\n        \tselectBoxLabel = xmldoc.getElementsByTagName(\"option/@label\").item(i).text;\r\n\r\n            tags \t= document.createElement(\"option\");\r\n       \t\ttext\t= document.createTextNode(selectBoxLabel);\r\n\r\n            tags.setAttribute(\"label\", selectBoxLabel);\r\n      //      if(search_flag != '1'){\r\n        //    \tif(selectBoxValue == defaultSel) tags.setAttribute(\"selected\", \"true\"); // 코드에 이빨이 빠진경우 처리\r\n          //  }\r\n\r\n            tags.value = selectBoxValue;\r\n            tags.a";
  private final static String _jspx_template10 = "ppendChild(text);\r\n            opt.appendChild(tags);\r\n        }\r\n\r\n        var jummok = '";
  private final static String _jspx_template11 = "';\r\n\r\n        if(jummok.length > 0 && document.getElementById('FLAG').value == 'true'){\r\n        \topt.options.value = jummok;\r\n        };\r\n\r\n        document.getElementById('FLAG').value = 'false';\r\n\r\n        \r\n    }\r\n\r\n\r\n\tfunction\tSelected()\r\n\t{\r\n\t\tvar\tJIMOK\t= document.getElementById(\"JIMOK\").value;\r\n\t\t\r\n\t\tvar\tparam\t= \"JIMOK=\"+JIMOK;\r\n\t\t\r\n\t\tsendRequest(\"/jumyong/oldminwon/get_jummok.do\", param, \"GET\", Result);\r\n\t}\r\n\r\n\tfunction\tResult(obj)\r\n\t{\r\n\t\tfncSelectBoxSetting(obj, \"JUMMOK\", \"EEE\", \"::선택::\");\r\n\t}\r\n\r\n\tfunction init(){\r\n\t\tSelected();\r\n\r\n\r\n\t}\r\n\r\n\tfunction checkKeySearch(){\r\n\t\tif(event.keyCode == \"13\")\r\n\t\t\tSearch();\r\n\t}\r\n\r\n\r\n\t\r\n\r\n//]]>\r\n</script>\r\n\r\n<body onload=\"init();\">\r\n\t\r\n<form id=\"form\" name=\"form\" method=\"post\" action=\"search.jsp\">\r\n<input type=\"hidden\" id=\"currentPage\" name=\"currentPage\" value=\"";
  private final static String _jspx_template12 = "\">\r\n<input type=\"hidden\" id=\"LISTVIEW\" name=\"LISTVIEW\" value=\"1\">\r\n<input type=\"hidden\" id=\"GU_CODE\" name=\"GU_CODE\">\r\n<input type=\"hidden\" id=\"FLAG\" name=\"FLAG\" value = \"true\">\r\n\r\n<table width=\"800\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t<tr>\r\n\t\t<td height=\"43\"><img src=\"/img/sub1_petition_title.gif\" width=\"800\" height=\"43\"></td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td>\r\n\t\t<table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t      <tr>\r\n\t        <td height=\"1\" bgcolor=\"eaeaea\"></td>\r\n\t      </tr>\r\n\t      <tr>\r\n\t        <td height=\"14\"></td>\r\n\t      </tr>     \r\n\t      <tr>\r\n\t        <td><table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t          <tr>\r\n\t            <td align=\"left\" height=\"22\" background=\"/img/tab_line_blue.gif\">\r\n\t            <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t                <tr >\r\n\t                  <td ><img src=\"/img/sub_petition_title15.gif\" width=\"110\" height=\"22\"></td>\r\n\t                </tr>\r\n\t            </table></td>\r\n\t          </tr>\r\n\t\t\t<tr>\r\n\t            <td  class=\"contborder_purple\">\r\n\t            \r\n\t            <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t              <tr>\r\n\t                <td>\r\n\t                \r\n\t                <table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t                     <tr>\r\n\t\t\t\t\t\t  <td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" >민원행정관리번호</td>\r\n\t                      <td bgcolor=\"eaeaea\" class=\"table_bl_left\" width=\"35%\">\r\n\t\t\t\t\t\t  \t<input id=\"SERIAL_NBR\" name=\"SERIAL_NBR\" type=\"text\" class=\"input_form1\" style=\"width:130px\" value=\"";
  private final static String _jspx_template13 = "\" onKeyDown=\"javascript:checkKeySearch();\" >\r\n\t\t\t\t\t\t  </td>\r\n\t\t\t\t\t\t  <td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용인/법인명</td>\r\n\t                      <td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t  <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t                        <tr>\r\n\t\t                          <td><input id=\"JUMNM\" name=\"JUMNM\" type=\"text\" class=\"input_form1\" style=\"width:130px\" value=\"";
  private final static String _jspx_template14 = "\" onKeyDown=\"javascript:checkKeySearch();\" ></td>\r\n\t\t                        </tr>\r\n\t\t                      </table>\r\n\t                      </td>\r\n\t                    </tr>\r\n\t                    <tr>\r\n\t\t\t\t\t\t  \t<td height=\"32\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">허가여부</td>\r\n\t\t\t\t\t\t  \t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t  \t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t                          <td>\r\n\t\t\t                          <select id=\"HEOGA\" name=\"HEOGA\" class=\"input_form1\" style=\"width:130px\">\r\n\t\t\t                          \t<option value=\"\" ";
  private final static String _jspx_template15 = "selected";
  private final static String _jspx_template16 = " >::전체::</option>\r\n\t\t\t                          \t<option value=\"1\" ";
  private final static String _jspx_template17 = "selected";
  private final static String _jspx_template18 = " >허가</option>\r\n\t\t\t                          \t<option value=\"2\" ";
  private final static String _jspx_template19 = "selected";
  private final static String _jspx_template20 = " >직권</option>\r\n\t\t\t                          \t<option value=\"3\" ";
  private final static String _jspx_template21 = "selected";
  private final static String _jspx_template22 = " >폐쇄</option>\r\n\t\t\t                          </select>\r\n\t\t\t                          </td>\r\n\t\t\t\t\t\t\t\t  \t</tr>\r\n\t\t\t\t\t\t  \t\t</table>\r\n\t\t\t\t\t\t  \t</td>\r\n\t\t\t\t\t\t  \t<td height=\"32\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">행정동</td>\r\n\t\t\t\t\t\t  \t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t  \t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t                          <td>\r\n\t\t\t                          <select id=\"HJCD\" name=\"HJCD\" class=\"input_form1\" style=\"width:130px\">";
  private final static String _jspx_template23 = "\r\n\t\t\t                          </select>\r\n\t\t\t                          </td>\r\n\t\t\t\t\t\t\t\t  \t</tr>\r\n\t\t\t\t\t\t  \t\t</table>\r\n\t\t\t\t\t\t  \t</td>\r\n\t\t\t\t\t\t </tr>\r\n\t\t\t\t\t\t <tr>\r\n\t\t\t\t\t\t\t  <td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">도로 번지</td>\r\n\t\t                      <td bgcolor=\"eaeaea\" class=\"table_bl_left\" width=\"35%\">\r\n\t\t\t\t\t\t\t\t  \t<input id=\"BUN\" name=\"BUN\" type=\"text\" class=\"input_form1\" style=\"width:50px\" value=\"";
  private final static String _jspx_template24 = "\" onKeyDown=\"javascript:checkKeySearch();\" > - \r\n\t\t\t\t\t\t\t\t  \t<input id=\"JI\" name=\"JI\" type=\"text\" class=\"input_form1\" style=\"width:40px\" value=\"";
  private final static String _jspx_template25 = "\" onKeyDown=\"javascript:checkKeySearch();\" >\r\n\t\t\t\t\t\t\t  </td>\r\n\t\t\t\t\t\t\t  <td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">건물 지번</td>\r\n\t\t                      <td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t                        \t \t<input id=\"JIBUN\" name=\"JIBUN\" type=\"text\" class=\"input_form1\" style=\"width:130px\" value=\"";
  private final static String _jspx_template26 = "\" onKeyDown=\"javascript:checkKeySearch();\" >\r\n\t\t                      </td>\r\n\t                    </tr>\r\n\t                    \t                    <tr>\r\n\t\t\t\t\t\t  \t<td height=\"32\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용구분</td>\r\n\t\t\t\t\t\t  \t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t  \t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t                          <td>\r\n\t\t\t                          <select id=\"JIMOK\" name=\"JIMOK\" class=\"input_form1\" style=\"width:130px\" OnChange=\"Selected();\">\r\n\t\t\t                          \t<option value=\"\" ";
  private final static String _jspx_template27 = "selected";
  private final static String _jspx_template28 = " >::전체::</option>\r\n\t\t\t                          \t<option value=\"1\" ";
  private final static String _jspx_template29 = "selected";
  private final static String _jspx_template30 = " >도로</option>\r\n\t\t\t                          \t<option value=\"2\" ";
  private final static String _jspx_template31 = "selected";
  private final static String _jspx_template32 = " >하천</option>\r\n\t\t\t                          \t<option value=\"3\" ";
  private final static String _jspx_template33 = "selected";
  private final static String _jspx_template34 = " >구거</option>\r\n\t\t\t                          </select>\r\n\t\t\t                          </td>\r\n\t\t\t\t\t\t\t\t  \t</tr>\r\n\t\t\t\t\t\t  \t\t</table>\r\n\t\t\t\t\t\t  \t</td>\r\n\t\t\t\t\t\t  \t<td height=\"32\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용목적</td>\r\n\t\t\t\t\t\t  \t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t  \t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t                          <td>\r\n\t\t\t                          \t<select id=\"JUMMOK\" name=\"JUMMOK\" class=\"input_form1\" style=\"width:230px\">\r\n\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t                          </td>\r\n\t\t\t\t\t\t\t\t  \t</tr>\r\n\t\t\t\t\t\t  \t\t</table>\r\n\t\t\t\t\t\t  \t</td>\r\n\t\t\t\t\t\t </tr>\r\n\t                </table>\r\n\t                </td>\r\n\t              </tr>\r\n\r\n\t              <tr>\r\n                    <td height=\"40\" align=\"right\"><img src=\"/img/inquiry_icon2.gif\" alt=\"조회\" width=\"56\" height=\"18\" border=\"0\" onclick=\"javascript:Search();\" style=\"cursor:pointer\"></td>\r\n                  </tr>\r\n\t              <tr>\r\n\t                <td height=\"1\" bgcolor=\"#EAEAEA\"></td>\r\n\t              </tr>\r\n\t              <tr>\r\n\t                <td height=\"34\" class=\"sub_stan\">전체건수 : <span class=\"sub_stan_blue\">";
  private final static String _jspx_template35 = "</span>건 </td>\r\n\t              </tr>\r\n\t              <tr>\r\n\t                <td>\r\n\t                \t<table width=\"780\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t              \t      <tr>\r\n\t                        <td height=\"35\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" nowrap=\"nowrap\">관리번호</td>\r\n\t                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" nowrap=\"nowrap\">점용자명</td>\t                        \r\n\t                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" nowrap=\"nowrap\">허가<br/>여부</td>\r\n\t                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" nowrap=\"nowrap\">점용<br/>구분</td>\r\n\t                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" nowrap=\"nowrap\">점용목적</td>\r\n\t                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" nowrap=\"nowrap\">요율</td>\r\n\t                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" nowrap=\"nowrap\">면적<br/>㎡</td>\r\n\t                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" nowrap=\"nowrap\">점용기간</td>\r\n\t                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" nowrap=\"nowrap\">행정동</td>\r\n\t                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" nowrap=\"nowrap\">건물<br/>지번</td>\r\n\t                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" nowrap=\"nowrap\">도로<br/>번지</td>\r\n\t                      </tr>\r\n\t                      ";
  private final static String _jspx_template36 = "\r\n\t\t\t\t\t\t  \t";
  private final static String _jspx_template37 = "\r\n\t                      \t\t";
  private final static String _jspx_template38 = "\r\n\t\t\t\t                      <tr onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\" style=\"cursor:pointer\" onClick=\"javascript:View('";
  private final static String _jspx_template39 = "','";
  private final static String _jspx_template40 = "');\">\r\n\t\t\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\">";
  private final static String _jspx_template41 = "</td>\r\n\t\t\t\t                        <td align=\"center\">";
  private final static String _jspx_template42 = "</td>\r\n\t\t\t\t                        <td align=\"center\">";
  private final static String _jspx_template43 = "</td>\r\n\t\t\t\t                        <td align=\"center\">";
  private final static String _jspx_template44 = "</td>\r\n\t\t\t\t            \t\t\t<td align=\"center\">";
  private final static String _jspx_template45 = "</td>     \r\n\t\t\t\t                        <td align=\"center\">";
  private final static String _jspx_template46 = "</td>\r\n\t\t\t\t                        <td align=\"center\">";
  private final static String _jspx_template47 = "</td>\r\n\t\t\t\t                        <td align=\"center\">";
  private final static String _jspx_template48 = "</td>   \r\n\t\t\t\t                        <td align=\"center\">";
  private final static String _jspx_template49 = "</td>         \r\n\t\t\t\t                        <td align=\"center\">";
  private final static String _jspx_template50 = "</td>\r\n\t\t\t\t                        <td align=\"center\">\r\n\t\t\t\t                        \t";
  private final static String _jspx_template51 = "-";
  private final static String _jspx_template52 = "\r\n\t\t\t\t                        </td>\r\n\t\t\t\t                      </tr>\r\n\t\t\t\t\t\t\t\t ";
  private final static String _jspx_template53 = "\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template54 = "\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template55 = "\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\" class=\"sub_table\" colspan=\"11\" height=\"85\">검색된 내용이 없습니다</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template56 = "\r\n\t\t\t\t\t\t ";
  private final static String _jspx_template57 = "\r\n\t                    </table>\r\n\t\t\t\t\t  </td>\r\n\t               </tr>\r\n\t                \r\n\t               <tr>\r\n\t                  <td height=\"30\" align=\"center\"><table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t                      <tr>\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template58 = "\r\n\t                      </tr>\r\n\t                  </table></td>\r\n\t                </tr>\r\n\t\t              \r\n\t\t              <tr>              \r\n\t\t                <td height=\"40\" align=\"right\">\r\n\t\t\t                <table border=\"0\" width=\"100%\">\r\n\t\t\t                \t<tr>\r\n\t\t\t\t                \t<td >\r\n\t\t\t\t\t                \t<img src=\"../../../img/excel_icon.gif\" alt=\"EXCEL 변환\" border=\"0\" onclick=\"javascript:excel_Search();\" style=\"cursor:hand\">\r\n\t\t\t\t\t                </td>\t\t\t\t\t\t                \r\n\t\t\t\t                </tr>\r\n\t\t\t\t             </table>\r\n\t\t\t\t\t\t</td>\r\n\t\t              </tr>\r\n\t                \r\n\t            </table></td>\r\n\t          </tr>\r\n\t          \r\n\t        </table></td>\r\n\t      </tr>\r\n\t      <tr>\r\n\t        <td height=\"30\"></td>\r\n\t      </tr>\r\n\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n</table>\r\n\r\n\r\n</form>\r\n\t\r\n</body>\r\n</html>";
}
