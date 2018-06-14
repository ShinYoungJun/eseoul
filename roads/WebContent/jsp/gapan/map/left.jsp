<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="/jsp/common/loginCheck.jsp"%>
<%@ include file="/jsp/common/include.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />
<title>::::: ����� ������������ý��� :::::</title>
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
<%-- �����󿵾��ü� ������ ���� --%>
var LIMIT = 32;	<%-- �ѹ��� ǥ�� �Ǵ� ��Ŀ �� --%>
var queue = new Array();    <%-- �����͸� ���� ť ���� --%>  

var sales = 0; <%--�����ǸŴ� �� --%> 
var fixes = 0; <%-- ���μ����� ��--%>

function putMarker( no, name, x, y, icon, w, h) {
	top.map.addMaker(x,y,icon,w,h,name,function(){
		top.map.left.gapanView(no);
	});
}

function addMarker() {
	var count = LIMIT;
	var markers = queue.markers;
	while(count) {
		if (markers != null && markers.length > 0) {
			var marker = markers.shift();
			if(marker.ftTyp == "011"){  <%-- �����ǸŴ� ������ ǥ�� --%>
				putMarker(marker.no, decodeURI(marker.name), marker.xc, marker.yc, '/img/mapImg/blueQuad.gif', 7, 7);
		    	sales++;      <%-- ���� �ǸŴ� ���� --%>    
			} else if(marker.ftTyp == "012"){ <%-- ���� ������ ������ ǥ�� --%>
				putMarker(marker.no, decodeURI(marker.name), marker.xc, marker.yc, '/img/mapImg/redQuad.gif', 7, 7);
				fixes++;   <%-- ���μ����� ����--%>
			}
		} else {
			break;
		}
		--count;
	}
	top.menu.saleCount.value = sales;
	top.menu.fixCount.value = fixes;

	<%--  queue�� water mark �� �ö� ���� ������ �� ü����.--%>
	if (markers == null || markers.length < LIMIT) {
		nextData();
	}
	if (markers != null && markers.length > 0) {
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
	var $ftTyp = $('#FT_TYP');
	var $gucd = $('#GU_CD');
	var $bjcd = $('#BJ_CD');
	var $bonbun = $('#BONBUN');
	var $bubun = $('#BUBUN');
    var $ownername = $('#OWNER_NAME');
    <%-- guCode���� ������ �ʵ尪���� jsonŸ������  MapSearchControl�� ���� --%>
	$.ajax({
		url :'/gapan/map/searchMapbyjson.do',
		contentType :'application/x-www-form-urlencoded; charset=utf-8',
		cache:false,
		type :'post',
		data :{
			  	bjcd:$bjcd.val(),
			    ftTyp:$ftTyp.val(),
			    bonbun:$bonbun.val(),
			    bubun:$bubun.val(),
			    ownername:$ownername.val(),
			    gucd : guCode
			   },
	 	dataType : 'json',
	 	success : function(data,textStatus,jqXHR){	<%-- MapSearchControl���� �����͸� �޾��� ��쿡 ������ ������ ���� ǥ��--%>
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
	 		case 'fail':
	 		case 'error':
	 		default: {
	 			nextData();
	 			break;
	 		}}
	 	},
	 		error : function(){
	 			alert("����");
	 		}		
	});
	
}
function jumsearch()
{    
	var $ftTyp = $('#FT_TYP');	
	var $gucd = $('#GU_CD');
	var $bjcd = $('#BJ_CD');
	var $bonbun = $('#BONBUN');
	var $bubun = $('#BUBUN');
  var $ownername = $('#OWNER_NAME');	
  
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
    
	if($bjcd == ''){   <%-- ������ ������ �ʵ尪�� ���� ���� ���  --%>
		alert('�����ͷ����� ���� �ּ� �������� �����ϼž� �մϴ�.');
	}else{    <%--������ ������ �ʵ尪�� ������� --%>
	    var guCode = $gucd.val();	
	    if(guCode == '000'){ <%-- guCode���� ����� ��ü �ϰ�� --%>
	       var options = $gucd.find('option');
	       var size = options.length; 
	       for(var i =2; i<size; i++){
	    		queue.push($(options[i]).val()); <%--queue �� options�� �����Ͱ��� �о�ִ´� --%>
	       }	       
	       guCode = queue.shift(); 	 <%--queue�� ������ �����Ͱ��� ������--%>
	    }
	    top.map.removeMakers(); 
	    sales = 0;
	    fixes = 0;
		top.menu.saleCount.value = sales;  
		top.menu.fixCount.value = fixes;
	    getData(guCode);   
	   
	}	
}
/*
function jumsearch()
{
	var form = document.form;
	form.action = "/gapan/map/search.do";
    form.submit();
}
*/

