<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR" %>
<%@ include file="/jsp/common/include.jsp"%>
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
	background-image: url(/img/left_back.gif);
}
-->
</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
</head>

<script language="javascript" src="/js/PopupCalendar.js"></script> 
<script language="javascript" src="/js/common.js"></script> 
<script type="text/javascript">
//<![CDATA[

	function goFocus()
	{	
		document.listForm.areaName.focus();
	}
		           
	function  reSearch()
	{		
		var w = document.listForm;
		if('' == document.getElementById("areaName").value)
		{
			alert("�������� �Է��ϼ���.");
			goFocus();
			return;
		}
		
		w.action = "/admin/commCode/zipCode.do";		
		w.submit();	
	}

	function deleteRow()
	{	
		var w = document.form;	
		var rowCount = document.getElementById("listSize").value;
		 
		for(i=1; i<= rowCount; i++)
		{	
			if(document.getElementById("checkbox"+i).checked)
			  	
			  	document.getElementById("deleteSeq").value = document.getElementById("seq"+i).value;	
				w.action = "/admin/boardDel.do";	
				w.submit();		
		}
	}
	
	function fn_fromdate()
	{
		return ${fromDate};
	}
	
	function initPage(){
	
		if(document.getElementById("fromDate").value == "")
			document.getElementById("fromDate").value = strToday();
			
		if(document.getElementById("toDate").value == "")
			document.getElementById("toDate").value = strToday();
	}
	
	function strToday()
	{
		var date = new Date();
	
	 	var year = date.getFullYear(); 
	 	var month = date.getMonth() + 1;
	 	var day = date.getDate();
	
	 	if (("" + month).length==1){month = "0"+month;}
	 	if (("" + day).length==1){day = "0"+day;}
	 
	 	return year+month+day;
	}
	
	/*
	 *	���հ˻� key down function (����Ű�� �ԷµǸ� �˻��Լ� ȣ��)
	 */
	function checkKeySearch(){
		if(event.keyCode == KEY_ENTER)
			reSearch();
	}
	
//]]>
</script>

<body onLoad="javascript:goFocus();">
<form name="listForm" method="post">
<table width="800" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td height="43"><img src="/img/admin_cont3_title.gif"
			width="800" height="43"></td>
	</tr>
	<tr>
		<td align="center">
		<table width="780" border="0" cellspacing="0" cellpadding="0">
<!--			<tr>
				<td height="40" align="right">
				<table border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td height="8"></td>
					</tr>
					<tr>
						<td><a href="#"><img src="/img/help_icon.gif" alt="����"
							width="65" height="18" border="0"></a></td>
					</tr>
				</table>
				</td>
			</tr>
-->
			<tr>
				<td height="1" bgcolor="eaeaea"></td>
			</tr>
			<tr>
				<td height="14"></td>
			</tr>
		</table>

		<table width="780" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td align="left" height="22" background="/img/tab_line_blue.gif">
				<table border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td width="111"><a href="/admin/commCode/areaCode.do"><img
							src="/img/sub_admin_title4_off.gif" alt="�����ڵ�" width="110"
							height="22" border="0"></a></td>
						<td  width="111"><a href="/admin/commCode/orgCode.do"><img
							src="/img/sub_admin_title5_off.gif" alt="�μ��ڵ�" width="110"
							height="22" border="0"></a></td>
						<td width="111"><a href="/admin/commCode/purposeCode.do"><img
							src="/img/sub_admin_title6_off.gif" alt="��������ڵ�" width="110"
							height="22" border="0"></a></td>
						<td width="111"><a href="/admin/commCode/taxCode.do"><img
							src="/img/sub_admin_title7_off.gif" alt="���������ڵ�" width="110"
							height="22" border="0"></a></td>
						<td width="111"><a href="#"><img
							src="/img/sub_admin_title8_on.gif" alt="�����ȣ�ڵ�" width="110"
							height="22" border="0"></a></td>
						<td width="111"><a href="/admin/commCode/jojungCode.do"><img
							src="/img/sub_admin_title9_off.gif" alt="�������" width="110"
							height="22" border="0"></a></td>
						<td width="111"><a href="/admin/commCode/gradeCode.do"><img
							src="/img/sub_admin_title12_off.gif" alt="����ڵ�" width="110"
							height="22" border="0"></a></td>
						<td width="111"><a href="/admin/commCode/officeCode.do"><img
							src="/img/sub_admin_title13_off.gif" alt="��ü�ڵ�" width="110"
							height="22" border="0"></a></td>							
					</tr>
				</table>
				</td>
			</tr>
			<tr>
				<td align="left" class="contborder_blue">
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td>
						<table width="100%" border="1" bordercolor="#c9dfed"
							style="border-collapse:collapse;" cellpadding="0" cellspacing="0"
							class="sub_table">
							<tr>
								<td height="35" colspan="8" bgcolor="f2f2f2"
									class="table_bl_left">
								<table border="0" cellpadding="0" cellspacing="0"
									class="sub_stan">
									<tr>
										<td width="106" align="center" class="sub_table_b">������</td>
										<td><input name="areaName" id="areaName" type="text"
											class="input_form1" style="width:200px" value="${areaName}" onKeyDown="javascript:checkKeySearch();"></td>
										<td><a href="#"><img src="/img/inquiry_icon2.gif"
											alt="��ȸ" width="56" height="18" border="0" onClick="javascript:reSearch();"></a></td>
										<td width="10">&nbsp;</td>
										<td>(���鵿, ��, �ǹ������� ��ȸ)</td>
									</tr>
								</table>
								</td>
							</tr>
							<tr>
								<td width="15%" height="28" align="center" bgcolor="e5eff8"
									class="sub_table_b">�����ȣ</td>
								<td width="7%" align="center" bgcolor="e5eff8" class="sub_table_b">�õ�</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">�ñ���</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">���鵿</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">��</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">�ǹ���</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">�����</td>
							</tr>
							<c:forEach items="${zipCodelist}" var="zipCode" varStatus="idx">
								<tr onMouseOver="this.style.backgroundColor='#f6f7f8'"
									onMouseOut="this.style.backgroundColor=''">
									<td height="26" align="center">${zipCode.ZIP_CL}</td>
									<td align="center">${zipCode.SI_NM}</td>
									<td align="center">${zipCode.SGG_NM}</td>
									<td align="center">${zipCode.EMD_NM}</td>
									<td align="center">${zipCode.RI_NM}</td>
									<td align="center">${zipCode.BD_NM}</td>
									<td align="center">${zipCode.ISLAND_NM}</td>
									<td align="center">${zipCode.LNDN_CM}</td>
								</tr>
							</c:forEach>
						</table>
						</td>
					</tr>
				</table>
				</td>
			</tr>

		</table>
		</td>
	</tr>
</table>
</form>
</body>
</html>

