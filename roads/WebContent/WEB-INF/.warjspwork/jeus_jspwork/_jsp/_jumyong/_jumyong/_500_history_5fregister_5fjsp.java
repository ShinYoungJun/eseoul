package jeus_jspwork._jsp._jumyong._jumyong;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_history_5fregister_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(93,61);to=(93,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(94,51);to=(94,54)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(95,54);to=(95,58)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mode}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(96,67);to=(96,79)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(118,105);to=(118,110)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${date }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(123,101);to=(123,117)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.WORK_NM }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(129,77);to=(129,91)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.GUNGE }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(135,76);to=(135,89)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${product.SAYU }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);

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
  private final static String _jspx_template1 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('사용자의 사용시간이 종료되었습니다. 다시 접속 해주시기 바랍니다.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template2 = "\r\n";
  private final static String _jspx_template3 = "\r\n";
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "  \r\n";
  private final static String _jspx_template6 = "  \r\n";
  private final static String _jspx_template7 = "\r\n";
  private final static String _jspx_template8 = "\r\n";
  private final static String _jspx_template9 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n<script language='JavaScript' src='/js/Check_inputbox.js'></script>\r\n<script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script>\r\n<script>\r\n\r\n\t\r\n\tfunction InitPage()\r\n\t{\t\r\n\t\t/*if(document.getElementById(\"mode1\").value == \"add\"  )\r\n\t\t{\r\n\t\t\tdocument.getElementById(\"edit\").style.visibility = \"visible\";\r\n\t\t\tdocument.getElementById(\"view\").style.visibility = \"hidden\";\r\n\t\t\r\n\t\t}else if(document.getElementById(\"mode1\").value == \"edit\" || document.getElementById(\"mode1\").value == \"add\"  )\r\n\t\t{\r\n\t\t\tdocument.getElementById(\"edit\").style.visibility = \"visible\";\r\n\t\t\tdocument.getElementById(\"view\").style.visibility = \"hidden\";\r\n\t\t}else\r\n\t\t{\r\n\t\t\tdocument.getElementById(\"edit\").style.visibility = \"hidden\";\r\n\t\t\tdocument.getElementById(\"view\").style.visibility = \"visible\";\r\n\t\t}*/\r\n\r\n\t}\r\n\t\r\n\t// 등록폼 체크\r\n\tfunction checkForm(){\r\n\t\tvar form1 = document.form1;\r\n\t\talert(form1.year.value);\r\n\r\n\t\tform1.submit();\r\n\t\t//\t특수문자 입력시 글 끝에 공백과 줄바꿈을 넣어야 깨지지 않음. 이유는 모르겠슴\r\n\t\t//\t\tw.content.value = w.content.value+' '+'\\n';\t\r\n\t\t\r\n\t}\r\n\r\n\t// 저장하기\r\n\tfunction goSave(){\r\n\r\n\t\t/*if( document.form.GUBUN.value == \"\" ){\r\n\t\t\talert(\"구분값을 선택하세요. \");\r\n\t\t\treturn;\r\n\t\t}\r\n\t\tif( document.form.WORK_ID.value == \"\" ){\r\n\t\t\talert(\"주민번호를 넣으세요. \");\r\n\t\t\treturn;\r\n\t\t}\r\n\t\tif( document.form.WORK_ID.value.length < 13 ){\r\n\t\t\talert(\"주민번호를 확인하세요. \");\r\n\t\t\treturn;\r\n\t\t}*/\r\n\t\tif( confirm(\"저장하시겠습니까? \") ){\r\n\t\t\tvar f = document.form;\r\n\t\t\tf.action = \"/jumyong/jumyong/history_registerPrc.do\";\r\n\t\t\tf.submit();\r\n\t\t}\r\n\t}\r\n\r\n\t// 리스트로\r\n\tfunction goList(){\r\n\t\tvar f = document.form;\r\n\t\tf.action = \"/jumyong/jumyong/history_view.do\";\r\n\t\tf.submit();\r\n\t}\r\n\r\n\t\r\n</script>\r\n\r\n</head>\r\n\r\n<body onload=\"InitPage();\">\r\n\r\n\r\n\r\n<form id=\"form\" name=\"form\" method=\"post\">\r\n<input type=\"hidden\" id=\"ADMIN_NO\" name=\"ADMIN_NO\" value=\"";
  private final static String _jspx_template10 = "\">\r\n<input type=\"hidden\" id=\"SEQ\" name=\"SEQ\" value=\"";
  private final static String _jspx_template11 = "\">\r\n<input type=\"hidden\" id=\"mode\" name=\"mode\"  value=\"";
  private final static String _jspx_template12 = "\">\r\n<input type=\"hidden\" id=\"currentPage\" name=\"currentPage\" value=\"";
  private final static String _jspx_template13 = "\">\r\n\r\n<table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t<tr>\r\n\t\t<td class=\"contborder_purple\">\t\r\n\t\t\t\r\n\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\t\t\r\n\t\t\t\t<tr>\r\n\t            \t<td>\r\n\t                \t<table width=\"100%\" border=\"0\"  cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t    \t<td width=\"10%\" height=\"26\" align=\"left\"  class=\"sub_table_b\">* 변경 세부 내역</td>\t\t\r\n\t\t\t\t\t\t    </tr>\r\n\t\t\t\t\t\t</table>\t\r\n\t                </td>\r\n\t        \t</tr>\t\t\t\t\t              \r\n\t\t\t\t<tr>\r\n                \t<td>\r\n                \t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t                <tr>\r\n\t\t\t                    <td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">등록날짜</td>\r\n\t\t\t                    <td width=\"32%\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t                    \t<input type=\"text\" id=\"WRITEDATE\" name=\"WRITEDATE\" class=\"input_form1\" value=\"";
  private final static String _jspx_template14 = "\" readonly>\r\n\t\t\t                    \t<img src=\"/img/calendar_icon.gif\" onclick=\"popUpCalendar(this, document.getElementById('WRITEDATE'), 'yyyymmdd');\" style=\"cursor:pointer\" >\r\n\t\t\t                    </td>\r\n\t\t\t\t\t\t\t\t<td width=\"13%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">담당자명</td>\r\n\t\t\t                    <td width=\"32%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\t\t\t                    \t<input type=\"text\" id=\"WORK_NM\" name=\"WORK_NM\" class=\"input_form1\" value=\"";
  private final static String _jspx_template15 = "\">\r\n\t\t\t                    </td> \r\n                  \t\t\t</tr>\r\n                  \t\t\t<tr>\r\n\t\t\t                \t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" >근거</td>\r\n\t\t\t                    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t                    \t<input type=\"text\" id=\"GUNGE\" name=\"GUNGE\" value=\"";
  private final static String _jspx_template16 = "\" size=\"83%\" class=\"input_form1\" maxlength=\"55\">\r\n\t\t\t                    </td>\r\n                  \t\t\t</tr>\r\n                  \t\t\t<tr>\r\n\t\t\t                \t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" >사유</td>\r\n\t\t\t                    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t                    \t<input type=\"text\" id=\"SAYU\"  name=\"SAYU\" value=\"";
  private final static String _jspx_template17 = "\" size=\"83%\" class=\"input_form1\" maxlength=\"55\">\r\n\t\t\t                    </td>\r\n                  \t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n                \t<td height=\"40\" align=\"right\">\r\n                \t\t<img src=\"/img/save_icon2.gif\" alt=\"저장\" width=\"56\" height=\"18\" border=\"0\" onClick=\"javascript:goSave();\"  style=\"cursor:pointer\">\r\n                \t\t<img src=\"/img/list_icon2.gif\" alt=\"리스트\" width=\"56\" height=\"18\" border=\"0\" onClick=\"javascript:goList();\"  style=\"cursor:pointer\">\r\n\t                </td>\r\n              \t</tr>\r\n\t\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n</table>\r\n            \r\n            \r\n</form>\r\n\r\n</body>\r\n</html>\r\n\r\n";
}
