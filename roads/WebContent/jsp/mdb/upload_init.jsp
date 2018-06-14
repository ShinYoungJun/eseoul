<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/loginCheck.jsp"%>
<%@ include file="/jsp/common/include.jsp"%>
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
<script language="javascript" src="/js/common.js"></script>
<script language="javascript" src="/js/PopupCalendar.js"></script>
<script language="javascript" src="/js/calculation.js"></script>
<script language="javascript" src="/js/selectItem.js"></script>
<script language="javascript" src="/js/Ajax_request.js"></script>
<script>
<!--
	function goUpload() {

		document.getElementById("FildDownIco").onclick = function() {
			alert("잠시만 기다리세요.");
		};
		var count = 0;
		var hitFlag;
		var select_item = document.getElementsByName("SELECT_ITEM");
		var item_check = document.getElementsByName("ITEM_CHECK");
		var gapan_no = document.getElementsByName("GAPAN_NO");

		for ( var i = 0; i < select_item.length; i++) {
			if (select_item[i].checked == true) {
				item_check[i].value = select_item[i].checked;
				count++;
				hitFlag = i;
			}
		}

		if (count == 0) {

			alert("서버에 저장할 항목을 체크해주세요");

			return;
		}
		MessageDisplay('filedown','FILEDOWNValue',1);
		document.jumyongForm.action = "/mdb/uploadInputData.do";
		document.jumyongForm.submit();
	}

	function goSurvey() {
		document.jumyongForm.action = "/mdb/upRedirectSurvey.do";
		document.jumyongForm.submit();
	}

	function init() {
		setYear(document.getElementById("YEAR"), "${YEAR}");
	}
</script>

</head>

