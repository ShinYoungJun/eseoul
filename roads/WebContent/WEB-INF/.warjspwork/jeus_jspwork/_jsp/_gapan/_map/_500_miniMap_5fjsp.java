package jeus_jspwork._jsp._gapan._map;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_miniMap_5fjsp extends jeus.servlet.jsp.HttpJspBase {

  public final String[] __jeusGetIncludedJspFiles() {
    return new String[] {
      "/jsp/common/loginCheck.jsp",
      "/jsp/common/include.jsp",
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
      out.write(_jspx_template9);
      // jsp code [from=(1,3);to=(12,1)]
      
         String MapServerIP="98.33.1.86";
         String MapServerPort="8080";
         String MapServerURL="http://"+MapServerIP+":"+MapServerPort;
         
         String WebServerIP=MapServerIP;
         String WebServerPort=MapServerPort;
         String WebServerURL="http://"+WebServerIP;
         
         String newMapAddr="/RoadsMap/MapService";//WEbtoB proxy process
         

      out.write(_jspx_template10);
      // jsp code [from=(40,22);to=(40,32)]
      out.print(newMapAddr);

      out.write(_jspx_template11);
      out.write(_jspx_template12);
      // jsp code [from=(271,61);to=(271,68)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${X_COORD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(272,61);to=(272,68)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${Y_COORD}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(273,53);to=(273,56)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PNU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(274,55);to=(274,59)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TYPE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_0_fn(pageContext, null)) return;


      out.write(_jspx_template18);
      out.write(_jspx_template19);
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
  private boolean _jspx_th_c_if_0_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:if ---- //
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = new org.apache.taglibs.standard.tag.rt.core.IfTag();
    _jspx_th_c_if_0.setPageContext(pageContext);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TYPE == 'edit'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
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

  private final static String _jspx_template0 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n";
  private final static String _jspx_template1 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('사용자의 사용시간이 종료되었습니다. 다시 접속 해주시기 바랍니다.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template2 = "\r\n";
  private final static String _jspx_template3 = "\r\n";
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "  \r\n";
  private final static String _jspx_template6 = "  \r\n";
  private final static String _jspx_template7 = "\r\n";
  private final static String _jspx_template8 = "\r\n";
  private final static String _jspx_template9 = "\r\n";
  private final static String _jspx_template10 = "\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\">\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<link href=\"css/Mroads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n<link rel=\"stylesheet\" href=\"/OpenLayers/theme/default/style.css\" type=\"text/css\" />\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/mapImg/map_back.gif) margin :   0px;\r\n}\r\n\r\n.olImageLoadError {\r\n\tbackground-color: transparent !important;\r\n}\r\n\r\n.olControlLoadingPanel {\r\n\tbackground-image: url(/img/LoadingBar.gif);\r\n\tleft: 40%;\r\n\ttop: 40%;\r\n\tposition: relative;\r\n\twidth: 213px;\r\n\theight: 59px;\r\n\tbackground-position: center;\r\n\tbackground-repeat: no-repeat;\r\n\tdisplay: none;\r\n}\r\n-->\r\n</style>\r\n<script type=\"text/javascript\" src=\"/js/common.js\"></script>\r\n<script type=\"text/javascript\" src=\"/OpenLayers/lib/OpenLayers.js\"></script>\r\n<script type=\"text/javascript\" src=\"/OpenLayers/lib/OpenLayers/Control/LoadingPanel.js\"></script>\r\n<script type=\"text/JavaScript\">\r\nvar mapServUrl = \"";
  private final static String _jspx_template11 = "\";\r\n\tvar map, measureControls, loadingCtl;\r\n\tvar wmaLayer,markerLayer;\r\n\r\n\t//초기화\r\n\tfunction init() {\r\n\t\t\r\n\t\t\r\n\t\tvar xc = document.getElementById(\"X_COORD\").value;\r\n\t\tvar yc = document.getElementById(\"Y_COORD\").value;\r\n\t\tvar pnu = document.getElementById(\"PNU\").value;\r\n\t\tvar type = document.getElementById(\"TYPE\").value;\r\n\t\t\r\n\t\tloadingCtl = new OpenLayers.Control.LoadingPanel();\r\n\r\n\t\tvar options = {\r\n\t\t\tprojection : new OpenLayers.Projection(\"EPSG:2097\"),\r\n\t\t\tdisplayProjection : new OpenLayers.Projection(\"EPSG:2097\"),\r\n\t\t\tunits : \"m\",\r\n\t\t\tmaxExtent : new OpenLayers.Bounds(178907.611, 436569.343, 215956.979, 466854.878),\r\n\t\t\tscales : [ 135000, 68000, 34000, 17000, 8000, 4000, 2000, 1000, 500 ],\r\n\t\t\tcontrols : [ new OpenLayers.Control.Scale(),\r\n\t\t\t\t\tnew OpenLayers.Control.Navigation(), loadingCtl ]\r\n\t\t};\r\n\r\n\t\tmap = new OpenLayers.Map('map', options);\r\n\r\n\t\twmsLayer = new OpenLayers.Layer.WMS(\"KSIC_WMS\", mapServUrl, {\r\n\t\t\tlayers : getSelectedLayer(),\r\n\t\t\tformat : \"image/png\"\r\n\t\t}, {\r\n\t\t\tisBaseLayer : true,\r\n\t\t\tsingleTile : true,\r\n\t\t\ttransitionEffect : 'resize'\r\n\t\t});\r\n\r\n\t\tmarkerLayer = new OpenLayers.Layer.Markers(\"markers\");\r\n        \r\n        map.addLayers([wmsLayer,markerLayer]);\r\n\t\t\r\n\t\t\r\n\t\tif(xc == ''){\r\n\t\t\tif(pnu.length == 8){\r\n\t\t\t\twfs_getEqualTo(\"ADMIN_DONG_GE\", \"SMPR_CODE\", pnu, rt_zoomToBoundaryArea);\r\n\t\t\t}else{\r\n\t\t\t\twfs_getEqualTo(\"UA502\", \"PNU\", pnu, rt_zoomToBoundaryArea);\r\n\t\t\t}\r\n\t\t}else{\r\n\t\t\tmap.zoomToExtent(new OpenLayers.Geometry.Point(Number(xc),Number(yc)).getBounds());\r\n\t\t\taddMaker(Number(xc),Number(yc),\"/img/mapImg/marker.png\",\"51\",\"51\");\r\n\t\t}\r\n\t}\r\n\t\r\n\t//기본 조작 버튼\r\n\tfunction ZoomIn() {\r\n\t\tmap.zoomIn();\r\n\t}\r\n\tfunction ZoomOut() {\r\n\t\tmap.zoomOut();\r\n\t}\r\n\tfunction Fit() {\r\n\t\tmap.zoomToMaxExtent();\r\n\t}\r\n\r\n\t//레이어 정보 얻기\r\n\tfunction getSelectedLayer() {\r\n\t\tvar rStr = [];\r\n\t\tfor ( var i = 0; i < document.getElementsByName(\"layers\").length; i++) {\r\n\t\t\tif (document.getElementsByName(\"layers\")[i].checked)\r\n\t\t\t\trStr.push(document.getElementsByName(\"layers\")[i].id);\r\n\t\t}\r\n\t\treturn rStr.join(',');\r\n\t}\r\n\r\n\t//레이어 정보 세팅\r\n\tfunction setLayer(layerName, checked) {\r\n\t\tfor ( var i = 0; i < document.getElementsByName(\"layers\").length; i++) {\r\n\t\t\tif (document.getElementsByName(\"layers\")[i].id == layerName) {\r\n\t\t\t\tdocument.getElementsByName(\"layers\")[i].checked = checked;\r\n\t\t\t\tbreak;\r\n\t\t\t}\r\n\t\t}\r\n\t\tvar newParams = {\r\n\t\t\t'layers' : getSelectedLayer(),\r\n\t\t\t'format' : 'image/png'\r\n\t\t};\r\n\r\n\t\twmsLayer.mergeNewParams(newParams);\r\n\r\n\t}\r\n\t\r\n\t// marker 추가\r\n\tfunction addMaker(mX, mY,imgUrl,imgW,imgH){\r\n\t\tvar mkXy = new OpenLayers.LonLat(mX, mY);\r\n\t\tvar url = imgUrl;\r\n\t\tvar sz = new OpenLayers.Size(imgW, imgH);\r\n\t\tvar calculateOffset = function(size) {\r\n\t\t\treturn new OpenLayers.Pixel(-(size.w/2), -size.h);\r\n\t\t};\r\n\t\tvar icon = new OpenLayers.Icon(url, sz, null, calculateOffset);\r\n\t\t\r\n\t\tvar marker = new OpenLayers.Marker(mkXy, icon);\r\n\r\n\t\tmarkerLayer.addMarker(marker);\r\n\t}\r\n\t\r\n\t//marker 삭제\r\n\tfunction removeMakers(){ \r\n\t\tif(markerLayer){\r\n\t\t\tmarkerLayer.clearMarkers();\t\r\n\t\t}\r\n\t\t\r\n\t}\r\n\t\r\n\t//WFS 처리 내용\r\n    // WFS 조건별 처리 함수\r\n\tfunction wfs_getEqualTo(targetLayer, propertyName, literal, returnFunction) {\r\n\t\tvar filterHeader = '<' + '?xml version=\"1.0\" encoding=\"UTF-8\"?>';\r\n\t\tfilterHeader += '<wfs:GetFeature xmlns:wfs=\"http://www.opengis.net/wfs\" xmlns:ksic=\"http://www.ksic.net/wfs\" ';\r\n\t\tfilterHeader += 'xmlns:ogc=\"http://www.opengis.net/ogc\" xmlns:gml=\"http://www.opengis.net/gml\" ';\r\n\t\tfilterHeader += 'xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" version=\"1.1.0\" service=\"WFS\" ';\r\n\t\tfilterHeader += 'xsi:schemaLocation=\"http://www.ksic.net/wfs http://www.opengis.net/wfs http://schemas.opengis.net/wfs/1.1.0/wfs.xsd\">';\r\n\t\r\n\t\tvar filterMain = \"\";\r\n\t\tfilterMain += '<wfs:Query typeName=\"' + targetLayer + '\">';\r\n\t\tfilterMain += '<wfs:PropertyName>XGEOMETRY</wfs:PropertyName>';\r\n\t\tfilterMain += \"<ogc:Filter xmlns:ogc=\\\"http://www.opengis.net/ogc\\\">\";\r\n\t\tfilterMain += \"<ogc:PropertyIsEqualTo>\";\r\n\t\tfilterMain += \"<ogc:PropertyName>\" + propertyName + \"</ogc:PropertyName>\";\r\n\t\tfilterMain += \"<ogc:Literal>\" + literal + \"</ogc:Literal>\";\r\n\t\tfilterMain += \"</o";
  private final static String _jspx_template12 = "gc:PropertyIsEqualTo>\";\r\n\t\tfilterMain += \"</ogc:Filter>\";\r\n\t\tfilterMain += '</wfs:Query>';\r\n\t\r\n\t\tvar filter = filterHeader + filterMain + '</wfs:GetFeature>';\r\n\t\r\n\t\tnew OpenLayers.Request.POST({\r\n\t\t\tmethod : \"POST\",\r\n\t\t\turl : mapServUrl,\r\n\t\t\theaders : {\r\n\t\t\t\t\"Content-Type\" : \"text/xml\"\r\n\t\t\t},\r\n\t\t\tdata : filter,\r\n\t\t\tcallback : returnFunction\r\n\t\t});\r\n\t}\r\n    \r\n    \r\n    //반환받은 객체 크기로 zoom하기\r\n\tfunction rt_zoomToBoundaryArea(response) {\r\n\t\t\r\n\t\tvar features = new OpenLayers.Format.GML().read(response.responseText);\r\n\t\t\r\n\t\tvar totalBounds = new OpenLayers.Bounds();\r\n\t\t\r\n\t\tfor(var i = 0; i < features.length; i++){\r\n\t\t\ttotalBounds.extend(features[i].geometry.getBounds());\r\n\t\t}\r\n\t\tmap.zoomToExtent(totalBounds);\r\n\t}\r\n    \r\n    //클릭 컨트롤 선언\r\n\tOpenLayers.Control.Click = OpenLayers.Class(OpenLayers.Control, {               \r\n\t    defaultHandlerOptions: {\r\n\t        'single': true,\r\n\t        'double': false,\r\n\t        'pixelTolerance': 0,\r\n\t        'stopSingle': false,\r\n\t        'stopDouble': false\r\n\t    },\r\n\t    initialize: function(options) {\r\n\t        this.handlerOptions = OpenLayers.Util.extend(\r\n\t            {}, this.defaultHandlerOptions\r\n\t        );\r\n\t        OpenLayers.Control.prototype.initialize.apply(\r\n\t            this, arguments\r\n\t        );\r\n\t        this.handler = new OpenLayers.Handler.Click(\r\n\t            this, {\r\n\t                'click': this.trigger\r\n\t            }, this.handlerOptions\r\n\t        );\r\n\t    },\r\n\t    trigger: function(e) {\r\n\t    var lonlat = map.getLonLatFromViewPortPx(e.xy);\r\n\t    \r\n\t    \r\n\t  \tdocument.form.X_COORD.value = lonlat.lon;\r\n\t  \tdocument.form.Y_COORD.value = lonlat.lat;\r\n\t  \tremoveMakers();\r\n\t\taddMaker(Number(lonlat.lon),Number(lonlat.lat),\"/img/mapImg/marker.png\",\"51\",\"51\");\r\n\t\tclick.deactivate();\r\n\t    }\r\n\t});\r\n\t\r\n\tvar click = new OpenLayers.Control.Click();\r\n    \r\n    //위치등록\r\n\tfunction clickxy() {\r\n\t\tmap.addControl(click);\r\n\t\tclick.activate();\r\n\t\t\r\n\t}\r\n\r\n    //미니맵 상위부모 위치값 지정\r\n\tfunction setOpenerxy() {\r\n\t\t\r\n\t  \tif(document.form.X_COORD.value==null || document.form.X_COORD.value.length==0 || document.form.Y_COORD.value==null || document.form.Y_COORD.value.length==0){\r\n\t  \t  \talert(\"위치 정보가 없습니다.\\n위치를 설정해 주세요\");\r\n\t  \t  \treturn;\r\n\t  \t}\r\n\t  \t\r\n\t  \tdocument.form.X_COORD.value = parseInt(document.form.X_COORD.value*100000)/100000;\r\n\t  \tdocument.form.Y_COORD.value = parseInt(document.form.Y_COORD.value*100000)/100000;\r\n\t  \t\r\n\t \tf = opener.document.form;\r\n\t \t\r\n\t \tf.X_COORD.value = document.form.X_COORD.value;\r\n\t \tf.Y_COORD.value = document.form.Y_COORD.value;\r\n\t  \r\n\t     if(confirm(\"위치정보가 등록되었습니다. 창을 닫으시겠습니까?\"))\r\n\t\t{\r\n\t\t\twindow.close();\r\n\t\t}\r\n\t   \r\n\t}\r\n\t\r\n</script>\r\n</head>\r\n<body onLoad=\"init();MM_preloadImages('/img/mapImg/maptool2_on.gif','/img/mapImg/maptool3_on.gif','/img/mapImg/maptool15_on.gif','/img/mapImg/maptool4_on.gif','/img/mapImg/maptool5_on.gif','/img/mapImg/maptool16_on.gif','/img/mapImg/maptool17_on.gif')\">\r\n\t<form name=\"form\">\r\n\t\t<input type=\"hidden\" id=\"X_COORD\" name=\"X_COORD\" value=\"";
  private final static String _jspx_template13 = "\">\r\n\t\t<input type=\"hidden\" id=\"Y_COORD\" name=\"Y_COORD\" value=\"";
  private final static String _jspx_template14 = "\">\r\n\t\t<input type=\"hidden\" id=\"PNU\" name=\"PNU\" value=\"";
  private final static String _jspx_template15 = "\">\r\n\t\t<input type=\"hidden\" id=\"TYPE\" name=\"TYPE\" value=\"";
  private final static String _jspx_template16 = "\">\r\n\t\t\r\n\t\t<table width=\"800px\" height=\"600px\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t\t<tr>\r\n\t\t\t\t<td width=\"12px\" height=\"12px\"><img src=\"/img/mapImg/box_top_left.gif\" width=\"12px\" height=\"12px\"></td>\r\n\t\t\t\t<td width=\"776px\" background=\"/img/mapImg/box_top_mid.gif\"></td>\r\n\t\t\t\t<td width=\"12px\"  height=\"12px\"><img src=\"/img/mapImg/box_top_right.gif\" width=\"12px\" height=\"12px\"></td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td width=\"12px\" height=\"576px\" background=\"/img/mapImg/box_left.gif\"></td>\r\n\t\t\t\t<td width=\"776px\" align=\"center\" valign=\"top\">\r\n\t\t\t\t\t<table width=\"776px\" height=\"576px\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td width=\"776px\" height=\"48px\">\r\n\t\t\t\t\t\t\t\t<table width=\"776px\" height=\"48px\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"15px\" background=\"/img/mapImg/menu_back.gif\">\r\n\t\t\t\t\t\t\t\t\t\t\t<img src=\"/img/mapImg/menu_left2.gif\" width=\"15px\" height=\"48px\">\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"722px\" background=\"/img/mapImg/menu_back.gif\" align=\"left\">\r\n\t\t\t\t\t\t\t\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"/img/mapImg/maptool1_off.gif\" alt=\"전체\" name=\"Image10\" width=\"38px\" height=\"48px\" border=\"0\" style=\"vertical-align: middle;\" onclick=\"javascript:Fit()\" onMouseOut=\"MM_swapImgRestore()\" onMouseOver=\"MM_swapImage('Image10','','/img/mapImg/maptool1_on.gif',1)\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"/img/mapImg/maptool2_off.gif\" alt=\"확대\" name=\"Image8\" width=\"38px\" height=\"48px\" border=\"0\" style=\"vertical-align: middle;\" onclick=\"javascript:ZoomIn()\" onMouseOut=\"MM_swapImgRestore()\" onMouseOver=\"MM_swapImage('Image8','','/img/mapImg/maptool2_on.gif',1)\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"/img/mapImg/maptool3_off.gif\" alt=\"축소\" name=\"Image9\" width=\"38px\" height=\"48px\" border=\"0\" style=\"vertical-align: middle;\" onclick=\"javascript:ZoomOut()\" onMouseOut=\"MM_swapImgRestore()\" onMouseOver=\"MM_swapImage('Image9','','/img/mapImg/maptool3_on.gif',1)\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"/img/mapImg/maptool_line2.gif\" width=\"9px\" height=\"48px\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template17 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"/img/mapImg/maptool16_off.gif\" name=\"Image13\" width=\"90px\" height=\"48px\" border=\"0\" style=\"vertical-align: middle;\" onclick=\"javascript:clickxy();\" onMouseOut=\"MM_swapImgRestore()\" onMouseOver=\"MM_swapImage('Image13','','/img/mapImg/maptool16_on.gif',1)\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"/img/mapImg/maptool17_off.gif\" name=\"Image14\" width=\"90px\" height=\"48px\" border=\"0\" style=\"vertical-align: middle;\" onclick=\"javascript:setOpenerxy();\" onMouseOut=\"MM_swapImgRestore()\" onMouseOver=\"MM_swapImage('Image14','','/img/mapImg/maptool17_on.gif',1)\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t";
  private final static String _jspx_template18 = "\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"22px\" align=\"right\" background=\"/img/mapImg/menu_back.gif\">\r\n\t\t\t\t\t\t\t\t\t\t\t<img src=\"/img/mapImg/close.gif\" alt=\"닫기\" width=\"22px\" height=\"17px\" border=\"0\" onclick=\"self.close();\" style=\"cursor: pointer;\" />\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td width=\"17px\" background=\"/img/mapImg/menu_back.gif\">\r\n\t\t\t\t\t\t\t\t\t\t\t<img src=\"/img/mapImg/menu_right2.gif\" width=\"17px\" height=\"48px\">\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t<td class=\"mapborder\" valign=\"top\" align=\"center\">\r\n\t\t\t\t\t\t\t\t<div id=\"map\" style=\"width:776px; height:528px; z-index:3;\"></div>\r\n\t\t\t\t\t\t\t\t<div name='layerdiv' id='layerdiv' style=\"position: absolute; top: 0px; right: 0px; width: 150px; height: 100%; z-index: 98; display: none; overflow-y: scroll; scrollbar-face-color: #FFFFFF; scrollbar-highlight-color: #FFFFFF; scrollbar-3dlight-color: #F2F2F2; scrollbar-shadow-color: #999CC; scrollbar-darkshadow-color: #F2F2F2; scrollbar-track-color: #FFFFFF; scrollbar-arrow-color: #9999CC;\">\r\n\t\t\t\t\t\t\t\t\t<table height=\"100%\" width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" valign=\"top\">\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td width=\"100%\" height=\"100%\" bgcolor=\"f9f9f9\" class=\"M_leftborder\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"land_outline\" checked>배경</td></tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"conture2\" checked>등고선2</td></tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"contour50\" checked>등고선50</td></tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"contour100\" checked>등고선100</td></tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"contour200\" checked>등고선200</td></tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"contour300\" checked>등고선300</td></tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"contour400\" checked>등고선400</td></tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"contour500\" checked>등고선500</td></tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"contour600\" checked>등고선600</td></tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"contour700\" checked>등고선700</td></tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"RIVER_M,river\" checked>하천호수</td></tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"national_park\" checked>국립공원</td></tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"zone_apt,zone_carpark,zone_factory,zone_golf,zone_hospital,zone_park,zone_publicoffice,zone_restingplace,zone_school,zone_zone\" checked>구역</td></tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"bldg_etc\" checked>건물군</td></tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"seoul_bldg_apart\" checked>건물_아파트</td></tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"seoul_bldg_general\" checked>건물_일반</td></tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,";
  private final static String _jspx_template19 = "this.checked)\" name = \"layers\" id = \"seoul_bldg_important\" checked>건물_다가구주택</td></tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"seoul_bldg_privatehouse\" checked>건물_다세대</td></tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"seoul_bldg_government\" checked>건물_정부기관</td></tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"seoul_bldg_shop\" checked>건물_상점</td></tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"seoul_bldg_hospital\" checked>건물_병원</td></tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"seoul_bldg_school\" checked>건물_학교</td></tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"seoul_bldg_hotel\" checked>건물_호텔</td></tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"seoul_bldg_culture\" checked>건물_문화</td></tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"seoul_bldg_exercise\" checked>건물_운동시설</td></tr>\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"seoul_bldg_extra\" checked>건물_기타</td></tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"road_express4,road_express5\" checked>고속도로</td></tr>\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"bldg_road,road_umap_express,road_umap_stand,road_ringroad1,road_ringroad2,road_umap_city,road_a4,road_subroad,road_umap_zone,road_umap_facility,road_umap_bldg\" checked>일반도로</td></tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"SUB_RDAR_AS_COW001\" checked>시도</td></tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"SUB_RDAR_AS_COW002\" checked>구도</td></tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"SUB_RDAR_AS_COW300\" checked>고속화도로</td></tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"railroad_st\" checked>철도역사</td></tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"railroad\" checked>철도</td></tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"POI_subtrain_sm\" checked>철도역사명</td></tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"UA502\" checked>지번</td></tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"poi_text,poi_text_lv1,poi_text_lv2,text_wayout,POI_national_park\" checked>주요건물명</td></tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"admin_dong_ge\" checked>동경계</td></tr>\t\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"admin_gu_ge\" checked>구경계</td></tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"TNN_SMPR\" checked>동명</td></tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"TNN_SKPR\" checked>구명</td></tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t</table>\t\r\n\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t";
  private final static String _jspx_template20 = "\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t\t<td width=\"12px\" background=\"/img/mapImg/box_right.gif\"></td>\r\n\t\t\t</tr>\r\n\t\t\t<tr>\r\n\t\t\t\t<td width=\"12px\" height=\"12px\"><img src=\"/img/mapImg/box_bottom_left.gif\" width=\"12px\" height=\"12px\" style=\"vertical-align: top;\"></td>\r\n\t\t\t\t<td width=\"776px\" background=\"/img/mapImg/box_bottom_mid.gif\"></td>\r\n\t\t\t\t<td width=\"12px\" ><img src=\"/img/mapImg/box_bottom_right.gif\" width=\"12px\" height=\"12px\" style=\"vertical-align: top;\"></td>\r\n\t\t\t</tr>\r\n\t\t</table>\r\n\t</form>\r\n</body>\r\n</html>\r\n";
}
