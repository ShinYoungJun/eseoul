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

		form.action = "/sisul/sisul/jumin_modify.do";
		form.submit();
	}

	function 	Init()
	{
		parent.TabUp_Img("jumin");
	}

//]]>
</script>

<body onload="Init()">
<table width="780" border="0" cellpadding="0" cellspacing="0">
<form name="form" method="post">
<input type="hidden" name="ADMIN_NO" value="${ADMIN_NO}">

	<tr>
		<td align="left" class="contborder_purple">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
			  <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
				  <tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">������/���θ�</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="jumin_name" type="text" class="input_form1" style="width:120px" value="${board.NAME}" readonly></td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">�ֹ�/���ι�ȣ</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="jumin_ssn1" type="text" class="input_form1" style="width:60px" value="${jumin_ssn1}" readonly>
					   - <input name="jumin_ssn2" type="text" class="input_form1" style="width:60px" value="${jumin_ssn2}" readonly></td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">����ڵ�Ϲ�ȣ</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="jumin_bizssn1" type="text" class="input_form1" style="width:60px" value="${jumin_bizssn1}" readonly>
					   - <input name="jumin_bizssn2" type="text" class="input_form1" style="width:60px" value="${jumin_bizssn2}" readonly>
					   - <input name="jumin_bizssn3" type="text" class="input_form1" style="width:60px" value="${jumin_bizssn3}" readonly></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">����/����</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="BIZ_STATUS" type="text" class="input_form1" style="width:60px" value="${board.BIZ_STATUS}" readonly>
					   / <input name="BIZ_TYPES" type="text" class="input_form1" style="width:100px" value="${board.BIZ_TYPES}" readonly></td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�����ȣ</td>
					<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<tr>
						  <td><input name="POST" type="text" class="input_form1" style="width:120px" value="${board.POST}" readonly></td>
						</tr>
					</table></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">�ּ�</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="jumin_addr1" type="text" class="input_form1" style="width:100px" value="${board.ADDR1}" readonly>
						<input name="jumin_addr2" type="text" class="input_form1" style="width:100px" value="${board.ADDR2}" readonly></td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">e-mail</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="textfield222283" type="text" class="input_form1" style="width:120px" value="${board.EMAIL}" readonly></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">���θ� �ּ� </td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="textfield2222723" type="text" class="input_form1" style="width:100px" value="" readonly>
					  <input name="textfield22227222" type="text" class="input_form1" style="width:40px" value="" readonly>
					   - <input name="textfield222272222" type="text" class="input_form1" style="width:40px" value="" readonly></td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">��ȭ��ȣ</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="TEL" type="text" class="input_form1" style="width:120px" value="${board.TEL}" readonly></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">�޴���ȭ</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="HP" type="text" class="input_form1" style="width:120px" value="${board.HP}" readonly></td>
				  </tr>
				  <tr>
					<td height="34" colspan="4" align="left" bgcolor="#FFFFFF" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<tr>
						  <td><span class="sub_stan_blue">* ���� �۴���</span></td>
						</tr>
					</table></td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">���� ������ </td>
					<td colspan="3" bgcolor="eaeaea" class="table_bl_left"><input name="TOPOST_NM" type="text" class="input_form1" style="width:120px" value="${board.TOPOST_NM}" readonly></td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�����ȣ</td>
					<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<tr>
						  <td><input name="TOPOST" type="text" class="input_form1" style="width:120px" value="${board.TOPOST}" readonly></td>
						</tr>
					</table></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">�۴��� �ּ�</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="TOADDR1" type="text" class="input_form1" style="width:100px" value="${board.TOADDR1}" readonly>
						<input name="TOADDR2" type="text" class="input_form1" style="width:100px" value="${board.TOADDR2}" readonly></td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">e-mail</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="TOEMAIL" type="text" class="input_form1" style="width:120px" value="${board.TOEMAIL}" readonly></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">���θ� �ּ� </td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="textfield22227232" type="text" class="input_form1" style="width:100px" value="" readonly>
						<input name="textfield222272224" type="text" class="input_form1" style="width:40px" value="" readonly>
					   - <input name="textfield2222722223" type="text" class="input_form1" style="width:40px" value="" readonly></td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">��ȭ��ȣ</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="TOTEL" type="text" class="input_form1" style="width:120px" value="${board.TOTEL}" readonly>
						</td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">�޴���ȭ</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="TOHP" type="text" class="input_form1" style="width:120px" value="${board.TOHP}" readonly>
						</td>
				  </tr>
			  </table></td>
			</tr>
			
			<tr>
				<td height="40" align="right">
				<table width="0" border="0" cellspacing="0" cellpadding="0" align="right">
			  		<td height="40" align="right"><a href="javascript:Modify()"><img src="/img/mod_icon.gif" alt="����" width="56" height="18" border="0"></a>
			  	</table>
			  	</td>
			</tr>
		</table></td>
	</tr>

</table>
</body>
</html>
