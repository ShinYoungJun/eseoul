package jeus_jspwork._jsp._admin._commCode;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_purposeCodeList_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      out.write(_jspx_template10);
      // jsp code [from=(160,14);to=(160,21)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(163,78);to=(163,86)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${codeName}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(175,54);to=(175,62)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${listSize}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template20);
      // jsp code [from=(204,21);to=(204,38)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${purposeIndex.CODE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(206,61);to=(206,81)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${purposeIndex.SORT_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(222,39);to=(222,57)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${purposeIndex.YOYUL}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(229,39);to=(229,57)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${purposeIndex.GIGAN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // jsp code [from=(236,38);to=(236,57)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${purposeIndex.DANWII}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);
      // jsp code [from=(240,38);to=(240,56)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${purposeIndex.MOMEY}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template26);
      // jsp code [from=(277,50);to=(277,57)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);

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
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${purposeCodeList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("purposeCode");
    _jspx_th_c_forEach_0.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template14);
            // jsp code [from=(179,105);to=(179,121)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${purposeCode.CODE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template15);
            // jsp code [from=(180,90);to=(180,99)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${idx.count}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template16);
            // jsp code [from=(180,105);to=(180,125)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${purposeCode.CLASS_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template17);
            // jsp code [from=(180,132);to=(180,151)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${purposeCode.SORT_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template18);
            // jsp code [from=(180,160);to=(180,179)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${purposeCode.KIND_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template19);

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
  private final static String _jspx_template1 = "\r\n";
  private final static String _jspx_template2 = "  \r\n";
  private final static String _jspx_template3 = "  \r\n";
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "\r\n";
  private final static String _jspx_template6 = "\r\n";
  private final static String _jspx_template7 = "\r\n";
  private final static String _jspx_template8 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('사용자의 사용시간이 종료되었습니다. 다시 접속 해주시기 바랍니다.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template9 = "\r\n\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script language=\"javascript\" src=\"/js/common.js\"></script> \r\n<script type=\"text/javascript\">\r\n//<![CDATA[\r\n\t           \r\n\tfunction  reSearch()\r\n\t{\r\n\t\tvar w = document.listForm;\r\n\t\tw.excel.value = \"\";\r\n\t\tw.action = \"/admin/commCode/purposeCode.do\";\t\r\n\t\tw.submit();\t\r\n\t}\r\n\t\r\n\tfunction  excel_reSearch()\r\n\t{\r\n\t\tvar w = document.listForm;\r\n\t\r\n\t\tw.excel.value = \"Y\";\r\n\t\tw.action = \"/admin/commCode/purposeCode.do\";\t\t\r\n\t\tw.submit();\t\r\n\t}\r\n\t\r\n\tfunction  fn_detailInfo(obj)\r\n\t{\r\n\t\tvar w = document.listForm;\r\n\t\tdocument.getElementById(\"index\").value = obj-1;\t\r\n\t\tw.submit();\t\r\n\t}\r\n\t\r\n\t//숫자만 입력\r\n\tfunction onlyNumberInput()\r\n\t{\t\r\n\t\tvar code = window.event.keyCode;\r\n\t\r\n\t \tif ((code > 34 && code < 41) || (code > 47 && code < 58) || (code > 95 && code < 106) || code == 8 || code == 9 || code == 13 || code == 46)\r\n\t \t{\r\n\t\t  \twindow.event.returnValue = true;\r\n\t\t\treturn;\r\n\t \t}else {\t \r\n\t \t\twindow.event.returnValue = false;\r\n\t \t\treturn;\r\n \t \t}\r\n\t}\r\n\r\n\t/*\r\n\t *\t통합검색 key down function (엔터키가 입력되면 검색함수 호출)\r\n\t */\r\n\tfunction checkKeySearch(){\r\n\t\tif(event.keyCode == KEY_ENTER)\r\n\t\t\treSearch();\r\n\t}\t\r\n\t\r\n//]]>\r\n</script>\r\n\r\n<body>\r\n<form name=\"listForm\">\r\n<input type=\"hidden\" name=\"excel\" value=\"\">\r\n<input name=\"index\" id=\"index\" type=\"hidden\" >\r\n<table width=\"800\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t<tr>\r\n\t\t<td height=\"43\"><img src=\"/img/admin_cont3_title.gif\"\r\n\t\t\twidth=\"800\" height=\"43\"></td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td align=\"center\">\r\n\t\t<table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n<!--\t\t\t<tr>\r\n\t\t\t\t<td height=\"40\" align=\"right\">\r\n\t\t\t\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"8\"></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td><a href=\"#\"><img src=\"/img/help_icon.gif\" alt=\"도움말\"\r\n\t\t\t\t\t\t\twidth=\"65\" height=\"18\" border=\"0\"></a></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n-->\t\t\t<tr>\r\n\t\t\t\t<td height=\"1\" bgcolor=\"eaeaea\"></td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"14\"></td>\r\n\t\t\t</tr>\r\n\t\t</table>\r\n\r\n\t\t<table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t<tr>\r\n\t\t\t\t<td align=\"left\" height=\"22\" background=\"/img/tab_line_blue.gif\">\r\n\t\t\t\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td width=\"111\"><a href=\"/admin/commCode/areaCode.do\"><img\r\n\t\t\t\t\t\t\tsrc=\"/img/sub_admin_title4_off.gif\" alt=\"지역코드\" width=\"110\"\r\n\t\t\t\t\t\t\theight=\"22\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t<td  width=\"111\"><a href=\"/admin/commCode/orgCode.do\"><img\r\n\t\t\t\t\t\t\tsrc=\"/img/sub_admin_title5_off.gif\" alt=\"부서코드\" width=\"110\"\r\n\t\t\t\t\t\t\theight=\"22\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t<td width=\"111\"><a href=\"#\"><img\r\n\t\t\t\t\t\t\tsrc=\"/img/sub_admin_title6_on.gif\" alt=\"점용목적코드\" width=\"110\"\r\n\t\t\t\t\t\t\theight=\"22\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t<td width=\"111\"><a href=\"/admin/commCode/taxCode.do\"><img\r\n\t\t\t\t\t\t\tsrc=\"/img/sub_admin_title7_off.gif\" alt=\"과세구분코드\" width=\"110\"\r\n\t\t\t\t\t\t\theight=\"22\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t<td width=\"111\"><a href=\"/jsp/admin/commCode/zipCodeList.jsp\"><img\r\n\t\t\t\t\t\t\tsrc=\"/img/sub_admin_title8_off.gif\" alt=\"우편번호코드\" width=\"110\"\r\n\t\t\t\t\t\t\theight=\"22\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t<td width=\"111\"><a href=\"/admin/commCode/jojungCode.do\"><img\r\n\t\t\t\t\t\t\tsrc=\"/img/sub_admin_title9_off.gif\" alt=\"조정계수\" width=\"110\"\r\n\t\t\t\t\t\t\theight=\"22\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t<td width=\"111\"><a href=\"/admin/commCode/gradeCode.do\"><img\r\n\t\t\t\t\t\t\tsrc=\"/img/sub_admin_title12_off.gif\" alt=\"등급코드\" width=\"110\"\r\n\t\t\t\t\t\t\theight=\"22\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t<td width=\"111\"><a href=\"/admin/commCode/officeCode.do\"><img\r\n\t\t\t\t\t\t\tsrc=\"/img/sub_admin_title13_off.gif\" alt=\"업체코드\" width=\"110\"\r\n\t\t\t\t\t\t\theight=\"22\" border=\"0\"></a></td>\t\t\t\t\t\t\t\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td align=\"left\" class=\"contborder_blue\">\r\n\t\t\t\t";
  private final static String _jspx_template10 = "<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td width=\"48%\" valign=\"top\">\r\n\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\"\r\n\t\t\t\t\t\t\tstyle=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"\r\n\t\t\t\t\t\t\tclass=\"sub_table\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"35\" colspan=\"2\" bgcolor=\"#FFFFFF\"\r\n\t\t\t\t\t\t\t\t\tclass=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\"\r\n\t\t\t\t\t\t\t\t\tclass=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"72\"><select name=\"section\" class=\"related\"\r\n\t\t\t\t\t\t\t\t\t\t\tstyle=\"width:70px\">\r\n\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template11 = "\r\n\t\t\t\t\t\t\t\t\t\t</select></td>\r\n\t\t\t\t\t\t\t\t\t\t<td><input name=\"codeName\" type=\"text\"  \r\n\t\t\t\t\t\t\t\t\t\t\tclass=\"input_form1\" style=\"width:70px;IME-MODE:disabled\" value=\"";
  private final static String _jspx_template12 = "\" onKeyDown=\"javascript:checkKeySearch();onlyNumberInput();\" ></td>\r\n\t\t\t\t\t\t\t\t\t\t<td><a href=\"#\"><img src=\"/img/inquiry_icon2.gif\"\r\n\t\t\t\t\t\t\t\t\t\t\talt=\"조회\" width=\"56\" height=\"18\" border=\"0\" onClick=\"javascript:reSearch();\"></a></td>\r\n\t\t\t\t\t\t\t\t\t</tr>      \r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>             \r\n\t\t\t\t\t\t\t\t<td width=\"20%\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\"\r\n\t\t\t\t\t\t\t\t\tclass=\"sub_table_b\">코드ID</td>\r\n\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">코드명</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<input name=\"listSize\" id=\"listSize\" value=\"";
  private final static String _jspx_template13 = "\" type=\"hidden\">\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template14 = "\r\n\t\t\t\t\t\t\t\t <tr onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\">\r\n\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t<td height=\"50\" align=\"center\"><a href=\"#\" class=\"inqu\" onClick=\"javascript:fn_detailInfo()\">";
  private final static String _jspx_template15 = "</a></td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\"><a href=\"#\" class=\"inqu\" onClick=\"javascript:fn_detailInfo(";
  private final static String _jspx_template16 = ")\">";
  private final static String _jspx_template17 = "<br>";
  private final static String _jspx_template18 = " <br> ";
  private final static String _jspx_template19 = "</a></td>\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template20 = "\r\n\r\n\t\t\t\t\t\t</table>\r\n\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t<td width=\"4%\"></td>\r\n\t\t\t\t\t\t<td width=\"48%\" valign=\"top\">\r\n\t\t\t\t\t\t\r\n\t\t\t\t\t\t<form name=\"regForm\">\r\n\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\"\r\n\t\t\t\t\t\t\tstyle=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"\r\n\t\t\t\t\t\t\tclass=\"sub_table\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td width=\"20%\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\"\r\n\t\t\t\t\t\t\t\t\tclass=\"sub_table_b\">코드</td>\r\n\t\t\t\t\t\t\t\t<td height=\"28\" colspan=\"3\" bgcolor=\"eaeaea\"\r\n\t\t\t\t\t\t\t\t\tclass=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\"\r\n\t\t\t\t\t\t\t\t\tclass=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"40\"><input name=\"code\"\r\n\t\t\t\t\t\t\t\t\t\t\ttype=\"text\" class=\"input_form1\" style=\"width:30px;IME-MODE:disabled\"\r\n\t\t\t\t\t\t\t\t\t\t\tvalue=\"";
  private final static String _jspx_template21 = "\" onKeyDown=\"onlyNumberInput();\"></td>\r\n\t\t\t\t\t\t\t\t\t\t<td><input name=\"codeName\" type=\"text\"\r\n\t\t\t\t\t\t\t\t\t\t\tclass=\"input_form1\" style=\"width:240px\" value=\"";
  private final static String _jspx_template22 = "\"></td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"32\" colspan=\"4\" bgcolor=\"#FFFFFF\"\r\n\t\t\t\t\t\t\t\t\tclass=\"table_bl_left\"><a href=\"#\"><img\r\n\t\t\t\t\t\t\t\t\tsrc=\"/img/admin_tab1_on.gif\" alt=\"코드일반정보\" width=\"97\"\r\n\t\t\t\t\t\t\t\t\theight=\"20\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"#F3F8FC\"\r\n\t\t\t\t\t\t\t\t\tclass=\"sub_table_b\">요율</td>\r\n\t\t\t\t\t\t\t\t<td colspan=\"3\" bgcolor=\"f2f2f2\" class=\"table_bl_left\"><input\r\n\t\t\t\t\t\t\t\t\tname=\"yoyul\" id=\"yoyul\" type=\"text\" class=\"input_form1\"\r\n\t\t\t\t\t\t\t\t\tstyle=\"width:120px\" value=\"";
  private final static String _jspx_template23 = "\"></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"#F3F8FC\"\r\n\t\t\t\t\t\t\t\t\tclass=\"sub_table_b\">기간</td>\r\n\t\t\t\t\t\t\t\t<td colspan=\"3\" bgcolor=\"f2f2f2\" class=\"table_bl_left\"><input\r\n\t\t\t\t\t\t\t\t\tname=\"textfield2222323223223\" type=\"text\" class=\"input_form1\"\r\n\t\t\t\t\t\t\t\t\tstyle=\"width:120px\" value=\"";
  private final static String _jspx_template24 = "\"></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"#F3F8FC\"\r\n\t\t\t\t\t\t\t\t\tclass=\"sub_table_b\">단위</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"f2f2f2\" class=\"table_bl_left\"><input\r\n\t\t\t\t\t\t\t\t\tname=\"textfield2222323223224\" type=\"text\" class=\"input_form1\"\r\n\t\t\t\t\t\t\t\t\tstyle=\"width:50px\" value=\"";
  private final static String _jspx_template25 = "\"></td>\r\n\t\t\t\t\t\t\t\t<td width=\"20%\" align=\"center\" bgcolor=\"#F3F8FC\">점용료</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"f2f2f2\" class=\"table_bl_left\"><input\r\n\t\t\t\t\t\t\t\t\tname=\"textfield2222323223225\" type=\"text\" class=\"input_form1\"\r\n\t\t\t\t\t\t\t\t\tstyle=\"width:80px\" value=\"";
  private final static String _jspx_template26 = "\"></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"#F3F8FC\"\r\n\t\t\t\t\t\t\t\t\tclass=\"sub_table_b\">상한가</td>\r\n\t\t\t\t\t\t\t\t<td colspan=\"3\" bgcolor=\"f2f2f2\" class=\"table_bl_left\"><input\r\n\t\t\t\t\t\t\t\t\tname=\"textfield22223232232222\" type=\"text\" class=\"input_form1\"\r\n\t\t\t\t\t\t\t\t\tstyle=\"width:120px\" ></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"70\" align=\"center\" bgcolor=\"#F3F8FC\"\r\n\t\t\t\t\t\t\t\t\tclass=\"sub_table_b\">감액율</td>\r\n\t\t\t\t\t\t\t\t<td colspan=\"3\" bgcolor=\"f2f2f2\" class=\"table_bl_left\"><textarea\r\n\t\t\t\t\t\t\t\t\tname=\"textfield2222323223228\" rows=\"4\" class=\"input_form1\"\r\n\t\t\t\t\t\t\t\t\tstyle=\"width:280px\" ></textarea></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</form>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\r\n\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"40\" align=\"right\"><!-- <a href=\"#\"><img\r\n\t\t\t\t\tsrc=\"/img/result_icon.gif\" alt=\"결과 출력\" width=\"74\" height=\"22\"\r\n\t\t\t\t\tborder=\"0\"></a>  --> \r\n\t\t\t\t\t<img src=\"/img/excel_icon.gif\"\r\n\t\t\t\t\talt=\"EXCEL 변환\" width=\"94\" height=\"22\" border=\"0\" onclick=\"javascript:excel_reSearch();\" style=\"cursor:hand\"></td>\r\n\t\t\t</tr>\r\n\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n</table>\r\n<script language=\"javascript\">\r\n<!--\r\n\tsetSelectedOption(document.listForm.section, \"";
  private final static String _jspx_template27 = "\");\r\n//-->\r\n</script>\r\n</form>\r\n</body>\r\n</html>\r\n\r\n";
}
