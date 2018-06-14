package jeus_jspwork._jsp._facility._adress;

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
      out.write(_jspx_template3);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template18);
      // jsp code [from=(183,15);to=(183,28)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${pageIndexList}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);

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
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${adlists }", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("dto");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template4);
            // jsp code [from=(160,102);to=(160,109)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.sid}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template5);
            // jsp code [from=(161,51);to=(161,61)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.gu_nm }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template6);
            // jsp code [from=(162,51);to=(162,61)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.or_nm }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template7);
            // jsp code [from=(163,51);to=(163,60)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.t_nm }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template8);
            // jsp code [from=(164,51);to=(164,62)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.dam_nm }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template9);
            // jsp code [from=(165,51);to=(165,62)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.dam_ph }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template10);
            // jsp code [from=(166,51);to=(166,62)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.dam_em }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template11);
            // jsp code [from=(167,51);to=(167,63)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.teem_nm }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template12);
            // jsp code [from=(168,51);to=(168,63)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.teem_ph }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template13);
            // jsp code [from=(169,51);to=(169,62)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.goa_nm }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template14);
            // jsp code [from=(170,51);to=(170,62)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.goa_ph }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template15);
            // jsp code [from=(171,51);to=(171,59)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.fax }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template16);
            // jsp code [from=(172,51);to=(172,60)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dto.memo }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template17);

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
  private final static String _jspx_template1 = " \r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n";
  private final static String _jspx_template2 = "\r\n<html>\r\n<head>\r\n<title></title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n</style>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\">\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n<script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script>\r\n<script language=\"javascript\" src=\"/js/common.js\"></script>\r\n<script>\r\n//게시물 검색\r\nfunction goSearch(){\r\n\tvar gu, or, te, dam;\r\n\t\tgu = document.getElementById(\"gu\").value;\t//검색어 데이터\r\n\t\tor = document.getElementById(\"or\").value;\r\n\t\tte = document.getElementById(\"te\").value;\t\r\n\t\tdam = document.getElementById(\"dam\").value;\t\r\n\t\t//********** BEGIN_현진_20120323\r\n\t\t/*\r\n\t\tif(gu == \"\"||or == \"\"||te == \"\"||dam == \"\"){\r\n\t\t\talert(\"검색어를 전부 입력해 주세요.\");\r\n\t\t}else{\r\n\t\tlocation.href=\"facility_adsearch.action?gu_nm=\"+gu+\"&or_nm=\"+or+\"&t_nm=\"+te+\"&dam_nm=\"+dam;\r\n\t\t}\r\n\t\t*/\r\n\t\t//********** END_현진_20120323\r\n\t\tlocation.href=\"facility_adsearch.action?gu_nm=\"+gu+\"&or_nm=\"+or+\"&t_nm=\"+te+\"&dam_nm=\"+dam;\r\n}\r\nfunction chk_check(val){\r\n\t var chk = chk_ck.chk;\r\n\t var conf=   false;\r\n\t var sid = 0;\r\n\t if(val == \"del\"){\r\n\t for(i=0;i<chk.length;i++){\r\n\t  if(chk[i].checked == true){\r\n\t   conf=true;\r\n\t   sid = chk[i].value;\r\n\t   location.href=\"facility_addelete.action?sid=\"+sid;\r\n\t  }  \r\n\t }\r\n\t if(conf == false){\r\n\t  alert(\"삭제할 대상을 선택해 주세요.\");\r\n\t }\r\n\t }else if(val == \"mod\"){\r\n\t\t for(i=0;i<chk.length;i++){\r\n\t\t\t  if(chk[i].checked == true){\r\n\t\t\t   conf=true;\r\n\t\t\t   sid = chk[i].value;\r\n\t\t\t   location.href=\"facility_adupdate.action?sid=\"+sid;\r\n\t\t\t  }  \r\n\t\t\t }\r\n\t\t\t if(conf == false){\r\n\t\t\t  alert(\"수정할 대상을 선택해 주세요.\");\r\n\t\t\t }\r\n\t\t\t }\r\n}\r\n//체크박스 1개만 선택 가능\r\nfunction check_only(chk){\r\n    var obj = document.getElementsByName(\"chk\");\r\n    for(var i=0; i<obj.length; i++){\r\n        if(obj[i] != chk){\r\n            obj[i].checked = false;\r\n        }\r\n    }\r\n}\r\n</script>\r\n</head>\r\n<body>\r\n<table width=\"800\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n<form name=\"chk_ck\">\r\n\t<tr>\r\n\t\t<td height=\"43\"><img src=\"/img/sub3_cont5_title.gif\" width=\"800\" height=\"43\"></td>\r\n\t</tr>\r\n\t<tr>\r\n        <td height=\"14\"></td>\r\n    </tr>\r\n\t<tr>\r\n\t\t<td>\r\n\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td><img src=\"/img/sub_bbs_title_off.gif\" width=\"110\" height=\"22\" onclick=\"location.href='facility_list.action'\" style=\"cursor:Pointer;\"></td>\r\n\t\t\t\t\t<td width=\"1\" background=\"/img/tab_line_blue.gif\"></td>\r\n\t\t\t\t\t<td><img src=\"/img/sub_adress_title_on.gif\" width=\"110\" height=\"22\"></td>\r\n\t\t\t\t\t<td width=\"579\" hight=\"22\" background=\"/img/tab_line_blue.gif\">&nbsp;</td>\r\n\t\t\t\t</tr>\r\n\t\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td class=\"contborder_blue\">\r\n\t\t\t<table>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td>\r\n\t\t\t\t\t\t<table width=\"760\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td width=\"100\" height=\"28\" style=\"text-align:-moz-center; text-align:center;\" bgcolor=\"e5eff8\" class=\"sub_table_b\">시군구명</td>\r\n\t\t\t\t\t\t\t\t<td width=\"330\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><input type=\"text\" style=\"width:130px\" maxlength=\"20\" id=\"gu\" name=\"gu\" value=\"\" class=\"input_form1\"/></td>\r\n\t\t\t\t\t\t\t\t<td width=\"100\" style=\"text-align:-moz-center; text-align:center;\" bgcolor=\"e5eff8\" class=\"sub_table_b\">부&nbsp;서&nbsp;명</td>\r\n\t\t\t\t\t\t\t\t<td width=\"330\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><input type=\"text\" style=\"width:130px\" maxlength=\"20\" id=\"or\" name=\"or\" value=\"\" class=\"input_form1\"/></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td width=\"100\" height=\"28\" style=\"text-align:-moz-center; text-align:center;\" bgcolor=\"e5eff8\" class=\"sub_table_b\">팀&nbsp;&nbsp;&nbsp;명</td>\r\n\t\t\t\t\t\t\t\t<td width=\"330\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><input type=\"text\" style=\"width:130px\" maxlength=\"20\" id=\"te\" name=\"te\" value=\"\" class=\"input_form1\"/></td>\r\n\t\t\t\t\t\t\t\t<td width=\"100\" style=\"text-align:-moz-center; text-align:center;\" bgcolor=\"e5eff8\" class=\"sub_table_b\">담당자명</td>\r\n\t\t\t\t\t\t\t\t<td width=\"330\" bgcolor=\"eaeaea\" class=\"table_bl_left\"><input type=\"text\" style=\"width:130px\" maxlength=\"20\" id=\"dam\" name=\"dam\" valu";
  private final static String _jspx_template3 = "e=\"\" class=\"input_form1\"/></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n                \t<td height=\"1\"></td>\r\n          \t\t</tr>\r\n\t\t\t\t<tr>\r\n                \t<td align=\"right\">\r\n                \t\t<img src=\"/img/inquiry_icon2.gif\" alt=\"조회\" width=\"56\" height=\"18\" border=\"0\" onclick=\"javascript:goSearch()\" style=\"cursor:Pointer;\">\r\n                \t</td>\r\n          \t\t</tr>\r\n\t\t\t\t<tr>\r\n                \t<td height=\"1\" bgcolor=\"#EAEAEA\"></td>\r\n          \t\t</tr>\r\n          \t\t<tr>\r\n                \t<td height=\"20\"></td>\r\n          \t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td>\r\n\t\t\t\t\t\t<div style=\"width:760px; overflow-x:scroll; scrollbar-face-color:#EEF8FB; scrollbar-3dlight-color:#BBBDB6; scrollbar-highlight-color:#EEF8FB; scrollbar-shadow-color:#BBBDB6; scrollbar-darkshadow-color:#EEF8FB; scrollbar-track-color:#EEF8FB; scrollbar-arrow-color:#BBBDB6\">\r\n\t\t\t\t\t\t<table width=\"1330\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n\t\t\t \t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td width=\"10\" height=\"45\" rowspan=\"2\" style=\"text-align:-moz-center; text-align:center;\" bgcolor=\"e5eff8\" class=\"sub_table_b\"><input type=\"checkbox\" name=\"chk\" style=\"display:none;\"/></td>\r\n\t\t\t\t\t\t\t\t<td width=\"100\" rowspan=\"2\" style=\"text-align:-moz-center; text-align:center;\" bgcolor=\"e5eff8\" class=\"sub_table_b\">시군구명</td>\r\n\t\t\t\t\t\t\t\t<td width=\"100\" rowspan=\"2\" style=\"text-align:-moz-center; text-align:center;\" bgcolor=\"e5eff8\" class=\"sub_table_b\">부&nbsp;서&nbsp;명</td>\r\n\t\t\t\t\t\t\t\t<td width=\"100\" rowspan=\"2\" style=\"text-align:-moz-center; text-align:center;\" bgcolor=\"e5eff8\" class=\"sub_table_b\">팀&nbsp;&nbsp;&nbsp;명</td>\r\n\t\t\t\t\t\t\t\t<td colspan=\"3\" style=\"text-align:-moz-center; text-align:center;\" bgcolor=\"e5eff8\" class=\"sub_table_b\">담&nbsp;당&nbsp;자</td>\r\n\t\t\t\t\t\t\t\t<td colspan=\"2\" style=\"text-align:-moz-center; text-align:center;\" bgcolor=\"e5eff8\" class=\"sub_table_b\">팀&nbsp;&nbsp;&nbsp;장</td>\r\n\t\t\t\t\t\t\t\t<td colspan=\"2\" style=\"text-align:-moz-center; text-align:center;\" bgcolor=\"e5eff8\" class=\"sub_table_b\">과&nbsp;&nbsp;&nbsp;장</td>\r\n\t\t\t\t\t\t\t\t<td width=\"120\"rowspan=\"2\" style=\"text-align:-moz-center; text-align:center;\" bgcolor=\"e5eff8\" class=\"sub_table_b\">FAX</td>\r\n\t\t\t\t\t\t\t\t<td width=\"200\"rowspan=\"2\" style=\"text-align:-moz-center; text-align:center;\" bgcolor=\"e5eff8\" class=\"sub_table_b\">비&nbsp;&nbsp;&nbsp;고</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td width=\"90\" style=\"text-align:-moz-center; text-align:center;\" bgcolor=\"e5eff8\" class=\"sub_table_b\">성명</td>\r\n\t\t\t\t\t\t\t\t<td width=\"120\" style=\"text-align:-moz-center; text-align:center;\" bgcolor=\"e5eff8\" class=\"sub_table_b\">전화</td>\r\n\t\t    \t\t\t\t\t<td width=\"170\" style=\"text-align:-moz-center; text-align:center;\" bgcolor=\"e5eff8\" class=\"sub_table_b\">E-mail</td>\r\n\t\t\t\t\t\t\t\t<td width=\"90\" style=\"text-align:-moz-center; text-align:center;\" bgcolor=\"e5eff8\" class=\"sub_table_b\">성명</td>\r\n\t\t\t\t\t\t\t\t<td width=\"120\" style=\"text-align:-moz-center; text-align:center;\" bgcolor=\"e5eff8\" class=\"sub_table_b\">전화</td>\r\n\t\t\t\t\t\t\t\t<td width=\"90\" style=\"text-align:-moz-center; text-align:center;\" bgcolor=\"e5eff8\" class=\"sub_table_b\">성명</td>\r\n\t\t\t\t\t\t\t\t<td width=\"120\" style=\"text-align:-moz-center; text-align:center;\" bgcolor=\"e5eff8\" class=\"sub_table_b\">전화</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template4 = "\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td height=\"28\" align=\"left\" class=\"input_form1\"><input type=\"checkbox\" name=\"chk\" value=\"";
  private final static String _jspx_template5 = "\" onclick=\"check_only(this)\"/></td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\" class=\"input_form1\">";
  private final static String _jspx_template6 = "</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\" class=\"input_form1\">";
  private final static String _jspx_template7 = "</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\" class=\"input_form1\">";
  private final static String _jspx_template8 = "</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\" class=\"input_form1\">";
  private final static String _jspx_template9 = "</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\" class=\"input_form1\">";
  private final static String _jspx_template10 = "</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\" class=\"input_form1\">";
  private final static String _jspx_template11 = "</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\" class=\"input_form1\">";
  private final static String _jspx_template12 = "</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\" class=\"input_form1\">";
  private final static String _jspx_template13 = "</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\" class=\"input_form1\">";
  private final static String _jspx_template14 = "</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\" class=\"input_form1\">";
  private final static String _jspx_template15 = "</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\" class=\"input_form1\">";
  private final static String _jspx_template16 = "</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\" class=\"input_form1\">";
  private final static String _jspx_template17 = "</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template18 = "\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"1\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"5\"></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td align=\"center\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t\t<p>";
  private final static String _jspx_template19 = "</p>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td height=\"5\"></td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td>\r\n\t\t\t<img src=\"/img/del_icon5.gif\" name=\"delete\" alt=\"삭제\" width=\"66\" height=\"22\" border=\"0\" onclick=\"javascript:chk_check('del')\" style=\"cursor:Pointer;\" align=\"left\">\r\n\t\t\t<img src=\"/img/mod_icon5.gif\" name=\"modify\" alt=\"수정\" width=\"66\" height=\"22\" border=\"0\" onclick=\"javascript:chk_check('mod')\" style=\"cursor:Pointer;\" align=\"left\">\r\n\t\t\t<img src=\"/img/list_icon.gif\" alt=\"리스트\" width=\"66\" height=\"22\" border=\"0\" onclick=\"location.href='facility_adlist.action'\" style=\"cursor:Pointer;\" align=\"right\">\r\n\t\t\t<img src=\"/img/rojum_register.gif\" alt=\"신규등록\" width=\"88\" height=\"22\" border=\"0\" onclick=\"location.href='facility_adupload.action'\" style=\"cursor:Pointer;\" align=\"right\">\r\n\t\t</td>\r\n\t</tr>\r\n</form>\r\n</table>\r\n</body>\r\n\r\n</html>";
}
