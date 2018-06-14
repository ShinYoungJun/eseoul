package jeus_jspwork._jsp._jumyong._inquiry;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_register_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(80,43);to=(80,57)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${namedata.name }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template1);

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
  private final static String _jspx_template0 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\">\r\n<title>도로점용 질의회신 등록</title>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n<script language=\"javascript\" src=\"/js/jquery-1.6.1.js\"></script> \r\n</head>\r\n<body>\r\n\r\n<script type=\"text/javascript\">\r\n\r\n$( document ).ready(function() {\r\n\tvar myDate = new Date();\r\n  var years = myDate.getFullYear();\r\n\r\n  var optionsElement = \"\";\r\n  optionsElement += \"<option value='\"+years+\"' selected='selected'>\"+years+\"</option>\";\r\n  \r\n  for(var idx=parseInt(years-1); idx>2008; idx--){\r\n\t  optionsElement += \"<option value='\"+idx+\"'>\"+idx+\"</option>\";\r\n  }\r\n  \r\n  $(\"#termSelect\").html(optionsElement);\r\n});\r\n\r\nfunction checkLength(objname, maxlength) {\r\n\t  var objstr = objname.value; // 입력된 문자열을 담을 변수 \r\n\t  var objstrlen = objstr.length; // 전체길이\r\n\t  // 변수초기화 \r\n\t  var maxlen = maxlength; // 제한할 글자수 최대크기 \r\n\t  var i = 0; // for문에 사용 \r\n\t  var bytesize = 0; // 바이트크기 \r\n\t  var strlen = 0; // 입력된 문자열의 크기\r\n\t  var onechar = \"\"; // char단위로 추출시 필요한 변수 \r\n\t  var objstr2 = \"\"; // 허용된 글자수까지만 포함한 최종문자열\r\n\t  // 입력된 문자열의 총바이트수 구하기\r\n\t  for (i = 0; i < objstrlen; i++) {\r\n\t   // 한글자추출 \r\n\t   onechar = objstr.charAt(i);\r\n\t   if (escape(onechar).length > 4) {\r\n\t    bytesize += 2; // 한글이면 2를 더한다. \r\n\t   } else {\r\n\t    bytesize++; // 그밗의 경우는 1을 더한다.\r\n\t   }\r\n\t   if (bytesize <= maxlen) { // 전체 크기가 maxlen를 넘지않으면 \r\n\t    strlen = i + 1; // 1씩 증가\r\n\t   }\r\n\t  }\r\n\t  // 총바이트수가 허용된 문자열의 최대값을 초과하면 \r\n\t  if (bytesize > maxlen) {\r\n\t   alert(\"입력 가능한 최대문자수 \"+maxlen+\"자(한글)을 초과했습니다. \\n초과된 내용은 자동으로 삭제 됩니다.\");  // match를 이용해서 영어로된 name을 한글로 변환해서 출력한다. \r\n\t   objstr2 = objstr.substr(0, strlen);\r\n\t   objname.value = objstr2;\r\n\t  }\r\n\t  objname.focus();\r\n}\r\n\r\n\r\nvar addfile = false;\r\n\r\nfunction addFile() {\r\n\t$(\"#file2\").css(\"display\", \"\");\r\n\t$(\"#doc1\").css(\"vertical-align\", \"baseline\");\r\n\t$(\"#doc2\").css(\"vertical-align\", \"baseline\");\r\n\r\n\tif(addfile) {\r\n\t\t$(\"#file3\").css(\"display\", \"\");\r\n\t}\r\n\t\r\n\taddfile = true;\r\n\t//$(\"#file3\").css(\"display\", \"\");\r\n}\r\n\r\n</script>\r\n<form action=\"jumyong_upload_inquiry.action\" method=\"post\" enctype=\"multipart/form-data\">\r\n<input type=\"hidden\" name=\"mode\" value=\"uploadOk\">\r\n<input type=\"hidden\" name=\"name\" value=\"";
  private final static String _jspx_template1 = "\">\r\n<table width=\"800\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t<tr>\r\n\t\t<td height=\"30\"><img src=\"/img/sub1_cont5_title.gif\" width=\"800\" height=\"43\"></td>\r\n\t</tr>\r\n\t<tr>\r\n        <td height=\"14\"></td>\r\n    </tr>\r\n\t<tr>\r\n\t\t<td>\r\n\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td><img src=\"/img/sub_inquiry_title_on.gif\" width=\"110\" height=\"22\"></td>\r\n\t\t\t\t\t<td width=\"1\" background=\"/img/tab_line_blue.gif\"></td>\r\n\t\t\t\t\t<td width=\"689\" height=\"22\" background=\"/img/tab_line_blue.gif\">&nbsp;</td>\r\n\t\t\t\t</tr>\r\n\t\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td class=\"contborder_blue\">\r\n\t\t<table>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td>\r\n\t\t\t\t\t\t<table width=\"750px;\" border=\"2\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t\t\t\t<tr>\r\n    \t\t\t\t\t\t<td height=\"28\" width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">제&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;목</td>\r\n    \t\t\t\t\t\t<td colspan=\"3\" width=\"660\" colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n    \t\t\t\t\t\t\t<input type=\"text\" name=\"title\" style=\"width: 600px;\" maxlength=\"100\"  class=\"input_form1\"/>\r\n    \t\t\t\t\t\t</td>\r\n  \t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t<tr>\r\n    \t\t\t\t\t\t<td height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">수&nbsp;&nbsp;신&nbsp;&nbsp;처</td>\r\n    \t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n    \t\t\t\t\t\t\t<input type=\"text\" name=\"reception\" id=\"reception\" style=\"width: 230px;\" class=\"input_form1\"/>\r\n    \t\t\t\t\t\t</td>\r\n    \t\t\t\t\t\t<td height=\"28\" width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">기&nbsp;&nbsp;안&nbsp;&nbsp;일</td>\r\n    \t\t\t\t\t\t<td width=\"300\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n    \t\t\t\t\t\t\t<!--<input type=\"text\" name=\"term\" id=\"term\" style=\"width: 230px;\" class=\"input_form1\"/> -->\r\n    \t\t\t\t\t\t\t<select name=\"term\" style=\"width: 146px;\" id=\"termSelect\"></select>\r\n    \t\t\t\t\t\t</td>\r\n  \t\t\t\t\t\t</tr>\r\n  \t\t\t\t\t\t<tr>\r\n  \t\t\t\t\t\t\t<td height=\"28\" width=\"100\" align=\"center\" bgcolor=\"e5eff8\" id=\"doc1\" class=\"sub_table_b\" >문서번호</td>\r\n    \t\t\t\t\t\t<td width=\"280\" bgcolor=\"eaeaea\" id=\"doc2\" class=\"table_bl_left\">\r\n    \t\t\t\t\t\t\t<input type=\"text\" name=\"docnum\" id=\"docnum\" style=\"width: 230px;\" class=\"input_form1\"/>\r\n    \t\t\t\t\t\t</td>\r\n    \t\t\t\t\t\t<td height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">파&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;일</td>\r\n    \t\t\t\t\t\t<td id=\"filetr\" width=\"280\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n    \t\t\t\t\t\t\t<input type=\"file\" id=\"file1\" name=\"upload1\" style=\"width: 235px;\" class=\"input_form1\"/>\r\n    \t\t\t\t\t\t\t<a><input type=\"button\" class=\"sub_table_b\" style=\"font-size: 11px; height: 18px;\" onclick=\"addFile();\" value=\"추가\"></a>\r\n    \t\t\t\t\t\t\t<input type=\"file\" id=\"file2\" name=\"upload2\" style=\"width: 235px; display: none;\" class=\"input_form1\"/>\r\n    \t\t\t\t\t\t\t<input type=\"file\" id=\"file3\" name=\"upload3\" style=\"width: 235px; display: none;\" class=\"input_form1\"/>\r\n    \t\t\t\t\t\t</td>\r\n  \t\t\t\t\t\t</tr>\r\n  \t\t\t\t\t\t<tr>\r\n    \t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">내&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;용</td>\r\n    \t\t\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n    \t\t\t\t\t\t\t<textarea name=\"content\" cols=\"100\" rows=\"30\" class=\"input_form1\"></textarea>\r\n    \t\t\t\t\t\t</td>\r\n  \t\t\t\t\t\t</tr>\r\n\t\t\t\t\t</table>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"5\"></td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n  \t\t\t\t\t<td align=\"right\" colspan=\"2\" class=\"sub_table_b\"></td>\r\n  \t\t\t\t</tr>\r\n\t\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td height=\"5\"></td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td align=\"right\">\r\n\t\t<!--<input type=\"image\" value=\" 저장 \" src=\"/img/save_icon2.gif\" onclick=\"location.href='jumyong_upload_inquiry.action'\">-->\r\n\t\t<input type=\"image\" value=\" 저장 \" src=\"/img/save_icon2.gif\" onclick=\"javascript:'form.submit()'\">\r\n\t\t<a href=\"#\"><img src=\"/img/can_icon.gif\" alt=\"취소\" width=\"56\" height=\"18\" border=\"0\" onClick=\"location.href='jumyong_list_inquiry.action'\"></a>\r\n\t\t</td>\r\n\t</tr>\r\n</table>\r\n</form>\r\n\r\n</body>\r\n</html>";
}
