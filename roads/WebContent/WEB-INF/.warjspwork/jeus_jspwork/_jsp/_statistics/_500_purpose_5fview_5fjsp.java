package jeus_jspwork._jsp._statistics;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_purpose_5fview_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(244,60);to=(244,64)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TYPE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template9);
      // jsp code [from=(244,79);to=(244,89)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PURPOSE_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(298,108);to=(298,116)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${fromDate}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(299,106);to=(299,112)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${toDate}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template16);
      // jsp code [from=(315,14);to=(315,18)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${type}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(346,195);to=(346,199)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TYPE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(346,214);to=(346,224)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PURPOSE_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      out.write(_jspx_template20);
      // jsp code [from=(498,43);to=(498,51)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${siguCode}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);

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
  private boolean _jspx_th_c_forEach_0_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:forEach ---- //
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = new org.apache.taglibs.standard.tag.rt.core.ForEachTag();
    _jspx_th_c_forEach_0.setPageContext(pageContext);
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${guCdList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("list");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template13);
            // jsp code [from=(308,30);to=(308,40)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.GU_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template14);
            // jsp code [from=(308,45);to=(308,55)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.GU_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template15);

          } while (_jspx_th_c_forEach_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
        }
        if (_jspx_th_c_forEach_0.doEndTag() == Tag.SKIP_PAGE)
          return true;
      } catch (Throwable t) {
        _jspx_th_c_forEach_0.doCatch(t);
      } finally {
        _jspx_th_c_forEach_0.doFinally();
      }
    } finally {
      _jspx_th_c_forEach_0.release();
    }
    return false;
  }

  private final static String _jspx_template0 = "\r\n";
  private final static String _jspx_template1 = "\r\n";
  private final static String _jspx_template2 = "  \r\n";
  private final static String _jspx_template3 = "  \r\n";
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "\r\n";
  private final static String _jspx_template6 = "\r\n";
  private final static String _jspx_template7 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script language=\"javascript\" src=\"/js/common.js\"></script> \r\n<script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script>\r\n<script language=\"javascript\" src=\"/js/Check_inputbox.js\"></script>\r\n<script language=\"javascript\" src=\"/jsp/RexServer/rexscript/rexpert.js\"></script>\r\n<script language=\"javascript\" src=\"/jsp/RexServer/rexscript/rexpert_properties.js\"></script>\r\n<script language=\"javascript\">\r\n\tfunction DisplayMenu(index) \r\n\t{\r\n        for (i=1; i<=2; i++)\r\n        \tif (index == i) \r\n        \t{\r\n        \t\tthisMenu = eval(\"menu\" + index + \".style\");\r\n        \t\tthisMenu.display = \"\";\r\n        \t} \r\n        \telse \r\n        \t{\r\n        \t\totherMenu = eval(\"menu\" + i + \".style\"); \r\n        \t\totherMenu.display = \"none\"; \r\n\t\t\t}\r\n\t}\r\n\t\r\n\tfunction fnPreView()\r\n\t{\t\r\n\t\tvar oRptMainParam;\r\n\t\toRptMainParam = rex_GetgoDictionay(); \r\n\r\n\t\t// 필수 - 레포트명\r\n\t\toRptMainParam.put(\"rex_rptname\", \"purpose_view\");\r\n\r\n\t\t// 필수 - 데이터 타입 설정\r\n\t\toRptMainParam.put(\"rex_datatype\", \"XML\");  // XML, CSV\r\n\r\n\t\t// 옵션 - 다른 DB를 연결시\r\n\t\toRptMainParam.put(\"rex_userservice\", \"oracle_jndi\");\r\n\r\n\t\t// 옵션 - 파라메터 설정\r\n\t\tvar fromDate = document.form.fromDate.value;\r\n\t\tvar toDate = document.form.toDate.value;\r\n\t\tvar siguCd = document.form.guCd.value;\r\n\t\tvar type   = document.form.type.value;\r\n\t\tvar section = document.form.SECTION.value;\r\n\t\tvar tax_yn = document.form.TAX_YN.value;\r\n\t\tvar purposeCd = IFRM_PurposeCode.PURPOSE_CD.value;\r\n\t\tvar classCd = \"\";\r\n\t\tvar sortCd  = \"\";\r\n\t\tvar kindCd = \"\";\r\n\r\n\t\tvar all=\"\";\r\n\r\n\t\tif(IFRM_PurposeCode.PURPOSE1.selectedIndex != -1){\r\n\t\t\tall = IFRM_PurposeCode.PURPOSE1.options[IFRM_PurposeCode.PURPOSE1.selectedIndex].innerHTML;\r\n\t\t}\r\n\r\n\t\t\r\n\t\tif(all != '::선택::' && all != '')\r\n\t\t{\t\r\n\t\t\tclassCd = purposeCd.substr(0,1);\r\n\t\t\tsortCd  = purposeCd.substr(1,1);\r\n\t\t\tkindCd = purposeCd.substr(2,1);\r\n\t\t\t\r\n\t\t\tif(sortCd == '0')\r\n\t\t\t\tsortCd = \"%\";\r\n\t\t\tif(kindCd == '0')\r\n\t\t\t\tkindCd = \"%\";\r\n\t\t\t\r\n\t\t}else{\r\n\t\t\tclassCd = \"%\";\r\n\t\t\tsortCd = \"%\";\r\n\t\t\tkindCd = \"%\";\r\n\t\t}\r\n\t\t\r\n\t\tfromDate = nr_Date_Cut(fromDate);\t\r\n\t\ttoDate   = nr_Date_Cut(toDate);\r\n\r\n\t\tif(siguCd == '0000000')\r\n\t\t\tsiguCd = '';\r\n\r\n\t\toRptMainParam.put(\"FROM_DATE\", fromDate);\r\n\t\toRptMainParam.put(\"TO_DATE\", toDate);\r\n\t\toRptMainParam.put(\"SIGU_CD\", siguCd);\r\n\t\toRptMainParam.put(\"TYPE\", type);\r\n\t\toRptMainParam.put(\"SECTION\", section);\r\n\t\toRptMainParam.put(\"TAX_YN\", tax_yn);\r\n\t\toRptMainParam.put(\"CLASS_CD\", classCd);\r\n\t\toRptMainParam.put(\"SORT_CD\", sortCd);\r\n\t\toRptMainParam.put(\"KIND_CD\", kindCd);\r\n\r\n\t\t//alert(\":fromDate:\"+fromDate+\":toDate:\"+toDate+\":siguCd:\"+siguCd+\":type:\"+type+\":section:\"+section+\":tax_yn:\"+tax_yn+\":classCd:\"+classCd+\":sortCd:\"+sortCd+\":kindCd:\"+kindCd+\"::\");\r\n\t\t\r\n\t\t\r\n\t\toRptMainParam.put(\"rex_init\", \"ToolBarVisible=1;ShowProcessDialog=0\");\r\n\t\toRptMainParam.put(\"rex_open_window\", \"center=no,scrollbars=no,status=no,toolbar=no,resizable=0,location=no,menu=no,width=100%,height=600\");\r\n\t\t\r\n\t\treturn oRptMainParam;\r\n\t\t\t\t\r\n\t}\r\n\t\r\n\tfunction fnPreView_gp()\r\n\t{\t\r\n\t\tvar oRptMainParam;\r\n\t\toRptMainParam = rex_GetgoDictionay(); \r\n\r\n\t\t// 필수 - 레포트명\r\n\t\toRptMainParam.put(\"rex_rptname\", \"purpose_gp\");\r\n\r\n\t\t// 필수 - 데이터 타입 설정\r\n\t\toRptMainParam.put(\"rex_datatype\", \"XML\");  // XML, CSV\r\n\r\n\t\t// 옵션 - 다른 DB를 연결시\r\n\t\toRptMainParam.put(\"rex_userservice\", \"oracle_jndi\");\r\n\r\n\t\t// 옵션 - 파라메터 설정\r\n\t\tvar fromDate = document.form.fromDate.value;\r\n\t\tvar toDate = document.form.toDate.value;\r\n\t\tvar siguCd = document.form.guCd.value;\r\n\t\tvar type   = document.form.type.value;\r\n\t\tvar purposeCd = IFRM_PurposeCode.PURPOSE_CD.value;\r\n\t\tvar classCd = \"\";\r\n\t\tvar sortCd  = \"\";\r\n\t\tvar kindCd = \"\";\r\n\r\n\r\n\t\t\r\n\t\tif(purposeCd != '000')\r\n\t\t{\t\r\n\t\t\tclassCd = purposeCd.substr(0,1);\r\n\t\t\tsortCd  = purposeCd.substr(1,1);";
  private final static String _jspx_template8 = "\r\n\t\t\t\r\n\t\t\tif(sortCd == '0')\r\n\t\t\t\tsortCd = \"\";\r\n\t\t}\r\n\t\t\r\n\t\tfromDate = nr_Date_Cut(fromDate);\t\r\n\t\ttoDate   = nr_Date_Cut(toDate);\r\n\r\n\t\toRptMainParam.put(\"FROM_DATE\", fromDate);\r\n\t\toRptMainParam.put(\"TO_DATE\", toDate);\r\n\t\toRptMainParam.put(\"SIGU_CD\", siguCd);\r\n\t\toRptMainParam.put(\"TYPE\", type);\r\n\t\toRptMainParam.put(\"CLASS_CD\", classCd);\r\n\t\toRptMainParam.put(\"SORT_CD\", sortCd);\r\n\t\t\r\n\t\toRptMainParam.put(\"rex_init\", \"ToolBarVisible=1;ShowProcessDialog=0\");\r\n\t\toRptMainParam.put(\"rex_open_window\", \"center=no,scrollbars=no,status=no,toolbar=no,resizable=0,location=no,menu=no,width=100%,height=600\");\r\n\t\toRptMainParam.put(\"rex_openreport_end\", \"javaOpenReportEndFunction\");\r\n\t\t// javaOpenReportEndFunction 실행함 (인자는 oReport)\r\n\t\t\r\n\t\treturn oRptMainParam;\r\n\t}\r\n\t\r\n\tfunction fn_search()\r\n\t{\t\r\n\t\trex_gfRexRptOpen(\"iframepush\", ifrmRexPreview, fnPreView());\r\n\t\t//rex_gfRexRptOpen(\"iframepush\", ifrmRexPreview_gp, fnPreView_gp());\r\n\t\trex_gfRexRptOpen(\"iframeall\", \"\", \"\");\t\t\r\n\t}\r\n\t\r\n\t// rex_openreport_end 정의시 실행되는 프로시져\r\n\tfunction javaOpenReportEndFunction(oReport) {\r\n\t\t\r\n\t\tvar oTeeChart = null;\r\n\r\n\t\ttry\r\n\t\t{\t\r\n\t\t\toTeeChart = oReport.OpenChart(\"chart3\").GetChart();\r\n\t\t}\r\n\t\tcatch(e)\r\n\t\t{\r\n\t\t\talert(\"챠트를 찾을 수 없습니다.\");\r\n\t\t\treturn;\r\n\t\t}\r\n\r\n\t\t//////////////////////////////////////////////////////////////\r\n\t\t//  * 챠트 종류\r\n\t\t//\r\n\t\t//\tscLine = 0;\r\n\t\t//\tscBar = 1;\r\n\t\t//\tscHorizBar = 2;\r\n\t\t//\tscArea = 3;\r\n\t\t//\tscPoint = 4;\r\n\t\t//\tscPie = 5;\r\n\t\t//\tscFastLine = 6;\r\n\t\t//\tscShape = 7;\r\n\t\t//\tscGantt = 8;\r\n\t\t//\tscBubble = 9;\r\n\t\t//\tscArrow = 10;\r\n\t\t//\tscCandle = 11;\r\n\t\t//\tscPolar = 12;\r\n\t\t//\tscSurface = 13;\r\n\t\t//\tscVolume = 14;\r\n\t\t//\tscErrorBar = 15;\r\n\t\t//\tscBezier = 16;\r\n\t\t//\tscContour = 17;\r\n\t\t//\tscError = 18;\r\n\t\t//\tscPoint3D = 19;\r\n\t\t//\tscRadar = 20;\r\n\t\t//\tscClock = 21;\r\n\t\t//\tscWindRose = 22;\r\n\t\t//\tscBar3D = 23;\r\n\t\t//\tscImageBar = 24;\r\n\t\t//////////////////////////////////////////////////////////////\r\n\t\t\r\n\t\toTeeChart.ChangeSeriesType(1, form.gpType.value);\r\n\t\t\r\n\t\t//////////////////////////////////////////////////////////////\r\n\t\t//  * 바챠트에서 사용할 수 있는 타입\r\n\t\t//\r\n\t\t//\tbsRectangle = 0\r\n\t\t//\tbsPyramid = 1\r\n\t\t//\tbsInvPyramid = 2\r\n\t\t//\tbsCilinder = 3\r\n\t\t//\tbsEllipse = 4\r\n\t\t//\tbsArrow = 5\r\n\t\t//\tbsRectangleGradient = 6\r\n\t\t////////////////////////////////////////////////////////////// \r\n\t\t//oTeeChart.Series(0).asBar.BarStyle = 0;\r\n\t}\r\n\t\r\n\t// 점용 종류 선택시 점용 목적 코드 나오게 함.\r\n\tfunction\tSelect_UseType(sel)\r\n\t{\t\r\n\t\tdocument.getElementById(\"IFRM_PurposeCode\").src=\"/jsp/common/purposeCode/purposeCode4.jsp?SectionCode=\"+sel.value;\r\n\r\n//\t\t/jsp/common/purposeCode/purposeCode2.jsp?SectionCode=";
  private final static String _jspx_template9 = "&PURPOSE_CD=";
  private final static String _jspx_template10 = "\r\n\t}\r\n\t\r\n\tfunction init()\r\n\t{\t\r\n\t\tif(document.getElementById(\"guCd\").value == \"\")\t\r\n\t\t\tdocument.getElementById(\"guCd\").disabled = false;\r\n\r\n\t\tfn_search();\r\n\r\n\t\t\r\n\t}\t\r\n\r\n</script>\r\n\r\n<body onload=\"init();\">\r\n<form id=\"form\" name=\"form\" method=\"post\">\r\n<table width=\"800\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t<tr>\r\n\t\t<td height=\"43\"><img src=\"/img/sub4_cont1_title.gif\" width=\"800\" height=\"43\"></td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td align=\"left\">\r\n\t\t<table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"1\" bgcolor=\"eaeaea\"></td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"14\"></td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td>\r\n\t\t\t\t<table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"22\" background=\"/img/tab_line_blue.gif\">\r\n\t\t\t\t\t\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td><img src=\"/img/sub_stat_title1.gif\" alt=\"통계설정\"\r\n\t\t\t\t\t\t\t\t\twidth=\"110\" height=\"22\"></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td align=\"left\" class=\"contborder_blue\">\r\n\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\"\r\n\t\t\t\t\t\t\t\t\tstyle=\"border-collapse:collapse;\" cellpadding=\"0\"\r\n\t\t\t\t\t\t\t\t\tcellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t  \t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">부과일자</td>\r\n\t\t\t\t\t\t\t\t  \t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t<input id=\"fromDate\" name=\"fromDate\" type=\"text\" class=\"input_form1\" style=\"width:70px\" value=\"";
  private final static String _jspx_template11 = "\"><a><img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" align=\"absmiddle\" onclick=\"popUpCalendar(this, document.getElementById('fromDate'), 'yyyymmdd')\" style=\"vertical-align:middle;CURSOR: pointer;\"></a>\r\n\t\t\t\t\t\t\t\t\t\t~ <input id=\"toDate\" name=\"toDate\" type=\"text\" class=\"input_form1\" style=\"width:70px\" value=\"";
  private final static String _jspx_template12 = "\"><a><img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" align=\"absmiddle\" onclick=\"popUpCalendar(this, document.getElementById('toDate'), 'yyyymmdd')\" style=\"vertical-align:middle;CURSOR: pointer;\"></a>\r\n\t\t\t\t\t\t\t\t  \t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\t\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"15%\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\"\r\n\t\t\t\t\t\t\t\t\t\t\tclass=\"sub_table_b\">시군구별</td>\r\n\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t<select id=\"guCd\" name=\"guCd\" class=\"related\" style=\"width:100px\">\r\n\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template13 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"";
  private final static String _jspx_template14 = "\">";
  private final static String _jspx_template15 = "</option>\r\n\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template16 = "\t\r\n\t\t\t\t\t\t\t\t\t\t</select></td>\r\n\t\t\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\"\r\n\t\t\t\t\t\t\t\t\t\t\tclass=\"sub_table_b\">점용종류</td>\r\n\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t<select id=\"type\" name=\"type\" class=\"related\" style=\"width:100px\" OnChange=\"javascript:Select_UseType(this);\">\r\n\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template17 = " \r\n\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"15%\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\"\r\n\t\t\t\t\t\t\t\t\t\t\tclass=\"sub_table_b\">점용구분</td>\r\n\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t<select id=\"SECTION\" name=\"SECTION\" class=\"related\" style=\"width:100px\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"\">::전체::</option>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"1\">계속</option>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"3\">무단</option>\r\n\t\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"15%\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\"\r\n\t\t\t\t\t\t\t\t\t\t\tclass=\"sub_table_b\">부과여부</td>\r\n\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t<select id=\"TAX_YN\" name=\"TAX_YN\" class=\"related\" style=\"width:100px\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"\">::전체::</option>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"0\">미부과</option>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"1\">부과</option>\r\n\t\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t    \t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td height=\"30\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용목적</td>\r\n\t\t\t\t\t\t\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr><td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<iframe id=\"IFRM_PurposeCode\" align=\"absmiddle\" scrolling=\"no\" frameborder=\"0\" framespacing=\"0\" width=\"100%\" height=\"25\" src=\"/jsp/common/purposeCode/purposeCode4.jsp?SectionCode=";
  private final static String _jspx_template18 = "&PURPOSE_CD=";
  private final static String _jspx_template19 = "\"></iframe>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</td></tr>\r\n\t\t\t\t\t\t\t\t\t\t  \t</table>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t                </tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"40\" align=\"right\"><a href=\"javascript:fn_search();\"><img\r\n\t\t\t\t\t\t\t\t\tsrc=\"/img/search_icon.gif\" alt=\"검색\" width=\"56\" height=\"18\" onclick=\"DisplayMenu(1);\"\r\n\t\t\t\t\t\t\t\t\tborder=\"0\"></a></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\r\n\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"30\"></td>\r\n\t\t\t</tr>\r\n\r\n\t\t\t<tr>\r\n\t\t\t\t<td>\r\n\t\t\t\t<div id=\"menu1\" style=\"display:;\">\r\n\t\t\t\t<table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"22\" background=\"/img/tab_line_purple.gif\">\r\n\t\t\t\t\t\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td onClick=\"DisplayMenu(1)\" width=\"111\"><a href=\"#\"><img\r\n\t\t\t\t\t\t\t\t\tsrc=\"/img/sub_stat_title2_on.gif\" alt=\"통계 결과\" width=\"110\"\r\n\t\t\t\t\t\t\t\t\theight=\"22\" border=\"0\"></a></td>\r\n<!--\t\t\t\t\t\t\t\t<td onClick=\"DisplayMenu(2)\" ><a href=\"#\"><img-->\r\n<!--\t\t\t\t\t\t\t\t\tsrc=\"/img/sub_stat_title3_off.gif\" alt=\"통계 그래프\" width=\"110\"-->\r\n<!--\t\t\t\t\t\t\t\t\theight=\"22\" border=\"0\"></a></td>-->\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td align=\"center\" class=\"contborder_purple\">\r\n\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\"\r\n\t\t\t\t\t\t\t\t\tstyle=\"border-collapse:collapse;\" cellpadding=\"0\"\r\n\t\t\t\t\t\t\t\t\tcellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td>\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t<iframe id=\"ifrmRexPreview\" width=\"100%\" height=\"350\" scrolling=\"no\" frameborder=0></iframe>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t</table>\r\n\t\t\t\t</div>\r\n\t\t\t\t</td>\r\n\t\t\t\t\r\n\t\t\t</tr>\r\n\r\n\t\t\t<tr>\r\n\t\t\t\t<td>\r\n\t\t\t\t<div id=\"menu2\" style=\"display:none;\">\r\n\t\t\t\t<table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"22\" background=\"/img/tab_line_purple.gif\">\r\n\t\t\t\t\t\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td onClick=\"DisplayMenu(1)\" width=\"111\"><a href=\"#\"><img\r\n\t\t\t\t\t\t\t\t\tsrc=\"/img/sub_stat_title2_off.gif\" alt=\"통계 결과\" width=\"110\"\r\n\t\t\t\t\t\t\t\t\theight=\"22\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t\t\t<td onClick=\"DisplayMenu(2)\" ><a href=\"#\"><img\r\n\t\t\t\t\t\t\t\t\tsrc=\"/img/sub_stat_title3_on.gif\" alt=\"통계 그래프\" width=\"110\"\r\n\t\t\t\t\t\t\t\t\theight=\"22\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t\t\t<td width=2></td>\t\r\n\t\t\t\t\t\t\t\t<td align=\"right\">\r\n\t\t\t\t\t\t\t\t<select id=\"gpType\" id=\"gpType\" name=\"gpType\" class=\"related\" style=\"width:120px\" onchange=\"fn_search();\">\r\n\t\t\t\t\t\t\t\t\t<option value=0>Line</option>\r\n\t\t\t\t\t\t\t\t\t<option value=1>Bar</option>\r\n\t\t\t\t\t\t\t\t\t<option value=2>HorizBar</option>\r\n\t\t\t\t\t\t\t\t\t<option value=3>Area</option>\r\n\t\t\t\t\t\t\t\t\t<option value=4>Point</option>\r\n\t\t\t\t\t\t\t\t\t<option value=5>Pie</option>\r\n\t\t\t\t\t\t\t\t\t<option value=6>FastLine</option>\r\n\t\t\t\t\t\t\t\t\t<option value=7>Shape</option>\r\n\t\t\t\t\t\t\t\t\t<option value=8>Gantt</option>\r\n\t\t\t\t\t\t\t\t\t<option value=9>Bubble</option>\r\n\t\t\t\t\t\t\t\t\t<option value=0>Arrow</option>\r\n\t\t\t\t\t\t\t\t\t<option value=11>Candle</option>\r\n\t\t\t\t\t\t\t\t\t<option value=12>Polar</option>\r\n\t\t\t\t\t\t\t\t\t<option value=13>Surface</option>\r\n\t\t\t\t\t\t\t\t\t<option value=14>Volume</option>\r\n\t\t\t\t\t\t\t\t\t<option value=15>ErrorBar</option>\r\n\t\t\t\t\t\t\t\t\t<option value=16>Bezier</option>\r\n\t\t\t\t\t\t\t\t\t<option value=17>Contour</option>\r\n\t\t\t\t\t\t\t\t\t<option value=18>Error</option>\r\n\t\t\t\t\t\t\t\t\t<option value=19>Point3D</option>\r\n\t\t\t\t\t\t\t\t\t<option value=20>Radar</option>\r\n\t\t\t\t\t\t\t\t\t<option value=21>Clock</option>\r\n\t\t\t\t\t\t\t\t\t<option value=22>WindRose</option>\r\n\t\t\t\t\t\t\t\t\t<option value=23>Bar3D</option>\r\n\t\t\t\t\t\t\t\t\t<option value=24>ImageBar</option>\r\n\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t</td>\t\t\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td align=\"center\" class=\"contborder_purple\">\r\n\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\"\r\n\t\t\t\t\t\t\t\t\tstyle=\"border-collapse:collapse;\" cellpadding=\"0\"\r\n\t\t\t\t\t\t\t\t\tcellspacing=";
  private final static String _jspx_template20 = "\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td>\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t<iframe id=\"ifrmRexPreview_gp\" width=\"100%\" height=\"350\" scrolling=\"no\" frameborder=0></iframe>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\t\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"40\" align=\"right\"><a href=\"#\"><img\r\n\t\t\t\t\t\t\tsrc=\"/img/graph_icon.gif\" alt=\"그래프 출력\" width=\"84\" height=\"22\"\r\n\t\t\t\t\t\t\tborder=\"0\"></a></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t</table>\r\n\t\t\t\t</div>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t</table>\r\n\t\t\r\n\t\t</td>\r\n\t</tr>\r\n\r\n</table>\r\n<script language=\"javascript\">\r\n<!--\r\n\tsetSelectedOption(document.form.guCd, \"";
  private final static String _jspx_template21 = "\");\r\n//-->\r\n</script> \r\n</form>\r\n</body>\r\n</html>\r\n\r\n";
}
