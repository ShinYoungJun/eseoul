<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/include.jsp" %>
<%@ include file="/jsp/common/loginCheck.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />
<title>::::: 서울시 도로점용관리시스템 :::::</title>
<style type="text/css">

<!--
body {
	margin: 0px;
}
-->

</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
</head>

<script language="javascript" src="/js/PopupCalendar.js"></script>
<script language="javascript" src="/js/Check_inputbox.js"></script>

<script type="text/javascript">
//<![CDATA[
           
	function	Page(page)
	{
		if(page	==	"")
			return;
		
		var form = document.form;
		
		form.action = "ilgwal_view.do?currentPage=" + page;
		form.submit();
	}

	function	View(adminno, seq)
	{

	}

	function	Save()
	{
	//	if(page	==	"")
	//		return;
		
		var form = document.form;
		
		form.action = "gigan_register.do";
		form.submit();
	}


//]]>
</script>

<body onload="">
<table width="780" border="0" cellpadding="0" cellspacing="0">
<form name="form" method="post">
<input type="hidden" name="currentPage" value="${currentPage}">
<input type="hidden" name="TOTALCNT" value="${totalcnt}">

<input type="hidden" name="GIGAN1" value="${GIGAN1}">
<input type="hidden" name="GIGAN2" value="${GIGAN2}">
<input type="hidden" name="PURPOSE_CD" value="${PURPOSE_CD}">
<input type="hidden" name="BONBUN" value="${BONBUN}">
<input type="hidden" name="BUBUN" value="${BUBUN}">
<input type="hidden" name="NAME" value="${NAME}">
<input type="hidden" name="ADMINNO" value="${ADMINNO}">
<input type="hidden" name="TYPE" value="${TYPE}">
<input type="hidden" name="SECTION" value="${SECTION}">
<input type="hidden" name="OWNER_SET" value="${OWNER_SET}">
<input type="hidden" name="TAX_SET" value="${TAX_SET}">
<input type="hidden" name="BJ_CD" value="${BJ_CD}">
<input type="hidden" name="HJ_CD" value="${HJ_CD}">

	  <tr>
		<td align="left" class="contborder_blue">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
     	
        <tr>
			<td height="34" class="sub_stan">전체건수 : <span class="sub_stan_blue">${totalcnt}</span> 건 </td>
        </tr>
	      
       <tr>
         <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
             <tr>
               <td width="30" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">번호</td>
               <td width="70" align="center" bgcolor="e5eff8" class="sub_table_b">관리번호</td>
               <td width="50" align="center" bgcolor="e5eff8" class="sub_table_b">점용<br/>종류</td>
               <td width="50" align="center" bgcolor="e5eff8" class="sub_table_b">점용<br/>구분</td>
               <td align="center" bgcolor="e5eff8" class="sub_table_b">점용인</td>
               <td align="center" bgcolor="e5eff8" class="sub_table_b">점용지</td>
               <td align="center" bgcolor="e5eff8" class="sub_table_b">점용목적</td>
               <td width="150" align="center" bgcolor="e5eff8" class="sub_table_b">점용기간</td>         
             </tr>
             
             <c:forEach items="${blist}" var="board" varStatus="idx">
             <tr>
             	<td height="26" align="center">${board.RN}</td>
				<td align="center"><script>var adminno = nr_Adminno_Cut("${board.ADMIN_NO}"); document.write(adminno);</script></td>
				<td align="center">${board.TYPE_NM}</td>
				<td align="center">${board.SECTION_NAME}</td>
				<td align="center">${board.NAME}</td>
				<td align="center">${board.JUMYONGJI}</td>
				<td align="center">${board.PURPOSE_CLASS} ${board.PURPOSE_SORT} ${board.PURPOSE_KIND}</td>
				<td align="center">${board.GIGAN}</td>
             </tr>
			</c:forEach>
		 
		 </table>
		 </td>
	    </tr>
		
		<tr>
		  <td height="30" align="center"><table border="0" cellspacing="0" cellpadding="0">
			<tr>
				${pageing}
			</tr>
		  </table></td>
		</tr>
		

	</table></td>
  </tr>

</table>

</body>

</html>