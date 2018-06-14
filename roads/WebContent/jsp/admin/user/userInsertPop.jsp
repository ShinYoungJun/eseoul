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
<script language="javascript" src="/js/Check_inputbox.js"></script> 
<script type="text/javascript">

	
	//패스워드 확인
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
	
    //저장       
	function fn_insert()
	{	
		var w = document.regForm;
		document.getElementById("SIGU_CD").disabled = false;	// SIGU_CD가 disabled가 되면 값 넘길때 null로 받기 때문에 disabled를 풀어준다.
		if(w.USER_ID.value.length<6 || w.USER_ID.value.length>13){
			alert("아이디는 최소 6자 최대 13자 가능합니다.");
			w.USER_ID.value="";
			w.USER_ID.focus();
			return;
		}
		
		if(!fnCheckPassword()) {
			w.PW.focus();
			w.PW.select();
			return;
		}
		if(!fn_pwCheck()) return;
		if(!isEmail(w.EMAIL)) return;	
		if(!checkStrNVMsg(w.SIGU_CD,"소속기관"))return;
		if(!checkStrNVMsg(result.listForm.deptCode,"소속부서"))return;
		if(!checkStrNVMsg(w.NAME,"이름"))return;
		if(!checkStrNVMsg(w.USER_ID,"아이디"))return;
		if(!checkStrNVMsg(w.PW,"패스워드"))return;
		if(!checkStrNVMsg(w.SECTION,"사용자등급"))return;
		if(!checkStrNVMsg(w.work_id1,"주민등록번호"))return;
		if(!checkStrNVMsg(w.work_id2,"주민등록번호"))return;
		if(w.input_type.value=="text")
			if(!checkStrNVMsg(w.BUKWA_ID1,"세외수입 사용자 ID"))return;
		if(w.input_type.value=="pass")			
			if(!checkStrNVMsg(w.BUKWA_ID2,"세외수입 사용자 ID"))return;
			
		setWork_id();
		setTel(); 
		setHP();  
		w.DEPT_CD.value = result.listForm.deptCode.value; 
				
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

	//전화번호 입력시 포커스이동
	function fn_checklength(nextfield,chars,currfield) {
	
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
		
	function changeFocus(varControl, varNext)
	{
		var w = document.regForm;
		
		if(w.ssn1.value.length == 6 && w.ssn2.value.length == 7)
			return;
		
		if(varControl.value.length == varControl.maxLength)
		{
			varNext.focus();
			varNext.select(); 
		}
	}
		
	//저장 후처리
	function fn_callBack()
	{
		var fm = document.regForm; 
		
	   	if(fm.result.value != "") 
		{
			if(fm.result.value == 'true')
			{   
				alert("저장에 성공했습니다!");
				
				if(opener.result){
					var w = opener.document.listForm;
					w.deptCode.value = opener.result.listForm.deptCode.value; 
					w.action = "/admin/user/user.do";		
					w.submit();	
				}
				window.close();
	    		
	    	}else if(fm.checkResult.value == "false"){
	    			alert("중복된 ID입니다!");		    				    			
	    	}else{
	    			alert("저장에 실패했습니다!");	    			
	    	}
		}
	}
	
	//ID중복 체크
	function fn_idCheck()
	{
		
		var w = document.idForm;
		w.action = "/admin/user/userReg.do";
		w.submit();	
	}

	//구코드 변경시 부서코드list 조회
	function fn_guChange()
	{
		var sigucd = document.regForm.SIGU_CD.value;			
		result.getDeptCode(sigucd);  
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
	
	function init(){
		var w = document.regForm;

		if(w.input_type.value=="text"){		//받은 input_type이  text이면 			
			document.getElementById("input_text").style.display = "block";
		}else if(w.input_type.value=="pass"){
			document.getElementById("input_pass").style.display = "block";
		}

		if(w.org_cd.value!=""){
			document.getElementById("SIGU_CD").value=w.org_cd.value;
			fn_guChange();
			document.getElementById("SIGU_CD").disabled = true;
		}
		if(w.org_cd.value=="0000000")
			document.getElementById("SIGU_CD").disabled = false;
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
		var keyword = document.getElementById("USER_ID").value;
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

	function fnCheckPassword() {

		var upw = document.getElementById("PW").value;
		var uid = document.getElementById("USER_ID").value;

		var chk_num = upw.search(/[0-9]/g); 
		var chk_eng = upw.search(/[a-z]/ig); 
		var strSpecial = upw.search(/[`~!@#$%^&*|\\\'\";:\/?]/gi);

		/*
		 if( upw.indexOf( uid ) > -1) {
			 document.getElementById("message").innerHTML = "비밀번호에 ID를 포함할수 없습니다.";
			 return false;
		 }
		*/
		
		 /* check whether input value is included space or not  */
		 var retVal = checkSpace( upw );
		 if( retVal ) {
			document.getElementById("message").innerHTML = "비밀번호는 공백없이 입력해 주세요.";
			 return false;
		 }

		 if(upw.length < 9){
			document.getElementById("message").innerHTML = "9자 이상의 비밀번호만 입력 가능 합니다.";
			return false;
		 }

		if(upw.length > 14){
			document.getElementById("message").innerHTML = "13자 이하의 비밀번호만 입력 가능 합니다.";
		   return false;
		 }

		 if(chk_num < 0 || chk_eng < 0){ 
			document.getElementById("message").innerHTML = "비밀번호는 문자, 숫자가 조합 되어야 합니다.";
		   return false; 
		 }

		document.getElementById("message").innerHTML = "";
	    return true;

	}

// space 가 있으면 true, 없으면 false
function checkSpace( str )
{
     if(str.search(/\s/) != -1){
      return true;
     } else {
        return false;
     }
}
</script>

<body onload="init();fn_callBack();">

<form name="regForm" id="regForm" method="post">
<input id="modeType" name="modeType" type="hidden" value="${modeType}">
<input id="result" name="result" type="hidden" value="${result}">
<input id="checkResult" name="checkResult" type="hidden" value="${checkResult}">
<input id="DEPT_CD" name="DEPT_CD" type="hidden" >
<input id="input_type" name="input_type" type="hidden" value="${input_type}">
<input id="org_cd" name="org_cd" type="hidden" value="${org_cd}">

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
						<select id="SIGU_CD" name="SIGU_CD" class="essential" style="width:100px" onchange="fn_guChange();">
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
						</iframe>
						</td>
						
					</tr>
					<tr>
						<td height="26" align="center">담당업무</td>
						<td class="table_bl_left" colspan="3">
						<input id="POSITION" name="POSITION" type="text" class="input_form1" maxlength="15" style="width:150px" value="${userReg.POSITION}">
						</td>
					</tr>
					<tr>
						<td height="26" align="center" bgcolor="f2f2f2">이 름</td>
						<td bgcolor="f2f2f2" class="table_bl_left" colspan="3">
							<input id="NAME" name="NAME" type="text" class="essential"  maxlength="20" style="width:150px" value="${userReg.NAME}">
						</td>
					</tr>
					<tr>
						<td height="26" align="center">아이디</td>
						<td class="table_bl_left" colspan="3">
							<input name="USER_ID" id="USER_ID" type="text" class="essential" maxlength="13" style="width:150px" onkeyup="koreaCheck();" value="${userReg.USER_ID}">				
							<font color="blue" style="font-size:11px;">(영문,숫자 포함 최소 6자  최대13자 가능)</font>
						</td>			   
					</tr>
					<tr>
						<td height="26" align="center" bgcolor="f2f2f2">패스워드</td>
						<td bgcolor="f2f2f2" class="table_bl_left" colspan="3">
							<input id="PW" name="PW" type="password" class="essential" maxlength="13"  style="width:150px" value="${userReg.PW}" onkeyup="fnCheckPassword();">
							<font color="red" style="font-size:11px;" id="message"></font>
						</td>
					</tr>
					<tr>
						<td height="26" align="center">패스워드확인</td>
						<td class="table_bl_left" colspan="3">
							<input id="pwConfirm" name="pwConfirm" type="password" class="essential"  maxlength="13" style="width:150px" onChange="javascript:fn_pwCheck();"></td>
					</tr>
					<tr>
						<td height="26" align="center" bgcolor="f2f2f2">사용자등급</td>
						<td class="table_bl_left" colspan="3" bgcolor="f2f2f2">
						<select id="SECTION" name="SECTION" class="essential" style="width:140px">
							<option value="">선택하세요</option>
							<option value="1">관리자</option>
							<option value="2">부서업무담당자</option>
						</select>
						</td>
					</tr>					
					<tr>
						<td height="26" align="center" >전화번호</td>
						<td class="table_bl_left" colspan="3">
						<input id="tel1" name="tel1" type="text" class="input_form1" style="width:30px;ime-mode:disabled" maxlength="3" onkeyup="fn_checklength('tel2',3,this.name);" onkeydown="onlyNumberInput();"> -
						<input id="tel2" name="tel2" type="text" class="input_form1" style="width:40px;ime-mode:disabled" maxlength="4" onkeyup="fn_checklength('tel3',4,this.name);" onkeydown="onlyNumberInput();"> -
						<input id="tel3" name="tel3" type="text" class="input_form1" style="width:40px;ime-mode:disabled" maxlength="4" onkeydown="onlyNumberInput();">  내선:
						<input id="TEL_EXT" name="TEL_EXT" type="text" class="input_form1" style="width:20px;ime-mode:disabled" maxlength="3" onkeydown="onlyNumberInput();"> 	
						</td>
						<input id="TEL" name="TEL" type="hidden" class="input_form1">
					</tr> 
					<tr>
						<td height="26" align="center" bgcolor="f2f2f2">휴대폰번호</td>
						<td class="table_bl_left" colspan="3" bgcolor="f2f2f2">
						<input id="hp1" name="hp1" type="text" class="input_form1" style="width:30px;ime-mode:disabled" maxlength="3" onkeyup="fn_checklength('hp2',3,this.name);" onkeydown="onlyNumberInput();"> -
						<input id="hp2" name="hp2" type="text" class="input_form1" style="width:40px;ime-mode:disabled" maxlength="4" onkeyup="fn_checklength('hp3',4,this.name);" onkeydown="onlyNumberInput();"> -
						<input id="hp3" name="hp3" type="text" class="input_form1" style="width:40px;ime-mode:disabled" maxlength="4" onkeydown="onlyNumberInput();">
						<input id="HP" name="HP" type="hidden" class="input_form1">	
						</td>
					</tr>
					<tr>
						<td height="26" align="center" >E-mail</td>
						<td class="table_bl_left" colspan="3">
							<input id="EMAIL" name="EMAIL" type="text" class="input_form1" maxlength="50" style="width:200px" value="${userReg.EMAIL}">
						</td>
					</tr>
					<tr>					
						<td height="26" align="center" bgcolor="f2f2f2">주민등록번호</td>
						<td class="table_bl_left" colspan="3" bgcolor="f2f2f2">
							<input id="work_id1" name="work_id1" type="text" class="essential" style="width:100px" maxlength="6" onkeydown="nr_num_int(this);" onkeyup="nr_num_int(this);fn_checklength('work_id2',6,this.name);" >						
							-
							<input id="work_id2" name="work_id2" type="password" class="essential" style="width:100px" maxlength="7" onkeydown="nr_num_int(this);" onkeyup="nr_num_int(this);">
							<input id="WORK_ID" name="WORK_ID" type="hidden" style="width:200px">
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
								<input id="BUKWA_ID1" name="BUKWA_ID1" type="text" class="essential" style="width:200px" value="${userView.BUKWA_ID}" maxlength="13" onkeydown="onlyNumberInput()">
								<font color="blue" style="font-size:11px;">(주민번호 입력, '-'제외)</font>
								</td>
							</tr>
							<tr>					
								<td height="30" align="center" bgcolor="f2f2f2">전자결제 사용자 ID</td>
								<td class="table_bl_left" bgcolor="f2f2f2" align="left">
								<input	id="ELEC_ID1" name="ELEC_ID1" type="text" class="input_form1"	style="width:200px" value="${userView.ELEC_ID}" maxlength="13">
								</td>
							</tr>
							<tr>
								<td height="30" align="center" >새올행정 사용자  ID</td>
								<td class="table_bl_left" align="left">
								<input id="SAEALL_ID1" name="SAEALL_ID1" type="text" class="input_form1"	style="width:200px" value="${userView.SAEALL_ID}" maxlength="13">
								</td>
							</tr>
						</table>
						</div>
						
						<div id="input_pass" style="width:100%;display:none;">
						<table width="485" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0" class="sub_table">
							<tr>
								<td width="90" height="30" align="center" >세외수입 사용자 ID</td>
								<td width="375" class="table_bl_left" align="left">
								<input id="BUKWA_ID2" name="BUKWA_ID2" type="password" class="essential" style="width:200px" value="${userView.BUKWA_ID}" maxlength="13" onkeydown="onlyNumberInput()">
								<font color="blue" style="font-size:11px;">(주민번호 입력, '-'제외)</font>
								</td>
							</tr>
							<tr>					
								<td height="30" align="center" bgcolor="f2f2f2">전자결제 사용자 ID</td>
								<td class="table_bl_left" bgcolor="f2f2f2" align="left">
								<input id="ELEC_ID2" name="ELEC_ID2" type="password" class="input_form1"	style="width:200px" value="${userView.ELEC_ID}" maxlength="13">
								</td>
							</tr>
							<tr>
								<td height="30" align="center" >새올행정 사용자  ID</td>
								<td class="table_bl_left" align="left">
								<input id="SAEALL_ID2" name="SAEALL_ID2" type="password" class="input_form1"	style="width:200px" value="${userView.SAEALL_ID}" maxlength="13">
								</td>
							</tr>
						</table>
						</div>
						</td>
						</tr>
</table>
<div style="font-size: 12px; margin-top: 10px; margin-left: 10px; color:red"> 신청하신 후 서울시 보도환경개선과(02-2133-8133)로 승인요청하시면 됩니다.</div>
<table align="center"><tr>
	<td height="50" colspan="3" align="center"><a href="#"><img
		src="/img/save_icon2.gif" alt="저장" width="56" height="18" border="0" onClick="javascript:fn_insert();"></a><a
		href="#"><img src="/img/can_icon.gif" alt="취소" width="56"
		height="18" border="0" onClick=javascript:window.close();></a></td></tr>
</table>
<input name="BUKWA_ID" type="hidden" value="">
<input name="ELEC_ID" type="hidden" value="">
<input name="SAEALL_ID" type="hidden" value="">
</form>
</body>
</html>

