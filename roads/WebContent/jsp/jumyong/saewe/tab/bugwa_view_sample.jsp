<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/loginCheck.jsp" %>    
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

	function 	Init()
	{
		parent.TabDown_Img("bugwa");
	}
	
//]]>
</script>

<body onload="Init();">
<table width="780" border="0" cellpadding="0" cellspacing="0">
<form name="form" method="post">
<input type="hidden" name="ADMIN_NO" value="${ADMIN_NO}">
<input type="hidden" name="SEQ" value="${SEQ}">

	  <tr>
		<td align="left" class="contborder_blue">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
			  <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">

				<tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">������ȣ</td>
					<td width="181" bgcolor="eaeaea" class="table_bl_left"><input name="TAX_NO" type="text" class="readonly" style="width:120px" value="" readonly></td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="TAX_SET" type="text" class="readonly" style="width:120px" value="" readonly></td>
				</tr>
				
				<tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�������</td>
					<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					  <tr>
						<td><input name="tax_year" type="text" class="readonly" style="width:45px" value="" readonly></td>
						<td><input name="tax_month" type="text" class="readonly" style="width:30px" value="" readonly></td>
				   	  </tr>
					</table></td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">�����ڵ�</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="TAX_CD" type="text" class="readonly" style="width:270px" value="" readonly></td>
				</tr>
				
				<tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">����ڵ�</td>
					<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					  <tr>
						<td><input name="SIGU_CD" type="text" class="readonly" style="width:120px" value="" readonly></td>
						<td><input name="" type="text" class="readonly" style="width:120px" value="" readonly></td>
				   	  </tr>
					</table></td>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�μ��ڵ�</td>
					<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					  <tr>
						<td><input name="DEPT_CD" type="text" class="readonly" style="width:120px" value="" readonly></td>
						<td><input name="" type="text" class="readonly" style="width:120px" value="" readonly></td>
				   	  </tr>
					</table></td>
				</tr>
				
				<tr>
					<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�����ڱ���</td>
					<td colspan="3" bgcolor="eaeaea" class="table_bl_left"><input name="TAXPAYER_SET" type="text" class="readonly" style="width:240px" value="" readonly></td>
				</tr>
				
				<tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">���ֻ���</td>
					<td width="181" bgcolor="eaeaea" class="table_bl_left"><input name="LIVE" type="text" class="readonly" style="width:120px" value="" readonly></td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">���Ǳ���</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="OBJ_SET" type="text" class="readonly" style="width:120px" value="" readonly></td>
				</tr>
				
				<tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">����(�����)</td>
					<td width="181" bgcolor="eaeaea" class="table_bl_left"><input name="BONSE" type="text" class="readonly" style="width:120px" value="" readonly></td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">�����μ�</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="" type="text" class="readonly" style="width:120px" value="" readonly></td>
				</tr>
				
				<tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">�ΰ���ġ��</td>
					<td width="181" bgcolor="eaeaea" class="table_bl_left"><input name="VAT" type="text" class="readonly" style="width:120px" value="" readonly></td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="TAX_DATE" type="text" class="readonly" style="width:120px" value="" readonly></td>
				</tr>
				
				<tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">���⳻�ݾ�</td>
					<td width="181" bgcolor="eaeaea" class="table_bl_left"><input name="INTAX" type="text" class="readonly" style="width:120px" value="" readonly></td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">���⳻����</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="INDATE" type="text" class="readonly" style="width:120px" value="" readonly></td>
				</tr>
				
				<tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">�����ıݾ�</td>
					<td width="181" bgcolor="eaeaea" class="table_bl_left"><input name="OVERTAX" type="text" class="readonly" style="width:120px" value="" readonly></td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">����������</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="OVERDATE" type="text" class="readonly" style="width:120px" value="" readonly></td>
				</tr>
				
				<tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">����������</td>
					<td width="181" bgcolor="eaeaea" class="table_bl_left"><input name="ADD_SET" type="text" class="readonly" style="width:120px" value="" readonly></td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">����ݸ�������</td>
					<td bgcolor="eaeaea" class="table_bl_left"></td>
				</tr>
				
				<tr>
					<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">���</td>
					<td colspan="3" bgcolor="eaeaea" class="table_bl_left"><input name="NOTES" type="text" class="readonly" style="width:600px" value="" readonly></td>
				</tr>
				
				<tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">���� ������</td>
					<td width="181" bgcolor="eaeaea" class="table_bl_left"><input name="LIMIT_SUM" type="text" class="readonly" style="width:120px" value="" readonly></td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">����Ƚ��</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="LIMIT_CNT" type="text" class="readonly" style="width:120px" value="" readonly></td>
				</tr>
				
				<tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">Ư������</td>
					<td width="181" bgcolor="eaeaea" class="table_bl_left"><input name="RATE" type="text" class="readonly" style="width:120px" value="" readonly></td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">Ư������ ����</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="RATE_CAUSE" type="text" class="readonly" style="width:120px" value="" readonly></td>
				</tr>
				  
			  </table></td>
			</tr>

			<tr>
			  <td height="40" align="right">

			  </td>
			</tr>
			
		</table></td>
	  </tr>

</table>

</body>
</html>