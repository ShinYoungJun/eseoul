<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="/jsp/common/loginCheck.jsp"%>
<%@ include file="/jsp/common/include.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />
<title>::::: 서울시 도로점용관리시스템 :::::</title>
<link href="/css/Mroads.css" rel="stylesheet" type="text/css">
<style type="text/css">
<!--
body {
	margin: 0px;
	background-image: url(/img/mapImg/left_background.gif);
}
-->
</style>
<script language="javascript" src="/js/common.js"></script>
<script language="javascript" src="/js/Ajax_request.js"></script>
<script language="javascript" src="/js/jquery-1.6.1.js"></script>
<script type="text/javascript">
<%-- 20130430  작성자:sungh83  점용지 데이터 전송 --%>
var LIMIT = 32;	<%-- 한번에 표시 되는 마커 수 --%>
var queue = new Array();  <%--  데이터를 넣을 큐 선언 --%>

function putMarker( no, name, x, y, icon, w, h) {
	top.map.addMaker(x,y,icon,w,h,name,function(){
		top.map.left.jumyongView(no);
	});
}

function addMarker() {
	var count = LIMIT;
	var markers = queue.markers;
	while(count) {
		if (markers != null && markers.length > 0) {
			var marker = markers.shift();
			putMarker(marker.no, decodeURI(marker.name), marker.xc, marker.yc, "/img/mapImg/marker.png", 51, 51);			 
		}else{
			break;
		}
		--count;
	}
	
	<%--  queue가 water mark 로 올라 가면 데이터 를 체우자.--%>
	if (markers == null || markers.length < LIMIT) {
		nextData();
	}
	if (markers != null && markers.length > 0) {
		markers.timerId = setTimeout(function() {addMarker();}, 10);
	}
};

function nextData() {
	 if(queue.length> 0 ){	  
		 	queue.timerId = setTimeout(function(){getData(queue.shift());},50);
	  }
};

