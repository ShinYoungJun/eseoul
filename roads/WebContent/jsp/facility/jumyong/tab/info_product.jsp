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
  
<script><!--

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
		var date_type = document.getElementById("date_type").value;
//		var dateCount = 0;
		if(fromDate>toDate){
			alert("시작날짜 종료날짜보다 더늦게 설정 할 수 없습니다.");
			document.getElementById("FROMDATE").value="";
			document.getElementById("TODATE").value="";
			return;
		}
		if(date_type == "month"){
		var period = getDiffMon(fromDate,toDate)  ;
		}else{
		var period = getDiffDay(fromDate,toDate)  ;
		}		
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

	/*
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
	}*/

	function getDiffDay(val1, val2){	//날짜 일수 계산
		var sdate_year = Number(val1.substr(0,4));
		var sdate_month = Number(val1.substr(4,2));
		var sdate_day = Number(val1.substr(6,2));
		var edate_year = Number(val2.substr(0,4));
		var edate_month = Number(val2.substr(4,2));
		var edate_day = Number(val2.substr(6,2));

		var year_result = edate_year-sdate_year;
		
		var tot = 0;
		
		tot += year_result*365;		//년도 차이 일수 계산
		
		tot += -day_cal(sdate_year, sdate_month, sdate_day)+1;		//시작 날짜 일수 계산
		tot += day_cal(edate_year, edate_month, edate_day);			//종료 날짜 일수 계산
		
		return tot;
	}

	function day_cal(yy, mm, dd){	//해당년도만의 일수 계산

		var tot = 0;
		for(var i=1;i<mm;i++){
			tot += f_dayofmonth(yy,i);
		}
		return tot+dd;
	}

	function f_dayofmonth(yy,mm)
	{
		switch (mm){
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				return 31;
			case 4: case 6: case 9: case 11:
				return 30;
			case 2:
				return 28 + f_leapyear(yy);
		}
	}
	
	function f_leapyear(yy)		//윤년 구하는 함수
	{
		if (yy%4==0 && yy%100!=0 || yy%400==0)
		return 1;
		else
		return 0;
	}

	function getDiffMon(val1,val2)
	{   
		// 날짜 입력 형식 : yyyy-mm-dd
	    var sdate_year = Number(val1.substr(0,4));
	    var sdate_month = Number(val1.substr(4,2));
	    var sdate_day = Number(val1.substr(6,2));
	    var edate_year = Number(val2.substr(0,4));
	    var edate_month = Number(val2.substr(4,2));
	    var edate_day = Number(val2.substr(6,2));
	    
	    var year = edate_year - sdate_year;			//년차이를 계산하고
	    var month = edate_month - sdate_month -1;	//달차이를 계산하고  

	    var month_count = 0;
	    
	    if(sdate_day <= edate_day){					
	    	if(sdate_day>=30 && edate_day>=30 && sdate_month!=edate_month){		// 예시) 8월31일 시작 9월 30일 종료 일때 달수 +1 증가
	    		month_count++;
	    	}else{		//시작일자가 종료일자보다 작으면 달수 +1 증가
	    		month_count++;
	    	}
	    	
	    }
	    
	    if(sdate_month==2 && edate_month==2 && sdate_day<edate_day && sdate_day==1){	// 2월이 좀 특수한 관계로 2월1일부터 2월 말일 일때 달계산
	    																				// 시작일자가 1이고 
	    	if ((edate_year % 4 == 0 && edate_year % 100 != 0) || edate_year % 400 == 0){	//윤달 여부에 관련해서 
	    		if(edate_day==29)		//윤달이면 마지막 날짜가 29일일때 달수 +1 증가
	    			month_count++;
	    	}else{
	    		if(edate_day==28)		//윤달이 아니면 마지막 날짜가 28일때 +1증가
	    			month_count++;
	    	}		
	    }
	    
	    if(sdate_month==edate_month && sdate_day==1 && edate_day>=30){	// 각달의 1일부터 말일 일때 달수 +1 증가
	    	month_count++;
	    }
	    
	    if(sdate_day==1 && edate_day>=30 && sdate_month!=edate_month){		// 시작일자가 1일이고 끝나는 날짜가 30일 이상이면 달수 +1 증가
	    	month_count++;
	    }
	    
	    month_count = month_count + (year*12) + month;	//최종적으로 달수 계산
	    
	    return month_count;
	}

	function Calculate()
	{
		if(document.getElementById("RATE").value=="" || document.getElementById("RATE").value=="0" || document.getElementById("RATE").value=="0.0"){
			alert("산출단가를 넣어주세요.");
			document.getElementById("RATE").focus();
			return;
		}
		
		if(document.getElementById("FROMDATE").value==""){
			alert("산출시작 날짜을 넣어주세요.");
			document.getElementById("FROMDATE").focus();
			return;
		}
		if(document.getElementById("TODATE").value==""){
			alert("산출종료 날짜을 넣어주세요.");
			document.getElementById("TODATE").focus();
			return;
		}
		if(document.getElementById("FROMDATE").value> document.getElementById("TODATE").value){
			alert("산출시작 날짜는 산출종료 날짜보다 늦게 설정할수 없습니다.");
			document.getElementById("FROMDATE").value="";
			document.getElementById("TODATE").value="";
			return;
		}
		
		if(document.getElementById("period").value=="" || document.getElementById("period").value=="0"){
			alert("개월수를 설정해 주세요");			
			return;
		}
		calDate();

		var date_type = document.getElementById("date_type").value;
		var quantity = document.getElementById("QUANTITY").value;
		var depth_rate = document.getElementById("DEPTH_NUM").value;
		var rate = document.getElementById("RATE").value;
		var period = document.getElementById("period").value;
		var form_adjust = document.getElementById("FORM_ADJUST").value;		
		var sum_adjust = document.getElementById("SUM_ADJUST").value;

		if(date_type=="month"){
		document.getElementById("SUM_ADJUST").value = Math.floor(Number(quantity) * (100-Number(depth_rate))/100*Number(rate)*Number(period)/12);
		document.getElementById("FORM_ADJUST").value = quantity+ " * " + " (100-"+Number(depth_rate)+" )/100*"+ Number(rate)+" * "+ Number(period)+" /12 ";
		}else{
			document.getElementById("SUM_ADJUST").value = Math.floor(Number(quantity) * (100-Number(depth_rate))/100*Number(rate)*Number(period)/365);
			document.getElementById("FORM_ADJUST").value = quantity+ " * " + " (100-"+Number(depth_rate)+" )/100*"+ Number(rate)+" * "+ Number(period)+" /365 ";	
		}
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

	function goviewer(object_no , tax_set)
	{
		var gu_code= document.getElementById("gu_code").value;
		var corp_cd = document.getElementById("corp_cd").value;
		var admin_no = document.getElementById("admin_no").value;
		var currentPage= document.getElementById("currentPage").value;
		
		var year = "${year}";

		location.href="/facility/jumyong/product_view.do?GU_CODE="+gu_code+"&CORP_CD="+corp_cd
		+"&ADMIN_NO="+admin_no+"&currentPage="+currentPage+"&OBJECT_NO="+object_no+"&YEAR="+year+"&TAX_SET="+tax_set;
	}

	function submitClick()
	{
		// 직접산출시  널체크
		if( '${direct}' == 'direct' ){
			if(document.getElementById("RATE").value=="" || document.getElementById("RATE").value=="0" || document.getElementById("RATE").value=="0.0"){
				alert("산출단가를 넣어주세요.");
				document.getElementById("RATE").focus();
				return;
			}
			if(document.getElementById("FROMDATE").value==""){
				alert("산출시작 날짜을 넣어주세요.");
				document.getElementById("FROMDATE").focus();
				return;
			}
			if(document.getElementById("TODATE").value==""){
				alert("산출종료 날짜을 넣어주세요.");
				document.getElementById("TODATE").focus();
				return;
			}
			if(document.getElementById("FROMDATE").value> document.getElementById("TODATE").value){
				alert("산출시작 날짜는 산출종료 날짜보다 늦게 설정할수 없습니다.");
				document.getElementById("FROMDATE").value="";
				document.getElementById("TODATE").value="";
				return;
			}
			if(document.getElementById("period").value=="" || document.getElementById("period").value=="0"){
				alert("개월수를 설정해 주세요");			
				return;
			}
			if(document.getElementById("FORM_ADJUST").value==""){
				alert("일반산출식을  넣어주세요.");
				return;
			}
			if(document.getElementById("SUM_ADJUST").value=="" || document.getElementById("SUM_ADJUST").value=="" || document.getElementById("SUM_ADJUST").value=="0"){
				alert("일반 점용료를  넣어주세요.");
				return;
			}
		}
		else{
			if(document.getElementById("SUM_ADJUST").value=="0" || document.getElementById("SUM_ADJUST").value=="" || document.getElementById("SUM_ADJUST").value==" "){
				alert("계산을 하셔야 저장이 가능합니다.");
				return;
			}
		}
		var productForm = document.productForm;

		productForm.submit();
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

	
	function Page(page)
	{
		if(page	==	"")
			return;
		
		//var form = document.productForm;
		var gu_code = document.productForm.gu_code.value;
		var corp_cd = document.productForm.corp_cd.value;
		var admin_no = document.productForm.admin_no.value;
		//var object_no = document.productForm.object_no.value;
		//var tax_set = document.productForm.tax_set.value;
		//var seq = document.productForm.seq.value;
		//var mode = document.productForm.mode.value;
		//var direct = document.productForm.direct.value;
		//	/facility/jumyong/productInsert.do
		//alert('corp_cd' + request_no);
		//alert(request_no);
		location.href = "/facility/jumyong/productInsert.do?currentPage="+page+"&GU_CODE="+gu_code+"&CORP_CD="+corp_cd
			+"&ADMIN_NO="+admin_no;

	}	
	
		function IlgwalCalculate(){
			
				var gu_code = document.productForm.gu_code.value;
				var corp_cd = document.productForm.corp_cd.value;
				var admin_no = document.productForm.admin_no.value;
				var year = document.productForm.YEAR.value;
				
				
				location.href="/facility/jumyong/productIlgwalInsert.do?GU_CODE="+gu_code+"&CORP_CD="+corp_cd+"&ADMIN_NO="+admin_no+"&YEAR="+year;
		}

	
--></script>

</head>

<body onload="javascript:InitPage();"  border="0">

<form name="productForm" id="productForm" method="post" action = "/facility/jumyong/productInsert.do" >
<spring:bind path="product.GU_CODE">
	<input type="hidden" NAME="GU_CODE" ID="gu_code" value="${gu_code}">
</spring:bind>
<spring:bind path="product.CORP_CD">
	<input type="hidden" NAME="CORP_CD" ID="corp_cd" value="${corp_cd}">
</spring:bind>
<spring:bind path="product.ADMIN_NO">
	<input type="hidden" NAME="ADMIN_NO" ID="admin_no" value="${admin_no}">
</spring:bind>
<spring:bind path="product.OBJECT_NO">
	<input type="hidden" NAME="OBJECT_NO" ID="object_no" value="${object_no}">
</spring:bind>
<spring:bind path="product.TAX_SET">
	<input type="hidden" NAME="TAX_SET" ID="TAX_SET" value="${product.TAX_SET}">
</spring:bind>
<spring:bind path="product.SEQ">
	<input type="hidden" NAME="SEQ" ID="SEQ" value="${product.SEQ}">
</spring:bind>


<input type="hidden" NAME="currentPage" ID="currentPage" value="${currentPage}" >
<input type="hidden" NAME="mode" ID="mode" value="${mode}">
<input type="hidden" NAME="direct" ID="direct" value="${direct}">
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
			                    <c:choose>
									<c:when test="${calSumList!= null && !empty calSumList}">
										<c:forEach items="${calSumList}" var="board" varStatus="idx">
											<tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" >
												<td align="center">${board.YEAR}</td>
												<td height="28" align="center">${board.TAX_SET_NAME}</td>
												<td align="center">${board.SUM_ADJUST_WON }원</td>
												<td align="center">${board.SUM_WON }원</td>					
												<td height="28" align="center">${board.REDUCTION_RATE}%</td>															
											</tr> 
										</c:forEach>
									</c:when>
								<c:otherwise>
									<tr>
										<td align="center" class="sub_table" colspan="5" height="85">검색된 내용이 없습니다</td>
									</tr>
								</c:otherwise>
							 </c:choose>
							</table>
						</td>
					</tr>
					<tr>
						<td height="40" align="left"><table width="100%" border="0" cellspacing="0" cellpadding="0">
						<br><br>
						</td>
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
				                    <td align="center" bgcolor="e5eff8" class="sub_table_b">세입구분</td>
				                    <td align="center" bgcolor="e5eff8" class="sub_table_b">산출여부 </td>				                    
			                    </tr>
			                    <c:choose>
									<c:when test="${placeList!= null && !empty placeList}">
										<c:forEach items="${placeList}" var="board" varStatus="idx">
											<tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" 
											onclick="javascript:goviewer('${board.OBJECT_NO}','${board.TAX_SET }');" style="cursor:pointer" >
												<td height="26" align="center">${idx.count}</td>
												<td height="26" align="center">${board.YEAR}</td>										
												<td align="center">${board.SORT_NM} ${board.KIND_NM}</td>										
												<td align="center">
												  <c:if test="${board.SEBU_NM == null}"> - </c:if>	
									              <c:if test="${board.SEBU_NM != null}">${board.SEBU_NM}</c:if>	
												</td>										
												<td align="center">${board.SUM_ADJUST_WON} 원</td>										
												<td align="center">${board.QUANTITY}</td>
												<td align="center">${board.DEPTH_NUM}%</td>
												<td align="center">${board.TAX_SET_NAME}</td>
												<td align="center"><font color='red'>${board.CAL_STATUS_NAME}</font></td>										
											</tr>
										</c:forEach>
									</c:when>
									<c:otherwise>
										<tr>
											<td align="center" class="sub_table" colspan="5" height="85">검색된 내용이 없습니다</td>
										</tr>
									</c:otherwise>
								 </c:choose>
							</table>
						</td>
					</tr>
					<tr>
						<td height="40" align="center"><table width="100%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td align="center"><table border="0" cellpadding="0" cellspacing="0">
							    	<tr>${pageing}</tr>
							    	</table>
							    </td>
		                    </tr></table>
		                </td>
					</tr>
					<tr>
						<td class="sub_table_b"> ※ 점용료 산출
						</td></tr>
					<tr>
						<td>
							<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
								<tr>
									<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">기준 년도</td>
								    <td width="40%" bgcolor="eaeaea" class="table_bl_left" >
									    	<spring:bind path="product.YEAR">
									    	  <input name="YEAR" id="YEAR" type="text" class="input_form1" style="width:50px;ime-mode:disabled;" value="${product.YEAR}"   onKeyDown="onlyNumberInput();" style="text-align:right" >년
											</spring:bind>
								
									</td> 
									<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">연장 수량</td>
								    <td width="40%" bgcolor="eaeaea" class="table_bl_left" >
									    <spring:bind path="product.QUANTITY">
									    	${product.QUANTITY}
										    <input name="QUANTITY" id="QUANTITY" type="hidden" class="input_form1" style="width:50px;ime-mode:disabled;" value="${product.QUANTITY}"   onKeyDown="onlyNumberInput();" style="text-align:right" >개/m
										</spring:bind>
									</td> 
							    </tr>						   
							     	<tr>
								    <td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b" >산출단가</td>
								    <td width="42%" bgcolor="eaeaea" class="table_bl_left" >
									    <spring:bind path="product.RATE">
											<input name="RATE" id="RATE" type="text" class="input_form1" style="width:50px;ime-mode:disabled;" value="${product.RATE}"   onKeyDown="onlyNumberInput();" style="text-align:right"  >원
										</spring:bind>
									</td>
									<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">심도 감액율</td>
								    <td width="26%" bgcolor="eaeaea" class="table_bl_left" >
									    <spring:bind path="product.DEPTH_NUM">                    								    
											<input name="DEPTH_NUM" id="DEPTH_NUM" type="text" class="input_form1" style="width:50px;ime-mode:disabled;" value="${depth_num}"   onKeyDown="onlyNumberInput();" style="text-align:right"  >%
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
				                    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">
				                    	 <select id="date_type" class="input_form1" onchange="javascript:calDate();">
                            				<option value="month">개월</option>
                            				<option value="day">일</option>
                        				</select>수
				                    </td>
				                    <td bgcolor="eaeaea" class="table_bl_left" >
									    <spring:bind path="product.PERIOD">
											<input name="PERIOD" id="period" type="text" class="input_form1" style="width:50px;ime-mode:disabled;" value="${product.PERIOD}"   onKeyDown="onlyNumberInput();" style="text-align:right"  >개월/일
										</spring:bind>
									</td>
								</tr>
							   <tr>
									<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">일반 산출식</td>
							        <td bgcolor="eaeaea" class="table_bl_left" >
									    <spring:bind path="product.FORM_ADJUST">							        
											<input name="FORM_ADJUST" id="FORM_ADJUST" type="text" class="input_form1" style="width:250px;ime-mode:disabled;" value="${product.FORM_ADJUST}"   >
										</spring:bind>
									</td> 
									<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">일반 점용료</td>
							        <td bgcolor="eaeaea" class="table_bl_left" >
									    <spring:bind path="product.SUM_ADJUST">
											<input name="SUM_ADJUST" id="SUM_ADJUST" type="text" class="input_form1" style="width:50px;ime-mode:disabled;" value="${product.SUM_ADJUST}"  style="text-align:right" >
										</spring:bind>
									</td> 
								</tr> 
							</table></td>
					</tr>
					  <!-- 간접산출일때만 계산하도록 start -->
					  <c:if test="${direct != 'direct'}">
					  <tr>              
		                <td height="40" align="right">
							<!--  //********** BEGIN_KANG_20120416 -->
							<!-- 
							일괄<img src="/img/accou_icon.gif" alt="일괄계산" width="56" height="18" border="0" onclick="javascript:IlgwalCalculate();" style="cursor:pointer">
							-->
							<img src="/img/batch_calculation.gif" alt="일괄계산" width="66" height="18" border="0" onclick="javascript:IlgwalCalculate();" style="cursor:pointer">
							<!--   //********** END_KANG_20120416 -->		                
		                	<img src="/img/accou_icon.gif" alt="계산" width="56" height="18" border="0" onclick="javascript:Calculate();" style="cursor:pointer">
			            </td>
		              </tr>
		              </c:if>
		              <!-- 간접산출일때만 계산하도록 end -->
					<tr>              
						<td height="40" align="right">
							<table border="0" width="100%">
								<tr>              
					                <td height="40" align="right">
				                	<img src="/img/can_icon.gif" alt="취소" border="0" onclick="javascript:history.back();" style="cursor:pointer" >
					                <img src="/img/save_icon2.gif" alt="저장" width="56" height="18" border="0" onClick="javascript:submitClick();"  style="cursor:pointer">
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

