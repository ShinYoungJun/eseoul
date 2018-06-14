//호출용 값들 지정
var winMap;
var _tblIndex = "";
//var _tblHang = "SIGUNGU";
var _dragging = false;
var _mouseDown = false;
//var _selectIndex = new Array();
//var _selectDraw = new Array();
var _mouseMode = "default";
var _poiData = new Array();
var _poiDiv = new Array();
var imgFlag = null;
var imgs = new Array();
var _x;
var _y;
//var _d = 0; //배열순서 찍는 변수

var ex = new Array();
var ey = new Array();

var _bj;
var _left;
var _top;
var _ADMIN_NO = new Array();
var _GAPAN_NO = new Array();
var _MAINTN_OB = new Array();
var _OWNER_NAME  = new Array();

var _click = null;
var _minx;
var _miny;
var _maxx;
var _maxy;



//이벤트 호출 함수
function winMapEventCall() {  
	winMap.eventListener("afterdraw",winMapAfterDraw);	//이벤트 할당
	winMap.eventListener("userdrawclick",winMapUserClick);
	winMap.eventListener("beforedraw",winMapBeforeDraw);
	winMap.eventListener("mousemove",winMapMouseMove);
	winMap.eventListener("mousedown",winMapMouseDown);
	winMap.eventListener("mouseup",winMapMouseUp);	
	winMap.eventListener("click",winMapClick);	
}

/////////////////////////////////////////////////////////////
// 마우스 이벤트
////////////////////////////////////////////////////////////

//마우스 클릭 이벤트
function winMapClick(eve,wx,wy,left,top) {

//alert("mouse click :"+wx+" : "+wy);
	
if(_click != null){
_bj="";
_x = wx;
_y = wy;

	
	
  	imgFlag.hStyle().left = (winMap.viewPort.WTC_X(_x)-5)+"px";  
	imgFlag.hStyle().top = (winMap.viewPort.WTC_Y(_y)-23)+"px";  
	
	imgFlag.hStyle().display = "block";
	
	setMapxy(wx,wy);
  
  //alert(wx+"=="+wy);
  }
  	
}

//마우스 이동 이벤트
function winMapMouseMove(eve,wx,wy,left,top) {

	/*
	var	cx = (_minx + _maxx) /2.0;
	var	cy = (_miny + _maxy) /2.0;
	
	var minX = cx-10;
	var minY = cy-10;
	var maxX = cx+10;
	var maxY = cy+10;
	
	_minx = 196603.920;
	_miny = 449371.390;
	_maxx = 202367.840;
	_maxy = 452497.210;*/
	
	if(_dragging) {
	for(var i = 0; i < imgs.length; i++){
  	imgs[i].hStyle().display = "none";
	}
	}else if(_mouseDown){
		for(var i = 0; i < imgs.length; i++){
		  	imgs[i].hStyle().display = "none";
			}	
	}else{
	
	/*	
		if((parseFloat(_minx) < parseFloat(wx) && parseFloat(_maxx) > parseFloat(wx)) && (parseFloat(_miny) < parseFloat(wy) && parseFloat(_maxy) > parseFloat(wy))){

		}else{
			winMapFit();	
		}*/
		
		
	}
		
}

//마우스 다운 이벤트
function winMapMouseDown(eve,wx,wy,left,top) {
	/*

		if(__cb.browserType != "ie") {
			if((parseFloat(_minx) < parseFloat(wx) && parseFloat(_maxx) > parseFloat(wx)) && (parseFloat(_miny) < parseFloat(wy) && parseFloat(_maxy) > parseFloat(wy))){
			_mouseeve = event.which;
			if(_mouseeve == 3) _mouseeve=2;
			}else{
				//_mouseeve =3;
			//	winMapFit();
			}
		} else {	_mouseeve = event.button;	}
		
		if((parseFloat(_minx) < parseFloat(wx) && parseFloat(_maxx) > parseFloat(wx)) && (parseFloat(_miny) < parseFloat(wy) && parseFloat(_maxy) > parseFloat(wy))){
		if(_mouseeve == 2) _dragging = true;
		_mouseDown = true;
		}else{
			
			//winMapFit();
		}
		
/*	
	if(_dragging) {
		if (_poiData.length > 0) {
			for(var i=0; i<_poiData.length; i++) {
				_poiDiv[i].hStyle().display = "none";
			}
		}
	}
	*/
 	if(__cb.browserType != "ie") {
		_mouseeve = event.which;
		if(_mouseeve == 3) _mouseeve=2;
	} else {	_mouseeve = event.button;	}
	if(_mouseeve == 2) _dragging = true;
	_mouseDown = true;

}

