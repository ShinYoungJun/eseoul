package jeus_jspwork._jsp._jumyong._gigan._tab;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_giganilgwal_5fview_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(70,57);to=(70,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GIGAN1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(71,57);to=(71,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GIGAN2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(72,65);to=(72,75)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PURPOSE_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(73,57);to=(73,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${BONBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(74,55);to=(74,60)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${BUBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(75,53);to=(75,57)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(76,61);to=(76,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(77,53);to=(77,57)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TYPE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(78,63);to=(78,72)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${OWNER_SET}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(79,59);to=(79,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TAX_SET}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(80,55);to=(80,60)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${BJ_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(81,55);to=(81,60)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${HJ_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(82,59);to=(82,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(94,145);to=(94,152)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MANAGER}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(99,114);to=(99,125)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${EXT_REGDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);

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
  private final static String _jspx_template9 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n}\r\n-->\r\n\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script>\r\n\r\n<script type=\"text/javascript\">\r\n//<![CDATA[\r\n\r\n\tfunction\tSave()\r\n\t{\r\n\t//\tif(page\t==\t\"\")\r\n\t//\t\treturn;\r\n\t\t\r\n\t\tvar form = document.form;\r\n\t\tvar\tstr\t\t= \"\";\r\n\t\t\r\n\t\t//\t민원등록\r\n\t\tif(form.EXT_REGDATE.value.length\t< 1)\r\n\t\t\tstr\t+= \"등록일자를 입력하세요\\n\";\r\n\t\telse if(form.EXT_FROMDATE.value.length\t< 1)\r\n\t\t\tstr\t+= \"점용기간을 입력하세요\\n\";\r\n\t\telse if(form.EXT_TODATE.value.length\t< 1)\r\n\t\t\tstr\t+= \"점용기간을 입력하세요\\n\";\r\n\t\telse if(form.MANAGER.value.length\t< 1)\r\n\t\t\tstr\t+= \"담당자를 입력하세요\\n\";\r\n\t\t\r\n\t\tif(str\t!= \"\")\r\n\t\t{\r\n\t\t\talert(str);\r\n\t\t\treturn\ttrue;\r\n\t\t}\r\n\t\t\r\n\t\tif(confirm(\"일괄처리를 재 수정할 수 없으므로, 해당조건을 다시 한번 확인하여 주시기 바랍니다. \\n 일괄처리를 하시겠습니까?\")){\r\n\t\t\tform.action = \"giganilgwal_ext.do\";\t\t\t\r\n\t\t\tform.submit();\r\n\t\t}\r\n\t\t\r\n\t\t\r\n\t}\r\n\r\n\tfunction \tInit()\r\n\t{\r\n\t\tparent.TabDown_Img(\"giganilgwal\");\r\n\r\n\t}\r\n\t\r\n//]]>\r\n</script>\r\n\r\n<body onload=\"Init();\">\r\n<form id=\"form\" name=\"form\" method=\"post\">\r\n<input type=\"hidden\" id=\"GIGAN1\" name=\"GIGAN1\" value=\"";
  private final static String _jspx_template10 = "\">\r\n<input type=\"hidden\" id=\"GIGAN2\" name=\"GIGAN2\" value=\"";
  private final static String _jspx_template11 = "\">\r\n<input type=\"hidden\" id=\"PURPOSE_CD\" name=\"PURPOSE_CD\" value=\"";
  private final static String _jspx_template12 = "\">\r\n<input type=\"hidden\" id=\"BONBUN\" name=\"BONBUN\" value=\"";
  private final static String _jspx_template13 = "\">\r\n<input type=\"hidden\" id=\"BUBUN\" name=\"BUBUN\" value=\"";
  private final static String _jspx_template14 = "\">\r\n<input type=\"hidden\" id=\"NAME\" name=\"NAME\" value=\"";
  private final static String _jspx_template15 = "\">\r\n<input type=\"hidden\" id=\"ADMIN_NO\" name=\"ADMIN_NO\" value=\"";
  private final static String _jspx_template16 = "\">\r\n<input type=\"hidden\" id=\"TYPE\" name=\"TYPE\" value=\"";
  private final static String _jspx_template17 = "\">\r\n<input type=\"hidden\" id=\"OWNER_SET\" name=\"OWNER_SET\" value=\"";
  private final static String _jspx_template18 = "\">\r\n<input type=\"hidden\" id=\"TAX_SET\" name=\"TAX_SET\" value=\"";
  private final static String _jspx_template19 = "\">\r\n<input type=\"hidden\" id=\"BJ_CD\" name=\"BJ_CD\" value=\"";
  private final static String _jspx_template20 = "\">\r\n<input type=\"hidden\" id=\"HJ_CD\" name=\"HJ_CD\" value=\"";
  private final static String _jspx_template21 = "\">\r\n<input type=\"hidden\" id=\"SECTION\" name=\"SECTION\" value=\"";
  private final static String _jspx_template22 = "\">\r\n\r\n<table width=\"780\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t  <tr>\r\n\t\t<td align=\"left\" class=\"contborder_blue\">\r\n\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\r\n\t\t<tr>\r\n\t\t  <td><table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t  \r\n\t\t\t  <tr>\r\n\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">담당자</td>\r\n\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input id=\"MANAGER\" name=\"MANAGER\" type=\"text\" class=\"input_form1\" style=\"width:120px\"  value=\"";
  private final static String _jspx_template23 = "\" maxlength=\"10\"></td>\r\n\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">갱신일자</td>\r\n\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t<td><input id=\"EXT_REGDATE\" name=\"EXT_REGDATE\" type=\"text\" class=\"input_form1\" style=\"width:70px\" value=\"";
  private final static String _jspx_template24 = "\" readonly></td>\r\n\t\t\t\t\t\t<td><a><img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, document.getElementById('EXT_REGDATE'), 'yyyymmdd')\" style=\"CURSOR: Hand;\"></a></td>\t\t\t\t\t  \r\n\t\t\t\t\t  </tr>\r\n\t\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t  </tr>\r\n\t\t\t  \r\n\t\t\t  <tr>\r\n\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">기간연장 시작</td>\r\n\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td><input id=\"EXT_FROMDATE\" name=\"EXT_FROMDATE\" type=\"text\" class=\"input_form1\" style=\"width:70px\" value=\"\" readonly></td>\r\n\t\t\t\t\t<td><a><img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, document.getElementById('EXT_FROMDATE'), 'yyyymmdd')\" style=\"CURSOR: Hand;\"></a></td>\t\t\t\t  \r\n\t\t\t\t  </tr>\r\n\t\t\t\t</table></td>\r\n\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">기간연장 종료</td>\r\n\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td><input id=\"EXT_TODATE\" name=\"EXT_TODATE\" type=\"text\" class=\"input_form1\" style=\"width:70px\" value=\"\" readonly></td>\r\n\t\t\t\t\t<td><a><img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, document.getElementById('EXT_TODATE'), 'yyyymmdd')\" style=\"CURSOR: Hand;\"></a></td>\t\t\t\t  \r\n\t\t\t\t  </tr>\r\n\t\t\t\t</table></td>\r\n\t\t\t  </tr>\r\n\t\t\t  \r\n\t\t\t  <tr>\r\n\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">비고</td>\r\n\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t<input id=EXT_NOTES name=EXT_NOTES type=\"text\" class=\"input_form1\" style=\"width:600px\" value=\"\" maxlength=\"50\">\r\n\t\t\t\t</td>\r\n\t\t\t  </tr>\r\n\r\n\t\t  </table></td>\r\n\t\t</tr>\r\n\t\t\r\n\t\t<tr>\r\n\t\t\t<td height=\"40\" align=\"right\">\r\n\t\t  \t\t<a><img onclick=\"javascript:Save()\" src=\"/img/levy_icon4.gif\" alt=\"일괄 처리\" border=\"0\" style=\"cursor:hand;\"></a>\r\n\t\t\t</td>\r\n\t\t</tr>\r\n\t</table>\r\n\t</td>\r\n  </tr>\r\n\r\n</table>\r\n\r\n</body>\r\n</html>";
}
