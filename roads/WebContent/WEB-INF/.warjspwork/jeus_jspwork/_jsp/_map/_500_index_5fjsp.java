package jeus_jspwork._jsp._map;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_index_5fjsp extends jeus.servlet.jsp.HttpJspBase {

  public final String[] __jeusGetIncludedJspFiles() {
    return null;
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
      // jsp code [from=(4,3);to=(9,1)]
      
      	String 		userId	= (String)session.getAttribute("sessionUserId");
      	
      	if(userId == null)
      	{ 

      out.write(_jspx_template1);
      // jsp code [from=(17,3);to=(19,1)]
      
      	}

      out.write(_jspx_template2);

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
  private final static String _jspx_template0 = "\r\n\r\n";
  private final static String _jspx_template1 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('세션이 종료 되었습니다.');\r\n\r\n\t\t\topener.parent.location.href=\"/admin/user/login.do\"\r\n\t\t\twindow.self.close();\r\n\t\t\t\r\n\t\t</script>\r\n";
  private final static String _jspx_template2 = "\r\n<html>\r\n<head>\r\n<title>::::: 도로점용관리시스템 :::::</title>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\">\r\n</head>\r\n<frameset rows=\"62,*,30\" frameborder=\"NO\" border=\"0\" framespacing=\"0\">\r\n  <frame src=\"/jsp/map/menu.jsp\" name=\"menu\" scrolling=\"no\" noresize id=\"menu\" >\r\n\r\n  <frame src=\"/jsp/map/map.jsp\" name=\"map\" scrolling=\"no\" noresize id=\"map\">\r\n\r\n  <frame src=\"/jsp/map/bottom.jsp\" name=\"bottom\" scrolling=\"no\" noresize id=\"bottom\">\r\n</frameset>\r\n<noframes><body>\r\n</body></noframes>\r\n</html>";
}
