package jeus_jspwork._jsp._facility._jumyonginfo._tab;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_jumin_5fview_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(58,48);to=(58,56)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template3);
      // jsp code [from=(59,47);to=(59,54)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${CORP_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template4);
      // jsp code [from=(60,47);to=(60,54)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GU_CODE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template5);
      // jsp code [from=(73,80);to=(73,90)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template6);
      // jsp code [from=(75,68);to=(75,77)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SSN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template7);
      // jsp code [from=(80,52);to=(80,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOPOST_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template8);
      // jsp code [from=(82,52);to=(82,64)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BIZSSN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template9);
      // jsp code [from=(88,10);to=(88,20)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.POST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(88,24);to=(88,35)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADDR1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(88,39);to=(88,50)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADDR2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(94,52);to=(94,68)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BIZ_STATUS}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(96,52);to=(96,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BIZ_TYPES}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(113,11);to=(113,23)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOPOST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(113,27);to=(113,40)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOADDR1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(113,44);to=(113,57)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOADDR2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(128,52);to=(128,64)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OFFICE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(128,70);to=(128,83)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.MANAGER}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(130,52);to=(130,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOTEL}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(130,68);to=(130,83)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOTEL_EXT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(134,52);to=(134,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOFAX}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(136,52);to=(136,60)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.HP}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(144,69);to=(144,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${object_no}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);

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
  private final static String _jspx_template2 = "    \r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n}\r\n-->\r\n\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script type=\"text/javascript\">\r\n//<![CDATA[\r\n\r\n\tfunction\tModify(object_no)\r\n\t{\r\n\t\tvar form = document.form;\r\n\r\n\t\tform.action = \"/facility/jumyonginfo/jumin_modify.do?object_no=\"+object_no;\r\n\t\tform.submit();\r\n\t}\r\n\r\n\tfunction \tInit()\r\n\t{\r\n\t\tparent.Tab_Img(\"jumin\");\r\n\t}\r\n\t\r\n\tfunction\tView(adminno, seq)\r\n\t{\r\n\t\tparams\t= \"ADMIN_NO=\" + adminno + \"&SEQ=\" + seq;\r\n\t\t\r\n\t\tsendRequest(\"/facility/minwoninfo/minwon_view_search.do\", params, \"GET\", Result_InfoView);\r\n\r\n\t\t\r\n\t//\tdocument.getElementById(\"SEQ\").value\t= seq;\r\n\r\n\t//\tparent.BugwaView(seq);\r\n\t}\r\n\r\n//]]>\r\n</script>\r\n\r\n<body onload=\"Init()\">\r\n\r\n<form name=\"form\" method=\"post\">\r\n\t<input type=\"hidden\" name=\"ADMIN_NO\" value=\"";
  private final static String _jspx_template3 = "\">\r\n\t<input type=\"hidden\" name=\"CORP_CD\" value=\"";
  private final static String _jspx_template4 = "\">\r\n\t<input type=\"hidden\" name=\"GU_CODE\" value=\"";
  private final static String _jspx_template5 = "\">\r\n\r\n\t<table width=\"780\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t<tr>\r\n\t\t\t<td align=\"left\" class=\"contborder_purple\">\r\n\t\t\t\r\n\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t<tr>\r\n\t\t\t\t  <td>\r\n\t\t\t\t  \r\n\t\t\t\t  <table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t\t\t  <tr height=\"25\">\r\n\t\t\t\t\t\t<td width=\"100\" height=\"25\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" nowrap=\"nowrap\">점용인(법인명)</td>\r\n\t\t\t\t\t\t<td width=\"37%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" nowrap=\"nowrap\">";
  private final static String _jspx_template6 = "</td>\r\n\t\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" nowrap=\"nowrap\">주민(법인)번호</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" nowrap=\"nowrap\">";
  private final static String _jspx_template7 = "</td>\r\n\t\t\t\t\t  </tr>\r\n\t\r\n\t\t\t\t\t  <tr height=\"25\">\r\n\t\t\t\t\t\t<td height=\"25\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">대표자명</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template8 = "</td>\r\n\t\t\t\t\t\t<td height=\"25\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">사업자 등록번호</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template9 = "</td>\r\n\t\t\t\t\t  </tr>\r\n\t\r\n\t\t\t\t\t  <tr height=\"25\">\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" height=\"25\">점용인 주소</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template10 = " ";
  private final static String _jspx_template11 = " ";
  private final static String _jspx_template12 = "\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t  </tr>\r\n\t\t\t\t\t  \r\n\t\t\t\t\t  <tr height=\"25\">\r\n\t\t\t\t\t  \t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" height=\"25\">업태</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template13 = "</td>\r\n\t\t\t\t\t  \t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" height=\"25\">종목</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template14 = "</td>\r\n\t\t\t\t\t  </tr>\r\n\t\r\n\t\r\n\t\t\t\t\t  <tr height=\"25\">\r\n\t\t\t\t\t\t<td height=\"34\" colspan=\"4\" align=\"left\" bgcolor=\"#FFFFFF\" class=\"\">\r\n\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t  <td><span class=\"sub_stan_blue\"><img src=\"/img/facility_view5.gif\" alt=\"우편물 송달지\"></span></td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t  </tr>\r\n\t\t\t\t\t  \r\n\t\t\t\t\t  <tr height=\"25\">\r\n\t\t\t\t\t  \t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">송달지 주소</td>\r\n\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\" height=\"25\">\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template15 = "\t";
  private final static String _jspx_template16 = "\t";
  private final static String _jspx_template17 = "\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t  \r\n\t\t\t\t\t  <tr height=\"25\">\r\n\t\t\t\t\t\t<td height=\"34\" colspan=\"4\" align=\"left\" bgcolor=\"#FFFFFF\" class=\"\">\r\n\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t  <td><span class=\"sub_stan_blue\"><img src=\"/img/facility_view6.gif\" alt=\"담당자 정보\"></span></td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t  </tr>\r\n\t\t\t\t\t  <tr height=\"25\">\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">지점명/담당자명</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template18 = "   ";
  private final static String _jspx_template19 = "</td>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">전화번호</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template20 = "  ";
  private final static String _jspx_template21 = "</td>\r\n\t\t\t\t\t  </tr>\r\n\t\t\t\t\t  <tr height=\"25\">\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">팩스 </td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template22 = "</td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">휴대전화</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template23 = "</td>\r\n\t\t\t\t\t  </tr>\r\n\t\t\t\t  </table></td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"40\" align=\"right\">\r\n\t\t\t\t\t<table width=\"0\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"right\">\r\n\t\t\t\t  \t\t<td height=\"40\" align=\"right\"><a href=\"javascript:Modify('";
  private final static String _jspx_template24 = "')\"><img src=\"/img/mod_icon.gif\" alt=\"수정\" width=\"56\" height=\"18\" border=\"0\"></a>\r\n\t\t\t\t  \t</table>\r\n\t\t\t\t  \t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t</table></td>\r\n\t\t</tr>\r\n\t</table>\r\n\r\n</form>\r\n</body>\r\n</html>\r\n";
}
