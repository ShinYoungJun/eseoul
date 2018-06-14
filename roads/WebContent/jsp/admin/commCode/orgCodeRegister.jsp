<%@page contentType="text/html;charset=euc-kr" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />
<title>부서코드 등록</title>
<style type="text/css">
<!--
body,td,th {
	font-family: 돋움;
	font-size: 12px;
	color: #053e8a;
}
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}
.style1 {color: #000000}
.style3 {color: #FF6600; font-weight: bold; }

-->
</style>
<script language="JavaScript" src="/js/common.js"></script>
<script language="javascript">
//<!--
 	function onSubmit()
	{ 		
 		var w = document.form;
 		 	 		
		if(siguCheck(w.GU_CD_SELECT.value)){
			if(w.DEPT_CD.value ==""){
				alert("부서코드를 입력해주세요");
				w.DEPT_CD.focus();
				return
			}
			if(getByteLength(w.DEPT_CD)>7){
				alert("부서코드는  7Byte 를 초과할 수 없습니다.\r\n(한글2byte, 영문/숫자 1byte)");
				w.DEPT_CD.focus();
				return
			}
			
			if(getByteLength(w.DEPT_NM)>50){
				alert("부서명은 50Byte 를 초과할 수 없습니다.\r\n(한글2byte, 영문/숫자 1byte)");
				w.DEPT_NM.focus();
				return
			}
			if(getByteLength(w.MANAGE_WORK)>50){
				alert("담담업무 50Byte 를 초과할 수 없습니다.\r\n(한글2byte, 영문/숫자 1byte)");
				w.MANAGE_WORK.focus();
				return
			}
			
			w.submit();
		}else{
			w.GU_CD.focus();
			return
		}		
		
	}

	function cancel(){
		window.close();
	}
		
	function InitPage(){		
		
		var params = getUrlParameter() || {
			act : '${act}'
		} ;
		var action = params['act'];
		var contextTitle = document.getElementById('title');
		var eleAction = document.getElementById('ACTION');
		eleAction.value = action;
		switch(action) {
			case 'add': {
				document.title = '부서코드 등록';
				contextTitle.innerText = '* 부서코드 등록';
				break;
			}
			case 'mod': {
				document.title = '부서명 변경';
				contextTitle.innerText = '* 부서명 변경';
				var guSelect = document.getElementById('GU_CD_SELECT');
				var deptCD = document.getElementById('DEPT_CD');
				guSelect.disabled = true;
				deptCD.readOnly = true;
				break;
			}
		}
		
		if('${YN}'== 'true'){
//			opener.location.reload('/admin/commCode/orgCode.do'); 
			var results = {
					DEPT_CD : '${DEPT_CD}',
					DEPT_NM : '${DEPT_NM}',
					MANAGE_WORK : '${MANAGE_WORK}'
			};
			document.getElementById('DEPT_CD').value = results.DEPT_CD;
			document.getElementById('DEPT_NM').value = results.DEPT_NM;
			document.getElementById('MANAGE_WORK').value = results.MANAGE_WORK;
    }			
		if('${MSG}'.length > 0){
            alert('${MSG}');
    }
		if ('${YN}' == 'true') {
			window.close();			
		}
  }
	  
	function  siguCheck(code)
	{	
		if(code=="000"){
			alert("시군구명을 선택해주세요.");
			return false;
		}else{
			document.getElementById('GU_CD').value = code;
			return true;
		}
	}
    
	
//-->
</script>
</head>

<body onload="javascript:InitPage();">
<form id="form" name="form" method="post" action="/admin/commCode/orgCodeRegister.do">
<input type="hidden" id="ACTION" name="ACTION" value="add"/>
<input type="hidden" id="MSG" name="MSG" value="${MSG}"/>
<table width="580" height="130" border="0" cellspacing="0" cellpadding="0">

	<tr>
		<td height="30px" style="padding:6" valign="bottom"><span id="title" class="sub_stan_blue" style="font-weight: bold;">* 부서코드 등록 </span></td>
	</tr>
	<tr>
		<td style="padding:6" valign="top">
			<table width="100%" border="1" bordercolor="#c9dfed"
				style="border-collapse:collapse;" cellpadding="0" cellspacing="0"
				class="sub_table">
				<tr>
					<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">시군구명</td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">부서코드</td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">부서명</td>								
					<td align="center" bgcolor="e5eff8" class="sub_table_b">담당업무</td>
				</tr>
				 <tr>												
					<td height="26" align="center">
						<input id="GU_CD" name="GU_CD" type="hidden" value="000"/>
						<select id="GU_CD_SELECT" name="GU_CD_SELECT" class="input_form1" style="width:130px">
							${GU_CODE}
						</select>
					</td>
					<td align="center">
						<input type="text" name="DEPT_CD" id="DEPT_CD" size="10" maxlength="7" class="input_form1"/>
					</td>
					<td align="center">
						<input type="text" name="DEPT_NM" id="DEPT_NM" size="20"  maxlength="50" class="input_form1"/>					 
					</td>
					<td align="center">
						<input type="text" name="MANAGE_WORK" id="MANAGE_WORK" size="20"  maxlength="50" class="input_form1"/>					 
					</td>																							
				</tr>
			</table>
		</td>
	</tr>
	<tr>
		<td align="right" width="100%" style="padding-right: 6;">
			<img id="imgRegister" src="/img/register_icon2.gif" alt="등록" width="56" height="18" border="0" style="cursor: pointer;display: none;" onclick="javascript:onSubmit()">
			<img id="imgModify" src="/img/mod_icon.gif" alt="수정" width="56" height="18" border="0" style="cursor: pointer;display: none;" onclick="javascript:onSubmit()">
			<img src="/img/can_icon.gif" alt="취소" width="56" height="18" border="0" style="cursor: pointer;" onclick="javascript:cancel()">
		</td>
	</tr>
</table>

</form>
</body>
</html>
			