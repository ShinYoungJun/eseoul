<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
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
	background-image: url(/img/left_back.gif);
}
-->
</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
<script language="javascript" src="/js/PopupCalendar.js"></script>
<script>

	function InitPage()
	{
		if('${afterSave}' == '1'){
			parent.location.reload();
		}
		
		if(document.getElementById("mode").value == "edit" )
		{
			document.getElementById("view").style.display = "none";
			document.getElementById("edit").style.display= "block";
		}else
		{		
			document.getElementById("edit").style.display = "none";
			document.getElementById("view").style.display = "block";
		}
	}


	function submitClick()
	{
		var disUseForm = document.disUseForm;
		
		if(disUseForm.DISUSE_MANAGER.value==""){
			alert("담당자를 넣어주세요");
			disUseForm.DISUSE_MANAGER.focus()
			return;
		}
		if(disUseForm.DISUSE_DATE.value==""){
			alert("등록일자를 넣어주세요");
			popUpCalendar(document.getElementById('calendar'), document.getElementById('DISUSE_DATE'), 'yyyymmdd');
			return;
		}
		if(disUseForm.DISUSE_REASON.value==""){
			alert("등록이유를  넣어주세요");
			disUseForm.DISUSE_REASON.focus()
			return;
		}


		if(!confirm("폐쇄적용시 모든 기능에서 제외됩니다. 계속 진행하시겠습니까?"))
            return;
		
		var param = parent.document.location;

		parent.document.location=param;
		
		disUseForm.submit();
	}
	
	
	
	
	// 등록폼 체크
	function checkForm(){
		var form1 = document.form1;
		alert(form1.year.value);

		form1.submit();
		//	특수문자 입력시 글 끝에 공백과 줄바꿈을 넣어야 깨지지 않음. 이유는 모르겠슴
		//		w.content.value = w.content.value+' '+'\n';	
		
	}
	
	function goModify()
	{
		var goUrl = "/rojum/jumyong/disUse.do?ADMIN_NO="+document.getElementById("ADMIN_NO").value+"&mode=edit";
		location.href(goUrl);		
	}

	function goDelete()
	{
		if(!confirm("폐쇄적용을 해지하시겠습니까?"))
            return;
		var goUrl = "/rojum/jumyong/disUse.do?ADMIN_NO="+document.getElementById("ADMIN_NO").value+"&mode=del";
		location.href(goUrl);		
	}

	
</script>

</head>

<body onload="javascript:InitPage();">

<form name="disUseForm" id="disUseForm" method="post" action ="/rojum/jumyong/disUse.do">

<input name="ADMIN_NO" id="ADMIN_NO" value="${ADMIN_NO}" type="hidden" >
<input name="mode"  id = "mode" value="${mode}" type="hidden" >
<input name="InspectDate"  id="InspectDate" value="${InspectDate}" type="hidden" >
<input name="OLD_SECTION" id="OLD_SECTION" value="${SECTION }" type="hidden" >
<input name="SECTION" id="SECTION" type="hidden" >


<div id="view" style="width:100%;">
	<table width="510" border="0" cellspacing="0" cellpadding="0">
	    <tr>
	    	<td>							            
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
	        	<tr>
	      			<td>
	       			<table width="100%" border="0" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
			        	<tr>
	                    	<td width="15%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">담당자</td>
		                    <td width="35%" bgcolor="eaeaea" class="table_bl_left">${disuse.DISUSE_MANAGER}</td>
							<td width="15%" width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">등록일</td>
	       		            <td width="35%" bgcolor="eaeaea" class="table_bl_left" >${rnic:addDash(disuse.DISUSE_DATE)}</td>
						</tr>
						<tr>                
							<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">이유</td>
		                    <td bgcolor="eaeaea" class="table_bl_left" colspan="3">${disuse.DISUSE_REASON}</td>
						</tr>						
					</table>
		            </td>
				</tr>
				<tr>              
					<td height="10" align="right" colspan="3">
					</td>
				</tr>
				
				<tr>              
					<td height="10" align="right" colspan="3">
						<img src="/img/discan_icon.gif" alt="해지" width="56" height="18" border="0" onClick="javascript:goDelete();"  style="cursor:pointer">
						<img src="/img/mod_icon.gif" alt="수정" width="56" height="18" border="0" onClick="javascript:goModify();"  style="cursor:pointer">
					</td>
				</tr>
			</table>
			</td>
		</tr>      
	</table>
</div>

<div id="edit" style="width:100%;display:none;">
	<table width="510" border="0" cellspacing="0" cellpadding="0">
	    <tr>
	    	<td>							            
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
	        	<tr>
	      			<td>
	       			<table width="100%" border="0" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
			        	<tr>
	                    	<td width="15%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">담당자</td>
		                    <td width="35%" bgcolor="eaeaea" class="table_bl_left">
			                    <spring:bind path="disuse.DISUSE_MANAGER">
				                    <input name="DISUSE_MANAGER" id="DISUSE_MANAGER" type="text" class="input_form1" style="width:120px" value="${disuse.DISUSE_MANAGER}" maxlength="20">
				                </spring:bind>
			                </td>
							<td width="15%" width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">등록일</td>
	       		            <td width="35%" bgcolor="eaeaea" class="table_bl_left" >
			                    <spring:bind path="disuse.DISUSE_DATE">	       		            
				                    <input name="DISUSE_DATE" id="DISUSE_DATE" type="text" class="input_form1" style="width:120px" value="${rnic:addDash(disuse.DISUSE_DATE)}" readonly>
			                    </spring:bind>
			                    <img id="calendar" src="/img/calendar_icon.gif" style="cursor:pointer;vertical-align: middle;" onclick="popUpCalendar(this, document.getElementById('DISUSE_DATE'), 'yyyymmdd');">
			                </td>
						</tr>
						<tr>                
							<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">이유</td>
		                    <td bgcolor="eaeaea" class="table_bl_left" colspan="3">
			                    <spring:bind path="disuse.DISUSE_REASON">		                    
			                    	<input name="DISUSE_REASON" id="DISUSE_REASON" type="text" class="input_form1" style="width:410px" value="${disuse.DISUSE_REASON}" maxlength="100">
		                    	</spring:bind>
		                    	</td>
		                    	
						</tr>
						
					</table>
		            </td>
				</tr>
				<tr>
					<td height="20" align="right" colspan="4">
						<img src="/img/apply_red.gif" alt="적용"  border="0" onClick="javascript:submitClick();"  style="cursor:pointer">&nbsp;
					</td>
				</tr>
			</table>
			</td>
		</tr>      
	</table>
</div>
</form>




</body>
</html>

