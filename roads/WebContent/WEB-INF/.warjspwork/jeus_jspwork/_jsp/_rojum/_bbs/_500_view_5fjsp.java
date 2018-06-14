package jeus_jspwork._jsp._rojum._bbs;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_view_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template16);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_1_fn(pageContext, null)) return;


      out.write(_jspx_template30);
      // jsp code [from=(122,12);to=(122,25)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${pageIndexList}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template31);
      // jsp code [from=(152,188);to=(152,195)]
      out.print(user_id);

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
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${noticelists}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("dto");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template5);
            // jsp code [from=(77,102);to=(77,110)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.sid }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template6);
            // jsp code [from=(77,139);to=(77,149)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.title }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template7);
            // jsp code [from=(78,68);to=(78,77)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.name }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template8);
            // jsp code [from=(79,68);to=(79,80)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.created }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template9);
            // jsp code [from=(80,68);to=(80,81)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.hitcount }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template10);
            // jsp code [from=(83,189);to=(83,197)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.sid }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template11);
            // jsp code [from=(85,31);to=(85,41)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.title }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template12);
            // jsp code [from=(86,31);to=(86,40)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.name }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template13);
            // jsp code [from=(87,31);to=(87,43)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.created }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template14);
            // jsp code [from=(88,31);to=(88,44)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.hitcount }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template15);

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
            out.write(_jspx_template17);
            // jsp code [from=(97,63);to=(97,74)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.div_sid}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template18);
            // jsp code [from=(98,85);to=(98,93)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.sid }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template19);
            // jsp code [from=(98,122);to=(98,132)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.title }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template20);
            // jsp code [from=(99,51);to=(99,60)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.name }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template21);
            // jsp code [from=(100,51);to=(100,63)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.created }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template22);
            // jsp code [from=(101,51);to=(101,64)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.hitcount }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template23);
            // jsp code [from=(104,169);to=(104,177)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.sid }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template24);
            // jsp code [from=(105,43);to=(105,54)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.div_sid}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template25);
            // jsp code [from=(106,32);to=(106,42)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.title }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template26);
            // jsp code [from=(107,32);to=(107,41)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.name }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template27);
            // jsp code [from=(108,32);to=(108,44)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.created }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template28);
            // jsp code [from=(109,32);to=(109,45)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.hitcount }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template29);

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
  private final static String _jspx_template3 = "\r\n<html>\r\n<head>\r\n<title></title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\">\r\n<script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script>\r\n<script language=\"javascript\" src=\"/js/common.js\"></script>\r\n<script>\r\n//권한검색\r\nwindow.onload = function(){\r\n\tvar i = ";
  private final static String _jspx_template4 = ";\r\n\tif(i != 0000000){\r\n\t\tdocument.getElementById(\"register\").style.display='none';\r\n\t}\r\n}\r\n\r\n//게시물 검색\r\nfunction goSearch(){\r\n\tvar tx, se;\r\n\t\tse = document.getElementById(\"searchTG\").value;\t//검색어 타입 설정\r\n\t\ttx = document.getElementById(\"boardSearchText\").value;\t//검색어 데이터\r\n\t\tlocation.href=\"rojum_search.action?\"+se+\"=\"+tx;\r\n}\r\n</script>\r\n</head>\r\n<body>\r\n<table width=\"800\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t<tr>\r\n\t\t<td height=\"43\"><img src=\"/img/sub7_cont5_title.gif\" width=\"800\" height=\"43\"></td>\r\n\t</tr>\r\n\t<tr>\r\n        <td height=\"14\"></td>\r\n    </tr>\r\n\t<tr>\r\n\t\t<td>\r\n\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td><img src=\"/img/sub_bbs_title_on.gif\" width=\"110\" height=\"22\"></td>\r\n\t\t\t\t\t<td width=\"1\" background=\"/img/tab_line_blue.gif\"></td>\r\n\t\t\t\t\t<td><img src=\"/img/sub_adress_title_off.gif\" width=\"110\" height=\"22\" onclick=\"location.href='rojum_adlist.action'\" style=\"cursor:Pointer;\"></td>\r\n\t\t\t\t\t<td width=\"579\" hight=\"22\" background=\"/img/tab_line_blue.gif\">&nbsp;</td>\r\n\t\t\t\t</tr>\r\n\t\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td class=\"contborder_blue\">\r\n\t\t\t<table>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td>\r\n\t\t\t\t\t\t<table width=\"760\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td width=\"5%\" height=\"28\" style=\"text-align:-moz-center; text-align:center;\" bgcolor=\"e5eff8\" class=\"sub_table_b\">번호</td>\r\n\t\t\t\t\t\t\t\t<td width=\"66%\" style=\"text-align:-moz-center; text-align:center;\" bgcolor=\"e5eff8\" class=\"sub_table_b\">제목</td>\r\n\t\t\t\t\t\t\t\t<td width=\"10%\" style=\"text-align:-moz-center; text-align:center;\" bgcolor=\"e5eff8\" class=\"sub_table_b\">작성자</td>\r\n\t\t\t\t\t\t\t\t<td width=\"12%\" style=\"text-align:-moz-center; text-align:center;\" bgcolor=\"e5eff8\" class=\"sub_table_b\">작성일</td>\r\n\t\t\t\t\t\t\t\t<td width=\"7%\" style=\"text-align:-moz-center; text-align:center;\" bgcolor=\"e5eff8\" class=\"sub_table_b\">조회수</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template5 = "\r\n\t\t\t\t\t\t\t<!--  //********** BEGIN_현진_20120219 -->\r\n\t\t\t\t\t\t\t<!-- \r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td height=\"25\" align=\"center\" bgcolor=\"eaeaea\" class=\"input_form1\">공지</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"eaeaea\" class=\"input_form1\"><a href=\"rojum_content.action?sid=";
  private final static String _jspx_template6 = "\" id=\"title\" name=\"title\">";
  private final static String _jspx_template7 = "</a></td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"eaeaea\" class=\"input_form1\">";
  private final static String _jspx_template8 = "</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"eaeaea\" class=\"input_form1\">";
  private final static String _jspx_template9 = "</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"eaeaea\" class=\"input_form1\">";
  private final static String _jspx_template10 = "</td>\r\n\t\t\t\t\t\t\t\t</tr>\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t-->\r\n\t\t\t\t\t\t\t\t<tr  bgcolor=\"#eaeaea\" onMouseOver=\"this.style.backgroundColor='#'\" onMouseOut=\"this.style.backgroundColor='#eaeaea'\" onclick=\"javascript:location.href('rojum_content.action?sid=";
  private final static String _jspx_template11 = "');\" style=\"cursor: pointer\">\r\n\t\t\t\t\t\t\t\t\t<td height=\"25\" align=\"center\">공지</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template12 = "</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template13 = "</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template14 = "</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template15 = "</td>\r\n\t\t\t\t\t\t\t\t</tr>\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t<!--   //********** END_현진_20120219 -->\t\t\t\t\t\t\t\r\n\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template16 = "\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template17 = "\r\n\t\t\t\t\t\t\t<!--  //********** BEGIN_현진_20120219 -->\r\n\t\t\t\t\t\t\t<!-- \r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td height=\"25\" align=\"center\" class=\"input_form1\">";
  private final static String _jspx_template18 = "</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\" class=\"input_form1\"><a href=\"rojum_content.action?sid=";
  private final static String _jspx_template19 = "\" id=\"title\" name=\"title\">";
  private final static String _jspx_template20 = "</a></td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\" class=\"input_form1\">";
  private final static String _jspx_template21 = "</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\" class=\"input_form1\">";
  private final static String _jspx_template22 = "</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\" class=\"input_form1\">";
  private final static String _jspx_template23 = "</td>\r\n\t\t\t\t\t\t\t\t</tr>\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t-->\r\n\t\t\t\t\t\t\t\t<tr onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\" onclick=\"javascript:location.href('rojum_content.action?sid=";
  private final static String _jspx_template24 = "');\" style=\"cursor: pointer\">\r\n\t\t\t\t\t\t\t\t\t<td height=\"25\" align=\"center\">";
  private final static String _jspx_template25 = "</td>\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\" >";
  private final static String _jspx_template26 = "</a></td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\" >";
  private final static String _jspx_template27 = "</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\" >";
  private final static String _jspx_template28 = "</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\" >";
  private final static String _jspx_template29 = "</td>\r\n\t\t\t\t\t\t\t\t</tr>\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t<!--   //********** END_현진_20120219 -->\t\t\t\t\t\t\t\r\n\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template30 = "\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"1\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"5\"></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td align=\"center\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t\t<p>\r\n\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template31 = "\r\n\t\t\t\t\t\t\t\t\t</p>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td align=\"right\">\r\n\t\t\t\t\t\t\t\t\t<select name=\"searchTG\" id=\"searchTG\">\r\n\t\t\t\t\t\t\t\t\t<option value=\"title\" selected>제목</option>\r\n\t\t\t\t\t\t\t\t\t<option value=\"name\">작성자</option>\r\n\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t<td align=\"center\" height=\"25\" width=\"35\">\r\n\t\t\t\t\t\t\t\t<input id=\"boardSearchText\" type=\"text\" name=\"boardSearchText\" size=\"30\" maxlength=\"30\"/>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t<td align=\"left\" style=\"padding:5px 0px;\">\r\n\t\t\t\t\t\t\t\t<img src=\"/img/search_icon.gif\" alt=\"검색\" width=\"56\" height=\"18\" border=\"0\" onclick=\"javascript:goSearch()\" style=\"cursor:Pointer;\">\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td height=\"5\"></td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td align=\"right\"><img src=\"/img/bbs_register.gif\" id=\"register\" name=\"register\" alt=\"글쓰기\" width=\"66\" height=\"22\" border=\"0\" onclick=\"location.href='rojum_upload_list.action?user_id=";
  private final static String _jspx_template32 = "'\" style=\"cursor:Pointer;\"><img src=\"/img/list_icon.gif\" alt=\"리스트\" width=\"66\" height=\"22\" border=\"0\" onclick=\"location.href='rojum_list.action'\" style=\"cursor:Pointer;\"></td>\r\n\t</tr>\r\n</table>\r\n</body>\r\n\r\n</html>";
}
