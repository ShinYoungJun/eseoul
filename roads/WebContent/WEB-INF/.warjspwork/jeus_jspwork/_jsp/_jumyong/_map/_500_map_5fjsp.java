package jeus_jspwork._jsp._jumyong._map;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_map_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      out.write(_jspx_template10);
      // jsp code [from=(1,3);to=(12,1)]
      
         String MapServerIP="98.33.1.86";
         String MapServerPort="8080";
         String MapServerURL="http://"+MapServerIP+":"+MapServerPort;
         
         String WebServerIP=MapServerIP;
         String WebServerPort=MapServerPort;
         String WebServerURL="http://"+WebServerIP;
         
         String newMapAddr="/RoadsMap/MapService";//WEbtoB proxy process
         

      out.write(_jspx_template11);
      // jsp code [from=(38,23);to=(38,33)]
      out.print(newMapAddr);

      out.write(_jspx_template12);
      out.write(_jspx_template13);
      out.write(_jspx_template14);
      out.write(_jspx_template15);
      out.write(_jspx_template16);

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
  private final static String _jspx_template0 = "\r\n";
  private final static String _jspx_template1 = "\r\n\t\t<script language=\"javascript\">\r\n\t\t\talert('사용자의 사용시간이 종료되었습니다. 다시 접속 해주시기 바랍니다.');\r\n\t\t\tparent.parent.parent.parent.location.href=\"/admin/user/login.do\";\r\n\t\t</script>\r\n";
  private final static String _jspx_template2 = "\r\n";
  private final static String _jspx_template3 = "\r\n";
  private final static String _jspx_template4 = "\r\n";
  private final static String _jspx_template5 = "  \r\n";
  private final static String _jspx_template6 = "  \r\n";
  private final static String _jspx_template7 = "  \r\n";
  private final static String _jspx_template8 = "\r\n";
  private final static String _jspx_template9 = "\r\n";
  private final static String _jspx_template10 = "\r\n";
  private final static String _jspx_template11 = "\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로점용관리시스템 :::::</title>\r\n<link href=\"/css/Mroads.css\" rel=\"stylesheet\" type=\"text/css\">\r\n<link rel=\"stylesheet\" href=\"/OpenLayers/theme/default/style.css\" type=\"text/css\" />\r\n<style type=\"text/css\">\r\n<!--\r\nbody {\r\n\tmargin: 0px;\r\n\tbackground-image: url(/img/mapImg/map_back.gif);\r\n}\r\n\r\n.olImageLoadError {\r\n\tbackground-color: transparent !important;\r\n}\r\n\r\n.olControlLoadingPanel {\r\n\tbackground-image: url(/img/LoadingBar.gif);\r\n\tleft: 40%;\r\n\ttop: 40%;\r\n\tposition: relative;\r\n\twidth: 213px;\r\n\theight: 59px;\r\n\tbackground-position: center;\r\n\tbackground-repeat: no-repeat;\r\n\tdisplay: none;\r\n}\r\n-->\r\n</style>\r\n<script type=\"text/javascript\" src=\"/OpenLayers/lib/OpenLayers.js\"></script>\r\n<script type=\"text/javascript\" src=\"/OpenLayers/lib/OpenLayers/Control/LoadingPanel.js\"></script>\r\n<script>\r\n\tvar mapServUrl = \"";
  private final static String _jspx_template12 = "\";\r\n\tvar map, measureControls, loadingCtl,nav;\r\n\tvar wmaLayer,markerLayer;\r\n\t\r\n\tvar featureStyle = new OpenLayers.StyleMap({\r\n\t\t\"default\" : new OpenLayers.Style({\r\n\t\t\tstrokeColor:\"#30C0FF\",\r\n\t\t\tfillColor:\"#30C0FF\",\r\n\t\t\tstrokeWidth:2,\r\n\t\t\tstrokeOpacity:1,\r\n\t\t\tfillOpacity:0.5,\r\n\t\t\tpointRadius:5\r\n\t\t})\r\n\t});\r\n\t\r\n\t// 초기화\r\n\tfunction init(){\r\n    \t\r\n    \tloadingCtl = new OpenLayers.Control.LoadingPanel();\r\n        nav = new OpenLayers.Control.NavigationHistory();\r\n    \t\r\n    \t\r\n        var options = { \r\n       \t\tprojection: new OpenLayers.Projection(\"EPSG:2097\"), \t\r\n\t\t\tdisplayProjection: new OpenLayers.Projection(\"EPSG:2097\"),\r\n\t\t\tunits: \"m\",\r\n\t\t\tmaxExtent:  new OpenLayers.Bounds(178907.611,436569.343,215956.979,466854.878),\r\n\t\t\tscales : [ 135000, 68000, 34000, 17000, 8000, 4000, 2000, 1000, 500 ],\r\n\t\t\tcontrols: [\r\n\t\t\t\tnew OpenLayers.Control.Scale(),\r\n\t\t\t\tnew OpenLayers.Control.Navigation(),\r\n\t\t\t\tnav,\r\n\t\t\t\tloadingCtl\r\n\t\t\t]\r\n\t\t};\r\n        \r\n\t\tmap = new OpenLayers.Map('map', options);\r\n\r\n        wmsLayer = new OpenLayers.Layer.WMS(\"KSIC_WMS\",mapServUrl,{layers: getSelectedLayer(),format:\"image/png\"},\r\n        \t\t{isBaseLayer: true, singleTile: true, transitionEffect:'resize'});\r\n        \r\n        markerLayer = new OpenLayers.Layer.Markers(\"markers\");\r\n        \r\n        map.addLayers([wmsLayer,markerLayer]);\r\n        \r\n        measureControls = {\r\n                line: new OpenLayers.Control.Measure(\r\n                    OpenLayers.Handler.Path, {\r\n                        persist: true,\r\n                        handlerOptions: {\r\n    \t\t\t\t\t\tlayerOptions: {styleMap: featureStyle}\r\n                        }\r\n                    }\r\n                ),\r\n                polygon: new OpenLayers.Control.Measure(\r\n                    OpenLayers.Handler.Polygon, {\r\n                        persist: true,\r\n                        handlerOptions: {\r\n    \t\t\t\t\t\tlayerOptions: {styleMap: featureStyle}\r\n                        }\r\n                    }\r\n                )\r\n            };\r\n            \r\n        var measureControl;\r\n        \r\n        for(var key in measureControls) {\r\n        \tmeasureControl = measureControls[key];\r\n        \tmeasureControl.events.on({\r\n                \"measure\": handleMeasurements,\r\n                \"measurepartial\": handleMeasurements\r\n            });\r\n            map.addControl(measureControl);\r\n        }\r\n            \r\n    \tmap.zoomToMaxExtent();\r\n\t\t\r\n\t\tdocument.getElementById(\"left\").src = \"/jumyong/map/search.do\";\r\n    }\r\n\t\r\n\t\r\n\t//body onload\r\n\twindow.onload = init;\r\n\t\r\n\t//기본 조작 버튼\r\n\tfunction ZoomIn() { map.zoomIn(); }\r\n\tfunction ZoomOut() { map.zoomOut(); }\r\n\tfunction Fit() { map.zoomToMaxExtent(); }\t\r\n\t\r\n\t\r\n\t//레이어 정보 얻기\r\n\tfunction getSelectedLayer(){\r\n\t\tvar rStr = [];\r\n\t\tfor( var i = 0; i < document.getElementsByName(\"layers\").length; i++){\r\n\t\t\tif(document.getElementsByName(\"layers\")[i].checked) rStr.push(document.getElementsByName(\"layers\")[i].id);\r\n\t\t}\r\n\t\treturn rStr.join(',');\r\n\t}\r\n\t\r\n\t//레이어 정보 세팅\r\n\tfunction setLayer(layerName,checked){\r\n\tfor( var i = 0; i < document.getElementsByName(\"layers\").length; i++ )\r\n\t{\r\n\t\tif( document.getElementsByName(\"layers\")[i].id == layerName ) {\r\n\t\t\tdocument.getElementsByName(\"layers\")[i].checked = checked;\r\n\t\t\tbreak;\r\n\t\t}\r\n\t}\r\n\tvar newParams = {'layers' : getSelectedLayer(), 'format' : 'image/png'};\r\n\t\r\n\twmsLayer.mergeNewParams( newParams );\r\n\t\t\t\r\n\t}\r\n\t\r\n\t// marker 추가\r\n\tfunction addMaker(mX, mY,imgUrl,imgW,imgH,markerTip,clickFunc){\r\n\t\tvar mkXy = new OpenLayers.LonLat(mX, mY);\r\n\t\tvar url = imgUrl;\r\n\t\tvar sz = new OpenLayers.Size(imgW, imgH);\r\n\t\tvar calculateOffset = function(size) {\r\n\t\t\treturn new OpenLayers.Pixel(-(size.w/2), -size.h);\r\n\t\t};\r\n\t\tvar icon = new OpenLayers.Icon(url, sz, null, calculateOffset);\r\n\t\t\r\n\t\tvar marker = new OpenLayers.Marker(mkXy, icon);\r\n\t\t\r\n\t\tmarker.mkXy = mkXy;\r\n\t\tmarker.markerTip = markerTip;\r\n\t\tmarker.events.register(\"click\",marker,clickFunc);\r\n\t\t\r\n\t\tmarker.events.register(\"mouseover\",marker,function(evt){\r\n\t\t\tthis.icon.imageDiv.style.cursor = 'pointer';\r\n\t\t\t\r\n\t\t\tTipMain.innerHTML = this.markerTip;\r\n\t\t\tTipMain.style.visibility = 'visible';\r\n\t\t\t\r\n\t\t\t";
  private final static String _jspx_template13 = "var Px = map.getViewPortPxFromLonLat(this.mkXy);\r\n\t\t\tTipMain.style.posLeft = Px.x+230;\r\n\t\t\tTipMain.style.posTop = Px.y-30;\r\n\t\t\t\r\n\t\t});\r\n\t\t\r\n\t\tmarker.events.register(\"mouseout\",marker,function(evt){\r\n\t\t\tthis.icon.imageDiv.style.cursor = 'default';\r\n\t\t\tTipMain.innerHTML = '';\r\n\t\t\tTipMain.style.visibility = 'hidden';\r\n\t\t});\r\n\r\n\t\tmarkerLayer.addMarker(marker);\r\n\t}\r\n\r\n\r\n\tfunction removeMakers(){ //marker 삭제\r\n\t\tif(markerLayer){\r\n\t\t\tmarkerLayer.clearMarkers();\t\r\n\t\t}\r\n\t\t\r\n\t}\r\n\t\r\n\t\r\n\t\r\n\t//거리 면적 계산\r\n\tfunction handleMeasurements(event) {\r\n        var geometry = event.geometry;\r\n        var units = event.units;\r\n        var order = event.order;\r\n        var measure = event.measure;\r\n\t\tvar xy = geometry.getVertices();\r\n\t\tvar gubun = \"\";\r\n\t\tvar result = \"\";\r\n\t\tif(order == 1){\r\n\t\t\tgubun = \"거리\";\r\n\t\t\tresult = measure.toFixed(3) + \" \" + units;\r\n\t\t}else{\r\n\t\t\tgubun = \"면적\";\r\n\t\t\tresult = measure.toFixed(3) + \" \" + units + \"<sup>2</\" + \"sup>\";\r\n\t\t}\r\n\r\n\t\tvar lonlat = new OpenLayers.LonLat(xy[xy.length-1].x, xy[xy.length-1].y);\r\n\t\tvar px = map.getPixelFromLonLat(lonlat);\r\n\t\tvar Popup = document.getElementById(\"mPopup\");\r\n\t\tvar inHtml = \"\";\r\n\t\t\r\n\t\tmPopup.style.left = (px.x+5) + \"px\";\r\n\t\tmPopup.style.top = (px.y+5) + \"px\";\r\n\t\tmPopup.style.display = \"inline\";\r\n\t\tinHtml = \"<table width='100%' height='100%' border='0' cellspacing='2' cellpadding='2' bgcolor='#30c0ff' style='margin:0 auto; font-size:11px;'>\";\r\n\t\tinHtml += \"<tr bgcolor='#FFFFFF' align='center' height='50%'>\";\r\n\t\tinHtml += \"<td>\" + gubun + \"&nbsp;&nbsp;<img src='/img/mapImg/close.gif' border='0' onClick='onPopupClose();' style='cursor:pointer;'></td>\";\r\n\t\tinHtml += \"</tr><tr bgcolor='#FFFFFF' align='center' height='50%'><td>\" + result + \"</td></tr></table>\";\r\n\r\n\t\tmPopup.innerHTML = inHtml;\r\n    }\r\n\t\r\n\tfunction onPopupClose(){\r\n\t\tvar mPopup = document.getElementById(\"mPopup\");\r\n\t\tmPopup.style.display = \"none\";\r\n\t\tvar measureControl;\r\n\t\tfor(var key in measureControls){\r\n\t\t\tmeasureControl = measureControls[key];\r\n\t\t\tmeasureControl.cancel();\r\n\t\t}\r\n\t}\r\n\t\r\n    function toggleControl(element) {\r\n        for(key in measureControls) {\r\n            var measureControl = measureControls[key];\r\n\t\t\tif(element == key) {\r\n\t\t\t\tmeasureControl.activate();\r\n            } else {\r\n            \tmeasureControl.deactivate();\r\n            }\r\n        }\r\n    }\r\n    \r\n    \r\n    \r\n    //WFS 처리 내용\r\n    // WFS 조건별 처리 함수\r\n\tfunction wfs_getEqualTo(targetLayer, propertyName, literal, returnFunction) {\r\n\t\tvar filterHeader = '<' + '?xml version=\"1.0\" encoding=\"UTF-8\"?>';\r\n\t\tfilterHeader += '<wfs:GetFeature xmlns:wfs=\"http://www.opengis.net/wfs\" xmlns:ksic=\"http://www.ksic.net/wfs\" ';\r\n\t\tfilterHeader += 'xmlns:ogc=\"http://www.opengis.net/ogc\" xmlns:gml=\"http://www.opengis.net/gml\" ';\r\n\t\tfilterHeader += 'xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" version=\"1.1.0\" service=\"WFS\" ';\r\n\t\tfilterHeader += 'xsi:schemaLocation=\"http://www.ksic.net/wfs http://www.opengis.net/wfs http://schemas.opengis.net/wfs/1.1.0/wfs.xsd\">';\r\n\t\r\n\t\tvar filterMain = \"\";\r\n\t\tfilterMain += '<wfs:Query typeName=\"' + targetLayer + '\">';\r\n\t\tfilterMain += '<wfs:PropertyName>XGEOMETRY</wfs:PropertyName>';\r\n\t\tfilterMain += \"<ogc:Filter xmlns:ogc=\\\"http://www.opengis.net/ogc\\\">\";\r\n\t\tfilterMain += \"<ogc:PropertyIsEqualTo>\";\r\n\t\tfilterMain += \"<ogc:PropertyName>\" + propertyName + \"</ogc:PropertyName>\";\r\n\t\tfilterMain += \"<ogc:Literal>\" + literal + \"</ogc:Literal>\";\r\n\t\tfilterMain += \"</ogc:PropertyIsEqualTo>\";\r\n\t\tfilterMain += \"</ogc:Filter>\";\r\n\t\tfilterMain += '</wfs:Query>';\r\n\t\r\n\t\tvar filter = filterHeader + filterMain + '</wfs:GetFeature>';\r\n\t\r\n\t\tnew OpenLayers.Request.POST({\r\n\t\t\tmethod : \"POST\",\r\n\t\t\turl : mapServUrl,\r\n\t\t\theaders : {\r\n\t\t\t\t\"Content-Type\" : \"text/xml\"\r\n\t\t\t},\r\n\t\t\tdata : filter,\r\n\t\t\tcallback : returnFunction\r\n\t\t});\r\n\t}\r\n    \r\n    \r\n    //반환받은 객체 크기로 zoom하기\r\n\tfunction rt_zoomToBoundaryArea(response) {\r\n\t\t\r\n\t\tvar features = new OpenLayers.Format.GML().read(response.responseText);\r\n\t\t\r\n\t\tvar totalBounds = new OpenLayers.Bounds();\r\n\t\t\r\n\t\tfor(var i = 0; i < features.length; i++){\r\n\t\t\ttotalBounds.extend(features[i].geometry.getBounds());\r\n\t\t}\r\n\t\tm";
  private final static String _jspx_template14 = "ap.zoomToExtent(totalBounds);\r\n\t}\r\n\r\n\t//********** BEGIN_현진_20120322\r\n\tfunction winMapPrint() {\r\n\t\tvar windowLeft = (screen.width-640)/2;\r\n\t\tvar windowTop = (screen.height-480)/2;\r\n\t\tvar printURL = \"/jsp/jumyong/map/printContentBody.html\";\r\n\t\twindow.open(printURL,\"print\",'width=680, height=550, menubar=no,   scrollbars=yes,status=no,resizable=yes,top=' + windowTop + ',left=' + windowLeft + '');\r\n\t}\r\n\t//********** END_현진_20120322\r\n\r\n\r\n\t\t\r\n</script>\r\n\r\n</head>\r\n<body>\r\n\t<div id=\"container\" style=\"position:relative;width:100%;height:100%;\" >    \r\n\t\t<div id='leftMenu' style=\"position: absolute;top:0px;left:0px;width:260px;height:expression(screen.availHeight-145); z-index: 100\">\r\n\t\t\t<iframe id='left' name='left' src='' width='260px' height='100%' frameborder='0'  scrolling='no' noresize></iframe>\r\n\t\t</div>\r\n\t\t<div id=\"map\" style=\"position:absolute;top:0px;left:260px;width:expression(screen.availWidth-280); height:expression(screen.availHeight-145); z-index:3;\">\r\n\t\t</div>\r\n\t</div> \r\n\r\n\t<div id=\"TipMain\" style=\"border:2px;border-color:yellow;background-color:yellow;position:absolute;visibility:hidden;\">\r\n\t</div>\r\n\t<div id=\"mPopup\" style=\"position:absolute; left:0px; top:0px; width:70px; height:30px; display:inline; z-index:100;\">\r\n\t</div>\r\n\t\t   \r\n\t<div name = 'layerdiv' id = 'layerdiv' style=\"position:absolute;top:0px;right:0px;width:150px;height:100%;z-index:98;display:none;overflow-y:scroll;scrollbar-face-color: #FFFFFF; scrollbar-highlight-color: #FFFFFF; scrollbar-3dlight-color: #F2F2F2; scrollbar-shadow-color: #999CC; scrollbar-darkshadow-color: #F2F2F2; scrollbar-track-color: #FFFFFF; scrollbar-arrow-color: #9999CC;\">\r\n\t<table height=\"100%\" width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" valign=\"top\">\r\n\t\t<tr>\r\n\t\t\t<td width=\"100%\" height=\"100%\" bgcolor=\"f9f9f9\" class=\"M_leftborder\">\r\n\t\t\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" class=\"sub_table\">\r\n\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"land_outline\" checked>배경</td></tr>\r\n\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"conture2\" checked>등고선2</td></tr>\r\n\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"contour50\" checked>등고선50</td></tr>\r\n\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"contour100\" checked>등고선100</td></tr>\r\n\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"contour200\" checked>등고선200</td></tr>\r\n\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"contour300\" checked>등고선300</td></tr>\r\n\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"contour400\" checked>등고선400</td></tr>\r\n\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"contour500\" checked>등고선500</td></tr>\r\n\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"contour600\" checked>등고선600</td></tr>\r\n\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"contour700\" checked>등고선700</td></tr>\r\n\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"RIVER_M,river\" checked>하천호수</td></tr>\r\n\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"national_park\" checked>국립공원</td></tr>\r\n\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"zone_apt,zone_carpark,zone_factory,zone_golf,zone_hospital,zone_park,zone_publicoffice,zone_restingplace,zone_school,zone_zone\" checked>구역</td></tr>\r\n\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"bldg_etc\" checked>건물군</td></tr>\r\n";
  private final static String _jspx_template15 = "\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"seoul_bldg_apart\" checked>건물_아파트</td></tr>\r\n\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"seoul_bldg_general\" checked>건물_일반</td></tr>\r\n\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"seoul_bldg_important\" checked>건물_다가구주택</td></tr>\r\n\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"seoul_bldg_privatehouse\" checked>건물_다세대</td></tr>\r\n\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"seoul_bldg_government\" checked>건물_정부기관</td></tr>\r\n\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"seoul_bldg_shop\" checked>건물_상점</td></tr>\r\n\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"seoul_bldg_hospital\" checked>건물_병원</td></tr>\r\n\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"seoul_bldg_school\" checked>건물_학교</td></tr>\r\n\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"seoul_bldg_hotel\" checked>건물_호텔</td></tr>\r\n\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"seoul_bldg_culture\" checked>건물_문화</td></tr>\r\n\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"seoul_bldg_exercise\" checked>건물_운동시설</td></tr>\t\r\n\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"seoul_bldg_extra\" checked>건물_기타</td></tr>\r\n\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"road_express4,road_express5\" checked>고속도로</td></tr>\t\r\n\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"bldg_road,road_umap_express,road_umap_stand,road_ringroad1,road_ringroad2,road_umap_city,road_a4,road_subroad,road_umap_zone,road_umap_facility,road_umap_bldg\" checked>일반도로</td></tr>\r\n\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"SUB_RDAR_AS_COW001\" checked>시도</td></tr>\r\n\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"SUB_RDAR_AS_COW002\" checked>구도</td></tr>\r\n\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"SUB_RDAR_AS_COW300\" checked>고속화도로</td></tr>\r\n\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"railroad_st\" checked>철도역사</td></tr>\r\n\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"railroad\" checked>철도</td></tr>\r\n\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"POI_subtrain_sm\" checked>철도역사명</td></tr>\r\n\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"UA502\" checked>지번</td></tr>\r\n\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"poi_text,poi_text_lv1,poi_text_lv2,text_wayout,POI_national_park\" checked>주요건물명</td></tr>\r\n\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"admin_dong_ge\" checked>동경계</td></tr>\t\r\n\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"admin_gu_ge\" checked>구경계</td></tr>\r\n\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLayer(this.id,this.checked)\" name = \"layers\" id = \"TNN_SMPR\" checked>동명</td></tr>\r\n\t\t\t\t\t<tr><td>&nbsp;&nbsp;<input type=\"checkbox\" onclick=\"setLaye";
  private final static String _jspx_template16 = "r(this.id,this.checked)\" name = \"layers\" id = \"TNN_SKPR\" checked>구명</td></tr>\r\n\t\t\t\t</table>\r\n\t\t\t</td>\r\n\t\t</tr>\r\n\t</table>\r\n\t</div>\r\n</body>\r\n</html>";
}
