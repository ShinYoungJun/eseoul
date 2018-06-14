<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
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
html {overflow-x : hidden;}

.popdiv{
	width: 98%; height: 300px;
	padding: 4px; margin-bottom: 20px;
	overflow-y: scroll; border: 1px solid black;
	font-size: 1.26em; line-height: 17px;
}
-->
</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
</head>

<script language="javascript" src="/js/common.js"></script>
<script type="text/javascript"><!--
//<![CDATA[
	
var today = "${today}";
var notice_todate = "${notice_todate}";

if(today >= notice_todate){
	window.close();
}
	function notice_setCookie( name, value, expiredays ) 
    { 
        var todayDate = new Date(); 
        todayDate.setDate( todayDate.getDate() + expiredays ); 
        document.cookie = name + "=" + escape( value ) 
                  + "; path=/; expires=" + todayDate.toGMTString() + ";" ;
    }
    function closeme()
    { 
        if ( document.getElementById("check1").checked ) 
              notice_setCookie( "Notice", "done" , 1);// 1=하루동안 공지 창을 열지 않음 
        self.close(); 
    } 

//]]>
--></script>

<body >
<form name="listForm" id="listForm" method="post" >
<input name="listSize" id="listSize" value="${listSize}" type="hidden">
<input name="menuCode" id="menuCode" type="hidden">
<input name="chk" id="chk" type="hidden">
<input name="modeType" type="hidden" value="updateAuthority"> 
<input name="result" type="hidden" value="${result}"> 

<table width="100%" border="0" cellspacing="0" cellpadding="0">
	<c:forEach items="${noticeList}" var="noticeList" varStatus="idx">
	<tr>
		<td width="520" height="104"><img src="/img/n_pop1.gif" width="520" height="104"></td>
	  <td background="/img/n_pop2.gif">&nbsp;</td>
		<td width="10"><img src="/img/n_pop3.gif" width="10" height="104"></td>
	</tr>
	<tr>
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			
			<table align=center width="90%" cellpadding="0" cellspacing="0"
				style="border-collapse:collapse;" class="sub_table">
				
				
				<tr>
					<td colspan="10" align="left" valign="top" class="text_box">
					<font style="font-family:TTche;font-size:13pt;" color="black"><b>${noticeList.TITLE}</b></font>
					</td>
				</tr>
				<tr>
					<td colspan="10" align="left" valign="top" class="text_box">
						<textarea name="CONTENT" class="text_box" style="width:97%;height:240px" readonly="">${noticeList.CONTENT}</textarea>					
						<!-- <div name="CONTENT" class="text_box popdiv" style="font-size:10pt;">
						<font style="font-family:TTche;font-size:10pt;" color="black"><b>** 건축물 요율 변경 안내<br></font>
						건축물의 요율이 다음과 같이 변경되었습니다.<br><br>
						[변경 전]<br>
						 <img alt="" src="/img/noticePopup/building_before.png"><br><br>
						[변경 후]<br>
						<img alt="" src="/img/noticePopup/building_after.png">
 						</div> -->
					</td>
				</tr>
				</c:forEach>
				<tr>
					<td class="table_bl_left">
					<input type="checkbox" id="check1" name="check1" value="checkbox" ><font style="font-family:TTche;font-size:10pt">오늘은 이창 띄우지 않기</font></td>
					<td class="table_bl_left" align="right"><input type="button" value="닫기" onClick="closeme()">&nbsp;</td>
				</tr>
			</table>	
		</table>	
	</table>
</form>

</body>
</html>

