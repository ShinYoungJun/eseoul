package jeus_jspwork._jsp._rojum._owner;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_accuse_5fsearch_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      out.write(_jspx_template13);
      // jsp code [from=(231,51);to=(231,58)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${gu_list}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(238,86);to=(238,96)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${owner_name}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(242,58);to=(242,80)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(fromDate)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

      out.write(_jspx_template16);
      // jsp code [from=(245,55);to=(245,75)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(toDate)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

      out.write(_jspx_template17);
      // jsp code [from=(267,67);to=(267,76)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${listCount}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template26);
      // jsp code [from=(313,24);to=(313,41)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${strPageDivideForm}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);

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
            // jsp code [from=(293,73);to=(293,82)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template20);
            // jsp code [from=(294,79);to=(294,94)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_SSN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template21);
            // jsp code [from=(296,76);to=(296,106)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(board.OWNER_NAME)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template22);
            // jsp code [from=(297,76);to=(297,109)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${fn:substring(board.OWNER_SSN,0,6)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_1));

            out.write(_jspx_template23);
            // jsp code [from=(298,62);to=(298,79)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ACCUSE_DATA}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template24);
            // jsp code [from=(299,76);to=(299,107)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(board.ACCUSE_DATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template25);

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
  private static jeus.servlet.jsp.el.FunctionMapperImpl _jspx_fnmap_1;
  
  static {
    _jspx_fnmap_0 = jeus.servlet.jsp.el.FunctionMapperImpl.getInstance();
    _jspx_fnmap_0.mapFunction("rnic:addDash", main.java.common.util.StringUtil.class, "addDash", new Class[] {java.lang.String.class});

    _jspx_fnmap_1 = jeus.servlet.jsp.el.FunctionMapperImpl.getInstance();
    _jspx_fnmap_1.mapFunction("fn:substring", org.apache.taglibs.standard.functions.Functions.class, "substring", new Class[] {java.lang.String.class, int.class, int.class});

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
  private final static String _jspx_template9 = "\r\n<html>\r\n    <head>\r\n        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n        <title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n        <style type=\"text/css\">\r\n            <!--\r\n            body {\r\n                margin: 0px;\r\n            }\r\n            -->\r\n        </style>\r\n        <link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n        <script language=\"javascript\" src=\"/js/common.js\"></script>\r\n        <script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script>\r\n        <script language=\"javascript\" src=\"/js/calculation.js\"></script>\r\n        <script language=\"javascript\" src=\"/js/selectItem.js\"></script>\r\n        <script language=\"javascript\" src=\"/js/Ajax_request.js\"></script>\r\n\r\n        <script>\r\n            function goSearch()\r\n            {\r\n                var gu_cd = document.getElementById(\"GU_LIST\").value;\r\n                var owner_name = document.getElementById(\"NAME\").value;\r\n                var toDate = document.getElementById(\"TODATE\").value;\r\n                var fromDate = document.getElementById(\"FROMDATE\").value;\r\n\t\t\r\n                location.href=\"/rojum/owner/accuse_search.do?gu_cd=\"+gu_cd+\"&owner_name=\"+owner_name+\"&toDate=\"+toDate+\"&fromDate=\"+fromDate;\r\n            }\r\n\t\t\t\r\n            function InitPage()\r\n            {\t\t\r\n        \t\tif('";
  private final static String _jspx_template10 = "'.length > 0){\r\n                    alert('";
  private final static String _jspx_template11 = "');\r\n                }\r\n            }\r\n\t\t\t\r\n            function checkKeySearch(){\r\n                if(event.keyCode == \"13\")\r\n                    goSearch();\r\n            }\r\n            \r\n            var checkNum;\r\n            \r\n            function checkItem(obj){\r\n            \tvar selectItems = document.getElementsByName(\"SELECT_ITEM\");\r\n            \t\r\n            \tfor(var i = 0 ; i < selectItems.length ; i++){\r\n            \t\tif(selectItems[i] == obj){\r\n            \t\t\tif(selectItems[i].checked){\r\n            \t\t\t\tcheckNum = i;\t\r\n            \t\t\t}else{\r\n            \t\t\t\tcheckNum = null;\r\n            \t\t\t}\r\n            \t\t}else{\r\n            \t\t\tselectItems[i].checked = false;\r\n            \t\t}\r\n            \t}\r\n            \t\r\n            }\r\n            \r\n            \r\n            function fn_new(){\r\n            \t\r\n            \tdocument.getElementById(\"ACCUSE_DATE\").value = '';\r\n            \tdocument.getElementById(\"OWNER_NAME\").value = '';\r\n            \tdocument.getElementById(\"OWNER_SSN1\").value = '';\r\n            \tdocument.getElementById(\"OWNER_SSN2\").value = '';\r\n            \tdocument.getElementById(\"ACCUSE_DATA\").value = '';\r\n            \tMessageDisplay('DlgAccuseEdit','AccuseEdit',1);\r\n            \tdocument.getElementById(\"ACCUSE_SAVE\").onclick = function(){\r\n            \t\tif(document.getElementById(\"ACCUSE_DATE\").value == ''){\r\n            \t\t\talert(\"등록일자를 선택해주세요\");\r\n            \t\t\treturn;\r\n            \t\t}\r\n            \t\tif(document.getElementById(\"OWNER_NAME\").value == ''){\r\n            \t\t\talert(\"운영인 이름을 입력해주세요\");\r\n            \t\t\treturn;\r\n            \t\t}\r\n            \t\tif(document.getElementById(\"OWNER_SSN1\").value.length < 6){\r\n            \t\t\talert(\"주민번호를 입력해주세요\");\r\n            \t\t\treturn;\r\n            \t\t}\r\n            \t\tif(document.getElementById(\"OWNER_SSN2\").value.length < 7){\r\n            \t\t\talert(\"주민번호를 입력해주세요\");\r\n            \t\t\treturn;\r\n            \t\t}\r\n            \t\tif(document.getElementById(\"ACCUSE_DATA\").value == ''){\r\n            \t\t\talert(\"고발내역을 입력해주세요\");\r\n            \t\t\treturn;\r\n            \t\t}\r\n            \t\t\r\n            \t\tvar form = document.insertForm;\r\n            \t\tform.action = \"/rojum/owner/new_accuse.do\";\r\n            \t\tform.submit();\r\n            \t};\r\n            }\r\n            \r\n            function fn_modify(){\r\n            \tif(checkNum != null){\r\n            \t\t\r\n            \t\tvar tbl = document.getElementById(\"DATA_TABLE\");\r\n            \t\t\r\n            \t\tdocument.getElementById(\"SEQ\").value = document.getElementsByName(\"SEQ_ARR\")[checkNum].value;\r\n                \tdocument.getElementById(\"ACCUSE_DATE\").value = tbl.rows[checkNum+1].cells[4].outerText;\r\n                \tdocument.getElementById(\"OWNER_NAME\").value = tbl.rows[checkNum+1].cells[1].outerText;\r\n                \tvar ssn = document.getElementsByName(\"OWNER_SSN_ARR\")[checkNum].value;\r\n                \tdocument.getElementById(\"OWNER_SSN1\").value = ssn.substring(0,6);\r\n                \tdocument.getElementById(\"OWNER_SSN2\").value = ssn.substring(6,13);\r\n                \tdocument.getElementById(\"ACCUSE_DATA\").value = tbl.rows[checkNum+1].cells[3].outerText;\r\n            \t\t\r\n                \tMessageDisplay('DlgAccuseEdit','AccuseEdit',1);\r\n                \t\r\n                \t\r\n                \tdocument.getElementById(\"ACCUSE_SAVE\").onclick = function(){\r\n                \t\tif(document.getElementById(\"ACCUSE_DATE\").value == ''){\r\n                \t\t\talert(\"등록일자를 선택해주세요\");\r\n                \t\t\treturn;\r\n                \t\t}\r\n                \t\tif(document.getElementById(\"OWNER_NAME\").value == ''){\r\n                \t\t\talert(\"운영인 이름을 입력해주세요\");\r\n                \t\t\treturn;\r\n                \t\t}\r\n                \t\tif(document.getElementById(\"OWNER_SSN1\").value.length < 6){\r\n                \t\t\talert(\"주민번호를 입력해주세요\");\r\n                \t\t\treturn;\r\n                \t\t}\r\n                \t\tif(document.getElementById(\"OWNER_SSN2\").value.length < 7){\r\n                \t\t\talert(\"주민번호를 입력해주세요\");\r\n                \t\t\treturn;\r\n                \t\t}\r\n                \t\tif(document.getElementById(\"ACCUSE_DATA\").value == ''){\r\n                \t\t\talert(\"고발내역을 입력해주세요\");\r\n          ";
  private final static String _jspx_template12 = "      \t\t\treturn;\r\n                \t\t}\r\n                \t\t\r\n                \t\tvar form = document.insertForm;\r\n                \t\tform.action = \"/rojum/owner/modify_accuse.do\";\r\n                \t\tform.submit();\r\n                \t};\r\n                \t\r\n                \t\r\n            \t}else{\r\n            \t\talert('수정하시고자 하는 내역을 선택해 주세요.');\r\n            \t\treturn;\r\n            \t}\r\n            }\r\n            \r\n            function fn_del(){\r\n            \tif(checkNum != null){\r\n            \t\t\r\n            \t\tdocument.getElementById(\"SEQ\").value = document.getElementsByName(\"SEQ_ARR\")[checkNum].value;\r\n            \t\t\r\n            \t\tvar form = document.insertForm;\r\n            \t\tform.action = \"/rojum/owner/del_accuse.do\";\r\n            \t\tform.submit();\r\n            \t}else{\r\n            \t\talert('삭제하시고자 하는 내역을 선택해 주세요.');\r\n            \t\treturn;\r\n            \t}\r\n            }\r\n        </script>\r\n    </head>\r\n\r\n    <body onload=\"javascript:InitPage();\">\r\n\t\t<form id=\"insertForm\" name=\"insertForm\" method=\"post\">\r\n\t\t\t<input id=\"SEQ\" name=\"SEQ\" type=\"hidden\" >\r\n\t\t\t<div id=\"DlgAccuseEdit\" style=\"position:absolute; display:none;\">\r\n                <table id=\"AccuseEdit\" width=\"670px\" height=\"140px\" border=\"2\" bordercolor=\"#A0A0FF\" style=\"border-collapse:collapse;background-color:white;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n                    <tr>\r\n                        <td align=\"center\">\r\n                            <table width=\"660px\" height=\"130px\" border=\"0\" style=\"border-collapse:collapse;background-color:white;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n                                <tr>\r\n                                    <td height=\"32px\">\r\n                                    \t<span style=\"font-weight: bold;color: #6060FF\"> 고발 등록/수정</span>\r\n                                    </td>\r\n                                </tr>\r\n                                <tr>\r\n                                    <td align=\"center\"  width=\"100%\">\r\n\t\t\t\t\t\t\t\t\t\t<table width=\"660px\" cellpadding=\"0\" cellspacing=\"0\" border=\"1\" class=\"sub_table\" bordercolor=\"#c9dfed\" style=\"border-collapse: collapse;\">\r\n\t\t\t\t\t\t\t\t\t\t    <tr height=\"26px\">\r\n\t\t\t\t\t\t\t\t\t\t        <td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">고발일자</td>\r\n\t\t\t\t\t\t\t\t\t\t        <td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">운영자</td>\r\n\t\t\t\t\t\t\t\t\t\t        <td width=\"150px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">주민번호</td>\r\n\t\t\t\t\t\t\t\t\t\t        <td width=\"300px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">고발내역</td>\r\n\t\t\t\t\t\t\t\t\t\t    </tr>\r\n\t\t\t\t\t\t\t\t\t\t    <tr height=\"26px\" onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\" style=\"cursor: pointer\">\r\n\t\t\t\t\t\t\t\t\t\t        <td width=\"100px\" align=\"center\">\r\n\t\t\t\t\t\t\t\t\t\t        \t<input name=\"ACCUSE_DATE\" id=\"ACCUSE_DATE\" value=\"\" type=\"text\" class=\"input_form1\" style=\"width:60px\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"/img/calendar_icon.gif\" style=\"cursor:pointer;vertical-align: middle;\" onclick=\"popUpCalendar(this, document.getElementById('ACCUSE_DATE'), 'yyyymmdd');\">\r\n\t\t\t\t\t\t\t\t\t\t        </td>\r\n\t\t\t\t\t\t\t\t\t\t        <td width=\"100px\" align=\"center\">\r\n\t\t\t\t\t\t\t\t\t\t        \t<input name=\"OWNER_NAME\" id=\"OWNER_NAME\" value=\"\" type=\"text\" class=\"input_form1\" style=\"width:80px;\" maxlength=\"40\">\r\n\t\t\t\t\t\t\t\t\t\t        </td>\r\n\t\t\t\t\t\t\t\t\t\t        <td width=\"150px\" align=\"center\">\r\n\t\t\t\t\t\t\t\t\t\t        \t<input name=\"OWNER_SSN1\" id=\"OWNER_SSN1\" value=\"\" type=\"text\" class=\"input_form1\" style=\"width:60px;\" onKeyDown=\"onlyNumberInput();\" maxlength=\"6\">-<input name=\"OWNER_SSN2\" id=\"OWNER_SSN2\" value=\"\" type=\"text\" class=\"input_form1\" style=\"width:60px;\" onKeyDown=\"onlyNumberInput();\" maxlength=\"7\">\r\n\t\t\t\t\t\t\t\t\t\t        </td>\r\n\t\t\t\t\t\t\t\t\t\t        <td width=\"300px\" align=\"center\">\r\n\t\t\t\t\t\t\t\t\t\t        \t<input name=\"ACCUSE_DATA\" id=\"ACCUSE_DATA\" value=\"\" type=\"text\" class=\"input_form1\" style=\"width:280px;\" maxlength=\"500\">\r\n\t\t\t\t\t\t\t\t\t\t        </td>\r\n\t\t\t\t\t\t\t\t\t\t    </tr>\r\n\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t<td>\r\n                                </tr>\r\n                                 <tr>\r\n                   ";
  private final static String _jspx_template13 = "                 <td align=\"center\" colspan=\"2\">\r\n                                        <img src=\"/img/save_icon2.gif\" id=\"ACCUSE_SAVE\" alt=\"저장\" width=\"56\" height=\"18\" border=\"0\" onClick=\"\"  style=\"cursor:pointer\">\r\n                                        <img src=\"/img/can_icon.gif\" alt=\"취소\" border=\"0\" onclick=\"MessageDisplay('DlgAccuseEdit','AccuseEdit',0);\" style=\"cursor:pointer\" >\r\n                                    </td>\r\n                                </tr>\r\n                            </table>\r\n                        </td>\r\n                    </tr>\r\n                </table>\r\n            </div>\r\n\t\t\t\r\n            <table width=\"780px\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n                <tr>\r\n   \t            \t<td class=\"contborder_purple\">\r\n                    <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                        <tr>\r\n                            <td>\r\n                                <table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse: collapse;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n                                    <tr>\r\n                                        <td width=\"15%\"  height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">시군구</td>\r\n                                        <td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\" >\r\n                                            <select id=\"GU_LIST\" name=\"GU_LIST\" class=\"input_form1\" style=\"width: 130px\">\r\n                                                ";
  private final static String _jspx_template14 = "\r\n                                            </select>\r\n                                        </td>\r\n                                    </tr>\r\n                                    <tr>\r\n                                        <td width=\"15%\"  height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">운영자명</td>\r\n                                        <td width=\"35%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\" >\r\n                                               <input name=\"NAME\" id=\"NAME\" value=\"";
  private final static String _jspx_template15 = "\" type=\"text\" class=\"input_form1\" style=\"width:130px\">\r\n                                        </td>\r\n                                        <td width=\"15%\" height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">등록기간</td>\r\n                                        <td width=\"35%\" bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\">\r\n\t\t\t\t\t\t\t\t\t\t\t<input name=\"FROMDATE\" id=\"FROMDATE\" value=\"";
  private final static String _jspx_template16 = "\" type=\"text\" class=\"input_form1\" style=\"width:80px\" readonly>\r\n\t\t\t\t\t\t\t\t\t\t\t<img src=\"/img/calendar_icon.gif\" style=\"cursor:pointer;vertical-align: middle;\" onclick=\"popUpCalendar(this, document.getElementById('FROMDATE'), 'yyyymmdd');\">\r\n\t\t\t\t\t\t\t\t\t\t\t&nbsp;~&nbsp;\r\n\t\t\t\t\t\t\t\t\t\t\t<input name=\"TODATE\" id =\"TODATE\" value=\"";
  private final static String _jspx_template17 = "\" type=\"text\" class=\"input_form1\" style=\"width:80px\" readonly>\r\n\t\t\t\t\t\t\t\t\t\t\t<img src=\"/img/calendar_icon.gif\" style=\"cursor:pointer;vertical-align: middle;\" onclick=\"popUpCalendar(this, document.getElementById('TODATE'), 'yyyymmdd');\">\r\n                                        </td>\t\t\t\t\t\t\t\t\t\t\t\r\n                                    </tr>\t\r\n                                    <tr>\r\n                                </table>\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td height=\"40px\" align=\"right\">\r\n                                <img src=\"/img/inquiry_icon2.gif\" alt=\"조회\" width=\"56\" height=\"18\" border=\"0\" onclick=\"javascript:goSearch();\" style=\"cursor: pointer\">\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n                            <td height=\"1px\" bgcolor=\"#EAEAEA\"></td>\r\n                        </tr>\r\n\r\n                        <tr>\r\n                            <td height=\"34px\" class=\"sub_stan\">\r\n                            <table width=\"100%\">\r\n                            <tr>\r\n                            <td width=\"50%\" align=\"left\">\r\n                            \t전체건수 : <span class=\"sub_stan_blue\">";
  private final static String _jspx_template18 = "</span>건\r\n                            </td>\r\n                            <td width=\"50%\" align=\"right\">\r\n                            \t<img src=\"/img/new_icon3.gif\" alt=\"신규\" border=\"0\" onclick=\"javascript:fn_new();\" style=\"cursor:pointer;\">\r\n                            \t<img src=\"/img/mod_icon2.gif\" alt=\"수정\" border=\"0\" onclick=\"javascript:fn_modify();\" style=\"cursor:pointer;\">\r\n                            \t<img src=\"/img/del_icon.gif\" alt=\"삭제\" border=\"0\" onclick=\"javascript:fn_del();\" style=\"cursor:pointer;\">\r\n                            </td>\r\n                            </tr>\r\n                            </table>\r\n                            </td>\r\n\r\n                        </tr>\r\n                        <tr>\r\n                            <td>\r\n                                <table id=\"DATA_TABLE\" width=\"780px\" cellpadding=\"0\" cellspacing=\"0\" border=\"1\" class=\"sub_table\" bordercolor=\"#c9dfed\" style=\"border-collapse: collapse;\">\r\n                                    <tr height=\"26px\">\r\n                                        <td width=\"30px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">선택</td>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n                                        <td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">이름</td>\r\n                                        <td width=\"150px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">주민번호</td>\r\n                                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">고발내역</td>\r\n                                        <td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">고발일자</td>\r\n                                    </tr>\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template19 = "\r\n                                    <tr height=\"26px\" onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\" style=\"cursor: pointer\">\r\n                                    \t<td width=\"30px\" height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">\r\n                                            <INPUT TYPE=\"checkbox\" NAME=\"SELECT_ITEM\" onclick=\"checkItem(this);\">\r\n                                        \t<input name=\"SEQ_ARR\" value=\"";
  private final static String _jspx_template20 = "\" type=\"hidden\">\r\n                                        \t<input name=\"OWNER_SSN_ARR\" value=\"";
  private final static String _jspx_template21 = "\" type=\"hidden\">\r\n                                        </td>\r\n                                        <td width=\"100px\" align=\"center\">";
  private final static String _jspx_template22 = "</td>\r\n                                        <td width=\"150px\" align=\"center\">";
  private final static String _jspx_template23 = "-*******</td>\r\n                                        <td align=\"center\">";
  private final static String _jspx_template24 = "</td>\r\n                                        <td width=\"100px\" align=\"center\">";
  private final static String _jspx_template25 = "</td>\r\n                                    </tr>\r\n                                    ";
  private final static String _jspx_template26 = "\r\n                                </table>\r\n\r\n                            </td>\r\n                        </tr>\r\n                        <tr>\r\n\t\t\t\t\t\t    <td height=\"40\" align=\"center\">\r\n\t\t\t\t\t\t     <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t         <tr>\r\n\t\t\t\t\t\t           <td align=\"center\">\r\n\t\t\t\t\t\t           \t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t\t\t\t\t              <tr>\r\n\t\t\t\t\t\t              \t";
  private final static String _jspx_template27 = "\r\n\t\t\t\t\t\t              </tr>\r\n\t\t\t\t\t\t           \t</table>\r\n\t\t\t\t\t\t           </td>\r\n\t\t\t\t\t\t         </tr>\r\n\t\t\t\t\t\t       </table>\r\n\t\t\t\t\t\t      </td>\r\n\t\t\t\t\t\t  </tr>\r\n                    </table>\r\n                </td>\r\n                </tr>\r\n            </table>\r\n        </form>\r\n        <iframe id=\"ifrm\" name=\"ifrm\" width=\"70%\" height=\"0px\"></iframe>\r\n    </body>\r\n</html>\r\n";
}
