package jeus_jspwork._jsp._jumyong._adress;

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
      // jsp code [from=(50,29);to=(50,39)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.gu_nm }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template2);
      // jsp code [from=(50,44);to=(50,54)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.gu_nm }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template3);
      // jsp code [from=(60,131);to=(60,141)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.or_nm }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template4);
      // jsp code [from=(62,130);to=(62,139)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.t_nm }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template5);
      // jsp code [from=(66,132);to=(66,143)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.dam_nm }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template6);
      // jsp code [from=(68,132);to=(68,143)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.dam_ph }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template7);
      // jsp code [from=(70,132);to=(70,143)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.dam_em }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template8);
      // jsp code [from=(74,133);to=(74,145)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.teem_nm }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template9);
      // jsp code [from=(76,133);to=(76,145)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.teem_ph }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(78,129);to=(78,137)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.fax }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(82,132);to=(82,143)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.goa_nm }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(84,144);to=(84,155)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.goa_ph }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(88,143);to=(88,152)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.memo }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);

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
  private final static String _jspx_template0 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\">\r\n<title></title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n<body>\r\n<table width=\"800\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n<form action=\"jumyong_adupdate.action\" method=\"post\"\tenctype=\"multipart/form-data\">\r\n<input type=\"hidden\" name=\"mode\" value=\"uploadOk\">\r\n<input type=\"hidden\" name=\"sid\" value=\"";
  private final static String _jspx_template1 = "\">\r\n<input type=\"hidden\" name=\"hi_gu_nm\" value=\"\">\r\n\t<tr>\r\n\t\t<td height=\"43\"><img src=\"/img/sub1_cont4_title.gif\" width=\"800\" height=\"43\"></td>\r\n\t</tr>\r\n\t<tr>\r\n        <td height=\"14\"></td>\r\n    </tr>\r\n\t<tr>\r\n\t\t<td>\r\n\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td><img src=\"/img/sub_adress_title_on.gif\" width=\"110\" height=\"22\"></td>\r\n\t\t\t\t\t<td width=\"1\" background=\"/img/tab_line_blue.gif\"></td>\r\n\t\t\t\t\t<td width=\"689\" hight=\"22\" background=\"/img/tab_line_blue.gif\">&nbsp;</td>\r\n\t\t\t\t</tr>\r\n\t\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td class=\"contborder_blue\">\r\n\t\t\t<table>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td>\r\n\t\t\t\t\t\t<table width=\"760\" border=\"2\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\" width=\"760\" border=\"2\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t\t\t  \t\t\t<tr>\r\n    \t\t\t\t\t\t\t<td height=\"28\" width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">시군구명</td>\r\n    \t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n    \t\t\t\t\t\t\t<select name=\"gu_nm\" class=\"input_form1\">\r\n    \t\t\t\t\t\t\t<option value=\"";
  private final static String _jspx_template2 = "\">";
  private final static String _jspx_template3 = "</option>\r\n    \t\t\t\t\t\t\t<option value=\"서울시\">서울시</option><option value=\"송파구\">송파구</option><option value=\"강동구\">강동구</option><option value=\"종로구\">종로구</option><option value=\"중구\">중구</option>\r\n    \t\t\t\t\t\t\t<option value=\"용산구\">용산구</option><option value=\"성동구\">성동구</option><option value=\"광진구\">광진구</option><option value=\"동대문구\">동대문구</option><option value=\"중랑구\">중랑구</option>\r\n    \t\t\t\t\t\t\t<option value=\"성북구\">성북구</option><option value=\"강북구\">강북구</option><option value=\"도봉구\">도봉구</option><option value=\"노원구\">노원구</option><option value=\"은평구\">은평구</option>\r\n    \t\t\t\t\t\t\t<option value=\"서대문구\">서대문구</option><option value=\"마포구\">마포구</option><option value=\"양천구\">양천구</option><option value=\"강서구\">강서구</option><option value=\"구로구\">구로구</option>\r\n    \t\t\t\t\t\t\t<option value=\"금천구\">금천구</option><option value=\"영등포구\">영등포구</option><option value=\"동작구\">동작구</option><option value=\"관악구\">관악구</option><option value=\"서초구\">서초구</option>\r\n    \t\t\t\t\t\t\t<option value=\"강남구\">강남구</option><option value=\"송파구\">송파구</option>\r\n    \t\t\t\t\t\t\t</select>\r\n    \t\t\t\t\t\t\t</td>\r\n    \t\t\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">부&nbsp;서&nbsp;명</td>\r\n    \t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input type=\"text\" style=\"width:130px\" maxlength=\"20\" name=\"or_nm\" value=\"";
  private final static String _jspx_template4 = "\" class=\"input_form1\"/></td>\r\n    \t\t\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">팀&nbsp;&nbsp;&nbsp;명</td>\r\n    \t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input type=\"text\" style=\"width:130px\" maxlength=\"20\" name=\"t_nm\" value=\"";
  private final static String _jspx_template5 = "\" class=\"input_form1\"/></td>\r\n  \t\t\t\t\t\t\t</tr>\r\n  \t\t\t\t\t\t\t<tr>\r\n    \t\t\t\t\t\t\t<td height=\"28\" width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">담당자명</td>\r\n\t    \t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input type=\"text\" style=\"width:130px\" maxlength=\"20\" name=\"dam_nm\" value=\"";
  private final static String _jspx_template6 = "\" class=\"input_form1\"/></td>\r\n\t\t\t    \t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">담당자 전화</td>\r\n    \t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input type=\"text\" style=\"width:130px\" maxlength=\"20\" name=\"dam_ph\" value=\"";
  private final static String _jspx_template7 = "\" class=\"input_form1\"/></td>\r\n    \t\t\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">담당자 메일</td>\r\n    \t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input type=\"text\" style=\"width:130px\" maxlength=\"50\" name=\"dam_em\" value=\"";
  private final static String _jspx_template8 = "\" class=\"input_form1\"/></td>\r\n  \t\t\t\t\t\t\t</tr>\r\n\t\t\t\t  \t\t\t<tr>\r\n \t\t\t\t\t   \t\t\t<td height=\"28\" width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">팀&nbsp;장&nbsp;명</td>\r\n    \t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input type=\"text\" style=\"width:130px\" maxlength=\"20\" name=\"teem_nm\" value=\"";
  private final static String _jspx_template9 = "\" class=\"input_form1\"/></td>\r\n    \t\t\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">팀장 전화</td>\r\n    \t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input type=\"text\" style=\"width:130px\" maxlength=\"20\" name=\"teem_ph\" value=\"";
  private final static String _jspx_template10 = "\" class=\"input_form1\"/></td>\r\n    \t\t\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">FAX</td>\r\n    \t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input type=\"text\" style=\"width:130px\" maxlength=\"20\" name=\"fax\" value=\"";
  private final static String _jspx_template11 = "\" class=\"input_form1\"/></td>\r\n  \t\t\t\t\t\t\t</tr>\r\n  \t\t\t\t\t\t\t<tr>\r\n    \t\t\t\t\t\t\t<td height=\"28\" width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">과&nbsp;장&nbsp;명</td>\r\n    \t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input type=\"text\" style=\"width:130px\" maxlength=\"20\" name=\"goa_nm\" value=\"";
  private final static String _jspx_template12 = "\" class=\"input_form1\"/></td>\r\n    \t\t\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">과장 전화</td>\r\n    \t\t\t\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><input type=\"text\" style=\"width:130px\" maxlength=\"20\" name=\"goa_ph\" value=\"";
  private final static String _jspx_template13 = "\" class=\"input_form1\"/></td>\r\n  \t\t\t\t\t\t\t</tr>\r\n  \t\t\t\t\t\t\t<tr>\r\n    \t\t\t\t\t\t\t<td height=\"28\" width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">비&nbsp;&nbsp;&nbsp;고</td>\r\n    \t\t\t\t\t\t\t<td colspan=\"5\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><input type=\"text\" style=\"width:600px\" maxlength=\"100\" name=\"memo\" value=\"";
  private final static String _jspx_template14 = "\" class=\"input_form1\"/></td>\r\n  \t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td height=\"5\"></td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td align=\"right\">\r\n\t\t\t<input type=\"submit\" value=\" 수정 \">\r\n\t\t\t<input type=\"button\" value=\" 취소\" onclick=\"location.href='jumyong_adlist.action'\">\r\n\t\t</td>\r\n\t</tr>\r\n</form>\r\n</table>\r\n</body>\r\n</html>";
}
