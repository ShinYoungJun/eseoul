package jeus_jspwork._jsp._admin._user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_userAuthorityPop_5fjsp extends jeus.servlet.jsp.HttpJspBase {

  public final String[] __jeusGetIncludedJspFiles() {
    return new String[] {
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
      out.write(_jspx_template2);
      out.write(_jspx_template3);
      out.write(_jspx_template4);
      out.write(_jspx_template5);
      out.write(_jspx_template6);
      out.write(_jspx_template7);
      // jsp code [from=(147,47);to=(147,55)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${listSize}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template8);
      // jsp code [from=(150,58);to=(150,64)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${result}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template9);
      // jsp code [from=(152,65);to=(152,74)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${userGrade}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(153,59);to=(153,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${user_id}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template21);
      // jsp code [from=(240,51);to=(240,60)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${userGrade}",java.lang.String.class , pageContext.getVariableResolver(), null));

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
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${authorityList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("list");
    _jspx_th_c_forEach_0.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template12);
            // jsp code [from=(218,29);to=(218,41)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.MENU_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template13);
            // jsp code [from=(219,29);to=(219,41)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.MENU_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template14);
            // jsp code [from=(221,32);to=(221,44)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.MENU_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template15);
            // jsp code [from=(221,61);to=(221,73)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.MENU_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template16);
            // jsp code [from=(221,101);to=(221,109)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.CHK}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template17);
            // jsp code [from=(222,30);to=(222,42)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.MENU_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template18);
            // jsp code [from=(222,57);to=(222,69)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.MENU_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template19);
            // jsp code [from=(222,81);to=(222,93)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.MENU_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

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
  private final static String _jspx_template7 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\nhtml {overflow-x : hidden;}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script language=\"javascript\" src=\"/js/common.js\"></script>\r\n<script type=\"text/javascript\">\r\n\r\n\t//메뉴list 조회           \r\n\tfunction reSearch()\t\t//안씀\r\n\t{\t\r\n\t\tvar w = document.regForm;\r\n\r\n\t\tw.action = \"/admin/user/userAuthority.do\";\t\t\r\n\t\tw.submit();\t\t\t\r\n\t}\r\n\r\n\tfunction fn_check()\r\n\t{\t\r\n\t\tvar fm = document.regForm; \r\n\t\tvar listSize = fm.listSize.value;\r\n\t\t\t\t\t\r\n\t\tfor(i=1; i<=listSize; i++)\r\n\t\t{\t\r\n\t\t\tif(document.getElementById(\"checkbox\"+i).checked)\r\n\t\t\t\tdocument.getElementById(\"checkbox\"+i).value = 1;\r\n\t\t\telse\r\n\t\t\t\tdocument.getElementById(\"checkbox\"+i).value = \"\";\t\r\n\t\t}\t\r\n\t}\r\n\r\n\t//수정\r\n\tfunction fn_update()\r\n\t{\t\r\n\t\tfn_check(); \r\n\t\tvar count = 0;\r\n\t\tfor(i=1; i<=7;i++){\r\n\t\t\tif(document.getElementById(\"checkbox\"+i).value == 1){\r\n\t\t\t\tcount++;\r\n\t\t\t}\r\n\t\t}\r\n\r\n\t\tif(count==0){\r\n\t\t\talert(\"적어도 한개이상 체크 하셔야 합니다.\");\r\n\t\t\treturn;\r\n\t\t}\r\n\r\n\t\tif(document.getElementById(\"admin\").value == 0){\r\n\t\t\tif(document.getElementById(\"userGrade\").value == 1){\r\n\t\t\t\talert(\"부서업무 담당자는 관리자 등급으로 바꿀 수 없습니다.\");\r\n\t\t\t\treturn;\r\n\t\t\t}\r\n\t\t}\r\n\r\n\t\tif(document.getElementById(\"userGrade\").value == 1){\r\n\t\t\tif(!document.getElementById(\"checkbox7\").value == 1){\r\n\t\t\t\talert(\"사용자 등급이 관리자이면 관리자 항목은 체크 해야 합니다.\");\r\n\t\t\t\treturn;\r\n\t\t\t}\r\n\t\t}\r\n\t\t\r\n\t\tif(document.getElementById(\"userGrade\").value == 2){\r\n\t\t\tif(document.getElementById(\"checkbox7\").value == 1){\r\n\t\t\t\talert(\"부서업무 담당자는 관리자 기능을 체크 할 수 없습니다.\");\r\n\t\t\t\treturn;\t\t\t\r\n\t\t\t}\r\n\t\t}\t\t\t\t\r\n\t\t\r\n\t\t\r\n\t\tvar w = document.regForm;\t\t\t\r\n\t\tw.action = \"/admin/user/updateAuthority.do\";\t\r\n\t\tw.submit();\t\r\n\t}\r\n\t\r\n\t//전체선택\r\n\tfunction fn_allSelect()\t\r\n\t{\r\n\t\tvar w = document.regForm;\t\r\n\t\tvar rowCount = document.getElementById(\"listSize\").value;\r\n\t\t\r\n\t\tif (w.allCheck.checked)\r\n\t\t{\r\n\t\t\tfor(i=1; i<= rowCount; i++)\r\n\t\t\t{\t\r\n\t\t\t\tdocument.getElementById(\"checkbox\"+i).checked = true;\t\r\n\t\t\t}\t\r\n\t\t}\r\n\t\telse\t\t \r\n\t\t{\r\n\t\t\tfor(i=1; i<= rowCount; i++)\r\n\t\t\t{\t\r\n\t\t\t\tdocument.getElementById(\"checkbox\"+i).checked = false;\t\t\t\t\t\r\n\t\t\t}\r\n\t\t}\r\n\t}\t\r\n\t\r\n\t//조회후 체크박스 update\r\n\tfunction init()\r\n\t{\r\n\t\tvar w = document.regForm;\r\n\t\tvar rowCount = document.getElementById(\"listSize\").value;\r\n\r\n\t\tfor(i=1; i<= rowCount; i++)\r\n\t\t{\t\r\n\t\t\tif(document.getElementById(\"checkbox\"+i).value == '1')  \t\r\n\t\t\t \tdocument.getElementById(\"checkbox\"+i).checked = true;\r\n\t\t}\t\t\t\r\n\t\t\r\n\t\tsetSelectedOptionByName(document.getElementById(\"userGrade\"),document.getElementById(\"user_Grade\").value);\r\n\t\tif(document.getElementById(\"userGrade\").value == 1){\r\n\t\t\tdocument.getElementById(\"admin\").value = 1;\r\n\t\t}\r\n\t}\t\r\n\t\r\n\tfunction fn_callBack()\r\n\t{\r\n\t\tif(document.getElementById(\"result\").value == \"true\"){\r\n\t\t\talert(\"저장에 성공하였습니다!\");\r\n\t\t\tvar w = opener.document.listForm;\r\n\t\t\tw.deptCode.value = opener.result.listForm.deptCode.value; \r\n\t\t\tw.action = \"/admin/user/user.do\";\t\t\r\n\t\t\tw.submit();\r\n\t\t\twindow.close();\r\n\t\t}\r\n\t}\r\n\t\t\r\n</script>\r\n\r\n<body onload=\"init();fn_callBack();\">\r\n<form name=\"regForm\" id=\"regForm\" method=\"post\" >\r\n<input id=\"listSize\" name=\"listSize\" value=\"";
  private final static String _jspx_template8 = "\" type=\"hidden\">\r\n<input id=\"menuCode\" name=\"menuCode\" type=\"hidden\">\r\n<input id=\"chk\" name=\"chk\" type=\"hidden\">\r\n<input id=\"result\" name=\"result\" type=\"hidden\"  value=\"";
  private final static String _jspx_template9 = "\">\r\n<input id=\"modeType\" name=\"modeType\" type=\"hidden\" value=\"updateAuthority\"> \r\n<input id=\"user_Grade\" name=\"user_Grade\" type=\"hidden\" value=\"";
  private final static String _jspx_template10 = "\"> \r\n<input id=\"user_id\" name=\"user_id\" type=\"hidden\" value=\"";
  private final static String _jspx_template11 = "\">\r\n<input id=\"admin\" name=\"admin\" type=\"hidden\" value=\"0\">\r\n\r\n<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t<tr>\r\n\t\t<td height=\"13\" colspan=\"3\"></td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td width=\"15\"></td>\r\n\t\t<td height=\"47\">\r\n\t\t<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\"\r\n\t\t\tclass=\"admin_w\">\r\n\t\t\t<tr>\r\n\t\t\t\t<td width=\"33\"><img src=\"/img/admin_pop_left.gif\" width=\"33\"\r\n\t\t\t\t\theight=\"47\"></td>\r\n\t\t\t\t<td background=\"/img/admin_pop_cen.gif\"><span class=\"admin_w_b\">메뉴\r\n\t\t\t\t사용권한 설정</span></td>\r\n\t\t\t\t<td width=\"33\"><img src=\"/img/admin_pop_right.gif\" width=\"33\"\r\n\t\t\t\t\theight=\"47\"></td>\r\n\t\t\t</tr>\r\n\t\t</table>\r\n\t\t</td>\r\n\t\t<td width=\"15\"></td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td></td>\r\n\t\t<td>\r\n\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"10\"></td>\r\n\t\t\t</tr>\r\n\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\"\r\n\t\t\t\tstyle=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"\r\n\t\t\t\tclass=\"sub_table\">\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td width=\"40%\" height=\"28\" align=\"center\" class=\"sub_table_b\">사용자\r\n\t\t\t\t\t등급</td>\r\n\t\t\t\t\t<td class=\"table_bl_left\">\r\n\t\t\t\t\t\t<select id=\"userGrade\" name=\"userGrade\" class=\"input_form1\" style=\"width:140px\">\r\n\t\t\t\t\t\t\t<!--select name=\"userGrade\" class=\"input_form1\" style=\"width:140px\" onchange=\"reSearch();\"-->\r\n\t\t\t\t\t\t\t<option value=\"\">선택하세요</option>\r\n\t\t\t\t\t\t\t<option value=\"1\">관리자</option>\r\n\t\t\t\t\t\t\t<option value=\"2\">부서업무담당자</option>\t\t\t\t\t\t\r\n\t\t\t\t\t\t</select></td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<table>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"1\"></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t</table>\r\n\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\"\r\n\t\t\t\t\tstyle=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"\r\n\t\t\t\t\tclass=\"sub_table\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"28\" align=\"center\" bgcolor=\"e5eff8\"\r\n\t\t\t\t\t\t\tclass=\"sub_table_b\">번호</td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">업무(기능)항목</td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">\r\n\t\t\t\t\t\t\t<input name=\"allCheck\" id=\"allCheck\" type=\"checkbox\" value=\"checkbox\" onclick=\"fn_allSelect();\" >\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\r\n\t\t\t\t\t";
  private final static String _jspx_template12 = "\r\n\t\t\t\t\t\t<tr onMouseOver=\"this.style.backgroundColor='#f6f7f8'\"\r\n\t\t\t\t\t\t\tonMouseOut=\"this.style.backgroundColor=''\">\r\n\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template13 = "</td>\r\n\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template14 = "</td>\r\n\t\t\t\t\t\t\t<td align=\"center\" height=\"26\">\t\r\n\t\t\t\t\t\t\t\t<input name=\"checkbox";
  private final static String _jspx_template15 = "\" id=\"checkbox";
  private final static String _jspx_template16 = "\" type=\"checkbox\" value=\"";
  private final static String _jspx_template17 = "\" >\r\n\t\t\t\t\t\t\t\t<input name=\"menuCd";
  private final static String _jspx_template18 = "\" id=\"menuCd";
  private final static String _jspx_template19 = "\" value=\"";
  private final static String _jspx_template20 = "\" type=\"hidden\">\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t";
  private final static String _jspx_template21 = "\t\t\t\t\t\r\n\t\t\t\t\t\r\n\t\t\t\t</table>\r\n\t\t\t</table>\r\n\t\t</table>\r\n\t\t<table align=\"center\">\r\n\t\t\t<td height=\"50\" colspan=\"3\" align=\"center\"><a href=\"#\"><img\r\n\t\t\t\tsrc=\"/img/mod_icon.gif\" alt=\"수정\" width=\"56\" height=\"18\" border=\"0\"\r\n\t\t\t\tonClick=\"fn_update();\"></a><a href=\"#\"><img\r\n\t\t\t\tsrc=\"/img/can_icon.gif\" alt=\"취소\" width=\"56\" height=\"18\" border=\"0\"\r\n\t\t\t\tonClick=javascript:window.close();></a></td>\r\n\t\t</table>\r\n\r\n<script language=\"javascript\">\r\n<!--\r\n\tsetSelectedOption(document.regForm.userGrade, \"";
  private final static String _jspx_template22 = "\");\r\n//-->\r\n</script></td>\r\n\t</tr>\r\n</table>\r\n</form>\r\n\r\n</body>\r\n</html>\r\n\r\n";
}
