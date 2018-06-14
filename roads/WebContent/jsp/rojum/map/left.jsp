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
<script language="javascript" src="/js/jquery-1.6.1.js"></script>
<script language="javascript" src="/js/Ajax_request.js"></script>
<script type="text/javascript">
<%-- 노점관리 데이터 전송 --%>
var queue = new Array();
var LIMIT =32;

var mainCount = 0; 
var jungbiCount = 0;	
var taxyn =0;

function putMarker(no, name, x, y, icon, w, h){
	top.map.addMaker(x,y,icon,w,h,name,function(){
		top.map.left.rojumView(no);
	});		
}

function addMarker(){
	var count = LIMIT;
	var markers = queue.markers;		
		
	while(count){
		if(markers != null && markers.length >0){			
			var marker = markers.shift();
			if(marker.maintnob == "1"){   <%-- 관리대상 지도에 표시 --%>
				putMarker(marker.no, decodeURI(marker.name), marker.xc, marker.yc, "/img/mapImg/blueRec.gif", 7, 7);
				mainCount++;  <%-- 관리대상 갯수 --%>
			} else {  <%-- 정비대상 지도에 표시 --%>
				putMarker(marker.no, decodeURI(marker.name), marker.xc, marker.yc, "/img/mapImg/redRec.gif", 7, 7);	
				jungbiCount++;  <%-- 정비대상 갯수 --%>
			}
			if(marker.taxyn=="1"){
				taxyn++;  <%-- 점용료 부과 갯수 --%>	
			}
		}else{
			break;	
		}
		 --count;
	 }
		  	
	top.menu.mainCount.value = mainCount;  <%-- 관리대상 표시 --%>
	top.menu.jungbiCount.value =jungbiCount; <%-- 정비대상 표시 --%>
	top.menu.taxCount.value = taxyn;  <%--점용료 부과 표시--%>
	
	 if(markers == null || markers.length < LIMIT){
	 	nextData();	 
	 }
	 
	 if(markers != null && markers.length > 0) {
		markers.timerId = setTimeout(function() {addMarker();}, 10);
	 }	
};

function nextData() {
	 if(queue.length> 0 ){	  
		 	setTimeout(function(){ 
				getData(queue.shift());
		 	},50);
	  }
};

function getData(guCode){
	var $mgtyp = $('#MG_TYP');
	var $bjcd = $('#BJ_CD');
	var	$gugancd = $('#GUGAN_CD');
	var $bonbun = $('#BONBUN');
	var $bubun = $('#BUBUN');
	var $ownername = $('#OWNER_NAME');
	var $servey_year = $('#SURVEY_YEAR');
	var $maintnob = $('#MAINTN_OB');
	  <%-- guCode값을 포함한 필드값들을 json타입으로  MapSearchControl로 전송 --%>
	$.ajax({
		url : '/rojum/map/search4json.do',
		contentType : 'application/x-www-form-urlencoded; charset=utf-8',
		cache : false,
		type : 'post',
		dataType : 'json',
		data :{ 
			MG_TYP : $mgtyp.val(),
			BJ_CD : $bjcd.val(),
			GUGAN_CD : $gugancd.val(),
			BONBUN : $bonbun.val(),
			BUBUN : $bubun.val(),
			OWNER_NAME : $ownername.val(),
			SURVEY_YEAR : $servey_year.val(),
			MAINTN_OB: $maintnob.val(),
 			GU_CD  : guCode
		},
		success: function(data,textStatus,jqXHR){  <%-- MapSearchControl에서 데이터를 받았을 경우에 지도에 데이터 값을 표시--%>
			switch(data.result){
			case 'success':{   
				 if (data.list != null && data.list.length > 0) {
					 if (queue.markers == null) {
						 queue.markers = [];
					 }
					 queue.markers = queue.markers.concat(data.list);
					 addMarker();
				 }
			 break;				  			
			}
			case 'fail' :{	
				break;
			}
			case 'error' :{
				break;
			}
			default:
				break;
			}
			if(queue.length>0){  
				setTimeout(function(){
				getData(queue.shift());},500);
			}
		},		  	
		error : function( jqXHR, textStatus, errorThrown){  
			alert("에러");				 
		}		  	
	});	
}

