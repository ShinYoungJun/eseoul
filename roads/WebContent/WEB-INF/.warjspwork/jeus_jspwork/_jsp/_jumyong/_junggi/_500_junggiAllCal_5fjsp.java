package jeus_jspwork._jsp._jumyong._junggi;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_junggiAllCal_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(66,31);to=(66,38)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${sigu_cd}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(67,31);to=(67,38)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(162,34);to=(162,41)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      out.write(_jspx_template14);
      // jsp code [from=(325,36);to=(325,43)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(363,52);to=(363,59)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      out.write(_jspx_template17);
      out.write(_jspx_template18);
      out.write(_jspx_template19);
      // jsp code [from=(633,44);to=(633,51)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      out.write(_jspx_template21);
      // jsp code [from=(798,70);to=(798,77)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${search }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(799,79);to=(799,85)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${toDate}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(800,83);to=(800,91)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${fromDate}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // jsp code [from=(801,89);to=(801,100)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${jumyongName}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);
      // jsp code [from=(802,89);to=(802,100)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${numberValue}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template26);
      // jsp code [from=(803,71);to=(803,75)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${year}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // jsp code [from=(804,79);to=(804,90)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template28);
      // jsp code [from=(805,77);to=(805,87)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PURPOSE_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template29);
      // jsp code [from=(806,79);to=(806,90)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${search_flag}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template30);
      // jsp code [from=(807,73);to=(807,82)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${listCount}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template31);
      // jsp code [from=(813,79);to=(813,83)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${year}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template32);
      // jsp code [from=(814,65);to=(814,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TYPE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template33);
      // jsp code [from=(815,71);to=(815,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TAX_SET}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template34);
      // jsp code [from=(816,69);to=(816,75)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TAX_YN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template35);
      // jsp code [from=(817,67);to=(817,72)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${BJ_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template36);
      // jsp code [from=(818,67);to=(818,72)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${HJ_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template37);
      // jsp code [from=(819,79);to=(819,90)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${jumyongName}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template38);
      // jsp code [from=(820,71);to=(820,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template39);
      // jsp code [from=(821,69);to=(821,75)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${search}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template40);
      // jsp code [from=(822,81);to=(822,94)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mul_fromdate }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template41);
      // jsp code [from=(823,77);to=(823,88)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mul_todate }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template42);
      // jsp code [from=(855,95);to=(855,104)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${listCount}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template43);
      out.write(_jspx_template44);
      // ----  c:choose ---- invoke //
      if (_jspx_th_c_choose_0_fn(pageContext, null)) return;


      out.write(_jspx_template109);
      // jsp code [from=(1087,214);to=(1087,219)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${YEAR }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template110);
      // jsp code [from=(1093,189);to=(1093,198)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${FROMDATE }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template111);
      // jsp code [from=(1095,186);to=(1095,193)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TODATE }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template112);
      // jsp code [from=(1098,188);to=(1098,194)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PERIOD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template113);
      // jsp code [from=(1106,189);to=(1106,197)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TAX_DATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template114);
      // jsp code [from=(1111,185);to=(1111,191)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TODATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template115);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_1_fn(pageContext, null)) return;


      out.write(_jspx_template117);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_2_fn(pageContext, null)) return;


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
          out.write(_jspx_template45);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template106);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_1_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template108);

        } while (_jspx_th_c_choose_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_choose_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_choose_0.release();
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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION == '3'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
      if (_jspx_eval_c_if_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template116);

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
    _jspx_th_c_if_2.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION == '3'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
      if (_jspx_eval_c_if_2 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template118);

        } while (_jspx_th_c_if_2.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_2.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_2.release();
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
    _jspx_th_c_when_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist != null && !empty blist}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
      if (_jspx_eval_c_when_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template46);
          // ----  c:forEach ---- invoke //
          if (_jspx_th_c_forEach_0_fn(pageContext, _jspx_th_c_when_0)) return true;


          out.write(_jspx_template105);

        } while (_jspx_th_c_when_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_when_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_when_0.release();
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
          out.write(_jspx_template107);

        } while (_jspx_th_c_otherwise_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_otherwise_1.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_otherwise_1.release();
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
            out.write(_jspx_template47);
            // ----  c:if ---- invoke //
            if (_jspx_th_c_if_0_fn(pageContext, _jspx_th_c_forEach_0)) return true;


            out.write(_jspx_template104);

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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TAX_NO == board.MAX_TAX_NO}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template48);
          // jsp code [from=(912,135);to=(912,150)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADMIN_NO2}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template49);
          // jsp code [from=(913,124);to=(913,134)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template50);
          // jsp code [from=(914,123);to=(914,141)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SECTION_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template51);
          // jsp code [from=(915,123);to=(915,136)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template52);
          // jsp code [from=(916,123);to=(916,133)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TYPE}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template53);
          // jsp code [from=(917,123);to=(917,136)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TAX_SET}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template54);
          // jsp code [from=(918,123);to=(918,141)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_SET_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template55);
          // jsp code [from=(919,110);to=(919,121)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BJ_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template56);
          // jsp code [from=(919,125);to=(919,138)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BONBUN }",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template57);
          // jsp code [from=(920,110);to=(920,125)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ROAD_ADDR}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template58);
          // jsp code [from=(921,110);to=(921,131)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PURPOSE_CLASSNM}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template59);
          // jsp code [from=(928,158);to=(928,177)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OLD_AREA_SIZE}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template60);
          // jsp code [from=(931,153);to=(931,167)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OLD_RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template61);
          // jsp code [from=(934,154);to=(934,188)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(board.OLD_PRICE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

          out.write(_jspx_template62);
          // jsp code [from=(940,157);to=(940,192)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(board.SUM_ADJUST)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

          out.write(_jspx_template63);
          // jsp code [from=(945,155);to=(945,165)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.AREA}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template64);
          // jsp code [from=(949,149);to=(949,159)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template65);
          // ----  c:choose ---- invoke //
          if (_jspx_th_c_choose_1_fn(pageContext, _jspx_th_c_if_0)) return true;


          out.write(_jspx_template72);
          // jsp code [from=(996,157);to=(996,175)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PERCENT_RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template73);
          // jsp code [from=(999,159);to=(999,179)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PERCENT_REASON}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template74);
          // jsp code [from=(1002,159);to=(1002,179)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.REDUCTION_RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template75);
          // jsp code [from=(1005,161);to=(1005,183)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.REDUCTION_REASON}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template76);
          // jsp code [from=(1010,135);to=(1010,149)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template77);
          // jsp code [from=(1011,135);to=(1011,149)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.CHECK_YN}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template78);
          // jsp code [from=(1013,136);to=(1013,146)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TYPE}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template79);
          // jsp code [from=(1016,134);to=(1016,147)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SIGU_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template80);
          // jsp code [from=(1017,132);to=(1017,143)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BJ_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template81);
          // jsp code [from=(1018,134);to=(1018,147)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.DEPT_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template82);
          // jsp code [from=(1019,136);to=(1019,151)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TAX_GUBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template83);
          // jsp code [from=(1020,134);to=(1020,147)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OBJ_SET}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template84);
          // jsp code [from=(1021,138);to=(1021,155)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TAXPAYER_ID}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template85);
          // jsp code [from=(1022,139);to=(1022,157)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TAXPAYER_SET}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template86);
          // jsp code [from=(1023,138);to=(1023,155)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OCR_SIGU_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template87);
          // jsp code [from=(1024,139);to=(1024,157)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OCR_BUSEO_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template88);
          // jsp code [from=(1025,133);to=(1025,145)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TAX_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template89);
          // jsp code [from=(1026,131);to=(1026,141)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.LIVE}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template90);
          // jsp code [from=(1027,134);to=(1027,147)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADD_SET}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template91);
          // jsp code [from=(1028,133);to=(1028,145)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADD_YN}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template92);
          // jsp code [from=(1029,137);to=(1029,153)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SUBUSEO_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template93);
          // jsp code [from=(1030,139);to=(1030,155)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PURPOSE_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template94);
          // jsp code [from=(1033,136);to=(1033,151)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADMIN_NO2}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template95);
          // jsp code [from=(1034,131);to=(1034,141)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template96);
          // jsp code [from=(1035,139);to=(1035,152)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TAX_SET}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template97);
          // jsp code [from=(1036,139);to=(1036,157)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SECTION_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template98);
          // jsp code [from=(1037,131);to=(1037,142)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BJ_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template99);
          // jsp code [from=(1037,146);to=(1037,159)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BONBUN }",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template100);
          // jsp code [from=(1038,137);to=(1038,152)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ROAD_ADDR}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template101);
          // jsp code [from=(1039,142);to=(1039,163)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PURPOSE_CLASSNM}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template102);
          // jsp code [from=(1040,139);to=(1040,157)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_SET_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template103);

        } while (_jspx_th_c_if_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_0.release();
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
          out.write(_jspx_template66);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_1_fn(pageContext, _jspx_th_c_choose_1)) return true;


          out.write(_jspx_template69);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_0_fn(pageContext, _jspx_th_c_choose_1)) return true;


          out.write(_jspx_template71);

        } while (_jspx_th_c_choose_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_choose_1.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_choose_1.release();
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
    _jspx_th_c_when_1.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.CHECK_YN == '2'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
      if (_jspx_eval_c_when_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template67);
          // jsp code [from=(957,149);to=(957,179)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(board.PRICE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

          out.write(_jspx_template68);

        } while (_jspx_th_c_when_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_when_1.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_when_1.release();
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
          out.write(_jspx_template70);

        } while (_jspx_th_c_otherwise_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_otherwise_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_otherwise_0.release();
    }
    return false;
  }

  private static jeus.servlet.jsp.el.FunctionMapperImpl _jspx_fnmap_0;
  
  static {
    _jspx_fnmap_0 = jeus.servlet.jsp.el.FunctionMapperImpl.getInstance();
    _jspx_fnmap_0.mapFunction("rnic:insertComma2", main.java.common.util.StringUtil.class, "insertComma2", new Class[] {java.lang.String.class});

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
  private final static String _jspx_template9 = "\r\n<script language=\"javascript\" src=\"/js/privateFunction.js\"></script>";
  private final static String _jspx_template10 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html>\r\n    <head>\r\n        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n        <title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n        <style type=\"text/css\">\r\n            <!--\r\n            body {\r\n                margin: 0px;\r\n                background-image: url(/img/left_back.gif);\r\n            }\r\n            #tr_fixed_header\r\n            {\r\n                position: relative;\r\n                top: expression(this.offsetParent.scrollTop);\r\n                z-index: 20;\r\n            }\r\n\r\n            -->\r\n        </style>\r\n        <link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n        <script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script>\r\n        <script language=\"javascript\" src=\"/js/Ajax_request.js\"></script>\r\n        <script language=\"javascript\" src=\"/js/calculation.js\"></script>\r\n        <script>\r\n\t\t\r\n            function checkKeySearch()\r\n            {\r\n                if(event.keyCode == 13) goSearch();\r\n            }\r\n\r\n\r\n\r\n            function InitPage()\r\n            {\r\n\r\n                var taxdate = document.getElementById(\"TAX_DATE\").value;\r\n                var taxdate_year = Number(taxdate.substr(0,4));\r\n                var taxdate_month = Number(taxdate.substr(5,2));\r\n                var indate_f = new Date(new Date(taxdate_year, taxdate_month, 1)-86400000).getDate();\r\n\r\n                document.getElementById(\"INDATE\").value = taxdate.substr(0,4)+\"-\"+taxdate.substr(5,2)+\"-\"+indate_f;\r\n\r\n                var indate = document.getElementById(\"INDATE\").value;\r\n\r\n                var indate_year = Number(indate.substr(0,4));\r\n                var indate_month = Number(indate.substr(5,2));\r\n                if(indate_month==12){\r\n                    indate_year = indate_year+1;\r\n                    indate_month = 1;\r\n                }else{\r\n                    indate_month++;\r\n                }\r\n\r\n                if(indate_month<10){\r\n                    indate_month = \"0\"+indate_month;\r\n                }\r\n                var over_date = new Date(new Date(indate_year, indate_month, 1)-86400000).getDate();\r\n\r\n                document.getElementById(\"OVERDATE\").value = indate_year+\"-\"+indate_month+\"-\"+over_date;\r\n\r\n             \t// 2016.02.05 kny 강서구 해당 점용지의 경우 안내메세지 출력\r\n                var chk1 = \"";
  private final static String _jspx_template11 = "\";\t// 강서구 시군구 코드\r\n                var chk2 = \"";
  private final static String _jspx_template12 = "\";\t// 점용 종류(1: 계속)\r\n                var isGangseo = false;\r\n                var nameList = new Array();\r\n                \r\n                if(chk1 == \"500\" && chk2 == \"1\"){\r\n\t\t\t\t\tvar listInfo =  document.getElementsByName(\"ADMIN_NO2\");\r\n\t\t\t\t\tvar nameInfo =  document.getElementsByName(\"NAME\");\r\n\t\t\t\t\tvar i2;\r\n\t\t\t\t\tfor (i2 = 0; i2 < listInfo.length; i2++) {\r\n\t\t\t\t\t    if (listInfo[i2].value == \"110_1_11704\" || listInfo[i2].value == \"110_1_11705\" || listInfo[i2].value == \"110_1_11935\" || \r\n\t\t\t\t\t         listInfo[i2].value == \"110_1_12517\" || listInfo[i2].value == \"110_1_12537\" || listInfo[i2].value == \"119_1_00001\") {\r\n\t\t\t\t  \t    \tisGangseo = true;\r\n\t\t\t\t\t    \tnameList.push(listInfo[i2].value+\"(\"+nameInfo[i2].value+\")\");\r\n\t\t\t\t\t    }\r\n\t\t\t\t\t}\r\n\t\t\t\t\t\r\n\t\t\t\t\tif(isGangseo){\r\n\t\t\t\t\t\tvar messageGimpo = \"관리번호가 \\n\";\r\n\t\t\t\t\t\tmessageGimpo +=\"[ \";\r\n\t\t\t\t\t\t\r\n\t\t\t\t\t\tfor(i3=0; i3 < nameList.length; i3++){\r\n\t\t\t\t\t\t\tif(i3!=0){\r\n\t\t\t\t\t\t\t\tmessageGimpo += \", \" + nameList[i3];\r\n\t\t\t\t\t\t\t}else{\r\n\t\t\t\t\t\t\t\tmessageGimpo += nameList[i3];\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t}\r\n\t\t\t\t\t\t}\r\n\t\t\t\t\t\t\r\n\t                \tmessageGimpo += \" ]\\n\";\r\n\t                \tmessageGimpo += \"인 경우의 정기분 도로사용료를 부과할 경우에는,\\n\";\r\n\t                \tmessageGimpo += \"반드시 해당 부과자료의 도로사용료 산정방법에 따라 부과하시기 바랍니다.\";\r\n\t\t\t\t\t}\r\n\t\t\t\t\talert(messageGimpo);\r\n                }\r\n                \r\n            }\r\n\r\n\r\n\r\n\r\n            // 부과년도 검색 셋팅\r\n            function change_value(val)\r\n            {\r\n                if(val.value.length == 4)\r\n                {\r\n\r\n                    document.frm.FROMDATE.value = val.value + \"-01-01\";\r\n                    document.frm.TODATE.value = val.value + \"-12-31\";\r\n\r\n                }\r\n            }\r\n\r\n\r\n            // 계산\r\n            function Calculate(){\r\n\r\n                var f = document.frm;\r\n\r\n                if(f.TOTALCNT.value <= 0){\r\n                    alert(\"처리할 데이터가 없습니다. \");\r\n                    return;\r\n                }\r\n\r\n                junggi_calDate();\r\n\r\n                var check_yn = document.getElementsByName(\"CHECK_YN\");\r\n                var price = document.getElementsByName(\"PRICE\");\r\n                var allCnt = 0;\r\n\r\n                for( var i = 0; i < check_yn.length; i++ ){\r\n                    if( check_yn[i].value == '2' ){\r\n                        if(price[i].value == '0' || price[i].value == ''){\r\n                            alert(\"공시지가를 넣고 계산해주세요. \");\r\n                            price[i].focus();\r\n                            return;\r\n                        }\r\n                    }\r\n                }\r\n                var area_after = document.getElementsByName(\"AREA_AFTER\");\r\n                var period = document.getElementById(\"PERIOD\").value;\r\n\r\n\r\n                if(Number(period) > 12){\r\n                    alert(\"기간이 12개월을 초과할수 없습니다.\");\r\n                    f.PERIOD.focus();\r\n                    return;\r\n                }\r\n\r\n                if(Number(period) < 0){\r\n                    alert(\"기간이 입력이 잘못되었습니다.\");\r\n                    f.PERIOD.focus();\r\n                    return;\r\n                }\r\n\r\n                var rate = document.getElementsByName(\"RATE\");\r\n                var section = '";
  private final static String _jspx_template13 = "';\r\n                var surcharge_rate = \"\";\r\n                if( section == '3' ){\r\n                    surcharge_rate = document.getElementById(\"SURCHARGE_RATE\").value;\r\n\r\n                    if( surcharge_rate == '' ){\r\n                        surcharge_rate = 1.2;\r\n                        document.getElementById(\"SURCHARGE_RATE\").value = surcharge_rate;\r\n                    }\r\n                }\r\n\r\n                var price = document.getElementsByName(\"PRICE\");\r\n                var form = document.getElementsByName(\"FORM\");\r\n                var sum_year = document.getElementsByName(\"SUM_YEAR\");\r\n                var sum_lastyear = document.getElementsByName(\"SUM_LASTYEAR\");\t\t// 작년도 점용료\r\n                var form_adjust = document.getElementsByName(\"FORM_ADJUST\");\r\n                var adjustment = document.getElementsByName(\"ADJUSTMENT\");\r\n                var sum_adjust = document.getElementsByName(\"SUM_ADJUST\");\r\n                var reduction_sum = document.getElementsByName(\"REDUCTION_SUM\");\r\n                var reduction_form = document.getElementsByName(\"REDUCTION_FORM\");\r\n                var test = document.getElementsByName(\"TEST\");\r\n                var rate_val = document.getElementsByName(\"RATE_VAL\");\r\n                var overtax = document.getElementsByName(\"OVERTAX\");\r\n                var purpose_cd_l = document.getElementsByName(\"PURPOSE_CD_L\");\r\n                \r\n                var vat = document.getElementsByName(\"VAT\");\r\n              \tvar old_rate = document.getElementsByName(\"OLD_RATE\");\r\n                var old_price = document.getElementsByName(\"OLD_PRICE\");\r\n                var old_area_size = document.getElementsByName(\"OLD_AREA_SIZE\");\r\n\r\n\r\n                for( var i = 0; i < check_yn.length; i++){\r\n\r\n                    var type_name = document.getElementsByName(\"TYPE_NAME\");\r\n\r\n\r\n\r\n                    /******************    1    **************************/\r\n                    // 감면율, 지분율 값 및 폼 초기 세팅\r\n                    \r\n                    var percent_rate = document.getElementsByName(\"PERCENT_RATE\");\r\n                    var reduction_rate = document.getElementsByName(\"REDUCTION_RATE\");\r\n\r\n                    var percent_rate_cal = 0; // 계산에 사용할 지분율\r\n                    var reduction_rate_cal = 0; // 계산에 사용할 감면율\r\n                    var reduction_rate_form = \"\";\r\n                    \r\n                    if( percent_rate[i].value == '' || percent_rate[i].value == '0' || percent_rate[i].value == '0.0'){\r\n                    \tpercent_rate_cal = '100.0';\r\n                    }else{\r\n                    \tpercent_rate_cal = parseFloat(percent_rate[i].value);\r\n                    }\r\n                    \r\n                    if( reduction_rate[i].value == '' || reduction_rate[i].value == '0' || reduction_rate[i].value == '0.0'){\r\n                        reduction_rate_cal = '0.0';\r\n\t                }else{\r\n\t                \treduction_rate_cal = parseFloat(reduction_rate[i].value);\r\n\t                }\r\n                    \r\n                    \r\n                    if(percent_rate_cal != '' && percent_rate_cal != '0.0' && percent_rate_cal != '100.0'){\r\n                    \treduction_rate_form += \" X ((\"+percent_rate_cal+\")/100)\";\r\n                    }\r\n                    if(reduction_rate_cal != '0.0' && reduction_rate_cal != '0.0'){\r\n                    \treduction_rate_form += \" X ((100-\"+reduction_rate_cal+\")/100)\";\r\n                    }\r\n\r\n                    var price_cal = removeComma(price[i].value);\r\n                    var sum_lastyear_cal = removeComma(sum_lastyear[i].value);\r\n                    /****************** 1단계 끝 ***************************/\r\n\r\n\r\n                    /******************    2    **************************/\r\n                    // 현년도 값 및 폼 세팅\r\n\r\n                    var sum_year_cal = \"\";\t// 값 셋팅하기전 계산시 필요한 변수 새로 선언\r\n\r\n                    if( check_yn[i].value == '2' ){\r\n\r\n                        form[i].value = area_after[i].value+\"㎡  X \" + rate[i].value +\" X \" +insertComma2(price_cal) +\" X \" + period + \"/12 개월 \";\r\n\r\n                        if( section == '3' ){\r\n ";
  private final static String _jspx_template14 = "                           sum_year_cal = fixFloatCal(parseFloat(area_after[i].value)*parseFloat(period)/12*parseFloat(rate[i].value)*parseFloat(price_cal)*(surcharge_rate));\r\n                        }else{\r\n                            sum_year_cal = fixFloatCal(parseFloat(area_after[i].value)*parseFloat(period)/12*parseFloat(rate[i].value)*parseFloat(price_cal));\r\n                        }\r\n\r\n                    }else{\r\n\r\n                        form[i].value = area_after[i].value+\"㎡  X \" + rate[i].value +\" X \" + period + \"/12 개월 \";\r\n\r\n                        if( section == '3' ){\r\n                            sum_year_cal = fixFloatCal(parseFloat(area_after[i].value)*parseFloat(period)/12*parseFloat(rate[i].value)*(surcharge_rate));\r\n                        }else{\r\n                            sum_year_cal = fixFloatCal(parseFloat(area_after[i].value)*parseFloat(period)/12*parseFloat(rate[i].value));\r\n                        }\r\n\r\n                    }\r\n\r\n                    // 감면률 지분률 위한 절삭안한 현년도 값 백업\r\n                    var bak_sum = sum_year_cal;\r\n\r\n                    var strSUM_ADJUST = String(Math.floor(parseFloat(sum_year_cal))); // 소수점 제거\r\n\r\n\r\n                    var gongyu = purpose_cd_l[i].value.charAt(0); // 공물법이면 0으로 시작\r\n                    \r\n                    \r\n                    if(section != '3'){\r\n                        if(type_name[i].value != '도로'){\r\n                            sum_year_cal = (Math.floor(parseFloat(strSUM_ADJUST)/10))* 10; //10원 절삭\r\n                        }else{\r\n                        \tif(gongyu == '0'){\t// 도로&공물법 적용은 10원 절삭\r\n                            \tsum_year_cal = (Math.floor(parseFloat(strSUM_ADJUST)/10))* 10; //10원 절삭\r\n                        \t}else{\r\n                        \t\tsum_year_cal = (Math.floor(parseFloat(strSUM_ADJUST)/100))* 100; //100원 절삭\r\n                        \t}\r\n                        }\r\n                    }else{\r\n                        sum_year_cal = (Math.floor(Number(strSUM_ADJUST)));\r\n                    }\r\n\r\n\r\n                    sum_year[i].value = insertComma2(sum_year_cal);\t// 현년도 점용료\r\n\r\n\r\n                    /****************** 2단계 끝 ***************************/\r\n\r\n\r\n                    /******************    3    **************************/\r\n                    // 계속인지 무단인지 검사하여 계산\r\n\r\n\r\n\r\n                    var tempval = 0;\r\n\r\n                    //작년도 점용료가 있을때 (무단인 경우는 전년 점용료 관계없음)\r\n                    if(section != '3' )\r\n                    {\r\n                        continueProduct(i);\r\n                        tempval = 1;\r\n                    }\r\n\r\n                    // 작년도 점용료가 없거나 비율에 해당하지 않을때\r\n                    if(tempval == 0 || section == '3' )\r\n                    {\r\n\r\n\t\t\t\t\t\tform_adjust[i].value = form[i].value+\" X \"+surcharge_rate;\r\n                        reduction_form[i].value = form[i].value+\" X \"+surcharge_rate + reduction_rate_form;\r\n\r\n\r\n                        sum_adjust[i].value = insertComma2(sum_year_cal);\r\n\r\n\r\n                        if(type_name[i].value != '도로'){\r\n                            //10원 절삭\r\n                            if( section == '3' ){\r\n                                reduction_sum[i].value = insertComma2(Math.floor(fixFloatCal((parseFloat(bak_sum)*(parseFloat(percent_rate_cal)/100)*(parseFloat(100-reduction_rate_cal)/100))/10))*10);\r\n                            }else{\r\n                                reduction_sum[i].value = insertComma2(Math.floor(fixFloatCal((parseFloat(bak_sum)*(parseFloat(percent_rate_cal)/100)*(parseFloat(100-reduction_rate_cal)/100))/10))*10);\r\n                            }\r\n                        }else{\r\n                            //100원 절삭\r\n                            if( '";
  private final static String _jspx_template15 = "' == '3' ){\r\n                                if(gongyu == '0'){\t// 공물법 적용은 10원 절삭\r\n                                \treduction_sum[i].value = insertComma2(Math.floor(fixFloatCal((parseFloat(bak_sum)*(parseFloat(percent_rate_cal)/100)*(parseFloat(100-reduction_rate_cal)/100))/10))*10);\r\n                                }else{\r\n                                \treduction_sum[i].value = insertComma2(Math.floor(fixFloatCal((parseFloat(bak_sum)*(parseFloat(percent_rate_cal)/100)*(parseFloat(100-reduction_rate_cal)/100))/100))*100);\r\n                                }\r\n                            }else{\r\n                                if(gongyu == '0'){\t// 공물법 적용은 10원 절삭\r\n                                \treduction_sum[i].value = insertComma2(Math.floor(fixFloatCal((parseFloat(bak_sum)*(parseFloat(percent_rate_cal)/100)*(parseFloat(100-reduction_rate_cal)/100))/10))*10);\r\n                                }else{\r\n                                \treduction_sum[i].value = insertComma2(Math.floor(fixFloatCal((parseFloat(bak_sum)*(parseFloat(percent_rate_cal)/100)*(parseFloat(100-reduction_rate_cal)/100))/100))*100);\r\n                                }\r\n                            }\r\n                        }\r\n\r\n\r\n                        // 납기후 금액\r\n                       if(type_name[i].value != '도로' && purpose_cd_l[i].value.substr(0,2) == '02'){\r\n                    \t   var overtax1 =  parseFloat(removeComma(reduction_sum[i].value));\r\n                       }else{\r\n                       \t\tvar overtax1 =  fixFloatCal(parseFloat(removeComma(reduction_sum[i].value))*3.0/100 + parseFloat(removeComma(reduction_sum[i].value)));\r\n                       }\r\n                       \r\n                        \r\n                        overtax1 = Math.floor(overtax1/10)*10;\r\n                        overtax[i].value = insertComma2(overtax1);\r\n\r\n\r\n                       \t// 부가가치세\r\n                       \tvar type;\r\n                       \tif(type_name[i].value == '도로'){\r\n                           \ttype = 1;\r\n                       \t}else if(type_name[i].value == '하천'){\r\n                           \ttype = 2;\r\n                       \t}else if(type_name[i].value == '구거'){\r\n                           \ttype = 3;\r\n                       \t}\r\n                       \t\r\n                       \tvar vat1 = inquiryVatYN('";
  private final static String _jspx_template16 = "',type,purpose_cd_l[i].value,removeComma(reduction_sum[i].value));\r\n                       \tvat[i].value = insertComma2(vat1);\r\n                            \r\n                    }\r\n\r\n\r\n                    /****************** 3단계 끝 ***************************/\r\n\r\n\r\n                } // for문 end\r\n\r\n                alert(\"계산이 완료되었습니다. \");\r\n            }\r\n\r\n\r\n            function continueProduct(idx)\r\n            {\r\n\r\n                var price = document.getElementsByName(\"PRICE\");\r\n                var form = document.getElementsByName(\"FORM\");\r\n                var sum_year = document.getElementsByName(\"SUM_YEAR\");\r\n                var sum_lastyear = document.getElementsByName(\"SUM_LASTYEAR\");\t\t// 작년도 점용료\r\n                var form_adjust = document.getElementsByName(\"FORM_ADJUST\");\r\n                var adjustment = document.getElementsByName(\"ADJUSTMENT\");\r\n                var sum_adjust = document.getElementsByName(\"SUM_ADJUST\");\r\n                var reduction_sum = document.getElementsByName(\"REDUCTION_SUM\");\r\n                var reduction_form = document.getElementsByName(\"REDUCTION_FORM\");\r\n                var rate_val = document.getElementsByName(\"RATE_VAL\");\r\n                var overtax = document.getElementsByName(\"OVERTAX\");\r\n\r\n                var area_after = document.getElementsByName(\"AREA_AFTER\");\r\n                var period = document.getElementById(\"PERIOD\").value;\r\n                var rate = document.getElementsByName(\"RATE\");\r\n\r\n                var old_rate = document.getElementsByName(\"OLD_RATE\");\r\n                var old_price = document.getElementsByName(\"OLD_PRICE\");\r\n                var old_area_size = document.getElementsByName(\"OLD_AREA_SIZE\");\r\n\r\n                var type_name = document.getElementsByName(\"TYPE_NAME\");\r\n                var purpose_cd_l = document.getElementsByName(\"PURPOSE_CD_L\");\r\n                var vat = document.getElementsByName(\"VAT\");\r\n\r\n                var check_yn = document.getElementsByName(\"CHECK_YN\");\r\n                \r\n                \r\n                var percent_rate = document.getElementsByName(\"PERCENT_RATE\");\r\n                var reduction_rate = document.getElementsByName(\"REDUCTION_RATE\");\r\n\r\n\r\n                var percent_rate_cal = 0; // 계산에 사용할 지분율\r\n                var reduction_rate_cal = 0; // 계산에 사용할 감면율\r\n                var reduction_rate_form = \"\";\r\n\r\n                \r\n                \r\n\r\n\r\n                if( percent_rate[idx].value == '' || percent_rate[idx].value == '0' || percent_rate[idx].value == '0.0'){\r\n                \tpercent_rate_cal = '100.0';\r\n                }else{\r\n                \tpercent_rate_cal = parseFloat(percent_rate[idx].value);\r\n                }\r\n                \r\n                if( reduction_rate[idx].value == '' || reduction_rate[idx].value == '0' || reduction_rate[idx].value == '0.0'){\r\n                    reduction_rate_cal = '0.0';\r\n                }else{\r\n                \treduction_rate_cal = parseFloat(reduction_rate[idx].value);\r\n                }\r\n                \r\n                \r\n                if(percent_rate_cal != '' && percent_rate_cal != '0.0' && percent_rate_cal != '100.0'){\r\n                \treduction_rate_form += \" X ((\"+percent_rate_cal+\")/100)\";\r\n                }\r\n                if(reduction_rate_cal != '' && reduction_rate_cal != '0.0'){\r\n                \treduction_rate_form += \" X ((100-\"+reduction_rate_cal+\")/100)\";\r\n                }\r\n\r\n\r\n                var price_cal = setFROMTO(removeComma(price[idx].value),0,1);\r\n                var rate_cal = setFROMTO(rate[idx].value,0,1);\r\n                var old_price_cal = setFROMTO(removeComma(old_price[idx].value),0,1);\r\n                var old_rate_cal = setFROMTO(old_rate[idx].value,0,1);\r\n\r\n\r\n               \tvar rateSumyear = fixFloatCal(parseFloat(old_area_size[idx].value)*parseFloat(rate_cal)*parseFloat(price_cal));\r\n                var rateLastyear = removeComma(sum_lastyear[idx].value);\r\n\r\n                var gongyu = purpose_cd_l[idx].value.charAt(0); // 점용목적. 공물법이면 0으로 시작\r\n                var jojung_rate = Math.floor((rateSumyear - rateLastyear ) / rat";
  private final static String _jspx_template17 = "eLastyear *100 ); // 현년도 작년도 점용료 비율\r\n\r\n\r\n                if(gongyu == 0 && jojung_rate >= 5 && jojung_rate <=3000 && check_yn[idx].value == '2' && type_name[idx].value == '도로'){\r\n\r\n\t                //var gongyu_adjust = (rateSumyear - rateLastyear) * 0.7;\t// jojung_rate가 5이상이면 증가율의 70%가 조정계수가 됨\r\n\t                var gongyu_adjust = (rateSumyear - (rateLastyear + (rateLastyear * 0.05))) * 0.3;\r\n               \t \tadjustment[idx].value = gongyu_adjust;\r\n\t               \t//console.log(\"gongyu: \" + gongyu);\r\n\t \t\t\t\t//console.log(\"jojung_rate: \" + \tjojung_rate);\r\n                    //console.log(\"조정계수: \" + gongyu_adjust);\r\n\t\t\t\t}\r\n                else if( jojung_rate >= 10 && jojung_rate <=3000 && check_yn[idx].value == '2' && type_name[idx].value == '도로' )//비율이 허용 범위내에 있을때\r\n                {\r\n                    //adjustment[idx].value = calJojung(jojung_rate);\r\n                \t//adjustment[idx].value = calJojungNew(jojung_rate);\r\n                \tadjustment[idx].value = calJojung2015(jojung_rate); //시행령69조에의해 수정 #ny(2016.01.)\r\n                }else if(jojung_rate >= 5 && check_yn[idx].value == '2' && type_name[idx].value != '도로'){\r\n                \t//adjustment[idx].valque = 1.05;\r\n                \tif(gongyu != 0){\r\n                    \t// 2016.02.12 kny\r\n\t\t\t\t\t\tif(jojung_rate < 5) {\r\n\t\t\t\t\t\t\tadjustment[idx].value = 1;\r\n\t\t\t\t\t\t}else{\r\n\t\t\t\t\t\t\tadjustment[idx].value = 1.05;\r\n\t\t\t\t\t\t}\r\n                    \t\r\n                    \t\r\n                    }else{\r\n                        /*if(purpose_cd_l[idx].value.charAt(1) == '1'){\r\n                        \t//var gongyu_adjust = (rateSumyear - rateLastyear) * 0.7;\t// jojung_rate가 5이상이면 증가율의 70%가 조정계수가 됨\r\n                        \tvar gongyu_adjust = (rateSumyear - (rateLastyear + (rateLastyear * 0.05))) * 0.3;\t// jojung_rate가 5이상이면 증가율의 70%가 조정계수가 됨\r\n                       \t \tadjustment[idx].value = gongyu_adjust;\r\n                       \t \t//console.log(\"gongyu: \" + gongyu);\r\n         \t\t\t\t\t//console.log(\"jojung_rate: \" + \tjojung_rate);\r\n                            //console.log(\"하천 조정계수: \" + gongyu_adjust);\r\n                        }else if(purpose_cd_l[idx].value.charAt(1) == '2'){\r\n                        \t//adjustment[idx].value = calJojungHachun(jojung_rate);\r\n                        \tadjustment[idx].value = 1.05;\r\n                        }*/\r\n                    \tif(10 > jojung_rate){\r\n\t\t\t\t\t\t\tadjustment[idx].value = 1.0;\r\n\t\t\t\t\t\t}else if(10 <= jojung_rate && jojung_rate < 20){\r\n                \t\t\tadjustment[idx].value = 1.1;\r\n                    \t}else if(20 <= jojung_rate && jojung_rate < 50){\r\n                    \t\tadjustment[idx].value = 1.13;\r\n                    \t}else if(50 <= jojung_rate && jojung_rate < 100){\r\n                    \t\tadjustment[idx].value = 1.16;                    \t\t\r\n                    \t}else if(100 <= jojung_rate && jojung_rate < 200){\r\n                    \t\tadjustment[idx].value = 1.19;\r\n                    \t}else if(200 <= jojung_rate && jojung_rate < 500){\r\n                    \t\tadjustment[idx].value = 1.22;\r\n                    \t}else{\r\n                    \t\tadjustment[idx].value = 1.25;\r\n                    \t}\r\n                    \t\r\n                    }\r\n                }else{\r\n                    adjustment[idx].value = 1;\r\n                }\r\n\r\n\t\t\t\tvar isAreaChange = false;\r\n                if(old_area_size[idx].value != area_after[idx].value){\r\n                \tisAreaChange = true;\r\n                }\r\n                if(isAreaChange){\r\n                \tadjustment[idx].value = 1;\r\n                }\r\n\r\n                var adjust = adjustment[idx].value;\r\n                var sum_lastyear = sum_lastyear[idx].value;\r\n\r\n\r\n                if(adjust == 1){\r\n\r\n                    var SUM_ADJUST = fixFloatCal( parseFloat(area_after[idx].value)*parseFloat(rate_cal)*parseFloat(price_cal)*parseFloat(period)/12*parseFloat(adjust));\r\n                    var REDUCTION_SUM = fixFloatCal(SUM_ADJUST*((percent_rate_cal)/100)*((100-reduction_rate_cal)/100));\r\n\r\n                    if(type_name[idx].value != '도로'){\r\n                        var SUM_ADJUST = Math.floor(";
  private final static String _jspx_template18 = " SUM_ADJUST / 10 ) * 10 ; //10원 절삭\r\n                        var REDUCTION_SUM = Math.floor( REDUCTION_SUM / 10 ) * 10 ; //10원 절삭\r\n\r\n                    }else{\r\n                    \tif(gongyu != 0){\t// 공물법 10원 절삭 적용\r\n                    \t\tvar SUM_ADJUST = Math.floor( SUM_ADJUST / 100 ) * 100 ; //100원 절삭\r\n                            var REDUCTION_SUM = Math.floor( REDUCTION_SUM / 100 ) * 100 ; //100원 절삭\r\n                    \t}else{\r\n                    \t\tvar SUM_ADJUST = Math.floor( SUM_ADJUST / 10 ) * 10 ; //10원 절삭\r\n                            var REDUCTION_SUM = Math.floor( REDUCTION_SUM / 10 ) * 10 ; //10원 절삭\r\n                    \t}\r\n                    }\r\n\r\n                    sum_adjust[idx].value = insertComma2(SUM_ADJUST);\r\n                    reduction_sum[idx].value = insertComma2(REDUCTION_SUM);\r\n\r\n                    if(check_yn[idx].value == '2'){\r\n                        form_adjust[idx].value = area_after[idx].value+\"㎡  X \" + rate_cal +\" X \" + insertComma2(price_cal) + \" X \" + adjust + \" X \" + period + \"/12 개월\";\r\n                    }else{\r\n                        form_adjust[idx].value = area_after[idx].value+\"㎡  X \" + rate_cal +\" X \" + period + \"/12 개월\";\r\n                    }\r\n\r\n                    reduction_form[idx].value = form_adjust[idx].value + reduction_rate_form;\r\n\r\n\r\n\r\n                }else{\r\n\r\n                \tif(gongyu != 0){\r\n\t                    var SUM_ADJUST = fixFloatCal( parseFloat( removeComma(sum_lastyear))*parseFloat(period)/12*parseFloat(adjust)*(parseFloat(area_after[idx].value)/parseFloat(old_area_size[idx].value)) );\r\n\t                    var REDUCTION_SUM = fixFloatCal(SUM_ADJUST*((percent_rate_cal)/100)*((100-reduction_rate_cal)/100));\r\n\t\r\n\t                    if(type_name[idx].value != '도로'){\r\n\t                        var SUM_ADJUST = Math.floor( SUM_ADJUST / 10 ) * 10 ; //10원 절삭\r\n\t                        var REDUCTION_SUM = Math.floor( REDUCTION_SUM / 10 ) * 10 ; //10원 절삭\r\n\t\r\n\t                    }else{\r\n\t                        var SUM_ADJUST = Math.floor( SUM_ADJUST / 100 ) * 100 ; //100원 절삭\r\n\t                        var REDUCTION_SUM = Math.floor( REDUCTION_SUM / 100 ) * 100 ; //100원 절삭\r\n\t                    }\r\n\t\r\n\t                    //sum_adjust[idx].value = insertComma2(SUM_ADJUST);\r\n\t                    //reduction_sum[idx].value = insertComma2(REDUCTION_SUM);\r\n\t                    \r\n\t                    var formAdujst = sum_lastyear + \"원 X \"+ adjust+ \" X \" + period + \"/12 개월\";\r\n\t                    if(area_after[idx].value != old_area_size[idx].value){\r\n\t                    \tformAdujst += \"  X \" + area_after[idx].value + \"㎡/\"+old_area_size[idx].value + \"㎡\";\r\n\t                    }\r\n\t\r\n\t                    form_adjust[idx].value = formAdujst;\r\n\t                    reduction_form[idx].value = form_adjust[idx].value + reduction_rate_form;\r\n                \t}else{\t// 공물법 적용\r\n                \t\t//var SUM_ADJUST = fixFloatCal((parseFloat(removeComma(sum_lastyear))  + parseFloat(adjust)) * (parseFloat(area_after[idx].value)/parseFloat(old_area_size[idx].value)));\r\n                \t\tvar SUM_ADJUST = fixFloatCal((parseFloat(removeComma(sum_lastyear) + (removeComma(sum_lastyear)*0.05))  + parseFloat(adjust)) * (parseFloat(area_after[idx].value)/parseFloat(old_area_size[idx].value)));\r\n\t                    var REDUCTION_SUM = fixFloatCal(SUM_ADJUST*((percent_rate_cal)/100)*((100-reduction_rate_cal)/100));\r\n\t                    //console.log(\"sum_lastyear :\" + removeComma(sum_lastyear));\r\n\t                \t//console.log(\"adjust :\" + adjust);\r\n\t                \t//console.log(\"SUM_ADJUST :\" + SUM_ADJUST);\r\n\t                \t//console.log(\"REDUCTION_SUM :\" + REDUCTION_SUM);\r\n\t\t\t\t\t\tvar tempSum = parseFloat(removeComma(sum_lastyear) + (removeComma(sum_lastyear)*0.05));\r\n\t\t\t\t\t\ttempSum = Math.floor( tempSum / 10 ) * 10 ; //10원 절삭\r\n                        SUM_ADJUST = Math.floor( SUM_ADJUST / 10 ) * 10 ; //10원 절삭\r\n                        REDUCTION_SUM = Math.floor( REDUCTION_SUM / 10 ) * 10 ; //10원 절삭\r\n                        if(adjustment[idx].value > 1.0){\r\n                        \tformAdu";
  private final static String _jspx_template19 = "jst = sum_lastyear + \"원 X ( \"+ adjustment[idx].value + \" )\";\r\n                        }else{\r\n                       \t\tformAdujst = tempSum + \"원 + \"+ Math.floor(adjust);\r\n                \t\t}\r\n\t                    //if(area_after[idx].value != old_area_size[idx].value){\r\n\t                    //\tformAdujst = \"( \" + formAdujst + \")  X \" + area_after[idx].value + \"㎡/\"+old_area_size[idx].value + \"㎡\";\r\n\t                    //}\r\n\t                    form_adjust[idx].value = formAdujst;\r\n\t                    //console.log(\"form: \" + reduction_rate_form);\r\n\t                    if(reduction_rate_form != \"\"){\r\n\t                    \treduction_form[idx].value = \"(\" + form_adjust[idx].value + \")\" + reduction_rate_form;\r\n\t                    }else{\r\n\t                    \treduction_form[idx].value = form_adjust[idx].value;\r\n\t                    }\r\n                \t}\r\n                \tsum_adjust[idx].value = insertComma2(SUM_ADJUST);\r\n                    reduction_sum[idx].value = insertComma2(REDUCTION_SUM);\r\n                }\r\n\r\n                if(type_name[idx].value != '도로' && purpose_cd_l[idx].value.substr(0,2) == '02'){\r\n                \t var overtax1 =  parseFloat(REDUCTION_SUM);\r\n                }else{\r\n                    var overtax1 =  fixFloatCal(parseFloat(REDUCTION_SUM)*3.0/100+parseFloat(REDUCTION_SUM));\r\n                }\r\n                \r\n                overtax1 = Math.floor(overtax1/10)*10;\r\n\r\n                overtax[idx].value = insertComma2(overtax1);\r\n\r\n               \t// 부가가치세\r\n               \tvar type;\r\n               \tif(type_name[idx].value == '도로'){\r\n                   \ttype = 1;\r\n               \t}else if(type_name[idx].value == '하천'){\r\n                   \ttype = 2;\r\n               \t}else if(type_name[idx].value == '구거'){\r\n                   \ttype = 3;\r\n               \t}\r\n               \t\r\n               \tvar vat1 = inquiryVatYN('";
  private final static String _jspx_template20 = "',type,purpose_cd_l[idx].value,parseFloat(REDUCTION_SUM));\r\n               \tvat[idx].value = insertComma2(vat1);\r\n            }\r\n\r\n\r\n\r\n\r\n            // 저장\r\n            function submitClick(){\r\n\r\n                var f = document.frm;\r\n                var year = document.getElementById(\"YEAR\").value;\r\n\r\n                if(f.TOTALCNT.value <= 0){\r\n                    alert(\"처리할 데이터가 없습니다. \");\r\n                    return;\r\n                }\r\n                if( document.getElementById(\"YEAR\").value == '' ){\r\n                    alert(\"부과년도를 넣어주세요. \");\r\n                    document.getElementById(\"YEAR\").focus();\r\n                    return;\r\n                }\r\n                if(\tdocument.getElementById(\"FROMDATE\").value == '' ){\r\n                    alert(\"산출기간을 넣어주세요.\");\r\n                    document.getElementById(\"FROMDATE\").focus();\r\n                    return;\r\n                }\r\n                if(document.getElementById(\"TODATE\").value == '' ){\r\n                    alert(\"산출기간을 넣어주세요.\");\r\n                    document.getElementById(\"TODATE\").focus();\r\n                    return;\r\n                }\r\n                if(\tdocument.getElementById(\"TAX_DATE\").value == '' ){\r\n                    alert(\"부과일자를 넣어주세요.\");\r\n                    document.getElementById(\"TAX_DATE\").focus();\r\n                    return;\r\n                }\r\n\r\n                var sum_lastyear = document.getElementsByName(\"SUM_LASTYEAR\");\r\n                var sum_year = document.getElementsByName(\"SUM_YEAR\");\r\n                var sum_adjust = document.getElementsByName(\"SUM_ADJUST\");\r\n                var reduction_sum = document.getElementsByName(\"REDUCTION_SUM\");\r\n                var overtax = document.getElementsByName(\"OVERTAX\");\r\n                var form_adjust = document.getElementsByName(\"FORM_ADJUST\");\r\n                var check_yn = document.getElementsByName(\"CHECK_YN\");\r\n                var price = document.getElementsByName(\"PRICE\");\r\n\r\n\r\n                for( var i = 0 ; i < sum_adjust.length ; i++) {\r\n\r\n\t                if(Number(removeComma(sum_year[i].value)) > 2000000000 ||\r\n\t                \t\tNumber(removeComma(sum_adjust[i].value)) > 2000000000 ||\r\n\t                \t\tNumber(removeComma(reduction_sum[i].value)) > 2000000000 ||\r\n\t                \t\tNumber(removeComma(overtax[i].value)) > 2000000000 ||\r\n\t                \t\tNumber(removeComma(price[i].value)) > 2000000000 ||\r\n\t                \t\tNumber(removeComma(sum_lastyear[i].value)) > 2000000000){\r\n                        alert(\"해당 건에 작년도점용료,공시지가,현년도점용료중 20억을 초과하는 금액이 있습니다. \\n\\n 재계산 후 저장하세요. \");\r\n                        reduction_sum[i].focus();\r\n                        return;\r\n\t\t             }\r\n                }\r\n                \r\n\r\n                for( var i = 0 ; i < sum_adjust.length ; i++) {\r\n\r\n                    if( sum_year[i].value == '' ){\r\n                        alert(\"현년도점용료를 다시 계산해주세요. \");\r\n                        sum_year[i].focus();\r\n                        return;\r\n                    }else{\r\n                        sum_year[i].value = removeComma(sum_year[i].value);\r\n                    }\r\n                    if( sum_adjust[i].value == '' ){\r\n                        alert(\"조정점용료를 다시 계산해주세요. \");\r\n                        sum_adjust[i].focus();\r\n                        return;\r\n                    }else{\r\n                        sum_adjust[i].value = removeComma(sum_adjust[i].value);\r\n                    }\r\n                    if( reduction_sum[i].value == '' ){\r\n                        alert(\"최종점용료를 다시 계산해주세요. \");\r\n                        reduction_sum[i].focus();\r\n                        return;\r\n                    }else{\r\n                        reduction_sum[i].value = removeComma(reduction_sum[i].value);\r\n                    }\r\n                    if( overtax[i].value == '' ){\r\n                        alert(\"납기후 금액을 다시 계산해주세요. \");\r\n                        overtax[i].focus();\r\n                        return;\r\n                    }else{\r\n                        overtax[i].value = removeComma(overtax[i].value);\r\n                    }\r\n                    if( form_adjus";
  private final static String _jspx_template21 = "t[i].value == '' ){\r\n                        alert(\"계산을 다시 해주세요. \");\r\n                        form_adjust[i].focus();\r\n                        return;\r\n                    }\r\n                    if( check_yn[i].value == '2' ){\r\n                        if(\tprice[i].value == '0' || price[i].value == '' ){\r\n                            alert(\"공시지가를 넣고 계산해주세요. \");\r\n                            price[i].focus();\r\n                            return;\r\n                        }\r\n                    }\r\n                    price[i].value = removeComma(price[i].value);\r\n                    sum_lastyear[i].value = removeComma(sum_lastyear[i].value);\r\n                }\r\n\r\n\r\n                if(!confirm(\"저장하시기 전에 정확하게 산출 및 입력되었는지 확인하셔야 합니다.\"))\r\n                    return;\r\n\r\n                if(!confirm(\"저장하시기 전에 부과일자,납기내기한, 납기후기한을 정확하게 입력되었는지 확인하셔야 합니다. \\n\\n 해당 건들에 대하여 저장 하시겠습니까?\"))\r\n                    return;\r\n\r\n                f.action = \"/jumyong/junggi/junggiAllCal_Prc.do?year=\"+year;\r\n                f.submit();\r\n            }\r\n\r\n\r\n            function \topenPriceValue(obj)\r\n            {\r\n            \t\r\n            \tvar priceList = document.getElementsByName(\"PRICE_BTN\");\r\n            \tvar targetIdx;\r\n            \tfor(var i = 0 ; i < priceList.length ; i++){\r\n            \t\tif(priceList[i] == obj){\r\n            \t\t\ttargetIdx = i;\r\n            \t\t} \r\n            \t}\r\n            \t\r\n                var admin_no = document.getElementsByName(\"ADMIN_NO\")[targetIdx].value;\r\n                var year = document.getElementById(\"YEAR\").value;\r\n                \r\n                var winW = 320;\r\n                var winH = 240;\r\n                var status =\"toolbar=no, location=no, directories=no, status=no, menubar=no, resizable=no, scrollbars=no, width=\"+winW+\", height=\"+winH+\", left=0, top=0\";\r\n\r\n                window.open('/land_price.do?ADMIN_NO='+admin_no+'&year='+year+'&idx='+targetIdx, 'win', status);\r\n            }\r\n\r\n\r\n\r\n            function setPriceValue(idx,price){\r\n                document.getElementsByName(\"PRICE\")[idx].value = price;\r\n            }\r\n\r\n            function viewResultExcel(){\r\n\r\n                var frm = document.getElementById(\"frm\");\r\n\r\n                frm.action = \"/jumyong/junggi/excel_junggiAllCal.do\";\r\n                frm.submit();\r\n\r\n            }\r\n\r\n\r\n\r\n        </script>\r\n    </head>\r\n\r\n    <body onload=\"InitPage()\">\r\n        <form id=\"frm\" name=\"frm\" method=\"post\">\r\n\r\n            <input type=\"hidden\" id=\"search\"  name=\"search\" value=\"";
  private final static String _jspx_template22 = "\">\r\n            <input type=\"hidden\" id=\"toDateValue\" name=\"toDateValue\" value=\"";
  private final static String _jspx_template23 = "\" >\r\n            <input type=\"hidden\" id=\"fromDateValue\" name=\"fromDateValue\" value=\"";
  private final static String _jspx_template24 = "\">\r\n            <input type=\"hidden\" id=\"jumyongNameValue\" name=\"jumyongNameValue\" value=\"";
  private final static String _jspx_template25 = "\">\r\n            <input type=\"hidden\" id=\"numberValueValue\" name=\"numberValueValue\" value=\"";
  private final static String _jspx_template26 = "\">\r\n            <input type=\"hidden\" id=\"yearVal\" name=\"yearVal\" value=\"";
  private final static String _jspx_template27 = "\">\r\n            <input type=\"hidden\" id=\"currentPage\" name=\"currentPage\" value=\"";
  private final static String _jspx_template28 = "\">\r\n            <input type=\"hidden\" id=\"PURPOSE_CD\" name=\"PURPOSE_CD\" value=\"";
  private final static String _jspx_template29 = "\">\r\n            <input type=\"hidden\" id=\"search_flag\" name=\"search_flag\" value=\"";
  private final static String _jspx_template30 = "\">\r\n            <input type=\"hidden\" id=\"TOTALCNT\" name=\"TOTALCNT\" value=\"";
  private final static String _jspx_template31 = "\">\r\n            <input type=\"hidden\" id=\"gubun\" name=\"gubun\" value=\"junggi\">\r\n            <input type=\"hidden\" id = \"RATE1\" name=\"RATE1\" value=\"\" >\r\n            <input type=\"hidden\" id=\"adjust111\" name=\"adjust111\" value=\"\">\r\n\r\n            <!-- 리스트 검색 hidden 값 -->\r\n            <input type=\"hidden\" id=\"YEAR_search\" name=\"YEAR_search\" value=\"";
  private final static String _jspx_template32 = "\">\r\n            <input type=\"hidden\" id=\"TYPE\" name=\"TYPE\" value=\"";
  private final static String _jspx_template33 = "\">\r\n            <input type=\"hidden\" id=\"TAX_SET\" name=\"TAX_SET\" value=\"";
  private final static String _jspx_template34 = "\">\r\n            <input type=\"hidden\" id=\"TAX_YN\" name=\"TAX_YN\" value=\"";
  private final static String _jspx_template35 = "\">\r\n            <input type=\"hidden\" id=\"BJ_CD\" name=\"BJ_CD\" value=\"";
  private final static String _jspx_template36 = "\">\r\n            <input type=\"hidden\" id=\"HJ_CD\" name=\"HJ_CD\" value=\"";
  private final static String _jspx_template37 = "\">\r\n            <input type=\"hidden\" id=\"jumyongName\" name=\"jumyongName\" value=\"";
  private final static String _jspx_template38 = "\">\r\n            <input type=\"hidden\" id=\"SECTION\" name=\"SECTION\" value=\"";
  private final static String _jspx_template39 = "\">\r\n            <input type=\"hidden\" id=\"search\" name=\"search\" value=\"";
  private final static String _jspx_template40 = "\">\r\n            <input type=\"hidden\" id=\"mul_fromdate\" name=\"mul_fromdate\" value=\"";
  private final static String _jspx_template41 = "\">\r\n            <input type=\"hidden\" id=\"mul_todate\" name=\"mul_todate\" value=\"";
  private final static String _jspx_template42 = "\">\r\n\r\n            <table width=\"780\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n                <tr>\r\n                    <td height=\"43\"><img src=\"/img/jumyong_junggi_title.gif\" width=\"800\" height=\"43\"></td>\r\n                </tr>\r\n                <tr>\r\n                    <td >\r\n                        <table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                            <tr>\r\n                                <td height=\"1\" bgcolor=\"eaeaea\"></td>\r\n                            </tr>\r\n                            <tr>\r\n                                <td height=\"14\"></td>\r\n                            </tr>\r\n                            <tr>\r\n                                <td>\r\n                                    <table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                                        <tr>\r\n                                            <td align=\"left\" height=\"22\" background=\"/img/tab_line_blue.gif\">\r\n                                                <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                                                    <tr>\r\n                                                        <td><img src=\"/img/sub_petition_title15.gif\" width=\"110\" height=\"22\"></td>\r\n                                                    </tr>\r\n                                                </table>\r\n                                            </td>\r\n                                        </tr>\r\n                                        <tr>\r\n                                            <td  class=\"contborder_purple\">\r\n                                                <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                                                    <tr>\r\n                                                        <td height=\"34\" class=\"sub_stan\">\r\n                                                        \t전체건수 : <span class=\"sub_stan_blue\">";
  private final static String _jspx_template43 = "</span>건\r\n\r\n                                                        </td>\r\n\r\n                                                        <td height=\"34\" align=\"right\">\r\n                                                            <img src=\"/img/excel_icon.gif\" alt=\"EXCEL 변환\" border=\"0\" onclick=\"javascript:viewResultExcel();\" style=\"cursor:hand\">\r\n                                                        </td>\r\n                                                    </tr>\r\n                                                    <tr>\r\n                                                        <td colspan=\"2\">\r\n                                                            <div style=\"width:780px;height:500px; padding:10px;overflow:scroll; scrollbar-face-color:#EEF8FB;  scrollbar-3dlight-color:#BBBDB6;scrollbar-highlight-color:#EEF8FB;scrollbar-shadow-color:#BBBDB6; scrollbar-darkshadow-color:#EEF8FB;  scrollbar-track-color:#EEF8FB; scrollbar-arrow-color:#BBBDB6;\">\r\n                                                                <table width=\"3200\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\r\n                                                                    <tr>\r\n                                                                        <td width=\"70px\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">관리번호</td>\r\n                                                                        <td width=\"150px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용인<br/>/법인명</td>\r\n                                                                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">과세<br/>구분</td>\r\n                                                                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용<br/>구분</td>\r\n                                                                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용<br/>종류</td>\r\n                                                                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">세입<br/>구분</td>\r\n                                                                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용지<br/>소유</td>\r\n                                                                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용지<br/>주소</td>\r\n                                                                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">도로(하천)<br/>주소</td>\r\n                                                                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용목적</td>\r\n                                                                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\"></td>\r\n                                                                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">전년도<br/>점용면적</td>\r\n                                                                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">전년도<br/>요율(단가)</td>\r\n                                                                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">전년도<br/>공시지가</td>\r\n                                                                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">전년도<br/>조정점용료</td>\r\n                                                                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\"></td>\r\n                                                                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">현년도<br/>점용면적</td>\r\n                                                                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">현년도<br/>요율(단가)</td>\r\n                                                                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">현년도<br/>공시지가</td>\r\n                                                                        <td a";
  private final static String _jspx_template44 = "lign=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">현년도<br/>점용료</td>\r\n                                                                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조정점용료</td>\r\n                                                                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">최종 점용료</td>\r\n                                                                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">부가가치세</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">납기후금액</td>\r\n                                                                        \r\n                                                                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조정<br/>계수</td>\r\n                                                                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">기본 산출식</td>\r\n                                                                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조정 산출식</td>\r\n                                                                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">최종 산출식</td>\r\n                                                                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">지분율</td>\r\n                                                                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">지분율 사유</td>\r\n                                                                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">감면율</td>\r\n                                                                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">감면율 사유</td>\r\n                                                                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\"></td>\r\n\r\n                                                                    </tr>\r\n\r\n                                                                    ";
  private final static String _jspx_template45 = "\r\n                                                                        ";
  private final static String _jspx_template46 = "\r\n                                                                            ";
  private final static String _jspx_template47 = "\r\n\r\n                                                                                ";
  private final static String _jspx_template48 = "\r\n                                                                                    <tr onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\">\r\n                                                                                        <td width=\"70px\" height=\"28\" align=\"center\">";
  private final static String _jspx_template49 = "</td>\r\n                                                                                        <td width=\"150px\" align=\"center\">";
  private final static String _jspx_template50 = "</td>\r\n                                                                                        <td width=\"50px\" align=\"center\">";
  private final static String _jspx_template51 = "</td>\r\n                                                                                        <td width=\"50px\" align=\"center\">";
  private final static String _jspx_template52 = "</td>\r\n                                                                                        <td width=\"50px\" align=\"center\">";
  private final static String _jspx_template53 = "</td>\r\n                                                                                        <td width=\"50px\" align=\"center\">";
  private final static String _jspx_template54 = "</td>\r\n                                                                                        <td width=\"50px\" align=\"center\">";
  private final static String _jspx_template55 = "</td>\r\n                                                                                        <td align=\"center\">";
  private final static String _jspx_template56 = " ";
  private final static String _jspx_template57 = "</td>\r\n                                                                                        <td align=\"center\">";
  private final static String _jspx_template58 = "</td>\r\n                                                                                        <td align=\"center\">";
  private final static String _jspx_template59 = "</td>\r\n\r\n                                                                                    <td align=\"center\">\r\n\r\n                                                                                    </td>\r\n\r\n                                                                                    <td width=\"80px\" align=\"center\">\r\n                                                                                        <input type=\"text\" class=\"input_form1\" name=\"OLD_AREA_SIZE\" value=\"";
  private final static String _jspx_template60 = "\" style=\"width:70px;border:0px;text-align:center\" readonly=\"readonly\">\r\n                                                                                    </td>\r\n                                                                                    <td width=\"80px\" align=\"center\">\r\n                                                                                        <input type=\"text\" class=\"input_form1\" name=\"OLD_RATE\" value=\"";
  private final static String _jspx_template61 = "\" style=\"width:60px;border:0px;text-align:center\"  readonly=\"readonly\">\r\n                                                                                    </td>\r\n                                                                                    <td width=\"80px\" align=\"center\">\r\n                                                                                        <input type=\"text\" class=\"input_form1\" name=\"OLD_PRICE\" value=\"";
  private final static String _jspx_template62 = "\" style=\"width:60px;border:0px;text-align:center\"  readonly=\"readonly\">\r\n                                                                                    </td>\r\n\r\n\r\n\r\n                                                                                    <td width=\"80px\" align=\"center\">\r\n                                                                                        <input type=\"text\" class=\"input_form1\" name=\"SUM_LASTYEAR\" value=\"";
  private final static String _jspx_template63 = "\" style=\"width:70px;text-align:center\" onkeyup=\"javascript:fn_addComma(this)\">\r\n                                                                                    </td>\r\n                                                                                    <td align=\"center\"></td>\r\n\r\n                                                                                    <td width=\"80px\" align=\"center\">\r\n                                                                                        <input type=\"text\" class=\"input_form1\" name=\"AREA_AFTER\" value=\"";
  private final static String _jspx_template64 = "\" style=\"width:70px;border:0px;text-align:center\"  readonly=\"readonly\">\r\n                                                                                    </td>\r\n\r\n                                                                                    <td width=\"80px\" align=\"center\">\r\n                                                                                        <input type=\"text\" class=\"input_form1\" name=\"RATE\" value=\"";
  private final static String _jspx_template65 = "\" style=\"width:70px;text-align:center\" onKeyDown=\"onlyNumberInput();\">\r\n                                                                                    </td>\r\n\r\n\r\n                                                                                    <td width=\"100px\" align=\"center\">\r\n                                                                                    \r\n                                                                                    ";
  private final static String _jspx_template66 = "\r\n                                                                                        ";
  private final static String _jspx_template67 = "\r\n\t\t                                                                                    \t<input type=\"text\" class=\"input_form1\" name=\"PRICE\" value=\"";
  private final static String _jspx_template68 = "\" style=\"width:70px\" onkeyup=\"javascript:fn_addComma(this)\">\r\n\t\t                                                                                    \t<img src=\"/img/stat_arr.gif\" name=\"PRICE_BTN\" onclick=\"javascript:openPriceValue(this);\"  style=\"vertical-align:middle;cursor:pointer;width: 12px;height: 11px\" >\r\n                                                                                        ";
  private final static String _jspx_template69 = "\r\n                                                                                        ";
  private final static String _jspx_template70 = "\r\n                                                                                            <input type=\"text\" class=\"input_form1\" name=\"PRICE\" value=\"1\" style=\"width:70px;border:0px;\"  readonly=\"readonly\">\r\n                                                                                        ";
  private final static String _jspx_template71 = "\r\n                                                                                    ";
  private final static String _jspx_template72 = "\r\n                                                                                    </td>\r\n\r\n                                                                                    <td width=\"80px\" align=\"center\">\r\n                                                                                        <input type=\"text\" class=\"input_form1\" name=\"SUM_YEAR\" value=\"\" style=\"width:70px\" onkeyup=\"javascript:fn_addComma(this)\">\r\n                                                                                    </td>\r\n\r\n                                                                                    <td width=\"80px\" align=\"center\">\r\n                                                                                        <input type=\"text\" class=\"input_form1\" name=\"SUM_ADJUST\" value=\"\" style=\"width:70px\" onkeyup=\"javascript:fn_addComma(this)\">\r\n                                                                                    </td>\r\n                                                                                    <td width=\"80px\" align=\"center\">\r\n                                                                                        <input type=\"text\" class=\"input_form1\" name=\"REDUCTION_SUM\" value=\"\" style=\"width:70px\" onkeyup=\"javascript:fn_addComma(this)\">\r\n                                                                                    </td>\r\n                                                                                    <td width=\"80px\" align=\"center\">\r\n                                                                                        <input type=\"text\" class=\"input_form1\" name=\"VAT\" value=\"0\" style=\"width:70px\" readonly=\"readonly\">\r\n                                                                                    </td>\r\n                                                                                    <td width=\"80px\" align=\"center\">\r\n                                                                                        <input type=\"text\" class=\"input_form1\" name=\"OVERTAX\" value=\"\" style=\"width:70px\" onkeyup=\"javascript:fn_addComma(this)\">\r\n                                                                                    </td>\r\n                                                                                    \r\n                                                                                    <td width=\"50px\" align=\"center\">\r\n                                                                                        <input type=\"text\" class=\"input_form1\" name=\"ADJUSTMENT\" value=\"\" style=\"width:40px\">\r\n                                                                                    </td>\r\n                                                                                    <td width=\"280px\" align=\"center\">\r\n                                                                                        <input type=\"text\" class=\"input_form1\" name=\"FORM\" value=\"\" style=\"width:270px\">\r\n                                                                                    </td>\r\n                                                                                    <td width=\"310px\" align=\"center\">\r\n                                                                                        <input type=\"text\" class=\"input_form1\" name=\"FORM_ADJUST\" value=\"\" style=\"width:300px\">\r\n                                                                                    </td>\r\n                                                                                    <td width=\"310px\" align=\"center\">\r\n                                                                                        <input type=\"text\" class=\"input_form1\" name=\"REDUCTION_FORM\" value=\"\" style=\"width:300px\">\r\n                                                                                    </td>\r\n                                                                                    <td width=\"50px\" align=\"center\">\r\n                                                                                        <input type=\"text\" class=\"input_form1\" name=\"PERCENT_RATE\" value=\"";
  private final static String _jspx_template73 = "\" style=\"width:40px\" readonly=\"readonly\">\r\n                                                                                    </td>\r\n                                                                                    <td width=\"100px\" align=\"center\">\r\n                                                                                        <input type=\"text\" class=\"input_form1\" name=\"PERCENT_REASON\" value=\"";
  private final static String _jspx_template74 = "\" style=\"width:90px\" readonly=\"readonly\">\r\n                                                                                    </td>\r\n                                                                                    <td width=\"50px\" align=\"center\">\r\n                                                                                        <input type=\"text\" class=\"input_form1\" name=\"REDUCTION_RATE\" value=\"";
  private final static String _jspx_template75 = "\" style=\"width:40px\" readonly=\"readonly\">\r\n                                                                                    </td>\r\n                                                                                    <td width=\"100px\" align=\"center\">\r\n                                                                                        <input type=\"text\" class=\"input_form1\" name=\"REDUCTION_REASON\" value=\"";
  private final static String _jspx_template76 = "\" style=\"width:90px\" readonly=\"readonly\">\r\n                                                                                    </td>\r\n\r\n                                                                                    <td>\r\n                                                                                        <!-- 계산시 필요한 값들 -->\r\n                                                                                        <input type=\"hidden\" name=\"ADMIN_NO\" value=\"";
  private final static String _jspx_template77 = "\">\r\n                                                                                        <input type=\"hidden\" name=\"CHECK_YN\" value=\"";
  private final static String _jspx_template78 = "\">\r\n                                                                                        <input type=\"hidden\" name=\"SUM\" value=\"\">\r\n                                                                                        <input type=\"hidden\" name=\"TYPE_NAME\" value=\"";
  private final static String _jspx_template79 = "\">\r\n\r\n                                                                                        <!-- 디비 입력시 필요한 값들 -->\r\n                                                                                        <input type=\"hidden\" name=\"SIGU_CD\" value=\"";
  private final static String _jspx_template80 = "\">\r\n                                                                                        <input type=\"hidden\" name=\"BJ_CD\" value=\"";
  private final static String _jspx_template81 = "\">\r\n                                                                                        <input type=\"hidden\" name=\"DEPT_CD\" value=\"";
  private final static String _jspx_template82 = "\">\r\n                                                                                        <input type=\"hidden\" name=\"TAX_GUBUN\" value=\"";
  private final static String _jspx_template83 = "\">\r\n                                                                                        <input type=\"hidden\" name=\"OBJ_SET\" value=\"";
  private final static String _jspx_template84 = "\">\r\n                                                                                        <input type=\"hidden\" name=\"TAXPAYER_ID\" value=\"";
  private final static String _jspx_template85 = "\">\r\n                                                                                        <input type=\"hidden\" name=\"TAXPAYER_SET\" value=\"";
  private final static String _jspx_template86 = "\">\r\n                                                                                        <input type=\"hidden\" name=\"OCR_SIGU_CD\" value=\"";
  private final static String _jspx_template87 = "\">\r\n                                                                                        <input type=\"hidden\" name=\"OCR_BUSEO_CD\" value=\"";
  private final static String _jspx_template88 = "\">\r\n                                                                                        <input type=\"hidden\" name=\"TAX_CD\" value=\"";
  private final static String _jspx_template89 = "\">\r\n                                                                                        <input type=\"hidden\" name=\"LIVE\" value=\"";
  private final static String _jspx_template90 = "\">\r\n                                                                                        <input type=\"hidden\" name=\"ADD_SET\" value=\"";
  private final static String _jspx_template91 = "\">\r\n                                                                                        <input type=\"hidden\" name=\"ADD_YN\" value=\"";
  private final static String _jspx_template92 = "\">\r\n                                                                                        <input type=\"hidden\" name=\"SUBUSEO_CD\" value=\"";
  private final static String _jspx_template93 = "\">\r\n                                                                                        <input type=\"hidden\" name=\"PURPOSE_CD_L\" value=\"";
  private final static String _jspx_template94 = "\">\r\n\r\n                                                                                        <!--엑셀 저장을 위한 추가 정보 -->\r\n                                                                                        <input type=\"hidden\" name=\"ADMIN_NO2\" value=\"";
  private final static String _jspx_template95 = "\">\r\n                                                                                        <input type=\"hidden\" name=\"NAME\" value=\"";
  private final static String _jspx_template96 = "\">\r\n                                                                                        <input type=\"hidden\" name=\"TAX_SET_NAME\" value=\"";
  private final static String _jspx_template97 = "\">\r\n                                                                                        <input type=\"hidden\" name=\"SECTION_NAME\" value=\"";
  private final static String _jspx_template98 = "\">\r\n                                                                                        <input type=\"hidden\" name=\"ADDR\" value=\"";
  private final static String _jspx_template99 = " ";
  private final static String _jspx_template100 = "\">\r\n                                                                                         <input type=\"hidden\" name=\"ROAD_ADDR\" value=\"";
  private final static String _jspx_template101 = "\">\r\n                                                                                        <input type=\"hidden\" name=\"PURPOSE_CLASSNM\" value=\"";
  private final static String _jspx_template102 = "\">\r\n                                                                                        <input type=\"hidden\" name=\"OWNER_SET_NM\" value=\"";
  private final static String _jspx_template103 = "\">\r\n\r\n\r\n\r\n\r\n                                                                                    </td>\r\n\r\n\r\n\r\n                                                                                    </tr>\r\n                                                                                ";
  private final static String _jspx_template104 = "\r\n                                                                            ";
  private final static String _jspx_template105 = "\r\n                                                                        ";
  private final static String _jspx_template106 = "\r\n                                                                        ";
  private final static String _jspx_template107 = "\r\n                                                                            <tr>\r\n                                                                                <td align=\"center\" class=\"sub_table\" colspan=\"18\" height=\"85\"> 내용이 없습니다</td>\r\n                                                                            </tr>\r\n                                                                        ";
  private final static String _jspx_template108 = "\r\n                                                                    ";
  private final static String _jspx_template109 = "\r\n\r\n                                                                </table>\r\n                                                            </div>\r\n                                                        </td>\r\n                                                    </tr>\r\n                                                    <tr height=\"20\">\r\n                                                        <td>\r\n\r\n                                                        </td>\r\n                                                    </tr>\r\n\r\n                                                    <tr>\r\n                                                        <td align=\"center\" colspan=\"2\">\r\n                                                            <table width=\"100%\" border=\"0\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n                                                                <tr>\r\n                                                                    <td>산출 내역 저장 전에 점용료와 산출식을 한 번 더 확인하시기 바랍니다.(공유재산물품관리법)\r\n                                                                        <table width=\"100%\" border=\"0\"  cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n                                                                            <tr>\r\n                                                                                <td width=\"10%\" height=\"26\" align=\"left\"  class=\"sub_table_b\">&nbsp;* 세부 내역</td>\r\n                                                                            </tr>\r\n                                                                        </table>\r\n                                                                    </td>\r\n                                                                </tr>\r\n                                                            </table>\r\n                                                            <table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n                                                                <tr>\r\n                                                                    <td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">부과년도</td>\r\n                                                                    <td width=\"100%\" class=\"table_bl_left\" colspan=\"3\" align=\"left\">\r\n                                                                        <input id=\"YEAR\"  name=\"YEAR\" type=\"text\" style=\"width:80px;ime-mode:disabled;\" class=\"input_form1\"  onKeyDown=\"onlyNumberInput();\" value=\"";
  private final static String _jspx_template110 = "\" maxlength=\"4\" onKeyUp=\"change_value(this)\">\r\n                                                                    </td>\r\n                                                                </tr>\r\n                                                                <tr>\r\n                                                                    <td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">산출기간</td>\r\n                                                                    <td class=\"table_bl_left\" colspan=\"3\" align=\"left\">\r\n                                                                        <input name=\"FROMDATE\" id=\"FROMDATE\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template111 = "\"  onKeyDown=\"onlyNumberInput();\"   onKeyDown=\"onlyNumberInput();\" maxlength=10>\r\n                                                                        <img src=\"/img/calendar_icon.gif\" onclick=\"popUpCalendar(this, document.getElementById('FROMDATE'), 'yyyymmdd');\"  style=\"vertical-align:middle;cursor:pointer\" >\r\n                                                                        <input name=\"TODATE\" id=\"TODATE\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\"  value=\"";
  private final static String _jspx_template112 = "\"  onKeyDown=\"onlyNumberInput();\" maxlength=10>\r\n                                                                        <img src=\"/img/calendar_icon.gif\" onclick=\"popUpCalendar(this, document.getElementById('TODATE'), 'yyyymmdd');\"  style=\"vertical-align:middle;cursor:pointer\" >\r\n                                                                        &nbsp;&nbsp; 달수 :\r\n                                                                        <input name=\"PERIOD\" id =\"PERIOD\" type=\"text\" class=\"input_form1\" style=\"width:60px;ime-mode:disabled;\" value = \"";
  private final static String _jspx_template113 = "\"   onKeyDown=\"onlyNumberInput();\" >\r\n                                                                        <img src=\"/img/cal_month.gif\" align=\"absmiddle\" alt=\"날짜 계산\" width=\"64\" height=\"18\" border=\"0\" style=\"vertical-align:middle;cursor:pointer\" onClick=\"javascript:junggi_calDate();\">\r\n\r\n                                                                    </td>\r\n                                                                </tr>\r\n                                                                <tr>\r\n                                                                    <td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">과세일자</td>\r\n                                                                    <td width=\"25%\" class=\"table_bl_left\" align=\"left\">\r\n                                                                        <input name=\"TAX_DATE\" id=\"TAX_DATE\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template114 = "\"  onKeyDown=\"onlyNumberInput();\"   onKeyDown=\"onlyNumberInput();\" maxlength=10>\r\n                                                                        <img src=\"/img/calendar_icon.gif\" onclick=\"popUpCalendar(this, document.getElementById('TAX_DATE'), 'yyyymmdd');\"  style=\"vertical-align:middle;cursor:pointer\" >\r\n                                                                    </td>\r\n                                                                    <td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">납기내일자</td>\r\n                                                                    <td width=\"\" class=\"table_bl_left\" align=\"left\">\r\n                                                                        <input name=\"INDATE\" id=\"INDATE\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template115 = "\"  onKeyDown=\"onlyNumberInput();\"   onKeyDown=\"onlyNumberInput();\" maxlength=10>\r\n                                                                        <img src=\"/img/calendar_icon.gif\" onclick=\"popUpCalendar(this, document.getElementById('INDATE'), 'yyyymmdd');\"  style=\"vertical-align:middle;cursor:pointer\" >\r\n                                                                    </td>\r\n                                                                </tr>\r\n                                                                <tr>\r\n                                                                    <td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">\r\n\t\t\t                                                                ";
  private final static String _jspx_template116 = "\r\n\t\t\t                                                                        \t과징율(무단)\r\n\t\t\t                                                                ";
  private final static String _jspx_template117 = "\r\n\t\t\t                                                        </td>\r\n                                                        <td width=\"42%\" class=\"table_bl_left\" align=\"left\">\r\n                                                    ";
  private final static String _jspx_template118 = "\r\n                                                        <input id=\"SURCHARGE_RATE\" name=\"SURCHARGE_RATE\" type=\"text\" style=\"width:80px;ime-mode:disabled;\"  class=\"input_form1\"  onKeyDown=\"onlyNumberInput();\" value=\"1.2\">\r\n                                                    ";
  private final static String _jspx_template119 = "\r\n                                            </td>\r\n                                            <td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">\r\n                                            \t납기후일자\r\n                                            </td>\r\n                                            <td width=\"\" class=\"table_bl_left\" align=\"left\">\r\n                                                <input name=\"OVERDATE\" id=\"OVERDATE\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value=\"\"  onKeyDown=\"onlyNumberInput();\"   onKeyDown=\"onlyNumberInput();\" maxlength=10>\r\n                                                <!--  //********** BEGIN_현진_20120227 -->\r\n\t\t\t\t\t\t\t\t\t\t\t\t<!-- \r\n\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"/img/calendar_icon.gif\" onclick=\"popUpCalendar(this, document.getElementById('TAX_DATE'), 'yyyymmdd');\"  style=\"vertical-align:middle;cursor:pointer\" >\r\n\t\t\t\t\t\t\t\t\t\t\t\t-->\r\n\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"/img/calendar_icon.gif\" onclick=\"popUpCalendar(this, document.getElementById('OVERDATE'), 'yyyymmdd');\"  style=\"vertical-align:middle;cursor:pointer\" >\r\n\t\t\t\t\t\t\t\t\t\t\t\t<!--   //********** END_현진_20120227 -->\r\n                                                \r\n                                            </td>\r\n                                        </tr>\r\n                                    </table>\r\n                                </td>\r\n                            </tr>\r\n                            <tr>\r\n                                <td height=\"40\" align=\"right\" colspan=\"2\">\r\n                                    <table border=\"0\" width=\"100%\">\r\n                                        <tr>\r\n                                            <td height=\"40\" align=\"right\">\r\n                                                <img src=\"/img/accou_icon.gif\" alt=\"계산\" width=\"56\" height=\"18\" border=\"0\" onclick=\"javascript:Calculate();\" style=\"vertical-align:middle;cursor:pointer\">\r\n                                                <img src=\"/img/save_icon2.gif\" alt=\"저장\" width=\"56\" height=\"18\" border=\"0\" onClick=\"javascript:submitClick();\" style=\"vertical-align:middle;cursor:pointer\">\r\n                                                <img src=\"/img/can_icon.gif\" alt=\"취소\" border=\"0\" onclick=\"javascript:history.back();\" style=\"vertical-align:middle;cursor:pointer\">\r\n                                            </td>\r\n                                        </tr>\r\n                                    </table>\r\n                                </td>\r\n                            </tr>\r\n                        </table>\r\n                    </td>\r\n                </tr>\r\n            </table>\r\n        </td>\r\n    </tr>\r\n    <tr>\r\n        <td height=\"30\">\r\n\r\n        </td>\r\n    </tr>\r\n</table>\r\n\r\n</td>\r\n</tr>\r\n</table>\r\n</form>\r\n</body>\r\n</html>\r\n\r\n";
}
