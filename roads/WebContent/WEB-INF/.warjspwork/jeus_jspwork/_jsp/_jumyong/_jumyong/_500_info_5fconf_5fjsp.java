package jeus_jspwork._jsp._jumyong._jumyong;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_info_5fconf_5fjsp extends jeus.servlet.jsp.HttpJspBase {

  public final String[] __jeusGetIncludedJspFiles() {
    return new String[] {
      "/jsp/common/include.jsp",
      "/jsp/common/loginCheck.jsp"
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
      out.write(_jspx_template1);
      out.write(_jspx_template2);
      out.write(_jspx_template3);
      out.write(_jspx_template4);
      out.write(_jspx_template5);
      out.write(_jspx_template6);
      out.write(_jspx_template7);
      // jsp code [from=(1,3);to=(6,1)]
      
      	String 		userId	= (String)session.getAttribute("sessionUserId");
      	
      	if(userId == null)
      	{

      out.write(_jspx_template8);
      // jsp code [from=(11,3);to=(13,1)]
      
      	}

      out.write(_jspx_template9);
      // jsp code [from=(143,21);to=(143,23)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${no}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(155,37);to=(155,39)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${no}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(156,41);to=(156,45)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mode}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(157,39);to=(157,42)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${seq}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(158,47);to=(158,55)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_0_fn(pageContext, null)) return;


      out.write(_jspx_template16);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template33);
      // jsp code [from=(212,82);to=(212,99)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${conf.ORGANIZATION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template34);
      // jsp code [from=(214,82);to=(214,96)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${conf.CONF_DATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template35);
      // jsp code [from=(218,70);to=(218,86)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${conf.MANAGE_DEPT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template36);
      // jsp code [from=(220,70);to=(220,82)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${conf.MANAGER}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template37);
      // jsp code [from=(226,15);to=(226,23)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${conf.TEL}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template38);
      // jsp code [from=(230,15);to=(230,22)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${conf.HP}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template39);
      // jsp code [from=(235,82);to=(235,99)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${conf.CONF_COMMENT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template40);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_2_fn(pageContext, null)) return;


      out.write(_jspx_template47);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_4_fn(pageContext, null)) return;


      out.write(_jspx_template55);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_6_fn(pageContext, null)) return;


      out.write(_jspx_template57);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_1_fn(pageContext, null)) return;


      out.write(_jspx_template74);
      // jsp code [from=(327,120);to=(327,137)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${conf.ORGANIZATION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template75);
      // jsp code [from=(334,138);to=(334,152)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${conf.CONF_DATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template76);
      // jsp code [from=(346,118);to=(346,134)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${conf.MANAGE_DEPT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template77);
      // jsp code [from=(350,110);to=(350,122)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${conf.MANAGER}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template78);
      // ----  c:choose ---- invoke //
      if (_jspx_th_c_choose_0_fn(pageContext, null)) return;


      out.write(_jspx_template85);
      // jsp code [from=(367,84);to=(367,92)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${conf.TEL}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template86);
      // ----  c:choose ---- invoke //
      if (_jspx_th_c_choose_1_fn(pageContext, null)) return;


      out.write(_jspx_template93);
      // jsp code [from=(381,124);to=(381,131)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${conf.HP}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template94);
      // jsp code [from=(387,163);to=(387,180)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${conf.CONF_COMMENT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template95);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_8_fn(pageContext, null)) return;


      out.write(_jspx_template97);

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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION != '4'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
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

  private boolean _jspx_th_c_forEach_0_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:forEach ---- //
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = new org.apache.taglibs.standard.tag.rt.core.ForEachTag();
    _jspx_th_c_forEach_0.setPageContext(pageContext);
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${CList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("board");
    _jspx_th_c_forEach_0.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template17);
            // jsp code [from=(187,46);to=(187,55)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${idx.count}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template18);
            // jsp code [from=(188,93);to=(188,95)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${no}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template19);
            // jsp code [from=(188,103);to=(188,112)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template20);
            // jsp code [from=(188,128);to=(188,139)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template21);
            // jsp code [from=(188,156);to=(188,168)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${countPerPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template22);
            // jsp code [from=(188,200);to=(188,218)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ORGANIZATION}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template23);
            // jsp code [from=(189,34);to=(189,63)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(board.CONF_DATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template24);
            // jsp code [from=(190,34);to=(190,51)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.MANAGE_DEPT}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template25);
            // jsp code [from=(191,34);to=(191,47)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.MANAGER}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template26);
            // jsp code [from=(192,34);to=(192,43)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TEL}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template27);
            // jsp code [from=(193,34);to=(193,42)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.HP}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template28);
            // jsp code [from=(194,34);to=(194,52)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.CONF_COMMENT}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template29);
            // ----  c:if ---- invoke //
            if (_jspx_th_c_if_1_fn(pageContext, _jspx_th_c_forEach_0)) return true;


            out.write(_jspx_template32);

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

  private boolean _jspx_th_c_if_2_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:if ---- //
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = new org.apache.taglibs.standard.tag.rt.core.IfTag();
    _jspx_th_c_if_2.setPageContext(pageContext);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION != '4'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
      if (_jspx_eval_c_if_2 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template41);
          // ----  c:if ---- invoke //
          if (_jspx_th_c_if_3_fn(pageContext, _jspx_th_c_if_2)) return true;


          out.write(_jspx_template46);

        } while (_jspx_th_c_if_2.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_2.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_2.release();
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
    _jspx_th_c_if_4.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION != '4'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
      if (_jspx_eval_c_if_4 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template48);
          // ----  c:if ---- invoke //
          if (_jspx_th_c_if_5_fn(pageContext, _jspx_th_c_if_4)) return true;


          out.write(_jspx_template54);

        } while (_jspx_th_c_if_4.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_4.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_4.release();
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
    _jspx_th_c_if_6.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION != '4'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
      if (_jspx_eval_c_if_6 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template56);

        } while (_jspx_th_c_if_6.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_6.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_6.release();
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
    _jspx_th_c_forEach_1.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${CList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_1.setVar("board");
    _jspx_th_c_forEach_1.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
        if (_jspx_eval_c_forEach_1 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template58);
            // jsp code [from=(300,46);to=(300,55)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${idx.count}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template59);
            // jsp code [from=(301,93);to=(301,95)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${no}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template60);
            // jsp code [from=(301,103);to=(301,112)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template61);
            // jsp code [from=(301,128);to=(301,139)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template62);
            // jsp code [from=(301,156);to=(301,168)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${countPerPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template63);
            // jsp code [from=(301,200);to=(301,218)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ORGANIZATION}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template64);
            // jsp code [from=(302,34);to=(302,63)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(board.CONF_DATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template65);
            // jsp code [from=(303,34);to=(303,51)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.MANAGE_DEPT}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template66);
            // jsp code [from=(304,34);to=(304,47)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.MANAGER}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template67);
            // jsp code [from=(305,34);to=(305,43)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TEL}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template68);
            // jsp code [from=(306,34);to=(306,42)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.HP}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template69);
            // jsp code [from=(307,34);to=(307,52)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.CONF_COMMENT}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template70);
            // ----  c:if ---- invoke //
            if (_jspx_th_c_if_7_fn(pageContext, _jspx_th_c_forEach_1)) return true;


            out.write(_jspx_template73);

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
          out.write(_jspx_template79);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template81);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template84);

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
    try {
      int _jspx_eval_c_choose_1 = _jspx_th_c_choose_1.doStartTag();
      if (_jspx_eval_c_choose_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template87);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_1_fn(pageContext, _jspx_th_c_choose_1)) return true;


          out.write(_jspx_template89);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_1_fn(pageContext, _jspx_th_c_choose_1)) return true;


          out.write(_jspx_template92);

        } while (_jspx_th_c_choose_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_choose_1.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_choose_1.release();
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
    _jspx_th_c_if_8.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION != '4'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_8 = _jspx_th_c_if_8.doStartTag();
      if (_jspx_eval_c_if_8 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template96);

        } while (_jspx_th_c_if_8.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_8.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_8.release();
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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION != '4'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
      if (_jspx_eval_c_if_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template30);
          // jsp code [from=(196,62);to=(196,71)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template31);

        } while (_jspx_th_c_if_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_1.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_1.release();
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
    _jspx_th_c_if_3.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${listSize == '0'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
      if (_jspx_eval_c_if_3 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template42);
          // jsp code [from=(246,50);to=(246,52)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${no}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template43);
          // jsp code [from=(246,77);to=(246,88)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template44);
          // jsp code [from=(246,105);to=(246,117)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${countPerPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template45);

        } while (_jspx_th_c_if_3.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_3.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_3.release();
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
    _jspx_th_c_if_5.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${listSize != '0'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
      if (_jspx_eval_c_if_5 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template49);
          // jsp code [from=(254,50);to=(254,52)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${no}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template50);
          // jsp code [from=(254,70);to=(254,73)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${seq}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template51);
          // jsp code [from=(254,89);to=(254,100)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template52);
          // jsp code [from=(254,117);to=(254,129)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${countPerPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template53);

        } while (_jspx_th_c_if_5.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_5.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_5.release();
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
    _jspx_th_c_if_7.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_if_7.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION != '4'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_7 = _jspx_th_c_if_7.doStartTag();
      if (_jspx_eval_c_if_7 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template71);
          // jsp code [from=(309,62);to=(309,71)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template72);

        } while (_jspx_th_c_if_7.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_7.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_7.release();
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
    _jspx_th_c_when_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mode == 'add'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
      if (_jspx_eval_c_when_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template80);

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
          out.write(_jspx_template82);
          // jsp code [from=(364,85);to=(364,93)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${conf.TEL}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template83);

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
    _jspx_th_c_when_1.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mode == 'add'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
      if (_jspx_eval_c_when_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template88);

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
          out.write(_jspx_template90);
          // jsp code [from=(378,83);to=(378,90)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${conf.HP}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template91);

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
  
  private final static String _jspx_template0 = "\r\n";
  private final static String _jspx_template1 = "\r\n";
  private final static String _jspx_template2 = "  \r\n";
  private final static String _jspx_template3 = "  \r\n";
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "\r\n";
  private final static String _jspx_template6 = "\r\n";
  private final static String _jspx_template7 = "\r\n";
  private final static String _jspx_template8 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('사용자의 사용시간이 종료되었습니다. 다시 접속 해주시기 바랍니다.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template9 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n<script language=\"javascript\" src=\"/js/common.js\"></script>\r\n<script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script>\r\n<script language=\"javascript\">\r\n\r\nfunction getId(value1)\r\n{\r\n\treturn document.getElementById(value1).value;\r\n}\r\n\r\n\tfunction submitClick()\r\n\t{\r\n\t\r\n\t\tvar s1 = 0;\r\n\t\tvar form = document.confForm;\r\n\t\t\r\n\t    if (getByteLength(form.CONF_COMMENT) > 500) {\r\n          alert(\"협의내용은 한글 500자 이상 입력할 수 없습니다.\\n현재 글자수:\"+getByteLength(form.CONF_COMMENT));\r\n          return false;\r\n    \t}\r\n    \t\r\n    \t\r\n\t\tif(getId(\"ORGANIZATION\") == \"\" && getId(\"MANAGE_DEPT\") == \"\" \r\n\t\t&& getId(\"MANAGER\") == \"\" && getId(\"TEL1\") == \"\" && getId(\"HP1\") == \"\" && getId(\"CONF_COMMENT\") == \"\" )\r\n\t\t{ \r\n\t\t\tif(confirm(\"입력 항목이 없습니다. 그래도 저장하시겠습니까?\"))\r\n\t\t\t{\r\n\t\t\t\ts1 = 1;\r\n\t\t\t}\r\n\t\t}else\r\n\t\t{\r\n\t\t\ts1 = 1;\r\n\t\t}\r\n\t\t\r\n\t\tif(s1 == 1)\r\n\t\t{\r\n\t\t\tvar confForm = document.confForm;\t\t\r\n\t\t\tvar mode = document.getElementById(\"mode\").value;\r\n\t\t\t\r\n\t\t\tvar hp1 =\"\";\r\n\t\t\tvar hp2 =\"\";\r\n\t\t\tvar hp3 =\"\";\r\n\t\t\t\r\n\t\t\tvar tel1 =\"\";\r\n\t\t\tvar tel2 =\"\";\r\n\t\t\tvar tel3 =\"\";\r\n\t\r\n\t\t\thp1 = document.getElementById(\"HP1\").value;\t\t\r\n\t\t\ttel1 = document.getElementById(\"TEL1\").value;\r\n\t\t\t\r\n\t\t\tif(mode == \"add\")\r\n\t\t\t{\r\n\t\t\t\thp2 = document.getElementById(\"HP2\").value;\r\n\t\t\t\thp3 = document.getElementById(\"HP3\").value;\t\t\t\t\r\n\t\t\t\t\r\n\t\t\t\ttel2 = document.getElementById(\"TEL2\").value;\r\n\t\t\t\ttel3 = document.getElementById(\"TEL3\").value;\t\t\t\r\n\t\t\t}\r\n\t\r\n\t\t\tdocument.getElementById(\"HP\").value =  removeDash(hp1+hp2+hp3);\r\n\t\t\tdocument.getElementById(\"TEL\").value =  removeDash(tel1+tel2+tel3);\r\n\t\t\tconfForm.submit();\t\t\r\n\t\t}\r\n\t\tparent.parent.location.reload();\r\n\t}\r\n\t\r\n\t\r\n\t\r\n\t\r\n\tfunction InitPage()\r\n\t{\t\r\n\t\t\r\n\t\tif(document.getElementById(\"mode\").value == \"add\"  )\r\n\t\t{\r\n\t\t\tdocument.getElementById(\"edit\").style.display = \"block\";\r\n\t\t\tdocument.getElementById(\"view\").style.display = \"none\";\r\n\t\t\r\n\t\t}else if(document.getElementById(\"mode\").value == \"edit\" || document.getElementById(\"mode\").value == \"add\"  )\r\n\t\t{\r\n\t\t\tdocument.getElementById(\"edit\").style.display = \"block\";\r\n\t\t\tdocument.getElementById(\"view\").style.display = \"none\";\r\n\t\t}else\r\n\t\t{\r\n\t\t\tdocument.getElementById(\"edit\").style.display = \"none\";\r\n\t\t\tdocument.getElementById(\"view\").style.display = \"block\";\r\n\t\t}\r\n\r\n\t}\r\n\t// 등록폼 체크\r\n\tfunction checkForm(){\r\n\t\tvar form1 = document.form1;\r\n\r\n\r\n\t\tform1.submit();\r\n\t\t//\t특수문자 입력시 글 끝에 공백과 줄바꿈을 넣어야 깨지지 않음. 이유는 모르겠슴\r\n\t\t//\t\tw.content.value = w.content.value+' '+'\\n';\t\r\n\t\t\r\n\t}\r\n\t\r\n\tfunction onlyNumberInput()\r\n\t{\r\n\t\t\r\n\t\t\r\n\t var code = window.event.keyCode;\r\n\t \r\n\t if ((code > 34 && code < 41) || (code > 47 && code < 58) || (code > 95 && code < 106) || code == 8 || code == 9 || code == 13 || code == 46 || code == 190 || code == 110|| code == 189|| code == 109)\r\n\t {\r\n\t  \twindow.event.returnValue = true;\r\n\t\treturn;\r\n\t }else \r\n\t {\t \r\n\t \twindow.event.returnValue = false;\r\n\t \treturn;\r\n \t }\r\n\t}\r\n\t\r\n\t\r\n\tfunction removeDash(num)\r\n\t{\t\r\n\t\treturn num.split('-').join(\"\");\r\n\t}\r\n\t\r\n\tfunction goDel(seq)\r\n\t{\r\n\t\tvar admin_no = \"";
  private final static String _jspx_template10 = "\";\r\n\t\r\n\t\tif(confirm(\"정말 삭제하시겠습니까?\"))\r\n\t\t\tlocation.href(\"/jumyong/jumyong/confDel.do?admin_no=\"+admin_no+\"&seq=\"+seq);\r\n\t}\r\n\t\r\n</script>\r\n\r\n</head>\r\n\r\n<body onload=\"InitPage();\">\r\n\t<form id=\"confForm\" name=\"confForm\" method=\"post\" action=\"/jumyong/confEdit.do\">\r\n\t\t<input id=\"no\" name=\"no\" value=\"";
  private final static String _jspx_template11 = "\" type=\"hidden\"> \r\n\t\t<input id=\"mode\" name=\"mode\" value=\"";
  private final static String _jspx_template12 = "\" type=\"hidden\"> \r\n\t\t<input id=\"seq\" name=\"seq\" value=\"";
  private final static String _jspx_template13 = "\" type=\"hidden\"> \r\n\t\t<input id=\"SECTION\" name=\"SECTION\" value=\"";
  private final static String _jspx_template14 = "\" type=\"hidden\">\r\n\t\t<div id=\"view\" style=\"width: 100%;\">\r\n\t\t\t<table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td background=\"/img/tab_line_blue.gif\">\r\n\t\t\t\t\t\t<img id=\"conf_img\" name=\"conf_img\" src=\"/img/sub_petition_title6_on.gif\" alt=\"검토협의\" width=\"110\" height=\"22\" border=\"0\">\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td align=\"center\" class=\"contborder_purple\">\r\n\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse: collapse;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">번호</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">협의기관</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">협의일자</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">담당부서</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">담당자</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">전화번호</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">휴대전화</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">협의내용</td>\r\n\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template15 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">삭제여부</td>\r\n\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template16 = "\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template17 = "\r\n\t\t\t\t\t\t\t\t\t\t\t<tr onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\">";
  private final static String _jspx_template18 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" onclick=\"javascript:location.href('/jumyong/confEdit.do?no=";
  private final static String _jspx_template19 = "&seq=";
  private final static String _jspx_template20 = "&currentPage=";
  private final static String _jspx_template21 = "&countPerPage=";
  private final static String _jspx_template22 = "');\" style=\"cursor: pointer\">";
  private final static String _jspx_template23 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template24 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template25 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template26 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template27 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template28 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template29 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template30 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" onclick=\"javascript:goDel('";
  private final static String _jspx_template31 = "')\";\" style=\"cursor: pointer\"><font color=\"red\">삭제</font>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template32 = "\r\n\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template33 = "\r\n\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t</tr>\r\n\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse: collapse;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td width=\"15%\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">협의기관</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td width=\"35%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\">";
  private final static String _jspx_template34 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td width=\"15%\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">협의일자</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td width=\"35%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\">";
  private final static String _jspx_template35 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">담당부서</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\">";
  private final static String _jspx_template36 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">담당자</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\">";
  private final static String _jspx_template37 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">전화번호</td>\r\n\r\n\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template38 = "\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">휴대전화</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template39 = "\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"90\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">협의내용</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\" align=\"left\">";
  private final static String _jspx_template40 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"40\" align=\"right\">\r\n\t\t\t\t\t\t\t\t\t<table border=\"0\" width=\"100%\">\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td>";
  private final static String _jspx_template41 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template42 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"/jumyong/confEdit.do?no=";
  private final static String _jspx_template43 = "&mode=add&currentPage=";
  private final static String _jspx_template44 = "&countPerPage=";
  private final static String _jspx_template45 = "\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"/img/add_icon.gif\" alt=\"추가\" border=\"0\"> \r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t</a>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template46 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template47 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template48 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template49 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"50\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"/jumyong/confEdit.do?no=";
  private final static String _jspx_template50 = "&mode=edit&seq=";
  private final static String _jspx_template51 = "&currentPage=";
  private final static String _jspx_template52 = "&countPerPage=";
  private final static String _jspx_template53 = "\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"/img/mod_icon.gif\" alt=\"수정\" border=\"0\"> \r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t</a>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template54 = "\r\n\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template55 = "\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t</table>\r\n\t\t</div>\r\n\r\n\r\n\r\n\t\t<div id=\"edit\" style=\"width: 100%; display: none;\">\r\n\r\n\t\t\t<table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td background=\"/img/tab_line_blue.gif\"><img id=\"conf_img\" name=\"conf_img\" src=\"/img/sub_petition_title6_on.gif\" alt=\"검토협의\" width=\"110\" height=\"22\" border=\"0\">\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td align=\"center\" class=\"contborder_purple\">\r\n\r\n\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td><table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse: collapse;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">번호</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">협의기관</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">협의일자</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">담당부서</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">담당자</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">전화번호</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">휴대전화</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">협의내용</td>\r\n\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template56 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">삭제여부</td>\r\n\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template57 = "\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template58 = "\r\n\t\t\t\t\t\t\t\t\t\t\t<tr onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\">";
  private final static String _jspx_template59 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" onclick=\"javascript:location.href('/jumyong/confEdit.do?no=";
  private final static String _jspx_template60 = "&seq=";
  private final static String _jspx_template61 = "&currentPage=";
  private final static String _jspx_template62 = "&countPerPage=";
  private final static String _jspx_template63 = "');\" style=\"cursor: pointer\">";
  private final static String _jspx_template64 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template65 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template66 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template67 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template68 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template69 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template70 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template71 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" onclick=\"javascript:goDel('";
  private final static String _jspx_template72 = "')\" style=\"cursor: pointer\"><font color=\"red\">삭제</font>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template73 = "\r\n\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template74 = "\r\n\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"40\" align=\"center\"></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse: collapse;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">협의기관</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"ORGANIZATION\" id=\"ORGANIZATION\" type=\"text\" class=\"input_form1\" style=\"width: 120px\" value=\"";
  private final static String _jspx_template75 = "\" maxlength=10>\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">협의일자</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\" align=\"left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"CONF_DATE\" id=\"CONF_DATE\" type=\"text\" class=\"input_form1\" style=\"width: 120px; ime-mode: disabled;\" value=\"";
  private final static String _jspx_template76 = "\" onKeyDown=\"onlyNumberInput();\" maxlength=10 readonly>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, document.getElementById('CONF_DATE'), 'yyyymmdd');\" style=\"cursor: pointer\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">담당부서</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"MANAGE_DEPT\" id=\"MANAGE_DEPT\" type=\"text\" class=\"input_form1\" style=\"width: 120px\" value=\"";
  private final static String _jspx_template77 = "\" maxlength=10>\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">담당자</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"MANAGER\" id=\"MANAGER\" type=\"text\" class=\"input_form1\" style=\"width: 120px\" value=\"";
  private final static String _jspx_template78 = "\" maxlength=10>\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">전화번호</td>\r\n\r\n\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template79 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template80 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"TEL1\" id=\"TEL1\" type=\"text\" class=\"input_form1\" style=\"width: 40px; ime-mode: disabled;\" onKeyDown=\"onlyNumberInput();\" maxlength=3>\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t- <input name=\"TEL2\" id=\"TEL2\" type=\"text\" class=\"input_form1\" style=\"width: 40px; ime-mode: disabled;\" onKeyDown=\"onlyNumberInput();\" maxlength=4>\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t- <input name=\"TEL3\" id=\"TEL3\" type=\"text\" class=\"input_form1\" style=\"width: 40px; ime-mode: disabled;\" onKeyDown=\"onlyNumberInput();\" maxlength=4>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template81 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template82 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"TEL1\" id=\"TEL1\" type=\"text\" class=\"input_form1\" value=\"";
  private final static String _jspx_template83 = "\" style=\"width: 120px; ime-mode: disabled;\" onKeyDown=\"onlyNumberInput();\" maxlength=12>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template84 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template85 = " \r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"TEL\" id=\"TEL\" type=\"hidden\" class=\"input_form1\" value=\"";
  private final static String _jspx_template86 = "\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">휴대전화</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template87 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template88 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"HP1\" id=\"HP1\" type=\"text\" class=\"input_form1\" style=\"width: 40px; ime-mode: disabled;\" onKeyDown=\"onlyNumberInput();\" maxlength=3>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t- <input name=\"HP2\" id=\"HP2\" type=\"text\" class=\"input_form1\" style=\"width: 40px; ime-mode: disabled;\" onKeyDown=\"onlyNumberInput();\" maxlength=4>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t- <input name=\"HP3\" id=\"HP3\" type=\"text\" class=\"input_form1\" style=\"width: 40px; ime-mode: disabled;\" onKeyDown=\"onlyNumberInput();\" maxlength=4>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template89 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template90 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"HP1\" id=\"HP1\" type=\"text\" class=\"input_form1\" value=\"";
  private final static String _jspx_template91 = "\" style=\"width: 120px; ime-mode: disabled;\" onKeyDown=\"onlyNumberInput();\" maxlength=13>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template92 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template93 = " \r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"HP\" id=\"HP\" type=\"hidden\" class=\"input_form1\" style=\"width: 120px; ime-mode: disabled;\" value=\"";
  private final static String _jspx_template94 = "\" onKeyDown=\"onlyNumberInput();\" maxlength=11>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"80\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">협의내용</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\" align=\"left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<textarea name=\"CONF_COMMENT\" id=\"CONF_COMMENT\" class=\"input_form1\" style=\"width: 600px\" cols=\"70\" rows=\"5\" wrap=\"VIRTUAL\" style=\"ime-mode:active;\">";
  private final static String _jspx_template95 = "</textarea>\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"40\" align=\"right\">\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template96 = "\r\n\t\t\t\t\t\t\t\t\t\t<img src=\"/img/can_icon.gif\" alt=\"취소\" border=\"0\" onclick=\"javascript:history.back();\" style=\"cursor: pointer\">\r\n\t\t\t\t\t\t\t\t\t\t<img src=\"/img/save_icon2.gif\" alt=\"저장\" width=\"56\" height=\"18\" border=\"0\" onClick=\"javascript:submitClick();\" style=\"cursor: pointer\">\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template97 = "\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t</table>\r\n\t\t</div>\r\n\t</form>\r\n</body>\r\n</html>\r\n\r\n";
}
