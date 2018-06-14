<%@page contentType="text/html;charset=euc-kr" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />
<title>������� ���</title>
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
 	function register()
	{ 		
 		var w = document.form;
 		 	 		

		if(w.ADD_SUM.value ==""){
			alert("������� �������� �Է����ּ���");
			w.ADD_SUM.focus();
			return
		}
		if(w.CNT.value ==""){
			alert("��������� �Է����ּ���");
			w.CNT.focus();
			return
		}
		if(w.ADD_SUM.value >9999){
			alert("�Է��Ͻ� ���������� ���ڰ� �ʹ� Ů�ϴ�.");
			w.ADD_SUM.focus();
			return
		}
		if(w.CNT.value >= 10){
			alert("�Է��Ͻ� ������� ���ڰ� �ʹ� Ů�ϴ�.");
			w.CNT.focus();
			return
		}
		w.submit();
	
		
	}

	function cancel(){
		window.close();
	}
		
	function InitPage(){		
		if('${MSG}'.length > 0){
            alert('${MSG}');
        }
		if('${YN}'== 'true'){
			opener.location.reload('/admin/commCode/jojungCode.do'); 
			window.close();
        }	
    }

    
	
//-->
</script>
</head>

<body onload="javascript:InitPage();">
<form id="form" name="form" method="post" action="/admin/commCode/jojungCodeRegister.do">
<input type="hidden" id="mode" name="mode" value="${mode}"/>
<input type="hidden" id="MSG" name="MSG" value="${MSG}"/>
<input type="hidden" id="modyADD_SUM" name="modyADD_SUM" value="${modyADD_SUM}"/>
<input type="hidden" id="modyCNT" name="modyCNT" value="${modyCNT}"/>

<table width="580" height="130" border="0" cellspacing="0" cellpadding="0">

	<tr>
		<td height="30px" style="padding:6" valign="bottom"><span class="sub_stan_blue"><b>* ������� ��� </b></span></td>
	</tr>
	<tr>
		<td style="padding:6" valign="top">
			<table width="100%" border="1" bordercolor="#c9dfed"
				style="border-collapse:collapse;" cellpadding="0" cellspacing="0"
				class="sub_table">
				<tr>
					<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">������� ������</td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">�������</td>
				</tr>
				 <tr>												
					<td height="26" align="center">
						<c:if test="${mode=='add'}">
						<input type="text" name="ADD_SUM" id="ADD_SUM" size="10" maxlength="4" class="input_form1" onchange="isNum(this,'������� ������')"/>
						</c:if>
						<c:if test="${mode=='modify'}">
						<input type="text" name="ADD_SUM" id="ADD_SUM" size="10" maxlength="4" class="input_form1"  value="${JojungCodeBean.ADD_SUM}" onchange="isNum(this,'������� ������')"/>
						</c:if>
					</td>
					<td align="center">
						<input type="text" name="CNT" id="CNT" size="20"  maxlength="6"  value="${JojungCodeBean.CNT}"  class="input_form1" />					 
					</td>
				</tr>
			</table>
		</td>
	</tr>	
	<tr>
		<td align="center">
			<c:if test="${mode=='add'}">
			<img src="/img/register_icon2.gif" alt="���" width="56" height="18" border="0" style="cursor: pointer;" onclick="javascript:register()">
			</c:if>
			<c:if test="${mode=='modify'}">
			<img src="/img/mod_icon.gif" alt="����" width="56" height="18" border="0" style="cursor: pointer;" onclick="javascript:register()">
			</c:if>
			<img src="/img/can_icon.gif" alt="���" width="56" height="18" border="0" style="cursor: pointer;" onclick="javascript:cancel()">
		</td>
	</tr>
	
	
	
</table>

</form>
</body>
</html>
			