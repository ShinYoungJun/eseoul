<%@ page language="java" contentType="text/html; charset=EUC-KR"	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title></title>
<style type="text/css">
<!--
body {
	margin: 0px;
	background-image: url(/img/left_back.gif);
}
-->
</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR" />
<script type="text/javascript" src="js/util.js">
</script>
</head>

<body>
<table width="800" border="0" cellpadding="0" cellspacing="0">
<form action="facility_adupload.action" method="post" enctype="multipart/form-data">
<input type="hidden" name="mode" value="uploadOk">
	<tr>
		<td height="43"><img src="/img/sub3_cont5_title.gif" width="800" height="43"></td>
	</tr>
	<tr>
        <td height="14"></td>
    </tr>
	<tr>
		<td>
			<table border="0" cellpadding="0" cellspacing="0">
				<tr>
					<td><img src="/img/sub_adress_title_on.gif" width="110" height="22"></td>
					<td width="1" background="/img/tab_line_blue.gif"></td>
					<td width="689" hight="22" background="/img/tab_line_blue.gif">&nbsp;</td>
				</tr>
			</table>
		</td>
	</tr>
	<tr>
		<td class="contborder_blue">
			<table>
				<tr>
					<td>
 						<table width="760" border="2" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0" width="760" border="2" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0">
				  			<tr>
    							<td height="28" width="100" align="center" bgcolor="e5eff8" class="sub_table_b">�ñ�����</td>
    							<td bgcolor="eaeaea" class="table_bl_left">
    							<select name="gu_nm" id="gu_nm"  class="input_form1"/>
    							<option value="�����">�����</option><option value="���ı�">���ı�</option><option value="������">������</option><option value="���α�">���α�</option><option value="�߱�">�߱�</option>
    							<option value="��걸">��걸</option><option value="������">������</option><option value="������">������</option><option value="���빮��">���빮��</option><option value="�߶���">�߶���</option>
    							<option value="���ϱ�">���ϱ�</option><option value="���ϱ�">���ϱ�</option><option value="������">������</option><option value="�����">�����</option><option value="����">����</option>
    							<option value="���빮��">���빮��</option><option value="������">������</option><option value="��õ��">��õ��</option><option value="������">������</option><option value="���α�">���α�</option>
    							<option value="��õ��">��õ��</option><option value="��������">��������</option><option value="���۱�">���۱�</option><option value="���Ǳ�">���Ǳ�</option><option value="���ʱ�">���ʱ�</option>
    							<option value="������">������</option><option value="���ı�">���ı�</option>
    							</select>
    							</td>
    							<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">��&nbsp;��&nbsp;��</td>
    							<td bgcolor="eaeaea" class="table_bl_left"><input type="text" style="width:130px" maxlength="20" name="or_nm" class="input_form1"//></td>
    							<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">��&nbsp;&nbsp;&nbsp;��</td>
    							<td bgcolor="eaeaea" class="table_bl_left"><input type="text" style="width:130px" maxlength="20" name="t_nm" class="input_form1"//></td>
  							</tr>
  							<tr>
    							<td height="28" width="100" align="center" bgcolor="e5eff8" class="sub_table_b">����ڸ�</td>
    							<td bgcolor="eaeaea" class="table_bl_left"><input type="text" style="width:130px" maxlength="20" name="dam_nm" class="input_form1"//></td>
    							<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">����� ��ȭ</td>
    							<td bgcolor="eaeaea" class="table_bl_left"><input type="text" style="width:130px" maxlength="20" name="dam_ph" class="input_form1"//></td>
    							<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">����� E-mail</td>
    							<td bgcolor="eaeaea" class="table_bl_left"><input type="text" style="width:130px" maxlength="50" name="dam_em" class="input_form1"//></td>
  							</tr>
  							<tr>
    							<td height="28" width="100" align="center" bgcolor="e5eff8" class="sub_table_b">��&nbsp;��&nbsp;��</td>
    							<td bgcolor="eaeaea" class="table_bl_left"><input type="text" style="width:130px" maxlength="20" name="teem_nm" class="input_form1"//></td>
    							<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">���� ��ȭ</td>
    							<td bgcolor="eaeaea" class="table_bl_left"><input type="text" style="width:130px" maxlength="20" name="teem_ph" class="input_form1"//></td>
    							<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">FAX</td>
    							<td bgcolor="eaeaea" class="table_bl_left"><input type="text" style="width:130px" maxlength="20" name="fax" class="input_form1"//></td>
  							</tr>
  							<tr>
    							<td height="28" width="100" align="center" bgcolor="e5eff8" class="sub_table_b">��&nbsp;��&nbsp;��</td>
    							<td bgcolor="eaeaea" class="table_bl_left"><input type="text" style="width:130px" maxlength="20" name="goa_nm" class="input_form1"//></td>
    							<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">���� ��ȭ</td>
    							<td colspan="3" bgcolor="eaeaea" class="table_bl_left"><input type="text" style="width:130px" maxlength="20" name="goa_ph" class="input_form1"/></td>
  							</tr>
  							<tr>
    							<td height="28" width="100" align="center" bgcolor="e5eff8" class="sub_table_b">���</td>
    							<td colspan="5" bgcolor="eaeaea" class="table_bl_left"><input type="text" style="width:600px" maxlength="100" name="memo" class="input_form1"//></td>
  							</tr>
						</table>
					</td>
				</tr>
			</table>		
		</td>
	</tr>
	<tr>
		<td height="5"></td>
	</tr>
	<tr>
		<td align="right">
			<input type="submit" value=" ���� ">
			<input type="button" value=" ��� " onclick="location.href='facility_adlist.action'">
		</td>
	</tr>
</form>
</table>
</body>
</html>