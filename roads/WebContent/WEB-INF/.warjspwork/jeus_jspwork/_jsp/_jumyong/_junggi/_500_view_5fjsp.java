package jeus_jspwork._jsp._jumyong._junggi;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_view_5fjsp extends jeus.servlet.jsp.HttpJspBase {

  public final String[] __jeusGetIncludedJspFiles() {
    return new String[] {
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
      out.write(_jspx_template7);
      out.write(_jspx_template8);
      out.write(_jspx_template9);
      out.write(_jspx_template10);
      // jsp code [from=(232,47);to=(232,55)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(233,42);to=(233,45)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(238,43);to=(238,48)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${year }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(239,49);to=(239,64)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${purpose_search }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(240,43);to=(240,48)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${type }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(241,46);to=(241,54)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${tax_set }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(242,45);to=(242,52)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${tax_yn }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(243,51);to=(243,64)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mul_fromdate }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(244,49);to=(244,60)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mul_todate }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(245,44);to=(245,50)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bj_cd }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(246,44);to=(246,50)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${hj_cd }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(247,50);to=(247,62)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${jumyongName }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(248,49);to=(248,60)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${cal_status }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(249,46);to=(249,54)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // jsp code [from=(250,45);to=(250,52)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${search }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);
      // jsp code [from=(283,54);to=(283,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view_admin_no}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template26);
      // jsp code [from=(293,71);to=(293,79)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // jsp code [from=(294,73);to=(294,81)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template28);
      // jsp code [from=(295,57);to=(295,65)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template29);
      // jsp code [from=(302,160);to=(302,168)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template30);
      // jsp code [from=(302,180);to=(302,188)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${message }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template31);
      // jsp code [from=(302,197);to=(302,201)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${year}",java.lang.String.class , pageContext.getVariableResolver(), null));

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
  private final static String _jspx_template1 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('사용자의 사용시간이 종료되었습니다. 다시 접속 해주시기 바랍니다.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template2 = "\r\n";
  private final static String _jspx_template3 = "\r\n";
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "  \r\n";
  private final static String _jspx_template6 = "  \r\n";
  private final static String _jspx_template7 = "\r\n";
  private final static String _jspx_template8 = "\r\n";
  private final static String _jspx_template9 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script language=\"javascript\" src=\"/js/Check_inputbox.js\"></script>\r\n<script language=\"javascript\" src=\"/js/Ajax_request.js\"></script>\r\n\r\n<script type=\"text/javascript\">\r\n//<![CDATA[\r\n\r\n\tfunction\tSearch()\r\n\t{\r\n\t\tvar form = document.form;\r\n\r\n\t\tform.action = \"search.do\";\r\n\t\tform.submit();\r\n\t}\r\n\r\n\tfunction iFrameResize(obj)\r\n\t{\r\n\t\tvar iFrm = obj;\r\n\t\tvar the_height = iFrm.contentWindow.document.body.scrollHeight;\r\n\r\n\t\tiFrm.style.height = the_height + \"px\";\r\n\t}\r\n\r\n\tfunction \tTabUp_Img(Tab_Value)\r\n\t{\r\n\t\tvar\timg1\t= document.getElementById(\"sanchul_img\");\r\n\t\tvar\timg2\t= document.getElementById(\"jumin_img\");\r\n\t\tvar\timg3\t= document.getElementById(\"jumji_img\");\r\n\t\r\n\t\timg1.src\t= \"/img/sub_petition_title16_off.gif\";\r\n\t\timg2.src\t= \"/img/sub_petition_title2_off.gif\";\r\n\t\timg3.src\t= \"/img/sub_petition_title3_off.gif\";\r\n\t\t\r\n\t\tif(Tab_Value\t== \"sanchul\")\r\n\t\t{\r\n\t\t\talert(\"3\");\r\n\t\t\timg1.src\t\t= \"/img/sub_petition_title16_on.gif\";\r\n\t\t}\r\n\t\telse if(Tab_Value\t== \"jumin\")\r\n\t\t{\r\n\t\t\timg2.src\t\t= \"/img/sub_petition_title2_on.gif\";\r\n\t\t}\r\n\t\telse if(Tab_Value\t== \"jumji\")\r\n\t\t{\r\n\t\t\timg3.src\t\t= \"/img/sub_petition_title3_on.gif\";\r\n\t\t}\t\t\r\n\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABUP\");\r\n\t\ttab.value\t= Tab_Value;\r\n\t}\r\n\t\r\n\tfunction \tTabDown_Img(Tab_Value)\r\n\t{\r\n\t\tvar\timg1\t= document.getElementById(\"bugwa_img\");\r\n\t\tvar\timg2\t= document.getElementById(\"history_img\");\r\n\r\n\t\timg1.src\t= \"/img/sub_petition_title12_off.gif\";\r\n\t\timg2.src\t= \"/img/sub_petition_title8_off.gif\";\r\n\t\t\r\n\t\tif(Tab_Value\t== \"bugwa\")\r\n\t\t{\r\n\t\t\timg1.src\t\t= \"/img/sub_petition_title12_on.gif\";\r\n\t\t}\r\n\t\telse if(Tab_Value\t== \"sunap\")\r\n\t\t{\r\n\t\t\timg2.src\t\t= \"/img/sub_petition_title8_on.gif\";\r\n\t\t}\r\n\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABDOWN\");\r\n\t\ttab.value\t= Tab_Value;\r\n\t}\r\n\r\n\t\r\n\tfunction Tab_Sanchul(adminno)\r\n\t{\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABUP\");\r\n\r\n\t\tif(tab.value\t== \"sanchul\")\r\n\t\t\treturn;\r\n\t\telse\r\n\t\t\ttab.value\t= \"sanchul\";\r\n\r\n\t\tvar\tseq\t= document.getElementById(\"SEQ\").value;\r\n\t//\tvar\tseq\t\t= document.getElementById(\"TAX_NO\").value;\r\n\r\n\t\tvar tabs \t= document.getElementById(\"tabUp\");\r\n\t\ttabs.src\t= \"/jumyong/junggi/junggi_view.do?ADMIN_NO=\" + adminno + \"&SEQ=\" + seq;// + \"&SEQ=\" + seq;\r\n\t\tTabUp_Img(\"sanchul\");\r\n\t}\r\n\r\n\tfunction Tab_Jumin(adminno)\r\n\t{\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABUP\");\r\n\t\tif(tab.value\t== \"jumin\")\r\n\t\t\treturn;\r\n\t\telse\r\n\t\t\ttab.value\t= \"jumin\";\r\n\t\t\r\n\t\tvar tabs \t= document.getElementById(\"tabUp\");\r\n\t\ttabs.src\t= \"/jumyong/saewe/jumin_view.do?ADMIN_NO=\" + adminno;\r\n\t}\r\n\r\n\tfunction Tab_Jumji(adminno)\r\n\t{\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABUP\");\r\n\t\tif(tab.value\t== \"jumji\")\r\n\t\t\treturn;\r\n\t\telse\r\n\t\t\ttab.value\t= \"jumji\";\r\n\r\n\t\tvar tabs\t= document.getElementById(\"tabUp\");\r\n\t\ttabs.src\t= \"/jumyong/saewe/jumji_view.do?ADMIN_NO=\" + adminno;\r\n\t}\r\n\r\n\tfunction Tab_Bugwa(adminno)\r\n\t{\t\t\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABDOWN\");\r\n\t\tif(tab.value\t== \"bugwa\")\r\n\t\t\treturn;\r\n\t\telse\r\n\t\t\ttab.value\t= \"bugwa\";\r\n\r\n\t//\tvar\tadminno\t= document.getElementById(\"ADMIN_NO\").value;\r\n\t\tvar\tseq\t= document.getElementById(\"SEQ\").value;\r\n\t\t\r\n\t\tvar tabs\t= document.getElementById(\"tabDown\");\r\n//\t\ttabs.src\t= \"/jumyong/saewe/bugwa_view.do?ADMIN_NO=\" + adminno + \"&SEQ=\" + seq;\r\n\t\ttabs.src\t= \"/jumyong/junggi/bugwa_view.do?ADMIN_NO=\" + adminno + \"&SEQ=\" + seq;\t\t\r\n\t\t\r\n\t}\r\n\r\n\tfunction Tab_Sunap(adminno)\r\n\t{\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABDOWN\");\r\n\t\tif(tab.value\t== \"sunap\")\r\n\t\t\treturn;\r\n\t\telse\r\n\t\t\ttab.value\t= \"sunap\";\r\n\t\t\r\n\t\tvar tabs\t= document.getElementById(\"tabDown\");\r\n//\t\ttabs.src\t= \"/jumyong/saewe/sunap_view.do?ADMIN_NO=\" + adminno;\r\n\t}\r\n\r\n\tfunction \tInit()\r\n\t{\t\r\n\t//\tvar tab\t\t= document.getElementById(\"CURRENT_TAB\");\r\n\t/";
  private final static String _jspx_template10 = "/\ttab.value\t= \"back\";\r\n\t}\r\n\r\n\tfunction\tBugwaCatch(year, seq)\r\n\t{\r\n\t\tdocument.getElementById(\"YEAR\").value \t\t= year;\r\n\t\r\n\t//\talert(document.getElementById(\"TAX_NO\").value);\r\n\t}\r\n\r\n\tfunction\tBugwaView(seq)\t//\t산출조건 클릭시 부과정보 데이터 변경 (Sanchul_view.jsp 호출)\r\n\t{\r\n\r\n\t\tvar\tadminno\t\t= document.getElementById(\"ADMIN_NO\").value;\r\n\t\t\r\n\t\tdocument.getElementById(\"SEQ\").value \t= seq;\r\n\t\t\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABDOWN\");\r\n\t\tif(tab.value\t!= \"bugwa\")\r\n\t\t\treturn;\r\n\t\t\r\n\t\tvar tabs\t= document.getElementById(\"tabDown\");\r\n\t\ttabs.src\t= \"/jumyong/saewe/bugwa_view.do?ADMIN_NO=\" + adminno + \"&SEQ=\" + seq;\r\n\t\ttabs.src\t= \"/jumyong/junggi/bugwa_view.do?ADMIN_NO=\" + adminno + \"&SEQ=\" + seq;\t\t\r\n\t}\r\n\t\r\n\tfunction\tSaeweSuipBugwa()\r\n\t{\r\n\t\tvar\tchild\t= tabDown.document.getElementById(\"VIEWPAGE\");\r\n\r\n\t\tif(!child)\t//\t뷰화면이 아닐 경우..\r\n\t\t{\r\n\t\t\talert(\"먼저 화면을 저장해 주세요.\");\r\n\t\t\treturn;\r\n\t\t}\r\n\t\t\r\n\t\t//\talert(child.value);\r\n\t\t\r\n\t\tvar\tadminno\t= document.getElementById(\"ADMIN_NO\").value;\r\n\t\tvar\tseq\t\t= document.getElementById(\"SEQ\").value;\r\n\t\tvar\tparam\t= \"ADMIN_NO=\" + adminno + \"&SEQ=\" + seq;\r\n\r\n\t\tsendRequest(\"/jumyong/saewe/saewesuipbugwa.do\", param, \"GET\", Result_SaeweSuipBugwa);\r\n\t}\r\n\r\n\tfunction\tResult_SaeweSuipBugwa(obj)\r\n\t{\r\n\t\tif(obj == \"0\")\t\t\t\r\n\t\t\talert(\"데이터가 없습니다.\");\r\n\t\telse if(obj == \"1\")\t\t\t\r\n\t\t\talert(\"부과 되었습니다.\");\r\n\t\telse if(obj == \"2\")\t\t\t\r\n\t\t\talert(\"부과된 정보입니다.\");\r\n\t}\r\n\t\r\n//]]>\r\n</script>\r\n\r\n<body onload=\"Init();\">\r\n<table width=\"800\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n<form name=\"form\" method=\"post\">\r\n<input type=\"hidden\" name=\"ADMIN_NO\" value=\"";
  private final static String _jspx_template11 = "\">\r\n<input type=\"hidden\" name=\"SEQ\" value=\"";
  private final static String _jspx_template12 = "\">\r\n\r\n<input type=\"hidden\" name=\"CURRENT_TABUP\" value=\"sanchul\">\r\n<input type=\"hidden\" name=\"CURRENT_TABDOWN\" value=\"bugwa\">\r\n\r\n<input type=\"hidden\" name=\"year\" value=\"";
  private final static String _jspx_template13 = "\">\r\n<input type=\"hidden\" name=\"purpose_cd\" value=\"";
  private final static String _jspx_template14 = "\">\r\n<input type=\"hidden\" name=\"type\" value=\"";
  private final static String _jspx_template15 = "\">\r\n<input type=\"hidden\" name=\"tax_set\" value=\"";
  private final static String _jspx_template16 = "\">\r\n<input type=\"hidden\" name=\"tax_yn\" value=\"";
  private final static String _jspx_template17 = "\">\r\n<input type=\"hidden\" name=\"mul_fromdate\" value=\"";
  private final static String _jspx_template18 = "\">\r\n<input type=\"hidden\" name=\"mul_todate\" value=\"";
  private final static String _jspx_template19 = "\">\r\n<input type=\"hidden\" name=\"bj_cd\" value=\"";
  private final static String _jspx_template20 = "\">\r\n<input type=\"hidden\" name=\"hj_cd\" value=\"";
  private final static String _jspx_template21 = "\">\r\n<input type=\"hidden\" name=\"jumyongName\" value=\"";
  private final static String _jspx_template22 = "\">\r\n<input type=\"hidden\" name=\"cal_status\" value=\"";
  private final static String _jspx_template23 = "\">\r\n<input type=\"hidden\" name=\"SECTION\" value=\"";
  private final static String _jspx_template24 = "\">\r\n<input type=\"hidden\" name=\"search\" value=\"";
  private final static String _jspx_template25 = "\">\r\n\r\n  <tr>\r\n    <td height=\"43\"><img src=\"/img/jumyong_junggi_title.gif\" width=\"800\" height=\"43\"></td>\r\n  </tr>\r\n  \r\n  <tr>\r\n    <td align=\"center\">\r\n    <table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n      <!--<tr>\r\n        <td height=\"40\" align=\"right\">\r\n\r\n\t\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n          <tr>\r\n            <td height=\"8\" colspan=\"2\"></td>\r\n            </tr>\r\n          <tr>\r\n            <td><a href=\"#\"><img src=\"/img/report_icon.gif\" alt=\"기안문 상신\" width=\"92\" height=\"18\" border=\"0\"></a></td>\r\n            <td><a href=\"#\"><img src=\"/img/help_icon.gif\" alt=\"도움말\" width=\"65\" height=\"18\" border=\"0\"></a></td>\r\n            </tr>\r\n        </table>\r\n\t\t\r\n\t\t</td>\r\n      </tr>  -->\r\n      \r\n      <tr>\r\n        <td height=\"1\" bgcolor=\"eaeaea\"></td>\r\n      </tr>\r\n \r\n      <tr>\r\n        <td height=\"14\"></td>\r\n      </tr>\r\n           \r\n      <td align=\"right\" class=\"sub_table_b\">관리번호 : ";
  private final static String _jspx_template26 = "</td>\r\n      \r\n      <tr>\r\n        <td align=\"left\">\r\n        <table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n        \r\n        <tr>\r\n            <td height=\"22\" background=\"/img/tab_line_purple.gif\">\r\n\t            <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t                <tr>\r\n\t                  <td width=\"111\"><a href=\"javascript:Tab_Sanchul('";
  private final static String _jspx_template27 = "')\"><img name=\"sanchul_img\" src=\"/img/sub_petition_title16_on.gif\" alt=\"산출 정보\" width=\"110\" height=\"22\" border=\"0\"></a></td>\r\n\t                  <!-- td width=\"111\"><a href=\"javascript:Tab_Jumin('";
  private final static String _jspx_template28 = "')\"><img name=\"jumin_img\" src=\"/img/sub_petition_title2_off.gif\" alt=\"점용인 정보\" width=\"110\" height=\"22\" border=\"0\"></a></td>\r\n\t                  <td><a href=\"javascript:Tab_Jumji('";
  private final static String _jspx_template29 = "')\"><img name=\"jumji_img\" src=\"/img/sub_petition_title3_off.gif\" alt=\"점용지 정보\" width=\"110\" height=\"22\" border=\"0\"></a></td-->\r\n\t                </tr>\r\n\t            </table>\r\n            </td>\r\n\t\t</tr>\r\n\t\t\r\n\t\t<td>\r\n\t\t  \t<iframe width=\"100%\" height=\"100%\" name=\"tabUp\" frameborder=\"0\" onload=\"iFrameResize(this)\" scrolling=\"no\" src=\"/jumyong/junggi/junggi_view.do?ADMIN_NO=";
  private final static String _jspx_template30 = "&message=";
  private final static String _jspx_template31 = "&year=";
  private final static String _jspx_template32 = "\"></iframe>\r\n\t\t</td>\r\n\t\t<tr>\r\n\t\t\t<td height=\"40\" align=\"right\">\r\n\t\t\t<a href=\"javascript:Search()\"><img src=\"/img/list_icon.gif\" alt=\"리스트\" width=\"66\" height=\"22\" border=\"0\"></a></td>\r\n\t\t</tr>\r\n\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n\t\r\n\t</table>\r\n  </td>\r\n </tr>\r\n\t\r\n</table>\r\n\r\n</body>\r\n</html>";
}
