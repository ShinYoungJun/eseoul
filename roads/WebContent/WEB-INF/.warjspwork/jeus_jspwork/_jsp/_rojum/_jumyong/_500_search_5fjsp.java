package jeus_jspwork._jsp._rojum._jumyong;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_search_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(71,9);to=(71,16)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${message}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(72,13);to=(72,20)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${message}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(74,36);to=(74,43)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(87,26);to=(87,33)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${YearVal}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      out.write(_jspx_template14);
      out.write(_jspx_template15);
      out.write(_jspx_template16);
      // jsp code [from=(464,53);to=(464,59)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${toDate}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(465,57);to=(465,65)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${fromDate}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(466,59);to=(466,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${tax_set}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(518,73);to=(518,104)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(product.SALE_DATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

      out.write(_jspx_template20);
      // jsp code [from=(530,67);to=(530,82)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.SALE_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(539,71);to=(539,88)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.SALE_BIGO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(559,73);to=(559,91)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.HND_OFFICE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(569,77);to=(569,110)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(product.HND_DESDATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

      out.write(_jspx_template24);
      // jsp code [from=(582,78);to=(582,111)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(product.HND_OPEDATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

      out.write(_jspx_template25);
      // jsp code [from=(594,69);to=(594,85)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.HND_BIGO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template26);
      // jsp code [from=(668,58);to=(668,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${thisDate}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // jsp code [from=(714,79);to=(714,87)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${fromDate}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template28);
      // jsp code [from=(720,78);to=(720,84)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${toDate}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template29);
      // jsp code [from=(731,16);to=(731,22)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mg_typ}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template30);
      // jsp code [from=(737,16);to=(737,25)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${maintn_ob}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template31);
      // jsp code [from=(748,18);to=(748,25)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${gu_code}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template32);
      // jsp code [from=(760,18);to=(760,29)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bjdong_code}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template33);
      // jsp code [from=(775,89);to=(775,95)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bonbun}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template34);
      // jsp code [from=(776,89);to=(776,94)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bubun}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template35);
      // jsp code [from=(786,162);to=(786,173)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${jumyongName}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template36);
      // jsp code [from=(796,159);to=(796,170)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${numberValue}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template37);
      // jsp code [from=(833,138);to=(833,147)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${listCount}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template38);
      // jsp code [from=(833,219);to=(833,237)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${unconfirmListCount}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template39);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template47);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_1_fn(pageContext, null)) return;


      out.write(_jspx_template78);
      // jsp code [from=(961,23);to=(961,40)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${strPageDivideForm}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template79);
      // jsp code [from=(1014,19);to=(1014,25)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${FT_TYP}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template80);

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
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist1}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("board");
    _jspx_th_c_forEach_0.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template40);
            // jsp code [from=(888,62);to=(888,76)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template41);
            // jsp code [from=(890,60);to=(890,78)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TAXTATION_AT}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template42);
            // jsp code [from=(891,61);to=(891,74)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template43);
            // jsp code [from=(892,63);to=(892,78)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_SSN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template44);
            // jsp code [from=(893,58);to=(893,68)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template45);
            // jsp code [from=(894,69);to=(894,86)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SALE_STATUS}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template46);

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
    _jspx_th_c_forEach_1.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist1}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_1.setVar("board");
    _jspx_th_c_forEach_1.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
        if (_jspx_eval_c_forEach_1 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template48);
            // jsp code [from=(904,161);to=(904,172)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${idx.count-1}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template49);
            // jsp code [from=(905,63);to=(905,77)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template50);
            // jsp code [from=(907,17);to=(907,33)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.MANAGE_TYP}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template51);
            // jsp code [from=(910,17);to=(910,32)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.FT_TYP_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template52);
            // jsp code [from=(910,48);to=(910,63)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.FT_SEL_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template53);
            // jsp code [from=(913,17);to=(913,48)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(board.PICKUP_DATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template54);
            // ----  c:if ---- invoke //
            if (_jspx_th_c_if_0_fn(pageContext, _jspx_th_c_forEach_1)) return true;


            out.write(_jspx_template57);
            // ----  c:if ---- invoke //
            if (_jspx_th_c_if_1_fn(pageContext, _jspx_th_c_forEach_1)) return true;


            out.write(_jspx_template59);
            // jsp code [from=(925,48);to=(925,58)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template60);
            // jsp code [from=(926,49);to=(926,59)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADDR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template61);
            // jsp code [from=(929,49);to=(929,57)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SI}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template62);
            // jsp code [from=(929,67);to=(929,76)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template63);
            // jsp code [from=(929,86);to=(929,99)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.DORO_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template64);
            // jsp code [from=(929,109);to=(929,121)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_BON}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template65);
            // jsp code [from=(929,131);to=(929,142)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_BU}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template66);
            // jsp code [from=(929,152);to=(929,163)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template67);
            // jsp code [from=(929,173);to=(929,188)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_DET_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template68);
            // jsp code [from=(932,67);to=(932,85)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOTAL_STATUS}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template69);
            // jsp code [from=(933,48);to=(933,61)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PLACE_A}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template70);
            // ----  c:choose ---- invoke //
            if (_jspx_th_c_choose_0_fn(pageContext, _jspx_th_c_forEach_1)) return true;


            out.write(_jspx_template76);
            // jsp code [from=(944,49);to=(944,76)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(board.UP_DATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template77);

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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PASS_DAY != '-'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template55);
          // ----  fmt:formatNumber ---- invoke //
          if (_jspx_th_fmt_formatNumber_0_fn(pageContext, _jspx_th_c_if_0)) return true;


          out.write(_jspx_template56);

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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PASS_DAY == '-'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
      if (_jspx_eval_c_if_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template58);

        } while (_jspx_th_c_if_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_1.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_1.release();
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
          out.write(_jspx_template71);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template73);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template75);

        } while (_jspx_th_c_choose_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_choose_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_choose_0.release();
    }
    return false;
  }

  private boolean _jspx_th_fmt_formatNumber_0_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  fmt:formatNumber ---- //
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_0 = new org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag();
    _jspx_th_fmt_formatNumber_0.setPageContext(pageContext);
    _jspx_th_fmt_formatNumber_0.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_fmt_formatNumber_0.setValue((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PASS_DAY}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_fmt_formatNumber_0.setPattern("#,#00");
    try {
      int _jspx_eval_fmt_formatNumber_0 = _jspx_th_fmt_formatNumber_0.doStartTag();

      if (_jspx_th_fmt_formatNumber_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_fmt_formatNumber_0.release();
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
    _jspx_th_c_when_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.MAINTN_OB == '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
      if (_jspx_eval_c_when_0 != Tag.SKIP_BODY) {
        do {
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

        } while (_jspx_th_c_otherwise_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_otherwise_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_otherwise_0.release();
    }
    return false;
  }

  private static jeus.servlet.jsp.el.FunctionMapperImpl _jspx_fnmap_0;
  
  static {
    _jspx_fnmap_0 = jeus.servlet.jsp.el.FunctionMapperImpl.getInstance();
    _jspx_fnmap_0.mapFunction("rnic:addDash", main.java.common.util.StringUtil.class, "addDash", new Class[] {java.lang.String.class});

  }
  
  private final static String _jspx_template0 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n";
  private final static String _jspx_template1 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('사용자의 사용시간이 종료되었습니다. 다시 접속 해주시기 바랍니다.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template2 = "\r\n";
  private final static String _jspx_template3 = "\r\n";
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "  \r\n";
  private final static String _jspx_template6 = "  \r\n";
  private final static String _jspx_template7 = "\r\n";
  private final static String _jspx_template8 = "\r\n";
  private final static String _jspx_template9 = "\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n<script language=\"javascript\" src=\"/js/common.js\"></script>\r\n<script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script>\r\n<script language=\"javascript\" src=\"/js/calculation.js\"></script>\r\n<script language=\"javascript\" src=\"/js/selectItem.js\"></script>\r\n<script language=\"javascript\" src=\"/js/Ajax_request.js\"></script>\r\n\r\n<script>\r\n\r\n\tfunction goSearch()\r\n\t{\r\n\t\tvar section = document.getElementById(\"View_Disuse\").value;\r\n\t\tvar bj_cd = document.getElementById(\"BJ_CD\").value;\r\n\t\tvar bonbun = document.getElementById(\"BONBUN\").value;\r\n\t\tvar bubun = document.getElementById(\"BUBUN\").value;\r\n\t\tvar jumyongName = document.getElementById(\"jumyongName\").value;\r\n\t\tvar numberValue = document.getElementById(\"numberValue\").value;\r\n\t\tvar fromDate = document.getElementById(\"fromDate\").value;\r\n\t\tvar toDate = document.getElementById(\"toDate\").value;\r\n\t\tvar maintn_ob = document.getElementById(\"MAINTN_OB\").value;\r\n\t\tvar gu_cd = getValueSelectTag(\"GU_CD\");\r\n\t\tvar mg_typ = getValueSelectTag(\"MG_TYP\");\r\n\t\tvar ft_typ = document.getElementById(\"FT_TYP\").value;\r\n\r\n\t\tlocation.href=\"/rojum/jumyong/search.do?gu_cd=\"+gu_cd+\"&bj_cd=\"+bj_cd+\"&bonbun=\"+bonbun+\"&bubun=\"+bubun\r\n\t\t+\"&jumyongName=\"+jumyongName+\"&numberValue=\"+numberValue\r\n\t\t+\"&fromDate=\"+fromDate+\"&toDate=\"+toDate+\"&maintn_ob=\"+maintn_ob\r\n\t\t+\"&section=\"+section+\"&mg_typ=\"+mg_typ+\"&ft_typ=\"+ft_typ;\r\n\t}\r\n\r\n\tfunction excel_Search()\r\n\t{\r\n\t\tvar section = document.getElementById(\"View_Disuse\").value;\r\n\t\tvar bj_cd = document.getElementById(\"BJ_CD\").value;\r\n\t\tvar bonbun = document.getElementById(\"BONBUN\").value;\r\n\t\tvar bubun = document.getElementById(\"BUBUN\").value;\r\n\t\tvar jumyongName = document.getElementById(\"jumyongName\").value;\r\n\t\tvar numberValue = document.getElementById(\"numberValue\").value;\r\n\t\tvar fromDate = document.getElementById(\"fromDate\").value;\r\n\t\tvar toDate = document.getElementById(\"toDate\").value;\r\n\t\tvar maintn_ob = document.getElementById(\"MAINTN_OB\").value;\r\n\t\tvar gu_cd = getValueSelectTag(\"GU_CD\");\r\n\t\tvar mg_typ = getValueSelectTag(\"MG_TYP\");\r\n\t\tvar ft_typ = document.getElementById(\"FT_TYP\").value;\r\n\r\n\t\tlocation.href=\"/rojum/jumyong/excel_search.do?gu_cd=\"+gu_cd+\"&bj_cd=\"+bj_cd+\"&bonbun=\"+bonbun+\"&bubun=\"+bubun\r\n\t\t+\"&jumyongName=\"+jumyongName+\"&numberValue=\"+numberValue\r\n\t\t+\"&fromDate=\"+fromDate+\"&toDate=\"+toDate+\"&maintn_ob=\"\r\n\t\t+maintn_ob+\"&section=\"+section+\"&mg_typ=\"+mg_typ+\"&ft_typ=\"+ft_typ;\r\n\t}\r\n\t\r\n\tfunction InitPage()\r\n\t{\t\t\r\n\t\tsetYear();\r\n\t\tif('";
  private final static String _jspx_template10 = "'.length > 0){\r\n\t\t\talert('";
  private final static String _jspx_template11 = "');\r\n\t\t}\r\n\t\tchangeSelectTag('View_Disuse','";
  private final static String _jspx_template12 = "');\r\n\t}\r\n\t\r\n\tfunction checkKeySearch(){\r\n\t\tif(event.keyCode == \"13\")\r\n\t\t\tgoSearch();\r\n\t}\r\n\r\n    function setYear()\r\n    {\r\n        now = new Date();\r\n        Y = now.getFullYear();\r\n\r\n        var strYear = \"";
  private final static String _jspx_template13 = "\";\r\n\r\n        for(var i = 0 ; i < 10 ; i++){\r\n            newItem = new Option(i);\r\n            document.getElementById(\"YEAR\").options[i]  = newItem;\r\n            document.getElementById(\"YEAR\").options[i].text = Y+2-i;\r\n            document.getElementById(\"YEAR\").options[i].value = Y+2-i;\r\n            if(strYear == Y-i) document.getElementById(\"YEAR\").options[i].selected = true;\r\n        }\r\n\r\n        document.getElementById(\"YEAR\").options.value = strYear;\r\n    }\r\n\r\n\r\n    function rojum_Individual(){\r\n        var f = document.jumyongForm;\r\n        var select_item = document.getElementsByName(\"SELECT_ITEM\");\r\n        var item_check = document.getElementsByName(\"ITEM_CHECK\");\r\n        var gapan_no = document.getElementsByName(\"GAPAN_NO\");\r\n        var max_year = document.getElementsByName(\"MAX_YEAR\");\r\n\r\n        var count = 0;\r\n        var hitFlag;\r\n\r\n        for(var i = 0 ; i < select_item.length ; i++){\r\n            if(select_item[i].checked == true){\r\n                item_check[i].value = select_item[i].checked;\r\n                count++;\r\n                hitFlag = i;\r\n            }\r\n        }\r\n        if(count <= 0){\r\n            alert(\"점용료 대상을 선택하세요.\");\r\n            return;\r\n        }else if(count==1){\r\n\t\t\tvar param = \"/rojum/jumyong/view.do?GAPAN_NO=\"+gapan_no[hitFlag].value+\"&cal_mode=cal1\";\r\n            location.href=param;\r\n            \r\n        }else{\r\n            MessageDisplay('Dlg_BatchCal1','Dlg_BatchCal1Main',1);\r\n        }\r\n\t\t\r\n    }\r\n\r\n    function rojum_Register(){\r\n    \tlocation.href=\"/rojum/jumyong/register.do\";\r\n\t}\r\n\r\n    function click_History(idx){\r\n    \tvar f = document.jumyongForm;\r\n\t\tvar gapan_no = document.getElementsByName(\"GAPAN_NO\");\r\n\t\tvar param = \"/rojum/jumyong/history_info.do?GAPAN_NO=\"+gapan_no[idx].value;\r\n\r\n\t\tlocation.href=param;\r\n    }\r\n\r\n    function rojum_Cal2(){\r\n    \tvar f = document.jumyongForm;\r\n\t\tvar select_item = document.getElementsByName(\"SELECT_ITEM\");\r\n\t\tvar item_check = document.getElementsByName(\"ITEM_CHECK\");\r\n\t\tvar gapan_no = document.getElementsByName(\"GAPAN_NO\");\r\n\t\tvar count = 0;\r\n\t\tvar hitFlag;\r\n\r\n\t\tfor(var i = 0 ; i < select_item.length ; i++){\r\n\t\t\titem_check[i].value = select_item[i].checked;\r\n\t\t\tif(select_item[i].checked == true){\r\n\t\t\t\tcount++;\r\n\t\t\t\thitFlag = i;\r\n\t\t\t}\r\n\t\t}\r\n\t\tif(count <= 0){\r\n\t\t\talert(\"처리할 데이터가 없습니다. \");\r\n\t\t\treturn;\r\n\t\t}else if(count == 1){\r\n\t\t\tvar section = document.getElementById(\"View_Disuse\").value;\r\n\t\t\tvar bj_cd = document.getElementById(\"BJ_CD\").value;\r\n\t\t\tvar bonbun = document.getElementById(\"BONBUN\").value;\r\n\t\t\tvar bubun = document.getElementById(\"BUBUN\").value;\r\n\t\t\tvar jumyongName = document.getElementById(\"jumyongName\").value;\r\n\t\t\tvar numberValue = document.getElementById(\"numberValue\").value;\r\n\t\t\tvar fromDate = document.getElementById(\"fromDate\").value;\r\n\t\t\tvar toDate = document.getElementById(\"toDate\").value;\r\n\t\t\tvar maintn_ob = document.getElementById(\"MAINTN_OB\").value;\r\n\t\t\tvar gu_cd = getValueSelectTag(\"GU_CD\");\r\n\t\t\tvar mg_typ = getValueSelectTag(\"MG_TYP\");\r\n\r\n\t\t\tvar param = \"/rojum/jumyong/view.do?GAPAN_NO=\"+gapan_no[hitFlag].value+\"&cal_mode=cal2\"\r\n\t\t\t+\"&gu_cd=\"+gu_cd+\"&bj_cd=\"+bj_cd+\"&bonbun=\"+bonbun+\"&bubun=\"+bubun+\"&jumyongName=\"+jumyongName+\"&numberValue=\"+numberValue\r\n\t\t\t+\"&fromDate=\"+fromDate+\"&toDate=\"+toDate+\"&maintn_ob=\"+maintn_ob+\"&section=\"+section+\"&mg_typ=\"+mg_typ;\r\n\r\n\t\t\tlocation.href=param;\r\n\r\n\t\t}else{\r\n\t\t\talert(\"변상금산출은 일괄산출이 안됩니다. 한건만 선택하세요.\");\r\n\t\t}\r\n    }\r\n        \r\n    function rojum_Cal3(){\r\n    \tvar f = document.jumyongForm;\r\n\t\tvar select_item = document.getElementsByName(\"SELECT_ITEM\");\r\n\t\tvar item_check = document.getElementsByName(\"ITEM_CHECK\");\r\n\t\tvar gapan_no = document.getElementsByName(\"GAPAN_NO\");\r\n\t\tvar count = 0;\r\n\t\tvar hitFlag;\r\n\r\n\t\tfor(var i = 0 ; i < select_item.length ; i++){\r\n\t\t\titem_check[i].value = select_item[i].checked;\r\n\t\t\tif(select_item[i].checked == true){\r\n\t\t\t\tcount++;\r\n\t\t\t\thitFlag = i;\r\n\t\t\t}\r\n\t\t}\r\n\t\tif(count <= 0){\r\n\t\t\talert(\"처리할 데이터가 없습니다. \");\r\n\t\t\treturn;\r\n\t\t}else if(count == 1){\r\n\t\t\tvar section = document.getElementById(\"View_Disuse\").value;\r\n\t\t\tvar bj_cd = document.getElementById(\"BJ";
  private final static String _jspx_template14 = "_CD\").value;\r\n\t\t\tvar bonbun = document.getElementById(\"BONBUN\").value;\r\n\t\t\tvar bubun = document.getElementById(\"BUBUN\").value;\r\n\t\t\tvar jumyongName = document.getElementById(\"jumyongName\").value;\r\n\t\t\tvar numberValue = document.getElementById(\"numberValue\").value;\r\n\t\t\tvar fromDate = document.getElementById(\"fromDate\").value;\r\n\t\t\tvar toDate = document.getElementById(\"toDate\").value;\r\n\t\t\tvar maintn_ob = document.getElementById(\"MAINTN_OB\").value;\r\n\t\t\tvar gu_cd = getValueSelectTag(\"GU_CD\");\r\n\t\t\tvar mg_typ = getValueSelectTag(\"MG_TYP\");\r\n\r\n\r\n\t\t\tvar param = \"/rojum/jumyong/view.do?GAPAN_NO=\"+gapan_no[hitFlag].value+\"&cal_mode=cal3\"\r\n\t\t\t+\"&gu_cd=\"+gu_cd+\"&bj_cd=\"+bj_cd+\"&bonbun=\"+bonbun+\"&bubun=\"+bubun+\"&jumyongName=\"+jumyongName+\"&numberValue=\"+numberValue\r\n\t\t\t+\"&fromDate=\"+fromDate+\"&toDate=\"+toDate+\"&maintn_ob=\"+maintn_ob+\"&section=\"+section+\"&mg_typ=\"+mg_typ;\r\n\r\n\t\t\tlocation.href=param;\r\n\r\n\t\t}else{\r\n\t\t\talert(\"과태료 산출은 일괄산출이 안됩니다. 한건만 선택하세요.\");\r\n\t\t}\r\n        \r\n    }    \r\n\r\n\r\n    function rojum_Return(){\r\n\r\n    \tvar f = document.jumyongForm;\r\n\t\tvar select_item = document.getElementsByName(\"SELECT_ITEM\");\r\n\t\tvar item_check = document.getElementsByName(\"ITEM_CHECK\");\r\n\t\tvar gapan_no = document.getElementsByName(\"GAPAN_NO\");\r\n\t\tvar tax_at = document.getElementsByName(\"TAX_AT\");\r\n\t\tvar count = 0;\r\n\t\tvar hitFlag;\r\n\r\n\t\tfor(var i = 0 ; i < select_item.length ; i++){\r\n\t\t\tif(select_item[i].checked == true && tax_at[i].value != '1'){\r\n\t\t\t\titem_check[i].value = select_item[i].checked;\r\n\t\t\t\tcount++;\r\n\t\t\t\thitFlag = i;\r\n\t\t\t}\r\n\t\t}\r\n\r\n\t\tif(count <= 0){\r\n\t\t\talert(\"반환대상을 선택하세요. \");\r\n\t\t\treturn;\r\n\t\t}else{\r\n\t\t\tf.ReturnMsg.value = '폐기 / 매각, 점용료 대상을 제외한\\n'+count+'건에 대해 반환일자를 선택하세요.';\r\n            MessageDisplay('Dlg_Return','Dlg_ReturnMain',1);\r\n\t\t\r\n\t\t}\r\n    }\r\n\r\n\tfunction owner_list(owner_name,mode,target_name,target_ssn)\r\n    {\r\n\t    if(owner_name == ''){\r\n\t\t    alert('검색해야할 운영자명을 입력하세요');\r\n\t\t    return;\r\n\t    }\r\n\t    var winH = 340;\r\n        var winW = 480;\r\n        var top = parseInt(screen.height-winH)/2;\r\n\t\tvar left = parseInt(screen.width-winW)/2;\r\n        var status =\"toolbar=no, location=no, directories=no, status=no, menubar=no, resizable=no, scrollbars=no, width=\"+winW+\", height=\"+winH+\", left=\"+left+\", top=\"+top;\r\n        window.open('/rojum/jumyong/owner_list.do?OWNER_NAME='+owner_name+'&mode='+mode+'&target_name='+target_name+'&target_ssn='+target_ssn, 'win', status);\r\n    }\r\n\r\n    function rojum_Destroy(){\r\n\r\n    \tvar f = document.jumyongForm;\r\n\t\tvar select_item = document.getElementsByName(\"SELECT_ITEM\");\r\n\t\tvar item_check = document.getElementsByName(\"ITEM_CHECK\");\r\n\t\tvar gapan_no = document.getElementsByName(\"GAPAN_NO\");\r\n\t\tvar tax_at = document.getElementsByName(\"TAX_AT\");\r\n\t\tvar count = 0;\r\n\r\n\t\tfor(var i = 0 ; i < select_item.length ; i++){\r\n\t\t\tif(select_item[i].checked == true && tax_at[i].value != '1'){\r\n\t\t\t\titem_check[i].value = select_item[i].checked;\r\n\t\t\t\tcount++;\r\n\t\t\t\thitFlag = i;\r\n\t\t\t}\r\n\t\t}\r\n\t\t\r\n\t\tif(count <= 0){\r\n\t\t\talert(\"폐기/매각 대상을 선택하세요. \");\r\n\t\t\treturn;\r\n\t\t}else if(count == 1){\r\n\t\t\tvar section = document.getElementById(\"View_Disuse\").value;\r\n\t\t\tvar bj_cd = document.getElementById(\"BJ_CD\").value;\r\n\t\t\tvar bonbun = document.getElementById(\"BONBUN\").value;\r\n\t\t\tvar bubun = document.getElementById(\"BUBUN\").value;\r\n\t\t\tvar jumyongName = document.getElementById(\"jumyongName\").value;\r\n\t\t\tvar numberValue = document.getElementById(\"numberValue\").value;\r\n\t\t\tvar fromDate = document.getElementById(\"fromDate\").value;\r\n\t\t\tvar toDate = document.getElementById(\"toDate\").value;\r\n\t\t\tvar maintn_ob = document.getElementById(\"MAINTN_OB\").value;\r\n\t\t\tvar gu_cd = getValueSelectTag(\"GU_CD\");\r\n\t\t\tvar mg_typ = getValueSelectTag(\"MG_TYP\");\r\n\r\n\t\t\tvar param = \"/rojum/jumyong/view.do?GAPAN_NO=\"+gapan_no[hitFlag].value+\"&cal_mode=cal4\"\r\n\t\t\t+\"&gu_cd=\"+gu_cd+\"&bj_cd=\"+bj_cd+\"&bonbun=\"+bonbun+\"&bubun=\"+bubun+\"&jumyongName=\"+jumyongName+\"&numberValue=\"+numberValue\r\n\t\t\t+\"&fromDate=\"+fromDate+\"&toDate=\"+toDate+\"&maintn_ob=\"+maintn_ob+\"&section=\"+section+\"&mg_typ=\"+mg_typ;\r\n\r\n\t\t\tlocation.href=param;\r\n\r\n\t\t}else{\r\n        \tresetDestroy();\r\n\t\t\tMessageDisplay('BatchD";
  private final static String _jspx_template15 = "estroy','BatchDestroyMain',1);\r\n\t\t}\r\n    }\r\n\r\n    function checkDestroySt(obj){\r\n\r\n        if(obj == '0'){\r\n        \tresetDestroy();\r\n        \tdocument.getElementsByName(\"DESTROY_ST\")[0].checked = true;\r\n        \tdocument.getElementById(\"DestroyProgress\").style.display = 'block'; \r\n        \tdocument.getElementById(\"DestroyComplete\").style.display = 'none';\r\n        }else if(obj == '1'){\r\n        \tresetDestroy();\r\n        \tdocument.getElementsByName(\"DESTROY_ST\")[1].checked = true;\r\n        \tdocument.getElementById(\"DestroyProgress\").style.display = 'none'; \r\n        \tdocument.getElementById(\"DestroyComplete\").style.display = 'block';\r\n        }else if(obj == '-1'){\r\n        \tdocument.getElementById(\"DestroyProgress\").style.display = 'none'; \r\n        \tdocument.getElementById(\"DestroyComplete\").style.display = 'none';\r\n        }\r\n    }\r\n\r\n    function DestroyPrc(){\r\n        var f = document.jumyongForm;\r\n\t\tvar select_item = document.getElementsByName(\"SELECT_ITEM\");\r\n\t\tvar item_check = document.getElementsByName(\"ITEM_CHECK\");\r\n\t\tvar gapan_no = document.getElementsByName(\"GAPAN_NO\");\r\n\t\tvar tax_at = document.getElementsByName(\"TAX_AT\");\r\n\t\tvar sale_status = document.getElementsByName(\"SALE_STATUS_ARR\");\r\n\t\tvar count = 0;\r\n\t\tvar _destroy_st = f.DESTROY_ST;\r\n\r\n\t\tvar desType = \"\";\r\n\t\t\r\n\t\t// 진행중\r\n        if( _destroy_st[0].checked){\r\n    \t\tfor(var i = 0 ; i < select_item.length ; i++){\r\n    \t\t\tif(select_item[i].checked == true && tax_at[i].value != '1' && sale_status[i].value == ''){\r\n    \t\t\t\titem_check[i].value = select_item[i].checked;\r\n    \t\t\t\tcount++;\r\n    \t\t\t}\r\n    \t\t}\r\n\r\n    \t\t\r\n    \t\tif(!confirm(\"폐기/매각 진행이 가능한 \"+count+ \"건에 대해서 일괄처리 하시겠습니까?\")){\r\n                return;\r\n            }\r\n\r\n    \t\tdesType = \"Progress\";\r\n\t\t\r\n        }\r\n     \t// 완료중\r\n        else{\r\n    \t\tfor(var i = 0 ; i < select_item.length ; i++){\r\n    \t\t\tif(select_item[i].checked == true && tax_at[i].value != '1' && (sale_status[i].value == '1' || sale_status[i].value == '2')){\r\n    \t\t\t\titem_check[i].value = select_item[i].checked;\r\n    \t\t\t\tcount++;\r\n    \t\t\t}\r\n    \t\t}\r\n\r\n    \t\tif(!confirm(\"폐기/매각 완료가 가능한 \"+count+ \"건에 대해서 일괄처리 하시겠습니까?\")){\r\n                return;\r\n            }\r\n\r\n    \t\tdesType = \"Complete\";\r\n\r\n        }\r\n\r\n        MessageDisplay('BatchDestroy','BatchDestroyMain',0);\r\n        if(desType == \"Progress\"){\r\n        \tdocument.jumyongForm.action = '/rojum/jumyong/batch_destroy_prc.do?desType=Progress';\r\n        \tdocument.jumyongForm.submit();\r\n        }else if(desType == \"Complete\"){\r\n        \tdocument.jumyongForm.action = '/rojum/jumyong/batch_destroy_prc.do?desType=Complete';\r\n        \tdocument.jumyongForm.submit();\r\n        }\r\n    }\r\n\r\n    function resetDestroy(){\r\n    \tcheckDestroySt(-1);\r\n\r\n    \tdocument.getElementsByName(\"DESTROY_ST\")[0].checked = false;\r\n    \tdocument.getElementsByName(\"DESTROY_ST\")[1].checked = false;\r\n\r\n    \tdocument.getElementById(\"SALE_DATE\").value = \"\";\r\n    \tdocument.getElementById(\"SALE_NO\").value = \"\";\r\n    \tdocument.getElementById(\"SALE_BIGO\").value = \"\";\r\n    \tdocument.getElementById(\"HND_OFFICE\").value = \"\";\r\n    \tdocument.getElementById(\"HND_DESDATE\").value = \"\";\r\n    \tdocument.getElementById(\"HND_OPEDATE\").value = \"\";\r\n    \tdocument.getElementById(\"HND_BIGO\").value = \"\";\r\n\r\n    }\r\n    \r\n    \r\n    function changeGuCd(obj){\r\n    \tvar guCd = getSelectedValue(obj);\r\n        var\tparam\t= \"guCd=\"+guCd;\r\n        sendRequest(\"/get_bjdong_code.do\", param, \"GET\", ResultChangeGuCd);\r\n    \t\r\n    \t\r\n    }\r\n\r\n    function\tResultChangeGuCd(obj)\r\n    {\r\n    \tselect_innerHTML(document.getElementById(\"BJ_CD\"),obj);\r\n    }\r\n\r\n\r\n    ////////////////////////////////AJAX////////////////////////////////////////////\r\n    function getXMLHTTPRequest()\r\n    {\r\n        var xRequest = null;\r\n        xRequest = new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n\r\n        return xRequest;\r\n    }\r\n\r\n    var req;\r\n    var\tcall;\r\n\r\n    function sendRequest(url, params, HttpMethod, callback)\r\n    {\r\n        req = getXMLHTTPRequest();\r\n\r\n        call\t= callback;\r\n        if(req){\r\n            req.onreadystatechange = onReadyStateChange;\r\n            req.ope";
  private final static String _jspx_template16 = "n(HttpMethod, url, true);\r\n            req.setRequestHeader(\"Content-Type\",\"application/x-www-form-urlencoded;charset=utf-8\");\r\n            req.send(params);\r\n        }\r\n    }\r\n\r\n    function onReadyStateChange()\r\n    {\r\n        var ready = req.readyState;\r\n        var data = null;\r\n        if(ready == 4){\r\n            if(this.call\t!= null)\r\n            {\r\n                this.call(req.responseText);\r\n            }\r\n        }\r\n    }\r\n    \r\n</script>\r\n</head>\r\n<body onload=\"javascript:InitPage();\">\r\n\r\n<form id=\"jumyongForm\" name=\"jumyongForm\" method=\"post\">\r\n<input id=\"toDateValue\" name=\"toDateValue\" value=\"";
  private final static String _jspx_template17 = "\" type=\"hidden\">\r\n<input id=\"fromDateValue\" name=\"fromDateValue\" value=\"";
  private final static String _jspx_template18 = "\" type=\"hidden\">\r\n<input id=\"TAX_SET\" name=\"TAX_SET\" type=\"hidden\" value=\"";
  private final static String _jspx_template19 = "\">\r\n\r\n<div id=\"BatchDestroy\" style=\"position:absolute;display: none;\">\r\n\t<table id=\"BatchDestroyMain\" width=\"510px\" height=\"210px\" border=\"3\" bordercolor=\"#c9afed\" style=\"border-collapse:collapse;background-color:white;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t<tr>\r\n\t\t\t<td>\r\n\t\t\t\t<table width=\"100%\" height=\"100%\" border=\"0\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;background-color:white;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t<tr height=\"26px\">\r\n\t\t\t\t\t\t<td align=\"center\">\r\n\t\t\t\t\t\t\t<font color=\"red\">폐기/매각 일괄처리</font>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr height=\"26px\">\r\n\t\t\t\t\t\t<td  align=\"center\">\r\n\t\t\t\t\t\t\t<input name=\"DESTROY_ST\" type=\"radio\" value=\"0\" onclick=\"checkDestroySt('0')\">폐기매각 진행\r\n\t\t\t\t\t\t\t&nbsp;&nbsp;\r\n\t\t\t\t\t\t\t<input name=\"DESTROY_ST\" type=\"radio\" value=\"1\" onclick=\"checkDestroySt('1')\">폐기매각 완료\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr height=\"108px\">\r\n\t\t\t\t\t\t<td align=\"center\">\r\n\t\t\t\t\t\t\t<table id=\"DestroyProgress\"  width=\"100%\" height=\"100%\" border=\"0\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;display:none;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t<tr  height=\"30px\" >\r\n\t\t\t\t\t\t\t\t\t<td colspan=\"4\" align=\"left\" bgcolor=\"#FFFFFF\" class=\"\">\r\n\t\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"sub_stan_blue\">&nbsp; * 처리정보 </span>\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t<tr height=\"26px\">\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">처리방향</td>\r\n\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\" colspan=\"3\">\r\n\t\t\t\t\t\t                  \t<select id=\"SALE_STATUS\" name=\"SALE_STATUS\" class=\"input_form1\">\r\n\t\t\t\t\t\t                   \t<option value=\"1\">폐기</option>\r\n\t\t\t\t\t\t                   \t<option value=\"2\">매각</option>\r\n\t\t\t\t\t\t                   </select>\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t<tr height=\"26px\">\r\n\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t<td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">공고일자</td>\r\n\t\t\t\t\t\t\t\t\t<td width=\"150px\" bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\">\r\n\t\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input id=\"SALE_DATE\" name=\"SALE_DATE\" type=\"text\" value=\"";
  private final static String _jspx_template20 = "\"class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" onKeyDown=\"onlyNumberInput();\"   onKeyDown=\"onlyNumberInput();\" maxlength=8>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"/img/calendar_icon.gif\" onclick=\"popUpCalendar(this, document.getElementById('SALE_DATE'), 'yyyymmdd');\" style=\"cursor:pointer;vertical-align:middle;\" >\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t<td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\"\tclass=\"sub_table_b\">공고번호</td>\r\n\t\t\t\t\t\t\t\t\t<td width=\"150px\" bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\">\r\n\t\t\t\t\t\t\t\t\t\t<input id=\"SALE_NO\" name=\"SALE_NO\" type=\"text\" value=\"";
  private final static String _jspx_template21 = "\" style=\"width:100px;ime-mode:disabled;\" class=\"input_form1\" onKeyDown=\"onlyNumberInput();\" maxlength=\"20\">\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t<tr height=\"26px\">\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">처리사유</td>\r\n\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\" colspan=\"3\">\r\n\t\t\t\t\t\t\t\t\t\t<input id=\"SALE_BIGO\" name=\"SALE_BIGO\" type=\"text\" value=\"";
  private final static String _jspx_template22 = "\" style=\"width:355px;\" class=\"input_form1\" maxlength=\"100\">\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\r\n\t\t\t\r\n\t\t\t\t\t\t\t<table id=\"DestroyComplete\" width=\"100%\" height=\"100%\" border=\"0\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;display:none\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t<tr height=\"30px\" >\r\n\t\t\t\t\t\t\t\t\t<td align=\"left\" class=\"sub_table_b\" colspan=\"4\">\r\n\t\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td><span class=\"sub_stan_blue\">&nbsp; * 처리결과 </span></td>\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t<tr height=\"26px\">\r\n\t\t\t\t\t\t\t\t\t<td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">처리업체명</td>\r\n\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\" colspan=\"3\">\r\n\t\t\t\t\t\t\t\t\t\t<input id=\"HND_OFFICE\" name=\"HND_OFFICE\" type=\"text\" value=\"";
  private final static String _jspx_template23 = "\" style=\"width:140px;\" class=\"input_form1\" maxlength=\"100\">\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t<tr height=\"26px\">\r\n\t\t\t\t\t\t\t\t\t<td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">결정일자</td>\r\n\t\t\t\t\t\t\t\t\t<td width=\"150px\" bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\">\r\n\t\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"HND_DESDATE\" id=\"HND_DESDATE\" type=\"text\" value=\"";
  private final static String _jspx_template24 = "\"class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" onKeyDown=\"onlyNumberInput();\"   onKeyDown=\"onlyNumberInput();\" maxlength=8>\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"/img/calendar_icon.gif\" onclick=\"popUpCalendar(this, document.getElementById('HND_DESDATE'), 'yyyymmdd');\" style=\"cursor:pointer;vertical-align:middle;\" >\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t<td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">시행일자</td>\r\n\t\t\t\t\t\t\t\t\t<td width=\"150px\" bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\">\r\n\t\t\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<input id=\"HND_OPEDATE\" name=\"HND_OPEDATE\" type=\"text\" value=\"";
  private final static String _jspx_template25 = "\"class=\"input_form1\" style=\"width:80px;ime-mode:disabled;\" onKeyDown=\"onlyNumberInput();\"   onKeyDown=\"onlyNumberInput();\" maxlength=8>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"/img/calendar_icon.gif\" onclick=\"popUpCalendar(this, document.getElementById('HND_OPEDATE'), 'yyyymmdd');\" style=\"cursor:pointer;vertical-align:middle;\" >\r\n\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t<tr height=\"26px\">\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" nowrap=\"nowrap\">특이사항</td>\r\n\t\t\t\t\t\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\" nowrap=\"nowrap\" align=\"left\">\r\n\t\t\t\t\t\t\t\t\t\t<input id=\"HND_BIGO\" name=\"HND_BIGO\" type=\"text\" value=\"";
  private final static String _jspx_template26 = "\" style=\"width:355px;\" class=\"input_form1\" maxlength=\"100\">\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\r\n\t\t\t\t\t\t\r\n\t\t\t\t\t\t\r\n\t\t\t\t\t<tr height=\"26px\">\r\n\t\t\t\t\t\t<td align=\"right\">\r\n\t\t\t\t\t\t\t<img src=\"/img/register_icon2.gif\" alt=\"등록\" width=\"56\" height=\"18\" border=\"0\" onClick=\"DestroyPrc();\" style=\"cursor: pointer\"> \r\n\t\t\t\t\t\t\t<img src=\"/img/can_icon.gif\" alt=\"취소\" border=\"0\" onclick=\"MessageDisplay('BatchDestroy','BatchDestroyMain',0);\" style=\"cursor: pointer\">\r\n\t\t\t\t\t\t\t&nbsp;&nbsp;\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t</table>\r\n\t\t\t</td>\r\n\t\t</tr>\r\n\t</table>\r\n</div>\r\n\r\n<div id=\"Dlg_BatchCal1\" style=\"position:absolute;display: none;\">\r\n\t<table id=\"Dlg_BatchCal1Main\" width=\"300px\" height=\"150px\" border=\"3\" bordercolor=\"#c9afed\" style=\"border-collapse:collapse;background-color:white;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t<tr>\r\n\t\t<td align=\"center\">\r\n\t\t\t<table width=\"290px\" height=\"140px\" border=\"0\" style=\"border-collapse:collapse;background-color:white;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t<tr>\r\n\t\t\t\t<td height=\"5px\">\r\n\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td align=\"center\">\r\n\t\t\t\t\t\t<font color=\"red\">일괄 점용료계산을 위해 산출년도를 선택하세요.</font>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td align=\"center\">\r\n\t\t\t\t\t\t산출년도\r\n\t\t\t\t\t\t<select id=\"YEAR\" name=\"YEAR\" class=\"input_form1\" style=\"width:60px\">\r\n\t\t\t\t\t\t</select>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td align=\"center\" >\r\n\t\t\t\t\t\t<img src=\"/img/cal_icon.gif\" alt=\"산출\" width=\"56\" height=\"18\" border=\"0\" onClick=\"document.jumyongForm.action = '/rojum/jumyong/batch_cal1.do';document.jumyongForm.submit();\"  style=\"cursor:pointer\">\r\n\t\t\t\t\t\t<img src=\"/img/can_icon.gif\" alt=\"취소\" border=\"0\" onclick=\"MessageDisplay('Dlg_BatchCal1','Dlg_BatchCal1Main',0);\" style=\"cursor:pointer\" >\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n\t\r\n\t\r\n\t</table>\r\n</div>\r\n\r\n<div id=\"Dlg_Return\" style=\"position:absolute;display: none;\">\r\n\t<table id=\"Dlg_ReturnMain\" width=\"300px\" height=\"150px\" border=\"3\" bordercolor=\"#c9afed\" style=\"border-collapse:collapse;background-color:white;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t<tr>\r\n\t\t<td align=\"center\">\r\n\t\t\t<table width=\"290px\" height=\"140px\" border=\"0\" style=\"border-collapse:collapse;background-color:white;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t<tr>\r\n\t\t\t\t<td height=\"5px\">\r\n\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td align=\"center\">\r\n\t\t\t\t\t\t<textarea rows=\"2\" cols=\"1\" id =\"ReturnMsg\" name=\"ReturnMsg\" class=\"input_form1\" style=\"width:280px;overflow:hidden;text-align:center;border:0px;color:red;\" readonly></textarea>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td align=\"center\">\r\n\t\t\t\t\t\t반환일자\r\n\t\t\t\t\t\t<input id =\"ReturnDate\" name=\"ReturnDate\" value=\"";
  private final static String _jspx_template27 = "\" type=\"text\" class=\"input_form1\" style=\"width:80px\" readonly>\r\n\t\t\t\t    \t<img src=\"/img/calendar_icon.gif\" style=\"cursor:pointer;vertical-align:middle;\" onclick=\"popUpCalendar(this, document.getElementById('ReturnDate'),'yyyymmdd');\">\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td align=\"center\" >\r\n\t\t\t\t\t\t<img src=\"/img/return_icon.gif\" alt=\"반환\" width=\"56\" height=\"18\" border=\"0\" onClick=\"document.jumyongForm.action = '/rojum/jumyong/returnProduct.do';document.jumyongForm.submit();\"  style=\"cursor:pointer\">\r\n\t\t\t\t\t\t<img src=\"/img/can_icon.gif\" alt=\"취소\" border=\"0\" onclick=\"MessageDisplay('Dlg_Return','Dlg_ReturnMain',0);\" style=\"cursor:pointer\" >\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n\t</table>\r\n</div>\r\n\r\n\r\n<table width=\"780px\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t<tr>\r\n\t\t<td height=\"43\">\r\n\t\t\t<img src=\"/img/sub7_cont1_title.gif\" width=\"800\" height=\"43\">\r\n\t\t</td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td>\r\n\t\t<table width=\"780px\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\r\n\t\t\t<tr>\r\n\t\t\t\t<td>\r\n\t\t\t\t<table width=\"780px\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td align=\"left\" height=\"22\" background=\"/img/tab_line_blue.gif\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td class=\"contborder_purple\">\r\n\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse: collapse;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" >갱신기간</td>\r\n\t\t\t\t\t                      \t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t\t\t\t\t\t\t\t\t  <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t                        <tr>\r\n\t\t\t\t\t\t                          <td>\r\n\t\t\t\t\t\t                          <input id=\"fromDate\" name=\"fromDate\" value=\"";
  private final static String _jspx_template28 = "\" type=\"text\" class=\"input_form1\" style=\"width:80px\" readonly></td>\r\n\t\t\t\t\t\t                          <td>\r\n\t\t\t\t\t\t                          <img src=\"/img/calendar_icon.gif\" style=\"cursor:pointer\" onclick=\"popUpCalendar(this, document.getElementById('fromDate'), 'yyyymmdd');\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t  </td>\r\n\t\t\t\t\t\t                          <td width=\"16\" align=\"center\">&nbsp;&nbsp;~&nbsp;&nbsp;</td>\r\n\t\t\t\t\t\t                          <td>\r\n\t\t\t\t\t\t                            <input id =\"toDate\" name=\"toDate\" value=\"";
  private final static String _jspx_template29 = "\" type=\"text\" class=\"input_form1\" style=\"width:80px\" readonly></td>\r\n\t\t\t\t\t\t                          <td>&nbsp;<img src=\"/img/calendar_icon.gif\" style=\"cursor:pointer\" onclick=\"popUpCalendar(this, document.getElementById('toDate'), 'yyyymmdd');\">\r\n\t\t\t\t\t\t                          </td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t                      </table>\r\n\t\t\t\t\t\t                  \t</td>\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td height=\"26px\" width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">등록구분</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td width=\"35%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\t\t\t\t\t\t\t\t\t\t\t\t<select id=\"MG_TYP\" name=\"MG_TYP\" class=\"input_form1\" style=\"width:100px\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template30 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td height=\"26px\" width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">정비/관리</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\t\t\t\t\t\t\t\t\t\t\t\t<select id=\"MAINTN_OB\" name=\"MAINTN_OB\" class=\"input_form1\" style=\"width:100px\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template31 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\"\tclass=\"sub_table_b\">시군구</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<select id=\"GU_CD\" name=\"GU_CD\" class=\"input_form1\" style=\"width: 130px\" onchange=\"changeGuCd(this);\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template32 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\"\tclass=\"sub_table_b\">법정동</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<select id=\"BJ_CD\" name=\"BJ_CD\" class=\"input_form1\" style=\"width: 130px\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template33 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">번 지</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input id=\"BONBUN\" name=\"BONBUN\" type=\"text\" class=\"input_form1\" value=\"";
  private final static String _jspx_template34 = "\" style=\"width: 40px\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t- <input id=\"BUBUN\" name=\"BUBUN\" type=\"text\" class=\"input_form1\" value=\"";
  private final static String _jspx_template35 = "\" style=\"width: 40px\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">운영인</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input id=\"jumyongName\" name=\"jumyongName\" type=\"text\" class=\"input_form1\" style=\"width: 130px\" onKeyDown=\"javascript:checkKeySearch();\" value=\"";
  private final static String _jspx_template36 = "\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">관리번호</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input id=\"numberValue\" name=\"numberValue\" type=\"text\" class=\"input_form1\" style=\"width: 130px\" onKeyDown=\"javascript:checkKeySearch();\" value=\"";
  private final static String _jspx_template37 = "\">\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">폐쇄목록</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<select id=\"View_Disuse\" name=\"View_Disuse\" class=\"input_form1\" style=\"width:100px\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"1\">감춤</option>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"4\">보기</option>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t                    </tr>\t\t\t\r\n\t\t\t\t\t                    \r\n\t\t\t\t\t                    <tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">시설종류</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<select id=\"FT_TYP\" name=\"FT_TYP\" class=\"input_form1\" style=\"width:100px\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"\">전체</option>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"021\">거리가게</option>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"022\">적치물</option>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t                    </tr>\t\t       \r\n\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"40px\" align=\"right\">\r\n\t\t\t\t\t\t\t\t<img src=\"/img/inquiry_icon2.gif\" alt=\"조회\" width=\"56\" height=\"18\" border=\"0\" onclick=\"javascript:goSearch();\" style=\"cursor: pointer\"></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"2px\" bgcolor=\"#EAEAEA\"></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t<table width=\"100%\">\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n                                            <td height=\"34\" class=\"sub_stan\" align=\"left\">전체건수&nbsp;:&nbsp;<span class=\"sub_stan_blue\">";
  private final static String _jspx_template38 = "</span>건&nbsp;/&nbsp;운영자 미확인&nbsp;:&nbsp;<span class=\"sub_stan_blue\">";
  private final static String _jspx_template39 = "</span>건\r\n                                            </td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td align=\"right\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"/img/excel_icon.gif\" alt=\"EXCEL 변환\" border=\"0\" onclick=\"javascript:excel_Search();\" style=\"cursor:pointer;\">\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t<table width=\"780px\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" class=\"sub_table\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\">\r\n\t\t\t\t\t\t\t\t  <TR>\r\n\t\t\t\t\t\t\t\t    <TD width=\"26px\"  valign=\"top\">\r\n\t\t\t\t\t\t\t\t      <TABLE cellpadding=\"0\" cellspacing=\"0\" border=\"1\" class=\"sub_table\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\">\r\n\t\t\t\t\t\t\t\t        <TR>\r\n\t\t\t\t\t\t\t\t              <td height=\"26px\" width=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<INPUT TYPE=\"checkbox\" ID=\"SELECT_ALL\" onclick=\"javascript:selectAll(this);\">\r\n\t\t\t\t\t\t\t\t\t\t\t  </td>\r\n\t\t\t\t\t\t\t\t        </TR>\r\n\t\t\t\t\t\t\t\t      </TABLE>\r\n\t\t\t\t\t\t\t\t    </TD>\r\n\t\t\t\t\t\t\t\t    <TD width=\"754px\" valign=\"top\">\r\n\t\t\t\t\t\t\t\t      <DIV id=\"topLine2\" style=\"width:754px;overflow:hidden;\">\r\n\t\t\t\t\t\t\t\t        <TABLE width=\"1120px\" cellpadding=\"0\" cellspacing=\"0\" border=\"1\" class=\"sub_table\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\">\r\n\t\t\t\t\t\t\t\t          <tr>\r\n\t\t\t\t\t\t  \t\t\t\t\t<td height=\"26px\" width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">관리번호</td>\r\n\t\t\t\t\t\t  \t\t\t\t\t<td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">등록구분</td>\r\n\t\t\t\t\t\t  \t\t\t\t\t<td width=\"120px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">시설종류</td>\r\n\t\t\t\t\t\t  \t\t\t\t\t<td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">수거일</td>\r\n\t\t\t\t\t\t  \t\t\t\t\t<td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">보관일</td>\r\n\t\t\t\t\t\t  \t\t\t\t\t<td width=\"80px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">운영인</td>\t\t\t\t\t\t  \t\t\t\t\t\r\n\t\t\t\t\t\t  \t\t\t\t\t<td width=\"140px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">인접지 주소</td>\r\n\t\t\t\t\t\t  \t\t\t\t\t<!--  //********** BEGIN_KANG_20120423 -->\r\n\t\t\t\t\t\t\t\t\t\t\t<!-- \r\n\t\t\t\t\t\t\t\t\t\t\t<td width=\"150px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">인접지 새주소</td>\r\n\t\t\t\t\t\t\t\t\t\t\t-->\r\n\t\t\t\t\t\t\t\t\t\t\t<!--   //********** END_KANG_20120423 -->\r\n\t\t\t\t\t\t  \t\t\t\t\t<td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">상&nbsp;&nbsp;&nbsp;&nbsp;태</td>\r\n\t\t\t\t\t\t  \t\t\t\t\t<td width=\"80px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">면적(㎡)</td>\r\n\t\t\t\t\t\t  \t\t\t\t\t<td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">정비/관리</td>\r\n\t\t\t\t\t\t  \t\t\t\t\t<td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">갱신일자</td>\r\n\t\t\t\t\t\t\t\t          </tr>\r\n\t\t\t\t\t\t\t\t        </TABLE>\r\n\t\t\t\t\t\t\t\t      </DIV>\r\n\t\t\t\t\t\t\t\t    </TD>\r\n\t\t\t\t\t\t\t\t  </TR>\r\n\t\t\t\t\t\t\t\t  <TR>\r\n\t\t\t\t\t\t\t\t    <TD width=\"26px\" valign=\"top\">\r\n\t\t\t\t\t\t\t\t        <TABLE cellpadding=\"0\" cellspacing=\"0\" border=\"1\" class=\"sub_table\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\">\r\n\t\t\t\t\t\t          \t\t\t";
  private final static String _jspx_template40 = "\r\n\t\t\t\t\t\t  \t\t\t\t\t<tr onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\"\tstyle=\"cursor: pointer\">\r\n\t\t\t\t\t\t  \t\t\t\t\t\t<td height=\"26px\" width=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<!-- 개별 및 일괄 선택에 필요한 값 -->\r\n\t\t\t\t\t\t  \t\t\t\t\t\t\t<INPUT TYPE=\"checkbox\" NAME=\"SELECT_ITEM\">\r\n\t\t\t\t\t\t  \t\t\t\t\t\t\t<INPUT TYPE=\"hidden\" NAME=\"GAPAN_NO\" value=\"";
  private final static String _jspx_template41 = "\"> \r\n\t\t\t\t\t\t  \t\t\t\t\t\t\t<INPUT TYPE=\"hidden\" NAME=\"ITEM_CHECK\" value=\"\">\r\n\t\t\t\t\t\t  \t\t\t\t\t\t\t<INPUT TYPE=\"hidden\" NAME=\"TAX_AT\" value=\"";
  private final static String _jspx_template42 = "\">\r\n\t\t\t\t\t\t  \t\t\t\t\t\t\t<INPUT TYPE=\"hidden\" NAME=\"SECTION\" value=\"";
  private final static String _jspx_template43 = "\">\r\n\t\t\t\t\t\t  \t\t\t\t\t\t\t<INPUT TYPE=\"hidden\" NAME=\"OWNER_SSN\" value=\"";
  private final static String _jspx_template44 = "\">\r\n\t\t\t\t\t\t  \t\t\t\t\t\t\t<INPUT TYPE=\"hidden\" NAME=\"NAME\" value=\"";
  private final static String _jspx_template45 = "\">\r\n\t\t\t\t\t\t  \t\t\t\t\t\t\t<INPUT TYPE=\"hidden\" NAME=\"SALE_STATUS_ARR\" value=\"";
  private final static String _jspx_template46 = "\">\r\n\t\t\t\t\t\t  \t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t  \t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template47 = "\r\n\t\t\t\t\t\t\t\t        </TABLE>\r\n\t\t\t\t\t\t\t\t    </TD>\r\n\t\t\t\t\t\t\t\t    <TD width=\"754px\" valign=\"top\">\r\n\t\t\t\t\t\t\t\t      <DIV id=\"mainDisplay2\" style=\"width:754px;overflow-y:hidden;overflow-x:scroll;scrollbar-face-color:#EEF8FB;scrollbar-3dlight-color:#BBBDB6; scrollbar-highlight-color:#EEF8FB;scrollbar-shadow-color:#BBBDB6; scrollbar-darkshadow-color:#EEF8FB;scrollbar-track-color:#EEF8FB;scrollbar-arrow-color:#BBBDB6;\" onScroll=\"scrollColumn()\">\r\n\t\t\t\t\t\t\t\t        <TABLE width=\"1120px\" cellpadding=\"0\" cellspacing=\"0\" border=\"1\" class=\"sub_table\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\">\r\n\t\t\t\t\t\t\t\t          ";
  private final static String _jspx_template48 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\"\tstyle=\"cursor: pointer\" onclick=\"click_History('";
  private final static String _jspx_template49 = "');\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td height=\"26px\" width=\"100px\" align=\"center\">";
  private final static String _jspx_template50 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100px\" align=\"center\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template51 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"120px\" align=\"center\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template52 = "&nbsp;/&nbsp;";
  private final static String _jspx_template53 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100px\" align=\"center\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template54 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<!--  //********** BEGIN_KANG_20120423 -->\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100px\" align=\"center\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template55 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template56 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template57 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template58 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t-\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template59 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<!--   //********** END_KANG_20120423 -->\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"80px\" align=\"center\">";
  private final static String _jspx_template60 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"140px\" align=\"center\">";
  private final static String _jspx_template61 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<!--  //********** BEGIN_KANG_20120423 -->\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<!-- \r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"150px\" align=\"center\">";
  private final static String _jspx_template62 = " &nbsp;";
  private final static String _jspx_template63 = "&nbsp; ";
  private final static String _jspx_template64 = "&nbsp; ";
  private final static String _jspx_template65 = "&nbsp; ";
  private final static String _jspx_template66 = "&nbsp; ";
  private final static String _jspx_template67 = "&nbsp; ";
  private final static String _jspx_template68 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t-->\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<!--   //********** END_KANG_20120423 -->\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100px\" align=\"center\"><font color=\"red\">";
  private final static String _jspx_template69 = "</font></td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"80px\" align=\"center\">";
  private final static String _jspx_template70 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100px\" align=\"center\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template71 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template72 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t관리대상\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template73 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template74 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t정비대상\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template75 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template76 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100px\" align=\"center\">";
  private final static String _jspx_template77 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template78 = "\t\r\n\t\t\t\t\t\t\t\t        </TABLE>\r\n\t\t\t\t\t\t\t\t      </DIV>\r\n\t\t\t\t\t\t\t\t    </TD>\r\n\t\t\t\t\t\t\t\t  </TR>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t  <td height=\"40\" align=\"center\">\r\n\t\t\t\t\t\t\t   <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t       <tr>\r\n\t\t\t\t\t\t\t         <td align=\"center\">\r\n\t\t\t\t\t\t\t         \t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t\t\t\t\t\t            <tr>\r\n\t\t\t\t\t\t\t            \t";
  private final static String _jspx_template79 = "\r\n\t\t\t\t\t\t\t            </tr>\r\n\t\t\t\t\t\t\t         \t</table>\r\n\t\t\t\t\t\t\t         </td>\r\n\t\t\t\t\t\t\t       </tr>\r\n\t\t\t\t\t\t\t     </table>\r\n\t\t\t\t\t\t\t    </td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\r\n\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"10px\"></td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td>\r\n\t\t\t\t\t<table width=\"100%\">\r\n                    <tr>\r\n                     <td width=\"30%\" align=\"left\">\r\n                     \t<img src=\"/img/rojum_register.gif\" alt=\"신규등록\" border=\"0\" onclick=\"javascript:rojum_Register();\" style=\"cursor:pointer;\">\r\n                     </td>\r\n                     <td align=\"right\">\r\n                     \t<img src=\"/img/rojum_cal1.gif\" alt=\"점용료산출\" border=\"0\" onclick=\"javascript:rojum_Individual();\" style=\"cursor:pointer;\">\r\n\t                    <img src=\"/img/rojum_cal2.gif\" alt=\"변상금산출\" border=\"0\" onclick=\"javascript:rojum_Cal2();\" style=\"cursor:pointer;\">\r\n\t\t\t\t\t\t<img src=\"/img/rojum_cal3.gif\" alt=\"과태료산출\" border=\"0\" onclick=\"javascript:rojum_Cal3();\" style=\"cursor:pointer;\">\r\n\t\t\t\t\t\t<img src=\"/img/rojum_destroy.gif\" alt=\"폐기 /매각\" border=\"0\" onclick=\"javascript:rojum_Destroy();\" style=\"cursor:pointer;\">\r\n\t\t\t\t\t\t<img src=\"/img/rojum_return_icon.gif\" alt=\"수거물 반환\" border=\"0\" onclick=\"javascript:rojum_Return();\" style=\"cursor:pointer;\">\r\n                     </td>\r\n                    </tr>\r\n                   </table>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"10px\"></td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td align=\"right\">\r\n\t\t\t\t\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t</table>\r\n\t\t\r\n\t\t</td>\r\n\t</tr>\r\n</table>\r\n</form>\r\n</body>\r\n\r\n <script type=\"text/javascript\">\r\n var ft_type = \"";
  private final static String _jspx_template80 = "\";\r\n //alert(parseInt(ft_type));\r\n if(ft_type == null)\r\n\t\tdocument.getElementById(\"FT_TYP\").value = \"\";\r\n\telse \r\n\t\t document.getElementById(\"FT_TYP\").value = ft_type;\r\n </script>\r\n\r\n</html>";
}