//마우스 업 이벤트
function winMapMouseUp(eve,wx,wy,left,top) {
	//alert("mouse up : "+wx+" : "+wy);
_dragging = false;
_mouseDown = false;

}

/////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////
//지도 화면 그리기 전 
function winMapBeforeDraw(eve,wx,wy,left,top) {
	/*if((parseFloat(_minx) < parseFloat(wx) && parseFloat(_maxx) > parseFloat(wx)) && (parseFloat(_miny) < parseFloat(wy) && parseFloat(_maxy) > parseFloat(wy))){
		
		}else{	
			winMapPrev();
		}*/

}

//지도 화면 그린 후
function winMapAfterDraw(eve,wx,wy,left,top) {
	
	//winMapUserMode("userSelect"); 마우스 모드를 변경

	
	
	for(var i =0; i < imgs.length; i++) {
		
		if(ex[i] != null && ey[i] != null && _bj == '')
		{
	
			imgs[i].hStyle().left = (winMap.viewPort.WTC_X(ex[i])-7)+"px";
			imgs[i].hStyle().top = (winMap.viewPort.WTC_Y(ey[i])-27)+"px";
	
			imgs[i].hStyle().display = "block";
		
			if(_GAPAN_NO[i] != null && _GAPAN_NO[i] != ""){
	
				imgs[i].hStyle().cursor = "pointer";
			}
		}
		else
		{
//			alert("here output else mun?");
		
			imgs[i].hStyle().display = "none";
		}
	}
	
	
	
	//var len = _selectIndex.length;
	//for (var i = 0;i< len;i++) {
	//	winMap.drawPolygon(_selectDraw[i],1,"#0096ff","#0096ff",0.3);
	//}
	/*
	if (_poiData.length > 0) {
		for(var i=0; i<_poiData.length; i++) {
			//if intersect _poiData[i][4]
			var x = _poiData[i][4].split(",")[0];
			var y = _poiData[i][4].split(",")[1];

			if (ptInBound(x,y,winMap.viewPort.cVB)) {
				_poiDiv[i].hStyle().left = (winMap.viewPort.WTC_X(x)-100)+"px";
				_poiDiv[i].hStyle().top = (winMap.viewPort.WTC_Y(y)-__k.mPx(_poiDiv[i].hStyle().height)-30)+"px";
				_poiDiv[i].hStyle().display = "";
			} else {
				_poiDiv[i].hStyle().display = "none";
			}	 
			
		}
	}
	*/
	
} 
//winMapUserMode("userSelect");


//마우스 클릭이벤트 
function winMapUserClick(eve,pts,wx,wy,left,top) {
	
	//alert("mouseUser click : "+wx+" : "+wy+" - "+left+" : "+top);
	
	if(eve == 2) return;
	if(_mouseMode == "default") {alert("default"); return;}

	if(_tblIndex == "") {
	} else {
		switch(_mouseMode) {
			case "userRect": case "userCircle": case "userLine": case "userPolyline": case "userPolygon": {
				qryIndex(pts);
			} break;
			case "userSelect": {
				//alert(wx);
				var kk = new kGML("MapService","ksic:"+_tblHang,function(g) {
					//alert(g.recLength());
					if(g.recLength() <= 0) return;
					
					var geo = g.geoObjects(0);
					qryIndex(geo);
				}).request(_eGml.gFeature,_eGml.geo,_eGml.Contains,_eGml.Point,"XGEOMETRY",wx +","+ wy,"XGEOMETRY");
				//}).request(_eGml.gFeature,_eGml.geo,_eGml.Intersects,_eGml.Polygon,_eGml.exterior,_eGml.LinearRing,"XGEOMETRY",wx +","+ wy,"XID,XGEOMETRY");
			} break;		
		}			
	}
	/*
	 * 좌표로 데이터 검색

	for(var i=0; i < ex.length; i++){
		var minx = ex[i]-100;
		var maxx = ex[i]+100;
		var miny = ey[i]-100;
		var maxy = ey[i]+100;
		
		if((minx < wx && maxx > wx) && (miny < wy && maxy > wy)){
			url = "/rojum/map/searchview.do?GAPAN_NO=" + _GAPAN_NO[i];	
			break;
		} 
	}
	
	
*/
	
	
}

