package jeus_jspwork._jsp._gapan._jumyong;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_violation_5fview_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(99,26);to=(99,44)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${violation.VIO_SEL1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(100,26);to=(100,44)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${violation.VIO_SEL2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(101,26);to=(101,44)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${violation.VIO_SEL3}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(102,26);to=(102,44)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${violation.VIO_SEL4}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(103,26);to=(103,44)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${violation.VIO_SEL5}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(104,26);to=(104,44)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${violation.VIO_SEL6}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(105,26);to=(105,44)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${violation.VIO_SEL7}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(107,29);to=(107,50)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${violation.VIO_ACTSEL1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(108,26);to=(108,47)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${violation.VIO_ACTSEL2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(109,26);to=(109,47)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${violation.VIO_ACTSEL3}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(110,26);to=(110,47)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${violation.VIO_ACTSEL4}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(111,26);to=(111,47)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${violation.VIO_ACTSEL5}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(152,62);to=(152,70)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(154,60);to=(154,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${message}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(155,54);to=(155,58)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mode}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // jsp code [from=(156,68);to=(156,80)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);
      // jsp code [from=(165,17);to=(165,25)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${filePath}",java.lang.String.class , pageContext.getVariableResolver(), null));

      // jsp code [from=(165,28);to=(165,51)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${violation.VIO_IMG1_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template26);
      // jsp code [from=(179,17);to=(179,25)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${filePath}",java.lang.String.class , pageContext.getVariableResolver(), null));

      // jsp code [from=(179,28);to=(179,51)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${violation.VIO_IMG2_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // jsp code [from=(192,17);to=(192,25)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${filePath}",java.lang.String.class , pageContext.getVariableResolver(), null));

      // jsp code [from=(192,28);to=(192,54)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${violation.VIO_ACTIMG1_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template28);
      // jsp code [from=(206,17);to=(206,25)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${filePath}",java.lang.String.class , pageContext.getVariableResolver(), null));

      // jsp code [from=(206,28);to=(206,54)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${violation.VIO_ACTIMG2_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template29);
      // jsp code [from=(223,10);to=(223,36)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(MUL_FROMDATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

      out.write(_jspx_template30);
      // jsp code [from=(223,42);to=(223,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(MUL_TODATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

      out.write(_jspx_template31);
      // jsp code [from=(227,10);to=(227,23)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${VIO_ACCPOINTS}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template32);
      // ----  c:choose ---- invoke //
      if (_jspx_th_c_choose_0_fn(pageContext, null)) return;


      out.write(_jspx_template48);
      // jsp code [from=(277,15);to=(277,32)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${strPageDivideForm}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template49);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_0_fn(pageContext, null)) return;


      out.write(_jspx_template69);
      // jsp code [from=(452,136);to=(452,144)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template70);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_5_fn(pageContext, null)) return;


      out.write(_jspx_template74);

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
          out.write(_jspx_template33);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template45);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template47);

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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ violation != null }", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template50);
          // jsp code [from=(310,65);to=(310,83)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${violation.VIO_DEPT}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template51);
          // ----  c:if ---- invoke //
          if (_jspx_th_c_if_1_fn(pageContext, _jspx_th_c_if_0)) return true;


          out.write(_jspx_template54);
          // ----  c:if ---- invoke //
          if (_jspx_th_c_if_2_fn(pageContext, _jspx_th_c_if_0)) return true;


          out.write(_jspx_template57);
          // jsp code [from=(335,11);to=(335,29)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${violation.VIO_DATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template58);
          // jsp code [from=(368,159);to=(368,180)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${violation.VIO_CONTENT}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template59);
          // jsp code [from=(385,11);to=(385,32)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${violation.VIO_ACTDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template60);
          // ----  c:if ---- invoke //
          if (_jspx_th_c_if_3_fn(pageContext, _jspx_th_c_if_0)) return true;


          out.write(_jspx_template63);
          // ----  c:if ---- invoke //
          if (_jspx_th_c_if_4_fn(pageContext, _jspx_th_c_if_0)) return true;


          out.write(_jspx_template66);
          // jsp code [from=(427,171);to=(427,191)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${violation.VIO_POINTS}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template67);
          // jsp code [from=(437,164);to=(437,188)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${violation.VIO_ACTCONTENT}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template68);

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
    _jspx_th_c_if_5.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ violation != null }", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
      if (_jspx_eval_c_if_5 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template71);
          // jsp code [from=(454,110);to=(454,123)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${violation.SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template72);
          // jsp code [from=(455,108);to=(455,121)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${violation.SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template73);

        } while (_jspx_th_c_if_5.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_5.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_5.release();
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
    _jspx_th_c_when_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list != null && !empty list}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
      if (_jspx_eval_c_when_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template34);
          // ----  c:forEach ---- invoke //
          if (_jspx_th_c_forEach_0_fn(pageContext, _jspx_th_c_when_0)) return true;


          out.write(_jspx_template44);

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
          out.write(_jspx_template46);

        } while (_jspx_th_c_otherwise_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_otherwise_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_otherwise_0.release();
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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${violation.VIO_IMG1_NAME != null }", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
      if (_jspx_eval_c_if_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template52);
          // jsp code [from=(320,24);to=(320,33)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${filePath }",java.lang.String.class , pageContext.getVariableResolver(), null));

          // jsp code [from=(320,36);to=(320,59)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${violation.VIO_IMG1_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template53);

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
    _jspx_th_c_if_2.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${violation.VIO_IMG2_NAME != null }", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
      if (_jspx_eval_c_if_2 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template55);
          // jsp code [from=(325,24);to=(325,33)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${filePath }",java.lang.String.class , pageContext.getVariableResolver(), null));

          // jsp code [from=(325,36);to=(325,59)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${violation.VIO_IMG2_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template56);

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
    _jspx_th_c_if_3.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${violation.VIO_ACTIMG1_NAME != null }", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
      if (_jspx_eval_c_if_3 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template61);
          // jsp code [from=(396,25);to=(396,34)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${filePath }",java.lang.String.class , pageContext.getVariableResolver(), null));

          // jsp code [from=(396,37);to=(396,64)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${violation.VIO_ACTIMG1_NAME }",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template62);

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
    _jspx_th_c_if_4.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${violation.VIO_ACTIMG2_NAME != null }", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
      if (_jspx_eval_c_if_4 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template64);
          // jsp code [from=(401,25);to=(401,34)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${filePath }",java.lang.String.class , pageContext.getVariableResolver(), null));

          // jsp code [from=(401,37);to=(401,64)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${violation.VIO_ACTIMG2_NAME }",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template65);

        } while (_jspx_th_c_if_4.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_4.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_4.release();
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("vio");
    _jspx_th_c_forEach_0.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template35);
            // jsp code [from=(249,126);to=(249,133)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${vio.SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template36);
            // jsp code [from=(250,43);to=(250,54)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${vio.VIO_DEG}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template37);
            // jsp code [from=(251,31);to=(251,45)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${vio.VIO_POINTS}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template38);
            // jsp code [from=(252,31);to=(252,43)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${vio.VIO_DEPT}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template39);
            // jsp code [from=(253,31);to=(253,43)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${vio.VIO_DATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template40);
            // jsp code [from=(254,31);to=(254,43)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${vio.VIO_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template41);
            // jsp code [from=(255,31);to=(255,46)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${vio.VIO_ACTDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template42);
            // jsp code [from=(256,31);to=(256,46)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${vio.VIO_ACTNAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template43);

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

  private static jeus.servlet.jsp.el.FunctionMapperImpl _jspx_fnmap_0;
  
  static {
    _jspx_fnmap_0 = jeus.servlet.jsp.el.FunctionMapperImpl.getInstance();
    _jspx_fnmap_0.mapFunction("rnic:addDash", main.java.common.util.StringUtil.class, "addDash", new Class[] {java.lang.String.class});

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
  private final static String _jspx_template9 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n\r\n\r\n<script language=\"javascript\" src=\"/js/common.js\"></script>\r\n<script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script>\r\n<script language=\"javascript\" src=\"/js/calculation.js\"></script>\r\n<script language=\"javascript\" src=\"/js/selectItem.js\"></script>\r\n<script>\r\n\r\n\t// 등록폼 체크\r\n\tfunction checkForm(){\r\n\t\tvar form1 = document.form1;\r\n\t\talert(form1.year.value);\r\n\r\n\t\tform1.submit();\r\n\t\t//\t특수문자 입력시 글 끝에 공백과 줄바꿈을 넣어야 깨지지 않음. 이유는 모르겠슴\r\n\t\t//\t\tw.content.value = w.content.value+' '+'\\n';\t\r\n\t\t\r\n\t}\r\n\r\n\t// 추가폼 이동\r\n\tfunction goAdd(GAPAN_NO){\r\n\t\r\n\t\tvar GP_TYP = document.getElementById(\"GP_TYP\").value;\r\n\t\t\r\n\t\tdocument.form.action = \"/gapan/jumyong/violation_register.do?GAPAN_NO=\"+GAPAN_NO+\"&GP_TYP=\"+GP_TYP+\"&mode=add\";\r\n\t\tdocument.form.submit();\r\n\t}\r\n\r\n\t// 페이지이동\r\n\tfunction\tPage(page)\r\n\t{\r\n\t\tif(page\t==\t\"\")\r\n\t\t\treturn;\r\n\t\t\r\n\t\tvar GAPAN_NO = document.getElementById(\"GAPAN_NO\").value;\r\n\t\tvar GP_TYP = document.getElementById(\"GP_TYP\").value;\r\n\t\t\r\n\t\tlocation.href=\"/gapan/jumyong/violation_view.do?currentPage=\"+page+\"&GAPAN_NO=\"+GAPAN_NO+\"&GP_TYP=\"+GP_TYP;\r\n\t}\r\n\r\n\t// 상세보기\r\n\tfunction goView(seq){\r\n\t\t\r\n\t\tvar page = document.form.currentPage.value;\r\n\t\tvar GAPAN_NO = document.getElementById(\"GAPAN_NO\").value;\r\n\t\tvar GP_TYP = document.getElementById(\"GP_TYP\").value;\r\n\t\t\r\n\t\tlocation.href=\"/gapan/jumyong/violation_view.do?currentPage=\"+page+\"&SEQ=\"+seq+\"&GAPAN_NO=\"+GAPAN_NO+\"&GP_TYP=\"+GP_TYP;\r\n\t}\r\n\r\n\t// 삭제하기\r\n\tfunction goDel(seq){\r\n\t\tif(!confirm(\"위반조치내역을 삭제하시겠습니까?\"))\r\n            return;\r\n\r\n\t\tvar page = document.form.currentPage.value;\r\n\t\tvar GAPAN_NO = document.getElementById(\"GAPAN_NO\").value;\r\n\t\tvar GP_TYP = document.getElementById(\"GP_TYP\").value;\r\n\t\t\r\n\t\tlocation.href=\"/gapan/jumyong/violation_view.do?currentPage=\"+page+\"&SEQ=\"+seq+\"&GAPAN_NO=\"+GAPAN_NO+\"&GP_TYP=\"+GP_TYP+\"&mode=del\";\r\n\t}\r\n\t\r\n\t// 수정하기\r\n\tfunction goModify(seq){\r\n\t\tdocument.form.action = \"/gapan/jumyong/violation_register.do?SEQ=\"+seq+\"&mode=edit\";\r\n\t\tdocument.form.submit();\r\n\t}\r\n\r\n\t\r\n\tfunction InitPage()\r\n\t{\t\r\n\t\tvar obj = document.form.message.value;\r\n\t\t\r\n\t\tif(obj != \"\")\t\r\n\t\t\talert(obj);\r\n\r\n\t\t\r\n\t\tvar _vioSel = document.getElementsByName('VIO_SEL');\r\n\t\tvar _vioActSel = document.getElementsByName('VIO_ActSEL');\r\n\t\t\r\n\t\tvar _vioSelArray = ['";
  private final static String _jspx_template10 = "',\r\n\t\t                    '";
  private final static String _jspx_template11 = "',\r\n\t\t                    '";
  private final static String _jspx_template12 = "',\r\n\t\t                    '";
  private final static String _jspx_template13 = "',\r\n\t\t                    '";
  private final static String _jspx_template14 = "',\r\n\t\t                    '";
  private final static String _jspx_template15 = "',\r\n\t\t                    '";
  private final static String _jspx_template16 = "'];\r\n\t\t\r\n\t\tvar _vioActSelArray = ['";
  private final static String _jspx_template17 = "',\r\n\t\t                    '";
  private final static String _jspx_template18 = "',\r\n\t\t                    '";
  private final static String _jspx_template19 = "',\r\n\t\t                    '";
  private final static String _jspx_template20 = "',\r\n\t\t                    '";
  private final static String _jspx_template21 = "'];\r\n\t\t\r\n\t\t\r\n\t\t\r\n\t\t\r\n\t\tfor(var i = 0;i < _vioSel.length ;i++){\r\n\t\t\t\r\n\t\t\tif(_vioSelArray[i] == '1')\r\n\t\t\t\t_vioSel[i].checked = true;\r\n\t\t}\r\n\t\t\r\n\t\tfor(var i = 0;i < _vioActSel.length ;i++){\r\n\t\t\tif(_vioActSelArray[i] == '1')\r\n\t\t\t_vioActSel[i].checked = true;\r\n\t\t}\r\n\t\t\t\r\n\t\treturn;\r\n\t}\r\n\r\n\r\n\tfunction resize_popup(obj)\r\n\t{\r\n\t\tif(obj == '1'){\r\n           Message_Display('IMG1_FULL','IMG1_FULLValue',1);\r\n\t\t}else if(obj == '2'){\r\n           Message_Display('IMG2_FULL','IMG2_FULLValue',1);\r\n\t\t}else if(obj == '3'){\r\n           Message_Display('ACTIMG1_FULL','ACTIMG1_FULLValue',1);\r\n\t\t}else if(obj == '4'){\r\n           Message_Display('ACTIMG2_FULL','ACTIMG2_FULLValue',1);\r\n\t\t}\r\n\t\t\r\n\t}\r\n\t\r\n</script>\r\n\r\n</head>\r\n\r\n<body onload=\"InitPage();\">\r\n\r\n<form id=\"form\" name=\"form\" method=\"post\">\r\n\t<input type=\"hidden\" id=\"GAPAN_NO\" name=\"GAPAN_NO\" value=\"";
  private final static String _jspx_template22 = "\">\r\n\t<input type=\"hidden\" id=\"GP_TYP\" name=\"GP_TYP\" value=\"001\">\r\n\t<input type=\"hidden\" id=\"message\" name=\"message\" value=\"";
  private final static String _jspx_template23 = "\">\r\n\t<input type=\"hidden\" id=\"mode\" name=\"mode\" value=\"";
  private final static String _jspx_template24 = "\">\r\n\t<input type=\"hidden\" id=\"currentPage\" name=\"currentPage\" value=\"";
  private final static String _jspx_template25 = "\">\r\n\t\r\n<div id=\"IMG1_FULL\" style=\"position: absolute; visibility: hidden;\">\r\n\t<table border=\"2\" bordercolor=\"#c9dfed\" style=\"background-color:white;\">\r\n\t\t<tr>\r\n\t\t\t<td height=\"20px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">이미지를 클릭하면 닫힘</td>\r\n\t\t</tr>\r\n\t\t<tr>\r\n\t\t\t<td align=\"center\" >\r\n\t\t\t\t<img src=\"";
  private final static String _jspx_template26 = "\" id=\"IMG1_FULLValue\"  name=\"IMG1_FULLValue\" onclick=\"Message_Display('IMG1_FULL','IMG1_FULLValue',0);\" style=\"max-height:360px;max-width:480px;cursor:pointer;\">\r\n\t\t\t</td>\r\n\t\t</tr>\r\n\t</table>\r\n\r\n</div>\r\n\r\n<div id=\"IMG2_FULL\" style=\"position:absolute;visibility:hidden;\">\r\n\t<table border=\"2\" bordercolor=\"#c9dfed\" style=\"background-color:white;\">\r\n\t\t<tr>\r\n\t\t\t<td height=\"20px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">이미지를 클릭하면 닫힘</td>\r\n\t\t</tr>\r\n\t\t<tr>\r\n\t\t\t<td align=\"center\" >\r\n\t\t\t\t<img src=\"";
  private final static String _jspx_template27 = "\" id=\"IMG2_FULLValue\"  name=\"IMG2_FULLValue\" onclick=\"Message_Display('IMG2_FULL','IMG2_FULLValue',0);\" style=\"max-height:360px;max-width:480px;cursor:pointer;\">\r\n\t\t\t</td>\r\n\t\t</tr>\r\n\t</table>\r\n</div>\r\n\r\n<div id=\"ACTIMG1_FULL\" style=\"position: absolute; visibility: hidden;\">\r\n\t<table border=\"2\" bordercolor=\"#c9dfed\" style=\"background-color:white;\">\r\n\t\t<tr>\r\n\t\t\t<td height=\"20px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">이미지를 클릭하면 닫힘</td>\r\n\t\t</tr>\r\n\t\t<tr>\r\n\t\t\t<td align=\"center\" >\r\n\t\t\t\t<img src=\"";
  private final static String _jspx_template28 = "\" id=\"ACTIMG1_FULLValue\"  name=\"ACTIMG1_FULLValue\" onclick=\"Message_Display('ACTIMG1_FULL','ACTIMG1_FULLValue',0);\" style=\"max-height:360px;max-width:480px;cursor:pointer;\">\r\n\t\t\t</td>\r\n\t\t</tr>\r\n\t</table>\r\n\r\n</div>\r\n\r\n<div id=\"ACTIMG2_FULL\" style=\"position:absolute;visibility:hidden;\">\r\n\t<table border=\"2\" bordercolor=\"#c9dfed\" style=\"background-color:white;\">\r\n\t\t<tr>\r\n\t\t\t<td height=\"20px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">이미지를 클릭하면 닫힘</td>\r\n\t\t</tr>\r\n\t\t<tr>\r\n\t\t\t<td align=\"center\" >\r\n\t\t\t\t<img src=\"";
  private final static String _jspx_template29 = "\" id=\"ACTIMG2_FULLValue\"  name=\"ACTIMG2_FULLValue\" onclick=\"Message_Display('ACTIMG2_FULL','ACTIMG2_FULLValue',0);\" style=\"max-height:360px;max-width:480px;cursor:pointer;\">\r\n\t\t\t</td>\r\n\t\t</tr>\r\n\t</table>\r\n</div>\r\n\r\n\r\n<table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t<tr>\r\n\t\t<td class=\"contborder_purple\">\r\n\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t<tr height=\"36\">\r\n\t\t\t\t<td>\r\n\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse: collapse;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" width=\"13%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용기간</td>\r\n\t\t\t\t\t\t<td width=\"32%\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template30 = " ~ ";
  private final static String _jspx_template31 = "\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t<td height=\"26\" width=\"13%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">누적벌점</td>\r\n\t\t\t\t\t\t<td width=\"32%\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template32 = "점\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td>\r\n\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse: collapse;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td width=\"60\" height=\"25\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">번호</td>\r\n\t\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">벌점</td>\r\n\t\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점검기관</td>\r\n\t\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">위반일자</td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">위반내역</td>\r\n\t\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조치일자</td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조치내역</td>\r\n\t\t\t\t\t</tr>\r\n\r\n\t\t\t\t\t";
  private final static String _jspx_template33 = "\r\n\t\t\t\t\t\t";
  private final static String _jspx_template34 = "\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template35 = "\r\n\t\t\t\t\t\t\t\t<tr onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\" onclick=\"goView('";
  private final static String _jspx_template36 = "')\" style=\"cursor: pointer\">\r\n\t\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\">";
  private final static String _jspx_template37 = "</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template38 = "</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template39 = "</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template40 = "</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template41 = "</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template42 = "</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template43 = "</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template44 = "\r\n\t\t\t\t\t\t";
  private final static String _jspx_template45 = "\r\n\t\t\t\t\t\t";
  private final static String _jspx_template46 = "\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td align=\"center\" class=\"sub_table\" colspan=\"7\" height=\"85\">내용이 없습니다</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t";
  private final static String _jspx_template47 = "\r\n\t\t\t\t\t";
  private final static String _jspx_template48 = "\r\n\r\n\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"40\" align=\"center\">\r\n\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td align=\"center\">\r\n\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td>";
  private final static String _jspx_template49 = "</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"20\"></td>\r\n\t\t\t</tr>\r\n\r\n\t\t\t";
  private final static String _jspx_template50 = "\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td>\r\n\t\t\t\t\t<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td width=\"10%\" height=\"26\" align=\"left\" class=\"sub_table_b\">* 위반 및 조치사항 세부 내역</td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t</table>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td>\r\n\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse: collapse;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td height=\"26px\" align=\"left\" class=\"sub_table_b\" colspan=\"4\">\r\n\t\t\t\t\t\t\t* 위반사항\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td width=\"10%\" height=\"32px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점검기관</td>\r\n\t\t\t\t\t\t\t<td width=\"35%\" bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template51 = "</td>\r\n\t\t\t\t\t\t\t<td width=\"55%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"2\" rowspan=\"3\">\r\n\t\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse: collapse;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" width=\"50%\" nowrap>위반사진1</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" width=\"50%\" nowrap>위반사진2</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td height=\"102px\" style=\"background-position: 50% 50%;\">\r\n\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template52 = "\r\n\t\t\t\t\t\t\t\t\t\t\t<img src=\"";
  private final static String _jspx_template53 = "\" id=\"img1\"  name=\"img1\" onclick=\"resize_popup('1');\" style=\"cursor:pointer;width:80px;height:102px\">\r\n\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template54 = "\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t<td style=\"background-position: 50% 50%;\">\r\n\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template55 = "\r\n\t\t\t\t\t\t\t\t\t\t\t<img src=\"";
  private final static String _jspx_template56 = "\" id=\"img1\"  name=\"img1\" onclick=\"resize_popup('2');\" style=\"cursor:pointer;width:80px;height:102px\">\r\n\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template57 = "\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td height=\"32px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">위반일자</td>\r\n\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template58 = "\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td height=\"110px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">위반내역</td>\r\n\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t<table>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"VIO_SEL\" disabled=\"disabled\">전매/전대</input>\r\n\t\t\t\t\t\t\t\t\t\t</td>                                     \r\n\t\t\t\t\t\t\t\t\t\t<td>                                      \r\n\t\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"VIO_SEL\" disabled=\"disabled\">대리운영</input>\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t</td>                                     \r\n\t\t\t\t\t\t\t\t\t\t<td>                                      \r\n\t\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"VIO_SEL\" disabled=\"disabled\">불법광고물</input>\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t</td>                                     \r\n\t\t\t\t\t\t\t\t\t</tr>                                         \r\n\t\t\t\t\t\t\t\t\t<tr>                                          \r\n\t\t\t\t\t\t\t\t\t\t<td>                                      \r\n\t\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"VIO_SEL\" disabled=\"disabled\">음식조리</input>\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t</td>                                     \r\n\t\t\t\t\t\t\t\t\t\t<td>                                      \r\n\t\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"VIO_SEL\" disabled=\"disabled\">불법적치물</input>\r\n\t\t\t\t\t\t\t\t\t\t</td>                                     \r\n\t\t\t\t\t\t\t\t\t\t<td>                                      \r\n\t\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"VIO_SEL\" disabled=\"disabled\">시설물훼손</input>\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td colspan=\"3\">\r\n\t\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"VIO_SEL\" disabled=\"disabled\">\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t기타 \r\n\t\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"VIO_CONTENT\" name=\"VIO_CONTENT\" class=\"input_form1\" style=\"width:190px;background-color:#F6F6F6;\" maxlength=\"100\" value='";
  private final static String _jspx_template59 = "' disabled=\"disabled\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t</input>\r\n\t\t\t\t\t\t\t\t\t\t\t</input>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td height=\"26px\" align=\"left\" class=\"sub_table_b\" colspan=\"4\">\r\n\t\t\t\t\t\t\t\t* 조치사항\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td height=\"32px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조치일자</td>\r\n\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"1\">\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template60 = "\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"2\" rowspan=\"3\">\r\n\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse: collapse;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" width=\"50%\" nowrap>조치사진1</td>\r\n\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" width=\"50%\" nowrap>조치사진2</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td height=\"102px\" style=\"background-position: 50% 50%;\">\r\n\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template61 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"";
  private final static String _jspx_template62 = "\" id=\"actimg1\"  name=\"actimg1\" onclick=\"resize_popup('3');\" style=\"cursor:pointer;width:80px;height:102px\">\r\n\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template63 = "\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td style=\"background-position: 50% 50%;\">\r\n\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template64 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"";
  private final static String _jspx_template65 = "\" id=\"actimg1\"  name=\"actimg1\" onclick=\"resize_popup('4');\" style=\"cursor:pointer;width:80px;height:102px\">\r\n\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template66 = "\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td height=\"110px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조치내용</td>\r\n\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<table>\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"VIO_ACTSEL\" disabled=\"disabled\">허가취소</input>\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"VIO_ACTSEL\" disabled=\"disabled\">시정명령</input>\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"VIO_ACTSEL\" disabled=\"disabled\">과태료부과</input>\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td colspan=\"3\">\r\n\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"VIO_ACTSEL\" disabled=\"disabled\">\r\n\t\t\t\t\t\t\t\t\t\t\t벌점부과\r\n\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"VIO_POINTS\" name=\"VIO_POINTS\" class=\"input_form1\" style=\"width:30px;text-align:right;background-color:#F6F6F6;\" maxlength=\"20\" value=\"";
  private final static String _jspx_template67 = "\" onKeyDown=\"onlyNumberInput();\" disabled=\"disabled\">점\r\n\t\t\t\t\t\t\t\t\t\t\t</input>\r\n\t\t\t\t\t\t\t\t\t\t</input>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td colspan=\"3\">\r\n\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"VIO_ACTSEL\" disabled=\"disabled\">\r\n\t\t\t\t\t\t\t\t\t\t\t기타\r\n\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"VIO_ACTCONTENT\" name=\"VIO_ACTCONTENT\" class=\"input_form1\" style=\"width:190px;background-color:#F6F6F6;\" maxlength=\"100\" value='";
  private final static String _jspx_template68 = "' disabled=\"disabled\">\r\n\t\t\t\t\t\t\t\t\t\t\t</input>\r\n\t\t\t\t\t\t\t\t\t\t</input>\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t</table>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t";
  private final static String _jspx_template69 = "\r\n\r\n\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"40\" align=\"right\"><img src=\"/img/add_icon.gif\" alt=\"추가\" width=\"56\" height=\"18\" border=\"0\" onClick=\"javascript:goAdd('";
  private final static String _jspx_template70 = "');\" style=\"cursor: pointer\">\r\n\t\t\t\t";
  private final static String _jspx_template71 = "\r\n\t\t\t\t\t<img src=\"/img/mod_icon.gif\" alt=\"수정\" width=\"56\" height=\"18\" border=\"0\" onClick=\"javascript:goModify('";
  private final static String _jspx_template72 = "');\" style=\"cursor: pointer\">\r\n\t\t\t\t\t<img src=\"/img/del_icon3.gif\" alt=\"삭제\" width=\"56\" height=\"18\" border=\"0\" onClick=\"javascript:goDel('";
  private final static String _jspx_template73 = "');\" style=\"cursor: pointer\">\r\n\t\t\t\t";
  private final static String _jspx_template74 = "\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\r\n\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n</table>\r\n\r\n</form>\r\n</body>\r\n</html>\r\n";
}
