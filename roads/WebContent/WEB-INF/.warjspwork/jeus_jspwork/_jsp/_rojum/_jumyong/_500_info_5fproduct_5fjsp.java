package jeus_jspwork._jsp._rojum._jumyong;

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
      // jsp code [from=(33,123);to=(33,133)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${existOwner}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(39,20);to=(39,26)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ck_del}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(40,77);to=(40,85)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(42,34);to=(42,46)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(58,35);to=(58,47)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.FORM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(124,31);to=(124,43)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(130,77);to=(130,85)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(130,101);to=(130,112)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(130,129);to=(130,141)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${countPerPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(131,74);to=(131,81)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(134,89);to=(134,97)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(134,113);to=(134,124)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(134,141);to=(134,161)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${countPerPage        }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(135,74);to=(135,81)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(138,98);to=(138,106)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // jsp code [from=(138,122);to=(138,133)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);
      // jsp code [from=(138,150);to=(138,170)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${countPerPage        }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template26);
      // jsp code [from=(139,73);to=(139,79)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${gp_typ}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // jsp code [from=(139,91);to=(139,98)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template28);
      out.write(_jspx_template29);
      // jsp code [from=(264,71);to=(264,79)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template30);
      // jsp code [from=(264,87);to=(264,90)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${seq}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template31);
      // jsp code [from=(287,92);to=(287,100)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template32);
      out.write(_jspx_template33);
      out.write(_jspx_template34);
      // jsp code [from=(611,65);to=(611,84)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.CAL_SUM_SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template35);
      // jsp code [from=(612,61);to=(612,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template36);
      // jsp code [from=(613,53);to=(613,57)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mode}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template37);
      // jsp code [from=(614,52);to=(614,55)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${seq}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template38);
      // jsp code [from=(616,71);to=(616,77)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ORG_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template39);
      // jsp code [from=(617,71);to=(617,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${DEPT_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template40);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template60);
      // jsp code [from=(669,59);to=(669,76)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${strPageDivideForm}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template61);
      // jsp code [from=(701,55);to=(701,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template62);
      // jsp code [from=(705,55);to=(705,87)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.PRICE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

      out.write(_jspx_template63);
      // jsp code [from=(711,55);to=(711,73)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.AREA_AFTER}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template64);
      // jsp code [from=(715,55);to=(715,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template65);
      // jsp code [from=(724,55);to=(724,71)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.FROMDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template66);
      // jsp code [from=(724,77);to=(724,91)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.TODATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template67);
      // jsp code [from=(727,95);to=(727,109)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.PERIOD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template68);
      // jsp code [from=(734,55);to=(734,79)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.REDUCTION_REASON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template69);
      // jsp code [from=(738,55);to=(738,77)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.REDUCTION_RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template70);
      // jsp code [from=(746,55);to=(746,73)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.ADJUSTMENT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template71);
      // jsp code [from=(751,55);to=(751,94)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.SUM_LASTYEAR)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

      out.write(_jspx_template72);
      // jsp code [from=(759,55);to=(759,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.FORM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template73);
      // jsp code [from=(765,55);to=(765,90)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.SUM_YEAR)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

      out.write(_jspx_template74);
      // jsp code [from=(775,55);to=(775,74)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.FORM_ADJUST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template75);
      // jsp code [from=(781,55);to=(781,92)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.SUM_ADJUST)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

      out.write(_jspx_template76);
      // jsp code [from=(792,55);to=(792,85)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.VAT)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

      out.write(_jspx_template77);
      // jsp code [from=(820,55);to=(820,64)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TAX_GUBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template78);
      // jsp code [from=(824,52);to=(824,58)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TAX_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template79);
      // jsp code [from=(831,55);to=(831,59)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${LIVE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template80);
      // jsp code [from=(836,55);to=(836,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TAXPAYER_SET}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template81);
      // jsp code [from=(840,55);to=(840,62)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${OBJ_SET}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template82);
      // jsp code [from=(847,55);to=(847,85)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(product.TAX_DATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_1));

      out.write(_jspx_template83);
      // jsp code [from=(856,82);to=(856,110)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(product.INDATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_1));

      out.write(_jspx_template84);
      // jsp code [from=(861,98);to=(861,128)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(product.OVERDATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_1));

      out.write(_jspx_template85);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_0_fn(pageContext, null)) return;


      out.write(_jspx_template93);
      // jsp code [from=(923,105);to=(923,117)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template94);
      // jsp code [from=(927,94);to=(927,107)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.PRICE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template95);
      // jsp code [from=(935,173);to=(935,191)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.AREA_AFTER}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template96);
      // jsp code [from=(940,161);to=(940,173)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template97);
      // jsp code [from=(950,181);to=(950,197)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.FROMDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template98);
      // jsp code [from=(957,177);to=(957,191)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.TODATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template99);
      // jsp code [from=(974,168);to=(974,182)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.PERIOD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template100);
      // jsp code [from=(981,167);to=(981,191)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.REDUCTION_REASON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template101);
      // jsp code [from=(985,181);to=(985,203)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.REDUCTION_RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template102);
      // jsp code [from=(993,173);to=(993,191)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.ADJUSTMENT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template103);
      // jsp code [from=(997,127);to=(997,150)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.LAST_AREA_AFTER}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template104);
      // jsp code [from=(998,178);to=(998,217)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.SUM_LASTYEAR)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

      out.write(_jspx_template105);
      // jsp code [from=(1007,143);to=(1007,155)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.FORM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template106);
      // jsp code [from=(1011,169);to=(1011,185)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.SUM_YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template107);
      // jsp code [from=(1018,157);to=(1018,176)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.FORM_ADJUST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template108);
      // jsp code [from=(1022,173);to=(1022,191)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.SUM_ADJUST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template109);
      // jsp code [from=(1036,159);to=(1036,170)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.VAT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template110);
      // jsp code [from=(1064,59);to=(1064,72)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${taxation_part}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template111);
      // jsp code [from=(1084,59);to=(1084,77)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${taxpayer_residence}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template112);
      // jsp code [from=(1091,59);to=(1091,73)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${taxpayer_group}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template113);
      // jsp code [from=(1098,59);to=(1098,70)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${object_type}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template114);
      // jsp code [from=(1109,160);to=(1109,168)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TAX_DATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template115);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_3_fn(pageContext, null)) return;


      out.write(_jspx_template121);

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
            out.write(_jspx_template41);
            // jsp code [from=(649,86);to=(649,96)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template42);
            // jsp code [from=(649,154);to=(649,162)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template43);
            // jsp code [from=(649,171);to=(649,181)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template44);
            // jsp code [from=(649,197);to=(649,208)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template45);
            // jsp code [from=(649,225);to=(649,237)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${countPerPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template46);
            // jsp code [from=(649,246);to=(649,256)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template47);
            // jsp code [from=(649,264);to=(649,273)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template48);
            // jsp code [from=(649,285);to=(649,292)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template49);
            // jsp code [from=(650,82);to=(650,91)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${idx.count}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template50);
            // jsp code [from=(651,70);to=(651,80)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template51);
            // jsp code [from=(652,70);to=(652,100)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(board.PRICE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template52);
            // jsp code [from=(653,70);to=(653,86)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.AREA_AFTER}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template53);
            // jsp code [from=(654,70);to=(654,80)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template54);
            // jsp code [from=(656,70);to=(656,98)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(board.FROMDATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_1));

            out.write(_jspx_template55);
            // jsp code [from=(656,102);to=(656,128)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(board.TODATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_1));

            out.write(_jspx_template56);
            // jsp code [from=(657,70);to=(657,108)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(board.SUM_LASTYEAR) }",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template57);
            // jsp code [from=(658,70);to=(658,104)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(board.SUM_YEAR) }",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template58);
            // jsp code [from=(659,70);to=(659,106)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(board.SUM_ADJUST) }",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template59);

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
          out.write(_jspx_template86);
          // jsp code [from=(885,116);to=(885,124)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template87);
          // jsp code [from=(885,130);to=(885,141)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template88);
          // ----  c:if ---- invoke //
          if (_jspx_th_c_if_1_fn(pageContext, _jspx_th_c_if_0)) return true;


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
          out.write(_jspx_template116);
          // ----  c:if ---- invoke //
          if (_jspx_th_c_if_4_fn(pageContext, _jspx_th_c_if_3)) return true;


          out.write(_jspx_template118);
          // ----  c:if ---- invoke //
          if (_jspx_th_c_if_5_fn(pageContext, _jspx_th_c_if_3)) return true;


          out.write(_jspx_template120);

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
          out.write(_jspx_template89);
          // ----  c:if ---- invoke //
          if (_jspx_th_c_if_2_fn(pageContext, _jspx_th_c_if_1)) return true;


          out.write(_jspx_template91);

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
          out.write(_jspx_template117);

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
          out.write(_jspx_template119);

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
          out.write(_jspx_template90);

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
  private final static String _jspx_template1 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('������� ���ð��� ����Ǿ����ϴ�. �ٽ� ���� ���ֽñ� �ٶ��ϴ�.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template2 = "\r\n";
  private final static String _jspx_template3 = "\r\n";
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "  \r\n";
  private final static String _jspx_template6 = "  \r\n";
  private final static String _jspx_template7 = "\r\n";
  private final static String _jspx_template8 = "\r\n";
  private final static String _jspx_template9 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html>\r\n    <head>\r\n        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n        <title>::::: ����� ������������ý��� :::::</title>\r\n        <style type=\"text/css\">\r\n            <!--\r\n            body {\r\n                margin: 0px;\r\n                background-image: url(/img/left_back.gif);\r\n            }\r\n            -->\r\n        </style>\r\n        <link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n        <script language=\"javascript\" src=\"/js/common.js\"></script>\r\n        <script language=\"javascript\" src=\"/js/calculation.js\"></script>\r\n        <script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script>\r\n        <script language=\"javascript\" src=\"/js/Ajax_request.js\"></script>\r\n        <script>\r\n            var savable = 0;\r\n            function iFrameResize(obj)\r\n            {\r\n                var iFrm = obj;\r\n                var the_height = iFrm.contentWindow.document.body.scrollHeight;\r\n                iFrm.style.height = the_height + \"px\";\r\n            }\r\n            function InitPage()\r\n            {\r\n            \tif((document.getElementById(\"mode\").value == \"edit\" || document.getElementById(\"mode\").value == \"add\") && '";
  private final static String _jspx_template10 = "' == 'false'){\r\n                \talert(\"��� ������ �����մϴ�. ��� �������� ������ ������ �߰��� �ּ���.\");\r\n            \t}\r\n\t\t\t\t\r\n            \tchangeTAXDATE();\r\n\r\n            \tif('";
  private final static String _jspx_template11 = "' == '1'){\r\n                    location.href = \"/rojum/jumyong/rojumCal1.do?GAPAN_NO=";
  private final static String _jspx_template12 = "\";\r\n                }\r\n                setParentYear('";
  private final static String _jspx_template13 = "');\r\n\r\n                parent.document.getElementById(\"SEQ\").value = document.getElementById(\"SEQ\").value;\r\n\r\n                if(document.getElementById(\"mode\").value == \"edit\" || document.getElementById(\"mode\").value == \"add\"  )\r\n                {\r\n                    document.getElementById(\"view\").style.display = \"none\";\r\n\r\n                    document.getElementById(\"edit\").style.display= \"block\";\r\n                    document.getElementById(\"edit\").style.pixelTop = 0;\r\n                }else\r\n                {\r\n                    document.getElementById(\"edit\").style.display = \"none\";\r\n                    document.getElementById(\"view\").style.display = \"block\";\r\n                }\r\n\r\n                var cal_type = \"";
  private final static String _jspx_template14 = "\";\t\t//������ ������� �ϴ��� ������� ���� �˾Ƴ���\r\n                for(var i=1;i<cal_type.length;i++){\r\n                    if(cal_type.substring(i-1,i)==\"��\"){\r\n                        document.getElementById(\"date_type\").value=\"day\";\r\n                        document.getElementById(\"date_type1\").innerHTML = \"�ϼ�\";\r\n                        document.getElementById(\"date_type2\").innerHTML = \"��\";\r\n                    }else{\r\n                        document.getElementById(\"date_type1\").innerHTML = \"������\";\r\n                        document.getElementById(\"date_type2\").innerHTML = \"����\";\r\n                    }\r\n                }\r\n\t\t\t\t//********** BEGIN_KANG_20120409\r\n\t\t\t\t//taxCdDelete('TAX_CD','212');\r\n\t\t\t\ttaxCdDelete('TAX_CD','212101');\r\n\t\t\t\t//********** END_KANG_20120409\r\n                \r\n\t\t\t\t\r\n\t\t\t\t\r\n            }\r\n\r\n\r\n            function submitClick()\r\n            {\r\n                var productForm = document.productForm;\r\n\r\n                if(productForm.PERIOD.value.length<1 || productForm.PERIOD.value==\"0\"){\r\n                    alert(\"�������� �Է����ּ���.\");\r\n                    if(confirm(\"�������� �ڵ� ����Ͻðڽ��ϱ�?\")){\r\n                        calDate();\r\n                        return;\r\n                    }else{\r\n                        productForm.PERIOD.value=\"\";\r\n                        productForm.PERIOD.focus();\r\n                        return;\r\n                    }\r\n                }\r\n                if(savable == 1)\r\n                {\r\n                \tif(!DataCheck()){\r\n                    \treturn;\r\n                \t}\r\n                    //comma����\r\n                    removeComma2(\"PRICE\");\r\n                    removeComma2(\"SUM_LASTYEAR\");\r\n                    removeComma2(\"SUM_YEAR\");\r\n                    removeComma2(\"SUM_ADJUST\");\r\n                    removeComma2(\"VAT\");\r\n                    productForm.TAX_DATE.value = removeDash(productForm.TAX_DATE.value);\r\n                    productForm.OVERDATE.value = removeDash(productForm.OVERDATE.value);\r\n                    productForm.INDATE.value = removeDash(productForm.INDATE.value);\r\n\r\n                    productForm.submit();\r\n                }else{\r\n                    alert(\"���� ������ ���� ����� �ֽʽÿ�.\");\r\n                }\r\n            }\r\n\r\n             function subTabClick(hiddenSubTabName,visibleSubTabName)\r\n            {\r\n                document.getElementById(hiddenSubTabName).style.display = 'none';\r\n                document.getElementById(visibleSubTabName).style.display = 'block';\r\n            }\r\n\r\n            function goModify()\r\n            {\r\n                var area = document.getElementById(\"AREA_AFTER\").value        ;\r\n                var year = '";
  private final static String _jspx_template15 = "';\r\n                var seq = document.getElementById(\"SEQ\").value;\r\n                var sum_adjust = Number(removeComma(document.getElementById(\"SUM_ADJUST\").value));\r\n\r\n                if(area>=0)\r\n                {\r\n                    location.href = \"/rojum/jumyong/rojumCal1.do?GAPAN_NO=";
  private final static String _jspx_template16 = "&currentPage=";
  private final static String _jspx_template17 = "&countPerPage=";
  private final static String _jspx_template18 = "\"\r\n                        +\"&mode=edit&year=\"+year+\"&seq=\"+seq+\"&SECTION=";
  private final static String _jspx_template19 = "\";\r\n                }else if(sum_adjust <0)\r\n                {\r\n                    location.href = \"/rojum/jumyong/productSubtractInsert.do?GAPAN_NO=";
  private final static String _jspx_template20 = "&currentPage=";
  private final static String _jspx_template21 = "&countPerPage=";
  private final static String _jspx_template22 = "\"\r\n                        +\"&mode=edit&year=\"+year+\"&seq=\"+seq+\"&SECTION=";
  private final static String _jspx_template23 = "&area=\"+area;\r\n                }else\r\n                {\r\n                    location.href = \"/rojum/jumyong/productSubtractBeforeTaxInsert.do?GAPAN_NO=";
  private final static String _jspx_template24 = "&currentPage=";
  private final static String _jspx_template25 = "&countPerPage=";
  private final static String _jspx_template26 = "\"\r\n                        +\"&mode=edit&year=\"+year+\"&seq=\"+seq+\"&gp_typ=";
  private final static String _jspx_template27 = "&SECTION=";
  private final static String _jspx_template28 = "&area=\"+area;\r\n                }\r\n            }\r\n\r\n            function Calculate()\r\n            {\r\n                var area_after = document.getElementById(\"AREA_AFTER\").value;\r\n                var period = document.getElementById(\"PERIOD\").value;\r\n                var rate = document.getElementById(\"RATE\").value;\r\n                var price = removeComma(document.getElementById(\"PRICE\").value);\r\n                var sum_lastyear = document.getElementById(\"SUM_LASTYEAR\").value;\r\n                var last_area_after = document.getElementById(\"LAST_AREA_AFTER\").value;\r\n                var reduction_rate = document.getElementById(\"REDUCTION_RATE\").value;\r\n\r\n                if(reduction_rate == \"\")\r\n                    reduction_rate = 0;\r\n\r\n                var sum_year = document.getElementById(\"SUM_YEAR\");\r\n                var sum_adjust = document.getElementById(\"SUM_ADJUST\");\r\n                var form = document.getElementById(\"FORM\");\r\n                var form_adjust = document.getElementById(\"FORM_ADJUST\");\r\n                var adjustment = document.getElementById(\"ADJUSTMENT\");\r\n                var vat = document.getElementById(\"VAT\");\r\n\r\n                if(price<=0){\r\n                    alert(\"���������� �־��ּ���.\");\r\n                    document.getElementById(\"PRICE\").value = \"\";\r\n                    document.getElementById(\"PRICE\").focus();\r\n                    return;\r\n                }\r\n\r\n                if(area_after<=0){\r\n                    alert(\"��������� �־��ּ���.\");\r\n                    document.getElementById(\"AREA_AFTER\").value = \"\";\r\n                    document.getElementById(\"AREA_AFTER\").focus();\r\n                    return;\r\n                }\r\n                if(document.getElementById(\"FROMDATE\").value==\"\" || document.getElementById(\"TODATE\").value==\"\"){\r\n                    if(confirm(\"�������� �ڵ� ����Ͻðڽ��ϱ�?\"))\r\n                        calDate();\r\n                }\r\n\r\n\r\n                if(document.getElementById(\"date_type\").value==\"month\"){\r\n                    sum_year.value = Math.floor(fixFloatCal(parseFloat(area_after)*fixFloatCal(parseFloat(period)/12)*parseFloat(rate)*parseFloat(price)*parseFloat((100-parseFloat(reduction_rate))/100)));\r\n                    form.value = area_after+\"�� X \"  +rate +\" X \" +insertComma2(price) +\" X \" + period + \"/12����\";\r\n\r\n                }else if(document.getElementById(\"date_type\").value==\"day\"){\r\n                    var leafYear = f_leapyear(document.getElementById(\"YEAR\").value);\r\n                    sum_year.value = Math.floor(fixFloatCal(parseFloat(area_after)*fixFloatCal(parseFloat(period)/(365+leafYear))*parseFloat(rate)*parseFloat(price)*parseFloat((100-parseFloat(reduction_rate))/100)));\r\n                    form.value = area_after + \"�� X \" + rate +\" X \" +insertComma2(price)+\" X \"+ period + \"/\"+Number(365+leafYear)+\"��\";\r\n                }\r\n\r\n                if(reduction_rate == \"0.0\" || reduction_rate == \"0\" || reduction_rate == \"\"){\r\n                    form.value = form.value;\r\n                }else{\r\n                    form.value = form.value+\" X (100-\"+reduction_rate+\")/100\";\r\n                }\r\n\r\n                sum_year.value = insertComma2(Math.floor(sum_year.value/100)*100);\t\t//100�� ����\r\n\r\n\r\n\r\n\r\n                var bak_sum_year;\r\n                if(last_area_after == '' || last_area_after == 0){\r\n                    bak_sum_year = Math.floor(fixFloatCal(parseFloat(area_after)*parseFloat(rate)*parseFloat(price)*parseFloat((100-parseFloat(reduction_rate))/100)));\r\n                }else{\r\n                    bak_sum_year = Math.floor(fixFloatCal(parseFloat(last_area_after)*parseFloat(rate)*parseFloat(price)*parseFloat((100-parseFloat(reduction_rate))/100)));\r\n                }\r\n\r\n                bak_sum_year = Math.floor(bak_sum_year/100)*100;\r\n                var jojung_rate = Math.floor(fixFloatCal((parseFloat(bak_sum_year) - parseFloat(removeComma(sum_lastyear)))/parseFloat(removeComma(sum_lastyear)))*100); // ���⵵ �۳⵵ ����� ����\r\n                if(jojung_rate >= 10 && jojung_rate <=10000)//������ ��� �������� ������\r\n                {\r\n                    //adjustment.value = ca";
  private final static String _jspx_template29 = "lJojung(jojung_rate);\r\n                \tadjustment.value = calJojung2015(jojung_rate);\t// �����69�������� ���� #ny(2016.01.)\r\n                }else{\r\n                    adjustment.value = 1;\r\n                }\r\n\r\n                if(adjustment.value == 1){\r\n                    sum_adjust.value = sum_year.value;\r\n                    form_adjust.value = form.value;\r\n                }else{\r\n\r\n                    if(document.getElementById(\"date_type\").value==\"month\"){\r\n\r\n                        sum_adjust.value = fixFloatCal(parseFloat(removeComma(sum_lastyear))*parseFloat(adjustment.value)*fixFloatCal(parseFloat(period)/12));\r\n                        form_adjust.value = sum_lastyear + \"�� X \" +adjustment.value +\" X \"+ period + \"/12����\";\r\n\r\n                    }else if(document.getElementById(\"date_type\").value==\"day\"){\r\n\r\n                        var leafYear = f_leapyear(document.getElementById(\"YEAR\").value);\r\n\r\n                        sum_adjust.value = fixFloatCal(parseFloat(removeComma(sum_lastyear))*parseFloat(adjustment.value)*fixFloatCal(parseFloat(period)/(365+leafYear)));\r\n                        form_adjust.value = sum_lastyear + \"�� X \" +adjustment.value +\" X \"+ period +Number(365+leafYear)+\"��\";\r\n                    }\r\n\r\n\r\n                    if(last_area_after == '' || last_area_after == 0){\r\n                        sum_adjust.value = insertComma2(Math.floor(sum_adjust.value/100)*100);\r\n\r\n                    }else{\r\n                        sum_adjust.value = insertComma2(Math.floor(fixFloatCal(parseFloat(sum_adjust.value)*fixFloatCal(parseFloat(area_after)/parseFloat(last_area_after)))/100)*100);\r\n                        form_adjust.value = form_adjust.value + \" X \" + area_after +\"��/\"+ last_area_after+\"��\";\r\n\r\n                    }\r\n                }\r\n\r\n\r\n                vat.value = insertComma2(Math.floor(fixFloatCal(parseFloat(removeComma(sum_adjust.value))/100))*10);\r\n                savable = 1;\r\n\r\n\r\n\r\n            }\r\n\r\n            // �߰� ȭ�� �̵�\r\n            function goAdd(gapanNo,currentPage)\r\n            {\r\n                location.href(\"/rojum/jumyong/rojumCal1.do?GAPAN_NO=\"+gapanNo+\"&currentPage=\"+currentPage+\"&mode=add\");\r\n            }\r\n\r\n            function goDelete()        {\r\n                location.href(\"/rojum/jumyong/rojumCal1.do?GAPAN_NO=";
  private final static String _jspx_template30 = "&seq=";
  private final static String _jspx_template31 = "&mode=del\");\r\n\r\n            }\r\n\r\n\r\n            function showProductList()\r\n            {\r\n                var area = document.getElementById(\"AREA_AFTER\").value;\r\n                if(Number(area) < 0)\r\n                    openwin();\r\n            }\r\n\r\n\r\n            function openwin(){\r\n\r\n                var area = document.getElementById(\"AREA_AFTER\").value;\r\n\r\n                var year = document.getElementById(\"YEAR\").value;\r\n\r\n                var x= \"dialogwidth:700px;dialogHeight:600px;status:no;help:no\";\r\n\r\n                var mode = document.getElementById(\"mode\").value;\r\n\r\n                window.showModalDialog(\"/rojum/jumyong/junggi/productSubList.do?ADMIN_NO=";
  private final static String _jspx_template32 = "&area=\"+area+\"&year=\"+year+\"&mode=\"+mode, window,x);\r\n            }\r\n\r\n\r\n            //�������� �˾�\r\n            function openLandPricePopUp()\r\n            {\r\n                var winW = 320;\r\n                var winH = 133;\r\n                var status =\"toolbar=no, location=no, directories=no, status=no, menubar=no, resizable=no, scrollbars=no, width=\"+winW+\", height=\"+winH+\", left=0, top=0\";\r\n                var gapanNo = document.getElementById(\"GAPAN_NO\").value;\r\n                var year = document.getElementById(\"YEAR\").value;\r\n                window.open('/rojum/officialLandPrice.do?GAPAN_NO='+gapanNo+'&year='+year, 'win', status);\r\n            }\r\n\r\n\r\n\t\t\tfunction changeTAXDATE(){\r\n                //������¥, �����ϳ�����, ���������� ���ϱ�  2009.08.31 pkh\r\n                var dateUtilObj = new dateUtil();\r\n        \t\t\r\n                var taxdate = document.getElementById(\"TAX_DATE\").value;\r\n                var taxdate_year = Number(taxdate.substr(0,4));\r\n                var taxdate_month = Number(taxdate.substr(5,2));\r\n                var indate_f = new Date(new Date(taxdate_year, taxdate_month, 1)-86400000).getDate();\r\n        \t\t\r\n                document.getElementById(\"INDATE\").value = taxdate.substr(0,4)+\"-\"+taxdate.substr(5,2)+\"-\"+indate_f;\r\n        \t\t\r\n                var indate = document.getElementById(\"INDATE\").value;\r\n        \t\t\r\n                var indate_year = Number(indate.substr(0,4));\r\n                var indate_month = Number(indate.substr(5,2));\r\n                if(indate_month==12){\r\n                    indate_year = indate_year+1;\r\n                    indate_month = 1;\r\n                }else{\r\n                    indate_month++;\r\n                }\r\n        \t\t\r\n                if(indate_month<10){\r\n                    indate_month = \"0\"+indate_month;\r\n                }\r\n                var over_date = new Date(new Date(indate_year, indate_month, 1)-86400000).getDate();\r\n        \t\t\r\n                document.getElementById(\"OVERDATE\").value = indate_year+\"-\"+indate_month+\"-\"+over_date;\r\n\r\n            }\r\n\r\n\r\n            function\tSemokInfo()\r\n        \t{\r\n        \t\tvar\tTAX_CD\t= document.getElementById(\"TAX_CD\").value;\r\n        \t\tvar\tSIGU_CD\t= document.getElementById(\"SIGU_CD\").value;\r\n        \t\tvar\tDEPT_CD\t= document.getElementById(\"DEPT_CD\").value;\r\n\r\n        \t\tif(TAX_CD != ''){\r\n        \t\t\tMessageDisplay('MSG','MSGValue',1);\r\n\t        \t\tvar\tparams\t= \"TAX_CD=\" + TAX_CD + \"&SIGU_CD=\" + SIGU_CD + \"&DEPT_CD=\" + DEPT_CD;\r\n\t        \t\tsendRequest(\"/rojum/saewe/semokinfo.do\", params, \"GET\", Result_SemokInfo);\r\n        \t\t}\r\n        \t}\r\n\r\n\r\n\r\n        \t\r\n        \t\r\n        \tfunction\tResult_SemokInfo(obj)\r\n        \t{\r\n        \t\tvar xmldoc \t= new ActiveXObject(\"Microsoft.XMLDOM\");\r\n                var form \t= document.productForm;\r\n                 \r\n        \t\tif(obj == \"\")\r\n        \t\t{\t\t\r\n        \t\t\tMessageDisplay('MSG','MSGValue',0);\r\n        \t\t\talert(\"�����ڵ� ����!!\");\r\n    \t\t\t\t//�׽�Ʈ��\r\n            \t\tform.ADD_SET.value=\"1\"; \t\r\n            \t\tform.ADD_SET_NM.value=\"����\"; \t\r\n            \t\tform.ADD_YN.value=\"0\";\t\r\n            \t\tform.SUBUSEO_CD.value=\"3010078\";\t\r\n            \t\tform.gasanRate.value=\"0\";\t\r\n            \t\tform.OCR_BUSEO_CD.value=\"024\";\t\r\n            \t\tform.OCR_SIGU_CD.value=\"140\";\r\n        \t\t\treturn;\r\n        \t\t}\r\n        \t\t\r\n               \r\n\r\n                xmldoc.async\t= false;\r\n        \t\txmldoc.loadXML(obj);\r\n\r\n        \t\tform.ADD_SET.value\t\t= \txmldoc.getElementsByTagName(\"gasanRateGubun\").item(0).text;\r\n        \t\tform.ADD_SET_NM.value\t= \txmldoc.getElementsByTagName(\"gasanRateGubunNm\").item(0).text;\r\n        \t\tform.SUBUSEO_CD.value\t=\txmldoc.getElementsByTagName(\"suBuseoCd\").item(0).text;\r\n        \t\tform.gasanRate.value\t=\txmldoc.getElementsByTagName(\"gasanRate\").item(0).text;\r\n        \t\tform.OCR_BUSEO_CD.value\t=\txmldoc.getElementsByTagName(\"ocrBuseoCd\").item(0).text;\r\n        \t\tform.OCR_SIGU_CD.value\t=\txmldoc.getElementsByTagName(\"ocrSiguCd\").item(0).text;\r\n\r\n        \t\tif(form.ADD_SET.value == '7'){\r\n            \t\tform.ADD_YN.value = 1;\r\n        \t\t}else{\r\n        \t\t\tform.ADD_YN.value = 0;\r\n        \t\t}\r\n            \t\t\r\n\t\r\n       ";
  private final static String _jspx_template33 = " \t\t\r\n        \t\tMessageDisplay('MSG','MSGValue',0);\r\n        \t}\r\n\r\n\r\n            function\tTaxCodeInfo()\r\n        \t{\r\n        \t\tvar\tTAX_SET\t= getValueSelectTag(\"TAX_SET\");\r\n        \t\tvar\tparams\t= \"TAX_SET=\" + TAX_SET + \"&TAX_CD=212\";\r\n        \t\tsendRequest(\"/rojum/jumyong/taxcodeinfo.do\", params, \"GET\", Result_TaxCodeInfo);\r\n\r\n        \t}\r\n\r\n           \tfunction\tResult_TaxCodeInfo(obj)\r\n        \t{\r\n           \t\tfncSelectBoxSetting(obj, \"TAX_CD\", \"\", \"::����::\");\t           \r\n        \t}\r\n\r\n           \tfunction fncSelectBoxSetting(strParam, selectBoxId, defaultSel, topLabel)\r\n            {\r\n               \r\n                var xmldoc = new ActiveXObject(\"Microsoft.XMLDOM\");\r\n                var selectBoxLabel;\r\n                var root;\r\n                var selectBoxValue;\r\n                var opt \t= document.getElementById(selectBoxId);\r\n                var tags\t= \"\";\r\n                var\ttext\t= \"\";\r\n\r\n                for(var i = opt.options.length - 1 ; i > -1 ; i--)\r\n                {\r\n                    opt.options[i]\t= null;\r\n                }\r\n\r\n                xmldoc.async\t= false;\r\n\r\n                xmldoc.loadXML(strParam);\r\n\r\n\r\n                root = xmldoc.getElementsByTagName(\"option\").length;\r\n\r\n\r\n                if(root <= 0)\r\n                {\r\n                    tags \t= document.createElement(\"option\");\r\n                    text\t= document.createTextNode(\"\");\r\n                    tags.setAttribute(\"label\", \"\");\r\n                    tags.appendChild(text);\r\n                    tags.value = 0;\r\n                    opt.appendChild(tags);\r\n                    return;\r\n                }\r\n\r\n                if(topLabel != null && topLabel != \"\")\r\n                {\r\n                    tags \t= document.createElement(\"option\");\r\n                    text\t= document.createTextNode(topLabel);\r\n                    tags.setAttribute(\"label\", topLabel);\r\n                    tags.appendChild(text);\r\n                    tags.value = '';\r\n                    opt.appendChild(tags);\r\n                }\r\n\r\n                for(var i = 0; i < root; i++)\r\n                {\r\n\r\n                    selectBoxValue = xmldoc.getElementsByTagName(\"option/@value\").item(i).text;\r\n                    selectBoxLabel = xmldoc.getElementsByTagName(\"option/@label\").item(i).text;\r\n\r\n                    tags \t= document.createElement(\"option\");\r\n                    text\t= document.createTextNode(selectBoxLabel);\r\n\r\n                    tags.setAttribute(\"label\", selectBoxLabel);\r\n\r\n                    tags.value = selectBoxValue;\r\n                    tags.appendChild(text);\r\n                    opt.appendChild(tags);\r\n                }\r\n            \t//********** BEGIN_KANG_20120409\r\n \t           \t taxCdDelete('TAX_CD','212101');\r\n \t           \t//********** END_KANG_20120409\r\n            }\r\n\r\n        \t\r\n\r\n\r\n\r\n            function DataCheck()\r\n        \t{\r\n        \t\tvar form \t= document.productForm;\r\n        \t\tvar\tstr\t\t= \"\";\r\n        \t\t\r\n        \t\tif(form.TAX_GUBUN.value.length\t< 1){\r\n        \t\t\tstr\t+= \"���������� �����ϼ���\\n\";\r\n        \t\t\tform.TAX_GUBUN.focus();\r\n        \t\t}else if(form.TAX_CD.value.length\t< 1){\r\n        \t\t\tstr\t+= \"�����ڵ带 �����ϼ���\\n\";\r\n        \t\t\tform.TAX_CD.focus();\r\n        \t\t}else if(form.TAXPAYER_SET.value.length\t< 1){\r\n        \t\t\tstr\t+= \"������ ������ �����ϼ���\\n\";\r\n        \t\t\tform.TAXPAYER_SET.focus();\r\n        \t\t}else if(form.LIVE.value.length\t< 1){\r\n        \t\t\tstr\t+= \"���ֻ��¸� �����ϼ���\\n\";\r\n        \t\t\tform.LIVE.focus();\r\n        \t\t}else if(form.OBJ_SET.value.length\t< 1){\r\n        \t\t\tstr\t+= \"���Ǳ����� �����ϼ���.\\n\";\r\n        \t\t\tform.OBJ_SET.focus();\r\n        \t\t}else if(form.TAX_DATE.value.length\t< 1){\r\n        \t\t\tstr\t+= \"�������ڸ� �Է��ϼ���\\n\";\r\n        \t\t\tform.TAX_DATE.focus();\r\n        \t\t}else if(form.INDATE.value.length\t< 1){\r\n        \t\t\tstr\t+= \"���⳻���ڸ� �Է��ϼ���\\n\";\r\n        \t\t\tform.INDATE.focus();\r\n        \t\t}else if(form.OVERDATE.value < 110){\r\n        \t\t\tstr\t+= \"���������ڸ� �Է��ϼ���\\n\";\r\n        \t\t\tform.OVERDATE.focus();\r\n        \t\t}\r\n\r\n        \t\tif(str\t== \"\")\r\n        \t\t{\r\n        \t\t\treturn\ttrue;\r\n        \t\t}\r\n        \t\t\r\n        \t\talert(str);\r\n        \t\treturn\tfalse;\t\t\r\n       ";
  private final static String _jspx_template34 = " \t}\r\n\r\n            function taxCdDelete(target,code){\r\n        \t\tvar\ttargetObj = document.getElementById(target);\r\n        \t\tfor(var i = 1; i < targetObj.options.length ; i++){\r\n        \t\t\t//********** BEGIN_KANG_20120409\r\n            \t\t//if(targetObj.options[i].value.substring(2,5) != code){\r\n            \t\tif(targetObj.options[i].value.substring(2,8) != code){\r\n            \t\t//********** END_KANG_20120409\r\n            \t\t\ttargetObj.options[i] = null;\r\n            \t\t\ti = 0;\r\n            \t\t}\r\n        \t\t}\r\n        \t}\r\n\r\n         \tfunction taxGubunCheck(){\r\n         \t\tvar\tTAX_GUBUN\t= document.getElementById(\"TAX_GUBUN\");\r\n         \t\tif(TAX_GUBUN.value == '3'){\r\n         \t\t\talert(\"�Ű���� �����ϽǼ� �����ϴ�. �ٽ� �����ϼ���.\");\r\n         \t\t\tTAX_GUBUN.value = '';\r\n         \t\t\tTAX_GUBUN.focus();\r\n             \t\treturn false;\r\n         \t\t}\r\n         \t\treturn true;\r\n         \t}\r\n        \t\r\n\r\n            ///////////////////////////////////////////////////////////////////\r\n            var dateUtil = function() {\r\n                this.startObject = null;\r\n                this.endObject = null;\r\n                this.args = null;\r\n            };\r\n\r\n            dateUtil.prototype.formatLen = function(str) {\r\n                return str = (\"\"+str).length<2 ? \"0\"+str : str;\r\n            };\r\n\r\n            dateUtil.prototype.formatDate = function(dateObject, delimiter) {\r\n                delimiter = delimiter || \"-\";\r\n                return dateObject.getFullYear() + delimiter + this.formatLen(dateObject.getMonth() + 1) + delimiter + this.formatLen(dateObject.getDate());\r\n            };\r\n\r\n            dateUtil.prototype.toDay = function(delimiter) {\r\n                return this.formatDate(new Date(), \"-\");\r\n            };\r\n\r\n            dateUtil.prototype.calDate = function() {\r\n                var year = this.args.year == null ? 0 : Number(this.args.year);\r\n                var month = this.args.month == null ? 0 : Number(this.args.month);\r\n                var day = this.args.day == null ? 0 : Number(this.args.day);\r\n                var result = new Date();\r\n\r\n                result.setYear(result.getFullYear() + year);\r\n                result.setMonth(result.getMonth() + month);\r\n                result.setDate(result.getDate() + day-1);\r\n                return this.formatDate(result, \"-\");\r\n            };\r\n\r\n            dateUtil.prototype.setDate = function(startObject, endObject, args) {\r\n                this.startObject = startObject;\r\n                this.endObject = endObject;\r\n                this.args = args;\r\n\r\n                document.getElementById(this.startObject).value = this.calDate();\r\n                document.getElementById(this.endObject).value = this.toDay();\r\n            };\r\n\r\n\r\n            var dateUtilObj = new dateUtil();\r\n            ///////////////////////////////////////////////////////////////////\r\n            \r\n\t\t    function scrollAll() {\r\n\t\t    \t  document.all.leftDisplay2.scrollTop = document.all.mainDisplay2.scrollTop;\r\n\t\t    \t  document.all.topLine2.scrollLeft = document.all.mainDisplay2.scrollLeft;\r\n\t\t    }\r\n\r\n\t\t    function goLanprice(){\r\n        \t\tvar url = \"http://kras.seoul.go.kr/land_info/info/landprice/landprice.do\";\r\n        \t\tvar name = \"������������\";\r\n        \t\tvar size = \"width=800, height=900, scrollbars=yes, resizable=yes\";\r\n        \t\twindow.open(url, name, size);\r\n        }\r\n        </script>\r\n\r\n    </head>\r\n\r\n    <body onload=\"javascript:InitPage();\">\r\n    \t\r\n        <form name=\"productForm\" id=\"productForm\" method=\"post\" action = \"/rojum/jumyong/rojumCal1.do\" >\r\n        \r\n\t\t\t<span id=\"MSG\" style=\"position:absolute;display: none;\">\r\n\t\t\t\t<img src=\"/img/LoadingBar.gif\" id=\"MSGValue\">\r\n\t\t\t</span>\r\n        \t \r\n            <input id=\"CAL_SUM_SEQ\" name=\"CAL_SUM_SEQ\" value=\"";
  private final static String _jspx_template35 = "\" type=\"hidden\" >\r\n            <input id = \"GAPAN_NO\" name=\"GAPAN_NO\" value=\"";
  private final static String _jspx_template36 = "\" type=\"hidden\" >\r\n            <input id = \"mode\" name=\"mode\" value=\"";
  private final static String _jspx_template37 = "\" type=\"hidden\" >\r\n            <input id = \"SEQ\" name=\"SEQ\"  value=\"";
  private final static String _jspx_template38 = "\" type=\"hidden\" >\r\n            \r\n            <input type=\"hidden\" name=\"SIGU_CD\" id=\"SIGU_CD\" value=\"";
  private final static String _jspx_template39 = "\">\r\n            <input type=\"hidden\" name=\"DEPT_CD\" id=\"DEPT_CD\" value=\"";
  private final static String _jspx_template40 = "\">\r\n            \r\n\t\t\t<!--ajax ���ϰ�-->\r\n            <input type=\"hidden\" id=\"ADD_SET\" name=\"ADD_SET\" value=\"\">\r\n\t\t\t<input type=\"hidden\" id=\"ADD_SET_NM\" name=\"ADD_SET_NM\"  value=\"\">\r\n\t\t\t<input type=\"hidden\" id=\"ADD_YN\" name=\"ADD_YN\" value=\"\">\r\n\t\t\t<input type=\"hidden\" id=\"SUBUSEO_CD\" name=\"SUBUSEO_CD\" value=\"\">\r\n\t\t\t<input type=\"hidden\" id=\"gasanRate\" name=\"gasanRate\" value=\"\">\r\n\t\t\t<input type=\"hidden\" id=\"OCR_BUSEO_CD\" name=\"OCR_BUSEO_CD\" value=\"\">\r\n\t\t\t<input type=\"hidden\" id=\"OCR_SIGU_CD\" name=\"OCR_SIGU_CD\" value=\"\">\r\n            \r\n            <table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                <tr>\r\n                    <td class=\"contborder_purple\">\r\n                        <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                            <tr>\r\n                                <td>\r\n                                    <table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n                                        <tr>\r\n                                            <td width=\"40px\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">��ȣ</td>\r\n                                            <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">���ؿ���</td>\r\n                                            <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">��������</td>\r\n                                            <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">����</td>\r\n                                            <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">����</td>\r\n                                            <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">����Ⱓ</td>\r\n                                            <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">�۳⵵ ����� </td>\r\n                                            <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">���⵵ ����� </td>\r\n                                            <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">���� ����� </td>\r\n\r\n                                        </tr>\r\n                                        ";
  private final static String _jspx_template41 = "\r\n                                            <tr onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\"\r\n                                                onclick=\"javascript:setParentYear('";
  private final static String _jspx_template42 = "');location.href('/rojum/jumyong/rojumCal1.do?GAPAN_NO=";
  private final static String _jspx_template43 = "&year=";
  private final static String _jspx_template44 = "&currentPage=";
  private final static String _jspx_template45 = "&countPerPage=";
  private final static String _jspx_template46 = "&year=";
  private final static String _jspx_template47 = "&seq=";
  private final static String _jspx_template48 = "&SECTION=";
  private final static String _jspx_template49 = "');\" style=\"cursor:pointer\" >\r\n                                                <td height=\"26\" align=\"center\">";
  private final static String _jspx_template50 = "</td>\r\n                                                <td align=\"center\">";
  private final static String _jspx_template51 = "</td>\r\n                                                <td align=\"center\">";
  private final static String _jspx_template52 = "</td>\r\n                                                <td align=\"center\">";
  private final static String _jspx_template53 = "</td>\r\n                                                <td align=\"center\">";
  private final static String _jspx_template54 = "</td>\r\n\r\n                                                <td align=\"center\">";
  private final static String _jspx_template55 = "~";
  private final static String _jspx_template56 = "</td>\r\n                                                <td align=\"center\">";
  private final static String _jspx_template57 = "</td>\r\n                                                <td align=\"center\">";
  private final static String _jspx_template58 = "</td>\r\n                                                <td align=\"center\">";
  private final static String _jspx_template59 = "</td>\r\n                                            </tr>\r\n                                        ";
  private final static String _jspx_template60 = "\r\n                                    </table></td>\r\n                            </tr>\r\n                            <tr>\r\n                                <td height=\"40\" align=\"center\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                                        <tr>\r\n                                            <td align=\"center\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n                                                    <tr>\r\n                                                        ";
  private final static String _jspx_template61 = "\r\n                                                    </tr>\r\n\r\n                                                </table></td>\r\n\r\n                                        </tr>\r\n                                        <tr>\r\n\r\n\r\n                                        </tr>\r\n                                    </table></td>\r\n                            </tr>\r\n\r\n                        </table>\r\n\r\n                        <div id=\"view\" style=\"width:100%;\">\r\n                            <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\r\n                                <tr>\r\n                                    <td>\r\n                                    \r\n                                    \t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n                                    \t    <tr>\r\n                                                <td height=\"26\" align=\"left\" colspan=\"4\">\r\n                                                    <span class=\"sub_stan_blue\">&nbsp; * ��������</span>\r\n                                                </td>\r\n                                            </tr>\r\n<!-- hoban : ������� ����� ���⳻���� ���س⵵ ~ ������ -->\r\n                                            <!-- checked by sam Lee start --> \r\n                                            <tr>\r\n                                                <td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" >���س⵵</td>\r\n                                                <td width=\"42%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    ";
  private final static String _jspx_template62 = "��\r\n                                                </td>\r\n                                                <td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">��������</td>\r\n                                                <td width=\"32%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    ";
  private final static String _jspx_template63 = "��\r\n                                                </td>\r\n                                            </tr>\r\n                                            <tr>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">�������</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    ";
  private final static String _jspx_template64 = "��\r\n                                                </td>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">����/�ܰ�</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    ";
  private final static String _jspx_template65 = "\r\n                                                </td>\r\n                                            </tr>\r\n\r\n\r\n                                            <tr>\r\n                                                <td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">����Ⱓ</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\r\n                                                    ";
  private final static String _jspx_template66 = " ~ ";
  private final static String _jspx_template67 = "\r\n                                                </td>\r\n                                                <td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\"><span id=\"date_type1\"></span></td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >";
  private final static String _jspx_template68 = "<span id=\"date_type2\"></span></td>\r\n                                            </tr>\r\n<!-- hoban : ������� ����� ���⳻���� ���س⵵ ~ ������ -->                                            \r\n                                            <!-- checked by Sam Lee start --> \r\n                                            <tr>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">������ ����</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    ";
  private final static String _jspx_template69 = "\r\n                                                </td>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">������</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    ";
  private final static String _jspx_template70 = " %\r\n                                                </td>\r\n                                            </tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<!-- checked by sam Lee end2-->\r\n                                            <tr>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">���� ���</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\r\n                                                    ";
  private final static String _jspx_template71 = "\r\n\r\n                                                </td>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">�۳⵵ �����</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    ";
  private final static String _jspx_template72 = " ��\r\n                                                </td>\r\n                                            </tr>\r\n\r\n                                            <tr>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">�⺻ �����</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\r\n                                                    ";
  private final static String _jspx_template73 = "\r\n\r\n                                                </td>\r\n\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">���⵵ �����</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    ";
  private final static String _jspx_template74 = " ��\r\n                                                </td>\r\n\r\n\r\n\r\n                                            </tr>\r\n                                            <tr>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">���� �����</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\r\n                                                    ";
  private final static String _jspx_template75 = "\r\n\r\n                                                </td>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">���� �����</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\r\n                                                    ";
  private final static String _jspx_template76 = " ��\r\n\r\n                                                </td>\r\n\r\n\r\n                                            </tr>\r\n                                            <tr>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"2\">\r\n                                                </td>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">�ΰ���ġ��</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    ";
  private final static String _jspx_template77 = " ��\r\n                                                </td>\r\n                                            </tr>\r\n\r\n\r\n\r\n                                        </table>\r\n                                        \r\n                                        \r\n                                \t</td>\r\n                                </tr>\r\n                                \r\n                                <tr>\r\n                                <td>\r\n                                </td>\r\n                                \r\n                                \r\n                                </tr>\r\n                                <tr>\r\n                                <td>\r\n                                <table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n                                            <tr>\r\n                                                <td colspan=\"6\" height=\"26px\" align=\"left\"  class=\"sub_table_b\">\r\n                                                <span class=\"sub_stan_blue\">&nbsp; * �ΰ����� </span>\r\n                                            </tr>\r\n                                            <tr>\r\n                                                <td width=\"100px\" height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">��������</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\">\r\n                                                    ";
  private final static String _jspx_template78 = "\r\n                                                </td>\r\n                                                <td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">�����ڵ�</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\" align=\"left\">\r\n                                                \t";
  private final static String _jspx_template79 = "\r\n                                                </td>\r\n                                            </tr>\r\n\r\n                                            <tr>\r\n                                                <td width=\"100px\" height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">���ֻ���</td>\r\n                                                <td width=\"100px\" bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\">\r\n                                                    ";
  private final static String _jspx_template80 = "\r\n\r\n                                                </td>\r\n                                                <td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">�����ڱ���</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\"  align=\"left\">\r\n                                                    ";
  private final static String _jspx_template81 = "\r\n                                                </td>\r\n                                                <td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">���Ǳ���</td>\r\n                                                <td width=\"100px\" bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\">\r\n                                                    ";
  private final static String _jspx_template82 = "\r\n                                                </td>\r\n                                            </tr>\r\n\r\n                                            <tr>\r\n                                                <td height=\"26px\" width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">��������</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\">\r\n                                                    ";
  private final static String _jspx_template83 = "\r\n                                                </td>\r\n\r\n\r\n                                                <td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">��������</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\" align=\"left\">\r\n                                                    <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n                                                        <tr>\r\n                                                            <td>\r\n                                                            \t���⳻����&nbsp;:&nbsp;";
  private final static String _jspx_template84 = "                                                    \r\n                                                            </td>\r\n                                                            <td>\r\n                                                            </td>\r\n                                                            <td>\r\n                                                                &nbsp;/&nbsp;����������&nbsp;:&nbsp;";
  private final static String _jspx_template85 = "\r\n                                                            </td>\r\n                                                            <td>\r\n                                                            </td>\r\n                                                        </tr>\r\n                                                    </table>\r\n                                                </td>\r\n                                            </tr>\r\n                                        </table>\r\n                                \r\n                                </td>\r\n                                \r\n                                \r\n                                </tr>\r\n\r\n                                <tr>\r\n                                    <td height=\"40\" align=\"right\">\r\n                                ";
  private final static String _jspx_template86 = "\r\n                                    <table border=\"0\" width=\"100%\">\r\n                                        <tr>\r\n\r\n\r\n\r\n                                            <td >\r\n                                                <img src=\"/img/add_icon.gif\" alt=\"�߰�\" border=\"0\" onclick=\"goAdd('";
  private final static String _jspx_template87 = "','";
  private final static String _jspx_template88 = "')\" style=\"cursor:pointer\">\r\n                                            </td>\r\n                                        ";
  private final static String _jspx_template89 = "\r\n                                            ";
  private final static String _jspx_template90 = "\r\n                                                <td width=\"50\">\r\n                                                    <img src=\"/img/mod_icon.gif\" alt=\"����\" border=\"0\" onclick=\"javascript:goModify()\" style=\"cursor:pointer\" >\r\n                                                </td>\r\n                                                <td width=\"50\">\r\n                                                    <img src=\"/img/del_icon3.gif\" alt=\"����\" border=\"0\" onclick=\"javascript:goDelete()\" style=\"cursor:pointer\" >\r\n                                                </td>\r\n                                            ";
  private final static String _jspx_template91 = "\r\n                                        ";
  private final static String _jspx_template92 = "\r\n                                        </tr>\r\n\r\n                                    </table>\r\n                                ";
  private final static String _jspx_template93 = "\r\n                                </td>\r\n                                </tr>\r\n\r\n\r\n                            </table>\r\n                        </div>\r\n                        <div id=\"edit\" style=\"width:100%;display:none;\">\r\n                            <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                                <tr>\r\n\r\n                                    <td>\r\n                                        <table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n                                            <tr>\r\n                                                <td height=\"26\" align=\"left\" colspan=\"4\">\r\n                                                    <span class=\"sub_stan_blue\">&nbsp; * �������� </span>\r\n                                                    <input style=\"float:right; font-size: 10.5px;\" class=\"sub_table_b\" type=\"button\" onclick=\"goLanprice()\" value=\"����������ȸ(���� �ε���������ȸ �ý���)\">\r\n                                                </td>\r\n                                            </tr>\r\n\t\t\t\t\t\t\t\t\t<!-- checked by Sam Lee start-->\r\n                                            <tr>\r\n                                                <td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\"  style=\"direction:rtl\" >���س⵵</td>\r\n                                                <td width=\"42%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    <input id=\"YEAR\" name=\"YEAR\" type=\"text\" value = \"";
  private final static String _jspx_template94 = "\" style=\"width:50px;ime-mode:disabled;\"  class=\"input_form1\"  onKeyDown=\"onlyNumberInput();\" style=\"text-align:right\">&nbsp��\r\n                                                </td>\r\n                                                <td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">��������</td>\r\n                                                <td width=\"32%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    <input id=\"PRICE\" name=\"PRICE\"  value=\"";
  private final static String _jspx_template95 = "\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" onkeyup=\"javascript:fn_addComma(this)\"  onKeyDown=\"onlyNumberInput();\" style=\"text-align:right\">��\r\n                                                    <img src=\"/img/landPrice.gif\" alt=\"����������ȸ\" height=\"18\" border=\"0\" style=\"cursor:pointer;padding-top:0px\" onclick=\"javascript:openLandPricePopUp()\";>\r\n                                                </td>\r\n                                            </tr>\r\n\r\n                                            <tr>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">�������</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    <input id=\"AREA_AFTER\" name=\"AREA_AFTER\" type=\"text\" class=\"input_form1\" style=\"width:50px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template96 = "\"   onKeyDown=\"onlyNumberInput();\" style=\"text-align:right\" onblur=\"showProductList();\" >��\r\n                                                </td>\r\n\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">����/�ܰ�</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    <input id=\"RATE\" name=\"RATE\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template97 = "\"  onKeyDown=\"onlyNumberInput();\" style=\"text-align:right\">\r\n                                                </td>\r\n                                            </tr>\r\n\r\n\r\n                                            <tr>\r\n                                                <td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">����Ⱓ</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" ><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n                                                        <tr>\r\n                                                            <td>\r\n                                                                <input name=\"FROMDATE\" id=\"FROMDATE\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template98 = "\"  onKeyDown=\"onlyNumberInput();\"   onKeyDown=\"onlyNumberInput();\" maxlength=8>\r\n                                                            </td>\r\n                                                            <td>\r\n                                                                <img src=\"/img/calendar_icon.gif\" onclick=\"popUpCalendar(this, document.getElementById('FROMDATE'), 'yyyymmdd');\" style=\"cursor:pointer\" >\r\n                                                            </td>\r\n                                                            <td width=\"16\" align=\"center\">~</td>\r\n                                                            <td>\r\n                                                                <input name=\"TODATE\" id=\"TODATE\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template99 = "\"  onKeyDown=\"onlyNumberInput();\" maxlength=8>\r\n                                                            </td>\r\n                                                            <td>\r\n                                                                <img src=\"/img/calendar_icon.gif\" onclick=\"popUpCalendar(this, document.getElementById('TODATE'), 'yyyymmdd');\" style=\"cursor:pointer\" >\r\n                                                                <img src=\"/img/cal_month.gif\" alt=\"�޼����\" height=\"18\" border=\"0\" style=\"cursor:pointer\" onClick=\"javascript:calDate();\">\r\n\r\n                                                            </td>\r\n                                                        </tr>\r\n                                                    </table></td>\r\n\r\n                                                <td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">\r\n                                                    <select id=\"date_type\" class=\"input_form1\" onchange=\"javascript:calDate();\">\r\n                                                        <option value=\"month\">����</option>\r\n                                                        <option value=\"day\">��</option>\r\n                                                    </select>��\r\n                                                </td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    <input name=\"PERIOD\" id =\"PERIOD\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value = \"";
  private final static String _jspx_template100 = "\"   onKeyDown=\"onlyNumberInput();\" style=\"text-align:right\">����(��)\r\n                                                </td>\r\n\r\n                                            </tr>\r\n                                            <tr>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">������ ����</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    <input name=\"REDUCTION_REASON\" id=\"REDUCTION_REASON\" type=\"text\" class=\"input_form1\" style=\"width:300px\" value=\"";
  private final static String _jspx_template101 = "\">\r\n                                                </td>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">������</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    <input name=\"REDUCTION_RATE\" id=\"REDUCTION_RATE\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template102 = "\"  onKeyDown=\"onlyNumberInput();\" style=\"text-align:right\">%\r\n                                                </td>\r\n                                            </tr>\r\n                                            \r\n                                             <!-- checked by Sam Lee end-->\r\n                                            <tr>\r\n                                                <td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">���� ���</td>\r\n                                                <td width=\"42%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    <input name=\"ADJUSTMENT\" id=\"ADJUSTMENT\" type=\"text\" class=\"input_form1\" style=\"width:60px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template103 = "\"   onKeyDown=\"onlyNumberInput();\" style=\"text-align:right\">\r\n                                                </td>\r\n                                                <td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">�۳⵵ �����</td>\r\n                                                <td width=\"32%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    <input name=\"LAST_AREA_AFTER\" id=\"LAST_AREA_AFTER\" type=\"hidden\" value=\"";
  private final static String _jspx_template104 = "\">\r\n                                                    <input name=\"SUM_LASTYEAR\" id=\"SUM_LASTYEAR\" type=\"text\"  class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template105 = "\"   onKeyDown=\"onlyNumberInput();\" onkeyup=\"javascript:fn_addComma(this)\" style=\"text-align:right\">��\r\n                                                </td>\r\n                                            </tr>\r\n\r\n\r\n\r\n                                            <tr>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">�⺻ �����</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    <input name=\"FORM\" id=\"FORM\" type=\"text\" class=\"input_form1\" style=\"width:300px\" value=\"";
  private final static String _jspx_template106 = "\">\r\n                                                </td>\r\n                                                <td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">���⵵ �����</td>\r\n                                                <td width=\"32%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    <input name=\"SUM_YEAR\" id=\"SUM_YEAR\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template107 = "\"   onKeyDown=\"onlyNumberInput();\" onkeyup=\"javascript:fn_addComma(this)\" style=\"text-align:right\">��\r\n                                                </td>\r\n                                            </tr>\r\n\r\n                                            <tr>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">���� �����</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    <input name=\"FORM_ADJUST\" id=\"FORM_ADJUST\" type=\"text\" class=\"input_form1\" style=\"width:300px\" value=\"";
  private final static String _jspx_template108 = "\">\r\n                                                </td>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">���� �����</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    <input name=\"SUM_ADJUST\" id=\"SUM_ADJUST\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template109 = "\"  onKeyDown=\"onlyNumberInput();\" onkeyup=\"javascript:fn_addComma(this)\" style=\"text-align:right\">��\r\n                                                    \r\n                                                </td>\r\n                                                \r\n\r\n\r\n                                            </tr>\r\n\r\n\r\n                                            <tr>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"2\">\r\n                                                </td>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">�ΰ���</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    <input name=\"VAT\" id=\"VAT\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template110 = "\"  onKeyDown=\"onlyNumberInput();\" onkeyup=\"javascript:fn_addComma(this)\" style=\"text-align:right\">��\r\n                                                </td>\r\n                                            </tr>\r\n\r\n\r\n\r\n                                        </table>\r\n                                    </td>\r\n                                </tr>\r\n                                <tr>\r\n                                    <td height=\"26\" align=\"right\">\r\n                                        <img src=\"/img/accou_icon.gif\" alt=\"���\" width=\"56\" height=\"18\" border=\"0\" onclick=\"javascript:Calculate();\" style=\"cursor:pointer\">\r\n                                    </td>\r\n\r\n                                </tr>\r\n\r\n                                <tr>\r\n                                    <td>\r\n                                        <table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n                                            <tr>\r\n                                                <td colspan=\"6\" height=\"26px\" align=\"left\"  class=\"sub_table_b\">\r\n                                                    <span class=\"sub_stan_blue\">&nbsp; * �ΰ����� </span>\r\n                                                </td>\r\n                                            </tr>\r\n                                            <tr>\r\n                                                <td width=\"100px\" height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">��������</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\">\r\n                                                    <select name=\"TAX_GUBUN\" id=\"TAX_GUBUN\" class=\"essential\" style=\"width:100px\" onChange=\"taxGubunCheck();\">\r\n                                                        ";
  private final static String _jspx_template111 = "\r\n                                                    </select>\r\n                                                </td>\r\n                                                <td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">�����ڵ�</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\" align=\"left\">\r\n                                                \t<select name=\"TAX_SET\" id=\"TAX_SET\" class=\"essential\" style=\"width:60px\"  OnChange=\"TaxCodeInfo();\">\r\n                                                        <option value=\"\">::����::</option>\r\n                                                        <option value=\"50\">����</option>\r\n                                                        <option value=\"10\">�ü�</option>\r\n                                                    </select>\r\n                                                \r\n                                                    <select name=\"TAX_CD\" id=\"TAX_CD\" class=\"essential\" style=\"width:220px\"  OnChange=\"SemokInfo();\">\r\n                                                    </select>\r\n                                                </td>\r\n                                            </tr>\r\n\r\n                                            <tr>\r\n                                                <td width=\"100px\" height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">���ֻ���</td>\r\n                                                <td width=\"100\" bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\">\r\n                                                    <select name=\"LIVE\" id=\"LIVE\" class=\"essential\" style=\"width:100px\">\r\n                                                        ";
  private final static String _jspx_template112 = "\r\n                                                    </select>\r\n\r\n                                                </td>\r\n                                                <td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">�����ڱ���</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\"  align=\"left\">\r\n                                                    <select name=\"TAXPAYER_SET\" id=\"TAXPAYER_SET\" class=\"essential\" style=\"width:220px\">\r\n                                                        ";
  private final static String _jspx_template113 = "\r\n                                                    </select>\r\n\r\n                                                </td>\r\n                                                <td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">���Ǳ���</td>\r\n                                                <td width=\"100\" bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\">\r\n                                                    <select name=\"OBJ_SET\" id=\"OBJ_SET\" class=\"essential\" style=\"width:70px\">\r\n                                                        ";
  private final static String _jspx_template114 = "\r\n                                                    </select>\r\n                                                </td>\r\n                                            </tr>\r\n\r\n                                            <tr>\r\n                                                <td height=\"26px\" width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">��������</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\">\r\n                                                    <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n                                                        <tr>\r\n                                                            <td>\r\n                                                                <input name=\"TAX_DATE\" id=\"TAX_DATE\" type=\"text\" class=\"essential\" style=\"width:80px\" value=\"";
  private final static String _jspx_template115 = "\" onfocus=\"changeTAXDATE();\" onselect=\"changeTAXDATE();\">\r\n                                                            </td>\r\n                                                            <td>\r\n                                                                <a>\r\n                                                                    <img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, document.getElementById('TAX_DATE'), 'yyyymmdd')\" style=\"CURSOR: Hand;\">\r\n                                                                </a>\r\n                                                            </td>\r\n                                                        </tr>\r\n                                                    </table>\r\n                                                </td>\r\n\r\n\r\n                                                <td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">��������</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\" align=\"left\">\r\n                                                    <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n                                                        <tr>\r\n                                                            <td>\r\n                                                            \t���⳻����&nbsp;:&nbsp;<input name=\"INDATE\" id=\"INDATE\" type=\"text\" class=\"essential\" style=\"width:80px\" value=\"\" onFocus=\"\" readonly>\r\n                                                            </td>\r\n                                                            <td>\r\n                                                                <a>\r\n                                                                    <img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, document.getElementById('INDATE'), 'yyyymmdd')\" style=\"CURSOR: Hand;\">\r\n                                                                </a>\r\n                                                            </td>\r\n                                                            <td>\r\n                                                                &nbsp;/&nbsp;����������&nbsp;:&nbsp;<input id=\"OVERDATE\" name=\"OVERDATE\" type=\"text\" class=\"essential\" style=\"width:80px\" value=\"\" readonly>\r\n                                                            </td>\r\n                                                            <td>\r\n                                                                <a>\r\n                                                                    <img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, document.getElementById('OVERDATE'), 'yyyymmdd')\" style=\"CURSOR: Hand;\">\r\n                                                                </a>\r\n                                                            </td>\r\n                                                        </tr>\r\n                                                    </table>\r\n                                                </td>\r\n                                            </tr>\r\n\r\n                                        </table>\r\n                                    </td>\r\n                                </tr>\r\n                                <tr>\r\n                                    <td height=\"40\" align=\"right\">\r\n                                ";
  private final static String _jspx_template116 = "\r\n                                    <img src=\"/img/can_icon.gif\" alt=\"���\" border=\"0\" onclick=\"javascript:history.back();\" style=\"cursor:pointer\" >\r\n                                    ";
  private final static String _jspx_template117 = "\r\n                                    \t<img src=\"/img/save_icon2.gif\" alt=\"����\" width=\"56\" height=\"18\" border=\"0\" onClick=\"alert('��� ������ �����մϴ�. ��� �������� ������ ������ �߰��� �ּ���.');\"  style=\"cursor:pointer\">\r\n                                    ";
  private final static String _jspx_template118 = "\r\n                                    ";
  private final static String _jspx_template119 = "\r\n                                    \t<img src=\"/img/save_icon2.gif\" alt=\"����\" width=\"56\" height=\"18\" border=\"0\" onClick=\"javascript:submitClick();\"  style=\"cursor:pointer\">\r\n                                    ";
  private final static String _jspx_template120 = "\r\n                                ";
  private final static String _jspx_template121 = "\r\n                                </td>\r\n                                </tr>\r\n                            </table>\r\n                        </div>\r\n                    </td>\r\n                </tr>\r\n                <tr>\r\n                    <td height=\"10\">\r\n                    </td>\r\n                </tr>\r\n\r\n            </table>\r\n\r\n        </form>\r\n    </body>\r\n</html>\r\n\r\n";
}
