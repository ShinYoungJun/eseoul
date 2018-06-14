<%@page contentType="text/html;charset=euc-kr" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />
<title>�μ��ڵ� ���</title>
<style type="text/css">
<!--
body,td,th {
	font-family: ����;
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
				alert("�μ��ڵ带 �Է����ּ���");
				w.DEPT_CD.focus();
				return
			}
			if(getByteLength(w.DEPT_CD)>7){
				alert("�μ��ڵ��  7Byte �� �ʰ��� �� �����ϴ�.\r\n(�ѱ�2byte, ����/���� 1byte)");
				w.DEPT_CD.focus();
				return
			}
			
			if(getByteLength(w.DEPT_NM)>50){
				alert("�μ����� 50Byte �� �ʰ��� �� �����ϴ�.\r\n(�ѱ�2byte, ����/���� 1byte)");
				w.DEPT_NM.focus();
				return
			}
			if(getByteLength(w.MANAGE_WORK)>50){
				alert("������ 50Byte �� �ʰ��� �� �����ϴ�.\r\n(�ѱ�2byte, ����/���� 1byte)");
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
				document.title = '�μ��ڵ� ���';
				contextTitle.innerText = '* �μ��ڵ� ���';
				break;
			}
			case 'mod': {
				document.title = '�μ��� ����';
				contextTitle.innerText = '* �μ��� ����';
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
			alert("�ñ������� �������ּ���.");
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
		<td height="30px" style="padding:6" valign="bottom"><span id="title" class="sub_stan_blue" style="font-weight: bold;">* �μ��ڵ� ��� </span></td>
	</tr>
	<tr>
		<td style="padding:6" valign="top">
			<table width="100%" border="1" bordercolor="#c9dfed"
				style="border-collapse:collapse;" cellpadding="0" cellspacing="0"
				class="sub_table">
				<tr>
					<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">�ñ�����</td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">�μ��ڵ�</td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">�μ���</td>								
					<td align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
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
			<img id="imgRegister" src="/img/register_icon2.gif" alt="���" width="56" height="18" border="0" style="cursor: pointer;display: none;" onclick="javascript:onSubmit()">
			<img id="imgModify" src="/img/mod_icon.gif" alt="����" width="56" height="18" border="0" style="cursor: pointer;display: none;" onclick="javascript:onSubmit()">
			<img src="/img/can_icon.gif" alt="���" width="56" height="18" border="0" style="cursor: pointer;" onclick="javascript:cancel()">
		</td>
	</tr>
</table>

</form>
</body>
</html>
			