function getData(guCode){
	var $bjcd = $('#BJ_CD'); 
	var $section = $('#SECTION'); 
    var $type = $('#TYPE');
	var $tax_set = $('#TAX_SET');
    var $bonbun = $('#BONBUN');
    var $bubun = $('#BUBUN');
    var $GU_CD = $('#GU_CD');
    var $OWNER_NAME = $('#OWNER_NAME');
     <%-- guCode값을 포함한 필드값들을 json타입으로  MapSearchControl로 전송 --%>
	 $.ajax({
		 url : '/jumyong/map/search4json.do',
		 contentType : 'application/x-www-form-urlencoded; charset=utf-8',
		 cache : false,
		 type : 'post',
		 data :{ 
			     bjcd : $bjcd.val(),
			     section : $section.val(),
			     type : $type.val(),
			     tax_set : $tax_set.val(),
			     bonbun : $bonbun.val(),
			     bubun : $bubun.val(),
			     gucd  : guCode,
			     OWNER_NAME : $OWNER_NAME.val()
			    },
		 dataType : 'json',
		 success : function(data,textStatus,jqXHR){ <%-- MapSearchControl에서 데이터를 받았을 경우에 지도에 데이터 값을 표시--%>
			 switch(data.result) {
			 case 'success': {
				 if (data.list != null && data.list.length > 0) {
					 if (queue.markers == null) {
						 queue.markers = [];
					 }
					 queue.markers = queue.markers.concat(data.list);
					 addMarker();
				 }
				 break;
			 }
			 case 'fail':
			 case 'error':
			 default: {
				 nextData();				 
				 break;
			 }
			 }
		 },
		 error : function(){			  	    
		 } 
	});		   
}
function jumsearch(){
	var $bjcd = $('#BJ_CD');     
	var $section = $('#SECTION');
  var $type = $('#TYPE');
	var $tax_set = $('#TAX_SET');
  var $bonbun = $('#BONBUN');
  var $bubun = $('#BUBUN');
  var $GU_CD = $('#GU_CD');
  var $OWNER_NAME = $('#OWNER_NAME');
   
  <%-- clear timer--%>
  if (queue != null) {
		if (queue.timerId) {
			clearTimeout(queue.timerId);
		}
		if (queue.markers && queue.markers.timerId) {
			clearTimeout(queue.markers.timerId);			
		}
	  queue.markers = null;
		queue = new Array();
  }
	if($bjcd == ''){  <%-- 선택한 법정동 필드값이 값이 없을 경우  --%>
 		alert('데이터량으로 인해 최소 법정동을 선택하셔야 합니다.');
		return;
	}else{    <%--선택한 법정동 필드값이 있을 경우 --%>
		var guCode = $GU_CD.val(); 
		if (guCode == '000') {  <%-- guCode값이 서울시 전체 일경우 --%>
		   	var options = $GU_CD.find('option');  
		   	var size = options.length;   		
		   	for (var i = 2; i < size; i++) {
		   		queue.push($(options[i]).val());  <%--queue 에 options에 데이터값을 밀어넣는다 --%>
		   	}
			guCode = queue.shift(); <%--queue에 먼저들어간 데이터값을 꺼낸다--%>
		    		
		}
		top.map.removeMakers();
		getData(guCode);     
	}
}
/*
function jumsearch()
{
	var bjCd = getSelectedValue(document.getElementById("BJ_CD"));
	if(bjCd == ''){
		alert('데이터량으로 인해 최소 법정동을 선택하셔야 합니다.');
		return;
	}else{
		var form = document.form;
		form.action = "/jumyong/map/search.do";
	    form.submit();
	}

}
*/
function init(){
	top.map.loadingCtl.increaseCounter();
	
	var guCd = getSelectedValue(document.getElementById("GU_CD"));
	var bjCd = getSelectedValue(document.getElementById("BJ_CD"));
	var bonbun = document.getElementById("BONBUN").value;
	var bubun = document.getElementById("BUBUN").value;
	
	top.map.removeMakers();
	
	if(guCd == '000'){
	}else{
		if(bjCd == ''){
			
		}else{
			<c:forEach items="${jumyongList}" var="list" varStatus="idx">
				top.map.addMaker("${list.XC}","${list.YC}","/img/mapImg/marker.png","51","51","${list.NAME}",function(){top.map.left.jumyongView("${list.ADMIN_NO}");});	
			</c:forEach>
		}
	}
	

	
	
	if(guCd == '000'){
	}else{
		if(bjCd == ''){
			
		}else{
			if(bonbun == ''){
				top.map.wfs_getEqualTo("ADMIN_DONG_GE", "SMPR_CODE", "11"+guCd+bjCd.substring(0,3), top.map.rt_zoomToBoundaryArea);
			}else{
				
			}
		}
	}
	
	top.map.loadingCtl.decreaseCounter();

}

function jumyongView(adminNo){
	document.getElementById("result").src = "/jumyong/map/searchview.do?ADMIN_NO="+adminNo;
}

function changeGuCd(obj){
	var guCd = getSelectedValue(obj);
    var	param	= "guCd="+guCd;
    sendRequest("/get_bjdong_code.do", param, "GET", ResultChangeGuCd);
	
	
}

function	ResultChangeGuCd(obj)
{
	select_innerHTML(document.getElementById("BJ_CD"),obj);
}


////////////////////////////////AJAX////////////////////////////////////////////
function getXMLHTTPRequest()
{
    var xRequest = null;
    xRequest = new ActiveXObject("Microsoft.XMLHTTP");

    return xRequest;
}

var req;
var	call;

function sendRequest(url, params, HttpMethod, callback)
{
    req = getXMLHTTPRequest();

    call	= callback;
    if(req){
        req.onreadystatechange = onReadyStateChange;
        req.open(HttpMethod, url, true);
        req.setRequestHeader("Content-Type","application/x-www-form-urlencoded;charset=utf-8");
        req.send(params);
    }
}

function onReadyStateChange()
{
    var ready = req.readyState;
    var data = null;
    if(ready == 4){
        if(this.call	!= null)
        {
            this.call(req.responseText);
        }
    }
}
	
</script>
</head>

