package jeus_jspwork._jsp._jumyong._saewe._tab;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_sanchul_5fview_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(99,61);to=(99,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(100,51);to=(100,54)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(101,67);to=(101,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(108,81);to=(108,89)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${totalcnt}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template24);
      // jsp code [from=(138,7);to=(138,14)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${pageing}",java.lang.String.class , pageContext.getVariableResolver(), null));

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
  private boolean _jspx_th_c_forEach_0_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:forEach ---- //
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = new org.apache.taglibs.standard.tag.rt.core.ForEachTag();
    _jspx_th_c_forEach_0.setPageContext(pageContext);
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("board");
    _jspx_th_c_forEach_0.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template14);
            // jsp code [from=(122,37);to=(122,51)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template15);
            // jsp code [from=(122,57);to=(122,66)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template16);
            // jsp code [from=(123,38);to=(123,73)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${((currentPage * 2) + idx.count) - 2}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template17);
            // jsp code [from=(124,26);to=(124,36)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template18);
            // jsp code [from=(125,26);to=(125,37)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PRICE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template19);
            // jsp code [from=(126,26);to=(126,42)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.AREA_AFTER}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template20);
            // jsp code [from=(127,26);to=(127,36)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template21);
            // jsp code [from=(128,26);to=(128,44)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SANCHUL_DATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template22);
            // jsp code [from=(129,26);to=(129,42)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SUM_ADJUST}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template23);

          } while (_jspx_th_c_forEach_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
        }
        if (_jspx_th_c_forEach_0.doEndTag() == Tag.SKIP_PAGE)
          return true;
      } catch (Throwable t) {
        _jspx_th_c_forEach_0.doCatch(t);
      } finally {
        _jspx_th_c_forEach_0.doFinally();
      }
    } finally {
      _jspx_th_c_forEach_0.release();
    }
    return false;
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
  private final static String _jspx_template9 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n}\r\n-->\r\n\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script language=\"javascript\" src=\"/js/Ajax_request.js\"></script>\r\n\r\n<script type=\"text/javascript\">\r\n//<![CDATA[\r\n           \r\n\tfunction\tPage(page)\r\n\t{\r\n\t\tif(page\t==\t\"\")\r\n\t\t\treturn;\r\n\t\t\r\n\t\tvar form = document.form;\r\n\r\n\t\tform.action = \"sanchul_view.do?currentPage=\" + page;\r\n\t\tform.submit();\r\n\t}\r\n\r\n\tfunction\tView(adminno, seq)\r\n\t{\r\n\t//\tparent.BugwaCatch(year, seq);\t//\t산출 정보의 데이터를 뷰파일로 보낸다.\r\n\t\t\r\n\t\tparams\t= \"ADMIN_NO=\" + adminno + \"&SEQ=\" + seq;\r\n\t\t\r\n\t\tsendRequest(\"/jumyong/saewe/sanchulinfo_view.do\", params, \"GET\", Result_InfoView);\r\n\r\n\t\tdocument.getElementById(\"SEQ\").value\t= seq;\r\n\r\n\t\tparent.BugwaView(seq);\r\n\t}\r\n\r\n\tfunction\tResult_InfoView(obj)\r\n\t{\r\n\t\t//document.write(obj);\r\n        var xmldoc \t= new ActiveXObject(\"Microsoft.XMLDOM\");\r\n        var form \t= document.form;\r\n\r\n        xmldoc.async\t= false;\r\n\t\txmldoc.loadXML(obj);\r\n\r\n\t\tform.YEAR.value\t\t\t=\txmldoc.getElementsByTagName(\"YEAR\").item(0).text;\r\n\t\tform.PRICE.value\t\t=\txmldoc.getElementsByTagName(\"PRICE\").item(0).text;\r\n\t\tform.AREA_AFTER.value\t=\txmldoc.getElementsByTagName(\"AREA_AFTER\").item(0).text;\r\n\t\tform.RATE.value\t\t\t=\txmldoc.getElementsByTagName(\"RATE\").item(0).text;\r\n\t\tform.SANCHUL_DATE.value\t=\txmldoc.getElementsByTagName(\"SANCHUL_DATE\").item(0).text;\r\n\t\tform.SUM_ADJUST.value\t=\txmldoc.getElementsByTagName(\"SUM_ADJUST\").item(0).text;\r\n\t\tform.FORM_ADJUST.value\t=\txmldoc.getElementsByTagName(\"FORM_ADJUST\").item(0).text;\r\n\r\n\t\t// 점용구분에 따라 산출기간 다르게 보여짐 (일시일때..)\r\n\t\tif( xmldoc.getElementsByTagName(\"SECTION\").item(0).text == '2' ){\r\n\t\t\tform.SANCHUL_DATE.value\t=\txmldoc.getElementsByTagName(\"PARTLY_PERIOD\").item(0).text + \" (\" +xmldoc.getElementsByTagName(\"PERIOD\").item(0).text +\"일)\";\r\n\t\t}else{\r\n\t\t\tform.SANCHUL_DATE.value\t=\txmldoc.getElementsByTagName(\"SANCHUL_DATE\").item(0).text;\r\n\t\t}\r\n\t\t\t\r\n\t\t\r\n\t}\r\n\r\n\tfunction \tInit()\r\n\t{\r\n\t\tparent.TabUp_Img(\"sanchul\");\r\n\r\n\t\tvar\tadminno\t= document.getElementById(\"ADMIN_NO\").value;\r\n\t\tvar\tseq\t\t= document.getElementById(\"SEQ\").value;\r\n\r\n\t//\talert(adminno + \" , \" + seq);\r\n\t\r\n\t\tif(seq != \"\")\r\n\t\t\tView(adminno, seq);\r\n\t}\r\n\t\t\r\n//]]>\r\n</script>\r\n\r\n<body onload=\"Init();\">\r\n<table width=\"780\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n<form id=\"form\" name=\"form\" method=\"post\">\r\n<input type=\"hidden\" id=\"ADMIN_NO\" name=\"ADMIN_NO\" value=\"";
  private final static String _jspx_template10 = "\">\r\n<input type=\"hidden\" id=\"SEQ\" name=\"SEQ\" value=\"";
  private final static String _jspx_template11 = "\">\r\n<input type=\"hidden\" id=\"currentPage\" name=\"currentPage\" value=\"";
  private final static String _jspx_template12 = "\">\r\n\r\n\t  <tr>\r\n\t\t<td align=\"left\" class=\"contborder_blue\">\r\n\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\r\n        <tr>\r\n          <td height=\"34\" class=\"sub_stan\">전체건수 : <span class=\"sub_stan_blue\">";
  private final static String _jspx_template13 = "</span> 건 </td>\r\n        </tr>\r\n\t\t<tr>\r\n\t\t\t<td><table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t      <tr>\r\n\t\t        <td height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">번호</td>\r\n\t\t        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">기준년도</td>\r\n\t\t        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">공시지가</td>\r\n\t\t        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">면적</td>\r\n\t\t        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">요율</td>\r\n\t\t        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">산출기간</td>\r\n\t\t        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">부과 금액</td>\r\n\t\t      </tr>\r\n\t\t      ";
  private final static String _jspx_template14 = "\r\n\t\t\t\t<tr onClick=\"javascript:View('";
  private final static String _jspx_template15 = "','";
  private final static String _jspx_template16 = "')\" onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\" style=\"CURSOR: Hand;\" >\r\n\t\t\t\t<td height=\"26\" align=\"center\">";
  private final static String _jspx_template17 = "</td>\r\n\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template18 = "</td>\r\n\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template19 = "</td>\r\n\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template20 = "</td>\r\n\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template21 = "</td>\r\n\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template22 = "</td>\r\n\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template23 = "</td>\r\n                </tr>\r\n\t\t\t  ";
  private final static String _jspx_template24 = "\r\n\t\t\t</table></td>\r\n\t\t</tr>\r\n\t\t\r\n\t\t<tr>\r\n\t\t  <td height=\"30\" align=\"center\"><table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t<tr>\r\n\t\t\t\t";
  private final static String _jspx_template25 = "\r\n\t\t\t</tr>\r\n\t\t  </table></td>\r\n\t\t</tr>\r\n<!--\r\n        <tr>\r\n          <td height=\"1\" bgcolor=\"#EAEAEA\"></td>\r\n        </tr>\r\n--> \r\n\t\t<tr></tr><tr></tr>\r\n\t\t\r\n\t\t<tr>\r\n\t\t  <td><table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\r\n\t\t\t  <tr>\r\n\t\t\t\t<td width=\"13%\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">기준년도</td>\r\n\t\t\t\t<td width=\"37%\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><input id=\"YEAR\"  name=\"YEAR\" type=\"text\" class=\"view\" style=\"width:100px\" value=\"\" readonly></td>\r\n\t\t\t\t<td width=\"14%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">공시지가</td>\r\n\t\t\t\t<td width=\"36%\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><input id=\"PRICE\" name=\"PRICE\" type=\"text\" class=\"view\" style=\"width:100px\" value=\"\" readonly></td>\r\n\t\t\t  </tr>\r\n\t\t\t  \r\n\t\t\t  <tr>\r\n\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용면적</td>\r\n\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input id=\"AREA_AFTER\" name=\"AREA_AFTER\" type=\"text\" class=\"view\" style=\"width:100px\"  value=\"\" readonly></td>\r\n\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">요율/단가</td>\r\n\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input id=\"RATE\" name=\"RATE\" type=\"text\" class=\"view\" style=\"width:100px\" value=\"\" readonly></td>\r\n\t\t\t  </tr>\r\n\t\t\t\t  \r\n\t\t\t  <tr>\r\n\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">산출 기간</td>\r\n\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t<input id=\"SANCHUL_DATE\" name=\"SANCHUL_DATE\" type=\"text\" class=\"view\" style=\"width:160px\" value=\"\" readonly>\r\n\t\t\t\t</td>\r\n\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">부과 금액</td>\r\n\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input id=\"SUM_ADJUST\" name=\"SUM_ADJUST\" type=\"text\" class=\"view\" style=\"width:100px\" value=\"\" readonly></td>\r\n\t\t\t  </tr>\r\n\t\t\t  \r\n\t\t\t  <tr>\r\n\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">산출식</td>\r\n\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\" nowrap=\"nowrap\">\r\n\t\t\t\t\t<textarea id=\"FORM_ADJUST\" name=\"FORM_ADJUST\" type=\"text\" class=\"view\" style=\"width:620px; height:70px; overflow:hidden;\" readonly></textarea>\r\n\t\t\t\t</td>\r\n\t\t\t  </tr>\r\n\t\t\t  \r\n\t\t  </table></td>\r\n\t\t</tr>\r\n\t\t\r\n\t</table></td>\r\n  </tr>\r\n\r\n</table>\r\n\r\n</body>\r\n</html>";
}
