package jeus_jspwork._jsp._rojum._survey;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_excel_5fsearch_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(19,3);to=(23,1)]
      
      	response.setContentType("application/vnd.ms-excel; charset=euc-kr");
       	response.setHeader("Content-Disposition", "filename=거리가게실태조사.xls"); 
       	response.setHeader("Content-Description", "JSP Generated Data"); 

      // jsp code [from=(25,5);to=(25,38)]
      out.write(_jspx_template10);
      // jsp code [from=(28,5);to=(28,37)]
      out.write(_jspx_template11);
      // jsp code [from=(34,6);to=(34,39)]
      out.write(_jspx_template12);
      // jsp code [from=(36,6);to=(36,38)]
      out.write(_jspx_template13);
      out.write(_jspx_template14);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template61);

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
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("board");
    _jspx_th_c_forEach_0.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template15);
            // jsp code [from=(54,55);to=(54,69)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template16);
            // jsp code [from=(55,38);to=(55,54)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template17);
            // jsp code [from=(56,38);to=(56,53)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.WITH_ADDR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template18);
            // jsp code [from=(58,43);to=(58,51)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SI}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template19);
            // jsp code [from=(58,60);to=(58,69)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template20);
            // jsp code [from=(58,78);to=(58,91)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.DORO_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template21);
            // jsp code [from=(58,100);to=(58,112)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_BON}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template22);
            // jsp code [from=(58,121);to=(58,132)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_BU}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template23);
            // jsp code [from=(58,141);to=(58,152)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template24);
            // jsp code [from=(58,161);to=(58,176)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_DET_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template25);
            // ----  c:if ---- invoke //
            if (_jspx_th_c_if_0_fn(pageContext, _jspx_th_c_forEach_0)) return true;


            // jsp code [from=(61,6);to=(61,39)]
            out.write(_jspx_template32);
            out.write(_jspx_template33);
            // jsp code [from=(62,38);to=(62,54)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADDR_JIBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            // jsp code [from=(63,6);to=(63,38)]
            out.write(_jspx_template34);
            out.write(_jspx_template35);
            // ----  c:if ---- invoke //
            if (_jspx_th_c_if_2_fn(pageContext, _jspx_th_c_forEach_0)) return true;


            out.write(_jspx_template38);
            // jsp code [from=(73,38);to=(73,53)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.FT_TYP_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template39);
            // jsp code [from=(73,69);to=(73,84)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.FT_SEL_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template40);
            // jsp code [from=(74,38);to=(74,51)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PLACE_A}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template41);
            // ----  c:choose ---- invoke //
            if (_jspx_th_c_choose_0_fn(pageContext, _jspx_th_c_forEach_0)) return true;


            out.write(_jspx_template47);
            // ----  c:choose ---- invoke //
            if (_jspx_th_c_choose_1_fn(pageContext, _jspx_th_c_forEach_0)) return true;


            out.write(_jspx_template53);
            // jsp code [from=(87,38);to=(87,70)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(board.SPECIAL_DATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template54);
            // jsp code [from=(88,38);to=(88,68)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(board.FOUND_DATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template55);
            // jsp code [from=(89,38);to=(89,66)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(board.REG_DATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template56);
            // jsp code [from=(90,38);to=(90,53)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_SSN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template57);
            // jsp code [from=(91,38);to=(91,52)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_HP}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template58);
            // jsp code [from=(92,38);to=(92,50)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SG_TYP}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template59);
            // jsp code [from=(93,38);to=(93,50)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.UN_TYP}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template60);

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
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.DORO_NM != null && board.DORO_NM != ''}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != Tag.SKIP_BODY) {
        do {
          // jsp code [from=(59,99);to=(59,107)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SI}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template26);
          // jsp code [from=(59,111);to=(59,120)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template27);
          // jsp code [from=(59,124);to=(59,137)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.DORO_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template28);
          // jsp code [from=(59,141);to=(59,153)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_BON}",java.lang.String.class , pageContext.getVariableResolver(), null));

          // ----  c:if ---- invoke //
          if (_jspx_th_c_if_1_fn(pageContext, _jspx_th_c_if_0)) return true;


          out.write(_jspx_template30);
          // jsp code [from=(59,237);to=(59,248)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template31);
          // jsp code [from=(59,252);to=(59,267)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_DET_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));


        } while (_jspx_th_c_if_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_0.release();
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
    _jspx_th_c_if_2.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GUGAN_CD!=0 && board.GUGAN_CD!=null}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
      if (_jspx_eval_c_if_2 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template36);
          // jsp code [from=(68,6);to=(68,20)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GUGAN_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template37);

        } while (_jspx_th_c_if_2.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_2.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_2.release();
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
          out.write(_jspx_template42);
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
    _jspx_th_c_choose_1.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    try {
      int _jspx_eval_c_choose_1 = _jspx_th_c_choose_1.doStartTag();
      if (_jspx_eval_c_choose_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template48);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_1_fn(pageContext, _jspx_th_c_choose_1)) return true;


          out.write(_jspx_template50);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_1_fn(pageContext, _jspx_th_c_choose_1)) return true;


          out.write(_jspx_template52);

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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_BU != '0' && board.BD_BU != null}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
      if (_jspx_eval_c_if_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template29);
          // jsp code [from=(59,215);to=(59,226)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_BU}",java.lang.String.class , pageContext.getVariableResolver(), null));


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
    _jspx_th_c_when_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.MAINTN_OB == '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
      if (_jspx_eval_c_when_0 != Tag.SKIP_BODY) {
        do {
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
    _jspx_th_c_when_1.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SPECIAL_ST == '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
      if (_jspx_eval_c_when_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template49);

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
          out.write(_jspx_template51);

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
  
  static {
    _jspx_fnmap_0 = jeus.servlet.jsp.el.FunctionMapperImpl.getInstance();
    _jspx_fnmap_0.mapFunction("rnic:addDash", main.java.common.util.StringUtil.class, "addDash", new Class[] {java.lang.String.class});

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
  private final static String _jspx_template9 = "\r\n\r\n<html xmlns:x=\"urn:schemas-microsoft-com:office:excel\">\r\n<head>\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<!--[if gte mso 9]><xml>\r\n<x:ExcelWorkbook><x:ExcelWorksheets><x:ExcelWorksheet>\r\n<x:Name>Sheet1</x:Name>\r\n<x:WorksheetOptions><x:Panes><x:Pane>\r\n</x:Pane></x:Panes></x:WorksheetOptions>\r\n</x:ExcelWorksheet></x:ExcelWorksheets></x:ExcelWorkbook>\r\n</xml><![endif]-->\r\n</head> \r\n<body>\r\n\r\n";
  // jsp code [from=(25,5);to=(25,38)]
  private final static String _jspx_template10 = "\r\n\r\n";
  // jsp code [from=(28,5);to=(28,37)]
  private final static String _jspx_template11 = "\r\n<!-- <table width=\"10000px\" cellpadding=\"0\" cellspacing=\"0\" border=\"1\" class=\"sub_table\" bordercolor=\"#c9dfed\" style=\"border-collapse: collapse;\"> -->\r\n<table width=\"10400px\" cellpadding=\"0\" cellspacing=\"0\" border=\"1\" class=\"sub_table\" bordercolor=\"#c9dfed\" style=\"border-collapse: collapse;\">\r\n";
  // jsp code [from=(34,6);to=(34,39)]
  private final static String _jspx_template12 = "\r\n<tr >\r\n\t<td height=\"26px\" width=\"400px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">관리번호</td>\r\n\t<td width=\"400px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">운영인</td>\r\n\t<td width=\"400px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">인접지 주소</td>\r\n\t<td width=\"400px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">도로명 주소</td>\t\r\n\t";
  // jsp code [from=(36,6);to=(36,38)]
  private final static String _jspx_template13 = "\r\n\t<td width=\"400px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">기본 주소</td>\r\n\t";
  private final static String _jspx_template14 = "\r\n\t<!--  //********** BEGIN_현진_20120313 -->\r\n\t<td width=\"400px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">구간</td>\r\n\t<!--   //********** END_현진_20120313 -->\r\n\t<td width=\"400px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">시설 종류</td>\r\n\t<td width=\"400px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">면적(㎡)</td>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t<td width=\"400px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">정비/관리</td>\r\n\t<td width=\"400px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">거리조성</td>\r\n\t<td width=\"400px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">특화거리 조성일자</td>\r\n\t<td width=\"400px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">설치일자</td>\r\n\t<td width=\"400px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">등록일자</td>\r\n\t<td width=\"400px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">주민번호</td>\r\n\t<td width=\"400px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">전화번호</td>\r\n\t<td width=\"400px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">취급품목</td>\r\n\t<td width=\"400px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">가입단체</td>\r\n</tr>\r\n";
  private final static String _jspx_template15 = "\r\n<tr onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\" style=\"cursor: pointer\">\r\n    <td height=\"26px\" width=\"400px\" align=\"center\" >";
  private final static String _jspx_template16 = "</td>\r\n\t<td width=\"400px\" align=\"center\" >";
  private final static String _jspx_template17 = "</td>\r\n\t<td width=\"400px\" align=\"center\" >";
  private final static String _jspx_template18 = "</td>\r\n\t<!--  //********** BEGIN_KANG_20120424 -->\r\n\t<!-- <td width=\"400px\" align=\"center\" >";
  private final static String _jspx_template19 = "&nbsp;";
  private final static String _jspx_template20 = "&nbsp;";
  private final static String _jspx_template21 = "&nbsp;";
  private final static String _jspx_template22 = "&nbsp;";
  private final static String _jspx_template23 = "&nbsp;";
  private final static String _jspx_template24 = "&nbsp;";
  private final static String _jspx_template25 = "</td> -->\r\n\t<td width=\"400px\" align=\"center\" >";
  private final static String _jspx_template26 = " ";
  private final static String _jspx_template27 = " ";
  private final static String _jspx_template28 = " ";
  private final static String _jspx_template29 = "-";
  private final static String _jspx_template30 = " ";
  private final static String _jspx_template31 = " ";
  // jsp code [from=(61,6);to=(61,39)]
  private final static String _jspx_template32 = "</td>\r\n\t<!--   //********** END_KANG_20120424 -->\t\r\n\t";
  private final static String _jspx_template33 = "\r\n\t<td width=\"400px\" align=\"center\" >";
  // jsp code [from=(63,6);to=(63,38)]
  private final static String _jspx_template34 = "</td>\r\n\t";
  private final static String _jspx_template35 = "\r\n\t<!--  //********** BEGIN_현진_20120313 -->\r\n\t<td width=\"400px\" align=\"center\" >\r\n\t<!--  //********** BEGIN_현진_20120315 -->\r\n\t";
  private final static String _jspx_template36 = "\r\n\t제 ";
  private final static String _jspx_template37 = "구간\r\n\t";
  private final static String _jspx_template38 = "\r\n\t<!--   //********** END_현진_20120315 -->\r\n\t</td>\r\n\t<!--   //********** END_현진_20120313 -->\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t<td width=\"400px\" align=\"center\" >";
  private final static String _jspx_template39 = "&nbsp;/&nbsp;";
  private final static String _jspx_template40 = "</td>\r\n\t<td width=\"400px\" align=\"center\" >";
  private final static String _jspx_template41 = "</td>\r\n\t<td width=\"400px\" align=\"center\" >\r\n\t";
  private final static String _jspx_template42 = "\r\n\t";
  private final static String _jspx_template43 = "관리대상";
  private final static String _jspx_template44 = "\r\n\t";
  private final static String _jspx_template45 = "정비대상";
  private final static String _jspx_template46 = "\r\n\t";
  private final static String _jspx_template47 = "\r\n\t</td>\r\n\t<td width=\"400px\" align=\"center\">\r\n\t\t";
  private final static String _jspx_template48 = "\r\n\t\t";
  private final static String _jspx_template49 = "일반거리";
  private final static String _jspx_template50 = "\r\n\t\t";
  private final static String _jspx_template51 = "특화거리";
  private final static String _jspx_template52 = "\r\n\t\t";
  private final static String _jspx_template53 = "\r\n\t</td>\r\n\t<td width=\"400px\" align=\"center\" >";
  private final static String _jspx_template54 = "</td>\r\n\t<td width=\"400px\" align=\"center\" >";
  private final static String _jspx_template55 = "</td>\r\n\t<td width=\"400px\" align=\"center\" >";
  private final static String _jspx_template56 = "</td>\r\n\t<td width=\"400px\" align=\"center\" >";
  private final static String _jspx_template57 = "</td>\r\n\t<td width=\"400px\" align=\"center\" >";
  private final static String _jspx_template58 = "</td>\r\n\t<td width=\"400px\" align=\"center\" >";
  private final static String _jspx_template59 = "</td>\r\n\t<td width=\"400px\" align=\"center\" >";
  private final static String _jspx_template60 = "</td> \r\n</tr>\r\n";
  private final static String _jspx_template61 = "\r\n</table>\r\n</body>\r\n</html>\r\n\r\n";
}
