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
                background-image: url(/img/left_back.gif);
            }
            -->
        </style>
        <link href="/css/roads.css" rel="stylesheet" type="text/css">
        <script type="text/javascript">
		<!--
		
			function gogo()
			{
				var tax_code = document.getElementById("TAX_CD").value;
				var w = document.form;
				w.action = "/jumyong/junggi/semokListTest.do?TAX_CD=" + tax_code;	
				w.submit();
			}
		-->	
	</script>
    </head>

    <body>
	<br/>
	<br/>
	<br/>
	<table align="left">
		<tr>
			<td>
				<form id="form" name="form"><span class="sub_table_b">테스트 TAX_CD :</span> <input type="text" id="TAX_CD" name="TAX_CD"/><input type="submit" value="전송" onclick="javascript:gogo();"/></form>			
			</td>
		</tr>
		<tr>
			<td>
				<table width="500px" border="1" bordercolor="#c9dfed"
									style="border-collapse:collapse;" cellpadding="0" cellspacing="0"
									class="sub_table">
					<tr>
						<td height="28" align="center" bgcolor="e5eff8"
											class="sub_table_b">sigu_cd </td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">buseo_cd </td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">semok_cd </td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">ocrBuseoCd </td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">ocrSiguCd </td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">suBuseoCd </td>				
					</tr>
					<c:forEach items="${semokList}" var="semokList" varStatus="idx">
						<tr>
							<td height="28">${semokList.sigu_cd }</td>
							<td>${semokList.buseo_cd }</td>
							<td>${semokList.semok_cd }</td>
							<td>${semokList.ocrBuseoCd }</td>
							<td>${semokList.ocrSiguCd }</td>
							<td>${semokList.suBuseoCd }</td>
						</tr>
					</c:forEach>			
				</table>
				
				<br/><br/>
				
				<table width="500px" border="1" bordercolor="#c9dfed"
									style="border-collapse:collapse;" cellpadding="0" cellspacing="0"
									class="sub_table">
					<tr>
						<td height="28" align="center" bgcolor="e5eff8"
											class="sub_table_b">sigu_cd </td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">buseo_cd </td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">semok_cd </td>				 
						<td align="center" bgcolor="e5eff8" class="sub_table_b">ocrBuseoCd </td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">ocrSiguCd </td>				
						<td align="center" bgcolor="e5eff8" class="sub_table_b">suBuseoCd </td>
					</tr>		
					<tr>
						<td height="28">${resultBean.sigu_cd }</td>
						<td>${resultBean.buseo_cd }</td>
						<td>${resultBean.semok_cd }</td>
						<td>${resultBean.ocrBuseoCd }</td>
						<td>${resultBean.ocrSiguCd }</td>
						<td>${resultBean.suBuseoCd }</td>
					</tr>
				</table>
		  	
			</td>
		</tr>
	</table>
	<br/>
	<br/>
		
    </body>
</html>
