package jeus_jspwork._jsp._admin._section;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_list_5fjsp extends jeus.servlet.jsp.HttpJspBase {

  public final String[] __jeusGetIncludedJspFiles() {
    return new String[] {
      "/jsp/common/include.jsp",
      "/jsp/common/loginCheck.jsp"
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
      // jsp code [from=(1,3);to=(6,1)]
      
      	String 		userId	= (String)session.getAttribute("sessionUserId");
      	
      	if(userId == null)
      	{

      out.write(_jspx_template8);
      // jsp code [from=(11,3);to=(13,1)]
      
      	}

      out.write(_jspx_template9);
      // jsp code [from=(36,9);to=(36,12)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MSG}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(37,22);to=(37,25)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MSG}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(138,26);to=(138,44)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MenuCheck == '000'}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(168,17);to=(168,26)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MenuCheck}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(193,94);to=(193,104)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${totalCount}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template21);
      // jsp code [from=(235,27);to=(235,44)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${strPageDivideForm}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);

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
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${sectionList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("sectionList");
    _jspx_th_c_forEach_0.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template15);
            // jsp code [from=(216,74);to=(216,91)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${sectionList.GU_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template16);
            // jsp code [from=(217,80);to=(217,100)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${sectionList.GUGAN_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template17);
            // jsp code [from=(219,43);to=(219,60)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${sectionList.GU_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template18);
            // jsp code [from=(220,31);to=(220,51)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${sectionList.GUGAN_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template19);
            // jsp code [from=(221,31);to=(221,53)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${sectionList.GUGAN_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

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

  private final static String _jspx_template0 = "\r\n";
  private final static String _jspx_template1 = "\r\n";
  private final static String _jspx_template2 = "  \r\n";
  private final static String _jspx_template3 = "  \r\n";
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "\r\n";
  private final static String _jspx_template6 = "\r\n";
  private final static String _jspx_template7 = "\r\n";
  private final static String _jspx_template8 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('사용자의 사용시간이 종료되었습니다. 다시 접속 해주시기 바랍니다.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template9 = "\r\n\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody { \r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n<script language=\"javascript\" src=\"/js/common.js\"></script> \r\n<script language=\"javascript\" src=\"/js/selectItem.js\"></script>\r\n<script language=\"javascript\" src=\"/js/admin.js\"></script>\r\n<script type=\"text/javascript\">\r\n//<![CDATA[\r\n\t           \r\n\tfunction  search(){\r\n\t\tvar w = document.searchForm;\r\n\r\n\t\tw.action = \"/admin/section/list.do\";\t\r\n\t\tw.submit();\r\n\t}\r\n\t\t\r\n\tfunction InitPage(){\t\t\r\n\t\tif('";
  private final static String _jspx_template10 = "'.length > 0){\r\n            alert('";
  private final static String _jspx_template11 = "');\r\n        }\t\t\r\n    }\r\n\r\n\r\n\tfunction registerPop(mod){\r\n\t\tvar mode = mod;\r\n\t\tvar title =\"\";\r\n\t\tvar param =\"\";\r\n\t\t\r\n\t\tif(mod == \"add\"){\r\n\t\t\ttitle=\"구간명추가\";\r\n\t\t}else{\r\n\t\t\tvar cnt = cntCheck();\r\n\t\t\tif(cnt <=0){\r\n\t\t\t\talert(\"처리 대상이 없습니다.\");\r\n\t\t\t\treturn;\r\n\t\t\t}else if(cnt > 1){\r\n\t\t\t\talert(\"수정은 1건씩만 가능합니다.\");\r\n\t\t\t\treturn;\r\n\t\t\t\t\r\n\t\t\t}\r\n\t\t\tparam += \"&modyGU_CD=\" + document.getElementById(\"modyGU_CD\").value;\r\n\t\t\tparam += \"&modyGUGAN_CD=\" + document.getElementById(\"modyGUGAN_CD\").value;\r\n\t\t\ttitle=\"구간명수정\";\r\n\t\t}\r\n\t\t\r\n\t\tvar url = \"/admin/section/registerView.do?mode=\" + mode + param;\r\n  \t\tpopUp(url, title, 580, 130);\t\r\n\t}\r\n\r\n\tfunction deletePop(){\r\n\t\tvar w = document.sectionForm;\r\n\t\tvar cnt = cntCheck();\r\n\t\tif(cnt <= 0){\r\n\t\t\talert(\"처리 대상이 없습니다.\");\r\n\t\t\treturn;\r\n\t\t}else{\r\n\t\t\tif (confirm(cnt + \"건을 삭제하시겠습니까?\")){\r\n\t\t\t\tw.action = \"/admin/section/delete.do\";\r\n\t\t\t\tw.submit();\r\n\t\t\t}else{\r\n\t\t\t\treturn;\r\n\t\t\t}\r\n\t\t}\r\n\t\t\r\n\t}\r\n\r\n\tfunction cntCheck(){\r\n\t\tvar w = document.sectionForm;\r\n\t\tvar select_item = document.getElementsByName(\"SELECT_ITEM\");\r\n\t\tvar item_check = document.getElementsByName(\"ITEM_CHECK\");\r\n\t\tvar gu_cd_arr = document.getElementsByName(\"GU_CD_ARR\");\r\n\t\tvar gagan_cd_arr = document.getElementsByName(\"GUGAN_CD_ARR\");\r\n\r\n\t\tvar modyGU_CD =  document.getElementById(\"modyGU_CD\");\r\n\t\tvar modyGUGAN_CD =  document.getElementById(\"modyGUGAN_CD\");\r\n\r\n\t\tvar cnt = 0;\t\t\r\n\r\n\t\tfor(var i = 0 ; i < select_item.length ; i++){\r\n\t\t\tif(select_item[i].checked == true){\r\n\t\t\t\titem_check[i].value = select_item[i].checked;\r\n\t\t\t\tmodyGU_CD.value=gu_cd_arr[i].value;\r\n\t\t\t\tmodyGUGAN_CD.value=gagan_cd_arr[i].value;\r\n\t\t\t\tcnt++;\r\n\t\t\t}\r\n\t\t}\r\n\t\treturn cnt;\r\n\t}\r\n\t\r\n//]]>\r\n</script>\r\n\r\n<body onload=\"javascript:InitPage();\">\r\n\r\n<table width=\"800\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t<tr>\r\n\t\t<td height=\"43\"><img src=\"/img/admin_cont3_title.gif\"\r\n\t\t\twidth=\"800\" height=\"43\"></td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td align=\"center\">\r\n\t\t<table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"1\" bgcolor=\"eaeaea\"></td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"14\"></td>\r\n\t\t\t</tr>\r\n\t\t</table>\r\n\r\n\t\t<table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t<tr>\r\n\t\t\t\t<td align=\"left\" height=\"22\" background=\"/img/tab_line_blue.gif\">\r\n\t\t\t\t\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t<tr>\t\r\n\t\t\t\t\t\t\t<td width=\"111\"><a href=\"#\"><img\r\n\t\t\t\t\t\t\t\tsrc=\"/img/sub_admin_section_on.gif \" alt=\"구간명 설정\" width=\"110\"\r\n\t\t\t\t\t\t\t\theight=\"22\" border=\"0\"></a>\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t<!-- c:if test=\"";
  private final static String _jspx_template12 = "\"> -->\r\n\t\t\t\t\t\t\t<td width=\"111\"><a href=\"/admin/deleteMove/list.do\"><img\r\n\t\t\t\t\t\t\t\tsrc=\"/img/sub_admin_deleteCopy_off.gif\" alt=\"일괄폐쇄 및 삭제\" width=\"110\"\r\n\t\t\t\t\t\t\t\theight=\"22\" border=\"0\"></a>\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t<!-- /c:if> -->\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td align=\"center\" class=\"contborder_blue\">\r\n\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"20px\"></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<!-- 시군구명 조회 -->\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td align=\"center\">\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\"\r\n\t\t\t\t\t\t\t\tstyle=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"\r\n\t\t\t\t\t\t\t\tclass=\"sub_table\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td width=\"100px\" height=\"28px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">시군구명</td>\r\n\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\t\t\t\t\t\t\t\t\t\t<form id=\"searchForm\" name=\"searchForm\">\r\n\t\t\t\t\t\t\t\t\t\t<table border=\"0\" align=\"left\">\r\n\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<select id=\"GU_CD\" name=\"GU_CD\" class=\"input_form1\" style=\"width:130px\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template13 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\"><img src=\"/img/inquiry_icon2.gif\" alt=\"조회\" border=\"0\" onClick=\"javascript:search();\"></a>\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t</form>\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t</td>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\t\t\t\t\t\t\r\n\t\t\t\t\t</tr>\t\t\t\t\r\n\t\t\t\t\t<!-- 시군구명 조회 끝-->\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"30px\"></td>\r\n\t\t\t\t\t</tr>\t\t\t\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"1\" bgcolor=\"#EAEAEA\"></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"30px\"></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t     <td height=\"34\" class=\"sub_stan\" align=\"left\">전체건수 : <span class=\"sub_stan_blue\">";
  private final static String _jspx_template14 = "</span> 건 </td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t<td align=\"left\">\r\n\t\t\t\t\t\t<form id=\"sectionForm\" name=\"sectionForm\">\t\t\t\t\t\r\n\t\t\t\t\t\t<input type=\"hidden\" id=\"modyGU_CD\" name=\"modyGU_CD\" value=\"\"/>\r\n\t\t\t\t\t\t<input type=\"hidden\" id=\"modyGUGAN_CD\" name=\"modyGUGAN_CD\" value=\"\"/>\t\r\n\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\"\r\n\t\t\t\t\t\t\tstyle=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"\r\n\t\t\t\t\t\t\tclass=\"sub_table\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td width=\"35px\" height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">\r\n\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" id=\"SELECT_ALL\" name=\"SELECT_ALL\" onclick=\"javascript:selectAll(this);\">\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">시군구명</td>\r\n\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">구간번호</td>\r\n\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">구간명</td>\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template15 = "\r\n\t\t\t\t\t\t\t\t <tr onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\">\r\n\t\t\t\t\t\t\t\t \t<td width=\"35px\" height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">\r\n\t\t\t\t\t\t\t\t \t\t<input type=\"checkbox\" id=\"SELECT_ITEM\" name=\"SELECT_ITEM\"/>\r\n\t\t\t\t\t\t\t\t \t\t<input type=\"hidden\" id=\"ITEM_CHECK\" name=\"ITEM_CHECK\" value=\"\"/>\r\n\t\t\t\t\t\t\t\t \t\t<input type=\"hidden\" id=\"GU_CD_ARR\" name=\"GU_CD_ARR\" value=\"";
  private final static String _jspx_template16 = "\"/>\r\n\t\t\t\t\t\t\t\t \t\t<input type=\"hidden\" id=\"GUGAN_CD_ARR\" name=\"GUGAN_CD_ARR\" value=\"";
  private final static String _jspx_template17 = "\"/>\t\t\t\t\t\t\t\t \t\t\r\n\t\t\t\t\t\t\t\t \t</td>\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t<td height=\"26\" align=\"center\">";
  private final static String _jspx_template18 = "</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template19 = "</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template20 = "</td>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template21 = "\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</form>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"40\" align=\"center\">\r\n\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td align=\"center\">\r\n\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<!-- 페이징시작 -->";
  private final static String _jspx_template22 = "<!-- 페이징끝 -->\t\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\t\r\n\t\t\t\t\t\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"10px\"></td>\r\n\t\t\t\t\t</tr>\t\t\t\t\t\r\n\t\t\t\t\t\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t<img src=\"/img/add_icon.gif\" alt=\"추가\" width=\"56\" height=\"18\" border=\"0\" style=\"cursor: pointer;\" onclick=\"javascript:registerPop('add')\">\r\n\t\t\t\t\t\t\t<img src=\"/img/mod_icon.gif\" alt=\"수정\" width=\"56\" height=\"18\" border=\"0\" style=\"cursor: pointer;\" onclick=\"javascript:registerPop('modify')\">\r\n\t\t\t\t\t\t\t<img src=\"/img/del_icon3.gif\" alt=\"삭제\" width=\"56\" height=\"18\" border=\"0\" style=\"cursor: pointer;\" onclick=\"javascript:deletePop()\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t</table>\r\n\t\t\t\t\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t\r\n\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n</table>\r\n\r\n</body>\r\n</html>\r\n\r\n";
}
