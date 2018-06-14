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

<script type="text/javascript"><!--
//<![CDATA[


	function 	Init()
	{
		parent.TabDown_Img("bugwa");
		parent.Bugwa_On();
	}

	function	Modify()
	{
		var form = document.form;

		
		if(form.TAX_YN.value == "1")
		{
			
			alert("부과된 정보는 수정할수 없습니다.");
			return;
		}
		
		
		form.action = "/facility/saewe/bugwa_modify.do";
		form.submit();
		
	}
	
//]]>
--></script>

<body onLoad="Init();">
<form name="form" method="post">
<input type="hidden" name="GU_CODE" value="${GU_CODE}">
<input type="hidden" name="CORP_CD" value="${CORP_CD}">
<input type="hidden" name="ADMIN_NO" value="${ADMIN_NO}">
<input type="hidden" name="SEQ" value="${SEQ}">
<input type="hidden" name="TAX_YN" value="${TAX_YN}">
<input type="hidden" name="VIEWPAGE" value="VIEWPAGE">

<input type="hidden" name="sigu_cd" value="${board.SIGU_CD}">
<input type="hidden" name="buseo_cd" value="${board.DEPT_CD}">
<input type="hidden" name="semok_cd" value="${semok_cd}">
<input type="hidden" name="tax_ym" value="${tax_ym}">
<input type="hidden" name="tax_gubun" value="${tax_gubun}">
<input type="hidden" name="tax_no" value="${board.TAX_NO}">
<input type="hidden" name="user_id" value="${user_id}">
<input type="hidden" name="bukwa_id" value="${bukwa_id}">

<table width="780" border="0" cellpadding="0" cellspacing="0">

	  <tr>
		<td align="left" class="contborder_blue">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
			  <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">

				<tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">과세번호</td>
					<td width="37%" bgcolor="eaeaea" class="table_bl_left">${board.TAX_NO}</td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">과세구분</td>
					<td bgcolor="eaeaea" class="table_bl_left">${TAX_SET}</td>
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
				
				<tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">납기후금액</td>
					<td width="181" bgcolor="eaeaea" class="table_bl_left">${board.OVERTAX} 원</td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">납기후일자</td>
					<td bgcolor="eaeaea" class="table_bl_left">${board.OVERDATE}</td>
				</tr>
				
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
	<!-- 
		        <td width="17%" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">본세</td>
		        <td width="12%" align="center" bgcolor="e5eff8" class="sub_table_b">시세</td>
		        <td width="12%" align="center" bgcolor="e5eff8" class="sub_table_b">구세</td>
		        <td width="17%" align="center" bgcolor="e5eff8" class="sub_table_b">부가가치세</td>
		        <td width="17%" align="center" bgcolor="e5eff8" class="sub_table_b">납기내금액</td>
		        <td width="17%" align="center" bgcolor="e5eff8" class="sub_table_b">납기후금액</td>
		         -->
		        <td width="25%" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">본세</td>
		        <td width="25%" align="center" bgcolor="e5eff8" class="sub_table_b">부가가치세</td>
		        <td width="25%" align="center" bgcolor="e5eff8" class="sub_table_b">납기내금액</td>
		        <td width="25%" align="center" bgcolor="e5eff8" class="sub_table_b">납기후금액</td>
		    </tr>
		    
			<tr>
				<!-- 
				<td height="26" align="center">${board.BONSE}</td>
				<td align="center">${board.SISE}</td>
				<td align="center">${board.GUSE}</td>
				<td align="center">${board.VAT}</td>
				<td align="center">${board.INTAX}</td>
				<td align="center">${board.OVERTAX}</td>
				 -->
 				<td height="26" align="center">${board.BONSE}</td>
				<td align="center">${board.VAT}</td>
				<td align="center">${board.INTAX}</td>
				<td align="center">${board.OVERTAX}</td>
             </tr>
			</table></td>
		</tr>

			<tr>
			  <td height="40" align="right">
			  <table width="0" border="0" cellspacing="0" cellpadding="0" align="right">
			  <tr><td>
			  <a href="javascript:Modify();"><img src="/img/mod_icon.gif" alt="수정" width="56" height="18" border="0"></a>
			  </td></tr>
			  </table>
			  </td>
			</tr>
			
			
		</table></td>
	  </tr>

</table>
</form>
</body>
</html>