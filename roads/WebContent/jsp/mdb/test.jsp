<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>

<%@ include file="/jsp/common/include.jsp" %>

<c:forEach items="${list}" var="board" >
	${board.GAPAN_NO} <BR>
	${board.GP_TYP }<BR>
	${board.MODIFY_YN }<BR>

	-----------------<br>
</c:forEach>



<!--
---------------------------------------¿øº»<br>

<c:forEach items="${list2}" var="board2" >
	${board2.GAPAN_NO} <BR>
</c:forEach>

-->