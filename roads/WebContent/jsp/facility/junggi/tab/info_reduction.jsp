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
<form name="reductionForm" id="reductionForm" method="post" action = "/facility/junggi/reduction.do" >
<table width="100%" border="0"  cellpadding="0" cellspacing="0"  class="sub_table">
	<tr>
    	<td width="10%" height="26" align="left"  class="sub_table_b"><img src="/img/facility_view2.gif" alt="감면적용">
    	<input name="mode" id="mode" type="hidden" value="${mode}"><input name="cal_sum_seq" id="cal_sum_seq" type="hidden" value="${cal_sum_seq}">
    	</td>		
    </tr>
</table>	

<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
	<tr>
    	<td width="10%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">감면율</td>
        	<td width="10%" bgcolor="eaeaea" class="table_bl_left" >
            	<spring:bind path="product.REDUCTION_RATE">
					<input name="REDUCTION_RATE" ID="REDUCTION_RATE" value="${product.REDUCTION_RATE}" type="text" class="input_form1" style="width:30px;ime-mode:disabled;text-align:right;">%
				</spring:bind>
		</td>                     
		<td width="10%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">감면사유</td>
              	<td width="70%" bgcolor="eaeaea" class="table_bl_left" >
			<spring:bind path="product.REDUCTION_REASON">
                 	<input name="REDUCTION_REASON" ID="REDUCTION_REASON" value="${product.REDUCTION_REASON}"  type="text" class="input_form1" style="width:480px;"  >
 	             	</spring:bind>
		</td> 
    </tr>
    
	</table>							
	<table align="right">
			<tr> 
			<td height="40" >
				<img src="/img/save_icon2.gif" alt="저장" width="56" height="18" border="0" onClick="javascript:submitClick();" style="cursor:pointer" >
			</td>
		</tr>
	
	</table>
</form>
</body>
</html>            
