<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
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

<script type="text/javascript">
//<![CDATA[

	function getXMLHTTPRequest()
	{
		var xRequest = null;
		xRequest = new ActiveXObject("Microsoft.XMLHTTP");

		return xRequest;
	}

	var req;
	var	call;
	
	function sendRequest(url, params, HttpMethod, callback)
	{
		req = getXMLHTTPRequest();

		call	= callback;
		if(req){
			req.onreadystatechange = onReadyStateChange;
			req.open(HttpMethod, url, true);
			req.setRequestHeader("Content-Type","application/x-www-form-urlencoded;charset=UTF-8");
			req.send(params);
		}
	}

	function onReadyStateChange()
	{
		var ready = req.readyState;
		var data = null;
		if(ready == 4){
			if(this.call	!= null)
				this.call(req.responseText);
		}
	}
           
	function	Page(page)
	{
		if(page	==	"")
			return;
		
		var form = document.form;

		form.action = "sanchul_view.do?currentPage=" + page;
		form.submit();
	}

	function	View(adminno, year, seq)
	{
		params	= "ADMIN_NO=" + adminno + "&YEAR=" + year + "&SEQ=" + seq;
		
		sendRequest("sanchulinfo_view.do", params, "GET", Result_InfoView);
	}

	function	Result_InfoView(obj)
	{
        var xmldoc 	= new ActiveXObject("Microsoft.XMLDOM");
        var form 	= document.form;
        
		xmldoc.loadXML(obj);

		form.YEAR.value			=	xmldoc.getElementsByTagName("ADMIN_NO").item(0).text;
		form.PRICE.value		=	xmldoc.getElementsByTagName("PRICE").item(0).text;
		form.AREA_AFTER.value	=	xmldoc.getElementsByTagName("AREA_AFTER").item(0).text;
		form.RATE.value			=	xmldoc.getElementsByTagName("RATE").item(0).text;
		form.FROMDATE.value		=	xmldoc.getElementsByTagName("FROMDATE").item(0).text;
		form.TODATE.value		=	xmldoc.getElementsByTagName("TODATE").item(0).text;
		form.SUM_LASTYEAR.value	=	xmldoc.getElementsByTagName("SUM_LASTYEAR").item(0).text;
		form.SUM_YEAR.value		=	xmldoc.getElementsByTagName("SUM_YEAR").item(0).text;
		form.ADJUSTMENT.value	=	xmldoc.getElementsByTagName("ADJUSTMENT").item(0).text;
		form.SUM_ADJUST.value	=	xmldoc.getElementsByTagName("SUM_ADJUST").item(0).text;
		form.FORM.value			=	xmldoc.getElementsByTagName("FORM").item(0).text;
		form.FORM_ADJUST.value	=	xmldoc.getElementsByTagName("FORM_ADJUST").item(0).text;
	}

	function 	Init()
	{
		parent.TabDown_Img("sunap");
	}
	
//]]>
</script>

