package jeus_jspwork._jsp._jumyong._gigan._tab;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_jumin_5fview_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      out.write(_jspx_template1);
      // jsp code [from=(1,3);to=(6,1)]
      
      	String 		userId	= (String)session.getAttribute("sessionUserId");
      	
      	if(userId == null)
      	{

      out.write(_jspx_template2);
      // jsp code [from=(11,3);to=(13,1)]
      
      	}

      out.write(_jspx_template3);
      out.write(_jspx_template4);
      out.write(_jspx_template5);
      out.write(_jspx_template6);
      out.write(_jspx_template7);
      out.write(_jspx_template8);
      out.write(_jspx_template9);
      out.write(_jspx_template10);
      // jsp code [from=(39,61);to=(39,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(40,59);to=(40,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(49,63);to=(49,73)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(53,21);to=(53,30)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SSN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(61,51);to=(61,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BIZSSN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(63,51);to=(63,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BIZ_STATUS}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(63,71);to=(63,86)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BIZ_TYPES}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(67,64);to=(67,74)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.POST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(73,17);to=(73,28)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADDR1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_0_fn(pageContext, null)) return;


      // jsp code [from=(74,64);to=(74,73)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_1_fn(pageContext, null)) return;


      out.write(_jspx_template22);
      // jsp code [from=(74,134);to=(74,145)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADDR2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(80,17);to=(80,25)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SI}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // jsp code [from=(80,34);to=(80,43)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);
      // jsp code [from=(80,52);to=(80,65)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.DORO_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template26);
      // jsp code [from=(81,23);to=(81,35)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_BON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // jsp code [from=(81,44);to=(81,55)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_BU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template28);
      // jsp code [from=(81,64);to=(81,75)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template29);
      // jsp code [from=(81,84);to=(81,99)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_DET_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template30);
      // jsp code [from=(88,51);to=(88,62)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.EMAIL}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template31);
      // jsp code [from=(90,51);to=(90,74)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BEFORE_PERMISSION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template32);
      // jsp code [from=(94,51);to=(94,60)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TEL}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template33);
      // jsp code [from=(96,51);to=(96,59)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.HP}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template34);
      // jsp code [from=(101,97);to=(101,112)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.REFERENCE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template35);
      // jsp code [from=(113,63);to=(113,73)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TONM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template36);
      // jsp code [from=(117,63);to=(117,75)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOPOST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template37);
      // jsp code [from=(123,17);to=(123,30)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOADDR1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template38);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_2_fn(pageContext, null)) return;


      // jsp code [from=(124,66);to=(124,77)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOBON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_3_fn(pageContext, null)) return;


      out.write(_jspx_template41);
      // jsp code [from=(124,142);to=(124,155)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOADDR2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template42);
      // jsp code [from=(130,17);to=(130,27)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOSI}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template43);
      // jsp code [from=(130,36);to=(130,47)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOGUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template44);
      // jsp code [from=(130,55);to=(130,70)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TODORO_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template45);
      // jsp code [from=(131,17);to=(131,31)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOBD_BON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template46);
      // jsp code [from=(131,40);to=(131,53)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOBD_BU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template47);
      // jsp code [from=(131,62);to=(131,75)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOBD_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template48);
      // jsp code [from=(131,84);to=(131,101)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOBD_DET_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template49);
      // jsp code [from=(137,63);to=(137,75)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOMAIL}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template50);
      // jsp code [from=(141,51);to=(141,62)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOTEL}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template51);
      // jsp code [from=(143,51);to=(143,61)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOHP}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template52);

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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SAN == '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template20);

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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BU != null}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
      if (_jspx_eval_c_if_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template21);
          // jsp code [from=(74,110);to=(74,118)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BU}",java.lang.String.class , pageContext.getVariableResolver(), null));


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
    _jspx_th_c_if_2.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOSAN == '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
      if (_jspx_eval_c_if_2 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template39);

        } while (_jspx_th_c_if_2.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_2.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_2.release();
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
    _jspx_th_c_if_3.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOBU != null}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
      if (_jspx_eval_c_if_3 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template40);
          // jsp code [from=(124,116);to=(124,126)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOBU}",java.lang.String.class , pageContext.getVariableResolver(), null));


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
  private final static String _jspx_template1 = "\r\n";
  private final static String _jspx_template2 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('사용자의 사용시간이 종료되었습니다. 다시 접속 해주시기 바랍니다.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template3 = "\r\n";
  private final static String _jspx_template4 = "\r\n";
  private final static String _jspx_template5 = "  \r\n";
  private final static String _jspx_template6 = "  \r\n";
  private final static String _jspx_template7 = "  \r\n";
  private final static String _jspx_template8 = "\r\n";
  private final static String _jspx_template9 = "\r\n";
  private final static String _jspx_template10 = "\r\n\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n}\r\n-->\r\n\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script type=\"text/javascript\">\r\n//<![CDATA[\r\n\r\n\tfunction \tInit()\r\n\t{\r\n\t\tparent.TabUp_Img(\"jumin\");\r\n\t}\r\n\t\r\n//]]>\r\n</script>\r\n\r\n<body onload=\"Init();\">\r\n<table width=\"780\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n<form id=\"form\" name=\"form\" method=\"post\">\r\n<input type=\"hidden\" id=\"ADMIN_NO\" name=\"ADMIN_NO\" value=\"";
  private final static String _jspx_template11 = "\">\r\n<input type=\"hidden\" id=\"SECTION\" name=\"SECTION\" value=\"";
  private final static String _jspx_template12 = "\">\r\n\r\n\t<tr>\r\n\t\t<td align=\"left\" class=\"contborder_purple\">\r\n\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t<tr>\r\n\t\t\t  <td><table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용인/법인명</td>\r\n\t\t\t\t\t<td width=\"37%\" bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template13 = "</td>\r\n\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">주민/법인번호</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" id=\"ssn\">\r\n\t\t\t\t\t\t<script type=\"text/javascript\">\r\n\t\t\t\t\t\t\tvar ssn = \"";
  private final static String _jspx_template14 = "\";\r\n\t\t\t\t\t\t\tvar ssnAsterisk = ssn.substring(7).replace(/./g, '*');\r\n\t\t\t\t\t\t\tdocument.getElementById(\"ssn\").innerHTML = ssn.substring(0, 7) + ssnAsterisk;\r\n\t\t\t\t\t\t</script>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">사업자등록번호</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template15 = "</td>\r\n\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">업태/업종</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template16 = " ";
  private final static String _jspx_template17 = "</td>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td height=\"30\" align=\"center\" bgcolor=\"e5eff8\"  class=\"sub_table_b\">우편번호</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\"  colspan=\"3\" class=\"table_bl_left\">";
  private final static String _jspx_template18 = "</td>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t  <tr>\r\n\t\t\t\t  <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">주소</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t<tr><td>";
  private final static String _jspx_template19 = "</td></tr>\r\n\t\t\t\t\t\t<tr><td>";
  private final static String _jspx_template20 = "산&nbsp;";
  private final static String _jspx_template21 = "-";
  private final static String _jspx_template22 = "&nbsp;";
  private final static String _jspx_template23 = "<td></tr>\r\n\t\t\t\t\t</table>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t    <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">새주소</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t<tr><td>";
  private final static String _jspx_template24 = "&nbsp;";
  private final static String _jspx_template25 = "&nbsp;";
  private final static String _jspx_template26 = "</td></tr>\r\n\t\t\t\t\t\t<tr><td>&nbsp;";
  private final static String _jspx_template27 = "&nbsp;";
  private final static String _jspx_template28 = "&nbsp;";
  private final static String _jspx_template29 = "&nbsp;";
  private final static String _jspx_template30 = "<td></tr>\r\n\t\t\t\t\t</table>\r\n\t\t\t\t\t</td>\t\r\n\t\t\t\t  </tr> \r\n\t\t\t\t  \r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">e-mail</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template31 = "</td>\r\n\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">기존 허가번호</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template32 = "</td>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">전화번호</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template33 = "</td>\r\n\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">휴대전화</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template34 = "</td>\r\n\t\t\t\t  </tr>\r\n\t\t\t      <tr height=\"40px\">\r\n        \t\t  \t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">비고</td>\r\n      \t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n      \t\t\t\t\t<textarea type=\"text\" class=\"view\" style=\"width:99%;overflow-y: scroll ;\" readonly>";
  private final static String _jspx_template35 = "</textarea>\r\n      \t\t\t\t</td>\r\n        \t\t  </tr> \r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td height=\"34\" colspan=\"4\" align=\"left\" bgcolor=\"#FFFFFF\" class=\"\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t  <td><span class=\"sub_stan_blue\">* 우편물 송달지</span></td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t</table></td>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">우편물 수령인 </td>\r\n\t\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template36 = "</td>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td height=\"30\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">우편번호</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" colspan=\"3\" class=\"table_bl_left\">";
  private final static String _jspx_template37 = "</td>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">송달지 주소</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t<tr><td>";
  private final static String _jspx_template38 = "</td></tr>\r\n\t\t\t\t\t\t<tr><td>";
  private final static String _jspx_template39 = "산&nbsp;";
  private final static String _jspx_template40 = "-";
  private final static String _jspx_template41 = "&nbsp;";
  private final static String _jspx_template42 = "<td></tr>\r\n\t\t\t\t\t</table>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">송달지 새 주소</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t<tr><td>";
  private final static String _jspx_template43 = "&nbsp;";
  private final static String _jspx_template44 = "&nbsp";
  private final static String _jspx_template45 = "</td></tr>\r\n\t\t\t\t\t\t<tr><td>";
  private final static String _jspx_template46 = "&nbsp;";
  private final static String _jspx_template47 = "&nbsp;";
  private final static String _jspx_template48 = "&nbsp;";
  private final static String _jspx_template49 = "<td></tr>\r\n\t\t\t\t\t</table>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">e-mail</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\">";
  private final static String _jspx_template50 = "</td>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">전화번호</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template51 = "</td>\r\n\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">휴대전화</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template52 = "</td>\r\n\t\t\t\t  </tr>\r\n\t\t\t  </table></td>\r\n\t\t\t</tr>\r\n\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n</table>\r\n</body>\r\n</html>";
}
