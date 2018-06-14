package jeus_jspwork._jsp._rojum._statistics;

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
      out.write(_jspx_template10);
      // jsp code [from=(250,57);to=(250,65)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${siguCode}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(251,61);to=(251,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${siguCode}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(253,10);to=(253,18)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${siguCode}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(258,61);to=(258,68)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${YearVal}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(268,27);to=(268,34)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${YearVal}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(362,106);to=(362,114)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${fromDate}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template20);
      // jsp code [from=(413,110);to=(413,118)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${fromDate}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(415,157);to=(415,163)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${toDate}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(421,124);to=(421,132)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${fromDate}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(423,125);to=(423,131)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${toDate}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_1_fn(pageContext, null)) return;


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
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${guCdList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("list");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template17);
            // jsp code [from=(372,31);to=(372,41)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.GU_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template18);
            // jsp code [from=(372,46);to=(372,56)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.GU_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template19);

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
    _jspx_th_c_forEach_1.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${guCdList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_1.setVar("list");
    try {
      try {
        int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
        if (_jspx_eval_c_forEach_1 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template25);
            // jsp code [from=(434,31);to=(434,41)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.GU_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template26);
            // jsp code [from=(434,46);to=(434,56)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.GU_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template27);

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

  private final static String _jspx_template0 = "\r\n";
  private final static String _jspx_template1 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('사용자의 사용시간이 종료되었습니다. 다시 접속 해주시기 바랍니다.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template2 = "\r\n";
  private final static String _jspx_template3 = "\r\n";
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "  \r\n";
  private final static String _jspx_template6 = "  \r\n";
  private final static String _jspx_template7 = "\r\n";
  private final static String _jspx_template8 = "\r\n";
  private final static String _jspx_template9 = "\r\n<html>\r\n    <head>\r\n        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n        <title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n        <style type=\"text/css\">\r\n            <!--\r\n            body {\r\n                margin: 0px;\r\n                background-image: url(/img/left_back.gif);\r\n            }\r\n            -->\r\n        </style>\r\n        <link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n\t\t<script language=\"javascript\" src=\"/js/common.js\"></script>\r\n\t\t<script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script>\r\n\t\t<script language=\"javascript\" src=\"/js/Check_inputbox.js\"></script>\r\n\t\t<script language=\"javascript\" src=\"/jsp/RexServer/rexscript/rexpert.js\"></script>\r\n\t\t<script language=\"javascript\" src=\"/jsp/RexServer/rexscript/rexpert_properties.js\"></script>\r\n\t\t<script language=\"javascript\">\r\n\t\tfunction fnPreView0()\r\n\t\t{\t\r\n\t\t\t var oRptMainParam;\r\n             oRptMainParam = rex_GetgoDictionay(); \r\n             \r\n             var screenHeight = screen.availHeight;\r\n             var screenWidth = 1024;\r\n\r\n             // 옵션 - viewer\t\r\n             oRptMainParam.put(\"rex_open_window\", \"center=yes,scrollbars=no,status=no,toolbar=no,resizable=0,location=no,menu=no,width=\"+screenWidth+\",height=\"+screenHeight);\r\n\t\r\n             // 필수 - 데이터 타입 설정\r\n             oRptMainParam.put(\"rex_datatype\", \"XML\");  // XML, CSV\r\n\r\n             // 옵션 - 다른 DB를 연결시\r\n             oRptMainParam.put(\"rex_userservice\", \"oracle_jndi\");\r\n\r\n\t\t\t\r\n\t\t\tvar toDate = nr_Date_Cut(document.getElementById(\"TODATE\").value);\r\n\t\t\tvar fix_siguCd = document.getElementById(\"fix_guCd\").value;\r\n\t\r\n\t\t\t\r\n\t\t\tif(fix_siguCd == '000'){\r\n\t\t\t\tfix_siguCd = '';\r\n\t\t\t\t// 필수 - 레포트명\r\n\t\t\t\toRptMainParam.put(\"rex_rptname\", \"rojum_fix_stat\");\r\n\t\r\n\t\t\t}else{\r\n\t\t\t\t// 필수 - 레포트명\r\n\t\t\t\toRptMainParam.put(\"rex_rptname\", \"rojum_fix_stat\");\r\n\t\t\t}\r\n\t\r\n\t\t\toRptMainParam.put(\"TODATE\", toDate);\r\n\t\t\toRptMainParam.put(\"SIGU_CD\", fix_siguCd);\r\n\t\r\n            // preview 팝업 열기\r\n            rex_gfRexRptOpen(\"popup\", oRptMainParam);\r\n\t\r\n            return oRptMainParam;\r\n\t\t}\r\n\t\t\r\n\t\t\r\n\t\tfunction fnPreView1()\r\n\t\t{\t\r\n\t\t\tvar isPickup = document.getElementById('pickupChk').checked; //수거일이 체크되어있는지\r\n\t\t\tvar oRptMainParam;\r\n            oRptMainParam = rex_GetgoDictionay(); \r\n\r\n            var screenHeight = screen.availHeight;\r\n            var screenWidth = 1024;\r\n\r\n            // 옵션 - viewer\t\r\n            oRptMainParam.put(\"rex_open_window\", \"center=yes,scrollbars=no,status=no,toolbar=no,resizable=0,location=no,menu=no,width=\"+screenWidth+\",height=\"+screenHeight);\r\n            // 필수 - 데이터 타입 설정\r\n            oRptMainParam.put(\"rex_datatype\", \"XML\");  // XML, CSV\r\n\r\n            // 옵션 - 다른 DB를 연결시\r\n            oRptMainParam.put(\"rex_userservice\", \"oracle_jndi\");\r\n\t\t\t// 옵션 - 파라메터 설정\r\n\t\t\t\r\n\t\t\tvar fromDate = document.getElementById(\"fromDate\").value;\r\n\t\t\t//********** BEGIN_현진_20120201_수정_1\r\n\t\t\t// INPUTBOX ID 가 toDate 로  중복설정되어있는 것을 수정\r\n\t\t\tvar toDate = document.getElementById(\"toDate2\").value;\r\n\t\t\t//********** END_현진_20120201_수정_1 \r\n\t\t\tvar siguCd = document.getElementById(\"guCd\").value;\r\n\r\n\t\t\tvar pickup_fromdate = nr_Date_Cut(document.getElementById(\"pickup_fromDate\").value);\r\n\t\t\tvar pickup_todate = nr_Date_Cut(document.getElementById(\"pickup_toDate2\").value);\r\n\t\t\t\t\t\t\r\n\t\t\tvar obj = document.getElementsByName(\"SEARCH_TYPE\");\r\n\t\t\tvar searchType;\r\n\t\t\tfor(var i = 0 ;i < obj.length ; i++){\r\n\t\t\t\tif(obj[i].checked){\r\n\t\t\t\t\tsearchType = obj[i].value;\r\n\t\t\t\t}\r\n\t\t\t}\r\n\t\r\n\t\t\tvar quarter = document.getElementById(\"QUARTER\").value;\r\n\t\t\tvar year  = document.getElementById(\"YEAR\").value;\r\n\t\t\t//********** BEGIN_현진_20120201_수정_2\r\n\t\t\t// PERIOD 파라미터에 날짜 넘길 때 - 같이 넘기기 위해서 변수에 재저장\r\n\t\t\t// PERIOD 파라미터에 분기 또는 날짜데이터를 넘김\r\n\t\t\tvar fromDate2 = fromDate;\r\n\t\t\tvar toDate2 = toDate;\t\r\n\t\t\tfromDate = nr_Date_Cut(fromDate);\t\r\n\t\t\ttoDate   = nr_Date_Cut(toDate);\r\n\t\t\t//********** END_현진_20120201_수정_2 \r\n\t\t\t\r\n\t\t\tif(isPickup) {\r\n\t\t\t\tif(siguCd == '000'){\r\n\t\t\t\t\tsiguCd = '';\r\n\t\t\t\t\t// 필수 - 레포트명\r\n\t\t\t\t\toRptMainParam.put(\"rex_rptname\", \"rojum_pickup_all\");\r\n\t\t\r\n\t\t\t\t}else{\r\n\t\t\t\t\t// 필수 - 레포트명\r\n\t\t\t\t\toRptMainParam.put(\"rex_rptnam";
  private final static String _jspx_template10 = "e\", \"rojum_pickup\");\r\n\t\t\t\t}\r\n\t\t\t} else {\r\n\t\t\t\tif(siguCd == '000'){\r\n\t\t\t\t\tsiguCd = '';\r\n\t\t\t\t\t// 필수 - 레포트명\r\n\t\t\t\t\toRptMainParam.put(\"rex_rptname\", \"rojum_statics_all\");\r\n\t\t\r\n\t\t\t\t}else{\r\n\t\t\t\t\t// 필수 - 레포트명\r\n\t\t\t\t\toRptMainParam.put(\"rex_rptname\", \"rojum_statics\");\r\n\t\t\t\t}\r\n\t\t\t}\r\n\r\n\t\t\tif(searchType == '0'){\t\t\t\t\r\n\t\t\t\tif(quarter == '1'){\r\n\t\t\t\t\toRptMainParam.put(\"TOTAL_FROM_DATE\", year+\"0101\");\r\n\t\t\t\t\toRptMainParam.put(\"FROM_DATE\", year+\"0101\");\r\n\t\t\t\t\toRptMainParam.put(\"TO_DATE\", year+\"0331\");\t\t\r\n\t\t\t\t}else if(quarter == '2'){\r\n\t\t\t\t\toRptMainParam.put(\"TOTAL_FROM_DATE\", year+\"0101\");\r\n\t\t\t\t\toRptMainParam.put(\"FROM_DATE\", year+\"0401\");\r\n\t\t\t\t\toRptMainParam.put(\"TO_DATE\", year+\"0630\");\r\n\t\t\t\t}else if(quarter == '3'){\r\n\t\t\t\t\toRptMainParam.put(\"TOTAL_FROM_DATE\", year+\"0101\");\r\n\t\t\t\t\toRptMainParam.put(\"FROM_DATE\", year+\"0701\");\r\n\t\t\t\t\toRptMainParam.put(\"TO_DATE\", year+\"0930\");\r\n\t\t\t\t}else if(quarter == '4'){\r\n\t\t\t\t\toRptMainParam.put(\"TOTAL_FROM_DATE\", year+\"0101\");\r\n\t\t\t\t\toRptMainParam.put(\"FROM_DATE\", year+\"1001\");\r\n\t\t\t\t\toRptMainParam.put(\"TO_DATE\", year+\"1231\");\r\n\t\t\t\t}\r\n\t\t\t\t//********** BEGIN_현진_20120201_수정_2_1\r\n\t\t\t\toRptMainParam.put(\"PERIOD\",\"(\"+quarter+\"/4분기\"+\")\");\r\n\t\t\t\t//********** END_현진_20120201_수정_2_1\r\n\t\t\t}else if(searchType == '1'){\r\n\t\t\t\t//********** BEGIN_현진_20120201_수정_2_2\r\n\t\t\t\t// TOTAL_FROM_DATE 에 필요한 year를 fromDate에서 재추출\r\n\t\t\t\tif(fromDate.length >= 4){\r\n\t\t\t\t\tyear\t= fromDate.substr(0, 4);\r\n\t\t\t\t}\t\t\t\t\r\n\t\t\t\t//********** END_현진_20120201_수정_2_2\r\n\t\t\t\toRptMainParam.put(\"TOTAL_FROM_DATE\", year+\"0101\");\r\n\t\t\t\toRptMainParam.put(\"FROM_DATE\", fromDate);\r\n\t\t\t\toRptMainParam.put(\"TO_DATE\", toDate);\r\n\t\t\t\t//********** BEGIN_현진_20120201_수정_2_3\r\n\t\t\t\toRptMainParam.put(\"PERIOD\", \"(\" +fromDate2 + \"~\" +toDate2+ \")\");\r\n\t\t\t\t//********** END_현진_20120201_수정_2_3\r\n\t\t\t}else if(searchType == '2'){\r\n\t\t\t\t//********** BEGIN_현진_20120201_수정_2_2\r\n\t\t\t\t// TOTAL_FROM_DATE 에 필요한 year를 fromDate에서 재추출\r\n\r\n\t\t\t\tif(fromDate.length >= 4){\r\n\t\t\t\t\tyear\t= pickup_fromdate.substr(0, 4);\r\n\t\t\t\t}\r\n\t\t\t\t\r\n\t\t\t\toRptMainParam.put(\"TOTAL_FROM_DATE\", year+\"0101\");\r\n\r\n\t\t\t\toRptMainParam.put(\"FROM_DATE\", '');\r\n\t\t\t\toRptMainParam.put(\"TO_DATE\", '');\r\n\t\t\t\t\r\n\t\t\t\t/* 201401007 kny 단속기간 검색 */\r\n\t\t\t\toRptMainParam.put(\"PICKUP_FROM_DATE\", pickup_fromdate);\r\n\t\t\t\toRptMainParam.put(\"PICKUP_TO_DATE\", pickup_todate);\r\n\t\t\t}\r\n\r\n\r\n\t\t\toRptMainParam.put(\"SIGU_CD\", siguCd);\r\n\t\r\n            // preview 팝업 열기\r\n            rex_gfRexRptOpen(\"popup\", oRptMainParam);\r\n\t\r\n            return oRptMainParam;\r\n\t\t\t\t\t\r\n\t\t}\r\n\t\r\n\t\tfunction fnPreView2()\r\n\t\t{\t\r\n\t\t\tvar oRptMainParam;\r\n            oRptMainParam = rex_GetgoDictionay(); \r\n\r\n            var screenHeight = screen.availHeight;\r\n            var screenWidth = 1024;\r\n\r\n            // 옵션 - viewer\t\r\n            oRptMainParam.put(\"rex_open_window\", \"center=yes,scrollbars=no,status=no,toolbar=no,resizable=0,location=no,menu=no,width=\"+screenWidth+\",height=\"+screenHeight);\r\n            // 필수 - 데이터 타입 설정\r\n            oRptMainParam.put(\"rex_datatype\", \"XML\");  // XML, CSV\r\n\r\n            // 옵션 - 다른 DB를 연결시\r\n            oRptMainParam.put(\"rex_userservice\", \"oracle_jndi\");\r\n            \r\n\t\t\tvar siguCd = document.getElementById(\"guCd\").value;\r\n\t\t\t//********** BEGIN_현진_20120317\r\n\t\t\tvar SURVEY_YEAR = document.getElementById(\"SURVEY_YEAR\").value;\r\n\t\t\t//********** END_현진_20120317\r\n\t\t\t\r\n\t\t\tif(siguCd == '000')\r\n\t\t\t\tsiguCd = '';\r\n\t\t\t\r\n\t\t\toRptMainParam = rex_GetgoDictionay(); \r\n\t\t\r\n\t\t\t// 필수 - 레포트명\r\n\t\t\toRptMainParam.put(\"rex_rptname\", \"rojum_owner_sum\");\r\n\t\t\t//********** BEGIN_현진_20120317\r\n\t\t\toRptMainParam.put(\"SURVEY_YEAR\", SURVEY_YEAR);\r\n\t\t\t//********** END_현진_20120317\r\n\t\t\t\r\n            // preview 팝업 열기\r\n            rex_gfRexRptOpen(\"popup\", oRptMainParam);\r\n\t\r\n            return oRptMainParam;\r\n\t\t\t\t\r\n\t\t}\r\n\t\t\r\n\t\tfunction fn_search(obj)\r\n\t\t{\r\n\t\t\tif(obj == '0'){\r\n\t\t\t\tfnPreView0();\r\n\t\t\t}else if(obj == '1'){\r\n\t\t\t\tfnPreView1();\r\n\t\t\t}else if(obj == '2'){\r\n\t\t\t\tfnPreView2();\r\n\t\t\t}\t\t\r\n\t\t}\r\n\t\r\n\t\tfunction init()\r\n\t\t{\r\n\t\t\tsetYear();\r\n\t\t\t\r\n\t\t\tsetSelectedOption(document.getElementById(\"guCd\"),'";
  private final static String _jspx_template11 = "');\r\n\t\t\tsetSelectedOption(document.getElementById(\"fix_guCd\"),'";
  private final static String _jspx_template12 = "');\r\n\t\r\n\t\t\tif('";
  private final static String _jspx_template13 = "' != '000'){\r\n\t\t\t\tdocument.getElementById(\"guCd\").disabled=\"disabled\";\r\n\t\t\t\tdocument.getElementById(\"fix_guCd\").disabled=\"disabled\";\r\n\t\t\t}\r\n\t\t\t//********** BEGIN_현진_20120317\r\n\t        setYear2(document.getElementById(\"SURVEY_YEAR\"),\"";
  private final static String _jspx_template14 = "\");\r\n\t        //********** END_현진_20120317\r\n\t\t\t\r\n\t\t}\r\n\t\r\n\t  \tfunction setYear()\r\n\t    {\r\n\t        now = new Date();\r\n\t        Y = now.getFullYear();\r\n\t\r\n\t        var strYear = \"";
  private final static String _jspx_template15 = "\";\r\n\t\r\n\t        for(var i = 0 ; i < 10 ; i++){\r\n\t            newItem = new Option(i);\r\n\t            document.getElementById(\"YEAR\").options[i]  = newItem;\r\n\t            document.getElementById(\"YEAR\").options[i].text = Y-i;\r\n\t            document.getElementById(\"YEAR\").options[i].value = Y-i;\r\n\t            if(strYear == Y-i) document.getElementById(\"YEAR\").options[i].selected = true;\r\n\t        }\r\n\t\r\n\t        document.getElementById(\"YEAR\").options.value = strYear;\r\n\t      \r\n\t    }\r\n\r\n\t  //********** BEGIN_현진_20120317\r\n\t  function setYear2(obj,strYear)\r\n\t\t{\r\n\t\t    now = new Date();\r\n\t\t    Y = now.getFullYear();\r\n\t\t    \r\n\t\t    if(strYear == '' || strYear == null){\r\n\t\t    \tstrYear = Y;\r\n\t\t    }\r\n\t\t\r\n\t\t    for(var i = 0 ; i < 10 ; i++){\r\n\t\t        newItem = new Option(i);\r\n\t\t        obj.options[i]  = newItem;\r\n\t\t        obj.options[i].text = Y+1-i;\r\n\t\t        obj.options[i].value = Y+1-i;\r\n\t\t        if(strYear == Y+1-i) obj.options[i].selected = true;\r\n\t\t    }\r\n\t\t}\r\n\t  //********** END_현진_20120317\r\n\t  \r\n\t    function changeSearchType(val)\r\n\t    {\r\n\t        if(val == '0'){\r\n\t\t\t\tdocument.getElementById(\"TYPE_QUARTER\").style.display = \"block\";\r\n\t\t\t\tdocument.getElementById(\"TYPE_GIGAN\").style.display = \"none\";\r\n\t\t\t\tdocument.getElementById(\"TYPE_PICKUP\").style.display = \"none\";\r\n\t        }else if(val == '1'){\r\n\t\t\t\tdocument.getElementById(\"TYPE_QUARTER\").style.display = \"none\";\r\n\t\t\t\tdocument.getElementById(\"TYPE_GIGAN\").style.display = \"block\";\r\n\t\t\t\tdocument.getElementById(\"TYPE_PICKUP\").style.display = \"none\";\r\n\t        }else if(val == '2'){\r\n\t        \tdocument.getElementById(\"TYPE_QUARTER\").style.display = \"none\";\r\n\t\t\t\tdocument.getElementById(\"TYPE_GIGAN\").style.display = \"none\";\r\n\t\t\t\tdocument.getElementById(\"TYPE_PICKUP\").style.display = \"block\";\r\n\t        }\r\n\t    }\r\n</script>\r\n</head>\r\n\r\n<body onload=\"init();\">\r\n<form name=\"form\" method=\"post\">\r\n<table width=\"800\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t<tr>\r\n\t\t<td height=\"43\"><img src=\"/img/sub4_cont1_title.gif\" width=\"800\" height=\"43\"></td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td align=\"left\">\r\n\t\t<table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"1\" bgcolor=\"eaeaea\"></td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"14\"></td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td>\r\n\t\t\t\t<table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"22\" background=\"/img/tab_line_blue.gif\">\r\n\t\t\t\t\t\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td><img src=\"/img/sub_stat_title1.gif\" alt=\"통계설정\" width=\"110\" height=\"22\"></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td align=\"left\" class=\"contborder_blue\">\r\n\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse: collapse;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t                                    <td height=\"26\" align=\"left\" colspan=\"4\">\r\n\t                                        <span class=\"sub_stan_blue\">&nbsp; * 가로환경순찰 및 정비실적 </span>\r\n\t                                    </td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">검색조건</td>\r\n\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t\t\t\t\t\t\t\t\t<input id=\"TODATE\" name=\"TODATE\" type=\"text\" class=\"input_form1\" style=\"width: 70px\" value=\"";
  private final static String _jspx_template16 = "\">\r\n\t\t\t\t\t\t\t\t\t\t\t<img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" align=\"absmiddle\" onclick=\"popUpCalendar(this, document.getElementById('TODATE'), 'yyyymmdd')\" style=\"CURSOR: Hand;\">\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"15%\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">시군구별</td>\r\n\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t\t\t\t\t\t\t\t\t<select id=\"fix_guCd\" name=\"fix_guCd\" class=\"input_form1\" style=\"width: 100px\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template17 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"";
  private final static String _jspx_template18 = "\">";
  private final static String _jspx_template19 = "</option>\r\n\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template20 = "\r\n\t\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t                                    <td height=\"26\" align=\"right\" colspan=\"4\">\r\n\t\t                                    <img src=\"/img/inquiry_icon2.gif\" alt=\"검색\" width=\"56\" height=\"18\" onclick=\"fn_search(0);\"  border=\"0\" style=\"cursor:pointer;\">\r\n\t                                    </td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t                                    <td height=\"26\" align=\"left\" colspan=\"4\">\r\n\t                                        <span class=\"sub_stan_blue\">&nbsp; * 통계결과 조회 </span>\r\n\t                                    </td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">검색방법</td>\r\n\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t\t\t\t\t\t\t\t\t<input name=\"SEARCH_TYPE\" type=\"radio\" value=\"1\" onclick=\"changeSearchType(this.value)\" checked>기간별 검색\r\n\t\t\t\t\t\t\t\t\t\t\t<input name=\"SEARCH_TYPE\" type=\"radio\" value=\"0\" onclick=\"changeSearchType(this.value)\">분기별 검색\r\n\t\t\t\t\t\t\t\t\t\t\t<input id=\"pickupChk\" name=\"SEARCH_TYPE\" type=\"radio\" value=\"2\" onclick=\"changeSearchType(this.value)\">수거일별 검색\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">검색조건</td>\r\n\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t\t\t\t\t\t\t\t<div id=\"TYPE_QUARTER\" name=\"TYPE_QUARTER\" style=\"width: 100%; display:none;\">\r\n\t\t\t\t\t\t\t\t\t\t\t<select name=\"YEAR\" id=\"YEAR\" class=\"input_form1\" style=\"width: 130px\">\r\n\t\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t\t\t&nbsp;\r\n\t\t\t\t\t\t\t\t\t\t\t<select name=\"QUARTER\" id=\"QUARTER\" class=\"input_form1\" style=\"width: 130px\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"1\">1/4분기</option>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"2\">2/4분기</option>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"3\">3/4분기</option>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"4\">4/4분기</option>\r\n\t\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t\t</div>\r\n\r\n\t\t\t\t\t\t\t\t\t\t<div id=\"TYPE_GIGAN\" name=\"TYPE_GIGAN\" style=\"width: 100%; display:block;\">\r\n\t\t\t\t\t\t\t\t\t\t\t<input id=\"fromDate\" name=\"fromDate\" type=\"text\" class=\"input_form1\" style=\"width: 70px\" value=\"";
  private final static String _jspx_template21 = "\">\r\n\t\t\t\t\t\t\t\t\t\t\t<img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" align=\"absmiddle\" onclick=\"popUpCalendar(this, document.getElementById('fromDate'), 'yyyymmdd')\" style=\"CURSOR: Hand;\">\r\n\t\t\t\t\t\t\t\t\t\t\t ~ <!-- //********** BEGIN_현진_20120201_수정_1_1 --><input id=\"toDate2\" name=\"toDate2\" type=\"text\" class=\"input_form1\" style=\"width: 70px\" value=\"";
  private final static String _jspx_template22 = "\">\r\n\t\t\t\t\t\t\t\t\t\t\t<img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" align=\"absmiddle\" onclick=\"popUpCalendar(this, document.getElementById('toDate2'), 'yyyymmdd')\" style=\"CURSOR: Hand;\">\r\n\t\t\t\t\t\t\t\t\t\t     <!-- //********** END_현진_20120201_수정_1_1 -->\r\n\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t<div id=\"TYPE_PICKUP\" name=\"TYPE_PICKUP\" style=\"width: 100%; display:none;\">\r\n\t\t\t\t\t\t\t\t\t\t\t<input id=\"pickup_fromDate\" name=\"pickup_fromDate\" type=\"text\" class=\"input_form1\" style=\"width: 70px\" value=\"";
  private final static String _jspx_template23 = "\">\r\n\t\t\t\t\t\t\t\t\t\t\t<img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" align=\"absmiddle\" onclick=\"popUpCalendar(this, document.getElementById('pickup_fromDate'), 'yyyymmdd')\" style=\"CURSOR: Hand;\">\r\n\t\t\t\t\t\t\t\t\t\t\t ~ <input id=\"pickup_toDate2\" name=\"pickup_toDate2\" type=\"text\" class=\"input_form1\" style=\"width: 70px\" value=\"";
  private final static String _jspx_template24 = "\">\r\n\t\t\t\t\t\t\t\t\t\t\t<img src=\"/img/calendar_icon.gif\" width=\"19\" height=\"16\" border=\"0\" align=\"absmiddle\" onclick=\"popUpCalendar(this, document.getElementById('pickup_toDate2'), 'yyyymmdd')\" style=\"CURSOR: Hand;\">\r\n\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"15%\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">시군구별</td>\r\n\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t\t\t\t\t\t\t\t\t<select id=\"guCd\" name=\"guCd\" class=\"input_form1\" style=\"width: 100px\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template25 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"";
  private final static String _jspx_template26 = "\">";
  private final static String _jspx_template27 = "</option>\r\n\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template28 = "\r\n\t\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t                                    <td height=\"26\" align=\"right\" colspan=\"4\">\r\n\t\t                                    <img src=\"/img/inquiry_icon2.gif\" alt=\"검색\" width=\"56\" height=\"18\" onclick=\"fn_search(1);\"  border=\"0\" style=\"cursor:pointer;\">\r\n\t                                    </td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t                                    <td height=\"26\" align=\"left\" colspan=\"2\" style=\"border-right:0px\">\r\n\t                                        <span class=\"sub_stan_blue\">&nbsp; * 거리가게 동일 운영자 조회 </span>\r\n\t                                    </td>\r\n\t                                </tr>\r\n\t\t\t\t\t\t\t\t\t<!--  //********** BEGIN_현진_20120317 -->\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"15%\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조사년도</td>\r\n\t\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" colspan=\"3\">\r\n\t\t\t\t\t\t\t\t\t\t\t<select  id=\"SURVEY_YEAR\" name=\"SURVEY_YEAR\" class=\"input_form1\" style=\"width:130px\">\r\n\t                                   \t\t</select>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t<!--   //********** END_현진_20120317 -->\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td height=\"26\" align=\"right\" style=\"border-left:0px;\" colspan=\"4\">\r\n\t\t                                    <img src=\"/img/inquiry_icon2.gif\" alt=\"검색\" width=\"56\" height=\"18\" onclick=\"fn_search(2);\"  border=\"0\" style=\"cursor:pointer;\">\r\n\t                                    </td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\r\n\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"30\"></td>\r\n\t\t\t</tr>\r\n\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n</table>\r\n</form>\r\n</body>\r\n</html>\r\n\r\n";
}
