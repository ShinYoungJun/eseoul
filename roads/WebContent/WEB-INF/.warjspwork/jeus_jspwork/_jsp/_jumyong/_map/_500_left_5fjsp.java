package jeus_jspwork._jsp._jumyong._map;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_left_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(22,5);to=(22,40)]
      out.write(_jspx_template9);
      // jsp code [from=(23,21);to=(23,37)]
      out.write(_jspx_template10);
      // jsp code [from=(24,31);to=(24,46)]
      out.write(_jspx_template11);
      // jsp code [from=(45,6);to=(45,44)]
      out.write(_jspx_template12);
      // jsp code [from=(69,10);to=(69,61)]
      out.write(_jspx_template13);
      // jsp code [from=(86,51);to=(86,97)]
      out.write(_jspx_template14);
      // jsp code [from=(120,7);to=(120,19)]
      out.write(_jspx_template15);
      // jsp code [from=(131,24);to=(131,48)]
      out.write(_jspx_template16);
      // jsp code [from=(134,16);to=(134,35)]
      out.write(_jspx_template17);
      // jsp code [from=(136,31);to=(136,52)]
      out.write(_jspx_template18);
      // jsp code [from=(140,46);to=(140,75)]
      out.write(_jspx_template19);
      // jsp code [from=(142,32);to=(142,54)]
      out.write(_jspx_template20);
      out.write(_jspx_template21);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template27);
      // jsp code [from=(269,33);to=(269,37)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${guNm}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template28);
      // jsp code [from=(269,47);to=(269,51)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${name}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template29);
      // jsp code [from=(293,18);to=(293,26)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${use_type}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template30);
      // jsp code [from=(301,18);to=(301,32)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${occupancy_type}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template31);
      // jsp code [from=(309,18);to=(309,34)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${taxation_section}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template32);
      // jsp code [from=(317,18);to=(317,24)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${guList}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template33);
      // jsp code [from=(325,18);to=(325,24)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bjList}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template34);
      // jsp code [from=(332,69);to=(332,75)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bonbun}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template35);
      // jsp code [from=(333,69);to=(333,74)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bubun}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template36);
      // jsp code [from=(360,65);to=(360,74)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ownerName}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template37);

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
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${jumyongList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("list");
    _jspx_th_c_forEach_0.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template22);
            // jsp code [from=(180,25);to=(180,32)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.XC}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template23);
            // jsp code [from=(180,38);to=(180,45)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.YC}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template24);
            // jsp code [from=(180,86);to=(180,95)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template25);
            // jsp code [from=(180,137);to=(180,150)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.ADMIN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template26);

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

  private final static String _jspx_template0 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n";
  private final static String _jspx_template1 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('사용자의 사용시간이 종료되었습니다. 다시 접속 해주시기 바랍니다.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template2 = "\r\n";
  private final static String _jspx_template3 = "\r\n";
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "  \r\n";
  private final static String _jspx_template6 = "  \r\n";
  private final static String _jspx_template7 = "\r\n";
  private final static String _jspx_template8 = "\r\n";
  // jsp code [from=(22,5);to=(22,40)]
  private final static String _jspx_template9 = "\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<link href=\"/css/Mroads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/mapImg/left_background.gif);\r\n}\r\n-->\r\n</style>\r\n<script language=\"javascript\" src=\"/js/common.js\"></script>\r\n<script language=\"javascript\" src=\"/js/Ajax_request.js\"></script>\r\n<script language=\"javascript\" src=\"/js/jquery-1.6.1.js\"></script>\r\n<script type=\"text/javascript\">\r\n";
  // jsp code [from=(23,21);to=(23,37)]
  private final static String _jspx_template10 = "\r\nvar LIMIT = 32;\t";
  // jsp code [from=(24,31);to=(24,46)]
  private final static String _jspx_template11 = "\r\nvar queue = new Array();  ";
  // jsp code [from=(45,6);to=(45,44)]
  private final static String _jspx_template12 = "\r\n\r\nfunction putMarker( no, name, x, y, icon, w, h) {\r\n\ttop.map.addMaker(x,y,icon,w,h,name,function(){\r\n\t\ttop.map.left.jumyongView(no);\r\n\t});\r\n}\r\n\r\nfunction addMarker() {\r\n\tvar count = LIMIT;\r\n\tvar markers = queue.markers;\r\n\twhile(count) {\r\n\t\tif (markers != null && markers.length > 0) {\r\n\t\t\tvar marker = markers.shift();\r\n\t\t\tputMarker(marker.no, decodeURI(marker.name), marker.xc, marker.yc, \"/img/mapImg/marker.png\", 51, 51);\t\t\t \r\n\t\t}else{\r\n\t\t\tbreak;\r\n\t\t}\r\n\t\t--count;\r\n\t}\r\n\t\r\n\t";
  // jsp code [from=(69,10);to=(69,61)]
  private final static String _jspx_template13 = "\r\n\tif (markers == null || markers.length < LIMIT) {\r\n\t\tnextData();\r\n\t}\r\n\tif (markers != null && markers.length > 0) {\r\n\t\tmarkers.timerId = setTimeout(function() {addMarker();}, 10);\r\n\t}\r\n};\r\n\r\nfunction nextData() {\r\n\t if(queue.length> 0 ){\t  \r\n\t\t \tqueue.timerId = setTimeout(function(){getData(queue.shift());},50);\r\n\t  }\r\n};\r\n\r\nfunction getData(guCode){\r\n\tvar $bjcd = $('#BJ_CD'); \r\n\tvar $section = $('#SECTION'); \r\n    var $type = $('#TYPE');\r\n\tvar $tax_set = $('#TAX_SET');\r\n    var $bonbun = $('#BONBUN');\r\n    var $bubun = $('#BUBUN');\r\n    var $GU_CD = $('#GU_CD');\r\n    var $OWNER_NAME = $('#OWNER_NAME');\r\n     ";
  // jsp code [from=(86,51);to=(86,97)]
  private final static String _jspx_template14 = "\r\n\t $.ajax({\r\n\t\t url : '/jumyong/map/search4json.do',\r\n\t\t contentType : 'application/x-www-form-urlencoded; charset=utf-8',\r\n\t\t cache : false,\r\n\t\t type : 'post',\r\n\t\t data :{ \r\n\t\t\t     bjcd : $bjcd.val(),\r\n\t\t\t     section : $section.val(),\r\n\t\t\t     type : $type.val(),\r\n\t\t\t     tax_set : $tax_set.val(),\r\n\t\t\t     bonbun : $bonbun.val(),\r\n\t\t\t     bubun : $bubun.val(),\r\n\t\t\t     gucd  : guCode,\r\n\t\t\t     OWNER_NAME : $OWNER_NAME.val()\r\n\t\t\t    },\r\n\t\t dataType : 'json',\r\n\t\t success : function(data,textStatus,jqXHR){ ";
  // jsp code [from=(120,7);to=(120,19)]
  private final static String _jspx_template15 = "\r\n\t\t\t switch(data.result) {\r\n\t\t\t case 'success': {\r\n\t\t\t\t if (data.list != null && data.list.length > 0) {\r\n\t\t\t\t\t if (queue.markers == null) {\r\n\t\t\t\t\t\t queue.markers = [];\r\n\t\t\t\t\t }\r\n\t\t\t\t\t queue.markers = queue.markers.concat(data.list);\r\n\t\t\t\t\t addMarker();\r\n\t\t\t\t }\r\n\t\t\t\t break;\r\n\t\t\t }\r\n\t\t\t case 'fail':\r\n\t\t\t case 'error':\r\n\t\t\t default: {\r\n\t\t\t\t nextData();\t\t\t\t \r\n\t\t\t\t break;\r\n\t\t\t }\r\n\t\t\t }\r\n\t\t },\r\n\t\t error : function(){\t\t\t  \t    \r\n\t\t } \r\n\t});\t\t   \r\n}\r\nfunction jumsearch(){\r\n\tvar $bjcd = $('#BJ_CD');     \r\n\tvar $section = $('#SECTION');\r\n  var $type = $('#TYPE');\r\n\tvar $tax_set = $('#TAX_SET');\r\n  var $bonbun = $('#BONBUN');\r\n  var $bubun = $('#BUBUN');\r\n  var $GU_CD = $('#GU_CD');\r\n  var $OWNER_NAME = $('#OWNER_NAME');\r\n   \r\n  ";
  // jsp code [from=(131,24);to=(131,48)]
  private final static String _jspx_template16 = "\r\n  if (queue != null) {\r\n\t\tif (queue.timerId) {\r\n\t\t\tclearTimeout(queue.timerId);\r\n\t\t}\r\n\t\tif (queue.markers && queue.markers.timerId) {\r\n\t\t\tclearTimeout(queue.markers.timerId);\t\t\t\r\n\t\t}\r\n\t  queue.markers = null;\r\n\t\tqueue = new Array();\r\n  }\r\n\tif($bjcd == ''){  ";
  // jsp code [from=(134,16);to=(134,35)]
  private final static String _jspx_template17 = "\r\n \t\talert('데이터량으로 인해 최소 법정동을 선택하셔야 합니다.');\r\n\t\treturn;\r\n\t}else{    ";
  // jsp code [from=(136,31);to=(136,52)]
  private final static String _jspx_template18 = "\r\n\t\tvar guCode = $GU_CD.val(); \r\n\t\tif (guCode == '000') {  ";
  // jsp code [from=(140,46);to=(140,75)]
  private final static String _jspx_template19 = "\r\n\t\t   \tvar options = $GU_CD.find('option');  \r\n\t\t   \tvar size = options.length;   \t\t\r\n\t\t   \tfor (var i = 2; i < size; i++) {\r\n\t\t   \t\tqueue.push($(options[i]).val());  ";
  // jsp code [from=(142,32);to=(142,54)]
  private final static String _jspx_template20 = "\r\n\t\t   \t}\r\n\t\t\tguCode = queue.shift(); ";
  private final static String _jspx_template21 = "\r\n\t\t    \t\t\r\n\t\t}\r\n\t\ttop.map.removeMakers();\r\n\t\tgetData(guCode);     \r\n\t}\r\n}\r\n/*\r\nfunction jumsearch()\r\n{\r\n\tvar bjCd = getSelectedValue(document.getElementById(\"BJ_CD\"));\r\n\tif(bjCd == ''){\r\n\t\talert('데이터량으로 인해 최소 법정동을 선택하셔야 합니다.');\r\n\t\treturn;\r\n\t}else{\r\n\t\tvar form = document.form;\r\n\t\tform.action = \"/jumyong/map/search.do\";\r\n\t    form.submit();\r\n\t}\r\n\r\n}\r\n*/\r\nfunction init(){\r\n\ttop.map.loadingCtl.increaseCounter();\r\n\t\r\n\tvar guCd = getSelectedValue(document.getElementById(\"GU_CD\"));\r\n\tvar bjCd = getSelectedValue(document.getElementById(\"BJ_CD\"));\r\n\tvar bonbun = document.getElementById(\"BONBUN\").value;\r\n\tvar bubun = document.getElementById(\"BUBUN\").value;\r\n\t\r\n\ttop.map.removeMakers();\r\n\t\r\n\tif(guCd == '000'){\r\n\t}else{\r\n\t\tif(bjCd == ''){\r\n\t\t\t\r\n\t\t}else{\r\n\t\t\t";
  private final static String _jspx_template22 = "\r\n\t\t\t\ttop.map.addMaker(\"";
  private final static String _jspx_template23 = "\",\"";
  private final static String _jspx_template24 = "\",\"/img/mapImg/marker.png\",\"51\",\"51\",\"";
  private final static String _jspx_template25 = "\",function(){top.map.left.jumyongView(\"";
  private final static String _jspx_template26 = "\");});\t\r\n\t\t\t";
  private final static String _jspx_template27 = "\r\n\t\t}\r\n\t}\r\n\t\r\n\r\n\t\r\n\t\r\n\tif(guCd == '000'){\r\n\t}else{\r\n\t\tif(bjCd == ''){\r\n\t\t\t\r\n\t\t}else{\r\n\t\t\tif(bonbun == ''){\r\n\t\t\t\ttop.map.wfs_getEqualTo(\"ADMIN_DONG_GE\", \"SMPR_CODE\", \"11\"+guCd+bjCd.substring(0,3), top.map.rt_zoomToBoundaryArea);\r\n\t\t\t}else{\r\n\t\t\t\t\r\n\t\t\t}\r\n\t\t}\r\n\t}\r\n\t\r\n\ttop.map.loadingCtl.decreaseCounter();\r\n\r\n}\r\n\r\nfunction jumyongView(adminNo){\r\n\tdocument.getElementById(\"result\").src = \"/jumyong/map/searchview.do?ADMIN_NO=\"+adminNo;\r\n}\r\n\r\nfunction changeGuCd(obj){\r\n\tvar guCd = getSelectedValue(obj);\r\n    var\tparam\t= \"guCd=\"+guCd;\r\n    sendRequest(\"/get_bjdong_code.do\", param, \"GET\", ResultChangeGuCd);\r\n\t\r\n\t\r\n}\r\n\r\nfunction\tResultChangeGuCd(obj)\r\n{\r\n\tselect_innerHTML(document.getElementById(\"BJ_CD\"),obj);\r\n}\r\n\r\n\r\n////////////////////////////////AJAX////////////////////////////////////////////\r\nfunction getXMLHTTPRequest()\r\n{\r\n    var xRequest = null;\r\n    xRequest = new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n\r\n    return xRequest;\r\n}\r\n\r\nvar req;\r\nvar\tcall;\r\n\r\nfunction sendRequest(url, params, HttpMethod, callback)\r\n{\r\n    req = getXMLHTTPRequest();\r\n\r\n    call\t= callback;\r\n    if(req){\r\n        req.onreadystatechange = onReadyStateChange;\r\n        req.open(HttpMethod, url, true);\r\n        req.setRequestHeader(\"Content-Type\",\"application/x-www-form-urlencoded;charset=utf-8\");\r\n        req.send(params);\r\n    }\r\n}\r\n\r\nfunction onReadyStateChange()\r\n{\r\n    var ready = req.readyState;\r\n    var data = null;\r\n    if(ready == 4){\r\n        if(this.call\t!= null)\r\n        {\r\n            this.call(req.responseText);\r\n        }\r\n    }\r\n}\r\n\t\r\n</script>\r\n</head>\r\n\r\n<body onload=\"init();\">\r\n\t<form id=\"form\" name=\"form\" method=\"post\">\r\n\t\t<table width=\"260px\" height=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t\t<tr>\r\n\t\t\t\t<td width=\"10\"></td>\r\n\t\t\t\t<td class=\"Map_stan\" background=\"/img/mapImg/tab_a.gif\" width=\"240\" height=\"37\" align=\"center\">\r\n\t\t\t\t\t<font color=\"#ffffff\"><b>";
  private final static String _jspx_template28 = "청&nbsp;";
  private final static String _jspx_template29 = "</b>님 환영합니다</font>\r\n\t\t\t\t</td>\r\n\t\t\t\t<td width=\"10\"></td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td width=\"10\" height=\"250\"></td>\r\n\t\t\t\t<td valign=\"top\" align=\"center\" valign=\"top\" bgcolor=\"f9f9f9\" class=\"M_leftborder\">\r\n\t\t\t\t\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td valign=\"top\">\r\n\t\t\t\t\t\t\t\t<table width=220 \" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td height=\"33\">\r\n\t\t\t\t\t\t\t\t\t\t\t<img src=\"/img/mapImg/left_title1.gif\" alt=\"점용지 검색\" width=\"220\" height=\"33\">\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td align=\"center\" valign=\"top\" class=\"M_leftborder2\">\r\n\t\t\t\t\t\t\t\t\t\t\t<table width=\"198\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"Map_stan\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td height=\"22\">점용종류</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<select id=\"TYPE\" name=\"TYPE\" class=\"input_form1\" style=\"width: 139px\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template30 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td height=\"22\">점용구분</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<select id=\"SECTION\" name=\"SECTION\" class=\"input_form1\" style=\"width: 139px\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template31 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td height=\"22\">세외구분</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<select id=\"TAX_SET\" name=\"TAX_SET\" class=\"input_form1\" style=\"width: 139px\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template32 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td height=\"22\">시/군/구</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<select id=\"GU_CD\" name=\"GU_CD\" class=\"input_form1\" style=\"width: 139px\" onchange=\"changeGuCd(this);\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template33 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td height=\"22\">읍/면/동</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<select id=\"BJ_CD\" name=\"BJ_CD\" class=\"input_form1\" style=\"width: 139px\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template34 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td height=\"22\">번지</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input id=\"BONBUN\" name=\"BONBUN\" type=\"text\" value=\"";
  private final static String _jspx_template35 = "\" class=\"input_form1\" style=\"width: 48px\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t- <input id=\"BUBUN\" name=\"BUBUN\" type=\"text\" value=\"";
  private final static String _jspx_template36 = "\" class=\"input_form1\" style=\"width: 48px\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\r\n\r\n\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td height=\"9\" background=\"/img/mapImg/left_bott_line.gif\"></td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td valign=\"top\">\r\n\t\t\t\t\t\t\t\t<table width=\"220\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td height=\"32\"><img src=\"/img/mapImg/left_title2.gif\" alt=\"운영자 검색\" width=\"220\" height=\"32\">\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td align=\"center\" valign=\"top\" class=\"M_leftborder2\">\r\n\t\t\t\t\t\t\t\t\t\t\t<table width=\"198\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"Map_stan\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"59\" height=\"22\">점용인</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input id=\"OWNER_NAME\" name=\"OWNER_NAME\" value=\"";
  private final static String _jspx_template37 = "\" type=\"text\" class=\"input_form1\" style=\"width: 139px\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td height=\"9\" background=\"/img/mapImg/left_bott_line.gif\"></td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td height=\"40\" align=\"center\">\r\n\t\t\t\t\t\t\t\t<img src=\"/img/mapImg/search_icon.gif\" onClick=\"javascript:jumsearch();\" onkeypress=\"javascript:jumsearch();\" alt=\"검색\" width=\"220\" height=\"20\" border=\"0\" style=\"cursor: pointer;\">\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t\t<td width=\"10\"></td>\r\n\t\t\t</tr>\r\n\t\t\t<tr valign=\"bottom\">\r\n\t\t\t\t<td width=\"10\" height=\"38\">\r\n\t\t\t\t</td>\r\n\t\t\t\t<td>\r\n\t\t\t\t\t<img src=\"/img/mapImg/result_title.gif\" width=\"240\" height=\"31\">\r\n\t\t\t\t</td>\r\n\t\t\t\t<td width=\"10\"></td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td width=\"10\"></td>\r\n\t\t\t\t<td height=\"400px\" valign=\"top\" align=\"center\">\r\n\t\t\t\t\t<iframe id=\"result\" name=\"result\" src=\"/jumyong/map/searchview.do\" width=\"235px\" height=\"400px\" scrolling=\"auto\" marginwidth=\"0\" marginheight=\"no\" frameborder=\"no\" allowtransparency=\"True\" title=\"검색결과\"></iframe>\r\n\t\t\t\t</td>\r\n\t\t\t\t<td width=\"10\"></td>\r\n\t\t\t</tr>\r\n\t\t</table>\r\n\t</form>\r\n</body>\r\n</html>\r\n";
}
