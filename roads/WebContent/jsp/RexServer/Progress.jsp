<%@ 
		page contentType="text/html;charset=euc-kr"
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
	<title>Rexpert Wait</title>
	<script language="javaScript">

	var goInterval;
	var giCnt = 0;

	function fnPreView() {
		giCnt++;
		txtCount.value = giCnt;
		//window.focus();
	}
	
	function OnLoad() {
		goInterval = window.setInterval("fnPreView()", 500);
	}
	</script>

<script LANGUAGE="JavaScript" FOR="window" EVENT="onblur">
	//window.setActive();
	window.focus();

</script>

</head>

<body topmargin="0" leftmargin="0" onload="//OnLoad();">
	<table width="100%" height="100%" border="0" align="center" cellpadding="3" cellspacing="2" bgcolor="7EC2EF" 
		style="FONT-SIZE: 9pt; COLOR: #666666; LINE-HEIGHT: 18px; FONT-FAMILY: 돋움, Arial">
	  <tr>
	    <td bgcolor="#FFFFFF" align="center">
	    <br>
	    <img src="Progress.gif" border="0">
                  <br>
	    작업중입니다.<br>
	    잠시만 기다려 주세요..
                  <br>
                  <br>
	    </td>
	  </tr>
	</table>
</body>
</html> 