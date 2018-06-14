package jeus_jspwork._jsp._facility._jumyong;

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
      // jsp code [from=(31,20);to=(31,24)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${year}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(153,125);to=(153,131)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${req_nm}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(171,89);to=(171,104)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${searchlistCount}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template24);
      // jsp code [from=(202,28);to=(202,45)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${strPageDivideForm}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);

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
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${searchList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("board");
    _jspx_th_c_forEach_0.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template13);
            // jsp code [from=(186,53);to=(186,66)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GU_CODE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template14);
            // jsp code [from=(186,72);to=(186,85)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.CORP_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template15);
            // jsp code [from=(186,91);to=(186,107)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.REQUEST_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template16);
            // jsp code [from=(186,113);to=(186,123)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template17);
            // jsp code [from=(187,59);to=(187,68)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${idx.count}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template18);
            // jsp code [from=(188,46);to=(188,57)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.YEAR }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template19);
            // jsp code [from=(189,46);to=(189,56)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template20);
            // jsp code [from=(190,46);to=(190,64)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.OBJECT_COUNT}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template21);
            // jsp code [from=(191,46);to=(191,59)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.REGDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template22);
            // jsp code [from=(192,64);to=(192,83)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.CHECK_YN_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template23);

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
  private final static String _jspx_template9 = "\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/plain\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n<script>\r\n\t\r\n\tfunction initPage()\r\n\t{\r\n\t\tsetYear();\r\n\t}\r\n\r\n\tfunction setYear()\r\n\t{\r\n\t\tnow = new Date();\r\n\t\tY = now.getYear();\r\n\t\t\r\n\t\tvar strYear = \"";
  private final static String _jspx_template10 = "\";\r\n\t\t\r\n\t\t newItem = new Option(0);\r\n\t\t document.getElementById(\"year\").options[0]  = newItem;\r\n\t\t document.getElementById(\"year\").options[0].text = \"전체\";\r\n\t\t document.getElementById(\"year\").options[0].value = \"\";\r\n\r\n\r\n\r\n\t\tvar j = 0;\r\n\t\tvar k = 0;\r\n\t\t\r\n\t\tfor(var i = 1 ; i<=11 ; i++){\r\n\r\n\t\t\t   newItem = new Option(i);\r\n\r\n\t\t\t   document.getElementById(\"year\").options[i]  = newItem;\r\n\t\t\t\t\tif(i<=5){\r\n\t\t\t\t\t\tif(i==1){\r\n\t\t\t\t\t\t\tk=5;\r\n\t\t\t\t\t\t}\r\n\t\t\t\t\t\telse if(i==2){\r\n\t\t\t\t\t\t\tk=4;\r\n\t\t\t\t\t\t}\r\n\t\t\t\t\t\telse if(i==3){\r\n\t\t\t\t\t\t\tk=3;\r\n\t\t\t\t\t\t}\r\n\t\t\t\t\t\telse if(i==4){\r\n\t\t\t\t\t\t\tk=2;\r\n\t\t\t\t\t\t}\r\n\t\t\t\t\t\telse if(i==5){\r\n\t\t\t\t\t\t\tk=1;\r\n\t\t\t\t\t\t}else{\r\n\t\t\t\t\t\t\tk=0;\r\n\t\t\t\t\t\t}\r\n\t\t\t\t\t\t\t  \r\n\t\t\t\t\t\t  document.getElementById(\"year\").options[i].text = Y+k;\r\n\t\t\t\t\t\t  document.getElementById(\"year\").options[i].value = Y+k;\r\n\t\t\t\t\t\t  if(strYear == Y+k)document.getElementById(\"year\").options[i].selected = true;\t\t\t\t\t\t\t\t\r\n\r\n\t\t\t\t\t\t\t\t}\r\n\t\t\t\t\telse{\r\n\t\t\t\t\t\t  \r\n\t\t\t\t\t\t  document.getElementById(\"year\").options[i].text = Y-i+5+1;\r\n\t\t\t\t\t\t  document.getElementById(\"year\").options[i].value = Y-i+5+1;\t\t\t\t  \r\n\t\t\t\t\t\t  if(strYear == Y-i+5+1)document.getElementById(\"year\").options[i].selected = true; \r\n\t\t\t\t\t\t\r\n\t\t\t\t  }\t\t\t\t  \r\n\t\t\t\t\t \r\n\t\t\t\t\r\n\t\t\t} \r\n\t\r\n\t\t \r\n\t\t \t\r\n\t}\r\n\t\r\n\tfunction goSearch()\r\n\t{\r\n\t\t//var year = document.getElementById(\"year\").value;\r\n\t\t//var req_nm = document.getElementById(\"req_nm\").value;\r\n\t\t//location.href=\"/facility/jumyong/search.do?year=\"+year+\"&req_nm=\"+req_nm;\r\n\t\tvar form = document.form;\r\n\t\tform.submit();\r\n\t}\r\n\t\r\n\tfunction goView(gu_cd,corp_cd,req_no,year)\r\n\t{\r\n\t\tlocation.href=\"/facility/jumyong/view.do?gu_code=\"+gu_cd+\"&corp_cd=\"+corp_cd+\"&admin_no=\"+req_no+\"&YEAR=\"+year;\r\n\t}\r\n\r\n</script>\r\n</head>\r\n<body onload=\"initPage();\">\r\n<!-- \r\n\r\n\tfor(var i = 1 ; i < 10 ; i++){\r\n\t\t\t  newItem = new Option(i);\r\n\t\t\t  document.getElementById(\"year\").options[i]  = newItem;\r\n\t\t\t  document.getElementById(\"year\").options[i].text = Y-i+1;\r\n\t\t\t  document.getElementById(\"year\").options[i].value = Y-i+1;\r\n\t\t\t  if(strYear == Y-i+1) document.getElementById(\"year\").options[i].selected = true;\r\n\t\t}\r\n\r\n -->\r\n\r\n<table width=\"800\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n  <tr>\r\n    <td height=\"43\"><img src=\"/img/facility_jumyong_top.gif\" width=\"800\" height=\"43\"></td>\r\n  </tr>\r\n  <tr>\r\n    <td align=\"center\"><table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n      <tr>\r\n        <td height=\"40\" align=\"right\">\r\n\t\t</td>\r\n      </tr>\r\n      <tr>\r\n        <td><table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n          <tr>\r\n            <td height=\"22\" background=\"/img/tab_line_blue.gif\"><table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                <tr>\r\n                  <td><img src=\"/img/sub_facility_title1.gif\" alt =\"시설물조회\"width=\"110\" height=\"22\"></td>\r\n                </tr>\r\n            </table></td>\r\n          </tr>\r\n\t\t<tr>\r\n            <td align=\"center\" class=\"contborder_purple\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n           \r\n           \r\n              <tr>\r\n                <td>\r\n                <form action=\"/facility/jumyong/search.do\" method=\"post\" name=\"form\">\r\n                <table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n                    <tr>\r\n                      <td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">해당년도</td>\r\n                      <td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t  <select name=\"year\" id=\"year\" class=\"input_form1\" style=\"width:100px\">\r\n                       <option></option>\r\n                      </select></td>\r\n                      <td height=\"26\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">법인명/지점명</td>\r\n                      <td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n\t\t\t\t\t  <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n                        <tr>\r\n                          <td><input name=\"req_nm\" id=\"req_nm\" type=\"text\" class=\"input_form1\" style=\"width:130px\" value=\"";
  private final static String _jspx_template11 = "\"></td>\r\n                        </tr>\r\n                      </table>          \r\n                      </td>\r\n                    </tr>\r\n                </table>\r\n               </form>\r\n                </td>\r\n              </tr>\r\n                <tr>\r\n                  <td height=\"40\" align=\"right\">\r\n                  <img src=\"/img/inquiry_icon2.gif\" alt=\"조회\" width=\"56\" height=\"18\" border=\"0\" style=\"cursor:pointer\" onClick=\"javascript:goSearch()\"></td>\r\n                </tr>\r\n               \r\n                <tr>\r\n                  <td height=\"1\" bgcolor=\"#EAEAEA\"></td>\r\n                </tr>\r\n                <tr>\r\n                  <td height=\"34\" class=\"sub_stan\">전체건수 : <span class=\"sub_stan_blue\">";
  private final static String _jspx_template12 = "</span>건 </td>\r\n                </tr>\r\n                <tr>\r\n                  <td><table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n                      <tr>\r\n                        <td height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">번호</td>\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">연도</td>                        \r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">법인명/지점명</td>                        \r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">물건수</td>\r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">최근등록일자</td>                        \r\n                        <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">검토여부</td>\r\n\t\t\t\t\t  </tr>\r\n                      \r\n                      ";
  private final static String _jspx_template13 = "\t                          \r\n                      <tr onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\" style=\"cursor:pointer\"\r\n                      onclick=\"javascript:goView('";
  private final static String _jspx_template14 = "','";
  private final static String _jspx_template15 = "','";
  private final static String _jspx_template16 = "','";
  private final static String _jspx_template17 = "');\">\r\n                        <td height=\"26\" align=\"center\"> ";
  private final static String _jspx_template18 = "</td>\r\n                        <td align=\"center\">";
  private final static String _jspx_template19 = "</td>                        \r\n                        <td align=\"center\">";
  private final static String _jspx_template20 = "</td>                                        \r\n                        <td align=\"center\">";
  private final static String _jspx_template21 = "</td>         \r\n                        <td align=\"center\">";
  private final static String _jspx_template22 = "</td>                                       \r\n                        <td align=\"center\"><font color=\"red\">";
  private final static String _jspx_template23 = "</font></td>\r\n                        \r\n                      </tr>\r\n                      ";
  private final static String _jspx_template24 = "\r\n                  </table></td>\r\n                </tr>\r\n                <tr>\r\n\t\t\t\t\t<td height=\"40\" align=\"center\">\r\n\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t                        ";
  private final static String _jspx_template25 = "\r\n\t                        </tr>\r\n\t                    </table>\r\n                    </td>\r\n               </tr>\r\n            </table></td>\r\n          </tr>\r\n          <!--\r\n          <tr>\r\n            <td height=\"40\" align=\"right\">\r\n            \r\n            <a href=\"#\"><img src=\"/img/newregi_icon.gif\" alt=\"신규등록\" height=\"22\" border=\"0\"></a>            \r\n            <a href=\"#\"><img src=\"/img/levy_icon.gif\" alt=\"세외수입부과\"  height=\"22\" border=\"0\"></a>\r\n            <a href=\"#\"><img src=\"/img/occu_icon.gif\" alt=\"점용허가증\"  height=\"22\" border=\"0\"></a>\r\n            <a href=\"#\"><img src=\"/img/notice_icon.gif\" alt=\"고지서발급\"  height=\"22\" border=\"0\"></a>                                    \r\n            <a href=\"#\"><img src=\"/img/excel_icon.gif\" alt=\"EXCEL 변환\" border=\"0\"></a>\r\n            \r\n            \r\n            </td>\r\n          </tr>\r\n       \r\n        -->\r\n        </table></td>\r\n      </tr>\r\n      <tr>\r\n        <td height=\"30\"></td>\r\n      </tr>\r\n\r\n\r\n</table></td></tr></table>\r\n</body>\r\n</html>\r\n";
}
