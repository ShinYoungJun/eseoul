<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/include.jsp"%>
<%@ include file="/jsp/common/loginCheck.jsp" %>
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
		w.action = "/admin/sysConnect.do";	
		w.submit();
	}
	
//]]>
</script>

<body>
<form name="listForm" method="post">
<table width="800" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td height="43"><img src="/img/admin_cont5_title.gif" width="800"
			height="43"></td>
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
						<td><a href="#"><img src="/img/help_icon.gif" alt="도움말"
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
								<td><img src="/img/sub_admin_title11.gif" width="110"
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
											class="sub_table_b">시스템구분</td>
										<td bgcolor="eaeaea" class="table_bl_left"><select
											name="systemSet" class="input_form1" style="width:160px">
											${systemSet}
										</select></td>
										<td width="15%" align="center" bgcolor="e5eff8"
											class="sub_table_b">갱신일자</td>
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
											class="sub_table_b">담당자명</td>
										<td bgcolor="eaeaea" class="table_bl_left"><input
											name="userName" type="text" class="input_form1"
											style="width:120px" value="${userName}"></td>
										<td align="center" bgcolor="e5eff8" class="sub_table_b">처리결과</td>
										<td bgcolor="eaeaea" class="table_bl_left"><select
											name="result" class="input_form1" style="width:120px">
											${result}
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
								<td width="100%" height="34" class="sub_stan" align="left">전체건수: <span class="sub_stan_blue">${totalCount}</span> 건</td>
							</tr>
							<tr>
								<td>
								<table width="100%" border="1" bordercolor="#c9dfed"
									style="border-collapse:collapse;" cellpadding="0"
									cellspacing="0" class="sub_table">
									<tr>
										<td height="28" align="center" bgcolor="e5eff8"
											class="sub_table_b">번호</td>
										<td align="center" bgcolor="e5eff8" class="sub_table_b">갱신일</td>
										<td align="center" bgcolor="e5eff8" class="sub_table_b">관리번호</td>
										<td align="center" bgcolor="e5eff8" class="sub_table_b">시스템</td>
										<td align="center" bgcolor="e5eff8" class="sub_table_b">담당자</td>
										<td align="center" bgcolor="e5eff8" class="sub_table_b">업무구분
										</td>
										<td align="center" bgcolor="e5eff8" class="sub_table_b">처리유형</td>
									</tr>
									<c:forEach items="${blist}" var="list" varStatus="idx">
									<tr onMouseOver="this.style.backgroundColor='#f6f7f8'"
										onMouseOut="this.style.backgroundColor=''">
										<td align="center" height="26">${idx.count}</td>
										<td align="center">${list.REG_DATE}</td>										
										<td align="center">${list.ADMIN_NO}</td>
										<td align="center">${list.SYSTEM_NM}</td>								
										<td align="center">${list.USER_ID}</td>
										<td align="center">${list.WORK_NM}</td>
										<td align="center">${list.RESULT_NM}</td>
									</tr>
									</c:forEach>
								</table>
								</td>
							</tr>
							<tr>
								<td height="40" align="center">
								<table border="0" cellpadding="0" cellspacing="0">
									<tr>
										<!-- 페이징시작 -->${strPageDivideForm}<!-- 페이징끝 -->	
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
	setSelectedOption(document.listForm.systemSet, "${systemSet}");
	setSelectedOption(document.listForm.result, "${result}");
//-->
</script></form>
</body>

</html>

