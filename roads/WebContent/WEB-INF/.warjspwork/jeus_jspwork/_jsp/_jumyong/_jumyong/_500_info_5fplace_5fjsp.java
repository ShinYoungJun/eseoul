package jeus_jspwork._jsp._jumyong._jumyong;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_info_5fplace_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(57,35);to=(57,37)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${no}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(59,41);to=(59,46)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mode1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(61,53);to=(61,64)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${InspectDate}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(63,3);to=(66,1)]
      
      	String no = request.getParameter("no");
      	String SECTION = request.getParameter("SECTION");

      out.write(_jspx_template13);
      // jsp code [from=(75,54);to=(75,56)]
      out.print(no);

      out.write(_jspx_template14);
      // jsp code [from=(75,70);to=(75,78)]
      out.print(SECTION );

      out.write(_jspx_template15);
      // jsp code [from=(81,50);to=(81,52)]
      out.print(no);

      out.write(_jspx_template16);
      // jsp code [from=(81,66);to=(81,74)]
      out.print(SECTION );

      out.write(_jspx_template17);

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
  private final static String _jspx_template7 = "    \r\n";
  private final static String _jspx_template8 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('사용자의 사용시간이 종료되었습니다. 다시 접속 해주시기 바랍니다.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template9 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n\r\n<script>\r\n\r\n\tfunction submitClick()\r\n\t{\r\n\t\tvar placeDetailForm = document.placeDetailForm;\r\n\t\talert(\"FSAFDDF\");\r\n\t\tplaceDetailForm.submit();\r\n\t}\r\n\t\r\n\t\r\n\t\r\n\t\r\n\t// 등록폼 체크\r\n\tfunction checkForm(){\r\n\t\tvar form1 = document.form1;\r\n\t\talert(form1.year.value);\r\n\r\n\t\tform1.submit();\r\n\t\t//\t특수문자 입력시 글 끝에 공백과 줄바꿈을 넣어야 깨지지 않음. 이유는 모르겠슴\r\n\t\t//\t\tw.content.value = w.content.value+' '+'\\n';\t\r\n\t\t\r\n\t}\r\n\t\r\n\t\r\n\t\r\n\r\n\t\r\n</script>\r\n\r\n</head>\r\n\r\n<body >\r\n\r\n\r\n\r\n<form id=\"placeDetailForm\" name=\"placeDetailForm\" method=\"post\" action = \"/jumyong/inspectEdit.do\" >\r\n\r\n<input id=\"no\" name=\"no\" value=\"";
  private final static String _jspx_template10 = "\" type=\"hidden\" >\r\n\r\n<input id=\"mode1\" name=\"mode1\" value=\"";
  private final static String _jspx_template11 = "\" type=\"hidden\" >\r\n\r\n<input id=\"InspectDate\" name=\"InspectDate\" value=\"";
  private final static String _jspx_template12 = "\" type=\"hidden\" >\r\n\r\n";
  private final static String _jspx_template13 = "\r\n\r\n<table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n          <tr>\r\n            <td class=\"contborder_purple\">\t\t\t\t\t\t\t            \r\n\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t            <tr>\r\n        \t\t\t    <td>\r\n        \t\t\t    <iframe id='iframe1' name='iframe1' frameborder=\"NO\" border=\"0\" framespacing=\"0\" \r\n\t\t\t\t        src=\"/jumyong/placeLocationEdit.do?no=";
  private final static String _jspx_template14 = "&SECTION=";
  private final static String _jspx_template15 = "\" width=\"100%\" height=\"220\" scrolling=\"NO\"></iframe>\r\n\t        \t\t    </td>\r\n\t\t            </tr>\r\n        \t\t    <tr>\r\n\t\t\t            <td>\r\n\t\t\t            <iframe id='iframe2' name='iframe2' frameborder=\"NO\" border=\"0\" framespacing=\"0\" \r\n\t\t\t\t        src=\"/jumyong/placeFileEdit.do?no=";
  private final static String _jspx_template16 = "&SECTION=";
  private final static String _jspx_template17 = "\" width=\"100%\" height=\"240\" scrolling=\"NO\"></iframe>\r\n\t\t\t            </td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"10\" class=\"sub_table\"> * 파일 첨부가 안될 시에는 Internet Explorer 의 도구 > 인터넷 옵션 > 보안  > 사용자 지정수준을 클릭하여 <br>\r\n\t\t\t\t\t\t\t<font color=\"red\">'스크립팅하기 안전하지 않는 것으로 표시된 ActiveX 컨트롤 초기화 및 스크립팅'</font> 항목을 <font color=\"red\">'확인'</font>으로 변경하여 주십시요. \r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t</table>\r\n            </td>\r\n\t\t  </tr>     \r\n</table>\r\n</body>\r\n</html>\r\n\r\n";
}
