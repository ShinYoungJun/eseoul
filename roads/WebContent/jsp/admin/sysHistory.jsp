<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
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
html {overflow-x : hidden;}
-->
</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
</head>

<script language="javascript" src="/js/PopupCalendar.js"></script> 
<script language="javascript" src="/js/common.js"></script> 
<script type="text/javascript">
//<![CDATA[
           
	function reSearch()
	{	
		var w = document.listForm;
		
		//if(!isDate(w.fromDate, "������")) return;
		//if(!isDate(w.toDate, "������")) return;
		if(w.fromDate.value > w.toDate.value)
		{ 
			alert("�������ڴ� �������ں��� Ŭ�������ϴ�!");
			w.fromDate.select();
			return;
		}
		w.action = "/admin/sysHistory.do";	
		w.submit();
	}
	
//]]>
</script>

<body onload="fn_logout(document.URL);">
<form name="listForm" method="post">
<table width="800" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td height="43"><img src="/img/admin_cont4_title.gif"
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
			<tr>
				<td>
				<table width="780" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td align="left" height="22" background="/img/tab_line_blue.gif">
						<table border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td><img src="/img/sub_admin_title10.gif" width="110"
									height="22"></td>
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
									style="border-collapse:collapse;" cellpadding="0"
									cellspacing="0" class="sub_table">
									<tr>
										<td width="15%" height="28" align="center" bgcolor="e5eff8"
											class="sub_table_b">��������</td>
										<td bgcolor="eaeaea" class="table_bl_left"><select
											name="section" class="input_form1" style="width:120px">
											<option value="">::��ü::</option>
											<option value="1">�������</option>
											<option value="2">����а���</option>
											<option value="3">�ü�������</option>
											<option value="3">�Ÿ�������ġ������</option>
										</select></td>
										<td width="15%" align="center" bgcolor="e5eff8"
											class="sub_table_b">��������</td>
										<td bgcolor="eaeaea" class="table_bl_left">
										<table border="0" cellpadding="0" cellspacing="0"
											class="sub_stan">
											<tr>
												<td><input name="fromDate" type="text"
													class="input_form1" style="width:80px" value="${fromDate}"></td>
												<td><a href="#"><img src="/img/calendar_icon.gif"
													width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('fromDate'), 'yyyymmdd');"></a></td>
												<td width="16" align="center">~</td>
												<td><input name="toDate" type="text"
													class="input_form1" style="width:80px" value="${toDate}"></td>
												<td><a href="#"><img src="/img/calendar_icon.gif"
													width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('toDate'), 'yyyymmdd');"></a></td>
											</tr>
										</table>
										</td>
									</tr>
									<tr>
										<td height="26" align="center" bgcolor="e5eff8"
											class="sub_table_b">����ڸ�</td>
										<td bgcolor="eaeaea" class="table_bl_left"><input
											name="userName" type="text" class="input_form1"
											style="width:120px" value="${userName}"></td>
										<td align="center" bgcolor="e5eff8" class="sub_table_b">ó������</td>
										<td bgcolor="eaeaea" class="table_bl_left"><select
											name="eventType" class="input_form1" style="width:120px">
											${eventType}
										</select></td>
									</tr>
								</table>
								</td>
							</tr>
							<tr>
								<td height="40" align="right"><a href="javascript:reSearch();"><img
									src="/img/search_icon.gif" alt="��ȸ" width="56" height="18"
									border="0"></a></td>
							</tr>
						</table>
						</td>
					</tr>

				</table>
				</td>
			</tr>
			<tr>
				<td height="30"></td>
			</tr>
			<tr>
				<td>
				<table width="780" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td align="left" height="22" background="/img/tab_line_blue.gif">
						<table border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td><img src="/img/sub_admin_title2.gif" width="110"
									height="22"></td>
							</tr>
						</table>
						</td>
					</tr>
					<tr>
						<td align="left" class="contborder_blue">
						<table width="100%" border="0" cellspacing="0" cellpadding="0">
							<tr>
               					<td width="100%" height="34" class="sub_stan" align="left">��ü�Ǽ� : <span class="sub_stan_blue">${totalCount}</span> �� </td>
               				</tr>
							<tr>
								<td>
								<table width="100%" border="1" bordercolor="#c9dfed"
									style="border-collapse:collapse;" cellpadding="0"
									cellspacing="0" class="sub_table">
									<tr>
										<td height="28" align="center" bgcolor="e5eff8"
											class="sub_table_b">��ȣ</td>
										<td align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
										<td align="center" bgcolor="e5eff8" class="sub_table_b">������ȣ</td>
										<td align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
										<td align="center" bgcolor="e5eff8" class="sub_table_b">���泻��</td>
										<td align="center" bgcolor="e5eff8" class="sub_table_b">�����</td>
										<td align="center" bgcolor="e5eff8" class="sub_table_b">�󼼾���</td>
										<td align="center" bgcolor="e5eff8" class="sub_table_b">ó������</td>
									</tr>
									<c:forEach items="${blist}" var="list" varStatus="idx">
										<tr onMouseOver="this.style.backgroundColor='#f6f7f8'"
											onMouseOut="this.style.backgroundColor=''">
											<td align="center" height="26">${idx.count}</td>
											<td align="center">${list.REG_DATE}</td>										
											<td align="center">${list.ADMIN_NO}</td>
											<td align="center">${list.NAME}</td>
											<td align="center">${list.MODIFICATION_CONT}</td>
											<td align="center">${list.USER_ID}</td>
											<td align="center">${list.EVENT_TYPE}</td>
											<td align="center">${list.CUD_NAME}</td>
										</tr>
									</c:forEach>
								</table>
								</td>
							</tr>
							<tr>
								<td height="40" align="center">
								<table border="0" cellpadding="0" cellspacing="0">
									<tr>
										<!-- ����¡���� -->${strPageDivideForm}<!-- ����¡�� -->	
									</tr>
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
		</td>
	</tr>
	<tr>
		<td height="30"></td>
	</tr>
</table>

<script language="javascript">
<!--
	setSelectedOption(document.listForm.section, "${section}");
	setSelectedOption(document.listForm.eventType, "${eventType}");
//-->
</script>  
</form>
</body>

</html>

