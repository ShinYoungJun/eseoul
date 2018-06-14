package jeus_jspwork._jsp._jumyong._jumyong;

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
      out.write(_jspx_template1);
      // jsp code [from=(1,3);to=(6,1)]
      
      	String 		userId	= (String)session.getAttribute("sessionUserId");
      	
      	if(userId == null)
      	{

      out.write(_jspx_template2);
      // jsp code [from=(11,3);to=(13,1)]
      
      	}

      out.write(_jspx_template3);
      out.write(_jspx_template4);
      out.write(_jspx_template5);
      out.write(_jspx_template6);
      out.write(_jspx_template7);
      out.write(_jspx_template8);
      out.write(_jspx_template9);
      out.write(_jspx_template10);
      out.write(_jspx_template11);
      // jsp code [from=(27,69);to=(27,71)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${no}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(32,34);to=(32,46)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(33,34);to=(33,50)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.CHECK_YN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(70,35);to=(70,47)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.FORM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(87,34);to=(87,50)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.CHECK_YN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(155,31);to=(155,43)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(159,65);to=(159,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${no}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(159,83);to=(159,94)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(159,111);to=(159,123)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${countPerPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(159,136);to=(159,152)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.CHECK_YN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(160,70);to=(160,77)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(165,31);to=(165,43)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(170,69);to=(170,71)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${no}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // jsp code [from=(170,87);to=(170,98)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);
      // jsp code [from=(170,115);to=(170,127)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${countPerPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template26);
      // jsp code [from=(170,140);to=(170,156)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.CHECK_YN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // jsp code [from=(171,73);to=(171,80)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template28);
      // jsp code [from=(180,34);to=(180,50)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.CHECK_YN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template29);
      // jsp code [from=(258,22);to=(258,31)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${gongyu_yn}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template30);
      // jsp code [from=(282,25);to=(282,34)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${gongyu_yn}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template31);
      // jsp code [from=(326,26);to=(326,35)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${gongyu_yn}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template32);
      // jsp code [from=(327,21);to=(327,39)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.PURPOSE_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template33);
      // jsp code [from=(329,29);to=(329,47)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.PURPOSE_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template34);
      // jsp code [from=(349,22);to=(349,40)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.PURPOSE_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template35);
      // jsp code [from=(417,31);to=(417,49)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.PURPOSE_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template36);
      // jsp code [from=(443,22);to=(443,31)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${gongyu_yn}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template37);
      // jsp code [from=(488,121);to=(488,137)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.CHECK_YN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template38);
      // jsp code [from=(489,60);to=(489,62)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${no}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template39);
      // jsp code [from=(489,71);to=(489,81)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template40);
      // jsp code [from=(489,97);to=(489,108)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template41);
      // jsp code [from=(489,125);to=(489,137)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${countPerPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template42);
      // jsp code [from=(489,158);to=(489,165)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template43);
      // jsp code [from=(558,65);to=(558,84)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.CAL_SUM_SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template44);
      // jsp code [from=(559,47);to=(559,49)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${no}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template45);
      // jsp code [from=(560,51);to=(560,55)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mode}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template46);
      // jsp code [from=(561,49);to=(561,52)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${seq}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template47);
      // jsp code [from=(563,59);to=(563,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template48);
      // jsp code [from=(564,55);to=(564,61)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${CK_DEL}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template49);
      // jsp code [from=(565,51);to=(565,55)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${type}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template50);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template79);
      // jsp code [from=(620,59);to=(620,76)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${strPageDivideForm}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template80);
      // jsp code [from=(643,55);to=(643,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template81);
      // jsp code [from=(647,101);to=(647,133)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.PRICE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

      out.write(_jspx_template82);
      // jsp code [from=(653,55);to=(653,73)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.AREA_AFTER}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template83);
      // jsp code [from=(657,55);to=(657,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template84);
      // jsp code [from=(666,55);to=(666,71)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.FROMDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template85);
      // jsp code [from=(666,77);to=(666,91)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.TODATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template86);
      // jsp code [from=(669,95);to=(669,109)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.PERIOD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template87);
      // jsp code [from=(676,55);to=(676,73)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.ADJUSTMENT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template88);
      // jsp code [from=(681,55);to=(681,94)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.SUM_LASTYEAR)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

      out.write(_jspx_template89);
      // jsp code [from=(689,55);to=(689,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.FORM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template90);
      // jsp code [from=(695,55);to=(695,90)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.SUM_YEAR)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

      out.write(_jspx_template91);
      // jsp code [from=(704,55);to=(704,74)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.FORM_ADJUST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template92);
      // jsp code [from=(708,55);to=(708,92)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.SUM_ADJUST)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

      out.write(_jspx_template93);
      // jsp code [from=(714,55);to=(714,77)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.PERCENT_REASON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template94);
      // jsp code [from=(718,55);to=(718,75)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.PERCENT_RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template95);
      // jsp code [from=(724,55);to=(724,79)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.REDUCTION_REASON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template96);
      // jsp code [from=(728,55);to=(728,77)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.REDUCTION_RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template97);
      // jsp code [from=(734,55);to=(734,77)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.REDUCTION_FORM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template98);
      // jsp code [from=(738,55);to=(738,95)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.REDUCTION_SUM)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

      out.write(_jspx_template99);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_0_fn(pageContext, null)) return;


      out.write(_jspx_template107);
      // jsp code [from=(779,101);to=(779,113)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template108);
      // jsp code [from=(786,95);to=(786,108)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.PRICE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template109);
      // jsp code [from=(799,199);to=(799,217)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.AREA_AFTER}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template110);
      // jsp code [from=(801,185);to=(801,197)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template111);
      // jsp code [from=(808,154);to=(808,170)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.FROMDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template112);
      // jsp code [from=(811,144);to=(811,158)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.TODATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template113);
      // jsp code [from=(823,137);to=(823,151)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.PERIOD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template114);
      // jsp code [from=(848,134);to=(848,152)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.ADJUSTMENT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template115);
      // ----  spring:bind ---- //
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_0 = new org.springframework.web.servlet.tags.BindTag();
      _jspx_th_spring_bind_0.setPageContext(pageContext);
      _jspx_th_spring_bind_0.setPath("product.SUM_LASTYEAR");
      try {
        try {
          int _jspx_eval_spring_bind_0 = _jspx_th_spring_bind_0.doStartTag();
          if (_jspx_eval_spring_bind_0 != Tag.SKIP_BODY) {
            do {
              org.springframework.web.servlet.support.BindStatus status = null;
              status = (org.springframework.web.servlet.support.BindStatus) pageContext.findAttribute("status");
              out.write(_jspx_template116);
              // jsp code [from=(853,134);to=(853,154)]
              out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.SUM_LASTYEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

              out.write(_jspx_template117);

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

      out.write(_jspx_template118);
      // ----  spring:bind ---- //
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_1 = new org.springframework.web.servlet.tags.BindTag();
      _jspx_th_spring_bind_1.setPageContext(pageContext);
      _jspx_th_spring_bind_1.setPath("product.FORM");
      try {
        try {
          int _jspx_eval_spring_bind_1 = _jspx_th_spring_bind_1.doStartTag();
          if (_jspx_eval_spring_bind_1 != Tag.SKIP_BODY) {
            do {
              org.springframework.web.servlet.support.BindStatus status = null;
              status = (org.springframework.web.servlet.support.BindStatus) pageContext.findAttribute("status");
              out.write(_jspx_template119);
              // jsp code [from=(867,95);to=(867,107)]
              out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.FORM}",java.lang.String.class , pageContext.getVariableResolver(), null));

              out.write(_jspx_template120);

            } while (_jspx_th_spring_bind_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
          }
          if (_jspx_th_spring_bind_1.doEndTag() == Tag.SKIP_PAGE)
            return;
        } catch (Throwable t) {
          _jspx_th_spring_bind_1.doCatch(t);
        } finally {
          _jspx_th_spring_bind_1.doFinally();
        }
      } finally {
        _jspx_th_spring_bind_1.release();
      }

      out.write(_jspx_template121);
      // jsp code [from=(872,121);to=(872,156)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.SUM_YEAR)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

      out.write(_jspx_template122);
      // ----  spring:bind ---- //
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_2 = new org.springframework.web.servlet.tags.BindTag();
      _jspx_th_spring_bind_2.setPageContext(pageContext);
      _jspx_th_spring_bind_2.setPath("product.FORM_ADJUST");
      try {
        try {
          int _jspx_eval_spring_bind_2 = _jspx_th_spring_bind_2.doStartTag();
          if (_jspx_eval_spring_bind_2 != Tag.SKIP_BODY) {
            do {
              org.springframework.web.servlet.support.BindStatus status = null;
              status = (org.springframework.web.servlet.support.BindStatus) pageContext.findAttribute("status");
              out.write(_jspx_template123);
              // jsp code [from=(882,109);to=(882,128)]
              out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.FORM_ADJUST}",java.lang.String.class , pageContext.getVariableResolver(), null));

              out.write(_jspx_template124);

            } while (_jspx_th_spring_bind_2.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
          }
          if (_jspx_th_spring_bind_2.doEndTag() == Tag.SKIP_PAGE)
            return;
        } catch (Throwable t) {
          _jspx_th_spring_bind_2.doCatch(t);
        } finally {
          _jspx_th_spring_bind_2.doFinally();
        }
      } finally {
        _jspx_th_spring_bind_2.release();
      }

      out.write(_jspx_template125);
      // ----  spring:bind ---- //
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_3 = new org.springframework.web.servlet.tags.BindTag();
      _jspx_th_spring_bind_3.setPageContext(pageContext);
      _jspx_th_spring_bind_3.setPath("product.SUM_ADJUST");
      try {
        try {
          int _jspx_eval_spring_bind_3 = _jspx_th_spring_bind_3.doStartTag();
          if (_jspx_eval_spring_bind_3 != Tag.SKIP_BODY) {
            do {
              org.springframework.web.servlet.support.BindStatus status = null;
              status = (org.springframework.web.servlet.support.BindStatus) pageContext.findAttribute("status");
              out.write(_jspx_template126);
              // jsp code [from=(889,125);to=(889,162)]
              out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.SUM_ADJUST)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

              out.write(_jspx_template127);

            } while (_jspx_th_spring_bind_3.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
          }
          if (_jspx_th_spring_bind_3.doEndTag() == Tag.SKIP_PAGE)
            return;
        } catch (Throwable t) {
          _jspx_th_spring_bind_3.doCatch(t);
        } finally {
          _jspx_th_spring_bind_3.doFinally();
        }
      } finally {
        _jspx_th_spring_bind_3.release();
      }

      out.write(_jspx_template128);
      // jsp code [from=(896,117);to=(896,139)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.PERCENT_REASON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template129);
      // jsp code [from=(901,129);to=(901,149)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.PERCENT_RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template130);
      // jsp code [from=(907,121);to=(907,145)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.REDUCTION_REASON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template131);
      // jsp code [from=(912,133);to=(912,155)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.REDUCTION_RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template132);
      // jsp code [from=(919,119);to=(919,141)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.REDUCTION_FORM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template133);
      // jsp code [from=(924,135);to=(924,175)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.REDUCTION_SUM)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

      out.write(_jspx_template134);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_3_fn(pageContext, null)) return;


      out.write(_jspx_template136);
      // jsp code [from=(950,169);to=(950,171)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${no}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template137);
      // jsp code [from=(950,179);to=(950,183)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${seq }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template138);
      // jsp code [from=(950,195);to=(950,202)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template139);
      // jsp code [from=(959,166);to=(959,168)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${no}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template140);
      // jsp code [from=(959,176);to=(959,180)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${seq }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template141);
      // jsp code [from=(959,192);to=(959,199)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template142);
      // jsp code [from=(971,63);to=(971,95)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.PRICE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

      out.write(_jspx_template143);

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
            out.write(_jspx_template51);
            // jsp code [from=(589,86);to=(589,96)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template52);
            // jsp code [from=(589,111);to=(589,113)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${no}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template53);
            // jsp code [from=(589,119);to=(589,128)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template54);
            // jsp code [from=(589,178);to=(589,180)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${no}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template55);
            // jsp code [from=(589,189);to=(589,199)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template56);
            // jsp code [from=(589,215);to=(589,226)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template57);
            // jsp code [from=(589,243);to=(589,255)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${countPerPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template58);
            // jsp code [from=(589,264);to=(589,274)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template59);
            // jsp code [from=(589,282);to=(589,291)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template60);
            // jsp code [from=(589,303);to=(589,310)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${section}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template61);
            // jsp code [from=(590,82);to=(590,91)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${idx.count}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template62);
            // jsp code [from=(591,70);to=(591,80)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template63);
            // ----  c:choose ---- invoke //
            if (_jspx_th_c_choose_0_fn(pageContext, _jspx_th_c_forEach_0)) return true;


            out.write(_jspx_template70);
            // jsp code [from=(602,66);to=(602,82)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.AREA_AFTER}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template71);
            // jsp code [from=(603,66);to=(603,76)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template72);
            // jsp code [from=(605,66);to=(605,94)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(board.FROMDATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_1));

            out.write(_jspx_template73);
            // jsp code [from=(605,98);to=(605,124)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(board.TODATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_1));

            out.write(_jspx_template74);
            // jsp code [from=(606,66);to=(606,104)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(board.SUM_LASTYEAR) }",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template75);
            // jsp code [from=(607,66);to=(607,100)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(board.SUM_YEAR) }",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template76);
            // jsp code [from=(608,66);to=(608,102)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(board.SUM_ADJUST) }",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template77);
            // jsp code [from=(609,66);to=(609,95)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(board.SUM) }",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template78);

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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${section != '4'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template100);
          // jsp code [from=(751,116);to=(751,118)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${no}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template101);
          // jsp code [from=(751,124);to=(751,135)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template102);
          // ----  c:if ---- invoke //
          if (_jspx_th_c_if_1_fn(pageContext, _jspx_th_c_if_0)) return true;


          out.write(_jspx_template106);

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
    _jspx_th_c_if_3.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${section != '4'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
      if (_jspx_eval_c_if_3 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template135);

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
          out.write(_jspx_template64);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template67);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template69);

        } while (_jspx_th_c_choose_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_choose_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_choose_0.release();
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
          out.write(_jspx_template103);
          // ----  c:if ---- invoke //
          if (_jspx_th_c_if_2_fn(pageContext, _jspx_th_c_if_1)) return true;


          out.write(_jspx_template105);

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
    _jspx_th_c_when_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.CHECK_YN != '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
      if (_jspx_eval_c_when_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template65);
          // jsp code [from=(595,55);to=(595,85)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(board.PRICE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

          out.write(_jspx_template66);

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
          out.write(_jspx_template68);

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
          out.write(_jspx_template104);

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
  
  private final static String _jspx_template0 = "<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n";
  private final static String _jspx_template1 = "\r\n";
  private final static String _jspx_template2 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('사용자의 사용시간이 종료되었습니다. 다시 접속 해주시기 바랍니다.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template3 = "\r\n";
  private final static String _jspx_template4 = "\r\n";
  private final static String _jspx_template5 = "\r\n";
  private final static String _jspx_template6 = "  \r\n";
  private final static String _jspx_template7 = "  \r\n";
  private final static String _jspx_template8 = "  \r\n";
  private final static String _jspx_template9 = "\r\n";
  private final static String _jspx_template10 = "\r\n";
  private final static String _jspx_template11 = "    \r\n<html>\r\n    <head>\r\n        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n        <title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n        <style type=\"text/css\">\r\n            <!--\r\n            body {\r\n                margin: 0px;\r\n                background-image: url(/img/left_back.gif);\r\n            }\r\n            -->\r\n        </style>\r\n        <link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n        <script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script> \r\n        <script language=\"javascript\" src=\"/js/calculation.js\"></script> \r\n        <script>\r\n            var savable = 0;\r\n            var savable_v = 0;\r\n            function InitPage()\r\n            {\r\n\r\n                if(document.getElementById(\"CK_DEL\").value == 'true'){\r\n                    location.href = \"/jumyong/productInsert.do?no=";
  private final static String _jspx_template12 = "\";\r\n                }\r\n\r\n\r\n\t\t\r\n                setParentYear('";
  private final static String _jspx_template13 = "');\r\n                var check_yn =\"";
  private final static String _jspx_template14 = "\";\r\n                parent.document.getElementById(\"SEQ\").value = document.getElementById(\"SEQ\").value;\r\n\t\t\r\n                if(document.getElementById(\"mode\").value == \"edit\" || document.getElementById(\"mode\").value == \"add\"  )\r\n                {\r\n                    document.getElementById(\"view\").style.display = \"none\";\r\n\t\t\t\t\t\t\r\n                    document.getElementById(\"edit\").style.display= \"block\";\r\n                    document.getElementById(\"edit\").style.pixelTop = 0;\r\n\r\n                    if(check_yn==\"1\"){\t\r\n                        document.getElementById(\"price_view3\").style.display=\"none\";\r\n                    }\r\n\t\t\t\r\n                    if(document.getElementById(\"mode\").value == \"add\")\r\n                    {\r\n                        var date = new Date();\r\n                        var year = date.getFullYear();\t\r\n                        document.getElementById(\"YEAR\").value = year;\r\n                    }\r\n\t\t\t\r\n                }else\r\n                {\r\n                    document.getElementById(\"edit\").style.display = \"none\";\r\n                    document.getElementById(\"view\").style.display = \"block\";\r\n                    if(check_yn==\"1\"){\t\r\n                        document.getElementById(\"price_view3\").style.display=\"none\";\r\n                    }\r\n                }\r\n\r\n                if(check_yn==\"1\"){\t\r\n                    document.getElementById(\"price_img\").style.display=\"none\";\r\n                    document.getElementById(\"PRICE\").value=\"1\";\t\t//단가쪽에 공시지가가 표시되기 때문에 공시지가는 1로 표시\t\r\n                    document.getElementById(\"price_view2\").style.display=\"none\";\r\n                    document.getElementById(\"price_view3\").style.display=\"none\";\r\n                }\r\n\t\t\r\n                var cal_type = \"";
  private final static String _jspx_template15 = "\";\t\t//월단위 계산인지 일단위 계산인지 여부 알아내기\r\n                for(var i=1;i<cal_type.length;i++){\r\n                    if(cal_type.substring(i-1,i)==\"일\"){\r\n                        document.getElementById(\"date_type\").value=\"day\";\r\n                        document.getElementById(\"date_type1\").innerHTML = \"일수\";\r\n                        document.getElementById(\"date_type2\").innerHTML = \"일\";\r\n                        return;\r\n                    }else{\r\n                        document.getElementById(\"date_type1\").innerHTML = \"개월수\";\r\n                        document.getElementById(\"date_type2\").innerHTML = \"개월\";\r\n                    }\r\n                }\r\n            }\r\n\r\n\r\n            function submitClick()\r\n            {\r\n                var check_yn =\"";
  private final static String _jspx_template16 = "\";\r\n\r\n                var form =  document.getElementById(\"FORM\").value;\r\n\r\n                for(var i=1;i<form.length+1;i++){\r\n                    if(form.substring(i-1,i)==\"일\"){\r\n                        if(document.getElementById(\"date_type\").value==\"month\"){\r\n                            alert(\"산출이 일수로 되어있지만 기준은 개월수로 되어 있습니다.\");\r\n                            return;\r\n                        }\r\n                    }\t\t\r\n                    if(form.substring(i-1,i)==\"월\"){\r\n                        if(document.getElementById(\"date_type\").value==\"day\"){\r\n                            alert(\"산출이 개월수로 되어있지만 기준은 일수로 되어 있습니다.\");\r\n                            return;\r\n                        }\r\n                    }\t\r\n                }\r\n\t\t\r\n                // 수정일때는 산출내역 계산여부 체크 안하도록..\r\n                if(document.getElementById(\"mode\").value == \"edit\"){\r\n                    savable_v = 4;\r\n                }\r\n\t\t\r\n                if(check_yn == \"1\"){\r\n                    if(savable_v == 3 || savable_v == 4){\r\n                        var productForm = document.productForm;\r\n\t\t\r\n                        //comma제거\r\n                        removeComma2(\"PRICE\");\r\n                        removeComma2(\"SUM_LASTYEAR\");\r\n                        removeComma2(\"SUM_YEAR\");\r\n                        removeComma2(\"SUM_ADJUST\");\r\n                        removeComma2(\"REDUCTION_SUM\");\r\n\t\t\t\t\r\n\t\t\r\n                        productForm.submit();\r\n                    }else {\r\n                        alert(\"산출 내역을 먼저 계산해 주십시오.\");\r\n                        return;\r\n                    }\r\n                }else if(savable_v == 4){\r\n                    var productForm = document.productForm;\r\n\t\t\t\r\n                    //comma제거\r\n                    removeComma2(\"PRICE\");\r\n                    removeComma2(\"SUM_LASTYEAR\");\r\n                    removeComma2(\"SUM_YEAR\");\r\n                    removeComma2(\"SUM_ADJUST\");\r\n                    removeComma2(\"REDUCTION_SUM\");\r\n\t\r\n                    productForm.submit();\r\n                }else {\r\n                    alert(\"산출 내역을 먼저 계산해 주십시오.\");\r\n                    return;\r\n                }\r\n            }\r\n\r\n\r\n            function subTabClick(hiddenSubTabName,visibleSubTabName)\r\n            {\t\r\n                document.getElementById(hiddenSubTabName).style.display = 'none';\t\r\n                document.getElementById(visibleSubTabName).style.display = 'block';\t\r\n            }\r\n\r\n            function goModify()\r\n            {\r\n                var area = document.getElementById(\"AREA_AFTER\").value;\r\n                var year = '";
  private final static String _jspx_template17 = "';\r\n                var seq = document.getElementById(\"SEQ\").value;\r\n                var sum_adjust = Number(removeComma(document.getElementById(\"SUM_ADJUST\").value));\r\n\t\t\r\n                location.href = \"/jumyong/productInsert.do?no=";
  private final static String _jspx_template18 = "&currentPage=";
  private final static String _jspx_template19 = "&countPerPage=";
  private final static String _jspx_template20 = "&check_yn=";
  private final static String _jspx_template21 = "\"\r\n                    +\"&mode=edit&year=\"+year+\"&seq=\"+seq+\"&section=";
  private final static String _jspx_template22 = "\";\r\n            }\r\n\r\n            function goDelete()\r\n            {\r\n                var year = '";
  private final static String _jspx_template23 = "';\r\n                var seq = document.getElementById(\"SEQ\").value;\r\n\r\n                var result = confirm(\"산출내역을 삭제하시겠습니까?\");\r\n                if(result){\r\n                    location.href = \"/jumyong/productInsert.do?no=";
  private final static String _jspx_template24 = "&currentPage=";
  private final static String _jspx_template25 = "&countPerPage=";
  private final static String _jspx_template26 = "&check_yn=";
  private final static String _jspx_template27 = "\"\r\n                        +\"&mode=del&year=\"+year+\"&seq=\"+seq+\"&section=";
  private final static String _jspx_template28 = "\"+\"&TYPE=\"+document.getElementById(\"TYPE\").value;\r\n                }\r\n\r\n            }\r\n            \r\n            function Calculate()\r\n            {\r\n                savable = 0;\r\n                \r\n                var check_yn =\"";
  private final static String _jspx_template29 = "\";\r\n                var area_after = document.getElementById(\"AREA_AFTER\").value;\r\n                var rate = document.getElementById(\"RATE\").value;\r\n                var price = removeComma(document.getElementById(\"PRICE\").value);\r\n                var type = document.getElementById(\"TYPE\").value;\r\n\t    \r\n                if(check_yn!=\"1\"){\r\n                    if(price==\"0\" || price==\"\"){\r\n                        alert(\"공시지가를 넣으세요.\");\r\n                        document.getElementById(\"PRICE\").focus();\r\n                        document.getElementById(\"saveCheck\").value=\"0\";\r\n                        return;\r\n                    }\r\n                }\r\n                \r\n                savable++;\t\t//각 점검을 지날때마다 savable에 +1을 해준다.\r\n                \r\n                if(Number(area_after)==0 || area_after==\"\"){\r\n                    alert(\"점용면적을 넣어주세요.\");\r\n                    document.getElementById(\"AREA_AFTER\").focus();\r\n                    document.getElementById(\"saveCheck\").value=\"0\";\r\n                    return;\r\n                }\r\n                \r\n                savable++;\r\n                \r\n                if(area_after.substring(area_after.indexOf(\".\")+1, area_after.indexOf(\".\")+5).length>3){\r\n                    alert(\"점용면적을 소수점 3자리까지 표기 해 주세요\");\r\n                    document.getElementById(\"AREA_AFTER\").focus();\r\n                    document.getElementById(\"saveCheck\").value=\"0\";\r\n                    return;\r\n                }\r\n                \r\n                savable++;\r\n                \r\n                if(document.getElementById(\"PERIOD\").value==\"0\" || document.getElementById(\"PERIOD\").value==\"\"){\r\n                    document.getElementById(\"saveCheck\").value=\"0\";\t\t\t\r\n                    if(document.getElementById(\"FROMDATE\").value==\"\" || trim(document.getElementById(\"FROMDATE\").value)==\"\"){\r\n                        alert(\"산출 시작일을 설정해 주세요.\");\r\n                        document.getElementById(\"saveCheck\").value=\"0\";\r\n                        return;\r\n                    }\r\n                    if(document.getElementById(\"TODATE\").value==\"\" || trim(document.getElementById(\"TODATE\").value)==\"\"){\r\n                        alert(\"산출 종료일을 설정해 주세요.\");\r\n                        document.getElementById(\"saveCheck\").value=\"0\";\r\n                        return;\r\n                    }\r\n                    if(confirm(\"개월수를 넣지 않았습니다. 개월수를 자동 계산하시겠습니까?\")){\r\n                        calDate();\r\n                    }\r\n                }\r\n                \r\n                savable++;\r\n                \r\n                var period = document.getElementById(\"PERIOD\").value;\r\n                if(document.getElementById(\"date_type\").value==\"month\"){\r\n\t\t\t   \r\n                    var sum_year = Math.floor(fixFloatCal(parseFloat(area_after)*(parseFloat(period)/12)*parseFloat(rate)*parseFloat(price)));\r\n\r\n                    if(check_yn!=\"1\"){\t\r\n                        document.getElementById(\"FORM\").value = area_after+\"㎡ X \" + period + \"/12개월 X \" +rate +\" X \" +insertComma2(price);\r\n                    }else{\r\n                        document.getElementById(\"FORM\").value = area_after+\"㎡ X \" + period + \"/12개월 X \" +rate;\r\n                    }\r\n\t\t\t\r\n                }else if(document.getElementById(\"date_type\").value==\"day\"){\r\n\t\t    \r\n                    var leafYear = f_leapyear(document.getElementById(\"YEAR\").value);\r\n                    var sum_year = Math.floor(fixFloatCal(parseFloat(area_after)*(parseFloat(period)/(365+leafYear))*parseFloat(rate)*parseFloat(price)));\r\n\r\n                    if(check_yn!=\"1\"){\t\r\n                        document.getElementById(\"FORM\").value = area_after+\"㎡ X \" + period + \"/\"+Number(365+leafYear)+\"일 X \" +rate +\" X \" +insertComma2(price);\r\n                    }else{\r\n                        document.getElementById(\"FORM\").value = area_after+\"㎡ X \" + period + \"/\"+Number(365+leafYear)+\"일 X \" +rate;\r\n                    }\r\n                }\r\n\r\n        \t\tif(type == '1'){\t// type == \"1\" 도로\r\n\t\t\t\t\tvar gongyu = \"";
  private final static String _jspx_template30 = "\";\r\n\r\n\t\t\t\t\tif(gongyu == \"0\") {\t// 공유재산물품관리법은 10원 단위 절삭 2014.11.14\r\n\t\t\t\t\t\tsum_year = parseInt(sum_year/10)*10;\t\t//10원 절삭\r\n\t\t\t\t\t}else{\r\n\t        \t\t\tsum_year = parseInt(sum_year/100)*100;\t\t//100원 절삭\r\n\t\t\t\t\t}\r\n\t\t\t\t\t\r\n        \t\t}else{\t// type != \"1\" 하천, 구거\r\n        \t\t\tsum_year = parseInt(sum_year/10)*10;\t\t//10원 절삭\r\n        \t\t}\r\n        \t\t\r\n                document.getElementById(\"SUM_YEAR\").value = insertComma2(sum_year);\r\n\t   \t\r\n\t\t \r\n              \t//조정 계수 및 조정 점용료 계산\t\t\r\n                var sum_lastyear = removeComma(document.getElementById(\"SUM_LASTYEAR\").value);\t\t// 작년도 점용료\r\n                var adjust = 1;\r\n                var sum_adjust;\r\n                \r\n               \tvar rate1 = Math.floor(((sum_year - sum_lastyear ) / sum_lastyear) *100 ); // 현년도 작년도 점용료 비율\r\n                \r\n               \tif(type == '1'){\r\n                    ////// 2015.01.21 공물법 시행령 개정안 반영 \r\n\t\t\t\t\tvar gongyu_yn = \"";
  private final static String _jspx_template31 = "\";\r\n\t\t\t\t\tif( gongyu_yn == 0 && rate1 >= 5 && rate1 <=3000 && check_yn == '2') {\r\n\t\t\t\t\t\t// 작년 점용료 대비 현년도 적용료가 100분의 5 이상이면\r\n\t\t\t\t\t\t// 증가분의 100분의 30을 조정계수로 하여 작년도 점용료와 더한다.\r\n\t\t\t\t\t\t//var adjust_gongyu_yn = (sum_year - sum_lastyear ) * `;\r\n\t\t\t\t\t\tvar adjust_gongyu = (sum_year - (sum_lastyear + (sum_lastyear * 0.05))) * 0.3;\r\n\t\t\t\t\t\tadjust = adjust_gongyu;\r\n\t\r\n\t\t\t\t\t\tsum_adjust = Number((sum_lastyear +  (sum_lastyear * 0.05))) + Number(adjust);\r\n                       sum_adjust = parseInt(Math.floor(sum_adjust/10)*10);\t//공물법은 10원 절삭\r\n                       \r\n                       document.getElementById(\"SUM_ADJUST\").value = insertComma2(sum_adjust);\r\n                       var sum_lastyear_comma = sum_lastyear + (sum_lastyear * 0.05);\r\n                       sum_lastyear_comma = Math.floor( sum_lastyear_comma / 10 ) * 10 ;\r\n                       var adjust_comma = adjust;\r\n                       document.getElementById(\"FORM_ADJUST\").value = insertComma2(sum_lastyear_comma) + \" + \"+ insertComma2(adjust_comma.toFixed());\r\n\t\t\t\t\t}else if( rate1 >= 10 && rate1 <=3000 && check_yn == '2')//비율이 허용 범위내에 있을때\r\n                    {\t\r\n                        //adjust = calJojung(rate1);\r\n                        // 개정 2012.11.27 제 44조 관련하여 calJojungNew함수를 추가하여 점용료 조정산식을 적용함.\r\n                        //adjust = calJojungNew(rate1);\r\n                        adjust = calJojung2015(rate1); // 시행령69조에의해 수정 #ny(2016.01.)\r\n                        \r\n                        sum_adjust = Number(sum_lastyear)*Number(adjust);\r\n                        sum_adjust = parseInt(Math.floor(sum_adjust/100)*100);\r\n                        \r\n                        document.getElementById(\"SUM_ADJUST\").value = insertComma2(sum_adjust);\r\n                        document.getElementById(\"FORM_ADJUST\").value = sum_lastyear + \" X \"+ adjust;\r\n\r\n                    }else{\r\n                    \tsum_adjust = sum_year;\r\n                    \tdocument.getElementById(\"SUM_ADJUST\").value = insertComma2(sum_adjust);\r\n                        document.getElementById(\"FORM_ADJUST\").value = document.getElementById(\"FORM\").value;\r\n                    }\r\n               \t}else{  \r\n\t               \t//********** BEGIN_KANG_20120627\r\n               \t\t//\t\t\tif( rate1 >= 5 && check_yn == '2'){\r\n               \t\tvar sw = false;\r\n               \t\tif( sum_lastyear != 0 && sum_lastyear != '0' && sum_lastyear != \"0\"){\r\n               \t\t\tsw = true;\r\n               \t\t}\r\n               \t\t\r\n\t\t\t\t\tif( sw && rate1 >= 5 && check_yn == '2'){\r\n\r\n\t\t\t\t\t\tvar gongyu_yn = \"";
  private final static String _jspx_template32 = "\";\r\n\t\t\t\t\t\tvar temp = \"";
  private final static String _jspx_template33 = "\";\r\n\t\t\t\t\t\tvar purpose_cd = temp.substring(0, 2);\r\n\t\t\t\t\t\t//var purpose_cd = \"";
  private final static String _jspx_template34 = "\";\r\n\t\t\t\t\t\t////// 2015.01.21 공물법 시행령 개정안 반영 \r\n\t\t\t\t\t\tif( purpose_cd == 01) {\r\n\t\t\t\t\t\t\t// 작년 점용료 대비 현년도 적용료가 100분의 5 이상이면\r\n\t\t\t\t\t\t\t// 증가분의 100분의 30을 조정계수로 하여 작년도 점용료와 더한다.\r\n\t\t\t\t\t\t\t//var adjust_gongyu = (sum_year - sum_lastyear ) * 0.7;\r\n\t\t\t\t\t\t\tvar adjust_gongyu = (sum_year - (sum_lastyear + (sum_lastyear * 0.05))) * 0.3;\r\n\t\t\t\t\t\t\tadjust = adjust_gongyu;\r\n\r\n\t\t\t\t\t\t\tsum_adjust = Number((sum_lastyear + (sum_lastyear * 0.05))) + Number(adjust);\r\n\t                        sum_adjust = parseInt(Math.floor(sum_adjust/10)*10);\r\n\t                        \r\n\t                        document.getElementById(\"SUM_ADJUST\").value = insertComma2(sum_adjust);\r\n\t                        var sum_lastyear_comma = sum_lastyear + (sum_lastyear * 0.05);\r\n\t                        sum_lastyear_comma = Math.floor( sum_lastyear_comma / 10 ) * 10 ;\r\n\t                        var adjust_comma = adjust;\r\n\t                        document.getElementById(\"FORM_ADJUST\").value = insertComma2(sum_lastyear_comma) + \" + \"+ insertComma2(adjust_comma.toFixed());\r\n\t\t\t\t\t\t}else{\r\n\t\t\t\t\t\t\t//********** END_KANG_20120627\r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\tvar temp = \"";
  private final static String _jspx_template35 = "\";\r\n\t\t\t\t\t\t\tvar purpose_cd = temp.substring(0, 2);\r\n\r\n\t\t\t\t\t\t\t// 공유수면법(하천, 구거)\r\n\t\t\t\t\t\t\t/*\r\n\t\t\t\t\t\t\tif(purpose_cd == \"02\" && rate1 >= 10){\r\n\t               \t\t\t\t\r\n\t\t\t\t\t\t\t\tadjust = calJojungHachun(rate1);\r\n\r\n\t\t\t\t\t\t\t\tsum_adjust = Number(sum_lastyear) + Number(sum_lastyear) * adjust;\r\n                sum_adjust = parseInt(Math.floor(sum_adjust/10)*10);\r\n\r\n                document.getElementById(\"SUM_ADJUST\").value = insertComma2(sum_adjust);\r\n\t\t\t\t\t\t\t\tdocument.getElementById(\"FORM_ADJUST\").value = sum_lastyear + \" X ( 1 + \"+ adjust + \" )\";\r\n\t\t\t\t\t\t\t}else if(rate1 >= 5){\r\n                      adjust = 1.05;\r\n                      \r\n                      sum_adjust = Number(sum_lastyear)*Number(adjust);\r\n                      sum_adjust = parseInt(Math.floor(sum_adjust/10)*10);\r\n                      \r\n                      document.getElementById(\"SUM_ADJUST\").value = insertComma2(sum_adjust);\r\n                      document.getElementById(\"FORM_ADJUST\").value = sum_lastyear + \" X \"+ adjust;\r\n         \t\t\t}*/\r\n\r\n\t\t\t\t\t\t\t//2016_0622 서초구청 민원으로 확인결과 구거의 경우 전년도점용료와 현년도점용료가 10프로 이상 차이날때만 조정계수를 부과\r\n\t\t\t\t\t\t\tif(purpose_cd == \"02\"){\r\n\t\t\t\t\t\t\t\tif(rate1 >= 10){\r\n\t               \t\t\t\t\r\n\t\t\t\t\t\t\t\t\tadjust = calJojungHachun(rate1);\r\n\t\r\n\t\t\t\t\t\t\t\t\tsum_adjust = Number(sum_lastyear) + Number(sum_lastyear) * adjust;\r\n\t\t                            sum_adjust = parseInt(Math.floor(sum_adjust/10)*10);\r\n\t\r\n                  document.getElementById(\"SUM_ADJUST\").value = insertComma2(sum_adjust);\r\n           \t\t\t\tdocument.getElementById(\"FORM_ADJUST\").value = sum_lastyear + \" X ( 1 + \"+ adjust + \" )\";\r\n\t\t\t\t\t\t\t\t}else{\r\n\t\t\t\t\t\t\t\t\tadjust = 1.00;\r\n\t\t                          \r\n                  //sum_adjust = Number(sum_lastyear)*Number(adjust);\t\t//작년도랑 연산하면 안된다고..서초구청\r\n                  sum_adjust = Number(sum_year)*Number(adjust);\r\n                  sum_adjust = parseInt(Math.floor(sum_adjust/10)*10);\r\n                  \r\n                  document.getElementById(\"SUM_ADJUST\").value = insertComma2(sum_adjust);\r\n                  //document.getElementById(\"FORM_ADJUST\").value = sum_lastyear + \" X \"+ adjust;\r\n                  document.getElementById(\"FORM_ADJUST\").value = sum_year + \" X \"+ adjust;\r\n\t\t\t\t\t\t\t\t\t}\r\n\t               \t\t\t//}else if(rate1 >= 10){\r\n           \t\t\t}\r\n\t\t\t\t\t\r\n\t\t\t\t\t\t\t/*\r\n\t                        adjust = 1.05;\r\n\t                        \r\n\t                        sum_adjust = Number(sum_lastyear)*Number(adjust);\r\n\t                        sum_adjust = parseInt(Math.floor(sum_adjust/10)*10);\r\n\t                        \r\n\t                        document.getElementById(\"SUM_ADJUST\").value = insertComma2(sum_adjust);\r\n\t                        document.getElementById(\"FORM_ADJUST\").value = sum_lastyear + \" X \"+ adjust;\r\n\t                        */\r\n\t\t\t\t\t\t}\r\n               \t\t\r\n               \t\t}else{\r\n               \t\t\tsum_adjust = sum_year;\r\n                    document.getElementById(\"SUM_ADJUST\").value = insertComma2(sum_adjust);\r\n                    document.getElementById(\"FORM_ADJUST\").value = document.getElementById(\"FORM\").value;\r\n               \t\t}\r\n               \t\t\r\n               \t}\r\n               \t\r\n               \tvar temp = \"";
  private final static String _jspx_template36 = "\";\r\n\t\t\t\t\t\t\t\tvar purpose_cd = temp.substring(0, 2);\r\n\t\t\t\t\t\t\t\tif(type != '1' && purpose_cd == \"02\" && rate1 >= 10 ){\r\n\t\t\t\t\t\t\t\t\tadjust = parseFloat(adjust) + 1;\r\n\t\t\t\t\t\t\t\t\tadjust = adjust.toFixed(2);\r\n\t\t\t\t\t\t\t\t\tdocument.getElementById(\"ADJUSTMENT\").value = adjust;\r\n\t\t\t\t\t\t\t\t}else{\r\n\t\t\t\t\t\t\t\t\tdocument.getElementById(\"ADJUSTMENT\").value = adjust;\r\n\t\t\t\t\t\t\t\t}\r\n                \r\n                var percentRate = document.getElementById(\"PERCENT_RATE\").value;\r\n                var reductionRate = document.getElementById(\"REDUCTION_RATE\").value;\r\n                \r\n                if(percentRate == '0.0'){\r\n                \tpercentRate = '100.0';\r\n                }\r\n                \r\n                \r\n                // 최종 계산\r\n                var reduction_sum = parseFloat(sum_adjust) * ((parseFloat(percentRate))/100) * ((100 - parseFloat(reductionRate))/100);\r\n              \t//alert(\"점용료 절삭 테스트 sum: \" + parseFloat(sum_adjust));\r\n                 //부동소수점 오류 수정\r\n                reduction_sum = fixFloatCal(reduction_sum);\r\n\r\n\r\n        \t\tif(type == '1'){\t// type == \"1\" 도로\r\n\t\t\t\t\tvar gongyu = \"";
  private final static String _jspx_template37 = "\";\r\n\r\n\t\t\t\t\tif(gongyu == \"0\") {\t// 공유재산물품관리법은 10원 단위 절삭 2014.11.14\r\n\t\t\t\t\t\treduction_sum = parseInt(reduction_sum/10)*10;\t\t//10원 절삭\r\n\t\t\t\t\t}else{\r\n\t\t\t\t\t\treduction_sum = parseInt(reduction_sum/100)*100;\t\t//100원 절삭\r\n\t\t\t\t\t}\r\n\t\t\t\t\t\r\n        \t\t}else{\t// type != \"1\" 하천, 구거\r\n        \t\t\t//alert(\"점용료 절삭 테스트1: \" + reduction_sum);\r\n\t\t\t\t\treduction_sum = parseInt(reduction_sum/10)*10;\t\t//10원 절삭\r\n\t\t\t\t\t//alert(\"점용료 절삭 테스트2: \" + reduction_sum);\r\n        \t\t}\r\n\r\n        \t\t\r\n                document.getElementById(\"REDUCTION_SUM\").value = insertComma2(reduction_sum);\r\n                var reductionForm = document.getElementById(\"FORM_ADJUST\").value;\r\n                \r\n                if(percentRate != '0.0' && percentRate != '100.0'){\r\n                \treductionForm += \" X ((\"+percentRate+\")/100)\";\r\n                }\r\n                if(reductionRate != '0.0'){\r\n                \t//********** BEGIN_현진_20120320\r\n                \t/*\r\n\t\t\t\t\t\t\t\t\treductionForm += \" X ((1-\"+reductionRate+\")/100)\";\r\n                \t*/\r\n                \treductionForm += \" X ((100-\"+reductionRate+\")/100)\";\r\n                \t//********** END_현진_20120320\r\n                \t                    \r\n                \t\r\n                }\r\n                \r\n                document.getElementById(\"REDUCTION_FORM\").value = reductionForm;\r\n\r\n                document.getElementById(\"saveCheck\").value=\"1\";\r\n\t\t \t\r\n                savable_v = savable;\r\n                savable = 0;\r\n            }\r\n\t\r\n            \r\n       \r\n            // 추가 화면 이동\r\n            function goAdd(adminNo,currentPage)\r\n            {\r\n                location.href(\"/jumyong/productInsert.do?no=\"+adminNo+\"&currentPage=\"+currentPage+\"&mode=add&check_yn=";
  private final static String _jspx_template38 = "\");\r\n                //\t<a href=\"/jumyong/productInsert.do?no=";
  private final static String _jspx_template39 = "&year=";
  private final static String _jspx_template40 = "&currentPage=";
  private final static String _jspx_template41 = "&countPerPage=";
  private final static String _jspx_template42 = "&mode=add&section=";
  private final static String _jspx_template43 = "\">\r\n            }\r\n    \r\n    \r\n            //공시지가 팝업\r\n            function openLandPricePopUp()\r\n            {\r\n                var winW = 320;\r\n                var winH = 240;\r\n                var status =\"toolbar=no, location=no, directories=no, status=no, menubar=no, resizable=no, scrollbars=no, width=\"+winW+\", height=\"+winH+\", left=0, top=0\";\r\n\r\n                var admin_no = document.getElementById(\"no\").value;\r\n                var year = document.getElementById(\"YEAR\").value;\r\n                window.open('/land_price.do?ADMIN_NO='+admin_no+'&year='+year, 'win', status);\r\n            }\r\n\t\r\n            function iFrameResize(obj)\r\n            {\r\n                var iFrm = obj;\r\n                var the_height = iFrm.contentWindow.document.body.scrollHeight;\r\n                iFrm.style.height = the_height + \"px\";\r\n            }\r\n\t\r\n            function Tab_Src(adminno, seq)\r\n            {\t\t\r\n                var tab1\t= document.getElementById(\"tabUpSub1\");\r\n                var tab2\t= document.getElementById(\"tabUpSub2\");\r\n\t\t\r\n                tab1.src\t= \"/jumyong/inspectEdit.do?no=\" + adminno + \"&seq=\" + seq;\r\n                tab2.src\t= \"/jumyong/confEdit.do?no=\" + adminno + \"&seq=\" + seq;\r\n            }\r\n\t\r\n\t\r\n            function trim(str){\r\n\r\n                str = str.replace(/(^\\s*)|(\\s*$)/g,\"\");\r\n\t\r\n                return str;\r\n\t\r\n            }\r\n\r\n            function ShowMsgJumjiInsert(obj){\r\n\r\n                var target = obj;\r\n                if(target.name == 'AREA_AFTER'){\r\n                    alert(\"점용면적은 점용지 정보에서 수정하세요.\");\r\n                }else if(target.name == 'REDUCTION_RATE'){\r\n                    alert(\"감면율은 점용지 정보에서 수정하세요.\");\r\n                }else if(target.name == 'REDUCTION_REASON'){\r\n                    alert(\"감면율 사유는 점용지 정보에서 수정하세요.\");\r\n                }else if(target.name == 'PERCENT_RATE'){\r\n                    alert(\"지분율은 점용지 정보에서 수정하세요.\");\r\n                }else if(target.name == 'PERCENT_REASON'){\r\n                    alert(\"지분율 사유는 점용지 정보에서 수정하세요.\");\r\n                }\r\n            }\r\n\r\n          function goLanprice(){\r\n        \t\tvar url = \"http://kras.seoul.go.kr/land_info/info/landprice/landprice.do\";\r\n        \t\tvar name = \"공시지가열람\";\r\n        \t\tvar size = \"width=800, height=900, scrollbars=yes, resizable=yes\";\r\n        \t\twindow.open(url, name, size);\r\n        \t}\r\n        </script>\r\n\r\n    </head>\r\n\r\n    <body onload=\"javascript:InitPage();\"  border=\"0\">\r\n        <form id=\"productForm\" name=\"productForm\" method=\"post\" action = \"/jumyong/productInsert.do\" >\r\n            <input id=\"CAL_SUM_SEQ\" name=\"CAL_SUM_SEQ\" value=\"";
  private final static String _jspx_template44 = "\" type=\"hidden\" >\r\n            <input id=\"no\" name=\"no\" value=\"";
  private final static String _jspx_template45 = "\" type=\"hidden\" >\r\n            <input id=\"mode\" name=\"mode\" value=\"";
  private final static String _jspx_template46 = "\" type=\"hidden\" >\r\n            <input id=\"SEQ\" name=\"SEQ\" value=\"";
  private final static String _jspx_template47 = "\" type=\"hidden\" >\r\n            <input id=\"saveCheck\" name=\"saveCheck\" value=\"0\" type=\"hidden\">\r\n            <input id = \"SECTION\" name=\"SECTION\" value=\"";
  private final static String _jspx_template48 = "\" type=\"hidden\" >\r\n            <input id=\"CK_DEL\" name=\"CK_DEL\" value=\"";
  private final static String _jspx_template49 = "\" type=\"hidden\">\r\n            <input id=\"TYPE\" name=\"TYPE\" value=\"";
  private final static String _jspx_template50 = "\" type=\"hidden\">\r\n            \r\n\r\n            <table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                <tr>\r\n                    <td class=\"contborder_purple\">\t\t\t\t\t\t\t            \r\n                        <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                            <tr>\r\n                                <td>\r\n                                    <table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n                                        <tr>\r\n                                            <td height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">번호</td>\r\n                                            <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">기준연도</td>\r\n                                            <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">공시지가</td>\r\n                                            <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">면적</td>\r\n                                            <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">요율/단가</td>\r\n                                            <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">산출기간</td>\r\n                                            <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">작년도 점용료 </td>\r\n                                            <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">현년도 점용료 </td>\r\n                                            <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조정 점용료 </td>\r\n                                            <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">최종 점용료 </td>\r\n                                        </tr>\r\n                                        ";
  private final static String _jspx_template51 = "\r\n                                            <tr onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\" \r\n                                                onclick=\"javascript:setParentYear('";
  private final static String _jspx_template52 = "');Tab_Src('";
  private final static String _jspx_template53 = "','";
  private final static String _jspx_template54 = "');location.href('/jumyong/productInsert.do?no=";
  private final static String _jspx_template55 = "&year=";
  private final static String _jspx_template56 = "&currentPage=";
  private final static String _jspx_template57 = "&countPerPage=";
  private final static String _jspx_template58 = "&year=";
  private final static String _jspx_template59 = "&seq=";
  private final static String _jspx_template60 = "&section=";
  private final static String _jspx_template61 = "');\" style=\"cursor:pointer\" >\r\n                                                <td height=\"26\" align=\"center\">";
  private final static String _jspx_template62 = "</td>\r\n                                                <td align=\"center\">";
  private final static String _jspx_template63 = "</td>\r\n                                                <td align=\"center\"><!-- span id=\"price_view1\" style=\"display:block;\"></span-->\r\n                                            ";
  private final static String _jspx_template64 = "\r\n                                                ";
  private final static String _jspx_template65 = "\r\n                                                    ";
  private final static String _jspx_template66 = "\r\n                                                ";
  private final static String _jspx_template67 = "\r\n                                                ";
  private final static String _jspx_template68 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t-\r\n                                                ";
  private final static String _jspx_template69 = "\r\n                                            ";
  private final static String _jspx_template70 = "\r\n                                            </td>\r\n                                            <td align=\"center\">";
  private final static String _jspx_template71 = "</td>\r\n                                            <td align=\"center\">";
  private final static String _jspx_template72 = "</td>\r\n\r\n                                            <td align=\"center\">";
  private final static String _jspx_template73 = "~";
  private final static String _jspx_template74 = "</td>\r\n                                            <td align=\"center\">";
  private final static String _jspx_template75 = "</td>\r\n                                            <td align=\"center\">";
  private final static String _jspx_template76 = "</td>\r\n                                            <td align=\"center\">";
  private final static String _jspx_template77 = "</td>\r\n                                            <td align=\"center\">";
  private final static String _jspx_template78 = "</td>\r\n\r\n                                            </tr> \r\n                                        ";
  private final static String _jspx_template79 = "\r\n                                    </table></td>\r\n                            </tr>\r\n                            <tr>\r\n                                <td height=\"40\" align=\"center\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                                        <tr>\r\n                                            <td align=\"center\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n                                                    <tr>\r\n                                                        ";
  private final static String _jspx_template80 = "\r\n                                                    </tr>\r\n\r\n                                                </table></td>\r\n\r\n                                        </tr>\r\n                                        <tr>\r\n\r\n\r\n                                        </tr>\r\n                                    </table></td>\r\n                            </tr>\r\n\r\n                        </table>\r\n\r\n                        <div id=\"view\" style=\"width:100%;\">\r\n                            <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\r\n                                <tr>\r\n                                    <td><table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n                                            <tr>\r\n                                                <td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" >기준년도</td>\r\n                                                <td width=\"42%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    ";
  private final static String _jspx_template81 = "년\r\n                                                </td>                     \r\n                                                <td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">공시지가</td>\r\n                                                <td width=\"32%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    <span id=\"price_view2\" style=\"display:block;\">";
  private final static String _jspx_template82 = "원 </span>              \r\n                                                </td> \r\n                                            </tr>\r\n                                            <tr>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용면적</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    ";
  private final static String _jspx_template83 = " m / ㎡ / 개\r\n                                                </td>                     \r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">요율/단가</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    ";
  private final static String _jspx_template84 = "\r\n                                                </td> \r\n                                            </tr>                   \r\n\r\n\r\n                                            <tr>\r\n                                                <td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">산출기간</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\r\n                                                    ";
  private final static String _jspx_template85 = " ~ ";
  private final static String _jspx_template86 = "\r\n                                                </td>  \r\n                                                <td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\"><span id=\"date_type1\"></span></td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >";
  private final static String _jspx_template87 = "<span id=\"date_type2\"></span></td>\r\n                                            </tr>\r\n\r\n                                            <tr>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조정 계수</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\r\n                                                    ";
  private final static String _jspx_template88 = "\r\n\r\n                                                </td>   \r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">작년도 점용료</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    ";
  private final static String _jspx_template89 = " 원\r\n                                                </td>  \r\n                                            </tr>  \r\n\r\n                                            <tr>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">기본 산출식</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\r\n                                                    ";
  private final static String _jspx_template90 = "\r\n\r\n                                                </td>\r\n\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">현년도 점용료</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    ";
  private final static String _jspx_template91 = " 원\r\n                                                </td>    \r\n\r\n\r\n\r\n                                            </tr> \r\n                                            <tr>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조정 산출식</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    ";
  private final static String _jspx_template92 = "\r\n                                                </td> \r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조정 점용료</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    ";
  private final static String _jspx_template93 = " 원\r\n                                                </td> \r\n                                            </tr>\r\n                                            <tr>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">지분율 사유</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    ";
  private final static String _jspx_template94 = "\r\n                                                </td>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">지분율</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    ";
  private final static String _jspx_template95 = " %\r\n                                                </td> \r\n                                            </tr>\r\n                                            <tr>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">감면율 사유</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    ";
  private final static String _jspx_template96 = "\r\n                                                </td>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">감면율</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    ";
  private final static String _jspx_template97 = " %\r\n                                                </td> \r\n                                            </tr>\r\n                                            <tr>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">최종 산출식</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    ";
  private final static String _jspx_template98 = "\r\n                                                </td>\r\n                                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">최종 점용료</td>\r\n                                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                    ";
  private final static String _jspx_template99 = " 원\t\t\t\t\r\n                                                </td> \r\n\r\n                                            </tr> \r\n                                        </table></td>\r\n                                </tr>\r\n\r\n                                <tr>              \r\n                                    <td height=\"40\" align=\"right\">\r\n                                ";
  private final static String _jspx_template100 = "\r\n                                    <table border=\"0\" width=\"100%\">\r\n                                        <tr>\r\n                                            <td >\r\n                                                <img src=\"/img/add_icon.gif\" alt=\"추가\" border=\"0\" onclick=\"goAdd('";
  private final static String _jspx_template101 = "','";
  private final static String _jspx_template102 = "')\" style=\"cursor:pointer\" >  \t\t\t\t\t\t\t\t\t                \r\n                                            </td>\r\n                                        ";
  private final static String _jspx_template103 = "     \r\n                                            ";
  private final static String _jspx_template104 = "\r\n                                                <td width=\"50\">\r\n                                                    <img src=\"/img/mod_icon.gif\" alt=\"수정\" border=\"0\" onclick=\"javascript:goModify()\" style=\"cursor:pointer\" >\r\n                                                </td>\r\n                                                <td width=\"50\">\r\n                                                    <img src=\"/img/del_icon3.gif\" alt=\"삭제\" border=\"0\" onclick=\"javascript:goDelete()\" style=\"cursor:pointer\" >\r\n                                                </td>\r\n\r\n                                            ";
  private final static String _jspx_template105 = "\r\n                                        ";
  private final static String _jspx_template106 = "\t\t\t\t\t\t\t\t\t\t            \r\n                                        </tr>\r\n                                    </table>\r\n                                ";
  private final static String _jspx_template107 = "\r\n                                </td>\r\n                                </tr>\r\n                            </table>\r\n                        </div>\r\n                        <div id=\"edit\" style=\"width:100%;display:none;\">\r\n                            <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                                <tr>\r\n                                    <td><input style=\"float:right; font-size: 10.5px;\" class=\"sub_table_b\" type=\"button\" onclick=\"goLanprice()\" value=\"공시지가조회(서울 부동산정보조회 시스템)\">\r\n                                    \t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n                                            <tr>\r\n                                                <td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\"  style=\"direction:rtl\" >기준년도</td>\r\n                                                <td width=\"42%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                                <input id=\"YEAR\" name=\"YEAR\" type=\"text\" value = \"";
  private final static String _jspx_template108 = "\" style=\"width:50px;ime-mode:disabled;\"  class=\"input_form1\"  onKeyDown=\"onlyNumberInput();\" style=\"text-align:right\">&nbsp년</td>                     \r\n                                    <td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\"><span id=\"price_view3\" style=\"display:block;\">공시지가</span></td>\r\n                                    <td width=\"32%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >\t\t\t\t\t                       \t\t\t\t\t\t                   \t\t\t\t\t\t                   \r\n                                        <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"table_bl_left\">\r\n                                            <tr>\r\n                                                <td>\r\n                                                    <span id=\"price_img\" style=\"display:block;\">\r\n                                                    \t<input  id=\"PRICE\" name=\"PRICE\" value=\"";
  private final static String _jspx_template109 = "\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" onkeyup=\"javascript:fn_addComma(this)\"  onKeyDown=\"onlyNumberInput();\" style=\"text-align:right\">원\t \r\n                                                    \t<img src=\"/img/landPrice.gif\" alt=\"공시지가조회\" height=\"18\" border=\"0\" style=\"cursor:pointer\" onclick=\"javascript:openLandPricePopUp()\"; align=\"absmiddle\">\r\n                                                    </span>\r\n                                                </td>\r\n                                            </tr>\r\n                                        </table>\r\n                                    </td> \r\n                                </tr> \r\n\r\n\r\n\r\n                                <tr>\r\n                                    <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\"  >점용면적</td>\r\n                                    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" ><input id=\"AREA_AFTER\" name=\"AREA_AFTER\" type=\"text\" class=\"essential\" style=\"width:50px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template110 = "\"   onfocus=\"javascript:ShowMsgJumjiInsert(this)\" style=\"text-align:right\" readonly=\"readonly\">m / ㎡ / 개</td>                     \r\n                                <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">요율/단가</td>\r\n                                <td bgcolor=\"eaeaea\" class=\"table_bl_left\" ><input id=\"RATE\" name=\"RATE\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template111 = "\"  onKeyDown=\"onlyNumberInput();\" style=\"text-align:right\"></td> \r\n                                </tr>                   \r\n\r\n\r\n                                <tr>\r\n                                    <td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">산출기간</td>\r\n                                    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                                    \t<input id=\"FROMDATE\" name=\"FROMDATE\" type=\"text\" class=\"input_form1\" style=\"width:60px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template112 = "\"  onKeyDown=\"onlyNumberInput();\"   onKeyDown=\"onlyNumberInput();\" maxlength=8>\r\n                                    \t<img src=\"/img/calendar_icon.gif\" onclick=\"popUpCalendar(this, document.getElementById('FROMDATE'), 'yyyymmdd');\" style=\"vertical-align:middle;cursor:pointer\" >\r\n\t\t\t                            &nbsp;~&nbsp;\r\n\t\t\t                            <input id=\"TODATE\" name=\"TODATE\" type=\"text\" class=\"input_form1\" style=\"width:60px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template113 = "\"  onKeyDown=\"onlyNumberInput();\" maxlength=8>\r\n\t\t\t                            <img src=\"/img/calendar_icon.gif\" onclick=\"popUpCalendar(this, document.getElementById('TODATE'), 'yyyymmdd');\" style=\"vertical-align:middle;cursor:pointer\" >\r\n\t\t\t                            <img src=\"/img/cal_month.gif\" alt=\"달수계산\" height=\"18\" border=\"0\" style=\"vertical-align:middle;cursor:pointer\" onClick=\"javascript:calDate();\">\r\n                            \t\t</td>\r\n\r\n                    <td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">\r\n                        <select id=\"date_type\" class=\"input_form1\" onchange=\"javascript:calDate();\">\r\n                            <option value=\"month\">개월</option>\r\n                            <option value=\"day\">일</option>\r\n                        </select>수\r\n                    </td>\r\n                    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n                    \t<input name=\"PERIOD\" id =\"PERIOD\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value = \"";
  private final static String _jspx_template114 = "\"   onKeyDown=\"onlyNumberInput();\" style=\"text-align:right\">개월(일)\r\n                \t</td>\r\n\r\n                </tr>\r\n\r\n\r\n\r\n            </table>\r\n        </td></tr>\r\n\r\n    <tr>              \r\n        <td height=\"40\" align=\"right\">\r\n\r\n            <img src=\"/img/accou_icon.gif\" alt=\"계산\" width=\"56\" height=\"18\" border=\"0\" onclick=\"javascript:Calculate();\" style=\"cursor:pointer\">\r\n        </td>\r\n    </tr>\r\n\r\n    <tr><td>\r\n    <table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n        <tr>\r\n        \t<td colspan=\"4\" height=\"24\" align=\"right\" bgcolor=\"e5eff8\"><a style=\"font-weight: bold;\">↓작년도 조정점용료를 입력한 뒤 계산 해 주세요.</a></td>\r\n        </tr>\r\n        <tr>\r\n            <td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조정 계수</td>\r\n            <td width=\"42%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n            <input name=\"ADJUSTMENT\" id=\"ADJUSTMENT\" type=\"text\" class=\"input_form1\" style=\"width:120px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template115 = "\"   onKeyDown=\"onlyNumberInput();\" style=\"text-align:right\">\r\n        </td>                     \r\n        <td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">작년도 점용료</td>\r\n        <td width=\"32%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n    ";
  private final static String _jspx_template116 = "\r\n        <input name=\"SUM_LASTYEAR\" id=\"SUM_LASTYEAR\" type=\"text\"  class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template117 = "\"   onKeyDown=\"onlyNumberInput();\" onkeyup=\"javascript:fn_addComma(this)\" style=\"text-align:right\">원\r\n        <br><a style=\"font-size: 11px;\">(작년도 조정점용료를 직접 입력해 주세요.)</a></br>\r\n    ";
  private final static String _jspx_template118 = "\r\n</td>  \r\n\r\n\r\n</tr>  \r\n\r\n\r\n\r\n<tr>\r\n    <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">기본 산출식</td>\r\n    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n";
  private final static String _jspx_template119 = "                                        \r\n    <input name=\"FORM\" ID=\"FORM\" type=\"text\" class=\"input_form1\" style=\"width:300px\" value=\"";
  private final static String _jspx_template120 = "\">\r\n";
  private final static String _jspx_template121 = "\r\n</td>\r\n<td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">현년도 점용료</td>\r\n<td width=\"32%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n    <input name=\"SUM_YEAR\" id=\"SUM_YEAR\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template122 = "\"   onKeyDown=\"onlyNumberInput();\" onkeyup=\"javascript:fn_addComma(this)\" style=\"text-align:right\">원\r\n</td>                   \r\n\r\n\r\n</tr> \r\n\r\n<tr>\r\n    <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조정 산출식</td>\r\n    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n";
  private final static String _jspx_template123 = "                                                            \r\n    <input name=\"FORM_ADJUST\" id=\"FORM_ADJUST\" type=\"text\" class=\"input_form1\" style=\"width:300px\" value=\"";
  private final static String _jspx_template124 = "\">\r\n";
  private final static String _jspx_template125 = "\r\n</td> \r\n\r\n<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조정 점용료</td>\r\n<td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n";
  private final static String _jspx_template126 = "                    \r\n    <input name=\"SUM_ADJUST\" id=\"SUM_ADJUST\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template127 = "\"  onKeyDown=\"onlyNumberInput();\" onkeyup=\"javascript:fn_addComma(this)\" style=\"text-align:right\">원\r\n";
  private final static String _jspx_template128 = "\r\n</td> \r\n</tr>\r\n<tr>\r\n    <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">지분율 사유</td>\r\n    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n        <input name=\"PERCENT_REASON\" id=\"PERCENT_REASON\" type=\"text\" class=\"essential\" style=\"width:300px\" value=\"";
  private final static String _jspx_template129 = "\" onfocus=\"javascript:ShowMsgJumjiInsert(this)\" readonly=\"readonly\">\r\n    </td> \r\n    \r\n    <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">지분율</td>\r\n    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n        <input name=\"PERCENT_RATE\" id=\"PERCENT_RATE\" type=\"text\" class=\"essential\" style=\"width:50px;text-align:right\" value=\"";
  private final static String _jspx_template130 = "\" onfocus=\"javascript:ShowMsgJumjiInsert(this)\" readonly=\"readonly\">%\r\n    </td> \r\n</tr>\r\n<tr>\r\n    <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">감면율 사유</td>\r\n    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n        <input name=\"REDUCTION_REASON\" id=\"REDUCTION_REASON\" type=\"text\" class=\"essential\" style=\"width:300px\" value=\"";
  private final static String _jspx_template131 = "\" onfocus=\"javascript:ShowMsgJumjiInsert(this)\" readonly=\"readonly\">\r\n    </td> \r\n    \r\n    <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">감면율</td>\r\n    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n        <input name=\"REDUCTION_RATE\" id=\"REDUCTION_RATE\" type=\"text\" class=\"essential\" style=\"width:50px;text-align:right\" value=\"";
  private final static String _jspx_template132 = "\" onfocus=\"javascript:ShowMsgJumjiInsert(this)\" readonly=\"readonly\">%\r\n    </td> \r\n</tr>\r\n\r\n<tr>\r\n    <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">최종 산출식</td>\r\n    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n        <input name=\"REDUCTION_FORM\" id=\"REDUCTION_FORM\" type=\"text\" class=\"input_form1\" style=\"width:300px\" value=\"";
  private final static String _jspx_template133 = "\">\r\n    </td> \r\n\r\n    <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">최종 점용료</td>\r\n    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n        <input name=\"REDUCTION_SUM\" id=\"REDUCTION_SUM\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template134 = "\" onKeyDown=\"onlyNumberInput();\" onkeyup=\"javascript:fn_addComma(this)\" style=\"text-align:right\" >원\r\n    </td> \r\n</tr>  \r\n</table></td>\r\n</tr>\r\n\r\n<tr>              \r\n    <td height=\"40\" align=\"right\">\r\n";
  private final static String _jspx_template135 = "\r\n    <img src=\"/img/can_icon.gif\" alt=\"취소\" border=\"0\" onclick=\"javascript:history.back();\" style=\"cursor:pointer\" >\r\n    <img src=\"/img/save_icon2.gif\" alt=\"저장\" width=\"56\" height=\"18\" border=\"0\"\r\n         onClick=\"javascript:submitClick();\"  style=\"cursor:pointer\">\r\n";
  private final static String _jspx_template136 = "\r\n</td>\r\n</tr>\r\n</table>\t</div>\r\n\r\n\r\n</td>\r\n</tr>\r\n<tr>\r\n    <td height=\"10\">\r\n    </td>\r\n</tr>\r\n<tr>\r\n    <td>\r\n        <iframe width=\"100%\" height=\"100%\" id=\"tabUpSub1\" name=\"tabUpSub1\" frameborder=\"0\" onload=\"iFrameResize(this)\" scrolling=\"no\" src=\"/jumyong/inspectEdit.do?no=";
  private final static String _jspx_template137 = "&seq=";
  private final static String _jspx_template138 = "&SECTION=";
  private final static String _jspx_template139 = "\"></iframe>\r\n    </td>\r\n</tr>\r\n<tr>\r\n    <td height=\"10\">\r\n    </td>\r\n</tr>\r\n<tr>\r\n    <td>\r\n        <iframe width=\"100%\" height=\"100%\" id=\"tabUpSub2\" name=\"tabUpSub2\" frameborder=\"0\" onload=\"iFrameResize(this)\" scrolling=\"no\" src=\"/jumyong/confEdit.do?no=";
  private final static String _jspx_template140 = "&seq=";
  private final static String _jspx_template141 = "&SECTION=";
  private final static String _jspx_template142 = "\"></iframe>\r\n    </td>\r\n</tr>\r\n\r\n</table>\r\n\r\n\r\n</form>\r\n</body>\r\n</html>\r\n\r\n<script>\r\n    parent.document.getElementById('GONGSI_PRICE').value = '";
  private final static String _jspx_template143 = "';\r\n</script>";
}
