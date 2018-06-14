package jeus_jspwork._jsp._jumyong._oldminwon;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_view_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(127,68);to=(127,79)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(128,66);to=(128,76)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SERIAL_NBR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(129,60);to=(129,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GU_CODE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(130,66);to=(130,76)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ILKWAL_NBR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(131,50);to=(131,52)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${YY}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(149,66);to=(149,74)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(161,64);to=(161,88)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${apjy20mr1Bean.SERIAL_NBR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(163,64);to=(163,83)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${apjy20mr1Bean.JUMNM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(169,22);to=(169,41)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${apjy20mr1Bean.ID_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(175,53);to=(175,72)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${apjy20mr1Bean.POST1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(175,76);to=(175,95)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${apjy20mr1Bean.POST2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(175,100);to=(175,113)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${zipBean.SI_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(175,117);to=(175,131)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${zipBean.SGG_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(175,135);to=(175,149)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${zipBean.EMD_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // jsp code [from=(175,153);to=(175,166)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${zipBean.RI_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);
      // jsp code [from=(176,22);to=(176,39)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${zipBean.ISLAND_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template26);
      // jsp code [from=(176,43);to=(176,58)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${zipBean.LNDN_CM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // jsp code [from=(176,62);to=(176,75)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${zipBean.BD_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template28);
      // jsp code [from=(176,79);to=(176,100)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${apjy20mr1Bean.JUMADDR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template29);
      // jsp code [from=(180,52);to=(180,72)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${apjy20mr1Bean.JUMTEL}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template30);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_0_fn(pageContext, null)) return;


      out.write(_jspx_template32);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_1_fn(pageContext, null)) return;


      out.write(_jspx_template34);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_2_fn(pageContext, null)) return;


      out.write(_jspx_template36);
      // jsp code [from=(190,53);to=(190,73)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${apjy20mr1Bean.JUMMOK}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template37);
      // jsp code [from=(190,78);to=(190,103)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${apjy20mr1Bean.JUMMOK_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template38);
      // jsp code [from=(193,11);to=(193,30)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${apjy20mr1Bean.JIBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template39);
      // jsp code [from=(193,35);to=(193,46)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bjdong_code}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template40);
      // jsp code [from=(193,51);to=(193,62)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${hjdong_code}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template41);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_3_fn(pageContext, null)) return;


      out.write(_jspx_template43);
      // jsp code [from=(193,117);to=(193,134)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${apjy20mr1Bean.BUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template44);
      // jsp code [from=(193,140);to=(193,156)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${apjy20mr1Bean.JI}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template45);
      // jsp code [from=(198,52);to=(198,72)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${apjy20mr1Bean.JUMDAN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template46);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_4_fn(pageContext, null)) return;


      out.write(_jspx_template48);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_5_fn(pageContext, null)) return;


      out.write(_jspx_template50);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_6_fn(pageContext, null)) return;


      out.write(_jspx_template52);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_7_fn(pageContext, null)) return;


      out.write(_jspx_template54);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_8_fn(pageContext, null)) return;


      out.write(_jspx_template56);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_9_fn(pageContext, null)) return;


      out.write(_jspx_template58);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_10_fn(pageContext, null)) return;


      out.write(_jspx_template60);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_11_fn(pageContext, null)) return;


      out.write(_jspx_template62);
      // jsp code [from=(217,52);to=(217,73)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${apjy20mr1Bean.HEO_NBR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template63);
      // jsp code [from=(222,52);to=(222,73)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${apjy20mr1Bean.HF_DATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template64);
      // jsp code [from=(224,52);to=(224,73)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${apjy20mr1Bean.HL_DATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template65);
      // jsp code [from=(229,52);to=(229,71)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${apjy20mr1Bean.JUMYO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template66);
      // jsp code [from=(231,52);to=(231,71)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${apjy20mr1Bean.GSAMT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template67);
      // jsp code [from=(236,64);to=(236,85)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${apjy20mr1Bean.REMARKS}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template68);
      // jsp code [from=(251,187);to=(251,197)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SERIAL_NBR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template69);
      // jsp code [from=(251,209);to=(251,216)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GU_CODE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template70);
      // jsp code [from=(263,79);to=(263,88)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${listCount}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template71);
      // ----  c:choose ---- invoke //
      if (_jspx_th_c_choose_0_fn(pageContext, null)) return;


      out.write(_jspx_template101);
      // jsp code [from=(317,12);to=(317,19)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${pageing}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template102);

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
  private boolean _jspx_th_c_if_0_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:if ---- //
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = new org.apache.taglibs.standard.tag.rt.core.IfTag();
    _jspx_th_c_if_0.setPageContext(pageContext);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${apjy20mr1Bean.JIMOK == '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template31);

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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${apjy20mr1Bean.JIMOK == '2'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
      if (_jspx_eval_c_if_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template33);

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
    _jspx_th_c_if_2.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${apjy20mr1Bean.JIMOK == '3'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
      if (_jspx_eval_c_if_2 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template35);

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
    _jspx_th_c_if_3.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${apjy20mr1Bean.SAN == '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
      if (_jspx_eval_c_if_3 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template42);

        } while (_jspx_th_c_if_3.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_3.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_3.release();
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
    _jspx_th_c_if_4.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${apjy20mr1Bean.SOYU == '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
      if (_jspx_eval_c_if_4 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template47);

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
    _jspx_th_c_if_5.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${apjy20mr1Bean.SOYU == '2'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
      if (_jspx_eval_c_if_5 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template49);

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
    _jspx_th_c_if_6.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${apjy20mr1Bean.SOYU == '3'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
      if (_jspx_eval_c_if_6 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template51);

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
    _jspx_th_c_if_7.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${apjy20mr1Bean.SOYU == '4'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_7 = _jspx_th_c_if_7.doStartTag();
      if (_jspx_eval_c_if_7 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template53);

        } while (_jspx_th_c_if_7.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_7.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_7.release();
    }
    return false;
  }

  private boolean _jspx_th_c_if_8_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:if ---- //
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_8 = new org.apache.taglibs.standard.tag.rt.core.IfTag();
    _jspx_th_c_if_8.setPageContext(pageContext);
    _jspx_th_c_if_8.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${apjy20mr1Bean.SOYU == '5'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_8 = _jspx_th_c_if_8.doStartTag();
      if (_jspx_eval_c_if_8 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template55);

        } while (_jspx_th_c_if_8.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_8.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_8.release();
    }
    return false;
  }

  private boolean _jspx_th_c_if_9_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:if ---- //
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_9 = new org.apache.taglibs.standard.tag.rt.core.IfTag();
    _jspx_th_c_if_9.setPageContext(pageContext);
    _jspx_th_c_if_9.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${apjy20mr1Bean.HEOGA == '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_9 = _jspx_th_c_if_9.doStartTag();
      if (_jspx_eval_c_if_9 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template57);

        } while (_jspx_th_c_if_9.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_9.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_9.release();
    }
    return false;
  }

  private boolean _jspx_th_c_if_10_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:if ---- //
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_10 = new org.apache.taglibs.standard.tag.rt.core.IfTag();
    _jspx_th_c_if_10.setPageContext(pageContext);
    _jspx_th_c_if_10.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${apjy20mr1Bean.HEOGA == '2'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_10 = _jspx_th_c_if_10.doStartTag();
      if (_jspx_eval_c_if_10 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template59);

        } while (_jspx_th_c_if_10.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_10.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_10.release();
    }
    return false;
  }

  private boolean _jspx_th_c_if_11_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:if ---- //
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_11 = new org.apache.taglibs.standard.tag.rt.core.IfTag();
    _jspx_th_c_if_11.setPageContext(pageContext);
    _jspx_th_c_if_11.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${apjy20mr1Bean.HEOGA == '3'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_11 = _jspx_th_c_if_11.doStartTag();
      if (_jspx_eval_c_if_11 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template61);

        } while (_jspx_th_c_if_11.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_11.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_11.release();
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
    try {
      int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
      if (_jspx_eval_c_choose_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template72);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template98);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template100);

        } while (_jspx_th_c_choose_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_choose_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_choose_0.release();
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
    _jspx_th_c_when_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist != null && !empty blist}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
      if (_jspx_eval_c_when_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template73);
          // ----  c:forEach ---- invoke //
          if (_jspx_th_c_forEach_0_fn(pageContext, _jspx_th_c_when_0)) return true;


          out.write(_jspx_template97);

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
          out.write(_jspx_template99);

        } while (_jspx_th_c_otherwise_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_otherwise_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_otherwise_0.release();
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("board");
    _jspx_th_c_forEach_0.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template74);
            // jsp code [from=(283,173);to=(283,183)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SERIAL_NBR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template75);
            // jsp code [from=(283,189);to=(283,196)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GU_CODE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template76);
            // jsp code [from=(283,202);to=(283,218)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ILKWAL_NBR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template77);
            // jsp code [from=(283,224);to=(283,232)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YY}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template78);
            // jsp code [from=(284,41);to=(284,49)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YY}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template79);
            // ----  c:if ---- invoke //
            if (_jspx_th_c_if_12_fn(pageContext, _jspx_th_c_forEach_0)) return true;


            out.write(_jspx_template81);
            // ----  c:if ---- invoke //
            if (_jspx_th_c_if_13_fn(pageContext, _jspx_th_c_forEach_0)) return true;


            out.write(_jspx_template83);
            // jsp code [from=(289,47);to=(289,62)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BUKWA_NBR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template84);
            // ----  c:if ---- invoke //
            if (_jspx_th_c_if_14_fn(pageContext, _jspx_th_c_forEach_0)) return true;


            out.write(_jspx_template86);
            // ----  c:if ---- invoke //
            if (_jspx_th_c_if_15_fn(pageContext, _jspx_th_c_forEach_0)) return true;


            out.write(_jspx_template88);
            // ----  c:if ---- invoke //
            if (_jspx_th_c_if_16_fn(pageContext, _jspx_th_c_forEach_0)) return true;


            out.write(_jspx_template90);
            // jsp code [from=(295,47);to=(295,58)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.JUMNM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template91);
            // jsp code [from=(296,47);to=(296,59)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.JUMDAN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template92);
            // jsp code [from=(297,47);to=(297,62)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BUKWA_AMT}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template93);
            // jsp code [from=(298,47);to=(298,63)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BUKWA_DATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template94);
            // jsp code [from=(299,47);to=(299,60)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.HF_DATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template95);
            // jsp code [from=(300,47);to=(300,60)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.HL_DATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template96);

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

  private boolean _jspx_th_c_if_12_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:if ---- //
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_12 = new org.apache.taglibs.standard.tag.rt.core.IfTag();
    _jspx_th_c_if_12.setPageContext(pageContext);
    _jspx_th_c_if_12.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_if_12.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GUBUN == '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_12 = _jspx_th_c_if_12.doStartTag();
      if (_jspx_eval_c_if_12 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template80);

        } while (_jspx_th_c_if_12.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_12.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_12.release();
    }
    return false;
  }

  private boolean _jspx_th_c_if_13_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:if ---- //
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_13 = new org.apache.taglibs.standard.tag.rt.core.IfTag();
    _jspx_th_c_if_13.setPageContext(pageContext);
    _jspx_th_c_if_13.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_if_13.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GUBUN == '2'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_13 = _jspx_th_c_if_13.doStartTag();
      if (_jspx_eval_c_if_13 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template82);

        } while (_jspx_th_c_if_13.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_13.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_13.release();
    }
    return false;
  }

  private boolean _jspx_th_c_if_14_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:if ---- //
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_14 = new org.apache.taglibs.standard.tag.rt.core.IfTag();
    _jspx_th_c_if_14.setPageContext(pageContext);
    _jspx_th_c_if_14.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_if_14.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.HEOGA == '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_14 = _jspx_th_c_if_14.doStartTag();
      if (_jspx_eval_c_if_14 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template85);

        } while (_jspx_th_c_if_14.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_14.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_14.release();
    }
    return false;
  }

  private boolean _jspx_th_c_if_15_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:if ---- //
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_15 = new org.apache.taglibs.standard.tag.rt.core.IfTag();
    _jspx_th_c_if_15.setPageContext(pageContext);
    _jspx_th_c_if_15.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_if_15.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.HEOGA == '2'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_15 = _jspx_th_c_if_15.doStartTag();
      if (_jspx_eval_c_if_15 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template87);

        } while (_jspx_th_c_if_15.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_15.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_15.release();
    }
    return false;
  }

  private boolean _jspx_th_c_if_16_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:if ---- //
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_16 = new org.apache.taglibs.standard.tag.rt.core.IfTag();
    _jspx_th_c_if_16.setPageContext(pageContext);
    _jspx_th_c_if_16.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_if_16.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.HEOGA == '3'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_16 = _jspx_th_c_if_16.doStartTag();
      if (_jspx_eval_c_if_16 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template89);

        } while (_jspx_th_c_if_16.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_16.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_16.release();
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
  private final static String _jspx_template9 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n \r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script language=\"javascript\" src=\"/js/Check_inputbox.js\"></script>\r\n<script language=\"javascript\" src=\"/js/Ajax_request.js\"></script>\r\n\r\n<script type=\"text/javascript\">\r\n//<![CDATA[\r\n           \r\n           \r\n    function iFrameResize(obj)\r\n\t{\r\n\t\tvar iFrm = obj;\r\n\t\tvar the_height = iFrm.contentWindow.document.body.scrollHeight;\r\n\t\tiFrm.style.height = the_height + \"px\";\r\n\t}\r\n    \r\n    \r\n\tfunction\tPage(page)\r\n\t{\r\n\t\tif(page\t==\t\"\")\r\n\t\t\treturn;\r\n\t\t\r\n\t\tvar form = document.form;\r\n\r\n\t\tform.currentPage.value\t= page;\r\n\r\n\t\tform.action = \"view.do\";\r\n\t\tform.submit();\r\n\t}\r\n\t\r\n\tfunction View(SERIAL_NBR, GU_CODE, ILKWAL_NBR, YY)\r\n\t{\r\n\t\t//var form = document.form;\r\n\t\t\r\n\t\t//form.action = \"sangse_view.do?SERIAL_NBR=\" + SERIAL_NBR + \"&GU_CODE=\" + GU_CODE + \"&ILKWAL_NBR=\" + ILKWAL_NBR + \"&YY=\" + YY;\r\n\t\t//form.submit();\r\n\t\tvar\tparam\t= \"SERIAL_NBR=\" + SERIAL_NBR + \"&GU_CODE=\" + GU_CODE + \"&ILKWAL_NBR=\" + ILKWAL_NBR + \"&YY=\" + YY;\r\n\r\n\t\tsendRequest(\"/jumyong/oldminwon/sangse_view.do\", param, \"GET\", Result_SangseView);\r\n\t}\r\n\t\r\n\tfunction\tResult_SangseView(obj)\r\n\t{\r\n\t\tif(obj != null)\r\n\t\t{\r\n\t        var xmldoc \t= new ActiveXObject(\"Microsoft.XMLDOM\");\r\n\t        var form \t= document.form;\r\n\t\t\t\r\n\t        xmldoc.async\t= false;\r\n\t\t\txmldoc.loadXML(obj);\r\n\t\r\n\t\t\tvar YY = xmldoc.getElementsByTagName(\"YY\").item(0).text;\r\n\t\t\tvar GUBUN = xmldoc.getElementsByTagName(\"GUBUN\").item(0).text;\r\n\t\t\tvar HEOGA = xmldoc.getElementsByTagName(\"HEOGA\").item(0).text;\r\n\t\t\tvar SEGUBUN = xmldoc.getElementsByTagName(\"SEGUBUN\").item(0).text;\r\n\t\t\tvar HF_DATE = xmldoc.getElementsByTagName(\"HF_DATE\").item(0).text;\r\n\t\t\t\r\n\t\t\tvar HL_DATE = xmldoc.getElementsByTagName(\"HL_DATE\").item(0).text;\r\n\t\t\tvar JUN_JUMACK = xmldoc.getElementsByTagName(\"JUN_JUMACK\").item(0).text;\r\n\t\t\tvar CUR_JUMACK = xmldoc.getElementsByTagName(\"CUR_JUMACK\").item(0).text;\r\n\t\t\tvar SANCHUL1 = xmldoc.getElementsByTagName(\"SANCHUL1\").item(0).text;\r\n\t\t\tvar SANCHUL2 = xmldoc.getElementsByTagName(\"SANCHUL2\").item(0).text;\r\n\t\t\t\r\n\t\t\tvar BUKWA_NBR = xmldoc.getElementsByTagName(\"BUKWA_NBR\").item(0).text;\r\n\t\t\tvar BUKWA_AMT = xmldoc.getElementsByTagName(\"BUKWA_AMT\").item(0).text;\r\n\t\t\tvar BUKWA_DATE = xmldoc.getElementsByTagName(\"BUKWA_DATE\").item(0).text;\r\n\t\t\tvar ACC = xmldoc.getElementsByTagName(\"ACC\").item(0).text;\r\n\t\t\tvar MOK = xmldoc.getElementsByTagName(\"MOK\").item(0).text;\r\n\t\t\t\r\n\t\t\tvar SEMOK = xmldoc.getElementsByTagName(\"SEMOK\").item(0).text;\r\n\t\t\t\r\n\t\t\tvar sangse_view_title = document.getElementById(\"sangse_view_title\");\r\n\t\t\t\tsangse_view_title.style.display = \"block\";\r\n\t\t\tvar sangse_view = document.getElementById(\"sangse_view\");\r\n\t\t\t\tsangse_view.style.display = \"block\";\r\n\t\t\t\r\n\t\t\tdocument.getElementById(\"SANGSE_YY\").innerHTML = YY;\r\n\t\t\tdocument.getElementById(\"SANGSE_GUBUN\").innerHTML = GUBUN;\r\n\t\t\tdocument.getElementById(\"SANGSE_HEOGA\").innerHTML = HEOGA;\r\n\t\t\tdocument.getElementById(\"SANGSE_SEGUBUN\").innerHTML = SEGUBUN;\r\n\t\t\tdocument.getElementById(\"SANGSE_HF_DATE\").innerHTML = HF_DATE;\r\n\t\t\tdocument.getElementById(\"SANGSE_HL_DATE\").innerHTML = HL_DATE;\r\n\t\t\tdocument.getElementById(\"SANGSE_JUN_JUMACK\").innerHTML = JUN_JUMACK;\r\n\t\t\tdocument.getElementById(\"SANGSE_CUR_JUMACK\").innerHTML = CUR_JUMACK;\r\n\t\t\tdocument.getElementById(\"SANGSE_SANCHUL1\").innerHTML = SANCHUL1;\r\n\t\t\tdocument.getElementById(\"SANGSE_SANCHUL2\").innerHTML = SANCHUL2;\r\n\t\t\tdocument.getElementById(\"SANGSE_BUKWA_NBR\").innerHTML = BUKWA_NBR;\r\n\t\t\tdocument.getElementById(\"SANGSE_BUKWA_AMT\").innerHTML = BUKWA_AMT;\r\n\t\t\tdocument.getElementById(\"SANGSE_BUKWA_DATE\").innerHTML = BUKWA_DATE;\r\n\t\t\tdocument.getElementById(\"SANGSE_ACC_MOK_SEMOK\").innerHTML = ACC+MOK+SEMOK;\r\n\t\t}\r\n\t\telse\r\n\t\t{\r\n\t\t\tvar sangse_view_title = document.getElementById(\"sa";
  private final static String _jspx_template10 = "ngse_view_title\");\r\n\t\t\t\tsangse_view_title.style.display = \"none\";\r\n\t\t\tvar sangse_view = document.getElementById(\"sangse_view\");\r\n\t\t\t\tsangse_view.style.display = \"none\";\r\n\t\t}\r\n\t}\r\n//]]>\r\n</script>\r\n\r\n<body>\r\n<form id=\"form\" name=\"form\" method=\"post\">\r\n\t<input type=\"hidden\" id=\"currentPage\" name=\"currentPage\" value=\"";
  private final static String _jspx_template11 = "\">\r\n\t<input type=\"hidden\" id=\"SERIAL_NBR\" name=\"SERIAL_NBR\" value=\"";
  private final static String _jspx_template12 = "\">\r\n\t<input type=\"hidden\" id=\"GU_CODE\" name=\"GU_CODE\" value=\"";
  private final static String _jspx_template13 = "\">\r\n\t<input type=\"hidden\" id=\"ILKWAL_NBR\" name=\"ILKWAL_NBR\" value=\"";
  private final static String _jspx_template14 = "\">\r\n\t<input type=\"hidden\" id=\"YY\" name=\"YY\" value=\"";
  private final static String _jspx_template15 = "\">\r\n\r\n<table width=\"800\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t<tr>\r\n    \t<td height=\"43\"><img src=\"/img/sub1_petition_title.gif\" width=\"800\" height=\"43\"></td>\r\n  \t</tr>\r\n\r\n\t<tr>\r\n\t\t<td height=\"1\" bgcolor=\"eaeaea\"></td>\r\n\t</tr>\r\n \r\n\t<tr>\r\n        <td height=\"14\"></td>\r\n\t</tr>    \r\n    <tr>\r\n        <td height=\"22\" background=\"/img/tab_line_purple.gif\">\r\n        <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n            <tr>\r\n              <td width=\"111\"><a href=\"javascript:Tab_Sanchul('";
  private final static String _jspx_template16 = "')\"><img id=\"sanchul_img\" name=\"sanchul_img\" src=\"/img/sub_petition_title17_on.gif\" alt=\"점용기본 정보\" width=\"110\" height=\"22\" border=\"0\"></a></td>\r\n            </tr>\r\n        </table>\r\n        </td>\r\n\t</tr>\r\n     <tr>\r\n\t\t<td align=\"left\" class=\"contborder_purple\">\r\n\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t  <tr>\r\n\t\t\t<td><table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t\t<tr>\r\n\t\t\t\t  <td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">관리번호</td>\r\n\t\t\t\t  <td width=\"37%\" bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template17 = "</td>\r\n\t\t\t\t  <td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용인/법인명</td>\r\n\t\t\t\t  <td width=\"36%\" bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template18 = "</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t  <td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">주민/법인번호</td>\r\n\t\t\t\t  <td bgcolor=\"eaeaea\" class=\"table_bl_left\" id=\"ssn\">\r\n\t\t\t\t  \t<script type=\"text/javascript\">\r\n\t\t\t\t\t\t\t\tvar ssn = \"";
  private final static String _jspx_template19 = "\";\r\n\t\t\t\t\t\t\t\tvar ssnAsterisk = ssn.substring(7).replace(/./g, '*');\r\n\t\t\t\t\t\t\t\tdocument.getElementById(\"ssn\").innerHTML = ssn.substring(0, 7) + ssnAsterisk;\r\n\t\t\t\t\t\t\t</script>\r\n\t\t\t\t  </td>\r\n\t\t\t\t  <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">주소</td>\r\n\t\t\t\t  <td bgcolor=\"eaeaea\" class=\"table_bl_left\">(";
  private final static String _jspx_template20 = "-";
  private final static String _jspx_template21 = ") ";
  private final static String _jspx_template22 = " ";
  private final static String _jspx_template23 = " ";
  private final static String _jspx_template24 = " ";
  private final static String _jspx_template25 = " \r\n\t\t\t\t  \t\t\t\t\t\t\t\t\t\t\t  ";
  private final static String _jspx_template26 = " ";
  private final static String _jspx_template27 = " ";
  private final static String _jspx_template28 = " ";
  private final static String _jspx_template29 = "</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t  <td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">전화번호</td>\r\n\t\t\t\t  <td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template30 = "</td>\r\n\t\t\t\t  <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">지목</td>\r\n\t\t\t\t  <td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t  \t";
  private final static String _jspx_template31 = "도로";
  private final static String _jspx_template32 = "\r\n\t\t\t\t  \t";
  private final static String _jspx_template33 = "하천";
  private final static String _jspx_template34 = "\r\n\t\t\t\t  \t";
  private final static String _jspx_template35 = "구분";
  private final static String _jspx_template36 = "\r\n\t\t\t\t  </td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t  <td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용목적</td>\r\n\t\t\t\t  <td bgcolor=\"eaeaea\" class=\"table_bl_left\">(";
  private final static String _jspx_template37 = ") ";
  private final static String _jspx_template38 = "</td>\r\n\t\t\t\t  <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">소재지</td>\r\n\t\t\t\t  <td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t  \t(";
  private final static String _jspx_template39 = ") ";
  private final static String _jspx_template40 = " (";
  private final static String _jspx_template41 = ") ";
  private final static String _jspx_template42 = "산";
  private final static String _jspx_template43 = " ";
  private final static String _jspx_template44 = " - ";
  private final static String _jspx_template45 = "\r\n\t\t\t\t  </td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t  <td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">면적</td>\r\n\t\t\t\t  <td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template46 = "</td>\r\n\t\t\t\t  <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">소유자</td>\r\n\t\t\t\t  <td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t  \t";
  private final static String _jspx_template47 = "국유지";
  private final static String _jspx_template48 = "\r\n\t\t\t\t  \t";
  private final static String _jspx_template49 = "시유지";
  private final static String _jspx_template50 = "\r\n\t\t\t\t  \t";
  private final static String _jspx_template51 = "구유지";
  private final static String _jspx_template52 = "\r\n\t\t\t\t  \t";
  private final static String _jspx_template53 = "사유지";
  private final static String _jspx_template54 = "\r\n\t\t\t\t  \t";
  private final static String _jspx_template55 = "기타";
  private final static String _jspx_template56 = "\r\n\t\t\t\t  </td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t\r\n\t\t\t\t<tr style=\"display:block\" id=\"UseType1\">\r\n\t\t\t\t  <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">허가구분 </td>\r\n\t\t\t\t  <td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t  \t";
  private final static String _jspx_template57 = "허가";
  private final static String _jspx_template58 = "\r\n\t\t\t\t  \t";
  private final static String _jspx_template59 = "직권";
  private final static String _jspx_template60 = "\r\n\t\t\t\t  \t";
  private final static String _jspx_template61 = "폐쇄";
  private final static String _jspx_template62 = "\r\n\t\t\t\t  </td>\r\n\t\t\t\t  <td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">허가번호</td>\r\n\t\t\t\t  <td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template63 = "</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t\r\n\t\t\t\t<tr style=\"display:block\" id=\"UseType2\">\r\n\t\t\t\t  <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용시작일</td>\r\n\t\t\t\t  <td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template64 = "</td>\r\n\t\t\t\t  <td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용종료일</td>\r\n\t\t\t\t  <td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template65 = "</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t\r\n\t\t\t\t<tr style=\"display:block\" id=\"UseType2\">\r\n\t\t\t\t  <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">산정요율</td>\r\n\t\t\t\t  <td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template66 = "</td>\r\n\t\t\t\t  <td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">공시지가(단가)</td>\r\n\t\t\t\t  <td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template67 = "</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\r\n\t\t\t\t<tr>\r\n\t\t\t\t  <td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">참고사항</td>\r\n\t\t\t\t  <td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template68 = "</td>\r\n\t\t\t    </tr>\r\n\t\t\t\t\r\n\t\t\t</table></td>\r\n\t\t  </tr>\r\n\r\n\t\t</table></td>\r\n\t</tr>\r\n\t<tr>\r\n        <td height=\"14\"></td>\r\n\t</tr>\r\n\t\r\n\t\r\n\t<tr>\r\n\t\t<td>\r\n\t\t\t<iframe width=\"100%\" height=\"100%\" id=\"tabCenter\" name=\"tabCenter\" frameborder=\"0\" onload=\"iFrameResize(this)\" scrolling=\"no\" src=\"/jumyong/oldminwon/get_history_list.do?SERIAL_NBR=";
  private final static String _jspx_template69 = "&GU_CODE=";
  private final static String _jspx_template70 = "\"></iframe>\r\n\t\t</td>\r\n\t</tr>\r\n\r\n\t<tr>\r\n\t\t<td height=\"14\"></td>\r\n\t</tr>\r\n    \r\n    <tr>\r\n        <td height=\"1\" bgcolor=\"#EAEAEA\"></td>\r\n    </tr>\r\n    <tr>\r\n        <td height=\"34\" class=\"sub_stan\">전체건수 : <span class=\"sub_stan_blue\">";
  private final static String _jspx_template71 = "</span>건 </td>\r\n    </tr>\r\n    <tr>\r\n        <td>\r\n        \t<table width=\"780\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n      \t      <tr>\r\n                <td height=\"35\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" width=\"50\" nowrap=\"nowrap\">년도</td>\r\n                <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" width=\"50\" nowrap=\"nowrap\">부과<br/>구분</td>\r\n                <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" width=\"70\" nowrap=\"nowrap\">부과번호</td>\r\n                <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" width=\"50\" nowrap=\"nowrap\">허가<br/>구분</td>\r\n                <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" nowrap=\"nowrap\">납세자명</td>\r\n                <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" width=\"60\" nowrap=\"nowrap\">점용<br/>면적</td>\r\n                <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" width=\"80\" nowrap=\"nowrap\">부과금액</td>\r\n                <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" width=\"100\" nowrap=\"nowrap\">부과일</td>\r\n                <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" width=\"100\" nowrap=\"nowrap\">산출점용시작일</td>\r\n                <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" width=\"100\" nowrap=\"nowrap\">산출점용끝일</td>\r\n              </tr>\r\n\t\t\t";
  private final static String _jspx_template72 = "\r\n\t\t\t  \t";
  private final static String _jspx_template73 = "\r\n              \t\t";
  private final static String _jspx_template74 = "\r\n\t                      <tr onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\" style=\"cursor:pointer\" onClick=\"javascript:View('";
  private final static String _jspx_template75 = "','";
  private final static String _jspx_template76 = "','";
  private final static String _jspx_template77 = "','";
  private final static String _jspx_template78 = "');\">\r\n\t\t\t\t\t\t\t<td height=\"26\" align=\"center\">";
  private final static String _jspx_template79 = "</td>\r\n\t                        <td align=\"center\">\r\n\t                        \t";
  private final static String _jspx_template80 = "정기";
  private final static String _jspx_template81 = "\r\n\t\t\t\t\t\t\t  \t";
  private final static String _jspx_template82 = "수시";
  private final static String _jspx_template83 = "\r\n\t                        </td>\r\n\t                        <td align=\"center\">";
  private final static String _jspx_template84 = "</td>        \r\n\t                        <td align=\"center\">\r\n\t                        \t";
  private final static String _jspx_template85 = "허가";
  private final static String _jspx_template86 = "\r\n\t\t\t\t\t\t\t  \t";
  private final static String _jspx_template87 = "직권";
  private final static String _jspx_template88 = "\r\n\t\t\t\t\t\t\t  \t";
  private final static String _jspx_template89 = "폐쇄";
  private final static String _jspx_template90 = "\r\n\t                        </td>\r\n\t                        <td align=\"center\">";
  private final static String _jspx_template91 = " </td>\r\n\t                        <td align=\"center\">";
  private final static String _jspx_template92 = " </td>\r\n\t                        <td align=\"center\">";
  private final static String _jspx_template93 = "</td>\r\n\t                        <td align=\"center\">";
  private final static String _jspx_template94 = "</td>\r\n\t                        <td align=\"center\">";
  private final static String _jspx_template95 = "</td>\r\n\t                        <td align=\"center\">";
  private final static String _jspx_template96 = "</td>\r\n\t                      </tr>\r\n\t\t\t\t\t ";
  private final static String _jspx_template97 = "\r\n\t\t\t\t";
  private final static String _jspx_template98 = "\r\n\t\t\t\t";
  private final static String _jspx_template99 = "\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td align=\"center\" class=\"sub_table\" colspan=\"11\" height=\"85\">검색된 내용이 없습니다</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t";
  private final static String _jspx_template100 = "\r\n\t\t\t";
  private final static String _jspx_template101 = "\r\n            </table>\r\n\t\t  </td>\r\n       </tr>\r\n\r\n\t\t<tr>\r\n\t\t\t<td height=\"30\" align=\"center\">\r\n\t          \t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t<tr>";
  private final static String _jspx_template102 = "</tr>\r\n\t\t\t\t</table>\r\n\t\t\t</td>\r\n\t\t</tr>\r\n\t\t\r\n\t\t<tr>\r\n\t\t\t<td height=\"30\"></td>\r\n\t\t</tr>\r\n\t\t\r\n\t\t\t\t\r\n\t\t<tr id=\"sangse_view_title\" style=\"display:none;\">\r\n\t\t   <td height='22' background='/img/tab_line_purple.gif'>\r\n\t\t\t   \t<table border='0' cellspacing='0' cellpadding='0'>\r\n\t\t\t       \t<tr>\r\n\t\t\t         \t<td width='111'><img id='sanchul_img' name='sanchul_img' src='/img/sub_petition_title16_on.gif' alt='산출 정보' width='110' height='22' border='0'></td>\r\n\t\t\t       \t</tr>\r\n\t\t\t\t</table>\r\n\t\t   </td>\r\n\t\t</tr>\r\n\t\t<tr id=\"sangse_view\" style=\"display:none;\">\r\n\t\t\t<td align='left' class='contborder_purple'>\r\n\t\t\t\t<table width='100%' border='0' cellspacing='0' cellpadding='0'>\r\n\t\t\t  \t\t<tr>\r\n\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t<table width='100%' border='1' bordercolor='#c9dfed' style='border-collapse:collapse;' cellpadding='0' cellspacing='0'  class='sub_table'>\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t  <td width='100' height='28' align='center' bgcolor='e5eff8' class='sub_table_b'>년도</td>\r\n\t\t\t\t\t\t\t\t  <td width='37%' bgcolor='eaeaea' class='table_bl_left'><div id=\"SANGSE_YY\"></td>\r\n\t\t\t\t\t\t\t\t  <td width='100' align='center' bgcolor='e5eff8' class='sub_table_b'>부과구분</td>\r\n\t\t\t\t\t\t\t\t  <td width='36%' bgcolor='eaeaea' class='table_bl_left'><div id=\"SANGSE_GUBUN\"></td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t  <td height='26' align='center' bgcolor='e5eff8' class='sub_table_b'>허가구분</td>\r\n\t\t\t\t\t\t\t\t  <td bgcolor='eaeaea' class='table_bl_left'><div id=\"SANGSE_HEOGA\"></td>\r\n\t\t\t\t\t\t\t\t  <td align='center' bgcolor='e5eff8' class='sub_table_b'>세입구분</td>\r\n\t\t\t\t\t\t\t\t  <td bgcolor='eaeaea' class='table_bl_left'><div id=\"SANGSE_SEGUBUN\"></td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t  <td height='26' align='center' bgcolor='e5eff8' class='sub_table_b'>부과점용시작일</td>\r\n\t\t\t\t\t\t\t\t  <td bgcolor='eaeaea' class='table_bl_left'><div id=\"SANGSE_HF_DATE\"></td>\r\n\t\t\t\t\t\t\t\t  <td align='center' bgcolor='e5eff8' class='sub_table_b'>부과점용끝일</td>\r\n\t\t\t\t\t\t\t\t  <td bgcolor='eaeaea' class='table_bl_left'><div id=\"SANGSE_HL_DATE\"></td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t  <td height='26' align='center' bgcolor='e5eff8' class='sub_table_b'>전년도점용액</td>\r\n\t\t\t\t\t\t\t\t  <td bgcolor='eaeaea' class='table_bl_left'><div id=\"SANGSE_JUN_JUMACK\"></td>\r\n\t\t\t\t\t\t\t\t  <td align='center' bgcolor='e5eff8' class='sub_table_b'>조정점용액</td>\r\n\t\t\t\t\t\t\t\t  <td bgcolor='eaeaea' class='table_bl_left'><div id=\"SANGSE_CUR_JUMACK\"></td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t  <td height='26' align='center' bgcolor='e5eff8' class='sub_table_b'>현년도점용산출식</td>\r\n\t\t\t\t\t\t\t\t  <td bgcolor='eaeaea' class='table_bl_left'><div id=\"SANGSE_SANCHUL1\"></td>\r\n\t\t\t\t\t\t\t\t  <td align='center' bgcolor='e5eff8' class='sub_table_b'>현년도조정산출식</td>\r\n\t\t\t\t\t\t\t\t  <td bgcolor='eaeaea' class='table_bl_left'><div id=\"SANGSE_SANCHUL2\"></td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t<tr style='display:block' id='UseType1'>\r\n\t\t\t\t\t\t\t\t  <td align='center' bgcolor='e5eff8' class='sub_table_b'>부과번호 </td>\r\n\t\t\t\t\t\t\t\t  <td bgcolor='eaeaea' class='table_bl_left'><div id=\"SANGSE_BUKWA_NBR\"></td>\r\n\t\t\t\t\t\t\t\t  <td height='26' align='center' bgcolor='e5eff8' class='sub_table_b'>부과금액</td>\r\n\t\t\t\t\t\t\t\t  <td bgcolor='eaeaea' class='table_bl_left'><div id=\"SANGSE_BUKWA_AMT\"></td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t<tr style='display:block' id='UseType2'>\r\n\t\t\t\t\t\t\t\t  <td align='center' bgcolor='e5eff8' class='sub_table_b'>부과일</td>\r\n\t\t\t\t\t\t\t\t  <td bgcolor='eaeaea' class='table_bl_left'><div id=\"SANGSE_BUKWA_DATE\"></td>\r\n\t\t\t\t\t\t\t\t  <td height='26' align='center' bgcolor='e5eff8' class='sub_table_b'>회계과목</td>\r\n\t\t\t\t\t\t\t\t  <td bgcolor='eaeaea' class='table_bl_left'><div id=\"SANGSE_ACC_MOK_SEMOK\"></td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t  \t\t</tr>\r\n\t\t\t\t</table>\r\n\t\t\t</td>\r\n\t\t</tr>\r\n\t\t\t\t\t\r\n\t\t<tr>\r\n\t\t\t<td height=\"60\"></td>\r\n\t\t</tr>\r\n</table>\r\n\r\n</form>\r\n</body>\r\n</html>\r\n";
}
