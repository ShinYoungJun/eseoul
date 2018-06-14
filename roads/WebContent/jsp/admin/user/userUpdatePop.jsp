<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />
<title>::::: 서울시 도로점용관리시스템 :::::</title>
<style type="text/css">
<!--
body {
	margin: 0px;
	background-image: url(/img/left_back.gif);
}
html {overflow-x : hidden;}
-->
</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
</head>

<script language="javascript" src="/js/common.js"></script> 
<script type="text/javascript">

	function fn_pwCheck()
	{	
	    var fm = document.regForm; 
	    
		if(fm.PW.value != fm.pwConfirm.value)
		{	
			alert("패스워드를 정확히 입력 해 주세요.");
			fm.PW.focus();
			fm.pwConfirm.select();
			return false;
		}
		return true;			
	}
	           
	function fn_upDate()
	{	
		var w = document.regForm;

		if(!fn_pwCheck()) return;
		if(!isEmail(w.EMAIL)) return;	
		if(!checkStrNVMsg(w.SIGU_CD,"소속기관"))return;
		if(!checkStrNVMsg(result.listForm.deptCode,"소속부서"))return;
		if(!checkStrNVMsg(w.NAME,"이름"))return;
		if(!checkStrNVMsg(w.userId,"아이디"))return;
		if(!checkStrNVMsg(w.PW,"패스워드"))return;
		if(!checkStrNVMsg(w.SECTION,"사용자등급"))return;
		if(!checkStrNVMsg(w.work_id1,"주민등록번호"))return;
		if(!checkStrNVMsg(w.work_id2,"주민등록번호"))return;

		if('${userView.USER_ID}' == 'roadsdb'){
			alert('${userView.USER_ID}' + '계정입니다.');
		}else if(w.INSARANGKEY.value.length > 0 && w.INSARANGKEY.value.length < 13){
			alert("인사대체키의 입력이 잘못되었습니다.");
			return;
		}
		
		setWork_id();
		setTel();  
		setHP(); 		
		w.deptCode.value = result.listForm.deptCode.value;
		if(w.input_type.value=="text"){		//받은 input_type이  text이면 			
			w.BUKWA_ID.value  = w.BUKWA_ID1.value;
			w.ELEC_ID.value   = w.ELEC_ID1.value;
			w.SAEALL_ID.value = w.SAEALL_ID1.value;
		}else if(w.input_type.value=="pass"){
			w.BUKWA_ID.value  = w.BUKWA_ID2.value;
			w.ELEC_ID.value   = w.ELEC_ID2.value;
			w.SAEALL_ID.value = w.SAEALL_ID2.value;
		}
		w.action = "/admin/user/userReg.do";		
		w.submit();				
	}
	
	function setWork_id(){
		var work_id1 = document.regForm.work_id1.value;
	   	var work_id2 = document.regForm.work_id2.value;
	   	
	   	if(work_id1 != "" && work_id2!= "")
		   	document.regForm.WORK_ID.value = work_id1+work_id2;
	}
	
	function setTel()
	{
		var tel1 = document.regForm.tel1.value;
	   	var tel2 = document.regForm.tel2.value;
	   	var tel3 = document.regForm.tel3.value;
	   	
	   	if(tel1 != "" && tel2!= "" && tel3 != "")
	   		document.regForm.TEL.value = tel1+"-"+tel2+"-"+tel3;
	}
	
	function setHP()
	{
		var hp1 = document.regForm.hp1.value;
	   	var hp2 = document.regForm.hp2.value;
	   	var hp3 = document.regForm.hp3.value;
	   	
	   	 if(hp1 != "" && hp2!= "" && hp3 != "")
	   		document.regForm.HP.value = hp1+"-"+hp2+"-"+hp3;
	}	
		
	function changeFocus(varControl, varNext)
	{
		if(varControl.value.length == varControl.maxLength)
		{
			varNext.focus();
			varNext.select(); 
		}
	}
	
	function fn_callBack()
	{
		var fm = document.regForm; 
		
	   	if(fm.result.value != "") 
		{
			if(fm.result.value == 'true')
			{
				alert("사용자정보가 변경되었습니다!");
				opener.location.reload();
	    		window.close();
	    	}
	    	else
	    		alert("저장에 실패했습니다!");
		}
	}
	
	//구코드 변경시 부서코드list 조회
	function fn_guChange()
	{
		var sigucd = document.regForm.SIGU_CD.value;			
		result.getDeptCode(sigucd,"update");  
	}
	
	//전화번호 format
	function fn_telSplit()
	{
		var string_tel = "${userView.TEL}";
	 	var split_tel  = string_tel.split('-');
  	  
  	  	if(string_tel=="")
  	  	{
		   	document.regForm.tel1.value="";
	   	   	document.regForm.tel2.value="";
	   	   	document.regForm.tel3.value="";
	 	}
		else
	   	{
			document.regForm.tel1.value=split_tel[0];
	   	   	document.regForm.tel2.value=split_tel[1];
	   	   	document.regForm.tel3.value=split_tel[2];
	   	}
	}
	
	//HP format
	function fn_hpSplit()
	{
		var string_hp = "${userView.HP}";
	 	var split_hp  = string_hp.split('-');
  	  	
  	  	if(string_hp=="")
  	  	{
		   	document.regForm.hp1.value="";
	   	   	document.regForm.hp2.value="";
	   	   	document.regForm.hp3.value="";
	 	}
		else
	   	{
			document.regForm.hp1.value=split_hp[0];
	   	   	document.regForm.hp2.value=split_hp[1];
	   	   	document.regForm.hp3.value=split_hp[2];
	   	}
	}

	function fn_wiSplit(){
		var work_id = "${userView.WORK_ID}";

		if(work_id==""){
			document.regForm.work_id1.value = "";
			document.regForm.work_id2.value = "";
		}else{
			document.regForm.work_id1.value = work_id.substring(0, 6);
			document.regForm.work_id2.value = work_id.substring(6, 13);
		}
	}
	
	//전화번호 입력시 포커스이동
	function fn_checklength(nextfield,chars,currfield) 
	{
		var x = eval('document.regForm.'+currfield+'.value.length');
		var y = eval('document.regForm.'+currfield+'.value');
	
		var code = window.event.keyCode;
		if(code == 9)
			return;
		
		if (x == chars || (currfield == 'tel1' &&  y =='02')) 
		{
	    	eval('document.regForm.' + nextfield + '.focus();');
	    	eval('document.regForm.' + nextfield + '.select();');
	  	}
	}

	//숫자만 입력
	function onlyNumberInput()
	{	
		var code = window.event.keyCode;

	 	if ((code > 34 && code < 41) || (code > 47 && code < 58) || (code > 95 && code < 106) || code == 8 || code == 9 || code == 13 || code == 46)
	 	{	
		  	window.event.returnValue = true;
			return;
	 	}else {	 
	 		window.event.returnValue = false;
	 		return;
 	 	}
	}

	
	function onclickPwMod(e) {
		var event = e || window.event;
		var PW = document.getElementById('PW');
		var pwConfirm = document.getElementById('pwConfirm');
		if (event.checked) {
			PW.orginalPw = PW.value;
			pwConfirm.value = '';
			pwConfirm.readOnly = false;
			PW.readOnly = false;
		} else {
			PW.value = PW.orginalPw;
			pwConfirm.value = PW.orginalPw;
			PW.readOnly = true;
			pwConfirm.readOnly = true;
		}
		
	}
	
	function init()
	{
		var w = document.regForm;
		var cd =w.deptCode.value;	
		
		if(document.getElementById("SIGU_CD").value == "")	
			document.getElementById("SIGU_CD").disabled = false;		
		
		fn_guChange();	
		fn_telSplit();	
		fn_hpSplit();
		fn_wiSplit();

		document.getElementById("dept_cd").innerHTML = cd;
		
		<%-- 
		[04.08.13] yjmoon
		text(사용자)모드인 경우와 pass(관리자)모드인 경우에 따라서  암호 수정 유무를 체크 한다.
		즉 사용자 모드인 경우에는 암호도 같이 변경할수 있도록, 
		관리자의 경우는 암호 수정 없이도  사용자 정보를 수정 가능 하도록.  
		 --%>
		var PW = document.getElementById('PW');
		var pwConfirm = document.getElementById('pwConfirm');
		var section = document.getElementById('SECTION');
	
		if(w.input_type.value=="text"){		//받은 input_type이  text이면 			
			document.getElementById("input_text").style.display = "block";
			pwConfirm.value = '';
		}else if(w.input_type.value=="pass"){
			document.getElementById("input_pass").style.display = "block";
			var isPwEdit = document.getElementById('isPwEdit');
			var chkMod = document.getElementById('EditMod');
			isPwEdit.style.visibility = 'visible';
			PW.readOnly = true;
			pwConfirm.readOnly = true;
			chkMod.checked = false;
			section.disabled = false;
			
		}
	}
	
	function strCharByte(chStr) {
	    if (chStr.substring(0, 2) == '%u') {
	        if (chStr.substring(2,4) == '00')
	            return 1;
	        else
	            return 2;        //한글
	    } else if (chStr.substring(0,1) == '%') {
	        if (parseInt(chStr.substring(1,3), 16) > 127)
	            return 2;        //한글
	        else
	            return 1;
	    } else {
	            return 1;
	    }
	}
	function koreaCheck(){	
		var i;
    var ch;
    var keyword = document.getElementById("userId").value;
		for (i=0;i<keyword.length;i++) {
	        ch = escape(keyword.charAt(i));        //ISO-Latin-1 문자셋으로 변경

	        if (strCharByte(ch) == 2) { //한글이 아닐 경우
	        	alert("한글은 입력할 수 없습니다.");
	        	document.getElementById("USER_ID").value = "";
	        	document.getElementById("USER_ID").focus();

	   			
	            return;
	        }
	    }
	}
