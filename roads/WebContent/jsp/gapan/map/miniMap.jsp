<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="/jsp/common/loginCheck.jsp"%>
<%@ include file="/jsp/common/include.jsp"%>
<%@ include file="/jsp/common/environment_setting.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>::::: 서울시 도로점용관리시스템 :::::</title>
<link href="css/Mroads.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="/OpenLayers/theme/default/style.css" type="text/css" />
<style type="text/css">
<!--
body {
	margin: 0px;
	background-image: url(/img/mapImg/map_back.gif) margin :   0px;
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
<script type="text/javascript" src="/js/common.js"></script>
<script type="text/javascript" src="/OpenLayers/lib/OpenLayers.js"></script>
<script type="text/javascript" src="/OpenLayers/lib/OpenLayers/Control/LoadingPanel.js"></script>
<script type="text/JavaScript">
var mapServUrl = "<%=newMapAddr%>";
	var map, measureControls, loadingCtl;
	var wmaLayer,markerLayer;

	//초기화
	function init() {
		
		
		var xc = document.getElementById("X_COORD").value;
		var yc = document.getElementById("Y_COORD").value;
		var pnu = document.getElementById("PNU").value;
		var type = document.getElementById("TYPE").value;
		
		loadingCtl = new OpenLayers.Control.LoadingPanel();

		var options = {
			projection : new OpenLayers.Projection("EPSG:2097"),
			displayProjection : new OpenLayers.Projection("EPSG:2097"),
			units : "m",
			maxExtent : new OpenLayers.Bounds(178907.611, 436569.343, 215956.979, 466854.878),
			scales : [ 135000, 68000, 34000, 17000, 8000, 4000, 2000, 1000, 500 ],
			controls : [ new OpenLayers.Control.Scale(),
					new OpenLayers.Control.Navigation(), loadingCtl ]
		};

		map = new OpenLayers.Map('map', options);

		wmsLayer = new OpenLayers.Layer.WMS("KSIC_WMS", mapServUrl, {
			layers : getSelectedLayer(),
			format : "image/png"
		}, {
			isBaseLayer : true,
			singleTile : true,
			transitionEffect : 'resize'
		});

		markerLayer = new OpenLayers.Layer.Markers("markers");
        
        map.addLayers([wmsLayer,markerLayer]);
		
		
		if(xc == ''){
			if(pnu.length == 8){
				wfs_getEqualTo("ADMIN_DONG_GE", "SMPR_CODE", pnu, rt_zoomToBoundaryArea);
			}else{
				wfs_getEqualTo("UA502", "PNU", pnu, rt_zoomToBoundaryArea);
			}
		}else{
			map.zoomToExtent(new OpenLayers.Geometry.Point(Number(xc),Number(yc)).getBounds());
			addMaker(Number(xc),Number(yc),"/img/mapImg/marker.png","51","51");
		}
	}
	
	//기본 조작 버튼
	function ZoomIn() {
		map.zoomIn();
	}
	function ZoomOut() {
		map.zoomOut();
	}
	function Fit() {
		map.zoomToMaxExtent();
	}

	//레이어 정보 얻기
	function getSelectedLayer() {
		var rStr = [];
		for ( var i = 0; i < document.getElementsByName("layers").length; i++) {
			if (document.getElementsByName("layers")[i].checked)
				rStr.push(document.getElementsByName("layers")[i].id);
		}
		return rStr.join(',');
	}

	//레이어 정보 세팅
	function setLayer(layerName, checked) {
		for ( var i = 0; i < document.getElementsByName("layers").length; i++) {
			if (document.getElementsByName("layers")[i].id == layerName) {
				document.getElementsByName("layers")[i].checked = checked;
				break;
			}
		}
		var newParams = {
			'layers' : getSelectedLayer(),
			'format' : 'image/png'
		};

		wmsLayer.mergeNewParams(newParams);

	}
	
	// marker 추가
	function addMaker(mX, mY,imgUrl,imgW,imgH){
		var mkXy = new OpenLayers.LonLat(mX, mY);
		var url = imgUrl;
		var sz = new OpenLayers.Size(imgW, imgH);
		var calculateOffset = function(size) {
			return new OpenLayers.Pixel(-(size.w/2), -size.h);
		};
		var icon = new OpenLayers.Icon(url, sz, null, calculateOffset);
		
		var marker = new OpenLayers.Marker(mkXy, icon);

		markerLayer.addMarker(marker);
	}
	
	//marker 삭제
	function removeMakers(){ 
		if(markerLayer){
			markerLayer.clearMarkers();	
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
    
    //클릭 컨트롤 선언
	OpenLayers.Control.Click = OpenLayers.Class(OpenLayers.Control, {               
	    defaultHandlerOptions: {
	        'single': true,
	        'double': false,
	        'pixelTolerance': 0,
	        'stopSingle': false,
	        'stopDouble': false
	    },
	    initialize: function(options) {
	        this.handlerOptions = OpenLayers.Util.extend(
	            {}, this.defaultHandlerOptions
	        );
	        OpenLayers.Control.prototype.initialize.apply(
	            this, arguments
	        );
	        this.handler = new OpenLayers.Handler.Click(
	            this, {
	                'click': this.trigger
	            }, this.handlerOptions
	        );
	    },
	    trigger: function(e) {
	    var lonlat = map.getLonLatFromViewPortPx(e.xy);
	    
	    
	  	document.form.X_COORD.value = lonlat.lon;
	  	document.form.Y_COORD.value = lonlat.lat;
	  	removeMakers();
		addMaker(Number(lonlat.lon),Number(lonlat.lat),"/img/mapImg/marker.png","51","51");
		click.deactivate();
	    }
	});
	
	var click = new OpenLayers.Control.Click();
    
    //위치등록
	function clickxy() {
		map.addControl(click);
		click.activate();
		
	}

    //미니맵 상위부모 위치값 지정
	function setOpenerxy() {
		
	  	if(document.form.X_COORD.value==null || document.form.X_COORD.value.length==0 || document.form.Y_COORD.value==null || document.form.Y_COORD.value.length==0){
	  	  	alert("위치 정보가 없습니다.\n위치를 설정해 주세요");
	  	  	return;
	  	}
	  	
	  	document.form.X_COORD.value = parseInt(document.form.X_COORD.value*100000)/100000;
	  	document.form.Y_COORD.value = parseInt(document.form.Y_COORD.value*100000)/100000;
	  	
	 	f = opener.document.form;
	 	
	 	f.X_COORD.value = document.form.X_COORD.value;
	 	f.Y_COORD.value = document.form.Y_COORD.value;
	  
	     if(confirm("위치정보가 등록되었습니다. 창을 닫으시겠습니까?"))
		{
			window.close();
		}
	   
	}
	
</script>
</head>
<body onLoad="init();MM_preloadImages('/img/mapImg/maptool2_on.gif','/img/mapImg/maptool3_on.gif','/img/mapImg/maptool15_on.gif','/img/mapImg/maptool4_on.gif','/img/mapImg/maptool5_on.gif','/img/mapImg/maptool16_on.gif','/img/mapImg/maptool17_on.gif')">
	<form name="form">
		<input type="hidden" id="X_COORD" name="X_COORD" value="${X_COORD}">
		<input type="hidden" id="Y_COORD" name="Y_COORD" value="${Y_COORD}">
		<input type="hidden" id="PNU" name="PNU" value="${PNU}">
		<input type="hidden" id="TYPE" name="TYPE" value="${TYPE}">
		
		<table width="800px" height="600px" border="0" cellpadding="0" cellspacing="0">
			<tr>
				<td width="12px" height="12px"><img src="/img/mapImg/box_top_left.gif" width="12px" height="12px"></td>
				<td width="776px" background="/img/mapImg/box_top_mid.gif"></td>
				<td width="12px"  height="12px"><img src="/img/mapImg/box_top_right.gif" width="12px" height="12px"></td>
			</tr>
			<tr>
				<td width="12px" height="576px" background="/img/mapImg/box_left.gif"></td>
				<td width="776px" align="center" valign="top">
					<table width="776px" height="576px" border="0" cellpadding="0" cellspacing="0">
						<tr>
							<td width="776px" height="48px">
								<table width="776px" height="48px" border="0" cellspacing="0" cellpadding="0">
									<tr>
										<td width="15px" background="/img/mapImg/menu_back.gif">
											<img src="/img/mapImg/menu_left2.gif" width="15px" height="48px">
										</td>
										<td width="722px" background="/img/mapImg/menu_back.gif" align="left">
											<table border="0" cellpadding="0" cellspacing="0">
												<tr>
													<td>
														<img src="/img/mapImg/maptool1_off.gif" alt="전체" name="Image10" width="38px" height="48px" border="0" style="vertical-align: middle;" onclick="javascript:Fit()" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image10','','/img/mapImg/maptool1_on.gif',1)">
													</td>
													<td>
														<img src="/img/mapImg/maptool2_off.gif" alt="확대" name="Image8" width="38px" height="48px" border="0" style="vertical-align: middle;" onclick="javascript:ZoomIn()" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image8','','/img/mapImg/maptool2_on.gif',1)">
													</td>
													<td>
														<img src="/img/mapImg/maptool3_off.gif" alt="축소" name="Image9" width="38px" height="48px" border="0" style="vertical-align: middle;" onclick="javascript:ZoomOut()" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image9','','/img/mapImg/maptool3_on.gif',1)">
													</td>
													<td>
														<img src="/img/mapImg/maptool_line2.gif" width="9px" height="48px">
													</td>
													<c:if test="${TYPE == 'edit'}">
													<td>
														<img src="/img/mapImg/maptool16_off.gif" name="Image13" width="90px" height="48px" border="0" style="vertical-align: middle;" onclick="javascript:clickxy();" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image13','','/img/mapImg/maptool16_on.gif',1)">
													</td>
													<td>
														<img src="/img/mapImg/maptool17_off.gif" name="Image14" width="90px" height="48px" border="0" style="vertical-align: middle;" onclick="javascript:setOpenerxy();" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image14','','/img/mapImg/maptool17_on.gif',1)">
													</td>
													</c:if>
													
												</tr>
											</table>
										</td>
										<td width="22px" align="right" background="/img/mapImg/menu_back.gif">
											<img src="/img/mapImg/close.gif" alt="닫기" width="22px" height="17px" border="0" onclick="self.close();" style="cursor: pointer;" />
										</td>
										<td width="17px" background="/img/mapImg/menu_back.gif">
											<img src="/img/mapImg/menu_right2.gif" width="17px" height="48px">
										</td>
									</tr>
								</table>
							</td>
						</tr>
						<tr>
							<td class="mapborder" valign="top" align="center">
								<div id="map" style="width:776px; height:528px; z-index:3;"></div>
								<div name='layerdiv' id='layerdiv' style="position: absolute; top: 0px; right: 0px; width: 150px; height: 100%; z-index: 98; display: none; overflow-y: scroll; scrollbar-face-color: #FFFFFF; scrollbar-highlight-color: #FFFFFF; scrollbar-3dlight-color: #F2F2F2; scrollbar-shadow-color: #999CC; scrollbar-darkshadow-color: #F2F2F2; scrollbar-track-color: #FFFFFF; scrollbar-arrow-color: #9999CC;">
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
							</td>
						</tr>
					</table>
				</td>
				<td width="12px" background="/img/mapImg/box_right.gif"></td>
			</tr>
			<tr>
				<td width="12px" height="12px"><img src="/img/mapImg/box_bottom_left.gif" width="12px" height="12px" style="vertical-align: top;"></td>
				<td width="776px" background="/img/mapImg/box_bottom_mid.gif"></td>
				<td width="12px" ><img src="/img/mapImg/box_bottom_right.gif" width="12px" height="12px" style="vertical-align: top;"></td>
			</tr>
		</table>
	</form>
</body>
</html>
