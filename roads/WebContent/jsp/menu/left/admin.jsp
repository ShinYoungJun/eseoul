<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/loginCheck.jsp" %>  	
<!--  //********** BEGIN_현진_20120229 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!--   //********** END_현진_20120229 -->

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
String org_cd = (String)session.getAttribute("org_cd");
String dept_cd = (String)session.getAttribute("dept_cd");
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />
<title>::::: 서울시 도로점용관리시스템 :::::</title>
<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
	background-image: url(../img/left_back.gif);
}
-->
</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
</head>

<script type="text/javascript">
<!--
           
	function	menuBtn_chk(o)
	{
		document.getElementById("board").className = "leftM2";
		document.getElementById("code").className = "leftM2";
		document.getElementById("connect").className = "leftM2";
		document.getElementById("record").className = "leftM2";
		document.getElementById("user").className = "leftM2";
		//********** BEGIN_현진_20120227
		document.getElementById("code2").className = "leftM2";
		//********** END_현진_20120227				
		document.getElementById(o.id).className = "leftM1";
	}
	
	function guCd_chk()
	{
		var guCd = document.form.guCd.value;

		if(guCd != '0000000')
		{
			alert("권한이 없습니다.");
			return;
		}	
		
		var w = document.form;
		top.frames[2].location = "/admin/board.do";				
	}
-->	

</script>

<body>
<form name="form">
<input type="hidden" id="guCd" name="guCd" value="<%=org_cd%>">
<table width="200" border="0" cellpadding="0"	cellspacing="0">
	<tr>
		<td align="center" valign="top">
		<table width="170" border="0" cellpadding="0" cellspacing="0">
			<tr>
				<td height="17">&nbsp;</td>
			</tr>
			<tr>
				<td height="35"><img src="/img/admin_title.gif"
					alt="관리자메뉴" width="170" height="35"></td>
			</tr>

			<tr>
				<td align="center" valign="top" bgcolor="f8f8f8" class="leftborder">
				<!--좌측 메뉴시작-->
				<table width="150" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td height="12" colspan="2"></td>
					</tr>
					<tr>
						<td width="29" height="27"><img
							src="/img/sub_menuicon.gif" width="29" height="27"></td>
						<td align="left"><a href="/admin/user/user.do" class="leftM1"
							target="cont" id="user" onclick="javascript:menuBtn_chk(this);">사용자
						관리</a></td>
					</tr>
					<tr>
						<td height="1" colspan="2" bgcolor="e0e0df"></td>
					</tr>
					<tr>
						<td height="27"><img src="/img/sub_menuicon.gif"
							width="29" height="27"></td>
						<td align="left"><a href="javascript:guCd_chk();" id="board" class="leftM2" onclick="javascript:menuBtn_chk(this);">공지사항
						관리</a></td>
					</tr>
					<tr>
						<td height="1" colspan="2" bgcolor="e0e0df"></td>
					</tr>
					<tr>
						<td width="29" height="27"><img
							src="/img/sub_menuicon.gif" width="29" height="27"></td>
						<td align="left"><a href="/admin/commCode/areaCode.do" class="leftM2"
							target="cont" id="code" onclick="javascript:menuBtn_chk(this);">공통코드관리</a>
						</td>
					</tr>
					<tr>
						<td height="1" colspan="2" bgcolor="e0e0df"></td>
					</tr>
					<!--  //********** BEGIN_현진_20120317 -->					
					<tr>
						<td width="29" height="27"><img
							src="/img/sub_menuicon.gif" width="29" height="27"></td>
						<td align="left"><a href="/admin/section/list.do" class="leftM2"
							target="cont" id="code2" onclick="javascript:menuBtn_chk(this);">거리가게 적치물 관리  </a>
						</td>
					</tr>
					<tr>
						<td height="1" colspan="2" bgcolor="e0e0df"></td>
					</tr>														
					
					<!--   //********** END_현진_20120317 -->
					<!--  //********** BEGIN_현진_20120308 -->
					<tr>
						<td width="29" height="27"><img
							src="/img/sub_menuicon.gif" width="29" height="27"></td>
						<td align="left"><a href="/jumyong/junggi/semokListTest.do" class="leftM2"
							target="cont">세목코드조회(테스트)  </a>
						</td>
					</tr>
					<tr>
						<td height="1" colspan="2" bgcolor="e0e0df"></td>
					</tr>										
					
					<!--   //********** END_현진_20120308 -->
					
					<tr>
						<td height="27"><img src="/img/sub_menuicon.gif"
							width="29" height="27"></td>
						<td align="left"><a href="/admin/sysHistory.do" class="leftM2"
							target="cont" id="record" onclick="javascript:menuBtn_chk(this);">시스템
						이력조회</a></td>
					</tr>
					<tr>
						<td height="1" colspan="2" bgcolor="e0e0df"></td>
					</tr>
					<tr>
						<td height="27"><img src="/img/sub_menuicon.gif"
							width="29" height="27"></td>
						<td align="left"><a href="/admin/sysConnect.do" class="leftM2"
							target="cont" id="connect"
							onclick="javascript:menuBtn_chk(this);">시스템 연계조회</a></td>
					</tr>
					<tr>
						<td height="12" colspan="2"></td>
					</tr>
					
					
					
				</table>
				<!--좌측 메뉴시작--></td>
			</tr>
		</table>
		</td>
	</tr>
	<tr>
		<td height="15px"></td>
	</tr>
	<tr>
		<td height="154" align="center" ><!--좌측하단 배너-->
		<table border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td><a href="#"><img src="/img/left_banner1.gif"
					alt="서울시세외수입 종합징수시스템" width="176" height="58" border="0"></a></td>
			</tr>
			<tr>
				<td><a href="#"><img src="/img/left_banner2.gif"
					alt="실시간민원통보시스템" width="176" height="47" border="0"></a></td>
			</tr>
			<tr>
				<td><a href="#"><img src="/img/left_banner3.gif"
					alt="새올민원행정시스템" width="176" height="52" border="0"></a></td>
			</tr>
		</table>
		<!--좌측하단 배너 끝--></td>
	</tr>
	<tr>
		<td height="60" align="center"><!--관련사이트--> <select
			name="select2" class="related" style="width:170px; background:f1f2f2">
			<option selected>관련사이트</option>
		</select></td>
		<!--관련사이트 끝-->
	</tr>
</table>
</form>
</body>
</html>