<body onload="Init()">
<table width="780" border="0" cellpadding="0" cellspacing="0">
<form name="form" method="post">
<input type="hidden" name="ADMIN_NO" value="${ADMIN_NO}">
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
		        <td align="center" bgcolor="e5eff8" class="sub_table_b">현년도 점용료</td>
		        <td align="center" bgcolor="e5eff8" class="sub_table_b">조정 점용료</td>
		      </tr>
		      
		      <c:forEach items="${blist}" var="board" varStatus="idx">
				<a href="javascript:View('${board.ADMIN_NO}','${board.YEAR}','${board.SEQ}')">
				<tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" style="CURSOR: Hand;" >
				<td height="26" align="center"><a href="javascript:View('${board.ADMIN_NO}','${board.YEAR}','${board.SEQ}')" class="inqu">${((currentPage * 2) + idx.count) - 2}</a></td>
				<td align="center"><a href="javascript:View('${board.ADMIN_NO}','${board.YEAR}','${board.SEQ}')" class="inqu">${board.YEAR}</a></td>
				<td align="center"><a href="javascript:View('${board.ADMIN_NO}','${board.YEAR}','${board.SEQ}')" class="inqu">${board.PRICE}</a></td>
				<td align="center"><a href="javascript:View('${board.ADMIN_NO}','${board.YEAR}','${board.SEQ}')" class="inqu">${board.AREA_AFTER}</a></td>
				<td align="center"><a href="javascript:View('${board.ADMIN_NO}','${board.YEAR}','${board.SEQ}')" class="inqu">${board.RATE}</a></td>
				<td align="center"><a href="javascript:View('${board.ADMIN_NO}','${board.YEAR}','${board.SEQ}')" class="inqu">${board.SANCHUL_DATE}</a></td>
				<td align="center"><a href="javascript:View('${board.ADMIN_NO}','${board.YEAR}','${board.SEQ}')" class="inqu">${board.SUM_YEAR}</a></td>
				<td align="center"><a href="javascript:View('${board.ADMIN_NO}','${board.YEAR}','${board.SEQ}')" class="inqu">${board.SUM_ADJUST}</a></td>
                </tr>
                </a>
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

        <tr>
          <td height="1" bgcolor="#EAEAEA"></td>
        </tr>
    
		<tr></tr><tr></tr>
		
		<tr>
		  <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">

			  <tr>
				<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">기준년도</td>
				<td width="181" bgcolor="eaeaea" class="table_bl_left"><input name="YEAR" type="text" class="input_form1" style="width:120px" value="" readonly></td>
				<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">공시지가</td>
				<td bgcolor="eaeaea" class="table_bl_left"><input name="PRICE" type="text" class="input_form1" style="width:120px" value="" readonly></td>
			  </tr>
			  
			  <tr>
				<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용면적</td>
				<td bgcolor="eaeaea" class="table_bl_left"><input name="AREA_AFTER" type="text" class="input_form1" style="width:120px"  value="" readonly></td>
				<td align="center" bgcolor="e5eff8" class="sub_table_b">산출요율</td>
				<td bgcolor="eaeaea" class="table_bl_left"><input name="RATE" type="text" class="input_form1" style="width:120px" value="" readonly></td>
			  </tr>
				  
			  <tr>
				<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">산출 기간</td>
				<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
				<input name="FROMDATE" type="text" class="input_form1" style="width:70px" value="" readonly>
				 ~ <input name="TODATE" type="text" class="input_form1" style="width:70px" value="" readonly>
				</td>
			  </tr>
			  			  
			  <tr>
				<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">작년도 점용료</td>
				<td bgcolor="eaeaea" class="table_bl_left"><input name="SUM_LASTYEAR" type="text" class="input_form1" style="width:120px"  value="" readonly></td>
				<td align="center" bgcolor="e5eff8" class="sub_table_b">현년도 점용료</td>
				<td bgcolor="eaeaea" class="table_bl_left"><input name="SUM_YEAR" type="text" class="input_form1" style="width:120px" value="" readonly></td>
			  </tr>
			  
			  <tr>
				<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">조정 계수</td>
				<td bgcolor="eaeaea" class="table_bl_left"><input name="ADJUSTMENT" type="text" class="input_form1" style="width:120px" value="" readonly></td>
				<td align="center" bgcolor="e5eff8" class="sub_table_b">조정 점용료</td>
				<td bgcolor="eaeaea" class="table_bl_left"><input name="SUM_ADJUST" type="text" class="input_form1" style="width:120px" value="" readonly></td>
			  </tr>
			  
			  <tr>
				<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">기본 산출식</td>
				<td bgcolor="eaeaea" class="table_bl_left"><input name="FORM" type="text" class="input_form1" style="width:220px" value="" readonly></td>
				<td align="center" bgcolor="e5eff8" class="sub_table_b">조정 산출식</td>
				<td bgcolor="eaeaea" class="table_bl_left"><input name="FORM_ADJUST" type="text" class="input_form1" style="width:220px" value="" readonly></td>
			  </tr>
			  
		  </table></td>
		</tr>
		
	</table></td>
  </tr>

</table>

</body>
</html>

<div id='popCal' style='POSITION:absolute;visibility:hidden;border:2px ridge;width:10'>
       <iframe name="popFrame" src="/js/calendar.html" frameborder="0" scrolling="no" width=183 height=188></iframe>
</div>
