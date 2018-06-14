package jeus_jspwork._jsp._rojum._jumyong;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_officialLandPrice_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(71,7);to=(71,12)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SI_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(71,21);to=(71,26)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GU_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(71,35);to=(71,40)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${BJ_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(71,49);to=(71,54)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${BUNJI}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(76,100);to=(76,104)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${year}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(80,58);to=(80,62)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${giga}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);

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
  private final static String _jspx_template9 = "    \r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n\r\n<script>\r\n\t\r\n\t\r\n\r\nfunction MM_preloadImages() { //v3.0\r\n  var d=document; if(d.images){ if(!d.MM_p) d.MM_p=new Array();\r\n    var i,j=d.MM_p.length,a=MM_preloadImages.arguments; for(i=0; i<a.length; i++)\r\n    if (a[i].indexOf(\"#\")!=0){ d.MM_p[j]=new Image; d.MM_p[j++].src=a[i];}}\r\n}\r\n\r\n\r\nfunction close2()\r\n{\r\n\tvar giga = document.getElementById(\"giga\").value;\r\n\topener.document.getElementById(\"PRICE\").value=giga;\r\n\tself.close();\r\n}\r\n\t\r\n\t\r\n</script>\r\n<link href=\"/css/pop.css\" rel=\"stylesheet\" type=\"text/css\">\r\n\r\n</head>\r\n\r\n<body>\r\n\t<table width=\"100%\" height=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t  <tr>\r\n\t    <td height=\"12\"><img src=\"/img/box_top_left.gif\" width=\"12\" height=\"12\"></td>\r\n\t    <td background=\"/img/box_top_mid.gif\"></td>\r\n\t    <td><img src=\"/img/box_top_right.gif\" width=\"12\" height=\"12\"></td>\r\n\t  </tr>\r\n\t  <tr>\r\n\t    <td width=\"12\" background=\"/img/box_left.gif\"></td>\r\n\t    <td align=\"center\" valign=\"top\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t      <tr>\r\n\t        <td><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"admin_w\">\r\n\t          <tr>\r\n\t            <td width=\"40\"><img src=\"/img/admin_pop_left.gif\" width=\"40\" height=\"40\"></td>\r\n\t            <td background=\"/img/admin_pop_cen.gif\" class=\"admin_w_b\" style=\"padding-top:3\">공시지가</td>\r\n\t            <td width=\"33\"><a href=\"#\"><img src=\"/img/close.gif\" alt=\"닫기\" width=\"33\" height=\"40\" border=\"0\" onClick=\"self.close();\" style=\"cursor:pointer;\" /></a></td>\r\n\t          </tr>\r\n\t          <tr>\r\n\t            <td height=\"5\" colspan=\"3\"></td>\r\n\t            </tr>\r\n\t        </table></td>\r\n\t      </tr>\r\n\t      <tr>\r\n\t        <td><table width=\"100%\" border=\"2\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t          <tr>\r\n\t            <td width=\"12%\" height=\"30\" align=\"center\" bgcolor=\"#D6E6F3\" class=\"sub_table_b\">주소</td>\r\n\t            <td height=\"28\" colspan=\"3\" bgcolor=\"#F6F6F6\" class=\"table_bl_left\"><span class=\"sub_stan_blue\">\r\n\t\t\t\t";
  private final static String _jspx_template10 = "&nbsp ";
  private final static String _jspx_template11 = "&nbsp ";
  private final static String _jspx_template12 = "&nbsp ";
  private final static String _jspx_template13 = "\r\n\t            </span></td>\r\n\t            </tr>\r\n\t          <tr>\r\n\t            <td height=\"30\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">년도</td>\r\n\t            <td height=\"28\" bgcolor=\"#F6F6F6\" class=\"table_bl_left\"><span class=\"sub_stan_blue\">";
  private final static String _jspx_template14 = " </span>년</td>\r\n\t            <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">공시지가</td>\r\n\t            <td bgcolor=\"#F6F6F6\" class=\"table_bl_left\"><span class=\"sub_stan_blue\">\r\n\t            \r\n\t\t\t\t\t<input name=\"giga\" id=\"giga\" type=\"text\" value = \"";
  private final static String _jspx_template15 = "\" style=\"width:50px;ime-mode:disabled;\"  class=\"input_form1\" >\r\n\t            \r\n\t            \r\n\t            </span> 원&nbsp&nbsp \r\n\t            <span class=\"sub_stan_blue\" style=\"cursor:pointer\" onclick=\"javascript:close2();\">적용</span> </td>\r\n\t          </tr>\r\n\t\r\n\t        </table>\r\n\t          </td>\r\n\t      </tr>\r\n\t    </table></td>\r\n\t    <td width=\"12\" background=\"/img/box_right.gif\"></td>\r\n\t  </tr>\r\n\t  <tr>\r\n\t    <td height=\"12\"><img src=\"/img/box_bottom_left.gif\" width=\"12\" height=\"12\"></td>\r\n\t    <td background=\"/img/box_bottom_mid.gif\"></td>\r\n\t    <td><img src=\"/img/box_bottom_right.gif\" width=\"12\" height=\"12\"></td>\r\n\t  </tr>\r\n\t</table>\r\n</body>\r\n</html>\r\n\r\n";
}
