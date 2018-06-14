<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/loginCheck.jsp"%>
<%@ include file="/jsp/common/include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />

<title>::::: 서울시 도로점용관리시스템 :::::</title>
<style type="text/css">
<!--
body {
	margin: 0px;
}
-->
</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
</head>
<script language="javascript" src="/js/common.js"></script>
<script language='JavaScript' src='/js/Check_inputbox.js'></script>
<script language="javascript" src="/js/calculation.js"></script>
<script language="javascript" src="/js/PopupCalendar.js"></script>
<script language="javascript" src="/js/Ajax_request.js"></script>
<script language="javascript" src="/js/zipcode.js"></script>
<script type="text/javascript">
//<![CDATA[
	
	function	ModifyPrc()
	{
		var	result	= DataCheck();
		
		if(result	==	false)
			return;
		
		var form 	= document.form;
		var	str		= "";

	

		//김권태 . 2009.11.09 수정
		//점용지 미입력
		var BJ_CD = form.BJ_CD.value;
		var SPC_CD = form.SPC_CD.value;
		var BONBUN = form.BONBUN.value;
		var BUBUN = form.BUBUN.value;
		var FLAG = "GAPAN";
		var addNum = "";

		if(BONBUN.length < 4){
			var bonbun_Count =  4 - BONBUN.length;
			
			for(var i=0; i < bonbun_Count; i++){
				addNum = addNum + "0";
			}
		}
		var winPosBONBUN_4LENGTH = addNum+BONBUN;

		addNum = "";
	
		if(BUBUN.length < 4){
			
			
			var bubun_Count = 4 - BUBUN.length;
			
			for(var i=0; i < bubun_Count; i++){
				addNum = addNum + "0";
			}
		}
		var winPosBUBUN_4LENGTH = addNum+BUBUN;
		
		var PNU = '${SIDO}'+'${SIGU_CD}'+BJ_CD+SPC_CD+winPosBONBUN_4LENGTH+winPosBUBUN_4LENGTH;		//PNU값 생성

		form.WITH_PNU.value = PNU;	//PNU 파라메터에 값  세팅

		//수정 끝
		
		//가액 콤마 삭제
		document.getElementById("SF_VALUE").value = removeComma(document.getElementById("SF_VALUE").value);
		

		form.action = "/gapan/jumyonginfo/jumji_modify_prc.do";

		form.submit();
	}
	
	
	function	DataCheck()
	{
		var form 	= document.form;
		var	str		= "";

		if(form.CHANGE_Y.value.length != 4 && form.CHANGE_Y.value.length != 0)
		{
			str	+= "교체년도는 4자리 입니다.\n";
			alert(str);
			form.CHANGE_Y.focus();
		}
		else if(form.CHANGE_M.value.length != 2 && form.CHANGE_M.value.length != 0)
		{
			str	+= "교체월은 2자리 입니다.\n";
			alert(str);
			form.CHANGE_M.focus();
		}
		else if(form.TAX_SET.value.length	< 1)
		{
			str	+= "세입구분을 선택하세요\n";
			alert(str);
			form.TAX_SET.focus();
		}
		else if(form.MUL_FROMDATE.value.length	< 1)
		{
			str	+= "점용기간을 입력하세요\n";
			alert(str);
			form.MUL_FROMDATE.focus();
		}
		else if(form.MUL_TODATE.value.length	< 1)
		{
			str	+= "점용기간을 입력하세요\n";
			alert(str);
			form.MUL_TODATE.focus();
		}
		else if(form.BJ_CD.value.length	< 1)
		{
			str	+= "점용지 법정동을 선택 하세요\n";
			alert(str);
			form.BJ_CD.focus();
		}
		else if(form.HJ_CD.value.length	< 1)
		{
			str	+= "점용지 행정동을 선택 하세요\n";
			alert(str);
			form.HJ_CD.focus();
		}
		else if(form.SPC_CD.value.length	< 1)
		{
			str	+= "점용지 번지종류를 선택 하세요\n";
			alert(str);
			form.SPC_CD.focus();
		}
		else if(form.BONBUN.value.length	< 1)
		{
			str	+= "점용지 본번을 입력 하세요\n";
			alert(str);
			form.BONBUN.focus();
		}
		else if(form.FT_TYP.value.length	< 1)
		{
			str	+= "시설물명을 선택하세요\n";
			alert(str);
			form.FT_TYP.focus();
		}
		else if(form.PLACE_L.value.length	< 1)
		{
			str	+= "점용면적 가로를 입력하세요\n";
			alert(str);
			form.PLACE_L.focus();
		}
		else if(form.PLACE_H.value.length	< 1)
		{
			str	+= "점용면적 세로를 입력하세요\n";
			alert(str);
			form.PLACE_H.focus();
		}
		else if(form.FT_TYP.value.length	< 1)
		{
			str	+= "시설물명을 선택하세요\n";
			alert(str);
			form.FT_TYP.focus();
		}
		else if(form.FT_SEL.value.length	< 1)
		{
			str	+= "시설물 규격을 선택하세요\n";
			alert(str);
			form.FT_SEL.focus();
		}

		if(str	== "")
		{
			return	true;
		}
		
		return	false;
	}

	function	Cancel(gapanno)
	{
		document.form.action = "/gapan/jumyonginfo/jumji_view.do?GAPAN_NO="+gapanno;
		document.form.submit();
	}
		
	//파일업로드 찾아보기 버튼 변경
	function ChangeImg3()
	{
	//  var fileName = document.sender.file.value; //일단 주소부분은 주석처리
		newImg = new Image(); //이미지 객체 생성
		imgFileSize = ""; 
		newImg.src = "";
		maxFileSize = 150*200;
		newImg.src = document.getElementById("file3").value
		var imgpath = document.form.SHOP_IMG.value;
		document.all["tblview3"].style.backgroundImage="url(" + imgpath + ")";
		document.all["tblview3"].style.backgroundRepeat="no-repeat";
		imgFileSize = newImg.fileSize;
	}
	
	function jumyongZibun(SIDO, SIGU_CD){

		var form 	= document.form;
		var	str		= "";

		if(form.BJ_CD.value.length	< 1)
		{
			str	+= "점용지 법정동을 선택 하세요\n";
			alert(str);
			form.BJ_CD.focus();
			return;
		}
		else if(form.HJ_CD.value.length	< 1)
		{
			str	+= "점용지 행정동을 선택 하세요\n";
			alert(str);
			form.HJ_CD.focus();
			return;
		}
		else if(form.SPC_CD.value.length	< 1)
		{
			str	+= "점용지 번지종류를 선택 하세요\n";
			alert(str);
			form.SPC_CD.focus();
			return;
		}
		else if(form.BONBUN.value.length	< 1)
		{
			str	+= "점용지 본번을 입력 하세요\n";
			alert(str);
			form.BONBUN.focus();
			return;
		}

		var BJ_CD = form.BJ_CD.value;
		var SPC_CD = form.SPC_CD.value;
		var BONBUN = form.BONBUN.value;
		var BUBUN = form.BUBUN.value;
		var FLAG 			= "GAPAN";
		var addNum = "";

		if(BONBUN.length < 4){
			var bonbun_Count =  4 - BONBUN.length;
			
			for(var i=0; i < bonbun_Count; i++){
				addNum = addNum + "0";
			}
		}
		var winPosBONBUN_4LENGTH = addNum+BONBUN;
	
		if(BUBUN.length < 4){
			
			var bubun_Count = 4 - BUBUN.length;
			var addNum = "";
			
			for(var i=0; i < bubun_Count; i++){
				addNum = addNum + "0";
			}
		}
		var winPosBUBUN_4LENGTH = addNum+BUBUN;
		var PNU = SIDO+SIGU_CD+BJ_CD+SPC_CD+winPosBONBUN_4LENGTH+winPosBUBUN_4LENGTH;		//PNU값 생성

		//ADDR 생성		
		var ADDR = '${SIDO_NM}' + ' ' + '${SIGUNGU}' + ' ' + form.BJ_CD.options[form.BJ_CD.selectedIndex].text + ' ' + form.SPC_CD.options[form.SPC_CD.selectedIndex].text + ' ' + BONBUN;
		if(BUBUN.length > 0){
			ADDR = ADDR + '-' + BUBUN;
		}
		form.WITH_PNU.value = PNU;	//PNU 파라메터에 값  세팅
		
		
		var url = '/gapan/map/mini_map.do?PNU='+PNU+'&X_COORD='+form.X_COORD.value+'&Y_COORD='+form.Y_COORD.value+'&TYPE=edit';

		cw=screen.availWidth;
		ch=screen.availHeight;
		
		sw=800;
		sh=600;
		
		ml=(cw-sw)/2;
		mt=(ch-sh)/2;

  		var param = 'width='+sw+',height='+sh+',top='+mt+',left='+ml+',resizable=no, status=no, scrollbars=no, toolbar=no, menubar=no';

		window.open(url, "minimap", param);
	}
	
	function attach(obj) {
		/*
	    var val = obj.value;
	    //alert(obj.id);
	    //alert(document.getElementById(obj.id).value);	    
		file_size = get_file_check(document.getElementById(obj.id).value);	
		
		if(0 == file_size)
		{
			alert(file_size);
			alert(document.getElementById('file1').value);
			return;
		}

		document.getElementById('ATTACH_SIZE').value = CutDecimalPoint(file_size/1024);	    
	    document.getElementById('ATTACH_FILE').value = getNoDirFileName(val);
	    */
	}
	

	
	function ChangeImg(thisObj, preViewer) {
		
		if(!/(\.gif|\.jpg|\.jpeg|\.png)$/i.test(thisObj.value)) {
			alert("이미지 형식의 파일을 선택하십시오");
			return;
		}

		preViewer = (typeof(preViewer) == "object") ? preViewer : document.getElementById(preViewer);
		var ua = window.navigator.userAgent;

		if (ua.indexOf("MSIE") > -1) {
			var img_path = "";
			if (thisObj.value.indexOf("\\fakepath\\") < 0) {                 
				img_path = thisObj.value;
			} else {
				thisObj.select();
				var selectionRange = document.selection.createRange();
				img_path = selectionRange.text.toString();
				thisObj.blur();
			}
				preViewer.style.filter = "progid:DXImageTransform.Microsoft.AlphaImageLoader(src='fi" + "le://" + img_path + "', sizingMethod='scale')";
		} else {
			preViewer.innerHTML = "";
			var W = preViewer.offsetWidth;
			var H = preViewer.offsetHeight;
			var tmpImage = document.createElement("img");
			preViewer.appendChild(tmpImage);
	
			tmpImage.onerror = function () {
				return preViewer.innerHTML = "";
			}
	
			tmpImage.onload = function () {
	
				if (this.width > W) {
					this.height = this.height / (this.width / W);
					this.width = W;
				}
				if (this.height > H) {
					this.width = this.width / (this.height / H);
					this.height = H;
				}
			}
	        if (ua.indexOf("Firefox/3") > -1) {
				var picData = thisObj.files.item(0).getAsDataURL();
				tmpImage.src = picData;
			} else {
				tmpImage.src = "file://" + thisObj.value;
			}
		}
     }

	function Jumji_CalPlaceSize()
	{
		

		var ret = parseFloat(form.PLACE_L.value) * parseFloat(form.PLACE_H.value);
		form.PLACE_A.value = Math.round( ret* Math.pow(10,parseInt(3,10)) ) / Math.pow(10,parseInt(3,10));

			
	}


	////////////////////////////////AJAX////////////////////////////////////////////
	////////////////////////////////AJAX////////////////////////////////////////////
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

	
	function fncSelectBoxSetting(strParam, selectBoxId, defaultSel, topLabel)
	{
        var xmldoc = new ActiveXObject("Microsoft.XMLDOM");
        var selectBoxLabel;
        var root;
        var selectBoxValue;
        var opt 	= document.getElementById(selectBoxId);
        var tags	= "";
        var	text	= "";

        for(var i = opt.options.length - 1 ; i > -1 ; i--)
        {
        	opt.options[i]	= null;
        }

        xmldoc.async	= false;

		xmldoc.loadXML(strParam);


		root = xmldoc.getElementsByTagName("option").length;


        if(root <= 0)
        {
            tags 	= document.createElement("option");
            text	= document.createTextNode("");
            tags.setAttribute("label", "");
            tags.appendChild(text);
            tags.value = 0;
            opt.appendChild(tags);
            return;
        }

        if(topLabel != null && topLabel != "")
		{
            tags 	= document.createElement("option");
            text	= document.createTextNode(topLabel);
            tags.setAttribute("label", topLabel);
            tags.appendChild(text);
            tags.value = '';
            opt.appendChild(tags);
        }
    	
        for(var i = 0; i < root; i++)
        {
        	
        	selectBoxValue = xmldoc.getElementsByTagName("option/@value").item(i).text;
        	selectBoxLabel = xmldoc.getElementsByTagName("option/@label").item(i).text;

            tags 	= document.createElement("option");
       		text	= document.createTextNode(selectBoxLabel);

            tags.setAttribute("label", selectBoxLabel);
    
            tags.value = selectBoxValue;
            tags.appendChild(text);
            opt.appendChild(tags);
        }

		var ft_sel = '${ft_sel}';
		var ft_typ = '${ft_typ}';

        if(ft_typ.length > 0 && document.getElementById('FLAG').value == '2'){
        	document.getElementById("FT_TYP").options.value = ft_typ;
      	};

        if(ft_sel.length > 0 && document.getElementById('FLAG').value == '1'){
        	document.getElementById("FT_SEL").options.value = ft_sel;
        };

        document.getElementById('FLAG').value = parseInt(document.getElementById('FLAG').value) - 1;
        
    }

	function	SelectedFTTYP()
	{
		var	FT_TYP	= document.getElementById("FT_TYP").value;
		
		var	param	= "FT_TYP="+FT_TYP;

		sendRequest("/gapan/jumyonginfo/get_ft_sel.do", param, "GET", ResultFTTYP);
	}

	function	SelectedGPTYP()
	{
		var	param	= "GP_TYP=001";
		sendRequest("/gapan/jumyonginfo/get_ft_typ.do", param, "GET", ResultGPTYP);
		
	}


	

	function	ResultFTTYP(obj)
	{
		fncSelectBoxSetting(obj, "FT_SEL", "EEE", "::선택::");
	}

	function	ResultGPTYP(obj)
	{
		fncSelectBoxSetting(obj, "FT_TYP", "EEE", "::선택::");
		SelectedFTTYP();
	}

	function Init(){
		
		var mul_spc_cd = "${mul_spc_cd}";
		
		if(mul_spc_cd=="산번지")
			mul_spc_cd = "2";
		if(mul_spc_cd=="일반번지")
			mul_spc_cd = "1";
		document.getElementById("SPC_CD").value=mul_spc_cd;
	
		//시설물, 규격 초기화
		SelectedGPTYP();

	}

	//********** BEGIN_KANG_20120423
	function selectFT_TYP(){		
		var FT_TYP = document.getElementById("FT_TYP").value;
		var Facility = "";
		
		if(FT_TYP == "%" || FT_TYP == ""){			
			document.getElementById("FacilityView").style.display="none";				
		}else{			
			document.getElementById("FacilityView").style.display="block";			
			if(FT_TYP == "011"){
				Facility = "가로판매대";
			}else if(FT_TYP == "012"){
				Facility = "구두수선대";
			}
		}
		//document.getElementById("Facility").value=Facility;	
		document.getElementById("Facility").innerHTML=Facility;

	}
	//********** END_KANG_20120423	

