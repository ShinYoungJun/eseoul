package jeus_jspwork._jsp._admin._commCode;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_insertOfficeCode_5fjsp extends jeus.servlet.jsp.HttpJspBase {

  public final String[] __jeusGetIncludedJspFiles() {
    return new String[] {
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
      out.write(_jspx_template1);
      out.write(_jspx_template2);
      out.write(_jspx_template3);
      out.write(_jspx_template4);
      out.write(_jspx_template5);
      out.write(_jspx_template6);
      out.write(_jspx_template7);
      out.write(_jspx_template8);
      // jsp code [from=(134,57);to=(134,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${result}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template9);
      // jsp code [from=(135,55);to=(135,59)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mode}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(136,60);to=(136,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${office_cd}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(137,59);to=(137,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${jijum_cd}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(183,85);to=(183,94)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${office_nm}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(190,85);to=(190,93)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${jijum_nm}",java.lang.String.class , pageContext.getVariableResolver(), null));

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
  private final static String _jspx_template0 = "\r\n";
  private final static String _jspx_template1 = "\r\n";
  private final static String _jspx_template2 = "  \r\n";
  private final static String _jspx_template3 = "  \r\n";
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "\r\n";
  private final static String _jspx_template6 = "\r\n";
  private final static String _jspx_template7 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n\r\n<html>\r\n    <head>\r\n        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n        <title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n\r\n\r\n        <style type=\"text/css\">\r\n            <!--\r\n            body {\r\n                margin: 0px;\r\n                background-image: url(/img/left_back.gif);\r\n            }\r\n            html {overflow-x : hidden;}\r\n            -->\r\n        </style>\r\n        <link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n    </head>\r\n\r\n    <script language=\"javascript\" src=\"/js/common.js\"></script>\r\n    <script language=\"javascript\" src=\"/js/Check_inputbox.js\"></script>\r\n    <script type=\"text/javascript\">\r\n//<![CDATA[\r\n        //초기화\r\n        function init(){\r\n            if(document.getElementById(\"mode\").value == \"reg\"){\r\n                document.getElementById(\"mode_reg\").style.display = \"block\";\r\n                document.getElementById(\"mode_modify\").style.display = \"none\";\r\n            }\r\n          //********** BEGIN_KANG_20120416\r\n          //   else if(document.getElementById(\"mode\").value == \"modify\"){\r\n             else if(document.getElementById(\"mode\").value == \"modify\" || document.getElementById(\"mode\").value == \"delete\"){\r\n            \t \r\n          //********** END_KANG_20120416\r\n                document.getElementById(\"mode_reg\").style.display = \"none\";\r\n                document.getElementById(\"mode_modify\").style.display = \"block\";\r\n            }else{\r\n                alert(\"어 모드값 없다\");\r\n            }\r\n        }\r\n\r\n        //저장처리\r\n        function fn_insert()\r\n        {\r\n            var w = document.regForm;\r\n            w.action = \"/admin/commCode/insertOfficeCodePrc.do\";\r\n            w.submit();\r\n\r\n        }\r\n\r\n        //수정처리\r\n        function fn_modify()\r\n        {\r\n            var result = confirm(\"업체명과 지점명을 수정하실경우 과거 DATA도 변경됩니다. 진행하시겠습니까?\");\r\n            if(result){\r\n            \tvar w = document.regForm;\r\n                w.action = \"/admin/commCode/modifyOfficeCodePrc.do\";\r\n                w.submit();\r\n            }\r\n        }\r\n\r\n      //********** BEGIN_KANG_20120416\r\n      function fn_del()\r\n      {\r\n            var result = confirm(\"업체명과 지점명을 삭제하실경우 과거 DATA에도 영향을 미칠 수 있습니다. 진행하시겠습니까?\");\r\n            if(result){\r\n            \tvar w = document.regForm;\r\n                w.action = \"/admin/commCode/deleteOfficeCodePrc.do\";\r\n                w.submit();\r\n            }\r\n        }\r\n      //********** END_KANG_20120416\r\n        \r\n\r\n        //처리 후 성공여부처리\r\n        function fn_callBack()\r\n        {\r\n            var fm = document.regForm;\r\n        \t//********** BEGIN_KANG_20120416\r\n            /*\r\n\t\t\t if(fm.result.value != \"\")\r\n            {\r\n                if(fm.result.value == 'true')\r\n                {\r\n                    alert(\"수정되었습니다.\");\r\n                    window.close();\r\n                    var searchOfficeName = opener.document.getElementById(\"searchOfficeName\").value;\r\n\r\n                    opener.location.href = \"/admin/commCode/officeCode.do?searchOfficeName=\"+searchOfficeName;\r\n\r\n                }\r\n              else{\r\n                    alert(fm.result.value);\r\n                }\r\n            }\r\n\r\n            */\r\n            if(fm.result.value != \"\")\r\n            {\r\n                if(fm.result.value == 'true' || fm.result.value == 'delete' || fm.result.value == 'insert')\r\n                {\r\n                    var msg = \"\";\r\n                    if(fm.result.value == 'true') msg = \"수정되었습니다.\";\r\n                    if(fm.result.value == 'delete') msg = \"삭제되었습니다.\";\r\n                    if(fm.result.value == 'insert') msg = \"입력되었습니다.\";\r\n                    alert(msg);\r\n                    window.close();\r\n                    var searchOfficeName = opener.document.getElementById(\"searchOfficeName\").value;\r\n\r\n                    opener.location.href = \"/admin/commCode/officeCode.do?searchOfficeName=\"+searchOfficeName;\r\n\r\n                }\r\n              else{\r\n                    alert(fm.result.value);\r\n                }\r\n            }\r\n  ";
  private final static String _jspx_template8 = "          \r\n            //********** END_KANG_20120416\r\n\t\t}\r\n\r\n\r\n\r\n    //]]>\r\n</script>\r\n\r\n    <body onload=\"init(),fn_callBack()\">\r\n\r\n        <form name=\"regForm\" id=\"regForm\" method=\"post\" action=\"\">\r\n\r\n            <input name=\"result\" type=\"hidden\" value=\"";
  private final static String _jspx_template9 = "\">\r\n            <input name=\"mode\" type=\"hidden\" value=\"";
  private final static String _jspx_template10 = "\">\r\n            <input name=\"office_cd\" type=\"hidden\" value=\"";
  private final static String _jspx_template11 = "\">\r\n            <input name=\"jijum_cd\" type=\"hidden\" value=\"";
  private final static String _jspx_template12 = "\">\r\n\r\n\r\n\r\n            <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                <tr>\r\n                    <td height=\"13\" colspan=\"3\"></td>\r\n                </tr>\r\n                <tr>\r\n                    <td height=\"47\"width=\"15\"></td>\r\n                   <td>\r\n                        <table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\"\r\n                               class=\"admin_w\">\r\n                            <tr>\r\n                                <td width=\"33\"><img src=\"/img/admin_pop_left.gif\" width=\"33\"\r\n                                                    height=\"47\"></td>\r\n                                <td background=\"/img/admin_pop_cen.gif\">업체 정보 입력</td>\r\n                                <td width=\"33\"><img src=\"/img/admin_pop_right.gif\" width=\"33\"\r\n                                                    height=\"47\"></td>\r\n                            </tr>\r\n                        </table>\r\n                    </td>\r\n                    <td width=\"15\"></td>\r\n                </tr>\r\n\r\n                <tr>\r\n                    <td height=\"47\">\r\n                    </td>\r\n                    <td>\r\n                        <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                            <tr>\r\n                                <td height=\"20\"></td>\r\n                            </tr>\r\n                            <tr>\r\n                                <td width=\"48%\" valign=\"top\" bgcolor=\"#FFFFFF\" class=\"admin_bl_left\">\r\n                                    <table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n                                        <tr>\r\n                                            <td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\"\r\n                                                class=\"sub_table_b\">구분</td>\r\n                                            <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\"\r\n                                                colspan=\"3\">내용</td>\r\n                                        </tr>\r\n                                        <tr>\r\n                                            <td height=\"26\" align=\"center\" >업체명</td>\r\n                                            <td class=\"table_bl_left\">\r\n                                                <input name=\"office_nm\" type=\"text\" class=\"input_form1\" maxlength=\"50\"\r\n                                                       style=\"width:160px\" value=\"";
  private final static String _jspx_template13 = "\">\r\n                                            </td>\r\n                                        </tr>\r\n                                        <tr>\r\n                                            <td height=\"26\" align=\"center\" >지점명</td>\r\n                                            <td class=\"table_bl_left\">\r\n                                                <input name=\"jijum_nm\" type=\"text\" class=\"input_form1\" maxlength=\"50\"\r\n                                                       style=\"width:160px\" value=\"";
  private final static String _jspx_template14 = "\">\r\n                                            </td>\r\n                                        </tr>\r\n                                    </table>\r\n                                </td>\r\n                            </tr>\r\n                        </table>\r\n                    </td>\r\n                    <td></td>\r\n                </tr>\r\n            </table>\r\n            <div id=\"mode_reg\" style=\"display:none\">\r\n                <table align=\"center\">\r\n                    <tr>\r\n                        <td height=\"50\" colspan=\"3\" align=\"center\">\r\n                            <a href=\"#\">\r\n                                <img src=\"/img/save_icon2.gif\" alt=\"저장\" width=\"56\" height=\"18\" border=\"0\" onClick=\"javascript:fn_insert()\"/></a>\r\n                            <a href=\"#\">\r\n                                <img src=\"/img/can_icon.gif\" alt=\"취소\" width=\"56\" height=\"18\" border=\"0\" onClick=\"javascript:window.close()\"/></a>\r\n                        </td>\r\n                    </tr>\r\n                </table>\r\n            </div>\r\n            <div id=\"mode_modify\" style=\"display:none\">\r\n                <table align=\"center\">\r\n                    <tr>\r\n                        <td height=\"50\" colspan=\"3\" align=\"center\">\r\n                            <a href=\"#\">\r\n                                <img src=\"/img/mod_icon2.gif\" alt=\"수정\" width=\"34\" height=\"18\" border=\"0\" onClick=\"javascript:fn_modify()\"/></a>\r\n\t\t\t\t\t\t\t<!--  //********** BEGIN_KANG_20120416 -->\r\n\t\t\t\t\t\t\t<a href=\"#\">\r\n                                <img src=\"/img/del_icon3.gif\" alt=\"삭제\" width=\"56\" height=\"18\" border=\"0\" onClick=\"javascript:fn_del()\"/></a>\r\n\t\t\t\t\t\t\t<!--   //********** END_KANG_20120416 -->                               \r\n                            <a href=\"#\">\r\n                                <img src=\"/img/can_icon.gif\" alt=\"취소\" width=\"56\" height=\"18\" border=\"0\" onClick=\"javascript:window.close()\"/></a>\r\n                        </td>\r\n                    </tr>\r\n                </table>\r\n\r\n            </div>\r\n        </form>\r\n    </body>\r\n</html>\r\n\r\n";
}
