package jeus_jspwork._jsp._admin._user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_main_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
  private final static String _jspx_template9 = "\r\n";
  private final static String _jspx_template10 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\nhtml {overflow-x : hidden;}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n\r\n<script>\r\nfunction keyCheck(e) {\r\n\tif (e.keyCode == 123) {\r\n\t\talert(\"소스보기(F12)키는 사용하실 수 없습니다.\");\r\n\t\treturn false;\r\n\t}\r\n}\r\nfunction returnFalse(e){\r\n\treturn false;\r\n}\r\nfunction clipboardClear(){\r\n\twindow.clipboardData.clearData();\r\n}\r\nfunction insertKeyCheck(frameNum) {\r\n\tframes[frameNum].document.body.attachEvent(\"onkeydown\", keyCheck);\r\n\tframes[frameNum].document.body.attachEvent(\"oncontextmenu\", returnFalse);\r\n\tframes[frameNum].document.body.attachEvent(\"ondragstart\", returnFalse);\r\n\tframes[frameNum].document.body.attachEvent(\"ondragend\", returnFalse); \r\n\tframes[frameNum].document.body.attachEvent(\"onselectstart\", returnFalse);\r\n\tframes[frameNum].document.body.attachEvent(\"onkeyup\", clipboardClear);\r\n}\r\n</script>\r\n\t\r\n</head>\r\n<frameset rows=\"115,*\" frameborder=\"NO\" border=\"0\" framespacing=\"0\">\r\n\t<frame src=\"/admin/user/userInfo.do\" name=\"menu\" scrolling=\"NO\" noresize id=\"menu\" onload=\"javascript:insertKeyCheck(0);\">\r\n\t<frameset cols=\"200,*\" frameborder=\"NO\" border=\"0\" framespacing=\"0\">\r\n\t\t<frame src=\"#\" name=\"left\" scrolling=\"NO\" noresize id=\"left\" onload=\"javascript:insertKeyCheck(1);\">\r\n\t\t<frame src=\"#\" name=\"cont\" scrolling=\"auto\" noresize id=\"map\" onload=\"javascript:insertKeyCheck(2);\">\r\n\t</frameset>\r\n</frameset>\r\n<noframes>\r\n<body>\r\n</body>\r\n</noframes>\r\n</html>";
}
