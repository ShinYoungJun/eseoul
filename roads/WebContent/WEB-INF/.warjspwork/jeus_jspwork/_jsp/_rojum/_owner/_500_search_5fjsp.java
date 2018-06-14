package jeus_jspwork._jsp._rojum._owner;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_search_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
  private final static String _jspx_template9 = "\r\n\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n<script language=\"javascript\" src=\"/js/common.js\"></script>\r\n<script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script>\r\n<script language=\"javascript\" src=\"/js/calculation.js\"></script>\r\n<script language=\"javascript\" src=\"/js/selectItem.js\"></script>\r\n<script language=\"javascript\" src=\"/js/Check_inputbox.js\"></script>\r\n<script language=\"javascript\" src=\"/js/Ajax_request.js\"></script>\r\n<script type=\"text/javascript\">\r\n\tfunction iFrameResize(obj)\r\n\t{\r\n\t\tvar iFrm = obj;\r\n\t\tvar the_height = iFrm.contentWindow.document.body.scrollHeight;\r\n\t\tiFrm.style.height = the_height;\r\n\t}\r\n\tfunction \tTabDown_Img(Tab_Value)\r\n\t{\r\n\t\tvar\timg1\t= document.getElementById(\"accuse_img\");\r\n\t\tvar\timg2\t= document.getElementById(\"changejob_img\");\r\n\r\n\r\n\t\timg1.src\t= \"/img/sub_rojum_accuse_off.gif\";\r\n\t\timg2.src\t= \"/img/sub_rojum_changejob_off.gif\";\r\n\r\n\t\tif(Tab_Value\t== \"accuse\")\r\n\t\t{\r\n\t\t\timg1.src\t\t= \"/img/sub_rojum_accuse_on.gif\";\r\n\t\t}\r\n\t\tif(Tab_Value\t== \"changejob\")\r\n\t\t{\r\n\t\t\timg2.src\t\t= \"/img/sub_rojum_changejob_on.gif\";\r\n\t\t}\r\n\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABDOWN\");\r\n\t\ttab.value\t= Tab_Value;\r\n\r\n\t}\r\n\r\n\tfunction Tab_Accuse()\r\n\t{\t\t\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABDOWN\");\r\n\t\tif(tab.value\t== \"accuse\")\r\n\t\t\treturn;\r\n\t\telse\r\n\t\t\ttab.value\t= \"accuse\";\r\n\r\n\t\tTabDown_Img(\"accuse\");\t\t\r\n\t\tvar tabs\t= document.getElementById(\"tabDown\");\r\n\t\ttabs.src\t= \"/rojum/owner/accuse_search.do\";\t\t\r\n\t\t\r\n\t}\r\n\t\r\n\tfunction Tab_Changejob()\r\n\t{\t\t\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABDOWN\");\r\n\t\tif(tab.value\t== \"changejob\")\r\n\t\t\treturn;\r\n\t\telse\r\n\t\t\ttab.value\t= \"changejob\";\r\n\r\n\t\tTabDown_Img(\"changejob\");\t\t\r\n\t\tvar tabs\t= document.getElementById(\"tabDown\");\r\n\t\ttabs.src\t= \"/rojum/owner/changejob_search.do\";\t\t\r\n\t\t\r\n\t}\r\n\t\r\n\tfunction \tInit()\r\n\t{\r\n\t\tTabDown_Img(\"accuse\");\t\r\n\t\tdocument.getElementById(\"tabDown\").src=\"/rojum/owner/accuse_search.do\";\r\n\r\n\t}\r\n\t\r\n</script>\r\n\r\n<body onload=\"Init();\">\r\n<form id=\"form\" name=\"form\" method=\"post\">\r\n<input type=\"hidden\" id=\"CURRENT_TABDOWN\" name=\"CURRENT_TABDOWN\" value=\"accuse\">\r\n<table width=\"810\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n  <tr>\r\n    <td height=\"43\"><img src=\"/img/sub7_cont4_title.gif\" width=\"800\" height=\"43\"></td>\r\n  </tr>\r\n  \r\n  <tr>\r\n    <td align=\"center\">\r\n    <table width=\"810\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n      <tr>\r\n        <td height=\"1\" bgcolor=\"eaeaea\"></td>\r\n      </tr>\r\n \r\n      <tr>\r\n        <td height=\"14\"></td>\r\n      </tr>\r\n      <tr>\r\n        <td align=\"left\">\r\n        <table width=\"810\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n          <tr>\r\n            <td height=\"22\" background=\"/img/tab_line_blue.gif\">\r\n            <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                <tr>\r\n                  \r\n\t              <td width=\"111\" onclick =\"javascript:Tab_Accuse()\"><img id=\"accuse_img\" name=\"accuse_img\" src=\"/img/sub_rojum_accuse_on.gif\" alt=\"고발내역\" width=\"110\" height=\"22\" border=\"0\" style=\"cursor:pointer\" ></td>\r\n                  <td width=\"111\" onclick =\"javascript:Tab_Changejob()\"><img id=\"changejob_img\" name=\"changejob_img\" src=\"/img/sub_rojum_changejob_off.gif\" alt=\"전업지원내역\" width=\"110\" height=\"22\" border=\"0\" style=\"cursor:pointer\" ></td>\r\n\t              </tr>\r\n            </table>\r\n            </td>\r\n          </tr>\t\t  \r\n          <tr>\r\n  \t\t\t<td>\r\n  \t\t\t\t<iframe width=\"100%\" id = \"tabDown\" name=\"tabDown\" frameborder=\"0\" onload=\"iFrameResize(this);\" scrolling=\"no\" src=\"\"></iframe>\r\n  \t\t\t</td>\r\n          </tr>\r\n        </table>\r\n        </td>\r\n      </tr>\t\t\r\n\t\t\r\n\t</table>\r\n\t</td>\r\n\t</tr>\r\n\t<tr>\r\n      <td height=\"20\" ></td>\r\n\t</tr>\r\n\t</table>\r\n  </td>\r\n </tr>\r\n\r\n</table>\r\n</form>\r\n</body>\r\n</html>";
}
