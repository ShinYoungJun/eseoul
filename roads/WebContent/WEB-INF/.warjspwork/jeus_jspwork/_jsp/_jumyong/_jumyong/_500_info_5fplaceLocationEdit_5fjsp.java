package jeus_jspwork._jsp._jumyong._jumyong;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_info_5fplaceLocationEdit_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(95,35);to=(95,37)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${no}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(96,39);to=(96,43)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mode}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(97,39);to=(97,42)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${seq}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(98,53);to=(98,64)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(99,37);to=(99,40)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PNU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(100,39);to=(100,43)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${Addr}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(101,39);to=(101,43)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${Name}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(102,47);to=(102,56)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${Locate_x }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(103,47);to=(103,56)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${Locate_y }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(104,45);to=(104,53)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(113,176);to=(113,183)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${listNum}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template53);
      // jsp code [from=(194,27);to=(194,44)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${strPageDivideForm}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template54);

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
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${Llist}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("board");
    _jspx_th_c_forEach_0.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template22);
            // ----  c:choose ---- invoke //
            if (_jspx_th_c_choose_0_fn(pageContext, _jspx_th_c_forEach_0)) return true;


            out.write(_jspx_template52);

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
          out.write(_jspx_template23);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template40);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template51);

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
    _jspx_th_c_when_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SEQ != seq}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
      if (_jspx_eval_c_when_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template24);
          // jsp code [from=(131,58);to=(131,67)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${idx.count}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template25);
          // jsp code [from=(132,46);to=(132,56)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.AREA}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template26);
          // jsp code [from=(133,46);to=(133,57)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.WIDTH}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template27);
          // jsp code [from=(134,46);to=(134,58)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.HEIGHT}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template28);
          // jsp code [from=(135,46);to=(135,59)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.EXPLAIN}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template29);
          // ----  c:if ---- invoke //
          if (_jspx_th_c_if_0_fn(pageContext, _jspx_th_c_when_0)) return true;


          out.write(_jspx_template33);
          // ----  c:if ---- invoke //
          if (_jspx_th_c_if_1_fn(pageContext, _jspx_th_c_when_0)) return true;


          out.write(_jspx_template39);

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
          out.write(_jspx_template41);
          // jsp code [from=(153,56);to=(153,65)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${idx.count}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template42);
          // jsp code [from=(157,115);to=(157,125)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.AREA}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template43);
          // jsp code [from=(160,117);to=(160,128)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.WIDTH}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template44);
          // jsp code [from=(163,119);to=(163,131)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.HEIGHT}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template45);
          // jsp code [from=(166,123);to=(166,136)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.EXPLAIN}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template46);
          // ----  c:if ---- invoke //
          if (_jspx_th_c_if_2_fn(pageContext, _jspx_th_c_otherwise_0)) return true;


          out.write(_jspx_template48);
          // ----  c:if ---- invoke //
          if (_jspx_th_c_if_3_fn(pageContext, _jspx_th_c_otherwise_0)) return true;


          out.write(_jspx_template50);

        } while (_jspx_th_c_otherwise_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_otherwise_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_otherwise_0.release();
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION != '4'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template30);
          // jsp code [from=(138,68);to=(138,82)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.LOCATE_X}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template31);
          // jsp code [from=(138,88);to=(138,102)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.LOCATE_Y}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template32);

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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION != '4'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
      if (_jspx_eval_c_if_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template34);
          // jsp code [from=(143,79);to=(143,81)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${no}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template35);
          // jsp code [from=(143,89);to=(143,98)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template36);
          // jsp code [from=(143,114);to=(143,125)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template37);
          // jsp code [from=(143,142);to=(143,154)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${countPerPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template38);

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
    _jspx_th_c_if_2.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION != '4'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
      if (_jspx_eval_c_if_2 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template47);

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
    _jspx_th_c_if_3.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION != '4'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
      if (_jspx_eval_c_if_3 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template49);

        } while (_jspx_th_c_if_3.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_3.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_3.release();
    }
    return false;
  }

  private final static String _jspx_template0 = "\r\n";
  private final static String _jspx_template1 = "\r\n";
  private final static String _jspx_template2 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('사용자의 사용시간이 종료되었습니다. 다시 접속 해주시기 바랍니다.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template3 = "\r\n";
  private final static String _jspx_template4 = "\r\n";
  private final static String _jspx_template5 = "  \r\n";
  private final static String _jspx_template6 = "  \r\n";
  private final static String _jspx_template7 = "  \r\n";
  private final static String _jspx_template8 = "\r\n";
  private final static String _jspx_template9 = "\r\n";
  private final static String _jspx_template10 = "    \r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n\r\n<script>\r\n\r\n\tfunction submitClick()\r\n\t{\r\n\t\tvar placeLocationForm = document.placeLocationForm;\r\n\t\t\r\n\t\tvar mode = document.getElementById(\"mode\").value;\r\n\t\t\r\n\t\t//alert(document.getElementById(\"AREA1\").value);\r\n\t\t\r\n\t\tif(mode != \"edit\")\r\n\t\t\tdocument.getElementById(\"mode\").value = \"add\";\r\n\t\t\r\n\t\tplaceLocationForm.submit();\r\n\t}\r\n\t\r\n\t\r\n\tfunction goDel(seqValue)\r\n\t{\r\n\t\tvar no = document.getElementById(\"no\").value;\t\t\t\t\t\t//성공후 돌아올 페이지 위해\r\n\t\tvar currentPage = document.getElementById(\"currentPage\").value;\t\t//성공후 돌아올 페이지 위해\r\n\t\t\r\n\t\t//seqValue - 삭제할 번호를 찾음\r\n\t\t\r\n\t\tif(confirm(\"정말 삭제하시겠습니까?\"))\r\n\t\tlocation.href(\"/jumyong/jumyong/deleteLocation.do?no=\"+no+\"&currentPage=\"+currentPage+\"&seq=\"+seqValue);\r\n\t}\r\n\t\r\n\tfunction popGeoInfo(flag, x, y)\r\n\t{\r\n\t\tvar form = document.placeLocationForm;\r\n\t\tvar addr = document.getElementById(\"Addr\").value;\r\n\t    var name = document.getElementById(\"Name\").value;\r\n\t    var no = document.getElementById(\"no\").value;\r\n\t    var pnu = document.getElementById(\"PNU\").value;\r\n\t    var url = \"\";\r\n\t\t    \r\n\t\tif(flag == \"check\"){ //위치확인\r\n\t\t\turl = '/jumyong/map/mini_map.do?PNU='+pnu+'&X_COORD='+x+'&Y_COORD='+y+'&TYPE=view';\r\n\t\t}\r\n\t\telse{\r\n\t\t\tif(document.getElementById(\"PNU\").value==\"0\"){\r\n\t\t    \talert(\"PNU 정보가 없습니다.\\관리자에게 연락하세요.\");\r\n\t\t    }\r\n\t\t    else{\t    \t\r\n\t\t\t\turl = '/jumyong/map/mini_map.do?PNU='+pnu+'&TYPE=edit';\r\n\t\t    }\r\n\t\t}\r\n\r\n\t\t\r\n   \t   \r\n\t\tcw=screen.availWidth; // 화면 너비\r\n\t\tch=screen.availHeight; // 화면 높이\r\n\t\t\r\n\t\tsw=800;// 띄울 창의 너비\r\n\t\tsh=600;// 띄울 창의 높이\r\n\t\t\r\n\t\tml=(cw-sw)/2;// 가운데 띄우기위한 창의 x위치\r\n\t\tmt=(ch-sh)/2;// 가운데 띄우기위한 창의 y위치\r\n\r\n  \t\tvar param = 'width='+sw+',height='+sh+',top='+mt+',left='+ml+',resizable=no, status=no, scrollbars=no, toolbar=no, menubar=no';\r\n\r\n\t\twindow.open(url, \"minimap\", param);\r\n\t}\r\n\t\r\n\r\n\t\t\r\n</script>\r\n\r\n</head>\r\n\r\n<body>\r\n\r\n<form id=\"placeLocationForm\" name=\"placeLocationForm\" method=\"post\" action = \"/jumyong/placeLocationEdit.do\" >\r\n\r\n<input id=\"no\" name=\"no\" value=\"";
  private final static String _jspx_template11 = "\" type=\"hidden\" >\r\n<input id=\"mode\" name=\"mode\" value=\"";
  private final static String _jspx_template12 = "\" type=\"hidden\" >\r\n<input id = \"seq\" name=\"seq\" value=\"";
  private final static String _jspx_template13 = "\" type=\"hidden\" >\r\n<input id=\"currentPage\" name=\"currentPage\" value=\"";
  private final static String _jspx_template14 = "\" type=\"hidden\" >\r\n<input id=\"PNU\" name=\"PNU\" value=\"";
  private final static String _jspx_template15 = "\" type=\"hidden\">\r\n<input id=\"Addr\" name=\"Addr\" value=\"";
  private final static String _jspx_template16 = "\" type=\"hidden\">\r\n<input id=\"Name\" name=\"Name\" value=\"";
  private final static String _jspx_template17 = "\" type=\"hidden\">\r\n<input id=\"Locate_x\" name=\"Locate_x\" value=\"";
  private final static String _jspx_template18 = "\" type=\"hidden\">\r\n<input id=\"Locate_y\" name=\"Locate_y\" value=\"";
  private final static String _jspx_template19 = "\" type=\"hidden\">\r\n<input id=\"SECTION\" name=\"SECTION\" value=\"";
  private final static String _jspx_template20 = "\" type=\"hidden\">\r\n\r\n\r\n<table width=\"100%\"   >\r\n\r\n            <tr>\r\n                <td>\r\n                <table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n                    <tr>\r\n                      <td height=\"28\" colspan=\"7\" bgcolor=\"#FFFFFF\" class=\"table_bl_left\"><span class=\"sub_stan_blue\">* 위치정보</span>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp총 ";
  private final static String _jspx_template21 = "건\r\n                      </td>\r\n                      </tr>\r\n                    <tr>\r\n                    <td width=\"5%\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">번호</td>\r\n                      <td width=\"10%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">면적</td>\r\n                      <td width=\"10%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">가로</td>\r\n                      <td width=\"10%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">세로</td>\r\n                      <td width=\"35%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용지 상세설명 </td>\r\n                      <td width=\"15%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용위치</td>\r\n                      <td width=\"15%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">기능 </td>\r\n                      </tr>\r\n                      \r\n                      \r\n                    ";
  private final static String _jspx_template22 = "\r\n                    ";
  private final static String _jspx_template23 = "\r\n                    ";
  private final static String _jspx_template24 = "\r\n                      <tr onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\" >\r\n                        <td height=\"26\" align=\"center\">";
  private final static String _jspx_template25 = "</td>\r\n                        <td align=\"center\">";
  private final static String _jspx_template26 = "</td>\r\n                        <td align=\"center\">";
  private final static String _jspx_template27 = "</td>\r\n                        <td align=\"center\">";
  private final static String _jspx_template28 = "</td>\r\n                        <td align=\"center\">";
  private final static String _jspx_template29 = "</td>\r\n                        <td align=\"center\">\r\n\t                        ";
  private final static String _jspx_template30 = "\r\n\t                        <a href=\"javascript:popGeoInfo('check','";
  private final static String _jspx_template31 = "','";
  private final static String _jspx_template32 = "')\" class=\"inqu\"><img src=\"/img/loca_icon.gif\" alt=\"위치확인\" width=\"64\" height=\"18\" border=\"0\"></a>\r\n\t                        ";
  private final static String _jspx_template33 = "\r\n                        </td>\r\n                      \t<td align=\"center\">\r\n\t                      \t";
  private final static String _jspx_template34 = "\r\n\t                      \t<a href=\"/jumyong/placeLocationEdit.do?mode=edit&no=";
  private final static String _jspx_template35 = "&seq=";
  private final static String _jspx_template36 = "&currentPage=";
  private final static String _jspx_template37 = "&countPerPage=";
  private final static String _jspx_template38 = "\">\r\n\t                      \t\t<img src=\"/img/mod_icon2.gif\" alt=\"수정\" width=\"34\" height=\"18\" border=\"0\" >\r\n\t\t\t\t\t\t\t</a> \r\n\t\t\t\t\t\t\t<a href=\"#\" class=\"inqu\"><img src=\"/img/del_icon.gif\" alt=\"삭제\" width=\"34\" height=\"18\" border=\"0\"></a>\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template39 = "\r\n\t\t\t\t\t\t</td>\r\n                      </tr>                      \r\n\t\t\t\t\t";
  private final static String _jspx_template40 = "\r\n\t\t\t\t\t";
  private final static String _jspx_template41 = "\r\n\t\t\t\t\t<tr onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\">\r\n                      <td height=\"26\" align=\"center\">";
  private final static String _jspx_template42 = "</td>\r\n                      \r\n                      \r\n                      <td align=\"center\">\r\n                      \t<input id=\"AREA\" name=\"AREA\" type=\"text\" class=\"input_form1\" style=\"width:40px\" value = \"";
  private final static String _jspx_template43 = "\">\r\n                      </td>\r\n                      <td align=\"center\">\r\n\t                      <input id=\"WIDTH\" name=\"WIDTH\" type=\"text\" class=\"input_form1\" style=\"width:40px\" value = \"";
  private final static String _jspx_template44 = "\">\r\n\t                  </td>\r\n                      <td align=\"center\">\r\n    \t                  <input id=\"HEIGHT\" name=\"HEIGHT\" type=\"text\" class=\"input_form1\" style=\"width:40px\" value = \"";
  private final static String _jspx_template45 = "\">\r\n    \t              </td>\r\n                      <td align=\"center\">\r\n        \t              <input id=\"EXPLAIN\" name=\"EXPLAIN\"  type=\"text\" class=\"input_form1\" style=\"width:220px\" value = \"";
  private final static String _jspx_template46 = "\">\r\n        \t          </td>\r\n                      <td align=\"center\">\r\n                      \t";
  private final static String _jspx_template47 = "\r\n                      \t<a href=\"javascript:popGeoInfo('write')\" class=\"inqu\"><img src=\"/img/loca_icon2.gif\" alt=\"위치등록\" width=\"64\" height=\"18\" border=\"0\"></a>\r\n                      \t";
  private final static String _jspx_template48 = "\r\n                      </td>\r\n                      <td align=\"center\">\r\n\t                      ";
  private final static String _jspx_template49 = "\r\n\t                      \t<img src=\"/img/can_icon.gif\" alt=\"취소\" border=\"0\" onclick=\"javascript:history.back();\" style=\"cursor:pointer\" >\r\n\t                      \t<img src=\"/img/save_icon2.gif\" alt=\"저장\" width=\"56\" height=\"18\" border=\"0\" onClick=\"javascript:submitClick();\"  style=\"cursor:pointer\">\r\n\t\t\t\t\t\t  ";
  private final static String _jspx_template50 = "\r\n                     </td>\r\n                      </tr>\r\n\t\t   \t\t\t";
  private final static String _jspx_template51 = "\r\n\t\t\t\t\t";
  private final static String _jspx_template52 = "\r\n\t\t\t\t\t\r\n\t\t\t\t\t";
  private final static String _jspx_template53 = "\r\n                    \r\n                </table>\r\n                \r\n                </td>\r\n              </tr>\r\n             <tr>\r\n                <td height=\"40\" align=\"center\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                    <tr>\r\n                      <td align=\"center\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n                        <tr>\r\n                        ";
  private final static String _jspx_template54 = "\r\n                        </tr>\r\n                        \r\n                      </table></td>\r\n\r\n                    </tr>\r\n                    <tr>\r\n\r\n\r\n                    </tr>\r\n                  </table></td>\r\n              </tr>\r\n            \r\n            \r\n            </table>\r\n\r\n\r\n</form>\r\n\r\n</body>\r\n</html>\r\n\r\n";
}
