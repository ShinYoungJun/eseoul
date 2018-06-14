<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />
<title>:::::  :::::</title>
<link href="/css/Mroads.css" rel="stylesheet" type="text/css">
<style type="text/css">
<!--
body {
	margin: 0px;
}
-->
</style>

<script>
function spop_view(ADMIN_NO,x,y){
		
		//var form = document.form;
		
		top.map.setLocation(x,y,0.5,ADMIN_NO);

}
</script>
</head>
<body  style="background-color:transparent;overflow-x:hidden;">
<form name="form" method="post">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
				   	<td colspan="2" height="5" align="center" class="sub_table" >
						<br><b><div id="search" name="search" style="display:block;"></div></b>
					</td>
				</tr>
				<tr id="result_show" style="display:block">
					<td>
						<table width="216" border="0" cellspacing="0" cellpadding="0">
						<c:choose>
						<c:when test="${search != null && !empty search}">
									<tr>
										<td height="25" align="right" class="Map_stan">검색결과 (총 <span class="sub_stan_blue">${listCount}</span>건) </td>
									</tr>
									<tr>
										<td>
											<table width="216" border="0" cellpadding="0" cellspacing="0" class="Map_stan">
												<tr>
													<td height="1" colspan="5" bgcolor="a3d1ec"></td>
												</tr>
												<tr>
													<td width="51" height="28" align="center" bgcolor="deedf6" class="sub_stan_blue">점용인</td>
													<td width="1" bgcolor="deedf6"><img src="/img/mapImg/result_blue.gif" width="1" height="20"></td>
													<td width="45" align="center" bgcolor="deedf6" class="sub_stan_blue">지목</td>
													<td width="1" bgcolor="deedf6"><img src="/img/mapImg/result_blue.gif" width="1" height="20"></td>
													<td width="118" align="center" bgcolor="deedf6" class="sub_stan_blue">점용지번</td>
												</tr>
												<tr>
													<td colspan="5" bgcolor="a3d1ec"></td>
												</tr>
												<c:forEach items="${search}" var="searchlist" varStatus="idx">
												<tr>
													<td height="23" align="center">
														<c:if test="${searchlist.LOCATE_X != null || searchlist.LOCATE_X != null}">
														 <a href="javascript:spop_view('${searchlist.ADMIN_NO}','${searchlist.LOCATE_X}','${searchlist.LOCATE_Y}');" class="inqu"></c:if>
														 	${searchlist.NAME}
														 <c:if test="${searchlist.LOCATE_X != null || searchlist.LOCATE_X != null}"></a></c:if></td>
													<td><img src="/img/mapImg/result_gray.gif" width="1" height="15"></td>
													<td align="center">
														<c:if test="${searchlist.LOCATE_X != null || searchlist.LOCATE_X != null}">
														 <a href="javascript:spop_view('${searchlist.ADMIN_NO}','${searchlist.LOCATE_X}','${searchlist.LOCATE_Y}');" class="inqu"></c:if>
														 	${type_name}</a>
														<c:if test="${searchlist.LOCATE_X != null || searchlist.LOCATE_X != null}"></a></c:if></td>
													<td><img src="/img/mapImg/result_gray.gif" width="1" height="15"></td>
													<td align="center">
														<c:if test="${searchlist.LOCATE_X != null || searchlist.LOCATE_X != null}">
														 <a href="javascript:spop_view('${searchlist.ADMIN_NO}','${searchlist.LOCATE_X}','${searchlist.LOCATE_Y}');" class="inqu"></c:if>
														 	${bj_nm} ${searchlist.ADDR2}
														<c:if test="${searchlist.LOCATE_X != null || searchlist.LOCATE_X != null}"></a></c:if></td>
												</tr>
												<tr>
													<td height="1" colspan="5" bgcolor="dbdbdb"></td>
												</tr>
												</c:forEach>
											</table></td>
										</tr>
										<tr>
											<td height="40" align="center">
												<table border="0" cellspacing="0" cellpadding="0">
													<tr>
														
		
														<td align="center">${strPageDivideForm}</td>
												
													</tr>
												</table></td>
										</tr>
										<tr>
											<td>&nbsp;</td>
										</tr>
								</table>
						</c:when>					
						<c:when test="${listCount == null}">
							<script>
						    	document.getElementById("search").innerHTML = "검색하세요.";
							</script>
						</c:when>
						<c:otherwise>
						<tr>
							<td align="center" class="sub_table" height="26"><br><b>검색된 내용이 없습니다</b></td>
						</tr>
						</c:otherwise>
						</c:choose>
						</table>
						</td>
						</tr>
						
				<tr>
					<td height="10"></td>
				</tr>
			</table>
</form>
</body>
</html>