function init(){
	
	setSelectedOption(document.getElementById("FT_TYP"),"${ftTyp}");
	
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
	
	top.menu.saleCount.value = "${saleCount}";
	top.menu.fixCount.value = "${fixCount}";
	
	top.map.removeMakers();
	
	<c:forEach items="${gapanList}" var="list" varStatus="idx">
	//********** BEGIN_KANG_20120423
	/*
	if("${list.FT_TYP}" == "011"){
	top.map.addMaker("${list.XC}","${list.YC}","/img/mapImg/blueQuad.gif","15","15","${list.OWNER_NAME}",function(){top.map.left.gapanView("${list.GAPAN_NO}");});
	}else if("${list.FT_TYP}" == "012"){
		top.map.addMaker("${list.XC}","${list.YC}","/img/mapImg/redQuad.gif","15","15","${list.OWNER_NAME}",function(){top.map.left.gapanView("${list.GAPAN_NO}");});	
	}
	*/
	if("${list.FT_TYP}" == "011"){
		top.map.addMaker("${list.XC}","${list.YC}","/img/mapImg/blueQuad.gif","7","7","${list.OWNER_NAME}",function(){top.map.left.gapanView("${list.GAPAN_NO}");});
	}else if("${list.FT_TYP}" == "012"){
		top.map.addMaker("${list.XC}","${list.YC}","/img/mapImg/redQuad.gif","7","7","${list.OWNER_NAME}",function(){top.map.left.gapanView("${list.GAPAN_NO}");});	
	}
	//********** END_KANG_20120423

	</c:forEach>
	
	top.map.loadingCtl.decreaseCounter();

}

function gapanView(gapanNo){
	document.getElementById("result").src = "/gapan/map/searchview.do?GAPAN_NO="+gapanNo;
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
					<font color="#ffffff"><b>${guNm}û&nbsp;${name}</b>�� ȯ���մϴ�</font>
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
											<img src="/img/mapImg/left_title1.gif" alt="�����󿵾��ü��� �˻�" width="220" height="33">
										</td>
									</tr>

									<tr>
										<td align="center" valign="top" class="M_leftborder2">
											<table width="198" border="0" cellpadding="0" cellspacing="0" class="Map_stan">
												<tr>
													<td height="22">��ϱ���</td>
													<td>
														<select id="FT_TYP" name="FT_TYP" class="input_form1" style="width: 139px">
															<option value="">::����::</option>
															<option value="011">�����ǸŴ�</option>
															<option value="012">���μ�����</option>
														</select>
													</td>
												</tr>
												<tr>
													<td height="22">��/��/��</td>
													<td>
														<select id="GU_CD" name="GU_CD" class="input_form1" style="width: 139px" onchange="changeGuCd(this);">
															${guList}
														</select>
													</td>
												</tr>
												<tr>
													<td height="22">��/��/��</td>
													<td>
														<select id="BJ_CD" name="BJ_CD" class="input_form1" style="width: 139px">
															${bjList}
														</select>
													</td>
												</tr>
												<tr>
													<td height="22">����</td>
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
										<td height="32"><img src="/img/mapImg/left_title2.gif" alt="��� �˻�" width="220" height="32">
										</td>
									</tr>
									<tr>
										<td align="center" valign="top" class="M_leftborder2">
											<table width="198" border="0" cellpadding="0" cellspacing="0" class="Map_stan">
												<tr>
													<td width="59" height="22">������</td>
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
								<img src="/img/mapImg/search_icon.gif" onClick="javascript:jumsearch();" onkeypress="javascript:jumsearch();" alt="�˻�" width="220" height="20" border="0" style="cursor: pointer;">
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
					<iframe id="result" name="result" src="/gapan/map/searchview.do" width="235px" height="400px" scrolling="auto" marginwidth="0" marginheight="no" frameborder="no" allowtransparency="True" title="�˻����"></iframe>
				</td>
				<td width="10"></td>
			</tr>
		</table>
	</form>
</body>
</html>
