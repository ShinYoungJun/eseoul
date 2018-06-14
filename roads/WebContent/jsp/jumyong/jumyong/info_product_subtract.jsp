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
	background-image: url(/img/left_back.gif);
}
-->
</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
<script language="javascript" src="/js/PopupCalendar.js"></script> 
<script>
<!--	

	var savable = 0;

	function InitPage()
	{
		setParentYear('${product.YEAR}');
//		insertComma("PRICE_VIEW");	
//		insertComma("SUM_LASTYEAR_VIEW");
//		insertComma("SUM_YEAR_VIEW");
//		insertComma("SUM_ADJUST_VIEW");

		parent.document.getElementById("seq").value = document.getElementById("seq").value;
		
		insertComma("PRICE");
		insertComma("SUM_LASTYEAR");
		insertComma("SUM_YEAR");
		insertComma("SUM_ADJUST");
		
		if(document.getElementById("mode").value == "edit" || document.getElementById("mode").value == "add"  )
		{
			document.getElementById("view").style.display = "none";
						
			document.getElementById("edit").style.display= "block";
			document.getElementById("edit").style.pixelTop = 0;
/*			
			if(document.getElementById("mode").value == "add")
			{
				var date = new Date();
				var year = date.getFullYear();	
				document.getElementById("YEAR").value = year;
			}
			*/
			
		}else
		{
			document.getElementById("edit").style.display = "none";
			document.getElementById("view").style.display = "block";
		}
		
		document.getElementById("edit").style.display = "block";
		document.getElementById("view").style.display = "none";
	}


	function submitClick()
	{
		
		if(savable == 1)
		{
		var productForm = document.productForm;
		
		//comma제거

		removeComma2("PRICE");
		removeComma2("SUM_LASTYEAR");
		removeComma2("SUM_YEAR");
		removeComma2("SUM_ADJUST");
		
		alert("1");

		productForm.submit();
		}else
		alert("산출 내역을 먼저 계산해 주십시오.");
	}


	function subTabClick(hiddenSubTabName,visibleSubTabName)
	{	
		document.getElementById(hiddenSubTabName).style.display = 'none';	
		document.getElementById(visibleSubTabName).style.display = 'block';	
	}

	function goModify()
	{
		var year = '${product.YEAR}';
		var seq = document.getElementById("SEQ").value;
		
		location.href = "/jumyong/productInsert.do?no=${no}&currentPage=${currentPage}&countPerPage=${countPerPage}"
		+"&mode=edit&year="+year+"&seq="+seq+"&section=${section}";
	}
	
	//confirm 을 확인,취소-> 예,아니오.
	function window.confirm(str) {

	 execScript('n = msgbox("'+str+'","4132")',"vbscript");
	 return(n == 6);
	}



	
	function Calculate()
	{
		savable = 1;
		if(confirm("개월수를 자동 계산하시겠습니까?"))
			calDate();
		var area_after = document.getElementById("AREA_AFTER").value;
		area_after = area_after * -1;
		var period = document.getElementById("period").value;
		
		var old_area_after = "${old_area_after}";
		var old_period = "${old_period}";
		var old_sum_adjust = "${old_sum_adjust}";
		
		alert(old_period);
		alert(old_area_after+"  "+area_after);
		if(Number(period) > Number(old_period))
		{
			alert("점용 기간이 기존 점용기간보다 깁니다.");
			document.getElementById("PERIOD").value = "0";
		
		}
		
		if(Number(area_after) > Number(old_area_after))
		{
			alert("점용 면적이 기존 점용면적보다 큽니다.");
			document.getElementById("AREA_AFTER").value = "0";
		
		}
		
		//점용료 계산
		var result = (Number(area_after)/Number(old_area_after)*(Number(old_period) - Number(period))/Number(old_period)*Number(old_sum_adjust));
		
		alert("result ="+ result);
		
		//소수점 없애기
		result = Math.floor(result);
		
		//-추가
		if(Number(result) < 100)
			strResult = "0";
		else
		{
			var strResult = "-"+result;
			//strResult = "-"+strResult.substr(0,strResult.length - 2)+"00";
		}
				
		document.getElementById("sum_adjust").value= strResult;
		
		//산출식
		document.getElementById("FORM_ADJUST").value = old_sum_adjust+" * ( ("+old_period+" - "+period+")개월/"+old_period +"개월) * (-"+area_after+"㎡/"+old_area_after+"㎡)";
		document.getElementById("FORM").value = document.getElementById("FORM_ADJUST").value;
		document.getElementById("sum_year").value = strResult;
		document.getElementById("sum_lastyear").value = "0";
		document.getElementById("adjustment").value = "1";
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
	
		
	//[ , ] 삭제
	function removeComma2(numValue)
	{	
		num = document.getElementById(numValue).value;		
		document.getElementById(numValue).value = Number(num.split(',').join(""));
	}
	
	
	function removeComma(numValue)
	{
		return Number(numValue.split(',').join(""));
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
	
	function onlyNumberInput()
	{
		
		
	 var code = window.event.keyCode;
	
	 if ((code > 34 && code < 41) || (code > 47 && code < 58) || (code > 95 && code < 106) || code == 8 || code == 9 || code == 13 || code == 46 || code == 190 || code == 189|| code == 109)
	 {
	  	window.event.returnValue = true;
		return;
	 }else 
	 {	 
	 	window.event.returnValue = false;
	 	return;
 	 }
	}
	
	// 콤마 삽입
	function insertComma(val1)
	{
	
		value1 = document.getElementById(val1).value;
		
		var length1 = value1.length;		
		var divideNum = length1%3;
		var returnValue2 ="";
		
		if(divideNum != 0)
		{
			returnValue2 = value1.substr(0,divideNum)+",";
		}
		
		if(length1 >3)
		{
			while(true)
			{
				returnValue2 = returnValue2 + value1.substr(divideNum,3)+",";
				
				divideNum = divideNum+3;
				if(length1 <= divideNum)
					break;
			}
		}
		
		if(returnValue2 == "")
			returnValue2 = value1;
		else
			returnValue2 = returnValue2.substr(0,returnValue2.length - 1);

		document.getElementById(val1).value = returnValue2;
	}
	
	
	
		// 콤마 삽입 - 반환
	function insertComma2(value1)
	{	
		value1 = value1+"";
		
		var length1 = value1.length;		
		var divideNum = length1%3;
		var returnValue2 ="";
		
		if(divideNum != 0)
		{
			returnValue2 = value1.substr(0,divideNum)+",";
		}
		
		if(length1 >3)
		{
			while(true)
			{
				returnValue2 = returnValue2 + value1.substr(divideNum,3)+",";
				
				divideNum = divideNum+3;
				if(length1 <= divideNum)
					break;
			}
		}
		
		if(returnValue2 == "")
			returnValue2 = value1;
		else
			returnValue2 = returnValue2.substr(0,returnValue2.length - 1);

		return returnValue2;
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
	
	
	
	// 대쉬 삭제
	function removeDash(numValue)
	{
		return numValue.split('-').join("");
	}
	
	
	//날짜에 dash(-) 삽입
	function addDash2(num1)
	{
		num = document.getElementById(num1).value;
		document.getElementById(num1).value =  (num.substr(0,4)+"-"+num.substr(4,2)+"-"+num.substr(6,2));
	}
	
	function setParentYear(yearVal)
	{
		parent.document.getElementById("year").value = yearVal;
	}
	
	//공시지가 팝업
	function openLandPricePopUp()
	{
		var winW = 320;
		var winH = 133;
		var status ="toolbar=no, location=no, directories=no, status=no, menubar=no, resizable=no, scrollbars=no, width="+winW+", height="+winH+", left=0, top=0"
		window.open('/jsp/jumyong/jumyong/officialLandPrice.html', 'win', status);	
	}
	
	
	
	function goView(year,seq)
	{
		setParentYear('${board.YEAR}');
		location.href('/jumyong/productSubtractInsert.do?no=${no}&year='+year+'&currentPage=${currentPage}&countPerPage=${countPerPage}&seq='+seq+'&section=${section}');
	}
	
	-->
	
	
	
	
</script>

</head>

<body onload="javascript:InitPage();"  border="0">
<form name="productForm" id="productForm" method="post" action = "/jumyong/productSubtractInsert.do" >
			<input name="no" value="${no}" type="hidden" >
			<input name="mode"  id = "mode" value="${mode}" type="hidden" >
			<input name="SEQ"  id = "SEQ" value="${seq}" type="hidden" >			
			<input name="area"  id = "area" value="${area}" type="hidden" >
			
			
            <spring:bind path="product.FIRST_SEQ">                    
				<input name="FIRST_SEQ"  id = "FIRST_SEQ" value="${product.FIRST_SEQ}" type="hidden" >			
			</spring:bind>
			<spring:bind path="product.CAL_SUM_SEQ">
				<input name="CAL_SUM_SEQ"  id = "CAL_SUM_SEQ" value="${product.CAL_SUM_SEQ}" type="hidden" >			
			</spring:bind>
			
			<spring:bind path="product.PRICE" >
				<input name="PRICE" ID="PRICE" value="${product.PRICE}" type="hidden"  style="width:80px;ime-mode:disabled;" >	 						                   		
			</spring:bind>
		 	<spring:bind path="product.RATE">
				<input name="RATE"  id="RATE" type="hidden" style="width:80px;ime-mode:disabled;" value="${product.RATE}"  >
			</spring:bind>		         
			<spring:bind path="product.ADJUSTMENT">
				<input name="ADJUSTMENT" id="ADJUSTMENT" type="hidden" class="input_form1" style="width:120px;ime-mode:disabled;" value="${product.ADJUSTMENT}"   onKeyDown="onlyNumberInput();" style="text-align:right">
			</spring:bind>
			<spring:bind path="product.SUM_LASTYEAR">
            	<input name="SUM_LASTYEAR" id="SUM_LASTYEAR" type="hidden"  class="input_form1" style="width:80px;ime-mode:disabled;" value="${product.SUM_LASTYEAR}"   onKeyDown="onlyNumberInput();" onkeyup="javascript:fn_addComma(this)" style="text-align:right">
			</spring:bind>
			<spring:bind path="product.FORM">                                        
				<input name="FORM" ID="FORM" type="hidden" class="input_form1" style="width:300px" value="${product.FORM}">
			</spring:bind>
			<spring:bind path="product.SUM_YEAR">
				<input name="SUM_YEAR" id="SUM_YEAR" type="hidden" class="input_form1" style="width:80px;ime-mode:disabled;" value="${product.SUM_YEAR}"   onKeyDown="onlyNumberInput();" onkeyup="javascript:fn_addComma(this)" style="text-align:right">
			</spring:bind>
				
				<table width="780" border="0" cellspacing="0" cellpadding="0">
		          <tr>
		
		            <td class="contborder_purple">							            
							<table width="100%" border="0" cellspacing="0" cellpadding="0">
							              <tr>
							                <td>
							                <table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
							                  <tr>
							                    <td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">번호</td>
							                    <td align="center" bgcolor="e5eff8" class="sub_table_b">기준연도</td>
							                    <td align="center" bgcolor="e5eff8" class="sub_table_b">공시지가</td>
							                    <td align="center" bgcolor="e5eff8" class="sub_table_b">면적</td>
							                    <td align="center" bgcolor="e5eff8" class="sub_table_b">요율</td>
							                    <td align="center" bgcolor="e5eff8" class="sub_table_b">산출기간</td>
							                    <td align="center" bgcolor="e5eff8" class="sub_table_b">작년도 점용료 </td>
							                    <td align="center" bgcolor="e5eff8" class="sub_table_b">현년도 점용료 </td>
							                    <td align="center" bgcolor="e5eff8" class="sub_table_b">조정 점용료 </td>
							                    <td align="center" bgcolor="e5eff8" class="sub_table_b">감면 적용 점용료 </td>							                    
							                    </tr>
							                  <c:forEach items="${productList}" var="board" varStatus="idx">
							                      <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" 
							                      onclick="javascript:setParentYear('${board.YEAR}');location.href('/jumyong/productInsert.do?no=${no}&year=${board.YEAR}&currentPage=${currentPage}&countPerPage=${countPerPage}&year=${board.YEAR}&seq=${board.SEQ}&section=${section}');" style="cursor:pointer" >
							                        <td height="26" align="center">${idx.count}</td>
							                        <td align="center">${board.YEAR}</td>
							                        <td align="center">${rnic:insertComma2(board.PRICE)}</td>
							                        <td align="center">${board.AREA_AFTER}</td>
							                        <td align="center">${board.RATE}</td>
							                        
							                        <td align="center">${rnic:addDash(board.FROMDATE)}~${rnic:addDash(board.TODATE)}</td>
							                        <td align="center">${rnic:insertComma2(board.SUM_LASTYEAR) }</td>
							                        <td align="center">${rnic:insertComma2(board.SUM_YEAR) }</td>
							                        <td align="center">${rnic:insertComma2(board.SUM_ADJUST) }</td>
							                        <td align="center">${rnic:insertComma2(board.SUM) }</td>							                        
							                    
							                      </tr> 
											  </c:forEach>
							                </table></td>
							              </tr>
							              <tr>
							                <td height="40" align="center"><table width="100%" border="0" cellspacing="0" cellpadding="0">
							                    <tr>
							                      <td align="center"><table border="0" cellpadding="0" cellspacing="0">
							                        <tr>
							                        ${strPageDivideForm}
							                        </tr>
							                        
							                      </table></td>
	
							                    </tr>
							                    <tr>
		
		
							                    </tr>
							                  </table></td>
							              </tr>
							              
										</table>
										
									<div id="view" style="width:100%;">
		              					<table width="100%" border="0" cellspacing="0" cellpadding="0">
							              
							              <tr>
							                <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
							                   <tr>
							                    <td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b" >기준년도</td>
							                    <td width="42%" bgcolor="eaeaea" class="table_bl_left" >
							                    	${product.YEAR}년
												</td>                     
												<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">공시지가</td>
							                    <td width="32%" bgcolor="eaeaea" class="table_bl_left" >
								                   		${rnic:insertComma2(product.PRICE)}원                
												</td> 
							                  </tr>
							                  <tr>
							                    <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용면적</td>
							                    <td bgcolor="eaeaea" class="table_bl_left" >
								                    ${product.AREA_AFTER}㎡
												</td>                     
												<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">요율/단가</td>
							                    <td bgcolor="eaeaea" class="table_bl_left" >
														${product.RATE}
												</td> 
							                  </tr>                   
							                  
							                  
											<tr>
							                    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">산출기간</td>
							                    <td bgcolor="eaeaea" class="table_bl_left" >
							                    
							                          		${product.FROMDATE} ~ ${product.TODATE}
							                    </td>  
							                    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">개월수</td>
							                    <td bgcolor="eaeaea" class="table_bl_left" >${product.PERIOD}개월</td>
							                  </tr>
							                  <tr>
							                    <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">감면사유</td>
							                    <td bgcolor="eaeaea" class="table_bl_left" >${product.REDUCTION_REASON}</td>
												<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">감면율</td>
							                    <td bgcolor="eaeaea" class="table_bl_left" >${product.REDUCTION_RATE}%</td>
							                  </tr>   
							
												<tr>
													<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">조정 계수</td>
							                  		<td bgcolor="eaeaea" class="table_bl_left" >
							
														${product.ADJUSTMENT}
							
													</td>   
							                    	<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">작년도 점용료</td>
								                    <td bgcolor="eaeaea" class="table_bl_left" >
										                    ${rnic:insertComma2(product.SUM_LASTYEAR)} 원
													</td>  
												</tr>  
							
							                  <tr>
							                    <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">기본 산출식</td>
							                    <td bgcolor="eaeaea" class="table_bl_left" >
							
														${product.FORM}
							
												</td>
												
												<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">현년도 점용료</td>
							                    <td bgcolor="eaeaea" class="table_bl_left" >
													${rnic:insertComma2(product.SUM_YEAR)} 원
												</td>    
							                  
												
												
							                  </tr> 
							                   <tr>
												<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">조정 산출식</td>
							                    <td bgcolor="eaeaea" class="table_bl_left" >
							
													${product.FORM_ADJUST}
							
												</td> 
												<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">조정 점용료</td>
							                    <td bgcolor="eaeaea" class="table_bl_left" >
							
													${rnic:insertComma2(product.SUM_ADJUST)} 원
							
												</td> 
							                   
												
							                  </tr> 
							                  
							                </table></td>
							              </tr>
							            
							              <tr>              
							                <td height="40" align="right">
								                <table border="0" width="100%">
								                	<tr>
								                	<td >
									                <a href="/jumyong/productInsert.do?no=${no}&year=${board.YEAR}&currentPage=${currentPage}&countPerPage=${countPerPage}&mode=add&section=${section}">
									                	<img src="/img/add_icon.gif" alt="추가" border="0" >
									                </a>
  									                <c:if test="${listSize != '0'}"> 
										                </td><td width="50">
										                

										                
										                	<img src="/img/mod_icon.gif" alt="수정" border="0" onclick="javascript:goModify()" style="cursor:pointer" >
										                </td>
										            </c:if>
									                </tr>
									               
									             </table>
											</td>
							              </tr>
								</table>
							</div>
							

							<div id="edit" style="width:100%;display:none;">
		  					<table width="100%" border="0" cellspacing="0" cellpadding="0">
					              <tr>
					                <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
					                   <tr>
					                    <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b"  style="direction:rtl" >기준년도</td>
					                    <td  colspan="3" bgcolor="eaeaea" class="table_bl_left" >
						                    <spring:bind path="product.YEAR">                    
												<input name="YEAR" id="YEAR" type="text" value = "${product.YEAR}" style="width:50px;ime-mode:disabled;"  class="input_form1"  onKeyDown="onlyNumberInput();" style="text-align:right">&nbsp년 
						                    </spring:bind>
										</td>
					                  </tr> 
					                  
									<tr>
					                    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">사용기간</td>
					                    <td colspan="3" bgcolor="eaeaea" class="table_bl_left" ><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					                        <tr>
					                          <td>
					                          	<spring:bind path="product.FROMDATE">
					                          		<input name="FROMDATE" id="FROMDATE" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value="${product.FROMDATE}"  onKeyDown="onlyNumberInput();"   onKeyDown="onlyNumberInput();" maxlength=8>
					                          	</spring:bind>
					                          </td>
					                          <td>
					                          <img src="/img/calendar_icon.gif" onclick="popUpCalendar(this, document.getElementById('FROMDATE'), 'yyyymmdd');" style="cursor:pointer">
					                          
					                          </td>
					                          <td width="16" align="center">~</td>
					                          <td>
					                          	<spring:bind path="product.TODATE">
						                          	<input name="TODATE" id="TODATE" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value="${product.TODATE}"  onKeyDown="onlyNumberInput();" maxlength=8>
						                        </spring:bind>
					                          </td>
					                          <td>
					                     		<img src="/img/calendar_icon.gif" onclick="popUpCalendar(this, document.getElementById('TODATE'), 'yyyymmdd');" style="cursor:pointer">
												<img src="/img/cal_month.gif" alt="달수계산" height="18" border="0" style="cursor:pointer" onClick="javascript:calDate();">
					                     		
					                          </td>
					                        </tr>
					                    </table></td>
					                  </tr>
					                     <tr>
					                  <td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">부과기간</td>
					                    <td width="37%" bgcolor="eaeaea" class="table_bl_left" >${old_period}
										</td>    
										
										 <td width="13%" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">사용기간</td>
					                    <td width = "37%" bgcolor="eaeaea" class="table_bl_left" >
					                    	<spring:bind path="product.PERIOD">
						                    	<input name="PERIOD" id ="PERIOD" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value = "${product.PERIOD}"   onKeyDown="onlyNumberInput();" style="text-align:right">개월
						                    </spring:bind>
										</td>  
					                  </tr>   
					                  
				                     <tr>
					                  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">기존면적</td>
					                    <td bgcolor="eaeaea" class="table_bl_left" >${old_area_after}㎡
										</td>    
										
										<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">변경면적</td>
					                    <td bgcolor="eaeaea" class="table_bl_left" >
					                        <spring:bind path="product.AREA_AFTER">
						                    <input name="AREA_AFTER" id="AREA_AFTER" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value="${product.AREA_AFTER}"   onKeyDown="onlyNumberInput();" style="text-align:right">㎡
											</spring:bind>
										</td>   
					                  </tr>
					                  
				                     <tr>
					                  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">부과 점용료</td>
					                    <td bgcolor="eaeaea" class="table_bl_left" >${old_sum_adjust}원
										</td>    
										
										<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b"> 점용료</td>
					                    <td bgcolor="eaeaea" class="table_bl_left" >
					                    	<spring:bind path="product.SUM_ADJUST">                    
												<input name="SUM_ADJUST" id="SUM_ADJUST" type="text" class="input_form1" value="${product.SUM_ADJUST}" style="width:80px;ime-mode:disabled;" value="0"  onKeyDown="onlyNumberInput();" onkeyup="javascript:fn_addComma(this)"  style="text-align:right">원
											</spring:bind>
										</td> 
					                  </tr>					                  
					                  
					                  
					                  </table>
					                  </td></tr>
					                  
					                  <tr>              
					                <td height="40" align="right">
					                
					                <img src="/img/accou_icon.gif" alt="계산" width="56" height="18" border="0" onclick="javascript:Calculate();" style="cursor:pointer">
						                </td>
					              </tr>
					              
					                
					                  
					                  <tr><td>
					                  <table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
					                  
					                   <tr>
					                   <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">조정 산출식</td>
					                    <td bgcolor="eaeaea" class="table_bl_left" >
											<spring:bind path="product.FORM_ADJUST">                                                            
											<input name="FORM_ADJUST" id="FORM_ADJUST" type="text" value="${product.FORM_ADJUST}"class="input_form1" style="width:300px" value="">
											</spring:bind>
										</td> 
					                    
										
					                  </tr>  
					                  
					                  
					                  
					                  
					               
					                             
												<input name="RATE1" id = "RATE1" type="hidden" class="input_form1" style="width:120px;ime-mode:disabled;" value=""   onKeyDown="onlyNumberInput();" >
					                  
					                </table></td>
					              </tr>
					            
					              <tr>              
					                <td height="40" align="right">
				                	<img src="/img/can_icon.gif" alt="취소" border="0" onclick="javascript:history.back();" style="cursor:pointer" >
					                <img src="/img/save_icon2.gif" alt="저장" width="56" height="18" border="0"
						                onClick="javascript:submitClick();"  style="cursor:pointer">
						                </td>
					              </tr>
						</table>	</div>

				  	</td>
		          </tr>
		        
		          
		          
		        </table>
	
	
	
	
	
		
		

	</form>
</body>
</html>

