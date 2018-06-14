package jeus_jspwork._jsp._admin._commCode;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_orgCodeListNew_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      out.write(_jspx_template10);
      // jsp code [from=(160,10);to=(160,13)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MSG}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(161,13);to=(161,16)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MSG}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(250,17);to=(250,24)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GU_CODE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(278,51);to=(278,61)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${totalCount}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template22);
      // jsp code [from=(328,27);to=(328,44)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${strPageDivideForm}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);

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
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${orgCodelist}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("orgCodelist");
    _jspx_th_c_forEach_0.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template15);
            // jsp code [from=(308,76);to=(308,94)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${orgCodelist.ORG_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template16);
            // jsp code [from=(309,78);to=(309,97)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${orgCodelist.DEPT_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template17);
            // jsp code [from=(311,76);to=(311,93)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${orgCodelist.GU_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template18);
            // jsp code [from=(312,31);to=(312,50)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${orgCodelist.DEPT_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template19);
            // jsp code [from=(313,67);to=(313,86)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${orgCodelist.DEPT_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template20);
            // jsp code [from=(314,75);to=(314,98)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${orgCodelist.MANAGE_WORK}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template21);

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
  private final static String _jspx_template9 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/left_back.gif);\r\n}\r\n-->\r\n</style>\r\n<link href=\"/css/roads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n</head>\r\n<script type=\"text/javascript\" src=\"/js/jquery-1.6.1.js\"></script>\r\n<script language=\"javascript\" src=\"/js/PopupCalendar.js\"></script>\r\n<script language=\"javascript\" src=\"/js/common.js\"></script>\r\n<script language=\"javascript\" src=\"/js/admin.js\"></script>\r\n<script type=\"text/javascript\">\r\n//<![CDATA[\r\n\t           \r\n\tfunction search() {\r\n\t\tvar w = document.searchForm;\r\n\r\n\t\tw.action = \"/admin/commCode/orgCode.do\";\r\n\t\tw.submit();\r\n\t}\r\n\r\n\tfunction registerPop(action) {\r\n\t\tvar title = \"\";\r\n\t\tvar param = \"\";\r\n\t\tvar url = \"/admin/commCode/orgCodeRegisterView.do\";\r\n\t\tvar window = null;\r\n\r\n\t\tswitch (action) {\r\n\t\tcase 'add': {\r\n\t\t\turl += '?act=add';\r\n\t\t\twindow = popUp(url, title, 580, 200)\r\n\t\t\tvar id = setInterval(\r\n\t\t\t\tfunction() {\r\n\t\t\t\t\tif (window.document.readyState == 'complete') {\r\n\t\t\t\t\t\twindow.document.getElementById('imgRegister').style.display='inline';\t\t\t\t\t\t\r\n\t\t\t\t\t\tclearInterval(id);\r\n\t\t\t\t\t}\r\n\t\t\t\t},\r\n\t\t\t\t1000);\r\n\t\t\tbreak;\r\n\t\t}\r\n\t\tcase 'mod': { // 무족건 처음 하나만 처리.\r\n\t\t\turl += '?act=mod';\r\n\t\t\tvar $checkedItems = $('[name=\"SELECT_ITEM\"]:checked');\r\n\t\t\tif($checkedItems.length > 1){\r\n\t\t\t\talert('하나의 부서만 선택 하세요.');\r\n\t\t\t\treturn;\r\n\t\t\t}\r\n\t\t\tvar list = document.getElementsByName('SELECT_ITEM');\r\n\t\t\tvar len = list.length;\r\n\t\t\tvar isChecked = false;\r\n\t\t\tfor ( var i = 0; i < len; i++) {\r\n\t\t\t\tif (list[i].checked == true) {\r\n\t\t\t\t\twindow = popUp(url, title, 580, 200);\r\n\t\t\t\t\tvar id = setInterval(\r\n\t\t\t\t\t\t\tfunction() {\r\n\t\t\t\t\t\t\t\tif (window.document.readyState == 'complete') {\r\n\t\t\t\t\t\t\t\t\tvar doc = window.document;\r\n\t\t\t\t\t\t\t\t\tvar guNMs = document.getElementsByName('GU_NM_ARR');\r\n\t\t\t\t\t\t\t\t\tvar deptCDs = document.getElementsByName('DEPT_CD_ARR');\r\n\t\t\t\t\t\t\t\t\tvar deptNMs = document.getElementsByName('DEPT_NM_ARR');\r\n\t\t\t\t\t\t\t\t\tvar manageWorks = document.getElementsByName('MANAGE_WORK_ARR');\r\n\t\t\t\t\t\t\t\t\tfor ( var i = 0; i < len; i++) {\r\n\t\t\t\t\t\t\t\t\t\tif (list[i].checked == true) {\r\n\t\t\t\t\t\t\t\t\t\t\tisChecked = true;\r\n\t\t\t\t\t\t\t\t\t\t\tvar orgs = doc.getElementById('GU_CD_SELECT');\r\n\t\t\t\t\t\t\t\t\t\t\tvar selectedGuNM = guNMs[i].innerText;\r\n\t\t\t\t\t\t\t\t\t\t\tif (orgs.length > 1) {\r\n\t\t\t\t\t\t\t\t\t\t\t\tvar orgLen = orgs.options.length;\r\n\t\t\t\t\t\t\t\t\t\t\t\torgs.options[orgs.selectedIndex].selected = false;\r\n\t\t\t\t\t\t\t\t\t\t\t\tfor (var j = 0; j < orgLen; j++) {\r\n\t\t\t\t\t\t\t\t\t\t\t\t\tif (orgs.options[j].innerText === selectedGuNM) {\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\torgs.options[j].selected = true;\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\torgs.value = orgs.options[j].value;\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t}\r\n\t\t\t\t\t\t\t\t\t\t\t\t}\r\n\t\t\t\t\t\t\t\t\t\t\t}\r\n\t\t\t\t\t\t\t\t\t\t\tdoc.getElementById('DEPT_CD').value = deptCDs[i].value;\r\n\t\t\t\t\t\t\t\t\t\t\tdoc.getElementById('DEPT_NM').value = deptNMs[i].innerText;\r\n\t\t\t\t\t\t\t\t\t\t\tdoc.getElementById('MANAGE_WORK').value = manageWorks[i].innerText;\r\n\t\t\t\t\t\t\t\t\t\t\tbreak;\r\n\t\t\t\t\t\t\t\t\t\t}\r\n\t\t\t\t\t\t\t\t\t}\r\n\t\t\t\t\t\t\t\t\tdoc.getElementById('imgModify').style.display='inline';\r\n\t\t\t\t\t\t\t\t\tclearInterval(id);\r\n\t\t\t\t\t\t\t\t}\r\n\t\t\t\t\t\t\t}, \r\n\t\t\t\t\t\t1000);\r\n\t\t\t\t\tisChecked = true;\r\n\t\t\t\t\tbreak;\t\t\t\r\n\t\t\t\t}\r\n\t\t\t}\r\n\t\t\tif (!isChecked) {\r\n\t\t\t\talert('수정 대상이 없습니다.');\r\n\t\t\t\treturn;\r\n\t\t\t}\r\n\t\t\tbreak;\r\n\t\t}\r\n\t\t}\r\n\r\n\t\tvar closeId = setInterval( \r\n\t\t\tfunction () {\r\n\t\t\t\tif (window && window.closed) {\r\n\t\t\t\t\tclearInterval(closeId);\r\n\t\t\t\t\tsearch();\r\n\t\t\t\t}\r\n\t\t\t},\r\n\t\t\t2000\r\n\t\t);\r\n\t}\r\n\r\n\tfunction deletePop() {\r\n\t\tvar w = document.orgCodeForm;\r\n\t\tvar cnt = cntCheck();\r\n\t\tif (cnt <= 0) {\r\n\t\t\talert(\"처리 대상이 없습니다.\");\r\n\t\t\treturn;\r\n\t\t} else {\r\n\t\t\tif (confirm(cnt + \"건을 삭제하시겠습니까?\")) {\r\n\t\t\t\tw.action = \"/admin/commCode/orgCodeDelete.do\";\r\n\t\t\t\tw.submit();\r\n\t\t\t} else {\r\n\t\t\t\treturn;\r\n\t\t\t}\r\n\t\t}\r\n\r\n\t}\r\n\r\n\tfunction cntCheck() {\r\n\t\tvar w = document.orgCodeForm;\r\n\t\tvar select_item = document.getElementsByName(\"SELECT_ITEM\");\r\n\t\tvar item_check = document.getElementsByName(\"ITEM_CHECK\");\r\n\t\tvar org_cd_arr = document.getElementsByName(\"ORG_CD_ARR\"";
  private final static String _jspx_template10 = ");\r\n\t\tvar dept_cd_arr = document.getElementsByName(\"DEPT_CD_ARR\");\r\n\r\n\t\tvar cnt = 0;\r\n\r\n\t\tfor ( var i = 0; i < select_item.length; i++) {\r\n\t\t\tif (select_item[i].checked == true) {\r\n\t\t\t\titem_check[i].value = select_item[i].checked;\r\n\t\t\t\tcnt++;\r\n\t\t\t}\r\n\t\t}\r\n\t\treturn cnt;\r\n\t}\r\n\tfunction InitPage() {\r\n\t\tif ('";
  private final static String _jspx_template11 = "'.length > 0) {\r\n\t\t\talert('";
  private final static String _jspx_template12 = "');\r\n\t\t}\r\n\t}\r\n\t\r\n//]]>\r\n</script>\r\n\r\n<body onload=\"javascript:InitPage();\">\r\n<input type=\"hidden\" name=\"excel\" value=\"\">\r\n<table width=\"800\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t<tr>\r\n\t\t<td height=\"43\"><img src=\"/img/admin_cont3_title.gif\" width=\"800\"\r\n\t\t\theight=\"43\"></td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td align=\"center\">\r\n\t\t<table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"1\" bgcolor=\"eaeaea\"></td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td height=\"14\"></td>\r\n\t\t\t</tr>\r\n\t\t</table>\r\n\r\n\t\t<table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t<tr>\r\n\t\t\t\t<td align=\"left\" height=\"22\" background=\"/img/tab_line_blue.gif\">\r\n\t\t\t\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td width=\"111\"><a\r\n\t\t\t\t\t\t\thref=\"/admin/commCode/areaCode.do\"><img\r\n\t\t\t\t\t\t\tsrc=\"/img/sub_admin_title4_off.gif\" alt=\"지역코드\" width=\"110\"\r\n\t\t\t\t\t\t\theight=\"22\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t<td width=\"111\"><a\r\n\t\t\t\t\t\t\thref=\"#\"><img\r\n\t\t\t\t\t\t\tsrc=\"/img/sub_admin_title5_on.gif\" alt=\"부서코드\" width=\"110\"\r\n\t\t\t\t\t\t\theight=\"22\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t<td width=\"111\"><a\r\n\t\t\t\t\t\t\thref=\"/admin/commCode/purposeCode.do\"><img\r\n\t\t\t\t\t\t\tsrc=\"/img/sub_admin_title6_off.gif\" alt=\"점용목적코드\" width=\"110\"\r\n\t\t\t\t\t\t\theight=\"22\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t<td width=\"111\"><a href=\"/admin/commCode/taxCode.do\"><img\r\n\t\t\t\t\t\t\tsrc=\"/img/sub_admin_title7_off.gif\" alt=\"과세구분코드\" width=\"110\"\r\n\t\t\t\t\t\t\theight=\"22\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t<!--  //********** BEGIN_현진_20120315 -->\r\n\t\t\t\t\t\t<!-- \r\n\t\t\t\t\t\t<td width=\"111\"><a href=\"/jsp/admin/commCode/zipCodeList.jsp\"><img\r\n\t\t\t\t\t\t\tsrc=\"/img/sub_admin_title8_off.gif\" alt=\"우편번호코드\" width=\"110\"\r\n\t\t\t\t\t\t\theight=\"22\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t-->\r\n\t\t\t\t\t\t<td width=\"111\"><a href=\"/admin/commCode/seal.do\"><img\r\n\t\t\t\t\t\t\tsrc=\"/img/sub_admin_seal_off.gif\" alt=\"직인등록\" width=\"110\"\t\t\t\t\t\t\t         \r\n\t\t\t\t\t\t\theight=\"22\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t<!--   //********** END_현진_20120315 -->\r\n\t\t\t\t\t\t<td width=\"111\"><a\r\n\t\t\t\t\t\t\thref=\"/admin/commCode/jojungCode.do\"><img\r\n\t\t\t\t\t\t\tsrc=\"/img/sub_admin_title9_off.gif\" alt=\"조정계수\" width=\"110\"\r\n\t\t\t\t\t\t\theight=\"22\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t<td width=\"111\"><a href=\"/admin/commCode/gradeCode.do\"><img\r\n\t\t\t\t\t\t\tsrc=\"/img/sub_admin_title12_off.gif\" alt=\"등급코드\" width=\"110\"\r\n\t\t\t\t\t\t\theight=\"22\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t<td width=\"111\"><a href=\"/admin/commCode/officeCode.do\"><img\r\n\t\t\t\t\t\t\tsrc=\"/img/sub_admin_title13_off.gif\" alt=\"업체코드\" width=\"110\"\r\n\t\t\t\t\t\t\theight=\"22\" border=\"0\"></a></td>\t\t\t\t\t\t\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td align=\"center\" class=\"contborder_blue\">\r\n\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"20px\"></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<!-- 시군구명 조회 -->\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td align=\"center\">\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\"\r\n\t\t\t\t\t\t\t\tstyle=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"\r\n\t\t\t\t\t\t\t\tclass=\"sub_table\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td width=\"100px\" height=\"28px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">시군구명</td>\r\n\t\t\t\t\t\t\t\t\t<td bgcolor=\"eaeaea\" class=\"table_bl_left\" >\r\n\t\t\t\t\t\t\t\t\t\t<form id=\"searchForm\" name=\"searchForm\">\r\n\t\t\t\t\t\t\t\t\t\t<table border=\"0\" align=\"left\">\r\n\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<select id=\"GU_CD\" name=\"GU_CD\" class=\"input_form1\" style=\"width:130px\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template13 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\"><img src=\"/img/inquiry_icon2.gif\" alt=\"조회\" border=\"0\" onClick=\"javascript:search();\"></a>\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t</form>\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t</td>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\t\t\t\t\t\t\r\n\t\t\t\t\t</tr>\t\t\t\t\r\n\t\t\t\t\t<!-- 시군구명 조회 끝-->\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"30px\"></td>\r\n\t\t\t\t\t</tr>\t\t\t\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"1\" bgcolor=\"#EAEAEA\"></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"30px\"></td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"34\" class=\"sub_stan\" align=\"left\">\r\n  \t\t\t\t\t\t<table width=\"100%\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td>전체건수 : <span class=\"sub_stan_blue\">";
  private final static String _jspx_template14 = "</span> 건</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"right\">\r\n\t\t\t\t\t\t\t\t\t\t<img src=\"/img/mod_icon2.gif\" alt=\"수정\" width=\"34\" height=\"18\" border=\"0\" onClick=\"javascript:registerPop('mod');\" style=\"cursor: pointer\">\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t    </td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t<td align=\"left\">\r\n\t\t\t\t\t\t<form id=\"orgCodeForm\" name=\"orgCodeForm\">\t\t\t\t\t\r\n\t\t\t\t\t\t<input type=\"hidden\" id=\"modyGU_CD\" name=\"modyGU_CD\" value=\"\"/>\r\n\t\t\t\t\t\t<input type=\"hidden\" id=\"modyGUGAN_CD\" name=\"modyGUGAN_CD\" value=\"\"/>\t\r\n\t\t\t\t\t\t<table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\"\r\n\t\t\t\t\t\t\tstyle=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"\r\n\t\t\t\t\t\t\tclass=\"sub_table\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td width=\"35px\" height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">\r\n\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" id=\"SELECT_ALL\" name=\"SELECT_ALL\" onclick=\"javascript:selectAll(this);\">\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">시군구명</td>\r\n\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">부서코드</td>\r\n\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">부서명</td>\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t<td align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">담담업무</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template15 = "\r\n\t\t\t\t\t\t\t\t <tr onMouseOver=\"this.style.backgroundColor='#f6f7f8'\" onMouseOut=\"this.style.backgroundColor=''\">\r\n\t\t\t\t\t\t\t\t \t<td width=\"35px\" height=\"26px\" align=\"center\" bgcolor=\"e5eff8\" class=\"sub_table_b\">\r\n\t\t\t\t\t\t\t\t \t\t<input type=\"checkbox\" id=\"SELECT_ITEM\" name=\"SELECT_ITEM\"/>\r\n\t\t\t\t\t\t\t\t \t\t<input type=\"hidden\" id=\"ITEM_CHECK\" name=\"ITEM_CHECK\" value=\"\"/>\r\n\t\t\t\t\t\t\t\t \t\t<input type=\"hidden\" id=\"ORG_CD_ARR\" name=\"ORG_CD_ARR\" value=\"";
  private final static String _jspx_template16 = "\"/>\r\n\t\t\t\t\t\t\t\t \t\t<input type=\"hidden\" id=\"DEPT_CD_ARR\" name=\"DEPT_CD_ARR\" value=\"";
  private final static String _jspx_template17 = "\"/>\t\t\t\t\t\t\t\t \t\t\r\n\t\t\t\t\t\t\t\t \t</td>\r\n\t\t\t\t\t\t\t\t \t<td id=\"GU_NM_ARR\" name=\"GU_NM_ARR\" height=\"26\" align=\"center\">";
  private final static String _jspx_template18 = "</td>\r\n\t\t\t\t\t\t\t\t\t<td align=\"center\">";
  private final static String _jspx_template19 = "</td>\r\n\t\t\t\t\t\t\t\t\t<td id=\"DEPT_NM_ARR\" name=\"DEPT_NM_ARR\" align=\"center\">";
  private final static String _jspx_template20 = "</td>\r\n\t\t\t\t\t\t\t\t\t<td id=\"MANAGE_WORK_ARR\" name=\"MANAGE_WORK_ARR\" align=\"center\">";
  private final static String _jspx_template21 = "</td>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template22 = "\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</form>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t<td height=\"40\" align=\"center\">\r\n\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td align=\"center\">\r\n\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<!-- 페이징시작 -->";
  private final static String _jspx_template23 = "<!-- 페이징끝 -->\t\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\t\r\n\t\t\t\t\t\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td height=\"10px\"></td>\r\n\t\t\t\t\t</tr>\t\t\t\t\t\r\n\t\t\t\t\t\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t<img src=\"/img/add_icon.gif\" alt=\"추가\" width=\"56\" height=\"18\" border=\"0\" style=\"cursor: pointer;\" onclick=\"javascript:registerPop('add')\">\r\n\t\t\t\t\t\t\t<img src=\"/img/del_icon3.gif\" alt=\"삭제\" width=\"56\" height=\"18\" border=\"0\" style=\"cursor: pointer;\" onclick=\"javascript:deletePop()\">\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t</table>\r\n\t\t\t\t\r\n\t\t\t\t</td>\r\n\t\t\t</tr>\r\n\t\t\t\r\n\r\n\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n</table>\r\n\r\n</body>\r\n</html>\r\n\r\n";
}
