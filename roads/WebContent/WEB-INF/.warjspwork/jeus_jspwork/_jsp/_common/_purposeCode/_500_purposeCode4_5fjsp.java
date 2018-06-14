package jeus_jspwork._jsp._common._purposeCode;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_purposeCode4_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(11,3);to=(17,1)]
      
      	String SectionCode=request.getParameter("SectionCode")==null?"":request.getParameter("SectionCode");
      	String PURPOSE_CD_TEXT=request.getParameter("PURPOSE_CD")==null?"":request.getParameter("PURPOSE_CD");
      	String essential=request.getParameter("essential")==null?"":request.getParameter("essential");
      	String modify_flag=request.getParameter("modify_flag")==null?"":request.getParameter("modify_flag");
      	String search_flag=request.getParameter("search_flag")==null?"":request.getParameter("search_flag");

      out.write(_jspx_template8);
      // jsp code [from=(25,22);to=(25,33)]
      out.print(SectionCode);

      out.write(_jspx_template9);
      // jsp code [from=(26,26);to=(26,41)]
      out.print(PURPOSE_CD_TEXT);

      out.write(_jspx_template10);
      // jsp code [from=(27,20);to=(27,29)]
      out.print(essential);

      out.write(_jspx_template11);
      // jsp code [from=(28,22);to=(28,33)]
      out.print(modify_flag);

      out.write(_jspx_template12);
      // jsp code [from=(29,22);to=(29,33)]
      out.print(search_flag);

      out.write(_jspx_template13);
      out.write(_jspx_template14);
      out.write(_jspx_template15);
      // jsp code [from=(391,104);to=(391,119)]
      out.print(PURPOSE_CD_TEXT);

      out.write(_jspx_template16);

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
  private final static String _jspx_template7 = " \r\n\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n  \r\n<!-- \r\n    \t점용목적 코드\r\n-->\r\n\r\n";
  private final static String _jspx_template8 = "\r\n\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n<script language='JavaScript' src='/js/Check_inputbox.js'></script>\r\n\r\n<script type=\"text/javascript\">\r\n<!--\r\n//<![CDATA[\r\n\tvar SectionCode=\"";
  private final static String _jspx_template9 = "\";\r\n\tvar PURPOSE_CD_TEXT=\"";
  private final static String _jspx_template10 = "\";\r\n\tvar essential=\"";
  private final static String _jspx_template11 = "\";\r\n\tvar modify_flag=\"";
  private final static String _jspx_template12 = "\";\r\n\tvar search_flag=\"";
  private final static String _jspx_template13 = "\";\r\n\t\r\n\tfunction Init_PurposeCode()\r\n\t{\r\n\t\tSelected_Class();\r\n\t}\r\n\r\n\tfunction getXMLHTTPRequest()\r\n\t{\r\n\t\tvar xRequest = null;\r\n\t\txRequest = new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n\r\n\t\treturn xRequest;\r\n\t}\r\n\r\n\tvar req;\r\n\tvar\tcall;\r\n\t\r\n\tfunction sendRequest(url, params, HttpMethod, callback)\r\n\t{\r\n\t\treq = getXMLHTTPRequest();\r\n\r\n\t\tcall\t= callback;\r\n\t\tif(req){\r\n\t\t\treq.onreadystatechange = onReadyStateChange;\r\n\t\t\treq.open(HttpMethod, url, true);\r\n\t\t\treq.setRequestHeader(\"Content-Type\",\"application/x-www-form-urlencoded;charset=UTF-8\");\r\n\t\t\treq.send(params);\r\n\t\t}\r\n\t}\r\n\r\n\tfunction onReadyStateChange()\r\n\t{\r\n\t\tvar ready = req.readyState;\r\n\t\tvar data = null;\r\n\t\tif(ready == 4){\r\n\t\t\tif(this.call\t!= null)\r\n\t\t\t{\r\n\t\t\t\tthis.call(req.responseText);\r\n\t\t\t}\r\n\t\t}\r\n\t}\r\n\r\n\t\r\n\tfunction fncSelectBoxSetting(strParam, selectBoxId, defaultSel, topLabel)\r\n\t{\r\n        var xmldoc = new ActiveXObject(\"Microsoft.XMLDOM\");\r\n        var root;\r\n        var selectBoxLabel;\r\n        var selectBoxValue;\r\n        var opt \t= document.getElementById(selectBoxId);\r\n        var tags\t= \"\";\r\n        var\ttext\t= \"\";\r\n\r\n        for(var i = opt.options.length - 1 ; i > -1 ; i--)\r\n        {\r\n        \topt.options[i]\t= null;\r\n        }\r\n\r\n        xmldoc.async\t= false;\r\n\t\txmldoc.loadXML(strParam);\r\n\t\t\r\n\t\t//alert(strParam);\r\n\t\t\r\n        root = xmldoc.getElementsByTagName(\"option\").length;\r\n\r\n        if(root <= 0)\r\n        {\r\n            tags \t= document.createElement(\"option\");\r\n            text\t= document.createTextNode(\"\");\r\n            tags.setAttribute(\"label\", \"\");\r\n            tags.appendChild(text);\r\n            tags.value = 0;\r\n            opt.appendChild(tags);\r\n            return;\r\n        }\r\n\r\n        if(topLabel != null && topLabel != \"\")\r\n\t\t{\r\n            tags \t= document.createElement(\"option\");\r\n            text\t= document.createTextNode(topLabel);\r\n            tags.setAttribute(\"label\", topLabel);\r\n            tags.appendChild(text);\r\n            tags.value = 0;\r\n            opt.appendChild(tags);\r\n        }\r\n    \t\r\n        for(var i = 0; i < root; i++)\r\n        {\r\n        \t\r\n        \tselectBoxValue = xmldoc.getElementsByTagName(\"option/@value\").item(i).text;\r\n        \tselectBoxLabel = xmldoc.getElementsByTagName(\"option/@label\").item(i).text;\r\n\r\n            tags \t= document.createElement(\"option\");\r\n       \t\ttext\t= document.createTextNode(selectBoxLabel);\r\n\r\n            tags.setAttribute(\"label\", selectBoxLabel);\r\n            if(search_flag != '1'){\r\n            \tif(selectBoxValue == defaultSel) tags.setAttribute(\"selected\", \"true\"); // 코드에 이빨이 빠진경우 처리\r\n            }\r\n\r\n            tags.value = selectBoxValue;\r\n            tags.appendChild(text);\r\n            opt.appendChild(tags);\r\n        }\r\n    }\r\n\r\n\tfunction\tSelected_Class()\r\n\t{\r\n\t\tvar\tPurposeCode\t= document.getElementById(\"PURPOSE_CD\");\r\n\t\tvar\tparam\t= \"SectionCode=\"+SectionCode+\"&code=\"+PurposeCode.value;\r\n\t\t\r\n\t\tif(PurposeCode\t==\tnull\t||\tPurposeCode.value\t==\t\"\")\tPurposeCode.value\t= \"000\";\r\n\t\tif(SectionCode\t== \"%\")\treturn;\r\n\t\t\r\n\t\tif(modify_flag == '1')\t//수정인 경우에만 Search_Result_Class_input메소드로 이동 하도록 한다.\r\n\t\t{\r\n\t\t\tsendRequest(\"/purposeclasscode.do\", param, \"GET\", Search_Result_Class_input);\r\n\t\t}\r\n\t\telse\r\n\t\t{\r\n\t\t\tsendRequest(\"/purposeclasscode.do\", param, \"GET\", Search_Result_Class);\r\n\t\t}\r\n\t}\r\n\r\n\tfunction\tResult_Class(obj)\r\n\t{\r\n\t\tfncSelectBoxSetting(obj, \"PURPOSE1\", 0, \"::선택::\");\r\n\r\n\t//\tSelected();\r\n\t}\r\n\r\n\tfunction\tSelected_Sort()\r\n\t{\r\n\t\tvar\tClassCode\t= document.getElementById(\"PURPOSE1\");\r\n\t\t\r\n\t\tvar\tparam\t= \"ClassCode=\" + ClassCode.value+\"&SectionCode=\"+SectionCode;\r\n\t\t\r\n\t\tsendRequest(\"/purposesortcode.do\", param, \"GET\", Result_Sort);\r\n\t}\r\n\r\n\tfunction\tResult_Sort(obj)\r\n\t{\t\r\n\t\tfncSelectBoxSetting(obj, \"PURPOSE2\", 0, \"::선택::\");\r\n\t\tSelected_Kind();\r\n\t\tSelected();\r\n\t}\r\n\r\n\tfunction\tSelected_Kind()\r\n\t{\r\n\t\tvar\tClassCode\t= document.getElementById(\"PURPOSE1\");\r\n\t\tvar\tSortCode\t= document.getElementById(\"PURPOSE2\");\r\n\t\tvar\tparam\t= \"ClassCode=\" + ClassCode.value + \"&SortCode=\" + SortCode.value+\"&SectionCode=\"+SectionCode;\r\n\r\n\t\tsendRequest(\"/purposekindcode.do\", param, \"GET\", Result_Kind);\r\n\t}\r\n\r\n\tfunction\tResult_Kind";
  private final static String _jspx_template14 = "(obj)\r\n\t{\r\n\t\tfncSelectBoxSetting(obj, \"PURPOSE3\", 0, \"::선택::\");\r\n\r\n\t\tSelected();\r\n\t}\r\n\t\r\n\tfunction\tPurposeCode_Search()\r\n\t{\r\n\t\tvar\tPurposeCode\t= document.getElementById(\"PURPOSE_CD\").value;\r\n\t\tvar param = \"SectionCode=\"+SectionCode;\r\n\r\n\t\tif(PurposeCode.length >= 3)\r\n\t\t\tsendRequest(\"/purposeclasscode.do\", param, \"GET\", Search_Result_Class);\r\n\t}\r\n\t\r\n\tfunction\tPurposeCode_Search_input()\r\n\t{\r\n\t\tvar\tPurposeCode\t= document.getElementById(\"PURPOSE_CD\").value;\r\n\t\tvar\tparam\t= \"SectionCode=\"+SectionCode+\"&code=\"+PurposeCode;\r\n\t\t\r\n\t\tif(PurposeCode.length >= 3)\r\n\t\t{\r\n\t\t\tsendRequest(\"/purposeclasscode.do\", param, \"GET\", Search_Result_Class_input);\r\n\t\t}\r\n\t}\r\n\r\n\tfunction\tSearch_Result_Class(obj)\r\n\t{\r\n\t\tvar\tPurposeCode\t= document.getElementById(\"PURPOSE_CD\").value;\r\n\t\tvar\tClassCode\t= PurposeCode.substring(0, 1);\r\n\r\n\t\tfncSelectBoxSetting(obj, \"PURPOSE1\", ClassCode, \"::선택::\");\r\n\r\n\t\tparam\t= \"ClassCode=\" + ClassCode+\"&SectionCode=\"+SectionCode;\r\n\r\n\t\tsendRequest(\"/purposesortcode.do\", param, \"GET\", Search_Result_Sort);\t\r\n\t}\r\n\t\r\n\tfunction\tSearch_Result_Class_input(obj)\r\n\t{\r\n\t\tvar\tPurposeCode\t= document.getElementById(\"PURPOSE_CD\").value;\r\n\t\tvar\tClassCode\t= PurposeCode.substring(0, 1);\r\n\t\t\r\n\t\tfncSelectBoxSetting(obj, \"PURPOSE1\", ClassCode, \"::선택::\");\r\n\r\n\t\tparam\t= \"ClassCode=\" + ClassCode+\"&SectionCode=\"+SectionCode;\r\n\r\n\t\tsendRequest(\"/purposesortcode.do\", param, \"GET\", Search_Result_Sort_input);\t\r\n\t}\r\n\t\r\n\tfunction\tSearch_Result_Sort(obj)\r\n\t{\r\n\t\tvar\tPurposeCode\t= document.getElementById(\"PURPOSE_CD\").value;\r\n\t\tvar\tClassCode\t= PurposeCode.substring(0, 1);\r\n\t\tvar\tSortCode\t= PurposeCode.substring(1, 2);\r\n\t\tfncSelectBoxSetting(obj, \"PURPOSE2\", SortCode, \"::선택::\");\r\n\t\tparam\t= \"ClassCode=\" + ClassCode + \"&SortCode=\" + SortCode+\"&SectionCode=\"+SectionCode;\r\n\t\tsendRequest(\"/purposekindcode.do\", param, \"GET\", Search_Result_Kind);\r\n\t}\r\n\t\r\n\tfunction\tSearch_Result_Sort_input(obj)\r\n\t{\r\n\t\tvar\tPurposeCode\t= document.getElementById(\"PURPOSE_CD\").value;\r\n\t\tvar\tClassCode\t= PurposeCode.substring(0, 1);\r\n\t\tvar\tSortCode\t= PurposeCode.substring(1, 2);\r\n\t\tfncSelectBoxSetting(obj, \"PURPOSE2\", SortCode, \"::선택::\");\r\n\t\tparam\t= \"ClassCode=\" + ClassCode + \"&SortCode=\" + SortCode+\"&SectionCode=\"+SectionCode;\r\n\t\tsendRequest(\"/purposekindcode.do\", param, \"GET\", Search_Result_Kind_input);\r\n\t}\r\n\t\r\n\tfunction\tSearch_Result_Kind(obj)\r\n\t{\r\n\t\tvar\tPurposeCode\t= document.getElementById(\"PURPOSE_CD\").value;\r\n\t\tvar\tKindCode\t= PurposeCode.substring(2, 3);\r\n\t\t\r\n\t\tfncSelectBoxSetting(obj, \"PURPOSE3\", KindCode, \"::선택::\");\r\n\t\tvar\tPurposeCodeBefore\t= document.getElementById(\"PURPOSE_CD\").value;\r\n\t\tSelected();\r\n\t\tvar\tPurposeCodeAfter\t= document.getElementById(\"PURPOSE_CD\").value;\r\n\t\tvar\tClassCode\t= document.getElementById(\"PURPOSE1\").value;\r\n\t\tvar\tSortCode\t= document.getElementById(\"PURPOSE2\").value;\r\n\t\tvar\tKindCode\t= document.getElementById(\"PURPOSE3\").value;\r\n\t\t\r\n\t\tif(PurposeCodeBefore != PurposeCodeAfter)\r\n\t\t\talert(PurposeCodeBefore + \"과(와) 일치하는 데이터는 없습니다\");\r\n\t\telse\r\n\t\t\tsendRequest(\"/purposecode.do\", \"code=\" + PurposeCodeBefore+\"&SectionCode=\"+SectionCode, \"GET\", null);\r\n\r\n\t\tdocument.getElementById(\"PURPOSE1\").selectedIndex = 0;\r\n\t\tdocument.getElementById(\"PURPOSE2\").selectedIndex = 0;\r\n\t\tdocument.getElementById(\"PURPOSE3\").selectedIndex = 0;\r\n\r\n\r\n\t}\r\n\t\r\n\tfunction\tSearch_Result_Kind_input(obj)\r\n\t{\r\n\t\tvar\tPurposeCode\t= document.getElementById(\"PURPOSE_CD\").value;\r\n\t\tvar\tKindCode\t= PurposeCode.substring(2, 3);\r\n\t\t\r\n\t\tfncSelectBoxSetting(obj, \"PURPOSE3\", KindCode, \"::선택::\");\r\n\t\t\r\n\t\tvar\tPurposeCodeBefore\t= document.getElementById(\"PURPOSE_CD\").value;\r\n\t\tSelected();\r\n\r\n\t\tvar\tClassCode\t= PurposeCodeBefore.substring(0, 1);\r\n\t\tvar\tSortCode\t= PurposeCodeBefore.substring(1, 2);\r\n\t\tvar\tKindCode\t= PurposeCodeBefore.substring(2, 3);\r\n\t\t\r\n\t\t//alert(ClassCode + '||'+ SortCode + '||'+ KindCode + '||'+ ClassCode2 + '||'+ SortCode2 + '||'+ KindCode2);\r\n\t\t//전승원 로직 수정 입력된 첫번째 코드값이 0인경우  1번째로 강제로 바꾼다.\r\n\t\tif(document.getElementById(\"PURPOSE1\").selectedIndex == 0)\r\n\t\t{\r\n\t\t\tdocument.getElementById(\"PURPOSE1\").selectedIndex = 1;\r\n\t\t}\r\n\t\telse\r\n\t\t{\r\n\t\t\tif(ClassCode == 0)\r\n\t\t\t{\r\n\t\t\t\tdocument.getElementById(\"PURPOSE1\")";
  private final static String _jspx_template15 = ".options[document.getElementById(\"PURPOSE1\").selectedIndex].label==\"공유재산물품관리법\"\r\n\t\t\t}\r\n\t\t\telse\r\n\t\t\t{\r\n\t\t\t\tdocument.getElementById(\"PURPOSE1\").value = ClassCode;\r\n\t\t\t}\r\n\t\t}\r\n\t\tdocument.getElementById(\"PURPOSE2\").value = SortCode;\r\n\t\tdocument.getElementById(\"PURPOSE3\").value = KindCode;\r\n\t\t\r\n\t\tvar\tClassCode2\t= document.getElementById(\"PURPOSE1\").value;\r\n\t\tvar\tSortCode2\t\t= document.getElementById(\"PURPOSE2\").value;\r\n\t\tvar\tKindCode2\t\t= document.getElementById(\"PURPOSE3\").value;\r\n\t\tvar\tPurposeCodeAfter\t= ClassCode2+SortCode2+KindCode2;\r\n\t\t\r\n\t\tif(PurposeCodeBefore != PurposeCodeAfter){\r\n\t\t\talert(PurposeCodeBefore + \"과(와) 일치하는 데이터는 없습니다\");\r\n\t\t\tdocument.getElementById(\"PURPOSE_CD\").value = \"000\";\r\n\t\t\tdocument.getElementById(\"PURPOSE1\").value = \"0\";\r\n\t\t\tdocument.getElementById(\"PURPOSE2\").value = \"0\";\r\n\t\t\tdocument.getElementById(\"PURPOSE3\").value = \"0\";\r\n\t\t}\r\n\t\telse{\r\n\t\t\tsendRequest(\"/purposecode.do\", \"code=\" + PurposeCodeBefore+\"&SectionCode=\"+SectionCode, \"GET\", null);\r\n\t\t}\r\n\t}\r\n\t\r\n\tfunction\tSelected()\r\n\t{\r\n\t\tvar form = document.form;\r\n\t\t\r\n\t\tvar\tPurposeCode\t= document.getElementById(\"PURPOSE_CD\");\r\n\t\tvar\tClassCode\t= document.getElementById(\"PURPOSE1\");\r\n\t\tvar\tSortCode\t= document.getElementById(\"PURPOSE2\");\r\n\t\tvar\tKindCode\t= document.getElementById(\"PURPOSE3\");\r\n\r\n\t\tif(essential==\"1\")\r\n\t\t\tPurposeCode.className=\"essential\";\r\n\t\t\r\n\t\tif(ClassCode.value == null)\tClassCode.value\t= 0;\r\n\t\tif(SortCode.value == null)\tSortCode.value\t= 0;\r\n\t\tif(KindCode.value == null)\tKindCode.value\t= 0;\r\n\t\t\r\n\t\tvar\tresult\t= ClassCode.value + SortCode.value + KindCode.value;\r\n\t\t//alert(result);\r\n\t\t\r\n\t\tPurposeCode.value\t= result;\r\n\t\r\n\t\t//if(PurposeCode.Selected_Sebu)\r\n\t\tif(parent.Selected_Sebu)\r\n\t\t{\r\n\t\t\tif(parent.Selected_Sebu(PurposeCode.value))\r\n\t\t\t{\r\n\t\t\t\tparent.Selected_Sebu(PurposeCode.value);\r\n\t\t\t}\r\n\t\t}\r\n\t}\r\n\t\r\n\tfunction isSelectOK()\r\n\t{\r\n\t    if(document.getElementById(\"PURPOSE1\").options[document.getElementById(\"PURPOSE1\").selectedIndex].label==\"::선택::\") \r\n\t    {\r\n\t        return false;\r\n\t    }\r\n\t    if(document.getElementById(\"PURPOSE2\").options[document.getElementById(\"PURPOSE2\").selectedIndex].label==\"::선택::\") \r\n\t    {\r\n\t        return false;\r\n\t    }\r\n\t    if(document.getElementById(\"PURPOSE3\").options[document.getElementById(\"PURPOSE3\").selectedIndex].label==\"::선택::\") \r\n\t    {\r\n\t        return false;\r\n\t    }\r\n\t    \r\n\t    return true;\r\n\t}\r\n\t\r\n\r\n//]]>\r\n-->\r\n</script>\r\n<html>\r\n<body class=\"view\" leftmargin=0 topmargin=0 style=\"border:0\" onload=\"Selected_Class();\">\r\n<table>\r\n<tr>\r\n<td>\r\n\t<input name=\"PURPOSE_CD\" id=\"PURPOSE_CD\" type=\"text\" class=\"input_form1\" style=\"width:20px\" value=\"";
  private final static String _jspx_template16 = "\" maxlength=\"3\" style=\"ime-mode:disabled\" onKeyDown=\"nr_num_int(this);\" onKeyUp=\"javascript:PurposeCode_Search_input();\" onKeyPress=\"nr_num_int(this);\">\r\n</td>\r\n\r\n<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t<select name=\"PURPOSE1\" id=\"PURPOSE1\" class=\"input_form1\" style=\"width:160px\" OnChange=\"Selected_Sort()\" onkeyup=\"javascript:PurposeCode_Search();\">\r\n\t</select>\r\n</td>\r\n\r\n<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t<select name=\"PURPOSE2\" id=\"PURPOSE2\" class=\"input_form1\" style=\"width:230px\" OnChange=\"Selected_Kind()\">\r\n\t</select>\r\n</td>\r\n\r\n<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t<select name=\"PURPOSE3\" id=\"PURPOSE3\" class=\"input_form1\" style=\"width:190px\" OnChange=\"Selected();\">\r\n\t</select>\r\n</td>\r\n</tr>\r\n</table>\r\n</body>\r\n</html>\r\n<!--\r\n<td class=\"table_bl_left\"><a href=\"javascript:Selected();\"><img src=\"/img/search_icon.gif\" alt=\"검색\" width=\"56\" height=\"18\" border=\"0\"></a></td>\r\n-->\r\n";
}
