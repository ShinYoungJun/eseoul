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

	function	Modify(object_no)
	{
		var form = document.form;

		form.action = "/facility/jumyonginfo/jumin_modify.do?object_no="+object_no;
		form.submit();
	}

	function 	Init()
	{
		parent.Tab_Img("jumin");
	}
	
	function	View(adminno, seq)
	{
		params	= "ADMIN_NO=" + adminno + "&SEQ=" + seq;
		
		sendRequest("/facility/minwoninfo/minwon_view_search.do", params, "GET", Result_InfoView);

		
	//	document.getElementById("SEQ").value	= seq;

	//	parent.BugwaView(seq);
	}

//]]>
</script>

<body onload="Init()">

<form name="form" method="post">
	<input type="hidden" name="ADMIN_NO" id="ADMIN_NO" value="${ADMIN_NO}">
	<input type="hidden" name="CORP_CD" id="CORP_CD" value="${CORP_CD}">
	<input type="hidden" name="GU_CODE" id="GU_CODE" value="${GU_CODE}">
	<input type="hidden" name="REQUEST_NO" id="REQUEST_NO" value="${REQUEST_NO}">
	<input type="hidden" name="YEAR" id="YEAR" value="${YEAR}">

	<table width="780" border="0" cellpadding="0" cellspacing="0">
		<tr>
			<td align="left" class="contborder_purple">
			
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
				  <td>
				  
				  <table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
					  <tr height="25">
						<td width="100" height="25" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">������(���θ�)</td>
						<td width="37%" bgcolor="eaeaea" class="table_bl_left" nowrap="nowrap">${board.NAME}</td>
						<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">�ֹ�(����)��ȣ</td>
						<td bgcolor="eaeaea" class="table_bl_left" nowrap="nowrap">${board.SSN}</td>
					  </tr>
	
					  <tr height="25">
						<td height="25" align="center" bgcolor="e5eff8" class="sub_table_b">��ǥ�ڸ�</td>
						<td bgcolor="eaeaea" class="table_bl_left">${board.TOPOST_NM}</td>
						<td height="25" align="center" bgcolor="e5eff8" class="sub_table_b">����� ��Ϲ�ȣ</td>
						<td bgcolor="eaeaea" class="table_bl_left">${board.BIZSSN}</td>
					  </tr>
	
					  <tr height="25">
						<td align="center" bgcolor="e5eff8" class="sub_table_b" height="25">�ּ�</td>
						<td bgcolor="eaeaea" class="table_bl_left" colspan="3">
							${board.POST} ${board.SI} ${board.GUN} ${board.DONG} ${board.RI} <c:if test="${board.SPC_CD == '2'}">��</c:if> ${board.LNBR1}-${board.LNBR2} ${board.ADDR2} 
						</td>
					  </tr>

					  <tr height="25">
						<td align="center" bgcolor="e5eff8" class="sub_table_b" height="25">���θ� �ּ�</td>
						<td bgcolor="eaeaea" class="table_bl_left" colspan="3">
							${board.POST} ${board.SI} ${board.GUN} ${board.ROAD_ADDR} <c:if test="${board.SPC_CD == '2'}">��</c:if> ${board.ROAD_BON}-${board.ROAD_BU} ${board.BD_NM} ${board.BD_DET_NM} 
						</td>
					  </tr>

					  <tr height="25">
					  	<td align="center" bgcolor="e5eff8" class="sub_table_b" height="25">����</td>
						<td bgcolor="eaeaea" class="table_bl_left">${board.BIZ_STATUS}</td>
					  	<td align="center" bgcolor="e5eff8" class="sub_table_b" height="25">����</td>
						<td bgcolor="eaeaea" class="table_bl_left">${board.BIZ_TYPES}</td>
					  </tr>
	
	
					  <tr height="25">
						<td height="34" colspan="4" align="left" bgcolor="#FFFFFF" class="">
							<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
								<tr>
								  <td><span class="sub_stan_blue"><img src="/img/facility_view5.gif" alt="���� �۴���"></span></td>
								</tr>
							</table>
						</td>
					  </tr>
					  
					  <tr height="25">
					  	<td align="center" bgcolor="e5eff8" class="sub_table_b">�ּ�</td>
							<td bgcolor="eaeaea" class="table_bl_left" colspan="3" height="25">
								${board.TOPOST}	${board.TOSI} ${board.TOGUN} ${board.TODONG} ${board.TORI} <c:if test="${board.TO_SPC_CD == '2'}">��</c:if> ${board.TO_LNBR1}-${board.TO_LNBR2} ${board.TOADDR2} 
							</td>
						</tr>
					  
					  <tr height="25">
					  	<td align="center" bgcolor="e5eff8" class="sub_table_b">���θ� �ּ�</td>
							<td bgcolor="eaeaea" class="table_bl_left" colspan="3" height="25">
								${board.TOPOST}	${board.TOSI} ${board.TOGUN} ${board.TO_DORO_NM} <c:if test="${board.TO_SPC_CD == '2'}">��</c:if> ${board.TO_BD_BON}-${board.TO_BD_BU} ${board.TO_BD_NM} ${board.TO_BD_DET_NM} 
							</td>
						</tr>
					  
					  <tr height="25">
						<td height="34" colspan="4" align="left" bgcolor="#FFFFFF" class="">
							<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
								<tr>
								  <td><span class="sub_stan_blue"><img src="/img/facility_view6.gif" alt="����� ����"></span></td>
								</tr>
							</table>
						</td>
					  </tr>
					  <tr height="25">
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">������/����ڸ�</td>
						<td bgcolor="eaeaea" class="table_bl_left">${board.OFFICE}   / ${board.MANAGER}</td>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">��ȭ��ȣ</td>
						<td bgcolor="eaeaea" class="table_bl_left">${board.TOTEL} (����  ${board.TOTEL_EXT})</td>
					  </tr>
					  <tr height="25">
						<td align="center" bgcolor="e5eff8" class="sub_table_b">�ѽ� </td>
						<td bgcolor="eaeaea" class="table_bl_left">${board.TOFAX}</td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">�޴���ȭ</td>
						<td bgcolor="eaeaea" class="table_bl_left">${board.HP}</td>
					  </tr>
				  </table></td>
				</tr>
				<tr>
					<td colspan='4' class="sub_stan" height='25' align='right' valign='bottom'>
						<font color='red' size='2'>�� �ش� ������ü�� ������ ������ü ��Ͽ��� ���������մϴ�.</font>
					</td>
				</tr>
			</table></td>
		</tr>
	</table>

</form>
</body>
</html>
