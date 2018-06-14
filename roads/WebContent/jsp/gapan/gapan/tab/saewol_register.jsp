<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/loginCheck.jsp" %>
<%@ include file="/jsp/common/include.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />

<title>::::: 서울시 도로점용관리시스템 :::::</title>
<style type="text/css">
<!--
body {
	margin: 0px;
	background-image: url/img/left_back.gif);
}
-->
</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
</head>
<script language="javascript" src="/js/PopupCalendar.js"></script>
<script language='JavaScript' src='/js/Check_inputbox.js'></script>
<script language="javascript" src="/js/Ajax_request.js"></script>
<script language='JavaScript' src='/jsp/gapan/gapan/tab/info_register.js'></script>

<script type="text/javascript">
//<![CDATA[
           
       	function	RegisterPrc()
	{
		var	result	= DataCheck();
		//var result	=	"true";

		if(result	==	false)
			return false;
		
		var form = document.form;
		
		//form.PURPOSE_CD.value	= IFRM_PurposeCode.document.getElementById("PURPOSE_CD").value;

		/*alert("OWNER_IMG=== " + document.getElementById("OWNER_IMG").value);
		alert("PARTN_IMG=== " + document.getElementById("PARTN_IMG").value);
		alert("SHOP_IMG=== " + document.getElementById("SHOP_IMG").value);
		*/

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
		
		var PNU = '${SIDO}'+'${SIGU_CD}'+BJ_CD+SPC_CD+winPosBONBUN_4LENGTH+winPosBUBUN_4LENGTH;	
		
		form.WITH_PNU.value = PNU;	//PNU 파라메터에 값  세팅

		//수정끝

		//김권태 . 2009.11.10 수정
		// 주류체크 및 가스체크
		// 주류 체크
		
		if(${board.PURPOSE_CD != '710'}){
			
			if(form.LIQUOR_SL.checked == true){
				form.LIQUOR_SL.value = "1";
			}else{
				form.LIQUOR_SL.value = "0";
			}
			// 가스 체크	

			if(form.LPGAS_US.checked == true){
				form.LPGAS_US.value = "1";
			}else{
				form.LPGAS_US.value = "0";
			}
		}
			//수정 끝
		
		form.action = "saewol_registerprc.do";
		form.submit();

		
	
	}
    
	function file_browse1()
	{
		document.form.OWNER_IMG.click();
		alert(document.form.OWNER_IMG.value);
		//document.form.OWNER_TEXT1.value = document.form.OWNER_IMG.value;
	}
	
	function file_browse2()
	{
		document.form.PARTN_IMG.click();
		alert(document.form.PARTN_IMG.value);
		//document.form.PARTN_TEXT1.value = document.form.PARTN_IMG.value;
	}
	
	//클릭시 신분증 확인 체크 값 세팅
	function click_idchk(obj)
	{
		if(obj.checked == true)
		{
			obj.value = "1";
		}
		else
		{
			obj.value = "0";
		}
	}
	
	//파일업로드 찾아보기 버튼 변경
	function ChangeImg()
	{
	//     var fileName = document.sender.file.value; //일단 주소부분은 주석처리
		newImg = new Image(); //이미지 객체 생성
		imgFileSize = ""; 
		newImg.src = "";
		maxFileSize = 150*200;
		newImg.src = document.getElementById("file1").value
		var imgpath = document.form.OWNER_IMG.value;
		document.all["tblview"].style.backgroundImage="url(" + imgpath + ")";
		document.all["tblview"].style.backgroundRepeat="no-repeat";
		imgFileSize = newImg.fileSize;
	}
	
	//파일업로드 찾아보기 버튼 변경
	function ChangeImg2()
	{
	//  var fileName = document.sender.file.value; //일단 주소부분은 주석처리
		newImg = new Image(); //이미지 객체 생성
		imgFileSize = ""; 
		newImg.src = "";
		maxFileSize = 150*200;
		newImg.src = document.getElementById("file2").value
		var imgpath = document.form.PARTN_IMG.value;
		document.all["tblview2"].style.backgroundImage="url(" + imgpath + ")";
		document.all["tblview2"].style.backgroundRepeat="no-repeat";
		imgFileSize = newImg.fileSize;
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

	//라디오 버튼 및 체크 버튼의 테두리 없애는 함수
	function RemoveOutline()
	{
		for(i=0;i<document.getElementsByTagName("input").length;i++)
		{
			objinput = document.getElementsByTagName("input");
			if(objinput[i].type == "radio" || objinput[i].type == "checkbox")
			{
				objinput[i].style.border = 0;
			}
		}
	}
	
	
	function jumyongZibun(SIDO, SIGU_CD){
		/*
		alert(SIDO);
		alert(SIGU_CD);
		alert(document.form.BJ_CD.value);
		alert(document.form.SPC_CD.value);
		alert(document.form.BONBUN.value);
		alert(document.form.BUBUN.value);
		*/
		var form 	= document.form;
		var	str		= "";
		
		var tabs = document.getElementById('tabmenu');
		var tab = tabs.getElementsByTagName('a'); // 탭 요소
		var contents = document.getElementById('tabcontents');
		var content = getElementsByClassName('tabcontent',contents); // 컨텐츠 요소 class
		
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
		else if(form.OWNER_NAME.value.length	< 1)
		{
			str	+= "운영자명을 입력하세요\n";
			alert(str);
			tabDisplay(tab,content,1);
			form.OWNER_NAME.focus();
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
		
//		alert(ADDR);
//		alert(form.OWNER_NAME.value);
//		alert(PNU);

		var url = "/map/miniMap.do?PNU="+PNU+"&ADDR="+ADDR+"&FLAG="+FLAG+"&OWNER_NAME="+form.OWNER_NAME.value;
//		alert(url);
		
		cw=screen.availWidth; 		// ?­¸? ³?º?
		ch=screen.availHeight; 		// ?­¸? ³???
		
		sw=850;						// ¶?¿? ???? ³?º?
		sh=780;						// ¶?¿? ???? ³???
		
		ml=(cw-sw)/2;				// °¡¿??? ¶?¿?±??§?? ???? x?§?¡
		mt=(ch-sh)/2;				// °¡¿??? ¶?¿?±??§?? ???? y?§?¡

  		var param = 'width='+sw+',height='+sh+',top='+mt+',left='+ml+',resizable=no, status=no, scrollbars=no, toolbar=no, menubar=no';

		window.open(url, "minimap", param);
	}
	
	//###################################################################################################################
	function attach(obj) {
		
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
	}
	
	function get_file_check(filename)
	{
		
		//먼저 확장자 체크부터 한다.
		if(false == check_fileExt(filename))
			return 0;
		
		tmpfilesize = getFileSize(filename);

		if(tmpfilesize > MaxSize*1024000)
		{
			alert(MaxSize+"MB이상 파일은 첨부할 수 없습니다.");
			return 0;
		}
		
		TotalFileSize = TotalFileSize + parseInt(tmpfilesize);

		// 페이지별로 지정된 max용량 비교
		if(TotalFileSize > MaxSize*1024000)
		{
			alert("첨부파일의 총용량은 "+MaxSize+"MB이상을 초과할 수 없습니다.");
			TotalFileSize = TotalFileSize - parseInt(tmpfilesize);
			document.getElementById('ATTACH_SIZE').value = "";
			document.getElementById('ATTACH_FILE').value ="";
			alert("aaaa");
			return 0;
		}

		// 전체 시스템에 지정된 max용량 비교
		if(TotalFileSize > MaxNormalSize)
		{
			alert("첨부파일의 총용량은 "+MaxNormalSize+"MB이상을 초과할 수 없습니다.");
			document.getElementById('ATTACH_SIZE').value = "";
			document.getElementById('ATTACH_FILE').value ="";
			alert("aaaa");
			TotalFileSize = TotalFileSize - parseInt(tmpfilesize);
			return 0;
		}	
		
		return tmpfilesize;
	}
	
	//소수점 이하 처리 함수 ;소수점 둘째자리까지 표현 
	function CutDecimalPoint(intTarget) {
        var intResult = 0;
        var strTarget = String(intTarget).split('.');
        if(strTarget[1]!=null && strTarget[1].length > 2) {
            strTarget[1] = strTarget[1].slice(0, 2);
        }else{
            strTarget[1] = "00";
        }
        intResult = Number(strTarget[0]+'.'+strTarget[1]);
        return intResult;
    } 	
    
    function getNoDirFileName(filename)
	{
		var path = filename.split("\\");
		return path[path.length - 1];		
	}
	
	/**
	* 첨부파일 확장자 체크
	*/
	function check_fileExt(filename)
	{
		var index = filename.lastIndexOf('.');
		fileExpan = filename.substring(parseInt(index)+1 , filename.length );
		fileExpan = fileExpan.toLowerCase();

		//||fileExpan =="hwp"||fileExpan =="doc"||fileExpan =="xls"||fileExpan =="txt"||fileExpan =="ppt"||fileExpan =="zip"||fileExpan =="wmv"||fileExpan =="mpg"||fileExpan =="pdf"
		if(fileExpan =="jpg"||fileExpan =="gif"||fileExpan =="bmp"){
			return true;
		}
		else
		{
//			document.getElementById("file_item1").innerHTML = '<input type="file" name="file1" id="file1" onchange="attach(this)" size="100" >';
			alert("이미지 파일이 아니면 첨부할수 없습니다.\n다시 선택하여 주십시오.");
			return false;
		}
	
	}
	
	/**
	* 첨부파일 사이즈 체크
	*/
	function getFileSize(filename)
	{
		//alert(filename);
		if(navigator.userAgent.indexOf('MSIE') > 0 && navigator.appVersion.indexOf('MSIE 7.') > 0)
		{
			//alert('11');
		 　　// MSIE 7인 경우
		  	var fso = new ActiveXObject("Scripting.FileSystemObject");
		  	//alert('22');
		  	var f = fso.GetFile(filename);
		  	var fileSize = f.size;
		  	f = null;
		  	fso = null; 
		 	return fileSize;
		}		
		else
		{
			var fso = new ActiveXObject("Scripting.FileSystemObject");
			var f = fso.GetFile(filename);
			var fileSize = f.size;
			f = null;
			fso = null; 
			
			return fileSize;　
		 　// MSIE 7 이하인 경우
		　/*　var img = new Image();
			img.dynsrc = filename;
			tmpfilesize = img.fileSize;	
			return tmpfilesize;
		*/
		}
	}		
	//###################################################################################################################
	
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
        
    }

	function	SelectedFTTYP()
	{
		var	FT_TYP	= document.getElementById("FT_TYP").value;
		
		var	param	= "FT_TYP="+FT_TYP;

		sendRequest("/gapan/jumyonginfo/get_ft_sel.do", param, "GET", ResultFTTYP);
	}

	function	SelectedGPTYP()
	{
		var	GP_TYP	= document.getElementById("GP_TYP").value;
		
		var	param	= "GP_TYP="+GP_TYP;
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
	
//]]>
</script>


<body>

<form name="form" method="post" enctype="multipart/form-data">
<input type="hidden" name="UserType">
<input type="hidden" name="UserSection">
<input type="hidden" name="PURPOSE_CD" value="${PURPOSE_CD}">
<input type="hidden" name="MIN_CHECK" value="${MIN_CHECK}">
<input type="hidden" name="MIN_PROCESS" value="${MIN_PROCESS}">
<input type="hidden" name="GIGAN1" value="${GIGAN1}">
<input type="hidden" name="GIGAN2" value="${GIGAN2}">
<input type="hidden" name="MIN_NAME" value="${MIN_NAME}">
<input type="hidden" name="MIN_REQNO" value="${MIN_REQNO}">
<input type="hidden" name="NOWTAB" value="0">
<input type="hidden" name="X_COORD" value="${X_COORD}">
<input type="hidden" name="Y_COORD" value="${Y_COORD}" >
<input type="hidden" name="WITH_PNU" value="${WITH_PNU}">
<input name="ATTACH_FILE" id="ATTACH_FILE" type="hidden" class="input_form1" style="width:140px" >
<input name="ATTACH_SIZE" id="ATTACH_SIZE" type="hidden" class="input_form1" style="width:45px" >

<table width="800" border="0" cellpadding="0" cellspacing="0">
<tr>
	<td align="left">
		<table width="780" border="0" cellspacing="0" cellpadding="0">
   		<tr>
         		<td height="22" background="/img/tab_line_purple.gif"><table border="0" cellspacing="0" cellpadding="0">
				<tr>
				<ul id="tabmenu">
					<td width="111"><a><img src="/img/sub_petition_title9_on.gif" alt="민원정보" width="110" height="22" border="0" onclick="Init();" style="CURSOR: Hand;"></a></td>
					<td width="111"><a><img src="/img/sub_gapan_title4_on.gif" alt="운영자 정보" width="110" height="22" border="0" onclick="Init(); " style="CURSOR: Hand;"></a></td>
					<td width="111"><a><img src="/img/sub_gapan_title5_off.gif" alt="동업자 정보" width="110" height="22" border="0" onclick="Init();" style="CURSOR: Hand;"></a></td>
					<td width="111"><a><img src="/img/sub_petition_title10_off.gif" alt="시설/운영 정보" width="110" height="22" border="0" onclick="Init();" style="CURSOR: Hand;"></a></td>
				</ul>
               </tr>
			</table></td>
		</tr>
		
		<tr>
            <td align="left" class="contborder_purple">
	
	
		<div id="tabcontents">
		
			<div class="tabcontent" id="tab1">
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
					<td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
				  	<tr>
						<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">접수번호</td>
						<td width="37%" bgcolor="eaeaea" class="table_bl_left"><input name="REQ_NO_MIN" type="text" class="input_form1" style="width:120px" value="${REQ_NO_MIN}" maxlength="20" readonly></td>
						<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">민원구분</td>
						<td bgcolor="eaeaea" class="table_bl_left"><input name="GUBUN_MIN" type="text" class="input_form1" style="width:120px" value="${GUBUN_MIN}" maxlength="25"></td>
				  	</tr>
				  	<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">접수일자</td>
						<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					  	<tr>
							<td><input name="REQ_DATE_MIN" type="text" class="input_form1" style="width:120px" value="${REQ_DATE_MIN}" readonly></td>
							<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, REQ_DATE_MIN, 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
					  	</tr>
						</table></td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">처리예정일자</td>
						<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					  	<tr>
							<td><input name="PREDATE_MIN" type="text" class="input_form1" style="width:120px" value="${PREDATE_MIN}" readonly></td>
							<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, PREDATE_MIN, 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
					  	</tr>
						</table></td>
				  	</tr>
				  	<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">접수부서</td>
						<td bgcolor="eaeaea" class="table_bl_left"><input name="REQ_DEP_MIN" type="text" class="input_form1" style="width:120px" value="${REQ_DEP_MIN}" maxlength="10"></td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">담당부서</td>
						<td bgcolor="eaeaea" class="table_bl_left"><input name="MANAGE_DEP_MIN" type="text" class="input_form1" style="width:120px" value="${MANAGE_DEP_MIN}" maxlength="10"></td>
				  	</tr>
					<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">접수자명</td>
						<td bgcolor="eaeaea" class="table_bl_left"><input name="REQ_NM_MIN" type="text" class="input_form1" style="width:120px" value="${REQ_NM_MIN}" maxlength="10"></td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">담당자명</td>
						<td bgcolor="eaeaea" class="table_bl_left"><input name="MANAGER_MIN" type="text" class="input_form1" style="width:120px" value="${MANAGER_MIN}" maxlength="10"></td>
					</tr>
					<tr>
						<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">민원요지</td>
						<td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table width="100%" border="0" cellpadding="0" cellspacing="0" class="sub_stan">
							<input name="NOTES_MIN" type="text" class="input_form1" style="width:98%" value="${NOTES_MIN}" maxlength="100">
						</table></td>
					</tr>
					<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">대리인</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input name="AGENT_NM_MIN" type="text" class="input_form1" style="width:120px"  value="${AGENT_NM_MIN}">
						</td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">대리인 연락처</td>
						<td bgcolor="eaeaea" class="table_bl_left"><input name="AGENT_TEL_MIN" type="text" class="input_form1" style="width:120px" value="${AGENT_TEL_MIN}"></td>
					</tr>
				   <tr>
					  	<td height="34" colspan="4" align="left" bgcolor="#FFFFFF" class=""><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
							<tr>
								<td width="75" align="right"><img src="/img/0811_t1.gif" width="58" height="21" border="0"></td>
							</tr>
					  	</table></td>
				    </tr>
					<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">민원인명</td>
						<td bgcolor="eaeaea" class="table_bl_left"><input name="NAME_MIN" type="text" class="input_form1" style="width:120px" value="${NAME_MIN}"></td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">민원인 주민번호</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input name="min_ssn1" type="text" class="essential" style="width:40px; ime-mode:disabled" value="${min_ssn1}" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, min_ssn2, 6);" maxlength="6">
							 - <input name="min_ssn2" type="text" class="essential" style="width:45px; ime-mode:disabled" value="${min_ssn2}" onKeyPress="nr_num_int(this);" maxlength="7"></td>
						</td>
					</tr>
				 	<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">민원인 우편번호</td>
						<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
							<tr>
							  	<td><input name="POST_MIN" type="text" class="input_form1" style="width:50px" value="${POST_MIN}" readonly></td>
							  	<td><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0" onclick="javascript:openZipcodePopup('form.POST_MIN', 'form.ADDR1_MIN');" style="CURSOR:Hand"></td>
							</tr>
						</table></td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">민원인 주소</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input name="ADDR1_MIN" type="text" class="input_form1" style="width:250px" value="${ADDR1_MIN}" readonly>
							<input name="ADDR2_MIN" type="text" class="input_form1" style="width:250px" value="${ADDR2_MIN}">
						</td>
				  	</tr>
				  	<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">민원인 전화</td>
						<td bgcolor="eaeaea" class="table_bl_left"><input name="TEL_MIN" type="text" class="input_form1" style="width:120px" value="${TEL_MIN}"></td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">민원인 휴대폰</td>
						<td bgcolor="eaeaea" class="table_bl_left"><input name="HP_MIN" type="text" class="input_form1" style="width:120px" value="${HP_MIN}"></td>
				  	</tr>
                  	</table></td>
                </tr>
				</table>
			</div>
			<div class="tabcontent" style="display:none" id="tab2">
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
	                <tr>
	                  	<td>
	                  	<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
										  	<tr>
							<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">운영자명</td>
							<td width="37%" bgcolor="eaeaea" class="table_bl_left">
								<input name="OWNER_NAME" type="text" class="essential" style="width:150px" value="${NAME}" maxlength="35">
								<input name="OWNER_IDCHK" type="checkbox" value="1" checked onclick="javascript:click_idchk(this);">신분증 확인
							</td>
							<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b" rowspan="3">
								<table>
									<tr><td>운영자 사진</td></tr>
									<tr>
										<td>
											<br><br>
											<!-- span onclick="javascript:document.getElementById('file1').click();" style="overflow:hidden; background-repeat:no-repeat; cursor: pointer;"-->
											<span style="overflow:hidden; background-repeat:no-repeat; cursor: pointer;">
												<!-- img src="/img/file_icon.gif" align="absmiddle" alt="파일첨부하기"-->
												<!-- input type='file' id="file1" name='OWNER_IMG' style="width:0;height:5;filter:alpha(opacity=0); CURSOR:hand;" onchange='ChangeImg(); attach(this);'-->
											</span>
											
										</td>
									</tr>
								</table>
							</td>
							<td bgcolor="eaeaea" class="table_bl_left" rowspan="3" align="center">
								<table>
									<tr>
										<td><input type='file' id="file1" name='OWNER_IMG' 	style="width:10;" onchange='ChangeImg(); attach(this);'></td>
									</tr>
									<tr>
										<td width=100 height=130 id="tblview" style="background-image:url(1.jpg); background-repeat:no-repeat; background-attachment:scroll; background-position:50% 50%;"></td>
									</tr>
								</table>
							</td>
						</tr>
						<tr>
							<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">주민등록번호</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<input name="OWNER_SSN1" type="text" class="essential" style="width:40px; ime-mode:disabled" value="${OWNER_SSN1}" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, OWNER_SSN2, 6);" maxlength="6">
							  - <input name="OWNER_SSN2" type="text" class="essential" style="width:45px; ime-mode:disabled" value="${OWNER_SSN2}" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);" maxlength="7">
							</td>
					  	</tr>
					  	<tr>
							<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">성별(나이)</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<input name="OWNER_GENDER" type="radio" value="1" checked>남
								<input name="OWNER_GENDER" type="radio" value="2" >여
								&nbsp;( <input name="OWNER_AGE" class="input_form1" type="text" style="width:20px" maxlength="3" value="${OWNER_AGE}" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);"> 세)
							</td>
					  	</tr>
					  	<tr>
							<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">전화번호</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<input name="OWNER_TEL1" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, OWNER_TEL2, 3);" maxlength="3"> - 
								<input name="OWNER_TEL2" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, OWNER_TEL3, 4);" maxlength="4"> - 
								<input name="OWNER_TEL3" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, OWNER_HP1, 4);" maxlength="4">
							</td>
							<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">휴대전화</td>
							<td bgcolor="eaeaea" class="table_bl_left" colspan="3">
								<input name="OWNER_HP1" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, OWNER_HP2, 3);" maxlength="3"> - 
								<input name="OWNER_HP2" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, OWNER_HP3, 4);" maxlength="4"> - 
								<input name="OWNER_HP3" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);" maxlength="4">
							</td>
					  	</tr>
					  	<tr>
							<td height="34" colspan="2" align="left" bgcolor="#FFFFFF" class="">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
									  <td width="50%">
									  	<span class="sub_stan_blue">* 주민등록지 주소</span>
									  </td>
									</tr>
								</table>
							</td>
							<td height="34" colspan="2" align="left" bgcolor="#FFFFFF" class="">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
									  <td width="50%">
									  	<span class="sub_stan_blue">* 실제거주지 : </span>
									  	<input name="ADDR_CHECK1" type="checkbox" value="1" onclick="javascript:Jumin_toaddr_Check()" checked>
									  	주민등록지 주소 정보와 동일 
									  </td>
									</tr>
								</table>
							</td>
					  	</tr>
					  		<tr>
							<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
									  <td><input name="OWNER_POST" type="text" style="width:50px" onFocus="Jumin_toaddr_Check();" onKeyPress="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" value="${POST}" readonly class="input_form1"></td>
									  <td><a href="javascript:openZipcodePopup('form.OWNER_POST', 'form.OWNER_ADDR1');"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td>
									</tr>
								</table>
							</td>
							<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
									  <td><input name="OWNER_TOPOST" type="text" style="width:50px" onFocus="Jumin_toaddr_Check();" onKeyPress="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" value="${POST}" readonly class="essential"></td>
									  <td><a href="javascript:openZipcodePopup('form.OWNER_TOPOST', 'form.OWNER_TOADDR1');"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td>
									</tr>
								</table>
							</td>
					  	</tr>
					  	<tr>
							<td align="center" bgcolor="e5eff8" class="sub_table_b">기본 주소</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<input name="OWNER_ADDR1" type="text" class="input_form1" style="width:250px" onFocus="Jumin_toaddr_Check();" onKeyPress="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" value="${OWNER_ADDR1}" readonly>
								산<input type="checkbox"  class="input_form1" name="OWNER_SAN" onclick="Jumin_toaddr_Check();"  onFocus="Jumin_toaddr_Check();" onKeyPress="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();">
								<input name="OWNER_BONBUN" value="${OWNER_BONBUN}" type="text" class="input_form1" style="width:27px" style="ime-mode:disabled" onFocus="Jumin_toaddr_Check(); nr_num_int(this); count_check(this, OWNER_BUBUN, 4);" onKeyUp="Jumin_toaddr_Check(); nr_num_int(this); count_check(this, OWNER_BUBUN, 4);" onKeyPress="Jumin_toaddr_Check(); nr_num_int(this); count_check(this, OWNER_BUBUN, 4);" maxlength="4">
								- <input name="OWNER_BUBUN" value="${OWNER_BUBUN}" type="text" class="input_form1" style="width:27px" style="ime-mode:disabled" onFocus="Jumin_toaddr_Check(); nr_num_int(this); count_check(this, OWNER_BUBUN, 4);" onKeyUp="Jumin_toaddr_Check(); nr_num_int(this); count_check(this, OWNER_ADDR2, 4);" onKeyPress="Jumin_toaddr_Check(); nr_num_int(this); count_check(this, OWNER_ADDR2, 4);" maxlength="4">
								<input name="OWNER_ADDR2" type="text" class="input_form1" style="width:130px" value="${OWNER_ADDR2}" onFocus="Jumin_toaddr_Check();" onKeyPress="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" value="${OWNER_ADDR1}" maxlength="50">
							</td>
							<td align="center" bgcolor="e5eff8" class="sub_table_b">기본 주소</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<input name="OWNER_TOADDR1" type="text" class="essential" style="width:250px" onFocus="Jumin_toaddr_Check();" onKeyPress="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" value="${OWNER_TOADDR1}" readonly>
								산<input type="checkbox"  class="input_form1" name="OWNER_TOSAN" onclick="Jumin_toaddr_Check();"  onFocus="Jumin_toaddr_Check();" onKeyPress="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();">
								<input name="OWNER_TOBONBUN" value="${OWNER_TOBONBUN}" type="text" class="essential" style="width:27px" style="ime-mode:disabled" onFocus="Jumin_toaddr_Check(); nr_num_int(this);" onKeyUp="Jumin_toaddr_Check(); nr_num_int(this); count_check(this, OWNER_TOBUBUN, 4);" onKeyPress="Jumin_toaddr_Check(); nr_num_int(this); count_check(this, OWNER_TOBUBUN, 4);" maxlength="4">
								- <input name="OWNER_TOBUBUN" value="${OWNER_TOBUBUN}" type="text" class="input_form1" style="width:27px" style="ime-mode:disabled" onFocus="Jumin_toaddr_Check(); nr_num_int(this);" onKeyUp="Jumin_toaddr_Check(); nr_num_int(this); count_check(this, OWNER_TOADDR2, 4);" onKeyPress="Jumin_toaddr_Check(); nr_num_int(this); count_check(this, OWNER_TOADDR2, 4);" maxlength="4">
								<input name="OWNER_TOADDR2" type="text" class="essential" style="width:130px" value="${OWNER_TOADDR2}" onFocus="Jumin_toaddr_Check();" onKeyPress="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" maxlength="50">
							</td>
					  	</tr>
					  	<tr>
						  	<td height="34" colspan="4" align="left" bgcolor="#FFFFFF" class="">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
									  <td width="50%">
									  	<span class="sub_stan_blue">* 생활정도</span>
									  </td>
									</tr>
								</table>
							</td>
						</tr>
						<tr>
							<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">생활정도</td>
							<td width="37%" bgcolor="eaeaea" class="table_bl_left" nowrap="nowrap">
								<select name="LC_SEL" style="width:70px" class="input_form1">
									${lc_sel}
								</select>
								<input name="LC_TXT" type="text" class="input_form1" style="width:180px" value="${LC_TXT}" maxlength="25">
							</td>
							<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">주거정보</td>
							<td width="36%" bgcolor="eaeaea" class="table_bl_left">
								<select name="RT_SEL" style="width:70px" class="input_form1">
									${rt_sel}
								</select>
								<input name="RT_TXT" type="text" class="input_form1" style="width:180px" value="${RT_TXT}" maxlength="25">
							</td>
						</tr>
						<tr>
							<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">동산/부동산</td>
							<td width="37%" bgcolor="eaeaea" class="table_bl_left" nowrap="nowrap">
								<input name="ESTATE_MOVE" type="text" class="input_form1" style="width:90px" value="${ESTATE_MOVE}" maxlength="15" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);  comma_paste(this);" onKeyPress="nr_num_int(this);"> 원 / 
								<input name="ESTATE_REAL" type="text" class="input_form1" style="width:90px" value="${ESTATE_REAL}" maxlength="15" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);  comma_paste(this);" onKeyPress="nr_num_int(this);"> 원
							</td>
							<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">가판종류</td>
							<td width="36%" bgcolor="eaeaea" class="table_bl_left">
								<select name="GP_TYP" class="essential" style="width:150px" nowrap="nowrap" onchange="SelectedGPTYP();">
									${gp_typ}
								</select>
							</td>
						</tr>
						<tr>
							<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">비고</td>
							<td width="37%" bgcolor="eaeaea" class="table_bl_left" nowrap="nowrap" colspan="3">
								<textarea name="NOTE" id="NOTE" class="input_form1" style="width:98%" onkeyup="displayBytes(500, 'NOTE');">${board.NOTE }</textarea> 
							</td>
						</tr>
						
	                  	</table>
	                  	</td>
				  	</tr>
				</table>
			</div>
			<div class="tabcontent" style="display:none" id="tab3">
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
	                <td>
	                <table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0" class="sub_table">
								<tr>
							<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">동업자명</td>
							<td width="37%" bgcolor="eaeaea" class="table_bl_left" nowrap="nowrap">
								<input name="PARTN_NAME" type="text" class="input_form1" style="width:80px" value="${PARTN_NAME}" maxlength="35">
							</td>
							<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b" rowspan="4" nowrap="nowrap">
								<table>
									<tr><td>동업자 사진</td></tr>
									<tr>
										<td>
											<br><br>
											<span onclick="javascript:document.getElementById('file2').click();" style="overflow:hidden; background-repeat:no-repeat; cursor: pointer;">
												<!-- img src="/img/file_icon.gif" align="absmiddle" alt="파일첨부하기">
												<input type='file' id="file2" name='PARTN_IMG' style="width:0;height:5;filter:alpha(opacity=0); CURSOR:hand;" onchange='ChangeImg2(); attach(this);'-->
												
											</span>
										</td>
									</tr>
								</table>
							</td>
							<td bgcolor="eaeaea" class="table_bl_left" rowspan="4" nowrap="nowrap" align="center">
								<table>
									<tr>
										<td><input type='file' id="file2" name='PARTN_IMG' 	style="width:10;" onchange='ChangeImg2(); attach(this);'></td>
									</tr>
									<tr><td width=100 height=130 id="tblview2" style="background-repeat:no-repeat; background-attachment:scroll; background-position:50% 50%;"></td></tr>
								</table>
							</td>
						</tr>
						<tr>
							<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">동업관계</td>
							<td width="37%" bgcolor="eaeaea" class="table_bl_left" nowrap="nowrap">
								<select name="PT_SEL" style="width:70px" class="input_form1">
									${pt_sel}
								</select>
							</td>
						</tr>
						<tr>
							<td align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">주민번호</td>
							<td bgcolor="eaeaea" class="table_bl_left" nowrap="nowrap">
								<input name="PARTN_SSN1" type="text" class="input_form1" style="width:40px; ime-mode:disabled" value="${PARTN_SSN1}" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, PARTN_SSN2, 6);" maxlength="6">
								 - <input name="PARTN_SSN2" type="text" class="input_form1" style="width:45px; ime-mode:disabled" value="${PARTN_SSN2}" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);" maxlength="7"></td>
						</tr>
						<tr>
						  	<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">성별(나이)</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<input name="PARTN_GENDER" type="radio" value="1" checked>남
								<input name="PARTN_GENDER" type="radio" value="2">여
								&nbsp;( <input name="PARTN_AGE" type="text" class="input_form1" style="width:20px" maxlength="3" value="${PARTN_AGE}"  onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);"> 세)
							</td>
						</tr>
						<tr>
						  	<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">전화번호</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<input name="PARTN_TEL1" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, PARTN_TEL2, 3);" maxlength="3"> - 
								<input name="PARTN_TEL2" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, PARTN_TEL3, 4);" maxlength="4"> - 
								<input name="PARTN_TEL3" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, PARTN_HP1, 4);" maxlength="4">
							</td>
							<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">휴대전화</td>
							<td bgcolor="eaeaea" class="table_bl_left" colspan='3'>
								<input name="PARTN_HP1" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, PARTN_HP2, 3);" maxlength="3"> - 
								<input name="PARTN_HP2" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, PARTN_HP3, 4);" maxlength="4"> - 
								<input name="PARTN_HP3" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);" maxlength="4">
							</td>
						</tr>
						<tr>
							<td height="34" colspan="2" align="left" bgcolor="#FFFFFF" class="">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
									  <td width="50%">
									  	<span class="sub_stan_blue">* 주민등록지 주소</span>
									  </td>
									</tr>
								</table>
							</td>
							<td height="34" colspan="2" align="left" bgcolor="#FFFFFF" class="">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
									  <td width="50%">
									  	<span class="sub_stan_blue">* 실제거주지 : </span>
									  	<input name="ADDR_CHECK2" type="checkbox" value="1" onclick="javascript:Jumin_toaddr_Check()" checked>
									  	주민등록지 주소 정보와 동일 
									  </td>
									</tr>
								</table>
							</td>
					  	</tr>
						<tr>
							<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
									  <td><input name="PARTN_POST" type="text" class="input_form1" style="width:50px" onFocus="Jumin_toaddr_Check();" value="${POST}" onchange="Jumin_toaddr_Check();" value="${POST}" readonly></td>
									  <td><a href="javascript:openZipcodePopup('form.PARTN_POST', 'form.PARTN_ADDR1');"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td>
									</tr>
								</table>
							</td>
							<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
									  <td><input name="PARTN_TOPOST" type="text" class="input_form1" style="width:50px" readonly></td>
									  <td><a href="javascript:openZipcodePopup('form.PARTN_TOPOST', 'form.PARTN_TOADDR1');"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td>
									</tr>
								</table>
							</td>
					  	</tr>
					  	<tr>
							<td align="center" bgcolor="e5eff8" class="sub_table_b">기본 주소</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<input name="PARTN_ADDR1" type="text" class="input_form1" style="width:250px" value="${PARTN_ADDR1}" readonly onFocus="Jumin_toaddr_Check();" onchange="Jumin_toaddr_Check();">
								산<input type="checkbox" name="PARTN_SAN" class="input_form1" onclick="Jumin_toaddr_Check();">
								<input name="PARTN_BONBUN" value="${PARTN_BONBUN}" type="text" class="input_form1" style="width:27px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);Jumin_toaddr_Check();count_check(this, PARTN_BUBUN, 4);" onKeyPress="nr_num_int(this);" maxlength="4">
								- <input name="PARTN_BUBUN" value="${PARTN_BUBUN}" type="text" class="input_form1" style="width:27px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);Jumin_toaddr_Check();count_check(this, PARTN_ADDR2, 4);" onKeyPress="nr_num_int(this);" maxlength="4">
								<input name="PARTN_ADDR2" type="text" class="input_form1" style="width:130px" value="${PARTN_ADDR2}" onKeyUp="Jumin_toaddr_Check();" maxlength="50">
							</td>
							<td align="center" bgcolor="e5eff8" class="sub_table_b">기본 주소</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<input name="PARTN_TOADDR1" type="text" class="input_form1" style="width:250px" value="${PARTN_TOADDR1}" readonly>
								 산<input type="checkbox" name="PARTN_TOSAN" class="input_form1" onclick="Jumin_toaddr_Check();">
								<input name="PARTN_TOBONBUN" value="${PARTN_TOBONBUN}" type="text" class="input_form1" style="width:27px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);count_check(this, PARTN_TOBUBUN, 4);" onKeyPress="nr_num_int(this);" maxlength="4">
								- <input name="PARTN_TOBUBUN" value="${PARTN_TOBUBUN}" type="text" class="input_form1" style="width:27px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);count_check(this, PARTN_TOADDR2, 4);" onKeyPress="nr_num_int(this);" maxlength="4">
								<input name="PARTN_TOADDR2" type="text" class="input_form1" style="width:130px" value="${PARTN_TOADDR2}"  maxlength="50">
							</td>
					  	</tr>
                	</table>
                	</td>
				</tr>
				</table>
			</div>
			<div class="tabcontent" style="display:none" id="tab4">
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
	                <td>

					<table width="100%" border="0" cellspacing="0" cellpadding="0">
				      <tr>
				        <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
				          
				          <tr>
				            <td height="34" colspan="4" bgcolor="#FFFFFF" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
				              <tr>
				                <td width="60" align="center"><img src="/img/0811_tt2.gif" width="44" height="17"></td>
				              </tr>
				            </table></td>
				            </tr>
				          <tr>
				            <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">점용종류</td>
				            <td bgcolor="f6f6f6" class="table_bl_left">도로</td>
				            <td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">점용구분</td>
				            <td width="260" bgcolor="f6f6f6" class="table_bl_left">계속</td>
				          </tr>
				          <tr>
				            <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">소유자</td>
				            <td bgcolor="f6f6f6" class="table_bl_left">
							    <select name="OWNER_SET" class="essential" style="width:70px">
							 				${use_owner_Group}
							   </select>
							</td>
				            <td align="center" bgcolor="e5eff8" class="sub_table_b">세입구분</td>
				            <td bgcolor="f6f6f6" class="table_bl_left">
							<select name="TAX_SET" class="essential" style="width:70px">
											${taxation_section}
							</select>
							</td>
				          </tr>
				          <tr>
				            <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용기간 </td>
				            <td colspan="3" bgcolor="f6f6f6" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
				              <tr>
				                <td><input name="MUL_FROMDATE" type="text" class="essential" style="width:76px" readonly></td>
				                <td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onClick="popUpCalendar(this, MUL_FROMDATE, 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
				                <td width="16" align="center">~</td>
				                <td><input name="MUL_TODATE" type="text" class="essential" style="width:76px" readonly></td>
				                <td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onClick="popUpCalendar(this, MUL_TODATE, 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
				              </tr>
				            </table></td>
				          </tr>
				          <tr>
				            <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용지 지번</td>
				            <td colspan="3" bgcolor="f6f6f6" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
				              <tr>
				                <td width="76">${SIDO_NM}&nbsp;&nbsp;${SIGUNGU}&nbsp;&nbsp;</td>
				                <td><select name="BJ_CD" class="essential" style="width:100px">
	                         		   ${bjdong_code}
	                       			 </select>
	                       		</td>
	              				<td>&nbsp;<select name="HJ_CD" class="essential" style="width:100px">
	                        	    ${hjdong_code}
	                      		  </select>
	                      		</td>
				                <td width="16" align="center">/</td>
				                <td><select name="SPC_CD" class="essential" style="width:75px">${mul_spc_cd}</td>
				                <td width="10">&nbsp;</td>
				                <td><input name="BONBUN" value="${BONBUN}" type="text" class="essential" style="width:50px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);" maxlength="4"></td>
				                <td width="16" align="center">-</td>
				                <td><input name="BUBUN" value="${BUBUN}" type="text" class="input_form1" style="width:50px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);" maxlength="4"></td>
				                <td width="30" align="center">번지</td>
				                <td><img src="/img/loca_icon2.gif" alt="위치등록" width="64" height="18" border="0" onClick="javascript:jumyongZibun('${SIDO}','${SIGU_CD}');" style="CURSOR:Hand;"></td>
				              </tr>
				            </table></td>
				            </tr>
				            <!-- 
				          <tr>
				            <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">인접지 주소 </td>
				            <td bgcolor="f6f6f6" class="table_bl_left">
				            	<input name="WITH_ADDR" type="text" class="input_form1" style="width:264px" value="${WITH_ADDR}"  maxlength="50">
				            </td>
				            <td rowspan="5" align="center" bgcolor="e5eff8" class="sub_table_b">시설물사진<br>
				              <br>
				              <span onClick="javascript:document.getElementById('file3').click();" style="overflow:hidden; background-repeat:no-repeat; cursor: pointer;">
				              <img src="/img/file_icon.gif" alt="파일첨부하기" width="64" height="18" border="0">
							  <input type='file' id="file3" name='SHOP_IMG' style="width:0;height:5;filter:alpha(opacity=0); CURSOR:hand;" onchange='ChangeImg3(); attach(this);'>
							  </span>
							</td>
				            <td rowspan="5" align="center" bgcolor="f6f6f6" class="table_bl_left">&nbsp;</td>
				          </tr>
				           -->
				          <tr>
							<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b" width="100" nowrap>인접지 주소</td>
							<td bgcolor="f6f6f6" class="table_bl_left" nowrap>
								<input name="WITH_ADDR" type="text" class="input_form1" style="width:264px" value="${WITH_ADDR}" maxlength="50">
							</td>
						  	<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b" rowspan="5" nowrap>
						  		<table>
									<tr><td align="center" bgcolor="e5eff8" class="sub_table_b">시설물 사진</td></tr>
									<tr>
										<td>
											<br><br>
											<span onclick="javascript:document.getElementById('file3').click();" style="overflow:hidden; background-repeat:no-repeat; cursor: pointer;">
												<!-- img src="/img/file_icon.gif" align="absmiddle" alt="파일첨부하기">
												<input type='file' id="file3" name='SHOP_IMG' style="width:0;height:5;filter:alpha(opacity=0); CURSOR:hand;" onchange='ChangeImg3(); attach(this);'-->
											</span>
										</td>
									</tr>
								</table>
						  	</td>
					  	
							<td bgcolor="eaeaea" class="table_bl_left" rowspan="5" nowrap="nowrap" align="center">
								<table>
									<tr>
										<td><input type='file' id="file3" name='SHOP_IMG' 	style="width:10;" onchange='ChangeImg3(); attach(this);'></td>
									<tr><td width=100 height=130 id="tblview3" style="background-image:url(1.jpg); background-repeat:no-repeat; background-attachment:scroll; background-position:50% 50%;"></td></tr>
								</table>
							</td>
  						  </tr>
				          <tr>
				            <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">주변정보</td>
				            <td bgcolor="f6f6f6" class="table_bl_left"><input name="WITH_INFO" type="text" class="input_form1" style="width:264px" value="${WITH_ADDR}"></td>
				            </tr>
				          <tr>
				            <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">도로정보</td>
				            <td bgcolor="f6f6f6" class="table_bl_left"><input name="ROAD_INFO" type="text" class="input_form1" style="width:264px" value="${ROAD_INFO}"></td>
				            </tr>
				          <tr>
				            <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">지역정보</td>
				            <td bgcolor="f6f6f6" class="table_bl_left"><select name="AR_SEL" class="input_form1" style="width:76px">
				              ${ar_sel}
				                                    </select>
				              <input name="AR_TXT" type="text" class="input_form1" style="width:184px" value="${AR_TXT}" maxlength="50"></td>
				            </tr>
				          <tr>
				            <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">설치일자</td>
				            <td bgcolor="f6f6f6" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
				              <tr>
				                <td><input name="FOUND_DATE" type="text" class="input_form1" style="width:120px" value="${FOUND_DATE}" readonly></td>
				                <td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onClick="popUpCalendar(this, FOUND_DATE, 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
				              </tr>
				            </table></td>
				            </tr>
				          <tr>
				            <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">인접시설</td>
				            <td bgcolor="f6f6f6" class="table_bl_left"><select name="UC_SEL" class="input_form1" style="width:100px">
				              ${uc_sel}
				            </select>
				              <input name="UC_TXT" type="text" class="input_form1" style="width:150px" value="${UC_TXT}" maxlength="50"></td>
				            <td align="center" bgcolor="e5eff8" class="sub_table_b">시설물명/형태 </td>
				            <td bgcolor="f6f6f6" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
				              <tr>
					            <td><select name="FT_TYP" class="essential" style="width:100px" onchange="SelectedFTTYP();">
				                <option value="">::선택::</option>
				                </select></td>
				                <td width="16" align="center">/</td>
				                <td><select name="FT_SEL" class="essential" style="width:100px">
				                <option value="">::선택::</option>
				                </select></td>
				                </tr>
				            </table></td>
				          </tr>
				          <tr>
				            <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">시설규격(m)</td>
				            <td bgcolor="f6f6f6" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
				              <tr>
				                <td><input name="FACIL_L" type="text" class="input_form1" style="width:40px" onKeyPress="nr_num_float(this);" onKeyUp="nr_num_float(this);" maxlength="5"></td>
				                <td width="28" align="center">가로</td>
				                <td width="12" align="center">x</td>
				                <td><input name="FACIL_W" type="text" class="input_form1" style="width:40px" onKeyPress="nr_num_float(this);" onKeyUp="nr_num_float(this);" maxlength="5"></td>
				                <td width="28" align="center">세로</td>
				                <td width="12" align="center">x</td>
				                <td><input name="FACIL_H" type="text" class="input_form1" style="width:40px" onKeyPress="nr_num_float(this);" onKeyUp="nr_num_float(this);" maxlength="5"></td>
				                <td width="28" align="center">높이</td>
				              </tr>
				            </table></td>
				            <td align="center" bgcolor="e5eff8" class="sub_table_b">점용면적</td>
				            <td bgcolor="f6f6f6" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
				              <tr>
				                <td><input name="PLACE_L" type="text" class="essential" style="width:40px" onKeyPress="nr_num_float(this),Jumji_CalPlaceSize();" onKeyUp="nr_num_float(this),Jumji_CalPlaceSize();" maxlength="5"></td>
				                <td width="16" align="center">m</td>
				                <td width="12" align="center">x</td>
				                <td><input name="PLACE_H" type="text" class="essential" style="width:40px" onKeyPress="nr_num_float(this),Jumji_CalPlaceSize();" onKeyUp="nr_num_float(this),Jumji_CalPlaceSize();" maxlength="5"></td>
				                <td width="16" align="center">m</td>
				                <td width="12" align="center">=</td>
				                <td><input name="PLACE_A" type="text" class="essential" style="width:40px" onKeyPress="nr_num_float(this);" onKeyUp="nr_num_float(this);" maxlength="5" readonly="readonly"></td>
				                <td width="16" align="center">㎡</td>
				              </tr>
				            </table></td>
				          </tr>
				          <tr>
				            <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">보관장소</td>
				            <td bgcolor="f6f6f6" class="table_bl_left"><select name="DP_SEL" class="input_form1" style="width:76px">
				              ${dp_sel}
				            </select>
				              <input name="DP_TXT" type="text" class="input_form1" style="width:184px" value="${DP_TXT}" maxlength="50"></td>
				            <td align="center" bgcolor="e5eff8" class="sub_table_b">특화거리조성</td>
				            <td bgcolor="f6f6f6" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
				              <tr>
				                <td><input name="SPECIAL_ST" type="radio" value="1" checked></td>
				                <td width="50">일반거리</td>
				                <td><input name="SPECIAL_ST" type="radio" value="0"></td>
				                <td width="50">특화거리</td>
				                </tr>
				            </table></td>
				          </tr>
				          <tr>
				            <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">정비대상여부</td>
				            <td colspan="3" bgcolor="f6f6f6" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
				              <tr>
				                <td><input name="MAINTN_OB" type="radio" value="1" checked></td>
				                <td width="50">관리대상</td>
				                <td><input name="MAINTN_OB" type="radio" value="0"></td>
				                <td width="50">정비대상</td>
				                <td><select name="MT_SEL" class="input_form1" style="width:76px">
				                  ${mt_sel}
				                </select></td>
				              </tr>
				            </table></td>
				          </tr>
				          <tr>
				            <td height="34" colspan="4" bgcolor="#FFFFFF" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
				              <tr>
				                <td width="60" align="center"><img src="/img/0811_tt1.gif" width="44" height="17"></td>
				              </tr>
				            </table></td>
				            </tr>
				          <tr>
				            <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">취급품목</td>
				            <td colspan="3" bgcolor="f6f6f6" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
				              <tr>
				                <td><select name="SG_TYP" class="input_form1" style="width:76px">
				                  ${sg_typ}
				                </select></td>
				                <td><input name="LIQUOR_SL" type="checkbox" value="0"></td>
				                <td width="50">주류판매</td>
				                <td><input name="LPGAS_US" type="checkbox" value="0"></td>
				                <td width="100">LPG 사용 </td>
				                </tr>
				            </table></td>
				            </tr>
				          <tr>
				            <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">상품분류</td>
				            <td bgcolor="f6f6f6" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
				              <tr>
				                <td><select name="SG_ITM" class="input_form1" style="width:76px">
				                   ${sg_itm}
				                </select></td>
				                <td width="16" align="center">/</td>
				                <td><select name="SG_SEL" class="input_form1" style="width:76px">
				                   ${sg_sel}
				                </select></td>
				              </tr>
				            </table></td>
				            <td align="center" bgcolor="e5eff8" class="sub_table_b">영업인원</td>
				            <td bgcolor="f6f6f6" class="table_bl_left"><input name="MEM_NUM" type="text" class="input_form1" style="width:76px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, OPEN_TIME1, 2);" maxlength="2"> 
				              (운영자 본인 포함)</td>
				          </tr>
				          <tr>
				            <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">운영시간</td>
				            <td bgcolor="f6f6f6" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
				              <tr>
				                <td><input name="OPEN_TIME1" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);count_check(this, OPEN_TIME2, 2);" maxlength="2"></td>
				                <td width="12" align="center">:</td>
				                <td width="16" align="center"><input name="OPEN_TIME2" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);count_check(this, CLOSE_TIME1, 2);" maxlength="2"></td>
				                <td width="12" align="center">~</td>
				                <td><input name="CLOSE_TIME1" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);count_check(this, CLOSE_TIME2, 2);" maxlength="2"></td>
				                <td width="12" align="center">:</td>
				                <td><input name="CLOSE_TIME2" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);" maxlength="2"></td>
				                </tr>
				            </table></td>
				            <td align="center" bgcolor="e5eff8" class="sub_table_b">허가일자</td>
				            <td bgcolor="f6f6f6" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
				              <tr>
   				                <td><input name="PERMIT_DATE" type="text" class="input_form1" style="width:76px" readonly></td>
				                <td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onClick="popUpCalendar(this, PERMIT_DATE, 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
				              </tr>
				            </table></td>
				          </tr>
				          <tr>
				            <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">일매출액</td>
				            <td bgcolor="f6f6f6" class="table_bl_left"><input name="DAY_SALES" type="text" class="input_form1" style="width:76px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);" maxlength="8">
				              원</td>
				            <td align="center" bgcolor="e5eff8" class="sub_table_b">가입단체</td>
				            <td bgcolor="f6f6f6" class="table_bl_left"><select name="UN_TYP" class="input_form1" style="width:76px">
				             ${un_typ}
				            </select>
				              <input name="UN_TXT" type="text" class="input_form1" style="width:158px" maxlength="50"></td>
				          </tr>
				          <tr>
				            <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">기타정보</td>
				            <td colspan="3" bgcolor="f6f6f6" class="table_bl_left"><input name="NOTES" type="text" class="input_form1" style="width:620px" maxlength="255"></td>
				            </tr>
				    </table>
			</div>
			
			
		</div>
		</td>
		</tr>
	</table></td>
	</tr>
</form>
</table>
</body>
</html>

<script language="javascript">
	//HTML또는 JSP 페이지의 마지막 부분에 다음과 같이 삽입하자.
	RemoveOutline();
	parent.getSearchData(document.form.NAME_MIN.value, document.form.min_ssn1.value, document.form.min_ssn2.value);
</script>
