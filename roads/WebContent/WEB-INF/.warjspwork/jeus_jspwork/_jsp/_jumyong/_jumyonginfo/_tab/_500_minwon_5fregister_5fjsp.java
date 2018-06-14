package jeus_jspwork._jsp._jumyong._jumyonginfo._tab;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_minwon_5fregister_5fjsp extends jeus.servlet.jsp.HttpJspBase {

  public final String[] __jeusGetIncludedJspFiles() {
    return new String[] {
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
      pageContext = _jspxFactory.getPageContext(this, request, response, "", true, 8192, true);
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
      // jsp code [from=(119,47);to=(119,55)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template3);
      // jsp code [from=(138,96);to=(138,104)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${REQ_DATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template4);
      // jsp code [from=(153,133);to=(153,143)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MANAGE_DEP}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template5);
      // jsp code [from=(155,136);to=(155,146)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MANAGE_DEP}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template6);
      // jsp code [from=(162,133);to=(162,140)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MANAGER}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template7);
      // jsp code [from=(188,110);to=(188,118)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${min_ssn1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template8);
      // jsp code [from=(189,113);to=(189,121)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${min_ssn2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template9);
      // jsp code [from=(196,94);to=(196,98)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${POST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(206,131);to=(206,136)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADDR1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(207,89);to=(207,94)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADDR2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(228,150);to=(228,159)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${REFERENCE}",java.lang.String.class , pageContext.getVariableResolver(), null));

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
  private final static String _jspx_template0 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n";
  private final static String _jspx_template1 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('사용자의 사용시간이 종료되었습니다. 다시 접속 해주시기 바랍니다.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template2 = "\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n}\r\n-->\r\n\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script>\r\n<script language='JavaScript' src='/js/Check_inputbox.js'></script>\r\n<!--  //********** BEGIN_현진_20120215 -->\r\n<script language=\"javascript\" src=\"/js/zipcode.js\"></script>\r\n<!--   //********** END_현진_20120215 -->   \r\n\r\n<script type=\"text/javascript\">\r\n//<![CDATA[\r\n //********** BEGIN_현진_20120215\r\n /*\r\n \tfunction \topenZipcodePopup(post, addr)\r\n\t{\r\n\t\tvar\tpost1\t= post;\r\n\t\tvar\taddr1\t= addr;\r\n\r\n\t\tvar url \t= \"/zipcode.do?openerPost=\" + post1 + \"&openerAddr=\" + addr1;\r\n\t\tvar winName = \"우편번호입력\";\r\n\t\tvar width \t= 420;\r\n\t\tvar height \t= 305;\r\n\t\tvar scroll \t= \"yes\";\r\n\t\tvar resize \t= \"no\";\r\n\r\n\t\tvar\toption\t= \"scrollbars=\" + scroll + \", \";\r\n\t\toption\t+= \"resize=\" + resize + \", \";\r\n\t\toption\t+= \"width=\" + width + \", \";\r\n\t\toption\t+= \"height=\" + height;\r\n\r\n\t\twindow.open(url, winName, option);\r\n\t}\r\n*/\r\n//********** END_현진_20120215\r\n           \r\n\r\n\tfunction\tRegister()\r\n\t{\r\n\t\tvar\tresult\t= DataCheck();\r\n\r\n\t\tif(result\t==\tfalse)\r\n\t\t\treturn;\r\n\t\t\r\n\t\tvar form = document.form;\r\n\t\tif (getByteLength(form.REFERENCE) > 500) {\r\n          alert(\"협의내용은 한글 500자 이상 입력할 수 없습니다.\\n현재 글자수:\"+getByteLength(form.REFERENCE));\r\n          return false;\r\n    \t}\r\n\t\tform.action = \"/jumyong/jumyonginfo/minwon_register_prc.do\";\r\n\t\tform.submit();\r\n\t}\r\n\r\n\tfunction\tCancel()\r\n\t{\r\n\t\tvar form = document.form;\r\n\r\n\t\tform.action = \"/jumyong/jumyonginfo/minwon_view.do\";\r\n\t\tform.submit();\r\n\t}\r\n\r\n\tfunction\tDataCheck()\r\n\t{\r\n\t\tvar form \t= document.form;\r\n\t\tvar\tstr\t\t= \"\";\r\n\t\t\r\n\t\t//\t민원등록\r\n\t\tif(form.GUBUN.value.length\t< 1)\r\n\t\t\tstr\t+= \"민원구분을 입력하세요\\n\";\r\n\t\tif(form.REQ_DATE.value.length\t< 1)\r\n\t\t\tstr\t+= \"접수일자를 입력하세요\\n\";\r\n\t\tif(form.PREDATE.value.length\t< 1)\r\n\t\t\tstr\t+= \"처리 예정일자를 입력하세요\\n\";\t\r\n//\t\tif(form.REQ_DEP.value.length\t< 1)\r\n//\t\t\tstr\t+= \"접수부서를 입력하세요.\\n\";\t\r\n\t\tif(form.MANAGE_DEP.value.length\t< 1)\r\n\t\t\tstr\t+= \"담당부서를 입력하세요\\n\";\t\r\n\t\tif(form.REQ_NM.value.length\t< 1)\r\n\t\t\tstr\t+= \"접수자명을 입력하세요\\n\";\t\r\n\t\tif(form.MANAGER.value.length\t< 1)\r\n\t\t\tstr\t+= \"담당자명을 입력하세요\\n\";\t\r\n\t\tif(form.NOTES.value.length\t< 1)\r\n\t\t\tstr\t+= \"민원요지를 입력하세요\\n\";\t\r\n\r\n\t//\tif(str\t== \"\")\r\n\t\t{\r\n\t\t\treturn\ttrue;\r\n\t\t}\r\n\t\t\r\n\t\talert(str);\r\n\r\n\t\treturn\tfalse;\t\t\r\n\t}\r\n\r\n//]]>\r\n</script>\r\n\r\n<body>\r\n<table width=\"780\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n<form name=\"form\" method=\"post\">\r\n<input type=\"hidden\" name=\"ADMIN_NO\" value=\"";
  private final static String _jspx_template3 = "\">\r\n\r\n\t  <tr>\r\n\t\t<td align=\"left\" class=\"contborder_blue\">\r\n\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t<tr>\r\n\t\t\t  <td><table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\r\n\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">접수번호</td>\r\n\t\t\t\t\t\t<td width=\"37%\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"REQ_NO\" type=\"text\" class=\"input_form1\" style=\"width:120px\" readonly></td>\r\n\t\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">민원구분</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"GUBUN\" type=\"text\" class=\"input_form1\" style=\"width:120px\"></td>\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t  \r\n\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">접수일자</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t\t<td><input name=\"REQ_DATE\" type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"";
  private final static String _jspx_template4 = "\" readonly></td>\r\n\t\t\t\t\t\t\t<td><a><img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, document.getElementById('REQ_DATE'), 'yyyymmdd')\" style=\"CURSOR: Hand;\"></a></td>\r\n\t\t\t\t\t  \t</tr>\r\n\t\t\t\t\t\t</table></td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">처리예정일자</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t\t<td><input name=\"PREDATE\" type=\"text\" class=\"input_form1\" style=\"width:120px\" readonly></td>\r\n\t\t\t\t\t\t\t<td><a><img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, document.getElementById('PREDATE'), 'yyyymmdd')\" style=\"CURSOR: Hand;\"></a></td>\r\n\t\t\t\t\t  \t</tr>\r\n\t\t\t\t\t\t</table></td>\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t  \r\n\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">접수부서</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"REQ_DEP\" type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"";
  private final static String _jspx_template5 = "\" readonly></td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">담당부서</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"MANAGE_DEP\" type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"";
  private final static String _jspx_template6 = "\"></td>\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t  \r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">접수자명</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"REQ_NM\" type=\"text\" class=\"input_form1\" style=\"width:120px\"></td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">담당자명</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"MANAGER\" type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"";
  private final static String _jspx_template7 = "\"></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t  \r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">민원요지</td>\r\n\t\t\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t<input name=\"NOTES\" type=\"text\" class=\"input_form1\" style=\"width:98%\">\r\n\t\t\t\t\t\t</table></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">대리인</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"AGENT_NM\" type=\"text\" class=\"input_form1\" style=\"width:120px\"></td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">대리인 연락처</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input name=\"min_agent_tel1\" type=\"text\" class=\"input_form1\" style=\"width:25px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, min_agent_tel2, 3);\" maxlength=\"3\"> - \r\n\t\t\t\t\t\t\t<input name=\"min_agent_tel2\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, min_agent_tel3, 4);\" maxlength=\"4\"> - \r\n\t\t\t\t\t\t\t<input name=\"min_agent_tel3\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, min_agent_tel3, 4);\" maxlength=\"4\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t  \r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">민원인명</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"NAME\" type=\"text\" class=\"input_form1\" style=\"width:120px\"></td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">민원인 주민번호</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input name=\"min_ssn1\" type=\"text\" class=\"input_form1\" style=\"width:40px; ime-mode:disabled\" value=\"";
  private final static String _jspx_template8 = "\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, min_ssn2, 6);\" maxlength=\"6\">\r\n\t\t\t\t\t\t\t - <input name=\"min_ssn2\" type=\"text\" class=\"input_form1\" style=\"width:45px; ime-mode:disabled\" value=\"";
  private final static String _jspx_template9 = "\" onKeyPress=\"nr_num_int(this);\" maxlength=\"7\"></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t  \r\n\t\t\t\t \t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">민원인 우편번호</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t  \t<td><input name=\"POST\" type=\"text\" class=\"input_form1\" style=\"width:50px\" value=\"";
  private final static String _jspx_template10 = "\" readonly></td>\r\n\t\t\t\t\t\t\t  \t<!--  //********** BEGIN_현진_20120215 -->\r\n\t\t\t\t\t\t\t  \t<!-- \r\n\t\t\t\t\t\t\t  \t<td><img src=\"/img/search_icon.gif\" alt=\"검색\" width=\"56\" height=\"18\" border=\"0\" onclick=\"javascript:openZipcodePopup('form.POST', 'form.ADDR1');\" style=\"CURSOR:Hand\"></td>\r\n\t\t\t\t\t\t\t  \t -->\r\n\t\t\t\t\t\t\t  \t <td><img src=\"/img/search_icon.gif\" alt=\"검색\" width=\"56\" height=\"18\" border=\"0\" onclick=\"javascript:openZipcodePopup_new('form.POST', 'form.ADDR1');\" style=\"CURSOR:Hand\"></td>\r\n\t\t\t\t\t\t\t\t<!--   //********** END_현진_20120215 -->\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table></td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">민원인 주소</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"ADDR1\" type=\"text\" class=\"input_form1\" style=\"width:250px\" value=\"";
  private final static String _jspx_template11 = "\" readonly>\r\n\t\t\t\t\t\t\t<input name=\"ADDR2\" type=\"text\" class=\"input_form1\" style=\"width:250px\" value=\"";
  private final static String _jspx_template12 = "\"></td>\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t  \r\n\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">민원인 전화</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input name=\"min_tel1\" type=\"text\" class=\"input_form1\" style=\"width:25px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, min_tel2, 3);\" maxlength=\"3\"> - \r\n\t\t\t\t\t\t\t<input name=\"min_tel2\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, min_tel3, 4);\" maxlength=\"4\"> - \r\n\t\t\t\t\t\t\t<input name=\"min_tel3\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, min_tel3, 4);\" maxlength=\"4\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">민원인 휴대폰</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input name=\"min_hp1\" type=\"text\" class=\"input_form1\" style=\"width:25px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, min_hp2, 3);\" maxlength=\"3\"> - \r\n\t\t\t\t\t\t\t<input name=\"min_hp2\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, min_hp3, 4);\" maxlength=\"4\"> - \r\n\t\t\t\t\t\t\t<input name=\"min_hp3\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, min_hp3, 4);\" maxlength=\"4\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t  \t<tr>\r\n        \t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">비고</td>\r\n      \t\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t       <table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t        <textarea name=\"REFERENCE\" id=\"REFERENCE\" onkeyup=\"displayBytes(500, 'REFERENCE');\" type=\"text\" class=\"input_form1\" style=\"width:98%\">";
  private final static String _jspx_template13 = "</textarea>\r\n\t\t\t\t\t       </table>\r\n      \t\t\t\t\t</td>\r\n        \t\t\t</tr> \r\n\t\t\t\t  \r\n\t\t\t  </table></td>\r\n\t\t\t</tr>\r\n\t\t\t<!--  //********** BEGIN_현진_20120215 -->\r\n\t\t\t<!--  \r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"40\">\r\n\t\t\t\t<table width=\"0\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"right\">\r\n\t\t\t  \t\t<a href=\"javascript:Cancel()\"><img src=\"/img/can_icon.gif\" alt=\"취소\" width=\"56\" height=\"18\" border=\"0\"></a>\t\r\n\t\t\t  \t\t<a href=\"javascript:Register()\"><img src=\"/img/save_icon2.gif\" alt=\"저장\" width=\"56\" height=\"18\" border=\"0\"></a>\r\n\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t-->\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"40\">\r\n\t\t\t\t<table width=\"0\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"right\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t<a href=\"javascript:Cancel()\"><img src=\"/img/can_icon.gif\" alt=\"취소\" width=\"56\" height=\"18\" border=\"0\"></a>\t\r\n\t\t\t\t\t  \t\t<a href=\"javascript:Register()\"><img src=\"/img/save_icon2.gif\" alt=\"저장\" width=\"56\" height=\"18\" border=\"0\"></a>\t\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\t\t\t  \t\t\r\n\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t<!--   //********** END_현진_20120215 -->\r\n\t\t\t\r\n\t\t\t\r\n\t\t</table></td>\r\n\t  </tr>\r\n\r\n</table>\r\n\r\n</body>\r\n</html>";
}