/////////////////////////////////////////////////////////////
// 지도 제어 관련 명령어
////////////////////////////////////////////////////////////
//마우스 커서 상태 초기화
function winMapDrawInit() {
	winMap.ctrlInit();
	winMap.usrDelImg();
	winMap.reFlush();
}

//확대
function winMapZoomIn() { 
	/*

	//alert('large');
	for (var i = 0;i < imgs.length; i++){
		imgs[i].hStyle().display = "none";
	}
  winMapDrawInit();
  //20100611 lhw
  winMap.ctrlInit();
	winMap.usrDelImg();
	winMap.reFlush();
		*/
	
	//alert(imgs[1].hStyle().left+':::'+imgs[1].hStyle().top);

	winMap.zoomIn(); 
}

//축소
function winMapZoomOut() { 
	//var _minx;
	//var _miny;
	//var _maxx;
	//var _maxy;
	
	//alert('small');
	//alert(winMap._fullCenter);
	/*
	for (var i = 0;i < imgs.length; i++){
		imgs[i].hStyle().display = "none";
	}
  winMapDrawInit();
  
  
  
//20100611 lhw
  winMap.ctrlInit();
	winMap.usrDelImg();
	winMap.reFlush();
	*/
  
	//if(){
	winMap.zoomOut();
	
	//}
}

//마우스 커서 이동 상태로
function winMapMove() {
	
	if(winMap.move()) winMap.move(false); 
	else winMap.move(true);
	}

//이전보기
function winMapPrev() { 
  winMapDrawInit();
	winMap.prev(); 
}

//다음보기
function winMapNext() { 
  winMapDrawInit();
	winMap.next(); 
}

//전체화면
//function winMapFit() { winMap.fit(); }
function winMapFit() { 
 winMapDrawInit();
 
/*_minx = 196603.920;
_miny = 449371.390;
_maxx = 202367.840;
_maxy = 452497.210;*/
 
/*	var cx,cy,hdiv,vdiv,zoomvalue;
	cx = (_minx + _maxx) /2.0;
	cy = (_miny + _maxy) /2.0;
	
	winMap.setLocation(cx,cy,6);
*/
 //alert(_minx);
 //	alert("width : "+parseInt((screen.width-10)/297*100*1.77));

	this.zoomArea(_minx,_miny,_maxx,_maxy);
	
	//winMap.zoomArea(196603.920,449371.390,202367.840,452497.210);
}

function setting(minx,miny,maxx,maxy){
	_minx = minx;
	_miny = miny;
	_maxx = maxx;
	_maxy = maxy;
}
/*
function winMapArea(minx, miny, maxx, maxy) {
	
	var cx,cy,hdiv,vdiv,zoomvalue;
	cx = (minx + maxx) /2.0;
	cy = (miny + maxy) /2.0;
	//hdiv = (maxx - minx) / _width;
	//vdiv = (maxy - miny) / _height;
	hdiv = (maxx - minx);
	vdiv = (maxy - miny);
	if(hdiv == 0 || vdiv == 0) return false;
	if(hdiv > vdiv) zoomvalue = hdiv;
		else zoomvalue = vdiv;
		
	winMap.setLocation(cx,cy,zoomvalue);
}*/

//마우스 커서 거리재기 상태로
function winMapDistance() { 
winMapDrawInit();
	if(winMap.distance()) winMap.distance(false); else winMap.distance(true);
}

//마우스 커서 면적구하기 상태로
function winMapArea() { 
winMapDrawInit();

	if(winMap.area()) winMap.area(false); else winMap.area(true);
}

