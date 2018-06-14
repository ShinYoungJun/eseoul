package jeus_jspwork._jsp._rojum._saewe;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_search_5fpenalty_5filgwal_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(116,73);to=(116,82)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${listCount}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(150,72);to=(150,81)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${listCount}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template15);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_1_fn(pageContext, null)) return;


      out.write(_jspx_template26);
      // jsp code [from=(276,180);to=(276,188)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TAX_DATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      out.write(_jspx_template28);

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
            out.write(_jspx_template12);
            // jsp code [from=(197,73);to=(197,87)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template13);
            // jsp code [from=(198,68);to=(198,77)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template14);

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

  private boolean _jspx_th_c_forEach_1_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:forEach ---- //
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = new org.apache.taglibs.standard.tag.rt.core.ForEachTag();
    _jspx_th_c_forEach_1.setPageContext(pageContext);
    _jspx_th_c_forEach_1.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_1.setVar("board");
    _jspx_th_c_forEach_1.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
        if (_jspx_eval_c_forEach_1 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template16);
            // jsp code [from=(212,44);to=(212,58)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template17);
            // jsp code [from=(215,45);to=(215,61)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OWNER_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template18);
            // jsp code [from=(218,45);to=(218,61)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ROJUM_ADDR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template19);
            // jsp code [from=(221,44);to=(221,59)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.FAILTOPAY}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template20);
            // jsp code [from=(224,44);to=(224,70)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:addDash(board.INDATE)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_0));

            out.write(_jspx_template21);
            // jsp code [from=(227,45);to=(227,61)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.AREA_AFTER}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template22);
            // jsp code [from=(230,27);to=(230,62)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rnic:insertComma2(board.SUM_ADJUST)}",java.lang.String.class , pageContext.getVariableResolver(), _jspx_fnmap_1));

            out.write(_jspx_template23);
            // jsp code [from=(234,75);to=(234,90)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ORG_PRICE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template24);
            // jsp code [from=(238,75);to=(238,90)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.LT_SEL_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template25);

          } while (_jspx_th_c_forEach_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
        }
        if (_jspx_th_c_forEach_1.doEndTag() == Tag.SKIP_PAGE)
          return true;
      } catch (Throwable t) {
        _jspx_th_c_forEach_1.doCatch(t);
      } finally {
        _jspx_th_c_forEach_1.doFinally();
      }
    } finally {
      _jspx_th_c_forEach_1.release();
    }
    return false;
  }

  private static jeus.servlet.jsp.el.FunctionMapperImpl _jspx_fnmap_0;
  private static jeus.servlet.jsp.el.FunctionMapperImpl _jspx_fnmap_1;
  
  static {
    _jspx_fnmap_0 = jeus.servlet.jsp.el.FunctionMapperImpl.getInstance();
    _jspx_fnmap_0.mapFunction("rnic:addDash", main.java.common.util.StringUtil.class, "addDash", new Class[] {java.lang.String.class});

    _jspx_fnmap_1 = jeus.servlet.jsp.el.FunctionMapperImpl.getInstance();
    _jspx_fnmap_1.mapFunction("rnic:insertComma2", main.java.common.util.StringUtil.class, "insertComma2", new Class[] {java.lang.String.class});

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
  private final static String _jspx_template9 = "    \r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html>\r\n    <head>\r\n        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n        <title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n        <style type=\"text/css\">\r\n            <!--\r\n            body {\r\n                margin: 0px;\r\n                background-image: url(/img/left_back.gif);\r\n            }\r\n            #tr_fixed_header\r\n            {\r\n                position: relative;\r\n                top: expression(this.offsetParent.scrollTop);\r\n                z-index: 20;\r\n            }\r\n\r\n            -->\r\n        </style>\r\n        <link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n        <script language=\"javascript\" src=\"/js/common.js\"></script>\r\n        <script language=\"javascript\" src=\"/js/calculation.js\"></script>\r\n        <script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script>\r\n        <script language=\"javascript\" src=\"/js/Ajax_request.js\"></script>\r\n     \t<script language=\"javascript\" src=\"/js/selectItem.js\"></script>\r\n\t\t<script language=\"javascript\" src=\"/js/Check_inputbox.js\"></script>\r\n        <script>\r\n\r\n            function checkKeySearch()\r\n            {\r\n                if(event.keyCode == 13) goSearch();\r\n            }\r\n\r\n\r\n\r\n            function InitPage()\r\n            {\r\n            \tchangeTAXDATE();\r\n            \t\r\n            \tdocument.getElementById(\"SELECT_ALL\").checked = true;\r\n            \t\r\n        \t\tvar select_item = document.getElementsByName(\"SELECT_ITEM\");\r\n        \t\t\r\n\r\n        \t\tfor(var i = 0;i<select_item.length;i++){\r\n        \t\t\tselect_item[i].checked = true;\r\n        \t\t}\r\n            \t\r\n            \t\r\n            }\r\n            \r\n            //부과동작\r\n            function submitBugwa(){\r\n                var form = document.frm;\r\n                \r\n\t\t\t\tdocument.getElementById(\"Bugwa_Ilgwal\").onclick = function(){\r\n\t\t\t\t\talert(\"잠시만 기다리세요.\");\r\n\t\t\t\t};\r\n\r\n\t\t\t\tvar select_item = document.getElementsByName(\"SELECT_ITEM\");\r\n\t\t\t\tvar item_check = document.getElementsByName(\"ITEM_CHECK\");\r\n\t\t\t\tvar gapan_no_arr = document.getElementsByName(\"GAPAN_NO_ARR\");\r\n\t\t\t\tvar count = 0;\r\n\t\t\r\n\t\t\t\tfor(var i = 0 ; i < select_item.length ; i++){\r\n\t\t\t\t\tif(select_item[i].checked == true){\r\n\t\t\t\t\t\titem_check[i].value = select_item[i].checked;\r\n\t\t\t\t\t\tcount++;\r\n\t\t\t\t\t}\r\n\t\t\t\t}\r\n\t\t\t\r\n\t\t\t\tif(count <= 0){\r\n\t\t\t\t\talert(\"처리 대상이 없습니다.\");\r\n\t\t\t\t\treturn;\r\n\t\t\t\t}else{\r\n\t\t\t\t\tif(!confirm('선택하신 사전통지 미납분 '+count+'건에 대해서\\n과태료 부과하시겠습니까?'))\r\n\t\t\t\t\t\treturn;\r\n\t\t\t\t\t\r\n\t\t\t\t\tdocument.getElementById(\"Bugwa_Ilgwal\").onclick = function(){\r\n\t\t\t\t\t\talert(\"잠시만 기다리세요.\");\r\n\t\t\t\t\t};\r\n\t\t\t\t\tform.action = \"/rojum/saewe/search_penalty_ilgwal_prc.do\";\r\n\t\t\t\t\tform.submit();\r\n\t\t\t\t}\r\n\t\t\t\t\r\n\t\t\t\t\r\n            \t\r\n            }\r\n\r\n            function changeTAXDATE(){\r\n                \r\n                //과세날짜, 납기일내일자, 납기후일자 구하기  2009.08.31 pkh\r\n                var taxdate = document.getElementById(\"TAX_DATE\").value;\r\n                document.getElementById(\"INDATE\").value = addDate('d',15,taxdate,'-');\r\n                document.getElementById(\"OVERDATE\").value = addDate('m',1,document.getElementById(\"INDATE\").value,'-');\r\n\r\n            }\r\n            \r\n\t\t    function scrollAll() {\r\n\t\t    \t  document.all.leftDisplay2.scrollTop = document.all.mainDisplay2.scrollTop;\r\n\t\t    \t  document.all.topLine2.scrollLeft = document.all.mainDisplay2.scrollLeft;\r\n\t\t    }\r\n        </script>\r\n    </head>\r\n\r\n    <body onload=\"InitPage()\" >\r\n        <form id=\"frm\" name=\"frm\" method=\"post\">\r\n        \t <div id=\"MSG\" style=\"position:absolute;height:100%;display: none;\">\r\n        \t \t<img src=\"/img/loadingBar.gif\" id=\"MSGValue\">\r\n        \t </div>\r\n\r\n            <input type=\"hidden\" name=\"TOTALCNT\" id=\"TOTALCNT\" value=\"";
  private final static String _jspx_template10 = "\">\r\n            \r\n            <table width=\"780\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n                <tr>\r\n                    <td height=\"43\">\r\n                    \t<img src=\"/img/sub7_cont2_title.gif\" width=\"800\" height=\"43\">\r\n                   \t</td>\r\n                </tr>\r\n                <tr>\r\n                    <td >\r\n                        <table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                            <tr>\r\n                                <td height=\"1\" bgcolor=\"eaeaea\"></td>\r\n                            </tr>\r\n                            <tr>\r\n                                <td height=\"14\"></td>\r\n                            </tr>\r\n                            <tr>\r\n                                <td>\r\n                                    <table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                                        <tr>\r\n                                            <td align=\"left\" height=\"22\" background=\"/img/tab_line_blue.gif\">\r\n                                                <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                                                    <tr>\r\n                                                        <td><img src=\"/img/sub_nopay_title.gif\" width=\"110\" height=\"22\"></td>\r\n                                                    </tr>\r\n                                                </table>\r\n                                            </td>\r\n                                        </tr>\r\n                                        <tr>\r\n                                            <td  class=\"contborder_purple\">\r\n                                                <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                                                    <tr>\r\n                                                        <td height=\"34\" class=\"sub_stan\">\r\n\t\t\t\t\t\t                         \t\t\t전체건수 : <span class=\"sub_stan_blue\">";
  private final static String _jspx_template11 = "</span>건\r\n                                                        </td>\r\n                                                        <td class=\"sub_stan\">\r\n                                                        <font color=\"red\">의견제출이 신청 및 승인일 경우 과태료대상조회에서 제외됩니다.</font>\r\n                                                        </td>\r\n                                                        \r\n                                                    </tr>\r\n                                                    <tr>\r\n                                                        <td colspan=\"2\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table width=\"780px\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" class=\"sub_table\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <TR>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    <TD width=\"110px\"  valign=\"top\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t      <TABLE cellpadding=\"0\" cellspacing=\"0\" border=\"1\" class=\"sub_table\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\">\r\n\t\t\t\t\t\t\t\t\t\t\t                          <tr height=\"28px\" onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t              <td width=\"35px\" height=\"28px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<INPUT TYPE=\"checkbox\" ID=\"SELECT_ALL\" onclick=\"javascript:selectAll(this);\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  </td>\r\n\t\t\t\t\t\t\t\t\t\t\t                          </tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t      </TABLE>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    </TD>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    <TD width=\"754px\" valign=\"top\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t      <DIV id=\"topLine2\" style=\"width:737px;overflow:hidden;\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t        <TABLE width=\"880px\" cellpadding=\"0\" cellspacing=\"0\" border=\"1\" class=\"sub_table\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t          <TR height=\"28px\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t            <td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">관리번호</td>\r\n\t\t\t\t\t\t\t\t\t\t\t                            <td width=\"100px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">운영자명</td>\r\n\t\t\t\t\t\t\t\t\t\t\t                            <td width=\"150px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용지 주소</td>\r\n\t\t\t\t\t\t\t\t\t\t\t                            <td width=\"60px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">초과일수</td>\r\n\t\t\t\t\t\t\t\t\t\t\t                            <td width=\"80px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">납기내일자</td>\r\n\t\t\t\t\t\t\t\t\t\t\t                            <td width=\"60px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">면적(㎡)</td>\r\n\t\t\t\t\t\t\t\t\t\t\t                            <td width=\"90px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">사전통지<br/>감경금액</td>\r\n\t\t\t\t\t\t\t\t\t\t\t                            <td width=\"90px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">과태료<br/>부과금액</td>\r\n\t\t\t\t\t\t\t\t\t\t\t                            <td width=\"150px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">감경대상</td>\r\n\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t          </TR>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t        </TABLE>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t      </DIV>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    </TD>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  </TR>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <TR>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    <TD width=\"26px\" valign=\"top\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t      <DIV id=\"leftDisplay2\" style=\"width:26px;height:337px;overflow:hidden;\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t        <TABLE width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"1\" class=\"sub_table\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\">\r\n\t\t\t\t\t\t\t\t\t\t\t                          ";
  private final static String _jspx_template12 = "\r\n\t\t\t\t\t\t\t\t\t\t\t                          \t<tr height=\"26px\" onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\"\tstyle=\"cursor: pointer\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t  \t\t\t\t\t\t<td width=\"35px\" height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t  \t\t\t\t\t\t\t<INPUT TYPE=\"checkbox\" NAME=\"SELECT_ITEM\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t  \t\t\t\t\t\t\t<INPUT TYPE=\"hidden\" NAME=\"GAPAN_NO_ARR\" value=\"";
  private final static String _jspx_template13 = "\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t  \t\t\t\t\t\t\t<INPUT TYPE=\"hidden\" NAME=\"SEQ_ARR\" value=\"";
  private final static String _jspx_template14 = "\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t  \t\t\t\t\t\t\t<INPUT TYPE=\"hidden\" NAME=\"ITEM_CHECK\" value=\"\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t  \t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t  \t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t                          ";
  private final static String _jspx_template15 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t        </TABLE>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t      </DIV>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    </TD>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    <TD width=\"754px\" valign=\"top\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t      <DIV id=\"mainDisplay2\" style=\"width:754px;height:354px;overflow:scroll;;scrollbar-face-color:#EEF8FB;scrollbar-3dlight-color:#BBBDB6; scrollbar-highlight-color:#EEF8FB;scrollbar-shadow-color:#BBBDB6; scrollbar-darkshadow-color:#EEF8FB;scrollbar-track-color:#EEF8FB;scrollbar-arrow-color:#BBBDB6;\" onscroll=\"scrollAll()\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t        <TABLE width=\"880px\" cellpadding=\"0\" cellspacing=\"0\" border=\"1\" class=\"sub_table\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\">\r\n\t\t\t\t\t\t\t\t\t\t\t                          ";
  private final static String _jspx_template16 = "\r\n\t\t\t\t\t\t\t\t\t\t\t                          <tr height=\"26px\" onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\">\r\n\t\t\t\t\t\t\t\t\t\t\t                          \t  <td width=\"100px\" align=\"center\">\r\n\t\t\t\t\t\t\t\t\t\t\t                          \t  \t";
  private final static String _jspx_template17 = "\r\n\t\t\t\t\t\t\t\t\t\t\t                              </td>\r\n\t\t\t\t\t\t\t\t\t\t\t                              <td width=\"100px\" align=\"center\">\r\n\t\t\t\t\t\t\t\t\t\t\t                              \t";
  private final static String _jspx_template18 = "\r\n\t\t\t\t\t\t\t\t\t\t\t                              </td>\r\n\t\t\t\t\t\t\t\t\t\t\t                              <td width=\"150px\" align=\"center\">\r\n\t\t\t\t\t\t\t\t\t\t\t                              \t";
  private final static String _jspx_template19 = "\r\n\t\t\t\t\t\t\t\t\t\t\t                              </td>\r\n\t\t\t\t\t\t\t\t\t\t\t                              <td width=\"60px\" align=\"center\">\r\n\t\t\t\t\t\t\t\t\t\t\t                             \t";
  private final static String _jspx_template20 = "\r\n\t\t\t\t\t\t\t\t\t\t\t                              </td>\r\n\t\t\t\t\t\t\t\t\t\t\t                              <td width=\"80px\" align=\"center\">\r\n\t\t\t\t\t\t\t\t\t\t\t                             \t";
  private final static String _jspx_template21 = "\r\n\t\t\t\t\t\t\t\t\t\t\t                              </td>\r\n\t\t\t\t\t\t\t\t\t\t\t                              <td width=\"60px\" align=\"center\">\r\n\t\t\t\t\t\t\t\t\t\t\t                              \t";
  private final static String _jspx_template22 = "\r\n\t\t\t\t\t\t\t\t\t\t\t                              </td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  <td width=\"90px\" align=\"center\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t      ";
  private final static String _jspx_template23 = "\r\n\t\t\t\t\t\t\t\t\t\t\t                              </td>\r\n\t\t\t\t\t\t\t\t\t\t\t                              <td width=\"90px\" align=\"center\">\r\n\t\t\t\t\t\t\t\t\t\t\t                              \t<font color=\"red\">\r\n\t                                                                      \t";
  private final static String _jspx_template24 = "\r\n\t\t\t\t\t\t\t\t\t\t\t                              \t</font>\r\n\t\t\t\t\t\t\t\t\t\t\t                              </td>\r\n\t\t\t\t\t\t\t\t\t\t\t                              <td width=\"150px\" align=\"center\">\r\n\t                                                                      \t";
  private final static String _jspx_template25 = "\r\n\t\t\t\t\t\t\t\t\t\t\t                              </td>\r\n\r\n\t\t\t\t\t\t\t\t\t\t\t                          </tr>\r\n\t\t\t\t\t\t\t\t\t\t\t                          ";
  private final static String _jspx_template26 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t        </TABLE>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t      </DIV>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t    </TD>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  </TR>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\r\n                                                        </td>\r\n                                                    </tr>\r\n                                                    <tr height=\"20\">\r\n                                                        <td>\r\n                                                        </td>\r\n                                                    </tr>\r\n                                                    <tr>\r\n                                                        <td align=\"center\" colspan=\"2\">\r\n                                                            <table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n                                                                <tr>\r\n                                                                    <td colspan=\"6\" height=\"26\" align=\"left\"  class=\"sub_table_b\">&nbsp;* 부과 내역</td>\r\n                                                                </tr>\r\n                                                                <tr>\r\n                                                                    <td width=\"100px\" height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">과세구분</td>\r\n                                                                    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\">\r\n                                                                    \t수시분\r\n                                                                    </td>\r\n                                                                    <td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">세목코드</td>\r\n                                                                    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\" align=\"left\">\r\n\t\t\t\t\t                                                \t[구일반]도로법위반과태료\r\n                                                                    </td>\r\n                                                                </tr>\r\n                                                                <tr>\r\n                                                                    <td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">과세일자</td>\r\n                                                                    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" align=\"left\">\r\n                                                                        <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n                                                                            <tr>\r\n                                                                                <td>\r\n                                                                                    <input name=\"TAX_DATE\" id=\"TAX_DATE\" type=\"text\" class=\"essential\" style=\"width:80px\" value=\"";
  private final static String _jspx_template27 = "\" onfocus=\"changeTAXDATE();\" onselect=\"changeTAXDATE();\">\r\n                                                                                </td>\r\n                                                                                <td>\r\n                                                                                    <a>\r\n                                                                                        <img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, document.getElementById('TAX_DATE'), 'yyyymmdd')\" style=\"CURSOR: Hand;\">\r\n                                                                                    </a>\r\n                                                                                </td>\r\n                                                                            </tr>\r\n                                                                        </table>\r\n                                                                    </td>\r\n\r\n\r\n                                                                    <td width=\"100\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">납기일자</td>\r\n                                                                    <td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\" align=\"left\">\r\n                                                                        <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n                                                                            <tr>\r\n                                                                                <td>\r\n                                                                                \t납기내일자&nbsp;:&nbsp;<input name=\"INDATE\" id=\"INDATE\" type=\"text\" class=\"essential\" style=\"width:80px\" value=\"\" onFocus=\"\" readonly>\r\n                                                                               \t</td>\r\n                                                                                <td>\r\n                                                                                \t<a>\r\n                                                                                \t\t<img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, INDATE, 'yyyymmdd')\" style=\"CURSOR: Hand;\">\r\n                                                                                \t</a>\r\n                                                                               \t</td>\r\n                                                                                <td>\r\n                                                                                \t&nbsp;/&nbsp;납기후일자&nbsp;:&nbsp;<input name=\"OVERDATE\" id=\"OVERDATE\" type=\"text\" class=\"essential\" style=\"width:80px\" value=\"\" readonly>\r\n                                                                               \t</td>\r\n                                                                                <td>\r\n                                                                                \t<a>\r\n                                                                                \t\t<img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" onclick=\"popUpCalendar(this, OVERDATE, 'yyyymmdd')\" style=\"CURSOR: Hand;\">\r\n                                                                               \t\t</a>\r\n                                                                           \t\t</td>\r\n                                                                            </tr>\r\n                                                                        </table>\r\n                                                                    </td>\r\n                                                                </tr>\r\n                                                            </table>\r\n                                                        </td>\r\n                                                    </tr>\r\n                                                    <tr>\r\n                                                        <td height=\"40\" align=\"right\" colspan=\"2\">\r\n           ";
  private final static String _jspx_template28 = "                                                 <table border=\"0\" width=\"100%\">\r\n                                                                <tr>\r\n                                                                    <td height=\"40\" align=\"right\">\r\n                                                                        <img src=\"/img/levy_icon2.gif\" name=\"Bugwa_Ilgwal\" id=\"Bugwa_Ilgwal\" alt=\"부과\" width=\"56\" height=\"18\" border=\"0\" onClick=\"javascript:submitBugwa();\" style=\"cursor:pointer\" >\r\n                                                                        <img src=\"/img/can_icon.gif\" alt=\"취소\" border=\"0\" onclick=\"javascript:history.back();\" style=\"cursor:pointer\" >\r\n                                                                    </td>\r\n                                                                </tr>\r\n                                                            </table>\r\n                                                        </td>\r\n                                                    </tr>\r\n                                                </table>\r\n                                            </td>\r\n                                        </tr>\r\n                                    </table>\r\n                                </td>\r\n                            </tr>\r\n                            <tr>\r\n                                <td height=\"30\">\r\n\r\n                                </td>\r\n                            </tr>\r\n                        </table>\r\n\r\n                    </td>\r\n                </tr>\r\n            </table>\r\n        </form>\r\n    </body>\r\n\r\n</html>\r\n\r\n";
}
