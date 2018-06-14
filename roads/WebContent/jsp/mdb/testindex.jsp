<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>

<%@ include file="/jsp/common/include.jsp" %>


<form name="dd" action="/mdb/test.do" method="post" enctype="multipart/form-data">
파일 경로 : <input type="file" name="mdbFile" size="30">
<input type="submit" value="파일등록">
</form>


