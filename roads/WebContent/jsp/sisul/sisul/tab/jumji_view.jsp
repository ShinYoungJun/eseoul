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

		form.action = "/sisul/sisul/jumji_modify.do";
		form.submit();
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
		parent.TabUp_Img("jumji");
	}

//]]>
</script>

<body onload="Init(); Init_UseType('${board.TYPE}'); Init_UseSection('${board.SECTION}'); Init_SANCheck('${board.SAN_CK}'); Init_PurposeCode();">
<table width="780" border="0" cellpadding="0" cellspacing="0">
<form name="form" method="post">
<input type="hidden" name="ADMIN_NO" value="${ADMIN_NO}">

	<tr>
		<td align="left" class="contborder_purple">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>
			<td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
				<tr>
				  <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
				  <td bgcolor="eaeaea" class="table_bl_left"><input name="TYPE" type="text" class="input_form1" style="width:124px" value="${use_type}" readonly></td>
				  <td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">���뱸��</td>
				  <td bgcolor="eaeaea" class="table_bl_left"><input name="SECTION" type="text" class="input_form1" style="width:124px" value="${occupancy_type}" readonly></td>
				</tr>
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
				  <td bgcolor="eaeaea" class="table_bl_left"><input name="OWNER_SET" type="text" class="input_form1" style="width:124px" value="${use_owner_Group}" readonly></td>
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">���Ա���</td>
				  <td bgcolor="eaeaea" class="table_bl_left"><input name="TAX_SET" type="text" class="input_form1" style="width:124px" value="${taxation_section}" readonly></td>
				</tr>
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">������ ���� </td>
				  <td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					<tr>
					  <td width="64">������ <span class="sub_stan_b">�� </span> </td>
					  <td width="72"><input name="BJ_CD" type="text" class="input_form1" style="width:64px" value="${bjdong_code}" readonly></td>
					  <td><input name="jumji" type="HJ_CD" class="input_form1" style="width:84px" value="${hjdong_code}" readonly></td>
					  <td width="20" align="right">��</td>
					  <td width="30"><input name="SAN_CK" type="checkbox" value="${board.SAN_CK}" disabled></td>
					  <td><input name="BONBUN" type="text" class="input_form1" style="width:40px" value="${board.BONBUN}" readonly>
						- <input name="BUBUN" type="text" class="input_form1" style="width:40px" value="${board.BUBUN}" readonly>
						���� <input name="TONG" type="text" class="input_form1" style="width:30px" value="${board.TONG}" readonly>
						�� <input name="BAN" type="text" class="input_form1" style="width:30px" value="${board.BAN}" readonly> 
						�� </td>
					  </tr>
				  </table></td>
				  </tr>
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�����ȣ</td>
				  <td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					<tr>
					  <td><input name="MUL_POST" type="text" class="input_form1" style="width:120px" value="${board.MUL_POST}" readonly></td>
					</tr>
				  </table></td>
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">�ǹ�(��) ���� </td>
				  <td bgcolor="eaeaea" class="table_bl_left"><input name="BD_NM" type="text" class="input_form1" style="width:120px" value="${board.BD_NM}" readonly>
					<input name="BD_DONG" type="text" class="input_form1" style="width:30px" value="${board.BD_DONG}" readonly>
					�� <input name="BD_HO" type="text" class="input_form1" style="width:30px" value="${board.BD_HO}" readonly>
					ȣ </td>
				</tr>
				
				<tr style="display:block" id="UseType1">
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">���θ� �ּ� </td>
				  <td bgcolor="eaeaea" class="table_bl_left"><input name="textfield222272322" type="text" class="input_form1" style="width:100px" value="${board.SAN_CK}" readonly>
					<input name="textfield2222722242" type="text" class="input_form1" style="width:40px" value="${board.SAN_CK}" readonly>
					- <input name="textfield22227222232" type="text" class="input_form1" style="width:40px" value="${board.SAN_CK}" readonly></td>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�������</td>
				  <td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					<tr>
					  <td><input name="PARKING_NUM" type="text" class="input_form1" style="width:100px" value="${board.PARKING_NUM}" readonly></td>
					</tr>
				  </table></td>
				</tr>
				<tr style="display:block" id="UseType2">
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">���θ� �ּ� </td>
				  <td bgcolor="eaeaea" class="table_bl_left"><input name="textfield222272322" type="text" class="input_form1" style="width:100px" value="${board.TYPE}" readonly>
					<input name="textfield2222722242" type="text" class="input_form1" style="width:40px" value="${board.TYPE}" readonly>
					- <input name="textfield22227222232" type="text" class="input_form1" style="width:40px" value="${board.TYPE}" readonly></td>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">����/���Ÿ�</td>
				  <td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					<tr>
					  <td><input name="RIVER_NM" type="text" class="input_form1" style="width:100px" value="${board.RIVER_NM}" readonly></td>
					</tr>
				  </table></td>
				</tr>
				
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�������</td>
				  <td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					<tr>
						<jsp:include page="/jsp/common/purposeCode/purposeCode_view.jsp" flush="true"/>
					</tr>
				  </table></td>
			    </tr>
			    
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">����Ⱓ</td>
				  <td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					<tr>
					<td>
					  <input name="MUL_FROMDATE" type="text" class="input_form1" style="width:70px" value="${board.MUL_FROMDATE}" readonly>
					   ~ <input name="MUL_TODATE" type="text" class="input_form1" style="width:70px" value="${board.MUL_TODATE}" readonly></tr>
					</td>
					
	                <tr style="display:none" id="UseSection">
					  <td>�Ͻ�����<input name="PARTLY_PERIOD" type="text" class="input_form1" style="width:300px" value="${board.PARTLY_PERIOD}" readonly>
					  &nbsp;&nbsp;��<input name="TOTAL_PERIOD" type="text" class="input_form1" style="width:30px" value="${board.TOTAL_PERIOD}" readonly>��</td>
					</tr>
				  </table></td>
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