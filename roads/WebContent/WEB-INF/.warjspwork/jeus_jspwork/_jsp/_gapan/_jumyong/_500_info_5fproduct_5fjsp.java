package jeus_jspwork._jsp._gapan._jumyong;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_info_5fproduct_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(35,20);to=(35,27)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${message}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(36,16);to=(36,23)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${message}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(39,20);to=(39,26)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ck_del}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(40,81);to=(40,89)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(42,34);to=(42,46)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(58,35);to=(58,47)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.FORM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(120,31);to=(120,43)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(126,81);to=(126,89)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(126,105);to=(126,116)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(126,133);to=(126,145)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${countPerPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(127,74);to=(127,81)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      out.write(_jspx_template21);
      // jsp code [from=(255,75);to=(255,83)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(255,91);to=(255,94)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${seq}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(278,92);to=(278,100)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      out.write(_jspx_template25);
      out.write(_jspx_template26);
      // jsp code [from=(507,65);to=(507,84)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.CAL_SUM_SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // jsp code [from=(508,61);to=(508,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template28);
      // jsp code [from=(509,51);to=(509,55)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mode}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template29);
      // jsp code [from=(510,49);to=(510,52)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${seq}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template30);
      // jsp code [from=(512,71);to=(512,77)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ORG_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template31);
      // jsp code [from=(513,71);to=(513,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${DEPT_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template32);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template52);
      // jsp code [from=(567,59);to=(567,76)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${strPageDivideForm}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template53);
      // jsp code [from=(597,55);to=(597,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template54);
      // jsp code [from=(601,55);to=(601,87)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.PRICE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

      out.write(_jspx_template55);
      // jsp code [from=(607,55);to=(607,73)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.AREA_AFTER}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template56);
      // jsp code [from=(611,55);to=(611,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template57);
      // jsp code [from=(620,55);to=(620,71)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.FROMDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template58);
      // jsp code [from=(620,77);to=(620,91)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.TODATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template59);
      // jsp code [from=(623,95);to=(623,109)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.PERIOD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template60);
      // jsp code [from=(629,55);to=(629,79)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.REDUCTION_REASON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template61);
      // jsp code [from=(633,55);to=(633,77)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.REDUCTION_RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template62);
      // jsp code [from=(641,55);to=(641,73)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.ADJUSTMENT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template63);
      // jsp code [from=(646,55);to=(646,94)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.SUM_LASTYEAR)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

      out.write(_jspx_template64);
      // jsp code [from=(654,55);to=(654,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.FORM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template65);
      // jsp code [from=(660,55);to=(660,90)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.SUM_YEAR)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

      out.write(_jspx_template66);
      // jsp code [from=(670,55);to=(670,74)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.FORM_ADJUST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template67);
      // jsp code [from=(676,55);to=(676,92)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.SUM_ADJUST)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

      out.write(_jspx_template68);
      // jsp code [from=(687,55);to=(687,85)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.VAT)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

      out.write(_jspx_template69);
      // jsp code [from=(715,55);to=(715,64)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TAX_GUBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template70);
      // jsp code [from=(719,52);to=(719,58)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TAX_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template71);
      // jsp code [from=(726,55);to=(726,59)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${LIVE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template72);
      // jsp code [from=(731,55);to=(731,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TAXPAYER_SET}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template73);
      // jsp code [from=(735,55);to=(735,62)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${OBJ_SET}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template74);
      // jsp code [from=(742,55);to=(742,85)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(product.TAX_DATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_1));

      out.write(_jspx_template75);
      // jsp code [from=(751,82);to=(751,110)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(product.INDATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_1));

      out.write(_jspx_template76);
      // jsp code [from=(756,98);to=(756,128)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(product.OVERDATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_1));

      out.write(_jspx_template77);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_0_fn(pageContext, null)) return;


      out.write(_jspx_template85);
      // jsp code [from=(820,105);to=(820,117)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template86);
      // jsp code [from=(824,93);to=(824,106)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.PRICE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template87);
      // jsp code [from=(832,173);to=(832,191)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.AREA_AFTER}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template88);
      // jsp code [from=(837,162);to=(837,174)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template89);
      // jsp code [from=(847,181);to=(847,197)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.FROMDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template90);
      // jsp code [from=(854,177);to=(854,191)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.TODATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template91);
      // jsp code [from=(871,168);to=(871,182)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.PERIOD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template92);
      // jsp code [from=(878,167);to=(878,191)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.REDUCTION_REASON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template93);
      // jsp code [from=(882,181);to=(882,203)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.REDUCTION_RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template94);
      // jsp code [from=(888,173);to=(888,191)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.ADJUSTMENT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template95);
      // jsp code [from=(892,127);to=(892,150)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.LAST_AREA_AFTER}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template96);
      // jsp code [from=(893,178);to=(893,217)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.SUM_LASTYEAR)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

      out.write(_jspx_template97);
      // jsp code [from=(902,143);to=(902,155)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.FORM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template98);
      // jsp code [from=(906,169);to=(906,185)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.SUM_YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template99);
      // jsp code [from=(913,157);to=(913,176)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.FORM_ADJUST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template100);
      // jsp code [from=(917,173);to=(917,191)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.SUM_ADJUST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template101);
      // jsp code [from=(931,159);to=(931,170)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.VAT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template102);
      // jsp code [from=(959,59);to=(959,72)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${taxation_part}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template103);
      // jsp code [from=(965,59);to=(965,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${taxcode}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template104);
      // jsp code [from=(974,59);to=(974,77)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${taxpayer_residence}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template105);
      // jsp code [from=(981,59);to=(981,73)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${taxpayer_group}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template106);
      // jsp code [from=(988,59);to=(988,70)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${object_type}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template107);
      // jsp code [from=(999,160);to=(999,168)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TAX_DATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

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
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${productList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("board");
    _jspx_th_c_forEach_0.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template33);
            // jsp code [from=(547,86);to=(547,96)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template34);
            // jsp code [from=(547,158);to=(547,166)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template35);
            // jsp code [from=(547,175);to=(547,185)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template36);
            // jsp code [from=(547,201);to=(547,212)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template37);
            // jsp code [from=(547,229);to=(547,241)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${countPerPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template38);
            // jsp code [from=(547,250);to=(547,260)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template39);
            // jsp code [from=(547,268);to=(547,277)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template40);
            // jsp code [from=(547,289);to=(547,296)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template41);
            // jsp code [from=(548,82);to=(548,91)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${idx.count}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template42);
            // jsp code [from=(549,70);to=(549,80)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template43);
            // jsp code [from=(550,70);to=(550,100)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(board.PRICE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template44);
            // jsp code [from=(551,70);to=(551,86)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.AREA_AFTER}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template45);
            // jsp code [from=(552,70);to=(552,80)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template46);
            // jsp code [from=(554,70);to=(554,98)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(board.FROMDATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_1));

            out.write(_jspx_template47);
            // jsp code [from=(554,102);to=(554,128)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(board.TODATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_1));

            out.write(_jspx_template48);
            // jsp code [from=(555,70);to=(555,108)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(board.SUM_LASTYEAR) }",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template49);
            // jsp code [from=(556,70);to=(556,104)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(board.SUM_YEAR) }",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template50);
            // jsp code [from=(557,70);to=(557,106)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(board.SUM_ADJUST) }",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template51);

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
          out.write(_jspx_template78);
          // jsp code [from=(780,116);to=(780,124)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template79);
          // jsp code [from=(780,130);to=(780,141)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template80);
          // ----  c:if ---- invoke //
          if (_jspx_th_c_if_1_fn(pageContext, _jspx_th_c_if_0)) return true;


          out.write(_jspx_template84);

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
          out.write(_jspx_template81);
          // ----  c:if ---- invoke //
          if (_jspx_th_c_if_2_fn(pageContext, _jspx_th_c_if_1)) return true;


          out.write(_jspx_template83);

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
    _jspx_th_c_if_2.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bugwa_yn != '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
      if (_jspx_eval_c_if_2 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template82);

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
  private final static String _jspx_template9 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html>\r\n    <head>\r\n        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n        <title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n        <style type=\"text/css\">\r\n            <!--\r\n            body {\r\n                margin: 0px;\r\n                background-image: url(/img/left_back.gif);\r\n            }\r\n            -->\r\n        </style>\r\n        <link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n        <script language=\"javascript\" src=\"/js/common.js\"></script>\r\n        <script language=\"javascript\" src=\"/js/calculation.js\"></script>\r\n        <script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script>\r\n        <script language=\"javascript\" src=\"/js/Ajax_request.js\"></script>\r\n        <script>\r\n            var savable = 0;\r\n            function iFrameResize(obj)\r\n            {\r\n                var iFrm = obj;\r\n                var the_height = iFrm.contentWindow.document.body.scrollHeight;\r\n                iFrm.style.height = the_height;\r\n            }\r\n            function InitPage()\r\n            {\r\n            \tchangeTAXDATE();\r\n\r\n            \tif('";
  private final static String _jspx_template10 = "'.length > 0){\r\n\t\t\t\t\t\talert('";
  private final static String _jspx_template11 = "');\t\t\t\t\t\r\n                \t}\r\n\r\n            \tif('";
  private final static String _jspx_template12 = "' == '1'){\r\n                    location.href = \"/gapan/jumyong/productInsert.do?GAPAN_NO=";
  private final static String _jspx_template13 = "\";\r\n                }\r\n                setParentYear('";
  private final static String _jspx_template14 = "');\r\n\r\n                parent.document.getElementById(\"SEQ\").value = document.getElementById(\"SEQ\").value;\r\n\r\n                if(document.getElementById(\"mode\").value == \"edit\" || document.getElementById(\"mode\").value == \"add\"  )\r\n                {\r\n                    document.getElementById(\"view\").style.display = \"none\";\r\n\r\n                    document.getElementById(\"edit\").style.display= \"block\";\r\n                    document.getElementById(\"edit\").style.pixelTop = 0;\r\n                }else\r\n                {\r\n                    document.getElementById(\"edit\").style.display = \"none\";\r\n                    document.getElementById(\"view\").style.display = \"block\";\r\n                }\r\n\r\n                var cal_type = \"";
  private final static String _jspx_template15 = "\";\t\t//월단위 계산인지 일단위 계산인지 여부 알아내기\r\n                for(var i=1;i<cal_type.length+1;i++){\r\n                    if(cal_type.substring(i-1,i)==\"일\"){\r\n                        document.getElementById(\"date_type\").value=\"day\";\r\n                        document.getElementById(\"date_type1\").innerHTML = \"일수\";\r\n                        document.getElementById(\"date_type2\").innerHTML = \"일\";\r\n                        return;\r\n                    }else{\r\n                        document.getElementById(\"date_type1\").innerHTML = \"개월수\";\r\n                        document.getElementById(\"date_type2\").innerHTML = \"개월\";\r\n                    }\r\n                }\r\n\r\n                taxCdDelete('TAX_CD','212');\r\n            }\r\n\r\n\r\n            function submitClick()\r\n            {\r\n                var productForm = document.productForm;\r\n\r\n                if(productForm.PERIOD.value.length<1 || productForm.PERIOD.value==\"0\"){\r\n                    alert(\"개월수를 입력해주세요.\");\r\n                    if(confirm(\"개월수를 자동 계산하시겠습니까?\")){\r\n                        calDate();\r\n                        return;\r\n                    }else{\r\n                        productForm.PERIOD.value=\"\";\r\n                        productForm.PERIOD.focus();\r\n                        return;\r\n                    }\r\n                }\r\n                if(savable == 1)\r\n                {\r\n                \tif(!DataCheck()){\r\n                    \treturn;\r\n                \t}\r\n                    //comma제거\r\n                    removeComma2(\"PRICE\");\r\n                    removeComma2(\"SUM_LASTYEAR\");\r\n                    removeComma2(\"SUM_YEAR\");\r\n                    removeComma2(\"SUM_ADJUST\");\r\n                    removeComma2(\"VAT\");\r\n                    productForm.TAX_DATE.value = removeDash(productForm.TAX_DATE.value);\r\n                    productForm.OVERDATE.value = removeDash(productForm.OVERDATE.value);\r\n                    productForm.INDATE.value = removeDash(productForm.INDATE.value);\r\n\r\n                    productForm.submit();\r\n                }else{\r\n                    alert(\"산출 내역을 먼저 계산해 주십시오.\");\r\n                }\r\n            }\r\n\r\n             function subTabClick(hiddenSubTabName,visibleSubTabName)\r\n            {\r\n                document.getElementById(hiddenSubTabName).style.display = 'none';\r\n                document.getElementById(visibleSubTabName).style.display = 'block';\r\n            }\r\n\r\n            function goModify()\r\n            {\r\n                var area = document.getElementById(\"AREA_AFTER\").value        ;\r\n                var year = '";
  private final static String _jspx_template16 = "';\r\n                var seq = document.getElementById(\"SEQ\").value;\r\n                var sum_adjust = Number(removeComma(document.getElementById(\"SUM_ADJUST\").value));\r\n\r\n                if(area>=0)\r\n                {\r\n                    location.href = \"/gapan/jumyong/productInsert.do?GAPAN_NO=";
  private final static String _jspx_template17 = "&currentPage=";
  private final static String _jspx_template18 = "&countPerPage=";
  private final static String _jspx_template19 = "\"\r\n                        +\"&mode=edit&year=\"+year+\"&seq=\"+seq+\"&SECTION=";
  private final static String _jspx_template20 = "\";\r\n                }\r\n            }\r\n\r\n            function Calculate()\r\n            {\r\n                calDate();\r\n                        \t\r\n                var area_after = document.getElementById(\"AREA_AFTER\").value;\r\n                var period = document.getElementById(\"PERIOD\").value;\r\n                var rate = document.getElementById(\"RATE\").value;\r\n                var price = removeComma(document.getElementById(\"PRICE\").value);\r\n                var sum_lastyear = document.getElementById(\"SUM_LASTYEAR\").value;\r\n                var last_area_after = document.getElementById(\"LAST_AREA_AFTER\").value;\r\n                var reduction_rate = document.getElementById(\"REDUCTION_RATE\").value;\r\n\r\n                if(reduction_rate == \"\")\r\n                    reduction_rate = 0;\r\n\r\n                var sum_year = document.getElementById(\"SUM_YEAR\");\r\n                var sum_adjust = document.getElementById(\"SUM_ADJUST\");\r\n                var form = document.getElementById(\"FORM\");\r\n                var form_adjust = document.getElementById(\"FORM_ADJUST\");\r\n                var adjustment = document.getElementById(\"ADJUSTMENT\");\r\n                var vat = document.getElementById(\"VAT\");\r\n\r\n                if(price<=0){\r\n                    alert(\"공시지가를 넣어주세요.\");\r\n                    document.getElementById(\"PRICE\").value = \"\";\r\n                    document.getElementById(\"PRICE\").focus();\r\n                    return;\r\n                }\r\n\r\n                if(area_after<=0){\r\n                    alert(\"점용면적을 넣어주세요.\");\r\n                    document.getElementById(\"AREA_AFTER\").value = \"\";\r\n                    document.getElementById(\"AREA_AFTER\").focus();\r\n                    return;\r\n                }\r\n                if(document.getElementById(\"FROMDATE\").value==\"\" || document.getElementById(\"TODATE\").value==\"\"){\r\n                    if(confirm(\"개월수를 자동 계산하시겠습니까?\"))\r\n                        calDate();\r\n                }\r\n\r\n\r\n                if(document.getElementById(\"date_type\").value==\"month\"){\r\n                    sum_year.value = Math.floor(fixFloatCal(parseFloat(area_after)*fixFloatCal(parseFloat(period)/12)*parseFloat(rate)*parseFloat(price)*parseFloat((100-parseFloat(reduction_rate))/100)));\r\n                    form.value = area_after+\"㎡ X \"  +rate +\" X \" +insertComma2(price) +\" X \" + period + \"/12개월\";\r\n\r\n                }else if(document.getElementById(\"date_type\").value==\"day\"){\r\n                    var leafYear = f_leapyear(document.getElementById(\"YEAR\").value);\r\n                    sum_year.value = Math.floor(fixFloatCal(parseFloat(area_after)*fixFloatCal(parseFloat(period)/(365+leafYear))*parseFloat(rate)*parseFloat(price)*parseFloat((100-parseFloat(reduction_rate))/100)));\r\n                    form.value = area_after + \"㎡ X \" + rate +\" X \" +insertComma2(price)+\" X \"+ period + \"/\"+Number(365+leafYear)+\"일\";\r\n                }\r\n\r\n                if(reduction_rate == \"0.0\" || reduction_rate == \"0\" || reduction_rate == \"\"){\r\n                    form.value = form.value;\r\n                }else{\r\n                    form.value = form.value+\" X (100-\"+reduction_rate+\")/100\";\r\n                }\r\n\r\n                sum_year.value = insertComma2(Math.floor(sum_year.value/100)*100);\t\t//100원 절삭\r\n\r\n\r\n\r\n\r\n                var bak_sum_year;\r\n                if(last_area_after == '' || last_area_after == 0){\r\n                    bak_sum_year = Math.floor(fixFloatCal(parseFloat(area_after)*parseFloat(rate)*parseFloat(price)*parseFloat((100-parseFloat(reduction_rate))/100)));\r\n                }else{\r\n                    bak_sum_year = Math.floor(fixFloatCal(parseFloat(last_area_after)*parseFloat(rate)*parseFloat(price)*parseFloat((100-parseFloat(reduction_rate))/100)));\r\n                }\r\n\r\n                bak_sum_year = Math.floor(bak_sum_year/100)*100;\r\n                var jojung_rate = Math.floor(fixFloatCal((parseFloat(bak_sum_year) - parseFloat(removeComma(sum_lastyear)))/parseFloat(removeComma(sum_lastyear)))*100); // 현년도 작년도 점용료 비율\r\n                if(jojung_rate >= 10 && jojung_rate <=10000)//비율이 허용 범위내에 있을때\r\n                {\r\n";
  private final static String _jspx_template21 = "\r\n                \t  //adjustment.value = calJojung(jojung_rate);\r\n                    //adjustment.value = calJojungNew(jojung_rate); //시행령44조에의해 수정 #mr(2014.03.12)\r\n                \tadjustment.value = calJojung2015(jojung_rate);\t// 시행령69조에의해 수정 #mh(2016.01)\r\n                }else{\r\n                    adjustment.value = 1;\r\n                }\r\n\r\n                if(adjustment.value == 1){\r\n                    sum_adjust.value = sum_year.value;\r\n                    form_adjust.value = form.value;\r\n                }else{\r\n\r\n                    if(document.getElementById(\"date_type\").value==\"month\"){\r\n\r\n                        sum_adjust.value = fixFloatCal(parseFloat(removeComma(sum_lastyear))*parseFloat(adjustment.value)*fixFloatCal(parseFloat(period)/12));\r\n                        form_adjust.value = sum_lastyear + \"원 X \" +adjustment.value +\" X \"+ period + \"/12개월\";\r\n\r\n                    }else if(document.getElementById(\"date_type\").value==\"day\"){\r\n\r\n                        var leafYear = f_leapyear(document.getElementById(\"YEAR\").value);\r\n\r\n                        sum_adjust.value = fixFloatCal(parseFloat(removeComma(sum_lastyear))*parseFloat(adjustment.value)*fixFloatCal(parseFloat(period)/(365+leafYear)));\r\n                        form_adjust.value = sum_lastyear + \"원 X \" +adjustment.value +\" X \"+ period +Number(365+leafYear)+\"일\";\r\n                    }\r\n\r\n\r\n                    if(last_area_after == '' || last_area_after == 0){\r\n                        sum_adjust.value = insertComma2(Math.floor(sum_adjust.value/100)*100);\r\n\r\n                    }else{\r\n                        sum_adjust.value = insertComma2(Math.floor(fixFloatCal(parseFloat(sum_adjust.value)*fixFloatCal(parseFloat(area_after)/parseFloat(last_area_after)))/100)*100);\r\n                        form_adjust.value = form_adjust.value + \" X \" + area_after +\"㎡/\"+ last_area_after+\"㎡\";\r\n\r\n                    }\r\n                }\r\n\r\n\r\n                vat.value = insertComma2(Math.floor(fixFloatCal(parseFloat(removeComma(sum_adjust.value))/100))*10);\r\n                savable = 1;\r\n\r\n\r\n\r\n            }\r\n\r\n            // 추가 화면 이동\r\n            function goAdd(gapanNo,currentPage)\r\n            {\r\n                location.href(\"/gapan/jumyong/productInsert.do?GAPAN_NO=\"+gapanNo+\"&currentPage=\"+currentPage+\"&mode=add\");\r\n            }\r\n\r\n            function goDelete()        {\r\n                location.href(\"/gapan/jumyong/productInsert.do?GAPAN_NO=";
  private final static String _jspx_template22 = "&seq=";
  private final static String _jspx_template23 = "&mode=del\");\r\n\r\n            }\r\n\r\n\r\n            function showProductList()\r\n            {\r\n                var area = document.getElementById(\"AREA_AFTER\").value;\r\n                if(Number(area) < 0)\r\n                    openwin();\r\n            }\r\n\r\n\r\n            function openwin(){\r\n\r\n                var area = document.getElementById(\"AREA_AFTER\").value;\r\n\r\n                var year = document.getElementById(\"YEAR\").value;\r\n\r\n                var x= \"dialogwidth:700px;dialogHeight:600px;status:no;help:no\";\r\n\r\n                var mode = document.getElementById(\"mode\").value;\r\n\r\n                window.showModalDialog(\"/gapan/jumyong/junggi/productSubList.do?ADMIN_NO=";
  private final static String _jspx_template24 = "&area=\"+area+\"&year=\"+year+\"&mode=\"+mode, window,x);\r\n            }\r\n\r\n\r\n            //공시지가 팝업\r\n            function openLandPricePopUp()\r\n            {\r\n                var winW = 320;\r\n                var winH = 133;\r\n                var status =\"toolbar=no, location=no, directories=no, status=no, menubar=no, resizable=no, scrollbars=no, width=\"+winW+\", height=\"+winH+\", left=0, top=0\";\r\n                var gapanNo = document.getElementById(\"GAPAN_NO\").value;\r\n                var year = document.getElementById(\"YEAR\").value;\r\n                window.open('/gapan/officialLandPrice.do?GAPAN_NO='+gapanNo+'&year='+year, 'win', status);\r\n            }\r\n\r\n\r\n\t\t\tfunction changeTAXDATE(){\r\n                //과세날짜, 납기일내일자, 납기후일자 구하기  2009.08.31 pkh\r\n                var dateUtilObj = new dateUtil();\r\n        \t\t\r\n                var taxdate = document.getElementById(\"TAX_DATE\").value;\r\n                var taxdate_year = Number(taxdate.substr(0,4));\r\n                var taxdate_month = Number(taxdate.substr(5,2));\r\n                var indate_f = new Date(new Date(taxdate_year, taxdate_month, 1)-86400000).getDate();\r\n        \t\t\r\n                document.getElementById(\"INDATE\").value = taxdate.substr(0,4)+\"-\"+taxdate.substr(5,2)+\"-\"+indate_f;\r\n        \t\t\r\n                var indate = document.getElementById(\"INDATE\").value;\r\n        \t\t\r\n                var indate_year = Number(indate.substr(0,4));\r\n                var indate_month = Number(indate.substr(5,2));\r\n                if(indate_month==12){\r\n                    indate_year = indate_year+1;\r\n                    indate_month = 1;\r\n                }else{\r\n                    indate_month++;\r\n                }\r\n        \t\t\r\n                if(indate_month<10){\r\n                    indate_month = \"0\"+indate_month;\r\n                }\r\n                var over_date = new Date(new Date(indate_year, indate_month, 1)-86400000).getDate();\r\n        \t\t\r\n                document.getElementById(\"OVERDATE\").value = indate_year+\"-\"+indate_month+\"-\"+over_date;\r\n\r\n            }\r\n\r\n\r\n            function\tSemokInfo()\r\n        \t{\r\n        \t\tvar\tTAX_CD\t= document.getElementById(\"TAX_CD\").value;\r\n        \t\tvar\tSIGU_CD\t= document.getElementById(\"SIGU_CD\").value;\r\n        \t\tvar\tDEPT_CD\t= document.getElementById(\"DEPT_CD\").value;\r\n\r\n        \t\tif(TAX_CD != ''){\r\n        \t\t\tMessage_Display('MSG','MSGValue',1);\r\n\t        \t\tvar\tparams\t= \"TAX_CD=\" + TAX_CD + \"&SIGU_CD=\" + SIGU_CD + \"&DEPT_CD=\" + DEPT_CD;\r\n\t        \t\tsendRequest(\"/gapan/saewe/semokinfo.do\", params, \"GET\", Result_SemokInfo);\r\n        \t\t}\r\n        \t}\r\n        \t\r\n        \tfunction\tResult_SemokInfo(obj)\r\n        \t{\r\n        \t\tvar xmldoc \t= new ActiveXObject(\"Microsoft.XMLDOM\");\r\n                var form \t= document.productForm;\r\n                 \r\n        \t\tif(obj == \"\")\r\n        \t\t{\t\t\r\n        \t\t\tMessage_Display('MSG','MSGValue',0);\r\n        \t\t\talert(\"세목코드 실패!!\");\r\n\r\n        \t\t\treturn;\r\n        \t\t}\r\n        \t\t\r\n               \r\n\r\n                xmldoc.async\t= false;\r\n        \t\txmldoc.loadXML(obj);\r\n\r\n        \t\tform.ADD_SET.value\t\t= \txmldoc.getElementsByTagName(\"gasanRateGubun\").item(0).text;\r\n        \t\tform.ADD_SET_NM.value\t= \txmldoc.getElementsByTagName(\"gasanRateGubunNm\").item(0).text;\r\n        \t\t//form.ADD_YN.value\t\t=\txmldoc.getElementsByTagName(\"vatYn\").item(0).text;\r\n        \t\tform.SUBUSEO_CD.value\t=\txmldoc.getElementsByTagName(\"suBuseoCd\").item(0).text;\r\n        \t\tform.gasanRate.value\t=\txmldoc.getElementsByTagName(\"gasanRate\").item(0).text;\r\n        \t\tform.OCR_BUSEO_CD.value\t=\txmldoc.getElementsByTagName(\"ocrBuseoCd\").item(0).text;\r\n        \t\tform.OCR_SIGU_CD.value\t=\txmldoc.getElementsByTagName(\"ocrSiguCd\").item(0).text;\r\n\r\n        \t\tif(form.ADD_SET.value == '7'){\r\n            \t\tform.ADD_YN.value = 1;\r\n        \t\t}else{\r\n        \t\t\tform.ADD_YN.value = 0;\r\n        \t\t}\r\n\t\r\n        \t\t\r\n        \t\tMessage_Display('MSG','MSGValue',0);\r\n        \t}\r\n\r\n\r\n\r\n            function DataCheck()\r\n        \t{\r\n        \t\tvar form \t= document.productForm;\r\n        \t\tvar\tstr\t\t= \"\";\r\n        \t\t\r\n        \t\tif(form.TAX_GUBUN.value.length\t< 1){\r\n        \t\t\tstr\t+= \"과";
  private final static String _jspx_template25 = "세구분을 선택하세요\\n\";\r\n        \t\t\tform.TAX_GUBUN.focus();\r\n        \t\t}else if(form.TAX_CD.value.length\t< 1){\r\n        \t\t\tstr\t+= \"세목코드를 선택하세요\\n\";\r\n        \t\t\tform.TAX_CD.focus();\r\n        \t\t}else if(form.TAXPAYER_SET.value.length\t< 1){\r\n        \t\t\tstr\t+= \"납세자 구분을 선택하세요\\n\";\r\n        \t\t\tform.TAXPAYER_SET.focus();\r\n        \t\t}else if(form.LIVE.value.length\t< 1){\r\n        \t\t\tstr\t+= \"거주상태를 선택하세요\\n\";\r\n        \t\t\tform.LIVE.focus();\r\n        \t\t}else if(form.OBJ_SET.value.length\t< 1){\r\n        \t\t\tstr\t+= \"물건구분을 선택하세요.\\n\";\r\n        \t\t\tform.OBJ_SET.focus();\r\n        \t\t}else if(form.TAX_DATE.value.length\t< 1){\r\n        \t\t\tstr\t+= \"과세일자를 입력하세요\\n\";\r\n        \t\t\tform.TAX_DATE.focus();\r\n        \t\t}else if(form.INDATE.value.length\t< 1){\r\n        \t\t\tstr\t+= \"납기내일자를 입력하세요\\n\";\r\n        \t\t\tform.INDATE.focus();\r\n        \t\t}else if(form.OVERDATE.value < 110){\r\n        \t\t\tstr\t+= \"납기후일자를 입력하세요\\n\";\r\n        \t\t\tform.OVERDATE.focus();\r\n        \t\t}\r\n\r\n        \t\tif(str\t== \"\")\r\n        \t\t{\r\n        \t\t\treturn\ttrue;\r\n        \t\t}\r\n        \t\t\r\n        \t\talert(str);\r\n        \t\treturn\tfalse;\t\t\r\n        \t}\r\n\r\n        \tfunction taxCdDelete(target,code){\r\n        \t\tvar\ttargetObj = document.getElementById(target);\r\n        \t\tfor(var i = 1; i < targetObj.options.length ; i++){\r\n            \t\tif(targetObj.options[i].value.substring(2,5) != code){\r\n            \t\t\ttargetObj.options[i] = null;\r\n            \t\t\ti = 0;\r\n            \t\t}\r\n        \t\t}\r\n        \t}\r\n\r\n\r\n         \tfunction taxGubunCheck(){\r\n         \t\tvar\tTAX_GUBUN\t= document.getElementById(\"TAX_GUBUN\");\r\n         \t\tif(TAX_GUBUN.value == '3'){\r\n         \t\t\talert(\"신고분은 선택하실수 없습니다. 다시 선택하세요.\");\r\n         \t\t\tTAX_GUBUN.value = '';\r\n         \t\t\tTAX_GUBUN.focus();\r\n             \t\treturn false;\r\n         \t\t}\r\n         \t\treturn true;\r\n         \t}\r\n        \t\r\n\r\n            ///////////////////////////////////////////////////////////////////\r\n            var dateUtil = function() {\r\n                this.startObject = null;\r\n                this.endObject = null;\r\n                this.args = null;\r\n            };\r\n\r\n            dateUtil.prototype.formatLen = function(str) {\r\n                return str = (\"\"+str).length<2 ? \"0\"+str : str;\r\n            };\r\n\r\n            dateUtil.prototype.formatDate = function(dateObject, delimiter) {\r\n                delimiter = delimiter || \"-\";\r\n                return dateObject.getFullYear() + delimiter + this.formatLen(dateObject.getMonth() + 1) + delimiter + this.formatLen(dateObject.getDate());\r\n            };\r\n\r\n            dateUtil.prototype.toDay = function(delimiter) {\r\n                return this.formatDate(new Date(), \"-\");\r\n            };\r\n\r\n            dateUtil.prototype.calDate = function() {\r\n                var year = this.args.year == null ? 0 : Number(this.args.year);\r\n                var month = this.args.month == null ? 0 : Number(this.args.month);\r\n                var day = this.args.day == null ? 0 : Number(this.args.day);\r\n                var result = new Date();\r\n\r\n                result.setYear(result.getFullYear() + year);\r\n                result.setMonth(result.getMonth() + month);\r\n                result.setDate(result.getDate() + day-1);\r\n                return this.formatDate(result, \"-\");\r\n            };\r\n\r\n            dateUtil.prototype.setDate = function(startObject, endObject, args) {\r\n                this.startObject = startObject;\r\n                this.endObject = endObject;\r\n                this.args = args;\r\n\r\n                document.getElementById(this.startObject).value = this.calDate();\r\n                document.getElementById(this.endObject).value = this.toDay();\r\n            };\r\n\r\n\r\n            var dateUtilObj = new dateUtil();\r\n            ///////////////////////////////////////////////////////////////////\r\n            \r\n\t\t    function scrollAll() {\r\n\t\t    \t  document.all.leftDisplay2.scrollTop = document.all.mainDisplay2.scrollTop;\r\n\t\t    \t  document.all.topLine2.scrollLeft = document.all.mainDisplay2.scrollLeft;\r\n\t\t    }\r\n\r\n\t\t    function goLanprice(){\r\n        \t\tvar url = \"http://kras.seoul.go.kr/land_info/info/landprice/landprice.do\";\r\n        \t\tvar ";
  private final static String _jspx_template26 = "name = \"공시지가열람\";\r\n        \t\tvar size = \"width=800, height=900, scrollbars=yes, resizable=yes\";\r\n        \t\twindow.open(url, name, size);\r\n        \t}\r\n        </script>\r\n\r\n    </head>\r\n\r\n    <body onload=\"javascript:InitPage();\">\r\n        <form id=\"productForm\" name=\"productForm\" method=\"post\" action = \"/gapan/jumyong/productInsert.do\" >\r\n        \r\n\t\t\t<span id=\"MSG\" style=\"position:absolute;visibility:hidden;\">\r\n\t\t\t\t<img src=\"/img/wait.gif\" id=\"MSGValue\">\r\n\t\t\t</span>\r\n        \t \r\n            <input id=\"CAL_SUM_SEQ\" name=\"CAL_SUM_SEQ\" value=\"";
  private final static String _jspx_template27 = "\" type=\"hidden\" >\r\n            <input id = \"GAPAN_NO\" name=\"GAPAN_NO\" value=\"";
  private final static String _jspx_template28 = "\" type=\"hidden\" >\r\n            <input id=\"mode\" name=\"mode\" value=\"";
  private final static String _jspx_template29 = "\" type=\"hidden\" >\r\n            <input id=\"SEQ\" name=\"SEQ\" value=\"";
  private final static String _jspx_template30 = "\" type=\"hidden\" >\r\n            \r\n            <input type=\"hidden\" id=\"SIGU_CD\" name=\"SIGU_CD\" value=\"";
  private final static String _jspx_template31 = "\">\r\n            <input type=\"hidden\" id=\"DEPT_CD\" name=\"DEPT_CD\" value=\"";
  private final static String _jspx_template32 = "\">\r\n            \r\n            \r\n            \r\n\t\t\t<!--ajax 리턴값-->\r\n      <input type=\"hidden\" name=\"ADD_SET\"  id=\"ADD_SET\" value=\"\">\r\n\t\t\t<input type=\"hidden\" name=\"ADD_SET_NM\"  id=\"ADD_SET_NM\" value=\"\">\r\n\t\t\t<input type=\"hidden\" name=\"ADD_YN\"  id=\"ADD_YN\" value=\"\">\r\n\t\t\t<input type=\"hidden\" name=\"SUBUSEO_CD\"  id=\"SUBUSEO_CD\" value=\"\">\r\n\t\t\t<input type=\"hidden\" name=\"gasanRate\"  id=\"gasanRate\" value=\"\">\r\n\t\t\t<input type=\"hidden\" name=\"OCR_BUSEO_CD\"  id=\"OCR_BUSEO_CD\" value=\"\">\r\n\t\t\t<input type=\"hidden\" name=\"OCR_SIGU_CD\"  id=\"OCR_SIGU_CD\" value=\"\">\r\n            \r\n            <table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                <tr>\r\n                    <td class=\"contborder_purple\">\r\n                        <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                            <tr>\r\n                                <td>\r\n                                    <table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n                                        <tr>\r\n                                            <td height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">번호</td>\r\n                                            <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">기준연도</td>\r\n                                            <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">공시지가</td>\r\n                                            <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">면적</td>\r\n                                            <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">요율</td>\r\n                                            <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">산출기간</td>\r\n                                            <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">작년도 점용료 </td>\r\n                                            <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">현년도 점용료 </td>\r\n                                            <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조정 점용료 </td>\r\n\r\n                                        </tr>\r\n                                        ";
  private final static String _jspx_template33 = "\r\n                                            <tr onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\"\r\n                                                onclick=\"javascript:setParentYear('";
  private final static String _jspx_template34 = "');location.href('/gapan/jumyong/productInsert.do?GAPAN_NO=";
  private final static String _jspx_template35 = "&year=";
  private final static String _jspx_template36 = "&currentPage=";
  private final static String _jspx_template37 = "&countPerPage=";
  private final static String _jspx_template38 = "&year=";
  private final static String _jspx_template39 = "&seq=";
  private final static String _jspx_template40 = "&SECTION=";
  private final static String _jspx_template41 = "');\" style=\"cursor:pointer\" >\r\n                                                <td height=\"26\" align=\"center\">";
  private final static String _jspx_template42 = "</td>\r\n                                                <td align=\"center\">";
  private final static String _jspx_template43 = "</td>\r\n                                                <td align=\"center\">";
  private final static String _jspx_template44 = "</td>\r\n                                                <td align=\"center\">";
  private final static String _jspx_template45 = "</td>\r\n                                                <td align=\"center\">";
  private final static String _jspx_template46 = "</td>\r\n\r\n                                                <td align=\"center\">";
  private final static String _jspx_template47 = "~";
  private final static String _jspx_template48 = "</td>\r\n                                                <td align=\"center\">";
  private final static String _jspx_template49 = "</td>\r\n                                                <td align=\"center\">";
  private final static String _jspx_template50 = "</td>\r\n                                                <td align=\"center\">";
  private final static String _jspx_template51 = "</td>\r\n                                            </tr>\r\n                                        ";
  private final static String _jspx_template52 = "\r\n                                    </table></td>\r\n                            </tr>\r\n                            <tr>\r\n                                <td height=\"40\" align=\"center\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                                        <tr>\r\n                                            <td align=\"center\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n                                                    <tr>\r\n                                                        ";
  private final static String _jspx_template53 = "\r\n                                                    </tr>\r\n\r\n                                                </table></td>\r\n\r\n                                        </tr>\r\n                                        <tr>\r\n\r\n\r\n                                        </tr>\r\n                                    </table></td>\r\n                            </tr>\r\n\r\n                        </table>\r\n\r\n                        <div id=\"view\" style=\"width:100%;\">\r\n                            <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\r\n                                <tr>\r\n                                    <td>\r\n                                    \r\n                                    \t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n                                    \t    <tr>\r\n                                                <td height=\"26\" align=\"left\" colspan=\"4\">\r\n                                                    <span class=\"sub_stan_blue\">&nbsp; * 산출정보 </span>\r\n                                                </td>\r\n                                            </tr>\r\n                                            <tr>\r\n                                                <td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" >기준년도</td>\r\n                                                <td width=\"42%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    ";
  private final static String _jspx_template54 = "년\r\n                                                </td>\r\n                                                <td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">공시지가</td>\r\n                                                <td width=\"32%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    ";
  private final static String _jspx_template55 = "원\r\n                                                </td>\r\n                                            </tr>\r\n                                            <tr>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용면적</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    ";
  private final static String _jspx_template56 = "㎡\r\n                                                </td>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">요율/단가</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    ";
  private final static String _jspx_template57 = "\r\n                                                </td>\r\n                                            </tr>\r\n\r\n\r\n                                            <tr>\r\n                                                <td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">산출기간</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\r\n                                                    ";
  private final static String _jspx_template58 = " ~ ";
  private final static String _jspx_template59 = "\r\n                                                </td>\r\n                                                <td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\"><span id=\"date_type1\"></span></td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >";
  private final static String _jspx_template60 = "<span id=\"date_type2\"></span></td>\r\n                                            </tr>\r\n                                            \r\n                                            <tr>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">감면율 사유</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    ";
  private final static String _jspx_template61 = "\r\n                                                </td>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">감면율</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    ";
  private final static String _jspx_template62 = " %\r\n                                                </td>\r\n                                            </tr>\r\n\r\n                                            <tr>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조정 계수</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\r\n                                                    ";
  private final static String _jspx_template63 = "\r\n\r\n                                                </td>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">작년도 점용료</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    ";
  private final static String _jspx_template64 = " 원\r\n                                                </td>\r\n                                            </tr>\r\n\r\n                                            <tr>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">기본 산출식</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\r\n                                                    ";
  private final static String _jspx_template65 = "\r\n\r\n                                                </td>\r\n\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">현년도 점용료</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    ";
  private final static String _jspx_template66 = " 원\r\n                                                </td>\r\n\r\n\r\n\r\n                                            </tr>\r\n                                            <tr>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조정 산출식</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\r\n                                                    ";
  private final static String _jspx_template67 = "\r\n\r\n                                                </td>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조정 점용료</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\r\n                                                    ";
  private final static String _jspx_template68 = " 원\r\n\r\n                                                </td>\r\n\r\n\r\n                                            </tr>\r\n                                            <tr>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"2\">\r\n                                                </td>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">부가가치세</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    ";
  private final static String _jspx_template69 = " 원\r\n                                                </td>\r\n                                            </tr>\r\n\r\n\r\n\r\n                                        </table>\r\n                                        \r\n                                        \r\n                                \t</td>\r\n                                </tr>\r\n                                \r\n                                <tr>\r\n                                <td>\r\n                                </td>\r\n                                \r\n                                \r\n                                </tr>\r\n                                <tr>\r\n                                <td>\r\n                                <table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n                                            <tr>\r\n                                                <td colspan=\"6\" height=\"26px\" align=\"left\"  class=\"sub_table_b\">\r\n                                                <span class=\"sub_stan_blue\">&nbsp; * 부과정보 </span>\r\n                                            </tr>\r\n                                            <tr>\r\n                                                <td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">과세구분</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\">\r\n                                                    ";
  private final static String _jspx_template70 = "\r\n                                                </td>\r\n                                                <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">세목코드</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"5\" align=\"left\">\r\n                                                \t";
  private final static String _jspx_template71 = "\r\n                                                </td>\r\n                                            </tr>\r\n\r\n                                            <tr>\r\n                                                <td width=\"100px\" height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">거주상태</td>\r\n                                                <td width=\"150px\" bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\">\r\n                                                    ";
  private final static String _jspx_template72 = "\r\n\r\n                                                </td>\r\n                                                <td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">납세자구분</td>\r\n                                                <td width=\"150px\" bgcolor=\"eaeaea\" class=\"table_bl_left\"  align=\"left\">\r\n                                                    ";
  private final static String _jspx_template73 = "\r\n                                                </td>\r\n                                                <td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">물건구분</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\">\r\n                                                    ";
  private final static String _jspx_template74 = "\r\n                                                </td>\r\n                                            </tr>\r\n\r\n                                            <tr>\r\n                                                <td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">과세일자</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\">\r\n                                                    ";
  private final static String _jspx_template75 = "\r\n                                                </td>\r\n\r\n\r\n                                                <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">납기일자</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\" align=\"left\">\r\n                                                    <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n                                                        <tr>\r\n                                                            <td>\r\n                                                            \t납기내일자&nbsp;:&nbsp;";
  private final static String _jspx_template76 = "                                                    \r\n                                                            </td>\r\n                                                            <td>\r\n                                                            </td>\r\n                                                            <td>\r\n                                                                &nbsp;/&nbsp;납기후일자&nbsp;:&nbsp;";
  private final static String _jspx_template77 = "\r\n                                                            </td>\r\n                                                            <td>\r\n                                                            </td>\r\n                                                        </tr>\r\n                                                    </table>\r\n                                                </td>\r\n                                            </tr>\r\n                                        </table>\r\n                                \r\n                                </td>\r\n                                \r\n                                \r\n                                </tr>\r\n\r\n                                <tr>\r\n                                    <td height=\"40\" align=\"right\">\r\n                                ";
  private final static String _jspx_template78 = "\r\n                                    <table border=\"0\" width=\"100%\">\r\n                                        <tr>\r\n\r\n\r\n\r\n                                            <td >\r\n                                                <img src=\"/img/add_icon.gif\" alt=\"추가\" border=\"0\" onclick=\"goAdd('";
  private final static String _jspx_template79 = "','";
  private final static String _jspx_template80 = "')\" style=\"cursor:pointer\">\r\n                                            </td>\r\n                                        ";
  private final static String _jspx_template81 = "\r\n                                            ";
  private final static String _jspx_template82 = "\r\n                                                <td width=\"50\">\r\n                                                    <img src=\"/img/mod_icon.gif\" alt=\"수정\" border=\"0\" onclick=\"javascript:goModify()\" style=\"cursor:pointer\" >\r\n                                                </td>\r\n                                                <td width=\"50\">\r\n                                                    <img src=\"/img/del_icon3.gif\" alt=\"삭제\" border=\"0\" onclick=\"javascript:goDelete()\" style=\"cursor:pointer\" >\r\n                                                </td>\r\n                                            ";
  private final static String _jspx_template83 = "\r\n                                        ";
  private final static String _jspx_template84 = "\r\n                                        </tr>\r\n\r\n                                    </table>\r\n                                ";
  private final static String _jspx_template85 = "\r\n                                </td>\r\n                                </tr>\r\n\r\n\r\n                            </table>\r\n                        </div>\r\n                        <div id=\"edit\" style=\"width:100%;display:none;\">\r\n                            <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                                <tr>\r\n\r\n                                    <td>\r\n                                        <table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n                                            <tr>\r\n                                                <td height=\"26\" align=\"left\" colspan=\"4\">\r\n                                                    <span class=\"sub_stan_blue\">\r\n                                                    &nbsp; * 산출정보\r\n                                                    </span>\r\n                                                    <input style=\"float:right; font-size: 10.5px;\" class=\"sub_table_b\" type=\"button\" onclick=\"goLanprice()\" value=\"공시지가조회(서울 부동산정보조회 시스템)\">\r\n                                                </td>\r\n                                            </tr>\r\n\r\n                                            <tr>\r\n                                                <td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\"  style=\"direction:rtl\" >기준년도</td>\r\n                                                <td width=\"42%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    <input name=\"YEAR\" id=\"YEAR\" type=\"text\" value = \"";
  private final static String _jspx_template86 = "\" style=\"width:50px;ime-mode:disabled;\"  class=\"input_form1\"  onKeyDown=\"onlyNumberInput();\" style=\"text-align:right\">&nbsp년\r\n                                                </td>\r\n                                                <td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">공시지가</td>\r\n                                                <td width=\"32%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    <input name=\"PRICE\" ID=\"PRICE\" value=\"";
  private final static String _jspx_template87 = "\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" onkeyup=\"javascript:fn_addComma(this)\"  onKeyDown=\"onlyNumberInput();\" style=\"text-align:right\">원\r\n                                                    <img src=\"/img/landPrice.gif\" alt=\"공시지가조회\" height=\"18\" border=\"0\" style=\"cursor:pointer;padding-top:0px\" onclick=\"javascript:openLandPricePopUp()\";>\r\n                                                </td>\r\n                                            </tr>\r\n\r\n                                            <tr>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용면적</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    <input name=\"AREA_AFTER\" id=\"AREA_AFTER\" type=\"text\" class=\"input_form1\" style=\"width:50px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template88 = "\"   onKeyDown=\"onlyNumberInput();\" style=\"text-align:right\" onblur=\"showProductList();\" >㎡\r\n                                                </td>\r\n\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">요율/단가</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    <input name=\"RATE\"  id=\"RATE\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template89 = "\"  onKeyDown=\"onlyNumberInput();\" style=\"text-align:right\">\r\n                                                </td>\r\n                                            </tr>\r\n\r\n\r\n                                            <tr>\r\n                                                <td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">산출기간</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" ><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n                                                        <tr>\r\n                                                            <td>\r\n                                                                <input name=\"FROMDATE\" id=\"FROMDATE\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template90 = "\"  onKeyDown=\"onlyNumberInput();\"   onKeyDown=\"onlyNumberInput();\" maxlength=8>\r\n                                                            </td>\r\n                                                            <td>\r\n                                                                <img src=\"/img/calendar_icon.gif\" onclick=\"popUpCalendar(this, document.getElementById('FROMDATE'), 'yyyymmdd');\" style=\"cursor:pointer\" >\r\n                                                            </td>\r\n                                                            <td width=\"16\" align=\"center\">~</td>\r\n                                                            <td>\r\n                                                                <input name=\"TODATE\" id=\"TODATE\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template91 = "\"  onKeyDown=\"onlyNumberInput();\" maxlength=8>\r\n                                                            </td>\r\n                                                            <td>\r\n                                                                <img src=\"/img/calendar_icon.gif\" onclick=\"popUpCalendar(this, document.getElementById('TODATE'), 'yyyymmdd');\" style=\"cursor:pointer\" >\r\n                                                                <img src=\"/img/cal_month.gif\" alt=\"달수계산\" height=\"18\" border=\"0\" style=\"cursor:pointer\" onClick=\"javascript:calDate();\">\r\n\r\n                                                            </td>\r\n                                                        </tr>\r\n                                                    </table></td>\r\n\r\n                                                <td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">\r\n                                                    <select id=\"date_type\" class=\"input_form1\" onchange=\"javascript:calDate();\">\r\n                                                        <option value=\"month\">개월</option>\r\n                                                        <option value=\"day\">일</option>\r\n                                                    </select>수\r\n                                                </td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    <input name=\"PERIOD\" id =\"PERIOD\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value = \"";
  private final static String _jspx_template92 = "\"   onKeyDown=\"onlyNumberInput();\" style=\"text-align:right\">개월(일)\r\n                                                </td>\r\n\r\n                                            </tr>\r\n                                            <tr>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">감면율 사유</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    <input name=\"REDUCTION_REASON\" id=\"REDUCTION_REASON\" type=\"text\" class=\"input_form1\" style=\"width:300px\" value=\"";
  private final static String _jspx_template93 = "\">\r\n                                                </td>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">감면율</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    <input name=\"REDUCTION_RATE\" id=\"REDUCTION_RATE\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template94 = "\"  onKeyDown=\"onlyNumberInput();\" style=\"text-align:right\">%\r\n                                                </td>\r\n                                            </tr>\r\n                                            <tr>\r\n                                                <td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조정 계수</td>\r\n                                                <td width=\"42%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    <input name=\"ADJUSTMENT\" id=\"ADJUSTMENT\" type=\"text\" class=\"input_form1\" style=\"width:60px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template95 = "\"   onKeyDown=\"onlyNumberInput();\" style=\"text-align:right\">\r\n                                                </td>\r\n                                                <td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">작년도 점용료</td>\r\n                                                <td width=\"32%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    <input name=\"LAST_AREA_AFTER\" id=\"LAST_AREA_AFTER\" type=\"hidden\" value=\"";
  private final static String _jspx_template96 = "\">\r\n                                                    <input name=\"SUM_LASTYEAR\" id=\"SUM_LASTYEAR\" type=\"text\"  class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template97 = "\"   onKeyDown=\"onlyNumberInput();\" onkeyup=\"javascript:fn_addComma(this)\" style=\"text-align:right\">원\r\n                                                </td>\r\n                                            </tr>\r\n\r\n\r\n\r\n                                            <tr>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">기본 산출식</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    <input name=\"FORM\" id=\"FORM\" type=\"text\" class=\"input_form1\" style=\"width:300px\" value=\"";
  private final static String _jspx_template98 = "\">\r\n                                                </td>\r\n                                                <td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">현년도 점용료</td>\r\n                                                <td width=\"32%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    <input name=\"SUM_YEAR\" id=\"SUM_YEAR\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template99 = "\"   onKeyDown=\"onlyNumberInput();\" onkeyup=\"javascript:fn_addComma(this)\" style=\"text-align:right\">원\r\n                                                </td>\r\n                                            </tr>\r\n\r\n                                            <tr>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조정 산출식</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    <input name=\"FORM_ADJUST\" id=\"FORM_ADJUST\" type=\"text\" class=\"input_form1\" style=\"width:300px\" value=\"";
  private final static String _jspx_template100 = "\">\r\n                                                </td>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조정 점용료</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    <input name=\"SUM_ADJUST\" id=\"SUM_ADJUST\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template101 = "\"  onKeyDown=\"onlyNumberInput();\" onkeyup=\"javascript:fn_addComma(this)\" style=\"text-align:right\">원\r\n                                                    \r\n                                                </td>\r\n                                                \r\n\r\n\r\n                                            </tr>\r\n\r\n\r\n                                            <tr>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"2\">\r\n                                                </td>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">부가세</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    <input name=\"VAT\" id=\"VAT\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template102 = "\"  onKeyDown=\"onlyNumberInput();\" onkeyup=\"javascript:fn_addComma(this)\" style=\"text-align:right\">원\r\n                                                </td>\r\n                                            </tr>\r\n\r\n\r\n\r\n                                        </table>\r\n                                    </td>\r\n                                </tr>\r\n                                <tr>\r\n                                    <td height=\"26\" align=\"right\">\r\n                                        <img src=\"/img/accou_icon.gif\" alt=\"계산\" width=\"56\" height=\"18\" border=\"0\" onclick=\"javascript:Calculate();\" style=\"cursor:pointer\">\r\n                                    </td>\r\n\r\n                                </tr>\r\n\r\n                                <tr>\r\n                                    <td>\r\n                                        <table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n                                            <tr>\r\n                                                <td colspan=\"6\" height=\"26px\" align=\"left\"  class=\"sub_table_b\">\r\n                                                    <span class=\"sub_stan_blue\">&nbsp; * 부과정보 </span>\r\n                                                </td>\r\n                                            </tr>\r\n                                            <tr>\r\n                                                <td width=\"100px\" height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">과세구분</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\">\r\n                                                    <select name=\"TAX_GUBUN\" id=\"TAX_GUBUN\" class=\"essential\" style=\"width:100px\" onChange=\"taxGubunCheck();\">\r\n                                                        ";
  private final static String _jspx_template103 = "\r\n                                                    </select>\r\n                                                </td>\r\n                                                <td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">세목코드</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\" align=\"left\">\r\n                                                    <select name=\"TAX_CD\" id=\"TAX_CD\" class=\"essential\" style=\"width:220px\"  OnChange=\"SemokInfo();\">\r\n                                                        ";
  private final static String _jspx_template104 = "\r\n                                                    </select>\r\n                                                </td>\r\n                                            </tr>\r\n\r\n                                            <tr>\r\n                                                <td width=\"100px\" height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">거주상태</td>\r\n                                                <td width=\"100\" bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\">\r\n                                                    <select name=\"LIVE\" id=\"LIVE\" class=\"essential\" style=\"width:100px\">\r\n                                                        ";
  private final static String _jspx_template105 = "\r\n                                                    </select>\r\n\r\n                                                </td>\r\n                                                <td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">납세자구분</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\"  align=\"left\">\r\n                                                    <select name=\"TAXPAYER_SET\" id=\"TAXPAYER_SET\" class=\"essential\" style=\"width:220px\">\r\n                                                        ";
  private final static String _jspx_template106 = "\r\n                                                    </select>\r\n\r\n                                                </td>\r\n                                                <td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">물건구분</td>\r\n                                                <td width=\"100\" bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\">\r\n                                                    <select name=\"OBJ_SET\" id=\"OBJ_SET\" class=\"essential\" style=\"width:70px\">\r\n                                                        ";
  private final static String _jspx_template107 = "\r\n                                                    </select>\r\n                                                </td>\r\n                                            </tr>\r\n\r\n                                            <tr>\r\n                                                <td height=\"26px\" width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">과세일자</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\">\r\n                                                    <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n                                                        <tr>\r\n                                                            <td>\r\n                                                                <input name=\"TAX_DATE\" id=\"TAX_DATE\" type=\"text\" class=\"essential\" style=\"width:80px\" value=\"";
  private final static String _jspx_template108 = "\" onfocus=\"changeTAXDATE();\" onselect=\"changeTAXDATE();\">\r\n                                                            </td>\r\n                                                            <td>\r\n                                                                <a>\r\n                                                                    <img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, document.getElementById('TAX_DATE'), 'yyyymmdd')\" style=\"CURSOR: Hand;\">\r\n                                                                </a>\r\n                                                            </td>\r\n                                                        </tr>\r\n                                                    </table>\r\n                                                </td>\r\n\r\n\r\n                                                <td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">납기일자</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\" align=\"left\">\r\n                                                    <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n                                                        <tr>\r\n                                                            <td>\r\n                                                            \t납기내일자&nbsp;:&nbsp;<input name=\"INDATE\" id=\"INDATE\" type=\"text\" class=\"essential\" style=\"width:80px\" value=\"\" onFocus=\"\" readonly>\r\n                                                            </td>\r\n                                                            <td>\r\n                                                                <a>\r\n                                                                    <img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, document.getElementById('INDATE'), 'yyyymmdd')\" style=\"CURSOR: Hand;\">\r\n                                                                </a>\r\n                                                            </td>\r\n                                                            <td>\r\n                                                                &nbsp;/&nbsp;납기후일자&nbsp;:&nbsp;<input name=\"OVERDATE\" id=\"OVERDATE\" type=\"text\" class=\"essential\" style=\"width:80px\" value=\"\" readonly>\r\n                                                            </td>\r\n                                                            <td>\r\n                                                                <a>\r\n                                                                    <img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, document.getElementById('OVERDATE'), 'yyyymmdd')\" style=\"CURSOR: Hand;\">\r\n                                                                </a>\r\n                                                            </td>\r\n                                                        </tr>\r\n                                                    </table>\r\n                                                </td>\r\n                                            </tr>\r\n\r\n\r\n\r\n\r\n\r\n                                        </table>\r\n                                    </td>\r\n                                </tr>\r\n                                <tr>\r\n                                    <td height=\"40\" align=\"right\">\r\n                                ";
  private final static String _jspx_template109 = "\r\n                                    <img src=\"/img/can_icon.gif\" alt=\"취소\" border=\"0\" onclick=\"javascript:history.back();\" style=\"cursor:pointer\" >\r\n                                    <img src=\"/img/save_icon2.gif\" alt=\"저장\" width=\"56\" height=\"18\" border=\"0\" onClick=\"javascript:submitClick();\"  style=\"cursor:pointer\">\r\n                                ";
  private final static String _jspx_template110 = "\r\n                                </td>\r\n                                </tr>\r\n                            </table>\r\n                        </div>\r\n                    </td>\r\n                </tr>\r\n                <tr>\r\n                    <td height=\"10\">\r\n                    </td>\r\n                </tr>\r\n\r\n            </table>\r\n\r\n        </form>\r\n    </body>\r\n</html>\r\n\r\n";
}
