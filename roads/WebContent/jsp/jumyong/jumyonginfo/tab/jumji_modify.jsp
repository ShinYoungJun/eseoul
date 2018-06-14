<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="/jsp/common/loginCheck.jsp" %>
<%@ include file="/jsp/common/include.jsp" %>  

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

<script language="javascript" src="/js/PopupCalendar.js"></script> 
<script language='JavaScript' src='/js/Check_inputbox.js'></script>
<script language="javascript" src="/js/calculation.js"></script>
<script language="javascript" src="/js/Ajax_request.js"></script>
<script language="javascript" src="/js/common.js"></script> 
<!--  //********** BEGIN_현진_20120215 -->
<script language="javascript" src="/js/zipcode.js"></script>
<!--   //********** END_현진_20120215 -->   


<script type="text/javascript">
//<![CDATA[
           
          
	//2014.3.10 우편번호체크
	function isPostNum(obj)
	{
		if(!isNum(obj, "우편번호")) return;	//숫자여부체크
		if(form.MUL_POST.value.length < 6 && form.MUL_POST.value.length > 0){
			alert("우편번호는 6자리 입니다!")
		}
		return;
		
	}

	
	function	ModifyPrc()
	{
		var	result	= DataCheck();

		if(result	==	false)
			return;
		
		var form = document.form;
		
		form.PURPOSE_CD.value	= IFRM_PurposeCode.document.getElementById("PURPOSE_CD").value;

		form.action = "/jumyong/jumyonginfo/jumji_modify_prc.do";
		form.submit();
	}

	function	Cancel()
	{
		var form = document.form;

		form.action = "/jumyong/jumyonginfo/jumji_view.do";
		form.submit();
	}

	function	Init_UseType(sel)
	{
		if(sel == '2')
		{
			document.getElementById("USERTYPENAME").value		= "하천명/등급";
			document.getElementById("UseType2").style.display 	= "inline-block";	// 하천명
			document.getElementById("UseType3").style.display 	= "inline-block"; // 하천등급
		}else if(sel == '3'){
			document.getElementById("USERTYPENAME").value		= "하천명";
			document.getElementById("UseType2").style.display 	= "inline-block";	// 하천명
		}else if(sel == '1'){
			document.getElementById("USERTYPENAME").value		= "주차면수";
			document.getElementById("UseType1").style.display 	= "inline-block";	//	도로
		}
	}

	function	Select_UseType(sel)
	{
		document.getElementById("UseType1").style.display = "none";
		document.getElementById("UseType2").style.display = "none";
		document.getElementById("UseType3").style.display 	= "none";
		
		if(sel.value == '2')
		{
			document.getElementById("USERTYPENAME").value		= "하천명/등급";
			document.getElementById("UseType2").style.display 	= "inline-block";	// 하천명
			document.getElementById("UseType3").style.display 	= "inline-block"; // 하천등급
			
		}
		else if(sel.value == '3')
		{
			document.getElementById("USERTYPENAME").value		= "하천명";
			document.getElementById("UseType2").style.display 	= "inline-block";	// 하천명
		}
		else if(sel.value == '1')
		{
			document.getElementById("USERTYPENAME").value		= "주차면수";
			document.getElementById("UseType1").style.display 	= "inline-block";	//	도로
			
		}

		document.getElementById("IFRM_PurposeCode").src="/jsp/common/purposeCode/purposeCode.jsp?SectionCode=" + sel.value + "&essential=1";
	}


	function	Select_UseSection(sel)
	{
		var form 	= document.form;
		
		if(sel.value == '2')
		{
			var MUL_DIV = document.getElementById("MUL_DIV");
		  	
		  	var innerHtml = "";
		  	innerHtml += "<table id='MUL_TABLE' border='0' cellpadding='0' cellspacing='0' class='sub_stan'>";
				innerHtml += "	<tr id='MulDateSection'>";
		  	innerHtml += "		<td id='UseSection' style='display:block'>";
		  	innerHtml += "			<input id='PARTLY_PERIOD' maxlength='100' name='PARTLY_PERIOD' type='text' class='essential' style='width:300px'"; 
		  	innerHtml += "			value='일시 점용기간을 입력해 주세요. 예)09.06.06 ~ 09.09.09' onclick='checkPARTLY_PERIOD()'>";
			 	innerHtml += "			&nbsp;&nbsp;총<input name='TOTAL_PERIOD' maxlength='5' type='text' class='essential' style='width:30px' value='' style='ime-mode:disabled' onKeyDown='nr_num_int(this);' onKeyUp='nr_num_int(this);' onKeyPress='nr_num_int(this);'>일";
			 	innerHtml += "		</td>";
			 	innerHtml += "	<td bgcolor='eaeaea' class='table_bl_left'>&nbsp;&nbsp;&nbsp;(만료일: ";
			 	innerHtml += "<input id='DUE_DATE' name='DUE_DATE' type='text' readonly style='width: 70px;'>";
			 	innerHtml += "<a><img onclick=\"popUpCalendar(this, document.getElementById('DUE_DATE'), 'yyyymmdd')\" src='/img/calendar_icon.gif' width='16' height='16' border='0' align='absmiddle' style='vertical-align:middle;CURSOR: pointer;'></a>";
			 	innerHtml += ")</td>";
			 	innerHtml += "	</tr>";
	  		innerHtml += "</table>";
		 	
		 		MUL_DIV.innerHTML = innerHtml;

			 	/*innerHtml = "";
			 	innerHtml += "<input id='DUE_DATE' name='DUE_DATE' type='text' class='essential' readonly='readonly'>";
			 	innerHtml += "<a><img onclick=\"popUpCalendar(this, document.getElementById('DUE_DATE'), 'yyyymmdd')\" src='/img/calendar_icon.gif' width='16' height='16' border='0' align='absmiddle' style='vertical-align:middle;CURSOR: pointer;'></a>";
			 	document.getElementById("setSectionTD").innerHTML = innerHtml;*/	 	

		}
		else if(sel.value == '3')
		{
			var MUL_DIV = document.getElementById("MUL_DIV");
			
			var innerHtml = "";
				innerHtml += "<table id='MUL_TABLE' border='0' cellpadding='0' cellspacing='0' class='sub_stan'>";
				innerHtml += "	<tr id='MulDateSection'>";
				innerHtml += "		<td id='UseSection' style='display:block'>";
		  		innerHtml += "			<input id='MUL_FROMDATE' name='MUL_FROMDATE' type='text' class='essential' style='width:70px' value='' readonly><a><img id='MUL_FROMDATE_IMG' src='/img/calendar_icon.gif' width='19' height='16' border='0' align='absmiddle' onclick=\"popUpCalendar(this, document.getElementById('MUL_FROMDATE'), 'yyyymmdd', 0)\" style='CURSOR: Hand;'></a>";
			  	innerHtml += "			~ <input id='MUL_TODATE' name='MUL_TODATE' type='text' class='essential' style='width:70px' value='' readonly><a><img id='MUL_TODATE_IMG' src='/img/calendar_icon.gif' width='19' height='16' border='0' align='absmiddle' onclick=\"popUpCalendar(this, document.getElementById('MUL_TODATE'), 'yyyymmdd', 0)\" style='CURSOR: Hand;'></a>";
	  			innerHtml += "		</td>";
		  		innerHtml += "	</tr>";
		  		innerHtml += "</table>";
		  		
		  	MUL_DIV.innerHTML = innerHtml;
		}
		else
		{
			var MUL_DIV = document.getElementById("MUL_DIV");
			
			var innerHtml = "";
				innerHtml += "<table id='MUL_TABLE' border='0' cellpadding='0' cellspacing='0' class='sub_stan'>";
				innerHtml += "	<tr id='MulDateSection'>";
				innerHtml += "		<td id='UseSection' style='display:block'>";
		  		innerHtml += "			<input id='MUL_FROMDATE' name='MUL_FROMDATE' type='text' class='essential' style='width:70px' value='' readonly><a><img id='MUL_FROMDATE_IMG' src='/img/calendar_icon.gif' width='19' height='16' border='0' align='absmiddle' onclick=\"popUpCalendar(this, document.getElementById('MUL_FROMDATE'), 'yyyymmdd')\" style='CURSOR: Hand;'></a>";
			  	innerHtml += "			~ <input id='MUL_TODATE' name='MUL_TODATE' type='text' class='essential' style='width:70px' value='' readonly><a><img id='MUL_TODATE_IMG' src='/img/calendar_icon.gif' width='19' height='16' border='0' align='absmiddle' onclick=\"popUpCalendar(this, document.getElementById('MUL_TODATE'), 'yyyymmdd')\" style='CURSOR: Hand;'></a>";
	  			innerHtml += "		</td>";
	  			innerHtml += "	</tr>";
	  			innerHtml += "</table>";
	  		
	  		MUL_DIV.innerHTML = innerHtml;
		}
		
	}
	//********** BEGIN_현진_20120215
	/*
		function 	openZipcodePopup(post, addr)
	{
		var	post1	= post;
		var	addr1	= addr;

		var url 	= "/zipcode.do?openerPost=" + post1 + "&openerAddr=" + addr1;
		var winName = "우편번호입력";
		var width 	= 420;
		var height 	= 305;
		var scroll 	= "yes";
		var resize 	= "no";

		var	option	= "scrollbars=" + scroll + ", ";
		option	+= "resize=" + resize + ", ";
		option	+= "width=" + width + ", ";
		option	+= "height=" + height;

		window.open(url, winName, option);
	}	
	
	*/
	//********** END_현진_20120215
	

	function 	Init()
	{	
		parent.Tab_Img("jumji");
		var form 	= document.form;
		
		
		<c:forEach items="${priceAddrList}" var="addr" varStatus="idx">
		addWithAddr('${addr.PNU}','${addr.ADDR}');
		</c:forEach>
		
	}


	function	DataCheck()
	{
		var form 	= document.form;
		var	str		= "";
		
		//	점용지 정보
		if(form.TYPE.value.length	< 1){
			str	+= "점용 종류를 입력하세요\n";
			alert(str);
			form.TYPE.focus();
		}
		else if(form.SECTION.value.length	< 1){
			str	+= "점용 구분을 입력하세요\n";
			alert(str);
			form.SECTION.focus();
		}
		else if(form.OWNER_SET.value.length	< 1){
			str	+= "소유자 구분을 입력하세요\n";
			alert(str);
			form.OWNER_SET.focus();
		}
		else if(form.TAX_SET.value.length	< 1){
			str	+= "세입 구분을 입력하세요\n";
			alert(str);
			form.TAX_SET.focus();
		}
		else if(form.BJ_CD.value.length	< 1){
			str	+= "점용지 법정동을 입력하세요.\n";
			alert(str);
			form.BJ_CD.focus();
		}
		else if(form.HJ_CD.value.length	< 1){
			str	+= "점용지 행정동을 입력하세요\n";
			alert(str);
			form.HJ_CD.focus();
		}
		else if(form.SPC_CD.value.length	< 1){
			str	+= "점용지 번지선택을 입력하세요\n";
			alert(str);
			form.SPC_CD.focus();
		}
		else if(form.BONBUN.value.length	< 1){
			str	+= "점용지 본번을 입력하세요\n";
			alert(str);
			form.BONBUN.focus();
		}
		else if(form.ROAD_BON.value.length	< 1)
		{
			str	+= "도로 주소를 입력하세요\n";
			alert(str);
			form.ROAD_BON.focus();
		}
		else if(form.MUL_POST.value.length	< 1){
			str	+= "우편번호를 입력하세요\n";
			alert(str);
			openZipcodePopup('form.MUL_POST', '', '', '', '', '', '', '', '', '');
		}
		else if(IFRM_PurposeCode.PURPOSE_CD.value < 010){
			str	+= "점용목적을 입력하세요\n";
			alert(str);
		}
		else if(form.AREA_SIZE.value.length < 1){
			str	+= "점용면적을 입력하세요\n";
			alert(str);
			form.AREA_SIZE.focus();
		}
		else if(IFRM_PurposeCode.isSelectOK() == false)
		{
			str += "점용목적을 정확히 선택하세요"
			alert(str);
		}
		else if(document.getElementsByName("WITH_ADDR_PNU").length	< 1)
		{
			str	+= "한개 이상에 공시지가 주소를 입력하세요\n";
			alert(str);
			//form.WITH_ADDR_LIST.focus();
			form.WITH_GU_CD.focus();
		}
		else if(form.SECTION.value	== '1' || form.SECTION.value == '3')
		{
			if(form.MUL_FROMDATE.value.length	< 1)
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
		}
		else if(form.SECTION.value	== '2')
		{
			if(form.PARTLY_PERIOD.value.length	< 1 || form.PARTLY_PERIOD.value == "일시 점용기간을 입력해 주세요. 예)09.06.06 ~ 09.09.09")
			{
				str	+= "일시점용기간을 입력하세요\n";
				alert(str);
				form.PARTLY_PERIOD.focus();
			}
			else if(form.TOTAL_PERIOD.value.length	< 1)
			{
				str	+= "일시점용기간 총일수를 입력하세요\n";
				alert(str);
				form.TOTAL_PERIOD.focus();
			}
		}
	

		if(str	== "")
		{
			return	true;
		}

		return	false;		
	}
	
	function goViewJibunMap(gubun){
		var form 	= document.form;
		var	str		= "";
		
		if(gubun == 'with'){
			if(getSelectedValue(form.BJ_CD).length	< 1){
				str	+= "점용지 법정동을 입력하세요.\n";
				alert(str);
				form.BJ_CD.focus();
			}
			else if(getSelectedValue(form.SPC_CD).length	< 1){
				str	+= "점용지 번지선택을 입력하세요\n";
				alert(str);
				form.SPC_CD.focus();
			}
			else if(form.BONBUN.value.length	< 1){
				str	+= "점용지 본번을 입력하세요\n";
				alert(str);
				form.BONBUN.focus();
			}
		}else if(gubun == 'road'){
			if(getSelectedValue(form.BJ_CD).length	< 1){
				str	+= "점용지 법정동을 입력하세요.\n";
				alert(str);
				form.BJ_CD.focus();
			}
			else if(getSelectedValue(form.SPC_CD).length	< 1){
				str	+= "점용지 번지선택을 입력하세요\n";
				alert(str);
				form.SPC_CD.focus();
			}
			else if(form.ROAD_BON.value.length	< 1){
				str	+= "도로주소 본번을 입력하세요\n";
				alert(str);
				form.ROAD_BON.focus();
			}
		}else if(gubun == 'price'){
			if(getSelectedValue(form.WITH_GU_CD).length	< 1)
			{
				str	+= "구를 선택하세요.\n";
				alert(str);
				form.WITH_GU_CD.focus();
			}
			else if(getSelectedValue(form.WITH_BJ_CD).length	< 1)
			{
				str	+= "법정동을 선택하세요.\n";
				alert(str);
				form.WITH_BJ_CD.focus();
			}
			else if(getSelectedValue(form.WITH_SPC_CD).length	< 1)
			{
				str	+= "번지를 선택하세요\n";
				alert(str);
				form.WITH_SPC_CD.focus();
			}
			else if(form.WITH_BONBUN.value.length	< 1)
			{
				str	+= "본번을 선택하세요\n";
				alert(str);
				form.WITH_BONBUN.focus();
			}
		}
		
		if(str	== "")
		{
			var bjCd = getSelectedValue(form.BJ_CD);
			var spcCd = getSelectedValue(form.SPC_CD);
			var sigungu = form.SIGUNGU.value;
			
			if(gubun == 'with'){
				var bonbunCd = form.BONBUN.value;
				var bubunCd = form.BUBUN.value;
			}else if(gubun == 'road'){
				var bonbunCd = form.ROAD_BON.value;
				var bubunCd = form.ROAD_BU.value;
			}else if(gubun == 'price'){
				sigungu = getSelectedValue(form.WITH_GU_CD);
				bjCd = getSelectedValue(form.WITH_BJ_CD);
				spcCd = getSelectedValue(form.WITH_SPC_CD);
				var bonbunCd = form.WITH_BONBUN.value;
				var bubunCd = form.WITH_BUBUN.value;
			}
			
			var pnu = '11'+sigungu+bjCd+spcCd+addZero(bonbunCd,4)+addZero(bubunCd,4);
			
			var url = '/jumyong/map/mini_map.do?PNU='+pnu+'&TYPE=view';
			cw=screen.availWidth; // 화면 너비
			ch=screen.availHeight; // 화면 높이
			
			sw=800;// 띄울 창의 너비
			sh=600;// 띄울 창의 높이
			
			ml=(cw-sw)/2;// 가운데 띄우기위한 창의 x위치
			mt=(ch-sh)/2;// 가운데 띄우기위한 창의 y위치

			var param = 'width='+sw+',height='+sh+',top='+mt+',left='+ml+',resizable=no, status=no, scrollbars=no, toolbar=no, menubar=no';
			window.open(url, "minimap", param);
			
			
		}else{
			return;
			
		}
	}
	
	
	function delWithAddr(obj){
		var list = document.getElementsByName("DEL_ID");
		var delId;
		for(var i = 0 ; i < list.length ; i++){
			if(list[i] == obj){
				delId = i;
				
			}
		}
		
		var tbody = document.getElementById("WITH_ADDR_LIST");
		tbody.deleteRow(delId);
	}

	function addWithAddr(pnu,text){
		
		var tbody = document.getElementById("WITH_ADDR_LIST");
		  
		var tr,td,Elem;
		
		tr = document.createElement('tr');
		td = document.createElement('td');
		td.setAttribute("height", "18px");
		td.setAttribute("width", "90%");
		
		//Elem = document.createElement("<input name='WITH_ADDR_PNU' type='hidden'>");
		var Elem1 = document.createElement("div");
		var innerElem1 = "<input name='WITH_ADDR_PNU' type='hidden' value='"+pnu+"'>";
		Elem1.innerHTML = innerElem1; 
		//Elem.value = pnu;
		td.appendChild(Elem1);
		
		//Elem = document.createElement("<input name='WITH_ADDR_TEXT' type='text' readonly>");
		var Elem2 = document.createElement("div");
		var innerElem2 = "<input name='WITH_ADDR_TEXT' type='text' readonly class='input_form1' style='border: 0; width: 100%;' value='"+text+"'>";
		Elem2.innerHTML=innerElem2;
		//	Elem.className = 'input_form1';
//		Elem.style.border = '0px';
//		Elem.style.width = '100%';
//		Elem.value = text;
		td.appendChild(Elem2);

		
		tr.appendChild(td);
		td = document.createElement('td');
		td.setAttribute("width", "10%");
		
		Elem = document.createElement('img');
		Elem.src = '/img/mapImg/close.gif';
		Elem.name = 'DEL_ID';
		Elem.alt = '삭제';
		Elem.style.width = '22px';
		Elem.style.height = '17px';
		Elem.style.border = '0px';
		Elem.style.CURSOR = 'pointer';
		Elem.style.verticalAlign = 'middle';
		Elem.onclick = function(){
			delWithAddr(this);
		};
		td.appendChild(Elem);
		tr.appendChild(td);
		tbody.appendChild(tr);
		
	}
	
	// 평균 인접지 공시지가
	function 	addWithAddrList()
	{
		
		var form 	= document.form;
		var	str		= "";
		
		if(getSelectedValue(form.WITH_GU_CD).length	< 1)
		{
			str	+= "구를 선택하세요.\n";
			alert(str);
			form.WITH_GU_CD.focus();
		}
		else if(getSelectedValue(form.WITH_BJ_CD).length	< 1)
		{
			str	+= "법정동을 선택하세요.\n";
			alert(str);
			form.WITH_BJ_CD.focus();
		}
		else if(getSelectedValue(form.WITH_SPC_CD).length	< 1)
		{
			str	+= "번지를 선택하세요\n";
			alert(str);
			form.WITH_SPC_CD.focus();
		}
		else if(form.WITH_BONBUN.value.length	< 1)
		{
			str	+= "본번을 선택하세요\n";
			alert(str);
			form.WITH_BONBUN.focus();
		}
		else{
			
			var pnu = '11'+getSelectedValue(form.WITH_GU_CD)+getSelectedValue(form.WITH_BJ_CD)
			+getSelectedValue(form.WITH_SPC_CD)+addZero(form.WITH_BONBUN.value,4)+addZero(form.WITH_BUBUN.value,4);
			
			var text = getSelectedText(form.WITH_GU_CD)+' '+getSelectedText(form.WITH_BJ_CD)+' ';
			if(form.WITH_SPC_CD.value == '2')text += '산 ';
			text += form.WITH_BONBUN.value;
			if(form.WITH_BUBUN.value.length > 0){
				text += '-'+form.WITH_BUBUN.value;
			}
			
			
			addWithAddr(pnu,text);
		}	
	}
	
	//********** BEGIN_현진_20120222
	function changeWithGuCd(obj){
		var guCd = getSelectedValue(obj);
		var param = "guCd="+guCd;
	    sendRequest("/get_bjdong_code.do", param, "GET", ResultChangeWithGuCd);
	}

	function	ResultChangeWithGuCd(obj)
	{
		select_innerHTML(document.getElementById("WITH_BJ_CD"),obj);
	}
		
	//********** END_현진_20120222
	
	// 2016.02.12 kny
