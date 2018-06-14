package jeus_jspwork._jsp._facility._junggi._tab;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_info_5fproduct_5fview_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(64,46);to=(64,53)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${yearAdd}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(138,59);to=(138,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${gu_code}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(139,59);to=(139,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${corp_cd}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(140,65);to=(140,83)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.REQUEST_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(141,63);to=(141,80)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.OBJECT_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(142,67);to=(142,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${cal_sum_seq}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(144,51);to=(144,54)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(146,67);to=(146,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(147,42);to=(147,54)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(149,43);to=(149,48)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${year }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(150,46);to=(150,54)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${tax_set }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(151,46);to=(151,53)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${message}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(152,46);to=(152,54)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${sigu_cd }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(153,45);to=(153,60)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.TAX_YN }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(154,49);to=(154,60)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${cal_status }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // jsp code [from=(155,50);to=(155,70)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.USE_SECTION }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);
      // jsp code [from=(156,57);to=(156,76)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${InputTaxationCount }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template26);
      // jsp code [from=(157,55);to=(157,72)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${WriteCalSumCount }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template47);
      // jsp code [from=(212,21);to=(212,28)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${pageing}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template48);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_1_fn(pageContext, null)) return;


      out.write(_jspx_template90);
      // jsp code [from=(288,19);to=(288,36)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${strPageDivideForm}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template91);
      // jsp code [from=(299,83);to=(299,95)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template92);
      // jsp code [from=(301,83);to=(301,115)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.PRICE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

      out.write(_jspx_template93);
      // jsp code [from=(309,13);to=(309,29)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.QUANTITY}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template94);
      // jsp code [from=(313,13);to=(313,31)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.DEPTH_RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template95);
      // jsp code [from=(319,13);to=(319,25)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template96);
      // jsp code [from=(325,73);to=(325,103)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(product.FROMDATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_1));

      out.write(_jspx_template97);
      // jsp code [from=(325,109);to=(325,137)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(product.TODATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_1));

      out.write(_jspx_template98);
      // jsp code [from=(327,71);to=(327,85)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.PERIOD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template99);
      // jsp code [from=(332,62);to=(332,81)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.FORM_ADJUST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template100);
      // jsp code [from=(335,62);to=(335,99)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.SUM_ADJUST)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

      out.write(_jspx_template101);
      // jsp code [from=(344,71);to=(344,101)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(product.TAX_DATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_1));

      out.write(_jspx_template102);
      // jsp code [from=(347,71);to=(347,99)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(product.INDATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_1));

      out.write(_jspx_template103);
      // jsp code [from=(353,71);to=(353,101)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(product.OVERDATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_1));

      out.write(_jspx_template104);
      // jsp code [from=(356,71);to=(356,105)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.OVERTAX)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

      out.write(_jspx_template105);
      // jsp code [from=(362,72);to=(362,84)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.FORM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template106);
      // jsp code [from=(364,72);to=(364,100)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(SumAdjust)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

      out.write(_jspx_template107);
      // jsp code [from=(370,84);to=(370,103)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.FORM_ADJUST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template108);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_3_fn(pageContext, null)) return;


      out.write(_jspx_template110);

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
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${calSumList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("board");
    _jspx_th_c_forEach_0.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template28);
            // ----  c:choose ---- invoke //
            if (_jspx_th_c_choose_0_fn(pageContext, _jspx_th_c_forEach_0)) return true;


            out.write(_jspx_template38);
            // jsp code [from=(191,42);to=(191,53)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template39);
            // jsp code [from=(192,30);to=(192,66)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(board.SUM_ADJUST) }",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template40);
            // jsp code [from=(193,30);to=(193,59)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(board.SUM) }",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template41);
            // jsp code [from=(194,30);to=(194,53)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.USE_SECTION_NAME }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template42);
            // ----  c:if ---- invoke //
            if (_jspx_th_c_if_0_fn(pageContext, _jspx_th_c_forEach_0)) return true;


            out.write(_jspx_template45);
            // jsp code [from=(200,30);to=(200,49)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TAX_SET_NAME }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template46);

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
    _jspx_th_c_forEach_1.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${CalculationList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_1.setVar("board");
    _jspx_th_c_forEach_1.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
        if (_jspx_eval_c_forEach_1 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template49);
            // ----  c:choose ---- invoke //
            if (_jspx_th_c_choose_1_fn(pageContext, _jspx_th_c_forEach_1)) return true;


            out.write(_jspx_template61);
            // jsp code [from=(250,43);to=(250,52)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${idx.count}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template62);
            // jsp code [from=(251,46);to=(251,59)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GU_CODE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template63);
            // jsp code [from=(251,63);to=(251,76)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.CORP_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template64);
            // ----  c:choose ---- invoke //
            if (_jspx_th_c_choose_2_fn(pageContext, _jspx_th_c_forEach_1)) return true;


            out.write(_jspx_template75);
            // jsp code [from=(260,31);to=(260,44)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SORT_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template76);
            // jsp code [from=(260,48);to=(260,61)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.KIND_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template77);
            // jsp code [from=(261,31);to=(261,45)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.QUANTITY}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template78);
            // jsp code [from=(262,31);to=(262,49)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TAX_SET_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template79);
            // jsp code [from=(263,34);to=(263,49)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.DEPTH_NUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template80);
            // jsp code [from=(264,34);to=(264,50)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.DEPTH_RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template81);
            // jsp code [from=(265,34);to=(265,52)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TAX_SET_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template82);
            // jsp code [from=(266,31);to=(266,66)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(board.SUM_ADJUST)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template83);
            // jsp code [from=(267,34);to=(267,56)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.USE_SECTION_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template84);
            // ----  c:if ---- invoke //
            if (_jspx_th_c_if_1_fn(pageContext, _jspx_th_c_forEach_1)) return true;


            out.write(_jspx_template86);
            // ----  c:if ---- invoke //
            if (_jspx_th_c_if_2_fn(pageContext, _jspx_th_c_forEach_1)) return true;


            out.write(_jspx_template88);
            // jsp code [from=(278,30);to=(278,40)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TYPE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template89);

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

  private boolean _jspx_th_c_if_3_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:if ---- //
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = new org.apache.taglibs.standard.tag.rt.core.IfTag();
    _jspx_th_c_if_3.setPageContext(pageContext);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.USE_SECTION == '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
      if (_jspx_eval_c_if_3 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template109);

        } while (_jspx_th_c_if_3.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_3.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_3.release();
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
          out.write(_jspx_template29);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template33);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template37);

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
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.USE_SECTION == '2' }", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template43);
          // jsp code [from=(197,14);to=(197,30)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.REQUEST_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template44);

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
          out.write(_jspx_template50);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_1_fn(pageContext, _jspx_th_c_choose_1)) return true;


          out.write(_jspx_template55);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_1_fn(pageContext, _jspx_th_c_choose_1)) return true;


          out.write(_jspx_template60);

        } while (_jspx_th_c_choose_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_choose_1.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_choose_1.release();
    }
    return false;
  }

  private boolean _jspx_th_c_choose_2_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:choose ---- //
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_2 = new org.apache.taglibs.standard.tag.common.core.ChooseTag();
    _jspx_th_c_choose_2.setPageContext(pageContext);
    _jspx_th_c_choose_2.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    try {
      int _jspx_eval_c_choose_2 = _jspx_th_c_choose_2.doStartTag();
      if (_jspx_eval_c_choose_2 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template65);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_2_fn(pageContext, _jspx_th_c_choose_2)) return true;


          out.write(_jspx_template70);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_2_fn(pageContext, _jspx_th_c_choose_2)) return true;


          out.write(_jspx_template74);

        } while (_jspx_th_c_choose_2.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_choose_2.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_choose_2.release();
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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SUM_ADJUST != null }", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
      if (_jspx_eval_c_if_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template85);

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
    _jspx_th_c_if_2.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SUM_ADJUST == null }", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
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

  private boolean _jspx_th_c_when_0_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:when ---- //
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = new org.apache.taglibs.standard.tag.rt.core.WhenTag();
    _jspx_th_c_when_0.setPageContext(pageContext);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SEQ != cal_sum_seq }", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
      if (_jspx_eval_c_when_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template30);
          // jsp code [from=(183,42);to=(183,51)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template31);
          // jsp code [from=(183,57);to=(183,68)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR }",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template32);

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
          out.write(_jspx_template34);
          // jsp code [from=(187,45);to=(187,54)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template35);
          // jsp code [from=(187,60);to=(187,71)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR }",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template36);

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
    _jspx_th_c_when_1.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SEQ != SEQ }", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
      if (_jspx_eval_c_when_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template51);
          // jsp code [from=(242,39);to=(242,48)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template52);
          // jsp code [from=(242,54);to=(242,65)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR }",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template53);
          // jsp code [from=(242,71);to=(242,87)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.CAL_STATUS}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template54);

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
          out.write(_jspx_template56);
          // jsp code [from=(245,43);to=(245,52)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template57);
          // jsp code [from=(245,58);to=(245,69)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR }",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template58);
          // jsp code [from=(245,75);to=(245,91)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.CAL_STATUS}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template59);

        } while (_jspx_th_c_otherwise_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_otherwise_1.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_otherwise_1.release();
    }
    return false;
  }

  private boolean _jspx_th_c_when_2_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:when ---- //
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_2 = new org.apache.taglibs.standard.tag.rt.core.WhenTag();
    _jspx_th_c_when_2.setPageContext(pageContext);
    _jspx_th_c_when_2.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_when_2.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.USE_SECTION == '2' }", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_2 = _jspx_th_c_when_2.doStartTag();
      if (_jspx_eval_c_when_2 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template66);
          // jsp code [from=(254,43);to=(254,54)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR }",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template67);
          // jsp code [from=(254,60);to=(254,76)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.REQUEST_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template68);
          // jsp code [from=(254,82);to=(254,104)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.USE_SECTION_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template69);

        } while (_jspx_th_c_when_2.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_when_2.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_when_2.release();
    }
    return false;
  }

  private boolean _jspx_th_c_otherwise_2_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:otherwise ---- //
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_2 = new org.apache.taglibs.standard.tag.common.core.OtherwiseTag();
    _jspx_th_c_otherwise_2.setPageContext(pageContext);
    _jspx_th_c_otherwise_2.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    try {
      int _jspx_eval_c_otherwise_2 = _jspx_th_c_otherwise_2.doStartTag();
      if (_jspx_eval_c_otherwise_2 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template71);
          // jsp code [from=(257,43);to=(257,54)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR }",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template72);
          // jsp code [from=(257,60);to=(257,82)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.USE_SECTION_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template73);

        } while (_jspx_th_c_otherwise_2.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_otherwise_2.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_otherwise_2.release();
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
  private final static String _jspx_template1 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('사용자의 사용시간이 종료되었습니다. 다시 접속 해주시기 바랍니다.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template2 = "\r\n";
  private final static String _jspx_template3 = "\r\n";
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "  \r\n";
  private final static String _jspx_template6 = "  \r\n";
  private final static String _jspx_template7 = "\r\n";
  private final static String _jspx_template8 = "\r\n";
  private final static String _jspx_template9 = "    \r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n<script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script> \r\n<script>\r\n<!--\t\r\n\r\n\tfunction InitPage()\r\n\t{\r\n\r\n\t}\r\n\t\r\n\tfunction goview(seq , year, cal_status)\r\n\t{\r\n\t\tvar gu_code= document.getElementById(\"gu_code\").value;\r\n\t\tvar corp_cd = document.getElementById(\"corp_cd\").value;\r\n\t\tvar request_no= document.getElementById(\"request_no\").value;\r\n\r\n\t\tvar currentPage= document.getElementById(\"currentPage\").value;\r\n\t\tvar cal_sum_seq = document.getElementById(\"cal_sum_seq\").value;\r\n\t\t\r\n\t\t//var year = document.getElementById(\"year\").value;\r\n\t\tvar tax_set = document.getElementById(\"tax_set\").value;\r\n\r\n\t\tlocation.href=\"/facility/junggi/product_view.do?GU_CODE=\"+gu_code+\"&CORP_CD=\"+corp_cd\r\n\t\t+\"&REQUEST_NO=\"+request_no+\"&currentPage=\"+currentPage+\"&SEQ=\"+seq+\"&cal_sum_seq=\"+cal_sum_seq+\"&year=\"+year\r\n\t\t+\"&tax_set=\"+tax_set+\"&cal_status=\"+cal_status;\r\n\t}\r\n\t\r\n\tfunction goSumview(seq,year)\r\n\t{\r\n\t\tvar gu_code= document.getElementById(\"gu_code\").value;\r\n\t\tvar corp_cd = document.getElementById(\"corp_cd\").value;\r\n\t\tvar request_no= document.getElementById(\"request_no\").value;\r\n\r\n\t\tvar currentPage= document.getElementById(\"currentPage\").value;\r\n\t\t\r\n\t\t//var year = document.getElementById(\"year\").value;\r\n\t\tvar tax_set = document.getElementById(\"tax_set\").value;\r\n\r\n\t\tlocation.href=\"/facility/junggi/product_view.do?GU_CODE=\"+gu_code+\"&CORP_CD=\"+corp_cd\r\n\t\t+\"&REQUEST_NO=\"+request_no+\"&currentPage=\"+currentPage+\"&cal_sum_seq=\"+seq+\"&year=\"+year+\"&tax_set=\"+tax_set;\r\n\t}\r\n\t\r\n\t// mode ==  add:정기분산출, edit: 수정하기\r\n\tfunction goModify(mode)\r\n\t{\r\n\t\t\r\n\t\tif( mode == 'add' ){\r\n\t\t\tif( document.productForm.YEAR.value >= '";
  private final static String _jspx_template10 = "' ){\r\n\t\t\t\talert(\"정기분 산출은 다음년도만 부과 가능합니다. 확인해주세요. \");\t\t\t\r\n\t\t\t\treturn;\r\n\t\t\t}\r\n\t\t\tif( document.productForm.cal_status.value != '' && document.productForm.cal_status.value != '0' && document.productForm.cal_status.value != 'null' ){\r\n\t\t\t\talert(\"이미 산출된 항목입니다. 확인해주세요. \");\r\n\t\t\t\treturn;\r\n\t\t\t}\r\n\r\n\t\t\tif(document.productForm.InputTaxationCount.value != document.productForm.WriteCalSumCount.value){\r\n\t\t\t\talert(\"세외수입관리에서 작성하지 않은 항목이 있습니다. 확인해 주세요\");\r\n\t\t\t\treturn;\r\n\t\t\t}\r\n\t\t\t\r\n\t\t}\r\n\t\tif( mode == 'edit' ){\r\n\t\t\tif( document.productForm.TAX_YN.value == '1' ) {\r\n\t\t\t\talert(\"이미 부과된 정기분은 수정 불가합니다. 확인해주세요.\");\r\n\t\t\t\treturn;\r\n\t\t\t}\r\n\t\t}\t\t\r\n\t\t\r\n\t\tvar gu_code= document.getElementById(\"gu_code\").value;\r\n\t\tvar corp_cd = document.getElementById(\"corp_cd\").value;\r\n\t\tvar request_no= document.getElementById(\"request_no\").value;\r\n\t\tvar currentPage= document.getElementById(\"currentPage\").value;\r\n\t\tvar object_no = document.getElementById(\"object_no\").value;\r\n\t\tvar seq = document.getElementById(\"SEQ\").value;\r\n\t\tvar cal_sum_seq = document.getElementById(\"cal_sum_seq\").value;\r\n\t\t\r\n\t\tvar year = document.getElementById(\"YEAR\").value;\r\n\t\tvar tax_set = document.getElementById(\"tax_set\").value;\r\n\t\tvar sigu_cd = document.getElementById(\"sigu_cd\").value;\r\n\t\t\r\n\t\t\r\n\t\t//alert(object_no);\r\n\r\n//\t\tlocation.href=\"/facility/jumyong/productInsert.do?GU_CODE=\"+gu_code+\"&CORP_CD=\"+corp_cd\r\n//\t\t+\"&REQUEST_NO=\"+request_no+\"&currentPage=\"+currentPage+\"&OBJECT_NO=\"+object_no+\"&mode=\"+mode;\r\n\t\t\r\n\t\tlocation.href=\"/facility/junggi/product_insert.do?GU_CODE=\"+gu_code+\"&CORP_CD=\"+corp_cd\r\n\t\t+\"&REQUEST_NO=\"+request_no+\"&currentPage=\"+currentPage+\"&OBJECT_NO=\"+object_no+\"&mode=\"+mode+\"&SEQ=\"+seq+\"&cal_sum_seq=\"+cal_sum_seq+\"&year=\"+year\r\n\t\t+\"&tax_set=\"+tax_set+\"&sigu_cd=\"+sigu_cd;\r\n\t}\r\n\r\n\r\n\tfunction submitClick()\r\n\t{\r\n\t\tvar productForm = document.productForm;\r\n\r\n\t\tproductForm.submit();\r\n\t}\r\n\t\r\n\t\r\n\tfunction goTempInsert()\r\n\t{\r\n\t\r\n\t\tvar gu_code = document.getElementById(\"gu_code\").value;\r\n\t\tvar corp_cd = document.getElementById(\"corp_cd\").value;\r\n\t\tvar request_no = document.getElementById(\"request_no\").value;\r\n\t\t//var year = document.getElementById(\"YEAR\").value;\r\n\t\r\n\t\tlocation.href(\"/facility/junggi/product_temp_insert.do?gu_code=\"+gu_code+\"&corp_cd=\"+corp_cd+\"&year=\"+year+\"&request_no=\"+request_no);\r\n\t}\r\n\t-->\r\n\t\r\n</script>\r\n\r\n</head>\r\n\r\n<body onload=\"javascript:InitPage();\"  border=\"0\">\r\n\r\n<form name=\"productForm\" id=\"productForm\" method=\"post\" action = \"/facility/jumyong/productInsert.do\" >\r\n\r\n<input type=\"hidden\" NAME=\"GU_CODE\" ID=\"gu_code\" value=\"";
  private final static String _jspx_template11 = "\" >\r\n<input type=\"hidden\" NAME=\"CORP_CD\" ID=\"corp_cd\" value=\"";
  private final static String _jspx_template12 = "\" >\r\n<input type=\"hidden\" NAME=\"REQUEST_NO\" ID=\"request_no\" value=\"";
  private final static String _jspx_template13 = "\" >\r\n<input type=\"hidden\" NAME=\"OBJECT_NO\" ID=\"object_no\" value=\"";
  private final static String _jspx_template14 = "\" >\r\n<input type=\"hidden\" NAME=\"cal_sum_seq\" ID=\"cal_sum_seq\" value=\"";
  private final static String _jspx_template15 = "\" >\t\r\n\r\n<input type=\"hidden\" NAME=\"SEQ\" ID=\"SEQ\" value=\"";
  private final static String _jspx_template16 = "\" >\t\t\r\n\r\n<input type=\"hidden\" NAME=\"currentPage\" ID=\"currentPage\" value=\"";
  private final static String _jspx_template17 = "\" >\r\n<input name=\"YEAR\"  id = \"YEAR\" value=\"";
  private final static String _jspx_template18 = "\" type=\"hidden\" >\r\n<!-- 2009.8.17 추가 start -->\r\n<input type=\"hidden\" name=\"year\" value=\"";
  private final static String _jspx_template19 = "\">\r\n<input type=\"hidden\" name=\"tax_set\" value=\"";
  private final static String _jspx_template20 = "\">\r\n<input type=\"hidden\" name=\"message\" value=\"";
  private final static String _jspx_template21 = "\">\r\n<input type=\"hidden\" name=\"sigu_cd\" value=\"";
  private final static String _jspx_template22 = "\">\r\n<input type=\"hidden\" name=\"TAX_YN\" value=\"";
  private final static String _jspx_template23 = "\">\r\n<input type=\"hidden\" name=\"cal_status\" value=\"";
  private final static String _jspx_template24 = "\">\r\n<input type=\"hidden\" name=\"use_section\" value=\"";
  private final static String _jspx_template25 = "\">\r\n<input type=\"hidden\" name=\"InputTaxationCount\" value=\"";
  private final static String _jspx_template26 = "\"/>\r\n<input type=\"hidden\" name=\"WriteCalSumCount\" value=\"";
  private final static String _jspx_template27 = "\" />\r\n\r\n\r\n\r\n<!-- 2009.8.17 추가 end -->\r\n\r\n<table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t<tr>\r\n\t\t<td class=\"contborder_purple\">\t\t\t\t\t\t\t            \r\n\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td>\r\n\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t                    <td height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">년도 </td>\r\n\t\t\t                    <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">일반 점용료 </td>\r\n\t\t\t                    <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조정 점용료</td>\r\n\t\t\t                    <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">정기/수시</td>\r\n\t\t\t                    <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">차수</td>\r\n\t\t\t                    <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">구분</td>\r\n\t\t                    </tr>\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template28 = "\r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template29 = "\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template30 = "\r\n\t\t\t\t\t\t\t<tr onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\" \r\n\t\t\t\t\t\t\t\tonclick=\"javascript:goSumview('";
  private final static String _jspx_template31 = "','";
  private final static String _jspx_template32 = "');\" style=\"cursor:pointer\" >\r\n\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template33 = "\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template34 = "\r\n\t\t\t\t\t\t\t<tr onclick=\"javascript:goSumview('";
  private final static String _jspx_template35 = "','";
  private final static String _jspx_template36 = "');\" bgcolor=\"#f6f7f8\">\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template37 = "\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template38 = "\r\n\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t<td height=\"28\" align=\"center\">";
  private final static String _jspx_template39 = "</td>\r\n\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template40 = "</td>\r\n\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template41 = "</td>\r\n\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template42 = "</td>\r\n\t\t\t\t\t\t\t\t<td align=\"center\">\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template43 = "\r\n\t\t\t\t\t\t\t\t\t\t ";
  private final static String _jspx_template44 = " 차\t\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template45 = "\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template46 = "</td>\r\n\t\t\t\t\t\t\t</tr> \r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template47 = "\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"40\" align=\"center\">\r\n\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\">\r\n\t\t\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t\t\t\t\t\t    \t\t\t<tr>";
  private final static String _jspx_template48 = "</tr>\r\n\t\t\t\t\t\t\t    \t\t</table>\r\n\t\t\t\t\t\t\t    \t</td>\r\n\t\t                    \t</tr>\r\n\t\t                    </table>\r\n\t\t            \t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t                    <td height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">번호</td>\r\n\t\t\t\t                    <td height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">과세구분</td>\r\n\t\t\t\t                    <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용목적</td>\r\n\t\t\t\t                    <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">연장(개소)</td>\r\n\t\t\t\t                    <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">구분 </td>\t\t\t\t                    \r\n<!--\t\t\t                    <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">심도 </td>-->\r\n<!--\t\t\t                    <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">감액율</td>-->\r\n<!--\t\t\t                    <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">산출단가</td>-->\r\n\t\t\t                    \t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조정점용료</td>\r\n<!--\t\t\t                    <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">구분 </td>-->\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">산출여부 </td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">정기분<br>산출</td>\r\n\t\t\t                    \r\n\t\t                    </tr>\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template49 = "\r\n\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template50 = "\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template51 = "\r\n\t\t\t\t\t\t\t\t<tr onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\" \r\n\t\t\t\t\t\t\t\tonclick=\"javascript:goview('";
  private final static String _jspx_template52 = "','";
  private final static String _jspx_template53 = "','";
  private final static String _jspx_template54 = "');\" style=\"cursor:pointer\" >\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template55 = "\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template56 = "\r\n\t\t\t\t\t\t\t\t<tr onclick=\"javascript:goview('";
  private final static String _jspx_template57 = "','";
  private final static String _jspx_template58 = "','";
  private final static String _jspx_template59 = "');\" bgcolor=\"#f6f7f8\">\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template60 = "\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template61 = "\r\n\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\">";
  private final static String _jspx_template62 = "</td>\r\n<!--\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\">";
  private final static String _jspx_template63 = "-";
  private final static String _jspx_template64 = "</td>-->\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template65 = "\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template66 = "\r\n\t\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\">";
  private final static String _jspx_template67 = "년도 ";
  private final static String _jspx_template68 = " 차 ";
  private final static String _jspx_template69 = "분 </td>\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template70 = "\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template71 = "\r\n\t\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\">";
  private final static String _jspx_template72 = "년도 ";
  private final static String _jspx_template73 = "분 </td>\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template74 = "\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template75 = "\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template76 = " ";
  private final static String _jspx_template77 = "</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template78 = " m(개)</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template79 = "</td>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n<!--\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template80 = "</td>-->\r\n<!--\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template81 = "%</td>-->\r\n<!--\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template82 = "</td>-->\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template83 = "</td>\r\n<!--\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template84 = "</td>-->\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\"><font color=\"red\">\r\n\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template85 = "\r\n\t\t\t\t\t\t\t\t\t\t\t산출\r\n\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template86 = "\r\n\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template87 = "\r\n\t\t\t\t\t\t\t\t\t\t\t미산출\r\n\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template88 = "\r\n\t\t\t\t\t\t\t\t\t</font>\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\">\r\n\t\t\t\t\t\t\t\t\t<font color=\"red\">";
  private final static String _jspx_template89 = "</font>\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template90 = "\r\n\t\t\t\t\t\t\t</table></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"40\" align=\"center\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td align=\"center\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t\t\t\t\t\t    \t<tr>";
  private final static String _jspx_template91 = "</tr></table></td>\t\r\n\t\t                    </tr></table></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td class=\"sub_table_b\"> ※ 점용료 산출\r\n\t\t\t\t\t\t</td></tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t                    \t\t<td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">부과년도</td>\r\n\t\t                    \t\t<td width=\"42%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >";
  private final static String _jspx_template92 = " 년</td>                     \r\n\t\t\t\t\t\t\t\t\t<td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">공시지가</td>\r\n\t\t                    \t\t<td width=\"32%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >";
  private final static String _jspx_template93 = " 원                \r\n\t\t\t\t\t\t\t\t\t</td> \r\n\t\t                  \t\t</tr>\r\n\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t<tr>\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t<td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">연장(개소)</td>\r\n\t\t\t\t\t\t\t\t    <td width=\"40%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template94 = " m(개)\r\n\t\t\t\t\t\t\t\t\t</td> \r\n\t\t\t\t\t\t\t\t\t<td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">감액율</td>\r\n\t\t\t\t\t\t\t\t    <td width=\"26%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template95 = "%\r\n\t\t\t\t\t\t\t\t\t</td> \r\n\t\t\t\t\t\t\t    </tr>\t\t\t\t\t\t   \r\n\t\t\t\t\t\t\t    <tr>\r\n\t\t\t\t\t\t\t\t    <td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" >산출단가</td>\r\n\t\t\t\t\t\t\t\t    <td width=\"42%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template96 = "\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t    </tr>\r\n\t\t\t\t\t\t\t    <tr>\r\n\t\t\t\t                    <td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">산출기간</td>\r\n\t\t\t\t                    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >  ";
  private final static String _jspx_template97 = " ~ ";
  private final static String _jspx_template98 = " </td>  \r\n\t\t\t\t                    <td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">개월수</td>\r\n\t\t\t\t                    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >";
  private final static String _jspx_template99 = "\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t   \t<tr>\r\n\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조정 산출식</td>\r\n\t\t\t\t\t\t\t        <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >";
  private final static String _jspx_template100 = "\r\n\t\t\t\t\t\t\t\t\t</td> \r\n\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조정 점용료</td>\r\n\t\t\t\t\t\t\t        <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >";
  private final static String _jspx_template101 = "\r\n\t\t\t\t\t\t\t\t\t</td> \r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t<tr><td height=\"10\" colspan=\"4\"></td></tr>\r\n\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t    <tr>\r\n\t\t\t\t\t\t\t\t\t</td>  \r\n\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">부과일자</td>\r\n\t\t\t\t                    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >";
  private final static String _jspx_template102 = "\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">납기내기한</td>\r\n\t\t\t                    \t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" >";
  private final static String _jspx_template103 = "\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t</td>  \r\n\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">납기후일자</td>\r\n\t\t                    \t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" >";
  private final static String _jspx_template104 = "\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">납기후금액</td>\r\n\t                    \t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" >";
  private final static String _jspx_template105 = " 원\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t  \t\t</tr>\r\n\t\t\t                  \r\n\t\t                   \t\t<tr>\r\n\t\t                    \t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">기본 산출식</td>\r\n\t\t                    \t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" > ";
  private final static String _jspx_template106 = "</td>\r\n\t\t                    \t\t<td width=\"100'\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용료 합계</td>\r\n\t\t                    \t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" > ";
  private final static String _jspx_template107 = "</td>\r\n\t\t\t\t\t\t\t\t\t\r\n\t\t                  \t\t</tr> \r\n\t\t                  \r\n\t\t                  \t\t<tr>\r\n\t\t\t                \t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조정 산출식</td>\r\n\t\t                    \t\t<td colspan=\"3\"  bgcolor=\"eaeaea\" class=\"table_bl_left\" >";
  private final static String _jspx_template108 = "\r\n\t\t\t\t\t\t\t\t\t</td> \r\n\t\t                  \t\t</tr>\r\n\t\t\t\t                  \t\t\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t\r\n\t\t\t\t\t<tr>              \r\n\t\t\t\t\t\t<td height=\"40\" align=\"right\">\r\n\t\t\t\t\t\t\t<table border=\"0\" width=\"100%\">\r\n\t\t\t\t\t\t\t\t<tr>   \r\n\t\t\t\t\t\t\t\t\t<!--td>\r\n\t\t\t\t\t\t\t\t\t\t<input type=\"text\" NAME=\"YEAR\" ID=\"YEAR\"  >\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t< td onclick=\"javascript:goTempInsert()\">\r\n\t\t\t\t\t\t\t\t\t\t정기 산출 입력\r\n\t\t\t\t\t\t\t\t\t</td-->\r\n\t\t\t\t\t\t\t\t\t<td> \r\n\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template109 = " <!-- 정기분일때만 수정 가능 -->\r\n\t\t\t\t\t\t                <img src=\"/img/mod_icon.gif\" alt=\"수정\" border=\"0\" onclick=\"javascript:goModify('edit')\" style=\"cursor:pointer\" >\r\n\t\t\t\t\t                \t";
  private final static String _jspx_template110 = "\t\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t                <td width=\"50\">\r\n\t\t\t\t\t                \t<img src=\"/img/junggibun_calculation.gif\" alt=\"정기분 산출\" border=\"0\" onclick=\"javascript:goModify('add');\" style=\"cursor:pointer\">\r\n\t\t\t\t\t                </td>\r\n\t\t\t\t\t            </tr>\r\n\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t</table>\r\n\t\t\t</td>\r\n\t\t</tr>\t\t          \r\n\t</table>\r\n</form>\r\n\r\n\r\n\r\n</body>\r\n<script language=\"javascript\">\r\n\tfunction InitPage()\r\n\t{\r\n\t\tvar obj = document.productForm.message.value;\r\n\t\t\r\n\t\tif(obj != \"\")\t\r\n\t\t\talert(obj);\r\n\t\t\treturn;\r\n\t}\r\n</script>\r\n</html>\r\n\r\n";
}
