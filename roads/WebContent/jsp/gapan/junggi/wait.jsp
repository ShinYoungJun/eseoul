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
String mul_fromdate = request.getParameter("mul_fromdate");
String mul_todate = request.getParameter("mul_todate");
String cal_status = request.getParameter("cal_status");
String purpose = request.getParameter("purpose");
String bj_cd = request.getParameter("bj_cd");
String jumyongName = request.getParameter("jumyongName");

%>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<script>
function aa(){
	//document.location.href="/jumyong/junggi/search.do";
	var param = 'year=<%=year%>&type=<%=type%>&tax_set=<%=tax_set%>&tax_yn=<%=tax_yn%>&mul_fromdate=<%=mul_fromdate%>&mul_todate=<%=mul_todate%>'
		      + '&cal_status=<%=cal_status%>&purpose_cd=<%=purpose%>&bj_cd=<%=bj_cd%>&jumyongName=<%=jumyongName%>';
	//alert(param);
	document.location.href='/gapan/junggi/landPriceAllAplly.do?'+param;
}
</script>
</head>
<body onload="javascript:aa();">
<img src="/img/working.jpg" width="500">

</body>
</html>