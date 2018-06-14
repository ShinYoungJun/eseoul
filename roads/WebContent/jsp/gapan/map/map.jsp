<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/loginCheck.jsp"%>
<%@ include file="/jsp/common/include.jsp"%>
<%@ include file="/jsp/common/environment_setting.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />
<title>::::: 서울시 도로점용관리시스템 :::::</title>
<link href="/css/Mroads.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="/OpenLayers/theme/default/style.css" type="text/css" />
<style type="text/css">
<!--
body {
	margin: 0px;
	background-image: url(/img/mapImg/map_back.gif);
}

.olImageLoadError {
	background-color: transparent !important;
}

.olControlLoadingPanel {
	background-image: url(/img/LoadingBar.gif);
	left: 40%;
	top: 40%;
	position: relative;
	width: 213px;
	height: 59px;
	background-position: center;
	background-repeat: no-repeat;
	display: none;
}
-->
</style>
<script type="text/javascript" src="/OpenLayers/lib/OpenLayers.js"></script>
<script type="text/javascript" src="/OpenLayers/lib/OpenLayers/Control/LoadingPanel.js"></script>
<script>
	var mapServUrl = "<%=newMapAddr%>";
	var map, measureControls, loadingCtl,nav;
	var wmaLayer,markerLayer;
	
	var featureStyle = new OpenLayers.StyleMap({
		"default" : new OpenLayers.Style({
			strokeColor:"#30C0FF",
			fillColor:"#30C0FF",
			strokeWidth:2,
			strokeOpacity:1,
			fillOpacity:0.5,
			pointRadius:5
		})
	});
	
	// 초기화
	function init(){
    	
    	loadingCtl = new OpenLayers.Control.LoadingPanel();
        nav = new OpenLayers.Control.NavigationHistory();
    	
    	
        var options = { 
       		projection: new OpenLayers.Projection("EPSG:2097"), 	
			displayProjection: new OpenLayers.Projection("EPSG:2097"),
			units: "m",
			maxExtent:  new OpenLayers.Bounds(178907.611,436569.343,215956.979,466854.878),
			scales : [ 135000, 68000, 34000, 17000, 8000, 4000, 2000, 1000, 500 ],
			controls: [
				new OpenLayers.Control.Scale(),
				new OpenLayers.Control.Navigation(),
				nav,
				loadingCtl
			]
		};
        
		map = new OpenLayers.Map('map', options);

        wmsLayer = new OpenLayers.Layer.WMS("KSIC_WMS",mapServUrl,{layers: getSelectedLayer(),format:"image/png"},
        		{isBaseLayer: true, singleTile: true, transitionEffect:'resize'});
        
        markerLayer = new OpenLayers.Layer.Markers("markers");
        
        map.addLayers([wmsLayer,markerLayer]);
        
        measureControls = {
                line: new OpenLayers.Control.Measure(
                    OpenLayers.Handler.Path, {
                        persist: true,
                        handlerOptions: {
    						layerOptions: {styleMap: featureStyle}
                        }
                    }
                ),
                polygon: new OpenLayers.Control.Measure(
                    OpenLayers.Handler.Polygon, {
                        persist: true,
                        handlerOptions: {
    						layerOptions: {styleMap: featureStyle}
                        }
                    }
                )
            };
            
        var measureControl;
        
        for(var key in measureControls) {
        	measureControl = measureControls[key];
        	measureControl.events.on({
                "measure": handleMeasurements,
                "measurepartial": handleMeasurements
            });
            map.addControl(measureControl);
        }
            
    	map.zoomToMaxExtent();
		
		document.getElementById("left").src = "/gapan/map/search.do";
    }
	
	
	//body onload
	window.onload = init;
	
	//기본 조작 버튼
	function ZoomIn() { map.zoomIn(); }
	function ZoomOut() { map.zoomOut(); }
	function Fit() { map.zoomToMaxExtent(); }	
	
	
	//레이어 정보 얻기
	function getSelectedLayer(){
		var rStr = [];
		for( var i = 0; i < document.getElementsByName("layers").length; i++){
			if(document.getElementsByName("layers")[i].checked) rStr.push(document.getElementsByName("layers")[i].id);
		}
		return rStr.join(',');
	}
	
	//레이어 정보 세팅
	function setLayer(layerName,checked){
	for( var i = 0; i < document.getElementsByName("layers").length; i++ )
	{
		if( document.getElementsByName("layers")[i].id == layerName ) {
			document.getElementsByName("layers")[i].checked = checked;
			break;
		}
	}
	var newParams = {'layers' : getSelectedLayer(), 'format' : 'image/png'};
	
	wmsLayer.mergeNewParams( newParams );
			
	}
	
	// marker 추가
	function addMaker(mX, mY,imgUrl,imgW,imgH,markerTip,clickFunc){
		var mkXy = new OpenLayers.LonLat(mX, mY);
		var url = imgUrl;
		var sz = new OpenLayers.Size(imgW, imgH);
		var calculateOffset = function(size) {
			return new OpenLayers.Pixel(-(size.w/2), -size.h);
		};
		var icon = new OpenLayers.Icon(url, sz, null, calculateOffset);
		
		var marker = new OpenLayers.Marker(mkXy, icon);
		
		marker.mkXy = mkXy;
		marker.markerTip = markerTip;
		marker.events.register("click",marker,clickFunc);
		
		marker.events.register("mouseover",marker,function(evt){
			this.icon.imageDiv.style.cursor = 'pointer';
			
			TipMain.innerHTML = this.markerTip;
			TipMain.style.visibility = 'visible';
			
			var Px = map.getViewPortPxFromLonLat(this.mkXy);
			TipMain.style.posLeft = Px.x+230;
			TipMain.style.posTop = Px.y-30;
			
		});
		
		marker.events.register("mouseout",marker,function(evt){
			this.icon.imageDiv.style.cursor = 'default';
			TipMain.innerHTML = '';
			TipMain.style.visibility = 'hidden';
		});

		markerLayer.addMarker(marker);
	}


	function removeMakers(){ //marker 삭제
		if(markerLayer){
			markerLayer.clearMarkers();	
		}
		
	}
	
	
	
	//거리 면적 계산
	function handleMeasurements(event) {
        var geometry = event.geometry;
        var units = event.units;
        var order = event.order;
        var measure = event.measure;
		var xy = geometry.getVertices();
		var gubun = "";
		var result = "";
		if(order == 1){
			gubun = "거리";
			result = measure.toFixed(3) + " " + units;
		}else{
			gubun = "면적";
			result = measure.toFixed(3) + " " + units + "<sup>2</" + "sup>";
		}

		var lonlat = new OpenLayers.LonLat(xy[xy.length-1].x, xy[xy.length-1].y);
		var px = map.getPixelFromLonLat(lonlat);
		var Popup = document.getElementById("mPopup");
		var inHtml = "";
		
		mPopup.style.left = (px.x+5) + "px";
		mPopup.style.top = (px.y+5) + "px";
		mPopup.style.display = "inline";
		inHtml = "<table width='100%' height='100%' border='0' cellspacing='2' cellpadding='2' bgcolor='#30c0ff' style='margin:0 auto; font-size:11px;'>";
		inHtml += "<tr bgcolor='#FFFFFF' align='center' height='50%'>";
		inHtml += "<td>" + gubun + "&nbsp;&nbsp;<img src='/img/mapImg/close.gif' border='0' onClick='onPopupClose();' style='cursor:pointer;'></td>";
		inHtml += "</tr><tr bgcolor='#FFFFFF' align='center' height='50%'><td>" + result + "</td></tr></table>";

		mPopup.innerHTML = inHtml;
    }
	
	function onPopupClose(){
		var mPopup = document.getElementById("mPopup");
		mPopup.style.display = "none";
		var measureControl;
		for(var key in measureControls){
			measureControl = measureControls[key];
			measureControl.cancel();
		}
	}
	
    function toggleControl(element) {
        for(key in measureControls) {
            var measureControl = measureControls[key];
			if(element == key) {
				measureControl.activate();
            } else {
            	measureControl.deactivate();
            }
        }
    }
    
    
    
    //WFS 처리 내용
    // WFS 조건별 처리 함수
	function wfs_getEqualTo(targetLayer, propertyName, literal, returnFunction) {
		var filterHeader = '<' + '?xml version="1.0" encoding="UTF-8"?>';
		filterHeader += '<wfs:GetFeature xmlns:wfs="http://www.opengis.net/wfs" xmlns:ksic="http://www.ksic.net/wfs" ';
		filterHeader += 'xmlns:ogc="http://www.opengis.net/ogc" xmlns:gml="http://www.opengis.net/gml" ';
		filterHeader += 'xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" version="1.1.0" service="WFS" ';
		filterHeader += 'xsi:schemaLocation="http://www.ksic.net/wfs http://www.opengis.net/wfs http://schemas.opengis.net/wfs/1.1.0/wfs.xsd">';
	
		var filterMain = "";
		filterMain += '<wfs:Query typeName="' + targetLayer + '">';
		filterMain += '<wfs:PropertyName>XGEOMETRY</wfs:PropertyName>';
		filterMain += "<ogc:Filter xmlns:ogc=\"http://www.opengis.net/ogc\">";
		filterMain += "<ogc:PropertyIsEqualTo>";
		filterMain += "<ogc:PropertyName>" + propertyName + "</ogc:PropertyName>";
		filterMain += "<ogc:Literal>" + literal + "</ogc:Literal>";
		filterMain += "</ogc:PropertyIsEqualTo>";
		filterMain += "</ogc:Filter>";
		filterMain += '</wfs:Query>';
	
		var filter = filterHeader + filterMain + '</wfs:GetFeature>';
	
		new OpenLayers.Request.POST({
			method : "POST",
			url : mapServUrl,
			headers : {
				"Content-Type" : "text/xml"
			},
			data : filter,
			callback : returnFunction
		});
	}
    
    
    //반환받은 객체 크기로 zoom하기
	function rt_zoomToBoundaryArea(response) {
		
		var features = new OpenLayers.Format.GML().read(response.responseText);
		
		var totalBounds = new OpenLayers.Bounds();
		
		for(var i = 0; i < features.length; i++){
			totalBounds.extend(features[i].geometry.getBounds());
		}
		map.zoomToExtent(totalBounds);
	}

	//********** BEGIN_현진_20120322
	function winMapPrint() {
		var windowLeft = (screen.width-640)/2;
		var windowTop = (screen.height-480)/2;
		var printURL = "/jsp/gapan/map/printContentBody.html";
		window.open(printURL,"print",'width=680, height=550, menubar=no,   scrollbars=yes,status=no,resizable=yes,top=' + windowTop + ',left=' + windowLeft + '');
	}
	//********** END_현진_20120322
