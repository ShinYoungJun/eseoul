package jeus_jspwork._jsp._jumyong._jumyong;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_info_5fproduct_5fnoPermission_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(30,69);to=(30,71)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${no}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(33,34);to=(33,46)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(36,34);to=(36,50)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.CHECK_YN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(73,23);to=(73,45)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.SURCHARGE_RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(73,58);to=(73,80)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.SURCHARGE_RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(84,35);to=(84,47)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.FORM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(113,34);to=(113,50)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.CHECK_YN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(164,31);to=(164,43)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(167,65);to=(167,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${no}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(167,83);to=(167,94)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(167,111);to=(167,123)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${countPerPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(167,136);to=(167,152)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.CHECK_YN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(168,70);to=(168,77)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(173,31);to=(173,43)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // jsp code [from=(178,66);to=(178,68)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${no}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);
      // jsp code [from=(178,84);to=(178,95)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template26);
      // jsp code [from=(178,112);to=(178,124)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${countPerPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // jsp code [from=(178,137);to=(178,153)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.CHECK_YN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template28);
      // jsp code [from=(179,73);to=(179,80)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template29);
      // jsp code [from=(189,34);to=(189,50)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.CHECK_YN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template30);
      out.write(_jspx_template31);
      out.write(_jspx_template32);
      // jsp code [from=(452,38);to=(452,42)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${year}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template33);
      // jsp code [from=(548,82);to=(548,84)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${no}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template34);
      // jsp code [from=(548,93);to=(548,105)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template35);
      // jsp code [from=(548,121);to=(548,132)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template36);
      // jsp code [from=(548,149);to=(548,161)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${countPerPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template37);
      // jsp code [from=(548,182);to=(548,189)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template38);
      // jsp code [from=(548,197);to=(548,204)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${sum_seq}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template39);
      // jsp code [from=(548,217);to=(548,233)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.CHECK_YN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template40);
      // jsp code [from=(548,244);to=(548,258)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.TAX_YN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template41);
      // jsp code [from=(552,78);to=(552,80)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${no}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template42);
      // jsp code [from=(552,89);to=(552,101)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template43);
      // jsp code [from=(552,117);to=(552,128)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template44);
      // jsp code [from=(552,145);to=(552,157)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${countPerPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template45);
      // jsp code [from=(552,178);to=(552,185)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template46);
      // jsp code [from=(552,193);to=(552,200)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${sum_seq}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template47);
      // jsp code [from=(552,213);to=(552,229)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.CHECK_YN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template48);
      // jsp code [from=(552,240);to=(552,254)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.TAX_YN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template49);
      // jsp code [from=(585,59);to=(585,61)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${no}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template50);
      // jsp code [from=(586,47);to=(586,49)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${no}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template51);
      // jsp code [from=(587,53);to=(587,57)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mode}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template52);
      // jsp code [from=(588,52);to=(588,55)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${seq}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template53);
      // jsp code [from=(589,63);to=(589,72)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mudanForm}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template54);
      // jsp code [from=(590,65);to=(590,75)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mudanPrice}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template55);
      // jsp code [from=(591,71);to=(591,98)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(totalSum)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

      out.write(_jspx_template56);
      // jsp code [from=(592,61);to=(592,70)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${firstArea}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template57);
      // jsp code [from=(593,57);to=(593,64)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${message}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template58);
      // jsp code [from=(594,55);to=(594,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.TAX_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template59);
      // jsp code [from=(595,55);to=(595,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.TAX_YN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template60);
      // jsp code [from=(596,61);to=(596,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.FIRST_SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template61);
      // jsp code [from=(597,55);to=(597,61)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${CK_DEL}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template62);
      // jsp code [from=(598,57);to=(598,64)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template63);
      // jsp code [from=(599,51);to=(599,55)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${type}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template64);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template106);
      // jsp code [from=(650,98);to=(650,125)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(totalSum)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

      out.write(_jspx_template107);
      // jsp code [from=(660,59);to=(660,76)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${strPageDivideForm}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template108);
      // jsp code [from=(683,55);to=(683,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template109);
      // jsp code [from=(687,101);to=(687,133)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.PRICE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

      out.write(_jspx_template110);
      // jsp code [from=(693,55);to=(693,73)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.AREA_AFTER}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template111);
      // jsp code [from=(697,55);to=(697,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template112);
      // jsp code [from=(706,55);to=(706,71)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.FROMDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template113);
      // jsp code [from=(706,77);to=(706,91)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.TODATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template114);
      // jsp code [from=(709,95);to=(709,109)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.PERIOD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template115);
      // jsp code [from=(713,106);to=(713,128)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.SURCHARGE_RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template116);
      // jsp code [from=(721,55);to=(721,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.FORM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template117);
      // jsp code [from=(726,55);to=(726,90)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.SUM_YEAR)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

      out.write(_jspx_template118);
      // jsp code [from=(738,55);to=(738,77)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.PERCENT_REASON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template119);
      // jsp code [from=(743,55);to=(743,75)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.PERCENT_RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template120);
      // jsp code [from=(749,55);to=(749,79)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.REDUCTION_REASON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template121);
      // jsp code [from=(754,55);to=(754,77)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.REDUCTION_RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template122);
      // jsp code [from=(760,55);to=(760,77)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.REDUCTION_FORM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template123);
      // jsp code [from=(764,55);to=(764,95)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.REDUCTION_SUM)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

      out.write(_jspx_template124);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_0_fn(pageContext, null)) return;


      out.write(_jspx_template128);
      // ----  spring:bind ---- //
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_0 = new org.springframework.web.servlet.tags.BindTag();
      _jspx_th_spring_bind_0.setPageContext(pageContext);
      _jspx_th_spring_bind_0.setPath("product.YEAR");
      try {
        try {
          int _jspx_eval_spring_bind_0 = _jspx_th_spring_bind_0.doStartTag();
          if (_jspx_eval_spring_bind_0 != Tag.SKIP_BODY) {
            do {
              org.springframework.web.servlet.support.BindStatus status = null;
              status = (org.springframework.web.servlet.support.BindStatus) pageContext.findAttribute("status");
              out.write(_jspx_template129);

            } while (_jspx_th_spring_bind_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
          }
          if (_jspx_th_spring_bind_0.doEndTag() == Tag.SKIP_PAGE)
            return;
        } catch (Throwable t) {
          _jspx_th_spring_bind_0.doCatch(t);
        } finally {
          _jspx_th_spring_bind_0.doFinally();
        }
      } finally {
        _jspx_th_spring_bind_0.release();
      }

      out.write(_jspx_template130);
      // jsp code [from=(822,97);to=(822,110)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.PRICE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template131);
      // jsp code [from=(837,155);to=(837,173)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.AREA_AFTER}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template132);
      // jsp code [from=(841,145);to=(841,157)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template133);
      // jsp code [from=(849,157);to=(849,173)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.FROMDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template134);
      // jsp code [from=(852,148);to=(852,162)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.TODATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template135);
      // jsp code [from=(864,136);to=(864,150)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.PERIOD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template136);
      // jsp code [from=(874,149);to=(874,171)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.SURCHARGE_RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template137);
      // jsp code [from=(899,111);to=(899,123)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.FORM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template138);
      // jsp code [from=(903,129);to=(903,145)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.SUM_YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template139);
      // jsp code [from=(904,127);to=(904,151)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.REDUCTION_REASON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template140);
      // jsp code [from=(905,136);to=(905,158)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.REDUCTION_RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template141);
      // jsp code [from=(906,120);to=(906,142)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.PERCENT_REASON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template142);
      // jsp code [from=(907,132);to=(907,152)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.PERCENT_RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template143);
      // jsp code [from=(908,116);to=(908,135)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.FORM_ADJUST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template144);
      // jsp code [from=(909,132);to=(909,150)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.SUM_ADJUST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template145);
      // jsp code [from=(931,169);to=(931,171)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${no}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template146);
      // jsp code [from=(931,179);to=(931,183)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${seq }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template147);
      // jsp code [from=(931,195);to=(931,202)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template148);
      // jsp code [from=(940,166);to=(940,168)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${no}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template149);
      // jsp code [from=(940,176);to=(940,180)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${seq }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template150);
      // jsp code [from=(940,192);to=(940,199)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template151);

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
            out.write(_jspx_template65);
            // ----  c:choose ---- invoke //
            if (_jspx_th_c_choose_0_fn(pageContext, _jspx_th_c_forEach_0)) return true;


            out.write(_jspx_template91);
            // jsp code [from=(628,78);to=(628,87)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${idx.count}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template92);
            // jsp code [from=(629,66);to=(629,76)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template93);
            // ----  c:choose ---- invoke //
            if (_jspx_th_c_choose_1_fn(pageContext, _jspx_th_c_forEach_0)) return true;


            out.write(_jspx_template100);
            // jsp code [from=(640,66);to=(640,82)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.AREA_AFTER}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template101);
            // jsp code [from=(641,66);to=(641,76)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template102);
            // jsp code [from=(643,66);to=(643,94)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(board.FROMDATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_1));

            out.write(_jspx_template103);
            // jsp code [from=(643,98);to=(643,124)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(board.TODATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_1));

            out.write(_jspx_template104);
            // jsp code [from=(644,66);to=(644,102)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(board.SUM_ADJUST) }",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template105);

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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${listSize != '0' }", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template125);
          // ----  c:if ---- invoke //
          if (_jspx_th_c_if_1_fn(pageContext, _jspx_th_c_if_0)) return true;


          out.write(_jspx_template127);

        } while (_jspx_th_c_if_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_0.release();
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
          out.write(_jspx_template66);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template78);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template90);

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
          out.write(_jspx_template94);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_1_fn(pageContext, _jspx_th_c_choose_1)) return true;


          out.write(_jspx_template97);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_1_fn(pageContext, _jspx_th_c_choose_1)) return true;


          out.write(_jspx_template99);

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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${defineTax != 'true'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
      if (_jspx_eval_c_if_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template126);

        } while (_jspx_th_c_if_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_1.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_1.release();
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
          out.write(_jspx_template67);
          // jsp code [from=(622,188);to=(622,198)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template68);
          // jsp code [from=(622,213);to=(622,215)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${no}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template69);
          // jsp code [from=(622,221);to=(622,230)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template70);
          // jsp code [from=(622,280);to=(622,282)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${no}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template71);
          // jsp code [from=(622,291);to=(622,301)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template72);
          // jsp code [from=(622,317);to=(622,328)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template73);
          // jsp code [from=(622,345);to=(622,357)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${countPerPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template74);
          // jsp code [from=(622,366);to=(622,376)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template75);
          // jsp code [from=(622,384);to=(622,393)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template76);
          // jsp code [from=(622,405);to=(622,412)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${section}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template77);

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
          out.write(_jspx_template79);
          // jsp code [from=(625,94);to=(625,104)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template80);
          // jsp code [from=(625,119);to=(625,121)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${no}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template81);
          // jsp code [from=(625,127);to=(625,136)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template82);
          // jsp code [from=(625,186);to=(625,188)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${no}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template83);
          // jsp code [from=(625,197);to=(625,207)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template84);
          // jsp code [from=(625,223);to=(625,234)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template85);
          // jsp code [from=(625,251);to=(625,263)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${countPerPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template86);
          // jsp code [from=(625,272);to=(625,282)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template87);
          // jsp code [from=(625,290);to=(625,299)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template88);
          // jsp code [from=(625,311);to=(625,318)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${section}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template89);

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
    _jspx_th_c_when_1.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.CHECK_YN != '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
      if (_jspx_eval_c_when_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template95);
          // jsp code [from=(633,55);to=(633,85)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(board.PRICE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

          out.write(_jspx_template96);

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
          out.write(_jspx_template98);

        } while (_jspx_th_c_otherwise_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_otherwise_1.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_otherwise_1.release();
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
  private final static String _jspx_template7 = "    \r\n";
  private final static String _jspx_template8 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('사용자의 사용시간이 종료되었습니다. 다시 접속 해주시기 바랍니다.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template9 = "\r\n";
  private final static String _jspx_template10 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html>\r\n    <head>\r\n        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n        <title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n        <style type=\"text/css\">\r\n            <!--\r\n            body {\r\n                margin: 0px;\r\n                background-image: url(/img/left_back.gif);\r\n            }\r\n            -->\r\n        </style>\r\n        <link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n        <script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script> \r\n        <script language=\"javascript\" src=\"/js/calculation.js\"></script> \r\n        <script language=\"javascript\" src=\"/js/Check_inputbox.js\"></script> \r\n        <script language=\"javascript\">\r\n            var savable = 0;\r\n            var savable_v = 0;\r\n            function InitPage()\r\n            {\r\n            \tdocument.getElementById(\"TYPE\").value = parent.document.getElementById(\"TYPE\").value;\r\n\r\n                if(document.getElementById(\"CK_DEL\").value == 'true'){\r\n                    location.href = \"/jumyong/productInsert.do?no=";
  private final static String _jspx_template11 = "\";\r\n                }\r\n\t\t\r\n                setParentYear('";
  private final static String _jspx_template12 = "');\r\n                //YEAR 셀렉트 박스 만듬\r\n                makeYear(\"YEAR\");\r\n                var check_yn =\"";
  private final static String _jspx_template13 = "\";\r\n                parent.document.getElementById(\"SEQ\").value = document.getElementById(\"SEQ\").value;\r\n\t\t\r\n                if(document.getElementById(\"mode\").value == \"edit\" || document.getElementById(\"mode\").value == \"add\"  )\r\n                {\r\n                    document.getElementById(\"view\").style.display = \"none\";\r\n\t\t\t\t\t\t\r\n                    document.getElementById(\"edit_1\").style.display= \"block\";\r\n                    document.getElementById(\"edit_1\").style.pixelTop = 0;\r\n\r\n                    if(check_yn==\"1\"){\t\r\n                        document.getElementById(\"price_view4\").style.display=\"none\";\r\n                    }\r\n\t\t\t\r\n                    if(document.getElementById(\"mode\").value == \"add\")\r\n                    {\r\n                        var date = new Date();\r\n                        var year = date.getFullYear();\t\r\n                    }\r\n\t\t\t\r\n                }else\r\n                {\r\n\t\t\t\r\n                    document.getElementById(\"edit_1\").style.display = \"none\";\r\n                    document.getElementById(\"view\").style.display = \"block\";\r\n                    if(check_yn==\"1\"){\t\r\n                        document.getElementById(\"price_view4\").style.display=\"none\";\r\n                    }\r\n                }\r\n\r\n                if(check_yn==\"1\"){\t\r\n                    document.getElementById(\"price_img\").style.display=\"none\";\r\n                    document.getElementById(\"PRICE\").value=\"1\";\t\t//단가쪽에 공시지가가 표시되기 때문에 공시지가는 1로 표시\t\r\n                    //document.getElementById(\"price_view1\").style.display=\"none\";\r\n                    document.getElementById(\"price_view2\").style.display=\"none\";\r\n                }\r\n                //과징율이 없을때 정의\r\n                if('";
  private final static String _jspx_template14 = "'=='' || '";
  private final static String _jspx_template15 = "' == '0.0')\r\n                document.getElementById(\"SURCHARGE_RATE\").value = 1.2;\r\n\t\t\r\n                var first_area = parseFloat(document.getElementById(\"firstArea\").value);\r\n\t\t\r\n                //if(first_area>0)\r\n                //document.getElementById(\"AREA_AFTER\").value=first_area;\r\n                //if(first_area>0){\r\n                //document.getElementById(\"AREA_AFTER\").disabled=true;\r\n                //}\r\n\r\n                var cal_type = \"";
  private final static String _jspx_template16 = "\";\t\t//월단위 계산인지 일단위 계산인지 여부 알아내기\r\n                for(var i=1;i<cal_type.length;i++){\r\n                    if(cal_type.substring(i-1,i)==\"일\"){\r\n                        document.getElementById(\"date_type\").value=\"day\";\r\n                    }\r\n                }\r\n\r\n                var obj = document.productForm.message.value;\r\n\t\t\r\n                if(obj != \"\")\t\r\n                    alert(obj);\r\n                return;\r\n            }\r\n\r\n\r\n            function submitClick()\r\n            {\r\n                document.getElementById(\"AREA_AFTER\").disabled=false;\r\n\r\n                if(Number(document.getElementById(\"AREA_AFTER\").value)!=Number(document.getElementById(\"AREA_AFTER\").value)){\r\n                    alert(\"점용면적은 전년도랑 같이 입력 하셔야 합니다.\");\r\n                    return;\t\r\n                }\r\n\t\t\r\n                // 수정일때는 산출내역 계산여부 체크 안하도록..\r\n                if(document.getElementById(\"mode\").value == \"edit\"){\r\n                    savable_v = 4;\r\n                }\r\n\t\t\r\n                var check_yn =\"";
  private final static String _jspx_template17 = "\";\r\n                if(check_yn == \"1\"){\r\n                    if(savable_v == 3 || savable_v == 4){\r\n                        var productForm = document.productForm;\r\n\t\t\r\n                        //comma제거\r\n                        removeComma2(\"PRICE\");\r\n                        removeComma2(\"SUM_YEAR\");\r\n                        removeComma2(\"SUM_ADJUST\");\r\n                       // removeComma2(\"REDUCTION_SUM\");\r\n                    \t\r\n\r\n                        // 직접 일반점용료를 입력하는 경우때문에 넣어줌\r\n                        document.getElementById(\"SUM_ADJUST\").value = document.getElementById(\"SUM_YEAR\").value;\r\n                        document.getElementById(\"FORM_ADJUST\").value = document.getElementById(\"FORM\").value;\r\n\t\t\t\t\r\n                        productForm.submit();\r\n                    }else {\r\n                        alert(\"산출 내역을 먼저 계산해 주십시오.\");\r\n                        return;\r\n                    }\r\n                }else if(savable_v == 4)\r\n                {\r\n                    var productForm = document.productForm;\r\n\t\t\t\r\n                    //comma제거\r\n\t\r\n                    removeComma2(\"PRICE\");\r\n                    removeComma2(\"SUM_YEAR\");\r\n                    removeComma2(\"SUM_ADJUST\");\r\n                   // removeComma2(\"REDUCTION_SUM\");\r\n                \t\r\n\r\n                    // 직접 일반점용료를 입력하는 경우때문에 넣어줌\r\n                    document.getElementById(\"SUM_ADJUST\").value = document.getElementById(\"SUM_YEAR\").value;\r\n                    document.getElementById(\"FORM_ADJUST\").value = document.getElementById(\"FORM\").value;\r\n\t\t\t\r\n                    productForm.submit();\r\n                }else\r\n                    alert(\"산출 내역을 먼저 계산해 주십시오.\");\r\n            }\r\n\r\n\r\n            function subTabClick(hiddenSubTabName,visibleSubTabName)\r\n            {\t\r\n                document.getElementById(hiddenSubTabName).style.display = 'none';\t\r\n                document.getElementById(visibleSubTabName).style.display = 'block';\t\r\n            }\r\n\r\n            function goModify()\r\n            {\r\n                var year = '";
  private final static String _jspx_template18 = "';\r\n                var seq = document.getElementById(\"SEQ\").value;\r\n\t\t\r\n                location.href = \"/jumyong/productInsert.do?no=";
  private final static String _jspx_template19 = "&currentPage=";
  private final static String _jspx_template20 = "&countPerPage=";
  private final static String _jspx_template21 = "&check_yn=";
  private final static String _jspx_template22 = "\"\r\n                    +\"&mode=edit&year=\"+year+\"&seq=\"+seq+\"&section=";
  private final static String _jspx_template23 = "\";\r\n            }\r\n\r\n            function goDelete()\r\n            {\r\n                var year = '";
  private final static String _jspx_template24 = "';\r\n                var seq = document.getElementById(\"SEQ\").value;\r\n\t\t\r\n                var result = confirm(\"산출내역을 삭제하시겠습니까?\");\r\n                if(result){\r\n                \tlocation.href = \"/jumyong/productInsert.do?no=";
  private final static String _jspx_template25 = "&currentPage=";
  private final static String _jspx_template26 = "&countPerPage=";
  private final static String _jspx_template27 = "&check_yn=";
  private final static String _jspx_template28 = "\"\r\n                        +\"&mode=del&year=\"+year+\"&seq=\"+seq+\"&section=";
  private final static String _jspx_template29 = "\"+\"&TYPE=\"+parent.document.getElementById(\"TYPE\").value;\r\n\r\n                    }\r\n\r\n            }\r\n\t\r\n            function Calculate()\r\n            {\r\n                savable = 0;\r\n                \r\n                var check_yn =\"";
  private final static String _jspx_template30 = "\";\r\n                var area_after = document.getElementById(\"AREA_AFTER\").value;\r\n\t\t\r\n                var rate = document.getElementById(\"RATE\").value;\r\n                var price = removeComma(document.getElementById(\"PRICE\").value);\r\n                var surcharge_rate = document.getElementById(\"SURCHARGE_RATE\").value;\r\n                var strYear = document.getElementById(\"YEAR\").value;\r\n\t\r\n                if(check_yn!=\"1\"){\r\n                    if(document.getElementById(\"PRICE\").value==\"0\" || document.getElementById(\"PRICE\").value==\"\"){\r\n                        alert(\"공시지가를 넣으세요.\");\r\n                        document.getElementById(\"PRICE\").value=\"\";\r\n                        document.getElementById(\"PRICE\").focus();\r\n                        return;\r\n                    }\r\n                }\r\n                savable++;\r\n                if(Number(area_after)==0 || area_after==\"\"){\r\n                    alert(\"점용면적을 넣어주세요.\");\r\n                    document.getElementById(\"AREA_AFTER\").value = \"\";\r\n                    document.getElementById(\"AREA_AFTER\").focus();\r\n                    return;\r\n                } \r\n                savable++;\r\n                if(area_after.substring(area_after.indexOf(\".\")+1, area_after.indexOf(\".\")+5).length>3){\r\n                    alert(\"점용면적을 소수점 3자리까지 표기 해 주세요\");\r\n                    document.getElementById(\"AREA_AFTER\").value = \"\";\r\n                    document.getElementById(\"AREA_AFTER\").focus();\r\n                    return;\r\n                }\r\n                savable++;\r\n                if(document.getElementById(\"PERIOD\").value==\"0\" || document.getElementById(\"PERIOD\").value==\"\"){\r\n                    if(confirm(\"개월수를 넣지 않았습니다. 개월수를 자동 계산하시겠습니까?\")){\r\n                        calDate();\r\n                    }\r\n                }\r\n                savable++;\r\n                var period = document.getElementById(\"PERIOD\").value;\r\n\t    \r\n                //현년도 점용료 계산\r\n                if(document.getElementById(\"date_type\").value==\"month\"){\r\n                    var sum_year = parseFloat(area_after)*(parseFloat(period)/12)*parseFloat(rate)*parseFloat(price)*(surcharge_rate);\r\n\r\n\r\n                    //부동소수점 오류 수정\r\n                    sum_year = fixFloatCal(sum_year);\r\n\t\t   \r\n                    if(check_yn!=\"1\"){\r\n                        document.getElementById(\"FORM\").value = strYear+\"년 : \"+area_after+\"㎡ X \" + period + \"/12개월 X \" +rate +\" X \" +insertComma2(price)    +\" X \"+surcharge_rate*100+\"/100\" ;\r\n                    }else{\r\n                        document.getElementById(\"FORM\").value = strYear+\"년 : \"+area_after+\"㎡ X \" + period + \"/12개월 X \" +rate +\" X \" +surcharge_rate*100+\"/100\" ;\r\n                    }\r\n                    \r\n                }else if(document.getElementById(\"date_type\").value==\"day\"){\r\n\r\n                    var leafYear = f_leapyear(document.getElementById(\"YEAR\").value);\r\n\t\t\t\r\n                    var sum_year = parseFloat(area_after)*(parseFloat(period)/(365+leafYear))*parseFloat(rate)*parseFloat(price)*(surcharge_rate);\r\n\r\n                    //부동소수점 오류 수정\r\n                    sum_year = fixFloatCal(sum_year);\r\n\t\t\t   \r\n                    if(check_yn!=\"1\"){\r\n                        document.getElementById(\"FORM\").value = strYear+\"년 : \"+area_after+\"㎡ X \" + period + \"/\"+Number(365+leafYear)+\"일 X \" +rate +\" X \" +insertComma2(price)    +\" X \"+surcharge_rate*100+\"/100\" ;\r\n                    }else{\r\n                        document.getElementById(\"FORM\").value = strYear+\"년 : \"+area_after+\"㎡ X \" + period + \"/\"+Number(365+leafYear)+\"일 X \" +rate +\" X \" +surcharge_rate*100+\"/100\" ;\r\n                    }\r\n                }\r\n\t\t\r\n                var strSUM_ADJUST = String( Math.floor(sum_year)); // 소수점 제거        \r\n                sum_year = parseInt(strSUM_ADJUST);\r\n\r\n      /*  \t\tif(parent.document.getElementById(\"TYPE\").value != '1'){\r\n        \t\t\t sum_year = parseInt(sum_year/10)*10;\t\t//10원 절삭\r\n        \t\t}else{\r\n        \t\t\t sum_year = parseInt(sum_year/100)*100;\t\t//100원 절삭\r\n        \t\t}\r\n        */       \r\n                document.getElementById(\"SUM_YEAR\").value = sum_year;\r\n\t\t\r\n";
  private final static String _jspx_template31 = "\r\n                insertComma(\"SUM_YEAR\");\r\n\t\t\r\n                //현년도 점용료 계산 끝\r\n\t\t\r\n                //조정 계수 및 조정 점용료 계산\t\t\r\n\t\r\n                document.getElementById(\"FORM_ADJUST\").value = document.getElementById(\"FORM\").value;\r\n                document.getElementById(\"SUM_ADJUST\").value = sum_year;\t\t\r\n                insertComma(\"SUM_ADJUST\");\r\n\r\n                savable_v = savable;\r\n                savable = 0;\r\n\t\r\n            }\r\n\t\t\r\n            //[ , ] 삭제\r\n            function removeComma2(numValue)\r\n            {\t\r\n                num = document.getElementById(numValue).value;\t\t\r\n                document.getElementById(numValue).value = Number(num.split(',').join(\"\"));\r\n            }\r\n\t\r\n\t\r\n            function removeComma(numValue)\r\n            {\r\n                return Number(numValue.split(',').join(\"\"));\r\n            }\r\n\t\r\n\t\r\n            function fn_addComma(chknum){\r\n                num = chknum.value;\r\n                num = num.split(',').join('');\r\n                var arr = num.split('.');\r\n                var num = new Array();\r\n                for (i = 0; i <= arr[0].length-1; i++) {\r\n                    num[i] = arr[0].substr(arr[0].length-1-i,1);\r\n                    if(i%3 == 0 && i != 0) num[i] += ',';\r\n                }\r\n                num = num.reverse().join('');\r\n                if (!arr[1]) chknum.value = num; else chknum.value = num+'.'+arr[1];\r\n\r\n            } \r\n\t\r\n            function onlyNumberInput()\r\n            {\r\n\t\t\r\n\t\t\r\n                var code = window.event.keyCode;\r\n\t\r\n                if ((code > 34 && code < 41) || (code > 47 && code < 58) || (code > 95 && code < 106) || code == 8 || code == 9 || code == 13 || code == 46 || code == 190 || code == 110)\r\n                {\r\n                    window.event.returnValue = true;\r\n                    return;\r\n                }else \r\n                {\t \r\n                    window.event.returnValue = false;\r\n                    return;\r\n                }\r\n            }\r\n\t\r\n            // 콤마 삽입\r\n            function insertComma(val1)\r\n            {\r\n\t\r\n                value1 = document.getElementById(val1).value;\r\n\t\t\r\n                var length1 = value1.length;\t\t\r\n                var divideNum = length1%3;\r\n                var returnValue2 =\"\";\r\n\t\t\r\n                if(divideNum != 0)\r\n                {\r\n                    returnValue2 = value1.substr(0,divideNum)+\",\";\r\n                }\r\n\t\t\r\n                if(length1 >3)\r\n                {\r\n                    while(true)\r\n                    {\r\n                        returnValue2 = returnValue2 + value1.substr(divideNum,3)+\",\";\r\n\t\t\t\t\r\n                        divideNum = divideNum+3;\r\n                        if(length1 <= divideNum)\r\n                            break;\r\n                    }\r\n                }\r\n\t\t\r\n                if(returnValue2 == \"\")\r\n                    returnValue2 = value1;\r\n                else\r\n                    returnValue2 = returnValue2.substr(0,returnValue2.length - 1);\r\n\r\n                document.getElementById(val1).value = returnValue2;\r\n            }\r\n\t\r\n\t\r\n\t\r\n            // 콤마 삽입 - 반환\r\n            function insertComma2(value1)\r\n            {\t\r\n                value1 = value1+\"\";\r\n\t\t\r\n                var length1 = value1.length;\t\t\r\n                var divideNum = length1%3;\r\n                var returnValue2 =\"\";\r\n\t\t\r\n                if(divideNum != 0)\r\n                {\r\n                    returnValue2 = value1.substr(0,divideNum)+\",\";\r\n                }\r\n\t\t\r\n                if(length1 >3)\r\n                {\r\n                    while(true)\r\n                    {\r\n                        returnValue2 = returnValue2 + value1.substr(divideNum,3)+\",\";\r\n\t\t\t\t\r\n                        divideNum = divideNum+3;\r\n                        if(length1 <= divideNum)\r\n                            break;\r\n                    }\r\n                }\r\n\t\t\r\n                if(returnValue2 == \"\")\r\n                    returnValue2 = value1;\r\n                else\r\n                    returnValue2 = returnValue2.substr(0,returnValue2.length - 1);\r\n\r\n                return returnValue2";
  private final static String _jspx_template32 = ";\r\n            }\r\n\t\r\n\t\r\n\t\r\n            //달 차이 계산\r\n            function getDiffMon(val1,val2)\r\n            {\r\n\t\r\n                var sdate = new Date(Number(val1.substr(0,4)),Number(val1.substr(4,2))-1,Number(val1.substr(6,2)));\r\n                var edate = new Date(Number(val2.substr(0,4)),Number(val2.substr(4,2))-1,Number(val2.substr(6,2)));\r\n\t    \r\n\t   \r\n\t\r\n                var sDate  = sdate.getDate();     \t\r\n                var count=0;\r\n\t    \r\n                edate.setDate(edate.getDate()+1);\r\n\t    \r\n                //\t     alert(sdate+\"   \"+edate);\r\n\t    \r\n                while (Date.parse(edate)>=Date.parse(sdate)) {\r\n                    if(sdate.getDate() == sDate){ //해당 요일과 같다면...\r\n                        count++;\r\n                    }\r\n                    sdate.setDate(sdate.getDate()+1); //요일을 계속 증가\r\n                }\r\n                return count-1;\r\n            }\r\n\t\r\n\t\r\n\t\r\n            // 대쉬 삭제\r\n            function removeDash(numValue)\r\n            {\r\n                return numValue.split('-').join(\"\");\r\n            }\r\n\t\r\n\t\r\n            //날짜에 dash(-) 삽입\r\n            function addDash2(num1)\r\n            {\r\n                num = document.getElementById(num1).value;\r\n                document.getElementById(num1).value =  (num.substr(0,4)+\"-\"+num.substr(4,2)+\"-\"+num.substr(6,2));\r\n            }\r\n\t\r\n            function setParentYear(yearVal)\r\n            {\r\n                parent.document.getElementById(\"year\").value = yearVal;\r\n            }\r\n\t\r\n\t\r\n            function makeYear(selectId){\r\n                var date = new Date();\r\n                var year = date.getFullYear();\r\n                var productYear = '";
  private final static String _jspx_template33 = "';\r\n\t\t\r\n                var highYear = 5;\r\n                var lowYear = 10;\r\n\t\t\r\n                for(var i=0;i<highYear;i++)\r\n                {\r\n                    document.getElementById(selectId).options[i]= new Option(year+highYear-i);\r\n                    document.getElementById(selectId).options[i].value = year+highYear-i;\r\n\t\t\t\r\n                    if(productYear != null && productYear == year+highYear-i)\r\n                    {\r\n                        document.getElementById(selectId).options[i].selected = true;\r\n                    }\r\n                }\r\n\t\t\r\n\t\t\r\n                for(var i=0;i<lowYear;i++)\r\n                {\r\n                    document.getElementById(selectId).options[highYear+i]= new Option(year-i);\r\n                    document.getElementById(selectId).options[highYear+i].value = year-i;\r\n\t\t\t\r\n                    if(productYear != null && productYear == year-i)\r\n                    {\r\n                        document.getElementById(selectId).options[highYear+i].selected = true;\r\n                    }\r\n                }\r\n\t\t\r\n                if(productYear==\"\")\r\n                    document.getElementById(selectId).value = year;\r\n\t\t\r\n\t\t\r\n                //FROMDATE, TODATE 값이 없을때 값 입력\t\t\r\n                if(document.getElementById(\"FROMDATE\").value == \"\" || document.getElementById(\"TODATE\").value == \"\"  )\r\n                    setDate(document.getElementById(selectId).value);\r\n\t\t\r\n\t\t\r\n            }\r\n\t\r\n\t\r\n            function setDate(yearVal)\r\n            {\r\n\t\t\r\n                document.getElementById(\"FROMDATE\").value = yearVal+\"0101\";\r\n                document.getElementById(\"TODATE\").value = yearVal+\"1231\";\r\n                addDash2(\"TODATE\");\r\n                addDash2(\"FROMDATE\");\r\n            }\r\n\r\n\t\r\n            //공시지가 팝업\r\n            /*\r\n                function openLandPricePopUp()\r\n                {\r\n                        var winW = 320;\r\n                        var winH = 133;\r\n                        var status =\"toolbar=no, location=no, directories=no, status=no, menubar=no, resizable=no, scrollbars=no, width=\"+winW+\", height=\"+winH+\", left=0, top=0\"\r\n                        window.open('/jsp/jumyong/jumyong/officialLandPrice.html', 'win', status);\t\r\n                }\r\n             */\r\n\t\r\n\t    \r\n            //공시지가 팝업\r\n            function openLandPricePopUp()\r\n            {\r\n                 var winW = 320;\r\n                 var winH = 240;\r\n                 var status =\"toolbar=no, location=no, directories=no, status=no, menubar=no, resizable=no, scrollbars=no, width=\"+winW+\", height=\"+winH+\", left=0, top=0\";\r\n\r\n                 var admin_no = document.getElementById(\"no\").value;\r\n                 var year = document.getElementById(\"YEAR\").value;\r\n                 window.open('/land_price.do?ADMIN_NO='+admin_no+'&year='+year, 'win', status);\r\n            }\r\n\t\r\n            function iFrameResize(obj)\r\n            {\r\n                var iFrm = obj;\r\n                var the_height = iFrm.contentWindow.document.body.scrollHeight;\r\n                iFrm.style.height = the_height + \"px\";\r\n            }\r\n\t\r\n            function Tab_Src(adminno, seq)\r\n            {\t\t\r\n                var tab1\t= document.getElementById(\"tabUpSub1\");\r\n                var tab2\t= document.getElementById(\"tabUpSub2\");\r\n\t\t\r\n                //var tabs\t= document.getElementById(\"tabDown\");\r\n\t\t\r\n                tab1.src\t= \"/jumyong/inspectEdit.do?no=\" + adminno;\r\n                tab2.src\t= \"/jumyong/confEdit.do?no=\" + adminno;\r\n                //alert(\"무단\"+tab1.src);\r\n            }\r\n            function add_product(){\r\n\r\n                if( document.getElementById(\"TAX_YN\").value == '1' ){\r\n                    if( confirm(\"이미 부과된 내역이므로 새로 산출됩니다. 산출 하시겠습니까? \") ){\r\n                        javascript:location.href='/jumyong/productInsert.do?no=";
  private final static String _jspx_template34 = "&year=";
  private final static String _jspx_template35 = "&currentPage=";
  private final static String _jspx_template36 = "&countPerPage=";
  private final static String _jspx_template37 = "&mode=add&section=";
  private final static String _jspx_template38 = "&seq=";
  private final static String _jspx_template39 = "&check_yn=";
  private final static String _jspx_template40 = "&TAX_YN=";
  private final static String _jspx_template41 = "';\r\n                    }\r\n                }\r\n                else{\r\n                    javascript:location.href='/jumyong/productInsert.do?no=";
  private final static String _jspx_template42 = "&year=";
  private final static String _jspx_template43 = "&currentPage=";
  private final static String _jspx_template44 = "&countPerPage=";
  private final static String _jspx_template45 = "&mode=add&section=";
  private final static String _jspx_template46 = "&seq=";
  private final static String _jspx_template47 = "&check_yn=";
  private final static String _jspx_template48 = "&TAX_YN=";
  private final static String _jspx_template49 = "';\r\n                }\r\n\t\t\r\n            }\r\n\r\n            function ShowMsgJumjiInsert(obj){\r\n\r\n                var target = obj;\r\n                if(target.name == 'AREA_AFTER'){\r\n                    alert(\"점용면적은 점용지 정보에서 수정하세요.\");\r\n                }else if(target.name == 'REDUCTION_RATE'){\r\n                    alert(\"지분율은 점용지 정보에서 수정하세요.\");\r\n                }else if(target.name == 'REDUCTION_REASON'){\r\n                    alert(\"지분율 사유는 점용지 정보에서 수정하세요.\");\r\n                }else if(target.name == 'PERCENT_RATE'){\r\n                    alert(\"지분율은 점용지 정보에서 수정하세요.\");\r\n                }else if(target.name == 'PERCENT_REASON'){\r\n                    alert(\"지분율 사유는 점용지 정보에서 수정하세요.\");\r\n                }\r\n            }\r\n\r\n          function goLanprice(){\r\n        \t\tvar url = \"http://kras.seoul.go.kr/land_info/info/landprice/landprice.do\";\r\n        \t\tvar name = \"공시지가열람\";\r\n        \t\tvar size = \"width=800, height=900, scrollbars=yes, resizable=yes\";\r\n        \t\twindow.open(url, name, size);\r\n        \t}\r\n        </script>\r\n\r\n    </head>\r\n\r\n    <body onload=\"javascript:InitPage();\"  border=\"0\">\r\n        <form id=\"productForm\" name=\"productForm\" method=\"post\" action = \"/jumyong/productInsert.do\" >\r\n            <input id=\"ADMIN_NO\" name=\"ADMIN_NO\" value=\"";
  private final static String _jspx_template50 = "\" type=\"hidden\" >\r\n            <input id=\"no\" name=\"no\" value=\"";
  private final static String _jspx_template51 = "\" type=\"hidden\" >\r\n            <input id = \"mode\" name=\"mode\" value=\"";
  private final static String _jspx_template52 = "\" type=\"hidden\" >\r\n            <input id = \"SEQ\" name=\"SEQ\"  value=\"";
  private final static String _jspx_template53 = "\" type=\"hidden\" >\r\n            <input id = \"mudanForm\" name=\"mudanForm\" value=\"";
  private final static String _jspx_template54 = "\" type=\"hidden\" >\r\n            <input id = \"mudanPrice\" name=\"mudanPrice\" value=\"";
  private final static String _jspx_template55 = "\" type=\"hidden\" >\r\n            <input id = \"mudanTotalSum\" name=\"mudanTotalSum\" value=\"";
  private final static String _jspx_template56 = "원\" type=\"hidden\" >\t\r\n            <input id=\"firstArea\" name=\"firstArea\" value=\"";
  private final static String _jspx_template57 = "\" type=\"hidden\">\r\n            <input id=\"message\" name=\"message\" value=\"";
  private final static String _jspx_template58 = "\" type=\"hidden\">\r\n            <input id=\"TAX_NO\" name=\"TAX_NO\" value=\"";
  private final static String _jspx_template59 = "\" type=\"hidden\">\r\n            <input id=\"TAX_YN\" name=\"TAX_YN\" value=\"";
  private final static String _jspx_template60 = "\" type=\"hidden\">\r\n            <input id=\"FIRST_SEQ\" name=\"FIRST_SEQ\" value=\"";
  private final static String _jspx_template61 = "\" type=\"hidden\">\r\n            <input id=\"CK_DEL\" name=\"CK_DEL\" value=\"";
  private final static String _jspx_template62 = "\" type=\"hidden\">\r\n            <input id=\"SECTION\" name=\"SECTION\" value=\"";
  private final static String _jspx_template63 = "\" type=\"hidden\">\r\n            <input id=\"TYPE\" name=\"TYPE\" value=\"";
  private final static String _jspx_template64 = "\" type=\"hidden\">\r\n\r\n            <table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                <tr>\r\n                    <td class=\"contborder_purple\">\t\t\t\t\t\t\t            \r\n                        <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                            <tr>\r\n                                <td>\r\n                                    <table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n                                        <tr>\r\n                                            <td height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">번호</td>\r\n                                            <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">산출년도</td>\r\n                                            <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">공시지가</td>\r\n                                            <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">면적</td>\r\n                                            <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">요율/단가</td>\r\n                                            <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">산출기간</td>\r\n\r\n\r\n                                            <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">변상금 </td>\r\n                                        </tr>\r\n                                        ";
  private final static String _jspx_template65 = "\r\n                                            ";
  private final static String _jspx_template66 = "\r\n                                                ";
  private final static String _jspx_template67 = "\r\n                                                    <tr onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\" onclick=\"javascript:setParentYear('";
  private final static String _jspx_template68 = "');Tab_Src('";
  private final static String _jspx_template69 = "','";
  private final static String _jspx_template70 = "');location.href('/jumyong/productInsert.do?no=";
  private final static String _jspx_template71 = "&year=";
  private final static String _jspx_template72 = "&currentPage=";
  private final static String _jspx_template73 = "&countPerPage=";
  private final static String _jspx_template74 = "&year=";
  private final static String _jspx_template75 = "&seq=";
  private final static String _jspx_template76 = "&section=";
  private final static String _jspx_template77 = "');\" style=\"cursor:pointer\" >\r\n                                                ";
  private final static String _jspx_template78 = "\r\n                                                ";
  private final static String _jspx_template79 = "\r\n                                                    <tr onclick=\"javascript:setParentYear('";
  private final static String _jspx_template80 = "');Tab_Src('";
  private final static String _jspx_template81 = "','";
  private final static String _jspx_template82 = "');location.href('/jumyong/productInsert.do?no=";
  private final static String _jspx_template83 = "&year=";
  private final static String _jspx_template84 = "&currentPage=";
  private final static String _jspx_template85 = "&countPerPage=";
  private final static String _jspx_template86 = "&year=";
  private final static String _jspx_template87 = "&seq=";
  private final static String _jspx_template88 = "&section=";
  private final static String _jspx_template89 = "');\" bgcolor=\"#f6f7f8\">\r\n                                                ";
  private final static String _jspx_template90 = "\r\n                                            ";
  private final static String _jspx_template91 = "\t\t\t\t\t\t\t                      \r\n                                            <td height=\"26\" align=\"center\">";
  private final static String _jspx_template92 = "</td>\r\n                                            <td align=\"center\">";
  private final static String _jspx_template93 = "</td>\r\n                                            <td align=\"center\"><!-- span id=\"price_view1\" style=\"display:block;\"></span-->\r\n                                            ";
  private final static String _jspx_template94 = "\r\n                                                ";
  private final static String _jspx_template95 = "\r\n                                                    ";
  private final static String _jspx_template96 = "\r\n                                                ";
  private final static String _jspx_template97 = "\r\n                                                ";
  private final static String _jspx_template98 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t-\r\n                                                ";
  private final static String _jspx_template99 = "\r\n                                            ";
  private final static String _jspx_template100 = "\t\r\n                                            </td>\r\n                                            <td align=\"center\">";
  private final static String _jspx_template101 = "</td>\r\n                                            <td align=\"center\">";
  private final static String _jspx_template102 = "</td>\r\n\r\n                                            <td align=\"center\">";
  private final static String _jspx_template103 = "~";
  private final static String _jspx_template104 = "</td>\r\n                                            <td align=\"center\">";
  private final static String _jspx_template105 = "</td>\r\n\r\n                                            </tr> \r\n                                        ";
  private final static String _jspx_template106 = "\r\n\r\n                                        <tr onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\"  >\r\n                                            <td height=\"26\" align=\"right\" colspan=\"7\">변상금 합계 = ";
  private final static String _jspx_template107 = "원&nbsp&nbsp</td>\t\t\t\t\t\t\t                        \r\n\r\n                                        </tr> \r\n                                    </table></td>\r\n                            </tr>\r\n                            <tr>\r\n                                <td height=\"40\" align=\"center\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                                        <tr>\r\n                                            <td align=\"center\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n                                                    <tr>\r\n                                                        ";
  private final static String _jspx_template108 = "\r\n                                                    </tr>\r\n\r\n                                                </table></td>\r\n\r\n                                        </tr>\r\n                                        <tr>\r\n\r\n\r\n                                        </tr>\r\n                                    </table></td>\r\n                            </tr>\r\n\r\n                        </table>\r\n\r\n                        <div id=\"view\" style=\"width:100%;\">\r\n                            <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\r\n                                <tr>\r\n                                    <td><table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n                                            <tr>\r\n                                                <td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" >산출년도</td>\r\n                                                <td width=\"42%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    ";
  private final static String _jspx_template109 = "년\r\n                                                </td>                     \r\n                                                <td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">공시지가</td>\r\n                                                <td width=\"32%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    <span id=\"price_view2\" style=\"display:block;\">";
  private final static String _jspx_template110 = "원</span>\r\n                                                </td> \r\n                                            </tr>\r\n                                            <tr>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용면적/개</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    ";
  private final static String _jspx_template111 = "㎡\r\n                                                </td>                     \r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">요율/단가</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    ";
  private final static String _jspx_template112 = "\r\n                                                </td> \r\n                                            </tr>                   \r\n\r\n\r\n                                            <tr>\r\n                                                <td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">산출기간</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\r\n                                                    ";
  private final static String _jspx_template113 = " ~ ";
  private final static String _jspx_template114 = "\r\n                                                </td>  \r\n                                                <td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">개월(일)수</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >";
  private final static String _jspx_template115 = "개월(일)</td>\r\n                                            </tr>\r\n                                            <tr>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">과징율</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\">";
  private final static String _jspx_template116 = "</td>                     \r\n                                            </tr>       \r\n\r\n\r\n\r\n                                            <tr>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">기본 산출식</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    ";
  private final static String _jspx_template117 = "\r\n                                                </td>\r\n\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">일반 변상금</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    ";
  private final static String _jspx_template118 = " 원\r\n                                                </td>    \r\n\r\n                                            </tr>\r\n                                            <tr>\r\n                                            <td height=\"26\" align=\"left\" bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"4\">\r\n                                           \t\t◎ 개별 변상금 총합\r\n                                            </td>\r\n                                            </tr>\r\n                                            <tr>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">지분율 사유</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    ";
  private final static String _jspx_template119 = "\r\n                                                </td> \r\n                                                \r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">지분율</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    ";
  private final static String _jspx_template120 = " %\r\n                                                </td> \r\n                                            </tr>\r\n                                            <tr>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">감면율 사유</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    ";
  private final static String _jspx_template121 = "\r\n                                                </td> \r\n                                                \r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">감면율</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    ";
  private final static String _jspx_template122 = " %\r\n                                                </td> \r\n                                            </tr>\r\n                                            <tr>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">최종 산출식</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    ";
  private final static String _jspx_template123 = "\r\n                                                </td>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">변상금 합계</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    ";
  private final static String _jspx_template124 = " 원\t\t\t\t\r\n                                                </td> \r\n\r\n                                            </tr> \r\n\r\n\r\n                                        </table></td>\r\n                                </tr>\r\n\r\n                                <tr >              \r\n                                    <td height=\"40\" align=\"right\" >\r\n                                        <table border=\"0\" width=\"100%\" >\r\n                                            <tr>\r\n                                                <td>\r\n\r\n                                            ";
  private final static String _jspx_template125 = "\r\n                                                ";
  private final static String _jspx_template126 = "\r\n                                                    <img src=\"/img/mod_icon.gif\" alt=\"수정\" border=\"0\" onclick=\"javascript:goModify()\" style=\"cursor:pointer\" >\r\n                                                    <img src=\"/img/del_icon3.gif\" alt=\"삭제\" border=\"0\" onclick=\"javascript:goDelete()\" style=\"cursor:pointer\" >\r\n\r\n                                                ";
  private final static String _jspx_template127 = "\r\n                                            ";
  private final static String _jspx_template128 = "\r\n                                            <img src=\"/img/add_icon.gif\" alt=\"추가\" border=\"0\" onclick=\"javascript:add_product();\"  style=\"cursor:pointer\" >\r\n\r\n                                            </td>\r\n\r\n                                            </tr>\r\n\r\n\r\n\r\n                                        </table>\r\n                                    </td>\r\n                                </tr>\r\n                            </table>\r\n                        </div>\r\n\r\n\r\n                        <div id=\"edit_1\" style=\"width:100%;display:none;\">\r\n                            <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                                <tr>\r\n                                    <td><input style=\"float:right; font-size: 10.5px;\" class=\"sub_table_b\" type=\"button\" onclick=\"goLanprice()\" value=\"공시지가조회(서울 부동산정보조회 시스템)\">\r\n                                    \t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n                                            <tr>\r\n                                                <td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\"  style=\"direction:rtl\" >산출년도</td>\r\n                                                <td width=\"42%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                            ";
  private final static String _jspx_template129 = "                    \r\n                                                <select id=\"YEAR\" name=\"YEAR\" class=\"input_form1\" onChange=\"javascript:setDate(this.value)\">\r\n                                                </select>년\r\n                                            ";
  private final static String _jspx_template130 = "\r\n\r\n\r\n                                    </td>                     \r\n                                    <td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\"><span id=\"price_view4\" style=\"display:block;\">공시지가</span></td>\r\n                                    <td width=\"32%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                        <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"table_bl_left\">\r\n                                            <tr>\r\n                                                <td>\r\n                                                    <span id=\"price_img\" style=\"display:block;\">\r\n                                                        <input id=\"PRICE\" name=\"PRICE\" value=\"";
  private final static String _jspx_template131 = "\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" onkeyup=\"javascript:fn_addComma(this)\"  onKeyDown=\"onlyNumberInput();\" style=\"text-align:right\">원\t \r\n                                                        <img src=\"/img/landPrice.gif\" alt=\"공시지가조회\" height=\"18\" border=\"0\" style=\"cursor:pointer\" onclick=\"javascript:openLandPricePopUp()\"; align=\"absmiddle\">\t\r\n                                                    </span>\r\n                                                </td>\r\n                                            </tr>\r\n                                        </table>\r\n\r\n                                    </td> \r\n                                </tr> \r\n\r\n\r\n\r\n                                <tr>\r\n                                    <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용면적/개</td>\r\n                                    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                    <input id=\"AREA_AFTER\" name=\"AREA_AFTER\" type=\"text\" class=\"essential\" style=\"width:50px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template132 = "\"  onfocus=\"javascript:ShowMsgJumjiInsert(this)\" onKeyDown=\"nr_num_float(this);\" style=\"direction: rtl\" readonly=\"readonly\" >㎡\r\n                                \t</td>                     \r\n\t                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">요율/단가</td>\r\n\t                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                    <input id=\"RATE\" name=\"RATE\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template133 = "\"  onKeyDown=\"onlyNumberInput();\" style=\"direction: rtl\">\r\n                                </td> \r\n                                </tr>                   \r\n\r\n\r\n                                <tr>\r\n                                    <td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">산출기간</td>\r\n                                    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                        <input id=\"FROMDATE\" name=\"FROMDATE\" type=\"text\" class=\"input_form1\" style=\"width:70px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template134 = "\"  maxlength=\"8\" readonly>\r\n                                        <img src=\"/img/calendar_icon.gif\" onclick=\"popUpCalendar(this, document.getElementById('FROMDATE'), 'yyyymmdd');\" style=\"vertical-align: middle;cursor:pointer;\">\r\n                                        &nbsp;~&nbsp;\r\n                                 \t\t<input id=\"TODATE\" name=\"TODATE\" type=\"text\" class=\"input_form1\" style=\"width:70px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template135 = "\"  maxlength=\"8\" readonly>\r\n\t                                    <img src=\"/img/calendar_icon.gif\" onclick=\"popUpCalendar(this, document.getElementById('TODATE'), 'yyyymmdd');\" style=\"vertical-align: middle;cursor:pointer;\">\r\n\t                                    <img src=\"/img/cal_month.gif\" alt=\"달수계산\" height=\"18\" border=\"0\" style=\"vertical-align: middle;cursor:pointer;\" onClick=\"javascript:calDate();\">\r\n                            \t\t</td>\r\n\r\n                    <td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">\r\n                        <select id=\"date_type\" class=\"input_form1\" onchange=\"javascript:calDate();\">\r\n                            <option value=\"month\">개월</option>\r\n                            <option value=\"day\">일</option>\r\n                        </select>수\r\n                    </td>\r\n                    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                    <input name=\"PERIOD\" id =\"PERIOD\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value = \"";
  private final static String _jspx_template136 = "\"   onKeyDown=\"onlyNumberInput();\" style=\"direction: rtl\">개월(일)\r\n               \t\t&nbsp;&nbsp;&nbsp;&nbsp;\r\n                </td>\r\n\r\n                </tr>\r\n\r\n\r\n                <tr>\r\n                    <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">과징율</td>\r\n                    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\">\r\n                    <input name=\"SURCHARGE_RATE\" id=\"SURCHARGE_RATE\" type=\"text\" class=\"input_form1\" style=\"width:50px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template137 = "\"   onKeyDown=\"onlyNumberInput();\" style=\"direction: rtl\">\r\n                </td>                     \r\n                </tr>       \r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n            </table>\r\n        </td></tr>\r\n\r\n    <tr>              \r\n        <td height=\"40\" align=\"right\">\r\n\r\n            <img src=\"/img/accou_icon.gif\" alt=\"계산\" width=\"56\" height=\"18\" border=\"0\" onclick=\"javascript:Calculate();\" style=\"cursor:pointer\">\r\n        </td>\r\n    </tr>\r\n\r\n    <tr><td>\r\n            <table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n            \t<tr>\r\n                    <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">기본 산출식</td>\r\n                    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                    <input name=\"FORM\" ID=\"FORM\" type=\"text\" class=\"input_form1\" style=\"width:350px\" value=\"";
  private final static String _jspx_template138 = "\">\r\n        \t\t\t</td>\r\n        \t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">일반 변상금</td>\r\n        \t\t\t<td width=\"20%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\t\t\t\t        <input name=\"SUM_YEAR\" id=\"SUM_YEAR\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template139 = "\"   onKeyDown=\"onlyNumberInput();\" onkeyup=\"javascript:fn_addComma(this)\" style=\"direction: rtl\">원\r\n\t\t\t\t        <input name=\"REDUCTION_REASON\" id=\"REDUCTION_REASON\" type=\"hidden\" class=\"essential\" style=\"width:350px\" value=\"";
  private final static String _jspx_template140 = "\" onfocus=\"javascript:ShowMsgJumjiInsert(this)\" readonly=\"readonly\">\r\n\t\t\t\t   \t\t<input name=\"REDUCTION_RATE\" id=\"REDUCTION_RATE\" type=\"hidden\" class=\"essential\" style=\"width:50px;text-align:right\" value=\"";
  private final static String _jspx_template141 = "\" onfocus=\"javascript:ShowMsgJumjiInsert(this)\" readonly=\"readonly\">\r\n\t\t\t\t   \t\t<input name=\"PERCENT_REASON\" id=\"PERCENT_REASON\" type=\"hidden\" class=\"essential\" style=\"width:350px\" value=\"";
  private final static String _jspx_template142 = "\" onfocus=\"javascript:ShowMsgJumjiInsert(this)\" readonly=\"readonly\">\r\n\t\t\t\t   \t\t<input name=\"PERCENT_RATE\" id=\"PERCENT_RATE\" type=\"hidden\" class=\"essential\" style=\"width:50px;text-align:right\" value=\"";
  private final static String _jspx_template143 = "\" onfocus=\"javascript:ShowMsgJumjiInsert(this)\" readonly=\"readonly\">\r\n\t\t\t\t    \t<input name=\"FORM_ADJUST\" id=\"FORM_ADJUST\" type=\"hidden\" class=\"input_form1\" style=\"width:300px\" value=\"";
  private final static String _jspx_template144 = "\">\r\n\t\t\t\t    \t<input name=\"SUM_ADJUST\" id=\"SUM_ADJUST\" type=\"hidden\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template145 = "\"  onKeyDown=\"onlyNumberInput();\" onkeyup=\"javascript:fn_addComma(this)\" style=\"direction: rtl\">\r\n\t\t\t\t\t\t<input name=\"RATE1\" id = \"RATE1\" type=\"hidden\" class=\"input_form1\" style=\"width:120px;ime-mode:disabled;\" value=\"\"   onKeyDown=\"onlyNumberInput();\" >\r\n\t\t\t\t\t</td>                   \r\n\t\t\t\t</tr>\r\n\t\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n\t<tr>              \r\n\t    <td height=\"40\" align=\"right\" colspan=\"4\">\r\n\t        <img src=\"/img/can_icon.gif\" alt=\"취소\" border=\"0\" onclick=\"javascript:history.back();\" style=\"cursor:pointer\" >\t\t\t\t\t                \r\n\t        <img src=\"/img/save_icon2.gif\" alt=\"저장\" width=\"56\" height=\"18\" border=\"0\" onClick=\"javascript:submitClick();\"  style=\"cursor:pointer\">\r\n\t    </td>\r\n\t</tr>\r\n</table>\t\r\n\t\r\n</div>\r\n\r\n\r\n</td>\r\n</tr>\r\n<tr>\r\n    <td>\r\n        <iframe width=\"100%\" height=\"100%\" id=\"tabUpSub1\" name=\"tabUpSub1\" frameborder=\"0\" onload=\"iFrameResize(this)\" scrolling=\"no\" src=\"/jumyong/inspectEdit.do?no=";
  private final static String _jspx_template146 = "&seq=";
  private final static String _jspx_template147 = "&SECTION=";
  private final static String _jspx_template148 = "\"></iframe>\r\n    </td>\r\n</tr>\r\n<tr>\r\n    <td height=\"10\">\r\n    </td>\r\n</tr>\r\n<tr>\r\n    <td>\r\n        <iframe width=\"100%\" height=\"100%\" id=\"tabUpSub2\" name=\"tabUpSub2\" frameborder=\"0\" onload=\"iFrameResize(this)\" scrolling=\"no\" src=\"/jumyong/confEdit.do?no=";
  private final static String _jspx_template149 = "&seq=";
  private final static String _jspx_template150 = "&SECTION=";
  private final static String _jspx_template151 = "\"></iframe>\r\n    </td>\r\n</tr>\r\n\r\n</table>\r\n</form>\r\n</body>\r\n</html>\r\n";
}
