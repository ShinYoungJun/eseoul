package jeus_jspwork._jsp._admin._deleteMove;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_list_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(76,9);to=(76,12)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MSG}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(77,22);to=(77,25)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MSG}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(79,53);to=(79,57)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(80,60);to=(80,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${YEAR-1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(81,59);to=(81,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(83,46);to=(83,50)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(152,14);to=(152,21)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GU_CODE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(195,14);to=(195,21)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GU_CODE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(275,17);to=(275,23)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${org_cd}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);

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
  private final static String _jspx_template8 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('������� ���ð��� ����Ǿ����ϴ�. �ٽ� ���� ���ֽñ� �ٶ��ϴ�.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template9 = "\r\n<script language=\"javascript\" src=\"/js/privateFunction.js\"></script>";
  private final static String _jspx_template10 = "\r\n\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: ����� ������������ý��� :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody { \r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script language=\"javascript\" src=\"/js/common.js\"></script> \r\n<!--  //********** BEGIN_����_20120319 -->\r\n<script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script> \r\n<!--   //********** END_����_20120319 -->\r\n<script type=\"text/javascript\">\r\n//<![CDATA[\r\n\t           \r\n\tfunction  deleteGapan()\r\n\t{\r\n\t\tvar w = document.deleteForm;\r\n\t\tif(siguCheck(w.GU_CD.value)){\r\n\t\t\t//********** BEGIN_KANG_20120420\r\n\t\t\t/*\r\n\t\t\tw.action = \"/admin/deleteMove/delete.do\";\t\r\n\t\t\tw.submit();\r\n\t\t\t*/\r\n\t\t\tvar year = w.SURVEY_YEAR.value;\r\n\t\t\tif(confirm(year + \"�⵵ �����͸� �����Ͻðڽ��ϱ�?\")){\r\n\t\t\t\tw.action = \"/admin/deleteMove/delete.do\";\t\r\n\t\t\t\tw.submit();\r\n\t\t\t}\r\n\t\t\t//********** END_KANG_20120420\r\n\t\t}else{\r\n\t\t\tw.GU_CD.focus();\r\n\t\t\treturn\r\n\t\t}\t\t\t\r\n\t}\r\n\r\n\tfunction  moveGapan()\r\n\t{\t\r\n\t\tvar w = document.moveForm;\r\n\t\tif(siguCheck(w.GU_CD.value)){\r\n\t\t\tw.action = \"/admin/deleteMove/move.do\";\t\r\n\t\t\tw.submit();\r\n\t\t}else{\r\n\t\t\tw.GU_CD.focus();\r\n\t\t\treturn\r\n\t\t}\t\r\n\t}\r\n\r\n\tfunction  changeGapanUpdate()\r\n\t{\t\r\n\t\tvar w = document.changeForm;\r\n\t\tvar year = w.YEAR.value;\r\n\t\tvar update = w.UPDATE.value;\r\n\t\tif(confirm(year + \" ����⵵��  ��������  \" + update +\"�� �����Ͻðڽ��ϱ�?\")){\r\n\t\t\tw.action = \"/admin/deleteMove/changeGapanUpdate.do\";\t\r\n\t\t\tw.submit();\r\n\t\t}\r\n\t}\r\n\t\r\n\tfunction InitPage()\r\n    {\t\t\r\n\t\tif('";
  private final static String _jspx_template11 = "'.length > 0){\r\n            alert('";
  private final static String _jspx_template12 = "');\r\n        }\t\t\r\n\t\tsetYear(document.getElementById(\"SURVEY_YEAR\"),\"";
  private final static String _jspx_template13 = "\");\r\n\t\tsetYear(document.getElementById(\"BEFORE_SURVEY_YEAR\"),\"";
  private final static String _jspx_template14 = "\");\r\n\t\tsetYear(document.getElementById(\"AFTER_SURVEY_YEAR\"),\"";
  private final static String _jspx_template15 = "\");\r\n\t\t//********** BEGIN_����_20120319\r\n\t\tsetYear(document.getElementById(\"YEAR\"),\"";
  private final static String _jspx_template16 = "\");\r\n\t\t//********** END_����_20120319\t\t\r\n    }\r\n\r\n\tfunction  siguCheck(gu_cd)\r\n\t{\t\r\n\t\tif(gu_cd==\"000\"){\r\n\t\t\talert(\"�ñ������� �������ּ���.\");\r\n\t\t\treturn false;\r\n\t\t}else{\r\n\t\t\treturn true;\r\n\t\t}\r\n\t}\r\n\t\r\n//]]>\r\n</script>\r\n\r\n<body onload=\"javascript:InitPage();\">\r\n\r\n<table width=\"800\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t<tr>\r\n\t\t<td height=\"43\"><img src=\"/img/admin_cont3_title.gif\"\r\n\t\t\twidth=\"800\" height=\"43\"></td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td align=\"center\">\r\n\t\t<table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"1\" bgcolor=\"eaeaea\"></td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"14\"></td>\r\n\t\t\t</tr>\r\n\t\t</table>\r\n\r\n\t\t<table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t<tr>\r\n\t\t\t\t<td align=\"left\" height=\"22\" background=\"/img/tab_line_blue.gif\">\r\n\t\t\t\t\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t<tr>\t\r\n\t\t\t\t\t\t\t<td width=\"111\"><a href=\"/admin/section/list.do\"><img\r\n\t\t\t\t\t\t\t\tsrc=\"/img/sub_admin_section_off.gif \" alt=\"������ ����\" width=\"110\"\r\n\t\t\t\t\t\t\t\theight=\"22\" border=\"0\"></a>\r\n\t\t\t\t\t\t\t</td>\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t<td width=\"111\"><a href=\"#\"><img\r\n\t\t\t\t\t\t\t\tsrc=\"/img/sub_admin_deleteCopy_on.gif\" alt=\"�ϰ���� �� ����\" width=\"110\"\r\n\t\t\t\t\t\t\t\theight=\"22\" border=\"0\"></a>\r\n\t\t\t\t\t\t\t</td>\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td align=\"center\" class=\"contborder_blue\">\r\n\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t<!-- �ϰ� ����  -->\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td align=\"left\" height=\"20px\"><span class=\"sub_stan_blue\">* �ϰ� ����</span></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td align=\"left\">\r\n\t\t\t\t\t\t<form name=\"deleteForm\" id=\"deleteForm\">\r\n\t\t\t\t\t\t\t<table width=\"750px\" border=\"1\" bordercolor=\"#c9dfed\"\r\n\t\t\t\t\t\t\t\tstyle=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"\r\n\t\t\t\t\t\t\t\tclass=\"sub_table\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td width=\"70px\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">�ñ�����</td>\r\n\t\t\t\t\t\t\t\t\t<td width=\"160px\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t<select id=\"GU_CD\" name=\"GU_CD\" class=\"input_form1\" style=\"width:130px\">\r\n\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template17 = "\r\n\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t<td width=\"70px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">����⵵</td>\r\n\t\t\t\t\t\t\t\t\t<td width=\"160px\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t<select  id=\"SURVEY_YEAR\" name=\"SURVEY_YEAR\" class=\"input_form1\" style=\"width:130px\">\r\n\t                                    </select>\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t<td width=\"70px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">������ȣ</td>\r\n\t\t\t\t\t\t\t\t\t<td width=\"220px\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t <input id=\"GAPAN_NO\" name=\"GAPAN_NO\" type=\"text\" class=\"input_form1\" style=\"width: 130px\" value=\"\"/>\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</form>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td align=\"right\" height=\"30\">\r\n\t\t\t\t\t\t\t<a href=\"#\" id=\"deleteBtn\"><img src=\"/img/del_icon3.gif\" alt=\"����\" border=\"0\" onClick=\"javascript:deleteGapan();\"></a>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<!-- �ϰ�����  -->\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"1\" bgcolor=\"#EAEAEA\"></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"30px\"></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td align=\"left\" height=\"20px\"><span class=\"sub_stan_blue\">* �ϰ� ����</span></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td align=\"left\">\r\n\t\t\t\t\t\t<form name=\"moveForm\" id=\"moveForm\">\r\n\t\t\t\t\t\t\t<table width=\"750px\" border=\"1\" bordercolor=\"#c9dfed\"\r\n\t\t\t\t\t\t\t\tstyle=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"\r\n\t\t\t\t\t\t\t\tclass=\"sub_table\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td width=\"70px\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">�ñ�����</td>\r\n\t\t\t\t\t\t\t\t\t<td width=\"150px\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t<select id=\"GU_CD\" name=\"GU_CD\" class=\"input_form1\" style=\"width:130px\">\r\n\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template18 = "\r\n\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t<td width=\"70px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">����⵵</td>\r\n\t\t\t\t\t\t\t\t\t<td width=\"120px\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t<select  id=\"BEFORE_SURVEY_YEAR\" name=\"BEFORE_SURVEY_YEAR\" class=\"input_form1\" style=\"width:100px\">\r\n\t                                    </select>\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t<td width=\"70px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">����⵵</td>\r\n\t\t\t\t\t\t\t\t\t<td width=\"120px\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t<select  id=AFTER_SURVEY_YEAR name=\"AFTER_SURVEY_YEAR\" class=\"input_form1\" style=\"width:100px\">\r\n\t                                    </select>\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t<td width=\"70px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">������ȣ</td>\r\n\t\t\t\t\t\t\t\t\t<td width=\"140px\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t <input id=\"GAPAN_NO\" name=\"GAPAN_NO\" type=\"text\" class=\"input_form1\" style=\"width: 100px\" value=\"\"/>\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</form>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\t\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td align=\"right\" height=\"30\">\r\n\t\t\t\t\t\t\t<a href=\"#\"><img src=\"/img/copy_icon.gif\" alt=\"����\" border=\"0\" onClick=\"javascript:moveGapan();\"></a>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\t\r\n\t\t\t\t\t<!--  //********** BEGIN_����_20120317 -->\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"1\" bgcolor=\"#EAEAEA\"></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"30px\"></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td align=\"left\" height=\"20px\"><span class=\"sub_stan_blue\">* �ش� ����⵵ ������ ����</span></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td align=\"left\">\r\n\t\t\t\t\t\t<form name=\"changeForm\" id=\"changeForm\">\r\n\t\t\t\t\t\t\t<table width=\"750px\" border=\"1\" bordercolor=\"#c9dfed\"\r\n\t\t\t\t\t\t\t\tstyle=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"\r\n\t\t\t\t\t\t\t\tclass=\"sub_table\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td width=\"70px\"  height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">����⵵</td>\r\n\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t<select  id=\"YEAR\" name=\"YEAR\" class=\"input_form1\" style=\"width:100px\">\r\n\t                                    </select>\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t<td width=\"70px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">������</td>\r\n\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t<input id=\"UPDATE\" name=\"UPDATE\" type=\"text\" class=\"input_form1\" style=\"width:80px\" value=\"2012-03-19\" readonly>\r\n\t\t\t\t\t\t\t\t\t\t<a><img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, document.getElementById('UPDATE'), 'yyyymmdd');\" style=\"CURSOR: Hand;\"></a>\r\n\t\t\t\t\t\t\t\t\t</td>\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</form>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\t\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td align=\"right\" height=\"30\">\r\n\t\t\t\t\t\t\t<a href=\"#\"><img src=\"/img/register_icon2.gif\" alt=\"���\" border=\"0\" onClick=\"javascript:changeGapanUpdate();\"></a>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\t\r\n\t\t\t\t\t<!--   //********** END_����_20120317 -->\r\n\t\t\t\t\t\t\r\n\t\t\t\t</table>\r\n\t\t\t\t\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t\r\n\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n</table>\r\n\r\n</body>\r\n\r\n\r\n<script type=\"text/javascript\">\r\nvar org_cd = \"";
  private final static String _jspx_template19 = "\";\r\n//2015.09.21 ����� �����ڰ� �ƴϸ� ������ư ������ �ʰ�\r\nif(org_cd != \"0000000\"){\r\n\tdocument.getElementById(\"deleteBtn\").style.display=\"none\";\r\n}\r\n</script>\r\n\r\n\r\n</html>\r\n\r\n";
}
