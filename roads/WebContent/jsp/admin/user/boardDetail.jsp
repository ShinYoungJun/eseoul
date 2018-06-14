<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/include.jsp"%>
 
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
html {overflow-x : hidden;}
-->
</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
</head>

<script language="javascript" src="/js/common.js"></script> 
<script language="javascript" src="/js/PopupCalendar.js"></script>

<body>

<form name="regForm" id="regForm" method="post">
<table width="800" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td align="center">
		<table width="780" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td height="1" bgcolor="eaeaea"></td>
			</tr>
			<tr>
				<td height="14"></td>
			</tr>
			<tr>
				<td align="left">
				<table width="780" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td><img src="/img/notice_search.gif"></td>
					</tr>
					<tr>
						<td align="center" class=""><input
							name="modeType" type="hidden" value="edit"> <input
							name="seq" type="hidden" value="${boardReg.BOARD_ID}">

						<table width="780" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td>
								<table width="100%" border="1" bordercolor="#c9dfed"
									style="border-collapse:collapse;" cellpadding="0"
									cellspacing="0" class="sub_table">
									<tr>
										<td width="15%" height="28" align="center" bgcolor="e5eff8"
											class="sub_table_b">제 목</td>
										<td width="30%" bgcolor="eaeaea" class="table_bl_left"><input
											name="TITLE" type="text" class="input_form1"
											style="width:160px" value="${boardReg.TITLE}" readonly></td>
										<td width="15%" align="center" bgcolor="e5eff8"
											class="sub_table_b">작성자</td>
										<td colspan="4" bgcolor="eaeaea" class="table_bl_left">
											<input name="USER_ID" type="text" class="input_form1"
												style="width:80px" value="${boardReg.USER_ID}" readonly>
										</td>
									</tr>
										<tr>
											<td width="15%" height="26" align="center" bgcolor="e5eff8"
												class="sub_table_b">공개여부</td>
											<td width="30%"  bgcolor="eaeaea"
												class="table_bl_left"><select name="PUBLIC_YN" id="PUBLIC_YN"
												class="input_form1" style="width:100px" disabled=false>
												<option value="">선택하세요</option>
												<option value="1">서울시공지</option>
												<option value="2">자치구공지</option>
												<option value="3">전체공개</option>
												<option value="4">비공개</option>
												<option value="5">팝업공지</option>
											</select></td>
											<td width="15%" align="center" bgcolor="e5eff8"
												class="sub_table_b">공지예약</td>
											<td bgcolor="eaeaea" class="table_bl_left">
											<table border="0" cellpadding="0" cellspacing="0"
												class="sub_stan"><tr>
												<td><input name="NOTICE_FROMDATE" type="text"
													class="input_form1" value="${boardReg.NOTICE_FROMDATE}" readonly></td>
												
												<td width="16" align="center">~</td>
												<td><input name="NOTICE_TODATE" type="text"
													class="input_form1" value="${boardReg.NOTICE_TODATE}" readonly></td>
											</tr>
											</table>
											
										</tr>
									</table>
								</table>
								</td>
							</tr>
							<tr>
								<td height="15"></td>
							</tr>
							<tr>
								<td><img src="/img/notice_content.gif"></td>
							</tr>
							<tr>
								<td align="center" valign="top"><textarea
									name="CONTENT" class="text_box" style="width:97%;height:230px" readonly>${boardReg.CONTENT}</textarea>
								</td>
							</tr>
						</table>

						</td>
					</tr>

				</table>
				</td>
			</tr>
			<tr>
				<td height="10"></td>
			</tr>
			<tr>
				<td>
				<table width="99%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td height="40" align="right"><img src="/img/go_chogi.gif" alt="초기화면으로 가기"
							border="0" onclick="window.close();" style="cursor:pointer"></td>
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
	setSelectedOption(document.regForm.PUBLIC_YN, "${boardReg.PUBLIC_YN}");
//-->
</script>
</form>
</body>
</html>