//마우스 커서 사용자 선택 상태로 === 인자1 : 지정된 문자열 "userSelect" "userCircle" "userRect" "userLine" "userPolyline" "userPolygon"
function winMapUserMode(st) {

	
	if(st != null) {

		_mouseMode = st;
		winMap.userDraw(st);
	} else {
		_mouseMode = "default";
		winMap.userDraw(st);
	}
}



/*//레이어 온오프  === 인자1 : 레이어명 ****특정 구현에서 활용됨 활용 필요시 문의(최진석)
function winMapLayerView(n) {
	
	if(winMap.layerOnOff(n) == "1") { 
		winMap.layerOnOff(n,false);
	} else {
		winMap.layerOnOff(n,true);
	}
	
	
}*/

//지도 영역지정으로 이동 === 인자 : minX,minY,maxX,maxY
function zoomArea(minX,minY,maxX,maxY) {

	var bound = new KWorldBound(minX,minY,maxX,maxY);

	winMap.zoomArea(bound);
	
	
}


/*function spop_view(){

	//winMapClick("2",)
		//_d = _d+1;
	//imgs[i].hStyle().left 
	//imgs[i].hStyle().top
	
		
		var url = "/rojum/map/searchview.do?GAPAN_NO=" + _GAPAN_NO[0];
		cw=screen.availWidth; // 화면 너비
		ch=screen.availHeight; // 화면 높이
		
		sw=780;// 띄울 창의 너비
		sh=257;// 띄울 창의 높이
		
		ml=(cw-sw)/2;// 가운데 띄우기위한 창의 x위치
		mt=(ch-sh)/2;// 가운데 띄우기위한 창의 y위치

  		var param = 'width='+sw+',height='+sh+',top='+mt+',left='+ml+',resizable=no, status=no, scrollbars=no, toolbar=no, menubar=no';
		
		window.open(url, 'info', param);

}*/

function Test(str)
{
	alert(str);
}

function moveLocation(x,y,scale,ADMIN_NO,GAPAN_NO,bj,count,maintn_ob)
{
	winMap.setLocation(x[count],y[count],scale);
}

