package jeus_jspwork._jsp._facility._minwon._tab;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_jumin_5fsearch_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      out.write(_jspx_template12);
      out.write(_jspx_template13);
      // jsp code [from=(196,68);to=(196,79)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(212,167);to=(212,175)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${adminBiz}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(215,172);to=(215,181)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MIN_NAME }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(227,89);to=(227,97)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${totalcnt}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // ----  c:choose ---- invoke //
      if (_jspx_th_c_choose_0_fn(pageContext, null)) return;


      out.write(_jspx_template35);
      // jsp code [from=(271,9);to=(271,17)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${pageing }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template36);

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
  private boolean _jspx_th_c_choose_0_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:choose ---- //
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = new org.apache.taglibs.standard.tag.common.core.ChooseTag();
    _jspx_th_c_choose_0.setPageContext(pageContext);
    try {
      int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
      if (_jspx_eval_c_choose_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template18);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template32);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template34);

        } while (_jspx_th_c_choose_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_choose_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_choose_0.release();
    }
    return false;
  }

  private boolean _jspx_th_c_when_0_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:when ---- //
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = new org.apache.taglibs.standard.tag.rt.core.WhenTag();
    _jspx_th_c_when_0.setPageContext(pageContext);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist!= null && !empty blist}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
      if (_jspx_eval_c_when_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template19);
          // ----  c:forEach ---- invoke //
          if (_jspx_th_c_forEach_0_fn(pageContext, _jspx_th_c_when_0)) return true;


          out.write(_jspx_template31);

        } while (_jspx_th_c_when_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_when_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_when_0.release();
    }
    return false;
  }

  private boolean _jspx_th_c_otherwise_0_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:otherwise ---- //
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = new org.apache.taglibs.standard.tag.common.core.OtherwiseTag();
    _jspx_th_c_otherwise_0.setPageContext(pageContext);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    try {
      int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
      if (_jspx_eval_c_otherwise_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template33);

        } while (_jspx_th_c_otherwise_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_otherwise_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_otherwise_0.release();
    }
    return false;
  }

  private boolean _jspx_th_c_forEach_0_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:forEach ---- //
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = new org.apache.taglibs.standard.tag.rt.core.ForEachTag();
    _jspx_th_c_forEach_0.setPageContext(pageContext);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("board");
    _jspx_th_c_forEach_0.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template20);
            // jsp code [from=(246,43);to=(246,53)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.RNUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template21);
            // jsp code [from=(247,59);to=(247,69)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template22);
            // jsp code [from=(248,37);to=(248,49)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OFFICE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template23);
            // jsp code [from=(249,37);to=(249,50)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.CORP_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template24);
            // jsp code [from=(250,37);to=(250,47)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.POST}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template25);
            // jsp code [from=(251,37);to=(251,48)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADDR1}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template26);
            // jsp code [from=(252,37);to=(252,51)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ROADADDR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template27);
            // jsp code [from=(253,124);to=(253,137)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.CORP_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template28);
            // jsp code [from=(254,128);to=(254,141)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.CORP_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template29);
            // jsp code [from=(254,147);to=(254,154)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${gu_code}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template30);

          } while (_jspx_th_c_forEach_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
        }
        if (_jspx_th_c_forEach_0.doEndTag() == Tag.SKIP_PAGE)
          return true;
      } catch (Throwable t) {
        _jspx_th_c_forEach_0.doCatch(t);
      } finally {
        _jspx_th_c_forEach_0.doFinally();
      }
    } finally {
      _jspx_th_c_forEach_0.release();
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
  private final static String _jspx_template9 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script> \r\n<script language='JavaScript' src='/js/Check_inputbox.js'></script>\r\n<script language='JavaScript' src='/js/Ajax_request.js'></script>\r\n\r\n<script type=\"text/javascript\">\r\n//<![CDATA[\r\n\r\n\tfunction\tPage(page)\r\n\t{\r\n\t\tif(page\t==\t\"\")\r\n\t\t\treturn;\r\n\t\t\r\n\t\tvar form1 = document.form1;\r\n\t//\tvar\tLISTVIEW\t= document.getElementById(\"LISTVIEW\");\r\n\t//\tLISTVIEW.value\t= \"1\";\r\n\t\t\r\n\t\tform1.currentPage.value\t= page;\r\n\r\n\t\tform1.action = \"/facility/minwon/jumin_search.do\";\r\n\t\tform1.submit();\r\n\t}\r\n\t\r\n\tfunction\tSearch()\r\n\t{\r\n\t\tvar form1 \t\t= document.form1;\r\n//\t\tvar\tLISTVIEW\t= document.getElementById(\"LISTVIEW\");\r\n//\t\tLISTVIEW.value\t= \"1\";\r\n\t\t\r\n//\t\tvar\tdate\t= DateCheck();\r\n//\t\tif(date\t== true)\r\n//\t\t\treturn;\r\n\t\r\n\t\tform1.currentPage.value\t= 1;\r\n\r\n\t\tform1.action = \"/facility/minwon/jumin_search.do\";\r\n\t\tform1.submit();\r\n\t}\r\n\t\r\n\tfunction onCheck(){\r\n\t\tvar form1 \t= document.form1;\r\n\t\t\r\n\t\tif(form1.MIN_REQNO.value.length == '18'){\r\n\t\t\tform1.MIN_NAME.focus();\r\n\t\t}\r\n\t}\t\r\n\t\r\n/*\r\n\r\najax 함수\r\n\r\n*/\t\r\n\r\n\tfunction Appeal_Modify(corp_cd){\r\n\r\n\t\tvar param = \"&CORP_CD=\"+corp_cd;\r\n\r\n\t\tsendRequest(\"/facility/minwon/jumin_ajax_tab.do\", param, \"GET\", ResultAdminBizView);\r\n\t}\r\n\r\n\tfunction\tResultAdminBizView(obj)\r\n\t{\r\n\t\t\r\n\t\t  var xmldoc = new ActiveXObject(\"Microsoft.XMLDOM\");\r\n\r\n\t\t  xmldoc.async\t= false;\r\n\t\t  \r\n\t\t  xmldoc.loadXML(obj);\r\n\t\t  \r\n\t\t  \r\n\t\t  \r\n\t\t  if(xmldoc.getElementsByTagName(\"NAME\").length >0 && xmldoc.getElementsByTagName(\"NAME\").item(0).firstChild != null)  parent.tab1.document.getElementById(\"NAME\").value \t  = xmldoc.getElementsByTagName(\"NAME\").item(0).firstChild.nodeValue; \t\t\t \t\t    \r\n\t\t  else parent.tab1.document.getElementById(\"NAME\").value = \"\";  \r\n\t\t  if(xmldoc.getElementsByTagName(\"CORP_CD\").length >0 && xmldoc.getElementsByTagName(\"CORP_CD\").item(0).firstChild != null)  parent.tab1.document.getElementById(\"CORP_CD\").value \t  = xmldoc.getElementsByTagName(\"CORP_CD\").item(0).firstChild.nodeValue;\t\t\t \t\t    \r\n\t\t  else parent.tab1.document.getElementById(\"CORP_CD\").value = \"\";\t  \r\n\t\t  //  parent.tab1.document.getElementById(\"GU_CODE\").value \t = xmldoc.getElementsByTagName(\"GU_CODE\").item(0).firstChild.nodeValue;\r\n\t\t   if(xmldoc.getElementsByTagName(\"OFFICE\").length >0 && xmldoc.getElementsByTagName(\"OFFICE\").item(0).firstChild != null)  parent.tab1.document.getElementById(\"OFFICE\").value \t = xmldoc.getElementsByTagName(\"OFFICE\").item(0).firstChild.nodeValue;\r\n\t\t   else parent.tab1.document.getElementById(\"OFFICE\").value = \"\";\r\n\t\t   if(xmldoc.getElementsByTagName(\"jumin_ssn1\").length >0 && xmldoc.getElementsByTagName(\"jumin_ssn1\").item(0).firstChild != null) parent.tab1.document.getElementById(\"jumin_ssn1\").value \t = xmldoc.getElementsByTagName(\"jumin_ssn1\").item(0).firstChild.nodeValue;\r\n\t\t   else parent.tab1.document.getElementById(\"jumin_ssn1\").value = \"\";\r\n\t\t   if(xmldoc.getElementsByTagName(\"jumin_ssn2\").length >0 && xmldoc.getElementsByTagName(\"jumin_ssn2\").item(0).firstChild != null) parent.tab1.document.getElementById(\"jumin_ssn2\").value \t = xmldoc.getElementsByTagName(\"jumin_ssn2\").item(0).firstChild.nodeValue;\r\n\t\t   else parent.tab1.document.getElementById(\"jumin_ssn2\").value = \"\"; \r\n\t\t   if(xmldoc.getElementsByTagName(\"jumin_bizssn1\").length >0 && xmldoc.getElementsByTagName(\"jumin_bizssn1\").item(0).firstChild != null) parent.tab1.document.getElementById(\"jumin_bizssn1\").value \t = xmldoc.getElementsByTagName(\"jumin_bizssn1\").item(0).firstChild.nodeValue;\r\n\t\t   else parent.tab1.document.getElementById(\"jumin_bizssn1\").value = \"\"; \r\n\t\t   if(xmldoc.getElementsByTagName(\"jumin_bizssn2\").length >0 && xmldoc.getElementsByTagName(\"jumin_bizssn2\").item(0).firstC";
  private final static String _jspx_template10 = "hild != null) parent.tab1.document.getElementById(\"jumin_bizssn2\").value \t = xmldoc.getElementsByTagName(\"jumin_bizssn2\").item(0).firstChild.nodeValue;\r\n\t\t   else parent.tab1.document.getElementById(\"jumin_bizssn2\").value = \"\"; \r\n\t\t   if(xmldoc.getElementsByTagName(\"jumin_bizssn3\").length >0 && xmldoc.getElementsByTagName(\"jumin_bizssn3\").item(0).firstChild != null) parent.tab1.document.getElementById(\"jumin_bizssn3\").value \t = xmldoc.getElementsByTagName(\"jumin_bizssn3\").item(0).firstChild.nodeValue;\r\n\t\t   else parent.tab1.document.getElementById(\"jumin_bizssn3\").value = \"\"; \r\n\t\t   if(xmldoc.getElementsByTagName(\"jumin_tel1\").length >0 && xmldoc.getElementsByTagName(\"jumin_tel1\").item(0).firstChild != null) parent.tab1.document.getElementById(\"jumin_tel1\").value \t = xmldoc.getElementsByTagName(\"jumin_tel1\").item(0).firstChild.nodeValue;\r\n\t\t   else parent.tab1.document.getElementById(\"jumin_tel1\").value = \"\";\r\n\t\t   if(xmldoc.getElementsByTagName(\"jumin_tel2\").length >0 && xmldoc.getElementsByTagName(\"jumin_tel2\").item(0).firstChild != null) parent.tab1.document.getElementById(\"jumin_tel2\").value \t = xmldoc.getElementsByTagName(\"jumin_tel2\").item(0).firstChild.nodeValue;\r\n\t\t   else parent.tab1.document.getElementById(\"jumin_tel2\").value = \"\";\r\n\t\t   if(xmldoc.getElementsByTagName(\"jumin_tel3\").length >0 && xmldoc.getElementsByTagName(\"jumin_tel3\").item(0).firstChild != null) parent.tab1.document.getElementById(\"jumin_tel3\").value \t = xmldoc.getElementsByTagName(\"jumin_tel3\").item(0).firstChild.nodeValue;\r\n\t\t   else parent.tab1.document.getElementById(\"jumin_tel3\").value = \"\";\r\n\t\t   if(xmldoc.getElementsByTagName(\"jumin_fax1\").length >0 && xmldoc.getElementsByTagName(\"jumin_fax1\").item(0).firstChild != null) parent.tab1.document.getElementById(\"jumin_fax1\").value \t = xmldoc.getElementsByTagName(\"jumin_fax1\").item(0).firstChild.nodeValue;\r\n\t\t   else parent.tab1.document.getElementById(\"jumin_fax1\").value = \"\";\r\n\t\t   if(xmldoc.getElementsByTagName(\"jumin_fax2\").length >0 && xmldoc.getElementsByTagName(\"jumin_fax2\").item(0).firstChild != null) parent.tab1.document.getElementById(\"jumin_fax2\").value \t = xmldoc.getElementsByTagName(\"jumin_fax2\").item(0).firstChild.nodeValue;\r\n\t\t   else parent.tab1.document.getElementById(\"jumin_fax2\").value = \"\";\r\n\t\t   if(xmldoc.getElementsByTagName(\"jumin_fax3\").length >0 && xmldoc.getElementsByTagName(\"jumin_fax3\").item(0).firstChild != null) parent.tab1.document.getElementById(\"jumin_fax3\").value \t  = xmldoc.getElementsByTagName(\"jumin_fax3\").item(0).firstChild.nodeValue;\r\n\t\t   else parent.tab1.document.getElementById(\"jumin_fax3\").value = \"\";\r\n\t\t   if(xmldoc.getElementsByTagName(\"jumin_hp1\").length >0 && xmldoc.getElementsByTagName(\"jumin_hp1\").item(0).firstChild != null) parent.tab1.document.getElementById(\"jumin_hp1\").value \t  = xmldoc.getElementsByTagName(\"jumin_hp1\").item(0).firstChild.nodeValue;\r\n\t\t   else parent.tab1.document.getElementById(\"jumin_hp1\").value = \"\";\r\n\t\t   if(xmldoc.getElementsByTagName(\"jumin_hp2\").length >0 && xmldoc.getElementsByTagName(\"jumin_hp2\").item(0).firstChild != null) parent.tab1.document.getElementById(\"jumin_hp2\").value \t  = xmldoc.getElementsByTagName(\"jumin_hp2\").item(0).firstChild.nodeValue;\r\n\t\t   else parent.tab1.document.getElementById(\"jumin_hp2\").value = \"\";\r\n\t\t   if(xmldoc.getElementsByTagName(\"jumin_hp3\").length >0 && xmldoc.getElementsByTagName(\"jumin_hp3\").item(0).firstChild != null) parent.tab1.document.getElementById(\"jumin_hp3\").value \t  = xmldoc.getElementsByTagName(\"jumin_hp3\").item(0).firstChild.nodeValue;\r\n\t\t   else parent.tab1.document.getElementById(\"jumin_hp3\").value = \"\";\r\n\t\t   if(xmldoc.getElementsByTagName(\"POST\").length >0 && xmldoc.getElementsByTagName(\"POST\").item(0).firstChild != null) parent.tab1.document.getElementById(\"BON_POST\").value    = xmldoc.getElementsByTagName(\"POST\").item(0).firstChild.nodeValue;\r\n\t\t   else parent.tab1.document.getElementById(\"BON_POST\").value = \"\";\r\n\t  \t   if(xmldoc.getElementsByTagName(\"ADDR1\").length >0 && xmldoc.getElementsByTagName(\"ADDR1\").item(0).firstChild != null) parent.tab1.document.getElem";
  private final static String _jspx_template11 = "entById(\"ADDR1\").value    = xmldoc.getElementsByTagName(\"ADDR1\").item(0).firstChild.nodeValue;\r\n\t  \t   else parent.tab1.document.getElementById(\"ADDR1\").value = \"\";\r\n\t\t   if(xmldoc.getElementsByTagName(\"ADDR2\").length >0 && xmldoc.getElementsByTagName(\"ADDR2\").item(0).firstChild != null) parent.tab1.document.getElementById(\"ADDR2\").value    = xmldoc.getElementsByTagName(\"ADDR2\").item(0).firstChild.nodeValue;\r\n\t\t   else parent.tab1.document.getElementById(\"ADDR2\").value = \"\";\r\n\t\t   if(xmldoc.getElementsByTagName(\"BIZ_STATUS\").length >0 && xmldoc.getElementsByTagName(\"BIZ_STATUS\").item(0).firstChild != null) parent.tab1.document.getElementById(\"BIZ_STATUS\").value    = xmldoc.getElementsByTagName(\"BIZ_STATUS\").item(0).firstChild.nodeValue;\r\n\t\t   else parent.tab1.document.getElementById(\"BIZ_STATUS\").value = \"\";\r\n\t\t   if(xmldoc.getElementsByTagName(\"BIZ_TYPES\").length >0 && xmldoc.getElementsByTagName(\"BIZ_TYPES\").item(0).firstChild != null) parent.tab1.document.getElementById(\"BIZ_TYPES\").value    = xmldoc.getElementsByTagName(\"BIZ_TYPES\").item(0).firstChild.nodeValue;\r\n\t\t   else parent.tab1.document.getElementById(\"BIZ_TYPES\").value = \"\";\r\n\t\t   if(xmldoc.getElementsByTagName(\"TOPOST\").length >0 && xmldoc.getElementsByTagName(\"TOPOST\").item(0).firstChild != null) parent.tab1.document.getElementById(\"TO_POST\").value    = xmldoc.getElementsByTagName(\"TOPOST\").item(0).firstChild.nodeValue;\r\n\t\t   else parent.tab1.document.getElementById(\"TO_POST\").value = \"\";\r\n\t\t   if(xmldoc.getElementsByTagName(\"TOADDR1\").length >0 && xmldoc.getElementsByTagName(\"TOADDR1\").item(0).firstChild != null) parent.tab1.document.getElementById(\"TOADDR1\").value    = xmldoc.getElementsByTagName(\"TOADDR1\").item(0).firstChild.nodeValue;\r\n\t\t   else parent.tab1.document.getElementById(\"TOADDR1\").value = \"\";\r\n\t\t   if(xmldoc.getElementsByTagName(\"TOADDR2\").length >0 && xmldoc.getElementsByTagName(\"TOADDR2\").item(0).firstChild != null) parent.tab1.document.getElementById(\"TOADDR2\").value    = xmldoc.getElementsByTagName(\"TOADDR2\").item(0).firstChild.nodeValue;\r\n\t\t   else parent.tab1.document.getElementById(\"TOADDR2\").value = \"\";\r\n\t\t   if(xmldoc.getElementsByTagName(\"TOTEL_EXT\").length >0 && xmldoc.getElementsByTagName(\"TOTEL_EXT\").item(0).firstChild != null) parent.tab1.document.getElementById(\"TEL_EXT\").value    = xmldoc.getElementsByTagName(\"TOTEL_EXT\").item(0).firstChild.nodeValue;\r\n\t\t   else parent.tab1.document.getElementById(\"TEL_EXT\").value = \"\";\r\n\t\t   if(xmldoc.getElementsByTagName(\"TOPOST_NM\").length >0 && xmldoc.getElementsByTagName(\"TOPOST_NM\").item(0).firstChild != null) parent.tab1.document.getElementById(\"TOPOST_NM\").value    = xmldoc.getElementsByTagName(\"TOPOST_NM\").item(0).firstChild.nodeValue;\r\n\t\t   else parent.tab1.document.getElementById(\"TOPOST_NM\").value = \"\";\r\n\t\t   if(xmldoc.getElementsByTagName(\"MANAGER\").length >0 && xmldoc.getElementsByTagName(\"MANAGER\").item(0).firstChild != null) parent.tab1.document.getElementById(\"MANAGER\").value    = xmldoc.getElementsByTagName(\"MANAGER\").item(0).firstChild.nodeValue;\r\n\t\t   else parent.tab1.document.getElementById(\"MANAGER\").value = \"\";\r\n\t\t   if(xmldoc.getElementsByTagName(\"LNBR1\").length >0 && xmldoc.getElementsByTagName(\"LNBR1\").item(0).firstChild != null) parent.tab1.document.getElementById(\"BON\").value    = xmldoc.getElementsByTagName(\"LNBR1\").item(0).firstChild.nodeValue;\r\n\t\t   else parent.tab1.document.getElementById(\"BON\").value = \"\";\r\n\t\t   if(xmldoc.getElementsByTagName(\"LNBR2\").length >0 && xmldoc.getElementsByTagName(\"LNBR2\").item(0).firstChild != null) parent.tab1.document.getElementById(\"BU\").value    = xmldoc.getElementsByTagName(\"LNBR2\").item(0).firstChild.nodeValue;\r\n\t\t   else parent.tab1.document.getElementById(\"BU\").value = \"\";\r\n\t\t   if(xmldoc.getElementsByTagName(\"TO_LNBR1\").length >0 && xmldoc.getElementsByTagName(\"TO_LNBR1\").item(0).firstChild != null) parent.tab1.document.getElementById(\"TOBON\").value    = xmldoc.getElementsByTagName(\"TO_LNBR1\").item(0).firstChild.nodeValue;\r\n\t\t   else parent.tab1.document.getElementById(\"TOBON\").value = \"\";\r\n\t\t   if(xmldoc.getElementsByTagNa";
  private final static String _jspx_template12 = "me(\"TO_LNBR2\").length >0 && xmldoc.getElementsByTagName(\"TO_LNBR2\").item(0).firstChild != null) parent.tab1.document.getElementById(\"TOBU\").value    = xmldoc.getElementsByTagName(\"TO_LNBR2\").item(0).firstChild.nodeValue;\r\n\t\t   else parent.tab1.document.getElementById(\"TOBU\").value = \"\";\r\n\t\t   if(xmldoc.getElementsByTagName(\"ROAD_BON\").length >0 && xmldoc.getElementsByTagName(\"ROAD_BON\").item(0).firstChild != null) parent.tab1.document.getElementById(\"BD_BON\").value    = xmldoc.getElementsByTagName(\"ROAD_BON\").item(0).firstChild.nodeValue;\r\n\t\t   else parent.tab1.document.getElementById(\"BD_BON\").value = \"\";\r\n\t\t   if(xmldoc.getElementsByTagName(\"ROAD_BU\").length >0 && xmldoc.getElementsByTagName(\"ROAD_BU\").item(0).firstChild != null) parent.tab1.document.getElementById(\"BD_BU\").value    = xmldoc.getElementsByTagName(\"ROAD_BU\").item(0).firstChild.nodeValue;\r\n\t\t   else parent.tab1.document.getElementById(\"BD_BU\").value = \"\";\r\n\t\t   if(xmldoc.getElementsByTagName(\"BD_NM\").length >0 && xmldoc.getElementsByTagName(\"BD_NM\").item(0).firstChild != null) parent.tab1.document.getElementById(\"BD_NM\").value    = xmldoc.getElementsByTagName(\"BD_NM\").item(0).firstChild.nodeValue;\r\n\t\t   else parent.tab1.document.getElementById(\"BD_NM\").value = \"\";\r\n\t\t   if(xmldoc.getElementsByTagName(\"BD_DET_NM\").length >0 && xmldoc.getElementsByTagName(\"BD_DET_NM\").item(0).firstChild != null) parent.tab1.document.getElementById(\"BD_DET_NM\").value    = xmldoc.getElementsByTagName(\"BD_DET_NM\").item(0).firstChild.nodeValue;\r\n\t\t   else parent.tab1.document.getElementById(\"BD_DET_NM\").value = \"\";\r\n\t\t   if(xmldoc.getElementsByTagName(\"TO_BD_BON\").length >0 && xmldoc.getElementsByTagName(\"TO_BD_BON\").item(0).firstChild != null) parent.tab1.document.getElementById(\"TO_BD_BON\").value    = xmldoc.getElementsByTagName(\"TO_BD_BON\").item(0).firstChild.nodeValue;\r\n\t\t   else parent.tab1.document.getElementById(\"TO_BD_BON\").value = \"\";\r\n\t\t   if(xmldoc.getElementsByTagName(\"TO_BD_BU\").length >0 && xmldoc.getElementsByTagName(\"TO_BD_BU\").item(0).firstChild != null) parent.tab1.document.getElementById(\"TO_BD_BU\").value    = xmldoc.getElementsByTagName(\"TO_BD_BU\").item(0).firstChild.nodeValue;\r\n\t\t   else parent.tab1.document.getElementById(\"TO_BD_BU\").value = \"\";\r\n\t\t   if(xmldoc.getElementsByTagName(\"TO_BD_NM\").length >0 && xmldoc.getElementsByTagName(\"TO_BD_NM\").item(0).firstChild != null) parent.tab1.document.getElementById(\"TO_BD_NM\").value    = xmldoc.getElementsByTagName(\"TO_BD_NM\").item(0).firstChild.nodeValue;\r\n\t\t   else parent.tab1.document.getElementById(\"TO_BD_NM\").value = \"\";\r\n\t\t   if(xmldoc.getElementsByTagName(\"TO_BD_DET_NM\").length >0 && xmldoc.getElementsByTagName(\"TO_BD_DET_NM\").item(0).firstChild != null) parent.tab1.document.getElementById(\"TO_BD_DET_NM\").value    = xmldoc.getElementsByTagName(\"TO_BD_DET_NM\").item(0).firstChild.nodeValue;\r\n\t\t   else parent.tab1.document.getElementById(\"TO_BD_DET_NM\").value = \"\";\r\n\t\t   if(xmldoc.getElementsByTagName(\"ROAD_ADDR\").length >0 && xmldoc.getElementsByTagName(\"ROAD_ADDR\").item(0).firstChild != null) parent.tab1.document.getElementById(\"ADDR1_NEW\").value    = xmldoc.getElementsByTagName(\"ROAD_ADDR\").item(0).firstChild.nodeValue;\r\n\t\t   else parent.tab1.document.getElementById(\"ADDR1_NEW\").value = \"\";\r\n\t\t   if(xmldoc.getElementsByTagName(\"TO_ROAD_ADDR\").length >0 && xmldoc.getElementsByTagName(\"TO_ROAD_ADDR\").item(0).firstChild != null) parent.tab1.document.getElementById(\"TOADDR1_NEW\").value    = xmldoc.getElementsByTagName(\"TO_ROAD_ADDR\").item(0).firstChild.nodeValue;\r\n\t\t   else parent.tab1.document.getElementById(\"TOADDR1_NEW\").value = \"\";\r\n\t\t    \r\n\t\t   if(xmldoc.getElementsByTagName(\"SPC_CD\").length >0 && xmldoc.getElementsByTagName(\"SPC_CD\").item(0).firstChild != null) parent.tab1.document.getElementById(\"SAN\").check    = xmldoc.getElementsByTagName(\"SPC_CD\").item(0).firstChild.nodeValue;\r\n\t\t   else parent.tab1.document.getElementById(\"SAN\").check = \"0\";\r\n\t\t   if(xmldoc.getElementsByTagName(\"TO_SPC_CD\").length >0 && xmldoc.getElementsByTagName(\"TO_SPC_CD\").item(0).firstChild != null) parent.tab1.document.getElem";
  private final static String _jspx_template13 = "entById(\"TOSAN\").check    = xmldoc.getElementsByTagName(\"TO_SPC_CD\").item(0).firstChild.nodeValue;\r\n\t\t   else parent.tab1.document.getElementById(\"TOSAN\").check = \"0\";\r\n\t\t   \r\n\t\t      \r\n\t\t  //탭 전환 \r\n\t\t   parent.tab1.selectTabMenu();\r\n\t\t\r\n\r\n\r\n\r\n\t}\r\n\t\r\n//]]>\r\n</script>\r\n\r\n<body>\r\n<form name=\"form1\" id=\"form1\" method=\"post\" action=\"search.jsp\">\r\n <input type=\"hidden\" name=\"currentPage\" id=\"currentPage\" value=\"";
  private final static String _jspx_template14 = "\"> \r\n \r\n<table width=\"780\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n  <tr>\r\n    <td align=\"center\"><table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">      \r\n      <tr>\r\n        <td align=\"left\"><table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n      \r\n          \r\n          <tr>\r\n            <td class=\"contborder_purple\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                <tr>\r\n                  <td><table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n                  \r\n                      <tr>\r\n                        <td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">관리업체명</td>\r\n                        <td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input type=\"text\" class=\"input_form1\" style=\"width:200px\" name=\"adminBiz\" id=\"adminBiz\"  value=\"";
  private final static String _jspx_template15 = "\"> \r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">담당자명</td>\r\n                        <td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n                        \t<input name=\"MIN_NAME\" id=\"MIN_NAME\" type=\"text\" class=\"input_form1\" style=\"width:200px\"  onkeypress=\"if(event.keyCode == 13) Search();\" value=\"";
  private final static String _jspx_template16 = "\">\r\n                        </td>\r\n                  </table></td>\r\n                </tr>\r\n                <tr>\r\n                  <td height=\"32\" align=\"right\"><a href=\"javascript:Search();\"><img src=\"/img/inquiry_icon2.gif\" alt=\"조회\" width=\"56\" height=\"18\" border=\"0\"></a></td>\r\n                </tr>\r\n\r\n                <tr>\r\n                  <td height=\"1\" bgcolor=\"#EAEAEA\"></td>\r\n                </tr>\r\n                <tr>\r\n                  <td height=\"34\" class=\"sub_stan\">전체건수 : <span class=\"sub_stan_blue\">";
  private final static String _jspx_template17 = "</span> 건 </td>\r\n                </tr>\r\n                <tr>\r\n                  <td><table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n                      <tr>\r\n                        <td height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">번호</td>\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">관리업체명</td>\t\t\t\t\t\t\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">지점명</td>\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">업체코드</td>\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">우편번호</td>\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">주소</td>\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">도로명주소</td>\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">등록</td>\r\n                      </tr>\r\n                      \r\n\t\t\t\t\t";
  private final static String _jspx_template18 = "\r\n\t\t\t\t\t\t";
  private final static String _jspx_template19 = "\r\n\t\t                      ";
  private final static String _jspx_template20 = "\r\n\t\t\t                     <tr onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\" >\r\n\t\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\">";
  private final static String _jspx_template21 = "</td>\r\n\t\t\t                     \t<td height=\"26\" align=\"center\">";
  private final static String _jspx_template22 = "</td>\r\n\t\t        \t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template23 = "</td>\t\t        \t\t\t\t\t\r\n\t\t        \t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template24 = "</td>\r\n\t\t        \t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template25 = "</td>\r\n\t\t        \t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template26 = "</td>\r\n\t\t        \t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template27 = "</td>\r\n\t\t        \t\t\t\t\t<td align=\"center\"><img src=\"/img/select_icon.gif\" alt=\"수정\" border=\"0\" onclick=\"javaScript:Appeal_Modify('";
  private final static String _jspx_template28 = "');\" style=\"CURSOR:Hand;\"></td>\t\t\t\t        \t\t\t\t\t\r\n<!-- \t\t        \t\t\t\t<td align=\"center\"><img src=\"/img/select_icon.gif\" alt=\"수정\" border=\"0\" onclick=\"javaScript:Appeal_Modify('";
  private final static String _jspx_template29 = "','";
  private final static String _jspx_template30 = "');\" style=\"CURSOR:Hand;\"></td>\t\t\t\t        \t\t\t\t\t-->\r\n\t\t\t                     </tr>\r\n\t\t\t\t\t\t\t ";
  private final static String _jspx_template31 = "\r\n\t\t\t\t\t\t";
  private final static String _jspx_template32 = "\t\t\t\t\t\t\r\n\t\t\t\t\t\t";
  private final static String _jspx_template33 = "\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td align=\"center\" class=\"sub_table\" colspan=\"11\" height=\"85\">검색된 내용이 없습니다</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t";
  private final static String _jspx_template34 = "\r\n\t\t\t\t\t ";
  private final static String _jspx_template35 = "\r\n\t\t\t\t\t \r\n\t\t\t\t\t </table>\r\n\t\t\t\t\t </td>\r\n                </tr>\r\n                <tr>\r\n                  <td height=\"30\" align=\"center\"><table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                      <tr>\r\n\t\t\t\t\t\t";
  private final static String _jspx_template36 = "\r\n                      </tr>\r\n                  </table></td>\r\n                </tr>\r\n\r\n            </table></td>\r\n          </tr>      \r\n        </table></td>\r\n      </tr>\r\n\r\n  \t<tr><td>\r\n  \t</td>\r\n  \t</tr>\r\n</table></td>         \r\n</tr>\r\n</table>\r\n\r\n\r\n</body>\r\n</html>\r\n\r\n";
}
