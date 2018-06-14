package jeus_jspwork._jsp._rojum._jumyong;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_info_5fproduct_5fpenalty_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(32,126);to=(32,136)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${existOwner}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(36,23);to=(36,32)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TAX_GUBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(38,30);to=(38,39)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TAX_GUBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(38,57);to=(38,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TAX_GUBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(45,23);to=(45,29)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ck_del}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(46,77);to=(46,85)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(48,34);to=(48,46)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(122,31);to=(122,43)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(128,77);to=(128,85)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(128,101);to=(128,112)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(128,129);to=(128,141)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${countPerPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(129,74);to=(129,81)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(132,89);to=(132,97)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(132,113);to=(132,124)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(132,141);to=(132,161)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${countPerPage        }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // jsp code [from=(133,74);to=(133,81)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);
      // jsp code [from=(136,98);to=(136,106)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template26);
      // jsp code [from=(136,122);to=(136,133)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // jsp code [from=(136,150);to=(136,170)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${countPerPage        }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template28);
      // jsp code [from=(137,73);to=(137,79)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${gp_typ}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template29);
      // jsp code [from=(137,91);to=(137,98)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template30);
      out.write(_jspx_template31);
      // jsp code [from=(260,71);to=(260,79)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template32);
      // jsp code [from=(260,87);to=(260,90)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${seq}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template33);
      // jsp code [from=(284,92);to=(284,100)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template34);
      out.write(_jspx_template35);
      // jsp code [from=(448,48);to=(448,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.CAL_SUM_SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template36);
      // jsp code [from=(449,61);to=(449,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template37);
      // jsp code [from=(450,54);to=(450,58)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mode}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template38);
      // jsp code [from=(451,52);to=(451,55)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${seq}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template39);
      // jsp code [from=(453,71);to=(453,77)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ORG_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template40);
      // jsp code [from=(454,71);to=(454,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${DEPT_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template41);
      // jsp code [from=(455,75);to=(455,92)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.LT_SEL_YN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template42);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template57);
      // jsp code [from=(501,59);to=(501,76)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${strPageDivideForm}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template58);
      // jsp code [from=(530,55);to=(530,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template59);
      // jsp code [from=(534,55);to=(534,87)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.PRICE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

      out.write(_jspx_template60);
      // jsp code [from=(540,55);to=(540,79)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.REDUCTION_REASON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template61);
      // jsp code [from=(544,55);to=(544,77)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.REDUCTION_RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template62);
      // jsp code [from=(552,55);to=(552,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.FORM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template63);
      // jsp code [from=(558,55);to=(558,90)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.SUM_YEAR)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

      out.write(_jspx_template64);
      // jsp code [from=(569,55);to=(569,85)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.VAT)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

      out.write(_jspx_template65);
      // jsp code [from=(591,55);to=(591,64)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TAX_GUBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template66);
      // jsp code [from=(595,52);to=(595,58)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TAX_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template67);
      // jsp code [from=(602,55);to=(602,59)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${LIVE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template68);
      // jsp code [from=(607,55);to=(607,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TAXPAYER_SET}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template69);
      // jsp code [from=(611,55);to=(611,62)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${OBJ_SET}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template70);
      // jsp code [from=(618,55);to=(618,85)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(product.TAX_DATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_1));

      out.write(_jspx_template71);
      // jsp code [from=(627,82);to=(627,110)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(product.INDATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_1));

      out.write(_jspx_template72);
      // jsp code [from=(632,98);to=(632,128)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(product.OVERDATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_1));

      out.write(_jspx_template73);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_0_fn(pageContext, null)) return;


      out.write(_jspx_template81);
      // jsp code [from=(693,105);to=(693,117)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template82);
      // jsp code [from=(697,93);to=(697,125)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.PRICE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

      out.write(_jspx_template83);
      // jsp code [from=(704,173);to=(704,191)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.AREA_AFTER}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template84);
      // jsp code [from=(711,167);to=(711,191)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.REDUCTION_REASON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template85);
      // jsp code [from=(715,181);to=(715,203)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.REDUCTION_RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template86);
      // jsp code [from=(722,143);to=(722,155)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.FORM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template87);
      // jsp code [from=(726,169);to=(726,185)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.SUM_YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template88);
      // jsp code [from=(727,117);to=(727,135)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.SUM_ADJUST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template89);
      // jsp code [from=(728,80);to=(728,99)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.FORM_ADJUST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template90);
      // jsp code [from=(729,64);to=(729,75)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.VAT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template91);
      // jsp code [from=(770,59);to=(770,72)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${taxation_part}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template92);
      // jsp code [from=(776,59);to=(776,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${taxcode}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template93);
      // jsp code [from=(785,59);to=(785,77)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${taxpayer_residence}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template94);
      // jsp code [from=(792,59);to=(792,73)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${taxpayer_group}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template95);
      // jsp code [from=(799,59);to=(799,70)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${object_type}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template96);
      // jsp code [from=(810,160);to=(810,168)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TAX_DATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template97);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_3_fn(pageContext, null)) return;


      out.write(_jspx_template103);

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
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${productList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("board");
    _jspx_th_c_forEach_0.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template43);
            // jsp code [from=(484,86);to=(484,96)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template44);
            // jsp code [from=(484,154);to=(484,162)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template45);
            // jsp code [from=(484,171);to=(484,181)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template46);
            // jsp code [from=(484,197);to=(484,208)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template47);
            // jsp code [from=(484,225);to=(484,237)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${countPerPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template48);
            // jsp code [from=(484,246);to=(484,256)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template49);
            // jsp code [from=(484,264);to=(484,273)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template50);
            // jsp code [from=(484,285);to=(484,292)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template51);
            // jsp code [from=(485,82);to=(485,91)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${idx.count}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template52);
            // jsp code [from=(486,70);to=(486,80)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template53);
            // jsp code [from=(487,67);to=(487,83)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.AREA_AFTER}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template54);
            // jsp code [from=(489,70);to=(489,100)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(board.PRICE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template55);
            // jsp code [from=(490,70);to=(490,104)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(board.SUM_YEAR) }",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template56);

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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION != '4'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template74);
          // jsp code [from=(656,116);to=(656,124)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template75);
          // jsp code [from=(656,130);to=(656,141)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template76);
          // ----  c:if ---- invoke //
          if (_jspx_th_c_if_1_fn(pageContext, _jspx_th_c_if_0)) return true;


          out.write(_jspx_template80);

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
    _jspx_th_c_if_3.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION != '4'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
      if (_jspx_eval_c_if_3 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template98);
          // ----  c:if ---- invoke //
          if (_jspx_th_c_if_4_fn(pageContext, _jspx_th_c_if_3)) return true;


          out.write(_jspx_template100);
          // ----  c:if ---- invoke //
          if (_jspx_th_c_if_5_fn(pageContext, _jspx_th_c_if_3)) return true;


          out.write(_jspx_template102);

        } while (_jspx_th_c_if_3.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_3.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_3.release();
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
          out.write(_jspx_template77);
          // ----  c:if ---- invoke //
          if (_jspx_th_c_if_2_fn(pageContext, _jspx_th_c_if_1)) return true;


          out.write(_jspx_template79);

        } while (_jspx_th_c_if_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_1.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_1.release();
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
    _jspx_th_c_if_4.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${existOwner == 'false'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
      if (_jspx_eval_c_if_4 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template99);

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
    _jspx_th_c_if_5.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${existOwner == 'true'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
      if (_jspx_eval_c_if_5 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template101);

        } while (_jspx_th_c_if_5.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_5.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_5.release();
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
    _jspx_th_c_if_2.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bugwa_yn != '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
      if (_jspx_eval_c_if_2 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template78);

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
  private final static String _jspx_template1 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('사용자의 사용시간이 종료되었습니다. 다시 접속 해주시기 바랍니다.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template2 = "\r\n";
  private final static String _jspx_template3 = "\r\n";
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "  \r\n";
  private final static String _jspx_template6 = "  \r\n";
  private final static String _jspx_template7 = "\r\n";
  private final static String _jspx_template8 = "\r\n";
  private final static String _jspx_template9 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html>\r\n    <head>\r\n        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n        <title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n        <style type=\"text/css\">\r\n            <!--\r\n            body {\r\n                margin: 0px;\r\n                background-image: url(/img/left_back.gif);\r\n            }\r\n            -->\r\n        </style>\r\n        <link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n        <script language=\"javascript\" src=\"/js/common.js\"></script>\r\n        <script language=\"javascript\" src=\"/js/calculation.js\"></script>\r\n        <script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script>\r\n        <script language=\"javascript\" src=\"/js/Ajax_request.js\"></script>\r\n        <script>\r\n            var savable = 0;\r\n            function iFrameResize(obj)\r\n            {\r\n                var iFrm = obj;\r\n                var the_height = iFrm.contentWindow.document.body.scrollHeight;\r\n                iFrm.style.height = the_height + \"px\";\r\n            }\r\n            function InitPage()\r\n            {\r\n                if((document.getElementById(\"mode\").value == \"edit\" || document.getElementById(\"mode\").value == \"add\") && '";
  private final static String _jspx_template10 = "' == 'false'){\r\n                \talert(\"운영자 정보가 부족합니다. 운영자 정보에서 부족한 정보를 추가해 주세요.\");\r\n            \t}\r\n\r\n                if('";
  private final static String _jspx_template11 = "' == '3'){\r\n                \tdocument.productForm.BEFORE_TAX_YN[0].checked = true;\r\n                }else if(('";
  private final static String _jspx_template12 = "' == '1') || ('";
  private final static String _jspx_template13 = "' == '2')){\r\n                \tdocument.productForm.BEFORE_TAX_YN[1].checked = true;\r\n                }            \t\r\n\r\n            \tchangeTAXDATE();\r\n\r\n\r\n                if('";
  private final static String _jspx_template14 = "' == '1'){\r\n                    location.href = \"/rojum/jumyong/rojumCal3.do?GAPAN_NO=";
  private final static String _jspx_template15 = "\";\r\n                }\r\n                setParentYear('";
  private final static String _jspx_template16 = "');\r\n\r\n                parent.document.getElementById(\"SEQ\").value = document.getElementById(\"SEQ\").value;\r\n\r\n                if(document.getElementById(\"mode\").value == \"edit\" || document.getElementById(\"mode\").value == \"add\"  )\r\n                {\r\n                    document.getElementById(\"view\").style.display = \"none\";\r\n\r\n                    document.getElementById(\"edit\").style.display= \"block\";\r\n                    document.getElementById(\"edit\").style.pixelTop = 0;\r\n                }else\r\n                {\r\n                    document.getElementById(\"edit\").style.display = \"none\";\r\n                    document.getElementById(\"view\").style.display = \"block\";\r\n                }\r\n\r\n                taxCdDelete('TAX_CD','288');\r\n\r\n              //********** BEGIN_현진_20120307\r\n              selectBeforeTaxYN('before');\r\n              //********** END_현진_20120307\r\n\r\n                \r\n            }\r\n\r\n\r\n            function taxCdDelete(target,code){\r\n         \t\tvar\ttargetObj = document.getElementById(target);\r\n         \t\tfor(var i = 1; i < targetObj.options.length ; i++){\r\n             \t\tif(targetObj.options[i].value.substring(2,5) != code){\r\n             \t\t\ttargetObj.options[i] = null;\r\n             \t\t\ti = 0;\r\n             \t\t}\r\n         \t\t}\r\n         \t}\r\n\r\n\r\n            function submitClick()\r\n            {\r\n                var productForm = document.productForm;\r\n\r\n            \tif(!DataCheck()){\r\n                \treturn;\r\n            \t}\r\n\r\n                if(savable == 1)\r\n                {\r\n                    //comma제거\r\n                    removeComma2(\"PRICE\");\r\n                    removeComma2(\"SUM_YEAR\");\r\n                    removeComma2(\"SUM_ADJUST\");\r\n                    removeComma2(\"VAT\");\r\n                    productForm.TAX_DATE.value = removeDash(productForm.TAX_DATE.value);\r\n                    productForm.OVERDATE.value = removeDash(productForm.OVERDATE.value);\r\n                    productForm.INDATE.value = removeDash(productForm.INDATE.value);\r\n\r\n                    productForm.submit();\r\n                }else{\r\n                    alert(\"산출 내역을 계산해 주십시오.\");\r\n                }\r\n            }\r\n\r\n\r\n            function subTabClick(hiddenSubTabName,visibleSubTabName)\r\n            {\r\n                document.getElementById(hiddenSubTabName).style.display = 'none';\r\n                document.getElementById(visibleSubTabName).style.display = 'block';\r\n            }\r\n\r\n\r\n            \r\n            function goModify()\r\n            {\r\n                var area = document.getElementById(\"AREA_AFTER\").value;\r\n                var year = '";
  private final static String _jspx_template17 = "';\r\n                var seq = document.getElementById(\"SEQ\").value;\r\n                var sum_adjust = Number(removeComma(document.getElementById(\"SUM_ADJUST\").value));\r\n\r\n                if(area>=0)\r\n                {\r\n                    location.href = \"/rojum/jumyong/rojumCal3.do?GAPAN_NO=";
  private final static String _jspx_template18 = "&currentPage=";
  private final static String _jspx_template19 = "&countPerPage=";
  private final static String _jspx_template20 = "\"\r\n                        +\"&mode=edit&year=\"+year+\"&seq=\"+seq+\"&SECTION=";
  private final static String _jspx_template21 = "\";\r\n                }else if(sum_adjust <0)\r\n                {\r\n                    location.href = \"/rojum/jumyong/productSubtractInsert.do?GAPAN_NO=";
  private final static String _jspx_template22 = "&currentPage=";
  private final static String _jspx_template23 = "&countPerPage=";
  private final static String _jspx_template24 = "\"\r\n                        +\"&mode=edit&year=\"+year+\"&seq=\"+seq+\"&SECTION=";
  private final static String _jspx_template25 = "&area=\"+area;\r\n                }else\r\n                {\r\n                    location.href = \"/rojum/jumyong/productSubtractBeforeTaxInsert.do?GAPAN_NO=";
  private final static String _jspx_template26 = "&currentPage=";
  private final static String _jspx_template27 = "&countPerPage=";
  private final static String _jspx_template28 = "\"\r\n                        +\"&mode=edit&year=\"+year+\"&seq=\"+seq+\"&gp_typ=";
  private final static String _jspx_template29 = "&SECTION=";
  private final static String _jspx_template30 = "&area=\"+area;\r\n                }\r\n            }\r\n            function Calculate()\r\n            {\r\n                var price = removeComma(document.getElementById(\"PRICE\").value);\r\n                var reduction_rate = document.getElementById(\"REDUCTION_RATE\").value;\r\n                var reduction_reason = document.getElementById(\"REDUCTION_REASON\").value;\r\n\t\t\t\t//********** BEGIN_현진_20120214\r\n\t\t\t\t var area_after = document.getElementById(\"AREA_AFTER\").value;\r\n\t\t\t\t//********** BEGIN_현진_20120307\r\n\t\t\t\tif(area_after == \"\" || typeof(area_after) == \"undefined\" || area_after == null || area_after < 1 ){\r\n\t\t\t\t  document.getElementById(\"AREA_AFTER\").value = 1;\r\n\t\t\t\t  area_after = 1;\t\t              \r\n\t\t\t\t}\r\n\t\t\t\t//********** END_현진_20120307\r\n\t\t\t\t//********** END_현진_20120214\r\n\t\t\t\t\r\n                var lt_sel_yn = document.getElementById(\"LT_SEL_YN\").value;\r\n\r\n                if(reduction_rate == \"\")\r\n                    reduction_rate = 0;\r\n\r\n                var sum_year = document.getElementById(\"SUM_YEAR\");\r\n                var sum_adjust = document.getElementById(\"SUM_ADJUST\");\r\n                var form = document.getElementById(\"FORM\");\r\n                var form_adjust = document.getElementById(\"FORM_ADJUST\");\r\n                var vat = document.getElementById(\"VAT\");\r\n\r\n                if(price<=0){\r\n                    alert(\"기준금액을 넣어주세요.\");\r\n                    document.getElementById(\"PRICE\").value = \"\";\r\n                    document.getElementById(\"PRICE\").focus();\r\n                    return;\r\n                }\r\n                \r\n                \r\n                if(lt_sel_yn == 'Y' && reduction_rate == 0){\r\n                    reduction_rate = 50;\r\n                    reduction_reason = '과태료감경대상 50%감경';\r\n                \t\r\n                }\r\n                \r\n              //********** BEGIN_KANG_20120925\r\n              // 과태료 부과기준(제9조의 2관련) 초과 점용면적 1제곱미터 이하 50,000원 1미터제곱을 초과하는 매 1제곱미터 이내마다 100,000원씩 추가\r\n              // 과태료 상한 금액 1,500,000\r\n              //area_after_floor = Math.floor(area_after);\r\n              //sum_year.value = Math.floor(fixFloatCal(parseFloat(price)*parseFloat(area_after_floor)*parseFloat((100-parseFloat(reduction_rate))/100)));\r\n              area_after_floor = Math.ceil(area_after);\r\n              sum_year.value = parseFloat(price)+ (area_after_floor-1) * 100000;\r\n              if( sum_year.value > 1500000){\r\n            \t  sum_year.value = 1500000;\r\n              }\r\n              sum_year.value = sum_year.value * parseFloat((100-parseFloat(reduction_rate))/100);\r\n\t\t\t  //********** END_KANG_20120925\r\n                form.value = insertComma2(price);\r\n                if(reduction_rate == \"0.0\" || reduction_rate == \"0\" || reduction_rate == \"\"){                    \r\n                    //********** BEGIN_KANG_20120925\r\n                    //form.value = form.value+\" X \"+ area_after_floor;\r\n                    form.value = form.value+ \" + (\"+area_after_floor+ \"-1) X 100,000\";\r\n\t\t\t\t\t//********** END_KANG_20120925                   \r\n\r\n                }else{\r\n                \t//********** BEGIN_KANG_20120925\r\n                \t//form.value = form.value+\" X \"+ area_after_floor +\" X(100-\"+reduction_rate+\")/100\";\r\n                \t form.value = \"(\"+form.value+ \" + (\"+area_after_floor+ \"-1) X 100,000) X (100-\"+reduction_rate+\")/100\";\r\n                \t//********** END_KANG_20120925  \r\n                }\r\n\r\n                sum_year.value = insertComma2(Math.floor(sum_year.value/100)*100);\t\t//100원 절삭\r\n\r\n                sum_adjust.value = sum_year.value;\r\n                form_adjust.value = form.value;\r\n                \r\n                vat.value = \"0\";\r\n                savable = 1;\r\n\r\n            }\r\n            \r\n\t\t    function selectBeforeTaxYN(chkVal){\r\n\t    \t\tvar form \t= document.productForm;\r\n\t    \t\t\r\n\t    \t\t\r\n\t    \t\tif(form.LT_SEL_YN.value == 'Y'){\r\n\r\n\t\t\t\t    if(chkVal == 'before'){\r\n\t\t\t\t    \tsavable = 0;\r\n\t\t\t\t\t\tform.REDUCTION_RATE.value = \"60\";\r\n\t\t\t\t\t\tform.REDUCTION_REASON.value = \"과태료감경대상 50%+사전통지에 의한 20%감경\";\r\n\t\t\t\t\t\tform.TAX_GUBUN.value = \"3\";\r\n\t\t\t\t\t\t\r\n\t\t\t\t    }else{\r\n\t\t\t\t    \tsavable = 0;\r\n\t\t\t\t\t\tform.RED";
  private final static String _jspx_template31 = "UCTION_RATE.value = \"50\";\r\n\t\t\t\t\t\tform.REDUCTION_REASON.value = \"과태료감경대상 50%감경\";\r\n\t\t\t\t\t\tform.TAX_GUBUN.value = \"2\";\r\n\t\t\t\t\t}\r\n\t    \t\t}else{\r\n\t\t\t\t    if(chkVal == 'before'){\r\n\t\t\t\t    \tsavable = 0;\r\n\t\t\t\t\t\tform.REDUCTION_RATE.value = \"20\";\r\n\t\t\t\t\t\tform.REDUCTION_REASON.value = \"사전통지에 의한 20%감경\";\r\n\t\t\t\t\t\tform.TAX_GUBUN.value = \"3\";\r\n\t\t\t\t\t\t\r\n\t\t\t\t    }else{\r\n\t\t\t\t    \tsavable = 0;\r\n\t\t\t\t\t\tform.REDUCTION_RATE.value = \"0\";\r\n\t\t\t\t\t\tform.REDUCTION_REASON.value = \"\";\r\n\t\t\t\t\t\tform.TAX_GUBUN.value = \"2\";\r\n\t\t\t\t\t}\r\n\t    \t\t}\r\n\t    \t\t//********** BEGIN_KANG_20120720\r\n\t    \t\tchangeTAXDATE();\r\n\t    \t\t//********** END_KANG_20120720\r\n\t    \t}\r\n\r\n            // 추가 화면 이동\r\n            function goAdd(gapanNo,currentPage)\r\n            {\r\n                location.href(\"/rojum/jumyong/rojumCal3.do?GAPAN_NO=\"+gapanNo+\"&currentPage=\"+currentPage+\"&mode=add\");\r\n            }\r\n\r\n            function goDelete(){\r\n                location.href(\"/rojum/jumyong/rojumCal3.do?GAPAN_NO=";
  private final static String _jspx_template32 = "&seq=";
  private final static String _jspx_template33 = "&mode=del\");\r\n\r\n            }\r\n\r\n\r\n            function showProductList()\r\n            {\r\n                var area = document.getElementById(\"AREA_AFTER\").value;\r\n\r\n                if(Number(area) < 0)\r\n                    openwin();\r\n            }\r\n\r\n\r\n            function openwin(){\r\n\r\n                var area = document.getElementById(\"AREA_AFTER\").value;\r\n\r\n                var year = document.getElementById(\"YEAR\").value;\r\n\r\n                var x= \"dialogwidth:700px;dialogHeight:600px;status:no;help:no\";\r\n\r\n                var mode = document.getElementById(\"mode\").value;\r\n\r\n                window.showModalDialog(\"/rojum/jumyong/junggi/productSubList.do?ADMIN_NO=";
  private final static String _jspx_template34 = "&area=\"+area+\"&year=\"+year+\"&mode=\"+mode, window,x);\r\n            }\r\n\r\n\r\n            function changeTAXDATE(){\r\n            \t//********** BEGIN_KANG_20120720\r\n            \t/*\r\n            \t//과세날짜, 납기일내일자, 납기후일자 구하기  2009.08.31 pkh\r\n                var taxdate = document.getElementById(\"TAX_DATE\").value;\r\n                document.getElementById(\"INDATE\").value = addDate('d',15,taxdate,'-');\r\n                document.getElementById(\"OVERDATE\").value = addDate('m',1,document.getElementById(\"INDATE\").value,'-');\r\n            \t*/\r\n            \t//과세날짜, 납기일내일자, 납기후일자 구하기  2009.08.31 pkh\r\n            \t\r\n            \tvar taxdate = document.getElementById(\"TAX_DATE\").value;\r\n                document.getElementById(\"INDATE\").value = addDate('d',15,taxdate,'-');\r\n            \t\r\n         \t\tvar\tTAX_GUBUN\t= document.getElementById(\"TAX_GUBUN\");\r\n         \t\t\r\n         \t\tif(TAX_GUBUN.value == '3'){\r\n             \t\tdocument.getElementById(\"OVERDATE\").value = addDate('d',15,taxdate,'-');             \t\t\r\n         \t\t}else if(TAX_GUBUN.value == '2'){\r\n         \t\t\tdocument.getElementById(\"OVERDATE\").value = addDate('m',1,document.getElementById(\"INDATE\").value,'-');\r\n         \t\t}\r\n                \r\n            \t//********** END_KANG_20120720\r\n            }\r\n\r\n\r\n            function\tSemokInfo()\r\n        \t{\r\n        \t\tvar\tTAX_CD\t= document.getElementById(\"TAX_CD\").value;\r\n        \t\tvar\tSIGU_CD\t= document.getElementById(\"SIGU_CD\").value;\r\n        \t\tvar\tDEPT_CD\t= document.getElementById(\"DEPT_CD\").value;\r\n\r\n        \t\tif(!taxCdCheck()){\r\n            \t\treturn;\r\n        \t\t}\r\n\r\n        \t\tif(TAX_CD != ''){\r\n        \t\t\tMessageDisplay('MSG','MSGValue',1);\r\n\t        \t\tvar\tparams\t= \"TAX_CD=\" + TAX_CD + \"&SIGU_CD=\" + SIGU_CD + \"&DEPT_CD=\" + DEPT_CD;\r\n\t        \t\tsendRequest(\"/rojum/saewe/semokinfo.do\", params, \"GET\", Result_SemokInfo);\r\n        \t\t}\r\n        \t}\r\n        \t\r\n        \tfunction\tResult_SemokInfo(obj)\r\n        \t{\r\n        \t\tvar xmldoc \t= new ActiveXObject(\"Microsoft.XMLDOM\");\r\n                var form \t= document.productForm;\r\n                 \r\n        \t\tif(obj == \"\")\r\n        \t\t{\t\t\r\n        \t\t\tMessageDisplay('MSG','MSGValue',0);\r\n        \t\t\talert(\"세목코드 실패!!\");\r\n        \t\t\treturn;\r\n        \t\t}\r\n        \t\t\r\n                xmldoc.async\t= false;\r\n        \t\txmldoc.loadXML(obj);\r\n        \t\tform.ADD_SET.value\t\t= \txmldoc.getElementsByTagName(\"gasanRateGubun\").item(0).text;\r\n        \t\tform.ADD_SET_NM.value\t= \txmldoc.getElementsByTagName(\"gasanRateGubunNm\").item(0).text;\r\n        \t\tform.SUBUSEO_CD.value\t=\txmldoc.getElementsByTagName(\"suBuseoCd\").item(0).text;\r\n        \t\tform.gasanRate.value\t=\txmldoc.getElementsByTagName(\"gasanRate\").item(0).text;\r\n        \t\tform.OCR_BUSEO_CD.value\t=\txmldoc.getElementsByTagName(\"ocrBuseoCd\").item(0).text;\r\n        \t\tform.OCR_SIGU_CD.value\t=\txmldoc.getElementsByTagName(\"ocrSiguCd\").item(0).text;\r\n\t\r\n        \t\tif(form.ADD_SET.value == '7'){\r\n            \t\tform.ADD_YN.value = 1;\r\n        \t\t}else{\r\n        \t\t\tform.ADD_YN.value = 0;\r\n        \t\t}\r\n        \t\t\r\n        \t\tMessageDisplay('MSG','MSGValue',0);\r\n        \t}\r\n\r\n        \t function DataCheck()\r\n         \t{\r\n         \t\tvar form \t= document.productForm;\r\n         \t\tvar\tstr\t\t= \"\";\r\n         \t\t\r\n         \t\tif(form.TAX_GUBUN.value.length\t< 1){\r\n         \t\t\tstr\t+= \"과세구분을 선택하세요\\n\";\r\n         \t\t\tform.TAX_GUBUN.focus();\r\n         \t\t}else if(form.TAX_CD.value.length\t< 1){\r\n         \t\t\tstr\t+= \"세목코드를 선택하세요\\n\";\r\n         \t\t\tform.TAX_CD.focus();\r\n         \t\t}else if(form.TAXPAYER_SET.value.length\t< 1){\r\n         \t\t\tstr\t+= \"납세자 구분을 선택하세요\\n\";\r\n         \t\t\tform.TAXPAYER_SET.focus();\r\n         \t\t}else if(form.LIVE.value.length\t< 1){\r\n         \t\t\tstr\t+= \"거주상태를 선택하세요\\n\";\r\n         \t\t\tform.LIVE.focus();\r\n         \t\t}else if(form.OBJ_SET.value.length\t< 1){\r\n         \t\t\tstr\t+= \"물건구분을 선택하세요.\\n\";\r\n         \t\t\tform.OBJ_SET.focus();\r\n         \t\t}else if(form.TAX_DATE.value.length\t< 1){\r\n         \t\t\tstr\t+= \"과세일자를 입력하세요\\n\";\r\n         \t\t\tform.TAX_DATE.focus();\r\n         \t\t}else if(form.INDATE.value.length\t< 1){\r\n         \t\t\tstr\t+= \"납기내일자를 입력하세요\\n\";\r\n         \t\t\tform.INDATE.focus();\r\n         \t\t}else if";
  private final static String _jspx_template35 = "(form.OVERDATE.value < 110){\r\n         \t\t\tstr\t+= \"납기후일자를 입력하세요\\n\";\r\n         \t\t\tform.OVERDATE.focus();\r\n         \t\t}else if(form.BEFORE_TAX_YN[0].checked == false && form.BEFORE_TAX_YN[1].checked == false){\r\n         \t\t\tstr\t+= \"사전통지 여부를 선택하세요\\n\";\r\n         \t\t\tform.BEFORE_TAX_YN[0].focus();\r\n         \t\t}\r\n\r\n         \t\tif(str\t== \"\")\r\n         \t\t{\r\n         \t\t\treturn\ttrue;\r\n         \t\t}\r\n         \t\t\r\n         \t\talert(str);\r\n         \t\treturn\tfalse;\t\t\r\n         \t}\r\n\r\n         \tfunction taxCdCheck(){\r\n         \t\tvar\tTAX_CD\t= document.getElementById(\"TAX_CD\");\r\n         \t\t\r\n\r\n\t\t\t\tif(TAX_CD.value.substring(2,5) != '288'){\r\n             \t\talert(\"과태료만 선택하실수 있습니다. 다시 선택하세요.\");\r\n             \t\tTAX_CD.value = '';\r\n             \t\tTAX_CD.focus();\r\n             \t\treturn false;\r\n         \t\t}\r\n         \t\treturn true;\r\n\r\n         \t}\r\n\r\n         \tfunction taxGubunCheck(){\r\n         \t\tvar\tTAX_GUBUN\t= document.getElementById(\"TAX_GUBUN\");\r\n\r\n\r\n         \t\tvar before_tax_yn = document.productForm.BEFORE_TAX_YN;\r\n        \t\t\r\n         \t\tif(before_tax_yn[0].checked && TAX_GUBUN.value != '3'){\r\n         \t\t\talert(\"신고분만 선택할수 있습니다.\");\r\n         \t\t\tTAX_GUBUN.value = '3';\r\n         \t\t\tTAX_GUBUN.focus();\r\n             \t\treturn false;\r\n         \t\t}else if(before_tax_yn[1].checked && TAX_GUBUN.value != '2'){\r\n         \t\t\talert(\"수시분만 선택할수 있습니다.\");\r\n         \t\t\tTAX_GUBUN.value = '2';\r\n         \t\t\tTAX_GUBUN.focus();\r\n             \t\treturn false;\r\n         \t\t}\r\n         \t\treturn true;\r\n         \t}\r\n\r\n        </script>\r\n\r\n    </head>\r\n\r\n    <body onload=\"javascript:InitPage();\"  border=\"0\">\r\n        <form name=\"productForm\" id=\"productForm\" method=\"post\" action = \"/rojum/jumyong/rojumCal3.do\" >\r\n        \r\n\t\t\t<span id=\"MSG\" style=\"position:absolute;display:none; \">\r\n\t\t\t\t<img src=\"/img/loadingBar.gif\" id=\"MSGValue\">\r\n\t\t\t</span>\r\n        \t \r\n            <input name=\"CAL_SUM_SEQ\" value=\"";
  private final static String _jspx_template36 = "\" type=\"hidden\" >\r\n            <input name=\"GAPAN_NO\" id = \"GAPAN_NO\" value=\"";
  private final static String _jspx_template37 = "\" type=\"hidden\" >\r\n            <input name=\"mode\"  id = \"mode\" value=\"";
  private final static String _jspx_template38 = "\" type=\"hidden\" >\r\n            <input name=\"SEQ\"  id = \"SEQ\" value=\"";
  private final static String _jspx_template39 = "\" type=\"hidden\" >\r\n            \r\n            <input type=\"hidden\" name=\"SIGU_CD\" id=\"SIGU_CD\" value=\"";
  private final static String _jspx_template40 = "\">\r\n            <input type=\"hidden\" name=\"DEPT_CD\" id=\"DEPT_CD\" value=\"";
  private final static String _jspx_template41 = "\">\r\n            <input type=\"hidden\" name=\"LT_SEL_YN\" id=\"LT_SEL_YN\" value=\"";
  private final static String _jspx_template42 = "\">\r\n            \r\n\t\t\t<!--ajax 리턴값-->\r\n      <input type=\"hidden\" name=\"ADD_SET\"  id=\"ADD_SET\" value=\"\">\r\n\t\t\t<input type=\"hidden\" name=\"ADD_SET_NM\"  id=\"ADD_SET_NM\" value=\"\">\r\n\t\t\t<input type=\"hidden\" name=\"ADD_YN\"  id=\"ADD_YN\" value=\"\">\r\n\t\t\t<input type=\"hidden\" name=\"SUBUSEO_CD\"  id=\"SUBUSEO_CD\" value=\"\">\r\n\t\t\t<input type=\"hidden\" name=\"gasanRate\"  id=\"gasanRate\" value=\"\">\r\n\t\t\t<input type=\"hidden\" name=\"OCR_BUSEO_CD\"  id=\"OCR_BUSEO_CD\" value=\"\">\r\n\t\t\t<input type=\"hidden\" name=\"OCR_SIGU_CD\"  id=\"OCR_SIGU_CD\" value=\"\">\r\n            \r\n            <table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                <tr>\r\n                    <td class=\"contborder_purple\">\r\n                        <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                            <tr>\r\n                                <td>\r\n                                    <table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n                                        <tr>\r\n                                            <td width=\"40px\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">번호</td>\r\n                                            <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">산출년도</td>\r\n                                            <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">면적</td>\r\n                                           \r\n                                            <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">기준금액</td>\r\n                                            <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">과태료</td>\r\n\r\n                                        </tr>\r\n                                        ";
  private final static String _jspx_template43 = "\r\n                                            <tr onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\"\r\n                                                onclick=\"javascript:setParentYear('";
  private final static String _jspx_template44 = "');location.href('/rojum/jumyong/rojumCal3.do?GAPAN_NO=";
  private final static String _jspx_template45 = "&year=";
  private final static String _jspx_template46 = "&currentPage=";
  private final static String _jspx_template47 = "&countPerPage=";
  private final static String _jspx_template48 = "&year=";
  private final static String _jspx_template49 = "&seq=";
  private final static String _jspx_template50 = "&SECTION=";
  private final static String _jspx_template51 = "');\" style=\"cursor:pointer\" >\r\n                                                <td height=\"26\" align=\"center\">";
  private final static String _jspx_template52 = "</td>\r\n                                                <td align=\"center\">";
  private final static String _jspx_template53 = "</td>                                                                                                \r\n\t                                            <td align=\"center\">";
  private final static String _jspx_template54 = "</td>\r\n\t                                       \r\n                                                <td align=\"center\">";
  private final static String _jspx_template55 = "</td>\r\n                                                <td align=\"center\">";
  private final static String _jspx_template56 = "</td>\r\n\r\n                                            </tr>\r\n                                        ";
  private final static String _jspx_template57 = "\r\n                                    </table></td>\r\n                            </tr>\r\n                            <tr>\r\n                                <td height=\"40\" align=\"center\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                                        <tr>\r\n                                            <td align=\"center\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n                                                    <tr>\r\n                                                        ";
  private final static String _jspx_template58 = "\r\n                                                    </tr>\r\n                                                </table>\r\n                                            </td>\r\n                                        </tr>\r\n                                        <tr>\r\n\r\n\r\n                                        </tr>\r\n                                    </table></td>\r\n                            </tr>\r\n\r\n                        </table>\r\n\r\n\t\t\t\t\t\t\t<div id=\"view\" style=\"width:100%;\">\r\n                            <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\r\n                                <tr>\r\n                                    <td>\r\n                                    \r\n                                    \t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n                                    \t    <tr>\r\n                                                <td height=\"26\" align=\"left\" colspan=\"4\">\r\n                                                    <span class=\"sub_stan_blue\">&nbsp; * 산출정보 </span>\r\n                                                </td>\r\n                                            </tr>\r\n                                            <tr>\r\n                                                <td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" >산출년도</td>\r\n                                                <td width=\"42%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    ";
  private final static String _jspx_template59 = "년\r\n                                                </td>\r\n                                                <td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">기준금액</td>\r\n                                                <td width=\"32%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    ";
  private final static String _jspx_template60 = "원\r\n                                                </td>\r\n                                            </tr>\r\n                                            <tr>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">감경 사유</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    ";
  private final static String _jspx_template61 = "\r\n                                                </td>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">감경율</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    ";
  private final static String _jspx_template62 = " %\r\n                                                </td>\r\n                                            </tr>\r\n\r\n                                            <tr>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">산출식</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\r\n                                                    ";
  private final static String _jspx_template63 = "\r\n\r\n                                                </td>\r\n\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">과태료</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    ";
  private final static String _jspx_template64 = " 원\r\n                                                </td>\r\n\r\n\r\n\r\n                                            </tr>\r\n                                            <tr>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"2\">\r\n                                                </td>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">부가가치세</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    ";
  private final static String _jspx_template65 = " 원\r\n                                                </td>\r\n                                            </tr>\r\n                                        </table>\r\n                                \t</td>\r\n                                </tr>\r\n                                <tr>\r\n                                <td>\r\n                                </td>\r\n                                \r\n                                \r\n                                </tr>\r\n                                <tr>\r\n                                <td>\r\n                                <table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n                                            <tr>\r\n                                                <td colspan=\"6\" height=\"26px\" align=\"left\"  class=\"sub_table_b\">\r\n                                                <span class=\"sub_stan_blue\">&nbsp; * 부과정보 </span>\r\n                                            </tr>\r\n                                            <tr>\r\n                                                <td width=\"100px\" height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">과세구분</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\">\r\n                                                    ";
  private final static String _jspx_template66 = "\r\n                                                </td>\r\n                                                <td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">세목코드</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\" align=\"left\">\r\n                                                \t";
  private final static String _jspx_template67 = "\r\n                                                </td>\r\n                                            </tr>\r\n\r\n                                            <tr>\r\n                                                <td width=\"100px\" height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">거주상태</td>\r\n                                                <td width=\"100px\" bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\">\r\n                                                    ";
  private final static String _jspx_template68 = "\r\n\r\n                                                </td>\r\n                                                <td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">납세자구분</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\"  align=\"left\">\r\n                                                    ";
  private final static String _jspx_template69 = "\r\n                                                </td>\r\n                                                <td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">물건구분</td>\r\n                                                <td width=\"100px\" bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\">\r\n                                                    ";
  private final static String _jspx_template70 = "\r\n                                                </td>\r\n                                            </tr>\r\n\r\n                                            <tr>\r\n                                                <td height=\"26px\" width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">과세일자</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\">\r\n                                                    ";
  private final static String _jspx_template71 = "\r\n                                                </td>\r\n\r\n\r\n                                                <td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">납기일자</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\" align=\"left\">\r\n                                                    <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n                                                        <tr>\r\n                                                            <td>\r\n                                                            \t납기내일자&nbsp;:&nbsp;";
  private final static String _jspx_template72 = "                                                    \r\n                                                            </td>\r\n                                                            <td>\r\n                                                            </td>\r\n                                                            <td>\r\n                                                                &nbsp;/&nbsp;납기후일자&nbsp;:&nbsp;";
  private final static String _jspx_template73 = "\r\n                                                            </td>\r\n                                                            <td>\r\n                                                            </td>\r\n                                                        </tr>\r\n                                                    </table>\r\n                                                </td>\r\n                                            </tr>\r\n                                        </table>\r\n                                \r\n                                </td>\r\n                                \r\n                                \r\n                                </tr>\r\n\r\n                                <tr>\r\n                                    <td height=\"40\" align=\"right\">\r\n                                ";
  private final static String _jspx_template74 = "\r\n                                    <table border=\"0\" width=\"100%\">\r\n                                        <tr>\r\n\r\n\r\n\r\n                                            <td >\r\n                                                <img src=\"/img/add_icon.gif\" alt=\"추가\" border=\"0\" onclick=\"goAdd('";
  private final static String _jspx_template75 = "','";
  private final static String _jspx_template76 = "')\" style=\"cursor:pointer\">\r\n                                            </td>\r\n                                        ";
  private final static String _jspx_template77 = "\r\n                                            ";
  private final static String _jspx_template78 = "\r\n                                                <td width=\"50\">\r\n                                                    <img src=\"/img/mod_icon.gif\" alt=\"수정\" border=\"0\" onclick=\"javascript:goModify()\" style=\"cursor:pointer\" >\r\n                                                </td>\r\n                                                <td width=\"50\">\r\n                                                    <img src=\"/img/del_icon3.gif\" alt=\"삭제\" border=\"0\" onclick=\"javascript:goDelete()\" style=\"cursor:pointer\" >\r\n                                                </td>\r\n                                            ";
  private final static String _jspx_template79 = "\r\n                                        ";
  private final static String _jspx_template80 = "\r\n                                        </tr>\r\n\r\n                                    </table>\r\n                                ";
  private final static String _jspx_template81 = "\r\n                                </td>\r\n                                </tr>\r\n\r\n\r\n                            </table>\r\n                        </div>\r\n                        <div id=\"edit\" style=\"width:100%;display:none;\">\r\n                            <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                                <tr>\r\n\r\n                                    <td>\r\n                                        <table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n                                            <tr>\r\n                                                <td height=\"26\" align=\"left\" colspan=\"4\">\r\n                                                    <span class=\"sub_stan_blue\">&nbsp; * 산출정보 </span>\r\n                                                </td>\r\n                                            </tr>\r\n\r\n                                            <tr>\r\n                                                <td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\"  style=\"direction:rtl\" >산출년도</td>\r\n                                                <td width=\"42%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    <input name=\"YEAR\" id=\"YEAR\" type=\"text\" value = \"";
  private final static String _jspx_template82 = "\" style=\"width:50px;ime-mode:disabled;\"  class=\"input_form1\"  onKeyDown=\"onlyNumberInput();\" style=\"text-align:right\">&nbsp년\r\n                                                </td>\r\n                                                <td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">기준금액</td>\r\n                                                <td width=\"32%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    <input name=\"PRICE\" ID=\"PRICE\" value=\"";
  private final static String _jspx_template83 = "\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" onkeyup=\"javascript:fn_addComma(this)\"  onKeyDown=\"onlyNumberInput();\" style=\"text-align:right\">원\r\n                                                </td>\r\n                                            </tr>\r\n\r\n                                            <tr>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용면적</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\" >\r\n                                                    <input name=\"AREA_AFTER\" id=\"AREA_AFTER\" type=\"text\" class=\"input_form1\" style=\"width:50px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template84 = "\"   onKeyDown=\"onlyNumberInput();\" style=\"text-align:right\" onblur=\"showProductList();\" >㎡\r\n                                                </td>\r\n                                            </tr>\r\n\r\n                                            <tr>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">감경사유</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    <input name=\"REDUCTION_REASON\" id=\"REDUCTION_REASON\" type=\"text\" class=\"input_form1\" style=\"width:300px\" value=\"";
  private final static String _jspx_template85 = "\">\r\n                                                </td>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">감경율</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    <input name=\"REDUCTION_RATE\" id=\"REDUCTION_RATE\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template86 = "\"  onKeyDown=\"onlyNumberInput();\" style=\"text-align:right\">%\r\n                                                </td>\r\n                                            </tr>\r\n\r\n                                            <tr>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">산출식</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    <input name=\"FORM\" ID=\"FORM\" type=\"text\" class=\"input_form1\" style=\"width:300px\" value=\"";
  private final static String _jspx_template87 = "\">\r\n                                                </td>\r\n                                                <td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">과태료</td>\r\n                                                <td width=\"32%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    <input name=\"SUM_YEAR\" id=\"SUM_YEAR\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template88 = "\"   onKeyDown=\"onlyNumberInput();\" onkeyup=\"javascript:fn_addComma(this)\" style=\"text-align:right\">원\r\n                                                    <input name=\"SUM_ADJUST\" id=\"SUM_ADJUST\" type=\"hidden\" value=\"";
  private final static String _jspx_template89 = "\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"FORM_ADJUST\" id=\"FORM_ADJUST\" type=\"hidden\" value=\"";
  private final static String _jspx_template90 = "\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"VAT\" id=\"VAT\" type=\"hidden\" value=\"";
  private final static String _jspx_template91 = "\">\r\n                                                </td>\r\n                                            </tr>\r\n                                            \r\n                                        </table>\r\n                                    </td>\r\n                                </tr>\r\n                                <tr>\r\n                                    <td height=\"26\" align=\"right\" class=\"sub_table_b\">\r\n                                    \t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t              <tr>\r\n\t\t\t\t\t\t\t               <!--  //********** BEGIN_현진_20120305 -->\r\n\t\t\t\t\t\t\t                <td>\r\n\t\t\t\t\t\t\t                \t<input name=\"BEFORE_TAX_YN\" id=\"BEFORE_TAX_YN\" type=\"radio\" value=\"before\" onclick=\"selectBeforeTaxYN('before')\" checked>\r\n\t\t\t\t\t\t\t                </td>\r\n\t\t\t\t\t\t\t                <td width=\"100px\" align=\"left\">사전통지 과태료</td>\r\n\t\t\t\t\t\t\t                <td>\t\t\t\t\t\t\t               \r\n\t\t\t\t\t\t\t                \t<input name=\"BEFORE_TAX_YN\" id=\"BEFORE_TAX_YN\" type=\"radio\" value=\"original\" onclick=\"selectBeforeTaxYN('original')\">\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t                \t\t\t\t\t\t                \r\n\t\t\t\t\t\t\t                </td>\r\n\t\t\t\t\t\t\t                <td width=\"60px\" align=\"left\">과태료</td>\r\n\t\t\t\t\t\t\t                <!--   //********** END_현진_20120305 -->\r\n\t\t\t\t\t\t\t                <td align=\"right\">\r\n\t\t\t\t\t\t\t                \t<img src=\"/img/accou_icon.gif\" alt=\"계산\" width=\"56\" height=\"18\" border=\"0\" onclick=\"javascript:Calculate();\" style=\"cursor:pointer\">\r\n\t\t\t\t\t\t\t                </td>\r\n\t\t\t\t\t\t\t                </tr>\r\n\t\t\t\t\t\t\t            </table>\r\n                                        \r\n                                    </td>\r\n\r\n                                </tr>\r\n\r\n                                <tr>\r\n                                    <td>\r\n                                        <table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n                                            <tr>\r\n                                                <td colspan=\"6\" height=\"26\" align=\"left\"  class=\"sub_table_b\">&nbsp;* 부과 정보</td>\r\n                                            </tr>\r\n                                            <tr>\r\n                                                <td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">과세구분</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\">\r\n                                                    <select name=\"TAX_GUBUN\" id=\"TAX_GUBUN\" class=\"essential\" style=\"width:100px\" onChange=\"taxGubunCheck();\">\r\n                                                        ";
  private final static String _jspx_template92 = "\r\n                                                    </select>\r\n                                                </td>\r\n                                                <td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">세목코드</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\" align=\"left\">\r\n                                                    <select name=\"TAX_CD\" id=\"TAX_CD\" class=\"essential\" style=\"width:220px\"  OnChange=\"SemokInfo();\">\r\n                                                        ";
  private final static String _jspx_template93 = "\r\n                                                    </select>\r\n                                                </td>\r\n                                            </tr>\r\n\r\n                                            <tr>\r\n                                                <td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">거주상태</td>\r\n                                                <td width=\"100\" bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\">\r\n                                                    <select name=\"LIVE\" id=\"LIVE\" class=\"essential\" style=\"width:100px\">\r\n                                                        ";
  private final static String _jspx_template94 = "\r\n                                                    </select>\r\n\r\n                                                </td>\r\n                                                <td height=\"26\" width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">납세자구분</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\"  align=\"left\">\r\n                                                    <select name=\"TAXPAYER_SET\" id=\"TAXPAYER_SET\" class=\"essential\" style=\"width:220px\">\r\n                                                        ";
  private final static String _jspx_template95 = "\r\n                                                    </select>\r\n\r\n                                                </td>\r\n                                                <td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">물건구분</td>\r\n                                                <td width=\"100\" bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\">\r\n                                                    <select name=\"OBJ_SET\" id=\"OBJ_SET\" class=\"essential\" style=\"width:70px\">\r\n                                                        ";
  private final static String _jspx_template96 = "\r\n                                                    </select>\r\n                                                </td>\r\n                                            </tr>\r\n\r\n                                            <tr>\r\n                                                <td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">과세일자</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\">\r\n                                                    <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n                                                        <tr>\r\n                                                            <td>\r\n                                                                <input name=\"TAX_DATE\" id=\"TAX_DATE\" type=\"text\" class=\"essential\" style=\"width:80px\" value=\"";
  private final static String _jspx_template97 = "\" onfocus=\"changeTAXDATE();\" onselect=\"changeTAXDATE();\">\r\n                                                            </td>\r\n                                                            <td>\r\n                                                                <a>\r\n                                                                    <img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, document.getElementById('TAX_DATE'), 'yyyymmdd')\" style=\"CURSOR: Hand;\">\r\n                                                                </a>\r\n                                                            </td>\r\n                                                        </tr>\r\n                                                    </table>\r\n                                                </td>\r\n\r\n\r\n                                                <td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">납기일자</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\" align=\"left\">\r\n                                                    <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n                                                        <tr>\r\n                                                            <td>\r\n                                                            \t납기내일자&nbsp;:&nbsp;<input name=\"INDATE\" id=\"INDATE\" type=\"text\" class=\"essential\" style=\"width:80px\" value=\"\" onFocus=\"\" readonly>\r\n                                                            </td>\r\n                                                            <td>\r\n                                                                <a>\r\n                                                                    <img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, document.getElementById('INDATE'), 'yyyymmdd')\" style=\"CURSOR: Hand;\">\r\n                                                                </a>\r\n                                                            </td>\r\n                                                            <td>\r\n                                                                &nbsp;/&nbsp;납기후일자&nbsp;:&nbsp;<input name=\"OVERDATE\" id=\"OVERDATE\" type=\"text\" class=\"essential\" style=\"width:80px\" value=\"\" readonly>\r\n                                                            </td>\r\n                                                            <td>\r\n                                                                <a>\r\n                                                                    <img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, document.getElementById('OVERDATE'), 'yyyymmdd')\" style=\"CURSOR: Hand;\">\r\n                                                                </a>\r\n                                                            </td>\r\n                                                        </tr>\r\n                                                    </table>\r\n                                                </td>\r\n                                            </tr>\r\n\r\n\r\n\r\n\r\n\r\n                                        </table>\r\n                                    </td>\r\n                                </tr>\r\n                                <tr>\r\n                                    <td height=\"40\" align=\"right\">\r\n                                ";
  private final static String _jspx_template98 = "\r\n                                    <img src=\"/img/can_icon.gif\" alt=\"취소\" border=\"0\" onclick=\"javascript:history.back();\" style=\"cursor:pointer\" >\r\n                                    ";
  private final static String _jspx_template99 = "\r\n                                    \t<img src=\"/img/save_icon2.gif\" alt=\"저장\" width=\"56\" height=\"18\" border=\"0\" onClick=\"alert('운영자 정보가 부족합니다. 운영자 정보에서 부족한 정보를 추가해 주세요.');\"  style=\"cursor:pointer\">\r\n                                    ";
  private final static String _jspx_template100 = "\r\n                                    ";
  private final static String _jspx_template101 = "\r\n                                    \t<img src=\"/img/save_icon2.gif\" alt=\"저장\" width=\"56\" height=\"18\" border=\"0\" onClick=\"javascript:submitClick();\"  style=\"cursor:pointer\">\r\n                                    ";
  private final static String _jspx_template102 = "\r\n                                ";
  private final static String _jspx_template103 = "\r\n                                </td>\r\n                                </tr>\r\n                            </table>\r\n                        </div>\r\n                    </td>\r\n                </tr>\r\n                <tr>\r\n                    <td height=\"10\">\r\n                    </td>\r\n                </tr>\r\n\r\n            </table>\r\n\r\n        </form>\r\n    </body>\r\n</html>\r\n\r\n                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ";
}