//지도 중심좌표기반 이동 === 인자 중심좌표 그리고 축척의 세개 인자
function setLocation(x,y,scale,ADMIN_NO,GAPAN_NO,bj,count,maintn_ob,owner_name)
{

	if(count != "" && count != null && count != undefined){
		
		
		winMap.setLocation(x[count],y[count],scale);
		
		var url = "/rojum/map/searchview.do?GAPAN_NO=" + _GAPAN_NO[parseInt(count)];
		cw=screen.availWidth; // 화면 너비
		ch=screen.availHeight; // 화면 높이
		
		sw=780;// 띄울 창의 너비
		sh=257;// 띄울 창의 높이
		
		ml=(cw-sw)/2;// 가운데 띄우기위한 창의 x위치
		mt=(ch-sh)/2;// 가운데 띄우기위한 창의 y위치
		
	//	imgs[count].getElem().src = ""; //투명이미지

  		var param = 'width='+sw+',height='+sh+',top='+mt+',left='+ml+',resizable=no, status=no, scrollbars=no, toolbar=no, menubar=no';
		
		window.open(url, 'info', param);

	}else{
			
		if(imgs.length > 0){
			
			//winMap.ctrlInit();
			winMap.usrDelImg();
			winMap.reFlush();

			for (var i = 0;i < imgs.length; i++){
				//전의 img[]배열이 비워지지 않는 듯 해서 우선 아래코딩으로 조치함.				
				imgs[i].hStyle().display = "none";
				imgs[i].getElem().src = "/img/mapImg/water.gif"; //투명이미지
				imgs[i].getElem().name = "";
				imgs[i].getElem().onclick = function() { }	
			}
		}
		
	for(var i =0; i < x.length; i++) {
	
	winMap.setLocation(x[i],y[i],scale);

		_x = x[i];
		_y = y[i]+30;

		ex = x;
		ey = y;
		
		//_ADMIN_NO = ADMIN_NO[i];
		_GAPAN_NO = GAPAN_NO;
		_bj = bj;
		_MAINTN_OB = maintn_ob;
		_OWNER_NAME = owner_name;
		
		imgs[i] =new k_IMG().init("winMap", 0, 0, 10,10);
		imgs[i].hStyle().display = "none";
		if(_MAINTN_OB[i]==1){
			imgs[i].getElem().src = "/img/mapImg/blueRec.gif";
		}else{
			imgs[i].getElem().src = "/img/mapImg/redRec.gif";
		}
		imgs[i].getElem().name = i;

		imgs[i].getElem().onmouseover = function(){
			var TipMain = document.getElementById('TipMain');


			TipMain.innerHTML = _OWNER_NAME[parseInt(this.name)];
			TipMain.style.visibility = 'visible';
			TipMain.style.posLeft = event.x;
			TipMain.style.posTop = event.y-20;
			
		}
		
		imgs[i].getElem().onmouseout = function(){
			var TipMain = document.getElementById('TipMain');
			TipMain.innerHTML = '';
			TipMain.style.visibility = 'hidden';
		}
		
		imgs[i].getElem().onclick = function() {
			//alert(this.name+" : "+_GAPAN_NO[parseInt(this.name)]);	
			//var url = "/rojum/map/searchview.do?GAPAN_NO=" + _GAPAN_NO[parseInt(this.name)];
			cw=screen.availWidth; // 화면 너비
			ch=screen.availHeight; // 화면 높이
			
			sw=780;// 띄울 창의 너비
			sh=257;// 띄울 창의 높이
			
			ml=(cw-sw)/2;// 가운데 띄우기위한 창의 x위치
			mt=(ch-sh)/2;// 가운데 띄우기위한 창의 y위치

	  		//var param = 'width='+sw+',height='+sh+',top='+mt+',left='+ml+',resizable=no, status=no, scrollbars=no, toolbar=no, menubar=no';

			//window.open(url, 'info', param);
			
	 		//document.left.check.result.src = url;
			//document.leftMenu.left.check.result.location.href="/rojum/map/searchview.do?GAPAN_NO=" + _GAPAN_NO[parseInt(this.name)];	
			//document.getElementById("merong").value = "goHome";
			
			document.left.document.getElementById('result').src = "/rojum/map/searchview.do?GAPAN_NO=" + _GAPAN_NO[parseInt(this.name)];
			
			
			
			
		}
		
		
		
		//imgs[i].hStyle().left = (winMap.viewPort.WTC_X(_x)-7)+"px";
		//imgs[i].hStyle().top = (winMap.viewPort.WTC_Y(_y)-27)+"px";
		}
	}
	
	//alert("scale : "+scale);
	this.zoomArea(_minx,_miny,_maxx,_maxy);
}

// 풍선말 온
function TipOn(obj,txt){
	var TipMain = document.getElementById('TipMain');

	TipMain.innerHTML = txt;
	TipMain.style.visibility = 'visible';
	TipMain.style.posLeft = event.x;
	TipMain.style.posTop = event.y-20;

}

//풍선말 off
function TipDown(){
	var TipMain = document.getElementById('TipMain');
	TipMain.innerHTML = '';
	TipMain.style.visibility = 'hidden';
}



