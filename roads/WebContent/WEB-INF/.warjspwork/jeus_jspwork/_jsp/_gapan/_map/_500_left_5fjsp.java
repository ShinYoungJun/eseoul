package jeus_jspwork._jsp._gapan._map;

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
      // jsp code [from=(22,5);to=(22,21)]
      out.write(_jspx_template9);
      // jsp code [from=(23,21);to=(23,37)]
      out.write(_jspx_template10);
      // jsp code [from=(24,33);to=(24,47)]
      out.write(_jspx_template11);
      // jsp code [from=(26,20);to=(26,28)]
      out.write(_jspx_template12);
      // jsp code [from=(27,20);to=(27,28)]
      out.write(_jspx_template13);
      // jsp code [from=(41,36);to=(41,50)]
      out.write(_jspx_template14);
      // jsp code [from=(43,26);to=(43,37)]
      out.write(_jspx_template15);
      // jsp code [from=(44,42);to=(44,57)]
      out.write(_jspx_template16);
      // jsp code [from=(46,20);to=(46,29)]
      out.write(_jspx_template17);
      // jsp code [from=(56,6);to=(56,44)]
      out.write(_jspx_template18);
      // jsp code [from=(80,9);to=(80,60)]
      out.write(_jspx_template19);
      // jsp code [from=(95,51);to=(95,97)]
      out.write(_jspx_template20);
      // jsp code [from=(129,7);to=(129,19)]
      out.write(_jspx_template21);
      // jsp code [from=(141,25);to=(141,49)]
      out.write(_jspx_template22);
      // jsp code [from=(143,16);to=(143,34)]
      out.write(_jspx_template23);
      // jsp code [from=(145,31);to=(145,52)]
      out.write(_jspx_template24);
      // jsp code [from=(149,45);to=(149,74)]
      out.write(_jspx_template25);
      // jsp code [from=(151,39);to=(151,61)]
      out.write(_jspx_template26);
      out.write(_jspx_template27);
      // jsp code [from=(173,57);to=(173,62)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ftTyp}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template28);
      // jsp code [from=(195,32);to=(195,41)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${saleCount}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template29);
      // jsp code [from=(196,31);to=(196,39)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${fixCount}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template30);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template52);
      // jsp code [from=(286,33);to=(286,37)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${guNm}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template53);
      // jsp code [from=(286,47);to=(286,51)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${name}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template54);
      // jsp code [from=(320,18);to=(320,24)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${guList}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template55);
      // jsp code [from=(328,18);to=(328,24)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bjList}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template56);
      // jsp code [from=(335,69);to=(335,75)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bonbun}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template57);
      // jsp code [from=(336,69);to=(336,74)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bubun}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template58);
      // jsp code [from=(363,65);to=(363,74)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ownerName}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template59);

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
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${gapanList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("list");
    _jspx_th_c_forEach_0.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template31);
            // jsp code [from=(203,8);to=(203,19)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.FT_TYP}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template32);
            // jsp code [from=(204,22);to=(204,29)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.XC}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template33);
            // jsp code [from=(204,35);to=(204,42)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.YC}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template34);
            // jsp code [from=(204,85);to=(204,100)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.OWNER_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template35);
            // jsp code [from=(204,140);to=(204,153)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template36);
            // jsp code [from=(205,14);to=(205,25)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.FT_TYP}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template37);
            // jsp code [from=(206,23);to=(206,30)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.XC}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template38);
            // jsp code [from=(206,36);to=(206,43)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.YC}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template39);
            // jsp code [from=(206,85);to=(206,100)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.OWNER_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template40);
            // jsp code [from=(206,140);to=(206,153)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template41);
            // jsp code [from=(209,8);to=(209,19)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.FT_TYP}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template42);
            // jsp code [from=(210,23);to=(210,30)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.XC}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template43);
            // jsp code [from=(210,36);to=(210,43)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.YC}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template44);
            // jsp code [from=(210,84);to=(210,99)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.OWNER_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template45);
            // jsp code [from=(210,139);to=(210,152)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template46);
            // jsp code [from=(211,14);to=(211,25)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.FT_TYP}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template47);
            // jsp code [from=(212,23);to=(212,30)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.XC}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template48);
            // jsp code [from=(212,36);to=(212,43)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.YC}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template49);
            // jsp code [from=(212,83);to=(212,98)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.OWNER_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template50);
            // jsp code [from=(212,138);to=(212,151)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template51);

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
  // jsp code [from=(22,5);to=(22,21)]
  private final static String _jspx_template9 = "\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<link href=\"/css/Mroads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/mapImg/left_background.gif);\r\n}\r\n-->\r\n</style>\r\n<script language=\"javascript\" src=\"/js/common.js\"></script>\r\n<script language=\"javascript\" src=\"/js/Ajax_request.js\"></script>\r\n<script language=\"javascript\" src=\"/js/jquery-1.6.1.js\"></script>\r\n<script type=\"text/javascript\">\r\n";
  // jsp code [from=(23,21);to=(23,37)]
  private final static String _jspx_template10 = "\r\nvar LIMIT = 32;\t";
  // jsp code [from=(24,33);to=(24,47)]
  private final static String _jspx_template11 = "\r\nvar queue = new Array();    ";
  // jsp code [from=(26,20);to=(26,28)]
  private final static String _jspx_template12 = "  \r\n\r\nvar sales = 0; ";
  // jsp code [from=(27,20);to=(27,28)]
  private final static String _jspx_template13 = " \r\nvar fixes = 0; ";
  // jsp code [from=(41,36);to=(41,50)]
  private final static String _jspx_template14 = "\r\n\r\nfunction putMarker( no, name, x, y, icon, w, h) {\r\n\ttop.map.addMaker(x,y,icon,w,h,name,function(){\r\n\t\ttop.map.left.gapanView(no);\r\n\t});\r\n}\r\n\r\nfunction addMarker() {\r\n\tvar count = LIMIT;\r\n\tvar markers = queue.markers;\r\n\twhile(count) {\r\n\t\tif (markers != null && markers.length > 0) {\r\n\t\t\tvar marker = markers.shift();\r\n\t\t\tif(marker.ftTyp == \"011\"){  ";
  // jsp code [from=(43,26);to=(43,37)]
  private final static String _jspx_template15 = "\r\n\t\t\t\tputMarker(marker.no, decodeURI(marker.name), marker.xc, marker.yc, '/img/mapImg/blueQuad.gif', 7, 7);\r\n\t\t    \tsales++;      ";
  // jsp code [from=(44,42);to=(44,57)]
  private final static String _jspx_template16 = "    \r\n\t\t\t} else if(marker.ftTyp == \"012\"){ ";
  // jsp code [from=(46,20);to=(46,29)]
  private final static String _jspx_template17 = "\r\n\t\t\t\tputMarker(marker.no, decodeURI(marker.name), marker.xc, marker.yc, '/img/mapImg/redQuad.gif', 7, 7);\r\n\t\t\t\tfixes++;   ";
  // jsp code [from=(56,6);to=(56,44)]
  private final static String _jspx_template18 = "\r\n\t\t\t}\r\n\t\t} else {\r\n\t\t\tbreak;\r\n\t\t}\r\n\t\t--count;\r\n\t}\r\n\ttop.menu.saleCount.value = sales;\r\n\ttop.menu.fixCount.value = fixes;\r\n\r\n\t";
  // jsp code [from=(80,9);to=(80,60)]
  private final static String _jspx_template19 = "\r\n\tif (markers == null || markers.length < LIMIT) {\r\n\t\tnextData();\r\n\t}\r\n\tif (markers != null && markers.length > 0) {\r\n\t\tmarkers.timerId = setTimeout(function() {addMarker();}, 10);\r\n\t}\r\n};\r\n\r\nfunction nextData() {\r\n\t if(queue.length> 0 ){\t  \r\n\t\t \tsetTimeout(function(){ \r\n\t\t\t\tgetData(queue.shift());\r\n\t\t \t},50);\r\n\t  }\r\n};\r\n\r\nfunction getData(guCode){\r\n\tvar $ftTyp = $('#FT_TYP');\r\n\tvar $gucd = $('#GU_CD');\r\n\tvar $bjcd = $('#BJ_CD');\r\n\tvar $bonbun = $('#BONBUN');\r\n\tvar $bubun = $('#BUBUN');\r\n    var $ownername = $('#OWNER_NAME');\r\n    ";
  // jsp code [from=(95,51);to=(95,97)]
  private final static String _jspx_template20 = "\r\n\t$.ajax({\r\n\t\turl :'/gapan/map/searchMapbyjson.do',\r\n\t\tcontentType :'application/x-www-form-urlencoded; charset=utf-8',\r\n\t\tcache:false,\r\n\t\ttype :'post',\r\n\t\tdata :{\r\n\t\t\t  \tbjcd:$bjcd.val(),\r\n\t\t\t    ftTyp:$ftTyp.val(),\r\n\t\t\t    bonbun:$bonbun.val(),\r\n\t\t\t    bubun:$bubun.val(),\r\n\t\t\t    ownername:$ownername.val(),\r\n\t\t\t    gucd : guCode\r\n\t\t\t   },\r\n\t \tdataType : 'json',\r\n\t \tsuccess : function(data,textStatus,jqXHR){\t";
  // jsp code [from=(129,7);to=(129,19)]
  private final static String _jspx_template21 = "\r\n\t \t\tswitch(data.result){\r\n\t \t\tcase 'success':{\r\n\t\t\t\t if (data.list != null && data.list.length > 0) {\r\n\t\t\t\t\t if (queue.markers == null) {\r\n\t\t\t\t\t\t queue.markers = [];\r\n\t\t\t\t\t }\r\n\t\t\t\t\t queue.markers = queue.markers.concat(data.list);\r\n\t\t\t\t\t addMarker();\r\n\t\t\t\t }\t \t\t\t\r\n\t \t\t\tbreak;\r\n\t \t\t}\r\n\t \t\tcase 'fail':\r\n\t \t\tcase 'error':\r\n\t \t\tdefault: {\r\n\t \t\t\tnextData();\r\n\t \t\t\tbreak;\r\n\t \t\t}}\r\n\t \t},\r\n\t \t\terror : function(){\r\n\t \t\t\talert(\"에러\");\r\n\t \t\t}\t\t\r\n\t});\r\n\t\r\n}\r\nfunction jumsearch()\r\n{    \r\n\tvar $ftTyp = $('#FT_TYP');\t\r\n\tvar $gucd = $('#GU_CD');\r\n\tvar $bjcd = $('#BJ_CD');\r\n\tvar $bonbun = $('#BONBUN');\r\n\tvar $bubun = $('#BUBUN');\r\n  var $ownername = $('#OWNER_NAME');\t\r\n  \r\n  ";
  // jsp code [from=(141,25);to=(141,49)]
  private final static String _jspx_template22 = "\r\n  if (queue != null) {\r\n\t\tif (queue.timerId) {\r\n\t\t\tclearTimeout(queue.timerId);\r\n\t\t}\r\n\t\tif (queue.markers && queue.markers.timerId) {\r\n\t\t\tclearTimeout(queue.markers.timerId);\t\t\t\r\n\t\t}\r\n\t  queue.markers = null;\r\n\t\tqueue = new Array();\r\n  }\r\n    \r\n\tif($bjcd == ''){   ";
  // jsp code [from=(143,16);to=(143,34)]
  private final static String _jspx_template23 = "\r\n\t\talert('데이터량으로 인해 최소 법정동을 선택하셔야 합니다.');\r\n\t}else{    ";
  // jsp code [from=(145,31);to=(145,52)]
  private final static String _jspx_template24 = "\r\n\t    var guCode = $gucd.val();\t\r\n\t    if(guCode == '000'){ ";
  // jsp code [from=(149,45);to=(149,74)]
  private final static String _jspx_template25 = "\r\n\t       var options = $gucd.find('option');\r\n\t       var size = options.length; \r\n\t       for(var i =2; i<size; i++){\r\n\t    \t\tqueue.push($(options[i]).val()); ";
  // jsp code [from=(151,39);to=(151,61)]
  private final static String _jspx_template26 = "\r\n\t       }\t       \r\n\t       guCode = queue.shift(); \t ";
  private final static String _jspx_template27 = "\r\n\t    }\r\n\t    top.map.removeMakers(); \r\n\t    sales = 0;\r\n\t    fixes = 0;\r\n\t\ttop.menu.saleCount.value = sales;  \r\n\t\ttop.menu.fixCount.value = fixes;\r\n\t    getData(guCode);   \r\n\t   \r\n\t}\t\r\n}\r\n/*\r\nfunction jumsearch()\r\n{\r\n\tvar form = document.form;\r\n\tform.action = \"/gapan/map/search.do\";\r\n    form.submit();\r\n}\r\n*/\r\n\r\nfunction init(){\r\n\t\r\n\tsetSelectedOption(document.getElementById(\"FT_TYP\"),\"";
  private final static String _jspx_template28 = "\");\r\n\t\r\n\ttop.map.loadingCtl.increaseCounter();\r\n\t\r\n\tvar guCd = getSelectedValue(document.getElementById(\"GU_CD\"));\r\n\tvar bjCd = getSelectedValue(document.getElementById(\"BJ_CD\"));\r\n\tvar bonbun = document.getElementById(\"BONBUN\").value;\r\n\tvar bubun = document.getElementById(\"BUBUN\").value;\r\n\t\r\n\tif(guCd == '000'){\r\n\t}else{\r\n\t\tif(bjCd == ''){\r\n\t\t\ttop.map.wfs_getEqualTo(\"ADMIN_GU_GE\", \"SKPR_CODE\", \"11\"+guCd, top.map.rt_zoomToBoundaryArea);\r\n\t\t}else{\r\n\t\t\tif(bonbun == ''){\r\n\t\t\t\ttop.map.wfs_getEqualTo(\"ADMIN_DONG_GE\", \"SMPR_CODE\", \"11\"+guCd+bjCd.substring(0,3), top.map.rt_zoomToBoundaryArea);\r\n\t\t\t}else{\r\n\t\t\t\t\r\n\t\t\t}\r\n\t\t}\r\n\t}\r\n\t\r\n\ttop.menu.saleCount.value = \"";
  private final static String _jspx_template29 = "\";\r\n\ttop.menu.fixCount.value = \"";
  private final static String _jspx_template30 = "\";\r\n\t\r\n\ttop.map.removeMakers();\r\n\t\r\n\t";
  private final static String _jspx_template31 = "\r\n\t//********** BEGIN_KANG_20120423\r\n\t/*\r\n\tif(\"";
  private final static String _jspx_template32 = "\" == \"011\"){\r\n\ttop.map.addMaker(\"";
  private final static String _jspx_template33 = "\",\"";
  private final static String _jspx_template34 = "\",\"/img/mapImg/blueQuad.gif\",\"15\",\"15\",\"";
  private final static String _jspx_template35 = "\",function(){top.map.left.gapanView(\"";
  private final static String _jspx_template36 = "\");});\r\n\t}else if(\"";
  private final static String _jspx_template37 = "\" == \"012\"){\r\n\t\ttop.map.addMaker(\"";
  private final static String _jspx_template38 = "\",\"";
  private final static String _jspx_template39 = "\",\"/img/mapImg/redQuad.gif\",\"15\",\"15\",\"";
  private final static String _jspx_template40 = "\",function(){top.map.left.gapanView(\"";
  private final static String _jspx_template41 = "\");});\t\r\n\t}\r\n\t*/\r\n\tif(\"";
  private final static String _jspx_template42 = "\" == \"011\"){\r\n\t\ttop.map.addMaker(\"";
  private final static String _jspx_template43 = "\",\"";
  private final static String _jspx_template44 = "\",\"/img/mapImg/blueQuad.gif\",\"7\",\"7\",\"";
  private final static String _jspx_template45 = "\",function(){top.map.left.gapanView(\"";
  private final static String _jspx_template46 = "\");});\r\n\t}else if(\"";
  private final static String _jspx_template47 = "\" == \"012\"){\r\n\t\ttop.map.addMaker(\"";
  private final static String _jspx_template48 = "\",\"";
  private final static String _jspx_template49 = "\",\"/img/mapImg/redQuad.gif\",\"7\",\"7\",\"";
  private final static String _jspx_template50 = "\",function(){top.map.left.gapanView(\"";
  private final static String _jspx_template51 = "\");});\t\r\n\t}\r\n\t//********** END_KANG_20120423\r\n\r\n\t";
  private final static String _jspx_template52 = "\r\n\t\r\n\ttop.map.loadingCtl.decreaseCounter();\r\n\r\n}\r\n\r\nfunction gapanView(gapanNo){\r\n\tdocument.getElementById(\"result\").src = \"/gapan/map/searchview.do?GAPAN_NO=\"+gapanNo;\r\n}\r\n\r\nfunction changeGuCd(obj){\r\n\tvar guCd = getSelectedValue(obj);\r\n    var\tparam\t= \"guCd=\"+guCd;\r\n    sendRequest(\"/get_bjdong_code.do\", param, \"GET\", ResultChangeGuCd);\r\n\t\r\n\t\r\n}\r\n\r\nfunction\tResultChangeGuCd(obj)\r\n{\r\n\tselect_innerHTML(document.getElementById(\"BJ_CD\"),obj);\r\n}\r\n\r\n\r\n////////////////////////////////AJAX////////////////////////////////////////////\r\nfunction getXMLHTTPRequest()\r\n{\r\n    var xRequest = null;\r\n    xRequest = new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n\r\n    return xRequest;\r\n}\r\n\r\nvar req;\r\nvar\tcall;\r\n\r\nfunction sendRequest(url, params, HttpMethod, callback)\r\n{\r\n    req = getXMLHTTPRequest();\r\n\r\n    call\t= callback;\r\n    if(req){\r\n        req.onreadystatechange = onReadyStateChange;\r\n        req.open(HttpMethod, url, true);\r\n        req.setRequestHeader(\"Content-Type\",\"application/x-www-form-urlencoded;charset=utf-8\");\r\n        req.send(params);\r\n    }\r\n}\r\n\r\nfunction onReadyStateChange()\r\n{\r\n    var ready = req.readyState;\r\n    var data = null;\r\n    if(ready == 4){\r\n        if(this.call\t!= null)\r\n        {\r\n            this.call(req.responseText);\r\n        }\r\n    }\r\n}\r\n\t\r\n</script>\r\n</head>\r\n\r\n<body onload=\"init();\">\r\n\t<form id=\"form\" name=\"form\" method=\"post\">\r\n\t\t<table width=\"260px\" height=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t\t<tr>\r\n\t\t\t\t<td width=\"10\"></td>\r\n\t\t\t\t<td class=\"Map_stan\" background=\"/img/mapImg/tab_a.gif\" width=\"240\" height=\"37\" align=\"center\">\r\n\t\t\t\t\t<font color=\"#ffffff\"><b>";
  private final static String _jspx_template53 = "청&nbsp;";
  private final static String _jspx_template54 = "</b>님 환영합니다</font>\r\n\t\t\t\t</td>\r\n\t\t\t\t<td width=\"10\"></td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td width=\"10\" height=\"250\"></td>\r\n\t\t\t\t<td valign=\"top\" align=\"center\" valign=\"top\" bgcolor=\"f9f9f9\" class=\"M_leftborder\">\r\n\t\t\t\t\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td valign=\"top\">\r\n\t\t\t\t\t\t\t\t<table width=220 \" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td height=\"33\">\r\n\t\t\t\t\t\t\t\t\t\t\t<img src=\"/img/mapImg/left_title1.gif\" alt=\"보도상영업시설물 검색\" width=\"220\" height=\"33\">\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td align=\"center\" valign=\"top\" class=\"M_leftborder2\">\r\n\t\t\t\t\t\t\t\t\t\t\t<table width=\"198\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"Map_stan\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td height=\"22\">등록구분</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<select id=\"FT_TYP\" name=\"FT_TYP\" class=\"input_form1\" style=\"width: 139px\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"\">::선택::</option>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"011\">가로판매대</option>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"012\">구두수선대</option>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td height=\"22\">시/군/구</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<select id=\"GU_CD\" name=\"GU_CD\" class=\"input_form1\" style=\"width: 139px\" onchange=\"changeGuCd(this);\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template55 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td height=\"22\">읍/면/동</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<select id=\"BJ_CD\" name=\"BJ_CD\" class=\"input_form1\" style=\"width: 139px\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template56 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td height=\"22\">번지</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input id=\"BONBUN\" name=\"BONBUN\" type=\"text\" value=\"";
  private final static String _jspx_template57 = "\" class=\"input_form1\" style=\"width: 48px\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t- <input id=\"BUBUN\" name=\"BUBUN\" type=\"text\" value=\"";
  private final static String _jspx_template58 = "\" class=\"input_form1\" style=\"width: 48px\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\r\n\r\n\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td height=\"9\" background=\"/img/mapImg/left_bott_line.gif\"></td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td valign=\"top\">\r\n\t\t\t\t\t\t\t\t<table width=\"220\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td height=\"32\"><img src=\"/img/mapImg/left_title2.gif\" alt=\"운영자 검색\" width=\"220\" height=\"32\">\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td align=\"center\" valign=\"top\" class=\"M_leftborder2\">\r\n\t\t\t\t\t\t\t\t\t\t\t<table width=\"198\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"Map_stan\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"59\" height=\"22\">점용인</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input id=\"OWNER_NAME\" name=\"OWNER_NAME\" value=\"";
  private final static String _jspx_template59 = "\" type=\"text\" class=\"input_form1\" style=\"width: 139px\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td height=\"9\" background=\"/img/mapImg/left_bott_line.gif\"></td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td height=\"40\" align=\"center\">\r\n\t\t\t\t\t\t\t\t<img src=\"/img/mapImg/search_icon.gif\" onClick=\"javascript:jumsearch();\" onkeypress=\"javascript:jumsearch();\" alt=\"검색\" width=\"220\" height=\"20\" border=\"0\" style=\"cursor: pointer;\">\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t\t<td width=\"10\"></td>\r\n\t\t\t</tr>\r\n\t\t\t<tr valign=\"bottom\">\r\n\t\t\t\t<td width=\"10\" height=\"38\">\r\n\t\t\t\t</td>\r\n\t\t\t\t<td>\r\n\t\t\t\t\t<img src=\"/img/mapImg/result_title.gif\" width=\"240\" height=\"31\">\r\n\t\t\t\t</td>\r\n\t\t\t\t<td width=\"10\"></td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td width=\"10\"></td>\r\n\t\t\t\t<td height=\"400px\" valign=\"top\" align=\"center\">\r\n\t\t\t\t\t<iframe id=\"result\" name=\"result\" src=\"/gapan/map/searchview.do\" width=\"235px\" height=\"400px\" scrolling=\"auto\" marginwidth=\"0\" marginheight=\"no\" frameborder=\"no\" allowtransparency=\"True\" title=\"검색결과\"></iframe>\r\n\t\t\t\t</td>\r\n\t\t\t\t<td width=\"10\"></td>\r\n\t\t\t</tr>\r\n\t\t</table>\r\n\t</form>\r\n</body>\r\n</html>\r\n";
}
