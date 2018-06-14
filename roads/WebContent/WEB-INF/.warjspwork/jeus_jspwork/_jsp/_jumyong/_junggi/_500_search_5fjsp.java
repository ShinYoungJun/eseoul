package jeus_jspwork._jsp._jumyong._junggi;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_search_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      out.write(_jspx_template11);
      // jsp code [from=(133,112);to=(133,116)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TYPE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(133,134);to=(133,144)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PURPOSE_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      out.write(_jspx_template14);
      out.write(_jspx_template15);
      // jsp code [from=(424,57);to=(424,64)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${search }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(425,53);to=(425,59)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${toDate}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(426,57);to=(426,65)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${fromDate}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(427,63);to=(427,74)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${jumyongName}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(429,63);to=(429,74)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${juminNumber}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(430,61);to=(430,71)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${corpNumber}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(432,63);to=(432,74)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${numberValue}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(433,45);to=(433,49)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${year}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(434,67);to=(434,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // jsp code [from=(435,65);to=(435,75)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PURPOSE_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);
      // jsp code [from=(436,67);to=(436,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${search_flag}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template26);
      // jsp code [from=(437,61);to=(437,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${totalcnt}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // jsp code [from=(439,59);to=(439,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${message}",java.lang.String.class , pageContext.getVariableResolver(), null));

      // jsp code [from=(468,22);to=(475,7)]
      out.write(_jspx_template28);
      out.write(_jspx_template29);
      // jsp code [from=(479,125);to=(479,129)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${year}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template30);
      // jsp code [from=(501,10);to=(501,18)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${use_type}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template31);
      // jsp code [from=(510,12);to=(510,28)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${taxation_section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template32);
      // jsp code [from=(516,28);to=(516,39)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${taxation_yn}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template33);
      // jsp code [from=(524,114);to=(524,127)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mul_fromdate }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template34);
      // jsp code [from=(526,123);to=(526,134)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mul_todate }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template35);
      // jsp code [from=(545,81);to=(545,92)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bjdong_code}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template36);
      // jsp code [from=(546,79);to=(546,90)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${hjdong_code}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template37);
      // jsp code [from=(552,178);to=(552,190)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${jumyongName }",java.lang.String.class , pageContext.getVariableResolver(), null));

      // jsp code [from=(558,5);to=(558,44)]
      out.write(_jspx_template38);
      out.write(_jspx_template39);
      // jsp code [from=(564,170);to=(564,178)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${juminNB }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template40);
      // jsp code [from=(573,168);to=(573,175)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${corpNB }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template41);
      // jsp code [from=(590,89);to=(590,98)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${listCount}",java.lang.String.class , pageContext.getVariableResolver(), null));

      // jsp code [from=(604,5);to=(604,44)]
      out.write(_jspx_template42);
      out.write(_jspx_template43);
      // ----  c:choose ---- invoke //
      if (_jspx_th_c_choose_0_fn(pageContext, null)) return;


      out.write(_jspx_template90);
      // jsp code [from=(691,30);to=(691,37)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${pageing}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template91);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_0_fn(pageContext, null)) return;


      out.write(_jspx_template93);
      // jsp code [from=(740,53);to=(740,60)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template94);
      // jsp code [from=(742,56);to=(742,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GONGSIJIGA}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template95);

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
          out.write(_jspx_template44);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template87);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template89);

        } while (_jspx_th_c_choose_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_choose_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_choose_0.release();
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${tax_yn == '0'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template92);

        } while (_jspx_th_c_if_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_0.release();
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
          out.write(_jspx_template45);
          // ----  c:forEach ---- invoke //
          if (_jspx_th_c_forEach_0_fn(pageContext, _jspx_th_c_when_0)) return true;


          out.write(_jspx_template86);

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
          out.write(_jspx_template88);

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
            out.write(_jspx_template46);
            // jsp code [from=(637,51);to=(637,65)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template47);
            // jsp code [from=(637,71);to=(637,81)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template48);
            // jsp code [from=(637,87);to=(637,104)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PURPOSE_CD }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template49);
            // jsp code [from=(639,71);to=(639,86)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADMIN_NO2}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template50);
            // jsp code [from=(640,59);to=(640,71)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TAX_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template51);
            // jsp code [from=(641,64);to=(641,76)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TAX_YN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template52);
            // jsp code [from=(642,64);to=(642,80)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SUM_ADJUST}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template53);
            // jsp code [from=(643,60);to=(643,70)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            // jsp code [from=(644,5);to=(644,44)]
            out.write(_jspx_template54);
            out.write(_jspx_template55);
            // jsp code [from=(645,71);to=(645,80)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SSN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template56);
            // jsp code [from=(647,46);to=(647,56)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.POST}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template57);
            // jsp code [from=(648,46);to=(648,56)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADDR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template58);
            // jsp code [from=(649,46);to=(649,54)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SI}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template59);
            // jsp code [from=(649,58);to=(649,67)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template60);
            // jsp code [from=(649,71);to=(649,84)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.DORO_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template61);
            // jsp code [from=(649,88);to=(649,100)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_BON}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template62);
            // jsp code [from=(649,104);to=(649,115)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_BU}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template63);
            // jsp code [from=(649,119);to=(649,130)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template64);
            // jsp code [from=(649,134);to=(649,149)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_DET_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template65);
            // jsp code [from=(650,46);to=(650,64)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SECTION_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template66);
            // jsp code [from=(651,46);to=(651,59)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template67);
            // jsp code [from=(652,46);to=(652,56)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TYPE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template68);
            // jsp code [from=(653,46);to=(653,59)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TAX_SET}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template69);
            // jsp code [from=(654,46);to=(654,64)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_SET_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template70);
            // jsp code [from=(655,46);to=(655,57)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BJ_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template71);
            // jsp code [from=(655,61);to=(655,74)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BONBUN }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template72);
            // jsp code [from=(657,46);to=(657,61)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ROAD_ADDR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template73);
            // jsp code [from=(659,28);to=(659,38)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.AREA}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template74);
            // jsp code [from=(660,40);to=(660,61)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PURPOSE_CLASSNM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template75);
            // jsp code [from=(661,40);to=(661,60)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.REDUCTION_FORM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template76);
            // jsp code [from=(662,28);to=(662,47)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.REDUCTION_SUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template77);
            // jsp code [from=(663,28);to=(663,37)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.VAT}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template78);
            // jsp code [from=(664,28);to=(664,48)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.REDUCTION_RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template79);
            // jsp code [from=(665,40);to=(665,62)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.REDUCTION_REASON}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template80);
            // jsp code [from=(666,28);to=(666,41)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TAXNAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template81);
            // jsp code [from=(667,28);to=(667,42)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.FROMDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template82);
            // jsp code [from=(668,28);to=(668,40)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TODATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template83);
            // jsp code [from=(669,28);to=(669,38)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template84);
            // jsp code [from=(670,28);to=(670,39)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PRICE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template85);

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

  private final static String _jspx_template0 = "\r\n";
  private final static String _jspx_template1 = "\r\n";
  private final static String _jspx_template2 = "  \r\n";
  private final static String _jspx_template3 = "  \r\n";
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "\r\n";
  private final static String _jspx_template6 = "\r\n";
  private final static String _jspx_template7 = "\r\n";
  private final static String _jspx_template8 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('사용자의 사용시간이 종료되었습니다. 다시 접속 해주시기 바랍니다.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template9 = "\r\n";
  private final static String _jspx_template10 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n<script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script> \r\n<script>\r\n\t\t\r\n\tfunction checkKeySearch()\r\n\t{\r\n\t\tif(event.keyCode == 13) goSearch();\r\n\t}\r\n\t\r\n\t// 조회\r\n\tfunction goSearch()\r\n\t{\r\n\r\n\t\tvar year = document.getElementById(\"YEAR\").value;\r\n\t\tvar type = document.getElementById(\"TYPE\").value;\r\n\t\tvar tax_set = document.getElementById(\"TAX_SET\").value;\r\n\t\tvar tax_yn = document.getElementById(\"TAX_YN\").value;\t\t\r\n\t\tvar mul_fromdate = document.getElementById(\"mul_fromdate\").value;\r\n\t\tvar mul_todate = document.getElementById(\"mul_todate\").value;\r\n\t\tvar bj_cd = document.getElementById(\"BJ_CD\").value;\r\n\t\tvar hj_cd = document.getElementById(\"HJ_CD\").value;\r\n\t\tvar jumyongName = document.getElementById(\"jumyongName\").value;\r\n\t\tvar cal_status = document.getElementById(\"cal_status\").value;\r\n\t\tvar section = document.getElementById(\"SECTION\").value;\r\n\t\t// 공시지가 산출년도 or 최신년도 구분. 2012-11-28. by ksic\r\n\t\tvar gongsijiga = document.getElementById(\"GONGSIJIGA\").value;\r\n\t\t// 정기분 관리 주민번호/법인번호 조회 추가. 180612 by ksic\r\n\t\tvar juminNB = document.getElementById(\"juminNB\").value;\r\n\t\tvar corpNB = document.getElementById(\"corpNB\").value;\r\n\r\n\t\tif( year == ''){\r\n\t\t\talert(\"산출년도를 입력하세요. \");\r\n\t\t\tdocument.getElementById(\"YEAR\").focus();\r\n\t\t\treturn;\r\n\t\t}\r\n\t\tif( mul_fromdate == ''){\r\n\t\t\talert(\"사용부과기간을 입력하세요. \");\r\n\t\t\tdocument.getElementById(\"mul_fromdate\").focus();\r\n\t\t\treturn;\r\n\t\t}\r\n\t\tif( mul_todate == ''){\r\n\t\t\talert(\"사용부과기간을 입력하세요. \");\r\n\t\t\tdocument.getElementById(\"mul_todate\").focus();\r\n\t\t\treturn;\r\n\t\t}\r\n\t\tif( section == ''){\r\n\t\t\talert(\"점용구분을 선택하세요. \");\r\n\t\t\tdocument.getElementById(\"SECTION\").focus();\r\n\t\t\treturn;\r\n\t\t}\r\n\t\t\r\n\t\tvar iFrm = document.getElementById(\"IFRM_PurposeCode\");\r\n\t\tvar purpose = iFrm.contentWindow.document.getElementById(\"PURPOSE_CD\").value;\r\n\t\tvar purpose1 = iFrm.contentWindow.document.getElementById(\"PURPOSE1\");\r\n\r\n\t\tif(purpose1[purpose1.selectedIndex].text == \"::선택::\")\r\n\t\t\tpurpose=\"\";\r\n\r\n\t\tif(type.length==0)\t\t//점용종류가 선택이 안되면 점용목적은 선택되지 않도록 purpose값을 지정 \r\n\t\t\tpurpose=\"\";\r\n\r\n\t\t/*\r\n\t\tlocation.href=\"/jumyong/junggi/search.do?year=\"+year+\"&type=\"+type+\"&tax_set=\"+tax_set+\"&tax_yn=\"+tax_yn+\"&mul_fromdate=\"+mul_fromdate+\"&mul_todate=\"+mul_todate+\r\n\t\t\t\"&purpose_cd=\"+purpose+\"&bj_cd=\"+bj_cd+\"&hj_cd=\"+hj_cd+\"&jumyongName=\"+jumyongName+\"&cal_status=\"+cal_status+\"&SECTION=\"+section+\"&search=1\";\r\n\t\t*/\r\n\t\t/*\r\n\t\t// 공시지가 산출년도 or 최신년도 구분. 2012-11-28. by ksic\r\n\t\tlocation.href=\"/jumyong/junggi/search.do?year=\"+year+\"&type=\"+type+\"&tax_set=\"+tax_set+\"&tax_yn=\"+tax_yn+\"&mul_fromdate=\"+mul_fromdate+\"&mul_todate=\"+mul_todate+\r\n\t\t\"&purpose_cd=\"+purpose+\"&bj_cd=\"+bj_cd+\"&hj_cd=\"+hj_cd+\"&jumyongName=\"+jumyongName+\"&cal_status=\"+cal_status+\"&SECTION=\"+section+\"&search=1&GONGSIJIGA=\"+gongsijiga;\r\n\t\t*/\r\n\t\t// 정기분 관리 주민번호/법인번호 조회 추가. 180612 by ksic\r\n\t\tlocation.href=\"/jumyong/junggi/search.do?year=\"+year+\"&type=\"+type+\"&tax_set=\"+tax_set+\"&tax_yn=\"+tax_yn+\"&mul_fromdate=\"+mul_fromdate+\"&mul_todate=\"+mul_todate+\r\n\t\t\"&purpose_cd=\"+purpose+\"&bj_cd=\"+bj_cd+\"&hj_cd=\"+hj_cd+\"&jumyongName=\"+jumyongName+\"&cal_status=\"+cal_status+\"&SECTION=\"+section+\"&search=1&GONGSIJIGA=\"+gongsijiga+\r\n\t\t\"&juminNB=\"+juminNB+\"&corpNB=\"+corpNB;\r\n\t}\r\n\t\r\n\tfunction InitPage()\r\n\t{\r\n\t\t//var junggi = \"정기분 일괄 산출 시 공유재산물품관리법 조정계수 적용은\\n\";\r\n\t\t//junggi += \"2월 25일 수요일에 완료 에정입니다.\\n\";\r\n\t\t//junggi += \"2월 26일 목요일에 정기분 일괄산출 작업을 진행해주시기 바랍니다\";\r\n\t\t//alert(junggi);\r\n\t\t//setYear();\r\n\t\tvar now = new Date();\r\n\t\tvar day=now.getDay();\r\n\t\tday = 1 - day;\t\t\t\t\r\n\t\tDate.prototype.addDate = add_date; // Date 객체에 메서드 정의\r\n\t\t\r\n\t\tvar fromDate = new Date(); // 현재 날짜 객체 생성\r\n\t\t\r\n\t\tfromDate.addDate(day); // \r\n\t\t\r\n\t\tvar toDate =   document.getElementById(\"toDateValue\").value ;\r\n\t\tvar fromDate =   document.getElementById(\"fromDate";
  private final static String _jspx_template11 = "Value\").value ;\r\n\t\tvar jumyongName =   document.getElementById(\"jumyongNameValue\").value ;\r\n\t\tvar numberValue =   document.getElementById(\"numberValueValue\").value ;\r\n\t\tvar search_flag =   document.getElementById(\"search_flag\").value ;\r\n\t\t//정기분 관리 주민번호/법인번호 조회 추가. 180612 by ksic\r\n\t\tvar ssn =   document.getElementById(\"ssnValue\").value ;\r\n\r\n\t\tif(toDate != \"\" && toDate !=\"99999999\" )\r\n\t\t\tdocument.getElementById(\"searchToDate\").value = addDash(toDate);\r\n\r\n\t\tif(fromDate != \"\" && fromDate != \"0\")\t\t\r\n\t\t\tdocument.getElementById(\"searchFromDate\").value = addDash(fromDate);\r\n\r\n\t\tif(jumyongName != \"\")\t\t\t\t\r\n\t\t\tdocument.getElementById(\"jumyongName\").value = jumyongName;\r\n\t\t\r\n\t\t// 정기분 관리 주민번호/법인번호 조회 추가. 180612 by ksic\r\n\t\tif(juminNB != \"\")\t\t\t\t\r\n\t\t\tdocument.getElementById(\"juminNB\").value = juminNumber;\r\n\t\t\r\n\t\tif(corpNB != \"\")\t\t\t\t\r\n\t\t\tdocument.getElementById(\"corpNB\").value = corpNumber;\r\n\t\t\r\n\t\t//document.getElementById(\"IFRM_PurposeCode\").src=\"/jsp/common/purposeCode/purposeCode2.jsp?SectionCode=\"+\"";
  private final static String _jspx_template12 = "\"+\"&PURPOSE_CD=";
  private final static String _jspx_template13 = "\"+\"&search_flag=\"+search_flag;\r\n\t\t\r\n\t\tif(document.jumyongForm.PURPOSE_CD.value.length<1){\r\n\t\t\tdocument.getElementById(\"IFRM_PurposeCode\").src=\"/jsp/common/purposeCode/purposeCode2.jsp?SectionCode=\"+document.getElementById(\"TYPE\").value+\"&PURPOSE_CD=000\"+\"&search_flag=1\";\r\n\t\t}else{\r\n\t\t\tdocument.getElementById(\"IFRM_PurposeCode\").src=\"/jsp/common/purposeCode/purposeCode2.jsp?SectionCode=\"+document.getElementById(\"TYPE\").value+\"&PURPOSE_CD=\"+document.jumyongForm.PURPOSE_CD.value;\t\r\n\t\t}\r\n\r\n\t\tvar obj = document.jumyongForm.message.value;\t\t\r\n\t\tif(obj != \"\")\t\r\n\t\t\talert(obj);\r\n\t\t\treturn;\r\n\t\t\t\r\n\t}\r\n\t\r\n\t\r\n\tfunction getDateType1(date1)\r\n\t{\r\n\t\tvar year= date1.getFullYear();\r\n\t    var mon = (date1.getMonth()+1)>9 ? ''+(date1.getMonth()+1) : '0'+(date1.getMonth()+1);\r\n\t    var day = date1.getDate()>9 ? ''+date1.getDate() : '0'+date1.getDate();\r\n\t\t\r\n\t\treturn (year+\"-\"+mon+\"-\"+day);\r\n\t}\r\n\t\r\n\t\r\n\t\r\n\tfunction add_date(i) // 매서드가 될 함수 구현\r\n\t{\r\n\t   var currentDate; // 계산된 날\r\n\t   currentDate = this.getDate() + i*1; // 현재 날짜에 더해(빼)줄 날짜를 계산\r\n\t   this.setDate(currentDate); // 계산된 날짜로 다시 세팅\r\n\t}\r\n\t\r\n\tfunction removeDash(num)\r\n\t{\t\r\n\t\treturn num.split('-').join(\"\");\r\n\t}\r\n\t\r\n\tfunction addDash(num)\r\n\t{\r\n\t\treturn (num.substr(0,4)+\"-\"+num.substr(4,2)+\"-\"+num.substr(6,2));\r\n\t}\r\n\t\r\n\tfunction setYear()\r\n\t{\r\n\t\tnow = new Date();\r\n\t\t//Y = now.getYear();\t//더이상지원안함\r\n\t\tY = now.getFullYear();\r\n\t\t\r\n\t\tvar strYear = document.getElementById(\"yearVal\").value;\r\n\r\n\t\tfor(var i = 0 ; i < 10 ; i++){\r\n\t\t\t  newItem = new Option(i);\r\n\t\t\t  document.getElementById(\"YEAR\").options[i]  = newItem;\r\n\t\t\t  document.getElementById(\"YEAR\").options[i].text = Y-i;\r\n\t\t\t  document.getElementById(\"YEAR\").options[i].value = Y-i;\r\n\t\t\t  if(strYear == Y-i) document.getElementById(\"YEAR\").options[i].selected = true;\r\n\t\t} \t\r\n\t}\r\n\t\r\n\t\r\n\tfunction addOption(startNum,endNum,idVal,selectedVal)\r\n\t{\r\n\t\tfor(var i = startNum ; i < endNum ; i++){\r\n\t\t\t  newItem = new Option(i);\r\n\t\t\t  document.getElementById(idVal).options[i]  = newItem;\r\n\t\t\t  document.getElementById(idVal).options[i].text = Y-i;\r\n\t\t\t  document.getElementById(idVal).options[i].value = Y-i;\r\n\t\t\t  if(i == 0) document.getElementById(\"YEAR\").options[i].selected = true;\r\n\t\t} \t\r\n\t\r\n\t}\r\n\t/*\r\n\t *\t통합검색 key down function (엔터키가 입력되면 검색함수 호출)\r\n\t */\r\n\tfunction checkKeySearch(){\r\n\t\tif(event.keyCode == \"13\")\r\n\t\t\tgoSearch();\r\n\t}\r\n\t\r\n\t// 점용 종류 선택시 점용 목적 코드 나오게 함.\r\n\tfunction\tSelect_UseType(sel)\r\n\t{\r\n\t\tdocument.getElementById(\"IFRM_PurposeCode\").src=\"/jsp/common/purposeCode/purposeCode2.jsp?SectionCode=\"+sel.value+\"&PURPOSE_CD=&search_flag=1\";\r\n\t}\r\n\t\r\n\t\r\n\tfunction goView(adminVal,year,purpose_cd)\r\n\t{\r\n\t\tvar type = document.getElementById(\"TYPE\").value;\r\n\t\tvar tax_set = document.getElementById(\"TAX_SET\").value;\r\n\t\tvar tax_yn = document.getElementById(\"TAX_YN\").value;\t\t\r\n\t\tvar mul_fromdate = document.getElementById(\"mul_fromdate\").value;\r\n\t\tvar mul_todate = document.getElementById(\"mul_todate\").value;\r\n\t\tvar iFrm = document.getElementById(\"IFRM_PurposeCode\");\r\n\t\tvar purpose_search = iFrm.contentWindow.document.getElementById(\"PURPOSE_CD\").value;\r\n\t\tvar bj_cd = document.getElementById(\"BJ_CD\").value;\r\n\t\tvar hj_cd = document.getElementById(\"HJ_CD\").value;\r\n\t\tvar jumyongName = document.getElementById(\"jumyongName\").value;\r\n\t\tvar cal_status = document.getElementById(\"cal_status\").value;\r\n\t\tvar section = document.getElementById(\"SECTION\").value;\r\n\t\t// 정기분 관리 주민번호/법인번호 조회 추가. 180612 by ksic\r\n\t\tvar juminNB = document.getElementById(\"juminNB\").value;\r\n\t\tvar corpNB = document.getElementById(\"corpNB\").value;\r\n\t\t\r\n\t\t// 정기분 관리 주민번호/법인번호 조회 추가. 180612 by ksic\r\n\t\tlocation.href=\"/jumyong/junggi/view.do?ADMIN_NO=\"+adminVal+\"&year=\"+year+\"&purpose_cd=\"+purpose_cd+\"&type=\"+type+\"&tax_set=\"+tax_set+\"&tax_yn=\"+tax_yn+\"&mul_fromdate=\"+mul_fromdate+\"&mul_todate=\"+mul_todate+\r\n\t\t\t\t\t\"&bj_cd=\"+bj_cd+\"&hj_cd=\"+hj_cd+\"&jumyongName=\"+jumyongName+\"&juminNB=\"+juminNB+\"&corpNB=\"+corpNB+\"&cal_status=\"+cal_status+\"&SECTION=\"+section+\"&search=1&purpose_search=\"+purpose_search;\r\n\r\n\t}\r\n\t\r\n\t// 부과년도 검색 셋팅\r\n\tfunction change_value(val)\r\n\t{\r\n\t\tif(val.value.length == 4)\r\n\t\t{\t\r\n\t\t\t\r\n\t\t\tdocument.jumyongFor";
  private final static String _jspx_template14 = "m.mul_fromdate.value = val.value + \"-01-01\";\r\n\t\t\tdocument.jumyongForm.mul_todate.value = val.value + \"-12-31\";\r\n\t\t\t\t\t\t\r\n\t\t}\t\r\n\t}\r\n\t\r\n\t\r\n\tfunction\tPage(page)\r\n\t{\r\n\t\tif(page\t==\t\"\")\r\n\t\t\treturn;\r\n\t\t\r\n\t\tvar form = document.jumyongForm;\r\n\t\t\r\n\t\tvar year = document.getElementById(\"YEAR\").value;\r\n\t\tvar type = document.getElementById(\"TYPE\").value;\r\n\t\tvar tax_set = document.getElementById(\"TAX_SET\").value;\r\n\t\tvar tax_yn = document.getElementById(\"TAX_YN\").value;\t\t\r\n\t\tvar mul_fromdate = document.getElementById(\"mul_fromdate\").value;\r\n\t\tvar mul_todate = document.getElementById(\"mul_todate\").value;\r\n\t\tvar iFrm = document.getElementById(\"IFRM_PurposeCode\");\r\n\t\tvar purpose = iFrm.contentWindow.document.getElementById(\"PURPOSE_CD\").value;\r\n\t\tvar bj_cd = document.getElementById(\"BJ_CD\").value;\r\n\t\tvar hj_cd = document.getElementById(\"HJ_CD\").value;\r\n\t\tvar jumyongName = document.getElementById(\"jumyongName\").value;\t\r\n\t\tvar cal_status = document.getElementById(\"cal_status\").value;\r\n\t\tvar section = document.getElementById(\"SECTION\").value;\r\n\t\tvar search = document.getElementById(\"search\").value;\r\n\t\t// 정기분 관리 주민번호/법인번호 조회 추가. 180612 by ksic\r\n\t\tvar juminNB = document.getElementById(\"juminNB\").value;\r\n\t\tvar corpNB = document.getElementById(\"corpNB\").value;\r\n\t\t\r\n\t\t//********** BEGIN_현진_20120326\r\n\t\tif(purpose == '000'){\r\n\t\t\tpurpose = \"\";\r\n\t\t}\r\n\t\t//********** END_현진_20120326\r\n\t\tform.currentPage.value\t= page;\r\n\t\t\r\n\t\t// 정기분 관리 주민번호/법인번호 조회 추가. 180612 by ksic\r\n\t\tlocation.href=\"search.do?currentPage=\"+page+\"&year=\"+year+\"&type=\"+type+\"&tax_set=\"+tax_set+\"&tax_yn=\"+tax_yn+\"&mul_fromdate=\"+mul_fromdate+\"&mul_todate=\"+mul_todate+\r\n\t\t\t\t\t\t\"&purpose_cd=\"+purpose+\"&bj_cd=\"+bj_cd+\"&hj_cd=\"+hj_cd+\"&jumyongName=\"+jumyongName+\"&juminNB=\"+juminNB+\"&corpNB=\"+corpNB+\"&cal_status=\"+cal_status+\"&SECTION=\"+section+\"&search=\"+search;\r\n\t}\r\n\t\r\n\r\n\t// 엑셀변환\r\n\tfunction\texcel_Search()\r\n\t{\r\n\t\tvar form = document.jumyongForm;\r\n\r\n\t\t\r\n\t\tvar year = document.getElementById(\"YEAR\").value;\r\n\t\tvar type = document.getElementById(\"TYPE\").value;\r\n\t\tvar tax_set = document.getElementById(\"TAX_SET\").value;\r\n\t\tvar tax_yn = document.getElementById(\"TAX_YN\").value;\t\t\r\n\t\tvar mul_fromdate = document.getElementById(\"mul_fromdate\").value;\r\n\t\tvar mul_todate = document.getElementById(\"mul_todate\").value;\r\n\t\tvar bj_cd = document.getElementById(\"BJ_CD\").value;\r\n\t\tvar hj_cd = document.getElementById(\"HJ_CD\").value;\r\n\t\tvar jumyongName = document.getElementById(\"jumyongName\").value;\r\n\t\tvar cal_status = document.getElementById(\"cal_status\").value;\r\n\t\tvar section = document.getElementById(\"SECTION\").value;\r\n\t\t// 정기분 관리 주민번호/법인번호 조회 추가. 180612 by ksic\r\n\t\tvar juminNB = document.getElementById(\"juminNB\").value;\r\n\t\tvar corpNB = document.getElementById(\"corpNB\").value;\r\n\r\n\t\tif( year == ''){\r\n\t\t\talert(\"산출년도를 입력하세요. \");\r\n\t\t\tdocument.getElementById(\"YEAR\").focus();\r\n\t\t\treturn;\r\n\t\t}\r\n\t\tif( mul_fromdate == ''){\r\n\t\t\talert(\"사용부과기간을 입력하세요. \");\r\n\t\t\tdocument.getElementById(\"mul_fromdate\").focus();\r\n\t\t\treturn;\r\n\t\t}\r\n\t\tif( mul_todate == ''){\r\n\t\t\talert(\"사용부과기간을 입력하세요. \");\r\n\t\t\tdocument.getElementById(\"mul_todate\").focus();\r\n\t\t\treturn;\r\n\t\t}\r\n\t\tif( section == ''){\r\n\t\t\talert(\"점용구분을 선택하세요. \");\r\n\t\t\tdocument.getElementById(\"SECTION\").focus();\r\n\t\t\treturn;\r\n\t\t}\r\n\t\t\r\n\t\tvar iFrm = document.getElementById(\"IFRM_PurposeCode\");\r\n\t\tvar purpose = iFrm.contentWindow.document.getElementById(\"PURPOSE_CD\").value;\r\n\t\tvar purpose1 = iFrm.contentWindow.document.getElementById(\"PURPOSE1\");\r\n\r\n\t\tif(purpose1[purpose1.selectedIndex].text == \"::선택::\")\r\n\t\t\tpurpose=\"\";\r\n\r\n\t\tif(type.length==0)\t\t//점용종류가 선택이 안되면 점용목적은 선택되지 않도록 purpose값을 지정 \r\n\t\t\tpurpose=\"\";\r\n\t\t\r\n\t\t// 정기분 관리 주민번호/법인번호 조회 추가. 180612 by ksic\r\n\t\tlocation.href= \"/jumyong/junggi/excel_search.do?currentPage=1&year=\"+year+\"&type=\"+type+\"&tax_set=\"+tax_set+\"&tax_yn=\"+tax_yn+\"&mul_fromdate=\"+mul_fromdate+\"&mul_todate=\"+mul_todate+\r\n\t\t\"&purpose_cd=\"+purpose+\"&bj_cd=\"+bj_cd+\"&hj_cd=\"+hj_cd+\"&jumyongName=\"+jumyongName+\"&juminNB=\"+juminNB+\"&corpNB=\"+corpNB+\"&cal_status=\"+cal_status+\"&SECTION=\"+section+\"&search=1\";\r\n\t}\r\n\r\n\t// 일괄 부과하기\r\n\tfunction SaeweSuipBugwa_Ilgwal()\r\n\t{\r\n\t\tvar form = document.jumyongFor";
  private final static String _jspx_template15 = "m;\r\n\t\tvar year = document.getElementById(\"YEAR\").value;\r\n\t\tvar type = document.getElementById(\"TYPE\").value;\r\n\t\tvar section = document.getElementById(\"SECTION\").value;\r\n\r\n\t\tif( section == '' ){\r\n\t\t\talert(\"점용구분을 선택하세요. \");\r\n\t\t\tdocument.getElementById(\"SECTION\").focus();\r\n\t\t\treturn;\r\n\t\t}\r\n\t\t\r\n\t\tif(form.TOTALCNT.value <= 0){\r\n\t\t\talert(\"일괄처리할 데이터가 없습니다. \");\r\n\t\t\treturn;\r\n\t\t}\r\n\t\t\r\n\r\n\t\t\r\n\t\tif(document.getElementById(\"bugwaFlag\").value == '1'){\r\n\t\t\tif(!confirm(\"일괄부과 하시기 전에 정확하게 산출 및 입력되었는지 확인하셔야 합니다. \\n\\n 해당 건들에 대하여 일괄부과 하시겠습니까?\"))\r\n\t\t\t\treturn;\r\n\t\t\t\r\n\t\t\tdocument.getElementById(\"bugwaFlag\").value = '0';\r\n\t\t\tform.action = \"/jumyong/saewe/saeweSuipBugwa_ilgwal_junggi.do?year=\"+year;\r\n\t\t\tform.submit();\r\n\t\t}else{\r\n\t\t\talert(\"일괄부과 처리가 끝날때 까지 기다리세요\");\r\n\t\t\treturn;\r\n\t\t}\r\n\t}\r\n\t\r\n\t// 일괄 산출\r\n\tfunction goAllCal(){\r\n\r\n\t\tvar f = document.jumyongForm;\r\n\t\tvar year = document.getElementById(\"YEAR\").value;\r\n\t\tvar section = document.getElementById(\"SECTION\").value;\r\n\r\n\t\tif( section == '' ){\r\n\t\t\talert(\"점용구분을 선택하세요. \");\r\n\t\t\tdocument.getElementById(\"SECTION\").focus();\r\n\t\t\treturn;\r\n\t\t}\r\n\t\t\r\n\t\tif(f.TOTALCNT.value <= 0){\r\n\t\t\talert(\"처리할 데이터가 없습니다. \");\r\n\t\t\treturn;\r\n\t\t}\r\n\t\t\r\n\t\tif(!confirm(\"일괄산출은 세외수입에 부과된 건들에 대해서만 산출이 됩니다. \\n 일괄산출 하시겠습니까?\"))\r\n\t\t\treturn;\r\n\r\n\t\tdocument.getElementById(\"TAX_YN\").value = \"1\";\r\n\t\t\r\n\t\tf.action = \"/jumyong/junggi/junggiAllCal.do?year=\"+year;\r\n\t\tf.submit();\r\n\t}\r\n\t\r\n</script>\r\n\r\n\r\n\r\n</head>\r\n\r\n<body onload=\"javascript:InitPage();\">\r\n\r\n<form id=\"jumyongForm\" name=\"jumyongForm\">\r\n\r\n<input type=\"hidden\" id=\"search\" name=\"search\" value=\"";
  private final static String _jspx_template16 = "\">\r\n<input id=\"toDateValue\" name=\"toDateValue\" value=\"";
  private final static String _jspx_template17 = "\" type=\"hidden\">\r\n<input id=\"fromDateValue\" name=\"fromDateValue\" value=\"";
  private final static String _jspx_template18 = "\" type=\"hidden\">\r\n<input id=\"jumyongNameValue\" name=\"jumyongNameValue\" value=\"";
  private final static String _jspx_template19 = "\" type=\"hidden\">\r\n\r\n<input id=\"juminNumberValue\" name=\"juminNumberValue\" value=\"";
  private final static String _jspx_template20 = "\" type=\"hidden\">\r\n<input id=\"corpNumberValue\" name=\"corpNumberValue\" value=\"";
  private final static String _jspx_template21 = "\" type=\"hidden\">\r\n\r\n<input id=\"numberValueValue\" name=\"numberValueValue\" value=\"";
  private final static String _jspx_template22 = "\" type=\"hidden\">\r\n<input id=\"yearVal\" name=\"yearVal\" value=\"";
  private final static String _jspx_template23 = "\" type=\"hidden\">\r\n<input id=\"currentPage\" name=\"currentPage\" type=\"hidden\" value=\"";
  private final static String _jspx_template24 = "\">\r\n<input id=\"PURPOSE_CD\" name=\"PURPOSE_CD\" type=\"hidden\" value=\"";
  private final static String _jspx_template25 = "\">\r\n<input id=\"search_flag\" name=\"search_flag\" type=\"hidden\" value=\"";
  private final static String _jspx_template26 = "\">\r\n<input id=\"TOTALCNT\" name=\"TOTALCNT\" type=\"hidden\" value=\"";
  private final static String _jspx_template27 = "\">\r\n<input id=\"gubun\" name=\"gubun\" type=\"hidden\" value=\"junggi\">\r\n<input id=\"message\" name=\"message\" type=\"hidden\" value=\"";
  // jsp code [from=(468,22);to=(475,7)]
  private final static String _jspx_template28 = "\">\r\n<input id=\"bugwaFlag\" name=\"bugwaFlag\" type=\"hidden\" value=\"1\">\r\n\r\n<table width=\"800\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n  <tr>\r\n    <td height=\"43\"><img src=\"/img/jumyong_junggi_title.gif\" width=\"800\" height=\"43\"></td>\r\n  </tr>\r\n  <tr>\r\n    <td ><table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n      <tr>\r\n        <td height=\"1\" bgcolor=\"eaeaea\"></td>\r\n      </tr>\r\n      <tr>\r\n        <td height=\"14\"></td>\r\n      </tr>     \r\n      <tr>\r\n        <td><table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n          <tr>\r\n            <td align=\"left\" height=\"22\" background=\"/img/tab_line_blue.gif\">\r\n            <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                <tr >\r\n                  <td ><img src=\"/img/sub_periodi_title1.gif\" width=\"110\" height=\"22\"></td>\r\n                </tr>\r\n            </table></td>\r\n          </tr>\r\n\t\t<tr>\r\n            <td  class=\"contborder_purple\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n              <tr>\r\n                <td><table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n                \t";
  private final static String _jspx_template29 = "\r\n                    <tr>\r\n                      <td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" >산출년도</td>\r\n                      <td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t                      <input type=\"text\" id=\"YEAR\" name=\"YEAR\" class=\"essential\" style=\"width:50px\" maxlength=\"4\" value=\"";
  private final static String _jspx_template30 = "\" onKeyUp=\"change_value(this)\"> 년\r\n\t\t\t\t\t  </td>\r\n                      <td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">공시지가</td>                      \r\n\t\t\t\t\t  <td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t<select id=\"GONGSIJIGA\" name=\"GONGSIJIGA\" class=\"input_form1\" style=\"width:130px\" >\r\n\t\t\t\t\t\t\t<option value=\"1\">::기본::</option>\r\n\t\t\t\t\t\t\t<option value=\"2\">최신</option>\t\t\t\t\t\t\t\r\n\t\t\t\t\t    </select>\r\n\t\t\t\t\t  </td>\r\n\t\t\t\t\t </tr>\r\n\t\t\t\t\t <tr>\r\n\t\t\t\t\t  <td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용구분</td>                      \r\n\t\t\t\t\t  <td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t<select id=\"SECTION\" name=\"SECTION\" class=\"essential\" style=\"width:130px\" >\r\n\t\t\t\t\t\t\t<option value=\"\">::전체::</option>\r\n\t\t\t\t\t\t\t<option value=\"1\">계속</option>\r\n\t\t\t\t\t\t\t<option value=\"3\">무단</option>\t\t\t\t\t\t\t\r\n\t\t\t\t\t    </select>\r\n\t\t\t\t\t  </td>\r\n                      <td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">지목</td>                      \r\n\t\t\t\t\t  <td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t<select id=\"TYPE\" name=\"TYPE\" class=\"input_form1\" style=\"width:130px\" OnChange=\"Select_UseType(this);\">\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template31 = "\r\n\t\t\t\t\t    </select>\r\n\t\t\t\t\t  </td>\r\n                    </tr>\r\n\t\t\t\t\t\r\n                    <tr>\r\n                      <td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">세입구분</td>\r\n\t\t\t\t\t  <td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t<select id=\"TAX_SET\" name=\"TAX_SET\" class=\"input_form1\" style=\"width:130px\">\r\n\t\t\t\t\t  \t\t";
  private final static String _jspx_template32 = "\r\n\t\t\t\t\t  \t</select>\r\n\t\t\t\t\t  </td>\r\n\t\t\t\t\t  <td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">부과여부 </td>\r\n\t\t\t\t\t  <td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t<select id=\"TAX_YN\" name=\"TAX_YN\" class=\"input_form1\" style=\"width:130px\">\r\n                        \t";
  private final static String _jspx_template33 = "\r\n                     \t</select>\r\n               \t      </td>\r\n                    </tr>\r\n                    \r\n                     <tr>\r\n                      <td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">산출기간</td>\r\n\t\t\t\t\t  <td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t\t\t  \t<input id=\"mul_fromdate\" name=\"mul_fromdate\" type=\"text\" class=\"input_form1\" style=\"width:70px\" value=\"";
  private final static String _jspx_template34 = "\">\r\n\t\t\t\t\t  \t<img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" align=\"absmiddle\" onclick=\"popUpCalendar(this, document.getElementById('mul_fromdate'), 'yyyymmdd')\" style=\"CURSOR: pointer ;\">\r\n\t\t\t\t\t  \t&nbsp;~&nbsp;<input id=\"mul_todate\" name=\"mul_todate\" type=\"text\" class=\"input_form1\" style=\"width:70px\" value=\"";
  private final static String _jspx_template35 = "\">\r\n\t\t\t\t\t  \t<img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" align=\"absmiddle\" onclick=\"popUpCalendar(this, document.getElementById('mul_todate'), 'yyyymmdd')\" style=\"CURSOR: pointer;\">\r\n\t\t\t\t\t  </td>\r\n                    </tr>\r\n                    <input type=\"hidden\" id=\"cal_status\" name=\"cal_status\" value=\"\">\r\n\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용목적</td>\r\n\t\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t<tr><td>\r\n\t\t\t\t\t\t\t\t<iframe id=\"IFRM_PurposeCode\" align=\"absmiddle\" scrolling=\"no\" frameborder=\"0\" framespacing=\"0\" width=\"100%\" height=\"25\"></iframe>\r\n\t\t\t\t\t\t\t</td></tr>\r\n\t\t\t\t\t  \t</table>\r\n\t\t\t\t\t</td>\r\n                </tr>\r\n                <tr>\r\n\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">법정동/행정동</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t<select id=\"BJ_CD\" name=\"BJ_CD\" class=\"input_form1\" style=\"width:130px\">";
  private final static String _jspx_template36 = "</select>\r\n\t\t\t\t\t\t<select id=\"HJ_CD\" name=\"HJ_CD\" class=\"essential\" style=\"width:130px\">";
  private final static String _jspx_template37 = "</select>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용인/법인명</td>\r\n                    <td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n                        \t<tr>\r\n                          \t\t<td><input id=\"jumyongName\" name=\"jumyongName\" type=\"text\" class=\"input_form1\" style=\"width:130px\" onKeyDown=\"javascript:checkKeySearch();\" value=\"";
  // jsp code [from=(558,5);to=(558,44)]
  private final static String _jspx_template38 = "\"></td>\r\n                        \t</tr>\r\n                      \t</table>\r\n                   \t</td>\r\n                </tr>\r\n                \r\n";
  private final static String _jspx_template39 = "\r\n                <tr>\t\t\t\t\t\r\n\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">주민번호</td>\r\n                    <td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n                        \t<tr>\r\n                          \t\t<td><input id=\"juminNB\" name=\"juminNB\" type=\"text\" class=\"input_form1\" style=\"width:130px\" onKeyDown=\"javascript:checkKeySearch();\" value=\"";
  private final static String _jspx_template40 = "\"></td>\r\n                        \t</tr>\r\n                      \t</table>\r\n                   \t</td>\r\n\t\t\t\t\t\r\n\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">법인번호</td>\r\n                    <td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n                        \t<tr>\r\n                          \t\t<td><input id=\"corpNB\" name=\"corpNB\" type=\"text\" class=\"input_form1\" style=\"width:130px\" onKeyDown=\"javascript:checkKeySearch();\" value=\"";
  private final static String _jspx_template41 = "\"></td>\r\n                        \t</tr>\r\n                      \t</table>\r\n                   \t</td>\r\n                </tr>\r\n                \r\n                </table></td>\r\n              </tr>\r\n \r\n                <tr>\r\n                  <td height=\"32\" align=\"right\"><img src=\"/img/inquiry_icon2.gif\" alt=\"조회\" width=\"56\" height=\"18\" border=\"0\" onclick=\"javascript:goSearch();\" style=\"cursor:pointer\" >\r\n                  </td>\r\n                </tr>\r\n                <tr>\r\n                  <td height=\"1\" bgcolor=\"#EAEAEA\"></td>\r\n                </tr>\r\n                <tr>\r\n                  <td height=\"34\" class=\"sub_stan\">전체건수 : <span class=\"sub_stan_blue\">";
  // jsp code [from=(604,5);to=(604,44)]
  private final static String _jspx_template42 = "</span>건 \r\n                  \t<div style=\"float: right;\"><a href=\"/bbs/bbs_jumyong.jsp\">정기분매뉴얼 다운받으러 가기</a></div>\r\n                  </td>\r\n                </tr>\r\n                <tr>\r\n                  <td>\r\n\t\t\t\t<div style=\" width:780px;padding:10px;overflow-x:auto; scrollbar-face-color:#EEF8FB;  scrollbar-3dlight-color:#BBBDB6;scrollbar-highlight-color:#EEF8FB;scrollbar-shadow-color:#BBBDB6; scrollbar-darkshadow-color:#EEF8FB;  scrollbar-track-color:#EEF8FB; scrollbar-arrow-color:#BBBDB6;\"> \r\n\t\t\t\t<table width=\"2500px\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t    \t<tr>\r\n                        <td height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">관리번호</td>\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">과세<br/>번호</td>\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">부과<br/>여부</td>\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">산출<br/>여부</td>\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용인/법인명</td>\r\n";
  private final static String _jspx_template43 = "                        \r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">주민번호/<br/>법인번호</td>\r\n                        \r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용인<br/>우편번호</td>\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용인 주소</td>\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용인 새 주소</td>\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">과세<br/>구분</td>\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용<br/>구분</td>\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용<br/>종류</td>\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">세입<br/>구분</td>\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용지<br/>소유</td>\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용지</td>\r\n                        <!-- sungh83 20131115 -->\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">도로주소</td>\r\n                        <!-- sungh83 20131115 -->\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용<br/>면적</td>\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용목적</td>\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조정산출식</td>\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조정<br/>점용료</td>\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">부가가치세</td>\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">감면/지분율</td>\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">감면/지분 사유</td>\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">세목코드</td>\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">산출<br/>시작일</td>\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">산출<br/>끝일</td>\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">요율<br/>(단가)</td>\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">공시지가</td>\r\n\t\t\t\t\t</tr>\r\n                    \r\n                    ";
  private final static String _jspx_template44 = "\r\n\t\t\t\t\t";
  private final static String _jspx_template45 = "  \r\n                   \t";
  private final static String _jspx_template46 = "\r\n                    <tr onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\" style=\"cursor:pointer\"\r\n                    onclick=\"javascript:goView('";
  private final static String _jspx_template47 = "','";
  private final static String _jspx_template48 = "','";
  private final static String _jspx_template49 = "');\">\r\n\r\n                        <td width=\"80px\" height=\"26\" align=\"center\">";
  private final static String _jspx_template50 = "</td>\r\n                        <td width=\"50px\" align=\"center\">";
  private final static String _jspx_template51 = "</td>\r\n                        <td align=\"center\"><font color=\"red\">";
  private final static String _jspx_template52 = "</font></td>\r\n                        <td align=\"center\"><font color=\"red\">";
  private final static String _jspx_template53 = "</font></td>\r\n                        <td width=\"100px\" align=\"center\">";
  // jsp code [from=(644,5);to=(644,44)]
  private final static String _jspx_template54 = "</td>\r\n";
  private final static String _jspx_template55 = "                        \r\n                        <td width=\"80px\" height=\"26\" align=\"center\">";
  private final static String _jspx_template56 = "</td>\r\n                        \r\n                        <td align=\"center\">";
  private final static String _jspx_template57 = "</td>\r\n                        <td align=\"center\">";
  private final static String _jspx_template58 = "</td>\r\n                        <td align=\"center\">";
  private final static String _jspx_template59 = " ";
  private final static String _jspx_template60 = " ";
  private final static String _jspx_template61 = " ";
  private final static String _jspx_template62 = " ";
  private final static String _jspx_template63 = " ";
  private final static String _jspx_template64 = " ";
  private final static String _jspx_template65 = "</td>\r\n                        <td align=\"center\">";
  private final static String _jspx_template66 = "</td>\r\n                        <td align=\"center\">";
  private final static String _jspx_template67 = "</td>\r\n                        <td align=\"center\">";
  private final static String _jspx_template68 = "</td>\r\n                        <td align=\"center\">";
  private final static String _jspx_template69 = "</td>\r\n                        <td align=\"center\">";
  private final static String _jspx_template70 = "</td>\r\n                        <td align=\"center\">";
  private final static String _jspx_template71 = " ";
  private final static String _jspx_template72 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<!-- sungh83 20131115-->\r\n                        <td align=\"center\">";
  private final static String _jspx_template73 = "</td>\r\n                        <!-- sungh83 20131115 -->\r\n\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template74 = "</td>\r\n\t\t\t\t\t\t<td align=\"center\" width=\"350\">";
  private final static String _jspx_template75 = "</td>\r\n\t\t\t\t\t\t<td align=\"center\" width=\"350\">";
  private final static String _jspx_template76 = "</td>\r\n\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template77 = "</td>\r\n\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template78 = "</td>\r\n\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template79 = "</td>\r\n\t\t\t\t\t\t<td align=\"center\" width=\"200\">";
  private final static String _jspx_template80 = "</td>\r\n\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template81 = "</td>\r\n\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template82 = "</td>\r\n\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template83 = "</td>\r\n\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template84 = "</td>\r\n\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template85 = "</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t";
  private final static String _jspx_template86 = "\r\n\t\t\t\t\t";
  private final static String _jspx_template87 = "\r\n\t\t\t\t\t";
  private final static String _jspx_template88 = "\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td align=\"center\" class=\"sub_table\" colspan=\"20\" height=\"85\"> 내용이 없습니다</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t";
  private final static String _jspx_template89 = "\r\n\t\t\t\t\t";
  private final static String _jspx_template90 = "\r\n\t\t\t\t\t \r\n\t\t\t\t</table>\r\n\t\t\t\t</br>\r\n\t\t\t\t</div></td>\r\n                </tr>\r\n                \r\n                <tr>\r\n\t                <td height=\"40\" align=\"center\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t                    <tr>\r\n\t                    \t<td align=\"center\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t                        \t<tr>\r\n\t                       \t\t\t";
  private final static String _jspx_template91 = "\r\n\t                        \t</tr>\r\n\t                      \t</table></td>\r\n\t                    </tr>\r\n\t                  </table></td>\r\n\t              </tr>\r\n\t              \r\n\t              <tr>              \r\n\t\t          \t<td height=\"40\" align=\"right\">\r\n\t\t\t        \t<table border=\"0\" width=\"100%\">\r\n\t\t\t            \t<tr>\r\n\t\t\t                \t<td  align=\"right\">\r\n\t\t\t                \t\t<img onclick=\"javascript:goAllCal()\" src=\"/img/ilgal_sanchul_icon.gif\" alt=\"일괄 산출\" border=\"0\" style=\"cursor:hand;\">\r\n\t\t\t                \t\t\r\n\t\t\t\t                \t<img src=\"/img/excel_icon.gif\" alt=\"EXCEL 변환\" border=\"0\" onclick=\"javascript:excel_Search();\" style=\"cursor:hand\">\r\n\t\t\t\t\t\t\t        ";
  private final static String _jspx_template92 = " \r\n\t\t\t\t\t\t\t        <img src=\"/img/levy_icon3.gif\" alt=\"일괄 부과처리\" border=\"0\" onclick=\"javascript:SaeweSuipBugwa_Ilgwal();\" style=\"cursor:hand\">\r\n\t\t\t\t\t\t\t        ";
  private final static String _jspx_template93 = "\r\n\t\t\t\t\t            </td>\r\n\t\t\t\t             </tr>\r\n\t\t\t\t                \r\n\t\t\t\t                \r\n\t\t\t\t     \t</table>\r\n\t\t\t\t\t</td>\r\n\t              </tr>\r\n               \r\n            </table></td>\r\n          </tr>\r\n          \r\n        </table></td>\r\n      </tr>\r\n      <tr>\r\n        <td height=\"30\"></td>\r\n      </tr>\r\n</table>\r\n</td></tr></table>\r\n</form>\r\n</body>\r\n<script language=\"javascript\">\r\n\r\n\t//select의 option을 선택된 값으로 지정\r\n\tfunction setSelectedOption(obj, val){\r\n\t\tfor(i = 0 ; i < obj.options.length ; i++){\r\n\t\t\tif(obj.options[i].value == val){\r\n\t\t\t\tobj.options[i].selected = true;\r\n\t\t\t\treturn;\r\n\t\t\t}\r\n\t\t}\r\n\t}\r\n\tsetSelectedOption(document.jumyongForm.SECTION, '";
  private final static String _jspx_template94 = "');\r\n\t// 공시지가 산출년도 or 최신년도 구분. 2012-11-28. by ksic gongsijiga\r\n\tsetSelectedOption(document.jumyongForm.GONGSIJIGA, '";
  private final static String _jspx_template95 = "');\r\n</script>\r\n</html>\r\n\r\n";
}
