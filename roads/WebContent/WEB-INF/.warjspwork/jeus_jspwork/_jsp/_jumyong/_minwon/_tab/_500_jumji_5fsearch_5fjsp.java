package jeus_jspwork._jsp._jumyong._minwon._tab;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_jumji_5fsearch_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(103,50);to=(103,61)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(115,134);to=(115,142)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(117,130);to=(117,134)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(128,15);to=(128,22)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SIGUNGU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(130,31);to=(130,42)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bjdong_code}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(133,31);to=(133,42)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${hjdong_code}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(136,31);to=(136,41)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mul_spc_cd}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(138,49);to=(138,55)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${BONBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(139,39);to=(139,44)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${BUBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(156,85);to=(156,93)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${totalcnt}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // ----  c:choose ---- invoke //
      if (_jspx_th_c_choose_0_fn(pageContext, null)) return;


      out.write(_jspx_template37);
      // jsp code [from=(198,9);to=(198,16)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${pageing}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template38);

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
          out.write(_jspx_template20);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template34);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template36);

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
          out.write(_jspx_template21);
          // ----  c:forEach ---- invoke //
          if (_jspx_th_c_forEach_0_fn(pageContext, _jspx_th_c_when_0)) return true;


          out.write(_jspx_template33);

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
          out.write(_jspx_template35);

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
            out.write(_jspx_template22);
            // jsp code [from=(174,59);to=(174,67)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.RN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template23);
            // jsp code [from=(175,76);to=(175,90)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template24);
            // jsp code [from=(176,37);to=(176,47)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template25);
            // jsp code [from=(177,37);to=(177,47)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TYPE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template26);
            // jsp code [from=(178,37);to=(178,53)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PURPOSE_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template27);
            // jsp code [from=(179,37);to=(179,48)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BJ_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template28);
            // jsp code [from=(179,52);to=(179,63)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.HJ_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template29);
            // jsp code [from=(179,68);to=(179,80)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BONBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            // jsp code [from=(179,83);to=(179,94)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BUBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template30);
            // jsp code [from=(179,98);to=(179,108)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TONG}",java.lang.String.class , pageContext.getVariableResolver(), null));

            // jsp code [from=(179,111);to=(179,120)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BAN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template31);
            // jsp code [from=(180,113);to=(180,127)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template32);

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
  private final static String _jspx_template9 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url/img/left_back.gif);\r\n}\r\n-->\r\n\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script>\r\n<script language='JavaScript' src='/js/Check_inputbox.js'></script>\r\n\r\n<script type=\"text/javascript\">\r\n//<![CDATA[\r\n\tfunction\tPage(page)\r\n\t{\r\n\t\tif(page\t==\t\"\")\r\n\t\t\treturn;\r\n\t\t\r\n\t\tvar form = document.form;\r\n\r\n\t\tform.currentPage.value\t= page;\r\n\r\n\t\tform.action = \"jumji_search.do\";\r\n\t\tform.submit();\r\n\t}\r\n\t\r\n\tfunction\tSearch()\r\n\t{\r\n\t\tvar form = document.form;\r\n\r\n\t\tvar\tdate\t= DataCheck();\r\n\t\t\r\n\t\tif(date\t== true)\r\n\t\t\treturn;\r\n\t\r\n\t\tform.currentPage.value\t= 1;\r\n\r\n\t\tform.action = \"jumji_search.do\";\r\n\t\tform.submit();\r\n\t}\r\n\t\r\n\tfunction\tDataCheck()\r\n\t{\r\n\t\tvar form \t= document.form;\r\n\r\n\t\tvar str = '';\r\n\t\tif(form.NAME.value.length < 1 && form.SSN1.value.length < 1 && form.SSN2.value.length < 1)\r\n\t\t{\r\n\t\t\tstr\t+= \"점용인 또는 주민(법인)번호 항목중 하나는 반드시 넣어야 합니다.\\n\";\r\n\t\t\talert(str);\r\n\t\t\tform.NAME.focus();\r\n\t\t\treturn true;\r\n\t\t}\r\n\t\t\r\n\t\treturn false;\r\n\t}\r\n\t\r\n\tfunction\tView(adminno)\r\n\t{\r\n\t\tparent.GoJumyongSearch(adminno);\r\n\t}\r\n\r\n\tfunction push_enter_search(){\r\n\t\tif (event.keyCode == 13) \r\n\t\t{\r\n\t\t\tSearch()\r\n\t\t}\r\n\t}\r\n\t\r\n\t//\t관리자 번호 앞에 9자리 삭제\r\n\tfunction\tnr_Adminno_Cut2(adminno)\r\n\t{\r\n\t\tif(adminno.length != 20)\r\n\t\t\treturn\tadminno\r\n\t\t\r\n\t\tadminno\t= adminno.substr(9, 11);\r\n\t\t\r\n\t\treturn\tadminno;\r\n\t}\r\n\t\r\n//]]>\r\n</script>\r\n\r\n<body>\r\n<table width=\"800\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" onkeydown=\"javascript:push_enter_search();\">\r\n<form name=\"form\" method=\"post\">\r\n<input type=\"hidden\" name=\"currentPage\" value=\"";
  private final static String _jspx_template10 = "\">\r\n\r\n      <tr>\r\n        <td align=\"left\"><table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\r\n\t\t\t<tr>\r\n            <td class=\"contborder_blue\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                <tr>\r\n                <td><table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t\t\t\r\n\t\t\t\t  \t<tr>\r\n\t\t\t\t\t\t<td width=\"100\" height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">관리번호</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"ADMIN_NO\" type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"";
  private final static String _jspx_template11 = "\"></td>\r\n\t\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용인</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><input name=\"NAME\" type=\"text\" class=\"input_form1\" style=\"width:120px\" value=\"";
  private final static String _jspx_template12 = "\" maxlength=\"20\"></td>\r\n\t\t\t\t\t\t<td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">주민(법인)번호</td>\r\n\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t<input name=\"SSN1\" type=\"text\" class=\"input_form1\" style=\"width:40px; ime-mode:disabled\" value=\"\" onKeyPress=\"nr_num_int(this);\" onKeyUp=\"count_check(this, SSN2, 6);\" maxlength=\"6\">\r\n\t\t\t\t\t\t\t - <input name=\"SSN2\" type=\"text\" class=\"input_form1\" style=\"width:45px; ime-mode:disabled\" value=\"\" onKeyPress=\"nr_num_int(this);\" maxlength=\"7\"></td>\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t\t\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t  \t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용지 지번 </td>\r\n\t\t\t\t\t  \t<td colspan=\"5\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t  <td>";
  private final static String _jspx_template13 = "&nbsp;&nbsp;</td>\r\n\t                         <td width=\"72\"><select name=\"BJ_CD\" class=\"input_form1\" style=\"width:100px\">\r\n\t                           ";
  private final static String _jspx_template14 = "\r\n\t                         </select></td>\r\n\t                         <td>&nbsp;<select name=\"HJ_CD\" class=\"input_form1\" style=\"width:100px\">\r\n\t                           ";
  private final static String _jspx_template15 = "\r\n\t                         </select></td>\r\n\t                         <td>&nbsp;/&nbsp;<select name=\"SPC_CD\" class=\"input_form1\" style=\"width:75px\">\r\n\t                           ";
  private final static String _jspx_template16 = "\r\n\t                         </select></td>\r\n\t\t\t\t\t\t  <td>&nbsp;<input name=\"BONBUN\" value=\"";
  private final static String _jspx_template17 = "\" type=\"text\" class=\"input_form1\" style=\"width:40px\" style=\"ime-mode:disabled\" onKeyDown=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);\" onKeyPress=\"nr_num_int(this);\" maxlength=\"4\">\r\n\t\t\t\t\t\t\t- <input name=\"BUBUN\" value=\"";
  private final static String _jspx_template18 = "\" type=\"text\" class=\"input_form1\" style=\"width:40px\" style=\"ime-mode:disabled\" onKeyDown=\"nr_num_int(this);\" onKeyUp=\"nr_num_int(this);\" onKeyPress=\"nr_num_int(this);\" maxlength=\"4\">\r\n\t\t\t\t\t\t\t번지</td>\r\n\t\t\t\t\t\t  </tr>\r\n\t\t\t\t\t  \t</table></td>\r\n\t\t\t\t\t</tr>\r\n\r\n\t\t\t\t</table></td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t\r\n                <tr>\r\n                  \t<td height=\"32\" align=\"right\"><img src=\"/img/inquiry_icon2.gif\" alt=\"조회\" width=\"56\" height=\"18\" border=\"0\" onclick=\"javascript:Search();\" style=\"CURSOR: Hand;\"></td>\r\n                </tr>\r\n                \r\n                <tr>\r\n                  \t<td height=\"1\" bgcolor=\"#EAEAEA\"></td>\r\n                </tr>\r\n                <tr>\r\n            \t\t<td height=\"34\" class=\"sub_stan\">전체건수 : <span class=\"sub_stan_blue\">";
  private final static String _jspx_template19 = "</span> 건 </td>\r\n                </tr>\r\n                <tr>\r\n         \t\t\t<td><table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n            \t\t<tr>\r\n                        <td height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">번호</td>\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">관리번호</td>\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용인</td>\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용종류</td>\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용목적</td>\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용지주소</td>\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">변경</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t\r\n\t\t\t\t\t";
  private final static String _jspx_template20 = "\r\n\t\t\t\t\t\t";
  private final static String _jspx_template21 = "\r\n\t\t                      ";
  private final static String _jspx_template22 = "\r\n\t\t\t                     <tr onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\">\r\n\t\t\t                     \t<td height=\"26\" align=\"center\">";
  private final static String _jspx_template23 = "</td>\r\n\t\t        \t\t\t\t\t<td align=\"center\"><script>var adminno = nr_Adminno_Cut2(\"";
  private final static String _jspx_template24 = "\"); document.write(adminno);</script></td>\r\n\t\t        \t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template25 = "</td>\r\n\t\t        \t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template26 = "</td>\r\n\t\t        \t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template27 = "</td>\r\n\t\t        \t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template28 = "(";
  private final static String _jspx_template29 = ") ";
  private final static String _jspx_template30 = " ";
  private final static String _jspx_template31 = "</td>\r\n\t\t        \t\t\t\t\t<td align=\"center\"><img src=\"/img/mod_icon3.gif\" alt=\"변경\" border=\"0\" onclick=\"javaScript:View('";
  private final static String _jspx_template32 = "');\" style=\"CURSOR:Hand;\"></td>\r\n\t\t\t                     </tr>\r\n\t\t\t\t\t\t\t ";
  private final static String _jspx_template33 = "\r\n\t\t\t\t\t\t";
  private final static String _jspx_template34 = "\r\n\t\t\t\t\t\t";
  private final static String _jspx_template35 = "\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td align=\"center\" class=\"sub_table\" colspan=\"7\" height=\"26\">검색된 내용이 없습니다</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t";
  private final static String _jspx_template36 = "\r\n\t\t\t\t\t ";
  private final static String _jspx_template37 = "\r\n\t\t\t\t\t \r\n\t\t\t\t\t </table>\r\n\t\t\t\t\t </td>\r\n                </tr>\r\n\r\n                <tr>\r\n                  <td height=\"30\" align=\"center\"><table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                      <tr>\r\n\t\t\t\t\t\t";
  private final static String _jspx_template38 = "\r\n                      </tr>\r\n                  </table></td>\r\n                </tr>\r\n                \r\n\t\t\t\t</table></td>\r\n\t\t\t</tr>\r\n\r\n\t\t</table></td>\r\n\t</tr>\r\n\r\n</form>\r\n</table>\r\n\r\n</body>\r\n</html>\r\n<script>\r\n\tparent.iFrameResize(parent.document.getElementById(\"tab2\"));\r\n</script>";
}
