package jeus_jspwork._jsp._jumyong._saewe._tab;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_jumji_5fview_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template13);
      // jsp code [from=(86,39);to=(86,49)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TYPE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(89,61);to=(89,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(90,59);to=(90,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(100,64);to=(100,72)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${use_type}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(102,64);to=(102,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${occupancy_type}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(106,52);to=(106,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${use_owner_Group}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(108,52);to=(108,68)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${taxation_section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(112,52);to=(112,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.MUL_POST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(114,52);to=(114,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(120,14);to=(120,27)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SIGUNGU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(121,14);to=(121,25)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bjdong_code}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // jsp code [from=(122,15);to=(122,26)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${hjdong_code}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);
      // jsp code [from=(123,14);to=(123,24)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mul_spc_cd}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template26);
      // jsp code [from=(124,14);to=(124,26)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BONBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      // jsp code [from=(124,29);to=(124,40)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BUBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // jsp code [from=(124,55);to=(124,65)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TONG}",java.lang.String.class , pageContext.getVariableResolver(), null));

      // jsp code [from=(124,68);to=(124,77)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BAN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template28);
      // jsp code [from=(131,10);to=(131,25)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ROAD_ADDR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template29);
      // jsp code [from=(131,34);to=(131,48)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ROAD_BON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_0_fn(pageContext, null)) return;


      out.write(_jspx_template31);
      // jsp code [from=(139,10);to=(139,27)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PARKING_NUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template32);
      // jsp code [from=(142,17);to=(142,31)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.RIVER_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template33);
      // jsp code [from=(145,8);to=(145,24)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.RIVER_RANK}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template34);
      // jsp code [from=(164,191);to=(164,201)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TYPE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template35);
      // jsp code [from=(164,216);to=(164,232)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PURPOSE_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template36);
      // ----  c:choose ---- invoke //
      if (_jspx_th_c_choose_0_fn(pageContext, null)) return;


      out.write(_jspx_template46);
      // jsp code [from=(192,14);to=(192,29)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.AREA_SIZE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template47);
      // jsp code [from=(200,14);to=(200,32)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PERCENT_RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template48);
      // jsp code [from=(206,14);to=(206,34)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PERCENT_REASON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template49);
      // jsp code [from=(215,14);to=(215,34)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.REDUCTION_RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template50);
      // jsp code [from=(221,14);to=(221,36)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.REDUCTION_REASON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template51);
      // jsp code [from=(228,92);to=(228,107)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.REFERENCE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template52);
      // jsp code [from=(240,64);to=(240,83)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.WORK_FROMDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template53);
      // jsp code [from=(244,64);to=(244,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.EXE_INFO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template54);

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
  private boolean _jspx_th_c_forEach_0_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:forEach ---- //
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = new org.apache.taglibs.standard.tag.rt.core.ForEachTag();
    _jspx_th_c_forEach_0.setPageContext(pageContext);
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${priceAddrList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("addr");
    _jspx_th_c_forEach_0.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template11);
            // jsp code [from=(61,18);to=(61,27)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${addr.ADDR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template12);

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

  private boolean _jspx_th_c_if_0_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:if ---- //
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = new org.apache.taglibs.standard.tag.rt.core.IfTag();
    _jspx_th_c_if_0.setPageContext(pageContext);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ROAD_BU != null}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template30);
          // jsp code [from=(131,90);to=(131,103)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ROAD_BU}",java.lang.String.class , pageContext.getVariableResolver(), null));


        } while (_jspx_th_c_if_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_0.release();
    }
    return false;
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
          out.write(_jspx_template37);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template41);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template45);

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
    _jspx_th_c_when_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SECTION == '1' || board.SECTION == '3'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
      if (_jspx_eval_c_when_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template38);
          // jsp code [from=(176,12);to=(176,30)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.MUL_FROMDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template39);
          // jsp code [from=(176,36);to=(176,52)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.MUL_TODATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template40);

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
          out.write(_jspx_template42);
          // jsp code [from=(182,26);to=(182,45)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PARTLY_PERIOD}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template43);
          // jsp code [from=(182,62);to=(182,80)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOTAL_PERIOD}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template44);

        } while (_jspx_th_c_otherwise_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_otherwise_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_otherwise_0.release();
    }
    return false;
  }

  private final static String _jspx_template0 = "\r\n";
  private final static String _jspx_template1 = "\r\n";
  private final static String _jspx_template2 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('사용자의 사용시간이 종료되었습니다. 다시 접속 해주시기 바랍니다.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template3 = "\r\n";
  private final static String _jspx_template4 = "\r\n";
  private final static String _jspx_template5 = "  \r\n";
  private final static String _jspx_template6 = "  \r\n";
  private final static String _jspx_template7 = "  \r\n";
  private final static String _jspx_template8 = "\r\n";
  private final static String _jspx_template9 = "\r\n";
  private final static String _jspx_template10 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n}\r\n-->\r\n\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script type=\"text/javascript\">\r\n//<![CDATA[\r\nfunction\tInit_UseType(sel)\r\n{\r\n\tdocument.getElementById(\"UseType1\").style.display = \"none\";\r\n\tdocument.getElementById(\"UseType2\").style.display = \"none\";\r\n\tdocument.getElementById(\"UseType3\").style.display \t= \"none\";\r\n\t\r\n\tif(sel.value == '2')\r\n\t{\r\n\t\tdocument.getElementById(\"UseTypeName\").innerHTML\t\t= \"하천명/등급\";\r\n\t\tdocument.getElementById(\"UseType2\").style.display \t= \"inline-block\";\t// 하천명\r\n\t\tdocument.getElementById(\"UseType3\").style.display \t= \"inline-block\"; // 하천등급\r\n\t\t\r\n\t}\r\n\telse if(sel.value == '3')\r\n\t{\r\n\t\tdocument.getElementById(\"UseTypeName\").innerHTML\t\t= \"하천명\";\r\n\t\tdocument.getElementById(\"UseType2\").style.display \t= \"inline-block\";\t// 하천명\r\n\t}\r\n\telse\r\n\t{\r\n\t\tdocument.getElementById(\"UseTypeName\").innerHTML\t\t= \"주차면수\";\r\n\t\tdocument.getElementById(\"UseType1\").style.display \t= \"inline-block\";\t//\t도로\r\n\t}\r\n}\r\n\r\nfunction \tInit()\r\n{\r\n\tparent.TabUp_Img(\"jumji\");\r\n\r\n\tIFRM_PurposeCode.PURPOSE_CD.className=\"view\";\r\n\r\n\tvar tabDown = parent.document.getElementById('tabDown');\r\n\ttabDown.contentWindow.location.href = tabDown.contentWindow.location.href;\r\n\t\r\n\t";
  private final static String _jspx_template11 = "\r\n\t\taddWithAddr('";
  private final static String _jspx_template12 = "');\r\n\t";
  private final static String _jspx_template13 = "\r\n\t\r\n}\r\n\r\nfunction addWithAddr(text){\r\n\t\r\n\tvar tbody = document.getElementById(\"WITH_ADDR_LIST\");\r\n\t  \r\n\tvar tr,td,Elem;\r\n\t\r\n\ttr = document.createElement('tr');\r\n\ttd = document.createElement('td');\r\n\ttd.setAttribute(\"height\", \"18px\");\r\n\t\r\n\ttxtElem = document.createTextNode(text);\r\n\ttd.appendChild(txtElem);\r\n\t\r\n\ttr.appendChild(td);\r\n\ttbody.appendChild(tr);\r\n}\r\n\r\n//]]>\r\n</script>\r\n\r\n<body onload=\"Init(); Init_UseType('";
  private final static String _jspx_template14 = "');\">\r\n\r\n<form id=\"form\" name=\"form\" method=\"post\">\r\n<input type=\"hidden\" id=\"ADMIN_NO\" name=\"ADMIN_NO\" value=\"";
  private final static String _jspx_template15 = "\">\r\n<input type=\"hidden\" id=\"SECTION\" name=\"SECTION\" value=\"";
  private final static String _jspx_template16 = "\">\r\n<table width=\"780\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\r\n\t<tr>\r\n\t\t<td align=\"left\" class=\"contborder_purple\">\r\n\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t  <tr>\r\n\t\t\t<td><table id=\"table1\" width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t\t<tr>\r\n\t\t\t\t  <td width=\"14%\" height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용종류</td>\r\n\t\t\t\t  <td width=\"36%\" bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template17 = "</td>\r\n\t\t\t\t  <td width=\"14%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용구분</td>\r\n\t\t\t\t  <td width=\"36%\" bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template18 = "</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t  <td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">소유자</td>\r\n\t\t\t\t  <td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template19 = "</td>\r\n\t\t\t\t  <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">세입구분</td>\r\n\t\t\t\t  <td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template20 = "</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t  <td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">우편번호</td>\r\n\t\t\t\t  <td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template21 = "</td>\r\n\t\t\t\t  <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">건물(명) 정보 </td>\r\n\t\t\t\t  <td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template22 = "</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t  <td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용지지번</td>\r\n\t\t\t\t  <td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t  <td>";
  private final static String _jspx_template23 = "&nbsp;</td>\r\n\t\t\t\t\t  <td>";
  private final static String _jspx_template24 = "&nbsp;</td>\r\n\t\t\t\t\t  <td>(";
  private final static String _jspx_template25 = ")&nbsp;&nbsp;</td>\r\n\t\t\t\t\t  <td>";
  private final static String _jspx_template26 = "&nbsp;</td>\r\n\t\t\t\t\t  <td>";
  private final static String _jspx_template27 = "&nbsp;&nbsp;";
  private final static String _jspx_template28 = " </td>\r\n\t\t\t\t\t  </tr>\r\n\t\t\t\t  </table></td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t  <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" height=\"25\">도로(하천)지번</td>\r\n\t\t\t\t  <td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t  \t";
  private final static String _jspx_template29 = "&nbsp;";
  private final static String _jspx_template30 = "-";
  private final static String _jspx_template31 = "\r\n\t\t\t\t  </td>\r\n\t\t\t\t  <td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">\r\n\t\t\t\t  <span id=\"UseTypeName\">\r\n\t\t          </span>\r\n\t\t\t\t  </td>\r\n\t\t\t\t  <td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t  <span id=\"UseType1\" style=\"display:none\">\r\n\t\t\t\t  \t";
  private final static String _jspx_template32 = "\r\n\t\t          </span>\r\n\t\t       \t  <span id=\"UseType2\" style=\"display:none\">\r\n\t\t       \t    ";
  private final static String _jspx_template33 = "\r\n\t\t          </span>\r\n\t\t          <span id=\"UseType3\" style=\"display:none;\">\r\n\t\t\t\t\t";
  private final static String _jspx_template34 = "\r\n\t\t\t\t  </span>\r\n\t\t\t\t  </td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t  <td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" colspan=\"1\">공시지가<br>적용지번<br>목록</td>\r\n\t\t\t\t\t  <td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t\t\t\t  <div style=\"height: 60px;overflow-y:scroll;\">\r\n\t\t\t\t\t\t\t  <table width=\"90%\">\r\n\t\t\t\t\t\t\t\t  <tbody id=\"WITH_ADDR_LIST\" >\r\n\t\t\t\t\t\t\t\t  </tbody>\r\n\t\t\t\t\t\t\t  </table>\r\n\t\t\t\t\t\t  </div>\r\n\t\t\t\t\t  </td>\t\t\t\t\t\t  \r\n\t\t\t\t</tr>\r\n\t\t\t\r\n\t\t\t\t<tr>\r\n\t\t\t\t  <td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용목적</td>\r\n\t\t\t\t  <td colspan=\"3\" bgcolor=\"F6F6F6\" class=\"\"><table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"\">\r\n\t\t\t\t\t<iframe id=\"IFRM_PurposeCode\" align=\"absmiddle\" scrolling=\"no\" frameborder=\"0\" framespacing=\"0\" width=\"100%\" height=\"22\" src=\"/jsp/common/purposeCode/purposeCode_view.jsp?SectionCode=";
  private final static String _jspx_template35 = "&PURPOSE_CD=";
  private final static String _jspx_template36 = "\"></iframe>\r\n\t\t\t\t  </table></td>\r\n\t\t\t    </tr>\r\n\t\t\t    \r\n\t\t\t\t<tr>\r\n\t\t\t\t  <td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용기간</td>\r\n\t\t\t\t  <td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t\t  \t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t  \t";
  private final static String _jspx_template37 = "\r\n\t\t\t\t\t    ";
  private final static String _jspx_template38 = "\r\n\t\t\t\t\t        <tr>\r\n\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template39 = " ~ ";
  private final static String _jspx_template40 = "\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t    ";
  private final static String _jspx_template41 = "\r\n\t\t\t\t\t    ";
  private final static String _jspx_template42 = "\r\n\t\t\t\t\t        <tr>\r\n\t\t\t\t\t\t\t\t<td>일시점용&nbsp; ";
  private final static String _jspx_template43 = "&nbsp;&nbsp;총 ";
  private final static String _jspx_template44 = "&nbsp;일</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t    ";
  private final static String _jspx_template45 = "\r\n\t\t\t\t\t";
  private final static String _jspx_template46 = "\r\n\t\t\t\t  </table></td>\r\n\t\t\t\t  \t\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n        \t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용면적</td>\r\n\t\t\t\t    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\">\r\n      \t\t\t\t\t";
  private final static String _jspx_template47 = "       \r\n\t\t\t\t    </td>\r\n        \t\t</tr>\r\n        \t\t<tr>\r\n        \t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">\r\n\t        \t\t\t지분율\r\n        \t\t\t</td>\r\n\t\t\t\t    <td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n      \t\t\t\t\t";
  private final static String _jspx_template48 = "% \r\n\t\t\t\t    </td>\r\n\t\t\t\t    <td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">\r\n\t\t\t\t\t\t지분율 사유\r\n\t\t\t\t    </td>\r\n\t\t\t\t    <td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n      \t\t\t\t\t";
  private final static String _jspx_template49 = "       \r\n\t\t\t\t    </td>\r\n        \t\t</tr>\r\n        \t\t\r\n        \t\t<tr>\r\n        \t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">\r\n\t        \t\t\t감면율\r\n        \t\t\t</td>\r\n\t\t\t\t    <td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n      \t\t\t\t\t";
  private final static String _jspx_template50 = "% \r\n\t\t\t\t    </td>\r\n\t\t\t\t    <td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">\r\n\t\t\t\t\t\t감면율 사유\r\n\t\t\t\t    </td>\r\n\t\t\t\t    <td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n      \t\t\t\t\t";
  private final static String _jspx_template51 = "       \r\n\t\t\t\t    </td>\r\n        \t\t</tr>\r\n        \t\t        \t\t\r\n\t\t\t\t<tr height=\"45px\">\r\n        \t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">비고</td>\r\n\t\t\t\t    <td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t<textarea type=\"text\" class=\"view\" style=\"width:99%;overflow-y: scroll ;\" readonly>";
  private final static String _jspx_template52 = "</textarea>\r\n\t\t\t\t    </td>\r\n        \t\t</tr>\r\n\t\t\t    <tr>\r\n\t\t\t\t  <td height=\"34\" colspan=\"4\" align=\"left\" bgcolor=\"#FFFFFF\" class=\"\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t  <td><span class=\"sub_stan_blue\">* 공사(굴착) 정보</span></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t  </table></td>\r\n\t\t\t    </tr>\r\n\t\t\t    <tr>\r\n\t\t\t\t  <td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">공사기간 </td>\r\n\t\t\t\t  <td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template53 = "</td>\r\n\t\t\t    </tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t  <td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">공사내용</td>\r\n\t\t\t\t  <td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template54 = "</td>\r\n\t\t\t    </tr>\r\n\t\t\t</table>\r\n\t\t\t</td>\r\n\t\t  </tr>\r\n\t\t</table></td>\r\n\t</tr>\r\n\r\n</table>\r\n</body>\r\n</html>";
}
