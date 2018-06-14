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
<script>
<!--

	function InitPage()
	{
		var redirect = "${redirect}";
		
		if(redirect == "1")
		{
			parent.location.reload();
		}
	
	
	}

	function submitClick()
	{
		var reductionForm = document.reductionForm;
		
		
		document.getElementById("mode").value = "add";
		
		reductionForm.submit();
	}

	-->
</script>

</head>

<body onload="javascript:InitPage();"  border="0">
	<spring:bind path="product.SEQ">
      	<input name="SEQ" ID="SEQ" value="${product.SEQ}"  type="hidden"  >
  	</spring:bind>
<form name="reductionForm" id="reductionForm" method="post" action = "/jumyong/junggi/reduction.do" >
<input type="hidden" name="section" value="${section }">
<input name="ADMIN_NO" ID="ADMIN_NO" value="${product.ADMIN_NO}"  type="hidden">

<table width="100%" border="0"  cellpadding="0" cellspacing="0"  class="sub_table">
	<tr>
    	<!-- td width="10%" height="26" align="left"  class="sub_table_b">* ${cal_sum_seq}번 산출 감면 정보-->
    	<td width="10%" height="26" align="left"  class="sub_table_b">
    		<c:choose>
			<c:when test="${section != '3'}">
    			* 감면 정보
    		</c:when>
			<c:otherwise>
    			* 지분율 사항
   			</c:otherwise>
			</c:choose>
    	<input name="mode" id="mode" type="hidden" value="${mode}"><input name="cal_sum_seq" id="cal_sum_seq" type="hidden" value="${cal_sum_seq}">
    	</td>		
    </tr>
</table>	

<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
	<tr>
    	<td width="10%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">
    		<c:choose>
			<c:when test="${section != '3'}">
    			감면율
    		</c:when>
			<c:otherwise>
    			지분율
   			</c:otherwise>
			</c:choose>
			</td>
       	<td width="10%" bgcolor="eaeaea" class="table_bl_left" >
           	<spring:bind path="product.REDUCTION_RATE">
           	
           	<c:choose>
				<c:when test="${defineTax != 'true'}">
    				<input name="REDUCTION_RATE" ID="REDUCTION_RATE" value="${product.REDUCTION_RATE}" type="text" class="input_form1" style="width:30px;ime-mode:disabled;text-align:right;">%
				</c:when>
				<c:otherwise>
    				${product.REDUCTION_RATE} %
   				</c:otherwise>
			</c:choose>
           	
           	</spring:bind>
		</td>                     
		<td width="10%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">
			<c:choose>
			<c:when test="${section != '3'}">
    			감면사유
    		</c:when>
			<c:otherwise>
    			사유
   			</c:otherwise>
			</c:choose>
		</td>
        <td width="70%" bgcolor="eaeaea" class="table_bl_left" >
			<spring:bind path="product.REDUCTION_REASON">
           	<c:choose>
				<c:when test="${defineTax != 'true'}">
    	      		<input name="REDUCTION_REASON" ID="REDUCTION_REASON" value="${product.REDUCTION_REASON}"  type="text" class="input_form1" style="width:480px;"  maxlength="100">
      			</c:when>
				<c:otherwise>
    				${product.REDUCTION_REASON}
   				</c:otherwise>
			</c:choose>
           	</spring:bind>
		</td> 
    </tr>
    
	</table>
	
	<c:if test="${section != '4' and defineTax != 'true'}">
	<table align="right">
		<tr> 
			<td height="40" >
				<img src="/img/apply.gif" alt="적용" width="74" height="22" border="0" onClick="javascript:submitClick();" style="cursor:pointer" >
			</td>
		</tr>	
	</table>
	</c:if>
</form>
</body>
</html>            
