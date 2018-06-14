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
	background-image: url(/img/left_back.gif);
}
-->
</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
<script language="javascript" src="/js/PopupCalendar.js"></script> 
<script>
<!--	

	function InitPage()
	{

	}
	
		//공시지가 팝업
	function openLandPricePopUp()
	{
		var winW = 320;
		var winH = 133;
		var status ="toolbar=no, location=no, directories=no, status=no, menubar=no, resizable=no, scrollbars=no, width="+winW+", height="+winH+", left=0, top=0"
		window.open('/jsp/jumyong/jumyong/officialLandPrice.html', 'win', status);	
	}
	
	function calDate()
	{
		
		var fromDate = removeDash(document.getElementById("FROMDATE").value);
		var toDate = removeDash(document.getElementById("TODATE").value);
//		var dateCount = 0;
		
		var period = getDiffMon(fromDate,toDate)  ;
			
		document.getElementById("period").value = period;
		
		var fromDay1 = new Date(fromDate.substr(0,4),Number(fromDate.substr(4,2))-1,fromDate.substr(6,2))
		
		var toDay1 = new Date(toDate.substr(0,4),Number(toDate.substr(4,2))-1,toDate.substr(6,2))		
		
//		var dateCount =(toDay1 - fromDay1)/(1000*3600*24)+1;  
		
//		document.getElementById("dateCount").value = dateCount;
	}	
	
	// 대쉬 삭제
	function removeDash(numValue)
	{
		return numValue.split('-').join("");
	}
	
		//달 차이 계산
	function getDiffMon(val1,val2)
	{
	
	    var sdate = new Date(Number(val1.substr(0,4)),Number(val1.substr(4,2))-1,Number(val1.substr(6,2)));
	    var edate = new Date(Number(val2.substr(0,4)),Number(val2.substr(4,2))-1,Number(val2.substr(6,2)));
	    
	   
	
	    var sDate  = sdate.getDate();     	
	    var count=0;
	    
	    edate.setDate(edate.getDate()+1);
	    
//	     alert(sdate+"   "+edate);
	    
	    while (Date.parse(edate)>=Date.parse(sdate)) {
	        if(sdate.getDate() == sDate){ //해당 요일과 같다면...
	          count++;
	        }
	      sdate.setDate(sdate.getDate()+1); //요일을 계속 증가
	    }
	    return count-1;
	}
	
	function Calculate()
	{
		calDate();
		var quantity = document.getElementById("QUANTITY").value;
		var depth_rate = document.getElementById("DEPTH_RATE").value;
		var rate = document.getElementById("RATE").value;
		var period = document.getElementById("PERIOD").value;
		var form_adjust = document.getElementById("FORM_ADJUST").value;
		var sum_adjust = document.getElementById("SUM_ADJUST").value;
		
		document.getElementById("SUM_ADJUST").value = Math.floor(Number(quantity) * (100-Number(depth_rate))/100*Number(rate)*Number(period)/12*-1);
		
		document.getElementById("FORM_ADJUST").value = quantity+ " * " + " (100-"+Number(depth_rate)+" )/100*"+ Number(rate)+" * "+ Number(period)+" /12 * -1";

	}
	
	
	

	function goview(object_no)
		{
			var gu_code= document.getElementById("gu_code").value;
			var corp_cd = document.getElementById("corp_cd").value;
			var request_no= document.getElementById("request_no").value;
	
			var currentPage= document.getElementById("currentPage").value;
			
			var year = "${year}";
	
			location.href="/facility/jumyong/product_view.do?GU_CODE="+gu_code+"&CORP_CD="+corp_cd
			+"&REQUEST_NO="+request_no+"&currentPage="+currentPage+"&OBJECT_NO="+object_no+"&YEAR="+year;
		}

	//숫자만 입력
	function onlyNumberInput()
	{
	 var code = window.event.keyCode;
	
	 if ((code > 34 && code < 41) || (code > 47 && code < 58) || (code > 95 && code < 106) || code == 8 || code == 9 || code == 13 || code == 46 || code == 190 || code == 110)
	 {
	  	window.event.returnValue = true;
		return;
	 }else 
	 {	 
	 	window.event.returnValue = false;
	 	return;
 	 }
	}
		function fn_addComma(chknum){
        num = chknum.value;
        num = num.split(',').join('');
        var arr = num.split('.');
        var num = new Array();
        for (i = 0; i <= arr[0].length-1; i++) {
            num[i] = arr[0].substr(arr[0].length-1-i,1);
        if(i%3 == 0 && i != 0) num[i] += ',';
        }
        num = num.reverse().join('');
        if (!arr[1]) chknum.value = num; else chknum.value = num+'.'+arr[1];

	} 

	function submitClick()
	{
		var productForm = document.productForm;

		productForm.submit();
	}
	
	
	-->
	
	
	
</script>

</head>

<body onload="javascript:InitPage();"  border="0">

