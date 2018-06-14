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
}
-->

</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
</head>

<script language="javascript" src="/js/Ajax_request.js"></script>

<script type="text/javascript">
//<![CDATA[
           
	function	Page(page)
	{
		if(page	==	"")
			return;
		
		var form = document.form;

		form.action = "sanchul_view.do?currentPage=" + page;
		form.submit();
	}

	function	View(adminno, seq)
	{
	//	parent.BugwaCatch(year, seq);	//	산출 정보의 데이터를 뷰파일로 보낸다.
		
		params	= "ADMIN_NO=" + adminno + "&SEQ=" + seq;
		
		sendRequest("/rojum/saewe/sanchulinfo_view.do", params, "GET", Result_InfoView);

		document.getElementById("SEQ").value	= seq;

		parent.BugwaView(seq);
	}

	function	Result_InfoView(obj)
	{
		//document.write(obj);
        var xmldoc 	= new ActiveXObject("Microsoft.XMLDOM");
        var form 	= document.form;

        xmldoc.async	= false;
		xmldoc.loadXML(obj);

		form.YEAR.value			=	xmldoc.getElementsByTagName("YEAR").item(0).text;
		form.PRICE.value		=	xmldoc.getElementsByTagName("PRICE").item(0).text;
		form.AREA_AFTER.value	=	xmldoc.getElementsByTagName("AREA_AFTER").item(0).text;
		form.RATE.value			=	xmldoc.getElementsByTagName("RATE").item(0).text;
		form.SANCHUL_DATE.value	=	xmldoc.getElementsByTagName("SANCHUL_DATE").item(0).text;
	//	form.FROMDATE.value		=	xmldoc.getElementsByTagName("FROMDATE").item(0).text;
	//	form.TODATE.value		=	xmldoc.getElementsByTagName("TODATE").item(0).text;
//		form.SUM_LASTYEAR.value	=	xmldoc.getElementsByTagName("SUM_LASTYEAR").item(0).text;
//		form.SUM_YEAR.value		=	xmldoc.getElementsByTagName("SUM_YEAR").item(0).text;
//		form.ADJUSTMENT.value	=	xmldoc.getElementsByTagName("ADJUSTMENT").item(0).text;
		form.SUM_ADJUST.value	=	xmldoc.getElementsByTagName("SUM_ADJUST").item(0).text;
//		form.FORM.value			=	xmldoc.getElementsByTagName("FORM").item(0).text;
		form.FORM_ADJUST.value	=	xmldoc.getElementsByTagName("FORM_ADJUST").item(0).text;
	}

	function 	Init()
	{
		parent.TabUp_Img("sanchul");

		var	adminno	= document.getElementById("ADMIN_NO").value;
		var	seq		= document.getElementById("SEQ").value;

	//	alert(adminno + " , " + seq);
	
		if(seq != "")
			View(adminno, seq);
	}
		
//]]>
</script>

<body onload="Init();">
<table width="780" border="0" cellpadding="0" cellspacing="0">
<form name="form" method="post">
<input type="hidden" name="ADMIN_NO" value="${ADMIN_NO}">
<input type="hidden" name="SEQ" value="${SEQ}">
<input type="hidden" name="currentPage" value="${currentPage}">

	  <tr>
		<td align="left" class="contborder_blue">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">

        <tr>
          <td height="34" class="sub_stan">전체건수 : <span class="sub_stan_blue">${totalcnt}</span> 건 </td>
        </tr>
		<tr>
			<td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
		      <tr>
		        <td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">번호</td>
		        <td align="center" bgcolor="e5eff8" class="sub_table_b">기준년도</td>
		        <td align="center" bgcolor="e5eff8" class="sub_table_b">공시지가</td>
		        <td align="center" bgcolor="e5eff8" class="sub_table_b">면적</td>
		        <td align="center" bgcolor="e5eff8" class="sub_table_b">요율</td>
		        <td align="center" bgcolor="e5eff8" class="sub_table_b">산출기간</td>
		        <td align="center" bgcolor="e5eff8" class="sub_table_b">조정 점용료</td>
		      </tr>
		      <c:forEach items="${blist}" var="board" varStatus="idx">
				<tr onClick="javascript:View('${board.ADMIN_NO}','${board.SEQ}')" onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" style="CURSOR: Hand;" >
				<td height="26" align="center">${((currentPage * 2) + idx.count) - 2}</td>
				<td align="center">${board.YEAR}</td>
				<td align="center">${board.PRICE}</td>
				<td align="center">${board.AREA_AFTER}</td>
				<td align="center">${board.RATE}</td>
				<td align="center">${board.SANCHUL_DATE}</td>
				<td align="center">${board.SUM_ADJUST}</td>
                </tr>
			  </c:forEach>
			</table></td>
		</tr>
		
		<tr>
		  <td height="30" align="center"><table border="0" cellspacing="0" cellpadding="0">
			<tr>
				${pageing}
			</tr>
		  </table></td>
		</tr>
<!--
        <tr>
          <td height="1" bgcolor="#EAEAEA"></td>
        </tr>
--> 
		<tr></tr><tr></tr>
		
		<tr>
		  <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">

			  <tr>
				<td width="13%" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">기준년도</td>
				<td width="37%" bgcolor="eaeaea" class="table_bl_left"><input name="YEAR" type="text" class="view" style="width:100px" value="" readonly></td>
				<td width="14%" align="center" bgcolor="e5eff8" class="sub_table_b">공시지가</td>
				<td width="36%" bgcolor="eaeaea" class="table_bl_left"><input name="PRICE" type="text" class="view" style="width:100px" value="" readonly></td>
			  </tr>
			  
			  <tr>
				<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용면적</td>
				<td bgcolor="eaeaea" class="table_bl_left"><input name="AREA_AFTER" type="text" class="view" style="width:100px"  value="" readonly></td>
				<td align="center" bgcolor="e5eff8" class="sub_table_b">산출요율</td>
				<td bgcolor="eaeaea" class="table_bl_left"><input name="RATE" type="text" class="view" style="width:100px" value="" readonly></td>
			  </tr>
				  
			  <tr>
				<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">산출 기간</td>
				<td bgcolor="eaeaea" class="table_bl_left">
				<input name="SANCHUL_DATE" type="text" class="view" style="width:160px" value="" readonly>
				</td>
				<td align="center" bgcolor="e5eff8" class="sub_table_b">조정 점용료</td>
				<td bgcolor="eaeaea" class="table_bl_left"><input name="SUM_ADJUST" type="text" class="view" style="width:100px" value="" readonly></td>
			  </tr>
			  
			  <tr>
				<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">조정 산출식</td>
				<td colspan="3" bgcolor="eaeaea" class="table_bl_left" align="left"><input name="FORM_ADJUST" type="text" class="view" style="width:600px" value="" readonly></td>
			  </tr>
			  
		  </table></td>
		</tr>
		
	</table></td>
  </tr>

</table>

</body>
</html>