//]]>
</script>

<body onload="fn_callBack();init()">
<form id="regForm" name="regForm" method="post">
<input id="modeType" name="modeType" type="hidden" value="edit">
<input id="result" name="result" type="hidden" value="${result}">
<input id="deptCode" name="deptCode" type="hidden" value="${deptCode}">
<input id="input_type" name="input_type" type="hidden" value="${input_type}">

<table width="100%" border="0" cellspacing="0" cellpadding="0">
	<tr>
		<td height="13" colspan="3"></td>
	</tr>
	<tr>
		<td width="15"></td>
		<td height="47">
		<table width="100%" border="0" cellpadding="0" cellspacing="0"
			class="admin_w">
			<tr>
				<td width="33"><img src="/img/admin_pop_left.gif" width="33"
					height="47"></td>
				<td background="/img/admin_pop_cen.gif"><span
					class="admin_w_b">사용자</span> 정보 입력</td>
				<td width="33"><img src="/img/admin_pop_right.gif" width="33"
					height="47"></td>
			</tr>
		</table>
		</td>
		<td width="15"></td>
	</tr>
	<tr>
		<td></td>
		<td>
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td height="20"></td>
			</tr>
			<tr>
				<td width="48%" valign="top" bgcolor="#FFFFFF" class="admin_bl_left">
				<table width="100%" border="1" bordercolor="#c9dfed"
					style="border-collapse:collapse;" cellpadding="0" cellspacing="0"
					class="sub_table">
					<tr>
						<td width="100" height="28" align="center" bgcolor="e5eff8"
							class="sub_table_b">구분</td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b"
							colspan="3">내용</td>
					</tr>
					<tr>
						<td height="26" align="center">소속기관</td>
						<td class="table_bl_left" colspan="3">
						<select id="SIGU_CD" name="SIGU_CD" class="essential" style="width:100px" onchange="fn_guChange();" disabled>
							<option value ="">기관선택</option>
							<c:forEach items="${guCdList}" var="list">
							<option value="${list.GU_CD}">${list.GU_NM}</option>
							</c:forEach>	
						</select>
						</td>
					</tr>
					<tr>
						<td height="26" align="center" bgcolor="f2f2f2">소속부서</td>
						<td bgcolor="f2f2f2" class="table_bl_left" colspan="3">
						<iframe height="20" width="150" id="result" name="result" src="/admin/user/deptCode.do" frameborder="0" scrolling="no" marginwidth="0" marginheight="0">
						</iframe>&nbsp; &nbsp;(부서코드: &nbsp; <a id="dept_cd"></a>)
						</td>
					</tr>
					<tr>
						<td height="26" align="center">담당업무</td>
						<td class="table_bl_left" colspan="3">
						<input id="POSITION" name="POSITION" type="text" class="input_form1" style="width:150px" value="${userView.POSITION}"></td>
					</tr>
					<tr>
						<td height="26" align="center" bgcolor="f2f2f2">이 름</td>
						<td bgcolor="f2f2f2" class="table_bl_left" colspan="3">
						<input id="NAME" name="NAME" type="text" class="essential"  style="width:150px" value="${userView.NAME}"></td>
					</tr>
					<tr>
						<td height="26" align="center">아이디</td>
						<td class="table_bl_left" colspan="3">
							<input id="userId" name="userId" type="text" class="essential" style="width:150px"  value="${userView.USER_ID}" readOnly = "true" onkeyup="koreaCheck();">
							<font color="blue" style="font-size:11px;">(영문,숫자 포함 최소 6자  최대13자 가능)</font>
						</td>
					</tr>
					<tr>
						<td height="26" align="center" bgcolor="f2f2f2">패스워드</td>
						<td bgcolor="f2f2f2" class="table_bl_left" colspan="3">
							<input id="PW" name="PW" type="password" class="essential" style="width:150px" value="${userView.PW}" maxlength="13">
							<span id="isPwEdit" style="visibility: hidden;"><input id="EditMod" name="EditMod" type="checkbox" checked="checked" onclick="javascript:onclickPwMod(this);">패스워드 수정</span>	
						</td>
					</tr>
					<tr>
						<td height="26" align="center" >패스워드확인</td>
						<td class="table_bl_left" colspan="3">
							<input id="pwConfirm" name="pwConfirm" type="password" class="essential" style="width:150px" onChange="javascript:fn_pwCheck();" value="${userView.PW}" maxlength="13">
						</td>
					</tr>
					<tr>
						<td height="26" align="center" bgcolor="f2f2f2">사용자등급</td>
						<td class="table_bl_left" colspan="3" bgcolor="f2f2f2">
						<select id="SECTION" name="SECTION" class="essential" style="width:140px"  disabled>
							<option value="">선택하세요</option>
							<option value="1">관리자</option>
							<option value="2">부서업무담당자</option>
						</select></td>
					</tr>						
					<tr>
						<td height="26" align="center">전화번호</td>
						<td class="table_bl_left" colspan="3">
							<input id="tel1" name="tel1" type="text" class="input_form1" style="width:30px;ime-mode:disabled" maxlength="3" onkeyup="fn_checklength('tel2',3,this.name);" onkeydown="onlyNumberInput();"> -
							<input id="tel2" name="tel2" type="text" class="input_form1" style="width:40px;ime-mode:disabled" maxlength="4" onkeyup="fn_checklength('tel3',4,this.name);" onkeydown="onlyNumberInput();"> -
							<input id="tel3" name="tel3" type="text" class="input_form1" style="width:40px;ime-mode:disabled" maxlength="4" onkeydown="onlyNumberInput();">  내선:
							<input id="TEL_EXT" name="TEL_EXT" type="text" class="input_form1" style="width:20px;ime-mode:disabled" maxlength="3" onkeydown="onlyNumberInput();" value="${userView.TEL_EXT}"> 		
							<input id="TEL" name="TEL" type="hidden" class="input_form1">	
						</td>
					</tr>
					<tr>
						<td height="26" align="center" bgcolor="f2f2f2">휴대폰번호</td>
						<td bgcolor="f2f2f2" class="table_bl_left" colspan="3">
						<input id="hp1" name="hp1" type="text" class="input_form1" style="width:30px;ime-mode:disabled" maxlength="3" onkeyup="fn_checklength('hp2',3,this.name);" onkeydown="onlyNumberInput();"> -
						<input id="hp2" name="hp2" type="text" class="input_form1" style="width:40px;ime-mode:disabled" maxlength="4" onkeyup="fn_checklength('hp3',4,this.name);" onkeydown="onlyNumberInput();"> -
						<input id="hp3" name="hp3" type="text" class="input_form1" style="width:40px;ime-mode:disabled" maxlength="4" onkeydown="onlyNumberInput();">
						<input id="HP" name="HP" type="hidden" class="input_form1">						
						</td>
					</tr>
					<tr>
						<td height="26" align="center">E-mail</td>
						<td class="table_bl_left" colspan="3">
							<input id="EMAIL" name="EMAIL" type="text" class="input_form1" style="width:200px" value="${userView.EMAIL}">
						</td>
					</tr>
					<tr>					
						<td height="26" align="center" bgcolor="f2f2f2">주민등록번호</td>
						<td class="table_bl_left" colspan="3" bgcolor="f2f2f2">
							<input id="work_id1" name="work_id1" type="text" class="essential" style="width:100px" maxlength="6" onkeyup="fn_checklength('work_id2',6,this.name);" onkeydown="onlyNumberInput();">						
							-
							<input id="work_id2" name="work_id2" type="password" class="essential" style="width:100px" maxlength="7" onkeydown="onlyNumberInput();">	
							<input id="WORK_ID" name="WORK_ID" type="hidden" class="input_form1" style="width:200px">						
						</td>
					</tr>					
					<!-- 인사대체키 -->
					<tr>					
						<td height="26" align="center" bgcolor="f2f2f2">인사대체키</td>
						<td class="table_bl_left" colspan="3" bgcolor="f2f2f2">
							<input id="INSARANGKEY" name="INSARANGKEY" type="text" class="essential" style="width:100px" maxlength="13" onkeyup="fn_checklength('INSARANGKEY',13,this.name);" value="${userView.INSARANGKEY}">						
						</td>
					</tr>
					
				</table>
				</td>
			</tr>
		</table>
		</td>
	</tr>
