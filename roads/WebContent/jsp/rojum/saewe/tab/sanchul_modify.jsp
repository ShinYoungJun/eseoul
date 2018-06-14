<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
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
}
-->

</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
</head>

<script language="javascript" src="/js/PopupCalendar.js"></script> 

<script type="text/javascript">
//<![CDATA[

	function	ModifyPrc()
	{
		var form = document.form;

		form.action = "/gapan/minwon/minwon_modify_prc.do";
		form.submit();
	}

	function	Cancel()
	{
		var form = document.form;

		form.action = "/gapan/minwon/minwon_view.do";
		form.submit();
	}

	function 	Init()
	{
		parent.TabUp_Img("sanchul");
	}

//]]>
</script>

<body onload="Init();">
<table width="780" border="0" cellpadding="0" cellspacing="0">
<form name="form" method="post">
<input type="hidden" name="ADMIN_NO" value="${ADMIN_NO}">

	  <tr>
		<td align="left" class="contborder_blue">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
			  <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">

				  <tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">접수번호</td>
					<td width="181" bgcolor="eaeaea" class="table_bl_left"><input name="REQ_NO" type="text" class="input_form1" style="width:120px" value="${board.ADMIN_NO}"></td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">민원구분</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="SECTION" type="text" class="input_form1" style="width:120px" value="${board.SECTION}"></td>
				  </tr>
				  
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">접수일자</td>
					<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					  <tr>
						<td><input name="REQ_DATE" type="text" class="input_form1" style="width:120px" value="${board.REQ_DATE}"></td>
						<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('REQ_DATE'), 'yyyymmdd')"></a></td>
						</tr>
					</table></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">처리예정일자</td>
					<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					  <tr>
						<td><input name="PREDATE" type="text" class="input_form1" style="width:120px" value="${board.PREDATE}"></td>
						<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('PREDATE'), 'yyyymmdd')"></a></td>
					  </tr>
					</table></td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">접수부서</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="REQ_DEP" type="text" class="input_form1" style="width:120px"  value="${board.REQ_DEP}"></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">담당부서</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="MANAGE_DEP" type="text" class="input_form1" style="width:120px" value="${board.MANAGE_DEP}"></td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">접수자명</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="REQ_NM" type="text" class="input_form1" style="width:120px" value="${board.REQ_NM}"></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">담당자명</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="MANAGER" type="text" class="input_form1" style="width:120px" value="${board.MANAGER}"></td>
				  </tr>
				  <tr>
					<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">민원요지</td>
					<td colspan="3" bgcolor="eaeaea" class="table_bl_left"><input name="NOTES" type="text" class="input_form1" style="width:600px" value="${board.NOTES}"></td>
					</tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">신청인</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="AGENT_NM" type="text" class="input_form1" style="width:120px" value="${board.AGENT_NM}"></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">신청인 연락처</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="AGENT_TEL" type="text" class="input_form1" style="width:120px" value="${board.AGENT_TEL}"></td>
				  </tr>
				  
			  </table></td>
			</tr>

			<tr>
				<td height="40">
				<table width="0" border="0" cellspacing="0" cellpadding="0" align="right">
			  		<a href="javascript:Cancel()"><img src="/img/can_icon.gif" alt="취소" width="56" height="18" border="0"></a>	
			  		<a href="javascript:ModifyPrc()"><img src="/img/save_icon2.gif" alt="저장" width="56" height="18" border="0"></a>
				</table>
				</td>
			</tr>
			
		</table></td>
	  </tr>

</table>

</body>
</html>