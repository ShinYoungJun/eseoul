package jeus_jspwork._jsp._map;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_miniMap_5fjsp extends jeus.servlet.jsp.HttpJspBase {

  public final String[] __jeusGetIncludedJspFiles() {
    return new String[] {
      "/jsp/common/environment_setting.jsp"
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
      pageContext = _jspxFactory.getPageContext(this, request, response, "", true, 8192, true);
      session = pageContext.getSession();
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();

      response.setContentType("text/html;charset=MS949");

      out.write(_jspx_template0);
      out.write(_jspx_template1);
      // jsp code [from=(1,3);to=(12,1)]
      
         String MapServerIP="98.33.1.86";
         String MapServerPort="8080";
         String MapServerURL="http://"+MapServerIP+":"+MapServerPort;
         
         String WebServerIP=MapServerIP;
         String WebServerPort=MapServerPort;
         String WebServerURL="http://"+WebServerIP;
         
         String newMapAddr="/RoadsMap/MapService";//WEbtoB proxy process
         

      out.write(_jspx_template2);
      // jsp code [from=(150,40);to=(150,52)]
      out.print(MapServerURL);

      out.write(_jspx_template3);
      // jsp code [from=(210,10);to=(210,14)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${FLAG}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template4);
      // jsp code [from=(236,41);to=(236,57)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${miniMap.XX_COORD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template5);
      // jsp code [from=(237,41);to=(237,57)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${miniMap.YY_COORD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template6);
      // ----  c:choose ---- invoke //
      if (_jspx_th_c_choose_0_fn(pageContext, null)) return;


      out.write(_jspx_template12);
      // jsp code [from=(300,10);to=(300,14)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${FLAG}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(304,11);to=(304,27)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${miniMap.XX_COORD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(304,42);to=(304,58)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${miniMap.YY_COORD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(316,14);to=(316,30)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${miniMap.XX_COORD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(317,15);to=(317,31)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${miniMap.YY_COORD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(329,14);to=(329,15)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${X}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(329,30);to=(329,31)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${Y}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(330,15);to=(330,31)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${miniMap.XX_COORD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(330,46);to=(330,62)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${miniMap.YY_COORD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(341,14);to=(341,30)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${miniMap.XX_COORD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(342,15);to=(342,31)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${miniMap.YY_COORD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(346,17);to=(346,18)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${X}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // jsp code [from=(347,14);to=(347,15)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${Y}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);
      // jsp code [from=(359,17);to=(359,32)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${miniMap.POINT_X}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template26);
      // jsp code [from=(359,47);to=(359,62)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${miniMap.POINT_Y}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // jsp code [from=(361,22);to=(361,37)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${miniMap.POINT_X}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template28);
      // jsp code [from=(361,43);to=(361,58)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${miniMap.POINT_Y}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template29);
      // ----  c:choose ---- invoke //
      if (_jspx_th_c_choose_1_fn(pageContext, null)) return;


      out.write(_jspx_template33);
      // jsp code [from=(382,60);to=(382,64)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADDR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template34);

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
  private boolean _jspx_th_c_choose_0_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:choose ---- //
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = new org.apache.taglibs.standard.tag.common.core.ChooseTag();
    _jspx_th_c_choose_0.setPageContext(pageContext);
    try {
      int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
      if (_jspx_eval_c_choose_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template7);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template9);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_1_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template11);

        } while (_jspx_th_c_choose_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_choose_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_choose_0.release();
    }
    return false;
  }

  private boolean _jspx_th_c_choose_1_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:choose ---- //
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_1 = new org.apache.taglibs.standard.tag.common.core.ChooseTag();
    _jspx_th_c_choose_1.setPageContext(pageContext);
    try {
      int _jspx_eval_c_choose_1 = _jspx_th_c_choose_1.doStartTag();
      if (_jspx_eval_c_choose_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template30);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_2_fn(pageContext, _jspx_th_c_choose_1)) return true;


          out.write(_jspx_template31);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_3_fn(pageContext, _jspx_th_c_choose_1)) return true;


          out.write(_jspx_template32);

        } while (_jspx_th_c_choose_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_choose_1.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_choose_1.release();
    }
    return false;
  }

  private boolean _jspx_th_c_when_0_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:when ---- //
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = new org.apache.taglibs.standard.tag.rt.core.WhenTag();
    _jspx_th_c_when_0.setPageContext(pageContext);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${CHECK == '1'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
      if (_jspx_eval_c_when_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template8);

        } while (_jspx_th_c_when_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_when_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_when_0.release();
    }
    return false;
  }

  private boolean _jspx_th_c_when_1_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:when ---- //
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = new org.apache.taglibs.standard.tag.rt.core.WhenTag();
    _jspx_th_c_when_1.setPageContext(pageContext);
    _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_when_1.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${CHECK == '0'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
      if (_jspx_eval_c_when_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template10);

        } while (_jspx_th_c_when_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_when_1.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_when_1.release();
    }
    return false;
  }

  private boolean _jspx_th_c_when_2_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:when ---- //
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_2 = new org.apache.taglibs.standard.tag.rt.core.WhenTag();
    _jspx_th_c_when_2.setPageContext(pageContext);
    _jspx_th_c_when_2.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_when_2.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${FLAG == 'JUMYONG'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_2 = _jspx_th_c_when_2.doStartTag();
      if (_jspx_eval_c_when_2 != Tag.SKIP_BODY) {
        do {
          // jsp code [from=(375,55);to=(375,59)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));


        } while (_jspx_th_c_when_2.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_when_2.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_when_2.release();
    }
    return false;
  }

  private boolean _jspx_th_c_when_3_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:when ---- //
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_3 = new org.apache.taglibs.standard.tag.rt.core.WhenTag();
    _jspx_th_c_when_3.setPageContext(pageContext);
    _jspx_th_c_when_3.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_when_3.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${FLAG == 'GAPAN'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_3 = _jspx_th_c_when_3.doStartTag();
      if (_jspx_eval_c_when_3 != Tag.SKIP_BODY) {
        do {
          // jsp code [from=(376,53);to=(376,63)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${OWNER_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));


        } while (_jspx_th_c_when_3.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_when_3.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_when_3.release();
    }
    return false;
  }

  private final static String _jspx_template0 = "\r\n";
  private final static String _jspx_template1 = "\r\n";
  private final static String _jspx_template2 = "\r\n<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\">\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<link href=\"css/Mroads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n<style type=\"text/css\">\r\n<!--\r\n\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/mapImg/map_back.gif)\r\n\tmargin: 0px;\r\n}\r\n\r\n#container {\r\n        position:relative;\r\n        width:820px;\r\n    }\r\n    \r\n#map {\r\n        position:absolute;\r\n        top:0px;\r\n        left:0px;\r\n        width:100%;\r\n        height:100%;\r\n         z-index:3;\r\n\r\n.M_leftborder {\r\n\tborder-bottom: 2px #dbdbdb solid;\r\n\tborder-left: 2px #dbdbdb solid;\r\n\tborder-right: 2px #dbdbdb solid;\r\n}\r\n\r\n\r\n.M_leftborder2 {\r\n\tborder-left: 1px #dbdbdb solid;\r\n\tborder-right: 1px #dbdbdb solid;\r\n}\r\n\r\n\r\n\r\n.input_form1 {\r\n\tfont-family: \"돋움\", \"돋움체\";\r\n\tborder: 1px #cccccc solid; \r\n\tfont-size: 11px; \r\n\tcolor: #848484;\r\n\tPADDING-left: 3px; \r\n\ttext-decoration: none;\r\n}\r\n\r\nA.inqu {\r\n\tCURSOR: hand\r\n}\r\nA.inqu:visited {\r\n\tFONT-SIZE: 11px; COLOR: #858585; font-family: \"돋움\", \"돋움체\"; TEXT-DECORATION: none;\r\n}\r\nA.inqu:link {\r\n\tFONT-SIZE: 11px; COLOR: #858585; font-family: \"돋움\", \"돋움체\"; TEXT-DECORATION: none;\r\n}\r\nA.inqu:hover {\r\n\tFONT-SIZE: 11px; COLOR: #c5c5c5; font-family: \"돋움\", \"돋움체\"; TEXT-DECORATION: underline;\r\n}\r\n\r\n\r\n\r\n\r\nA.list {\r\n\tCURSOR: hand\r\n}\r\nA.list:visited {\r\n\tFONT-SIZE: 11px; COLOR: #8e8e8e; font-family: \"돋움\", \"돋움체\"; TEXT-DECORATION: none;\r\n}\r\nA.list:link {\r\n\tFONT-SIZE: 11px; COLOR: #8e8e8e; font-family: \"돋움\", \"돋움체\"; TEXT-DECORATION: none;\r\n}\r\nA.list:hover {\r\n\tFONT-SIZE: 11px; COLOR: #bebebe; font-family: \"돋움\", \"돋움체\"; BACKGROUND-COLOR: #dfebf4; TEXT-DECORATION: underline\r\n}\r\n\r\n\r\n\r\n.Map_stan{\r\n\tfont-family: \"돋움\", \"돋움체\"; \r\n\tfont-size: 11px; \r\n\tcolor: #7d7d7d;\r\n\ttext-decoration: none;\r\n}\r\n\r\n\r\n.Map_stan_b{\r\n\tfont-family: \"돋움\", \"돋움체\"; \r\n\tfont-size: 11px; \r\n\tcolor: #7d7d7d;\r\n\tFONT-WEIGHT: bold;\r\n\ttext-decoration: none;\r\n}\r\n\r\n\r\n.table_bl_left {\r\n\tPADDING-left: 5px; \r\n}\r\n\r\n\r\n.sub_stan_blue{\r\n\tfont-family: \"돋움\", \"돋움체\"; \r\n\tfont-size: 11px; \r\n\tcolor: #4376b5;\r\n\tFONT-WEIGHT: bold;\r\n\ttext-decoration: none;\r\n}\r\n\r\n\r\n.sub_table{\r\n\tfont-family: \"돋움\", \"돋움체\"; \r\n\tfont-size: 11px; \r\n\tcolor: #757575;\r\n\ttext-decoration: none;\r\n}\r\n\r\n\r\n.sub_table_b{\r\n\tfont-family: \"돋움\", \"돋움체\"; \r\n\tfont-size: 11px; \r\n\tcolor: #757575;\r\n\tFONT-WEIGHT: bold;\r\n\ttext-decoration: none;\r\n}\r\n\r\n\r\n.mapborder {\r\n\tborder: 3px #e5e5e5 solid;   \r\n}\r\n\r\n\r\n\r\n.bbs_bl_left {\r\n\tPADDING: 6px; \r\n}\r\n\r\n     }\r\n\r\n     \r\n     \r\n-->\r\n</style>\r\n<script type=\"text/javascript\" src=\"";
  private final static String _jspx_template3 = "/kMap_base/common\"></script>\r\n<script type=\"text/javascript\" src=\"/js/newWinMap.js\"></script>\r\n<script type=\"text/javascript\" src=\"/js/commMap.js\"></script>\r\n<script type=\"text/JavaScript\">\r\n<!--\r\nfunction MM_preloadImages() { //v3.0\r\n  var d=document; if(d.images){ if(!d.MM_p) d.MM_p=new Array();\r\n    var i,j=d.MM_p.length,a=MM_preloadImages.arguments; for(i=0; i<a.length; i++)\r\n    if (a[i].indexOf(\"#\")!=0){ d.MM_p[j]=new Image; d.MM_p[j++].src=a[i];}}\r\n}\r\n\r\nfunction MM_swapImgRestore() { //v3.0\r\n  var i,x,a=document.MM_sr; for(i=0;a&&i<a.length&&(x=a[i])&&x.oSrc;i++) x.src=x.oSrc;\r\n}\r\n\r\nfunction MM_findObj(n, d) { //v4.01\r\n  var p,i,x;  if(!d) d=document; if((p=n.indexOf(\"?\"))>0&&parent.frames.length) {\r\n    d=parent.frames[n.substring(p+1)].document; n=n.substring(0,p);}\r\n  if(!(x=d[n])&&d.all) x=d.all[n]; for (i=0;!x&&i<d.forms.length;i++) x=d.forms[i][n];\r\n  for(i=0;!x&&d.layers&&i<d.layers.length;i++) x=MM_findObj(n,d.layers[i].document);\r\n  if(!x && d.getElementById) x=d.getElementById(n); return x;\r\n}\r\n\r\nfunction MM_swapImage() { //v3.0\r\n  var i,j=0,x,a=MM_swapImage.arguments; document.MM_sr=new Array; for(i=0;i<(a.length-2);i+=3)\r\n   if ((x=MM_findObj(a[i]))!=null){document.MM_sr[j++]=x; if(!x.oSrc) x.oSrc=x.src; x.src=a[i+2];}\r\n}\r\n\r\n\r\nfunction clickxy() {\r\n\r\n\tif(_click == null){\r\n\t\talert(\"해당위치를 클릭하세요.\");\r\n\t\twinMapUserMode('userSelect');\r\n\t\t_click = 1;\r\n\t}\r\n\telse{\r\n\t\t_click = null;\r\n\t\twinMapUserMode('');\r\n\t}\r\n  \t\r\n}\r\n\r\nfunction setMapxy(xx,yy) {\r\n\tf = document.form;\r\n\tf.xx.value = xx;\r\n\tf.yy.value = yy;\r\n\t\r\n}\r\n\r\nfunction setOpenerxy() {\r\n\t\r\n  \tif(document.form.xx.value==null || document.form.xx.value.length==0 || document.form.yy.value==null || document.form.yy.value.length==0){\r\n  \t  \talert(\"위치 정보가 없습니다.\\n위치를 설정해 주세요\");\r\n  \t  \treturn;\r\n  \t}\r\n  \t\r\n  \tdocument.form.xx.value = parseInt(document.form.xx.value*100000)/100000\r\n  \tdocument.form.yy.value = parseInt(document.form.yy.value*100000)/100000\r\n  \t\r\n  \tif(\"";
  private final static String _jspx_template4 = "\" == \"GAPAN\"){\r\n\t \tf = opener.document.form;\r\n\t \t\r\n\t \tf.X_COORD.value = document.form.xx.value; \r\n\t \tf.Y_COORD.value = document.form.yy.value; \r\n\t}\r\n     else{\r\n     \tf = opener.document.placeLocationForm\r\n\r\n\t\tf.Locate_x.value = document.form.xx.value;\r\n\t    f.Locate_y.value = document.form.yy.value;\r\n     }\r\n  \r\n     if(confirm(\"위치정보가 등록되었습니다. 창을 닫으시겠습니까?\"))\r\n\t{\r\n\t\twindow.close();\r\n\t}\r\n   \r\n}\r\n\r\n//-->\r\n</script>\r\n\r\n</head>\r\n<body onLoad=\"MM_preloadImages('/img/mapImg/maptool2_on.gif','/img/mapImg/maptool3_on.gif','/img/mapImg/maptool15_on.gif','/img/mapImg/maptool4_on.gif','/img/mapImg/maptool5_on.gif','/img/mapImg/maptool16_on.gif','/img/mapImg/maptool17_on.gif')\">\r\n<form name=\"form\">\r\n<input type=\"hidden\" name=\"xx\" value=\"";
  private final static String _jspx_template5 = "\">\r\n<input type=\"hidden\" name=\"yy\" value=\"";
  private final static String _jspx_template6 = "\">\r\n<table width=\"820\" height=\"780\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n  <tr>\r\n    <td height=\"12\"><img src=\"/img/mapImg/box_top_left.gif\" width=\"12\" height=\"12\"></td>\r\n    <td background=\"/img/mapImg/box_top_mid.gif\"></td>\r\n    <td><img src=\"/img/mapImg/box_top_right.gif\" width=\"12\" height=\"12\"></td>\r\n  </tr>\r\n  <tr>\r\n    <td width=\"12\" background=\"/img/mapImg/box_left.gif\"></td>\r\n    <td align=\"center\" valign=\"top\"><table width=\"100%\" height=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n      <tr>\r\n        <td height=\"48\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n            <tr>\r\n              <td width=\"15\"><img src=\"/img/mapImg/menu_left2.gif\" width=\"15\" height=\"48\"></td>\r\n              <td background=\"/img/mapImg/menu_back.gif\"><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n                <tr>\r\n                  <td><a href=\"javascript:winMapZoomIn()\" onMouseOut=\"MM_swapImgRestore()\" onMouseOver=\"MM_swapImage('Image8','','/img/mapImg/maptool2_on.gif',1)\"><img src=\"/img/mapImg/maptool2_off.gif\" alt=\"확대\" name=\"Image8\" width=\"38\" height=\"48\" border=\"0\"></a></td>\r\n                  <td><a href=\"javascript:winMapZoomOut()\" onMouseOut=\"MM_swapImgRestore()\" onMouseOver=\"MM_swapImage('Image9','','/img/mapImg/maptool3_on.gif',1)\"><img src=\"/img/mapImg/maptool3_off.gif\" alt=\"축소\" name=\"Image9\" width=\"38\" height=\"48\" border=\"0\"></a></td>\r\n                  <td><a href=\"javascript:winMapMove()\" onMouseOut=\"MM_swapImgRestore()\" onMouseOver=\"MM_swapImage('Image10','','/img/mapImg/maptool15_on.gif',1)\"><img src=\"/img/mapImg/maptool15_off.gif\" alt=\"이동\" name=\"Image10\" width=\"38\" height=\"48\" border=\"0\"></a></td>\r\n                  <!--td><a href=\"javascript:winMapPrev()\" onMouseOut=\"MM_swapImgRestore()\" onMouseOver=\"MM_swapImage('Image11','','/img/mapImg/maptool4_on.gif',1)\"><img src=\"/img/mapImg/maptool4_off.gif\" alt=\"이전\" name=\"Image11\" width=\"38\" height=\"48\" border=\"0\"></a></td>\r\n                  <td><a href=\"javascript:winMapNext()\" onMouseOut=\"MM_swapImgRestore()\" onMouseOver=\"MM_swapImage('Image12','','/img/mapImg/maptool5_on.gif',1)\"><img src=\"/img/mapImg/maptool5_off.gif\" alt=\"이후\" name=\"Image12\" width=\"38\" height=\"48\" border=\"0\"></a></td-->\r\n                  <td><img src=\"/img/mapImg/maptool_line2.gif\" width=\"9\" height=\"48\"></td>\r\n                  ";
  private final static String _jspx_template7 = "\r\n              \t\t";
  private final static String _jspx_template8 = "<td></td><td></td>";
  private final static String _jspx_template9 = "\r\n              \t\t";
  private final static String _jspx_template10 = "\r\n              \t\t\t<td><a href=\"javascript:clickxy();\" onMouseOut=\"MM_swapImgRestore()\" onMouseOver=\"MM_swapImage('Image13','','/img/mapImg/maptool16_on.gif',1)\"><img src=\"/img/mapImg/maptool16_off.gif\" name=\"Image13\" width=\"90\" height=\"48\" border=\"0\"></a></td>\r\n                  \t\t<td><a href=\"javascript:setOpenerxy();\" onMouseOut=\"MM_swapImgRestore()\" onMouseOver=\"MM_swapImage('Image14','','/img/mapImg/maptool17_on.gif',1)\"><img src=\"/img/mapImg/maptool17_off.gif\" name=\"Image14\" width=\"90\" height=\"48\" border=\"0\"></a></td>\r\n              \t\t";
  private final static String _jspx_template11 = "\r\n              \t";
  private final static String _jspx_template12 = "                  \r\n                </tr>\r\n              </table></td>\r\n              <td width=\"22\" height=\"48\" align=\"right\" background=\"/img/mapImg/menu_back.gif\"><a href=\"#\"><img src=\"/img/mapImg/close.gif\" alt=\"닫기\" width=\"22\" height=\"17\" border=\"0\" onclick=\"self.close();\" style=\"cursor:pointer;\" /></a></td>\r\n              <td width=\"17\"><img src=\"/img/mapImg/menu_right2.gif\" width=\"17\" height=\"48\"></td>\r\n            </tr>\r\n        </table></td>\r\n      </tr>\r\n      <tr>\r\n        <td class=\"mapborder\" valign=\"top\">\r\n    \r\n     <div id=\"container\" >   \r\n      <div id='minimap' oncontextmenu='return false' http-equiv='imagetoolbar' content='no'>\r\n      </div>\r\n      \r\n      </div>\r\n  \r\n\r\n      <script>\r\n      \tcreateWinMap(\"minimap\",0,0,820,620)\r\n      \twinMap.setRevisionLeftTop(20,70); \r\n      </script>\r\n\r\n      <div id='ctrl' width='500px' height='100px'>\r\n      </div>\r\n      <script> \r\n      \twinMapLayersView(\"1\",\"0\");\r\n      \twinMap.setOffLayer('도곽경계_10000', '도곽경계_5000', '도곽경계_1000', '도곽경계_500','행정경계_시','행정경계_구','행정경계_행정동','행정경계_법정동','가스관로','가스심도','공동구','난방맨홀','난방심도','난방열관로','배전_심도','배전_지중맨홀','배전_지중관로','송전_지중맨홀','송전_지중전력구','송전_지중관로','송전_지중심도','지하상가단면상세도','지하상가_연결계단','지하상가_외곽선','지하상가_출입구','지하상가_환기구','지하철_출입구','지하철_승강장','지하철_환기구','통신맨홀','통신심도','통신관로','지하철_지상구간','지하철_지하구간','플랫폼의지붕','플랫폼');\r\n\t\twinMap.reFlush();\r\n\t\t\r\n\t\txx = null;\r\n\t\tyy = null;\r\n\t\t\r\n\t\tflag = true;\r\n\r\n\t\t if(\"";
  private final static String _jspx_template13 = "\" == \"GAPAN\"){\r\n\r\n\t\t \tf = opener.document.form;\t\t \t\r\n\r\n\t\t \tif(\"";
  private final static String _jspx_template14 = "\" == \"\" || \"";
  private final static String _jspx_template15 = "\" == \"\"){\r\n\t\t \t\r\n\t\t\t \tif(f.X_COORD.value == \"\" || f.Y_COORD.value ==  \"\"){\r\n\t\t\t \t}\r\n\t\t\t\telse{\r\n\t\t\t\t\t xx = f.X_COORD.value;\r\n\t\t\t\t     yy = f.Y_COORD.value;\r\n\t\t\t    }\r\n\t\t\t}\r\n\t\t\telse {\r\n\t\t\t \tif(f.X_COORD.value == \"\" || f.Y_COORD.value ==  \"\"){\r\n\t\t\t \t\tflag = false;\r\n\t\t\t\t\txx = \"";
  private final static String _jspx_template16 = "\";\r\n\t\t\t\t \tyy = \"";
  private final static String _jspx_template17 = "\";\r\n\t\t\t \t}\r\n\t\t\t\telse{\t\r\n\t\t\t\t\t xx = f.X_COORD.value;\r\n\t\t\t\t     yy = f.Y_COORD.value;\r\n\t\t\t    }\r\n\t\t\t}\r\n\t     }\r\n\t     else{\r\n\t     \r\n\t     \tf = opener.document.placeLocationForm\r\n\r\n\t     \tif(\"";
  private final static String _jspx_template18 = "\" == \"\" || \"";
  private final static String _jspx_template19 = "\" == \"\"){\r\n\t\t     \tif(\"";
  private final static String _jspx_template20 = "\" == \"\" || \"";
  private final static String _jspx_template21 = "\" == \"\"){\r\n\t\t\t \t\r\n\t\t\t\t \tif(f.Locate_x.value == \"\" || f.Locate_y.value ==  \"\"){\r\n\r\n\t\t\t\t \t}\r\n\t\t\t\t\telse{\t\r\n\t\t\t\t\t\t xx = f.Locate_x.value;\r\n\t\t\t   \t\t\t yy = f.Locate_y.value;\r\n\t\t\t\t    }\r\n\t\t\t\t}\r\n\t\t\t\telse {\r\n\t\t\t\t\txx = \"";
  private final static String _jspx_template22 = "\";\r\n\t\t\t\t \tyy = \"";
  private final static String _jspx_template23 = "\";\r\n\t\t\t\t}\r\n\t     \t}\r\n\t     \telse {\r\n\t     \t\txx = \"";
  private final static String _jspx_template24 = "\";\r\n\t\t\t \tyy = \"";
  private final static String _jspx_template25 = "\";\r\n\t     \t}\r\n\t     }\r\n\t\t \r\n\t    if(xx != null || yy != null){\r\n\t    \tif(flag){\r\n\t     \t\tsetLocation(xx,yy,0.5,\"\",\"\",\"\");\r\n\t    \t}else{\r\n\t    \t\t\r\n\t    \t\tsetLocation(xx,yy,0.2,\"\",\"\",\"bj\");\r\n\t    \t}\r\n\t    }\r\n\t    else if(\"";
  private final static String _jspx_template26 = "\" != \"\" || \"";
  private final static String _jspx_template27 = "\" != \"\"){\r\n\r\n\t    \tsetLocation(\"";
  private final static String _jspx_template28 = "\",\"";
  private final static String _jspx_template29 = "\",3.0,\"\",\"\",\"bj\");\r\n\t    }\r\n\r\n\t</script>    \r\n      \r\n      </td>\r\n      </tr>\r\n      <tr>\r\n        <td height=\"56\"><table width=\"100%\" border=\"1\" bordercolor=\"#c9dfed\" style=\"border-collapse:collapse;\" cellpadding=\"0\" cellspacing=\"0\"  class=\"sub_table\">\r\n            <tr>\r\n              <td width=\"15%\" height=\"28\" bgcolor=\"e5eff8\" class=\"bbs_bl_left\"><strong>점용인/<br>\r\n                법인명</strong></td>\r\n              <td bgcolor=\"eaeaea\" class=\"table_bl_left\">\r\n              \t";
  private final static String _jspx_template30 = "\r\n              \t\t";
  private final static String _jspx_template31 = "\r\n              \t\t";
  private final static String _jspx_template32 = "\r\n              \t";
  private final static String _jspx_template33 = "</td>\r\n            </tr>\r\n            <tr>\r\n              <td height=\"28\" bgcolor=\"e5eff8\" class=\"bbs_bl_left\"><strong>점용지 <br>\r\n                주소</strong></td>\r\n              <td bgcolor=\"eaeaea\" class=\"table_bl_left\">";
  private final static String _jspx_template34 = "</td>\r\n            </tr>\r\n        </table></td>\r\n      </tr>\r\n    </table></td>\r\n    <td width=\"12\" background=\"/img/mapImg/box_right.gif\"></td>\r\n  </tr>\r\n  <tr>\r\n    <td height=\"12\"><img src=\"/img/mapImg/box_bottom_left.gif\" width=\"12\" height=\"12\"></td>\r\n    <td background=\"/img/mapImg/box_bottom_mid.gif\"></td>\r\n    <td><img src=\"/img/mapImg/box_bottom_right.gif\" width=\"12\" height=\"12\"></td>\r\n  </tr>\r\n</table>\r\n</form>\r\n</body>\r\n</html>\r\n";
}
