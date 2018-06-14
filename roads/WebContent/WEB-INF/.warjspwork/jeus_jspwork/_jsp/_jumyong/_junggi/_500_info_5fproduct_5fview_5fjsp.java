package jeus_jspwork._jsp._jumyong._junggi;

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
      // jsp code [from=(163,72);to=(163,80)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(173,45);to=(173,52)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${yearAdd}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(216,59);to=(216,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${message}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(217,40);to=(217,44)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mode}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(218,47);to=(218,55)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(219,38);to=(219,41)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${seq}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(221,39);to=(221,51)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(222,57);to=(222,72)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.TAX_YN }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(223,67);to=(223,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(246,85);to=(246,95)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PRICE_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(247,85);to=(247,95)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PRICE_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template50);
      // jsp code [from=(288,35);to=(288,42)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${pageing}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template51);
      // jsp code [from=(314,91);to=(314,101)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PRICE_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template52);
      // jsp code [from=(315,89);to=(315,99)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PRICE_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template53);
      // jsp code [from=(316,88);to=(316,98)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PRICE_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template54);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_1_fn(pageContext, null)) return;


      out.write(_jspx_template101);
      // jsp code [from=(407,79);to=(407,91)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template102);
      // ----  c:choose ---- invoke //
      if (_jspx_th_c_choose_3_fn(pageContext, null)) return;


      out.write(_jspx_template109);
      // jsp code [from=(423,73);to=(423,91)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.AREA_AFTER}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template110);
      // ----  c:choose ---- invoke //
      if (_jspx_th_c_choose_4_fn(pageContext, null)) return;


      out.write(_jspx_template118);
      // jsp code [from=(445,38);to=(445,68)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(product.FROMDATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_1));

      out.write(_jspx_template119);
      // jsp code [from=(449,38);to=(449,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(product.TODATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_1));

      out.write(_jspx_template120);
      // jsp code [from=(454,115);to=(454,125)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PRICE_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template121);
      // jsp code [from=(456,30);to=(456,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.SUM_LASTYEAR)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

      out.write(_jspx_template122);
      // jsp code [from=(464,84);to=(464,102)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.ADJUSTMENT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template123);
      // jsp code [from=(470,73);to=(470,89)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.TAX_DATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template124);
      // jsp code [from=(473,73);to=(473,87)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.INDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template125);
      // jsp code [from=(478,73);to=(478,89)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.OVERDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template126);
      // jsp code [from=(481,73);to=(481,107)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.OVERTAX)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

      out.write(_jspx_template127);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_4_fn(pageContext, null)) return;


      out.write(_jspx_template130);
      // jsp code [from=(493,74);to=(493,86)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.FORM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template131);
      // jsp code [from=(495,98);to=(495,108)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PRICE_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template132);
      // jsp code [from=(497,29);to=(497,64)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.SUM_YEAR)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

      out.write(_jspx_template133);
      // jsp code [from=(503,73);to=(503,92)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.FORM_ADJUST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template134);
      // jsp code [from=(505,97);to=(505,107)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PRICE_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template135);
      // jsp code [from=(506,73);to=(506,110)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.SUM_ADJUST)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

      out.write(_jspx_template136);
      // jsp code [from=(511,72);to=(511,98)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.OLD_PERCENT_REASON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template137);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_5_fn(pageContext, null)) return;


      out.write(_jspx_template138);
      // jsp code [from=(520,72);to=(520,100)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.OLD_REDUCTION_REASON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template139);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_6_fn(pageContext, null)) return;


      out.write(_jspx_template140);
      // jsp code [from=(530,61);to=(530,83)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.REDUCTION_FORM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template141);
      // jsp code [from=(533,100);to=(533,110)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PRICE_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template142);
      // jsp code [from=(534,61);to=(534,101)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.REDUCTION_SUM)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

      out.write(_jspx_template143);
      // jsp code [from=(541,73);to=(541,103)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.VAT)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

      out.write(_jspx_template144);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_7_fn(pageContext, null)) return;


      out.write(_jspx_template153);
      // jsp code [from=(559,134);to=(559,142)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template154);
      // jsp code [from=(559,148);to=(559,151)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${seq}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template155);
      // jsp code [from=(559,157);to=(559,168)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template156);
      // jsp code [from=(559,174);to=(559,186)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${countPerPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template157);
      // jsp code [from=(559,192);to=(559,196)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${year}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template158);
      // jsp code [from=(559,208);to=(559,217)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${listSize }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template159);
      // jsp code [from=(559,223);to=(559,231)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${sum_seq }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template160);

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
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${cal_sum_infoList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("board");
    _jspx_th_c_forEach_0.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template21);
            // ----  c:choose ---- invoke //
            if (_jspx_th_c_choose_0_fn(pageContext, _jspx_th_c_forEach_0)) return true;


            out.write(_jspx_template41);
            // jsp code [from=(268,54);to=(268,64)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template42);
            // jsp code [from=(269,45);to=(269,55)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.AREA}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template43);
            // jsp code [from=(270,45);to=(270,81)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(board.SUM_ADJUST) }",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template44);
            // jsp code [from=(271,45);to=(271,84)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(board.REDUCTION_SUM) }",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template45);
            // jsp code [from=(272,45);to=(272,63)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PERCENT_RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template46);
            // jsp code [from=(273,45);to=(273,65)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.REDUCTION_RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template47);
            // jsp code [from=(274,45);to=(274,63)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TAX_SET_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template48);
            // jsp code [from=(275,45);to=(275,66)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.USE_SECTIONNAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template49);

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
    _jspx_th_c_forEach_1.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ImpositionInfoByCalSumList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_1.setVar("board");
    _jspx_th_c_forEach_1.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
        if (_jspx_eval_c_forEach_1 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template55);
            // ----  c:choose ---- invoke //
            if (_jspx_th_c_choose_1_fn(pageContext, _jspx_th_c_forEach_1)) return true;


            out.write(_jspx_template77);
            // jsp code [from=(333,67);to=(333,77)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template78);
            // jsp code [from=(334,63);to=(334,79)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.AREA_AFTER}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template79);
            // ----  c:choose ---- invoke //
            if (_jspx_th_c_choose_2_fn(pageContext, _jspx_th_c_forEach_1)) return true;


            out.write(_jspx_template87);
            // jsp code [from=(345,51);to=(345,79)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(board.FROMDATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_1));

            out.write(_jspx_template88);
            // jsp code [from=(345,83);to=(345,109)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(board.TODATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_1));

            out.write(_jspx_template89);
            // jsp code [from=(346,51);to=(346,89)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(board.SUM_LASTYEAR) }",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template90);
            // jsp code [from=(347,51);to=(347,85)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(board.SUM_YEAR) }",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template91);
            // jsp code [from=(348,51);to=(348,87)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(board.SUM_ADJUST) }",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template92);
            // ----  c:if ---- invoke //
            if (_jspx_th_c_if_0_fn(pageContext, _jspx_th_c_forEach_1)) return true;


            out.write(_jspx_template94);
            // ----  c:if ---- invoke //
            if (_jspx_th_c_if_1_fn(pageContext, _jspx_th_c_forEach_1)) return true;


            out.write(_jspx_template96);
            // ----  c:if ---- invoke //
            if (_jspx_th_c_if_2_fn(pageContext, _jspx_th_c_forEach_1)) return true;


            out.write(_jspx_template98);
            // ----  c:if ---- invoke //
            if (_jspx_th_c_if_3_fn(pageContext, _jspx_th_c_forEach_1)) return true;


            out.write(_jspx_template100);

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

  private boolean _jspx_th_c_choose_3_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:choose ---- //
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_3 = new org.apache.taglibs.standard.tag.common.core.ChooseTag();
    _jspx_th_c_choose_3.setPageContext(pageContext);
    try {
      int _jspx_eval_c_choose_3 = _jspx_th_c_choose_3.doStartTag();
      if (_jspx_eval_c_choose_3 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template103);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_3_fn(pageContext, _jspx_th_c_choose_3)) return true;


          out.write(_jspx_template106);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_3_fn(pageContext, _jspx_th_c_choose_3)) return true;


          out.write(_jspx_template108);

        } while (_jspx_th_c_choose_3.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_choose_3.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_choose_3.release();
    }
    return false;
  }

  private boolean _jspx_th_c_choose_4_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:choose ---- //
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_4 = new org.apache.taglibs.standard.tag.common.core.ChooseTag();
    _jspx_th_c_choose_4.setPageContext(pageContext);
    try {
      int _jspx_eval_c_choose_4 = _jspx_th_c_choose_4.doStartTag();
      if (_jspx_eval_c_choose_4 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template111);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_4_fn(pageContext, _jspx_th_c_choose_4)) return true;


          out.write(_jspx_template114);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_4_fn(pageContext, _jspx_th_c_choose_4)) return true;


          out.write(_jspx_template117);

        } while (_jspx_th_c_choose_4.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_choose_4.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_choose_4.release();
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
    _jspx_th_c_if_4.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.SECTION == '3'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
      if (_jspx_eval_c_if_4 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template128);
          // jsp code [from=(487,84);to=(487,107)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.SURCHARGE_RATE }",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template129);

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
    _jspx_th_c_if_5.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.OLD_PERCENT_RATE != '0' }", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
      if (_jspx_eval_c_if_5 != Tag.SKIP_BODY) {
        do {
          // jsp code [from=(515,79);to=(515,103)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.OLD_PERCENT_RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));


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
    _jspx_th_c_if_6.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.OLD_REDUCTION_RATE != '0' }", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
      if (_jspx_eval_c_if_6 != Tag.SKIP_BODY) {
        do {
          // jsp code [from=(524,81);to=(524,107)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.OLD_REDUCTION_RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));


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
    _jspx_th_c_if_7.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.TAX_GUBUN == '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_7 = _jspx_th_c_if_7.doStartTag();
      if (_jspx_eval_c_if_7 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template145);
          // jsp code [from=(555,136);to=(555,144)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template146);
          // jsp code [from=(555,150);to=(555,153)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${seq}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template147);
          // jsp code [from=(555,159);to=(555,170)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template148);
          // jsp code [from=(555,176);to=(555,188)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${countPerPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template149);
          // jsp code [from=(555,194);to=(555,206)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template150);
          // jsp code [from=(555,219);to=(555,228)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${listSize }",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template151);
          // jsp code [from=(555,234);to=(555,242)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${sum_seq }",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template152);

        } while (_jspx_th_c_if_7.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_7.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_7.release();
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
          out.write(_jspx_template22);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template31);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template40);

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
          out.write(_jspx_template56);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_1_fn(pageContext, _jspx_th_c_choose_1)) return true;


          out.write(_jspx_template66);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_1_fn(pageContext, _jspx_th_c_choose_1)) return true;


          out.write(_jspx_template76);

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
          out.write(_jspx_template80);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_2_fn(pageContext, _jspx_th_c_choose_2)) return true;


          out.write(_jspx_template83);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_2_fn(pageContext, _jspx_th_c_choose_2)) return true;


          out.write(_jspx_template86);

        } while (_jspx_th_c_choose_2.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_choose_2.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_choose_2.release();
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.CAL_STATUS == null}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template93);

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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.CAL_STATUS != null}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
      if (_jspx_eval_c_if_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template95);

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
    _jspx_th_c_if_2.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.TAX_YN == '0'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
      if (_jspx_eval_c_if_2 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template97);

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
    _jspx_th_c_if_3.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.TAX_YN == '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
      if (_jspx_eval_c_if_3 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template99);

        } while (_jspx_th_c_if_3.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_3.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_3.release();
    }
    return false;
  }

  private boolean _jspx_th_c_when_3_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:when ---- //
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_3 = new org.apache.taglibs.standard.tag.rt.core.WhenTag();
    _jspx_th_c_when_3.setPageContext(pageContext);
    _jspx_th_c_when_3.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_when_3.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.CHECK_YN != '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_3 = _jspx_th_c_when_3.doStartTag();
      if (_jspx_eval_c_when_3 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template104);
          // jsp code [from=(412,86);to=(412,118)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.PRICE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

          out.write(_jspx_template105);

        } while (_jspx_th_c_when_3.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_when_3.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_when_3.release();
    }
    return false;
  }

  private boolean _jspx_th_c_otherwise_3_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:otherwise ---- //
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_3 = new org.apache.taglibs.standard.tag.common.core.OtherwiseTag();
    _jspx_th_c_otherwise_3.setPageContext(pageContext);
    _jspx_th_c_otherwise_3.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    try {
      int _jspx_eval_c_otherwise_3 = _jspx_th_c_otherwise_3.doStartTag();
      if (_jspx_eval_c_otherwise_3 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template107);

        } while (_jspx_th_c_otherwise_3.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_otherwise_3.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_otherwise_3.release();
    }
    return false;
  }

  private boolean _jspx_th_c_when_4_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:when ---- //
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_4 = new org.apache.taglibs.standard.tag.rt.core.WhenTag();
    _jspx_th_c_when_4.setPageContext(pageContext);
    _jspx_th_c_when_4.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_when_4.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.CHECK_YN == '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_4 = _jspx_th_c_when_4.doStartTag();
      if (_jspx_eval_c_when_4 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template112);
          // jsp code [from=(429,16);to=(429,48)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.MOMEY)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

          out.write(_jspx_template113);

        } while (_jspx_th_c_when_4.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_when_4.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_when_4.release();
    }
    return false;
  }

  private boolean _jspx_th_c_otherwise_4_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:otherwise ---- //
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_4 = new org.apache.taglibs.standard.tag.common.core.OtherwiseTag();
    _jspx_th_c_otherwise_4.setPageContext(pageContext);
    _jspx_th_c_otherwise_4.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    try {
      int _jspx_eval_c_otherwise_4 = _jspx_th_c_otherwise_4.doStartTag();
      if (_jspx_eval_c_otherwise_4 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template115);
          // jsp code [from=(432,16);to=(432,29)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.YOYUL}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template116);

        } while (_jspx_th_c_otherwise_4.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_otherwise_4.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_otherwise_4.release();
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
    _jspx_th_c_when_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SEQ != sum_seq }", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
      if (_jspx_eval_c_when_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template23);
          // jsp code [from=(260,54);to=(260,62)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template24);
          // jsp code [from=(260,68);to=(260,77)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template25);
          // jsp code [from=(260,86);to=(260,97)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template26);
          // jsp code [from=(260,103);to=(260,115)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${countPerPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template27);
          // jsp code [from=(260,121);to=(260,131)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template28);
          // jsp code [from=(260,137);to=(260,154)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.USE_SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template29);
          // jsp code [from=(260,160);to=(260,177)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SUM_ADJUST }",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template30);

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
          out.write(_jspx_template32);
          // jsp code [from=(263,45);to=(263,53)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template33);
          // jsp code [from=(263,59);to=(263,68)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template34);
          // jsp code [from=(263,77);to=(263,88)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template35);
          // jsp code [from=(263,94);to=(263,106)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${countPerPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template36);
          // jsp code [from=(263,112);to=(263,122)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template37);
          // jsp code [from=(263,128);to=(263,145)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.USE_SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template38);
          // jsp code [from=(263,151);to=(263,168)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SUM_ADJUST }",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template39);

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
    _jspx_th_c_when_1.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SEQ != seq }", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
      if (_jspx_eval_c_when_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template57);
          // jsp code [from=(326,51);to=(326,59)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template58);
          // jsp code [from=(326,65);to=(326,72)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${sum_seq}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template59);
          // jsp code [from=(326,77);to=(326,86)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template60);
          // jsp code [from=(326,91);to=(326,102)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template61);
          // jsp code [from=(326,108);to=(326,120)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${countPerPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template62);
          // jsp code [from=(326,126);to=(326,136)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template63);
          // jsp code [from=(326,142);to=(326,159)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.USE_SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template64);
          // jsp code [from=(326,165);to=(326,182)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SUM_ADJUST }",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template65);

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
          out.write(_jspx_template67);
          // jsp code [from=(329,45);to=(329,53)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template68);
          // jsp code [from=(329,59);to=(329,66)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${sum_seq}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template69);
          // jsp code [from=(329,71);to=(329,80)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template70);
          // jsp code [from=(329,85);to=(329,96)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template71);
          // jsp code [from=(329,102);to=(329,114)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${countPerPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template72);
          // jsp code [from=(329,120);to=(329,130)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template73);
          // jsp code [from=(329,136);to=(329,153)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.USE_SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template74);
          // jsp code [from=(329,159);to=(329,176)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SUM_ADJUST }",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template75);

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
    _jspx_th_c_when_2.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.CHECK_YN == '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_2 = _jspx_th_c_when_2.doStartTag();
      if (_jspx_eval_c_when_2 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template81);
          // jsp code [from=(338,16);to=(338,48)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.MOMEY)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

          out.write(_jspx_template82);

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
          out.write(_jspx_template84);
          // jsp code [from=(341,16);to=(341,29)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.YOYUL}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template85);

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
  private final static String _jspx_template9 = " \r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n<script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script> \r\n<script language=\"javascript\" src=\"/js/Ajax_request.js\"></script>\r\n<script>\r\n\r\n\tfunction\tPage(page)\r\n\t{\r\n\t\tif(page\t==\t\"\")\r\n\t\t\treturn;\r\n\t\t\r\n\t\tvar form = document.productForm;\r\n\t\tform.currentPage.value\t= page;\r\n\t\tform.action = \"/jumyong/junggi/junggi_view.do\";\r\n\t\tform.submit();\r\n\t}\r\n\t\r\n\t\r\n\t\r\n\t\r\n\t//[ , ] 삭제\r\n\tfunction removeComma2(numValue)\r\n\t{\r\n\t\tnum = document.getElementById(numValue).value;\r\n\t\tdocument.getElementById(numValue).value = Number(num.split(',').join(\"\"));\r\n\t}\r\n\t\r\n\t\r\n\tfunction removeComma(numValue)\r\n\t{\r\n\t\treturn Number(numValue.split(',').join(\"\"));\r\n\t}\r\n\t\r\n\t\r\n\tfunction fn_addComma(chknum){\r\n        num = chknum.value;\r\n        num = num.split(',').join('');\r\n        var arr = num.split('.');\r\n        var num = new Array();\r\n        for (i = 0; i <= arr[0].length-1; i++) {\r\n            num[i] = arr[0].substr(arr[0].length-1-i,1);\r\n        if(i%3 == 0 && i != 0) num[i] += ',';\r\n        }\r\n        num = num.reverse().join('');\r\n        if (!arr[1]) chknum.value = num; else chknum.value = num+'.'+arr[1];\r\n\r\n\t} \r\n\t\r\n\t\r\n\t\r\n\t// 콤마 삽입\r\n\tfunction insertComma(val1)\r\n\t{\r\n\t\r\n\t\tvalue1 = document.getElementById(val1).value;\r\n\t\t\r\n\t\tvar length1 = value1.length;\r\n\t\tvar divideNum = length1%3;\r\n\t\tvar returnValue2 =\"\";\r\n\t\t\r\n\t\tif(divideNum != 0)\r\n\t\t{\r\n\t\t\treturnValue2 = value1.substr(0,divideNum)+\",\";\r\n\t\t}\r\n\t\t\r\n\t\tif(length1 >3)\r\n\t\t{\r\n\t\t\twhile(true)\r\n\t\t\t{\r\n\t\t\t\treturnValue2 = returnValue2 + value1.substr(divideNum,3)+\",\";\r\n\t\t\t\t\r\n\t\t\t\tdivideNum = divideNum+3;\r\n\t\t\t\tif(length1 <= divideNum)\r\n\t\t\t\tbreak;\r\n\t\t\t}\r\n\t\t}\r\n\t\t\r\n\t\tif(returnValue2 == \"\")\r\n\t\t\treturnValue2 = value1;\r\n\t\telse\r\n\t\t\treturnValue2 = returnValue2.substr(0,returnValue2.length - 1);\r\n\r\n\t\tdocument.getElementById(val1).value = returnValue2;\r\n\t}\r\n\t\r\n\t\r\n\t\t// 콤마 삽입 - 반환\r\n\tfunction insertComma2(value1)\r\n\t{\r\n\t\tvalue1 = value1+\"\";\r\n\t\t\r\n\t\tvar length1 = value1.length;\r\n\t\tvar divideNum = length1%3;\r\n\t\tvar returnValue2 =\"\";\r\n\t\t\r\n\t\tif(divideNum != 0)\r\n\t\t{\r\n\t\t\treturnValue2 = value1.substr(0,divideNum)+\",\";\r\n\t\t}\r\n\t\t\r\n\t\tif(length1 >3)\r\n\t\t{\r\n\t\t\twhile(true)\r\n\t\t\t{\r\n\t\t\t\treturnValue2 = returnValue2 + value1.substr(divideNum,3)+\",\";\r\n\t\t\t\t\r\n\t\t\t\tdivideNum = divideNum+3;\r\n\t\t\t\tif(length1 <= divideNum)\r\n\t\t\t\t\tbreak;\r\n\t\t\t}\r\n\t\t}\r\n\t\t\r\n\t\tif(returnValue2 == \"\")\r\n\t\t\treturnValue2 = value1;\r\n\t\telse\r\n\t\t\treturnValue2 = returnValue2.substr(0,returnValue2.length - 1);\r\n\r\n\t\treturn returnValue2;\r\n\t}\r\n\t\r\n\t\r\n\t\r\n\t//view 화면 이동\r\n\tfunction goView(adminNo,sum_seq,seq,currentPage,countPage,year,usesection,modeCheck)\r\n\t{\r\n\t\tif( modeCheck == '0' ){\r\n\t\t\t//location.href(\"/jumyong/junggi/junggi_view.do?ADMIN_NO=\"+adminNo+\"&seq=\"+seq+\"&sum_seq=\"+sum_seq+\"&currentPage=\"+currentPage+\"&year=\"+year+\"&usesectoin=\"+usesection);\r\n\t\t\tlocation.href(\"/jumyong/junggi/junggi_product.do?ADMIN_NO=\"+adminNo+\"&SEQ=\"+seq+\"&sum_seq=\"+sum_seq+\"&currentPage=\"+currentPage+\"&year=\"+year+\"&mode=add\");\r\n\t\t}\r\n\t\telse{\r\n\t\t\tlocation.href(\"/jumyong/junggi/junggi_view.do?ADMIN_NO=\"+adminNo+\"&seq=\"+seq+\"&sum_seq=\"+sum_seq+\"&currentPage=\"+currentPage+\"&year=\"+year+\"&usesectoin=\"+usesection);\r\n\t\t}\r\n\t}\r\n\t\r\n\r\n\t\r\n\t function openwin(){\r\n\t \r\n\t\tvar year = document.getElementById(\"year1\").value;\r\n\t\t\r\n\t\tyear = Number(year)- Number(1);\r\n\t\t\r\n\r\n\t \r\n\t \tvar x= \"dialogwidth:700px;dialogHeight:600px;status:no;help:no\";\r\n  \r\n\t\twindow.showModalDialog(\"/jumyong/junggi/productAddList.do?ADMIN_NO=";
  private final static String _jspx_template10 = "&year=\"+year+\"&gourl=\"+\"/jumyong/junggi/productAddList.do\", window,x);\r\n\t\t\t\r\n    }\r\n\t\r\n\t\r\n\t//edit 화면 이동\r\n\tfunction goModify(adminNo,seq,currentPage,countPage,year,mode,cnt,sum_seq)\r\n\t{\r\n\t\t\r\n\t\tif( mode == 'add' ){\r\n\t\t\tif( document.productForm.YEAR.value > '";
  private final static String _jspx_template11 = "' ){\r\n\t\t\t\talert(\"정기분 산출은 다음년도만 부과 가능합니다. 확인해주세요. \");\t\t\t\r\n\t\t\t\treturn;\r\n\t\t\t}\r\n\t\t}\r\n\t\tif( mode == 'edit' ){\r\n\t\t\tif( document.productForm.TAX_YN.value == '1' ) {\r\n\t\t\t\talert(\"이미 부과된 정기분은 수정 불가합니다. 확인해주세요.\");\r\n\t\t\t\treturn;\r\n\t\t\t}\r\n\t\t}\r\n\t\tif( cnt < 2){\r\n\t\t\tlocation.href(\"/jumyong/junggi/junggi_product.do?ADMIN_NO=\"+adminNo+\"&SEQ=\"+seq+\"&currentPage=\"+currentPage+\"&year=\"+year+\"&mode=\"+mode+\"&sum_seq=\"+sum_seq);\r\n\t\t}\r\n\t\t// 여러개일 경우 \r\n\t\telse{\r\n\t\t\tlocation.href(\"/jumyong/junggi/junggi_product.do?ADMIN_NO=\"+adminNo+\"&SEQ=\"+seq+\"&currentPage=\"+currentPage+\"&year=\"+year+\"&mode=\"+mode+\"&sum_seq=\"+sum_seq);\r\n\t\t\t//location.href(\"/jumyong/junggi/junggi_product_multi.do?ADMIN_NO=\"+adminNo+\"&SEQ=\"+seq+\"&currentPage=\"+currentPage+\"&year=\"+year+\"&mode=\"+mode);\r\n\t\t}\r\n\t}\r\n\t\r\n\tfunction goTempInsert()\r\n\t{\r\n\t\r\n\t\tvar admin_no = document.getElementById(\"ADMIN_NO\").value;\r\n\t\t\r\n\t\tvar year = document.getElementById(\"YEAR\").value;\r\n\t\tif(year == '')\r\n\t\t\talert(\"연도를 넣어주세요\");\r\n\t\telse\r\n\t\t \tlocation.href(\"/jumyong/junggi/product_temp_insert.do?admin_no=\"+admin_no+\"&year=\"+year);\t\r\n\t\t\r\n\t}\r\n\t\r\n\t\r\n</script>\r\n\r\n</head>\r\n\r\n<body onload=\"javascript:InitPage();\"  border=\"0\">\r\n\r\n\r\n<form id=\"productForm\" name=\"productForm\" method=\"post\" action = \"/jumyong/junggi/junggi_view.do\" >\r\n<input type=\"hidden\" id=\"message\" name=\"message\" value=\"";
  private final static String _jspx_template12 = "\">\r\n<input id=\"mode\" name=\"mode\"  value=\"";
  private final static String _jspx_template13 = "\" type=\"hidden\" >\t\t\t\t\t\t\r\n<input id=\"ADMIN_NO\" name=\"ADMIN_NO\" value=\"";
  private final static String _jspx_template14 = "\" type=\"hidden\" >\r\n<input id=\"SEQ\" name=\"SEQ\"  value=\"";
  private final static String _jspx_template15 = "\" type=\"hidden\" >\r\n<input id=\"RATE1\" name=\"RATE1\" type=\"hidden\"  value=\"\" >\r\n<input id=\"YEAR\" name=\"YEAR\" value=\"";
  private final static String _jspx_template16 = "\" type=\"hidden\" >\r\n<input id=\"TAX_YN\" name=\"TAX_YN\" type=\"hidden\" value=\"";
  private final static String _jspx_template17 = "\">\r\n<input id=\"currentPage\" name=\"currentPage\" type=\"hidden\" value=\"";
  private final static String _jspx_template18 = "\">\r\n\t<tr>\r\n\t\t<td>\r\n\t\t        \r\n\t\t\t<table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t<tr>\r\n\t\t        \t<td class=\"contborder_purple\">\t\t\r\n\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t    \t<table width=\"100%\" border=\"0\"  cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td width=\"10%\" height=\"26\" align=\"left\"  class=\"sub_table_b\">* 산출 정보 리스트</td>\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t    \t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t\t\t\t\t        \t<tr>\r\n\t\t\t\t\t\t\t            \t<td height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">산출년도</td>\r\n\t\t\t\t\t\t\t                <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">면적</td>\r\n\t\t\t\t\t\t\t                <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조정 ";
  private final static String _jspx_template19 = "</td>\r\n\t\t\t\t\t\t\t                <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">최종 ";
  private final static String _jspx_template20 = "</td>\r\n\t\t\t\t\t\t\t                <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">지분율 </td>\r\n\t\t\t\t\t\t\t                <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">감면율 </td>\r\n\t\t\t\t\t\t\t                <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\"> 세입구분 </td>\r\n\t\t\t\t\t\t\t                <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\"> 과세 구분 </td>\t\t\t\t\t\t\t                    \t\t\t\t\t\t\t                    \r\n\t\t\t\t\t\t\t            </tr>\r\n\t\t\t\t\t\t\t                    \r\n\t\t\t\t\t\t\t                    \r\n\t\t\t\t\t\t\t            ";
  private final static String _jspx_template21 = "\r\n\t\t\t\t\t\t\t                  \r\n\t\t\t\t\t\t\t\t        ";
  private final static String _jspx_template22 = "\r\n\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template23 = "\r\n\t\t\t\t\t\t\t\t\t\t<tr onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\" \r\n\t\t\t\t\t\t\t                onclick=\"javascript:goView('";
  private final static String _jspx_template24 = "','";
  private final static String _jspx_template25 = "','','";
  private final static String _jspx_template26 = "','";
  private final static String _jspx_template27 = "','";
  private final static String _jspx_template28 = "','";
  private final static String _jspx_template29 = "','";
  private final static String _jspx_template30 = "');\" style=\"cursor:pointer\" >\r\n\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template31 = "\r\n\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template32 = "\r\n\t\t\t\t\t\t\t\t\t\t<tr onclick=\"javascript:goView('";
  private final static String _jspx_template33 = "','";
  private final static String _jspx_template34 = "','','";
  private final static String _jspx_template35 = "','";
  private final static String _jspx_template36 = "','";
  private final static String _jspx_template37 = "','";
  private final static String _jspx_template38 = "','";
  private final static String _jspx_template39 = "');\" bgcolor=\"#f6f7f8\">\r\n\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template40 = "\r\n\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template41 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t                      \r\n\t\t\t\t\t\t\t            \t<td height=\"26\" align=\"center\">";
  private final static String _jspx_template42 = "</td>\r\n\t\t\t\t\t\t\t                <td align=\"center\">";
  private final static String _jspx_template43 = "</td>\r\n\t\t\t\t\t\t\t                <td align=\"center\">";
  private final static String _jspx_template44 = "</td>\r\n\t\t\t\t\t\t\t                <td align=\"center\">";
  private final static String _jspx_template45 = "</td>\r\n\t\t\t\t\t\t\t                <td align=\"center\">";
  private final static String _jspx_template46 = "%</td>\r\n\t\t\t\t\t\t\t                <td align=\"center\">";
  private final static String _jspx_template47 = "%</td>\r\n\t\t\t\t\t\t\t                <td align=\"center\">";
  private final static String _jspx_template48 = "</td>\t\t\t\t\t\t\t                        \t\t\t\t\t\t\t                        \r\n\t\t\t\t\t\t\t                <td align=\"center\">";
  private final static String _jspx_template49 = "</td>\r\n\t\t\t\t\t\t\t            </tr> \r\n\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template50 = "\r\n\t\t\t\t\t\t\t        </table>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"40\" align=\"center\">\r\n\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t    \t\t<tr>\r\n\t\t\t\t\t\t\t            \t<td align=\"center\">\r\n\t\t\t\t\t\t\t            \t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t\t\t\t\t\t                    \t<tr>\r\n\t\t\t\t\t\t\t                        \t";
  private final static String _jspx_template51 = "\r\n\t\t\t\t\t\t\t                        </tr>\t\t\t\t\t\t\t                        \r\n\t\t\t\t\t\t\t                    </table>\r\n\t\t\t\t\t\t\t                </td>\r\n\t\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t   \t\t</table>\r\n\t\t\t\t\t\t\t   \t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t    \t<table width=\"100%\" border=\"0\"  cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td width=\"10%\" height=\"26\" align=\"left\"  class=\"sub_table_b\">* 년도별 산출 내역</td>\t\t\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t</table>\t\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t    \t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t\t\t\t\t        \t<tr>\r\n<!--\t\t\t\t\t\t\t            \t<td height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">산출년도</td>-->\r\n\t\t\t\t\t\t                    <td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">면적</td>\r\n\t\t\t\t\t\t                    <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">요율(단가)</td>\r\n\t\t\t\t\t\t                    <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">산출기간</td>\r\n\t\t\t\t\t\t                    <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">전년 연간 ";
  private final static String _jspx_template52 = "</td>\r\n\t\t\t\t\t\t                    <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">현년도 ";
  private final static String _jspx_template53 = "</td>\r\n\t\t\t\t\t\t                    <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조정 ";
  private final static String _jspx_template54 = "</td>\r\n\t\t\t\t\t\t                    <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">부과 여부 </td>\r\n\t\t\t\t\t                    </tr>\r\n\t\t\t\t\t\t\t                    \r\n\t\t\t\t\t\t\t                    \r\n\t\t\t\t\t\t\t         \t";
  private final static String _jspx_template55 = "\r\n\t\t\t\t\t\t\t                        \r\n\t\t\t\t\t\t\t         \t";
  private final static String _jspx_template56 = "\r\n\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template57 = "\r\n\t\t\t\t\t\t\t\t\t\t<tr onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\" \r\n\t\t\t\t\t\t\t            \tonclick=\"javascript:goView('";
  private final static String _jspx_template58 = "','";
  private final static String _jspx_template59 = "',";
  private final static String _jspx_template60 = ",'";
  private final static String _jspx_template61 = "','";
  private final static String _jspx_template62 = "','";
  private final static String _jspx_template63 = "','";
  private final static String _jspx_template64 = "','";
  private final static String _jspx_template65 = "');\" style=\"cursor:pointer\" >\r\n\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template66 = "\r\n\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template67 = "\r\n\t\t\t\t\t\t\t\t\t\t<tr onclick=\"javascript:goView('";
  private final static String _jspx_template68 = "','";
  private final static String _jspx_template69 = "',";
  private final static String _jspx_template70 = ",'";
  private final static String _jspx_template71 = "','";
  private final static String _jspx_template72 = "','";
  private final static String _jspx_template73 = "','";
  private final static String _jspx_template74 = "','";
  private final static String _jspx_template75 = "');\" bgcolor=\"#f6f7f8\">\r\n\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template76 = "\r\n\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template77 = "\r\n\t\t\t\t\t\t\t                        \r\n<!--\t\t\t\t\t                        <td height=\"26\" align=\"center\">";
  private final static String _jspx_template78 = "</td>-->\r\n\t\t\t\t\t                        <td height=\"26\" align=\"center\">";
  private final static String _jspx_template79 = "</td>\r\n\t\t\t\t\t                        <td align=\"center\">\r\n\t\t\t\t\t                        \t";
  private final static String _jspx_template80 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template81 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template82 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template83 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template84 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template85 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template86 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template87 = "\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t                        <td align=\"center\">";
  private final static String _jspx_template88 = "~";
  private final static String _jspx_template89 = "</td>\r\n\t\t\t\t\t                        <td align=\"center\">";
  private final static String _jspx_template90 = "</td>\r\n\t\t\t\t\t                        <td align=\"center\">";
  private final static String _jspx_template91 = "</td>\r\n\t\t\t\t\t                        <td align=\"center\">";
  private final static String _jspx_template92 = "</td>\r\n\t\t\t\t\t                        <td align=\"center\"><font color=\"red\">\r\n\t\t\t\t\t                       \r\n\t\t\t\t\t                        <!--";
  private final static String _jspx_template93 = "\r\n\t\t\t\t\t                        \t미산출\r\n\t\t\t\t\t\t\t\t            ";
  private final static String _jspx_template94 = "\t\r\n\t\t\t\t\t                        ";
  private final static String _jspx_template95 = "\r\n\t\t\t\t\t                        \t산출\r\n\t\t\t\t\t\t\t\t            ";
  private final static String _jspx_template96 = "\t-->\r\n\t\t\t\t\t\t\t\t\t\t            \r\n\t\t\t\t\t\t\t\t            ";
  private final static String _jspx_template97 = "\r\n\t\t\t\t\t                        \t미부과\r\n\t\t\t\t\t\t\t\t            ";
  private final static String _jspx_template98 = "\t\r\n\t\t\t\t\t                        ";
  private final static String _jspx_template99 = "\r\n\t\t\t\t\t                        \t부과\r\n\t\t\t\t\t\t\t\t            ";
  private final static String _jspx_template100 = "\r\n\t\t\t\t\t                        \r\n\t\t\t\t\t                        </font>\r\n\t\t\t\t\t                        </td>\t\t\t\t\t\t\t                        \r\n\t\t\t\t\t                        \r\n\t\t\t\t\t\t\t\t\t\t</tr> \r\n\t\t\t\t\t\t\t\t\t  \t";
  private final static String _jspx_template101 = "\r\n\t\t\t\t\t\t\t      \t</table>\r\n\t\t\t\t\t\t\t    </td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"40\" align=\"center\">\r\n\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t        \t<tr>\r\n\t\t\t\t\t\t\t            \t<td align=\"center\">\r\n\t\t\t\t\t\t\t            \t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t\t\t\t\t\t                    \t<tr>\r\n\t\t\t\t\t\t\t                        <!-- 페이징 삭제 strPageDivideForm-->\r\n\t\t\t\t\t\t\t                        </tr>\r\n\t\t\t\t\t\t\t              \t\t</table>\r\n\t\t\t\t\t\t\t              \t</td>\r\n\t\t\t\t\t\t\t         \t</tr>\t\t\t\t\t\t\t                   \r\n\t\t\t\t\t\t    \t\t</table>\r\n\t\t\t\t\t\t    \t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t              \r\n\t\t\t\t\t\t</table>\t\r\n\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t<div id=\"view\" style=\"width:100%;\">\r\n       \t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t              \t\t<tr>\r\n\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t    \t<table width=\"100%\" border=\"0\"  cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td width=\"10%\" height=\"26\" align=\"left\"  class=\"sub_table_b\">* 세부 내역</td>\t\t\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t</table>\t\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t    \t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t\t\t\t\t        \t<tr>\r\n\t\t\t\t\t\t\t            \t<td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">산출년도</td>\r\n\t\t\t\t\t\t\t            \t<td width=\"42%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >";
  private final static String _jspx_template102 = " 년</td>\r\n\t\t\t\t\t\t\t                    \t\t\r\n\t\t\t\t                    \t\t";
  private final static String _jspx_template103 = "\r\n\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template104 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">공시지가</td>\r\n\t\t\t\t                    \t\t\t<td width=\"32%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >";
  private final static String _jspx_template105 = " 원 </td>\r\n\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template106 = "\r\n\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template107 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\"></td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"32%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" ></td>\r\n\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template108 = "\r\n\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template109 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t \r\n\t\t\t\t                  \t\t</tr>\r\n\t\t\t\t                  \t\t<tr>\r\n\t\t\t\t                    \t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용면적</td>\r\n\t\t\t\t                    \t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" >";
  private final static String _jspx_template110 = "㎡\r\n\t\t\t\t\t\t\t\t\t\t\t</td>                     \r\n\t\t\t\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">요율(단가)</td>\r\n\t\t\t\t                    \t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\t\t\t\t                    \t\t\t";
  private final static String _jspx_template111 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template112 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template113 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template114 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template115 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template116 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template117 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template118 = "\r\n\t\t\t\t\t\t\t\t\t\t\t</td> \r\n\t\t\t\t                  \t\t</tr>                   \r\n\t\t\t\t                  \r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t                    \t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">산출 기간</td>\r\n\t\t\t\t                    \t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t                    \t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\" >\r\n\t\t\t\t\r\n\t\t\t\t\t                        \t\t<tr>\r\n\t\t\t\t\t                          \t\t\t<td width=\"60\">\r\n\t\t\t\t\t\t                          \t\t\t";
  private final static String _jspx_template119 = "\r\n\t\t\t\t\t\t                          \t\t</td>\r\n\t\t\t\t\t\t                          \t\t<td width=\"50\" align=\"center\">~</td>\r\n\t\t\t\t\t\t                          \t\t<td width=\"150\">\r\n\t\t\t\t\t\t\t                          \t\t";
  private final static String _jspx_template120 = "\r\n\t\t\t\t\t\t                          \t\t</td>\r\n\t\t\t\t\t\t                        \t</tr>\r\n\t\t\t\t\t\t                    \t</table>\r\n\t\t\t\t\t                    \t</td>  \r\n\t\t\t\t\t                    \t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">전년 조정 ";
  private final static String _jspx_template121 = "</td>\r\n\t\t\t\t\t                    \t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\t\t\t\t                     \t\t";
  private final static String _jspx_template122 = " 원\r\n\t\t\t\t                     \t\t</td>\r\n\t\t\t\t\t                    \t\t\r\n\t\t\t\t\t                 \t\t\r\n\t\t\t\t                  \t\t</tr>\r\n\t\t\t\t\r\n\t\t\t\t\t\t\t\t  \t\t<tr>\r\n\t\t\t\t\t\t\t\t  \t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조정 계수</td>\r\n\t\t\t\t\t                    \t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\">";
  private final static String _jspx_template123 = "\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t                  \t</tr>\r\n\t\t\t\t                  \r\n\t\t\t\t                  \t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">부과일자</td>\r\n\t\t\t\t\t\t                    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >";
  private final static String _jspx_template124 = " \r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">납기내기한</td>\r\n\t\t\t\t\t                    \t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" >";
  private final static String _jspx_template125 = "\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">납기후일자</td>\r\n\t\t\t\t                    \t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" >";
  private final static String _jspx_template126 = "\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">납기후금액</td>\r\n\t\t\t                    \t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" >";
  private final static String _jspx_template127 = " 원\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t  \t\t</tr>\r\n\t\t\t\t                 \t \t";
  private final static String _jspx_template128 = "\r\n\t\t\t\t\t\t             \t<tr>\r\n\t\t\t\t\t\t             \t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">과징율</td>\r\n\t\t\t\t\t\t                    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\">";
  private final static String _jspx_template129 = "\r\n\t\t\t\t\t\t                    </td>\r\n\t\t\t\t\t\t             \t</tr>\r\n\t\t\t\t\t\t             \t";
  private final static String _jspx_template130 = "\r\n\t\t\t\t                   \t\t<tr>\r\n\t\t\t\t                    \t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">기본 산출식</td>\r\n\t\t\t\t                    \t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" > ";
  private final static String _jspx_template131 = "\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">현년도 ";
  private final static String _jspx_template132 = "</td>\r\n\t\t\t\t\t\t                    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\t\t\t\t\t\t                    ";
  private final static String _jspx_template133 = " 원\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t                  \t\t</tr> \r\n\t\t\t\t                  \r\n\t\t\t\t                  \t\t<tr>\r\n\t\t\t\t\t                \t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조정 산출식</td>\r\n\t\t\t\t                    \t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" >";
  private final static String _jspx_template134 = "\r\n\t\t\t\t\t\t\t\t\t\t\t</td> \r\n\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조정 ";
  private final static String _jspx_template135 = "</td>\r\n\t\t\t                    \t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" >";
  private final static String _jspx_template136 = " 원\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t                  \t\t</tr>\r\n\t\t\t\t                  \t\t<tr>\t\r\n\t\t\t\t                  \t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">지분율 사유</td>\r\n\t\t\t\t\t\t                    <td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template137 = "\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t                  \t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">지분율 (%)</td>\r\n\t\t\t\t\t\t                    <td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t                    \t";
  private final static String _jspx_template138 = "\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t                  \t \t</tr>\r\n\t\t\t\t                  \t\t<tr>\t\r\n\t\t\t\t                  \t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">감면율 사유</td>\r\n\t\t\t\t\t\t                    <td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template139 = "\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t                  \t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">감면율 (%)</td>\r\n\t\t\t\t\t\t                    <td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t                    \t";
  private final static String _jspx_template140 = "\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t                  \t \t</tr>\r\n\t\t\t\t                  \t \t\r\n\t\t\t\t                  \t \t<tr>\r\n\t\t\t\t\t\t\t\t\t\t    <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">최종 산출식</td>\r\n\t\t\t\t\t\t\t\t\t\t    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >";
  private final static String _jspx_template141 = "\r\n\t\t\t\t\t\t\t\t\t\t    </td> \r\n\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t    <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">최종 ";
  private final static String _jspx_template142 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >";
  private final static String _jspx_template143 = " 원\r\n\t\t\t\t\t\t\t\t\t\t    </td> \r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\"></td>\r\n\t\t\t                    \t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" ></td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">부가가치세</td>\r\n\t\t\t                    \t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" >";
  private final static String _jspx_template144 = " 원\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t</tr> \r\n\t\t\t                \t\t</table>\r\n\t\t\t                \t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t            \r\n\t\t\t\t\t\t\t<tr>              \r\n\t\t\t\t            \t<td height=\"40\" align=\"right\">\r\n\t\t\t\t\t                <table border=\"0\" width=\"100%\">\r\n\t\t\t\t\t                \t<tr>\t\t\t\t\t\t\t\t                \t\t\r\n\t\t\t\t\t\t\t            \t<td width=\"100%\" align=\"right\">\r\n\t\t\t\t\t\t\t                \t";
  private final static String _jspx_template145 = "\r\n\t\t\t\t                        \t\t<img src=\"/img/mod_icon5.gif\" alt=\"수정\" width=\"66\" height=\"22\" border=\"0\" onclick=\"javascript:goModify('";
  private final static String _jspx_template146 = "','";
  private final static String _jspx_template147 = "','";
  private final static String _jspx_template148 = "','";
  private final static String _jspx_template149 = "','";
  private final static String _jspx_template150 = "','edit','";
  private final static String _jspx_template151 = "','";
  private final static String _jspx_template152 = "');\" style=\"cursor:pointer\" >\r\n\t\t\t\t\t\t\t            \t\t";
  private final static String _jspx_template153 = "\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td>\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"/img/junggibun_calculation.gif\" alt=\"정기분 산출\" width=\"84\" height=\"22\" border=\"0\" onclick=\"javascript:goModify('";
  private final static String _jspx_template154 = "','";
  private final static String _jspx_template155 = "','";
  private final static String _jspx_template156 = "','";
  private final static String _jspx_template157 = "','";
  private final static String _jspx_template158 = "','add','";
  private final static String _jspx_template159 = "','";
  private final static String _jspx_template160 = "');\" style=\"cursor:pointer\">\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t                \t</tr>\r\n\t\t\t\t\t             \t</table>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t              \t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</div>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n</form>\r\n</body>\r\n\t\t\r\n<script language=\"javascript\">\r\n\tfunction InitPage()\r\n\t{\r\n\t\tvar obj = document.productForm.message.value;\r\n\t\t\r\n\t\tif(obj != \"\")\t\r\n\t\t\talert(obj);\r\n\t\t\treturn;\r\n\t}\r\n</script>\r\n\r\n</html>            \r\n";
}
