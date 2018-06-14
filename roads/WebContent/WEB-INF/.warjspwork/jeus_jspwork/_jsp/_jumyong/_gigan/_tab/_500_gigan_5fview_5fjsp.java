package jeus_jspwork._jsp._jumyong._gigan._tab;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_gigan_5fview_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      out.write(_jspx_template10);
      // jsp code [from=(203,61);to=(203,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(204,51);to=(204,54)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(205,53);to=(205,57)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${guNm}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(206,67);to=(206,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(207,67);to=(207,75)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${FromDate}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(208,63);to=(208,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ToDate}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(257,145);to=(257,152)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MANAGER}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(259,136);to=(259,139)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TEL}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(276,96);to=(276,101)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GU_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(276,105);to=(276,112)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${DEPT_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(321,110);to=(321,117)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MANAGER}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(326,114);to=(326,125)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${EXT_REGDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(337,115);to=(337,129)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${AFTER_FROMDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(344,111);to=(344,123)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${AFTER_TODATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // jsp code [from=(356,105);to=(356,110)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${NOTES}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);

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
  private final static String _jspx_template9 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n}\r\n-->\r\n\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script language=\"javascript\" src=\"/jsp/RexServer/rexscript/rexpert.js\"></script>\r\n<script language=\"javascript\" src=\"/jsp/RexServer/rexscript/rexpert_properties.js\"></script>\r\n<script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script>\r\n<script language=\"javascript\" src=\"/js/Check_inputbox.js\"></script>\r\n\r\n<script type=\"text/javascript\">\r\n//<![CDATA[\r\n           \r\n\tfunction\tPage(page)\r\n\t{\r\n\t\tif(page\t==\t\"\")\r\n\t\t\treturn;\r\n\t\t\r\n\t\tvar form = document.form;\r\n\r\n\t\tform.action = \"gigan_view.do?currentPage=\" + page;\r\n\t\tform.submit();\r\n\t}\r\n\r\n\tfunction\tView(adminno, seq)\r\n\t{\r\n\r\n\t}\r\n\r\n\tfunction\tSave()\r\n\t{\r\n\t\tvar form \t= document.form;\r\n\t\tvar\tstr\t\t= \"\";\r\n\t\t\r\n\t\tvar OldFromDate = document.getElementById(\"OldFromDate\").value;\r\n\t\tvar OldToDate = document.getElementById(\"OldToDate\").value;\r\n\t\tvar FromDate = form.EXT_FROMDATE.value;\r\n\t\tvar ToDate = form.EXT_TODATE.value\r\n\r\n\t\tif(FromDate.length<1){\r\n\t\t\talert(\"시작 연장 기간을 넣어주세요.\");\r\n\t\t\treturn;\r\n\t\t}\r\n\t\tif(ToDate.length<1){\r\n\t\t\talert(\"종료 연장 기간을 넣어주세요.\");\r\n\t\t\treturn;\r\n\t\t}\r\n\t\tif(FromDate>ToDate){\r\n\t\t\talert(\"시작 연장 기간이 종료 연장 기간보다 더 뒤에 선택되었습니다.\\n다시 선택 해주세요\");\r\n\t\t\treturn;\r\n\t\t}\r\n\t\tif(FromDate<OldToDate){\r\n\t\t\talert(\"연장 점용 시작날짜보다 이전 점용기간 마지막 날짜가 더 뒤에 선택되었습니다.\\n다시 연장 점용 시작날짜를 선택 해주세요.\\n기존 날짜:\"+OldFromDate+\"~\"+OldToDate);\r\n\t\t\treturn;\r\n\t\t}\r\n\t\tif(form.EXT_MANAGER.value.length\t< 1){\r\n\t\t\talert(\"담당자를 입력하세요.\");\r\n\t\t\treturn;\r\n\t\t}\r\n\t\tif(form.EXT_REGDATE.value.length\t< 1){\r\n\t\t\talert(\"등록일자를 입력하세요.\");\r\n\t\t\treturn;\r\n\t\t}\t\t\r\n\t\r\n\t\tform.action = \"gigan_register.do\";\r\n\t\tform.submit();\r\n\t}\r\n\r\n\tfunction \tInit()\r\n\t{\r\n\t\tparent.TabDown_Img(\"gigan\");\r\n\t\t\r\n\t\tvar\tadminno\t= document.getElementById(\"ADMIN_NO\").value;\r\n\t\tvar\tseq\t\t= document.getElementById(\"SEQ\").value;\r\n\t\t\r\n\t//\talert(adminno + \" , \" + seq);\r\n\t\t\r\n\t//\tif(seq != \"\")\r\n\t//\t\tView(adminno, seq);\r\n\t}\r\n\r\n\tfunction submitPrint()\r\n\t{\r\n\t\tvar form \t= document.forms[0];\r\n\t\tvar\tstr\t\t= \"\";\r\n\t\t\t\r\n\t\t//\t민원등록\r\n\t\tif(form.YEAR.value.length < 1 )\r\n\t\t{\r\n\t\t\tstr\t+= \"통보년월을 입력하세요\\n\";\r\n\t\t\tform.YEAR.focus();\r\n\t\t}\r\n\t\telse if(form.MONTH.value.length\t< 1 || Number(form.MONTH.value) > 12 || Number(form.MONTH.value) < 1)\r\n\t\t{\r\n\t\t\tstr\t+= \"통보년월을 입력하세요\\n\";\r\n\t\t\tform.MONTH.focus();\r\n\t\t}\r\n\t\telse if(form.FROMDATE.value.length\t< 1)\r\n\t\t{\r\n\t\t\tstr\t+= \"신청 시작일을 입력하세요\\n\";\r\n\t\t}\r\n\t\telse if(form.TODATE.value.length\t< 1)\r\n\t\t{\r\n\t\t\tstr\t+= \"신청 종료일을 입력하세요\\n\";\t\r\n\t\t\tform.TODATE.focus();\t\r\n\t\t}\r\n\t\telse if(form.MANAGER.value.length\t< 1)\r\n\t\t{\r\n\t\t\tstr\t+= \"담당자를 입력하세요\\n\";\r\n\t\t\tform.MANAGER.focus();\r\n\t\t}\r\n\t\telse if(form.TEL.value.length\t< 1)\r\n\t\t{\r\n\t\t\tstr\t+= \"연락처를 입력하세요\\n\";\r\n\t\t\tform.TEL.focus();\r\n\t\t}\r\n\t\telse if(form.ENDDATE.value.length\t< 1)\r\n\t\t{\r\n\t\t\tstr\t+= \"만료일자를 입력하세요\\n\";\r\n\t\t\tform.ENDDATE.focus();\r\n\t\t}\r\n\t\telse if(form.DEPT.value.length\t< 1)\r\n\t\t{\r\n\t\t\tstr\t+= \"신청장소를 입력하세요\\n\";\r\n\t\t\tform.DEPT.focus();\r\n\t\t}\r\n\t\t\t\t\t\t\r\n\t\tif(str\t!= \"\")\r\n\t\t{\r\n\t\t\talert(str);\r\n\t\t\treturn\tfalse;\r\n\t\t}\r\n\t\treturn true;\r\n\t}\r\n\t\r\n\tfunction fnPreView()\r\n\t{\r\n\t\tif(!submitPrint()) return;\r\n\t\t\r\n\t\tvar oRptMainParam;\r\n\t\toRptMainParam = rex_GetgoDictionay(); \r\n\r\n\t\t// 필수 - 레포트명\r\n\t\toRptMainParam.put(\"rex_rptname\", \"annae\");\r\n\r\n\t\t// 필수 - 데이터 타입 설정\r\n\t\toRptMainParam.put(\"rex_datatype\", \"XML\");  // XML, CSV\r\n\r\n\t\t// 옵션 - 다른 DB를 연결시\r\n\t\toRptMainParam.put(\"rex_userservice\", \"oracle_jndi\");\r\n\r\n\t\t// 옵션 - 파라메터 설정\r\n\t\tvar form \t= document.forms[0];\r\n\r\n\t\toRptMainParam.put(\"ADMIN_NO\" ,form.ADMIN_NO.value);\r\n\t\toRptMainParam.put(\"YEAR\" ,form.YEAR.value);\r\n\t\toRptMainParam.put(\"MONTH\" ,form.MONTH.value);\r\n\t\toRptMainParam.put(\"FROMDATE\" ,form.FROMDATE.value);\t\r\n\t\toRptMainParam.put(\"TODATE\" ,form.TODATE.value);\r\n\t\toRptMainParam.put(\"MANAGER\" ,form.MANAGER.value);\r\n\t\toRptMainParam.put(\"TEL\" ,form.TEL.value);\r\n\t\toRptMainParam.put(\"ENDDATE\" ,form.ENDDATE.value);\r\n\t\toRptMainParam.put(\"DEPT\" ,form.DEPT.value);\r\n\t\toRptMa";
  private final static String _jspx_template10 = "inParam.put(\"NOTES\" ,form.NOTES.value);\r\n\t\toRptMainParam.put(\"GU_NM\" ,form.guNm.value);\r\n\r\n\t\t// preview 팝업 열기\r\n\t\trex_gfRexRptOpen(\"popup\", oRptMainParam);\r\n\t\t\t\r\n\t\treturn oRptMainParam;\t\t\t\r\n\t}\r\n\t\r\n\tfunction year_keyup()\r\n\t{\t\r\n\t\tvar form = document.form;\r\n\t\t\r\n\t\tif(form.YEAR.value.length == 4)\r\n\t\t\tform.MONTH.focus();\r\n\t}\r\n//]]>\r\n</script>\r\n\r\n<body onload=\"Init();\">\r\n<form id=\"form\" name=\"form\" method=\"post\">\r\n<input type=\"hidden\" id=\"ADMIN_NO\" name=\"ADMIN_NO\" value=\"";
  private final static String _jspx_template11 = "\">\r\n<input type=\"hidden\" id=\"SEQ\" name=\"SEQ\" value=\"";
  private final static String _jspx_template12 = "\">\r\n<input type=\"hidden\" id=\"guNm\" name=\"guNm\" value=\"";
  private final static String _jspx_template13 = "\">\r\n<input type=\"hidden\" id=\"currentPage\" name=\"currentPage\" value=\"";
  private final static String _jspx_template14 = "\">\r\n<input type=\"hidden\" id=\"OldFromDate\" name=\"OldFromDate\" value=\"";
  private final static String _jspx_template15 = "\">\r\n<input type=\"hidden\" id=\"OldToDate\" name=\"OldToDate\" value=\"";
  private final static String _jspx_template16 = "\">\r\n\r\n<table width=\"780\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\r\n\r\n\t  <tr>\r\n\t\t<td align=\"left\" class=\"contborder_blue\">\r\n\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\r\n\t\t<tr>\r\n\t\t\r\n\t\t  <tr>\r\n\t\t\t<td height=\"34\" colspan=\"4\" align=\"left\" bgcolor=\"#FFFFFF\" class=\"\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t<tr>\r\n\t\t\t\t  <td><span class=\"sub_stan_blue\">* 기간만료 통보</span></td>\r\n\t\t\t\t</tr>\r\n\t\t\t</table></td>\r\n\t\t  </tr>\r\n\r\n\t\t  <tr>\r\n\t\t  <td><table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\r\n\t\t\t  <tr>\r\n\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">부과 년월</td>\r\n\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t<input id=\"YEAR\" name=\"YEAR\" type=\"text\" class=\"input_form1\" style=\"width:70px\" value=\"\" maxlength=\"4\" onKeyDown=\"nr_num_int(this);\" onKeyUp=\"year_keyup();nr_num_int(this);\" onKeyPress=\"nr_num_int(this);\"> 년\r\n\t\t\t\t<input id=\"MONTH\" name=\"MONTH\" type=\"text\" class=\"input_form1\" style=\"width:70px\" value=\"\" maxlength=\"2\" onKeyDown=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);\" onKeyPress=\"nr_num_int(this);\"> 월\r\n\t\t\t\t</td>\r\n\t\t\t  </tr>\r\n\t\t  \t  \r\n\t\t\t  <tr>\r\n\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">신청 시작일</td>\r\n\t\t\t\t<td width=\"37%\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td><input id=\"FROMDATE\" name=\"FROMDATE\" type=\"text\" class=\"input_form1\" style=\"width:70px\" value=\"\" readonly></td>\r\n\t\t\t\t\t<td><a><img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, document.getElementById('FROMDATE'), 'yyyymmdd')\" style=\"CURSOR: Hand;\"></a></td>\t\t\t\t  \r\n\t\t\t\t  </tr>\r\n\t\t\t\t</table></td>\r\n\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">신청 종료일</td>\r\n\t\t\t\t<td width=\"\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td><input id=\"TODATE\" name=\"TODATE\" type=\"text\" class=\"input_form1\" style=\"width:70px\" value=\"\" readonly></td>\r\n\t\t\t\t\t<td><a><img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, document.getElementById('TODATE'), 'yyyymmdd')\" style=\"CURSOR: Hand;\"></a></td>\t\t\t\t  \r\n\t\t\t\t  </tr>\r\n\t\t\t\t</table></td>\r\n\t\t\t  </tr>\r\n\t\t\t  \t\t\t  \r\n\t\t\t  <tr>\r\n\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">담당자</td>\r\n\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input id=\"MANAGER\" name=\"MANAGER\" type=\"text\" class=\"input_form1\" style=\"width:120px\"  value=\"";
  private final static String _jspx_template17 = "\"  maxlength=\"10\"></td>\r\n\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">연락처</td>\r\n\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input id=\"TEL\" name=\"TEL\" type=\"text\" class=\"input_form1\" style=\"width:200px\" value=\"";
  private final static String _jspx_template18 = "\" maxlength=\"30\"></td>\r\n\t\t\t  </tr>\r\n\t\t\t  \r\n\t\t\t  <tr>\r\n\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">만료 일자</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t<input id=\"ENDDATE\" name=\"ENDDATE\" type=\"text\" class=\"input_form1\" style=\"width:70px\" value=\"\" readonly>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t<a><img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, document.getElementById('ENDDATE'), 'yyyymmdd')\" style=\"CURSOR: Hand;\"></a>\r\n\t\t\t\t\t\t</td>\t  \r\n\t\t\t\t\t  </tr>\r\n\t\t\t\t\t</table></td>\r\n\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">신청 장소</td>\r\n\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t<input id=\"DEPT\" name=\"DEPT\" type=\"text\" class=\"input_form1\" style=\"width:250px\" value=\"";
  private final static String _jspx_template19 = " ";
  private final static String _jspx_template20 = "\" maxlength=\"30\">\r\n\t\t\t\t</td>\r\n\t\t\t  </tr>\r\n\t\t\t  \r\n\t\t\t  <tr>\r\n\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">비고</td>\r\n\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t\t  \t<tr>\r\n\t\t\t\t\t<td>\r\n\t\t\t\t\t\t<input id=\"NOTES\" name=\"NOTES\" type=\"text\" class=\"input_form1\" style=\"width:98%\" value=\"\" maxlength=\"100\">\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t  </tr>\r\n\r\n\t\t  </table></td>\r\n\t\t</tr>\r\n\t\t\r\n\t\t<tr>\r\n\t\t\t<td height=\"40\" align=\"right\">\r\n\t\t  \t\t<img src=\"/img/print_icon.gif\" onclick=\"fnPreView();\" alt=\"안내문 출력\" border=\"0\" style=\"CURSOR: Hand;\">\r\n\t\t\t</td>\r\n\t\t</tr>\r\n\t\r\n\t\t<tr></tr><tr></tr>\r\n\t\t\r\n        <tr>\r\n          <td height=\"1\" bgcolor=\"#EAEAEA\"></td>\r\n        </tr> \r\n\t\r\n\t    <tr>\r\n\t    \t<td height=\"30\" colspan=\"0\" align=\"left\" bgcolor=\"#FFFFFF\" class=\"\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t    \t<tr>\r\n\t\t\t       <td><span class=\"sub_stan_blue\">* 점용기간 연장</span></td>\r\n\t\t\t    </tr>\r\n\t    \t</table></td>\r\n\t    </tr>\r\n\t    \r\n\t\t  <td><table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n \r\n\t\t\t  <tr>\r\n\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">담당자</td>\r\n\t\t\t\t<td width=\"37%\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t<input id=\"EXT_MANAGER\" name=\"EXT_MANAGER\" type=\"text\" class=\"input_form1\" style=\"width:120px\"  value=\"";
  private final static String _jspx_template21 = "\" maxlength=\"10\"></td>\r\n\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">등록일자</td>\r\n\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t<td><input id=\"EXT_REGDATE\" name=\"EXT_REGDATE\" type=\"text\" class=\"input_form1\" style=\"width:70px\" value=\"";
  private final static String _jspx_template22 = "\" readonly></td>\r\n\t\t\t\t\t\t<td><a><img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, EXT_REGDATE, 'yyyymmdd')\" style=\"CURSOR: Hand;\"></a></td>\t\t\t\t\t  \r\n\t\t\t\t\t  </tr>\r\n\t\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t  </tr>\r\n\t\t\t\r\n\t\t\t  <tr>\r\n\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">기간연장 시작</td>\r\n\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td><input id=\"EXT_FROMDATE\" name=\"EXT_FROMDATE\" type=\"text\" class=\"input_form1\" style=\"width:70px\" value=\"";
  private final static String _jspx_template23 = "\" readonly></td>\r\n\t\t\t\t\t<td><a><img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, document.getElementById('EXT_FROMDATE'), 'yyyymmdd')\" style=\"CURSOR: Hand;\"></a></td>\t\t\t\t  \r\n\t\t\t\t  </tr>\r\n\t\t\t\t</table></td>\r\n\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">기간연장 종료</td>\r\n\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td><input id=\"EXT_TODATE\" name=\"EXT_TODATE\" type=\"text\" class=\"input_form1\" style=\"width:70px\" value=\"";
  private final static String _jspx_template24 = "\" readonly></td>\r\n\t\t\t\t\t<td><a><img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, document.getElementById('EXT_TODATE'), 'yyyymmdd')\" style=\"CURSOR: Hand;\"></a></td>\t\t\t\t  \r\n\t\t\t\t  </tr>\r\n\t\t\t\t</table></td>\r\n\t\t\t  </tr>\r\n\t\t\t  \r\n\t\t\t  <tr>\r\n\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">비고</td>\r\n\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t\t  \t<tr>\r\n\t\t\t\t\t<td>\r\n\t\t\t\t\t\t<input id=\"EXT_NOTES\" name=\"EXT_NOTES\" type=\"text\" class=\"input_form1\" style=\"width:98%\" value=\"";
  private final static String _jspx_template25 = "\" maxlength=\"50\">\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t  </tr>\r\n\t\t\t  \r\n\t\t  </table></td>\r\n\r\n\t\t<tr>\r\n\t\t\t<td height=\"40\" align=\"right\">\r\n\t\t  \t\t<a><img src=\"/img/mod_icon.gif\" border=\"0\" onclick=\"javascript:Save();\" style=\"CURSOR: Hand;\"></a>\r\n\t\t\t</td>\r\n\t\t</tr>\t\t\r\n\t\t\r\n\t</table></td>\r\n  </tr>\r\n\r\n\r\n</table>\r\n</form>\r\n</body>\r\n</html>";
}
