package jeus_jspwork._jsp._admin._board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_boardList_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(203,41);to=(203,48)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${content}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(211,80);to=(211,88)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${fromDate}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(216,80);to=(216,86)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${toDate}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(228,14);to=(228,20)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${certYN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(275,113);to=(275,123)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${totalCount}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(301,56);to=(301,64)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${listSize}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template29);
      // jsp code [from=(327,29);to=(327,46)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${strPageDivideForm}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template30);
      // jsp code [from=(363,48);to=(363,53)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${gubun}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template31);
      // jsp code [from=(364,49);to=(364,55)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${certYN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template32);

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
            out.write(_jspx_template17);
            // jsp code [from=(306,36);to=(306,45)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${idx.count}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template18);
            // jsp code [from=(306,62);to=(306,71)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${idx.count}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template19);
            // jsp code [from=(307,31);to=(307,40)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${idx.count}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template20);
            // jsp code [from=(307,52);to=(307,61)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${idx.count}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template21);
            // jsp code [from=(307,73);to=(307,87)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BOARD_ID}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template22);
            // jsp code [from=(310,33);to=(310,47)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BOARD_ID}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template23);
            // jsp code [from=(311,67);to=(311,81)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BOARD_ID}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template24);
            // jsp code [from=(311,101);to=(311,112)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TITLE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template25);
            // jsp code [from=(312,33);to=(312,46)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.USER_ID}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template26);
            // jsp code [from=(313,33);to=(313,46)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.REGDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template27);
            // jsp code [from=(314,33);to=(314,48)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PUBLIC_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template28);

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
  private final static String _jspx_template9 = "\r\n\r\n\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody { \r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n\r\n<script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script> \r\n<script language=\"javascript\" src=\"/js/common.js\"></script> \r\n<script type=\"text/javascript\">\r\n//<![CDATA[\r\n\t           \r\n\tfunction  reSearch()\r\n\t{\r\n\t\tvar w = document.listForm;\r\n\t\t\r\n\t\t//if(!isDate(w.fromDate, \"시작일\")) return;\r\n\t\t//if(!isDate(w.toDate, \"종료일\")) return;\r\n\t\tif(w.fromDate.value > w.toDate.value)\r\n\t\t{ \r\n\t\t\talert(\"시작일자는 종료일자보다 클수없습니다!\");\r\n\t\t\tw.fromDate.select();\r\n\t\t\treturn;\r\n\t\t}\r\n\r\n\t\tw.action = \"/admin/board.do\";\t\t\r\n\t\tw.submit();\t\r\n\t}\r\n\r\n\tfunction deleteRow()\r\n\t{\t\r\n\t\tvar w = document.listForm;\t\r\n\t\tvar rowCount = document.getElementById(\"listSize\").value;\r\n\t\t\r\n\t\tif(!confirm(\"삭제하시겠습니까?\"))\r\n\t\t\treturn;\r\n\t\t \r\n\t\tfor(i=1; i<= rowCount; i++)\r\n\t\t{\t\r\n\t\t\tif(document.getElementById(\"checkbox\"+i).checked)\r\n\t\t\t{  \t\r\n\t\t\t  \tdocument.getElementById(\"deleteSeq\").value = document.getElementById(\"seq\"+i).value;\t\r\n\t\t\t\tw.action = \"/admin/boardDel.do\";\t\r\n\t\t\t\tw.submit();\r\n\t\t\t}\t\t\r\n\t\t}\r\n\t}\r\n\t\r\n\tfunction initPage(){\r\n\t\r\n\t\tif(document.getElementById(\"fromDate\").value == \"\")\r\n\t\t\tdocument.getElementById(\"fromDate\").value = strToday();\r\n\t\t\t\r\n\t\tif(document.getElementById(\"toDate\").value == \"\")\r\n\t\t\tdocument.getElementById(\"toDate\").value = strToday();\r\n\t}\r\n\t\r\n\tfunction strToday()\r\n\t{\r\n\t\tvar date = new Date();\r\n\t\r\n\t \tvar year = date.getFullYear(); \r\n\t \tvar month = date.getMonth() + 1;\r\n\t \tvar day = date.getDate();\r\n\t\r\n\t \tif ((\"\" + month).length==1){month = \"0\"+month;}\r\n\t \tif ((\"\" + day).length==1){day = \"0\"+day;}\r\n\t \r\n\t \treturn year+month+day;\r\n\t}\r\n\t\r\n\t//전체선택\r\n\tfunction fn_allSelect()\t\r\n\t{\r\n\t\tvar w = document.listForm;\t\r\n\t\tvar rowCount = document.getElementById(\"listSize\").value;\r\n\t\t\r\n\t\tif (w.allCheck.checked)\r\n\t\t{\r\n\t\t\tfor(i=1; i<= rowCount; i++)\r\n\t\t\t{\t\r\n\t\t\t\tdocument.getElementById(\"checkbox\"+i).checked = true;\t\r\n\t\t\t}\t\r\n\t\t}\r\n\t\telse\t\t \r\n\t\t{\r\n\t\t\tfor(i=1; i<= rowCount; i++)\r\n\t\t\t{\t\r\n\t\t\t\tdocument.getElementById(\"checkbox\"+i).checked = false;\t\t\t\t\t\r\n\t\t\t}\r\n\t\t}\r\n\t}\r\n\t\r\n\t//숫자만 입력\r\n\tfunction onlyNumberInput()\r\n\t{\t\r\n\t\tvar code = window.event.keyCode;\r\n\t\r\n\t \tif ((code > 34 && code < 41) || (code > 47 && code < 58) || (code > 95 && code < 106) || code == 8 || code == 9 || code == 13 || code == 46)\r\n\t \t{\r\n\t\t  \twindow.event.returnValue = true;\r\n\t\t\treturn;\r\n\t \t}else {\t \r\n\t \t\twindow.event.returnValue = false;\r\n\t \t\treturn;\r\n \t \t}\r\n\t}\r\n\t\r\n\tfunction detail_search(id)\r\n\t{\t\r\n\t\tvar w = document.listForm;\r\n\r\n\t\tw.action = \"/admin/boardDetail.do?seq=\"+id;\t\t\r\n\t\tw.submit();\t\r\n\t}\r\n\t\r\n\t\r\n//]]>\r\n</script>\r\n\r\n<body>\r\n<form name=\"listForm\" method=\"post\" >\r\n\r\n<table width=\"800\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t<tr>\r\n\t\t<td height=\"43\"><img src=\"/img/admin_cont8_title.gif\"\r\n\t\t\twidth=\"800\" height=\"43\"></td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td align=\"center\">\r\n\t\t<table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n<!-- \t\t<tr>\r\n\t\t\t\t<td height=\"40\" align=\"right\">\r\n\t\t\t\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"8\"></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td><a href=\"#\"><img src=\"/img/help_icon.gif\"\r\n\t\t\t\t\t\t\talt=\"도움말\" width=\"65\" height=\"18\" border=\"0\"></a></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n -->\t\t\t\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"1\" bgcolor=\"eaeaea\"></td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"14\"></td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td>\r\n\t\t\t\t<table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td align=\"left\" height=\"22\" background=\"/img/tab_line_blue.gif\">\r\n\t\t\t\t\t\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td><img src=\"/img/sub_admin_title14.gif\" width=\"110\"\r\n\t\t\t\t\t\t\t\t\theight=\"22\"></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td align=\"left\" class=\"contbor";
  private final static String _jspx_template10 = "der_blue\">\r\n\t\t\t\t\t\t\r\n\t\t\t\t\t\t<input name=\"modeType\" type=\"hidden\" value=\"del\"> \r\n\t\t\t\t\t\t<input name=\"deleteSeq\" id=\"deleteSeq\" type=\"hidden\" >\r\n\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\"\r\n\t\t\t\t\t\t\t\t\tstyle=\"border-collapse:collapse;\" cellpadding=\"0\"\r\n\t\t\t\t\t\t\t\t\tcellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"15%\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\"\r\n\t\t\t\t\t\t\t\t\t\t\tclass=\"sub_table_b\">검색내용</td>\r\n\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\"><select\r\n\t\t\t\t\t\t\t\t\t\t\tname=\"gubun\"  class=\"input_form1\" style=\"width:100px\">\r\n\t\t\t\t\t\t\t\t\t\t\t<option>::전체::</option>\r\n\t\t\t\t\t\t\t\t\t\t\t<option value=\"1\">내용</option>\r\n\t\t\t\t\t\t\t\t\t\t\t<option value=\"2\">글제목</option>\r\n\t\t\t\t\t\t\t\t\t\t\t<option value=\"3\">작성자</option>\r\n\t\t\t\t\t\t\t\t\t\t\t<option value=\"4\">파일명</option>\r\n\t\t\t\t\t\t\t\t\t\t</select> <input name=\"content\" type=\"text\" class=\"input_form1\"\r\n\t\t\t\t\t\t\t\t\t\t\tstyle=\"width:120px\" value=\"";
  private final static String _jspx_template11 = "\"></td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"15%\" align=\"center\" bgcolor=\"e5eff8\"\r\n\t\t\t\t\t\t\t\t\t\t\tclass=\"sub_table_b\">작성일</td>\r\n\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\"\r\n\t\t\t\t\t\t\t\t\t\t\tclass=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td><input name=\"fromDate\" id=\"fromDate\" type=\"text\"\r\n\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"input_form1\" style=\"width:80px;ime-mode:disabled\" value=\"";
  private final static String _jspx_template12 = "\" onkeydown=\"onlyNumberInput();\" readonly></td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td><a href=\"#\"><img src=\"/img/calendar_icon.gif\"\r\n\t\t\t\t\t\t\t\t\t\t\t\t\twidth=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, document.getElementById('fromDate'), 'yyyymmdd');\"></a></td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"16\" align=\"center\">~</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td><input name=\"toDate\" id=\"toDate\" type=\"text\"\r\n\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"input_form1\" style=\"width:80px;ime-mode:disabled\" value=\"";
  private final static String _jspx_template13 = "\" onkeydown=\"onlyNumberInput();\" readonly></td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td><a href=\"#\"><img src=\"/img/calendar_icon.gif\"\r\n\t\t\t\t\t\t\t\t\t\t\t\t\twidth=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, document.getElementById('toDate'), 'yyyymmdd');\"></a></td>\r\n\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\"\r\n\t\t\t\t\t\t\t\t\t\t\tclass=\"sub_table_b\">공개여부</td>\r\n\t\t\t\t\t\t\t\t\t\t<td colspan=\"3\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><select\r\n\t\t\t\t\t\t\t\t\t\t\tname=\"certYN\" id=\"certYN\" class=\"input_form1\" style=\"width:180px\">\r\n\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template14 = "\r\n\t\t\t\t\t\t\t\t\t\t</select></td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"40\" align=\"right\"><img\r\n\t\t\t\t\t\t\t\t\tsrc=\"/img/search_icon.gif\" alt=\"조회\" width=\"56\" height=\"18\"\r\n\t\t\t\t\t\t\t\t\tborder=\"0\" onClick=\"javascript:reSearch();\" style=\"cursor:pointer\"></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"30\"></td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td>\r\n\t\t\t\t<table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td align=\"left\" height=\"22\" background=\"/img/tab_line_blue.gif\">\r\n\t\t\t\t\t\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td><img src=\"/img/sub_admin_title2.gif\" width=\"110\"\r\n\t\t\t\t\t\t\t\t\theight=\"22\"></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td align=\"left\" class=\"contborder_blue\">\r\n\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"40\">\r\n\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\"\r\n\t\t\t\t\t\t\t\t\t\t\tclass=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t\t\t<tr>\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td><a href=\"#\"><img src=\"/img/del_icon1.gif\"\r\n\t\t\t\t\t\t\t\t\t\t\t\t\talt=\"삭제\" border=\"0\" onClick=\"javascript:deleteRow();\"></a></td>\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t    <td width=\"100%\" height=\"34\" class=\"sub_stan\" align=\"right\">전체건수 : <span class=\"sub_stan_blue\">";
  private final static String _jspx_template15 = "</span> 건 </td>\r\n\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\"\r\n\t\t\t\t\t\t\t\t\tstyle=\"border-collapse:collapse;\" cellpadding=\"0\"\r\n\t\t\t\t\t\t\t\t\tcellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"5%\" align=\"center\" bgcolor=\"e5eff8\"\r\n\t\t\t\t\t\t\t\t\t\t\tclass=\"sub_table_b\">\r\n\t\t\t\t\t\t\t\t\t\t\t<input name=\"allCheck\" id=\"allCheck\" type=\"checkbox\" value=\"checkbox\" onclick=\"fn_allSelect();\" >\t\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"5%\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\"\r\n\t\t\t\t\t\t\t\t\t\t\tclass=\"sub_table_b\">번호</td>\r\n\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">글제목</td>\r\n\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">작성자</td>\r\n\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">작성일</td>\r\n\t\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">공개여부</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t<input name=\"listSize\" id=\"listSize\" value=\"";
  private final static String _jspx_template16 = "\" type=\"hidden\">\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template17 = "\r\n\t\t\t\t\t\t\t\t\t\t <tr onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\">\r\n\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" height=\"26\">\r\n\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"checkbox";
  private final static String _jspx_template18 = "\" id=\"checkbox";
  private final static String _jspx_template19 = "\" type=\"checkbox\" value=\"checkbox\" >\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input name=\"seq";
  private final static String _jspx_template20 = "\" id=\"seq";
  private final static String _jspx_template21 = "\" value=\"";
  private final static String _jspx_template22 = "\" type=\"hidden\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template23 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\"><a href=\"javascript:detail_search(";
  private final static String _jspx_template24 = ");\" class=\"inqu\">";
  private final static String _jspx_template25 = "</a></td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template26 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template27 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template28 = "</td>\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template29 = "\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"40\" align=\"center\">\r\n\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td align=\"center\">\r\n\t\t\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<!-- 페이징시작 -->";
  private final static String _jspx_template30 = "<!-- 페이징끝 -->\t\r\n\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td align=\"right\"><a href=\"/admin/boardReg.do?modeType=add\"><img\r\n\t\t\t\t\t\t\t\t\t\t\tsrc=\"/img/write_icon.gif\" alt=\"글쓰기\" width=\"56\" height=\"18\"\r\n\t\t\t\t\t\t\t\t\t\t\tborder=\"0\"></a></td>\r\n\t\t\t\t\t\t\t\t\t\t</tr>\t\r\n\t\t\t\t\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n<!-- \t\t<tr>\r\n\t\t\t\t<td height=\"40\" align=\"right\"><a href=\"#\"><img\r\n\t\t\t\t\tsrc=\"/img/result_icon.gif\" alt=\"결과 출력\" width=\"74\" height=\"22\"\r\n\t\t\t\t\tborder=\"0\"></a><a href=\"#\"><img src=\"/img/excel_icon.gif\"\r\n\t\t\t\t\talt=\"EXCEL 변환\" width=\"94\" height=\"22\" border=\"0\"></a></td>\r\n\t\t\t</tr>\r\n -->\r\n\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td height=\"30\"></td>\r\n\t</tr>\r\n</table>\r\n\r\n<script language=\"javascript\">\r\n<!--\r\n\tsetSelectedOption(document.listForm.gubun, \"";
  private final static String _jspx_template31 = "\");\r\n\tsetSelectedOption(document.listForm.certYN, \"";
  private final static String _jspx_template32 = "\");\r\n//-->\r\n</script>     \r\n</form>\r\n</body>\r\n\r\n</html>\r\n\r\n";
}
