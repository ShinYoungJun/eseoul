package jeus_jspwork._jsp._rojum._map;

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
      // jsp code [from=(22,5);to=(22,18)]
      out.write(_jspx_template9);
      // jsp code [from=(43,38);to=(43,51)]
      out.write(_jspx_template10);
      // jsp code [from=(45,23);to=(45,32)]
      out.write(_jspx_template11);
      // jsp code [from=(46,18);to=(46,31)]
      out.write(_jspx_template12);
      // jsp code [from=(48,25);to=(48,34)]
      out.write(_jspx_template13);
      // jsp code [from=(51,19);to=(51,30)]
      out.write(_jspx_template14);
      // jsp code [from=(59,45);to=(59,54)]
      out.write(_jspx_template15);
      // jsp code [from=(60,47);to=(60,56)]
      out.write(_jspx_template16);
      // jsp code [from=(61,40);to=(61,49)]
      out.write(_jspx_template17);
      // jsp code [from=(89,8);to=(89,59)]
      out.write(_jspx_template18);
      // jsp code [from=(107,50);to=(107,96)]
      out.write(_jspx_template19);
      // jsp code [from=(151,23);to=(151,47)]
      out.write(_jspx_template20);
      // jsp code [from=(154,14);to=(154,32)]
      out.write(_jspx_template21);
      // jsp code [from=(156,29);to=(156,46)]
      out.write(_jspx_template22);
      // jsp code [from=(160,44);to=(160,73)]
      out.write(_jspx_template23);
      // jsp code [from=(162,33);to=(162,55)]
      out.write(_jspx_template24);
      out.write(_jspx_template25);
      // jsp code [from=(182,52);to=(182,62)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${surveyYear}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template26);
      // jsp code [from=(204,34);to=(204,45)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${jungbiCount}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // jsp code [from=(205,32);to=(205,41)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mainCount}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template28);
      // jsp code [from=(206,31);to=(206,39)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${taxCount}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template29);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      // jsp code [from=(252,5);to=(252,23)]
      out.write(_jspx_template49);
      out.write(_jspx_template50);
      // jsp code [from=(320,33);to=(320,37)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${guNm}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template51);
      // jsp code [from=(320,47);to=(320,51)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${name}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template52);
      // jsp code [from=(344,18);to=(344,23)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${mgTyp}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template53);
      // jsp code [from=(359,18);to=(359,24)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${guList}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template54);
      // jsp code [from=(367,18);to=(367,24)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bjList}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template55);
      // jsp code [from=(376,18);to=(376,31)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GUGAN_CD_LIST}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template56);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_0_fn(pageContext, null)) return;


      out.write(_jspx_template58);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_1_fn(pageContext, null)) return;


      out.write(_jspx_template60);
      // jsp code [from=(394,69);to=(394,75)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bonbun}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template61);
      // jsp code [from=(395,69);to=(395,74)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bubun}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template62);
      // jsp code [from=(422,65);to=(422,74)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ownerName}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template63);

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
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rojumList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("list");
    _jspx_th_c_forEach_0.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template30);
            // jsp code [from=(213,8);to=(213,22)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.MAINTN_OB}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template31);
            // jsp code [from=(214,22);to=(214,29)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.XC}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template32);
            // jsp code [from=(214,35);to=(214,42)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.YC}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template33);
            // jsp code [from=(214,84);to=(214,99)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.OWNER_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template34);
            // jsp code [from=(214,139);to=(214,152)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template35);
            // jsp code [from=(216,23);to=(216,30)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.XC}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template36);
            // jsp code [from=(216,36);to=(216,43)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.YC}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template37);
            // jsp code [from=(216,84);to=(216,99)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.OWNER_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template38);
            // jsp code [from=(216,139);to=(216,152)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template39);
            // jsp code [from=(219,8);to=(219,22)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.MAINTN_OB}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template40);
            // jsp code [from=(220,23);to=(220,30)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.XC}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template41);
            // jsp code [from=(220,36);to=(220,43)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.YC}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template42);
            // jsp code [from=(220,83);to=(220,98)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.OWNER_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template43);
            // jsp code [from=(220,138);to=(220,151)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template44);
            // jsp code [from=(222,23);to=(222,30)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.XC}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template45);
            // jsp code [from=(222,36);to=(222,43)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.YC}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template46);
            // jsp code [from=(222,82);to=(222,97)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.OWNER_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template47);
            // jsp code [from=(222,137);to=(222,150)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.GAPAN_NO}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template48);

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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${maintnOb=='1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template57);

        } while (_jspx_th_c_if_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_0.release();
    }
    return false;
  }

  private boolean _jspx_th_c_if_1_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:if ---- //
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = new org.apache.taglibs.standard.tag.rt.core.IfTag();
    _jspx_th_c_if_1.setPageContext(pageContext);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${maintnOb=='0'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
      if (_jspx_eval_c_if_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template59);

        } while (_jspx_th_c_if_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_1.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_1.release();
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
  // jsp code [from=(22,5);to=(22,18)]
  private final static String _jspx_template9 = "\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<link href=\"/css/Mroads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/mapImg/left_background.gif);\r\n}\r\n-->\r\n</style>\r\n<script language=\"javascript\" src=\"/js/common.js\"></script>\r\n<script language=\"javascript\" src=\"/js/jquery-1.6.1.js\"></script>\r\n<script language=\"javascript\" src=\"/js/Ajax_request.js\"></script>\r\n<script type=\"text/javascript\">\r\n";
  // jsp code [from=(43,38);to=(43,51)]
  private final static String _jspx_template10 = "\r\nvar queue = new Array();\r\nvar LIMIT =32;\r\n\r\nvar mainCount = 0; \r\nvar jungbiCount = 0;\t\r\nvar taxyn =0;\r\n\r\nfunction putMarker(no, name, x, y, icon, w, h){\r\n\ttop.map.addMaker(x,y,icon,w,h,name,function(){\r\n\t\ttop.map.left.rojumView(no);\r\n\t});\t\t\r\n}\r\n\r\nfunction addMarker(){\r\n\tvar count = LIMIT;\r\n\tvar markers = queue.markers;\t\t\r\n\t\t\r\n\twhile(count){\r\n\t\tif(markers != null && markers.length >0){\t\t\t\r\n\t\t\tvar marker = markers.shift();\r\n\t\t\tif(marker.maintnob == \"1\"){   ";
  // jsp code [from=(45,23);to=(45,32)]
  private final static String _jspx_template11 = "\r\n\t\t\t\tputMarker(marker.no, decodeURI(marker.name), marker.xc, marker.yc, \"/img/mapImg/blueRec.gif\", 7, 7);\r\n\t\t\t\tmainCount++;  ";
  // jsp code [from=(46,18);to=(46,31)]
  private final static String _jspx_template12 = "\r\n\t\t\t} else {  ";
  // jsp code [from=(48,25);to=(48,34)]
  private final static String _jspx_template13 = "\r\n\t\t\t\tputMarker(marker.no, decodeURI(marker.name), marker.xc, marker.yc, \"/img/mapImg/redRec.gif\", 7, 7);\t\r\n\t\t\t\tjungbiCount++;  ";
  // jsp code [from=(51,19);to=(51,30)]
  private final static String _jspx_template14 = "\r\n\t\t\t}\r\n\t\t\tif(marker.taxyn==\"1\"){\r\n\t\t\t\ttaxyn++;  ";
  // jsp code [from=(59,45);to=(59,54)]
  private final static String _jspx_template15 = "\t\r\n\t\t\t}\r\n\t\t}else{\r\n\t\t\tbreak;\t\r\n\t\t}\r\n\t\t --count;\r\n\t }\r\n\t\t  \t\r\n\ttop.menu.mainCount.value = mainCount;  ";
  // jsp code [from=(60,47);to=(60,56)]
  private final static String _jspx_template16 = "\r\n\ttop.menu.jungbiCount.value =jungbiCount; ";
  // jsp code [from=(61,40);to=(61,49)]
  private final static String _jspx_template17 = "\r\n\ttop.menu.taxCount.value = taxyn;  ";
  // jsp code [from=(89,8);to=(89,59)]
  private final static String _jspx_template18 = "\r\n\t\r\n\t if(markers == null || markers.length < LIMIT){\r\n\t \tnextData();\t \r\n\t }\r\n\t \r\n\t if(markers != null && markers.length > 0) {\r\n\t\tmarkers.timerId = setTimeout(function() {addMarker();}, 10);\r\n\t }\t\r\n};\r\n\r\nfunction nextData() {\r\n\t if(queue.length> 0 ){\t  \r\n\t\t \tsetTimeout(function(){ \r\n\t\t\t\tgetData(queue.shift());\r\n\t\t \t},50);\r\n\t  }\r\n};\r\n\r\nfunction getData(guCode){\r\n\tvar $mgtyp = $('#MG_TYP');\r\n\tvar $bjcd = $('#BJ_CD');\r\n\tvar\t$gugancd = $('#GUGAN_CD');\r\n\tvar $bonbun = $('#BONBUN');\r\n\tvar $bubun = $('#BUBUN');\r\n\tvar $ownername = $('#OWNER_NAME');\r\n\tvar $servey_year = $('#SURVEY_YEAR');\r\n\tvar $maintnob = $('#MAINTN_OB');\r\n\t  ";
  // jsp code [from=(107,50);to=(107,96)]
  private final static String _jspx_template19 = "\r\n\t$.ajax({\r\n\t\turl : '/rojum/map/search4json.do',\r\n\t\tcontentType : 'application/x-www-form-urlencoded; charset=utf-8',\r\n\t\tcache : false,\r\n\t\ttype : 'post',\r\n\t\tdataType : 'json',\r\n\t\tdata :{ \r\n\t\t\tMG_TYP : $mgtyp.val(),\r\n\t\t\tBJ_CD : $bjcd.val(),\r\n\t\t\tGUGAN_CD : $gugancd.val(),\r\n\t\t\tBONBUN : $bonbun.val(),\r\n\t\t\tBUBUN : $bubun.val(),\r\n\t\t\tOWNER_NAME : $ownername.val(),\r\n\t\t\tSURVEY_YEAR : $servey_year.val(),\r\n\t\t\tMAINTN_OB: $maintnob.val(),\r\n \t\t\tGU_CD  : guCode\r\n\t\t},\r\n\t\tsuccess: function(data,textStatus,jqXHR){  ";
  // jsp code [from=(151,23);to=(151,47)]
  private final static String _jspx_template20 = "\r\n\t\t\tswitch(data.result){\r\n\t\t\tcase 'success':{   \r\n\t\t\t\t if (data.list != null && data.list.length > 0) {\r\n\t\t\t\t\t if (queue.markers == null) {\r\n\t\t\t\t\t\t queue.markers = [];\r\n\t\t\t\t\t }\r\n\t\t\t\t\t queue.markers = queue.markers.concat(data.list);\r\n\t\t\t\t\t addMarker();\r\n\t\t\t\t }\r\n\t\t\t break;\t\t\t\t  \t\t\t\r\n\t\t\t}\r\n\t\t\tcase 'fail' :{\t\r\n\t\t\t\tbreak;\r\n\t\t\t}\r\n\t\t\tcase 'error' :{\r\n\t\t\t\tbreak;\r\n\t\t\t}\r\n\t\t\tdefault:\r\n\t\t\t\tbreak;\r\n\t\t\t}\r\n\t\t\tif(queue.length>0){  \r\n\t\t\t\tsetTimeout(function(){\r\n\t\t\t\tgetData(queue.shift());},500);\r\n\t\t\t}\r\n\t\t},\t\t  \t\r\n\t\terror : function( jqXHR, textStatus, errorThrown){  \r\n\t\t\talert(\"에러\");\t\t\t\t \r\n\t\t}\t\t  \t\r\n\t});\t\r\n}\r\n\r\nfunction jumsearch()\r\n{  \r\n\tvar $mgtyp = $('#MG_TYP');\r\n\tvar $bjcd = $('#BJ_CD');\r\n\tvar\t$gugancd = $('#GUGAN_CD');\r\n\tvar $bonbun = $('#BONBUN');\r\n\tvar $bubun = $('#BUBUN');\r\n\tvar $ownername = $('#OWNER_NAME');\r\n\tvar $servey_year = $('#SURVEY_YEAR');\r\n\tvar $maintnob = $('#MAINTN_OB');\r\n    var $gucd = $('#GU_CD');\r\n    \r\n\tif($bjcd ==''){\t ";
  // jsp code [from=(154,14);to=(154,32)]
  private final static String _jspx_template21 = "\r\n\t\talert('데이터량으로 인해 최소 법정동을 선택하셔야 합니다.');\r\n\t\treturn;\r\n\t}else{\t\t";
  // jsp code [from=(156,29);to=(156,46)]
  private final static String _jspx_template22 = "\r\n\t\tvar guCode = $gucd.val();\r\n\t\t\tif(guCode == '000'){\t";
  // jsp code [from=(160,44);to=(160,73)]
  private final static String _jspx_template23 = "\r\n\t\t\t\tvar options = $gucd.find('option');\r\n\t\t\t\tvar size = options.length;\r\n\t\t\t\t\tfor(var i=2;i<size;i++){\r\n\t\t\t\t\t\tqueue.push($(options[i]).val()); ";
  // jsp code [from=(162,33);to=(162,55)]
  private final static String _jspx_template24 = "\t\r\n\t\t\t\t\t}\r\n\t\t\t\tguCode = queue.shift();\t";
  private final static String _jspx_template25 = "\r\n\t\t\t}\r\n\t\ttop.map.removeMakers();\r\n\t\tmainCount =0;\r\n\t\tjungbiCount =0;\r\n\t\ttaxyn=0;\r\n\t\ttop.menu.mainCount.value = mainCount;\r\n\t\ttop.menu.jungbiCount.value =jungbiCount;\r\n\t\ttop.menu.taxCount.value = taxyn;\r\n\t\tgetData(guCode);\r\n\t}\r\n\t\r\n/*\t\r\n\tvar form = document.form;\r\n\tform.action = \"/rojum/map/search.do\";\r\n    form.submit();\r\n*/\r\n}\r\n\r\nfunction init(){\r\n\tsetYear(document.getElementById(\"SURVEY_YEAR\"),\"";
  private final static String _jspx_template26 = "\");\r\n\t\r\n\ttop.map.loadingCtl.increaseCounter();\r\n\t\r\n\tvar guCd = getSelectedValue(document.getElementById(\"GU_CD\"));\r\n\tvar bjCd = getSelectedValue(document.getElementById(\"BJ_CD\"));\r\n\tvar bonbun = document.getElementById(\"BONBUN\").value;\r\n\tvar bubun = document.getElementById(\"BUBUN\").value;\r\n\t\r\n\tif(guCd == '000'){\r\n\t}else{\r\n\t\tif(bjCd == ''){\r\n\t\t\ttop.map.wfs_getEqualTo(\"ADMIN_GU_GE\", \"SKPR_CODE\", \"11\"+guCd, top.map.rt_zoomToBoundaryArea);\r\n\t\t}else{\r\n\t\t\tif(bonbun == ''){\r\n\t\t\t\ttop.map.wfs_getEqualTo(\"ADMIN_DONG_GE\", \"SMPR_CODE\", \"11\"+guCd+bjCd.substring(0,3), top.map.rt_zoomToBoundaryArea);\r\n\t\t\t}else{\r\n\t\t\t\t\r\n\t\t\t}\r\n\t\t}\r\n\t}\r\n\t\r\n\ttop.menu.jungbiCount.value = \"";
  private final static String _jspx_template27 = "\";\r\n\ttop.menu.mainCount.value = \"";
  private final static String _jspx_template28 = "\";\r\n\ttop.menu.taxCount.value = \"";
  private final static String _jspx_template29 = "\";\r\n\t\r\n\ttop.map.removeMakers();\r\n\t\r\n\t";
  private final static String _jspx_template30 = "\r\n\t//********** BEGIN_KANG_20120423\r\n\t/*\r\n\tif(\"";
  private final static String _jspx_template31 = "\" == \"1\"){\r\n\ttop.map.addMaker(\"";
  private final static String _jspx_template32 = "\",\"";
  private final static String _jspx_template33 = "\",\"/img/mapImg/blueRec.gif\",\"15\",\"15\",\"";
  private final static String _jspx_template34 = "\",function(){top.map.left.rojumView(\"";
  private final static String _jspx_template35 = "\");});\r\n\t}else{\r\n\t\ttop.map.addMaker(\"";
  private final static String _jspx_template36 = "\",\"";
  private final static String _jspx_template37 = "\",\"/img/mapImg/redRec.gif\",\"15\",\"15\",\"";
  private final static String _jspx_template38 = "\",function(){top.map.left.rojumView(\"";
  private final static String _jspx_template39 = "\");});\t\r\n\t}\r\n\t*/\r\n\tif(\"";
  private final static String _jspx_template40 = "\" == \"1\"){\r\n\t\ttop.map.addMaker(\"";
  private final static String _jspx_template41 = "\",\"";
  private final static String _jspx_template42 = "\",\"/img/mapImg/blueRec.gif\",\"7\",\"7\",\"";
  private final static String _jspx_template43 = "\",function(){top.map.left.rojumView(\"";
  private final static String _jspx_template44 = "\");});\r\n\t}else{\r\n\t\ttop.map.addMaker(\"";
  private final static String _jspx_template45 = "\",\"";
  private final static String _jspx_template46 = "\",\"/img/mapImg/redRec.gif\",\"7\",\"7\",\"";
  private final static String _jspx_template47 = "\",function(){top.map.left.rojumView(\"";
  private final static String _jspx_template48 = "\");});\t\r\n\t}\r\n\t//********** END_KANG_20120423\r\n\t\r\n\r\n\t";
  // jsp code [from=(252,5);to=(252,23)]
  private final static String _jspx_template49 = "\r\n\t\r\n\ttop.map.loadingCtl.decreaseCounter();\r\n\r\n}\r\n\r\nfunction rojumView(gapanNo){\r\n\tdocument.getElementById(\"result\").src = \"/rojum/map/searchview.do?GAPAN_NO=\"+gapanNo;\r\n}\r\n\r\nfunction changeMgTyp(obj){\r\n\tif(getSelectedValue(obj) != \"\"){\r\n\t\tdocument.getElementById(\"SURVEY_YEAR_TR\").style.display =\"none\";\r\n\t}else{\r\n\t\tdocument.getElementById(\"SURVEY_YEAR_TR\").style.display =\"block\";\r\n\t}\r\n}\r\n\r\nfunction changeGuCd(obj){\r\n\tvar guCd = getSelectedValue(obj);\r\n\tvar\tparam = \"guCd=\"+guCd;\r\n\tvar target = document.getElementById(\"BJ_CD\");\r\n\tsendRequest(target, \"/get_bjdong_code.do\", param, \"GET\", ResultChangeGuCd);\t\r\n}\r\n\r\n";
  private final static String _jspx_template50 = " \r\nfunction changeSeoulGuCd(obj){\r\n\tvar guCd = getSelectedValue(obj);\r\n    var\tparam\t= \"guCd=\"+guCd;\r\n\tvar target = document.getElementById(\"GUGAN_CD\");\r\n    sendRequest(target, \"/get_seoul_gugan.do\", param, \"GET\", ResultChangeGuCdGubun);\r\n}    \r\n\r\nfunction ResultChangeGuCd(obj)\r\n{\r\n\tselect_innerHTML(document.getElementById(\"BJ_CD\"),obj);\r\n}\r\n\r\nfunction ResultChangeGuCdGubun(obj)\r\n{\r\n\tselect_innerHTML(document.getElementById(\"GUGAN_CD\"),obj);\r\n}\r\n\r\n\r\n////////////////////////////////AJAX////////////////////////////////////////////\r\nfunction getXMLHTTPRequest()\r\n{\r\n    var xRequest = null;\r\n    xRequest = new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n\r\n    return xRequest;\r\n}\r\n\r\nvar req;\r\nvar\tcall;\r\n\r\nfunction sendRequest(target, url, params, HttpMethod, callback)\r\n{\r\n\tvar req = getXMLHTTPRequest();\r\n    target.req = req;\r\n\r\n    target.call\t= callback;\r\n    if(req){\r\n        req.onreadystatechange = function() {\r\n        \tonReadyStateChange(target);\r\n        };\r\n        req.open(HttpMethod, url, true);\r\n        req.setRequestHeader(\"Content-Type\",\"application/x-www-form-urlencoded;charset=utf-8\");\r\n        req.send(params);\r\n    }\r\n}\r\n\r\nfunction onReadyStateChange(target)\r\n{\r\n\tvar req = target.req;\r\n    var ready = req.readyState;\r\n    var data = null;\r\n    if(ready == 4) {\r\n        if(target.call\t!= null) {\r\n            target.call(req.responseText);\r\n        }\r\n    }\r\n}\r\n \r\n</script>\r\n</head>\r\n\r\n<body onload=\"init();\">\r\n\t<form id=\"form\" name=\"form\" method=\"post\">\r\n\t\t<table width=\"260px\" height=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t\t<tr>\r\n\t\t\t\t<td width=\"10\"></td>\r\n\t\t\t\t<td class=\"Map_stan\" background=\"/img/mapImg/tab_a.gif\" width=\"240\" height=\"37\" align=\"center\">\r\n\t\t\t\t\t<font color=\"#ffffff\"><b>";
  private final static String _jspx_template51 = "청&nbsp;";
  private final static String _jspx_template52 = "</b>님 환영합니다</font>\r\n\t\t\t\t</td>\r\n\t\t\t\t<td width=\"10\"></td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td width=\"10\" height=\"250\"></td>\r\n\t\t\t\t<td valign=\"top\" align=\"center\" valign=\"top\" bgcolor=\"f9f9f9\" class=\"M_leftborder\">\r\n\t\t\t\t\t<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td valign=\"top\">\r\n\t\t\t\t\t\t\t\t<table width=220 \" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td height=\"33\">\r\n\t\t\t\t\t\t\t\t\t\t\t<img src=\"/img/mapImg/left_title1.gif\" alt=\"거리가게 검색\" width=\"220\" height=\"33\">\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td align=\"center\" valign=\"top\" class=\"M_leftborder2\">\r\n\t\t\t\t\t\t\t\t\t\t\t<table width=\"198\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"Map_stan\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td height=\"22\">등록구분</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<select id=\"MG_TYP\" name=\"MG_TYP\" class=\"input_form1\" style=\"width: 139px\" onchange=\"changeMgTyp(this);\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template53 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr id=\"SURVEY_YEAR_TR\" style=\"display: block;\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td height=\"22\">조사년도</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n                                                    <select  id=\"SURVEY_YEAR\" name=\"SURVEY_YEAR\" class=\"input_form1\" style=\"width:139px\">\r\n                                        \t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td height=\"22\">시/군/구</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<select id=\"GU_CD\" name=\"GU_CD\" class=\"input_form1\" style=\"width: 139px\" onchange=\"changeSeoulGuCd(this);changeGuCd(this);\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template54 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td height=\"22\">읍/면/동</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<select id=\"BJ_CD\" name=\"BJ_CD\" class=\"input_form1\" style=\"width: 139px\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template55 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<!--  //********** BEGIN_현진_20120313 -->\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td height=\"22\">구간</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<select id=\"GUGAN_CD\" name=\"GUGAN_CD\" class=\"input_form1\" style=\"width: 139px\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template56 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<!--   //********** END_현진_20120313 -->\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td height=\"22\">관리여부</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<select id=\"MAINTN_OB\" name=\"MAINTN_OB\" class=\"input_form1\" style=\"width: 139px\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"\">::선택::</option>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"1\" ";
  private final static String _jspx_template57 = "selected";
  private final static String _jspx_template58 = ">관리대상</option>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<option value=\"0\" ";
  private final static String _jspx_template59 = "selected";
  private final static String _jspx_template60 = ">정비대상</option>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td height=\"22\">번지</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input id=\"BONBUN\" name=\"BONBUN\" type=\"text\" value=\"";
  private final static String _jspx_template61 = "\" class=\"input_form1\" style=\"width: 48px\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t- <input id=\"BUBUN\" name=\"BUBUN\" type=\"text\" value=\"";
  private final static String _jspx_template62 = "\" class=\"input_form1\" style=\"width: 48px\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\r\n\r\n\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td height=\"9\" background=\"/img/mapImg/left_bott_line.gif\"></td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td valign=\"top\">\r\n\t\t\t\t\t\t\t\t<table width=\"220\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td height=\"32\"><img src=\"/img/mapImg/left_title2.gif\" alt=\"운영자 검색\" width=\"220\" height=\"32\">\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td align=\"center\" valign=\"top\" class=\"M_leftborder2\">\r\n\t\t\t\t\t\t\t\t\t\t\t<table width=\"198\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"Map_stan\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"59\" height=\"22\">점용인</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input id=\"OWNER_NAME\" name=\"OWNER_NAME\" value=\"";
  private final static String _jspx_template63 = "\" type=\"text\" class=\"input_form1\" style=\"width: 139px\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td height=\"9\" background=\"/img/mapImg/left_bott_line.gif\"></td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td height=\"40\" align=\"center\">\r\n\t\t\t\t\t\t\t\t<img src=\"/img/mapImg/search_icon.gif\" onClick=\"javascript:jumsearch();\" onkeypress=\"javascript:jumsearch();\" alt=\"검색\" width=\"220\" height=\"20\" border=\"0\" style=\"cursor: pointer;\">\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t\t<td width=\"10\"></td>\r\n\t\t\t</tr>\r\n\t\t\t<tr valign=\"bottom\">\r\n\t\t\t\t<td width=\"10\" height=\"38\">\r\n\t\t\t\t</td>\r\n\t\t\t\t<td>\r\n\t\t\t\t\t<img src=\"/img/mapImg/result_title.gif\" width=\"240\" height=\"31\">\r\n\t\t\t\t</td>\r\n\t\t\t\t<td width=\"10\"></td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td width=\"10\"></td>\r\n\t\t\t\t<td height=\"400px\" valign=\"top\" align=\"center\">\r\n\t\t\t\t\t<iframe id=\"result\" name=\"result\" src=\"/rojum/map/searchview.do\" width=\"235px\" height=\"400px\" scrolling=\"auto\" marginwidth=\"0\" marginheight=\"no\" frameborder=\"no\" allowtransparency=\"True\" title=\"검색결과\"></iframe>\r\n\t\t\t\t</td>\r\n\t\t\t\t<td width=\"10\"></td>\r\n\t\t\t</tr>\r\n\t\t</table>\r\n\t</form>\r\n</body>\r\n</html>\r\n";
}
