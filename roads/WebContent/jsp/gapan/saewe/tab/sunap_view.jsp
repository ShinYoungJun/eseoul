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

<body onload="Init();">
<table width="780" border="0" cellpadding="0" cellspacing="0">
<form name="form" method="post">
<input type="hidden" name="ADMIN_NO" value="${ADMIN_NO}">
<input type="hidden" name="currentPage" value="${currentPage}">

	  <tr>
		<td align="left" class="contborder_blue">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">

	    <tr>
		  <td height="34" colspan="4" align="left" bgcolor="#FFFFFF" class=""><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
			<tr>
			  <td><span class="sub_stan_blue">
			  	* 부과정보 <br>
			    가판에 대한 산출은 각 지자체의 계정으로 접속하여 진행해주세요(서울시 계정으로는 산출 불가.)
			  </span></td>
			</tr>
		  </table></td>
	    </tr>
		<tr>
			<td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
		      	<tr>
			        <td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">본세</td>
			        <td align="center" bgcolor="e5eff8" class="sub_table_b">기금</td>
			        <td align="center" bgcolor="e5eff8" class="sub_table_b">국세</td>
			        <td align="center" bgcolor="e5eff8" class="sub_table_b">구세</td>
			        <td align="center" bgcolor="e5eff8" class="sub_table_b">부가세</td>
			        <td align="center" bgcolor="e5eff8" class="sub_table_b">납기내 금액</td>
			        <td align="center" bgcolor="e5eff8" class="sub_table_b">납기후 금액</td>
		      	</tr>

				<c:choose>
					<c:when test="${blist!= null && !empty blist}">
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
			                </tr>
		           
						</c:forEach>
					</c:when>
					<c:otherwise>
					<tr>
						<td align="center" class="sub_table" colspan="9" height="26">검색된 내용이 없습니다</td>
					</tr>
					</c:otherwise>
				</c:choose>
			
			</table></td>
		</tr>
		
		<tr>
			<td height="14"></td>
		</tr>	
	
	    <tr>
		  <td height="34" colspan="4" align="left" bgcolor="#FFFFFF" class=""><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
			<tr>
			  <td><span class="sub_stan_blue">* 수납정보</span></td>
			</tr>
		  </table></td>
	    </tr>
		<tr>
			<td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
		      	<tr>
			        <td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">납부일자</td>
			        <td align="center" bgcolor="e5eff8" class="sub_table_b">납부구분</td>
			        <td align="center" bgcolor="e5eff8" class="sub_table_b">처리구분</td>
			        <td align="center" bgcolor="e5eff8" class="sub_table_b">수납구분</td>
			        <td align="center" bgcolor="e5eff8" class="sub_table_b">본세</td>
			        <td align="center" bgcolor="e5eff8" class="sub_table_b">부가세</td>
			        <td align="center" bgcolor="e5eff8" class="sub_table_b">가산금</td>
			        <td align="center" bgcolor="e5eff8" class="sub_table_b">수납액</td>
		      	</tr>

				<c:choose>
					<c:when test="${blist!= null && !empty blist}">
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
							<td align="center"><a href="javascript:View('${board.ADMIN_NO}','${board.YEAR}','${board.SEQ}')" class="inqu">${board.SUM_YEAR}</a></td>
			                </tr>
		              
						</c:forEach>	
					</c:when>
					<c:otherwise>
					<tr>
						<td align="center" class="sub_table" colspan="9" height="26">검색된 내용이 없습니다</td>
					</tr>
					</c:otherwise>
				</c:choose>
			
			</table></td>
		</tr>
		
		<tr>
			<td height="14"></td>
		</tr>

		<tr></tr><tr></tr>
		
		<tr>
		  <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">

			  <tr>
				<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">과/오납정보</td>
				<td width="37%" bgcolor="eaeaea" class="table_bl_left"><input name="YEAR" type="text" class="view" style="width:96%" value="" readonly></td>
				<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">과/오납일자</td>
				<td bgcolor="eaeaea" class="table_bl_left"><input name="PRICE" type="text" class="view" style="width:96%" value="" readonly></td>
			  </tr>
			  				  
			  <tr>
				<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">과/오납사유</td>
				<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
					<input name="FROMDATE" type="text" class="view" style="width:98%" value="" readonly>
				</td>
			  </tr>
			  			  
			  <tr>
				<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">감액정보</td>
				<td bgcolor="eaeaea" class="table_bl_left"><input name="SUM_LASTYEAR" type="text" class="view" style="width:96%"  value="" readonly></td>
				<td align="center" bgcolor="e5eff8" class="sub_table_b">감액일자</td>
				<td bgcolor="eaeaea" class="table_bl_left"><input name="SUM_YEAR" type="text" class="view" style="width:96%" value="" readonly></td>
			  </tr>
			  
			  <tr>
				<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">감액구분</td>
				<td bgcolor="eaeaea" class="table_bl_left"><input name="ADJUSTMENT" type="text" class="view" style="width:96%" value="" readonly></td>
				<td align="center" bgcolor="e5eff8" class="sub_table_b">감면금액</td>
				<td bgcolor="eaeaea" class="table_bl_left"><input name="SUM_ADJUST" type="text" class="view" style="width:96%" value="" readonly></td>
			  </tr>
			  
			  <tr>
				<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">감액사유</td>
				<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
					<input name="FROMDATE" type="text" class="view" style="width:98%" value="" readonly>
				</td>
			  </tr>
			  
		  </table></td>
		</tr>
		
	</table></td>
  </tr>

</table>

</body>
</html>