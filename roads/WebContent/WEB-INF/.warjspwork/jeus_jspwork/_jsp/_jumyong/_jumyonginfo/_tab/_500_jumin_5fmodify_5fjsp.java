package jeus_jspwork._jsp._jumyong._jumyonginfo._tab;

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
      // jsp code [from=(285,61);to=(285,75)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(295,95);to=(295,105)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(298,167);to=(298,177)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${jumin_ssn1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(299,129);to=(299,139)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${jumin_ssn2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(303,137);to=(303,150)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${jumin_bizssn1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(304,98);to=(304,111)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${jumin_bizssn2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(305,98);to=(305,111)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${jumin_bizssn3}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(308,150);to=(308,166)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BIZ_STATUS}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(309,110);to=(309,125)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BIZ_TYPES}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(317,121);to=(317,136)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.EXPONENT }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(321,130);to=(321,150)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BUSINESSADDR  }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(328,121);to=(328,136)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.EXPONENT }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(332,130);to=(332,149)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.COMPANY_NAME }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(338,130);to=(338,150)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BUSINESSADDR  }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // jsp code [from=(350,232);to=(350,242)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.POST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);
      // jsp code [from=(360,246);to=(360,256)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.POST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template26);
      // jsp code [from=(377,226);to=(377,237)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADDR1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_0_fn(pageContext, null)) return;


      out.write(_jspx_template29);
      // jsp code [from=(380,221);to=(380,230)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template30);
      // jsp code [from=(382,221);to=(382,229)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template31);
      // jsp code [from=(384,228);to=(384,239)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADDR2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template32);
      // jsp code [from=(391,72);to=(391,80)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SI}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template33);
      // jsp code [from=(391,84);to=(391,93)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template34);
      // jsp code [from=(391,97);to=(391,110)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.DORO_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template35);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_1_fn(pageContext, null)) return;


      out.write(_jspx_template40);
      // jsp code [from=(396,56);to=(396,64)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SI}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template41);
      // jsp code [from=(397,58);to=(397,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template42);
      // jsp code [from=(398,66);to=(398,79)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.DORO_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template43);
      // jsp code [from=(401,60);to=(401,70)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.DONG}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template44);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_2_fn(pageContext, null)) return;


      out.write(_jspx_template46);
      // jsp code [from=(408,61);to=(408,73)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_BON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template47);
      // jsp code [from=(410,59);to=(410,70)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_BU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template48);
      // jsp code [from=(411,59);to=(411,70)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template49);
      // jsp code [from=(412,67);to=(412,82)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_DET_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template50);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_3_fn(pageContext, null)) return;


      out.write(_jspx_template56);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_4_fn(pageContext, null)) return;


      out.write(_jspx_template58);
      // jsp code [from=(435,212);to=(435,223)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.EMAIL}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template59);
      // jsp code [from=(441,113);to=(441,136)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BEFORE_PERMISSION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template60);
      // jsp code [from=(444,112);to=(444,135)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BEFORE_PERMISSION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template61);
      // jsp code [from=(451,45);to=(451,55)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TEL1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template62);
      // jsp code [from=(452,45);to=(452,55)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TEL2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template63);
      // jsp code [from=(453,45);to=(453,55)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TEL3}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template64);
      // jsp code [from=(462,45);to=(462,54)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.HP1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template65);
      // jsp code [from=(463,45);to=(463,54)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.HP2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template66);
      // jsp code [from=(464,45);to=(464,54)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.HP3}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template67);
      // jsp code [from=(472,150);to=(472,165)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.REFERENCE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template68);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_5_fn(pageContext, null)) return;


      out.write(_jspx_template70);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_6_fn(pageContext, null)) return;


      out.write(_jspx_template72);
      // jsp code [from=(495,95);to=(495,105)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TONM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template73);
      // jsp code [from=(504,105);to=(504,117)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOPOST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template74);
      // jsp code [from=(514,119);to=(514,131)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOPOST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template75);
      // jsp code [from=(530,230);to=(530,243)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOADDR1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template76);
      // jsp code [from=(531,60);to=(531,70)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOSI}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template77);
      // jsp code [from=(532,62);to=(532,73)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOGUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template78);
      // jsp code [from=(533,72);to=(533,88)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TO_DORO_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template79);
      // jsp code [from=(535,63);to=(535,75)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TODONG}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template80);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_7_fn(pageContext, null)) return;


      out.write(_jspx_template82);
      // jsp code [from=(539,225);to=(539,236)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOBON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template83);
      // jsp code [from=(541,225);to=(541,235)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOBU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template84);
      // jsp code [from=(543,232);to=(543,245)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOADDR2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template85);
      // jsp code [from=(551,76);to=(551,86)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOSI}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template86);
      // jsp code [from=(551,90);to=(551,101)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOGUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template87);
      // jsp code [from=(551,105);to=(551,121)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TO_DORO_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template88);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_8_fn(pageContext, null)) return;


      out.write(_jspx_template93);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_9_fn(pageContext, null)) return;


      out.write(_jspx_template95);
      // jsp code [from=(562,67);to=(562,82)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TO_BD_BON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template96);
      // jsp code [from=(564,65);to=(564,79)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TO_BD_BU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template97);
      // jsp code [from=(565,65);to=(565,79)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TO_BD_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template98);
      // jsp code [from=(566,73);to=(566,91)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TO_BD_DET_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template99);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_10_fn(pageContext, null)) return;


      out.write(_jspx_template105);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_11_fn(pageContext, null)) return;


      out.write(_jspx_template107);
      // jsp code [from=(589,214);to=(589,226)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOMAIL}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template108);
      // jsp code [from=(596,49);to=(596,61)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOTEL1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template109);
      // jsp code [from=(597,49);to=(597,61)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOTEL2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template110);
      // jsp code [from=(598,49);to=(598,61)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOTEL3}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template111);
      // jsp code [from=(607,47);to=(607,58)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOHP1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template112);
      // jsp code [from=(608,47);to=(608,58)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOHP2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template113);
      // jsp code [from=(609,47);to=(609,58)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOHP3}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template114);

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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SAN == '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template28);

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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.DORO_NM != null && board.DORO_NM !=''}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
      if (_jspx_eval_c_if_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template36);
          // jsp code [from=(392,127);to=(392,135)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SI}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template37);
          // jsp code [from=(392,139);to=(392,148)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template38);
          // jsp code [from=(392,152);to=(392,165)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.DORO_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template39);

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
    _jspx_th_c_if_2.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SAN == '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
      if (_jspx_eval_c_if_2 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template45);

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
    _jspx_th_c_if_3.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.DORO_NM != null && board.DORO_NM !=''}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
      if (_jspx_eval_c_if_3 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template51);
          // jsp code [from=(415,61);to=(415,73)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_BON}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template52);
          // jsp code [from=(417,59);to=(417,70)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_BU}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template53);
          // jsp code [from=(418,59);to=(418,70)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template54);
          // jsp code [from=(419,67);to=(419,82)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_DET_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template55);

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
    _jspx_th_c_if_4.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.DORO_NM == null || board.DORO_NM ==''}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
      if (_jspx_eval_c_if_4 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template57);

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
    _jspx_th_c_if_5.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADDR_CHECK == '1' }", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
      if (_jspx_eval_c_if_5 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template69);

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
    _jspx_th_c_if_6.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADDR_CHECK != '1' }", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
      if (_jspx_eval_c_if_6 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template71);

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
    _jspx_th_c_if_7.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOSAN == '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_7 = _jspx_th_c_if_7.doStartTag();
      if (_jspx_eval_c_if_7 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template81);

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
    _jspx_th_c_if_8.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TO_DORO_NM != null && board.TO_DORO_NM != ''}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_8 = _jspx_th_c_if_8.doStartTag();
      if (_jspx_eval_c_if_8 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template89);
          // jsp code [from=(552,138);to=(552,148)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOSI}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template90);
          // jsp code [from=(552,152);to=(552,163)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOGUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template91);
          // jsp code [from=(552,167);to=(552,183)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TO_DORO_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template92);

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
    _jspx_th_c_if_9.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOSAN == '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_9 = _jspx_th_c_if_9.doStartTag();
      if (_jspx_eval_c_if_9 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template94);

        } while (_jspx_th_c_if_9.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_9.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_9.release();
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
    _jspx_th_c_if_10.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TO_DORO_NM != null && board.TO_DORO_NM != ''}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_10 = _jspx_th_c_if_10.doStartTag();
      if (_jspx_eval_c_if_10 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template100);
          // jsp code [from=(569,67);to=(569,82)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TO_BD_BON}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template101);
          // jsp code [from=(571,65);to=(571,79)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TO_BD_BU}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template102);
          // jsp code [from=(572,65);to=(572,79)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TO_BD_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template103);
          // jsp code [from=(573,73);to=(573,91)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TO_BD_DET_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template104);

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
    _jspx_th_c_if_11.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TO_DORO_NM == null || board.TO_DORO_NM == ''}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_11 = _jspx_th_c_if_11.doStartTag();
      if (_jspx_eval_c_if_11 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template106);

        } while (_jspx_th_c_if_11.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_11.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_11.release();
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
  private final static String _jspx_template9 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script language='JavaScript' src='/js/Check_inputbox.js'></script>\r\n<!--  //********** BEGIN_현진_20120215 -->\r\n<script language=\"javascript\" src=\"/js/zipcode.js\"></script>\r\n<!--   //********** END_현진_20120215 -->   \r\n\t\r\n<script type=\"text/javascript\">\r\n//<![CDATA[\r\n\r\n\tfunction\tModifyPrc()\r\n\t{\r\n\t\tvar\tresult\t= DataCheck();\r\n//\t\talert('ModifyPrc');\r\n\t\tif(result\t==\tfalse)\r\n\t\t\treturn;\r\n\t\t\r\n\t\tvar form = document.form;\r\n\r\n//\t\talert('toaddr2'+document.getElementById(\"TOADDR2\").value);\r\n//\t\talert('TO_ADDR2'+document.getElementById(\"TO_ADDR2\").value);\r\n//\t\t\r\n//\t\talert('addr2'+document.getElementById(\"ADDR2\").value);\r\n\t\t\r\n\t\tdocument.getElementById(\"POST\").value = pipe_cut(document.getElementById(\"POST\"));\r\n\t\tdocument.getElementById(\"TOPOST\").value = pipe_cut(document.getElementById(\"TOPOST\"));\r\n\r\n\t\tform.action = \"/jumyong/jumyonginfo/jumin_modify_prc.do\"; \r\n\t\tform.submit();\r\n\t}\r\n\r\n\tfunction\tCancel()\r\n\t{\r\n\t\tvar form = document.form;\r\n\r\n\t\tform.action = \"/jumyong/jumyonginfo/jumin_view.do\";\r\n\t\tform.submit();\r\n\t}\r\n\r\n\tfunction\tJumin_toaddr_Check()\r\n\t{\r\n\t\tvar form = document.form;\r\n\t\tvar\tchk\t= form.ADDR_CHECK.checked;\r\n\r\n\t\tif(chk\t== true)\r\n\t\t{\r\n\t\t\tform.TONM.value\t\t\t\t= form.NAME.value;\r\n\t\t\tform.TOPOST.value\t\t\t= form.POST.value;\r\n\t\t\t\r\n\t\t\tform.TOADDR1.value\t\t\t= form.ADDR1.value;\r\n\t\t\tform.TOSAN.checked\t\t\t= form.SAN.checked;\r\n\t\t\tform.TOBON.value\t\t\t= form.BON.value;\r\n\t\t\tform.TOBU.value\t\t\t\t= form.BU.value;\r\n\t\t\tform.TOADDR2.value\t\t\t= form.ADDR2.value;\r\n\t\t\tform.TOMAIL.value\t\t\t= form.EMAIL.value;\r\n\r\n\r\n\t\t\t//********** BEGIN_현진_20120229\r\n\t\t\tform.TOSI.value        \t\t= form.SI.value;\r\n\t\t\tform.TOGUN.value       \t\t= form.GUN.value;\r\n\t\t\tform.TO_DORO_NM.value  \t\t= form.DORO_NM.value;\r\n\t\t\tform.TODONG.value      \t\t= form.DONG.value;\r\n\t\t\tform.TOADDR1_NEW.value   \t= form.ADDR1_NEW.value;\r\n\t\t\tform.TO_BD_BON.value     \t= form.BD_BON.value;\r\n\t\t\tform.TO_BD_BU.value      \t= form.BD_BU.value;\r\n\t\t\tform.TO_BD_NM.value      \t= form.BD_NM.value;\r\n\t\t\tform.TO_BD_DET_NM.value  \t= form.BD_DET_NM.value;\r\n\t\t\t//********** END_현진_20120229\r\n\t\t\t\t\t\r\n\t\t\tform.TOTEL1.value\t\t\t= form.TEL1.value;\r\n\t\t\tform.TOHP1.value\t\t\t= form.HP1.value;\r\n\r\n\r\n\t\t\tform.TOTEL2.value\t\t\t= form.TEL2.value;\r\n\t\t\tform.TOHP2.value\t\t\t= form.HP2.value;\r\n\r\n\r\n\t\t\tform.TOTEL3.value\t\t\t= form.TEL3.value;\r\n\t\t\tform.TOHP3.value\t\t\t= form.HP3.value;\r\n\r\n\r\n\t\t\t\r\n\t\t\tform.ADDR_CHECK.value = '1';\r\n\t\t}\r\n\t}\r\n    //********** BEGIN_현진_20120215\r\n    /*\r\n\tfunction \topenZipcodePopupNew(post, addr, addr_new)\r\n\t{\r\n\t\tvar\tpost1\t= post;\r\n\t\tvar\taddr1\t= addr;\r\n\t\tvar\taddr2\t= addr_new;\r\n\r\n\t\tvar url \t= \"/zipcode.do?openerPost=\" + post1 + \"&openerAddr=\" + addr1+ \"&openerAddrNew=\" + addr2;\r\n\t\tvar winName = \"우편번호입력\";\r\n\t\t//var width \t= 420;\r\n\t\tvar width \t= 840;\r\n\t\tvar height \t= 305;\r\n\t\tvar scroll \t= \"yes\";\r\n\t\tvar resize \t= \"no\";\r\n\r\n\t\tvar\toption\t= \"scrollbars=\" + scroll + \", \";\r\n\t\toption\t+= \"resize=\" + resize + \", \";\r\n\t\toption\t+= \"width=\" + width + \", \";\r\n\t\toption\t+= \"height=\" + height;\r\n\r\n\t\twindow.open(url, winName, option);\r\n\t}\r\n\t\r\n\t\r\n\t\r\n\tfunction openZipcodePopup_new(post, addr, addr_new, si, gu, doro, bd)\r\n\t{ \r\n\t\tvar\tpost1\t= post;\r\n\t\tvar\taddr1\t= addr;\r\n\t\tvar\taddr1_new\t= addr_new;\r\n\t\tvar\taddr1_si\t= si;\r\n\t\tvar\taddr1_gu\t= gu;\r\n\t\tvar\taddr1_doro\t= doro;\r\n\t\tvar\taddr1_bd\t= bd;\r\n\t\t\r\n\t\t \r\n\t\t\r\n\t\t//var url \t= \"/zipcode.do?openerPost=\" + post1 + \"&openerAddr=\" + addr1+ \"&openerAddrNew=\" + addr1_new+ \"&openerSi=\" + addr1_si+ \"&openerGu=\" + addr1_gu+ \"&openerDoro=\" + addr1_doro+\"&openerBd=\" + addr1_bd;\r\n\t\tvar url \t= \"/zipCode_New.do?openerPost=\" + post1 + \"&openerAddr=\" + addr1+ \"&openerAddrNew=\" + addr1_new+ \"&openerSi=\" + addr1_si+ \"&openerGun=\" + addr1_gu+ \"&openerDoro=\" + addr1_doro+\"&openerBd=\" + addr1_bd;\r\n\t\t\r\n\t\t//alert('url ='+url);\r\n\t\t\r\n\t\tvar winName = \"우편번호입력\";\r\n\t\t//var width ";
  private final static String _jspx_template10 = "\t= 420;\r\n\t\tvar width \t= 840;\r\n\t\tvar height \t= 305;\r\n\t\tvar scroll \t= \"yes\";\r\n\t\tvar resize \t= \"no\";\r\n\r\n\t\tvar\toption\t= \"scrollbars=\" + scroll + \", \";\r\n\t\toption\t+= \"resize=\" + resize + \", \";\r\n\t\toption\t+= \"width=\" + width + \", \";\r\n\t\toption\t+= \"height=\" + height;\r\n\r\n\t\twindow.open(url, winName, option);\r\n\t\t \r\n\t}\r\n\t\r\n\t\r\n\t\r\n\tfunction \topenZipcodePopup(post, addr)\r\n\t{\r\n\t\tvar\tpost1\t= post;\r\n\t\tvar\taddr1\t= addr;\r\n\r\n\t\tvar url \t= \"/zipcode.do?openerPost=\" + post1 + \"&openerAddr=\" + addr1;\r\n\t\tvar winName = \"우편번호입력\";\r\n\t\tvar width \t= 420;\r\n\t\tvar height \t= 305;\r\n\t\tvar scroll \t= \"yes\";\r\n\t\tvar resize \t= \"no\";\r\n\r\n\t\tvar\toption\t= \"scrollbars=\" + scroll + \", \";\r\n\t\toption\t+= \"resize=\" + resize + \", \";\r\n\t\toption\t+= \"width=\" + width + \", \";\r\n\t\toption\t+= \"height=\" + height;\r\n\r\n\t\twindow.open(url, winName, option);\r\n\t}\r\n    */\r\n    //********** END_현진_20120215\r\n     \r\n\t//********** BEGIN_KANG_20120525\r\n\tfunction addrDelete()\r\n\t{\r\n    \tform.POST.value\t\t\t= \"\";\r\n    \tform.ADDR1.value\t\t= \"\";\r\n    \tform.SAN.value\t\t\t= \"\";\r\n    \tform.BON.value\t\t\t= \"\";\r\n    \tform.BU.value\t\t\t= \"\";\r\n    \tform.ADDR2.value\t\t= \"\";\r\n    \tform.ADDR1_NEW.value\t= \"\";\r\n    \tform.SI.value\t\t\t= \"\";\r\n    \tform.GUN.value\t\t\t= \"\";\r\n    \tform.DORO_NM.value\t\t= \"\";\r\n    \tform.DONG.value\t\t\t= \"\";\r\n    \tform.BD_BON.value\t\t= \"\";\r\n    \tform.BD_BU.value\t\t= \"\";\r\n    \tform.BD_NM.value\t\t= \"\";\r\n    \tform.BD_DET_NM.value\t= \"\";\r\n    \tform.BD_BON.value\t\t= \"\";\r\n    \tform.BD_BU.value\t\t= \"\";\r\n    \tform.BD_NM.value\t\t= \"\";\r\n    \tform.BD_DET_NM.value\t= \"\";\r\n    \t    \t\r\n    \topenZipcodePopup_new('form.POST', 'form.ADDR1', 'form.ADDR1_NEW', 'form.SI', 'form.GUN', 'form.DORO_NM', 'form.BD_NM','form.DONG','form.BON', 'form.BU' );\r\n\t}\r\n\r\n\tfunction addrDeleteTo()\r\n\t{\r\n\t\tform.TOPOST.value\t\t\t= \"\";\r\n\t\tform.TOADDR1.value\t\t\t= \"\";\r\n\t\tform.TOSI.value\t\t\t\t= \"\";\r\n\t\tform.TOGUN.value\t\t\t= \"\";\r\n\t\tform.TO_DORO_NM.value\t\t= \"\";\r\n\t\tform.TODONG.value\t\t\t= \"\";\r\n\t\tform.TOSAN.value\t\t\t= \"\";\r\n\t\tform.TOBON.value\t\t\t= \"\";\r\n\t\tform.TOBU.value\t\t\t\t= \"\";\r\n\t\tform.TOADDR2.value\t\t\t= \"\";\r\n\t\tform.TOADDR1_NEW.value\t\t= \"\";\r\n\t\tform.TO_BD_BON.value\t\t= \"\";\r\n\t\tform.TO_BD_BU.value\t\t\t= \"\";\r\n\t\tform.TO_BD_NM.value\t\t\t= \"\";\r\n\t\tform.TO_BD_DET_NM.value\t\t= \"\";\r\n\t\tform.TO_BD_BON.value\t\t= \"\";\r\n\t\tform.TO_BD_BU.value\t\t\t= \"\";\r\n\t\tform.TO_BD_NM.value\t\t\t= \"\";\r\n\t\tform.TO_BD_DET_NM.value\t\t= \"\";\r\n\r\n    \t    \t\r\n\t\topenZipcodePopup_new('form.TOPOST', 'form.TOADDR1', 'form.TOADDR1_NEW', 'form.TOSI', 'form.TOGUN', 'form.TO_DORO_NM', 'form.TO_BD_NM','form.TODONG','form.TOBON', 'form.TOBU');\r\n\t}\r\n\t//********** END_KANG_20120525\r\n     \r\n\tfunction \tInit()\r\n\t{\r\n\t\tparent.Tab_Img(\"jumin\");\r\n\t}\r\n\r\n\tfunction\tDataCheck()\r\n\t{\r\n\t\tvar form \t= document.form;\r\n\t\tvar\tstr\t\t= \"\";\r\n\r\n\t\t//\t점용인 정보\r\n\t\tif(form.NAME.value.length\t< 1)\r\n\t\t\tstr\t+= \"점용인/법인명을 입력하세요\\n\";\t\r\n\t\telse if(form.jumin_ssn1.value.length\t< 6\t||\tform.jumin_ssn2.value.length\t< 7)\r\n\t\t\tstr\t+= \"주민/법인번호를  입력하세요\\n\";\r\n\t\telse if(form.POST.value.length\t< 1)\r\n\t\t\tstr\t+= \"우편번호를 입력하세요\\n\";\r\n\t\telse if(form.BON.value.length\t< 1)\r\n\t\t\tstr\t+= \"본번을 입력하세요\\n\";\r\n\t\telse if(form.TOPOST.value.length\t< 1)\r\n\t\t\tstr\t+= \"우편번호를 입력하세요\\n\";\r\n\t\telse if(form.TOBON.value.length\t< 1)\r\n\t\t\tstr\t+= \"본번을 입력하세요\\n\";\r\n\r\n\t\tif(form.jumin_bizssn1.value.length > 0 || form.jumin_bizssn2.value.length > 0 || form.jumin_bizssn3.value.length > 0)\r\n\t\t{\r\n\t\t\tif(form.jumin_bizssn1.value.length\t< 3\t||\tform.jumin_bizssn2.value.length < 2\t||\tform.jumin_bizssn3.value.length < 5)\r\n\t\t\t\tstr\t+= \"사업자등록번호를 정확히 입력하세요\\n\";\r\n\t\t}\r\n\t\t\r\n\t\tif(str\t== \"\")\r\n\t\t{\r\n\t\t\treturn\ttrue;\r\n\t\t}\r\n\t\t\r\n\t\talert(str);\r\n\t\t\r\n\t\treturn\tfalse;\r\n\t}\r\n\t\r\n//]]>\r\n</script>\r\n\r\n<body onkeyup=\"Init();\">\r\n<table width=\"780\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n<form id=\"form\" name=\"form\" method=\"post\">\r\n<input type=\"hidden\" id=\"ADMIN_NO\" name=\"ADMIN_NO\" value=\"";
  private final static String _jspx_template11 = "\">\r\n\r\n\t<tr>\r\n\t\t<td align=\"left\" class=\"contborder_purple\">\r\n\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t<tr>\r\n\t\t\t  <td><table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용인/법인명</td>\r\n\t\t\t\t\t<td width=\"37%\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t<input id=\"NAME\" name=\"NAME\" type=\"text\" class=\"essential\" style=\"width:250px\" value=\"";
  private final static String _jspx_template12 = "\" onKeyUp=\"Jumin_toaddr_Check();\" onchange=\"Jumin_toaddr_Check();\">\r\n\t\t\t\t\t</td>\r\n\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">주민/법인번호</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input id=\"jumin_ssn1\" name=\"jumin_ssn1\" type=\"text\" class=\"essential\" style=\"width:40px; ime-mode:disabled\" value=\"";
  private final static String _jspx_template13 = "\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, jumin_ssn2, 6);\" maxlength=\"6\">\r\n\t\t\t\t\t  - <input id=\"jumin_ssn2\"  name=\"jumin_ssn2\" type=\"text\" class=\"essential\" style=\"width:87px; ime-mode:disabled\" value=\"";
  private final static String _jspx_template14 = "\" onKeyPress=\"nr_num_int(this);\" maxlength=\"7\"></td>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">사업자등록번호</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input id=\"jumin_bizssn1\" name=\"jumin_bizssn1\" type=\"text\" class=\"input_form1\" value=\"";
  private final static String _jspx_template15 = "\" style=\"width:20px; ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, jumin_bizssn2, 3);\" maxlength=\"3\">\r\n\t\t\t\t\t  - <input id=\"jumin_bizssn2\" name=\"jumin_bizssn2\" type=\"text\" class=\"input_form1\" value=\"";
  private final static String _jspx_template16 = "\" style=\"width:15px; ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, jumin_bizssn3, 2);\" maxlength=\"2\">\r\n\t\t\t\t\t  - <input id=\"jumin_bizssn3\" name=\"jumin_bizssn3\" type=\"text\" class=\"input_form1\" value=\"";
  private final static String _jspx_template17 = "\" style=\"width:35px; ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" maxlength=\"5\">\r\n\t\t\t\t\t </td>\r\n\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">업태/업종</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input id=\"BIZ_STATUS\" name=\"BIZ_STATUS\" type=\"text\" class=\"input_form1\" style=\"width:60px\" value=\"";
  private final static String _jspx_template18 = "\">\r\n\t\t\t\t\t  / <input id=\"BIZ_TYPES\" name=\"BIZ_TYPES\" type=\"text\" class=\"input_form1\" style=\"width:160px\" value=\"";
  private final static String _jspx_template19 = "\"></td>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t  <!--  //********** BEGIN_현진_20120321 -->\r\n\t\t\t\t  \t<!--  //********** BEGIN_KANG_20120417 -->\r\n\t\t\t\t  \t<!-- \r\n\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">대표자명</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input id=\"EXPONENT\" name=\"EXPONENT\" type=\"text\" class=\"input_form1\" style=\"width:100px\" maxlength=\"10\" value=\"";
  private final static String _jspx_template20 = "\"/>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">사업장주소</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input id=\"BUSINESSADDR\" name=\"BUSINESSADDR\" type=\"text\" class=\"input_form1\" style=\"width:220px\" maxlength=\"100\" value=\"";
  private final static String _jspx_template21 = "\"/>\t\t\t\t\t\t\t\t\t\t\t\t\t  \r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t  \t -->\r\n\t\t\t\t  \t <tr>\r\n\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">대표자명</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input id=\"EXPONENT\" name=\"EXPONENT\" type=\"text\" class=\"input_form1\" style=\"width:100px\" maxlength=\"10\" value=\"";
  private final static String _jspx_template22 = "\"/>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">상호명</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input id=\"COMPANY_NAME\" name=\"COMPANY_NAME\" type=\"text\" class=\"input_form1\" style=\"width:220px\" maxlength=\"100\" value=\"";
  private final static String _jspx_template23 = "\"/>\t\t\t\t\t\t\t\t\t\t\t\t\t  \r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">사업장 주소</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t\t\t\t\t<input id=\"BUSINESSADDR\" name=\"BUSINESSADDR\" type=\"text\" class=\"input_form1\" style=\"width:300px\" maxlength=\"100\" value=\"";
  private final static String _jspx_template24 = "\"/>\t\t\t\t\t\t\t\t\t\t\t\t\t  \r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t\t<!--   //********** END_KANG_20120417 -->\r\n\t\t\t\t  \t\r\n\t\t\t\t\t<!--   //********** END_현진_20120321 -->\r\n\t\t\t\t  <!--  //********** BEGIN_현진_20120215 -->\r\n                 <!-- \r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">우편번호</td>\r\n\t\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t  <td><input id=\"POST\"  name=\"POST\" type=\"text\" class=\"input_form1\" style=\"width:50px\" onclick=\"Jumin_toaddr_Check();\" onchange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onkeyup=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template25 = "\" readonly></td>\r\n\t\t\t\t\t\t  <td><a href=\"javascript:openZipcodePopup_new('form.POST', 'form.ADDR1', 'form.ADDR1_NEW', 'form.SI', 'form.GUN', 'form.DORO_NM', 'form.BD_NM');\"><img src=\"/img/search_icon.gif\" alt=\"검색\" width=\"56\" height=\"18\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t</table></td>\t\r\n\t\t\t\t  </tr>\r\n\t\t\t\t  -->\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">우편번호</td>\r\n\t\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t  \t<td width=\"50px\"><input id=\"POST\"  name=\"POST\" type=\"text\" class=\"input_form1\" style=\"width:50px\" onclick=\"Jumin_toaddr_Check();\" onchange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onkeyup=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template26 = "\" readonly></td>\r\n\t\t\t\t\t\t  \t<!--  //********** BEGIN_KANG_20120525 -->\r\n\t\t\t\t\t\t  \t<!-- <td width=\"50px\"><a href=\"javascript:openZipcodePopup_new('form.POST', 'form.ADDR1', 'form.ADDR1_NEW', 'form.SI', 'form.GUN', 'form.DORO_NM', 'form.BD_NM','form.DONG','form.BON', 'form.BU' );\"><img src=\"/img/search_icon.gif\" alt=\"검색\" width=\"56\" height=\"18\" border=\"0\"></a></td> -->\r\n\t\t\t\t\t\t  \t<td width=\"50px\"><a href=\"javascript:addrDelete();\"><img src=\"/img/search_icon.gif\" alt=\"검색\" width=\"56\" height=\"18\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t  \t<!--   //********** END_KANG_20120525 -->\t\t\t\t\t  \t\r\n\t\t\t\t\t\t\t\t<td align=\"right\"><a href=\"javascript:addrConfirm('POST','SI','GUN','DONG','DORO_NM','BON','BU','BD_BON','BD_BU','BD_NM','BD_DET_NM','ADDR1','ADDR2','ADDR1_NEW','form')\"><img src=\"/img/ok_icon.gif\" alt=\"확인\" width=\"56\" height=\"18\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t\t\t<!--  sungh83 20131106 -->\r\n\t\t\t\t\t\t\t\t<td><span class=\"sub_table_b\">%도로명주소의 건물본번,부번을 입력하시려면 확인버튼을 클릭하시오</span></td>\r\n\t\t\t\t\t\t\t\t<!--  sungh83 20131106 -->\t\t\t\t\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t</table></td>\t\r\n\t\t\t\t  </tr>\r\n\t\t\t\t\t<!--   //********** END_현진_20120215 -->\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">주소</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t<!--  //********** BEGIN_현진_20120309 -->\r\n\t\t\t\t\t\t<input id=\"ADDR1\" name=\"ADDR1\" type=\"text\" class=\"essential\" style=\"width:250px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template27 = "\" readonly>\r\n\t\t\t\t\t<!--   //********** END_현진_20120309 -->\r\n\t\t\t\t\t\t산<input id=\"SAN\" name=\"SAN\" type=\"checkbox\" style=\"vertical-align: middle;\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" ";
  private final static String _jspx_template28 = "checked";
  private final static String _jspx_template29 = ">\r\n\t\t\t\t\t\t<input id=\"BON\" name=\"BON\" type=\"text\" class=\"essential\" style=\"width:25px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template30 = "\">\r\n\t\t\t\t\t\t-\r\n\t\t\t\t\t\t<input id=\"BU\" name=\"BU\" type=\"text\" class=\"input_form1\" style=\"width:25px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template31 = "\" >\r\n\t\t\t\t\t\t<!--  //********** BEGIN_현진_20120216 -->\r\n\t\t\t\t\t\t<input id=\"ADDR2\" name=\"ADDR2\" type=\"text\" class=\"input_form1\" style=\"width:135px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template32 = "\"  maxlength=\"50\">\r\n\t\t\t\t\t\t<!--   //********** END_현진_20120216 -->\r\n\t\t\t\t\t</td>\t\r\n\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">도로명 주소</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t<!--  //********** BEGIN_현진_20120309 -->\r\n\t\t\t\t\t\t<!--  //********** BEGIN_KANG_20120424 -->\r\n\t\t\t\t\t\t<!-- <input id=\"ADDR1_NEW\" name=\"ADDR1_NEW\" type=\"text\" value=\"";
  private final static String _jspx_template33 = " ";
  private final static String _jspx_template34 = " ";
  private final static String _jspx_template35 = "\" class=\"essential\" style=\"width:230px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  readonly> -->\r\n\t\t\t\t\t\t<input id=\"ADDR1_NEW\" name=\"ADDR1_NEW\" type=\"text\" ";
  private final static String _jspx_template36 = "value=\"";
  private final static String _jspx_template37 = " ";
  private final static String _jspx_template38 = " ";
  private final static String _jspx_template39 = "\"";
  private final static String _jspx_template40 = " class=\"essential\" style=\"width:230px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  readonly>\r\n\t\t\t\t\t\t<!--   //********** END_KANG_20120424 -->\t\t\t\t\t\r\n\t\t\t\t\t\t\r\n\t\t\t\t\t<!--   //********** END_현진_20120309 -->\r\n\t \t\t\t\t\t<input id=\"SI\" name=\"SI\" type=\"hidden\" value=\"";
  private final static String _jspx_template41 = "\">\r\n\t \t\t\t\t\t<input id=\"GUN\" type=\"hidden\" name=\"GUN\" value=\"";
  private final static String _jspx_template42 = "\">\r\n\t \t\t\t\t\t<input id=\"DORO_NM\" type=\"hidden\" name=\"DORO_NM\" value=\"";
  private final static String _jspx_template43 = "\">\r\n\t \t\t\t\t\t<br>\r\n\t \t\t\t\t\t<!--  //********** BEGIN_현진_20120215 -->\r\n\t \t\t\t\t\t<input id=\"DONG\" name=\"DONG\" type=\"hidden\" value=\"";
  private final static String _jspx_template44 = "\"/>\r\n\t \t\t\t\t\t<!-- \r\n\t \t\t\t\t\t산<input id=\"SAN\" name=\"SAN\" type=\"checkbox\" style=\"vertical-align: middle;\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" ";
  private final static String _jspx_template45 = "checked";
  private final static String _jspx_template46 = ">\r\n\t\t\t\t\t\t -->\r\n\t\t\t\t\t\t<!--   //********** END_현진_20120215 -->\t\t\t\t\t\r\n\t\t\t\t\t\t<!--  //********** BEGIN_KANG_20120424 -->\r\n\t\t\t\t\t\t<!-- \r\n\t\t\t\t\t\t<input id=\"BD_BON\" name=\"BD_BON\" type=\"text\" VALUE=\"";
  private final static String _jspx_template47 = "\" class=\"essential\" style=\"width:25px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" >\r\n\t\t\t\t\t\t-\r\n\t\t\t\t\t\t<input id=\"BD_BU\" name=\"BD_BU\" type=\"text\" VALUE=\"";
  private final static String _jspx_template48 = "\" class=\"input_form1\" style=\"width:25px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  >\r\n\t\t\t\t\t\t<input id=\"BD_NM\" name=\"BD_NM\" type=\"text\" VALUE=\"";
  private final static String _jspx_template49 = "\" class=\"input_form1\" style=\"width:135px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  maxlength=\"50\">\r\n\t\t\t\t\t\t<input id=\"BD_DET_NM\" name=\"BD_DET_NM\" type=\"text\" VALUE=\"";
  private final static String _jspx_template50 = "\" class=\"input_form1\" style=\"width:214px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  maxlength=\"50\">\r\n\t\t\t\t\t\t -->\r\n\t\t\t\t\t\t";
  private final static String _jspx_template51 = " \r\n\t\t\t\t\t\t<input id=\"BD_BON\" name=\"BD_BON\" type=\"text\" VALUE=\"";
  private final static String _jspx_template52 = "\" class=\"essential\" style=\"width:25px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" >\r\n\t\t\t\t\t\t-\r\n\t\t\t\t\t\t<input id=\"BD_BU\" name=\"BD_BU\" type=\"text\" VALUE=\"";
  private final static String _jspx_template53 = "\" class=\"input_form1\" style=\"width:25px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  >\r\n\t\t\t\t\t\t<input id=\"BD_NM\" name=\"BD_NM\" type=\"text\" VALUE=\"";
  private final static String _jspx_template54 = "\" class=\"input_form1\" style=\"width:135px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  maxlength=\"50\">\r\n\t\t\t\t\t\t<input id=\"BD_DET_NM\" name=\"BD_DET_NM\" type=\"text\" VALUE=\"";
  private final static String _jspx_template55 = "\" class=\"input_form1\" style=\"width:214px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  maxlength=\"50\">\r\n\t\t\t\t\t\t";
  private final static String _jspx_template56 = "\r\n\t\t\t\t\t\t";
  private final static String _jspx_template57 = "\r\n\t\t\t\t\t\t<input id=\"BD_BON\" name=\"BD_BON\" type=\"text\" VALUE=\"\" class=\"essential\" style=\"width:25px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" >\r\n\t\t\t\t\t\t-\r\n\t\t\t\t\t\t<input id=\"BD_BU\" name=\"BD_BU\" type=\"text\" VALUE=\"\" class=\"input_form1\" style=\"width:25px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  >\r\n\t\t\t\t\t\t<input id=\"BD_NM\" name=\"BD_NM\" type=\"text\" VALUE=\"\" class=\"input_form1\" style=\"width:135px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  maxlength=\"50\">\r\n\t\t\t\t\t\t<input id=\"BD_DET_NM\" name=\"BD_DET_NM\" type=\"text\" VALUE=\"\" class=\"input_form1\" style=\"width:214px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  maxlength=\"50\">\r\n\t\t\t\t\t\t";
  private final static String _jspx_template58 = "\r\n\t\t\t\t\t\t<!--   //********** END_KANG_20120424 -->\t\t\t\t\t\t\r\n\t \t\t\t\t\t\r\n\t\t\t\t\t</td>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">e-mail</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t<input id=\"EMAIL\" name=\"EMAIL\" type=\"text\" class=\"input_form1\" style=\"width:250px\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\"  onKeyUp=\"Jumin_toaddr_Check();\" maxlength=\"50\" value=\"";
  private final static String _jspx_template59 = "\" style=\"ime-mode:disabled\">\r\n\t\t\t\t\t</td>\r\n\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">기존 허가번호</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t<!--  //********** BEGIN_KANG_20120405 -->\r\n\t\t\t\t\t<!-- \r\n\t\t\t\t\t\t<input id=\"B_PERMISSION\" name=\"B_PERMISSION\" type=\"text\" class=\"input_form1\" style=\"width:250px\" value=\"";
  private final static String _jspx_template60 = "\" style=\"ime-mode:disabled\" onchange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\"  onkeyup=\"Jumin_toaddr_Check();\" maxlength=\"20\">\r\n\t\t\t\t\t</td>\r\n\t\t\t\t\t-->\r\n\t\t\t\t\t<input id=\"b_PERMISSION\" name=\"b_PERMISSION\" type=\"text\" class=\"input_form1\" style=\"width:250px\" value=\"";
  private final static String _jspx_template61 = "\" style=\"ime-mode:disabled\" onchange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\"  onkeyup=\"Jumin_toaddr_Check();\" maxlength=\"20\">\r\n\t\t\t\t\t<!--   //********** END_KANG_20120405 -->\r\n\t\t\t\t  </tr>\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">전화번호</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\r\n\t\t\t\t\t\t<input id=\"TEL1\" name=\"TEL1\" value=\"";
  private final static String _jspx_template62 = "\" type=\"text\" class=\"input_form1\" style=\"width:25px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this),Jumin_toaddr_Check()\" onKeyUp=\"count_check(this, TEL2, 3),Jumin_toaddr_Check()\" maxlength=\"3\"> - \r\n\t\t\t\t\t\t<input id=\"TEL2\" name=\"TEL2\" value=\"";
  private final static String _jspx_template63 = "\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this),Jumin_toaddr_Check()\" onKeyUp=\"count_check(this, TEL3, 4),Jumin_toaddr_Check()\" maxlength=\"4\"> - \r\n\t\t\t\t\t\t<input id=\"TEL3\" name=\"TEL3\" value=\"";
  private final static String _jspx_template64 = "\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this),Jumin_toaddr_Check()\" onKeyUp=\"count_check(this, HP1, 4),Jumin_toaddr_Check()\" maxlength=\"4\">\r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\r\n\t\t\t\t\t\r\n\t\t\t\t\t\r\n\t\t\t\t\t</td>\r\n\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">휴대전화</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\r\n\t\t\t\t\t   <input id=\"HP1\" name=\"HP1\" value=\"";
  private final static String _jspx_template65 = "\" type=\"text\" class=\"input_form1\" style=\"width:25px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this),Jumin_toaddr_Check()\" onKeyUp=\"count_check(this, HP2, 3),Jumin_toaddr_Check()\" maxlength=\"3\"> - \r\n\t\t\t\t\t   <input id=\"HP2\" name=\"HP2\" value=\"";
  private final static String _jspx_template66 = "\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this),Jumin_toaddr_Check()\" onKeyUp=\"count_check(this, HP3, 4),Jumin_toaddr_Check()\" maxlength=\"4\"> - \r\n\t\t\t\t\t   <input id=\"HP3\" name=\"HP3\" value=\"";
  private final static String _jspx_template67 = "\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this),Jumin_toaddr_Check()\" onKeyUp=\"nr_num_int(this),Jumin_toaddr_Check()\" maxlength=\"4\">\r\n\t\t\t\t\t\r\n\t\t\t\t\t</td>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t  <tr>\r\n\t\t\t      \t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">비고</td>\r\n\t\t\t        <td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t       \t\t<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t        \t\t<textarea id=\"REFERENCE\" name=\"REFERENCE\" onkeyup=\"displayBytes(500, 'REFERENCE');\" type=\"text\" class=\"input_form1\" style=\"width:98%\">";
  private final static String _jspx_template68 = "</textarea>\r\n\t\t\t       \t\t</table>\r\n\t\t\t      \t</td>\r\n\t\t\t      </tr> \r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td height=\"34\" colspan=\"4\" align=\"left\" bgcolor=\"#FFFFFF\" class=\"\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t  <td><span class=\"sub_stan_blue\">* 우편물 송달지</span> : </td>\r\n\t\t\t\t\t\t  <td width=\"16\">\r\n\t\t\t\t\t\t  \t";
  private final static String _jspx_template69 = "\r\n\t\t\t\t\t\t  \t\t<input id=\"ADDR_CHECK\" name=\"ADDR_CHECK\" type=\"checkbox\" checked=\"checked\" onclick=\"Jumin_toaddr_Check();\" onchange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" value=\"1\">\r\n\t\t\t\t\t\t  \t";
  private final static String _jspx_template70 = "\r\n\t\t\t\t\t\t  \t";
  private final static String _jspx_template71 = "\r\n\t\t\t\t\t\t  \t\t<input id=\"ADDR_CHECK\" name=\"ADDR_CHECK\" type=\"checkbox\" onclick=\"Jumin_toaddr_Check();\" onchange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" value=\"0\">\r\n\t\t\t\t\t\t  \t";
  private final static String _jspx_template72 = "\r\n\t\t\t\t\t\t  </td>\r\n\t\t\t\t\t\t  <td width=\"110\">점용인 정보와 동일 </td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t</table></td>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">우편물 수령인 </td>\r\n\t\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t<input id=\"TONM\" name=\"TONM\" type=\"text\" class=\"essential\" style=\"width:250px\" value=\"";
  private final static String _jspx_template73 = "\" onKeyUp=\"Jumin_toaddr_Check();\" onClick=\"Jumin_toaddr_Check();\">\r\n\t\t\t\t\t</td>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t  <!--  //********** BEGIN_현진_20120215 -->\r\n                  <!-- \r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">우편번호</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" colspan=\"3\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t  <td><input id=\"TOPOST\"  name=\"TOPOST\" type=\"text\" class=\"essential\" style=\"width:50px\" value=\"";
  private final static String _jspx_template74 = "\" onclick=\"Jumin_toaddr_Check();\" onchange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" readonly></td>\r\n\t\t\t\t\t\t  <td><a href=\"javascript:openZipcodePopup_new('form.TOPOST', 'form.TOADDR1', 'form.TOADDR1_NEW', 'form.TOSI', 'form.TOGUN', 'form.TO_DORO_NM', 'form.TO_BD_NM');\"><img src=\"/img/search_icon.gif\" alt=\"검색\" width=\"56\" height=\"18\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t</table></td> \r\n\t\t\t\t  </tr>\r\n\t\t\t\t  -->\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">우편번호</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" colspan=\"3\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t  \t<td width=\"50px\"><input id=\"TOPOST\"  name=\"TOPOST\" type=\"text\" class=\"essential\" style=\"width:50px\" value=\"";
  private final static String _jspx_template75 = "\" onclick=\"Jumin_toaddr_Check();\" onchange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" readonly></td>\r\n\t\t\t\t\t\t  \t<!--  //********** BEGIN_KANG_20120525 -->\r\n\t\t\t\t\t\t  \t<!-- <td width=\"50px\"><a href=\"javascript:openZipcodePopup_new('form.TOPOST', 'form.TOADDR1', 'form.TOADDR1_NEW', 'form.TOSI', 'form.TOGUN', 'form.TO_DORO_NM', 'form.TO_BD_NM','form.TODONG','form.TOBON', 'form.TOBU');\"><img src=\"/img/search_icon.gif\" alt=\"검색\" width=\"56\" height=\"18\" border=\"0\"></a></td> -->\r\n\t\t\t\t\t\t  \t<td width=\"50px\"><a href=\"javascript:addrDeleteTo()\"><img src=\"/img/search_icon.gif\" alt=\"검색\" width=\"56\" height=\"18\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t\t\t<!--   //********** END_KANG_20120525 -->\r\n\t\t\t\t\t\t\t\t<td align=\"right\"><a href=\"javascript:addrConfirm('TOPOST','TOSI','TOGUN','DONG','TO_DORO_NM','TOBON','TOBU','TO_BD_BON','TO_BD_BU','TO_BD_NM','TO_BD_DET_NM','TOADDR1','TOADDR2','TOADDR1_NEW','form')\"><img src=\"/img/ok_icon.gif\" alt=\"확인\" width=\"56\" height=\"18\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t\t\t<!--  sungh83 20131106 -->\r\n\t\t\t\t\t\t\t\t<td><span class=\"sub_table_b\">%도로명주소의 건물본번,부번을 입력하시려면 확인버튼을 클릭하시오</span></td>\r\n\t\t\t\t\t\t\t\t<!--  sungh83 20131106 -->\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t</table></td> \r\n\t\t\t\t  </tr>\t\t\t\t\r\n\t\t\t\t  <!--   //********** END_현진_20120215 -->\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">송달지 주소</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t<input id=\"TOADDR1\" name=\"TOADDR1\" type=\"text\" class=\"essential\" style=\"width:250px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template76 = "\" readonly>\r\n\t \t\t\t\t\t<input id=\"TOSI\" name=\"TOSI\" type=\"hidden\" value=\"";
  private final static String _jspx_template77 = "\">\r\n\t \t\t\t\t\t<input id=\"TOGUN\" type=\"hidden\" name=\"TOGUN\" value=\"";
  private final static String _jspx_template78 = "\">\r\n\t \t\t\t\t\t<input id=\"TO_DORO_NM\" type=\"hidden\" name=\"TO_DORO_NM\" value=\"";
  private final static String _jspx_template79 = "\">\r\n\t \t\t\t\t\t<!--  //********** BEGIN_현진_20120215 -->\r\n\t\t\t\t\t\t<input id=\"TODONG\" name=\"TODONG\" type=\"hidden\" value=\"";
  private final static String _jspx_template80 = "\"/>\r\n\t\t\t\t\t\t<!--   //********** END_현진_20120215 -->\r\n\t \t\t\t\t\t<br>\r\n\t\t\t\t\t\t산<input id=\"TOSAN\" name=\"TOSAN\" type=\"checkbox\" style=\"vertical-align: middle;\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" ";
  private final static String _jspx_template81 = "checked";
  private final static String _jspx_template82 = ">\r\n\t\t\t\t\t\t<input id=\"TOBON\" name=\"TOBON\" type=\"text\" class=\"essential\" style=\"width:25px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template83 = "\">\r\n\t\t\t\t\t\t-\r\n\t\t\t\t\t\t<input id=\"TOBU\" name=\"TOBU\" type=\"text\" class=\"input_form1\" style=\"width:25px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template84 = "\" >\r\n\t\t\t\t\t\t<!--  //********** BEGIN_현진_20120216 -->\r\n\t\t\t\t\t\t<input id=\"TOADDR2\" name=\"TOADDR2\" type=\"text\" class=\"input_form1\" style=\"width:135px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template85 = "\"  maxlength=\"50\">\r\n\t\t\t\t\t\t<!--   //********** END_현진_20120216 -->\r\n\r\n\t\t\t\t\t</td>\r\n\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">송달지 <br/>도로명 주소</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t<!--  //********** BEGIN_현진_20120309 -->\r\n\t\t\t\t\t\t<!--  //********** BEGIN_KANG_20120424 -->\r\n\t\t\t\t\t\t<!-- <input id=\"TOADDR1_NEW\" name=\"TOADDR1_NEW\" type=\"text\" value=\"";
  private final static String _jspx_template86 = " ";
  private final static String _jspx_template87 = " ";
  private final static String _jspx_template88 = "\" class=\"essential\" style=\"width:250px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  readonly> -->\r\n\t\t\t\t\t\t<input id=\"TOADDR1_NEW\" name=\"TOADDR1_NEW\" type=\"text\" ";
  private final static String _jspx_template89 = "value=\"";
  private final static String _jspx_template90 = " ";
  private final static String _jspx_template91 = " ";
  private final static String _jspx_template92 = "\"";
  private final static String _jspx_template93 = " class=\"essential\" style=\"width:250px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  readonly>\r\n\t\t\t\t\t\t<!--   //********** END_KANG_20120424 -->\t\t\t\t\t\t\r\n\t\t\t\t\t\t<!--   //********** END_현진_20120309 -->\r\n\t\t\t\t\t\t<!--  //********** BEGIN_현진_20120215 -->\r\n\t\t\t\t\t\t<!--\r\n\t\t\t\t\t\t\t산<input id=\"TOSAN\" name=\"TOSAN\" type=\"checkbox\" style=\"vertical-align: middle;\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" ";
  private final static String _jspx_template94 = "checked";
  private final static String _jspx_template95 = ">\r\n\t\t\t\t\t\t  -->\r\n\t\t\t\t\t\t<!--   //********** END_현진_20120215 -->\r\n\t\t\t\t\t\t<!--  //********** BEGIN_KANG_20120424 -->\r\n\t\t\t\t\t\t<!-- \r\n\t\t\t\t\t\t<input id=\"TO_BD_BON\" name=\"TO_BD_BON\" type=\"text\" VALUE=\"";
  private final static String _jspx_template96 = "\" class=\"essential\" style=\"width:25px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" >\r\n\t\t\t\t\t\t-\r\n\t\t\t\t\t\t<input id=\"TO_BD_BU\" name=\"TO_BD_BU\" type=\"text\" VALUE=\"";
  private final static String _jspx_template97 = "\" class=\"input_form1\" style=\"width:25px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  >\r\n\t\t\t\t\t\t<input id=\"TO_BD_NM\" name=\"TO_BD_NM\" type=\"text\" VALUE=\"";
  private final static String _jspx_template98 = "\" class=\"input_form1\" style=\"width:135px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  maxlength=\"50\">\r\n\t\t\t\t\t\t<input id=\"TO_BD_DET_NM\" name=\"TO_BD_DET_NM\" type=\"text\" VALUE=\"";
  private final static String _jspx_template99 = "\" class=\"input_form1\" style=\"width:214px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  maxlength=\"50\">\r\n\t\t\t\t\t\t -->\r\n\t\t\t\t\t\t";
  private final static String _jspx_template100 = "\r\n\t\t\t\t\t\t<input id=\"TO_BD_BON\" name=\"TO_BD_BON\" type=\"text\" VALUE=\"";
  private final static String _jspx_template101 = "\" class=\"essential\" style=\"width:25px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" >\r\n\t\t\t\t\t\t-\r\n\t\t\t\t\t\t<input id=\"TO_BD_BU\" name=\"TO_BD_BU\" type=\"text\" VALUE=\"";
  private final static String _jspx_template102 = "\" class=\"input_form1\" style=\"width:25px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  >\r\n\t\t\t\t\t\t<input id=\"TO_BD_NM\" name=\"TO_BD_NM\" type=\"text\" VALUE=\"";
  private final static String _jspx_template103 = "\" class=\"input_form1\" style=\"width:135px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  maxlength=\"50\">\r\n\t\t\t\t\t\t<input id=\"TO_BD_DET_NM\" name=\"TO_BD_DET_NM\" type=\"text\" VALUE=\"";
  private final static String _jspx_template104 = "\" class=\"input_form1\" style=\"width:214px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  maxlength=\"50\">\r\n\t\t\t\t\t\t";
  private final static String _jspx_template105 = "\r\n\t\t\t\t\t\t";
  private final static String _jspx_template106 = "\r\n\t\t\t\t\t\t<input id=\"TO_BD_BON\" name=\"TO_BD_BON\" type=\"text\" VALUE=\"\" class=\"essential\" style=\"width:25px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" >\r\n\t\t\t\t\t\t-\r\n\t\t\t\t\t\t<input id=\"TO_BD_BU\" name=\"TO_BD_BU\" type=\"text\" VALUE=\"\" class=\"input_form1\" style=\"width:25px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  >\r\n\t\t\t\t\t\t<input id=\"TO_BD_NM\" name=\"TO_BD_NM\" type=\"text\" VALUE=\"\" class=\"input_form1\" style=\"width:135px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  maxlength=\"50\">\r\n\t\t\t\t\t\t<input id=\"TO_BD_DET_NM\" name=\"TO_BD_DET_NM\" type=\"text\" VALUE=\"\" class=\"input_form1\" style=\"width:214px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  maxlength=\"50\">\r\n\t\t\t\t\t\t";
  private final static String _jspx_template107 = "\r\n\t\t\t\t\t\t<!--   //********** END_KANG_20120424 -->\r\n\t\t\t\t\t\t\r\n\t\t\t\t\t</td>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">e-mail</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t\t\t\t<input id=\"TOMAIL\" name=\"TOMAIL\" type=\"text\" class=\"input_form1\" style=\"width:250px\" onchange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\"  onkeyup=\"Jumin_toaddr_Check();\" maxlength=\"50\" value=\"";
  private final static String _jspx_template108 = "\" style=\"ime-mode:disabled\">\r\n\t\t\t\t\t</td>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">전화번호</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\r\n\t\t\t\t\t\t<input id=\"TOTEL1\" name=\"TOTEL1\" value=\"";
  private final static String _jspx_template109 = "\" type=\"text\" class=\"input_form1\" style=\"width:25px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this),Jumin_toaddr_Check()\" onKeyUp=\"count_check(this, TOTEL2, 3),Jumin_toaddr_Check()\" maxlength=\"3\"> - \r\n\t\t\t\t\t\t<input id=\"TOTEL2\" name=\"TOTEL2\" value=\"";
  private final static String _jspx_template110 = "\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this),Jumin_toaddr_Check()\" onKeyUp=\"count_check(this, TOTEL3, 4),Jumin_toaddr_Check()\" maxlength=\"4\"> - \r\n\t\t\t\t\t\t<input id=\"TOTEL3\" name=\"TOTEL3\" value=\"";
  private final static String _jspx_template111 = "\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this),Jumin_toaddr_Check()\" onKeyUp=\"count_check(this, TOHP1, 4),Jumin_toaddr_Check()\" maxlength=\"4\">\r\n\t\t\t\t\r\n\t\t\t\t\r\n\t\t\t\t\r\n\t\t\t\t\r\n\t\t\t\t\t</td>\r\n\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">휴대전화</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\r\n\t\t\t\t\t\t<input id=\"TOHP1\" name=\"TOHP1\" value=\"";
  private final static String _jspx_template112 = "\" type=\"text\" class=\"input_form1\" style=\"width:25px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this),Jumin_toaddr_Check()\" onKeyUp=\"count_check(this, TOHP2, 3),Jumin_toaddr_Check()\" maxlength=\"3\"> - \r\n\t\t\t\t\t\t<input id=\"TOHP2\" name=\"TOHP2\" value=\"";
  private final static String _jspx_template113 = "\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this),Jumin_toaddr_Check()\" onKeyUp=\"count_check(this, TOHP3, 4),Jumin_toaddr_Check()\" maxlength=\"4\"> - \r\n\t\t\t\t\t\t<input id=\"TOHP3\" name=\"TOHP3\" value=\"";
  private final static String _jspx_template114 = "\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this),Jumin_toaddr_Check()\" onKeyUp=\"nr_num_int(this),Jumin_toaddr_Check()\" maxlength=\"4\">\r\n\t\t\t\t\t\r\n\t\t\t\t\t\t\r\n\t\t\t\t\t\r\n\t\t\t\t\t\r\n\t\t\t\t\t</td>\r\n\t\t\t\t  </tr>\r\n\t\t\t  </table></td>\r\n\t\t\t</tr>\r\n\t\t\t\r\n\t\t\t<tr>\r\n\t\t\t  \t<td height=\"40\" align=\"right\">\r\n\t\t\t  \t\t<img src=\"/img/can_icon.gif\" alt=\"취소\" width=\"56\" height=\"18\" border=\"0\" onclick=\"javascript:Cancel()\" style=\"cursor: pointer;\">\r\n\t\t\t  \t\t<img src=\"/img/save_icon2.gif\" alt=\"저장\" width=\"56\" height=\"18\" border=\"0\" onclick=\"javascript:ModifyPrc()\" style=\"cursor: pointer;\">\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t</table></td>\r\n\t</tr>\r\n\r\n</table>\r\n</body>\r\n</html>";
}
