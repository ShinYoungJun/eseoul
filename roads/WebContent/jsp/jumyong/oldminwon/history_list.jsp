<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
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
</head>

<script language="javascript" src="/js/Check_inputbox.js"></script>
<script language="javascript" src="/js/Ajax_request.js"></script>


<body>
<form id="form" name="form" method="post">

<table width="800" border="0" cellpadding="0" cellspacing="0">

    <tr>
        <td height="22" background="/img/tab_line_purple.gif">
        <table border="0" cellspacing="0" cellpadding="0">
            <tr>
              <td width="111"><img id="history_img" name="history_img" src="/img/oldMinwon_history.gif" alt="이력정보" width="110" height="22" border="0"></td>
            </tr>
        </table>
        </td>
	</tr>
     <tr>
		<td align="left" class="contborder_purple">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>
			<td>

			<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
      	      <tr>
                <td height="34" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">근        거</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">사        유</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b" width="110" nowrap="nowrap">담당자 주민번호</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b" width="80" nowrap="nowrap">입력일</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b" width="80" nowrap="nowrap">갱신일</td>
              </tr>
            <c:choose>
			  	<c:when test='${blist != null && !empty blist}'>
			<c:forEach items="${blist}" var="board" varStatus="idx">
			<tr>
	    		<td height="26" align="center">${board.GUNGE}</td>
	            <td align="center">${board.SAYU}</td>
	            <c:if test="${board.JUMIN1 != null}">
	            	<td align="center">${board.JUMIN1}-*******</td>
	            </c:if>
	            <c:if test="${board.JUMIN1 == null}">
	            	<td align="center"> - </td>
	            </c:if>
	            <td align="center">${board.WRITEDATE}</td>
	            <td align="center">${board.UP_DATE}</td>
	         </tr>
			</c:forEach>
				</c:when>
				<c:otherwise>
					<tr>
						<td align="center" class="sub_table" colspan="5" height="85">이력정보가 없습니다.</td>
					</tr>
				</c:otherwise>
			</c:choose>
            </table>
                        </td>
                  </tr>
                </table>
                </td>
     </tr>
    <tr>
        <td height="14"></td>
	</tr>
</table>
</form>




</body>
</html>