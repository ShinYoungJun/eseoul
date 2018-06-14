package jeus_jspwork._jsp._jumyong._inquiry;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_inquirymodify_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(70,42);to=(70,50)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.sid }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template1);
      // jsp code [from=(71,51);to=(71,68)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.saveFileName }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template2);
      // jsp code [from=(100,51);to=(100,61)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.title }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template3);
      // jsp code [from=(106,55);to=(106,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.reception }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template4);
      // jsp code [from=(117,136);to=(117,157)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.originalFileName1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template5);
      // jsp code [from=(123,136);to=(123,157)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.originalFileName2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template6);
      // jsp code [from=(129,136);to=(129,157)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.originalFileName3}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template7);
      // jsp code [from=(134,52);to=(134,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.docnum }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template8);
      // jsp code [from=(139,132);to=(139,144)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.content }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template9);
      // jsp code [from=(159,151);to=(159,159)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.sid }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(169,16);to=(169,25)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.term }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(172,29);to=(172,50)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.originalFileName1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(173,29);to=(173,50)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.originalFileName2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(174,29);to=(174,50)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.originalFileName3}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(176,29);to=(176,50)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.originalFileName1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(176,57);to=(176,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.originalFileName2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(176,85);to=(176,106)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.originalFileName3}",java.lang.String.class , pageContext.getVariableResolver(), null));

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
  private final static String _jspx_template0 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\">\r\n<title></title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n<script language=\"javascript\" src=\"/js/jquery-1.6.1.js\"></script> \r\n<script type=\"text/javascript\">\r\n\r\n$( document ).ready(function() {\r\n\tvar myDate = new Date();\r\n\tvar years = myDate.getFullYear();\r\n\t\r\n\tvar optionsElement = \"\";\r\n\toptionsElement += \"<option value='\"+years+\"' selected='selected'>\"+years+\"</option>\";\r\n\t  \r\n\tfor(var idx=parseInt(years-1); idx>2008; idx--){\r\n\t\toptionsElement += \"<option value='\"+idx+\"'>\"+idx+\"</option>\";\r\n\t}\r\n\t  \r\n\t$(\"#term\").html(optionsElement);\r\n});\r\n\r\nfunction checkLength(objname, maxlength) {\r\n\t  var objstr = objname.value; // 입력된 문자열을 담을 변수 \r\n\t  var objstrlen = objstr.length; // 전체길이\r\n\t  // 변수초기화 \r\n\t  var maxlen = maxlength; // 제한할 글자수 최대크기 \r\n\t  var i = 0; // for문에 사용 \r\n\t  var bytesize = 0; // 바이트크기 \r\n\t  var strlen = 0; // 입력된 문자열의 크기\r\n\t  var onechar = \"\"; // char단위로 추출시 필요한 변수 \r\n\t  var objstr2 = \"\"; // 허용된 글자수까지만 포함한 최종문자열\r\n\t  // 입력된 문자열의 총바이트수 구하기\r\n\t  for (i = 0; i < objstrlen; i++) {\r\n\t   // 한글자추출 \r\n\t   onechar = objstr.charAt(i);\r\n\t   if (escape(onechar).length > 4) {\r\n\t    bytesize += 2; // 한글이면 2를 더한다. \r\n\t   } else {\r\n\t    bytesize++; // 그밗의 경우는 1을 더한다.\r\n\t   }\r\n\t   if (bytesize <= maxlen) { // 전체 크기가 maxlen를 넘지않으면 \r\n\t    strlen = i + 1; // 1씩 증가\r\n\t   }\r\n\t  }\r\n\t  // 총바이트수가 허용된 문자열의 최대값을 초과하면 \r\n\t  if (bytesize > maxlen) {\r\n\t   alert(\"입력 가능한 최대문자수 \"+maxlen+\"자(영문)을 초과했습니다. \\n초과된 내용은 자동으로 삭제 됩니다.\");  // match를 이용해서 영어로된 name을 한글로 변환해서 출력한다. \r\n\t   objstr2 = objstr.substr(0, strlen);\r\n\t   objname.value = objstr2;\r\n\t  }\r\n\t  objname.focus();\r\n\t }\r\n</script>\r\n</head>\r\n\r\n<body>\r\n<form id=\"form\" action=\"jumyong_update_inquiry.action\" method=\"post\" enctype=\"multipart/form-data\">\r\n<input type=\"hidden\" name=\"mode\" value=\"uploadOk\">\r\n<input type=\"hidden\" name=\"sid\" value=\"";
  private final static String _jspx_template1 = "\">\r\n<input type=\"hidden\" name=\"saveFileName\" value=\"";
  private final static String _jspx_template2 = "\">\r\n<table width=\"800\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\r\n\t<tr>\r\n\t\t<td height=\"43\"><img src=\"/img/sub1_cont5_title.gif\" width=\"800\" height=\"43\"></td>\r\n\t</tr>\r\n\t<tr>\r\n        <td height=\"14\"></td>\r\n    </tr>\r\n\t<tr>\r\n\t\t<td>\r\n\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td><img src=\"/img/sub_inquiry_title_on.gif\" width=\"110\" height=\"22\"></td>\r\n\t\t\t\t\t<td width=\"1\" background=\"/img/tab_line_blue.gif\"></td>\r\n\t\t\t\t\t<td width=\"689\" hight=\"22\" background=\"/img/tab_line_blue.gif\">&nbsp;</td>\r\n\t\t\t\t</tr>\r\n\t\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td class=\"contborder_blue\">\r\n\t\t<table>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td>\r\n\t\t\t\t\t\t<table width=\"760\" border=\"2\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"28\" width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">제&nbsp;&nbsp;목</td>\r\n\t\t\t\t\t\t\t\t<td width=\"660\" colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"title\" value=\"";
  private final static String _jspx_template3 = "\" size=\"92\" maxlength=\"100\" class=\"input_form1\"/>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"28\" width=\"80\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">수&nbsp;신&nbsp;처</td>\r\n\t\t\t\t\t\t\t\t<td width=\"30\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"reception\" value=\"";
  private final static String _jspx_template4 = "\" size=\"45\" maxlength=\"100\" class=\"input_form1\"/>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t<td height=\"28\" width=\"80\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">기안일</td>\r\n\t\t\t\t\t\t\t\t<td width=\"30\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t<select name=\"term\" id=\"term\" style=\"width: 146px;\"></select>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr id=\"files1\">\r\n\t\t\t\t\t\t\t\t<td height=\"28\" width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">파&nbsp;&nbsp;일</td>\r\n\t\t\t\t\t\t\t\t<td width=\"330\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><input type=\"file\" name=\"upload1\" class=\"input_form1\"/></td>\r\n\t\t\t\t\t\t\t\t<td height=\"28\" width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">첨부파일1</td>\r\n\t\t\t\t\t\t\t\t<td width=\"330px\" style=\"word-break:break-all\" bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"center\" name=\"originalFileName\">";
  private final static String _jspx_template5 = "</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr id=\"files2\" style=\"display: none;\">\r\n\t\t\t\t\t\t\t\t<td height=\"28\" width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">파&nbsp;&nbsp;일</td>\r\n\t\t\t\t\t\t\t\t<td width=\"330\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><input type=\"file\" name=\"upload2\" class=\"input_form1\"/></td>\r\n\t\t\t\t\t\t\t\t<td height=\"28\" width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">첨부파일2</td>\r\n\t\t\t\t\t\t\t\t<td width=\"330px\" style=\"word-break:break-all\" bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"center\" name=\"originalFileName\">";
  private final static String _jspx_template6 = "</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr id=\"files3\" style=\"display: none;\">\r\n\t\t\t\t\t\t\t\t<td height=\"28\" width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">파&nbsp;&nbsp;일</td>\r\n\t\t\t\t\t\t\t\t<td width=\"330\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><input type=\"file\" name=\"upload3\" class=\"input_form1\"/></td>\r\n\t\t\t\t\t\t\t\t<td height=\"28\" width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">첨부파일3</td>\r\n\t\t\t\t\t\t\t\t<td width=\"330px\" style=\"word-break:break-all\" bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"center\" name=\"originalFileName\">";
  private final static String _jspx_template7 = "</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"28\" width=\"80\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">문서&nbsp;&nbsp;번호</td>\r\n\t\t\t\t\t\t\t\t<td width=\"300\" colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"docnum\" value=\"";
  private final static String _jspx_template8 = "\" size=\"45\" maxlength=\"100\" class=\"input_form1\"/>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"170\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">내&nbsp;&nbsp;용</td>\r\n\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" colspan=\"3\" class=\"table_bl_left\"><textarea name=\"content\" cols=\"100\" rows=\"30\" class=\"input_form1\">";
  private final static String _jspx_template9 = "</textarea></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"5\"></td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n  \t\t\t\t\t<td align=\"right\" colspan=\"2\" class=\"sub_table_b\"></td>\r\n  \t\t\t\t</tr>\r\n  \t\t\t</table>\t\r\n\t\t<!--   //********** END_현진_20120219 -->\r\n\t\t\t\r\n  \t\t\t<tr>\r\n\t\t\t\t<td height=\"5\"></td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td align=\"right\">\r\n\t\t\t\t\t<input type=\"image\" value=\"수정 \" src=\"/img/mod_icon.gif\">\r\n\t\t\t\t\t<a href=\"#\"><img src=\"/img/can_icon.gif\" alt=\"취소\" width=\"56\" height=\"18\" border=\"0\" onclick=\"location.href='jumyong_content_inquiry.action?sid=";
  private final static String _jspx_template10 = "'\"></a>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t</td>\r\n\t</tr>\r\n</table>\r\n</form>\r\n</body>\r\n\r\n<script type=\"text/javascript\">\r\n\tvar term = \"";
  private final static String _jspx_template11 = "\";\r\n\tdocument.getElementById(\"term\").value = term;\r\n\r\n\tvar originalFileName1 = \"";
  private final static String _jspx_template12 = "\";\r\n\tvar originalFileName2 = \"";
  private final static String _jspx_template13 = "\";\r\n\tvar originalFileName3 = \"";
  private final static String _jspx_template14 = "\";\r\n\r\n\tvar originalFileName = [\"";
  private final static String _jspx_template15 = "\", \"";
  private final static String _jspx_template16 = "\", \"";
  private final static String _jspx_template17 = "\"];\r\n\r\n\tif(originalFileName[1] != \"\") {\r\n\t\t$(\"#files2\").css(\"display\", \"\");\r\n\t}\r\n\r\n\tif(originalFileName[2] != \"\") {\r\n\t\t$(\"#files3\").css(\"display\", \"\");\r\n\t}\r\n</script>\r\n\r\n</html>";
}