<body onload="init();">
	<form id="jumyongForm" name="jumyongForm" method="post">
		<input type="hidden" name="OWNER_FILE_NAME" id="OWNER_FILE_NAME" value="${OWNER_FILE_NAME }"> 
		<input type="hidden" name="FILE_NAME" id="FILE_NAME" value="${FILE_NAME}">
			<div id="filedown" style="position:absolute;display:none;">
            	<table id="FILEDOWNValue" width="213px" height="59px">
            	<tr>
            		<td>
            			<img src="/img/loadingBar.gif">
            		</td>
            	</tr>
            	</table>
            </div>
		<table width="780px" border="0" cellpadding="0" cellspacing="0">
			<tr>
				<td height="43">
					<img src="/img/sub7_cont0_title.gif" width="800" height="43">
				</td>
			</tr>
			<tr>
				<td align="center">
					<table width="780px" border="0" cellspacing="0" cellpadding="0">
						<tr>
							<td>
								<table width="780px" border="0" cellspacing="0" cellpadding="0">
									<tr>
										<td align="left" height="22" background="/img/tab_line_blue.gif"></td>
									</tr>
									<tr>
										<td class="contborder_purple">
											<table width="100%" border="0" cellspacing="0" cellpadding="0">
												<tr>
													<td>
														<table width="100%" border="0" bordercolor="#c9dfed" style="border-collapse: collapse;" cellpadding="0" cellspacing="0" class="sub_table">
															<tr>
																<td height="0" bgcolor="#EAEAEA"></td>
															</tr>

															<tr>
																<td>
																	<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse: collapse;" cellpadding="0" cellspacing="0" class="sub_table">
																		<tr>
																			<td height="26px" width="120px" align="center" bgcolor="e5eff8" class="sub_table_b">조사년도</td>
																			<td bgcolor="eaeaea" class="table_bl_left" align="left">
																				<select id="YEAR" name="YEAR" class="input_form1" style="width: 130px">
																				</select>
																			</td>
																		</tr>
																	</table>
																</td>
															</tr>

															<tr>
																<td height="34" class="sub_stan" align="left">
																	전체건수 : <span class="sub_stan_blue">${listCount} </span>건
																</td>
															</tr>
															<tr>
																<td>
																	<table width="780px" cellpadding="0" cellspacing="0" border="0" class="sub_table" bordercolor="#c9dfed" style="border-collapse: collapse;">
																		<TR>
																			<TD width="26px" valign="top">
																				<TABLE cellpadding="0" cellspacing="0" border="1" class="sub_table" bordercolor="#c9dfed" style="border-collapse: collapse;">
																					<TR >
																						<td height="26px" width="35px" align="center" bgcolor="e5eff8" class="sub_table_b">
																							<INPUT TYPE="checkbox" ID="SELECT_ALL" onclick="javascript:selectAll(this);">
																						</td>
																					</TR>
																				</TABLE>
																			</TD>
																			<TD width="1740px" valign="top" align="left">
																				<DIV id="topLine2" style="width: 737px; overflow: hidden;">
																					<TABLE width="940px" cellpadding="0" cellspacing="0" border="1" class="sub_table" bordercolor="#c9dfed" style="border-collapse: collapse;">
																						<tr >
																							<td height="26px" width="50px" align="center" bgcolor="e5eff8" class="sub_table_b">처리</td>
																							<td width="130px" align="center" bgcolor="e5eff8" class="sub_table_b">관리번호</td>
																							<td width="90px" align="center" bgcolor="e5eff8" class="sub_table_b">운영인</td>
																							<td width="130px" align="center" bgcolor="e5eff8" class="sub_table_b">주민등록번호</td>
																							<td width="150px" align="center" bgcolor="e5eff8" class="sub_table_b">인접지주소</td>
																							<td width="130px" align="center" bgcolor="e5eff8" class="sub_table_b">주변정보</td>
																							<td width="80px" align="center" bgcolor="e5eff8" class="sub_table_b">면적(㎡)</td>
																							<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">정비/관리</td>
																							<td width="80px" align="center" bgcolor="e5eff8" class="sub_table_b">수정일</td>
																						</tr>
																					</TABLE>
																				</DIV></TD>
																		</TR>
																		<tr>

																			<TD width="26px" valign="top">
																				<DIV id="leftDisplay2" style="width: 26px; height: 303px; overflow: hidden;">
																					<TABLE cellpadding="0" cellspacing="0" border="1" class="sub_table" bordercolor="#c9dfed" style="border-collapse: collapse;">
																						<c:forEach items="${list}" var="board" varStatus="idx">
																							<tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" style="cursor: pointer">
																								<td width="35px" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">
																									<INPUT TYPE="checkbox" NAME="SELECT_ITEM"> 
																									<INPUT TYPE="hidden" NAME="GAPAN_NO" value="${board.GAPAN_NO}"> 
																									<INPUT TYPE="hidden" NAME="OWNER_SSN" value="${board.OWNER_SSN}"> 
																									<INPUT TYPE="hidden" NAME="MODIFY_YN" value="${board.MODIFY_YN}"> 
																									<INPUT TYPE="hidden" NAME="ITEM_CHECK" value="">
																								</td>
																							</tr>
																						</c:forEach>
																					</TABLE>
																				</DIV></TD>
																			<TD width="1740px" valign="top">

																				<DIV id="mainDisplay2" style="width: 754px; height: 320px; overflow: scroll; scrollbar-face-color: #EEF8FB; scrollbar-3dlight-color: #BBBDB6; scrollbar-highlight-color: #EEF8FB; scrollbar-shadow-color: #BBBDB6; scrollbar-darkshadow-color: #EEF8FB; scrollbar-track-color: #EEF8FB; scrollbar-arrow-color: #BBBDB6;" onScroll="scrollAll()">
																					<TABLE cellpadding="0" width="940px" cellspacing="0" border="1" class="sub_table" bordercolor="#c9dfed" style="border-collapse: collapse;">
																						<c:forEach items="${list}" var="board" varStatus="idx">
																							<tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" style="cursor: pointer">
																								<td height="26px" width="50px" align="center">
																									<c:choose>
																										<c:when test="${board.MODIFY_YN == 'I' || board.MODIFY_YN == 'i'}">
																											<font color="red">추가</font>
																										</c:when>
																										<c:when test="${board.MODIFY_YN == 'u' || board.MODIFY_YN == 'U'}">
																											<font color="red">수정</font>
																										</c:when>
																										<c:when test="${board.MODIFY_YN == 'd' || board.MODIFY_YN == 'D'}">
																											<font color="red">삭제</font>
																										</c:when>
																										<c:otherwise>
																											<font color="red">-</font>
																										</c:otherwise>
																									</c:choose>
																								</td>
																								<td width="130px" align="center">${board.GAPAN_NO}<input name="GAPAN_NO_ARR" type="hidden" value="${board.GAPAN_NO}"></td>
																								<td width="90px" align="center">${board.OWNER_NAME}</td>
																								<td width="130px">${board.OWNER_SSN }</td>
																								<td width="150px">${board.WITH_ADDR }</td>
																								<td width="130px">${board.WITH_INFO }</td>
																								<td width="80px" align="center">${board.PLACE_A}</td>
																								<td width="100px" align="center">
																									<c:choose>
																									<c:when test="${board.MAINTN_OB == '1'}">
																									관리대상
                                                                                        			</c:when>
																									<c:otherwise>
																									정비대상
                                                                                        			</c:otherwise>
																									</c:choose>
																								</td>
																								<td width="80px" align="center">${rnic:addDash(board.UP_DATE)}</td>
																							</tr>
																						</c:forEach>
																					</TABLE>
																				</DIV>
																			</TD>
																		</TR>
																	</table>
																</td>
															</tr>
															<tr>
																<td align="right" height="40">
																	<img src="/img/list_icon.gif" alt="리스트" width="66" height="22" border="0" onclick="javascript:goSurvey();" style="cursor: pointer">
																	<img id="FildDownIco" name="FildDownIco" src="/img/data_upload.gif" alt="현장조사파일업로드" border="0" onclick="javascript:goUpload();" style="cursor: pointer;">
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
								</table></td>
						</tr>
					</table></td>
			</tr>
		</table>
	</form>
</body>
</html>