function checkPARTLY_PERIOD(){																						
	if(form.PARTLY_PERIOD.value.length	< 1 || form.PARTLY_PERIOD.value == "일시 점용기간을 입력해 주세요. 예)09.06.06 ~ 09.09.09")
	{
		form.PARTLY_PERIOD.value = "";
	}
}
	
//]]>
</script>

<body onload="Init(); Init_UseType('${board.TYPE}'); ">
<table width="780" border="0" cellpadding="0" cellspacing="0">
<form id="form" name="form" method="post">
<input type="hidden" id="ADMIN_NO" name="ADMIN_NO" value="${ADMIN_NO}">
<input type="hidden" id="PURPOSE_CD" name="PURPOSE_CD" value="${board.PURPOSE_CD}">
<input type="hidden" id="SIGUNGU" name="SIGUNGU" value="${board.SIGUNGU}">

	<tr>
		<td align="left" class="contborder_purple">

		<div id="tabcontents">
			<div class="tabcontent" id="tab1">
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
				  <tr>
					<td><table id="table1" width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
						<tr>
						  <td width="14%" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">점용종류</td>
						  <td width="36%" bgcolor="eaeaea" class="table_bl_left"><select id="TYPE" name="TYPE" class="essential" style="width:70px" OnChange="Select_UseType(this);">
							${use_type}
					      </select></td>
						  <td width="14%" align="center" bgcolor="e5eff8" class="sub_table_b">점용구분</td>
						  <td width="36%" bgcolor="eaeaea" class="table_bl_left"><select id="SECTION" name="SECTION" class="essential" style="width:70px" OnChange="Select_UseSection(this);">
							${occupancy_type}
						  </select>
						  </td>
						</tr>
						<tr>
						  <td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">소유자</td>
						  <td bgcolor="eaeaea" class="table_bl_left"><select id="OWNER_SET" name="OWNER_SET" class="essential" style="width:70px">
							${use_owner_Group}
						  </select></td>
						  <td align="center" bgcolor="e5eff8" class="sub_table_b">세입구분</td>
						  <td bgcolor="eaeaea" class="table_bl_left"><select id="TAX_SET" name="TAX_SET" class="essential" style="width:70px">
							${taxation_section}
						  </select></td>
						</tr>
						<tr>
						   <td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
						  <td bgcolor="eaeaea" class="table_bl_left">
							  <table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
								<tr>
								  <td><input id="MUL_POST" name="MUL_POST" type="text" class="essential" style="width:50px" value="${board.MUL_POST}" maxlength="6" onblur="javascript:isPostNum(this);"></td>
								  <td>
