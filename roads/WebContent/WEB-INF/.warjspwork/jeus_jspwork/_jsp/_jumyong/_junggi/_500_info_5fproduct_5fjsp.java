package jeus_jspwork._jsp._jumyong._junggi;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_info_5fproduct_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(111,23);to=(111,39)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.CHECK_YN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(128,28);to=(128,44)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.CHECK_YN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(161,79);to=(161,81)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${no}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(161,90);to=(161,94)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${year}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(161,110);to=(161,121)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(161,138);to=(161,150)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${countPerPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(188,34);to=(188,50)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.CHECK_YN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(221,34);to=(221,49)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(222,34);to=(222,50)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.CHECK_YN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(223,31);to=(223,43)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.TYPE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(242,23);to=(242,45)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.SURCHARGE_RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(242,58);to=(242,80)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.SURCHARGE_RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(274,33);to=(274,51)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.PURPOSE_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(325,42);to=(325,60)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.PURPOSE_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(335,76);to=(335,91)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // jsp code [from=(335,97);to=(335,109)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.TYPE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);
      // jsp code [from=(335,115);to=(335,133)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.PURPOSE_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template26);
      // jsp code [from=(347,31);to=(347,47)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.CHECK_YN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // jsp code [from=(348,28);to=(348,40)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.TYPE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template28);
      // jsp code [from=(353,40);to=(353,49)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${old_price}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template29);
      // jsp code [from=(367,45);to=(367,59)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${old_area_after}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template30);
      // jsp code [from=(368,45);to=(368,53)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${old_rate}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template31);
      // jsp code [from=(375,33);to=(375,51)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.PURPOSE_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template32);
      out.write(_jspx_template33);
      // jsp code [from=(504,39);to=(504,57)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.PURPOSE_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template34);
      // jsp code [from=(516,76);to=(516,91)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template35);
      // jsp code [from=(516,97);to=(516,109)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.TYPE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template36);
      // jsp code [from=(516,115);to=(516,133)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.PURPOSE_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template37);
      // jsp code [from=(544,30);to=(544,42)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template38);
      // jsp code [from=(588,71);to=(588,86)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.SIGU_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template39);
      // jsp code [from=(589,67);to=(589,80)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.BJ_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template40);
      // jsp code [from=(590,69);to=(590,83)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.TAX_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template41);
      // jsp code [from=(591,71);to=(591,86)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.DEPT_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template42);
      // jsp code [from=(592,75);to=(592,92)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.TAX_GUBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template43);
      // jsp code [from=(593,71);to=(593,86)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.OBJ_SET}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template44);
      // jsp code [from=(594,79);to=(594,98)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.TAXPAYER_ID}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template45);
      // jsp code [from=(595,81);to=(595,101)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.TAXPAYER_SET}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template46);
      // jsp code [from=(596,79);to=(596,98)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.OCR_SIGU_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template47);
      // jsp code [from=(597,81);to=(597,101)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.OCR_BUSEO_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template48);
      // jsp code [from=(598,69);to=(598,83)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.TAX_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template49);
      // jsp code [from=(599,65);to=(599,77)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.LIVE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template50);
      // jsp code [from=(600,71);to=(600,86)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.ADD_SET}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template51);
      // jsp code [from=(601,69);to=(601,83)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.ADD_YN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template52);
      // jsp code [from=(603,73);to=(603,82)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${listSize }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template53);
      // jsp code [from=(604,77);to=(604,82)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${year }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template54);
      // jsp code [from=(607,73);to=(607,75)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${no}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template55);
      // jsp code [from=(608,75);to=(608,92)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.FIRST_SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template56);
      // jsp code [from=(609,65);to=(609,76)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template57);
      // jsp code [from=(611,66);to=(611,70)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mode}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template58);
      // jsp code [from=(612,85);to=(612,100)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${taxation_check }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template59);
      // jsp code [from=(613,77);to=(613,96)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.SUBUSEO_CD }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template60);
      // jsp code [from=(614,71);to=(614,87)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.SECTION }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template61);
      // jsp code [from=(635,103);to=(635,113)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PRICE_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template62);
      // jsp code [from=(636,106);to=(636,116)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PRICE_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template63);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template91);
      // jsp code [from=(674,59);to=(674,80)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${strPageDivideForm_sum}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template92);
      // jsp code [from=(690,109);to=(690,119)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PRICE_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template93);
      // jsp code [from=(691,107);to=(691,117)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PRICE_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template94);
      // jsp code [from=(692,106);to=(692,116)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PRICE_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template95);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_1_fn(pageContext, null)) return;


      out.write(_jspx_template138);
      // jsp code [from=(770,107);to=(770,119)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template139);
      // ----  c:choose ---- invoke //
      if (_jspx_th_c_choose_3_fn(pageContext, null)) return;


      out.write(_jspx_template146);
      // jsp code [from=(789,182);to=(789,199)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.AREA_SIZE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template147);
      // ----  c:choose ---- invoke //
      if (_jspx_th_c_choose_4_fn(pageContext, null)) return;


      out.write(_jspx_template155);
      // jsp code [from=(809,173);to=(809,203)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(product.FROMDATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_1));

      out.write(_jspx_template156);
      // jsp code [from=(817,161);to=(817,189)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(product.TODATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_1));

      out.write(_jspx_template157);
      // jsp code [from=(827,162);to=(827,176)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.PERIOD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template158);
      // jsp code [from=(833,118);to=(833,128)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PRICE_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template159);
      // jsp code [from=(835,168);to=(835,207)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.SUM_LASTYEAR)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

      out.write(_jspx_template160);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_2_fn(pageContext, null)) return;


      out.write(_jspx_template172);
      // jsp code [from=(876,152);to=(876,168)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.TAX_DATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template173);
      // jsp code [from=(889,139);to=(889,153)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.INDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template174);
      // jsp code [from=(904,143);to=(904,159)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.OVERDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template175);
      // jsp code [from=(914,145);to=(914,179)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.OVERTAX)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

      out.write(_jspx_template176);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_3_fn(pageContext, null)) return;


      out.write(_jspx_template178);
      // jsp code [from=(928,106);to=(928,118)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.FORM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template179);
      // jsp code [from=(930,97);to=(930,107)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PRICE_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template180);
      // jsp code [from=(932,147);to=(932,182)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.SUM_YEAR)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

      out.write(_jspx_template181);
      // jsp code [from=(938,122);to=(938,141)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.FORM_ADJUST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template182);
      // jsp code [from=(940,99);to=(940,109)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PRICE_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template183);
      // jsp code [from=(942,154);to=(942,191)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.SUM_ADJUST)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

      out.write(_jspx_template184);
      // jsp code [from=(948,128);to=(948,150)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.PERCENT_REASON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template185);
      // jsp code [from=(952,141);to=(952,161)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.PERCENT_RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template186);
      // jsp code [from=(958,132);to=(958,156)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.REDUCTION_REASON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template187);
      // jsp code [from=(962,145);to=(962,167)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.REDUCTION_RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template188);
      // jsp code [from=(968,128);to=(968,150)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.REDUCTION_FORM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template189);
      // jsp code [from=(971,99);to=(971,109)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PRICE_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template190);
      // jsp code [from=(973,160);to=(973,200)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.REDUCTION_SUM)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

      out.write(_jspx_template191);

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
            out.write(_jspx_template64);
            // ----  c:choose ---- invoke //
            if (_jspx_th_c_choose_0_fn(pageContext, _jspx_th_c_forEach_0)) return true;


            out.write(_jspx_template82);
            // jsp code [from=(653,75);to=(653,85)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template83);
            // jsp code [from=(654,66);to=(654,76)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.AREA}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template84);
            // jsp code [from=(656,66);to=(656,102)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(board.SUM_ADJUST) }",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template85);
            // jsp code [from=(657,66);to=(657,105)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(board.REDUCTION_SUM) }",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template86);
            // jsp code [from=(658,66);to=(658,84)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PERCENT_RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template87);
            // jsp code [from=(659,66);to=(659,86)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.REDUCTION_RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template88);
            // jsp code [from=(660,66);to=(660,84)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TAX_SET_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template89);
            // jsp code [from=(661,66);to=(661,87)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.USE_SECTIONNAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template90);

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
            out.write(_jspx_template96);
            // ----  c:choose ---- invoke //
            if (_jspx_th_c_choose_1_fn(pageContext, _jspx_th_c_forEach_1)) return true;


            out.write(_jspx_template118);
            // jsp code [from=(704,78);to=(704,88)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template119);
            // jsp code [from=(705,66);to=(705,82)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.AREA_AFTER}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template120);
            // ----  c:choose ---- invoke //
            if (_jspx_th_c_choose_2_fn(pageContext, _jspx_th_c_forEach_1)) return true;


            out.write(_jspx_template128);
            // jsp code [from=(716,66);to=(716,94)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(board.FROMDATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_1));

            out.write(_jspx_template129);
            // jsp code [from=(716,98);to=(716,124)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(board.TODATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_1));

            out.write(_jspx_template130);
            // jsp code [from=(717,66);to=(717,104)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(board.SUM_LASTYEAR) }",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template131);
            // jsp code [from=(718,66);to=(718,100)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(board.SUM_YEAR) }",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template132);
            // jsp code [from=(719,66);to=(719,102)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(board.SUM_ADJUST) }",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template133);
            // ----  c:if ---- invoke //
            if (_jspx_th_c_if_0_fn(pageContext, _jspx_th_c_forEach_1)) return true;


            out.write(_jspx_template135);
            // ----  c:if ---- invoke //
            if (_jspx_th_c_if_1_fn(pageContext, _jspx_th_c_forEach_1)) return true;


            out.write(_jspx_template137);

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
          out.write(_jspx_template140);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_3_fn(pageContext, _jspx_th_c_choose_3)) return true;


          out.write(_jspx_template143);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_3_fn(pageContext, _jspx_th_c_choose_3)) return true;


          out.write(_jspx_template145);

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
          out.write(_jspx_template148);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_4_fn(pageContext, _jspx_th_c_choose_4)) return true;


          out.write(_jspx_template151);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_4_fn(pageContext, _jspx_th_c_choose_4)) return true;


          out.write(_jspx_template154);

        } while (_jspx_th_c_choose_4.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_choose_4.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_choose_4.release();
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
    _jspx_th_c_if_2.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.SECTION != '3' }", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
      if (_jspx_eval_c_if_2 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template161);
          // jsp code [from=(842,147);to=(842,165)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.ADJUSTMENT}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template162);
          // ----  c:choose ---- invoke //
          if (_jspx_th_c_choose_5_fn(pageContext, _jspx_th_c_if_2)) return true;


          out.write(_jspx_template169);
          // jsp code [from=(861,168);to=(861,182)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${old_area_after}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template170);
          // jsp code [from=(866,158);to=(866,166)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${old_rate}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template171);

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
    _jspx_th_c_if_3.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.SECTION == '3'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
      if (_jspx_eval_c_if_3 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template177);

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
          out.write(_jspx_template65);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template73);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template81);

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
          out.write(_jspx_template97);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_1_fn(pageContext, _jspx_th_c_choose_1)) return true;


          out.write(_jspx_template107);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_1_fn(pageContext, _jspx_th_c_choose_1)) return true;


          out.write(_jspx_template117);

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
          out.write(_jspx_template121);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_2_fn(pageContext, _jspx_th_c_choose_2)) return true;


          out.write(_jspx_template124);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_2_fn(pageContext, _jspx_th_c_choose_2)) return true;


          out.write(_jspx_template127);

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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.TAX_YN == '0'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template134);

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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.TAX_YN == '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
      if (_jspx_eval_c_if_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template136);

        } while (_jspx_th_c_if_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_1.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_1.release();
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
          out.write(_jspx_template141);
          // jsp code [from=(776,83);to=(776,115)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.PRICE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

          out.write(_jspx_template142);

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
          out.write(_jspx_template144);

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
          out.write(_jspx_template149);
          // jsp code [from=(795,168);to=(795,181)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.MOMEY}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template150);

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
          out.write(_jspx_template152);
          // jsp code [from=(798,167);to=(798,180)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.YOYUL}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template153);

        } while (_jspx_th_c_otherwise_4.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_otherwise_4.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_otherwise_4.release();
    }
    return false;
  }

  private boolean _jspx_th_c_choose_5_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:choose ---- //
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_5 = new org.apache.taglibs.standard.tag.common.core.ChooseTag();
    _jspx_th_c_choose_5.setPageContext(pageContext);
    _jspx_th_c_choose_5.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    try {
      int _jspx_eval_c_choose_5 = _jspx_th_c_choose_5.doStartTag();
      if (_jspx_eval_c_choose_5 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template163);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_5_fn(pageContext, _jspx_th_c_choose_5)) return true;


          out.write(_jspx_template166);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_5_fn(pageContext, _jspx_th_c_choose_5)) return true;


          out.write(_jspx_template168);

        } while (_jspx_th_c_choose_5.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_choose_5.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_choose_5.release();
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
          out.write(_jspx_template66);
          // jsp code [from=(647,169);to=(647,171)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${no}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template67);
          // jsp code [from=(647,177);to=(647,186)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template68);
          // jsp code [from=(647,195);to=(647,206)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template69);
          // jsp code [from=(647,212);to=(647,224)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${countPerPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template70);
          // jsp code [from=(647,230);to=(647,240)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template71);
          // jsp code [from=(647,246);to=(647,263)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.USE_SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template72);

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
          out.write(_jspx_template74);
          // jsp code [from=(650,75);to=(650,77)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${no}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template75);
          // jsp code [from=(650,83);to=(650,92)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template76);
          // jsp code [from=(650,101);to=(650,112)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template77);
          // jsp code [from=(650,118);to=(650,130)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${countPerPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template78);
          // jsp code [from=(650,136);to=(650,146)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template79);
          // jsp code [from=(650,152);to=(650,169)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.USE_SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template80);

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
          out.write(_jspx_template98);
          // jsp code [from=(698,169);to=(698,171)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${no}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template99);
          // jsp code [from=(698,177);to=(698,184)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${sum_seq}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template100);
          // jsp code [from=(698,189);to=(698,198)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template101);
          // jsp code [from=(698,203);to=(698,214)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template102);
          // jsp code [from=(698,220);to=(698,232)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${countPerPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template103);
          // jsp code [from=(698,238);to=(698,248)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template104);
          // jsp code [from=(698,254);to=(698,271)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.USE_SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template105);
          // jsp code [from=(698,277);to=(698,294)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SUM_ADJUST }",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template106);

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
          out.write(_jspx_template108);
          // jsp code [from=(701,75);to=(701,77)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${no}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template109);
          // jsp code [from=(701,83);to=(701,90)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${sum_seq}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template110);
          // jsp code [from=(701,95);to=(701,104)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template111);
          // jsp code [from=(701,109);to=(701,120)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template112);
          // jsp code [from=(701,126);to=(701,138)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${countPerPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template113);
          // jsp code [from=(701,144);to=(701,154)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template114);
          // jsp code [from=(701,160);to=(701,177)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.USE_SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template115);
          // jsp code [from=(701,183);to=(701,200)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SUM_ADJUST }",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template116);

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
          out.write(_jspx_template122);
          // jsp code [from=(709,45);to=(709,58)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.MOMEY}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template123);

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
          out.write(_jspx_template125);
          // jsp code [from=(712,51);to=(712,64)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.YOYUL}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template126);

        } while (_jspx_th_c_otherwise_2.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_otherwise_2.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_otherwise_2.release();
    }
    return false;
  }

  private boolean _jspx_th_c_when_5_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:when ---- //
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_5 = new org.apache.taglibs.standard.tag.rt.core.WhenTag();
    _jspx_th_c_when_5.setPageContext(pageContext);
    _jspx_th_c_when_5.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_when_5.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.CHECK_YN == '2'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_5 = _jspx_th_c_when_5.doStartTag();
      if (_jspx_eval_c_when_5 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template164);
          // jsp code [from=(850,166);to=(850,194)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(old_price)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

          out.write(_jspx_template165);

        } while (_jspx_th_c_when_5.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_when_5.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_when_5.release();
    }
    return false;
  }

  private boolean _jspx_th_c_otherwise_5_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:otherwise ---- //
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_5 = new org.apache.taglibs.standard.tag.common.core.OtherwiseTag();
    _jspx_th_c_otherwise_5.setPageContext(pageContext);
    _jspx_th_c_otherwise_5.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    try {
      int _jspx_eval_c_otherwise_5 = _jspx_th_c_otherwise_5.doStartTag();
      if (_jspx_eval_c_otherwise_5 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template167);

        } while (_jspx_th_c_otherwise_5.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_otherwise_5.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_otherwise_5.release();
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
  private final static String _jspx_template9 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html>\r\n    <head>\r\n        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n        <title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n        <style type=\"text/css\">\r\n            <!--\r\n            body {\r\n                margin: 0px;\r\n                background-image: url(/img/left_back.gif);\r\n            }\r\n            -->\r\n        </style>\r\n        <link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n        <script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script>\r\n        <script language=\"javascript\" src=\"/js/Ajax_request.js\"></script>\r\n        <script language=\"javascript\" src=\"/js/calculation.js\"></script> \r\n\r\n        <script>\r\n            function InitPage()\r\n            {\r\n                var taxdate = document.getElementById(\"TAX_DATE\").value;\r\n                var taxdate_year = Number(taxdate.substr(0,4));\r\n                var taxdate_month = Number(taxdate.substr(5,2));\r\n                var indate_f = new Date(new Date(taxdate_year, taxdate_month, 1)-86400000).getDate();\r\n\r\n                document.getElementById(\"INDATE\").value = taxdate.substr(0,4)+\"-\"+taxdate.substr(5,2)+\"-\"+indate_f;\r\n\r\n                var indate = document.getElementById(\"INDATE\").value;\r\n\r\n                var indate_year = Number(indate.substr(0,4));\r\n                var indate_month = Number(indate.substr(5,2));\r\n                if(indate_month==12){\r\n                    indate_year = indate_year+1;\r\n                    indate_month = 1;\r\n                }else{\r\n                    indate_month++;\r\n                }\r\n\r\n                if(indate_month<10){\r\n                    indate_month = \"0\"+indate_month;\r\n                }\r\n                var over_date = new Date(new Date(indate_year, indate_month, 1)-86400000).getDate();\r\n\r\n                document.getElementById(\"OVERDATE\").value = indate_year+\"-\"+indate_month+\"-\"+over_date;\r\n\r\n\r\n            }\r\n\r\n\r\n            function\tPage(page)\r\n            {\r\n                if(page\t==\t\"\")\r\n                    return;\r\n\r\n                var form = document.productForm;\r\n\r\n                var admin_no = document.getElementById(\"ADMIN_NO\").value;\r\n                var mode = document.getElementById(\"mode\").value;\r\n\r\n                location.href=\"junggi_view.do?currentPage=\"+page+\"&ADMIN_NO=\"+admin_no+\"&mode=\"+mode;\r\n            }\r\n\r\n\r\n            function\tView(adminno, seq)\r\n            {\r\n                params\t= \"ADMIN_NO=\" + adminno + \"&SEQ=\" + seq;\r\n\r\n                sendRequest(\"/jumyong/saewe/sanchulinfo_view.do\", params, \"GET\", Result_InfoView);\r\n\r\n                parent.BugwaView(seq);\r\n            }\r\n\r\n\r\n            function\tResult_InfoView(obj)\r\n            {\r\n\r\n                var xmldoc \t= new ActiveXObject(\"Microsoft.XMLDOM\");\r\n                var form \t= document.form;\r\n\r\n                xmldoc.async\t= false;\r\n                xmldoc.loadXML(obj);\r\n\r\n            }\r\n\r\n\r\n            function submitClick()\r\n            {\r\n                var productForm = document.productForm;\r\n\r\n                if( productForm.mode.value == 'add' ){\r\n                }\r\n                if(\tproductForm.YEAR.value == '0' || productForm.YEAR.value == '' ){\r\n                    alert(\"부과년도를 넣어주세요.\");\r\n                    productForm.YEAR.focus();\r\n                    return;\r\n                }\r\n                if(\tproductForm.OVERTAX.value == '' || productForm.OVERTAX.value == '0' ){\r\n                    alert(\"납기후 금액을 넣어주세요.\");\r\n                    productForm.OVERTAX.focus();\r\n                    return;\r\n                }\r\n                if( productForm.FORM_ADJUST.value == '' ){\r\n                    alert(\"계산을 먼저 해주세요. \");\r\n                    return;\r\n                }\r\n                if('";
  private final static String _jspx_template10 = "' == '2'){\r\n                    if(\tproductForm.PRICE.value == '0' || productForm.PRICE.value == '' ){\r\n                        alert(\"공시지가를 넣고 계산해주세요. \");\r\n                        productForm.PRICE.focus();\r\n                        return;\r\n                    }\r\n                }\r\n                if(\tproductForm.TAX_DATE.value == '' ){\r\n                    alert(\"부과일자를 넣어주세요.\");\r\n                    productForm.TAX_DATE.focus();\r\n                    return;\r\n                }\r\n                //alert(\"year=== \" + document.productForm.YEAR.value);\r\n                if( confirm(\"저장하시겠습니까? \" ) ){\r\n                    document.productForm.year.value = document.productForm.YEAR.value;\r\n                    document.productForm.mode_proc.value = \"addProc\";\r\n                    //comma제거\r\n                    if( '";
  private final static String _jspx_template11 = "' == '2'){\r\n                        removeComma2(\"PRICE\");\r\n                    }\r\n                    removeComma2(\"SUM_LASTYEAR\");\r\n                    removeComma2(\"SUM_YEAR\");\r\n                    removeComma2(\"SUM_ADJUST\");\r\n                    removeComma2(\"OVERTAX\");\r\n                    removeComma2(\"REDUCTION_SUM\");\r\n                    removeComma2(\"VAT\");\r\n\r\n\r\n                    if( document.getElementById(\"REDUCTION_RATE\").value == '' ){\r\n                        document.getElementById(\"REDUCTION_RATE\").value = '0';\r\n                    }\r\n                    if( document.getElementById(\"PERCENT_RATE\").value == '' ){\r\n                        document.getElementById(\"PERCENT_RATE\").value = '0';\r\n                    }\r\n                    productForm.submit();\r\n                }\r\n            }\r\n\r\n\r\n            function subTabClick(hiddenSubTabName,visibleSubTabName)\r\n            {\r\n                document.getElementById(hiddenSubTabName).style.display = 'none';\r\n                document.getElementById(visibleSubTabName).style.display = 'block';\r\n            }\r\n\r\n            function goModify()\r\n            {\r\n                var year = document.getElementById(\"year1\").value;\r\n                var seq = document.getElementById(\"SEQ\").value;\r\n\r\n                location.href = \"/jumyong/junggi/junggi_product.do?ADMIN_NO=";
  private final static String _jspx_template12 = "&year=";
  private final static String _jspx_template13 = "&currentPage=";
  private final static String _jspx_template14 = "&countPerPage=";
  private final static String _jspx_template15 = "\"\r\n                    +\"&mode=edit\";\r\n           }\r\n\r\n\r\n\r\n\r\n\r\n            //add 화면 이동\r\n            function goAdd(adminNo,currentPage,countPage)\r\n            {\r\n                var seq = document.getElementById(\"SEQ\").value;\r\n                location.href(\"/jumyong/junggi/junggi_product.do?ADMIN_NO=\"+adminNo+\"&SEQ=\"+seq+\"&currentPage=\"+currentPage+\"&mode=add\");\r\n            }\r\n\r\n\r\n            //edit 화면 이동\r\n            function goModify(adminNo,currentPage,countPage)\r\n            {\r\n                var seq = document.getElementById(\"SEQ\").value;\r\n                location.href(\"/jumyong/junggi/junggi_product.do?ADMIN_NO=\"+adminNo+\"&SEQ=\"+seq+\"&currentPage=\"+currentPage+\"&mode=edit\");\r\n            }\r\n\r\n\r\n            function Calculate()\r\n            {\r\n                var productForm = document.productForm;\r\n                var checkYn = '";
  private final static String _jspx_template16 = "'; \r\n                                \r\n                if( checkYn == '2' ){\r\n                    if(\tproductForm.PRICE.value == '0' || productForm.PRICE.value == '' ){\r\n                        alert(\"공시지가를 넣고 계산해주세요. \");\r\n                        productForm.PRICE.focus();\r\n                        return;\r\n                    }\r\n                }\r\n\r\n                junggi_calDate();\r\n\r\n                var period = document.getElementById(\"PERIOD\").value;\r\n\r\n                if(Number(period) > 12){\r\n                \t   alert(\"기간이 12개월을 초과할수 없습니다.\");\r\n                       productForm.PERIOD.focus();\r\n                       return;\r\n                }\r\n\r\n                if(Number(period) < 0){\r\n             \t   alert(\"기간이 입력이 잘못되었습니다.\");\r\n                    productForm.PERIOD.focus();\r\n                    return;\r\n\t\t\t\t}\r\n\r\n                var area_after = document.getElementById(\"AREA_AFTER\").value;\r\n                var rate = document.getElementById(\"RATE\").value;\r\n\r\n                var reduction_rate = document.getElementById(\"REDUCTION_RATE\").value;\r\n                var percent_rate = document.getElementById(\"PERCENT_RATE\").value;\r\n                var reduction_rate_form = \"\";\r\n                \r\n                var section = '";
  private final static String _jspx_template17 = "';\r\n                var checkYn = '";
  private final static String _jspx_template18 = "'; \r\n                var type = \"";
  private final static String _jspx_template19 = "\";\r\n                \r\n                if( percent_rate == '' || percent_rate == '0' || percent_rate == '0.0'){\r\n                \tpercent_rate = '100.0';\r\n                }\r\n                \r\n                if(percent_rate != '0.0' && percent_rate != '100.0'){\r\n                \treduction_rate_form += \" X ((\"+percent_rate+\")/100)\";\r\n                }\r\n                if(reduction_rate != '0.0'){\r\n                \treduction_rate_form += \" X ((100-\"+reduction_rate+\")/100)\";\r\n                }\r\n\r\n                // 무단인 경우 과징율\r\n                var surcharge_rate = \"\";\r\n                if( section == '3' ){\r\n                    surcharge_rate = document.getElementById(\"SURCHARGE_RATE\").value;\r\n                }\r\n\r\n                if('";
  private final static String _jspx_template20 = "'=='' || '";
  private final static String _jspx_template21 = "' == '0.0')\r\n                surcharge_rate = 1.2;\r\n                \r\n                \r\n                var sum_year = \"\";\r\n                if( checkYn == '2' ){\r\n                    var price = removeComma(document.getElementById(\"PRICE\").value);\r\n                    document.getElementById(\"FORM\").value = area_after+\"㎡ X \" +rate +\" X \" +insertComma2(price)+\" X \" + period + \"/12 개월 \";\r\n\r\n                    \r\n                    if( section == '3' ){\r\n                        sum_year = fixFloatCal(parseFloat(area_after)*parseFloat(period)/12*parseFloat(rate)*parseFloat(price)*(surcharge_rate));\r\n                    }else{\r\n                        sum_year = fixFloatCal(parseFloat(area_after)*parseFloat(period)/12*parseFloat(rate)*parseFloat(price));\r\n                    }\r\n                }else{\r\n\r\n                    document.getElementById(\"FORM\").value = area_after+\"㎡  X \" +rate + \" X \" + period + \"/12개월\";\r\n\r\n                    //현년도 점용료 계산\r\n                    if( section == '3' ){\r\n                        sum_year = fixFloatCal(parseFloat(area_after)*parseFloat(period)/12*parseFloat(rate)*(surcharge_rate));\r\n                    }else{\r\n                        sum_year = fixFloatCal(parseFloat(area_after)*parseFloat(period)/12*parseFloat(rate));\r\n                    }\r\n                }\r\n\r\n                //부동소수점 오류 수정\r\n                sum_year = fixFloatCal(sum_year);\r\n\r\n                //감면 / 지분율 계산을 위해 백업\r\n                var sum = sum_year;\r\n                var gongyu = \"";
  private final static String _jspx_template22 = "\".charAt(0); // 점용목적. 공물법이면 0으로 시작\r\n\r\n                var strSUM_ADJUST = String( Math.floor(sum_year)); // 소수점 제거\r\n\r\n                if(section != '3'){\r\n                \r\n                \tif(type != '1'){\r\n                        sum_year = (Math.floor(Number(strSUM_ADJUST)/10))* 10; //10원 절삭\r\n                    }else{\r\n                        if(gongyu == '0'){\r\n                        \tsum_year = (Math.floor(Number(strSUM_ADJUST)/10))* 10; //10원 절삭\r\n                        }else{\r\n                        \tsum_year = (Math.floor(Number(strSUM_ADJUST)/100))* 100; //100원 절삭\r\n                        }\r\n                    }\r\n                }else{\r\n                    sum_year = (Math.floor(Number(strSUM_ADJUST)));\r\n                }\r\n                \r\n                document.getElementById(\"SUM_YEAR\").value = sum_year;\r\n\r\n                insertComma(\"SUM_YEAR\");\r\n\r\n                //현년도 점용료 계산 끝\r\n\r\n\r\n                if(section != '3' )//작년도 점용료가 있을때 (무단인 경우는 전년 점용료 관계없음)\r\n                {\r\n                 \tcontinueProduct();\r\n                    \r\n                }else{\r\n                    document.getElementById(\"FORM_ADJUST\").value = document.getElementById(\"FORM\").value+\" X \"+surcharge_rate;\r\n                    document.getElementById(\"REDUCTION_FORM\").value = document.getElementById(\"FORM\").value+\" X \"+surcharge_rate + reduction_rate_form;\r\n                    \r\n                    document.getElementById(\"SUM_ADJUST\").value = sum_year;\r\n                    \r\n                    var reduction_sum = parseFloat(sum) * ((parseFloat(percent_rate))/100) * ((100 - parseFloat(reduction_rate))/100);\r\n                    //부동소수점 오류 수정\r\n                    reduction_sum = fixFloatCal(reduction_sum);\r\n\r\n            \t\tif(type != '1'){\r\n            \t\t\tdocument.getElementById(\"REDUCTION_SUM\").value = parseInt(Math.floor(reduction_sum/10)*10); //10원 절삭\r\n            \t\t}else{\r\n            \t\t\tif(gongyu == '0'){\t// 공물법적용 10원 절삭\r\n            \t\t\t\tdocument.getElementById(\"REDUCTION_SUM\").value = parseInt(Math.floor(reduction_sum/10)*10); //10원 절삭\r\n                        }else{\r\n                        \tdocument.getElementById(\"REDUCTION_SUM\").value = parseInt(Math.floor(reduction_sum/100)*100); //100원 절삭\r\n                        }\r\n                \t}\r\n            \t\t\r\n                    // 납기후 금액\r\n                    if(type != '1' && \"";
  private final static String _jspx_template23 = "\".substr(0,2) == '02'){\r\n                        var overtax = parseFloat(document.getElementById(\"REDUCTION_SUM\").value);\r\n                    }else{\r\n                        var overtax = parseFloat(document.getElementById(\"REDUCTION_SUM\").value)*3/100 + parseFloat(document.getElementById(\"REDUCTION_SUM\").value);\r\n                    }\r\n                    \r\n                    overtax = Math.floor(overtax/10)*10;\r\n                   \tdocument.getElementById(\"OVERTAX\").value = overtax;\r\n\r\n                   \t// 부가가치세\r\n                   \tdocument.getElementById(\"VAT\").value = inquiryVatYN('";
  private final static String _jspx_template24 = "','";
  private final static String _jspx_template25 = "','";
  private final static String _jspx_template26 = "',Number(document.getElementById(\"REDUCTION_SUM\").value));\r\n                   \t\r\n                    insertComma(\"SUM_ADJUST\");\r\n                    insertComma(\"REDUCTION_SUM\");\r\n                    insertComma(\"OVERTAX\");\r\n                    insertComma(\"VAT\");\r\n\r\n                }\r\n            }\r\n\r\n            function continueProduct()\r\n            {\r\n            \tvar checkYn = '";
  private final static String _jspx_template27 = "';\r\n            \tvar type = \"";
  private final static String _jspx_template28 = "\";\r\n\r\n\r\n                if(checkYn == '2'){\r\n                \tvar price = removeComma(document.getElementById(\"PRICE\").value);\r\n                    var old_price = \"";
  private final static String _jspx_template29 = "\";\r\n                }else{\r\n                    var price = 1;\r\n                    var old_price = 1;\r\n\r\n                }\r\n                \r\n               \r\n                var period = document.getElementById(\"PERIOD\").value;\r\n\r\n\r\n                var area_after = setFROMTO(document.getElementById(\"AREA_AFTER\").value,0,1);\r\n                var rate = setFROMTO(document.getElementById(\"RATE\").value,0,1);\r\n                \r\n                var old_area = setFROMTO(\"";
  private final static String _jspx_template30 = "\",0,1);\r\n                var old_rate = setFROMTO(\"";
  private final static String _jspx_template31 = "\",0,1);\r\n\r\n\r\n                var rateSumyear = fixFloatCal(parseFloat(old_area)*parseFloat(rate)*parseFloat(price));\r\n                var rateLastyear = removeComma(document.getElementById(\"SUM_LASTYEAR\").value);\r\n\r\n                var rate1 = Math.floor((rateSumyear - rateLastyear ) / rateLastyear *100 ); // 현년도 작년도 점용료 비율\r\n                var gongyu = \"";
  private final static String _jspx_template32 = "\".charAt(0); // 점용목적. 공물법이면 0으로 시작\r\n                //console.log(\"gongyu: \" + \tgongyu);\r\n                //console.log(\"rate1: \" + \trate1);\r\n                //console.log(\"checkYn: \" + \tcheckYn);\r\n                //console.log(\"type: \" + \ttype);\r\n                if(gongyu == '0' && rate1 >= 5 && rate1 <=3000 && checkYn == '2' && type == '1'){\r\n                \tvar adjust = (rateSumyear - (rateLastyear + (rateLastyear * 0.05))) * 0.3;\t// jojung_rate가 5이상이면 증가율의 70%가 조정계수가 됨\r\n                \t//console.log(\"adjust: \" + adjust);\r\n                }\r\n                else if( rate1 >= 10 && rate1 <=3000 && checkYn == '2' && type == '1')//비율이 허용 범위내에 있을때\r\n                {\t\r\n                    //var adjust = calJojungNew(rate1);\r\n                \tvar adjust = calJojung2015(rate1); // 수정(2016.01)\r\n                }else if( rate1 >= 5 && checkYn == '2' && type != '1')//비율이 허용 범위내에 있을때\r\n                {\t\r\n                \tif(gongyu != 0){\r\n                \t\tvar adjust = 1.05;\r\n                    }else{\r\n                    \tvar adjust = (rateSumyear - (rateLastyear + (rateLastyear * 0.05))) * 0.3;\r\n                    }\r\n                }else{\r\n                \tvar adjust = 1;\r\n                }\r\n\r\n                if(old_area != area_after){\r\n\t\t\t\t\t//isAreaChange = true;\r\n\t\t\t\t\tvar adjust = 1;\r\n\t\t\t\t}\r\n\t\t\t\t\r\n                document.getElementById(\"ADJUSTMENT\").value = adjust;\r\n                \r\n                var percent_rate = document.getElementById(\"PERCENT_RATE\").value;\r\n                var reduction_rate = document.getElementById(\"REDUCTION_RATE\").value;\r\n                var reduction_rate_form = \"\";\r\n\r\n                if( percent_rate == '' || percent_rate == '0' || percent_rate == '0.0'){\r\n                \tpercent_rate = '100.0';\r\n                }\r\n                \r\n                if(percent_rate != '0.0' && percent_rate != '100.0'){\r\n                \treduction_rate_form += \" X ((\"+percent_rate+\")/100)\";\r\n                }\r\n                if(reduction_rate != '0.0'){\r\n                \treduction_rate_form += \" X ((100-\"+reduction_rate+\")/100)\";\r\n                }\r\n\r\n                if(adjust == 1){\r\n\r\n                \t   var SUM_ADJUST = fixFloatCal(parseFloat(area_after)*parseFloat(rate)*parseFloat(price)*parseFloat(adjust)*parseFloat(period)/12);\r\n                       var REDUCTION_SUM = fixFloatCal(SUM_ADJUST*((percent_rate)/100)*((100-reduction_rate)/100));                 \r\n\r\n                       if(type != '1'){\r\n                          //10원 절삭\r\n                          SUM_ADJUST = Math.floor(SUM_ADJUST / 10 ) * 10 ; //10원 절삭\r\n                          REDUCTION_SUM = Math.floor( REDUCTION_SUM / 10 ) * 10 ; //10원 절삭\r\n                       }else{\r\n                    \t //100원 절삭\r\n                    \t   if(gongyu == '0'){\t// 공물법적용 10원 절삭\r\n                    \t\t   SUM_ADJUST = Math.floor(SUM_ADJUST / 10 ) * 10 ; //10원 절삭\r\n                               REDUCTION_SUM = Math.floor( REDUCTION_SUM / 10 ) * 10 ; //10원 절삭\r\n                           }else{\r\n                        \t   SUM_ADJUST = Math.floor(SUM_ADJUST / 100 ) * 100 ; //100원 절삭\r\n                               REDUCTION_SUM = Math.floor( REDUCTION_SUM / 100 ) * 100 ; //100원 절삭\r\n                           }\r\n       \t\t\t\t}\r\n                       document.getElementById(\"SUM_ADJUST\").value = insertComma2(SUM_ADJUST);\r\n                       if(checkYn == '2'){\r\n                      \t\tdocument.getElementById(\"FORM_ADJUST\").value = area_after+\"㎡  X \" +rate +\" X \" + insertComma2(price)+\" X \" + period + \"/12 개월 X \"+adjust;\r\n                       }else{\r\n                      \t\tdocument.getElementById(\"FORM_ADJUST\").value = area_after+\"㎡  X \" +rate +\" X \" + period + \"/12 개월 \";\r\n                       }\r\n                       document.getElementById(\"REDUCTION_SUM\").value = insertComma2(REDUCTION_SUM);\r\n                       document.getElementById(\"REDUCTION_FORM\").value = document.getElementById(\"FORM_ADJUST\").value + reduction_rate_form;\r\n                       \r\n\r\n                }else{\r\n\r\n                    var sum_lastyear =document.getElement";
  private final static String _jspx_template33 = "ById(\"SUM_LASTYEAR\").value;\r\n                    if(gongyu != 0){\r\n\t                    var SUM_ADJUST = fixFloatCal((parseFloat(removeComma(sum_lastyear))  * parseFloat(adjust)) * (parseFloat(area_after)/parseFloat(old_area)));\r\n\t                    var REDUCTION_SUM = fixFloatCal(SUM_ADJUST*((percent_rate)/100)*((100-reduction_rate)/100));                 \r\n\r\n\t                    //console.log(\"SUM_ADJUST: \" + SUM_ADJUST);\r\n\t                    //console.log(\"REDUCTION_SUM: \" + REDUCTION_SUM);\r\n\t                    \r\n\t                    if(type != '1'){\r\n\t                       //10원 절삭\r\n\t                       SUM_ADJUST = Math.floor(SUM_ADJUST / 10 ) * 10 ; //10원 절삭\r\n\t                       REDUCTION_SUM = Math.floor( REDUCTION_SUM / 10 ) * 10 ; //10원 절삭\r\n\t                    }else{\r\n                        \t//100원 절삭\r\n                            SUM_ADJUST = Math.floor(SUM_ADJUST / 100 ) * 100 ; //100원 절삭\r\n                            REDUCTION_SUM = Math.floor( REDUCTION_SUM / 100 ) * 100 ; //100원 절삭\r\n\t    \t\t\t\t}\r\n\t                    document.getElementById(\"SUM_ADJUST\").value = insertComma2(SUM_ADJUST);\r\n\t                    var formAdujst = sum_lastyear + \"원 X \" + period + \"/12개월  X \" + adjust;\r\n\t                   // if(area_after != old_area){\r\n\t                   // \tformAdujst += \" X \" + area_after + \"㎡/\"+old_area + \"㎡\";\r\n\t                   // }\r\n\t                    document.getElementById(\"FORM_ADJUST\").value = formAdujst;\r\n\t                    document.getElementById(\"REDUCTION_SUM\").value = insertComma2(REDUCTION_SUM);\r\n\t                    document.getElementById(\"REDUCTION_FORM\").value = document.getElementById(\"FORM_ADJUST\").value + reduction_rate_form;\r\n                \t}else{\t// 공물법 적용\r\n                \t\t//var SUM_ADJUST = fixFloatCal((parseFloat(removeComma(sum_lastyear))  + parseFloat(adjust)) * (parseFloat(area_after)/parseFloat(old_area)));\r\n                \t\tvar SUM_ADJUST = fixFloatCal((parseFloat(removeComma(sum_lastyear) * (removeComma(sum_lastyear)*0.05))  + parseFloat(adjust)) * (parseFloat(area_after)/parseFloat(old_area)));\r\n\t                    var REDUCTION_SUM = fixFloatCal(SUM_ADJUST*((percent_rate)/100)*((100-reduction_rate)/100));\r\n\r\n\t                    SUM_ADJUST = Math.floor( SUM_ADJUST / 10 ) * 10 ; //10원 절삭\r\n                        REDUCTION_SUM = Math.floor( REDUCTION_SUM / 10 ) * 10 ; //10원 절삭\r\n\t\t\t\t\t\tvar tempSum = parseFloat(removeComma(sum_lastyear) + (removeComma(sum_lastyear)*0.05));\r\n                        var formAdujst = tempSum + \"원 + \"+ Math.floor(adjust);\r\n\t                    \r\n\t                    document.getElementById(\"FORM_ADJUST\").value = formAdujst;\r\n\t                    document.getElementById(\"REDUCTION_SUM\").value = insertComma2(REDUCTION_SUM);\r\n\t                    //document.getElementById(\"REDUCTION_FORM\").value = document.getElementById(\"FORM_ADJUST\").value + reduction_rate_form;\r\n\r\n\t                    if(reduction_rate_form != \"\"){\r\n\t                    \tdocument.getElementById(\"REDUCTION_FORM\").value = \"(\" + formAdujst + \")\" + reduction_rate_form;\r\n\t                    }else{\r\n\t                    \tdocument.getElementById(\"REDUCTION_FORM\").value = formAdujst;\r\n\t                    }\r\n                \t}\r\n\r\n                    \r\n\r\n                }\r\n\r\n                    // 납기후 금액\r\n                    \r\n\t                if(type != '1' && \"";
  private final static String _jspx_template34 = "\".substr(0,2) == '02'){\r\n\t                    var overtax = (parseFloat(REDUCTION_SUM));\r\n\t                }else{\r\n\t                    var overtax = Math.floor(parseFloat(REDUCTION_SUM)*3.0/100 + parseFloat(REDUCTION_SUM));\r\n\t                }\r\n\t                \r\n                    overtax = Math.floor(overtax/10)*10;\r\n                    document.getElementById(\"OVERTAX\").value = overtax;\r\n                    insertComma(\"OVERTAX\");\r\n\r\n\r\n                \t// 부가가치세\r\n                   \tdocument.getElementById(\"VAT\").value = inquiryVatYN('";
  private final static String _jspx_template35 = "','";
  private final static String _jspx_template36 = "','";
  private final static String _jspx_template37 = "',Number(REDUCTION_SUM));\r\n                   \tinsertComma(\"VAT\");\r\n                    \r\n\r\n            }\r\n\r\n            //view 화면 이동\r\n            function goView(adminNo,sum_seq,seq,currentPage,countPage,year,usesection,modeCheck)\r\n            {\r\n                if( modeCheck == '0' ){\r\n                    location.href(\"/jumyong/junggi/junggi_product.do?ADMIN_NO=\"+adminNo+\"&SEQ=\"+seq+\"&currentPage=\"+currentPage+\"&year=\"+year+\"&mode=edit\");\r\n                }\r\n                else{\r\n                    location.href(\"/jumyong/junggi/junggi_view.do?ADMIN_NO=\"+adminNo+\"&seq=\"+seq+\"&sum_seq=\"+sum_seq+\"&currentPage=\"+currentPage+\"&year=\"+year+\"&usesectoin=\"+usesection);\r\n                }\r\n            }\r\n\r\n\r\n\r\n            function setYear()\r\n            {\r\n                now = new Date();\r\n                //Y = now.getYear();\t// 더이상 지원 안함\r\n                Y = now.getFullYear();\r\n\r\n                var date = new Date();\r\n\r\n\r\n                strYear = \"";
  private final static String _jspx_template38 = "\";\r\n\r\n                for(var i = 0 ; i < 10 ; i++){\r\n                    newItem = new Option(i);\r\n                    document.getElementById(\"YEAR\").options[i]  = newItem;\r\n                    document.getElementById(\"YEAR\").options[i].text = Y+(10-i);\r\n                    document.getElementById(\"YEAR\").options[i].value = Y+(10-i);\r\n                    if(strYear == Y+(10-i)) document.getElementById(\"YEAR\").options[i].selected = true;\r\n                }\r\n\r\n\r\n                for(var i = 0 ; i < 10 ; i++){\r\n                    newItem = new Option(i);\r\n                    document.getElementById(\"YEAR\").options[i+10]  = newItem;\r\n                    document.getElementById(\"YEAR\").options[i+10].text = Y-i;\r\n                    document.getElementById(\"YEAR\").options[i+10].value = Y-i;\r\n                    if(strYear == Y-i) document.getElementById(\"YEAR\").options[i+10].selected = true;\r\n                }\r\n            }\r\n\r\n\r\n            function changeYear(yearVal)\r\n            {\r\n                document.getElementById(\"FROMDATE\").value = yearVal+\"-01-01\";\r\n                document.getElementById(\"TODATE\").value = yearVal+\"-12-31\";\r\n            }\r\n\r\n            //공시지가 팝업\r\n            function openLandPricePopUp()\r\n            {\r\n                var winW = 320;\r\n                var winH = 240;\r\n                var status =\"toolbar=no, location=no, directories=no, status=no, menubar=no, resizable=no, scrollbars=no, width=\"+winW+\", height=\"+winH+\", left=0, top=0\";\r\n\r\n                var admin_no = document.getElementById(\"ADMIN_NO\").value;\r\n                var year = document.productForm.YEAR.value;\r\n                window.open('/land_price.do?ADMIN_NO='+admin_no+'&year='+year, 'win', status);\r\n            }\r\n\r\n        </script>\r\n    </head>\r\n\r\n    <body onload=\"javascript:InitPage();\"  border=\"0\">\r\n        <form id=\"productForm\" name=\"productForm\" method=\"post\" action = \"/jumyong/junggi/junggi_product.do\" >\r\n            <input type=\"hidden\" id=\"SIGU_CD\" name=\"SIGU_CD\" value=\"";
  private final static String _jspx_template39 = "\">\r\n            <input type=\"hidden\" id=\"BJ_CD\" name=\"BJ_CD\" value=\"";
  private final static String _jspx_template40 = "\">\r\n            <input type=\"hidden\" id=\"TAX_NO\" name=\"TAX_NO\" value=\"";
  private final static String _jspx_template41 = "\">\r\n            <input type=\"hidden\" id=\"DEPT_CD\" name=\"DEPT_CD\" value=\"";
  private final static String _jspx_template42 = "\">\r\n            <input type=\"hidden\" id=\"TAX_GUBUN\" name=\"TAX_GUBUN\" value=\"";
  private final static String _jspx_template43 = "\">\r\n            <input type=\"hidden\" id=\"OBJ_SET\" name=\"OBJ_SET\" value=\"";
  private final static String _jspx_template44 = "\">\r\n            <input type=\"hidden\" id=\"TAXPAYER_ID\" name=\"TAXPAYER_ID\" value=\"";
  private final static String _jspx_template45 = "\">\r\n            <input type=\"hidden\" id=\"TAXPAYER_SET\" name=\"TAXPAYER_SET\" value=\"";
  private final static String _jspx_template46 = "\">\r\n            <input type=\"hidden\" id=\"OCR_SIGU_CD\" name=\"OCR_SIGU_CD\" value=\"";
  private final static String _jspx_template47 = "\">\r\n            <input type=\"hidden\" id=\"OCR_BUSEO_CD\" name=\"OCR_BUSEO_CD\" value=\"";
  private final static String _jspx_template48 = "\">\r\n            <input type=\"hidden\" id=\"TAX_CD\" name=\"TAX_CD\" value=\"";
  private final static String _jspx_template49 = "\">\r\n            <input type=\"hidden\" id=\"LIVE\" name=\"LIVE\" value=\"";
  private final static String _jspx_template50 = "\">\r\n            <input type=\"hidden\" id=\"ADD_SET\" name=\"ADD_SET\" value=\"";
  private final static String _jspx_template51 = "\">\r\n            <input type=\"hidden\" id=\"ADD_YN\" name=\"ADD_YN\" value=\"";
  private final static String _jspx_template52 = "\">\r\n\r\n            <input type=\"hidden\" id=\"listSize\" name=\"listSize\" value=\"";
  private final static String _jspx_template53 = "\"><!-- 년도별 정기,수시 갯수  -->\r\n            <input type=\"hidden\" id=\"year_multi\" name=\"year_multi\" value=\"";
  private final static String _jspx_template54 = "\">\r\n            <input type=\"hidden\" id=\"year\" name=\"year\" value=\"\">\r\n            <input type=\"hidden\" id=\"mode_proc\" name=\"mode_proc\" value=\"\">\r\n            <input type=\"hidden\" id=\"ADMIN_NO\" name=\"ADMIN_NO\" value=\"";
  private final static String _jspx_template55 = "\">\r\n            <input type=\"hidden\" id=\"FIRST_SEQ\" name=\"FIRST_SEQ\" value=\"";
  private final static String _jspx_template56 = "\">\r\n            <input type=\"hidden\" id=\"SEQ\" name=\"SEQ\"   value=\"";
  private final static String _jspx_template57 = "\">\r\n            <input type=\"hidden\" id=\"RATE1\" name=\"RATE1\" value=\"\" >\r\n            <input type=\"hidden\" id=\"mode\" name=\"mode\"  value=\"";
  private final static String _jspx_template58 = "\">\r\n            <input type=\"hidden\" id=\"taxation_check\" name=\"taxation_check\" value=\"";
  private final static String _jspx_template59 = "\">\r\n            <input type=\"hidden\" id=\"SUBUSEO_CD\" name=\"SUBUSEO_CD\" value=\"";
  private final static String _jspx_template60 = "\">\r\n            <input type=\"hidden\" id=\"SECTION\" name=\"SECTION\" value=\"";
  private final static String _jspx_template61 = "\">\r\n            \r\n            <table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                <tr>\r\n                    <td class=\"contborder_purple\">\r\n                        <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                            <tr>\r\n                                <td>\r\n                                    <table width=\"100%\" border=\"0\"  cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n                                        <tr>\r\n                                            <td width=\"10%\" height=\"26\" align=\"left\"  class=\"sub_table_b\">* 산출 정보 리스트</td>\r\n                                        </tr>\r\n                                    </table>\r\n                                </td>\r\n                            </tr>\r\n                            <tr>\r\n                                <td>\r\n                                    <table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n                                        <tr>\r\n                                            <td height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">부과년도</td>\r\n                                            <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">면적</td>\r\n                                            <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">";
  private final static String _jspx_template62 = "</td>\r\n                                            <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">최종 ";
  private final static String _jspx_template63 = "</td>\r\n                                            <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">지분율 </td>\r\n                                            <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">감면율 </td>\r\n                                            <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\"> 세입구분 </td>\r\n                                            <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\"> 과세 구분 </td>\r\n                                        </tr>\r\n\r\n\r\n                                        ";
  private final static String _jspx_template64 = "\r\n                                        ";
  private final static String _jspx_template65 = "\r\n                                        ";
  private final static String _jspx_template66 = "\r\n                                        <tr onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\" onclick=\"javascript:goView('";
  private final static String _jspx_template67 = "','";
  private final static String _jspx_template68 = "','','";
  private final static String _jspx_template69 = "','";
  private final static String _jspx_template70 = "','";
  private final static String _jspx_template71 = "','";
  private final static String _jspx_template72 = "');\" style=\"cursor:pointer\" >\r\n                                        ";
  private final static String _jspx_template73 = "\r\n                                        ";
  private final static String _jspx_template74 = "\r\n                                        <tr onclick=\"javascript:goView('";
  private final static String _jspx_template75 = "','";
  private final static String _jspx_template76 = "','','";
  private final static String _jspx_template77 = "','";
  private final static String _jspx_template78 = "','";
  private final static String _jspx_template79 = "','";
  private final static String _jspx_template80 = "');\" bgcolor=\"#f6f7f8\">\r\n                                        ";
  private final static String _jspx_template81 = "\r\n                                        ";
  private final static String _jspx_template82 = "\r\n                                        \t<td height=\"26\" align=\"center\">";
  private final static String _jspx_template83 = "</td>\r\n                                            <td align=\"center\">";
  private final static String _jspx_template84 = "</td>\r\n\r\n                                            <td align=\"center\">";
  private final static String _jspx_template85 = "</td>\r\n                                            <td align=\"center\">";
  private final static String _jspx_template86 = "</td>\r\n                                            <td align=\"center\">";
  private final static String _jspx_template87 = "%</td>\r\n                                            <td align=\"center\">";
  private final static String _jspx_template88 = "%</td>\r\n                                            <td align=\"center\">";
  private final static String _jspx_template89 = "</td>\r\n                                            <td align=\"center\">";
  private final static String _jspx_template90 = "</td>\r\n                                        </tr>\r\n                                        ";
  private final static String _jspx_template91 = "\r\n                                    </table>\r\n                                </td>\r\n                            </tr>\r\n                            <tr>\r\n                                <td height=\"40\" align=\"center\">\r\n                                    <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                                        <tr>\r\n                                            <td align=\"center\">\r\n                                                <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n                                                    <tr>\r\n                                                        ";
  private final static String _jspx_template92 = "\r\n                                                    </tr>\r\n                                                </table>\r\n                                            </td>\r\n                                        </tr>\r\n                                    </table>\r\n                                </td>\r\n                            </tr>\r\n                            <tr>\r\n                                <td>\r\n                                    <table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n                                        <tr>\r\n                                            <td height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">부과년도</td>\r\n                                            <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">면적</td>\r\n                                            <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">요율(단가)</td>\r\n                                            <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">산출기간</td>\r\n                                            <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">전년 연간 ";
  private final static String _jspx_template93 = "</td>\r\n                                            <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">현년도 ";
  private final static String _jspx_template94 = "</td>\r\n                                            <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조정 ";
  private final static String _jspx_template95 = "</td>\r\n                                            <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">부과 여부</td>\r\n                                        </tr>\r\n                                        ";
  private final static String _jspx_template96 = "\r\n                                        ";
  private final static String _jspx_template97 = "\r\n                                        ";
  private final static String _jspx_template98 = "\r\n                                        <tr onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\" onclick=\"javascript:goView('";
  private final static String _jspx_template99 = "','";
  private final static String _jspx_template100 = "',";
  private final static String _jspx_template101 = ",'";
  private final static String _jspx_template102 = "','";
  private final static String _jspx_template103 = "','";
  private final static String _jspx_template104 = "','";
  private final static String _jspx_template105 = "','";
  private final static String _jspx_template106 = "');\" style=\"cursor:pointer\" >\r\n                                        ";
  private final static String _jspx_template107 = "\r\n                                        ";
  private final static String _jspx_template108 = "\r\n                                        <tr onclick=\"javascript:goView('";
  private final static String _jspx_template109 = "','";
  private final static String _jspx_template110 = "',";
  private final static String _jspx_template111 = ",'";
  private final static String _jspx_template112 = "','";
  private final static String _jspx_template113 = "','";
  private final static String _jspx_template114 = "','";
  private final static String _jspx_template115 = "','";
  private final static String _jspx_template116 = "');\" bgcolor=\"#f6f7f8\">\r\n                                        ";
  private final static String _jspx_template117 = "\r\n                                        ";
  private final static String _jspx_template118 = "\r\n                                            <td height=\"26\" align=\"center\">";
  private final static String _jspx_template119 = "</td>\r\n                                            <td align=\"center\">";
  private final static String _jspx_template120 = "</td>\r\n                                            <td align=\"center\">\r\n                                        \t\t";
  private final static String _jspx_template121 = "\r\n                                        \t\t";
  private final static String _jspx_template122 = "\r\n                                        \t\t";
  private final static String _jspx_template123 = "\r\n                                        \t\t";
  private final static String _jspx_template124 = "\r\n                                                ";
  private final static String _jspx_template125 = "\r\n                                                ";
  private final static String _jspx_template126 = "\r\n                                                ";
  private final static String _jspx_template127 = "\r\n                                            \t";
  private final static String _jspx_template128 = "\r\n                                            </td>\r\n                                            <td align=\"center\">";
  private final static String _jspx_template129 = "~";
  private final static String _jspx_template130 = "</td>\r\n                                            <td align=\"center\">";
  private final static String _jspx_template131 = "</td>\r\n                                            <td align=\"center\">";
  private final static String _jspx_template132 = "</td>\r\n                                            <td align=\"center\">";
  private final static String _jspx_template133 = "</td>\r\n                                            <td align=\"center\"><font color=\"red\">\r\n                                            \t";
  private final static String _jspx_template134 = "\r\n\t                    \t\t\t\t\t\t\t미부과\r\n                                                ";
  private final static String _jspx_template135 = "\r\n                                                ";
  private final static String _jspx_template136 = "\r\n\t                    \t\t\t\t\t\t\t부과\r\n                                                ";
  private final static String _jspx_template137 = "\r\n                                                </font>\r\n                                            </td>\r\n                                        </tr>\r\n                                        ";
  private final static String _jspx_template138 = "\r\n                                    </table>\r\n                                </td>\r\n                            </tr>\r\n                            <tr>\r\n                                <td height=\"40\" align=\"center\">\r\n                                    <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                                        <tr>\r\n                                            <td align=\"center\">\r\n                                                <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n                                                    <tr>\r\n                                                        <!-- 페이징 삭제 strPageDivideForm-->\r\n                                                    </tr>\r\n\r\n                                                </table>\r\n                                            </td>\r\n                                        </tr>\r\n                                        <tr>\r\n                                        </tr>\r\n                                    </table>\r\n                                </td>\r\n                            </tr>\r\n                        </table>\r\n                        <div id=\"edit\" style=\"width:100%;\">\r\n                            <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                                <tr>\r\n                                    <td>\r\n                                        <table width=\"100%\" border=\"0\"  cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n                                            <tr>\r\n                                                <td width=\"10%\" height=\"26\" align=\"left\"  class=\"sub_table_b\">* 세부 내역</td>\r\n                                            </tr>\r\n                                        </table>\r\n                                    </td>\r\n                                </tr>\r\n                                <tr>\r\n                                    <td>\r\n                                             <table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n                                                 <tr>\r\n                                                     <td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">부과년도</td>\r\n                                                     <td width=\"42%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                     \t<input id=\"YEAR\" name=\"YEAR\" type=\"text\" value = \"";
  private final static String _jspx_template139 = "\" style=\"width:80px;ime-mode:disabled;text-align:right\"  class=\"input_form1\"  onKeyDown=\"onlyNumberInput();\">\r\n                                         \t\t\t</td>\r\n                                    \t\t\t\t\t";
  private final static String _jspx_template140 = "\r\n                                    \t\t\t\t\t";
  private final static String _jspx_template141 = "\r\n                                    \t\t\t\t\t<td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">현년 공시지가</td>\r\n                                    \t\t\t\t\t<td width=\"32%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                    \t\t\t\t\t\t<input id=\"PRICE\" name=\"PRICE\" value=\"";
  private final static String _jspx_template142 = "\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;text-align:right\" onkeyup=\"javascript:fn_addComma(this)\"  onKeyDown=\"onlyNumberInput();\" >원\r\n                                                     \t\t<img src=\"/img/landPrice.gif\" alt=\"공시지가조회\" height=\"18\" border=\"0\" style=\"cursor:pointer\" onclick=\"javascript:openLandPricePopUp()\"; >\r\n                                            \t\t\t</td>\r\n                                            ";
  private final static String _jspx_template143 = "\r\n         \t\t\t                                ";
  private final static String _jspx_template144 = "\r\n\t\t\t\t\t\t\t\t\t\t\t<td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\"></td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td width=\"32%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" ></td>\r\n\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template145 = "\r\n\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template146 = "\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n                                        <tr>\r\n                                            <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">현년 점용면적</td>\r\n                                            <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                            \t<input id=\"AREA_AFTER\" name=\"AREA_AFTER\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;text-align:right\" value=\"";
  private final static String _jspx_template147 = "\"   onKeyDown=\"onlyNumberInput();\" readonly>㎡\r\n                                           \t</td>\r\n\t                                        <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">현년 요율(단가)</td>\r\n\t                                        <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\t                                        ";
  private final static String _jspx_template148 = "\r\n\t                                        ";
  private final static String _jspx_template149 = "\r\n\t                                        \t<input id=\"RATE\" name=\"RATE\"  type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;text-align:right\" value=\"";
  private final static String _jspx_template150 = "\"  onKeyDown=\"onlyNumberInput();\">\r\n\t                                        ";
  private final static String _jspx_template151 = "\r\n\t                                        ";
  private final static String _jspx_template152 = "\r\n\t                                        \t<input id=\"RATE\" name=\"RATE\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;text-align:right\" value=\"";
  private final static String _jspx_template153 = "\"  onKeyDown=\"onlyNumberInput();\">\r\n\t                                        ";
  private final static String _jspx_template154 = "\r\n\t                                        ";
  private final static String _jspx_template155 = "\r\n\t                                        </td>\r\n                                        </tr>\r\n                                       <tr height=\"50\">\r\n                                           <td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">산출 기간</td>\r\n                                           <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                               <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n                                                   <tr>\r\n                                                       <td>\r\n                                                       \t<input id=\"FROMDATE\" name=\"FROMDATE\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template156 = "\"  onKeyDown=\"onlyNumberInput();\"   onKeyDown=\"onlyNumberInput();\" maxlength=10>\r\n\t\t                                            </td>\r\n\t\t                                            <td>\r\n\t\t                                                <img src=\"/img/calendar_icon.gif\" onclick=\"popUpCalendar(this, document.getElementById('FROMDATE'), 'yyyymmdd');\"  style=\"cursor:pointer\" >\r\n\t\t                                            </td>\r\n\t\t\r\n\t\t                                            <td width=\"16\" align=\"center\">~</td>\r\n\t\t                                            <td>\r\n\t\t                                            \t<input id=\"TODATE\" name=\"TODATE\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\"  value=\"";
  private final static String _jspx_template157 = "\"  onKeyDown=\"onlyNumberInput();\" maxlength=10>\r\n\t\t                                        \t</td>\r\n\t\t\t                                        <td>\r\n\t\t\t                                            <img src=\"/img/calendar_icon.gif\" onclick=\"popUpCalendar(this, document.getElementById('TODATE'), 'yyyymmdd');\"  style=\"cursor:pointer\" >\r\n\t\t\t                                        </td>\r\n                                       \t\t\t</tr>\r\n\t\t                                        <tr><td height=\"3\"></td></tr>\r\n\t\t                                        <tr>\r\n\t\t                                            <td colspan=\"5\">\r\n\t\t                                            \t달수 :\r\n\t\t                                            \t<input id =\"PERIOD\" name=\"PERIOD\" type=\"text\" class=\"input_form1\" style=\"width:60px;ime-mode:disabled\" value = \"";
  private final static String _jspx_template158 = "\"   onKeyDown=\"onlyNumberInput();\" >\r\n\t\t                                        \t\t<img src=\"/img/cal_month.gif\" align=\"absmiddle\" alt=\"날짜 계산\" width=\"64\" height=\"18\" border=\"0\" style=\"cursor:pointer\" onClick=\"javascript:junggi_calDate();\">\r\n\t                                        \t\t</td>\r\n\t\t                                        </tr>\r\n                                   \t\t\t</table>\r\n                           \t\t\t\t</td>\r\n\t\t\t                         \t<td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">전년 조정 ";
  private final static String _jspx_template159 = "</td>\r\n\t\t\t\t\t                    <td width=\"42%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\t\t\t\t\t                    \t<input id=\"SUM_LASTYEAR\" name=\"SUM_LASTYEAR\" type=\"text\"  class=\"input_form1\" style=\"width:80px;ime-mode:disabled;text-align:right\" value=\"";
  private final static String _jspx_template160 = "\"   onKeyDown=\"onlyNumberInput();\" onkeyup=\"javascript:fn_addComma(this)\">원\r\n\t\t\t\t\t               \t\t</td>\r\n\t\t\t\t               \t\t</tr>\r\n\t\t\t\t               \t\t";
  private final static String _jspx_template161 = "\r\n\t\t\t\t               \t\t<tr>\r\n\t\t\t\t\t                    <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조정 계수</td>\r\n\t\t\t\t\t                    <td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t    \t                <input id=\"ADJUSTMENT\" name=\"ADJUSTMENT\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template162 = "\"   onKeyDown=\"onlyNumberInput();\" >\r\n\t\t\t\t\t\t                </td>\r\n\t\t\t\t\t                 \t\r\n\t\t\t\t\t                    \r\n\t\t\t\t\t                    <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">전년 공시지가</td>\r\n\t\t\t\t\t                    <td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t                    ";
  private final static String _jspx_template163 = "\r\n\t\t\t\t\t\t                        ";
  private final static String _jspx_template164 = "\r\n\t\t\t\t\t\t                        \t<input id=\"OLD_PRICE\" name=\"OLD_PRICE\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;text-align:right\" value=\"";
  private final static String _jspx_template165 = "\"  readonly=\"readonly\">원\r\n\t\t\t\t\t\t                        ";
  private final static String _jspx_template166 = "\r\n\t\t\t\t\t\t                        ";
  private final static String _jspx_template167 = "\r\n\t\t\t\t\t\t                        \t<input id=\"OLD_PRICE\" name=\"OLD_PRICE\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;text-align:right\" value=\"0\"  readonly=\"readonly\">원\r\n\t\t\t\t\t\t                        ";
  private final static String _jspx_template168 = "\r\n\t\t\t\t\t\t                    ";
  private final static String _jspx_template169 = "\r\n\t\t\t\t\t               \t\t</td>\r\n\t\t\t\t\t                </tr>\r\n\t\t\t\t\t                <tr>\r\n\t\t\t\t\t                    <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">전년 점용면적</td>\r\n\t\t\t\t\t                    <td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t                \t   <input id=\"OLD_AREA_SIZE\" name=\"OLD_AREA_SIZE\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;text-align:right\" value=\"";
  private final static String _jspx_template170 = "\"  readonly=\"readonly\">㎡\r\n\t\t\t\t\t               \t\t</td>\r\n\t\t\t\t\t                    \r\n\t\t\t\t\t               \t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">전년 요율(단가)</td>\r\n\t\t\t\t\t                    <td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t                \t   <input id=\"OLD_RATE\" name=\"OLD_RATE\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;text-align:right\" value=\"";
  private final static String _jspx_template171 = "\"  readonly=\"readonly\">\r\n\t\t\t\t\t               \t\t</td>\r\n\t\t\t\t\t                </tr>\r\n\t\t\t            \t\t\t";
  private final static String _jspx_template172 = "\r\n\t\t\t\t\t\t            <tr>\r\n\t\t\t\t\t\t                <td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">부과일자</td>\r\n\t\t\t\t\t\t                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\t\t\t\t\t\t                    <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t                        <tr>\r\n\t\t\t\t\t\t                            <td>\r\n\t\t\t\t\t\t                            \t<input id=\"TAX_DATE\" name=\"TAX_DATE\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template173 = "\"  onKeyDown=\"onlyNumberInput();\"   onKeyDown=\"onlyNumberInput();\" maxlength=10>\r\n\t\t\t\t\t\t\t\t\t                </td>\r\n\t\t\t\t\t\t\t\t\t                <td>\r\n\t\t\t\t\t\t\t\t\t                    <img src=\"/img/calendar_icon.gif\" onclick=\"popUpCalendar(this, document.getElementById('TAX_DATE'), 'yyyymmdd');\"  style=\"cursor:pointer\" >\r\n\t\t\t\t\t\t\t\t\t                </td>\r\n\t\t\t\t\t\t\t\t\t            </tr>\r\n\t\t\t\t\t\t\t\t\t        </table>\r\n\t\t\t\t\t\t    \t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t    <td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">납기내기한</td>\r\n\t\t\t\t\t\t\t\t\t    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\t\t\t\t\t\t\t\t\t        <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t            <tr>\r\n\t\t\t\t\t\t\t\t\t                <td>\r\n\t\t\t\t\t\t\t\t\t                \t<input id=\"INDATE\" name=\"INDATE\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template174 = "\"  onKeyDown=\"onlyNumberInput();\"   onKeyDown=\"onlyNumberInput();\" maxlength=10>\r\n\t\t\t\t\t\t\t\t\t\t\t\t    </td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t    <td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t        <img src=\"/img/calendar_icon.gif\" onclick=\"popUpCalendar(this, document.getElementById('INDATE'), 'yyyymmdd');\"  style=\"cursor:pointer\" >\r\n\t\t\t\t\t\t\t\t\t\t\t\t    </td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t    <td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">납기후일자</td>\r\n\t\t\t\t\t\t\t\t\t    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\t\t\t\t\t\t\t\t\t        <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t            <tr>\r\n\t\t\t\t\t\t\t\t\t                <td>\r\n\t\t\t\t\t\t\t\t\t                \t<input id=\"OVERDATE\" name=\"OVERDATE\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template175 = "\"  onKeyDown=\"onlyNumberInput();\"   onKeyDown=\"onlyNumberInput();\" maxlength=10>\r\n\t\t\t\t\t\t\t\t\t\t\t\t    </td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t    <td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t        <img src=\"/img/calendar_icon.gif\" onclick=\"popUpCalendar(this, document.getElementById('OVERDATE'), 'yyyymmdd');\"  style=\"cursor:pointer\" >\r\n\t\t\t\t\t\t\t\t\t\t\t\t    </td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">납기후금액</td>\r\n\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\t\t\t\t\t\t\t\t\t\t    <input id=\"OVERTAX\" name=\"OVERTAX\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;text-align:right\" value=\"";
  private final static String _jspx_template176 = "\"  onKeyDown=\"onlyNumberInput();\"   onKeyDown=\"onlyNumberInput();\" maxlength=10>원\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template177 = "\r\n\t\t\t\t\t\t\t\t    <tr>\r\n\t\t\t\t\t\t\t\t        <td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">과징율</td>\r\n\t\t\t\t\t\t\t\t        <td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t\t\t\t\t\t            <input id=\"SURCHARGE_RATE\" name=\"SURCHARGE_RATE\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled\" value=\"1.2\"  onKeyDown=\"onlyNumberInput();\"   onKeyDown=\"onlyNumberInput();\" maxlength=10>\r\n\t\t\t\t\t\t\t\t        </td>\r\n\t\t\t\t\t\t\t\t    </tr>\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template178 = "\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t    <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">기본 산출식</td>\r\n\t\t\t\t\t\t\t\t\t    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\t\t\t\t\t\t\t\t\t    \t<input ID=\"FORM\" name=\"FORM\"  type=\"text\" class=\"input_form1\" style=\"width:300px\" value=\"";
  private final static String _jspx_template179 = "\">\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">현년도 ";
  private final static String _jspx_template180 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\t\t\t\t\t\t\t\t\t\t    <input name=\"SUM_YEAR\" id=\"SUM_YEAR\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;text-align:right\" value=\"";
  private final static String _jspx_template181 = "\"   onKeyDown=\"onlyNumberInput();\" onkeyup=\"javascript:fn_addComma(this)\" >원\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t    <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조정 산출식</td>\r\n\t\t\t\t\t\t\t\t\t    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\t\t\t\t\t\t\t\t\t        <input id=\"FORM_ADJUST\" name=\"FORM_ADJUST\" type=\"text\" class=\"input_form1\" style=\"width:300px\" value=\"";
  private final static String _jspx_template182 = "\" >\r\n\t\t\t\t\t\t\t\t\t    </td>\r\n\t\t\t\t\t\t\t\t\t    <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조정 ";
  private final static String _jspx_template183 = "</td>\r\n\t\t\t\t\t\t\t\t\t    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\t\t\t\t\t\t\t\t\t        <input id=\"SUM_ADJUST\" name=\"SUM_ADJUST\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;text-align:right\" value=\"";
  private final static String _jspx_template184 = "\"  onKeyDown=\"onlyNumberInput();\" onkeyup=\"javascript:fn_addComma(this)\" >원\r\n\t\t\t\t\t\t\t\t\t    </td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t    <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">지분율 사유</td>\r\n\t\t\t\t\t\t\t\t\t    <td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t        <input id=\"PERCENT_REASON\" name=\"PERCENT_REASON\" type=\"text\" class=\"input_form1\" style=\"width:300px\" value=\"";
  private final static String _jspx_template185 = "\" readonly=\"readonly\" >\r\n\t\t\t\t\t\t\t\t\t    </td>\r\n\t\t\t\t\t\t\t\t\t    <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">지분율 (%)</td>\r\n\t\t\t\t\t\t\t\t\t    <td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t        <input id=\"PERCENT_RATE\" name=\"PERCENT_RATE\"  type=\"text\" class=\"input_form1\" style=\"width:80px;text-align:right\" value=\"";
  private final static String _jspx_template186 = "\" readonly=\"readonly\" >\r\n\t\t\t\t\t\t\t\t\t    </td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t    <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">감면율 사유</td>\r\n\t\t\t\t\t\t\t\t\t    <td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t        <input id=\"REDUCTION_REASON\" name=\"REDUCTION_REASON\" type=\"text\" class=\"input_form1\" style=\"width:300px\" value=\"";
  private final static String _jspx_template187 = "\" readonly=\"readonly\" >\r\n\t\t\t\t\t\t\t\t\t    </td>\r\n\t\t\t\t\t\t\t\t\t    <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">감면율 (%)</td>\r\n\t\t\t\t\t\t\t\t\t    <td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t        <input id=\"REDUCTION_RATE\" name=\"REDUCTION_RATE\"  type=\"text\" class=\"input_form1\" style=\"width:80px;text-align:right\" value=\"";
  private final static String _jspx_template188 = "\" readonly=\"readonly\" >\r\n\t\t\t\t\t\t\t\t\t    </td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t    <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">최종 산출식</td>\r\n\t\t\t\t\t\t\t\t\t    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\t\t\t\t\t\t\t\t\t        <input id=\"REDUCTION_FORM\" name=\"REDUCTION_FORM\" type=\"text\" class=\"input_form1\" style=\"width:300px\" value=\"";
  private final static String _jspx_template189 = "\">\r\n\t\t\t\t\t\t\t\t\t    </td>\r\n\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t    <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">최종 ";
  private final static String _jspx_template190 = "</td>\r\n\t\t\t\t\t\t\t\t\t    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\t\t\t\t\t\t\t\t\t        <input id=\"REDUCTION_SUM\" name=\"REDUCTION_SUM\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;text-align:right\" value=\"";
  private final static String _jspx_template191 = "\" onKeyDown=\"onlyNumberInput();\" onkeyup=\"javascript:fn_addComma(this)\">원\r\n\t\t\t\t\t\t\t\t\t    </td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t    <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\"></td>\r\n\t\t\t\t\t\t\t\t\t    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\t\t\t\t\t\t\t\t\t    </td>\r\n\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t    <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">부가가치세</td>\r\n\t\t\t\t\t\t\t\t\t    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\t\t\t\t\t\t\t\t\t        <input id=\"VAT\" name=\"VAT\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;text-align:right\" value=\"0\" readonly=\"readonly\">원\r\n\t\t\t\t\t\t\t\t\t    </td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t    <td height=\"40\" align=\"right\">\r\n\t\t\t\t\t\t       \t<img src=\"/img/accou_icon.gif\" alt=\"계산\" width=\"56\" height=\"18\" border=\"0\" onclick=\"javascript:Calculate();\" style=\"cursor:pointer\">\r\n\t\t\t\t\t\t        <img src=\"/img/save_icon2.gif\" alt=\"저장\" width=\"56\" height=\"18\" border=\"0\" onClick=\"javascript:submitClick();\" style=\"cursor:pointer\" >\r\n\t\t\t\t\t\t        <img src=\"/img/can_icon.gif\" alt=\"취소\" border=\"0\" style=\"cursor:pointer\" onclick=\"javascript:history.back();\">\r\n\t\t\t\t\t\t    </td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t</table>\r\n\t\t\t\t</div>\r\n\t\t\t</td>\r\n\t\t</tr>\r\n\t</table>\r\n</form>\r\n</body>\r\n</html>";
}
