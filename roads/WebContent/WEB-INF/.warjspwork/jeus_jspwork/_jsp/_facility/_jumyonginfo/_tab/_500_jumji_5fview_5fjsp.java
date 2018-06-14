package jeus_jspwork._jsp._facility._jumyonginfo._tab;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_jumji_5fview_5fjsp extends jeus.servlet.jsp.HttpJspBase {

  public final String[] __jeusGetIncludedJspFiles() {
    return new String[] {
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
      pageContext = _jspxFactory.getPageContext(this, request, response, "", true, 8192, true);
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
      // jsp code [from=(93,43);to=(93,53)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TYPE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template4);
      // jsp code [from=(93,77);to=(93,90)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template5);
      // jsp code [from=(97,47);to=(97,55)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template6);
      // jsp code [from=(98,50);to=(98,61)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template7);
      // jsp code [from=(99,46);to=(99,53)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${CORP_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template8);
      // jsp code [from=(100,46);to=(100,53)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GU_CODE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template9);
      // jsp code [from=(101,49);to=(101,59)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${REQUEST_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(102,48);to=(102,57)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${object_no}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(103,48);to=(103,57)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${choose_no}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(104,43);to=(104,47)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${year}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(112,75);to=(112,83)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${totalcnt}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // ----  c:choose ---- invoke //
      if (_jspx_th_c_choose_0_fn(pageContext, null)) return;


      out.write(_jspx_template30);
      // jsp code [from=(150,9);to=(150,16)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${pageing}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template31);
      // jsp code [from=(163,82);to=(163,90)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${use_type}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template32);
      // jsp code [from=(165,82);to=(165,92)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${section_nm}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template33);
      // jsp code [from=(169,54);to=(169,62)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${owner_nm}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template34);
      // jsp code [from=(171,54);to=(171,64)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${tax_set_nm}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template35);
      // jsp code [from=(175,67);to=(175,77)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${purpose_nm}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template36);
      // jsp code [from=(179,53);to=(179,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${purposesebu_nm}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template37);
      // jsp code [from=(181,53);to=(181,61)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${standard}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template38);
      // jsp code [from=(185,53);to=(185,61)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${quantity}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template39);
      // jsp code [from=(187,53);to=(187,61)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${depth_ck}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template40);
      // jsp code [from=(192,12);to=(192,24)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mul_fromdate}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template41);
      // jsp code [from=(192,30);to=(192,40)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mul_todate}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template42);
      // jsp code [from=(204,87);to=(204,97)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${sisul_post}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template43);
      // jsp code [from=(204,112);to=(204,123)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${sisul_addr1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template44);
      // jsp code [from=(204,132);to=(204,143)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${sisul_addr2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template45);
      // jsp code [from=(216,13);to=(216,26)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${work_fromdate}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template46);
      // ----  c:choose ---- invoke //
      if (_jspx_th_c_choose_1_fn(pageContext, null)) return;


      out.write(_jspx_template50);
      // jsp code [from=(222,13);to=(222,26)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${work_fromdate}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template51);
      // jsp code [from=(225,55);to=(225,70)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${completion_date}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template52);
      // jsp code [from=(229,83);to=(229,91)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${exe_info}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template53);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_0_fn(pageContext, null)) return;


      out.write(_jspx_template55);

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
          out.write(_jspx_template15);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template27);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template29);

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
          out.write(_jspx_template47);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_1_fn(pageContext, _jspx_th_c_choose_1)) return true;


          out.write(_jspx_template49);

        } while (_jspx_th_c_choose_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_choose_1.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_choose_1.release();
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${sum_adjust != '2'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template54);

        } while (_jspx_th_c_if_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_0.release();
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
    _jspx_th_c_when_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist!= null && !empty blist}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
      if (_jspx_eval_c_when_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template16);
          // ----  c:forEach ---- invoke //
          if (_jspx_th_c_forEach_0_fn(pageContext, _jspx_th_c_when_0)) return true;


          out.write(_jspx_template26);

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
          out.write(_jspx_template28);

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
    _jspx_th_c_when_1.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${work_fromdate != null && work_fromdate != ''}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
      if (_jspx_eval_c_when_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template48);

        } while (_jspx_th_c_when_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_when_1.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_when_1.release();
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
            out.write(_jspx_template17);
            // jsp code [from=(128,67);to=(128,81)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template18);
            // jsp code [from=(128,87);to=(128,102)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OBJECT_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template19);
            // jsp code [from=(129,60);to=(129,68)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.RN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template20);
            // jsp code [from=(130,48);to=(130,64)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PURPOSE_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template21);
            // jsp code [from=(131,48);to=(131,62)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.QUANTITY}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template22);
            // jsp code [from=(132,48);to=(132,66)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.MUL_FROMDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template23);
            // jsp code [from=(132,72);to=(132,88)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.MUL_TODATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template24);
            // jsp code [from=(133,48);to=(133,64)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TAX_SET_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template25);

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

  private final static String _jspx_template0 = "\r\n";
  private final static String _jspx_template1 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('사용자의 사용시간이 종료되었습니다. 다시 접속 해주시기 바랍니다.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template2 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n";
  private final static String _jspx_template3 = "\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n}\r\n-->\r\n\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script type=\"text/javascript\">\r\n//<![CDATA[\r\n\r\n\tfunction\tRegister()\r\n\t{\r\n\t\tvar form = document.form;\r\n\r\n\t\tform.action = \"/facility/jumyonginfo/jumji_register.do\";\r\n\t\tform.submit();\r\n\t}\r\n\t\r\n\tfunction\tModify()\r\n\t{\r\n\t\tvar form = document.form;\r\n\r\n\t\tform.action = \"/facility/jumyonginfo/jumji_modify.do\";\r\n\t\tform.submit();\r\n\t}\r\n\r\n\tfunction\tInit_UseType(sel)\r\n\t{\r\n\t\tdocument.getElementById(\"UseType1\").style.display = \"none\";\r\n\t\tdocument.getElementById(\"UseType2\").style.display = \"none\";\r\n\t\t\r\n\t\tif(sel == '2' || sel == '3')\r\n\t\t\tdocument.getElementById(\"UseType2\").style.display = \"block\";\t//\t하천, 구거\r\n\t\telse\t\t\t\t\t\t\r\n\t\t\tdocument.getElementById(\"UseType1\").style.display = \"block\";\t//\t도로\t\r\n\t}\r\n\r\n\tfunction\tInit_UseSection(sel)\r\n\t{\r\n\t\tif(sel == '1')\r\n\t\t\tdocument.getElementById(\"UseSection\").style.display = \"block\";\t//\t정기\r\n\t\telse\r\n\t\t\tdocument.getElementById(\"UseSection\").style.display = \"none\";\r\n\t}\r\n\r\n\tfunction \tInit()\r\n\t{\r\n\t\tparent.Tab_Img(\"jumji\");\r\n\r\n\t\tIFRM_PurposeCode.PURPOSE_CD.className=\"view\";\r\n\t}\r\n\t\r\n\tfunction choose_place(admin_no, object_no)\r\n\t{\r\n\t\tvar gu_code= document.getElementById(\"gu_code\").value;\r\n\t\tvar corp_cd = document.getElementById(\"corp_cd\").value;\r\n\t\tvar request_no= document.getElementById(\"request_no\").value;\r\n\t\tvar currentPage= document.getElementById(\"currentPage\").value;\r\n\r\n \t\tlocation.href=\"/facility/jumyonginfo/jumji_view.do?GU_CODE=\"+gu_code+\"&CORP_CD=\"+corp_cd+\"&REQUEST_NO=\"+request_no+\"&currentPage=\"+currentPage+\"&object_no=\"+object_no+\"&ADMIN_NO=\"+admin_no;\r\n\t}\r\n\r\n\tfunction\tPage(page)\r\n\t{\r\n\t\tif(page\t==\t\"\")\r\n\t\t\treturn;\r\n\t\t\r\n\t\tvar form = document.form;\r\n\t\t\r\n\t\tform.action = \"jumji_view.do?currentPage=\" + page;\r\n\t\tform.submit();\r\n\t}\r\n\t\r\n//]]>\r\n</script>\r\n\r\n<!-- body onload=\"Init(); Init_UseType('";
  private final static String _jspx_template4 = "'); Init_UseSection('";
  private final static String _jspx_template5 = "');\" -->\r\n<body>\r\n<table width=\"780\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n<form name=\"form\" method=\"post\">\r\n<input type=\"hidden\" name=\"ADMIN_NO\" value=\"";
  private final static String _jspx_template6 = "\">\r\n<input type=\"hidden\" name=\"currentPage\" value=\"";
  private final static String _jspx_template7 = "\">\r\n<input type=\"hidden\" name=\"CORP_CD\" value=\"";
  private final static String _jspx_template8 = "\">\r\n<input type=\"hidden\" name=\"GU_CODE\" value=\"";
  private final static String _jspx_template9 = "\">\r\n<input type=\"hidden\" name=\"REQUEST_NO\" value=\"";
  private final static String _jspx_template10 = "\">\r\n<input type=\"hidden\" name=\"object_no\" value=\"";
  private final static String _jspx_template11 = "\">\r\n<input type=\"hidden\" name=\"choose_no\" value=\"";
  private final static String _jspx_template12 = "\">\r\n<input type=\"hidden\" name=\"YEAR\" value=\"";
  private final static String _jspx_template13 = "\">\r\n\r\n\t<tr>\r\n\t\t<td align=\"left\" class=\"contborder_blue\">\r\n\t\t\r\n\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\r\n\t        <tr>\r\n\t\t\t\t<td height=\"34\" class=\"sub_stan\">전체건수 : <span class=\"sub_stan_blue\">";
  private final static String _jspx_template14 = "</span> 건 </td>\r\n\t        </tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td>\r\n\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t        <td height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" width=\"5%\" nowrap=\"nowrap\">번호</td>\r\n\t\t\t\t\t        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" width=\"40%\" nowrap=\"nowrap\">점용목적(코드)</td>\r\n\t\t\t\t\t        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" width=\"20%\" nowrap=\"nowrap\">연장 및 수량</td>\r\n\t\t\t    \t        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" width=\"25%\" nowrap=\"nowrap\">점용기간</td>\r\n\t\t\t\t\t        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" width=\"10%\" nowrap=\"nowrap\">세입구분</td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t      \r\n\t\t\t\t\t\t";
  private final static String _jspx_template15 = "\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template16 = "\r\n\t\t\t                      ";
  private final static String _jspx_template17 = "\r\n\t\t\t\t                      <tr onClick=\"javascript:choose_place('";
  private final static String _jspx_template18 = "','";
  private final static String _jspx_template19 = "');\" onMouseOver=this.style.backgroundColor='#f6f7f8' onMouseOut=this.style.backgroundColor='' style='CURSOR: Hand;'>\r\n\t\t\t\t\t\t\t\t\t\t<td height='26' align='center' nowrap=\"nowrap\">";
  private final static String _jspx_template20 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t<td align='center' nowrap=\"nowrap\">";
  private final static String _jspx_template21 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t<td align='center' nowrap=\"nowrap\">";
  private final static String _jspx_template22 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t<td align='center' nowrap=\"nowrap\">";
  private final static String _jspx_template23 = " ~ ";
  private final static String _jspx_template24 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t<td align='center' nowrap=\"nowrap\">";
  private final static String _jspx_template25 = "</td>\r\n\t\t\t\t\t\t\t\t\t  </tr>\r\n\t\t\t\t\t\t\t\t ";
  private final static String _jspx_template26 = "\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template27 = "\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template28 = "\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\" class=\"sub_table\" colspan=\"11\" height=\"26\">검색된 내용이 없습니다</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template29 = "\r\n\t\t\t\t\t\t ";
  private final static String _jspx_template30 = "\r\n\t\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t  <td height=\"30\" align=\"center\">\r\n\t\t\t\t  <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t";
  private final static String _jspx_template31 = "\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t  </table>\r\n\t\t\t  </td>\r\n\t\t\t</tr>\r\n\t\t\t\r\n\t\t\t<tr>\r\n\t\t\t\t<td>\r\n\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td><table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t  <td width=\"100\" height=\"25\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" nowrap=\"nowrap\">점용종류</td>\r\n\t\t\t\t\t\t  <td width=\"37%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" nowrap=\"nowrap\">";
  private final static String _jspx_template32 = "</td>\r\n\t\t\t\t\t\t  <td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" nowrap=\"nowrap\">점용구분</td>\r\n\t\t\t\t\t\t  <td width=\"36%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" nowrap=\"nowrap\">";
  private final static String _jspx_template33 = "</td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t  <td height=\"25\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">소유자</td>\r\n\t\t\t\t\t\t  <td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template34 = "</td>\r\n\t\t\t\t\t\t  <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">세입구분</td>\r\n\t\t\t\t\t\t  <td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template35 = "</td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t  <td height=\"25\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용목적</td>\r\n\t\t\t\t\t\t  <td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\"> ";
  private final static String _jspx_template36 = "</td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td height=\"25\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">상세시설물</td>\r\n\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template37 = "</td>             \r\n\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">규격</td>\r\n\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template38 = "</td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td height=\"25\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">수량(연장)</td>\r\n\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template39 = "</td>\r\n\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">심도(감액적용)</td>\r\n\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template40 = "</td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t  <td height=\"25\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용기간</td>\r\n\t\t\t\t\t\t  <td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t  \t";
  private final static String _jspx_template41 = " ~ ";
  private final static String _jspx_template42 = "\r\n\t\t\t\t\t\t  </td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t    <tr>\r\n\t\t\t\t\t\t  <td height=\"34\" colspan=\"4\" align=\"left\" bgcolor=\"#FFFFFF\" class=\"\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t  <td><span class=\"sub_stan_blue\"><img src=\"/img/facility_view3.gif\" alt=\"시설물 주소\"></span></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t  </table></td>\r\n\t\t\t\t\t    </tr>\r\n\t\t\t\t\t    <tr>\r\n\t\t\t\t\t\t  <td height=\"25\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\"  nowrap=\"nowrap\">주소</td>\r\n\t\t\t\t\t\t  <td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\"  nowrap=\"nowrap\">(우) ";
  private final static String _jspx_template43 = "&nbsp;&nbsp;";
  private final static String _jspx_template44 = "&nbsp;";
  private final static String _jspx_template45 = "</td>\r\n\t\t\t\t\t    </tr>\r\n\t\t\t\t\t    <tr>\r\n\t\t\t\t\t\t  <td height=\"34\" colspan=\"4\" align=\"left\" bgcolor=\"#FFFFFF\" class=\"\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t  <td><span class=\"sub_stan_blue\"><img src=\"/img/facility_view4.gif\" alt=\"공사(굴착) 정보\"></span></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t  </table></td>\r\n\t\t\t\t\t    </tr>\r\n\t\t\t\t\t    <tr>\r\n\t\t\t\t\t\t\t<td height=\"25\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">공사기간 </td>\r\n\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t  \t\t";
  private final static String _jspx_template46 = " \r\n\t\t\t\t\t\t  \t\t";
  private final static String _jspx_template47 = "\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template48 = "\r\n\t\t\t\t\t\t  \t\t\t~ \r\n\t\t\t\t\t\t  \t\t\t";
  private final static String _jspx_template49 = "\r\n\t\t\t\t\t\t  \t\t";
  private final static String _jspx_template50 = "\r\n\t\t\t\t\t\t  \t\t";
  private final static String _jspx_template51 = "\r\n\t\t\t\t\t\t  \t</td>\r\n\t\t\t\t\t\t   \t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">준공년월일 </td>\r\n\t\t\t\t\t\t  \t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template52 = "</td>\r\n\t\t\t\t\t    </tr>\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t  <td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\"  nowrap=\"nowrap\">공사내용</td>\r\n\t\t\t\t\t\t  <td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\"  nowrap=\"nowrap\">";
  private final static String _jspx_template53 = "</td>\r\n\t\t\t\t\t    </tr>\r\n\t\t\t\t\t</table>\r\n\t\t\t\t\t\r\n\t\t\t\t\t</td>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td height=\"40\" align=\"right\">\r\n\t\t\t\t\t<table width=\"0\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"right\">\r\n\t\t\t\t\t\t<td height=\"40\" align=\"right\">\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template54 = "\r\n\t\t\t\t\t\t\t\t<a href=\"javascript:Modify()\"><img src=\"/img/mod_icon.gif\" alt=\"수정\" width=\"56\" height=\"18\" border=\"0\"></a>\r\n\t\t\t\t\t\t\t\t<a href=\"javascript:Register()\"><img src=\"/img/add_icon.gif\" alt=\"추가\" border=\"0\"></a>\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template55 = "\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</table>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t</table></td>\r\n\t\t\t</tr>\r\n\r\n</table>\r\n</body>\r\n</html>";
}