// 지도 이미지 저장 
function downImgFile()
{
  winMap.downImgFile("MapImage");
}
// 지도 프린트
function winMapPrint() {
	/*
		//var printSizeValue = document.all.selPrintSizeObj.value;
		var printSizeValue = "A4";
		if(printSizeValue == "A4") {
			var width = (screen.width - 10);
			var height = (screen.height - 90);
			var win = window.open('', 'print_map', 'status=no, width=720, height=700, left=0, top=0, scrollbars=yes');				// 실제 A4용지 가로(297mm) 세로(210mm) 길이
			self.focus();
			
			var tag = "";
			var imgWidth = parseInt(width/297*100*1.77);
			var imgHeight = parseInt(height/210*100*1.36);
			
			//alert("A4출력  imgWidth:"+imgWidth+"   imgHieght:"+imgHeight);
			
			tag += "<html><head><title> 지도 출력 </title></head><body>";
			tag += "<center><table border='1' style='border-color:#000000' width='100%' height='100%' cellpadding='0' cellspacing='0'><tr><td>";
			tag += "<table>";
			tag += "<tr><td width='2%'></td>";
			//tag += "<td><img src='" + winMap.pageMap("", 660, 950) +"' border='1' style='border-color:#000000'></td><td width='2%'></td>";
			//tag += "<td><img src='" + winMap.pageMap("", 1250, 750) +"' border='1' style='border-color:#000000'></td><td width='2%'></td>";
			tag += "<td>"+document.getElementById('map').document.getElementById('map').innerHTML+"</td>";
			tag += "</table></td></tr></table></center>";
			tag += "</body></html>";
			
			win.document.write(tag);
			win.document.close();
			win.print();
			win.close();
		}
		else if(printSizeValue == "A3") {
			var width = (screen.width - 10);
			var height = (screen.height - 90);
			var win = window.open('', 'print_map', 'status=no, width=' + (297*3.4) + ', height=' + (210*3.2) + ', left=0, top=0');
			self.focus();
			
			var tag = "";
			var imgWidth = parseInt(width/297*100*1.77);
			var imgHeight = parseInt(height/210*100*1.36);
			
			tag += "<html><head><title> 지도 출력 </title></head><body>";
			tag += "<center><table border='1' style='border-color:#000000' width='100%' height='100%' cellpadding='0' cellspacing='0'><tr><td>";
			tag += "<table>";
			tag += "<tr><td></td>";
			tag += "<td><img src='" + winMap.pageMap("", imgWidth, imgHeight) +"' border='1' style='border-color:#000000'></td><td width='2%'></td>";
			tag += "<td width='20%'><img src='./images/legend.jpg' border='1' style='border-color:#000000'></td><td width='2%'></td>";
			tag += "</table></td></tr></table></center>";
			tag += "</body></html>";
			
			win.document.write(tag);
			win.document.close();
			//win.print();
			//win.close();
		}
		*/
		var windowLeft = (screen.width-640)/2;
		var windowTop = (screen.height-480)/2;
		var printURL = "/jsp/rojum/map/printContentBody.html";
		window.open(printURL,"print",'width=680, height=550, menubar=no,   scrollbars=yes,status=no,resizable=yes,top=' + windowTop + ',left=' + windowLeft + '');



	
		

	}
	

	
//////////////////////////////////////////
//지도 페이지 생성
/////////////////////////////////////////

/** 지도페이지 사이즈 **/
  var winW = screen.availWidth;	
  var winH = screen.availHeight;
  /** 지도페이지 옵션 **/
  var mapWinOpt = "toolbar=no,location=no,directories=no,status=yes,menubar=no,scrollbars=no,resizable=yes,left=0px,top=0px,width="+winW+"px,height="+winH+"px";
  //var mapWinOpt = "";
  var mapWin = null;          
  
function openMapPage()
{
	var url = "/jsp/map/map.jsp";
    	mapWin = window.open(url,"mapWin",mapWinOpt);
    	mapWin.focus();  
}
	
/////////////////////////////////////////////////////////////
//지도 생성 함수
////////////////////////////////////////////////////////////
function createWinMap(pid,left,top,width,height) {

	winMap = new KMap("winMap",pid,"5.0"); // 인자1 : 태그 아이디(유일해야함), 인자2 : 부모태그의 ID 
 	winMap.setRevisionLeftTop(1,1);      // 마우스 제어시 지도화면상의 확대축소 박스가 엉뚱한 위치로 그려질때 보정해주는 함수
	winMap.setLoadingImage(__apiurl + "imgs/loading1.gif",140,20); // 지도 그리는 중 중간에 뜨는 대기 메세지 원하는 이미지로 바꾸어 줄수 있음. 뒤 인자2,3 은 이미지의 크기
	winMap.downloadFormat(3); //이미지포멪 정의 1 기본(PNG), 2 GIF, 3 JPG
	winMap.init(left,top,width,height,10.0); // 실제 지도 화면 초기화하는 함수 시작위치와 크리 지정 마지막 인자5는 시작 축척을 정의
	imgFlag =new k_IMG().init("winMap", 0, 0, 28,29);
 	 //setMapInfo 호출후에 가동되는 함수 (사용자의 초기화 담담부분)
	 	winMap.loadMapInfo = function(mInfo) {
	 	winMap.naChimPos('right');
	 	winMap.backColor("#BBBBBB",false);
	 	winMap.viewScaleBar(true);
	 	winMapEventCall();
		//winMapUserMode("userRect"); //userSelect userCircle userRect userLine userPolyline userPolygon
		//winMap.fit();
		winMapFit();
	}
	
	winMap.setMapInfo("MapServiceV5","DrawMapAjax"); // 지도서버 정보를 셋팅해주는 함수 
	
	
	// ngisFIle 일때
	//winMap.setMapInfo(_chum+"/ImageServlet","");		
		
}