<!-- 점용지 도로명주소 추가 (파라메터 수정) #mr-->								  
								  	<!-- <a href="javascript:openZipcodePopup_new('form.MUL_POST','','','','','','','','','');">-->
								  	<a href="javascript:openZipcodePopup_new('form.MUL_POST', '', 'form.JYADDR_NEW', '', '', '', '','','', '');">
<!-- #mr -->								  	
								  		<img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0">
								  	</a>
								  </td>
								</tr>
							  </table>
						  </td>
						  <td align="center" bgcolor="e5eff8" class="sub_table_b">건물(명) 정보 </td>
						  <td bgcolor="eaeaea" class="table_bl_left"><input id="BD_NM" name="BD_NM" type="text" class="input_form1" style="width:120px" value="${board.BD_NM}">
							<input id="BD_DONG" name="BD_DONG" type="text" class="input_form1" style="width:30px" value="${board.BD_DONG}" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);">
							동 <input id="BD_HO" name="BD_HO" type="text" class="input_form1" style="width:30px" value="${board.BD_HO}" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);">
							호 </td>
						</tr>
<!-- 점용지 도로명주소 추가 #mr-->
					<tr>
						<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">점용지도로명주소</td>
						<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
							<input id="JYADDR_NEW" name="JYADDR_NEW" type="text" class="essential" style="width:250px"  value="${board.JYADDR_NEW}" onClick="javascript:openZipcodePopup_new('form.MUL_POST', '', 'form.JYADDR_NEW', '', '', '', '','','', '');" readonly>
							<input id="JYADDR_BON" name="JYADDR_BON" type="text" class="essential" style="width:25px" value="${board.JYADDR_BON}"/>
							-<input id="JYADDR_BU" name="JYADDR_BU" type="text" class="essential" style="width:25px" value="${board.JYADDR_BU}"/>
							<br><font color="blue">*수정 시, 팝업창에서 도로명 주소로 검색 후 해당 도로명 주소를 선택</font>
						</td>
					</tr>					
