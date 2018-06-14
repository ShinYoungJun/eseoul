package jeus_jspwork._jsp._jumyong._saewe;

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
      // jsp code [from=(233,53);to=(233,61)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(233,69);to=(233,72)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(284,61);to=(284,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(285,51);to=(285,54)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(290,57);to=(290,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GIGAN1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(291,57);to=(291,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GIGAN2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(292,65);to=(292,75)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PURPOSE_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(293,57);to=(293,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${BONBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(294,55);to=(294,60)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${BUBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(295,53);to=(295,57)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(296,59);to=(296,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMINNO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(297,53);to=(297,57)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TYPE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(298,59);to=(298,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(299,63);to=(299,72)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${OWNER_SET}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // jsp code [from=(300,55);to=(300,60)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${BJ_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);
      // jsp code [from=(301,55);to=(301,60)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${HJ_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template26);
      // jsp code [from=(302,57);to=(302,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TAX_YN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // jsp code [from=(303,67);to=(303,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template28);
      // jsp code [from=(305,59);to=(305,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TAX_SET}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template29);
      // jsp code [from=(306,53);to=(306,57)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template30);
      // jsp code [from=(324,92);to=(324,100)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template31);
      // jsp code [from=(334,70);to=(334,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template32);
      // jsp code [from=(335,68);to=(335,76)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template33);
      // jsp code [from=(335,82);to=(335,89)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template34);
      // jsp code [from=(336,56);to=(336,64)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template35);
      // jsp code [from=(336,70);to=(336,77)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template36);
      // jsp code [from=(343,172);to=(343,180)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template37);
      // jsp code [from=(343,188);to=(343,191)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template38);
      // jsp code [from=(356,68);to=(356,76)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template39);
      // jsp code [from=(357,72);to=(357,80)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template40);
      // jsp code [from=(364,189);to=(364,197)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

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
  private final static String _jspx_template0 = "\r\n    \r\n";
  private final static String _jspx_template1 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('사용자의 사용시간이 종료되었습니다. 다시 접속 해주시기 바랍니다.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template2 = "\r\n";
  private final static String _jspx_template3 = "\r\n";
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "  \r\n";
  private final static String _jspx_template6 = "  \r\n";
  private final static String _jspx_template7 = "\r\n";
  private final static String _jspx_template8 = "\r\n";
  private final static String _jspx_template9 = "\r\n\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script language=\"javascript\" src=\"/js/Check_inputbox.js\"></script>\r\n<script language=\"javascript\" src=\"/js/Ajax_request.js\"></script>\r\n\r\n<script type=\"text/javascript\">\r\n//<![CDATA[\r\n\r\n\tfunction\tSearch()\r\n\t{\r\n\t\tvar form = document.form;\r\n\r\n\t\tform.action = \"search.do\";\r\n\t\tform.submit();\r\n\t}\r\n\r\n\tfunction iFrameResize(obj)\r\n\t{\r\n\t\tvar iFrm = obj;\r\n\t\tvar the_height = iFrm.contentWindow.document.body.scrollHeight;\r\n\r\n\t\tiFrm.style.height = the_height + \"px\";\r\n\t}\r\n\r\n\tfunction \tTabUp_Img(Tab_Value)\r\n\t{\r\n\t\tvar\timg1\t= document.getElementById(\"sanchul_img\");\r\n\t\tvar\timg2\t= document.getElementById(\"jumin_img\");\r\n\t\tvar\timg3\t= document.getElementById(\"jumji_img\");\r\n\t\r\n\t\timg1.src\t= \"/img/sub_petition_title16_off.gif\";\r\n\t\timg2.src\t= \"/img/sub_petition_title2_off_b.gif\";\r\n\t\timg3.src\t= \"/img/sub_petition_title3_off.gif\";\r\n\t\t\r\n\t\tif(Tab_Value\t== \"sanchul\")\r\n\t\t{\r\n\t\t\timg1.src\t\t= \"/img/sub_petition_title16_on.gif\";\r\n\t\t}\r\n\t\telse if(Tab_Value\t== \"jumin\")\r\n\t\t{\r\n\t\t\timg2.src\t\t= \"/img/sub_petition_title2_on_b.gif\";\r\n\t\t}\r\n\t\telse if(Tab_Value\t== \"jumji\")\r\n\t\t{\r\n\t\t\timg3.src\t\t= \"/img/sub_petition_title3_on.gif\";\r\n\t\t}\t\t\r\n\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABUP\");\r\n\t\ttab.value\t= Tab_Value;\r\n\t}\r\n\t\r\n\tfunction \tTabDown_Img(Tab_Value)\r\n\t{\r\n\t\tvar\timg1\t= document.getElementById(\"bugwa_img\");\r\n\r\n\t\timg1.src\t= \"/img/sub_petition_title12_off.gif\";\r\n\t\t\r\n\t\tif(Tab_Value\t== \"bugwa\")\r\n\t\t{\r\n\t\t\timg1.src\t\t= \"/img/sub_petition_title12_on.gif\";\r\n\t\t}\r\n\t\telse if(Tab_Value\t== \"sunap\")\r\n\t\t{\r\n\t\t\t//img2.src\t\t= \"/img/sub_petition_title14_on.gif\";\r\n\t\t}\r\n\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABDOWN\");\r\n\t\ttab.value\t= Tab_Value;\r\n\t}\r\n\t\r\n\t\r\n\tfunction Tab_Sanchul(adminno)\r\n\t{\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABUP\");\r\n\t\t\r\n\t\tif(tab.value\t== \"sanchul\")\r\n\t\t\treturn;\r\n\t\telse\r\n\t\t\ttab.value\t= \"sanchul\";\r\n\t\t\r\n\t\tvar\tseq\t= document.getElementById(\"SEQ\").value;\r\n\t\t\r\n\t\tvar tabs \t= document.getElementById(\"tabUp\");\r\n\t\ttabs.src\t= \"/jumyong/saewe/sanchul_view.do?ADMIN_NO=\" + adminno + \"&SEQ=\" + seq;// + \"&SEQ=\" + seq;\r\n\t}\r\n\r\n\tfunction Tab_Jumin(adminno,section)\r\n\t{\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABUP\");\r\n\t\tif(tab.value\t== \"jumin\")\r\n\t\t\treturn;\r\n\t\telse\r\n\t\t\ttab.value\t= \"jumin\";\r\n\t\t\r\n\t\tvar tabs \t= document.getElementById(\"tabUp\");\r\n\t\ttabs.src\t= \"/jumyong/saewe/jumin_view.do?ADMIN_NO=\" + adminno+ \"&SECTION=\"+section;\r\n\t}\r\n\t\r\n\tfunction Tab_Jumji(adminno,section)\r\n\t{\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABUP\");\r\n\t\tif(tab.value\t== \"jumji\")\r\n\t\t\treturn;\r\n\t\telse\r\n\t\t\ttab.value\t= \"jumji\";\r\n\r\n\t\tvar tabs\t= document.getElementById(\"tabUp\");\r\n\t\ttabs.src\t= \"/jumyong/saewe/jumji_view.do?ADMIN_NO=\" + adminno+ \"&SECTION=\"+section;\r\n\t}\r\n\t\r\n\tfunction Tab_Bugwa(adminno)\r\n\t{\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABDOWN\");\r\n\t\tif(tab.value\t== \"bugwa\")\r\n\t\t\treturn;\r\n\t\telse\r\n\t\t\ttab.value\t= \"bugwa\";\r\n\r\n\t\tvar\tseq\t= document.getElementById(\"SEQ\").value;\r\n\t\tvar\tSECTION\t= document.getElementById(\"SECTION\").value;\r\n\t\t\r\n\t\tvar tabs\t= document.getElementById(\"tabDown\");\r\n\t\talert(SECTION);\r\n\t\ttabs.src\t= \"/jumyong/saewe/bugwa_view.do?ADMIN_NO=\" + adminno + \"&SEQ=\" + seq+ \"&SECTION=\"+SECTION;\r\n\t}\r\n\t\r\n\tfunction Tab_Sunap(adminno)\r\n\t{\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABDOWN\");\r\n\t\tif(tab.value\t== \"sunap\")\r\n\t\t\treturn;\r\n\t\telse\r\n\t\t\ttab.value\t= \"sunap\";\r\n\t\t\r\n\t\tvar tabs\t= document.getElementById(\"tabDown\");\r\n\t\ttabs.src\t= \"/jumyong/saewe/sunap_view.do?ADMIN_NO=\" + adminno;\r\n\t}\r\n\r\n\tfunction \tInit()\r\n\t{\r\n\r\n\t}\r\n\t\r\n\tfunction \tBugwa_On()\r\n\t{\r\n\t\tvar\tVIEWPAGE\t= tabDown.document.getElementById(\"VIEWPAGE\");\r\n\r\n\t\tdocument.getElementById(\"Bugwa_On\").style.display = \"block\";\r\n\t\tdocument.getElementById(\"Bugwa_Off\").style.display = \"none\";\r\n\r\n\t}\r\n\t\r\n\tfun";
  private final static String _jspx_template10 = "ction \tBugwa_Off()\r\n\t{\r\n\t//\tvar\tVIEWPAGE\t= tabDown.document.getElementById(\"VIEWPAGE\").value;\r\n\t\tdocument.getElementById(\"Bugwa_On\").style.display = \"none\";\r\n\t\tdocument.getElementById(\"Bugwa_Off\").style.display = \"block\";\r\n\r\n\t}\r\n\t\r\n\tfunction\tBugwaCatch(year, seq)\r\n\t{\r\n\t\tdocument.getElementById(\"YEAR\").value \t\t= year;\r\n\t\r\n\t}\r\n\r\n\tfunction\tBugwaView(seq)\t//\t산출조건 클릭시 부과정보 데이터 변경 (Sanchul_view.jsp 호출)\r\n\t{\r\n\t\tvar\tadminno\t\t= document.getElementById(\"ADMIN_NO\").value;\r\n\t\tvar\tsection\t\t= document.getElementById(\"SECTION\").value;\r\n\t\t\r\n\t\tdocument.getElementById(\"SEQ\").value \t= seq;\r\n\t\t\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABDOWN\");\r\n\t\tif(tab.value\t!= \"bugwa\")\r\n\t\t\treturn;\r\n\t\t\r\n\t\tvar tabs\t= document.getElementById(\"tabDown\");\r\n\t\ttabs.src\t= \"/jumyong/saewe/bugwa_view.do?ADMIN_NO=\" + adminno + \"&SEQ=\" + seq + \"&SECTION=\" +section;\r\n\t}\r\n\t\r\n\tfunction\tSaeweSuipBugwa()\r\n\t{\r\n\t\tvar\tchild\t= tabDown.document.getElementById(\"VIEWPAGE\");\r\n\t\t\r\n\t\tif(!child)\t//\t뷰화면이 아닐 경우..\r\n\t\t{\r\n\t\t\talert(\"먼저 화면을 저장해 주세요.\");\r\n\t\t}\r\n\t\t\r\n\t\t//\talert(child.value);\r\n\t\t\r\n\t\tvar\tadminno\t= document.getElementById(\"ADMIN_NO\").value;\r\n\t\tvar\tseq\t\t= document.getElementById(\"SEQ\").value;\r\n\t\tvar\tparam\t= \"ADMIN_NO=\" + adminno + \"&SEQ=\" + seq;\r\n\t\t\r\n\t\tsendRequest(\"/jumyong/saewe/saewesuipbugwa.do\", param, \"GET\", Result_SaeweSuipBugwa);\r\n\t}\r\n\r\n\tfunction\tResult_SaeweSuipBugwa(obj)\r\n\t{\r\n\t\tif(obj != \"\"){\r\n\t\t\talert(obj);\r\n\t\t}\r\n\t\t\r\n\t\tvar\tchild\t= tabDown.document.getElementById(\"VIEWPAGE\");\r\n\t\tif(child)\t//\t뷰화면일 경우..\r\n\t\t{\r\n\t\t\tlocation.href=\"/jumyong/saewe/view.do?ADMIN_NO=";
  private final static String _jspx_template11 = "&SEQ=";
  private final static String _jspx_template12 = "\";\r\n\t\t}\r\n\t}\r\n\t\r\n\t// 고지서 발급\r\n\tfunction fGoji()\r\n\t{\t\r\n\t\tvar pGoji;\r\n\t\tvar tax_yn    =  tabDown.form.TAX_YN.value;\r\n\t\tvar sigu_cd   =  tabDown.form.sigu_cd.value;\r\n\t\tvar buseo_cd  =  tabDown.form.buseo_cd.value;\r\n\t\tvar semok_cd  =  tabDown.form.semok_cd.value;\r\n\t\tvar tax_ym    =  tabDown.form.tax_ym.value;\r\n\t\tvar tax_gubun =  tabDown.form.tax_gubun.value;\r\n\t\tvar tax_no    =  tabDown.form.tax_no.value;\r\n\t\tvar bukwa_id   =  tabDown.form.bukwa_id.value;\r\n\t\t\r\n\t\tif(tax_yn != \"1\")\r\n\t\t{\r\n\t\t\talert(\"부과된 정보가 없습니다.\");\r\n\t\t\treturn;\r\n\t\t}\r\n\t\t\r\n\t\tpGoji = \"?sigu_cd=\"+sigu_cd;\r\n\t\tpGoji = pGoji + \"&buseo_cd=\"+buseo_cd;\r\n\t\tpGoji = pGoji + \"&semok_cd=\"+semok_cd; \r\n\t\tpGoji = pGoji + \"&tax_ym=\"+tax_ym;\r\n\t\tpGoji = pGoji + \"&tax_gubun=\"+tax_gubun;\r\n\t\tpGoji = pGoji + \"&tax_no=\"+tax_no;\r\n\t\tpGoji = pGoji + \"&user_id=\"+bukwa_id;\r\n\t\t\r\n\r\n\t\t\r\n\t\t//var URL = \"http://98.33.4.5/jsp/IECall/Bu04BugaOneSearchCW.jsp\"+ pGoji;\r\n\t\tvar URL = \"http://98.33.4.164/jsp/IECall/Bu04BugaOneSearchCW.jsp\"+ pGoji;\r\n\t\t\r\n\t\twindow.open(URL,\"세외수입고지서출력\",\"width=800, height=600, left=150, top=150, toolbar=no,location=no,directories=no,status=yes,menubar=no,scrollbars=no,resizable=no\");\t  \r\n\t} \r\n\tfunction\tnr_Adminno_Cut(adminno){\r\n\t\tif(adminno.length != 20)\r\n\t\t\treturn\tadminno\r\n\t\r\n\t\tadminno\t= adminno.substr(9, 11);\r\n\t\t\r\n\t\treturn\tadminno;\r\n\t}\r\n//]]>\r\n</script>\r\n\r\n<body >\r\n<form id=\"form\" name=\"form\" method=\"post\">\r\n<input type=\"hidden\" id=\"ADMIN_NO\" name=\"ADMIN_NO\" value=\"";
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
  private final static String _jspx_template28 = "\">\r\n<!--  sungh83 검색 조건 소멸방지 데이터 세입구분 산출년도 -->\r\n<input type=\"hidden\" id=\"TAX_SET\" name=\"TAX_SET\" value=\"";
  private final static String _jspx_template29 = "\">\r\n<input type=\"hidden\" id=\"YEAR\" name=\"YEAR\" value=\"";
  private final static String _jspx_template30 = "\">\r\n<!-- sungh83 조건 소멸방지 데이터 세입구분 산출년도 -->\r\n<table width=\"800\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n  <tr>\r\n    <td height=\"43\"><img src=\"/img/sub1_cont3_title.gif\" width=\"800\" height=\"43\"></td>\r\n  </tr>\r\n  \r\n  <tr>\r\n    <td align=\"center\">\r\n    <table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n      <tr>\r\n        <td height=\"1\" bgcolor=\"eaeaea\"></td>\r\n      </tr>\r\n\t\t\r\n      <tr>\r\n        <td height=\"14\"></td>\r\n      </tr>\r\n           \r\n      <td align=\"right\" class=\"sub_table_b\">관리번호 : <script>var adminno = nr_Adminno_Cut(\"";
  private final static String _jspx_template31 = "\"); document.write(adminno);</script></td>\r\n      \r\n      <tr>\r\n        <td align=\"left\">\r\n        <table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n        \r\n        <tr>\r\n            <td height=\"22\" background=\"/img/tab_line_purple.gif\">\r\n            <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                <tr>\r\n                  <td width=\"111\"><a href=\"javascript:Tab_Sanchul('";
  private final static String _jspx_template32 = "')\"><img id=\"sanchul_img\"  name=\"sanchul_img\" src=\"/img/sub_petition_title16_on.gif\" alt=\"산출 정보\" width=\"110\" height=\"22\" border=\"0\"></a></td>\r\n                  <td width=\"111\"><a href=\"javascript:Tab_Jumin('";
  private final static String _jspx_template33 = "','";
  private final static String _jspx_template34 = "')\"><img id=\"jumin_img\" name=\"jumin_img\" src=\"/img/sub_petition_title2_off_b.gif\" alt=\"점용인 정보\" width=\"110\" height=\"22\" border=\"0\"></a></td>\r\n                  <td><a href=\"javascript:Tab_Jumji('";
  private final static String _jspx_template35 = "','";
  private final static String _jspx_template36 = "')\"><img id=\"jumji_img\" name=\"jumji_img\" src=\"/img/sub_petition_title3_off.gif\" alt=\"점용지 정보\" width=\"110\" height=\"22\" border=\"0\"></a></td>\r\n                </tr>\r\n            </table>\r\n            </td>\r\n\t\t</tr>\r\n\t\t\r\n\t\t<td>\r\n\t\t  \t<iframe width=\"100%\" height=\"100%\" id=\"tabUp\"  name=\"tabUp\" frameborder=\"0\" onload=\"iFrameResize(this)\" scrolling=\"no\" src=\"/jumyong/saewe/sanchul_view.do?ADMIN_NO=";
  private final static String _jspx_template37 = "&SEQ=";
  private final static String _jspx_template38 = "\"></iframe>\r\n\t\t</td>\r\n\t\t\r\n      <tr>\r\n        <td height=\"30\"></td>\r\n      </tr>\r\n\t\t\r\n        <tr>\r\n        <td align=\"left\">\r\n        <table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n          <tr>\r\n            <td height=\"22\" background=\"/img/tab_line_blue.gif\"><table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                <tr>\r\n                  <td width=\"111\"><a href=\"javascript:Tab_Bugwa('";
  private final static String _jspx_template39 = "')\"><img id=\"bugwa_img\"  name=\"bugwa_img\" src=\"/img/sub_petition_title12_on.gif\" alt=\"부과 정보\" width=\"110\" height=\"22\" border=\"0\"></a></td>\r\n                  <!--<td width=\"111\"><a href=\"javascript:Tab_Sunap('";
  private final static String _jspx_template40 = "')\"><img name=\"sunap_img\" src=\"/img/sub_petition_title14_off.gif\" alt=\"수납 정보\" width=\"110\" height=\"22\" border=\"0\"></a></td>-->\r\n                </tr>\r\n            </table></td>\r\n          </tr>\r\n\t\t  \r\n          <tr>\r\n  \t\t\t<TD>\r\n  \t\t\t\t<iframe width=\"100%\" height=\"150\" id=\"tabDown\" name=\"tabDown\" frameborder=\"0\" onload=\"iFrameResize(this)\" scrolling=\"no\" src=\"\"></iframe><!-- /jumyong/saewe/bugwa_view.do?ADMIN_NO=";
  private final static String _jspx_template41 = " -->\r\n  \t\t\t</TD>\r\n          </tr>\r\n          \r\n        </table>\r\n        </td>\r\n        </tr>\r\n\t\t\r\n\t\t<tr>\r\n\t\t\t<td colspan=\"0\" bgcolor=\"F6F6F6\" class=\"table_bl_left\"  align=\"right\">\r\n\t\t\t\t<span style=\"display:none\" id=\"Bugwa_On\">\r\n\t\t\t\t\t<table width=\"100%\" border=\"0\">\r\n\t\t\t\t\t<td>\r\n\t\t\t\t\t\t<img src=\"/img/notice_icon.gif\" alt=\"고지서 발급\" border=\"0\" onclick=\"javascript:fGoji();\" style=\"cursor:hand\">\r\n\t\t\t\t\t\t<img src=\"/img/levy_icon.gif\" alt=\"세외수입부과\" width=\"94\" height=\"22\" border=\"0\" onclick=\"javascript:SaeweSuipBugwa()\" style=\"cursor: pointer;\">\r\n\t\t\t\t\t\t<img src=\"/img/list_icon.gif\" alt=\"리스트\" width=\"66\" height=\"22\" border=\"0\" onclick=\"javascript:Search()\" style=\"cursor:pointer;\">\r\n\t\t\t\t\t</td>\r\n\t\t\t\t\t</table>\r\n\t\t\t\t</span>\r\n\t\t\t\t\r\n\t\t\t\t<span style=\"display:none\" id=\"Bugwa_Off\">\r\n\t\t\t\t\t<table width=\"100%\" border=\"0\">\r\n\t\t\t\t\t<td><a href=\"javascript:Search()\"><img src=\"/img/list_icon.gif\" alt=\"리스트\" width=\"66\" height=\"22\" border=\"0\"></a></td>\r\n\t\t\t\t\t</table>\r\n\t\t\t\t</span>\r\n\t\t\t<td>\r\n\t\t</tr>\r\n\t\t\r\n\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n\t\r\n\t</table>\r\n  </td>\r\n </tr>\r\n\t\r\n</table>\r\n</form>\r\n</body>\r\n</html>";
}
