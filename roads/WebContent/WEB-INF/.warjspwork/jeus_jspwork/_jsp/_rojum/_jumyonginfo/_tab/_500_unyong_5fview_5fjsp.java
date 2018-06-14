package jeus_jspwork._jsp._rojum._jumyonginfo._tab;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_unyong_5fview_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(33,10);to=(33,31)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_IMG_NAME }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(49,15);to=(49,24)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${filePath }",java.lang.String.class , pageContext.getVariableResolver(), null));

      // jsp code [from=(49,27);to=(49,48)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_IMG_NAME }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(75,62);to=(75,70)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(76,60);to=(76,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GU_CODE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(87,17);to=(87,25)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${filePath}",java.lang.String.class , pageContext.getVariableResolver(), null));

      // jsp code [from=(87,28);to=(87,48)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_IMG_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(87,91);to=(87,99)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${filePath}",java.lang.String.class , pageContext.getVariableResolver(), null));

      // jsp code [from=(87,102);to=(87,122)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_IMG_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(107,65);to=(107,81)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_0_fn(pageContext, null)) return;


      out.write(_jspx_template18);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_1_fn(pageContext, null)) return;


      out.write(_jspx_template21);
      // jsp code [from=(138,53);to=(138,68)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_SSN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_2_fn(pageContext, null)) return;


      out.write(_jspx_template24);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_3_fn(pageContext, null)) return;


      out.write(_jspx_template26);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_4_fn(pageContext, null)) return;


      out.write(_jspx_template29);
      // jsp code [from=(150,53);to=(150,68)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_TEL}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template30);
      // jsp code [from=(152,53);to=(152,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_HP}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template31);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_5_fn(pageContext, null)) return;


      out.write(_jspx_template33);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_6_fn(pageContext, null)) return;


      out.write(_jspx_template35);
      // jsp code [from=(185,18);to=(185,34)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_POST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template36);
      // jsp code [from=(193,18);to=(193,36)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_TOPOST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template37);
      // jsp code [from=(201,11);to=(201,28)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_ADDR1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template38);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_7_fn(pageContext, null)) return;


      out.write(_jspx_template40);
      // jsp code [from=(206,11);to=(206,28)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_JIBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template41);
      // jsp code [from=(206,32);to=(206,49)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_ADDR2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template42);
      // jsp code [from=(210,11);to=(210,30)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_TOADDR1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template43);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_8_fn(pageContext, null)) return;


      out.write(_jspx_template45);
      // jsp code [from=(215,11);to=(215,30)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_TOJIBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template46);
      // jsp code [from=(215,34);to=(215,53)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_TOADDR2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template47);
      // jsp code [from=(224,12);to=(224,20)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SI}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template48);
      // jsp code [from=(224,30);to=(224,39)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template49);
      // jsp code [from=(224,48);to=(224,61)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.DORO_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template50);
      // jsp code [from=(224,70);to=(224,82)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_BON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template51);
      // jsp code [from=(224,91);to=(224,102)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_BU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template52);
      // jsp code [from=(224,111);to=(224,122)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template53);
      // jsp code [from=(224,131);to=(224,146)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_DET_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template54);
      // jsp code [from=(228,12);to=(228,22)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOSI}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template55);
      // jsp code [from=(228,32);to=(228,41)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template56);
      // jsp code [from=(228,50);to=(228,65)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TODORO_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template57);
      // jsp code [from=(228,74);to=(228,88)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOBD_BON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template58);
      // jsp code [from=(228,97);to=(228,110)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOBD_BU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template59);
      // jsp code [from=(228,119);to=(228,132)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOBD_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template60);
      // jsp code [from=(228,141);to=(228,158)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOBD_DET_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template61);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_9_fn(pageContext, null)) return;


      out.write(_jspx_template75);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_12_fn(pageContext, null)) return;


      out.write(_jspx_template91);
      // jsp code [from=(275,81);to=(275,96)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.LT_SEL_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template92);
      // jsp code [from=(280,17);to=(280,28)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.NOTE }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template93);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_15_fn(pageContext, null)) return;


      out.write(_jspx_template96);

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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_IDCHK == '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template17);

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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_IMG_NAME != null }", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
      if (_jspx_eval_c_if_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template19);
          // jsp code [from=(129,25);to=(129,34)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${filePath }",java.lang.String.class , pageContext.getVariableResolver(), null));

          // jsp code [from=(129,37);to=(129,58)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_IMG_NAME }",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template20);

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
    _jspx_th_c_if_2.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_GENDER == '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
      if (_jspx_eval_c_if_2 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template23);

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
    _jspx_th_c_if_3.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_GENDER == '2'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
      if (_jspx_eval_c_if_3 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template25);

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
    _jspx_th_c_if_4.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_AGE != null}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
      if (_jspx_eval_c_if_4 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template27);
          // jsp code [from=(145,58);to=(145,73)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_AGE}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template28);

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
    _jspx_th_c_if_5.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADDR_CHECK1 == '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
      if (_jspx_eval_c_if_5 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template32);

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
    _jspx_th_c_if_6.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADDR_CHECK1 != '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
      if (_jspx_eval_c_if_6 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template34);

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
    _jspx_th_c_if_7.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_SAN == '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_7 = _jspx_th_c_if_7.doStartTag();
      if (_jspx_eval_c_if_7 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template39);

        } while (_jspx_th_c_if_7.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_7.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_7.release();
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
    _jspx_th_c_if_8.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_TOSAN == '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_8 = _jspx_th_c_if_8.doStartTag();
      if (_jspx_eval_c_if_8 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template44);

        } while (_jspx_th_c_if_8.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_8.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_8.release();
    }
    return false;
  }

  private boolean _jspx_th_c_if_9_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:if ---- //
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_9 = new org.apache.taglibs.standard.tag.rt.core.IfTag();
    _jspx_th_c_if_9.setPageContext(pageContext);
    _jspx_th_c_if_9.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.DORO_NM != null && board.DORO_NM != ''}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_9 = _jspx_th_c_if_9.doStartTag();
      if (_jspx_eval_c_if_9 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template62);
          // jsp code [from=(239,12);to=(239,20)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SI}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template63);
          // jsp code [from=(239,24);to=(239,33)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template64);
          // jsp code [from=(239,37);to=(239,50)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.DORO_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template65);
          // jsp code [from=(240,12);to=(240,24)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_BON}",java.lang.String.class , pageContext.getVariableResolver(), null));

          // ----  c:if ---- invoke //
          if (_jspx_th_c_if_10_fn(pageContext, _jspx_th_c_if_9)) return true;


          out.write(_jspx_template67);
          // jsp code [from=(240,108);to=(240,119)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

          // jsp code [from=(240,122);to=(240,137)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_DET_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template68);
          // jsp code [from=(242,11);to=(242,19)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SI}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template69);
          // jsp code [from=(242,23);to=(242,32)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template70);
          // jsp code [from=(242,36);to=(242,49)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.DORO_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template71);
          // jsp code [from=(242,53);to=(242,65)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_BON}",java.lang.String.class , pageContext.getVariableResolver(), null));

          // ----  c:if ---- invoke //
          if (_jspx_th_c_if_11_fn(pageContext, _jspx_th_c_if_9)) return true;


          out.write(_jspx_template73);
          // jsp code [from=(243,11);to=(243,22)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

          // jsp code [from=(243,25);to=(243,40)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_DET_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template74);

        } while (_jspx_th_c_if_9.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_9.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_9.release();
    }
    return false;
  }

  private boolean _jspx_th_c_if_12_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:if ---- //
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_12 = new org.apache.taglibs.standard.tag.rt.core.IfTag();
    _jspx_th_c_if_12.setPageContext(pageContext);
    _jspx_th_c_if_12.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TODORO_NM != null && board.TODORO_NM != ''}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_12 = _jspx_th_c_if_12.doStartTag();
      if (_jspx_eval_c_if_12 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template76);
          // jsp code [from=(252,12);to=(252,22)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOSI}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template77);
          // jsp code [from=(252,26);to=(252,35)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template78);
          // jsp code [from=(252,39);to=(252,54)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TODORO_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template79);
          // jsp code [from=(253,12);to=(253,26)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOBD_BON}",java.lang.String.class , pageContext.getVariableResolver(), null));

          // ----  c:if ---- invoke //
          if (_jspx_th_c_if_13_fn(pageContext, _jspx_th_c_if_12)) return true;


          out.write(_jspx_template81);
          // jsp code [from=(253,116);to=(253,129)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOBD_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template82);
          // jsp code [from=(253,133);to=(253,150)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOBD_DET_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template83);
          // jsp code [from=(255,12);to=(255,22)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOSI}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template84);
          // jsp code [from=(255,26);to=(255,35)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template85);
          // jsp code [from=(255,39);to=(255,54)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TODORO_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template86);
          // jsp code [from=(255,58);to=(255,72)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOBD_BON}",java.lang.String.class , pageContext.getVariableResolver(), null));

          // ----  c:if ---- invoke //
          if (_jspx_th_c_if_14_fn(pageContext, _jspx_th_c_if_12)) return true;


          out.write(_jspx_template88);
          // jsp code [from=(256,12);to=(256,25)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOBD_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template89);
          // jsp code [from=(256,29);to=(256,46)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOBD_DET_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template90);

        } while (_jspx_th_c_if_12.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_12.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_12.release();
    }
    return false;
  }

  private boolean _jspx_th_c_if_15_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:if ---- //
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_15 = new org.apache.taglibs.standard.tag.rt.core.IfTag();
    _jspx_th_c_if_15.setPageContext(pageContext);
    _jspx_th_c_if_15.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION != '4'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_15 = _jspx_th_c_if_15.doStartTag();
      if (_jspx_eval_c_if_15 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template94);
          // jsp code [from=(294,69);to=(294,77)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template95);

        } while (_jspx_th_c_if_15.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_15.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_15.release();
    }
    return false;
  }

  private boolean _jspx_th_c_if_10_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:if ---- //
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_10 = new org.apache.taglibs.standard.tag.rt.core.IfTag();
    _jspx_th_c_if_10.setPageContext(pageContext);
    _jspx_th_c_if_10.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_if_10.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_BU != '0' && board.BD_BU != null}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_10 = _jspx_th_c_if_10.doStartTag();
      if (_jspx_eval_c_if_10 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template66);
          // jsp code [from=(240,86);to=(240,97)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_BU}",java.lang.String.class , pageContext.getVariableResolver(), null));


        } while (_jspx_th_c_if_10.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_10.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_10.release();
    }
    return false;
  }

  private boolean _jspx_th_c_if_11_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:if ---- //
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_11 = new org.apache.taglibs.standard.tag.rt.core.IfTag();
    _jspx_th_c_if_11.setPageContext(pageContext);
    _jspx_th_c_if_11.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_if_11.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_BU != '0' && board.BD_BU != null}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_11 = _jspx_th_c_if_11.doStartTag();
      if (_jspx_eval_c_if_11 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template72);
          // jsp code [from=(242,127);to=(242,138)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_BU}",java.lang.String.class , pageContext.getVariableResolver(), null));


        } while (_jspx_th_c_if_11.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_11.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_11.release();
    }
    return false;
  }

  private boolean _jspx_th_c_if_13_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:if ---- //
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_13 = new org.apache.taglibs.standard.tag.rt.core.IfTag();
    _jspx_th_c_if_13.setPageContext(pageContext);
    _jspx_th_c_if_13.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_if_13.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOBD_BU != '0' && board.TOBD_BU != null}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_13 = _jspx_th_c_if_13.doStartTag();
      if (_jspx_eval_c_if_13 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template80);
          // jsp code [from=(253,92);to=(253,105)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOBD_BU}",java.lang.String.class , pageContext.getVariableResolver(), null));


        } while (_jspx_th_c_if_13.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_13.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_13.release();
    }
    return false;
  }

  private boolean _jspx_th_c_if_14_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:if ---- //
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_14 = new org.apache.taglibs.standard.tag.rt.core.IfTag();
    _jspx_th_c_if_14.setPageContext(pageContext);
    _jspx_th_c_if_14.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_if_14.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOBD_BU != '0' && board.TOBD_BU != null}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_14 = _jspx_th_c_if_14.doStartTag();
      if (_jspx_eval_c_if_14 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template87);
          // jsp code [from=(255,138);to=(255,151)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOBD_BU}",java.lang.String.class , pageContext.getVariableResolver(), null));


        } while (_jspx_th_c_if_14.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_14.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_14.release();
    }
    return false;
  }

  private final static String _jspx_template0 = "\r\n";
  private final static String _jspx_template1 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('사용자의 사용시간이 종료되었습니다. 다시 접속 해주시기 바랍니다.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template2 = "    \r\n";
  private final static String _jspx_template3 = "\r\n";
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "  \r\n";
  private final static String _jspx_template6 = "  \r\n";
  private final static String _jspx_template7 = "\r\n";
  private final static String _jspx_template8 = "\r\n";
  private final static String _jspx_template9 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n}\r\n-->\r\n\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n<script language=\"javascript\" src=\"/js/common.js\"></script>\r\n<script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script>\r\n<script language=\"javascript\" src=\"/js/calculation.js\"></script>\r\n<script language='JavaScript' src='/js/Check_inputbox.js'></script>\r\n<script type=\"text/javascript\">\r\n//<![CDATA[\r\n\tfunction \tInit()\r\n\t{\r\n\t\tparent.Tab_Img(\"unyong\");\r\n\r\n\t\tif( '";
  private final static String _jspx_template10 = "' != '' ){\r\n\t\t\timg_resize();\r\n\t\t}\r\n\t}\r\n\t\r\n\tfunction\tModify(gapanno)\r\n\t{\r\n\t\tvar form = document.form;\r\n\r\n\t\tform.action = \"/rojum/jumyonginfo/unyong_modify.do?GAPAN_NO=\"+gapanno;\r\n\t\tform.submit();\r\n\t}\r\n\r\n\r\n\tvar w, h;\r\n\tvar max_w = 150; //창의 가로크기, 이미지의 최대 크기가 된다.\r\n\timg_src = \"";
  private final static String _jspx_template11 = "\"; //이미지의 주소, img1의 src속성과 같아야 한다.\r\n\t\r\n\tfunction img_resize()\r\n\t{\r\n\t\tvar i = eval(document.all.img1);\r\n\t \tw = i.width;\r\n\t \th = i.height;\r\n\t\tif(w > max_w)\r\n\t \t{\r\n\t  \t\ti.width = max_w;\r\n\t \t}\r\n\t}\r\n\t\r\n\t\r\n\tfunction resize_popup()\r\n\t{\r\n\t\tMessageDisplay('IMG_FULL','IMG_FULLValue',1);\r\n\t}\r\n\r\n\r\n//]]>\r\n</script>\r\n\r\n<body onload=\"Init()\">\r\n\r\n<form id=\"form\" name=\"form\" method=\"post\">\r\n\t<input type=\"hidden\" id=\"GAPAN_NO\" name=\"GAPAN_NO\" value=\"";
  private final static String _jspx_template12 = "\">\r\n\t<input type=\"hidden\" id=\"GU_CODE\" name=\"GU_CODE\" value=\"";
  private final static String _jspx_template13 = "\">\r\n\t\r\n\t<div id=\"IMG_FULL\" name=\"IMG_FULL\" style=\"position: absolute; display:none;\">\r\n\t<table id=\"IMG_FULLValue\" name=\"IMG_FULLValue\" width=\"380px\" height=\"400px\" border=\"2\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;background-color:white;\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t<tr>\r\n\t\t\t<td height=\"20px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">\r\n\t\t\t\t이미지를 클릭하면 닫힘\r\n\t\t\t</td>\r\n\t\t</tr>\r\n\t\t<tr>\r\n\t\t\t<td height=\"380px\" align=\"center\" onclick=\"MessageDisplay('IMG_FULL','IMG_FULLValue',0);\">\r\n\t\t\t\t<img src=\"";
  private final static String _jspx_template14 = "\" onload=\"javascript:fitImageSize(this,'";
  private final static String _jspx_template15 = "',380,380)\" style=\"cursor: pointer;\">\r\n\t\t\t</td>\r\n\t\t</tr>\r\n\t</table>\r\n\t</div>\r\n\r\n\t<table width=\"780\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t<tr>\r\n\t\t\t<td align=\"left\" class=\"contborder_purple\">\r\n\t\t\t\r\n\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t<tr>\r\n\t\t\t\t  <td>\r\n\t\t\t\t  \r\n\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t                <tr>\r\n\t                  \t<td>\r\n\t                  \t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;table-layout:fixed;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t\t<td width=\"15%\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">운영자명</td>\r\n\t\t\t\t\t\t\t<td width=\"35%\" bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template16 = "\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template17 = " \r\n\t\t\t\t\t\t\t\t\t(신분증 확인)\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template18 = "\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t<td width=\"15%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" rowspan=\"3\">\r\n\t\t\t\t\t\t\t\t<table>\r\n\t\t\t\t\t\t\t\t\t<tr><td>운영자 사진</td></tr>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t<br><br>\r\n\t\t\t\t\t\t\t\t\t\t\t<span onclick=\"javascript:document.getElementById('file1').click();\" style=\"overflow:hidden; background-repeat:no-repeat; cursor: pointer;\">\r\n\t\t\t\t\t\t\t\t\t\t\t</span>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t<td width=\"35%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" rowspan=\"3\" align=\"center\">\r\n\t\t\t\t\t\t\t\t<table>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"100%\" height=\"130px\" style=\"background-position:50% 50%;\" >\r\n\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template19 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"";
  private final static String _jspx_template20 = "\" id=\"img1\" name=\"img1\" onload=\"img_resize();\" onclick=\"resize_popup();\" style=\"cursor:hand\">\r\n\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template21 = "\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td width=\"15%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">주민등록번호</td>\r\n\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template22 = "</td>\r\n\t\t\t\t\t  \t</tr>\r\n\t\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">성별(나이)</td>\r\n\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template23 = "남";
  private final static String _jspx_template24 = "\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template25 = "여";
  private final static String _jspx_template26 = "\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template27 = "&nbsp;(";
  private final static String _jspx_template28 = " 세)";
  private final static String _jspx_template29 = "\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t  \t</tr>\r\n\t\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">전화번호</td>\r\n\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template30 = "</td>\r\n\t\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">휴대전화</td>\r\n\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template31 = "</td>\r\n\t\t\t\t\t  \t</tr>\r\n\t\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t\t<td height=\"34px\" colspan=\"2\" align=\"left\" bgcolor=\"#FFFFFF\" class=\"\">\r\n\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t  <td width=\"50%\">\r\n\t\t\t\t\t\t\t\t\t  \t<span class=\"sub_stan_blue\">* 주민등록지 주소</span>\r\n\t\t\t\t\t\t\t\t\t  </td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t<td height=\"34px\" colspan=\"2\" align=\"left\" bgcolor=\"#FFFFFF\" class=\"\">\r\n\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t  <td width=\"50%\">\r\n\t\t\t\t\t\t\t\t\t  \t<span class=\"sub_stan_blue\">* 실제거주지 : </span>\r\n\t\t\t\t\t\t\t\t\t  \t";
  private final static String _jspx_template32 = "\r\n\t\t\t\t\t\t\t\t\t  \t\t주민등록지 주소 정보와 동일\r\n\t\t\t\t\t\t\t\t\t  \t";
  private final static String _jspx_template33 = "\r\n\t\t\t\t\t\t\t\t\t  \t";
  private final static String _jspx_template34 = "\r\n\t\t\t\t\t\t\t\t\t  \t\t주민등록지 주소 정보와 동일하지 않음\r\n\t\t\t\t\t\t\t\t\t  \t";
  private final static String _jspx_template35 = "\r\n\t\t\t\t\t\t\t\t\t  </td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t  \t</tr>\r\n\t\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">우편번호</td>\r\n\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t  <td>";
  private final static String _jspx_template36 = "</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">우편번호</td>\r\n\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t  <td>";
  private final static String _jspx_template37 = "</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t  \t</tr>\r\n\t\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">기본 주소</td>\r\n\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template38 = "<br>\t\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template39 = "\r\n\t\t\t\t\t\t\t\t\t산\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template40 = "\r\n\t\t\t\t\t\t\t\t<!-- OWNER_BONBUN + OWNER_BUBUN = OWNER_JIBUN -->\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template41 = " ";
  private final static String _jspx_template42 = "\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t<td height=\"35px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">기본 주소</td>\r\n\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template43 = "<br> \r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template44 = "\r\n\t\t\t\t\t\t\t\t\t산\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template45 = "\r\n\t\t\t\t\t\t\t\t<!-- OWNER_TOBONBUN + OWNER_TOBUBUN = OWNER_TOJIBUN -->\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template46 = " ";
  private final static String _jspx_template47 = "\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t  \t</tr>\r\n\t\t\t\t\t  \t<!--  //********** BEGIN_KANG_20120424 -->\r\n\t\t\t\t\t\t<!-- \r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">도로명 주소</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t ";
  private final static String _jspx_template48 = "&nbsp; ";
  private final static String _jspx_template49 = "&nbsp;";
  private final static String _jspx_template50 = "&nbsp;";
  private final static String _jspx_template51 = "&nbsp;";
  private final static String _jspx_template52 = "&nbsp;";
  private final static String _jspx_template53 = "&nbsp;";
  private final static String _jspx_template54 = "\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">도로명 주소</td>\r\n\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t ";
  private final static String _jspx_template55 = "&nbsp; ";
  private final static String _jspx_template56 = "&nbsp;";
  private final static String _jspx_template57 = "&nbsp;";
  private final static String _jspx_template58 = "&nbsp;";
  private final static String _jspx_template59 = "&nbsp;";
  private final static String _jspx_template60 = "&nbsp;";
  private final static String _jspx_template61 = "\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t  \t</tr>\r\n\t\t\t\t\t\t -->\t\r\n\t\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t\t<td height=\"35x\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">도로명 주소</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template62 = "\r\n\t\t\t\t\t\t\t\t<!-- sungh83 20131107 -->\r\n\t\t\t\t\t\t\t\t<!--  \r\n\t\t\t\t\t\t\t\t ";
  private final static String _jspx_template63 = " ";
  private final static String _jspx_template64 = " ";
  private final static String _jspx_template65 = "<br/>\r\n\t\t\t\t\t\t\t\t ";
  private final static String _jspx_template66 = "-";
  private final static String _jspx_template67 = " ";
  private final static String _jspx_template68 = "\r\n\t\t\t\t\t\t\t\t-->\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template69 = " ";
  private final static String _jspx_template70 = " ";
  private final static String _jspx_template71 = " ";
  private final static String _jspx_template72 = "-";
  private final static String _jspx_template73 = "<br/>\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template74 = "\r\n\t\t\t\t\t\t\t\t<!-- sungh83 20131107 -->\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template75 = "\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">도로명 주소</td>\r\n\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t ";
  private final static String _jspx_template76 = "\r\n\t\t\t\t\t\t\t <!-- sungh83 20131107 -->\r\n\t\t\t\t\t\t\t\t <!--\r\n\t\t\t\t\t\t\t\t ";
  private final static String _jspx_template77 = " ";
  private final static String _jspx_template78 = " ";
  private final static String _jspx_template79 = "<br/>\r\n\t\t\t\t\t\t\t\t ";
  private final static String _jspx_template80 = "-";
  private final static String _jspx_template81 = " ";
  private final static String _jspx_template82 = " ";
  private final static String _jspx_template83 = "\r\n\t\t\t\t\t\t\t\t --> \r\n\t\t\t\t\t\t\t\t ";
  private final static String _jspx_template84 = " ";
  private final static String _jspx_template85 = " ";
  private final static String _jspx_template86 = " ";
  private final static String _jspx_template87 = "-";
  private final static String _jspx_template88 = "<br/> \t\r\n\t\t\t\t\t\t\t\t ";
  private final static String _jspx_template89 = " ";
  private final static String _jspx_template90 = "\r\n\t\t\t\t\t\t\t\t <!-- sungh83 20131107 -->\r\n\t\t\t\t\t\t\t ";
  private final static String _jspx_template91 = "\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t  \t</tr>\r\n\t\t\t\t\t  \t<!--   //********** END_KANG_20120424 -->\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t  \t<td height=\"34px\" colspan=\"4\" align=\"left\" bgcolor=\"#FFFFFF\" class=\"\">\r\n\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t  <td width=\"50%\">\r\n\t\t\t\t\t\t\t\t\t  \t<span class=\"sub_stan_blue\">* 생활정도</span>\r\n\t\t\t\t\t\t\t\t\t  </td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td width=\"15%\" height=\"28px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" nowrap=\"nowrap\">감면대상</td>\r\n\t\t\t\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\" nowrap=\"nowrap\">";
  private final static String _jspx_template92 = "</td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td width=\"15%\" height=\"28px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" nowrap=\"nowrap\">비고</td>\r\n\t\t\t\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t        ";
  private final static String _jspx_template93 = "\r\n\t\t     \t\t\t\t</td>\r\n\t\t\t\t\t\t</tr>\r\n\t                  \t</table>\r\n\t                  \t</td>\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"40px\" align=\"right\">\r\n\t\t\t\t\t";
  private final static String _jspx_template94 = "\r\n\t\t\t\t\t<table width=\"0\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"right\">\r\n\t\t\t\t  \t\t<td height=\"40\" align=\"right\"><a href=\"javascript:Modify('";
  private final static String _jspx_template95 = "')\"><img src=\"/img/mod_icon.gif\" alt=\"수정\" width=\"56\" height=\"18\" border=\"0\"></a>\r\n\t\t\t\t  \t</table>\r\n\t\t\t\t  \t";
  private final static String _jspx_template96 = "\r\n\t\t\t\t  \t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t</table></td>\r\n\t\t</tr>\r\n\t</table>\r\n\r\n</form>\r\n</body>\r\n</html>\r\n";
}
