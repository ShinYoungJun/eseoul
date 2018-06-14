package jeus_jspwork._jsp._facility._jumyong._tab;

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
      // jsp code [from=(247,17);to=(247,21)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${year}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(260,17);to=(260,21)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${year}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(271,10);to=(271,16)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${direct}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // ----  spring:bind ---- //
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_0 = new org.springframework.web.servlet.tags.BindTag();
      _jspx_th_spring_bind_0.setPageContext(pageContext);
      _jspx_th_spring_bind_0.setPath("product.GU_CODE");
      try {
        try {
          int _jspx_eval_spring_bind_0 = _jspx_th_spring_bind_0.doStartTag();
          if (_jspx_eval_spring_bind_0 != Tag.SKIP_BODY) {
            do {
              org.springframework.web.servlet.support.BindStatus status = null;
              status = (org.springframework.web.servlet.support.BindStatus) pageContext.findAttribute("status");
              out.write(_jspx_template14);
              // jsp code [from=(370,60);to=(370,67)]
              out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${gu_code}",java.lang.String.class , pageContext.getVariableResolver(), null));

              out.write(_jspx_template15);

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

      out.write(_jspx_template16);
      // ----  spring:bind ---- //
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_1 = new org.springframework.web.servlet.tags.BindTag();
      _jspx_th_spring_bind_1.setPageContext(pageContext);
      _jspx_th_spring_bind_1.setPath("product.CORP_CD");
      try {
        try {
          int _jspx_eval_spring_bind_1 = _jspx_th_spring_bind_1.doStartTag();
          if (_jspx_eval_spring_bind_1 != Tag.SKIP_BODY) {
            do {
              org.springframework.web.servlet.support.BindStatus status = null;
              status = (org.springframework.web.servlet.support.BindStatus) pageContext.findAttribute("status");
              out.write(_jspx_template17);
              // jsp code [from=(373,60);to=(373,67)]
              out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${corp_cd}",java.lang.String.class , pageContext.getVariableResolver(), null));

              out.write(_jspx_template18);

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

      out.write(_jspx_template19);
      // ----  spring:bind ---- //
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_2 = new org.springframework.web.servlet.tags.BindTag();
      _jspx_th_spring_bind_2.setPageContext(pageContext);
      _jspx_th_spring_bind_2.setPath("product.REQUEST_NO");
      try {
        try {
          int _jspx_eval_spring_bind_2 = _jspx_th_spring_bind_2.doStartTag();
          if (_jspx_eval_spring_bind_2 != Tag.SKIP_BODY) {
            do {
              org.springframework.web.servlet.support.BindStatus status = null;
              status = (org.springframework.web.servlet.support.BindStatus) pageContext.findAttribute("status");
              out.write(_jspx_template20);
              // jsp code [from=(376,66);to=(376,76)]
              out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${request_no}",java.lang.String.class , pageContext.getVariableResolver(), null));

              out.write(_jspx_template21);

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

      out.write(_jspx_template22);
      // ----  spring:bind ---- //
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_3 = new org.springframework.web.servlet.tags.BindTag();
      _jspx_th_spring_bind_3.setPageContext(pageContext);
      _jspx_th_spring_bind_3.setPath("product.OBJECT_NO");
      try {
        try {
          int _jspx_eval_spring_bind_3 = _jspx_th_spring_bind_3.doStartTag();
          if (_jspx_eval_spring_bind_3 != Tag.SKIP_BODY) {
            do {
              org.springframework.web.servlet.support.BindStatus status = null;
              status = (org.springframework.web.servlet.support.BindStatus) pageContext.findAttribute("status");
              out.write(_jspx_template23);
              // jsp code [from=(379,64);to=(379,73)]
              out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${object_no}",java.lang.String.class , pageContext.getVariableResolver(), null));

              out.write(_jspx_template24);

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

      out.write(_jspx_template25);
      // ----  spring:bind ---- //
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_4 = new org.springframework.web.servlet.tags.BindTag();
      _jspx_th_spring_bind_4.setPageContext(pageContext);
      _jspx_th_spring_bind_4.setPath("product.TAX_SET");
      try {
        try {
          int _jspx_eval_spring_bind_4 = _jspx_th_spring_bind_4.doStartTag();
          if (_jspx_eval_spring_bind_4 != Tag.SKIP_BODY) {
            do {
              org.springframework.web.servlet.support.BindStatus status = null;
              status = (org.springframework.web.servlet.support.BindStatus) pageContext.findAttribute("status");
              out.write(_jspx_template26);
              // jsp code [from=(382,60);to=(382,75)]
              out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.TAX_SET}",java.lang.String.class , pageContext.getVariableResolver(), null));

              out.write(_jspx_template27);

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

      out.write(_jspx_template28);
      // ----  spring:bind ---- //
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_5 = new org.springframework.web.servlet.tags.BindTag();
      _jspx_th_spring_bind_5.setPageContext(pageContext);
      _jspx_th_spring_bind_5.setPath("product.SEQ");
      try {
        try {
          int _jspx_eval_spring_bind_5 = _jspx_th_spring_bind_5.doStartTag();
          if (_jspx_eval_spring_bind_5 != Tag.SKIP_BODY) {
            do {
              org.springframework.web.servlet.support.BindStatus status = null;
              status = (org.springframework.web.servlet.support.BindStatus) pageContext.findAttribute("status");
              out.write(_jspx_template29);
              // jsp code [from=(385,52);to=(385,63)]
              out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

              out.write(_jspx_template30);

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

      out.write(_jspx_template31);
      // jsp code [from=(389,67);to=(389,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template32);
      // jsp code [from=(390,53);to=(390,57)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mode}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template33);
      // jsp code [from=(391,57);to=(391,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${direct}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template34);
      // ----  c:choose ---- invoke //
      if (_jspx_th_c_choose_0_fn(pageContext, null)) return;


      out.write(_jspx_template47);
      // ----  c:choose ---- invoke //
      if (_jspx_th_c_choose_1_fn(pageContext, null)) return;


      out.write(_jspx_template69);
      // jsp code [from=(480,19);to=(480,26)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${pageing}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template70);
      // ----  spring:bind ---- //
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_6 = new org.springframework.web.servlet.tags.BindTag();
      _jspx_th_spring_bind_6.setPageContext(pageContext);
      _jspx_th_spring_bind_6.setPath("product.YEAR");
      try {
        try {
          int _jspx_eval_spring_bind_6 = _jspx_th_spring_bind_6.doStartTag();
          if (_jspx_eval_spring_bind_6 != Tag.SKIP_BODY) {
            do {
              org.springframework.web.servlet.support.BindStatus status = null;
              status = (org.springframework.web.servlet.support.BindStatus) pageContext.findAttribute("status");
              out.write(_jspx_template71);
              // jsp code [from=(496,125);to=(496,137)]
              out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

              out.write(_jspx_template72);

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

      out.write(_jspx_template73);
      // ----  spring:bind ---- //
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_7 = new org.springframework.web.servlet.tags.BindTag();
      _jspx_th_spring_bind_7.setPageContext(pageContext);
      _jspx_th_spring_bind_7.setPath("product.QUANTITY");
      try {
        try {
          int _jspx_eval_spring_bind_7 = _jspx_th_spring_bind_7.doStartTag();
          if (_jspx_eval_spring_bind_7 != Tag.SKIP_BODY) {
            do {
              org.springframework.web.servlet.support.BindStatus status = null;
              status = (org.springframework.web.servlet.support.BindStatus) pageContext.findAttribute("status");
              out.write(_jspx_template74);
              // jsp code [from=(503,17);to=(503,33)]
              out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.QUANTITY}",java.lang.String.class , pageContext.getVariableResolver(), null));

              out.write(_jspx_template75);
              // jsp code [from=(504,133);to=(504,149)]
              out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.QUANTITY}",java.lang.String.class , pageContext.getVariableResolver(), null));

              out.write(_jspx_template76);

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

      out.write(_jspx_template77);
      // ----  spring:bind ---- //
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_8 = new org.springframework.web.servlet.tags.BindTag();
      _jspx_th_spring_bind_8.setPageContext(pageContext);
      _jspx_th_spring_bind_8.setPath("product.RATE");
      try {
        try {
          int _jspx_eval_spring_bind_8 = _jspx_th_spring_bind_8.doStartTag();
          if (_jspx_eval_spring_bind_8 != Tag.SKIP_BODY) {
            do {
              org.springframework.web.servlet.support.BindStatus status = null;
              status = (org.springframework.web.servlet.support.BindStatus) pageContext.findAttribute("status");
              out.write(_jspx_template78);
              // jsp code [from=(512,120);to=(512,132)]
              out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

              out.write(_jspx_template79);

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

      out.write(_jspx_template80);
      // ----  spring:bind ---- //
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_9 = new org.springframework.web.servlet.tags.BindTag();
      _jspx_th_spring_bind_9.setPageContext(pageContext);
      _jspx_th_spring_bind_9.setPath("product.DEPTH_NUM");
      try {
        try {
          int _jspx_eval_spring_bind_9 = _jspx_th_spring_bind_9.doStartTag();
          if (_jspx_eval_spring_bind_9 != Tag.SKIP_BODY) {
            do {
              org.springframework.web.servlet.support.BindStatus status = null;
              status = (org.springframework.web.servlet.support.BindStatus) pageContext.findAttribute("status");
              out.write(_jspx_template81);
              // jsp code [from=(518,130);to=(518,139)]
              out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${depth_num}",java.lang.String.class , pageContext.getVariableResolver(), null));

              out.write(_jspx_template82);

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

      out.write(_jspx_template83);
      // ----  spring:bind ---- //
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_10 = new org.springframework.web.servlet.tags.BindTag();
      _jspx_th_spring_bind_10.setPageContext(pageContext);
      _jspx_th_spring_bind_10.setPath("product.FROMDATE");
      try {
        try {
          int _jspx_eval_spring_bind_10 = _jspx_th_spring_bind_10.doStartTag();
          if (_jspx_eval_spring_bind_10 != Tag.SKIP_BODY) {
            do {
              org.springframework.web.servlet.support.BindStatus status = null;
              status = (org.springframework.web.servlet.support.BindStatus) pageContext.findAttribute("status");
              out.write(_jspx_template84);
              // jsp code [from=(528,151);to=(528,167)]
              out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.FROMDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

              out.write(_jspx_template85);

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

      out.write(_jspx_template86);
      // ----  spring:bind ---- //
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_11 = new org.springframework.web.servlet.tags.BindTag();
      _jspx_th_spring_bind_11.setPageContext(pageContext);
      _jspx_th_spring_bind_11.setPath("product.TODATE");
      try {
        try {
          int _jspx_eval_spring_bind_11 = _jspx_th_spring_bind_11.doStartTag();
          if (_jspx_eval_spring_bind_11 != Tag.SKIP_BODY) {
            do {
              org.springframework.web.servlet.support.BindStatus status = null;
              status = (org.springframework.web.servlet.support.BindStatus) pageContext.findAttribute("status");
              out.write(_jspx_template87);
              // jsp code [from=(537,146);to=(537,160)]
              out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.TODATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

              out.write(_jspx_template88);

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

      out.write(_jspx_template89);
      // ----  spring:bind ---- //
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_12 = new org.springframework.web.servlet.tags.BindTag();
      _jspx_th_spring_bind_12.setPageContext(pageContext);
      _jspx_th_spring_bind_12.setPath("product.PERIOD");
      try {
        try {
          int _jspx_eval_spring_bind_12 = _jspx_th_spring_bind_12.doStartTag();
          if (_jspx_eval_spring_bind_12 != Tag.SKIP_BODY) {
            do {
              org.springframework.web.servlet.support.BindStatus status = null;
              status = (org.springframework.web.servlet.support.BindStatus) pageContext.findAttribute("status");
              out.write(_jspx_template90);
              // jsp code [from=(554,124);to=(554,138)]
              out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.PERIOD}",java.lang.String.class , pageContext.getVariableResolver(), null));

              out.write(_jspx_template91);

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

      out.write(_jspx_template92);
      // ----  spring:bind ---- //
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_13 = new org.springframework.web.servlet.tags.BindTag();
      _jspx_th_spring_bind_13.setPageContext(pageContext);
      _jspx_th_spring_bind_13.setPath("product.FORM_ADJUST");
      try {
        try {
          int _jspx_eval_spring_bind_13 = _jspx_th_spring_bind_13.doStartTag();
          if (_jspx_eval_spring_bind_13 != Tag.SKIP_BODY) {
            do {
              org.springframework.web.servlet.support.BindStatus status = null;
              status = (org.springframework.web.servlet.support.BindStatus) pageContext.findAttribute("status");
              out.write(_jspx_template93);
              // jsp code [from=(562,135);to=(562,154)]
              out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.FORM_ADJUST}",java.lang.String.class , pageContext.getVariableResolver(), null));

              out.write(_jspx_template94);

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

      out.write(_jspx_template95);
      // ----  spring:bind ---- //
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_14 = new org.springframework.web.servlet.tags.BindTag();
      _jspx_th_spring_bind_14.setPageContext(pageContext);
      _jspx_th_spring_bind_14.setPath("product.SUM_ADJUST");
      try {
        try {
          int _jspx_eval_spring_bind_14 = _jspx_th_spring_bind_14.doStartTag();
          if (_jspx_eval_spring_bind_14 != Tag.SKIP_BODY) {
            do {
              org.springframework.web.servlet.support.BindStatus status = null;
              status = (org.springframework.web.servlet.support.BindStatus) pageContext.findAttribute("status");
              out.write(_jspx_template96);
              // jsp code [from=(568,132);to=(568,150)]
              out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.SUM_ADJUST}",java.lang.String.class , pageContext.getVariableResolver(), null));

              out.write(_jspx_template97);

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

      out.write(_jspx_template98);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_2_fn(pageContext, null)) return;


      out.write(_jspx_template100);

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
  private boolean _jspx_th_c_choose_0_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:choose ---- //
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = new org.apache.taglibs.standard.tag.common.core.ChooseTag();
    _jspx_th_c_choose_0.setPageContext(pageContext);
    try {
      int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
      if (_jspx_eval_c_choose_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template35);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template44);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template46);

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
    try {
      int _jspx_eval_c_choose_1 = _jspx_th_c_choose_1.doStartTag();
      if (_jspx_eval_c_choose_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template48);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_1_fn(pageContext, _jspx_th_c_choose_1)) return true;


          out.write(_jspx_template66);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_1_fn(pageContext, _jspx_th_c_choose_1)) return true;


          out.write(_jspx_template68);

        } while (_jspx_th_c_choose_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_choose_1.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_choose_1.release();
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
    _jspx_th_c_if_2.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${direct != 'direct'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
      if (_jspx_eval_c_if_2 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template99);

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
    _jspx_th_c_when_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${calSumList!= null && !empty calSumList}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
      if (_jspx_eval_c_when_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template36);
          // ----  c:forEach ---- invoke //
          if (_jspx_th_c_forEach_0_fn(pageContext, _jspx_th_c_when_0)) return true;


          out.write(_jspx_template43);

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
          out.write(_jspx_template45);

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
    _jspx_th_c_when_1.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${placeList!= null && !empty placeList}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
      if (_jspx_eval_c_when_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template49);
          // ----  c:forEach ---- invoke //
          if (_jspx_th_c_forEach_1_fn(pageContext, _jspx_th_c_when_1)) return true;


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

        } while (_jspx_th_c_otherwise_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_otherwise_1.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_otherwise_1.release();
    }
    return false;
  }

  private boolean _jspx_th_c_forEach_0_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:forEach ---- //
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = new org.apache.taglibs.standard.tag.rt.core.ForEachTag();
    _jspx_th_c_forEach_0.setPageContext(pageContext);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${calSumList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("board");
    _jspx_th_c_forEach_0.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template37);
            // jsp code [from=(411,34);to=(411,44)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template38);
            // jsp code [from=(412,46);to=(412,64)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TAX_SET_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template39);
            // jsp code [from=(413,34);to=(413,55)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SUM_ADJUST_WON }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template40);
            // jsp code [from=(414,34);to=(414,48)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SUM_WON }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template41);
            // jsp code [from=(415,46);to=(415,66)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.REDUCTION_RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template42);

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
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_forEach_1.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${placeList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_1.setVar("board");
    _jspx_th_c_forEach_1.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
        if (_jspx_eval_c_forEach_1 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template50);
            // jsp code [from=(451,44);to=(451,59)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OBJECT_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template51);
            // jsp code [from=(451,65);to=(451,79)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TAX_SET }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template52);
            // jsp code [from=(452,46);to=(452,55)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${idx.count}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template53);
            // jsp code [from=(453,46);to=(453,56)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template54);
            // jsp code [from=(454,34);to=(454,47)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SORT_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template55);
            // jsp code [from=(454,51);to=(454,64)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.KIND_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template56);
            // ----  c:if ---- invoke //
            if (_jspx_th_c_if_0_fn(pageContext, _jspx_th_c_forEach_1)) return true;


            out.write(_jspx_template58);
            // ----  c:if ---- invoke //
            if (_jspx_th_c_if_1_fn(pageContext, _jspx_th_c_forEach_1)) return true;


            out.write(_jspx_template59);
            // jsp code [from=(459,34);to=(459,54)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SUM_ADJUST_WON}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template60);
            // jsp code [from=(460,34);to=(460,48)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.QUANTITY}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template61);
            // jsp code [from=(461,34);to=(461,49)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.DEPTH_NUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template62);
            // jsp code [from=(462,34);to=(462,52)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TAX_SET_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template63);
            // jsp code [from=(463,52);to=(463,73)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.CAL_STATUS_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template64);

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
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SEBU_NM == null}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template57);

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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SEBU_NM != null}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
      if (_jspx_eval_c_if_1 != Tag.SKIP_BODY) {
        do {
          // jsp code [from=(457,64);to=(457,77)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SEBU_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));


        } while (_jspx_th_c_if_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_1.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_1.release();
    }
    return false;
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
  private final static String _jspx_template9 = "    \r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n<script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script> \r\n  \r\n<script><!--\r\n\r\n\tfunction InitPage()\r\n\t{\r\n\r\n\t}\r\n\t\r\n\t//공시지가 팝업\r\n\tfunction openLandPricePopUp()\r\n\t{\r\n\t\tvar winW = 320;\r\n\t\tvar winH = 133;\r\n\t\tvar status =\"toolbar=no, location=no, directories=no, status=no, menubar=no, resizable=no, scrollbars=no, width=\"+winW+\", height=\"+winH+\", left=0, top=0\"\r\n\t\twindow.open('/jsp/jumyong/jumyong/officialLandPrice.html', 'win', status);\t\r\n\t}\r\n\r\n\tfunction calDate()\r\n\t{\r\n\t\tvar fromDate = removeDash(document.getElementById(\"FROMDATE\").value);\r\n\t\tvar toDate = removeDash(document.getElementById(\"TODATE\").value);\r\n\t\tvar date_type = document.getElementById(\"date_type\").value;\r\n//\t\tvar dateCount = 0;\r\n\t\tif(fromDate>toDate){\r\n\t\t\talert(\"시작날짜 종료날짜보다 더늦게 설정 할 수 없습니다.\");\r\n\t\t\tdocument.getElementById(\"FROMDATE\").value=\"\";\r\n\t\t\tdocument.getElementById(\"TODATE\").value=\"\";\r\n\t\t\treturn;\r\n\t\t}\r\n\t\tif(date_type == \"month\"){\r\n\t\tvar period = getDiffMon(fromDate,toDate)  ;\r\n\t\t}else{\r\n\t\tvar period = getDiffDay(fromDate,toDate)  ;\r\n\t\t}\t\t\r\n\t\tdocument.getElementById(\"period\").value = period;\r\n\t\t\r\n\t\tvar fromDay1 = new Date(fromDate.substr(0,4),Number(fromDate.substr(4,2))-1,fromDate.substr(6,2))\r\n\t\t\r\n\t\tvar toDay1 = new Date(toDate.substr(0,4),Number(toDate.substr(4,2))-1,toDate.substr(6,2))\t\t\r\n\t\t\r\n//\t\tvar dateCount =(toDay1 - fromDay1)/(1000*3600*24)+1;  \r\n\t\t\r\n//\t\tdocument.getElementById(\"dateCount\").value = dateCount;\r\n\t}\t\r\n\t\r\n\t\r\n\t// 대쉬 삭제\r\n\tfunction removeDash(numValue)\r\n\t{\r\n\t\treturn numValue.split('-').join(\"\");\r\n\t}\r\n\r\n\t/*\r\n\t\t//달 차이 계산\r\n\tfunction getDiffMon(val1,val2)\r\n\t{\r\n\t\r\n\t    var sdate = new Date(Number(val1.substr(0,4)),Number(val1.substr(4,2))-1,Number(val1.substr(6,2)));\r\n\t    var edate = new Date(Number(val2.substr(0,4)),Number(val2.substr(4,2))-1,Number(val2.substr(6,2)));\r\n\t    var sDate  = sdate.getDate();     \t\r\n\t    var count=0;\r\n\t    \r\n\t    edate.setDate(edate.getDate()+1);\r\n\t    \r\n//\t     alert(sdate+\"   \"+edate);\r\n\t    \r\n\t    while (Date.parse(edate)>=Date.parse(sdate)) {\r\n\t        if(sdate.getDate() == sDate){ //해당 요일과 같다면...\r\n\t          count++;\r\n\t        }\r\n\t      sdate.setDate(sdate.getDate()+1); //요일을 계속 증가\r\n\t    }\r\n\t    return count-1;\r\n\t}*/\r\n\r\n\tfunction getDiffDay(val1, val2){\t//날짜 일수 계산\r\n\t\tvar sdate_year = Number(val1.substr(0,4));\r\n\t\tvar sdate_month = Number(val1.substr(4,2));\r\n\t\tvar sdate_day = Number(val1.substr(6,2));\r\n\t\tvar edate_year = Number(val2.substr(0,4));\r\n\t\tvar edate_month = Number(val2.substr(4,2));\r\n\t\tvar edate_day = Number(val2.substr(6,2));\r\n\r\n\t\tvar year_result = edate_year-sdate_year;\r\n\t\t\r\n\t\tvar tot = 0;\r\n\t\t\r\n\t\ttot += year_result*365;\t\t//년도 차이 일수 계산\r\n\t\t\r\n\t\ttot += -day_cal(sdate_year, sdate_month, sdate_day)+1;\t\t//시작 날짜 일수 계산\r\n\t\ttot += day_cal(edate_year, edate_month, edate_day);\t\t\t//종료 날짜 일수 계산\r\n\t\t\r\n\t\treturn tot;\r\n\t}\r\n\r\n\tfunction day_cal(yy, mm, dd){\t//해당년도만의 일수 계산\r\n\r\n\t\tvar tot = 0;\r\n\t\tfor(var i=1;i<mm;i++){\r\n\t\t\ttot += f_dayofmonth(yy,i);\r\n\t\t}\r\n\t\treturn tot+dd;\r\n\t}\r\n\r\n\tfunction f_dayofmonth(yy,mm)\r\n\t{\r\n\t\tswitch (mm){\r\n\t\t\tcase 1: case 3: case 5: case 7: case 8: case 10: case 12:\r\n\t\t\t\treturn 31;\r\n\t\t\tcase 4: case 6: case 9: case 11:\r\n\t\t\t\treturn 30;\r\n\t\t\tcase 2:\r\n\t\t\t\treturn 28 + f_leapyear(yy);\r\n\t\t}\r\n\t}\r\n\t\r\n\tfunction f_leapyear(yy)\t\t//윤년 구하는 함수\r\n\t{\r\n\t\tif (yy%4==0 && yy%100!=0 || yy%400==0)\r\n\t\treturn 1;\r\n\t\telse\r\n\t\treturn 0;\r\n\t}\r\n\r\n\tfunction getDiffMon(val1,val2)\r\n\t{   \r\n\t\t// 날짜 입력 형식 : yyyy-mm-dd\r\n\t    var sdate_year = Number(val1.substr(0,4));\r\n\t    var sdate_month = Number(val1.substr(4,2));\r\n\t    var sdate_day = Number(val1.substr(6,2));\r\n\t    var edate_year = Number(val2.substr(0,4));\r\n\t    var edate_month = Number(val2.substr(4,2));\r\n\t    var edate_day = Number(val2.substr(6,2));\r\n\t    \r\n\t    v";
  private final static String _jspx_template10 = "ar year = edate_year - sdate_year;\t\t\t//년차이를 계산하고\r\n\t    var month = edate_month - sdate_month -1;\t//달차이를 계산하고  \r\n\r\n\t    var month_count = 0;\r\n\t    \r\n\t    if(sdate_day <= edate_day){\t\t\t\t\t\r\n\t    \tif(sdate_day>=30 && edate_day>=30 && sdate_month!=edate_month){\t\t// 예시) 8월31일 시작 9월 30일 종료 일때 달수 +1 증가\r\n\t    \t\tmonth_count++;\r\n\t    \t}else{\t\t//시작일자가 종료일자보다 작으면 달수 +1 증가\r\n\t    \t\tmonth_count++;\r\n\t    \t}\r\n\t    \t\r\n\t    }\r\n\t    \r\n\t    if(sdate_month==2 && edate_month==2 && sdate_day<edate_day && sdate_day==1){\t// 2월이 좀 특수한 관계로 2월1일부터 2월 말일 일때 달계산\r\n\t    \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t// 시작일자가 1이고 \r\n\t    \tif ((edate_year % 4 == 0 && edate_year % 100 != 0) || edate_year % 400 == 0){\t//윤달 여부에 관련해서 \r\n\t    \t\tif(edate_day==29)\t\t//윤달이면 마지막 날짜가 29일일때 달수 +1 증가\r\n\t    \t\t\tmonth_count++;\r\n\t    \t}else{\r\n\t    \t\tif(edate_day==28)\t\t//윤달이 아니면 마지막 날짜가 28일때 +1증가\r\n\t    \t\t\tmonth_count++;\r\n\t    \t}\t\t\r\n\t    }\r\n\t    \r\n\t    if(sdate_month==edate_month && sdate_day==1 && edate_day>=30){\t// 각달의 1일부터 말일 일때 달수 +1 증가\r\n\t    \tmonth_count++;\r\n\t    }\r\n\t    \r\n\t    if(sdate_day==1 && edate_day>=30 && sdate_month!=edate_month){\t\t// 시작일자가 1일이고 끝나는 날짜가 30일 이상이면 달수 +1 증가\r\n\t    \tmonth_count++;\r\n\t    }\r\n\t    \r\n\t    month_count = month_count + (year*12) + month;\t//최종적으로 달수 계산\r\n\t    \r\n\t    return month_count;\r\n\t}\r\n\r\n\tfunction Calculate()\r\n\t{\r\n\t\tif(document.getElementById(\"RATE\").value==\"\" || document.getElementById(\"RATE\").value==\"0\" || document.getElementById(\"RATE\").value==\"0.0\"){\r\n\t\t\talert(\"산출단가를 넣어주세요.\");\r\n\t\t\tdocument.getElementById(\"RATE\").focus();\r\n\t\t\treturn;\r\n\t\t}\r\n\t\t\r\n\t\tif(document.getElementById(\"FROMDATE\").value==\"\"){\r\n\t\t\talert(\"산출시작 날짜을 넣어주세요.\");\r\n\t\t\tdocument.getElementById(\"FROMDATE\").focus();\r\n\t\t\treturn;\r\n\t\t}\r\n\t\tif(document.getElementById(\"TODATE\").value==\"\"){\r\n\t\t\talert(\"산출종료 날짜을 넣어주세요.\");\r\n\t\t\tdocument.getElementById(\"TODATE\").focus();\r\n\t\t\treturn;\r\n\t\t}\r\n\t\tif(document.getElementById(\"FROMDATE\").value> document.getElementById(\"TODATE\").value){\r\n\t\t\talert(\"산출시작 날짜는 산출종료 날짜보다 늦게 설정할수 없습니다.\");\r\n\t\t\tdocument.getElementById(\"FROMDATE\").value=\"\";\r\n\t\t\tdocument.getElementById(\"TODATE\").value=\"\";\r\n\t\t\treturn;\r\n\t\t}\r\n\t\t\r\n\t\tif(document.getElementById(\"PERIOD\").value==\"\" || document.getElementById(\"PERIOD\").value==\"0\"){\r\n\t\t\talert(\"개월수를 설정해 주세요\");\t\t\t\r\n\t\t\treturn;\r\n\t\t}\r\n\t\tcalDate();\r\n\r\n\t\tvar date_type = document.getElementById(\"date_type\").value;\r\n\t\tvar quantity = document.getElementById(\"QUANTITY\").value;\r\n\t\tvar depth_rate = document.getElementById(\"DEPTH_NUM\").value;\r\n\t\tvar rate = document.getElementById(\"RATE\").value;\r\n\t\tvar period = document.getElementById(\"PERIOD\").value;\r\n\t\tvar form_adjust = document.getElementById(\"FORM_ADJUST\").value;\t\t\r\n\t\tvar sum_adjust = document.getElementById(\"SUM_ADJUST\").value;\r\n\r\n\t\tif(date_type==\"month\"){\r\n\t\tdocument.getElementById(\"SUM_ADJUST\").value = Math.floor(Number(quantity) * (100-Number(depth_rate))/100*Number(rate)*Number(period)/12);\r\n\t\tdocument.getElementById(\"FORM_ADJUST\").value = quantity+ \" * \" + \" (100-\"+Number(depth_rate)+\" )/100*\"+ Number(rate)+\" * \"+ Number(period)+\" /12 \";\r\n\t\t}else{\r\n\t\t\tdocument.getElementById(\"SUM_ADJUST\").value = Math.floor(Number(quantity) * (100-Number(depth_rate))/100*Number(rate)*Number(period)/365);\r\n\t\t\tdocument.getElementById(\"FORM_ADJUST\").value = quantity+ \" * \" + \" (100-\"+Number(depth_rate)+\" )/100*\"+ Number(rate)+\" * \"+ Number(period)+\" /365 \";\t\r\n\t\t}\r\n\t}\r\n\t\r\n\tfunction goview(object_no)\r\n\t{\r\n\t\tvar gu_code= document.getElementById(\"gu_code\").value;\r\n\t\tvar corp_cd = document.getElementById(\"corp_cd\").value;\r\n\t\tvar request_no= document.getElementById(\"request_no\").value;\r\n\t\tvar currentPage= document.getElementById(\"currentPage\").value;\r\n\t\t\r\n\t\tvar year = \"";
  private final static String _jspx_template11 = "\";\r\n\r\n\t\tlocation.href=\"/facility/jumyong/product_view.do?GU_CODE=\"+gu_code+\"&CORP_CD=\"+corp_cd\r\n\t\t+\"&REQUEST_NO=\"+request_no+\"&currentPage=\"+currentPage+\"&OBJECT_NO=\"+object_no+\"&YEAR=\"+year;\r\n\t}\r\n\r\n\tfunction goviewer(object_no , tax_set)\r\n\t{\r\n\t\tvar gu_code= document.getElementById(\"gu_code\").value;\r\n\t\tvar corp_cd = document.getElementById(\"corp_cd\").value;\r\n\t\tvar request_no= document.getElementById(\"request_no\").value;\r\n\t\tvar currentPage= document.getElementById(\"currentPage\").value;\r\n\t\t\r\n\t\tvar year = \"";
  private final static String _jspx_template12 = "\";\r\n\r\n\t\tlocation.href=\"/facility/jumyong/product_view.do?GU_CODE=\"+gu_code+\"&CORP_CD=\"+corp_cd\r\n\t\t+\"&REQUEST_NO=\"+request_no+\"&currentPage=\"+currentPage+\"&OBJECT_NO=\"+object_no+\"&YEAR=\"+year+\"&TAX_SET=\"+tax_set;\r\n\t}\r\n\r\n\tfunction submitClick()\r\n\t{\r\n\t\t\r\n\t\t\r\n\t\t// 직접산출시  널체크\r\n\t\tif( '";
  private final static String _jspx_template13 = "' == 'direct' ){\r\n\t\t\tif(document.getElementById(\"RATE\").value==\"\" || document.getElementById(\"RATE\").value==\"0\" || document.getElementById(\"RATE\").value==\"0.0\"){\r\n\t\t\t\talert(\"산출단가를 넣어주세요.\");\r\n\t\t\t\tdocument.getElementById(\"RATE\").focus();\r\n\t\t\t\treturn;\r\n\t\t\t}\r\n\t\t\tif(document.getElementById(\"FROMDATE\").value==\"\"){\r\n\t\t\t\talert(\"산출시작 날짜을 넣어주세요.\");\r\n\t\t\t\tdocument.getElementById(\"FROMDATE\").focus();\r\n\t\t\t\treturn;\r\n\t\t\t}\r\n\t\t\tif(document.getElementById(\"TODATE\").value==\"\"){\r\n\t\t\t\talert(\"산출종료 날짜을 넣어주세요.\");\r\n\t\t\t\tdocument.getElementById(\"TODATE\").focus();\r\n\t\t\t\treturn;\r\n\t\t\t}\r\n\t\t\tif(document.getElementById(\"FROMDATE\").value> document.getElementById(\"TODATE\").value){\r\n\t\t\t\talert(\"산출시작 날짜는 산출종료 날짜보다 늦게 설정할수 없습니다.\");\r\n\t\t\t\tdocument.getElementById(\"FROMDATE\").value=\"\";\r\n\t\t\t\tdocument.getElementById(\"TODATE\").value=\"\";\r\n\t\t\t\treturn;\r\n\t\t\t}\r\n\t\t\tif(document.getElementById(\"PERIOD\").value==\"\" || document.getElementById(\"PERIOD\").value==\"0\"){\r\n\t\t\t\talert(\"개월수를 설정해 주세요\");\t\t\t\r\n\t\t\t\treturn;\r\n\t\t\t}\r\n\t\t\tif(document.getElementById(\"FORM_ADJUST\").value==\"\"){\r\n\t\t\t\talert(\"일반산출식을  넣어주세요.\");\r\n\t\t\t\treturn;\r\n\t\t\t}\r\n\t\t\tif(document.getElementById(\"SUM_ADJUST\").value==\"\" || document.getElementById(\"SUM_ADJUST\").value==\"\" || document.getElementById(\"SUM_ADJUST\").value==\"0\"){\r\n\t\t\t\talert(\"일반 점용료를  넣어주세요.\");\r\n\t\t\t\treturn;\r\n\t\t\t}\r\n\t\t}\r\n\t\telse{\r\n\t\t\tif(document.getElementById(\"SUM_ADJUST\").value==\"0\" || document.getElementById(\"SUM_ADJUST\").value==\"\" || document.getElementById(\"SUM_ADJUST\").value==\" \"){\r\n\t\t\t\talert(\"계산을 하셔야 저장이 가능합니다.\");\r\n\t\t\t\treturn;\r\n\t\t\t}\r\n\t\t\r\n\t\t}\r\n\t\tvar productForm = document.productForm;\r\n\r\n\t\tproductForm.submit();\r\n\t}\r\n\t\r\n\t\r\n\t//숫자만 입력\r\n\t\r\n\tfunction onlyNumberInput()\r\n\t{\r\n\t var code = window.event.keyCode;\r\n\t\r\n\t if ((code > 34 && code < 41) || (code > 47 && code < 58) || (code > 95 && code < 106) || code == 8 || code == 9 || code == 13 || code == 46 || code == 190 || code == 110)\r\n\t {\r\n\t  \twindow.event.returnValue = true;\r\n\t\treturn;\r\n\t }else \r\n\t {\t \r\n\t \twindow.event.returnValue = false;\r\n\t \treturn;\r\n \t }\r\n\t}\r\n\r\n\t\r\n\tfunction Page(page)\r\n\t{\r\n\t\tif(page\t==\t\"\")\r\n\t\t\treturn;\r\n\t\t\r\n\t\t//var form = document.productForm;\r\n\t\tvar gu_code = document.productForm.gu_code.value;\r\n\t\tvar corp_cd = document.productForm.corp_cd.value;\r\n\t\tvar request_no = document.productForm.request_no.value;\r\n\t\t//var object_no = document.productForm.object_no.value;\r\n\t\t//var tax_set = document.productForm.tax_set.value;\r\n\t\t//var seq = document.productForm.seq.value;\r\n\t\t//var mode = document.productForm.mode.value;\r\n\t\t//var direct = document.productForm.direct.value;\r\n\t\t//\t/facility/jumyong/productInsert.do\r\n\t\t//alert('corp_cd' + request_no);\r\n\t\t//alert(request_no);\r\n\t\tlocation.href = \"/facility/jumyong/productInsert.do?currentPage=\"+page+\"&GU_CODE=\"+gu_code+\"&CORP_CD=\"+corp_cd\r\n\t\t\t+\"&REQUEST_NO=\"+request_no;\r\n\r\n\t}\t\r\n\t\r\n\t\r\n\r\n\t\r\n--></script>\r\n\r\n</head>\r\n\r\n<body onload=\"javascript:InitPage();\"  border=\"0\">\r\n\r\n<form name=\"productForm\" id=\"productForm\" method=\"post\" action = \"/facility/jumyong/productInsert.do\" >\r\n";
  private final static String _jspx_template14 = "\r\n\t<input type=\"hidden\" NAME=\"GU_CODE\" ID=\"gu_code\" value=\"";
  private final static String _jspx_template15 = "\">\r\n";
  private final static String _jspx_template16 = "\r\n";
  private final static String _jspx_template17 = "\r\n\t<input type=\"hidden\" NAME=\"CORP_CD\" ID=\"corp_cd\" value=\"";
  private final static String _jspx_template18 = "\">\r\n";
  private final static String _jspx_template19 = "\r\n";
  private final static String _jspx_template20 = "\r\n\t<input type=\"hidden\" NAME=\"REQUEST_NO\" ID=\"request_no\" value=\"";
  private final static String _jspx_template21 = "\">\r\n";
  private final static String _jspx_template22 = "\r\n";
  private final static String _jspx_template23 = "\r\n\t<input type=\"hidden\" NAME=\"OBJECT_NO\" ID=\"OBJECT_NO\" value=\"";
  private final static String _jspx_template24 = "\">\r\n";
  private final static String _jspx_template25 = "\r\n";
  private final static String _jspx_template26 = "\r\n\t<input type=\"hidden\" NAME=\"TAX_SET\" ID=\"TAX_SET\" value=\"";
  private final static String _jspx_template27 = "\">\r\n";
  private final static String _jspx_template28 = "\r\n";
  private final static String _jspx_template29 = "\r\n\t<input type=\"hidden\" NAME=\"SEQ\" ID=\"SEQ\" value=\"";
  private final static String _jspx_template30 = "\">\r\n";
  private final static String _jspx_template31 = "\r\n\r\n\r\n<input type=\"hidden\" NAME=\"currentPage\" ID=\"currentPage\" value=\"";
  private final static String _jspx_template32 = "\" >\r\n<input type=\"hidden\" NAME=\"mode\" ID=\"mode\" value=\"";
  private final static String _jspx_template33 = "\">\r\n<input type=\"hidden\" NAME=\"direct\" ID=\"direct\" value=\"";
  private final static String _jspx_template34 = "\">\r\n\t<table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t<tr>\r\n\t\t\t<td class=\"contborder_purple\">\t\t\r\n\t\t\t\t\t\t\t            \r\n\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td>\t\r\n\t\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t                    <td height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">년도</td>\t\t\t\t\t\t\t\t\r\n\t\t\t\t                    <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">세입구분</td>\r\n\t\t\t\t                    <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">일반 점용료 </td>\r\n\t\t\t\t                    <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">부과 점용료(감면적용)</td>\t\t\t\r\n\t\t\t\t                    <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">감면율</td>\t\t\t\t                    \t                    \r\n\t\t\t                    </tr>\r\n\t\t\t                    ";
  private final static String _jspx_template35 = "\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template36 = "\r\n\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template37 = "\r\n\t\t\t\t\t\t\t\t\t\t\t<tr onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\" >\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template38 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td height=\"28\" align=\"center\">";
  private final static String _jspx_template39 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template40 = "원</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template41 = "원</td>\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td height=\"28\" align=\"center\">";
  private final static String _jspx_template42 = "%</td>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t</tr> \r\n\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template43 = "\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template44 = "\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template45 = "\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td align=\"center\" class=\"sub_table\" colspan=\"5\" height=\"85\">검색된 내용이 없습니다</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template46 = "\r\n\t\t\t\t\t\t\t ";
  private final static String _jspx_template47 = "\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"40\" align=\"left\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t<br><br>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t                    <td height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">번호</td>\r\n\t\t\t\t                    <td height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">&nbsp년도&nbsp</td>\t\t\t\t                    \r\n\t\t\t\t                    <td  align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용목적</td>\r\n\t\t\t\t                    <td  align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">상세</br>시설물</td>\t\t\t\t                    \r\n\t\t\t\t                    <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">일반 점용료</td>\t\t\t\t                    \t\t\t\t                    \t\t\t\t                    \r\n\t\t\t\t                    <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">연장</br>(수량)</td>\r\n\t\t\t\t                    <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">심도</br>감액율</td>\r\n\t\t\t\t                    <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">세입구분</td>\r\n\t\t\t\t                    <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">산출여부 </td>\t\t\t\t                    \r\n\t\t\t                    </tr>\r\n\t\t\t                    ";
  private final static String _jspx_template48 = "\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template49 = "\r\n\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template50 = "\r\n\t\t\t\t\t\t\t\t\t\t\t<tr onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\" \r\n\t\t\t\t\t\t\t\t\t\t\tonclick=\"javascript:goviewer('";
  private final static String _jspx_template51 = "','";
  private final static String _jspx_template52 = "');\" style=\"cursor:pointer\" >\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\">";
  private final static String _jspx_template53 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\">";
  private final static String _jspx_template54 = "</td>\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template55 = " ";
  private final static String _jspx_template56 = "</td>\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t  ";
  private final static String _jspx_template57 = " - ";
  private final static String _jspx_template58 = "\t\r\n\t\t\t\t\t\t\t\t\t              ";
  private final static String _jspx_template59 = "\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t</td>\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template60 = " 원</td>\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template61 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template62 = "%</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template63 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\"><font color='red'>";
  private final static String _jspx_template64 = "</font></td>\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template65 = "\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template66 = "\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template67 = "\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" class=\"sub_table\" colspan=\"5\" height=\"85\">검색된 내용이 없습니다</td>\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template68 = "\r\n\t\t\t\t\t\t\t\t ";
  private final static String _jspx_template69 = "\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"40\" align=\"center\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td align=\"center\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t\t\t\t\t\t    \t<tr>";
  private final static String _jspx_template70 = "</tr>\r\n\t\t\t\t\t\t\t    \t</table>\r\n\t\t\t\t\t\t\t    </td>\r\n\t\t                    </tr></table>\r\n\t\t                </td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td class=\"sub_table_b\"> ※ 점용료 산출\r\n\t\t\t\t\t\t</td></tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">기준 년도</td>\r\n\t\t\t\t\t\t\t\t    <td width=\"40%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\t\t\t\t\t\t\t\t\t    \t";
  private final static String _jspx_template71 = "\r\n\t\t\t\t\t\t\t\t\t    \t  <input name=\"YEAR\" id=\"YEAR\" type=\"text\" class=\"input_form1\" style=\"width:50px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template72 = "\"   onKeyDown=\"onlyNumberInput();\" style=\"text-align:right\" >년\r\n\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template73 = "\r\n\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t</td> \r\n\t\t\t\t\t\t\t\t\t<td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">연장 수량</td>\r\n\t\t\t\t\t\t\t\t    <td width=\"40%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\t\t\t\t\t\t\t\t\t    ";
  private final static String _jspx_template74 = "\r\n\t\t\t\t\t\t\t\t\t    \t";
  private final static String _jspx_template75 = "\r\n\t\t\t\t\t\t\t\t\t\t    <input name=\"QUANTITY\" id=\"QUANTITY\" type=\"hidden\" class=\"input_form1\" style=\"width:50px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template76 = "\"   onKeyDown=\"onlyNumberInput();\" style=\"text-align:right\" >개/m\r\n\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template77 = "\r\n\t\t\t\t\t\t\t\t\t</td> \r\n\t\t\t\t\t\t\t    </tr>\t\t\t\t\t\t   \r\n\t\t\t\t\t\t\t     \t<tr>\r\n\t\t\t\t\t\t\t\t    <td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" >산출단가</td>\r\n\t\t\t\t\t\t\t\t    <td width=\"42%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\t\t\t\t\t\t\t\t\t    ";
  private final static String _jspx_template78 = "\r\n\t\t\t\t\t\t\t\t\t\t\t<input name=\"RATE\" id=\"RATE\" type=\"text\" class=\"input_form1\" style=\"width:50px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template79 = "\"   onKeyDown=\"onlyNumberInput();\" style=\"text-align:right\"  >원\r\n\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template80 = "\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t<td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">심도 감액율</td>\r\n\t\t\t\t\t\t\t\t    <td width=\"26%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\t\t\t\t\t\t\t\t\t    ";
  private final static String _jspx_template81 = "                    \t\t\t\t\t\t\t\t    \r\n\t\t\t\t\t\t\t\t\t\t\t<input name=\"DEPTH_NUM\" id=\"DEPTH_NUM\" type=\"text\" class=\"input_form1\" style=\"width:50px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template82 = "\"   onKeyDown=\"onlyNumberInput();\" style=\"text-align:right\"  >%\r\n\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template83 = "\r\n\t\t\t\t\t\t\t\t\t</td> \r\n\t\t\t\t\t\t\t    </tr>\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t                    <td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">산출기간</td>\r\n\t\t\t\t                    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" ><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t                        <tr>\r\n\t\t\t\t\t                          <td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t    ";
  private final static String _jspx_template84 = "\r\n\t\t\t\t\t\t                          \t\t<input name=\"FROMDATE\" id=\"FROMDATE\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template85 = "\"  onKeyDown=\"onlyNumberInput();\"   onKeyDown=\"onlyNumberInput();\" maxlength=8>\r\n\t\t\t\t\t\t                          \t";
  private final static String _jspx_template86 = "\r\n\t\t\t\t\t                          </td>\r\n\t\t\t\t\t                          <td>\r\n\t\t\t\t\t\t                          <img src=\"/img/calendar_icon.gif\" onclick=\"popUpCalendar(this, document.getElementById('FROMDATE'), 'yyyymmdd');\" style=\"cursor:pointer\" >\r\n\t\t\t\t\t                          </td>\r\n\t\t\t\t\t                          <td width=\"16\" align=\"center\">~</td>\r\n\t\t\t\t\t                          <td>\r\n\t\t\t\t\t\t\t\t\t\t\t    ";
  private final static String _jspx_template87 = "\r\n\t\t\t\t\t\t                          \t<input name=\"TODATE\" id=\"TODATE\" type=\"text\" class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template88 = "\"  onKeyDown=\"onlyNumberInput();\" maxlength=8>\r\n\t\t\t\t\t                          \t";
  private final static String _jspx_template89 = "\r\n\t\t\t\t\t                          </td>\r\n\t\t\t\t\t                          <td>\r\n\t\t\t\t\t                     \t\t<img src=\"/img/calendar_icon.gif\" onclick=\"popUpCalendar(this, document.getElementById('TODATE'), 'yyyymmdd');\" style=\"cursor:pointer\" >\r\n\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"/img/cal_month.gif\" alt=\"달수계산\" height=\"18\" border=\"0\" style=\"cursor:pointer\" onClick=\"javascript:calDate();\">\r\n\t\t\t\t\t                          </td>\r\n\t\t\t\t\t                        </tr>\r\n\t\t\t\t\t                    </table></td>  \r\n\t\t\t\t                    <td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">\r\n\t\t\t\t                    \t <select id=\"date_type\" class=\"input_form1\" onchange=\"javascript:calDate();\">\r\n                            \t\t\t\t<option value=\"month\">개월</option>\r\n                            \t\t\t\t<option value=\"day\">일</option>\r\n                        \t\t\t\t</select>수\r\n\t\t\t\t                    </td>\r\n\t\t\t\t                    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\t\t\t\t\t\t\t\t\t    ";
  private final static String _jspx_template90 = "\r\n\t\t\t\t\t\t\t\t\t\t\t<input name=\"PERIOD\" id=\"PERIOD\" type=\"text\" class=\"input_form1\" style=\"width:50px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template91 = "\"   onKeyDown=\"onlyNumberInput();\" style=\"text-align:right\"  >개월/일\r\n\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template92 = "\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t   <tr>\r\n\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">일반 산출식</td>\r\n\t\t\t\t\t\t\t        <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\t\t\t\t\t\t\t\t\t    ";
  private final static String _jspx_template93 = "\t\t\t\t\t\t\t        \r\n\t\t\t\t\t\t\t\t\t\t\t<input name=\"FORM_ADJUST\" id=\"FORM_ADJUST\" type=\"text\" class=\"input_form1\" style=\"width:250px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template94 = "\"   >\r\n\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template95 = "\r\n\t\t\t\t\t\t\t\t\t</td> \r\n\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">일반 점용료</td>\r\n\t\t\t\t\t\t\t        <td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\t\t\t\t\t\t\t\t\t    ";
  private final static String _jspx_template96 = "\r\n\t\t\t\t\t\t\t\t\t\t\t<input name=\"SUM_ADJUST\" id=\"SUM_ADJUST\" type=\"text\" class=\"input_form1\" style=\"width:50px;ime-mode:disabled;\" value=\"";
  private final static String _jspx_template97 = "\"  style=\"text-align:right\" >\r\n\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template98 = "\r\n\t\t\t\t\t\t\t\t\t</td> \r\n\t\t\t\t\t\t\t\t</tr> \r\n\t\t\t\t\t\t\t</table></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t  <!-- 간접산출일때만 계산하도록 start -->\r\n\t\t\t\t\t  ";
  private final static String _jspx_template99 = "\r\n\t\t\t\t\t  <tr>              \r\n\t\t                <td height=\"40\" align=\"right\">\r\n\t\t                \t<img src=\"/img/accou_icon.gif\" alt=\"계산\" width=\"56\" height=\"18\" border=\"0\" onclick=\"javascript:Calculate();\" style=\"cursor:pointer\">\r\n\t\t\t            </td>\r\n\t\t              </tr>\r\n\t\t              ";
  private final static String _jspx_template100 = "\r\n\t\t              <!-- 간접산출일때만 계산하도록 end -->\r\n\t\t\t\t\t<tr>              \r\n\t\t\t\t\t\t<td height=\"40\" align=\"right\">\r\n\t\t\t\t\t\t\t<table border=\"0\" width=\"100%\">\r\n\t\t\t\t\t\t\t\t<tr>              \r\n\t\t\t\t\t                <td height=\"40\" align=\"right\">\r\n\t\t\t\t                \t<img src=\"/img/can_icon.gif\" alt=\"취소\" border=\"0\" onclick=\"javascript:history.back();\" style=\"cursor:pointer\" >\r\n\t\t\t\t\t                <img src=\"/img/save_icon2.gif\" alt=\"저장\" width=\"56\" height=\"18\" border=\"0\"\r\n\t\t\t\t\t\t                onClick=\"javascript:submitClick();\"  style=\"cursor:pointer\">\r\n\t\t\t\t\t\t                </td>\r\n\t\t\t\t\t            </tr>\r\n\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t</table>\r\n\t\t\t</td>\r\n\t\t</tr>\t\t          \r\n\t</table>\r\n</form>\r\n\r\n\r\n\r\n</body>\r\n</html>\r\n\r\n";
}
