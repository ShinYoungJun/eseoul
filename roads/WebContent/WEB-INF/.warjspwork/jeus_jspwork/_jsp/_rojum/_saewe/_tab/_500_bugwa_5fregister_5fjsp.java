package jeus_jspwork._jsp._rojum._saewe._tab;

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
      // jsp code [from=(370,24);to=(370,27)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${VAT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template5);
      // jsp code [from=(371,30);to=(371,33)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${VAT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template6);
      // jsp code [from=(408,47);to=(408,55)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template7);
      // jsp code [from=(409,42);to=(409,45)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template8);
      // jsp code [from=(415,43);to=(415,47)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template9);
      // jsp code [from=(416,46);to=(416,53)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TAX_SET}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(417,54);to=(417,59)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${BONSE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(429,140);to=(429,152)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TAX_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(433,10);to=(433,23)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${taxation_part}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(457,10);to=(457,17)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${taxcode}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(466,90);to=(466,96)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ORG_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(467,90);to=(467,95)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GU_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(473,90);to=(473,97)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${DEPT_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(474,90);to=(474,97)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${DEPT_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(483,94);to=(483,105)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${OCR_SIGU_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(489,95);to=(489,107)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${OCR_BUSEO_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(498,10);to=(498,24)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${taxpayer_group}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(507,10);to=(507,28)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${taxpayer_residence}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(513,10);to=(513,21)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${object_type}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(520,139);to=(520,149)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SUM_ADJUST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // jsp code [from=(527,137);to=(527,140)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${VAT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);
      // jsp code [from=(531,106);to=(531,114)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TAX_DATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template26);
      // jsp code [from=(539,139);to=(539,149)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SUM_ADJUST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // jsp code [from=(551,142);to=(551,155)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OVERTAX}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template28);
      // jsp code [from=(565,52);to=(565,65)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADD_SET}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template29);
      // jsp code [from=(566,90);to=(566,106)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADD_SET_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template30);
      // jsp code [from=(576,140);to=(576,151)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.NOTES}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template31);
      // jsp code [from=(581,146);to=(581,161)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.LIMIT_SUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template32);
      // jsp code [from=(583,134);to=(583,149)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.LIMIT_CNT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template33);
      // jsp code [from=(588,141);to=(588,151)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template34);
      // jsp code [from=(590,135);to=(590,151)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.RATE_CAUSE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template35);
      // jsp code [from=(620,83);to=(620,93)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SUM_ADJUST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template36);
      // jsp code [from=(623,69);to=(623,72)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${VAT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template37);
      // jsp code [from=(624,71);to=(624,81)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SUM_ADJUST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template38);
      // jsp code [from=(627,83);to=(627,93)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SUM_ADJUST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template39);
      // jsp code [from=(630,69);to=(630,72)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${VAT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template40);
      // jsp code [from=(631,71);to=(631,81)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SUM_ADJUST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template41);

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
  private final static String _jspx_template1 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('������� ���ð��� ����Ǿ����ϴ�. �ٽ� ���� ���ֽñ� �ٶ��ϴ�.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template2 = "    \r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n\r\n<title>::::: ����� ������������ý��� :::::</title>\r\n<style type=\"text/css\">\r\n\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n}\r\n-->\r\n\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script> \r\n<script language='JavaScript' src='/js/Check_inputbox.js'></script>\r\n<script language=\"javascript\" src=\"/js/Ajax_request.js\"></script>\r\n\r\n<script type=\"text/javascript\">\r\n//<![CDATA[\r\n\r\n\tfunction\tRegister()\r\n\t{\r\n\t\tvar\tresult\t= DataCheck();\r\n\t\tif(result\t==\tfalse)\treturn;\r\n\t\tif(!TaxDateCheck()) return;\r\n\t\t\r\n\t\tvar form  = document.form;\r\n\t\tvar intax = removeComma(form.INTAX.value);\r\n\t\tvar sise  = removeComma(form.SISE.value);\r\n\t\tvar guse  = removeComma(form.GUSE.value);\r\n\t\t\r\n\t\tif(\tintax != sise + guse)\r\n\t\t{\r\n\t\t\talert(\"�ü�+���� �հ谡 �Ѻΰ��ݾװ� ��ġ���� �ʽ��ϴ�.\");\r\n\t\t\treturn;\r\n\t\t}\t\r\n\t\t\r\n\t\tvar\tobj\t= document.getElementById(\"ADD_YN\");\r\n\t\t\r\n\t\tif(obj.checked\t== true)\r\n\t\t\tdocument.getElementById(\"ADD_YN\").value='1';\r\n\t\telse\r\n\t\t\tdocument.getElementById(\"ADD_YN\").value='0';\r\n\r\n\t\tform.action = \"/rojum/saewe/bugwa_register_prc.do\";\r\n\t\tform.submit();\r\n\t}\r\n\r\n\tfunction removeComma(numValue)\r\n\t{\r\n\t\treturn Number(numValue.split(',').join(\"\"));\r\n\t}\r\n\t\r\n\tfunction\tTax_Year()\r\n\t{\r\n\t\tvar now\t\t= new Date();\r\n\t\tvar nowyear\t= now.getYear();\r\n\t\tvar year\t= nowyear - 1;\r\n\t\t\r\n\t\tvar opt = document.getElementById('tax_year');\r\n        var root;\r\n        var selectBoxLabel;\r\n        var selectBoxValue;\r\n        var tags\t= \"\";\r\n        var\ttext\t= \"\";\r\n        \r\n        for(var i = 0; i < 2; i++)\r\n        {\r\n        \tselectBoxValue = year + i;\r\n        \tselectBoxLabel = year + i;\r\n\r\n            tags \t= document.createElement(\"option\");\r\n       \t\ttext\t= document.createTextNode(selectBoxLabel);\r\n            tags.setAttribute(\"label\", selectBoxLabel);\r\n            if(selectBoxValue == nowyear) tags.setAttribute(\"selected\", \"true\");\r\n\r\n            tags.value = selectBoxValue;\r\n            tags.appendChild(text);\r\n            opt.appendChild(tags);\r\n        }\r\n\t}\r\n\r\n\tfunction\tTax_Month()\r\n\t{\r\n\t\tvar now\t\t= new Date();\r\n\t\tvar month\t= now.getMonth() + 1;\r\n\t\t\r\n\t\tvar opt = document.getElementById('tax_month');\r\n        var root;\r\n        var selectBoxLabel;\r\n        var selectBoxValue;\r\n        var tags\t= \"\";\r\n        var\ttext\t= \"\";\r\n        \r\n        for(var i = 1; i <= 12; i++)\r\n        {\r\n        \tselectBoxValue = i;\r\n        \tselectBoxLabel = i;\r\n\r\n            tags \t= document.createElement(\"option\");\r\n       \t\ttext\t= document.createTextNode(selectBoxLabel);\r\n            tags.setAttribute(\"label\", selectBoxLabel);\r\n            if(i == month) tags.setAttribute(\"selected\", \"true\");\r\n\r\n            tags.value = selectBoxValue;\r\n            tags.appendChild(text);\r\n            opt.appendChild(tags);\r\n        }\r\n\t}\r\n\t\r\n\tfunction\tMultiData_Check()\r\n\t{\r\n\t\tvar form = document.form;\r\n\r\n\t\tform.bugwa_bonse.value\t\t= form.BONSE.value;\r\n\t\tform.bugwa_vat.value\t\t= form.VAT.value;\r\n\t\tform.bugwa_intax.value\t\t= form.INTAX.value;\r\n\t\tform.bugwa_overtax.value\t= form.OVERTAX.value;\r\n\t}\r\n\r\n\tfunction\tDataCheck()\r\n\t{\r\n\t\tvar form \t= document.form;\r\n\t\tvar\tstr\t\t= \"\";\r\n\t\t\r\n\t\tif(form.TAX_GUBUN.value.length\t< 1)\r\n\t\t\tstr\t+= \"���������� �Է��ϼ���\\n\";\r\n\t\telse if(form.TAX_CD.value.length\t< 1)\r\n\t\t\tstr\t+= \"�����ڵ带 �Է��ϼ���\\n\";\r\n\t\telse if(form.TAXPAYER_SET.value.length\t< 1)\r\n\t\t\tstr\t+= \"������ ������ �Է��ϼ���\\n\";\r\n\t\telse if(form.LIVE.value.length\t< 1)\r\n\t\t\tstr\t+= \"���ֻ��¸� �Է��ϼ���\\n\";\r\n\t\telse if(form.OBJ_SET.value.length\t< 1)\r\n\t\t\tstr\t+= \"���Ǳ����� �Է��ϼ���.\\n\";\r\n\t\telse if(form.TAX_DATE.value.length\t< 1)\r\n\t\t\tstr\t+= \"�������ڸ� �Է��ϼ���\\n\";\r\n\t\telse if(form.INDATE.value.length\t< 1)\r\n\t\t\tstr\t+= \"���⳻���ڸ� �Է��ϼ���\\n\";\r\n\t\telse if(form.OVERTAX.value.length\t< 1)\r\n\t\t\tstr\t+= \"�����ıݾ��� �Է��ϼ���\\n\";\r\n\t\telse if(form.OVERDATE.value < 110)\r\n\t\t\tstr\t+= \"���������ڸ� �Է��ϼ���\\n\";\r\n\r\n\t\tif(str\t== \"\")\r\n\t\t{\r\n\t\t\treturn\ttrue;\r\n\t\t}\r\n\t\t\r\n\t\talert(str);\r\n\r\n\t\treturn\tfalse;\t\t\r\n\t}\r\n\r\n\tfunction\tTaxDateCheck()\r\n\t{\r\n\t\tvar form \t= document.form;\r\n\r\n\t\tif(for";
  private final static String _jspx_template3 = "m.TAX_DATE.value.length\t< 1)\r\n\t\t\treturn;\r\n\r\n\t\tvar\ttax_year\t= new Number(form.tax_year.value);\r\n\t\tvar\ttax_month\t= new Number(form.tax_month.value);\r\n\r\n\t\tvar\ttax\t\t= form.TAX_DATE.value;\r\n\t\tvar\tyear\t= new Number(tax.substr(0, 4));\r\n\t\tvar\tmonth\t= new Number(tax.substr(5, 2));\r\n\r\n\t//\talert(tax_year.valueOf() + \", \" + tax_month.valueOf() + \", \" + year.valueOf() + \", \" + month.valueOf());\r\n\r\n\t\tif(tax_year.valueOf() != year.valueOf())\r\n\t\t{\r\n\t\t\talert(\"��������� ���������� ����� �ٸ��� �ΰ��Ҽ� �����ϴ�.\");\r\n\t\t\treturn false;\r\n\t\t}\r\n\t\telse if(tax_month.valueOf() != month.valueOf())\r\n\t\t{\r\n\t\t\talert(\"��������� ���������� ����� �ٸ��� �ΰ��Ҽ� �����ϴ�.\");\r\n\t\t\treturn false;\r\n\t\t}\r\n\t\tif(document.getElementById(\"TAX_DATE\").value>document.getElementById(\"INDATE\").value){\r\n\t\t\talert(\"���⳻���ڴ� �������ں��� �ʰ� ���� �� �������ϴ�.\");\r\n\t\t\treturn ;\r\n\t\t}\r\n\t\t\r\n\t\tif(document.getElementById(\"INDATE\").value>document.getElementById(\"OVERDATE\").value){\r\n\t\t\talert(\"���������ڴ� ���⳻���ں��� �ʰ� ���� �� �� �����ϴ�.\");\r\n\t\t\treturn;\r\n\t\t} \r\n\t\treturn true;\t\r\n\t}\r\n\r\n\tfunction\tAfterDate(obj)\r\n\t{\r\n\t\tvar\tdate\t= obj.value;\r\n\r\n\t\tvar\tthisMon\t= new Date(date.substr(0, 4), date.substr(5, 2), date.substr(8, 2), \"\", \"\", \"\");\r\n\r\n\t\tthisMon.setMonth(thisMon.getMonth() + 1);\r\n\t\tthisMon.setDate(thisMon.getDate() - 1);\r\n\t\t\r\n\t\tvar\tyear\t= \"\" + thisMon.getYear();\r\n\t\tvar\tmonth\t= \"\" + thisMon.getMonth();\r\n\t\tvar\tdate\t= \"\" + thisMon.getDate();\r\n\t\t\r\n\t\tif(month.length == 1)\tmonth \t= \"0\" + month;\r\n\t\tif(date.length == 1)\tdate\t= \"0\" + date;\r\n\r\n\t\tdocument.getElementById(\"OVERDATE\").value\t= year + \"-\"+ month +\"-\"+ date;\r\n\t}\r\n\r\n///////////////////////////////////////////////////////////////////\r\nvar dateUtil = function() {\r\n    this.startObject = null;\r\n    this.endObject = null;\r\n    this.args = null;\r\n}\r\n\r\ndateUtil.prototype.formatLen = function(str) {\r\n    return str = (\"\"+str).length<2 ? \"0\"+str : str;\r\n}\r\n\r\ndateUtil.prototype.formatDate = function(dateObject, delimiter) {\r\n    delimiter = delimiter || \"-\";\r\n    return dateObject.getFullYear() + delimiter + this.formatLen(dateObject.getMonth() + 1) + delimiter + this.formatLen(dateObject.getDate());\r\n}\r\n\r\ndateUtil.prototype.toDay = function(delimiter) {\r\n    return this.formatDate(new Date(), \"-\");\r\n}\r\n\r\ndateUtil.prototype.calDate = function() {\r\n    var year = this.args.year == null ? 0 : Number(this.args.year);\r\n    var month = this.args.month == null ? 0 : Number(this.args.month);\r\n    var day = this.args.day == null ? 0 : Number(this.args.day);\r\n    var result = new Date();\r\n\r\n    result.setYear(result.getFullYear() + year);\r\n    result.setMonth(result.getMonth() + month);\r\n    result.setDate(result.getDate() + day-1);\r\n    return this.formatDate(result, \"-\");\r\n}\r\n\r\ndateUtil.prototype.setDate = function(startObject, endObject, args) {\r\n    this.startObject = startObject;\r\n    this.endObject = endObject;\r\n    this.args = args;\r\n\r\n    document.getElementById(this.startObject).value = this.calDate();\r\n    document.getElementById(this.endObject).value = this.toDay();\r\n}\r\n\r\n\r\nvar dateUtilObj = new dateUtil();\r\n///////////////////////////////////////////////////////////////////\r\n\r\n\tfunction \tInit()\r\n\t{\r\n\t\tparent.TabDown_Img(\"bugwa\");\r\n\t\tparent.Bugwa_Off();\r\n\t\t\r\n\t\tvar\tsigu_se\t= document.form.sigu_se.value;\r\n\t\tvar bonse = document.form.BONSE.value;\r\n\t\t\r\n\t\tdocument.form.SISE.value = \"0\";\r\n\t\tdocument.form.GUSE.value = \"0\";\r\n\t\t\r\n\t\tif(sigu_se == \"10\")\r\n\t\t\tdocument.form.SISE.value = bonse;\r\n\t\telse if(sigu_se == \"50\")\t\r\n\t\t\tdocument.form.GUSE.value = bonse;\r\n\t\t\t\r\n\t\t//������¥, �����ϳ�����, ���������� ���ϱ�  2009.08.31 pkh\r\n\t\tvar dateUtilObj = new dateUtil();\r\n\t\tdateUtilObj.setDate('INDATE', 'TAX_DATE', {month: +1});\r\n\t\t\r\n\t\tvar indate = document.getElementById(\"INDATE\").value;\r\n\t\t\r\n\t\tindate_year = Number(indate.substr(0,4));\r\n\t\tindate_month = Number(indate.substr(5,2));\r\n\t\tif(indate_month==12){\r\n\t\t\tindate_year = indate_year+1;\r\n\t\t\tindate_month = 1;\r\n\t\t}else{\r\n\t\t\tindate_month++;\r\n\t\t}\r\n\t\t\r\n\t\tif(indate_month<10){\r\n\t\t\tindate_month = \"0\"+indate_month;\r\n\t\t}\r\n\t\tvar over_date = new Date(new Date(indate_year, indate_month, 1)-86400000).getDate();\r\n\t\t\r\n\t\tdocument.getElementById(\"OVERDATE\").value = indate_year+\"-\"+indate_month+\"-\"+over_date;\r\n\t}\r\n\t\r\n\tfunct";
  private final static String _jspx_template4 = "ion\tSemokInfo()\r\n\t{\r\n\t\tvar\tTAX_CD\t= document.getElementById(\"TAX_CD\").value;\r\n\t\tvar\tSIGU_CD\t= document.getElementById(\"SIGU_CD\").value;\r\n\t\tvar\tDEPT_CD\t= document.getElementById(\"DEPT_CD\").value;\r\n\t\talert(TAX_CD + \"::\" + SIGU_CD + \"::\" + DEPT_CD);\r\n\t\t\r\n\t\tvar\tparams\t= \"TAX_CD=\" + TAX_CD + \"&SIGU_CD=\" + SIGU_CD + \"&DEPT_CD=\" + DEPT_CD;\r\n\t\r\n\t\tsendRequest(\"/rojum/saewe/semokinfo.do\", params, \"GET\", Result_SemokInfo);\r\n\t}\r\n\t\r\n\tfunction\tResult_SemokInfo(obj)\r\n\t{\r\n\t\tif(obj == \"\")\r\n\t\t{\t\t\r\n\t\t\talert(\"�����ڵ� ����!!\");\r\n\t\t\treturn;\r\n\t\t}\r\n\t\t\r\n        var xmldoc \t= new ActiveXObject(\"Microsoft.XMLDOM\");\r\n        var form \t= document.form;\r\n\r\n        xmldoc.async\t= false;\r\n\t\txmldoc.loadXML(obj);\r\n\r\n\t\tform.ADD_SET.value\t\t= \txmldoc.getElementsByTagName(\"gasanRateGubun\").item(0).text;\r\n\t\tform.ADD_SET_NM.value\t= \txmldoc.getElementsByTagName(\"gasanRateGubunNm\").item(0).text;\r\n\t\t//form.ADD_YN.value\t\t=\txmldoc.getElementsByTagName(\"vatYn\").item(0).text;\r\n\t\tform.SUBUSEO_CD.value\t=\txmldoc.getElementsByTagName(\"suBuseoCd\").item(0).text;\r\n\t\tform.gasanRate.value\t=\txmldoc.getElementsByTagName(\"gasanRate\").item(0).text;\r\n\t\tform.OCR_BUSEO_CD.value\t=\txmldoc.getElementsByTagName(\"ocrBuseoCd\").item(0).text;\r\n\t\tform.OCR_SIGU_CD.value\t=\txmldoc.getElementsByTagName(\"ocrSiguCd\").item(0).text;\r\n\r\n\t\tif(form.gasanRate.value == '0.0'){\r\n    \t\tform.ADD_YN.value = 1;\r\n\t\t}else{\r\n\t\t\tform.ADD_YN.value = 0;\r\n\t\t}\r\n\r\n\t\t\r\n\t\t//�����ıݾ�(10����������) = ���� * ������ + ����\r\n\t\tvar overtax = String((parseInt(form.BONSE_COMMA_CUT.value)/100) * parseInt(form.gasanRate.value) + parseInt(form.BONSE_COMMA_CUT.value));\r\n\t\tvar overtax_value = 0;\r\n\t\t\r\n\t\tif(overtax > 0){\r\n\t\t\tovertax_value = parseInt(overtax.substr(0, overtax.length - 1)) * 10;\r\n\t\t}\r\n\t\t\r\n\t\tform.OVERTAX.value = overtax_value;\r\n\t\tform.bugwa_overtax.value = overtax_value;\r\n\t\t\t\r\n\t\tcomma_paste(form.OVERTAX);\r\n\t\tcomma_paste(form.bugwa_overtax);\r\n\t\t\r\n\t\tvar\tTAX_CD\t= document.getElementById(\"TAX_CD\").value;\r\n\t\t\r\n\t\t//������̸� �ΰ� ��ġ���� 0��...\r\n\t\tif(TAX_CD == '50228210' || TAX_CD == '10228202' || TAX_CD == '10228204' || TAX_CD == '10228205' || TAX_CD == '50228203'  || TAX_CD == '50228204' || TAX_CD == '50228206'){\r\n\t\t\tform.VAT.value = \"0\";\r\n\t\t\tform.bugwa_vat.value = \"0\";\r\n\t\t}\r\n\t\telse\t//������� �ƴϸ� �ΰ� ��ġ�� �Ҵ�...\r\n\t\t{\r\n\t\t\tform.VAT.value = \"";
  private final static String _jspx_template5 = "\";\r\n\t\t\tform.bugwa_vat.value = \"";
  private final static String _jspx_template6 = "\";\r\n\t\t}\r\n\t}\r\n\t\r\n\t//���ڸ� �Է�\r\n\tfunction onlyNumberInput()\r\n\t{\t\r\n\t\tvar code = window.event.keyCode;\r\n\t\r\n\t \tif ((code > 34 && code < 41) || (code > 47 && code < 58) || (code > 95 && code < 106) || code == 8 || code == 9 || code == 13 || code == 46 || code == 190)\r\n\t \t{\r\n\t\t  \twindow.event.returnValue = true;\r\n\t\t\treturn;\r\n\t \t}else {\t \r\n\t \t\twindow.event.returnValue = false;\r\n\t \t\treturn;\r\n \t \t}\r\n\t}\t\r\n\t\r\n\tfunction add_yn_check()\r\n\t{\r\n\t\tvar form  = document.form;\r\n\t\tvar check_value = form.ADD_YN.checked;\r\n\r\n\t\tif(check_value == true){\r\n\t\t\tform.ADD_YN.value = \"1\";\r\n\t\t}\r\n\t\telse\r\n\t\t{\r\n\t\t\tform.ADD_YN.value = \"0\";\r\n\t\t}\r\n\t}\r\n//]]>\r\n</script>\r\n\r\n<body onload=\"Init(); Tax_Year(); Tax_Month();\">\r\n<form name=\"form\" method=\"post\">\r\n<input type=\"hidden\" name=\"ADMIN_NO\" value=\"";
  private final static String _jspx_template7 = "\">\r\n<input type=\"hidden\" name=\"SEQ\" value=\"";
  private final static String _jspx_template8 = "\">\r\n<input type=\"hidden\" name=\"gasanRateGubun\">\r\n<input type=\"hidden\" name=\"gasanRateGubunNm\">\r\n<input type=\"hidden\" name=\"vatYn\">\r\n<input type=\"hidden\" name=\"suBuseoCd\">\r\n<input type=\"hidden\" name=\"gasanRate\">\r\n<input type=\"hidden\" name=\"YEAR\" value=\"";
  private final static String _jspx_template9 = "\">\r\n<input type=\"hidden\" name=\"sigu_se\" value=\"";
  private final static String _jspx_template10 = "\">\r\n<input type=\"hidden\" name=\"BONSE_COMMA_CUT\" value=\"";
  private final static String _jspx_template11 = "\">\r\n\r\n\r\n<table width=\"780\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t  <tr>\r\n\t\t<td align=\"left\" class=\"contborder_blue\">\r\n\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t<tr>\r\n\t\t\t  <td><table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t\t\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">������ȣ</td>\r\n\t\t\t\t\t<td width=\"37%\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"TAX_NO\" type=\"text\" class=\"readonly\" style=\"width:120px\" value=\"";
  private final static String _jspx_template12 = "\"></td>\r\n\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">��������</td>\r\n\t\t\t\t\t<td width=\"36%\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t<select name=\"TAX_GUBUN\" id=\"TAX_GUBUN\" class=\"essential\" style=\"width:70px\">\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template13 = "\r\n\t\t\t\t\t\t</select>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">�������</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t<select name=\"tax_year\" id=\"tax_year\" class=\"essential\" style=\"width:55px\">\r\n\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t��&nbsp;&nbsp;</td>\r\n\t\t\t\t\t\t\r\n\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t<select name=\"tax_month\" id=\"tax_month\" class=\"essential\" style=\"width:40px\">\r\n\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t��</td>\r\n\t\t\t\t\t\t\r\n\t\t\t\t   \t  </tr>\r\n\t\t\t\t\t</table></td>\r\n\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">�����ڵ�</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\t\t\t\r\n\t\t\t\t\t\t<select name=\"TAX_CD\" id=\"TAX_CD\" class=\"essential\" style=\"width:185px\"  OnChange=\"SemokInfo();\">\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template14 = "\r\n\t\t\t\t\t\t</select>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">����ڵ�</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t<td><input name=\"SIGU_CD\" type=\"text\" class=\"readonly\" style=\"width:45px\" value=\"";
  private final static String _jspx_template15 = "\" readonly></td>\r\n\t\t\t\t\t\t<td>&nbsp;<input name=\"\" type=\"text\" class=\"readonly\" style=\"width:120px\" value=\"";
  private final static String _jspx_template16 = "\" readonly></td>\r\n\t\t\t\t   \t  </tr>\r\n\t\t\t\t\t</table></td>\r\n\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">�μ��ڵ�</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t<td><input name=\"DEPT_CD\" type=\"text\" class=\"readonly\" style=\"width:45px\" value=\"";
  private final static String _jspx_template17 = "\" readonly></td>\r\n\t\t\t\t\t\t<td>&nbsp;<input name=\"\" type=\"text\" class=\"readonly\" style=\"width:120px\" value=\"";
  private final static String _jspx_template18 = "\" readonly></td>\r\n\t\t\t\t   \t  </tr>\r\n\t\t\t\t\t</table></td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">OCR�ñ��ڵ�</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t<td><input name=\"OCR_SIGU_CD\" type=\"text\" class=\"readonly\" style=\"width:45px\" value=\"";
  private final static String _jspx_template19 = "\"></td>\r\n\t\t\t\t   \t  </tr>\r\n\t\t\t\t\t</table></td>\r\n\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">OCR�μ��ڵ�</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t<td><input name=\"OCR_BUSEO_CD\" type=\"text\" class=\"readonly\" style=\"width:45px\" value=\"";
  private final static String _jspx_template20 = "\"></td>\r\n\t\t\t\t   \t  </tr>\r\n\t\t\t\t\t</table></td>\r\n\t\t\t\t</tr>\t\t\t\t\r\n\t\t\t\t  \r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">�����ڱ���</td>\r\n\t\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t<select name=\"TAXPAYER_SET\" id=\"TAXPAYER_SET\" class=\"essential\" style=\"width:245px\">\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template21 = "\r\n\t\t\t\t\t\t</select>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">���ֻ���</td>\r\n\t\t\t\t\t<td width=\"181\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t<select name=\"LIVE\" id=\"LIVE\" class=\"essential\" style=\"width:115px\">\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template22 = "\r\n\t\t\t\t\t\t</select>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">���Ǳ���</td>\r\n\t\t\t\t\t<td width=\"181\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t<select name=\"OBJ_SET\" id=\"OBJ_SET\" class=\"essential\" style=\"width:70px\">\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template23 = "\r\n\t\t\t\t\t\t</select>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">����(�����)</td>\r\n\t\t\t\t\t<td width=\"181\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"BONSE\" type=\"text\" class=\"readonly\" style=\"width:120px\" value=\"";
  private final static String _jspx_template24 = "\" readonly></td>\r\n\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">�����μ�</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"SUBUSEO_CD\" type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"\"></td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">�ΰ���ġ��</td>\r\n\t\t\t\t\t<td width=\"181\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"VAT\" type=\"text\" class=\"readonly\" style=\"width:120px\" value=\"";
  private final static String _jspx_template25 = "\" readonly></td>\r\n\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">��������</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t<td><input name=\"TAX_DATE\" id=\"TAX_DATE\" type=\"text\" class=\"essential\" style=\"width:65px\" value=\"";
  private final static String _jspx_template26 = "\" readonly></td>\r\n\t\t\t\t\t\t<td><a><img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, TAX_DATE, 'yyyymmdd')\" style=\"CURSOR: Hand;\"></a></td>\r\n\t\t\t\t\t  </tr>\r\n\t\t\t\t\t</table></td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">���⳻�ݾ�</td>\r\n\t\t\t\t\t<td width=\"181\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"INTAX\" type=\"text\" class=\"readonly\" style=\"width:120px\" value=\"";
  private final static String _jspx_template27 = "\" readonly></td>\r\n\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">���⳻����</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t<td><input name=\"INDATE\" id=\"INDATE\" type=\"text\" class=\"essential\" style=\"width:65px\" value=\"\" onFocus=\"\" readonly></td>\r\n\t\t\t\t\t\t<td><a><img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, INDATE, 'yyyymmdd')\" style=\"CURSOR: Hand;\"></a></td>\r\n\t\t\t\t\t  </tr>\r\n\t\t\t\t\t</table></td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">�����ıݾ�</td>\r\n\t\t\t\t\t<td width=\"181\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"OVERTAX\" type=\"text\" class=\"essential\" style=\"width:120px\" value=\"";
  private final static String _jspx_template28 = "\" style=\"ime-mode:disabled\" onKeyDown=\"nr_num_int(this); MultiData_Check();\" onKeyUp=\"nr_num_int(this); comma_paste(this); MultiData_Check();\" onKeyPress=\"nr_num_int(this);\"></td>\r\n\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">����������</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t<td><input name=\"OVERDATE\" id=\"OVERDATE\" type=\"text\" class=\"essential\" style=\"width:65px\" value=\"\" readonly></td>\r\n\t\t\t\t\t\t<td><a><img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, OVERDATE, 'yyyymmdd')\" style=\"CURSOR: Hand;\"></a></td>\r\n\t\t\t\t\t  </tr>\r\n\t\t\t\t\t</table>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">����������</td>\r\n\t\t\t\t\t<td width=\"181\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t<input name=\"ADD_SET\" type=\"hidden\" value=\"";
  private final static String _jspx_template29 = "\">\r\n\t\t\t\t\t\t<input name=\"ADD_SET_NM\" type=\"text\" class=\"readonly\" style=\"width:160px\" value=\"";
  private final static String _jspx_template30 = "\" readonly>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">����ݸ�������</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t<input name=\"ADD_YN\" value=\"0\" type=\"checkbox\" onclick=\"javascript:add_yn_check();\">����ݸ���\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">���</td>\r\n\t\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"NOTES\" type=\"text\" class=\"input_form1\" style=\"width:98%\" value=\"";
  private final static String _jspx_template31 = "\"></td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">���� ������</td>\r\n\t\t\t\t\t<td width=\"181\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"LIMIT_SUM\" type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"";
  private final static String _jspx_template32 = "\" onKeyDown=\"onlyNumberInput();\" maxlength=\"3\"></td>\r\n\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">����Ƚ��</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"LIMIT_CNT\" type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"";
  private final static String _jspx_template33 = "\" onKeyDown=\"onlyNumberInput();\" maxlength=\"3\"></td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">Ư������</td>\r\n\t\t\t\t\t<td width=\"181\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"RATE\" type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"";
  private final static String _jspx_template34 = "\" onKeyDown=\"onlyNumberInput();\" maxlength=\"8\"></td>\r\n\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">Ư������ ����</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"RATE_CAUSE\" type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"";
  private final static String _jspx_template35 = "\" maxlength=\"50\"></td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t\r\n \t\t    </table></td>\r\n\t\t\t</tr>\r\n\t\t\t\r\n\t\t      <tr>\r\n\t\t        <td height=\"14\"></td>\r\n\t\t      </tr>\r\n\t\t\t\t\r\n\t\t<tr>\r\n\t\t\t<td><table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t     <tr>\r\n\t\t    \t<!-- \r\n\t\t        <td width=\"17%\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">����</td>\r\n\t\t        <td width=\"12%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">�ü�</td>\r\n\t\t        <td width=\"12%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">����</td>\r\n\t\t        <td width=\"17%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">�ΰ���ġ��</td>\r\n\t\t        <td width=\"17%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">���⳻�ݾ�</td>\r\n\t\t        <td width=\"17%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">�����ıݾ�</td>\r\n\t\t        -->\r\n\t\t         \r\n\t         \t<td width=\"25%\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">����</td>\r\n\t\t        <td width=\"25%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">�ΰ���ġ��</td>\r\n\t\t        <td width=\"25%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">���⳻�ݾ�</td>\r\n\t\t        <td width=\"25%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">�����ıݾ�</td>\r\n\t\t    </tr>\r\n\t\t     \r\n\t\t\t<tr>\r\n\t\t\t\t<!-- \r\n\t\t\t\t<td height=\"26\" align=\"center\"><input name=\"bugwa_bonse\" type=\"text\" value=\"";
  private final static String _jspx_template36 = "\" style=\"width:92%; text-align:right;\" class=\"readonly\" readonly></td>\r\n\t\t\t\t<td align=\"center\"><input name=\"SISE\" type=\"text\" value=\"\" class=\"input_form1\" style=\"width:90%; text-align:right;\" style=\"ime-mode:disabled\" onKeyDown=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);  comma_paste(this);\" onKeyPress=\"nr_num_int(this);\" maxlength=13></td>\r\n\t\t\t\t<td align=\"center\"><input name=\"GUSE\" type=\"text\" value=\"\" class=\"input_form1\" style=\"width:90%; text-align:right;\" style=\"ime-mode:disabled\" onKeyDown=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);  comma_paste(this);\" onKeyPress=\"nr_num_int(this);\" maxlength=13></td>\r\n\t\t\t\t<td align=\"center\"><input name=\"bugwa_vat\" type=\"text\" value=\"";
  private final static String _jspx_template37 = "\" class=\"readonly\" style=\"width:92%; text-align:right;\" readonly></td>\r\n\t\t\t\t<td align=\"center\"><input name=\"bugwa_intax\" type=\"text\" value=\"";
  private final static String _jspx_template38 = "\" class=\"readonly\" style=\"width:92%; text-align:right;\" readonly></td>\r\n\t\t\t\t<td align=\"center\"><input name=\"bugwa_overtax\" type=\"text\" value=\"\" class=\"readonly\" style=\"width:92%; text-align:right;\" readonly></td>\r\n\t\t\t\t -->\r\n\t\t\t\t<td height=\"26\" align=\"center\"><input name=\"bugwa_bonse\" type=\"text\" value=\"";
  private final static String _jspx_template39 = "\" style=\"width:92%; text-align:right;\" class=\"readonly\" readonly></td>\r\n\t\t\t\t<input name=\"SISE\" type=\"hidden\" value=\"\" class=\"input_form1\" style=\"width:90%; text-align:right;\" style=\"ime-mode:disabled\" onKeyDown=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);  comma_paste(this);\" onKeyPress=\"nr_num_int(this);\" maxlength=13>\r\n\t\t\t\t<input name=\"GUSE\" type=\"hidden\" value=\"\" class=\"input_form1\" style=\"width:90%; text-align:right;\" style=\"ime-mode:disabled\" onKeyDown=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);  comma_paste(this);\" onKeyPress=\"nr_num_int(this);\" maxlength=13>\r\n\t\t\t\t<td align=\"center\"><input name=\"bugwa_vat\" type=\"text\" value=\"";
  private final static String _jspx_template40 = "\" class=\"readonly\" style=\"width:92%; text-align:right;\" readonly></td>\r\n\t\t\t\t<td align=\"center\"><input name=\"bugwa_intax\" type=\"text\" value=\"";
  private final static String _jspx_template41 = "\" class=\"readonly\" style=\"width:92%; text-align:right;\" readonly></td>\r\n\t\t\t\t<td align=\"center\"><input name=\"bugwa_overtax\" type=\"text\" value=\"\" class=\"readonly\" style=\"width:92%; text-align:right;\" readonly></td>\r\n             </tr>\r\n\t\t\t</table></td>\r\n\t\t</tr>\r\n\r\n\t\t\t<tr>\r\n\t\t\t  <td height=\"40\" align=\"right\">\r\n\t\t\t  <table width=\"0\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"right\">\r\n\t\t\t\t<a href=\"javascript:Register()\"><img src=\"/img/save_icon2.gif\" alt=\"���\" width=\"56\" height=\"18\" border=\"0\"></a>\r\n\t\t\t  </table>\r\n\t\t\t  </td>\r\n\t\t\t</tr>\r\n\t\t\t\r\n\t\t</table></td>\r\n\t  </tr>\r\n\r\n</table>\r\n\r\n</body>\r\n</html>";
}
