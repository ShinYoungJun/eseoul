package jeus_jspwork._jsp._gapan._statistics;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_all_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(131,26);to=(131,34)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${siguCode}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(136,9);to=(136,17)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${siguCode}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(188,110);to=(188,118)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${fromDate}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(190,109);to=(190,115)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${toDate}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template17);

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
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${guCdList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("list");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template14);
            // jsp code [from=(200,31);to=(200,41)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.GU_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template15);
            // jsp code [from=(200,46);to=(200,56)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.GU_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template16);

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
  private final static String _jspx_template9 = "\r\n<html>\r\n    <head>\r\n        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n        <title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n        <style type=\"text/css\">\r\n            <!--\r\n            body {\r\n                margin: 0px;\r\n                background-image: url(/img/left_back.gif);\r\n            }\r\n            -->\r\n        </style>\r\n        <link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n<script language=\"javascript\" src=\"/js/common.js\"></script>\r\n<script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script>\r\n<script language=\"javascript\" src=\"/js/Check_inputbox.js\"></script>\r\n<script language=\"javascript\" src=\"/jsp/RexServer/rexscript/rexpert.js\"></script>\r\n<script language=\"javascript\" src=\"/jsp/RexServer/rexscript/rexpert_properties.js\"></script>\r\n<script language=\"javascript\">\r\n<!--\r\n\tfunction fnPreView()\r\n\t{\t\r\n\t\tvar oRptMainParam;\r\n\t\toRptMainParam = rex_GetgoDictionay(); \r\n\r\n\r\n\t\t//********** BEGIN_현진_20120322\r\n\t\t var screenHeight = screen.availHeight;\r\n         var screenWidth = 1024;\r\n\t\t//********** END_현진_20120322\r\n\r\n\t\t// 필수 - 데이터 타입 설정\r\n\t\toRptMainParam.put(\"rex_datatype\", \"XML\");  // XML, CSV\r\n\r\n\t\t// 옵션 - 다른 DB를 연결시\r\n\t\toRptMainParam.put(\"rex_userservice\", \"oracle_jndi\");\r\n\t\t// 옵션 - 파라메터 설정\r\n\t\t\r\n\t\tvar fromDate = document.getElementById(\"fromDate\").value;\r\n\t\tvar toDate = document.getElementById(\"toDate\").value;\r\n\t\tvar siguCd = document.getElementById(\"guCd\").value;\r\n\r\n\t\t\r\n\t\tvar obj = document.getElementsByName(\"SEARCH_TYPE\");\r\n\r\n\t\tfromDate = nr_Date_Cut(fromDate);\t\r\n\t\ttoDate   = nr_Date_Cut(toDate);\r\n\r\n\t\tif(siguCd == '000'){\r\n\t\t\tsiguCd = '%';\r\n\t\t\t// 필수 - 레포트명\r\n\t\t\toRptMainParam.put(\"rex_rptname\", \"gapan_statics_all\");\r\n\r\n\t\t}else{\r\n\t\t\t// 필수 - 레포트명\r\n\t\t\toRptMainParam.put(\"rex_rptname\", \"gapan_statics\");\r\n\t\t}\r\n\r\n\t\t\toRptMainParam.put(\"FROM_DATE\", fromDate);\r\n\t\t\toRptMainParam.put(\"TO_DATE\", toDate);\r\n\r\n\t\toRptMainParam.put(\"SIGU_CD\", siguCd);\r\n\r\n\t\toRptMainParam.put(\"rex_init\", \"ToolBarVisible=1;ShowProcessDialog=0\");\r\n\t\t\r\n\t\t//********** BEGIN_현진_20120322\r\n\t\t//oRptMainParam.put(\"rex_open_window\", \"center=no,scrollbars=no,status=no,toolbar=no,resizable=0,location=no,menu=no,width=100%,height=2734\");\r\n\t\toRptMainParam.put(\"rex_open_window\", \"center=no,scrollbars=no,status=no,toolbar=no,resizable=0,location=no,menu=no,width=\"+screenWidth+\",height=\"+screenHeight);\r\n\t\trex_gfRexRptOpen(\"popup\", oRptMainParam);\r\n\t\t//********** END_현진_20120322\r\n\r\n\t\treturn oRptMainParam;\r\n\t\t\t\t\r\n\t}\r\n\r\n\tfunction fnPreView2()\r\n\t{\t\r\n\tvar oRptMainParam;\r\n\toRptMainParam = rex_GetgoDictionay(); \r\n\r\n\t//********** BEGIN_현진_20120322\r\n\tvar screenHeight = screen.availHeight;\r\n    var screenWidth = 1024;\r\n\t//********** END_현진_20120322\r\n\t\r\n\t// 필수 - 레포트명\r\n\toRptMainParam.put(\"rex_rptname\", \"rojum_owner_sum\");\r\n\r\n\t// 필수 - 데이터 타입 설정\r\n\toRptMainParam.put(\"rex_datatype\", \"XML\");  // XML, CSV\t\r\n\r\n\t// 옵션 - 다른 DB를 연결시\r\n\toRptMainParam.put(\"rex_userservice\", \"oracle_jndi\");\r\n\r\n\toRptMainParam.put(\"rex_init\", \"ToolBarVisible=1;ShowProcessDialog=0\");\t\r\n\t//********** BEGIN_현진_20120322\t\r\n\t//oRptMainParam.put(\"rex_open_window\", \"center=no,scrollbars=no,status=no,toolbar=no,resizable=0,location=no,menu=no,width=100%,height=100%\");\r\n\toRptMainParam.put(\"rex_open_window\", \"center=no,scrollbars=no,status=no,toolbar=no,resizable=0,location=no,menu=no,width=\"+screenWidth+\",height=\"+screenHeight);\r\n\trex_gfRexRptOpen(\"popup\", oRptMainParam);\r\n\t//********** END_현진_20120322\r\n\t\r\n\treturn oRptMainParam;\r\n\t\t\t\r\n}\r\n\tfunction fn_search(obj)\r\n\t{\t\r\n\t\tif(obj == '1'){\r\n\t\t\t//********** BEGIN_현진_20120322\r\n\t\t\t//rex_gfRexRptOpen(\"iframepush\", ifrmRexPreview, fnPreView());\r\n\t\t\t//rex_gfRexRptOpen(\"iframeall\", \"\", \"\");\r\n\t\t\tfnPreView();\r\n\t\t\t//********** END_현진_20120322\t\t\t\r\n\t\t}else{\r\n\t\t\t//********** BEGIN_현진_20120322\t\t\t\r\n\t\t\t//rex_gfRexRptOpen(\"iframepush\", ifrmRexPreview, fnPreView2());\r\n\t\t\t//rex_gfRexRptOpen(\"iframeall\", \"\", \"\");\r\n\t\t\tfnPreView2();\r\n\t\t\t//********** END_현진_20120322\r\n\t\t}\t\t\r\n\t}\r\n\r\n\tfunction init()\r\n\t{\r\n\t\tvar gu_cd = document.getElementById(\"guCd\");\r\n\t\tvar obj = gu_cd.options;\r\n\r\n\t\tfor(var i = 0 ; i < obj.length ; i++){\r\n\t\t\tif(obj[i].value == '";
  private final static String _jspx_template10 = "'){\r\n\t\t\t\tobj[i].selected = true;\r\n\t\t\t}\r\n\t\t}\r\n\r\n\t\tif('";
  private final static String _jspx_template11 = "' != '000'){\r\n\t\t\tgu_cd.disabled=\"disabled\";\r\n\t\t}\r\n\r\n\t}\r\n\r\n  \t\t    \r\n-->\r\n</script>\r\n</head>\r\n\r\n<body onload=\"init();\">\r\n<form name=\"form\" method=\"post\">\r\n<table width=\"800\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t<tr>\r\n\t\t<td height=\"43\"><img src=\"/img/sub4_cont1_title.gif\" width=\"800\" height=\"43\"></td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td align=\"left\">\r\n\t\t<table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"1\" bgcolor=\"eaeaea\"></td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"14\"></td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td>\r\n\t\t\t\t<table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"22\" background=\"/img/tab_line_blue.gif\">\r\n\t\t\t\t\t\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td><img src=\"/img/sub_stat_title1.gif\" alt=\"통계설정\" width=\"110\" height=\"22\"></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td align=\"left\" class=\"contborder_blue\">\r\n\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse: collapse;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t                                    <td height=\"26\" align=\"left\" colspan=\"2\">\r\n\t                                        <span class=\"sub_stan_blue\">&nbsp; * 가로정비 결과 조회 </span>\r\n\t                                    </td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"100px\" height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">위반일자</td>\r\n\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t<input id=\"fromDate\" name=\"fromDate\" type=\"text\" class=\"input_form1\" style=\"width: 70px\" value=\"";
  private final static String _jspx_template12 = "\">\r\n\t\t\t\t\t\t\t\t\t\t\t<img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" align=\"absmiddle\" onclick=\"popUpCalendar(this, document.getElementById('fromDate'), 'yyyymmdd')\" style=\"CURSOR: Hand;\">\r\n\t\t\t\t\t\t\t\t\t\t\t ~ <input id=\"toDate\" name=\"toDate\" type=\"text\" class=\"input_form1\" style=\"width: 70px\" value=\"";
  private final static String _jspx_template13 = "\">\r\n\t\t\t\t\t\t\t\t\t\t\t<img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" align=\"absmiddle\" onclick=\"popUpCalendar(this, document.getElementById('toDate'), 'yyyymmdd')\" style=\"CURSOR: Hand;\">\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"100px\" height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">시군구별</td>\r\n\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t\t\t\t\t\t\t<select id=\"guCd\" name=\"guCd\" class=\"input_form1\" style=\"width:100px\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template14 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"";
  private final static String _jspx_template15 = "\">";
  private final static String _jspx_template16 = "</option>\r\n\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template17 = "\r\n\t\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t                                    <td height=\"26px\" align=\"right\"  colspan=\"2\">\r\n\t\t                                    <img src=\"/img/inquiry_icon2.gif\" alt=\"검색\" width=\"56\" height=\"18\" onclick=\"fn_search(1);\"  border=\"0\" style=\"cursor:pointer;\">\r\n\t                                    </td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\r\n\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"30\"></td>\r\n\t\t\t</tr>\r\n<!--  //********** BEGIN_현진_20120322 -->\r\n<!-- \r\n\t\t\t<tr>\r\n\t\t\t\t<td>\r\n\t\t\t\t<table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"22\" background=\"/img/tab_line_purple.gif\">\r\n\t\t\t\t\t\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td onClick=\"DisplayMenu(1)\" width=\"111\">\r\n\t\t\t\t\t\t\t\t\t<a href=\"#\">\r\n\t\t\t\t\t\t\t\t\t\t<img src=\"/img/sub_stat_title2_on.gif\" alt=\"통계 결과\" width=\"110\" height=\"22\" border=\"0\">\r\n\t\t\t\t\t\t\t\t\t</a>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td align=\"center\" class=\"contborder_purple\">\r\n\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse: collapse;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t<iframe id=\"ifrmRexPreview\" width=\"100%\" height=\"350\" frameborder=0 scrolling=no></iframe>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n-->\r\n<!--   //********** END_현진_20120322 -->\t\t\t\r\n\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n</table>\r\n</form>\r\n\r\n</body>\r\n</html>\r\n\r\n";
}