</script>

</head>
<body>
	<div id="container" style="position:relative;width:100%;height:100%;" >    
		<div id='leftMenu' style="position: absolute;top:0px;left:0px;width:260px;height:expression(screen.availHeight-145); z-index: 100">
			<iframe id='left' name='left' src='' width='260px' height='100%' frameborder='0'  scrolling='no' noresize></iframe>
		</div>
		<div id="map" style="position:absolute;top:0px;left:260px;width:expression(screen.availWidth-280); height:expression(screen.availHeight-145); z-index:3;">
		</div>
	</div> 

	<div id="TipMain" style="border:2px;border-color:yellow;background-color:yellow;position:absolute;visibility:hidden;">
	</div>
	<div id="mPopup" style="position:absolute; left:0px; top:0px; width:70px; height:30px; display:inline; z-index:100;">
	</div>
		   
	<div name = 'layerdiv' id = 'layerdiv' style="position:absolute;top:0px;right:0px;width:150px;height:100%;z-index:98;display:none;overflow-y:scroll;scrollbar-face-color: #FFFFFF; scrollbar-highlight-color: #FFFFFF; scrollbar-3dlight-color: #F2F2F2; scrollbar-shadow-color: #999CC; scrollbar-darkshadow-color: #F2F2F2; scrollbar-track-color: #FFFFFF; scrollbar-arrow-color: #9999CC;">
	<table height="100%" width="100%" border="0" cellspacing="0" cellpadding="0" valign="top">
		<tr>
			<td width="100%" height="100%" bgcolor="f9f9f9" class="M_leftborder">
				<table width="100%" border="0" cellspacing="0" cellpadding="0" class="sub_table">
					<tr><td>&nbsp;&nbsp;<input type="checkbox" onclick="setLayer(this.id,this.checked)" name = "layers" id = "land_outline" checked>배경</td></tr>
					<tr><td>&nbsp;&nbsp;<input type="checkbox" onclick="setLayer(this.id,this.checked)" name = "layers" id = "conture2" checked>등고선2</td></tr>
					<tr><td>&nbsp;&nbsp;<input type="checkbox" onclick="setLayer(this.id,this.checked)" name = "layers" id = "contour50" checked>등고선50</td></tr>
					<tr><td>&nbsp;&nbsp;<input type="checkbox" onclick="setLayer(this.id,this.checked)" name = "layers" id = "contour100" checked>등고선100</td></tr>
					<tr><td>&nbsp;&nbsp;<input type="checkbox" onclick="setLayer(this.id,this.checked)" name = "layers" id = "contour200" checked>등고선200</td></tr>
					<tr><td>&nbsp;&nbsp;<input type="checkbox" onclick="setLayer(this.id,this.checked)" name = "layers" id = "contour300" checked>등고선300</td></tr>
					<tr><td>&nbsp;&nbsp;<input type="checkbox" onclick="setLayer(this.id,this.checked)" name = "layers" id = "contour400" checked>등고선400</td></tr>
					<tr><td>&nbsp;&nbsp;<input type="checkbox" onclick="setLayer(this.id,this.checked)" name = "layers" id = "contour500" checked>등고선500</td></tr>
					<tr><td>&nbsp;&nbsp;<input type="checkbox" onclick="setLayer(this.id,this.checked)" name = "layers" id = "contour600" checked>등고선600</td></tr>
					<tr><td>&nbsp;&nbsp;<input type="checkbox" onclick="setLayer(this.id,this.checked)" name = "layers" id = "contour700" checked>등고선700</td></tr>
					<tr><td>&nbsp;&nbsp;<input type="checkbox" onclick="setLayer(this.id,this.checked)" name = "layers" id = "RIVER_M,river" checked>하천호수</td></tr>
					<tr><td>&nbsp;&nbsp;<input type="checkbox" onclick="setLayer(this.id,this.checked)" name = "layers" id = "national_park" checked>국립공원</td></tr>
					<tr><td>&nbsp;&nbsp;<input type="checkbox" onclick="setLayer(this.id,this.checked)" name = "layers" id = "zone_apt,zone_carpark,zone_factory,zone_golf,zone_hospital,zone_park,zone_publicoffice,zone_restingplace,zone_school,zone_zone" checked>구역</td></tr>
					<tr><td>&nbsp;&nbsp;<input type="checkbox" onclick="setLayer(this.id,this.checked)" name = "layers" id = "bldg_etc" checked>건물군</td></tr>
					<tr><td>&nbsp;&nbsp;<input type="checkbox" onclick="setLayer(this.id,this.checked)" name = "layers" id = "seoul_bldg_apart" checked>건물_아파트</td></tr>
					<tr><td>&nbsp;&nbsp;<input type="checkbox" onclick="setLayer(this.id,this.checked)" name = "layers" id = "seoul_bldg_general" checked>건물_일반</td></tr>
					<tr><td>&nbsp;&nbsp;<input type="checkbox" onclick="setLayer(this.id,this.checked)" name = "layers" id = "seoul_bldg_important" checked>건물_다가구주택</td></tr>
					<tr><td>&nbsp;&nbsp;<input type="checkbox" onclick="setLayer(this.id,this.checked)" name = "layers" id = "seoul_bldg_privatehouse" checked>건물_다세대</td></tr>
					<tr><td>&nbsp;&nbsp;<input type="checkbox" onclick="setLayer(this.id,this.checked)" name = "layers" id = "seoul_bldg_government" checked>건물_정부기관</td></tr>
					<tr><td>&nbsp;&nbsp;<input type="checkbox" onclick="setLayer(this.id,this.checked)" name = "layers" id = "seoul_bldg_shop" checked>건물_상점</td></tr>
					<tr><td>&nbsp;&nbsp;<input type="checkbox" onclick="setLayer(this.id,this.checked)" name = "layers" id = "seoul_bldg_hospital" checked>건물_병원</td></tr>
					<tr><td>&nbsp;&nbsp;<input type="checkbox" onclick="setLayer(this.id,this.checked)" name = "layers" id = "seoul_bldg_school" checked>건물_학교</td></tr>
					<tr><td>&nbsp;&nbsp;<input type="checkbox" onclick="setLayer(this.id,this.checked)" name = "layers" id = "seoul_bldg_hotel" checked>건물_호텔</td></tr>
					<tr><td>&nbsp;&nbsp;<input type="checkbox" onclick="setLayer(this.id,this.checked)" name = "layers" id = "seoul_bldg_culture" checked>건물_문화</td></tr>
					<tr><td>&nbsp;&nbsp;<input type="checkbox" onclick="setLayer(this.id,this.checked)" name = "layers" id = "seoul_bldg_exercise" checked>건물_운동시설</td></tr>	
					<tr><td>&nbsp;&nbsp;<input type="checkbox" onclick="setLayer(this.id,this.checked)" name = "layers" id = "seoul_bldg_extra" checked>건물_기타</td></tr>
					<tr><td>&nbsp;&nbsp;<input type="checkbox" onclick="setLayer(this.id,this.checked)" name = "layers" id = "road_express4,road_express5" checked>고속도로</td></tr>	
					<tr><td>&nbsp;&nbsp;<input type="checkbox" onclick="setLayer(this.id,this.checked)" name = "layers" id = "bldg_road,road_umap_express,road_umap_stand,road_ringroad1,road_ringroad2,road_umap_city,road_a4,road_subroad,road_umap_zone,road_umap_facility,road_umap_bldg" checked>일반도로</td></tr>
					<tr><td>&nbsp;&nbsp;<input type="checkbox" onclick="setLayer(this.id,this.checked)" name = "layers" id = "SUB_RDAR_AS_COW001" checked>시도</td></tr>
					<tr><td>&nbsp;&nbsp;<input type="checkbox" onclick="setLayer(this.id,this.checked)" name = "layers" id = "SUB_RDAR_AS_COW002" checked>구도</td></tr>
					<tr><td>&nbsp;&nbsp;<input type="checkbox" onclick="setLayer(this.id,this.checked)" name = "layers" id = "SUB_RDAR_AS_COW300" checked>고속화도로</td></tr>
					<tr><td>&nbsp;&nbsp;<input type="checkbox" onclick="setLayer(this.id,this.checked)" name = "layers" id = "railroad_st" checked>철도역사</td></tr>
					<tr><td>&nbsp;&nbsp;<input type="checkbox" onclick="setLayer(this.id,this.checked)" name = "layers" id = "railroad" checked>철도</td></tr>
					<tr><td>&nbsp;&nbsp;<input type="checkbox" onclick="setLayer(this.id,this.checked)" name = "layers" id = "POI_subtrain_sm" checked>철도역사명</td></tr>
					<tr><td>&nbsp;&nbsp;<input type="checkbox" onclick="setLayer(this.id,this.checked)" name = "layers" id = "UA502" checked>지번</td></tr>
					<tr><td>&nbsp;&nbsp;<input type="checkbox" onclick="setLayer(this.id,this.checked)" name = "layers" id = "poi_text,poi_text_lv1,poi_text_lv2,text_wayout,POI_national_park" checked>주요건물명</td></tr>
					<tr><td>&nbsp;&nbsp;<input type="checkbox" onclick="setLayer(this.id,this.checked)" name = "layers" id = "admin_dong_ge" checked>동경계</td></tr>	
					<tr><td>&nbsp;&nbsp;<input type="checkbox" onclick="setLayer(this.id,this.checked)" name = "layers" id = "admin_gu_ge" checked>구경계</td></tr>
					<tr><td>&nbsp;&nbsp;<input type="checkbox" onclick="setLayer(this.id,this.checked)" name = "layers" id = "TNN_SMPR" checked>동명</td></tr>
					<tr><td>&nbsp;&nbsp;<input type="checkbox" onclick="setLayer(this.id,this.checked)" name = "layers" id = "TNN_SKPR" checked>구명</td></tr>
				</table>
			</td>
		</tr>
	</table>
	</div>
</body>
</html>