package jeus_jspwork._jsp._jumyong._gigan;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_view_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(230,9);to=(230,20)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${POP_SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(267,9);to=(267,20)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${POP_SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(300,61);to=(300,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(301,51);to=(301,54)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(306,57);to=(306,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GIGAN1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(307,57);to=(307,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GIGAN2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(308,65);to=(308,75)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PURPOSE_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(309,57);to=(309,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${BONBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(310,55);to=(310,60)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${BUBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(311,53);to=(311,57)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(312,59);to=(312,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMINNO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(313,53);to=(313,57)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TYPE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(315,63);to=(315,72)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${OWNER_SET}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(316,59);to=(316,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TAX_SET}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // jsp code [from=(317,55);to=(317,60)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${BJ_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);
      // jsp code [from=(318,55);to=(318,60)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${HJ_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template26);
      // jsp code [from=(319,67);to=(319,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // jsp code [from=(320,57);to=(320,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${userId}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template28);
      // jsp code [from=(339,92);to=(339,100)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template29);
      // jsp code [from=(349,68);to=(349,76)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template30);
      // jsp code [from=(350,56);to=(350,64)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template31);
      // jsp code [from=(357,169);to=(357,177)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template32);
      // jsp code [from=(370,68);to=(370,76)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template33);
      // jsp code [from=(378,173);to=(378,181)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template34);
      // jsp code [from=(378,238);to=(378,246)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template35);

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
  private final static String _jspx_template0 = "\r\n    \r\n";
  private final static String _jspx_template1 = "\r\n";
  private final static String _jspx_template2 = "  \r\n";
  private final static String _jspx_template3 = "  \r\n";
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "\r\n";
  private final static String _jspx_template6 = "\r\n";
  private final static String _jspx_template7 = "\r\n";
  private final static String _jspx_template8 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('사용자의 사용시간이 종료되었습니다. 다시 접속 해주시기 바랍니다.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template9 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script language=\"javascript\" src=\"/js/Check_inputbox.js\"></script>\r\n<script language=\"javascript\" src=\"/js/Ajax_request.js\"></script>\r\n<script language=\"javascript\" src=\"/jsp/RexServer/rexscript/rexpert.js\"></script>\r\n<script language=\"javascript\" src=\"/jsp/RexServer/rexscript/rexpert_properties.js\"></script>\r\n\r\n<script type=\"text/javascript\">\r\n//<![CDATA[\r\n\r\n\tfunction\tSearch()\r\n\t{\r\n\t\tvar form = document.form;\r\n\r\n\t\tform.action = \"search.do\";\r\n\t\tform.submit();\r\n\t}\r\n\r\n\tfunction iFrameResize(obj)\r\n\t{\r\n\t\tvar iFrm = obj;\r\n\t\tvar the_height = iFrm.contentWindow.document.body.scrollHeight;\r\n\r\n\t\tiFrm.style.height = the_height;\r\n\t}\r\n\r\n\tfunction \tTabUp_Img(Tab_Value)\r\n\t{\r\n\t\tvar\timg1\t= document.getElementById(\"jumin_img\");\r\n\t\tvar\timg2\t= document.getElementById(\"jumji_img\");\r\n\t\r\n\t\timg1.src\t= \"/img/sub_petition_title2_off.gif\";\r\n\t\timg2.src\t= \"/img/sub_petition_title3_off.gif\";\r\n\r\n\t\tif(Tab_Value\t== \"jumin\")\r\n\t\t{\r\n\t\t\timg1.src\t\t= \"/img/sub_petition_title2_on_b.gif\";\r\n\t\t}\r\n\t\telse if(Tab_Value\t== \"jumji\")\r\n\t\t{\r\n\t\t\timg2.src\t\t= \"/img/sub_petition_title3_on.gif\";\r\n\t\t}\r\n\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABUP\");\r\n\t\ttab.value\t= Tab_Value;\r\n\t}\r\n\t\r\n\tfunction \tTabDown_Img(Tab_Value)\r\n\t{\r\n\t\tvar\timg1\t= document.getElementById(\"bugwa_img\");\r\n//\t\tvar\timg2\t= document.getElementById(\"sunap_img\");\r\n\r\n\t\timg1.src\t= \"/img/sub_periodi_title5_off.gif\";\r\n//\t\timg2.src\t= \"/img/sub_petition_title8_off.gif\";\r\n\t\t\r\n\t\tif(Tab_Value\t== \"gigan\")\r\n\t\t{\r\n\t\t\timg1.src\t\t= \"/img/sub_periodi_title5_on.gif\";\r\n\t\t}\r\n\t\telse if(Tab_Value\t== \"sunap\")\r\n\t\t{\r\n\t\t\timg2.src\t\t= \"/img/sub_petition_title8_on.gif\";\r\n\t\t}\r\n\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABDOWN\");\r\n\t\ttab.value\t= Tab_Value;\r\n\t}\r\n\r\n\r\n\tfunction Tab_Jumin(adminno)\r\n\t{\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABUP\");\r\n\t\tif(tab.value\t== \"jumin\")\r\n\t\t\treturn;\r\n\t\telse\r\n\t\t\ttab.value\t= \"jumin\";\r\n\t\t\r\n\t\tvar tabs \t= document.getElementById(\"tabUp\");\r\n\t\ttabs.src\t= \"/jumyong/gigan/jumin_view.do?ADMIN_NO=\" + adminno;\r\n\t}\r\n\r\n\tfunction Tab_Jumji(adminno)\r\n\t{\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABUP\");\r\n\t\tif(tab.value\t== \"jumji\")\r\n\t\t\treturn;\r\n\t\telse\r\n\t\t\ttab.value\t= \"jumji\";\r\n\r\n\t\tvar tabs\t= document.getElementById(\"tabUp\");\r\n\t\ttabs.src\t= \"/jumyong/gigan/jumji_view.do?ADMIN_NO=\" + adminno;\r\n\t}\r\n\r\n\tfunction Tab_Gigan(adminno)\r\n\t{\t\t\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABDOWN\");\r\n\t\tif(tab.value\t== \"gigan\")\r\n\t\t\treturn;\r\n\t\telse\r\n\t\t\ttab.value\t= \"gigan\";\r\n\r\n\t//\tvar\tadminno\t= document.getElementById(\"ADMIN_NO\").value;\r\n\t\tvar\tseq\t= document.getElementById(\"SEQ\").value;\r\n\t\t\r\n\t\tvar tabs\t= document.getElementById(\"tabDown\");\r\n\t\ttabs.src\t= \"/jumyong/gigan/gigan_view.do?ADMIN_NO=\" + adminno + \"&SEQ=\" + seq;\r\n\t}\r\n\r\n\tfunction Tab_Sunap(adminno)\r\n\t{\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABDOWN\");\r\n\t\tif(tab.value\t== \"sunap\")\r\n\t\t\treturn;\r\n\t\telse\r\n\t\t\ttab.value\t= \"sunap\";\r\n\t\t\r\n\t\tvar tabs\t= document.getElementById(\"tabDown\");\r\n\t\ttabs.src\t= \"/jumyong/gigan/sunap_view.do?ADMIN_NO=\" + adminno;\r\n\t}\r\n\r\n\tfunction Tab_Ireok(adminno)\r\n\t{\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABDOWN\");\r\n\t\tif(tab.value\t== \"ireok\")\r\n\t\t\treturn;\r\n\t\telse\r\n\t\t\ttab.value\t= \"ireok\";\r\n\t\t\r\n\t\tvar tabs\t= document.getElementById(\"tabDown\");\r\n\t\ttabs.src\t= \"/jumyong/gigan/sunap_view.do?ADMIN_NO=\" + adminno;\r\n\t}\r\n\r\n\tfunction \tInit()\r\n\t{\r\n\t//\tvar tab\t\t= document.getElementById(\"CURRENT_TAB\");\r\n\t//\ttab.value\t= \"back\";\r\n\t\t\r\n\t}\r\n\r\n\tfunction\tBugwaCatch(year, seq)\r\n\t{\r\n\t\tdocument.getElementById(\"YEAR\").value \t\t= year;\r\n\t\r\n\t//\talert(document.getElementById(\"TAX_NO\").value);\r\n\t}\r\n\r\n\tfunction\tBugwaView(seq)\t//\t산출조건 클릭시 부과정보 데이터 변경 (Sanchul_view.jsp 호출)\r\n\t{\r\n\t\tvar\tadminno\t\t= document.getElementById(\"ADMIN_NO\").value;\r\n\t\t";
  private final static String _jspx_template10 = "\r\n\t\tdocument.getElementById(\"SEQ\").value \t= seq;\r\n\t\t\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABDOWN\");\r\n\t\tif(tab.value\t!= \"bugwa\")\r\n\t\t\treturn;\r\n\t\t\r\n\t\tvar tabs\t= document.getElementById(\"tabDown\");\r\n\t\ttabs.src\t= \"/jumyong/gigan/bugwa_view.do?ADMIN_NO=\" + adminno + \"&SEQ=\" + seq;\r\n\t}\r\n\t\r\n\tfunction\tSaeweSuipBugwa()\r\n\t{\r\n\t\tvar\tchild\t= tabDown.document.getElementById(\"VIEWPAGE\");\r\n\r\n\t\tif(!child)\t//\t뷰화면이 아닐 경우..\r\n\t\t{\r\n\t\t\talert(\"먼저 화면을 저장해 주세요.\");\r\n\t\t\treturn;\r\n\t\t}\r\n\t\t\r\n\t\t//\talert(child.value);\r\n\t\t\r\n\t\tvar\tadminno\t= document.getElementById(\"ADMIN_NO\").value;\r\n\t\tvar\tseq\t\t= document.getElementById(\"SEQ\").value;\r\n\t\tvar\tparam\t= \"ADMIN_NO=\" + adminno + \"&SEQ=\" + seq;\r\n\r\n\t\tsendRequest(\"/jumyong/gigan/saewesuipbugwa.do\", param, \"GET\", Result_SaeweSuipBugwa);\r\n\t}\r\n\r\n\tfunction\tResult_SaeweSuipBugwa(obj)\r\n\t{\r\n\t\tif(obj == \"0\")\t\t\t\r\n\t\t\talert(\"데이터가 없습니다.\");\r\n\t\telse if(obj == \"1\")\t\t\t\r\n\t\t\talert(\"부과 되었습니다.\");\r\n\t\telse if(obj == \"2\")\t\t\t\r\n\t\t\talert(\"부과된 정보입니다.\");\r\n\t}\r\n\tfunction\tnr_Adminno_Cut(adminno){\r\n\t\tif(adminno.length != 20)\r\n\t\t\treturn\tadminno\r\n\t\r\n\t\tadminno\t= adminno.substr(9, 11);\r\n\t\t\r\n\t\treturn\tadminno;\r\n\t}\r\n\t\r\n\tfunction fnOccupancyLicense()\r\n\t{\r\n\r\n\t\tvar oRptMainParam;\r\n\t\toRptMainParam = rex_GetgoDictionay(); \r\n\r\n\t\t// 옵션 - viewer\t\r\n\t\toRptMainParam.put(\"rex_open_window\", \"center=yes,scrollbars=no,status=no,toolbar=no,resizable=0,location=no,menu=no,width=1000,height=1000\");\r\n\t\t\r\n\t\tif('";
  private final static String _jspx_template11 = "' == '2'){\t//점용구분 : 일시\r\n\t\t\t// 필수 - 레포트명\r\n\t\t\toRptMainParam.put(\"rex_rptname\", \"license_ilsi\");\r\n\t\t}\r\n\t\telse\t\t\t\t\t\t\t//점용구분 : 점용, 무단\r\n\t\t{\r\n\t\t\t// 필수 - 레포트명\r\n\t\t\toRptMainParam.put(\"rex_rptname\", \"license_gigan1\");\r\n\t\t}\r\n\r\n\t\t// 필수 - 데이터 타입 설정\r\n\t\toRptMainParam.put(\"rex_datatype\", \"XML\");  // XML, CSV\r\n\r\n\t\t// 옵션 - 다른 DB를 연결시\r\n\t\toRptMainParam.put(\"rex_userservice\", \"oracle_jndi\");\r\n\r\n\t\t// 옵션 - 파라메터 설정\r\n\t\tvar form \t= document.form;\r\n\t\t\r\n\t\toRptMainParam.put(\"ADMIN_NO\" ,form.ADMIN_NO.value);\r\n\t\toRptMainParam.put(\"USER_ID\" ,form.userId.value);\r\n\t\r\n\t\t// preview 팝업 열기\r\n\t\trex_gfRexRptOpen(\"popup\", oRptMainParam);\r\n\t\t\t\r\n\t\treturn oRptMainParam;\t\r\n\t}\r\n\r\n\tfunction fnOccupancyLicense2()\r\n\t{\r\n\r\n\t\tvar oRptMainParam;\r\n\t\toRptMainParam = rex_GetgoDictionay(); \r\n\r\n\t\t// 옵션 - viewer\t\r\n\t\toRptMainParam.put(\"rex_open_window\", \"center=yes,scrollbars=no,status=no,toolbar=no,resizable=0,location=no,menu=no,width=1000,height=1000\");\r\n\t\t\r\n\t\tif('";
  private final static String _jspx_template12 = "' == '2'){\t//점용구분 : 일시\r\n\t\t\t// 필수 - 레포트명\r\n\t\t\toRptMainParam.put(\"rex_rptname\", \"license_ilsi_doro_151008\");\r\n\t\t}\r\n\t\telse\t\t\t\t\t\t\t//점용구분 : 점용, 무단\r\n\t\t{\r\n\t\t\t// 필수 - 레포트명\r\n\t\t\toRptMainParam.put(\"rex_rptname\", \"license_gigan1_doro_151008\");\r\n\t\t}\r\n\r\n\t\t// 필수 - 데이터 타입 설정\r\n\t\toRptMainParam.put(\"rex_datatype\", \"XML\");  // XML, CSV\r\n\r\n\t\t// 옵션 - 다른 DB를 연결시\r\n\t\toRptMainParam.put(\"rex_userservice\", \"oracle_jndi\");\r\n\r\n\t\t// 옵션 - 파라메터 설정\r\n\t\tvar form \t= document.form;\r\n\t\t\r\n\t\toRptMainParam.put(\"ADMIN_NO\" ,form.ADMIN_NO.value);\r\n\t\toRptMainParam.put(\"USER_ID\" ,form.userId.value);\r\n\t\r\n\t\t// preview 팝업 열기\r\n\t\trex_gfRexRptOpen(\"popup\", oRptMainParam);\r\n\t\t\t\r\n\t\treturn oRptMainParam;\t\r\n\t}\r\n//]]>\r\n</script>\r\n\r\n<body onload=\"Init();\">\r\n<table width=\"800\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n<form id=\"form\" name=\"form\" method=\"post\">\r\n<input type=\"hidden\" id=\"ADMIN_NO\" name=\"ADMIN_NO\" value=\"";
  private final static String _jspx_template13 = "\">\r\n<input type=\"hidden\" id=\"SEQ\" name=\"SEQ\" value=\"";
  private final static String _jspx_template14 = "\">\r\n\r\n<input type=\"hidden\" id=\"CURRENT_TABUP\" name=\"CURRENT_TABUP\" value=\"jumin\">\r\n<input type=\"hidden\" id=\"CURRENT_TABDOWN\" name=\"CURRENT_TABDOWN\" value=\"gigan\">\r\n\r\n<input type=\"hidden\" id=\"GIGAN1\" name=\"GIGAN1\" value=\"";
  private final static String _jspx_template15 = "\">\r\n<input type=\"hidden\" id=\"GIGAN2\" name=\"GIGAN2\" value=\"";
  private final static String _jspx_template16 = "\">\r\n<input type=\"hidden\" id=\"PURPOSE_CD\" name=\"PURPOSE_CD\" value=\"";
  private final static String _jspx_template17 = "\">\r\n<input type=\"hidden\" id=\"BONBUN\" name=\"BONBUN\" value=\"";
  private final static String _jspx_template18 = "\">\r\n<input type=\"hidden\" id=\"BUBUN\" name=\"BUBUN\" value=\"";
  private final static String _jspx_template19 = "\">\r\n<input type=\"hidden\" id=\"NAME\" name=\"NAME\" value=\"";
  private final static String _jspx_template20 = "\">\r\n<input type=\"hidden\" id=\"ADMINNO\" name=\"ADMINNO\" value=\"";
  private final static String _jspx_template21 = "\">\r\n<input type=\"hidden\" id=\"TYPE\" name=\"TYPE\" value=\"";
  private final static String _jspx_template22 = "\">\r\n\r\n<input type=\"hidden\" id=\"OWNER_SET\" name=\"OWNER_SET\" value=\"";
  private final static String _jspx_template23 = "\">\r\n<input type=\"hidden\" id=\"TAX_SET\" name=\"TAX_SET\" value=\"";
  private final static String _jspx_template24 = "\">\r\n<input type=\"hidden\" id=\"BJ_CD\" name=\"BJ_CD\" value=\"";
  private final static String _jspx_template25 = "\">\r\n<input type=\"hidden\" id=\"HJ_CD\" name=\"HJ_CD\" value=\"";
  private final static String _jspx_template26 = "\">\r\n<input type=\"hidden\" id=\"currentPage\" name=\"currentPage\" value=\"";
  private final static String _jspx_template27 = "\">\r\n<input type=\"hidden\" id=\"userId\" name=\"userId\" value=\"";
  private final static String _jspx_template28 = "\">\r\n\r\n  <tr>\r\n    <td height=\"43\"><img src=\"/img/jumyong_gigan_title.gif\" width=\"800\" height=\"43\"></td>\r\n  </tr>\r\n  \r\n  <tr>\r\n    <td align=\"center\">\r\n    <table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\r\n      \r\n      <tr>\r\n        <td height=\"1\" bgcolor=\"eaeaea\"></td>\r\n      </tr>\r\n \r\n      <tr>\r\n        <td height=\"14\"></td>\r\n      </tr>\r\n           \r\n      <td align=\"right\" class=\"sub_table_b\">관리번호 : <script>var adminno = nr_Adminno_Cut(\"";
  private final static String _jspx_template29 = "\"); document.write(adminno);</script></td>\r\n      \r\n      <tr>\r\n        <td align=\"left\">\r\n        <table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n        \r\n        <tr>\r\n            <td height=\"22\" background=\"/img/tab_line_purple.gif\">\r\n            <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                <tr>\r\n                  <td width=\"111\"><a href=\"javascript:Tab_Jumin('";
  private final static String _jspx_template30 = "')\"><img id=\"jumin_img\" name=\"jumin_img\" src=\"/img/sub_petition_title2_on_b.gif\" alt=\"점용인 정보\" width=\"110\" height=\"22\" border=\"0\"></a></td>\r\n                  <td><a href=\"javascript:Tab_Jumji('";
  private final static String _jspx_template31 = "')\"><img id=\"jumji_img\" name=\"jumji_img\" src=\"/img/sub_petition_title3_off.gif\" alt=\"점용지 정보\" width=\"110\" height=\"22\" border=\"0\"></a></td>\r\n                </tr>\r\n            </table>\r\n            </td>\r\n\t\t</tr>\r\n\t\t\r\n\t\t<td>\r\n\t\t  \t<iframe width=\"100%\" height=\"100%\" id=\"tabUp\" name=\"tabUp\" frameborder=\"0\" onload=\"iFrameResize(this)\" scrolling=\"no\" src=\"/jumyong/gigan/jumin_view.do?ADMIN_NO=";
  private final static String _jspx_template32 = "\"></iframe>\r\n\t\t</td>\r\n\r\n      <tr>\r\n        <td height=\"30\"></td>\r\n      </tr>\r\n\r\n      <tr>\r\n        <td align=\"left\">\r\n        <table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n          <tr>\r\n            <td height=\"22\" background=\"/img/tab_line_blue.gif\"><table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                <tr>\r\n                  <td width=\"111\"><a href=\"javascript:Tab_Gigan('";
  private final static String _jspx_template33 = "')\"><img id=\"bugwa_img\" name=\"bugwa_img\" src=\"/img/sub_periodi_title5_on.gif\" alt=\"기간 연장\" width=\"110\" height=\"22\" border=\"0\"></a></td>\r\n                  <!-- td width=\"111\"><a href=\"#\"><img name=\"sunap_img\" src=\"/img/sub_petition_title8_off.gif\" alt=\"이력 정보\" width=\"110\" height=\"22\" border=\"0\"></a></td -->\r\n                </tr>\r\n            </table></td>\r\n          </tr>\r\n\t\t  \r\n          <tr>\r\n  \t\t\t<TD>\r\n  \t\t\t\t<iframe width=\"100%\" height=\"150\" id=\"tabDown\" name=\"tabDown\" frameborder=\"0\" onload=\"iFrameResize(this)\" scrolling=\"no\" src=\"/jumyong/gigan/gigan_view.do?ADMIN_NO=";
  private final static String _jspx_template34 = "\"></iframe><!-- /jumyong/saewe/bugwa_view.do?ADMIN_NO=";
  private final static String _jspx_template35 = " -->\r\n  \t\t\t</TD>\r\n          </tr>\r\n          \r\n        </table>\r\n        </td>\r\n      </tr>\r\n\r\n\t\t<tr>\r\n\t\t\t<td height=\"40\" align=\"right\">\r\n\t<!-- \t\t<a href=\"javascript:SaeweSuipBugwa()\"><img src=\"/img/levy_icon.gif\" alt=\"세외수입부과\" width=\"94\" height=\"22\" border=\"0\"></a> -->\r\n\t\t\t<img src=\"/img/occu_icon.gif\" alt=\"점용허가증\" width=\"84\" height=\"22\" onclick=\"javascript:fnOccupancyLicense();\"  border=\"0\" style=\"cursor:pointer\">\r\n\t\t\t<img src=\"/img/occu_icon2.gif\" alt=\"점용허가증(도로법)\" width=\"84\" height=\"22\" onclick=\"javascript:fnOccupancyLicense2();\"  border=\"0\" style=\"cursor:pointer\">\r\n\t\t\t<a href=\"javascript:Search()\"><img src=\"/img/list_icon.gif\" alt=\"리스트\" width=\"66\" height=\"22\" border=\"0\"></a></td>\r\n\t\t</tr>\r\n\t\t\r\n\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n\t\r\n\t</table>\r\n  </td>\r\n </tr>\r\n\t\r\n</table>\r\n\r\n</body>\r\n</html>";
}
