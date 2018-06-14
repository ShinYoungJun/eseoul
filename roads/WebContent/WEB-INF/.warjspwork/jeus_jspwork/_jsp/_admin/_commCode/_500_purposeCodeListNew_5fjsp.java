package jeus_jspwork._jsp._admin._commCode;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_purposeCodeListNew_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(31,9);to=(31,12)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MSG}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(32,22);to=(32,25)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MSG}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(35,9);to=(35,16)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SIGU_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(36,10);to=(36,17)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(117,12);to=(117,19)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SIGU_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      out.write(_jspx_template15);
      out.write(_jspx_template16);
      // jsp code [from=(393,17);to=(393,32)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${USING_MODE_LIST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(396,17);to=(396,33)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION_CD_LIST }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(418,195);to=(418,202)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(418,217);to=(418,221)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${CODE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_0_fn(pageContext, null)) return;


      out.write(_jspx_template22);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_1_fn(pageContext, null)) return;


      out.write(_jspx_template24);
      // jsp code [from=(565,94);to=(565,104)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${totalCount}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template54);
      // jsp code [from=(620,27);to=(620,44)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${strPageDivideForm}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template55);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_4_fn(pageContext, null)) return;


      out.write(_jspx_template57);

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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SIGU_CD == '000'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template21);

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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SIGU_CD == '000'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
      if (_jspx_eval_c_if_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template23);

        } while (_jspx_th_c_if_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_1.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_1.release();
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${purposeCodeList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("list");
    _jspx_th_c_forEach_0.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template26);
            // jsp code [from=(586,143);to=(586,155)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template27);
            // jsp code [from=(586,161);to=(586,174)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.CLASS_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template28);
            // jsp code [from=(586,180);to=(586,192)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.SORT_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template29);
            // jsp code [from=(586,198);to=(586,210)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.KIND_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template30);
            // jsp code [from=(586,216);to=(586,225)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.CODE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template31);
            // jsp code [from=(587,46);to=(587,55)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.CODE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template32);
            // jsp code [from=(587,69);to=(587,78)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.CODE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template33);
            // jsp code [from=(587,92);to=(587,109)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.SECTION_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template34);
            // jsp code [from=(587,115);to=(587,124)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.CODE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template35);
            // jsp code [from=(587,130);to=(587,143)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.CLASS_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template36);
            // jsp code [from=(587,149);to=(587,161)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.SORT_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template37);
            // ----  c:if ---- invoke //
            if (_jspx_th_c_if_2_fn(pageContext, _jspx_th_c_forEach_0)) return true;


            out.write(_jspx_template39);
            // jsp code [from=(589,52);to=(589,61)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.CODE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template40);
            // jsp code [from=(589,85);to=(589,94)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.CODE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template41);
            // jsp code [from=(589,106);to=(589,118)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template42);
            // jsp code [from=(590,49);to=(590,58)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.CODE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template43);
            // jsp code [from=(590,79);to=(590,88)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.CODE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template44);
            // jsp code [from=(590,100);to=(590,109)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.CODE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template45);
            // jsp code [from=(597,79);to=(597,91)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template46);
            // jsp code [from=(598,73);to=(598,82)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.CODE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template47);
            // jsp code [from=(601,46);to=(601,63)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.SECTION_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template48);
            // jsp code [from=(602,32);to=(602,41)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.CODE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template49);
            // jsp code [from=(603,46);to=(603,59)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.CLASS_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template50);
            // jsp code [from=(604,46);to=(604,58)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.SORT_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template51);
            // ----  c:if ---- invoke //
            if (_jspx_th_c_if_3_fn(pageContext, _jspx_th_c_forEach_0)) return true;


            // jsp code [from=(605,77);to=(605,89)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.KIND_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template53);

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

  private boolean _jspx_th_c_if_4_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:if ---- //
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = new org.apache.taglibs.standard.tag.rt.core.IfTag();
    _jspx_th_c_if_4.setPageContext(pageContext);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SIGU_CD == '000'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
      if (_jspx_eval_c_if_4 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template56);

        } while (_jspx_th_c_if_4.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_4.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_4.release();
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
    _jspx_th_c_if_2.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.KIND_NM != null}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
      if (_jspx_eval_c_if_2 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template38);
          // jsp code [from=(587,204);to=(587,216)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.KIND_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));


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
    _jspx_th_c_if_3.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.KIND_NM == null}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
      if (_jspx_eval_c_if_3 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template52);

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
  private final static String _jspx_template2 = "  \r\n";
  private final static String _jspx_template3 = "  \r\n";
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "\r\n";
  private final static String _jspx_template6 = "\r\n";
  private final static String _jspx_template7 = "\r\n";
  private final static String _jspx_template8 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('사용자의 사용시간이 종료되었습니다. 다시 접속 해주시기 바랍니다.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template9 = "\r\n\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script language=\"javascript\" src=\"/js/common.js\"></script> \r\n<script language=\"javascript\" src=\"/js/admin.js\"></script>\r\n<!--  //********** BEGIN_현진_20120319 -->\r\n<script language=\"javascript\" src=\"/js/selectItem.js\"></script>\r\n<!--   //********** END_현진_20120319 -->\r\n<script type=\"text/javascript\">\r\n//<![CDATA[\r\n\tfunction InitPage(){\t\t\r\n\t\tif('";
  private final static String _jspx_template10 = "'.length > 0){\r\n            alert('";
  private final static String _jspx_template11 = "');\r\n        }\t\t\r\n\t\t//********** BEGIN_현진_20120320\r\n\t\tif('";
  private final static String _jspx_template12 = "' == '000'){\r\n\t\t\tif('";
  private final static String _jspx_template13 = "' == \"0\"){\r\n\t    \t\tdocument.getElementById(\"addBtn\").style.display = \"none\";\r\n\t    \t\tdocument.getElementById(\"addBtn2\").style.display = \"none\";\r\n\t    \t}else{\r\n\t    \t\tdocument.getElementById(\"addBtn\").style.display = \"block\";\r\n\t    \t\tdocument.getElementById(\"addBtn2\").style.display = \"block\";\r\n\t    \t}\r\n\t\t}\r\n\t\t//********** END_현진_20120320\r\n    }\r\n\tfunction  search(){\r\n\t\t\r\n\t\tvar w = document.searchForm;\r\n\r\n\t\tvar iFrm = document.getElementById(\"IFRM_PurposeCode\");\r\n\t\tdocument.getElementById(\"CODE\").value = iFrm.contentWindow.document.getElementById(\"PURPOSE_CD\").value;\r\n\t\tdocument.getElementById(\"CLASS_CD\").value = iFrm.contentWindow.document.getElementById(\"PURPOSE1\").value;\r\n\t\tdocument.getElementById(\"SORT_CD\").value = iFrm.contentWindow.document.getElementById(\"PURPOSE2\").value;\r\n\t\tdocument.getElementById(\"KIND_CD\").value = iFrm.contentWindow.document.getElementById(\"PURPOSE3\").value;\r\n\t\t\r\n\t\tw.action = \"/admin/commCode/purposeCode.do\";\r\n\t\t\r\n\t\tw.submit();\r\n\t}\r\n\r\n    function getXMLHTTPRequest()\r\n    {\r\n        var xRequest = null;\r\n        xRequest = new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n\r\n        return xRequest;\r\n    }\r\n\r\n    var req;\r\n    var\tcall;\r\n\r\n    function sendRequest(url, params, HttpMethod, callback)\r\n    {\r\n        req = getXMLHTTPRequest();\r\n\r\n        call\t= callback;\r\n        if(req){\r\n            req.onreadystatechange = onReadyStateChange;\r\n            req.open(HttpMethod, url, true);\r\n            req.setRequestHeader(\"Content-Type\",\"application/x-www-form-urlencoded;charset=utf-8\");\r\n            req.send(params);\r\n        }\r\n    }\r\n\r\n    function onReadyStateChange()\r\n    {\r\n        var ready = req.readyState;\r\n        var data = null;\r\n        if(ready == 4){\r\n            if(this.call\t!= null)\r\n            {\r\n                this.call(req.responseText);\r\n            }\r\n        }\r\n    }\r\n    \t\r\n\tfunction Select_Using_mode(obj){\t\t\r\n\r\n    \tvar selectUsingMode = getSelectedValue(obj);\t    \t\r\n        var\tparam\t= \"USING_MODE=\"+selectUsingMode;\r\n       //********** BEGIN_현진_20120319      \r\n       document.getElementById(\"IFRM_PurposeCode\").src=\"/jsp/common/purposeCode/purposeCode2.jsp?SectionCode=0&PURPOSE_CD=000\";\r\n       //********** END_현진_20120319\r\n              \t        \r\n        sendRequest(\"/admin/commCode/getSectionCode.do\", param, \"GET\", ResultChangeSectionCDList);    \t\r\n    \t\r\n    }\r\n\r\n    function\tResultChangeSectionCDList(obj)\r\n    {\r\n    \tselect_innerHTML(document.getElementById(\"SECTION_CD\"),obj);\r\n    }\r\n\r\n\tfunction changeSection(obj){\r\n    \tvar SectionCode = getSelectedValue(obj);\t    \t\r\n    \t//********** BEGIN_현진_20120320\r\n    \tif('";
  private final static String _jspx_template14 = "' == '000'){\r\n    \t\tif(SectionCode == \"0\"){\r\n        \t\tdocument.getElementById(\"addBtn\").style.display = \"none\";\r\n        \t\tdocument.getElementById(\"addBtn2\").style.display = \"none\";\r\n        \t}else{\r\n        \t\tdocument.getElementById(\"addBtn\").style.display = \"block\";\r\n        \t\tdocument.getElementById(\"addBtn2\").style.display = \"block\";\r\n        \t}\r\n\t\t}\r\n    \t\r\n    \t//********** END_현진_20120320\r\n\t\tdocument.getElementById(\"IFRM_PurposeCode\").src=\"/jsp/common/purposeCode/purposeCode2.jsp?SectionCode=\"+SectionCode+\"&PURPOSE_CD=000\";\r\n\t}\r\n\r\n\tfunction  fn_detailInfo(obj)\r\n\t{\t\t\t\r\n\t\tvar temp = obj.split(\"/\");\r\n\t    \t    \r\n\t    var yoyul = temp[0];\r\n\t    var check_yn = temp[1];\r\n\t    var gigan = temp[2];\r\n\t    var danwii = temp[3];\r\n\t    var momey = temp[4];\r\n\t    var code = temp[5];\t    \r\n\t    var title = \"title\" + code;\r\n\r\n\t \tif(gigan ==\"null\"){gigan = \"\"};\r\n\t \tif(danwii ==\"null\"){danwii = \"\"};\r\n\t \tif(check_yn == \"null\"){check_yn = \"1\"};\r\n\t\t \t\r\n\t\tdocument.getElementById(\"detail\").style.display = \"block\";\t\r\n\t\tdocument.getElementById(\"detailModify\").style.display = \"none\";\r\n\t\t\t\t\r\n\t\tdocument.getElementById(\"detailTitle\").innerHTML = document.getElementById(title).value;\r\n\t\tdocument.getElementById(\"detailYoyol\").innerHTML = yoyul;\r\n\t\tvar check = \"\";\r\n\t\tif(check_yn == \"1\"){\r\n\t\t\tcheck = \"단가\";\r\n\t\t}else if(check_yn == \"2\"){\r\n\t\t\tcheck = \"요율\";\r\n\t\t}\r\n\t\tdocument.getElementById(\"detailCheckYn\").innerHTML = check;\r\n\t\tdocument.getElementById(\"detailGigan\").innerHTML = gigan;\r\n\t\tdocument.getElementById(\"detailDanwii\").innerHTML = danwii;\r\n\t\tdocument.getElementById(\"detailMomey\").innerHTML = momey;\r\n\r\n\t\tvar ditailSection = \"ditailSection\"+code;\r\n\t\tvar ditailCode = \"ditailCode\"+code;\r\n\t\tdocument.getElementById(\"detailTitleModyfy\").innerHTML = document.getElementById(title).value;\r\n\t\tdocument.getElementById(\"detailYoyolModyfy\").value = yoyul;\t\t\r\n\t\tdocument.getElementById(\"detailCheckYnModyfy\").value = check_yn;\r\n\t\tdocument.getElementById(\"detailGiganModyfy\").value = gigan;\r\n\t\tdocument.getElementById(\"detailDanwiiModyfy\").value = danwii;\r\n\t\tdocument.getElementById(\"detailMomeyModyfy\").value = momey;\r\n\t\tdocument.getElementById(\"ditailSectionModyfy\").value = document.getElementById(ditailSection).value;\r\n\t\tdocument.getElementById(\"ditailCodeModyfy\").value = document.getElementById(ditailCode).value;\r\n\t\r\n\t}\r\n\t\r\n\tfunction detailInfo(SECTION, CLASS_CD,SORT_CD, KIND_CD,CODE){\r\n\t\tvar param = \"SECTION=\"+SECTION+\"&CLASS_CD=\"+CLASS_CD+\"&SORT_CD=\"+SORT_CD+\"&KIND_CD=\"+KIND_CD+\"&CODE=\"+CODE;\r\n\r\n        sendRequest(\"/admin/commCode/purposeCodeDetailSelect.do\", param, \"post\", fn_detailInfo);    \t\r\n\t}\r\n\t\r\n\t//********** END_현진_20120319\r\n\r\n\t\r\n\tfunction detailModify(){\r\n\t\tdocument.getElementById(\"detail\").style.display = \"none\";\t\r\n\t\tdocument.getElementById(\"detailModify\").style.display = \"block\";\r\n\t}\r\n\r\n\tfunction detailModyfyGo(){\r\n\t\tvar w = detailModifyForm;\r\n\t\t\r\n\t\tvar SECTION = document.getElementById(\"ditailSectionModyfy\").value;\r\n\t\tvar CODE = document.getElementById(\"ditailCodeModyfy\").value;\r\n\t\tvar YOYUL = document.getElementById(\"detailYoyolModyfy\").value;\r\n\t\tvar CHECK_YN = document.getElementById(\"detailCheckYnModyfy\").value;\r\n\t\tvar GIGAN = document.getElementById(\"detailGiganModyfy\").value;\r\n\t\tvar DANWII = document.getElementById(\"detailDanwiiModyfy\").value;\r\n\t\tvar MOMEY = document.getElementById(\"detailMomeyModyfy\").value;\r\n\r\n\t\tif(YOYUL >= 10){\r\n\t\t\talert(\"입력하신 요율 숫자가  큽니다.\");\r\n\t\t\tdocument.getElementById(\"detailYoyolModyfy\").focus();\r\n\t\t\treturn\r\n\t\t}\r\n\t\t\r\n\t\tvar param = \"SECTION=\"+SECTION+\"&CODE=\"+CODE+\"&YOYUL=\"+YOYUL+\"&CHECK_YN=\"+CHECK_YN+\"&GIGAN=\"+GIGAN+\"&DANWII=\"+DANWII+\"&MOMEY=\"+MOMEY;\r\n\r\n        sendRequest(\"/admin/commCode/purposeCodeDetailModify.do\", param, \"post\", detailModyfyList);    \t\r\n\t}\r\n\r\n\tfunction\tdetailModyfyList(obj)\r\n    {\t    \r\n\t    var temp = obj.split(\"/\");   \r\n\t    \r\n\t    alert(temp[0]);\r\n\t\tdocument.getElementById(\"detail\").style.display = \"block\";\t\r\n\t\tdocument.getElementById(\"detailModify\").style.display = \"none\";\r\n\t\tdocument.getElementById(\"detailYoyol\").innerHTML=temp[1];\r\n\t\tvar check = \"\";\r\n\t\tif(temp[2] == \"1\"){\r\n\t\t\tcheck = \"단가\";\r\n";
  private final static String _jspx_template15 = "\t\t}else if(temp[2] == \"2\"){\r\n\t\t\tcheck = \"요율\";\r\n\t\t}\r\n\t\tdocument.getElementById(\"detailCheckYn\").innerHTML=check;\r\n\t\tdocument.getElementById(\"detailGigan\").innerHTML=temp[3];\r\n\t\tdocument.getElementById(\"detailDanwii\").innerHTML=temp[4];\r\n\t\tdocument.getElementById(\"detailMomey\").innerHTML=temp[5];\r\n    }\r\n\r\n\t//********** BEGIN_현진_20120319\r\n\tfunction registerPop(mod){\r\n\t\tvar mode = mod;\r\n\t\tvar title =\"\";\r\n\t\tvar param =\"\";\r\n\t\t\r\n\t\tif(mod == \"add\"){\r\n\t\t\ttitle=\"점용목적추가\";\r\n\t\t\tvar iFrm = document.getElementById(\"IFRM_PurposeCode\");\r\n\t\t\tparam += \"&SECTION=\" + document.getElementById(\"SECTION_CD\").value;\r\n\t\t\tparam += \"&CODE=\" + iFrm.contentWindow.document.getElementById(\"PURPOSE_CD\").value;\r\n\t\t\tparam += \"&CLASS_CD=\" + iFrm.contentWindow.document.getElementById(\"PURPOSE1\").value;\r\n\t\t\tparam += \"&SORT_CD=\" + iFrm.contentWindow.document.getElementById(\"PURPOSE2\").value;\r\n\t\t\tparam += \"&KIND_CD=\" + iFrm.contentWindow.document.getElementById(\"PURPOSE3\").value;\r\n\t\t\t\r\n\t\t}else if(mod == \"add2\"){\r\n\t\t\ttitle=\"점용목적추가\";\r\n\t\t\tparam += \"&SECTION=\" + document.getElementById(\"SECTION_CD\").value;\r\n\t\t}else{\r\n\t\t\tvar cnt = cntCheck();\r\n\t\t\tif(!(confirm(\"해당데이터를 수정하시면 기존 데이터에 영향을 줄 수 있습니다.그래도 수정하시겠습니까?\"))){\r\n\t\t\t\treturn;\r\n\t\t\t}\r\n\t\t\tif(cnt <=0){\r\n\t\t\t\talert(\"처리 대상이 없습니다.\");\r\n\t\t\t\treturn;\r\n\t\t\t}else if(cnt > 1){\r\n\t\t\t\talert(\"수정은 1건씩만 가능합니다.\");\r\n\t\t\t\treturn;\r\n\t\t\t\t\r\n\t\t\t}\r\n\t\t\tparam += \"&modySECTION=\" + document.getElementById(\"modySECTION\").value;\r\n\t\t\tparam += \"&modyCODE=\" + document.getElementById(\"modyCODE\").value;\r\n\t\t\ttitle=\"점용목적수정\";\r\n\t\t}\r\n\t\t\r\n\t\tvar url = \"/admin/commCode/purposeRegisterView.do?mode=\" + mode + param;\r\n  \t\tpopUp(url, title, 800, 200);\t\r\n\t}\r\n\r\n\tfunction deletePop(){\r\n\t\tvar w = document.sectionForm;\r\n\t\tvar cnt = cntCheck();\r\n\t\tif(!(confirm(\"해당데이터를 삭제하시면 기존 데이터에 영향을 줄 수 있습니다.그래도 삭제하시겠습니까?\"))){\r\n\t\t\treturn;\r\n\t\t}\r\n\t\tif(cnt <= 0){\r\n\t\t\talert(\"처리 대상이 없습니다.\");\r\n\t\t\treturn;\r\n\t\t}else{\t\t\t\r\n\t\t\tif (confirm(cnt + \"건을 삭제하시겠습니까?\")){\r\n\t\t\t\tw.action = \"/admin/commCode/purposeDelete.do\";\r\n\t\t\t\tw.submit();\r\n\t\t\t}else{\r\n\t\t\t\treturn;\r\n\t\t\t}\r\n\t\t}\r\n\t\t\r\n\t}\r\n\r\n\tfunction cntCheck(){\r\n\t\tvar w = document.sectionForm;\r\n\t\tvar select_item = document.getElementsByName(\"SELECT_ITEM\");\r\n\t\tvar item_check = document.getElementsByName(\"ITEM_CHECK\");\r\n\t\tvar section_arr = document.getElementsByName(\"SECTION_ARR\");\r\n\t\tvar code_arr = document.getElementsByName(\"CODE_ARR\");\r\n\r\n\t\tvar modySECTION =  document.getElementById(\"modySECTION\");\r\n\t\tvar modyCODE =  document.getElementById(\"modyCODE\");\r\n\r\n\t\tvar cnt = 0;\t\t\r\n\r\n\t\tfor(var i = 0 ; i < select_item.length ; i++){\r\n\t\t\tif(select_item[i].checked == true){\r\n\t\t\t\titem_check[i].value = select_item[i].checked;\r\n\t\t\t\tmodySECTION.value=section_arr[i].value;\r\n\t\t\t\tmodyCODE.value=code_arr[i].value;\r\n\t\t\t\tcnt++;\r\n\t\t\t}\r\n\t\t}\r\n\t\treturn cnt;\r\n\t}\r\n\t//********** END_현진_20120319\r\n//]]>\r\n</script>\r\n\r\n<body onload=\"javascript:InitPage();\">\r\n<table width=\"800\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t<tr>\r\n\t\t<td height=\"43\"><img src=\"/img/admin_cont3_title.gif\"\r\n\t\t\twidth=\"800\" height=\"43\"></td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td align=\"center\">\r\n\t\t<table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"1\" bgcolor=\"eaeaea\"></td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"14\"></td>\r\n\t\t\t</tr>\r\n\t\t</table>\r\n\r\n\t\t<table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t<tr>\r\n\t\t\t\t<td align=\"left\" height=\"22\" background=\"/img/tab_line_blue.gif\">\r\n\t\t\t\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td width=\"111\"><a href=\"/admin/commCode/areaCode.do\"><img\r\n\t\t\t\t\t\t\tsrc=\"/img/sub_admin_title4_off.gif\" alt=\"지역코드\" width=\"110\"\r\n\t\t\t\t\t\t\theight=\"22\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t<td  width=\"111\"><a href=\"/admin/commCode/orgCode.do\"><img\r\n\t\t\t\t\t\t\tsrc=\"/img/sub_admin_title5_off.gif\" alt=\"부서코드\" width=\"110\"\r\n\t\t\t\t\t\t\theight=\"22\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t<td width=\"111\"><a href=\"#\"><img\r\n\t\t\t\t\t\t\tsrc=\"/img/sub_admin_title6_on.gif\" alt=\"점용목적코드\" width=\"110\"\r\n\t\t\t\t\t\t\theight=\"22\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t<td width=\"111\"><a href=\"/admin/commCode/taxCode.do\"><img\r\n\t\t\t\t\t\t\tsrc=\"/img/sub_admin_title7_off.gif\" alt=\"과세구분코드\" width=\"110\"\r\n\t\t\t\t\t\t\theight=\"22\" border=\"0\">";
  private final static String _jspx_template16 = "</a></td>\r\n\t\t\t\t\t\t<td width=\"111\"><a href=\"/admin/commCode/seal.do\"><img\r\n\t\t\t\t\t\t\tsrc=\"/img/sub_admin_seal_off.gif\" alt=\"직인등록\" width=\"110\"\t\t\t\t\t\t\t         \r\n\t\t\t\t\t\t\theight=\"22\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t<td width=\"111\"><a href=\"/admin/commCode/jojungCode.do\"><img\r\n\t\t\t\t\t\t\tsrc=\"/img/sub_admin_title9_off.gif\" alt=\"조정계수\" width=\"110\"\r\n\t\t\t\t\t\t\theight=\"22\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t<td width=\"111\"><a href=\"/admin/commCode/gradeCode.do\"><img\r\n\t\t\t\t\t\t\tsrc=\"/img/sub_admin_title12_off.gif\" alt=\"등급코드\" width=\"110\"\r\n\t\t\t\t\t\t\theight=\"22\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t<td width=\"111\"><a href=\"/admin/commCode/officeCode.do\"><img\r\n\t\t\t\t\t\t\tsrc=\"/img/sub_admin_title13_off.gif\" alt=\"업체코드\" width=\"110\"\r\n\t\t\t\t\t\t\theight=\"22\" border=\"0\"></a></td>\t\t\t\t\t\t\t\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td align=\"center\" class=\"contborder_blue\">\r\n\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"20px\"></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<!-- 조회 -->\r\n\t\t\t\t\t<form id=\"searchForm\" name=\"searchForm\">\r\n\t\t\t\t\t<input type=\"hidden\" id=\"CLASS_CD\" name=\"CLASS_CD\"/>\r\n\t\t\t\t\t<input type=\"hidden\" id=\"SORT_CD\" name=\"SORT_CD\"/>\r\n\t\t\t\t\t<input type=\"hidden\" id=\"KIND_CD\" name=\"KIND_CD\"/>\r\n\t\t\t\t\t<input type=\"hidden\" id=\"CODE\" name=\"CODE\"/>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td align=\"center\">\r\n\t\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\"\r\n\t\t\t\t\t\t\t\tstyle=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"\r\n\t\t\t\t\t\t\t\tclass=\"sub_table\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td width=\"100px\" height=\"28px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용종류</td>\r\n\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\t\t\t\t\t\t\t\t\t\t<table border=\"0\" align=\"left\">\r\n\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<select id=\"USING_MODE\" name=\"USING_MODE\" class=\"input_form1\" style=\"width:150px\"  OnChange=\"Select_Using_mode(this);\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template17 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<select id=\"SECTION_CD\" name=\"SECTION_CD\" class=\"input_form1\" style=\"width:130px\" OnChange=\"changeSection(this);\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template18 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t</tr>\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t</td>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\t\t\t\t\t\t\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr><td height=\"15px\"></td></tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td align=\"center\">\r\n\t\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\"\r\n\t\t\t\t\t\t\t\tstyle=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"\r\n\t\t\t\t\t\t\t\tclass=\"sub_table\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td width=\"100px\" height=\"28px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용목적</td>\r\n\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\t\t\t\t\t\t\t\t\t\t<table border=\"0\" align=\"left\" width=\"100%\">\r\n\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<iframe id=\"IFRM_PurposeCode\" align=\"absmiddle\" scrolling=\"no\" frameborder=\"0\" framespacing=\"0\" width=\"100%\" height=\"25\" src=\"/jsp/common/purposeCode/purposeCode2.jsp?SectionCode=";
  private final static String _jspx_template19 = "&PURPOSE_CD=";
  private final static String _jspx_template20 = "\"></iframe>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</td>\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t</tr>\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\t\t\t\t\t\t\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"30px\" align=\"right\">\r\n\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t<div><a href=\"#\"><img src=\"/img/inquiry_icon2.gif\" alt=\"조회\" border=\"0\" onClick=\"javascript:search();\"></a></div>\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t<div id=\"addBtn\" style=\"display:none\"><img src=\"/img/add_icon.gif\" alt=\"추가\" width=\"56\" height=\"18\" border=\"0\" style=\"cursor: pointer;\" onclick=\"javascript:registerPop('add');\"/></div>\t\t\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t</form>\t\t\t\t\r\n\t\t\t\t\t<!--조회 끝-->\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"30px\"></td>\r\n\t\t\t\t\t</tr>\t\t\t\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"1\" bgcolor=\"#EAEAEA\"></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td align=\"left\">\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t<div id=\"detail\" style=\"display:none\">\t\r\n\t\t\t\t\t\t\t<table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td height=\"20px\"></td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\"\r\n\t\t\t\t\t\t\t\t\t\tstyle=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"\r\n\t\t\t\t\t\t\t\t\t\tclass=\"sub_table\">\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td width=\"150px\" height=\"26px\" align=\"center\" bgcolor=\"#F3F8FC\" class=\"sub_table_b\">점용물 </td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td height=\"28\" colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<span id=\"detailTitle\"></span> \r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td width=\"150px\" height=\"26px\" align=\"center\" bgcolor=\"#F3F8FC\" class=\"sub_table_b\">요율</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td width=\"270px\" bgcolor=\"f2f2f2\" class=\"table_bl_left\"><span id=\"detailYoyol\"></span> </td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td width=\"150px\" align=\"center\" bgcolor=\"#F3F8FC\" class=\"sub_table_b\">계산 구분</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"f2f2f2\" class=\"table_bl_left\"><span id=\"detailCheckYn\"></span> </td>\r\n\t\t\t\t\t\t\t\t\t\t</tr>\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"#F3F8FC\"\r\n\t\t\t\t\t\t\t\t\t\t\t\tclass=\"sub_table_b\">기간단위</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"f2f2f2\" class=\"table_bl_left\"><span id=\"detailGigan\"></span> </td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"#F3F8FC\" class=\"sub_table_b\">점용단위</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"f2f2f2\" class=\"table_bl_left\"><span id=\"detailDanwii\"></span> </td>\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"#F3F8FC\"\r\n\t\t\t\t\t\t\t\t\t\t\t\tclass=\"sub_table_b\">점용료</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td colspan=\"3\" bgcolor=\"f2f2f2\" class=\"table_bl_left\"><span id=\"detailMomey\"></span> </td>\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t<!--  //********** BEGIN_현진_20120319 -->\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template21 = "\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td align=\"right\" height=\"30px\"><img src=\"/img/mod_icon.gif\" alt=\"수정\" width=\"56\" height=\"18\" border=\"0\" style=\"cursor: pointer;\" onclick=\"javascript:detailModify()\"></td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template22 = "\r\n\t\t\t\t\t\t\t\t<!--   //********** END_현진_20120319 -->\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<!--  //********** BEGIN_현진_20120319 -->\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td align=\"left\">\r\n\t\t\t\t\t\t<form id=\"detailModifyForm\" name=\"detailModifyForm\">\t\t\t\t\t\r\n\t\t\t\t\t\t<div id=\"detailModify\" style=\"display:none\">\t\r\n\t\t\t\t\t\t\t<table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td height=\"20px\"></td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\"\r\n\t\t\t\t\t\t\t\t\t\tstyle=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"\r\n\t\t\t\t\t\t\t\t\t\tclass=\"sub_table\">\r\n\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td width=\"150px\" height=\"26px\" align=\"center\" bgcolor=\"#F3F8FC\" class=\"sub_table_b\">점용물 </td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td height=\"28\" colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<span id=\"detailTitleModyfy\"></span> \r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td width=\"150px\" height=\"26px\" align=\"center\" bgcolor=\"#F3F8FC\" class=\"sub_table_b\">요율</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td width=\"270px\" bgcolor=\"f2f2f2\" class=\"table_bl_left\"><input type=\"text\" id=\"detailYoyolModyfy\" class=\"input_form1\" maxlength=\"5\"/></td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td width=\"150px\" align=\"center\" bgcolor=\"#F3F8FC\" class=\"sub_table_b\">계산 구분</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"f2f2f2\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<select id=\"detailCheckYnModyfy\" class=\"input_form1\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"1\">단가</option>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"2\">요율</option>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</select>\t\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t</tr>\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"#F3F8FC\"\r\n\t\t\t\t\t\t\t\t\t\t\t\tclass=\"sub_table_b\">기간단위</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"f2f2f2\" class=\"table_bl_left\"><input type=\"text\" id=\"detailGiganModyfy\" class=\"input_form1\" maxlength=\"5\"/></td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"#F3F8FC\" class=\"sub_table_b\">점용단위</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"f2f2f2\" class=\"table_bl_left\"><input type=\"text\" id=\"detailDanwiiModyfy\" class=\"input_form1\" maxlength=\"5\"/></td>\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"#F3F8FC\"\r\n\t\t\t\t\t\t\t\t\t\t\t\tclass=\"sub_table_b\">점용료</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td colspan=\"3\" bgcolor=\"f2f2f2\" class=\"table_bl_left\"><input type=\"text\" id=\"detailMomeyModyfy\" class=\"input_form1\" maxlength=\"38\" onchange=\"isNum(this,'점용료')\"/>\r\n\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"ditailSectionModyfy\" name=\"ditailSectionModyfy\" />\r\n\t\t\t\t\t\t\t\t\t\t\t<input type=\"hidden\" id=\"ditailCodeModyfy\" name=\"ditailCodeModyfy\" />\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template23 = "\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td align=\"right\" height=\"30px\"><a href=\"#\"><img src=\"/img/register_icon2.gif\" alt=\"등록\" border=\"0\" onClick=\"javascript:detailModyfyGo();\"></a></td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template24 = "\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t</form>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<!--   //********** END_현진_20120319 -->\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"20px\"></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t     <td height=\"34\" class=\"sub_stan\" align=\"left\">전체건수 : <span class=\"sub_stan_blue\">";
  private final static String _jspx_template25 = "</span> 건 </td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td align=\"left\">\r\n\t\t\t\t\t\t\t<form id=\"sectionForm\" name=\"sectionForm\">\t\t\t\t\t\r\n\t\t\t\t\t\t\t<input type=\"hidden\" id=\"modyCODE\" name=\"modyCODE\" value=\"\"/>\r\n\t\t\t\t\t\t\t<input type=\"hidden\" id=\"modySECTION\" name=\"modySECTION\" value=\"\"/>\t\t\r\n\t\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\"\r\n\t\t\t\t\t\t\t\tstyle=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"\r\n\t\t\t\t\t\t\t\tclass=\"sub_table\">\r\n\t\t\t\t\t\t\t\t<tr>\t\t\r\n\t\t\t\t\t\t\t\t\t<!--  //********** BEGIN_현진_20120319 -->\r\n\t\t\t\t\t\t\t\t\t<td width=\"35px\" height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">\r\n\t\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" id=\"SELECT_ALL\" name=\"SELECT_ALL\" onclick=\"javascript:selectAll(this);\">\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t<!--   //********** END_현진_20120319 -->\t\r\n\t\t\t\t\t\t\t\t\t<td width=\"80px\" height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용구분</td>\r\n\t\t\t\t\t\t\t\t\t<td width=\"80px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">분류코드</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" colspan=\"3\">점용물 종류</td>\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template26 = "\t\t\t\t\t\t\t\t\t \r\n\t\t\t\t\t\t\t\t\t <tr onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\" onClick=\"javascript:detailInfo('";
  private final static String _jspx_template27 = "','";
  private final static String _jspx_template28 = "','";
  private final static String _jspx_template29 = "','";
  private final static String _jspx_template30 = "','";
  private final static String _jspx_template31 = "');\">\r\n\t\t\t\t\t\t\t\t\t \t<input type=\"hidden\" name=\"title";
  private final static String _jspx_template32 = "\" id=\"title";
  private final static String _jspx_template33 = "\" value=\"[ ";
  private final static String _jspx_template34 = " - ";
  private final static String _jspx_template35 = " ] ";
  private final static String _jspx_template36 = " - ";
  private final static String _jspx_template37 = " ";
  private final static String _jspx_template38 = "- ";
  private final static String _jspx_template39 = "\"/>\r\n\t\t\t\t\t\t\t\t\t \t<!--  //********** BEGIN_현진_20120319 -->\r\n\t\t\t\t\t\t\t\t\t \t<input type=\"hidden\" id=\"ditailSection";
  private final static String _jspx_template40 = "\" name=\"ditailSection";
  private final static String _jspx_template41 = "\" value=\"";
  private final static String _jspx_template42 = "\"/>\r\n\t\t\t\t\t\t\t\t\t \t<input type=\"hidden\" id=\"ditailCode";
  private final static String _jspx_template43 = "\" name=\"ditailCode";
  private final static String _jspx_template44 = "\" value=\"";
  private final static String _jspx_template45 = "\"/>\r\n\t\t\t\t\t\t\t\t\t\t<!--   //********** END_현진_20120319 -->\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t<!--  //********** BEGIN_현진_20120319 -->\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"35px\" height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">\r\n\t\t\t\t\t\t\t\t\t \t\t<input type=\"checkbox\" id=\"SELECT_ITEM\" name=\"SELECT_ITEM\"/>\r\n\t\t\t\t\t\t\t\t\t \t\t<input type=\"hidden\" id=\"ITEM_CHECK\" name=\"ITEM_CHECK\" value=\"\"/>\r\n\t\t\t\t\t\t\t\t\t \t\t<input type=\"hidden\" id=\"SECTION_ARR\" name=\"SECTION_ARR\" value=\"";
  private final static String _jspx_template46 = "\"/>\r\n\t\t\t\t\t\t\t\t\t \t\t<input type=\"hidden\" id=\"CODE_ARR\" name=\"CODE_ARR\" value=\"";
  private final static String _jspx_template47 = "\"/>\t\t\t\t\t\t\t\t \t\t\r\n\t\t\t\t\t\t\t\t\t \t</td>\r\n\t\t\t\t\t\t\t\t\t \t<!--   //********** END_현진_20120319 -->\r\n\t\t\t\t\t\t\t\t\t\t<td height=\"26px\" align=\"center\">";
  private final static String _jspx_template48 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template49 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"200px\" align=\"center\">";
  private final static String _jspx_template50 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"250px\" align=\"center\">";
  private final static String _jspx_template51 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template52 = "-";
  private final static String _jspx_template53 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template54 = "\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t</form>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"40\" align=\"center\">\r\n\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td align=\"center\">\r\n\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<!-- 페이징시작 -->";
  private final static String _jspx_template55 = "<!-- 페이징끝 -->\t\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\t\r\n\t\t\t\t\t\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"10px\"></td>\r\n\t\t\t\t\t</tr>\t\t\t\t\t\r\n\t\t\t\t\t<!--  //********** BEGIN_현진_20120319 -->\r\n\t\t\t\t\t";
  private final static String _jspx_template56 = "\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t<table width=\"150px\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"center\">\r\n\t\t\t\t\t\t\t\t<tr>\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t<td width=\"60px\" valign=\"middle\" >\r\n\t\t\t\t\t\t\t\t\t\t<div id=\"addBtn2\" style=\"display:none\"><img src=\"/img/add_icon.gif\" alt=\"추가\" width=\"56\" height=\"18\" border=\"0\" style=\"cursor: pointer;\" onclick=\"javascript:registerPop('add2');\"/></div>\t\t\r\n\t\t\t\t\t\t\t\t\t</td>\t\t\t\r\n\t\t\t\t\t\t\t\t\t<td><img src=\"/img/mod_icon.gif\" alt=\"수정\" width=\"56\" height=\"18\" border=\"0\" style=\"cursor: pointer;\" onclick=\"javascript:registerPop('modify');\"/></td>\r\n\t\t\t\t\t\t\t\t\t<td><img src=\"/img/del_icon3.gif\" alt=\"삭제\" width=\"56\" height=\"18\" border=\"0\" style=\"cursor: pointer;\" onclick=\"javascript:deletePop();\"/></td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t";
  private final static String _jspx_template57 = "\r\n\t\t\t\t\t<!--   //********** END_현진_20120319 -->\r\n\t\t\t\t</table>\r\n\t\t\t\t\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n</table>\r\n\r\n</body>\r\n</html>\r\n\r\n";
}
