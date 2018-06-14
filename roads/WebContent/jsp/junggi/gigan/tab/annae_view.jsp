<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/include.jsp" %>
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
          
	function 	Init()
	{
		parent.TabDown_Img("annae");

		var	adminno	= document.getElementById("ADMIN_NO").value;
		var	seq		= document.getElementById("SEQ").value;

	//	alert(adminno + " , " + seq);
	
	//	if(seq != "")
	//		View(adminno, seq);
	}

	function submitPrint()
	{
		var form 	= document.forms[0];
		var	str		= "";
		
		//	민원등록
		if(form.YEAR.value.length	< 1)
			str	+= "통보년월를 입력하세요\n";
		else if(form.MONTH.value.length	< 1)
			str	+= "통보년월를 입력하세요\n";
		else if(form.FROMDATE.value.length	< 1)
			str	+= "기간연장 시작일을 입력하세요\n";
		else if(form.TODATE.value.length	< 1)
			str	+= "기간연장 종료일을 입력하세요\n";		
		else if(form.MANAGER.value.length	< 1)
			str	+= "담당자를 입력하세요\n";
		else if(form.TEL.value.length	< 1)
			str	+= "연락처를 입력하세요\n";
		else if(form.ENDDATE.value.length	< 1)
			str	+= "만료일자를 입력하세요\n";
		else if(form.DEPT.value.length	< 1)
			str	+= "신청장소를 입력하세요\n";
	//	else if(form.NOTES.value.length	< 1)
	//		str	+= "비고를 입력하세요\n";
				
		if(str	!= "")
		{
			alert(str);
			return	true;
		}
		
		var target 	= window.open;
		form.target = target;
		form.action = 'annae_all_print.do';
		form.submit();
	}
	
//]]>
</script>

<body onload="Init();">
<table width="780" border="0" cellpadding="0" cellspacing="0">
<form name="form" method="post">
<input type="hidden" name="ADMIN_NO" value="${ADMIN_NO}">
<input type="hidden" name="SEQ" value="${SEQ}">

<input type="hidden" name="GIGAN1" value="${GIGAN1}">
<input type="hidden" name="GIGAN2" value="${GIGAN2}">
<input type="hidden" name="PURPOSE_CD" value="${PURPOSE_CD}">
<input type="hidden" name="BONBUN" value="${BONBUN}">
<input type="hidden" name="BUBUN" value="${BUBUN}">
<input type="hidden" name="NAME" value="${NAME}">
<input type="hidden" name="ADMINNO" value="${ADMINNO}">
<input type="hidden" name="TYPE" value="${TYPE}">
<input type="hidden" name="OWNER_SET" value="${OWNER_SET}">
<input type="hidden" name="TAX_SET" value="${TAX_SET}">
<input type="hidden" name="BJ_CD" value="${BJ_CD}">
<input type="hidden" name="HJ_CD" value="${HJ_CD}">

<input type="hidden" name="currentPage" value="${currentPage}">

	  <tr>
		<td align="left" class="contborder_blue">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">

		<tr>
		  <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">

			  <tr>
				<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">통보 년월</td>
				<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
				<input name="YEAR" type="text" class="input_form1" style="width:70px" value=""> 년
				<input name="MONTH" type="text" class="input_form1" style="width:70px" value=""> 월
				</td>
			  </tr>
			  
			  <tr>
				<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">기간연장 시작</td>
				<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
				  <tr>
					<td><input name="FROMDATE" type="text" class="input_form1" style="width:70px" value="" readonly></td>
					<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('FROMDATE'), 'yyyymmdd')" style="CURSOR: Hand;"></a></td>				  
				  </tr>
				</table></td>
				<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">기간연장 종료</td>
				<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
				  <tr>
					<td><input name="TODATE" type="text" class="input_form1" style="width:70px" value="" readonly></td>
					<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('TODATE'), 'yyyymmdd')" style="CURSOR: Hand;"></a></td>				  
				  </tr>
				</table></td>
			  </tr>
			  			  
			  <tr>
				<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">담당자</td>
				<td bgcolor="eaeaea" class="table_bl_left"><input name="MANAGER" type="text" class="input_form1" style="width:120px"  value="${MANAGER}"></td>
				<td align="center" bgcolor="e5eff8" class="sub_table_b">연락처</td>
				<td bgcolor="eaeaea" class="table_bl_left"><input name="TEL" type="text" class="input_form1" style="width:120px" value="${TEL}"></td>
			  </tr>
			  
			  <tr>
				<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">만료 일자</td>
					<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					  <tr>
						<td><input name="ENDDATE" type="text" class="input_form1" style="width:70px" value="" readonly></td>
						<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('ENDDATE'), 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
					<!-- <td>&nbsp~ <input name="PREDATE" type="text" class="input_form1" style="width:70px" value="" readonly></td>
						<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('PREDATE'), 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
						 -->						  
					  </tr>
					</table></td>
				  
				<td align="center" bgcolor="e5eff8" class="sub_table_b">신청 장소</td>
				<td bgcolor="eaeaea" class="table_bl_left"><input name="DEPT" type="text" class="input_form1" style="width:120px" value="${GU_NM} ${DEPT_NM}"></td>
			  </tr>
			  
			  <tr>
				<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">비고</td>
				<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
				<input name="NOTES" type="text" class="input_form1" style="width:600px" value="">
				</td>
			  </tr>

		  </table></td>
		</tr>
		
		<tr>
			<td height="40">
			<table width="0" border="0" cellspacing="0" cellpadding="0" align="right">	
		  		<a><img src="/img/print_icon.gif" onclick="submitPrint();" alt="안내문 출력" border="0"></a>
			</table>
			</td>
		</tr>
		
	</table></td>
  </tr>

</table>

</body>
</html>