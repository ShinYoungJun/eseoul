<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/include.jsp" %>      
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />

<title>::::: ����� ������������ý��� :::::</title>
<style type="text/css">

<!--
body {
	margin: 0px;
}
-->

</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
</head>

<script type="text/javascript">
//<![CDATA[

	function goModify()
	{
		location.href = "/jsp/gapan/gapan/tab/oper_modify.jsp";
	}
	
	function	Init_SANCheck(san)
	{
		if(san	== '1')	//	�� üũ
			document.getElementById("SAN_CK").checked	= true;
		else
			document.getElementById("SAN_CK").checked	= false;
	}
		

	function	Init_UseType(sel)
	{
		document.getElementById("UseType1").style.display = "none";
		document.getElementById("UseType2").style.display = "none";
		
		if(sel == '2' || sel == '3')
			document.getElementById("UseType2").style.display = "block";	//	��õ, ����
		else						
			document.getElementById("UseType1").style.display = "block";	//	����	
	}

	function	Init_UseSection(sel)
	{
		if(sel == '1')
			document.getElementById("UseSection").style.display = "block";	//	����
		else
			document.getElementById("UseSection").style.display = "none";
	}	

	function 	Init()
	{
		parent.TabUp_Img("oper");
	}
	
//]]>
</script>

<body onload="Init();">
<form name="form" method="post">
<input type="hidden" name="GAPAN_NO" value="${GAPAN_NO}">

<table width="780" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td align="left" class="contborder_purple">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>
			<td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
								
				<tr>
				  <td width="15%" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">���ǰ��</td>
				  <td  width="35%" bgcolor="eaeaea" class="table_bl_left">${info.SG_TYP}
				  </td>
				  <td width="15%" align="center" bgcolor="e5eff8" class="sub_table_b">�㰡����</td>
				  <td bgcolor="eaeaea" class="table_bl_left">
				  ${info.PERMIT_DATE}
				  </td>
				</tr>
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">��ǰ�з�</td>
				  <td bgcolor="eaeaea" class="table_bl_left">${info.SG_SEL}
				  </td>
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">�ϸ����</td>
				  <td bgcolor="eaeaea" class="table_bl_left">${info.DAY_SALES}
				  </td>
				</tr>
				
				<tr style="display:block" id="UseType1">
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�����ο�</td>
				  <td bgcolor="eaeaea" class="table_bl_left">${info.MEM_NUM}
				  </td>
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">���Դ�ü</td>
				  <td bgcolor="eaeaea" class="table_bl_left">${info.UN_TYP}
				  </td>
				</tr>
			
				<tr style="display:block" id="UseType1">
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">��ð� </td>
				  <td bgcolor="eaeaea" class="table_bl_left">${info.OPEN_TIME} ~ ${info.CLOSE_TIME}
				  </td>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">��Ÿ����</td>
				  <td bgcolor="eaeaea" class="table_bl_left">${info.NOTES}</td>	
				</tr>
							              
		</table></td>
	</tr>
	
	<tr>
		<td height="40" align="right"><a href="javascript:goModify();"><img
			src="/img/mod_icon.gif" alt="����" width="56" height="18"
			border="0"></a></td>
	</tr>

</table>
</body>
</html>