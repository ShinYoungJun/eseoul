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
	
	sData.document.location.href ="/gapan/junggi/junggi_product.do?ADMIN_NO="+"${ADMIN_NO}"+"&mode=add&SEQ="+seq;
	
//	location.href("/gapan/junggi/junggi_product.do?ADMIN_NO="+adminNo+"&SEQ="+seq+"&currentPage="+currentPage+"&year="+year+"&mode=add");
	
	window.close();
}	



	-->
</script>

</head>

<body border="0">
<form name="productForm" id="productForm" method="post" action = "/gapan/jumyong/productInsert.do" >	
<table width="100%" border="1">
<tr>
<td align="center">
	<table  border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td class="contborder_purple">
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
					<td>
						<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
							<tr>
								<td width="55" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">기준년도</td>
								<td width="40" align="center" bgcolor="e5eff8" class="sub_table_b">원면적</td>
								<td width="40" align="center" bgcolor="e5eff8" class="sub_table_b">년도</td>
								<td width="40" align="center" bgcolor="e5eff8" class="sub_table_b">점용료</td>
								<td width="40" align="center" bgcolor="e5eff8" class="sub_table_b">구분</td>
								<td width="40" align="center" bgcolor="e5eff8" class="sub_table_b">계산</td>								
							</tr>
							<c:forEach items="${productList}" var="board" varStatus="idx">
							<tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" 
							<c:if test="${board.CAL_YN == 'N' }"> onclick="javascript:gosub('${board.SEQ}');"  </c:if>
							<c:if test="${board.CAL_YN == 'Y' }"> onclick="javascript:alert('이미 계산하였습니다.');"  </c:if>							
							
							style="cursor:pointer" >
								<td height="26" align="center">${board.YEAR}</td>
								<td align="center">${board.AREA_AFTER}</td>
								<td align="center">${board.CAL_YEAR}</td>
								<td align="center">${board.SUM_ADJUST}</td>
								<td align="center">${board.USE_SECTIONNAME}</td>
								<td align="center">${board.CAL_YN}</td>								
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