<body onload="init();">
	<form id="form" name="form" method="post">
		<table width="260px" height="100%" border="0" cellpadding="0" cellspacing="0">
			<tr>
				<td width="10"></td>
				<td class="Map_stan" background="/img/mapImg/tab_a.gif" width="240" height="37" align="center">
					<font color="#ffffff"><b>${guNm}청&nbsp;${name}</b>님 환영합니다</font>
				</td>
				<td width="10"></td>
			</tr>
			<tr>
				<td width="10" height="250"></td>
				<td valign="top" align="center" valign="top" bgcolor="f9f9f9" class="M_leftborder">
					<table border="0" cellspacing="0" cellpadding="0">
						<tr>
							<td valign="top">
								<table width=220 " border="0" cellspacing="0" cellpadding="0">
									<tr>
										<td height="33">
											<img src="/img/mapImg/left_title1.gif" alt="점용지 검색" width="220" height="33">
										</td>
									</tr>

									<tr>
										<td align="center" valign="top" class="M_leftborder2">
											<table width="198" border="0" cellpadding="0" cellspacing="0" class="Map_stan">
												<tr>
													<td height="22">점용종류</td>
													<td>
														<select id="TYPE" name="TYPE" class="input_form1" style="width: 139px">
															${use_type}
														</select>
													</td>
												</tr>
												<tr>
													<td height="22">점용구분</td>
													<td>
														<select id="SECTION" name="SECTION" class="input_form1" style="width: 139px">
															${occupancy_type}
														</select>
													</td>
												</tr>
												<tr>
													<td height="22">세외구분</td>
													<td>
														<select id="TAX_SET" name="TAX_SET" class="input_form1" style="width: 139px">
															${taxation_section}
														</select>
													</td>
												</tr>
												<tr>
													<td height="22">시/군/구</td>
													<td>
														<select id="GU_CD" name="GU_CD" class="input_form1" style="width: 139px" onchange="changeGuCd(this);">
															${guList}
														</select>
													</td>
												</tr>
												<tr>
													<td height="22">읍/면/동</td>
													<td>
														<select id="BJ_CD" name="BJ_CD" class="input_form1" style="width: 139px">
															${bjList}
														</select>
													</td>
												</tr>
												<tr>
													<td height="22">번지</td>
													<td>
														<input id="BONBUN" name="BONBUN" type="text" value="${bonbun}" class="input_form1" style="width: 48px">
														- <input id="BUBUN" name="BUBUN" type="text" value="${bubun}" class="input_form1" style="width: 48px">
													</td>
												</tr>


											</table>
										</td>
									</tr>
									<tr>
										<td height="9" background="/img/mapImg/left_bott_line.gif"></td>
									</tr>
								</table>
							</td>
						</tr>
						<tr>
							<td valign="top">
								<table width="220" border="0" cellspacing="0" cellpadding="0">
									<tr>
										<td height="32"><img src="/img/mapImg/left_title2.gif" alt="운영자 검색" width="220" height="32">
										</td>
									</tr>
									<tr>
										<td align="center" valign="top" class="M_leftborder2">
											<table width="198" border="0" cellpadding="0" cellspacing="0" class="Map_stan">
												<tr>
													<td width="59" height="22">점용인</td>
													<td>
														<input id="OWNER_NAME" name="OWNER_NAME" value="${ownerName}" type="text" class="input_form1" style="width: 139px">
													</td>
												</tr>
											</table>
										</td>
									</tr>
									<tr>
										<td height="9" background="/img/mapImg/left_bott_line.gif"></td>
									</tr>
								</table>
							</td>
						</tr>
						<tr>
							<td height="40" align="center">
								<img src="/img/mapImg/search_icon.gif" onClick="javascript:jumsearch();" onkeypress="javascript:jumsearch();" alt="검색" width="220" height="20" border="0" style="cursor: pointer;">
							</td>
						</tr>
					</table>
				</td>
				<td width="10"></td>
			</tr>
			<tr valign="bottom">
				<td width="10" height="38">
				</td>
				<td>
					<img src="/img/mapImg/result_title.gif" width="240" height="31">
				</td>
				<td width="10"></td>
			</tr>
			<tr>
				<td width="10"></td>
				<td height="400px" valign="top" align="center">
					<iframe id="result" name="result" src="/jumyong/map/searchview.do" width="235px" height="400px" scrolling="auto" marginwidth="0" marginheight="no" frameborder="no" allowtransparency="True" title="검색결과"></iframe>
				</td>
				<td width="10"></td>
			</tr>
		</table>
	</form>
</body>
</html>
