package jeus_jspwork._jsp._jumyong._jumyonginfo._tab;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_minwon_5fview_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(128,60);to=(128,68)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(129,51);to=(129,54)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(130,59);to=(130,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(137,81);to=(137,89)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${totalcnt}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // ----  c:choose ---- invoke //
      if (_jspx_th_c_choose_0_fn(pageContext, null)) return;


      out.write(_jspx_template32);
      // jsp code [from=(180,7);to=(180,14)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${pageing}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template33);
      out.write(_jspx_template34);
      // jsp code [from=(293,14);to=(293,23)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${REFERENCE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template35);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_0_fn(pageContext, null)) return;


      out.write(_jspx_template43);

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
          out.write(_jspx_template15);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template29);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template31);

        } while (_jspx_th_c_choose_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_choose_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_choose_0.release();
    }
    return false;
  }

  private boolean _jspx_th_c_if_0_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:if ---- //
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = new org.apache.taglibs.standard.tag.rt.core.IfTag();
    _jspx_th_c_if_0.setPageContext(pageContext);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION != '4'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template36);
          // ----  c:choose ---- invoke //
          if (_jspx_th_c_choose_1_fn(pageContext, _jspx_th_c_if_0)) return true;


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
          out.write(_jspx_template16);
          // ----  c:forEach ---- invoke //
          if (_jspx_th_c_forEach_0_fn(pageContext, _jspx_th_c_when_0)) return true;


          out.write(_jspx_template28);

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
          out.write(_jspx_template30);

        } while (_jspx_th_c_otherwise_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_otherwise_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_otherwise_0.release();
    }
    return false;
  }

  private boolean _jspx_th_c_choose_1_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:choose ---- //
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_1 = new org.apache.taglibs.standard.tag.common.core.ChooseTag();
    _jspx_th_c_choose_1.setPageContext(pageContext);
    _jspx_th_c_choose_1.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    try {
      int _jspx_eval_c_choose_1 = _jspx_th_c_choose_1.doStartTag();
      if (_jspx_eval_c_choose_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template37);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_1_fn(pageContext, _jspx_th_c_choose_1)) return true;


          out.write(_jspx_template39);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_1_fn(pageContext, _jspx_th_c_choose_1)) return true;


          out.write(_jspx_template41);

        } while (_jspx_th_c_choose_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_choose_1.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_choose_1.release();
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
            out.write(_jspx_template17);
            // jsp code [from=(155,55);to=(155,69)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template18);
            // jsp code [from=(155,75);to=(155,84)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template19);
            // jsp code [from=(156,57);to=(156,65)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.RN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template20);
            // jsp code [from=(157,35);to=(157,47)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.REQ_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template21);
            // jsp code [from=(158,35);to=(158,47)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.REQ_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template22);
            // jsp code [from=(159,35);to=(159,46)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GUBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template23);
            // jsp code [from=(160,35);to=(160,45)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template24);
            // jsp code [from=(161,35);to=(161,63)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(board.REQ_DATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template25);
            // jsp code [from=(162,35);to=(162,62)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(board.PREDATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template26);
            // jsp code [from=(163,35);to=(163,48)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.MANAGER}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template27);

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

  private boolean _jspx_th_c_when_1_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:when ---- //
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = new org.apache.taglibs.standard.tag.rt.core.WhenTag();
    _jspx_th_c_when_1.setPageContext(pageContext);
    _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_when_1.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist!= null && !empty blist}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
      if (_jspx_eval_c_when_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template38);

        } while (_jspx_th_c_when_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_when_1.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_when_1.release();
    }
    return false;
  }

  private boolean _jspx_th_c_otherwise_1_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:otherwise ---- //
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_1 = new org.apache.taglibs.standard.tag.common.core.OtherwiseTag();
    _jspx_th_c_otherwise_1.setPageContext(pageContext);
    _jspx_th_c_otherwise_1.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    try {
      int _jspx_eval_c_otherwise_1 = _jspx_th_c_otherwise_1.doStartTag();
      if (_jspx_eval_c_otherwise_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template40);

        } while (_jspx_th_c_otherwise_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_otherwise_1.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_otherwise_1.release();
    }
    return false;
  }

  private static jeus.servlet.jsp.el.FunctionMapperImpl _jspx_fnmap_0;
  
  static {
    _jspx_fnmap_0 = jeus.servlet.jsp.el.FunctionMapperImpl.getInstance();
    _jspx_fnmap_0.mapFunction("rnic:addDash", main.java.common.util.StringUtil.class, "addDash", new Class[] {java.lang.String.class});

  }
  
  private final static String _jspx_template0 = "<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n";
  private final static String _jspx_template1 = "\r\n";
  private final static String _jspx_template2 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('사용자의 사용시간이 종료되었습니다. 다시 접속 해주시기 바랍니다.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template3 = "\r\n";
  private final static String _jspx_template4 = "\r\n";
  private final static String _jspx_template5 = "  \r\n";
  private final static String _jspx_template6 = "  \r\n";
  private final static String _jspx_template7 = "  \r\n";
  private final static String _jspx_template8 = "\r\n";
  private final static String _jspx_template9 = "\r\n";
  private final static String _jspx_template10 = "\r\n\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script language='JavaScript' src='/js/Check_inputbox.js'></script>\r\n<script language=\"javascript\" src=\"/js/Ajax_request.js\"></script>\r\n\r\n\r\n<script type=\"text/javascript\">\r\n//<![CDATA[\r\n\r\n\tfunction\tPage(page)\r\n\t{\r\n\t\tif(page\t==\t\"\")\r\n\t\t\treturn;\r\n\t\t\r\n\t\tvar form = document.form;\r\n\r\n\t\tform.action = \"minwon_view.do?currentPage=\" + page;\r\n\t\tform.submit();\r\n\t}\r\n\r\n\tfunction\tResult_InfoView(obj)\r\n\t{\r\n\t\t//document.write(obj);\r\n        var xmldoc \t= new ActiveXObject(\"Microsoft.XMLDOM\");\r\n        var form \t= document.form;\r\n\t\t\r\n        xmldoc.async\t= false;\r\n\t\txmldoc.loadXML(obj);\r\n\r\n\t\tform.ADMIN_NO.value\t\t=\txmldoc.getElementsByTagName(\"ADMIN_NO\").item(0).text;\r\n\t\tform.SEQ.value\t\t\t=\txmldoc.getElementsByTagName(\"SEQ\").item(0).text;\r\n\t\tform.REQ_NO.value\t\t=\txmldoc.getElementsByTagName(\"REQ_NO\").item(0).text;\r\n\t\tform.GUBUN.value\t\t=\txmldoc.getElementsByTagName(\"GUBUN\").item(0).text;\r\n\t\tform.REQ_DATE.value\t\t=\txmldoc.getElementsByTagName(\"REQ_DATE\").item(0).text;\r\n\t\tform.PREDATE.value\t\t=\txmldoc.getElementsByTagName(\"PREDATE\").item(0).text;\r\n\t\tform.REQ_DEP.value\t\t=\txmldoc.getElementsByTagName(\"REQ_DEP\").item(0).text;\r\n\t\tform.MANAGE_DEP.value\t=\txmldoc.getElementsByTagName(\"MANAGE_DEP\").item(0).text;\r\n\t\tform.REQ_NM.value\t\t=\txmldoc.getElementsByTagName(\"REQ_NM\").item(0).text;\r\n\t\tform.MANAGER.value\t\t=\txmldoc.getElementsByTagName(\"MANAGER\").item(0).text;\r\n\t\tform.NOTES.value\t\t=\txmldoc.getElementsByTagName(\"NOTES\").item(0).text;\r\n\t\tform.AGENT_NM.value\t\t=\txmldoc.getElementsByTagName(\"AGENT_NM\").item(0).text;\r\n\t\tform.AGENT_TEL.value\t=\txmldoc.getElementsByTagName(\"AGENT_TEL\").item(0).text;\r\n\t\tform.NAME.value\t\t\t=\txmldoc.getElementsByTagName(\"NAME\").item(0).text;\r\n\r\n\t\t/* 2014.08.06 주민번호 * 적용 */\r\n\t\tvar ssn = xmldoc.getElementsByTagName(\"SSN\").item(0).text;\r\n\t\tvar ssnAsterisk = ssn.substring(7).replace(/./g, '*');\r\n\t\tform.SSN.value = ssn.substring(0, 7) + ssnAsterisk;\r\n\t\t\r\n\t\t//form.SSN.value\t\t\t=\txmldoc.getElementsByTagName(\"SSN\").item(0).text;\r\n\t\t\r\n\t\tform.POST.value\t\t\t=\txmldoc.getElementsByTagName(\"POST\").item(0).text;\r\n\t\tform.ADDR1.value\t\t=\txmldoc.getElementsByTagName(\"ADDR1\").item(0).text;\r\n\t\tform.ADDR2.value\t\t=\txmldoc.getElementsByTagName(\"ADDR2\").item(0).text;\r\n\t\tform.TEL.value\t\t\t=\txmldoc.getElementsByTagName(\"TEL\").item(0).text;\r\n\t\tform.HP.value\t\t\t=\txmldoc.getElementsByTagName(\"HP\").item(0).text;\r\n\t\tform.DORO_ADDR1.value\t=\txmldoc.getElementsByTagName(\"DORO_ADDR1\").item(0).text;\r\n\t\tform.DORO_ADDR2.value\t=\txmldoc.getElementsByTagName(\"DORO_ADDR2\").item(0).text;\r\n\t}\r\n\r\n\tfunction\tView(adminno, seq)\r\n\t{\t\r\n\t\tparams\t= \"ADMIN_NO=\" + adminno + \"&SEQ=\" + seq;\r\n\t\t\r\n\t\tsendRequest(\"/jumyong/jumyonginfo/minwon_view_search.do\", params, \"GET\", Result_InfoView);\r\n\r\n\t//\tdocument.getElementById(\"SEQ\").value\t= seq;\r\n\r\n\t//\tparent.BugwaView(seq);\r\n\t}\r\n\r\n\tfunction\tRegister()\r\n\t{\r\n\t\tvar form = document.form;\r\n\r\n\t\tform.action = \"/jumyong/jumyonginfo/minwon_register.do\";\r\n\t\tform.submit();\r\n\t}\r\n\t\r\n\tfunction\tModify()\r\n\t{\r\n\t\tvar form = document.form;\r\n\t\t\r\n\t\tif(form.REQ_DATE.value\t== \"\")\r\n\t\t{\r\n\t\t\talert(\"수정할 데이터를 선택하세요.\");\r\n\t\t\treturn;\r\n\t\t}\r\n\r\n\t\tform.action = \"/jumyong/jumyonginfo/minwon_modify.do\";\r\n\t\tform.submit();\r\n\t}\r\n\r\n\tfunction \tInit()\r\n\t{\r\n\t\tvar ADMIN_NO = document.getElementById(\"ADMIN_NO\").value;\r\n\t\tvar SEQ = document.getElementById(\"SEQ\").value;\r\n\t\t\r\n\t\tif(SEQ !=\"\") View(ADMIN_NO, SEQ);\r\n//\t\tView(\"200911680101-2-0019\",\"6\");\r\n\t\tparent.Tab_Img(\"minwon\");\r\n\t}\r\n\r\n//]]>\r\n</script>\r\n\r\n<body onload=\"Init()\">\r\n<table width=\"780\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n<form id=\"form\" name=\"form\" method=\"post\">\r\n<input type=\"hidden\" id=\"ADMIN_NO\" name=\"ADMIN_NO\" value=";
  private final static String _jspx_template11 = ">\r\n<input type=\"hidden\" id=\"SEQ\" name=\"SEQ\" value=\"";
  private final static String _jspx_template12 = "\">\r\n<input type=\"hidden\" id=\"SECTION\" name=\"SECTION\" value=\"";
  private final static String _jspx_template13 = "\">\r\n\r\n\t  <tr>\r\n\t\t<td align=\"left\" class=\"contborder_blue\">\r\n\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\r\n        <tr>\r\n          <td height=\"34\" class=\"sub_stan\">전체건수 : <span class=\"sub_stan_blue\">";
  private final static String _jspx_template14 = "</span> 건 </td>\r\n        </tr>\r\n\t\t<tr>\r\n\t\t\t<td><table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t<tr>\r\n\t\t        <td height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">번호</td>\r\n\t\t        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">접수번호</td>\r\n\t\t        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">접수자</td>\r\n\t\t        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">민원구분</td>\r\n\t\t        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">민원인</td>\r\n\t\t        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">접수일자</td>\r\n\t\t        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">처리일자</td>\r\n\t\t        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">담당자</td>\r\n\t\t\t</tr>\r\n      \r\n\t\t\t";
  private final static String _jspx_template15 = "\r\n\t\t\t\t";
  private final static String _jspx_template16 = "\r\n                      ";
  private final static String _jspx_template17 = "\r\n\t                     <tr onClick=\"javascript:View('";
  private final static String _jspx_template18 = "','";
  private final static String _jspx_template19 = "')\" onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\" style=\"CURSOR: Hand;\" >\r\n\t                     \t<td height=\"26\" align=\"center\">";
  private final static String _jspx_template20 = "</td>\r\n        \t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template21 = "</td>\r\n        \t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template22 = "</td>\r\n        \t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template23 = "</td>\r\n        \t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template24 = "</td>\r\n        \t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template25 = "</td>\r\n        \t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template26 = "</td>\r\n        \t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template27 = "</td>\r\n\t                     </tr>\r\n\t\t\t\t\t ";
  private final static String _jspx_template28 = "\r\n\t\t\t\t";
  private final static String _jspx_template29 = "\r\n\t\t\t\t";
  private final static String _jspx_template30 = "\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td align=\"center\" class=\"sub_table\" colspan=\"11\" height=\"26\">검색된 내용이 없습니다</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t";
  private final static String _jspx_template31 = "\r\n\t\t\t ";
  private final static String _jspx_template32 = "\r\n\t\t\t  \r\n\t\t\t</table></td>\r\n\t\t</tr>\r\n\t\t\r\n\t\t<tr>\r\n\t\t  <td height=\"30\" align=\"center\"><table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t<tr>\r\n\t\t\t\t";
  private final static String _jspx_template33 = "\r\n\t\t\t</tr>\r\n\t\t  </table></td>\r\n\t\t</tr>\r\n\r\n\t\t\t<tr>\r\n\t\t\t\t<td><table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t  \t<tr>\r\n\t\t\t\t\t<td width=\"100\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">접수번호</td>\r\n\t\t\t\t\t<td width=\"37%\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><input id=\"REQ_NO\" name=\"REQ_NO\" type=\"text\" class=\"view\" style=\"width:120px\" readonly></td>\r\n\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">민원구분</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input id=\"GUBUN\" name=\"GUBUN\" type=\"text\" class=\"view\" style=\"width:120px\" readonly></td>\r\n\t\t\t  \t</tr>\r\n\t\t\t\t\r\n\t\t\t  \t<tr>\r\n\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">접수일자</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t<td><input id=\"REQ_DATE\" name=\"REQ_DATE\" type=\"text\" class=\"view\" style=\"width:120px\" readonly></td>\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t\t</table></td>\r\n\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">처리예정일자</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t<td><input id=\"PREDATE\" name=\"PREDATE\" type=\"text\" class=\"view\" style=\"width:120px\" readonly></td>\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t\t</table></td>\r\n\t\t\t  \t</tr>\r\n\t\t\t  \r\n\t\t\t  \t<tr>\r\n\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">접수부서</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input id=\"REQ_DEP\" name=\"REQ_DEP\" type=\"text\" class=\"view\" style=\"width:250px\" readonly></td>\r\n\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">담당부서</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input id=\"MANAGE_DEP\" name=\"MANAGE_DEP\" type=\"text\" class=\"view\" style=\"width:120px\" readonly></td>\r\n\t\t\t  \t</tr>\r\n\t\t\t  \r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">접수자명</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input id=\"REQ_NM\" name=\"REQ_NM\" type=\"text\" class=\"view\" style=\"width:120px\" readonly></td>\r\n\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">담당자명</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input id=\"MANAGER\" name=\"MANAGER\" type=\"text\" class=\"view\" style=\"width:120px\" readonly></td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t  \r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">민원요지</td>\r\n\t\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t<input id=\"NOTES\" name=\"NOTES\" type=\"text\" class=\"view\" style=\"width:98%\" readonly>\r\n\t\t\t\t\t</table></td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">대리인</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input id=\"AGENT_NM\" name=\"AGENT_NM\" type=\"text\" class=\"view\" style=\"width:120px\" readonly></td>\r\n\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">대리인 연락처</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input id=\"AGENT_TEL\" name=\"AGENT_TEL\" type=\"text\" class=\"view\" style=\"width:120px\" readonly></td>\r\n\t\t\t\t</tr>\r\n\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">민원인명</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input id=\"NAME\" name=\"NAME\" type=\"text\" class=\"view\" style=\"width:120px\" readonly></td>\r\n\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">민원인 주민번호</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t<input id=\"SSN\" name=\"SSN\" type=\"text\" class=\"view\" style=\"width:120px\" readonly>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t  \t<!--  //********** BEGIN_현진_20120215 -->\r\n\t\t\t  \t<!-- \r\n\t\t\t  \t<tr>\r\n\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">민원인 우편번호</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t  \t<td><input id=\"POST\" name=\"POST\" type=\"text\" class=\"view\" style=\"width";
  private final static String _jspx_template34 = ":50px\" readonly></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">민원인 주소</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t<input id=\"ADDR1\" name=\"ADDR1\" type=\"text\" class=\"view\" style=\"width:250px\" readonly>\r\n\t\t\t\t\t\t<input id=\"ADDR2\" name=\"ADDR2\" type=\"text\" class=\"view\" style=\"width:250px\" value=\"\" readonly>\r\n\t\t\t\t\t</td>\r\n\t\t\t  \t</tr>\r\n\t\t\t  \t -->\r\n\t\t\t  \t<tr>\r\n\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">우편번호</td>\r\n\t\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t<input id=\"POST\" name=\"POST\" type=\"text\" class=\"view\" style=\"width:50px\" readonly>\r\n\t\t\t\t\t</table></td>\r\n\t\t\t\t</tr>\r\n\t\t\t  \t<tr>\r\n\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">기본 주소</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t<input id=\"ADDR1\" name=\"ADDR1\" type=\"text\" class=\"view\" style=\"width:250px\" readonly>\r\n\t\t\t\t\t\t<input id=\"ADDR2\" name=\"ADDR2\" type=\"text\" class=\"view\" style=\"width:250px\" value=\"\" readonly>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">도로명 주소</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t<input id=\"DORO_ADDR1\" name=\"DORO_ADDR1\" type=\"text\" class=\"view\" style=\"width:250px\" readonly>\r\n\t\t\t\t\t\t<input id=\"DORO_ADDR2\" name=\"DORO_ADDR2\" type=\"text\" class=\"view\" style=\"width:250px\" value=\"\" readonly>\r\n\t\t\t\t\t</td>\r\n\t\t\t  \t</tr>\t\t\t\t\r\n\t\t\t\t<!--   //********** END_현진_20120215 -->\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">민원인 전화</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input id=\"TEL\"  name=\"TEL\" type=\"text\" class=\"view\" style=\"width:120px\" readonly></td>\r\n\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">민원인 휴대폰</td>\r\n\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input id=\"HP\" name=\"HP\" type=\"text\" class=\"view\" style=\"width:120px\" readonly></td>\r\n\t\t\t  \t</tr>\r\n\t\t   \t    <tr>\r\n        \t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">비고</td>\r\n      \t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t       \t\t\t";
  private final static String _jspx_template35 = "\r\n      \t\t\t\t</td>\r\n        \t\t</tr> \r\n\t\t\t  </table></td>\r\n\t\t\t</tr>\r\n\r\n\t\t\t<tr>\r\n\t\t\t  <td height=\"40\" align=\"right\">\r\n\t\t\t  \t";
  private final static String _jspx_template36 = "\r\n\t\t\t  \t\t";
  private final static String _jspx_template37 = "\r\n\t\t\t\t\t";
  private final static String _jspx_template38 = "\r\n\t\t\t\t\t<a href=\"javascript:Modify()\"><img src=\"/img/mod_icon.gif\" alt=\"수정\" border=\"0\"></a>\r\n\t\t\t\t\t";
  private final static String _jspx_template39 = "\r\n\t\t\t\t\t";
  private final static String _jspx_template40 = "\r\n\t\t\t\t\t\t<a href=\"javascript:Register()\"><img src=\"/img/add_icon.gif\" alt=\"추가\" border=\"0\"></a>\r\n\t\t\t\t\t";
  private final static String _jspx_template41 = "\r\n\t\t\t\t \t";
  private final static String _jspx_template42 = "\t\t\t\t\r\n\t\t \t\t";
  private final static String _jspx_template43 = " \r\n\t\t\t  </td>\r\n\t\t\t</tr>\r\n\t\t\t\r\n\t\t</table></td>\r\n\t  </tr>\r\n\r\n</table>\r\n\r\n</body>\r\n</html>\r\n";
}
