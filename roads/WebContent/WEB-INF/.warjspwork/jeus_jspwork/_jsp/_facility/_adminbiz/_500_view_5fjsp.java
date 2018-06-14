package jeus_jspwork._jsp._facility._adminbiz;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_view_5fjsp extends jeus.servlet.jsp.HttpJspBase {

  public final String[] __jeusGetIncludedJspFiles() {
    return new String[] {
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
      pageContext = _jspxFactory.getPageContext(this, request, response, "", true, 8192, true);
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
      // jsp code [from=(75,60);to=(75,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${CORP_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template4);
      // jsp code [from=(76,60);to=(76,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GU_CODE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template5);
      // jsp code [from=(77,69);to=(77,80)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template6);
      // jsp code [from=(78,62);to=(78,70)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${adminBiz}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template7);
      // jsp code [from=(79,62);to=(79,70)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MIN_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template8);
      // jsp code [from=(119,80);to=(119,90)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template9);
      // jsp code [from=(121,80);to=(121,89)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SSN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(126,64);to=(126,76)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OFFICE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(131,52);to=(131,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOPOST_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(133,52);to=(133,64)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BIZSSN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(139,10);to=(139,20)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.POST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(139,24);to=(139,32)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SI}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(139,36);to=(139,45)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(139,49);to=(139,59)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.DONG}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(139,63);to=(139,71)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.RI}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_0_fn(pageContext, null)) return;


      // jsp code [from=(139,125);to=(139,136)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.LNBR1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(139,140);to=(139,151)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.LNBR2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(139,155);to=(139,166)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADDR2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(146,10);to=(146,20)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.POST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(146,24);to=(146,32)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SI}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // jsp code [from=(146,36);to=(146,45)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);
      // jsp code [from=(146,49);to=(146,64)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ROAD_ADDR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template26);
      // jsp code [from=(146,68);to=(146,80)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SPC_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_1_fn(pageContext, null)) return;


      // jsp code [from=(146,134);to=(146,148)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ROAD_BON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template29);
      // jsp code [from=(146,152);to=(146,165)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ROAD_BU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template30);
      // jsp code [from=(146,169);to=(146,180)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template31);
      // jsp code [from=(146,184);to=(146,199)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_DET_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template32);
      // jsp code [from=(152,52);to=(152,68)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BIZ_STATUS}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template33);
      // jsp code [from=(154,52);to=(154,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BIZ_TYPES}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template34);
      // jsp code [from=(171,11);to=(171,23)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOPOST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template35);
      // jsp code [from=(171,27);to=(171,37)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOSI}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template36);
      // jsp code [from=(171,41);to=(171,52)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOGUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template37);
      // jsp code [from=(171,56);to=(171,68)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TODONG}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template38);
      // jsp code [from=(171,72);to=(171,82)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TORI}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template39);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_2_fn(pageContext, null)) return;


      // jsp code [from=(171,139);to=(171,153)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TO_LNBR1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template41);
      // jsp code [from=(171,157);to=(171,171)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TO_LNBR2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template42);
      // jsp code [from=(171,175);to=(171,188)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOADDR2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template43);
      // jsp code [from=(178,11);to=(178,23)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOPOST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template44);
      // jsp code [from=(178,27);to=(178,37)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOSI}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template45);
      // jsp code [from=(178,41);to=(178,52)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOGUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template46);
      // jsp code [from=(178,56);to=(178,72)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TO_DORO_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template47);
      // jsp code [from=(178,76);to=(178,91)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TO_SPC_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template48);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_3_fn(pageContext, null)) return;


      // jsp code [from=(178,148);to=(178,163)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TO_BD_BON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template50);
      // jsp code [from=(178,167);to=(178,181)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TO_BD_BU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template51);
      // jsp code [from=(178,185);to=(178,199)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TO_BD_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template52);
      // jsp code [from=(178,203);to=(178,221)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TO_BD_DET_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template53);
      // jsp code [from=(195,52);to=(195,64)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OFFICE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template54);
      // jsp code [from=(195,72);to=(195,85)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.MANAGER}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template55);
      // jsp code [from=(197,52);to=(197,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOTEL}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template56);
      // jsp code [from=(197,72);to=(197,87)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOTEL_EXT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template57);
      // jsp code [from=(202,52);to=(202,65)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.MANAGER}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template58);
      // jsp code [from=(204,52);to=(204,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOTEL}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template59);
      // jsp code [from=(204,72);to=(204,87)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOTEL_EXT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template60);
      // jsp code [from=(209,52);to=(209,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOFAX}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template61);
      // jsp code [from=(211,52);to=(211,62)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOHP}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template62);

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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SPC_CD == '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template19);

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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SPC_CD == '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
      if (_jspx_eval_c_if_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template28);

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
    _jspx_th_c_if_2.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TO_SPC_CD == '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
      if (_jspx_eval_c_if_2 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template40);

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
    _jspx_th_c_if_3.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TO_SPC_CD == '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
      if (_jspx_eval_c_if_3 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template49);

        } while (_jspx_th_c_if_3.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_3.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_3.release();
    }
    return false;
  }

  private final static String _jspx_template0 = "\r\n";
  private final static String _jspx_template1 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('사용자의 사용시간이 종료되었습니다. 다시 접속 해주시기 바랍니다.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template2 = "    \r\n";
  private final static String _jspx_template3 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n}\r\n-->\r\n\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script type=\"text/javascript\">\r\n//<![CDATA[\r\n\r\n\tfunction\tModify()\r\n\t{\r\n\t\tvar form = document.form;\r\n\t\tvar corp_cd = form.CORP_CD.value;\r\n\t\tvar currentPage = form.currentPage.value;\r\n\t\t\r\n\t\tform.action = \"/facility/adminbiz/modify.do?CORP_CD=\"+corp_cd+\"&currentPage=\"+currentPage\r\n\t\tform.submit();\r\n\t}\r\n\t\r\n\tfunction Delete(){\r\n\t\t\r\n\t\tvar ok = confirm(\"해당 관리업체를 삭제하시겠습니까?\");\r\n\t\t\r\n\t\t\r\n\t\t\r\n\t\tvar form = document.form;\r\n\t\tvar corp_cd = form.CORP_CD.value;\t\t\r\n\t\t\r\n\t\tif(ok== true){\r\n\t\t\tform.action = \"/facility/adminbiz/delete.do?CORP_CD=\"+corp_cd;\r\n\t\t\tform.submit();\r\n\t\t}else{\r\n\t\t\treturn;\r\n\t\t}\r\n\t\t\r\n\t}\r\n\r\n\tfunction\tgoList()\r\n\t{\r\n\t\tvar form = document.form;\r\n\t\tvar currentPage = form.currentPage.value;\r\n\t\tvar adminBiz = form.adminBiz.value;\r\n\t\tvar MIN_NAME = form.MIN_NAME.value;\r\n\r\n\t\tform.action = \"/facility/adminbiz/search.do?currentPage=\"+currentPage+\"&adminBiz=\"+adminBiz+\"&MIN_NAME=\"+MIN_NAME;\r\n\t\tform.submit();\r\n\t}\r\n\r\n\r\n//]]>\r\n</script>\r\n\r\n<body>\r\n\r\n<form name=\"form\" id=\"form\" method=\"post\">\r\n\t\r\n\t<input type=\"hidden\" name=\"CORP_CD\" id=\"CORP_CD\" value=\"";
  private final static String _jspx_template4 = "\">\r\n\t<input type=\"hidden\" name=\"GU_CODE\" id=\"GU_CODE\" value=\"";
  private final static String _jspx_template5 = "\">\r\n\t<input type=\"hidden\" name=\"currentPage\"  id=\"currentPage\" value=\"";
  private final static String _jspx_template6 = "\">\r\n\t<input type=\"hidden\" name=\"adminBiz\" id=\"adminBiz\" value=\"";
  private final static String _jspx_template7 = "\">\r\n\t<input type=\"hidden\" name=\"MIN_NAME\" id=\"MIN_NAME\" value=\"";
  private final static String _jspx_template8 = "\">\r\n\r\n\t\r\n<table width=\"800\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n  <tr>\r\n    <td height=\"43\"><img src=\"/img/sub3_cont1_title.gif\" width=\"800\" height=\"43\"></td>\r\n  </tr>\r\n  <tr>\r\n    <td align=\"center\">\r\n    <table width=\"780\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t<tr>\r\n\t\t\t<td align=\"left\" >\r\n\t\t\t<table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t      <tr>\r\n\t\t\t        <td height=\"1\" bgcolor=\"#ffffff\"></td>\r\n\t\t\t      </tr>\r\n\t\t\t      <tr>\r\n\t\t\t        <td height=\"14\"></td>\r\n\t\t\t      </tr>\r\n\t\t\t      \r\n\t\t\t      <tr>\r\n\t\t\t        <td align=\"left\"><table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t          <tr>\r\n\t\t\t            <td height=\"22\" background=\"/img/tab_line_blue.gif\"><table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t                <tr>\r\n\t\t\t                  <td><img src=\"/img/sub_petition_title1.gif\" width=\"110\" height=\"22\"></td>\r\n\t\t\t                </tr>\r\n\t\t\t            </table></td>\r\n\t\t\t          </tr>\r\n\t\t\t          \r\n\t\t\t          <tr>\r\n\t\t\t            <td class=\"contborder_blue\">\r\n\t\t\t\r\n\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t<tr>\r\n\t\t\t\t  <td>\r\n\t\t\t\t  \r\n\t\t\t\t  <table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t\t\t  <tr height=\"25\">\r\n\t\t\t\t\t\t<td width=\"15%\" height=\"25\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" nowrap=\"nowrap\">점용인(법인명)</td>\r\n\t\t\t\t\t\t<td width=\"35%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" nowrap=\"nowrap\">";
  private final static String _jspx_template9 = "</td>\r\n\t\t\t\t\t\t<td width=\"15%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" nowrap=\"nowrap\">주민(법인)번호</td>\r\n\t\t\t\t\t\t<td width=\"35%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" nowrap=\"nowrap\">";
  private final static String _jspx_template10 = "</td>\r\n\t\t\t\t\t  </tr>\r\n\t\t\t\t\t<!--  //********** BEGIN_KANG_20120409 -->\r\n\t\t\t\t\t  <tr height=\"25\">\r\n\t\t\t\t\t\t<td height=\"25\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">지점명</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\">";
  private final static String _jspx_template11 = "</td>\r\n\t\t\t\t\t  </tr>\r\n\t\t\t\t\t<!--   //********** END_KANG_20120409 -->\r\n\t\t\t\t\t  <tr height=\"25\">\r\n\t\t\t\t\t\t<td height=\"25\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">대표자명</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template12 = "</td>\r\n\t\t\t\t\t\t<td height=\"25\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">사업자 등록번호</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template13 = "</td>\r\n\t\t\t\t\t  </tr>\r\n\r\n\t\t\t\t\t  <tr height=\"25\">\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" height=\"25\">주소</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template14 = " ";
  private final static String _jspx_template15 = " ";
  private final static String _jspx_template16 = " ";
  private final static String _jspx_template17 = " ";
  private final static String _jspx_template18 = " ";
  private final static String _jspx_template19 = "산&nbsp;";
  private final static String _jspx_template20 = "-";
  private final static String _jspx_template21 = " ";
  private final static String _jspx_template22 = " \r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t  </tr>\r\n\r\n\t\t\t\t\t  <tr height=\"25\">\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" height=\"25\">도로명 주소</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template23 = " ";
  private final static String _jspx_template24 = " ";
  private final static String _jspx_template25 = " ";
  private final static String _jspx_template26 = " ";
  private final static String _jspx_template27 = " ";
  private final static String _jspx_template28 = "산&nbsp;";
  private final static String _jspx_template29 = "-";
  private final static String _jspx_template30 = " ";
  private final static String _jspx_template31 = " ";
  private final static String _jspx_template32 = " \r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t  </tr>\r\n\r\n\t\t\t\t\t  <tr height=\"25\">\r\n\t\t\t\t\t  \t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" height=\"25\">업태</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template33 = "</td>\r\n\t\t\t\t\t  \t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" height=\"25\">종목</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template34 = "</td>\r\n\t\t\t\t\t  </tr>\r\n\t\r\n\t\r\n\t\t\t\t\t  <tr height=\"25\">\r\n\t\t\t\t\t\t<td height=\"34\" colspan=\"4\" align=\"left\" bgcolor=\"#FFFFFF\" class=\"\">\r\n\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t  <td><span class=\"sub_stan_blue\"><img src=\"/img/facility_view5.gif\" alt=\"우편물 송달지\"></span></td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t  </tr>\r\n\t\t\t\t\t  \r\n\t\t\t\t\t  <tr height=\"25\">\r\n\t\t\t\t\t  \t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">주소</td>\r\n\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\" height=\"25\">\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template35 = "\t";
  private final static String _jspx_template36 = " ";
  private final static String _jspx_template37 = " ";
  private final static String _jspx_template38 = " ";
  private final static String _jspx_template39 = " ";
  private final static String _jspx_template40 = "산&nbsp;";
  private final static String _jspx_template41 = "-";
  private final static String _jspx_template42 = " ";
  private final static String _jspx_template43 = " \r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t  \r\n\t\t\t\t\t  <tr height=\"25\">\r\n\t\t\t\t\t  \t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">도로명 주소</td>\r\n\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\" height=\"25\">\r\n\t\t\t\t\t\t\t\t";
  private final static String _jspx_template44 = "\t";
  private final static String _jspx_template45 = " ";
  private final static String _jspx_template46 = " ";
  private final static String _jspx_template47 = " ";
  private final static String _jspx_template48 = " ";
  private final static String _jspx_template49 = "산&nbsp;";
  private final static String _jspx_template50 = "-";
  private final static String _jspx_template51 = " ";
  private final static String _jspx_template52 = " ";
  private final static String _jspx_template53 = " \r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t  \r\n\t\t\t\t\t  <tr height=\"25\">\r\n\t\t\t\t\t\t<td height=\"34\" colspan=\"4\" align=\"left\" bgcolor=\"#FFFFFF\" class=\"\">\r\n\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t  <td><span class=\"sub_stan_blue\"><img src=\"/img/facility_view6.gif\" alt=\"담당자 정보\"></span></td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t  </tr>\r\n\t\t\t\t\t<!--  //********** BEGIN_KANG_20120409 -->\r\n\t\t\t\t\t<!-- \r\n\t\t\t\t\t  <tr height=\"25\">\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">지점명/담당자명</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template54 = "  /  ";
  private final static String _jspx_template55 = "</td>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">전화번호</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template56 = "  (내선 ";
  private final static String _jspx_template57 = ")</td>\r\n\t\t\t\t\t  </tr>\r\n\t\t\t\t\t-->\r\n\t\t\t\t\t  <tr height=\"25\">\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">담당자명</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template58 = "</td>\r\n\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">전화번호</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template59 = "  (내선 ";
  private final static String _jspx_template60 = ")</td>\r\n\t\t\t\t\t  </tr>\r\n\t\t\t\t\t<!--   //********** END_KANG_20120409 -->\r\n\t\t\t\t\t  <tr height=\"25\">\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">팩스 </td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template61 = "</td>\r\n\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">휴대전화</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template62 = "</td>\r\n\t\t\t\t\t  </tr>\r\n\t\t\t\t  </table></td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"40\" align=\"right\">\r\n\t\t\t\t\t<table width=\"0\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" align=\"right\">\r\n\t\t\t\t  \t\t<td height=\"40\" align=\"right\"><a href=\"javascript:Modify()\"><img src=\"/img/mod_icon.gif\" alt=\"수정\" width=\"56\" height=\"18\" border=\"0\"></a>\r\n\t\t\t\t  \t\t<td height=\"40\" align=\"right\"><a href=\"javascript:Delete()\"><img src=\"/img/del_icon3.gif\" alt=\"수정\" width=\"56\" height=\"18\" border=\"0\"></a> \t\r\n\t\t\t\t  \t</table>\r\n\t\t\t\t  \t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t</table></td>\r\n\t\t</tr>\r\n\t</table>\r\n    \r\n    </td>         \r\n</tr>\r\n<tr>\r\n\t<td height='50' align='right'><img src=\"/img/list_icon.gif\" alt=\"리스트\"  border=\"0\" onClick='goList();' style='cursor:hand;'></td>\r\n</tr>\r\n</table>\r\n\t\r\n\r\n\r\n</form>\r\n</body>\r\n</html>\r\n";
}