// 매쉬업 구현 함수 
function mashup(xmlurl) {
	
	postXmlRes(xmlurl, "", function(r){
		var xmlDoc = new k_XmlParser().init(r);
		var item = xmlDoc.gTag("Item");
	
		for(var i = 0 ; i<item.length; i++) {
			_poiData[i] = new Array();
			_poiData[i][0] = xmlDoc.gTag("Title",i);
			_poiData[i][1] = xmlDoc.gTag("Addr",i);
			_poiData[i][2] = "";	//연락처
			_poiData[i][3] = xmlDoc.gTag("URL",i);
			_poiData[i][4] = xmlDoc.gTag("Point",i);
			
			alert();
	
			_poiDiv[i] = new k_BYEOK().init("winMap",10,10,205,100,"","display=none");
			_poiDiv[i].getElem().innerHTML = "<table width='205' border='0' cellspacing='0' cellpadding='0'>"
				+"<tr><td width='12'><img src='./image/line_1_01.gif' width='12' height='12' /></td>"
				+"<td width='61' background='./image/line_1_02.gif'></td>"
				+"<td width='120' background='./image/line_1_02.gif'></td>"
				+"<td width='12'><img src='./image/line_1_03.gif' width='12' height='12' /></td></tr>"
				+"<tr bgcolor='#ffffff'><td background='./image/line_1_09.gif'></td>"
				+"<td colspan='2'><table width='179' border='0' cellspacing='0' cellpadding='0'  bgcolor='#ffffff'>"
				+"<tr><td width='59' height='16'><img src='./image/tit_01.gif' width='59' height='13' /></td>"
				+"<td width='120' id='poi0'>"+_poiData[i][0]+"</td></tr>"
				+"<tr><td height='16'><img src='./image/tit_02.gif' width='59' height='12' /></td>"
				+"<td id='poi1'>"+_poiData[i][1]+"</td></tr>"
				+"<tr><td height='16'><img src='./image/tit_03.gif' width='59' height='12' /></td>"
				+"<td id='poi2'>"+_poiData[i][2]+"</td></tr>"
				+"<tr><td height='16'><img src='./image/tit_04.gif' width='59' height='11' /></td>"
				+"<td id='poi3'><a href='#none' onclick='window.location=\""+_poiData[i][3]+"\";'><nobr>"+_poiData[i][3]+"</nobr></a></td></tr>"
				+"</table>"
				+"</td><td background='./image/line_1_04.gif'></td></tr>"
				+"<tr background='./image/line_1_07.gif'><td><img src='./image/line_1_08.gif' width='12' height='26' /></td>"
				+"<td background='./image/line_1_07.gif'></td>"
				+"<td background='./image/line_1_07.gif'><img src='./image/line_1_06.gif' width='120' height='26' /></td>"
				+"<td background='./image/line_1_07.gif'><img src='./image/line_1_05.gif' width='12' height='26' /></td>"
				+"</tr></table>";
			
		}
		winMap.reFlush();
		
	});
}

//레이어 온오프  === 인자1 : 레이어명 ****특정 구현에서 활용됨 활용 필요시 문의(최진석)
function winMapLayerView(n) {
	
	if(winMap.layerOnOff(n) == "1") { 
		winMap.layerOnOff(n,false);
	} else {
		winMap.layerOnOff(n,true);
	}
	
}

