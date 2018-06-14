package jeus_jspwork._jsp._admin._board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_boardDetail_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(77,44);to=(77,49)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${gubun}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(78,45);to=(78,51)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${certYN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(79,46);to=(79,53)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${content}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(80,47);to=(80,55)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${fromDate}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(81,45);to=(81,51)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${toDate}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(126,42);to=(126,59)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${boardReg.BOARD_ID}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(139,41);to=(139,55)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${boardReg.TITLE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(147,42);to=(147,58)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${boardReg.USER_ID}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(174,111);to=(174,135)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${boardReg.NOTICE_FROMDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(180,111);to=(180,133)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${boardReg.NOTICE_TODATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(196,75);to=(196,91)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${boardReg.CONTENT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(228,51);to=(228,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${boardReg.PUBLIC_YN}",java.lang.String.class , pageContext.getVariableResolver(), null));

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
  private final static String _jspx_template0 = "\r\n";
  private final static String _jspx_template1 = "\r\n";
  private final static String _jspx_template2 = "  \r\n";
  private final static String _jspx_template3 = "  \r\n";
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "\r\n";
  private final static String _jspx_template6 = "\r\n";
  private final static String _jspx_template7 = "\r\n";
  private final static String _jspx_template8 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('사용자의 사용시간이 종료되었습니다. 다시 접속 해주시기 바랍니다.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template9 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody { \r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\nhtml {overflow-x : hidden;}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script language=\"javascript\" src=\"/js/common.js\"></script> \r\n<script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script>\r\n<script language=\"javascript\" src=\"/js/common.js\"></script>\r\n\r\n<script type=\"text/javascript\">\r\n           \r\n\tfunction submitClick()\r\n\t{\t\r\n\t\tvar w = document.regForm;\r\n\t\t\r\n\t\tif(!checkStrNVMsg(w.TITLE,\"제목\")) return;\r\n\t\tif(!checkStrNVMsg(w.USER_ID,\"작성자\")) return;\r\n\t\tif(!checkStrNVMsg(w.CONTENT,\"내용\")) return;\r\n\t\tif(!checkStrNVMsg(w.PUBLIC_YN,\"공개여부\")) return;\r\n\r\n\t    if(w.NOTICE_FROMDATE.value > w.NOTICE_TODATE.value)\r\n\t\t{ \r\n\t\t\talert(\"시작일자는 종료일자보다 클수없습니다!\");\r\n\t\t\tw.NOTICE_FROMDATE.select();\r\n\t\t\treturn;\r\n\t\t}\r\n\t\t\r\n\t\t\t\r\n\t\tw.action = \"/admin/boardReg.do\";\t\t\r\n\t\tw.submit();\t\t\t\t\t\r\n\t}\r\n\t\r\n\t//숫자만 입력\r\n\tfunction onlyNumberInput()\r\n\t{\t\r\n\t\tvar code = window.event.keyCode;\r\n\t\r\n\t \tif ((code > 34 && code < 41) || (code > 47 && code < 58) || (code > 95 && code < 106) || code == 8 || code == 9 || code == 13 || code == 46)\r\n\t \t{\r\n\t\t  \twindow.event.returnValue = true;\r\n\t\t\treturn;\r\n\t \t}else {\t \r\n\t \t\twindow.event.returnValue = false;\r\n\t \t\treturn;\r\n \t \t}\r\n\t}\r\n\t\r\n\tfunction search()\r\n\t{\t\r\n\t\tvar w = document.regForm;\r\n\r\n\t\tw.action = \"/admin/board.do\";\t\t\r\n\t\tw.submit();\t\r\n\t}\r\n\t\r\n</script>\r\n\r\n<body>\r\n<form name=\"regForm\" id=\"regForm\" method=\"post\">\r\n<input type=\"hidden\" name=\"gubun\" value=\"";
  private final static String _jspx_template10 = "\">\r\n<input type=\"hidden\" name=\"certYN\" value=\"";
  private final static String _jspx_template11 = "\">\r\n<input type=\"hidden\" name=\"content\" value=\"";
  private final static String _jspx_template12 = "\">\r\n<input type=\"hidden\" name=\"fromDate\" value=\"";
  private final static String _jspx_template13 = "\">\r\n<input type=\"hidden\" name=\"toDate\" value=\"";
  private final static String _jspx_template14 = "\">\r\n\r\n<table width=\"800\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t<tr>\r\n\t\t<td height=\"43\"><img src=\"/img/admin_cont7_title.gif\" width=\"800\"\r\n\t\t\theight=\"43\"></td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td align=\"center\">\r\n\t\t<table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"40\" align=\"right\"><!--상단 기안문상신,도움말 메뉴-->\r\n\t\t\t\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"8\"></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td><a href=\"#\"><img src=\"/img/help_icon.gif\" alt=\"도움말\"\r\n\t\t\t\t\t\t\twidth=\"65\" height=\"18\" border=\"0\"></a></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t</table>\r\n\t\t\t\t<!--상단 기안문상신,도움말 메뉴--></td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"1\" bgcolor=\"eaeaea\"></td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"14\"></td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td align=\"left\">\r\n\t\t\t\t<table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"22\" background=\"/img/tab_line_blue.gif\">\r\n\t\t\t\t\t\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td><img src=\"/img/sub_admin_title15.gif\" width=\"110\"\r\n\t\t\t\t\t\t\t\t\theight=\"22\"></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td align=\"left\" class=\"contborder_blue\"><input\r\n\t\t\t\t\t\t\tname=\"modeType\" type=\"hidden\" value=\"edit\"> <input\r\n\t\t\t\t\t\t\tname=\"seq\" type=\"hidden\" value=\"";
  private final static String _jspx_template15 = "\">\r\n\r\n\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\"\r\n\t\t\t\t\t\t\t\t\tstyle=\"border-collapse:collapse;\" cellpadding=\"0\"\r\n\t\t\t\t\t\t\t\t\tcellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"15%\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\"\r\n\t\t\t\t\t\t\t\t\t\t\tclass=\"sub_table_b\">제 목</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"30%\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><input\r\n\t\t\t\t\t\t\t\t\t\t\tname=\"TITLE\" type=\"text\" class=\"input_form1\"\r\n\t\t\t\t\t\t\t\t\t\t\tstyle=\"width:160px\" value=\"";
  private final static String _jspx_template16 = "\"></td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"15%\" align=\"center\" bgcolor=\"e5eff8\"\r\n\t\t\t\t\t\t\t\t\t\t\tclass=\"sub_table_b\">작성자</td>\r\n\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\"\r\n\t\t\t\t\t\t\t\t\t\t\tclass=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td><input name=\"USER_ID\" type=\"text\" class=\"input_form1\"\r\n\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"width:80px\" value=\"";
  private final static String _jspx_template17 = "\"></td>\r\n\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\"\r\n\t\t\t\t\t\t\t\t\t\tstyle=\"border-collapse:collapse;\" cellpadding=\"0\"\r\n\t\t\t\t\t\t\t\t\t\tcellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td width=\"15%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\"\r\n\t\t\t\t\t\t\t\t\t\t\t\tclass=\"sub_table_b\">공개여부</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td width=\"30%\" colspan=\"3\" bgcolor=\"eaeaea\"\r\n\t\t\t\t\t\t\t\t\t\t\t\tclass=\"table_bl_left\"><select name=\"PUBLIC_YN\" id=\"PUBLIC_YN\"\r\n\t\t\t\t\t\t\t\t\t\t\t\tclass=\"input_form1\" style=\"width:100px\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"\">선택하세요</option>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"1\">서울시공지</option>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"2\">자치구공지</option>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"3\">전체공개</option>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"4\">비공개</option>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"5\">팝업공지</option>\r\n\t\t\t\t\t\t\t\t\t\t\t</select></td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td width=\"15%\" align=\"center\" bgcolor=\"e5eff8\"\r\n\t\t\t\t\t\t\t\t\t\t\t\tclass=\"sub_table_b\">공지예약</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\"\r\n\t\t\t\t\t\t\t\t\t\t\t\tclass=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td><input name=\"NOTICE_FROMDATE\" type=\"text\"\r\n\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"input_form1\" style=\"width:80px;ime-mode:disabled\" onkeydown=\"onlyNumberInput();\" value=\"";
  private final static String _jspx_template18 = "\" readonly></td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td><a href=\"#\"><img src=\"/img/calendar_icon.gif\"\r\n\t\t\t\t\t\t\t\t\t\t\t\t\twidth=\"19\" height=\"16\" border=\"0\"\r\n\t\t\t\t\t\t\t\t\t\t\t\t\tonclick=\"popUpCalendar(this, document.getElementById('NOTICE_FROMDATE'), 'yyyymmdd');\"></a></td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"16\" align=\"center\">~</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td><input name=\"NOTICE_TODATE\" type=\"text\"\r\n\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"input_form1\" style=\"width:80px;ime-mode:disabled\" onkeydown=\"onlyNumberInput();\" value=\"";
  private final static String _jspx_template19 = "\" readonly></td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td><a href=\"#\"><img src=\"/img/calendar_icon.gif\"\r\n\t\t\t\t\t\t\t\t\t\t\t\t\twidth=\"19\" height=\"16\" border=\"0\"\r\n\t\t\t\t\t\t\t\t\t\t\t\t\tonclick=\"popUpCalendar(this, document.getElementById('NOTICE_TODATE'), 'yyyymmdd');\"></a>\r\n\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"15\"></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td colspan=\"10\" align=\"center\" valign=\"top\"><textarea\r\n\t\t\t\t\t\t\t\t\tname=\"CONTENT\" class=\"text_box\" style=\"width:97%;height:300px\">";
  private final static String _jspx_template20 = "</textarea>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\r\n\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"10\"></td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td>\r\n\t\t\t\t<table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"40\" align=\"right\"><a href=\"#\"><img\r\n\t\t\t\t\t\t\tsrc=\"/img/mod_icon.gif\" alt=\"수정\" width=\"56\" height=\"18\"\r\n\t\t\t\t\t\t\tborder=\"0\" onClick=\"javascript:submitClick();\"></a> <img src=\"/img/can_icon.gif\" alt=\"취소\"\r\n\t\t\t\t\t\t\twidth=\"56\" height=\"18\" border=\"0\" onclick=\"javascript:search();\" style=\"cursor:hand\"></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"30\"></td>\r\n\t\t\t</tr>\r\n\t\t</table>\r\n\t\t<script language=\"javascript\">\r\n<!--\r\n\tsetSelectedOption(document.regForm.PUBLIC_YN, \"";
  private final static String _jspx_template21 = "\");\r\n//-->\r\n</script></td>\r\n\t</tr>\r\n</table>\r\n</form>\r\n</body>\r\n</html>\r\n\r\n";
}
