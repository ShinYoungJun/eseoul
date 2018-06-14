package jeus_jspwork._jsp._jumyong._gigan;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_excel_5fsearch_5fjsp extends jeus.servlet.jsp.HttpJspBase {

  public final String[] __jeusGetIncludedJspFiles() {
    return new String[] {
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
      out.write(_jspx_template2);
      out.write(_jspx_template3);
      out.write(_jspx_template4);
      out.write(_jspx_template5);
      out.write(_jspx_template6);
      out.write(_jspx_template7);
      // jsp code [from=(25,3);to=(29,1)]
      
      	response.setContentType("application/vnd.ms-excel; charset=euc-kr");
       	response.setHeader("Content-Disposition", "filename=기간조회관리.xls"); 
       	response.setHeader("Content-Description", "JSP Generated Data"); 

      out.write(_jspx_template8);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template45);

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
            out.write(_jspx_template9);
            // jsp code [from=(64,39);to=(64,47)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.RN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template10);
            // jsp code [from=(65,25);to=(65,39)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template11);
            // jsp code [from=(66,25);to=(66,35)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TYPE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template12);
            // jsp code [from=(67,25);to=(67,43)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SECTION_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template13);
            // jsp code [from=(68,25);to=(68,35)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template14);
            // jsp code [from=(69,25);to=(69,34)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TEL}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template15);
            // jsp code [from=(70,25);to=(70,33)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.HP}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template16);
            // jsp code [from=(71,25);to=(71,35)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.POST}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template17);
            // jsp code [from=(72,28);to=(72,45)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.APPEAL_ADDR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template18);
            // jsp code [from=(73,28);to=(73,36)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SI}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template19);
            // jsp code [from=(73,40);to=(73,49)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template20);
            // jsp code [from=(73,53);to=(73,66)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.DORO_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template21);
            // jsp code [from=(73,70);to=(73,82)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_BON}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template22);
            // jsp code [from=(73,86);to=(73,97)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_BU}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template23);
            // jsp code [from=(73,101);to=(73,112)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template24);
            // jsp code [from=(73,116);to=(73,131)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_DET_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template25);
            // jsp code [from=(74,28);to=(74,40)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOPOST}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template26);
            // jsp code [from=(75,28);to=(75,43)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SONGDALGI}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template27);
            // jsp code [from=(76,25);to=(76,35)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TONM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template28);
            // jsp code [from=(77,25);to=(77,36)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOTEL}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template29);
            // jsp code [from=(78,25);to=(78,35)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.TOHP}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template30);
            // jsp code [from=(79,28);to=(79,43)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.AREA_SIZE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template31);
            // jsp code [from=(80,28);to=(80,37)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.SSN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template32);
            // jsp code [from=(81,25);to=(81,40)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.JUMYONGJI}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template33);
            // jsp code [from=(82,25);to=(82,40)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.ROAD_ADDR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template34);
            // jsp code [from=(83,25);to=(83,42)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.BD_NM_JUMJI}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template35);
            // jsp code [from=(84,25);to=(84,50)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.JUMYONGJI_DORO_ADDR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template36);
            // jsp code [from=(85,25);to=(85,44)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PURPOSE_CLASS}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template37);
            // jsp code [from=(85,48);to=(85,66)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PURPOSE_SORT}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template38);
            // jsp code [from=(85,70);to=(85,88)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PURPOSE_KIND}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template39);
            // jsp code [from=(86,25);to=(86,36)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.GIGAN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template40);
            // jsp code [from=(87,25);to=(87,43)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PERCENT_RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template41);
            // jsp code [from=(88,25);to=(88,45)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.PERCENT_REASON}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template42);
            // jsp code [from=(89,25);to=(89,45)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.REDUCTION_RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template43);
            // jsp code [from=(90,25);to=(90,47)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${board.REDUCTION_REASON}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template44);

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
  private final static String _jspx_template7 = "\r\n\r\n<html xmlns:x=\"urn:schemas-microsoft-com:office:excel\">\r\n<head>\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<!--[if gte mso 9]><xml>\r\n<x:ExcelWorkbook><x:ExcelWorksheets><x:ExcelWorksheet>\r\n<x:Name>Sheet1</x:Name>\r\n<x:WorksheetOptions><x:Panes><x:Pane>\r\n</x:Pane></x:Panes></x:WorksheetOptions>\r\n</x:ExcelWorksheet></x:ExcelWorksheets></x:ExcelWorkbook>\r\n</xml><![endif]-->\r\n\r\n<script language=\"javascript\">\r\n\tfunction addDash(num)\r\n\t{\r\n\t\treturn (num.substr(0,4)+\"-\"+num.substr(4,2)+\"-\"+num.substr(6,2));\r\n\t}\r\n</script>\r\n</head>\r\n\r\n<body>\r\n\r\n";
  private final static String _jspx_template8 = "\r\n\r\n<table width=\"800\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n    <tr>\r\n      <td width=\"30\" height=\"28\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">번호</td>\r\n      <td width=\"70\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">관리번호</td>\r\n      <td width=\"60\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용종류</td>\r\n      <td width=\"60\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용구분</td>\r\n      <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용인</td>\r\n      <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">연락처</td>\r\n      <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">HP</td>\r\n      <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">우편번호</td>\r\n      <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용인 주소</td>\r\n      <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용인 새 주소</td>\r\n      <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">우편물 송달지 우편번호</td>\r\n      <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">우편물 송달지 도로명주소</td>\r\n      <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">우편물 수령인 </td>\r\n      <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">수령인 연락처</td>\r\n      <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">수령인 HP</td>\r\n      <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">면적(㎡)</td>\r\n      <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">주민번호</td>\r\n      <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용지</td>\r\n      <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">도로주소</td>\r\n      <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">건물(명) 정보</td>\r\n      <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용지 도로명주소</td>\r\n      <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용목적</td>\r\n      <td width=\"150\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">점용기간</td>       \r\n      <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">지분율</td>\r\n      <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">지분율 사유</td>\r\n      <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">감면율</td>\r\n      <td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">감면율 사유</td> \r\n    </tr>\r\n  \t\r\n \t";
  private final static String _jspx_template9 = "\r\n    \t<tr>\r\n\t    <td height=\"26\" align=\"center\">";
  private final static String _jspx_template10 = "</td>\r\n\t\t\t<td align=\"center\">";
  private final static String _jspx_template11 = "</td>\r\n\t\t\t<td align=\"center\">";
  private final static String _jspx_template12 = "</td>\r\n\t\t\t<td align=\"center\">";
  private final static String _jspx_template13 = "</td>\r\n\t\t\t<td align=\"center\">";
  private final static String _jspx_template14 = "</td>\r\n\t\t\t<td align=\"center\">";
  private final static String _jspx_template15 = "</td>\r\n\t\t\t<td align=\"center\">";
  private final static String _jspx_template16 = "</td>\r\n\t\t\t<td align=\"center\">";
  private final static String _jspx_template17 = "</td>\r\n      <td align=\"center\">";
  private final static String _jspx_template18 = "</td>\r\n      <td align=\"center\">";
  private final static String _jspx_template19 = " ";
  private final static String _jspx_template20 = " ";
  private final static String _jspx_template21 = " ";
  private final static String _jspx_template22 = " ";
  private final static String _jspx_template23 = " ";
  private final static String _jspx_template24 = " ";
  private final static String _jspx_template25 = "</td>\r\n      <td align=\"center\">";
  private final static String _jspx_template26 = "</td>\r\n      <td align=\"center\">";
  private final static String _jspx_template27 = "</td>\r\n\t\t\t<td align=\"center\">";
  private final static String _jspx_template28 = "</td>\r\n\t\t\t<td align=\"center\">";
  private final static String _jspx_template29 = "</td>\r\n\t\t\t<td align=\"center\">";
  private final static String _jspx_template30 = "</td>\r\n      <td align=\"center\">";
  private final static String _jspx_template31 = "</td>\r\n      <td align=\"center\">";
  private final static String _jspx_template32 = "</td>\r\n\t\t\t<td align=\"center\">";
  private final static String _jspx_template33 = "</td>\r\n\t\t\t<td align=\"center\">";
  private final static String _jspx_template34 = "</td>\r\n\t\t\t<td align=\"center\">";
  private final static String _jspx_template35 = "</td>\r\n\t\t\t<td align=\"center\">";
  private final static String _jspx_template36 = "</td>\r\n\t\t\t<td align=\"center\">";
  private final static String _jspx_template37 = " ";
  private final static String _jspx_template38 = " ";
  private final static String _jspx_template39 = "</td>\r\n\t\t\t<td align=\"center\">";
  private final static String _jspx_template40 = "</td>\r\n\t\t\t<td align=\"center\">";
  private final static String _jspx_template41 = "</td>\r\n\t\t\t<td align=\"center\">";
  private final static String _jspx_template42 = "</td>\r\n\t\t\t<td align=\"center\">";
  private final static String _jspx_template43 = "</td>\r\n\t\t\t<td align=\"center\">";
  private final static String _jspx_template44 = "</td>\r\n\t\t</tr>\r\n\t";
  private final static String _jspx_template45 = "\r\n\t\r\n</table>\r\n</body>\r\n</html>\r\n\r\n";
}
