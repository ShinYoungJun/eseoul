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

	function	View(guCode,corpCd,admin_no,seq)
	{	
		var params	= "GU_CODE="+guCode+"&CORP_CD="+corpCd+"&ADMIN_NO="+admin_no+"&SEQ="+seq;
		
		sendRequest("/facility/saewe/sanchulinfo_view.do", params, "GET", Result_InfoView);

		parent.BugwaView(guCode,corpCd,admin_no,seq);
	}

	function	Result_InfoView(obj)
	{
		//document.write(obj);
        var xmldoc 	= new ActiveXObject("Microsoft.XMLDOM");
        var form 	= document.form;

        xmldoc.async	= false;
		xmldoc.loadXML(obj);

		form.YEAR.value			=	xmldoc.getElementsByTagName("YEAR").item(0).text;
		form.SANCHUL_DATE.value	=	xmldoc.getElementsByTagName("SANCHUL_DATE").item(0).text;
		form.USE_SECTION.value	=	xmldoc.getElementsByTagName("USE_SECTION").item(0).text;
		form.TAX_SET.value		=	xmldoc.getElementsByTagName("TAX_SET").item(0).text;
		//form.SUM_ADJUST.value	=	xmldoc.getElementsByTagName("SUM_ADJUST").item(0).text;
		form.VAT.value			=	xmldoc.getElementsByTagName("VAT").item(0).text;
		form.SUM.value			=	xmldoc.getElementsByTagName("SUM").item(0).text;		
	}

	function 	Init()
	{
		parent.TabUp_Img("sanchul");

		var	guCode	=  document.getElementById("GU_CODE").value;
		var	corpCd	= document.getElementById("CORP_CD").value;
		var	admin_no = document.getElementById("ADMIN_NO").value;
		var	seq = document.getElementById("SEQ").value;

		if(guCode != "")
			View(guCode, corpCd, admin_no, seq);
	}
	
//]]>
</script>

<body onload="Init();">
<form name="form" method="post">
<input type="hidden" name="GU_CODE" value="${GU_CODE}">
<input type="hidden" name="CORP_CD" value="${CORP_CD}">
<input type="hidden" name="ADMIN_NO" value="${ADMIN_NO}">
<input type="hidden" name="SEQ" value="${SEQ}">
<input type="hidden" name="currentPage" value="${currentPage}">

<table width="780" border="0" cellpadding="0" cellspacing="0">

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
		        <td align="center" bgcolor="e5eff8" class="sub_table_b">세입구분</td>
		        <td align="center" bgcolor="e5eff8" class="sub_table_b">산출기간</td>
		         <td align="center" bgcolor="e5eff8" class="sub_table_b">과세구분</td>
		        <!--<td align="center" bgcolor="e5eff8" class="sub_table_b">조정 점용료</td>
		         --><td align="center" bgcolor="e5eff8" class="sub_table_b">부과 점용료(감면적용)</td>
		      </tr>
		      <c:forEach items="${blist}" var="board" varStatus="idx">
				<tr onClick="javascript:View('${board.GU_CODE}','${board.CORP_CD}','${board.ADMIN_NO}','${board.SEQ}')" onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" style="CURSOR: Hand;" >
				<td height="26" align="center">${((currentPage * 2) + idx.count) - 2}</td>
				<td align="center">${board.YEAR}</td>
				<td align="center">${board.TAX_SET}</td>
				<td align="center">${board.SANCHUL_DATE}</td>
				<td align="center">${board.USE_SECTION}</td>
				<!--<td align="center">${board.SUM_ADJUST}</td>
				--><td align="center">${board.SUM}</td>
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
				<td width="14%" align="center" bgcolor="e5eff8" class="sub_table_b">산출기간</td>
				<td width="36%" bgcolor="eaeaea" class="table_bl_left"><input name="SANCHUL_DATE" type="text" class="view" style="width:160px" value="" readonly></td>
			  </tr>
			  
			  <tr>
				<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">과세구분</td>
				<td bgcolor="eaeaea" class="table_bl_left"><input name="USE_SECTION" type="text" class="view" style="width:100px"  value="" readonly></td>
				<td align="center" bgcolor="e5eff8" class="sub_table_b">세입구분</td>
				<td bgcolor="eaeaea" class="table_bl_left"><input name="TAX_SET" type="text" class="view" style="width:100px" value="" readonly></td>
			  </tr>
				  
			  <tr>
				<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">부가가치세</td>
				<td bgcolor="eaeaea" class="table_bl_left">
				<input name="VAT" id="VAT" type="text" class="view" style="width:100px" value="" readonly>
				</td>
				<td align="center" bgcolor="e5eff8" class="sub_table_b">부과 점용료</td>
				<td bgcolor="eaeaea" class="table_bl_left"><input name="SUM" id="SUM" type="text" class="view" style="width:100px" value="" readonly></td>
			  </tr>
				  
		  </table></td>
		</tr>
		
	</table></td>
  </tr>

</table>
</form>
</body>
</html>