<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%
String year = request.getParameter("year");
String type = request.getParameter("type");
String tax_set = request.getParameter("tax_set");
String tax_yn = request.getParameter("tax_yn");
String purpose = request.getParameter("purpose_cd");
String bj_cd = request.getParameter("bj_cd");
String hj_cd = request.getParameter("hj_cd");
String jumyongName = request.getParameter("jumyongName");	
String SECTION = request.getParameter("SECTION");
%>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<script>
function aa(){
	//document.location.href="/jumyong/junggi/search.do";
	var param = 'year=<%=year%>&SECTION=<%=SECTION%>&type=<%=type%>&tax_set=<%=tax_set%>&tax_yn=<%=tax_yn%>'
		      + '&purpose_cd=<%=purpose%>&bj_cd=<%=bj_cd%>&hj_cd=<%=hj_cd%>&jumyongName=<%=jumyongName%>';
		      
	document.location.href='/jumyong/junggi/landPriceAllAplly.do?'+param;
}
</script>
</head>
<body onload="javascript:aa();">
<img src="/img/working.jpg" width="500">

</body>
</html>