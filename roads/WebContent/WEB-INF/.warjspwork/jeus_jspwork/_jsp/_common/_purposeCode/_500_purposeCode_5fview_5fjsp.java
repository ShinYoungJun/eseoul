package jeus_jspwork._jsp._common._purposeCode;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_purposeCode_5fview_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(11,3);to=(14,1)]
      
      	String SectionCode=request.getParameter("SectionCode")==null?"":request.getParameter("SectionCode");
      	String PURPOSE_CD_TEXT=request.getParameter("PURPOSE_CD")==null?"":request.getParameter("PURPOSE_CD");

      out.write(_jspx_template8);
      // jsp code [from=(26,22);to=(26,33)]
      out.print(SectionCode);

      out.write(_jspx_template9);
      // jsp code [from=(27,26);to=(27,41)]
      out.print(PURPOSE_CD_TEXT);

      out.write(_jspx_template10);
      out.write(_jspx_template11);
      // jsp code [from=(242,66);to=(242,81)]
      out.print(PURPOSE_CD_TEXT);

      out.write(_jspx_template12);
      // jsp code [from=(248,98);to=(248,113)]
      out.print(PURPOSE_CD_TEXT);

      out.write(_jspx_template13);

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
  private final static String _jspx_template7 = " \r\n\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n    \r\n<!-- \r\n    \t점용목적 코드\r\n-->\r\n\r\n";
  private final static String _jspx_template8 = "\r\n\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n\r\n<script type=\"text/javascript\"><!--\r\n//<![CDATA[\r\n\r\n//\twindow.onload\t= function()\r\n//\t{\r\n//\t\tSelected_Class();\r\n//\t}\r\n\r\n\tvar SectionCode=\"";
  private final static String _jspx_template9 = "\";\r\n\tvar PURPOSE_CD_TEXT=\"";
  private final static String _jspx_template10 = "\";\r\n\t\r\n\tfunction Init_PurposeCode()\r\n\t{\r\n\t\tSelected_Class();\r\n\t}\r\n\r\n\tfunction getXMLHTTPRequest()\r\n\t{\r\n\t\tvar xRequest = null;\r\n\t\txRequest = new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n\r\n\t\treturn xRequest;\r\n\t}\r\n\r\n\tvar req;\r\n\tvar\tcall;\r\n\t\r\n\tfunction sendRequest(url, params, HttpMethod, callback)\r\n\t{\r\n\t\treq = getXMLHTTPRequest();\r\n\r\n\t\tcall\t= callback;\r\n\t\tif(req){\r\n\t\t\treq.onreadystatechange = onReadyStateChange;\r\n\t\t\treq.open(HttpMethod, url, true);\r\n\t\t\treq.setRequestHeader(\"Content-Type\",\"application/x-www-form-urlencoded;charset=UTF-8\");\r\n\t\t\treq.send(params);\r\n\t\t}\r\n\t}\r\n\r\n\tfunction onReadyStateChange()\r\n\t{\r\n\t\tvar ready = req.readyState;\r\n\t\tvar data = null;\r\n\t\tif(ready == 4){\r\n\t\t\tif(this.call\t!= null)\r\n\t\t\t\tthis.call(req.responseText);\r\n\t\t}\r\n\t}\r\n\r\n\t\r\n    function fncSelectBoxSetting(strParam, selectBoxId, defaultSel, topLabel)\r\n    {\r\n        var xmldoc = new ActiveXObject(\"Microsoft.XMLDOM\");\r\n        var selectBoxLabel;\r\n        var opt = document.getElementById(selectBoxId);\r\n        \r\n\r\n   //     xmldoc.async\t= \"false\";\r\n   \r\n\t    xmldoc.loadXML(strParam);\r\n\t    var root = xmldoc.getElementsByTagName(\"option\").length;\r\n\t\r\n\t   //alert(strParam);\r\n        // defaultSel --; //20090805 전영수 수정전\r\n\r\n        if(defaultSel\t< 0)\r\n        \tselectBoxLabel\t= \"\";\r\n        else\r\n        {\r\n  \t\t//selectBoxLabel = xmldoc.getElementsByTagName(\"option/@label\").item(defaultSel).text;  //20090805 전영수 수정전\r\n  \t\tfor(var i=0; i<root; i++)\r\n  \t\t{\r\n  \t\t   if(xmldoc.getElementsByTagName(\"option/@value\").item(i).text==defaultSel)\r\n  \t\t   {\r\n  \t\t       selectBoxLabel = xmldoc.getElementsByTagName(\"option/@label\").item(i).text;\r\n  \t\t   }\r\n  \t\t}\r\n  \t\t\t\r\n  \t}\r\n  \t\r\n\topt.value\t= selectBoxLabel;\r\n    }\r\n\t\t\r\n\r\n\tfunction\tSelected()\r\n\t{\t\r\n\t\tvar form = document.form;\r\n\r\n\t\tvar\tClassCode\t= document.getElementById(\"PURPOSE1\");\r\n\t\tvar\tSortCode\t= document.getElementById(\"PURPOSE2\");\r\n\t\tvar\tKindCode\t= document.getElementById(\"PURPOSE3\");\r\n\t\tvar\tPurposeCode\t= document.getElementById(\"PURPOSE_CD\");\r\n\r\n\t\tif(ClassCode == null)\tClassCode\t= 0;\r\n\t\tif(SortCode == null)\tSortCode\t= 0;\r\n\t\tif(KindCode == null)\tKindCode\t= 0;\t\r\n\t\t\t\r\n\t\tvar\tresult\t= ClassCode.value + SortCode.value + KindCode.value;\r\n\r\n\t\tPurposeCode.value\t= result;\r\n\t}\r\n\r\n\tfunction\tSelected_Class()\r\n\t{\r\n\t\tvar\tPurposeCode\t= document.getElementById(\"PURPOSE_CD\");\r\n\t\tvar\tparam\t= \"SectionCode=\"+SectionCode;\r\n\t\t\r\n\t\tif(PurposeCode\t==\tnull\t||\tPurposeCode.value\t==\t\"\")\r\n\t\t\tPurposeCode.value\t= \"\";\r\n\r\n\t\tsendRequest(\"/purposeclasscode.do\", param, \"GET\", Search_Result_Class);\r\n\t}\r\n\r\n\tfunction\tResult_Class(obj)\r\n\t{\r\n\t\tfncSelectBoxSetting(obj, \"PURPOSE1\", 0, \"선택\");\r\n\r\n\t//\tSelected();\r\n\t}\r\n\r\n\tfunction\tSelected_Sort()\r\n\t{\r\n\t\tvar\tClassCode\t= document.getElementById(\"PURPOSE1\");\r\n\t\tvar\tparam\t= \"ClassCode=\" + ClassCode.value+\"&SectionCode=\"+SectionCode;\r\n\t\talert(param);\r\n\t\t\r\n\t\tsendRequest(\"/purposesortcode.do\", param, \"GET\", Result_Sort);\r\n\t}\r\n\r\n\tfunction\tResult_Sort(obj)\r\n\t{\t\r\n\t\tfncSelectBoxSetting(obj, \"PURPOSE2\", 0, \"선택\");\r\n\r\n\t\tSelected_Kind();\r\n\r\n\t\tSelected();\r\n\t}\r\n\r\n\tfunction\tSelected_Kind()\r\n\t{\r\n\t\tvar\tClassCode\t= document.getElementById(\"PURPOSE1\");\r\n\t\tvar\tSortCode\t= document.getElementById(\"PURPOSE2\");\r\n\t\tvar\tparam\t= \"ClassCode=\" + ClassCode.value + \"&SortCode=\" + SortCode.value+\"&SectionCode=\"+SectionCode;\r\n\r\n\t\tsendRequest(\"/purposekindcode.do\", param, \"GET\", Result_Kind);\r\n\t}\r\n\r\n\tfunction\tResult_Kind(obj)\r\n\t{\r\n\t\tfncSelectBoxSetting(obj, \"PURPOSE3\", 0, \"선택\");\r\n\r\n\t\tSelected();\r\n\t}\r\n\r\n\t\r\n\tfunction\tPurposeCode_Search()\r\n\t{\r\n\t\tif(event.keyCode!=13)\r\n\t\t\treturn;\r\n\r\n\t\tvar\tPurposeCode\t= document.getElementById(\"PURPOSE_CD\").value;\r\n\r\n\t\tif(PurposeCode.length > 3)\r\n\t\t{\r\n\t\t//\talert(\"3자리를 입력하세요\");\r\n\t\t\treturn;\r\n\t\t}\r\n\r\n\t\tsendRequest(\"/purposeclasscode.do\", null, \"GET\", Search_Result_Class);\r\n\t}\r\n\r\n\tfunction\tSearch_Result_Class(obj)\r\n\t{\r\n\t\tvar\tPurposeCode\t= document.getElementById(\"PURPOSE_CD\").value;\r\n\t\tvar\tClassCode\t= PurposeCode.substring(0, 1);\r\n\t\tfncSelectBoxSetting(obj, \"PURPOSE1\", ClassCode, \"선택\");\r\n\r\n\t\tparam\t= \"ClassCode=\" + ClassCode+\"&SectionCode=\"+SectionCode;\r\n\t\tsendRequest(\"/purposesortcode.do\", param, \"GET\", Search_Result_Sort);\t\r\n";
  private final static String _jspx_template11 = "\t}\r\n\r\n\tfunction\tSearch_Result_Sort(obj)\r\n\t{\r\n\t\tvar\tPurposeCode\t= document.getElementById(\"PURPOSE_CD\").value;\r\n\t\tvar\tClassCode\t= PurposeCode.substring(0, 1);\r\n\t\tvar\tSortCode\t= PurposeCode.substring(1, 2);\r\n\t\tfncSelectBoxSetting(obj, \"PURPOSE2\", SortCode, \"선택\");\r\n\r\n\t\tparam\t= \"ClassCode=\" + ClassCode + \"&SortCode=\" + SortCode+\"&SectionCode=\"+SectionCode;\r\n\t\tsendRequest(\"/purposekindcode.do\", param, \"GET\", Search_Result_Kind);\r\n\t}\r\n\r\n\tfunction\tSearch_Result_Kind(obj)\r\n\t{\r\n\t\tvar\tPurposeCode\t= document.getElementById(\"PURPOSE_CD\").value;\r\n\t\tvar\tKindCode\t= PurposeCode.substring(2, 3);\r\n\t\tfncSelectBoxSetting(obj, \"PURPOSE3\", KindCode, \"선택\");\r\n\r\n\t\tvar\tClassCode\t= document.getElementById(\"PURPOSE1\").value;\r\n\t\tvar\tSortCode\t= document.getElementById(\"PURPOSE2\").value;\r\n\t\tvar\tKindCode\t= document.getElementById(\"PURPOSE3\").value;\r\n\t\tvar\tPurposeCode\t= document.getElementById(\"PURPOSE_CD\").value;\r\n\t\tvar\tPurposeName\t= \"[\" + PurposeCode + \"] \";\r\n\r\n\t\tif( (ClassCode!=\"undefined\") && (ClassCode.length\t> 1) )\r\n\t\t\tPurposeName += ClassCode;\r\n\t\tif( (SortCode!=\"undefined\") && (SortCode.length\t> 1) )\r\n\t\t\tPurposeName += \" - \" + SortCode;\r\n\t\tif( (KindCode!=\"undefined\") && (KindCode.length\t> 1) )\r\n\t\t\tPurposeName += \" - \" + KindCode;\r\n\r\n\t\tdocument.getElementById(\"PURPOSE_NM\").value\t= PurposeName;\r\n\t\t\t\t\r\n\t//\tdocument.getElementById(\"PURPOSE_NM\").value\t= \"[\" + PurposeCode + \"] \" + ClassCode + \" - \" + SortCode + \" - \" + KindCode; \r\n\t\t\r\n\t}\r\n\r\n//]]>\r\n-->\r\n</script>\r\n\r\n<html>\r\n<body class=\"view\" leftmargin=0 topmargin=0 onload=\"Init_PurposeCode();\">\r\n<input type=\"hidden\" id=\"PURPOSE_CD\" name=\"PURPOSE_CD\" value=\"";
  private final static String _jspx_template12 = "\">\r\n<input type=\"hidden\" id=\"PURPOSE1\" name=\"PURPOSE1\" value=\"\">\r\n<input type=\"hidden\" id=\"PURPOSE2\" name=\"PURPOSE2\" value=\"\">\r\n<input type=\"hidden\" id=\"PURPOSE3\" name=\"PURPOSE3\" value=\"\">\r\n\r\n<td>\r\n\t<input id=\"PURPOSE_NM\" name=\"PURPOSE_NM\" type=\"text\" class=\"view\" style=\"width:630px\" value=\"";
  private final static String _jspx_template13 = "\" readonly>\r\n</td>\r\n\r\n<!--\r\n<td class=\"table_bl_left\"><a href=\"javascript:Selected();\"><img src=\"/img/search_icon.gif\" alt=\"검색\" width=\"56\" height=\"18\" border=\"0\"></a></td>\r\n-->\r\n</body>\r\n</html>";
}
