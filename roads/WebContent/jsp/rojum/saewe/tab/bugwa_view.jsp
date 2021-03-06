<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
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

	function	Modify()
	{
		var form = document.form;

		if(form.TAX_YN.value == "1")
		{
			alert("부과된 정보는 수정할수 없습니다.");
			return;
		}

		form.action = "/rojum/saewe/bugwa_modify.do";
		form.submit();
	}

	function 	Init()
	{
		parent.Bugwa_On();
	}
	
//]]>
</script>

<body onload="Init();">
<table width="780" border="0" cellpadding="0" cellspacing="0">
<form id="form" name="form" method="post">
<input type="hidden" id="ADMIN_NO" name="ADMIN_NO" value="${ADMIN_NO}">
<input type="hidden" id="SEQ" name="SEQ" value="${SEQ}">
<input type="hidden" id="GP_TYP" name="GP_TYP" value="${GP_TYP }">
<input type="hidden" id="TAX_YN" name="TAX_YN" value="${TAX_YN}">
<input type="hidden" id="VIEWPAGE" name="VIEWPAGE" value="VIEWPAGE">

<input type="hidden" id="sigu_cd" name="sigu_cd" value="${board.SIGU_CD}">
<input type="hidden" id="buseo_cd" name="buseo_cd" value="${board.DEPT_CD}">
<input type="hidden" id="semok_cd" name="semok_cd" value="${semok_cd}">
<input type="hidden" id="tax_ym" name="tax_ym" value="${tax_ym}">
<input type="hidden" id="tax_gubun" name="tax_gubun" value="${board.TAX_GUBUN}">
<input type="hidden" id="tax_no" name="tax_no" value="${board.TAX_NO}">
<input type="hidden" id="user_id" name="user_id" value="${user_id}">
<input type="hidden" id="bukwa_id" name="bukwa_id" value="${bukwa_id}">

	  <tr>
		<td align="left" class="contborder_blue">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
			  <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">

				<tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">과세번호</td>
					<td width="37%" bgcolor="eaeaea" class="table_bl_left">${board.TAX_NO}</td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">과세구분</td>
					<td bgcolor="eaeaea" class="table_bl_left">${TAX_GUBUN}</td>
				</tr>
				
				<tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">과세년월</td>
					<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					  <tr>
						<td>${tax_year} 년&nbsp;&nbsp;</td>
						<td>${tax_month} 월</td>
				   	  </tr>
					</table></td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">세목코드</td>
					<td bgcolor="eaeaea" class="table_bl_left">${TAX_CD}</td>
				</tr>
				
				<tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">기관코드</td>
					<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					  <tr>
						<td>[${board.SIGU_CD}] ${board.GU_NM}</td>
				   	  </tr>
					</table></td>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">부서코드</td>
					<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					  <tr>
						<td>[${board.DEPT_CD}] ${board.DEPT_NM}</td>
				   	  </tr>
					</table></td>
				</tr>
				
				<tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">OCR시구코드</td>
					<td bgcolor="eaeaea" class="table_bl_left">${board.OCR_SIGU_CD}</td>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">OCR부서코드</td>
					<td bgcolor="eaeaea" class="table_bl_left">${board.OCR_BUSEO_CD}</td>
				</tr>	
				
				<tr>
					<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">납세자구분</td>
					<td colspan="3" bgcolor="eaeaea" class="table_bl_left">${TAXPAYER_SET}</td>
				</tr>
				
				<tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">거주상태</td>
					<td width="181" bgcolor="eaeaea" class="table_bl_left">${LIVE}</td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">물건구분</td>
					<td bgcolor="eaeaea" class="table_bl_left">${OBJ_SET}</td>
				</tr>
				
				<tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">본세(점용료)</td>
					<td width="181" bgcolor="eaeaea" class="table_bl_left">${board.BONSE} 원</td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">수납부서</td>
					<td bgcolor="eaeaea" class="table_bl_left">${board.SUBUSEO_CD}</td>
				</tr>
				
				<tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">부가가치세</td>
					<td width="181" bgcolor="eaeaea" class="table_bl_left">${board.VAT} 원</td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">과세일자</td>
					<td bgcolor="eaeaea" class="table_bl_left">${board.TAX_DATE}</td>
				</tr>
				
				<tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">납기내금액</td>
					<td width="181" bgcolor="eaeaea" class="table_bl_left">${board.INTAX} 원</td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">납기내일자</td>
					<td bgcolor="eaeaea" class="table_bl_left">${board.INDATE}</td>
				</tr>
				<c:if test="${TAX_GUBUN != '신고분'}">
				<tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">납기후금액</td>
					<td width="181" bgcolor="eaeaea" class="table_bl_left">${board.OVERTAX} 원</td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">납기후일자</td>
					<td bgcolor="eaeaea" class="table_bl_left">${board.OVERDATE}</td>
				</tr>
				</c:if>
				<tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">가산율구분</td>
					<td width="181" bgcolor="eaeaea" class="table_bl_left">${ADD_SET_NM}</td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">가산금면제여부</td>
					<td bgcolor="eaeaea" class="table_bl_left">
						${board.ADD_YN}
					</td>
				</tr>
				
				<tr>
					<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">비고</td>
					<td colspan="3" bgcolor="eaeaea" class="table_bl_left">${board.NOTES}</td>
				</tr>
				
				<tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">적용 상한율</td>
					<td width="181" bgcolor="eaeaea" class="table_bl_left">${board.LIMIT_SUM} %</td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">상한횟수</td>
					<td bgcolor="eaeaea" class="table_bl_left">${board.LIMIT_CNT} 회</td>
				</tr>
				
				<tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">특별이율</td>
					<td width="181" bgcolor="eaeaea" class="table_bl_left">${board.RATE} %</td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">특별이율 사유</td>
					<td bgcolor="eaeaea" class="table_bl_left">${board.RATE_CAUSE}</td>
				</tr>
				  
			  </table></td>
			</tr>
			
		      <tr>
		        <td height="14"></td>
		      </tr>
				
		<tr>
			<td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
		    <tr>
		        <td width="25%" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">본세</td>
		        <td width="25%" align="center" bgcolor="e5eff8" class="sub_table_b">부가가치세</td>
		        <td width="25%" align="center" bgcolor="e5eff8" class="sub_table_b">납기내금액</td>
		        <td width="25%" align="center" bgcolor="e5eff8" class="sub_table_b">납기후금액</td>
		    </tr>
		    
			<tr>
 				<td height="26" align="center">${board.BONSE}</td>
				<td align="center">${board.VAT}</td>
				<td align="center">${board.INTAX}</td>
				<td align="center">${board.OVERTAX}</td>
             </tr>
			</table></td>
		</tr>
			<tr>
			  <td height="40" align="right">
			  </td>
			</tr>
		</table>
		</td>
	  </tr>
</table>
</body>
</html>