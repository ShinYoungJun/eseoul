package jeus_jspwork._jsp._gapan._jumyong;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_publish_5fdoc_5fjsp extends jeus.servlet.jsp.HttpJspBase {

  public final String[] __jeusGetIncludedJspFiles() {
    return new String[] {
      "/jsp/common/environment_setting.jsp",
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
      // jsp code [from=(1,3);to=(12,1)]
      
         String MapServerIP="98.33.1.86";
         String MapServerPort="8080";
         String MapServerURL="http://"+MapServerIP+":"+MapServerPort;
         
         String WebServerIP=MapServerIP;
         String WebServerPort=MapServerPort;
         String WebServerURL="http://"+WebServerIP;
         
         String newMapAddr="/RoadsMap/MapService";//WEbtoB proxy process
         

      out.write(_jspx_template1);
      // jsp code [from=(1,3);to=(6,1)]
      
      	String 		userId	= (String)session.getAttribute("sessionUserId");
      	
      	if(userId == null)
      	{

      out.write(_jspx_template2);
      // jsp code [from=(11,3);to=(13,1)]
      
      	}

      out.write(_jspx_template3);
      out.write(_jspx_template4);
      out.write(_jspx_template5);
      out.write(_jspx_template6);
      out.write(_jspx_template7);
      out.write(_jspx_template8);
      out.write(_jspx_template9);
      out.write(_jspx_template10);
      out.write(_jspx_template11);
      // jsp code [from=(192,47);to=(192,59)]
      out.print(WebServerURL);

      out.write(_jspx_template12);
      // jsp code [from=(206,55);to=(206,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(207,54);to=(207,60)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GP_TYP}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(208,56);to=(208,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${USER_ID}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(225,138);to=(225,146)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(244,147);to=(244,155)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SF_VALUE}",java.lang.String.class , pageContext.getVariableResolver(), null));

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
  private final static String _jspx_template1 = " \r\n";
  private final static String _jspx_template2 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('사용자의 사용시간이 종료되었습니다. 다시 접속 해주시기 바랍니다.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template3 = "\r\n";
  private final static String _jspx_template4 = "\r\n";
  private final static String _jspx_template5 = "  \r\n";
  private final static String _jspx_template6 = "  \r\n";
  private final static String _jspx_template7 = "  \r\n";
  private final static String _jspx_template8 = "\r\n";
  private final static String _jspx_template9 = "\r\n";
  private final static String _jspx_template10 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html>\r\n    <head>\r\n        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n        <title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n        <style type=\"text/css\">\r\n            <!--\r\n            body {\r\n                margin: 0px;\r\n                background-image: url(/img/left_back.gif);\r\n            }\r\n            -->\r\n        </style>\r\n        <link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n        \r\n        <script language=\"javascript\" src=\"/jsp/RexServer/rexscript/rexpert.js\"></script>\r\n\t\t<script language=\"javascript\" src=\"/jsp/RexServer/rexscript/rexpert_properties.js\"></script>\r\n\t\t<script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script>\r\n\t\t<script language=\"javascript\" src=\"/js/Check_inputbox.js\"></script>\r\n\r\n\r\n        <script type=\"text/javascript\">\r\n\r\n        \tfunction Init(){\r\n\r\n        \t\tvar d = new Date();\r\n        \t\t\t  var s =\r\n        \t\t\t    leadingZeros(d.getFullYear(), 4) + '-' +\r\n        \t\t\t    leadingZeros(d.getMonth() + 1, 2) + '-' +\r\n        \t\t\t    leadingZeros(d.getDate(), 2);\r\n        \t\t\t  document.getElementById(\"PUBLISH_DATE\").value = s;\r\n\r\n        \t\t\t  calculation_Loan(document.getElementById(\"GAPAN_PRICE\"));\r\n        \t\r\n        \t\t\t            \t\r\n\r\n\r\n        \t}\r\n\r\n        \tfunction leadingZeros(n, digits) {\r\n        \t\t  var zero = '';\r\n        \t\t  n = n.toString();\r\n\r\n        \t\t  if (n.length < digits) {\r\n        \t\t    for (i = 0; i < digits - n.length; i++)\r\n        \t\t      zero += '0';\r\n        \t\t  }\r\n        \t\t  return zero + n;\r\n        \t}\r\n\r\n\r\n        \tfunction calculation_Loan(obj){\r\n\r\n        \t\tnr_num(obj);\r\n\r\n        \t\tvar gapan_price = parseInt(document.getElementById(\"GAPAN_PRICE\").value);\r\n        \t\t\r\n\r\n        \t\tif(isNaN(gapan_price)){\r\n    \t\t\t\tdocument.getElementById(\"LOAN_PRICE_TXT\").innerHTML = '0'+\" * 0.07 = \"+'0';\r\n    \t\t\t\tdocument.getElementById(\"LOAN_PRICE\").value = '0';\r\n\t\t\t\t}else{\r\n\t        \t\tvar result = Math.round(parseFloat(gapan_price * 0.07));\r\n\t        \t  // sungh83 대부료 100 절삭 //\r\n\t    \t      //\tresult = Math.floor(result/10)*10;\r\n\t            \t\tresult = Math.floor(result/100)*100;\t \r\n\t    \t      // sungh83 대부료 100 절삭 //\t\t\r\n\t        \t\t\r\n\t\t\t\t\tdocument.getElementById(\"LOAN_PRICE_TXT\").innerHTML = gapan_price+\" * 0.07 = \"+result;\r\n\t\t\t\t\tdocument.getElementById(\"LOAN_PRICE\").value = result;\r\n\t\t\t\t}\r\n        \t\t\r\n\r\n\r\n        \t\t\r\n\r\n            }\r\n\r\n        \tfunction publishPrc(val){\r\n\r\n        \t\tvar form \t= document.form;\r\n        \t\tvar\tstr\t\t= \"\";\r\n        \t\t// 점용인 정보\r\n        \t\t\r\n\r\n\r\n        \t\tif(val =='contract'){\r\n        \t\t\tif(form.DOC_NO.value.length\t< 1)\r\n            \t\t{\r\n            \t\t\tstr\t+= \"출력될 관리번호를 입력하세요\\n\";\r\n            \t\t\talert(str);\r\n            \t\t\tform.DOC_NO.focus();\r\n            \t\t}else if(form.SERVICE_ITEM.value.length\t< 1)\r\n            \t\t{\r\n            \t\t\tstr\t+= \"출력될 취급품목을 입력하세요\\n\";\r\n            \t\t\talert(str);\r\n            \t\t\tform.SERVICE_ITEM.focus();\r\n            \t\t}else if(form.GAPAN_PRICE.value.length\t< 1)\r\n            \t\t{\r\n            \t\t\tstr\t+= \"대부료을 입력하세요\\n\";\r\n            \t\t\talert(str);\r\n            \t\t\tform.GAPAN_PRICE.focus();\r\n            \t\t}else{\r\n            \t\t\tfnRojumContract();\r\n                \t}\r\n                \t\t\r\n\r\n        \t\t\t\r\n        \t\t}else{\r\n\r\n        \t\t\tif(form.DOC_NO.value.length\t< 1)\r\n            \t\t{\r\n            \t\t\tstr\t+= \"출력될 관리번호를 입력하세요\\n\";\r\n            \t\t\talert(str);\r\n            \t\t\tform.DOC_NO.focus();\r\n            \t\t}else if(form.SERVICE_ITEM.value.length\t< 1)\r\n            \t\t{\r\n            \t\t\tstr\t+= \"출력될 취급품목을 입력하세요\\n\";\r\n            \t\t\talert(str);\r\n            \t\t\tform.SERVICE_ITEM.focus();\r\n            \t\t}else{\r\n            \t\t\tfnRojumCerty();\r\n                \t}\r\n            \t}\r\n        \t\t\r\n            }\r\n\r\n            function fnRojumContract()\r\n            {\r\n                var oRptMainParam;\r\n                oRptMainParam = rex_GetgoDictionay(); \r\n\r\n                // 옵션 - viewer\t\r\n                oRptMainParam.put(\"rex_open_window\", \"center=yes,scrollbars=no,status=no,toolbar";
  private final static String _jspx_template11 = "=no,resizable=0,location=no,menu=no,width=1000,height=1000\");\r\n\t\r\n                // 필수 - 레포트명\r\n                oRptMainParam.put(\"rex_rptname\", \"Rojum_contract\");\r\n\r\n                // 필수 - 데이터 타입 설정\r\n                oRptMainParam.put(\"rex_datatype\", \"XML\");  // XML, CSV\r\n\r\n                // 옵션 - 다른 DB를 연결시\r\n                oRptMainParam.put(\"rex_userservice\", \"oracle_jndi\");\r\n\r\n                // 옵션 - 파라메터 설정\r\n                var form \t= document.form;\r\n\r\n                oRptMainParam.put(\"DOC_NO\" ,form.DOC_NO.value);\r\n\t\t\t\t\t\t\t\toRptMainParam.put(\"GAPAN_NO\" ,form.GAPAN_NO.value);\r\n                oRptMainParam.put(\"GP_TYP\" ,form.GP_TYP.value);\r\n                oRptMainParam.put(\"USER_ID\" ,form.USER_ID.value);\r\n                oRptMainParam.put(\"SERVICE_ITEM\" ,form.SERVICE_ITEM.value);\r\n                oRptMainParam.put(\"LOAN_PRICE\" ,form.LOAN_PRICE.value);\r\n                oRptMainParam.put(\"PUBLISH_DATE\" ,form.PUBLISH_DATE.value);\r\n                \r\n                // preview 팝업 열기\r\n                rex_gfRexRptOpen(\"popup\", oRptMainParam);\r\n\t\t\r\n                return oRptMainParam;\t\r\n            }\r\n            \r\n            function fnRojumCerty()\r\n            {\r\n                var oRptMainParam;\r\n                oRptMainParam = rex_GetgoDictionay(); \r\n\r\n                // 옵션 - viewer\t\r\n                oRptMainParam.put(\"rex_open_window\", \"center=yes,scrollbars=no,status=no,toolbar=no,resizable=0,location=no,menu=no,width=1000,height=1000\");\r\n\t\r\n                // 필수 - 레포트명\r\n                oRptMainParam.put(\"rex_rptname\", \"Rojum_Certy\");\r\n\r\n                // 필수 - 데이터 타입 설정\r\n                oRptMainParam.put(\"rex_datatype\", \"XML\");  // XML, CSV\r\n\r\n                // 옵션 - 다른 DB를 연결시\r\n                oRptMainParam.put(\"rex_userservice\", \"oracle_jndi\");\r\n\r\n                // 옵션 - 파라메터 설정\r\n                var form \t= document.form;\r\n\t\r\n                oRptMainParam.put(\"DOC_NO\" ,form.DOC_NO.value);\r\n\t\t\t\toRptMainParam.put(\"GAPAN_NO\" ,form.GAPAN_NO.value);\r\n                oRptMainParam.put(\"GP_TYP\" ,form.GP_TYP.value);\r\n                oRptMainParam.put(\"SERVICE_ITEM\" ,form.SERVICE_ITEM.value);\r\n                oRptMainParam.put(\"PUBLISH_DATE\" ,form.PUBLISH_DATE.value);\r\n                oRptMainParam.put(\"PATH\" ,'";
  private final static String _jspx_template12 = "'+'/roadsnas/gapan/');\r\n                \r\n\r\n                // preview 팝업 열기\r\n                rex_gfRexRptOpen(\"popup\", oRptMainParam);\r\n\t\t\r\n                return oRptMainParam;\t\r\n            }\r\n        </script>\r\n\r\n    </head>\r\n    <body onload=\"Init()\">\r\n    <form id=\"form\" name=\"form\">\r\n    \r\n        <input name=\"GAPAN_NO\" id=\"GAPAN_NO\" value=\"";
  private final static String _jspx_template13 = "\" type=\"hidden\" >\r\n        <input name=\"GP_TYP\"  id = \"GP_TYP\" value=\"";
  private final static String _jspx_template14 = "\" type=\"hidden\" >\r\n        <input name=\"USER_ID\"  id = \"USER_ID\" value=\"";
  private final static String _jspx_template15 = "\" type=\"hidden\" >\r\n        <input name=\"LOAN_PRICE\" id =\"LOAN_PRICE\" value=\"\" type=\"hidden\" >\r\n        \r\n\r\n\r\n        <table width=\"780\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\r\n\r\n            <tr>\r\n                <td align=\"left\" class=\"contborder_blue\">\r\n                    <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                        <tr>\r\n                            <td>\r\n                            <table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n                                    <tr>\r\n                                        <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">관리번호</td>\r\n                                         <td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n                                         \t<input id=\"DOC_NO\" name=\"DOC_NO\" type=\"text\" class=\"input_form1\" style=\"width:160px\"  value=\"";
  private final static String _jspx_template16 = "\"  maxlength=\"20\">\r\n                                       \t </td>\r\n                                        <td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">발급일</td>\r\n                                        <td width=\"\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n                                                <tr>\r\n                                                    <td><input id=\"PUBLISH_DATE\"  name=\"PUBLISH_DATE\" type=\"text\" class=\"input_form1\" style=\"width:70px\" value=\"\" readonly></td>\r\n                                                    <td><a><img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, document.getElementById('PUBLISH_DATE'), 'yyyymmdd')\" style=\"CURSOR: Hand;\"></a></td>\t\t\t\t  \r\n                                                </tr>\r\n                                            </table></td>\r\n                                    </tr>\r\n\r\n                                    <tr>\r\n                                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">취급품목</td>\r\n                                        <td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><input id=\"SERVICE_ITEM\"  name=\"SERVICE_ITEM\" type=\"text\" class=\"input_form1\" style=\"width:300px\" value=\"허가조건 3항\" maxlength=\"40\"></td>\r\n                                    </tr>\r\n\r\n                                    <tr>\r\n                                        <td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">시설물 가액</td>\r\n                                        <td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n                                        <input id=\"GAPAN_PRICE\"  name=\"GAPAN_PRICE\" type=\"text\" class=\"input_form1\" style=\"width:120px\"  value=\"";
  private final static String _jspx_template17 = "\"  maxlength=\"15\" onkeyup=\"calculation_Loan(this)\" ></td>\r\n                                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">대부료</td>\r\n                                        <td bgcolor=\"eaeaea\" class=\"table_bl_left\"><span id=\"LOAN_PRICE_TXT\"></span></td>\r\n                                    </tr>\r\n\r\n                                </table></td>\r\n                        </tr>\r\n\r\n                        <tr>\r\n                            <td height=\"40\"  align=\"right\">\r\n                                 <img src=\"/img/loan_contract_icon.gif\" alt=\"대부계약서\"  onclick=\"javascript:publishPrc('contract');\" style=\"cursor:pointer\">\r\n                                 <img src=\"/img/rojum_certy_icon.gif\" alt=\"운영자 증명서\" onclick=\"javascript:publishPrc('certy');\" style=\"cursor:pointer\">\r\n                            </td>\r\n                        </tr>\r\n\r\n                        <tr>\r\n                            <td height=\"1\" bgcolor=\"#EAEAEA\"></td>\r\n                        </tr>\r\n\r\n                    </table>\r\n            \t</td>\r\n            </tr>\r\n\r\n\r\n        </table>\r\n        \r\n        \r\n    \t</form>\r\n        \r\n\r\n       \r\n\r\n\r\n    </body>\r\n</html>";
}
