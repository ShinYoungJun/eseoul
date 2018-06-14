<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />
<title>::::: SOWNN00222 :::::</title>
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
		
		//if(!isDate(w.fromDate, "시작일")) return;
		//if(!isDate(w.toDate, "종료일")) return;
		if(w.fromDate.value > w.toDate.value)
		{ 
			alert("시작일자는 종료일자보다 클수없습니다!");
			w.fromDate.select();
			return;
		}
		w.action = "/admin/sysHistory.do";	
		w.submit();
	}
	
//]]>
</script>

<body>
<form name="listForm" method="post">
<table width="800" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td height="43"><img src="/img/admin_cont4_title.gif"
			width="800" height="43"></td>
	</tr>
	<tr>
		<td align="center">
		<table width="780" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td height="40" align="right"><!--상단 기안문상신,도움말 메뉴-->
				<table border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td height="8"></td>
					</tr>
					<tr>
						<td><a href="#"><img src="/img/help_icon.gif" alt="도움말"
							width="65" height="18" border="0"></a></td>
					</tr>
				</table>
				<!--상단 기안문상신,도움말 메뉴--></td>
			</tr>
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
											class="sub_table_b">업무구분</td>
										<td bgcolor="eaeaea" class="table_bl_left"><select
											name="section" class="input_form1" style="width:120px">
											<option value="">선택하세요</option>
											<option value="1">점용관리</option>
											<option value="2">정기분관리</option>
											<option value="3">시설물관리</option>
										</select></td>
										<td width="15%" align="center" bgcolor="e5eff8"
											class="sub_table_b">발생일자</td>
										<td bgcolor="eaeaea" class="table_bl_left">
										<table border="0" cellpadding="0" cellspacing="0"
											class="sub_stan">
											<tr>
												<td><input name="fromDate" type="text"
													class="input_form1" style="width:80px" value="${code}"></td>
												<td><a href="#"><img src="/img/calendar_icon.gif"
													width="19" height="16" border="0" onclick="popUpCalendar(this, fromDate, 'yyyymmdd');"></a></td>
												<td width="16" align="center">~</td>
												<td><input name="toDate" type="text"
													class="input_form1" style="width:80px" value="${msg}"></td>
												<td><a href="#"><img src="/img/calendar_icon.gif"
													width="19" height="16" border="0" onclick="popUpCalendar(this, toDate, 'yyyymmdd');"></a></td>
											</tr>
										</table>
										</td>
									</tr>
									<tr>
										<td height="26" align="center" bgcolor="e5eff8"
											class="sub_table_b">아이디</td>
										<td bgcolor="eaeaea" class="table_bl_left"><input
											name="userId" type="text" class="input_form1"
											style="width:120px" value="${resCode}"></td>
										<td align="center" bgcolor="e5eff8" class="sub_table_b">처리유형</td>
										<td bgcolor="eaeaea" class="table_bl_left"><select
											name="eventType" class="input_form1" style="width:120px">
											<option value="">선택하세요</option>
											<option value="1">신규등록</option>
											<option value="2">수정</option>
											<option value="3">삭제</option>
										</select></td>
									</tr>
								</table>
								</td>
							</tr>
							<tr>
								<td height="40" align="right"><a href="javascript:reSearch();"><img
									src="/img/search_icon.gif" alt="조회" width="56" height="18"
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
               					<td width="100%" height="34" class="sub_stan" align="left">전체건수 : <span class="sub_stan_blue"></span> 건 </td>
               				</tr>
							<tr>
								<td>
								<table width="100%" border="1" bordercolor="#c9dfed"
									style="border-collapse:collapse;" cellpadding="0"
									cellspacing="0" class="sub_table">
									<tr>
										<td height="28" align="center" bgcolor="e5eff8"
											class="sub_table_b">번호</td>
										<td align="center" bgcolor="e5eff8" class="sub_table_b">발생일</td>
										<td align="center" bgcolor="e5eff8" class="sub_table_b">관리번호</td>
										<td align="center" bgcolor="e5eff8" class="sub_table_b">점용인</td>
										<td align="center" bgcolor="e5eff8" class="sub_table_b">변경내용</td>
										<td align="center" bgcolor="e5eff8" class="sub_table_b">사용자</td>
										<td align="center" bgcolor="e5eff8" class="sub_table_b">상세업무</td>
										<td align="center" bgcolor="e5eff8" class="sub_table_b">처리유형</td>
									</tr>
									<c:forEach items="${list}" var="list" varStatus="idx">
										<tr onMouseOver="this.style.backgroundColor='#f6f7f8'"
											onMouseOut="this.style.backgroundColor=''">
											<td align="center">${list.mw_take_no}</td>										
											<td align="center">${list.take_ymd}</td>
											<td align="center">${list.take_tm}</td>
											<td align="center">${list.user_name}</td>
											<td align="center">${list.mw_pps_getr_id}</td>
											<td align="center">${list.outvars}</td>
											<td align="center">${list.mw_afr_shtnm}</td>
										</tr>
									</c:forEach>
								</table>
								</td>
							</tr>
							<tr>
								<td height="40" align="center">
								<table border="0" cellpadding="0" cellspacing="0">
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
				<td height="40" align="right"><a href="#"><img
					src="/img/result_icon.gif" alt="결과 출력" width="74" height="22"
					border="0"></a><a href="#"><img src="/img/excel_icon.gif"
					alt="EXCEL 변환" width="94" height="22" border="0"></a></td>
			</tr>

		</table>
		</td>
	</tr>
	<tr>
		<td height="30"></td>
	</tr>
</table>

</form>
</body>

</html>

