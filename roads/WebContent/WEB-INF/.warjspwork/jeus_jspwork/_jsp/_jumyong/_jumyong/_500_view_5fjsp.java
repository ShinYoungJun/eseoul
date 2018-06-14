package jeus_jspwork._jsp._jumyong._jumyong;

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
      out.write(_jspx_template11);
      // jsp code [from=(368,134);to=(368,145)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(379,9);to=(379,20)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${POP_SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(474,9);to=(474,20)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${POP_SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(479,9);to=(479,16)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${useType}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(479,33);to=(479,43)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${purpose_cd}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(490,14);to=(490,22)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${use_type}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(490,38);to=(490,48)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${purpose_cd}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(541,9);to=(541,20)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${POP_SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(546,9);to=(546,16)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${useType}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(546,33);to=(546,43)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${purpose_cd}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(557,14);to=(557,22)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${use_type}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(557,38);to=(557,48)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${purpose_cd}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(608,61);to=(608,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // jsp code [from=(609,50);to=(609,53)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);
      // jsp code [from=(610,58);to=(610,64)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${userId}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template26);
      // jsp code [from=(615,71);to=(615,77)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${toDate}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // jsp code [from=(616,75);to=(616,83)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${fromDate}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template28);
      // jsp code [from=(617,56);to=(617,64)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${use_type}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template29);
      // jsp code [from=(618,61);to=(618,72)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${use_section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template30);
      // jsp code [from=(619,75);to=(619,82)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template31);
      // jsp code [from=(620,67);to=(620,77)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${purpose_cd}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template32);
      // jsp code [from=(621,61);to=(621,77)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${taxation_section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template33);
      // jsp code [from=(622,57);to=(622,68)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bjdong_code}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template34);
      // jsp code [from=(623,57);to=(623,68)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${hjdong_code}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template35);
      // jsp code [from=(624,59);to=(624,65)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bonbun}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template36);
      // jsp code [from=(625,57);to=(625,62)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bubun}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template37);
      // jsp code [from=(626,69);to=(626,80)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${jumyongName}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template38);
      // jsp code [from=(627,67);to=(627,75)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${check_yn}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template39);
      // jsp code [from=(628,69);to=(628,80)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${numberValue}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template40);
      // jsp code [from=(662,54);to=(662,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view_admin_no}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template41);
      // jsp code [from=(672,69);to=(672,77)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template42);
      // jsp code [from=(673,68);to=(673,76)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template43);
      // jsp code [from=(674,68);to=(674,76)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template44);
      // jsp code [from=(681,176);to=(681,184)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template45);
      // jsp code [from=(681,196);to=(681,207)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${use_section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template46);
      // jsp code [from=(697,161);to=(697,169)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template47);
      // jsp code [from=(697,181);to=(697,192)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${use_section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template48);
      // jsp code [from=(711,71);to=(711,79)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template49);
      // jsp code [from=(712,63);to=(712,71)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template50);
      // jsp code [from=(713,65);to=(713,73)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template51);
      // jsp code [from=(719,167);to=(719,175)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template52);
      // jsp code [from=(719,232);to=(719,240)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template53);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_0_fn(pageContext, null)) return;


      out.write(_jspx_template59);

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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${use_section != '4'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template54);
          // ----  c:if ---- invoke //
          if (_jspx_th_c_if_1_fn(pageContext, _jspx_th_c_if_0)) return true;


          out.write(_jspx_template56);
          // ----  c:if ---- invoke //
          if (_jspx_th_c_if_2_fn(pageContext, _jspx_th_c_if_0)) return true;


          out.write(_jspx_template58);

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
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${showMudanExamination == 'true'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
      if (_jspx_eval_c_if_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template55);

        } while (_jspx_th_c_if_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_1.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_1.release();
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
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${showExamination == 'true'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
      if (_jspx_eval_c_if_2 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template57);

        } while (_jspx_th_c_if_2.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_2.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_2.release();
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
  private final static String _jspx_template9 = "\r\n\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script language=\"javascript\" src=\"/js/Check_inputbox.js\"></script>\r\n<script language=\"javascript\" src=\"/js/Ajax_request.js\"></script>\r\n<script language=\"javascript\" src=\"/jsp/RexServer/rexscript/rexpert.js\"></script>\r\n<script language=\"javascript\" src=\"/jsp/RexServer/rexscript/rexpert_properties.js\"></script>\r\n\r\n<script type=\"text/javascript\">\r\n//<![CDATA[\r\n\r\n\tfunction\tSearch()\r\n\t{\r\n\t\tvar form = document.form;\r\n\r\n\t\tform.action = \"search.do\";\r\n\t\tform.submit();\r\n\t}\r\n\r\n\tfunction iFrameResize(obj)\r\n\t{\r\n\t\tvar iFrm = obj;\r\n\t\tvar the_height = iFrm.contentWindow.document.body.scrollHeight;\r\n\t\tiFrm.style.height = the_height + \"px\";\r\n\t}\r\n\r\n\tfunction \tTabUp_Img(Tab_Value)\r\n\t{\r\n\t\tvar\timg1\t= document.getElementById(\"minwon_img\");\r\n\t\tvar\timg2\t= document.getElementById(\"jumin_img\");\r\n\t\tvar\timg3\t= document.getElementById(\"jumji_img\");\r\n\t\r\n\t\timg1.src\t= \"/img/sub_petition_title9_off.gif\";\r\n\t\timg2.src\t= \"/img/sub_petition_title2_off.gif\";\r\n\t\timg3.src\t= \"/img/sub_petition_title3_off.gif\";\r\n\t\t\r\n\t\tif(Tab_Value\t== \"minwon\")\r\n\t\t{\r\n\t\t\timg1.src\t\t= \"/img/sub_petition_title9_on.gif\";\r\n\t\t}\r\n\t\telse if(Tab_Value\t== \"jumin\")\r\n\t\t{\r\n\t\t\timg2.src\t\t= \"/img/sub_petition_title2_on.gif\";\r\n\t\t}\r\n\t\telse if(Tab_Value\t== \"jumji\")\r\n\t\t{\r\n\t\t\timg3.src\t\t= \"/img/sub_petition_title3_on.gif\";\r\n\t\t}\t\t\r\n\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABUP\");\r\n\t\ttab.value\t= Tab_Value;\r\n\t}\r\n\t\r\n\tfunction \tTab_Img(Tab_Value)\r\n\t{\r\n\t\tvar\timg1\t= document.getElementById(\"minwon_img\");\r\n\t\tvar\timg2\t= document.getElementById(\"jumin_img\");\r\n\t\tvar\timg3\t= document.getElementById(\"jumji_img\");\r\n\t\r\n\t\timg1.src\t= \"/img/sub_petition_title9_off.gif\";\r\n\t\timg2.src\t= \"/img/sub_petition_title2_off_b.gif\";\r\n\t\timg3.src\t= \"/img/sub_petition_title3_off.gif\";\r\n\t\t\r\n\t\tif(Tab_Value\t== \"minwon\")\r\n\t\t{\r\n\t\t\timg1.src\t\t= \"/img/sub_petition_title9_on.gif\";\r\n\t\t}\r\n\t\telse if(Tab_Value\t== \"jumin\")\r\n\t\t{\r\n\t\t\timg2.src\t\t= \"/img/sub_petition_title2_on_b.gif\";\r\n\t\t}\r\n\t\telse if(Tab_Value\t== \"jumji\")\r\n\t\t{\r\n\t\t\timg3.src\t\t= \"/img/sub_petition_title3_on.gif\";\r\n\t\t}\t\t\r\n\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABUP\");\r\n\t\ttab.value\t= Tab_Value;\r\n\t}\r\n\t\r\n\tfunction \tTabDown_Img(Tab_Value)\r\n\t{\r\n\t\tvar\timg1\t= document.getElementById(\"product_img\");\r\n//\t\tvar\timg2\t= document.getElementById(\"inspect_img\");\r\n//\t\tvar\timg3\t= document.getElementById(\"conf_img\");\r\n\t\tvar\timg2\t= document.getElementById(\"place_img\");\t\t\r\n\t\tvar\timg3\t= document.getElementById(\"history_img\");\t\t\t\t\r\n\t\t\r\n\r\n\r\n\t\timg1.src\t= \"/img/sub_petition_title4_off.gif\";\r\n//\t\timg2.src\t= \"/img/sub_petition_title5_off.gif\";\r\n//\t\timg3.src\t= \"/img/sub_petition_title6_off.gif\";\t\t\r\n\t\timg2.src\t= \"/img/sub_petition_title7_off.gif\";\t\t\t\t\r\n\t\timg3.src\t= \"/img/sub_petition_title8_off.gif\";\t\t\t\t\t\t\r\n\t\t\r\n\t\t\r\n\t\t\r\n\t\t\r\n\t\tif(Tab_Value\t== \"product\")\r\n\t\t{\r\n\t\t\timg1.src\t\t= \"/img/sub_petition_title4_on.gif\";\r\n\t\t}\r\n/*\t\telse if(Tab_Value\t== \"inspect\")\r\n\t\t{\r\n\t\t\timg2.src\t\t= \"/img/sub_petition_title5_on.gif\";\r\n\t\t}else if(Tab_Value\t== \"conf\")\r\n\t\t{\r\n\t\t\timg3.src\t\t= \"/img/sub_petition_title6_on.gif\";\r\n\t\t}\r\n*/\t\telse if(Tab_Value\t== \"place\")\r\n\t\t{\r\n\t\t\timg2.src\t\t= \"/img/sub_petition_title7_on.gif\";\r\n\t\t}else if(Tab_Value\t== \"history\")\r\n\t\t{\r\n\t\t\timg3.src\t\t= \"/img/sub_petition_title8_on.gif\";\r\n\t\t}\r\n\t\t\r\n\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABDOWN\");\r\n\t\ttab.value\t= Tab_Value;\r\n\r\n\t}\r\n\r\n\t\r\n\tfunction Tab_Minwon(adminno)\r\n\t{\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABUP\");\r\n\t\tvar section = document.getElementById(\"SECTION\").value;\r\n\t\tif(tab.value\t== \"minwon\")\r\n\t\t\treturn;\r\n\t\telse\r\n\t\t\ttab.value\t= \"minwon\";\r\n\r\n\t\tvar tabs \t= document.getElementById(\"tabUp\");\r\n\t\tTabUp_Img(\"minwon\");\r\n//\t\ttabs.src\t= \"/jumyong/jumyong/minwon.do?ADMIN_NO=\" + adminno;\r\n\t\ttabs.src\t= \"/jumyong/jumyonginfo/minwon_view.do?ADMIN_NO=\" + adminno + \"&SECTION=\"+section;\r\n\t\t//\r\n\t\t\r\n\t\t\r\n\t}\r\n\r\n\tfunction Tab_Jumin(adminno)\r\n";
  private final static String _jspx_template10 = "\t{\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABUP\");\r\n\t\tvar section = document.getElementById(\"SECTION\").value;\r\n\t\tif(tab.value\t== \"jumin\")\r\n\t\t\treturn;\r\n\t\telse\r\n\t\t\ttab.value\t= \"jumin\";\r\n\t\t\r\n\t\tvar tabs \t= document.getElementById(\"tabUp\");\r\n\t\t//tabs.src\t= \"/jumyong/jumyong/jumin.do?ADMIN_NO=\" + adminno;\r\n\t\ttabs.src\t= \"/jumyong/jumyonginfo/jumin_view.do?ADMIN_NO=\" + adminno + \"&SECTION=\"+section;\r\n\t}\r\n\r\n\tfunction Tab_Jumji(adminno)\r\n\t{\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABUP\");\r\n\t\tvar section = document.getElementById(\"SECTION\").value;\r\n\t\tif(tab.value\t== \"jumji\")\r\n\t\t\treturn;\r\n\t\telse\r\n\t\t\ttab.value\t= \"jumji\";\r\n\r\n\t\tvar tabs\t= document.getElementById(\"tabUp\");\r\n//\t\ttabs.src\t= \"/jumyong/jumyong/jumji.do?ADMIN_NO=\" + adminno;\r\n\t\ttabs.src\t= \"/jumyong/jumyonginfo/jumji_view.do?ADMIN_NO=\" + adminno + \"&SECTION=\"+section;\r\n\t}\r\n\r\n\tfunction Tab_Product(adminno)\r\n\t{\t\t\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABDOWN\");\r\n\t\tvar section = document.getElementById(\"SECTION\").value;\r\n\t\tif(tab.value\t== \"product\")\r\n\t\t\treturn;\r\n\t\telse\r\n\t\t\ttab.value\t= \"product\";\r\n\r\n\t//\tvar\tadminno\t= document.getElementById(\"ADMIN_NO\").value;\r\n\t\tvar\tseq\t= document.getElementById(\"SEQ\").value;\r\n\r\n\t\tTabDown_Img(\"product\");\t\t\r\n\t\tvar tabs\t= document.getElementById(\"tabDown\");\r\n//\t\ttabs.src\t= \"/jumyong/saewe/bugwa_view.do?ADMIN_NO=\" + adminno + \"&SEQ=\" + seq;\r\n\t\ttabs.src\t= \"/jumyong/productInsert.do?no=\" + adminno + \"&SEQ=\" + seq + \"&SECTION=\"+section;\r\n\t\t\r\n\t}\r\n\t\r\n\tfunction Tab_Inspect(adminno)\r\n\t{\t\t\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABDOWN\");\r\n\t\tif(tab.value\t== \"inspect\")\r\n\t\t\treturn;\r\n\t\telse\r\n\t\t\ttab.value\t= \"inspect\";\r\n\t\t\r\n\t\tTabDown_Img(\"inspect\");\r\n\t\tvar tabs\t= document.getElementById(\"tabDown\");\r\n\t\ttabs.src\t= \"/jumyong/inspectEdit.do?no=\" + adminno;\r\n\t}\r\n\t\r\n\tfunction Tab_Conf(adminno)\r\n\t{\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABDOWN\");\r\n\t\t\r\n\t\tif(tab.value\t== \"conf\")\r\n\t\t\treturn;\r\n\t\telse if(tab.value == null)\r\n\t\t\ttab.value\t= \"conf\";\r\n\t\t\r\n\t\tTabDown_Img(\"conf\");\r\n\t\tvar tabs\t= document.getElementById(\"tabDown\");\r\n\t\ttabs.src\t= \"/jumyong/confEdit.do?no=\" + adminno;\r\n\r\n\t}\r\n\r\n\tfunction Tab_Place(adminno)\r\n\t{\t\t\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABDOWN\");\r\n\t\tvar section = document.getElementById(\"SECTION\").value;\r\n\t\tif(tab.value\t== \"place\")\r\n\t\t\treturn;\r\n\t\telse\r\n\t\t\ttab.value\t= \"place\";\r\n\t\t\r\n\t\tTabDown_Img(\"place\");\r\n\t\tvar tabs\t= document.getElementById(\"tabDown\");\r\n\t\ttabs.src\t= \"/jsp/jumyong/jumyong/info_place.jsp?no=\" + adminno + \"&SECTION=\"+section;\r\n\t}\r\n\t\r\n\tfunction Tab_History(adminno)\r\n\t{\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABDOWN\");\r\n\t\tvar section = document.getElementById(\"SECTION\").value;\r\n\t\tif(tab.value\t== \"history\")\r\n\t\t\treturn;\r\n\t\telse\r\n\t\t\ttab.value\t= \"history\";\r\n\t\t\r\n\t\tTabDown_Img(\"history\");\t\t\r\n\t\tvar tabs\t= document.getElementById(\"tabDown\");\r\n\t\t\r\n\t\ttabs.src = \"/jumyong/jumyong/history_view.do?ADMIN_NO=\" + adminno + \"&SECTION=\"+section;\r\n\t}\r\n\r\n\tfunction Tab_Sunap(adminno)\r\n\t{\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABDOWN\");\r\n\t\tif(tab.value\t== \"sunap\")\r\n\t\t\treturn;\r\n\t\telse\r\n\t\t\ttab.value\t= \"sunap\";\r\n\t\t\r\n\t\tvar tabs\t= document.getElementById(\"tabDown\");\r\n\t\t\r\n//\t\ttabs.src\t= \"/jumyong/saewe/sunap_view.do?ADMIN_NO=\" + adminno;\r\n\t}\r\n\r\n\tfunction \tInit()\r\n\t{\t\r\n\t//\tvar tab\t\t= document.getElementById(\"CURRENT_TAB\");\r\n\t//\ttab.value\t= \"back\";\r\n\t\t\r\n\r\n\t\t/*var iFrm = document.getElementById(\"tabUp1\");\r\n\t\tvar the_height = 0;\r\n\t\tiFrm.style.height = the_height;*/\r\n\r\n\r\n\t\r\n\r\n\t}\r\n\r\n\tfunction\tBugwaCatch(year, seq)\r\n\t{\r\n\t\tdocument.getElementById(\"YEAR\").value \t\t= year;\r\n\t\r\n\t//\talert(document.getElementById(\"TAX_NO\").value);\r\n\t}\r\n\r\n\tfunction\tBugwaView(seq)\t//\t산출조건 클릭시 부과정보 데이터 변경 (Minwon_view.jsp 호출)\r\n\t{\r\n\r\n\t\tvar\tadminno\t\t= document.getElementById(\"ADMIN_NO\").value;\r\n\t\t\r\n\t\tdocument.getElementById(\"SEQ\").value \t= seq;\r\n\t\t\r\n\t\tvar tab\t= document.getElementById(\"CURRENT_TABDOWN\");\r\n\t\tif(tab.value\t!= \"bugwa\")\r\n\t\t\treturn;\r\n\t\t \r\n\t\tvar tabs\t= document.getElementById(\"tabDown\");\r\n\t\ttabs.src\t= \"/jumyong/saewe/bugwa_view.do?ADMIN_NO=\" + adminno + \"&SEQ=\" + seq;\r\n\t\ttabs.src\t= \"/jumyong/junggi/bugwa_view.do?ADMIN_NO=\" + adminno + \"&";
  private final static String _jspx_template11 = "SEQ=\" + seq;\t\t\r\n\t}\r\n\t\r\n\tfunction\tSaeweSuipBugwa()\r\n\t{\r\n\t\tvar\tchild\t= tabDown.document.getElementById(\"VIEWPAGE\");\r\n\r\n\t\tif(!child)\t//\t뷰화면이 아닐 경우..\r\n\t\t{\r\n\t\t\talert(\"먼저 화면을 저장해 주세요.\");\r\n\t\t\treturn;\r\n\t\t}\r\n\t\t\r\n\t\t//\talert(child.value);\r\n\t\t\r\n\t\tvar\tadminno\t= document.getElementById(\"ADMIN_NO\").value;\r\n\t\tvar\tseq\t\t= document.getElementById(\"SEQ\").value;\r\n\t\tvar\tparam\t= \"ADMIN_NO=\" + adminno + \"&SEQ=\" + seq;\r\n\r\n\t\tsendRequest(\"/jumyong/saewe/saewesuipbugwa.do\", param, \"GET\", Result_SaeweSuipBugwa);\r\n\t}\r\n\r\n\tfunction\tResult_SaeweSuipBugwa(obj)\r\n\t{\r\n\t\tif(obj == \"0\")\t\t\t\r\n\t\t\talert(\"데이터가 없습니다.\");\r\n\t\telse if(obj == \"1\")\t\t\t\r\n\t\t\talert(\"부과 되었습니다.\");\r\n\t\telse if(obj == \"2\")\t\t\t\r\n\t\t\talert(\"부과된 정보입니다.\");\r\n\t}\r\n\t\r\n\tfunction goSearch()\r\n\t{\r\n\t\tvar toDate = document.getElementById(\"searchToDate\").value;\r\n\t\tvar fromDate = document.getElementById(\"searchFromDate\").value;\r\n\t\tvar type = document.getElementById(\"TYPE\").value;\r\n\t\tvar section = document.getElementById(\"SEARCH_SECTION\").value;\r\n\t\tvar purpose = document.getElementById(\"PURPOSE_CD\").value;\t\t\r\n\t\tvar tax_set = document.getElementById(\"TAX_SET\").value;\r\n\t\tvar bj_cd = document.getElementById(\"BJ_CD\").value;\r\n\t\tvar hj_cd = document.getElementById(\"HJ_CD\").value;\r\n\t\tvar bonbun = document.getElementById(\"BONBUN\").value;\r\n\t\tvar bubun = document.getElementById(\"BUBUN\").value;\r\n\t\tvar jumyongName = document.getElementById(\"jumyongName\").value;\r\n\t\tvar check_type = document.getElementById(\"check_type\").value;\r\n\t\tvar numberValue = document.getElementById(\"numberValue\").value;\t\t\t\t\r\n\r\n\t\tlocation.href=\"/jumyong/jumyong/search.do?tDate=\"+toDate+\"&fDate=\"+fromDate+\"&type=\"+type+\"&section=\"+section\r\n\t\t+\"&tax_set=\"+tax_set+\"&purpose=\"+purpose+\"&bj_cd=\"+bj_cd+\"&hj_cd=\"+hj_cd\r\n\t\t+\"&bonbun=\"+bonbun+\"&bubun=\"+bubun+\"&jumyongName=\"+jumyongName+\"&check_yn=\"+check_type+\"&numberValue=\"+numberValue+\"&currentPage=";
  private final static String _jspx_template12 = "\";\r\n\t}\r\n\t\r\n\tfunction fnPreView()\r\n\t{\t\r\n\t\tvar oRptMainParam;\r\n\t\toRptMainParam = rex_GetgoDictionay(); \r\n\r\n\t\t// 옵션 - viewer\t\r\n\t\toRptMainParam.put(\"rex_open_window\", \"center=yes,scrollbars=no,status=no,toolbar=no,resizable=0,location=no,menu=no,width=1000,height=1000\");\r\n\t\t\r\n\t\tif('";
  private final static String _jspx_template13 = "' == '2'){\t//점용구분 : 일시\r\n\t\t\t// 필수 - 레포트명\r\n\t\t\toRptMainParam.put(\"rex_rptname\", \"examination3_ilsi\");\r\n\t\t}\r\n\t\telse\t\t\t\t\t\t\t//점용구분 : 점용, 무단\r\n\t\t{\r\n\t\t\t// 필수 - 레포트명\r\n\t\t\toRptMainParam.put(\"rex_rptname\", \"examination3\");\r\n\t\t}\r\n\r\n\t\t// 필수 - 데이터 타입 설정\r\n\t\toRptMainParam.put(\"rex_datatype\", \"XML\");  // XML, CSV\r\n\r\n\t\t// 옵션 - 다른 DB를 연결시\r\n\t\toRptMainParam.put(\"rex_userservice\", \"oracle_jndi\");\r\n\r\n\t\t// 옵션 - 파라메터 설정\r\n\t\tvar form \t= document.form;\r\n\t\t\r\n\t\toRptMainParam.put(\"ADMIN_NO\" ,form.ADMIN_NO.value);\r\n\t\toRptMainParam.put(\"SEQ\" ,form.SEQ.value);\r\n\t\r\n\t\t// preview 팝업 열기\r\n\t\trex_gfRexRptOpen(\"popup\", oRptMainParam);\r\n\t\t\t\r\n\t\treturn oRptMainParam;\t\t\t\r\n\t}\r\n\r\n\tfunction fnPreView_pay()\r\n\t{\r\n\t\tvar section = document.getElementById(\"SECTION\").value;\r\n\t\tvar oRptMainParam;\r\n\t\toRptMainParam = rex_GetgoDictionay(); \r\n\r\n\t\t// 옵션 - viewer\t\r\n\t\toRptMainParam.put(\"rex_open_window\", \"center=yes,scrollbars=no,status=no,toolbar=no,resizable=0,location=no,menu=no,width=1000,height=1000\");\r\n\t\t\r\n\t\t// 필수 - 레포트명\r\n\t\toRptMainParam.put(\"rex_rptname\", \"examination_pay\");\r\n\r\n\t\t// 필수 - 데이터 타입 설정\r\n\t\toRptMainParam.put(\"rex_datatype\", \"XML\");  // XML, CSV\r\n\r\n\t\t// 옵션 - 다른 DB를 연결시\r\n\t\toRptMainParam.put(\"rex_userservice\", \"oracle_jndi\");\r\n\r\n\t\t// 옵션 - 파라메터 설정\r\n\t\tvar form \t= document.form;\r\n\t\tvar mudanForm  = tabDown.productForm.mudanForm.value;\r\n\t\tvar mudanPrice = tabDown.productForm.mudanPrice.value;\r\n\t\tvar mudanTotalSum = tabDown.productForm.mudanTotalSum.value;\r\n\t\t\tmudanForm = mudanForm.split('-').join(\"\\n -\");\r\n\t\t\t//mudanPrice = mudanPrice.split('-').join(\"\\n\");\r\n\t\t\t//mudanPrice = mudanPrice.split(',');\r\n\t\t\tmudanPrice = document.getElementById('GONGSI_PRICE').value;\r\n\r\n\t\toRptMainParam.put(\"ADMIN_NO\" ,form.ADMIN_NO.value);\r\n\t\toRptMainParam.put(\"SEQ\" ,form.SEQ.value);\r\n\t\toRptMainParam.put(\"CAL_INFO\" ,mudanForm);\r\n\t\toRptMainParam.put(\"PRICE\" ,mudanPrice);\r\n\t\toRptMainParam.put(\"TOTAL_SUM\" ,mudanTotalSum);\r\n\t\r\n\t\t// preview 팝업 열기\r\n\t\trex_gfRexRptOpen(\"popup\", oRptMainParam);\r\n\t\t\t\r\n\t\treturn oRptMainParam;\t\t\t\r\n\t}\r\n\t\r\n\tfunction fnOccupancyLicense()\r\n\t{\r\n\r\n\t\tvar oRptMainParam;\r\n\t  \tvar winW = screen.availWidth-10;\t\r\n  \t\tvar winH = screen.availHeight-50;\r\n  \t\t\r\n\t\toRptMainParam = rex_GetgoDictionay(); \r\n\r\n\t\t// 옵션 - viewer\t\r\n\t\toRptMainParam.put(\"rex_open_window\", \"center=yes,scrollbars=no,status=no,toolbar=no,resizable=0,location=no,menu=no,width=\"+winW+\",height=\"+winH);\r\n\r\n\t\t// 필수 - 데이터 타입 설정\r\n\t\toRptMainParam.put(\"rex_datatype\", \"XML\");  // XML, CSV\r\n\r\n\t\t// 옵션 - 다른 DB를 연결시\r\n\t\toRptMainParam.put(\"rex_userservice\", \"oracle_jndi\");\r\n\r\n\t\t// 옵션 - 파라메터 설정\r\n\t\tvar form \t= document.form;\r\n\r\n\t\toRptMainParam.put(\"ADMIN_NO\" ,form.ADMIN_NO.value);\r\n\t\toRptMainParam.put(\"YEAR\" ,form.year.value);\r\n\t\toRptMainParam.put(\"SEQ\" ,form.SEQ.value);\r\n\t\toRptMainParam.put(\"USER_ID\" ,form.USER_ID.value);\r\n\r\n\t\t\r\n\t\tif('";
  private final static String _jspx_template14 = "' == '2'){\t//점용구분 : 일시\r\n\t\t\t// 필수 - 레포트명\r\n\t\t\toRptMainParam.put(\"rex_rptname\", \"examination3_ilsi\");\r\n\t\t}\r\n\t\t\r\n\t\tif('";
  private final static String _jspx_template15 = "' == '하천' && '";
  private final static String _jspx_template16 = "'.substr(0,2) != '02')\r\n\t\t{\t//점용종류 : 하천\r\n\t\t// 필수 - 레포트명\t\t\t\r\n\t\t\talert(\"최초 허가일을 출력화면에서 입력해 주세요.\");\r\n\t\t\t\r\n\t\t\toRptMainParam.put(\"rex_rptname\", \"river_license\");\r\n\r\n\t\t\t// 옵션 - 파라메터 설정\r\n\t\t\toRptMainParam.put(\"PARAM\" ,\"허가기간을 입력해 주세요\");\r\n\t\t\toRptMainParam.put(\"rex_init_end\", \"javaInitEndFunction\") // javaInitEndFunction 실행함 (인자는 oRexCtl)\r\n\t\t}\r\n\t\telse if('";
  private final static String _jspx_template17 = "' != '1' && '";
  private final static String _jspx_template18 = "'.substr(0,2) == '02')\r\n\t\t{\t//점용종류 : 하천,구거,공유재산\r\n\t\t\t// 필수 - 레포트명\r\n\t\t\talert(\"점ㆍ사용 유형 / 실시계획인가 / 허가조건을 출력화면에서 입력해 주세요.\");\r\n\t\t\t\r\n\t\t\toRptMainParam.put(\"rex_rptname\", \"river_public_license\");\r\n\r\n\t\t\t// 옵션 - 파라메터 설정\r\n\t\t\toRptMainParam.put(\"PARAM1\" ,\"점ㆍ사용의 유형을 입력해 주세요\");\r\n\t\t\toRptMainParam.put(\"PARAM2\" ,\"실시계획인가 / 신고대상 여부를 입력해 주세요\");\r\n\t\t\toRptMainParam.put(\"PARAM3\" ,\"허가조건을 입력해 주세요\");\r\n\t\t}\r\n\t\telse\t\t\t\t\t\t\t//점용구분 : 점용, 무단\r\n\t\t{\r\n\t\t\t// 필수 - 레포트명\r\n\t\t\toRptMainParam.put(\"rex_rptname\", \"license\");\r\n\t\t}\r\n\r\n\t\t// preview 팝업 열기\r\n\t\trex_gfRexRptOpen(\"popup\", oRptMainParam);\r\n\t\t\t\r\n\t\treturn oRptMainParam;\t\r\n\t}\r\n\r\n\tfunction fnOccupancyLicense2()\r\n\t{\r\n\r\n\t\tvar oRptMainParam;\r\n\t  \tvar winW = screen.availWidth-10;\t\r\n  \t\tvar winH = screen.availHeight-50;\r\n  \t\t\r\n\t\toRptMainParam = rex_GetgoDictionay(); \r\n\r\n\t\t// 옵션 - viewer\t\r\n\t\toRptMainParam.put(\"rex_open_window\", \"center=yes,scrollbars=no,status=no,toolbar=no,resizable=0,location=no,menu=no,width=\"+winW+\",height=\"+winH);\r\n\r\n\t\t// 필수 - 데이터 타입 설정\r\n\t\toRptMainParam.put(\"rex_datatype\", \"XML\");  // XML, CSV\r\n\r\n\t\t// 옵션 - 다른 DB를 연결시\r\n\t\toRptMainParam.put(\"rex_userservice\", \"oracle_jndi\");\r\n\r\n\t\t// 옵션 - 파라메터 설정\r\n\t\tvar form \t= document.form;\r\n\r\n\t\toRptMainParam.put(\"ADMIN_NO\" ,form.ADMIN_NO.value);\r\n\t\toRptMainParam.put(\"YEAR\" ,form.year.value);\r\n\t\toRptMainParam.put(\"SEQ\" ,form.SEQ.value);\r\n\t\toRptMainParam.put(\"USER_ID\" ,form.USER_ID.value);\r\n\r\n\t\t\r\n\t\tif('";
  private final static String _jspx_template19 = "' == '2'){\t//점용구분 : 일시\r\n\t\t\t// 필수 - 레포트명\r\n\t\t\toRptMainParam.put(\"rex_rptname\", \"examination3_ilsi\");\r\n\t\t}\r\n\t\t\r\n\t\tif('";
  private final static String _jspx_template20 = "' == '하천' && '";
  private final static String _jspx_template21 = "'.substr(0,2) != '02')\r\n\t\t{\t//점용종류 : 하천\r\n\t\t// 필수 - 레포트명\t\t\t\r\n\t\t\talert(\"최초 허가일을 출력화면에서 입력해 주세요.\");\r\n\t\t\t\r\n\t\t\toRptMainParam.put(\"rex_rptname\", \"river_license\");\r\n\r\n\t\t\t// 옵션 - 파라메터 설정\r\n\t\t\toRptMainParam.put(\"PARAM\" ,\"허가기간을 입력해 주세요\");\r\n\t\t\toRptMainParam.put(\"rex_init_end\", \"javaInitEndFunction\") // javaInitEndFunction 실행함 (인자는 oRexCtl)\r\n\t\t}\r\n\t\telse if('";
  private final static String _jspx_template22 = "' != '1' && '";
  private final static String _jspx_template23 = "'.substr(0,2) == '02')\r\n\t\t{\t//점용종류 : 하천,구거,공유재산\r\n\t\t\t// 필수 - 레포트명\r\n\t\t\talert(\"점ㆍ사용 유형 / 실시계획인가 / 허가조건을 출력화면에서 입력해 주세요.\");\r\n\t\t\t\r\n\t\t\toRptMainParam.put(\"rex_rptname\", \"river_public_license\");\r\n\r\n\t\t\t// 옵션 - 파라메터 설정\r\n\t\t\toRptMainParam.put(\"PARAM1\" ,\"점ㆍ사용의 유형을 입력해 주세요\");\r\n\t\t\toRptMainParam.put(\"PARAM2\" ,\"실시계획인가 / 신고대상 여부를 입력해 주세요\");\r\n\t\t\toRptMainParam.put(\"PARAM3\" ,\"허가조건을 입력해 주세요\");\r\n\t\t}\r\n\t\telse\t\t\t\t\t\t\t//점용구분 : 점용, 무단\r\n\t\t{\r\n\t\t\t// 필수 - 레포트명\r\n\t\t\toRptMainParam.put(\"rex_rptname\", \"license_doro_151008\");\r\n\t\t}\r\n\r\n\t\t// preview 팝업 열기\r\n\t\trex_gfRexRptOpen(\"popup\", oRptMainParam);\r\n\t\t\t\r\n\t\treturn oRptMainParam;\t\r\n\t}\r\n\t\r\n\tvar i = 0;\r\n\t\r\n\tfunction resizeTabup(value)\r\n\t{\r\n\t\tif(i%2 == 0)\r\n\t\tiFrameResize(document.getElementById(value));\t\r\n\t\telse\r\n\t\t{\t\t\r\n\t\t\tvar iFrm = document.getElementById(\"tabUp1\");\r\n\t\t\tvar the_height = 0;\r\n\t\t\tiFrm.style.height = the_height;\r\n\t\t}\t\r\n\t\ti=i+1;\r\n\t}\r\n\r\n\t// rex_init_end 정의시 실행되는 프로시져\r\n\tfunction javaInitEndFunction(oRexCtl) {\r\n\t\toRexCtl.Zoom(\"100\");\r\n\t}\r\n\t\r\n\t\r\n//]]>\r\n</script>\r\n\r\n<body onload=\"Init();\">\r\n<table width=\"800\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n<form id=\"form\" name=\"form\" method=\"post\">\r\n<input type=\"hidden\" id=\"ADMIN_NO\" name=\"ADMIN_NO\" value=\"";
  private final static String _jspx_template24 = "\">\r\n<input type=hidden id=\"SEQ\" name=\"SEQ\"  value=\"";
  private final static String _jspx_template25 = "\">\r\n<input type=hidden id=\"USER_ID\" name=\"USER_ID\"  value=\"";
  private final static String _jspx_template26 = "\">\r\n\r\n<input type=\"hidden\" id=\"CURRENT_TABUP\" name=\"CURRENT_TABUP\" value=\"minwon\">\r\n<input type=\"hidden\" id=\"CURRENT_TABDOWN\" name=\"CURRENT_TABDOWN\" value=\"product\">\r\n<input type=\"hidden\" id=\"year\" name=\"year\" value=\"\">\r\n<input type=\"hidden\" id = \"searchToDate\" name=\"searchToDate\" value=\"";
  private final static String _jspx_template27 = "\">\r\n<input type=\"hidden\" id = \"searchFromDate\" name=\"searchFromDate\" value=\"";
  private final static String _jspx_template28 = "\">\r\n<input type=\"hidden\" id = \"TYPE\" name=\"TYPE\"  value=\"";
  private final static String _jspx_template29 = "\">\r\n<input type=\"hidden\" id = \"SECTION\" name=\"SECTION\" value=\"";
  private final static String _jspx_template30 = "\">\r\n<input type=\"hidden\" id = \"SEARCH_SECTION\" name=\"SEARCH_SECTION\" value=\"";
  private final static String _jspx_template31 = "\">\r\n<input type=\"hidden\" id = \"PURPOSE_CD\" name=\"PURPOSE_CD\" value=\"";
  private final static String _jspx_template32 = "\">\r\n<input type=\"hidden\" id = \"TAX_SET\" name=\"TAX_SET\" value=\"";
  private final static String _jspx_template33 = "\">\r\n<input type=\"hidden\" id = \"BJ_CD\" name=\"BJ_CD\" value=\"";
  private final static String _jspx_template34 = "\">\r\n<input type=\"hidden\" id = \"HJ_CD\" name=\"HJ_CD\" value=\"";
  private final static String _jspx_template35 = "\">\r\n<input type=\"hidden\" id = \"BONBUN\" name=\"BONBUN\" value=\"";
  private final static String _jspx_template36 = "\">\r\n<input type=\"hidden\" id = \"BUBUN\" name=\"BUBUN\" value=\"";
  private final static String _jspx_template37 = "\">\r\n<input type=\"hidden\" id = \"jumyongName\" name=\"jumyongName\" value=\"";
  private final static String _jspx_template38 = "\">\r\n<input type=\"hidden\" id = \"check_type\" name=\"check_type\" value=\"";
  private final static String _jspx_template39 = "\">\r\n<input type=\"hidden\" id = \"numberValue\" name=\"numberValue\" value=\"";
  private final static String _jspx_template40 = "\">\r\n\r\n<input type=\"hidden\" id=\"GONGSI_PRICE\" name=\"GONGSI_PRICE\" value=\"\">\r\n  <tr>\r\n    <td height=\"43\"><img src=\"/img/sub1_cont2_title.gif\" width=\"800\" height=\"43\"></td>\r\n  </tr>\r\n  \r\n  <tr>\r\n    <td align=\"center\">\r\n    <table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n      <tr>\r\n        <td height=\"40\" align=\"right\">\r\n\t<!--상단 기안문상신,도움말 메뉴-->\r\n\t\t<!--<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n          <tr>\r\n            <td height=\"8\" colspan=\"2\"></td>\r\n            </tr>\r\n          <tr>\r\n            <td><a href=\"#\"><img src=\"/img/report_icon.gif\" alt=\"기안문 상신\" width=\"92\" height=\"18\" border=\"0\"></a></td>\r\n            <td><a href=\"#\"><img src=\"/img/help_icon.gif\" alt=\"도움말\" width=\"65\" height=\"18\" border=\"0\"></a></td>\r\n            </tr>\r\n        </table>-->\r\n\t<!--상단 기안문상신,도움말 메뉴-->\t\t\r\n\t\t</td>\r\n      </tr>\r\n      \r\n     <!-- <tr>\r\n        <td height=\"1\" bgcolor=\"eaeaea\"></td>\r\n      </tr>  \r\n \r\n      <tr>\r\n        <td height=\"14\"></td>\r\n      </tr>-->\r\n           \r\n      <td align=\"right\" class=\"sub_table_b\">관리번호 : ";
  private final static String _jspx_template41 = "</td>\r\n      \r\n      <tr>\r\n        <td align=\"left\">\r\n        <table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n        \r\n        <tr>\r\n            <td height=\"22\" background=\"/img/tab_line_purple.gif\">\r\n            <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                <tr>\r\n                  <td width=\"111\"><a href=\"javascript:Tab_Minwon('";
  private final static String _jspx_template42 = "')\"><img id=\"minwon_img\" name=\"minwon_img\" src=\"/img/sub_petition_title9_on.gif\" alt=\"민원 정보\" width=\"110\" height=\"22\" border=\"0\"></a></td>\r\n                  <td width=\"111\"><a href=\"javascript:Tab_Jumin('";
  private final static String _jspx_template43 = "')\"><img id=\"jumin_img\" name=\"jumin_img\" src=\"/img/sub_petition_title2_off_b.gif\" alt=\"점용인 정보\" width=\"110\" height=\"22\" border=\"0\"></a></td>\r\n                  <td width=\"111\"><a href=\"javascript:Tab_Jumji('";
  private final static String _jspx_template44 = "')\"><img id=\"jumji_img\" name=\"jumji_img\" src=\"/img/sub_petition_title3_off.gif\" alt=\"점용지 정보\" width=\"110\" height=\"22\" border=\"0\"></a></td>\r\n                </tr>\r\n            </table>\r\n            </td>\r\n\t\t</tr>\r\n\t  <tr>\r\n\t\t<td>\r\n\t\t  \t<iframe width=\"100%\" height=\"100%\" id=\"tabUp\" name=\"tabUp\" frameborder=\"0\" onload=\"iFrameResize(this)\" scrolling=\"no\" src=\"/jumyong/jumyonginfo/minwon_view.do?ADMIN_NO=";
  private final static String _jspx_template45 = "&SECTION=";
  private final static String _jspx_template46 = "\"></iframe>\r\n\t\t</td>\r\n\t  </tr>\r\n      <tr>\r\n        <td height=\"30\"></td>\r\n      </tr>\r\n      <tr>\r\n\t\t<td>\r\n\t\t\t<!--\r\n\t\t  \t<font class=\"sub_table\">폐쇄처리</font>\r\n\t\t  \t-->\r\n\t\t  \t<img id=\"conduct_img\" name=\"conduct_img\" src=\"/img/closing_conduct.gif\" alt=\"폐쇄처리\"  border=\"0\">\r\n\t\t</td>\r\n\t  </tr>\r\n      <tr>\r\n\t\t<td>\r\n\t\t  \t<iframe width=\"100%\" height=\"100%\" id=\"tabUp1\" name=\"tabUp1\" frameborder=\"0\" onload=\"iFrameResize(this)\" scrolling=\"no\" src=\"/jumyong/disUse.do?ADMIN_NO=";
  private final static String _jspx_template47 = "&SECTION=";
  private final static String _jspx_template48 = "\"></iframe>\r\n\t\t</td>\r\n\t  </tr>\r\n\t  \r\n\t   <tr>\r\n        <td height=\"30\"></td>\r\n      </tr>\r\n\r\n      <tr>\r\n        <td align=\"left\">\r\n        <table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n          <tr>\r\n            <td height=\"22\" background=\"/img/tab_line_blue.gif\"><table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                <tr>\r\n                  <td width=\"111\" onclick =\"javascript:Tab_Product('";
  private final static String _jspx_template49 = "')\"><img id=\"product_img\" name=\"product_img\" src=\"/img/sub_petition_title4_on.gif\" alt=\"산출내역\" width=\"110\" height=\"22\" border=\"0\" style=\"cursor:pointer\" ></td>\r\n\t\t          <td width=\"111\" onclick =\"javascript:Tab_Place('";
  private final static String _jspx_template50 = "')\"><img id=\"place_img\"  name=\"place_img\" src=\"/img/sub_petition_title7_off.gif\" alt=\"첨부자료\" width=\"110\" height=\"22\" border=\"0\" style=\"cursor:pointer\" ></td>\r\n\t\t          <td width=\"111\" onclick =\"javascript:Tab_History('";
  private final static String _jspx_template51 = "')\"><img id=\"history_img\" name=\"history_img\" src=\"/img/sub_petition_title8_off.gif\" alt=\"이력정보\" width=\"110\" height=\"22\" border=\"0\" style=\"cursor:pointer\" ></td>\r\n                </tr>\r\n            </table></td>\r\n          </tr>\t\t  \r\n          <tr>\r\n  \t\t\t<td>\r\n  \t\t\t\t<iframe width=\"100%\" height=\"150\" id = \"tabDown\" name=\"tabDown\" frameborder=\"0\" onload=\"iFrameResize(this);\" scrolling=\"no\" src=\"/jumyong/productInsert.do?no=";
  private final static String _jspx_template52 = "\"></iframe><!-- /jumyong/saewe/bugwa_view.do?ADMIN_NO=";
  private final static String _jspx_template53 = " -->\r\n  \t\t\t</td>\r\n          </tr>\r\n        </table>\r\n        </td>\r\n      </tr>\t\t\r\n\t\t\r\n\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n\t<tr>\r\n      <td height=\"40\" align=\"right\">\r\n      \t";
  private final static String _jspx_template54 = "\r\n\t\t    ";
  private final static String _jspx_template55 = " \t\t\t\t\t\t\t\t                \t\r\n\t\t\t\t\t<span  class=\"myButton\" onclick=\"javascript:fnPreView_pay();\">변상금 산출조사서</span>\r\n\t\t\t\t";
  private final static String _jspx_template56 = "\r\n\t     \t";
  private final static String _jspx_template57 = "\t\t\t\t                \t\r\n\t\t\t\t\t<span class=\"myButton\" onclick=\"javascript:fnPreView();\">산출조사서</span>\r\n\t\t\t\t";
  private final static String _jspx_template58 = "\t\t\t\t\r\n\t\t\t\t\t<span class=\"myButton\" onclick=\"javascript:fnOccupancyLicense();\">점용허가증</span>\r\n\t\t\t\t\t<span class=\"myButton\" onclick=\"javascript:fnOccupancyLicense2();\">점용허가증(도로법)</span>\r\n\t\t\t\t";
  private final static String _jspx_template59 = "\r\n\t      <span class=\"myButton\" onclick=\"javascript:goSearch();\">리스트</span>\r\n      </td>\r\n\t</tr>\r\n\t<tr>\r\n      <td height=\"20\" ></td>\r\n\t</tr>\r\n\t\r\n\t</table>\r\n  </td>\r\n </tr>\r\n\t\r\n</table>\r\n</body>\r\n</html> ";
}
