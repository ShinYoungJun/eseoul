package jeus_jspwork._jsp._rojum._minwon;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_search_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(36,17);to=(36,20)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MSG}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(37,30);to=(37,33)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MSG}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      out.write(_jspx_template12);
      // jsp code [from=(163,35);to=(163,42)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GU_CODE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      out.write(_jspx_template14);
      // jsp code [from=(259,79);to=(259,86)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GU_LIST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(264,65);to=(264,87)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(FROMDATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

      out.write(_jspx_template16);
      // jsp code [from=(267,62);to=(267,82)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(TODATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

      out.write(_jspx_template17);
      // jsp code [from=(289,95);to=(289,104)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${listCount}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template30);
      // jsp code [from=(345,39);to=(345,56)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${strPageDivideForm}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template31);

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
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("board");
    _jspx_th_c_forEach_0.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template19);
            // jsp code [from=(322,103);to=(322,134)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(board.REGIST_DATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template20);
            // jsp code [from=(323,104);to=(323,117)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.COL_SUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template21);
            // jsp code [from=(324,103);to=(324,113)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.COL1}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template22);
            // jsp code [from=(325,103);to=(325,113)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.COL2}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template23);
            // jsp code [from=(326,103);to=(326,113)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.COL3}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template24);
            // jsp code [from=(327,103);to=(327,113)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.COL4}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template25);
            // jsp code [from=(328,103);to=(328,113)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.COL5}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template26);
            // jsp code [from=(329,103);to=(329,113)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.COL6}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template27);
            // jsp code [from=(330,103);to=(330,113)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.COL7}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template28);
            // jsp code [from=(331,103);to=(331,113)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.COL8}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template29);

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

  private static jeus.servlet.jsp.el.FunctionMapperImpl _jspx_fnmap_0;
  
  static {
    _jspx_fnmap_0 = jeus.servlet.jsp.el.FunctionMapperImpl.getInstance();
    _jspx_fnmap_0.mapFunction("rnic:addDash", main.java.common.util.StringUtil.class, "addDash", new Class[] {java.lang.String.class});

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
  private final static String _jspx_template9 = "\r\n<html>\r\n    <head>\r\n        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n        <title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n        <style type=\"text/css\">\r\n            <!--\r\n            body {\r\n                margin: 0px;\r\n                background-image: url(/img/left_back.gif);\r\n            }\r\n            -->\r\n        </style>\r\n        <link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n        <script language=\"javascript\" src=\"/js/common.js\"></script>\r\n        <script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script>\r\n        <script language=\"javascript\" src=\"/js/calculation.js\"></script>\r\n        <script language=\"javascript\" src=\"/js/selectItem.js\"></script>\r\n        <script language=\"javascript\" src=\"/js/Ajax_request.js\"></script>\r\n\r\n        <script>\r\n            function goSearch()\r\n            {\r\n                var GU_CODE = document.getElementById(\"GU_LIST\").value;\r\n                var FROMDATE = removeDash(document.getElementById(\"FROMDATE\").value);\r\n                var TODATE = removeDash(document.getElementById(\"TODATE\").value);\r\n\t\t\r\n                location.href=\"/rojum/minwon/search.do?GU_CODE=\"+GU_CODE+\"&FROMDATE=\"+FROMDATE+\"&TODATE=\"+TODATE;\r\n            }\r\n\t\t\t\r\n            function InitPage()\r\n            {\t\t\r\n        \t\tif('";
  private final static String _jspx_template10 = "'.length > 0){\r\n                    alert('";
  private final static String _jspx_template11 = "');\r\n                }\r\n            }\r\n\t\t\t\r\n            function checkKeySearch(){\r\n                if(event.keyCode == \"13\")\r\n                    goSearch();\r\n            }\r\n\r\n            function excel_Search()\r\n            {\r\n            \t var GU_CODE = document.getElementById(\"GU_LIST\").value;\r\n                 var FROMDATE = removeDash(document.getElementById(\"FROMDATE\").value);\r\n                 var TODATE = removeDash(document.getElementById(\"TODATE\").value);\r\n \t\t\r\n                 location.href=\"/rojum/minwon/search.do?GU_CODE=\"+GU_CODE+\"&FROMDATE=\"+FROMDATE+\"&TODATE=\"+TODATE+\"&EXCEL=Y\";\r\n\t\t    }\r\n            \r\n            \r\n            var checkNum;\r\n            \r\n            function checkItem(obj){\r\n            \tvar selectItems = document.getElementsByName(\"SELECT_ITEM\");\r\n            \t\r\n            \tfor(var i = 0 ; i < selectItems.length ; i++){\r\n            \t\tif(selectItems[i] == obj){\r\n            \t\t\tif(selectItems[i].checked){\r\n            \t\t\t\tcheckNum = i;\t\r\n            \t\t\t}else{\r\n            \t\t\t\tcheckNum = null;\r\n            \t\t\t}\r\n            \t\t}else{\r\n            \t\t\tselectItems[i].checked = false;\r\n            \t\t}\r\n            \t}\r\n            \t\r\n            }\r\n            \r\n            \r\n            function fn_new(){\r\n            \t\r\n            \tdocument.getElementById(\"DATE_BTN\").style.visibility = \"visible\";\r\n            \t\r\n            \tdocument.getElementById(\"REGIST_DATE\").value = '';\r\n            \tdocument.getElementById(\"COL1\").value = '';\r\n            \tdocument.getElementById(\"COL2\").value = '';\r\n            \tdocument.getElementById(\"COL3\").value = '';\r\n            \tdocument.getElementById(\"COL4\").value = '';\r\n            \tdocument.getElementById(\"COL5\").value = '';\r\n            \tdocument.getElementById(\"COL6\").value = '';\r\n            \tdocument.getElementById(\"COL7\").value = '';\r\n            \tdocument.getElementById(\"COL8\").value = '';\r\n            \tMessageDisplay('DlgMinwonEdit','MinWonEdit',1);\r\n            \tdocument.getElementById(\"MINWON_SAVE\").onclick = function(){\r\n            \t\tif(document.getElementById(\"REGIST_DATE\").value == ''){\r\n            \t\t\talert(\"등록일자를 선택해주세요\");\r\n            \t\t\treturn;\r\n            \t\t}\r\n            \t\tdocument.getElementById(\"FROMDATE\").value = removeDash(document.getElementById(\"FROMDATE\").value);\r\n                    document.getElementById(\"TODATE\").value = removeDash(document.getElementById(\"TODATE\").value);\r\n            \t\tdocument.getElementById(\"REGIST_DATE\").value = removeDash(document.getElementById(\"REGIST_DATE\").value);\r\n            \t\t\r\n            \t\tvar form = document.searchForm;\r\n            \t\tform.action = \"/rojum/minwon/new.do\";\r\n            \t\tform.submit();\r\n            \t};\r\n            }\r\n            \r\n            function fn_modify(){\r\n            \tif(checkNum != null){\r\n            \t\t\r\n            \t\tdocument.getElementById(\"DATE_BTN\").style.visibility = \"hidden\";\r\n            \t\t\r\n            \t\tvar tbl = document.getElementById(\"DATA_TABLE\");\r\n            \t\t\r\n            \t\tdocument.getElementById(\"REGIST_DATE\").value = tbl.rows[checkNum+1].cells[1].outerText;\r\n                \tdocument.getElementById(\"COL1\").value  = tbl.rows[checkNum+1].cells[3].outerText;\r\n                \tdocument.getElementById(\"COL2\").value  = tbl.rows[checkNum+1].cells[4].outerText;\r\n                \tdocument.getElementById(\"COL3\").value  = tbl.rows[checkNum+1].cells[5].outerText;\r\n                \tdocument.getElementById(\"COL4\").value  = tbl.rows[checkNum+1].cells[6].outerText;\r\n                \tdocument.getElementById(\"COL5\").value  = tbl.rows[checkNum+1].cells[7].outerText;\r\n                \tdocument.getElementById(\"COL6\").value  = tbl.rows[checkNum+1].cells[8].outerText;\r\n                \tdocument.getElementById(\"COL7\").value  = tbl.rows[checkNum+1].cells[9].outerText;\r\n                \tdocument.getElementById(\"COL8\").value  = tbl.rows[checkNum+1].cells[10].outerText;\r\n                \tMessageDisplay('DlgMinwonEdit','MinWonEdit',1);\r\n                \t\r\n                \t\r\n                \tdocument.getElementById(\"MINWON_SAVE\").onclick = function(){\r\n                \t\tdo";
  private final static String _jspx_template12 = "cument.getElementById(\"FROMDATE\").value = removeDash(document.getElementById(\"FROMDATE\").value);\r\n                        document.getElementById(\"TODATE\").value = removeDash(document.getElementById(\"TODATE\").value);\r\n                \t\tdocument.getElementById(\"REGIST_DATE\").value = removeDash(document.getElementById(\"REGIST_DATE\").value);\r\n                \t\t\r\n                \t\tvar form = document.searchForm;\r\n                \t\tform.action = \"/rojum/minwon/modify.do\";\r\n                \t\tform.submit();\r\n                \t};\r\n                \t\r\n                \t\r\n            \t}else{\r\n            \t\talert('수정하시고자 하는 현황을 선택해 주세요.');\r\n            \t\treturn;\r\n            \t}\r\n            }\r\n            \r\n            function fn_del(){\r\n            \tif(checkNum != null){\r\n            \t\t\r\n            \t\tdocument.getElementById(\"FROMDATE\").value = removeDash(document.getElementById(\"FROMDATE\").value);\r\n                    document.getElementById(\"TODATE\").value = removeDash(document.getElementById(\"TODATE\").value);\r\n            \t\t\r\n                    var tbl = document.getElementById(\"DATA_TABLE\");\r\n                    document.getElementById(\"REGIST_DATE\").value = removeDash(tbl.rows[checkNum+1].cells[1].outerText);\r\n                    \r\n                \tvar form = document.searchForm;\r\n                \tform.action = \"/rojum/minwon/del.do\";\r\n                \tform.submit();\r\n            \t}else{\r\n            \t\talert('삭제하시고자 하는 현황을 선택해 주세요.');\r\n            \t\treturn;\r\n            \t}\r\n            }\r\n        </script>\r\n    </head>\r\n\r\n    <body onload=\"javascript:InitPage();\">\r\n\t\t<form id=\"searchForm\" name=\"searchForm\" method=\"post\">\r\n\t\t\t<input name=\"GU_CODE\" value=\"";
  private final static String _jspx_template13 = "\" type=\"hidden\" >\r\n\t\t\t<div id=\"DlgMinwonEdit\" style=\"position:absolute; display:none;\">\r\n                <table id=\"MinWonEdit\" width=\"670px\" height=\"140px\" border=\"2\" bordercolor=\"#A0A0FF\" style=\"border-collapse:collapse;background-color:white;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n                    <tr>\r\n                        <td align=\"center\">\r\n                            <table width=\"660px\" height=\"130px\" border=\"0\" style=\"border-collapse:collapse;background-color:white;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n                                <tr>\r\n                                    <td height=\"32px\">\r\n                                    \t<span style=\"font-weight: bold;color: #6060FF\"> 민원현황 등록/수정</span>\r\n                                    </td>\r\n                                </tr>\r\n                                <tr>\r\n                                    <td align=\"center\"  width=\"100%\">\r\n\t\t\t\t\t\t\t\t\t\t<table width=\"660px\" cellpadding=\"0\" cellspacing=\"0\" border=\"1\" class=\"sub_table\" bordercolor=\"#c9dfed\" style=\"border-collapse: collapse;\">\r\n\t\t\t\t\t\t\t\t\t\t    <tr height=\"26px\">\r\n\t\t\t\t\t\t\t\t\t\t        <td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">등록일자</td>\r\n\t\t\t\t\t\t\t\t\t\t        <td width=\"70px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">서신</td>\r\n\t\t\t\t\t\t\t\t\t\t        <td width=\"70px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">인터넷</td>\r\n\t\t\t\t\t\t\t\t\t\t        <td width=\"70px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">120살피미</td>\r\n\t\t\t\t\t\t\t\t\t\t        <td width=\"70px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">해피콜</td>\r\n\t\t\t\t\t\t\t\t\t\t        <td width=\"70px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">전화</td>\r\n\t\t\t\t\t\t\t\t\t\t        <td width=\"70px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">방문</td>\r\n\t\t\t\t\t\t\t\t\t\t        <td width=\"70px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">진정ㆍ건의</td>\r\n\t\t\t\t\t\t\t\t\t\t        <td width=\"70px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">기타</td>\r\n\t\t\t\t\t\t\t\t\t\t    </tr>\r\n\t\t\t\t\t\t\t\t\t\t    <tr height=\"26px\" onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\" style=\"cursor: pointer\">\r\n\t\t\t\t\t\t\t\t\t\t        <td width=\"100px\" align=\"center\">\r\n\t\t\t\t\t\t\t\t\t\t        \t<input name=\"REGIST_DATE\" id=\"REGIST_DATE\" value=\"\" type=\"text\" class=\"input_form1\" style=\"width:60px\" readonly>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"/img/calendar_icon.gif\" id=\"DATE_BTN\" style=\"cursor:pointer;vertical-align: middle;\" onclick=\"popUpCalendar(this, document.getElementById('REGIST_DATE'), 'yyyymmdd');\">\r\n\t\t\t\t\t\t\t\t\t\t        </td>\r\n\t\t\t\t\t\t\t\t\t\t        <td width=\"70px\" align=\"center\">\r\n\t\t\t\t\t\t\t\t\t\t        \t<input name=\"COL1\" id=\"COL1\" value=\"\" type=\"text\" class=\"input_form1\" style=\"width:50px;text-align:right;\" onKeyDown=\"onlyNumberInput();\" maxlength=\"3\">건\r\n\t\t\t\t\t\t\t\t\t\t        </td>\r\n\t\t\t\t\t\t\t\t\t\t        <td width=\"70px\" align=\"center\">\r\n\t\t\t\t\t\t\t\t\t\t        \t<input name=\"COL2\" id=\"COL2\" value=\"\" type=\"text\" class=\"input_form1\" style=\"width:50px;text-align:right;\" onKeyDown=\"onlyNumberInput();\" maxlength=\"3\">건\r\n\t\t\t\t\t\t\t\t\t\t        </td>\r\n\t\t\t\t\t\t\t\t\t\t        <td width=\"70px\" align=\"center\">\r\n\t\t\t\t\t\t\t\t\t\t        \t<input name=\"COL3\" id=\"COL3\" value=\"\" type=\"text\" class=\"input_form1\" style=\"width:50px;text-align:right;\" onKeyDown=\"onlyNumberInput();\" maxlength=\"3\">건\r\n\t\t\t\t\t\t\t\t\t\t        </td>\r\n\t\t\t\t\t\t\t\t\t\t        <td width=\"70px\" align=\"center\">\r\n\t\t\t\t\t\t\t\t\t\t        \t<input name=\"COL4\" id=\"COL4\" value=\"\" type=\"text\" class=\"input_form1\" style=\"width:50px;text-align:right;\" onKeyDown=\"onlyNumberInput();\" maxlength=\"3\">건\r\n\t\t\t\t\t\t\t\t\t\t        </td>\r\n\t\t\t\t\t\t\t\t\t\t        <td width=\"70px\" align=\"center\">\r\n\t\t\t\t\t\t\t\t\t\t        \t<input name=\"COL5\" id=\"COL5\" value=\"\" type=\"text\" class=\"input_form1\" style=\"width:50px;text-align:right;\" onKeyDown=\"onlyNumberInput();\" maxlength=\"3\">건\r\n\t\t\t\t\t\t\t\t\t\t        </td>\r\n\t\t\t\t\t\t\t\t\t\t        <td width=\"70px\" align=\"center\">\r\n\t\t\t\t\t\t\t\t\t\t        \t<input name=\"COL6\" id=\"COL6\" value=\"\" type=\"text\" class=\"input_form1\" style=\"width:50px;text-align:right;\" onKeyDown=\"onlyNumberInput();\" maxlength=\"3\">건\r\n\t\t\t\t\t\t\t\t\t\t        </td>\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template14 = "\t        <td width=\"70px\" align=\"center\">\r\n\t\t\t\t\t\t\t\t\t\t        \t<input name=\"COL7\" id=\"COL7\" value=\"\" type=\"text\" class=\"input_form1\" style=\"width:50px;text-align:rightf;\" onKeyDown=\"onlyNumberInput();\" maxlength=\"3\">건\r\n\t\t\t\t\t\t\t\t\t\t        </td>\r\n\t\t\t\t\t\t\t\t\t\t        <td width=\"70px\" align=\"center\">\r\n\t\t\t\t\t\t\t\t\t\t        \t<input name=\"COL8\" id=\"COL8\" value=\"\" type=\"text\" class=\"input_form1\" style=\"width:50px;text-align:rightf;\" onKeyDown=\"onlyNumberInput();\" maxlength=\"3\">건\r\n\t\t\t\t\t\t\t\t\t\t        </td>\r\n\t\t\t\t\t\t\t\t\t\t    </tr>\r\n\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t<td>\r\n                                </tr>\r\n                                 <tr>\r\n                                    <td align=\"center\" colspan=\"2\">\r\n                                        <img src=\"/img/save_icon2.gif\" id=\"MINWON_SAVE\" alt=\"저장\" width=\"56\" height=\"18\" border=\"0\" onClick=\"\"  style=\"cursor:pointer\">\r\n                                        <img src=\"/img/can_icon.gif\" alt=\"취소\" border=\"0\" onclick=\"MessageDisplay('DlgMinwonEdit','MinWonEdit',0);\" style=\"cursor:pointer\" >\r\n                                    </td>\r\n                                </tr>\r\n                            </table>\r\n                        </td>\r\n                    </tr>\r\n                </table>\r\n            </div>\r\n\t\t\t\r\n            <table width=\"780px\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n                <tr>\r\n                    <td height=\"43\">\r\n                        <img src=\"/img/sub7_cont3_title.gif\" width=\"800px\" height=\"43\">\r\n                    </td>\r\n                </tr>\r\n                <tr>\r\n                    <td align=\"center\">\r\n                        <table width=\"780px\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                            <tr>\r\n                                <td>\r\n                                    <table width=\"780px\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                                        <tr>\r\n                                            <td align=\"left\" height=\"22\" background=\"/img/tab_line_blue.gif\">\r\n                                            </td>\r\n                                        </tr>\r\n                                        <tr>\r\n                                            <td class=\"contborder_purple\">\r\n                                                <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                                                    <tr>\r\n                                                        <td>\r\n                                                            <table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse: collapse;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n                                                                <tr>\r\n                                                                    <td height=\"26px\" width=\"100px\"  align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">시군구</td>\r\n                                                                    <td width=\"35%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\" >\r\n                                                                        <select id=\"GU_LIST\" name=\"GU_LIST\" class=\"input_form1\" style=\"width: 130px\">\r\n                                                                            ";
  private final static String _jspx_template15 = "\r\n                                                                        </select>\r\n                                                                    </td>\r\n                                                                    <td height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">등록기간</td>\r\n                                                                    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"FROMDATE\" id=\"FROMDATE\" value=\"";
  private final static String _jspx_template16 = "\" type=\"text\" class=\"input_form1\" style=\"width:80px\" readonly>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"/img/calendar_icon.gif\" style=\"cursor:pointer;vertical-align: middle;\" onclick=\"popUpCalendar(this, document.getElementById('FROMDATE'), 'yyyymmdd');\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t&nbsp;~&nbsp;\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"TODATE\" id =\"TODATE\" value=\"";
  private final static String _jspx_template17 = "\" type=\"text\" class=\"input_form1\" style=\"width:80px\" readonly>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"/img/calendar_icon.gif\" style=\"cursor:pointer;vertical-align: middle;\" onclick=\"popUpCalendar(this, document.getElementById('TODATE'), 'yyyymmdd');\">\r\n                                                                    </td>\t\t\t\t\t\t\t\t\t\t\t\r\n                                                                </tr>\t\t\r\n                                                                <tr>\r\n                                                            </table>\r\n                                                        </td>\r\n                                                    </tr>\r\n                                                    <tr>\r\n                                                        <td height=\"40px\" align=\"right\">\r\n                                                            <img src=\"/img/inquiry_icon2.gif\" alt=\"조회\" width=\"56\" height=\"18\" border=\"0\" onclick=\"javascript:goSearch();\" style=\"cursor: pointer\">\r\n                                                        </td>\r\n                                                    </tr>\r\n                                                    <tr>\r\n                                                        <td height=\"1px\" bgcolor=\"#EAEAEA\"></td>\r\n                                                    </tr>\r\n\r\n                                                    <tr>\r\n                                                        <td height=\"34px\" class=\"sub_stan\">\r\n                                                        <table width=\"100%\">\r\n                                                        <tr>\r\n                                                        <td width=\"50%\" align=\"left\">\r\n                                                        \t전체건수 : <span class=\"sub_stan_blue\">";
  private final static String _jspx_template18 = "</span>건\r\n                                                        </td>\r\n                                                        <td width=\"50%\" align=\"right\">\r\n\t                                                        <img src=\"/img/new_icon3.gif\" alt=\"신규\" border=\"0\" onclick=\"javascript:fn_new();\" style=\"cursor:pointer;\">\r\n                                                        \t<img src=\"/img/mod_icon2.gif\" alt=\"수정\" border=\"0\" onclick=\"javascript:fn_modify();\" style=\"cursor:pointer;\">\r\n                                                        \t<img src=\"/img/del_icon.gif\" alt=\"삭제\" border=\"0\" onclick=\"javascript:fn_del();\" style=\"cursor:pointer;\">\r\n                                                        </td>\r\n                                                        </tr>\r\n                                                        </table>\r\n                                                        </td>\r\n\r\n                                                    </tr>\r\n                                                    <tr>\r\n                                                        <td>\r\n                                                            <table id=\"DATA_TABLE\" width=\"780px\" cellpadding=\"0\" cellspacing=\"0\" border=\"1\" class=\"sub_table\" bordercolor=\"#c9dfed\" style=\"border-collapse: collapse;\">\r\n                                                                <tr height=\"26px\">\r\n                                                                    <td width=\"30px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">선택</td>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n                                                                    <td width=\"90px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">등록일자</td>\r\n                                                                    <td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">계</td>\r\n                                                                    <td width=\"70px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">서신</td>\r\n                                                                    <td width=\"70px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">인터넷</td>\r\n                                                                    <td width=\"70px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">120살피미</td>\r\n                                                                    <td width=\"70px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">해피콜</td>\r\n                                                                    <td width=\"70px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">전화</td>\r\n                                                                    <td width=\"70px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">방문</td>\r\n                                                                    <td width=\"70px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">진정ㆍ건의</td>\r\n                                                                    <td width=\"70px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">기타</td>\r\n                                                                </tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template19 = "\r\n                                                                <tr height=\"26px\" onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\" style=\"cursor: pointer\">\r\n                                                                \t <td width=\"30px\" height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">\r\n                                                                          <INPUT TYPE=\"checkbox\" NAME=\"SELECT_ITEM\" onclick=\"checkItem(this);\">\r\n                                                                    </td>\r\n                                                                    <td width=\"90px\" align=\"center\">";
  private final static String _jspx_template20 = "</td>\r\n                                                                    <td width=\"100px\" align=\"center\">";
  private final static String _jspx_template21 = "</td>\r\n                                                                    <td width=\"70px\" align=\"center\">";
  private final static String _jspx_template22 = "</td>\r\n                                                                    <td width=\"70px\" align=\"center\">";
  private final static String _jspx_template23 = "</td>\r\n                                                                    <td width=\"70px\" align=\"center\">";
  private final static String _jspx_template24 = "</td>\r\n                                                                    <td width=\"70px\" align=\"center\">";
  private final static String _jspx_template25 = "</td>\r\n                                                                    <td width=\"70px\" align=\"center\">";
  private final static String _jspx_template26 = "</td>\r\n                                                                    <td width=\"70px\" align=\"center\">";
  private final static String _jspx_template27 = "</td>\r\n                                                                    <td width=\"70px\" align=\"center\">";
  private final static String _jspx_template28 = "</td>\r\n                                                                    <td width=\"70px\" align=\"center\">";
  private final static String _jspx_template29 = "</td>\r\n                                                                </tr>\r\n                                                                ";
  private final static String _jspx_template30 = "\r\n                                                            </table>\r\n\r\n                                                        </td>\r\n                                                    </tr>\r\n                                                    <tr>\r\n\t\t\t\t\t\t\t\t\t                <td height=\"40\" align=\"center\">\r\n\t\t\t\t\t\t\t\t\t\t                <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t\t\t\t                    <tr>\r\n\t\t\t\t\t\t\t\t\t\t                      <td align=\"center\">\r\n\t\t\t\t\t\t\t\t\t\t                      \t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t\t\t\t\t\t\t\t\t\t                        <tr>\r\n\t\t\t\t\t\t\t\t\t\t\t                        \t";
  private final static String _jspx_template31 = "\r\n\t\t\t\t\t\t\t\t\t\t\t                        </tr>\r\n\t\t\t\t\t\t\t\t\t\t                      \t</table>\r\n\t\t\t\t\t\t\t\t\t\t                      </td>\r\n\t\t\t\t\t\t\t\t\t\t                    </tr>\r\n\t\t\t\t\t\t\t\t\t\t                  </table>\r\n\t\t\t\t\t\t\t\t\t                  </td>\r\n\t\t\t\t\t\t\t\t\t              </tr>\r\n                                                    <tr>\r\n                                                        <td height=\"40px\" align=\"right\">\r\n                                                            <img src=\"/img/excel_icon.gif\" alt=\"EXCEL 변환\" border=\"0\" onclick=\"javascript:excel_Search();\" style=\"cursor:pointer;\">\r\n                                                        </td>\r\n                                                    </tr>\r\n                                                </table>\r\n                                            </td>\r\n                                        </tr>\r\n\r\n                                    </table>\r\n                                </td>\r\n                            </tr>\r\n                            <tr>\r\n                                <td height=\"30\"></td>\r\n                            </tr>\r\n                        </table>\r\n                    </td>\r\n                </tr>\r\n            </table>\r\n        </form>\r\n        <iframe id=\"ifrm\" name=\"ifrm\" width=\"70%\" height=\"0px\"></iframe>\r\n    </body>\r\n</html>\r\n";
}
