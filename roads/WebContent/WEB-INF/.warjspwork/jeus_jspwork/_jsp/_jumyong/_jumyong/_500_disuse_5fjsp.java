package jeus_jspwork._jsp._jumyong._jumyong;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_disuse_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(23,10);to=(23,19)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${afterSave}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(28,70);to=(28,77)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(32,10);to=(32,28)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${disuse.DISUSE_DATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(87,49);to=(87,57)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(88,41);to=(88,45)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mode}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(89,45);to=(89,51)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${toDate}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(90,55);to=(90,62)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(105,69);to=(105,90)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${disuse.DISUSE_MANAGER}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(107,69);to=(107,87)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${disuse.DISUSE_DATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(111,69);to=(111,89)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${disuse.DISUSE_REASON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(144,124);to=(144,145)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${disuse.DISUSE_MANAGER}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(148,118);to=(148,136)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${disuse.DISUSE_DATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(155,122);to=(155,142)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${disuse.DISUSE_REASON}",java.lang.String.class , pageContext.getVariableResolver(), null));

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
  private final static String _jspx_template0 = "\r\n";
  private final static String _jspx_template1 = "\r\n";
  private final static String _jspx_template2 = "  \r\n";
  private final static String _jspx_template3 = "  \r\n";
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "\r\n";
  private final static String _jspx_template6 = "\r\n";
  private final static String _jspx_template7 = "\r\n";
  private final static String _jspx_template8 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('사용자의 사용시간이 종료되었습니다. 다시 접속 해주시기 바랍니다.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template9 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n<script language=\"javascript\" src=\"/js/calculation.js\"></script>\r\n<script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script>\r\n<script>\r\n\tfunction InitPage() {\r\n\t\tif ('";
  private final static String _jspx_template10 = "' == '1') {\r\n\r\n\t\t\tvar parentAddr = parent.location.href;\r\n\t\t\tvar startStr = parentAddr.indexOf(\"section\");\r\n\r\n\t\t\tparent.location.href = parentAddr.substring(0, startStr + 8) + '";
  private final static String _jspx_template11 = "'\r\n\t\t\t\t\t+ parentAddr.substring(startStr + 9, parentAddr.length);\r\n\t\t}\r\n\r\n\t\tif ('";
  private final static String _jspx_template12 = "'.length < 1) {\r\n\t\t\tdocument.getElementById(\"DISUSE_DATE\").value = (document.getElementById(\"toDate\").value);\r\n\t\t}\r\n\r\n\t\tif (document.getElementById(\"mode\").value == \"edit\" || document.getElementById(\"mode\").value == \"new\") {\r\n\t\t\tdocument.getElementById(\"view\").style.display = \"none\";\r\n\t\t\tdocument.getElementById(\"edit\").style.display = \"block\";\r\n\t\t} else {\r\n\t\t\tdocument.getElementById(\"view\").style.display = \"block\";\r\n\t\t\tdocument.getElementById(\"edit\").style.display = \"none\";\r\n\t\t\t\r\n\t\t}\r\n\t}\r\n\r\n\tfunction submitClick() {\r\n\t\tvar disUseForm = document.disUseForm;\r\n\r\n\t\tif (disUseForm.DISUSE_MANAGER.value == \"\") {\r\n\t\t\talert(\"담당자를 넣어주세요\");\r\n\t\t\tdisUseForm.DISUSE_MANAGER.focus();\r\n\t\t\treturn;\r\n\t\t}\r\n\t\tif (disUseForm.DISUSE_DATE.value == \"\") {\r\n\t\t\talert(\"등록일자를 넣어주세요\");\r\n\t\t\tpopUpCalendar(document.getElementById('calendar'), document\r\n\t\t\t\t\t.getElementById('DISUSE_DATE'), 'yyyymmdd');\r\n\t\t\treturn;\r\n\t\t}\r\n\t\tif (disUseForm.DISUSE_REASON.value == \"\") {\r\n\t\t\talert(\"등록이유를  넣어주세요\");\r\n\t\t\tdisUseForm.DISUSE_REASON.focus();\r\n\t\t\treturn;\r\n\t\t}\r\n\t\tdisUseForm.submit();\r\n\t}\r\n\r\n\tfunction goModify() {\r\n\t\tvar goUrl = \"/jumyong/disUse.do?ADMIN_NO=\"\r\n\t\t\t\t+ document.getElementById(\"ADMIN_NO\").value + \"&mode=edit\";\r\n\t\tlocation.href(goUrl);\r\n\t}\r\n\tfunction goDelete() {\r\n\t\tif( confirm(\"해지하시겠습니까? \") ){\r\n\t\t\tvar goUrl = \"/jumyong/disUse.do?ADMIN_NO=\" + document.getElementById(\"ADMIN_NO\").value + \"&mode=del\";\r\n\t\t\tlocation.href(goUrl);\r\n\t\t}\r\n\t}\r\n</script>\r\n\r\n</head>\r\n\r\n<body onload=\"javascript:InitPage();\">\r\n\r\n\t<form id=\"disUseForm\" name=\"disUseForm\" method=\"post\" action=\"/jumyong/disUse.do\">\r\n\r\n\t\t<input id=\"ADMIN_NO\" name=\"ADMIN_NO\" value=\"";
  private final static String _jspx_template13 = "\" type=\"hidden\">\r\n\t\t<input id=\"mode\" name=\"mode\" value=\"";
  private final static String _jspx_template14 = "\" type=\"hidden\"> \r\n\t\t<input id=\"toDate\" name=\"toDate\" value=\"";
  private final static String _jspx_template15 = "\" type=\"hidden\"> \r\n\t\t<input id=\"OLD_SECTION\" name=\"OLD_SECTION\" value=\"";
  private final static String _jspx_template16 = "\" type=\"hidden\">\r\n\r\n\t\t<div id=\"view\" style=\"width: 100%;\">\r\n\t\t\t<table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"22\" background=\"/img/tab_line_purple.gif\"></td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td class=\"contborder_purple\">\r\n\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse: collapse;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td width=\"15%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">담당자</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td width=\"35%\" bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template17 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td width=\"15%\" width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">등록일</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td width=\"35%\" bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template18 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">이유</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\">";
  private final static String _jspx_template19 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t</table></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"10\" align=\"right\" colspan=\"3\"></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"10\" align=\"right\" colspan=\"3\">\r\n\t\t\t\t\t\t\t\t\t<img src=\"/img/discan_icon.gif\" alt=\"해지\" width=\"56\" height=\"18\" border=\"0\" onClick=\"javascript:goDelete();\" style=\"cursor: pointer\">\r\n\t\t\t\t\t\t\t\t\t<img src=\"/img/mod_icon.gif\" alt=\"수정\" width=\"56\" height=\"18\" border=\"0\" onClick=\"javascript:goModify();\" style=\"cursor: pointer\">\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table></td>\r\n\t\t\t\t</tr>\r\n\t\t\t</table>\r\n\t\t</div>\r\n\r\n\t\t<div id=\"edit\" style=\"width: 100%; display: none;\">\r\n\t\t\t<table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"22\" background=\"/img/tab_line_purple.gif\"></td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td class=\"contborder_purple\">\r\n\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse: collapse;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td width=\"15%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">담당자</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td width=\"35%\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input id=\"DISUSE_MANAGER\" name=\"DISUSE_MANAGER\" type=\"text\" class=\"input_form1\" style=\"width: 120px\" value=\"";
  private final static String _jspx_template20 = "\" maxlength=\"20\">\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td width=\"15%\" width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">등록일</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td width=\"35%\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<input id=\"DISUSE_DATE\" name=\"DISUSE_DATE\" type=\"text\" class=\"input_form1\" style=\"width: 60px\" value=\"";
  private final static String _jspx_template21 = "\" readonly>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<img id=\"calendar\" src=\"/img/calendar_icon.gif\" style=\"cursor: pointer\" onclick=\"popUpCalendar(this, document.getElementById('DISUSE_DATE'), 'yyyymmdd');\">\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">이유</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input id=\"DISUSE_REASON\" name=\"DISUSE_REASON\" type=\"text\" class=\"input_form1\" style=\"width: 500px\" value=\"";
  private final static String _jspx_template22 = "\" maxlength=\"100\">\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\r\n\t\t\t\t\t\t\t\t\t</table></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"10\" align=\"right\" colspan=\"3\"></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"10\" align=\"right\" colspan=\"3\">\r\n\t\t\t\t\t\t\t\t\t<img src=\"/img/closing_application.gif\" alt=\"폐쇄적용\" border=\"0\" onClick=\"javascript:submitClick();\" style=\"cursor: pointer\">\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table></td>\r\n\t\t\t\t</tr>\r\n\t\t\t</table>\r\n\t\t</div>\r\n\t</form>\r\n</body>\r\n</html>\r\n\r\n";
}
