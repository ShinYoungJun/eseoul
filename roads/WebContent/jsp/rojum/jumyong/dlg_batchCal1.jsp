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
<script language="javascript" src="/js/PopupCalendar.js"></script>
<script>
<!--	

function setYear()
{
    now = new Date();
    Y = now.getFullYear();

    var strYear = "${YearVal}";

    for(var i = 0 ; i < 10 ; i++){
        newItem = new Option(i);
        document.getElementById("YEAR").options[i]  = newItem;
        document.getElementById("YEAR").options[i].text = Y+2-i;
        document.getElementById("YEAR").options[i].value = Y+2-i;
        if(strYear == Y-i) document.getElementById("YEAR").options[i].selected = true;
    }

    document.getElementById("YEAR").options.value = strYear;
}


function close2()
{
	var giga = document.getElementById("giga").value;
	opener.document.getElementById("price").value=giga;
	self.close();
}
	-->
</script>

</head>

<body border="0">
<input id="server_seq" type="hidden">
<table width="100%" border="1">
	<tr>
		<td align="center">
		<table border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td class="contborder_purple">
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td>
						<select name="YEAR" id="YEAR" class="input_form1" style="width:60px">
						</select>
						
						
						
						
						
						</td>
					</tr>
				</table>
				</td>
			</tr>
		</table>
		</td>
	</tr>
</table>
</body>
</html>