package jeus_jspwork._jsp._jumyong._inquiry;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_inquirycontent_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(56,56);to=(56,65)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.title}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template3);
      // jsp code [from=(60,47);to=(60,60)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.reception}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template4);
      // jsp code [from=(62,47);to=(62,55)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.term}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template5);
      // jsp code [from=(66,45);to=(66,53)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.name}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template6);
      // jsp code [from=(69,107);to=(69,124)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.saveFileName1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template7);
      // jsp code [from=(69,145);to=(69,166)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.originalFileName1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template8);
      // jsp code [from=(70,107);to=(70,124)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.saveFileName2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template9);
      // jsp code [from=(70,145);to=(70,166)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.originalFileName2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(71,107);to=(71,124)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.saveFileName3}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(71,145);to=(71,166)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.originalFileName3}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(76,48);to=(76,60)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.created }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(78,47);to=(78,60)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.hitcount }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(83,181);to=(83,192)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.content}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(99,142);to=(99,150)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.term}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(99,161);to=(99,167)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${isTerm}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(100,163);to=(100,170)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.sid}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(108,18);to=(108,24)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${isTerm}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(109,29);to=(109,50)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.originalFileName1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(110,29);to=(110,50)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.originalFileName2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(111,29);to=(111,50)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.originalFileName3}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(113,29);to=(113,50)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.originalFileName1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(113,57);to=(113,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.originalFileName2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // jsp code [from=(113,85);to=(113,106)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.originalFileName3}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);
      // jsp code [from=(129,55);to=(129,62)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.sid}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template26);
      // jsp code [from=(129,79);to=(129,95)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.saveFileName}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);

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
  private final static String _jspx_template1 = "\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\">\r\n<title></title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n<script language=\"javascript\" src=\"/js/jquery-1.6.1.js\"></script> \r\n<script type=\"text/javascript\">\r\nwindow.onload = function(){\r\n\tvar i = ";
  private final static String _jspx_template2 = ";\r\n\tif(i != 0000000){\r\n\t\tdocument.getElementById(\"delete\").style.display='none';\r\n\t\tdocument.getElementById(\"modify\").style.display='none';\r\n\t}\r\n}\r\n</script>\r\n</head>\r\n\r\n<body>\r\n<table width=\"800px\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t<tr>\r\n\t\t<td height=\"43\"><img src=\"/img/sub1_cont5_title.gif\" width=\"800\" height=\"43\"></td>\r\n\t</tr>\r\n\t<tr>\r\n        <td height=\"14\"></td>\r\n    </tr>\r\n\t<tr>\r\n\t\t<td>\r\n\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td><img src=\"/img/sub_inquiry_title_on.gif\" width=\"110\" height=\"22\"></td>\r\n\t\t\t\t\t<td width=\"1\" background=\"/img/tab_line_blue.gif\"></td>\r\n\t\t\t\t\t<td width=\"689\" height=\"22\" background=\"/img/tab_line_blue.gif\">&nbsp;</td>\r\n\t\t\t\t</tr>\r\n\t\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td class=\"contborder_blue\">\t\t\r\n\t\t\t<table>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td>\r\n\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n  \t\t\t\t\t\t\t<tr>\r\n    \t\t\t\t\t\t\t<td height=\"28px\" width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">제&nbsp;&nbsp;목</td>\r\n    \t\t\t\t\t\t\t<td width=\"660px\" colspan=\"3\">&nbsp;&nbsp;";
  private final static String _jspx_template3 = "</td>\r\n  \t\t\t\t\t\t\t</tr>\r\n  \t\t\t\t\t\t\t<tr>\r\n  \t\t\t\t\t\t\t\t<td width=\"100px\" height=\"28px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">수신처</td>\r\n    \t\t\t\t\t\t\t<td width=\"330px\" align=\"center\">";
  private final static String _jspx_template4 = "</td>\r\n    \t\t\t\t\t\t\t<td width=\"100px\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">기안일</td>\r\n    \t\t\t\t\t\t\t<td width=\"300px\" align=\"center\">";
  private final static String _jspx_template5 = "</td>\r\n    \t\t\t\t\t\t</tr>\r\n    \t\t\t\t\t\t<tr>\r\n    \t\t\t\t\t\t\t<td width=\"15%\" height=\"28px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">작성자</td>\r\n    \t\t\t\t\t\t\t<td width=\"35%\" align=\"center\">";
  private final static String _jspx_template6 = "</td>\r\n    \t\t\t\t\t\t\t<td width=\"15%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">첨부파일</td>\t\t    \t\t\t\t\t\r\n\t\t    \t\t\t\t\t<td width=\"380px\" align=\"center\">\r\n\t\t    \t\t\t\t\t\t<a id=\"files1\" href=\"javascript:location.href('jumyong_download_inquiry.action?saveFileName=";
  private final static String _jspx_template7 = "&originalFileName=";
  private final static String _jspx_template8 = "')\" class=\"sub_table\"></a>\r\n\t\t    \t\t\t\t\t\t<a id=\"files2\" href=\"javascript:location.href('jumyong_download_inquiry.action?saveFileName=";
  private final static String _jspx_template9 = "&originalFileName=";
  private final static String _jspx_template10 = "')\" class=\"sub_table\"></a>\r\n\t\t    \t\t\t\t\t\t<a id=\"files3\" href=\"javascript:location.href('jumyong_download_inquiry.action?saveFileName=";
  private final static String _jspx_template11 = "&originalFileName=";
  private final static String _jspx_template12 = "')\" class=\"sub_table\"></a>\r\n\t\t    \t\t\t\t\t</td>\r\n  \t\t\t\t\t\t\t</tr>\r\n  \t\t\t\t\t\t\t<tr>\r\n    \t\t\t\t\t\t\t<td width=\"100px\" height=\"28px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">등록일</td>\r\n    \t\t\t\t\t\t\t<td width=\"330px\" align=\"center\" >";
  private final static String _jspx_template13 = "</td>\r\n    \t\t\t\t\t\t\t<td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조회수</td>\r\n    \t\t\t\t\t\t\t<td width=\"300px\" align=\"center\">";
  private final static String _jspx_template14 = "</td>\r\n  \t\t\t\t\t\t\t</tr>\r\n  \t\t\t\t\t\t\t<tr>\r\n    \t\t\t\t\t\t\t<!--  //********** BEGIN_현진_20120229 -->\t\t\t\t\t\t\t\t\r\n    \t\t\t\t\t\t\t<td colspan=\"4\" width=\"760px\" height=\"100px\" style=\"padding:10px\" valign=\"top\">\r\n\t    \t\t\t\t\t\t\t  <textarea style=\"border:0px; width:100%; overflow-x:hidden; overflow-y:auto; background-color:transparent; height:440px\"  class=\"input_form1\" onFocus=\"this.blur()\">";
  private final static String _jspx_template15 = "</textarea>\r\n    \t\t\t\t\t\t\t</td>\r\n    \t\t\t\t\t\t\t<!--   //********** END_현진_20120229 -->\r\n  \t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td height=\"5\"></td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td>\r\n\t\t\t<img src=\"/img/del_icon5.gif\" id=\"delete\" name=\"delete\" alt=\"삭제\" width=\"66\" height=\"22\" border=\"0\" onclick=\"deleteContent();\" style=\"cursor:Pointer;\" align=\"left\">\r\n\t\t\t<img src=\"/img/list_icon.gif\" alt=\"리스트\" width=\"66\" height=\"22\" border=\"0\" onclick=\"location.href='/bbs/jumyong_term_inquiry.action?from=";
  private final static String _jspx_template16 = "&isTerm=";
  private final static String _jspx_template17 = "'\" style=\"cursor:Pointer;\" align=\"right\">\r\n\t\t\t<img src=\"/img/mod_icon5.gif\" id=\"modify\" name=\"modify\" alt=\"수정\" width=\"66\" height=\"22\" border=\"0\" onclick=\"location.href='jumyong_update_inquiry.action?sid=";
  private final static String _jspx_template18 = "'\" style=\"cursor:Pointer;\" align=\"right\">\r\n\t\t</td>\r\n   \t</tr>\r\n   \r\n</table>\r\n</body>\r\n\r\n<script type=\"text/javascript\">\r\n\tvar isTerm = \"";
  private final static String _jspx_template19 = "\";\r\n\tvar originalFileName1 = \"";
  private final static String _jspx_template20 = "\";\r\n\tvar originalFileName2 = \"";
  private final static String _jspx_template21 = "\";\r\n\tvar originalFileName3 = \"";
  private final static String _jspx_template22 = "\";\r\n\r\n\tvar originalFileName = [\"";
  private final static String _jspx_template23 = "\", \"";
  private final static String _jspx_template24 = "\", \"";
  private final static String _jspx_template25 = "\"];\r\n\r\n\tif(originalFileName[0] != \"\") {\r\n\t\t$(\"#files1\").html(originalFileName[0] + \"<br>\");\r\n\t}\r\n\r\n\tif(originalFileName[1] != \"\") {\r\n\t\t$(\"#files2\").html(originalFileName[1] + \"<br>\");\r\n\t}\r\n\r\n\tif(originalFileName[2] != \"\") {\r\n\t\t$(\"#files3\").html(originalFileName[2]);\r\n\t}\r\n\r\n\tfunction deleteContent() {\r\n\t\tif (confirm(\"게시물을 삭제하시겠습니까?\")){\r\n\t\t\tlocation.href='jumyong_delete_inquiry.action?sid=";
  private final static String _jspx_template26 = "&saveFileName=";
  private final static String _jspx_template27 = "'\r\n\t\t}\r\n\t}\r\n</script>\r\n\r\n</html>";
}
