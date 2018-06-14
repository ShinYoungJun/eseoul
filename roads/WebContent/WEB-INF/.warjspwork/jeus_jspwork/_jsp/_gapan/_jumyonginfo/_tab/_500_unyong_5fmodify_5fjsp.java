package jeus_jspwork._jsp._gapan._jumyonginfo._tab;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_unyong_5fmodify_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(292,62);to=(292,70)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(293,60);to=(293,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GU_CODE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(294,74);to=(294,95)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_IMG_NAME }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(311,109);to=(311,125)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_0_fn(pageContext, null)) return;


      out.write(_jspx_template16);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_1_fn(pageContext, null)) return;


      out.write(_jspx_template18);
      // jsp code [from=(337,80);to=(337,100)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_IMG_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(345,111);to=(345,127)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_SSN1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(346,114);to=(346,130)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_SSN2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_2_fn(pageContext, null)) return;


      out.write(_jspx_template23);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_3_fn(pageContext, null)) return;


      out.write(_jspx_template25);
      // jsp code [from=(354,115);to=(354,130)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_AGE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template26);
      // jsp code [from=(360,43);to=(360,59)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_TEL1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // jsp code [from=(361,43);to=(361,59)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_TEL2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template28);
      // jsp code [from=(362,43);to=(362,59)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_TEL3}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template29);
      // jsp code [from=(366,42);to=(366,57)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_HP1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template30);
      // jsp code [from=(367,42);to=(367,57)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_HP2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template31);
      // jsp code [from=(368,42);to=(368,57)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_HP3}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template32);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_4_fn(pageContext, null)) return;


      out.write(_jspx_template34);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_5_fn(pageContext, null)) return;


      out.write(_jspx_template36);
      // jsp code [from=(405,180);to=(405,196)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_POST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template37);
      // jsp code [from=(414,184);to=(414,202)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_TOPOST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template38);
      // jsp code [from=(426,210);to=(426,226)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_POST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template39);
      // jsp code [from=(439,216);to=(439,234)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_TOPOST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template40);
      // jsp code [from=(452,71);to=(452,86)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_SAN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template41);
      // jsp code [from=(454,212);to=(454,229)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_ADDR1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template42);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_6_fn(pageContext, null)) return;


      out.write(_jspx_template45);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_7_fn(pageContext, null)) return;


      out.write(_jspx_template48);
      // jsp code [from=(462,63);to=(462,81)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_BONBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template49);
      // jsp code [from=(463,63);to=(463,80)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_BUBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template50);
      // jsp code [from=(464,113);to=(464,130)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_ADDR2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template51);
      // jsp code [from=(469,214);to=(469,233)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_TOADDR1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template52);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_8_fn(pageContext, null)) return;


      out.write(_jspx_template55);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_9_fn(pageContext, null)) return;


      out.write(_jspx_template58);
      // jsp code [from=(477,67);to=(477,87)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_TOBONBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template59);
      // jsp code [from=(478,67);to=(478,86)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_TOBUBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template60);
      // jsp code [from=(479,117);to=(479,136)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_TOADDR2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template61);
      // jsp code [from=(488,74);to=(488,82)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SI}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template62);
      // jsp code [from=(488,86);to=(488,95)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template63);
      // jsp code [from=(488,99);to=(488,112)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.DORO_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template64);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_10_fn(pageContext, null)) return;


      out.write(_jspx_template69);
      // jsp code [from=(493,57);to=(493,65)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SI}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template70);
      // jsp code [from=(494,59);to=(494,68)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template71);
      // jsp code [from=(495,67);to=(495,80)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.DORO_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template72);
      // jsp code [from=(496,61);to=(496,71)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.DONG}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template73);
      // jsp code [from=(499,57);to=(499,65)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.RI}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template74);
      // jsp code [from=(503,63);to=(503,75)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_BON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template75);
      // jsp code [from=(505,61);to=(505,72)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_BU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template76);
      // jsp code [from=(506,61);to=(506,72)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template77);
      // jsp code [from=(507,69);to=(507,84)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_DET_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template78);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_11_fn(pageContext, null)) return;


      out.write(_jspx_template84);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_12_fn(pageContext, null)) return;


      out.write(_jspx_template86);
      // jsp code [from=(532,78);to=(532,88)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOSI}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template87);
      // jsp code [from=(532,92);to=(532,103)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOGUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template88);
      // jsp code [from=(532,107);to=(532,122)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TODORO_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template89);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_13_fn(pageContext, null)) return;


      out.write(_jspx_template94);
      // jsp code [from=(538,61);to=(538,71)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOSI}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template95);
      // jsp code [from=(539,63);to=(539,74)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOGUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template96);
      // jsp code [from=(540,71);to=(540,86)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TODORO_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template97);
      // jsp code [from=(541,63);to=(541,74)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TDONG}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template98);
      // jsp code [from=(544,61);to=(544,64)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TRI}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template99);
      // jsp code [from=(548,67);to=(548,81)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOBD_BON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template100);
      // jsp code [from=(550,65);to=(550,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOBD_BU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template101);
      // jsp code [from=(551,65);to=(551,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOBD_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template102);
      // jsp code [from=(552,73);to=(552,90)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOBD_DET_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template103);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_14_fn(pageContext, null)) return;


      out.write(_jspx_template109);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_15_fn(pageContext, null)) return;


      out.write(_jspx_template111);
      // jsp code [from=(587,12);to=(587,18)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${lc_sel}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template112);
      // jsp code [from=(589,91);to=(589,103)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.LC_TXT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template113);
      // jsp code [from=(594,12);to=(594,18)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rt_sel}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template114);
      // jsp code [from=(596,91);to=(596,103)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.RT_TXT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template115);
      // jsp code [from=(602,95);to=(602,112)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ESTATE_MOVE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template116);
      // jsp code [from=(603,95);to=(603,112)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ESTATE_REAL}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template117);
      // jsp code [from=(611,124);to=(611,135)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.NOTE }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template118);
      // jsp code [from=(624,39);to=(624,47)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template119);

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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_IDCHK == '0'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
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
    _jspx_th_c_if_2.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_GENDER == '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
      if (_jspx_eval_c_if_2 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template22);

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
          out.write(_jspx_template24);

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
    _jspx_th_c_if_4.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADDR_CHECK1 == '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
      if (_jspx_eval_c_if_4 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template33);

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
    _jspx_th_c_if_5.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADDR_CHECK1 != '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
      if (_jspx_eval_c_if_5 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template35);

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
    _jspx_th_c_if_6.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_SAN == '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
      if (_jspx_eval_c_if_6 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template43);
          // jsp code [from=(457,212);to=(457,227)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_SAN}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template44);

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
    _jspx_th_c_if_7.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_SAN != '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_7 = _jspx_th_c_if_7.doStartTag();
      if (_jspx_eval_c_if_7 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template46);
          // jsp code [from=(460,212);to=(460,227)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_SAN}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template47);

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
          out.write(_jspx_template53);
          // jsp code [from=(472,214);to=(472,231)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_TOSAN}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template54);

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
    _jspx_th_c_if_9.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_TOSAN != '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_9 = _jspx_th_c_if_9.doStartTag();
      if (_jspx_eval_c_if_9 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template56);
          // jsp code [from=(475,214);to=(475,231)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_TOSAN}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template57);

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
    _jspx_th_c_if_10.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.DORO_NM != null && board.DORO_NM != ''}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_10 = _jspx_th_c_if_10.doStartTag();
      if (_jspx_eval_c_if_10 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template65);
          // jsp code [from=(489,130);to=(489,138)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SI}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template66);
          // jsp code [from=(489,142);to=(489,151)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template67);
          // jsp code [from=(489,155);to=(489,168)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.DORO_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template68);

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
    _jspx_th_c_if_11.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.DORO_NM != null && board.DORO_NM != ''}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_11 = _jspx_th_c_if_11.doStartTag();
      if (_jspx_eval_c_if_11 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template79);
          // jsp code [from=(510,63);to=(510,75)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_BON}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template80);
          // jsp code [from=(512,61);to=(512,72)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_BU}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template81);
          // jsp code [from=(513,61);to=(513,72)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template82);
          // jsp code [from=(514,69);to=(514,84)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_DET_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template83);

        } while (_jspx_th_c_if_11.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_11.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_11.release();
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
    _jspx_th_c_if_12.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.DORO_NM == null || board.DORO_NM == ''}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_12 = _jspx_th_c_if_12.doStartTag();
      if (_jspx_eval_c_if_12 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template85);

        } while (_jspx_th_c_if_12.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_12.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_12.release();
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
    _jspx_th_c_if_13.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TODORO_NM != null && board.TODORO_NM != ''}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_13 = _jspx_th_c_if_13.doStartTag();
      if (_jspx_eval_c_if_13 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template90);
          // jsp code [from=(533,138);to=(533,148)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOSI}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template91);
          // jsp code [from=(533,152);to=(533,163)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOGUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template92);
          // jsp code [from=(533,167);to=(533,182)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TODORO_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template93);

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
    _jspx_th_c_if_14.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TODORO_NM != null && board.TODORO_NM != ''}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_14 = _jspx_th_c_if_14.doStartTag();
      if (_jspx_eval_c_if_14 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template104);
          // jsp code [from=(555,67);to=(555,81)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOBD_BON}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template105);
          // jsp code [from=(557,65);to=(557,78)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOBD_BU}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template106);
          // jsp code [from=(558,65);to=(558,78)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOBD_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template107);
          // jsp code [from=(559,73);to=(559,90)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOBD_DET_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template108);

        } while (_jspx_th_c_if_14.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_14.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_14.release();
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
    _jspx_th_c_if_15.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TODORO_NM == null || board.TODORO_NM == ''}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_15 = _jspx_th_c_if_15.doStartTag();
      if (_jspx_eval_c_if_15 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template110);

        } while (_jspx_th_c_if_15.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_15.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_15.release();
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
  private final static String _jspx_template9 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n}\r\n-->\r\n\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n<script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script>\r\n<script language='JavaScript' src='/js/Check_inputbox.js'></script>\r\n<script language=\"javascript\" src=\"/js/Ajax_request.js\"></script>\r\n<!--  //********** BEGIN_현진_20120212 -->\r\n<script language=\"javascript\" src=\"/js/zipcode.js\"></script>\r\n<!--   //********** END_현진_20120212 -->   \r\n\r\n\r\n<!--  script language='JavaScript' src='/jsp/gapan/gapan/tab/info_register.js'></script-->\r\n\r\n<script type=\"text/javascript\">\r\n//<![CDATA[\r\n\tfunction \tInit()\r\n\t{\r\n\t\tparent.Tab_Img(\"unyong\");\r\n\t}\r\n\r\n\tfunction\tModifyPrc()\r\n\t{\r\n\t\tvar\tresult\t= DataCheck();\r\n\t\t\r\n\t\tif(result\t==\tfalse)\r\n\t\t\treturn;\r\n\t\t\r\n\t\tvar form = document.form;\r\n\r\n\t\tform.action = \"/gapan/jumyonginfo/unyong_modify_prc.do\";\r\n\t\tform.submit();\r\n\t}\r\n\r\n\tfunction\tCancel(GAPAN_NO)\r\n\t{\r\n\t\tvar form = document.form;\r\n\r\n\t\tform.action = \"/gapan/jumyonginfo/unyong_view.do?GAPAN_NO=\"+GAPAN_NO;\r\n\t\tform.submit();\r\n\t}\r\n\t\r\n\tfunction\tDataCheck()\r\n\t{\r\n\t\tvar form \t= document.form;\r\n\t\tvar\tstr\t\t= \"\";\r\n\r\n\t\tif(form.OWNER_NAME.value.length\t< 1)\r\n\t\t{\r\n\t\t\tstr\t+= \"운영자명을 입력하세요\\n\";\r\n\t\t\talert(str);\r\n\t\t\tform.OWNER_NAME.focus();\r\n\t\t}\r\n\t\telse if(form.OWNER_SSN1.value.length\t< 1)\r\n\t\t{\r\n\t\t\tstr\t+= \"운영자 주민등록번호를 입력하세요\\n\";\r\n\t\t\talert(str);\r\n\t\t\tform.OWNER_SSN1.focus();\r\n\t\t}\r\n\t\telse if(form.OWNER_SSN2.value.length\t< 1)\r\n\t\t{\r\n\t\t\tstr\t+= \"운영자 주민등록번호를 입력하세요\\n\";\r\n\t\t\talert(str);\r\n\t\t\tform.OWNER_SSN2.focus();\r\n\t\t}\r\n\t\telse if(form.OWNER_TOPOST.value.length\t< 1 || form.OWNER_TOADDR1.value.length < 1)\r\n\t\t{\r\n\t\t\tstr\t+= \"실제거주지 우편번호를 선택하세요\\n\";\r\n\t\t\talert(str);\r\n\t\t\t//********** BEGIN_현진_20120213\r\n\t\t\t//openZipcodePopup('form.OWNER_TOPOST', 'form.OWNER_TOADDR1');\r\n\t\t\t//********** END_현진_20120213\r\n\t\t\tjavascript:openZipcodePopup_new('form.OWNER_TOPOST', 'form.OWNER_TOADDR1', 'form.TOADDR1_NEW', 'form.TOSI', 'form.TOGUN', 'form.TODORO_NM', 'form.TOBD_NM','form.TDONG', 'form.OWNER_TOBONBUN', 'form.OWNER_TOBUBUN');\t\t\t\r\n\t\t\t\r\n\t\t}\r\n\t\telse if(form.OWNER_TOBONBUN.value.length\t< 1)\r\n\t\t{\r\n\t\t\tstr\t+= \"실제거주지 상세주소를 입력하세요\\n\";\r\n\t\t\talert(str);\r\n\t\t\tform.OWNER_TOBONBUN.focus();\r\n\t\t}\r\n\r\n\t\tif(str\t== \"\")\r\n\t\t{\r\n\t\t\treturn\ttrue;\r\n\t\t}\r\n\t\t\r\n\t\treturn\tfalse;\r\n\t}\r\n\t\r\n\tfunction\tJumin_toaddr_Check()\r\n\t{\r\n\t\tvar form \t= document.form;\r\n\t\tvar\tchk1\t\t= form.ADDR_CHECK1.checked;\r\n\r\n\t\tif(chk1\t== true)\r\n\t\t{\r\n\t\t\tform.OWNER_TOPOST.value\t\t= form.OWNER_POST.value;\r\n\t\t\tform.OWNER_TOADDR1.value\t= form.OWNER_ADDR1.value;\r\n\t\t\tform.OWNER_TOADDR2.value\t= form.OWNER_ADDR2.value;\r\n\t\t\t \r\n\t\t\t\r\n\t\t\tform.TOADDR1_NEW.value\t= form.ADDR1_NEW.value;\r\n\t\t\tform.TOSI.value\t= form.SI.value;\r\n\t\t\tform.TDONG.value\t= form.DONG.value; \r\n\t\t\t//********** BEGIN_현진_20120402\r\n\t\t\tform.TOGUN.value\t= form.GUN.value;\r\n\t\t\tform.T_RI.value\t= form.RI.value;\r\n\t\t\t//********** END_현진_20120402\r\n\t\t\tform.TODORO_NM.value\t= form.DORO_NM.value;\r\n\t\t\tform.TOBD_NM.value\t= form.BD_NM.value;\r\n\t\t\tform.TOBD_DET_NM.value\t= form.BD_DET_NM.value;\r\n\t\t\t\r\n\t\t\tform.TOBD_BON.value\t= form.BD_BON.value;\r\n\t\t\tform.TOBD_BU.value\t= form.BD_BU.value;\r\n\t\t\t\r\n\t\t\t\r\n\t\t\t\r\n\t\t\tif(form.OWNER_SAN.checked == true){\r\n\t\t\t\tform.OWNER_SAN.value = \"1\";\r\n\t\t\t\tform.OWNER_TOSAN.checked = true;\r\n\t\t\t\tform.OWNER_TOSAN.value = \"1\";\r\n\t\t\t}else{\r\n\t\t\t\tform.OWNER_SAN.value = \"0\";\r\n\t\t\t\tform.OWNER_TOSAN.checked = false;\r\n\t\t\t\tform.OWNER_TOSAN.value = \"0\";\r\n\t\t\t}\r\n\t\t\tform.OWNER_TOBONBUN.value\t= form.OWNER_BONBUN.value;\r\n\t\t\tform.OWNER_TOBUBUN.value\t= form.OWNER_BUBUN.value;\r\n\t\t\t\r\n\t\t\tform.ADDR_CHECK1.value = \"1\";\r\n\t\t}\r\n\t\telse\r\n\t\t{\r\n\t\t\tform.ADDR_CHECK1.value = \"0\";\r\n\t\t\t\r\n\t\t\tif(form.OWNER_TOSAN.checked == true){\r\n\t\t\t\tform.OWNER_TOSAN.value = \"1\";\r\n\t\t\t}else{\r\n\t\t\t\tform.OWNER_TOSAN.value = \"0\";\r\n\t\t\t}\r\n\t\t}\r\n\t}\r\n\t\r\n\t/**********************************************************************************************************************************/\r\n";
  private final static String _jspx_template10 = "      //********** BEGIN_현진_20120212\r\n      /*\r\n\tfunction \topenZipcodePopup(post, addr)\r\n\t{\r\n\t\tvar\tpost1\t= post;\r\n\t\tvar\taddr1\t= addr;\r\n\r\n\t\tvar url \t= \"/zipcode.do?openerPost=\" + post1 + \"&openerAddr=\" + addr1;\r\n\t\tvar winName = \"우편번호입력\";\r\n\t\tvar width \t= 420;\r\n\t\tvar height \t= 305;\r\n\t\tvar scroll \t= \"yes\";\r\n\t\tvar resize \t= \"no\";\r\n\r\n\t\tvar\toption\t= \"scrollbars=\" + scroll + \", \";\r\n\t\toption\t+= \"resize=\" + resize + \", \";\r\n\t\toption\t+= \"width=\" + width + \", \";\r\n\t\toption\t+= \"height=\" + height;\r\n\r\n\t\twindow.open(url, winName, option);\r\n\t}\r\n\t\r\n\tfunction openZipcodePopup_new(post, addr, addr_new, si, gu, doro, bd)\r\n\t{ \r\n\t\tvar\tpost1\t= post;\r\n\t\tvar\taddr1\t= addr;\r\n\t\tvar\taddr1_new\t= addr_new;\r\n\t\tvar\taddr1_si\t= si;\r\n\t\tvar\taddr1_gu\t= gu;\r\n\t\tvar\taddr1_doro\t= doro;\r\n\t\tvar\taddr1_bd\t= bd;\r\n\t\t\r\n\t\t \r\n\t\t\r\n\t\t//var url \t= \"/zipcode.do?openerPost=\" + post1 + \"&openerAddr=\" + addr1+ \"&openerAddrNew=\" + addr1_new+ \"&openerSi=\" + addr1_si+ \"&openerGu=\" + addr1_gu+ \"&openerDoro=\" + addr1_doro+\"&openerBd=\" + addr1_bd;\r\n\t\tvar url \t= \"/zipCode_New.do?openerPost=\" + post1 + \"&openerAddr=\" + addr1+ \"&openerAddrNew=\" + addr1_new+ \"&openerSi=\" + addr1_si+ \"&openerGun=\" + addr1_gu+ \"&openerDoro=\" + addr1_doro+\"&openerBd=\" + addr1_bd;\r\n\t\t\r\n\t\t//alert('url ='+url);\r\n\t\t\r\n\t\tvar winName = \"우편번호입력\";\r\n\t\t//var width \t= 420;\r\n\t\tvar width \t= 840;\r\n\t\tvar height \t= 305;\r\n\t\tvar scroll \t= \"yes\";\r\n\t\tvar resize \t= \"no\";\r\n\r\n\t\tvar\toption\t= \"scrollbars=\" + scroll + \", \";\r\n\t\toption\t+= \"resize=\" + resize + \", \";\r\n\t\toption\t+= \"width=\" + width + \", \";\r\n\t\toption\t+= \"height=\" + height;\r\n\r\n\t\twindow.open(url, winName, option);\r\n\t\t \r\n\t}\r\n    */\r\n    //********** END_현진_20120212\r\n\t function ChangeImg(thisObj, preViewer) {\r\n\t\t\r\n\t\tif(!/(\\.gif|\\.jpg|\\.jpeg|\\.png)$/i.test(thisObj.value)) {\r\n\t\t\talert(\"이미지 형식의 파일을 선택하십시오\");\r\n\t\t\treturn;\r\n\t\t}\r\n\r\n\t\tpreViewer = (typeof(preViewer) == \"object\") ? preViewer : document.getElementById(preViewer);\r\n\t\tvar ua = window.navigator.userAgent;\r\n\r\n\t\tif (ua.indexOf(\"MSIE\") > -1) {\r\n\t\t\tvar img_path = \"\";\r\n\t\t\tif (thisObj.value.indexOf(\"\\\\fakepath\\\\\") < 0) {                 \r\n\t\t\t\timg_path = thisObj.value;\r\n\t\t\t} else {\r\n\t\t\t\tthisObj.select();\r\n\t\t\t\tvar selectionRange = document.selection.createRange();\r\n\t\t\t\timg_path = selectionRange.text.toString();\r\n\t\t\t\tthisObj.blur();\r\n\t\t\t}\r\n\t\t\t\tpreViewer.style.filter = \"progid:DXImageTransform.Microsoft.AlphaImageLoader(src='fi\" + \"le://\" + img_path + \"', sizingMethod='scale')\";\r\n\t\t} else {\r\n\t\t\tpreViewer.innerHTML = \"\";\r\n\t\t\tvar W = preViewer.offsetWidth;\r\n\t\t\tvar H = preViewer.offsetHeight;\r\n\t\t\tvar tmpImage = document.createElement(\"img\");\r\n\t\t\tpreViewer.appendChild(tmpImage);\r\n\t\r\n\t\t\ttmpImage.onerror = function () {\r\n\t\t\t\treturn preViewer.innerHTML = \"\";\r\n\t\t\t};\r\n\t\r\n\t\t\ttmpImage.onload = function () {\r\n\t\r\n\t\t\t\tif (this.width > W) {\r\n\t\t\t\t\tthis.height = this.height / (this.width / W);\r\n\t\t\t\t\tthis.width = W;\r\n\t\t\t\t}\r\n\t\t\t\tif (this.height > H) {\r\n\t\t\t\t\tthis.width = this.width / (this.height / H);\r\n\t\t\t\t\tthis.height = H;\r\n\t\t\t\t}\r\n\t\t\t};\r\n\t        if (ua.indexOf(\"Firefox/3\") > -1) {\r\n\t\t\t\tvar picData = thisObj.files.item(0).getAsDataURL();\r\n\t\t\t\ttmpImage.src = picData;\r\n\t\t\t} else {\r\n\t\t\t\ttmpImage.src = \"file://\" + thisObj.value;\r\n\t\t\t}\r\n\t\t}\r\n     }\r\n\r\n\t//클릭시 신분증 확인 체크 값 세팅\r\n\t\tfunction click_idchk(obj)\r\n\t\t{\r\n\t\t\tif(obj.checked == true)\r\n\t\t\t{\r\n\t\t\t\tobj.value = \"1\";\r\n\t\t\t}\r\n\t\t\telse\r\n\t\t\t{\r\n\t\t\t\tobj.value = \"0\";\r\n\t\t\t}\r\n\t\t}\r\n\t\r\n//]]>\r\n</script>\r\n\r\n<body onload=\"Init()\">\r\n\r\n<form id=\"form\" name=\"form\" method=\"post\" enctype=\"multipart/form-data\">\r\n\t<input type=\"hidden\" id=\"GAPAN_NO\" name=\"GAPAN_NO\" value=\"";
  private final static String _jspx_template11 = "\">\r\n\t<input type=\"hidden\" id=\"GU_CODE\" name=\"GU_CODE\" value=\"";
  private final static String _jspx_template12 = "\">\r\n\t<input type=\"hidden\" id=\"OWNER_IMG_NAME\" name=\"OWNER_IMG_NAME\" value=\"";
  private final static String _jspx_template13 = "\">\r\n\r\n\t<table width=\"780\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t<tr>\r\n\t\t\t<td align=\"left\" class=\"contborder_purple\">\r\n\t\t\t\r\n\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t<tr>\r\n\t\t\t\t  <td>\r\n\t\t\t\t  \r\n\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t                <tr>\r\n\t                  \t<td>\r\n\t                  \t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">운영자명</td>\r\n\t\t\t\t\t\t\t<td width=\"37%\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t<input id=\"OWNER_NAME\" name=\"OWNER_NAME\" type=\"text\" class=\"essential\" style=\"width:150px\" value=\"";
  private final static String _jspx_template14 = "\" maxlength=\"35\">\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template15 = " \r\n\t\t\t\t\t\t\t\t\t<input id=\"OWNER_IDCHK\" name=\"OWNER_IDCHK\" type=\"checkbox\" value=\"1\" checked onclick=\"javascript:click_idchk(this);\">신분증 확인\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template16 = "\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template17 = " \r\n\t\t\t\t\t\t\t\t\t<input id=\"OWNER_IDCHK\" name=\"OWNER_IDCHK\" type=\"checkbox\" value=\"0\" onclick=\"javascript:click_idchk(this);\">신분증 확인\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template18 = "\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" rowspan=\"3\">\r\n\t\t\t\t\t\t\t\t<table>\r\n\t\t\t\t\t\t\t\t\t<tr><td>운영자 사진</td></tr>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t<br><br>\r\n\t\t\t\t\t\t\t\t\t\t\t<span onclick=\"javascript:document.getElementById('file1').click();\" style=\"overflow:hidden; background-repeat:no-repeat; cursor: pointer;\">\r\n\t\t\t\t\t\t\t\t\t\t\t</span>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" rowspan=\"3\" align=\"center\">\r\n\t\t\t\t\t\t\t\t<table>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td><input type='file' id=\"OWNER_IMG\" name='OWNER_IMG' \tstyle=\"width:10;\" onchange=\"ChangeImg(this, 'tblview');\" ></td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td width=100 height=130 id=\"tblview\" style=\"background-image:url('";
  private final static String _jspx_template19 = "'); background-repeat:no-repeat; background-attachment:scroll; background-position:50% 50%;\"></td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">주민등록번호</td>\r\n\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t<input name=\"OWNER_SSN1\" type=\"text\" class=\"essential\" style=\"width:40px; ime-mode:disabled\" value=\"";
  private final static String _jspx_template20 = "\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, OWNER_SSN2, 6);\" maxlength=\"6\">\r\n\t\t\t\t\t\t\t  - <input name=\"OWNER_SSN2\" type=\"text\" class=\"essential\" style=\"width:45px; ime-mode:disabled\" value=\"";
  private final static String _jspx_template21 = "\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);\" maxlength=\"7\">\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t  \t</tr>\r\n\t\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">성별(나이)</td>\r\n\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template22 = "<input name=\"OWNER_GENDER\" type=\"radio\" value=\"1\" checked>남<input name=\"OWNER_GENDER\" type=\"radio\" value=\"2\">여";
  private final static String _jspx_template23 = "\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template24 = "<input name=\"OWNER_GENDER\" type=\"radio\" value=\"1\">남<input name=\"OWNER_GENDER\" type=\"radio\" value=\"2\" checked>여";
  private final static String _jspx_template25 = "\r\n\t\t\t\t\t\t\t\t&nbsp;( <input name=\"OWNER_AGE\" class=\"input_form1\" type=\"text\" style=\"width:20px\" maxlength=\"3\" value=\"";
  private final static String _jspx_template26 = "\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);\"> 세)\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t  \t</tr>\r\n\t\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">전화번호</td>\r\n\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t<input name=\"OWNER_TEL1\" value=\"";
  private final static String _jspx_template27 = "\" type=\"text\" class=\"input_form1\" style=\"width:25px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, OWNER_TEL2, 3);\" maxlength=\"3\"> - \r\n\t\t\t\t\t\t\t\t<input name=\"OWNER_TEL2\" value=\"";
  private final static String _jspx_template28 = "\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, OWNER_TEL3, 4);\" maxlength=\"4\"> - \r\n\t\t\t\t\t\t\t\t<input name=\"OWNER_TEL3\" value=\"";
  private final static String _jspx_template29 = "\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, OWNER_HP1, 4);\" maxlength=\"4\">\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">휴대전화</td>\r\n\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t<input name=\"OWNER_HP1\" value=\"";
  private final static String _jspx_template30 = "\" type=\"text\" class=\"input_form1\" style=\"width:25px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, OWNER_HP2, 3);\" maxlength=\"3\"> - \r\n\t\t\t\t\t\t\t\t<input name=\"OWNER_HP2\" value=\"";
  private final static String _jspx_template31 = "\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, OWNER_HP3, 4);\" maxlength=\"4\"> - \r\n\t\t\t\t\t\t\t\t<input name=\"OWNER_HP3\" value=\"";
  private final static String _jspx_template32 = "\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);\" maxlength=\"4\">\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t  \t</tr>\r\n\t\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t\t<td height=\"34\" colspan=\"2\" align=\"left\" bgcolor=\"#FFFFFF\" class=\"\">\r\n\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t  <td width=\"50%\">\r\n\t\t\t\t\t\t\t\t\t  \t<span class=\"sub_stan_blue\">* 주민등록지 주소</span>\r\n\t\t\t\t\t\t\t\t\t  </td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t<td height=\"34\" colspan=\"2\" align=\"left\" bgcolor=\"#FFFFFF\" class=\"\">\r\n\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t  <td width=\"50%\">\r\n\t\t\t\t\t\t\t\t\t  \t<span class=\"sub_stan_blue\">* 실제거주지 : </span>\r\n\t\t\t\t\t\t\t\t\t  \t";
  private final static String _jspx_template33 = "\r\n\t\t\t\t\t\t\t\t\t  \t\t<input name=\"ADDR_CHECK1\" type=\"checkbox\" onclick=\"javascript:Jumin_toaddr_Check()\"  value=\"1\" checked>\r\n\t\t\t\t\t\t\t\t\t  \t";
  private final static String _jspx_template34 = "\r\n\t\t\t\t\t\t\t\t\t  \t";
  private final static String _jspx_template35 = "\r\n\t\t\t\t\t\t\t\t\t  \t\t<input name=\"ADDR_CHECK1\" type=\"checkbox\" onclick=\"javascript:Jumin_toaddr_Check()\" value=\"0\">\r\n\t\t\t\t\t\t\t\t\t  \t";
  private final static String _jspx_template36 = "\r\n\t\t\t\t\t\t\t\t\t  \t주민등록지 주소 정보와 동일 \r\n\t\t\t\t\t\t\t\t\t  </td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t  \t</tr>\r\n\t\t\t\t\t  \t<!--  //********** BEGIN_현진_20120212 -->\r\n                        <!-- \r\n\t\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">우편번호</td>\r\n\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t  <td><input name=\"OWNER_POST\" type=\"text\" style=\"width:50px\" onFocus=\"Jumin_toaddr_Check();\" onKeyPress=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template37 = "\" readonly class=\"input_form1\"></td>\r\n\t\t\t\t\t\t\t\t\t  <td><a href=\"javascript:openZipcodePopup_new('form.OWNER_POST', 'form.OWNER_ADDR1', 'form.ADDR1_NEW', 'form.SI', 'form.GUN', 'form.DORO_NM', 'form.BD_NM');\"><img src=\"/img/search_icon.gif\" alt=\"검색\" width=\"56\" height=\"18\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">우편번호</td>\r\n\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n  \t\t\t\t\t\t\t\t\t  <td><input name=\"OWNER_TOPOST\" type=\"text\" style=\"width:50px\" onFocus=\"Jumin_toaddr_Check();\" onKeyPress=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template38 = "\" readonly  class=\"essential\"></td>\r\n\t\t\t\t\t\t\t\t\t  <td><a href=\"javascript:openZipcodePopup_new('form.OWNER_TOPOST', 'form.OWNER_TOADDR1', 'form.TOADDR1_NEW', 'form.TOSI', 'form.TOGUN', 'form.TODORO_NM', 'form.TOBD_NM');\"><img src=\"/img/search_icon.gif\" alt=\"검색\" width=\"56\" height=\"18\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t  \t</tr>\r\n\t\t\t\t\t\t-->\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">우편번호</td>\r\n\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t  \t<td width=\"50px\"><input name=\"OWNER_POST\" id=\"OWNER_POST\" type=\"text\" style=\"width:50px\" onFocus=\"Jumin_toaddr_Check();\" onKeyPress=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template39 = "\" readonly class=\"input_form1\"></td>\r\n\t\t\t\t\t\t\t\t\t  \t<td width=\"50px\"><a href=\"javascript:openZipcodePopup_new('form.OWNER_POST', 'form.OWNER_ADDR1', 'form.ADDR1_NEW', 'form.SI', 'form.GUN', 'form.DORO_NM', 'form.BD_NM','form.DONG','form.OWNER_BONBUN', 'form.OWNER_BUBUN' );\"><img src=\"/img/search_icon.gif\" alt=\"검색\" width=\"56\" height=\"18\" border=\"0\"></a></td>\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t<!--  sungh83 20131105 -->\r\n\t\t\t\t\t\t\t\t\t\t<td height =\"13\">%도로명주소건물본번,부번을입력시확인클릭</td>\r\n\t\t\t\t\t\t\t     \t\t<!--  sungh83 20131105 --> \r\n\t\t\t\t\t\t\t\t\t\t<td align=\"right\"><a href=\"javascript:addrConfirm('OWNER_POST','SI','GUN','DONG','DORO_NM','OWNER_BONBUN','OWNER_BUBUN','BD_BON','BD_BU','BD_NM','BD_DET_NM','OWNER_ADDR1','OWNER_ADDR2','ADDR1_NEW','form')\"><img src=\"/img/ok_icon.gif\" alt=\"확인\" width=\"56\" height=\"18\" border=\"0\"></a></td>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  \r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">우편번호</td>\r\n\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n  \t\t\t\t\t\t\t\t\t  \t<td width=\"50px\"><input name=\"OWNER_TOPOST\" id=\"OWNER_TOPOST\" type=\"text\" style=\"width:50px\" onFocus=\"Jumin_toaddr_Check();\" onKeyPress=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template40 = "\" readonly  class=\"essential\"></td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"50px\"><a href=\"javascript:openZipcodePopup_new('form.OWNER_TOPOST', 'form.OWNER_TOADDR1', 'form.TOADDR1_NEW', 'form.TOSI', 'form.TOGUN', 'form.TODORO_NM', 'form.TOBD_NM','form.TDONG', 'form.OWNER_TOBONBUN', 'form.OWNER_TOBUBUN');\"><img src=\"/img/search_icon.gif\" alt=\"검색\" width=\"56\" height=\"18\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t\t\t\t\t<!--  sungh83 20131105 -->\r\n\t\t\t\t\t\t\t\t\t\t<td height =\"13\">%도로명주소건물본번,부번을입력시확인클릭</td>\r\n\t\t\t\t\t\t\t      \t\t<!--  sungh83 20131105 --> \r\n\t\t\t\t\t\t\t\t\t\t<td align=\"right\"><a href=\"javascript:addrConfirm('OWNER_TOPOST','TOSI','TOGUN','TDONG','TODORO_NM','OWNER_TOBONBUN','OWNER_TOBUBUN','TOBD_BON','TOBD_BU','TOBD_NM','TOBD_DET_NM','OWNER_TOADDR1','OWNER_TOADDR2','TOADDR1_NEW','form')\"><img src=\"/img/ok_icon.gif\" alt=\"확인\" width=\"56\" height=\"18\" border=\"0\"></a></td>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   \r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t  \t</tr>\r\n\t\t\t\t\t\t<!--   //********** END_현진_20120212 -->\t\t\t\t\t  \t\r\n\t\t\t\t\t  \t<tr>\r\n\t\t\t\t\t  \t <!-- 주민등록지 기본 주소 -->\r\n\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">기본 주소";
  private final static String _jspx_template41 = "</td>\r\n\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t<input id=\"OWNER_ADDR1\" name=\"OWNER_ADDR1\" type=\"text\" class=\"input_form1\" style=\"width:250px\" onFocus=\"Jumin_toaddr_Check();\" onKeyPress=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template42 = "\" readonly>\r\n\t\t\t\t\t\t\t\t산\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template43 = "\r\n\t\t\t\t\t\t\t\t\t<input type=\"checkbox\"  class=\"input_form1\" name=\"OWNER_SAN\" onclick=\"Jumin_toaddr_Check();\"  onFocus=\"Jumin_toaddr_Check();\" onKeyPress=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template44 = "\" checked=\"checked\">\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template45 = "\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template46 = "\r\n\t\t\t\t\t\t\t\t\t<input type=\"checkbox\"  class=\"input_form1\" name=\"OWNER_SAN\" onclick=\"Jumin_toaddr_Check();\"  onFocus=\"Jumin_toaddr_Check();\" onKeyPress=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template47 = "\">\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template48 = "\r\n\t\t\t\t\t\t\t\t<input id=\"OWNER_BONBUN\" name=\"OWNER_BONBUN\" value=\"";
  private final static String _jspx_template49 = "\" type=\"text\" class=\"input_form1\" style=\"width:27px\" style=\"ime-mode:disabled\" onKeyUp=\"Jumin_toaddr_Check(); nr_num_int(this); count_check(this, OWNER_BONBUN, 4);\" onKeyPress=\"Jumin_toaddr_Check(); nr_num_int(this); count_check(this, OWNER_BONBUN, 4);\" maxlength=\"4\">\r\n\t\t\t\t\t\t\t\t- <input id=\"OWNER_BUBUN\" name=\"OWNER_BUBUN\" value=\"";
  private final static String _jspx_template50 = "\" type=\"text\" class=\"input_form1\" style=\"width:27px\" style=\"ime-mode:disabled\" onKeyUp=\"Jumin_toaddr_Check(); nr_num_int(this); count_check(this, OWNER_BUBUN, 4);\" onKeyPress=\"Jumin_toaddr_Check(); nr_num_int(this); count_check(this, OWNER_BUBUN, 4);\" maxlength=\"4\">\r\n\t\t\t\t\t\t\t\t<input id=\"OWNER_ADDR2\" name=\"OWNER_ADDR2\" type=\"text\" class=\"input_form1\" style=\"width:130px\" value=\"";
  private final static String _jspx_template51 = "\" onKeyUp=\"Jumin_toaddr_Check();\" maxlength=\"50\">\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t<!-- 실제거주지 기본 주소 -->\r\n\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">기본 주소</td>\r\n\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t<input id=\"OWNER_TOADDR1\" name=\"OWNER_TOADDR1\" type=\"text\" class=\"essential\" style=\"width:250px\" onFocus=\"Jumin_toaddr_Check();\" onKeyPress=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template52 = "\" readonly>\r\n\t\t\t\t\t\t\t\t산\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template53 = "\r\n\t\t\t\t\t\t\t\t\t<input type=\"checkbox\"  class=\"input_form1\" name=\"OWNER_TOSAN\" onclick=\"Jumin_toaddr_Check();\"  onFocus=\"Jumin_toaddr_Check();\" onKeyPress=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template54 = "\" checked=\"checked\">\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template55 = "\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template56 = "\r\n\t\t\t\t\t\t\t\t\t<input type=\"checkbox\"  class=\"input_form1\" name=\"OWNER_TOSAN\" onclick=\"Jumin_toaddr_Check();\"  onFocus=\"Jumin_toaddr_Check();\" onKeyPress=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" value=\"";
  private final static String _jspx_template57 = "\">\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template58 = "\r\n\t\t\t\t\t\t\t\t<input id=\"OWNER_TOBONBUN\" name=\"OWNER_TOBONBUN\" value=\"";
  private final static String _jspx_template59 = "\" type=\"text\" class=\"essential\" style=\"width:27px\" style=\"ime-mode:disabled\" onKeyUp=\"Jumin_toaddr_Check(); nr_num_int(this); count_check(this, OWNER_TOBONBUN, 4);\" onKeyPress=\"Jumin_toaddr_Check(); nr_num_int(this); count_check(this, OWNER_TOBONBUN, 4);\" maxlength=\"4\">\r\n\t\t\t\t\t\t\t\t- <input id=\"OWNER_TOBUBUN\" name=\"OWNER_TOBUBUN\" value=\"";
  private final static String _jspx_template60 = "\" type=\"text\" class=\"input_form1\" style=\"width:27px\" style=\"ime-mode:disabled\" onKeyUp=\"Jumin_toaddr_Check(); nr_num_int(this); count_check(this, OWNER_TOBUBUN, 4);\" onKeyPress=\"Jumin_toaddr_Check(); nr_num_int(this); count_check(this, OWNER_TOBUBUN, 4);\" maxlength=\"4\">\r\n\t\t\t\t\t\t\t\t<input id=\"OWNER_TOADDR2\" name=\"OWNER_TOADDR2\" type=\"text\" class=\"input_form1\" style=\"width:130px\" value=\"";
  private final static String _jspx_template61 = "\" onFocus=\"Jumin_toaddr_Check();\" onKeyPress=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" maxlength=\"50\">\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t  \t</tr>\r\n\t\t\t\t\t  \t<tr>\r\n\t\t\t\t\t  \t<!-- 주민등록지 도로명 새주소 -->\r\n\t\t\t\t\t\t\t<td height=\"45px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">도로명 주소</td>\r\n\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t<!--  //********** BEGIN_KANG_20120424 -->\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t<!--  //********** BEGIN_현진_20120309 -->\r\n\t\t\t\t\t\t\t\t<!-- <input id=\"ADDR1_NEW\" name=\"ADDR1_NEW\" type=\"text\" value=\"";
  private final static String _jspx_template62 = " ";
  private final static String _jspx_template63 = " ";
  private final static String _jspx_template64 = "\" class=\"essential\" style=\"width:250px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  readonly> -->\r\n\t\t\t\t\t\t\t\t<input id=\"ADDR1_NEW\" name=\"ADDR1_NEW\" type=\"text\" ";
  private final static String _jspx_template65 = "value=\"";
  private final static String _jspx_template66 = " ";
  private final static String _jspx_template67 = " ";
  private final static String _jspx_template68 = "\"";
  private final static String _jspx_template69 = " class=\"essential\" style=\"width:250px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  readonly>\r\n\t\t\t\t\t\t\t\t<!--   //********** END_현진_20120309 -->\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t<!--   //********** END_KANG_20120424 -->\r\n\t\t \t\t\t\t\t\t<!--  //********** BEGIN_현진_20120212 -->\r\n\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"SI\" name=\"SI\" value=\"";
  private final static String _jspx_template70 = "\">\r\n\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"GUN\" name=\"GUN\" value=\"";
  private final static String _jspx_template71 = "\">\r\n\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"DORO_NM\" name=\"DORO_NM\" value=\"";
  private final static String _jspx_template72 = "\">\r\n\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"DONG\" name=\"DONG\" value=\"";
  private final static String _jspx_template73 = "\">\r\n\t\t\t\t\t\t\t\t<!--   //********** END_현진_20120212 -->\r\n\t\t\t\t\t\t\t\t<!--  //********** BEGIN_현진_20120330 -->\r\n\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"RI\" name=\"RI\" value=\"";
  private final static String _jspx_template74 = "\">\r\n\t\t\t\t\t\t\t\t<!--   //********** END_현진_20120330 -->\r\n\t\t\t\t\t\t\t\t<!--  //********** BEGIN_KANG_20120424 -->\r\n\t\t\t\t\t\t\t\t<!-- \r\n\t\t\t\t\t\t\t\t<input id=\"BD_BON\" name=\"BD_BON\" type=\"text\" VALUE=\"";
  private final static String _jspx_template75 = "\" class=\"essential\" style=\"width:25px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" >\r\n\t\t\t\t\t\t\t\t-\r\n\t\t\t\t\t\t\t\t<input id=\"BD_BU\" name=\"BD_BU\" type=\"text\" VALUE=\"";
  private final static String _jspx_template76 = "\" class=\"input_form1\" style=\"width:25px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  >\r\n\t\t\t\t\t\t\t\t<input id=\"BD_NM\" name=\"BD_NM\" type=\"text\" VALUE=\"";
  private final static String _jspx_template77 = "\" class=\"input_form1\" style=\"width:135px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  maxlength=\"50\">\r\n\t\t\t\t\t\t\t\t<input id=\"BD_DET_NM\" name=\"BD_DET_NM\" type=\"text\" VALUE=\"";
  private final static String _jspx_template78 = "\" class=\"input_form1\" style=\"width:135px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  maxlength=\"50\">\r\n\t\t\t\t\t\t\t\t -->\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template79 = " \r\n\t\t\t\t\t\t\t\t<input id=\"BD_BON\" name=\"BD_BON\" type=\"text\" VALUE=\"";
  private final static String _jspx_template80 = "\" class=\"essential\" style=\"width:25px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" >\r\n\t\t\t\t\t\t\t\t-\r\n\t\t\t\t\t\t\t\t<input id=\"BD_BU\" name=\"BD_BU\" type=\"text\" VALUE=\"";
  private final static String _jspx_template81 = "\" class=\"input_form1\" style=\"width:25px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  >\r\n\t\t\t\t\t\t\t\t<input id=\"BD_NM\" name=\"BD_NM\" type=\"text\" VALUE=\"";
  private final static String _jspx_template82 = "\" class=\"input_form1\" style=\"width:135px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  maxlength=\"50\">\r\n\t\t\t\t\t\t\t\t<input id=\"BD_DET_NM\" name=\"BD_DET_NM\" type=\"text\" VALUE=\"";
  private final static String _jspx_template83 = "\" class=\"input_form1\" style=\"width:135px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  maxlength=\"50\">\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template84 = "\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template85 = " \r\n\t\t\t\t\t\t\t\t<input id=\"BD_BON\" name=\"BD_BON\" type=\"text\" VALUE=\"\" class=\"essential\" style=\"width:25px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" >\r\n\t\t\t\t\t\t\t\t-\r\n\t\t\t\t\t\t\t\t<input id=\"BD_BU\" name=\"BD_BU\" type=\"text\" VALUE=\"\" class=\"input_form1\" style=\"width:25px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  >\r\n\t\t\t\t\t\t\t\t<input id=\"BD_NM\" name=\"BD_NM\" type=\"text\" VALUE=\"\" class=\"input_form1\" style=\"width:135px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  maxlength=\"50\">\r\n\t\t\t\t\t\t\t\t<input id=\"BD_DET_NM\" name=\"BD_DET_NM\" type=\"text\" VALUE=\"\" class=\"input_form1\" style=\"width:135px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  maxlength=\"50\">\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template86 = "\r\n\t\t\t\t\t\t\t\t<!--   //********** END_KANG_20120424 -->\t\t\t\t\t\t\t\t\r\n\t \t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t<!-- 실제거주지 도로명 새주소 -->\r\n\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">도로명 주소</td>\r\n\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t<!--  //********** BEGIN_현진_20120309 -->\r\n\t\t\t\t\t\t\t\t<!--  //********** BEGIN_KANG_20120424 -->\r\n\t\t\t\t\t\t\t\t<!-- <input id=\"TOADDR1_NEW\" name=\"TOADDR1_NEW\" type=\"text\" value=\"";
  private final static String _jspx_template87 = " ";
  private final static String _jspx_template88 = " ";
  private final static String _jspx_template89 = "\" class=\"essential\" style=\"width:250px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  readonly> -->\r\n\t\t\t\t\t\t\t\t<input id=\"TOADDR1_NEW\" name=\"TOADDR1_NEW\" type=\"text\" ";
  private final static String _jspx_template90 = "value=\"";
  private final static String _jspx_template91 = " ";
  private final static String _jspx_template92 = " ";
  private final static String _jspx_template93 = "\"";
  private final static String _jspx_template94 = " class=\"essential\" style=\"width:250px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  readonly>\r\n\t\t\t\t\t\t\t\t<!--   //********** END_KANG_20120424 -->\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t<!--   //********** END_현진_20120309 -->\t\t\t\t\t\t\t\t\r\n\t\t \t\t\t\t\t\t<!--  //********** BEGIN_현진_20120212 -->\t \t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"TOSI\" name=\"TOSI\" value=\"";
  private final static String _jspx_template95 = "\"/>\r\n\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"TOGUN\" name=\"TOGUN\" value=\"";
  private final static String _jspx_template96 = "\"/>\r\n\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"TODORO_NM\" name=\"TODORO_NM\" value=\"";
  private final static String _jspx_template97 = "\"/>\r\n\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"TDONG\" name=\"TDONG\" value=\"";
  private final static String _jspx_template98 = "\"/>\r\n\t\t\t\t\t\t\t\t<!--   //********** END_현진_20120212 -->\t\r\n\t \t\t\t\t\t\t\t<!--  //********** BEGIN_현진_20120330 -->\r\n\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"T_RI\" name=\"T_RI\" value=\"";
  private final static String _jspx_template99 = "\" />\r\n\t\t\t\t\t\t\t\t<!--   //********** END_현진_20120330 -->\r\n\t\t\t\t\t\t\t\t<!--  //********** BEGIN_KANG_20120424 -->\r\n\t\t\t\t\t\t\t\t<!-- \r\n\t\t\t\t\t\t\t\t<input id=\"TOBD_BON\" name=\"TOBD_BON\" type=\"text\" value=\"";
  private final static String _jspx_template100 = "\" class=\"essential\" style=\"width:25px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" >\r\n\t\t\t\t\t\t\t\t-\r\n\t\t\t\t\t\t\t\t<input id=\"TOBD_BU\" name=\"TOBD_BU\" type=\"text\" value=\"";
  private final static String _jspx_template101 = "\" class=\"input_form1\" style=\"width:25px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  >\r\n\t\t\t\t\t\t\t\t<input id=\"TOBD_NM\" name=\"TOBD_NM\" type=\"text\" value=\"";
  private final static String _jspx_template102 = "\" class=\"input_form1\" style=\"width:135px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  maxlength=\"50\">\r\n\t\t\t\t\t\t\t\t<input id=\"TOBD_DET_NM\" name=\"TOBD_DET_NM\" type=\"text\" value=\"";
  private final static String _jspx_template103 = "\" class=\"input_form1\" style=\"width:135px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  maxlength=\"50\">\r\n\t\t\t\t\t\t\t\t -->\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template104 = "\r\n\t\t\t\t\t\t\t\t<input id=\"TOBD_BON\" name=\"TOBD_BON\" type=\"text\" value=\"";
  private final static String _jspx_template105 = "\" class=\"essential\" style=\"width:25px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" >\r\n\t\t\t\t\t\t\t\t-\r\n\t\t\t\t\t\t\t\t<input id=\"TOBD_BU\" name=\"TOBD_BU\" type=\"text\" value=\"";
  private final static String _jspx_template106 = "\" class=\"input_form1\" style=\"width:25px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  >\r\n\t\t\t\t\t\t\t\t<input id=\"TOBD_NM\" name=\"TOBD_NM\" type=\"text\" value=\"";
  private final static String _jspx_template107 = "\" class=\"input_form1\" style=\"width:135px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  maxlength=\"50\">\r\n\t\t\t\t\t\t\t\t<input id=\"TOBD_DET_NM\" name=\"TOBD_DET_NM\" type=\"text\" value=\"";
  private final static String _jspx_template108 = "\" class=\"input_form1\" style=\"width:135px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  maxlength=\"50\">\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template109 = "\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template110 = "\r\n\t\t\t\t\t\t\t\t<input id=\"TOBD_BON\" name=\"TOBD_BON\" type=\"text\" value=\"\" class=\"essential\" style=\"width:25px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\" >\r\n\t\t\t\t\t\t\t\t-\r\n\t\t\t\t\t\t\t\t<input id=\"TOBD_BU\" name=\"TOBD_BU\" type=\"text\" value=\"\" class=\"input_form1\" style=\"width:25px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  >\r\n\t\t\t\t\t\t\t\t<input id=\"TOBD_NM\" name=\"TOBD_NM\" type=\"text\" value=\"\" class=\"input_form1\" style=\"width:135px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  maxlength=\"50\">\r\n\t\t\t\t\t\t\t\t<input id=\"TOBD_DET_NM\" name=\"TOBD_DET_NM\" type=\"text\" value=\"\" class=\"input_form1\" style=\"width:135px\" onClick=\"Jumin_toaddr_Check();\" onChange=\"Jumin_toaddr_Check();\" onFocus=\"Jumin_toaddr_Check();\" onKeyUp=\"Jumin_toaddr_Check();\"  maxlength=\"50\">\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template111 = "\r\n\t\t\t\t\t\t\t\t<!--   //********** END_KANG_20120424 -->\t\t\t\t\t\t\t\t\r\n\t \t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t  \t</tr>\r\n\t\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t  \t<td height=\"34\" colspan=\"4\" align=\"left\" bgcolor=\"#FFFFFF\" class=\"\">\r\n\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t  <td width=\"50%\">\r\n\t\t\t\t\t\t\t\t\t  \t<span class=\"sub_stan_blue\">* 생활정도</span>\r\n\t\t\t\t\t\t\t\t\t  </td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" nowrap=\"nowrap\">생활정도</td>\r\n\t\t\t\t\t\t\t<td width=\"37%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" nowrap=\"nowrap\">\r\n\t\t\t\t\t\t\t\t<select name=\"LC_SEL\" style=\"width:70px\" class=\"input_form1\">\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template112 = "\r\n\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t<input name=\"LC_TXT\" type=\"text\" class=\"input_form1\" style=\"width:180px\" value=\"";
  private final static String _jspx_template113 = "\" maxlength=\"25\">\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" nowrap=\"nowrap\">주거정보</td>\r\n\t\t\t\t\t\t\t<td width=\"36%\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t<select name=\"RT_SEL\" style=\"width:70px\" class=\"input_form1\">\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template114 = "\r\n\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t<input name=\"RT_TXT\" type=\"text\" class=\"input_form1\" style=\"width:180px\" value=\"";
  private final static String _jspx_template115 = "\" maxlength=\"25\">\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" nowrap=\"nowrap\">동산/부동산</td>\r\n\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" nowrap=\"nowrap\" colspan=\"3\">\r\n\t\t\t\t\t\t\t\t<input name=\"ESTATE_MOVE\" type=\"text\" class=\"input_form1\" style=\"width:90px\" value=\"";
  private final static String _jspx_template116 = "\" maxlength=\"15\" onKeyDown=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);  comma_paste(this);\" onKeyPress=\"nr_num_int(this);\"> 원 / \r\n\t\t\t\t\t\t\t\t<input name=\"ESTATE_REAL\" type=\"text\" class=\"input_form1\" style=\"width:90px\" value=\"";
  private final static String _jspx_template117 = "\" maxlength=\"15\" onKeyDown=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);  comma_paste(this);\" onKeyPress=\"nr_num_int(this);\"> 원\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" nowrap=\"nowrap\">비고</td>\r\n\t\t\t\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t        <textarea name=\"NOTE\" id=\"NOTE\" class=\"input_form1\" style=\"width:98%\" onkeyup=\"displayBytes(500, 'NOTE');\">";
  private final static String _jspx_template118 = "</textarea>\r\n\t\t     \t\t\t\t</td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\r\n\t                  \t</table>\r\n\t                  \t</td>\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"40\" align=\"right\">\r\n\t\t\t\t  \t\t<a href=\"javascript:Cancel('";
  private final static String _jspx_template119 = "')\"><img src=\"/img/can_icon.gif\" alt=\"취소\" width=\"56\" height=\"18\" border=\"0\"></a>\r\n\t\t\t\t  \t\t<a href=\"javascript:ModifyPrc()\"><img src=\"/img/save_icon2.gif\" alt=\"저장\" width=\"56\" height=\"18\" border=\"0\"></a>\r\n\t\t\t\t  \t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t</table>\r\n\t\t\t</td>\r\n\t\t</tr>\r\n\t</table>\r\n\r\n</form>\r\n</body>\r\n</html>\r\n";
}
