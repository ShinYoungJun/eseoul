<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="/jsp/common/loginCheck.jsp" %>

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

		form.action = "/facility/minwoninfo/sisul_modify.do";
		form.submit();
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
		parent.Tab_Img("jumji");

		IFRM_PurposeCode.PURPOSE_CD.className="view";
	}

//]]>
</script>

<body onload="Init(); Init_UseType('${board.TYPE}'); Init_UseSection('${board.SECTION}');">
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
				  <td width="37%" bgcolor="eaeaea" class="table_bl_left">${use_type}</td>
				  <td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">���뱸��</td>
				  <td width="36%" bgcolor="eaeaea" class="table_bl_left">${occupancy_type}</td>
				</tr>
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
				  <td bgcolor="eaeaea" class="table_bl_left">${use_owner_Group}</td>
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">���Ա���</td>
				  <td bgcolor="eaeaea" class="table_bl_left">${taxation_section}</td>
				</tr>
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">������ ����<br>(��������<br> &nbsp;��������)  </td>
				  <td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					<tr>
					  <td>${board.SIGUNGU}&nbsp;</td>
					  <td>${bjdong_code}&nbsp;</td>
					  <td>(${hjdong_code})&nbsp;&nbsp;</td>
					  <td>${mul_spc_cd}&nbsp;</td>
					  <td>${board.BONBUN}${board.BUBUN}&nbsp;&nbsp;${board.TONG}${board.BAN} </td>
					  </tr>
				  </table></td>
				</tr>
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�����ȣ</td>
				  <td bgcolor="eaeaea" class="table_bl_left">${board.MUL_POST}</td>
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">�ǹ�(��) ���� </td>
				  <td bgcolor="eaeaea" class="table_bl_left">${board.BD_NM}</td>
				</tr>
				
				<tr style="display:block" id="UseType1">
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">���� �ּ� </td>
				  <td bgcolor="eaeaea" class="table_bl_left">${board.ROAD_ADD}</td>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�������</td>
				  <td bgcolor="eaeaea" class="table_bl_left">${board.PARKING_NUM} ��</td>
				</tr>
				
				<tr style="display:block" id="UseType2">
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">���θ� �ּ� </td>
				  <td bgcolor="eaeaea" class="table_bl_left">${board.ROAD_ADD}</td>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">����/���Ÿ�</td>
				  <td bgcolor="eaeaea" class="table_bl_left">${board.RIVER_NM}</td>
				</tr>
			
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�������</td>
				  <td colspan="3" bgcolor="F6F6F6" class=""><table width="100%" border="0" cellpadding="0" cellspacing="0" class="">
					<iframe id="IFRM_PurposeCode" align="absmiddle" scrolling="no" frameborder="0" framespacing="0" width="100%" height="22" src="/jsp/common/purposeCode/purposeCode_view.jsp?SectionCode=${board.TYPE}&PURPOSE_CD=${board.PURPOSE_CD}"></iframe>
				  </table></td>
			    </tr>
			    
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">����Ⱓ</td>
				  <td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					<tr>
					<td>
					  ${board.MUL_FROMDATE} ~ ${board.MUL_TODATE}</tr>
					</td>
					
	                <tr style="display:none" id="UseSection">
					  <td>�Ͻ�����&nbsp;${board.PARTLY_PERIOD}&nbsp;&nbsp;�� ${board.TOTAL_PERIOD}&nbsp;��</td>
					</tr>
				  </table></td>
				</tr>

			    <tr>
				  <td height="34" colspan="4" align="left" bgcolor="#FFFFFF" class=""><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					<tr>
					  <td><span class="sub_stan_blue">* ������ ����</span></td>
					</tr>
				  </table></td>
			    </tr>
			    <tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�����ȣ</td>
				  <td colspan="3" bgcolor="eaeaea" class="table_bl_left">${board.WITH_POST}</td>
			    </tr>
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�ּ�</td>
				  <td colspan="3" bgcolor="eaeaea" class="table_bl_left">${board.WITH_ADDR1}&nbsp;${board.WITH_ADDR2}</td>
				</tr>
				
			    <tr>
				  <td height="34" colspan="4" align="left" bgcolor="#FFFFFF" class=""><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					<tr>
					  <td><span class="sub_stan_blue">* ����(����) ����</span></td>
					</tr>
				  </table></td>
			    </tr>
			    
			    <tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">����Ⱓ </td>
				  <td colspan="3" bgcolor="eaeaea" class="table_bl_left">${board.WORK_FROMDATE}</td>
			    </tr>
			    
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">���系��</td>
				  <td colspan="3" bgcolor="eaeaea" class="table_bl_left">${board.EXE_INFO}</td>
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