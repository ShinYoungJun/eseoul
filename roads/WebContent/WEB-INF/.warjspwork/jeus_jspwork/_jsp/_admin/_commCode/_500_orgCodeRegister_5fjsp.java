package jeus_jspwork._jsp._admin._commCode;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_orgCodeRegister_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      out.write(_jspx_template1);
      out.write(_jspx_template2);
      out.write(_jspx_template3);
      out.write(_jspx_template4);
      // jsp code [from=(76,13);to=(76,16)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${act}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template5);
      // jsp code [from=(99,9);to=(99,11)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${YN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template6);
      // jsp code [from=(102,19);to=(102,26)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${DEPT_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template7);
      // jsp code [from=(103,19);to=(103,26)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${DEPT_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template8);
      // jsp code [from=(104,23);to=(104,34)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MANAGE_WORK}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template9);
      // jsp code [from=(110,9);to=(110,12)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MSG}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(111,22);to=(111,25)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MSG}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(113,10);to=(113,12)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${YN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(137,51);to=(137,54)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MSG}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(158,10);to=(158,17)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GU_CODE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);

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
  private final static String _jspx_template1 = "\r\n";
  private final static String _jspx_template2 = "\r\n";
  private final static String _jspx_template3 = "\r\n";
  private final static String _jspx_template4 = "\r\n\r\n<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>부서코드 등록</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody,td,th {\r\n\tfont-family: 돋움;\r\n\tfont-size: 12px;\r\n\tcolor: #053e8a;\r\n}\r\nbody {\r\n\tmargin-left: 0px;\r\n\tmargin-top: 0px;\r\n\tmargin-right: 0px;\r\n\tmargin-bottom: 0px;\r\n}\r\n.style1 {color: #000000}\r\n.style3 {color: #FF6600; font-weight: bold; }\r\n\r\n-->\r\n</style>\r\n<script language=\"JavaScript\" src=\"/js/common.js\"></script>\r\n<script language=\"javascript\">\r\n//<!--\r\n \tfunction onSubmit()\r\n\t{ \t\t\r\n \t\tvar w = document.form;\r\n \t\t \t \t\t\r\n\t\tif(siguCheck(w.GU_CD_SELECT.value)){\r\n\t\t\tif(w.DEPT_CD.value ==\"\"){\r\n\t\t\t\talert(\"부서코드를 입력해주세요\");\r\n\t\t\t\tw.DEPT_CD.focus();\r\n\t\t\t\treturn\r\n\t\t\t}\r\n\t\t\tif(getByteLength(w.DEPT_CD)>7){\r\n\t\t\t\talert(\"부서코드는  7Byte 를 초과할 수 없습니다.\\r\\n(한글2byte, 영문/숫자 1byte)\");\r\n\t\t\t\tw.DEPT_CD.focus();\r\n\t\t\t\treturn\r\n\t\t\t}\r\n\t\t\t\r\n\t\t\tif(getByteLength(w.DEPT_NM)>50){\r\n\t\t\t\talert(\"부서명은 50Byte 를 초과할 수 없습니다.\\r\\n(한글2byte, 영문/숫자 1byte)\");\r\n\t\t\t\tw.DEPT_NM.focus();\r\n\t\t\t\treturn\r\n\t\t\t}\r\n\t\t\tif(getByteLength(w.MANAGE_WORK)>50){\r\n\t\t\t\talert(\"담담업무 50Byte 를 초과할 수 없습니다.\\r\\n(한글2byte, 영문/숫자 1byte)\");\r\n\t\t\t\tw.MANAGE_WORK.focus();\r\n\t\t\t\treturn\r\n\t\t\t}\r\n\t\t\t\r\n\t\t\tw.submit();\r\n\t\t}else{\r\n\t\t\tw.GU_CD.focus();\r\n\t\t\treturn\r\n\t\t}\t\t\r\n\t\t\r\n\t}\r\n\r\n\tfunction cancel(){\r\n\t\twindow.close();\r\n\t}\r\n\t\t\r\n\tfunction InitPage(){\t\t\r\n\t\t\r\n\t\tvar params = getUrlParameter() || {\r\n\t\t\tact : '";
  private final static String _jspx_template5 = "'\r\n\t\t} ;\r\n\t\tvar action = params['act'];\r\n\t\tvar contextTitle = document.getElementById('title');\r\n\t\tvar eleAction = document.getElementById('ACTION');\r\n\t\teleAction.value = action;\r\n\t\tswitch(action) {\r\n\t\t\tcase 'add': {\r\n\t\t\t\tdocument.title = '부서코드 등록';\r\n\t\t\t\tcontextTitle.innerText = '* 부서코드 등록';\r\n\t\t\t\tbreak;\r\n\t\t\t}\r\n\t\t\tcase 'mod': {\r\n\t\t\t\tdocument.title = '부서명 변경';\r\n\t\t\t\tcontextTitle.innerText = '* 부서명 변경';\r\n\t\t\t\tvar guSelect = document.getElementById('GU_CD_SELECT');\r\n\t\t\t\tvar deptCD = document.getElementById('DEPT_CD');\r\n\t\t\t\tguSelect.disabled = true;\r\n\t\t\t\tdeptCD.readOnly = true;\r\n\t\t\t\tbreak;\r\n\t\t\t}\r\n\t\t}\r\n\t\t\r\n\t\tif('";
  private final static String _jspx_template6 = "'== 'true'){\r\n//\t\t\topener.location.reload('/admin/commCode/orgCode.do'); \r\n\t\t\tvar results = {\r\n\t\t\t\t\tDEPT_CD : '";
  private final static String _jspx_template7 = "',\r\n\t\t\t\t\tDEPT_NM : '";
  private final static String _jspx_template8 = "',\r\n\t\t\t\t\tMANAGE_WORK : '";
  private final static String _jspx_template9 = "'\r\n\t\t\t};\r\n\t\t\tdocument.getElementById('DEPT_CD').value = results.DEPT_CD;\r\n\t\t\tdocument.getElementById('DEPT_NM').value = results.DEPT_NM;\r\n\t\t\tdocument.getElementById('MANAGE_WORK').value = results.MANAGE_WORK;\r\n    }\t\t\t\r\n\t\tif('";
  private final static String _jspx_template10 = "'.length > 0){\r\n            alert('";
  private final static String _jspx_template11 = "');\r\n    }\r\n\t\tif ('";
  private final static String _jspx_template12 = "' == 'true') {\r\n\t\t\twindow.close();\t\t\t\r\n\t\t}\r\n  }\r\n\t  \r\n\tfunction  siguCheck(code)\r\n\t{\t\r\n\t\tif(code==\"000\"){\r\n\t\t\talert(\"시군구명을 선택해주세요.\");\r\n\t\t\treturn false;\r\n\t\t}else{\r\n\t\t\tdocument.getElementById('GU_CD').value = code;\r\n\t\t\treturn true;\r\n\t\t}\r\n\t}\r\n    \r\n\t\r\n//-->\r\n</script>\r\n</head>\r\n\r\n<body onload=\"javascript:InitPage();\">\r\n<form id=\"form\" name=\"form\" method=\"post\" action=\"/admin/commCode/orgCodeRegister.do\">\r\n<input type=\"hidden\" id=\"ACTION\" name=\"ACTION\" value=\"add\"/>\r\n<input type=\"hidden\" id=\"MSG\" name=\"MSG\" value=\"";
  private final static String _jspx_template13 = "\"/>\r\n<table width=\"580\" height=\"130\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\r\n\t<tr>\r\n\t\t<td height=\"30px\" style=\"padding:6\" valign=\"bottom\"><span id=\"title\" class=\"sub_stan_blue\" style=\"font-weight: bold;\">* 부서코드 등록 </span></td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td style=\"padding:6\" valign=\"top\">\r\n\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\"\r\n\t\t\t\tstyle=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"\r\n\t\t\t\tclass=\"sub_table\">\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">시군구명</td>\r\n\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">부서코드</td>\r\n\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">부서명</td>\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">담당업무</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t <tr>\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t<td height=\"26\" align=\"center\">\r\n\t\t\t\t\t\t<input id=\"GU_CD\" name=\"GU_CD\" type=\"hidden\" value=\"000\"/>\r\n\t\t\t\t\t\t<select id=\"GU_CD_SELECT\" name=\"GU_CD_SELECT\" class=\"input_form1\" style=\"width:130px\">\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template14 = "\r\n\t\t\t\t\t\t</select>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t\t<td align=\"center\">\r\n\t\t\t\t\t\t<input type=\"text\" name=\"DEPT_CD\" id=\"DEPT_CD\" size=\"10\" maxlength=\"7\" class=\"input_form1\"/>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t\t<td align=\"center\">\r\n\t\t\t\t\t\t<input type=\"text\" name=\"DEPT_NM\" id=\"DEPT_NM\" size=\"20\"  maxlength=\"50\" class=\"input_form1\"/>\t\t\t\t\t \r\n\t\t\t\t\t</td>\r\n\t\t\t\t\t<td align=\"center\">\r\n\t\t\t\t\t\t<input type=\"text\" name=\"MANAGE_WORK\" id=\"MANAGE_WORK\" size=\"20\"  maxlength=\"50\" class=\"input_form1\"/>\t\t\t\t\t \r\n\t\t\t\t\t</td>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t</tr>\r\n\t\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td align=\"right\" width=\"100%\" style=\"padding-right: 6;\">\r\n\t\t\t<img id=\"imgRegister\" src=\"/img/register_icon2.gif\" alt=\"등록\" width=\"56\" height=\"18\" border=\"0\" style=\"cursor: pointer;display: none;\" onclick=\"javascript:onSubmit()\">\r\n\t\t\t<img id=\"imgModify\" src=\"/img/mod_icon.gif\" alt=\"수정\" width=\"56\" height=\"18\" border=\"0\" style=\"cursor: pointer;display: none;\" onclick=\"javascript:onSubmit()\">\r\n\t\t\t<img src=\"/img/can_icon.gif\" alt=\"취소\" width=\"56\" height=\"18\" border=\"0\" style=\"cursor: pointer;\" onclick=\"javascript:cancel()\">\r\n\t\t</td>\r\n\t</tr>\r\n</table>\r\n\r\n</form>\r\n</body>\r\n</html>\r\n\t\t\t";
}
