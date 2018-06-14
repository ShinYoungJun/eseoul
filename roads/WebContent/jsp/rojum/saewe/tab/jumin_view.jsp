<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/loginCheck.jsp" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />

<title>::::: 서울시 도로점용관리시스템 :::::</title>
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
		parent.TabUp_Img("jumin");
	}
	
//]]>
</script>

<body onload="Init();">
<table width="780" border="0" cellpadding="0" cellspacing="0">
<form name="form" method="post">
<input type="hidden" name="ADMIN_NO" value="${ADMIN_NO}">

	<tr>
		<td align="left" class="contborder_purple">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
			  <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
				  <tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">점용인/법인명</td>
					<td width="37%" bgcolor="eaeaea" class="table_bl_left">${board.NAME}</td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">주민/법인번호</td>
					<td bgcolor="eaeaea" class="table_bl_left">${board.SSN}</td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">사업자등록번호</td>
					<td bgcolor="eaeaea" class="table_bl_left">${board.BIZSSN}</td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">업태/업종</td>
					<td bgcolor="eaeaea" class="table_bl_left">${board.BIZ_STATUS} ${board.BIZ_TYPES}</td>
				  </tr>
				  <tr>
					<td height="30" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
					<td bgcolor="eaeaea" class="table_bl_left">${board.POST}</td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">주소</td>
					<td bgcolor="eaeaea" class="table_bl_left">
					<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<tr><td>${board.ADDR1}</td></tr>
						<tr><td>${board.ADDR2}<td></tr>
					</table>
					</td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">e-mail</td>
					<td bgcolor="eaeaea" class="table_bl_left">${board.EMAIL}</td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">도로명 주소 </td>
					<td bgcolor="eaeaea" class="table_bl_left"></td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">전화번호</td>
					<td bgcolor="eaeaea" class="table_bl_left">${board.TEL}</td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">휴대전화</td>
					<td bgcolor="eaeaea" class="table_bl_left">${board.HP}</td>
				  </tr>
				  <tr>
					<td height="34" colspan="4" align="left" bgcolor="#FFFFFF" class=""><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<tr>
						  <td><span class="sub_stan_blue">* 우편물 송달지</span></td>
						</tr>
					</table></td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">우편물 수령인 </td>
					<td colspan="3" bgcolor="eaeaea" class="table_bl_left">${board.TOPOST_NM}</td>
				  </tr>
				  <tr>
					<td height="30" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
					<td bgcolor="eaeaea" class="table_bl_left">${board.TOPOST}</td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">송달지 주소</td>
					<td bgcolor="eaeaea" class="table_bl_left">
					<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<tr><td>${board.TOADDR1}</td></tr>
						<tr><td>${board.TOADDR2}<td></tr>
					</table>
					</td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">e-mail</td>
					<td bgcolor="eaeaea" class="table_bl_left">${board.TOEMAIL}</td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">도로명 주소 </td>
					<td bgcolor="eaeaea" class="table_bl_left"></td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">전화번호</td>
					<td bgcolor="eaeaea" class="table_bl_left">${board.TOTEL}</td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">휴대전화</td>
					<td bgcolor="eaeaea" class="table_bl_left">${board.TOHP}</td>
				  </tr>
			  </table></td>
			</tr>
			
		</table></td>
	</tr>

</table>
</body>
</html>