<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
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

	function	Modify()
	{
		var form = document.form;

		form.action = "/sisul/sisul/sanchul_modify.do";
		form.submit();
	}

	function 	Init()
	{
		parent.TabDown_Img("sanchul");
	}

//]]>
</script>

<body onload="Init()">
<table width="780" border="0" cellpadding="0" cellspacing="0">
<form name="form" method="post">
<input type="hidden" name="ADMIN_NO" value="${ADMIN_NO}">

	  <tr>
		<td align="left" class="contborder_blue">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
			  <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">

				  <tr>
					<td height="40" colspan="4" align="left" bgcolor="#FFFFFF" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<tr>
						  <td><span class="sub_stan_blue">* �⺻ �����</span></td>
						</tr>
					</table></td>
				  </tr>
				  
				  <tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">�۳⵵ �����</td>
					<td width="181" bgcolor="eaeaea" class="table_bl_left"><input name="ADMIN_NO" type="text" class="input_form1" style="width:120px" value="" readonly></td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">���⵵ �����</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="GUBUN" type="text" class="input_form1" style="width:120px" value="" readonly></td>
				  </tr>
				  
				  <tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">���� ���</td>
					<td width="181" bgcolor="eaeaea" class="table_bl_left"><input name="ADMIN_NO" type="text" class="input_form1" style="width:120px" value="" readonly></td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">���� �����</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="GUBUN" type="text" class="input_form1" style="width:120px" value="" readonly></td>
				  </tr>
				  
				  <tr>
					<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">���� �����</td>
					<td colspan="3" bgcolor="eaeaea" class="table_bl_left"><input name="NOTES" type="text" class="input_form1" style="width:200px" value="" readonly></td>
				  </tr>	
				  
				  <tr>
					<td height="40" colspan="4" align="left" bgcolor="#FFFFFF" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<tr>
						  <td><span class="sub_stan_blue">* ���� ���⳻��</span></td>
						</tr>
					</table></td>
				  </tr>
				  
				  <tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
					<td bgcolor="eaeaea" class="table_bl_left">
					<input name="jumin_bizssn1" type="text" class="input_form1" style="width:120px" value="" readonly>
					<input name="SAN_CK" type="checkbox">�̹ݿ�</td>
					
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">������ �����</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="GUBUN" type="text" class="input_form1" style="width:120px" value="" readonly></td>
				  </tr>
				  
				  <tr>
					<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">���� �����</td>
					<td colspan="3" bgcolor="eaeaea" class="table_bl_left"><input name="NOTES" type="text" class="input_form1" style="width:200px" value="" readonly></td>
				  </tr>	
				  
			  </table></td>
			</tr>

			<tr>
			  <td height="40" align="right">
			  <table width="0" border="0" cellspacing="0" cellpadding="0" align="right">
				<a href="javascript:Modify()"><img src="/img/mod_icon.gif" alt="����" width="56" height="18" border="0"></a>
			  </table>
			  </td>
			</tr>
			
		</table></td>
	  </tr>

</table>

</body>
</html>