//  레이어 온오프
function winMapLayerView(n) {
	//if(gKlis == "true" && p != null) {
		//klisConn.layerOnOff(p);
		
	//} else {
	
		if(winMap.layerOnOff(n) == '1') { 
			winMap.layerOnOff(n,false);
			alert("winMap.layerOnOff("+n+") / false= " + winMap.layerOnOff(n));
			
		} else if(winMap.layerOnOff(n) == '0') {
			winMap.layerOnOff(n,true);
			alert("winMap.layerOnOff("+n+") / false= " + winMap.layerOnOff(n));
		}

	winMap.reFlush();
	//}
}


function winMapLayersView(idx,n) {

	if(winMap.setGroupLayerOnOff(n) == "1") 
		winMap.setGroupLayerOnOff(idx, "0");
	else
		winMap.setGroupLayerOnOff(idx, "1");
	
	// idx : 0 ~ 5까지 // n(레이어 보임) : 0,1
	//winMap.setGroupLayerOnOff("4", "1");

	//winMap.layerOnOff("송파구",true);

	//winMap.setViewLayer();
	//winMap.setOffLayer();
	//winMap.setOnLayer();
	//alert("last - " + idx+" : "+n);
	
	winMap.reFlush();
}


//창크기 변경시 지도 크기 변경
      	
function setWidthHeight(n) {

	var winCW = document.body.clientWidth;
	var winCH = document.body.clientHeight;
	
	winMap.setWidthHeight(winCW,winCH)
	winMap.reFlush();
}
    window.onresize = setWidthHeight; //지도 창 크기 변경시 setWidthHeight 호출
    


/////////////////////////////////////////////////////////////
//이하  WFS관련 명령어 예시 
////////////////////////////////////////////////////////////
/*//인텍스 쿼리
 
 //파이어폭스 보안 설정으로 클립보드로 복사할 수 없습니다.
//주소 창에 about:config 라고 입력해 설정 페이지로 이동한 후
//Signed.applets.codebase_principal_support 항목을 true로 변경하시면, 
//클립보드를 정상적으로 이용하실 수 있습니다.


function qryIndex(pts) {
	var kk = new kGML("MapService","ksic:"+_tblIndex,function(g){
		if(g.recLength() <= 0) return;
		 
		for(var i = 0;i<g.recLength();i++) {
			var geo = g.geoObjects(i);
			var str = g.fields(i,"IDX");
			if(str == null) continue;
			addIndex(str,geo);
		}
		winMap.reFlush();
	}).request(_eGml.gFeature,_eGml.geo,_eGml.Intersects,_eGml.Polygon,_eGml.exterior,_eGml.LinearRing,"XGEOMETRY",pts.geoString(),"IDX,XGEOMETRY");
}

//도엽추가
function addIndex(str,geo) {
 	var len = _selectIndex.length;
 	if(geo == null) {
		var kk = new kGML("MapService","ksic:"+_tblHang,function(g) {
			//alert(g.recLength());
			if(g.recLength() <= 0) return;
			geo = g.geoObjects(0);
			qryIndex(geo);
		}).request(_eGml.gFeature,_eGml.attr,_eGml.isEqualTo,_eGml.Literal,"IDX",str,"XGEOMETRY");
 	}
 	for (var i = 0;i< len;i++) {
			if(_selectIndex[i] == str) {
				delIndex(i);
				return;
			}
	}
	//str 값을 플랙스로 보내는 부분 구현

	_selectIndex[len] = str;
	_selectDraw[len] = geo;
}

//도엽 삭제
function delIndex(idx) {
	var len = _selectIndex.length;
	if(isNaN(idx)) {
		for (var i = 0;i< len;i++) {
			if(_selectIndex[i] == str) {
				idx = i;
				break;
			}
		}
	}
	if(idx < 0 || idx >= len) return;
	for(var i = idx ;i<len-1;i++) {
		_selectIndex[i] = _selectIndex[i+1];
		_selectDraw[i] = _selectDraw[i+1];
	}
	_selectIndex.length--; 
	_selectDraw.length--;
}
*/

    