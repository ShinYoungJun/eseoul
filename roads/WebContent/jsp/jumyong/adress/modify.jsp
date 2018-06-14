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
<form action="jumyong_adupdate.action" method="post"	enctype="multipart/form-data">
<input type="hidden" name="mode" value="uploadOk">
<input type="hidden" name="sid" value="${dto.sid }">
<input type="hidden" name="hi_gu_nm" value="">
	<tr>
		<td height="43"><img src="/img/sub1_cont4_title.gif" width="800" height="43"></td>
	</tr>
	<tr>
		test!!!!20180615
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
    							<td bgcolor="eaeaea" class="table_bl_left">
    							<select name="gu_nm" class="input_form1">
    							<option value="${dto.gu_nm }">${dto.gu_nm }</option>
    							<option value="서울시">서울시</option><option value="송파구">송파구</option><option value="강동구">강동구</option><option value="종로구">종로구</option><option value="중구">중구</option>
    							<option value="용산구">용산구</option><option value="성동구">성동구</option><option value="광진구">광진구</option><option value="동대문구">동대문구</option><option value="중랑구">중랑구</option>
    							<option value="성북구">성북구</option><option value="강북구">강북구</option><option value="도봉구">도봉구</option><option value="노원구">노원구</option><option value="은평구">은평구</option>
    							<option value="서대문구">서대문구</option><option value="마포구">마포구</option><option value="양천구">양천구</option><option value="강서구">강서구</option><option value="구로구">구로구</option>
    							<option value="금천구">금천구</option><option value="영등포구">영등포구</option><option value="동작구">동작구</option><option value="관악구">관악구</option><option value="서초구">서초구</option>
    							<option value="강남구">강남구</option><option value="송파구">송파구</option>
    							</select>
    							</td>
    							<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">부&nbsp;서&nbsp;명</td>
    							<td bgcolor="eaeaea" class="table_bl_left"><input type="text" style="width:130px" maxlength="20" name="or_nm" value="${dto.or_nm }" class="input_form1"/></td>
    							<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">팀&nbsp;&nbsp;&nbsp;명</td>
    							<td bgcolor="eaeaea" class="table_bl_left"><input type="text" style="width:130px" maxlength="20" name="t_nm" value="${dto.t_nm }" class="input_form1"/></td>
  							</tr>
  							<tr>
    							<td height="28" width="100" align="center" bgcolor="e5eff8" class="sub_table_b">담당자명</td>
	    						<td bgcolor="eaeaea" class="table_bl_left"><input type="text" style="width:130px" maxlength="20" name="dam_nm" value="${dto.dam_nm }" class="input_form1"/></td>
			    				<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">담당자 전화</td>
    							<td bgcolor="eaeaea" class="table_bl_left"><input type="text" style="width:130px" maxlength="20" name="dam_ph" value="${dto.dam_ph }" class="input_form1"/></td>
    							<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">담당자 메일</td>
    							<td bgcolor="eaeaea" class="table_bl_left"><input type="text" style="width:130px" maxlength="50" name="dam_em" value="${dto.dam_em }" class="input_form1"/></td>
  							</tr>
				  			<tr>
 					   			<td height="28" width="100" align="center" bgcolor="e5eff8" class="sub_table_b">팀&nbsp;장&nbsp;명</td>
    							<td bgcolor="eaeaea" class="table_bl_left"><input type="text" style="width:130px" maxlength="20" name="teem_nm" value="${dto.teem_nm }" class="input_form1"/></td>
    							<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">팀장 전화</td>
    							<td bgcolor="eaeaea" class="table_bl_left"><input type="text" style="width:130px" maxlength="20" name="teem_ph" value="${dto.teem_ph }" class="input_form1"/></td>
    							<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">FAX</td>
    							<td bgcolor="eaeaea" class="table_bl_left"><input type="text" style="width:130px" maxlength="20" name="fax" value="${dto.fax }" class="input_form1"/></td>
  							</tr>
  							<tr>
    							<td height="28" width="100" align="center" bgcolor="e5eff8" class="sub_table_b">과&nbsp;장&nbsp;명</td>
    							<td bgcolor="eaeaea" class="table_bl_left"><input type="text" style="width:130px" maxlength="20" name="goa_nm" value="${dto.goa_nm }" class="input_form1"/></td>
    							<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">과장 전화</td>
    							<td colspan="3" bgcolor="eaeaea" class="table_bl_left"><input type="text" style="width:130px" maxlength="20" name="goa_ph" value="${dto.goa_ph }" class="input_form1"/></td>
  							</tr>
  							<tr>
    							<td height="28" width="100" align="center" bgcolor="e5eff8" class="sub_table_b">비&nbsp;&nbsp;&nbsp;고</td>
    							<td colspan="5" bgcolor="eaeaea" class="table_bl_left"><input type="text" style="width:600px" maxlength="100" name="memo" value="${dto.memo }" class="input_form1"/></td>
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
			<input type="button" value=" 취소" onclick="location.href='jumyong_adlist.action'">
		</td>
	</tr>
</form>
</table>
</body>
</html>