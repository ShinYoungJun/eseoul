package jeus_jspwork._jsp._rojum._survey;

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
      // jsp code [from=(27,14);to=(27,17)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MSG}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(28,27);to=(28,30)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MSG}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(31,51);to=(31,55)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(32,70);to=(32,77)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      out.write(_jspx_template14);
      // jsp code [from=(163,28);to=(163,32)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      // jsp code [from=(176,17);to=(179,13)]
      out.write(_jspx_template15);
      out.write(_jspx_template16);
      out.write(_jspx_template17);
      out.write(_jspx_template18);
      // jsp code [from=(431,75);to=(431,81)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GUGAN }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(443,79);to=(443,86)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GU_CODE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(449,79);to=(449,86)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${BJ_CODE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(456,147);to=(456,153)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${BONBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(457,93);to=(457,98)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${BUBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(461,212);to=(461,222)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${OWNER_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // jsp code [from=(467,211);to=(467,219)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);
      // jsp code [from=(510,153);to=(510,162)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${listCount}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template26);
      // jsp code [from=(510,234);to=(510,252)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${unconfirmListCount}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template30);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_1_fn(pageContext, null)) return;


      out.write(_jspx_template75);
      // jsp code [from=(638,29);to=(638,46)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${strPageDivideForm}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template76);
      // jsp code [from=(682,18);to=(682,24)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${FT_TYP}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template77);

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
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("board");
    _jspx_th_c_forEach_0.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template28);
            // jsp code [from=(570,71);to=(570,85)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template29);

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

  private boolean _jspx_th_c_forEach_1_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:forEach ---- //
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = new org.apache.taglibs.standard.tag.rt.core.ForEachTag();
    _jspx_th_c_forEach_1.setPageContext(pageContext);
    _jspx_th_c_forEach_1.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_1.setVar("board");
    _jspx_th_c_forEach_1.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
        if (_jspx_eval_c_forEach_1 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template31);
            // jsp code [from=(582,168);to=(582,179)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${idx.count-1}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template32);
            // jsp code [from=(583,71);to=(583,85)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template33);
            // jsp code [from=(584,57);to=(584,72)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.FT_TYP_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template34);
            // jsp code [from=(584,88);to=(584,103)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.FT_SEL_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template35);
            // jsp code [from=(585,56);to=(585,72)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template36);
            // jsp code [from=(586,57);to=(586,72)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.WITH_ADDR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template37);
            // jsp code [from=(588,62);to=(588,70)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SI}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template38);
            // jsp code [from=(588,79);to=(588,88)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template39);
            // jsp code [from=(588,97);to=(588,110)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.DORO_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template40);
            // jsp code [from=(588,119);to=(588,131)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_BON}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template41);
            // jsp code [from=(588,140);to=(588,151)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_BU}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template42);
            // jsp code [from=(588,160);to=(588,171)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template43);
            // jsp code [from=(588,180);to=(588,195)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_DET_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template44);
            // ----  c:if ---- invoke //
            if (_jspx_th_c_if_0_fn(pageContext, _jspx_th_c_forEach_1)) return true;


            out.write(_jspx_template51);
            // ----  c:if ---- invoke //
            if (_jspx_th_c_if_2_fn(pageContext, _jspx_th_c_forEach_1)) return true;


            out.write(_jspx_template54);
            // jsp code [from=(602,56);to=(602,69)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PLACE_A}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template55);
            // ----  c:choose ---- invoke //
            if (_jspx_th_c_choose_0_fn(pageContext, _jspx_th_c_forEach_1)) return true;


            out.write(_jspx_template61);
            // ----  c:choose ---- invoke //
            if (_jspx_th_c_choose_1_fn(pageContext, _jspx_th_c_forEach_1)) return true;


            out.write(_jspx_template67);
            // jsp code [from=(615,57);to=(615,89)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(board.SPECIAL_DATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template68);
            // jsp code [from=(616,57);to=(616,87)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(board.FOUND_DATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template69);
            // jsp code [from=(617,57);to=(617,85)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(board.REG_DATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template70);
            // jsp code [from=(618,57);to=(618,72)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_SSN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template71);
            // jsp code [from=(619,57);to=(619,71)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_HP}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template72);
            // jsp code [from=(620,57);to=(620,69)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SG_TYP}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template73);
            // jsp code [from=(621,56);to=(621,68)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.UN_TYP}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template74);

          } while (_jspx_th_c_forEach_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
        }
        if (_jspx_th_c_forEach_1.doEndTag() == Tag.SKIP_PAGE)
          return true;
      } catch (Throwable t) {
        _jspx_th_c_forEach_1.doCatch(t);
      } finally {
        _jspx_th_c_forEach_1.doFinally();
      }
    } finally {
      _jspx_th_c_forEach_1.release();
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
          // jsp code [from=(589,118);to=(589,126)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SI}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template45);
          // jsp code [from=(589,130);to=(589,139)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template46);
          // jsp code [from=(589,143);to=(589,156)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.DORO_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template47);
          // jsp code [from=(589,160);to=(589,172)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_BON}",java.lang.String.class , pageContext.getVariableResolver(), null));

          // ----  c:if ---- invoke //
          if (_jspx_th_c_if_1_fn(pageContext, _jspx_th_c_if_0)) return true;


          out.write(_jspx_template49);
          // jsp code [from=(589,256);to=(589,267)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template50);
          // jsp code [from=(589,271);to=(589,286)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_DET_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));


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
    _jspx_th_c_if_2.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GUGAN_CD!=0 && board.GUGAN_CD!=null}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
      if (_jspx_eval_c_if_2 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template52);
          // jsp code [from=(596,27);to=(596,41)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GUGAN_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template53);

        } while (_jspx_th_c_if_2.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_2.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_2.release();
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
    _jspx_th_c_choose_0.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    try {
      int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
      if (_jspx_eval_c_choose_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template56);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template58);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template60);

        } while (_jspx_th_c_choose_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_choose_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_choose_0.release();
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
          out.write(_jspx_template62);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_1_fn(pageContext, _jspx_th_c_choose_1)) return true;


          out.write(_jspx_template64);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_1_fn(pageContext, _jspx_th_c_choose_1)) return true;


          out.write(_jspx_template66);

        } while (_jspx_th_c_choose_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_choose_1.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_choose_1.release();
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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_BU != '0' && board.BD_BU != null}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
      if (_jspx_eval_c_if_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template48);
          // jsp code [from=(589,234);to=(589,245)]
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

  private boolean _jspx_th_c_when_0_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:when ---- //
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = new org.apache.taglibs.standard.tag.rt.core.WhenTag();
    _jspx_th_c_when_0.setPageContext(pageContext);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.MAINTN_OB == '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
      if (_jspx_eval_c_when_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template57);

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
          out.write(_jspx_template59);

        } while (_jspx_th_c_otherwise_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_otherwise_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_otherwise_0.release();
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
    _jspx_th_c_when_1.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SPECIAL_ST == '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
      if (_jspx_eval_c_when_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template63);

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
          out.write(_jspx_template65);

        } while (_jspx_th_c_otherwise_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_otherwise_1.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_otherwise_1.release();
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
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "  \r\n";
  private final static String _jspx_template6 = "  \r\n";
  private final static String _jspx_template7 = "\r\n";
  private final static String _jspx_template8 = "\r\n";
  private final static String _jspx_template9 = "\r\n<html>\r\n    <head>\r\n        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n        <title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n        <style type=\"text/css\">\r\n            <!--\r\n            body {\r\n                margin: 0px;\r\n                background-image: url(/img/left_back.gif);\r\n            }\r\n            -->\r\n        </style>\r\n        <link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n        <script language=\"javascript\" src=\"/js/common.js\"></script>\r\n        <script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script>\r\n        <script language=\"javascript\" src=\"/js/calculation.js\"></script>\r\n        <script language=\"javascript\" src=\"/js/selectItem.js\"></script>\r\n        <script language=\"javascript\" src=\"/js/Ajax_request.js\"></script>\r\n\r\n        <script>\r\n\t        function InitPage()\r\n\t        {\t\t\r\n\t    \t\tif('";
  private final static String _jspx_template10 = "'.length > 0){\r\n\t                alert('";
  private final static String _jspx_template11 = "');\r\n\t            }\r\n\t    \t\t\r\n\t    \t\tsetYear(document.getElementById(\"YEAR\"),\"";
  private final static String _jspx_template12 = "\");\r\n\t    \t\tsetSelectedOptionByName(document.getElementById(\"SECTION\"),'";
  private final static String _jspx_template13 = "');\r\n\t        }\r\n\t\r\n\t        function checkKeySearch(){\r\n\t            if(event.keyCode == \"13\")\r\n\t                goSearch();\r\n\t        }\r\n\t        \r\n            function rojum_History(idx){\r\n                var f = document.jumyongForm;\r\n                var gapan_no = document.getElementsByName(\"GAPAN_NO_ARR\");\r\n                var param = \"/rojum/jumyong/history_info.do?GAPAN_NO=\"+gapan_no[idx].value;\r\n\r\n                location.href=param;\r\n            }\r\n\t        \r\n            function goSearch()\r\n            {\r\n            \tvar YEAR = document.getElementById(\"YEAR\").value;\r\n\t\t\t\tvar GU_CD = document.getElementById(\"GU_CD\").value;\r\n                var BJ_CD = document.getElementById(\"BJ_CD\").value;\r\n                var BONBUN = document.getElementById(\"BONBUN\").value;\r\n                var BUBUN = document.getElementById(\"BUBUN\").value;\r\n                var OWNER_NAME = document.getElementById(\"OWNER_NAME\").value;\r\n                var GAPAN_NO = document.getElementById(\"GAPAN_NO\").value;\r\n                var SECTION = document.getElementById(\"SECTION\").value;\r\n                //********** BEGIN_현진_20120313\r\n                var GUGAN_CD = document.getElementById(\"GUGAN_CD\").value;\r\n                var FT_TYP = document.getElementById(\"FT_TYP\").value;\r\n\r\n                \r\n//                location.href=\"/rojum/survey/search.do?YEAR=\"+YEAR+\"&GU_CD=\"+GU_CD+\"&BJ_CD=\"+BJ_CD+\"&BONBUN=\"+BONBUN+\r\n//\t\t\t\t\"&BUBUN=\"+BUBUN+\"&OWNER_NAME=\"+OWNER_NAME+\"&GAPAN_NO=\"+GAPAN_NO+\"&SECTION=\"+SECTION+\"&EXCEL=N\";\r\n\r\n                location.href=\"/rojum/survey/search.do?YEAR=\"+YEAR+\"&GU_CD=\"+GU_CD+\"&BJ_CD=\"+BJ_CD+\"&BONBUN=\"+BONBUN+\r\n\t\t\t\t\"&BUBUN=\"+BUBUN+\"&OWNER_NAME=\"+OWNER_NAME+\"&GAPAN_NO=\"+GAPAN_NO+\"&SECTION=\"+SECTION+\"&EXCEL=N\"+\r\n\t\t\t\t\"&GUGAN_CD=\"+GUGAN_CD+\"&FT_TYP=\"+FT_TYP;\r\n                //********** END_현진_20120313\r\n              \r\n            }\r\n            \r\n            //function excel_Search()\r\n            //{\r\n            //\tvar YEAR = document.getElementById(\"YEAR\").value;\r\n\t\t\t//\tvar GU_CD = document.getElementById(\"GU_CD\").value;\r\n            //    var BJ_CD = document.getElementById(\"BJ_CD\").value;\r\n            //    var BONBUN = document.getElementById(\"BONBUN\").value;\r\n            //    var BUBUN = document.getElementById(\"BUBUN\").value;\r\n            //    var OWNER_NAME = document.getElementById(\"OWNER_NAME\").value;\r\n            //    var GAPAN_NO = document.getElementById(\"GAPAN_NO\").value;\r\n            //    var SECTION = document.getElementById(\"SECTION\").value;\r\n\t\t\r\n            //    location.href=\"/rojum/survey/search.do?YEAR=\"+YEAR+\"&GU_CD=\"+GU_CD+\"&BJ_CD=\"+BJ_CD+\"&BONBUN=\"+BONBUN+\r\n\t\t\t//\t\t\"&BUBUN=\"+BUBUN+\"&OWNER_NAME=\"+OWNER_NAME+\"&GAPAN_NO=\"+GAPAN_NO+\"&SECTION=\"+SECTION+\"&EXCEL=Y\";\r\n\t\t    //}\r\n            \r\n            \r\n            function\texcel_Search()\r\n        \t{ \r\n            \tvar YEAR = document.getElementById(\"YEAR\").value;\r\n\t\t\t\tvar GU_CD = document.getElementById(\"GU_CD\").value;\r\n                var BJ_CD = document.getElementById(\"BJ_CD\").value;\r\n                var BONBUN = document.getElementById(\"BONBUN\").value;\r\n                var BUBUN = document.getElementById(\"BUBUN\").value;\r\n                var OWNER_NAME = document.getElementById(\"OWNER_NAME\").value;\r\n                var GAPAN_NO = document.getElementById(\"GAPAN_NO\").value;\r\n                var SECTION = document.getElementById(\"SECTION\").value;\r\n                var form = document.surveyForm;\r\n\r\n                //********** BEGIN_현진_20120313\r\n                var GUGAN_CD = document.getElementById(\"GUGAN_CD\").value;\r\n                //********** END_현진_20120313\r\n                \r\n                var FT_TYP = document.getElementById(\"FT_TYP\").value;\r\n                \r\n                //form.action = \"excel_search.do\";\r\n                //********** BEGIN_현진_20120313\r\n//                location.href = \"/rojum/survey/excel_search.do?YEAR=\"+YEAR+\"&GU_CD=\"+GU_CD+\"&BJ_CD=\"+BJ_CD+\"&BONBUN=\"+BONBUN+\r\n//    \t\t\t\t\t\t\"&BUBUN=\"+BUBUN+\"&OWNER_NAME=\"+OWNER_NAME+\"&GAPAN_NO=\"+GAPAN_NO+\"&SECTION=\"+SECTION+\"&EXCEL=Y\";\r\n\r\n  location.href = \"/rojum/survey/excel_search.do?";
  private final static String _jspx_template14 = "YEAR=\"+YEAR+\"&GU_CD=\"+GU_CD+\"&BJ_CD=\"+BJ_CD+\"&BONBUN=\"+BONBUN+\r\n    \t\t\t\t\t\t\"&BUBUN=\"+BUBUN+\"&OWNER_NAME=\"+OWNER_NAME+\"&GAPAN_NO=\"+GAPAN_NO+\"&SECTION=\"+SECTION+\"&EXCEL=Y\"+\r\n    \t\t\t\t\t\t\"&GUGAN_CD=\"+GUGAN_CD+\"&FT_TYP=\"+FT_TYP;\r\n                //********** END_현진_20120313\r\n\r\n        \t\t//location.href=\"/rojum/jumyong/excel_search.do\"; // 현재 되는거.. 어떤게 404가 나는 url이라는건가..\r\n        \t\t\r\n                //form.submit();\r\n                \r\n                //location.href= \"/excel_search.jsp?YEAR=\"+YEAR+\"&GU_CD=\"+GU_CD+\"&BJ_CD=\"+BJ_CD+\"&BONBUN=\"+BONBUN+\r\n    \t\t\t//\t\t\t\"&BUBUN=\"+BUBUN+\"&OWNER_NAME=\"+OWNER_NAME+\"&GAPAN_NO=\"+GAPAN_NO+\"&SECTION=\"+SECTION+\"&EXCEL=Y\";\r\n        \t\t//form.submit();\r\n        \t}\r\n            \r\n            \r\n            function surveyRegister(){\r\n        \t\tvar form = document.surveyForm;\r\n        \t\tform.action = \"/rojum/survey/register.do\";\r\n        \t\tform.submit();\r\n            }\r\n            \r\n            function unPickup(){\r\n                var select_item = document.getElementsByName(\"SELECT_ITEM\");\r\n                var item_check = document.getElementsByName(\"ITEM_CHECK\");\r\n                \r\n                var count = 0;\r\n\r\n                for(var i = 0 ; i < select_item.length ; i++){\r\n                    if(select_item[i].checked == true){\r\n                        item_check[i].value = select_item[i].checked;\r\n                        count++;\r\n                    }\r\n                }\r\n                \r\n               \tif(count > 0){\r\n                \tif(confirm(\"부과를 위해 해당 건에 대하여 산출메뉴에 등록하시겠습니까?\")){\r\n                \t\tvar form = document.surveyForm;\r\n                \t\tform.action = \"/rojum/survey/un_pickup.do\";\r\n                \t\tform.submit();\r\n                \t}\r\n               \t}else{\r\n               \t\talert(\"처리할 데이터가 없습니다.\");\r\n               \t}\r\n            }\r\n            \r\n            function setSpecial(){\r\n            \tMessageDisplay('SpecialDiv','SpecialDivValue',1);\r\n            }\r\n            \r\n            function file_down(){\r\n            \t\r\n            \tif(confirm(\"";
  // jsp code [from=(176,17);to=(179,13)]
  private final static String _jspx_template15 = "\"+\"년도 실태조사 자료를 내려받겠습니까?\")){\r\n                    \r\n            \t\tMessageDisplay('filedown','FILEDOWNValue',1);\r\n\r\n                    document.getElementById(\"FildDownIco\").onclick = function(){\r\n                        alert(\"잠시만 기다리세요.\");\r\n                    };\r\n    \t\t\t\t\t\r\n                    document.surveyForm.action = \"/mdb/execute_download.do\";\r\n                    document.surveyForm.target = \"ifrm\";\r\n                    document.surveyForm.submit();\r\n            \t}\r\n            }\r\n            ";
  private final static String _jspx_template16 = "\r\n            function file_upload(){\r\n\t\t\t\tvar file = document.uploadForm.mdbFile.value;\r\n\t\t\t\tvar mdbFile = file.lastIndexOf(\".\");\r\n\t\t\t\tvar extnm = file.substring(mdbFile+1);\r\n\t\t\t\t\tif(extnm == \"mdb\")\r\n\t\t\t\t\t{\t\t\t\t\r\n\t\t\t    \tdocument.uploadForm.action = \"/mdb/executeUpload.do\";\r\n\t\t\t    \tdocument.uploadForm.submit();\r\n\t\t\t\t\t}else{\r\n\t\t\t\t\t\talert(\"첨부할수 없는 파일입니다.\\다시 선택하여 주십시오.\");\r\n\t\t\t\t\t}\r\n\t\t\t\t}\r\n\t\t\t/*\r\n\t\t\tfunction file_upload(){\r\n\t\t\t    document.uploadForm.action = \"/mdb/executeUpload.do\";\r\n\t\t\t    document.uploadForm.submit();\r\n\t\t\t}\r\n\t\t\t*/\r\n            \r\n            function check_special_st(){\r\n            \tvar specialSt = document.getElementsByName(\"SPECIAL_ST\");\r\n            \tif(specialSt[0].checked){\r\n            \t\tdocument.getElementById(\"SPECIAL_DATE_SPAN\").style.display = \"none\";\r\n            \t\tdocument.getElementById(\"SPECIAL_DATE\").value = \"\";\r\n            \t}else{\r\n            \t\tdocument.getElementById(\"SPECIAL_DATE_SPAN\").style.display = \"inline-block\";\r\n            \t}\r\n            }\r\n            \r\n            function SubmitSpecialRoad(){\r\n            \t\r\n            \tif(document.getElementsByName(\"SPECIAL_ST\")[1].checked){\r\n            \t\t\r\n            \t\tif(document.getElementById(\"SPECIAL_DATE\").value.length < 1){\r\n            \t\t\talert(\"조성일자를 입력하세요.\");\r\n            \t\t\tdocument.getElementById(\"SPECIAL_DATE\").focus();\r\n            \t\t\treturn;\r\n            \t\t}\r\n            \t}\r\n            \t\r\n                var select_item = document.getElementsByName(\"SELECT_ITEM\");\r\n                var item_check = document.getElementsByName(\"ITEM_CHECK\");\r\n                \r\n                var count = 0;\r\n\r\n                for(var i = 0 ; i < select_item.length ; i++){\r\n                    if(select_item[i].checked == true){\r\n                        item_check[i].value = select_item[i].checked;\r\n                        count++;\r\n                    }\r\n                }\r\n                \r\n               \tif(count > 0){\r\n                \tif(confirm(\"해당 건에 대하여 거리조성을 변경하시겠습니까?\")){\r\n                \t\tvar form = document.surveyForm;\r\n                \t\tform.action = \"/rojum/survey/batch_mod_special.do\";\r\n                \t\tform.submit();\r\n                \t}\r\n               \t}else{\r\n               \t\talert(\"처리할 데이터가 없습니다.\");\r\n               \t}\r\n            }\r\n            \r\n            \r\n            function changeGuCd(obj){\r\n            \tvar guCd = getSelectedValue(obj);\r\n                var\tparam\t= \"guCd=\"+guCd;\r\n                sendRequest(\"/get_bjdong_code.do\", param, \"GET\", ResultChangeGuCd);\r\n            \t\r\n            \t\r\n            }\r\n\r\n            function\tResultChangeGuCd(obj)\r\n            {\r\n            \tselect_innerHTML(document.getElementById(\"BJ_CD\"),obj);\r\n            \t//********** BEGIN_현진_20120315\r\n            \tchangeGuCdGuGan();\r\n            \t//********** END_현진_20120315\r\n            \t\r\n            }\r\n\r\n\r\n            ////////////////////////////////AJAX////////////////////////////////////////////\r\n            function getXMLHTTPRequest()\r\n            {\r\n                var xRequest = null;\r\n                xRequest = new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n\r\n                return xRequest;\r\n            }\r\n\r\n            var req;\r\n            var\tcall;\r\n\r\n            function sendRequest(url, params, HttpMethod, callback)\r\n            {\r\n                req = getXMLHTTPRequest();\r\n\r\n                call\t= callback;\r\n                if(req){\r\n                    req.onreadystatechange = onReadyStateChange;\r\n                    req.open(HttpMethod, url, true);\r\n                    req.setRequestHeader(\"Content-Type\",\"application/x-www-form-urlencoded;charset=utf-8\");\r\n                    req.send(params);\r\n                }\r\n            }\r\n\r\n            function onReadyStateChange()\r\n            {\r\n                var ready = req.readyState;\r\n                var data = null;\r\n                if(ready == 4){\r\n                    if(this.call\t!= null)\r\n                    {\r\n                        this.call(req.responseText);\r\n                    }\r\n                }\r\n            }\r\n          //********** BEGIN_현진_20120315\r\n\t\tfunctio";
  private final static String _jspx_template17 = "n changeGuCdGuGan(){\t\t\r\n\t\t\tvar guCd = document.getElementById(\"GU_CD\").value;\t    \t\r\n\t\t\tvar\tparam\t= \"guCd=\"+guCd;\r\n\t\t\tsendRequest(\"/rojum/survey/getSectionCode.do\", param, \"GET\", ResultChangeGuCdGuGan);\r\n\t\t}\r\n\r\n\t\tfunction\tResultChangeGuCdGuGan(obj)\r\n\t\t{\r\n\t\t\tselect_innerHTML(document.getElementById(\"GUGAN_CD\"),obj);\r\n\t\t}\r\n          //********** END_현진_20120315\r\n        </script>\r\n    </head>\r\n\r\n    <body onload=\"javascript:InitPage();\">\r\n    <iframe id=\"ifrm\" name=\"ifrm\" width=\"70%\" height=\"0px\" style=\"visibility: hidden;\"></iframe>\r\n\r\n\t\t<form name=\"uploadForm\" action=\"/mdb/executeUpload.do\" method=\"post\" enctype=\"multipart/form-data\">\r\n\t\t<div id=\"fileupload\" style=\"position: absolute; display: none;\">\r\n\t\t<table id=\"FILEUPValue\" width=\"300px\" height=\"150px\" border=\"3\" bordercolor=\"#c9afed\" style=\"border-collapse: collapse; background-color: white;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t<tr>\r\n\t\t\t\t<td align=\"center\">\r\n\t\t\t\t<table width=\"290px\" height=\"120px\" border=\"0\" style=\"border-collapse: collapse; background-color: white;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td align=\"center\"><font color=\"red\">현장조사시스템 MDB파일 업로드</font></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td><input type=\"file\" name=\"mdbFile\" size=\"15\" class=\"input_form1\"></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td align=\"center\"><img src=\"/img/save_icon2.gif\" alt=\"등록\" border=\"0\" onclick=\"javascript:file_upload();\" style=\"cursor: pointer\"> \r\n\t\t\t\t\t\t\t<img src=\"/img/can_icon.gif\" alt=\"취소\" border=\"0\" onclick=\"MessageDisplay('fileupload','FILEUPValue',0);\" style=\"cursor: pointer\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t</table>\r\n\t\t</div>\r\n\t\t</form>\r\n\r\n\t\t<form id=\"surveyForm\" name=\"surveyForm\" method=\"post\">\r\n            <div id=\"filedown\" style=\"position:absolute;display:none;\">\r\n            \t<table id=\"FILEDOWNValue\" width=\"213px\" height=\"59px\">\r\n            \t<tr>\r\n            \t\t<td>\r\n            \t\t\t<img src=\"/img/loadingBar.gif\">\r\n            \t\t</td>\r\n            \t</tr>\r\n            \t</table>\r\n            </div>\r\n            <div id=\"SpecialDiv\" style=\"position:absolute;display:none;\">\r\n\t\t\t\t<table id=\"SpecialDivValue\" width=\"210px\" height=\"70px\" border=\"3\" bordercolor=\"#c9afed\" style=\"border-collapse:collapse;background-color:white;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td align=\"center\">\r\n\t\t\t\t\t\t<table width=\"200px\" height=\"60px\" border=\"0\" style=\"border-collapse:collapse;background-color:white;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td height=\"5px\">\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t<font color=\"#5624A2\">거리조성 변경</font>\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"60px\" style=\"vertical-align: top;\">\r\n\t\t\t\t\t\t\t\t\t<input name=\"SPECIAL_ST\" type=\"radio\" value=\"1\" checked onclick=\"check_special_st();\" style=\"vertical-align: middle;\">\r\n\t\t\t\t\t\t\t\t\t일반거리\r\n\t\t\t\t\t\t\t\t\t<input name=\"SPECIAL_ST\" type=\"radio\" value=\"0\" onclick=\"check_special_st();\" style=\"vertical-align: middle;\">\r\n\t\t\t\t\t\t\t\t\t특화거리\r\n\t\t\t\t\t\t\t\t\t<br>\r\n\t\t\t\t\t\t\t\t\t<span id=\"SPECIAL_DATE_SPAN\" style=\"display:none;\">\r\n\t\t\t\t\t\t\t\t\t조성일자:\r\n\t\t\t\t\t\t\t\t\t<input id=\"SPECIAL_DATE\" name=\"SPECIAL_DATE\"  type=\"text\" class=\"input_form1\" style=\"width:60px;vertical-align: middle;\" readonly>\r\n\t\t\t\t\t\t\t\t\t<img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onClick=\"popUpCalendar(this, document.getElementById('SPECIAL_DATE'), 'yyyymmdd')\" style=\"CURSOR:pointer;vertical-align: middle;\">\r\n\t\t\t\t\t\t\t\t\t</span>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td align=\"center\" >\r\n\t\t\t\t\t\t\t\t\t<img src=\"/img/mod_icon.gif\" alt=\"수정\" width=\"56\" height=\"18\" border=\"0\" onClick=\"SubmitSpecialRoad();\"  style=\"cursor:pointer\">\r\n\t\t\t\t\t\t\t\t\t<img src=\"/img/can_icon.gif\" alt=\"취소\" border=\"0\" onclick=\"MessageDisplay('SpecialDiv','SpecialDivValue',0);\" style=\"cursor:pointer\" >\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t</table>\r\n            </div>\r\n            <table width=\"780px\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\r\n                <tr>\r\n                    <td";
  private final static String _jspx_template18 = " height=\"43\">\r\n                        <img src=\"/img/sub7_cont0_title.gif\" width=\"800\" height=\"43\">\r\n                    </td>\r\n                </tr>\r\n                <tr>\r\n                    <td align=\"center\">\r\n                        <table width=\"780px\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                            <tr>\r\n                                <td>\r\n                                    <table width=\"780px\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                                        <tr>\r\n                                            <td align=\"left\" height=\"22\" background=\"/img/tab_line_blue.gif\">\r\n                                            </td>\r\n                                        </tr>\r\n                                        <tr>\r\n                                            <td class=\"contborder_purple\">\r\n                                                <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                                                    <tr>\r\n                                                        <td>\r\n                                                            <table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse: collapse;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n                                                               <!--  //********** BEGIN_현진_20120312 -->\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<!-- \r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n                                                                    <td height=\"26px\" width=\"100px\"  align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조사년도</td>\r\n                                                                    <td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\" >\r\n                                                                        <select  id=\"YEAR\" name=\"YEAR\" class=\"input_form1\" style=\"width:130px\">\r\n                                                            \t\t\t</select>\r\n                                                                    </td>\r\n                                                                </tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t-->\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n                                                                    <td height=\"26px\" width=\"100px\"  align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조사년도</td>\r\n                                                                    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\" >\r\n                                                                        <select  id=\"YEAR\" name=\"YEAR\" class=\"input_form1\" style=\"width:100%\">\r\n                                                            \t\t\t</select>\r\n                                                                    </td>\r\n                                                                    <td height=\"26px\" width=\"100px\"  align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">구간번호</td>\r\n                                                                    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\" >\r\n                                                                        <select  id=\"GUGAN_CD\" name=\"GUGAN_CD\" class=\"input_form1\" style=\"width:100%\">\r\n                                                                        ";
  private final static String _jspx_template19 = "\r\n                                                            \t\t\t</select>\r\n                                                                    </td>\r\n                                                                </tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<!--   //********** END_현진_20120312 -->\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t                                                               \r\n                                                                \t\r\n                                                                \r\n                                                                <tr>\r\n                                                                    <td height=\"26px\" width=\"100px\"  align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">시군구</td>\r\n                                                                    <td width=\"35%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\" >\r\n                                                                        <select id=\"GU_CD\" name=\"GU_CD\" class=\"input_form1\" style=\"width: 100%\" onchange=\"changeGuCd(this);\">\r\n                                                                            ";
  private final static String _jspx_template20 = "\r\n                                                                        </select>\r\n                                                                    </td>\r\n                                                                    <td width=\"100px\"  align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">법정동</td>\r\n                                                                    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\">\r\n                                                                        <select id=\"BJ_CD\" name=\"BJ_CD\" class=\"input_form1\" style=\"width: 100%\">\r\n                                                                            ";
  private final static String _jspx_template21 = "\r\n                                                                        </select>\r\n                                                                    </td>\r\n                                                                </tr>\t\t\r\n                                                                <tr>\r\n                                                                    <td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">번 지</td>\r\n                                                                    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\" width=\"36%\">\r\n                                                                        <input id=\"BONBUN\" name=\"BONBUN\" type=\"text\" class=\"input_form1\" value=\"";
  private final static String _jspx_template22 = "\" style=\"width: 45%\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t- <input id=\"BUBUN\" name=\"BUBUN\" type=\"text\" class=\"input_form1\" value=\"";
  private final static String _jspx_template23 = "\" style=\"width: 45%\">\r\n                                                                    </td>\t\t\t\t\t\t\t\t\t\t\t\r\n                                                                    <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">운영자명</td>\r\n                                                                    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\">\r\n                                                                    \t<input name=\"OWNER_NAME\" id=\"OWNER_NAME\" type=\"text\" class=\"input_form1\" style=\"width: 97%\" onKeyDown=\"javascript:checkKeySearch();\" value=\"";
  private final static String _jspx_template24 = "\">\r\n                                                                    </td>\r\n                                                                </tr>\r\n                                                                <tr>\r\n                                                                \t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">관리번호</td>\r\n                                                                    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\">\r\n                                                                        <input id=\"GAPAN_NO\" name=\"GAPAN_NO\" type=\"text\" class=\"input_form1\" style=\"width: 97%\" onKeyDown=\"javascript:checkKeySearch();\" value=\"";
  private final static String _jspx_template25 = "\">\r\n                                                                    </td>\t\t\t\t\t\t\t\t\t\t\t\r\n                                                                \t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">폐쇄목록</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\" align=\"left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<select id=\"SECTION\" name=\"SECTION\" class=\"input_form1\" style=\"width: 100%\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"1\">감춤</option>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"4\">보기</option>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n                                                                </tr>\r\n                                                                <tr>\r\n                                                                \t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">시설 종류</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\" align=\"left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<select id=\"FT_TYP\" name=\"FT_TYP\" class=\"input_form1\" style=\"width: 130px\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"\">전체</option>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"021\">거리가게</option>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"022\">적치물</option>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n                                                                </tr>\r\n                                                                <tr>\r\n\r\n                                                                \r\n                                                                </tr>\r\n                                                            </table>\r\n\r\n\r\n                                                        </td>\r\n                                                    </tr>\r\n\r\n                                                    <tr>\r\n                                                        <td height=\"40\" align=\"right\">\r\n                                                            <img src=\"/img/inquiry_icon2.gif\" alt=\"조회\" width=\"56\" height=\"18\" border=\"0\" onclick=\"javascript:goSearch();\" style=\"cursor: pointer\">\r\n                                                        </td>\r\n                                                    </tr>\r\n                                                    <tr>\r\n                                                        <td height=\"1\" bgcolor=\"#EAEAEA\"></td>\r\n                                                    </tr>\r\n\r\n                                                    <tr>\r\n                                                    \t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table width=\"100%\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t                                                        <td height=\"34\" class=\"sub_stan\" align=\"left\">전체건수&nbsp;:&nbsp;<span class=\"sub_stan_blue\">";
  private final static String _jspx_template26 = "</span>건&nbsp;/&nbsp;운영자 미확인&nbsp;:&nbsp;<span class=\"sub_stan_blue\">";
  private final static String _jspx_template27 = "</span>건\r\n\t\t\t                                                        </td>\r\n\t\t\t                                                        <td align=\"right\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"/img/excel_icon.gif\" alt=\"EXCEL 변환(시설 종류는 구분되지 않고 변환됩니다)\" border=\"0\" onclick=\"javascript:excel_Search();\" style=\"cursor:pointer;\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n                                                    </tr>\r\n                                                    <tr>\r\n                                                        <td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table width=\"780px\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" class=\"sub_table\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <TR>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    <TD width=\"26px\"  valign=\"top\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t      <TABLE cellpadding=\"0\" cellspacing=\"0\" border=\"1\" class=\"sub_table\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t        <TR>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t              <td width=\"26px\" height=\"32px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<INPUT TYPE=\"checkbox\" ID=\"SELECT_ALL\" onclick=\"javascript:selectAll(this);\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  </td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t        </TR>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t      </TABLE>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    </TD>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    <TD width=\"754px\" valign=\"top\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t      <DIV id=\"topLine2\" style=\"width:754px;overflow:hidden;\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t        <!-- //********** BEGIN_현진_20120207\t: width=\"2300px\" 에서 width=\"2450px\"으로 수정-->\r\n          \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<TABLE width=\"1900px\" cellpadding=\"0\" cellspacing=\"0\" border=\"1\" class=\"sub_table\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\">\r\n          \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<!-- //********** END_현진_20120207 -->\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t        \r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t          <tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t  \t\t\t\t\t<td height=\"32px\" width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">관리번호</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t  \t\t\t\t\t<td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">시설 종류</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"80px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">운영인</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">인접지 주소</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"300px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">도로명 주소</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<!--  //********** BEGIN_현진_20120312 -->\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">구간</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<!--   //********** END_현진_20120312 -->\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"80px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">면적(㎡)</td>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">정비/관리</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">거리조성</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">특화거리<br>조성일자</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">설치일자</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">등록일자</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"110px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">주민번호</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">전화번호</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">취급품목</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"80px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">가입단체</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t          </tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t        </TABLE>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t      </DIV>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    </TD>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  </TR>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <TR>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    <TD width=\"26px\" valign=\"top\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t        <TABLE cellpadding=\"0\" cellspacing=\"0\" border=\"1\" class=\"sub_table\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t          \t\t\t";
  private final static String _jspx_template28 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t  \t\t\t\t\t<tr onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\"\tstyle=\"cursor: pointer\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t  \t\t\t\t\t\t<td height=\"26px\" width=\"35px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<INPUT TYPE=\"checkbox\" NAME=\"SELECT_ITEM\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<INPUT TYPE=\"hidden\" NAME=\"ITEM_CHECK\" value=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<INPUT TYPE=\"hidden\" NAME=\"GAPAN_NO_ARR\" value=\"";
  private final static String _jspx_template29 = "\"> \r\n\t\t\t\t\t\t\t\t\t\t\t\t\t  \t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t  \t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template30 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t        </TABLE>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    </TD>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    <TD width=\"754px\" valign=\"top\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t      <DIV id=\"mainDisplay2\" style=\"width:754px;overflow-y:hidden;overflow-x:scroll;scrollbar-face-color:#EEF8FB;scrollbar-3dlight-color:#BBBDB6; scrollbar-highlight-color:#EEF8FB;scrollbar-shadow-color:#BBBDB6; scrollbar-darkshadow-color:#EEF8FB;scrollbar-track-color:#EEF8FB;scrollbar-arrow-color:#BBBDB6;\" onScroll=\"scrollColumn()\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t      <!-- //********** BEGIN_현진_20120207\t: width=\"2300px\" 에서 width=\"2450px\"으로 수정-->\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t        <TABLE width=\"1900px\" cellpadding=\"0\" cellspacing=\"0\" border=\"1\" class=\"sub_table\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t          ";
  private final static String _jspx_template31 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t          <!-- //********** END_현진_20120207 -->\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\"\tstyle=\"cursor:pointer;\" onclick=\"rojum_History('";
  private final static String _jspx_template32 = "');\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td height=\"26px\" width=\"100px\" align=\"center\" >";
  private final static String _jspx_template33 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100px\" align=\"center\" >";
  private final static String _jspx_template34 = "&nbsp;/&nbsp;";
  private final static String _jspx_template35 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"80px\" align=\"center\" >";
  private final static String _jspx_template36 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100px\" align=\"center\" >";
  private final static String _jspx_template37 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<!--  //********** BEGIN_KANG_20120424 -->\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<!-- <td width=\"300px\" align=\"center\" >";
  private final static String _jspx_template38 = "&nbsp;";
  private final static String _jspx_template39 = "&nbsp;";
  private final static String _jspx_template40 = "&nbsp;";
  private final static String _jspx_template41 = "&nbsp;";
  private final static String _jspx_template42 = "&nbsp;";
  private final static String _jspx_template43 = "&nbsp;";
  private final static String _jspx_template44 = "</td> -->\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"300px\" align=\"center\" >";
  private final static String _jspx_template45 = " ";
  private final static String _jspx_template46 = " ";
  private final static String _jspx_template47 = " ";
  private final static String _jspx_template48 = "-";
  private final static String _jspx_template49 = " ";
  private final static String _jspx_template50 = " ";
  private final static String _jspx_template51 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<!--   //********** END_KANG_20120424 -->\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<!--  //********** BEGIN_현진_20120312 -->\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100px\" align=\"center\" >\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<!--  //********** BEGIN_현진_20120315 -->\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template52 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t제 ";
  private final static String _jspx_template53 = " 구간\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template54 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<!--   //********** END_현진_20120315 -->\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<!--   //********** END_현진_20120312 -->\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"80px\" align=\"center\" >";
  private final static String _jspx_template55 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100px\" align=\"center\" >\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template56 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template57 = "관리대상";
  private final static String _jspx_template58 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template59 = "정비대상";
  private final static String _jspx_template60 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template61 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100px\" align=\"center\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template62 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template63 = "일반거리";
  private final static String _jspx_template64 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template65 = "특화거리";
  private final static String _jspx_template66 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template67 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100px\" align=\"center\" >";
  private final static String _jspx_template68 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100px\" align=\"center\" >";
  private final static String _jspx_template69 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100px\" align=\"center\" >";
  private final static String _jspx_template70 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"110px\" align=\"center\" >";
  private final static String _jspx_template71 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100px\" align=\"center\" >";
  private final static String _jspx_template72 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100px\" align=\"center\" >";
  private final static String _jspx_template73 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"80px\" align=\"center\" >";
  private final static String _jspx_template74 = "</td> \r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template75 = "\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t        </TABLE>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t      </DIV>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    </TD>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  </TR>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\r\n                                                        </td>\r\n                                                    </tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t  <td height=\"40\" align=\"center\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t   <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t       <tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t         <td align=\"center\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t         \t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t            <tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t            \t";
  private final static String _jspx_template76 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t            </tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t         \t</table>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t         </td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t       </tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t     </table>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t    </td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n                                                    <tr>\r\n\t                                                    <td>\r\n\t                                                    <table width=\"100%\">\r\n\t\t                                                    <tr>\r\n\t\t\t                                                    <td width=\"50%\" align=\"left\">\r\n\t\t\t                                                    \t<img src=\"/img/rojum_register.gif\" alt=\"신규등록\" border=\"0\" onclick=\"javascript:surveyRegister();\" style=\"cursor:pointer;\">\r\n\t\t                                                            <img src=\"/img/rojum_unpickup.gif\" alt=\"미수거 산출등록\" border=\"0\" onclick=\"javascript:unPickup();\" style=\"cursor:pointer;\">\r\n\t\t                                                            <img src=\"/img/rojum_special.gif\" alt=\"거리조성변경\" border=\"0\" onclick=\"javascript:setSpecial();\" style=\"cursor:pointer;\">\r\n\t\t\t                                                    </td>\r\n\t\t\t                                                    <td align=\"right\">\r\n\t\t\t                                                    \t<img id=\"FildDownIco\" src=\"/img/data_down.gif\" alt=\"현장조사파일다운\" border=\"0\" onclick=\"javascript:file_down();\" style=\"cursor:pointer;\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img id=\"FildUpIco\" src=\"/img/data_upload.gif\" alt=\"현장조사파일업로드\" border=\"0\" onclick=\"MessageDisplay('fileupload','FILEUPValue',1);\" style=\"cursor:pointer;\">\r\n\t\t\t                                                    </td>\r\n\t\t                                                    </tr>\r\n\t                                                    </table>\r\n\t                                                    </td>\r\n                                                    </tr>\r\n                                                </table>\r\n                                            </td>\r\n                                        </tr>\r\n\r\n                                    </table>\r\n                                </td>\r\n                            </tr>\r\n                            <tr>\r\n                                <td height=\"30\"></td>\r\n                            </tr>\r\n                        </table>\r\n                    </td>\r\n                </tr>\r\n            </table>\r\n        </form>\r\n        <iframe id=\"ifrm\" name=\"ifrm\" width=\"70%\" height=\"0px\"></iframe>\r\n    </body>\r\n    \r\n<script type=\"text/javascript\">\r\nvar ft_type = \"";
  private final static String _jspx_template77 = "\";\r\n//alert(ft_type);\r\nif(ft_type == null)\r\n\tdocument.getElementById(\"FT_TYP\").value = \"\";\r\nelse \r\n\t document.getElementById(\"FT_TYP\").value = ft_type;\r\n</script>\r\n    \r\n</html>\r\n";
}