</table>
<table border="0" cellpadding="0" cellspacing="0" width="100%">
<tr>
<td align="center">
						<div id="input_text" style="width:100%;display:none;">
						<table width="485" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0" class="sub_table">
							<tr>
								<td width="90" height="30" align="center" >세외수입 사용자 ID</td>
								<td width="375" class="table_bl_left" align="left">
								<input id="BUKWA_ID1" name="BUKWA_ID1" type="text" class="essential"	style="width:150px" value="${userView.BUKWA_ID}" maxlength="13" onkeydown="onlyNumberInput()">
								<font color="blue" style="font-size:11px;">(주민번호 입력, '-'제외)</font>
								</td>
							</tr>
							<tr>					
								<td height="30" align="center" bgcolor="f2f2f2">전자결제 사용자 ID</td>
								<td class="table_bl_left" bgcolor="f2f2f2" align="left">
								<input id="ELEC_ID1" name="ELEC_ID1" type="text" class="input_form1"	style="width:150px" value="${userView.ELEC_ID}" maxlength="13">
								</td>
							</tr>
							<tr>
								<td height="30" align="center" >새올행정 사용자  ID</td>
								<td class="table_bl_left" align="left">
								<input id="SAEALL_ID1" name="SAEALL_ID1" type="text" class="input_form1"	style="width:150px" value="${userView.SAEALL_ID}" maxlength="13">
								</td>
							</tr>
						</table>
						</div>
						
						<div id="input_pass" style="width:100%;display:none;">
						<table width="485" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0" class="sub_table">
							<tr>
								<td width="90" height="30" align="center" >세외수입 사용자 ID</td>
								<td width="375" class="table_bl_left" align="left">
								<input id="BUKWA_ID2" name="BUKWA_ID2" type="password" class="essential"	style="width:150px" value="${userView.BUKWA_ID}" maxlength="13" onkeydown="onlyNumberInput()">
								<font color="blue" style="font-size:11px;">(주민번호 입력, '-'제외)</font>
								</td>
							</tr>
							<tr>					
								<td height="30" align="center" bgcolor="f2f2f2">전자결제 사용자 ID</td>
								<td class="table_bl_left" bgcolor="f2f2f2" align="left">
								<input id="ELEC_ID2" name="ELEC_ID2" type="password" class="input_form1"	style="width:150px" value="${userView.ELEC_ID}" maxlength="13">
								</td>
							</tr>
							<tr>
								<td height="30" align="center" >새올행정 사용자  ID</td>
								<td class="table_bl_left" align="left">
								<input id="SAEALL_ID2" name="SAEALL_ID2" type="password" class="input_form1"	style="width:150px" value="${userView.SAEALL_ID}" maxlength="13">
								</td>
							</tr>
						</table>
						</div>
						</td>
						</tr>
</table>						
<table align="center">
	<td height="50" colspan="3" align="center"><a href="#"><img
		src="/img/mod_icon.gif" alt="수정" width="56" height="18" border="0" onClick="javascript:fn_upDate();"></a><a
		href="#"><img src="/img/can_icon.gif" alt="취소" width="56"
		height="18" border="0" onClick=javascript:window.close();></a></td>
</table>
<input id="BUKWA_ID" name="BUKWA_ID" type="hidden" value="">
<input id="ELEC_ID" name="ELEC_ID" type="hidden" value="">
<input id="SAEALL_ID" name="SAEALL_ID" type="hidden" value="">
<script language="javascript">
<!--
	setSelectedOption(document.regForm.SIGU_CD, "${siguCode}");
	setSelectedOption(document.regForm.SECTION, "${section}");
//-->
</script> 
</form>
</body>
</html>

