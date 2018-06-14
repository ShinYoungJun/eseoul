package jeus_jspwork._jsp._jumyong._gigan;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_search_5fjsp extends jeus.servlet.jsp.HttpJspBase {

  public final String[] __jeusGetIncludedJspFiles() {
    return new String[] {
      "/jsp/common/include.jsp",
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
      pageContext = _jspxFactory.getPageContext(this, request, response, "/jsp/common/error.jsp", true, 8192, true);
      session = pageContext.getSession();
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();

      response.setContentType("text/html;charset=MS949");

      out.write(_jspx_template0);
      out.write(_jspx_template1);
      out.write(_jspx_template2);
      out.write(_jspx_template3);
      out.write(_jspx_template4);
      out.write(_jspx_template5);
      out.write(_jspx_template6);
      out.write(_jspx_template7);
      // jsp code [from=(1,3);to=(6,1)]
      
      	String 		userId	= (String)session.getAttribute("sessionUserId");
      	
      	if(userId == null)
      	{

      out.write(_jspx_template8);
      // jsp code [from=(11,3);to=(13,1)]
      
      	}

      out.write(_jspx_template9);
      // jsp code [from=(123,21);to=(123,33)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${giganRegdate}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(135,60);to=(135,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(161,10);to=(161,17)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(188,18);to=(188,26)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${totalcnt}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(281,18);to=(281,26)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${totalcnt}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(377,67);to=(377,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(378,65);to=(378,75)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PURPOSE_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(380,58);to=(380,64)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${search}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(381,67);to=(381,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${search_flag}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(382,61);to=(382,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${totalcnt}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(383,67);to=(383,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${check_gigan}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(384,57);to=(384,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${userId}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(385,53);to=(385,57)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SIDO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(386,59);to=(386,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SIGUNGU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(420,10);to=(420,18)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${use_type}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // jsp code [from=(438,125);to=(438,131)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GIGAN1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);
      // jsp code [from=(439,102);to=(439,108)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GIGAN2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template26);
      // jsp code [from=(456,165);to=(456,172)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMINNO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // jsp code [from=(463,159);to=(463,163)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template28);
      // jsp code [from=(472,32);to=(472,43)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bjdong_code}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template29);
      // jsp code [from=(479,121);to=(479,127)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${BONBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template30);
      // jsp code [from=(480,101);to=(480,106)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${BUBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template31);
      // jsp code [from=(505,112);to=(505,123)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${AfterGigan1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template32);
      // jsp code [from=(506,114);to=(506,125)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${AfterGigan2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template33);
      // jsp code [from=(520,89);to=(520,97)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${totalcnt}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template34);
      // ----  c:choose ---- invoke //
      if (_jspx_th_c_choose_0_fn(pageContext, null)) return;


      out.write(_jspx_template67);
      // jsp code [from=(584,29);to=(584,36)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${pageing}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template68);

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
          out.write(_jspx_template35);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template64);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template66);

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
          out.write(_jspx_template36);
          // ----  c:forEach ---- invoke //
          if (_jspx_th_c_forEach_0_fn(pageContext, _jspx_th_c_when_0)) return true;


          out.write(_jspx_template63);

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
          out.write(_jspx_template65);

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
            out.write(_jspx_template37);
            // jsp code [from=(549,56);to=(549,70)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template38);
            // jsp code [from=(550,58);to=(550,66)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.RN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template39);
            // jsp code [from=(551,36);to=(551,54)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.CUT_ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template40);
            // jsp code [from=(552,36);to=(552,46)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TYPE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template41);
            // jsp code [from=(553,36);to=(553,54)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SECTION_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template42);
            // jsp code [from=(554,36);to=(554,46)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template43);
            // jsp code [from=(555,36);to=(555,46)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.POST}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template44);
            // jsp code [from=(556,36);to=(556,53)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.APPEAL_ADDR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template45);
            // jsp code [from=(557,36);to=(557,44)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SI}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template46);
            // jsp code [from=(557,48);to=(557,57)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template47);
            // jsp code [from=(557,61);to=(557,74)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.DORO_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template48);
            // jsp code [from=(557,78);to=(557,90)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_BON}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template49);
            // jsp code [from=(557,94);to=(557,105)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_BU}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template50);
            // jsp code [from=(557,109);to=(557,120)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template51);
            // jsp code [from=(557,124);to=(557,139)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_DET_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template52);
            // jsp code [from=(558,36);to=(558,48)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOPOST}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template53);
            // jsp code [from=(559,36);to=(559,51)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SONGDALGI}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template54);
            // jsp code [from=(560,36);to=(560,53)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_NM_JUMJI}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template55);
            // jsp code [from=(561,36);to=(561,51)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.AREA_SIZE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template56);
            // jsp code [from=(562,36);to=(562,45)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SSN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template57);
            // jsp code [from=(563,36);to=(563,51)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.JUMYONGJI}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template58);
            // jsp code [from=(564,36);to=(564,55)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PURPOSE_CLASS}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template59);
            // jsp code [from=(564,59);to=(564,77)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PURPOSE_SORT}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template60);
            // jsp code [from=(564,81);to=(564,99)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PURPOSE_KIND}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template61);
            // jsp code [from=(565,36);to=(565,47)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GIGAN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template62);

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
  private final static String _jspx_template1 = "\r\n";
  private final static String _jspx_template2 = "  \r\n";
  private final static String _jspx_template3 = "  \r\n";
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "\r\n";
  private final static String _jspx_template6 = "\r\n";
  private final static String _jspx_template7 = "\r\n";
  private final static String _jspx_template8 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('사용자의 사용시간이 종료되었습니다. 다시 접속 해주시기 바랍니다.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template9 = "\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script>\r\n<script language=\"javascript\" src=\"/js/Check_inputbox.js\"></script>\r\n<script language=\"javascript\" src=\"/js/common.js\"></script>\r\n<script language=\"javascript\" src=\"/jsp/RexServer/rexscript/rexpert.js\"></script>\r\n<script language=\"javascript\" src=\"/jsp/RexServer/rexscript/rexpert_properties.js\"></script>\r\n\r\n<script type=\"text/javascript\">\r\n//<![CDATA[\r\n\t\r\n\tfunction\tPage(page)\r\n\t{\r\n\t\tif(page\t==\t\"\")\r\n\t\t\treturn;\r\n\t\t\r\n\t\tvar form = document.form;\r\n\t\t\r\n\t\tform.action = \"search.do?currentPage=\" + page;\r\n\t\tform.submit();\r\n\t}\r\n\r\n\tfunction\tView(adminno)\r\n\t{\r\n\t\tvar form = document.form;\r\n\r\n\t\tform.action = \"view.do?ADMIN_NO=\" + adminno;\r\n\t\tform.submit();\r\n\t}\r\n\r\n\tfunction\tSearch()\r\n\t{\r\n\t\tvar form = document.form;\r\n\r\n\t\tif(document.getElementById(\"beforeGiganCheck\").checked){\r\n\t\t\tif(document.getElementById(\"giganRegdate\").value==\"\" || document.getElementById(\"giganRegdate\").value==null){\r\n\t\t\t\talert(\"기간 연장한 년도를 넣어주세요!\");\r\n\t\t\t\treturn;\r\n\t\t\t}\r\n\t\t\tif(document.getElementById(\"AfterGigan1\").value==\"\" || document.getElementById(\"AfterGigan1\").value==null){\r\n\t\t\t\talert(\"변경 연장기간을 넣어주세요!\");\r\n\t\t\t\treturn;\r\n\t\t\t}\r\n\t\t\tif(document.getElementById(\"AfterGigan2\").value==\"\" || document.getElementById(\"AfterGigan2\").value==null){\r\n\t\t\t\talert(\"변경 연장기간을 넣어주세요!\");\r\n\t\t\t\treturn;\r\n\t\t\t}\r\n\t\t\tif(document.getElementById(\"AfterGigan1\").value>document.getElementById(\"AfterGigan2\").value){\r\n\t\t\t\talert(\"변경 연장기간의 시작일자가 종료일자보다 늦게 설정할 수 없습니다.\");\r\n\t\t\t\treturn;\r\n\t\t\t}\r\n\t\t}\r\n\t\t\r\n\t\tvar purpose1 = IFRM_PurposeCode.document.getElementById(\"PURPOSE1\");\r\n\t\t\r\n\t\tform.currentPage.value\t= 1;\r\n\t\tform.PURPOSE_CD.value\t= IFRM_PurposeCode.document.getElementById(\"PURPOSE_CD\").value;\r\n\r\n\t\tif(purpose1[0].text.length!=0){\r\n\t\t\tif(purpose1[purpose1.selectedIndex].text == \"::선택::\"){\r\n\t\t\t\tform.PURPOSE_CD.value = \"\";\r\n\t\t\t}\r\n\t\t}else{\r\n\t\t\tform.PURPOSE_CD.value = \"\";\t\t\r\n\t\t}\r\n\t\t\t\r\n\t\t\t\r\n\t\tvar type = document.getElementById(\"TYPE\").value;\r\n\t\tif(type.length==0)\t\t//점용종류가 선택이 안되면 점용목적은 선택되지 않도록 purpose값을 지정 \r\n\t\t\tpurpose=\"\";\r\n\t\t\r\n\t\tform.action = \"search.do\";\r\n\t\tform.submit();\r\n\t}\r\n\t\r\n\tfunction\texcel_Search()\r\n\t{\r\n\t\tvar form = document.form;\r\n\r\n\t\tform.currentPage.value\t= 1;\r\n\t\tform.PURPOSE_CD.value\t= IFRM_PurposeCode.document.getElementById(\"PURPOSE_CD\").value;\r\n\r\n\t\tif(form.TYPE.value==\"\")\r\n\t\t\tform.PURPOSE_CD.value = \"\";\r\n\r\n\t\tform.action = \"excel_search.do\";\r\n\t\tform.submit();\r\n\r\n\t\t\r\n\t}\r\n\r\n\tfunction\tSelect_UseType(sel)\r\n\t{\r\n\t\tdocument.getElementById(\"IFRM_PurposeCode\").src=\"/jsp/common/purposeCode/purposeCode2.jsp?SectionCode=\"+sel.value+\"&PURPOSE_CD=&search_flag=1\";\r\n\t}\r\n\r\n\tfunction\tInit()\r\n\t{\r\n\t\tif(document.form.PURPOSE_CD.value.length<1){\r\n\t\t\tdocument.getElementById(\"IFRM_PurposeCode\").src=\"/jsp/common/purposeCode/purposeCode2.jsp?SectionCode=\"+document.getElementById(\"TYPE\").value+\"&PURPOSE_CD=000\"+\"&search_flag=1\";\r\n\t\t}else{\r\n\t\t\tdocument.getElementById(\"IFRM_PurposeCode\").src=\"/jsp/common/purposeCode/purposeCode2.jsp?SectionCode=\"+document.getElementById(\"TYPE\").value+\"&PURPOSE_CD=\"+document.form.PURPOSE_CD.value;\t\r\n\t\t}\r\n\r\n\t\tvar getDate_ = \"";
  private final static String _jspx_template10 = "\";\r\n\t\tvar getDate = new Date();\t\t\r\n\t\tif(getDate_.length==0){\r\n\t\t\tdocument.getElementById(\"giganRegdate\").value = getDate.getFullYear();\r\n\t\t}else{\r\n\t\t\tdocument.getElementById(\"giganRegdate\").value = getDate_;\t\t\r\n\t\t}\r\n\t\tif(document.getElementById(\"check_gigan\").value==\"1\"){\r\n\t\t\tdocument.getElementById(\"beforeGiganCheck\").checked = true;\r\n\t\t\tcheckGigan();\r\n\t\t}\r\n\r\n\t\tsetSelectedOption(document.getElementById(\"SECTION\"), \"";
  private final static String _jspx_template11 = "\");\r\n\t}\r\n\t\r\n\tfunction checkKeySearch()\r\n\t{\r\n\t\tif(event.keyCode == 13) Search();\r\n\t}\r\n\t\r\n\t//일괄 출력 조회\r\n\tfunction\tView_Ilwal()\r\n\t{\r\n\t\tvar form = document.form;\r\n\t\t\r\n\t\tif(form.TOTALCNT.value <= 0)\r\n\t\t{\r\n\t\t\talert(\"일괄처리할 데이터가 없습니다\");\r\n\t\t\treturn;\r\n\t\t}\r\n\t\t\r\n\t\tform.action = \"view_ilgwal.do\";\r\n\t\tform.submit();\r\n\t}\r\n\r\n\tfunction checkGigan(){\r\n\t\tif(document.getElementById(\"beforeGiganCheck\").checked){\r\n\r\n\t\t\tif(\"";
  private final static String _jspx_template12 = "\" == 1){\r\n\t\t\t\tdocument.getElementById(\"beforeGigan\").style.display=\"block\";\r\n\t\t\t\tdocument.getElementById(\"complateGigan\").style.display=\"none\";\r\n\t\t\t\tdocument.getElementById(\"check_gigan\").value=\"1\";\t\r\n\t\t\t\tdocument.getElementById(\"Ilwal_span1\").style.display=\"none\";\r\n\t\t\t\tdocument.getElementById(\"Ilwal_span2\").style.display=\"block\";\r\n\t\t\t\tdocument.getElementById(\"Ilwal_span3\").style.display=\"none\";\r\n\t\t\t}else{\r\n\t\t\t\tdocument.getElementById(\"beforeGigan\").style.display=\"block\";\r\n\t\t\t\tdocument.getElementById(\"complateGigan\").style.display=\"none\";\r\n\t\t\t\tdocument.getElementById(\"check_gigan\").value=\"1\";\t\r\n\t\t\t\tdocument.getElementById(\"Ilwal_span1\").style.display=\"none\";\r\n\t\t\t\tdocument.getElementById(\"Ilwal_span2\").style.display=\"none\";\r\n\t\t\t\tdocument.getElementById(\"Ilwal_span3\").style.display=\"block\";\r\n\t\t\t}\r\n\t\t\t\t\r\n\t\t}else{\r\n\t\t\tdocument.getElementById(\"beforeGigan\").style.display=\"none\";\r\n\t\t\tdocument.getElementById(\"complateGigan\").style.display=\"block\";\r\n\t\t\tdocument.getElementById(\"check_gigan\").value=\"0\";\r\n\t\t\tdocument.getElementById(\"Ilwal_span1\").style.display=\"block\";\r\n\t\t\tdocument.getElementById(\"Ilwal_span2\").style.display=\"none\";\r\n\t\t\tdocument.getElementById(\"Ilwal_span3\").style.display=\"none\";\t\r\n\t\t}\r\n\t}\r\n\t\r\n\tfunction Ilgwal_license(){\r\n\t\tvar count = \"";
  private final static String _jspx_template13 = "\";\r\n\t\tif(count==0){\r\n\t\t\talert(\"선택된 자료가 없습니다.\");\r\n\t\t\treturn;\r\n\t\t}\r\n\t\r\n\t\tvar oRptMainParam;\r\n\t\toRptMainParam = rex_GetgoDictionay(); \r\n\r\n\t\t// 옵션 - viewer\t\r\n\t\toRptMainParam.put(\"rex_open_window\", \"center=yes,scrollbars=no,status=no,toolbar=no,resizable=1,location=no,menu=no,width=1000,height=1000\");\r\n\t\t\r\n\t\t// 필수 - 레포트명\r\n\t\toRptMainParam.put(\"rex_rptname\", \"license_gigan2\");\r\n\r\n\t\t// 필수 - 데이터 타입 설정\r\n\t\toRptMainParam.put(\"rex_datatype\", \"XML\");  // XML, CSV\r\n\r\n\t\t// 옵션 - 다른 DB를 연결시\r\n\t\toRptMainParam.put(\"rex_userservice\", \"oracle_jndi\");\r\n\r\n\t\t// 옵션 - 파라메터 설정\r\n\t\tvar form \t= document.form;\r\n\t\t\r\n\t\tvar purpose = form.PURPOSE_CD.value;\r\n\t\tvar str1 = \"\";\r\n    \tvar str2 = \"\";\r\n    \tvar str3 = \"\";\r\n    \tif(purpose.length>1){\r\n\t    \tstr1 = purpose.substring(0,1);\r\n\t    \tstr2 = purpose.substring(1,2);\r\n\t    \tstr3 = purpose.substring(2,3);\r\n    \t}\r\n\r\n    \tif(purpose == \"\"\t||\tpurpose == null || purpose.length == 0){\r\n    \t\tpurpose = \"%\";    \t\t\r\n    \t}else if(str3==\"0\"){\r\n    \t\tif(str2==\"0\"){\r\n    \t\t\tpurpose = str1+\"%\";\r\n    \t\t}else{\r\n    \t\t\tpurpose = str1+str2+\"%\";\r\n    \t\t}\r\n    \t}\r\n    \t\r\n\t\tif(form.TYPE.value==\"\" || form.TYPE.value==null)\r\n\t\t\toRptMainParam.put(\"TYPE\" ,\"%\");\r\n\t\telse\r\n\t\t\toRptMainParam.put(\"TYPE\" ,form.TYPE.value);\r\n\t\t\r\n\t\toRptMainParam.put(\"PURPOSE_CD\" ,purpose);\r\n\t\t\r\n\t\tif(form.ADMINNO.value==\"\" || form.ADMINNO.value==null)\r\n\t\t\toRptMainParam.put(\"ADMIN_NO\" ,\"%\");\r\n\t\telse\r\n\t\t\toRptMainParam.put(\"ADMIN_NO\" ,\"%\"+form.ADMINNO.value+\"%\");\r\n\t\t\t\r\n\t\tif(form.NAME.value==\"\" || form.NAME.value==null)\r\n\t\t\toRptMainParam.put(\"NAME\" ,\"%\");\r\n\t\telse\r\n\t\t\toRptMainParam.put(\"NAME\" ,\"%\"+form.NAME.value+\"%\");\r\n\t\t\t\r\n\t\tif(form.BJ_CD.value==\"\" || form.BJ_CD.value==null)\r\n\t\t\toRptMainParam.put(\"BJ_CD\" ,\"%\");\r\n\t\telse\r\n\t\t\toRptMainParam.put(\"BJ_CD\" ,form.BJ_CD.value);\r\n\t\t\t\r\n\t\tif(form.BONBUN.value==\"\" || form.BONBUN.value==null)\r\n\t\t\toRptMainParam.put(\"BONBUN\" ,\"%\");\r\n\t\telse\r\n\t\t\toRptMainParam.put(\"BONBUN\" ,\"%\"+form.BONBUN.value+\"%\");\r\n\t\t\t\r\n\t\tif(form.BUBUN.value==\"\" || form.BUBUN.value==null)\r\n\t\t\toRptMainParam.put(\"BUBUN\" ,\"%\");\r\n\t\telse\r\n\t\t\toRptMainParam.put(\"BUBUN\" ,\"%\"+form.BUBUN.value+\"%\");\r\n\t\t\t\r\n\t\toRptMainParam.put(\"REGDATE\" ,form.giganRegdate.value+\"%\");\r\n\t\toRptMainParam.put(\"AFTER_FROMDATE\" ,nr_Date_Cut(form.AfterGigan1.value));\r\n\t\toRptMainParam.put(\"AFTER_TODATE\" ,nr_Date_Cut(form.AfterGigan2.value));\r\n\t\toRptMainParam.put(\"SIDO\" ,form.SIDO.value);\r\n\t\toRptMainParam.put(\"SIGUNGU\" ,form.SIGUNGU.value);\r\n\t\toRptMainParam.put(\"USER_ID\" ,form.userId.value);\r\n\r\n\r\n\r\n\r\n\t\t// preview 팝업 열기\r\n\t\trex_gfRexRptOpen(\"popup\", oRptMainParam);\r\n\r\n\t\t//return oRptMainParam;\t\r\n\t}\r\n\r\n\tfunction Ilgwal_license2(){\r\n\t\tvar count = \"";
  private final static String _jspx_template14 = "\";\r\n\t\tif(count==0){\r\n\t\t\talert(\"선택된 자료가 없습니다.\");\r\n\t\t\treturn;\r\n\t\t}\r\n\t\r\n\t\tvar oRptMainParam;\r\n\t\toRptMainParam = rex_GetgoDictionay(); \r\n\r\n\t\t// 옵션 - viewer\t\r\n\t\toRptMainParam.put(\"rex_open_window\", \"center=yes,scrollbars=no,status=no,toolbar=no,resizable=1,location=no,menu=no,width=1000,height=1000\");\r\n\t\t\r\n\t\t// 필수 - 레포트명\r\n\t\toRptMainParam.put(\"rex_rptname\", \"license_gigan2_doro_151008\");\r\n\r\n\t\t// 필수 - 데이터 타입 설정\r\n\t\toRptMainParam.put(\"rex_datatype\", \"XML\");  // XML, CSV\r\n\r\n\t\t// 옵션 - 다른 DB를 연결시\r\n\t\toRptMainParam.put(\"rex_userservice\", \"oracle_jndi\");\r\n\r\n\t\t// 옵션 - 파라메터 설정\r\n\t\tvar form \t= document.form;\r\n\t\t\r\n\t\tvar purpose = form.PURPOSE_CD.value;\r\n\t\tvar str1 = \"\";\r\n    \tvar str2 = \"\";\r\n    \tvar str3 = \"\";\r\n    \tif(purpose.length>1){\r\n\t    \tstr1 = purpose.substring(0,1);\r\n\t    \tstr2 = purpose.substring(1,2);\r\n\t    \tstr3 = purpose.substring(2,3);\r\n    \t}\r\n\r\n    \tif(purpose == \"\"\t||\tpurpose == null || purpose.length == 0){\r\n    \t\tpurpose = \"%\";    \t\t\r\n    \t}else if(str3==\"0\"){\r\n    \t\tif(str2==\"0\"){\r\n    \t\t\tpurpose = str1+\"%\";\r\n    \t\t}else{\r\n    \t\t\tpurpose = str1+str2+\"%\";\r\n    \t\t}\r\n    \t}\r\n    \t\r\n\t\tif(form.TYPE.value==\"\" || form.TYPE.value==null)\r\n\t\t\toRptMainParam.put(\"TYPE\" ,\"%\");\r\n\t\telse\r\n\t\t\toRptMainParam.put(\"TYPE\" ,form.TYPE.value);\r\n\t\t\r\n\t\toRptMainParam.put(\"PURPOSE_CD\" ,purpose);\r\n\t\t\r\n\t\tif(form.ADMINNO.value==\"\" || form.ADMINNO.value==null)\r\n\t\t\toRptMainParam.put(\"ADMIN_NO\" ,\"%\");\r\n\t\telse\r\n\t\t\toRptMainParam.put(\"ADMIN_NO\" ,\"%\"+form.ADMINNO.value+\"%\");\r\n\t\t\t\r\n\t\tif(form.NAME.value==\"\" || form.NAME.value==null)\r\n\t\t\toRptMainParam.put(\"NAME\" ,\"%\");\r\n\t\telse\r\n\t\t\toRptMainParam.put(\"NAME\" ,\"%\"+form.NAME.value+\"%\");\r\n\t\t\t\r\n\t\tif(form.BJ_CD.value==\"\" || form.BJ_CD.value==null)\r\n\t\t\toRptMainParam.put(\"BJ_CD\" ,\"%\");\r\n\t\telse\r\n\t\t\toRptMainParam.put(\"BJ_CD\" ,form.BJ_CD.value);\r\n\t\t\t\r\n\t\tif(form.BONBUN.value==\"\" || form.BONBUN.value==null)\r\n\t\t\toRptMainParam.put(\"BONBUN\" ,\"%\");\r\n\t\telse\r\n\t\t\toRptMainParam.put(\"BONBUN\" ,\"%\"+form.BONBUN.value+\"%\");\r\n\t\t\t\r\n\t\tif(form.BUBUN.value==\"\" || form.BUBUN.value==null)\r\n\t\t\toRptMainParam.put(\"BUBUN\" ,\"%\");\r\n\t\telse\r\n\t\t\toRptMainParam.put(\"BUBUN\" ,\"%\"+form.BUBUN.value+\"%\");\r\n\t\t\t\r\n\t\toRptMainParam.put(\"REGDATE\" ,form.giganRegdate.value+\"%\");\r\n\t\toRptMainParam.put(\"AFTER_FROMDATE\" ,nr_Date_Cut(form.AfterGigan1.value));\r\n\t\toRptMainParam.put(\"AFTER_TODATE\" ,nr_Date_Cut(form.AfterGigan2.value));\r\n\t\toRptMainParam.put(\"SIDO\" ,form.SIDO.value);\r\n\t\toRptMainParam.put(\"SIGUNGU\" ,form.SIGUNGU.value);\r\n\t\toRptMainParam.put(\"USER_ID\" ,form.userId.value);\r\n\r\n\r\n\r\n\r\n\t\t// preview 팝업 열기\r\n\t\trex_gfRexRptOpen(\"popup\", oRptMainParam);\r\n\r\n\t\t//return oRptMainParam;\t\r\n\t}\r\n//]]>\r\n</script>\r\n\r\n<body onload=\"javascript:Init();\">\r\n<form id=\"form\" name=\"form\" method=\"post\" action=\"search.jsp\">\r\n<input type=\"hidden\" id=\"currentPage\" name=\"currentPage\" value=\"";
  private final static String _jspx_template15 = "\">\r\n<input type=\"hidden\" id=\"PURPOSE_CD\" name=\"PURPOSE_CD\" value=\"";
  private final static String _jspx_template16 = "\">\r\n<input type=\"hidden\" id=\"excel\" name=\"excel\" value=\"\">\r\n<input id=\"search\" name=\"search\"  type=\"hidden\" value=\"";
  private final static String _jspx_template17 = "\">\r\n<input id=\"search_flag\" name=\"search_flag\" type=\"hidden\" value=\"";
  private final static String _jspx_template18 = "\">\r\n<input type=\"hidden\" id=\"TOTALCNT\" name=\"TOTALCNT\" value=\"";
  private final static String _jspx_template19 = "\">\r\n<input type=\"hidden\" id=\"check_gigan\" name=\"check_gigan\" value=\"";
  private final static String _jspx_template20 = "\">\r\n<input type=\"hidden\" id=\"userId\" name=\"userId\" value=\"";
  private final static String _jspx_template21 = "\">\r\n<input type=\"hidden\" id=\"SIDO\" name=\"SIDO\" value=\"";
  private final static String _jspx_template22 = "\">\r\n<input type=\"hidden\" id=\"SIGUNGU\" name=\"SIGUNGU\" value=\"";
  private final static String _jspx_template23 = "\">\r\n\r\n<table width=\"800\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n  <tr>\r\n    <td height=\"43\"><img src=\"/img/jumyong_gigan_title.gif\" width=\"800\" height=\"43\"></td>\r\n  </tr>\r\n  <tr>\r\n    <td align=\"center\"><table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n      <tr>\r\n        <td height=\"1\" bgcolor=\"eaeaea\"></td>\r\n      </tr>\r\n      <tr>\r\n        <td height=\"14\"></td>\r\n      </tr>\r\n      \r\n      <tr>\r\n        <td align=\"left\"><table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n          <tr>\r\n            <td height=\"22\" background=\"/img/tab_line_blue.gif\"><table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                <tr>\r\n                  <td><img src=\"/img/sub_periodi_title3.gif\" width=\"110\" height=\"22\"></td>\r\n                </tr>\r\n            </table></td>\r\n          </tr>\r\n          \r\n          <tr>\r\n            <td class=\"contborder_purple\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                <tr>\r\n                  <td><table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n          \r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t  <td width=\"15%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용종류</td>\r\n\t\t\t\t\t  <td width=\"35%\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t  <select id=\"TYPE\" name=\"TYPE\" class=\"input_form1\" style=\"width:100px\" OnChange=\"Select_UseType(this);\">\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template24 = "\r\n\t\t\t\t\t\t  </select>\r\n\t\t\t\t\t  </td>\r\n\t\t\t\t\t  <td width=\"15%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용구분</td>\r\n\t\t\t\t\t  <td width=\"35%\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t  <select id=\"SECTION\" name=\"SECTION\" class=\"input_form1\" style=\"width:100px\">\r\n\t\t\t\t\t\t  \t<option value=\"\">::전체::</option>\r\n                            <option value=\"1\">계속</option>\r\n                            <option value=\"3\">무단</option>\t\t\t\r\n                          </select>\r\n\t\t\t\t\t  </td>\r\n\t\t\t\t\t  \r\n\t\t\t\t\t</tr>  \r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t  \r\n\t\t\t\t\t  <td width=\"15%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용만료일자</td>\r\n\t\t\t\t\t  <td width=\"35%\" colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t  <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\"><tr><td>\r\n\t\t\t\t\t\t<span id=\"complateGigan\"><input id=\"GIGAN1\" name=\"GIGAN1\" type=\"text\" class=\"input_form1\" style=\"width:70px\" value=\"";
  private final static String _jspx_template25 = "\"><a><img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" align=\"absmiddle\" onclick=\"popUpCalendar(this, document.getElementById('GIGAN1'), 'yyyymmdd')\" style=\"CURSOR: Hand;\"></a>\r\n\t\t\t\t\t\t~ <input id=\"GIGAN2\" name=\"GIGAN2\" type=\"text\" class=\"input_form1\" style=\"width:70px\" value=\"";
  private final static String _jspx_template26 = "\"><a><img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" align=\"absmiddle\" onclick=\"popUpCalendar(this, document.getElementById('GIGAN2'), 'yyyymmdd')\" style=\"CURSOR: Hand;\"></a></span>\r\n\t\t\t\t\t  </td></tr></table></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t  <td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용목적</td>\r\n\t\t\t\t\t  <td colspan=\"7\" bgcolor=\"\" class=\"\">\r\n\t\t\t\t\t  <table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"\">\r\n\t\t\t\t\t\t<iframe id=\"IFRM_PurposeCode\" align=\"absmiddle\" scrolling=\"no\" frameborder=\"0\" framespacing=\"0\" width=\"100%\" height=\"25\"></iframe>\r\n\t\t\t\t\t  </table>\r\n\t\t\t\t\t  </td>\r\n\t\t\t\t    </tr>\r\n                    \r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t  <td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">관리번호</td>\r\n\t                  <td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t                    <tr>\r\n\t                      <td><input id=\"ADMINNO\" name=\"ADMINNO\" type=\"text\" class=\"input_form1\" style=\"width:100px\" onKeyDown=\"javascript:checkKeySearch();\" value=\"";
  private final static String _jspx_template27 = "\"></td>\r\n\t                    </tr>\r\n\t                  </table></td>  \r\n\t\t\t\t\t  \r\n\t                  <td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용인/법인명</td>\r\n\t                  <td colspan=\"3\"bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t                    <tr>\r\n\t                      <td><input id=\"NAME\" name=\"NAME\" type=\"text\" class=\"input_form1\" style=\"width:100px\" onKeyDown=\"javascript:checkKeySearch();\" value=\"";
  private final static String _jspx_template28 = "\"></td>\r\n\t                    </tr>\r\n\t                  </table></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t\r\n\t\t\t        <tr>\r\n\t                  <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">법정동</td>\r\n\t                  <td bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t                  \t<tr><td><select id=\"BJ_CD\" name=\"BJ_CD\" class=\"input_form1\" style=\"width:100px\">\r\n\t                            ";
  private final static String _jspx_template29 = "\r\n\t                        </select></td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table></td>\r\n\t                  <td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">번지</td>\r\n\t                  <td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t                    <tr>\r\n\t                      <td><input id=\"BONBUN\" name=\"BONBUN\" type=\"text\" class=\"input_form1\" style=\"width:40px\" value=\"";
  private final static String _jspx_template30 = "\"> -\r\n\t\t\t\t\t\t\t  <input id=\"BUBUN\" name=\"BUBUN\" type=\"text\" class=\"input_form1\" style=\"width:40px\" value=\"";
  private final static String _jspx_template31 = "\"> \r\n\t\t\t\t\t\t  </td>\r\n\t                    </tr>\r\n\t                  </table></td>\r\n\t                </tr>\r\n\t                <tr>\r\n\t                \t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"6\" height=\"26\">\r\n\t                \t\t<input type=\"checkbox\" id=\"beforeGiganCheck\" name=\"beforeGiganCheck\" onclick=\"checkGigan();\">(일괄)기간연장 된 자료 조회\r\n\t                \t</td>\r\n\t                </tr>\t             \r\n\t\t\t\t\t\r\n                  </table></td>\r\n                </tr>\r\n                <tr>\r\n                \t<td><span id=\"beforeGigan\" style=\"display:none;\">\r\n                \t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t  <td width=\"15%\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\" height=\"40\">기간 연장한<br>년도</td>\r\n\t\t\t\t\t\t\t  <td width=\"35%\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t  \t<input id=\"giganRegdate\" name=\"giganRegdate\" type=\"text\" class=\"input_form1\" style=\"width:70px\" value=\"\">년도\t\t\t\t\t\t\t  \t\r\n\t\t\t\t\t\t\t  </td>\r\n\t\t\t\t\t\t\t  \r\n\t\t\t\t\t\t\t  <td width=\"15%\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">변경 연장기간</td>\r\n\t\t\t\t\t\t\t  <td width=\"35%\" colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t  <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t<input id=\"AfterGigan1\" name=\"AfterGigan1\" type=\"text\" class=\"input_form1\" style=\"width:70px\" value=\"";
  private final static String _jspx_template32 = "\"><a><img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" align=\"absmiddle\" onclick=\"popUpCalendar(this, document.getElementById('AfterGigan1'), 'yyyymmdd')\" style=\"CURSOR: Hand;\"></a>\r\n\t\t\t\t\t\t\t\t~ <input id=\"AfterGigan2\" name=\"AfterGigan2\" type=\"text\" class=\"input_form1\" style=\"width:70px\" value=\"";
  private final static String _jspx_template33 = "\"><a><img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" align=\"absmiddle\" onclick=\"popUpCalendar(this, document.getElementById('AfterGigan2'), 'yyyymmdd')\" style=\"CURSOR: Hand;\"></a>\r\n\t\t\t\t\t\t\t  </table></td>\r\n\t\t\t\t\t\t\t</tr>\r\n                \t\t</table></span>\r\n                \t</td>\r\n                </tr>\r\n                <tr>\r\n                  <td height=\"32\" align=\"right\"><a href=\"javascript:Search()\"><img src=\"/img/inquiry_icon2.gif\" alt=\"조회\" width=\"56\" height=\"18\" border=\"0\"></a></td>\r\n                </tr>\r\n\r\n                <tr>\r\n                  <td height=\"1\" bgcolor=\"#EAEAEA\"></td>\r\n                </tr>\r\n                <tr>\r\n                  <td height=\"34\" class=\"sub_stan\">전체건수 : <span class=\"sub_stan_blue\">";
  private final static String _jspx_template34 = "</span> 건 </td>\r\n                </tr>\r\n                <tr>        \r\n                  <td>\r\n                \t<div style=\" width:780;  padding:10px;overflow-x:scroll; scrollbar-face-color:#EEF8FB;  scrollbar-3dlight-color:#BBBDB6; \r\n\t\t\t\t\tscrollbar-highlight-color:#EEF8FB;scrollbar-shadow-color:#BBBDB6; scrollbar-darkshadow-color:#EEF8FB;  scrollbar-track-color:#EEF8FB; scrollbar-arrow-color:#BBBDB6; \"--> \r\n                 <table width=\"1300\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n                    <tr>\r\n                        <td align=\"center\" height=\"28\"bgcolor=\"e5eff8\" class=\"sub_table_b\">번호</td>\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">관리번호</td>\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용<br/>종류</td>\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용<br/>구분</td>\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용인</td>\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">우편<br/>번호</td>\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용인 주소</td>\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용인 새주소</td>\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">우편물 송달지<br/>우편번호</td>\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">우편물 송달지 도로명주소</td>\r\n     \t\t\t\t\t\t\t\t\t  <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">건물(명) 정보</td>\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">면적<br/>(㎡)</td>\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">주민번호</td>\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용지</td>\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용목적</td>\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용기간</td>         \r\n                      </tr>\r\n                      \r\n\t\t\t\t\t";
  private final static String _jspx_template35 = "\r\n\t\t\t\t\t\t";
  private final static String _jspx_template36 = "\r\n\t                      ";
  private final static String _jspx_template37 = "\r\n\t\t                     <tr onClick=\"javascript:View('";
  private final static String _jspx_template38 = "')\" onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\" style=\"CURSOR: Hand;\" >\r\n\t\t                     \t<td height=\"26\" align=\"center\">";
  private final static String _jspx_template39 = "</td>\r\n\t        \t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template40 = "</td>\r\n\t        \t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template41 = "</td>\r\n\t        \t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template42 = "</td>\r\n\t        \t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template43 = "</td>\r\n\t        \t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template44 = "</td>\r\n\t        \t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template45 = "</td>\r\n\t        \t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template46 = " ";
  private final static String _jspx_template47 = " ";
  private final static String _jspx_template48 = " ";
  private final static String _jspx_template49 = " ";
  private final static String _jspx_template50 = " ";
  private final static String _jspx_template51 = " ";
  private final static String _jspx_template52 = "</td>\r\n\t        \t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template53 = "</td>\r\n\t        \t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template54 = "</td>\r\n\t        \t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template55 = "</td>\r\n\t        \t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template56 = "</td>\r\n\t        \t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template57 = "</td>\r\n\t        \t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template58 = "</td>\r\n\t        \t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template59 = " ";
  private final static String _jspx_template60 = " ";
  private final static String _jspx_template61 = "</td>\r\n\t        \t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template62 = "</td>\r\n\t\t                     </tr>\r\n\t\t\t\t\t\t";
  private final static String _jspx_template63 = "\r\n\t\t\t\t\t\t";
  private final static String _jspx_template64 = "\r\n\t\t\t\t\t\t";
  private final static String _jspx_template65 = "\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td align=\"center\" class=\"sub_table\" colspan=\"11\" height=\"85\">검색된 내용이 없습니다</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t";
  private final static String _jspx_template66 = "\r\n\t\t\t\t\t ";
  private final static String _jspx_template67 = "\r\n\t\t\t\t\t </table>\r\n\t\t\t\t\t </div>\r\n\t\t\t\t\t</td>\r\n                </tr>\r\n\r\n                <tr>\r\n                  <td height=\"30\" align=\"center\">\r\n                  <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                      <tr>\r\n                      <td>";
  private final static String _jspx_template68 = "</td>\r\n\t\t\t\t\t\t\r\n                      </tr>\r\n                  </table>\r\n                  </td>\r\n                </tr>\r\n\r\n            </table></td>\r\n          </tr>\r\n          <tr>\r\n            <td height=\"40\" align=\"right\">\r\n            \t<span id=\"Ilwal_span1\" style=\"display:block;\">\r\n            \t\t<a href=\"javascript:View_Ilwal()\"><img src=\"../../../img/levy_icon4.gif\" alt=\"일괄 처리\" border=\"0\"></a>\r\n            \t\t<a href=\"javascript:alert('일괄 기간 연장 된 자료조회를 체크 하세요. ');\"><img src=\"/img/jumyongjugaOFF.gif\" alt=\"일괄점용허가증\" border=\"0\"></a>            \t\t\r\n            \t\t<img src=\"../../../img/excel_icon.gif\" alt=\"EXCEL 변환\" border=\"0\" onclick=\"javascript:excel_Search();\" style=\"cursor:hand\"> \r\n            \t</span>\r\n            \t<span id=\"Ilwal_span2\" style=\"display:none;\">\r\n            \t\t<a href=\"javascript:Ilgwal_license();\"><img src=\"../../../img/jumyongjugaON.gif\" border=\"0\" align=\"absmiddle\" alt=\"일괄점용허가증\"></a>\r\n            \t\t<a href=\"javascript:Ilgwal_license2();\"><img src=\"../../../img/occu_icon2.gif\" border=\"0\" align=\"absmiddle\" alt=\"일괄점용허가증(도로법)\"></a>\r\n            \t\t<img src=\"../../../img/excel_icon.gif\" alt=\"EXCEL 변환\" border=\"0\" onclick=\"javascript:excel_Search();\" style=\"cursor:hand\">  \r\n            \t</span>      \r\n            \t<span id=\"Ilwal_span3\" style=\"display:none;\">\r\n            \t\t<a href=\"javascript:alert('점용구분을  계속으로 검색하세요.');\"><img src=\"/img/jumyongjugaOFF.gif\" alt=\"일괄점용허가증\" border=\"0\"></a>            \t\t\r\n            \t\t<img src=\"../../../img/excel_icon.gif\" alt=\"EXCEL 변환\" border=\"0\" onclick=\"javascript:excel_Search();\" style=\"cursor:hand\"> \r\n            \t</span>        \t           \t           \t\t\r\n            </td>\r\n          </tr>\r\n        </table></td>\r\n      </tr>\r\n\r\n  \t<tr><td>\r\n  \t</td>\r\n  \t</tr>\r\n</table></td>         \r\n</form>\r\n\r\n</body>\r\n</html>";
}