<!-- #mr -->						
						<tr>
						  <td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">점용지지번</td>
						  <td colspan="3" bgcolor="eaeaea" class="table_bl_left">
						  ${board.SIGUNGU_NM}&nbsp;
		                  <select id="BJ_CD" name="BJ_CD" class="essential" style="width:80px">
		                  	${bjdong_code}
                          </select> 
		                  <select id="HJ_CD" name="HJ_CD" class="essential" style="width:80px">
			            	${hjdong_code}
			              </select>
						  <select id="SPC_CD" name="SPC_CD" class="essential" style="width:75px">
			            	${mul_spc_cd}
			              </select>
						  <input id="BONBUN" name="BONBUN" value="${board.BONBUN}" type="text" class="essential" style="width:40px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);" maxlength="4">
						  - <input id="BUBUN" name="BUBUN" value="${board.BUBUN}" type="text" class="input_form1" style="width:40px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);" maxlength="4">
						  번지 <input id="TONG" name="TONG" value="${board.TONG}" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);" maxlength="2">
						  통 <input id="BAN" name="BAN" value="${board.BAN}" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);" maxlength="2">
						  반
						  <img src="/img/loca_icon.gif" alt="위치확인" id="LocReg" width="64" height="18" border="0" onClick="javascript:goViewJibunMap('with');" style="vertical-align:middle;CURSOR:pointer;"> 
						  </td>
						</tr>
						
		                <tr>
		                  <td align="center" bgcolor="e5eff8" class="sub_table_b">도로(하천)지번</td>
		                  <td bgcolor="eaeaea" class="table_bl_left">
								<input id="ROAD_ADDR" name="ROAD_ADDR" type="text" class="input_form1" style="width:70px" value="${board.ROAD_ADDR}" maxlength="12">
								<input id="ROAD_BON" name="ROAD_BON" type="text" class="essential" style="width:30px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);" maxlength="4" value="${board.ROAD_BON}" >
							  - <input id="ROAD_BU" name="ROAD_BU" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);" maxlength="4" value="${board.ROAD_BU}" >
							  <img src="/img/loca_icon.gif" alt="위치확인" id="LocReg" width="64" height="18" border="0" onClick="javascript:goViewJibunMap('road');" style="vertical-align:middle;CURSOR:pointer;">
		                  </td>
		       			  
						  <td width="100" height="26" align="center" bgcolor="e5eff8" class="">
						  	<input id="USERTYPENAME" name="USERTYPENAME" type="text" style="width:95px" class="viewcol" value="주차면수">
						  </td>
						  	                      			  
		       			  <td colspan="0" bgcolor="F6F6F6" class="table_bl_left">
			       			  <span id="UseType1" style="display:none">
				              	<input id="PARKING_NUM" name="PARKING_NUM" type="text" class="input_form1" style="width:40px" value="${board.PARKING_NUM}" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);" maxlength="3"> 면
			                  </span> 
			       			  <span id="UseType2" style="display:none">
				              	<input id="RIVER_NM" name="RIVER_NM" type="text" class="essential" style="width:100px" value="${board.RIVER_NM}">
			                  </span>
			                  <span id="UseType3" style="display:none;">
								<input id="RIVER_RANK" name="RIVER_RANK" type="text" class="essential" style="width:100px" value="${board.RIVER_RANK}" maxlength="3">
							  </span>
		                  </td>
		                </tr>
		                <tr>
						  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b" colspan="1">공시지가<br>적용지번</td>
						  <td bgcolor="eaeaea" class="table_bl_left">
							  <select id="WITH_GU_CD" name="WITH_GU_CD" class="input_form1" style="width:80px" onchange="changeWithGuCd(this);">
						      	${sigungu_code}
						      </select>
							  <select id="WITH_BJ_CD" name="WITH_BJ_CD" class="input_form1" style="width:80px">
						      	${bjdong_code}
						      </select>
					          <select id="WITH_SPC_CD" name="WITH_SPC_CD" class="input_form1" style="width:75px">
					          	${mul_spc_cd}
					          </select>
					          <p style="font-size: 8px"></p>
					          <input id="WITH_BONBUN" name="WITH_BONBUN" value="" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);" maxlength="4">
							  - <input id="WITH_BUBUN" name="WITH_BUBUN" value="" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);" maxlength="4">
							  번지
							  <img src="/img/add_icon.gif" alt="추가" width="56" height="18" border="0" onclick="javascript:addWithAddrList();" style="CURSOR: Hand;vertical-align: middle;">
							  <img src="/img/loca_icon.gif" alt="위치확인" id="LocReg" width="64" height="18" border="0" onClick="javascript:goViewJibunMap('price');" style="vertical-align: middle;CURSOR:pointer;">
						  </td>						  
						  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b" colspan="1">공시지가<br>적용지번<br>목록</td>
						  <td bgcolor="eaeaea" class="table_bl_left">
							  <div style="height: 60px;overflow-y:scroll;">
							  <table width="90%">
							  <tbody id="WITH_ADDR_LIST" >
							  </tbody>
							  </table>
							  </div>
						  </td>						  
						</tr>
						<tr>
						  <td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">점용목적</td>
						  <td colspan="3" bgcolor="eaeaea" ><table width="100%" border="0" cellpadding="0" cellspacing="0">
							<iframe id="IFRM_PurposeCode" scrolling="no" frameborder="0" framespacing="0" width="100%" height="25" src="/jsp/common/purposeCode/purposeCode.jsp?SectionCode=${board.TYPE}&PURPOSE_CD=${board.PURPOSE_CD}&essential=1"></iframe>
						  </table></td>
					    </tr>
						<tr>
						  	<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">점용기간</td>
						  	<td id="MUL" bgcolor="eaeaea" class="table_bl_left" colspan="3">
						  		<div id="MUL_DIV">
									<c:if test="${board.SECTION == '2'}">	
										<table id='MUL_TABLE' border='0' cellpadding='0' cellspacing='0' class='sub_stan'>
											<tr id='MulDateSection'>
												<td id='UseSection' style='display:block'>
													<input id='PARTLY_PERIOD' maxlength='100' id='PARTLY_PERIOD' name='PARTLY_PERIOD' type='text' class='essential' style='width:300px' value='${board.PARTLY_PERIOD}' onclick='checkPARTLY_PERIOD();'">
													&nbsp;&nbsp;총<input id='TOTAL_PERIOD' name='TOTAL_PERIOD' maxlength='5' type='text' class='essential' style='width:30px' value='${board.TOTAL_PERIOD}' style='ime-mode:disabled' onKeyDown='nr_num_int(this);' onKeyUp='nr_num_int(this);' onKeyPress='nr_num_int(this);'>일
												</td>
												<td>&nbsp;&nbsp;(만료일:
													<input id='DUE_DATE' name='DUE_DATE' type='text' class='input_form1' value="${board.DUE_DATE}" style="width: 70px;" readonly>
													<a><img onclick="popUpCalendar(this, document.getElementById('DUE_DATE'), 'yyyymmdd')" src='/img/calendar_icon.gif' width='16' height='16' border='0' align='absmiddle' style='vertical-align:middle;CURSOR: pointer;'></a>)
												</td>
											</tr>
										</table>
						            </c:if>
						  			<c:if test="${board.SECTION != '2'}">
							  			<table id="MUL_TABLE" border="0" cellpadding="0" cellspacing="0" class="sub_stan">
											<tr id="MulDateSection">
												<td id="UseSection" style="display:block">
												  	<input id="MUL_FROMDATE" name="MUL_FROMDATE" type="text" class="essential" style="width:70px" value="${board.MUL_FROMDATE}" readonly><a><img onclick="popUpCalendar(this, document.getElementById('MUL_FROMDATE'), 'yyyymmdd')" src="/img/calendar_icon.gif" width="19" height="16" border="0" align="absmiddle" style="vertical-align:middle;CURSOR: pointer;"></a>
												  	 ~ <input id="MUL_TODATE" name="MUL_TODATE" type="text" class="essential" style="width:70px" value="${board.MUL_TODATE}"  readonly><a><img onclick="popUpCalendar(this, document.getElementById('MUL_TODATE'), 'yyyymmdd')" src="/img/calendar_icon.gif" width="19" height="16" border="0" align="absmiddle" style="vertical-align:middle;CURSOR: pointer;"></a>
												</td>
				  						    </tr>
										</table>
						            </c:if>
								</div>
							</td>						
						</tr>
						<tr>
						<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">점용면적</td>
					  	<td height="26px" bgcolor="eaeaea" class="table_bl_left" id="area" colspan="3">
							<input id="AREA_SIZE" name="AREA_SIZE" type="text" class="essential" style="width:50px" value="${board.AREA_SIZE}" style="ime-mode:disabled" onKeyDown="nr_num_float(this);" onKeyUp="nr_num_float(this);" onKeyPress="nr_num_float(this);" maxlength="17"> m / ㎡ / 개
						</td>
						</tr>
						<tr>
							<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">지분율</td>
					  		<td bgcolor="eaeaea" class="table_bl_left">
								<input id="PERCENT_RATE" name="PERCENT_RATE" type="text" class="input_form1" style="width:50px;text-align:right" value="${board.PERCENT_RATE}" onKeyDown="nr_num_float(this);" onKeyUp="nr_num_float(this);" onKeyPress="nr_num_float(this);" maxlength="6">%
							</td>
					  		<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">지분율 사유</td>
					  		<td bgcolor="eaeaea" class="table_bl_left">
					  			<input id="PERCENT_REASON" name="PERCENT_REASON" type="text" class="input_form1" style="width:250px" value="${board.PERCENT_REASON}" maxlength="200">
							</td>
						</tr>
						<tr>
							<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">감면율</td>
					  		<td bgcolor="eaeaea" class="table_bl_left">
								<input id="REDUCTION_RATE" name="REDUCTION_RATE" type="text" class="input_form1" style="width:50px;text-align:right" value="${board.REDUCTION_RATE}" onKeyDown="nr_num_float(this);" onKeyUp="nr_num_float(this);" onKeyPress="nr_num_float(this);" maxlength="9">%
							</td>
					  		<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">감면율 사유</td>
					  		<td bgcolor="eaeaea" class="table_bl_left">
					  			<input id="REDUCTION_REASON" name="REDUCTION_REASON" type="text" class="input_form1" style="width:250px" value="${board.REDUCTION_REASON}" maxlength="200">
							</td>
						</tr>
						
						<tr>
		        			<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">비고</td>
      						<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
       							<table width="100%" border="0" cellpadding="0" cellspacing="0" class="sub_stan">
        							<textarea id="REFERENCE" name="REFERENCE" onkeyup="displayBytes(500, 'REFERENCE');" type="text" class="input_form1" style="width:98%">${board.REFERENCE}</textarea>
       							</table>
      						</td>
        				</tr>
        				
					    <tr>
						  <td height="34" colspan="4" align="left" bgcolor="#FFFFFF" class=""><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
							<tr>
							  <td><span class="sub_stan_blue">* 공사(굴착) 정보</span></td>
							</tr>
						  </table></td>
					    </tr>
					    
					    <tr>
						  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">공사기간 </td>
						  <td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
							<tr>
							  <td><input id="WORK_FROMDATE" name="WORK_FROMDATE" value="${board.WORK_FROMDATE}" type="text" class="input_form1" style="width:65px" readonly></td>
							  <td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('WORK_FROMDATE'), 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
							  <td width="16" align="center">~</td>
							  <td><input id="WORK_TODATE" name="WORK_TODATE" value="${board.WORK_TODATE}" type="text" class="input_form1" style="width:65px" readonly></td>
							  <td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('WORK_TODATE'), 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
							</tr>
						  </table></td>
					    </tr>
					    
						<tr>
						  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">공사내용</td>
							<td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table width="100%" border="0" cellpadding="0" cellspacing="0" class="sub_stan">
								<input id="EXE_INFO" name="EXE_INFO" type="text" class="input_form1" style="width:98%" value="${board.EXE_INFO}">
							</table></td>
					    </tr>
						
					</table></td>
				  </tr>
				  <tr>
					<td height="40" align="right">
						<img src="/img/can_icon.gif" alt="취소" width="56" height="18" border="0" onclick="javascript:Cancel();">
						<img src="/img/save_icon2.gif" alt="저장" width="56" height="18" border="0" onclick="javascript:ModifyPrc();">
		
				</div>
			</div>
		
			</td>
		  </tr>
		</table></td>
	</tr>

</table>
</body>
</html>
