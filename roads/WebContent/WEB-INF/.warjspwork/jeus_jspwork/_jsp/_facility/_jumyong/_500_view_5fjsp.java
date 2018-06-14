package jeus_jspwork._jsp._facility._jumyong;

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
      // jsp code [from=(158,126);to=(158,130)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${year}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(282,55);to=(282,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(282,75);to=(282,82)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${gu_code}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(282,94);to=(282,101)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${corp_cd}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(282,116);to=(282,126)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${request_no}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(282,135);to=(282,139)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${year}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(302,55);to=(302,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(302,75);to=(302,82)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${gu_code}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(302,94);to=(302,101)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${corp_cd}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(302,116);to=(302,126)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${request_no}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(302,135);to=(302,139)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${year}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(312,46);to=(312,53)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${corp_cd}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(313,46);to=(313,53)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${gu_code}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(314,49);to=(314,59)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${request_no}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(315,61);to=(315,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // jsp code [from=(316,51);to=(316,54)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);
      // jsp code [from=(319,57);to=(319,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${toDate}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template26);
      // jsp code [from=(320,61);to=(320,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${fromDate}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // jsp code [from=(321,41);to=(321,49)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${use_type}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template28);
      // jsp code [from=(322,47);to=(322,58)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${use_section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template29);
      // jsp code [from=(323,53);to=(323,60)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${purpose}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template30);
      // jsp code [from=(324,47);to=(324,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${taxation_section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template31);
      // jsp code [from=(325,43);to=(325,54)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bjdong_code}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template32);
      // jsp code [from=(326,43);to=(326,54)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${hjdong_code}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template33);
      // jsp code [from=(327,45);to=(327,51)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bonbun}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template34);
      // jsp code [from=(328,43);to=(328,48)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bubun}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template35);
      // jsp code [from=(329,55);to=(329,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${jumyongName}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template36);
      // jsp code [from=(330,53);to=(330,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${check_type}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template37);
      // jsp code [from=(331,55);to=(331,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${numberValue}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template38);
      // jsp code [from=(332,47);to=(332,54)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${adminno}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template39);
      // jsp code [from=(349,93);to=(349,100)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${adminno}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template40);
      // jsp code [from=(368,166);to=(368,174)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template41);
      // jsp code [from=(398,180);to=(398,187)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${gu_code}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template42);
      // jsp code [from=(398,199);to=(398,206)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${corp_cd}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template43);
      // jsp code [from=(398,221);to=(398,231)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${request_no}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template44);
      // jsp code [from=(398,240);to=(398,244)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${year}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template45);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_0_fn(pageContext, null)) return;


      out.write(_jspx_template47);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_1_fn(pageContext, null)) return;


      out.write(_jspx_template49);
      // jsp code [from=(433,8);to=(433,12)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${flag}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template50);

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
          out.write(_jspx_template46);

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
          out.write(_jspx_template48);

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
  private final static String _jspx_template9 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script language=\"javascript\" src=\"/js/Check_inputbox.js\"></script>\r\n<script language=\"javascript\" src=\"/js/Ajax_request.js\"></script>\r\n\r\n<script type=\"text/javascript\">\r\n//<![CDATA[\r\n\tfunction\tSearch()\r\n\t{\r\n\t\tvar form = document.form;\r\n\r\n\t\tform.action = \"search.do\";\r\n\t\tform.submit();\r\n\t}\r\n\r\n\tfunction iFrameResize(obj)\r\n\t{\r\n\t\tvar iFrm = obj;\r\n\t\tvar the_height = iFrm.contentWindow.document.body.scrollHeight;\r\n\t\tiFrm.style.height = the_height;\r\n\t}\r\n\r\n\tfunction \tTabUp_Img(Tab_Value)\r\n\t{\r\n\t\tvar\timg1\t= document.getElementById(\"minwon_img\");\r\n\t\tvar\timg2\t= document.getElementById(\"jumin_img\");\r\n\t\tvar\timg3\t= document.getElementById(\"jumji_img\");\r\n\t\r\n\t\timg1.src\t= \"/img/sub_petition_title9_off.gif\";\r\n\t\timg2.src\t= \"/img/sub_petition_title2_off_b.gif\";\r\n\t\timg3.src\t= \"/img/sub_facility_title3_off.gif\";\r\n\t\t\r\n\t\tif(Tab_Value\t== \"minwon\")\r\n\t\t{\r\n\t\t\timg1.src\t\t= \"/img/sub_petition_title9_on.gif\";\r\n\t\t}\r\n\t\telse if(Tab_Value\t== \"jumin\")\r\n\t\t{\r\n\t\t\timg2.src\t\t= \"/img/sub_petition_title2_on_b.gif\";\r\n\t\t}\r\n\t\telse if(Tab_Value\t== \"jumji\")\r\n\t\t{\r\n\t\t\timg3.src\t\t= \"/img/sub_facility_title3_on.gif\";\r\n\t\t}\t\t\r\n\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABUP\");\r\n\t\ttab.value\t= Tab_Value;\r\n\t}\r\n\t\r\n\tfunction \tTab_Img(Tab_Value)\r\n\t{\r\n\t\tvar\timg1\t= document.getElementById(\"minwon_img\");\r\n\t\tvar\timg2\t= document.getElementById(\"jumin_img\");\r\n\t\tvar\timg3\t= document.getElementById(\"jumji_img\");\r\n\t\r\n\t\timg1.src\t= \"/img/sub_petition_title9_off.gif\";\r\n\t\timg2.src\t= \"/img/sub_petition_title2_off_b.gif\";\r\n\t\timg3.src\t= \"/img/sub_facility_title3_off.gif\";\r\n\t\t\r\n\t\tif(Tab_Value\t== \"minwon\")\r\n\t\t{\r\n\t\t\timg1.src\t\t= \"/img/sub_petition_title9_on.gif\";\r\n\t\t}\r\n\t\telse if(Tab_Value\t== \"jumin\")\r\n\t\t{\r\n\t\t\timg2.src\t\t= \"/img/sub_petition_title2_on_b.gif\";\r\n\t\t}\r\n\t\telse if(Tab_Value\t== \"jumji\")\r\n\t\t{\r\n\t\t\timg3.src\t\t= \"/img/sub_facility_title3_on.gif\";\r\n\t\t}\t\t\r\n\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABUP\");\r\n\t\ttab.value\t= Tab_Value;\r\n\t}\r\n\t\r\n\tfunction \tTabDown_Img(Tab_Value)\r\n\t{\r\n\t\tvar\timg1\t= document.getElementById(\"product_img\");\r\n\t\tvar\timg4\t= document.getElementById(\"place_img\");\t\t\r\n//\t\tvar\timg5\t= document.getElementById(\"history_img\");\r\n\t\t\r\n\t\timg1.src\t= \"/img/sub_petition_title4_off.gif\";\r\n\t\timg4.src\t= \"/img/sub_petition_title7_off.gif\";\r\n//\t\timg5.src\t= \"/img/sub_petition_title8_off.gif\";\r\n\t\t\r\n\t\t\r\n\t\t\r\n\t\t\r\n\t\tif(Tab_Value\t== \"product\")\r\n\t\t{\r\n\t\t\timg1.src\t\t= \"/img/sub_petition_title4_on.gif\";\r\n\t\t}\r\n\t\telse if(Tab_Value\t== \"inspect\")\r\n\t\t{\r\n\t\t\timg2.src\t\t= \"/img/sub_petition_title5_on.gif\";\r\n\t\t}else if(Tab_Value\t== \"conf\")\r\n\t\t{\r\n\t\t\timg3.src\t\t= \"/img/sub_petition_title6_on.gif\";\r\n\t\t}else if(Tab_Value\t== \"place\")\r\n\t\t{\r\n\t\t\timg4.src\t\t= \"/img/sub_petition_title7_on.gif\";\r\n\t\t}else if(Tab_Value\t== \"history\")\r\n\t\t{\r\n\t\t\timg5.src\t\t= \"/img/sub_petition_title8_on.gif\";\r\n\t\t}\r\n\t\t\r\n\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABDOWN\");\r\n\t\ttab.value\t= Tab_Value;\r\n\r\n\t}\r\n\t\r\n\tfunction \tTab_ImgChange(Tab_Value,Tab_Src,tabsValue)\r\n\t{\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABUP\");\r\n\t\tif(tab.value\t== Tab_Value)\r\n\t\t\treturn;\r\n\t\telse\r\n\t\t\ttab.value\t= Tab_Value;\r\n\t\r\n\t\tvar tabs \t= document.getElementById(tabsValue);\r\n\t\t\r\n\t\tif(tabsValue == 'tabUp')\r\n\t\t\tTabUp_Img(Tab_Value);\r\n\t\telse\r\n\t\t\tTabDown_Img(Tab_Value);\r\n\t\t\t\r\n\t\tvar ADMIN_NO = document.getElementById(\"ADMIN_NO\").value;\r\n\t\tvar gu_code = document.getElementById(\"GU_CODE\").value;\r\n\t\tvar corp_cd = document.getElementById(\"CORP_CD\").value;\r\n\t\tvar request_no = document.getElementById(\"REQUEST_NO\").value;\r\n\r\n\t\tif(Tab_Src != \" \")\r\n\t\t\ttabs.src\t= Tab_Src+\"?ADMIN_NO=\"+ ADMIN_NO +\"&GU_CODE=\" + gu_code+\"&CORP_CD=\"+corp_cd+\"&REQUEST_NO=\"+request_no+\"&YEAR=\"+";
  private final static String _jspx_template10 = ";\r\n\t\r\n\t}\r\n\r\n\tfunction \tInit()\r\n\t{\t\r\n\t\tvar iFrm = document.getElementById(\"tabUp1\");\r\n\t\tvar the_height = 0;\r\n\t\tiFrm.style.height = the_height;\r\n\t}\r\n\r\n\tfunction\tBugwaCatch(year, seq)\r\n\t{\r\n\t\tdocument.getElementById(\"YEAR\").value \t\t= year;\r\n\t}\r\n\r\n\tfunction\tBugwaView(seq)\t//\t산출조건 클릭시 부과정보 데이터 변경 (Minwon_view.jsp 호출)\r\n\t{\r\n\r\n\t\tvar\tADMIN_NO\t\t= document.getElementById(\"ADMIN_NO\").value;\r\n\t\t\r\n\t\tdocument.getElementById(\"SEQ\").value \t= seq;\r\n\t\t\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABDOWN\");\r\n\t\tif(tab.value\t!= \"bugwa\")\r\n\t\t\treturn;\r\n\t\t\r\n\t\tvar tabs\t= document.getElementById(\"tabDown\");\r\n\t\ttabs.src\t= \"/jumyong/saewe/bugwa_view.do?ADMIN_NO=\" + ADMIN_NO + \"&SEQ=\" + seq;\r\n\t\ttabs.src\t= \"/jumyong/junggi/bugwa_view.do?ADMIN_NO=\" + ADMIN_NO + \"&SEQ=\" + seq;\t\t\r\n\t}\r\n\t\r\n\tfunction\tSaeweSuipBugwa()\r\n\t{\r\n\t\tvar\tchild\t= tabDown.document.getElementById(\"VIEWPAGE\");\r\n\r\n\t\tif(!child)\t//\t뷰화면이 아닐 경우..\r\n\t\t{\r\n\t\t\talert(\"먼저 화면을 저장해 주세요.\");\r\n\t\t\treturn;\r\n\t\t}\r\n\t\t\r\n\t\t//\talert(child.value);\r\n\t\t\r\n\t\tvar\tADMIN_NO\t= document.getElementById(\"ADMIN_NO\").value;\r\n\t\tvar\tseq\t\t= document.getElementById(\"SEQ\").value;\r\n\t\tvar\tparam\t= \"ADMIN_NO=\" + ADMIN_NO + \"&SEQ=\" + seq;\r\n\r\n\t\tsendRequest(\"/jumyong/saewe/saewesuipbugwa.do\", param, \"GET\", Result_SaeweSuipBugwa);\r\n\t}\r\n\r\n\tfunction\tResult_SaeweSuipBugwa(obj)\r\n\t{\r\n\t\tif(obj == \"0\")\t\t\t\r\n\t\t\talert(\"데이터가 없습니다.\");\r\n\t\telse if(obj == \"1\")\t\t\t\r\n\t\t\talert(\"부과 되었습니다.\");\r\n\t\telse if(obj == \"2\")\t\t\t\r\n\t\t\talert(\"부과된 정보입니다.\");\r\n\t}\r\n\t\r\n\t\r\n\t\r\n\t\r\n\t\r\n\tfunction goSearch()\r\n\t{\r\n\t\tvar toDate = document.getElementById(\"searchToDate\").value;\r\n\t\tvar fromDate = document.getElementById(\"searchFromDate\").value;\r\n\t\tvar type = document.getElementById(\"TYPE\").value;\r\n\t\tvar section = document.getElementById(\"SECTION\").value;\r\n\t\tvar purpose = document.getElementById(\"PURPOSE_CD\").value;\t\t\r\n\t\tvar tax_set = document.getElementById(\"TAX_SET\").value;\r\n\t\tvar bj_cd = document.getElementById(\"BJ_CD\").value;\r\n\t\tvar hj_cd = document.getElementById(\"HJ_CD\").value;\r\n\t\tvar bonbun = document.getElementById(\"BONBUN\").value;\r\n\t\tvar bubun = document.getElementById(\"BUBUN\").value;\r\n\t\tvar jumyongName = document.getElementById(\"jumyongName\").value;\r\n\t\tvar check_type = document.getElementById(\"check_type\").value;\r\n\t\tvar numberValue = document.getElementById(\"numberValue\").value;\t\t\t\t\r\n\r\n\t\tlocation.href=\"/facility/jumyong/search.do?tDate=\"+toDate+\"&fDate=\"+fromDate+\"&type=\"+type+\"&section=\"+section\r\n\t\t+\"&tax_set=\"+tax_set+\"&purpose=\"+purpose+\"&bj_cd=\"+bj_cd+\"&hj_cd=\"+hj_cd\r\n\t\t+\"&bonbun=\"+bonbun+\"&bubun=\"+bubun+\"&jumyongName=\"+jumyongName+\"&check_type=\"+check_type+\"&numberValue=\"+numberValue;\r\n\t}\r\n\t\r\n\tfunction fnPreView()\r\n\t{\r\n\t\twindow.open('/jsp/jumyong/jumyong/examination.html', \"도로점용_산출조사서\", \"resizable=no, status=no, scrollbars=no, toolbar=no, menubar=no, width=880, height=800\");\t\r\n\t}\r\n\t\r\n\tfunction fnOccupancyLicense()\r\n\t{\r\n\t\twindow.open('/jsp/jumyong/jumyong/occupancyLicense.html', \"점용허가증\", \"resizable=no, status=no, scrollbars=no, toolbar=no, menubar=no, width=880, height=800\");\t\r\n\t}\r\n\t\r\n\t//\t관리자 번호 앞에 9자리 삭제\r\n\tfunction\tnr_Adminno_Cut2(adminno)\r\n\t{\r\n\t\tif(adminno.length != 20)\r\n\t\t\treturn\tadminno\r\n\t\r\n\t\tadminno\t= adminno.substr(9, 10);\r\n\t\t\r\n\t\treturn\tadminno;\r\n\t}\r\n\r\n\r\n\tfunction\tRegisterPrc()\r\n\t{\r\n\t\tvar\tresult\t= tabUp.Register();\r\n\r\n\t\t//싱크를 맞추기 위해 임시 방편으로....\r\n\t\tfor(var i=0; i < 1000000; i++){\r\n\t\t\tif(result == true)\r\n\t\t\t\tbreak;\r\n\t\t}\r\n\r\n\t\t//\t필수 항목이 비어 있으면 ..\r\n\t\tif(result == false)\r\n\t\t\treturn;\r\n\r\n\t\tvar form = document.form;\r\n\t\t//top.frames[1].location=\"/jsp/menu/left/facility.jsp?menu_param=jumyong\";\t//왼쪽 메뉴 링크\r\n\t\tform.action = \"/facility/jumyong/view.do?ADMIN_NO=";
  private final static String _jspx_template11 = "&gu_code=";
  private final static String _jspx_template12 = "&corp_cd=";
  private final static String _jspx_template13 = "&request_no=";
  private final static String _jspx_template14 = "&YEAR=";
  private final static String _jspx_template15 = "&flag=1\";\r\n\t\tform.submit();\r\n\t}\r\n\t\r\n\tfunction\tModifyPrc()\r\n\t{\r\n\t\tvar\tresult\t= tabUp.Modify();\r\n\r\n\t\t//싱크를 맞추기 위해 임시 방편으로....\r\n\t\tfor(var i=0; i < 1000000; i++){\r\n\t\t\tif(result == true)\r\n\t\t\t\tbreak;\r\n\t\t}\r\n\r\n\t\t//\t필수 항목이 비어 있으면 ..\r\n\t\tif(result == false)\r\n\t\t\treturn;\r\n\r\n\t\tvar form = document.form;\r\n\t\t//top.frames[1].location=\"/jsp/menu/left/facility.jsp?menu_param=jumyong\";\t//왼쪽 메뉴 링크\r\n\t\tform.action = \"/facility/jumyong/view.do?ADMIN_NO=";
  private final static String _jspx_template16 = "&gu_code=";
  private final static String _jspx_template17 = "&corp_cd=";
  private final static String _jspx_template18 = "&request_no=";
  private final static String _jspx_template19 = "&YEAR=";
  private final static String _jspx_template20 = "&flag=1\";\r\n\t\tform.submit();\r\n\t}\r\n\r\n//]]>\r\n</script>\r\n\r\n<body onload=\"Init();\">\r\n<table width=\"800\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n<form name=\"form\" method=\"post\">\r\n<input type=\"hidden\" name=\"CORP_CD\" value=\"";
  private final static String _jspx_template21 = "\">\r\n<input type=\"hidden\" name=\"GU_CODE\" value=\"";
  private final static String _jspx_template22 = "\">\r\n<input type=\"hidden\" name=\"REQUEST_NO\" value=\"";
  private final static String _jspx_template23 = "\">\r\n<input type=\"hidden\" id=\"ADMIN_NO\" name=\"ADMIN_NO\" value=\"";
  private final static String _jspx_template24 = "\">\r\n<input type=\"hidden\" name=\"SEQ\" id=\"SEQ\" value=\"";
  private final static String _jspx_template25 = "\">\r\n<input type=\"hidden\" name=\"CURRENT_TABUP\" value=\"minwon\">\r\n<input type=\"hidden\" name=\"CURRENT_TABDOWN\" id=\"CURRENT_TABDOWN\" value=\"product\">\r\n<input name=\"searchToDate\" id = \"searchToDate\" value=\"";
  private final static String _jspx_template26 = "\" type=\"hidden\">\r\n<input name=\"searchFromDate\" id = \"searchFromDate\" value=\"";
  private final static String _jspx_template27 = "\" type=\"hidden\">\r\n<input name=\"TYPE\" id = \"TYPE\" value=\"";
  private final static String _jspx_template28 = "\" type=\"hidden\">\r\n<input name=\"SECTION\" id = \"SECTION\" value=\"";
  private final static String _jspx_template29 = "\" type=\"hidden\">\r\n<input name=\"PURPOSE_CD\" id = \"PURPOSE_CD\" value=\"";
  private final static String _jspx_template30 = "\" type=\"hidden\">\r\n<input name=\"TAX_SET\" id = \"TAX_SET\" value=\"";
  private final static String _jspx_template31 = "\" type=\"hidden\">\r\n<input name=\"BJ_CD\" id = \"BJ_CD\" value=\"";
  private final static String _jspx_template32 = "\" type=\"hidden\">\r\n<input name=\"HJ_CD\" id = \"HJ_CD\" value=\"";
  private final static String _jspx_template33 = "\" type=\"hidden\">\t\t\r\n<input name=\"BONBUN\" id = \"BONBUN\" value=\"";
  private final static String _jspx_template34 = "\" type=\"hidden\">\r\n<input name=\"BUBUN\" id = \"BUBUN\" value=\"";
  private final static String _jspx_template35 = "\" type=\"hidden\">\r\n<input name=\"jumyongName\" id = \"jumyongName\" value=\"";
  private final static String _jspx_template36 = "\" type=\"hidden\">\r\n<input name=\"check_type\" id = \"check_type\" value=\"";
  private final static String _jspx_template37 = "\" type=\"hidden\">\r\n<input name=\"numberValue\" id = \"numberValue\" value=\"";
  private final static String _jspx_template38 = "\" type=\"hidden\">\r\n<input name=\"adminno\" id = \"adminNo\" value=\"";
  private final static String _jspx_template39 = "\" type=\"hidden\">\r\n\r\n  <tr>\r\n    <td height=\"43\"><img src=\"/img/sub2_cont1_title.gif\" width=\"800\" height=\"43\"></td>\r\n  </tr>\r\n  \r\n  <tr>\r\n    <td align=\"center\">\r\n    <table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n      <tr>\r\n        <td height=\"1\" bgcolor=\"eaeaea\"></td>\r\n      </tr>\r\n \r\n      <tr>\r\n        <td height=\"14\"></td>\r\n      </tr>\r\n      \r\n      <td align=\"right\" class=\"sub_table_b\">관리번호 : <script>var adminno = nr_Adminno_Cut2('";
  private final static String _jspx_template40 = "'); document.write(adminno);</script></td>\r\n      \r\n      <tr>\r\n        <td align=\"left\">\r\n        <table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n        \r\n        <tr>\r\n            <td height=\"22\" background=\"/img/tab_line_purple.gif\">\r\n            <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                <tr>\r\n                  <td width=\"111\"><a href=\"javascript:Tab_ImgChange('minwon','/facility/jumyonginfo/minwon_view.do','tabUp')\"><img name=\"minwon_img\" src=\"/img/sub_petition_title9_on.gif\" alt=\"민원 정보\" width=\"110\" height=\"22\" border=\"0\"></a></td>\r\n                  <td width=\"111\"><a href=\"javascript:Tab_ImgChange('jumin','/facility/jumyonginfo/jumin_view.do','tabUp')\"><img name=\"jumin_img\" src=\"/img/sub_petition_title2_off_b.gif\" alt=\"점용인 정보\" width=\"110\" height=\"22\" border=\"0\"></a></td>\r\n                  <td width=\"111\"><a href=\"javascript:Tab_ImgChange('jumji','/facility/jumyonginfo/jumji_view.do','tabUp')\"><img name=\"jumji_img\" src=\"/img/sub_facility_title3_off.gif\" alt=\"점용지 정보\" width=\"110\" height=\"22\" border=\"0\"></a></td>\r\n                </tr>\r\n            </table>\r\n            </td>\r\n\t\t</tr>\r\n\t  <tr>\r\n\t\t<td>\r\n\t\t  \t<iframe width=\"100%\" height=\"100%\" name=\"tabUp\" frameborder=\"0\" onload=\"iFrameResize(this)\" scrolling=\"no\" src=\"/facility/jumyonginfo/minwon_view.do?ADMIN_NO=";
  private final static String _jspx_template41 = "\"></iframe>\r\n\t\t</td>\r\n\t  </tr>\r\n      <tr>\r\n        <td height=\"30\"></td>\r\n      </tr>\r\n      \r\n      <tr>\r\n\t\t<td>\r\n\t\t  \t<iframe width=\"100%\" height=\"100%\" id=\"tabUp1\" name=\"tabUp1\" frameborder=\"0\" onload=\"iFrameResize(this)\" scrolling=\"no\" src=\"#\"></iframe>\r\n\t\t</td>\r\n\t  </tr>\r\n\t  \r\n\t   <tr>\r\n        <td height=\"30\"></td>\r\n      </tr>\r\n      <tr>\r\n        <td align=\"left\">\r\n        <table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n          <tr>\r\n            <td height=\"22\" background=\"/img/tab_line_blue.gif\"><table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                <tr>\r\n                  <td width=\"111\" onclick =\"javascript:Tab_ImgChange('product','/facility/jumyong/product_view.do','tabDown')\"><img id=\"product_img\" name=\"product_img\" src=\"/img/sub_petition_title4_on.gif\" alt=\"산출내역\" width=\"110\" height=\"22\" border=\"0\" style=\"cursor:pointer\" ></td>\r\n\t\t          <td width=\"111\" onclick =\"javascript:Tab_ImgChange('place','/jsp/facility/jumyong/info_place.jsp','tabDown')\"><img id=\"place_img\"  name=\"place_img\" src=\"/img/sub_petition_title7_off.gif\" alt=\"첨부자료\" width=\"110\" height=\"22\" border=\"0\" style=\"cursor:pointer\" ></td>\r\n\t\t          <!-- td width=\"111\" onclick =\"javascript:Tab_ImgChange('history',' ','tabDown')\"><img id=\"history_img\" name=\"history_img\" src=\"/img/sub_petition_title8_off.gif\" alt=\"이력정보\" width=\"110\" height=\"22\" border=\"0\" style=\"cursor:pointer\" ></td -->\r\n                </tr>\r\n            </table></td>\r\n          </tr>\r\n          <tr>\r\n  \t\t\t<td>\r\n  \t\t\t\t<iframe width=\"100%\" height=\"150\" id = \"tabDown\" name=\"tabDown\" frameborder=\"0\" onload=\"iFrameResize(this);\" scrolling=\"no\" src=\"/facility/jumyong/product_view.do?GU_CODE=";
  private final static String _jspx_template42 = "&CORP_CD=";
  private final static String _jspx_template43 = "&REQUEST_NO=";
  private final static String _jspx_template44 = "&YEAR=";
  private final static String _jspx_template45 = "\"></iframe>\r\n  \t\t\t</td>\r\n          </tr>\r\n        </table>\r\n        </td>\r\n      </tr>\r\n\t\t\r\n\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n\t<tr>\r\n      <td height=\"40\" align=\"right\">\r\n\t\t\t";
  private final static String _jspx_template46 = " \t\t\t\t\t\t\t\t                \t\r\n\t\t\t\t<img src=\"/img/produ_icon.gif\" alt=\"산출조사서\" width=\"84\" height=\"22\" border=\"0\" onclick=\"javascript:fnPreView();\" style=\"cursor:pointer\">\r\n\t\t\t";
  private final static String _jspx_template47 = "\r\n\r\n\t\t\t";
  private final static String _jspx_template48 = " \t\t\t\t\t\t\t\t                \t\r\n\t\t\t\t<img src=\"/img/occu_icon.gif\" alt=\"점용허가증\" width=\"84\" height=\"22\" onclick=\"javascript:fnOccupancyLicense();\"  border=\"0\" style=\"cursor:pointer\">\r\n\t\t\t";
  private final static String _jspx_template49 = "\r\n\t\t  \r\n\t      <img src=\"/img/list_icon.gif\" alt=\"리스트\" width=\"66\" height=\"22\" border=\"0\" onclick=\"javascript:goSearch();\" style=\"cursor:pointer\" >\r\n      </td>\r\n\t</tr>\r\n\t<tr>\r\n      <td height=\"20\" ></td>\r\n\t</tr>\r\n\t</table>\r\n  </td>\r\n </tr>\r\n\t\r\n</table>\r\n</body>\r\n</html>\r\n\r\n<script language=\"javascript\">\r\n\tif('";
  private final static String _jspx_template50 = "' == '1'){\r\n\t\tTab_ImgChange('jumji','/facility/jumyonginfo/jumji_view.do','tabUp');\r\n\t}\r\n</script>";
}
