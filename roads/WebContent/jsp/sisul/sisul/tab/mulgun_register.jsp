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

<script language="javascript" src="/js/PopupCalendar.js"></script> 

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

	function	Cancel()
	{
		var form = document.form;

		form.action = "mulgun_view.do";
		form.submit();
	}

	function	Register_Prc()
	{
		var form = document.form;

		form.action = "mulgun_register_prc.do";
		form.submit();
	}	
//]]>
</script>

<body onload="Init_PurposeCode();">
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
		        <td align="center" bgcolor="e5eff8" class="sub_table_b">점용목적(코드)</td>
		        <td align="center" bgcolor="e5eff8" class="sub_table_b">수량</td>
		        <td align="center" bgcolor="e5eff8" class="sub_table_b">산출기간</td>
		        <td align="center" bgcolor="e5eff8" class="sub_table_b">작년도 점용료</td>
		        <td align="center" bgcolor="e5eff8" class="sub_table_b">현년도 점용료</td>
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
				<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용목적</td>
				<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
				<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
				<tr><jsp:include page="/jsp/common/purposeCode/purposeCode.jsp" flush="true"/></tr>
				</table></td>
			</tr>
			
			  <tr>
				<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">수량(연장)</td>
				<td bgcolor="eaeaea" class="table_bl_left"><input name="YEAR" type="text" class="LENGTH" style="width:80px" value=""> 개(또는 m)</td>
				<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">산출요율</td>
				<td bgcolor="eaeaea" class="table_bl_left"><input name="RATE" type="text" class="input_form1" style="width:120px" value=""></td>
			  </tr>
				  
			  <tr>
				<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">산출 기간</td>
                <td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                    <tr>
                      <td><input name="FROMDATE" type="text" class="input_form1" style="width:80px" value=""></td>
                      <td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('FROMDATE'), 'yyyymmdd');"></a></td>
                      <td width="16" align="center"> - </td>
                      <td><input name="TODATE" type="text" class="input_form1" style="width:80px" value=""></td>
                      <td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('TODATE'), 'yyyymmdd');"></a></td>
                    </tr>
                </table></td>
				<td align="center" bgcolor="e5eff8" class="sub_table_b">기본 산출식</td>
				<td bgcolor="eaeaea" class="table_bl_left"><input name="SUM_YEAR" type="text" class="input_form1" style="width:120px" value=""></td>
			  </tr>

			  <tr>
				<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">작년도 점용료</td>
				<td bgcolor="eaeaea" class="table_bl_left"><input name="SUM_LASTYEAR" type="text" class="input_form1" style="width:120px"  value=""></td>
				<td align="center" bgcolor="e5eff8" class="sub_table_b">현년도 점용료</td>
				<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
				<td><input name="SUM_YEAR" type="text" class="input_form1" style="width:120px" value=""></td>
				<td><a><img src="/img/accou_icon.gif" width="56" height="18" border="0" onclick=""></a></td>
				</table></td>
			  </tr>
			  
		  </table></td>
		</tr>
		
		<tr>
			<td height="40" align="right">
			<table width="0" border="0" cellspacing="0" cellpadding="0" align="right">
			<tr>
		  		<td height="40" align="right"><a href="javascript:Cancel();"><img src="/img/can_icon.gif" alt="취소" width="56" height="18" border="0"></a>
		  		<td height="40" align="right"><a href="javascript:Register_Prc()"><img src="/img/save_icon2.gif" alt="저장" width="56" height="18" border="0"></a>
		  	</td>
		  	</table>
		  	</td>
		</tr>
		
	</table></td>
  </tr>

</table>

</body>
</html>