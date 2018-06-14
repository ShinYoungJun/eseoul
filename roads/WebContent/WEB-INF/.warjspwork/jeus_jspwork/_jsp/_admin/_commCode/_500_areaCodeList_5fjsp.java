package jeus_jspwork._jsp._admin._commCode;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_areaCodeList_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(140,39);to=(140,45)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${guName}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(145,39);to=(145,45)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${hdName}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(159,94);to=(159,104)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${totalCount}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template21);
      // jsp code [from=(200,27);to=(200,44)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${strPageDivideForm}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);

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
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${areaCodelist}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("areaCode");
    _jspx_th_c_forEach_0.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template14);
            // jsp code [from=(180,43);to=(180,57)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${areaCode.SI_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template15);
            // jsp code [from=(181,31);to=(181,45)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${areaCode.SI_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template16);
            // jsp code [from=(182,31);to=(182,45)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${areaCode.GU_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template17);
            // jsp code [from=(183,31);to=(183,45)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${areaCode.GU_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template18);
            // jsp code [from=(184,31);to=(184,45)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${areaCode.HJ_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template19);
            // jsp code [from=(185,31);to=(185,45)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${areaCode.HJ_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template20);

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
  private final static String _jspx_template9 = "\r\n\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody { \r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script language=\"javascript\" src=\"/js/common.js\"></script> \r\n<script type=\"text/javascript\">\r\n//<![CDATA[\r\n\t           \r\n\tfunction  reSearch()\r\n\t{\r\n\t\tvar w = document.listForm;\r\n\t\tw.action = \"/admin/commCode/areaCode.do\";\t\t\r\n\t\tw.submit();\t\r\n\t}\r\n\r\n\tfunction initPage(){\r\n\t\r\n\t\tif(document.getElementById(\"fromDate\").value == \"\")\r\n\t\t\tdocument.getElementById(\"fromDate\").value = strToday();\r\n\t\t\t\r\n\t\tif(document.getElementById(\"toDate\").value == \"\")\r\n\t\t\tdocument.getElementById(\"toDate\").value = strToday();\r\n\t}\r\n\r\n\t/*\r\n\t *\t통합검색 key down function (엔터키가 입력되면 검색함수 호출)\r\n\t */\r\n\tfunction checkKeySearch(){\r\n\t\tif(event.keyCode == KEY_ENTER)\r\n\t\t\treSearch();\r\n\t}\t\r\n\r\n\t\r\n//]]>\r\n</script>\r\n\r\n<body>\r\n<form name=\"listForm\">\r\n<table width=\"800\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t<tr>\r\n\t\t<td height=\"43\"><img src=\"/img/admin_cont3_title.gif\"\r\n\t\t\twidth=\"800\" height=\"43\"></td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td align=\"center\">\r\n\t\t<table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n<!--\t\t\t<tr>\r\n\t\t\t\t<td height=\"40\" align=\"right\">\r\n\t\t\t\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"8\"></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td><a href=\"#\"><img src=\"/img/help_icon.gif\" alt=\"도움말\"\r\n\t\t\t\t\t\t\twidth=\"65\" height=\"18\" border=\"0\"></a></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n-->\t\t\t<tr>\r\n\t\t\t\t<td height=\"1\" bgcolor=\"eaeaea\"></td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"14\"></td>\r\n\t\t\t</tr>\r\n\t\t</table>\r\n\r\n\t\t<table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t<tr>\r\n\t\t\t\t<td align=\"left\" height=\"22\" background=\"/img/tab_line_blue.gif\">\r\n\t\t\t\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td width=\"111\"><a href=\"#\"><img\r\n\t\t\t\t\t\t\tsrc=\"/img/sub_admin_title4_on.gif\" alt=\"지역코드\" width=\"110\"\r\n\t\t\t\t\t\t\theight=\"22\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t<td  width=\"111\"><a href=\"/admin/commCode/orgCode.do\"><img\r\n\t\t\t\t\t\t\tsrc=\"/img/sub_admin_title5_off.gif\" alt=\"부서코드\" width=\"110\"\r\n\t\t\t\t\t\t\theight=\"22\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t<td width=\"111\"><a href=\"/admin/commCode/purposeCode.do\"><img\r\n\t\t\t\t\t\t\tsrc=\"/img/sub_admin_title6_off.gif\" alt=\"점용목적코드\" width=\"110\"\r\n\t\t\t\t\t\t\theight=\"22\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t<td width=\"111\"><a href=\"/admin/commCode/taxCode.do\"><img\r\n\t\t\t\t\t\t\tsrc=\"/img/sub_admin_title7_off.gif\" alt=\"과세구분코드\" width=\"110\"\r\n\t\t\t\t\t\t\theight=\"22\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t<!--  //********** BEGIN_현진_20120315 -->\r\n\t\t\t\t\t\t<!-- \r\n\t\t\t\t\t\t<td width=\"111\"><a href=\"/jsp/admin/commCode/zipCodeList.jsp\"><img\r\n\t\t\t\t\t\t\tsrc=\"/img/sub_admin_title8_off.gif\" alt=\"우편번호코드\" width=\"110\"\r\n\t\t\t\t\t\t\theight=\"22\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t-->\r\n\t\t\t\t\t\t<td width=\"111\"><a href=\"/admin/commCode/seal.do\"><img\r\n\t\t\t\t\t\t\tsrc=\"/img/sub_admin_seal_off.gif\" alt=\"직인등록\" width=\"110\"\t\t\t\t\t\t\t         \r\n\t\t\t\t\t\t\theight=\"22\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t<!--   //********** END_현진_20120315 -->\r\n\t\t\t\t\t\t\r\n\t\t\t\t\t\t<td width=\"111\"><a href=\"/admin/commCode/jojungCode.do\"><img\r\n\t\t\t\t\t\t\tsrc=\"/img/sub_admin_title9_off.gif\" alt=\"조정계수\" width=\"110\"\r\n\t\t\t\t\t\t\theight=\"22\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t<td width=\"111\"><a href=\"/admin/commCode/gradeCode.do\"><img\r\n\t\t\t\t\t\t\tsrc=\"/img/sub_admin_title12_off.gif\" alt=\"등급코드\" width=\"110\"\r\n\t\t\t\t\t\t\theight=\"22\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t<td width=\"111\"><a href=\"/admin/commCode/officeCode.do\"><img\r\n\t\t\t\t\t\t\tsrc=\"/img/sub_admin_title13_off.gif\" alt=\"업체코드\" width=\"110\"\r\n\t\t\t\t\t\t\theight=\"22\" border=\"0\"></a></td>\t\t\t\t\t\t\t\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td align=\"center\" class=\"contborder_blue\">\r\n\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td align=\"left\">\r\n\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\"\r\n\t\t\t\t\t\t\tstyle=\"border-collapse:collapse;\" cel";
  private final static String _jspx_template10 = "lpadding=\"0\" cellspacing=\"0\"\r\n\t\t\t\t\t\t\tclass=\"sub_table\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td width=\"15%\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\"\r\n\t\t\t\t\t\t\t\t\tclass=\"sub_table_b\">시군구명</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input\r\n\t\t\t\t\t\t\t\t\tname=\"guName\" type=\"text\" class=\"input_form1\"\r\n\t\t\t\t\t\t\t\t\tstyle=\"width:160px\" value=\"";
  private final static String _jspx_template11 = "\" onKeyDown=\"javascript:checkKeySearch();\"></td>\r\n\t\t\t\t\t\t\t\t<td width=\"15%\" align=\"center\" bgcolor=\"e5eff8\"\r\n\t\t\t\t\t\t\t\t\tclass=\"sub_table_b\">읍면동명</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input\r\n\t\t\t\t\t\t\t\t\tname=\"hdName\" type=\"text\" class=\"input_form1\"\r\n\t\t\t\t\t\t\t\t\tstyle=\"width:160px\" value=\"";
  private final static String _jspx_template12 = "\" onKeyDown=\"javascript:checkKeySearch();\"></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"40\" align=\"right\"><a href=\"#\"><img\r\n\t\t\t\t\t\t\tsrc=\"/img/inquiry_icon2.gif\" alt=\"조회\" width=\"56\" height=\"18\"\r\n\t\t\t\t\t\t\tborder=\"0\" onClick=\"javascript:reSearch();\"></a></td>\r\n\t\t\t\t\t</tr> \r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"1\" bgcolor=\"#EAEAEA\"></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t     <td height=\"34\" class=\"sub_stan\" align=\"left\">전체건수 : <span class=\"sub_stan_blue\">";
  private final static String _jspx_template13 = "</span> 건 </td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td align=\"left\">\r\n\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\"\r\n\t\t\t\t\t\t\tstyle=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"\r\n\t\t\t\t\t\t\tclass=\"sub_table\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"28\" align=\"center\" bgcolor=\"e5eff8\"\r\n\t\t\t\t\t\t\t\t\tclass=\"sub_table_b\">시도코드</td>\r\n\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">시도명</td>\r\n\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">시군구코드</td>\r\n\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">시군구명</td>\r\n\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">읍면동코드</td>\r\n\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">읍면동명</td>\r\n\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">생성일자</td>\r\n\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">말소일자</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template14 = "\r\n\t\t\t\t\t\t\t\t <tr onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\">\r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\">";
  private final static String _jspx_template15 = "</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template16 = "</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template17 = "</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template18 = "</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template19 = "</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template20 = "</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\">-</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\">-</td>\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template21 = "\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"40\" align=\"center\">\r\n\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td align=\"center\">\r\n\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<!-- 페이징시작 -->";
  private final static String _jspx_template22 = "<!-- 페이징끝 -->\t\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\r\n\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n</table>\r\n</form>\r\n</body>\r\n</html>\r\n\r\n";
}