//]]>
</script>

<!-- body onload="Init(); Init_UseType('${board.TYPE}'); Init_UseSection('${board.SECTION}');" -->
<body onload="Init();">
<form id="form" name="form" method="post" enctype="multipart/form-data">
	<input type="hidden" id="GAPAN_NO" name="GAPAN_NO" value="${GAPAN_NO}">
	<input type="hidden" id="GU_CODE" name="GU_CODE" value="${GU_CODE}">
	<input type="hidden" id="X_COORD" name="X_COORD" value="${X_COORD}">
	<input type="hidden" id="Y_COORD" name="Y_COORD" value="${Y_COORD}">
	<input type="hidden" id="WITH_PNU" name="WITH_PNU" value="${WITH_PNU}">
	<input type="hidden" id="PURPOSE_CD" name="PURPOSE_CD" value="${board.PURPOSE_CD }">
	<input type="hidden" id="SHOP_IMG_NAME" name="SHOP_IMG_NAME" value="${board.SHOP_IMG_NAME }">
	<input type="hidden" id="FLAG" name="FLAG" value="2">
<table width="780" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td align="left" class="contborder_blue">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td>
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td>
						<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse: collapse;" cellpadding="0" cellspacing="0" class="sub_table">
							<tr>
								<td height="34" colspan="4" bgcolor="#FFFFFF" class="table_bl_left">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
										<td width="60" align="center">
											<img src="/img/0811_tt2.gif" width="44" height="17">
										</td>
									</tr>
								</table>
								</td>
							</tr>
							<tr>
								<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">세입구분</td>
								<td bgcolor="f6f6f6" class="table_bl_left" colspan="3">
									<select id="TAX_SET" name="TAX_SET" class="essential" style="width: 70px">
										${taxation_section}
									</select>
								</td>
							</tr>
							<tr>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용기간</td>
								<td colspan="3" bgcolor="f6f6f6" class="table_bl_left">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
										<td>
											<input id="MUL_FROMDATE" name="MUL_FROMDATE" value="${board.MUL_FROMDATE}" type="text" class="essential" style="width: 76px" readonly>
										</td>
										<td>
											<a>
												<img src="/img/calendar_icon.gif" width="19" height="16" border="0" onClick="popUpCalendar(this, document.getElementById('MUL_FROMDATE'), 'yyyymmdd')" style="CURSOR: Hand;">
											</a>
										</td>
										<td width="16" align="center">~</td>
										<td>
											<input id="MUL_TODATE" name="MUL_TODATE" value="${board.MUL_TODATE}" type="text" class="essential" style="width: 76px" readonly></td>
										<td>
											<a>
												<img src="/img/calendar_icon.gif" width="19" height="16" border="0" onClick="popUpCalendar(this, document.getElementById('MUL_TODATE'), 'yyyymmdd')" style="CURSOR: Hand;">
											</a>
										</td>
									</tr>
								</table>
								</td>
							</tr>
							<tr>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">
									인접지 지번<br/>(공시지가대상)
								</td>
								<td colspan="3" bgcolor="f6f6f6" class="table_bl_left">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
										<td width="76">${SIDO_NM}&nbsp;&nbsp;${SIGUNGU}&nbsp;&nbsp;</td>
										<td>
											<select id="BJ_CD" name="BJ_CD" class="essential" style="width: 100px">
												${bjdong_code}
											</select>
										</td>
										<td>
											&nbsp;
											<select id="HJ_CD" name="HJ_CD" class="essential" style="width: 100px">
												${hjdong_code}
											</select>
										</td>
										<td width="16" align="center">/</td>
										<td>
											<select id="SPC_CD" name="SPC_CD" class="essential" style="width: 75px">
												<option value="1">일반번지</option>
												<option value="2">산번지</option>
											</select>
										</td>
										<td width="10">&nbsp;</td>
										<td>
											<input id="BONBUN" name="BONBUN" value="${BONBUN}" type="text" class="essential" style="width: 50px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);" maxlength="4">
										</td>
										<td width="16" align="center">-</td>
										<td>
											<input id="BUBUN" name="BUBUN" value="${BUBUN}" type="text" class="input_form1" style="width: 50px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);" maxlength="4">
										</td>
										<td width="30" align="center">번지</td>
									</tr>
								</table>
								</td>
							</tr>
							
							<tr>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">
									인접지<br/>도로명주소
								</td>
								<td colspan="3" bgcolor="f6f6f6" class="table_bl_left">
									<img alt="검색" src="/img/search_icon.gif" width="56" height="18" border="0" onclick="javascript:openZipcodePopup_new('','','form.WITH_DORO_NM','','','','','','','');"  style="cursor: pointer; vertical-align: middle;">
									<input id="WITH_DORO_NM" name="WITH_DORO_NM" type="text" class="essential" value="${WITH_DORO_NM}" style="width: 250px" onclick="javascript: openZipcodePopup_new('','','form.WITH_DORO_NM','','','','','','','');"></input>
									<input id="WITH_BD_BON" name="WITH_BD_BON" type="text" class="essential" value="${WITH_BD_BON}" style="width: 25px"></input>
									<input id="WITH_BD_BU" name="WITH_BD_BU" type="text" class="essential" value="${WITH_BD_BU}" style="width: 25px"></input>
									<br/><font color="blue">* 수정 시, 검색버튼을 클릭 후, 팝업창에서 도로명주소 검색 후 해당 도로명 주소를 선택</font>
								</td>
							</tr>
							
							<tr>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b" width="100" nowrap>점용지 주소</td>
								<td bgcolor="f6f6f6" class="table_bl_left" nowrap>
									<input id="WITH_ADDR" name="WITH_ADDR" type="text" class="input_form1" style="width: 200px" value="${board.WITH_ADDR}" maxlength="50">
								<img src="/img/loca_icon2.gif" alt="위치등록" width="64" height="18" border="0" onClick="javascript:jumyongZibun('${SIDO}','${SIGU_CD}');" style="CURSOR: Hand;"></td>
								<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b" rowspan="5" nowrap>
								<table>
									<tr>
										<td align="center" bgcolor="e5eff8" class="sub_table_b">시설물 사진</td>
									</tr>
									<tr>
										<td>
										<br>
										<br>
										<span onclick="javascript:document.getElementById('file3').click();" style="overflow: hidden; background-repeat: no-repeat; cursor: pointer;">
										</span>
										</td>
									</tr>
								</table>
								</td>

								<td bgcolor="eaeaea" class="table_bl_left" rowspan="5" nowrap="nowrap" align="center">
								<table>
									<tr>
										<td>
											<input type='file' id="SHOP_IMG" name='SHOP_IMG' style="width: 10;" onchange="ChangeImg(this, 'tblview3');">
										</td>
									</tr>
									<tr>
										<td width=100 height=130 id="tblview3" style="background-image:url('${board.SHOP_IMG}'); background-repeat:no-repeat; background-attachment:scroll;">
										</td>
									</tr>
								</table>
								</td>
							</tr>
							<tr>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">주변정보</td>
								<td bgcolor="f6f6f6" class="table_bl_left">
									<input id="WITH_INFO" name="WITH_INFO" type="text" class="input_form1" style="width: 264px" value="${board.WITH_INFO}">
								</td>
							</tr>
							<tr>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">도로정보</td>
								<td bgcolor="f6f6f6" class="table_bl_left">
									<input id="ROAD_INFO" name="ROAD_INFO" type="text" class="input_form1" style="width: 264px" value="${board.ROAD_INFO}">
								</td>
							</tr>
							<tr>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">지역정보</td>
								<td bgcolor="f6f6f6" class="table_bl_left">
									<select id="AR_SEL" name="AR_SEL" class="input_form1" style="width: 76px">
										${ar_sel}
									</select>
									<input id="AR_TXT" name="AR_TXT" type="text" class="input_form1" style="width: 184px" value="${board.AR_TXT}" maxlength="50">
								</td>
							</tr>
							<tr>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">설치일자</td>
								<td bgcolor="f6f6f6" class="table_bl_left">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
										<td>
											<input id="FOUND_DATE" name="FOUND_DATE" type="text" class="input_form1" style="width: 120px" value="${board.FOUND_DATE}" readonly></td>
										<td>
											<a>
												<img src="/img/calendar_icon.gif" width="19" height="16" border="0" onClick="popUpCalendar(this, document.getElementById('FOUND_DATE'), 'yyyymmdd')" style="CURSOR: Hand;">
											</a>
										</td>
									</tr>
								</table>
								</td>
							</tr>
							<tr>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">인접시설</td>
								<td bgcolor="f6f6f6" class="table_bl_left">
									<select id="UC_SEL" name="UC_SEL" class="input_form1" style="width: 100px">
										${uc_sel}
									</select>
									<input id="UC_TXT" name="UC_TXT" type="text" class="input_form1" style="width: 150px" value="${board.UC_TXT}" maxlength="50">
								</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">시설물 가액</td>
								<td bgcolor="f6f6f6" class="table_bl_left">
									<input id="SF_VALUE" name="SF_VALUE" type="text" class="input_form1" style="width: 80px; ime-mode: disabled;" value="${rnic:insertComma2(board.SF_VALUE)}" onKeyDown="onlyNumberInput();" onkeyup="javascript:fn_addComma(this)" style="text-align:right" maxlength="16">원
								</td>
							</tr>
							<tr>
								<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">시설물명/규격</td>
								<td bgcolor="f6f6f6" class="table_bl_left">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
										<td>
											<!--  //********** BEGIN_KANG_20120423 -->
											<!-- 
											<select id="FT_TYP" name="FT_TYP" class="essential" style="width: 100px" onchange="SelectedFTTYP();">
											</select>
											-->
											<select id="FT_TYP" name="FT_TYP" class="essential" style="width: 100px" onchange="SelectedFTTYP();selectFT_TYP();">
											</select>
											<!--   //********** END_KANG_20120423 -->										
										</td>
										<td width="16" align="center">/</td>
										<td>
											<select id="FT_SEL" name="FT_SEL" class="essential" style="width: 100px">
											</select>
										</td>
									</tr>
								</table>
								</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">점용면적</td>
								<td bgcolor="f6f6f6" class="table_bl_left">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
										<td>
											<input id="PLACE_L" name="PLACE_L" value="${board.PLACE_L}" type="text" class="essential" style="width: 40px" onKeyPress="nr_num_float(this),Jumji_CalPlaceSize();" onKeyUp="nr_num_float(this),Jumji_CalPlaceSize();" maxlength="5">
										</td>
										<td width="16" align="center">m</td>
										<td width="12" align="center">x</td>
										<td>
											<input id="PLACE_H" name="PLACE_H" value="${board.PLACE_H}" type="text" class="essential" style="width: 40px" onKeyPress="nr_num_float(this),Jumji_CalPlaceSize();" onKeyUp="nr_num_float(this),Jumji_CalPlaceSize();" maxlength="5">
										</td>
										<td width="16" align="center">m</td>
										<td width="12" align="center">=</td>
										<td>
											<input id="PLACE_A" name="PLACE_A" value="${board.PLACE_A}" type="text" class="essential" style="width: 60px" onKeyPress="nr_num_float(this);" onKeyUp="nr_num_float(this);" maxlength="5" readonly="readonly">
										</td>
										<td width="16" align="center">㎡</td>
									</tr>
								</table>
								</td>
							</tr>
							<!--  //********** BEGIN_KANG_20120423 -->
							<!-- 
							<tr>
								<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">교체년월</td>
								<td bgcolor="f6f6f6" class="table_bl_left" colspan="3">
									<input id="CHANGE_Y"  name="CHANGE_Y" value="${CHANGE_Y}" type="text" class="input_form1" style="width: 30px" onKeyPress="nr_num_float(this);" onKeyUp="nr_num_float(this);" maxlength="4">년&nbsp;
									<input id="CHANGE_M" name="CHANGE_M" value="${CHANGE_M}" type="text" class="input_form1" style="width: 15px" onKeyPress="nr_num_float(this);" onKeyUp="nr_num_float(this);" maxlength="2">월
								</td>
							</tr>
							-->
							<tr>
							<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">시설물 번호</td>
								<td bgcolor="f6f6f6" class="table_bl_left">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
										<td>
					                      <div id="FacilityView" style="display:block">                      
					                      	<table width="250px" border="0" cellpadding="0" cellspacing="0" align="left">
					                      		<tr>
					                      			<td align="left" class="sub_stan" >                      				
					                      				<span id="Facility" class="sub_stan"><c:if test="${ft_typ == '011' }">가로판매대</c:if><c:if test="${ft_typ == '012' }">구두수선대</c:if></span>&nbsp;-&nbsp;
					                      				<input id="facility_No" name="facility_No" type="text" class="input_form1" style="width:50px" onchange="isNum(this,'시설물 번호')" maxlength="5" value="${board.facility_No}"/> 
					                      			</td>                      			
					                      		</tr>
					                      	</table>
					                      </div>
										</td>
									</tr>
								</table>
								</td>
								<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">교체년월</td>
								<td bgcolor="f6f6f6" class="table_bl_left">
									<input id="CHANGE_Y"  name="CHANGE_Y" value="${CHANGE_Y}" type="text" class="input_form1" style="width: 30px" onKeyPress="nr_num_float(this);" onKeyUp="nr_num_float(this);" maxlength="4">년&nbsp;
									<input id="CHANGE_M" name="CHANGE_M" value="${CHANGE_M}" type="text" class="input_form1" style="width: 15px" onKeyPress="nr_num_float(this);" onKeyUp="nr_num_float(this);" maxlength="2">월
								</td>
							</tr>
							<!--   //********** END_KANG_20120423 -->							
							
							<tr>
								<td height="34" colspan="4" bgcolor="#FFFFFF" class="table_bl_left">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
										<td width="60" align="center">
											<img src="/img/0811_tt1.gif" width="44" height="17">
										</td>
									</tr>
								</table>
								</td>
							</tr>
							<tr>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">취급품목</td>
								<td colspan="3" bgcolor="f6f6f6" class="table_bl_left">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
										<td>
											<select id="SG_TYP" name="SG_TYP" class="input_form1" style="width: 76px">
												${sg_typ}
											</select>
										</td>
									</tr>
								</table>
								</td>
							</tr>
							<tr>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">상품분류</td>
								<td bgcolor="f6f6f6" class="table_bl_left">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
										<td>
											<select id="SG_ITM" name="SG_ITM" class="input_form1" style="width: 76px">
												${sg_itm}
											</select>
										</td>
										<td width="16" align="center">/</td>
										<td>
											<select id="SG_SEL" name="SG_SEL" class="input_form1" style="width: 76px">
												${sg_sel}
											</select>
										</td>
									</tr>
								</table>
								</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">영업인원</td>
								<td bgcolor="f6f6f6" class="table_bl_left">
									<input id="MEM_NUM" name="MEM_NUM" value="${board.MEM_NUM}" class="input_form1" style="width: 76px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, OPEN_TIME1, 2);" maxlength="2">
									(운영자 본인 포함)
								</td>
							</tr>
							<tr>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">운영시간</td>
								<td bgcolor="f6f6f6" class="table_bl_left">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
										<td>
											<input id="OPEN_TIME1" name="OPEN_TIME1" value="${board.OPEN_TIME1}" type="text" class="input_form1" style="width: 30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);count_check(this, OPEN_TIME2, 2);" maxlength="2">
										</td>
										<td width="12" align="center">:</td>
										<td width="16" align="center">
											<input id="OPEN_TIME2" name="OPEN_TIME2" value="${board.OPEN_TIME2}" type="text" class="input_form1" style="width: 30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);count_check(this, CLOSE_TIME1, 2);" maxlength="2">
										</td>
										<td width="12" align="center">~</td>
										<td>
											<input id="CLOSE_TIME1" name="CLOSE_TIME1" value="${board.CLOSE_TIME1}" type="text" class="input_form1" style="width: 30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);count_check(this, CLOSE_TIME2, 2);" maxlength="2">
										</td>
										<td width="12" align="center">:</td>
										<td>
											<input id="CLOSE_TIME2" name="CLOSE_TIME2" value="${board.CLOSE_TIME2}" type="text" class="input_form1" style="width: 30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);" maxlength="2">
										</td>
									</tr>
								</table>
								</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">허가일자</td>
								<td bgcolor="f6f6f6" class="table_bl_left">
								<table border="0" cellpadding="0" cellspacing="0"
									class="sub_stan">
									<tr>
										<td><input id="PERMIT_DATE" name="PERMIT_DATE" value="${board.PERMIT_DATE}" type="text" class="input_form1" style="width: 76px" readonly>
										</td>
										<td><a>
											<img src="/img/calendar_icon.gif" width="19" height="16" border="0" onClick="popUpCalendar(this, document.getElementById('PERMIT_DATE'), 'yyyymmdd')" style="CURSOR: Hand;"></a>
										</td>
									</tr>
								</table>
								</td>
							</tr>
							<tr>
								<td height="26" align="center" bgcolor="e5eff8"
									class="sub_table_b">일매출액</td>
								<td bgcolor="f6f6f6" class="table_bl_left">
									<input id="DAY_SALES" name="DAY_SALES" value="${board.DAY_SALES}" type="text" class="input_form1" style="width: 76px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);" maxlength="8"> 원
								</td>
								<td bgcolor="f6f6f6" class="table_bl_left" colspan="2"></td>
							</tr>
							<tr>
								<td height="26" align="center" bgcolor="e5eff8"
									class="sub_table_b">기타정보</td>
								<td colspan="3" bgcolor="f6f6f6" class="table_bl_left">
									<textarea id="NOTES" name="NOTES" class="input_form1" style="width: 620px" rows="10" cols="200" onkeyup="displayBytes(2048, 'NOTE');">${board.NOTES}</textarea>
								</td>
							</tr>
						</table>
						</td>
					</tr>
					<tr>
						<td height="40" align="right">
							<a href="javascript:Cancel('${GAPAN_NO}')"><img src="/img/can_icon.gif" alt="취소" width="56" height="18" border="0"></a>
							<a href="javascript:ModifyPrc()"><img src="/img/save_icon2.gif" alt="저장" width="56" height="18" border="0"></a>
						</td>
					</tr>
				</table>
				</td>
			</tr>
		</table>
		</td>
	</tr>
</table>
</form>

</body>
</html>
