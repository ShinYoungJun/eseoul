<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="/jsp/common/loginCheck.jsp" %>
<%@ include file="/jsp/common/include.jsp" %>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />
<title>::::: ����� ������������ý��� :::::</title>
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
		document.getElementById("message").innerHTML = "��й�ȣ�� ������� �Է��� �ּ���.";
		 return false;
	 }

	 if(upw.length < 9){
		document.getElementById("message").innerHTML = "9�� �̻��� ��й�ȣ�� �Է� ���� �մϴ�.";
		return false;
	 }

	if(upw.length > 14){
		document.getElementById("message").innerHTML = "13�� ������ ��й�ȣ�� �Է� ���� �մϴ�.";
	   return false;
	 }

	 if(chk_num < 0 || chk_eng < 0){ 
		document.getElementById("message").innerHTML = "��й�ȣ�� ����, ���ڰ� ���� �Ǿ�� �մϴ�.";
	   return false;
	 }

	document.getElementById("message").innerHTML = "";
    return true;

}


//space �� ������ true, ������ false
function checkSpace( str )
{
   if(str.search(/\s/) != -1){
    return true;
   } else {
      return false;
   }
}

//�н����� Ȯ��
function fn_pwCheck()
{	
    var fm = document.pwchangeForm; 
    
	if(fm.newPW.value != fm.checkPW.value)
	{	 
		alert("�н����带 ��Ȯ�� �Է� �� �ּ���.");
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
		if(!checkStrNVMsg(w.newPW,"�н�����"))return;
		
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
					<font color="#34862E" style="font-size:15px; ">[��й�ȣ ���� �ȳ�]<br></font>
					<font color="" style="font-size:14px;">����������ȣ�� ������ ����Ʈ �̿��� ����<br></font>
					<font color="" style="font-size:14px;">6���� ���� ��й�ȣ ������ �����ϰ� �ֻ����<br></font>
					<font color="" style="font-size:14px;">��й�ȣ�� ������ �ֽñ� �ٶ��ϴ�.<br></font>
				</p>
			</li>
			<li class="pw_li" style="margin-bottom: 10px;">
				<a class="pw_text">���� ��й�ȣ</a><a><input type="text" id="currentPW"></a>
			</li>
			<li class="pw_li">
				<a class="pw_text">�� ��й�ȣ</a><a><input type="text" id="newPW" onkeyup="fnCheckPassword();"></a>
			</li>
			<li class="pw_li">
				<font color="#FF5A5A" style="font-size:11px;" id="message"></font>
			</li>
			<li class="pw_li" style="margin: 3px 0 3px 0;">
				<a class="pw_text">��й�ȣ Ȯ��</a><a><input type="text" id="checkPW" onChange="fn_pwCheck();"></a>
			</li>
			<li class="pw_li" style="margin: 3px 0 3px 0;">
			<font style="font-size:11px; margin-left: 10px;">13�� �̻�, ���ڿ� ������ �������� �Է����ּ���.</font>
			</li>
			<li class="pw_li" style="margin: 30px 0 3px 0;">
				<input type="button" onclick="checkCurrentPW('true')" value="���ݺ���">
			</li>
			<li class="pw_li" style="margin: 3px 0 3px 0;">
				<input type="button" onclick="checkCurrentPW('false')" value="���߿�(6���� ��) ����">
			</li>
		</ul>
		
	</div>
</form>
</body>
</html>











