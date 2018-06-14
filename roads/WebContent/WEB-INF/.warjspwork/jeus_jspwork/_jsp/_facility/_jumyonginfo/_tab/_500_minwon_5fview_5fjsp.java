package jeus_jspwork._jsp._facility._jumyonginfo._tab;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_minwon_5fview_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(118,46);to=(118,54)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(119,42);to=(119,45)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(129,149);to=(129,155)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${REQ_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(131,136);to=(131,141)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GUBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(137,101);to=(137,109)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${REQ_DATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(143,100);to=(143,108)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PRE_DATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(150,138);to=(150,145)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${REQ_DEP}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(152,141);to=(152,151)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MANAGE_DEP}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(157,137);to=(157,143)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${REQ_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(159,138);to=(159,145)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MANAGER}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(164,92);to=(164,97)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${NOTES}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(170,139);to=(170,147)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${AGENT_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(172,140);to=(172,149)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${AGENT_TEL}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(177,135);to=(177,139)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(179,134);to=(179,137)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SSN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // jsp code [from=(186,99);to=(186,103)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${POST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);
      // jsp code [from=(191,94);to=(191,99)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADDR1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template26);
      // jsp code [from=(192,94);to=(192,99)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADDR2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // jsp code [from=(197,134);to=(197,137)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TEL}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template28);
      // jsp code [from=(199,133);to=(199,135)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${HP}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template29);

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
  private final static String _jspx_template1 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('사용자의 사용시간이 종료되었습니다. 다시 접속 해주시기 바랍니다.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template2 = "\r\n";
  private final static String _jspx_template3 = "\r\n";
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "  \r\n";
  private final static String _jspx_template6 = "  \r\n";
  private final static String _jspx_template7 = "\r\n";
  private final static String _jspx_template8 = "\r\n";
  private final static String _jspx_template9 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script language='JavaScript' src='/js/Check_inputbox.js'></script>\r\n<script language=\"javascript\" src=\"/js/Ajax_request.js\"></script>\r\n\r\n\r\n<script type=\"text/javascript\">\r\n//<![CDATA[\r\n\tfunction\tPage(page)\r\n\t{\r\n\t\tif(page\t==\t\"\")\r\n\t\t\treturn;\r\n\t\t\r\n\t\tvar form = document.form;\r\n\r\n\t\tform.action = \"minwon_view.do?currentPage=\" + page;\r\n\t\tform.submit();\r\n\t}\r\n\r\n\tfunction\tResult_InfoView(obj)\r\n\t{\r\n\t\t//document.write(obj);\r\n        var xmldoc \t= new ActiveXObject(\"Microsoft.XMLDOM\");\r\n        var form \t= document.form;\r\n\t\t\r\n        xmldoc.async\t= false;\r\n\t\txmldoc.loadXML(obj);\r\n\r\n\t\tform.ADMIN_NO.value\t\t=\txmldoc.getElementsByTagName(\"ADMIN_NO\").item(0).text;\r\n\t\tform.SEQ.value\t\t\t=\txmldoc.getElementsByTagName(\"SEQ\").item(0).text;\r\n\t\t\r\n\t\tform.REQ_NO_MIN.value\t\t=\txmldoc.getElementsByTagName(\"REQ_NO_MIN\").item(0).text;\r\n\t\tform.GUBUN_MIN.value\t\t=\txmldoc.getElementsByTagName(\"GUBUN_MIN\").item(0).text;\r\n\t\tform.REQ_DATE_MIN.value\t\t=\txmldoc.getElementsByTagName(\"REQ_DATE_MIN\").item(0).text;\r\n\t\tform.PREDATE_MIN.value\t\t=\txmldoc.getElementsByTagName(\"PREDATE_MIN\").item(0).text;\r\n\t\tform.REQ_DEP_MIN.value\t\t=\txmldoc.getElementsByTagName(\"REQ_DEP_MIN\").item(0).text;\r\n\t\tform.MANAGE_DEP_MIN.value\t=\txmldoc.getElementsByTagName(\"MANAGE_DEP_MIN\").item(0).text;\r\n\t\tform.REQ_NM_MIN.value\t\t=\txmldoc.getElementsByTagName(\"REQ_NM_MIN\").item(0).text;\r\n\t\tform.MANAGER_MIN.value\t\t=\txmldoc.getElementsByTagName(\"MANAGER_MIN\").item(0).text;\r\n\t\tform.NOTES_MIN.value\t\t=\txmldoc.getElementsByTagName(\"NOTES_MIN\").item(0).text;\r\n\t\tform.AGENT_NM_MIN.value\t\t=\txmldoc.getElementsByTagName(\"AGENT_NM_MIN\").item(0).text;\r\n\t\tform.AGENT_TEL_MIN.value\t=\txmldoc.getElementsByTagName(\"AGENT_TEL_MIN\").item(0).text;\r\n\t\tform.NAME_MIN.value\t\t\t=\txmldoc.getElementsByTagName(\"NAME_MIN\").item(0).text;\r\n\t\tform.SSN_MIN.value\t\t\t=\txmldoc.getElementsByTagName(\"SSN_MIN\").item(0).text;\r\n\t\tform.POST_MIN.value\t\t\t=\txmldoc.getElementsByTagName(\"POST_MIN\").item(0).text;\r\n\t\tform.ADDR1_MIN.value\t\t=\txmldoc.getElementsByTagName(\"ADDR1_MIN\").item(0).text;\r\n\t\tform.ADDR2_MIN.value\t\t=\txmldoc.getElementsByTagName(\"ADDR2_MIN\").item(0).text;\r\n\t\tform.TEL_MIN.value\t\t\t=\txmldoc.getElementsByTagName(\"TEL_MIN\").item(0).text;\r\n\t\tform.HP_MIN.value\t\t\t=\txmldoc.getElementsByTagName(\"HP_MIN\").item(0).text;\r\n\t}\r\n\r\n\tfunction\tView(adminno, seq)\r\n\t{\t\r\n\t\tparams\t= \"ADMIN_NO=\" + adminno + \"&SEQ=\" + seq;\r\n\t\t\r\n\t\tsendRequest(\"/jumyong/minwoninfo/minwon_view_search.do\", params, \"GET\", Result_InfoView);\r\n\r\n\t//\tdocument.getElementById(\"SEQ\").value\t= seq;\r\n\r\n\t//\tparent.BugwaView(seq);\r\n\t}\r\n\r\n\tfunction\tRegister()\r\n\t{\r\n\t\tvar form = document.form;\r\n\r\n\t\tform.action = \"/jumyong/minwoninfo/minwon_register.do\";\r\n\t\tform.submit();\r\n\t}\r\n\t\r\n\tfunction\tModify()\r\n\t{\r\n\t\tvar form = document.form;\r\n\t\t\r\n\t\t//if(form.REQ_DATE_MIN.value\t== \"\")\r\n\t\t//{\r\n\t\t//\talert(\"수정할 데이터를 선택하세요.\");\r\n\t\t//\treturn;\r\n\t\t//}\r\n\r\n\t\tform.action = \"/facility/jumyonginfo/minwon_modify.do\";\r\n\t\tform.submit();\r\n\t}\r\n\t\r\n\tfunction \tInit()\r\n\t{\r\n\t\tvar ADMIN_NO = document.getElementById(\"ADMIN_NO\").value;\r\n\t\tvar SEQ = document.getElementById(\"SEQ\").value;\r\n\t\t\r\n\t\tif(SEQ !=\"\") View(ADMIN_NO, SEQ);\r\n//\t\tView(\"200911680101-2-0019\",\"6\");\r\n\t\tparent.Tab_Img(\"minwon\");\r\n\t}\r\n//]]>\r\n</script>\r\n\r\n<body onload=\"Init()\">\r\n<table width=\"780\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n<form name=\"form\" method=\"post\">\r\n<input type=\"hidden\" name=\"ADMIN_NO\" value=";
  private final static String _jspx_template10 = ">\r\n<input type=\"hidden\" name=\"SEQ\" value=\"";
  private final static String _jspx_template11 = "\">\r\n\r\n\t  <tr>\r\n\t\t<td align=\"left\" class=\"contborder_blue\">\r\n\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\r\n\t\t\t<tr>\r\n\t\t\t\t<td><table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t  \t<tr>\r\n\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">접수번호</td>\r\n\t\t\t\t\t<td width=\"37%\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"REQ_NO_MIN\" type=\"text\" class=\"view\" style=\"width:120px\" readonly value=\"";
  private final static String _jspx_template12 = "\"></td>\r\n\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">민원구분</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"GUBUN_MIN\" type=\"text\" class=\"view\" style=\"width:120px\" readonly value=\"";
  private final static String _jspx_template13 = "\"></td>\r\n\t\t\t  \t</tr>\r\n\t\t\t  \t<tr>\r\n\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">접수일자</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t<td><input name=\"REQ_DATE_MIN\" type=\"text\" class=\"view\" style=\"width:120px\" readonly value=\"";
  private final static String _jspx_template14 = "\"></td>\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t\t</table></td>\r\n\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">처리예정일자</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t<td><input name=\"PREDATE_MIN\" type=\"text\" class=\"view\" style=\"width:120px\" readonly value=\"";
  private final static String _jspx_template15 = "\"></td>\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t\t</table></td>\r\n\t\t\t  \t</tr>\r\n\t\t\t  \r\n\t\t\t  \t<tr>\r\n\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">접수부서</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"REQ_DEP_MIN\" type=\"text\" class=\"view\" style=\"width:120px\" readonly value=\"";
  private final static String _jspx_template16 = "\"></td>\r\n\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">담당부서</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"MANAGE_DEP_MIN\" type=\"text\" class=\"view\" style=\"width:120px\" readonly value=\"";
  private final static String _jspx_template17 = "\"></td>\r\n\t\t\t  \t</tr>\r\n\t\t\t  \r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">접수자명</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"REQ_NM_MIN\" type=\"text\" class=\"view\" style=\"width:120px\" readonly value=\"";
  private final static String _jspx_template18 = "\"></td>\r\n\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">담당자명</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"MANAGER_MIN\" type=\"text\" class=\"view\" style=\"width:120px\" readonly value=\"";
  private final static String _jspx_template19 = "\"></td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">민원요지</td>\r\n\t\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t<input name=\"NOTES_MIN\" type=\"text\" class=\"view\" style=\"width:98%\" readonly value=\"";
  private final static String _jspx_template20 = "\">\r\n\t\t\t\t\t</table></td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">대리인</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"AGENT_NM_MIN\" type=\"text\" class=\"view\" style=\"width:120px\" readonly value=\"";
  private final static String _jspx_template21 = "\"></td>\r\n\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">대리인 연락처</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"AGENT_TEL_MIN\" type=\"text\" class=\"view\" style=\"width:120px\" readonly value=\"";
  private final static String _jspx_template22 = "\"></td>\r\n\t\t\t\t</tr>\r\n\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">민원인명</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"NAME_MIN\" type=\"text\" class=\"view\" style=\"width:120px\" readonly value=\"";
  private final static String _jspx_template23 = "\"></td>\r\n\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">민원인 주민번호</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"SSN_MIN\" type=\"text\" class=\"view\" style=\"width:120px\" readonly value=\"";
  private final static String _jspx_template24 = "\"></td>\r\n\t\t\t\t</tr>\r\n\t\t\t  \r\n\t\t\t \t<tr>\r\n\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">민원인 우편번호</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t  \t<td><input name=\"POST_MIN\" type=\"text\" class=\"view\" style=\"width:50px\" readonly value=\"";
  private final static String _jspx_template25 = "\"></td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t</table></td>\r\n\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">민원인 주소</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t<input name=\"ADDR1_MIN\" type=\"text\" class=\"view\" style=\"width:250px\" readonly value=\"";
  private final static String _jspx_template26 = "\">\r\n\t\t\t\t\t\t<input name=\"ADDR2_MIN\" type=\"text\" class=\"view\" style=\"width:250px\" readonly value=\"";
  private final static String _jspx_template27 = "\">\r\n\t\t\t\t\t</td>\r\n\t\t\t  \t</tr>\r\n\t\t\t  \t<tr>\r\n\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">민원인 전화</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"TEL_MIN\" type=\"text\" class=\"view\" style=\"width:120px\" readonly value=\"";
  private final static String _jspx_template28 = "\"></td>\r\n\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">민원인 휴대폰</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"HP_MIN\" type=\"text\" class=\"view\" style=\"width:120px\" readonly value=\"";
  private final static String _jspx_template29 = "\"></td>\r\n\t\t\t  \t</tr>\r\n\t\t\t\t  \r\n\t\t\t  </table></td>\r\n\t\t\t</tr>\r\n\r\n\t\t\t<tr>\r\n\t\t\t  <td height=\"40\" align=\"right\">\r\n\t\t\t  <table width=\"0\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"right\">\r\n\t\t\t\t<a href=\"javascript:Modify()\"><img src=\"/img/mod_icon.gif\" alt=\"수정\" border=\"0\"></a>\r\n\t\t\t\t<!-- a href=\"javascript:Register()\"><img src=\"/img/add_icon.gif\" alt=\"추가\" border=\"0\"></a> -->\r\n\t\t\t  </table>\r\n\t\t\t  </td>\r\n\t\t\t</tr>\r\n\t\t\t\r\n\t\t</table></td>\r\n\t  </tr>\r\n\r\n</table>\r\n\r\n</body>\r\n</html>";
}
