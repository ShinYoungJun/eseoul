package jeus_jspwork._jsp._rojum._bbs;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_modify_5fjsp extends jeus.servlet.jsp.HttpJspBase {

  public final String[] __jeusGetIncludedJspFiles() {
    return null;
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
      pageContext = _jspxFactory.getPageContext(this, request, response, "", true, 8192, true);
      session = pageContext.getSession();
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();

      response.setContentType("text/html;charset=MS949");

      out.write(_jspx_template0);
      // jsp code [from=(55,42);to=(55,50)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.sid }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template1);
      // jsp code [from=(56,51);to=(56,68)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.saveFileName }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template2);
      // jsp code [from=(84,117);to=(84,127)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.title }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template3);
      // jsp code [from=(90,105);to=(90,125)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.originalFileName}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template4);
      // jsp code [from=(94,144);to=(94,156)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.content }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template5);
      // jsp code [from=(114,117);to=(114,127)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.title }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template6);
      // jsp code [from=(120,105);to=(120,125)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.originalFileName}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template7);
      // jsp code [from=(125,164);to=(125,176)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.content }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template8);
      // jsp code [from=(145,90);to=(145,98)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.sid }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template9);

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
  private final static String _jspx_template0 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\">\r\n<title></title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n<script type=\"text/javascript\">\r\nfunction checkLength(objname, maxlength) {\r\n\t  var objstr = objname.value; // �Էµ� ���ڿ��� ���� ���� \r\n\t  var objstrlen = objstr.length; // ��ü����\r\n\t  // �����ʱ�ȭ \r\n\t  var maxlen = maxlength; // ������ ���ڼ� �ִ�ũ�� \r\n\t  var i = 0; // for���� ��� \r\n\t  var bytesize = 0; // ����Ʈũ�� \r\n\t  var strlen = 0; // �Էµ� ���ڿ��� ũ��\r\n\t  var onechar = \"\"; // char������ ����� �ʿ��� ���� \r\n\t  var objstr2 = \"\"; // ���� ���ڼ������� ������ �������ڿ�\r\n\t  // �Էµ� ���ڿ��� �ѹ���Ʈ�� ���ϱ�\r\n\t  for (i = 0; i < objstrlen; i++) {\r\n\t   // �ѱ������� \r\n\t   onechar = objstr.charAt(i);\r\n\t   if (escape(onechar).length > 4) {\r\n\t    bytesize += 2; // �ѱ��̸� 2�� ���Ѵ�. \r\n\t   } else {\r\n\t    bytesize++; // �׹��� ���� 1�� ���Ѵ�.\r\n\t   }\r\n\t   if (bytesize <= maxlen) { // ��ü ũ�Ⱑ maxlen�� ���������� \r\n\t    strlen = i + 1; // 1�� ����\r\n\t   }\r\n\t  }\r\n\t  // �ѹ���Ʈ���� ���� ���ڿ��� �ִ밪�� �ʰ��ϸ� \r\n\t  if (bytesize > maxlen) {\r\n\t   alert(\"�Է� ������ �ִ빮�ڼ� \"+maxlen+\"��(����)�� �ʰ��߽��ϴ�. \\n�ʰ��� ������ �ڵ����� ���� �˴ϴ�.\");  // match�� �̿��ؼ� ����ε� name�� �ѱ۷� ��ȯ�ؼ� ����Ѵ�. \r\n\t   objstr2 = objstr.substr(0, strlen);\r\n\t   objname.value = objstr2;\r\n\t  }\r\n\t  objname.focus();\r\n\t }\r\n</script>\r\n</head>\r\n\r\n<body>\r\n<table width=\"800\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n<form action=\"rojum_update.action\" method=\"post\"\tenctype=\"multipart/form-data\">\r\n<input type=\"hidden\" name=\"mode\" value=\"uploadOk\">\r\n<input type=\"hidden\" name=\"sid\" value=\"";
  private final static String _jspx_template1 = "\">\r\n<input type=\"hidden\" name=\"saveFileName\" value=\"";
  private final static String _jspx_template2 = "\">\r\n\t<tr>\r\n\t\t<td height=\"43\"><img src=\"/img/sub7_cont5_title.gif\" width=\"800\" height=\"43\"></td>\r\n\t</tr>\r\n\t<tr>\r\n        <td height=\"14\"></td>\r\n    </tr>\r\n\t<tr>\r\n\t\t<td>\r\n\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td><img src=\"/img/sub_bbs_title_on.gif\" width=\"110\" height=\"22\"></td>\r\n\t\t\t\t\t<td width=\"1\" background=\"/img/tab_line_blue.gif\"></td>\r\n\t\t\t\t\t<td width=\"689\" hight=\"22\" background=\"/img/tab_line_blue.gif\">&nbsp;</td>\r\n\t\t\t\t</tr>\r\n\t\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td class=\"contborder_blue\">\r\n\t\t\t<!--  //********** BEGIN_����_20120219 -->\r\n\t\t\t<!-- \r\n\t\t\t<table>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td>\r\n\t\t\t\t\t\t<table width=\"760\" border=\"2\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\" width=\"760\" border=\"2\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"28\" width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">��&nbsp;&nbsp;��</td>\r\n\t\t\t\t\t\t\t\t<td width=\"660\" colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><input type=\"text\" name=\"title\" value=\"";
  private final static String _jspx_template3 = "\" size=\"92\" maxlength=\"100\"/></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"28\" width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">��&nbsp;&nbsp;��</td>\r\n\t\t\t\t\t\t\t\t<td width=\"330\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><input type=\"file\" name=\"upload\"/></td>\r\n\t\t\t\t\t\t\t\t<td height=\"28\" width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">÷������</td>\r\n\t\t\t\t\t\t\t\t<td width=\"330\" bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"center\" name=\"originalFileName\">";
  private final static String _jspx_template4 = "</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">��&nbsp;&nbsp;��</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" colspan=\"3\" class=\"table_bl_left\"><textarea name=\"content\" cols=\"90\" rows=\"12\" onkeyup=\"checkLength(this,2000)\">";
  private final static String _jspx_template5 = "</textarea></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"5\"></td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n  \t\t\t\t\t<td align=\"right\" colspan=\"2\" class=\"sub_table_b\">�Է� ������ �ִ빮�ڼ��� 1000��(�ѱ�)�Դϴ�.</td>\r\n  \t\t\t\t</tr>\r\n  \t\t\t</table>\t\t\t\t\r\n\t\t\t-->\r\n\t\t\t<table>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td>\t\t\t\t\t\t\r\n\t\t\t\t\t\t<table width=\"760\" border=\"2\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"28\" width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">��&nbsp;&nbsp;��</td>\r\n\t\t\t\t\t\t\t\t<td width=\"660\" colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><input type=\"text\" name=\"title\" value=\"";
  private final static String _jspx_template6 = "\" size=\"92\" maxlength=\"100\" class=\"input_form1\"/></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"28\" width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">��&nbsp;&nbsp;��</td>\r\n\t\t\t\t\t\t\t\t<td width=\"330\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><input type=\"file\" name=\"upload\" class=\"input_form1\"/></td>\r\n\t\t\t\t\t\t\t\t<td height=\"28\" width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">÷������</td>\r\n\t\t\t\t\t\t\t\t<td width=\"330\" bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"center\" name=\"originalFileName\">";
  private final static String _jspx_template7 = "</td>\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"170\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">��&nbsp;&nbsp;��</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" colspan=\"3\" class=\"table_bl_left\"><textarea name=\"content\" cols=\"90\" rows=\"12\" onkeyup=\"checkLength(this,2000)\" class=\"input_form1\">";
  private final static String _jspx_template8 = "</textarea></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"5\"></td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n  \t\t\t\t\t<td align=\"right\" colspan=\"2\" class=\"sub_table_b\">�Է� ������ �ִ빮�ڼ��� 1000��(�ѱ�)�Դϴ�.</td>\r\n  \t\t\t\t</tr>\r\n  \t\t\t</table>\t\r\n\t\t\t<!--   //********** END_����_20120219 -->\t\t\r\n\t\t\t\r\n  \t\t\t<tr>\r\n\t\t\t\t<td height=\"5\"></td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td align=\"right\">\r\n\t\t\t\t\t<input type=\"submit\" value=\" ���� \">\r\n\t\t\t\t\t<input type=\"button\" value=\" ���\" onclick=\"location.href='rojum_content.action?sid=";
  private final static String _jspx_template9 = "'\">\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t</td>\r\n\t</tr>\r\n</form>\r\n</table>\r\n</body>\r\n\r\n</html>";
}
