package jeus_jspwork._jsp._jumyong._gigan;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_view_5filgwal_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(154,57);to=(154,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GIGAN1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(155,57);to=(155,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GIGAN2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(156,65);to=(156,75)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PURPOSE_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(157,57);to=(157,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${BONBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(158,55);to=(158,60)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${BUBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(159,53);to=(159,57)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(160,59);to=(160,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMINNO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(161,53);to=(161,57)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TYPE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(162,63);to=(162,72)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${OWNER_SET}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(163,59);to=(163,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TAX_SET}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(164,55);to=(164,60)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${BJ_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(165,55);to=(165,60)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${HJ_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(166,59);to=(166,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(204,92);to=(204,100)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(242,190);to=(242,198)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

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
  private final static String _jspx_template0 = "\r\n    \r\n";
  private final static String _jspx_template1 = "\r\n";
  private final static String _jspx_template2 = "  \r\n";
  private final static String _jspx_template3 = "  \r\n";
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "\r\n";
  private final static String _jspx_template6 = "\r\n";
  private final static String _jspx_template7 = "\r\n";
  private final static String _jspx_template8 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('사용자의 사용시간이 종료되었습니다. 다시 접속 해주시기 바랍니다.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template9 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script language=\"javascript\" src=\"/js/Check_inputbox.js\"></script>\r\n<script language=\"javascript\" src=\"/js/Ajax_request.js\"></script>\r\n\r\n<script type=\"text/javascript\">\r\n//<![CDATA[\r\n\r\n\tfunction\tSearch()\r\n\t{\r\n\t\tvar form = document.form;\r\n\r\n\t\tform.target\t= \"_self\";\r\n\t\tform.action = \"/jumyong/gigan/search.do\";\r\n\r\n\t\tform.submit();\r\n\t}\r\n\r\n\tfunction iFrameResize(obj)\r\n\t{\r\n\t\tvar iFrm = obj;\r\n\t\tvar the_height = iFrm.contentWindow.document.body.scrollHeight;\r\n\r\n\t\tiFrm.style.height = the_height;\r\n\t}\r\n\r\n\t\r\n\tfunction \tTabDown_Img(Tab_Value)\r\n\t{\r\n\t\tvar\timg1\t= document.getElementById(\"bugwa_img\");\r\n\t\tvar\timg2\t= document.getElementById(\"sunap_img\");\r\n\r\n\t\timg1.src\t= \"/img/sub_periodi_title6_off.gif\";\r\n\t\timg2.src\t= \"/img/sub_periodi_title5_off.gif\";\r\n\t\t\r\n\t\tif(Tab_Value\t== \"annae\")\r\n\t\t{\r\n\t\t\timg1.src\t\t= \"/img/sub_periodi_title6_on.gif\";\r\n\t\t}\r\n\t\telse if(Tab_Value\t== \"giganilgwal\")\r\n\t\t{\r\n\t\t\timg2.src\t\t= \"/img/sub_periodi_title5_on.gif\";\r\n\t\t}\r\n\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABDOWN\");\r\n\t\ttab.value\t= Tab_Value;\r\n\t}\r\n\r\n\tfunction Tab_Ilgwal()\r\n\t{\r\n\t\tvar form = document.form;\r\n\t\t\r\n\t\tform.target\t= 'tabUp';\r\n\t\tform.action = \"/jumyong/gigan/ilgwal_view.do\";\r\n\t\t\r\n\t\tform.submit();\r\n\r\n\t\tform.target\t= \"_self\";\r\n\t}\r\n\r\n\tfunction Tab_Annae()\r\n\t{\t\t\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABDOWN\");\r\n\t\tif(tab.value\t== \"annae\")\r\n\t\t\treturn;\r\n\t\telse\r\n\t\t\ttab.value\t= \"annae\";\r\n\r\n\t//\tvar\tadminno\t= document.getElementById(\"ADMIN_NO\").value;\r\n\t//\tvar\tseq\t= document.getElementById(\"SEQ\").value;\r\n\t\t\r\n//\t\tvar tabs\t= document.getElementById(\"tabDown\");\r\n//\t\ttabs.src\t= \"/jumyong/gigan/annae_view.do\";\r\n\r\n\t\tvar form = document.form;\r\n\t\t\r\n\t\tform.target\t= 'tabDown';\r\n\t\tform.action = \"/jumyong/gigan/annae_view.do\";\r\n\t\r\n\t\tform.submit();\r\n\r\n\t\tform.target\t= \"_self\";\r\n\t}\r\n\r\n\tfunction Tab_Gigan()\r\n\t{\t\t\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABDOWN\");\r\n\t\tif(tab.value\t== \"giganilgwal\")\r\n\t\t\treturn;\r\n\t\telse\r\n\t\t\ttab.value\t= \"giganilgwal\";\r\n\r\n\t//\tvar\tadminno\t= document.getElementById(\"ADMIN_NO\").value;\r\n\t//\tvar\tseq\t= document.getElementById(\"SEQ\").value;\r\n\t\t\r\n\t//\tvar tabs\t= document.getElementById(\"tabDown\");\r\n\t//\ttabs.src\t= \"/jumyong/gigan/giganilgwal_view.do\";//?ADMIN_NO=\" + adminno + \"&SEQ=\" + seq;'\r\n\r\n\t\tvar form = document.form;\r\n\t\t\r\n\t\tform.target\t= 'tabDown';\r\n\t\tform.action = \"/jumyong/gigan/giganilgwal_view.do\";\r\n\t\r\n\t\tform.submit();\r\n\r\n\t\tform.target\t= \"_self\";\r\n\t}\r\n\r\n\tfunction \tInit()\r\n\t{\r\n\t//\tvar tab\t\t= document.getElementById(\"CURRENT_TAB\");\r\n\t//\ttab.value\t= \"back\";\r\n\r\n\t//\tvar str\t= document.getElementById(\"GIGAN1\");\r\n\t//\talert(str.value);\r\n\t\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABDOWN\");\r\n\t\ttab.value\t= \"\";\r\n\r\n\t\tTab_Ilgwal();\r\n\t\tTab_Annae();\r\n\t}\r\n\t\r\n//]]>\r\n</script>\r\n\r\n<body onload=\"javascript:Init();\">\r\n<form id=\"form\" name=\"form\" method=\"post\">\r\n<input type=\"hidden\" id=\"CURRENT_TABDOWN\" name=\"CURRENT_TABDOWN\" value=\"annae\">\r\n<input type=\"hidden\" id=\"GIGAN1\" name=\"GIGAN1\" value=\"";
  private final static String _jspx_template10 = "\">\r\n<input type=\"hidden\" id=\"GIGAN2\" name=\"GIGAN2\" value=\"";
  private final static String _jspx_template11 = "\">\r\n<input type=\"hidden\" id=\"PURPOSE_CD\" name=\"PURPOSE_CD\" value=\"";
  private final static String _jspx_template12 = "\">\r\n<input type=\"hidden\" id=\"BONBUN\" name=\"BONBUN\" value=\"";
  private final static String _jspx_template13 = "\">\r\n<input type=\"hidden\" id=\"BUBUN\" name=\"BUBUN\" value=\"";
  private final static String _jspx_template14 = "\">\r\n<input type=\"hidden\" id=\"NAME\" name=\"NAME\" value=\"";
  private final static String _jspx_template15 = "\">\r\n<input type=\"hidden\" id=\"ADMINNO\" name=\"ADMINNO\" value=\"";
  private final static String _jspx_template16 = "\">\r\n<input type=\"hidden\" id=\"TYPE\" name=\"TYPE\" value=\"";
  private final static String _jspx_template17 = "\">\r\n<input type=\"hidden\" id=\"OWNER_SET\" name=\"OWNER_SET\" value=\"";
  private final static String _jspx_template18 = "\">\r\n<input type=\"hidden\" id=\"TAX_SET\" name=\"TAX_SET\" value=\"";
  private final static String _jspx_template19 = "\">\r\n<input type=\"hidden\" id=\"BJ_CD\" name=\"BJ_CD\" value=\"";
  private final static String _jspx_template20 = "\">\r\n<input type=\"hidden\" id=\"HJ_CD\" name=\"HJ_CD\" value=\"";
  private final static String _jspx_template21 = "\">\r\n<input type=\"hidden\" id=\"SECTION\" name=\"SECTION\" value=\"";
  private final static String _jspx_template22 = "\">\r\n\r\n\r\n<table width=\"800\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\r\n  <tr>\r\n    <td height=\"43\"><img src=\"/img/sub2_cont2_title.gif\" width=\"800\" height=\"43\"></td>\r\n  </tr>\r\n  \r\n  <tr>\r\n    <td align=\"center\">\r\n    <table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n      <tr>\r\n        <td height=\"40\" align=\"right\">\r\n\t<!--상단 기안문상신,도움말 메뉴-->\r\n\t\t<!--<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n          <tr>\r\n            <td height=\"8\" colspan=\"2\"></td>\r\n            </tr>\r\n          <tr>\r\n            <td><a href=\"#\"><img src=\"/img/report_icon.gif\" alt=\"기안문 상신11\" width=\"92\" height=\"18\" border=\"0\"></a></td>\r\n            <td><a href=\"#\"><img src=\"/img/help_icon.gif\" alt=\"도움말\" width=\"65\" height=\"18\" border=\"0\"></a></td>\r\n            </tr>\r\n        </table>  -->\r\n\t<!--상단 기안문상신,도움말 메뉴-->\t\t\r\n\t\t</td>\r\n      </tr>\r\n      \r\n      <tr>\r\n        <td height=\"1\" bgcolor=\"eaeaea\"></td>\r\n      </tr>\r\n \r\n      <tr>\r\n        <td height=\"14\"></td>\r\n      </tr>\r\n      \r\n      <td> </td>\r\n <!--           \r\n      <td align=\"right\" class=\"sub_table_b\">관리번호 : <script>var adminno = nr_Adminno_Cut(\"";
  private final static String _jspx_template23 = "\"); document.write(adminno);</script></td>\r\n  -->     \r\n      <tr>\r\n        <td align=\"left\">\r\n        <table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n        \r\n        <tr>\r\n            <td height=\"22\" background=\"/img/tab_line_purple.gif\">\r\n            <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                <tr>\r\n                  <td width=\"111\"><img id=\"jumin_img\" name=\"jumin_img\" src=\"/img/sub_periodi_title4.gif\" alt=\"일괄 처리\" width=\"110\" height=\"22\" border=\"0\"></td>\r\n                </tr>\r\n            </table>\r\n            </td>\r\n\t\t</tr>\r\n\t\t\r\n\t\t<td>\r\n\t\t  \t<iframe width=\"100%\" height=\"100%\" id=\"tabUp\" name=\"tabUp\" frameborder=\"0\" onload=\"iFrameResize(this);\" src=\"\" scrolling=\"no\"></iframe>\r\n\t\t</td>\r\n\r\n      <tr>\r\n        <td height=\"30\"></td>\r\n      </tr>\r\n\r\n      <tr>\r\n        <td align=\"left\">\r\n        <table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n          <tr>\r\n            <td height=\"22\" background=\"/img/tab_line_blue.gif\"><table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                <tr>\r\n                  <td width=\"111\"><a href=\"javascript:Tab_Annae()\"><img id=\"bugwa_img\" name=\"bugwa_img\" src=\"/img/sub_periodi_title6_on.gif\" alt=\"안내문\" width=\"110\" height=\"22\" border=\"0\"></a></td>\r\n                  <td width=\"111\"><a href=\"javascript:Tab_Gigan()\"><img id=\"sunap_img\" name=\"sunap_img\" src=\"/img/sub_periodi_title5_off.gif\" alt=\"기간 연장\" width=\"110\" height=\"22\" border=\"0\"></a></td>\r\n                </tr>\r\n            </table></td>\r\n          </tr>\r\n\t\t  \r\n          <tr>\r\n  \t\t\t<TD>\r\n  \t\t\t\t<iframe width=\"100%\" height=\"150\" id=\"tabDown\" name=\"tabDown\" frameborder=\"0\" onload=\"iFrameResize(this);\" scrolling=\"no\" src=\"\"></iframe><!-- /jumyong/saewe/bugwa_view.do?ADMIN_NO=";
  private final static String _jspx_template24 = " -->\r\n  \t\t\t</TD>\r\n          </tr>\r\n          \r\n        </table>\r\n        </td>\r\n      </tr>\r\n\r\n\t\t<tr>\r\n\t\t\t<td height=\"40\" align=\"right\">\r\n\t\t<!-- \t<a href=\"javascript:SaeweSuipBugwa()\"><img src=\"/img/levy_icon.gif\" alt=\"세외수입부과\" width=\"94\" height=\"22\" border=\"0\"></a> -->\r\n\t\t\t<a href=\"javascript:Search()\"><img src=\"/img/list_icon.gif\" alt=\"리스트\" width=\"66\" height=\"22\" border=\"0\"></a></td>\r\n\t\t</tr>\r\n\t\t\r\n\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n\t\r\n\t</table>\r\n  </td>\r\n </tr>\r\n\r\n</table>\r\n</form>\r\n\r\n</body>\r\n</html>";
}
