package jeus_jspwork._jsp._gapan._saewe._tab;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_bugwa_5fview_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(54,45);to=(54,53)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(55,40);to=(55,43)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(56,43);to=(56,49)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TAX_YN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(59,44);to=(59,57)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SIGU_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(60,45);to=(60,58)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.DEPT_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(61,45);to=(61,53)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${semok_cd}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(62,43);to=(62,49)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${tax_ym}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(63,46);to=(63,61)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TAX_GUBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(64,43);to=(64,55)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TAX_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(65,44);to=(65,51)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${user_id}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(66,45);to=(66,53)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bukwa_id}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(77,63);to=(77,75)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TAX_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(79,51);to=(79,60)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TAX_GUBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(86,13);to=(86,21)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${tax_year}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(87,13);to=(87,22)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${tax_month}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // jsp code [from=(91,51);to=(91,57)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TAX_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);
      // jsp code [from=(98,14);to=(98,27)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SIGU_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template26);
      // jsp code [from=(98,32);to=(98,43)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GU_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // jsp code [from=(104,14);to=(104,27)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.DEPT_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template28);
      // jsp code [from=(104,32);to=(104,45)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.DEPT_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template29);
      // jsp code [from=(111,51);to=(111,68)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OCR_SIGU_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template30);
      // jsp code [from=(113,51);to=(113,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OCR_BUSEO_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template31);
      // jsp code [from=(118,63);to=(118,75)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TAXPAYER_SET}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template32);
      // jsp code [from=(123,63);to=(123,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${LIVE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template33);
      // jsp code [from=(125,51);to=(125,58)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${OBJ_SET}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template34);
      // jsp code [from=(130,63);to=(130,74)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BONSE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template35);
      // jsp code [from=(132,51);to=(132,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SUBUSEO_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template36);
      // jsp code [from=(136,63);to=(136,73)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SISE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template37);
      // jsp code [from=(138,51);to=(138,61)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GUSE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template38);
      // jsp code [from=(144,63);to=(144,72)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.VAT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template39);
      // jsp code [from=(146,51);to=(146,65)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TAX_DATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template40);
      // jsp code [from=(151,63);to=(151,74)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.INTAX}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template41);
      // jsp code [from=(153,51);to=(153,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.INDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template42);
      // jsp code [from=(158,63);to=(158,76)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OVERTAX}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template43);
      // jsp code [from=(160,51);to=(160,65)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OVERDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template44);
      // jsp code [from=(165,63);to=(165,73)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADD_SET_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template45);
      // jsp code [from=(168,9);to=(168,21)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADD_YN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template46);
      // jsp code [from=(174,63);to=(174,74)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.NOTES}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template47);
      // jsp code [from=(179,63);to=(179,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.LIMIT_SUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template48);
      // jsp code [from=(181,51);to=(181,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.LIMIT_CNT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template49);
      // jsp code [from=(186,63);to=(186,73)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template50);
      // jsp code [from=(188,51);to=(188,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.RATE_CAUSE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template51);
      // jsp code [from=(210,39);to=(210,50)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BONSE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template52);
      // jsp code [from=(211,27);to=(211,37)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SISE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template53);
      // jsp code [from=(212,27);to=(212,37)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GUSE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template54);
      // jsp code [from=(213,26);to=(213,35)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.VAT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template55);
      // jsp code [from=(214,26);to=(214,37)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.INTAX}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template56);
      // jsp code [from=(215,26);to=(215,39)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OVERTAX}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template57);

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
  private final static String _jspx_template2 = "    \r\n";
  private final static String _jspx_template3 = "\r\n";
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "  \r\n";
  private final static String _jspx_template6 = "  \r\n";
  private final static String _jspx_template7 = "\r\n";
  private final static String _jspx_template8 = "\r\n";
  private final static String _jspx_template9 = "      \r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n}\r\n-->\r\n\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script type=\"text/javascript\">\r\n//<![CDATA[\r\n\r\n\tfunction\tModify()\r\n\t{\r\n\t\tvar form = document.form;\r\n\r\n\t\tif(form.TAX_YN.value == \"1\")\r\n\t\t{\r\n\t\t\talert(\"부과된 정보는 수정할수 없습니다.\");\r\n\t\t\treturn;\r\n\t\t}\r\n\r\n\t\tform.action = \"/gapan/saewe/bugwa_modify.do\";\r\n\t\tform.submit();\r\n\t}\r\n\r\n\tfunction \tInit()\r\n\t{\r\n\t\tparent.TabDown_Img(\"bugwa\");\r\n\t\t\r\n\t\tparent.Bugwa_On();\r\n\t}\r\n\t\r\n//]]>\r\n</script>\r\n\r\n<body onload=\"Init();\">\r\n\r\n<form id=\"form\" method=\"post\">\r\n<input type=\"hidden\" id=\"GAPAN_NO\" value=\"";
  private final static String _jspx_template10 = "\">\r\n<input type=\"hidden\" id=\"SEQ\" value=\"";
  private final static String _jspx_template11 = "\">\r\n<input type=\"hidden\" id=\"TAX_YN\" value=\"";
  private final static String _jspx_template12 = "\">\r\n<input type=\"hidden\" id=\"VIEWPAGE\" value=\"VIEWPAGE\">\r\n\r\n<input type=\"hidden\" id=\"sigu_cd\" value=\"";
  private final static String _jspx_template13 = "\">\r\n<input type=\"hidden\" id=\"buseo_cd\" value=\"";
  private final static String _jspx_template14 = "\">\r\n<input type=\"hidden\" id=\"semok_cd\" value=\"";
  private final static String _jspx_template15 = "\">\r\n<input type=\"hidden\" id=\"tax_ym\" value=\"";
  private final static String _jspx_template16 = "\">\r\n<input type=\"hidden\" id=\"tax_gubun\" value=\"";
  private final static String _jspx_template17 = "\">\r\n<input type=\"hidden\" id=\"tax_no\" value=\"";
  private final static String _jspx_template18 = "\">\r\n<input type=\"hidden\" id=\"user_id\" value=\"";
  private final static String _jspx_template19 = "\">\r\n<input type=\"hidden\" id=\"bukwa_id\" value=\"";
  private final static String _jspx_template20 = "\">\r\n<table width=\"780\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\r\n\t  <tr>\r\n\t\t<td align=\"left\" class=\"contborder_blue\">\r\n\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t<tr>\r\n\t\t\t  <td><table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">과세번호</td>\r\n\t\t\t\t\t<td width=\"37%\" bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template21 = "</td>\r\n\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">과세구분</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template22 = "</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">과세년월</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t<td>";
  private final static String _jspx_template23 = " 년&nbsp;&nbsp;</td>\r\n\t\t\t\t\t\t<td>";
  private final static String _jspx_template24 = " 월</td>\r\n\t\t\t\t   \t  </tr>\r\n\t\t\t\t\t</table></td>\r\n\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">세목코드</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template25 = "</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">기관코드</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t<td>[";
  private final static String _jspx_template26 = "] ";
  private final static String _jspx_template27 = "</td>\r\n\t\t\t\t   \t  </tr>\r\n\t\t\t\t\t</table></td>\r\n\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">부서코드</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t<td>[";
  private final static String _jspx_template28 = "] ";
  private final static String _jspx_template29 = "</td>\r\n\t\t\t\t   \t  </tr>\r\n\t\t\t\t\t</table></td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">OCR시구코드</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template30 = "</td>\r\n\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">OCR부서코드</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template31 = "</td>\r\n\t\t\t\t</tr>\t\r\n\t\t\t\t\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">납세자구분</td>\r\n\t\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template32 = "</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">거주상태</td>\r\n\t\t\t\t\t<td width=\"181\" bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template33 = "</td>\r\n\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">물건구분</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template34 = "</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">본세</td>\r\n\t\t\t\t\t<td width=\"181\" bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template35 = " 원 </td>\r\n\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">수납부서</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template36 = "</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">시세</td>\r\n\t\t\t\t\t<td width=\"181\" bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template37 = " 원</td>\r\n\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">구세</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template38 = " 원</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t\r\n\t\t\t\t\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">부가가치세</td>\r\n\t\t\t\t\t<td width=\"181\" bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template39 = " 원</td>\r\n\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">과세일자</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template40 = "</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">납기내금액</td>\r\n\t\t\t\t\t<td width=\"181\" bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template41 = " 원</td>\r\n\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">납기내일자</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template42 = "</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">납기후금액</td>\r\n\t\t\t\t\t<td width=\"181\" bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template43 = " 원</td>\r\n\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">납기후일자</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template44 = "</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">가산율구분</td>\r\n\t\t\t\t\t<td width=\"181\" bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template45 = "</td>\r\n\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">가산금면제여부</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t";
  private final static String _jspx_template46 = "\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">비고</td>\r\n\t\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template47 = "</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">적용 상한율</td>\r\n\t\t\t\t\t<td width=\"181\" bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template48 = " %</td>\r\n\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">상한횟수</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template49 = " 회</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">특별이율</td>\r\n\t\t\t\t\t<td width=\"181\" bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template50 = " %</td>\r\n\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">특별이율 사유</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template51 = "</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t  \r\n\t\t\t  </table></td>\r\n\t\t\t</tr>\r\n\t\t\t\r\n\t\t      <tr>\r\n\t\t        <td height=\"14\"></td>\r\n\t\t      </tr>\r\n\t\t\t\t\r\n\t\t<tr>\r\n\t\t\t<td><table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t    <tr>\r\n\t\t        <td width=\"16%\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">본세</td>\r\n\t\t        <td width=\"16%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">시세</td>\r\n\t\t        <td width=\"16%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">구세</td>\r\n\t\t        <td width=\"16%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">부가가치세</td>\r\n\t\t        <td width=\"16%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">납기내금액</td>\r\n\t\t        <td width=\"16%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">납기후금액</td>\r\n\t\t    </tr>\r\n\t\t    \r\n\t\t\t<tr>\r\n \t\t\t\t<td height=\"26\" align=\"center\">";
  private final static String _jspx_template52 = "</td>\r\n \t\t\t\t<td align=\"center\">";
  private final static String _jspx_template53 = "</td>\r\n \t\t\t\t<td align=\"center\">";
  private final static String _jspx_template54 = "</td>\r\n\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template55 = "</td>\r\n\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template56 = "</td>\r\n\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template57 = "</td>\r\n             </tr>\r\n\t\t\t</table></td>\r\n\t\t</tr>\r\n\r\n<!--\t\t\t<tr>-->\r\n<!--\t\t\t  <td height=\"40\" align=\"right\">-->\r\n<!--\t\t\t  \t<img src=\"/img/mod_icon.gif\" alt=\"수정\" onclick=\"javascript:Modify();\" width=\"56\" height=\"18\" border=\"0\">-->\r\n<!--\t\t\t  </td>-->\r\n<!--\t\t\t</tr>-->\r\n\t\t\t\r\n\t\t\t\r\n\t\t</table>\r\n\t\t</td>\r\n\t  </tr>\r\n\r\n</table>\r\n</form>\r\n\r\n</body>\r\n</html>";
}
