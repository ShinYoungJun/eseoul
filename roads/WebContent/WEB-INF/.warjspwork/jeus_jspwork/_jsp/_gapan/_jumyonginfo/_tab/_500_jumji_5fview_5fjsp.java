package jeus_jspwork._jsp._gapan._jumyonginfo._tab;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_jumji_5fview_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(44,15);to=(44,24)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${filePath }",java.lang.String.class , pageContext.getVariableResolver(), null));

      // jsp code [from=(44,27);to=(44,47)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SHOP_IMG_NAME }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(74,52);to=(74,60)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${WITH_PNU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(74,78);to=(74,85)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${X_COORD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(74,103);to=(74,110)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${Y_COORD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(96,62);to=(96,70)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(97,60);to=(97,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GU_CODE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(119,82);to=(119,98)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TAX_SET_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(126,17);to=(126,35)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.MUL_FROMDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(126,41);to=(126,57)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.MUL_TODATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(135,54);to=(135,58)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADDR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_0_fn(pageContext, null)) return;


      out.write(_jspx_template26);
      // jsp code [from=(153,15);to=(153,30)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.WITH_ADDR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // jsp code [from=(156,136);to=(156,140)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SIDO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template28);
      // jsp code [from=(156,146);to=(156,153)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SIGU_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template29);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_2_fn(pageContext, null)) return;


      out.write(_jspx_template32);
      // jsp code [from=(190,54);to=(190,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.WITH_INFO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template33);
      // jsp code [from=(194,54);to=(194,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ROAD_INFO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template34);
      // jsp code [from=(199,12);to=(199,27)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.AR_SEL_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template35);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_3_fn(pageContext, null)) return;


      out.write(_jspx_template37);
      // jsp code [from=(201,12);to=(201,24)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.AR_TXT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template38);
      // jsp code [from=(209,17);to=(209,33)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.FOUND_DATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template39);
      // jsp code [from=(217,11);to=(217,26)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.UC_SEL_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template40);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_4_fn(pageContext, null)) return;


      // jsp code [from=(217,104);to=(217,116)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.UC_TXT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template42);
      // jsp code [from=(221,11);to=(221,44)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(board.SF_VALUE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

      out.write(_jspx_template43);
      // jsp code [from=(226,12);to=(226,27)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.FT_TYP_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template44);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_5_fn(pageContext, null)) return;


      // jsp code [from=(226,108);to=(226,123)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.FT_SEL_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template46);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_6_fn(pageContext, null)) return;


      out.write(_jspx_template51);
      // jsp code [from=(240,12);to=(240,27)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.CHANGE_YM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template52);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_7_fn(pageContext, null)) return;


      out.write(_jspx_template54);
      // jsp code [from=(251,12);to=(251,27)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.CHANGE_YM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template55);
      // jsp code [from=(268,12);to=(268,27)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SG_TYP_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template56);
      // jsp code [from=(274,12);to=(274,27)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SG_ITM_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template57);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_8_fn(pageContext, null)) return;


      out.write(_jspx_template60);
      // jsp code [from=(280,12);to=(280,25)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.MEM_NUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template61);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_9_fn(pageContext, null)) return;


      out.write(_jspx_template63);
      // jsp code [from=(288,12);to=(288,27)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OPEN_TIME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template64);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_10_fn(pageContext, null)) return;


      out.write(_jspx_template66);
      // jsp code [from=(295,18);to=(295,35)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PERMIT_DATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template67);
      // jsp code [from=(302,54);to=(302,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.DAY_SALES}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template68);
      // jsp code [from=(308,108);to=(308,119)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.NOTES}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template69);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_11_fn(pageContext, null)) return;


      out.write(_jspx_template72);

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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.WITH_DORO_NM != null && board.WITH_DORO_NM != ''}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template21);
          // jsp code [from=(139,14);to=(139,32)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.WITH_DORO_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template22);
          // jsp code [from=(140,14);to=(140,31)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.WITH_BD_BON}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template23);
          // ----  c:if ---- invoke //
          if (_jspx_th_c_if_1_fn(pageContext, _jspx_th_c_if_0)) return true;


          out.write(_jspx_template25);

        } while (_jspx_th_c_if_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_0.release();
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
    _jspx_th_c_if_2.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SHOP_IMG_NAME != null }", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
      if (_jspx_eval_c_if_2 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template30);
          // jsp code [from=(181,25);to=(181,34)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${filePath }",java.lang.String.class , pageContext.getVariableResolver(), null));

          // jsp code [from=(181,37);to=(181,57)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SHOP_IMG_NAME }",java.lang.String.class , pageContext.getVariableResolver(), null));

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
    _jspx_th_c_if_3.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.AR_SEL_NM != null && board.AR_TXT != null}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
      if (_jspx_eval_c_if_3 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template36);

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
    _jspx_th_c_if_4.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.UC_SEL_NM != null && board.UC_TXT != null}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
      if (_jspx_eval_c_if_4 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template41);

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
    _jspx_th_c_if_5.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.FT_SEL_NM != null && board.FT_SEL_NM != null}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
      if (_jspx_eval_c_if_5 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template45);

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
    _jspx_th_c_if_6.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PLACE_L != null}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
      if (_jspx_eval_c_if_6 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template47);
          // jsp code [from=(231,15);to=(231,28)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PLACE_L}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template48);
          // jsp code [from=(231,36);to=(231,49)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PLACE_H}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template49);
          // jsp code [from=(231,57);to=(231,70)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PLACE_A}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template50);

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
    _jspx_th_c_if_7.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.facility_No!= null && board.facility_No != ''}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_7 = _jspx_th_c_if_7.doStartTag();
      if (_jspx_eval_c_if_7 != Tag.SKIP_BODY) {
        do {
          // jsp code [from=(247,80);to=(247,95)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.FT_TYP_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template53);
          // jsp code [from=(247,101);to=(247,118)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.facility_No}",java.lang.String.class , pageContext.getVariableResolver(), null));


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
    _jspx_th_c_if_8.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SG_SEL_NM != null}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_8 = _jspx_th_c_if_8.doStartTag();
      if (_jspx_eval_c_if_8 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template58);
          // jsp code [from=(275,55);to=(275,70)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SG_SEL_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template59);

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
    _jspx_th_c_if_9.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.MEM_NUM != null}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_9 = _jspx_th_c_if_9.doStartTag();
      if (_jspx_eval_c_if_9 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template62);

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
    _jspx_th_c_if_10.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OPEN_TIME != null}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_10 = _jspx_th_c_if_10.doStartTag();
      if (_jspx_eval_c_if_10 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template65);
          // jsp code [from=(289,55);to=(289,71)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.CLOSE_TIME}",java.lang.String.class , pageContext.getVariableResolver(), null));


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
    _jspx_th_c_if_11.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SECTION != '폐쇄'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_11 = _jspx_th_c_if_11.doStartTag();
      if (_jspx_eval_c_if_11 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template70);
          // jsp code [from=(321,41);to=(321,49)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template71);

        } while (_jspx_th_c_if_11.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_11.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_11.release();
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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.WITH_BD_BU != '0' && board.WITH_BD_BU != null}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
      if (_jspx_eval_c_if_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template24);
          // jsp code [from=(141,83);to=(141,99)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.WITH_BD_BU}",java.lang.String.class , pageContext.getVariableResolver(), null));


        } while (_jspx_th_c_if_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_1.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_1.release();
    }
    return false;
  }

  private static jeus.servlet.jsp.el.FunctionMapperImpl _jspx_fnmap_0;
  
  static {
    _jspx_fnmap_0 = jeus.servlet.jsp.el.FunctionMapperImpl.getInstance();
    _jspx_fnmap_0.mapFunction("rnic:insertComma2", main.java.common.util.StringUtil.class, "insertComma2", new Class[] {java.lang.String.class});

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
  private final static String _jspx_template9 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n";
  private final static String _jspx_template10 = "\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n<script type=\"text/javascript\">\r\n//<![CDATA[\r\n\r\n\tfunction Modify(gapanno)\r\n\t{\r\n\t\tvar form = document.form;\r\n\r\n\t\tform.action = \"/gapan/jumyonginfo/jumji_modify.do?GAPAN_NO=\"+gapanno;\r\n\t\tform.submit();\r\n\t}\r\n\r\n\tfunction \tInit()\r\n\t{\r\n\t\tparent.Tab_Img(\"jumji\");\r\n\t\t//IFRM_PurposeCode.PURPOSE_CD.className=\"view\";\r\n\r\n\t\tvar tabDown = parent.document.getElementById('tabDown');\r\n\t\ttabDown.contentWindow.location.reload(true);\r\n\t}\r\n\r\n\t\r\n\tvar w, h;\r\n\tvar max_w = 150; //창의 가로크기, 이미지의 최대 크기가 된다.\r\n\timg_src = \"";
  private final static String _jspx_template11 = "\"; //이미지의 주소, img1의 src속성과 같아야 한다.\r\n\t\r\n\tfunction img_resize()\r\n\t{\r\n\t\tvar i = eval(document.all.img1);\r\n\t \tw = i.width;\r\n\t \th = i.height;\r\n\t\tif(w > max_w)\r\n\t \t{\r\n\t  \t\ti.width = max_w;\r\n\t \t}\r\n\t}\r\n\t\r\n\t\r\n\tfunction resize_popup()\r\n\t{\r\n\t \tw_dummy = w + 20; //스크롤바를 위해서 팝업창의 가로길이를 20픽셀 추가한다.\r\n\t \twith( window.open(\"\",\"madi_image\",'height='+h+',width='+w_dummy+',scrollbars=yes,resizable=yes') )\r\n\t \t{\r\n\t  \tdocument.write(\"<body topmargin=0 rightmargin=0 bottommargin=0 leftmargin=0>\",\"<a href='#' alt='클릭하시면 창이 닫힙니다.'><img src='\"+img_src+\"' hspace=0 vspace=0 border=0 onclick='window.close();'></a>\",\"</body>\");\r\n\t  \tfocus();\r\n\t \t}\r\n\t}\r\n\r\n\r\n    function jumyongZibun(SIDO, SIGU_CD){\r\n\r\n    \tvar form \t= document.form;\r\n        var\tstr\t\t= \"\";\r\n\r\n        var url = '/gapan/map/mini_map.do?PNU='+'";
  private final static String _jspx_template12 = "'+'&X_COORD='+'";
  private final static String _jspx_template13 = "'+'&Y_COORD='+'";
  private final static String _jspx_template14 = "'+'&TYPE=view';\r\n\r\n        cw=screen.availWidth;\t\r\n        ch=screen.availHeight;\r\n\r\n        sw=800;\r\n        sh=600;\r\n\r\n        ml=(cw-sw)/2;\r\n        mt=(ch-sh)/2;\r\n\r\n        var param = 'width='+sw+',height='+sh+',top='+mt+',left='+ml+',resizable=no, status=no, scrollbars=no, toolbar=no, menubar=no';\r\n\r\n        window.open(url, \"minimap\", param);\r\n    }\r\n\r\n\t\r\n//]]>\r\n</script>\r\n\r\n<body onload=\"Init();\">\r\n<form id=\"form\" name=\"form\" method=\"post\">\r\n\t<input type=\"hidden\" id=\"GAPAN_NO\" name=\"GAPAN_NO\" value=\"";
  private final static String _jspx_template15 = "\">\r\n\t<input type=\"hidden\" id=\"GU_CODE\" name=\"GU_CODE\" value=\"";
  private final static String _jspx_template16 = "\">\r\n<table width=\"780\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t<tr>\r\n\t\t<td align=\"left\" class=\"contborder_blue\">\r\n\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t<tr>\r\n\t\t\t\t<td>\r\n\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse: collapse;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"34\" colspan=\"4\" align=\"left\" bgcolor=\"#FFFFFF\" class=\"sub_table_b\" nowrap=\"nowrap\">\r\n\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\" nowrap=\"nowrap\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td><span class=\"sub_stan_blue\">* 시설 정보</span></td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" nowrap=\"nowrap\">세입구분</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" nowrap=\"nowrap\" colspan=\"3\">";
  private final static String _jspx_template17 = "</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용기간</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"f6f6f6\" class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td>";
  private final static String _jspx_template18 = " ~ ";
  private final static String _jspx_template19 = "</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">인접지 주소</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"f6f6f6\" class=\"table_bl_left\">";
  private final static String _jspx_template20 = "</td>\r\n\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">인접지<br>도로명주소</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"f6f6f6\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template21 = "\r\n\t\t\t\t\t\t\t\t \t\t";
  private final static String _jspx_template22 = "\r\n\t\t\t\t\t\t\t\t \t\t";
  private final static String _jspx_template23 = "\r\n\t\t\t\t\t\t\t\t \t\t";
  private final static String _jspx_template24 = "-";
  private final static String _jspx_template25 = "\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template26 = "\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t \r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" width=\"100\" height=\"26\" nowrap>점용지 주소</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" width=\"37%\" nowrap>\r\n\t\t\t\t\t\t\t\t\t<table>\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td width=\"80%\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template27 = "\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td width=\"100px\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"/img/loca_icon.gif\" alt=\"위치확인\" id=\"LocReg\" width=\"64\" height=\"18\" border=\"0\" onClick=\"javascript:jumyongZibun('";
  private final static String _jspx_template28 = "','";
  private final static String _jspx_template29 = "');\" style=\"CURSOR:pointer;\">\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" rowspan=\"5\" nowrap>\r\n\t\t\t\t\t\t\t\t<table>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td>시설물 사진</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t<br>\r\n\t\t\t\t\t\t\t\t\t\t<br>\r\n\t\t\t\t\t\t\t\t\t\t<span onclick=\"javascript:document.getElementById('file3').click();\" style=\"overflow: hidden; background-repeat: no-repeat; cursor: pointer;\">\r\n\t\t\t\t\t\t\t\t\t\t</span>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" rowspan=\"5\" nowrap=\"nowrap\" align=\"center\">\r\n\t\t\t\t\t\t\t\t<table>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"130\" style=\"background-position: 50% 50%;\">\r\n\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template30 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"";
  private final static String _jspx_template31 = "\" id=\"img1\" name=\"img1\" onload=\"img_resize();\" onclick=\"resize_popup();\" style=\"cursor: hand\">\r\n\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template32 = "\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" height=\"26\">주변정보</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template33 = "</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" height=\"26\">도로정보</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template34 = "</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" height=\"26\">지역정보</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template35 = "\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template36 = " / ";
  private final static String _jspx_template37 = "\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template38 = "\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">설치일자</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td>";
  private final static String _jspx_template39 = "</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" height=\"26\">인접시설</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template40 = " ";
  private final static String _jspx_template41 = " / ";
  private final static String _jspx_template42 = "\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">시설물명 가액</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template43 = "원</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">시설물명/규격</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template44 = " ";
  private final static String _jspx_template45 = " / ";
  private final static String _jspx_template46 = "\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용면적</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template47 = "\r\n\t\t\t\t\t\t  \t\t\t\t";
  private final static String _jspx_template48 = " m × ";
  private final static String _jspx_template49 = " m = ";
  private final static String _jspx_template50 = " ㎡\r\n\t\t\t\t\t\t  \t\t\t";
  private final static String _jspx_template51 = "\r\n\t\t\t\t\t  \t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<!--  //********** BEGIN_KANG_20120423 -->\r\n\t\t\t\t\t\t\t<!-- \r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">교체년도</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template52 = "\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t-->\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">시설물 번호</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template53 = " - ";
  private final static String _jspx_template54 = "\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">교체년도</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template55 = "\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<!--   //********** END_KANG_20120423 -->\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"34\" colspan=\"4\" align=\"left\" bgcolor=\"#FFFFFF\" class=\"\">\r\n\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td><span class=\"sub_stan_blue\">* 운영정보</span></td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" height=\"26\">취급품목</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template56 = "\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" height=\"26\">상품분류</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template57 = "\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template58 = " / ";
  private final static String _jspx_template59 = "\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template60 = "\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" height=\"26\">영업인원</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template61 = "\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template62 = " (운영자 본인 포함)\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template63 = "\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" height=\"26\">운영시간</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template64 = "\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template65 = " ~ ";
  private final static String _jspx_template66 = "\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" height=\"26\">허가일자</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td>";
  private final static String _jspx_template67 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" height=\"26\">일매출액</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template68 = "</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"f6f6f6\" class=\"table_bl_left\" colspan=\"2\"></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" height=\"26\">기타정보</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t\t\t\t\t\t\t<textarea id=\"NOTES\" name=\"NOTES\" class=\"input_form1\" style=\"width: 620px\" rows=\"10\" cols=\"200\">";
  private final static String _jspx_template69 = "</textarea>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"40\" align=\"right\">\r\n\t\t\t\t\t\t";
  private final static String _jspx_template70 = "\r\n\t\t\t\t\t\t\t<table width=\"0\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"right\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td height=\"40\" align=\"right\">\r\n\t\t\t\t\t\t\t\t\t\t<a href=\"javascript:Modify('";
  private final static String _jspx_template71 = "')\"> \r\n\t\t\t\t\t\t\t\t\t\t\t<img src=\"/img/mod_icon.gif\" alt=\"수정\" width=\"56\" height=\"18\" border=\"0\">\r\n\t\t\t\t\t\t\t\t\t\t</a>\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template72 = "\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n</table>\r\n</form>\r\n</body>\r\n</html>";
}
