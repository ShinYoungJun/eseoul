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
	
	function InitPage()
	{
		if(document.getElementById("mode").value == "edit" )
		{
			document.getElementById("view").style.display = "none";
			document.getElementById("edit").style.display= "block";			
		}else
		{
			document.getElementById("edit").style.display = "none";
			document.getElementById("view").style.display = "block";
		}
	}
	
	function goModify()
	{
		var admin_no = document.getElementById("ADMIN_NO").value;
		location.href = "/jumyong/jumyong/minwon.do?ADMIN_NO="+admin_no
		+"&mode=edit";
	}
	
	
	function submitClick()
	{
		var minwonForm = document.form;
		minwonForm.submit();
	}
	
	
	

//]]>
</script>

<body onload="javascript:InitPage();">

<form name="form" id="form" method="post" action = "/jumyong/jumyong/minwon.do" >
<input type="hidden" id="ADMIN_NO" name="ADMIN_NO" value="${ADMIN_NO}">
<input name="mode"  id = "mode" value="${mode}" type="hidden" >

<div id="view" >
	<table width="780" border="0" cellpadding="0" cellspacing="0">
	  <tr>
		<td align="left" class="contborder_blue">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
			  <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
				  <tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">접수번호</td>
					<td width="181" bgcolor="eaeaea" class="table_bl_left"><input name="ADMIN_NO" type="text" class="input_form1" style="width:120px" value="${appeal.ADMIN_NO}" readonly></td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">민원구분</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="GUBUN_VIEW" type="text" class="input_form1" style="width:120px" value="${appeal.GUBUN}" readonly></td>
				  </tr>
				  
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">접수일자</td>
					<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					  <tr>
						<td><input name="REQ_DATE_VIEW" type="text" class="input_form1" style="width:120px" value="${appeal.REQ_DATE}" readonly></td>
				   	  </tr>
					</table></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">처리예정일자</td>
					<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					  <tr>
						<td><input name="PREDATE_VIEW" type="text" class="input_form1" style="width:120px" value="${appeal.PREDATE}" readonly></td>
					  </tr>
					</table></td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">접수부서</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="REQ_DEP_VIEW" type="text" class="input_form1" style="width:120px"  value="${appeal.REQ_DEP}" readonly></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">담당부서</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="MANAGE_DEP_VIEW" type="text" class="input_form1" style="width:120px" value="${appeal.MANAGE_DEP}" readonly></td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">접수자명</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="REQ_NM_VIEW" type="text" class="input_form1" style="width:120px" value="${appeal.REQ_NM}" readonly></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">담당자명</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="MANAGER_VIEW" type="text" class="input_form1" style="width:120px" value="${appeal.MANAGER}" readonly></td>
				  </tr>
				  <tr>
					<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">민원요지</td>
					<td colspan="3" bgcolor="eaeaea" class="table_bl_left"><input name="NOTES_VIEW" type="text" class="input_form1" style="width:600px" value="${appeal.NOTES}" readonly></td>
					</tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">신청인</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="AGENT_NM_VIEW" type="text" class="input_form1" style="width:120px" value="${appeal.AGENT_NM}" readonly></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">신청인 연락처</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="AGENT_TEL_VIEW" type="text" class="input_form1" style="width:120px" value="${appeal.AGENT_TEL}" readonly></td>
				  </tr>
				  
			  </table></td>
			</tr>
			<tr>  	
	
	 
			
			  <td height="40" align="right">
			  <table width="0" border="0" cellspacing="0" cellpadding="0" align="right">
				<span onclick="parent.iFrameResize(parent.document.getElementById('tabUp1'));" class="sub_table" style="cursor:pointer">해지 등록</span>			  
				<img src="/img/mod_icon.gif" alt="수정" border="0" onclick="javascript:goModify()" style="cursor:pointer" >								

			  </table>
			  </td>
			</tr>
			
		</table></td>
	  </tr>

