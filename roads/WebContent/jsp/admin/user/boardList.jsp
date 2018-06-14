<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR" %>

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
</head>

<script language="javascript" src="/js/PopupCalendar.js"></script> 
<script language="javascript" src="/js/common.js"></script> 
<script type="text/javascript">
//<![CDATA[
	
	function  reSearch()
	{
		var w = document.listForm;
		
		//if(!isDate(w.fromDate, "시작일")) return;
		//if(!isDate(w.toDate, "종료일")) return;
		if(w.fromDate.value > w.toDate.value)
		{ 
			alert("시작일자는 종료일자보다 클수없습니다!");
			w.fromDate.select();
			return;
		}

		w.action = "/admin/noticeBoardList.do";		
		w.submit();	
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
	
	//숫자만 입력
	function onlyNumberInput()
	{	
		var code = window.event.keyCode;
	
	 	if ((code > 34 && code < 41) || (code > 47 && code < 58) || (code > 95 && code < 106) || code == 8 || code == 9 || code == 13 || code == 46)
	 	{
		  	window.event.returnValue = true;
			return;
	 	}else {	 
	 		window.event.returnValue = false;
	 		return;
 	 	}
	}
//]]>
</script>

<body>
<form name="listForm" method="post" >

<table width="800" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td align="center">
			<table width="780" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td><img src="/img/notice_search.gif"></td>
			</tr>
			</table>
		<table width="780" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td>
				<table width="780" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td align="left" height="22" background="/img/tab_line_blue.gif">
						</td>
					</tr>
					<tr>
						<td align="left" class="contborder_blue">
						
						<input name="modeType" type="hidden" value="del"> 
						<input name="deleteSeq" id="deleteSeq" type="hidden" >
						<table width="100%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td>
								<table width="100%" border="1" bordercolor="#c9dfed"
									style="border-collapse:collapse;" cellpadding="0"
									cellspacing="0" class="sub_table">
									<tr>
										<td width="15%" height="28" align="center" bgcolor="e5eff8"
											class="sub_table_b">검색내용</td>
										<td bgcolor="eaeaea" class="table_bl_left"><select
											name="gubun"  class="input_form1" style="width:100px">
											<option>::선택::</option>
											<option value="1">내용</option>
											<option value="2">글제목</option>
											<option value="3">작성자</option>
											<option value="4">파일명</option>
										</select> <input name="content" type="text" class="input_form1"
											style="width:120px" value="${content}"></td>
										<td width="15%" align="center" bgcolor="e5eff8"
											class="sub_table_b">작성일</td>
										<td bgcolor="eaeaea" class="table_bl_left">
										<table border="0" cellpadding="0" cellspacing="0"
											class="sub_stan">
											<tr>
												<td><input name="fromDate" id="fromDate" type="text"
													class="input_form1" style="width:80px;ime-mode:disabled" value="${fromDate}" onkeydown="onlyNumberInput();"></td>
												<td><a href="#"><img src="/img/calendar_icon.gif"
													width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('fromDate'), 'yyyymmdd');"></a></td>
												<td width="16" align="center">~</td>
												<td><input name="toDate" id="toDate" type="text"
													class="input_form1" style="width:80px;ime-mode:disabled" value="${toDate}" onkeydown="onlyNumberInput();"></td>
												<td><a href="#"><img src="/img/calendar_icon.gif"
													width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('toDate'), 'yyyymmdd');"></a></td>
											</tr>
										</table>
										</td>
									</tr>
								</table>
								</td>
							</tr>
							<tr>
								<td height="40" align="right"><img
									src="/img/search_icon.gif" alt="조회" width="56" height="18"
									border="0" onClick="javascript:reSearch();" style="cursor:pointer"></td>
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
						<td align="left"><img src="/img/notice_list.gif"></td>
					</tr>
				</table>	
				<table width="780" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td align="left" height="22" background="/img/tab_line_blue.gif">
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
										<td width="5%" height="28" align="center" bgcolor="e5eff8"
											class="sub_table_b">번호</td>
										<td align="center" bgcolor="e5eff8" class="sub_table_b">글제목</td>
										<td align="center" bgcolor="e5eff8" class="sub_table_b">작성자</td>
										<td align="center" bgcolor="e5eff8" class="sub_table_b">작성일</td>
										<td align="center" bgcolor="e5eff8" class="sub_table_b">공개여부</td>
									</tr>
									<input name="listSize" id="listSize" value="${listSize}" type="hidden">
									<c:forEach items="${blist}" var="board" varStatus="idx">
										 <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''">
											<td align="center" height="26">${board.BOARD_ID}</td>
											<td align="center"><a href="/admin/boardDetail.do?seq=${board.BOARD_ID}&modeType=noticeList" class="inqu">${board.TITLE}</a></td>
											<td align="center">${board.USER_ID}</td>
											<td align="center">${board.REGDATE}</td>
											<td align="center">${board.PUBLIC_NM}</td>
										</tr>
									</c:forEach>
								</table>
								</td>
							</tr>
							<tr>
								<td height="40" align="center">
								<table width="100%" border="0" cellspacing="0" cellpadding="0">
									<tr>
										<td align="center">
										<table border="0" cellpadding="0" cellspacing="0">
											<tr>
												<!-- 페이징시작 -->${strPageDivideForm}<!-- 페이징끝 -->	
											</tr>
										</table>
										</td>
										<tr>
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
				<td height="10"></td>
			</tr>
			<tr>
				<td height="40" align="right"><img src="/img/go_chogi.gif" alt="초기화면으로"
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
	setSelectedOption(document.listForm.gubun, "${gubun}");
//-->
</script>     
</form>
</body>

</html>

