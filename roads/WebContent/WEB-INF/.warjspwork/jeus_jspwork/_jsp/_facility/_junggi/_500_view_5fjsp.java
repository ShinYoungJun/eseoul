package jeus_jspwork._jsp._facility._junggi;

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
      // jsp code [from=(264,46);to=(264,53)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${corp_cd}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(265,46);to=(265,53)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${gu_code}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(266,49);to=(266,59)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${request_no}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(267,47);to=(267,55)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(268,51);to=(268,54)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(272,57);to=(272,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${toDate}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(273,61);to=(273,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${fromDate}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(274,41);to=(274,49)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${use_type}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(275,47);to=(275,58)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${use_section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(276,53);to=(276,60)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${purpose}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(277,47);to=(277,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${taxation_section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(278,43);to=(278,54)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bjdong_code}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(279,43);to=(279,54)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${hjdong_code}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(280,45);to=(280,51)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bonbun}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // jsp code [from=(281,43);to=(281,48)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bubun}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);
      // jsp code [from=(282,55);to=(282,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${jumyongName}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template26);
      // jsp code [from=(283,53);to=(283,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${check_type}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // jsp code [from=(284,55);to=(284,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${numberValue}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template28);
      // jsp code [from=(286,47);to=(286,55)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template29);
      // jsp code [from=(320,165);to=(320,173)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template30);
      // jsp code [from=(355,184);to=(355,191)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${gu_code}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template31);
      // jsp code [from=(355,203);to=(355,210)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${corp_cd}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template32);
      // jsp code [from=(355,225);to=(355,235)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${request_no}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template33);
      // jsp code [from=(355,294);to=(355,302)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template34);
      // jsp code [from=(356,179);to=(356,186)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${gu_code}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template35);
      // jsp code [from=(356,198);to=(356,205)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${corp_cd}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template36);
      // jsp code [from=(356,220);to=(356,230)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${request_no}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template37);
      // jsp code [from=(356,239);to=(356,243)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${year}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template38);
      // jsp code [from=(356,255);to=(356,263)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${tax_set }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template39);
      // jsp code [from=(356,320);to=(356,328)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template40);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_0_fn(pageContext, null)) return;


      out.write(_jspx_template42);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_1_fn(pageContext, null)) return;


      out.write(_jspx_template44);

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
  private boolean _jspx_th_c_if_0_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:if ---- //
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = new org.apache.taglibs.standard.tag.rt.core.IfTag();
    _jspx_th_c_if_0.setPageContext(pageContext);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${showExamination == 'true'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template41);

        } while (_jspx_th_c_if_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_0.release();
    }
    return false;
  }

  private boolean _jspx_th_c_if_1_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:if ---- //
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = new org.apache.taglibs.standard.tag.rt.core.IfTag();
    _jspx_th_c_if_1.setPageContext(pageContext);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${showLicense == 'true'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
      if (_jspx_eval_c_if_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template43);

        } while (_jspx_th_c_if_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_1.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_1.release();
    }
    return false;
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
  private final static String _jspx_template9 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n\r\n\t\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script language=\"javascript\" src=\"/js/Check_inputbox.js\"></script>\r\n<script language=\"javascript\" src=\"/js/Ajax_request.js\"></script>\r\n\r\n<script type=\"text/javascript\">\r\n//<![CDATA[\r\n\tfunction\tSearch()\r\n\t{\r\n\t\tvar form = document.form;\r\n\r\n\t\tform.action = \"search.do\";\r\n\t\tform.submit();\r\n\t}\r\n\r\n\tfunction iFrameResize(obj)\r\n\t{\r\n\t\tvar iFrm = obj;\r\n\t\tvar the_height = iFrm.contentWindow.document.body.scrollHeight;\r\n\t\tiFrm.style.height = the_height;\r\n\t}\r\n\r\n\tfunction \tTabUp_Img(Tab_Value)\r\n\t{\r\n\t\tvar\timg1\t= document.getElementById(\"minwon_img\");\r\n\t\tvar\timg2\t= document.getElementById(\"jumin_img\");\r\n\t\tvar\timg3\t= document.getElementById(\"jumji_img\");\r\n\t\r\n\t\timg1.src\t= \"/img/sub_petition_title9_off.gif\";\r\n\t\timg2.src\t= \"/img/sub_petition_title2_off.gif\";\r\n\t\timg3.src\t= \"/img/sub_petition_title3_off.gif\";\r\n\t\t\r\n\t\tif(Tab_Value\t== \"minwon\")\r\n\t\t{\r\n\t\t\timg1.src\t\t= \"/img/sub_petition_title9_on.gif\";\r\n\t\t}\r\n\t\telse if(Tab_Value\t== \"jumin\")\r\n\t\t{\r\n\t\t\timg2.src\t\t= \"/img/sub_petition_title2_on.gif\";\r\n\t\t}\r\n\t\telse if(Tab_Value\t== \"jumji\")\r\n\t\t{\r\n\t\t\timg3.src\t\t= \"/img/sub_petition_title3_on.gif\";\r\n\t\t}\t\t\r\n\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABUP\");\r\n\t\ttab.value\t= Tab_Value;\r\n\t}\r\n\t\r\n\tfunction \tTab_Img(Tab_Value)\r\n\t{\r\n\t\tvar\timg1\t= document.getElementById(\"minwon_img\");\r\n\t\tvar\timg2\t= document.getElementById(\"jumin_img\");\r\n\t\tvar\timg3\t= document.getElementById(\"jumji_img\");\r\n\t\r\n\t\timg1.src\t= \"/img/sub_petition_title9_off.gif\";\r\n\t\timg2.src\t= \"/img/sub_petition_title2_off.gif\";\r\n\t\timg3.src\t= \"/img/sub_petition_title3_off.gif\";\r\n\t\t\r\n\t\tif(Tab_Value\t== \"minwon\")\r\n\t\t{\r\n\t\t\timg1.src\t\t= \"/img/sub_petition_title9_on.gif\";\r\n\t\t}\r\n\t\telse if(Tab_Value\t== \"jumin\")\r\n\t\t{\r\n\t\t\timg2.src\t\t= \"/img/sub_petition_title2_on.gif\";\r\n\t\t}\r\n\t\telse if(Tab_Value\t== \"jumji\")\r\n\t\t{\r\n\t\t\timg3.src\t\t= \"/img/sub_petition_title3_on.gif\";\r\n\t\t}\t\t\r\n\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABUP\");\r\n\t\ttab.value\t= Tab_Value;\r\n\t}\r\n\t\r\n\tfunction \tTabDown_Img(Tab_Value)\r\n\t{\r\n\t\tvar\timg1\t= document.getElementById(\"product_img\");\r\n\r\n\t\tvar\timg5\t= document.getElementById(\"history_img\");\r\n\t\t\r\n\r\n\r\n\t\timg1.src\t= \"/img/sub_petition_title4_off.gif\";\r\n\r\n\t\timg5.src\t= \"/img/sub_petition_title8_off.gif\";\r\n\t\t\r\n\t\t\r\n\t\t\r\n\t\t\r\n\t\tif(Tab_Value\t== \"product\")\r\n\t\t{\r\n\t\t\timg1.src\t\t= \"/img/sub_petition_title4_on.gif\";\r\n\t\t}\r\n\t\telse if(Tab_Value\t== \"inspect\")\r\n\t\t{\r\n\t\t\timg2.src\t\t= \"/img/sub_petition_title5_on.gif\";\r\n\t\t}else if(Tab_Value\t== \"conf\")\r\n\t\t{\r\n\t\t\timg3.src\t\t= \"/img/sub_petition_title6_on.gif\";\r\n\t\t}else if(Tab_Value\t== \"history\")\r\n\t\t{\r\n\t\t\timg5.src\t\t= \"/img/sub_petition_title8_on.gif\";\r\n\t\t}\r\n\t\t\r\n\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABDOWN\");\r\n\t\ttab.value\t= Tab_Value;\r\n\r\n\t}\r\n\t\r\n\t\r\n\tfunction \tTab_ImgChange(Tab_Value,Tab_Src,tabsValue)\r\n\t{\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABUP\");\r\n\t\tif(tab.value\t== Tab_Value)\r\n\t\t\treturn;\r\n\t\telse\r\n\t\t\ttab.value\t= Tab_Value;\r\n\t\r\n\t\tvar tabs \t= document.getElementById(tabsValue);\r\n\t\t\r\n\t\tif(tabsValue == 'tabUp')\r\n\t\t\tTabUp_Img(Tab_Value);\r\n\t\telse\r\n\t\t\tTabDown_Img(Tab_Value);\r\n\t\t\t\r\n\t\tvar adminno = document.getElementById(\"adminno\").value;\r\n\t\tvar gu_code = document.getElementById(\"GU_CODE\").value;\r\n\t\tvar corp_cd = document.getElementById(\"CORP_CD\").value;\r\n\t\tvar request_no = document.getElementById(\"REQUEST_NO\").value;\r\n\t\t\r\n\t\t\r\n\t\tif(Tab_Src != \" \")\r\n\t\t\ttabs.src\t= Tab_Src+\"?ADMIN_NO=\"+ adminno +\"&GU_CODE=\" + gu_code+\"&CORP_CD=\"+corp_cd+\"&REQUEST_NO=\"+request_no;\r\n\t\r\n\t}\r\n\r\n\tfunction \tInit()\r\n\t{\t\r\n\t\t/*var iFrm = document.getElementById(\"tabUp1\");\r\n\t\tvar the_height = 0;\r\n\t\tiFrm.style.height = the_height;*/\r\n\t}\r\n\r\n\tfunction\tBugwaCatch(year, seq)\r\n\t{\r\n\t\tdocument.getElementById(\"YEAR\").value \t\t= year;\r\n\t}\r\n\r\n\tfunction\tBugwaView(seq)\t//\t산출조건 클릭시 부과정보 데이터 ";
  private final static String _jspx_template10 = "변경 (Minwon_view.jsp 호출)\r\n\t{\r\n\r\n\t\tvar\tadminno\t\t= document.getElementById(\"ADMIN_NO\").value;\r\n\t\t\r\n\t\tdocument.getElementById(\"SEQ\").value \t= seq;\r\n\t\t\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABDOWN\");\r\n\t\tif(tab.value\t!= \"bugwa\")\r\n\t\t\treturn;\r\n\t\t\r\n\t\tvar tabs\t= document.getElementById(\"tabDown\");\r\n\t\ttabs.src\t= \"/jumyong/saewe/bugwa_view.do?ADMIN_NO=\" + adminno + \"&SEQ=\" + seq;\r\n\t\ttabs.src\t= \"/jumyong/junggi/bugwa_view.do?ADMIN_NO=\" + adminno + \"&SEQ=\" + seq;\t\t\r\n\t}\r\n\t\r\n\tfunction\tSaeweSuipBugwa()\r\n\t{\r\n\t\tvar\tchild\t= tabDown.document.getElementById(\"VIEWPAGE\");\r\n\r\n\t\tif(!child)\t//\t뷰화면이 아닐 경우..\r\n\t\t{\r\n\t\t\talert(\"먼저 화면을 저장해 주세요.\");\r\n\t\t\treturn;\r\n\t\t}\r\n\t\t\r\n\t\tvar\tadminno\t= document.getElementById(\"ADMIN_NO\").value;\r\n\t\tvar\tseq\t\t= document.getElementById(\"SEQ\").value;\r\n\t\tvar\tparam\t= \"ADMIN_NO=\" + adminno + \"&SEQ=\" + seq;\r\n\r\n\t\tsendRequest(\"/jumyong/saewe/saewesuipbugwa.do\", param, \"GET\", Result_SaeweSuipBugwa);\r\n\t}\r\n\r\n\tfunction\tResult_SaeweSuipBugwa(obj)\r\n\t{\r\n\t\tif(obj == \"0\")\t\t\t\r\n\t\t\talert(\"데이터가 없습니다.\");\r\n\t\telse if(obj == \"1\")\t\t\t\r\n\t\t\talert(\"부과 되었습니다.\");\r\n\t\telse if(obj == \"2\")\t\t\t\r\n\t\t\talert(\"부과된 정보입니다.\");\r\n\t}\r\n\t\r\n\tfunction goSearch()\r\n\t{\r\n\t\tvar toDate = document.getElementById(\"searchToDate\").value;\r\n\t\tvar fromDate = document.getElementById(\"searchFromDate\").value;\r\n\t\tvar type = document.getElementById(\"TYPE\").value;\r\n\t\tvar section = document.getElementById(\"SECTION\").value;\r\n\t\tvar purpose = document.getElementById(\"PURPOSE_CD\").value;\t\t\r\n\t\tvar tax_set = document.getElementById(\"TAX_SET\").value;\r\n\t\tvar bj_cd = document.getElementById(\"BJ_CD\").value;\r\n\t\tvar hj_cd = document.getElementById(\"HJ_CD\").value;\r\n\t\tvar bonbun = document.getElementById(\"BONBUN\").value;\r\n\t\tvar bubun = document.getElementById(\"BUBUN\").value;\r\n\t\tvar jumyongName = document.getElementById(\"jumyongName\").value;\r\n\t\tvar check_type = document.getElementById(\"check_type\").value;\r\n\t\tvar numberValue = document.getElementById(\"numberValue\").value;\t\t\t\t\r\n\r\n\t\tlocation.href=\"/facility/junggi/search.do?tDate=\"+toDate+\"&fDate=\"+fromDate+\"&type=\"+type+\"&section=\"+section\r\n\t\t+\"&tax_set=\"+tax_set+\"&purpose=\"+purpose+\"&bj_cd=\"+bj_cd+\"&hj_cd=\"+hj_cd\r\n\t\t+\"&bonbun=\"+bonbun+\"&bubun=\"+bubun+\"&jumyongName=\"+jumyongName+\"&check_type=\"+check_type+\"&numberValue=\"+numberValue;\r\n\t}\r\n\t\r\n\tfunction fnPreView()\r\n\t{\r\n\t\twindow.open('/jsp/jumyong/jumyong/examination.html', \"도로점용_산출조사서\", \"resizable=no, status=no, scrollbars=no, toolbar=no, menubar=no, width=880, height=800\");\t\r\n\t}\r\n\t\r\n\tfunction fnOccupancyLicense()\r\n\t{\r\n\t\twindow.open('/jsp/jumyong/jumyong/occupancyLicense.html', \"점용허가증\", \"resizable=no, status=no, scrollbars=no, toolbar=no, menubar=no, width=880, height=800\");\t\r\n\t}\r\n\t\r\n\t//\t관리자 번호 앞에 9자리 삭제\r\n\tfunction\tnr_Adminno_Cut2(adminno)\r\n\t{\r\n\t\tif(adminno.length != 20)\r\n\t\t\treturn\tadminno\r\n\t\r\n\t\tadminno\t= adminno.substr(9, 10);\r\n\t\t\r\n\t\treturn\tadminno;\r\n\t}\r\n//]]>\r\n</script>\r\n\r\n<body onload=\"Init();\">\r\n<table width=\"800\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n<form name=\"form\" method=\"post\">\r\n<input type=\"hidden\" name=\"CORP_CD\" value=\"";
  private final static String _jspx_template11 = "\">\r\n<input type=\"hidden\" name=\"GU_CODE\" value=\"";
  private final static String _jspx_template12 = "\">\r\n<input type=\"hidden\" name=\"REQUEST_NO\" value=\"";
  private final static String _jspx_template13 = "\">\r\n<input type=\"hidden\" name=\"ADMIN_NO\" value=\"";
  private final static String _jspx_template14 = "\">\r\n<input type=\"hidden\" name=\"SEQ\" id=\"SEQ\" value=\"";
  private final static String _jspx_template15 = "\">\r\n<input type=\"hidden\" name=\"CURRENT_TABUP\" value=\"minwon\">\r\n<input type=\"hidden\" name=\"CURRENT_TABDOWN\" id=\"CURRENT_TABDOWN\" value=\"product\">\r\n<input type=\"hidden\" name=\"year\" value=\"\">\r\n<input name=\"searchToDate\" id = \"searchToDate\" value=\"";
  private final static String _jspx_template16 = "\" type=\"hidden\">\r\n<input name=\"searchFromDate\" id = \"searchFromDate\" value=\"";
  private final static String _jspx_template17 = "\" type=\"hidden\">\r\n<input name=\"TYPE\" id = \"TYPE\" value=\"";
  private final static String _jspx_template18 = "\" type=\"hidden\">\r\n<input name=\"SECTION\" id = \"SECTION\" value=\"";
  private final static String _jspx_template19 = "\" type=\"hidden\">\r\n<input name=\"PURPOSE_CD\" id = \"PURPOSE_CD\" value=\"";
  private final static String _jspx_template20 = "\" type=\"hidden\">\r\n<input name=\"TAX_SET\" id = \"TAX_SET\" value=\"";
  private final static String _jspx_template21 = "\" type=\"hidden\">\r\n<input name=\"BJ_CD\" id = \"BJ_CD\" value=\"";
  private final static String _jspx_template22 = "\" type=\"hidden\">\r\n<input name=\"HJ_CD\" id = \"HJ_CD\" value=\"";
  private final static String _jspx_template23 = "\" type=\"hidden\">\t\t\r\n<input name=\"BONBUN\" id = \"BONBUN\" value=\"";
  private final static String _jspx_template24 = "\" type=\"hidden\">\r\n<input name=\"BUBUN\" id = \"BUBUN\" value=\"";
  private final static String _jspx_template25 = "\" type=\"hidden\">\r\n<input name=\"jumyongName\" id = \"jumyongName\" value=\"";
  private final static String _jspx_template26 = "\" type=\"hidden\">\r\n<input name=\"check_type\" id = \"check_type\" value=\"";
  private final static String _jspx_template27 = "\" type=\"hidden\">\r\n<input name=\"numberValue\" id = \"numberValue\" value=\"";
  private final static String _jspx_template28 = "\" type=\"hidden\">\r\n\r\n<input name=\"adminNo\" id = \"adminNo\" value=\"";
  private final static String _jspx_template29 = "\" type=\"hidden\">\r\n\r\n  <tr>\r\n    <td height=\"43\"><img src=\"/img/sub2_cont1_title.gif\" width=\"800\" height=\"43\"></td>\r\n  </tr>\r\n  \r\n  <tr>\r\n    <td align=\"center\">\r\n    <table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n      <tr>\r\n        <td height=\"1\" bgcolor=\"eaeaea\"></td>\r\n      </tr>\r\n      <tr>\r\n        <td height=\"14\"></td>\r\n      </tr>\r\n\r\n      \r\n      <tr>\r\n        <td align=\"left\">\r\n        <table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n        \r\n        <!-- <tr>\r\n            <td height=\"22\" background=\"/img/tab_line_purple.gif\">\r\n            <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                <tr>\r\n                  <td width=\"111\"><a href=\"javascript:Tab_ImgChange('minwon','/facility/junggiinfo/minwon_view.do','tabUp')\"><img name=\"minwon_img\" src=\"/img/sub_petition_title9_on.gif\" alt=\"민원 정보\" width=\"110\" height=\"22\" border=\"0\"></a></td>\r\n                  <td width=\"111\"><a href=\"javascript:Tab_ImgChange('jumin','/facility/junggiinfo/jumin_view.do','tabUp')\"><img name=\"jumin_img\" src=\"/img/sub_petition_title2_off.gif\" alt=\"점용인 정보\" width=\"110\" height=\"22\" border=\"0\"></a></td>\r\n                  <td width=\"111\"><a href=\"javascript:Tab_ImgChange('jumji','/facility/junggiinfo/jumji_view.do','tabUp')\"><img name=\"jumji_img\" src=\"/img/sub_petition_title3_off.gif\" alt=\"점용지 정보\" width=\"110\" height=\"22\" border=\"0\"></a></td>\r\n                </tr>\r\n            </table>\r\n            </td>\r\n\t\t</tr>\r\n\t  <tr>\r\n\t\t<td>\r\n\t\t  \t<iframe width=\"100%\" height=\"100%\" name=\"tabUp\" frameborder=\"0\" onload=\"iFrameResize(this)\" scrolling=\"no\" src=\"/facility/junggiinfo/minwon_view.do?ADMIN_NO=";
  private final static String _jspx_template30 = "\"></iframe>\r\n\t\t</td>\r\n\t  </tr>\r\n      <tr>\r\n        <td height=\"30\"></td>\r\n      </tr>\r\n      <tr>\r\n\t\t<td>\r\n\t\t  \t<span onclick=\"iFrameResize(document.getElementById('tabUp1'));\" class=\"sub_table\" style=\"cursor:pointer\">해지 등록</span>\r\n\t\t</td>\r\n\t  </tr>\r\n      \r\n      <tr>\r\n\t\t<td>\r\n\t\t  \t<iframe width=\"100%\" height=\"100%\" id=\"tabUp1\" name=\"tabUp1\" frameborder=\"0\" onload=\"iFrameResize(this)\" scrolling=\"no\" src=\" \"></iframe>\r\n\t\t</td>\r\n\t  </tr>\r\n\t  \r\n\t   <tr>\r\n        <td height=\"30\"></td>\r\n      </tr> -->\r\n\r\n      <tr>\r\n        <td align=\"left\">\r\n        <table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n          <tr>\r\n            <td height=\"22\" background=\"/img/tab_line_blue.gif\"><table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                <tr>\r\n                  <td width=\"111\" onclick =\"javascript:Tab_ImgChange('product','/facility/junggi/product_view.do','tabDown')\"><img id=\"product_img\" name=\"product_img\" src=\"/img/sub_petition_title4_on.gif\" alt=\"산출내역\" width=\"110\" height=\"22\" border=\"0\" style=\"cursor:pointer\" ></td>\r\n\t\t          <!-- td width=\"111\" onclick =\"javascript:Tab_ImgChange('history',' ','tabDown')\"><img id=\"history_img\" name=\"history_img\" src=\"/img/sub_petition_title8_off.gif\" alt=\"이력정보\" width=\"110\" height=\"22\" border=\"0\" style=\"cursor:pointer\" ></td-->\r\n                </tr>\r\n            </table></td>\r\n          </tr>\r\n          <tr>\r\n  \t\t\t<td>\r\n  \t\t\t\t<!-- iframe width=\"100%\" height=\"150\" id = \"tabDown\" name=\"tabDown\" frameborder=\"0\" onload=\"iFrameResize(this);\" scrolling=\"no\" src=\"/facility/junggi/productInsert.do?GU_CODE=";
  private final static String _jspx_template31 = "&CORP_CD=";
  private final static String _jspx_template32 = "&REQUEST_NO=";
  private final static String _jspx_template33 = "\"--></iframe><!-- /jumyong/saewe/bugwa_view.do?ADMIN_NO=";
  private final static String _jspx_template34 = " -->\r\n  \t\t\t\t<iframe width=\"100%\" height=\"150\" id = \"tabDown\" name=\"tabDown\" frameborder=\"0\" onload=\"iFrameResize(this);\" scrolling=\"no\" src=\"/facility/junggi/product_view.do?GU_CODE=";
  private final static String _jspx_template35 = "&CORP_CD=";
  private final static String _jspx_template36 = "&REQUEST_NO=";
  private final static String _jspx_template37 = "&year=";
  private final static String _jspx_template38 = "&tax_set=";
  private final static String _jspx_template39 = "\"></iframe><!-- /jumyong/saewe/bugwa_view.do?ADMIN_NO=";
  private final static String _jspx_template40 = " -->  \t\t\t\t\r\n  \t\t\t</td>\r\n          </tr>\r\n        </table>\r\n        </td>\r\n      </tr>\r\n\t\t\r\n\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n\t<tr>\r\n      <td height=\"40\" align=\"right\">\r\n\t\t\t";
  private final static String _jspx_template41 = " \t\t\t\t\t\t\t\t                \t\r\n\t\t\t\t<img src=\"/img/produ_icon.gif\" alt=\"산출조사서\" width=\"84\" height=\"22\" border=\"0\" onclick=\"javascript:fnPreView();\" style=\"cursor:pointer\">\r\n\t\t\t";
  private final static String _jspx_template42 = "\r\n\r\n\t\t\t";
  private final static String _jspx_template43 = " \t\t\t\t\t\t\t\t                \t\r\n\t\t\t\t<img src=\"/img/occu_icon.gif\" alt=\"점용허가증\" width=\"84\" height=\"22\" onclick=\"javascript:fnOccupancyLicense();\"  border=\"0\" style=\"cursor:pointer\">\r\n\t\t\t";
  private final static String _jspx_template44 = "\r\n\t\t  \r\n\t      <img src=\"/img/list_icon.gif\" alt=\"리스트\" width=\"66\" height=\"22\" border=\"0\" onclick=\"javascript:goSearch();\" style=\"cursor:pointer\" >\r\n      </td>\r\n\t</tr>\r\n\t<tr>\r\n      <td height=\"20\" ></td>\r\n\t</tr>\r\n\t</table>\r\n  </td>\r\n </tr>\r\n\t\r\n</table>\r\n</body>\r\n</html>";
}