function jumsearch()
{  
	var $mgtyp = $('#MG_TYP');
	var $bjcd = $('#BJ_CD');
	var	$gugancd = $('#GUGAN_CD');
	var $bonbun = $('#BONBUN');
	var $bubun = $('#BUBUN');
	var $ownername = $('#OWNER_NAME');
	var $servey_year = $('#SURVEY_YEAR');
	var $maintnob = $('#MAINTN_OB');
    var $gucd = $('#GU_CD');
    
	if($bjcd ==''){	 <%-- 선택한 법정도 필드값이 값이 없을 경우  --%>
		alert('데이터량으로 인해 최소 법정동을 선택하셔야 합니다.');
		return;
	}else{		<%--선택한 법정동 필드값이 있을경우 --%>
		var guCode = $gucd.val();
			if(guCode == '000'){	<%-- guCode값이 서울시일경우 --%>
				var options = $gucd.find('option');
				var size = options.length;
					for(var i=2;i<size;i++){
						queue.push($(options[i]).val()); <%--queue 에 options에 데이터값을 밀어넣는다 --%>	
					}
				guCode = queue.shift();	<%--queue에 먼저들어간 데이터값을 꺼낸다--%>
			}
		top.map.removeMakers();
		mainCount =0;
		jungbiCount =0;
		taxyn=0;
		top.menu.mainCount.value = mainCount;
		top.menu.jungbiCount.value =jungbiCount;
		top.menu.taxCount.value = taxyn;
		getData(guCode);
	}
	
/*	
	var form = document.form;
	form.action = "/rojum/map/search.do";
    form.submit();
*/
}

function init(){
	setYear(document.getElementById("SURVEY_YEAR"),"${surveyYear}");
	
	top.map.loadingCtl.increaseCounter();
	
	var guCd = getSelectedValue(document.getElementById("GU_CD"));
	var bjCd = getSelectedValue(document.getElementById("BJ_CD"));
	var bonbun = document.getElementById("BONBUN").value;
	var bubun = document.getElementById("BUBUN").value;
	
	if(guCd == '000'){
	}else{
		if(bjCd == ''){
			top.map.wfs_getEqualTo("ADMIN_GU_GE", "SKPR_CODE", "11"+guCd, top.map.rt_zoomToBoundaryArea);
		}else{
			if(bonbun == ''){
				top.map.wfs_getEqualTo("ADMIN_DONG_GE", "SMPR_CODE", "11"+guCd+bjCd.substring(0,3), top.map.rt_zoomToBoundaryArea);
			}else{
				
			}
		}
	}
	
	top.menu.jungbiCount.value = "${jungbiCount}";
	top.menu.mainCount.value = "${mainCount}";
	top.menu.taxCount.value = "${taxCount}";
	
	top.map.removeMakers();
	
	<c:forEach items="${rojumList}" var="list" varStatus="idx">
	//********** BEGIN_KANG_20120423
	/*
	if("${list.MAINTN_OB}" == "1"){
	top.map.addMaker("${list.XC}","${list.YC}","/img/mapImg/blueRec.gif","15","15","${list.OWNER_NAME}",function(){top.map.left.rojumView("${list.GAPAN_NO}");});
	}else{
		top.map.addMaker("${list.XC}","${list.YC}","/img/mapImg/redRec.gif","15","15","${list.OWNER_NAME}",function(){top.map.left.rojumView("${list.GAPAN_NO}");});	
	}
	*/
	if("${list.MAINTN_OB}" == "1"){
		top.map.addMaker("${list.XC}","${list.YC}","/img/mapImg/blueRec.gif","7","7","${list.OWNER_NAME}",function(){top.map.left.rojumView("${list.GAPAN_NO}");});
	}else{
		top.map.addMaker("${list.XC}","${list.YC}","/img/mapImg/redRec.gif","7","7","${list.OWNER_NAME}",function(){top.map.left.rojumView("${list.GAPAN_NO}");});	
	}
	//********** END_KANG_20120423
	

	</c:forEach>
	
	top.map.loadingCtl.decreaseCounter();

}

