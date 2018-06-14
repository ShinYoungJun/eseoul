<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
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

	function	Modify()
	{
		var form = document.form;

		form.action = "/jumyong/saewe/bugwa_modify.do";
		form.submit();
	}

	function	Init_ADD_YNCheck(addyn)
	{
		if(addyn	== '1')	//	산 체크
			document.getElementById("ADD_YN").checked	= true;
		else
			document.getElementById("ADD_YN").checked	= false;
	}

	function 	Init()
	{
		parent.TabDown_Img("bugwa");
	}
	
//]]>
</script>

<body onload="Init(); Init_ADD_YNCheck('${board.ADD_YN}')">
<table width="780" border="0" cellpadding="0" cellspacing="0">
<form name="form" method="post">
<input type="hidden" name="ADMIN_NO" value="${ADMIN_NO}">

	  <tr>
		<td align="left" class="contborder_blue">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
			  <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">

				<tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">과세번호</td>
					<td width="181" bgcolor="eaeaea" class="table_bl_left"><input name="TAX_NO" type="text" class="readonly" style="width:120px" value="${board.TAX_NO}" readonly></td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">과세구분</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="TAX_SET" type="text" class="readonly" style="width:120px" value="${TAX_SET}" readonly></td>
				</tr>
				
				<tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">과세년월</td>
					<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					  <tr>
						<td><input name="tax_year" type="text" class="readonly" style="width:45px" value="${tax_year} 년 " readonly></td>
						<td><input name="tax_month" type="text" class="readonly" style="width:30px" value="${tax_month} 월" readonly></td>
				   	  </tr>
					</table></td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">세목코드</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="TAX_CD" type="text" class="readonly" style="width:270px" value="${TAX_CD}" readonly></td>
				</tr>
				
				<tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">시군구코드</td>
					<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					  <tr>
						<td><input name="SIGU_CD" type="text" class="readonly" style="width:120px" value="${board.SIGU_CD}" readonly></td>
						<td><input name="" type="text" class="readonly" style="width:120px" value="" readonly></td>
				   	  </tr>
					</table></td>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">부서코드</td>
					<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					  <tr>
						<td><input name="DEPT_CD" type="text" class="readonly" style="width:120px" value="${board.DEPT_CD}" readonly></td>
						<td><input name="" type="text" class="readonly" style="width:120px" value="" readonly></td>
				   	  </tr>
					</table></td>
				</tr>
				
				<tr>
					<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">납세자구분</td>
					<td colspan="3" bgcolor="eaeaea" class="table_bl_left"><input name="TAXPAYER_SET" type="text" class="readonly" style="width:240px" value="${TAXPAYER_SET}" readonly></td>
				</tr>
				
				<tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">거주상태</td>
					<td width="181" bgcolor="eaeaea" class="table_bl_left"><input name="LIVE" type="text" class="readonly" style="width:120px" value="${LIVE}" readonly></td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">물건구분</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="OBJ_SET" type="text" class="readonly" style="width:120px" value="${OBJ_SET}" readonly></td>
				</tr>
				
				<tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">본세(점용료)</td>
					<td width="181" bgcolor="eaeaea" class="table_bl_left"><input name="BONSE" type="text" class="readonly" style="width:120px" value="${board.BONSE} 원" readonly></td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">수납부서</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="" type="text" class="readonly" style="width:120px" value="" readonly></td>
				</tr>
				
				<tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">부가가치세</td>
					<td width="181" bgcolor="eaeaea" class="table_bl_left"><input name="VAT" type="text" class="readonly" style="width:120px" value="${board.VAT} 원" readonly></td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">과세일자</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="TAX_DATE" type="text" class="readonly" style="width:120px" value="${board.TAX_DATE}" readonly></td>
				</tr>
				
				<tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">납기내금액</td>
					<td width="181" bgcolor="eaeaea" class="table_bl_left"><input name="INTAX" type="text" class="readonly" style="width:120px" value="${board.INTAX} 원" readonly></td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">납기내일자</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="INDATE" type="text" class="readonly" style="width:120px" value="${board.INDATE}" readonly></td>
				</tr>
				
				<tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">납기후금액</td>
					<td width="181" bgcolor="eaeaea" class="table_bl_left"><input name="OVERTAX" type="text" class="readonly" style="width:120px" value="${board.OVERTAX} 원" readonly></td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">납기후일자</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="OVERDATE" type="text" class="readonly" style="width:120px" value="${board.OVERDATE}" readonly></td>
				</tr>
				
				<tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">가산율구분</td>
					<td width="181" bgcolor="eaeaea" class="table_bl_left"><input name="ADD_SET" type="text" class="readonly" style="width:120px" value="${board.ADD_SET}" readonly></td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">가산금면제여부</td>
					<td bgcolor="eaeaea" class="table_bl_left">
						<input name="ADD_YN" type="checkbox" disabled>가산금면제
					</td>
				</tr>
				
				<tr>
					<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">비고</td>
					<td colspan="3" bgcolor="eaeaea" class="table_bl_left"><input name="NOTES" type="text" class="readonly" style="width:600px" value="${board.NOTES}" readonly></td>
				</tr>
				
				<tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">적용 상한율</td>
					<td width="181" bgcolor="eaeaea" class="table_bl_left"><input name="LIMIT_SUM" type="text" class="readonly" style="width:120px" value="${board.LIMIT_SUM}" readonly></td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">상한횟수</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="LIMIT_CNT" type="text" class="readonly" style="width:120px" value="${board.LIMIT_CNT}" readonly></td>
				</tr>
				
				<tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">특별이율</td>
					<td width="181" bgcolor="eaeaea" class="table_bl_left"><input name="RATE" type="text" class="readonly" style="width:120px" value="${board.RATE}" readonly></td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">특별이율 사유</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input name="RATE_CAUSE" type="text" class="readonly" style="width:120px" value="${board.RATE_CAUSE}" readonly></td>
				</tr>
				  
			  </table></td>
			</tr>

			<tr>
			  <td height="40" align="right">
			  <table width="0" border="0" cellspacing="0" cellpadding="0" align="right">
				<a href="javascript:Modify()"><img src="/img/mod_icon.gif" alt="수정" width="56" height="18" border="0"></a>
			  </table>
			  </td>
			</tr>
			
		</table></td>
	  </tr>

</table>

</body>
</html>

<div id='popCal' style='POSITION:absolute;visibility:hidden;border:2px ridge;width:10'>
       <iframe name="popFrame" src="/js/calendar.html" frameborder="0" scrolling="no" width=183 height=188></iframe>
</div>
