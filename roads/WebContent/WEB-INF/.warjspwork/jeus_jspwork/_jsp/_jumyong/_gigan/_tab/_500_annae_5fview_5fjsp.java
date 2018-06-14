package jeus_jspwork._jsp._jumyong._gigan._tab;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_annae_5fview_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      out.write(_jspx_template10);
      // jsp code [from=(234,61);to=(234,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(235,51);to=(235,54)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(237,57);to=(237,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GIGAN1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(238,57);to=(238,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GIGAN2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(239,65);to=(239,74)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PURPOSECD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(240,57);to=(240,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${BONBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(241,55);to=(241,60)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${BUBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(242,53);to=(242,57)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(243,59);to=(243,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMINNO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(244,53);to=(244,57)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TYPE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(245,59);to=(245,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(246,63);to=(246,72)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${OWNER_SET}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(247,59);to=(247,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TAX_SET}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(248,55);to=(248,60)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${BJ_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // jsp code [from=(249,55);to=(249,60)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${HJ_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);
      // jsp code [from=(250,53);to=(250,58)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GU_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template26);
      // jsp code [from=(251,53);to=(251,57)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${guCd}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // jsp code [from=(254,67);to=(254,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template28);
      // jsp code [from=(290,145);to=(290,152)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MANAGER}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template29);
      // jsp code [from=(292,136);to=(292,139)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TEL}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template30);
      // jsp code [from=(305,138);to=(305,143)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GU_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template31);
      // jsp code [from=(305,147);to=(305,154)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${DEPT_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template32);

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
  private final static String _jspx_template7 = "\r\n";
  private final static String _jspx_template8 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('사용자의 사용시간이 종료되었습니다. 다시 접속 해주시기 바랍니다.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template9 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n}\r\n-->\r\n\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script language=\"javascript\" src=\"/jsp/RexServer/rexscript/rexpert.js\"></script>\r\n<script language=\"javascript\" src=\"/jsp/RexServer/rexscript/rexpert_properties.js\"></script>\r\n<script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script>\r\n<script language=\"javascript\" src=\"/js/Check_inputbox.js\"></script>\r\n\r\n<script type=\"text/javascript\">\r\n//<![CDATA[\r\n          \r\n\tfunction \tInit()\r\n\t{\r\n\t\tparent.TabDown_Img(\"annae\");\r\n\r\n\t\tvar\tadminno\t= document.getElementById(\"ADMIN_NO\").value;\r\n\t\tvar\tseq\t\t= document.getElementById(\"SEQ\").value;\r\n\r\n\t//\talert(adminno + \" , \" + seq);\r\n\t\r\n\t//\tif(seq != \"\")\r\n\t//\t\tView(adminno, seq);\r\n\t}\r\n\r\n\tfunction submitPrint()\r\n\t{\r\n\t\tvar form \t= document.forms[0];\r\n\t\tvar\tstr\t\t= \"\";\r\n\t\t\t\r\n\t\t//\t민원등록\r\n\t\tif(form.YEAR.value.length < 1 )\r\n\t\t{\r\n\t\t\tstr\t+= \"통보년월을 입력하세요\\n\";\r\n\t\t\tform.YEAR.focus();\r\n\t\t}\r\n\t\telse if(form.MONTH.value.length\t< 1 || Number(form.MONTH.value) > 12 || Number(form.MONTH.value) < 1)\r\n\t\t{\r\n\t\t\tstr\t+= \"통보년월을 입력하세요\\n\";\r\n\t\t\tform.MONTH.focus();\r\n\t\t}\r\n\t\telse if(form.FROMDATE.value.length\t< 1)\r\n\t\t{\r\n\t\t\tstr\t+= \"신청 시작일을 입력하세요\\n\";\r\n\t\t}\r\n\t\telse if(form.TODATE.value.length\t< 1)\r\n\t\t{\r\n\t\t\tstr\t+= \"신청 종료일을 입력하세요\\n\";\t\r\n\t\t\tform.TODATE.focus();\t\r\n\t\t}\r\n\t\telse if(form.MANAGER.value.length\t< 1)\r\n\t\t{\r\n\t\t\tstr\t+= \"담당자를 입력하세요\\n\";\r\n\t\t\tform.MANAGER.focus();\r\n\t\t}\r\n\t\telse if(form.TEL.value.length\t< 1)\r\n\t\t{\r\n\t\t\tstr\t+= \"연락처를 입력하세요\\n\";\r\n\t\t\tform.TEL.focus();\r\n\t\t}\r\n\t\telse if(form.ENDDATE.value.length\t< 1)\r\n\t\t{\r\n\t\t\tstr\t+= \"만료일자를 입력하세요\\n\";\r\n\t\t\tform.ENDDATE.focus();\r\n\t\t}\r\n\t\telse if(form.DEPT.value.length\t< 1)\r\n\t\t{\r\n\t\t\tstr\t+= \"신청장소를 입력하세요\\n\";\r\n\t\t\tform.DEPT.focus();\r\n\t\t}\r\n\t\t\t\t\r\n\t\tif(str\t!= \"\")\r\n\t\t{\r\n\t\t\talert(str);\r\n\t\t\treturn\tfalse;\r\n\t\t}\r\n\t\treturn true;\r\n\t}\r\n\r\n\tfunction fnPreView()\r\n\t{\r\n\t\tif(!submitPrint()) return;\r\n\r\n\t\tvar purpose_cd = document.getElementById(\"PURPOSE_CD\").value;\r\n\r\n\t\tvar str1 = \"\";\r\n\t\tvar str2 = \"\";\r\n\t\tvar str3 = \"\";\r\n\t\t\r\n\t\tif(purpose_cd.length>1){\r\n\t\t\tstr1 = purpose_cd.substring(0,1);\r\n\t\t\tstr2 = purpose_cd.substring(1,2);\r\n\t\t\tstr3 = purpose_cd.substring(2,3);\r\n\t\t}\r\n\r\n\t\tif(purpose_cd == \"\" || purpose_cd == null){\r\n\t\t\tpurpose_cd = \"%\";\r\n\t\t}else if(str3==\"0\"){\r\n\t\t\tif(str2==\"0\"){\r\n\t\t\t\tpurpose_cd = str1+\"%\";\r\n\t\t\t}else{\r\n\t\t\t\tpurpose_cd = str1+str2+\"%\";\r\n\t\t\t}\r\n\t\t}\r\n\t\t\t\r\n\t\tvar oRptMainParam;\r\n\t\toRptMainParam = rex_GetgoDictionay(); \r\n\r\n\t\t// 필수 - 레포트명\r\n\t\toRptMainParam.put(\"rex_rptname\", \"annae_all\");\r\n\r\n\t\t// 필수 - 데이터 타입 설정\r\n\t\toRptMainParam.put(\"rex_datatype\", \"XML\");  // XML, CSV\r\n\r\n\t\t// 옵션 - 다른 DB를 연결시\r\n\t\toRptMainParam.put(\"rex_userservice\", \"oracle_jndi\");\r\n\r\n\t\t// 옵션 - 파라메터 설정\r\n\t\tvar form \t= document.forms[0];\r\n\t\t\r\n\t\tvar type \t\t= form.TYPE.value;\r\n\t\tvar section\t\t= form.SECTION.value;\r\n\t\tvar ownerSet \t= form.OWNER_SET.value;\r\n\t\tvar taxSet \t\t= form.TAX_SET.value;\r\n\t\tvar bjCd\t\t= form.BJ_CD.value;\r\n\t\tvar hjCd\t\t= form.HJ_CD.value;\r\n\t\tvar bonbun\t\t= form.BONBUN.value;\r\n\t\tvar bubun\t\t= form.BUBUN.value;\r\n\t\tvar name\t\t= form.NAME.value;\r\n\t\tvar adminNo\t\t= form.ADMIN_NO.value;\r\n\r\n\t\tif(type == \"\")\r\n    \t\ttype='%';\r\n\t\tif(section == \"\")\r\n\t\t\tsection='%';\r\n    \tif(ownerSet == \"\")\r\n    \t\townerSet='%';\r\n    \tif(taxSet == \"\")\r\n    \t\ttaxSet='%';\r\n    \tif(purpose_cd == \"000\"\t||\tpurpose_cd == \"\")\r\n    \t\tpurpose_cd\t= '%';\r\n\r\n    \tif(bjCd == \"\")\r\n    \t\tbjCd='%';\r\n    \tif(hjCd == \"\")\r\n    \t\thjCd='%';\r\n    \t\r\n    \tif(bonbun == \"\"\t||\tbonbun == \"%\")\r\n    \t\tbonbun\t= '%';\r\n    \telse\r\n    \t\tbonbun = '%' + bonbun + '%';\r\n    \t\r\n    \tif(bubun == \"\"\t||\tbubun == \"%\")\r\n    \t\tbubun\t= '%';\r\n    \telse\r\n    \t\tbubun = '%' + bubun + '%';\r\n    \t\r\n    \tif(name == \"\"\t||\tname == \"%\")\r\n    \t\tname\t= '%';\r\n    \telse\r\n    \t\tname = '%' + name + '%';\r\n    \t\r\n    \tif(adminNo == \"\"\t||\tadminNo == \"%\")\r\n    \t\tadminNo\t= '%';\r\n    \telse\r\n    \t\tadminNo = '%' + adminNo + '%';\r\n    \t\r\n\t\talert(\"";
  private final static String _jspx_template10 = "일괄 처리 건수가 많으면 약간의 시간이 걸릴수 있습니다.\");\r\n\t\t\r\n\t\toRptMainParam.put(\"TYPE\" ,type);\r\n\t\toRptMainParam.put(\"SECTION\" ,section);\r\n\t\toRptMainParam.put(\"OWNER_SET\" ,ownerSet);\r\n\t\toRptMainParam.put(\"TAX_SET\" ,taxSet);\r\n\t\toRptMainParam.put(\"PURPOSE_CD\" ,purpose_cd);\t\r\n\t\toRptMainParam.put(\"BJ_CD\" ,bjCd);\r\n\t\toRptMainParam.put(\"HJ_CD\" ,hjCd);\r\n\t\toRptMainParam.put(\"BONBUN\" ,bonbun);\r\n\t\toRptMainParam.put(\"BUBUN\" ,bubun);\r\n\t\toRptMainParam.put(\"NAME\" ,name);\r\n\t\toRptMainParam.put(\"ADMIN_NO\" ,adminNo);\r\n\t\toRptMainParam.put(\"GIGAN1\" ,form.GIGAN1.value);\r\n\t\toRptMainParam.put(\"GIGAN2\" ,form.GIGAN2.value);\r\n\r\n\t\toRptMainParam.put(\"YEAR\" ,form.YEAR.value);\t\t\t\t//부과 년\r\n\t\toRptMainParam.put(\"MONTH\" ,form.MONTH.value);\t\t\t//부과 월\r\n\t\toRptMainParam.put(\"FROMDATE\" ,form.FROMDATE.value);\t\t//기간연장 시작\r\n\t\toRptMainParam.put(\"TODATE\" ,form.TODATE.value);\t\t\t//기간연장 종료\r\n\t\toRptMainParam.put(\"MANAGER\" ,form.MANAGER.value);\r\n\t\toRptMainParam.put(\"TEL\" ,form.TEL.value);\r\n\t\toRptMainParam.put(\"ENDDATE\" ,form.ENDDATE.value);\t\t//만료일자\r\n\t\toRptMainParam.put(\"DEPT\" ,form.DEPT.value);\t\t\t\t//신청장소\r\n\t\toRptMainParam.put(\"NOTES\" ,form.NOTES.value);\t\t\t//비고\r\n\t\toRptMainParam.put(\"GU_NM\" ,form.guNm.value);\r\n\t\toRptMainParam.put(\"SIGUNGU\" ,form.guCd.value);\r\n\t\t\r\n\t\t// preview 팝업 열기\r\n\t\trex_gfRexRptOpen(\"popup\", oRptMainParam);\r\n\t\t\t\r\n\t\treturn oRptMainParam;\t\t\t\r\n\t}\r\n\t\r\n\tfunction year_keyup()\r\n\t{\t\r\n\t\tvar form = document.form;\r\n\t\t\r\n\t\tif(form.YEAR.value.length == 4)\r\n\t\t\tform.MONTH.focus();\r\n\t}\r\n\t\t\r\n//]]>\r\n</script>\r\n\r\n<body onload=\"Init();\">\r\n<form id=\"form\" name=\"form\" method=\"post\">\r\n<input type=\"hidden\" id=\"ADMIN_NO\" name=\"ADMIN_NO\" value=\"";
  private final static String _jspx_template11 = "\">\r\n<input type=\"hidden\" id=\"SEQ\" name=\"SEQ\" value=\"";
  private final static String _jspx_template12 = "\">\r\n\r\n<input type=\"hidden\" id=\"GIGAN1\" name=\"GIGAN1\" value=\"";
  private final static String _jspx_template13 = "\">\r\n<input type=\"hidden\" id=\"GIGAN2\" name=\"GIGAN2\" value=\"";
  private final static String _jspx_template14 = "\">\r\n<input type=\"hidden\" id=\"PURPOSE_CD\" name=\"PURPOSE_CD\" value=\"";
  private final static String _jspx_template15 = "\">\r\n<input type=\"hidden\" id=\"BONBUN\" name=\"BONBUN\" value=\"";
  private final static String _jspx_template16 = "\">\r\n<input type=\"hidden\" id=\"BUBUN\" name=\"BUBUN\" value=\"";
  private final static String _jspx_template17 = "\">\r\n<input type=\"hidden\" id=\"NAME\" name=\"NAME\" value=\"";
  private final static String _jspx_template18 = "\">\r\n<input type=\"hidden\" id=\"ADMINNO\" name=\"ADMINNO\" value=\"";
  private final static String _jspx_template19 = "\">\r\n<input type=\"hidden\" id=\"TYPE\" name=\"TYPE\" value=\"";
  private final static String _jspx_template20 = "\">\r\n<input type=\"hidden\" id=\"SECTION\" name=\"SECTION\" value=\"";
  private final static String _jspx_template21 = "\">\r\n<input type=\"hidden\" id=\"OWNER_SET\" name=\"OWNER_SET\" value=\"";
  private final static String _jspx_template22 = "\">\r\n<input type=\"hidden\" id=\"TAX_SET\" name=\"TAX_SET\" value=\"";
  private final static String _jspx_template23 = "\">\r\n<input type=\"hidden\" id=\"BJ_CD\" name=\"BJ_CD\" value=\"";
  private final static String _jspx_template24 = "\">\r\n<input type=\"hidden\" id=\"HJ_CD\" name=\"HJ_CD\" value=\"";
  private final static String _jspx_template25 = "\">\r\n<input type=\"hidden\" id=\"guNm\" name=\"guNm\" value=\"";
  private final static String _jspx_template26 = "\">\r\n<input type=\"hidden\" id=\"guCd\" name=\"guCd\" value=\"";
  private final static String _jspx_template27 = "\">\r\n\r\n\r\n<input type=\"hidden\" id=\"currentPage\" name=\"currentPage\" value=\"";
  private final static String _jspx_template28 = "\">\r\n<table width=\"780\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t  <tr>\r\n\t\t<td align=\"left\" class=\"contborder_blue\">\r\n\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\r\n\t\t<tr>\r\n\t\t  <td><table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\r\n\t\t\t  <tr>\r\n\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">부과 년월</td>\r\n\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t<input id=\"YEAR\" name=\"YEAR\" type=\"text\" class=\"input_form1\" style=\"width:70px\" value=\"\" maxlength=\"4\" onKeyDown=\"nr_num_int(this);\" onKeyUp=\"year_keyup();nr_num_int(this);\" onKeyPress=\"nr_num_int(this);\"> 년\r\n\t\t\t\t<input id=\"MONTH\" name=\"MONTH\" type=\"text\" class=\"input_form1\" style=\"width:70px\" value=\"\" maxlength=\"2\" onKeyDown=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);\" onKeyPress=\"nr_num_int(this);\"> 월\r\n\t\t\t\t</td>\r\n\t\t\t  </tr>\r\n\t\t\t  \r\n\t\t\t  <tr>\r\n\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">신청 시작일</td>\r\n\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td><input id=\"FROMDATE\" name=\"FROMDATE\" type=\"text\" class=\"input_form1\" style=\"width:70px\" value=\"\" readonly></td>\r\n\t\t\t\t\t<td><a><img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, document.getElementById('FROMDATE'), 'yyyymmdd')\" style=\"CURSOR: Hand;\"></a></td>\t\t\t\t  \r\n\t\t\t\t  </tr>\r\n\t\t\t\t</table></td>\r\n\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">신청 종료일</td>\r\n\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td><input id=\"TODATE\" name=\"TODATE\" type=\"text\" class=\"input_form1\" style=\"width:70px\" value=\"\" readonly></td>\r\n\t\t\t\t\t<td><a><img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, document.getElementById('TODATE'), 'yyyymmdd')\" style=\"CURSOR: Hand;\"></a></td>\t\t\t\t  \r\n\t\t\t\t  </tr>\r\n\t\t\t\t</table></td>\r\n\t\t\t  </tr>\r\n\t\t\t  \t\t\t  \r\n\t\t\t  <tr>\r\n\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">담당자</td>\r\n\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input id=\"MANAGER\" name=\"MANAGER\" type=\"text\" class=\"input_form1\" style=\"width:120px\"  value=\"";
  private final static String _jspx_template29 = "\" maxlength=\"10\"></td>\r\n\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">연락처</td>\r\n\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input id=\"TEL\" name=\"TEL\" type=\"text\" class=\"input_form1\" style=\"width:200px\" value=\"";
  private final static String _jspx_template30 = "\" maxlength=\"30\"></td>\r\n\t\t\t  </tr>\r\n\t\t\t  \r\n\t\t\t  <tr>\r\n\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">만료 일자</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t<td><input id=\"ENDDATE\" name=\"ENDDATE\" type=\"text\" class=\"input_form1\" style=\"width:70px\" value=\"\" readonly></td>\r\n\t\t\t\t\t\t<td><a><img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, document.getElementById('ENDDATE'), 'yyyymmdd')\" style=\"CURSOR: Hand;\"></a></td>\t  \r\n\t\t\t\t\t  </tr>\r\n\t\t\t\t\t</table></td>\r\n\t\t\t\t  \r\n\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">신청 장소</td>\r\n\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input id=\"DEPT\" name=\"DEPT\" type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"";
  private final static String _jspx_template31 = " ";
  private final static String _jspx_template32 = "\"></td>\r\n\t\t\t  </tr>\r\n\t\t\t  \r\n\t\t\t  <tr>\r\n\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">비고</td>\r\n\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t<input id=\"NOTES\" name=\"NOTES\" type=\"text\" class=\"input_form1\" style=\"width:600px\" value=\"\" maxlength=\"100\">\r\n\t\t\t\t</td>\r\n\t\t\t  </tr>\r\n\r\n\t\t  </table></td>\r\n\t\t</tr>\r\n\t\t\r\n\t\t<tr>\r\n\t\t\t<td height=\"40\" align=\"right\">\r\n\t\t  \t\t<img src=\"/img/print_icon4.gif\" onclick=\"fnPreView();\" alt=\"일괄 안내문 출력\" border=\"0\" style=\"cursor:hand;\">\r\n\t\t\t</td>\r\n\t\t</tr>\r\n\t\t\r\n\t</table></td>\r\n  </tr>\r\n\r\n</table>\r\n</form>\r\n</body>\r\n</html>";
}
