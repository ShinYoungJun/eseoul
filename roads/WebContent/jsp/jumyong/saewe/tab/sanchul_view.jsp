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
		
		sendRequest("/jumyong/saewe/sanchulinfo_view.do", params, "GET", Result_InfoView);

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
		form.SUM_ADJUST.value	=	xmldoc.getElementsByTagName("SUM_ADJUST").item(0).text;
		form.FORM_ADJUST.value	=	xmldoc.getElementsByTagName("FORM_ADJUST").item(0).text;

		// 점용구분에 따라 산출기간 다르게 보여짐 (일시일때..)
		if( xmldoc.getElementsByTagName("SECTION").item(0).text == '2' ){
			form.SANCHUL_DATE.value	=	xmldoc.getElementsByTagName("PARTLY_PERIOD").item(0).text + " (" +xmldoc.getElementsByTagName("PERIOD").item(0).text +"일)";
		}else{
			form.SANCHUL_DATE.value	=	xmldoc.getElementsByTagName("SANCHUL_DATE").item(0).text;
		}
			
		
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
<form id="form" name="form" method="post">
<input type="hidden" id="ADMIN_NO" name="ADMIN_NO" value="${ADMIN_NO}">
<input type="hidden" id="SEQ" name="SEQ" value="${SEQ}">
<input type="hidden" id="currentPage" name="currentPage" value="${currentPage}">

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
		        <td align="center" bgcolor="e5eff8" class="sub_table_b">부과 금액</td>
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
				<td width="37%" bgcolor="eaeaea" class="table_bl_left"><input id="YEAR"  name="YEAR" type="text" class="view" style="width:100px" value="" readonly></td>
				<td width="14%" align="center" bgcolor="e5eff8" class="sub_table_b">공시지가</td>
				<td width="36%" bgcolor="eaeaea" class="table_bl_left"><input id="PRICE" name="PRICE" type="text" class="view" style="width:100px" value="" readonly></td>
			  </tr>
			  
			  <tr>
				<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용면적</td>
				<td bgcolor="eaeaea" class="table_bl_left"><input id="AREA_AFTER" name="AREA_AFTER" type="text" class="view" style="width:100px"  value="" readonly></td>
				<td align="center" bgcolor="e5eff8" class="sub_table_b">요율/단가</td>
				<td bgcolor="eaeaea" class="table_bl_left"><input id="RATE" name="RATE" type="text" class="view" style="width:100px" value="" readonly></td>
			  </tr>
				  
			  <tr>
				<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">산출 기간</td>
				<td bgcolor="eaeaea" class="table_bl_left">
				<input id="SANCHUL_DATE" name="SANCHUL_DATE" type="text" class="view" style="width:160px" value="" readonly>
				</td>
				<td align="center" bgcolor="e5eff8" class="sub_table_b">부과 금액</td>
				<td bgcolor="eaeaea" class="table_bl_left"><input id="SUM_ADJUST" name="SUM_ADJUST" type="text" class="view" style="width:100px" value="" readonly></td>
			  </tr>
			  
			  <tr>
				<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">산출식</td>
				<td colspan="3" bgcolor="eaeaea" class="table_bl_left" align="left" nowrap="nowrap">
					<textarea id="FORM_ADJUST" name="FORM_ADJUST" type="text" class="view" style="width:620px; height:70px; overflow:hidden;" readonly></textarea>
				</td>
			  </tr>
			  
		  </table></td>
		</tr>
		
	</table></td>
  </tr>

</table>

</body>
</html>