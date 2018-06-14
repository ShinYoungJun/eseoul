package jeus_jspwork._jsp._gapan._saewe;

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
      // jsp code [from=(205,51);to=(205,59)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(205,67);to=(205,70)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(250,61);to=(250,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(251,51);to=(251,54)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(256,57);to=(256,81)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SEARCH_OPTIONS['GIGAN1']}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(257,57);to=(257,81)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SEARCH_OPTIONS['GIGAN2']}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(258,65);to=(258,93)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SEARCH_OPTIONS['PURPOSE_CD']}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(259,57);to=(259,81)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SEARCH_OPTIONS['BONBUN']}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(260,55);to=(260,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SEARCH_OPTIONS['BUBUN']}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(261,53);to=(261,75)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SEARCH_OPTIONS['NAME']}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(262,59);to=(262,84)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SEARCH_OPTIONS['ADMINNO']}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(263,53);to=(263,75)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SEARCH_OPTIONS['TYPE']}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(264,59);to=(264,84)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SEARCH_OPTIONS['SECTION']}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(265,63);to=(265,90)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SEARCH_OPTIONS['OWNER_SET']}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // jsp code [from=(266,55);to=(266,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SEARCH_OPTIONS['BJ_CD']}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);
      // jsp code [from=(267,55);to=(267,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SEARCH_OPTIONS['HJ_CD']}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template26);
      // jsp code [from=(268,57);to=(268,81)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SEARCH_OPTIONS['TAX_YN']}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // jsp code [from=(269,67);to=(269,96)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SEARCH_OPTIONS['currentPage']}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template28);
      // jsp code [from=(288,93);to=(288,101)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template29);
      // jsp code [from=(301,70);to=(301,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template30);
      // jsp code [from=(308,157);to=(308,165)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template31);
      // jsp code [from=(308,173);to=(308,176)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template32);
      // jsp code [from=(325,101);to=(325,109)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template33);

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
  private final static String _jspx_template2 = "    \r\n";
  private final static String _jspx_template3 = "\r\n";
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "  \r\n";
  private final static String _jspx_template6 = "  \r\n";
  private final static String _jspx_template7 = "\r\n";
  private final static String _jspx_template8 = "\r\n";
  private final static String _jspx_template9 = "\r\n\r\n\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script language=\"javascript\" src=\"/js/Check_inputbox.js\"></script>\r\n<script language=\"javascript\" src=\"/js/Ajax_request.js\"></script>\r\n\r\n<script type=\"text/javascript\">\r\n//<![CDATA[\r\n\r\n\tfunction\tSearch()\r\n\t{\r\n\t\tvar form = document.form;\r\n\r\n\t\tform.action = \"search.do\";\r\n\t\tform.submit();\r\n\t}\r\n\r\n\tfunction iFrameResize(obj)\r\n\t{\r\n\t\tvar iFrm = obj;\r\n\t\tvar the_height = iFrm.contentWindow.document.body.scrollHeight;\r\n\r\n\t\tiFrm.style.height = the_height;\r\n\t}\r\n\r\n\tfunction \tTabUp_Img(Tab_Value)\r\n\t{\r\n\t\tvar\timg1\t= document.getElementById(\"sanchul_img\");\r\n\t\r\n\t\timg1.src\t= \"/img/sub_petition_title16_off.gif\";\r\n\r\n\t\t\r\n\t\tif(Tab_Value\t== \"sanchul\")\r\n\t\t{\r\n\t\t\timg1.src\t\t= \"/img/sub_petition_title16_on.gif\";\r\n\t\t}\r\n\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABUP\");\r\n\t\ttab.value\t= Tab_Value;\r\n\t}\r\n\t\r\n\tfunction \tTabDown_Img(Tab_Value)\r\n\t{\r\n\t\tvar\timg1\t= document.getElementById(\"bugwa_img\");\r\n\r\n\t\timg1.src\t\t= \"/img/sub_petition_title12_on.gif\";\r\n\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABDOWN\");\r\n\t\ttab.value\t= Tab_Value;\r\n\t}\r\n\t\r\n\t\r\n\tfunction Tab_Sanchul(gapanNo)\r\n\t{\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABUP\");\r\n\t\t\r\n\t\tif(tab.value\t== \"sanchul\")\r\n\t\t\treturn;\r\n\t\telse\r\n\t\t\ttab.value\t= \"sanchul\";\r\n\t\t\r\n\t\tvar\tseq\t= document.getElementById(\"SEQ\").value;\r\n\t\t\r\n\t\tvar tabs \t= document.getElementById(\"tabUp\");\r\n\t\ttabs.src\t= \"/gapan/saewe/sanchul_view.do?GAPAN_NO=\" + gapanNo + \"&SEQ=\" + seq;\r\n\t}\r\n\r\n\tfunction Tab_Jumin(gapanNo)\r\n\t{\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABUP\");\r\n\t\tif(tab.value\t== \"jumin\")\r\n\t\t\treturn;\r\n\t\telse\r\n\t\t\ttab.value\t= \"jumin\";\r\n\t\t\r\n\t\tvar tabs \t= document.getElementById(\"tabUp\");\r\n\t\ttabs.src\t= \"/gapan/saewe/jumin_view.do?GAPAN_NO=\" + gapanNo;\r\n\t}\r\n\t\r\n\tfunction Tab_Jumji(gapanNo)\r\n\t{\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABUP\");\r\n\t\tif(tab.value\t== \"jumji\")\r\n\t\t\treturn;\r\n\t\telse\r\n\t\t\ttab.value\t= \"jumji\";\r\n\r\n\t\tvar tabs\t= document.getElementById(\"tabUp\");\r\n\t\ttabs.src\t= \"/gapan/saewe/jumji_view.do?GAPAN_NO=\" + gapanNo;\r\n\t}\r\n\t\r\n\tfunction Tab_Bugwa(gapanNo)\r\n\t{\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABDOWN\");\r\n\t\tif(tab.value\t== \"bugwa\")\r\n\t\t\treturn;\r\n\t\telse\r\n\t\t\ttab.value\t= \"bugwa\";\r\n\r\n\t\tvar\tseq\t= document.getElementById(\"SEQ\").value;\r\n\t\tvar tabs\t= document.getElementById(\"tabDown\");\r\n\t\ttabs.src\t= \"/gapan/saewe/bugwa_view.do?GAPAN_NO=\" + gapanNo + \"&SEQ=\" + seq;\r\n\t}\r\n\r\n\r\n\tfunction\tBugwaView(seq)\t//\t산출조건 클릭시 부과정보 데이터 변경 (Sanchul_view.jsp 호출)\r\n\t{\r\n\t\tvar\tgapanNo\t\t= document.getElementById(\"GAPAN_NO\").value;\r\n\t\t\r\n\t\tdocument.getElementById(\"SEQ\").value \t= seq;\r\n\t\t\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABDOWN\");\r\n\t\tif(tab.value\t!= \"bugwa\")\r\n\t\t\treturn;\r\n\t\t\r\n\t\tvar tabs\t= document.getElementById(\"tabDown\");\r\n\t\ttabs.src\t= \"/gapan/saewe/bugwa_view.do?GAPAN_NO=\" + gapanNo + \"&SEQ=\" + seq;\r\n\t}\r\n\r\n\r\n\r\n\r\n\r\n\t\r\n\t\r\n\tfunction \tInit()\r\n\t{\t\t\r\n\t\thistoryBack = document.referrer;\r\n\t}\r\n\r\n\tvar historyBack = '';\r\n\t\r\n\tfunction \tBugwa_On()\r\n\t{\r\n\t\tvar\tVIEWPAGE\t= tabDown.document.getElementById(\"VIEWPAGE\");\r\n\r\n\t\tdocument.getElementById(\"Bugwa_On\").style.display = \"block\";\r\n\t\tdocument.getElementById(\"Bugwa_Off\").style.display = \"none\";\r\n\t}\r\n\t\r\n\tfunction \tBugwa_Off()\r\n\t{\r\n\t\tdocument.getElementById(\"Bugwa_On\").style.display = \"none\";\r\n\t\tdocument.getElementById(\"Bugwa_Off\").style.display = \"block\";\r\n\r\n\t}\r\n\t\r\n\tfunction\tBugwaCatch(year, seq)\r\n\t{\r\n\t\tdocument.getElementById(\"YEAR\").value \t\t= year;\r\n\t\r\n\t}\r\n\r\n\tfunction\tSaeweSuipBugwa()\r\n\t{\r\n\t\tvar\tchild\t= tabDown.document.getElementById(\"VIEWPAGE\");\r\n\t\t\r\n\t\tif(!child)\t//\t뷰화면이 아닐 경우..\r\n\t\t{\r\n\t\t\talert(\"먼저 화면을 저장해 주세요.\");\r\n\t\t\treturn;\r\n\t\t}\r\n\t\t\r\n\t\t//\talert(child.value);\r\n\t\t\r\n\t\tvar\tadminno\t= document.getElementById(\"GAPAN_NO\").value;\r\n\t\tvar\tseq\t\t= document.getElementByI";
  private final static String _jspx_template10 = "d(\"SEQ\").value;\r\n\t\tvar\tparam\t= \"GAPAN_NO=\" + adminno + \"&SEQ=\" + seq;\r\n\t\t\r\n\t\tsendRequest(\"/gapan/saewe/saewesuipbugwa.do\", param, \"GET\", Result_SaeweSuipBugwa);\r\n\t}\r\n\r\n\tfunction\tResult_SaeweSuipBugwa(obj)\r\n\t{\r\n\t\tif(obj != \"\"){\r\n\t\t\talert(obj);\r\n\t\t}\r\n\t\tvar\tchild\t= tabDown.document.getElementById(\"VIEWPAGE\");\r\n\t\tif(child)\t//\t뷰화면일 경우..\r\n\t\t{\r\n\t\t\tlocation.href=\"/gapan/saewe/view.do?GAPAN_NO=";
  private final static String _jspx_template11 = "&SEQ=";
  private final static String _jspx_template12 = "\";\r\n\t\t}\r\n\t}\r\n\t\r\n\t// 고지서 발급\r\n\tfunction fGoji()\r\n\t{\t\r\n\t\tvar pGoji;\r\n\t\tvar tax_yn    =  tabDown.form.TAX_YN.value;\r\n\t\tvar sigu_cd   =  tabDown.form.sigu_cd.value;\r\n\t\tvar buseo_cd  =  tabDown.form.buseo_cd.value;\r\n\t\tvar semok_cd  =  tabDown.form.semok_cd.value;\r\n\t\tvar tax_ym    =  tabDown.form.tax_ym.value;\r\n\t\tvar tax_gubun =  tabDown.form.tax_gubun.value;\r\n\t\tvar tax_no    =  tabDown.form.tax_no.value;\r\n\t\tvar user_id   =  tabDown.form.bukwa_id.value;\r\n\t\t\r\n\t\tif(tax_yn != \"1\")\r\n\t\t{\r\n\t\t\talert(\"부과된 정보가 없습니다.\");\r\n\t\t\treturn;\r\n\t\t}\r\n\t\t\r\n\t\tpGoji = \"?sigu_cd=\"+sigu_cd; \r\n\t\tpGoji = pGoji + \"&buseo_cd=\"+buseo_cd;\r\n\t\tpGoji = pGoji + \"&semok_cd=\"+semok_cd; \r\n\t\tpGoji = pGoji + \"&tax_ym=\"+tax_ym;\r\n\t\tpGoji = pGoji + \"&tax_gubun=\"+tax_gubun;\r\n\t\tpGoji = pGoji + \"&tax_no=\"+tax_no;\r\n\t\tpGoji = pGoji + \"&user_id=\"+user_id;\r\n\t\t\r\n\t\t\r\n\r\n\r\n\t\t//var URL = \"http://98.33.4.5/jsp/IECall/Bu04BugaOneSearchCW.jsp\"+ pGoji;\r\n\t\tvar URL = \"http://98.33.4.164/jsp/IECall/Bu04BugaOneSearchCW.jsp\"+ pGoji;\r\n\t\t\r\n\t\twindow.open(URL,\"세외수입고지서출력\",\"width=800, height=600, left=150, top=150, toolbar=no,location=no,directories=no,status=yes,menubar=no,scrollbars=no,resizable=no\");\t  \r\n\t} \r\n\t\r\n//]]>\r\n</script>\r\n\r\n<body >\r\n<form id=\"form\" name=\"form\" method=\"post\">\r\n<input type=\"hidden\" id=\"GAPAN_NO\" name=\"GAPAN_NO\" value=\"";
  private final static String _jspx_template13 = "\">\r\n<input type=\"hidden\" id=\"SEQ\" name=\"SEQ\" value=\"";
  private final static String _jspx_template14 = "\">\r\n\r\n<input type=\"hidden\" id=\"CURRENT_TABUP\" name=\"CURRENT_TABUP\" value=\"sanchul\">\r\n<input type=\"hidden\" id=\"CURRENT_TABDOWN\" name=\"CURRENT_TABDOWN\" value=\"bugwa\">\r\n\r\n<input type=\"hidden\" id=\"GIGAN1\" name=\"GIGAN1\" value=\"";
  private final static String _jspx_template15 = "\">\r\n<input type=\"hidden\" id=\"GIGAN2\" name=\"GIGAN2\" value=\"";
  private final static String _jspx_template16 = "\">\r\n<input type=\"hidden\" id=\"PURPOSE_CD\" name=\"PURPOSE_CD\" value=\"";
  private final static String _jspx_template17 = "\">\r\n<input type=\"hidden\" id=\"BONBUN\" name=\"BONBUN\" value=\"";
  private final static String _jspx_template18 = "\">\r\n<input type=\"hidden\" id=\"BUBUN\" name=\"BUBUN\" value=\"";
  private final static String _jspx_template19 = "\">\r\n<input type=\"hidden\" id=\"NAME\" name=\"NAME\" value=\"";
  private final static String _jspx_template20 = "\">\r\n<input type=\"hidden\" id=\"ADMINNO\" name=\"ADMINNO\" value=\"";
  private final static String _jspx_template21 = "\">\r\n<input type=\"hidden\" id=\"TYPE\" name=\"TYPE\" value=\"";
  private final static String _jspx_template22 = "\">\r\n<input type=\"hidden\" id=\"SECTION\" name=\"SECTION\" value=\"";
  private final static String _jspx_template23 = "\">\r\n<input type=\"hidden\" id=\"OWNER_SET\" name=\"OWNER_SET\" value=\"";
  private final static String _jspx_template24 = "\">\r\n<input type=\"hidden\" id=\"BJ_CD\" name=\"BJ_CD\" value=\"";
  private final static String _jspx_template25 = "\">\r\n<input type=\"hidden\" id=\"HJ_CD\" name=\"HJ_CD\" value=\"";
  private final static String _jspx_template26 = "\">\r\n<input type=\"hidden\" id=\"TAX_YN\" name=\"TAX_YN\" value=\"";
  private final static String _jspx_template27 = "\">\r\n<input type=\"hidden\" id=\"currentPage\" name=\"currentPage\" value=\"";
  private final static String _jspx_template28 = "\">\r\n\r\n<table width=\"800\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n  <tr>\r\n    <td height=\"43\"><img src=\"/img/sub9_cont3_title.gif\" width=\"800\" height=\"43\"></td>\r\n  </tr>\r\n  \r\n  <tr>\r\n    <td align=\"center\">\r\n    <table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\r\n      <tr>\r\n        <td height=\"1\" bgcolor=\"eaeaea\"></td>\r\n      </tr>\r\n\t\t\r\n      <tr>\r\n        <td height=\"14\"></td>\r\n      </tr>\r\n      <tr>\r\n      \t<td align=\"right\" class=\"sub_table_b\">관리번호 : <script>var adminno = nr_Adminno_Cut(\"";
  private final static String _jspx_template29 = "\"); document.write(adminno);</script></td>\r\n      </tr>\r\n           \r\n      \r\n      \r\n      <tr>\r\n        <td align=\"left\">\r\n        <table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n        \r\n        <tr>\r\n            <td height=\"22\" background=\"/img/tab_line_purple.gif\">\r\n            <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                <tr>\r\n                  <td width=\"111\"><a href=\"javascript:Tab_Sanchul('";
  private final static String _jspx_template30 = "')\"><img id=\"sanchul_img\" src=\"/img/sub_petition_title16_on.gif\" alt=\"산출 정보\" width=\"110\" height=\"22\" border=\"0\"></a></td>\r\n                </tr>\r\n            </table>\r\n            </td>\r\n\t\t</tr>\r\n\t\t<tr>\r\n\t\t\t<td>\r\n\t\t\t  \t<iframe width=\"100%\" height=\"100%\" id=\"tabUp\" frameborder=\"0\" onload=\"iFrameResize(this)\" scrolling=\"no\" src=\"/gapan/saewe/sanchul_view.do?GAPAN_NO=";
  private final static String _jspx_template31 = "&SEQ=";
  private final static String _jspx_template32 = "\"></iframe>\r\n\t\t\t</td>\r\n\t\t</tr>\r\n\t\t\r\n\t\t\r\n\t\t\r\n      <tr>\r\n        <td height=\"30\"></td>\r\n      </tr>\r\n\t\t\r\n        <tr>\r\n        <td align=\"left\">\r\n        <table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n          <tr>\r\n            <td height=\"22\" background=\"/img/tab_line_blue.gif\"><table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                <tr>\r\n                  <td width=\"111\">\r\n                  \t<img id=\"bugwa_img\" src=\"/img/sub_petition_title12_on.gif\" onclick=\"Tab_Bugwa('";
  private final static String _jspx_template33 = "');\" alt=\"부과 정보\" width=\"110\" height=\"22\" border=\"0\">\r\n                  </td>\r\n                </tr>\r\n            </table></td>\r\n          </tr>\r\n\t\t  \r\n          <tr>\r\n  \t\t\t<TD>\r\n  \t\t\t\t<iframe width=\"100%\" height=\"150\" id=\"tabDown\" frameborder=\"0\" onload=\"iFrameResize(this)\" scrolling=\"no\" src=\"\"></iframe>\r\n  \t\t\t</TD>\r\n          </tr>\r\n          \r\n        </table>\r\n        </td>\r\n        </tr>\r\n\t\t\r\n\t\t<tr>\r\n\t\t\t<td colspan=\"0\" bgcolor=\"F6F6F6\" class=\"table_bl_left\"  align=\"right\">\r\n\t\t\t\t<span style=\"display:none\" id=\"Bugwa_On\">\r\n\t\t\t\t\t<table width=\"100%\" border=\"0\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t<td>\r\n\t\t\t\t\t\t<img src=\"../../../img/notice_icon.gif\" alt=\"고지서 발급\" border=\"0\" onclick=\"javascript:fGoji();\" style=\"cursor:hand\">\r\n\t\t\t\t\t\t<a href=\"javascript:SaeweSuipBugwa()\"><img src=\"/img/levy_icon.gif\" alt=\"세외수입부과\" width=\"94\" height=\"22\" border=\"0\"></a>\r\n\t\t\t\t\t\t<a href=\"javascript:Search()\"><img src=\"/img/list_icon.gif\" alt=\"리스트\" width=\"66\" height=\"22\" border=\"0\"></a>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t\t\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t\r\n\t\t\t\t\t</table>\r\n\t\t\t\t</span>\r\n\t\t\t\t\r\n\t\t\t\t<span style=\"display:none\" id=\"Bugwa_Off\">\r\n\t\t\t\t\t<table width=\"100%\" border=\"0\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t<img src=\"/img/list_icon.gif\" onclick=\"document.location.href = historyBack;\" alt=\"리스트\" width=\"66\" height=\"22\" border=\"0\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t\r\n\t\t\t\t\t</table>\r\n\t\t\t\t</span>\r\n\t\t\t</td>\r\n\t\t</tr>\r\n\t\t\r\n\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n\t\r\n\t</table>\r\n  </td>\r\n </tr>\r\n\t\r\n</table>\r\n</form>\r\n</body>\r\n</html>";
}
