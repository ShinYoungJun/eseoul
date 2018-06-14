package jeus_jspwork._jsp._jumyong._minwon;

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
      out.write(_jspx_template10);
      // jsp code [from=(118,67);to=(118,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(119,61);to=(119,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${LISTVIEW}",java.lang.String.class , pageContext.getVariableResolver(), null));

      // jsp code [from=(127,6);to=(143,2)]
      out.write(_jspx_template12);
      out.write(_jspx_template13);
      // jsp code [from=(170,128);to=(170,134)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GIGAN1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(173,128);to=(173,134)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GIGAN2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(180,124);to=(180,132)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MIN_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(186,92);to=(186,100)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${check_yn}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(187,133);to=(187,145)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${process_flag}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(196,111);to=(196,120)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MIN_REQNO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(200,110);to=(200,118)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MIN_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(214,89);to=(214,97)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${totalcnt}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // ----  c:choose ---- invoke //
      if (_jspx_th_c_choose_0_fn(pageContext, null)) return;


      out.write(_jspx_template43);
      // jsp code [from=(269,9);to=(269,16)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${pageing}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template44);

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
          out.write(_jspx_template22);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template38);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_1_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template40);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template42);

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
          out.write(_jspx_template23);
          // ----  c:forEach ---- invoke //
          if (_jspx_th_c_forEach_0_fn(pageContext, _jspx_th_c_when_0)) return true;


          out.write(_jspx_template37);

        } while (_jspx_th_c_when_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_when_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_when_0.release();
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
    _jspx_th_c_when_1.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${LISTVIEW == \"0\"}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
      if (_jspx_eval_c_when_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template39);

        } while (_jspx_th_c_when_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_when_1.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_when_1.release();
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
            out.write(_jspx_template24);
            // jsp code [from=(235,57);to=(235,71)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template25);
            // jsp code [from=(236,70);to=(236,78)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.RN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template26);
            // jsp code [from=(237,49);to=(237,61)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.REQ_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template27);
            // jsp code [from=(238,41);to=(238,53)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.REQ_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template28);
            // jsp code [from=(239,49);to=(239,62)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.MANAGER}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template29);
            // jsp code [from=(240,49);to=(240,60)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GUBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template30);
            // jsp code [from=(241,49);to=(241,59)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template31);
            // jsp code [from=(242,49);to=(242,60)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.NOTES}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template32);
            // jsp code [from=(243,48);to=(243,62)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.REQ_DATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template33);
            // jsp code [from=(244,52);to=(244,64)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.REQ_CK}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template34);
            // jsp code [from=(245,48);to=(245,60)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TODATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template35);
            // jsp code [from=(246,69);to=(246,77)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template36);

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
  private final static String _jspx_template2 = "\r\n<script language=\"javascript\" src=\"/js/privateFunction.js\"></script>";
  private final static String _jspx_template3 = "\r\n";
  private final static String _jspx_template4 = "\r\n";
  private final static String _jspx_template5 = "  \r\n";
  private final static String _jspx_template6 = "  \r\n";
  private final static String _jspx_template7 = "  \r\n";
  private final static String _jspx_template8 = "\r\n";
  private final static String _jspx_template9 = "\r\n";
  private final static String _jspx_template10 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script> \r\n<script language='JavaScript' src='/js/Check_inputbox.js'></script>\r\n\r\n<script type=\"text/javascript\">\r\n//<![CDATA[\r\n\r\n\tfunction\tPage(page)\r\n\t{\r\n\t\tif(page\t==\t\"\")\r\n\t\t\treturn;\r\n\t\t\r\n\t\tvar form = document.form;\r\n\t\tvar\tLISTVIEW\t= document.getElementById(\"LISTVIEW\");\r\n\t\tLISTVIEW.value\t= \"1\";\r\n\r\n\t\tform.currentPage.value\t= page;\r\n\r\n\t\tform.action = \"search.do\";\r\n\t\tform.submit();\r\n\t}\r\n\t\r\n\tfunction\tSearch()\r\n\t{\r\n\t\tvar form \t\t= document.form;\r\n\t\tvar\tLISTVIEW\t= document.getElementById(\"LISTVIEW\");\r\n\t\tLISTVIEW.value\t= \"1\";\r\n\t\t\r\n\t\tvar\tdate\t= DateCheck();\r\n\t\tif(date\t== true)\r\n\t\t\treturn;\r\n\t\t\r\n\t\tform.currentPage.value\t= 1;\r\n\r\n\t\tform.action = \"search.do\";\r\n\t\tform.submit();\r\n\t}\r\n\r\n\tfunction\tView(adminno)\r\n\t{\r\n\t\tvar form = document.form;\r\n\r\n\t\tform.action = \"view.do?ADMIN_NO=\" + adminno;\r\n\t\tform.submit();\r\n\t}\r\n\r\n\tfunction\tRegister()\r\n\t{\r\n\t\tvar form = document.form;\r\n\r\n\t\tform.action = \"register.do\";\r\n\t\tform.submit();\r\n\t}\r\n\r\n\tfunction\tDateCheck()\r\n\t{\r\n\t\tvar form = document.form;\r\n\r\n\t\tif(form.GIGAN2.value\t== \"\")\r\n\t\t\treturn\tfalse;\r\n\r\n\t\tif(form.GIGAN1.value\t> form.GIGAN2.value)\r\n\t\t{\r\n\t\t\talert(\"접수기간을 다시 입력하여 주십시요.\");\r\n\t\t\treturn\ttrue;\r\n\t\t}\r\n\r\n\t\treturn\tfalse;\r\n\t}\r\n\r\n\tfunction\tInit()\r\n\t{\r\n\t\tvar form \t= document.form;\r\n\t\tvar\tLISTVIEW\t= document.getElementById(\"LISTVIEW\");\r\n\r\n\t\tif(form.LISTVIEW.value == \"0\")\r\n\t\t{\r\n\t\t\tLISTVIEW.value\t= \"1\";\r\n\t\r\n\t\t\tform.action = \"search.do\";\r\n\t\t\tform.submit();\r\n\t\t}\r\n\t}\r\n\r\n\tfunction onCheck(){\r\n\t\tvar form \t= document.form;\r\n\t\t\r\n\t\tif(form.MIN_REQNO.value.length == '18'){\r\n\t\t\tform.MIN_NAME.focus();\r\n\t\t}\r\n\t}\r\n\t\r\n//]]>\r\n</script>\r\n\r\n<body>\r\n<form name=\"form\" method=\"post\" action=\"search.jsp\">\r\n<input type=\"hidden\" id=\"currentPage\" name=\"currentPage\" value=\"";
  private final static String _jspx_template11 = "\">\r\n<input type=\"hidden\" id=\"LISTVIEW\" name=\"LISTVIEW\" value=\"";
  // jsp code [from=(127,6);to=(143,2)]
  private final static String _jspx_template12 = "\">\r\n\r\n<table width=\"800\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n  <tr>\r\n    <td height=\"43\"><img src=\"/img/sub1_cont1_title.gif\" width=\"800\" height=\"43\"></td>\r\n  </tr>\r\n  <tr>\r\n    <td align=\"center\"><table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t";
  private final static String _jspx_template13 = "\r\n      <tr>\r\n        <td height=\"1\" bgcolor=\"eaeaea\"></td>\r\n      </tr>\r\n      <tr>\r\n        <td height=\"14\"></td>\r\n      </tr>\r\n      \r\n      <tr>\r\n        <td align=\"left\"><table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n          <tr>\r\n            <td height=\"22\" background=\"/img/tab_line_blue.gif\"><table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                <tr>\r\n                  <td><img src=\"/img/sub_petition_title1.gif\" width=\"110\" height=\"22\"></td>\r\n                </tr>\r\n            </table></td>\r\n          </tr>\r\n          \r\n          <tr>\r\n            <td class=\"contborder_blue\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                <tr>\r\n                  <td><table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n                  \r\n                      <tr>\r\n                        <td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">접수기간</td>\r\n                        <td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n                            <tr>\r\n                              <td><input id=\"GIGAN1\" name=\"GIGAN1\" type=\"text\" class=\"input_form1\" style=\"width:80px\" value=\"";
  private final static String _jspx_template14 = "\" readonly></td>\r\n                              <td><a><img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, document.getElementById('GIGAN1'), 'yyyymmdd');\" style=\"CURSOR: Hand;\"></a></td>\r\n                              <td width=\"16\" align=\"center\">~</td>\r\n                              <td><input id=\"GIGAN2\" name=\"GIGAN2\" type=\"text\" class=\"input_form1\" style=\"width:80px\" value=\"";
  private final static String _jspx_template15 = "\" readonly></td>\r\n                              <td><a><img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, document.getElementById('GIGAN2'), 'yyyymmdd');\" style=\"CURSOR: Hand;\"></a></td>\r\n                            </tr>\r\n                        </table>\r\n                        </td>\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">민원인명</td>\r\n                        <td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n                        \t<input id=\"MIN_NAME\" name=\"MIN_NAME\" type=\"text\" class=\"input_form1\" style=\"width:200px\" value=\"";
  private final static String _jspx_template16 = "\" onkeypress=\"if(event.keyCode == 13) Search();\">\r\n                        </td>\r\n<!--  \r\n                        <td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">접수/처리확인</td>\r\n                        <td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t                    <tr>\r\n\t                        <td><select name=\"MIN_CHECK\" class=\"related\" style=\"width:90px\">";
  private final static String _jspx_template17 = "</select></td>\r\n\t                        <td bgcolor=\"eaeaea\" class=\"table_bl_left\"><select name=\"MIN_PROCESS\" class=\"related\" style=\"width:80px\">";
  private final static String _jspx_template18 = "</select></td>\r\n\t                    </tr>\r\n                        </table></td>\r\n-->\r\n                      </tr>\r\n<!--  \r\n                      <tr>\r\n                        <td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">접수번호</td>\r\n                        <td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n                        \t<input name=\"MIN_REQNO\" type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"";
  private final static String _jspx_template19 = "\" style=\"ime-mode:disabled\" onkeypress=\"javascript:onCheck();\" maxlength=\"18\">\r\n                        </td>\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">민원인명</td>\r\n                        <td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n                        \t<input name=\"MIN_NAME\" type=\"text\" class=\"input_form1\" style=\"width:200px\" value=\"";
  private final static String _jspx_template20 = "\" onkeypress=\"if(event.keyCode == 13) Search();\">\r\n                        </td>\r\n                      </tr>\r\n-->                      \r\n                  </table></td>\r\n                </tr>\r\n                <tr>\r\n                  <td height=\"32\" align=\"right\"><a href=\"javascript:Search();\"><img src=\"/img/inquiry_icon2.gif\" alt=\"조회\" width=\"56\" height=\"18\" border=\"0\"></a></td>\r\n                </tr>\r\n\r\n                <tr>\r\n                  <td height=\"1\" bgcolor=\"#EAEAEA\"></td>\r\n                </tr>\r\n                <tr>\r\n                  <td height=\"34\" class=\"sub_stan\">전체건수 : <span class=\"sub_stan_blue\">";
  private final static String _jspx_template21 = "</span> 건 </td>\r\n                </tr>\r\n                <tr>\r\n                  <td><table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n                      <tr>\r\n                        <td width=\"4%\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">번호</td>\r\n                        <td width=\"10%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">접수번호</td>\r\n                        <!--<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">접수자</td>  -->\r\n                        <td width=\"10%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">담당자</td>\r\n                        <td width=\"10%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">민원구분</td>\r\n                        <td width=\"15%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">민원인</td>\r\n                        <td width=\"21%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">민원요지</td>\r\n                        <td width=\"9%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">접수일자</td>\r\n                        <td width=\"5%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">확인</td> \r\n                        <td width=\"9%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">처리일자</td>\r\n                        <td width=\"7%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">처리</td>\r\n                      </tr>\r\n\r\n\t\t\t\t\t";
  private final static String _jspx_template22 = "\r\n\t\t\t\t\t\t";
  private final static String _jspx_template23 = "\r\n\t\t                      ";
  private final static String _jspx_template24 = "\r\n\t\t\t                     <tr onClick=\"javascript:View('";
  private final static String _jspx_template25 = "')\" onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\" style=\"CURSOR: Hand;\" >\r\n\t\t\t                     \t<td width=\"4%\" height=\"26\" align=\"center\">";
  private final static String _jspx_template26 = "</td>\r\n\t\t        \t\t\t\t\t<td width=\"10%\" align=\"center\">";
  private final static String _jspx_template27 = "</td>\r\n\t\t        \t\t\t\t\t<!--<td align=\"center\">";
  private final static String _jspx_template28 = "</td>-->\r\n\t\t        \t\t\t\t\t<td width=\"10%\" align=\"center\">";
  private final static String _jspx_template29 = "</td>\r\n\t\t        \t\t\t\t\t<td width=\"10%\" align=\"center\">";
  private final static String _jspx_template30 = "</td>\r\n\t\t        \t\t\t\t\t<td width=\"15%\" align=\"center\">";
  private final static String _jspx_template31 = "</td>\r\n\t\t        \t\t\t\t\t<td width=\"21%\" align=\"center\">";
  private final static String _jspx_template32 = "</td>\r\n\t\t        \t\t\t\t\t<td width=\"9%\" align=\"center\">";
  private final static String _jspx_template33 = "</td>\r\n     \t        \t\t\t\t\t<td width=\"5%\" align=\"center\">";
  private final static String _jspx_template34 = "</td> \r\n\t\t        \t\t\t\t\t<td width=\"9%\" align=\"center\">";
  private final static String _jspx_template35 = "</td>\r\n\t\t        \t\t\t\t\t<td width=\"7%\" align=\"center\" class=\"sub_table_r\" >";
  private final static String _jspx_template36 = "</td>\r\n\t\t\t                     </tr>\r\n\t\t\t\t\t\t\t ";
  private final static String _jspx_template37 = "\r\n\t\t\t\t\t\t";
  private final static String _jspx_template38 = "\r\n\t\t\t\t\t\t";
  private final static String _jspx_template39 = "\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td align=\"center\" class=\"sub_table\" colspan=\"11\" height=\"85\">조회버튼을 클릭하면<P/>새올데이터를 출력합니다</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t";
  private final static String _jspx_template40 = "\r\n\t\t\t\t\t\t";
  private final static String _jspx_template41 = "\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td align=\"center\" class=\"sub_table\" colspan=\"11\" height=\"85\">검색된 내용이 없습니다</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t";
  private final static String _jspx_template42 = "\r\n\t\t\t\t\t ";
  private final static String _jspx_template43 = "\r\n\t\t\t\t\t \r\n\t\t\t\t\t </table>\r\n\t\t\t\t\t </td>\r\n                </tr>\r\n\r\n                <tr>\r\n                  <td height=\"30\" align=\"center\"><table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                      <tr>\r\n\t\t\t\t\t\t";
  private final static String _jspx_template44 = "\r\n                      </tr>\r\n                  </table></td>\r\n                </tr>\r\n\r\n            </table></td>\r\n          </tr>\r\n          <tr>\r\n            <td height=\"40\" align=\"right\">\r\n          \t  \t<a href=\"javascript:Register()\"><img src=\"/img/newregi_icon.gif\" alt=\"신규등록\" width=\"74\" height=\"22\" border=\"0\"></a>\r\n           \t\t<!-- \r\n           \t\t<a href=\"#\"><img src=\"../../../img/excel_icon.gif\" alt=\"EXCEL 변환\" border=\"0\"></a>\r\n           \t\t-->\r\n            </td>\r\n          </tr>\r\n        </table></td>\r\n      </tr>\r\n\r\n  \t<tr><td>\r\n  \t</td>\r\n  \t</tr>\r\n</table></td>         \r\n\r\n\r\n</body>\r\n</html>";
}
