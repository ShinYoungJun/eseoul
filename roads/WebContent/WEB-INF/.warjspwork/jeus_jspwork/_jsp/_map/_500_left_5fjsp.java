package jeus_jspwork._jsp._map;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_left_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(4,3);to=(9,1)]
      
      	String 		userId	= (String)session.getAttribute("sessionUserId");
      	
      	if(userId == null)
      	{ 

      out.write(_jspx_template8);
      // jsp code [from=(17,3);to=(19,1)]
      
      	}

      out.write(_jspx_template9);
      out.write(_jspx_template10);
      // jsp code [from=(223,51);to=(223,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${countPerPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(224,50);to=(224,61)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(229,160);to=(229,164)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${guNm}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(229,215);to=(229,219)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${name}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template20);

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
            out.write(_jspx_template15);
            // jsp code [from=(267,36);to=(267,46)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.GU_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template16);
            // ----  c:if ---- invoke //
            if (_jspx_th_c_if_0_fn(pageContext, _jspx_th_c_forEach_0)) return true;


            out.write(_jspx_template18);
            // jsp code [from=(267,102);to=(267,112)]
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

  private boolean _jspx_th_c_if_0_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:if ---- //
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = new org.apache.taglibs.standard.tag.rt.core.IfTag();
    _jspx_th_c_if_0.setPageContext(pageContext);
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${guNm == list.GU_NM}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template17);

        } while (_jspx_th_c_if_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_0.release();
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
  private final static String _jspx_template8 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('세션이 종료 되었습니다.');\r\n\r\n\t\t\topener.parent.location.href=\"/admin/user/login.do\"\r\n\t\t\twindow.self.close();\r\n\t\t\t\r\n\t\t</script>\r\n";
  private final static String _jspx_template9 = "\r\n<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\" />\r\n<title>:::::  :::::</title>\r\n<link href=\"/css/Mroads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/mapImg/left_background.gif);\r\n}\r\n-->\r\n</style>\r\n\r\n<script language=\"javaScript\" type=\"text/javascript\">\r\n<!--\r\n//----------------  ajax start ------------------------------------------------------------//\r\n\tvar xmlHttp;\r\n\tvar from, to;\r\n\tvar type;\r\n\t\r\n\t\r\n\r\n\tfunction createXMLHttpRequest() {\r\n\t  if (window.ActiveXObject) {\r\n\t       xmlHttp = new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n\t  } \r\n\t  else if (window.XMLHttpRequest) {\r\n\t       xmlHttp = new XMLHttpRequest();\r\n\t  }\r\n\t}\r\n\t\r\n\t/*\r\n\t *\t 행정구역 리스트 변경\r\n\t */\r\n   function getBJDong(){\r\n\t\tfrom\t= 'gu_cd';\r\n\t\tto\t\t= 'bj_cd';\r\n\t\t\r\n\t\tvar w = document.check;\r\n\t\t\r\n\t\tvar selectedValue = document.getElementById(from).value;\r\n\r\n\t\tif(selectedValue == ''){\r\n\t\t\tclearAllList();\r\n\t\t\treturn;\r\n\t\t}\r\n\t\t\r\n\t\tvar url = \"/getAreaCode.do?\" + createParameter(from, to);\r\n\r\n\t  \tcreateXMLHttpRequest();\r\n\t \txmlHttp.onreadystatechange = handleStateChange;\r\n\t  \txmlHttp.open(\"GET\", url, true);\r\n\t  \txmlHttp.send(null);\r\n\t}\r\n\t\r\n\t/*\r\n\t *\t쿼리에 사용할 파라메터값 설정\r\n\t */\r\n\tfunction createParameter(from, to) {\r\n\t \t\r\n\t \tvar valFrom = document.getElementById('gu_cd').value;\r\n\t \tvar valTo = document.getElementById('bj_cd').value;\r\n\t \t\r\n\t  \tvar queryString = \"from=gu&to=bjdong&valFrom=\"+valFrom+\"&valTo=\"+valTo;\r\n\t  \t\r\n\t  \treturn queryString;\r\n\t}\r\n\t\r\n\t/*\r\n\t *\t응답을 받아 리스트를 update\r\n\t */\r\n\tfunction handleStateChange() {\r\n\r\n\t  if(xmlHttp.readyState == 4) {\r\n\t       if(xmlHttp.status == 200) {\r\n\t\t           \tupdateList(to);\r\n\t       }\r\n\t  }\r\n\t}\r\n\t\r\n\t/*\r\n\t *\t모든 리스트를 초기화\r\n\t */\r\n\tfunction clearAllList() {\r\n\t\r\n\t  var bjdongObj = document.getElementById('bj_cd');\r\n\t  \r\n\t  while(bjdongObj.childNodes.length > 0) {\r\n\t       bjdongObj.removeChild(bjdongObj.childNodes[0]);\r\n\t  }\r\n\t  bjdongObj.options[0] = new Option('::선택::', '');\r\n\t}\r\n\t\r\n\t/*\r\n\t *\t행정구역 리스트를 초기화\r\n\t */\r\n\tfunction clearList(to) {\r\n\t\r\n\t  var toObject = document.getElementById(to);\r\n\r\n\t  while(toObject.childNodes.length > 0) {\r\n\t       toObject.removeChild(toObject.childNodes[0]);\r\n\t  }\r\n\t}\r\n\t\t\r\n\t/*\r\n\t *\t행정구역 리스트를 update\r\n\t */\r\n\tfunction updateList(to) {\r\n\r\n\t  clearList(to);\r\n\t  \r\n\t  var toObj = document.getElementById(to);\r\n\t  var values = xmlHttp.responseXML.getElementsByTagName('value');\r\n\t  var names = xmlHttp.responseXML.getElementsByTagName('name');\r\n\t  var j = 1;\r\n\t   \r\n\t   // 선택 표시 option 생성\r\n\r\n\t  if(values.length>0){\r\n\t  \tvar option = new Option('::선택::', '');\r\n\t  \ttoObj.options[0]= option;\r\n\t  }\r\n\t  else{\r\n\t  var option = new Option('없음', '');\r\n\t  \ttoObj.options[0]= option;\r\n\t  }\r\n\t  \r\n\t  //  리스트 수만큼 option을 달아준다)\r\n\t  \r\n\t  for(var i = 0; i < values.length; i++) {\r\n\t \r\n\t\t\t\t//var option = new Option(names[i].firstChild.nodeValue, values[i].firstChild.nodeValue);\r\n\t       \t\t\t//toObj.options[i+j] = option;\r\n\t\t\t\tvar opt = document.createElement('option');\r\n\t\t       \t\topt.value = values[i].firstChild.nodeValue;\r\n\t\t       \t\topt.text = names[i].firstChild.nodeValue;\r\n\t       \t\t\topt.title = names[i].firstChild.nodeValue;\r\n\t       \t\t\ttoObj.add(opt);\r\n\t  }\r\n\r\n\t}\r\n\r\n\t//----------------  ajax end ------------------------------------------------------------//\r\n\t\r\n\t\t// 점용 종류 선택시 점용 목적 코드 나오게 함.\r\n\tfunction\tselect_searchType()\r\n\t{\r\n\t\tvar form = document.check;\r\n\t\tvar searchType1 = form.searchType1.options[form.searchType1.selectedIndex].value;\r\n\t\t\r\n\t\tdocument.getElementById(\"IFRM_searchType\").src=\"/map/searchType.do?searchType1=\"+searchType1;\r\n\t}\r\n\t\r\n\tfunction jumsearch()\r\n\t{\r\n\t\tvar form = document.check;\r\n\t\t\r\n\t\tvar searchType1 = form.searchType1.options[form.searchType1.selectedIndex].value;\r\n\t\t\r\n\t\tvar iFrm = document.getElementById(\"IFRM_searchType\");\r\n\t\tvar type = iFrm.contentWindow.document.getElementById(\"type\").value;;\r\n\t\tvar type_name = iFrm.contentWindow.document.getElementById('type').options[iFrm.contentWindow.document.getElementById('type').selectedIndex].text;\r\n\t\t\r\n\t\tvar gu_cd = ";
  private final static String _jspx_template10 = "form.gu_cd.value;\r\n\t\tvar bj_cd = form.bj_cd.value;\r\n\t\tvar bj_nm = document.getElementById('bj_cd').options[document.getElementById('bj_cd').selectedIndex].text;\r\n\t\tvar spc_cd = \"\";\r\n\t\tvar bonbun = form.bonbun.value;\r\n\t\tvar bubun = form.bubun.value;\r\n\t\tvar jumyongName = form.jumyongName.value;\r\n\r\n\t\tif(type == \"\"){\r\n\t\t\talert(\"점용구분을 선택하세요\");\r\n\t\t\tiFrm.contentWindow.document.getElementById(\"type\").focus();\r\n\t\t\treturn;\r\n\t\t}\r\n\t\telse if(gu_cd == \"\"){\r\n\t\t\talert(\"시군구를 선택하세요\");\r\n\t\t\tform.gu_cd.focus();\r\n\t\t\treturn;\r\n\t\t}\r\n\t\telse if(bj_cd == \"\"){\r\n\t\t\talert(\"읍면동을 선택하세요\");\r\n\t\t\tform.bj_cd.focus();\r\n\t\t\treturn;\r\n\t\t}\r\n\t\telse if(form.spc_cd.checked == true){\r\n\t\t\tspc_cd = '2';\r\n\t\t}\r\n\t\tresult.location.href=\"/map/searchresult.do?searchType1=\"+searchType1+\"&type=\"+type+\"&type_name=\"+type_name+\"&gu_cd=\"+gu_cd+\"&bj_cd=\"+bj_cd+\"&bj_nm=\"+bj_nm+\"&spc_cd=\"+spc_cd+\"&bonbun=\"+bonbun+\"&bubun=\"+bubun+\"&jumyongName=\"+jumyongName;\r\n\t\tresult.document.getElementById(\"search\").innerHTML = \"<img src='/img/mapImg/sing.gif'> 검색중\";\r\n\t\tresult.result_show.style.display = \"none\";\r\n\t\t\r\n\t}\r\n\t\t\r\n\t\r\n//-->\r\n</script>\r\n</head>\r\n<body onload=\"getBJDong()\">\r\n<form name=\"check\" method=\"post\">\r\n<input type=\"hidden\" name=\"countPerPage\" value=\"";
  private final static String _jspx_template11 = "\">\r\n<input type=\"hidden\" name=\"currentPage\" value=\"";
  private final static String _jspx_template12 = "\"/>\r\n\r\n<table width=\"260\" height=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t<tr>\r\n\t\t<td width=\"10\"></td>\r\n\t\t<td class=\"Map_stan\" background=\"/img/mapImg/tab_a.gif\" width=\"240\" height=\"37\" align=\"center\"><!-- span class=\"sub_stan_blue\" --><font color=\"#ffffff\"><b>";
  private final static String _jspx_template13 = "청<!-- /span --> <!-- span class=\"sub_stan_b\" -->";
  private final static String _jspx_template14 = "</b><!-- /span -->님 환영합니다</font></td>\r\n\t\t<td width=\"10\"></td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td width=\"10\" height=\"250\"></td>\r\n\t\t<td valign=\"top\" align=\"center\" valign=\"top\" bgcolor=\"f9f9f9\" class=\"M_leftborder\">\r\n\t\t\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td valign=\"top\">\r\n\t\t\t\t\t\t\t\t\t<table width=\"220\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td height=\"33\"><img src=\"/img/mapImg/left_title1.gif\" alt=\"점용지 검색\" width=\"220\" height=\"33\"></td>\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" valign=\"top\" class=\"M_leftborder2\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<table width=\"198\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"Map_stan\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"59\" height=\"22\" class=\"Map_stan_b\">점용목적</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td><select id=\"searchType1\" name=\"searchType1\" class=\"input_form1\" style=\"width:139px; background:e0eaf7\" onchange=\"javascript:select_searchType();\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"jumyong\" selected>일반 점용</option>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"gapan\">보도상 영업 및 노점시설</option>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"59\" height=\"22\" class=\"Map_stan_b\">점용구분</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"sub_stan\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<iframe id=\"IFRM_searchType\" align=\"absmiddle\" scrolling=\"no\" frameborder=\"0\" framespacing=\"0\" width=\"100%\" height=\"25\" src=\"/map/searchType.do?searchType1=jumyong\"></iframe>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td height=\"22\">시/군/구</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<select id=\"gu_cd\" name=\"GU_CD\" class=\"input_form1\" style=\"width:139px\" onchange=\"javascript:getBJDong();\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"\">::선택::</option>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template15 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"";
  private final static String _jspx_template16 = "\" ";
  private final static String _jspx_template17 = "selected";
  private final static String _jspx_template18 = ">";
  private final static String _jspx_template19 = "</option>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template20 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td height=\"22\">읍/면/동</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<select id=\"bj_cd\" name=\"BJ_CD\" class=\"input_form1\" style=\"width:139px\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option>::선택::</option>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td height=\"22\">산/번지</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td><input id=\"spc_cd\" name=\"SAN\" type=\"checkbox\" value=\"2\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input id=\"bonbun\" name=\"bun1\" type=\"text\" class=\"input_form1\" style=\"width:48px\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t-\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input id=\"bubun\" name=\"bun2\" type=\"text\" class=\"input_form1\" style=\"width:48px\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</table></td>\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td height=\"9\" background=\"/img/mapImg/left_bott_line.gif\"></td>\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t</table></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td valign=\"top\">\r\n\t\t\t\t\t\t\t\t\t<table width=\"220\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td height=\"32\"><img src=\"/img/mapImg/left_title2.gif\" alt=\"점용인 검색\" width=\"220\" height=\"32\"></td>\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td align=\"center\" valign=\"top\" class=\"M_leftborder2\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<table width=\"198\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"Map_stan\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"59\" height=\"22\">점용인</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td><input name=\"jumyongName\" type=\"text\" class=\"input_form1\" style=\"width:139px\"></td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</table></td>\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td height=\"9\" background=\"/img/mapImg/left_bott_line.gif\"></td>\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t</table></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td height=\"40\" align=\"center\"><a href=\"#\"><img src=\"/img/mapImg/search_icon.gif\" onClick=\"javascript:jumsearch();\" onkeypress=\"javascript:jumsearch();\" alt=\"검색\" width=\"220\" height=\"20\" border=\"0\"></a></td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t</td>\r\n\t\t<td width=\"10\"></td>\r\n\t</tr>\r\n\t<tr valign=\"bottom\">\r\n\t\t<td width=\"10\" height=\"38\" ></td>\r\n\t\t<td><img src=\"/img/mapImg/result_title.gif\" width=\"240\" height=\"31\"></td>\r\n\t\t<td width=\"10\"></td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td width=\"10\"></td>\r\n    \t<td height=\"100%\" valign=\"top\" align=\"center\">\r\n\t      \t<table height=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t      \t\t<tr><td width=\"100%\" height=\"100%\" bgcolor=\"f9f9f9\" class=\"M_leftborder\" style=\"padding-left:3px\">\r\n\t\t\t      \t\t<iframe name=\"result\" width=\"100%\" height=\"100%\" scrolling=\"auto\" marginwidth=\"0\" marginheight=\"no\" frameborder=\"no\" src=\"/jsp/map/jumyong_result.jsp\" allowtransparency=\"True\" title=\"검색결과\"></iframe>\r\n\t\t   \t      \t\t</td>\r\n\t      \t\t</tr>\r\n\t      \t</table></td>\r\n\t      <td width=\"10\"></td>\r\n   \t</tr>\r\n\r\n</form>\r\n</table>\r\n\r\n</body>\r\n</html>\r\n";
}
