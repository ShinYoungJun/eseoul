<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
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
</head>
<body>
<table width="800" border="0" cellpadding="0" cellspacing="0">
<form action="gapan_adupdate.action" method="post"	enctype="multipart/form-data">
<input type="hidden" name="mode" value="uploadOk">
<input type="hidden" name="sid" value="${dto.sid }">
	<tr>
		<td height="43"><img src="/img/sub9_cont4_title.gif" width="800" height="43"></td>
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
    							<td height="28" width="100" align="center" bgcolor="e5eff8" class="sub_table_b">시군구명</td>
    							<td bgcolor="eaeaea" class="table_bl_left"><input type="text" style="width:130px" maxlength="10" name="gu_nm" value="${dto.gu_nm }" class="input_form1"//></td>
    							<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">부&nbsp;서&nbsp;명</td>
    							<td bgcolor="eaeaea" class="table_bl_left"><input type="text" style="width:130px" maxlength="20" name="or_nm" value="${dto.or_nm }" class="input_form1"//></td>
    							<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">팀&nbsp;&nbsp;&nbsp;명</td>
    							<td bgcolor="eaeaea" class="table_bl_left"><input type="text" style="width:130px" maxlength="20" name="t_nm" value="${dto.t_nm }" class="input_form1"//></td>
  							</tr>
  							<tr>
    							<td height="28" width="100" align="center" bgcolor="e5eff8" class="sub_table_b">담당자명</td>
	    						<td bgcolor="eaeaea" class="table_bl_left"><input type="text" style="width:130px" maxlength="20" name="dam_nm" value="${dto.dam_nm }" class="input_form1"//></td>
			    				<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">담당자 전화</td>
    							<td bgcolor="eaeaea" class="table_bl_left"><input type="text" style="width:130px" maxlength="20" name="dam_ph" value="${dto.dam_ph }" class="input_form1"//></td>
    							<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">담당자 메일</td>
    							<td bgcolor="eaeaea" class="table_bl_left"><input type="text" style="width:130px" maxlength="50" name="dam_em" value="${dto.dam_em }" class="input_form1"//></td>
  							</tr>
				  			<tr>
 					   			<td height="28" width="100" align="center" bgcolor="e5eff8" class="sub_table_b">팀&nbsp;장&nbsp;명</td>
    							<td bgcolor="eaeaea" class="table_bl_left"><input type="text" style="width:130px" maxlength="20" name="teem_nm" value="${dto.teem_nm }" class="input_form1"//></td>
    							<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">팀장 전화</td>
    							<td bgcolor="eaeaea" class="table_bl_left"><input type="text" style="width:130px" maxlength="20" name="teem_ph" value="${dto.teem_ph }" class="input_form1"//></td>
    							<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">FAX</td>
    							<td bgcolor="eaeaea" class="table_bl_left"><input type="text" style="width:130px" maxlength="20" name="fax" value="${dto.fax }"/></td>
  							</tr>
  							<tr>
    							<td height="28" width="100" align="center" bgcolor="e5eff8" class="sub_table_b">과&nbsp;장&nbsp;명</td>
    							<td bgcolor="eaeaea" class="table_bl_left"><input type="text" style="width:130px" maxlength="20" name="goa_nm" value="${dto.goa_nm }" class="input_form1"//></td>
    							<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">과장 전화</td>
    							<td colspan="3" bgcolor="eaeaea" class="table_bl_left"><input type="text" style="width:130px" maxlength="20" name="goa_ph" value="${dto.goa_ph }" class="input_form1"//></td>
  							</tr>
  							<tr>
    							<td height="28" width="100" align="center" bgcolor="e5eff8" class="sub_table_b">비&nbsp;&nbsp;&nbsp;고</td>
    							<td colspan="5" bgcolor="eaeaea" class="table_bl_left"><input type="text" style="width:600px" maxlength="100" name="memo" value="${dto.memo }" class="input_form1"//></td>
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
			<input type="submit" value=" 수정 ">
			<input type="button" value=" 취소" onclick="location.href='gapan_adlist.action'">
		</td>
	</tr>
</form>
</table>
</body>
</html>