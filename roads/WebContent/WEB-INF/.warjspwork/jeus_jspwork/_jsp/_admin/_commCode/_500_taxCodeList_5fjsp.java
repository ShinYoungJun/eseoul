package jeus_jspwork._jsp._admin._commCode;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_taxCodeList_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(145,57);to=(145,64)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${taxcode}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(150,39);to=(150,46)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${taxname}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template18);
      // jsp code [from=(210,49);to=(210,55)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${taxacc}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);

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
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${taxCodelist}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("taxCode");
    _jspx_th_c_forEach_0.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template13);
            // jsp code [from=(189,43);to=(189,58)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${taxCode.TAXCODE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template14);
            // jsp code [from=(190,16);to=(190,31)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${taxCode.TAXNAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template15);
            // jsp code [from=(191,16);to=(191,31)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${taxCode.TAXPART}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template16);
            // jsp code [from=(192,16);to=(192,32)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${taxCode.TAXGASAN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template17);

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
  private final static String _jspx_template9 = "\r\n\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n<!-- \r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script> \r\n<script language=\"javascript\" src=\"/js/common.js\"></script> \r\n<script type=\"text/javascript\">\r\n//<![CDATA[\r\n\t           \r\n\tfunction  reSearch()\r\n\t{\r\n\t\tvar w = document.listForm;\r\n\t\tw.action = \"/admin/commCode/taxCode.do\";\t\t\r\n\t\tw.submit();\t\r\n\t}\r\n\r\n\t//숫자만 입력\r\n\tfunction onlyNumberInput()\r\n\t{\t\r\n\t\tvar code = window.event.keyCode;\r\n\t\r\n\t \tif ((code > 34 && code < 41) || (code > 47 && code < 58) || (code > 95 && code < 106) || code == 8 || code == 9 || code == 13 || code == 46)\r\n\t \t{\r\n\t\t  \twindow.event.returnValue = true;\r\n\t\t\treturn;\r\n\t \t}else {\t \r\n\t \t\twindow.event.returnValue = false;\r\n\t \t\treturn;\r\n \t \t}\r\n\t}\r\n\t\r\n\t/*\r\n\t *\t통합검색 key down function (엔터키가 입력되면 검색함수 호출)\r\n\t */\r\n\tfunction checkKeySearch(){\r\n\t\tif(event.keyCode == KEY_ENTER)\r\n\t\t\treSearch();\r\n\t}\t\r\n\t\r\n//]]>\r\n</script>\r\n\r\n<body>\r\n<form name=\"listForm\">\r\n<table width=\"800\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t<tr>\r\n\t\t<td height=\"43\"><img src=\"/img/admin_cont3_title.gif\"\r\n\t\t\twidth=\"800\" height=\"43\"></td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td align=\"center\">\r\n\t\t<table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n<!--\t\t\t<tr>\r\n\t\t\t\t<td height=\"40\" align=\"right\">\r\n\t\t\t\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"8\"></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td><a href=\"#\"><img src=\"/img/help_icon.gif\" alt=\"도움말\"\r\n\t\t\t\t\t\t\twidth=\"65\" height=\"18\" border=\"0\"></a></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n-->\t\t\t<tr>\r\n\t\t\t\t<td height=\"1\" bgcolor=\"eaeaea\"></td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"14\"></td>\r\n\t\t\t</tr>\r\n\t\t</table>\r\n\r\n\t\t<table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t<tr>\r\n\t\t\t\t<td align=\"left\" height=\"22\" background=\"/img/tab_line_blue.gif\">\r\n\t\t\t\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td width=\"111\"><a href=\"/admin/commCode/areaCode.do\"><img\r\n\t\t\t\t\t\t\tsrc=\"/img/sub_admin_title4_off.gif\" alt=\"지역코드\" width=\"110\"\r\n\t\t\t\t\t\t\theight=\"22\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t<td  width=\"111\"><a href=\"/admin/commCode/orgCode.do\"><img\r\n\t\t\t\t\t\t\tsrc=\"/img/sub_admin_title5_off.gif\" alt=\"부서코드\" width=\"110\"\r\n\t\t\t\t\t\t\theight=\"22\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t<td width=\"111\"><a href=\"/admin/commCode/purposeCode.do\"><img\r\n\t\t\t\t\t\t\tsrc=\"/img/sub_admin_title6_off.gif\" alt=\"점용목적코드\" width=\"110\"\r\n\t\t\t\t\t\t\theight=\"22\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t<td width=\"111\"><a href=\"#\"><img\r\n\t\t\t\t\t\t\tsrc=\"/img/sub_admin_title7_on.gif\" alt=\"과세구분코드\" width=\"110\"\r\n\t\t\t\t\t\t\theight=\"22\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t<!--  //********** BEGIN_현진_20120315 -->\r\n\t\t\t\t\t\t<!-- \r\n\t\t\t\t\t\t<td width=\"111\"><a href=\"/jsp/admin/commCode/zipCodeList.jsp\"><img\r\n\t\t\t\t\t\t\tsrc=\"/img/sub_admin_title8_off.gif\" alt=\"우편번호코드\" width=\"110\"\r\n\t\t\t\t\t\t\theight=\"22\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t-->\r\n\t\t\t\t\t\t<td width=\"111\"><a href=\"/admin/commCode/seal.do\"><img\r\n\t\t\t\t\t\t\tsrc=\"/img/sub_admin_seal_off.gif\" alt=\"직인등록\" width=\"110\"\t\t\t\t\t\t\t         \r\n\t\t\t\t\t\t\theight=\"22\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t<!--   //********** END_현진_20120315 -->\r\n\t\t\t\t\t\t<td width=\"111\"><a href=\"/admin/commCode/jojungCode.do\"><img\r\n\t\t\t\t\t\t\tsrc=\"/img/sub_admin_title9_off.gif\" alt=\"조정계수\" width=\"110\"\r\n\t\t\t\t\t\t\theight=\"22\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t<td width=\"111\"><a href=\"/admin/commCode/gradeCode.do\"><img\r\n\t\t\t\t\t\t\tsrc=\"/img/sub_admin_title12_off.gif\" alt=\"등급코드\" width=\"110\"\r\n\t\t\t\t\t\t\theight=\"22\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t<td width=\"111\"><a href=\"/admin/commCode/officeCode.do\"><img\r\n\t\t\t\t\t\t\tsrc=\"/img/sub_admin_title13_off.gif\" alt=\"업체코드\" width=\"110\"\r\n\t\t\t\t\t\t\theight=\"22\" border=\"0\"></a></td>\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td align=\"left\" class=\"contborder_blue\">\r\n\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"";
  private final static String _jspx_template10 = "0\" cellpadding=\"0\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\"\r\n\t\t\t\t\t\t\tstyle=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"\r\n\t\t\t\t\t\t\tclass=\"sub_table\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td width=\"15%\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\"\r\n\t\t\t\t\t\t\t\t\tclass=\"sub_table_b\">회계과목코드</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input\r\n\t\t\t\t\t\t\t\t\tname=\"taxcode\" type=\"text\" class=\"input_form1\"\r\n\t\t\t\t\t\t\t\t\tstyle=\"width:160px;ime-mode:disabled\" value=\"";
  private final static String _jspx_template11 = "\" onKeyDown=\"checkKeySearch();onlyNumberInput();\"></td>\r\n\t\t\t\t\t\t\t\t<td width=\"15%\" align=\"center\" bgcolor=\"e5eff8\"\r\n\t\t\t\t\t\t\t\t\tclass=\"sub_table_b\">회계과목명</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input\r\n\t\t\t\t\t\t\t\t\tname=\"taxname\" type=\"text\" class=\"input_form1\"\r\n\t\t\t\t\t\t\t\t\tstyle=\"width:160px\" value=\"";
  private final static String _jspx_template12 = "\" onKeyDown=\"checkKeySearch();\"></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\"><span\r\n\t\t\t\t\t\t\t\t\tclass=\"sub_table_b\">소유구분</span></td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" width=\"100\" colspan=\"3\">\r\n\t\t\t\t\t\t\t\t\t<select name=\"taxacc\" class=\"input_form1\"style=\"width:70px\" onKeyDown=\"checkKeySearch();\">\r\n\t\t\t\t\t\t\t\t\t\t<option value=\"\">::전체::</option>\r\n\t\t\t\t\t\t\t\t\t\t<option value=\"10\">시세</option>\r\n\t\t\t\t\t\t\t\t\t\t<option value=\"50\">구세</option>\r\n\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t</td>\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"40\" align=\"right\"><a href=\"#\"><img\r\n\t\t\t\t\t\t\tsrc=\"/img/inquiry_icon2.gif\" alt=\"조회\" width=\"56\" height=\"18\"\r\n\t\t\t\t\t\t\tborder=\"0\" onClick=\"javascript:reSearch();\"></a></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"1\" bgcolor=\"#EAEAEA\"></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\"\r\n\t\t\t\t\t\t\tstyle=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"\r\n\t\t\t\t\t\t\tclass=\"sub_table\" scrolling=\"no\" >\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"28\" align=\"center\" bgcolor=\"e5eff8\"\r\n\t\t\t\t\t\t\t\t\tclass=\"sub_table_b\">세목코드</td>\r\n\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">세목명</td>\r\n\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">회계</td>\r\n\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">가산율적용</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template13 = "\r\n\t\t\t\t\t\t\t\t <tr onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\">\r\n\t\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\">";
  private final static String _jspx_template14 = "</td>\r\n\t\t\t\t\t\t\t\t\t<td>";
  private final static String _jspx_template15 = "</td>\r\n\t\t\t\t\t\t\t\t\t<td>";
  private final static String _jspx_template16 = "</td>\r\n\t\t\t\t\t\t\t\t\t<td>";
  private final static String _jspx_template17 = "</td>\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template18 = "\r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t</table>\r\n\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\r\n\t\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n</table>\r\n<script language=\"javascript\">\r\n<!--\r\n\tsetSelectedOption(document.listForm.taxacc, \"";
  private final static String _jspx_template19 = "\");\r\n//-->\r\n</script> \r\n</form>\r\n</body>\r\n</html>\r\n\r\n";
}
