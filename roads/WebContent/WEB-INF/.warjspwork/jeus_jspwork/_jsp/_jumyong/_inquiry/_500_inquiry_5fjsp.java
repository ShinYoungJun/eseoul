package jeus_jspwork._jsp._jumyong._inquiry;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_inquiry_5fjsp extends jeus.servlet.jsp.HttpJspBase {

  public final String[] __jeusGetIncludedJspFiles() {
    return null;
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
      pageContext = _jspxFactory.getPageContext(this, request, response, "", true, 8192, true);
      session = pageContext.getSession();
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();

      response.setContentType("text/html;charset=MS949");

      out.write(_jspx_template0);
      out.write(_jspx_template1);
      // jsp code [from=(4,3);to=(4,59)]
      String org_cd = (String)session.getAttribute("org_cd"); 

      out.write(_jspx_template2);
      // jsp code [from=(5,3);to=(5,67)]
      String user_id = (String)session.getAttribute("sessionUserId"); 

      out.write(_jspx_template3);
      // jsp code [from=(24,13);to=(24,19)]
      out.print(org_cd);

      out.write(_jspx_template4);
      // jsp code [from=(29,16);to=(29,20)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${term}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template5);
      // jsp code [from=(30,20);to=(30,28)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${fromTerm}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template6);
      // jsp code [from=(31,18);to=(31,24)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${toTerm}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template7);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template21);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_1_fn(pageContext, null)) return;


      out.write(_jspx_template33);
      // jsp code [from=(154,12);to=(154,25)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${pageIndexList}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template34);
      // jsp code [from=(186,186);to=(186,193)]
      out.print(user_id);

      out.write(_jspx_template35);
      // jsp code [from=(195,16);to=(195,20)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${term}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template36);

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
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${noticelists}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("dto");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template8);
            // jsp code [from=(117,104);to=(117,112)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.sid }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template9);
            // jsp code [from=(117,141);to=(117,151)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.title }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template10);
            // jsp code [from=(118,68);to=(118,77)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.name }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template11);
            // jsp code [from=(119,68);to=(119,80)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.created }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template12);
            // jsp code [from=(120,68);to=(120,81)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.hitcount }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template13);
            // jsp code [from=(123,199);to=(123,207)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.sid }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template14);
            // jsp code [from=(125,31);to=(125,40)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.term }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template15);
            // jsp code [from=(126,31);to=(126,41)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.title }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template16);
            // jsp code [from=(127,31);to=(127,45)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.reception }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template17);
            // jsp code [from=(128,31);to=(128,40)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.name }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template18);
            // jsp code [from=(129,31);to=(129,43)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.created }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template19);
            // jsp code [from=(130,31);to=(130,44)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.hitcount }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template20);

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
    _jspx_th_c_forEach_1.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${lists}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_1.setVar("dto");
    try {
      try {
        int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
        if (_jspx_eval_c_forEach_1 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template22);
            // jsp code [from=(136,179);to=(136,187)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.sid }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template23);
            // jsp code [from=(136,198);to=(136,202)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${term}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template24);
            // jsp code [from=(137,43);to=(137,54)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.div_sid}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template25);
            // jsp code [from=(138,31);to=(138,40)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.term }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template26);
            // jsp code [from=(139,70);to=(139,80)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.title }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template27);
            // jsp code [from=(139,85);to=(139,95)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.title }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template28);
            // jsp code [from=(140,31);to=(140,45)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.reception }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template29);
            // jsp code [from=(141,31);to=(141,40)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.name }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template30);
            // jsp code [from=(142,31);to=(142,43)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.created }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template31);
            // jsp code [from=(143,31);to=(143,44)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.hitcount }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template32);

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
  private final static String _jspx_template1 = " \r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n";
  private final static String _jspx_template2 = "\r\n";
  private final static String _jspx_template3 = "\r\n<html>\r\n<head>\r\n<title></title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\">\r\n<script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script>\r\n<script language=\"javascript\" src=\"/js/common.js\"></script>\r\n<script>\r\n//���Ѱ˻�\r\nwindow.onload = function(){\r\n\tvar i = ";
  private final static String _jspx_template4 = ";\r\n\tif(i != 0000000){\r\n\t\tdocument.getElementById(\"register\").style.display='none';\r\n\t}\r\n\r\n\tvar term = \"";
  private final static String _jspx_template5 = "\";\r\n\tvar fromTerm = \"";
  private final static String _jspx_template6 = "\";\r\n\tvar toTerm = \"";
  private final static String _jspx_template7 = "\";\r\n\r\n\tdocument.getElementById(\"term\").value = term;\r\n\tdocument.getElementById(\"fromTerm\").value = fromTerm;\r\n\tdocument.getElementById(\"toTerm\").value = toTerm;\r\n}\r\n\r\n\r\n//�Խù� �˻�\r\nfunction goSearch(){\r\n\tvar tx, se;\r\n\t\tse = document.getElementById(\"searchTG\").value;\t//�˻��� Ÿ�� ����\r\n\t\ttx = document.getElementById(\"boardSearchText\").value;\t//�˻��� ������\r\n\r\n\tvar term = document.getElementById(\"term\").value;\r\n\tvar fromTerm = document.getElementById(\"fromTerm\").value;\r\n\tvar toTerm = document.getElementById(\"toTerm\").value;\r\n\t\t\r\n\tif(term == \"true\") {\r\n\t\tparam =\"jumyong_searchTerm_inquiry.action?\" + se + \"=\" + tx + \"&fromTerm=\" + fromTerm + \"&toTerm=\" + toTerm;\r\n\t} else {\r\n\t\tparam =\"jumyong_search_inquiry.action?\"+se+\"=\"+tx;\r\n\t}\r\n\t\r\n\tlocation.href = param;\r\n}\r\n\r\nfunction goList() {\r\n\tvar term = document.getElementById(\"term\").value;\r\n\tvar fromTerm = document.getElementById(\"fromTerm\").value;\r\n\tvar toTerm = document.getElementById(\"toTerm\").value;\r\n\r\n\tif(term == \"true\") {\r\n\t\tparam =\"/bbs/jumyong_term_inquiry.action?from=\" + fromTerm + \"&to=\" + toTerm;\r\n\t} else {\r\n\t\tparam =\"jumyong_list_inquiry.action\";\r\n\t}\r\n\t\r\n\tlocation.href = param;\r\n\t\r\n}\r\n\r\n</script>\r\n</head>\r\n<body>\r\n<input type=\"hidden\" id=\"term\">\r\n<input type=\"hidden\" id=\"fromTerm\">\r\n<input type=\"hidden\" id=\"toTerm\">\r\n<table width=\"900\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t<tr>\r\n\t\t<td height=\"43\"><img src=\"/img/sub1_cont5_title.gif\" width=\"900\" height=\"43\"></td>\r\n\t</tr>\r\n\t<tr>\r\n        <td height=\"14\"></td>\r\n    </tr>\r\n\t<tr>\r\n\t\t<td>\r\n\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td><img src=\"/img/sub_inquiry_title_on.gif\" width=\"110\" height=\"22\"></td>\r\n\t\t\t\t\t<td width=\"1\" background=\"/img/tab_line_blue.gif\"></td>\r\n\t\t\t\t\t<td width=\"790\" height=\"22\" background=\"/img/tab_line_blue.gif\">&nbsp;</td>\r\n\t\t\t\t</tr>\r\n\t\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td class=\"contborder_blue\">\r\n\t\t\t<table>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td>\r\n\t\t\t\t\t\t<table width=\"860\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse; table-layout:fixed;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td width=\"4%\" height=\"28\" style=\"text-align:-moz-center; text-align:center;\" bgcolor=\"e5eff8\" class=\"sub_table_b\">��ȣ</td>\r\n\t\t\t\t\t\t\t\t<td width=\"8%\" style=\"text-align:-moz-center; text-align:center;\" bgcolor=\"e5eff8\" class=\"sub_table_b\">�����</td>\r\n\t\t\t\t\t\t\t\t<td width=\"47%\" style=\"text-align:-moz-center; text-align:center;\" bgcolor=\"e5eff8\" class=\"sub_table_b\">����</td>\r\n\t\t\t\t\t\t\t\t<td width=\"14%\" style=\"text-align:-moz-center; text-align:center;\" bgcolor=\"e5eff8\" class=\"sub_table_b\">����ó</td>\r\n\t\t\t\t\t\t\t\t<td width=\"8%\" style=\"text-align:-moz-center; text-align:center;\" bgcolor=\"e5eff8\" class=\"sub_table_b\">�ۼ���</td>\r\n\t\t\t\t\t\t\t\t<td width=\"10%\" style=\"text-align:-moz-center; text-align:center;\" bgcolor=\"e5eff8\" class=\"sub_table_b\">�ۼ���</td>\r\n\t\t\t\t\t\t\t\t<td width=\"5%\" style=\"text-align:-moz-center; text-align:center;\" bgcolor=\"e5eff8\" class=\"sub_table_b\">��ȸ��</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template8 = "\r\n\t\t\t\t\t\t\t<!--  //********** BEGIN_����_20120219 -->\r\n\t\t\t\t\t\t\t<!-- \r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td height=\"25\" align=\"center\" bgcolor=\"eaeaea\" class=\"input_form1\">����</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"eaeaea\" class=\"input_form1\"><a href=\"jumyong_content.action?sid=";
  private final static String _jspx_template9 = "\" id=\"title\" name=\"title\">";
  private final static String _jspx_template10 = "</a></td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"eaeaea\" class=\"input_form1\">";
  private final static String _jspx_template11 = "</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"eaeaea\" class=\"input_form1\">";
  private final static String _jspx_template12 = "</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"eaeaea\" class=\"input_form1\">";
  private final static String _jspx_template13 = "</td>\r\n\t\t\t\t\t\t\t\t</tr>\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t-->\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t<tr tr bgcolor=\"#eaeaea\" onMouseOver=\"this.style.backgroundColor=''\" onMouseOut=\"this.style.backgroundColor='#eaeaea'\" onclick=\"javascript:location.href('jumyong_content_inquiry.action?sid=";
  private final static String _jspx_template14 = "');\" style=\"cursor: pointer\">\r\n\t\t\t\t\t\t\t\t\t<td height=\"25\" align=\"center\">����</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template15 = "</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template16 = "</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template17 = "</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template18 = "</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template19 = "</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template20 = "</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<!--   //********** END_����_20120219 -->\r\n\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template21 = "\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template22 = "\r\n\t\t\t\t\t\t\t\t<tr onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\" onclick=\"javascript:location.href('jumyong_content_inquiry.action?sid=";
  private final static String _jspx_template23 = "&isTerm=";
  private final static String _jspx_template24 = "');\" style=\"cursor: pointer\">\r\n\t\t\t\t\t\t\t\t\t<td height=\"25\" align=\"center\">";
  private final static String _jspx_template25 = "</td>\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template26 = "</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"left\" NOWRAP style=\"padding-left: 5px;\" title=\"";
  private final static String _jspx_template27 = "\">";
  private final static String _jspx_template28 = "</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template29 = "</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template30 = "</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template31 = "</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template32 = "</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template33 = "\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"1\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"5\"></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td align=\"center\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t\t<p>\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template34 = "\r\n\t\t\t\t\t\t\t\t\t</p>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td align=\"right\">\r\n\t\t\t\t\t\t\t\t\t<select name=\"searchTG\" id=\"searchTG\">\r\n\t\t\t\t\t\t\t\t\t<option value=\"title\" selected>����</option>\r\n\t\t\t\t\t\t\t\t\t<option value=\"name\">�ۼ���</option>\r\n\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t<td width=\"5px\"></td>\r\n\t\t\t\t\t\t\t\t<td align=\"center\" height=\"25\" width=\"35\">\r\n\t\t\t\t\t\t\t\t<input id=\"boardSearchText\" type=\"text\" name=\"boardSearchText\" size=\"30\" maxlength=\"30\"/>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t<td align=\"left\" style=\"padding:5px 0px;\">\r\n\t\t\t\t\t\t\t\t<img src=\"/img/search_icon.gif\" alt=\"�˻�\" width=\"56\" height=\"18\" border=\"0\" onclick=\"javascript:goSearch()\" style=\"cursor:Pointer;\">\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td height=\"5\"></td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td align=\"right\">\r\n\t\t\t<img src=\"/img/bbs_register.gif\" id=\"register\" name=\"register\" alt=\"�۾���\" width=\"66\" height=\"22\" border=\"0\" onclick=\"location.href='/bbs/jumyong_upload_list_inquiry.action?user_id=";
  private final static String _jspx_template35 = "'\" style=\"cursor:Pointer;\">\r\n\t\t\t<img src=\"/img/list_icon.gif\" alt=\"����Ʈ\" width=\"66\" height=\"22\" border=\"0\" onclick=\"goList();\" style=\"cursor:Pointer;\">\r\n\t\t</td>\r\n\t</tr>\r\n</table>\r\n\r\n</body>\r\n\r\n<script type=\"text/javascript\">\r\n\tvar term = \"";
  private final static String _jspx_template36 = "\";\r\n\r\n\tif(term == \"true\") {\r\n\t\tdocument.getElementById(\"register\").style.display = \"none\";\r\n\t}\r\n</script>\r\n\r\n</html>";
}
