package jeus_jspwork._jsp._admin._user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_changePwdView_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(123,29);to=(123,42)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${sessionUserId}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(126,29);to=(126,42)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${sessionUserId}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);

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
  private final static String _jspx_template1 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('������� ���ð��� ����Ǿ����ϴ�. �ٽ� ���� ���ֽñ� �ٶ��ϴ�.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template2 = "\r\n";
  private final static String _jspx_template3 = "\r\n";
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "  \r\n";
  private final static String _jspx_template6 = "  \r\n";
  private final static String _jspx_template7 = "\r\n";
  private final static String _jspx_template8 = "\r\n";
  private final static String _jspx_template9 = "\r\n\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: ����� ������������ý��� :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n\r\n.pw_li\r\n{\r\n\tlist-style: none;\r\n}\r\n\r\n.pw_text\r\n{\r\n\tdisplay: inline-block;\r\n\twidth: 120px;\r\n\ttext-align: right;\r\n\tmargin-right: 10px;\r\n}\r\n\t\r\n</style>\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n<script language=\"javascript\" src=\"/js/common.js\"></script>\r\n</head>\r\n<script type=\"text/javascript\">\r\n\r\nfunction checkPW()\r\n{\r\n\tvar currentPW = document.getElementById(\"currentPW\").value;\r\n\tvar newPW = document.getElementById(\"newPW\").value;\r\n\tvar checkPW = document.getElementById(\"checkPW\").value;\r\n\t\r\n\tconsole.log(\"currentPW: \" + currentPW);\r\n\tconsole.log(\"newPW: \" + newPW);\r\n\tconsole.log(\"checkPW: \" + checkPW);\r\n}\r\n\r\nfunction fnCheckPassword() {\r\n\r\n\tvar upw = document.getElementById(\"newPW\").value;\r\n\r\n\tvar chk_num = upw.search(/[0-9]/g); \r\n\tvar chk_eng = upw.search(/[a-z]/ig); \r\n\tvar strSpecial = upw.search(/[`~!@#$%^&*|\\\\\\'\\\";:\\/?]/gi);\r\n\r\n\t /* check whether input value is included space or not  */\r\n\t var retVal = checkSpace( upw );\r\n\t if( retVal ) {\r\n\t\tdocument.getElementById(\"message\").innerHTML = \"��й�ȣ�� ������� �Է��� �ּ���.\";\r\n\t\t return false;\r\n\t }\r\n\r\n\t if(upw.length < 9){\r\n\t\tdocument.getElementById(\"message\").innerHTML = \"9�� �̻��� ��й�ȣ�� �Է� ���� �մϴ�.\";\r\n\t\treturn false;\r\n\t }\r\n\r\n\tif(upw.length > 14){\r\n\t\tdocument.getElementById(\"message\").innerHTML = \"13�� ������ ��й�ȣ�� �Է� ���� �մϴ�.\";\r\n\t   return false;\r\n\t }\r\n\r\n\t if(chk_num < 0 || chk_eng < 0){ \r\n\t\tdocument.getElementById(\"message\").innerHTML = \"��й�ȣ�� ����, ���ڰ� ���� �Ǿ�� �մϴ�.\";\r\n\t   return false;\r\n\t }\r\n\r\n\tdocument.getElementById(\"message\").innerHTML = \"\";\r\n    return true;\r\n\r\n}\r\n\r\n\r\n//space �� ������ true, ������ false\r\nfunction checkSpace( str )\r\n{\r\n   if(str.search(/\\s/) != -1){\r\n    return true;\r\n   } else {\r\n      return false;\r\n   }\r\n}\r\n\r\n//�н����� Ȯ��\r\nfunction fn_pwCheck()\r\n{\t\r\n    var fm = document.pwchangeForm; \r\n    \r\n\tif(fm.newPW.value != fm.checkPW.value)\r\n\t{\t \r\n\t\talert(\"�н����带 ��Ȯ�� �Է� �� �ּ���.\");\r\n\t\tfm.newPW.focus();\r\n\t\tfm.checkPW.select();\r\n\t\treturn false;\r\n\t}\r\n\treturn true;\t\t\t\r\n}\r\n\r\nfunction checkCurrentPW(isChange){\r\n\t\r\n\tvar w = document.pwchangeForm;\r\n\tvar currentPW = document.getElementById(\"currentPW\").value;\r\n\tvar newPW = document.getElementById(\"newPW\").value;\r\n\tvar parameter;\r\n\tif(isChange == \"true\"){\r\n\t\tif(!(fnCheckPassword())) return;\r\n\t\tif(!fn_pwCheck()) return;\r\n\t\tif(!checkStrNVMsg(w.newPW,\"�н�����\"))return;\r\n\t\t\r\n\t\tparameter = \"?userId=\"+\"";
  private final static String _jspx_template10 = "\"+\"&currentPW=\"+currentPW+\"&newPW=\"+newPW;\r\n\t\tw.action = \"/admin/user/changePwd.do\" + parameter;\r\n\t}else{\r\n\t\tparameter = \"?userId=\"+\"";
  private final static String _jspx_template11 = "\"+\"&currentPW=false\";\r\n\t\tw.action = \"/admin/user/changePwd.do\" + parameter;\r\n\t}\r\n\talert(parameter);\r\n\tw.submit();\r\n\t\r\n}\r\n\r\n\r\n</script>\r\n\r\n<body>\r\n<form name=\"pwchangeForm\" id=\"pwchangeForm\" method=\"post\">\r\n\t<div align=\"center\" style=\"margin-top: 100px;\">\r\n\t\t<ul>\r\n\t\t\t<li class=\"pw_li\" style=\"margin-bottom: 30px;\">\r\n\t\t\t\t<p>\r\n\t\t\t\t\t<font color=\"#34862E\" style=\"font-size:15px; \">[��й�ȣ ���� �ȳ�]<br></font>\r\n\t\t\t\t\t<font color=\"\" style=\"font-size:14px;\">����������ȣ�� ������ ����Ʈ �̿��� ����<br></font>\r\n\t\t\t\t\t<font color=\"\" style=\"font-size:14px;\">6���� ���� ��й�ȣ ������ �����ϰ� �ֻ����<br></font>\r\n\t\t\t\t\t<font color=\"\" style=\"font-size:14px;\">��й�ȣ�� ������ �ֽñ� �ٶ��ϴ�.<br></font>\r\n\t\t\t\t</p>\r\n\t\t\t</li>\r\n\t\t\t<li class=\"pw_li\" style=\"margin-bottom: 10px;\">\r\n\t\t\t\t<a class=\"pw_text\">���� ��й�ȣ</a><a><input type=\"text\" id=\"currentPW\"></a>\r\n\t\t\t</li>\r\n\t\t\t<li class=\"pw_li\">\r\n\t\t\t\t<a class=\"pw_text\">�� ��й�ȣ</a><a><input type=\"text\" id=\"newPW\" onkeyup=\"fnCheckPassword();\"></a>\r\n\t\t\t</li>\r\n\t\t\t<li class=\"pw_li\">\r\n\t\t\t\t<font color=\"#FF5A5A\" style=\"font-size:11px;\" id=\"message\"></font>\r\n\t\t\t</li>\r\n\t\t\t<li class=\"pw_li\" style=\"margin: 3px 0 3px 0;\">\r\n\t\t\t\t<a class=\"pw_text\">��й�ȣ Ȯ��</a><a><input type=\"text\" id=\"checkPW\" onChange=\"fn_pwCheck();\"></a>\r\n\t\t\t</li>\r\n\t\t\t<li class=\"pw_li\" style=\"margin: 3px 0 3px 0;\">\r\n\t\t\t<font style=\"font-size:11px; margin-left: 10px;\">13�� �̻�, ���ڿ� ������ �������� �Է����ּ���.</font>\r\n\t\t\t</li>\r\n\t\t\t<li class=\"pw_li\" style=\"margin: 30px 0 3px 0;\">\r\n\t\t\t\t<input type=\"button\" onclick=\"checkCurrentPW('true')\" value=\"���ݺ���\">\r\n\t\t\t</li>\r\n\t\t\t<li class=\"pw_li\" style=\"margin: 3px 0 3px 0;\">\r\n\t\t\t\t<input type=\"button\" onclick=\"checkCurrentPW('false')\" value=\"���߿�(6���� ��) ����\">\r\n\t\t\t</li>\r\n\t\t</ul>\r\n\t\t\r\n\t</div>\r\n</form>\r\n</body>\r\n</html>\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n";
}