</table>
</div>
<div id="edit" style="width:100%;display:none;">
	<table width="780" border="0" cellpadding="0" cellspacing="0">
	  <tr>
		<td align="left" class="contborder_blue">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
			  <td>

            <table width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
				  <tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">접수번호</td>
					<td width="37%" bgcolor="eaeaea" class="table_bl_left">
					<spring:bind path="appeal.REQ_NO">
							<input name="REQ_NO" type="text" class="input_form1" style="width:120px" readonly value="${appeal.ADMIN_NO}">
					</spring:bind>
					</td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">민원구분</td>
					<td bgcolor="eaeaea" class="table_bl_left">
					<spring:bind path="appeal.GUBUN">
						<input name="GUBUN" type="text" class="input_form1" style="width:120px"  value="${appeal.GUBUN}">
					</spring:bind>
					</td>
				  </tr>
				  
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">접수일자</td>
					<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					  <tr>
						<td>
						<spring:bind path="appeal.REQ_DATE">
							<input name="REQ_DATE" type="text" class="input_form1" style="width:120px" readonly  value="${appeal.REQ_DATE}" >
						</spring:bind>
						</td>
						<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('REQ_DATE'), 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
					  </tr>
					</table></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">처리예정일자</td>
					<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					  <tr>
						<td>
						<spring:bind paht="appeal.PREDATE">
							<input name="PREDATE" type="text" class="input_form1" style="width:120px" readonly value="${appeal.PREDATE}">
						</spring:bind>	
						</td>
						<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('PREDATE'), 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
					  </tr>
					</table></td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">접수부서</td>
					<td bgcolor="eaeaea" class="table_bl_left">
					<spring:bind paht="appeal.REQ_DEP">
						<input name="REQ_DEP" type="text" class="input_form1" style="width:120px"  value="${appeal.REQ_DEP}" readonly>
					</spring:bind>
					</td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">담당부서</td>
					<td bgcolor="eaeaea" class="table_bl_left">
					<spring:bind paht="appeal.MANAGE_DEP">
					<input name="MANAGE_DEP" type="text" class="input_form1" style="width:120px" value="${appeal.MANAGE_DEP}" >
					</spring:bind>
					</td>
				  </tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">접수자명</td>
					<td bgcolor="eaeaea" class="table_bl_left">
					<spring:bind paht="appeal.REQ_NM">
					<input name="REQ_NM" type="text" class="input_form1" style="width:120px" value="${appeal.REQ_NM}">
					</spring:bind>
					</td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">담당자명</td>
					<td bgcolor="eaeaea" class="table_bl_left">
					<spring:bind paht="appeal.MANAGER">
					<input name="MANAGER" type="text" class="input_form1" style="width:120px" value="${appeal.MANAGER}">
					</spring:bind>
					</td>
				  </tr>
				  <tr>
					<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">민원요지</td>
					<td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table width="100%" border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					<spring:bind paht="appeal.NOTES">
						<input name="NOTES" type="text" class="input_form1" style="width:98%" value="${appeal.NOTES}">
					</spring:bind>
					</table></td>
					</tr>
				  <tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">신청인</td>
					<td bgcolor="eaeaea" class="table_bl_left">
					<spring:bind paht="appeal.AGENT_NM">
					<input name="AGENT_NM" type="text" class="input_form1" style="width:120px" value="${appeal.AGENT_NM}">
					</spring:bind>
					</td>
			  <td height="40" align="right">
			  <table width="0" border="0" cellspacing="0" cellpadding="0" align="right">
				<span onclick="parent.iFrameResize(parent.document.getElementById('tabUp1'));" class="sub_table" style="cursor:pointer">해지 등록</span>			  
				<img src="/img/mod_icon.gif" alt="수정" border="0" onclick="javascript:goModify()" style="cursor:pointer" >								

			  </table>
			  </td>
			</tr>
					
					
					
					
					
					
					
					
					
					
					
					
					
					<td align="center" bgcolor="e5eff8" class="sub_table_b">신청인 연락처</td>
					<td bgcolor="eaeaea" class="table_bl_left">
					<spring:bind paht="appeal.AGENT_TEL">
						<input name="AGENT_TEL" type="text" class="input_form1" style="width:120px" value="${appeal.AGENT_TEL}" >
					</spring:bind>
					</td>
				  </tr>
                  </table></td>
                </tr>
   
            </table>
				</td>
			</tr>

			<tr>
			  <td height="40" align="right">
			  <table width="0" border="0" cellspacing="0" cellpadding="0" align="right">
				<img src="/img/can_icon.gif" alt="취소" border="0" onclick="javascript:history.back();" style="cursor:pointer" >
				<img src="/img/save_icon2.gif" alt="저장" width="56" height="18" border="0"
						                onClick="javascript:submitClick();"  style="cursor:pointer">
			  </table>
			  </td>
			</tr>
			
		</table></td>
	  </tr>

</table>
</div>
</form>
</body>
</html>

<div id='popCal' style='POSITION:absolute;visibility:hidden;border:2px ridge;width:10'>
       <iframe name="popFrame" src="/js/calendar.html" frameborder="0" scrolling="no" width=183 height=188></iframe>
</div>