function rojumView(gapanNo){
	document.getElementById("result").src = "/rojum/map/searchview.do?GAPAN_NO="+gapanNo;
}

function changeMgTyp(obj){
	if(getSelectedValue(obj) != ""){
		document.getElementById("SURVEY_YEAR_TR").style.display ="none";
	}else{
		document.getElementById("SURVEY_YEAR_TR").style.display ="block";
	}
}

function changeGuCd(obj){
	var guCd = getSelectedValue(obj);
	var	param = "guCd="+guCd;
	var target = document.getElementById("BJ_CD");
	sendRequest(target, "/get_bjdong_code.do", param, "GET", ResultChangeGuCd);	
}

<%-- 서울시 구간_CD 가져오기   --%> 
function changeSeoulGuCd(obj){
	var guCd = getSelectedValue(obj);
    var	param	= "guCd="+guCd;
	var target = document.getElementById("GUGAN_CD");
    sendRequest(target, "/get_seoul_gugan.do", param, "GET", ResultChangeGuCdGubun);
}    

function ResultChangeGuCd(obj)
{
	select_innerHTML(document.getElementById("BJ_CD"),obj);
}

function ResultChangeGuCdGubun(obj)
{
	select_innerHTML(document.getElementById("GUGAN_CD"),obj);
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

function sendRequest(target, url, params, HttpMethod, callback)
{
	var req = getXMLHTTPRequest();
    target.req = req;

    target.call	= callback;
    if(req){
        req.onreadystatechange = function() {
        	onReadyStateChange(target);
        };
        req.open(HttpMethod, url, true);
        req.setRequestHeader("Content-Type","application/x-www-form-urlencoded;charset=utf-8");
        req.send(params);
    }
}

function onReadyStateChange(target)
{
	var req = target.req;
    var ready = req.readyState;
    var data = null;
    if(ready == 4) {
        if(target.call	!= null) {
            target.call(req.responseText);
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
											<img src="/img/mapImg/left_title1.gif" alt="거리가게 검색" width="220" height="33">
										</td>
									</tr>

									<tr>
										<td align="center" valign="top" class="M_leftborder2">
											<table width="198" border="0" cellpadding="0" cellspacing="0" class="Map_stan">
												<tr>
													<td height="22">등록구분</td>
													<td>
														<select id="MG_TYP" name="MG_TYP" class="input_form1" style="width: 139px" onchange="changeMgTyp(this);">
															${mgTyp}
														</select>
													</td>
												</tr>
												<tr id="SURVEY_YEAR_TR" style="display: block;">
													<td height="22">조사년도</td>
													<td>
                                                    <select  id="SURVEY_YEAR" name="SURVEY_YEAR" class="input_form1" style="width:139px">
                                        			</select>
													</td>
												</tr>
												<tr>
													<td height="22">시/군/구</td>
													<td>
															<select id="GU_CD" name="GU_CD" class="input_form1" style="width: 139px" onchange="changeSeoulGuCd(this);changeGuCd(this);">
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
												<!--  //********** BEGIN_현진_20120313 -->
												<tr>
													<td height="22">구간</td>
													<td>
														<select id="GUGAN_CD" name="GUGAN_CD" class="input_form1" style="width: 139px">
															${GUGAN_CD_LIST}
														</select>
													</td>
												</tr>
												<!--   //********** END_현진_20120313 -->
												<tr>
													<td height="22">관리여부</td>
													<td>
														<select id="MAINTN_OB" name="MAINTN_OB" class="input_form1" style="width: 139px">
															<option value="">::선택::</option>
															<option value="1" <c:if test="${maintnOb=='1'}">selected</c:if>>관리대상</option>
															<option value="0" <c:if test="${maintnOb=='0'}">selected</c:if>>정비대상</option>
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
					<iframe id="result" name="result" src="/rojum/map/searchview.do" width="235px" height="400px" scrolling="auto" marginwidth="0" marginheight="no" frameborder="no" allowtransparency="True" title="검색결과"></iframe>
				</td>
				<td width="10"></td>
			</tr>
		</table>
	</form>
</body>
</html>
