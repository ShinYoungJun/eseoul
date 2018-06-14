package jeus_jspwork._jsp._jumyong._saewe;

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
      // jsp code [from=(163,26);to=(163,33)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${YearVal}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(192,67);to=(192,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(193,65);to=(193,75)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PURPOSE_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(194,61);to=(194,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${totalcnt}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(196,59);to=(196,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${message}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(197,57);to=(197,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${search}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(198,61);to=(198,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bugwa_id}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(244,109);to=(244,115)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GIGAN1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(247,109);to=(247,115)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GIGAN2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(253,19);to=(253,25)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${cal_yn}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(261,18);to=(261,26)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${use_type}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(267,18);to=(267,32)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${occupancy_type}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(275,19);to=(275,35)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${taxation_section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // jsp code [from=(281,19);to=(281,30)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${taxation_yn}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);
      // jsp code [from=(297,37);to=(297,44)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${gu_code}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template26);
      // jsp code [from=(303,19);to=(303,30)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bjdong_code}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // jsp code [from=(310,109);to=(310,115)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${BONBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template28);
      // jsp code [from=(311,107);to=(311,112)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${BUBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template29);
      // jsp code [from=(318,150);to=(318,154)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template30);
      // jsp code [from=(327,153);to=(327,160)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMINNO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template31);
      // jsp code [from=(342,82);to=(342,90)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${totalcnt}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template32);
      // ----  c:choose ---- invoke //
      if (_jspx_th_c_choose_0_fn(pageContext, null)) return;


      out.write(_jspx_template65);
      // jsp code [from=(413,16);to=(413,23)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${pageing}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template66);

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


          out.write(_jspx_template62);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template64);

        } while (_jspx_th_c_choose_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_choose_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_choose_0.release();
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
    _jspx_th_c_when_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist!= null && !empty blist}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
      if (_jspx_eval_c_when_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template34);
          // ----  c:forEach ---- invoke //
          if (_jspx_th_c_forEach_0_fn(pageContext, _jspx_th_c_when_0)) return true;


          out.write(_jspx_template61);

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
          out.write(_jspx_template63);

        } while (_jspx_th_c_otherwise_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_otherwise_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_otherwise_0.release();
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("board");
    _jspx_th_c_forEach_0.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template35);
            // jsp code [from=(373,46);to=(373,60)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template36);
            // jsp code [from=(373,67);to=(373,76)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template37);
            // jsp code [from=(373,82);to=(373,96)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SECTION }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template38);
            // jsp code [from=(374,48);to=(374,56)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.RN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template39);
            // jsp code [from=(375,75);to=(375,89)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

            // jsp code [from=(376,19);to=(376,66)]
            out.write(_jspx_template40);
            out.write(_jspx_template41);
            // jsp code [from=(377,47);to=(377,57)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template42);
            // jsp code [from=(378,36);to=(378,48)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TAX_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template43);
            // jsp code [from=(379,47);to=(379,57)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TYPE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template44);
            // jsp code [from=(380,47);to=(380,65)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SECTION_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template45);
            // jsp code [from=(381,48);to=(381,66)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_SET_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template46);
            // jsp code [from=(382,36);to=(382,52)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TAXCODE_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template47);
            // jsp code [from=(383,36);to=(383,52)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PURPOSE_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template48);
            // jsp code [from=(384,36);to=(384,46)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template49);
            // jsp code [from=(385,36);to=(385,46)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.AREA}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template50);
            // ----  c:if ---- invoke //
            if (_jspx_th_c_if_0_fn(pageContext, _jspx_th_c_forEach_0)) return true;


            // ----  c:if ---- invoke //
            if (_jspx_th_c_if_1_fn(pageContext, _jspx_th_c_forEach_0)) return true;


            out.write(_jspx_template52);
            // ----  c:if ---- invoke //
            if (_jspx_th_c_if_2_fn(pageContext, _jspx_th_c_forEach_0)) return true;


            // ----  c:if ---- invoke //
            if (_jspx_th_c_if_3_fn(pageContext, _jspx_th_c_forEach_0)) return true;


            out.write(_jspx_template54);
            // jsp code [from=(390,36);to=(390,50)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TAX_DATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template55);
            // jsp code [from=(391,36);to=(391,52)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SUNAP_DATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template56);
            // jsp code [from=(392,36);to=(392,54)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BASE_UPDATED}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template57);
            // jsp code [from=(393,36);to=(393,50)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.JUMGIGAN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template58);
            // jsp code [from=(394,56);to=(394,68)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.CAL_YN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template59);
            // jsp code [from=(395,56);to=(395,68)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TAX_YN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template60);

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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BONSE != '-'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != Tag.SKIP_BODY) {
        do {
          // ----  fmt:formatNumber ---- invoke //
          if (_jspx_th_fmt_formatNumber_0_fn(pageContext, _jspx_th_c_if_0)) return true;



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
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BONSE == '-'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
      if (_jspx_eval_c_if_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template51);

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
    _jspx_th_c_if_2.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.VAT != '-'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
      if (_jspx_eval_c_if_2 != Tag.SKIP_BODY) {
        do {
          // ----  fmt:formatNumber ---- invoke //
          if (_jspx_th_fmt_formatNumber_1_fn(pageContext, _jspx_th_c_if_2)) return true;



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
    _jspx_th_c_if_3.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.VAT == '-'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
      if (_jspx_eval_c_if_3 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template53);

        } while (_jspx_th_c_if_3.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_3.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_3.release();
    }
    return false;
  }

  private boolean _jspx_th_fmt_formatNumber_0_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  fmt:formatNumber ---- //
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_0 = new org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag();
    _jspx_th_fmt_formatNumber_0.setPageContext(pageContext);
    _jspx_th_fmt_formatNumber_0.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_fmt_formatNumber_0.setValue((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BONSE}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_fmt_formatNumber_0.setPattern("#,#00");
    try {
      int _jspx_eval_fmt_formatNumber_0 = _jspx_th_fmt_formatNumber_0.doStartTag();

      if (_jspx_th_fmt_formatNumber_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_fmt_formatNumber_0.release();
    }
    return false;
  }

  private boolean _jspx_th_fmt_formatNumber_1_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  fmt:formatNumber ---- //
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_1 = new org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag();
    _jspx_th_fmt_formatNumber_1.setPageContext(pageContext);
    _jspx_th_fmt_formatNumber_1.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_fmt_formatNumber_1.setValue((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.VAT}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_fmt_formatNumber_1.setPattern("#,#00");
    try {
      int _jspx_eval_fmt_formatNumber_1 = _jspx_th_fmt_formatNumber_1.doStartTag();

      if (_jspx_th_fmt_formatNumber_1.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_fmt_formatNumber_1.release();
    }
    return false;
  }

  private final static String _jspx_template0 = "\r\n";
  private final static String _jspx_template1 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('사용자의 사용시간이 종료되었습니다. 다시 접속 해주시기 바랍니다.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template2 = "\r\n";
  private final static String _jspx_template3 = "\r\n";
  private final static String _jspx_template4 = "\r\n";
  private final static String _jspx_template5 = "  \r\n";
  private final static String _jspx_template6 = "  \r\n";
  private final static String _jspx_template7 = "  \r\n";
  private final static String _jspx_template8 = "\r\n";
  private final static String _jspx_template9 = "\r\n";
  private final static String _jspx_template10 = "\r\n<!--  //********** BEGIN_KANG_20120409 -->\r\n";
  private final static String _jspx_template11 = "\r\n<!--   //********** END_KANG_20120409 -->\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script>\r\n<script language=\"javascript\" src=\"/js/Check_inputbox.js\"></script>\r\n\r\n<script type=\"text/javascript\">\r\n//<![CDATA[\r\n\t\r\n\tfunction\tPage(page)\r\n\t{\r\n\t\tif(page\t==\t\"\")\r\n\t\t\treturn;\r\n\t\t\r\n\t\tvar form = document.form;\r\n\r\n\t\tform.action = \"search.do?currentPage=\" + page;\r\n\t\tform.submit();\r\n\t}\r\n\r\n\tfunction\tView(adminno,seq,section)\r\n\t{\r\n\t\tvar form = document.form;\r\n\r\n\t\tif(form.bugwa_id.value == \"\")\r\n\t\t{\r\n\t\t\talert('사용자 정보에서 인사대체키 사용자 ID 정보가 없습니다. \\n 변경  후 사용바랍니다.');\r\n\t\t\twindow.open(\"/admin/user/getInsarangKey.do\", \"gongji\", \"width=770,height=700,left=20,top=20,scrollbars=yes\");\r\n\t\t}\r\n\t\telse\r\n\t\t{\r\n\t\t\tform.action = \"view.do?ADMIN_NO=\" + adminno+\"&SEQ=\"+seq+\"&SECTION=\"+section;\r\n\t\t\tform.submit();\r\n\t\t}\r\n\t}\r\n\r\n\tfunction\tSearch()\r\n\t{\r\n\t\tvar form = document.form;\r\n\t\tvar purpose1 = IFRM_PurposeCode.document.getElementById(\"PURPOSE1\");\r\n\t\t\r\n\t\tform.currentPage.value\t= 1;\r\n\t\tform.PURPOSE_CD.value\t= IFRM_PurposeCode.document.getElementById(\"PURPOSE_CD\").value;\r\n\t\t\r\n\t\tif(form.TYPE.selectedIndex == 0){\r\n\t\t\tform.PURPOSE_CD.value = \"\";\r\n\t\t}else{\r\n\t\t\tif(purpose1[purpose1.selectedIndex].text == \"::선택::\")\r\n\t\t\t\tform.PURPOSE_CD.value = \"\";\r\n\t\t}\r\n\r\n\t\t//페이징성능업\r\n\t\tform.TOTALCNT.value = '0';\r\n\t\t\r\n\t\tform.action = \"search.do\";\r\n\t\tform.submit();\r\n\t}\r\n\t\r\n\tfunction\texcel_Search()\r\n\t{\r\n\t\tvar form = document.form;\r\n\t\tvar purpose1 = IFRM_PurposeCode.document.getElementById(\"PURPOSE1\");\r\n\t\t\r\n\t\tform.currentPage.value\t= 1;\r\n\t\tform.PURPOSE_CD.value\t= IFRM_PurposeCode.document.getElementById(\"PURPOSE_CD\").value;\r\n\t\t\r\n\t\tif(form.TYPE.selectedIndex == 0){\r\n\t\t\tform.PURPOSE_CD.value = \"\";\r\n\t\t}else{\r\n\t\t\tif(purpose1[purpose1.selectedIndex].text == \"::선택::\")\r\n\t\t\t\tform.PURPOSE_CD.value = \"\";\r\n\t\t}\r\n\r\n\t\t//페이징성능업\r\n\t\tform.TOTALCNT.value = '0';\r\n\t\t\r\n\t\tform.action = \"excel_search.do\";\r\n\t\tform.submit();\r\n\t}\r\n\r\n\tfunction\tSelect_UseType(sel)\r\n\t{\r\n\t\tdocument.getElementById(\"IFRM_PurposeCode\").src=\"/jsp/common/purposeCode/purposeCode2.jsp?SectionCode=\"+sel.value+\"&PURPOSE_CD=&search_flag=1\";\r\n\t}\r\n\r\n\tfunction\tInit()\r\n\t{\t\r\n\r\n\t\tsetYear();\r\n\t\tdocument.getElementById(\"resultDiv\").style.width = 780;\r\n\t\tdocument.getElementById(\"resultSaewe\").width = 1600;\r\n\t\t\r\n\t\tvar obj = document.form.message.value;\r\n\t\t\r\n\t\tif(obj != \"\")\t\r\n\t\t\talert(obj);\r\n\t\t\r\n\t\tif(document.form.PURPOSE_CD.value.length<1){\r\n\t\t\tdocument.getElementById(\"IFRM_PurposeCode\").src=\"/jsp/common/purposeCode/purposeCode2.jsp?SectionCode=\"+document.getElementById(\"TYPE\").value+\"&PURPOSE_CD=000\"+\"&search_flag=1\";\r\n\t\t}else{\r\n\t\t\tdocument.getElementById(\"IFRM_PurposeCode\").src=\"/jsp/common/purposeCode/purposeCode2.jsp?SectionCode=\"+document.getElementById(\"TYPE\").value+\"&PURPOSE_CD=\"+document.form.PURPOSE_CD.value;\t\r\n\t\t}\r\n\t}\r\n\r\n\tfunction checkKeySearch()\r\n\t{\r\n\t\tif(event.keyCode == 13) Search();\r\n\t}\r\n\t\r\n\tfunction SaeweSuipBugwa_Ilgwal()\r\n\t{\r\n\t\tvar form = document.form;\r\n\t\t\r\n\t\tif(form.TOTALCNT.value <= 0)\r\n\t\t{\r\n\t\t\talert(\"일괄처리할 데이터가 없습니다\");\r\n\t\t\treturn;\r\n\t\t}\r\n\t\t\r\n\t\tif(!confirm(\"일괄처리 하시겠습니까?\"))\r\n\t\t\treturn;\r\n\t\t\r\n\t\tform.action = \"/jumyong/saewe/saeweSuipBugwa_ilgwal.do\";\r\n\t\tform.submit();\r\n\t}\r\n\t\r\n\t//\t관리자 번호 앞에 9자리 삭제\r\n\tfunction\tnr_Adminno_Cut2(adminno)\r\n\t{\r\n\t\tif(adminno.length != 20)\r\n\t\t\treturn\tadminno\r\n\t\r\n\t\tadminno\t= adminno.substr(9, 11);\r\n\t\t\r\n\t\treturn\tadminno;\r\n\t}\r\n\r\n    function setYear()\r\n    {\r\n        now = new Date();\r\n        Y = now.getFullYear();\r\n\r\n        var strYear = \"";
  private final static String _jspx_template12 = "\";\r\n\r\n        for(var i = 0 ; i < 10 ; i++){\r\n            newItem = new Option(i);\r\n            document.getElementById(\"YEAR\").options[i]  = newItem;\r\n            document.getElementById(\"YEAR\").options[i].text = Y+1-i;\r\n            document.getElementById(\"YEAR\").options[i].value = Y+1-i;\r\n            if(strYear == Y-i) document.getElementById(\"YEAR\").options[i].selected = true;\r\n        }\r\n\r\n        document.getElementById(\"YEAR\").options.value = strYear;\r\n    }\r\n\r\n\r\n\t// 부과년도 검색 셋팅\r\n\tfunction change_year()\r\n\t{\r\n\t\tdocument.getElementById(\"GIGAN1\").value = document.getElementById(\"YEAR\").options.value + \"-01-01\";\r\n\t\tdocument.getElementById(\"GIGAN2\").value = document.getElementById(\"YEAR\").options.value + \"-12-31\";\r\n\t}\r\n\r\n\t\r\n\r\n    \r\n//]]>\r\n</script>\r\n\r\n<body onload=\"Init();\">\r\n<form id=\"form\" name=\"form\" method=\"post\" action=\"search.jsp\">\r\n<input type=\"hidden\" id=\"currentPage\" name=\"currentPage\" value=\"";
  private final static String _jspx_template13 = "\">\r\n<input type=\"hidden\" id=\"PURPOSE_CD\" name=\"PURPOSE_CD\" value=\"";
  private final static String _jspx_template14 = "\">\r\n<input type=\"hidden\" id=\"TOTALCNT\" name=\"TOTALCNT\" value=\"";
  private final static String _jspx_template15 = "\">\r\n<input type=\"hidden\" id=\"excel\" name=\"excel\" value=\"\">\r\n<input type=\"hidden\" id=\"message\" name=\"message\" value=\"";
  private final static String _jspx_template16 = "\">\r\n<input id=\"search\" name=\"search\" type=\"hidden\" value=\"";
  private final static String _jspx_template17 = "\">\r\n<input id=\"bugwa_id\" name=\"bugwa_id\" type=\"hidden\" value=\"";
  private final static String _jspx_template18 = "\">\r\n\r\n\r\n<table width=\"780\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t<tr>\r\n\t\t<td height=\"43\"><img src=\"/img/sub1_cont3_title.gif\" width=\"800\" height=\"43\"></td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td align=\"center\">\r\n\t\t\t<table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"1\" bgcolor=\"eaeaea\"></td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"14\"></td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td align=\"left\">\r\n\t\t\t\t\t\t<table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"22\" background=\"/img/tab_line_blue.gif\">\r\n\t\t\t\t\t\t\t\t\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td><img src=\"/img/sub_petition_title10.gif\" width=\"110\" height=\"22\"></td>\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td class=\"contborder_purple\">\r\n\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n                                                        <td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" >산출년도</td>\r\n                                                        <td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\">\r\n                                                            <select  id=\"YEAR\" name=\"YEAR\" class=\"input_form1\" style=\"width:130px\">\r\n                                                            </select>\r\n\r\n                                                        </td>\r\n\r\n                                                    </tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">갱신기간</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td  bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input id=\"GIGAN1\" name=\"GIGAN1\" type=\"text\" class=\"input_form1\" style=\"width:70px\" value=\"";
  private final static String _jspx_template19 = "\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" align=\"absmiddle\" onclick=\"popUpCalendar(this, document.getElementById('GIGAN1'), 'yyyymmdd')\" style=\"vertical-align:middle;CURSOR:pointer;\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t&nbsp;~&nbsp;\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input id=\"GIGAN2\" name=\"GIGAN2\" type=\"text\" class=\"input_form1\" style=\"width:70px\" value=\"";
  private final static String _jspx_template20 = "\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" align=\"absmiddle\" onclick=\"popUpCalendar(this, document.getElementById('GIGAN2'), 'yyyymmdd')\" style=\"vertical-align:middle;CURSOR:pointer;\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">작성여부</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<select id=\"CAL_YN\" name=\"CAL_YN\" class=\"input_form1\" style=\"width:100px\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template21 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용종류</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"37%\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <select id=\"TYPE\" name=\"TYPE\" class=\"input_form1\" style=\"width:100px\" OnChange=\"Select_UseType(this);\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template22 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t  </select>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용구분</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<select id=\"SECTION\" name=\"SECTION\" class=\"input_form1\" style=\"width:100px\" OnChange=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template23 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">세입구분</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<select id=\"TAX_SET\"  name=\"TAX_SET\" class=\"input_form1\" style=\"width:100px\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template24 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\t\t\t\t\t  \r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">부과여부</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<select id=\"TAX_YN\" name=\"TAX_YN\" class=\"input_form1\" style=\"width:100px\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template25 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\t\t\t\t\t  \r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용목적</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<iframe id=\"IFRM_PurposeCode\" align=\"absmiddle\" scrolling=\"no\" frameborder=\"0\" framespacing=\"0\" width=\"100%\" height=\"26\"></iframe>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t  \t<td height=\"32\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">시군구</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t  \t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t                          <select id=\"GU_CD\" name=\"GU_CD\" class=\"input_form1\" style=\"width:130px\">\r\n\t\t\t\t\t\t\t\t                          ";
  private final static String _jspx_template26 = "\r\n\t\t\t\t\t\t\t\t                          </select>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t  \t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">법정동</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<select id=\"BJ_CD\" name=\"BJ_CD\" class=\"input_form1\" style=\"width:100px\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template27 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용지번지</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input id=\"BONBUN\" name=\"BONBUN\" type=\"text\" class=\"input_form1\" style=\"width:40px\" value=\"";
  private final static String _jspx_template28 = "\"> -\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input id=\"BUBUN\" name=\"BUBUN\" type=\"text\" class=\"input_form1\" style=\"width:40px\" value=\"";
  private final static String _jspx_template29 = "\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용인/법인명</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input id=\"NAME\" name=\"NAME\" type=\"text\" class=\"input_form1\" style=\"width:100px\" onKeyDown=\"javascript:checkKeySearch();\" value=\"";
  private final static String _jspx_template30 = "\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">관리번호</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input id=\"ADMINNO\" name=\"ADMINNO\" type=\"text\" class=\"input_form1\" style=\"width:120px\" onKeyDown=\"javascript:checkKeySearch();\" value=\"";
  private final static String _jspx_template31 = "\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td height=\"32\" align=\"right\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"javascript:Search()\"><img src=\"/img/inquiry_icon2.gif\" alt=\"조회\" width=\"56\" height=\"18\" border=\"0\"></a>\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td height=\"1\" bgcolor=\"#EAEAEA\"></td>\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td height=\"34\" class=\"sub_stan\">전체건수 : <span class=\"sub_stan_blue\">";
  private final static String _jspx_template32 = "</span> 건 </td>\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t<div id=\"resultDiv\" style=\"padding:10px;overflow-x:scroll; scrollbar-face-color:#EEF8FB;scrollbar-3dlight-color:#BBBDB6; scrollbar-highlight-color:#EEF8FB;scrollbar-shadow-color:#BBBDB6; scrollbar-darkshadow-color:#EEF8FB;scrollbar-track-color:#EEF8FB;scrollbar-arrow-color:#BBBDB6; \"> \r\n\t\t\t\t\t\t\t\t\t\t\t\t<table id=\"resultSaewe\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">번호</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">관리번호</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">년도</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">과세<br/>번호</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용<br/>종류</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용<br/>구분</td>\r\n                        \t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용지<br/>소유</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">세목코드</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용목적</td>\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용인</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">면적<br/>㎡/개</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">본세(점용료)</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">부가가치세</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">부과일자</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">수납일자</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">갱신일자</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">산출기간</td> \r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">작성<br/>여부</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">부과<br/>여부</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template33 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template34 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template35 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr onClick=\"javascript:View('";
  private final static String _jspx_template36 = "', '";
  private final static String _jspx_template37 = "','";
  private final static String _jspx_template38 = "')\" onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\" style=\"CURSOR: Hand;\" >\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\">";
  private final static String _jspx_template39 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\"><script>var adminno = nr_Adminno_Cut2('";
  // jsp code [from=(376,19);to=(376,66)]
  private final static String _jspx_template40 = "'); document.write(adminno);</script></td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template41 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"30\" align=\"center\">";
  private final static String _jspx_template42 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template43 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"30\" align=\"center\">";
  private final static String _jspx_template44 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"30\" align=\"center\">";
  private final static String _jspx_template45 = "</td>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t                        \t<td align=\"center\">";
  private final static String _jspx_template46 = "</td>   \r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template47 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template48 = "</td>\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template49 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template50 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<!--  //********** BEGIN_KANG_20120409 -->\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template51 = "-";
  private final static String _jspx_template52 = "</td>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template53 = "-";
  private final static String _jspx_template54 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<!--   //********** END_KANG_20120409 -->\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template55 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template56 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template57 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template58 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"sub_table_r\" align=\"center\">";
  private final static String _jspx_template59 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"sub_table_r\" align=\"center\">";
  private final static String _jspx_template60 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template61 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template62 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template63 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" class=\"sub_table\" colspan=\"17\" height=\"85\">검색된 내용이 없습니다</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template64 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template65 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td height=\"30\" align=\"center\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template66 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"40\" align=\"right\">\r\n<!--\r\n<img src=\"../../../img/levy_icon3.gif\" alt=\"일괄 부과처리\" border=\"0\" onclick=\"javascript:SaeweSuipBugwa_Ilgwal();\" style=\"cursor:hand\">\r\n-->\r\n\t\t\t\t\t\t\t\t\t<img src=\"../../../img/excel_icon.gif\" alt=\"EXCEL 변환\" border=\"0\" onclick=\"javascript:excel_Search();\" style=\"cursor:hand\">\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n</table>\r\n</form>\r\n</body>\r\n</html>";
}
