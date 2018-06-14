package jeus_jspwork._jsp._gapan._bbs;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_contentview_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(3,3);to=(3,59)]
      String org_cd = (String)session.getAttribute("org_cd"); 

      out.write(_jspx_template1);
      // jsp code [from=(20,13);to=(20,19)]
      out.print(org_cd);

      out.write(_jspx_template2);
      // jsp code [from=(58,93);to=(58,102)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.title}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template3);
      // jsp code [from=(62,84);to=(62,93)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.name }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template4);
      // jsp code [from=(64,128);to=(64,144)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.saveFileName}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template5);
      // jsp code [from=(64,165);to=(64,185)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.originalFileName}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template6);
      // jsp code [from=(64,190);to=(64,210)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.originalFileName}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template7);
      // jsp code [from=(68,84);to=(68,96)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.created }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template8);
      // jsp code [from=(70,84);to=(70,97)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.hitcount }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template9);
      // jsp code [from=(73,94);to=(73,106)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.content }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(86,54);to=(86,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.title}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(90,45);to=(90,53)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.name}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(92,116);to=(92,132)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.saveFileName}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(92,153);to=(92,173)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.originalFileName}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(92,199);to=(92,219)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.originalFileName}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(96,46);to=(96,58)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.created }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(98,45);to=(98,58)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.hitcount }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(103,181);to=(103,192)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.content}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(121,154);to=(121,161)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.sid}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(121,178);to=(121,194)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.saveFileName}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(123,153);to=(123,160)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.sid}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);

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
  private final static String _jspx_template0 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n";
  private final static String _jspx_template1 = "\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\">\r\n<title></title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n<script type=\"text/javascript\">\r\n//권한검색\r\nwindow.onload = function(){\r\n\tvar i = ";
  private final static String _jspx_template2 = ";\r\n\tif(i != 0000000){\r\n\t\tdocument.getElementById(\"delete\").style.display='none';\r\n\t\tdocument.getElementById(\"modify\").style.display='none';\r\n\t}\r\n}\r\n</script>\r\n</head>\r\n\r\n<body>\r\n<table width=\"800\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t<tr>\r\n\t\t<td height=\"43\"><img src=\"/img/sub9_cont4_title.gif\" width=\"800\" height=\"43\"></td>\r\n\t</tr>\r\n\t<tr>\r\n        <td height=\"14\"></td>\r\n    </tr>\r\n\t<tr>\r\n\t\t<td>\r\n\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td><img src=\"/img/sub_bbs_title_on.gif\" width=\"110\" height=\"22\"></td>\r\n\t\t\t\t\t<td width=\"1\" background=\"/img/tab_line_blue.gif\"></td>\r\n\t\t\t\t\t<td width=\"689\" hight=\"22\" background=\"/img/tab_line_blue.gif\">&nbsp;</td>\r\n\t\t\t\t</tr>\r\n\t\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td class=\"contborder_blue\">\r\n\t\t<!--  //********** BEGIN_현진_20120219 -->\r\n\t\t<!-- \r\n\t\t<table>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td>\r\n\t\t\t\t\t\t<table width=\"760\" border=\"2\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\" width=\"760\" border=\"2\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\">\r\n  \t\t\t\t\t\t\t<tr>\r\n    \t\t\t\t\t\t\t<td height=\"28\" width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">제&nbsp;&nbsp;목</td>\r\n    \t\t\t\t\t\t\t<td width=\"660\" bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\">&nbsp;&nbsp;";
  private final static String _jspx_template3 = "</td>\r\n  \t\t\t\t\t\t\t</tr>\r\n  \t\t\t\t\t\t\t<tr>\r\n    \t\t\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">작성자</td>\r\n    \t\t\t\t\t\t\t<td width=\"330\" align=\"center\" bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template4 = "</td>\r\n    \t\t\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">첨부파일</td>\r\n    \t\t\t\t\t\t\t<td width=\"330\" align=\"center\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><a href=\"gapan_download.action?saveFileName=";
  private final static String _jspx_template5 = "&originalFileName=";
  private final static String _jspx_template6 = "\">";
  private final static String _jspx_template7 = "</a></td>\r\n  \t\t\t\t\t\t\t</tr>\r\n  \t\t\t\t\t\t\t<tr>\r\n    \t\t\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">등록일</td>\r\n    \t\t\t\t\t\t\t<td width=\"330\" align=\"center\" bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template8 = "</td>\r\n    \t\t\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조회수</td>\r\n    \t\t\t\t\t\t\t<td width=\"330\" align=\"center\" bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template9 = "</td>\r\n  \t\t\t\t\t\t\t</tr>\r\n  \t\t\t\t\t\t\t<tr>\r\n    \t\t\t\t\t\t\t<td colspan=\"4\" width=\"760\" height=\"100\" bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template10 = "</td>\r\n  \t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t</table>\r\n\t\t-->\r\n\t\t<table>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td>\r\n\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n  \t\t\t\t\t\t\t<tr>\r\n    \t\t\t\t\t\t\t<td height=\"28\" width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">제&nbsp;&nbsp;목</td>\r\n    \t\t\t\t\t\t\t<td width=\"660\" colspan=\"3\">&nbsp;&nbsp;";
  private final static String _jspx_template11 = "</td>\r\n  \t\t\t\t\t\t\t</tr>\r\n  \t\t\t\t\t\t\t<tr>\r\n    \t\t\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">작성자</td>\r\n    \t\t\t\t\t\t\t<td width=\"330\" align=\"center\">";
  private final static String _jspx_template12 = "</td>\r\n    \t\t\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">첨부파일</td>\r\n\t\t    \t\t\t\t\t<td width=\"330\" align=\"center\" ><a href=\"javascript:location.href('gapan_download.action?saveFileName=";
  private final static String _jspx_template13 = "&originalFileName=";
  private final static String _jspx_template14 = "')\"  class=\"sub_table\">";
  private final static String _jspx_template15 = "</a></td>\r\n  \t\t\t\t\t\t\t</tr>\r\n  \t\t\t\t\t\t\t<tr>\r\n    \t\t\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">등록일</td>\r\n    \t\t\t\t\t\t\t<td width=\"330\" align=\"center\" >";
  private final static String _jspx_template16 = "</td>\r\n    \t\t\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조회수</td>\r\n    \t\t\t\t\t\t\t<td width=\"330\" align=\"center\">";
  private final static String _jspx_template17 = "</td>\r\n  \t\t\t\t\t\t\t</tr>\r\n  \t\t\t\t\t\t\t<tr>\r\n    \t\t\t\t\t\t\t<!--  //********** BEGIN_현진_20120229 -->\t\t\t\t\t\t\t\t\r\n    \t\t\t\t\t\t\t<td colspan=\"4\" width=\"760\" height=\"100\" style=\"padding:10px\" valign=\"top\">\r\n\t    \t\t\t\t\t\t\t  <textarea style=\"border:0px; width:100%; overflow-x:hidden; overflow-y:auto; background-color:transparent; height:250px\"  class=\"input_form1\" onFocus=\"this.blur()\">";
  private final static String _jspx_template18 = "</textarea>\r\n    \t\t\t\t\t\t\t</td>\r\n    \t\t\t\t\t\t\t<!--   //********** END_현진_20120229 -->\r\n  \t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t</table>\r\n\r\n\t\t<!--   //********** END_현진_20120219 -->\t\t\r\n\t\t\t\r\n\t\t</td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td height=\"5\"></td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td>\r\n\t\t\t<img src=\"/img/del_icon5.gif\" id=\"delete\"  name=\"delete\" alt=\"삭제\" width=\"66\" height=\"22\" border=\"0\" onclick=\"location.href='gapan_delete.action?sid=";
  private final static String _jspx_template19 = "&saveFileName=";
  private final static String _jspx_template20 = "'\" style=\"cursor:Pointer;\" align=\"left\">\r\n\t\t\t<img src=\"/img/list_icon.gif\" alt=\"리스트\" width=\"66\" height=\"22\" border=\"0\" onclick=\"location.href='gapan_list.action'\" style=\"cursor:Pointer;\" align=\"right\">\r\n\t\t\t<img src=\"/img/mod_icon5.gif\" id=\"modify\" name=\"modify\" alt=\"수정\" width=\"66\" height=\"22\" border=\"0\" onclick=\"location.href='gapan_update.action?sid=";
  private final static String _jspx_template21 = "'\" style=\"cursor:Pointer;\" align=\"right\">\r\n\t\t</td>\r\n   \t</tr>\r\n</table>\r\n</body>\r\n\r\n</html>";
}
