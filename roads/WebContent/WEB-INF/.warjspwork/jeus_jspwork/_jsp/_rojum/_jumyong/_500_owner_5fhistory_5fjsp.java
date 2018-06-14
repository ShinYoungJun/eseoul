package jeus_jspwork._jsp._rojum._jumyong;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_owner_5fhistory_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(31,63);to=(31,71)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template22);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_1_fn(pageContext, null)) return;


      out.write(_jspx_template28);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_2_fn(pageContext, null)) return;


      out.write(_jspx_template50);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_3_fn(pageContext, null)) return;


      out.write(_jspx_template69);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_4_fn(pageContext, null)) return;


      out.write(_jspx_template73);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_5_fn(pageContext, null)) return;


      out.write(_jspx_template78);

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
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${JumyongList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("jumyong");
    _jspx_th_c_forEach_0.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template11);
            // jsp code [from=(58,71);to=(58,87)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${jumyong.GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template12);
            // jsp code [from=(59,56);to=(59,68)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${jumyong.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template13);
            // jsp code [from=(60,56);to=(60,88)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(jumyong.BONSE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template14);
            // jsp code [from=(61,56);to=(61,86)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(jumyong.TAX_DATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_1));

            out.write(_jspx_template15);
            // ----  c:choose ---- invoke //
            if (_jspx_th_c_choose_0_fn(pageContext, _jspx_th_c_forEach_0)) return true;


            out.write(_jspx_template21);

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
    _jspx_th_c_forEach_1.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GuideList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_1.setVar("guide");
    _jspx_th_c_forEach_1.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
        if (_jspx_eval_c_forEach_1 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template23);
            // jsp code [from=(99,71);to=(99,85)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${guide.GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template24);
            // jsp code [from=(100,57);to=(100,72)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${guide.FT_TYP_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template25);
            // jsp code [from=(100,76);to=(100,91)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${guide.FT_SEL_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template26);
            // jsp code [from=(101,56);to=(101,86)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(guide.GUIDE_DATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_1));

            out.write(_jspx_template27);

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

  private boolean _jspx_th_c_forEach_2_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:forEach ---- //
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = new org.apache.taglibs.standard.tag.rt.core.ForEachTag();
    _jspx_th_c_forEach_2.setPageContext(pageContext);
    _jspx_th_c_forEach_2.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PickupList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_2.setVar("Pickup");
    _jspx_th_c_forEach_2.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
        if (_jspx_eval_c_forEach_2 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template29);
            // jsp code [from=(148,65);to=(148,80)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${Pickup.GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template30);
            // jsp code [from=(149,53);to=(149,85)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(Pickup.PICKUP_DATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_1));

            out.write(_jspx_template31);
            // jsp code [from=(150,53);to=(150,85)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(Pickup.RETURN_DATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_1));

            out.write(_jspx_template32);
            // jsp code [from=(151,40);to=(151,54)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${Pickup.FT_ITEM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template33);
            // jsp code [from=(152,53);to=(152,91)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(Pickup.RETURN_BONSE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template34);
            // ----  c:choose ---- invoke //
            if (_jspx_th_c_choose_1_fn(pageContext, _jspx_th_c_forEach_2)) return true;


            out.write(_jspx_template40);
            // jsp code [from=(166,22);to=(166,60)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(Pickup.RETURN_SUNAP_DATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_1));

            out.write(_jspx_template41);
            // jsp code [from=(168,53);to=(168,87)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(Pickup.NO_BONSE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template42);
            // ----  c:choose ---- invoke //
            if (_jspx_th_c_choose_2_fn(pageContext, _jspx_th_c_forEach_2)) return true;


            out.write(_jspx_template48);
            // jsp code [from=(182,22);to=(182,56)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(Pickup.NO_SUNAP_DATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_1));

            out.write(_jspx_template49);

          } while (_jspx_th_c_forEach_2.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
        }
        if (_jspx_th_c_forEach_2.doEndTag() == Tag.SKIP_PAGE)
          return true;
      } catch (Throwable t) {
        _jspx_th_c_forEach_2.doCatch(t);
      } finally {
        _jspx_th_c_forEach_2.doFinally();
      }
    } finally {
      _jspx_th_c_forEach_2.release();
    }
    return false;
  }

  private boolean _jspx_th_c_forEach_3_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:forEach ---- //
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = new org.apache.taglibs.standard.tag.rt.core.ForEachTag();
    _jspx_th_c_forEach_3.setPageContext(pageContext);
    _jspx_th_c_forEach_3.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SaleList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_3.setVar("Sale");
    _jspx_th_c_forEach_3.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
        if (_jspx_eval_c_forEach_3 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template51);
            // jsp code [from=(219,66);to=(219,79)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${Sale.GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template52);
            // jsp code [from=(220,54);to=(220,68)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${Sale.FT_TYP_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template53);
            // jsp code [from=(220,74);to=(220,88)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${Sale.FT_SEL_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template54);
            // jsp code [from=(221,53);to=(221,81)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(Sale.SALE_DATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_1));

            out.write(_jspx_template55);
            // jsp code [from=(222,53);to=(222,65)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${Sale.SALE_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template56);
            // ----  c:choose ---- invoke //
            if (_jspx_th_c_choose_3_fn(pageContext, _jspx_th_c_forEach_3)) return true;


            out.write(_jspx_template66);
            // jsp code [from=(239,54);to=(239,69)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${Sale.HND_OFFICE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template67);
            // jsp code [from=(240,53);to=(240,83)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(Sale.HND_OPEDATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_1));

            out.write(_jspx_template68);

          } while (_jspx_th_c_forEach_3.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
        }
        if (_jspx_th_c_forEach_3.doEndTag() == Tag.SKIP_PAGE)
          return true;
      } catch (Throwable t) {
        _jspx_th_c_forEach_3.doCatch(t);
      } finally {
        _jspx_th_c_forEach_3.doFinally();
      }
    } finally {
      _jspx_th_c_forEach_3.release();
    }
    return false;
  }

  private boolean _jspx_th_c_forEach_4_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:forEach ---- //
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_4 = new org.apache.taglibs.standard.tag.rt.core.ForEachTag();
    _jspx_th_c_forEach_4.setPageContext(pageContext);
    _jspx_th_c_forEach_4.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${AccuseList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_4.setVar("Accuse");
    _jspx_th_c_forEach_4.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_4 = _jspx_th_c_forEach_4.doStartTag();
        if (_jspx_eval_c_forEach_4 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template70);
            // jsp code [from=(269,71);to=(269,103)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(Accuse.ACCUSE_DATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_1));

            out.write(_jspx_template71);
            // jsp code [from=(270,57);to=(270,75)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${Accuse.ACCUSE_DATA}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template72);

          } while (_jspx_th_c_forEach_4.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
        }
        if (_jspx_th_c_forEach_4.doEndTag() == Tag.SKIP_PAGE)
          return true;
      } catch (Throwable t) {
        _jspx_th_c_forEach_4.doCatch(t);
      } finally {
        _jspx_th_c_forEach_4.doFinally();
      }
    } finally {
      _jspx_th_c_forEach_4.release();
    }
    return false;
  }

  private boolean _jspx_th_c_forEach_5_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:forEach ---- //
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_5 = new org.apache.taglibs.standard.tag.rt.core.ForEachTag();
    _jspx_th_c_forEach_5.setPageContext(pageContext);
    _jspx_th_c_forEach_5.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ChangeJobList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_5.setVar("ChangeJob");
    _jspx_th_c_forEach_5.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_5 = _jspx_th_c_forEach_5.doStartTag();
        if (_jspx_eval_c_forEach_5 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template74);
            // jsp code [from=(296,71);to=(296,110)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(ChangeJob.CHANGE_JOB_DATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_1));

            out.write(_jspx_template75);
            // jsp code [from=(297,56);to=(297,87)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ChangeJob.CHANGE_JOB_SECTION_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template76);
            // jsp code [from=(298,57);to=(298,85)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ChangeJob.CHANGE_JOB_TYPE_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template77);

          } while (_jspx_th_c_forEach_5.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
        }
        if (_jspx_th_c_forEach_5.doEndTag() == Tag.SKIP_PAGE)
          return true;
      } catch (Throwable t) {
        _jspx_th_c_forEach_5.doCatch(t);
      } finally {
        _jspx_th_c_forEach_5.doFinally();
      }
    } finally {
      _jspx_th_c_forEach_5.release();
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
          out.write(_jspx_template16);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template18);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template20);

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
          out.write(_jspx_template35);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_1_fn(pageContext, _jspx_th_c_choose_1)) return true;


          out.write(_jspx_template37);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_1_fn(pageContext, _jspx_th_c_choose_1)) return true;


          out.write(_jspx_template39);

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
          out.write(_jspx_template43);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_2_fn(pageContext, _jspx_th_c_choose_2)) return true;


          out.write(_jspx_template45);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_2_fn(pageContext, _jspx_th_c_choose_2)) return true;


          out.write(_jspx_template47);

        } while (_jspx_th_c_choose_2.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_choose_2.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_choose_2.release();
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
    _jspx_th_c_choose_3.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    try {
      int _jspx_eval_c_choose_3 = _jspx_th_c_choose_3.doStartTag();
      if (_jspx_eval_c_choose_3 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template57);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_3_fn(pageContext, _jspx_th_c_choose_3)) return true;


          out.write(_jspx_template59);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_4_fn(pageContext, _jspx_th_c_choose_3)) return true;


          out.write(_jspx_template61);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_5_fn(pageContext, _jspx_th_c_choose_3)) return true;


          out.write(_jspx_template63);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_6_fn(pageContext, _jspx_th_c_choose_3)) return true;


          out.write(_jspx_template65);

        } while (_jspx_th_c_choose_3.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_choose_3.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_choose_3.release();
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
    _jspx_th_c_when_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${jumyong.TAX_YN == '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
      if (_jspx_eval_c_when_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template17);

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
          out.write(_jspx_template19);

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
    _jspx_th_c_when_1.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${Pickup.RETURN_TAX_YN == '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
      if (_jspx_eval_c_when_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template36);

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
          out.write(_jspx_template38);

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
    _jspx_th_c_when_2.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${Pickup.NO_TAX_YN == '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_2 = _jspx_th_c_when_2.doStartTag();
      if (_jspx_eval_c_when_2 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template44);

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
          out.write(_jspx_template46);

        } while (_jspx_th_c_otherwise_2.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_otherwise_2.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_otherwise_2.release();
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
    _jspx_th_c_when_3.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${Sale.SALE_STATUS == '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_3 = _jspx_th_c_when_3.doStartTag();
      if (_jspx_eval_c_when_3 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template58);

        } while (_jspx_th_c_when_3.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_when_3.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_when_3.release();
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
    _jspx_th_c_when_4.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${Sale.SALE_STATUS == '2'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_4 = _jspx_th_c_when_4.doStartTag();
      if (_jspx_eval_c_when_4 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template60);

        } while (_jspx_th_c_when_4.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_when_4.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_when_4.release();
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
    _jspx_th_c_when_5.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${Sale.SALE_STATUS == '3'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_5 = _jspx_th_c_when_5.doStartTag();
      if (_jspx_eval_c_when_5 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template62);

        } while (_jspx_th_c_when_5.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_when_5.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_when_5.release();
    }
    return false;
  }

  private boolean _jspx_th_c_when_6_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:when ---- //
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_6 = new org.apache.taglibs.standard.tag.rt.core.WhenTag();
    _jspx_th_c_when_6.setPageContext(pageContext);
    _jspx_th_c_when_6.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_when_6.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${Sale.SALE_STATUS == '4'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_6 = _jspx_th_c_when_6.doStartTag();
      if (_jspx_eval_c_when_6 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template64);

        } while (_jspx_th_c_when_6.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_when_6.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_when_6.release();
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
  
  private final static String _jspx_template0 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n";
  private final static String _jspx_template1 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('사용자의 사용시간이 종료되었습니다. 다시 접속 해주시기 바랍니다.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template2 = "\r\n";
  private final static String _jspx_template3 = "\r\n";
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "  \r\n";
  private final static String _jspx_template6 = "  \r\n";
  private final static String _jspx_template7 = "\r\n";
  private final static String _jspx_template8 = "\r\n";
  private final static String _jspx_template9 = "\r\n\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script language=\"javascript\" src=\"/js/common.js\"></script>\r\n<script language=\"javascript\" src=\"/js/calculation.js\"></script>\r\n<script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script>\r\n<script language=\"javascript\" src=\"/js/Ajax_request.js\"></script>\r\n<script language=\"javascript\" src=\"/js/Check_inputbox.js\"></script>\r\n\r\n<body>\r\n\t<form id=\"form\" name=\"form\" method=\"post\">\r\n\t\t<input type=\"hidden\" id=\"GAPAN_NO\" name=\"GAPAN_NO\" value=\"";
  private final static String _jspx_template10 = "\">\r\n\t\t<table width=\"780px\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td align=\"left\" class=\"contborder_blue\">\r\n\t\t\t\t\t\t\t\t<table>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t<table>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"sub_stan_blue\">* 점용료 내역</span>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table width=\"379px\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse: collapse; table-layout: fixed;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table width=\"360px\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse: collapse;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100px\" height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">관리번호</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"60px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">산출년도</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"70px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용료</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"70px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">과세일자</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"60px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">부과여부</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div style=\"height: 80px; overflow-y: scroll; scrollbar-face-color: #EEF8FB; scrollbar-3dlight-color: #BBBDB6; scrollbar-highlight-color: #EEF8FB; scrollbar-shadow-color: #BBBDB6; scrollbar-darkshadow-color: #EEF8FB; scrollbar-track-color: #EEF8FB; scrollbar-arrow-color: #BBBDB6;\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table width=\"360px\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse: collapse;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template11 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100px\" height=\"26px\" align=\"center\">";
  private final static String _jspx_template12 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"60px\" align=\"center\">";
  private final static String _jspx_template13 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"70px\" align=\"center\">";
  private final static String _jspx_template14 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"70px\" align=\"center\">";
  private final static String _jspx_template15 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"60px\" align=\"center\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<font color=\"red\"> \r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template16 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template17 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t \t\t\t\t부과\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template18 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template19 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t \t\t\t\t미부과\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template20 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template21 = " \r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</font>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template22 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"sub_stan_blue\">* 계도 내역</span>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table width=\"355px\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse: collapse; table-layout: fixed;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table width=\"336px\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse: collapse;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100px\" height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">관리번호</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"156px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">시설종류</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"80px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">계도일자</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div style=\"height: 80px; overflow-y: scroll; scrollbar-face-color: #EEF8FB; scrollbar-3dlight-color: #BBBDB6; scrollbar-highlight-color: #EEF8FB; scrollbar-shadow-color: #BBBDB6; scrollbar-darkshadow-color: #EEF8FB; scrollbar-track-color: #EEF8FB; scrollbar-arrow-color: #BBBDB6;\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table width=\"336px\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse: collapse;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template23 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100px\" height=\"26px\" align=\"center\">";
  private final static String _jspx_template24 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"156px\" align=\"center\">";
  private final static String _jspx_template25 = "/";
  private final static String _jspx_template26 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"80px\" align=\"center\">";
  private final static String _jspx_template27 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template28 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td height=\"10px\"></td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td><span class=\"sub_stan_blue\">* 수거 내역</span></td>\r\n\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse: collapse; table-layout: fixed;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table width=\"725px\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse: collapse;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"90px\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">관리번호</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"70px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">수거일자</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"70px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">반납일자</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">수거품목</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"70px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">과태료</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"50px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">과태료<br />부과</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"70px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">과태료<br />수납일자</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"70px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">변상금</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"50px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">변상금<br />부과</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"70px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">변상금<br />수납일자</td>\r\n\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div style=\"height: 80px; overflow-y: scroll; scrollbar-face-color: #EEF8FB; scrollbar-3dlight-color: #BBBDB6; scrollbar-highlight-color: #EEF8FB; scrollbar-shadow-color: #BBBDB6; scrollbar-darkshadow-color: #EEF8FB; scrollbar-track-color: #EEF8FB; scrollbar-arrow-color: #BBBDB6;\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table width=\"725px\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse: collapse;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template29 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"90px\" height=\"26\" align=\"center\">";
  private final static String _jspx_template30 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"70px\" align=\"center\">";
  private final static String _jspx_template31 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"70px\" align=\"center\">";
  private final static String _jspx_template32 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template33 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"70px\" align=\"center\">";
  private final static String _jspx_template34 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"50px\" align=\"center\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<font color=\"red\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template35 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template36 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t \t\t\t부과\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template37 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template38 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t \t\t\t미부과\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template39 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template40 = " \r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</font>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"70px\" align=\"center\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template41 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"70px\" align=\"center\">";
  private final static String _jspx_template42 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"50px\" align=\"center\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<font color=\"red\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template43 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template44 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t \t\t\t부과\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template45 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template46 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t 미부과\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template47 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template48 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</font>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"70px\" align=\"center\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template49 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template50 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div></td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td height=\"10px\"></td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td><span class=\"sub_stan_blue\">* 폐기/매각 내역</span></td>\r\n\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse: collapse; table-layout: fixed;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table width=\"725px\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse: collapse;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"110px\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">관리번호</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"120px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">수거품목</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"90px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">공고일자</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"80px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">공고번호</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">처리상태</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"135px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">처리업체명</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"90px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">시행일자</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div style=\"height: 80px; overflow-y: scroll; scrollbar-face-color: #EEF8FB; scrollbar-3dlight-color: #BBBDB6; scrollbar-highlight-color: #EEF8FB; scrollbar-shadow-color: #BBBDB6; scrollbar-darkshadow-color: #EEF8FB; scrollbar-track-color: #EEF8FB; scrollbar-arrow-color: #BBBDB6;\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table width=\"725px\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse: collapse;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template51 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"110px\" height=\"26\" align=\"center\">";
  private final static String _jspx_template52 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"120px\" align=\"center\">";
  private final static String _jspx_template53 = " / ";
  private final static String _jspx_template54 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"90px\" align=\"center\">";
  private final static String _jspx_template55 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"80px\" align=\"center\">";
  private final static String _jspx_template56 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100px\" align=\"center\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template57 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template58 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t폐기 진행\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template59 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template60 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t매각 진행\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template61 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template62 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t폐기 완료\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template63 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template64 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t매각 완료\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template65 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template66 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"135px\" align=\"center\">";
  private final static String _jspx_template67 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"90px\" align=\"center\">";
  private final static String _jspx_template68 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template69 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t<table>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"sub_stan_blue\">* 고발 내역</span>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table width=\"367px\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse: collapse; table-layout: fixed;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table width=\"348px\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse: collapse;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100px\" height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">고발일자</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"248px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">고발내역</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div style=\"height: 80px; overflow-y: scroll; scrollbar-face-color: #EEF8FB; scrollbar-3dlight-color: #BBBDB6; scrollbar-highlight-color: #EEF8FB; scrollbar-shadow-color: #BBBDB6; scrollbar-darkshadow-color: #EEF8FB; scrollbar-track-color: #EEF8FB; scrollbar-arrow-color: #BBBDB6;\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table width=\"348px\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse: collapse;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template70 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100px\" height=\"26px\" align=\"center\">";
  private final static String _jspx_template71 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"248px\" align=\"center\">";
  private final static String _jspx_template72 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template73 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"sub_stan_blue\">* 전업지원 내역</span>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table width=\"367px\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse: collapse; table-layout: fixed;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table width=\"348px\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse: collapse;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100px\" height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">지원일자</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"60px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">구분</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"188px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">내용</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div style=\"height: 80px; overflow-y: scroll; scrollbar-face-color: #EEF8FB; scrollbar-3dlight-color: #BBBDB6; scrollbar-highlight-color: #EEF8FB; scrollbar-shadow-color: #BBBDB6; scrollbar-darkshadow-color: #EEF8FB; scrollbar-track-color: #EEF8FB; scrollbar-arrow-color: #BBBDB6;\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table width=\"348px\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse: collapse;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template74 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"100px\" height=\"26px\" align=\"center\">";
  private final static String _jspx_template75 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"60px\" align=\"center\">";
  private final static String _jspx_template76 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"188px\" align=\"center\">";
  private final static String _jspx_template77 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template78 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t</table>\r\n\t</form>\r\n</body>\r\n</html>";
}
