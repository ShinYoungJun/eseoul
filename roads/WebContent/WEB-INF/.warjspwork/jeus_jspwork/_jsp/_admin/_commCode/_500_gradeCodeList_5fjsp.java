package jeus_jspwork._jsp._admin._commCode;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_gradeCodeList_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(176,62);to=(176,71)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${gradeName}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(188,54);to=(188,62)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${listSize}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template20);

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
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${gradeCodelist}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("gradeCode");
    _jspx_th_c_forEach_0.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template13);
            // jsp code [from=(192,103);to=(192,123)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${gradeCode.GRADE_CODE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template14);
            // jsp code [from=(192,129);to=(192,149)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${gradeCode.GRADE_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template15);
            // jsp code [from=(192,156);to=(192,176)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${gradeCode.GRADE_CODE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template16);
            // jsp code [from=(193,91);to=(193,111)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${gradeCode.GRADE_CODE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template17);
            // jsp code [from=(193,117);to=(193,137)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${gradeCode.GRADE_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template18);
            // jsp code [from=(193,144);to=(193,164)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${gradeCode.GRADE_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

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
  private final static String _jspx_template9 = "\r\n\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script language=\"javascript\" src=\"/js/common.js\"></script> \r\n<script type=\"text/javascript\">\r\n//<![CDATA[\r\n\t           \r\n\tfunction  reSearch()\r\n\t{\r\n\t\tvar w = document.listForm;\r\n\t\t\r\n\t\tw.action = \"/admin/commCode/gradeCode.do\";\t\r\n\t\tw.submit();\t\r\n\t}\r\n\t\r\n\tfunction  fn_detailInfo(cd,nm)\r\n\t{\r\n\t\tdocument.getElementById(\"code\").value = cd;\t\r\n\t\tdocument.getElementById(\"codeName\").value = nm;\t\r\n\t}\r\n\t\r\n\tfunction  fn_modifyInfo()\r\n\t{\t\r\n\t\tvar w = document.listForm;\r\n\t\t\r\n\t\tdocument.getElementById(\"modeType\").value = \"edit\";\t\r\n\t\tw.action = \"/admin/commCode/modifyGradeCode.do\";\t\r\n\t\tw.submit();\t\r\n\t}\r\n\t\r\n\tfunction  fn_deleteInfo()\r\n\t{\t\r\n\t\tif(!confirm(\"삭제하시겠습니까?\"))\r\n\t\t\treturn;\r\n\t\t\r\n\t\tvar w = document.listForm;\r\n\t\tw.action = \"/admin/commCode/deleteGradeCode.do\";\r\n\t\tw.submit();\t\r\n\t}\r\n\t\r\n\t//숫자만 입력\r\n\tfunction onlyNumberInput()\r\n\t{\t\r\n\t\tvar code = window.event.keyCode;\r\n\t\r\n\t \tif ((code > 34 && code < 41) || (code > 47 && code < 58) || (code > 95 && code < 106) || code == 8 || code == 9 || code == 13 || code == 46)\r\n\t \t{\r\n\t\t  \twindow.event.returnValue = true;\r\n\t\t\treturn;\r\n\t \t}else {\t \r\n\t \t\twindow.event.returnValue = false;\r\n\t \t\treturn;\r\n \t \t}\r\n\t}\r\n\r\n\t/*\r\n\t *\t통합검색 key down function (엔터키가 입력되면 검색함수 호출)\r\n\t */\r\n\tfunction checkKeySearch()\r\n\t{\r\n\t\tif(event.keyCode == KEY_ENTER)\r\n\t\t\treSearch();\r\n\t}\r\n\t\t\r\n//]]>\r\n</script>\r\n\r\n<body>\r\n<form name=\"listForm\" method=\"post\">\r\n<input name=\"modeType\" id=\"modeType\" type=\"hidden\" >\r\n<table width=\"800\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t<tr>\r\n\t\t<td height=\"43\"><img src=\"/img/admin_cont3_title.gif\"\r\n\t\t\twidth=\"800\" height=\"43\"></td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td align=\"center\">\r\n\t\t<table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n<!--\t\t\t<tr>\r\n\t\t\t\t<td height=\"40\" align=\"right\">\r\n\t\t\t\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"8\"></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td><a href=\"#\"><img src=\"/img/help_icon.gif\" alt=\"도움말\"\r\n\t\t\t\t\t\t\twidth=\"65\" height=\"18\" border=\"0\"></a></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n-->\t\t\t<tr>\r\n\t\t\t\t<td height=\"1\" bgcolor=\"eaeaea\"></td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"14\"></td>\r\n\t\t\t</tr>\r\n\t\t</table>\r\n\r\n\t\t<table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t<tr>\r\n\t\t\t\t<td align=\"left\" height=\"22\" background=\"/img/tab_line_blue.gif\">\r\n\t\t\t\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td width=\"111\"><a href=\"/admin/commCode/areaCode.do\"><img\r\n\t\t\t\t\t\t\tsrc=\"/img/sub_admin_title4_off.gif\" alt=\"지역코드\" width=\"110\"\r\n\t\t\t\t\t\t\theight=\"22\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t<td  width=\"111\"><a href=\"/admin/commCode/orgCode.do\"><img\r\n\t\t\t\t\t\t\tsrc=\"/img/sub_admin_title5_off.gif\" alt=\"부서코드\" width=\"110\"\r\n\t\t\t\t\t\t\theight=\"22\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t<td width=\"111\"><a href=\"/admin/commCode/purposeCode.do\"><img\r\n\t\t\t\t\t\t\tsrc=\"/img/sub_admin_title6_off.gif\" alt=\"점용목적코드\" width=\"110\"\r\n\t\t\t\t\t\t\theight=\"22\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t<td width=\"111\"><a href=\"/admin/commCode/taxCode.do\"><img\r\n\t\t\t\t\t\t\tsrc=\"/img/sub_admin_title7_off.gif\" alt=\"과세구분코드\" width=\"110\"\r\n\t\t\t\t\t\t\theight=\"22\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t<!--  //********** BEGIN_현진_20120315 -->\r\n\t\t\t\t\t\t<!-- \r\n\t\t\t\t\t\t<td width=\"111\"><a href=\"/jsp/admin/commCode/zipCodeList.jsp\"><img\r\n\t\t\t\t\t\t\tsrc=\"/img/sub_admin_title8_off.gif\" alt=\"우편번호코드\" width=\"110\"\r\n\t\t\t\t\t\t\theight=\"22\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t-->\r\n\t\t\t\t\t\t<td width=\"111\"><a href=\"/admin/commCode/seal.do\"><img\r\n\t\t\t\t\t\t\tsrc=\"/img/sub_admin_seal_off.gif\" alt=\"직인등록\" width=\"110\"\t\t\t\t\t\t\t         \r\n\t\t\t\t\t\t\theight=\"22\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t<!--   //********** END_현진_20120315 -->\r\n\t\t\t\t\t\t<td width=\"111\"><a href=\"/admin/commCode/jojungCode.do\"><img\r\n\t\t\t\t\t\t\tsrc=\"/img/sub_admin_title9_off.gif\" alt=\"조정계수\" width=\"1";
  private final static String _jspx_template10 = "10\"\r\n\t\t\t\t\t\t\theight=\"22\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t<td width=\"111\"><a href=\"#\"><img\r\n\t\t\t\t\t\t\tsrc=\"/img/sub_admin_title12_on.gif\" alt=\"등급코드\" width=\"110\"\r\n\t\t\t\t\t\t\theight=\"22\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t<td width=\"111\"><a href=\"/admin/commCode/officeCode.do\"><img\r\n\t\t\t\t\t\t\tsrc=\"/img/sub_admin_title13_off.gif\" alt=\"업체코드\" width=\"110\"\r\n\t\t\t\t\t\t\theight=\"22\" border=\"0\"></a></td>\t\t\t\t\t\t\t\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td align=\"left\" class=\"contborder_blue\">\r\n\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td width=\"48%\" valign=\"top\">\r\n\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\"\r\n\t\t\t\t\t\t\tstyle=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"\r\n\t\t\t\t\t\t\tclass=\"sub_table\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"35\" colspan=\"2\" bgcolor=\"#FFFFFF\"\r\n\t\t\t\t\t\t\t\t\tclass=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\"\r\n\t\t\t\t\t\t\t\t\tclass=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"70\" align=\"center\" class=\"sub_table_b\">등급명</td>\r\n\t\t\t\t\t\t\t\t\t\t<td><input name=\"gradeName\" type=\"text\"  \r\n\t\t\t\t\t\t\t\t\t\t\tclass=\"input_form1\" style=\"width:120px;\" value=\"";
  private final static String _jspx_template11 = "\" onKeyDown=\"javascript:checkKeySearch();\" ></td>\r\n\t\t\t\t\t\t\t\t\t\t<td><a href=\"#\"><img src=\"/img/inquiry_icon2.gif\"\r\n\t\t\t\t\t\t\t\t\t\t\talt=\"조회\" width=\"56\" height=\"18\" border=\"0\" onClick=\"javascript:reSearch();\"></a></td>\r\n\t\t\t\t\t\t\t\t\t</tr>      \r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>             \r\n\t\t\t\t\t\t\t\t<td width=\"20%\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\"\r\n\t\t\t\t\t\t\t\t\tclass=\"sub_table_b\">코드ID</td>\r\n\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">코드명</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<input name=\"listSize\" id=\"listSize\" value=\"";
  private final static String _jspx_template12 = "\" type=\"hidden\">\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template13 = "\r\n\t\t\t\t\t\t\t\t <tr onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\">\r\n\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\"><a href=\"#\" class=\"inqu\" onClick=\"javascript:fn_detailInfo('";
  private final static String _jspx_template14 = "','";
  private final static String _jspx_template15 = "')\">";
  private final static String _jspx_template16 = "</a></td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\"><a href=\"#\" class=\"inqu\" onClick=\"javascript:fn_detailInfo('";
  private final static String _jspx_template17 = "','";
  private final static String _jspx_template18 = "')\">";
  private final static String _jspx_template19 = "</a></td>\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template20 = "\r\n\r\n\t\t\t\t\t\t</table>\r\n\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t<td width=\"4%\"></td>\r\n\t\t\t\t\t\t<td width=\"48%\" valign=\"top\">\r\n\t\t\t\t\t\t\r\n\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\"\r\n\t\t\t\t\t\t\tstyle=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"\r\n\t\t\t\t\t\t\tclass=\"sub_table\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td width=\"20%\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\"\r\n\t\t\t\t\t\t\t\t\tclass=\"sub_table_b\">코드</td>\r\n\t\t\t\t\t\t\t\t<td height=\"28\" colspan=\"3\" bgcolor=\"eaeaea\"\r\n\t\t\t\t\t\t\t\t\tclass=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\"\r\n\t\t\t\t\t\t\t\t\tclass=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"40\"><input name=\"code\"\r\n\t\t\t\t\t\t\t\t\t\t\ttype=\"text\" class=\"input_form1\" style=\"width:30px;IME-MODE:disabled\"\r\n\t\t\t\t\t\t\t\t\t\t\tvalue=\"\" onKeyDown=\"onlyNumberInput();\"></td>\r\n\t\t\t\t\t\t\t\t\t\t<td><input name=\"codeName\" type=\"text\"\r\n\t\t\t\t\t\t\t\t\t\t\tclass=\"input_form1\" style=\"width:230px\" value=\"\"></td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<table align=right>\r\n\t\t\t\t\t\t\t<tr><td height=5></td></tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td><img src=\"/img/save_icon2.gif\"\r\n\t\t\t\t\t\t\t\t\talt=\"저장\" width=\"56\" height=\"18\" border=\"0\" onClick=\"javascript:fn_modifyInfo();\" style=\"cursor:pointer\"></td>\r\n\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t<td><img src=\"/img/del_icon.gif\"\r\n\t\t\t\t\t\t\t\t\talt=\"삭제\" width=\"34\" height=\"18\" border=\"0\" onClick=\"javascript:fn_deleteInfo();\" style=\"cursor:pointer\";></td>\t\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t</table>\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\r\n\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\r\n\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n</table>\r\n\r\n</form>\r\n</body>\r\n</html>\r\n\r\n";
}
