package jeus_jspwork._jsp._jumyong._jumyong;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_info_5fproduct_5finstance_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(27,36);to=(27,45)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${gongyu_yn}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(30,73);to=(30,75)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${no}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(33,38);to=(33,50)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(34,38);to=(34,54)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.CHECK_YN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(71,39);to=(71,51)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.FORM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(76,73);to=(76,75)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${no}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(78,38);to=(78,50)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(114,36);to=(114,45)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${gongyu_yn}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(117,38);to=(117,54)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.CHECK_YN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(161,38);to=(161,54)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.CHECK_YN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      out.write(_jspx_template20);
      out.write(_jspx_template21);
      out.write(_jspx_template22);
      // jsp code [from=(549,31);to=(549,43)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(554,66);to=(554,68)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${no}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // jsp code [from=(554,84);to=(554,95)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);
      // jsp code [from=(554,112);to=(554,124)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${countPerPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template26);
      // jsp code [from=(554,137);to=(554,153)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.CHECK_YN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // jsp code [from=(555,73);to=(555,80)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template28);
      // jsp code [from=(567,31);to=(567,43)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template29);
      // jsp code [from=(571,65);to=(571,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${no}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template30);
      // jsp code [from=(571,83);to=(571,94)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template31);
      // jsp code [from=(571,111);to=(571,123)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${countPerPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template32);
      // jsp code [from=(571,136);to=(571,152)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.CHECK_YN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template33);
      // jsp code [from=(572,70);to=(572,77)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template34);
      // jsp code [from=(579,34);to=(579,50)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.CHECK_YN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template35);
      out.write(_jspx_template36);
      // jsp code [from=(728,49);to=(728,51)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${no}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template37);
      // jsp code [from=(729,37);to=(729,39)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${no}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template38);
      // jsp code [from=(730,41);to=(730,45)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mode}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template39);
      // jsp code [from=(731,39);to=(731,42)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${seq}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template40);
      // jsp code [from=(732,45);to=(732,51)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${CK_DEL}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template41);
      // jsp code [from=(734,41);to=(734,45)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${type}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template42);
      // ----  c:choose ---- invoke //
      if (_jspx_th_c_choose_0_fn(pageContext, null)) return;


      out.write(_jspx_template166);
      // jsp code [from=(1262,166);to=(1262,168)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${no}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template167);
      // jsp code [from=(1262,176);to=(1262,180)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${seq }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template168);
      // jsp code [from=(1262,192);to=(1262,199)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template169);
      // jsp code [from=(1270,163);to=(1270,165)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${no}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template170);
      // jsp code [from=(1270,173);to=(1270,177)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${seq }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template171);
      // jsp code [from=(1270,189);to=(1270,196)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template172);

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
          out.write(_jspx_template43);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template108);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_1_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template165);

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
    _jspx_th_c_when_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${gongyu_yn == '0'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
      if (_jspx_eval_c_when_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template44);
          // ----  c:forEach ---- invoke //
          if (_jspx_th_c_forEach_0_fn(pageContext, _jspx_th_c_when_0)) return true;


          out.write(_jspx_template70);
          // jsp code [from=(788,21);to=(788,38)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${strPageDivideForm}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template71);
          // jsp code [from=(809,17);to=(809,29)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template72);
          // jsp code [from=(813,18);to=(813,50)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.PRICE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

          out.write(_jspx_template73);
          // jsp code [from=(820,17);to=(820,35)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.AREA_AFTER}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template74);
          // jsp code [from=(823,17);to=(823,29)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template75);
          // jsp code [from=(829,71);to=(829,85)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.PERIOD}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template76);
          // jsp code [from=(834,17);to=(834,36)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.FORM_ADJUST}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template77);
          // jsp code [from=(837,17);to=(837,54)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.SUM_ADJUST)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

          out.write(_jspx_template78);
          // jsp code [from=(843,17);to=(843,39)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.PERCENT_REASON}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template79);
          // jsp code [from=(847,17);to=(847,37)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.PERCENT_RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template80);
          // jsp code [from=(853,17);to=(853,41)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.REDUCTION_REASON}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template81);
          // jsp code [from=(857,17);to=(857,39)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.REDUCTION_RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template82);
          // jsp code [from=(863,17);to=(863,39)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.REDUCTION_FORM}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template83);
          // jsp code [from=(866,17);to=(866,57)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.REDUCTION_SUM)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

          out.write(_jspx_template84);
          // ----  c:if ---- invoke //
          if (_jspx_th_c_if_0_fn(pageContext, _jspx_th_c_when_0)) return true;


          out.write(_jspx_template90);
          // jsp code [from=(899,65);to=(899,77)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template91);
          // jsp code [from=(908,59);to=(908,72)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.PRICE}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template92);
          // jsp code [from=(921,136);to=(921,154)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.AREA_AFTER}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template93);
          // jsp code [from=(925,126);to=(925,138)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template94);
          // jsp code [from=(933,128);to=(933,142)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.PERIOD}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template95);
          // jsp code [from=(950,67);to=(950,79)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.FORM}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template96);
          // jsp code [from=(951,75);to=(951,110)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.SUM_YEAR)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

          out.write(_jspx_template97);
          // jsp code [from=(952,120);to=(952,139)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.FORM_ADJUST}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template98);
          // jsp code [from=(957,138);to=(957,175)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.SUM_ADJUST)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

          out.write(_jspx_template99);
          // jsp code [from=(963,124);to=(963,146)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.PERCENT_REASON}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template100);
          // jsp code [from=(968,138);to=(968,158)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.PERCENT_RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template101);
          // jsp code [from=(974,128);to=(974,152)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.REDUCTION_REASON}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template102);
          // jsp code [from=(979,142);to=(979,164)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.REDUCTION_RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template103);
          // jsp code [from=(986,126);to=(986,148)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.REDUCTION_FORM}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template104);
          // jsp code [from=(991,24);to=(991,64)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.REDUCTION_SUM)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

          out.write(_jspx_template105);
          // ----  c:if ---- invoke //
          if (_jspx_th_c_if_3_fn(pageContext, _jspx_th_c_when_0)) return true;


          out.write(_jspx_template107);

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
          out.write(_jspx_template109);
          // ----  c:forEach ---- invoke //
          if (_jspx_th_c_forEach_1_fn(pageContext, _jspx_th_c_otherwise_1)) return true;


          out.write(_jspx_template127);
          // jsp code [from=(1051,18);to=(1051,35)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${strPageDivideForm}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template128);
          // jsp code [from=(1071,59);to=(1071,77)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.AREA_AFTER}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template129);
          // jsp code [from=(1076,23);to=(1076,37)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.PERIOD}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template130);
          // jsp code [from=(1083,71);to=(1083,109)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.LICENSE_TAX)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

          out.write(_jspx_template131);
          // jsp code [from=(1089,59);to=(1089,78)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.FORM_ADJUST}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template132);
          // jsp code [from=(1093,59);to=(1093,96)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.SUM_ADJUST)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

          out.write(_jspx_template133);
          // jsp code [from=(1099,17);to=(1099,39)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.PERCENT_REASON}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template134);
          // jsp code [from=(1102,17);to=(1102,37)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.PERCENT_RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template135);
          // jsp code [from=(1108,17);to=(1108,41)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.REDUCTION_REASON}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template136);
          // jsp code [from=(1111,17);to=(1111,39)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.REDUCTION_RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template137);
          // jsp code [from=(1118,17);to=(1118,39)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.REDUCTION_FORM}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template138);
          // jsp code [from=(1122,17);to=(1122,57)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.REDUCTION_SUM)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

          out.write(_jspx_template139);
          // ----  c:if ---- invoke //
          if (_jspx_th_c_if_4_fn(pageContext, _jspx_th_c_otherwise_1)) return true;


          out.write(_jspx_template147);
          // jsp code [from=(1150,70);to=(1150,82)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mul_Fromdate}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template148);
          // jsp code [from=(1151,66);to=(1151,76)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mul_Todate}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template149);
          // jsp code [from=(1160,115);to=(1160,133)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.AREA_AFTER}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template150);
          // jsp code [from=(1168,110);to=(1168,124)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.PERIOD}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template151);
          // jsp code [from=(1191,99);to=(1191,118)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.LICENSE_TAX}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template152);
          // jsp code [from=(1195,122);to=(1195,142)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.SUM_LASTYEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template153);
          // jsp code [from=(1196,114);to=(1196,130)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.SUM_YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template154);
          // jsp code [from=(1197,106);to=(1197,118)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.FORM}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template155);
          // jsp code [from=(1198,118);to=(1198,136)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.ADJUSTMENT}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template156);
          // jsp code [from=(1202,120);to=(1202,139)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.FORM_ADJUST}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template157);
          // jsp code [from=(1206,138);to=(1206,156)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.SUM_ADJUST}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template158);
          // jsp code [from=(1213,124);to=(1213,146)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.PERCENT_REASON}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template159);
          // jsp code [from=(1217,138);to=(1217,158)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.PERCENT_RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template160);
          // jsp code [from=(1223,128);to=(1223,152)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.REDUCTION_REASON}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template161);
          // jsp code [from=(1227,142);to=(1227,164)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.REDUCTION_RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template162);
          // jsp code [from=(1234,126);to=(1234,148)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.REDUCTION_FORM}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template163);
          // jsp code [from=(1238,144);to=(1238,184)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.REDUCTION_SUM)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

          out.write(_jspx_template164);

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
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${productList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("board");
    _jspx_th_c_forEach_0.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template45);
            // jsp code [from=(759,148);to=(759,158)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template46);
            // jsp code [from=(759,173);to=(759,175)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${no}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template47);
            // jsp code [from=(759,181);to=(759,190)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template48);
            // jsp code [from=(759,240);to=(759,242)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${no}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template49);
            // jsp code [from=(759,251);to=(759,261)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template50);
            // jsp code [from=(759,277);to=(759,288)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template51);
            // jsp code [from=(759,305);to=(759,317)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${countPerPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template52);
            // jsp code [from=(759,326);to=(759,336)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template53);
            // jsp code [from=(759,344);to=(759,353)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template54);
            // jsp code [from=(759,365);to=(759,372)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${section}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template55);
            // jsp code [from=(760,47);to=(760,56)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${idx.count}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template56);
            // jsp code [from=(761,35);to=(761,45)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template57);
            // ----  c:choose ---- invoke //
            if (_jspx_th_c_choose_1_fn(pageContext, _jspx_th_c_forEach_0)) return true;


            out.write(_jspx_template64);
            // jsp code [from=(771,35);to=(771,51)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.AREA_AFTER}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template65);
            // jsp code [from=(772,35);to=(772,45)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template66);
            // jsp code [from=(773,35);to=(773,47)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PERIOD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template67);
            // jsp code [from=(774,35);to=(774,70)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(board.SUM_ADJUST)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template68);
            // jsp code [from=(775,35);to=(775,63)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(board.SUM)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template69);

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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${section != '4'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template85);
          // ----  c:if ---- invoke //
          if (_jspx_th_c_if_1_fn(pageContext, _jspx_th_c_if_0)) return true;


          out.write(_jspx_template89);

        } while (_jspx_th_c_if_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_0.release();
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
    _jspx_th_c_if_3.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${section != '4'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
      if (_jspx_eval_c_if_3 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template106);

        } while (_jspx_th_c_if_3.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_3.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_3.release();
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
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_forEach_1.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${productList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_1.setVar("board");
    _jspx_th_c_forEach_1.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
        if (_jspx_eval_c_forEach_1 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template110);
            // jsp code [from=(1032,148);to=(1032,158)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template111);
            // jsp code [from=(1032,173);to=(1032,175)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${no}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template112);
            // jsp code [from=(1032,181);to=(1032,190)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template113);
            // jsp code [from=(1032,240);to=(1032,242)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${no}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template114);
            // jsp code [from=(1032,251);to=(1032,261)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template115);
            // jsp code [from=(1032,277);to=(1032,288)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template116);
            // jsp code [from=(1032,305);to=(1032,320)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${strCountPerPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template117);
            // jsp code [from=(1032,332);to=(1032,339)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${section}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template118);
            // jsp code [from=(1032,347);to=(1032,356)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template119);
            // jsp code [from=(1033,47);to=(1033,56)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${idx.count}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template120);
            // jsp code [from=(1034,35);to=(1034,62)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(board.UP_DATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_1));

            out.write(_jspx_template121);
            // jsp code [from=(1035,35);to=(1035,51)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.AREA_AFTER}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template122);
            // jsp code [from=(1036,35);to=(1036,47)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PERIOD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template123);
            // jsp code [from=(1037,35);to=(1037,71)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(board.LICENSE_TAX)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template124);
            // jsp code [from=(1038,35);to=(1038,70)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(board.SUM_ADJUST)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template125);
            // jsp code [from=(1039,35);to=(1039,64)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(board.SUM) }",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template126);

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

  private boolean _jspx_th_c_if_4_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:if ---- //
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = new org.apache.taglibs.standard.tag.rt.core.IfTag();
    _jspx_th_c_if_4.setPageContext(pageContext);
    _jspx_th_c_if_4.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${listSize != '0'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
      if (_jspx_eval_c_if_4 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template140);
          // ----  c:if ---- invoke //
          if (_jspx_th_c_if_5_fn(pageContext, _jspx_th_c_if_4)) return true;


          out.write(_jspx_template146);

        } while (_jspx_th_c_if_4.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_4.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_4.release();
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
          out.write(_jspx_template58);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_1_fn(pageContext, _jspx_th_c_choose_1)) return true;


          out.write(_jspx_template61);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_0_fn(pageContext, _jspx_th_c_choose_1)) return true;


          out.write(_jspx_template63);

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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${listSize != '0'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
      if (_jspx_eval_c_if_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template86);
          // ----  c:if ---- invoke //
          if (_jspx_th_c_if_2_fn(pageContext, _jspx_th_c_if_1)) return true;


          out.write(_jspx_template88);

        } while (_jspx_th_c_if_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_1.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_1.release();
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
    _jspx_th_c_if_5.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${defineTax != 'true'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
      if (_jspx_eval_c_if_5 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template141);
          // jsp code [from=(1136,57);to=(1136,59)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${no}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template142);
          // jsp code [from=(1136,68);to=(1136,78)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template143);
          // jsp code [from=(1136,94);to=(1136,105)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template144);
          // jsp code [from=(1136,113);to=(1136,116)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${seq}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template145);

        } while (_jspx_th_c_if_5.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_5.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_5.release();
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
    _jspx_th_c_when_1.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.CHECK_YN != '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
      if (_jspx_eval_c_when_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template59);
          // jsp code [from=(765,59);to=(765,89)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(board.PRICE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

          out.write(_jspx_template60);

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
          out.write(_jspx_template62);

        } while (_jspx_th_c_otherwise_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_otherwise_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_otherwise_0.release();
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
    _jspx_th_c_if_2.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${defineTax != 'true'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
      if (_jspx_eval_c_if_2 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template87);

        } while (_jspx_th_c_if_2.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_2.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_2.release();
    }
    return false;
  }

  private static jeus.servlet.jsp.el.FunctionMapperImpl _jspx_fnmap_0;
  private static jeus.servlet.jsp.el.FunctionMapperImpl _jspx_fnmap_1;
  
  static {
    _jspx_fnmap_0 = jeus.servlet.jsp.el.FunctionMapperImpl.getInstance();
    _jspx_fnmap_0.mapFunction("rnic:insertComma2", main.java.common.util.StringUtil.class, "insertComma2", new Class[] {java.lang.String.class});

    _jspx_fnmap_1 = jeus.servlet.jsp.el.FunctionMapperImpl.getInstance();
    _jspx_fnmap_1.mapFunction("rnic:addDash", main.java.common.util.StringUtil.class, "addDash", new Class[] {java.lang.String.class});

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
  private final static String _jspx_template9 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n<script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script>\r\n<script language=\"javascript\" src=\"/js/calculation.js\"></script>\r\n<script language=\"javascript\">            \r\n\t\t\tvar savable = 0;\r\n            var savable_v = 0;\r\n\r\n            function InitPage()\r\n            {\r\n\r\n                var gongyu_yn = '";
  private final static String _jspx_template10 = "';\r\n                if(gongyu_yn == '0'){\r\n                    if(document.getElementById(\"CK_DEL\").value == 'true'){\r\n                        location.href = \"/jumyong/productInsert.do?no=";
  private final static String _jspx_template11 = "\";\r\n                    }\r\n\r\n                    setParentYear('";
  private final static String _jspx_template12 = "');\r\n                    var check_yn =\"";
  private final static String _jspx_template13 = "\";\r\n                    parent.document.getElementById(\"SEQ\").value = document.getElementById(\"SEQ\").value;\r\n\r\n                    if(document.getElementById(\"mode\").value == \"edit\" || document.getElementById(\"mode\").value == \"add\"  )\r\n                    {\r\n                        document.getElementById(\"view\").style.display = \"none\";\r\n\r\n                        document.getElementById(\"edit\").style.display= \"block\";\r\n                        document.getElementById(\"edit\").style.pixelTop = 0;\r\n\r\n                        if(check_yn==\"1\"){\r\n                            document.getElementById(\"price_view3\").style.display=\"none\";\r\n                        }\r\n\r\n                        if(document.getElementById(\"mode\").value == \"add\")\r\n                        {\r\n                            var date = new Date();\r\n                            var year = date.getFullYear();\r\n                            document.getElementById(\"YEAR\").value = year;\r\n                        }\r\n\r\n                    }else\r\n                    {\r\n                        document.getElementById(\"edit\").style.display = \"none\";\r\n                        document.getElementById(\"view\").style.display = \"block\";\r\n                        if(check_yn==\"1\"){\r\n                            document.getElementById(\"price_view3\").style.display=\"none\";\r\n                        }\r\n                    }\r\n\r\n                    if(check_yn==\"1\"){\r\n                        document.getElementById(\"price_img\").style.display=\"none\";\r\n                        document.getElementById(\"PRICE\").value=\"1\";\t\t//단가쪽에 공시지가가 표시되기 때문에 공시지가는 1로 표시\r\n                        document.getElementById(\"price_view2\").style.display=\"none\";\r\n                        document.getElementById(\"price_view3\").style.display=\"none\";\r\n                    }\r\n\r\n                    var cal_type = \"";
  private final static String _jspx_template14 = "\";\t\t//월단위 계산인지 일단위 계산인지 여부 알아내기\r\n\r\n\r\n                }else{\r\n                    if(document.getElementById(\"CK_DEL\").value == 'true'){\r\n                        location.href = \"/jumyong/productInsert.do?no=";
  private final static String _jspx_template15 = "\";\r\n                    }\r\n                    setParentYear('";
  private final static String _jspx_template16 = "');\r\n\r\n\r\n                    insertComma(\"SUM_YEAR\");\r\n                    insertComma(\"SUM_LASTYEAR\");\r\n                    insertComma(\"SUM_ADJUST\");\r\n                    insertComma(\"LICENSE_TAX\");\r\n\r\n                    parent.document.getElementById(\"SEQ\").value = document.getElementById(\"SEQ\").value;\r\n\r\n                    if(document.getElementById(\"mode\").value == \"edit\" || document.getElementById(\"mode\").value == \"add\"  )\r\n                    {\r\n                        document.getElementById(\"view\").style.display = \"none\";\r\n                        document.getElementById(\"edit\").style.display= \"block\";\r\n\r\n                        var date = new Date();\r\n                        var year = date.getFullYear();\r\n\r\n                        document.getElementById(\"YEAR\").value = year;\r\n\r\n                    }else\r\n                    {\r\n                        document.getElementById(\"edit\").style.display = \"none\";\r\n                        document.getElementById(\"view\").style.display = \"block\";\r\n                    }\r\n\r\n                }\r\n\r\n            }\r\n\r\n            // 입력, 수정시 저장\r\n            function submitClick()\r\n            {\r\n\r\n\r\n\r\n                var gongyu_yn = '";
  private final static String _jspx_template17 = "';\r\n                if(gongyu_yn == '0'){\r\n\r\n                    var check_yn =\"";
  private final static String _jspx_template18 = "\";\r\n\r\n                    // 수정일때는 산출내역 계산여부 체크 안하도록..\r\n                    if(document.getElementById(\"mode\").value == \"edit\"){\r\n                        savable_v = 4;\r\n                    }\r\n\r\n                    if(check_yn == \"1\"){\r\n                        if(savable_v == 3 || savable_v == 4){\r\n                            var productForm = document.productForm;\r\n\r\n                            //comma제거\r\n                            removeComma2(\"PRICE\");\r\n                            removeComma2(\"SUM_ADJUST\");\r\n                            removeComma2(\"SUM_YEAR\");\r\n                            removeComma2(\"REDUCTION_SUM\");\r\n\r\n                            productForm.submit();\r\n                        }else {\r\n                            alert(\"산출 내역을 먼저 계산해 주십시오.\");\r\n                            return;\r\n                        }\r\n                    }else if(savable_v == 4){\r\n                        var productForm = document.productForm;\r\n\r\n                        //comma제거\r\n                        removeComma2(\"PRICE\");\r\n                        removeComma2(\"SUM_ADJUST\");\r\n                        removeComma2(\"SUM_YEAR\");\r\n                        removeComma2(\"REDUCTION_SUM\");\r\n\r\n                        productForm.submit();\r\n\r\n                        \r\n                    }else {\r\n                        alert(\"산출 내역을 먼저 계산해 주십시오.\");\r\n                        return;\r\n                    }\r\n                }else{\r\n                    // 수정일때는 산출내역 계산여부 체크 안하도록..\r\n                    if(document.getElementById(\"mode\").value == \"edit\"){\r\n                        savable = 4;\r\n                    }\r\n\r\n                    var check_yn =\"";
  private final static String _jspx_template19 = "\";\r\n                    if(check_yn == \"1\"){\r\n                        if(savable == 3 || savable == 4){\r\n                            var productForm = document.productForm;\r\n\r\n                            //comma제거\r\n                            removeComma2(\"LICENSE_TAX\");\r\n                            removeComma2(\"SUM_ADJUST\");\r\n                            removeComma2(\"SUM_YEAR\");\r\n                            removeComma2(\"SUM_LASTYEAR\");\r\n                            removeComma2(\"REDUCTION_SUM\");\r\n                            \r\n\r\n                            productForm.submit();\r\n                        }else {\r\n                            alert(\"산출 내역을 먼저 계산해 주십시오.\");\r\n                            return;\r\n                        }\r\n                    }else if(savable == 4)\r\n                    {\r\n                        var productForm = document.productForm;\r\n\r\n                        //comma 처리\r\n                        removeComma2(\"LICENSE_TAX\");\r\n                        removeComma2(\"SUM_ADJUST\");\r\n                        removeComma2(\"SUM_YEAR\");\r\n                        removeComma2(\"SUM_LASTYEAR\");\r\n                        removeComma2(\"REDUCTION_SUM\");\r\n                        \r\n\r\n                        productForm.submit();\r\n                    }else\r\n                        alert(\"산출 내역을 먼저 계산해 주십시오.\");\r\n\r\n                }\r\n\r\n            }\r\n\r\n            // info 하단  Tab 클릭\r\n            function subTabClick(hiddenSubTabName,visibleSubTabName)\r\n            {\r\n                document.getElementById(hiddenSubTabName).style.visibility = 'hidden';\r\n                document.getElementById(visibleSubTabName).style.visibility = 'visible';\r\n\r\n\r\n                document.getElementById(hiddenSubTabName).style.display = 'none';\r\n                document.getElementById(visibleSubTabName).style.display = 'block';\r\n            }\r\n\r\n            //일시 산출물 계산////////////////////////////////////////////////////////////////////////////////////////////////\r\n            function Calculate2()\r\n            {\r\n                savable = 0;\r\n                \r\n                if(document.getElementById(\"AREA_AFTER\").value==\"0\" || document.getElementById(\"AREA_AFTER\").value==\"\" || document.getElementById(\"AREA_AFTER\").value==\"0.0\"){\r\n                    alert(\"점용면적을 다시 넣어주세요.\");\r\n                    document.getElementById(\"AREA_AFTER\").value=\"\";\r\n                    document.getElementById(\"AREA_AFTER\").focus();\r\n                    return;\r\n                }\r\n                savable++;\r\n                if(document.getElementById(\"PERIOD\").value==\"0\" || document.getElementById(\"PERIOD\").value==\"\"){\r\n                    alert(\"일수를 넣어주세요.\");\r\n                    document.getElementById(\"PERIOD\").value=\"\";\r\n                    document.getElementById(\"PERIOD\").focus();\r\n                    return;\r\n                }\r\n                savable++;\r\n\r\n                var area = document.getElementById(\"AREA_AFTER\").value;\r\n                if(area.substring(area.indexOf(\".\")+1, area.indexOf(\".\")+5).length>3){\r\n                    alert(\"점용면적을 소수점 3자리까지 표기 해 주세요\");\r\n                    document.getElementById(\"AREA_AFTER\").value = \"\";\r\n                    document.getElementById(\"AREA_AFTER\").focus();\r\n                    return;\r\n                }\r\n                savable++;\r\n                getLicense_TaxAjax(area);\t// 면허세 계산\r\n\r\n                var area_after = document.getElementById(\"AREA_AFTER\").value;\r\n                var period = document.getElementById(\"PERIOD\").value;\r\n         \r\n                document.getElementById(\"FORM\").value = area_after+\"㎡ X \" + period + \"일 X 400원\";\r\n                var SUM_YEAR1 = Math.floor(fixFloatCal(parseFloat(area_after)*parseFloat(period)*parseFloat(\"400\")));\r\n                \r\n                document.getElementById(\"SUM_YEAR\").value = SUM_YEAR1;\r\n                document.getElementById(\"SUM_ADJUST\").value = SUM_YEAR1;\r\n\r\n                insertComma(\"SUM_YEAR\");// 현년도 점용료 콤마 삽입\r\n                insertComma(\"SUM_ADJUST\");\r\n\r\n                document.getElementById(\"FORM_ADJUST\").value = area_after+\"㎡ X \"";
  private final static String _jspx_template20 = " + period + \"일 X 400원\";\r\n\r\n                if(document.getElementById(\"SUM_ADJUST\").value==\"0\" || document.getElementById(\"SUM_ADJUST\").value==\"\"){\r\n                    alert(\"계산을 다시 해주세요.\");\r\n                    return;\r\n                }\r\n                \r\n                \r\n                var percentRate = document.getElementById(\"PERCENT_RATE\").value;\r\n                var reductionRate = document.getElementById(\"REDUCTION_RATE\").value;\r\n                \r\n                if(percentRate == '0.0'){\r\n                \tpercentRate = '100.0';\r\n                }\r\n\r\n                // 감면율 계산\r\n                var reduction_sum = parseFloat(removeComma(document.getElementById(\"SUM_ADJUST\").value)) * ((parseFloat(percentRate))/100) * ((100 - parseFloat(reductionRate))/100);\r\n\r\n                //부동소수점 오류 수정\r\n                reduction_sum = fixFloatCal(reduction_sum);\r\n\r\n        \t\tif(document.getElementById(\"TYPE\").value != '1'){\r\n        \t\t\treduction_sum = parseInt(Math.floor(reduction_sum/10)*10); //10원 절삭\r\n        \t\t}else{\r\n        \t\t\treduction_sum = parseInt(Math.floor(reduction_sum/100)*100); //100원 절삭\r\n            \t}\r\n                \r\n                document.getElementById(\"REDUCTION_SUM\").value = insertComma2(reduction_sum);\r\n                \r\n\t\t\t\tvar reductionForm = document.getElementById(\"FORM_ADJUST\").value;\r\n                \r\n                if(percentRate != '0.0' && percentRate != '100.0'){\r\n                \treductionForm += \" X ((\"+percentRate+\")/100)\";\r\n                }\r\n                if(reductionRate != '0.0'){\r\n                \treductionForm += \" X ((100-\"+reductionRate+\")/100)\";\r\n                }\r\n                \r\n                document.getElementById(\"REDUCTION_FORM\").value = reductionForm;\r\n                \r\n                savable++;\r\n                savable_v = savable;\r\n\r\n            }\r\n\r\n\r\n            //  산출 요율 계산/////////////////////////////////////////////////////////////////////\r\n            function getRateAjax2(addSum)\r\n            {\r\n                var params = 'addsum='+addSum;\r\n                var url = \"/getRate.do\" ;\r\n                var adjust = sendRequest(url, params, rateFromServer, \"Post\");\r\n            }\r\n\r\n            function rateFromServer()\r\n            {\r\n                if(httpRequest.readyState == 4)\r\n                {\r\n                    if(httpRequest.status == 200)\r\n                    {\r\n                        var adjust = httpRequest.responseText;\r\n\r\n                        var area_after = document.getElementById(\"AREA_AFTER\").value;\r\n                        var period = document.getElementById(\"period2\").value;\r\n                        var SUM_YEAR1 = parseFloat(area_after)*parseFloat(period)*parseFloat(\"400\");\r\n\r\n                        //부동소수점 오류 수정\r\n                        SUM_YEAR1 = fixFloatCal(SUM_YEAR1);\r\n                        \r\n                        if(adjust != 0.0)\r\n                            document.getElementById(\"SUM_ADJUST2\").value = adjust*SUM_YEAR1;\r\n                        else\r\n                            document.getElementById(\"SUM_ADJUST2\").value = SUM_YEAR1;\r\n\r\n                        delete httpRequest;\r\n                        return null;\r\n                    }else\r\n                    {\r\n\r\n                        delete httpRequest;\r\n                        return null;\r\n                    }\r\n                }else\r\n                {\r\n\r\n                }\r\n            }\r\n            //  산출 요율 계산끝/////////////////////////////////////////////////////////////////////\r\n\r\n            //  면허세        계산/////////////////////////////////////////////////////////////////////\r\n            function getLicense_TaxAjax(area)\r\n            {\r\n\r\n                //encodeURIComponent은 +기호와 같이 자바스크립트상에서 문자로 취급되지 않는 문자를\r\n\r\n                //문자로 취급되게 해주는 함수이다.  document.getElementById(\"Text1\")는 현재 페이지에서\r\n\r\n                //ID값이 Text1인 컨트롤 찾아 낸다. .Net Ajax에서는 $get을 쓴기도 한다.\r\n\r\n                //  var params =\"name=\"+encodeURIComponent(document.getElementById(\"Text1\").value);\r\n                var params = 'area='+area;\r\n                \r\n                var u";
  private final static String _jspx_template21 = "rl = \"/getLicenseTax.do\" ;\r\n\r\n\r\n                //hello.aspx 페이지에 params 쿼리를 Post방식으로 보내어 서버응답을 helloFromServer에서 받는다.\r\n\r\n                var a = sendRequest(url, params, getLicense_TaxfromServer, \"Post\");\r\n            }\r\n\r\n            function getLicense_TaxfromServer()\r\n            {\r\n                if(httpRequest.readyState == 4)\r\n                {\r\n                    if(httpRequest.status == 200)\r\n                    {\r\n                        var LicenseTax = httpRequest.responseText;\r\n\r\n                        document.getElementById(\"LICENSE_TAX\").value = LicenseTax;\r\n\r\n                        insertComma(\"LICENSE_TAX\");// 면허세 점용료 콤마 삽입\r\n\r\n                        delete httpRequest;\r\n                    }else\r\n                    {\r\n                        delete httpRequest;\r\n                    }\r\n                }else\r\n                {\r\n                }\r\n            }\r\n\r\n            //  면허세       계산끝/////////////////////////////////////////////////////////////////////\r\n\r\n            //xml js부분\t//////////////////////////////////////////////////////////////////////////\r\n            function getXMLRequest()\r\n            {\r\n                if(window.ActiveXObject)\r\n                {\r\n                    try\r\n                    {\r\n                        return new ActiveXObject(\"MSXML2.XMLHttp\");\r\n                    }\r\n                    catch(e)\r\n                    {\r\n                        try{\r\n                            return new ActiveXObject(\"Microsoft.XMLHttp\");\r\n                        }\r\n                        catch(e)\r\n                        {\r\n                            return null;\r\n                        }\r\n                    }\r\n                }\r\n                else if(window.XMLHttpRequest)\r\n                {\r\n                    return new XMLHttpRequest();\r\n                }\r\n                else\r\n                {\r\n                    return null;\r\n                }\r\n            }\r\n\r\n            var httpRequest = null;\r\n\r\n            //매개변수: 서버쪽 페이지, 보내는 쿼리문, 서버에서 보내는 자료를 받는 함수, 전송방식\r\n\r\n            function sendRequest(url, params, callback, method)\r\n            {\r\n                httpRequest = getXMLRequest();\r\n\r\n                //쿼리의 전달방식이 전달이 되었는지 확인한다. 만약 전달이 안되었다면\r\n                //GET방식으로 전달하도록 한다.\r\n\r\n                var httpMethod =  method ? method:\"GET\";\r\n\r\n                if(httpMethod != \"GET\" && httpMethod !=\"POST\")\r\n                {\r\n                    httpMethod = \"GET\";\r\n                }\r\n\r\n                //현재 쿼리를 전달할 주소를 받는다.\r\n                var httpParams = (params==null || params ==\"\")?null:params;\r\n                var httpUrl = url;\r\n                if(httpMethod ==\"GET\" && params !=null)\r\n                {\r\n                    httpUrl =httpUrl +\"?\"+httpParams;\r\n                }\r\n                httpRequest.open(httpMethod,httpUrl,true);\r\n                httpRequest.setRequestHeader(\"Content-Type\",\"application/x-www-form-urlencoded\");\r\n\r\n                //onreadystatechange로 서버와 클라인트의 상태를 감지하여 변화가 있을시\r\n\r\n                httpRequest.onreadystatechange = callback;\r\n\r\n                httpRequest.send(httpMethod==\"POST\" ? httpParams:null);\r\n            }\r\n            //ajax js 끝 //////////////////////////////////////////////////////////////////////////////\r\n\r\n\r\n\r\n\r\n\r\n            //금액단위  [ , ] 자동 추가\r\n            function fn_addComma(chknum){\r\n                num = chknum.value;\r\n                num = num.split(',').join('');\r\n                var arr = num.split('.');\r\n                var num = new Array();\r\n                for (i = 0; i <= arr[0].length-1; i++) {\r\n                    num[i] = arr[0].substr(arr[0].length-1-i,1);\r\n                    if(i%3 == 0 && i != 0) num[i] += ',';\r\n                }\r\n                num = num.reverse().join('');\r\n                if (!arr[1]) chknum.value = num; else chknum.value = num+'.'+arr[1];\r\n            }\r\n\r\n            //숫자만 입력\r\n            function onlyNumberInput()\r\n            {\r\n                var code = window.event.keyCode;\r\n\r\n                if ((code > 34 && code < 41) || (code > 47 && code < 58) || (code ";
  private final static String _jspx_template22 = "> 95 && code < 106) || code == 8 || code == 9 || code == 13 || code == 46 || code == 190 || code == 110)\r\n                {\r\n                    window.event.returnValue = true;\r\n                    return;\r\n                }else\r\n                {\r\n                    window.event.returnValue = false;\r\n                    return;\r\n                }\r\n            }\r\n\r\n\r\n            // 콤마 삽입\r\n            function insertComma(val1)\r\n            {\r\n\r\n                value1 = document.getElementById(val1).value;\r\n\r\n                var length1 = value1.length;\r\n                var divideNum = length1%3;\r\n                var returnValue2 =\"\";\r\n\r\n                if(divideNum != 0)\r\n                {\r\n                    returnValue2 = value1.substr(0,divideNum)+\",\";\r\n                }\r\n\r\n                if(length1 >3)\r\n                {\r\n                    while(true)\r\n                    {\r\n                        returnValue2 = returnValue2 + value1.substr(divideNum,3)+\",\";\r\n\r\n                        divideNum = divideNum+3;\r\n                        if(length1 <= divideNum)\r\n                            break;\r\n                    }\r\n                }\r\n\r\n                if(returnValue2 == \"\")\r\n                    returnValue2 = value1;\r\n                else\r\n                    returnValue2 = returnValue2.substr(0,returnValue2.length - 1);\r\n\r\n                document.getElementById(val1).value = returnValue2;\r\n            }\r\n\r\n\r\n            function setParentYear(yearVal)\r\n            {\r\n                parent.document.getElementById(\"year\").value = yearVal;\r\n            }\r\n\r\n            function iFrameResize(obj)\r\n            {\r\n                var iFrm = obj;\r\n                var the_height = iFrm.contentWindow.document.body.scrollHeight;\r\n                iFrm.style.height = the_height + \"px\";\r\n            }\r\n\r\n            function Tab_Src(adminno, seq)\r\n            {\r\n                var tab1\t= document.getElementById(\"tabUpSub1\");\r\n                var tab2\t= document.getElementById(\"tabUpSub2\");\r\n\r\n                //var tabs\t= document.getElementById(\"tabDown\");\r\n\r\n                tab1.src\t= \"/jumyong/inspectEdit.do?no=\" + adminno + \"&seq=\" + seq;\r\n                tab2.src\t= \"/jumyong/confEdit.do?no=\" + adminno + \"&seq=\" + seq;\r\n                //alert(tab1.src);\r\n            }\r\n\r\n            function goDelete()\r\n            {\r\n                var year = '";
  private final static String _jspx_template23 = "';\r\n                var seq = document.getElementById(\"SEQ\").value;\r\n\r\n                var result = confirm(\"산출내역을 삭제하시겠습니까?\");\r\n                if(result){\r\n                \tlocation.href = \"/jumyong/productInsert.do?no=";
  private final static String _jspx_template24 = "&currentPage=";
  private final static String _jspx_template25 = "&countPerPage=";
  private final static String _jspx_template26 = "&check_yn=";
  private final static String _jspx_template27 = "\"\r\n                        +\"&mode=del&year=\"+year+\"&seq=\"+seq+\"&section=";
  private final static String _jspx_template28 = "\"+\"&TYPE=\"+document.getElementById(\"TYPE\").value;\r\n                    alert(str);\r\n                    location.href = str;\r\n\r\n                }\r\n\r\n            }\r\n\r\n\r\n            function goModify()\r\n            {\r\n                var area = document.getElementById(\"AREA_AFTER\").value;\r\n                var year = '";
  private final static String _jspx_template29 = "';\r\n                var seq = document.getElementById(\"SEQ\").value;\r\n                var sum_adjust = Number(removeComma(document.getElementById(\"SUM_ADJUST\").value));\r\n\r\n                location.href = \"/jumyong/productInsert.do?no=";
  private final static String _jspx_template30 = "&currentPage=";
  private final static String _jspx_template31 = "&countPerPage=";
  private final static String _jspx_template32 = "&check_yn=";
  private final static String _jspx_template33 = "\"\r\n                    +\"&mode=edit&year=\"+year+\"&seq=\"+seq+\"&section=";
  private final static String _jspx_template34 = "\";\r\n            }\r\n\r\n            function Calculate()\r\n            {\r\n                savable = 0;\r\n                \r\n                var check_yn =\"";
  private final static String _jspx_template35 = "\";\r\n                var area_after = document.getElementById(\"AREA_AFTER\").value;\r\n                var rate = document.getElementById(\"RATE\").value;\r\n                var type = document.getElementById(\"TYPE\").value;\r\n                var price = removeComma(document.getElementById(\"PRICE\").value);\r\n\r\n                if(check_yn!=\"1\"){\r\n                    if(document.getElementById(\"PRICE\").value==\"0\" || document.getElementById(\"PRICE\").value==\"\"){\r\n                        alert(\"공시지가를 넣으세요.\");\r\n                        document.getElementById(\"PRICE\").value=\"\";\r\n                        document.getElementById(\"PRICE\").focus();\r\n                        document.getElementById(\"saveCheck\").value=\"0\";\r\n                        return;\r\n                    }\r\n                }\r\n                savable++;\t\t//각 점검을 지날때마다 savable에 +1을 해준다.\r\n                if(Number(area_after)==0 || area_after==\"\"){\r\n                    alert(\"점용면적을 넣어주세요.\");\r\n                    document.getElementById(\"AREA_AFTER\").value = \"\";\r\n                    document.getElementById(\"AREA_AFTER\").focus();\r\n                    document.getElementById(\"saveCheck\").value=\"0\";\r\n                    return;\r\n                }\r\n                savable++;\r\n                if(area_after.substring(area_after.indexOf(\".\")+1, area_after.indexOf(\".\")+5).length>3){\r\n                    alert(\"점용면적을 소수점 3자리까지 표기 해 주세요\");\r\n                    document.getElementById(\"AREA_AFTER\").value = \"\";\r\n                    document.getElementById(\"AREA_AFTER\").focus();\r\n                    document.getElementById(\"saveCheck\").value=\"0\";\r\n                    return;\r\n                }\r\n                savable++;\r\n                savable++;\r\n                var period = document.getElementById(\"PERIOD\").value;\r\n\r\n                var leafYear = f_leapyear(document.getElementById(\"YEAR\").value);\r\n\r\n                var SUM_YEAR1 = Math.floor(fixFloatCal(parseFloat(area_after)*parseFloat(period)*parseFloat(\"400\")));\r\n\r\n                var sum_year = Math.floor(fixFloatCal(parseFloat(area_after)*(parseFloat(period)/(365+leafYear))*parseFloat(rate)*parseFloat(price)));\r\n\r\n                \r\n                if(check_yn!=\"1\"){\r\n                    document.getElementById(\"FORM\").value = area_after+\"㎡ X \" + period + \"/\"+Number(365+leafYear)+\"일 X \" +rate +\" X \" +insertComma2(price);\r\n                }else{\r\n                    document.getElementById(\"FORM\").value = area_after+\"㎡ X \" + period + \"/\"+Number(365+leafYear)+\"일 X \" +rate;\r\n                }\r\n\r\n                var sum = sum_year;\r\n\r\n\r\n                var strSUM_ADJUST = String( Math.floor(sum_year)); // 소수점 제거\r\n                sum_year = parseInt(strSUM_ADJUST);\r\n\r\n        \t\tif(type.value != '1'){\r\n        \t\t\tsum_year = parseInt(sum_year/10)*10;\t\t//10원 절삭\r\n\t\t\t\t}else{\r\n        \t\t\tsum_year = parseInt(sum_year/100)*100;\t\t//100원 절삭\r\n\t\t\t\t}\r\n\r\n                \r\n                \r\n                document.getElementById(\"SUM_YEAR\").value = insertComma2(sum_year);\r\n\r\n                document.getElementById(\"FORM_ADJUST\").value = document.getElementById(\"FORM\").value;\r\n                document.getElementById(\"SUM_ADJUST\").value = insertComma2(sum_year);\r\n                \r\n                \r\n                \r\n                var percentRate = document.getElementById(\"PERCENT_RATE\").value;\r\n                var reductionRate = document.getElementById(\"REDUCTION_RATE\").value;\r\n\r\n\r\n                // 감면율 계산\r\n                var reduction_sum = parseFloat(sum) * ((parseFloat(percentRate))/100) * ((100 - parseFloat(reductionRate))/100);\r\n\r\n                //부동소수점 오류 수정\r\n                reduction_sum = fixFloatCal(reduction_sum);\r\n                \r\n        \t\tif(type != '1'){\r\n        \t\t\treduction_sum = parseInt(Math.floor(reduction_sum/10)*10); //10원 절삭\r\n    \t        }else{\r\n\t\t\t\t\treduction_sum = parseInt(Math.floor(reduction_sum/100)*100); //100원 절삭\r\n\t            }\r\n\r\n\r\n                document.getElementById(\"REDUCTION_SUM\").value = insertComma2(reduction_sum);\r\n                \r\n\t\t\t\tvar reductionForm = document.getElementById(\"FORM_ADJUST\").value;\r\n  ";
  private final static String _jspx_template36 = "              \r\n                if(percentRate != '0.0' && percentRate != '100.0'){\r\n                \treductionForm += \" X ((\"+percentRate+\")/100)\";\r\n                }\r\n                if(reductionRate != '0.0'){\r\n                \treductionForm += \" X ((100-\"+reductionRate+\")/100)\";\r\n                }\r\n                \r\n                document.getElementById(\"REDUCTION_FORM\").value = reductionForm;\r\n\r\n\r\n\r\n                \r\n\r\n                document.getElementById(\"saveCheck\").value=\"1\";\r\n\r\n                savable_v = savable;\r\n                savable = 0;\r\n            }\r\n\r\n\r\n\r\n\r\n            //공시지가 팝업\r\n            function openLandPricePopUp()\r\n            {\r\n                var winW = 320;\r\n                var winH = 240;\r\n                var status =\"toolbar=no, location=no, directories=no, status=no, menubar=no, resizable=no, scrollbars=no, width=\"+winW+\", height=\"+winH+\", left=0, top=0\";\r\n\r\n                var admin_no = document.getElementById(\"no\").value;\r\n                var year = document.getElementById(\"YEAR\").value;\r\n                window.open('/land_price.do?ADMIN_NO='+admin_no+'&year='+year, 'win', status);\r\n            }\r\n\r\n            function ShowMsgJumjiInsert(obj){\r\n\r\n                var target = obj;\r\n                if(target.name == 'AREA_AFTER'){\r\n                    alert(\"점용면적은 점용지 정보에서 수정하세요.\");\r\n                }else if(target.name == 'PERCENT_RATE'){\r\n                    alert(\"지분율은 점용지 정보에서 수정하세요.\");\r\n                }else if(target.name == 'PERCENT_REASON'){\r\n                    alert(\"지분율 사유는 점용지 정보에서 수정하세요.\");\r\n                }else if(target.name == 'REDUCTION_RATE'){\r\n                    alert(\"감면율은 점용지 정보에서 수정하세요.\");\r\n                }else if(target.name == 'REDUCTION_REASON'){\r\n                    alert(\"감면율 사유는 점용지 정보에서 수정하세요.\");\r\n                }\r\n            }\r\n        </script>\r\n\r\n\r\n\r\n\r\n</head>\r\n\r\n<body onload=\"javascript:InitPage();\" border=\"0\">\r\n\r\n\t<form id=\"productForm\" name=\"productForm\" method=\"POST\" action=\"/jumyong/productInsert.do\">\r\n\t\t<input id=\"ADMIN_NO\" name=\"ADMIN_NO\" value=\"";
  private final static String _jspx_template37 = "\" type=\"hidden\">\r\n\t\t<input id=\"no\" name=\"no\" value=\"";
  private final static String _jspx_template38 = "\" type=\"hidden\"> \r\n\t\t<input id=\"mode\" name=\"mode\" value=\"";
  private final static String _jspx_template39 = "\" type=\"hidden\"> \r\n\t\t<input id=\"SEQ\" name=\"SEQ\" value=\"";
  private final static String _jspx_template40 = "\" type=\"hidden\"> \r\n\t\t<input id=\"CK_DEL\" name=\"CK_DEL\" value=\"";
  private final static String _jspx_template41 = "\" type=\"hidden\"> \r\n\t\t<input id=\"saveCheck\" name=\"saveCheck\" value=\"0\" type=\"hidden\"> \r\n\t\t<input id=\"TYPE\" name=\"TYPE\" value=\"";
  private final static String _jspx_template42 = "\" type=\"hidden\">\r\n\r\n\r\n\r\n\t\t<table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t<tr>\r\n\t\t\t\t";
  private final static String _jspx_template43 = "\r\n\t\t\t\t\t";
  private final static String _jspx_template44 = "\r\n\t\t\t\t\t\t<td class=\"contborder_purple\">\r\n\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse: collapse;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td height=\"28\" align=\"center\" bgcolor=\"e5eff8\"\r\n\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"sub_table_b\">번호</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">기준연도</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">공시지가</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">면적</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">요율/단가</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">전체기간(일수)</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용료</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">최종 점용료</td>\r\n\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template45 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\" onclick=\"javascript:setParentYear('";
  private final static String _jspx_template46 = "');Tab_Src('";
  private final static String _jspx_template47 = "','";
  private final static String _jspx_template48 = "');location.href('/jumyong/productInsert.do?no=";
  private final static String _jspx_template49 = "&year=";
  private final static String _jspx_template50 = "&currentPage=";
  private final static String _jspx_template51 = "&countPerPage=";
  private final static String _jspx_template52 = "&year=";
  private final static String _jspx_template53 = "&seq=";
  private final static String _jspx_template54 = "&section=";
  private final static String _jspx_template55 = "');\" style=\"cursor: pointer\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\">";
  private final static String _jspx_template56 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template57 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template58 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template59 = "\r\n                                                        ";
  private final static String _jspx_template60 = "\r\n                                                    ";
  private final static String _jspx_template61 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template62 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t-\r\n                                                    ";
  private final static String _jspx_template63 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template64 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template65 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template66 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template67 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template68 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template69 = "</td>\r\n\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template70 = "\r\n\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td height=\"40\" align=\"center\">\t\r\n\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>";
  private final static String _jspx_template71 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\r\n\t\t\t\t\t\t\t</table>\r\n\r\n\t\t\t\t\t\t\t<div id=\"view\" style=\"width: 100%;\">\r\n\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td><table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse: collapse;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">기준년도</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"42%\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template72 = "년</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">공시지가</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"32%\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span id=\"price_view2\" style=\"display: block;\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template73 = "원\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t</span>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용면적</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template74 = "㎡</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">요율/단가</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template75 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\r\n\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">전체기간(일수)</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template76 = "일</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">산출식</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template77 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용료</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template78 = " 원\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">지분율 사유</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template79 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">지분율</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template80 = " %\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">감면율 사유</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template81 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">감면율</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template82 = " %\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">최종 산출식</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template83 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">최종 점용료</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template84 = " 원\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td height=\"40\" align=\"right\">\r\n\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template85 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t<table border=\"0\" width=\"100%\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td></td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template86 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template87 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"50\"><img src=\"/img/mod_icon.gif\" alt=\"수정\" border=\"0\" onclick=\"javascript:goModify()\" style=\"cursor: pointer\"></td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"50\"><img src=\"/img/del_icon3.gif\" alt=\"삭제\" border=\"0\" onclick=\"javascript:goDelete()\" style=\"cursor: pointer\"></td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template88 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template89 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\r\n\t\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template90 = "</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t<div id=\"edit\" style=\"width: 100%; display: none;\">\r\n\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td><table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse: collapse;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" style=\"direction: rtl\">기준년도</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"42%\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input id=\"YEAR\" name=\"YEAR\" type=\"text\" value=\"";
  private final static String _jspx_template91 = "\" style=\"width: 50px; ime-mode: disabled;\" class=\"input_form1\" onKeyDown=\"onlyNumberInput();\" style=\"text-align:right\">&nbsp년</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span id=\"price_view3\" style=\"display: block;\">공시지가</span>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"32%\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span id=\"price_img\" style=\"display: block;\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input id=\"PRICE\" name=\"PRICE\" value=\"";
  private final static String _jspx_template92 = "\" type=\"text\" class=\"input_form1\" style=\"width: 80px; ime-mode: disabled;\" onkeyup=\"javascript:fn_addComma(this)\" onKeyDown=\"onlyNumberInput();\" style=\"text-align:right\">원\r\n                                                                    \t<img src=\"/img/landPrice.gif\" alt=\"공시지가조회\" height=\"18\" border=\"0\" style=\"cursor: pointer\" onclick=\"javascript:openLandPricePopUp();\" align=\"absmiddle\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</span>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table></td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\r\n\r\n\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용면적</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input id=\"AREA_AFTER\" name=\"AREA_AFTER\" type=\"text\" class=\"essential\" style=\"width: 50px; ime-mode: disabled;\" value=\"";
  private final static String _jspx_template93 = "\" onfocus=\"javascript:ShowMsgJumjiInsert(this)\" style=\"text-align:right\" readonly=\"readonly\"> m / ㎡ / 개\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">요율/단가</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input id=\"RATE\" name=\"RATE\" type=\"text\" class=\"input_form1\" style=\"width: 80px; ime-mode: disabled;\" value=\"";
  private final static String _jspx_template94 = "\" onKeyDown=\"onlyNumberInput();\" style=\"text-align:right\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\r\n\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">전체기간(일수)</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input id=\"PERIOD\" name=\"PERIOD\" type=\"text\" class=\"essential\" style=\"width: 80px; ime-mode: disabled;\" value=\"";
  private final static String _jspx_template95 = "\" style=\"text-align:right\" readonly=\"readonly\">개월(일)</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t</table></td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td height=\"40\" align=\"right\">\r\n\t\t\t\t\t\t\t\t\t\t\t<img src=\"/img/accou_icon.gif\" alt=\"계산\" width=\"56\" height=\"18\" border=\"0\" onclick=\"javascript:Calculate();\" style=\"cursor: pointer\">\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse: collapse;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">산출식</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input id=\"FORM\" name=\"FORM\" type=\"hidden\" value=\"";
  private final static String _jspx_template96 = "\"> \r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input id=\"SUM_YEAR\" name=\"SUM_YEAR\" type=\"hidden\" value=\"";
  private final static String _jspx_template97 = "\"> \r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input id=\"FORM_ADJUST\" name=\"FORM_ADJUST\" type=\"text\" class=\"input_form1\" style=\"width: 300px\" value=\"";
  private final static String _jspx_template98 = "\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용료</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input id=\"SUM_ADJUST\" name=\"SUM_ADJUST\" type=\"text\" class=\"input_form1\" style=\"width: 80px; ime-mode: disabled;\" value=\"";
  private final static String _jspx_template99 = "\" onKeyDown=\"onlyNumberInput();\" onkeyup=\"javascript:fn_addComma(this)\" style=\"text-align:right\">원\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">지분율 사유</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input id=\"PERCENT_REASON\" name=\"PERCENT_REASON\" type=\"text\" class=\"essential\" style=\"width: 300px\" value=\"";
  private final static String _jspx_template100 = "\" onfocus=\"javascript:ShowMsgJumjiInsert(this)\" readonly=\"readonly\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">지분율</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input id=\"PERCENT_RATE\" name=\"PERCENT_RATE\" type=\"text\" class=\"essential\" style=\"width: 50px; text-align: right\" value=\"";
  private final static String _jspx_template101 = "\" onfocus=\"javascript:ShowMsgJumjiInsert(this)\" readonly=\"readonly\">%\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">감면율 사유</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input id=\"REDUCTION_REASON\" name=\"REDUCTION_REASON\" type=\"text\" class=\"essential\" style=\"width: 300px\" value=\"";
  private final static String _jspx_template102 = "\" onfocus=\"javascript:ShowMsgJumjiInsert(this)\" readonly=\"readonly\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">감면율</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input id=\"REDUCTION_RATE\" name=\"REDUCTION_RATE\" type=\"text\" class=\"essential\" style=\"width: 50px; text-align: right\" value=\"";
  private final static String _jspx_template103 = "\" onfocus=\"javascript:ShowMsgJumjiInsert(this)\" readonly=\"readonly\">%\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">최종 산출식</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input id=\"REDUCTION_FORM\" name=\"REDUCTION_FORM\" type=\"text\" class=\"input_form1\" style=\"width: 300px\" value=\"";
  private final static String _jspx_template104 = "\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">최종 점용료</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input id=\"REDUCTION_SUM\" name=\"REDUCTION_SUM\" type=\"text\" class=\"input_form1\" style=\"width: 80px; ime-mode: disabled;\"\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\tvalue=\"";
  private final static String _jspx_template105 = "\" onKeyDown=\"onlyNumberInput();\" onkeyup=\"javascript:fn_addComma(this)\" style=\"text-align:right\">원\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td height=\"40\" align=\"right\">\r\n\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template106 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"/img/can_icon.gif\" alt=\"취소\" border=\"0\" onclick=\"javascript:history.back();\" style=\"cursor: pointer\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"/img/save_icon2.gif\" alt=\"저장\" width=\"56\" height=\"18\" border=\"0\" onClick=\"javascript:submitClick();\" style=\"cursor: pointer\">\r\n\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template107 = "\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t";
  private final static String _jspx_template108 = "\r\n\r\n\t\t\t\t\t";
  private final static String _jspx_template109 = "\r\n\t\t\t\t\t\t<td class=\"contborder_purple\">\r\n\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\"\r\n\t\t\t\t\t\t\t\t\t\t\tstyle=\"border-collapse: collapse;\" cellpadding=\"0\"\r\n\t\t\t\t\t\t\t\t\t\t\tcellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td height=\"28\" align=\"center\" bgcolor=\"e5eff8\"\r\n\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"sub_table_b\">번호</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">갱신연월</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">면적</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">전체기간(일수)</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">면허세</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">일시점용료\r\n\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">최종 일시점용료</td>\r\n\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\r\n\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template110 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\" onclick=\"javascript:setParentYear('";
  private final static String _jspx_template111 = "');Tab_Src('";
  private final static String _jspx_template112 = "','";
  private final static String _jspx_template113 = "');location.href('/jumyong/productInsert.do?no=";
  private final static String _jspx_template114 = "&year=";
  private final static String _jspx_template115 = "&currentPage=";
  private final static String _jspx_template116 = "&countPerPage=";
  private final static String _jspx_template117 = "&section=";
  private final static String _jspx_template118 = "&seq=";
  private final static String _jspx_template119 = "');\" style=\"cursor: pointer\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\">";
  private final static String _jspx_template120 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template121 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template122 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template123 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template124 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template125 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template126 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template127 = "\r\n\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td height=\"40\" align=\"center\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template128 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\r\n\t\t\t\t\t\t\t</table>\r\n\r\n\t\t\t\t\t\t\t<div id=\"view\" style=\"width: 100%;\">\r\n\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td><table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse: collapse;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용면적</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template129 = "㎡</td>\r\n\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">전체기간(일수)</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>";
  private final static String _jspx_template130 = " 일</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">면허세</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template131 = "원\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">산출식</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template132 = "</td>\r\n\r\n\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용료</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template133 = "원</td>\r\n\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">지분율 사유</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template134 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">지분율</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template135 = " %\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">감면율 사유</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template136 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">감면율</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template137 = " %\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">감면 산출식</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template138 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">감면 점용료</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template139 = " 원\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td height=\"40\" align=\"right\">\r\n\t\t\t\t\t\t\t\t\t\t\t<table border=\"0\" width=\"100%\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td></td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template140 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template141 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"50\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"/jumyong/productInsert.do?no=";
  private final static String _jspx_template142 = "&year=";
  private final static String _jspx_template143 = "&currentPage=";
  private final static String _jspx_template144 = "&seq=";
  private final static String _jspx_template145 = "&mode=edit\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"/img/mod_icon.gif\" alt=\"수정\" border=\"0\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</a>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"50\"><img src=\"/img/del_icon3.gif\" alt=\"삭제\" border=\"0\" onclick=\"javascript:goDelete()\" style=\"cursor: pointer\"></td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template146 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template147 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t</table></td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t</div>\r\n\r\n\t\t\t\t\t\t\t<div id=\"edit\" style=\"width: 100%; display: none;\">\r\n\t\t\t\t\t\t\t\t\t<input name=\"FROMDATE\" ID=\"FROMDATE\" type=\"hidden\" value=\"";
  private final static String _jspx_template148 = "\">\r\n\t\t\t\t\t\t\t\t\t<input name=\"TODATE\" ID=\"TODATE\" type=\"hidden\" value=\"";
  private final static String _jspx_template149 = "\">\r\n\t\t\t\t\t\t\t\t\t<input name=\"YEAR\" ID=\"YEAR\" type=\"hidden\" value=\"\">\r\n\t\t\t\t\t\t\t\t\t<input name=\"PRICE\" ID=\"PRICE\" type=\"hidden\" value=\"0\">\r\n\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td><table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse: collapse;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"15%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용면적</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" width=\"35%\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"AREA_AFTER\" id=\"AREA_AFTER\" type=\"text\" class=\"essential\" style=\"width: 60px\" value=\"";
  private final static String _jspx_template150 = "\" style=\"ime-mode:disabled;direction:rtl;\" onfocus=\"javascript:ShowMsgJumjiInsert(this)\" readonly=\"readonly\">㎡ / 개\r\n                                            \t\t</td>\r\n\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"15%\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">전체기간(일수)</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" width=\"35%\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"PERIOD\" id=\"PERIOD\" type=\"text\" class=\"essential\" style=\"width: 60px\" value=\"";
  private final static String _jspx_template151 = "\" onKeyDown=\"onlyNumberInput();\" style=\"ime-mode:disabled;direction:rtl;\" onKeyDown=\"onlyNumberInput();\"> 일\r\n                                            \t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\r\n\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td height=\"40\" align=\"right\">\r\n\t\t\t\t\t\t\t\t\t\t\t<img src=\"/img/accou_icon.gif\" alt=\"계산\" width=\"56\" height=\"18\" border=\"0\" onclick=\"javascript:Calculate2();\" style=\"cursor: pointer\">\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse: collapse;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">면허세</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"LICENSE_TAX\" ID=\"LICENSE_TAX\" type=\"text\" class=\"input_form1\" value=\"";
  private final static String _jspx_template152 = "\" style=\"width: 120px; ime-mode: disabled; direction: rtl;\" onclick=\"javascript:getLicense_TaxAjax(document.getElementById('AREA_AFTER').value);\" onkeyup=\"javascript:fn_addComma(this);\" onKeyDown=\"onlyNumberInput();\">원\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"SUM_LASTYEAR\" id=\"SUM_LASTYEAR\" type=\"hidden\" class=\"input_form1\" style=\"width: 120px\" value=\"";
  private final static String _jspx_template153 = "\" style=\"ime-mode:disabled;direction:rtl;\" onKeyDown=\"onlyNumberInput();\" onkeyup=\"javascript:fn_addComma(this);\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"SUM_YEAR\" id=\"SUM_YEAR\" type=\"hidden\" class=\"input_form1\" style=\"width: 120px\" value=\"";
  private final static String _jspx_template154 = "\" style=\"ime-mode:disabled;direction:rtl;\" onKeyDown=\"onlyNumberInput();\" onkeyup=\"javascript:fn_addComma(this);\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"FORM\" id=\"FORM\" type=\"hidden\" class=\"input_form1\" style=\"width: 200px\" value=\"";
  private final static String _jspx_template155 = "\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"ADJUSTMENT\" id=\"ADJUSTMENT\" type=\"hidden\" class=\"input_form1\" style=\"width: 120px\" value=\"";
  private final static String _jspx_template156 = "\" style=\"ime-mode:disabled;direction:rtl;\" onKeyDown=\"onlyNumberInput();\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조정 산출식</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"FORM_ADJUST\" id=\"FORM_ADJUST\" type=\"text\" class=\"input_form1\" style=\"width: 350px\" value=\"";
  private final static String _jspx_template157 = "\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조정 점용료</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"SUM_ADJUST\" id=\"SUM_ADJUST\" type=\"text\" class=\"input_form1\" style=\"width: 80px; ime-mode: disabled;\" value=\"";
  private final static String _jspx_template158 = "\" style=\"ime-mode:disabled;direction:rtl;\" onKeyDown=\"onlyNumberInput();\" onkeyup=\"javascript:fn_addComma(this);\">원\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">지분율 사유</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"PERCENT_REASON\" id=\"PERCENT_REASON\" type=\"text\" class=\"essential\" style=\"width: 350px\" value=\"";
  private final static String _jspx_template159 = "\" onfocus=\"javascript:ShowMsgJumjiInsert(this)\" readonly=\"readonly\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">지분율</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"PERCENT_RATE\" id=\"PERCENT_RATE\" type=\"text\" class=\"essential\" style=\"width: 50px; text-align: right\" value=\"";
  private final static String _jspx_template160 = "\" onfocus=\"javascript:ShowMsgJumjiInsert(this)\" readonly=\"readonly\">%\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">감면율 사유</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"REDUCTION_REASON\" id=\"REDUCTION_REASON\" type=\"text\" class=\"essential\" style=\"width: 350px\" value=\"";
  private final static String _jspx_template161 = "\" onfocus=\"javascript:ShowMsgJumjiInsert(this)\" readonly=\"readonly\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">감면율</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"REDUCTION_RATE\" id=\"REDUCTION_RATE\" type=\"text\" class=\"essential\" style=\"width: 50px; text-align: right\" value=\"";
  private final static String _jspx_template162 = "\" onfocus=\"javascript:ShowMsgJumjiInsert(this)\" readonly=\"readonly\">%\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">최종 산출식</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"REDUCTION_FORM\" id=\"REDUCTION_FORM\" type=\"text\" class=\"input_form1\" style=\"width: 350px\" value=\"";
  private final static String _jspx_template163 = "\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">최종 점용료</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"REDUCTION_SUM\" id=\"REDUCTION_SUM\" type=\"text\" class=\"input_form1\" style=\"width: 80px; ime-mode: disabled;\" value=\"";
  private final static String _jspx_template164 = "\" onKeyDown=\"onlyNumberInput();\" onkeyup=\"javascript:fn_addComma(this)\" style=\"text-align:right\">원\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td height=\"40\" align=\"right\">\r\n\t\t\t\t\t\t\t\t\t\t\t<img src=\"/img/can_icon.gif\" alt=\"취소\" border=\"0\" onclick=\"javascript:history.back();\" style=\"cursor: pointer\">\r\n\t\t\t\t\t\t\t\t\t\t\t<img src=\"/img/save_icon2.gif\" alt=\"저장\" width=\"56\" height=\"18\" border=\"0\" onClick=\"javascript:submitClick();\" style=\"cursor: pointer\">\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t</div></td>\r\n\t\t\t\t\t";
  private final static String _jspx_template165 = "\r\n\t\t\t\t";
  private final static String _jspx_template166 = "\r\n\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"10\"></td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td>\r\n\t\t\t\t\t<iframe width=\"100%\" height=\"100%\" id=\"tabUpSub1\" name=\"tabUpSub1\" frameborder=\"0\" onload=\"iFrameResize(this)\" scrolling=\"no\" src=\"/jumyong/inspectEdit.do?no=";
  private final static String _jspx_template167 = "&seq=";
  private final static String _jspx_template168 = "&SECTION=";
  private final static String _jspx_template169 = "\"></iframe>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"10\"></td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td>\r\n\t\t\t\t\t<iframe width=\"100%\" height=\"100%\" id=\"tabUpSub2\" name=\"tabUpSub2\" frameborder=\"0\" onload=\"iFrameResize(this)\" scrolling=\"no\" src=\"/jumyong/confEdit.do?no=";
  private final static String _jspx_template170 = "&seq=";
  private final static String _jspx_template171 = "&SECTION=";
  private final static String _jspx_template172 = "\"></iframe>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t</table>\r\n\t</form>\r\n</body>\r\n</html>\r\n\r\n";
}
