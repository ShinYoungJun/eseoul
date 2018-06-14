<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/loginCheck.jsp" %>
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
	background-image: url(/img/left_back.gif);
}
-->
</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
<script language="javascript" src="/js/PopupCalendar.js"></script> 
<script>
<!--	
function gosub(seq)
{
	var sData = dialogArguments;
	
	sData.document.location.href ="/jumyong/junggi/junggi_product.do?ADMIN_NO="+"${ADMIN_NO}"+"&mode=add&SEQ="+seq;
	

	
	
	window.close();
	

}	
	-->
</script>

</head>

<body border="0">
<form name="productForm" id="productForm" method="post" action = "/jumyong/productInsert.do" >	
<input value="${area}" type="text">
<table width="100%" border="1">
<tr>
<td align="center">
	<table width="200" border="0" cellspacing="0" cellpadding="0">
        <tr>

          <td class="contborder_purple">							            
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
					<td>
						<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
							<tr>
								<td width="120" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">기준년도</td>
								<td width="80" align="center" bgcolor="e5eff8" class="sub_table_b">면적</td>
								
							</tr>
							<c:forEach items="${productList}" var="board" varStatus="idx">
							<tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" 
							onclick="javascript:gosub('${board.SEQ}');" style="cursor:pointer" >
								<td height="26" align="center">${board.YEAR}</td>
								<td align="center">${board.AREA_AFTER}</td>
				                </tr> 
							</c:forEach>
				          </table>
						</td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
	</td></tr></table>
</form>
</body>
</html>

