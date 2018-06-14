package jeus_jspwork._jsp._jumyong._saewe._tab;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_bugwa_5fregister_5fjsp extends jeus.servlet.jsp.HttpJspBase {

  public final String[] __jeusGetIncludedJspFiles() {
    return new String[] {
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
      pageContext = _jspxFactory.getPageContext(this, request, response, "", true, 8192, true);
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
      // jsp code [from=(434,24);to=(434,27)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${VAT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template7);
      // jsp code [from=(435,30);to=(435,33)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${VAT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template8);
      // jsp code [from=(473,61);to=(473,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template9);
      // jsp code [from=(474,51);to=(474,54)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(480,53);to=(480,57)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(481,59);to=(481,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TAX_SET}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(482,75);to=(482,80)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${BONSE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(483,59);to=(483,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(495,153);to=(495,165)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TAX_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(499,10);to=(499,23)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${taxation_part}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(523,10);to=(523,17)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${taxcode}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(532,103);to=(532,109)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ORG_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(533,93);to=(533,98)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GU_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(539,103);to=(539,110)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${DEPT_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(543,11);to=(543,20)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${DEPT_LIST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      // jsp code [from=(546,11);to=(548,9)]
      out.write(_jspx_template21);
      out.write(_jspx_template22);
      // jsp code [from=(557,111);to=(557,122)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${OCR_SIGU_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(563,113);to=(563,125)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${OCR_BUSEO_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // jsp code [from=(572,10);to=(572,24)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${taxpayer_group}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);
      // jsp code [from=(581,10);to=(581,28)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${taxpayer_residence}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template26);
      // jsp code [from=(587,10);to=(587,21)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${object_type}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // jsp code [from=(594,151);to=(594,161)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SUM_ADJUST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template28);
      // jsp code [from=(601,147);to=(601,150)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${VAT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template29);
      // jsp code [from=(605,106);to=(605,114)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TAX_DATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template30);
      // jsp code [from=(613,151);to=(613,161)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SUM_ADJUST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template31);
      // jsp code [from=(625,156);to=(625,169)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OVERTAX}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template32);
      // jsp code [from=(638,66);to=(638,79)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADD_SET}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template33);
      // jsp code [from=(639,107);to=(639,123)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADD_SET_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template34);
      // jsp code [from=(649,152);to=(649,163)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.NOTES}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template35);
      // jsp code [from=(654,162);to=(654,177)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.LIMIT_SUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template36);
      // jsp code [from=(656,150);to=(656,165)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.LIMIT_CNT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template37);
      // jsp code [from=(661,152);to=(661,162)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template38);
      // jsp code [from=(663,152);to=(663,168)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.RATE_CAUSE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template39);
      // jsp code [from=(691,101);to=(691,111)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SUM_ADJUST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template40);
      // jsp code [from=(694,84);to=(694,87)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${VAT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template41);
      // jsp code [from=(695,88);to=(695,98)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SUM_ADJUST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template42);

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
  private final static String _jspx_template1 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('사용자의 사용시간이 종료되었습니다. 다시 접속 해주시기 바랍니다.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template2 = "\r\n<script language=\"javascript\" src=\"/js/privateFunction.js\"></script>";
  private final static String _jspx_template3 = "    \r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n}\r\n-->\r\n\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script> \r\n<script language='JavaScript' src='/js/Check_inputbox.js'></script>\r\n<script language=\"javascript\" src=\"/js/Ajax_request.js\"></script>\r\n\r\n<script type=\"text/javascript\">\r\n//<![CDATA[\r\n\r\n\tfunction\tRegister()\r\n\t{\r\n\t\tvar\tresult\t= DataCheck();\r\n\t\tif(result\t==\tfalse)\treturn;\r\n\t\tif(!TaxDateCheck()) return;\r\n\t\t\r\n\t\tvar form  = document.form;\r\n\t\tvar intax = removeComma(form.INTAX.value);\r\n\t\tvar sise  = removeComma(form.SISE.value);\r\n\t\tvar guse  = removeComma(form.GUSE.value);\r\n\t\t\r\n\t\tif(\tintax != sise + guse)\r\n\t\t{\r\n\t\t\talert(\"시세+구세 합계가 총부과금액과 일치하지 않습니다.\");\r\n\t\t\treturn;\r\n\t\t}\t\r\n\t\t\r\n\t\tvar\tobj\t= document.getElementById(\"ADD_YN\");\r\n\t\t\r\n\t\tif(obj.checked\t== true)\r\n\t\t\tdocument.getElementById(\"ADD_YN\").value='1';\r\n\t\telse\r\n\t\t\tdocument.getElementById(\"ADD_YN\").value='0';\r\n\r\n\t\tform.action = \"/jumyong/saewe/bugwa_register_prc.do\";\r\n\t\tform.submit();\r\n\t}\r\n\r\n\tfunction removeComma(numValue)\r\n\t{\r\n\t\treturn Number(numValue.split(',').join(\"\"));\r\n\t}\r\n\t\r\n\tfunction\tTax_Year()\r\n\t{\r\n\t\tvar now\t\t= new Date();\r\n\t\t//var nowyear\t= now.getYear();\t// 2016.03 kny getYear()더이상지원안함\r\n\t\tvar nowyear\t= now.getFullYear();\r\n\t\tvar year\t= nowyear - 2;\r\n\t\t\r\n\t\tvar opt = document.getElementById('tax_year');\r\n        var root;\r\n        var selectBoxLabel;\r\n        var selectBoxValue;\r\n        var tags\t= \"\";\r\n        var\ttext\t= \"\";\r\n        \r\n        for(var i = 0; i < 5; i++)\r\n        {\r\n        \tselectBoxValue = year + i;\r\n        \tselectBoxLabel = year + i;\r\n\r\n            tags \t= document.createElement(\"option\");\r\n       \t\ttext\t= document.createTextNode(selectBoxLabel);\r\n            tags.setAttribute(\"label\", selectBoxLabel);\r\n            if(selectBoxValue == nowyear) tags.setAttribute(\"selected\", \"true\");\r\n\r\n            tags.value = selectBoxValue;\r\n            tags.appendChild(text);\r\n            opt.appendChild(tags);\r\n        }\r\n\t}\r\n\r\n\tfunction\tTax_Month()\r\n\t{\r\n\t\tvar now\t\t= new Date();\r\n\t\tvar month\t= now.getMonth() + 1;\r\n\t\t\r\n\t\tvar opt = document.getElementById('tax_month');\r\n        var root;\r\n        var selectBoxLabel;\r\n        var selectBoxValue;\r\n        var tags\t= \"\";\r\n        var\ttext\t= \"\";\r\n        \r\n        for(var i = 1; i <= 12; i++)\r\n        {\r\n        \tselectBoxValue = i;\r\n        \tselectBoxLabel = i;\r\n\r\n            tags \t= document.createElement(\"option\");\r\n       \t\ttext\t= document.createTextNode(selectBoxLabel);\r\n            tags.setAttribute(\"label\", selectBoxLabel);\r\n            if(i == month) tags.setAttribute(\"selected\", \"true\");\r\n\r\n            tags.value = selectBoxValue;\r\n            tags.appendChild(text);\r\n            opt.appendChild(tags);\r\n        }\r\n\t}\r\n\t\r\n\tfunction\tMultiData_Check()\r\n\t{\r\n\t\tvar form = document.form;\r\n\r\n\t\tform.bugwa_bonse.value\t\t= form.BONSE.value;\r\n\t\tform.bugwa_vat.value\t\t= form.VAT.value;\r\n\t\tform.bugwa_intax.value\t\t= form.INTAX.value;\r\n\t\tform.bugwa_overtax.value\t= form.OVERTAX.value;\r\n\t}\r\n\r\n\tfunction\tDataCheck()\r\n\t{\r\n\t\tvar form \t= document.form;\r\n\t\tvar\tstr\t\t= \"\";\r\n\t\t\r\n\t\tif(form.TAX_GUBUN.value.length\t< 1)\r\n\t\t\tstr\t+= \"과세구분을 입력하세요\\n\";\r\n\t\telse if(form.TAX_CD.value.length\t< 1)\r\n\t\t\tstr\t+= \"세목코드를 입력하세요\\n\";\r\n\t\telse if(form.TAXPAYER_SET.value.length\t< 1)\r\n\t\t\tstr\t+= \"납세자 구분을 입력하세요\\n\";\r\n\t\telse if(form.LIVE.value.length\t< 1)\r\n\t\t\tstr\t+= \"거주상태를 입력하세요\\n\";\r\n\t\telse if(form.OBJ_SET.value.length\t< 1)\r\n\t\t\tstr\t+= \"물건구분을 입력하세요.\\n\";\r\n\t\telse if(form.TAX_DATE.value.length\t< 1)\r\n\t\t\tstr\t+= \"과세일자를 입력하세요\\n\";\r\n\t\telse if(form.INDATE.value.length\t< 1)\r\n\t\t\tstr\t+= \"납기내일자를 입력하세요\\n\";\r\n\t\telse if(form.OVERTAX.value.length\t< 1)\r\n\t\t\tstr\t+= \"납기후금액을 입력하세요\\n\";\r\n\t\telse if(form.OVERDATE.value < 110)\r\n\t\t\tstr\t+= \"납기후일자를 입력하세요\\n\";\r\n\t\telse if(form.SECTION.value == '3' && form.TAX_CD.value.substr(2,4) != '2282')\r\n\t\t\tstr +=";
  private final static String _jspx_template4 = " \"무단일때 세목코드가 변상금이어야 합니다. 세목코드를 확인하세요.\";\r\n\t\telse if(form.SECTION.value == '1' && form.TAX_CD.value.substr(2,4) == '2282')\r\n\t\t\tstr += \"계속일때 세목코드가 변상금이면 안됩니다. 세목코드를 확인하세요.\";\r\n\t\t\t\r\n\r\n\t\tif(str\t== \"\")\r\n\t\t{\r\n\t\t\treturn\ttrue;\r\n\t\t}\r\n\t\t\r\n\t\talert(str);\r\n\r\n\t\treturn\tfalse;\r\n\t}\r\n\r\n\tfunction\tTaxDateCheck()\r\n\t{\r\n\t\tvar form \t= document.form;\r\n\r\n\t\tif(form.TAX_DATE.value.length\t< 1)\r\n\t\t\treturn;\r\n\r\n\t\tvar\ttax_year\t= new Number(form.tax_year.value);\r\n\t\tvar\ttax_month\t= new Number(form.tax_month.value);\r\n\r\n\t\tvar\ttax\t\t= form.TAX_DATE.value;\r\n\t\tvar\tyear\t= new Number(tax.substr(0, 4));\r\n\t\tvar\tmonth\t= new Number(tax.substr(5, 2));\r\n\r\n\t//\talert(tax_year.valueOf() + \", \" + tax_month.valueOf() + \", \" + year.valueOf() + \", \" + month.valueOf());\r\n\r\n\t\tif(tax_year.valueOf() != year.valueOf())\r\n\t\t{\r\n\t\t\talert(\"과세년월과 과세일자의 년월이 다르게 부과할수 없습니다.\");\r\n\t\t\treturn false;\r\n\t\t}\r\n\t\telse if(tax_month.valueOf() != month.valueOf())\r\n\t\t{\r\n\t\t\talert(\"과세년월과 과세일자의 년월이 다르게 부과할수 없습니다.\");\r\n\t\t\treturn false;\r\n\t\t}\r\n\t\tif(document.getElementById(\"TAX_DATE\").value>document.getElementById(\"INDATE\").value){\r\n\t\t\talert(\"납기내일자는 과세일자보다 늦게 설정 할 수없습니다.\");\r\n\t\t\treturn ;\r\n\t\t}\r\n\t\t\r\n\t\tif(document.getElementById(\"INDATE\").value>document.getElementById(\"OVERDATE\").value){\r\n\t\t\talert(\"납기후일자는 납기내일자보다 늦게 설정 할 수 없습니다.\");\r\n\t\t\treturn;\r\n\t\t}\r\n\t\treturn true;\t\r\n\t}\r\n\r\n\tfunction\tAfterDate(obj)\r\n\t{\r\n\t\tvar\tdate\t= obj.value;\r\n\r\n\t\tvar\tthisMon\t= new Date(date.substr(0, 4), date.substr(5, 2), date.substr(8, 2), \"\", \"\", \"\");\r\n\r\n\t\tthisMon.setMonth(thisMon.getMonth() + 1);\r\n\t\tthisMon.setDate(thisMon.getDate() - 1);\r\n\t\t\r\n\t\tvar\tyear\t= \"\" + thisMon.getFullYear();\r\n\t\tvar\tmonth\t= \"\" + thisMon.getMonth();\r\n\t\tvar\tdate\t= \"\" + thisMon.getDate();\r\n\t\t\r\n\t\tif(month.length == 1)\tmonth \t= \"0\" + month;\r\n\t\tif(date.length == 1)\tdate\t= \"0\" + date;\r\n\r\n\t\tdocument.getElementById(\"OVERDATE\").value\t= year + \"-\"+ month +\"-\"+ date;\r\n\t}\r\n///////////////////////////////////////////////////////////////////\r\nvar dateUtil = function() {\r\n    this.startObject = null;\r\n    this.endObject = null;\r\n    this.args = null;\r\n}\r\n\r\ndateUtil.prototype.formatLen = function(str) {\r\n    return str = (\"\"+str).length<2 ? \"0\"+str : str;\r\n}\r\n\r\ndateUtil.prototype.formatDate = function(dateObject, delimiter) {\r\n    delimiter = delimiter || \"-\";\r\n    return dateObject.getFullYear() + delimiter + this.formatLen(dateObject.getMonth() + 1) + delimiter + this.formatLen(dateObject.getDate());\r\n}\r\n\r\ndateUtil.prototype.toDay = function(delimiter) {\r\n    return this.formatDate(new Date(), \"-\");\r\n}\r\n\r\ndateUtil.prototype.calDate = function() {\r\n    var year = this.args.year == null ? 0 : Number(this.args.year);\r\n    var month = this.args.month == null ? 0 : Number(this.args.month);\r\n    var day = this.args.day == null ? 0 : Number(this.args.day);\r\n    var result = new Date();\r\n\r\n    result.setYear(result.getFullYear() + year);\r\n    result.setMonth(result.getMonth() + month);\r\n    result.setDate(result.getDate() + day-1);\r\n    return this.formatDate(result, \"-\");\r\n}\r\n\r\ndateUtil.prototype.setDate = function(startObject, endObject, args) {\r\n    this.startObject = startObject;\r\n    this.endObject = endObject;\r\n    this.args = args;\r\n\r\n    document.getElementById(this.startObject).value = this.calDate();\r\n    document.getElementById(this.endObject).value = this.toDay();\r\n}\r\n\r\n\r\nvar dateUtilObj = new dateUtil();\r\n///////////////////////////////////////////////////////////////////\t\t2009.09.03  과세일자와 납기내 일자 구하기 위해 쓴 함수 \r\n//////////////////////////////////////////////////////////////////\t\t하지만 안쓴다고 하기에 내버려두지만 언제 또 변덕을 부릴지 몰라 그냥 둡니다.\r\n/////////////////////////////////////////////////////////////////\t\t(*과세일자 :현재일자   *납기내일자:과세일자로부터 한달      *납기후일자:납기내일자로부터 담달 말일)\r\n\r\n\tfunction onHandleChangeEvent(e) {\r\n\t\te = e || window.event;\r\n\t\tvar target = e.target || e.srcElement;\r\n\t\t\r\n\t\tswitch(target.id) {\r\n\t\tcase 'DEPT_LIST': {\r\n\t\t\tvar option = target.options[target.selectedIndex];\r\n\t\t\tvar deptCd = document.getElementById('DEPT_CD');\r\n\t\t\tdeptCd.value = option.value;\r\n\t\t\tbreak;\r\n\t\t}\r\n\t\tdefault:\r\n\t\t\tbreak;\r\n\t\t}\r\n\t}\r\n\r\n\tfunction \tInit()\r\n\t{\r\n\t\r\n\t\tparent.TabDown_Img(\"bugwa\");\r\n\t\tparent.Bugwa_Off();\r\n\t\t\r\n\t\tvar\tsigu";
  private final static String _jspx_template5 = "_se\t= document.form.sigu_se.value;\r\n\t\tvar bonse = document.form.BONSE.value;\r\n\t\t\r\n\t\tdocument.form.SISE.value = \"0\";\r\n\t\tdocument.form.GUSE.value = \"0\";\r\n\t\t\r\n\t\tif(sigu_se == \"10\")\r\n\t\t\tdocument.form.SISE.value = bonse;\r\n\t\telse if(sigu_se == \"50\")\t\r\n\t\t\tdocument.form.GUSE.value = bonse;\r\n\t\t\t\r\n\t\t//과세날짜, 납기일내일자, 납기후일자 구하기  2009.08.31 pkh\r\n\t\tvar dateUtilObj = new dateUtil();\r\n\t\t//dateUtilObj.setDate('INDATE', 'TAX_DATE', {month: +1});\t\t\t//기준변경으로 주석처리 \r\n\t\t\r\n\t\tvar taxdate = document.getElementById(\"TAX_DATE\").value\r\n\t\tvar taxdate_year = Number(taxdate.substr(0,4));\r\n\t\tvar taxdate_month = Number(taxdate.substr(5,2));\r\n\t\tvar indate_f = new Date(new Date(taxdate_year, taxdate_month, 1)-86400000).getDate();\r\n\t\t\r\n\t\tdocument.getElementById(\"INDATE\").value = taxdate.substr(0,4)+\"-\"+taxdate.substr(5,2)+\"-\"+indate_f;\r\n\t\t\r\n\t\tvar indate = document.getElementById(\"INDATE\").value;\r\n\t\t\r\n\t\tvar indate_year = Number(indate.substr(0,4));\r\n\t\tvar indate_month = Number(indate.substr(5,2));\r\n\t\tif(indate_month==12){\r\n\t\t\tindate_year = indate_year+1;\r\n\t\t\tindate_month = 1;\r\n\t\t}else{\r\n\t\t\tindate_month++;\r\n\t\t}\r\n\t\t\r\n\t\tif(indate_month<10){\r\n\t\t\tindate_month = \"0\"+indate_month;\r\n\t\t}\r\n\t\tvar over_date = new Date(new Date(indate_year, indate_month, 1)-86400000).getDate();\r\n\t\t\r\n\t\tdocument.getElementById(\"OVERDATE\").value = indate_year+\"-\"+indate_month+\"-\"+over_date;\r\n\t\t\r\n\t\t\r\n\t}\r\n\t\r\n\tfunction\tSemokInfo()\r\n\t{\r\n\r\n\t\tvar form \t= document.form;\r\n\r\n\t\tif(form.TAX_CD.value == \"\"){\r\n\t\t\talert(\"세목코드를 선택하세요.\");\r\n\t\t\treturn;\r\n\t\t}\r\n\t\telse if(form.SECTION.value == '3' && form.TAX_CD.value.substr(2,4) != '2282' ){\r\n\t\t\talert(\"무단일때 세목코드가 변상금이어야 합니다. 세목코드를 확인하세요.\");\r\n\t\t\tform.TAX_CD.options[0].selected = true;\r\n\t\t\treturn;\r\n\t\t}\r\n\t\telse if(form.SECTION.value == '2' && form.TAX_CD.value.substr(2,4) == '2282' ){\r\n\t\t\talert(\"일시일때 세목코드가 변상금이면 안됩니다. 세목코드를 확인하세요.\");\r\n\t\t\tform.TAX_CD.options[0].selected = true;\r\n\t\t\treturn;\r\n\t\t}\r\n\t\telse if(form.SECTION.value == '1' && form.TAX_CD.value.substr(2,4) == '2282' ){\r\n\t\t\talert(\"계속일때 세목코드가 변상금이면 안됩니다. 세목코드를 확인하세요.\");\r\n\t\t\tform.TAX_CD.options[0].selected = true;\r\n\t\t\treturn;\r\n\t\t}\r\n\r\n\t\t\r\n\t\tvar\tTAX_CD\t= document.getElementById(\"TAX_CD\").value;\r\n\t\tvar\tSIGU_CD\t= document.getElementById(\"SIGU_CD\").value;\r\n\t\tvar\tDEPT_CD\t= document.getElementById(\"DEPT_CD\").value;\r\n\t\t\r\n\t\tvar\tparams\t= \"TAX_CD=\" + TAX_CD + \"&SIGU_CD=\" + SIGU_CD + \"&DEPT_CD=\" + DEPT_CD;\r\n\t\r\n\t\tsendRequest(\"/jumyong/saewe/semokinfo.do\", params, \"GET\", Result_SemokInfo);\r\n\t}\r\n\t\r\n\tfunction\tResult_SemokInfo(obj)\r\n\t{\r\n\t\tif(obj == \"\")\r\n\t\t{\t\t\r\n\t\t\talert(\"세목코드 실패!!\");\r\n\t\t\tdocument.form.TAX_CD.options[0].selected = true;\r\n\t\t\treturn;\r\n\t\t}\r\n\t\t\r\n        var xmldoc \t= new ActiveXObject(\"Microsoft.XMLDOM\");\r\n        var form \t= document.form;\r\n\r\n        xmldoc.async\t= false;\r\n\t\txmldoc.loadXML(obj);\r\n\r\n\t\tform.ADD_SET.value\t\t= \txmldoc.getElementsByTagName(\"gasanRateGubun\").item(0).text;\r\n\t\tform.ADD_SET_NM.value\t= \txmldoc.getElementsByTagName(\"gasanRateGubunNm\").item(0).text;\r\n\t\t//form.ADD_YN.value\t\t=\txmldoc.getElementsByTagName(\"vatYn\").item(0).text;\r\n\t\tform.SUBUSEO_CD.value\t=\txmldoc.getElementsByTagName(\"suBuseoCd\").item(0).text;\r\n\t\tform.gasanRate.value\t=\txmldoc.getElementsByTagName(\"gasanRate\").item(0).text;\r\n\t\tform.OCR_BUSEO_CD.value\t=\txmldoc.getElementsByTagName(\"ocrBuseoCd\").item(0).text;\r\n\t\tform.OCR_SIGU_CD.value\t=\txmldoc.getElementsByTagName(\"ocrSiguCd\").item(0).text;\r\n\t\t\r\n\t\tif(form.ADD_SET.value == '7'){\r\n    \t\tform.ADD_YN.value = 1;\r\n    \t\tform.ADD_YN.checked = true;\r\n\t\t}else{\r\n\t\t\tform.ADD_YN.value = 0;\r\n\t\t\tform.ADD_YN.checked = false;\r\n\t\t}\r\n\t\t\r\n\t\t//납기후금액(10원단위절삭) = 본세 * 가산율 + 본세\r\n\t\tvar overtax = String((parseInt(form.BONSE_COMMA_CUT.value)/100) * parseInt(form.gasanRate.value) + parseInt(form.BONSE_COMMA_CUT.value));\r\n\r\n\t\t//소수점 제거\r\n\t\tovertax = parseInt(overtax).toFixed(0);\r\n\t\t\r\n\t\tvar overtax_value = 0;\r\n\r\n\t\tif(overtax != '0'){\r\n\t\t\tovertax_value = parseInt(overtax.substr(0, overtax.length - 1)) * 10;\r\n\t\t}\r\n\t\t\r\n\t\tform.OVERTAX.value = overtax_value;\r\n\t\tform.bugwa_overtax.value = overtax_value;\r\n\t\t\t\r\n\t\tcomma_paste(form.OVERTAX);\r\n\t\tcomma_paste(form.bugwa_overtax);\r\n\t\t\r\n\t\t\r\n\t\tvar\tTAX_CD\t= document.getElementById(\"TAX";
  private final static String _jspx_template6 = "_CD\").value;\r\n\t\tvar\tSECTION\t= document.getElementById(\"SECTION\").value;\r\n\t\t/*\r\n\t\t//변상금이면 부가 가치세는 0원... 무단일경우도 부가가치세 0원\r\n\t\tif(TAX_CD == '50228210' || TAX_CD == '10228202' || TAX_CD == '10228204' || TAX_CD == '10228205' || TAX_CD == '50228203' || TAX_CD == '50228204' || TAX_CD == '50228206' || SECTION == '3' ){\r\n\t\t\tform.VAT.value = \"0\";\r\n\t\t\tform.bugwa_vat.value = \"0\";\r\n\t\t}\r\n\t\telse\t//변상금이 아니면 부가 가치세 할당...\r\n\t\t{\r\n\t\t\tform.VAT.value = \"";
  private final static String _jspx_template7 = "\";\r\n\t\t\tform.bugwa_vat.value = \"";
  private final static String _jspx_template8 = "\";\r\n\t\t}\r\n\t\t*/\r\n\t}\r\n\t\r\n\t//숫자만 입력\r\n\tfunction onlyNumberInput()\r\n\t{\t\r\n\t\tvar code = window.event.keyCode;\r\n\t\r\n\t \tif ((code > 34 && code < 41) || (code > 47 && code < 58) || (code > 95 && code < 106) || code == 8 || code == 9 || code == 13 || code == 46 || code == 190)\r\n\t \t{\r\n\t\t  \twindow.event.returnValue = true;\r\n\t\t\treturn;\r\n\t \t}else {\t \r\n\t \t\twindow.event.returnValue = false;\r\n\t \t\treturn;\r\n \t \t}\r\n\t}\r\n\t\r\n\tfunction add_yn_check()\r\n\t{\r\n\t\tvar form  = document.form;\r\n\t\tvar check_value = form.ADD_YN.checked;\r\n\r\n\t\tif(check_value == true){\r\n\t\t\tform.ADD_YN.value = \"1\";\r\n\t\t}\r\n\t\telse\r\n\t\t{\r\n\t\t\tform.ADD_YN.value = \"0\";\r\n\t\t}\r\n\t}\r\n//]]>\r\n</script>\r\n\r\n<body onload=\"Init(); Tax_Year(); Tax_Month();\">\r\n<form id=\"form\" name=\"form\" method=\"post\">\r\n<input type=\"hidden\" id=\"ADMIN_NO\" name=\"ADMIN_NO\" value=\"";
  private final static String _jspx_template9 = "\">\r\n<input type=\"hidden\" id=\"SEQ\" name=\"SEQ\" value=\"";
  private final static String _jspx_template10 = "\">\r\n<input type=\"hidden\" id=\"gasanRateGubun\" name=\"gasanRateGubun\">\r\n<input type=\"hidden\" id=\"gasanRateGubunNm\" name=\"gasanRateGubunNm\">\r\n<input type=\"hidden\" id=\"vatYn\" name=\"vatYn\">\r\n<input type=\"hidden\" id=\"suBuseoCd\" name=\"suBuseoCd\">\r\n<input type=\"hidden\" id=\"gasanRate\" name=\"gasanRate\">\r\n<input type=\"hidden\" id=\"YEAR\" name=\"YEAR\" value=\"";
  private final static String _jspx_template11 = "\">\r\n<input type=\"hidden\" id=\"sigu_se\" name=\"sigu_se\" value=\"";
  private final static String _jspx_template12 = "\">\r\n<input type=\"hidden\" id=\"BONSE_COMMA_CUT\" name=\"BONSE_COMMA_CUT\" value=\"";
  private final static String _jspx_template13 = "\">\r\n<input type=\"hidden\" id=\"SECTION\" name=\"SECTION\" value=\"";
  private final static String _jspx_template14 = "\">\r\n\r\n\r\n<table width=\"780\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t  <tr>\r\n\t\t<td align=\"left\" class=\"contborder_blue\">\r\n\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t<tr>\r\n\t\t\t  <td><table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t\t\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">과세번호</td>\r\n\t\t\t\t\t<td width=\"37%\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><input id=\"TAX_NO\"  name=\"TAX_NO\" type=\"text\" class=\"readonly\" style=\"width:120px\" value=\"";
  private final static String _jspx_template15 = "\" readonly></td>\r\n\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">과세구분</td>\r\n\t\t\t\t\t<td width=\"36%\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t<select id=\"TAX_GUBUN\" name=\"TAX_GUBUN\" class=\"essential\" style=\"width:70px\">\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template16 = "\r\n\t\t\t\t\t\t</select>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">과세년월</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t<select id=\"tax_year\" name=\"tax_year\" class=\"essential\" style=\"width:55px\">\r\n\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t년&nbsp;&nbsp;</td>\r\n\t\t\t\t\t\t\r\n\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t<select id=\"tax_month\" name=\"tax_month\" class=\"essential\" style=\"width:40px\">\r\n\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t월</td>\r\n\t\t\t\t\t\t\r\n\t\t\t\t   \t  </tr>\r\n\t\t\t\t\t</table></td>\r\n\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">세목코드</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\t\t\t\r\n\t\t\t\t\t\t<select id=\"TAX_CD\" name=\"TAX_CD\" class=\"essential\" style=\"width:185px\"  OnChange=\"SemokInfo();\">\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template17 = "\r\n\t\t\t\t\t\t</select>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">기관코드</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t<td><input id=\"SIGU_CD\" name=\"SIGU_CD\" type=\"text\" class=\"readonly\" style=\"width:45px\" value=\"";
  private final static String _jspx_template18 = "\" readonly></td>\r\n\t\t\t\t\t\t<td>&nbsp;<input id=\"GU_NM\" type=\"text\" class=\"readonly\" style=\"width:120px\" value=\"";
  private final static String _jspx_template19 = "\" readonly></td>\r\n\t\t\t\t   \t  </tr>\r\n\t\t\t\t\t</table></td>\r\n\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">부서코드</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t<td><input id=\"DEPT_CD\" name=\"DEPT_CD\" type=\"text\" class=\"readonly\" style=\"width:45px\" value=\"";
  private final static String _jspx_template20 = "\" readonly></td>\r\n\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t<select id=\"DEPT_LIST\" name=\"DEPT_LIST\" class=\"essential\" style=\"width: 120px;margin-left: 8px;\"\r\n\t\t\t\t\t\t\t\tonchange=\"onHandleChangeEvent()\">\r\n\t\t\t\t\t\t\t\t";
  // jsp code [from=(546,11);to=(548,9)]
  private final static String _jspx_template21 = "\r\n\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t";
  private final static String _jspx_template22 = "\r\n\t\t\t\t   \t</tr>\r\n\t\t\t\t\t</table></td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">OCR시구코드</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t<td><input id=\"OCR_SIGU_CD\" name=\"OCR_SIGU_CD\" type=\"text\" class=\"readonly\" style=\"width:45px\" value=\"";
  private final static String _jspx_template23 = "\"></td>\r\n\t\t\t\t   \t  </tr>\r\n\t\t\t\t\t</table></td>\r\n\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">OCR부서코드</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t<td><input id=\"OCR_BUSEO_CD\" name=\"OCR_BUSEO_CD\" type=\"text\" class=\"readonly\" style=\"width:45px\" value=\"";
  private final static String _jspx_template24 = "\"></td>\r\n\t\t\t\t   \t  </tr>\r\n\t\t\t\t\t</table></td>\r\n\t\t\t\t</tr>\t\t\t\t\r\n\t\t\t\t  \r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">납세자구분</td>\r\n\t\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t<select id=\"TAXPAYER_SET\" name=\"TAXPAYER_SET\" class=\"essential\" style=\"width:245px\">\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template25 = "\r\n\t\t\t\t\t\t</select>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">거주상태</td>\r\n\t\t\t\t\t<td width=\"181\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t<select id=\"LIVE\" name=\"LIVE\" class=\"essential\" style=\"width:115px\">\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template26 = "\r\n\t\t\t\t\t\t</select>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">물건구분</td>\r\n\t\t\t\t\t<td width=\"181\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t<select id=\"OBJ_SET\" name=\"OBJ_SET\" class=\"essential\" style=\"width:70px\">\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template27 = "\r\n\t\t\t\t\t\t</select>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">본세(점용료)</td>\r\n\t\t\t\t\t<td width=\"181\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><input id=\"BONSE\"  name=\"BONSE\" type=\"text\" class=\"readonly\" style=\"width:120px\" value=\"";
  private final static String _jspx_template28 = "\" readonly></td>\r\n\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">수납부서</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input id=\"SUBUSEO_CD\"  name=\"SUBUSEO_CD\" type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"\"></td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">부가가치세</td>\r\n\t\t\t\t\t<td width=\"181\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><input id=\"VAT\"  name=\"VAT\" type=\"text\" class=\"readonly\" style=\"width:120px\" value=\"";
  private final static String _jspx_template29 = "\" readonly></td>\r\n\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">과세일자</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t<td><input id=\"TAX_DATE\" name=\"TAX_DATE\" type=\"text\" class=\"essential\" style=\"width:65px\" value=\"";
  private final static String _jspx_template30 = "\" readonly></td>\r\n\t\t\t\t\t\t<td><a><img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, document.getElementById('TAX_DATE'), 'yyyymmdd')\" style=\"CURSOR: Hand;\"></a></td>\r\n\t\t\t\t\t  </tr>\r\n\t\t\t\t\t</table></td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">납기내금액</td>\r\n\t\t\t\t\t<td width=\"181\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><input id=\"INTAX\"  name=\"INTAX\" type=\"text\" class=\"readonly\" style=\"width:120px\" value=\"";
  private final static String _jspx_template31 = "\" readonly></td>\r\n\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">납기내일자</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t<td><input id=\"INDATE\" name=\"INDATE\" type=\"text\" class=\"essential\" style=\"width:65px\" value=\"\" onFocus=\"\" readonly></td>\r\n\t\t\t\t\t\t<td><a><img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, document.getElementById('INDATE'), 'yyyymmdd')\" style=\"CURSOR: Hand;\"></a></td>\r\n\t\t\t\t\t  </tr>\r\n\t\t\t\t\t</table></td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">납기후금액</td>\r\n\t\t\t\t\t<td width=\"181\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><input id=\"OVERTAX\"  name=\"OVERTAX\" type=\"text\" class=\"essential\" style=\"width:120px\" value=\"";
  private final static String _jspx_template32 = "\" style=\"ime-mode:disabled\" onKeyDown=\"nr_num_int(this); MultiData_Check();\" onKeyUp=\"nr_num_int(this); comma_paste(this); MultiData_Check();\" onKeyPress=\"nr_num_int(this);\"></td>\r\n\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">납기후일자</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t<td><input id=\"OVERDATE\"  name=\"OVERDATE\" type=\"text\" class=\"essential\" style=\"width:65px\" value=\"\" readonly></td>\r\n\t\t\t\t\t\t<td><a><img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, document.getElementById('OVERDATE'), 'yyyymmdd')\" style=\"CURSOR: Hand;\"></a></td>\r\n\t\t\t\t\t  </tr>\r\n\t\t\t\t\t</table></td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">가산율구분</td>\r\n\t\t\t\t\t<td width=\"181\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t<input id=\"ADD_SET\"  name=\"ADD_SET\" type=\"hidden\" value=\"";
  private final static String _jspx_template33 = "\">\r\n\t\t\t\t\t\t<input id=\"ADD_SET_NM\"  name=\"ADD_SET_NM\" type=\"text\" class=\"readonly\" style=\"width:160px\" value=\"";
  private final static String _jspx_template34 = "\" readonly>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">가산금면제여부</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t<input id=\"ADD_YN\"  name=\"ADD_YN\" value=\"0\" type=\"checkbox\" onclick=\"javascript:add_yn_check();\">가산금면제\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">비고</td>\r\n\t\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><input id=\"NOTES\"  name=\"NOTES\" type=\"text\" class=\"input_form1\" style=\"width:98%\" value=\"";
  private final static String _jspx_template35 = "\"></td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">적용 상한율</td>\r\n\t\t\t\t\t<td width=\"181\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><input id=\"LIMIT_SUM\"  name=\"LIMIT_SUM\" type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"";
  private final static String _jspx_template36 = "\" onKeyDown=\"onlyNumberInput();\" maxlength=\"3\"></td>\r\n\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">상한횟수</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input id=\"LIMIT_CNT\"  name=\"LIMIT_CNT\" type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"";
  private final static String _jspx_template37 = "\" onKeyDown=\"onlyNumberInput();\" maxlength=\"3\"></td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">특별이율</td>\r\n\t\t\t\t\t<td width=\"181\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><input id=\"RATE\"  name=\"RATE\" type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"";
  private final static String _jspx_template38 = "\" onKeyDown=\"onlyNumberInput();\" maxlength=\"8\"></td>\r\n\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">특별이율 사유</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input id=\"RATE_CAUSE\"  name=\"RATE_CAUSE\" type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"";
  private final static String _jspx_template39 = "\" maxlength=\"50\"></td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t\r\n \t\t    </table></td>\r\n\t\t\t</tr>\r\n\t\t\t\r\n\t\t      <tr>\r\n\t\t        <td height=\"14\"></td>\r\n\t\t      </tr>\r\n\t\t\t\t\r\n\t\t<tr>\r\n\t\t\t<td><table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t    <tr>\r\n\t\t        <!-- \r\n\t\t        <td width=\"17%\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">본세</td>\r\n\t\t        <td width=\"12%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">시세</td>\r\n\t\t        <td width=\"12%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">구세</td>\r\n\t\t        <td width=\"17%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">부가가치세</td>\r\n\t\t        <td width=\"17%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">납기내금액</td>\r\n\t\t        <td width=\"17%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">납기후금액</td>\r\n\t\t         -->\r\n\t         \t<td width=\"25%\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">본세</td>\r\n\t\t        <td width=\"25%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">부가가치세</td>\r\n\t\t        <td width=\"25%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">납기내금액</td>\r\n\t\t        <td width=\"25%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">납기후금액</td>\r\n\t\t    </tr>\r\n\t\t     \r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"26\" align=\"center\"><input id=\"bugwa_bonse\"  name=\"bugwa_bonse\" type=\"text\" value=\"";
  private final static String _jspx_template40 = "\" style=\"width:92%; text-align:right;\" class=\"readonly\" readonly></td>\r\n\t\t\t\t<input id=\"SISE\"  name=\"SISE\" type=\"hidden\" value=\"\" class=\"input_form1\" style=\"width:90%; text-align:right;\" style=\"ime-mode:disabled\" onKeyDown=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);  comma_paste(this);\" onKeyPress=\"nr_num_int(this);\" maxlength=13>\r\n\t\t\t\t<input id=\"GUSE\" name=\"GUSE\" type=\"hidden\" value=\"\" class=\"input_form1\" style=\"width:90%; text-align:right;\" style=\"ime-mode:disabled\" onKeyDown=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);  comma_paste(this);\" onKeyPress=\"nr_num_int(this);\" maxlength=13>\r\n\t\t\t\t<td align=\"center\"><input id=\"bugwa_vat\" name=\"bugwa_vat\" type=\"text\" value=\"";
  private final static String _jspx_template41 = "\" class=\"readonly\" style=\"width:92%; text-align:right;\" readonly></td>\r\n\t\t\t\t<td align=\"center\"><input id=\"bugwa_intax\" name=\"bugwa_intax\" type=\"text\" value=\"";
  private final static String _jspx_template42 = "\" class=\"readonly\" style=\"width:92%; text-align:right;\" readonly></td>\r\n\t\t\t\t<td align=\"center\"><input id=\"bugwa_overtax\"  name=\"bugwa_overtax\" type=\"text\" value=\"\" class=\"readonly\" style=\"width:92%; text-align:right;\" readonly></td>\r\n             </tr>\r\n\t\t\t</table></td>\r\n\t\t</tr>\r\n\r\n\t\t\t<tr>\r\n\t\t\t  <td height=\"40\" align=\"right\">\r\n\t\t\t\t<a href=\"javascript:Register()\"><img src=\"/img/save_icon2.gif\" alt=\"등록\" width=\"56\" height=\"18\" border=\"0\"></a>\r\n\t\t\t  </td>\r\n\t\t\t</tr>\r\n\t\t\t\r\n\t\t</table></td>\r\n\t  </tr>\r\n\r\n</table>\r\n\r\n</body>\r\n</html>";
}
