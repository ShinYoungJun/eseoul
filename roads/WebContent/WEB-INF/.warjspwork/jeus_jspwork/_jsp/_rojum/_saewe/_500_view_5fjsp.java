package jeus_jspwork._jsp._rojum._saewe;

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
      "/jsp/common/include.jsp",
      "/jsp/common/environment_setting.jsp"
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
      // jsp code [from=(1,3);to=(12,1)]
      
         String MapServerIP="98.33.1.86";
         String MapServerPort="8080";
         String MapServerURL="http://"+MapServerIP+":"+MapServerPort;
         
         String WebServerIP=MapServerIP;
         String WebServerPort=MapServerPort;
         String WebServerURL="http://"+WebServerIP;
         
         String newMapAddr="/RoadsMap/MapService";//WEbtoB proxy process
         

      out.write(_jspx_template10);
      // jsp code [from=(9,3);to=(17,1)]
      
      //********** BEGIN_현진_20120218
      response.setDateHeader("Expires", -1);
      response.setHeader("Pragma", "no-cahce");
      response.setHeader("Cache-Control", "no-store"); //HTTP 1.0
      response.setHeader("Cache-Control", "no-cache"); //HTTP 1.1
      //********** END_현진_20120218
      

      out.write(_jspx_template11);
      // jsp code [from=(173,16);to=(173,19)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(242,51);to=(242,59)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(242,67);to=(242,70)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(310,37);to=(310,49)]
      out.print(WebServerURL);

      out.write(_jspx_template15);
      // jsp code [from=(334,61);to=(334,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(335,51);to=(335,54)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(336,57);to=(336,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GP_TYP}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(341,57);to=(341,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GIGAN1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(342,57);to=(342,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GIGAN2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(343,65);to=(343,75)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PURPOSE_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(344,57);to=(344,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${BONBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(345,55);to=(345,60)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${BUBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(346,53);to=(346,57)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // jsp code [from=(347,59);to=(347,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMINNO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);
      // jsp code [from=(348,53);to=(348,57)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TYPE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template26);
      // jsp code [from=(349,59);to=(349,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // jsp code [from=(350,63);to=(350,72)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${OWNER_SET}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template28);
      // jsp code [from=(351,55);to=(351,60)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${BJ_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template29);
      // jsp code [from=(352,55);to=(352,60)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${HJ_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template30);
      // jsp code [from=(353,57);to=(353,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TAX_YN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template31);
      // jsp code [from=(354,67);to=(354,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template32);
      // jsp code [from=(356,59);to=(356,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${USER_ID}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template33);
      // jsp code [from=(377,93);to=(377,101)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template34);
      // jsp code [from=(387,68);to=(387,76)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template35);
      // jsp code [from=(388,69);to=(388,77)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template36);
      // jsp code [from=(396,174);to=(396,182)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template37);
      // jsp code [from=(411,68);to=(411,76)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template38);
      // jsp code [from=(418,187);to=(418,195)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template39);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_0_fn(pageContext, null)) return;


      out.write(_jspx_template43);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_2_fn(pageContext, null)) return;


      out.write(_jspx_template47);

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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${misunap!='Y'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template40);
          // ----  c:if ---- invoke //
          if (_jspx_th_c_if_1_fn(pageContext, _jspx_th_c_if_0)) return true;


          out.write(_jspx_template42);

        } while (_jspx_th_c_if_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_0.release();
    }
    return false;
  }

  private boolean _jspx_th_c_if_2_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:if ---- //
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = new org.apache.taglibs.standard.tag.rt.core.IfTag();
    _jspx_th_c_if_2.setPageContext(pageContext);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${misunap=='Y'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
      if (_jspx_eval_c_if_2 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template44);
          // ----  c:if ---- invoke //
          if (_jspx_th_c_if_3_fn(pageContext, _jspx_th_c_if_2)) return true;


          out.write(_jspx_template46);

        } while (_jspx_th_c_if_2.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_2.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_2.release();
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
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${BTNYN == 'Y'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
      if (_jspx_eval_c_if_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template41);

        } while (_jspx_th_c_if_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_1.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_1.release();
    }
    return false;
  }

  private boolean _jspx_th_c_if_3_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:if ---- //
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = new org.apache.taglibs.standard.tag.rt.core.IfTag();
    _jspx_th_c_if_3.setPageContext(pageContext);
    _jspx_th_c_if_3.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${tax=='3'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
      if (_jspx_eval_c_if_3 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template45);

        } while (_jspx_th_c_if_3.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_3.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_3.release();
    }
    return false;
  }

  private final static String _jspx_template0 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n";
  private final static String _jspx_template1 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('사용자의 사용시간이 종료되었습니다. 다시 접속 해주시기 바랍니다.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template2 = "\r\n";
  private final static String _jspx_template3 = "\r\n";
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "  \r\n";
  private final static String _jspx_template6 = "  \r\n";
  private final static String _jspx_template7 = "\r\n";
  private final static String _jspx_template8 = "\r\n";
  private final static String _jspx_template9 = "\r\n<!--  //********** BEGIN_현진_20120222 -->\r\n";
  private final static String _jspx_template10 = "\r\n<!--   //********** END_현진_20120222 -->\r\n \r\n";
  private final static String _jspx_template11 = "\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script language=\"javascript\" src=\"/js/Check_inputbox.js\"></script>\r\n<script language=\"javascript\" src=\"/js/Ajax_request.js\"></script>\r\n<!--  //********** BEGIN_현진_20120222 -->\r\n<script language=\"javascript\" src=\"/jsp/RexServer/rexscript/rexpert.js\"></script>\r\n<script language=\"javascript\" src=\"/jsp/RexServer/rexscript/rexpert_properties.js\"></script>\r\n<!--   //********** END_현진_20120222 -->\r\n\r\n<script type=\"text/javascript\">\r\n//<![CDATA[\r\n\r\n\tfunction\tSearch()\r\n\t{\r\n\t\tvar form = document.form;\r\n\r\n\t\tform.action = \"/rojum/saewe/search.do\";\r\n\t\tform.submit();\r\n\t}\r\n\r\n\tfunction\tSearch_misunap()\r\n\t{\r\n\t\tvar form = document.form;\r\n\r\n\t\tform.action = \"/rojum/saewe/misunap.do\";\r\n\t\tform.submit();\r\n\t}\r\n\r\n\tfunction iFrameResize(obj)\r\n\t{\r\n\t\tvar iFrm = obj;\r\n\t\tvar the_height = iFrm.contentWindow.document.body.scrollHeight;\r\n\t\tiFrm.style.height = the_height;\r\n\t}\r\n\r\n\tfunction \tTab_Img(Tab_Value)\r\n\t{\r\n\t\tvar\timg2\t= document.getElementById(\"unyong_img\");\r\n\t\tvar\timg4\t= document.getElementById(\"jumji_img\");\r\n\t\r\n\t\timg2.src\t= \"/img/sub_gapan_title4_off.gif\";\r\n\t\timg4.src\t= \"/img/sub_petition_title10_off.gif\";\r\n\t\t\r\n\t\tif(Tab_Value\t== \"unyong\")\r\n\t\t{\r\n\t\t\timg2.src\t\t= \"/img/sub_gapan_title4_on.gif\";\r\n\t\t}\r\n\t\telse if(Tab_Value\t== \"jumji\")\r\n\t\t{\r\n\t\t\timg4.src\t\t= \"/img/sub_petition_title10_on.gif\";\r\n\t\t}\r\n\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABUP\");\r\n\r\n\t\ttab.value\t= Tab_Value;\r\n\t}\r\n\r\n\tfunction \tTabDown_Img(Tab_Value)\r\n\t{\r\n\t\tvar\timg1\t= document.getElementById(\"bugwa_img\");\r\n\t\timg1.src\t= \"/img/sub_petition_title12_off.gif\";\r\n\t\r\n\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABDOWN\");\r\n\t\ttab.value\t= Tab_Value;\r\n\t}\r\n\t\r\n\t\r\n\tfunction Tab_Sanchul(gapanNo)\r\n\t{\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABUP\");\r\n\t\t\r\n\t\tif(tab.value\t== \"sanchul\")\r\n\t\t\treturn;\r\n\t\telse\r\n\t\t\ttab.value\t= \"sanchul\";\r\n\t\t\r\n\t\tvar\tseq\t= document.getElementById(\"SEQ\").value;\r\n\t\t\r\n\t\tvar tabs \t= document.getElementById(\"tabUp\");\r\n\t\ttabs.src\t= \"/rojum/saewe/sanchul_view.do?ADMIN_NO=gapanNo\" + adminno + \"&SEQ=\" + seq;\r\n\t}\r\n\r\n\tfunction Tab_Unyong(gapanno)\r\n\t{\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABUP\");\r\n\t\tif(tab.value\t== \"unyong\")\r\n\t\t\treturn;\r\n\t\telse\r\n\t\t\ttab.value\t= \"unyong\";\r\n\t\t\r\n\t\tvar tabs \t= document.getElementById(\"tabUp\");\r\n\t\ttabs.src\t= \"/rojum/jumyonginfo/unyong_view.do?GAPAN_NO=\" + gapanno;\r\n\t}\r\n\r\n\tfunction Tab_Jumji(gapanno)\r\n\t{\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABUP\");\r\n\r\n\t\tif(tab.value\t== \"jumji\")\r\n\t\t\treturn;\r\n\t\telse\r\n\t\t\ttab.value\t= \"jumji\";\r\n\r\n\t\tvar tabs\t= document.getElementById(\"tabUp\");\r\n\t\ttabs.src\t= \"/rojum/jumyonginfo/jumji_view.do?GAPAN_NO=\" + gapanno;\r\n\t}\r\n\t\r\n\tfunction Tab_Bugwa(adminno)\r\n\t{\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABDOWN\");\r\n\t\tif(tab.value\t== \"bugwa\")\r\n\t\t\treturn;\r\n\t\telse\r\n\t\t\ttab.value\t= \"bugwa\";\r\n\r\n\t\r\n\t\tvar\tseq\t= document.getElementById(\"SEQ\").value;\r\n\t\tvar\tgp_typ\t= document.getElementById(\"GP_TYP\").value;\r\n\t\t\r\n\t\tvar tabs\t= document.getElementById(\"tabDown\");\r\n\t\ttabs.src\t= \"/rojum/saewe/bugwa_view.do?ADMIN_NO=\" + adminno + \"&SEQ=\" + seq;\r\n\t}\r\n\t\r\n\tfunction Tab_Sunap(adminno)\r\n\t{\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABDOWN\");\r\n\t\tif(tab.value\t== \"sunap\")\r\n\t\t\treturn;\r\n\t\telse\r\n\t\t\ttab.value\t= \"sunap\";\r\n\t\t\r\n\t\tvar tabs\t= document.getElementById(\"tabDown\");\r\n\t\ttabs.src\t= \"/rojum/saewe/sunap_view.do?ADMIN_NO=\" + adminno;\r\n\t}\r\n\r\n\tfunction \tInit()\r\n\t{\r\n\t\tBugwaView('";
  private final static String _jspx_template12 = "');\r\n\r\n\t}\r\n\t\r\n\tfunction \tBugwa_On()\r\n\t{\r\n\t\tvar\tVIEWPAGE\t= tabDown.document.getElementById(\"VIEWPAGE\");\r\n\r\n\t\tdocument.getElementById(\"Bugwa_On\").style.display = \"block\";\r\n\t\tdocument.getElementById(\"Bugwa_Off\").style.display = \"none\";\r\n\r\n\t}\r\n\t\r\n\tfunction \tBugwa_Off()\r\n\t{\r\n\t//\tvar\tVIEWPAGE\t= tabDown.document.getElementById(\"VIEWPAGE\").value;\r\n\t\tdocument.getElementById(\"Bugwa_On\").style.display = \"none\";\r\n\t\tdocument.getElementById(\"Bugwa_Off\").style.display = \"block\";\r\n\r\n\t}\r\n\t\r\n\tfunction\tBugwaCatch(year, seq)\r\n\t{\r\n\t\tdocument.getElementById(\"YEAR\").value \t\t= year;\r\n\t\r\n\t}\r\n\r\n\tfunction\tBugwaView(seq)\t//\t산출조건 클릭시 부과정보 데이터 변경 (Sanchul_view.jsp 호출)\r\n\t{\r\n\t\tvar\tadminno\t\t= document.getElementById(\"ADMIN_NO\").value;\r\n\t\tvar gp_typ = document.getElementById(\"GP_TYP\").value;\r\n\t\t\r\n\t\tdocument.getElementById(\"SEQ\").value \t= seq;\r\n\t\t\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABDOWN\");\r\n\t\tif(tab.value\t!= \"bugwa\")\r\n\t\t\treturn;\r\n\t\t\r\n\t\tvar tabs\t= document.getElementById(\"tabDown\");\r\n\t\ttabs.src\t= \"/rojum/saewe/bugwa_view.do?ADMIN_NO=\" + adminno + \"&SEQ=\" + seq;\r\n\t}\r\n\t\r\n\tfunction\tSaeweSuipBugwa()\r\n\t{\r\n\t\tvar\tchild\t= tabDown.document.getElementById(\"VIEWPAGE\");\r\n\t\t\r\n\t\tif(!child)\t//\t뷰화면이 아닐 경우..\r\n\t\t{\r\n\t\t\talert(\"먼저 화면을 저장해 주세요.\");\r\n\t\t\treturn;\r\n\t\t}\r\n\t\t\r\n\t\t//\talert(child.value);\r\n\t\t\r\n\t\tvar\tadminno\t= document.getElementById(\"ADMIN_NO\").value;\r\n\t\tvar\tseq\t\t= document.getElementById(\"SEQ\").value;\r\n\t\tvar\tparam\t= \"ADMIN_NO=\" + adminno + \"&SEQ=\" + seq;\r\n\t\t\r\n\t\tsendRequest(\"/rojum/saewe/saewesuipbugwa.do\", param, \"GET\", Result_SaeweSuipBugwa);\r\n\t}\r\n\r\n\tfunction\tResult_SaeweSuipBugwa(obj)\r\n\t{\r\n\t\tif(obj != \"\"){\r\n\t\t\talert(obj);\r\n\t\t}\r\n\t\tvar\tchild\t= tabDown.document.getElementById(\"VIEWPAGE\");\r\n\t\tif(child)\t//\t뷰화면일 경우..\r\n\t\t{\r\n\t\t\tlocation.href=\"/rojum/saewe/view.do?ADMIN_NO=";
  private final static String _jspx_template13 = "&SEQ=";
  private final static String _jspx_template14 = "\";\r\n\t\t}\r\n\t}\r\n\t\r\n\t// 고지서 발급\r\n\tfunction fGoji()\r\n\t{\t\r\n\t\tvar pGoji;\r\n\t\tvar tax_yn    =  tabDown.form.TAX_YN.value;\r\n\t\tvar sigu_cd   =  tabDown.form.sigu_cd.value;\r\n\t\tvar buseo_cd  =  tabDown.form.buseo_cd.value;\r\n\t\tvar semok_cd  =  tabDown.form.semok_cd.value;\r\n\t\tvar tax_ym    =  tabDown.form.tax_ym.value;\r\n\t\tvar tax_gubun =  tabDown.form.tax_gubun.value;\r\n\t\tvar tax_no    =  tabDown.form.tax_no.value;\r\n\t\tvar user_id   =  tabDown.form.bukwa_id.value;\r\n\t\t\r\n\t\tif(tax_yn != \"1\")\r\n\t\t{\r\n\t\t\talert(\"부과된 정보가 없습니다.\");\r\n\t\t\treturn;\r\n\t\t}\r\n\t\t\r\n\t\tpGoji = \"?sigu_cd=\"+sigu_cd; \r\n\t\tpGoji = pGoji + \"&buseo_cd=\"+buseo_cd;\r\n\t\tpGoji = pGoji + \"&semok_cd=\"+semok_cd; \r\n\t\tpGoji = pGoji + \"&tax_ym=\"+tax_ym;\r\n\t\tpGoji = pGoji + \"&tax_gubun=\"+tax_gubun;\r\n\t\tpGoji = pGoji + \"&tax_no=\"+tax_no;\r\n\t\tpGoji = pGoji + \"&user_id=\"+user_id;\t\t\t\t\r\n\t\t\r\n\t\t//var URL = \"http://98.33.4.5/jsp/IECall/Bu04BugaOneSearchCW.jsp\"+ pGoji;\r\n\t\tvar URL = \"http://98.33.4.164/jsp/IECall/Bu04BugaOneSearchCW.jsp\"+ pGoji;\r\n\t\t\r\n\t\t//document.getElementById(\"temp\").value = URL;\r\n\t\twindow.open(URL,\"세외수입고지서출력\",\"width=800, height=600, left=150, top=150, toolbar=no,location=no,directories=no,status=yes,menubar=no,scrollbars=no,resizable=no\");\r\n\t} \r\n\r\n\t//********** BEGIN_현진_20120222\r\n\tfunction PreNotice(){\r\n\t\t\r\n\t\tvar f = document.form;\r\n\t\tvar gapan_no = document.getElementById(\"ADMIN_NO\").value;\r\n\t\tvar seq = document.getElementById(\"SEQ\").value;\r\n\r\n\t\tvar oRptMainParam;\r\n\t\toRptMainParam = rex_GetgoDictionay(); \r\n\r\n\t\t// 옵션 - viewer\t\r\n\t\toRptMainParam.put(\"rex_open_window\", \"center=yes,scrollbars=no,status=no,toolbar=no,resizable=0,location=no,menu=no,width=800,height=600\");\r\n\t\t\r\n\t\t// 필수 - 레포트명\r\n\t\toRptMainParam.put(\"rex_rptname\", \"rojum_pre_notice\");\r\n\r\n\t\t// 필수 - 데이터 타입 설정\r\n\t\toRptMainParam.put(\"rex_datatype\", \"XML\");  // XML, CSV\r\n\r\n\t\t// 옵션 - 다른 DB를 연결시\r\n\t\toRptMainParam.put(\"rex_userservice\", \"oracle_jndi\");\r\n\r\n\t\t// 옵션 - 파라메터 설정\r\n\t\tvar form \t= document.form;\r\n\t\t//alert(\"gapan_no : \" + gapan_no);\r\n\t\t//alert(\"seq : \" + seq);\r\n\t\t//alert(gapan_no.substring(0,3));\r\n\t\toRptMainParam.put(\"GAPAN_NO\" ,gapan_no);\r\n\t\toRptMainParam.put(\"SEQ\" ,seq);\r\n\t\toRptMainParam.put(\"USER_ID\" ,form.USER_ID.value);\r\n\t\toRptMainParam.put(\"IMG_PATH\" ,'";
  private final static String _jspx_template15 = "'+'/img/stamp/'+gapan_no.substring(0,3)+'.png');\r\n\t\t\r\n\t\r\n\t\t// preview 팝업 열기\r\n\t\trex_gfRexRptOpen(\"popup\", oRptMainParam);\r\n\r\n\t}\r\n\r\n\tfunction sanchul(){\r\n\t\t\r\n\t\tvar form = document.form;\r\n\r\n\t\tform.action = \"/rojum/saewe/misunap_sanchul.do?misunap=Y\";\r\n\t\tform.submit();\r\n\t}\r\n\t//********** END_현진_20120222\r\n\r\n\t\r\n\t\r\n//]]>\r\n</script>\r\n\r\n<body onload=\"Init();\" >\r\n<form id=\"form\" name=\"form\" method=\"post\">\r\n<input type=\"hidden\" id=\"ADMIN_NO\" name=\"ADMIN_NO\" value=\"";
  private final static String _jspx_template16 = "\">\r\n<input type=\"hidden\" id=\"SEQ\" name=\"SEQ\" value=\"";
  private final static String _jspx_template17 = "\">\r\n<input type=\"hidden\" id=\"GP_TYP\" name=\"GP_TYP\" value=\"";
  private final static String _jspx_template18 = "\">\r\n\r\n<input type=\"hidden\" id=\"CURRENT_TABUP\" name=\"CURRENT_TABUP\" value=\"sanchul\">\r\n<input type=\"hidden\" id=\"CURRENT_TABDOWN\" name=\"CURRENT_TABDOWN\" value=\"bugwa\">\r\n\r\n<input type=\"hidden\" id=\"GIGAN1\" name=\"GIGAN1\" value=\"";
  private final static String _jspx_template19 = "\">\r\n<input type=\"hidden\" id=\"GIGAN2\" name=\"GIGAN2\" value=\"";
  private final static String _jspx_template20 = "\">\r\n<input type=\"hidden\" id=\"PURPOSE_CD\" name=\"PURPOSE_CD\" value=\"";
  private final static String _jspx_template21 = "\">\r\n<input type=\"hidden\" id=\"BONBUN\" name=\"BONBUN\" value=\"";
  private final static String _jspx_template22 = "\">\r\n<input type=\"hidden\" id=\"BUBUN\" name=\"BUBUN\" value=\"";
  private final static String _jspx_template23 = "\">\r\n<input type=\"hidden\" id=\"NAME\" name=\"NAME\" value=\"";
  private final static String _jspx_template24 = "\">\r\n<input type=\"hidden\" id=\"ADMINNO\" name=\"ADMINNO\" value=\"";
  private final static String _jspx_template25 = "\">\r\n<input type=\"hidden\" id=\"TYPE\" name=\"TYPE\" value=\"";
  private final static String _jspx_template26 = "\">\r\n<input type=\"hidden\" id=\"SECTION\" name=\"SECTION\" value=\"";
  private final static String _jspx_template27 = "\">\r\n<input type=\"hidden\" id=\"OWNER_SET\" name=\"OWNER_SET\" value=\"";
  private final static String _jspx_template28 = "\">\r\n<input type=\"hidden\" id=\"BJ_CD\" name=\"BJ_CD\" value=\"";
  private final static String _jspx_template29 = "\">\r\n<input type=\"hidden\" id=\"HJ_CD\" name=\"HJ_CD\" value=\"";
  private final static String _jspx_template30 = "\">\r\n<input type=\"hidden\" id=\"TAX_YN\" name=\"TAX_YN\" value=\"";
  private final static String _jspx_template31 = "\">\r\n<input type=\"hidden\" id=\"currentPage\" name=\"currentPage\" value=\"";
  private final static String _jspx_template32 = "\">\r\n<!--  //********** BEGIN_현진_20120222 -->\r\n<input type=\"hidden\" id=\"USER_ID\" name=\"USER_ID\" value=\"";
  private final static String _jspx_template33 = "\">\r\n<!--<input type=\"text\" id=\"temp\" name=\"temp\" value=\"\">-->\r\n<!--   //********** END_현진_20120222 -->\r\n\r\n<table width=\"800\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n  <tr>\r\n    <td height=\"43\"><img src=\"/img/sub1_cont3_title.gif\" width=\"800\" height=\"43\"></td>\r\n  </tr>\r\n  \r\n  <tr>\r\n    <td align=\"center\">\r\n    <table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\r\n      <tr>\r\n        <td height=\"1\" bgcolor=\"eaeaea\"></td>\r\n      </tr>\r\n\t\t\r\n      <tr>\r\n        <td height=\"14\"></td>\r\n      </tr>\r\n      <tr>\r\n\t      <td align=\"right\" class=\"sub_table_b\">관리번호 : <script>var adminno = nr_Adminno_Cut(\"";
  private final static String _jspx_template34 = "\"); document.write(adminno);</script></td>\r\n      </tr>\r\n      <tr>\r\n        <td align=\"left\">\r\n        <table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n        \r\n    \t<tr>\r\n            <td height=\"22\" background=\"/img/tab_line_purple.gif\">\r\n            <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                <tr>\r\n                  <td width=\"111\"><a href=\"javascript:Tab_Jumji('";
  private final static String _jspx_template35 = "')\"><img id=\"jumji_img\" name=\"jumji_img\" src=\"/img/sub_petition_title10_off.gif\" alt=\"시설/운영 정보\" width=\"110\" height=\"22\" border=\"0\"></a></td>\r\n                  <td width=\"111\"><a href=\"javascript:Tab_Unyong('";
  private final static String _jspx_template36 = "')\"><img id=\"unyong_img\" name=\"unyong_img\" src=\"/img/sub_gapan_title4_off.gif\" alt=\"운영자 정보\" width=\"110\" height=\"22\" border=\"0\"></a></td>\t\t\t\t             \r\n                </tr>\r\n            </table>\r\n            </td>\r\n\t\t</tr>\r\n\t\t\r\n\t\t  <tr>\r\n\t\t\t<td>\r\n\t\t\t  \t<iframe width=\"100%\" height=\"100%\" id=\"tabUp\" name=\"tabUp\" frameborder=\"0\" onload=\"iFrameResize(this)\" scrolling=\"no\" src=\"/rojum/jumyonginfo/jumji_view.do?GAPAN_NO=";
  private final static String _jspx_template37 = "\"></iframe>\r\n\t\t\t</td> \r\n\t\t  </tr>\r\n\t\t  \r\n\t\t  <tr>\r\n\t\t\t<td height=\"30px\">\r\n\t\t\t</td> \r\n\t\t  </tr>\r\n\t\r\n        <tr>\r\n        <td align=\"left\">\r\n        <table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n          <tr>\r\n            <td height=\"22\" background=\"/img/tab_line_blue.gif\"><table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                <tr>\r\n                  <td width=\"111\"><a href=\"javascript:Tab_Bugwa('";
  private final static String _jspx_template38 = "')\"><img id=\"bugwa_img\" name=\"bugwa_img\" src=\"/img/sub_petition_title12_on.gif\" alt=\"부과 정보\" width=\"110\" height=\"22\" border=\"0\"></a></td>\r\n                </tr>\r\n            </table></td>\r\n          </tr>\r\n\t\t  \r\n          <tr>\r\n  \t\t\t<TD>\r\n  \t\t\t\t<iframe width=\"100%\" height=\"150\" id=\"tabDown\" name=\"tabDown\" frameborder=\"0\" onload=\"iFrameResize(this)\" scrolling=\"no\" src=\"\"></iframe><!-- /gapan/saewe/bugwa_view.do?ADMIN_NO=";
  private final static String _jspx_template39 = " -->\r\n  \t\t\t</TD>\r\n          </tr>\r\n          \r\n        </table>\r\n        </td>\r\n        </tr>\r\n        <tr>\r\n        <td height=\"10px\">\r\n        </td>\r\n        </tr>\r\n\t\t<!--  //********** BEGIN_현진_20120222 -->\r\n\t\t";
  private final static String _jspx_template40 = "\r\n\t\t<tr>\r\n\t\t\t<td colspan=\"0\" bgcolor=\"F6F6F6\" class=\"table_bl_left\"  align=\"right\">\r\n\t\t\t\t<span style=\"display:none\" id=\"Bugwa_On\">\r\n\t\t\t\t\t\t<!--  //********** BEGIN_현진_20120222 -->\r\n\t\t\t\t\t\t";
  private final static String _jspx_template41 = "\r\n\t\t\t\t\t\t\t<img src=\"/img/rojum_prenotice_icon.gif\" alt=\"사전통지서\" border=\"0\" onclick=\"javascript:PreNotice();\" style=\"cursor:pointer;\">\t\t\t\t\t\t\r\n\t\t\t\t\t\t";
  private final static String _jspx_template42 = "\r\n\t\t\t\t\t\t<!--   //********** END_현진_20120222 -->\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t<img src=\"../../../img/notice_icon.gif\" alt=\"고지서 발급\" border=\"0\" onclick=\"javascript:fGoji();\" style=\"cursor:hand\">\r\n\t\t\t\t\t\t<a href=\"javascript:SaeweSuipBugwa()\"><img src=\"/img/levy_icon.gif\" alt=\"세외수입부과\" width=\"94\" height=\"22\" border=\"0\"></a>\r\n\t\t\t\t\t\t<a href=\"javascript:Search()\"><img src=\"/img/list_icon.gif\" alt=\"리스트\" width=\"66\" height=\"22\" border=\"0\"></a>\r\n\t\t\t\t</span>\r\n\t\t\t\t\r\n\t\t\t\t<span style=\"display:none\" id=\"Bugwa_Off\">\r\n\t\t\t\t\t<a href=\"javascript:Search()\"><img src=\"/img/list_icon.gif\" alt=\"리스트\" width=\"66\" height=\"22\" border=\"0\"></a>\r\n\t\t\t\t</span>\r\n\t\t\t<td>\t\t\t\r\n\t\t</tr>\r\n\t\t";
  private final static String _jspx_template43 = "\r\n\t\t";
  private final static String _jspx_template44 = "\r\n\t\t<tr>\r\n\t\t\t<td colspan=\"0\" bgcolor=\"F6F6F6\" class=\"table_bl_left\"  align=\"right\">\r\n\t\t\t<span style=\"display:none\" id=\"Bugwa_On\">\r\n\t\t\t\t";
  private final static String _jspx_template45 = "\r\n\t\t\t\t<a href=\"javascript:sanchul()\"><img src=\"/img/sanchul_save_icon.gif\" alt=\"과태료 산출 및 저장\" height=\"22\" border=\"0\"></a>\r\n\t\t\t\t";
  private final static String _jspx_template46 = "\r\n\t\t\t\t<a href=\"javascript:SaeweSuipBugwa()\"><img src=\"/img/levy_icon.gif\" alt=\"세외수입부과\" width=\"94\" height=\"22\" border=\"0\"></a>\r\n\t\t\t\t<img src=\"/img/notice_icon.gif\" alt=\"고지서 발급\" border=\"0\" onclick=\"javascript:fGoji();\" style=\"cursor:hand\">\r\n\t\t\t\t<a href=\"javascript:Search_misunap()\"><img src=\"/img/list_icon.gif\" alt=\"리스트\" width=\"66\" height=\"22\" border=\"0\"></a>\r\n\t\t\t\t</span>\r\n\t\t\t\t\r\n\t\t\t\t<span style=\"display:none\" id=\"Bugwa_Off\">\r\n\t\t\t\t\t<a href=\"javascript:Search_misunap()\"><img src=\"/img/list_icon.gif\" alt=\"리스트\" width=\"66\" height=\"22\" border=\"0\"></a>\r\n\t\t\t\t</span>\r\n\t\t\t<td>\t\t\t\r\n\t\t</tr>\t\t\r\n\t\t";
  private final static String _jspx_template47 = "\r\n\t\t<!--   //********** END_현진_20120222 -->\r\n\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n\t\r\n\t</table>\r\n  </td>\r\n </tr>\r\n\t\r\n</table>\r\n</form>\r\n</body>\r\n</html>";
}
