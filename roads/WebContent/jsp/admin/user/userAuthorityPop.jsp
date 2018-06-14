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

	//메뉴list 조회           
	function reSearch()		//안씀
	{	
		var w = document.regForm;

		w.action = "/admin/user/userAuthority.do";		
		w.submit();			
	}

	function fn_check()
	{	
		var fm = document.regForm; 
		var listSize = fm.listSize.value;
					
		for(i=1; i<=listSize; i++)
		{	
			if(document.getElementById("checkbox"+i).checked)
				document.getElementById("checkbox"+i).value = 1;
			else
				document.getElementById("checkbox"+i).value = "";	
		}	
	}

	//수정
	function fn_update()
	{	
		fn_check(); 
		var count = 0;
		for(i=1; i<=7;i++){
			if(document.getElementById("checkbox"+i).value == 1){
				count++;
			}
		}

		if(count==0){
			alert("적어도 한개이상 체크 하셔야 합니다.");
			return;
		}

		if(document.getElementById("admin").value == 0){
			if(document.getElementById("userGrade").value == 1){
				alert("부서업무 담당자는 관리자 등급으로 바꿀 수 없습니다.");
				return;
			}
		}

		if(document.getElementById("userGrade").value == 1){
			if(!document.getElementById("checkbox7").value == 1){
				alert("사용자 등급이 관리자이면 관리자 항목은 체크 해야 합니다.");
				return;
			}
		}
		
		if(document.getElementById("userGrade").value == 2){
			if(document.getElementById("checkbox7").value == 1){
				alert("부서업무 담당자는 관리자 기능을 체크 할 수 없습니다.");
				return;			
			}
		}				
		
		
		var w = document.regForm;			
		w.action = "/admin/user/updateAuthority.do";	
		w.submit();	
	}
	
	//전체선택
	function fn_allSelect()	
	{
		var w = document.regForm;	
		var rowCount = document.getElementById("listSize").value;
		
		if (w.allCheck.checked)
		{
			for(i=1; i<= rowCount; i++)
			{	
				document.getElementById("checkbox"+i).checked = true;	
			}	
		}
		else		 
		{
			for(i=1; i<= rowCount; i++)
			{	
				document.getElementById("checkbox"+i).checked = false;					
			}
		}
	}	
	
	//조회후 체크박스 update
	function init()
	{
		var w = document.regForm;
		var rowCount = document.getElementById("listSize").value;

		for(i=1; i<= rowCount; i++)
		{	
			if(document.getElementById("checkbox"+i).value == '1')  	
			 	document.getElementById("checkbox"+i).checked = true;
		}			
		
		setSelectedOptionByName(document.getElementById("userGrade"),document.getElementById("user_Grade").value);
		if(document.getElementById("userGrade").value == 1){
			document.getElementById("admin").value = 1;
		}
	}	
	
	function fn_callBack()
	{
		if(document.getElementById("result").value == "true"){
			alert("저장에 성공하였습니다!");
			var w = opener.document.listForm;
			w.deptCode.value = opener.result.listForm.deptCode.value; 
			w.action = "/admin/user/user.do";		
			w.submit();
			window.close();
		}
	}
		
</script>

<body onload="init();fn_callBack();">
<form name="regForm" id="regForm" method="post" >
<input id="listSize" name="listSize" value="${listSize}" type="hidden">
<input id="menuCode" name="menuCode" type="hidden">
<input id="chk" name="chk" type="hidden">
<input id="result" name="result" type="hidden"  value="${result}">
<input id="modeType" name="modeType" type="hidden" value="updateAuthority"> 
<input id="user_Grade" name="user_Grade" type="hidden" value="${userGrade}"> 
<input id="user_id" name="user_id" type="hidden" value="${user_id}">
<input id="admin" name="admin" type="hidden" value="0">

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
				<td background="/img/admin_pop_cen.gif"><span class="admin_w_b">메뉴
				사용권한 설정</span></td>
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
				<td height="10"></td>
			</tr>
			<table width="100%" border="1" bordercolor="#c9dfed"
				style="border-collapse:collapse;" cellpadding="0" cellspacing="0"
				class="sub_table">
				<tr>
					<td width="40%" height="28" align="center" class="sub_table_b">사용자
					등급</td>
					<td class="table_bl_left">
						<select id="userGrade" name="userGrade" class="input_form1" style="width:140px">
							<!--select name="userGrade" class="input_form1" style="width:140px" onchange="reSearch();"-->
							<option value="">선택하세요</option>
							<option value="1">관리자</option>
							<option value="2">부서업무담당자</option>						
						</select></td>
				</tr>
				<table>
					<tr>
						<td height="1"></td>
					</tr>
				</table>
				<table width="100%" border="1" bordercolor="#c9dfed"
					style="border-collapse:collapse;" cellpadding="0" cellspacing="0"
					class="sub_table">
					<tr>
						<td height="28" align="center" bgcolor="e5eff8"
							class="sub_table_b">번호</td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">업무(기능)항목</td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">
							<input name="allCheck" id="allCheck" type="checkbox" value="checkbox" onclick="fn_allSelect();" >
						</td>
					</tr>

					<c:forEach items="${authorityList}" var="list" varStatus="idx">
						<tr onMouseOver="this.style.backgroundColor='#f6f7f8'"
							onMouseOut="this.style.backgroundColor=''">
							<td align="center">${list.MENU_CD}</td>
							<td align="center">${list.MENU_NM}</td>
							<td align="center" height="26">	
								<input name="checkbox${list.MENU_CD}" id="checkbox${list.MENU_CD}" type="checkbox" value="${list.CHK}" >
								<input name="menuCd${list.MENU_CD}" id="menuCd${list.MENU_CD}" value="${list.MENU_CD}" type="hidden">
							</td>
						</tr>
					</c:forEach>					
					
				</table>
			</table>
		</table>
		<table align="center">
			<td height="50" colspan="3" align="center"><a href="#"><img
				src="/img/mod_icon.gif" alt="수정" width="56" height="18" border="0"
				onClick="fn_update();"></a><a href="#"><img
				src="/img/can_icon.gif" alt="취소" width="56" height="18" border="0"
				onClick=javascript:window.close();></a></td>
		</table>

<script language="javascript">
<!--
	setSelectedOption(document.regForm.userGrade, "${userGrade}");
//-->
</script></td>
	</tr>
</table>
</form>

</body>
</html>

