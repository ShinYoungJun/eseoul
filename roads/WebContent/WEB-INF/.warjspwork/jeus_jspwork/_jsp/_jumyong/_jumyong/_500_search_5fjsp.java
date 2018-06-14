package jeus_jspwork._jsp._jumyong._jumyong;

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
      out.write(_jspx_template11);
      // jsp code [from=(163,9);to=(163,19)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${menu_param}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(169,9);to=(169,16)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(230,67);to=(230,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(231,65);to=(231,75)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${purpose_cd}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(232,54);to=(232,60)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${toDate}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(233,57);to=(233,65)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${fromDate}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(234,57);to=(234,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${search}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(235,67);to=(235,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${search_flag}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(276,11);to=(276,22)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${use_section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(285,10);to=(285,18)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${use_type}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(291,11);to=(291,19)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${check_yn}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(300,10);to=(300,26)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${taxation_section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(308,29);to=(308,36)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${gu_code}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // jsp code [from=(313,122);to=(313,128)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bonbun}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);
      // jsp code [from=(314,102);to=(314,107)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bubun}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template26);
      // jsp code [from=(323,102);to=(323,113)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bjdong_code}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // jsp code [from=(334,102);to=(334,113)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${hjdong_code}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template28);
      // jsp code [from=(344,154);to=(344,165)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${numberValue}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template29);
      // jsp code [from=(350,176);to=(350,187)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${jumyongName}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template30);
      // jsp code [from=(358,189);to=(358,193)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${type}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template31);
      // jsp code [from=(358,208);to=(358,218)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${purpose_cd}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template32);
      // jsp code [from=(376,89);to=(376,98)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${listCount}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template33);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template73);
      // jsp code [from=(449,31);to=(449,48)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${strPageDivideForm}",java.lang.String.class , pageContext.getVariableResolver(), null));

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
  private boolean _jspx_th_c_forEach_0_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:forEach ---- //
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = new org.apache.taglibs.standard.tag.rt.core.ForEachTag();
    _jspx_th_c_forEach_0.setPageContext(pageContext);
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist1}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("board");
    _jspx_th_c_forEach_0.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template34);
            // jsp code [from=(406,175);to=(406,189)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template35);
            // jsp code [from=(406,195);to=(406,208)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template36);
            // jsp code [from=(406,215);to=(406,230)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TYPE_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template37);
            // jsp code [from=(407,42);to=(407,50)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template38);
            // jsp code [from=(409,29);to=(409,44)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADMIN_NO2}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template39);
            // jsp code [from=(411,47);to=(411,62)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TYPE_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template40);
            // jsp code [from=(412,47);to=(412,65)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SECTION_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template41);
            // jsp code [from=(413,47);to=(413,65)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TAX_SET_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template42);
            // jsp code [from=(414,47);to=(414,57)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template43);
            // jsp code [from=(415,47);to=(415,57)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.POST}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template44);
            // jsp code [from=(416,47);to=(416,57)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADDR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template45);
            // jsp code [from=(417,47);to=(417,61)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADDR_NEW}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template46);
            // jsp code [from=(418,47);to=(418,59)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOPOST}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template47);
            // jsp code [from=(419,47);to=(419,62)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SONGDALGI}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template48);
            // jsp code [from=(422,29);to=(422,37)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SI}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template49);
            // jsp code [from=(422,46);to=(422,55)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template50);
            // jsp code [from=(422,64);to=(422,77)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.DORO_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template51);
            // jsp code [from=(422,86);to=(422,97)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template52);
            // jsp code [from=(422,106);to=(422,118)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_BON}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template53);
            // jsp code [from=(422,127);to=(422,138)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_BU}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template54);
            // ----  c:if ---- invoke //
            if (_jspx_th_c_if_0_fn(pageContext, _jspx_th_c_forEach_0)) return true;


            out.write(_jspx_template61);
            // jsp code [from=(426,47);to=(426,58)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BJ_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template62);
            // jsp code [from=(426,62);to=(426,74)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BONBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            // ----  c:if ---- invoke //
            if (_jspx_th_c_if_2_fn(pageContext, _jspx_th_c_forEach_0)) return true;


            // jsp code [from=(426,121);to=(426,132)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BUBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template64);
            // jsp code [from=(427,47);to=(427,72)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.JUMYONGJI_DORO_ADDR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template65);
            // jsp code [from=(428,47);to=(428,62)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ROAD_ADDR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template66);
            // jsp code [from=(429,47);to=(429,62)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.AREA_SIZE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template67);
            // jsp code [from=(430,36);to=(430,57)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PURPOSE_CLASSNM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template68);
            // jsp code [from=(431,36);to=(431,56)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.REDUCTION_RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template69);
            // jsp code [from=(432,41);to=(432,63)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.REDUCTION_REASON}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template70);
            // jsp code [from=(433,47);to=(433,74)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(board.UP_DATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template71);
            // jsp code [from=(434,65);to=(434,81)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.CHECK_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template72);

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

  private boolean _jspx_th_c_if_0_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:if ---- //
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = new org.apache.taglibs.standard.tag.rt.core.IfTag();
    _jspx_th_c_if_0.setPageContext(pageContext);
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.DORO_NM != null && board.DORO_NM != ''}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template55);
          // jsp code [from=(424,96);to=(424,104)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SI}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template56);
          // jsp code [from=(424,108);to=(424,117)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template57);
          // jsp code [from=(424,121);to=(424,134)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.DORO_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template58);
          // jsp code [from=(424,138);to=(424,150)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_BON}",java.lang.String.class , pageContext.getVariableResolver(), null));

          // ----  c:if ---- invoke //
          if (_jspx_th_c_if_1_fn(pageContext, _jspx_th_c_if_0)) return true;


          out.write(_jspx_template60);
          // jsp code [from=(424,234);to=(424,245)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));


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
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BUBUN != null}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
      if (_jspx_eval_c_if_2 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template63);

        } while (_jspx_th_c_if_2.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_2.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_2.release();
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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_BU != null && board.BD_BU != '0'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
      if (_jspx_eval_c_if_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template59);
          // jsp code [from=(424,212);to=(424,223)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_BU}",java.lang.String.class , pageContext.getVariableResolver(), null));


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
    _jspx_fnmap_0.mapFunction("rnic:addDash", main.java.common.util.StringUtil.class, "addDash", new Class[] {java.lang.String.class});

  }
  
  private final static String _jspx_template0 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n";
  private final static String _jspx_template1 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('사용자의 사용시간이 종료되었습니다. 다시 접속 해주시기 바랍니다.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template2 = "\r\n";
  private final static String _jspx_template3 = "\r\n";
  private final static String _jspx_template4 = "\r\n";
  private final static String _jspx_template5 = "  \r\n";
  private final static String _jspx_template6 = "  \r\n";
  private final static String _jspx_template7 = "  \r\n";
  private final static String _jspx_template8 = "\r\n";
  private final static String _jspx_template9 = "\r\n";
  private final static String _jspx_template10 = "\r\n\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n<script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script>\r\n<script language=\"javascript\" src=\"/js/common.js\"></script>\r\n<script>\r\n\tfunction goSearch()\r\n\t{\r\n\t\tvar toDate = document.getElementById(\"searchToDate\").value;\r\n\t\tvar fromDate = document.getElementById(\"searchFromDate\").value;\r\n\t\tvar type = document.getElementById(\"TYPE\").value;\r\n\t\tvar section = document.getElementById(\"SECTION\").value;\r\n\t\tvar tax_set = document.getElementById(\"TAX_SET\").value;\r\n\t\tvar gu_cd = document.getElementById(\"GU_CD\").value;\r\n\t\tvar bj_cd = document.getElementById(\"BJ_CD\").value;\r\n\t\tvar hj_cd = document.getElementById(\"HJ_CD\").value;\r\n\t\tvar bonbun = document.getElementById(\"BONBUN\").value;\r\n\t\tvar bubun = document.getElementById(\"BUBUN\").value;\r\n\t\tvar jumyongName = document.getElementById(\"jumyongName\").value;\r\n\t\tvar check_yn = document.getElementById(\"check_yn\").value;\r\n\r\n\t\tvar numberValue = document.getElementById(\"numberValue\").value;\t\t\t\t\r\n\t\t\r\n\t\ttoDate = removeDash(toDate);\r\n\t\tfromDate = removeDash(fromDate);\r\n\r\n\t\tvar iFrm = document.getElementById(\"IFRM_PurposeCode\");\r\n\t\tvar purpose = iFrm.contentWindow.document.getElementById(\"PURPOSE_CD\").value;\r\n\t\tvar purpose1 = iFrm.contentWindow.document.getElementById(\"PURPOSE1\");\r\n\t\t\t\r\n\t\tif(purpose1[purpose1.selectedIndex].text == \"::선택::\")\r\n\t\t\tpurpose=\"\";\r\n\t\t\r\n\t\tif(type.length==0)\t\t//점용종류가 선택이 안되면 점용목적은 선택되지 않도록 purpose값을 지정 \r\n\t\t\tpurpose=\"\";\r\n\t\t\r\n\t\tlocation.href=\"/jumyong/jumyong/search.do?tDate=\"+toDate+\"&fDate=\"+fromDate+\"&type=\"+type+\"&section=\"+section\r\n\t\t+\"&tax_set=\"+tax_set+\"&purpose=\"+purpose+\"&bj_cd=\"+bj_cd+\"&hj_cd=\"+hj_cd+\"&bonbun=\"+bonbun+\"&bubun=\"+bubun+\"&jumyongName=\"\r\n\t\t+jumyongName+\"&check_yn=\"+check_yn+\"&gu_cd=\"+gu_cd+\"&numberValue=\"+numberValue+\"&search=1\";\r\n\t}\r\n\r\n\tfunction\texcel_Search()\r\n\t{\r\n\t\t\r\n\t\tvar toDate = document.getElementById(\"searchToDate\").value;\r\n\t\tvar fromDate = document.getElementById(\"searchFromDate\").value;\r\n\t\tvar type = document.getElementById(\"TYPE\").value;\r\n\t\tvar section = document.getElementById(\"SECTION\").value;\r\n\r\n\r\n\t\tvar tax_set = document.getElementById(\"TAX_SET\").value;\r\n\t\tvar bj_cd = document.getElementById(\"BJ_CD\").value;\r\n\t\tvar hj_cd = document.getElementById(\"HJ_CD\").value;\r\n\r\n\t\tvar bonbun = document.getElementById(\"BONBUN\").value;\r\n\t\tvar bubun = document.getElementById(\"BUBUN\").value;\r\n\t\tvar jumyongName = document.getElementById(\"jumyongName\").value;\r\n\r\n\t\tvar check_yn = document.getElementById(\"check_yn\").value;\r\n\r\n\t\tvar gu_cd = document.getElementById(\"GU_CD\").value;\r\n\r\n\t\tvar numberValue = document.getElementById(\"numberValue\").value;\t\t\t\t\r\n\t\t\r\n\t\ttoDate = removeDash(toDate);\r\n\t\tfromDate = removeDash(fromDate);\r\n\r\n\t\tvar iFrm = document.getElementById(\"IFRM_PurposeCode\");\r\n\t\tvar purpose = iFrm.contentWindow.document.getElementById(\"PURPOSE_CD\").value;\r\n\t\tvar purpose1 = iFrm.contentWindow.document.getElementById(\"PURPOSE1\");\r\n\t\t\t\r\n\t\tif(purpose1[purpose1.selectedIndex].text == \"::선택::\")\r\n\t\t\tpurpose=\"\";\r\n\r\n\t\tif(type.length==0)\t\t//점용종류가 선택이 안되면 점용목적은 선택되지 않도록 purpose값을 지정 \r\n\t\t\tpurpose=\"\";\r\n\t\t\r\n\t\tlocation.href=\"/jumyong/jumyong/excel_search.do?tDate=\"+toDate+\"&fDate=\"+fromDate+\"&type=\"+type+\"&section=\"+section\r\n\t\t+\"&tax_set=\"+tax_set+\"&purpose=\"+purpose+\"&bj_cd=\"+bj_cd+\"&hj_cd=\"+hj_cd+\"&bonbun=\"+bonbun+\"&bubun=\"+bubun+\"&jumyongName=\"\r\n\t\t+jumyongName+\"&check_yn=\"+check_yn+\"&gu_cd=\"+gu_cd+\"&numberValue=\"+numberValue+\"&search=1\";\r\n\t}\t\r\n\r\n\tfunction goView(adminVal,sectionVal, useTypeVal)\r\n\t{\r\n\t\tvar toDate = document.getElementById(\"searchToDate\").value;\r\n\t\tvar fromDate = document.getElementById(\"searchFromDate\").value;\r\n\t\tvar type = document.getElementById(\"TYPE\").value;\r\n\t\tvar section = document.getElementById(\"SECTION\").value;\r\n\t\t\r\n\t\tvar tax_set = document.getElementById(\"TAX_SET\").value;\r\n\t\tvar bj_cd = document.getElementById(\"BJ_CD\").value";
  private final static String _jspx_template11 = ";\r\n\t\tvar hj_cd = document.getElementById(\"HJ_CD\").value;\r\n\r\n\t\tvar bonbun = document.getElementById(\"BONBUN\").value;\r\n\t\tvar bubun = document.getElementById(\"BUBUN\").value;\r\n\t\tvar jumyongName = document.getElementById(\"jumyongName\").value;\r\n\t\tvar check_yn = document.getElementById(\"check_yn\").value;\r\n\t\tvar numberValue = document.getElementById(\"numberValue\").value;\r\n\t\tvar currentPage = document.getElementById(\"currentPage\").value;\r\n\t\t\r\n\t\ttoDate = removeDash(toDate);\r\n\t\tfromDate = removeDash(fromDate);\r\n\t\t\r\n\t\tvar iFrm = document.getElementById(\"IFRM_PurposeCode\");\r\n\t\tvar purpose = iFrm.contentWindow.document.getElementById(\"PURPOSE_CD\").value;\r\n\t\t\t\t\r\n\t\tlocation.href=\"/jumyong/jumyong/view.do?ADMIN_NO=\"+adminVal+\"&section=\"+sectionVal+\"&tDate=\"+toDate+\"&fDate=\"+fromDate+\"&type=\"+type\r\n\t\t+\"&tax_set=\"+tax_set+\"&purpose=\"+purpose+\"&bj_cd=\"+bj_cd+\"&hj_cd=\"+hj_cd+\"&bonbun=\"+bonbun+\"&bubun=\"+bubun+\"&jumyongName=\"+jumyongName+\"&check_yn=\"+check_yn+\"&numberValue=\"+numberValue+\"&currentPage=\"+currentPage+\"&useType=\"+useTypeVal;\r\n\t}\r\n\r\n\t\r\n\r\n\t\r\n\tfunction InitPage()\r\n\t{\r\n\r\n\t\tdocument.getElementById(\"resultDiv\").style.width = 780;\r\n\t\tdocument.getElementById(\"resultSaewe\").width = 1800;\r\n\r\n\t\t\r\n\t\tvar now = new Date();\r\n\t\tvar day=now.getDay();\r\n\t\tday = 1 - day;\t\t\t\t\r\n\t\tDate.prototype.addDate = add_date; // Date 객체에 메서드 정의\r\n\t\t\r\n\t\tvar fromDate = new Date(); // 현재 날짜 객체 생성\r\n\t\t\r\n\t\tfromDate.addDate(day); // \r\n\r\n\t\tdocument.getElementById(\"searchToDate\").value = getDateType1(now);\r\n\t\tdocument.getElementById(\"searchFromDate\").value = getDateType1(fromDate);\r\n\t\t\r\n\t\tvar toDate =   document.getElementById(\"toDateValue\").value ;\r\n\t\tvar fromDate =   document.getElementById(\"fromDateValue\").value ;\r\n\t\tvar search_flag =   document.getElementById(\"search_flag\").value ;\r\n\r\n\t\tif(toDate != \"\" && toDate !=\"99999999\" )\r\n\t\t\tdocument.getElementById(\"searchToDate\").value = addDash(toDate);\r\n \r\n\t\tif(fromDate != \"\" && fromDate != \"0\")\r\n\t\t\tdocument.getElementById(\"searchFromDate\").value = addDash(fromDate);\r\n\t\t\t\r\n\t\tif(document.getElementById(\"PURPOSE_CD\").value.length<1){\r\n\t\t\tdocument.getElementById(\"IFRM_PurposeCode\").src=\"/jsp/common/purposeCode/purposeCode2.jsp?SectionCode=\"+document.getElementById(\"TYPE\").value+\"&PURPOSE_CD=000\"+\"&search_flag=\"+search_flag;\r\n\t\t}\r\n\t\t\r\n\t\tif('";
  private final static String _jspx_template12 = "' == 'jumyong'){\r\n\t\t\ttop.frames[1].location=\"/jsp/menu/left/jumyong.jsp?menu_param=jumyong\";\t//왼쪽 메뉴 링크\r\n\t\t}\r\n\r\n\t\t// 만료는 REF_COMMONCODE 테이블에 코드로 존재하지 않고\r\n\t\t// jsp상에 추가되어있으므로 임의의 처리를 해 줌 (2016.04 kny)\r\n\t\tif(\"";
  private final static String _jspx_template13 = "\" == \"5\") {\r\n\t\t\tdocument.getElementById(\"SECTION\").value=\"5\";\r\n\t\t}\r\n\t}\r\n\t\r\n\tfunction getDateType1(date1)\r\n\t{\r\n\t\tvar year= date1.getFullYear();\r\n\t    var mon = (date1.getMonth()+1)>9 ? ''+(date1.getMonth()+1) : '0'+(date1.getMonth()+1);\r\n\t    var day = date1.getDate()>9 ? ''+date1.getDate() : '0'+date1.getDate();\r\n\t\t\r\n\t\treturn (year+\"-\"+mon+\"-\"+day);\r\n\t}\r\n\t\r\n\tfunction add_date(i) // 매서드가 될 함수 구현\r\n\t{\r\n\t   var currentDate; // 계산된 날\r\n\t   currentDate = this.getDate() + i*1; // 현재 날짜에 더해(빼)줄 날짜를 계산\r\n\t   this.setDate(currentDate); // 계산된 날짜로 다시 세팅\r\n\t}\r\n\t\r\n\tfunction removeDash(num)\r\n\t{\t\r\n\t\treturn num.split('-').join(\"\");\r\n\t}\r\n\t\r\n\tfunction addDash(num)\r\n\t{\r\n\t\treturn (num.substr(0,4)+\"-\"+num.substr(4,2)+\"-\"+num.substr(6,2));\r\n\t}\r\n\t\r\n\t// 점용 종류 선택시 점용 목적 코드 나오게 함.\r\n\tfunction\tSelect_UseType(sel)\r\n\t{\r\n//\t\tdocument.getElementById(\"UseType1\").style.display = \"none\";\r\n//\t\tdocument.getElementById(\"UseType2\").style.display = \"none\";\r\n\t\t\r\n//\t\tif(sel.value == '2' || sel.value == '3')\t\r\n//\t\t\tdocument.getElementById(\"UseType2\").style.display = \"block\";\t//\t하천, 구거\r\n//\t\telse\t\t\t\t\t\t\r\n//\t\t\tdocument.getElementById(\"UseType1\").style.display = \"block\";\t//\t도로\t\t\r\n\t\tdocument.getElementById(\"IFRM_PurposeCode\").src=\"/jsp/common/purposeCode/purposeCode2.jsp?SectionCode=\"+sel.value+\"&PURPOSE_CD=&search_flag=1\";\r\n\t}\r\n\t\r\n\t\r\n\tfunction checkKeySearch(){\r\n\t\tif(event.keyCode == \"13\")\r\n\t\t\tgoSearch();\r\n\t}\t\r\n\t\r\n\t\t\t\r\n</script>\r\n\r\n\r\n\r\n</head>\r\n\r\n<body onload=\"javascript:InitPage();\">\r\n\r\n<form id=\"form\" name=\"form\">\r\n\r\n<input type=\"hidden\" id=\"currentPage\" name=\"currentPage\" value=\"";
  private final static String _jspx_template14 = "\">\r\n<input type=\"hidden\" id=\"PURPOSE_CD\" name=\"PURPOSE_CD\" value=\"";
  private final static String _jspx_template15 = "\">\r\n<input id=\"toDateValue\" name=\"toDateValue\"  value=\"";
  private final static String _jspx_template16 = "\" type=\"hidden\">\r\n<input id=\"fromDateValue\" name=\"fromDateValue\" value=\"";
  private final static String _jspx_template17 = "\" type=\"hidden\">\r\n<input id=\"search\" name=\"search\" type=\"hidden\" value=\"";
  private final static String _jspx_template18 = "\">\r\n<input id=\"search_flag\" name=\"search_flag\" type=\"hidden\" value=\"";
  private final static String _jspx_template19 = "\">\r\n\r\n<table width=\"800\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n  <tr>\r\n    <td height=\"43\"><img src=\"/img/sub1_cont2_title.gif\" width=\"800\" height=\"43\"></td>\r\n  </tr>\r\n  <tr>\r\n    <td ><table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n      <tr>\r\n        <td height=\"1\" bgcolor=\"eaeaea\"></td>\r\n      </tr>\r\n      <tr>\r\n        <td height=\"14\"></td>\r\n      </tr>     \r\n      <tr>\r\n        <td><table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n          <tr>\r\n            <td align=\"left\" height=\"22\" background=\"/img/tab_line_blue.gif\">\r\n            <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                <tr >\r\n                  <td ><img src=\"/img/sub_petition_title15.gif\" width=\"110\" height=\"22\"></td>\r\n                </tr>\r\n            </table></td>\r\n          </tr>\r\n\t\t<tr>\r\n            <td  class=\"contborder_purple\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n              <tr>\r\n                <td>\r\n                <table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n                    <tr>\r\n                      <td height=\"32\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" >갱신 기간</td>\r\n                      <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\t                      <input id = \"searchFromDate\" name=\"searchFromDate\" type=\"text\" class=\"input_form1\" style=\"width:80px\" readonly>\r\n\t                      <img src=\"/img/calendar_icon.gif\" style=\"vertical-align:middle;cursor:pointer\" onclick=\"popUpCalendar(this, document.getElementById('searchFromDate'), 'yyyymmdd');\">\r\n\t\t\t\t\t\t  &nbsp;&nbsp;~&nbsp;&nbsp;\r\n\t\t\t\t\t\t  <input id = \"searchToDate\" name=\"searchToDate\" type=\"text\" class=\"input_form1\" style=\"width:80px\" readonly>\r\n\t                      <img src=\"/img/calendar_icon.gif\" style=\"vertical-align:middle;cursor:pointer\" onclick=\"popUpCalendar(this, document.getElementById('searchToDate'), 'yyyymmdd');\">\r\n\t                  </td>\r\n\t\t\t\t\t\t<td width=\"13%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용구분</td>\r\n\t\t\t\t\t\t<td width=\"37%\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t  \t\t<select id=\"SECTION\" name=\"SECTION\" class=\"input_form1\" style=\"width:130px\" >\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template20 = "\r\n\t\t\t\t\t\t\t\t<option value=\"5\">만료</option>\r\n\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t</td>\r\n                    </tr>\r\n                    <tr>\r\n                      <td width=\"13%\" height=\"32\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용종류</td>                      \r\n\t\t\t\t\t  <td width=\"37%\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t<select id=\"TYPE\" name=\"TYPE\" class=\"input_form1\" style=\"width:130px\" OnChange=\"Select_UseType(this);\">\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template21 = "\r\n\t\t\t\t\t    </select>\r\n\t\t\t\t\t   </td>\r\n                      <td height=\"32\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" >검토여부</td>\r\n                      <td bgcolor=\"eaeaea\" class=\"table_bl_left\" width=\"30%\">\r\n\t\t\t\t\t\t  <select id=\"check_yn\" name=\"check_yn\" class=\"input_form1\" style=\"width:130px\">\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template22 = "\r\n\t                      </select>\r\n\t\t\t\t\t  </td>\r\n                    </tr>\r\n\t\t\t\t\t\r\n                    <tr>\r\n                      <td height=\"32\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">세입구분</td>\r\n\t\t\t\t\t  <td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t\t\t  \t<select id=\"TAX_SET\" name=\"TAX_SET\" class=\"input_form1\" style=\"width:130px\">\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template23 = "\r\n\t\t\t\t\t  \t</select>\r\n\t\t\t\t\t  </td>\r\n                    </tr>\r\n                    <tr>\r\n\t\t\t\t\t  \t<td height=\"32\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">시군구</td>\r\n\t\t\t\t\t  \t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n                          <select id=\"GU_CD\" name=\"GU_CD\" class=\"input_form1\" style=\"width:130px\">\r\n                          ";
  private final static String _jspx_template24 = "\r\n                          </select>\r\n\t\t\t\t\t  \t</td>\r\n\t\t\t\t\t  \t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">건물/도로 번지 </td>\r\n\t                      <td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t                          <input id=\"BONBUN\" name=\"BONBUN\" type=\"text\" class=\"input_form1\" style=\"width:40px\" value=\"";
  private final static String _jspx_template25 = "\">\r\n\t\t\t\t\t\t\t\t- <input id=\"BUBUN\" name=\"BUBUN\" type=\"text\" class=\"input_form1\" style=\"width:40px\" value=\"";
  private final static String _jspx_template26 = "\">\r\n\t                      </td>\r\n\t\t\t\t\t</tr> \r\n                    <tr>\r\n\t\t\t\t\t  \t<td height=\"32\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">법정동</td>\r\n\t\t\t\t\t  \t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t  \t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t                          <td>\r\n\t                          <select id=\"BJ_CD\" name=\"BJ_CD\" class=\"input_form1\" style=\"width:130px\">";
  private final static String _jspx_template27 = "\r\n\t                          </select>\r\n\t                          </td>\r\n\t\t\t\t\t\t  \t</tr>\r\n\t\t\t\t\t  \t\t</table>\r\n\t\t\t\t\t  \t</td>\r\n\t\t\t\t\t  \t<td height=\"32\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">행정동</td>\r\n\t\t\t\t\t  \t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t  \t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t                          <td>\r\n\t                          <select id=\"HJ_CD\" name=\"HJ_CD\" class=\"input_form1\" style=\"width:130px\">";
  private final static String _jspx_template28 = "\r\n\t                          </select>\r\n\t                          </td>\r\n\t\t\t\t\t\t  \t</tr>\r\n\t\t\t\t\t  \t\t</table>\r\n\t\t\t\t\t  \t</td>\r\n\t\t\t\t\t</tr> \r\n                    <tr>\r\n\t\t\t\t\t  <td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" >관리번호</td>\r\n                      <td bgcolor=\"eaeaea\" class=\"table_bl_left\" width=\"35%\">\r\n\t\t\t\t\t  <input id=\"numberValue\" name=\"numberValue\" type=\"text\" class=\"input_form1\" style=\"width:130px\"  onKeyDown=\"javascript:checkKeySearch();\" value=\"";
  private final static String _jspx_template29 = "\">\r\n\t\t\t\t\t  </td>\r\n\t\t\t\t\t   <td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용인/법인명</td>\r\n                      <td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t  <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n                        <tr>\r\n                          <td><input id=\"jumyongName\" name=\"jumyongName\" type=\"text\" class=\"input_form1\" style=\"width:130px\" onKeyDown=\"javascript:checkKeySearch();\" value=\"";
  private final static String _jspx_template30 = "\"></td>\r\n                        </tr>\r\n                      </table></td>\r\n                    </tr>\r\n                    <tr>\r\n\t\t\t\t\t  <td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용목적</td>\r\n\t\t\t\t\t  <td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t  \t<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t<iframe id=\"IFRM_PurposeCode\" align=\"absmiddle\" scrolling=\"no\" frameborder=\"0\" framespacing=\"0\" width=\"100%\" height=\"25\" src=\"/jsp/common/purposeCode/purposeCode2.jsp?SectionCode=";
  private final static String _jspx_template31 = "&PURPOSE_CD=";
  private final static String _jspx_template32 = "\"></iframe>\r\n\t\t\t\t\t  \t</table>\r\n\t\t\t\t\t  </td> \r\n                    </tr>\r\n                </table>\r\n                \r\n                \r\n                </td>\r\n              </tr>\r\n \r\n                <tr>\r\n                  <td height=\"40\" align=\"right\"><img src=\"/img/inquiry_icon2.gif\" alt=\"조회\" width=\"56\" height=\"18\" border=\"0\" onclick=\"javascript:goSearch();\" style=\"cursor:pointer\" >\r\n                  </td>\r\n                </tr>\r\n                <tr>\r\n                  <td height=\"1\" bgcolor=\"#EAEAEA\"></td>\r\n                </tr>\r\n                <tr>\r\n                  <td height=\"34\" class=\"sub_stan\">전체건수 : <span class=\"sub_stan_blue\">";
  private final static String _jspx_template33 = "</span>건 </td>\r\n                </tr>\r\n                <tr>\r\n                  <td>\r\n\t\t\t\t\t<div id=\"resultDiv\"  style=\"width:780px; padding:10px; overflow-x:scroll; scrollbar-face-color:#EEF8FB; scrollbar-3dlight-color:#BBBDB6; scrollbar-highlight-color:#EEF8FB; scrollbar-shadow-color:#BBBDB6; scrollbar-darkshadow-color:#EEF8FB; scrollbar-track-color:#EEF8FB; scrollbar-arrow-color:#BBBDB6\"> \r\n\t\t\t\t\t\t<table id=\"resultSaewe\" width=\"1800px\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n                      <tr>\r\n                        <td width=\"28\" height=\"35\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" width=\"50\">번호</td>\r\n                        <td width=\"70\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">관리번호</td>\r\n                        <td width=\"40\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용<br/>종류</td>\r\n                        <td width=\"40\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용<br/>구분</td>\r\n                        <td width=\"40\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">세입<br/>구분</td>\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용인</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"62\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용인<br/>우편번호</td>\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용인 주소</td>\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용인 도로명 주소</td>\r\n                        <td width=\"62\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">우편물<br/>송달지<br/>우편번호</td>\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">우편물 송달지 도로명 주소</td>\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용지</td>   \r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용지<br/>도로명 주소</td>\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">도로<br/>주소</td>  \r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">면적<br/>(㎡)</td> \r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용목적</td>\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">감면/지분율</td>\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">감면/지분 사유</td>                       \r\n                        <td width=\"62\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">갱신일자</td>                                                \r\n                        <td width=\"52\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">검토여부</td>\r\n                      </tr>\r\n                                  \r\n                      ";
  private final static String _jspx_template34 = "\t                      \r\n\t                      <tr onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\" style=\"cursor:pointer\" onclick=\"javascript:goView('";
  private final static String _jspx_template35 = "','";
  private final static String _jspx_template36 = "', '";
  private final static String _jspx_template37 = "');\">\r\n\t\t\t\t\t\t\t<td height=\"26\" align=\"center\"> ";
  private final static String _jspx_template38 = " </td>\r\n\t                        <td align=\"center\" >\r\n\t                        \t";
  private final static String _jspx_template39 = "\r\n\t\t\t\t\t\t\t</td>\r\n\t                        <td align=\"center\">";
  private final static String _jspx_template40 = "</td>\r\n\t                        <td align=\"center\">";
  private final static String _jspx_template41 = "</td>\r\n\t                        <td align=\"center\">";
  private final static String _jspx_template42 = "</td>                        \r\n\t                        <td align=\"center\">";
  private final static String _jspx_template43 = "</td>\r\n\t                        <td align=\"center\">";
  private final static String _jspx_template44 = "</td>\r\n                        \t<td align=\"center\">";
  private final static String _jspx_template45 = "</td>\r\n                        \t<td align=\"center\">";
  private final static String _jspx_template46 = "</td>\r\n                        \t<td align=\"center\">";
  private final static String _jspx_template47 = "</td>\r\n                        \t<td align=\"center\">";
  private final static String _jspx_template48 = "</td>\r\n\t\t\t\t\t\t\t<!--  //********** BEGIN_KANG_20120424 -->\r\n\t\t\t\t\t\t\t<!-- \r\n\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template49 = "&nbsp;";
  private final static String _jspx_template50 = "&nbsp;";
  private final static String _jspx_template51 = "&nbsp;";
  private final static String _jspx_template52 = "&nbsp;";
  private final static String _jspx_template53 = "&nbsp;";
  private final static String _jspx_template54 = "</td>\r\n\t\t\t\t\t\t\t-->\r\n\t\t\t\t\t\t\t<!--<td align=\"center\">";
  private final static String _jspx_template55 = " ";
  private final static String _jspx_template56 = " ";
  private final static String _jspx_template57 = " ";
  private final static String _jspx_template58 = " ";
  private final static String _jspx_template59 = "-";
  private final static String _jspx_template60 = " ";
  private final static String _jspx_template61 = "</td> -->\r\n\t\t\t\t\t\t\t<!--   //********** END_KANG_20120424 -->                        \t \r\n\t                        <td align=\"center\">";
  private final static String _jspx_template62 = " ";
  private final static String _jspx_template63 = "-";
  private final static String _jspx_template64 = "</td>\r\n\t                        <td align=\"center\">";
  private final static String _jspx_template65 = "</td>\r\n\t                        <td align=\"center\">";
  private final static String _jspx_template66 = "</td>\r\n\t                        <td align=\"center\">";
  private final static String _jspx_template67 = "</td>\r\n\t         \t\t\t\t<td align=\"center\">";
  private final static String _jspx_template68 = "</td>\r\n\t         \t\t\t\t<td align=\"center\">";
  private final static String _jspx_template69 = "</td>\r\n\t\t\t\t\t\t\t<td align=\"center\" width=\"200\">";
  private final static String _jspx_template70 = "</td>                                                                                   \t                        \r\n\t                        <td align=\"center\">";
  private final static String _jspx_template71 = "</td>                                                                                    \r\n\t                        <td align=\"center\"><font color=\"red\">";
  private final static String _jspx_template72 = "</font></td>            \r\n\t                      </tr>\r\n\t\t\t\t\t\t ";
  private final static String _jspx_template73 = "\r\n                    </table>\r\n                    </div>\r\n\t\t\t\t  </td>\r\n                </tr>\r\n                \r\n                <tr>\r\n\t                <td height=\"40\" align=\"center\">\r\n\t\t                <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t                    <tr>\r\n\t\t                      <td align=\"center\">\r\n\t\t                      \t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t\t                        <tr>\r\n\t\t\t                        \t";
  private final static String _jspx_template74 = "\r\n\t\t\t                        </tr>\r\n\t\t                      \t</table>\r\n\t\t                      </td>\r\n\t\t                    </tr>\r\n\t\t                  </table>\r\n\t                  </td>\r\n\t              </tr>\r\n\t              \r\n\t              <tr>              \r\n\t                <td height=\"40\" align=\"right\">\r\n\t\t                <table border=\"0\" width=\"100%\">\r\n\t\t                \t<tr>\r\n\t\t\t                \t<td >\r\n\t\t\t\t                \t<!-- img src=\"/img/excel_icon.gif\" alt=\"EXCEL 변환\" border=\"0\" -->\r\n\t\t\t\t                \ta\r\n\t\t\t\t                \t<img src=\"../../../img/excel_icon.gif\" alt=\"EXCEL 변환\" border=\"0\" onclick=\"javascript:excel_Search();\" style=\"cursor:hand\">\r\n\t\t\t\t                </td>\t\t\t\t\t\t                \r\n\t\t\t                </tr>\r\n\t\t\t             </table>\r\n\t\t\t\t\t</td>\r\n\t              </tr>\r\n                \r\n            </table></td>\r\n          </tr>\r\n          \r\n        </table></td>\r\n      </tr>\r\n      <tr>\r\n        <td height=\"30\"></td>\r\n      </tr>\r\n</table>\r\n</td></tr></table>\r\n</form>\r\n</body>\r\n</html>\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n";
}
