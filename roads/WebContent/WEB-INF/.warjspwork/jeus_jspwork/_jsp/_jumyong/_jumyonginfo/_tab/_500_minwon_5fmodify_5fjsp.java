package jeus_jspwork._jsp._jumyong._jumyonginfo._tab;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_minwon_5fmodify_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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

      // jsp code [from=(100,5);to=(152,1)]
      out.write(_jspx_template11);
      out.write(_jspx_template12);
      // jsp code [from=(157,155);to=(157,167)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.REQ_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(159,141);to=(159,152)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GUBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(166,109);to=(166,117)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${REQ_DATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(173,107);to=(173,114)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PREDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(181,145);to=(181,158)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.REQ_DEP}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(183,151);to=(183,167)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.MANAGE_DEP}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(188,143);to=(188,155)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.REQ_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(190,145);to=(190,158)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.MANAGER}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(196,97);to=(196,108)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.NOTES}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(202,147);to=(202,161)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.AGENT_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(205,57);to=(205,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${AGENT_TEL1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(206,57);to=(206,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${AGENT_TEL2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // jsp code [from=(207,57);to=(207,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${AGENT_TEL3}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);
      // jsp code [from=(213,139);to=(213,149)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template26);
      // jsp code [from=(216,116);to=(216,120)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SSN1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // jsp code [from=(217,118);to=(217,122)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SSN2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template28);
      // jsp code [from=(227,104);to=(227,108)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${POST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template29);
      // jsp code [from=(235,100);to=(235,111)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADDR1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template30);
      // jsp code [from=(236,99);to=(236,110)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADDR2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template31);
      // jsp code [from=(245,117);to=(245,121)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${POST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template32);
      // jsp code [from=(254,100);to=(254,111)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADDR1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template33);
      // jsp code [from=(255,99);to=(255,110)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADDR2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template34);
      // jsp code [from=(259,109);to=(259,125)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.DORO_ADDR1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template35);
      // jsp code [from=(260,109);to=(260,125)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.DORO_ADDR2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template36);
      // jsp code [from=(267,223);to=(267,227)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TEL1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template37);
      // jsp code [from=(268,223);to=(268,227)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TEL2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template38);
      // jsp code [from=(269,222);to=(269,226)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TEL3}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template39);
      // jsp code [from=(273,220);to=(273,223)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${HP1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template40);
      // jsp code [from=(274,220);to=(274,223)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${HP2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template41);
      // jsp code [from=(275,193);to=(275,196)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${HP3}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template42);
      // jsp code [from=(282,149);to=(282,158)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${REFERENCE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template43);

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
  private final static String _jspx_template2 = "\r\n";
  private final static String _jspx_template3 = "\r\n";
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "  \r\n";
  private final static String _jspx_template6 = "  \r\n";
  private final static String _jspx_template7 = "\r\n";
  private final static String _jspx_template8 = "\r\n";
  private final static String _jspx_template9 = "\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n<script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script>\r\n<script language='JavaScript' src='/js/Check_inputbox.js'></script>\r\n<!--  //********** BEGIN_현진_20120215 -->\r\n<script language=\"javascript\" src=\"/js/zipcode.js\"></script>\r\n<!--   //********** END_현진_20120215 -->   \r\n\r\n<script type=\"text/javascript\">\r\n//<![CDATA[\r\n\r\n\tfunction\tModify()\r\n\t{\r\n\t\tvar\tresult\t= DataCheck();\r\n\r\n\t\tif(result\t==\tfalse)\r\n\t\t\treturn;\r\n\t\t\r\n\t\tvar form = document.form;\r\n\t\t\r\n\t\tform.action = \"/jumyong/jumyonginfo/minwon_modify_prc.do\";\r\n\t\tform.submit();\r\n\t}\r\n\r\n\tfunction\tCancel()\r\n\t{\r\n\t\tvar form = document.form;\r\n\r\n\t\tform.action = \"/jumyong/jumyonginfo/minwon_view.do\";\r\n\t\tform.submit();\r\n\t}\r\n\r\n\tfunction\tDataCheck()\r\n\t{\r\n\t\tvar form \t= document.form;\r\n\t\tvar\tstr\t\t= \"\";\r\n\t\t\r\n/*\t\t//\t민원등록\r\n\t\tif(form.GUBUN.value.length\t< 1)\r\n\t\t\tstr\t+= \"민원구분을 입력하세요\\n\";\r\n\t\tif(form.REQ_DATE.value.length\t< 1)\r\n\t\t\tstr\t+= \"접수일자를 입력하세요\\n\";\r\n\t\tif(form.PREDATE.value.length\t< 1)\r\n\t\t\tstr\t+= \"처리 예정일자를 입력하세요\\n\";\r\n//\t\tif(form.REQ_DEP.value.length\t< 1)\r\n//\t\t\tstr\t+= \"접수부서를 입력하세요.\\n\";\r\n\t\tif(form.MANAGE_DEP.value.length\t< 1)\r\n\t\t\tstr\t+= \"담당부서를 입력하세요\\n\";\r\n\t\tif(form.REQ_NM.value.length\t< 1)\r\n\t\t\tstr\t+= \"접수자명을 입력하세요\\n\";\r\n\t\tif(form.MANAGER.value.length\t< 1)\r\n\t\t\tstr\t+= \"담당자명을 입력하세요\\n\";\r\n\t\tif(form.NOTES.value.length\t< 1)\r\n\t\t\tstr\t+= \"민원요지를 입력하세요\\n\";\r\n\t\tif(form.AGENT_NM.value.length\t< 1)\r\n\t\t\tstr\t+= \"신청인을 입력하세요\\n\";\r\n\t\tif(form.AGENT_TEL.value.length\t< 1)\r\n\t\t\tstr\t+= \"전화번호를 입력하세요\\n\";\r\n*/\r\n\t\tif(str\t== \"\")\r\n\t\t{\r\n\t\t\treturn\ttrue;\r\n\t\t}\r\n\t\t\r\n\t\talert(str);\r\n\r\n\t\treturn\tfalse;\t\t\r\n\t}\r\n\r\n//]]>\r\n</script>\r\n\r\n<body>\r\n<table width=\"780\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n<form id=\"form\" name=\"form\" method=\"post\">\r\n<input type=\"hidden\" id=\"ADMIN_NO\" name=\"ADMIN_NO\" value=\"";
  private final static String _jspx_template10 = "\">\r\n<input type=\"hidden\" id=\"SEQ\" name=\"SEQ\" value=\"";
  // jsp code [from=(100,5);to=(152,1)]
  private final static String _jspx_template11 = "\">\r\n\t\r\n\t\r\n\t<tr>\r\n\t\t<td align=\"left\" class=\"contborder_blue\">\r\n\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n";
  private final static String _jspx_template12 = "\r\n\t\t\t<tr>\r\n\t\t\t\t<td><table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t  \t<tr>\r\n\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">접수번호</td>\r\n\t\t\t\t\t<td width=\"37%\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><input id=\"REQ_NO\" name=\"REQ_NO\" type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"";
  private final static String _jspx_template13 = "\" readonly></td>\r\n\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">민원구분</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input id=\"GUBUN\" name=\"GUBUN\" type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"";
  private final static String _jspx_template14 = "\"></td>\r\n\t\t\t  \t</tr>\r\n\t\t\t\t\r\n\t\t\t  \t<tr>\r\n\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">접수일자</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t<td><input id=\"REQ_DATE\" name=\"REQ_DATE\" type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"";
  private final static String _jspx_template15 = "\" readonly></td>\r\n\t\t\t\t\t \t<td><a><img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, document.getElementById('REQ_DATE'), 'yyyymmdd')\" style=\"CURSOR: Hand;\"></a></td>\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t\t</table></td>\r\n\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">처리예정일자</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t<td><input id=\"PREDATE\" name=\"PREDATE\" type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"";
  private final static String _jspx_template16 = "\" readonly></td>\r\n\t\t\t\t\t\t<td><a><img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, document.getElementById('PREDATE'), 'yyyymmdd')\" style=\"CURSOR: Hand;\"></a></td>\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t\t</table></td>\r\n\t\t\t  \t</tr>\r\n\t\t\t  \r\n\t\t\t  \t<tr>\r\n\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">접수부서</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input id=\"REQ_DEP\" name=\"REQ_DEP\" type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"";
  private final static String _jspx_template17 = "\" readonly></td>\r\n\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">담당부서</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input id=\"MANAGE_DEP\" name=\"MANAGE_DEP\" type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"";
  private final static String _jspx_template18 = "\"></td>\r\n\t\t\t  \t</tr>\r\n\t\t\t  \r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">접수자명</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input id=\"REQ_NM\" name=\"REQ_NM\" type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"";
  private final static String _jspx_template19 = "\"></td>\r\n\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">담당자명</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input id=\"MANAGER\" name=\"MANAGER\" type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"";
  private final static String _jspx_template20 = "\"></td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t  \r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">민원요지</td>\r\n\t\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t<input id=\"NOTES\" name=\"NOTES\" type=\"text\" class=\"input_form1\" style=\"width:98%\" value=\"";
  private final static String _jspx_template21 = "\">\r\n\t\t\t\t\t</table></td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">대리인</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input id=\"AGENT_NM\" name=\"AGENT_NM\" type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"";
  private final static String _jspx_template22 = "\"></td>\r\n\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">대리인 연락처</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t<input id=\"AGENT_TEL1\" name=\"AGENT_TEL1\" value=\"";
  private final static String _jspx_template23 = "\" type=\"text\" class=\"input_form1\" style=\"width:25px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this); count_check(this, AGENT_TEL2, 3);\" maxlength=\"3\"> - \r\n\t\t\t\t\t\t<input id=\"AGENT_TEL2\" name=\"AGENT_TEL2\" value=\"";
  private final static String _jspx_template24 = "\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this); count_check(this, AGENT_TEL3, 4);\" maxlength=\"4\"> - \r\n\t\t\t\t\t\t<input id=\"AGENT_TEL3\" name=\"AGENT_TEL3\" value=\"";
  private final static String _jspx_template25 = "\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);\" maxlength=\"4\">\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t  \r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">민원인명</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input id=\"NAME\" name=\"NAME\" type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"";
  private final static String _jspx_template26 = "\"></td>\r\n\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">민원인 주민번호</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t<input id=\"SSN1\"  name=\"SSN1\" type=\"text\" class=\"input_form1\" style=\"width:40px; ime-mode:disabled\" value=\"";
  private final static String _jspx_template27 = "\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, min_ssn2, 6);\" maxlength=\"6\">\r\n\t\t\t\t\t\t - <input id=\"SSN2\" name=\"SSN2\" type=\"text\" class=\"input_form1\" style=\"width:87px; ime-mode:disabled\" value=\"";
  private final static String _jspx_template28 = "\" onKeyPress=\"nr_num_int(this);\" maxlength=\"7\">\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t  \t<!--  //********** BEGIN_현진_20120215 -->\r\n\t\t\t\t<!-- \r\n\t\t\t \t<tr>\r\n\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">민원인 우편번호</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t  \t<td><input id=\"POST\" name=\"POST\" type=\"text\" class=\"input_form1\" style=\"width:50px\" value=\"";
  private final static String _jspx_template29 = "\" readonly></td>\r\n\t\t\t\t\t\t\t   \t<td><img src=\"/img/search_icon.gif\" alt=\"검색\" width=\"56\" height=\"18\" border=\"0\" onclick=\"javascript:openZipcodePopup('form.POST', 'form.ADDR1');\" style=\"CURSOR:Hand\"></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t\t\r\n\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">민원인 주소</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t<input id=\"ADDR1\"  name=\"ADDR1\" type=\"text\" class=\"input_form1\" style=\"width:250px\" value=\"";
  private final static String _jspx_template30 = "\" readonly>\r\n\t\t\t\t\t\t<input id=\"ADDR2\" name=\"ADDR2\" type=\"text\" class=\"input_form1\" style=\"width:250px\" value=\"";
  private final static String _jspx_template31 = "\">\r\n\t\t\t\t\t</td>\r\n\t\t\t  \t</tr>\r\n\t\t\t  \t-->\r\n\t\t\t  \t<tr>\r\n\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">우편번호</td>\r\n\t\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t  \t<td width=\"50px\"><input id=\"POST\" name=\"POST\" type=\"text\" class=\"input_form1\" style=\"width:50px\" value=\"";
  private final static String _jspx_template32 = "\" readonly></td>\r\n\t\t\t\t\t\t\t\t<td width=\"50px\"><a href=\"javascript:openZipcodePopup_new('form.POST', 'form.ADDR1', 'form.DORO_ADDR1', '', '', '', '','','', '' );\"><img src=\"/img/search_icon.gif\" alt=\"검색\" width=\"56\" height=\"18\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\t\t\t\t\t\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">기본 주소</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t<input id=\"ADDR1\"  name=\"ADDR1\" type=\"text\" class=\"input_form1\" style=\"width:250px\" value=\"";
  private final static String _jspx_template33 = "\" readonly>\r\n\t\t\t\t\t\t<input id=\"ADDR2\" name=\"ADDR2\" type=\"text\" class=\"input_form1\" style=\"width:250px\" value=\"";
  private final static String _jspx_template34 = "\">\r\n\t\t\t\t\t</td>\r\n\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">도로명 주소</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t<input id=\"DORO_ADDR1\" name=\"DORO_ADDR1\" type=\"text\" class=\"input_form1\" style=\"width:250px\" value=\"";
  private final static String _jspx_template35 = "\" readonly>\r\n\t\t\t\t\t\t<input id=\"DORO_ADDR2\" name=\"DORO_ADDR2\" type=\"text\" class=\"input_form1\" style=\"width:250px\" value=\"";
  private final static String _jspx_template36 = "\">\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\t\t\t\t\t\t\t\r\n\t\t\t  \t<!--   //********** END_현진_20120215 -->\r\n\t\t\t  \t<tr>\r\n\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">민원인 전화</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t<input id=\"TEL1\" name=\"TEL1\" type=\"text\" class=\"input_form1\" style=\"width:25px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this); count_check(this, TEL2, 3);\" maxlength=\"3\" value=\"";
  private final static String _jspx_template37 = "\"> - \r\n\t\t\t\t\t\t<input id=\"TEL2\" name=\"TEL2\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this); count_check(this, TEL3, 4);\" maxlength=\"4\" value=\"";
  private final static String _jspx_template38 = "\"> - \r\n\t\t\t\t\t\t<input id=\"TEL3\" name=\"TEL3\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this); count_check(this, HP1, 4);\" maxlength=\"4\" value=\"";
  private final static String _jspx_template39 = "\">\r\n\t\t\t\t\t</td>\r\n\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">민원인 휴대폰</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t<input id=\"HP1\" name=\"HP1\" type=\"text\" class=\"input_form1\" style=\"width:25px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this); count_check(this, HP2, 3);\" maxlength=\"3\" value=\"";
  private final static String _jspx_template40 = "\"> - \r\n\t\t\t\t\t\t<input id=\"HP2\" name=\"HP2\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this); count_check(this, HP3, 4);\" maxlength=\"4\" value=\"";
  private final static String _jspx_template41 = "\"> - \r\n\t\t\t\t\t\t<input id=\"HP3\" name=\"HP3\" type=\"text\" class=\"input_form1\" style=\"width:30px\" style=\"ime-mode:disabled\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);\" maxlength=\"4\" value=\"";
  private final static String _jspx_template42 = "\">\r\n\t\t\t\t\t</td>\r\n\t\t\t  \t</tr>\r\n\t\t\t  \t<tr>\r\n       \t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">비고</td>\r\n     \t\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t       <table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t        <textarea id=\"REFERENCE\" name=\"REFERENCE\" type=\"text\" class=\"input_form1\" style=\"width:98%\" onkeyup=\"displayBytes(500, 'REFERENCE');\">";
  private final static String _jspx_template43 = "</textarea>\r\n\t\t\t\t       </table>\r\n     \t\t\t\t\t</td>\r\n       \t\t\t</tr> \r\n\t\t\t\t  \r\n\t\t\t  </table></td>\r\n\t\t\t</tr>\r\n\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"40\" align=\"right\">\r\n\t\t\t  \t\t<a href=\"javascript:Cancel();\"><img src=\"/img/can_icon.gif\" alt=\"취소\" width=\"56\" height=\"18\" border=\"0\"></a>\t\r\n\t\t\t  \t\t<a href=\"javascript:Modify();\"><img src=\"/img/save_icon2.gif\" alt=\"저장\" width=\"56\" height=\"18\" border=\"0\"></a>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t\r\n\t\t</table></td>\r\n\t  </tr>\r\n\r\n</table>\r\n\r\n</body>\r\n</html>";
}
