package jeus_jspwork._jsp._jumyong._jumyong;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_info_5finspect_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      out.write(_jspx_template10);
      // jsp code [from=(122,35);to=(122,37)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${no}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(139,47);to=(139,49)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${no}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(140,54);to=(140,58)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mode}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(141,49);to=(141,53)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${seq }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(142,57);to=(142,65)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_0_fn(pageContext, null)) return;


      out.write(_jspx_template17);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template33);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_2_fn(pageContext, null)) return;


      out.write(_jspx_template35);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_3_fn(pageContext, null)) return;


      out.write(_jspx_template37);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_4_fn(pageContext, null)) return;


      out.write(_jspx_template39);
      // jsp code [from=(207,95);to=(207,112)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${inspect.INSPECTOR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template40);
      // jsp code [from=(209,95);to=(209,115)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${inspect.INSPECT_DATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template41);
      // jsp code [from=(213,95);to=(213,118)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${inspect.INSPECT_OPINION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template42);
      // jsp code [from=(217,95);to=(217,118)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${inspect.MANAGER_OPINION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template43);
      // jsp code [from=(221,95);to=(221,121)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${inspect.APPROVAL_CONDITION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template44);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_5_fn(pageContext, null)) return;


      out.write(_jspx_template51);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_7_fn(pageContext, null)) return;


      out.write(_jspx_template59);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_9_fn(pageContext, null)) return;


      out.write(_jspx_template61);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_1_fn(pageContext, null)) return;


      out.write(_jspx_template77);
      // ----  spring:bind ---- //
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_0 = new org.springframework.web.servlet.tags.BindTag();
      _jspx_th_spring_bind_0.setPageContext(pageContext);
      _jspx_th_spring_bind_0.setPath("inspect.RESULT");
      try {
        try {
          int _jspx_eval_spring_bind_0 = _jspx_th_spring_bind_0.doStartTag();
          if (_jspx_eval_spring_bind_0 != Tag.SKIP_BODY) {
            do {
              org.springframework.web.servlet.support.BindStatus status = null;
              status = (org.springframework.web.servlet.support.BindStatus) pageContext.findAttribute("status");
              out.write(_jspx_template78);
              // ----  c:if ---- invoke //
              if (_jspx_th_c_if_11_fn(pageContext, _jspx_th_spring_bind_0)) return;


              out.write(_jspx_template80);
              // ----  c:if ---- invoke //
              if (_jspx_th_c_if_12_fn(pageContext, _jspx_th_spring_bind_0)) return;


              out.write(_jspx_template82);
              // ----  c:if ---- invoke //
              if (_jspx_th_c_if_13_fn(pageContext, _jspx_th_spring_bind_0)) return;


              out.write(_jspx_template84);

            } while (_jspx_th_spring_bind_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
          }
          if (_jspx_th_spring_bind_0.doEndTag() == Tag.SKIP_PAGE)
            return;
        } catch (Throwable t) {
          _jspx_th_spring_bind_0.doCatch(t);
        } finally {
          _jspx_th_spring_bind_0.doFinally();
        }
      } finally {
        _jspx_th_spring_bind_0.release();
      }

      out.write(_jspx_template85);
      // jsp code [from=(334,125);to=(334,142)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${inspect.INSPECTOR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template86);
      // jsp code [from=(340,140);to=(340,160)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${inspect.INSPECT_DATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template87);
      // jsp code [from=(351,180);to=(351,203)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${inspect.INSPECT_OPINION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template88);
      // jsp code [from=(357,177);to=(357,200)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${inspect.MANAGER_OPINION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template89);
      // jsp code [from=(363,185);to=(363,211)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${inspect.APPROVAL_CONDITION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template90);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_14_fn(pageContext, null)) return;


      out.write(_jspx_template92);

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
          out.write(_jspx_template16);

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
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${iList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("board");
    _jspx_th_c_forEach_0.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template18);
            // jsp code [from=(171,74);to=(171,83)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${idx.count}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template19);
            // jsp code [from=(172,62);to=(172,72)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template20);
            // jsp code [from=(173,62);to=(173,94)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(board.INSPECT_DATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template21);
            // jsp code [from=(174,62);to=(174,77)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.INSPECTOR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template22);
            // jsp code [from=(176,109);to=(176,111)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${no}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template23);
            // jsp code [from=(176,119);to=(176,128)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template24);
            // jsp code [from=(176,144);to=(176,155)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template25);
            // jsp code [from=(176,172);to=(176,184)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${countPerPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template26);
            // jsp code [from=(177,43);to=(177,64)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.INSPECT_OPINION}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template27);
            // jsp code [from=(178,62);to=(178,83)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.MANAGER_OPINION}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template28);
            // jsp code [from=(179,62);to=(179,86)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.APPROVAL_CONDITION}",java.lang.String.class , pageContext.getVariableResolver(), null));

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
    _jspx_th_c_if_2.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${inspect.RESULT == '1' }", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
      if (_jspx_eval_c_if_2 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template34);

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
    _jspx_th_c_if_3.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${inspect.RESULT == '2' }", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
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
    _jspx_th_c_if_4.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${inspect.RESULT == '3' }", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
      if (_jspx_eval_c_if_4 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template38);

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
    _jspx_th_c_if_5.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION != '4'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
      if (_jspx_eval_c_if_5 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template45);
          // ----  c:if ---- invoke //
          if (_jspx_th_c_if_6_fn(pageContext, _jspx_th_c_if_5)) return true;


          out.write(_jspx_template50);

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
    _jspx_th_c_if_7.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION != '4'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_7 = _jspx_th_c_if_7.doStartTag();
      if (_jspx_eval_c_if_7 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template52);
          // ----  c:if ---- invoke //
          if (_jspx_th_c_if_8_fn(pageContext, _jspx_th_c_if_7)) return true;


          out.write(_jspx_template58);

        } while (_jspx_th_c_if_7.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_7.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_7.release();
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
    _jspx_th_c_if_9.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION != '4'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_9 = _jspx_th_c_if_9.doStartTag();
      if (_jspx_eval_c_if_9 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template60);

        } while (_jspx_th_c_if_9.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_9.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_9.release();
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
    _jspx_th_c_forEach_1.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${iList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_1.setVar("board");
    _jspx_th_c_forEach_1.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
        if (_jspx_eval_c_forEach_1 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template62);
            // jsp code [from=(292,74);to=(292,83)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${idx.count}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template63);
            // jsp code [from=(293,62);to=(293,72)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template64);
            // jsp code [from=(294,62);to=(294,94)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(board.INSPECT_DATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template65);
            // jsp code [from=(295,62);to=(295,77)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.INSPECTOR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template66);
            // jsp code [from=(297,109);to=(297,111)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${no}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template67);
            // jsp code [from=(297,119);to=(297,128)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template68);
            // jsp code [from=(297,144);to=(297,155)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template69);
            // jsp code [from=(297,172);to=(297,184)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${countPerPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template70);
            // jsp code [from=(298,43);to=(298,64)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.INSPECT_OPINION}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template71);
            // jsp code [from=(299,62);to=(299,83)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.MANAGER_OPINION}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template72);
            // jsp code [from=(300,62);to=(300,86)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.APPROVAL_CONDITION}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template73);
            // ----  c:if ---- invoke //
            if (_jspx_th_c_if_10_fn(pageContext, _jspx_th_c_forEach_1)) return true;


            out.write(_jspx_template76);

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

  private boolean _jspx_th_c_if_11_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:if ---- //
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_11 = new org.apache.taglibs.standard.tag.rt.core.IfTag();
    _jspx_th_c_if_11.setPageContext(pageContext);
    _jspx_th_c_if_11.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_if_11.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${inspect.RESULT == '1' }", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_11 = _jspx_th_c_if_11.doStartTag();
      if (_jspx_eval_c_if_11 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template79);

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
    _jspx_th_c_if_12.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_if_12.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${inspect.RESULT == '2' }", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_12 = _jspx_th_c_if_12.doStartTag();
      if (_jspx_eval_c_if_12 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template81);

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
    _jspx_th_c_if_13.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_if_13.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${inspect.RESULT == '3' }", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_13 = _jspx_th_c_if_13.doStartTag();
      if (_jspx_eval_c_if_13 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template83);

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
    _jspx_th_c_if_14.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION != '4'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_14 = _jspx_th_c_if_14.doStartTag();
      if (_jspx_eval_c_if_14 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template91);

        } while (_jspx_th_c_if_14.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_14.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_14.release();
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
          // jsp code [from=(181,90);to=(181,99)]
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

  private boolean _jspx_th_c_if_6_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:if ---- //
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = new org.apache.taglibs.standard.tag.rt.core.IfTag();
    _jspx_th_c_if_6.setPageContext(pageContext);
    _jspx_th_c_if_6.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_if_6.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${listSize == '0'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
      if (_jspx_eval_c_if_6 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template46);
          // jsp code [from=(233,75);to=(233,77)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${no}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template47);
          // jsp code [from=(233,102);to=(233,113)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template48);
          // jsp code [from=(233,130);to=(233,142)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${countPerPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template49);

        } while (_jspx_th_c_if_6.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_6.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_6.release();
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
    _jspx_th_c_if_8.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${listSize != '0'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_8 = _jspx_th_c_if_8.doStartTag();
      if (_jspx_eval_c_if_8 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template53);
          // jsp code [from=(242,67);to=(242,69)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${no}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template54);
          // jsp code [from=(242,87);to=(242,90)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${seq}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template55);
          // jsp code [from=(242,106);to=(242,117)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template56);
          // jsp code [from=(242,134);to=(242,146)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${countPerPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template57);

        } while (_jspx_th_c_if_8.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_8.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_8.release();
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
    _jspx_th_c_if_10.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION != '4'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_10 = _jspx_th_c_if_10.doStartTag();
      if (_jspx_eval_c_if_10 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template74);
          // jsp code [from=(302,90);to=(302,99)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template75);

        } while (_jspx_th_c_if_10.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_10.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_10.release();
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
  private final static String _jspx_template7 = "    \r\n";
  private final static String _jspx_template8 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('사용자의 사용시간이 종료되었습니다. 다시 접속 해주시기 바랍니다.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template9 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html>\r\n    <head>\r\n        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n        <title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n        <style type=\"text/css\">\r\n            <!--\r\n            body {\r\n                margin: 0px;\r\n                background-image: url(/img/left_back.gif);\r\n            }\r\n            -->\r\n        </style>\r\n        <link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n        <script language=\"javascript\" src=\"/js/common.js\"></script>\r\n        <script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script>\r\n        <script language=\"javascript\" >\r\n\r\n            function submitClick()\r\n            {\r\n                var form = document.inspectForm;\r\n\t\t\r\n                if (getByteLength(form.INSPECT_OPINION) > 500) {\r\n                    alert(\"현장조사 의견은 한글 500자(영문 1000자) 이상 입력할 수 없습니다.\\n현재 글자수:\"+getByteLength(form.INSPECT_OPINION));\r\n                    return false;\r\n                }\r\n    \t\r\n                if (getByteLength(form.MANAGER_OPINION) > 500) {\r\n                    alert(\"담당자 의견은 한글 500자(영문 1000자) 이상 입력할 수 없습니다.\\n현재 글자수:\"+getByteLength(form.MANAGER_OPINION));\r\n                    return false;\r\n                }\r\n    \t\r\n                if (getByteLength(form.APPROVAL_CONDITION) > 500) {\r\n                    alert(\"허가조건은 한글 500자(영문 1000자) 이상 입력할 수 없습니다.\\n현재 글자수:\"+getByteLength(form.APPROVAL_CONDITION));\r\n                    return false;\r\n                }\r\n\r\n\r\n\t\t\r\n                //저장 사항 체크 \r\n\t\t\r\n                if(getChecked('RESULT',0) || getChecked('RESULT',1) || getChecked('RESULT',2))\r\n                {\r\n\r\n                    var inspectForm = document.inspectForm;\r\n\r\n                    inspectForm.submit();\r\n                }else\r\n                {\r\n                    alert(\"점검결과를 입력해 주십시오.\");\r\n                }\r\n                //parent.parent.location.reload();\r\n                //var radioObj = document.getElementById(\"RESULT\");\r\n\r\n            }\r\n\t\r\n            function getChecked(nameVal,numVal)\r\n            {\r\n                return document.getElementsByName(nameVal)[numVal].checked;\r\n            }\r\n\t\r\n            function subTabClick(hiddenSubTabName,visibleSubTabName)\r\n            {\t\r\n                document.getElementById(hiddenSubTabName).style.display = 'none';\t\r\n                document.getElementById(visibleSubTabName).style.display = 'block';\t\r\n            }\r\n\t\r\n\t\r\n            function InitPage()\r\n            {\t\r\n\r\n                if(document.getElementById(\"mode\").value == \"add\"  )\r\n                {\r\n                    document.getElementById(\"edit\").style.display = \"block\";\r\n                    document.getElementById(\"view\").style.display = \"none\";\r\n                }else if(document.getElementById(\"mode\").value == \"edit\" || document.getElementById(\"mode\").value == \"add\"  )\r\n                {\r\n                    document.getElementById(\"edit\").style.display = \"block\";\r\n                    document.getElementById(\"view\").style.display = \"none\";\r\n                }else\r\n                {\r\n                    document.getElementById(\"edit\").style.display = \"none\";\r\n                    document.getElementById(\"view\").style.display = \"block\";\r\n                }\r\n            }\r\n            // 등록폼 체크\r\n            function checkForm(){\r\n                var form1 = document.form1;\r\n                //alert(form1.year.value);\r\n\r\n                form1.submit();\r\n                //\t특수문자 입력시 글 끝에 공백과 줄바꿈을 넣어야 깨지지 않음. 이유는 모르겠슴\r\n                //\t\tw.content.value = w.content.value+' '+'\\n';\t\r\n\t\t\r\n            }\r\n\t\r\n            function onlyNumberInput()\r\n            {\r\n\t\t\r\n\t\t\r\n                var code = window.event.keyCode;\r\n\t\r\n                if ((code > 34 && code < 41) || (code > 47 && code < 58) || (code > 95 && code < 106) || code == 8 || code == 9 || code == 13 || code == 46 || code == 190 || code == 110|| code == 189|| code == 109)\r\n                {\r\n                    window.event.returnValue = true;\r\n                    ";
  private final static String _jspx_template10 = "return;\r\n                }else \r\n                {\t \r\n                    window.event.returnValue = false;\r\n                    return;\r\n                }\r\n            }\r\n\t\r\n\r\n\t\r\n            function goDel(seq)\r\n            {\r\n                var admin_no = \"";
  private final static String _jspx_template11 = "\";\r\n\t\r\n                if(confirm(\"정말 삭제하시겠습니까?\"))\r\n                    location.href(\"/jumyong/jumyong/inspectDel.do?admin_no=\"+admin_no+\"&seq=\"+seq);\r\n            }\r\n\t\r\n\r\n        </script>\r\n\r\n    </head>\r\n\r\n    <body onload=\"InitPage();\">\r\n\r\n\r\n\r\n        <form id=\"inspectForm\" name=\"inspectForm\" method=\"post\" action = \"/jumyong/inspectEdit.do\" >\r\n\r\n            <input id=\"no\" name=\"no\" value=\"";
  private final static String _jspx_template12 = "\" type=\"hidden\" >\r\n            <input id = \"mode\" name=\"mode\"  value=\"";
  private final static String _jspx_template13 = "\" type=\"hidden\" >\r\n            <input id=\"seq\" name=\"seq\" value=\"";
  private final static String _jspx_template14 = "\" type=\"hidden\">\r\n            <input id=\"SECTION\" name=\"SECTION\" value=\"";
  private final static String _jspx_template15 = "\" type=\"hidden\">\r\n\r\n            <div id=\"view\" style=\"width:100%;\">\r\n                <table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">   \r\n                    <tr>\r\n                        <td background=\"/img/tab_line_blue.gif\">\r\n                        \t<img id=\"conf_img\" name=\"conf_img\" src=\"/img/sub_petition_title5_on.gif\" alt=\"현장조사\" width=\"110\" height=\"22\" border=\"0\"  >\r\n                        </td>\r\n                    </tr>        \r\n                    <tr>\r\n                        <td align=\"center\" class=\"contborder_purple\">\r\n\r\n                            <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                                <tr>\r\n                                    <td><table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n                                            <tr>\r\n                                                <td height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">번호</td>\r\n                                                <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점검결과</td>\r\n                                                <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조사일자</td>\r\n                                                <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조사자</td>\r\n                                                <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">현장조사 의견</td>\r\n                                                <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">담당자 의견</td>\r\n                                                <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">허가조건 </td>\r\n                                            ";
  private final static String _jspx_template16 = "\r\n                                                <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">삭제여부</td>\r\n                                            ";
  private final static String _jspx_template17 = "                    \r\n                                </tr>\r\n                                ";
  private final static String _jspx_template18 = "\r\n                                    <tr onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\" >                     \r\n                                        <td height=\"26\" align=\"center\">";
  private final static String _jspx_template19 = "</td>\r\n                                        <td align=\"center\">";
  private final static String _jspx_template20 = "</td>\r\n                                        <td align=\"center\">";
  private final static String _jspx_template21 = "</td>\r\n                                        <td align=\"center\">";
  private final static String _jspx_template22 = "</td>\r\n                                        <td align=\"center\"\r\n                                            onclick=\"javascript:location.href('/jumyong/inspectEdit.do?no=";
  private final static String _jspx_template23 = "&seq=";
  private final static String _jspx_template24 = "&currentPage=";
  private final static String _jspx_template25 = "&countPerPage=";
  private final static String _jspx_template26 = "');\" style=\"cursor:pointer\" >\r\n                                        ";
  private final static String _jspx_template27 = "</td>\r\n                                        <td align=\"center\">";
  private final static String _jspx_template28 = "</td>\r\n                                        <td align=\"center\">";
  private final static String _jspx_template29 = "</td>\r\n                                    ";
  private final static String _jspx_template30 = "\r\n                                        <td align=\"center\"  onclick=\"javascript:goDel('";
  private final static String _jspx_template31 = "')\";\" style=\"cursor:pointer\" >\r\n                                            <font color=\"red\">삭제</font></td>\r\n                                    ";
  private final static String _jspx_template32 = "\r\n\r\n\r\n                                    </tr>\r\n                                ";
  private final static String _jspx_template33 = "\r\n                            </table></td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td height=\"40\" align=\"center\"></td>\r\n                    </tr>\r\n\r\n                    <tr>\r\n                        <td>\r\n                            <table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n                                <tr>\r\n                                    <td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점검결과</td>\r\n                                    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\" align=\"left\">\r\n                                <input type=\"radio\" name=\"RESULT_VIEW\" disabled=\"true\" value=\"1\" ";
  private final static String _jspx_template34 = " checked ";
  private final static String _jspx_template35 = "  > 허가\r\n                                <input type=\"radio\" name=\"RESULT_VIEW\" disabled=\"true\" value=\"2\" ";
  private final static String _jspx_template36 = " checked ";
  private final static String _jspx_template37 = "  > 불허\r\n                                <input type=\"radio\" name=\"RESULT_VIEW\" disabled=\"true\" value=\"3\" ";
  private final static String _jspx_template38 = " checked ";
  private final static String _jspx_template39 = "  > 보류\r\n                        </td>                    \r\n                    </tr>\r\n                    <tr>\r\n                        <td width=\"15%\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조사자</td>\r\n                        <td width=\"35%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\">";
  private final static String _jspx_template40 = "</td>\r\n                        <td width=\"15%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조사일자</td>\r\n                        <td width=\"35%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\">";
  private final static String _jspx_template41 = "</td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td width=\"100\" height=\"60\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">현장조사 의견</td>\r\n                        <td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\" align=\"left\">";
  private final static String _jspx_template42 = "</td>                    \r\n                    </tr>  \r\n                    <tr>\r\n                        <td width=\"100\" height=\"60\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">담당자 의견</td>\r\n                        <td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\" align=\"left\">";
  private final static String _jspx_template43 = "</td>                     \r\n                    </tr> \r\n                    <tr>\r\n                        <td width=\"100\" height=\"60\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">허가조건</td>\r\n                        <td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\" align=\"left\">";
  private final static String _jspx_template44 = "</td>                     \r\n                    </tr>                                \r\n                </table></td>\r\n                </tr>\r\n\r\n                <tr>              \r\n                    <td height=\"40\" align=\"right\">\r\n                        <table border=\"0\" width=\"100%\">\r\n                            <tr>\r\n                                <td>\r\n                            ";
  private final static String _jspx_template45 = "\r\n                                ";
  private final static String _jspx_template46 = "\r\n                                    <a href=\"/jumyong/inspectEdit.do?no=";
  private final static String _jspx_template47 = "&mode=add&currentPage=";
  private final static String _jspx_template48 = "&countPerPage=";
  private final static String _jspx_template49 = "\">\r\n                                        <img src=\"/img/add_icon.gif\" alt=\"추가\" border=\"0\">\r\n                                    </a>\r\n                                ";
  private final static String _jspx_template50 = "\r\n                            ";
  private final static String _jspx_template51 = "\r\n                    </td>\r\n                ";
  private final static String _jspx_template52 = "\r\n                    ";
  private final static String _jspx_template53 = " \r\n                        <td width=\"50\">\r\n                            <a href=\"/jumyong/inspectEdit.do?no=";
  private final static String _jspx_template54 = "&mode=edit&seq=";
  private final static String _jspx_template55 = "&currentPage=";
  private final static String _jspx_template56 = "&countPerPage=";
  private final static String _jspx_template57 = "\">\r\n                                <img src=\"/img/mod_icon.gif\" alt=\"수정\" border=\"0\">\r\n                            </a>\t \t\t                \r\n                        </td>\r\n                    ";
  private final static String _jspx_template58 = "\r\n                ";
  private final static String _jspx_template59 = "\r\n                </tr>\r\n                </table>\r\n                </td>\r\n                </tr>\r\n\r\n                </table>\r\n\r\n                </td>\r\n                </tr>\r\n\r\n                </table>\r\n\r\n\r\n            </div>\r\n\r\n\r\n\r\n            <div id=\"edit\" style=\"width:100%;display:none;\">\r\n                <table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">  \r\n                    <tr>\r\n                        <td background=\"/img/tab_line_blue.gif\"><img id=\"conf_img\" name=\"conf_img\" src=\"/img/sub_petition_title5_on.gif\" alt=\"현장조사\" width=\"110\" height=\"22\" border=\"0\"  ></td>\r\n                    </tr>         \r\n                    <tr>\r\n                        <td align=\"center\" class=\"contborder_purple\">\r\n\r\n\r\n\r\n                            <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                                <tr>\r\n                                    <td><table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n                                            <tr>\r\n                                                <td height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">번호</td>\r\n                                                <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점검결과</td>\r\n                                                <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조사일자</td>\r\n                                                <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조사자</td>\r\n                                                <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">현장조사 의견</td>\r\n                                                <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">담당자 의견</td>\r\n                                                <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">허가조건 </td>\r\n                                            ";
  private final static String _jspx_template60 = "\r\n                                                <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">삭제여부</td>\r\n                                            ";
  private final static String _jspx_template61 = "\r\n                                </tr>\r\n                                ";
  private final static String _jspx_template62 = "\r\n                                    <tr onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\" >                     \r\n                                        <td height=\"26\" align=\"center\">";
  private final static String _jspx_template63 = "</td>\r\n                                        <td align=\"center\">";
  private final static String _jspx_template64 = "</td>\r\n                                        <td align=\"center\">";
  private final static String _jspx_template65 = "</td>\r\n                                        <td align=\"center\">";
  private final static String _jspx_template66 = "</td>\r\n                                        <td align=\"center\"\r\n                                            onclick=\"javascript:location.href('/jumyong/inspectEdit.do?no=";
  private final static String _jspx_template67 = "&seq=";
  private final static String _jspx_template68 = "&currentPage=";
  private final static String _jspx_template69 = "&countPerPage=";
  private final static String _jspx_template70 = "');\" style=\"cursor:pointer\" >\r\n                                        ";
  private final static String _jspx_template71 = "</td>\r\n                                        <td align=\"center\">";
  private final static String _jspx_template72 = "</td>\r\n                                        <td align=\"center\">";
  private final static String _jspx_template73 = "</td>\r\n                                    ";
  private final static String _jspx_template74 = "                    \r\n                                        <td align=\"center\"  onclick=\"javascript:goDel('";
  private final static String _jspx_template75 = "')\";\" style=\"cursor:pointer\" >\r\n                                            <font color=\"red\">삭제</font></td>\r\n                                    ";
  private final static String _jspx_template76 = "\r\n                                    </tr>\r\n                                ";
  private final static String _jspx_template77 = "\r\n                            </table></td>\r\n                    </tr>\r\n                    <tr>\r\n                        <td height=\"40\" align=\"center\">\r\n                        </td>                    \r\n                    </tr>\r\n\r\n                    <tr>\r\n                        <td>\r\n\r\n\r\n                            <table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n                                <tr>\r\n                                    <td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점검결과</td>\r\n\r\n                                    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\" align=\"left\">\r\n                                ";
  private final static String _jspx_template78 = "\r\n                                    <input type=\"radio\" name=\"RESULT\" value=\"1\"\t";
  private final static String _jspx_template79 = " checked ";
  private final static String _jspx_template80 = "  > 허가\r\n                                    <input type=\"radio\" name=\"RESULT\" value=\"2\" ";
  private final static String _jspx_template81 = " checked ";
  private final static String _jspx_template82 = "  > 불허\r\n                                    <input type=\"radio\" name=\"RESULT\" value=\"3\" ";
  private final static String _jspx_template83 = " checked ";
  private final static String _jspx_template84 = "  > 보류\r\n                                ";
  private final static String _jspx_template85 = "\r\n                        </td>                    \r\n                    </tr>                             \r\n\r\n                    <tr>\r\n                        <td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조사자</td>\r\n                        <td bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\">\r\n                        <input id=\"INSPECTOR\" name=\"INSPECTOR\" type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"";
  private final static String _jspx_template86 = "\">\r\n                    </td>\r\n                    <td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조사일자</td>\r\n                    <td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\" align=\"left\">\r\n                            <tr>\r\n                                <td>\r\n                                \t<input id=\"INSPECT_DATE\" name=\"INSPECT_DATE\" type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"";
  private final static String _jspx_template87 = "\"  style=\"ime-mode:disabled;\" onKeyDown=\"onlyNumberInput();\" maxlength=10 readonly>\r\n                    \t\t\t</td>\r\n                    <td>\r\n                        <img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, document.getElementById('INSPECT_DATE'), 'yyyymmdd');\" style=\"cursor:pointer\" >\r\n                    </td>\r\n                    </tr>\r\n                </table></td>\r\n                </tr>\r\n                <tr>\r\n                    <td width=\"100\" height=\"60\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">현장조사 의견</td>\r\n                    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\"  align=\"left\">\r\n                    <textarea id=\"INSPECT_OPINION\" name=\"INSPECT_OPINION\"  class=\"input_form1\" style=\"width:600px\"  cols=\"70\" rows=\"3\"  wrap=\"VIRTUAL\" style=\"ime-mode:active;\" >";
  private final static String _jspx_template88 = "</textarea>\r\n                </td>                    \r\n                </tr>  \r\n                <tr>\r\n                    <td width=\"100\" height=\"60\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">담당자 의견</td>\r\n                    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\"  align=\"left\">\r\n                    <textarea id=\"MANAGER_OPINION\" name=\"MANAGER_OPINION\"class=\"input_form1\" style=\"width:600px\"  cols=\"70\" rows=\"3\" wrap=\"VIRTUAL\" style=\"ime-mode:active;\" >";
  private final static String _jspx_template89 = "</textarea>\r\n                </td>\r\n                </tr> \r\n                <tr>\r\n                    <td width=\"100\" height=\"60\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">허가조건</td>\r\n                    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\"  align=\"left\">\r\n                    <textarea  id=\"APPROVAL_CONDITION\" name=\"APPROVAL_CONDITION\" class=\"input_form1\" style=\"width:600px\"  cols=\"70\" rows=\"3\" wrap=\"VIRTUAL\" style=\"ime-mode:active;\" >";
  private final static String _jspx_template90 = "</textarea>\r\n                </td>                     \r\n                </tr>                                \r\n                </table></td>\r\n                </tr>\r\n\r\n\r\n\r\n                <tr>\r\n                    <td height=\"40\" align=\"right\">\r\n                ";
  private final static String _jspx_template91 = "\r\n                    <img src=\"/img/can_icon.gif\" alt=\"취소\" border=\"0\" onclick=\"javascript:history.back();\" style=\"cursor:pointer\" >                \r\n                    <img src=\"/img/save_icon2.gif\" alt=\"저장\" width=\"56\" height=\"18\" border=\"0\" onClick=\"javascript:submitClick();\"  style=\"cursor:pointer\">\r\n                ";
  private final static String _jspx_template92 = "\r\n\r\n                </td>\r\n                </tr>\r\n                </table>\r\n\r\n\r\n\r\n                </td>\r\n                </tr>\r\n\r\n                </table>\r\n\r\n\r\n\r\n            </div>\r\n\r\n        </form>\r\n\r\n    </body>\r\n</html>\r\n\r\n";
}
