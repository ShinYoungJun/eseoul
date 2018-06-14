package jeus_jspwork._jsp._gapan._jumyonginfo._tab;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_jumin_5fmodify_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(308,61);to=(308,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(309,59);to=(309,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GU_CODE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(310,73);to=(310,94)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PARTN_IMG_NAME }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(321,110);to=(321,126)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PARTN_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(341,81);to=(341,101)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PARTN_IMG_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(350,12);to=(350,18)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${pt_sel}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(357,129);to=(357,145)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PARTN_SSN1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(358,132);to=(358,148)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PARTN_SSN2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_0_fn(pageContext, null)) return;


      out.write(_jspx_template21);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_1_fn(pageContext, null)) return;


      out.write(_jspx_template23);
      // jsp code [from=(365,130);to=(365,145)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PARTN_AGE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // jsp code [from=(371,59);to=(371,75)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PARTN_TEL1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);
      // jsp code [from=(372,59);to=(372,75)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PARTN_TEL2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template26);
      // jsp code [from=(373,59);to=(373,75)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PARTN_TEL3}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // jsp code [from=(377,57);to=(377,72)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PARTN_HP1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template28);
      // jsp code [from=(378,57);to=(378,72)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PARTN_HP2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template29);
      // jsp code [from=(379,57);to=(379,72)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PARTN_HP3}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template30);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_2_fn(pageContext, null)) return;


      out.write(_jspx_template32);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_3_fn(pageContext, null)) return;


      out.write(_jspx_template34);
      // jsp code [from=(416,149);to=(416,165)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PARTN_POST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template35);
      // jsp code [from=(416,211);to=(416,227)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PARTN_POST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template36);
      // jsp code [from=(425,136);to=(425,154)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PARTN_TOPOST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template37);
      // jsp code [from=(438,161);to=(438,177)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PARTN_POST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template38);
      // jsp code [from=(438,223);to=(438,239)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PARTN_POST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template39);
      // jsp code [from=(451,137);to=(451,155)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PARTN_TOPOST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template40);
      // jsp code [from=(465,113);to=(465,130)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PARTN_ADDR1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template41);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_4_fn(pageContext, null)) return;


      out.write(_jspx_template44);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_5_fn(pageContext, null)) return;


      out.write(_jspx_template47);
      // jsp code [from=(473,63);to=(473,81)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PARTN_BONBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template48);
      // jsp code [from=(474,63);to=(474,80)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PARTN_BUBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template49);
      // jsp code [from=(475,113);to=(475,130)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PARTN_ADDR2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template50);
      // jsp code [from=(480,117);to=(480,136)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PARTN_TOADDR1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template51);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_6_fn(pageContext, null)) return;


      out.write(_jspx_template54);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_7_fn(pageContext, null)) return;


      out.write(_jspx_template57);
      // jsp code [from=(488,67);to=(488,87)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PARTN_TOBONBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template58);
      // jsp code [from=(489,67);to=(489,86)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PARTN_TOBUBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template59);
      // jsp code [from=(490,117);to=(490,136)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PARTN_TOADDR2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template60);
      // jsp code [from=(497,69);to=(497,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PSI}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template61);
      // jsp code [from=(497,87);to=(497,97)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PGUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template62);
      // jsp code [from=(497,106);to=(497,121)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.p_DORO_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template63);
      // jsp code [from=(499,59);to=(499,68)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PSI}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template64);
      // jsp code [from=(500,60);to=(500,70)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PGUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template65);
      // jsp code [from=(501,70);to=(501,85)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.p_DORO_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template66);
      // jsp code [from=(504,63);to=(504,74)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PDONG}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template67);
      // jsp code [from=(505,59);to=(505,68)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PRI}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template68);
      // jsp code [from=(507,68);to=(507,82)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.p_BD_BON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template69);
      // jsp code [from=(509,65);to=(509,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.p_BD_BU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template70);
      // jsp code [from=(510,65);to=(510,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.p_BD_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template71);
      // jsp code [from=(511,73);to=(511,90)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.p_BD_DET_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template72);
      // jsp code [from=(516,73);to=(516,83)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PTSI}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template73);
      // jsp code [from=(516,92);to=(516,103)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PTGUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template74);
      // jsp code [from=(516,112);to=(516,127)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PTDORO_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template75);
      // jsp code [from=(518,61);to=(518,71)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PTSI}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template76);
      // jsp code [from=(519,63);to=(519,74)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PTGUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template77);
      // jsp code [from=(520,71);to=(520,86)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PTDORO_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template78);
      // jsp code [from=(521,65);to=(521,77)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PTDONG}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template79);
      // jsp code [from=(522,61);to=(522,71)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PTRI}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template80);
      // jsp code [from=(524,68);to=(524,82)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PTBD_BON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template81);
      // jsp code [from=(526,65);to=(526,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PTBD_BU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template82);
      // jsp code [from=(527,65);to=(527,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PTBD_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template83);
      // jsp code [from=(528,73);to=(528,90)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PTBD_DET_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template84);
      // jsp code [from=(539,39);to=(539,53)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template85);

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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PARTN_GENDER == '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template20);

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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PARTN_GENDER == '2'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
      if (_jspx_eval_c_if_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template22);

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
    _jspx_th_c_if_2.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADDR_CHECK2 == '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
      if (_jspx_eval_c_if_2 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template31);

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
    _jspx_th_c_if_3.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADDR_CHECK2 != '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
      if (_jspx_eval_c_if_3 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template33);

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
    _jspx_th_c_if_4.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PARTN_SAN == '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
      if (_jspx_eval_c_if_4 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template42);
          // jsp code [from=(468,127);to=(468,142)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PARTN_SAN}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template43);

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
    _jspx_th_c_if_5.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PARTN_SAN != '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
      if (_jspx_eval_c_if_5 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template45);
          // jsp code [from=(471,127);to=(471,142)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PARTN_SAN}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template46);

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
    _jspx_th_c_if_6.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PARTN_TOSAN == '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
      if (_jspx_eval_c_if_6 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template52);
          // jsp code [from=(483,131);to=(483,148)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PARTN_TOSAN}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template53);

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
    _jspx_th_c_if_7.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PARTN_TOSAN != '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_7 = _jspx_th_c_if_7.doStartTag();
      if (_jspx_eval_c_if_7 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template55);
          // jsp code [from=(486,131);to=(486,148)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PARTN_TOSAN}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template56);

        } while (_jspx_th_c_if_7.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_7.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_7.release();
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
  private final static String _jspx_template9 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n}\r\n-->\r\n\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script>\r\n<script language='JavaScript' src='/js/Check_inputbox.js'></script>\r\n<script language=\"javascript\" src=\"/js/Ajax_request.js\"></script>\r\n<!--  //********** BEGIN_현진_20120212 -->\r\n<script language=\"javascript\" src=\"/js/zipcode.js\"></script>\r\n<!--   //********** END_현진_20120212 -->   \r\n\r\n<!--  script language='JavaScript' src='/jsp/gapan/gapan/tab/info_register.js'></script-->\r\n<script type=\"text/javascript\">\r\n//<![CDATA[\r\n\tfunction \tInit()\r\n\t{\r\n\t\tparent.Tab_Img(\"jumin\");\r\n\t\t\r\n\t}\r\n\r\n\tfunction\tModifyPrc()\r\n\t{\r\n\t\tvar form = document.form;\r\n\r\n\t\tform.action = \"/gapan/jumyonginfo/jumin_modify_prc.do\";\r\n\t\tform.submit();\r\n\t}\r\n\r\n\tfunction\tCancel(GAPAN_NO)\r\n\t{\r\n\t\tvar form = document.form;\r\n\r\n\t\tform.action = \"/gapan/jumyonginfo/jumin_view.do?GAPAN_NO=\"+GAPAN_NO;\r\n\t\tform.submit();\r\n\t}\r\n\r\n\tfunction\tJumin_toaddr_Check()\r\n\t{\r\n\t\tvar form = document.form;\r\n\t\tvar\tchk\t= document.form.ADDR_CHECK2.checked;\r\n\t\t\r\n\t\tif(chk\t== true)\r\n\t\t{\r\n\t\t\t\r\n\t\t\tform.PARTN_TOPOST.value\t\t= form.PARTN_POST.value;\r\n\t\t\tform.PARTN_TOADDR1.value\t= form.PARTN_ADDR1.value;\r\n\t\t\tform.PARTN_TOADDR2.value\t= form.PARTN_ADDR2.value;\r\n\t\t\t\r\n\t\t\tform.PTADDR1_NEW.value\t= form.ADDR1_NEW.value;\r\n\t\t\tform.PTSI.value\t= form.PSI.value;\r\n\t\t\tform.PTGUN.value\t= form.PGUN.value; \r\n\t\t\tform.PTDORO_NM.value\t= form.p_DORO_NM.value;\r\n\t\t\tform.PTBD_NM.value\t= form.p_BD_NM.value;\r\n\t\t\tform.PTBD_DET_NM.value\t= form.p_BD_DET_NM.value;\r\n\t\t\t//********** BEGIN_현진_20120402\r\n\t\t\tform.PTDONG.value\t= form.PDONG.value;\r\n\t\t\tform.PTRI.value\t= form.PRI.value;\r\n\t\t\t//********** END_현진_20120402\r\n\t\t\tform.PTBD_BON.value\t= form.p_BD_BON.value;\r\n\t\t\tform.PTBD_BU.value\t= form.p_BD_BU.value;\r\n\t\t\t\r\n\t\t\tif(form.PARTN_SAN.checked == true){\r\n\t\t\t\tform.PARTN_SAN.value = \"1\";\r\n\t\t\t\tform.PARTN_TOSAN.checked = true;\r\n\t\t\t\tform.PARTN_TOSAN.value = \"1\";\r\n\t\t\t}else{\r\n\t\t\t\tform.PARTN_SAN.value = \"0\";\r\n\t\t\t\tform.PARTN_TOSAN.checked = false;\r\n\t\t\t\tform.PARTN_TOSAN.value = \"0\";\r\n\t\t\t}\r\n\t\t\tform.PARTN_TOBONBUN.value\t= form.PARTN_BONBUN.value;\r\n\t\t\tform.PARTN_TOBUBUN.value\t= form.PARTN_BUBUN.value;\r\n\t\t\t\r\n\t\t\tform.ADDR_CHECK2.value = \"1\";\r\n\t\t}\r\n\t\telse\r\n\t\t{\r\n\t\t\tform.ADDR_CHECK2.value = \"0\";\r\n\t\t\t\r\n\t\t\tif(form.PARTN_TOSAN.checked == true){\r\n\t\t\t\tform.PARTN_TOSAN.value = \"1\";\r\n\t\t\t}else{\r\n\t\t\t\tform.PARTN_TOSAN.value = \"0\";\r\n\t\t\t}\r\n\t\t}\r\n\t}\r\n    //********** BEGIN_현진_20120212\r\n    /*\t\r\n\tfunction \topenZipcodePopup(post, addr)\r\n\t{\r\n\t\tvar\tpost1\t= post;\r\n\t\tvar\taddr1\t= addr;\r\n\r\n\t\tvar url \t= \"/zipcode.do?openerPost=\" + post1 + \"&openerAddr=\" + addr1;\r\n\t\tvar winName = \"우편번호입력\";\r\n\t\tvar width \t= 420;\r\n\t\tvar height \t= 305;\r\n\t\tvar scroll \t= \"yes\";\r\n\t\tvar resize \t= \"no\";\r\n\r\n\t\tvar\toption\t= \"scrollbars=\" + scroll + \", \";\r\n\t\toption\t+= \"resize=\" + resize + \", \";\r\n\t\toption\t+= \"width=\" + width + \", \";\r\n\t\toption\t+= \"height=\" + height;\r\n\r\n\t\twindow.open(url, winName, option);\r\n\t}\r\n\r\n\t\r\n\tfunction openZipcodePopup_new(post, addr, addr_new, si, gu, doro, bd)\r\n\t{ \r\n\t\tvar\tpost1\t= post;\r\n\t\tvar\taddr1\t= addr;\r\n\t\tvar\taddr1_new\t= addr_new;\r\n\t\tvar\taddr1_si\t= si;\r\n\t\tvar\taddr1_gu\t= gu;\r\n\t\tvar\taddr1_doro\t= doro;\r\n\t\tvar\taddr1_bd\t= bd;\r\n\t\t\r\n\t\t \r\n\t\t\r\n\t\t//var url \t= \"/zipcode.do?openerPost=\" + post1 + \"&openerAddr=\" + addr1+ \"&openerAddrNew=\" + addr1_new+ \"&openerSi=\" + addr1_si+ \"&openerGu=\" + addr1_gu+ \"&openerDoro=\" + addr1_doro+\"&openerBd=\" + addr1_bd;\r\n\t\tvar url \t= \"/zipCode_New.do?openerPost=\" + post1 + \"&openerAddr=\" + addr1+ \"&openerAddrNew=\" + addr1_new+ \"&openerSi=\" + addr1_si+ \"&openerGun=\" + addr1_gu+ \"&openerDoro=\" + addr1_doro+\"&openerBd=\" + addr1_bd;\r\n\t\t\r\n\t\t//alert('url ='+url);\r\n\t\t\r\n\t\tvar winName = \"우편번호입력\";\r\n\t\t//var width \t= 420;\r\n\t\tvar width \t= 840;\r\n\t\tvar height \t= 305;\r\n\t\tvar scroll \t= \"yes\";\r\n\t\tvar resize \t= \"no\";\r\n\r\n\t\tvar\toption\t= ";
  private final static String _jspx_template10 = "\"scrollbars=\" + scroll + \", \";\r\n\t\toption\t+= \"resize=\" + resize + \", \";\r\n\t\toption\t+= \"width=\" + width + \", \";\r\n\t\toption\t+= \"height=\" + height;\r\n\r\n\t\twindow.open(url, winName, option);\r\n\t\t \r\n\t}\r\n    */\r\n    //********** END_현진_20120212\r\n     \r\n\t//파일업로드 찾아보기 버튼 변경\r\n\tfunction ChangeImg2()\r\n\t{\r\n\t//  var fileName = document.sender.file.value; //일단 주소부분은 주석처리\r\n\t\tnewImg = new Image(); //이미지 객체 생성\r\n\t\timgFileSize = \"\"; \r\n\t\tnewImg.src = \"\";\r\n\t\tmaxFileSize = 150*200;\r\n\t\tnewImg.src = document.getElementById(\"file2\").value;\r\n\t\tvar imgpath = document.form.PARTN_IMG.value;\r\n\t\tdocument.all[\"tblview2\"].style.backgroundImage=\"url(\" + imgpath + \")\";\r\n\t\tdocument.all[\"tblview2\"].style.backgroundRepeat=\"no-repeat\";\r\n\t\timgFileSize = newImg.fileSize;\r\n\t}\r\n\t\r\n\tfunction attach(obj) {\r\n\t\t/*\r\n\t    var val = obj.value;\r\n\t    //alert(obj.id);\r\n\t    //alert(document.getElementById(obj.id).value);\t    \r\n\t\tfile_size = get_file_check(document.getElementById(obj.id).value);\t\r\n\t\t\r\n\t\tif(0 == file_size)\r\n\t\t{\r\n\t\t\talert(file_size);\r\n\t\t\talert(document.getElementById('file1').value);\r\n\t\t\treturn;\r\n\t\t}\r\n\r\n\t\tdocument.getElementById('ATTACH_SIZE').value = CutDecimalPoint(file_size/1024);\t    \r\n\t    document.getElementById('ATTACH_FILE').value = getNoDirFileName(val);\r\n\t    */\r\n\t}\r\n\r\n\tfunction ChangeImg(thisObj, preViewer) {\r\n\t\t\r\n\t\tif(!/(\\.gif|\\.jpg|\\.jpeg|\\.png)$/i.test(thisObj.value)) {\r\n\t\t\talert(\"이미지 형식의 파일을 선택하십시오\");\r\n\t\t\treturn;\r\n\t\t}\r\n\r\n\t\tpreViewer = (typeof(preViewer) == \"object\") ? preViewer : document.getElementById(preViewer);\r\n\t\tvar ua = window.navigator.userAgent;\r\n\r\n\t\tif (ua.indexOf(\"MSIE\") > -1) {\r\n\t\t\tvar img_path = \"\";\r\n\t\t\tif (thisObj.value.indexOf(\"\\\\fakepath\\\\\") < 0) {                 \r\n\t\t\t\timg_path = thisObj.value;\r\n\t\t\t} else {\r\n\t\t\t\tthisObj.select();\r\n\t\t\t\tvar selectionRange = document.selection.createRange();\r\n\t\t\t\timg_path = selectionRange.text.toString();\r\n\t\t\t\tthisObj.blur();\r\n\t\t\t}\r\n\t\t\t\tpreViewer.style.filter = \"progid:DXImageTransform.Microsoft.AlphaImageLoader(src='fi\" + \"le://\" + img_path + \"', sizingMethod='scale')\";\r\n\t\t} else {\r\n\t\t\tpreViewer.innerHTML = \"\";\r\n\t\t\tvar W = preViewer.offsetWidth;\r\n\t\t\tvar H = preViewer.offsetHeight;\r\n\t\t\tvar tmpImage = document.createElement(\"img\");\r\n\t\t\tpreViewer.appendChild(tmpImage);\r\n\t\r\n\t\t\ttmpImage.onerror = function () {\r\n\t\t\t\treturn preViewer.innerHTML = \"\";\r\n\t\t\t};\r\n\t\r\n\t\t\ttmpImage.onload = function () {\r\n\t\r\n\t\t\t\tif (this.width > W) {\r\n\t\t\t\t\tthis.height = this.height / (this.width / W);\r\n\t\t\t\t\tthis.width = W;\r\n\t\t\t\t}\r\n\t\t\t\tif (this.height > H) {\r\n\t\t\t\t\tthis.width = this.width / (this.height / H);\r\n\t\t\t\t\tthis.height = H;\r\n\t\t\t\t}\r\n\t\t\t};\r\n\t        if (ua.indexOf(\"Firefox/3\") > -1) {\r\n\t\t\t\tvar picData = thisObj.files.item(0).getAsDataURL();\r\n\t\t\t\ttmpImage.src = picData;\r\n\t\t\t} else {\r\n\t\t\t\ttmpImage.src = \"file://\" + thisObj.value;\r\n\t\t\t}\r\n\t\t}\r\n     }\r\n\t//********** BEGIN_현진_20120809\r\n\tfunction InfoDel(){\r\n\t\tvar form = document.form;\t\t\t\r\n\t\t\r\n\t\tform.PARTN_NAME.value\t= \"\";\r\n\t\tform.PARTN_IMG_NAME.value = \"\";\r\n\t\tform.PARTN_SSN1.value\t= \"\";\r\n\t\tform.PARTN_SSN2.value\t= \"\";\r\n\t\t\r\n\t\tform.PARTN_TEL1.value\t= \"\";\r\n\t\tform.PARTN_TEL2.value\t= \"\";\r\n\t\tform.PARTN_TEL3.value\t= \"\";\r\n\r\n\t\tform.PARTN_HP1.value\t= \"\";\r\n\t\tform.PARTN_HP2.value\t= \"\";\r\n\t\tform.PARTN_HP3.value\t= \"\";\r\n\r\n\t\tform.PARTN_POST.value\t\t= \"\";\r\n\t\tform.PARTN_TOPOST.value\t\t= \"\";\r\n\t\tform.PARTN_ADDR1.value\t= \"\";\r\n\t\tform.PARTN_SAN.checked = false;\r\n\t\tform.PARTN_BONBUN.value\t= \"\";\r\n\t\tform.PARTN_BUBUN.value\t= \"\";\r\n\t\tform.PARTN_ADDR2.value\t= \"\";\r\n\t\tform.PARTN_TOADDR1.value\t= \"\";\r\n\t\tform.PARTN_TOSAN.checked = false;\r\n\t\tform.ADDR_CHECK2.checked = false;\r\n\t\tform.PARTN_TOBONBUN.value\t= \"\";\r\n\t\tform.PARTN_TOBUBUN.value\t= \"\";\r\n\t\tform.PARTN_TOADDR2.value\t= \"\";\r\n\t\tform.ADDR1_NEW.value\t= \"\";\r\n\t\tform.PSI.value\t= \"\";\r\n\t\tform.PGUN.value\t= \"\";\r\n\t\tform.p_DORO_NM.value\t= \"\";\r\n\t\tform.PDONG.value\t= \"\";\r\n\t\tform.PRI.value\t= \"\";\r\n\t\tform.p_BD_BON.value\t= \"\";\r\n\t\tform.p_BD_BU.value\t= \"\";\r\n\t\tform.p_BD_NM.value\t= \"\";\r\n\t\tform.p_BD_DET_NM.value\t= \"\";\r\n\t\tform.PTADDR1_NEW.value\t= \"\";\r\n\t\tform.PTSI.value\t= \"\";\r\n\t\tform.PTGUN.value\t= \"\";\r\n\t\tform.PTDORO_NM.value\t= \"\";\r\n\t\tform.PTDONG.value\t= \"\";\r\n\t\tform.PTRI.value\t= \"\";\r\n\t\tform.PTBD_BON.";
  private final static String _jspx_template11 = "value\t= \"\";\r\n\t\tform.PTBD_BU.value\t= \"\";\r\n\t\tform.PTBD_NM.value\t= \"\";\r\n\t\tform.PTBD_DET_NM.value\t= \"\";\r\n\t\t\t\r\n\t}\r\n\t//********** END_현진_20120809    \r\n//]]>\r\n</script>\r\n\r\n<body onkeyup=\"Init();\">\r\n<form id=\"form\" name=\"form\" method=\"post\" enctype=\"multipart/form-data\">\r\n\r\n<input type=\"hidden\" id=\"GAPAN_NO\" name=\"GAPAN_NO\" value=\"";
  private final static String _jspx_template12 = "\">\r\n<input type=\"hidden\" id=\"GU_CODE\" name=\"GU_CODE\" value=\"";
  private final static String _jspx_template13 = "\">\r\n<input type=\"hidden\" id=\"PARTN_IMG_NAME\" name=\"PARTN_IMG_NAME\" value=\"";
  private final static String _jspx_template14 = "\">\r\n\t<table width=\"780\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t<tr>\r\n\t\t<td align=\"left\" class=\"contborder_purple\">\r\n\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t<tr>\r\n\t                <td>\r\n\t                <table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" nowrap=\"nowrap\">동업자명</td>\r\n\t\t\t\t\t\t\t<td width=\"37%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" nowrap=\"nowrap\">\r\n\t\t\t\t\t\t\t\t<input id=\"PARTN_NAME\" name=\"PARTN_NAME\" type=\"text\" class=\"input_form1\" style=\"width:80px\" value=\"";
  private final static String _jspx_template15 = "\" maxlength=\"10\">\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" rowspan=\"4\" nowrap=\"nowrap\">\r\n\t\t\t\t\t\t\t\t<table>\r\n\t\t\t\t\t\t\t\t\t<tr><td>동업자 사진</td></tr>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t<br><br>\r\n\t\t\t\t\t\t\t\t\t\t\t<span onclick=\"javascript:document.getElementById('file2').click();\" style=\"overflow:hidden; background-repeat:no-repeat; cursor: pointer;\">\r\n\t\t\t\t\t\t\t\t\t\t\t</span>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" rowspan=\"4\" nowrap=\"nowrap\" align=\"center\">\r\n\t\t\t\t\t\t\t\t<table>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td><input type='file' id=\"PARTN_IMG\" name='PARTN_IMG' \tstyle=\"width:10;\" onchange=\"ChangeImg(this, 'tblview2'); attach(this);\"></td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td width=100 height=130 id=\"tblview2\" style=\"background-image:url('";
  private final static String _jspx_template16 = "'); background-repeat:no-repeat; background-attachment:scroll; background-position:50% 50%;\"></td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" nowrap=\"nowrap\">동업관계</td>\r\n\t\t\t\t\t\t\t<td width=\"37%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" nowrap=\"nowrap\">\r\n\t\t\t\t\t\t\t\t<select id=\"PT_SEL\" name=\"PT_SEL\" style=\"width:70px\" class=\"input_form1\">\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template17 = "\r\n\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" nowrap=\"nowrap\">주민번호</td>\r\n\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" nowrap=\"nowrap\">\r\n\t\t\t\t\t\t\t\t<input id=\"PARTN_SSN1\" name=\"PARTN_SSN1\" type=\"text\" class=\"input_form1\" style=\"width:40px; ime-mode:disabled\" value=\"";
  private final static String _jspx_template18 = "\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, PARTN_SSN2, 6);\" maxlength=\"6\">\r\n\t\t\t\t\t\t\t\t - <input id=\"PARTN_SSN2\" name=\"PARTN_SSN2\" type=\"text\" class=\"input_form1\" style=\"width:45px; ime-mode:disabled\" value=\"";
  private final static String _jspx_template19 = "\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);\" maxlength=\"7\"></td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t  \t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">성별(나이)</td>\r\n\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template20 = "<input name=\"PARTN_GENDER\" type=\"radio\" value=\"1\" checked>남<input name=\"PARTN_GENDER\" type=\"radio\" value=\"2\">여";
  private final static String _jspx_template21 = "\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template22 = "<input name=\"PARTN_GENDER\" type=\"radio\" value=\"1\">남<input name=\"PARTN_GENDER\" type=\"radio\" value=\"2\" checked>여";
  private final static String _jspx_template23 = "\r\n\t\t\t\t\t\t\t\t&nbsp;( <input id=\"PARTN_AGE\" name=\"PARTN_AGE\" class=\"input_form1\" type=\"text\" style=\"width:20px\" maxlength=\"3\" value=\"";
  private final static String _jspx_template24 = "\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);\"> 세)\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t  \t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">전화번호</td>\r\n\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t<input id=\"PARTN_TEL1\" name=\"PARTN_TEL1\" value=\"";
  private final static String _jspx_template25 = "\" type=\"text\" class=\"input_form1\" style=\"width:25px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, PARTN_TEL2, 3);\" maxlength=\"3\"> - \r\n\t\t\t\t\t\t\t\t<input id=\"PARTN_TEL2\" name=\"PARTN_TEL2\" value=\"";
  private final static String _jspx_template26 = "\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, PARTN_TEL3, 4);\" maxlength=\"4\"> - \r\n\t\t\t\t\t\t\t\t<input id=\"PARTN_TEL3\" name=\"PARTN_TEL3\" value=\"";
  private final static String _jspx_template27 = "\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, PARTN_HP1, 4);\" maxlength=\"4\">\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">휴대전화</td>\r\n\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan='3'>\r\n\t\t\t\t\t\t\t\t<input id=\"PARTN_HP1\" name=\"PARTN_HP1\" value=\"";
  private final static String _jspx_template28 = "\" type=\"text\" class=\"input_form1\" style=\"width:25px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, PARTN_HP2, 3);\" maxlength=\"3\"> - \r\n\t\t\t\t\t\t\t\t<input id=\"PARTN_HP2\" name=\"PARTN_HP2\" value=\"";
  private final static String _jspx_template29 = "\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, PARTN_HP3, 4);\" maxlength=\"4\"> - \r\n\t\t\t\t\t\t\t\t<input id=\"PARTN_HP3\" name=\"PARTN_HP3\" value=\"";
  private final static String _jspx_template30 = "\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);\" maxlength=\"4\">\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td height=\"34\" colspan=\"2\" align=\"left\" bgcolor=\"#FFFFFF\" class=\"\">\r\n\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t  <td width=\"50%\">\r\n\t\t\t\t\t\t\t\t\t  \t<span class=\"sub_stan_blue\">* 주민등록지 주소</span>\r\n\t\t\t\t\t\t\t\t\t  </td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t<td height=\"34\" colspan=\"2\" align=\"left\" bgcolor=\"#FFFFFF\" class=\"\">\r\n\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t  <td width=\"50%\">\r\n\t\t\t\t\t\t\t\t\t  \t<span class=\"sub_stan_blue\">* 실제거주지 : </span>\r\n\t\t\t\t\t\t\t\t\t  \t";
  private final static String _jspx_template31 = "\r\n\t\t\t\t\t\t\t\t\t  \t\t<input id=\"ADDR_CHECK2\"  name=\"ADDR_CHECK2\" type=\"checkbox\" onclick=\"javascript:Jumin_toaddr_Check()\"  value=\"1\" checked>\r\n\t\t\t\t\t\t\t\t\t  \t";
  private final static String _jspx_template32 = "\r\n\t\t\t\t\t\t\t\t\t  \t";
  private final static String _jspx_template33 = "\r\n\t\t\t\t\t\t\t\t\t  \t\t<input id=\"ADDR_CHECK2\" name=\"ADDR_CHECK2\" type=\"checkbox\" onclick=\"javascript:Jumin_toaddr_Check()\" value=\"0\">\r\n\t\t\t\t\t\t\t\t\t  \t";
  private final static String _jspx_template34 = "\r\n\t\t\t\t\t\t\t\t\t  \t주민등록지 주소 정보와 동일 \r\n\t\t\t\t\t\t\t\t\t  </td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t  \t</tr>\r\n\t\t\t\t\t  \t<!--  //********** BEGIN_현진_20120212 -->\r\n                        <!-- \r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">우편번호</td>\r\n\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t  <td><input id=\"PARTN_POST\" name=\"PARTN_POST\" type=\"text\" class=\"input_form1\" style=\"width:50px\" onFocus=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template35 = "\" onchange=\"Jumin_toaddr_Check();\"  value=\"";
  private final static String _jspx_template36 = "\" readonly></td>\r\n\t\t\t\t\t\t\t\t\t  <td><a href=\"javascript:openZipcodePopup_new('form.PARTN_POST', 'form.PARTN_ADDR1', 'form.ADDR1_NEW', 'form.PSI', 'form.PGUN', 'form.p_DORO_NM', 'form.p_BD_NM');\"><img src=\"/img/search_icon.gif\" alt=\"검색\" width=\"56\" height=\"18\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">우편번호</td>\r\n\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n   \t\t\t\t\t\t\t\t\t  <td><input id=\"PARTN_TOPOST\" name=\"PARTN_TOPOST\" type=\"text\" style=\"width:50px\" onFocus=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template37 = "\" readonly class=\"input_form1\"></td>\r\n\t\t\t\t\t\t\t\t\t  <td><a href=\"javascript:openZipcodePopup_new('form.PARTN_TOPOST', 'form.PARTN_TOADDR1', 'form.PTADDR1_NEW', 'form.PTSI', 'form.PTGUN', 'form.PTDORO_NM', 'form.PTBD_NM');\"><img src=\"/img/search_icon.gif\" alt=\"검색\" width=\"56\" height=\"18\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t  \t</tr>\r\n\t\t\t\t\t  \t -->\r\n\t\t\t\t\t\t<!--   //********** END_현진_20120212 -->\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">우편번호</td>\r\n\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"50px\"><input id=\"PARTN_POST\" name=\"PARTN_POST\" type=\"text\" class=\"input_form1\" style=\"width:50px\" onFocus=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template38 = "\" onchange=\"Jumin_toaddr_Check();\"  value=\"";
  private final static String _jspx_template39 = "\" readonly></td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"50px\"><a href=\"javascript:openZipcodePopup_new('form.PARTN_POST', 'form.PARTN_ADDR1', 'form.ADDR1_NEW', 'form.PSI', 'form.PGUN', 'form.p_DORO_NM', 'form.p_BD_NM','form.PDONG','form.PARTN_BONBUN', 'form.PARTN_BUBUN');\"><img src=\"/img/search_icon.gif\" alt=\"검색\" width=\"56\" height=\"18\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t\t\t\t\t<!--  sungh83 20131105 -->\r\n\t\t\t\t\t\t\t\t\t\t<td height =\"13\">%도로명주소건물본번,부번을입력시확인클릭</td>\r\n\t\t\t\t\t\t\t     \t\t<!--  sungh83 20131105 --> \r\n\t\t\t\t\t\t\t\t\t\t<td align=\"right\"><a href=\"javascript:addrConfirm('PARTN_POST','PSI','PGUN','PDONG','p_DORO_NM','PARTN_BONBUN','PARTN_BUBUN','p_BD_BON','p_BD_BU','p_BD_NM','p_BD_DET_NM','PARTN_ADDR1','PARTN_ADDR2','ADDR1_NEW','form')\"><img src=\"/img/ok_icon.gif\" alt=\"확인\" width=\"56\" height=\"18\" border=\"0\"></a></td>\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">우편번호</td>\r\n\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n   \t\t\t\t\t\t\t\t\t  \t<td><input id=\"PARTN_TOPOST\" name=\"PARTN_TOPOST\" type=\"text\" style=\"width:50px\" onFocus=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template40 = "\" readonly class=\"input_form1\"></td>\r\n\t\t\t\t\t\t\t\t\t \t<td width=\"50px\"><a href=\"javascript:openZipcodePopup_new('form.PARTN_TOPOST', 'form.PARTN_TOADDR1', 'form.PTADDR1_NEW', 'form.PTSI', 'form.PTGUN', 'form.PTDORO_NM', 'form.PTBD_NM','form.PTDONG', 'form.PARTN_TOBONBUN', 'form.PARTN_TOBUBUN' );\"><img src=\"/img/search_icon.gif\" alt=\"검색\" width=\"56\" height=\"18\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t\t\t\t\t<!--  sungh83 20131105 -->\r\n\t\t\t\t\t\t\t\t\t\t<td height =\"13\">%도로명주소건물본번,부번을입력시확인클릭</td>\r\n\t\t\t\t\t\t\t     \t\t<!--  sungh83 20131105 --> \r\n\t\t\t\t\t\t\t\t\t\t<td align=\"right\"><a href=\"javascript:addrConfirm('PARTN_TOPOST','PTSI','PTGUN','PTDONG','PTDORO_NM','PARTN_TOBONBUN','PARTN_TOBUBUN','PTBD_BON','PTBD_BU','PTBD_NM','PTBD_DET_NM','PARTN_TOADDR1','PARTN_TOADDR2','PTADDR1_NEW','form')\"><img src=\"/img/ok_icon.gif\" alt=\"확인\" width=\"56\" height=\"18\" border=\"0\"></a></td>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   \t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t  \t</tr>\t\r\n\t\t\t\t\t  \t<tr>\r\n\t\t\t\t\t  \t<!-- 주민등록지 기본 주소 -->  \r\n\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">기본 주소</td>\r\n\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t<input id=\"PARTN_ADDR1\" name=\"PARTN_ADDR1\" type=\"text\" class=\"input_form1\" style=\"width:250px\" value=\"";
  private final static String _jspx_template41 = "\" readonly>\r\n\t\t\t\t\t\t\t\t산\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template42 = "\r\n\t\t\t\t\t\t\t\t\t<input type=\"checkbox\"  class=\"input_form1\" id=\"PARTN_SAN\" name=\"PARTN_SAN\" onclick=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template43 = "\" checked=\"checked\">\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template44 = "\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template45 = "\r\n\t\t\t\t\t\t\t\t\t<input type=\"checkbox\"  class=\"input_form1\" id=\"PARTN_SAN\" name=\"PARTN_SAN\" onclick=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template46 = "\">\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template47 = "\r\n\t\t\t\t\t\t\t\t<input id=\"PARTN_BONBUN\" name=\"PARTN_BONBUN\" value=\"";
  private final static String _jspx_template48 = "\" type=\"text\" class=\"input_form1\" style=\"width:27px\" style=\"ime-mode:disabled\" onKeyDown=\"nr_num_int(this);\" onKeyUp=\"Jumin_toaddr_Check();nr_num_int(this);count_check(this, PARTN_BUBUN, 4);\" onKeyPress=\"nr_num_int(this);\" maxlength=\"4\">\r\n\t\t\t\t\t\t\t\t- <input id=\"PARTN_BUBUN\" name=\"PARTN_BUBUN\" value=\"";
  private final static String _jspx_template49 = "\" type=\"text\" class=\"input_form1\" style=\"width:27px\" style=\"ime-mode:disabled\" onKeyDown=\"nr_num_int(this);\" onKeyUp=\"Jumin_toaddr_Check();nr_num_int(this);count_check(this, PARTN_ADDR2, 4);\" onKeyPress=\"nr_num_int(this);\" maxlength=\"4\">\r\n\t\t\t\t\t\t\t\t<input id=\"PARTN_ADDR2\" name=\"PARTN_ADDR2\" type=\"text\" class=\"input_form1\" style=\"width:130px\" value=\"";
  private final static String _jspx_template50 = "\" onKeyUp=\"Jumin_toaddr_Check();\" maxlength=\"50\">\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t <!-- 실제거주지 기본 주소 --> \r\n\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">기본 주소</td>\r\n\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t<input id=\"PARTN_TOADDR1\" name=\"PARTN_TOADDR1\" type=\"text\" class=\"input_form1\" style=\"width:250px\" value=\"";
  private final static String _jspx_template51 = "\" readonly>\r\n\t\t\t\t\t\t\t\t산\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template52 = "\r\n\t\t\t\t\t\t\t\t\t<input type=\"checkbox\"  class=\"input_form1\" id=\"PARTN_TOSAN\" name=\"PARTN_TOSAN\" onclick=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template53 = "\" checked=\"checked\">\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template54 = "\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template55 = "\r\n\t\t\t\t\t\t\t\t\t<input type=\"checkbox\"  class=\"input_form1\" id=\"PARTN_TOSAN\" name=\"PARTN_TOSAN\" onclick=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template56 = "\">\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template57 = "\r\n\t\t\t\t\t\t\t\t<input id=\"PARTN_TOBONBUN\" name=\"PARTN_TOBONBUN\" value=\"";
  private final static String _jspx_template58 = "\" type=\"text\" class=\"input_form1\" style=\"width:27px\" style=\"ime-mode:disabled\" onKeyDown=\"nr_num_int(this);\" onKeyUp=\"Jumin_toaddr_Check();nr_num_int(this);count_check(this, PARTN_BUBUN, 4);\" onKeyPress=\"nr_num_int(this);\" maxlength=\"4\">\r\n\t\t\t\t\t\t\t\t- <input id=\"PARTN_TOBUBUN\" name=\"PARTN_TOBUBUN\" value=\"";
  private final static String _jspx_template59 = "\" type=\"text\" class=\"input_form1\" style=\"width:27px\" style=\"ime-mode:disabled\" onKeyDown=\"nr_num_int(this);\" onKeyUp=\"Jumin_toaddr_Check();nr_num_int(this);count_check(this, PARTN_ADDR2, 4);\" onKeyPress=\"nr_num_int(this);\" maxlength=\"4\">\r\n\t\t\t\t\t\t\t\t<input id=\"PARTN_TOADDR2\" name=\"PARTN_TOADDR2\" type=\"text\" class=\"input_form1\" style=\"width:130px\" value=\"";
  private final static String _jspx_template60 = "\" onKeyUp=\"Jumin_toaddr_Check();\" maxlength=\"50\">\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t  \t</tr>\r\n\t\t\t\t\t  \t<tr>\r\n\t\t\t\t\t  \t<!-- 주민등록지 도로명 새주소 -->\r\n\t\t\t\t\t\t\t<td height=\"45px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">도로명 주소</td>\r\n\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t<input id=\"ADDR1_NEW\" name=\"ADDR1_NEW\" type=\"text\" value=\"";
  private final static String _jspx_template61 = "&nbsp;";
  private final static String _jspx_template62 = "&nbsp;";
  private final static String _jspx_template63 = "\" class=\"essential\" style=\"width:250px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  readonly>\r\n\t \t\t\t\t\t\t\t<!--  //********** BEGIN_현진_20120213 -->\r\n\t \t\t\t\t\t\t\t<input type=\"hidden\"id=\"PSI\" name=\"PSI\" value=\"";
  private final static String _jspx_template64 = "\">\r\n\t\t\t\t\t\t\t\t<input type=\"hidden\"id=\"PGUN\" name=\"PGUN\" value=\"";
  private final static String _jspx_template65 = "\">\r\n\t\t\t\t\t\t\t\t<input type=\"hidden\"id=\"p_DORO_NM\" name=\"p_DORO_NM\" value=\"";
  private final static String _jspx_template66 = "\">\r\n\t\t\t\t\t\t\t\t<!--   //********** END_현진_20120213 -->\r\n\t\t\t\t\t\t\t\t<!--  //********** BEGIN_현진_20120402 -->\r\n\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"PDONG\" name=\"PDONG\" value=\"";
  private final static String _jspx_template67 = "\">\r\n\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"PRI\" name=\"PRI\" value=\"";
  private final static String _jspx_template68 = "\">\r\n\t\t\t\t\t\t\t\t<!--   //********** END_현진_20120402 -->\r\n\t \t\t\t\t\t\t\t<input id=\"p_BD_BON\" name=\"p_BD_BON\" type=\"text\" VALUE=\"";
  private final static String _jspx_template69 = "\" class=\"essential\" style=\"width:25px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" >\r\n\t\t\t\t\t\t\t\t-\r\n\t\t\t\t\t\t\t\t<input id=\"p_BD_BU\" name=\"p_BD_BU\" type=\"text\" VALUE=\"";
  private final static String _jspx_template70 = "\" class=\"input_form1\" style=\"width:25px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  >\r\n\t\t\t\t\t\t\t\t<input id=\"p_BD_NM\" name=\"p_BD_NM\" type=\"text\" VALUE=\"";
  private final static String _jspx_template71 = "\" class=\"input_form1\" style=\"width:135px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  maxlength=\"50\">\r\n\t\t\t\t\t\t\t\t<input id=\"p_BD_DET_NM\" name=\"p_BD_DET_NM\" type=\"text\" VALUE=\"";
  private final static String _jspx_template72 = "\" class=\"input_form1\" style=\"width:135px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  maxlength=\"50\">\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t<!-- 실제거주지 도로명 새주소 -->\r\n\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">도로명 주소</td>\r\n\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t<input id=\"PTADDR1_NEW\" name=\"PTADDR1_NEW\" type=\"text\" value=\"";
  private final static String _jspx_template73 = "&nbsp;";
  private final static String _jspx_template74 = "&nbsp;";
  private final static String _jspx_template75 = "&nbsp;\" class=\"essential\" style=\"width:250px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  readonly>\r\n\t \t\t\t\t\t\t\t<!--  //********** BEGIN_현진_20120213 -->\r\n\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"PTSI\" name=\"PTSI\" value=\"";
  private final static String _jspx_template76 = "\">\r\n\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"PTGUN\" name=\"PTGUN\" value=\"";
  private final static String _jspx_template77 = "\">\r\n\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"PTDORO_NM\" name=\"PTDORO_NM\" value=\"";
  private final static String _jspx_template78 = "\">\r\n\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"PTDONG\" name=\"PTDONG\" value=\"";
  private final static String _jspx_template79 = "\">\t \t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"PTRI\" name=\"PTRI\" value=\"";
  private final static String _jspx_template80 = "\">\r\n\t\t\t\t\t\t\t\t<!--   //********** END_현진_20120213 -->\r\n\t \t\t\t\t\t\t\t<input id=\"PTBD_BON\" name=\"PTBD_BON\" type=\"text\" value=\"";
  private final static String _jspx_template81 = "\" class=\"essential\" style=\"width:25px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" >\r\n\t\t\t\t\t\t\t\t-\r\n\t\t\t\t\t\t\t\t<input id=\"PTBD_BU\" name=\"PTBD_BU\" type=\"text\" value=\"";
  private final static String _jspx_template82 = "\" class=\"input_form1\" style=\"width:25px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  >\r\n\t\t\t\t\t\t\t\t<input id=\"PTBD_NM\" name=\"PTBD_NM\" type=\"text\" value=\"";
  private final static String _jspx_template83 = "\" class=\"input_form1\" style=\"width:135px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  maxlength=\"50\">\r\n\t\t\t\t\t\t\t\t<input id=\"PTBD_DET_NM\" name=\"PTBD_DET_NM\" type=\"text\" value=\"";
  private final static String _jspx_template84 = "\" class=\"input_form1\" style=\"width:135px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  maxlength=\"50\">\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t  \t</tr>\r\n                \t</table>\r\n                \t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"40\" align=\"right\">\r\n\t\t\t\t\t\t<!--  //********** BEGIN_현진_20120809 -->\r\n\t\t\t\t\t\t<a href=\"javascript:InfoDel()\"><img src=\"/img/infoDel.gif\" alt=\"정보삭제\" width=\"64\" height=\"18\" border=\"0\"></a>\r\n\t\t\t\t  \t\t<!--   //********** END_현진_20120809 -->\r\n\t\t\t\t  \t\t<a href=\"javascript:Cancel('";
  private final static String _jspx_template85 = "')\"><img src=\"/img/can_icon.gif\" alt=\"취소\" width=\"56\" height=\"18\" border=\"0\"></a>\r\n\t\t\t\t  \t\t<a href=\"javascript:ModifyPrc()\"><img src=\"/img/save_icon2.gif\" alt=\"저장\" width=\"56\" height=\"18\" border=\"0\"></a>\r\n\t\t\t\t  \t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n\t</table>\r\n</form>\r\n</body>\r\n</html>";
}
