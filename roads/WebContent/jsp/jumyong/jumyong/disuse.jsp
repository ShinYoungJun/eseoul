<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/include.jsp"%>
<%@ include file="/jsp/common/loginCheck.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />
<title>::::: 서울시 도로점용관리시스템 :::::</title>
<style type="text/css">
<!--
body {
	margin: 0px;
	background-image: url(/img/left_back.gif);
}
-->
</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
<script language="javascript" src="/js/calculation.js"></script>
<script language="javascript" src="/js/PopupCalendar.js"></script>
<script>
	function InitPage() {
		if ('${afterSave}' == '1') {

			var parentAddr = parent.location.href;
			var startStr = parentAddr.indexOf("section");

			parent.location.href = parentAddr.substring(0, startStr + 8) + '${SECTION}'
					+ parentAddr.substring(startStr + 9, parentAddr.length);
		}

		if ('${disuse.DISUSE_DATE}'.length < 1) {
			document.getElementById("DISUSE_DATE").value = (document.getElementById("toDate").value);
		}

		if (document.getElementById("mode").value == "edit" || document.getElementById("mode").value == "new") {
			document.getElementById("view").style.display = "none";
			document.getElementById("edit").style.display = "block";
		} else {
			document.getElementById("view").style.display = "block";
			document.getElementById("edit").style.display = "none";
			
		}
	}

	function submitClick() {
		var disUseForm = document.disUseForm;

		if (disUseForm.DISUSE_MANAGER.value == "") {
			alert("담당자를 넣어주세요");
			disUseForm.DISUSE_MANAGER.focus();
			return;
		}
		if (disUseForm.DISUSE_DATE.value == "") {
			alert("등록일자를 넣어주세요");
			popUpCalendar(document.getElementById('calendar'), document
					.getElementById('DISUSE_DATE'), 'yyyymmdd');
			return;
		}
		if (disUseForm.DISUSE_REASON.value == "") {
			alert("등록이유를  넣어주세요");
			disUseForm.DISUSE_REASON.focus();
			return;
		}
		disUseForm.submit();
	}

	function goModify() {
		var goUrl = "/jumyong/disUse.do?ADMIN_NO="
				+ document.getElementById("ADMIN_NO").value + "&mode=edit";
		location.href(goUrl);
	}
	function goDelete() {
		if( confirm("해지하시겠습니까? ") ){
			var goUrl = "/jumyong/disUse.do?ADMIN_NO=" + document.getElementById("ADMIN_NO").value + "&mode=del";
			location.href(goUrl);
		}
	}
</script>

</head>

<body onload="javascript:InitPage();">

	<form id="disUseForm" name="disUseForm" method="post" action="/jumyong/disUse.do">

		<input id="ADMIN_NO" name="ADMIN_NO" value="${ADMIN_NO}" type="hidden">
		<input id="mode" name="mode" value="${mode}" type="hidden"> 
		<input id="toDate" name="toDate" value="${toDate}" type="hidden"> 
		<input id="OLD_SECTION" name="OLD_SECTION" value="${SECTION}" type="hidden">

		<div id="view" style="width: 100%;">
			<table width="780" border="0" cellspacing="0" cellpadding="0">
				<tr>
					<td height="22" background="/img/tab_line_purple.gif"></td>
				</tr>
				<tr>
					<td class="contborder_purple">
						<table width="100%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td>
									<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse: collapse;" cellpadding="0" cellspacing="0" class="sub_table">
										<tr>
											<td width="15%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">담당자</td>
											<td width="35%" bgcolor="eaeaea" class="table_bl_left">${disuse.DISUSE_MANAGER}</td>
											<td width="15%" width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">등록일</td>
											<td width="35%" bgcolor="eaeaea" class="table_bl_left">${disuse.DISUSE_DATE}</td>
										</tr>
										<tr>
											<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">이유</td>
											<td bgcolor="eaeaea" class="table_bl_left" colspan="3">${disuse.DISUSE_REASON}</td>
										</tr>
									</table></td>
							</tr>
							<tr>
								<td height="10" align="right" colspan="3"></td>
							</tr>

							<tr>
								<td height="10" align="right" colspan="3">
									<img src="/img/discan_icon.gif" alt="해지" width="56" height="18" border="0" onClick="javascript:goDelete();" style="cursor: pointer">
									<img src="/img/mod_icon.gif" alt="수정" width="56" height="18" border="0" onClick="javascript:goModify();" style="cursor: pointer">
								</td>
							</tr>
						</table></td>
				</tr>
			</table>
		</div>

		<div id="edit" style="width: 100%; display: none;">
			<table width="780" border="0" cellspacing="0" cellpadding="0">
				<tr>
					<td height="22" background="/img/tab_line_purple.gif"></td>
				</tr>
				<tr>
					<td class="contborder_purple">
						<table width="100%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td>
									<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse: collapse;" cellpadding="0" cellspacing="0" class="sub_table">
										<tr>
											<td width="15%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">담당자</td>
											<td width="35%" bgcolor="eaeaea" class="table_bl_left">
												<input id="DISUSE_MANAGER" name="DISUSE_MANAGER" type="text" class="input_form1" style="width: 120px" value="${disuse.DISUSE_MANAGER}" maxlength="20">
											</td>
											<td width="15%" width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">등록일</td>
											<td width="35%" bgcolor="eaeaea" class="table_bl_left">
													<input id="DISUSE_DATE" name="DISUSE_DATE" type="text" class="input_form1" style="width: 60px" value="${disuse.DISUSE_DATE}" readonly>
													<img id="calendar" src="/img/calendar_icon.gif" style="cursor: pointer" onclick="popUpCalendar(this, document.getElementById('DISUSE_DATE'), 'yyyymmdd');">
											</td>
										</tr>
										<tr>
											<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">이유</td>
											<td bgcolor="eaeaea" class="table_bl_left" colspan="3">
												<input id="DISUSE_REASON" name="DISUSE_REASON" type="text" class="input_form1" style="width: 500px" value="${disuse.DISUSE_REASON}" maxlength="100">
											</td>
										</tr>

									</table></td>
							</tr>
							<tr>
								<td height="10" align="right" colspan="3"></td>
							</tr>

							<tr>
								<td height="10" align="right" colspan="3">
									<img src="/img/closing_application.gif" alt="폐쇄적용" border="0" onClick="javascript:submitClick();" style="cursor: pointer">
								</td>
							</tr>
						</table></td>
				</tr>
			</table>
		</div>
	</form>
</body>
</html>

