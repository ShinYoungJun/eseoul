<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/include.jsp" %>
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

	function	Save()
	{
	//	if(page	==	"")
	//		return;
		
		var form = document.form;
		var	str		= "";
		
		//	민원등록
		if(form.EXT_REGDATE.value.length	< 1)
			str	+= "등록일자를 입력하세요\n";
		else if(form.EXT_FROMDATE.value.length	< 1)
			str	+= "점용기간을 입력하세요\n";
		else if(form.EXT_TODATE.value.length	< 1)
			str	+= "점용기간을 입력하세요\n";
		else if(form.MANAGER.value.length	< 1)
			str	+= "담당자를 입력하세요\n";
		
		if(str	!= "")
		{
			alert(str);
			return	true;
		}
		
		if(confirm("일괄처리를 재 수정할 수 없으므로, 해당조건을 다시 한번 확인하여 주시기 바랍니다. \n 일괄처리를 하시겠습니까?")){
			form.action = "giganilgwal_ext.do";			
			form.submit();
		}
		
		
	}

	function 	Init()
	{
		parent.TabDown_Img("giganilgwal");

	}
	
//]]>
</script>

<body onload="Init();">
<form id="form" name="form" method="post">
<input type="hidden" id="GIGAN1" name="GIGAN1" value="${GIGAN1}">
<input type="hidden" id="GIGAN2" name="GIGAN2" value="${GIGAN2}">
<input type="hidden" id="PURPOSE_CD" name="PURPOSE_CD" value="${PURPOSE_CD}">
<input type="hidden" id="BONBUN" name="BONBUN" value="${BONBUN}">
<input type="hidden" id="BUBUN" name="BUBUN" value="${BUBUN}">
<input type="hidden" id="NAME" name="NAME" value="${NAME}">
<input type="hidden" id="ADMIN_NO" name="ADMIN_NO" value="${ADMIN_NO}">
<input type="hidden" id="TYPE" name="TYPE" value="${TYPE}">
<input type="hidden" id="OWNER_SET" name="OWNER_SET" value="${OWNER_SET}">
<input type="hidden" id="TAX_SET" name="TAX_SET" value="${TAX_SET}">
<input type="hidden" id="BJ_CD" name="BJ_CD" value="${BJ_CD}">
<input type="hidden" id="HJ_CD" name="HJ_CD" value="${HJ_CD}">
<input type="hidden" id="SECTION" name="SECTION" value="${SECTION}">

<table width="780" border="0" cellpadding="0" cellspacing="0">
	  <tr>
		<td align="left" class="contborder_blue">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">

		<tr>
		  <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
			  
			  <tr>
				<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">담당자</td>
				<td bgcolor="eaeaea" class="table_bl_left"><input id="MANAGER" name="MANAGER" type="text" class="input_form1" style="width:120px"  value="${MANAGER}" maxlength="10"></td>
				<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">갱신일자</td>
				<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
					<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					  <tr>
						<td><input id="EXT_REGDATE" name="EXT_REGDATE" type="text" class="input_form1" style="width:70px" value="${EXT_REGDATE}" readonly></td>
						<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('EXT_REGDATE'), 'yyyymmdd')" style="CURSOR: Hand;"></a></td>					  
					  </tr>
					</table>
				</td>
			  </tr>
			  
			  <tr>
				<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">기간연장 시작</td>
				<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
				  <tr>
					<td><input id="EXT_FROMDATE" name="EXT_FROMDATE" type="text" class="input_form1" style="width:70px" value="" readonly></td>
					<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('EXT_FROMDATE'), 'yyyymmdd')" style="CURSOR: Hand;"></a></td>				  
				  </tr>
				</table></td>
				<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">기간연장 종료</td>
				<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
				  <tr>
					<td><input id="EXT_TODATE" name="EXT_TODATE" type="text" class="input_form1" style="width:70px" value="" readonly></td>
					<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('EXT_TODATE'), 'yyyymmdd')" style="CURSOR: Hand;"></a></td>				  
				  </tr>
				</table></td>
			  </tr>
			  
			  <tr>
				<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">비고</td>
				<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
				<input id=EXT_NOTES name=EXT_NOTES type="text" class="input_form1" style="width:600px" value="" maxlength="50">
				</td>
			  </tr>

		  </table></td>
		</tr>
		
		<tr>
			<td height="40" align="right">
		  		<a><img onclick="javascript:Save()" src="/img/levy_icon4.gif" alt="일괄 처리" border="0" style="cursor:hand;"></a>
			</td>
		</tr>
	</table>
	</td>
  </tr>

</table>

</body>
</html>