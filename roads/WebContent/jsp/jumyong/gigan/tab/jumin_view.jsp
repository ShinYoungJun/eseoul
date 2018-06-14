<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="/jsp/common/loginCheck.jsp" %>
<%@ include file="/jsp/common/include.jsp" %>


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
		parent.TabUp_Img("jumin");
	}
	
//]]>
</script>

<body onload="Init();">
<table width="780" border="0" cellpadding="0" cellspacing="0">
<form id="form" name="form" method="post">
<input type="hidden" id="ADMIN_NO" name="ADMIN_NO" value="${ADMIN_NO}">
<input type="hidden" id="SECTION" name="SECTION" value="${SECTION}">

	<tr>
		<td align="left" class="contborder_purple">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
			  <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
				  <tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">������/���θ�</td>
					<td width="37%" bgcolor="eaeaea" class="table_bl_left">${board.NAME}</td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">�ֹ�/���ι�ȣ</td>
					<td bgcolor="eaeaea" class="table_bl_left" id="ssn">
						<script type="text/javascript">
							var ssn = "${board.SSN}";
							var ssnAsterisk = ssn.substring(7).replace(/./g, '*');
							document.getElementById("ssn").innerHTML = ssn.substring(0, 7) + ssnAsterisk;
						</script>
					</td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">����ڵ�Ϲ�ȣ</td>
					<td bgcolor="eaeaea" class="table_bl_left">${board.BIZSSN}</td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">����/����</td>
					<td bgcolor="eaeaea" class="table_bl_left">${board.BIZ_STATUS} ${board.BIZ_TYPES}</td>
				  </tr>
				  <tr>
					<td height="30" align="center" bgcolor="e5eff8"  class="sub_table_b">�����ȣ</td>
					<td bgcolor="eaeaea"  colspan="3" class="table_bl_left">${board.POST}</td>
				  </tr>
				  <tr>
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">�ּ�</td>
					<td bgcolor="eaeaea" class="table_bl_left">
					<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<tr><td>${board.ADDR1}</td></tr>
						<tr><td><c:if test="${board.SAN == '1'}">��&nbsp;</c:if>${board.BON}<c:if test="${board.BU != null}">-${board.BU}</c:if>&nbsp;${board.ADDR2}<td></tr>
					</table>
					</td>
				    <td align="center" bgcolor="e5eff8" class="sub_table_b">���ּ�</td>
					<td bgcolor="eaeaea" class="table_bl_left">
					<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<tr><td>${board.SI}&nbsp;${board.GUN}&nbsp;${board.DORO_NM}</td></tr>
						<tr><td>&nbsp;${board.BD_BON}&nbsp;${board.BD_BU}&nbsp;${board.BD_NM}&nbsp;${board.BD_DET_NM}<td></tr>
					</table>
					</td>	
				  </tr> 
				  
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">e-mail</td>
					<td bgcolor="eaeaea" class="table_bl_left">${board.EMAIL}</td>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">���� �㰡��ȣ</td>
					<td bgcolor="eaeaea" class="table_bl_left">${board.BEFORE_PERMISSION}</td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">��ȭ��ȣ</td>
					<td bgcolor="eaeaea" class="table_bl_left">${board.TEL}</td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">�޴���ȭ</td>
					<td bgcolor="eaeaea" class="table_bl_left">${board.HP}</td>
				  </tr>
			      <tr height="40px">
        		  	<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">���</td>
      				<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
      					<textarea type="text" class="view" style="width:99%;overflow-y: scroll ;" readonly>${board.REFERENCE}</textarea>
      				</td>
        		  </tr> 
				  <tr>
					<td height="34" colspan="4" align="left" bgcolor="#FFFFFF" class=""><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<tr>
						  <td><span class="sub_stan_blue">* ���� �۴���</span></td>
						</tr>
					</table></td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">���� ������ </td>
					<td colspan="3" bgcolor="eaeaea" class="table_bl_left">${board.TONM}</td>
				  </tr>
				  <tr>
					<td height="30" align="center" bgcolor="e5eff8" class="sub_table_b">�����ȣ</td>
					<td bgcolor="eaeaea" colspan="3" class="table_bl_left">${board.TOPOST}</td>
				  </tr>
				  <tr>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">�۴��� �ּ�</td>
					<td bgcolor="eaeaea" class="table_bl_left">
					<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<tr><td>${board.TOADDR1}</td></tr>
						<tr><td><c:if test="${board.TOSAN == '1'}">��&nbsp;</c:if>${board.TOBON}<c:if test="${board.TOBU != null}">-${board.TOBU}</c:if>&nbsp;${board.TOADDR2}<td></tr>
					</table>
					</td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">�۴��� �� �ּ�</td>
					<td bgcolor="eaeaea" class="table_bl_left">
					<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<tr><td>${board.TOSI}&nbsp;${board.TOGUN}&nbsp${board.TODORO_NM}</td></tr>
						<tr><td>${board.TOBD_BON}&nbsp;${board.TOBD_BU}&nbsp;${board.TOBD_NM}&nbsp;${board.TOBD_DET_NM}<td></tr>
					</table>
					</td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">e-mail</td>
					<td bgcolor="eaeaea" class="table_bl_left" colspan="3">${board.TOMAIL}</td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">��ȭ��ȣ</td>
					<td bgcolor="eaeaea" class="table_bl_left">${board.TOTEL}</td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">�޴���ȭ</td>
					<td bgcolor="eaeaea" class="table_bl_left">${board.TOHP}</td>
				  </tr>
			  </table></td>
			</tr>
		</table>
		</td>
	</tr>
</table>
</body>
</html>