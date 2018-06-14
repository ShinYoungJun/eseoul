<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
	background-image: url(/img/left_back.gif);
}

.pw_li
{
	list-style: none;
}

.pw_text
{
	display: inline-block;
	width: 120px;
	text-align: right;
	margin-right: 10px;
}
	
</style>
-->
</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
<script language="javascript" src="/js/common.js"></script>
</head>
<script type="text/javascript">

function checkPW()
{
	var currentPW = document.getElementById("currentPW").value;
	var newPW = document.getElementById("newPW").value;
	var checkPW = document.getElementById("checkPW").value;
	
	console.log("currentPW: " + currentPW);
	console.log("newPW: " + newPW);
	console.log("checkPW: " + checkPW);
}

function fnCheckPassword() {

	var upw = document.getElementById("newPW").value;

	var chk_num = upw.search(/[0-9]/g); 
	var chk_eng = upw.search(/[a-z]/ig); 
	var strSpecial = upw.search(/[`~!@#$%^&*|\\\'\";:\/?]/gi);

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


//space 가 있으면 true, 없으면 false
function checkSpace( str )
{
   if(str.search(/\s/) != -1){
    return true;
   } else {
      return false;
   }
}

//패스워드 확인
function fn_pwCheck()
{	
    var fm = document.pwchangeForm; 
    
	if(fm.newPW.value != fm.checkPW.value)
	{	 
		alert("패스워드를 정확히 입력 해 주세요.");
		fm.newPW.focus();
		fm.checkPW.select();
		return false;
	}
	return true;			
}

function checkCurrentPW(isChange){
	
	var w = document.pwchangeForm;
	var currentPW = document.getElementById("currentPW").value;
	var newPW = document.getElementById("newPW").value;
	var parameter;
	if(isChange == "true"){
		if(!(fnCheckPassword())) return;
		if(!fn_pwCheck()) return;
		if(!checkStrNVMsg(w.newPW,"패스워드"))return;
		
		parameter = "?userId="+"${sessionUserId}"+"&currentPW="+currentPW+"&newPW="+newPW;
		w.action = "/admin/user/changePwd.do" + parameter;
	}else{
		parameter = "?userId="+"${sessionUserId}"+"&currentPW=false";
		w.action = "/admin/user/changePwd.do" + parameter;
	}
	alert(parameter);
	w.submit();
	
}


</script>

<body>
<form name="pwchangeForm" id="pwchangeForm" method="post">
	<div align="center" style="margin-top: 100px;">
		<ul>
			<li class="pw_li" style="margin-bottom: 30px;">
				<p>
					<font color="#34862E" style="font-size:15px; ">[비밀번호 변경 안내]<br></font>
					<font color="" style="font-size:14px;">개인정보보호와 안전한 사이트 이용을 위해<br></font>
					<font color="" style="font-size:14px;">6개월 마다 비밀번호 변경을 권장하고 있사오니<br></font>
					<font color="" style="font-size:14px;">비밀번호를 변경해 주시기 바랍니다.<br></font>
				</p>
			</li>
			<li class="pw_li" style="margin-bottom: 10px;">
				<a class="pw_text">현재 비밀번호</a><a><input type="text" id="currentPW"></a>
			</li>
			<li class="pw_li">
				<a class="pw_text">새 비밀번호</a><a><input type="text" id="newPW" onkeyup="fnCheckPassword();"></a>
			</li>
			<li class="pw_li">
				<font color="#FF5A5A" style="font-size:11px;" id="message"></font>
			</li>
			<li class="pw_li" style="margin: 3px 0 3px 0;">
				<a class="pw_text">비밀번호 확인</a><a><input type="text" id="checkPW" onChange="fn_pwCheck();"></a>
			</li>
			<li class="pw_li" style="margin: 3px 0 3px 0;">
			<font style="font-size:11px; margin-left: 10px;">13자 이상, 숫자와 문자의 조합으로 입력해주세요.</font>
			</li>
			<li class="pw_li" style="margin: 30px 0 3px 0;">
				<input type="button" onclick="checkCurrentPW('true')" value="지금변경">
			</li>
			<li class="pw_li" style="margin: 3px 0 3px 0;">
				<input type="button" onclick="checkCurrentPW('false')" value="나중에(6개월 뒤) 변경">
			</li>
		</ul>
		
	</div>
</form>
</body>
</html>











