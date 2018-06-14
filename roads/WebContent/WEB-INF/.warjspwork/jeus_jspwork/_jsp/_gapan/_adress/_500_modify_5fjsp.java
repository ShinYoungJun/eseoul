package jeus_jspwork._jsp._gapan._adress;

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
      // jsp code [from=(21,42);to=(21,50)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.sid }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template1);
      // jsp code [from=(47,131);to=(47,141)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.gu_nm }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template2);
      // jsp code [from=(49,131);to=(49,141)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.or_nm }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template3);
      // jsp code [from=(51,130);to=(51,139)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.t_nm }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template4);
      // jsp code [from=(55,132);to=(55,143)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.dam_nm }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template5);
      // jsp code [from=(57,132);to=(57,143)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.dam_ph }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template6);
      // jsp code [from=(59,132);to=(59,143)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.dam_em }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template7);
      // jsp code [from=(63,133);to=(63,145)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.teem_nm }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template8);
      // jsp code [from=(65,133);to=(65,145)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.teem_ph }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template9);
      // jsp code [from=(67,129);to=(67,137)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.fax }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(71,132);to=(71,143)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.goa_nm }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(73,144);to=(73,155)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.goa_ph }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(77,143);to=(77,152)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.memo }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);

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
  private final static String _jspx_template0 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\">\r\n<title></title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n<body>\r\n<table width=\"800\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n<form action=\"gapan_adupdate.action\" method=\"post\"\tenctype=\"multipart/form-data\">\r\n<input type=\"hidden\" name=\"mode\" value=\"uploadOk\">\r\n<input type=\"hidden\" name=\"sid\" value=\"";
  private final static String _jspx_template1 = "\">\r\n\t<tr>\r\n\t\t<td height=\"43\"><img src=\"/img/sub9_cont4_title.gif\" width=\"800\" height=\"43\"></td>\r\n\t</tr>\r\n\t<tr>\r\n        <td height=\"14\"></td>\r\n    </tr>\r\n\t<tr>\r\n\t\t<td>\r\n\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td><img src=\"/img/sub_adress_title_on.gif\" width=\"110\" height=\"22\"></td>\r\n\t\t\t\t\t<td width=\"1\" background=\"/img/tab_line_blue.gif\"></td>\r\n\t\t\t\t\t<td width=\"689\" hight=\"22\" background=\"/img/tab_line_blue.gif\">&nbsp;</td>\r\n\t\t\t\t</tr>\r\n\t\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td class=\"contborder_blue\">\r\n\t\t\t<table>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td>\r\n\t\t\t\t\t\t<table width=\"760\" border=\"2\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\" width=\"760\" border=\"2\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t\t\t  \t\t\t<tr>\r\n    \t\t\t\t\t\t\t<td height=\"28\" width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">시군구명</td>\r\n    \t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input type=\"text\" style=\"width:130px\" maxlength=\"10\" name=\"gu_nm\" value=\"";
  private final static String _jspx_template2 = "\" class=\"input_form1\"//></td>\r\n    \t\t\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">부&nbsp;서&nbsp;명</td>\r\n    \t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input type=\"text\" style=\"width:130px\" maxlength=\"20\" name=\"or_nm\" value=\"";
  private final static String _jspx_template3 = "\" class=\"input_form1\"//></td>\r\n    \t\t\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">팀&nbsp;&nbsp;&nbsp;명</td>\r\n    \t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input type=\"text\" style=\"width:130px\" maxlength=\"20\" name=\"t_nm\" value=\"";
  private final static String _jspx_template4 = "\" class=\"input_form1\"//></td>\r\n  \t\t\t\t\t\t\t</tr>\r\n  \t\t\t\t\t\t\t<tr>\r\n    \t\t\t\t\t\t\t<td height=\"28\" width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">담당자명</td>\r\n\t    \t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input type=\"text\" style=\"width:130px\" maxlength=\"20\" name=\"dam_nm\" value=\"";
  private final static String _jspx_template5 = "\" class=\"input_form1\"//></td>\r\n\t\t\t    \t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">담당자 전화</td>\r\n    \t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input type=\"text\" style=\"width:130px\" maxlength=\"20\" name=\"dam_ph\" value=\"";
  private final static String _jspx_template6 = "\" class=\"input_form1\"//></td>\r\n    \t\t\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">담당자 메일</td>\r\n    \t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input type=\"text\" style=\"width:130px\" maxlength=\"50\" name=\"dam_em\" value=\"";
  private final static String _jspx_template7 = "\" class=\"input_form1\"//></td>\r\n  \t\t\t\t\t\t\t</tr>\r\n\t\t\t\t  \t\t\t<tr>\r\n \t\t\t\t\t   \t\t\t<td height=\"28\" width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">팀&nbsp;장&nbsp;명</td>\r\n    \t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input type=\"text\" style=\"width:130px\" maxlength=\"20\" name=\"teem_nm\" value=\"";
  private final static String _jspx_template8 = "\" class=\"input_form1\"//></td>\r\n    \t\t\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">팀장 전화</td>\r\n    \t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input type=\"text\" style=\"width:130px\" maxlength=\"20\" name=\"teem_ph\" value=\"";
  private final static String _jspx_template9 = "\" class=\"input_form1\"//></td>\r\n    \t\t\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">FAX</td>\r\n    \t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input type=\"text\" style=\"width:130px\" maxlength=\"20\" name=\"fax\" value=\"";
  private final static String _jspx_template10 = "\"/></td>\r\n  \t\t\t\t\t\t\t</tr>\r\n  \t\t\t\t\t\t\t<tr>\r\n    \t\t\t\t\t\t\t<td height=\"28\" width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">과&nbsp;장&nbsp;명</td>\r\n    \t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input type=\"text\" style=\"width:130px\" maxlength=\"20\" name=\"goa_nm\" value=\"";
  private final static String _jspx_template11 = "\" class=\"input_form1\"//></td>\r\n    \t\t\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">과장 전화</td>\r\n    \t\t\t\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><input type=\"text\" style=\"width:130px\" maxlength=\"20\" name=\"goa_ph\" value=\"";
  private final static String _jspx_template12 = "\" class=\"input_form1\"//></td>\r\n  \t\t\t\t\t\t\t</tr>\r\n  \t\t\t\t\t\t\t<tr>\r\n    \t\t\t\t\t\t\t<td height=\"28\" width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">비&nbsp;&nbsp;&nbsp;고</td>\r\n    \t\t\t\t\t\t\t<td colspan=\"5\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><input type=\"text\" style=\"width:600px\" maxlength=\"100\" name=\"memo\" value=\"";
  private final static String _jspx_template13 = "\" class=\"input_form1\"//></td>\r\n  \t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td height=\"5\"></td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td align=\"right\">\r\n\t\t\t<input type=\"submit\" value=\" 수정 \">\r\n\t\t\t<input type=\"button\" value=\" 취소\" onclick=\"location.href='gapan_adlist.action'\">\r\n\t\t</td>\r\n\t</tr>\r\n</form>\r\n</table>\r\n</body>\r\n</html>";
}