<form name="productForm" id="productForm" method="post" action = "/facility/jumyong/productSubBeforeTax.do" >
<spring:bind path="product.GU_CODE">                    
	<input type="hidden" NAME="GU_CODE" ID="gu_code" value="${gu_code}" >
</spring:bind>
<spring:bind path="product.CORP_CD">                    
	<input type="hidden" NAME="CORP_CD" ID="corp_cd" value="${corp_cd}" >
</spring:bind>
<spring:bind path="product.REQUEST_NO">                    
	<input type="hidden" NAME="REQUEST_NO" ID="request_no" value="${request_no}" >
</spring:bind>
<spring:bind path="product.OBJECT_NO">                    
	<input type="hidden" NAME="OBJECT_NO" ID="OBJECT_NO" value="${object_no}" >
</spring:bind>
<spring:bind path="product.TAX_SET">
	<input type="hidden" NAME="TAX_SET" ID="TAX_SET" value="${product.TAX_SET}" >
</spring:bind>
<spring:bind path="product.SEQ">
	<input type="hidden" NAME="SEQ" ID="SEQ" value="${product.SEQ}" >
</spring:bind>




<input type="hidden" NAME="currentPage" ID="currentPage" value="${currentPage}" >
<input type="hidden" NAME="mode" ID="mode" value="${mode}" >
	<table width="780" border="0" cellspacing="0" cellpadding="0">
		<tr>
			<td class="contborder_purple">							            
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td>
							<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
								<tr>
				                    <td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">년도</td>								
				                    <td align="center" bgcolor="e5eff8" class="sub_table_b">세입구분</td>

				                    <td align="center" bgcolor="e5eff8" class="sub_table_b">일반 점용료 </td>
				                    <td align="center" bgcolor="e5eff8" class="sub_table_b">부과 점용료(감면적용)</td>			
				                    <td align="center" bgcolor="e5eff8" class="sub_table_b">감면율</td>				                    	                    
			                    </tr>
								<c:forEach items="${calSumList}" var="board" varStatus="idx">
									<tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" >
										<td align="center">${board.YEAR}</td>
										<td height="28" align="center">${board.TAX_SET_NAME}</td>
										<td align="center">${board.SUM_ADJUST }</td>
										<td align="center">${board.SUM }</td>					
										<td height="28" align="center">${board.REDUCTION_RATE}%</td>															
									</tr> 
								</c:forEach>
							</table></td>
					</tr>
					<tr>
						<td height="40" align="center"><table width="100%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td align="center"><table border="0" cellpadding="0" cellspacing="0">
							    	<tr>${strPageDivideForm}</tr></table></td>
	
		                    </tr></table></td>
					</tr>
					<tr>
						<td>
							<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
								<tr>
				                    <td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">번호</td>
				                    <td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">&nbsp년도&nbsp</td>				                    
				                    <td  align="center" bgcolor="e5eff8" class="sub_table_b">점용목적</td>
				                    <td  align="center" bgcolor="e5eff8" class="sub_table_b">상세</br>시설물</td>				                    
				                    <td align="center" bgcolor="e5eff8" class="sub_table_b">일반 점용료</td>				                    				                    				                    
				                    <td align="center" bgcolor="e5eff8" class="sub_table_b">연장</br>(수량)</td>

				                    <td align="center" bgcolor="e5eff8" class="sub_table_b">심도</br>감액율</td>				                    

				                    <td align="center" bgcolor="e5eff8" class="sub_table_b">세입구분 </td>
				                    <td align="center" bgcolor="e5eff8" class="sub_table_b">산출여부 </td>				                    
			                    </tr>
								<c:forEach items="${placeList}" var="board" varStatus="idx">
									<tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" 
									onclick="javascript:goview('${board.OBJECT_NO}');" style="cursor:pointer" >
										<td height="26" align="center">${idx.count}</td>
										<td height="26" align="center">${board.YEAR}</td>										
										<td align="center">${board.SORT_NM} ${board.KIND_NM}</td>										
										<td align="center">
										  <c:if test="${board.SEBU_NM == null}"> - </c:if>	
							              <c:if test="${board.SEBU_NM != null}">${board.SEBU_NM}</c:if>	
										</td>										
										<td align="center">${board.SUM_ADJUST} 원</td>										

										<td align="center">${board.QUANTITY}</td>

										<td align="center">${board.DEPTH_RATE}%</td>

										<td align="center">${board.TAX_SET_NAME}</td>
										<td align="center"><font color='red'>${board.CAL_STATUS_NAME}</font></td>										
									</tr>
								</c:forEach>
							</table></td>
					</tr>
					<tr>
						<td height="40" align="center"><table width="100%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td align="center"><table border="0" cellpadding="0" cellspacing="0">
							    	<tr>${strPageDivideForm}</tr></table></td>
	
		                    </tr></table></td>
					</tr>
					<tr>
						<td class="sub_table_b"> ※ 점용료 산출
						</td></tr>
					<tr>
						<td>
							<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
								<tr>
								
								
									<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">수량</td>
								    <td width="40%" bgcolor="eaeaea" class="table_bl_left" >
									    <spring:bind path="product.QUANTITY">                    
										    <input name="QUANTITY" id="QUANTITY" type="text" class="input_form1" style="width:50px;ime-mode:disabled;" value="${product.QUANTITY}"   onKeyDown="onlyNumberInput();" style="text-align:right" >개/m
										</spring:bind>
									</td> 
									<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">감액율</td>
								    <td width="26%" bgcolor="eaeaea" class="table_bl_left" >
									    <spring:bind path="product.DEPTH_RATE">                    								    
											<input name="DEPTH_RATE" id="DEPTH_RATE" type="text" class="input_form1" style="width:50px;ime-mode:disabled;" value="${product.DEPTH_RATE}"   onKeyDown="onlyNumberInput();" style="text-align:right"  >%								    
										</spring:bind>
									</td> 
							    </tr>						   
							     	<tr>
								    <td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b" >산출단가</td>
								    <td width="42%" bgcolor="eaeaea" class="table_bl_left" colspan="3">
									    <spring:bind path="product.RATE">
											<input name="RATE" id="RATE" type="text" class="input_form1" style="width:50px;ime-mode:disabled;" value="${product.RATE}"   onKeyDown="onlyNumberInput();" style="text-align:right"  >원
										</spring:bind>
									</td>
							    </tr>
								<tr>
				                    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">산출기간</td>
				                    <td bgcolor="eaeaea" class="table_bl_left" ><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					                        <tr>
					                          <td>
												    <spring:bind path="product.FROMDATE">
						                          		<input name="FROMDATE" id="FROMDATE" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value="${product.FROMDATE}"  onKeyDown="onlyNumberInput();"   onKeyDown="onlyNumberInput();" maxlength=8>
						                          	</spring:bind>
					                          </td>
					                          <td>
					                          <img src="/img/calendar_icon.gif" onclick="popUpCalendar(this, document.getElementById('FROMDATE'), 'yyyymmdd');" style="cursor:pointer" >
					                          
					                          </td>
					                          
					                          
					                          
					                          <td width="16" align="center">~</td>
					                          <td>
												    <spring:bind path="product.TODATE">
							                          	<input name="TODATE" id="TODATE" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value="${product.TODATE}"  onKeyDown="onlyNumberInput();" maxlength=8>
						                          	</spring:bind>

					                          </td>
					                          <td>
					                     		<img src="/img/calendar_icon.gif" onclick="popUpCalendar(this, document.getElementById('TODATE'), 'yyyymmdd');" style="cursor:pointer" >
					                     		
					                     													<img src="/img/cal_month.gif" alt="달수계산" height="18" border="0" style="cursor:pointer" onClick="javascript:calDate();">
					                     		
					                          </td>
					                        </tr>
					                    </table></td>  
				                    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">개월수</td>
				                    <td bgcolor="eaeaea" class="table_bl_left" >
									    <spring:bind path="product.PERIOD">
											<input name="PERIOD" id="PERIOD" type="text" class="input_form1" style="width:50px;ime-mode:disabled;" value="${product.PERIOD}"   onKeyDown="onlyNumberInput();" style="text-align:right"  >개월
										</spring:bind>
									</td>
								</tr>
							   <tr>
									<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">조정 산출식</td>
							        <td bgcolor="eaeaea" class="table_bl_left" >
									    <spring:bind path="product.FORM_ADJUST">							        
											<input name="FORM_ADJUST" id="FORM_ADJUST" type="text" class="input_form1" style="width:250px;ime-mode:disabled;" value="${product.FORM_ADJUST}"   >
										</spring:bind>
									</td> 
									<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">조정 점용료</td>
							        <td bgcolor="eaeaea" class="table_bl_left" >
									    <spring:bind path="product.SUM_ADJUST">
											<input name="SUM_ADJUST" id="SUM_ADJUST" type="text" class="input_form1" style="width:50px;ime-mode:disabled;" value="${product.SUM_ADJUST}"  style="text-align:right" >
										</spring:bind>
									</td> 
								</tr> 
							</table></td>
					</tr>
					  <tr>              
					                <td height="40" align="right">
					                
					                <img src="/img/accou_icon.gif" alt="계산" width="56" height="18" border="0" onclick="javascript:Calculate();" style="cursor:pointer">
						                </td>
					              </tr>
					
					
					
					<tr>              
						<td height="40" align="right">
							<table border="0" width="100%">
								<tr>              
					                <td height="40" align="right">
				                	<img src="/img/can_icon.gif" alt="취소" border="0" onclick="javascript:history.back();" style="cursor:pointer" >
					                <img src="/img/save_icon2.gif" alt="저장" width="56" height="18" border="0"
						                onClick="javascript:submitClick();"  style="cursor:pointer">
						                </td>
					            </tr>
								
							</table>
						</td>
					</tr>
				</table>
			</td>
		</tr>		          
	</table>
</form>



</body>
</html>

