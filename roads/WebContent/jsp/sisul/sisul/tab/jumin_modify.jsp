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

	function	ModifyPrc()
	{
		var form = document.form;

		form.action = "/jumyong/minwon/jumin_modify_prc.do";
		form.submit();
	}

	function	Cancel()
	{
		var form = document.form;

		form.action = "/jumyong/minwon/jumin_view.do";
		form.submit();
	}

	function	Jumin_toaddr_Check()
	{
		var form = document.form;
		var	chk	= form.checkbox.checked;

		if(chk	== true)
		{
			form.TOPOST_NM.value		= form.NAME.value;
			form.TOPOST.value			= form.POST.value;
			form.TOADDR1.value			= form.ADDR1.value;
			form.TOADDR2.value			= form.ADDR2.value;
			form.TOEMAIL.value			= form.EMAIL.value;
			form.TOTEL.value			= form.TEL.value;
			form.TOHP.value				= form.HP.value;
		}
	}

	function 	openZipcodePopup(post, addr)
	{
		var	post1	= post;
		var	addr1	= addr;

		var url 	= "/zipcode.do?openerPost=" + post1 + "&openerAddr=" + addr1;
		var winName = "�����ȣ�Է�";
		var width 	= 420;
		var height 	= 305;
		var scroll 	= "yes";
		var resize 	= "no";

		var	option	= "scrollbars=" + scroll + ", ";
		option	+= "resize=" + resize + ", ";
		option	+= "width=" + width + ", ";
		option	+= "height=" + height;

		window.open(url, winName, option);
	}

	function 	Init()
	{
		parent.Tab_Img("jumin");
	}
	
//]]>
</script>

<body onkeyup="Init(); Jumin_toaddr_Check()">
<table width="780" border="0" cellpadding="0" cellspacing="0">
<form name="form" method="post">
<input type="hidden" name="ADMIN_NO" value="${board.ADMIN_NO}">

	<tr>
		<td align="left" class="contborder_purple">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
			  <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
				  <tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">������/���θ�</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="NAME" type="text" class="input_form1" style="width:120px" value="${board.NAME}"></td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">�ֹ�/���ι�ȣ</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="jumin_ssn1" type="text" class="input_form1" style="width:60px" value="${jumin_ssn1}">
					  - <input name="jumin_ssn2" type="text" class="input_form1" style="width:60px" value="${jumin_ssn2}"></td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">����ڵ�Ϲ�ȣ</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="jumin_bizssn1" type="text" class="input_form1" style="width:60px" value="${jumin_bizssn1}">
					  - <input name="jumin_bizssn2" type="text" class="input_form1" style="width:60px" value="${jumin_bizssn2}">
					  - <input name="jumin_bizssn3" type="text" class="input_form1" style="width:60px" value="${jumin_bizssn3}"></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">����/����</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="BIZ_STATUS" type="text" class="input_form1" style="width:60px" value="${board.BIZ_STATUS}">
					  / <input name="BIZ_TYPES" type="text" class="input_form1" style="width:100px" value="${board.BIZ_TYPES}"></td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�����ȣ</td>
					<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<tr>
						  <td><input name="POST" type="text" class="input_form1" style="width:120px" value="${board.POST}"></td>
						  <td><a href="javascript:openZipcodePopup('form.POST', 'form.ADDR1');"><img src="/img/search_icon.gif" alt="�˻�" width="56" height="18" border="0"></a></td>
						</tr>
					</table></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">�ּ�</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="ADDR1" type="text" class="input_form1" style="width:100px" value="${board.ADDR1}">
						<input name="ADDR2" type="text" class="input_form1" style="width:100px" value="${board.ADDR2}"></td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">e-mail</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="EMAIL" type="text" class="input_form1" style="width:120px" value="${board.EMAIL}"></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">���θ� �ּ� </td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="textfield2222723" type="text" class="input_form1" style="width:100px">
						<input name="textfield22227222" type="text" class="input_form1" style="width:40px">
					  - <input name="textfield222272222" type="text" class="input_form1" style="width:40px"></td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">��ȭ��ȣ</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="TEL" type="text" class="input_form1" style="width:120px" value="${board.TEL}"></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">�޴���ȭ</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="HP" type="text" class="input_form1" style="width:120px" value="${board.HP}"></td>
				  </tr>
				  <tr>
					<td height="34" colspan="4" align="left" bgcolor="#FFFFFF" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<tr>
						  <td><span class="sub_stan_blue">* ���� �۴���</span> : </td>
						  <td width="16"><input name="checkbox" type="checkbox" value="false" onclick="javascript:Jumin_toaddr_Check()"></td>
						  <td width="110">������ ������ ���� </td>
						</tr>
					</table></td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">���� ������ </td>
					<td colspan="3" bgcolor="eaeaea" class="table_bl_left"><input name="TOPOST_NM" type="text" class="input_form1" style="width:120px" value="${board.TOPOST_NM}"></td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�����ȣ</td>
					<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<tr>
						  <td><input name="TOPOST" type="text" class="input_form1" style="width:120px" value="${board.TOPOST}"></td>
						  <td><a href="javascript:openZipcodePopup('form.TOPOST', 'form.TOADDR1');"><img src="/img/search_icon.gif" alt="�˻�" width="56" height="18" border="0"></a></td>
						</tr>
					</table></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">�۴��� �ּ�</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="TOADDR1" type="text" class="input_form1" style="width:100px" value="${board.TOADDR1}">
						<input name="TOADDR2" type="text" class="input_form1" style="width:100px" value="${board.TOADDR2}"></td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">e-mail</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="TOEMAIL" type="text" class="input_form1" style="width:120px" value="${board.TOEMAIL}"></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">���θ� �ּ� </td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="textfield22227232" type="text" class="input_form1" style="width:100px" value="">
						<input name="textfield222272224" type="text" class="input_form1" style="width:40px" value="">
					   - <input name="textfield2222722223" type="text" class="input_form1" style="width:40px" value=""></td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">��ȭ��ȣ</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="TOTEL" type="text" class="input_form1" style="width:120px" value="${board.TOTEL}">
						</td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">�޴���ȭ</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="TOHP" type="text" class="input_form1" style="width:120px" value="${board.TOHP}">
						</td>
				  </tr>
			  </table></td>
			</tr>
			
			<tr>
			  	<td height="40" align="right">
				<table width="0" border="0" cellspacing="0" cellpadding="0" align="right">
			  		<a href="javascript:Cancel()"><img src="/img/can_icon.gif" alt="���" width="56" height="18" border="0"></a>
			  		<a href="javascript:ModifyPrc()"><img src="/img/save_icon2.gif" alt="����" width="56" height="18" border="0"></a>
				</table>
				</td>
			</tr>
		</table></td>
	</tr>

</table>
</body>
</html>