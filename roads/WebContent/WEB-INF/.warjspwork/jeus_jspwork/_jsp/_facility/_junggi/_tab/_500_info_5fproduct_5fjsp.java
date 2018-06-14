package jeus_jspwork._jsp._facility._junggi._tab;

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
      out.write(_jspx_template10);
      // jsp code [from=(251,72);to=(251,82)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${sum_adjust}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(251,108);to=(251,118)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${sum_adjust}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(306,16);to=(306,31)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${old_use_section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(308,9);to=(308,24)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${old_use_section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(325,18);to=(325,33)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${old_use_section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(329,18);to=(329,26)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${old_rate}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(330,21);to=(330,30)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${old_price}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      out.write(_jspx_template18);
      // jsp code [from=(501,36);to=(501,43)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${yearAdd}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      out.write(_jspx_template20);
      // jsp code [from=(679,59);to=(679,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${gu_code}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(680,59);to=(680,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${corp_cd}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(681,65);to=(681,83)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.REQUEST_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(682,63);to=(682,80)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.OBJECT_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // jsp code [from=(683,67);to=(683,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${cal_sum_seq}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);
      // jsp code [from=(684,51);to=(684,54)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template26);
      // jsp code [from=(687,67);to=(687,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // ----  spring:bind ---- //
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_0 = new org.springframework.web.servlet.tags.BindTag();
      _jspx_th_spring_bind_0.setPageContext(pageContext);
      _jspx_th_spring_bind_0.setPath("product.TAX_SET");
      try {
        try {
          int _jspx_eval_spring_bind_0 = _jspx_th_spring_bind_0.doStartTag();
          if (_jspx_eval_spring_bind_0 != Tag.SKIP_BODY) {
            do {
              org.springframework.web.servlet.support.BindStatus status = null;
              status = (org.springframework.web.servlet.support.BindStatus) pageContext.findAttribute("status");
              out.write(_jspx_template28);
              // jsp code [from=(689,60);to=(689,75)]
              out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.TAX_SET}",java.lang.String.class , pageContext.getVariableResolver(), null));

              out.write(_jspx_template29);

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

      out.write(_jspx_template30);
      // jsp code [from=(693,46);to=(693,61)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.SIGU_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template31);
      // jsp code [from=(694,44);to=(694,57)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.BJ_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template32);
      // jsp code [from=(695,45);to=(695,59)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.TAX_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template33);
      // jsp code [from=(696,46);to=(696,61)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.DEPT_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template34);
      // jsp code [from=(697,48);to=(697,65)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.TAX_GUBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template35);
      // jsp code [from=(698,46);to=(698,61)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.OBJ_SET}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template36);
      // jsp code [from=(699,50);to=(699,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.TAXPAYER_ID}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template37);
      // jsp code [from=(700,51);to=(700,71)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.TAXPAYER_SET}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template38);
      // jsp code [from=(701,50);to=(701,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.OCR_SIGU_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template39);
      // jsp code [from=(702,51);to=(702,71)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.OCR_BUSEO_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template40);
      // jsp code [from=(703,45);to=(703,59)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.TAX_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template41);
      // jsp code [from=(704,49);to=(704,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.MAX_TAX_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template42);
      // jsp code [from=(705,50);to=(705,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.CAL_SUM_SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template43);
      // jsp code [from=(706,43);to=(706,55)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.LIVE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template44);
      // jsp code [from=(707,43);to=(707,47)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mode}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template45);
      // jsp code [from=(708,43);to=(708,48)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${year }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template46);
      // jsp code [from=(709,46);to=(709,54)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${tax_set }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template47);
      // jsp code [from=(710,46);to=(710,53)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${message}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template48);
      // jsp code [from=(711,47);to=(711,56)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${listSize }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template49);
      // jsp code [from=(712,48);to=(712,57)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${listsSize}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template50);
      // jsp code [from=(713,52);to=(713,59)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${sigu_cd}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template51);
      // jsp code [from=(714,53);to=(714,68)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${taxation_check }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template52);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template69);
      // jsp code [from=(759,18);to=(759,35)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${strPageDivideForm}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template70);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_1_fn(pageContext, null)) return;


      out.write(_jspx_template111);
      // jsp code [from=(826,18);to=(826,35)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${strPageDivideForm}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template112);
      // ----  spring:bind ---- //
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_1 = new org.springframework.web.servlet.tags.BindTag();
      _jspx_th_spring_bind_1.setPageContext(pageContext);
      _jspx_th_spring_bind_1.setPath("product.YEAR");
      try {
        try {
          int _jspx_eval_spring_bind_1 = _jspx_th_spring_bind_1.doStartTag();
          if (_jspx_eval_spring_bind_1 != Tag.SKIP_BODY) {
            do {
              org.springframework.web.servlet.support.BindStatus status = null;
              status = (org.springframework.web.servlet.support.BindStatus) pageContext.findAttribute("status");
              out.write(_jspx_template113);
              // jsp code [from=(841,62);to=(841,70)]
              out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${yearVal1}",java.lang.String.class , pageContext.getVariableResolver(), null));

              out.write(_jspx_template114);

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

      out.write(_jspx_template115);
      // jsp code [from=(850,68);to=(850,81)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.PRICE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template116);
      // ----  spring:bind ---- //
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_2 = new org.springframework.web.servlet.tags.BindTag();
      _jspx_th_spring_bind_2.setPageContext(pageContext);
      _jspx_th_spring_bind_2.setPath("product.PRICE");
      try {
        try {
          int _jspx_eval_spring_bind_2 = _jspx_th_spring_bind_2.doStartTag();
          if (_jspx_eval_spring_bind_2 != Tag.SKIP_BODY) {
            do {
              org.springframework.web.servlet.support.BindStatus status = null;
              status = (org.springframework.web.servlet.support.BindStatus) pageContext.findAttribute("status");
              out.write(_jspx_template117);
              // jsp code [from=(852,65);to=(852,97)]
              out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.PRICE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

              out.write(_jspx_template118);

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

      out.write(_jspx_template119);
      // ----  spring:bind ---- //
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_3 = new org.springframework.web.servlet.tags.BindTag();
      _jspx_th_spring_bind_3.setPageContext(pageContext);
      _jspx_th_spring_bind_3.setPath("product.QUANTITY");
      try {
        try {
          int _jspx_eval_spring_bind_3 = _jspx_th_spring_bind_3.doStartTag();
          if (_jspx_eval_spring_bind_3 != Tag.SKIP_BODY) {
            do {
              org.springframework.web.servlet.support.BindStatus status = null;
              status = (org.springframework.web.servlet.support.BindStatus) pageContext.findAttribute("status");
              out.write(_jspx_template120);
              // jsp code [from=(862,128);to=(862,144)]
              out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.QUANTITY}",java.lang.String.class , pageContext.getVariableResolver(), null));

              out.write(_jspx_template121);

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

      out.write(_jspx_template122);
      // ----  spring:bind ---- //
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_4 = new org.springframework.web.servlet.tags.BindTag();
      _jspx_th_spring_bind_4.setPageContext(pageContext);
      _jspx_th_spring_bind_4.setPath("product.DEPTH_RATE");
      try {
        try {
          int _jspx_eval_spring_bind_4 = _jspx_th_spring_bind_4.doStartTag();
          if (_jspx_eval_spring_bind_4 != Tag.SKIP_BODY) {
            do {
              org.springframework.web.servlet.support.BindStatus status = null;
              status = (org.springframework.web.servlet.support.BindStatus) pageContext.findAttribute("status");
              out.write(_jspx_template123);
              // jsp code [from=(869,132);to=(869,150)]
              out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.DEPTH_RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

              out.write(_jspx_template124);

            } while (_jspx_th_spring_bind_4.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
          }
          if (_jspx_th_spring_bind_4.doEndTag() == Tag.SKIP_PAGE)
            return;
        } catch (Throwable t) {
          _jspx_th_spring_bind_4.doCatch(t);
        } finally {
          _jspx_th_spring_bind_4.doFinally();
        }
      } finally {
        _jspx_th_spring_bind_4.release();
      }

      out.write(_jspx_template125);
      // ----  spring:bind ---- //
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_5 = new org.springframework.web.servlet.tags.BindTag();
      _jspx_th_spring_bind_5.setPageContext(pageContext);
      _jspx_th_spring_bind_5.setPath("product.RATE");
      try {
        try {
          int _jspx_eval_spring_bind_5 = _jspx_th_spring_bind_5.doStartTag();
          if (_jspx_eval_spring_bind_5 != Tag.SKIP_BODY) {
            do {
              org.springframework.web.servlet.support.BindStatus status = null;
              status = (org.springframework.web.servlet.support.BindStatus) pageContext.findAttribute("status");
              out.write(_jspx_template126);
              // jsp code [from=(877,120);to=(877,132)]
              out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

              out.write(_jspx_template127);

            } while (_jspx_th_spring_bind_5.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
          }
          if (_jspx_th_spring_bind_5.doEndTag() == Tag.SKIP_PAGE)
            return;
        } catch (Throwable t) {
          _jspx_th_spring_bind_5.doCatch(t);
        } finally {
          _jspx_th_spring_bind_5.doFinally();
        }
      } finally {
        _jspx_th_spring_bind_5.release();
      }

      out.write(_jspx_template128);
      // ----  spring:bind ---- //
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_6 = new org.springframework.web.servlet.tags.BindTag();
      _jspx_th_spring_bind_6.setPageContext(pageContext);
      _jspx_th_spring_bind_6.setPath("product.FROMDATE");
      try {
        try {
          int _jspx_eval_spring_bind_6 = _jspx_th_spring_bind_6.doStartTag();
          if (_jspx_eval_spring_bind_6 != Tag.SKIP_BODY) {
            do {
              org.springframework.web.servlet.support.BindStatus status = null;
              status = (org.springframework.web.servlet.support.BindStatus) pageContext.findAttribute("status");
              out.write(_jspx_template129);
              // jsp code [from=(891,149);to=(891,165)]
              out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.FROMDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

              out.write(_jspx_template130);

            } while (_jspx_th_spring_bind_6.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
          }
          if (_jspx_th_spring_bind_6.doEndTag() == Tag.SKIP_PAGE)
            return;
        } catch (Throwable t) {
          _jspx_th_spring_bind_6.doCatch(t);
        } finally {
          _jspx_th_spring_bind_6.doFinally();
        }
      } finally {
        _jspx_th_spring_bind_6.release();
      }

      out.write(_jspx_template131);
      // ----  spring:bind ---- //
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_7 = new org.springframework.web.servlet.tags.BindTag();
      _jspx_th_spring_bind_7.setPageContext(pageContext);
      _jspx_th_spring_bind_7.setPath("product.TODATE");
      try {
        try {
          int _jspx_eval_spring_bind_7 = _jspx_th_spring_bind_7.doStartTag();
          if (_jspx_eval_spring_bind_7 != Tag.SKIP_BODY) {
            do {
              org.springframework.web.servlet.support.BindStatus status = null;
              status = (org.springframework.web.servlet.support.BindStatus) pageContext.findAttribute("status");
              out.write(_jspx_template132);
              // jsp code [from=(902,145);to=(902,159)]
              out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.TODATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

              out.write(_jspx_template133);

            } while (_jspx_th_spring_bind_7.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
          }
          if (_jspx_th_spring_bind_7.doEndTag() == Tag.SKIP_PAGE)
            return;
        } catch (Throwable t) {
          _jspx_th_spring_bind_7.doCatch(t);
        } finally {
          _jspx_th_spring_bind_7.doFinally();
        }
      } finally {
        _jspx_th_spring_bind_7.release();
      }

      out.write(_jspx_template134);
      // ----  spring:bind ---- //
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_8 = new org.springframework.web.servlet.tags.BindTag();
      _jspx_th_spring_bind_8.setPageContext(pageContext);
      _jspx_th_spring_bind_8.setPath("product.PERIOD");
      try {
        try {
          int _jspx_eval_spring_bind_8 = _jspx_th_spring_bind_8.doStartTag();
          if (_jspx_eval_spring_bind_8 != Tag.SKIP_BODY) {
            do {
              org.springframework.web.servlet.support.BindStatus status = null;
              status = (org.springframework.web.servlet.support.BindStatus) pageContext.findAttribute("status");
              out.write(_jspx_template135);
              // jsp code [from=(918,123);to=(918,137)]
              out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.PERIOD}",java.lang.String.class , pageContext.getVariableResolver(), null));

              out.write(_jspx_template136);

            } while (_jspx_th_spring_bind_8.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
          }
          if (_jspx_th_spring_bind_8.doEndTag() == Tag.SKIP_PAGE)
            return;
        } catch (Throwable t) {
          _jspx_th_spring_bind_8.doCatch(t);
        } finally {
          _jspx_th_spring_bind_8.doFinally();
        }
      } finally {
        _jspx_th_spring_bind_8.release();
      }

      out.write(_jspx_template137);
      // ----  spring:bind ---- //
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_9 = new org.springframework.web.servlet.tags.BindTag();
      _jspx_th_spring_bind_9.setPageContext(pageContext);
      _jspx_th_spring_bind_9.setPath("product.SUM_LASTYEAR");
      try {
        try {
          int _jspx_eval_spring_bind_9 = _jspx_th_spring_bind_9.doStartTag();
          if (_jspx_eval_spring_bind_9 != Tag.SKIP_BODY) {
            do {
              org.springframework.web.servlet.support.BindStatus status = null;
              status = (org.springframework.web.servlet.support.BindStatus) pageContext.findAttribute("status");
              out.write(_jspx_template138);
              // jsp code [from=(927,136);to=(927,156)]
              out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.SUM_LASTYEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

              out.write(_jspx_template139);

            } while (_jspx_th_spring_bind_9.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
          }
          if (_jspx_th_spring_bind_9.doEndTag() == Tag.SKIP_PAGE)
            return;
        } catch (Throwable t) {
          _jspx_th_spring_bind_9.doCatch(t);
        } finally {
          _jspx_th_spring_bind_9.doFinally();
        }
      } finally {
        _jspx_th_spring_bind_9.release();
      }

      out.write(_jspx_template140);
      // ----  spring:bind ---- //
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_10 = new org.springframework.web.servlet.tags.BindTag();
      _jspx_th_spring_bind_10.setPageContext(pageContext);
      _jspx_th_spring_bind_10.setPath("product.SUM_YEAR");
      try {
        try {
          int _jspx_eval_spring_bind_10 = _jspx_th_spring_bind_10.doStartTag();
          if (_jspx_eval_spring_bind_10 != Tag.SKIP_BODY) {
            do {
              org.springframework.web.servlet.support.BindStatus status = null;
              status = (org.springframework.web.servlet.support.BindStatus) pageContext.findAttribute("status");
              out.write(_jspx_template141);
              // jsp code [from=(933,128);to=(933,163)]
              out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.SUM_YEAR)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

              out.write(_jspx_template142);

            } while (_jspx_th_spring_bind_10.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
          }
          if (_jspx_th_spring_bind_10.doEndTag() == Tag.SKIP_PAGE)
            return;
        } catch (Throwable t) {
          _jspx_th_spring_bind_10.doCatch(t);
        } finally {
          _jspx_th_spring_bind_10.doFinally();
        }
      } finally {
        _jspx_th_spring_bind_10.release();
      }

      out.write(_jspx_template143);
      // ----  spring:bind ---- //
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_11 = new org.springframework.web.servlet.tags.BindTag();
      _jspx_th_spring_bind_11.setPageContext(pageContext);
      _jspx_th_spring_bind_11.setPath("product.SUM_ADJUST");
      try {
        try {
          int _jspx_eval_spring_bind_11 = _jspx_th_spring_bind_11.doStartTag();
          if (_jspx_eval_spring_bind_11 != Tag.SKIP_BODY) {
            do {
              org.springframework.web.servlet.support.BindStatus status = null;
              status = (org.springframework.web.servlet.support.BindStatus) pageContext.findAttribute("status");
              out.write(_jspx_template144);
              // jsp code [from=(939,132);to=(939,167)]
              out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.SUM_YEAR)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

              out.write(_jspx_template145);

            } while (_jspx_th_spring_bind_11.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
          }
          if (_jspx_th_spring_bind_11.doEndTag() == Tag.SKIP_PAGE)
            return;
        } catch (Throwable t) {
          _jspx_th_spring_bind_11.doCatch(t);
        } finally {
          _jspx_th_spring_bind_11.doFinally();
        }
      } finally {
        _jspx_th_spring_bind_11.release();
      }

      out.write(_jspx_template146);
      // ----  spring:bind ---- //
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_12 = new org.springframework.web.servlet.tags.BindTag();
      _jspx_th_spring_bind_12.setPageContext(pageContext);
      _jspx_th_spring_bind_12.setPath("product.ADJUSTMENT");
      try {
        try {
          int _jspx_eval_spring_bind_12 = _jspx_th_spring_bind_12.doStartTag();
          if (_jspx_eval_spring_bind_12 != Tag.SKIP_BODY) {
            do {
              org.springframework.web.servlet.support.BindStatus status = null;
              status = (org.springframework.web.servlet.support.BindStatus) pageContext.findAttribute("status");
              out.write(_jspx_template147);
              // jsp code [from=(947,131);to=(947,149)]
              out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.ADJUSTMENT}",java.lang.String.class , pageContext.getVariableResolver(), null));

              out.write(_jspx_template148);

            } while (_jspx_th_spring_bind_12.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
          }
          if (_jspx_th_spring_bind_12.doEndTag() == Tag.SKIP_PAGE)
            return;
        } catch (Throwable t) {
          _jspx_th_spring_bind_12.doCatch(t);
        } finally {
          _jspx_th_spring_bind_12.doFinally();
        }
      } finally {
        _jspx_th_spring_bind_12.release();
      }

      out.write(_jspx_template149);
      // ----  spring:bind ---- //
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_13 = new org.springframework.web.servlet.tags.BindTag();
      _jspx_th_spring_bind_13.setPageContext(pageContext);
      _jspx_th_spring_bind_13.setPath("product.TAX_DATE");
      try {
        try {
          int _jspx_eval_spring_bind_13 = _jspx_th_spring_bind_13.doStartTag();
          if (_jspx_eval_spring_bind_13 != Tag.SKIP_BODY) {
            do {
              org.springframework.web.servlet.support.BindStatus status = null;
              status = (org.springframework.web.servlet.support.BindStatus) pageContext.findAttribute("status");
              out.write(_jspx_template150);
              // jsp code [from=(961,149);to=(961,165)]
              out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.TAX_DATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

              out.write(_jspx_template151);

            } while (_jspx_th_spring_bind_13.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
          }
          if (_jspx_th_spring_bind_13.doEndTag() == Tag.SKIP_PAGE)
            return;
        } catch (Throwable t) {
          _jspx_th_spring_bind_13.doCatch(t);
        } finally {
          _jspx_th_spring_bind_13.doFinally();
        }
      } finally {
        _jspx_th_spring_bind_13.release();
      }

      out.write(_jspx_template152);
      // ----  spring:bind ---- //
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_14 = new org.springframework.web.servlet.tags.BindTag();
      _jspx_th_spring_bind_14.setPageContext(pageContext);
      _jspx_th_spring_bind_14.setPath("product.INDATE");
      try {
        try {
          int _jspx_eval_spring_bind_14 = _jspx_th_spring_bind_14.doStartTag();
          if (_jspx_eval_spring_bind_14 != Tag.SKIP_BODY) {
            do {
              org.springframework.web.servlet.support.BindStatus status = null;
              status = (org.springframework.web.servlet.support.BindStatus) pageContext.findAttribute("status");
              out.write(_jspx_template153);
              // jsp code [from=(976,145);to=(976,159)]
              out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.INDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

              out.write(_jspx_template154);

            } while (_jspx_th_spring_bind_14.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
          }
          if (_jspx_th_spring_bind_14.doEndTag() == Tag.SKIP_PAGE)
            return;
        } catch (Throwable t) {
          _jspx_th_spring_bind_14.doCatch(t);
        } finally {
          _jspx_th_spring_bind_14.doFinally();
        }
      } finally {
        _jspx_th_spring_bind_14.release();
      }

      out.write(_jspx_template155);
      // ----  spring:bind ---- //
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_15 = new org.springframework.web.servlet.tags.BindTag();
      _jspx_th_spring_bind_15.setPageContext(pageContext);
      _jspx_th_spring_bind_15.setPath("product.OVERDATE");
      try {
        try {
          int _jspx_eval_spring_bind_15 = _jspx_th_spring_bind_15.doStartTag();
          if (_jspx_eval_spring_bind_15 != Tag.SKIP_BODY) {
            do {
              org.springframework.web.servlet.support.BindStatus status = null;
              status = (org.springframework.web.servlet.support.BindStatus) pageContext.findAttribute("status");
              out.write(_jspx_template156);
              // jsp code [from=(993,149);to=(993,165)]
              out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.OVERDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

              out.write(_jspx_template157);

            } while (_jspx_th_spring_bind_15.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
          }
          if (_jspx_th_spring_bind_15.doEndTag() == Tag.SKIP_PAGE)
            return;
        } catch (Throwable t) {
          _jspx_th_spring_bind_15.doCatch(t);
        } finally {
          _jspx_th_spring_bind_15.doFinally();
        }
      } finally {
        _jspx_th_spring_bind_15.release();
      }

      out.write(_jspx_template158);
      // ----  spring:bind ---- //
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_16 = new org.springframework.web.servlet.tags.BindTag();
      _jspx_th_spring_bind_16.setPageContext(pageContext);
      _jspx_th_spring_bind_16.setPath("product.OVERTAX");
      try {
        try {
          int _jspx_eval_spring_bind_16 = _jspx_th_spring_bind_16.doStartTag();
          if (_jspx_eval_spring_bind_16 != Tag.SKIP_BODY) {
            do {
              org.springframework.web.servlet.support.BindStatus status = null;
              status = (org.springframework.web.servlet.support.BindStatus) pageContext.findAttribute("status");
              out.write(_jspx_template159);
              // jsp code [from=(1005,145);to=(1005,179)]
              out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(product.OVERTAX)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

              out.write(_jspx_template160);

            } while (_jspx_th_spring_bind_16.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
          }
          if (_jspx_th_spring_bind_16.doEndTag() == Tag.SKIP_PAGE)
            return;
        } catch (Throwable t) {
          _jspx_th_spring_bind_16.doCatch(t);
        } finally {
          _jspx_th_spring_bind_16.doFinally();
        }
      } finally {
        _jspx_th_spring_bind_16.release();
      }

      out.write(_jspx_template161);
      // ----  spring:bind ---- //
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_17 = new org.springframework.web.servlet.tags.BindTag();
      _jspx_th_spring_bind_17.setPageContext(pageContext);
      _jspx_th_spring_bind_17.setPath("product.FORM");
      try {
        try {
          int _jspx_eval_spring_bind_17 = _jspx_th_spring_bind_17.doStartTag();
          if (_jspx_eval_spring_bind_17 != Tag.SKIP_BODY) {
            do {
              org.springframework.web.servlet.support.BindStatus status = null;
              status = (org.springframework.web.servlet.support.BindStatus) pageContext.findAttribute("status");
              out.write(_jspx_template162);
              // jsp code [from=(1016,102);to=(1016,114)]
              out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.FORM}",java.lang.String.class , pageContext.getVariableResolver(), null));

              out.write(_jspx_template163);

            } while (_jspx_th_spring_bind_17.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
          }
          if (_jspx_th_spring_bind_17.doEndTag() == Tag.SKIP_PAGE)
            return;
        } catch (Throwable t) {
          _jspx_th_spring_bind_17.doCatch(t);
        } finally {
          _jspx_th_spring_bind_17.doFinally();
        }
      } finally {
        _jspx_th_spring_bind_17.release();
      }

      out.write(_jspx_template164);
      // ----  spring:bind ---- //
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_18 = new org.springframework.web.servlet.tags.BindTag();
      _jspx_th_spring_bind_18.setPageContext(pageContext);
      _jspx_th_spring_bind_18.setPath("product.FORM_ADJUST");
      try {
        try {
          int _jspx_eval_spring_bind_18 = _jspx_th_spring_bind_18.doStartTag();
          if (_jspx_eval_spring_bind_18 != Tag.SKIP_BODY) {
            do {
              org.springframework.web.servlet.support.BindStatus status = null;
              status = (org.springframework.web.servlet.support.BindStatus) pageContext.findAttribute("status");
              out.write(_jspx_template165);
              // jsp code [from=(1024,115);to=(1024,134)]
              out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.FORM_ADJUST}",java.lang.String.class , pageContext.getVariableResolver(), null));

              out.write(_jspx_template166);

            } while (_jspx_th_spring_bind_18.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
          }
          if (_jspx_th_spring_bind_18.doEndTag() == Tag.SKIP_PAGE)
            return;
        } catch (Throwable t) {
          _jspx_th_spring_bind_18.doCatch(t);
        } finally {
          _jspx_th_spring_bind_18.doFinally();
        }
      } finally {
        _jspx_th_spring_bind_18.release();
      }

      out.write(_jspx_template167);

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
            out.write(_jspx_template53);
            // ----  c:choose ---- invoke //
            if (_jspx_th_c_choose_0_fn(pageContext, _jspx_th_c_forEach_0)) return true;


            out.write(_jspx_template63);
            // jsp code [from=(746,43);to=(746,54)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template64);
            // jsp code [from=(747,31);to=(747,67)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(board.SUM_ADJUST) }",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template65);
            // jsp code [from=(748,31);to=(748,60)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(board.SUM) }",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template66);
            // jsp code [from=(749,31);to=(749,54)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.USE_SECTION_NAME }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template67);
            // jsp code [from=(750,31);to=(750,50)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TAX_SET_NAME }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template68);

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
            out.write(_jspx_template71);
            // ----  c:choose ---- invoke //
            if (_jspx_th_c_choose_1_fn(pageContext, _jspx_th_c_forEach_1)) return true;


            out.write(_jspx_template83);
            // jsp code [from=(791,43);to=(791,52)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${idx.count}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template84);
            // jsp code [from=(792,46);to=(792,59)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GU_CODE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template85);
            // jsp code [from=(792,63);to=(792,76)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.CORP_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template86);
            // ----  c:choose ---- invoke //
            if (_jspx_th_c_choose_2_fn(pageContext, _jspx_th_c_forEach_1)) return true;


            out.write(_jspx_template97);
            // jsp code [from=(801,31);to=(801,44)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SORT_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template98);
            // jsp code [from=(801,48);to=(801,61)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.KIND_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template99);
            // jsp code [from=(802,31);to=(802,45)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.QUANTITY}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template100);
            // jsp code [from=(803,31);to=(803,49)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TAX_SET_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template101);
            // jsp code [from=(804,34);to=(804,49)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.DEPTH_NUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template102);
            // jsp code [from=(805,34);to=(805,50)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.DEPTH_RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template103);
            // jsp code [from=(806,34);to=(806,52)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TAX_SET_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template104);
            // jsp code [from=(807,31);to=(807,66)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(board.SUM_ADJUST)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template105);
            // jsp code [from=(808,34);to=(808,56)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.USE_SECTION_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template106);
            // ----  c:if ---- invoke //
            if (_jspx_th_c_if_0_fn(pageContext, _jspx_th_c_forEach_1)) return true;


            out.write(_jspx_template108);
            // ----  c:if ---- invoke //
            if (_jspx_th_c_if_1_fn(pageContext, _jspx_th_c_forEach_1)) return true;


            out.write(_jspx_template110);

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
          out.write(_jspx_template54);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template58);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template62);

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
          out.write(_jspx_template72);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_1_fn(pageContext, _jspx_th_c_choose_1)) return true;


          out.write(_jspx_template77);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_1_fn(pageContext, _jspx_th_c_choose_1)) return true;


          out.write(_jspx_template82);

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
          out.write(_jspx_template87);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_2_fn(pageContext, _jspx_th_c_choose_2)) return true;


          out.write(_jspx_template92);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_2_fn(pageContext, _jspx_th_c_choose_2)) return true;


          out.write(_jspx_template96);

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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SUM_ADJUST != null }", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template107);

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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SUM_ADJUST == null }", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
      if (_jspx_eval_c_if_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template109);

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
    _jspx_th_c_when_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SEQ != cal_sum_seq }", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
      if (_jspx_eval_c_when_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template55);
          // jsp code [from=(738,42);to=(738,51)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template56);
          // jsp code [from=(738,57);to=(738,68)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR }",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template57);

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
          out.write(_jspx_template59);
          // jsp code [from=(742,45);to=(742,54)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template60);
          // jsp code [from=(742,60);to=(742,71)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR }",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template61);

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
          out.write(_jspx_template73);
          // jsp code [from=(784,39);to=(784,48)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template74);
          // jsp code [from=(784,54);to=(784,65)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR }",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template75);
          // jsp code [from=(784,71);to=(784,87)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.CAL_STATUS}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template76);

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
          out.write(_jspx_template78);
          // jsp code [from=(787,43);to=(787,52)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template79);
          // jsp code [from=(787,58);to=(787,69)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR }",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template80);
          // jsp code [from=(787,75);to=(787,91)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.CAL_STATUS}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template81);

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
          out.write(_jspx_template88);
          // jsp code [from=(795,43);to=(795,54)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR }",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template89);
          // jsp code [from=(795,60);to=(795,76)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.REQUEST_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template90);
          // jsp code [from=(795,82);to=(795,104)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.USE_SECTION_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template91);

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
          out.write(_jspx_template93);
          // jsp code [from=(798,43);to=(798,54)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR }",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template94);
          // jsp code [from=(798,60);to=(798,82)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.USE_SECTION_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template95);

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
  
  static {
    _jspx_fnmap_0 = jeus.servlet.jsp.el.FunctionMapperImpl.getInstance();
    _jspx_fnmap_0.mapFunction("rnic:insertComma2", main.java.common.util.StringUtil.class, "insertComma2", new Class[] {java.lang.String.class});

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
  private final static String _jspx_template9 = "    \r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n<script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script> \r\n<script><!--\r\n\t\r\n\r\n\tfunction InitPage()\r\n\t{\r\n\t\t// 산출단가 있을 경우 공시지가 못넣도록 막기\r\n\t\tif( document.productForm.RATE.value != '' ){\r\n\t\t\tdocument.productForm.PRICE.disabled = true;\r\n\t\t\tdocument.getElementById(\"priceButton\").style.display = \"none\";\r\n\t\t}\r\n\t\t\r\n\t\t// equip_taxation_info 테이블에 넣을 정보 보이기 \t\t\r\n\t\tvar taxationCheck = document.getElementById(\"taxationCheck\");\r\n\t\tvar taxationCheck2 = document.getElementById(\"taxationCheck2\");\r\n\t\t\r\n\t\tif( document.productForm.listSize.value == '1' || document.productForm.mode.value == 'edit' ){\r\n\t\t\ttaxationCheck.style.display = \"block\";\r\n\t\t\ttaxationCheck2.style.display = \"block\";\r\n\t\t\t\r\n\t\t}else if( document.productForm.taxation_check.value == '1' ){\r\n\t\t\ttaxationCheck.style.display = \"block\";\r\n\t\t\ttaxationCheck2.style.display = \"block\";\r\n\t\t\t\r\n\t\t}else{\r\n\t\t\ttaxationCheck.style.display = \"none\";\r\n\t\t\ttaxationCheck2.style.display = \"none\";\r\n\t\t}\r\n\t\t\r\n\t\t//var overtax = document.getElementById(\"OVERTAX\");\r\n\t\t/*if( document.productForm.mode.value == 'edit' ){\r\n\t\t\tovertax.style.display = \"none\";\r\n\t\t}else{\r\n\t\t\tovertax.style.display = \"none\";\r\n\t\t}*/\r\n\t\t\r\n\t}\r\n\t\r\n\t\r\n\t/*\r\n\tfunction calDate()\r\n\t{\r\n\t\t\r\n\t\tvar fromDate = removeDash(document.getElementById(\"FROMDATE\").value);\r\n\t\tvar toDate = removeDash(document.getElementById(\"TODATE\").value);\r\n//\t\tvar dateCount = 0;\r\n\t\t\r\n\t\tvar period = getDiffMon(fromDate,toDate)  ;\r\n\t\t\t\r\n\t\tdocument.getElementById(\"period\").value = period;\r\n\t\t\r\n\t\tvar fromDay1 = new Date(fromDate.substr(0,4),Number(fromDate.substr(4,2))-1,fromDate.substr(6,2))\r\n\t\t\r\n\t\tvar toDay1 = new Date(toDate.substr(0,4),Number(toDate.substr(4,2))-1,toDate.substr(6,2))\t\t\r\n\t\t\r\n//\t\tvar dateCount =(toDay1 - fromDay1)/(1000*3600*24)+1;  \r\n//\t\tdocument.getElementById(\"dateCount\").value = dateCount;\r\n\t}\t*/\r\n\r\n\tfunction calDate()\r\n\t{\r\n\t\tvar fromDate = removeDash(document.getElementById(\"FROMDATE\").value);\r\n\t\tvar toDate = removeDash(document.getElementById(\"TODATE\").value);\r\n\t\r\n//\t\tvar dateCount = 0;\r\n\t\tif(fromDate>toDate){\r\n\t\t\talert(\"시작날짜 종료날짜보다 더늦게 설정 할 수 없습니다.\");\r\n\t\t\tdocument.getElementById(\"FROMDATE\").value=\"\";\r\n\t\t\tdocument.getElementById(\"TODATE\").value=\"\";\r\n\t\t\treturn;\r\n\t\t}\r\n\t\r\n\t\tvar period = getDiffMon(fromDate,toDate)  ;\r\n\t\t\r\n\t\tdocument.getElementById(\"period\").value = period;\r\n\t\t\r\n\t\tvar fromDay1 = new Date(fromDate.substr(0,4),Number(fromDate.substr(4,2))-1,fromDate.substr(6,2))\r\n\t\t\r\n\t\tvar toDay1 = new Date(toDate.substr(0,4),Number(toDate.substr(4,2))-1,toDate.substr(6,2))\t\t\r\n\t\t\r\n//\t\tvar dateCount =(toDay1 - fromDay1)/(1000*3600*24)+1;  \r\n\t\t\r\n//\t\tdocument.getElementById(\"dateCount\").value = dateCount;\r\n\t}\t\r\n\t\r\n\t// 대쉬 삭제\r\n\tfunction removeDash(numValue)\r\n\t{\r\n\t\treturn numValue.split('-').join(\"\");\r\n\t}\r\n\t\r\n\t\t//달 차이 계산\r\n\t\t/*\r\n\tfunction getDiffMon(val1,val2)\r\n\t{\r\n\t\r\n\t    var sdate = new Date(Number(val1.substr(0,4)),Number(val1.substr(4,2))-1,Number(val1.substr(6,2)));\r\n\t    var edate = new Date(Number(val2.substr(0,4)),Number(val2.substr(4,2))-1,Number(val2.substr(6,2)));\r\n\t    \r\n\t   \r\n\t\r\n\t    var sDate  = sdate.getDate();     \t\r\n\t    var count=0;\r\n\t    \r\n\t    edate.setDate(edate.getDate()+1);\r\n\t    \r\n//\t     alert(sdate+\"   \"+edate);\r\n\t    \r\n\t    while (Date.parse(edate)>=Date.parse(sdate)) {\r\n\t        if(sdate.getDate() == sDate){ //해당 요일과 같다면...\r\n\t          count++;\r\n\t        }\r\n\t      sdate.setDate(sdate.getDate()+1); //요일을 계속 증가\r\n\t    }\r\n\t    return count-1;\r\n\t}\r\n\t*/\r\n\t\r\n\r\n\tfunction getDiffMon(val1,val2)\r\n\t{   \r\n\t\t// 날짜 입력 형식 : yyyy-mm-dd\r\n\t    var sdate_year = Number(val1.substr(0,4));\r\n\t    var sdate_month = Number(val1.substr(4,2));\r\n\t    var sdate_day = Number(val1.substr(6,2));\r\n\t    var edate_year = Number(val2.substr(0,4));\r\n\t   ";
  private final static String _jspx_template10 = " var edate_month = Number(val2.substr(4,2));\r\n\t    var edate_day = Number(val2.substr(6,2));\r\n\t    \r\n\t    var year = edate_year - sdate_year;\t\t\t//년차이를 계산하고\r\n\t    var month = edate_month - sdate_month -1;\t//달차이를 계산하고  \r\n\r\n\t    var month_count = 0;\r\n\t    \r\n\t    if(sdate_day <= edate_day){\t\t\t\t\t\r\n\t    \tif(sdate_day>=30 && edate_day>=30 && sdate_month!=edate_month){\t\t// 예시) 8월31일 시작 9월 30일 종료 일때 달수 +1 증가\r\n\t    \t\tmonth_count++;\r\n\t    \t}else{\t\t//시작일자가 종료일자보다 작으면 달수 +1 증가\r\n\t    \t\tmonth_count++;\r\n\t    \t}\r\n\t    \t\r\n\t    }\r\n\t    \r\n\t    if(sdate_month==2 && edate_month==2 && sdate_day<edate_day && sdate_day==1){\t// 2월이 좀 특수한 관계로 2월1일부터 2월 말일 일때 달계산\r\n\t    \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t// 시작일자가 1이고 \r\n\t    \tif ((edate_year % 4 == 0 && edate_year % 100 != 0) || edate_year % 400 == 0){\t//윤달 여부에 관련해서 \r\n\t    \t\tif(edate_day==29)\t\t//윤달이면 마지막 날짜가 29일일때 달수 +1 증가\r\n\t    \t\t\tmonth_count++;\r\n\t    \t}else{\r\n\t    \t\tif(edate_day==28)\t\t//윤달이 아니면 마지막 날짜가 28일때 +1증가\r\n\t    \t\t\tmonth_count++;\r\n\t    \t}\t\t\r\n\t    }\r\n\t    \r\n\t    if(sdate_month==edate_month && sdate_day==1 && edate_day>=30){\t// 각달의 1일부터 말일 일때 달수 +1 증가\r\n\t    \tmonth_count++;\r\n\t    }\r\n\t    \r\n\t    if(sdate_day==1 && edate_day>=30 && sdate_month!=edate_month){\t\t// 시작일자가 1일이고 끝나는 날짜가 30일 이상이면 달수 +1 증가\r\n\t    \tmonth_count++;\r\n\t    }\r\n\t    \r\n\t    month_count = month_count + (year*12) + month;\t//최종적으로 달수 계산\r\n\t    \r\n\t    return month_count;\r\n\t}\r\n\t\r\n\tfunction Calculate()\r\n\t{\r\n\t\tcalDate();\r\n\t\tvar quantity = document.getElementById(\"QUANTITY\").value;\r\n\t\tvar depth_rate = document.getElementById(\"DEPTH_RATE\").value;\r\n\t\tvar rate = document.getElementById(\"RATE\").value;\r\n\t\tvar period = document.getElementById(\"PERIOD\").value;\r\n\t\tvar form_adjust = document.getElementById(\"FORM_ADJUST\").value;\r\n\t\tvar sum_adjust = document.getElementById(\"SUM_ADJUST\").value;\r\n\t\tvar mode = document.getElementById(\"mode\").value;\r\n\t\t\r\n//\t\tdocument.getElementById(\"SUM_ADJUST\").value = Number(quantity) * (100-Number(depth_rate))/100*Number(rate)*Number(period)/12;\r\n//\t\tdocument.getElementById(\"FORM_ADJUST\").value = quantity+ \" * \" + \" (100-\"+Number(depth_rate)+\" )/100*\"+ Number(rate)+\" * \"+ Number(period)+\" /12 \";\r\n//\t\tdocument.getElementById(\"SUM_YEAR\").value = Number(quantity) * (100-Number(depth_rate))/100*Number(rate)*Number(period)/12;\r\n\t\t\r\n\t\tdocument.getElementById(\"FORM\").value = quantity+ \" * \" + \" (100-\"+Number(depth_rate)+\" )/100*\"+ Number(rate)+\" * \"+ Number(period)+\" /12 \";\r\n\t\t\r\n\t\t//현년도 점용료 계산\r\n\r\n\t\tvar sum_year = Number(quantity) * (100-Number(depth_rate))/100*Number(rate)*Number(period)/12;\t\t\t\r\n\r\n        var strSUM_ADJUST = String( Math.floor(sum_year)); // 소수점 제거        \r\n\t    sum_year = parseInt(strSUM_ADJUST); \t//100원 절삭\r\n\t    //sum_year = Math.floor(Number(strSUM_ADJUST) / 100) * 100;\r\n\t\t\t\r\n\t\tdocument.getElementById(\"SUM_YEAR\").value = sum_year;\t\t\r\n\t\tinsertComma(\"SUM_YEAR\");\r\n\t\t\r\n\t\t//현년도 점용료 계산 끝\r\n\t\t\r\n\t\t\r\n\t\t//조정 계수 및 조정 점용료 계산\r\n\t\t//var sum_lastyear = document.getElementById(\"SUM_LASTYEAR\").value;\r\n\t\tvar tempval = 0;\r\n\t\t\r\n\t\t//var sum_year = document.getElementById(\"SUM_YEAR\").value;\r\n\t\t/*if(sum_lastyear >0)//작년도 점용료가 있을때\r\n\t\t{\r\n\t\t\tvar rate1 = Math.floor((sum_year - sum_lastyear ) / sum_lastyear *100 ); // 현년도 작년도 점용료 비율\r\n\t\t\t\r\n\t\t\tif( rate1 >= 10 && rate1 <=1000)//비율이 허용 범위내에 있을때\r\n\t\t\t{\r\n\t\t\t\r\n\t\t\t\tdocument.getElementById(\"rate1\").value = rate1;\t\t\t\r\n\t\t\t\t\r\n\t\t\t\talert(\"rate1=\"+rate1);\r\n\t\r\n\t\t\t\tgetRateAjax(rate1);\r\n\t\t\t\t\r\n\t\t\t\ttempval = 1;\r\n\t\t\t}\r\n\t\t}*/\r\n\t\t\r\n\t\tif(tempval == 0) // 작년도 점용료가 없거나 비율에 해당하지 않을때\r\n\t\t{\r\n\t\t\tdocument.getElementById(\"ADJUSTMENT\").value = \"1\";\r\n\t\t\tdocument.getElementById(\"SUM_ADJUST\").value = document.getElementById(\"SUM_YEAR\").value;\r\n\t\t\tdocument.getElementById(\"FORM_ADJUST\").value = document.getElementById(\"FORM\").value+\" X 1\";\r\n\t\t\t\r\n\t\t\t\r\n\t\t\t// 납기후 금액\r\n\t\t\tif( document.productForm.taxation_check.value == '1' ){\r\n\t\t\t\tdocument.getElementById(\"OVERTAX\").value =  Math.floor((  Number(sum_year) * 3.0 / 100 + Number(sum_year) ) /100 ) * 100 ;\r\n\t\t   \t \tinsertComma(\"OVERTAX\");\r\n\t\t\t}\r\n\t\t\tif( mode == 'edit'){\r\n\t\t\t\tdocument.getElementById(\"OVERTAX\").value =  Math.floor((  Number(";
  private final static String _jspx_template11 = ") * 3.0 / 100 + Number(";
  private final static String _jspx_template12 = ") ) /100 ) * 100 ;\r\n\t\t\t\tinsertComma(\"OVERTAX\");\r\n\t\t\t}\r\n\t\t}\r\n\r\n\t}\r\n\t\r\n\t// 콤마 삽입\r\n\tfunction insertComma(val1)\r\n\t{\r\n\t\r\n\t\tvalue1 = document.getElementById(val1).value;\r\n\t\t\r\n\t\tvar length1 = value1.length;\t\t\r\n\t\tvar divideNum = length1%3;\r\n\t\tvar returnValue2 =\"\";\r\n\t\t\r\n\t\tif(divideNum != 0)\r\n\t\t{\r\n\t\t\treturnValue2 = value1.substr(0,divideNum)+\",\";\r\n\t\t}\r\n\t\t\r\n\t\tif(length1 >3)\r\n\t\t{\r\n\t\t\twhile(true)\r\n\t\t\t{\r\n\t\t\t\treturnValue2 = returnValue2 + value1.substr(divideNum,3)+\",\";\r\n\t\t\t\t\r\n\t\t\t\tdivideNum = divideNum+3;\r\n\t\t\t\tif(length1 <= divideNum)\r\n\t\t\t\t\tbreak;\r\n\t\t\t}\r\n\t\t}\r\n\t\t\r\n\t\tif(returnValue2 == \"\")\r\n\t\t\treturnValue2 = value1;\r\n\t\telse\r\n\t\t\treturnValue2 = returnValue2.substr(0,returnValue2.length - 1);\r\n\r\n\t\tdocument.getElementById(val1).value = returnValue2;\r\n\t}\r\n\t\r\n\tfunction adjustCalculation()\r\n\t{\r\n\t\r\n\t\t/*var adjust = document.getElementById(\"ADJUSTMENT\").value;\r\n\t\tvar sum_lastyear =document.getElementById(\"SUM_LASTYEAR\").value;\r\n\t\tvar SUM_ADJUST = Number( sum_lastyear)*Number(adjust);\r\n        var strSUM_ADJUST = String( Math.floor(SUM_ADJUST));\r\n\t\t\r\n\t\tdocument.getElementById(\"SUM_ADJUST\").value = SUM_ADJUST;\r\n\t    document.getElementById(\"FORM_ADJUST\").value = sum_lastyear + \"원 X \"+ adjust;*/\r\n\t    \r\n\t    var adjust = document.getElementById(\"ADJUSTMENT\").value;\r\n\t               \r\n  \t\t//alert('";
  private final static String _jspx_template13 = "');\r\n    \t\t\r\n\t\tif('";
  private final static String _jspx_template14 = "' == '1')\r\n            \t\t{\r\n             \r\n        \t// var sum_year = removeComma(document.getElementById(\"sum_year\").value);\r\n\t\t\tvar sum_lastyear =document.getElementById(\"SUM_YEAR\").value;\r\n\t\t\tvar SUM_ADJUST = Number( removeComma(sum_lastyear))*Number(adjust);\r\n\t\t\tvar strSUM_ADJUST = String( Math.floor(SUM_ADJUST));\r\n\t\t   \tSUM_ADJUST = parseInt(strSUM_ADJUST); //100원 절삭\r\n\t\t   \tdocument.getElementById(\"SUM_ADJUST\").value = SUM_ADJUST;\r\n\t\t   \tdocument.getElementById(\"FORM_ADJUST\").value = sum_lastyear + \"원 X \"+ adjust;\r\n\t\t   \r\n\t\t   \t// 납기후 금액\r\n\t\t   \tif( document.productForm.taxation_check.value == '1' ){\r\n\t\t\t \tdocument.getElementById(\"OVERTAX\").value =  Math.floor((  Number(SUM_ADJUST) * 3.0 / 100 + Number(SUM_ADJUST) ) /100 ) * 100 ;\r\n\t\t \t\t//insertComma(\"OVERTAX\");\r\n\t \t\t}\r\n\t\t   \r\n\t   \t}else if('";
  private final static String _jspx_template15 = "' == '2')\r\n\t   \t{\r\n\t   \t\t//작년도 1년치 점용료가 없으므로 새로 구함\r\n\r\n\t\t\tvar rate = '";
  private final static String _jspx_template16 = "';\r\n\t\t\t//var price = '";
  private final static String _jspx_template17 = "';\r\n\t\t\tvar price = removeComma(document.getElementById(\"PRICE\").value);\r\n\t\t\tvar area_after = document.getElementById(\"AREA_AFTER\").value;\r\n\t\t\t\r\n\t\t\tvar strSUM_ADJUST = String( Math.floor(SUM_ADJUST));\r\n\r\n\t\t\t//현년도 점용료 계산\r\n\t\t\tvar SUM_ADJUST = Number(area_after)*12/12*Number(rate)*Number(price)*Number(adjust);\t\t\t\r\n\t        var strSUM_ADJUST = String( Math.floor(SUM_ADJUST)); // 소수점 제거        \r\n\t        \r\n\t\t    SUM_ADJUST = parseInt(strSUM_ADJUST); //100원 절삭\r\n\t\t\tdocument.getElementById(\"SUM_ADJUST\").value = SUM_ADJUST;\r\n\t\t   \tdocument.getElementById(\"FORM_ADJUST\").value = area_after+\"㎡ X 12/12 개월 X \" +rate +\" X \" +insertComma2(price)+\" X \"+adjust ;\r\n\t\t   \t\r\n\t\t   \t// 납기후 금액\r\n\t\t   \tif( document.productForm.taxation_check.value == '1' ){\r\n\t\t\t   \tdocument.getElementById(\"OVERTAX\").value =  Math.floor((  Number(SUM_ADJUST) * 3.0 / 100 + Number(SUM_ADJUST) ) /100 ) * 100 ;\r\n\t\t   \t\t//insertComma(\"OVERTAX\");\r\n\t\t   \t}\r\n\t\t   \t\r\n\t   }\t\t\r\n\t}\r\n\t\r\n\t\r\n\t\r\n\t function getRateAjax(addSum)\r\n     {\r\n\r\n        var params = 'addsum='+addSum;\r\n\t\tvar url = \"/getRate.do\" ;\r\n        var a = sendRequest1(url, params, rateFromServer, \"Post\");  // rateFromServer 함수에 rate 를 받아오게함\r\n     } \r\n     \r\n     \r\n     function rateFromServer()\r\n       {      \r\n           if(httpRequest.readyState == 4)\r\n           {\r\n               if(httpRequest.status == 200)\r\n               {               \r\n\t               //조정점용료 계산\r\n\t\t\t\t   var adjust = httpRequest.responseText; //조정 계수를 받아옴.\r\n\r\n\t\t\t\t   document.getElementById(\"ADJUSTMENT\").value = adjust;\r\n\t\t\t\t   \r\n\t\t\t\t   adjustCalculation();\r\n\t\t\t\t\t\r\n\t               delete httpRequest;\r\n               }else\r\n               {\r\n\t\t\t\t   delete httpRequest;\r\n               }\r\n               \r\n\r\n               \r\n           }else\r\n           {\r\n           }\r\n       }\r\n     \r\n     \r\n     \r\n     //xml js부분\r\n\tfunction getXMLRequest()\r\n\t{\t\r\n\t    if(window.ActiveXObject)\t\r\n\t    {\t\r\n\t       try\t\r\n\t       {\t\r\n\t           return new ActiveXObject(\"MSXML2.XMLHttp\");\t\r\n\t       }\t\r\n\t       catch(e)\t\r\n\t       {\r\n\t           try{\r\n\t              return new ActiveXObject(\"Microsoft.XMLHttp\");\t\r\n\t            }\r\n\t           catch(e)\r\n\t           {\r\n\t              return null;\r\n\t           }\r\n\t       }\r\n\t    }\r\n\t    else if(window.XMLHttpRequest)\t\r\n\t    {\t\r\n\t       return new XMLHttpRequest();\t\r\n\t    }\t\r\n\t    else\t\r\n\t    {\t\r\n\t       return null;\t\r\n\t    }\t\r\n\t}\t \r\n\t\r\n\tvar httpRequest = null;\t \r\n\t\r\n\t//매개변수: 서버쪽 페이지, 보내는 쿼리문, 서버에서 보내는 자료를 받는 함수, 전송방식\r\n\t\r\n\tfunction sendRequest1(url, params, callback, method)\t\r\n\t{\t\r\n\t   httpRequest = getXMLRequest();\r\n\t\r\n\t    //쿼리의 전달방식이 전달이 되었는지 확인한다. 만약 전달이 안되었다면\t\r\n\t    //GET방식으로 전달하도록 한다.\r\n\t\r\n\t    var httpMethod =  method ? method:\"GET\";\r\n\t\r\n\t    if(httpMethod != \"GET\" && httpMethod !=\"POST\")\t\r\n\t    {\r\n\t       httpMethod = \"GET\";\r\n\t    }\r\n\r\n\t    //현재 쿼리를 전달할 주소를 받는다.\t\r\n\t    var httpParams = (params==null || params ==\"\")?null:params;\t\r\n\t    var httpUrl = url;\t\r\n\t    if(httpMethod ==\"GET\" && params !=null)\t\r\n\t    {\t\r\n\t       httpUrl =httpUrl +\"?\"+httpParams;\r\n\t    }\r\n\t    httpRequest.open(httpMethod,httpUrl,true);\r\n\t    httpRequest.setRequestHeader(\"Content-Type\",\"application/x-www-form-urlencoded\");\r\n\t\r\n\t    //onreadystatechange로 서버와 클라인트의 상태를 감지하여 변화가 있을시\r\n\t\r\n\t    httpRequest.onreadystatechange = callback;\r\n\t\r\n\t    httpRequest.send(httpMethod==\"POST\" ? httpParams:null);   \t\r\n\t}\t\r\n\t\r\n\t\r\n\t\r\n\t//ajax js 끝\r\n     \r\n     \r\n     \r\n\t\r\n\tfunction goview(seq, year, cal_status)\r\n\t{\r\n\t\tvar gu_code= document.getElementById(\"gu_code\").value;\r\n\t\tvar corp_cd = document.getElementById(\"corp_cd\").value;\r\n\t\tvar request_no= document.getElementById(\"request_no\").value;\r\n\r\n\t\tvar currentPage= document.getElementById(\"currentPage\").value;\r\n\t\t\r\n\t\t//var year = document.getElementById(\"year\").value;\r\n\t\tvar tax_set = document.getElementById(\"tax_set\").value;\r\n\t\tvar object_no = document.getElementById(\"object_no\").value;\r\n\t\tvar mode = document.getElementById(\"mode\").value;\r\n\t\tvar seq = document.getElementById(\"SEQ\").value;\r\n\t\tvar cal_sum_seq = document.getElementById(\"cal_sum_seq\").value;\r\n\t\tvar sigu_cd = document.getElementById(\"sigu_cd\").value;\r\n\r\n\r\n";
  private final static String _jspx_template18 = "\r\n\t\tlocation.href=\"/facility/junggi/product_view.do?GU_CODE=\"+gu_code+\"&CORP_CD=\"+corp_cd\r\n\t\t+\"&REQUEST_NO=\"+request_no+\"&currentPage=\"+currentPage+\"&SEQ=\"+seq+\"&cal_sum_seq=\"+cal_sum_seq+\"&year=\"+year\r\n\t\t+\"&tax_set=\"+tax_set+\"&cal_status=\"+cal_status;\r\n\t\t\r\n\t\t\r\n\t\t//location.href=\"/facility/junggi/product_insert.do?GU_CODE=\"+gu_code+\"&CORP_CD=\"+corp_cd\r\n\t\t//+\"&REQUEST_NO=\"+request_no+\"&currentPage=\"+currentPage+\"&OBJECT_NO=\"+object_no+\"&mode=\"+mode+\"&SEQ=\"+seq+\"&cal_sum_seq=\"+cal_sum_seq+\"&YEAR=\"+year\r\n\t\t//+\"&tax_set=\"+tax_set+\"&sigu_cd=\"+sigu_cd;\r\n\t\t\r\n\t}\r\n\t\r\n\t\r\n\r\n\t\r\n\r\n\tfunction submitClick()\r\n\t{\r\n\t\tvar productForm = document.productForm;\r\n\t\t\r\n\t\tif( productForm.mode.value == 'add' ){\r\n\t\t\tif( productForm.YEAR.value > '";
  private final static String _jspx_template19 = "' ){\r\n\t\t\t\talert(\"정기분 산출은 다음년도만 부과 가능합니다. 확인해주세요. \");\r\n\t\t\t\tproductForm.YEAR.focus();\r\n\t\t\t\treturn;\r\n\t\t\t\t/*if( confirm(\"해당년도를 수정하시겠습니까? \") ){\r\n\t\t\t\t\tlocation.href = \"/facility/junggi/product_insert.do? \";\r\n\t\t\t\t}*/\r\n\t\t\t}\t\r\n\t\t}\r\n\t\tif(\tproductForm.YEAR.value == '0' || productForm.YEAR.value == '' ){\r\n\t\t\talert(\"부과년도를 넣어주세요.\");\r\n\t\t\tproductForm.YEAR.focus();\r\n\t\t\treturn;\r\n\t\t}\t\t\r\n\t\tif( productForm.FORM_ADJUST.value == '' ){\r\n\t\t\talert(\"계산을 먼저 해주세요. \");\r\n\t\t\treturn;\r\n\t\t}\r\n\t\tif( productForm.RATE.value == '' ){\r\n\t\t\tif(\tproductForm.PRICE.value == '0' || productForm.PRICE.value == '' ){\r\n\t\t\t\talert(\"공시지가를 넣고 계산해주세요.\");\r\n\t\t\t\tproductForm.PRICE.focus();\r\n\t\t\t\treturn;\r\n\t\t\t}\r\n\t\t}\r\n\t\t/*if(\tproductForm.OVERTAX.value == '' || productForm.OVERTAX.value == '0' ){\r\n\t\t\talert(\"납기후 금액을 넣어주세요.\");\r\n\t\t\tproductForm.OVERTAX.focus();\r\n\t\t\treturn;\r\n\t\t}\r\n\t\tif(\tproductForm.TAX_DATE.value == '' ){\r\n\t\t\talert(\"부과일자를 넣어주세요.\");\r\n\t\t\tproductForm.TAX_DATE.focus();\r\n\t\t\treturn;\r\n\t\t}*/\r\n\r\n\t\tif( confirm(\"저장하시겠습니까? \" ) ){\r\n\t\t\t//document.productForm.year.value = document.productForm.YEAR.value;\r\n\t\t\t//document.productForm.mode_proc.value = \"addProc\";\r\n\t\t\t//comma제거\r\n\t\t\tif( productForm.RATE.value == '' ){\r\n\t\t\t\t//removeComma2(\"PRICE\");\r\n\t\t\t}\r\n\t\t\t//if( productForm.SUM_LASTYEAR.value != '' && productForm.SUM_LASTYEAR.value != '0' ){\r\n\t\t\t\t//removeComma2(\"SUM_LASTYEAR\");\r\n\t\t\t//}\r\n\t\t\tremoveComma2(\"SUM_YEAR\");\r\n\t\t\tremoveComma2(\"SUM_ADJUST\");\r\n\t\t\tremoveComma2(\"OVERTAX\");\r\n\t\t\tproductForm.submit();\r\n\t\t}\r\n\r\n\t}\r\n\t/*\r\n\tfunction calDate()\r\n\t{\r\n\t\t\r\n\t\tvar fromDate = removeDash(document.getElementById(\"FROMDATE\").value);\r\n\t\tvar toDate = removeDash(document.getElementById(\"TODATE\").value);\r\n//\t\tvar dateCount = 0;\r\n\t\t\r\n\t\tvar period = getDiffMon(fromDate,toDate)  ;\r\n\t\t\t\r\n\t\tdocument.getElementById(\"period\").value = period;\r\n\t\t\r\n\t\tvar fromDay1 = new Date(fromDate.substr(0,4),Number(fromDate.substr(4,2))-1,fromDate.substr(6,2))\r\n\t\t\r\n\t\tvar toDay1 = new Date(toDate.substr(0,4),Number(toDate.substr(4,2))-1,toDate.substr(6,2))\t\t\r\n\t\t\r\n//\t\tvar dateCount =(toDay1 - fromDay1)/(1000*3600*24)+1;  \r\n\t\t\r\n//\t\tdocument.getElementById(\"dateCount\").value = dateCount;\r\n\t}\t\r\n\t*/\r\n\t// 대쉬 삭제\r\n\tfunction removeDash(numValue)\r\n\t{\r\n\t\treturn numValue.split('-').join(\"\");\r\n\t}\r\n\t\r\n\t\t//달 차이 계산\r\n\t\t/*\r\n\tfunction getDiffMon(val1,val2)\r\n\t{\r\n\t\r\n\t    var sdate = new Date(Number(val1.substr(0,4)),Number(val1.substr(4,2))-1,Number(val1.substr(6,2)));\r\n\t    var edate = new Date(Number(val2.substr(0,4)),Number(val2.substr(4,2))-1,Number(val2.substr(6,2)));\r\n\t    \r\n\t   \r\n\t\r\n\t    var sDate  = sdate.getDate();     \t\r\n\t    var count=0;\r\n\t    \r\n\t    edate.setDate(edate.getDate()+1);\r\n\t    \r\n//\t     alert(sdate+\"   \"+edate);\r\n\t    \r\n\t    while (Date.parse(edate)>=Date.parse(sdate)) {\r\n\t        if(sdate.getDate() == sDate){ //해당 요일과 같다면...\r\n\t          count++;\r\n\t        }\r\n\t      sdate.setDate(sdate.getDate()+1); //요일을 계속 증가\r\n\t    }\r\n\t    return count-1;\r\n\t}\r\n\t\r\n\t*/\r\n\t//공시지가 팝업\r\n\tfunction openLandPricePopUp()\r\n\t{\r\n\t\tvar winW = 320;\r\n\t\tvar winH = 133;\r\n\t\tvar status =\"toolbar=no, location=no, directories=no, status=no, menubar=no, resizable=no, scrollbars=no, width=\"+winW+\", height=\"+winH+\", left=0, top=0\"\r\n\t\t//window.open('/jsp/jumyong/jumyong/officialLandPrice.html', 'win', status);\r\n\t\t\r\n\t\tvar admin_no = document.getElementById(\"GU_CODE\").value;\r\n\t\tvar year = document.getElementById(\"YEAR\").value;\r\n\r\n\t\r\n\t\twindow.open('/officialLandPrice.do?ADMIN_NO='+admin_no+'&year='+year, 'win', status);\r\n\t\t\r\n\t}\r\n\t\r\n\t\r\n\tfunction onlyNumberInput()\r\n\t{\t\r\n\t\t\r\n\t var code = window.event.keyCode;\t \r\n\t\r\n\t if ((code > 34 && code < 41) || (code > 47 && code < 58) || (code > 95 && code < 106) || code == 8 || code == 9 || code == 13 || code == 46 || code == 190 || code == 110 || code == 189 || code == 109)\r\n\t {\r\n\r\n\t  \twindow.event.returnValue = true;\r\n\t\treturn;\r\n\t }else \r\n\t {\t \r\n\t \twindow.event.returnValue = false;\r\n\t \treturn;\r\n \t }\r\n\t}\r\n\t\r\n\t\r\n\tfunction goSumview(seq , year)\r\n\t{\r\n\t\tvar gu_code= document.getElementById(\"gu_code\").value;\r\n\t\tvar corp_cd = document.getElementById(\"corp_cd\").value;\r\n\t\tvar request_no= document.getElementById(\"request_no\").value;\r\n\r\n\t\tvar currentP";
  private final static String _jspx_template20 = "age= document.getElementById(\"currentPage\").value;\r\n\t\t\r\n\t\t//var year = document.getElementById(\"year\").value;\r\n\t\tvar tax_set = document.getElementById(\"tax_set\").value;\r\n\r\n\t\tlocation.href=\"/facility/junggi/product_view.do?GU_CODE=\"+gu_code+\"&CORP_CD=\"+corp_cd\r\n\t\t+\"&REQUEST_NO=\"+request_no+\"&currentPage=\"+currentPage+\"&cal_sum_seq=\"+seq+\"&year=\"+year+\"&tax_set=\"+tax_set;\r\n\t}\r\n\t\r\n\t\r\n\t//[ , ] 삭제\r\n\tfunction removeComma2(numValue)\r\n\t{\t\r\n\t\tnum = document.getElementById(numValue).value;\t\t\r\n\t\tdocument.getElementById(numValue).value = Number(num.split(',').join(\"\"));\r\n\t}\r\n\t\r\n\t\r\n\t\r\n\t\r\n\t\r\n\t\r\n--></script>\r\n\r\n</head>\r\n\r\n<body onload=\"javascript:InitPage();\"  border=\"0\">\r\n\r\n<form name=\"productForm\" id=\"productForm\" method=\"post\" action = \"/facility/junggi/product_insert.do\" >\r\n\r\n<input type=\"hidden\" NAME=\"GU_CODE\" ID=\"gu_code\" value=\"";
  private final static String _jspx_template21 = "\" >\r\n<input type=\"hidden\" NAME=\"CORP_CD\" ID=\"corp_cd\" value=\"";
  private final static String _jspx_template22 = "\" >\r\n<input type=\"hidden\" NAME=\"REQUEST_NO\" ID=\"request_no\" value=\"";
  private final static String _jspx_template23 = "\" >\r\n<input type=\"hidden\" NAME=\"OBJECT_NO\" ID=\"object_no\" value=\"";
  private final static String _jspx_template24 = "\" >\r\n<input type=\"hidden\" NAME=\"cal_sum_seq\" ID=\"cal_sum_seq\" value=\"";
  private final static String _jspx_template25 = "\" >\t\r\n<input type=\"hidden\" NAME=\"SEQ\" ID=\"SEQ\" value=\"";
  private final static String _jspx_template26 = "\" >\t\t\r\n<input type=\"hidden\" NAME=\"rate1\" ID=\"rate1\"  >\t\t\r\n\r\n<input type=\"hidden\" NAME=\"currentPage\" ID=\"currentPage\" value=\"";
  private final static String _jspx_template27 = "\" >\r\n";
  private final static String _jspx_template28 = "\r\n\t<input type=\"hidden\" NAME=\"TAX_SET\" ID=\"TAX_SET\" value=\"";
  private final static String _jspx_template29 = "\" >\r\n";
  private final static String _jspx_template30 = "\r\n\r\n<!-- 2009.8.18 추가 start -->\r\n<input type=\"hidden\" name=\"SIGU_CD\" value=\"";
  private final static String _jspx_template31 = "\">\r\n<input type=\"hidden\" name=\"BJ_CD\" value=\"";
  private final static String _jspx_template32 = "\">\r\n<input type=\"hidden\" name=\"TAX_NO\" value=\"";
  private final static String _jspx_template33 = "\">\r\n<input type=\"hidden\" name=\"DEPT_CD\" value=\"";
  private final static String _jspx_template34 = "\">\r\n<input type=\"hidden\" name=\"TAX_GUBUN\" value=\"";
  private final static String _jspx_template35 = "\">\r\n<input type=\"hidden\" name=\"OBJ_SET\" value=\"";
  private final static String _jspx_template36 = "\">\r\n<input type=\"hidden\" name=\"TAXPAYER_ID\" value=\"";
  private final static String _jspx_template37 = "\">\r\n<input type=\"hidden\" name=\"TAXPAYER_SET\" value=\"";
  private final static String _jspx_template38 = "\">\r\n<input type=\"hidden\" name=\"OCR_SIGU_CD\" value=\"";
  private final static String _jspx_template39 = "\">\r\n<input type=\"hidden\" name=\"OCR_BUSEO_CD\" value=\"";
  private final static String _jspx_template40 = "\">\r\n<input type=\"hidden\" name=\"TAX_CD\" value=\"";
  private final static String _jspx_template41 = "\">\r\n<input type=\"hidden\" name=\"MAX_TAX_NO\" value=\"";
  private final static String _jspx_template42 = "\">\r\n<input type=\"hidden\" name=\"CAL_SUM_SEQ\" value=\"";
  private final static String _jspx_template43 = "\">\r\n<input type=\"hidden\" name=\"LIVE\" value=\"";
  private final static String _jspx_template44 = "\">\r\n<input type=\"hidden\" name=\"mode\" value=\"";
  private final static String _jspx_template45 = "\" >\r\n<input type=\"hidden\" name=\"year\" value=\"";
  private final static String _jspx_template46 = "\">\r\n<input type=\"hidden\" name=\"tax_set\" value=\"";
  private final static String _jspx_template47 = "\">\r\n<input type=\"hidden\" name=\"message\" value=\"";
  private final static String _jspx_template48 = "\">\r\n<input type=\"hidden\" name=\"listSize\" value=\"";
  private final static String _jspx_template49 = "\">\r\n<input type=\"hidden\" name=\"listsSize\" value=\"";
  private final static String _jspx_template50 = "\">\r\n<input type=\"hidden\" name=\"sigu_cd_param\" value=\"";
  private final static String _jspx_template51 = "\">\r\n<input type=\"hidden\" name=\"taxation_check\" value=\"";
  private final static String _jspx_template52 = "\">\r\n<!-- 2009.8.18 추가 end -->\r\n\r\n<table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t<tr>\r\n\t\t<td class=\"contborder_purple\">\t\t\t\t\t\t\t            \r\n\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td>\r\n\t\t\t\r\n\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t                    <td height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">년도 </td>\t\t\t\t\t\t\t\t\r\n\r\n\t\t\t                    <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">일반 점용료 </td>\r\n\t\t\t                    <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조정 점용료</td>\r\n\t\t\t                    <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">정기/수시</td>\r\n\t\t\t                    <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">구분</td>\r\n\r\n\t\t                    </tr>\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template53 = "\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template54 = "\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template55 = "\r\n\t\t\t\t\t\t\t<tr onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\" \r\n\t\t\t\t\t\t\t\tonclick=\"javascript:goSumview('";
  private final static String _jspx_template56 = "','";
  private final static String _jspx_template57 = "');\" style=\"cursor:pointer\" >\r\n\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template58 = "\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template59 = "\r\n\t\t\t\t\t\t\t<tr onclick=\"javascript:goSumview('";
  private final static String _jspx_template60 = "','";
  private final static String _jspx_template61 = "');\" bgcolor=\"#f6f7f8\">\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template62 = "\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template63 = "\r\n\r\n\t\t\t\t\t\t\t\t\t<td height=\"28\" align=\"center\">";
  private final static String _jspx_template64 = "</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template65 = "</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template66 = "</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template67 = "</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template68 = "</td>\r\n\t\t\t\t\t\t\t\t</tr> \r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template69 = "\r\n\t\t\t\t\t\t</table></td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"40\" align=\"center\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td align=\"center\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t\t\t\t\t    \t<tr>";
  private final static String _jspx_template70 = "</tr></table></td>\r\n\t                    </tr></table></td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td>\r\n\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t                    <td height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">번호</td>\r\n\t\t\t\t                    <td height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">과세구분</td>\r\n\t\t\t\t                    <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용목적</td>\r\n\t\t\t\t                    <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">연장(개소)</td>\r\n\t\t\t\t                    <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">구분 </td>\t\t\t\t                    \r\n<!--\t\t\t                    <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">심도 </td>-->\r\n<!--\t\t\t                    <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">감액율</td>-->\r\n<!--\t\t\t                    <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">산출단가</td>-->\r\n\t\t\t                    \t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조정점용료</td>\r\n<!--\t\t\t                    <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">구분 </td>-->\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">산출여부 </td>\r\n\t\t\t                    \r\n\t\t                    </tr>\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template71 = "\r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template72 = "\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template73 = "\r\n\t\t\t\t\t\t\t\t<tr onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\" \r\n\t\t\t\t\t\t\t\tonclick=\"javascript:goview('";
  private final static String _jspx_template74 = "','";
  private final static String _jspx_template75 = "','";
  private final static String _jspx_template76 = "');\" style=\"cursor:pointer\" >\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template77 = "\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template78 = "\r\n\t\t\t\t\t\t\t\t<tr onclick=\"javascript:goview('";
  private final static String _jspx_template79 = "','";
  private final static String _jspx_template80 = "','";
  private final static String _jspx_template81 = "');\" bgcolor=\"#f6f7f8\">\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template82 = "\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template83 = "\r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\">";
  private final static String _jspx_template84 = "</td>\r\n<!--\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\">";
  private final static String _jspx_template85 = "-";
  private final static String _jspx_template86 = "</td>-->\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template87 = "\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template88 = "\r\n\t\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\">";
  private final static String _jspx_template89 = "년도 ";
  private final static String _jspx_template90 = " 차 ";
  private final static String _jspx_template91 = "분 </td>\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template92 = "\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template93 = "\r\n\t\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\">";
  private final static String _jspx_template94 = "년도 ";
  private final static String _jspx_template95 = "분 </td>\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template96 = "\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template97 = "\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template98 = " ";
  private final static String _jspx_template99 = "</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template100 = "</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template101 = "</td>\t\t\t\t\t\t\t\t\r\n<!--\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template102 = "</td>-->\r\n<!--\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template103 = "%</td>-->\r\n<!--\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template104 = "</td>-->\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template105 = "</td>\r\n<!--\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template106 = "</td>-->\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\"><font color=\"red\">\r\n\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template107 = "\r\n\t\t\t\t\t\t\t\t\t\t\t산출\r\n\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template108 = "\r\n\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template109 = "\r\n\t\t\t\t\t\t\t\t\t\t\t미산출\r\n\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template110 = "\r\n\t\t\t\t\t\t\t\t\t</font>\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template111 = "\r\n\t\t\t\t\t\t</table></td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"40\" align=\"center\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td align=\"center\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t\t\t\t\t    \t<tr>";
  private final static String _jspx_template112 = "</tr></table></td>\t\r\n\t                    </tr></table></td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td class=\"sub_table_b\"> ※ 점용료 산출\r\n\t\t\t\t\t</td></tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td>\r\n\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t                \t<td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">부과년도</td>\r\n\t\t\t                \t<td width=\"42%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template113 = "\r\n\t\t\t                      \t<!-- select name=\"YEAR\" id=\"YEAR\" class=\"input_form1\" style=\"width:130px\" onchange=\"changeYear(this.value);\">\r\n\t\t\t                      \t</select-->\r\n\t\t\t\t\t\t\t\t\t<input name=\"YEAR\" id=\"YEAR\" type=\"text\" value = \"";
  private final static String _jspx_template114 = "\" style=\"width:80px;ime-mode:disabled;\"  class=\"input_form1\"  onKeyDown=\"onlyNumberInput();\">\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template115 = "\r\n\t\t\t\t                \r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t<td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">공시지가</td>\r\n\t\t                    \t<td width=\"32%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\t\t                    \t\r\n\t\t\t\t\t\t\t\t<span id=\"priceButton\">\r\n\t\t                   \t\t<!-- input name=\"PRICE\" ID=\"PRICE\" value=\"";
  private final static String _jspx_template116 = "\" type=\"text\" class=\"input_form1\" style=\"width:120px\" onkeypress=\"javascript:checkWon(this);\"-->\r\n\t\t\t                \t";
  private final static String _jspx_template117 = "   \t\t\r\n\t\t\t                   \t\t<input name=\"PRICE\" ID=\"PRICE\" value=\"";
  private final static String _jspx_template118 = "\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" onkeyup=\"javascript:fn_addComma(this)\"  onKeyDown=\"onlyNumberInput();\" >원\t \r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template119 = "\t\t\t\t\t\t\t\r\n\t\t\t                  \t<img src=\"/img/landPrice.gif\" alt=\"공시지가조회\" height=\"18\" border=\"0\" style=\"cursor:pointer\" onclick=\"javascript:openLandPricePopUp()\"; >\r\n\t\t\t                  \t</span>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t                  \t</tr>\t\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">연장</td>\r\n\t\t\t\t\t\t\t    <td width=\"40%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\t\t\t\t\t\t        ";
  private final static String _jspx_template120 = "\r\n\t                          \t\t<input name=\"QUANTITY\" id=\"QUANTITY\" type=\"text\" class=\"input_form1\" style=\"width:80px;\" value=\"";
  private final static String _jspx_template121 = "\" readonly>m(개)\r\n\t                          \t";
  private final static String _jspx_template122 = "\r\n\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t</td> \r\n\t\t\t\t\t\t\t\t<td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">감액율</td>\r\n\t\t\t\t\t\t\t    <td width=\"26%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\t\t\t\t\t\t\t    ";
  private final static String _jspx_template123 = "\r\n\t                          \t\t<input name=\"DEPTH_RATE\" id=\"DEPTH_RATE\" type=\"text\" class=\"input_form1\" style=\"width:80px;\" value=\"";
  private final static String _jspx_template124 = "\"   >%\t\r\n\t                          \t";
  private final static String _jspx_template125 = "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \r\n\t\t\t\t\t\t\t\t</td> \r\n\t\t\t\t\t\t    </tr>\t\t\t\t\t\t   \r\n\t\t\t\t\t\t     \t<tr>\r\n\t\t\t\t\t\t\t    <td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" >산출단가</td>\r\n\t\t\t\t\t\t\t    <td width=\"42%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t\t\t\t\t    ";
  private final static String _jspx_template126 = "\r\n\t                          \t\t<input name=\"RATE\" id=\"RATE\" type=\"text\" class=\"input_form1\" style=\"width:80px;\" value=\"";
  private final static String _jspx_template127 = "\"   >\r\n\t                          \t";
  private final static String _jspx_template128 = "\r\n\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t</td>  \t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t    </tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t                    <td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">산출기간</td>\r\n\t\t\t                    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\t\t\t                    \t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t                        <tr>\r\n\t\t\t\t                          <td>\r\n\t\t\t\t\t\t\t\t\t\t    ";
  private final static String _jspx_template129 = "\r\n\t\t\t\t                          \t\t<input name=\"FROMDATE\" id=\"FROMDATE\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template130 = "\"  onKeyDown=\"onlyNumberInput();\"   onKeyDown=\"onlyNumberInput();\" maxlength=8>\r\n\t\t\t\t                          \t";
  private final static String _jspx_template131 = "\r\n\t\t\t\t                          </td>\r\n\t\t\t\t                          <td>\r\n\t\t\t\t                          <img src=\"/img/calendar_icon.gif\" onclick=\"popUpCalendar(this, document.getElementById('FROMDATE'), 'yyyymmdd');\" style=\"cursor:pointer\" >\r\n\t\t\t\t                          \r\n\t\t\t\t                          </td>\r\n\t\t\t\t                          \r\n\t\t\t\t                          <td width=\"16\" align=\"center\">~</td>\r\n\t\t\t\t                          <td>\r\n\t\t\t\t\t\t\t\t\t\t    ";
  private final static String _jspx_template132 = "\r\n\t\t\t\t\t                          \t<input name=\"TODATE\" id=\"TODATE\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template133 = "\"  onKeyDown=\"onlyNumberInput();\" maxlength=8>\r\n\t\t\t\t                          \t";
  private final static String _jspx_template134 = "\r\n\t\t\t\t                          </td>\r\n\t\t\t\t                          <td>\r\n\t\t\t\t                     \t\t<img src=\"/img/calendar_icon.gif\" onclick=\"popUpCalendar(this, document.getElementById('TODATE'), 'yyyymmdd');\" style=\"cursor:pointer\" >\r\n\t\t\t\t                     \t\t\r\n           \t\t\t\t\t\t\t\t\t<img src=\"/img/cal_month.gif\" alt=\"달수계산\" height=\"18\" border=\"0\" style=\"cursor:pointer\" onClick=\"javascript:calDate();\">\r\n\t\t\t\t                     \t\t\r\n\t\t\t\t                          </td>\r\n\t\t\t\t                        </tr>\r\n\t\t\t\t                    </table>\r\n\t\t\t\t                </td>  \r\n\t\t\t                    \r\n\t\t\t                    <td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">개월수</td>\r\n\t\t\t                    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\t\t\t                     ";
  private final static String _jspx_template135 = "\r\n\t\t\t\t\t\t\t\t\t\t<input name=\"PERIOD\" id=\"PERIOD\" type=\"text\" class=\"input_form1\" style=\"width:50px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template136 = "\"   onKeyDown=\"onlyNumberInput();\">개월\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template137 = "\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t                    \t<!-- td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">작년도 점용료</td>\r\n\t\t\t                    <td width=\"42%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template138 = "\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t<input name=\"SUM_LASTYEAR\" id=\"SUM_LASTYEAR\" type=\"text\"  class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template139 = "\"   onKeyDown=\"onlyNumberInput();\" onkeyup=\"javascript:fn_addComma(this)\">원\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template140 = "\r\n\t\t\t\t\t\t\t\t</td-->  \r\n\t\t\t\t\t\t\t\t<td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">현년도 점용료</td>\r\n\t\t\t                    <td width=\"32%\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template141 = "\r\n\t\t\t\t\t\t\t\t\t\t<input name=\"SUM_YEAR\" id=\"SUM_YEAR\" type=\"text\" class=\"input_form1\" style=\"width:120px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template142 = "\"   onKeyDown=\"onlyNumberInput();\" onkeyup=\"javascript:fn_addComma(this)\" >원\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template143 = "\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조정 점용료</td>\r\n\t\t\t                    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template144 = "\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t<input name=\"SUM_ADJUST\" id=\"SUM_ADJUST\" type=\"text\" class=\"input_form1\" style=\"width:120px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template145 = "\"  onKeyDown=\"onlyNumberInput();\" onkeyup=\"javascript:fn_addComma(this)\" >원\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template146 = "\r\n\t\t\t\t\t\t\t\t</td>                   \r\n\t\t\t\t\t\t\t</tr>  \r\n\t\t                  \t<tr>\r\n\t\t\t                    <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조정 계수</td>\r\n\t\t\t                    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template147 = "\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t<input name=\"ADJUSTMENT\" id=\"ADJUSTMENT\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template148 = "\"   onKeyDown=\"onlyNumberInput();\" >\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template149 = "\r\n\t\t\t\t\t\t\t\t</td>\t\t\t\t\t\t\t\t \r\n\t\t                  \t</tr>\r\n\t\t\t\t         \r\n\t\t\t\t      \t<!-- 해당 object 가 다 계산 되었을때 taxation_info 에 저장할수 있도록 보여지게 변경 start -->\r\n\t                  \t<!-- span  id=\"taxationCheck\" style=\"display:none;\"-->\r\n\t                  \t\t<tr id=\"taxationCheck\" style=\"display:none;\">\r\n\t\t\t             \t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">부과일자</td>\r\n\t\t\t                    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\t\t\t                    \t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t                        \t<tr>\r\n\t\t\t\t                        \t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template150 = "\r\n\t\t\t                          \t\t\t<input name=\"TAX_DATE\" id=\"TAX_DATE\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template151 = "\"  onKeyDown=\"onlyNumberInput();\"   onKeyDown=\"onlyNumberInput();\" maxlength=10>\r\n\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template152 = "\r\n\t\t\t\t                          \t</td>\r\n\t\t\t\t                          \t<td>\r\n\t\t\t\t\t                          \t<img src=\"/img/calendar_icon.gif\" onclick=\"popUpCalendar(this, document.getElementById('FROMDATE'), 'yyyymmdd');\"  style=\"cursor:pointer\" >\r\n\t\t\t\t                          \t</td>\t\t\t\t\t\t\t                          \r\n\t\t\t                        \t</tr>\r\n\t\t\t                    \t</table>\r\n\t\t\t                    </td>\r\n\t\t\t             \t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">납기내기한</td>\r\n\t\t\t                    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\t\t\t                    \t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t                        \t<tr>\r\n\t\t\t\t                        \t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template153 = "\r\n\t\t\t                          \t\t\t<input name=\"INDATE\" id=\"INDATE\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template154 = "\"  onKeyDown=\"onlyNumberInput();\"   onKeyDown=\"onlyNumberInput();\" maxlength=10>\r\n\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template155 = "\r\n\t\t\t\t                          \t</td>\r\n\t\t\t\t                          \t<td>\r\n\t\t\t\t\t                          \t<img src=\"/img/calendar_icon.gif\" onclick=\"popUpCalendar(this, document.getElementById('FROMDATE'), 'yyyymmdd');\"  style=\"cursor:pointer\" >\r\n\t\t\t\t                          \t</td>\t\t\t\t\t\t\t                          \r\n\t\t\t                        \t</tr>\r\n\t\t\t                    \t</table>\r\n\t\t\t                    </td>\r\n\t\t\t             \t</tr>\r\n\t\t\t             \t<tr id=\"taxationCheck2\" style=\"display:none;\">\r\n\t\t\t             \t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">납기후일자</td>\r\n\t\t\t                    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\t\t\t                    \t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t                        \t<tr>\r\n\t\t\t\t                        \t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template156 = "\r\n\t\t\t                          \t\t\t<input name=\"OVERDATE\" id=\"OVERDATE\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template157 = "\"  onKeyDown=\"onlyNumberInput();\"   onKeyDown=\"onlyNumberInput();\" maxlength=10>\r\n\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template158 = "\r\n\t\t\t\t                          \t</td>\r\n\t\t\t\t                          \t<td>\r\n\t\t\t\t\t                          \t<img src=\"/img/calendar_icon.gif\" onclick=\"popUpCalendar(this, document.getElementById('FROMDATE'), 'yyyymmdd');\"  style=\"cursor:pointer\" >\r\n\t\t\t\t                          \t</td>\t\t\t\t\t\t\t                          \r\n\t\t\t                        \t</tr>\r\n\t\t\t                    \t</table>\r\n\t\t\t                    </td>\r\n\t\t\t             \t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">납기후금액</td>\r\n\t\t\t                    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\t\t\t                    \t";
  private final static String _jspx_template159 = "\r\n\t                          \t\t\t<input name=\"OVERTAX\" id=\"OVERTAX\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template160 = "\"  onKeyDown=\"onlyNumberInput();\"   onKeyDown=\"onlyNumberInput();\" maxlength=10>\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template161 = "\r\n\t\t\t                    </td>\r\n\t\t\t             \t</tr>\r\n\t\t\t            \r\n\t                  \t<!-- 해당 object 가 다 계산 되었을때 taxation_info 에 저장할수 있도록 보여지게 변경 end-->\r\n\t\t\t\t        \r\n\t\t                   \t<tr>\r\n\t\t                    \t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">기본 산출식</td>\r\n\t\t                    \t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template162 = "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t                    \r\n\t\t\t\t\t\t\t\t\t\t\t<input name=\"FORM\" ID=\"FORM\" type=\"text\" class=\"input_form1\" style=\"width:600px\" value=\"";
  private final static String _jspx_template163 = "\">\r\n\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template164 = "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t                  \t</tr> \r\n\t\t                  \t<tr>\t\r\n\t\t\t                  \t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조정 산출식</td>\r\n\t\t\t                    <td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template165 = "\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t<input name=\"FORM_ADJUST\" id=\"FORM_ADJUST\" type=\"text\" class=\"input_form1\" style=\"width:600px\" value=\"";
  private final static String _jspx_template166 = "\" >\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template167 = "\r\n\t\t\t\t\t\t\t\t</td>\r\n\t                  \t \t</tr>\r\n\t\t\t\t\t\t\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t\t                \r\n \t\t\t\t<tr>              \r\n                \t<td height=\"40\" align=\"right\">\r\n\t                \t<img src=\"/img/accou_icon.gif\" alt=\"계산\" width=\"56\" height=\"18\" border=\"0\" onclick=\"javascript:Calculate();\" style=\"cursor:pointer\">\r\n\t                \t<img src=\"/img/save_icon2.gif\" alt=\"저장\" width=\"56\" height=\"18\" border=\"0\" onClick=\"javascript:submitClick();\" style=\"cursor:pointer\" >\r\n\t\t            \t<img src=\"/img/can_icon.gif\" alt=\"취소\" width=\"56\" height=\"18\" border=\"0\" onClick=\"javascript:history.back();\" style=\"cursor:pointer\">\r\n\t\t            </td>\r\n\t\t\t\t</tr>\r\n\t            <tr> \r\n\t\t\t\t\t<td height=\"40\" align=\"right\"></td>\r\n\t\t\t\t</tr>\r\n\t\t\t</table>\r\n\t\t</td>\r\n\t</tr>\t\t\t\t\t                \r\n</table>\r\n</form>\r\n</body>\r\n</html>\r\n\r\n";
}
