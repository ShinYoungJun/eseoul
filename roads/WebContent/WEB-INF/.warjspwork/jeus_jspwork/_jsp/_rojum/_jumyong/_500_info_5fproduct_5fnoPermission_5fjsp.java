package jeus_jspwork._jsp._rojum._jumyong;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_info_5fproduct_5fnoPermission_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(38,123);to=(38,133)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${existOwner}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(49,34);to=(49,46)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(73,56);to=(73,74)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.AREA_AFTER}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(73,82);to=(73,94)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(73,100);to=(73,132)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.PRICE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

      out.write(_jspx_template14);
      // jsp code [from=(73,205);to=(73,227)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.SURCHARGE_RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(80,23);to=(80,29)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ck_del}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(81,77);to=(81,85)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(83,34);to=(83,46)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(100,35);to=(100,47)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.FORM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(168,31);to=(168,43)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(171,21);to=(171,33)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.FORM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(174,79);to=(174,87)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(174,103);to=(174,114)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(174,131);to=(174,143)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${countPerPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // jsp code [from=(175,76);to=(175,83)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);
      // jsp code [from=(176,77);to=(176,85)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template26);
      // jsp code [from=(176,101);to=(176,112)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // jsp code [from=(176,129);to=(176,141)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${countPerPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template28);
      // jsp code [from=(177,74);to=(177,81)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template29);
      // jsp code [from=(177,90);to=(177,102)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template30);
      // jsp code [from=(177,123);to=(177,147)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.REDUCTION_REASON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template31);
      // jsp code [from=(177,166);to=(177,188)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.REDUCTION_RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template32);
      // jsp code [from=(177,203);to=(177,221)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.AREA_AFTER}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template33);
      // jsp code [from=(182,89);to=(182,97)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template34);
      // jsp code [from=(182,113);to=(182,124)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template35);
      // jsp code [from=(182,141);to=(182,161)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${countPerPage        }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template36);
      // jsp code [from=(183,74);to=(183,81)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template37);
      // jsp code [from=(186,98);to=(186,106)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template38);
      // jsp code [from=(186,122);to=(186,133)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template39);
      // jsp code [from=(186,150);to=(186,170)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${countPerPage        }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template40);
      // jsp code [from=(187,73);to=(187,79)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${gp_typ}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template41);
      // jsp code [from=(187,91);to=(187,98)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template42);
      // jsp code [from=(260,75);to=(260,87)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template43);
      // jsp code [from=(303,20);to=(303,26)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${tax_at}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template44);
      // jsp code [from=(311,71);to=(311,79)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template45);
      // jsp code [from=(311,87);to=(311,90)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${seq}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template46);
      // jsp code [from=(335,92);to=(335,100)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template47);
      out.write(_jspx_template48);
      // jsp code [from=(542,30);to=(542,42)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template49);
      // jsp code [from=(592,69);to=(592,81)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template50);
      out.write(_jspx_template51);
      // jsp code [from=(716,79);to=(716,98)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.CAL_SUM_SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template52);
      // jsp code [from=(717,75);to=(717,83)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template53);
      // jsp code [from=(718,67);to=(718,71)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mode}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template54);
      // jsp code [from=(719,65);to=(719,68)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${seq}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template55);
      // jsp code [from=(723,71);to=(723,77)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ORG_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template56);
      // jsp code [from=(724,71);to=(724,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${DEPT_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template57);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template75);
      // jsp code [from=(774,59);to=(774,76)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${strPageDivideForm}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template76);
      // jsp code [from=(806,55);to=(806,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template77);
      // jsp code [from=(813,55);to=(813,73)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.AREA_AFTER}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template78);
      // jsp code [from=(817,55);to=(817,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template79);
      // jsp code [from=(826,55);to=(826,71)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.FROMDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template80);
      // jsp code [from=(826,77);to=(826,91)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.TODATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template81);
      // jsp code [from=(829,95);to=(829,109)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.PERIOD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template82);
      // jsp code [from=(835,55);to=(835,79)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.REDUCTION_REASON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template83);
      // jsp code [from=(839,55);to=(839,77)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.REDUCTION_RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template84);
      // jsp code [from=(852,55);to=(852,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template85);
      // jsp code [from=(856,55);to=(856,87)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.PRICE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

      out.write(_jspx_template86);
      // jsp code [from=(862,55);to=(862,73)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.AREA_AFTER}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template87);
      // jsp code [from=(866,55);to=(866,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template88);
      // jsp code [from=(875,55);to=(875,71)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.FROMDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template89);
      // jsp code [from=(875,77);to=(875,91)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.TODATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template90);
      // jsp code [from=(878,95);to=(878,109)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.PERIOD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template91);
      // jsp code [from=(885,55);to=(885,79)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.REDUCTION_REASON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template92);
      // jsp code [from=(889,55);to=(889,77)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.REDUCTION_RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template93);
      // jsp code [from=(899,55);to=(899,73)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.ADJUSTMENT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template94);
      // jsp code [from=(905,55);to=(905,90)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.SUM_YEAR)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

      out.write(_jspx_template95);
      // jsp code [from=(913,55);to=(913,77)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.SURCHARGE_RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template96);
      // jsp code [from=(922,55);to=(922,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.FORM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template97);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_1_fn(pageContext, null)) return;


      out.write(_jspx_template100);
      // jsp code [from=(940,55);to=(940,85)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.VAT)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

      out.write(_jspx_template101);
      // jsp code [from=(968,55);to=(968,64)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TAX_GUBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template102);
      // jsp code [from=(972,52);to=(972,58)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TAX_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template103);
      // jsp code [from=(979,55);to=(979,59)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${LIVE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template104);
      // jsp code [from=(984,55);to=(984,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TAXPAYER_SET}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template105);
      // jsp code [from=(988,55);to=(988,62)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${OBJ_SET}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template106);
      // jsp code [from=(995,55);to=(995,85)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(product.TAX_DATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_1));

      out.write(_jspx_template107);
      // jsp code [from=(1004,82);to=(1004,110)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(product.INDATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_1));

      out.write(_jspx_template108);
      // jsp code [from=(1009,98);to=(1009,128)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(product.OVERDATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_1));

      out.write(_jspx_template109);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_0_fn(pageContext, null)) return;


      out.write(_jspx_template117);
      // jsp code [from=(1072,105);to=(1072,117)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template118);
      // jsp code [from=(1079,173);to=(1079,191)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.AREA_AFTER}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template119);
      // jsp code [from=(1084,162);to=(1084,174)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template120);
      // jsp code [from=(1094,181);to=(1094,197)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.FROMDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template121);
      // jsp code [from=(1101,177);to=(1101,191)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.TODATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template122);
      // jsp code [from=(1114,168);to=(1114,182)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.PERIOD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template123);
      // jsp code [from=(1136,105);to=(1136,117)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template124);
      // jsp code [from=(1140,94);to=(1140,107)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.PRICE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template125);
      // jsp code [from=(1148,173);to=(1148,191)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.AREA_AFTER}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template126);
      // jsp code [from=(1153,161);to=(1153,173)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template127);
      // jsp code [from=(1163,181);to=(1163,197)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.FROMDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template128);
      // jsp code [from=(1170,177);to=(1170,191)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.TODATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template129);
      // jsp code [from=(1187,168);to=(1187,182)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.PERIOD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template130);
      // jsp code [from=(1194,167);to=(1194,191)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.REDUCTION_REASON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template131);
      // jsp code [from=(1198,181);to=(1198,203)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.REDUCTION_RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template132);
      // jsp code [from=(1205,172);to=(1205,190)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.ADJUSTMENT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template133);
      // jsp code [from=(1213,134);to=(1213,169)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.SUM_YEAR)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

      out.write(_jspx_template134);
      // jsp code [from=(1215,131);to=(1215,166)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.SUM_YEAR)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

      out.write(_jspx_template135);
      // jsp code [from=(1224,181);to=(1224,203)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.SURCHARGE_RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template136);
      // jsp code [from=(1231,143);to=(1231,155)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.FORM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template137);
      // jsp code [from=(1237,131);to=(1237,149)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.SUM_ADJUST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template138);
      // jsp code [from=(1239,135);to=(1239,153)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.SUM_ADJUST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template139);
      // jsp code [from=(1242,80);to=(1242,99)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.FORM_ADJUST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template140);
      // jsp code [from=(1252,159);to=(1252,170)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.VAT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template141);
      // jsp code [from=(1278,59);to=(1278,72)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${taxation_part}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template142);
      // jsp code [from=(1286,59);to=(1286,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${taxcode}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template143);
      // jsp code [from=(1312,59);to=(1312,77)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${taxpayer_residence}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template144);
      // jsp code [from=(1319,59);to=(1319,73)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${taxpayer_group}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template145);
      // jsp code [from=(1326,59);to=(1326,70)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${object_type}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template146);
      // jsp code [from=(1337,160);to=(1337,168)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TAX_DATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template147);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_3_fn(pageContext, null)) return;


      out.write(_jspx_template149);

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
            out.write(_jspx_template58);
            // jsp code [from=(756,86);to=(756,96)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template59);
            // jsp code [from=(756,154);to=(756,162)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template60);
            // jsp code [from=(756,171);to=(756,181)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template61);
            // jsp code [from=(756,197);to=(756,208)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template62);
            // jsp code [from=(756,225);to=(756,237)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${countPerPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template63);
            // jsp code [from=(756,246);to=(756,256)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template64);
            // jsp code [from=(756,264);to=(756,273)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template65);
            // jsp code [from=(756,285);to=(756,292)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template66);
            // jsp code [from=(757,82);to=(757,91)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${idx.count}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template67);
            // jsp code [from=(758,70);to=(758,80)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template68);
            // jsp code [from=(759,74);to=(759,104)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(board.PRICE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template69);
            // jsp code [from=(760,70);to=(760,86)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.AREA_AFTER}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template70);
            // jsp code [from=(761,70);to=(761,80)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template71);
            // jsp code [from=(762,34);to=(762,62)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(board.FROMDATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_1));

            out.write(_jspx_template72);
            // jsp code [from=(762,66);to=(762,92)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(board.TODATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_1));

            out.write(_jspx_template73);
            // jsp code [from=(763,70);to=(763,106)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(board.SUM_ADJUST) }",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template74);

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
    _jspx_th_c_forEach_1.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${productList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_1.setVar("board");
    _jspx_th_c_forEach_1.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
        if (_jspx_eval_c_forEach_1 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template98);
            // jsp code [from=(928,53);to=(928,89)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(board.SUM_ADJUST) }",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template99);

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
          out.write(_jspx_template110);
          // jsp code [from=(1033,116);to=(1033,124)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template111);
          // jsp code [from=(1033,130);to=(1033,141)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template112);
          // ----  c:if ---- invoke //
          if (_jspx_th_c_if_1_fn(pageContext, _jspx_th_c_if_0)) return true;


          out.write(_jspx_template116);

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
          out.write(_jspx_template148);

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
          out.write(_jspx_template113);
          // ----  c:if ---- invoke //
          if (_jspx_th_c_if_2_fn(pageContext, _jspx_th_c_if_1)) return true;


          out.write(_jspx_template115);

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
          out.write(_jspx_template114);

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
  private final static String _jspx_template9 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html>\r\n    <head>\r\n        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n        <title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n        <style type=\"text/css\">\r\n            <!--\r\n            body {\r\n                margin: 0px;\r\n                background-image: url(/img/left_back.gif);\r\n            }\r\n            -->\r\n        </style>\r\n        <link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n        <script language=\"javascript\" src=\"/js/common.js\"></script>\r\n        <script language=\"javascript\" src=\"/js/calculation.js\"></script>\r\n        <script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script>\r\n        <script language=\"javascript\" src=\"/js/Ajax_request.js\"></script>\r\n        <script>\r\n\r\n            var savable = 0;\r\n            \r\n            var perDay = 12;\r\n\t\t\tvar perDayStr =\"개월\";\r\n\t\t\t\r\n            function iFrameResize(obj)\r\n            {\r\n                var iFrm = obj;\r\n                var the_height = iFrm.contentWindow.document.body.scrollHeight;\r\n                iFrm.style.height = the_height + \"px\";\r\n            }\r\n            function InitPage()\r\n            {\r\n            \tif((document.getElementById(\"mode\").value == \"edit\" || document.getElementById(\"mode\").value == \"add\") && '";
  private final static String _jspx_template10 = "' == 'false'){\r\n                \talert(\"운영자 정보가 부족합니다. 운영자 정보에서 부족한 정보를 추가해 주세요.\");\r\n            \t}\r\n//            \tif(document.getElementById(\"TAX_CD\").options.length == '1'){\r\n//            \t\talert(\"시설운영 정보에서 세입구분을 추가해 주세요.\");\r\n//            \t}\r\n\t\t\t\t\r\n\t\t\t\t//alert('here..'+document.getElementById(\"date_type\").value);\r\n             \t//if(document.getElementById(\"date_type\").value=='day'){\r\n\t\t\t\t//var tmp_fromdate = document.getElementById(\"FROMDATE\"); \r\n                 \r\n               var tmp_year = \"";
  private final static String _jspx_template11 = "\";\r\n\r\n             //********** BEGIN_KANG_20120426\r\n             // document.getElementById(\"RATE\").value =0.02;\r\n             //********** END_KANG_20120426\r\n                            \r\n              \r\n               //document.getElementById(\"ADJUSTMENT\").value =1;\r\n               \r\n               \tif(tmp_year==\"1980\"||tmp_year==\"1984\"||tmp_year==\"1988\"||tmp_year==\"1992\"||tmp_year==\"1996\"||tmp_year==\"2000\"||tmp_year==\"2004\"||tmp_year==\"2008\"||tmp_year==\"2012\"||tmp_year==\"2016\"||tmp_year==\"2020\"||tmp_year==\"2024\"){\r\n            \t\tperDay =366;\r\n            \t}else{\r\n            \t\tperDay =365;\r\n            \t}\r\n               \tperDayStr =\"일\"; \r\n               \tif(document.getElementById(\"date_type\").value!='day'){\r\n               \t\tperDay =12;\r\n               \t\tperDayStr =\"월\"; \r\n               \t}\r\n               \t\r\n               \t\r\n        \t\t \r\n//         \t\tdocument.getElementById(\"PERIOD\").value = period; \r\n        \t\t\r\n         \t\t//document.getElementById(\"FORM\").value= \"";
  private final static String _jspx_template12 = "㎡  X ";
  private final static String _jspx_template13 = " X ";
  private final static String _jspx_template14 = " X \"+document.getElementById(\"PERIOD\").value+\"/\"+perDay+perDayStr+\" X ";
  private final static String _jspx_template15 = "\"\r\n                \r\n         \t\t//alert('form..'+document.getElementById(\"FORM\").value);\r\n\r\n            \tchangeTAXDATE();\r\n            \t\r\n\r\n                if('";
  private final static String _jspx_template16 = "' == '1'){\r\n                    location.href = \"/rojum/jumyong/rojumCal2.do?GAPAN_NO=";
  private final static String _jspx_template17 = "\";\r\n                }\r\n                setParentYear('";
  private final static String _jspx_template18 = "');\r\n\r\n                parent.document.getElementById(\"SEQ\").value = document.getElementById(\"SEQ\").value;\r\n\r\n                if(document.getElementById(\"mode\").value == \"edit\" || document.getElementById(\"mode\").value == \"add\"  )\r\n                {\r\n                    document.getElementById(\"view\").style.display = \"none\";\r\n\r\n                    document.getElementById(\"edit\").style.display= \"block\";\r\n                    document.getElementById(\"edit\").style.pixelTop = 0;\r\n                }else\r\n                {\r\n                    document.getElementById(\"edit\").style.display = \"none\";\r\n                    document.getElementById(\"view\").style.display = \"block\";\r\n                }\r\n\r\n              \r\n                var cal_type = \"";
  private final static String _jspx_template19 = "\";\t\t//월단위 계산인지 일단위 계산인지 여부 알아내기\r\n                \r\n                \r\n                for(var i=1;i<cal_type.length;i++){\r\n                    if(cal_type.substring(i-1,i)==\"일\"){\r\n                        document.getElementById(\"date_type\").value=\"day\";\r\n                        document.getElementById(\"date_type1\").innerHTML = \"일수\";\r\n                        document.getElementById(\"date_type2\").innerHTML = \"일\";\r\n                    }else{\r\n                        document.getElementById(\"date_type1\").innerHTML = \"개월수\";\r\n                        document.getElementById(\"date_type2\").innerHTML = \"개월\";\r\n                    }\r\n                }\r\n              //********** BEGIN_KANG_20120409\r\n              // taxCdDelete('TAX_CD','228');\r\n               taxCdDelete('TAX_CD','228204');\r\n              //********** END_KANG_20120409\r\n               \r\n                \r\n            }\r\n\r\n\r\n            function submitClick()\r\n            {\r\n                var productForm = document.productForm;\r\n\r\n                if(productForm.PERIOD.value.length<1 || productForm.PERIOD.value==\"0\"){\r\n                    alert(\"개월수를 입력해주세요.\");\r\n                    if(confirm(\"개월수를 자동 계산하시겠습니까?\")){\r\n                        calDate();\r\n                        return;\r\n                    }else{\r\n                        productForm.PERIOD.value=\"\";\r\n                        productForm.PERIOD.focus();\r\n                        return;\r\n                    }\r\n                }\r\n                if(savable == 1)\r\n                {\r\n\r\n                \tif(!DataCheck()){\r\n                    \treturn;\r\n                \t}\r\n\r\n                    //comma제거\r\n                    //removeComma2(\"PRICE\");  \r\n                    removeComma2(\"SUM_YEAR\");\r\n                    removeComma2(\"SUM_ADJUST\");\r\n                    removeComma2(\"VAT\");\r\n                    productForm.TAX_DATE.value = removeDash(productForm.TAX_DATE.value);\r\n                    productForm.OVERDATE.value = removeDash(productForm.OVERDATE.value);\r\n                    productForm.INDATE.value = removeDash(productForm.INDATE.value);  \r\n                    productForm.submit();\r\n                }else{\r\n                    alert(\"산출 내역을 먼저 계산해 주십시오.\");\r\n                }\r\n            }\r\n\r\n\r\n            function subTabClick(hiddenSubTabName,visibleSubTabName)\r\n            {\r\n                document.getElementById(hiddenSubTabName).style.display = 'none';\r\n                document.getElementById(visibleSubTabName).style.display = 'block';\r\n            }\r\n\r\n            function goModify()\r\n            {\r\n                var area = document.getElementById(\"AREA_AFTER\").value        ;\r\n                var year = '";
  private final static String _jspx_template20 = "';\r\n                var seq = document.getElementById(\"SEQ\").value;\r\n                var sum_adjust = Number(removeComma(document.getElementById(\"SUM_ADJUST\").value));\r\n\t\t\t\tvar p_form = \"";
  private final static String _jspx_template21 = "\"; \r\n                if(area>=0)\r\n                { \r\n                    //location.href = \"/rojum/jumyong/rojumCal2.do?GAPAN_NO=";
  private final static String _jspx_template22 = "&currentPage=";
  private final static String _jspx_template23 = "&countPerPage=";
  private final static String _jspx_template24 = "\"\r\n                    //    +\"&mode=edit&year=\"+year+\"&seq=\"+seq+\"&SECTION=";
  private final static String _jspx_template25 = "\";  \r\n                    location.href = \"/rojum/jumyong/rojumCal2.do?GAPAN_NO=";
  private final static String _jspx_template26 = "&currentPage=";
  private final static String _jspx_template27 = "&countPerPage=";
  private final static String _jspx_template28 = "\"\r\n                        +\"&mode=edit&year=\"+year+\"&seq=\"+seq+\"&SECTION=";
  private final static String _jspx_template29 = "&RATE=";
  private final static String _jspx_template30 = "&REDUCTION_REASON=";
  private final static String _jspx_template31 = "&REDUCTION_RATE=";
  private final static String _jspx_template32 = "&AREA_AFTER=";
  private final static String _jspx_template33 = "&FORM=\"+p_form;\r\n                        \r\n                          \r\n                }else if(sum_adjust <0)\r\n                {\r\n                    location.href = \"/rojum/jumyong/productSubtractInsert.do?GAPAN_NO=";
  private final static String _jspx_template34 = "&currentPage=";
  private final static String _jspx_template35 = "&countPerPage=";
  private final static String _jspx_template36 = "\"\r\n                        +\"&mode=edit&year=\"+year+\"&seq=\"+seq+\"&SECTION=";
  private final static String _jspx_template37 = "&area=\"+area;\r\n                }else\r\n                {\r\n                    location.href = \"/rojum/jumyong/productSubtractBeforeTaxInsert.do?GAPAN_NO=";
  private final static String _jspx_template38 = "&currentPage=";
  private final static String _jspx_template39 = "&countPerPage=";
  private final static String _jspx_template40 = "\"\r\n                        +\"&mode=edit&year=\"+year+\"&seq=\"+seq+\"&gp_typ=";
  private final static String _jspx_template41 = "&SECTION=";
  private final static String _jspx_template42 = "&area=\"+area;\r\n                }\r\n            }\r\n\r\n            function Calculate()\r\n            {\r\n            \t\r\n                var area_after = document.getElementById(\"AREA_AFTER\").value;\r\n                var period = document.getElementById(\"PERIOD\");\r\n                removeComma2(\"PRICE\");\r\n                var price = document.getElementById(\"PRICE\").value;\r\n                var rate = document.getElementById(\"RATE\").value;\r\n                var reduction_rate = document.getElementById(\"REDUCTION_RATE\").value;\r\n                var surcharge_rate = document.getElementById(\"SURCHARGE_RATE\").value;\r\n                \r\n                \r\n                //alert('price ='+price);\r\n                \r\n\r\n                if(reduction_rate == '' || reduction_rate == '0')\r\n                    reduction_rate = '100';\r\n\r\n                var sum_year = document.getElementById(\"SUM_YEAR\");\r\n                var sum_adjust = document.getElementById(\"SUM_ADJUST\");\r\n                var form = document.getElementById(\"FORM\");\r\n                var form_adjust = document.getElementById(\"FORM_ADJUST\");\r\n                var vat = document.getElementById(\"VAT\");\r\n                var adjustment = document.getElementById(\"ADJUSTMENT\");\r\n                \r\n                //********** BEGIN_현진_20120207\r\n                if(adjustment.value == \"\" || adjustment.value == 0 || adjustment.value == null ){\r\n                \tadjustment.value = 1;\r\n                }\r\n                //********** END_현진_20120207                               \r\n                var fromdate = document.getElementById(\"FROMDATE\");\r\n                var todate = document.getElementById(\"TODATE\");\r\n\r\n                \r\n                if(area_after<=0){\r\n                    alert(\"점용면적을 넣어주세요.\");\r\n                    document.getElementById(\"AREA_AFTER\").value = \"\";\r\n                    document.getElementById(\"AREA_AFTER\").focus();\r\n                    return;\r\n                }\r\n                \r\n                \r\n                if(Number(removeDash(todate.value))-Number(removeDash(fromdate.value)) < 1){\r\n                    alert(\"산출기간을 정확히 설정해주세요.\");\r\n                    fromdate.focus();\r\n                    return;\r\n                }\r\n                \r\n                calDate();\r\n                 \r\n                \r\n               // var tmp_fromdate = document.getElementById(\"FROMDATE\"); \r\n                \r\n                var tmp_year = document.getElementById(\"YEAR\").value; \r\n                if(document.getElementById(\"date_type\").value=='day'){\r\n                \t\r\n                \tif(tmp_year==\"1980\"||tmp_year==\"1984\"||tmp_year==\"1988\"||tmp_year==\"1992\"||tmp_year==\"1996\"||tmp_year==\"2000\"||tmp_year==\"2004\"||tmp_year==\"2008\"||tmp_year==\"2012\"||tmp_year==\"2016\"||tmp_year==\"2020\"||tmp_year==\"2024\"){\r\n             \t\t\tperDay =366;\r\n             \t\t}else{\r\n             \t\t\tperDay =365;\r\n             \t\t}\r\n                \t\r\n                \tperDayStr =\"일\";\r\n                }\r\n                \r\n                if(document.getElementById(\"date_type\").value!='day'){\r\n               \t\tperDay =12;\r\n               \t}\r\n                \r\n                document.getElementById(\"FORM\").value= area_after+\"㎡  X ";
  private final static String _jspx_template43 = " X \"+price+\" X \"+adjustment.value+\" X \"+document.getElementById(\"PERIOD\").value+\"/\"+perDay+perDayStr+\" X \"+area_after; \r\n                \r\n                //alert(\"FORM =\"+document.getElementById(\"FORM\").value);\r\n                \r\n                var leafYear = f_leapyear(document.getElementById(\"YEAR\").value);\r\n                 \r\n                //sum_year.value = Math.floor(fixFloatCal(parseFloat(area_after)*parseFloat(period.value)*parseFloat(rate)*parseFloat((parseFloat(reduction_rate))/100)*parseFloat(surcharge_rate)));\r\n                //********** BEGIN_현진_20120218\r\n\t\t\t\t//sum_year.value = Math.floor(fixFloatCal(parseFloat(area_after)*parseFloat(adjustment.value)*(parseFloat(period.value)/parseFloat(perDay))*parseFloat(rate)*parseFloat(price)*parseFloat(surcharge_rate)));\r\n\t\t\t\tsum_adjust.value = Math.floor(fixFloatCal(parseFloat(area_after)*parseFloat(adjustment.value)*(parseFloat(period.value)/parseFloat(perDay))*parseFloat(rate)*parseFloat(price)*parseFloat(surcharge_rate)));\r\n\t\t\t\t//********** END_현진_20120218\r\n                \r\n                \r\n                form.value = area_after+\"㎡  X \"+rate+\" X \"+price+\" X \"+adjustment.value+\" X \"+document.getElementById(\"PERIOD\").value+\"/\"+perDay+perDayStr+\" X \"+surcharge_rate;\r\n                //form.value = area_after + \"㎡ X \" + rate +\" X \" + price + \"(공시지가) X (\"+  period.value+\"/\"+perDay + \") \"+perDayStr+\" X \"+surcharge_rate;\r\n\t\t\t\t// 4㎡(점용면적)  X 400(요율단가) X 54,100,000(공시지가) X 12/12개월 X 1.2(과징율)\r\n               \r\n\t\t\t\tif(reduction_rate == \"0.0\" || reduction_rate == \"0\" || reduction_rate == \"\" || reduction_rate == \"100\"){\r\n                    form.value = form.value;\r\n                }else{\r\n                    form.value = form.value+\" X \"+reduction_rate+\"/100\";\r\n                }\t\t\t\t \r\n\t\t\t\t\r\n\t\t\t\t//********** BEGIN_현진_20120218\r\n\t\t\t\t//sum_year.value = insertComma2(Math.floor(sum_year.value/100)*100);\t\t//100원 절삭 \r\n                //sum_adjust.value =  Math.floor(fixFloatCal(parseFloat(area_after)*parseFloat(adjustment.value)*(parseFloat(period.value)/parseFloat(perDay))*parseFloat(rate)*parseFloat(price)));\r\n                sum_adjust.value = insertComma2(Math.floor(sum_adjust.value/100)*100);\t\t//100원 절삭 \r\n                sum_year.value =  Math.floor(fixFloatCal(parseFloat(area_after)*parseFloat(adjustment.value)*(parseFloat(period.value)/parseFloat(perDay))*parseFloat(rate)*parseFloat(price)));\r\n\t\t\t\t//********** END_현진_20120218\r\n                \r\n                //sum_adjust.value = sum_year.value; // 정준이 요청에 의해 변경 점용료와 변상료 다름.\r\n\r\n                \r\n                form_adjust.value = form.value;\r\n                            \r\n                vat.value = \"0\";\r\n                savable = 1;\r\n \r\n            }\r\n\r\n            // 추가 화면 이동\r\n            function goAdd(gapanNo,currentPage)\r\n            {\r\n            \tif('";
  private final static String _jspx_template44 = "' == '1'){\r\n            \t\tlocation.href(\"/rojum/jumyong/rojumCal2.do?GAPAN_NO=\"+gapanNo+\"&currentPage=\"+currentPage+\"&mode=add\");\r\n                }else{\r\n                    alert(\"수거대상은 한번에 변상금만 부과하실수 있습니다.\");\r\n                }\r\n            }\r\n\r\n            function goDelete()        {\r\n                location.href(\"/rojum/jumyong/rojumCal2.do?GAPAN_NO=";
  private final static String _jspx_template45 = "&seq=";
  private final static String _jspx_template46 = "&mode=del\");\r\n\r\n            }\r\n\r\n\r\n            function showProductList()\r\n            {\r\n                var area = document.getElementById(\"AREA_AFTER\").value;\r\n\r\n                if(Number(area) < 0)\r\n                    openwin();\r\n            }\r\n\r\n\r\n            function openwin(){\r\n\r\n                var area = document.getElementById(\"AREA_AFTER\").value;\r\n\r\n                var year = document.getElementById(\"YEAR\").value;\r\n\r\n                var x= \"dialogwidth:700px;dialogHeight:600px;status:no;help:no\";\r\n\r\n                var mode = document.getElementById(\"mode\").value;\r\n\r\n                window.showModalDialog(\"/rojum/jumyong/junggi/productSubList.do?ADMIN_NO=";
  private final static String _jspx_template47 = "&area=\"+area+\"&year=\"+year+\"&mode=\"+mode, window,x);\r\n            }\r\n\r\n\r\n            //공시지가 팝업\r\n            function openLandPricePopUp()\r\n            {\r\n                var winW = 320;\r\n                var winH = 133;\r\n                var status =\"toolbar=no, location=no, directories=no, status=no, menubar=no, resizable=no, scrollbars=no, width=\"+winW+\", height=\"+winH+\", left=0, top=0\";\r\n                var gapanNo = document.getElementById(\"GAPAN_NO\").value;\r\n                var year = document.getElementById(\"YEAR\").value;\r\n                window.open('/rojum/officialLandPrice.do?GAPAN_NO='+gapanNo+'&year='+year, 'win', status);\r\n            }\r\n\r\n\r\n\t\t\tfunction changeTAXDATE(){\r\n                \r\n                \r\n                //과세날짜, 납기일내일자, 납기후일자 구하기  2009.08.31 pkh\r\n                var dateUtilObj = new dateUtil();\r\n        \t\t\r\n                var taxdate = document.getElementById(\"TAX_DATE\").value;\r\n                var taxdate_year = Number(taxdate.substr(0,4));\r\n                var taxdate_month = Number(taxdate.substr(5,2));\r\n                var indate_f = new Date(new Date(taxdate_year, taxdate_month, 1)-86400000).getDate();\r\n        \t\t\r\n                document.getElementById(\"INDATE\").value = taxdate.substr(0,4)+\"-\"+taxdate.substr(5,2)+\"-\"+indate_f;\r\n        \t\t\r\n                var indate = document.getElementById(\"INDATE\").value;\r\n        \t\t\r\n                var indate_year = Number(indate.substr(0,4));\r\n                var indate_month = Number(indate.substr(5,2));\r\n                if(indate_month==12){\r\n                    indate_year = indate_year+1;\r\n                    indate_month = 1;\r\n                }else{\r\n                    indate_month++;\r\n                }\r\n        \t\t\r\n                if(indate_month<10){\r\n                    indate_month = \"0\"+indate_month;\r\n                }\r\n                var over_date = new Date(new Date(indate_year, indate_month, 1)-86400000).getDate();\r\n        \t\t\r\n                document.getElementById(\"OVERDATE\").value = indate_year+\"-\"+indate_month+\"-\"+over_date;\r\n\r\n            }\r\n\r\n\r\n            function\tSemokInfo()\r\n        \t{\r\n        \t\tvar\tTAX_CD\t= document.getElementById(\"TAX_CD\").value;\r\n        \t\tvar\tSIGU_CD\t= document.getElementById(\"SIGU_CD\").value;\r\n        \t\tvar\tDEPT_CD\t= document.getElementById(\"DEPT_CD\").value;\r\n\r\n        \t\tif(TAX_CD != ''){\r\n        \t\t\tMessageDisplay('MSG','MSGValue',1);\r\n\t        \t\tvar\tparams\t= \"TAX_CD=\" + TAX_CD + \"&SIGU_CD=\" + SIGU_CD + \"&DEPT_CD=\" + DEPT_CD;\r\n\t        \t\tsendRequest(\"/rojum/saewe/semokinfo.do\", params, \"GET\", Result_SemokInfo);\r\n\t        \t\t//Result_SemokInfo('');\r\n        \t\t}\r\n        \t}\r\n        \t\r\n        \tfunction\tResult_SemokInfo(obj)\r\n        \t{\r\n        \t\tvar xmldoc \t= new ActiveXObject(\"Microsoft.XMLDOM\");\r\n                var form \t= document.productForm;\r\n                 \r\n        \t\tif(obj == \"\")\r\n        \t\t{\t\t\r\n        \t\t\tMessageDisplay('MSG','MSGValue',0);\r\n        \t\t\talert(\"세목코드 실패!! 세목코드를 다시 골라주세요.\");\r\n        \t\t\treturn;\r\n        \t\t}\r\n        \t\t\r\n                xmldoc.async\t= false;\r\n        \t\txmldoc.loadXML(obj);\r\n        \t\tform.ADD_SET.value\t\t= \txmldoc.getElementsByTagName(\"gasanRateGubun\").item(0).text;\r\n        \t\tform.ADD_SET_NM.value\t= \txmldoc.getElementsByTagName(\"gasanRateGubunNm\").item(0).text;\r\n        \t\tform.SUBUSEO_CD.value\t=\txmldoc.getElementsByTagName(\"suBuseoCd\").item(0).text;\r\n        \t\tform.gasanRate.value\t=\txmldoc.getElementsByTagName(\"gasanRate\").item(0).text;\r\n        \t\tform.OCR_BUSEO_CD.value\t=\txmldoc.getElementsByTagName(\"ocrBuseoCd\").item(0).text;\r\n        \t\tform.OCR_SIGU_CD.value\t=\txmldoc.getElementsByTagName(\"ocrSiguCd\").item(0).text;\r\n\r\n        \t\tif(form.ADD_SET.value == '7'){\r\n            \t\tform.ADD_YN.value = 1;\r\n        \t\t}else{\r\n        \t\t\tform.ADD_YN.value = 0;\r\n        \t\t}\r\n        \t\t\r\n        \t\tMessageDisplay('MSG','MSGValue',0);\r\n        \t}\r\n\r\n        \tfunction taxCdDelete(target,code){\r\n         \t\tvar\ttargetObj = document.getElementById(target);\r\n         \t\tfor(var i = 1; i < targetObj.options.length ; i++){\r\n         \t\t\t//********** BEGIN_KANG_20120409         \t\t\t\r\n";
  private final static String _jspx_template48 = "\r\n             \t\t//if(targetObj.options[i].value.substring(2,5) != code){\r\n             \t\tif(targetObj.options[i].value.substring(2,8) != code){\r\n             \t\t//********** END_KANG_20120409\r\n             \t\t\ttargetObj.options[i] = null;\r\n             \t\t\ti = 0;\r\n             \t\t}\r\n         \t\t}\r\n         \t}\r\n\r\n\r\n        \t\r\n\r\n            function DataCheck()\r\n        \t{\r\n        \t\tvar form \t= document.productForm;\r\n        \t\tvar\tstr\t\t= \"\";\r\n        \t\t\r\n        \t\tif(form.TAX_GUBUN.value.length\t< 1){\r\n        \t\t\tstr\t+= \"과세구분을 선택하세요\\n\";\r\n        \t\t\tform.TAX_GUBUN.focus();\r\n        \t\t}else if(form.TAX_CD.value.length\t< 1){\r\n        \t\t\tstr\t+= \"세목코드를 선택하세요\\n\";\r\n        \t\t\tform.TAX_CD.focus();\r\n        \t\t}else if(form.TAXPAYER_SET.value.length\t< 1){\r\n        \t\t\tstr\t+= \"납세자 구분을 선택하세요\\n\";\r\n        \t\t\tform.TAXPAYER_SET.focus();\r\n        \t\t}else if(form.LIVE.value.length\t< 1){\r\n        \t\t\tstr\t+= \"거주상태를 선택하세요\\n\";\r\n        \t\t\tform.LIVE.focus();\r\n        \t\t}else if(form.OBJ_SET.value.length\t< 1){\r\n        \t\t\tstr\t+= \"물건구분을 선택하세요.\\n\";\r\n        \t\t\tform.OBJ_SET.focus();\r\n        \t\t}else if(form.TAX_DATE.value.length\t< 1){\r\n        \t\t\tstr\t+= \"과세일자를 입력하세요\\n\";\r\n        \t\t\tform.TAX_DATE.focus();\r\n        \t\t}else if(form.INDATE.value.length\t< 1){\r\n        \t\t\tstr\t+= \"납기내일자를 입력하세요\\n\";\r\n        \t\t\tform.INDATE.focus();\r\n        \t\t}else if(form.OVERDATE.value < 110){\r\n        \t\t\tstr\t+= \"납기후일자를 입력하세요\\n\";\r\n        \t\t\tform.OVERDATE.focus();\r\n        \t\t}\r\n\r\n        \t\tif(str\t== \"\")\r\n        \t\t{\r\n        \t\t\treturn\ttrue;\r\n        \t\t}\r\n        \t\t\r\n        \t\talert(str);\r\n        \t\treturn\tfalse;\t\t\r\n        \t}\r\n\r\n\r\n   \r\n\r\n         \tfunction taxGubunCheck(){\r\n         \t\tvar\tTAX_GUBUN\t= document.getElementById(\"TAX_GUBUN\");\r\n         \t\tif(TAX_GUBUN.value == '3'){\r\n         \t\t\talert(\"신고분은 선택하실수 없습니다. 다시 선택하세요.\");\r\n         \t\t\tTAX_GUBUN.value = '';\r\n         \t\t\tTAX_GUBUN.focus();\r\n             \t\treturn false;\r\n         \t\t}\r\n         \t\treturn true;\r\n         \t}\r\n        \t\r\n\r\n            ///////////////////////////////////////////////////////////////////\r\n            var dateUtil = function() {\r\n                this.startObject = null;\r\n                this.endObject = null;\r\n                this.args = null;\r\n            };\r\n\r\n            dateUtil.prototype.formatLen = function(str) {\r\n                return str = (\"\"+str).length<2 ? \"0\"+str : str;\r\n            };\r\n\r\n            dateUtil.prototype.formatDate = function(dateObject, delimiter) {\r\n                delimiter = delimiter || \"-\";\r\n                return dateObject.getFullYear() + delimiter + this.formatLen(dateObject.getMonth() + 1) + delimiter + this.formatLen(dateObject.getDate());\r\n            };\r\n\r\n            dateUtil.prototype.toDay = function(delimiter) {\r\n                return this.formatDate(new Date(), \"-\");\r\n            };\r\n\r\n            dateUtil.prototype.calDate = function() { \r\n            \tvar year = this.args.year == null ? 0 : Number(this.args.year);\r\n                var month = this.args.month == null ? 0 : Number(this.args.month);\r\n                var day = this.args.day == null ? 0 : Number(this.args.day);\r\n                var result = new Date(); \r\n                \r\n                result.setYear(result.getFullYear() + year);\r\n                result.setMonth(result.getMonth() + month);\r\n                result.setDate(result.getDate() + day-1);\r\n                return this.formatDate(result, \"-\");\r\n            };\r\n            \r\n            \r\n            function calDatelocal()\r\n        \t{ \r\n        \t\tvar fromDate = removeDash(document.getElementById(\"FROMDATE\").value);\r\n        \t\tvar toDate = removeDash(document.getElementById(\"TODATE\").value);\r\n        \t\t\r\n        \t\tif(document.getElementById(\"date_type\").value=='day'){\r\n\r\n        \t\t\t//var tmp_fromdate = document.getElementById(\"FROMDATE\"); \r\n                    \r\n        \t\t\tvar tmp_year = \"";
  private final static String _jspx_template49 = "\";\r\n        \t\t\t\r\n                    if(document.getElementById(\"date_type\").value=='day'){\r\n                    \t\r\n                    \tif(tmp_year==\"1980\"||tmp_year==\"1984\"||tmp_year==\"1988\"||tmp_year==\"1992\"||tmp_year==\"1996\"||tmp_year==\"2000\"||tmp_year==\"2004\"||tmp_year==\"2008\"||tmp_year==\"2012\"||tmp_year==\"2016\"||tmp_year==\"2020\"||tmp_year==\"2024\"){\r\n                 \t\t\tperDay =366;\r\n                 \t\t}else{\r\n                 \t\t\tperDay =365;\r\n                 \t\t}\r\n                    \t \r\n                    }\r\n        \t\t\t\r\n                \tperDayStr =\"일\";\r\n                }else{\r\n                \tperDay =12;\r\n                \tperDayStr =\"개월\";\r\n                }\r\n        \t\t\r\n        \t\t\r\n        \t\t\r\n        \t\tif(document.getElementById(\"date_type\").value==\"month\"){\t\t\r\n        \t\t\tvar period = getDiffMon(fromDate,toDate);\r\n        \t\t}else if(document.getElementById(\"date_type\").value==\"day\"){\r\n        \t\t\tvar period = getDiffDay(fromDate,toDate);\r\n        \t\t}else{\r\n        \t\t\tvar period = getDiffMon(fromDate,toDate);\r\n        \t\t}\r\n        \t\tdocument.getElementById(\"PERIOD\").value = period; \r\n        \t\t\r\n        \t\t\r\n        \t\tvar area_after = document.getElementById(\"AREA_AFTER\").value;\r\n                var period = document.getElementById(\"PERIOD\");\r\n                removeComma2(\"PRICE\");\r\n                var price = document.getElementById(\"PRICE\").value;\r\n                var rate = document.getElementById(\"RATE\").value;\r\n                var reduction_rate = document.getElementById(\"REDUCTION_RATE\").value;\r\n                var surcharge_rate = document.getElementById(\"SURCHARGE_RATE\").value; \r\n\r\n                var sum_year = document.getElementById(\"SUM_YEAR\");\r\n                var sum_adjust = document.getElementById(\"SUM_ADJUST\");\r\n                var form = document.getElementById(\"FORM\");\r\n                var form_adjust = document.getElementById(\"FORM_ADJUST\");\r\n                var vat = document.getElementById(\"VAT\");\r\n                var adjustment = document.getElementById(\"ADJUSTMENT\");\r\n                \r\n                \r\n                var fromdate = document.getElementById(\"FROMDATE\");\r\n                var todate = document.getElementById(\"TODATE\");\r\n        \t\t\r\n        \t\t\r\n        \t\tdocument.getElementById(\"FORM\").value= area_after+\"㎡  X ";
  private final static String _jspx_template50 = " X \"+price+\" X \"+adjustment.value+\" X \"+document.getElementById(\"PERIOD\").value+\"/\"+perDay+perDayStr+\" X \"+area_after;y\r\n        \t}\r\n\r\n            dateUtil.prototype.setDate = function(startObject, endObject, args) {\r\n                this.startObject = startObject;\r\n                this.endObject = endObject;\r\n                this.args = args;\r\n\r\n                document.getElementById(this.startObject).value = this.calDate();\r\n                document.getElementById(this.endObject).value = this.toDay();\r\n            };\r\n\r\n\r\n            var dateUtilObj = new dateUtil();\r\n            ///////////////////////////////////////////////////////////////////\r\n            \r\n\t\t    function scrollAll() {\r\n\t\t    \t  document.all.leftDisplay2.scrollTop = document.all.mainDisplay2.scrollTop;\r\n\t\t    \t  document.all.topLine2.scrollLeft = document.all.mainDisplay2.scrollLeft;\r\n\t\t    }\r\n\r\n\t\t  //********** BEGIN_현진_20120222\r\n            function\tTaxCodeInfo()\r\n        \t{\r\n        \t\tvar\tTAX_SET\t= getValueSelectTag(\"TAX_SET\");\r\n        \t\t//********** BEGIN_KANG_20120409\r\n        \t\t//var\tparams\t= \"TAX_SET=\" + TAX_SET + \"&TAX_CD=212\";\r\n        \t\tvar\tparams\t= \"TAX_SET=\" + TAX_SET + \"&TAX_CD=228\";\r\n        \t\t//********** END_KANG_20120409\r\n        \t\tsendRequest(\"/rojum/jumyong/taxcodeinfo.do\", params, \"GET\", Result_TaxCodeInfo);\r\n\r\n        \t}\r\n\r\n           \tfunction\tResult_TaxCodeInfo(obj)\r\n        \t{\r\n           \t\tfncSelectBoxSetting(obj, \"TAX_CD\", \"\", \"::선택::\");\r\n        \t}\r\n\r\n           \tfunction fncSelectBoxSetting(strParam, selectBoxId, defaultSel, topLabel)\r\n            {\r\n               \r\n                var xmldoc = new ActiveXObject(\"Microsoft.XMLDOM\");\r\n                var selectBoxLabel;\r\n                var root;\r\n                var selectBoxValue;\r\n                var opt \t= document.getElementById(selectBoxId);\r\n                var tags\t= \"\";\r\n                var\ttext\t= \"\";\r\n\r\n                for(var i = opt.options.length - 1 ; i > -1 ; i--)\r\n                {\r\n                    opt.options[i]\t= null;\r\n                }\r\n\r\n                xmldoc.async\t= false;\r\n\r\n                xmldoc.loadXML(strParam);\r\n\r\n\r\n                root = xmldoc.getElementsByTagName(\"option\").length;\r\n\r\n\r\n                if(root <= 0)\r\n                {\r\n                    tags \t= document.createElement(\"option\");\r\n                    text\t= document.createTextNode(\"\");\r\n                    tags.setAttribute(\"label\", \"\");\r\n                    tags.appendChild(text);\r\n                    tags.value = 0;\r\n                    opt.appendChild(tags);\r\n                    return;\r\n                }\r\n\r\n                if(topLabel != null && topLabel != \"\")\r\n                {\r\n                    tags \t= document.createElement(\"option\");\r\n                    text\t= document.createTextNode(topLabel);\r\n                    tags.setAttribute(\"label\", topLabel);\r\n                    tags.appendChild(text);\r\n                    tags.value = '';\r\n                    opt.appendChild(tags);\r\n                }\r\n\r\n                for(var i = 0; i < root; i++)\r\n                {\r\n\r\n                    selectBoxValue = xmldoc.getElementsByTagName(\"option/@value\").item(i).text;\r\n                    selectBoxLabel = xmldoc.getElementsByTagName(\"option/@label\").item(i).text;\r\n\r\n                    tags \t= document.createElement(\"option\");\r\n                    text\t= document.createTextNode(selectBoxLabel);\r\n\r\n                    tags.setAttribute(\"label\", selectBoxLabel);\r\n\r\n                    tags.value = selectBoxValue;\r\n                    tags.appendChild(text);\r\n                    opt.appendChild(tags);\r\n                }\r\n              //********** BEGIN_KANG_20120409\r\n              taxCdDelete('TAX_CD','228204');\r\n              //********** END_KANG_20120409\r\n            }\r\n\r\n\t\t  //********** END_현진_20120222\r\n\r\n\t\t  \r\n          function goLanprice(){\r\n        \t\tvar url = \"http://kras.seoul.go.kr/land_info/info/landprice/landprice.do\";\r\n        \t\tvar name = \"공시지가열람\";\r\n        \t\tvar size = \"width=800, height=900, scrollbars=yes, resizable=yes\";\r\n        \t\twindow.open(ur";
  private final static String _jspx_template51 = "l, name, size);\r\n        \t}\r\n\t</script>\r\n\r\n    </head>\r\n\r\n\t \r\n    <body onload=\"javascript:InitPage();\"  border=\"0\">\r\n        <form name=\"productForm\" id=\"productForm\" method=\"post\" action = \"/rojum/jumyong/rojumCal2.do\" >\r\n        \r\n\t\t\t<span id=\"MSG\" style=\"position:absolute;display: none;\">\r\n\t\t\t\t<img src=\"/img/LoadingBar.gif\" id=\"MSGValue\">\r\n\t\t\t</span>\r\n        \t \r\n            <input type=\"hidden\" id=\"CAL_SUM_SEQ\" name=\"CAL_SUM_SEQ\" value=\"";
  private final static String _jspx_template52 = "\">\r\n            <input type=\"hidden\" id = \"GAPAN_NO\" name=\"GAPAN_NO\" value=\"";
  private final static String _jspx_template53 = "\">\r\n            <input type=\"hidden\" id = \"mode\" name=\"mode\" value=\"";
  private final static String _jspx_template54 = "\">\r\n            <input type=\"hidden\" id = \"SEQ\" name=\"SEQ\" value=\"";
  private final static String _jspx_template55 = "\">\r\n            \r\n            \r\n            \r\n            <input type=\"hidden\" id=\"SIGU_CD\" name=\"SIGU_CD\" value=\"";
  private final static String _jspx_template56 = "\">\r\n            <input type=\"hidden\" id=\"DEPT_CD\" name=\"DEPT_CD\" value=\"";
  private final static String _jspx_template57 = "\">\r\n            \r\n            \r\n            \r\n\t\t\t<!--ajax 리턴값-->\r\n            <input type=\"hidden\" name=\"ADD_SET\"  id=\"ADD_SET\" value=\"\">\r\n\t\t\t<input type=\"hidden\" name=\"ADD_SET_NM\"  id=\"ADD_SET_NM\" value=\"\">\r\n\t\t\t<input type=\"hidden\" name=\"ADD_YN\"  id=\"ADD_YN\" value=\"\">\r\n\t\t\t<input type=\"hidden\" name=\"SUBUSEO_CD\"  id=\"SUBUSEO_CD\" value=\"\">\r\n\t\t\t<input type=\"hidden\" name=\"gasanRate\"  id=\"gasanRate\" value=\"\">\r\n\t\t\t<input type=\"hidden\" name=\"OCR_BUSEO_CD\"  id=\"OCR_BUSEO_CD\" value=\"\">\r\n\t\t\t<input type=\"hidden\" name=\"OCR_SIGU_CD\"  id=\"OCR_SIGU_CD\" value=\"\">\r\n            \r\n            <table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                <tr>\r\n                    <td class=\"contborder_purple\">\r\n                        <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                            <tr>\r\n                                <td>\r\n                                    <table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n                                        <tr>\r\n                                            <td width=\"40px\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">번호</td>\r\n                                            <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">산출년도</td>\r\n<!--                                            <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">공시지가</td>-->\r\n                                            <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">면적</td>\r\n                                            <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">단가</td>\r\n                                            <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">산출기간</td>\r\n                                            <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">변상금 </td>\r\n\r\n                                        </tr>\r\n                                        ";
  private final static String _jspx_template58 = "\r\n                                            <tr onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\"\r\n                                                onclick=\"javascript:setParentYear('";
  private final static String _jspx_template59 = "');location.href('/rojum/jumyong/rojumCal2.do?GAPAN_NO=";
  private final static String _jspx_template60 = "&year=";
  private final static String _jspx_template61 = "&currentPage=";
  private final static String _jspx_template62 = "&countPerPage=";
  private final static String _jspx_template63 = "&year=";
  private final static String _jspx_template64 = "&seq=";
  private final static String _jspx_template65 = "&SECTION=";
  private final static String _jspx_template66 = "');\" style=\"cursor:pointer\" >\r\n                                                <td height=\"26\" align=\"center\">";
  private final static String _jspx_template67 = "</td>\r\n                                                <td align=\"center\">";
  private final static String _jspx_template68 = "</td>\r\n<!--                                                <td align=\"center\">";
  private final static String _jspx_template69 = "</td>-->\r\n                                                <td align=\"center\">";
  private final static String _jspx_template70 = "</td>\r\n                                                <td align=\"center\">";
  private final static String _jspx_template71 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template72 = "~";
  private final static String _jspx_template73 = "</td>\r\n                                                <td align=\"center\">";
  private final static String _jspx_template74 = "</td>\r\n\r\n                                            </tr>\r\n                                        ";
  private final static String _jspx_template75 = "\r\n                                    </table></td>\r\n                            </tr>\r\n                            <tr>\r\n                                <td height=\"40\" align=\"center\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                                        <tr>\r\n                                            <td align=\"center\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n                                                    <tr>\r\n                                                        ";
  private final static String _jspx_template76 = "\r\n                                                    </tr>\r\n                                                </table>\r\n                                            </td>\r\n                                        </tr>\r\n                                        <tr>\r\n\r\n\r\n                                        </tr>\r\n                                    </table></td>\r\n                            </tr>\r\n\r\n                        </table>\r\n\r\n\t\t\t\t\t\t\t<div id=\"view\" style=\"width:100%;\">\r\n                            <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\r\n                                <tr>\r\n                                    <td>\r\n                                    \r\n                                    \t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n                                    \t    <tr>\r\n                                                <td height=\"26\" align=\"left\" colspan=\"4\">\r\n                                                    <span class=\"sub_stan_blue\">&nbsp; * 산출정보 </span>\r\n                                                </td>\r\n                                            </tr>\r\n                                            \r\n                                            <!--  blocked by sam lee -->\r\n                                            <!-- \r\n                                            <tr>\r\n                                                <td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" >산출년도</td>\r\n                                                <td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    ";
  private final static String _jspx_template77 = "년\r\n                                                </td>\r\n\r\n                                            </tr>\r\n                                            <tr>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용면적</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    ";
  private final static String _jspx_template78 = "㎡\r\n                                                </td>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">단가</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    ";
  private final static String _jspx_template79 = "\r\n                                                </td>\r\n                                            </tr>\r\n\r\n\r\n                                            <tr>\r\n                                                <td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">산출기간</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\r\n                                                    ";
  private final static String _jspx_template80 = " ~ ";
  private final static String _jspx_template81 = "\r\n                                                </td>\r\n                                                <td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\"><span id=\"date_type1\"></span></td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >";
  private final static String _jspx_template82 = "<span id=\"date_type2\"></span></td>\r\n                                            </tr>\r\n                                            \r\n                                            <tr>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">지분율 사유</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    ";
  private final static String _jspx_template83 = "\r\n                                                </td>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">지분율</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    ";
  private final static String _jspx_template84 = " %\r\n                                                </td>\r\n                                            </tr>\r\n\t\t\t\t\t\t\t\t\t\t\t -->\r\n\t\t\t\t\t\t\t\t\t\t\t \r\n\t\t\t\t\t\t\t\t\t\t\t <!-- added by sam lee -->\r\n\t\t\t\t\t\t\t\t\t\t\t \r\n\t\t\t\t\t\t\t\t\t\t\t \r\n\t\t\t\t\t\t\t\t\t\t\t \r\n\t\t\t\t\t\t\t\t\t\t\t \r\n\t\t\t\t\t\t\t\t\t\t\t <tr>\r\n                                                <td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" >기준년도</td>\r\n                                                <td width=\"42%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    ";
  private final static String _jspx_template85 = "년\r\n                                                </td>\r\n                                                <td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">공시지가</td>\r\n                                                <td width=\"32%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    ";
  private final static String _jspx_template86 = "원\r\n                                                </td>\r\n                                            </tr>\r\n                                            <tr>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용면적</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    ";
  private final static String _jspx_template87 = "㎡\r\n                                                </td>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">요율/단가</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    ";
  private final static String _jspx_template88 = "\r\n                                                </td>\r\n                                            </tr>\r\n\r\n\r\n                                            <tr>\r\n                                                <td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">산출기간</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\r\n                                                    ";
  private final static String _jspx_template89 = " ~ ";
  private final static String _jspx_template90 = "\r\n                                                </td>\r\n                                                <td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\"><span id=\"date_type1\"></span></td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >";
  private final static String _jspx_template91 = "<span id=\"date_type2\"></span></td>\r\n                                            </tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<!-- hoban : 여기까지 점용료 산출내역의 기준년도 ~ 개월수 -->                                            \r\n                                            \r\n                                            <tr>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">감면율 사유</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    ";
  private final static String _jspx_template92 = "\r\n                                                </td>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">감면율</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    ";
  private final static String _jspx_template93 = " %\r\n                                                </td>\r\n                                            </tr>\r\n\t\t\t\t\t\t\t\t\t\t\t \r\n\t\t\t\t\t\t\t\t\t\t\t \r\n\t\t\t\t\t\t\t\t\t\t\t <!-- added by sam lee end -->\r\n\t\t\t\t\t\t\t\t\t\t\t <tr>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조정 계수</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\r\n                                                    ";
  private final static String _jspx_template94 = "\r\n\r\n                                                </td>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조정 점용료</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\r\n                                                    ";
  private final static String _jspx_template95 = " 원\r\n\r\n                                                </td>\r\n                                               </tr>\r\n                                            <tr>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">과징율</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\">\r\n\r\n                                                    ";
  private final static String _jspx_template96 = "\r\n\r\n                                                </td>\r\n                                                \r\n                                            </tr>\r\n\r\n                                            <tr>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">산출식</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" > \r\n                                                    ";
  private final static String _jspx_template97 = "<br> \r\n                                                </td>\r\n\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\"><!-- 점용료 --> 변상료</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" > \r\n                                                ";
  private final static String _jspx_template98 = " \r\n\t\t                                                ";
  private final static String _jspx_template99 = " 원\r\n\t\t                                        ";
  private final static String _jspx_template100 = " \r\n                                                </td>\r\n\r\n\r\n\r\n                                            </tr>\r\n                                            <tr>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"2\">\r\n                                                </td>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">부가가치세</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    ";
  private final static String _jspx_template101 = " 원\r\n                                                </td>\r\n                                            </tr>\r\n\r\n\r\n\r\n                                        </table>\r\n                                        \r\n                                        \r\n                                \t</td>\r\n                                </tr>\r\n                                \r\n                                <tr>\r\n                                <td>\r\n                                </td>\r\n                                \r\n                                \r\n                                </tr>\r\n                                <tr>\r\n                                <td>\r\n                                <table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n                                            <tr>\r\n                                                <td colspan=\"6\" height=\"26px\" align=\"left\"  class=\"sub_table_b\">\r\n                                                <span class=\"sub_stan_blue\">&nbsp; * 부과정보 </span>\r\n                                            </tr>\r\n                                            <tr>\r\n                                                <td width=\"100px\" height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">과세구분</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\">\r\n                                                    ";
  private final static String _jspx_template102 = "\r\n                                                </td>\r\n                                                <td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">세목코드</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\" align=\"left\">\r\n                                                \t";
  private final static String _jspx_template103 = "\r\n                                                </td>\r\n                                            </tr>\r\n\r\n                                            <tr>\r\n                                                <td width=\"100px\" height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">거주상태</td>\r\n                                                <td width=\"100px\" bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\">\r\n                                                    ";
  private final static String _jspx_template104 = "\r\n\r\n                                                </td>\r\n                                                <td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">납세자구분</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\"  align=\"left\">\r\n                                                    ";
  private final static String _jspx_template105 = "\r\n                                                </td>\r\n                                                <td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">물건구분</td>\r\n                                                <td width=\"100px\" bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\">\r\n                                                    ";
  private final static String _jspx_template106 = "\r\n                                                </td>\r\n                                            </tr>\r\n\r\n                                            <tr>\r\n                                                <td height=\"26px\" width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">과세일자</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\">\r\n                                                    ";
  private final static String _jspx_template107 = "\r\n                                                </td>\r\n\r\n\r\n                                                <td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">납기일자</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\" align=\"left\">\r\n                                                    <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n                                                        <tr>\r\n                                                            <td>\r\n                                                            \t납기내일자&nbsp;:&nbsp;";
  private final static String _jspx_template108 = "                                                    \r\n                                                            </td>\r\n                                                            <td>\r\n                                                            </td>\r\n                                                            <td>\r\n                                                                &nbsp;/&nbsp;납기후일자&nbsp;:&nbsp;";
  private final static String _jspx_template109 = "\r\n                                                            </td>\r\n                                                            <td>\r\n                                                            </td>\r\n                                                        </tr>\r\n                                                    </table>\r\n                                                </td>\r\n                                            </tr>\r\n                                        </table>\r\n                                \r\n                                </td>\r\n                                \r\n                                \r\n                                </tr>\r\n\r\n                                <tr>\r\n                                    <td height=\"40\" align=\"right\">\r\n                                ";
  private final static String _jspx_template110 = "\r\n                                    <table border=\"0\" width=\"100%\">\r\n                                        <tr>\r\n\r\n\r\n\r\n                                            <td >\r\n                                                <img src=\"/img/add_icon.gif\" alt=\"추가\" border=\"0\" onclick=\"goAdd('";
  private final static String _jspx_template111 = "','";
  private final static String _jspx_template112 = "')\" style=\"cursor:pointer\">\r\n                                            </td>\r\n                                        ";
  private final static String _jspx_template113 = "\r\n                                            ";
  private final static String _jspx_template114 = "\r\n                                                <td width=\"50\">\r\n                                                    <img src=\"/img/mod_icon.gif\" alt=\"수정\" border=\"0\" onclick=\"javascript:goModify()\" style=\"cursor:pointer\" >\r\n                                                </td>\r\n                                                <td width=\"50\">\r\n                                                    <img src=\"/img/del_icon3.gif\" alt=\"삭제\" border=\"0\" onclick=\"javascript:goDelete()\" style=\"cursor:pointer\" >\r\n                                                </td>\r\n                                            ";
  private final static String _jspx_template115 = "\r\n                                        ";
  private final static String _jspx_template116 = "\r\n                                        </tr>\r\n\r\n                                    </table>\r\n                                ";
  private final static String _jspx_template117 = "\r\n                                </td>\r\n                                </tr>\r\n\r\n\r\n                            </table>\r\n                        </div>\r\n                        <div id=\"edit\" style=\"width:100%;display:none;\">\r\n                            <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                                <tr>\r\n\r\n                                    <td>\r\n                                        <table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n                                            <tr>\r\n                                                <td height=\"26\" align=\"left\" colspan=\"4\">\r\n                                                    <span class=\"sub_stan_blue\">&nbsp; * 산출정보 </span>\r\n                                                    <input style=\"float:right; font-size: 10.5px;\" class=\"sub_table_b\" type=\"button\" onclick=\"goLanprice()\" value=\"공시지가조회(서울 부동산정보조회 시스템)\">\r\n                                                </td>\r\n                                            </tr>\r\n<!-- hoban : 여기부터 -->\r\n                                            <!-- \r\n                                            <tr>\r\n                                                <td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\"  style=\"direction:rtl\" >기준년도</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\">\r\n                                                    <input name=\"YEAR\" id=\"YEAR\" type=\"text\" value = \"";
  private final static String _jspx_template118 = "\" style=\"width:50px;ime-mode:disabled;\"  class=\"input_form1\"  onKeyDown=\"onlyNumberInput();\" style=\"text-align:right\">&nbsp년\r\n                                                </td>\r\n                                            </tr>\r\n\r\n                                            <tr>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용면적</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    <input name=\"AREA_AFTER\" id=\"AREA_AFTER\" type=\"text\" class=\"input_form1\" style=\"width:50px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template119 = "\"   onKeyDown=\"onlyNumberInput();\" style=\"text-align:right\" onblur=\"showProductList();\" >㎡\r\n                                                </td>\r\n\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">요율/단가</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    <input name=\"RATE\"  id=\"RATE\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template120 = "\"  onKeyDown=\"onlyNumberInput();\" style=\"text-align:right\">\r\n                                                </td>\r\n                                            </tr>\r\n\r\n\r\n                                            <tr>\r\n                                                <td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">산출기간</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" ><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n                                                        <tr>\r\n                                                            <td>\r\n                                                                <input name=\"FROMDATE\" id=\"FROMDATE\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template121 = "\"  onKeyDown=\"onlyNumberInput();\"   onKeyDown=\"onlyNumberInput();\" maxlength=8>\r\n                                                            </td>\r\n                                                            <td>\r\n                                                                <img src=\"/img/calendar_icon.gif\" onclick=\"popUpCalendar(this, document.getElementById('FROMDATE'), 'yyyymmdd');\" style=\"cursor:pointer\" >\r\n                                                            </td>\r\n                                                            <td width=\"16\" align=\"center\">~</td>\r\n                                                            <td>\r\n                                                                <input name=\"TODATE\" id=\"TODATE\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template122 = "\"  onKeyDown=\"onlyNumberInput();\" maxlength=8>\r\n                                                            </td>\r\n                                                            <td>\r\n                                                                <img src=\"/img/calendar_icon.gif\" onclick=\"popUpCalendar(this, document.getElementById('TODATE'), 'yyyymmdd');\" style=\"cursor:pointer\" >\r\n                                                            </td>\r\n                                                        </tr>\r\n                                                    </table></td>\r\n\r\n                                                <td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">\r\n                                                \t<input type=\"hidden\" id=\"date_type\" value=\"day\"/>\r\n                                                \t일수\r\n                                                </td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    <input name=\"PERIOD\" id =\"PERIOD\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value = \"";
  private final static String _jspx_template123 = "\"   onKeyDown=\"onlyNumberInput();\" style=\"text-align:right\">일\r\n                                                </td>\r\n\r\n                                            </tr>\r\n<!-- hoban : 여기까지 -->\r\n                                            \r\n                                            <!--  new adding start -->\r\n                                            \r\n                                            \r\n                                            \r\n                                            \r\n                                            \r\n                                            \r\n                                            \r\n                                            \r\n                                            \r\n                                            \r\n                                            \r\n                                            \r\n                                            <tr>\r\n                                                <td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\"  style=\"direction:rtl\" >기준년도</td>\r\n                                                <td width=\"42%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    <input id=\"YEAR\" name=\"YEAR\" type=\"text\" value = \"";
  private final static String _jspx_template124 = "\" style=\"width:50px;ime-mode:disabled;\"  class=\"input_form1\"  onKeyDown=\"onlyNumberInput();\" style=\"text-align:right\">&nbsp년\r\n                                                </td>\r\n                                                <td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">공시지가</td>\r\n                                                <td width=\"32%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    <input id=\"PRICE\" name=\"PRICE\"  value=\"";
  private final static String _jspx_template125 = "\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" onkeyup=\"javascript:fn_addComma(this)\"  onKeyDown=\"onlyNumberInput();\" style=\"text-align:right\">원\r\n                                                    <img src=\"/img/landPrice.gif\" alt=\"공시지가조회\" height=\"18\" border=\"0\" style=\"cursor:pointer;padding-top:0px\" onclick=\"javascript:openLandPricePopUp()\";>\r\n                                                </td>\r\n                                            </tr>\r\n\r\n                                            <tr>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용면적</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    <input id=\"AREA_AFTER\" name=\"AREA_AFTER\" type=\"text\" class=\"input_form1\" style=\"width:50px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template126 = "\"   onKeyDown=\"onlyNumberInput();\" style=\"text-align:right\" onblur=\"showProductList();\" >㎡\r\n                                                </td>\r\n\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">요율/단가</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    <input id=\"RATE\" name=\"RATE\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template127 = "\"  onKeyDown=\"onlyNumberInput();\" style=\"text-align:right\">\r\n                                                </td>\r\n                                            </tr>\r\n\r\n\r\n                                            <tr>\r\n                                                <td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">산출기간</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" ><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n                                                        <tr>\r\n                                                            <td>\r\n                                                                <input name=\"FROMDATE\" id=\"FROMDATE\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template128 = "\"  onKeyDown=\"onlyNumberInput();\"   onKeyDown=\"onlyNumberInput();\" maxlength=8>\r\n                                                            </td>\r\n                                                            <td>\r\n                                                                <img src=\"/img/calendar_icon.gif\" onclick=\"popUpCalendar(this, document.getElementById('FROMDATE'), 'yyyymmdd');\" style=\"cursor:pointer\" >\r\n                                                            </td>\r\n                                                            <td width=\"16\" align=\"center\">~</td>\r\n                                                            <td>\r\n                                                                <input name=\"TODATE\" id=\"TODATE\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template129 = "\"  onKeyDown=\"onlyNumberInput();\" maxlength=8>\r\n                                                            </td>\r\n                                                            <td>\r\n                                                                <img src=\"/img/calendar_icon.gif\" onclick=\"popUpCalendar(this, document.getElementById('TODATE'), 'yyyymmdd');\" style=\"cursor:pointer\" >\r\n                                                                <img src=\"/img/cal_month.gif\" alt=\"달수계산\" height=\"18\" border=\"0\" style=\"cursor:pointer\" onClick=\"javascript:calDate();\">\r\n\r\n                                                            </td>\r\n                                                        </tr>\r\n                                                    </table></td>\r\n\r\n                                                <td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">\r\n                                                    <select id=\"date_type\" class=\"input_form1\" onchange=\"javascript:calDatelocal();\">\r\n                                                        <option value=\"month\">개월</option>\r\n                                                        <option value=\"day\">일</option>\r\n                                                    </select>수\r\n                                                </td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    <input name=\"PERIOD\" id =\"PERIOD\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value = \"";
  private final static String _jspx_template130 = "\"   onKeyDown=\"onlyNumberInput();\" style=\"text-align:right\">개월(일)\r\n                                                </td>\r\n\r\n                                            </tr>\r\n                                            <tr>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">감면율 사유</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    <input name=\"REDUCTION_REASON\" id=\"REDUCTION_REASON\" type=\"text\" class=\"input_form1\" style=\"width:300px\" value=\"";
  private final static String _jspx_template131 = "\">\r\n                                                </td>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">감면율</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    <input name=\"REDUCTION_RATE\" id=\"REDUCTION_RATE\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template132 = "\"  onKeyDown=\"onlyNumberInput();\" style=\"text-align:right\">%\r\n                                                </td>\r\n                                            </tr>\r\n                                            <tr>\r\n                                            \t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조정 계수</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\r\n                                                   <input name=\"ADJUSTMENT\" id=\"ADJUSTMENT\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template133 = "\">\r\n\r\n                                                </td>\r\n                                                \r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조정 점용료</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<!--  //********** BEGIN_현진_20120218 -->\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<!-- \r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"SUM_ADJUST\" id=\"SUM_ADJUST\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template134 = "\"> 원\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t -->\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t <input name=\"SUM_YEAR\" id=\"SUM_YEAR\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template135 = "\"> 원\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<!--   //********** END_현진_20120218 -->\r\n                                                </td>\r\n                                            </tr>\r\n                                            \r\n                                            <!--  new adding end -->\r\n                                            <tr>\r\n                                                <td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">과징율</td>\r\n                                                <td width=\"42%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\">\r\n                                                    <input name=\"SURCHARGE_RATE\" id=\"SURCHARGE_RATE\" type=\"text\" class=\"input_form1\" style=\"width:60px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template136 = "\"   onKeyDown=\"onlyNumberInput();\" style=\"text-align:right\">\r\n                                                </td>\r\n                                            </tr>\r\n                                            \r\n                                            <tr>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">산출식</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    <input name=\"FORM\" ID=\"FORM\" type=\"text\" class=\"input_form1\" style=\"width:300px\" value=\"";
  private final static String _jspx_template137 = "\">\r\n                                                </td>\r\n                                                <td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">변상료</td>\r\n                                                <td width=\"32%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    <!--  //********** BEGIN_현진_20120218 -->\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<!-- \r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"SUM_YEAR\" id=\"SUM_YEAR\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value=\" ";
  private final static String _jspx_template138 = "\"   onKeyDown=\"onlyNumberInput();\" onkeyup=\"javascript:fn_addComma(this)\" style=\"text-align:right\">원\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t-->\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"SUM_ADJUST\" id=\"SUM_ADJUST\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value=\" ";
  private final static String _jspx_template139 = "\"   onKeyDown=\"onlyNumberInput();\" onkeyup=\"javascript:fn_addComma(this)\" style=\"text-align:right\">원\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<!--   //********** END_현진_20120218 -->\r\n                                                    \r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"FORM_ADJUST\" id=\"FORM_ADJUST\" type=\"hidden\" value=\"";
  private final static String _jspx_template140 = "\">\r\n                                                </td>\r\n                                            </tr>\r\n\r\n\r\n                                            <tr>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"2\">\r\n                                                </td>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">부가세</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    <input name=\"VAT\" id=\"VAT\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template141 = "\"  onKeyDown=\"onlyNumberInput();\" onkeyup=\"javascript:fn_addComma(this)\" style=\"text-align:right\">원\r\n                                                </td>\r\n                                            </tr>\r\n\r\n\r\n\r\n                                        </table>\r\n                                    </td>\r\n                                </tr>\r\n                                <tr>\r\n                                    <td height=\"26\" align=\"right\">\r\n                                        <img src=\"/img/accou_icon.gif\" alt=\"계산\" width=\"56\" height=\"18\" border=\"0\" onclick=\"javascript:Calculate();\" style=\"cursor:pointer\">\r\n                                    </td>\r\n\r\n                                </tr>\r\n\r\n                                <tr>\r\n                                    <td>\r\n                                        <table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n                                            <tr>\r\n                                                <td colspan=\"6\" height=\"26\" align=\"left\"  class=\"sub_table_b\">&nbsp;* 부과 정보</td>\r\n                                            </tr>\r\n                                            <tr>\r\n                                                <td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">과세구분</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\">\r\n                                                    <select name=\"TAX_GUBUN\" id=\"TAX_GUBUN\" class=\"essential\" style=\"width:100px\" onChange=\"taxGubunCheck();\">\r\n                                                        ";
  private final static String _jspx_template142 = "\r\n                                                    </select>\r\n                                                </td>\r\n\t\t\t\t\t                           <!--  //********** BEGIN_현진_20120222 -->\r\n\t\t\t\t\t\t\t\t\t\t\t\t<!-- \r\n                                                <td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">세목코드</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\" align=\"left\">\r\n                                                    <select name=\"TAX_CD\" id=\"TAX_CD\" class=\"essential\" style=\"width:220px\"  OnChange=\"SemokInfo();\">\r\n                                                        ";
  private final static String _jspx_template143 = "\r\n                                                    </select>\r\n                                                </td>\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t-->\r\n\t\t\t\t\t\t\t\t\t\t\t<td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">세목코드</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\" align=\"left\">\r\n                                                \t<select name=\"TAX_SET\" id=\"TAX_SET\" class=\"essential\" style=\"width:60px\"  OnChange=\"TaxCodeInfo();\">\r\n                                                        <option value=\"\">::선택::</option>\r\n                                                        <option value=\"50\">구세</option>\r\n                                                        <option value=\"10\">시세</option>\r\n                                                    </select>\r\n                                                \r\n                                                    <select name=\"TAX_CD\" id=\"TAX_CD\" class=\"essential\" style=\"width:220px\"  OnChange=\"SemokInfo();\">\r\n                                                    </select>\r\n                                                </td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<!--   //********** END_현진_20120222 -->\r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t                                                \r\n\r\n                                                \r\n                                            </tr>\r\n\r\n                                            <tr>\r\n                                                <td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">거주상태</td>\r\n                                                <td width=\"100\" bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\">\r\n                                                    <select name=\"LIVE\" id=\"LIVE\" class=\"essential\" style=\"width:100px\">\r\n                                                        ";
  private final static String _jspx_template144 = "\r\n                                                    </select>\r\n\r\n                                                </td>\r\n                                                <td height=\"26\" width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">납세자구분</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\"  align=\"left\">\r\n                                                    <select name=\"TAXPAYER_SET\" id=\"TAXPAYER_SET\" class=\"essential\" style=\"width:220px\">\r\n                                                        ";
  private final static String _jspx_template145 = "\r\n                                                    </select>\r\n\r\n                                                </td>\r\n                                                <td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">물건구분</td>\r\n                                                <td width=\"100\" bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\">\r\n                                                    <select name=\"OBJ_SET\" id=\"OBJ_SET\" class=\"essential\" style=\"width:70px\">\r\n                                                        ";
  private final static String _jspx_template146 = "\r\n                                                    </select>\r\n                                                </td>\r\n                                            </tr>\r\n\r\n                                            <tr>\r\n                                                <td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">과세일자</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\">\r\n                                                    <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n                                                        <tr>\r\n                                                            <td>\r\n                                                                <input name=\"TAX_DATE\" id=\"TAX_DATE\" type=\"text\" class=\"essential\" style=\"width:80px\" value=\"";
  private final static String _jspx_template147 = "\" onfocus=\"changeTAXDATE();\" onselect=\"changeTAXDATE();\">\r\n                                                            </td>\r\n                                                            <td>\r\n                                                                <a>\r\n                                                                    <img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, document.getElementById('TAX_DATE'), 'yyyymmdd')\" style=\"CURSOR: Hand;\">\r\n                                                                </a>\r\n                                                            </td>\r\n                                                        </tr>\r\n                                                    </table>\r\n                                                </td>\r\n\r\n\r\n                                                <td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">납기일자</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\" align=\"left\">\r\n                                                    <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n                                                        <tr>\r\n                                                            <td>\r\n                                                            \t납기내일자&nbsp;:&nbsp;<input name=\"INDATE\" id=\"INDATE\" type=\"text\" class=\"essential\" style=\"width:80px\" value=\"\" onFocus=\"\" readonly>\r\n                                                            </td>\r\n                                                            <td>\r\n                                                                <a>\r\n                                                                    <img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, document.getElementById('INDATE'), 'yyyymmdd')\" style=\"CURSOR: Hand;\">\r\n                                                                </a>\r\n                                                            </td>\r\n                                                            <td>\r\n                                                                &nbsp;/&nbsp;납기후일자&nbsp;:&nbsp;<input name=\"OVERDATE\" id=\"OVERDATE\" type=\"text\" class=\"essential\" style=\"width:80px\" value=\"\" readonly>\r\n                                                            </td>\r\n                                                            <td>\r\n                                                                <a>\r\n                                                                    <img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, document.getElementById('OVERDATE'), 'yyyymmdd')\" style=\"CURSOR: Hand;\">\r\n                                                                </a>\r\n                                                            </td>\r\n                                                        </tr>\r\n                                                    </table>\r\n                                                </td>\r\n                                            </tr>\r\n\r\n\r\n\r\n\r\n\r\n                                        </table>\r\n                                    </td>\r\n                                </tr>\r\n                                <tr>\r\n                                    <td height=\"40\" align=\"right\">\r\n                                ";
  private final static String _jspx_template148 = "\r\n                                    <img src=\"/img/can_icon.gif\" alt=\"취소\" border=\"0\" onclick=\"javascript:history.back();\" style=\"cursor:pointer\" >\r\n                                     \r\n                                    \t<img src=\"/img/save_icon2.gif\" alt=\"저장\" width=\"56\" height=\"18\" border=\"0\" onClick=\"javascript:submitClick();\"  style=\"cursor:pointer\">\r\n                                     \r\n                                ";
  private final static String _jspx_template149 = "\r\n                                </td>\r\n                                </tr>\r\n                            </table>\r\n                        </div>\r\n                    </td>\r\n                </tr>\r\n                <tr>\r\n                    <td height=\"10\">\r\n                    </td>\r\n                </tr>\r\n\r\n            </table>\r\n\r\n        </form>\r\n    </body>\r\n</html>\r\n\r\n";
}
