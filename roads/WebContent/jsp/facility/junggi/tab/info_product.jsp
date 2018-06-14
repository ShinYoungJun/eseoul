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
<script language="javascript" src="/js/PopupCalendar.js"></script> 
<script><!--
	

	function InitPage()
	{
		// 산출단가 있을 경우 공시지가 못넣도록 막기
		if( document.productForm.RATE.value != '' ){
			document.productForm.PRICE.disabled = true;
			document.getElementById("priceButton").style.display = "none";
		}
		
		// equip_taxation_info 테이블에 넣을 정보 보이기 		
		var taxationCheck = document.getElementById("taxationCheck");
		var taxationCheck2 = document.getElementById("taxationCheck2");
		
		if( document.productForm.listSize.value == '1' || document.productForm.mode.value == 'edit' ){
			taxationCheck.style.display = "block";
			taxationCheck2.style.display = "block";
			
		}else if( document.productForm.taxation_check.value == '1' ){
			taxationCheck.style.display = "block";
			taxationCheck2.style.display = "block";
			
		}else{
			taxationCheck.style.display = "none";
			taxationCheck2.style.display = "none";
		}
		
		//var overtax = document.getElementById("OVERTAX");
		/*if( document.productForm.mode.value == 'edit' ){
			overtax.style.display = "none";
		}else{
			overtax.style.display = "none";
		}*/
		
	}
	
	
	/*
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
	}	*/

	function calDate()
	{
		var fromDate = removeDash(document.getElementById("FROMDATE").value);
		var toDate = removeDash(document.getElementById("TODATE").value);
	
//		var dateCount = 0;
		if(fromDate>toDate){
			alert("시작날짜 종료날짜보다 더늦게 설정 할 수 없습니다.");
			document.getElementById("FROMDATE").value="";
			document.getElementById("TODATE").value="";
			return;
		}
	
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
		/*
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
	*/
	

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
		calDate();
		var quantity = document.getElementById("QUANTITY").value;
		var depth_rate = document.getElementById("DEPTH_RATE").value;
		var rate = document.getElementById("RATE").value;
		var period = document.getElementById("PERIOD").value;
		var form_adjust = document.getElementById("FORM_ADJUST").value;
		var sum_adjust = document.getElementById("SUM_ADJUST").value;
		var mode = document.getElementById("mode").value;
		
//		document.getElementById("SUM_ADJUST").value = Number(quantity) * (100-Number(depth_rate))/100*Number(rate)*Number(period)/12;
//		document.getElementById("FORM_ADJUST").value = quantity+ " * " + " (100-"+Number(depth_rate)+" )/100*"+ Number(rate)+" * "+ Number(period)+" /12 ";
//		document.getElementById("SUM_YEAR").value = Number(quantity) * (100-Number(depth_rate))/100*Number(rate)*Number(period)/12;
		
		document.getElementById("FORM").value = quantity+ " * " + " (100-"+Number(depth_rate)+" )/100*"+ Number(rate)+" * "+ Number(period)+" /12 ";
		
		//현년도 점용료 계산

		var sum_year = Number(quantity) * (100-Number(depth_rate))/100*Number(rate)*Number(period)/12;			

        var strSUM_ADJUST = String( Math.floor(sum_year)); // 소수점 제거        
	    sum_year = parseInt(strSUM_ADJUST); 	//100원 절삭
	    //sum_year = Math.floor(Number(strSUM_ADJUST) / 100) * 100;
			
		document.getElementById("SUM_YEAR").value = sum_year;		
		insertComma("SUM_YEAR");
		
		//현년도 점용료 계산 끝
		
		
		//조정 계수 및 조정 점용료 계산
		//var sum_lastyear = document.getElementById("SUM_LASTYEAR").value;
		var tempval = 0;
		
		//var sum_year = document.getElementById("SUM_YEAR").value;
		/*if(sum_lastyear >0)//작년도 점용료가 있을때
		{
			var rate1 = Math.floor((sum_year - sum_lastyear ) / sum_lastyear *100 ); // 현년도 작년도 점용료 비율
			
			if( rate1 >= 10 && rate1 <=1000)//비율이 허용 범위내에 있을때
			{
			
				document.getElementById("rate1").value = rate1;			
				
				alert("rate1="+rate1);
	
				getRateAjax(rate1);
				
				tempval = 1;
			}
		}*/
		
		if(tempval == 0) // 작년도 점용료가 없거나 비율에 해당하지 않을때
		{
			document.getElementById("ADJUSTMENT").value = "1";
			document.getElementById("SUM_ADJUST").value = document.getElementById("SUM_YEAR").value;
			document.getElementById("FORM_ADJUST").value = document.getElementById("FORM").value+" X 1";
			
			
			// 납기후 금액
			if( document.productForm.taxation_check.value == '1' ){
				document.getElementById("OVERTAX").value =  Math.floor((  Number(sum_year) * 3.0 / 100 + Number(sum_year) ) /100 ) * 100 ;
		   	 	insertComma("OVERTAX");
			}
			if( mode == 'edit'){
				document.getElementById("OVERTAX").value =  Math.floor((  Number(${sum_adjust}) * 3.0 / 100 + Number(${sum_adjust}) ) /100 ) * 100 ;
				insertComma("OVERTAX");
			}
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
	
	function adjustCalculation()
	{
	
		/*var adjust = document.getElementById("ADJUSTMENT").value;
		var sum_lastyear =document.getElementById("SUM_LASTYEAR").value;
		var SUM_ADJUST = Number( sum_lastyear)*Number(adjust);
        var strSUM_ADJUST = String( Math.floor(SUM_ADJUST));
		
		document.getElementById("SUM_ADJUST").value = SUM_ADJUST;
	    document.getElementById("FORM_ADJUST").value = sum_lastyear + "원 X "+ adjust;*/
	    
	    var adjust = document.getElementById("ADJUSTMENT").value;
	               
  		//alert('${old_use_section}');
    		
		if('${old_use_section}' == '1')
            		{
             
        	// var sum_year = removeComma(document.getElementById("sum_year").value);
			var sum_lastyear =document.getElementById("SUM_YEAR").value;
			var SUM_ADJUST = Number( removeComma(sum_lastyear))*Number(adjust);
			var strSUM_ADJUST = String( Math.floor(SUM_ADJUST));
		   	SUM_ADJUST = parseInt(strSUM_ADJUST); //100원 절삭
		   	document.getElementById("SUM_ADJUST").value = SUM_ADJUST;
		   	document.getElementById("FORM_ADJUST").value = sum_lastyear + "원 X "+ adjust;
		   
		   	// 납기후 금액
		   	if( document.productForm.taxation_check.value == '1' ){
			 	document.getElementById("OVERTAX").value =  Math.floor((  Number(SUM_ADJUST) * 3.0 / 100 + Number(SUM_ADJUST) ) /100 ) * 100 ;
		 		//insertComma("OVERTAX");
	 		}
		   
	   	}else if('${old_use_section}' == '2')
	   	{
	   		//작년도 1년치 점용료가 없으므로 새로 구함

			var rate = '${old_rate}';
			//var price = '${old_price}';
			var price = removeComma(document.getElementById("PRICE").value);
			var area_after = document.getElementById("AREA_AFTER").value;
			
			var strSUM_ADJUST = String( Math.floor(SUM_ADJUST));

			//현년도 점용료 계산
			var SUM_ADJUST = Number(area_after)*12/12*Number(rate)*Number(price)*Number(adjust);			
	        var strSUM_ADJUST = String( Math.floor(SUM_ADJUST)); // 소수점 제거        
	        
		    SUM_ADJUST = parseInt(strSUM_ADJUST); //100원 절삭
			document.getElementById("SUM_ADJUST").value = SUM_ADJUST;
		   	document.getElementById("FORM_ADJUST").value = area_after+"㎡ X 12/12 개월 X " +rate +" X " +insertComma2(price)+" X "+adjust ;
		   	
		   	// 납기후 금액
		   	if( document.productForm.taxation_check.value == '1' ){
			   	document.getElementById("OVERTAX").value =  Math.floor((  Number(SUM_ADJUST) * 3.0 / 100 + Number(SUM_ADJUST) ) /100 ) * 100 ;
		   		//insertComma("OVERTAX");
		   	}
		   	
	   }		
	}
	
	
	
	 function getRateAjax(addSum)
     {

        var params = 'addsum='+addSum;
		var url = "/getRate.do" ;
        var a = sendRequest1(url, params, rateFromServer, "Post");  // rateFromServer 함수에 rate 를 받아오게함
     } 
     
     
     function rateFromServer()
       {      
           if(httpRequest.readyState == 4)
           {
               if(httpRequest.status == 200)
               {               
	               //조정점용료 계산
				   var adjust = httpRequest.responseText; //조정 계수를 받아옴.

				   document.getElementById("ADJUSTMENT").value = adjust;
				   
				   adjustCalculation();
					
	               delete httpRequest;
               }else
               {
				   delete httpRequest;
               }
               

               
           }else
           {
           }
       }
     
     
     
     //xml js부분
	function getXMLRequest()
	{	
	    if(window.ActiveXObject)	
	    {	
	       try	
	       {	
	           return new ActiveXObject("MSXML2.XMLHttp");	
	       }	
	       catch(e)	
	       {
	           try{
	              return new ActiveXObject("Microsoft.XMLHttp");	
	            }
	           catch(e)
	           {
	              return null;
	           }
	       }
	    }
	    else if(window.XMLHttpRequest)	
	    {	
	       return new XMLHttpRequest();	
	    }	
	    else	
	    {	
	       return null;	
	    }	
	}	 
	
	var httpRequest = null;	 
	
	//매개변수: 서버쪽 페이지, 보내는 쿼리문, 서버에서 보내는 자료를 받는 함수, 전송방식
	
	function sendRequest1(url, params, callback, method)	
	{	
	   httpRequest = getXMLRequest();
	
	    //쿼리의 전달방식이 전달이 되었는지 확인한다. 만약 전달이 안되었다면	
	    //GET방식으로 전달하도록 한다.
	
	    var httpMethod =  method ? method:"GET";
	
	    if(httpMethod != "GET" && httpMethod !="POST")	
	    {
	       httpMethod = "GET";
	    }

	    //현재 쿼리를 전달할 주소를 받는다.	
	    var httpParams = (params==null || params =="")?null:params;	
	    var httpUrl = url;	
	    if(httpMethod =="GET" && params !=null)	
	    {	
	       httpUrl =httpUrl +"?"+httpParams;
	    }
	    httpRequest.open(httpMethod,httpUrl,true);
	    httpRequest.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
	
	    //onreadystatechange로 서버와 클라인트의 상태를 감지하여 변화가 있을시
	
	    httpRequest.onreadystatechange = callback;
	
	    httpRequest.send(httpMethod=="POST" ? httpParams:null);   	
	}	
	
	
	
	//ajax js 끝
     
     
     
	
	function goview(seq, year, cal_status)
	{
		var gu_code= document.getElementById("gu_code").value;
		var corp_cd = document.getElementById("corp_cd").value;
		var request_no= document.getElementById("request_no").value;

		var currentPage= document.getElementById("currentPage").value;
		
		//var year = document.getElementById("year").value;
		var tax_set = document.getElementById("tax_set").value;
		var object_no = document.getElementById("object_no").value;
		var mode = document.getElementById("mode").value;
		var seq = document.getElementById("SEQ").value;
		var cal_sum_seq = document.getElementById("cal_sum_seq").value;
		var sigu_cd = document.getElementById("sigu_cd").value;


		location.href="/facility/junggi/product_view.do?GU_CODE="+gu_code+"&CORP_CD="+corp_cd
		+"&REQUEST_NO="+request_no+"&currentPage="+currentPage+"&SEQ="+seq+"&cal_sum_seq="+cal_sum_seq+"&year="+year
		+"&tax_set="+tax_set+"&cal_status="+cal_status;
		
		
		//location.href="/facility/junggi/product_insert.do?GU_CODE="+gu_code+"&CORP_CD="+corp_cd
		//+"&REQUEST_NO="+request_no+"&currentPage="+currentPage+"&OBJECT_NO="+object_no+"&mode="+mode+"&SEQ="+seq+"&cal_sum_seq="+cal_sum_seq+"&YEAR="+year
		//+"&tax_set="+tax_set+"&sigu_cd="+sigu_cd;
		
	}
	
	

	

	function submitClick()
	{
		var productForm = document.productForm;
		
		if( productForm.mode.value == 'add' ){
			if( productForm.YEAR.value > '${yearAdd}' ){
				alert("정기분 산출은 다음년도만 부과 가능합니다. 확인해주세요. ");
				productForm.YEAR.focus();
				return;
				/*if( confirm("해당년도를 수정하시겠습니까? ") ){
					location.href = "/facility/junggi/product_insert.do? ";
				}*/
			}	
		}
		if(	productForm.YEAR.value == '0' || productForm.YEAR.value == '' ){
			alert("부과년도를 넣어주세요.");
			productForm.YEAR.focus();
			return;
		}		
		if( productForm.FORM_ADJUST.value == '' ){
			alert("계산을 먼저 해주세요. ");
			return;
		}
		if( productForm.RATE.value == '' ){
			if(	productForm.PRICE.value == '0' || productForm.PRICE.value == '' ){
				alert("공시지가를 넣고 계산해주세요.");
				productForm.PRICE.focus();
				return;
			}
		}
		/*if(	productForm.OVERTAX.value == '' || productForm.OVERTAX.value == '0' ){
			alert("납기후 금액을 넣어주세요.");
			productForm.OVERTAX.focus();
			return;
		}
		if(	productForm.TAX_DATE.value == '' ){
			alert("부과일자를 넣어주세요.");
			productForm.TAX_DATE.focus();
			return;
		}*/

		if( confirm("저장하시겠습니까? " ) ){
			//document.productForm.year.value = document.productForm.YEAR.value;
			//document.productForm.mode_proc.value = "addProc";
			//comma제거
			if( productForm.RATE.value == '' ){
				//removeComma2("PRICE");
			}
			//if( productForm.SUM_LASTYEAR.value != '' && productForm.SUM_LASTYEAR.value != '0' ){
				//removeComma2("SUM_LASTYEAR");
			//}
			removeComma2("SUM_YEAR");
			removeComma2("SUM_ADJUST");
			removeComma2("OVERTAX");
			productForm.submit();
		}

	}
	/*
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
	*/
	// 대쉬 삭제
	function removeDash(numValue)
	{
		return numValue.split('-').join("");
	}
	
		//달 차이 계산
		/*
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
	
	*/
	//공시지가 팝업
	function openLandPricePopUp()
	{
		var winW = 320;
		var winH = 133;
		var status ="toolbar=no, location=no, directories=no, status=no, menubar=no, resizable=no, scrollbars=no, width="+winW+", height="+winH+", left=0, top=0"
		//window.open('/jsp/jumyong/jumyong/officialLandPrice.html', 'win', status);
		
		var admin_no = document.getElementById("GU_CODE").value;
		var year = document.getElementById("YEAR").value;

	
		window.open('/officialLandPrice.do?ADMIN_NO='+admin_no+'&year='+year, 'win', status);
		
	}
	
	
	function onlyNumberInput()
	{	
		
	 var code = window.event.keyCode;	 
	
	 if ((code > 34 && code < 41) || (code > 47 && code < 58) || (code > 95 && code < 106) || code == 8 || code == 9 || code == 13 || code == 46 || code == 190 || code == 110 || code == 189 || code == 109)
	 {

	  	window.event.returnValue = true;
		return;
	 }else 
	 {	 
	 	window.event.returnValue = false;
	 	return;
 	 }
	}
	
	
	function goSumview(seq , year)
	{
		var gu_code= document.getElementById("gu_code").value;
		var corp_cd = document.getElementById("corp_cd").value;
		var request_no= document.getElementById("request_no").value;

		var currentPage= document.getElementById("currentPage").value;
		
		//var year = document.getElementById("year").value;
		var tax_set = document.getElementById("tax_set").value;

		location.href="/facility/junggi/product_view.do?GU_CODE="+gu_code+"&CORP_CD="+corp_cd
		+"&REQUEST_NO="+request_no+"&currentPage="+currentPage+"&cal_sum_seq="+seq+"&year="+year+"&tax_set="+tax_set;
	}
	
	
	//[ , ] 삭제
	function removeComma2(numValue)
	{	
		num = document.getElementById(numValue).value;		
		document.getElementById(numValue).value = Number(num.split(',').join(""));
	}
	
	
	
	
	
	
--></script>

</head>

<body onload="javascript:InitPage();"  border="0">

<form name="productForm" id="productForm" method="post" action = "/facility/junggi/product_insert.do" >

<input type="hidden" NAME="GU_CODE" ID="gu_code" value="${gu_code}" >
<input type="hidden" NAME="CORP_CD" ID="corp_cd" value="${corp_cd}" >
<input type="hidden" NAME="ADMIN_NO" ID="request_no" value="${product.ADMIN_NO}" >
<input type="hidden" NAME="OBJECT_NO" ID="object_no" value="${product.OBJECT_NO}" >
<input type="hidden" NAME="cal_sum_seq" ID="cal_sum_seq" value="${cal_sum_seq}" >	
<input type="hidden" NAME="SEQ" ID="SEQ" value="${SEQ}" >		
<input type="hidden" NAME="rate1" ID="rate1"  >		

<input type="hidden" NAME="currentPage" ID="currentPage" value="${currentPage}" >
<spring:bind path="product.TAX_SET">
	<input type="hidden" NAME="TAX_SET" ID="TAX_SET" value="${product.TAX_SET}" >
</spring:bind>

<!-- 2009.8.18 추가 start -->
<input type="hidden" name="SIGU_CD" value="${product.SIGU_CD}">
<input type="hidden" name="BJ_CD" value="${product.BJ_CD}">
<input type="hidden" name="TAX_NO" value="${product.TAX_NO}">
<input type="hidden" name="DEPT_CD" value="${product.DEPT_CD}">
<input type="hidden" name="TAX_GUBUN" value="${product.TAX_GUBUN}">
<input type="hidden" name="OBJ_SET" value="${product.OBJ_SET}">
<input type="hidden" name="TAXPAYER_ID" value="${product.TAXPAYER_ID}">
<input type="hidden" name="TAXPAYER_SET" value="${product.TAXPAYER_SET}">
<input type="hidden" name="OCR_SIGU_CD" value="${product.OCR_SIGU_CD}">
<input type="hidden" name="OCR_BUSEO_CD" value="${product.OCR_BUSEO_CD}">
<input type="hidden" name="TAX_CD" value="${product.TAX_CD}">
<input type="hidden" name="MAX_TAX_NO" value="${product.MAX_TAX_NO}">
<input type="hidden" name="CAL_SUM_SEQ" value="${product.CAL_SUM_SEQ}">
<input type="hidden" name="LIVE" value="${product.LIVE}">
<input type="hidden" name="mode" value="${mode}" >
<input type="hidden" name="year" value="${year }">
<input type="hidden" name="tax_set" value="${tax_set }">
<input type="hidden" name="message" value="${message}">
<input type="hidden" name="listSize" value="${listSize }">
<input type="hidden" name="listsSize" value="${listsSize}">
<input type="hidden" name="sigu_cd_param" value="${sigu_cd}">
<input type="hidden" name="taxation_check" value="${taxation_check }">
<!-- 2009.8.18 추가 end -->

<table width="780" border="0" cellspacing="0" cellpadding="0">
	<tr>
		<td class="contborder_purple">							            
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
					<td>
			
						<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
							<tr>
			                    <td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">년도 </td>								

			                    <td align="center" bgcolor="e5eff8" class="sub_table_b">일반 점용료 </td>
			                    <td align="center" bgcolor="e5eff8" class="sub_table_b">조정 점용료</td>
			                    <td align="center" bgcolor="e5eff8" class="sub_table_b">정기/수시</td>
			                    <td align="center" bgcolor="e5eff8" class="sub_table_b">구분</td>

		                    </tr>
							<c:forEach items="${calSumList}" var="board" varStatus="idx">
								<c:choose>
							<c:when test="${board.SEQ != cal_sum_seq }">
							<tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" 
								onclick="javascript:goSumview('${board.SEQ}','${board.YEAR }');" style="cursor:pointer" >
									
							</c:when>
							<c:otherwise>
							<tr onclick="javascript:goSumview('${board.SEQ}','${board.YEAR }');" bgcolor="#f6f7f8">
							</c:otherwise>
							</c:choose>

									<td height="28" align="center">${board.YEAR }</td>
									<td align="center">${rnic:insertComma2(board.SUM_ADJUST) }</td>
									<td align="center">${rnic:insertComma2(board.SUM) }</td>
									<td align="center">${board.USE_SECTION_NAME }</td>
									<td align="center">${board.TAX_SET_NAME }</td>
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
				                    <td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">과세구분</td>
				                    <td align="center" bgcolor="e5eff8" class="sub_table_b">점용목적</td>
				                    <td align="center" bgcolor="e5eff8" class="sub_table_b">연장(개소)</td>
				                    <td align="center" bgcolor="e5eff8" class="sub_table_b">구분 </td>				                    
<!--			                    <td align="center" bgcolor="e5eff8" class="sub_table_b">심도 </td>-->
<!--			                    <td align="center" bgcolor="e5eff8" class="sub_table_b">감액율</td>-->
<!--			                    <td align="center" bgcolor="e5eff8" class="sub_table_b">산출단가</td>-->
			                    	<td align="center" bgcolor="e5eff8" class="sub_table_b">조정점용료</td>
<!--			                    <td align="center" bgcolor="e5eff8" class="sub_table_b">구분 </td>-->
									<td align="center" bgcolor="e5eff8" class="sub_table_b">산출여부 </td>
			                    
		                    </tr>
							<c:forEach items="${CalculationList}" var="board" varStatus="idx">
							
							<c:choose>
							<c:when test="${board.SEQ != SEQ }">
								<tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" 
								onclick="javascript:goview('${board.SEQ}','${board.YEAR }','${board.CAL_STATUS}');" style="cursor:pointer" >
							</c:when>
							<c:otherwise>
								<tr onclick="javascript:goview('${board.SEQ}','${board.YEAR }','${board.CAL_STATUS}');" bgcolor="#f6f7f8">								
							</c:otherwise>
							</c:choose>
							
									<td height="26" align="center">${idx.count}</td>
<!--								<td height="26" align="center">${board.GU_CODE}-${board.CORP_CD}</td>-->
									<c:choose>
									<c:when test="${board.USE_SECTION == '2' }">
									<td height="26" align="center">${board.YEAR }년도 ${board.REQUEST_NO} 차 ${board.USE_SECTION_NAME}분 </td>
									</c:when>
									<c:otherwise>
									<td height="26" align="center">${board.YEAR }년도 ${board.USE_SECTION_NAME}분 </td>
									</c:otherwise>
									</c:choose>
									<td align="center">${board.SORT_NM} ${board.KIND_NM}</td>
									<td align="center">${board.QUANTITY}</td>
									<td align="center">${board.TAX_SET_NAME}</td>								
<!--								<td align="center">${board.DEPTH_NUM}</td>-->
<!--								<td align="center">${board.DEPTH_RATE}%</td>-->
<!--								<td align="center">${board.TAX_SET_NAME}</td>-->
									<td align="center">${rnic:insertComma2(board.SUM_ADJUST)}</td>
<!--								<td align="center">${board.USE_SECTION_NAME}</td>-->
									<td align="center"><font color="red">
										<c:if test="${board.SUM_ADJUST != null }">
											산출
										</c:if>
										<c:if test="${board.SUM_ADJUST == null }">
											미산출
										</c:if>
									</font>
									</td>
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
			                	<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">부과년도</td>
			                	<td width="42%" bgcolor="eaeaea" class="table_bl_left" >
									<spring:bind path="product.YEAR">
			                      	<!-- select name="YEAR" id="YEAR" class="input_form1" style="width:130px" onchange="changeYear(this.value);">
			                      	</select-->
									<input name="YEAR" id="YEAR" type="text" value = "${yearVal1}" style="width:80px;ime-mode:disabled;"  class="input_form1"  onKeyDown="onlyNumberInput();">
									</spring:bind>
				                
								</td>
								
								<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">공시지가</td>
		                    	<td width="32%" bgcolor="eaeaea" class="table_bl_left" >
		                    	
								<span id="priceButton">
		                   		<!-- input name="PRICE" ID="PRICE" value="${product.PRICE}" type="text" class="input_form1" style="width:120px" onkeypress="javascript:checkWon(this);"-->
			                	<spring:bind path="product.PRICE">   		
			                   		<input name="PRICE" ID="PRICE" value="${rnic:insertComma2(product.PRICE)}" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" onkeyup="javascript:fn_addComma(this)"  onKeyDown="onlyNumberInput();" >원	 
								</spring:bind>							
			                  	<img src="/img/landPrice.gif" alt="공시지가조회" height="18" border="0" style="cursor:pointer" onclick="javascript:openLandPricePopUp()"; >
			                  	</span>
								</td>
		                  	</tr>	
							<tr>
								<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">연장</td>
							    <td width="40%" bgcolor="eaeaea" class="table_bl_left" >
						        <spring:bind path="product.QUANTITY">
	                          		<input name="QUANTITY" id="QUANTITY" type="text" class="input_form1" style="width:80px;" value="${product.QUANTITY}" readonly>m(개)
	                          	</spring:bind>
									
								</td> 
								<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">감액율</td>
							    <td width="26%" bgcolor="eaeaea" class="table_bl_left" >
							    <spring:bind path="product.DEPTH_RATE">
	                          		<input name="DEPTH_RATE" id="DEPTH_RATE" type="text" class="input_form1" style="width:80px;" value="${product.DEPTH_RATE}"   >%	
	                          	</spring:bind>																	    
								</td> 
						    </tr>						   
						     	<tr>
							    <td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b" >산출단가</td>
							    <td width="42%" bgcolor="eaeaea" class="table_bl_left" colspan="3">
							    <spring:bind path="product.RATE">
	                          		<input name="RATE" id="RATE" type="text" class="input_form1" style="width:80px;" value="${product.RATE}"   >
	                          	</spring:bind>
									
								</td>  								
							
								
						    </tr>
							<tr>
			                    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">산출기간</td>
			                    <td bgcolor="eaeaea" class="table_bl_left" >
			                    	<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
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
				                    </table>
				                </td>  
			                    
			                    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">개월수</td>
			                    <td bgcolor="eaeaea" class="table_bl_left" >
			                     <spring:bind path="product.PERIOD">
										<input name="PERIOD" id="PERIOD" type="text" class="input_form1" style="width:50px;ime-mode:disabled;" value="${product.PERIOD}"   onKeyDown="onlyNumberInput();">개월
								</spring:bind>
								</td>
							</tr>
							
							<tr>
		                    	<!-- td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">작년도 점용료</td>
			                    <td width="42%" bgcolor="eaeaea" class="table_bl_left" >
									<spring:bind path="product.SUM_LASTYEAR">													
										<input name="SUM_LASTYEAR" id="SUM_LASTYEAR" type="text"  class="input_form1" style="width:80px;ime-mode:disabled;" value="${product.SUM_LASTYEAR}"   onKeyDown="onlyNumberInput();" onkeyup="javascript:fn_addComma(this)">원
									</spring:bind>
								</td-->  
								<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">현년도 점용료</td>
			                    <td width="32%" bgcolor="eaeaea" class="table_bl_left">
									<spring:bind path="product.SUM_YEAR">
										<input name="SUM_YEAR" id="SUM_YEAR" type="text" class="input_form1" style="width:120px;ime-mode:disabled;" value="${rnic:insertComma2(product.SUM_YEAR)}"   onKeyDown="onlyNumberInput();" onkeyup="javascript:fn_addComma(this)" >원
									</spring:bind>
								</td>
								<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">조정 점용료</td>
			                    <td bgcolor="eaeaea" class="table_bl_left" >
									<spring:bind path="product.SUM_ADJUST">													
										<input name="SUM_ADJUST" id="SUM_ADJUST" type="text" class="input_form1" style="width:120px;ime-mode:disabled;" value="${rnic:insertComma2(product.SUM_YEAR)}"  onKeyDown="onlyNumberInput();" onkeyup="javascript:fn_addComma(this)" >원
									</spring:bind>
								</td>                   
							</tr>  
		                  	<tr>
			                    <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">조정 계수</td>
			                    <td bgcolor="eaeaea" class="table_bl_left" colspan="3">
									<spring:bind path="product.ADJUSTMENT">													
										<input name="ADJUSTMENT" id="ADJUSTMENT" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value="${product.ADJUSTMENT}"   onKeyDown="onlyNumberInput();" >
									</spring:bind>
								</td>								 
		                  	</tr>
				         
				      	<!-- 해당 object 가 다 계산 되었을때 taxation_info 에 저장할수 있도록 보여지게 변경 start -->
	                  	<!-- span  id="taxationCheck" style="display:none;"-->
	                  		<tr id="taxationCheck" style="display:none;">
			             		<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">부과일자</td>
			                    <td bgcolor="eaeaea" class="table_bl_left" >
			                    	<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
			                        	<tr>
				                        	<td>
											<spring:bind path="product.TAX_DATE">
			                          			<input name="TAX_DATE" id="TAX_DATE" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value="${product.TAX_DATE}"  onKeyDown="onlyNumberInput();"   onKeyDown="onlyNumberInput();" maxlength=10>
											</spring:bind>
				                          	</td>
				                          	<td>
					                          	<img src="/img/calendar_icon.gif" onclick="popUpCalendar(this, document.getElementById('FROMDATE'), 'yyyymmdd');"  style="cursor:pointer" >
				                          	</td>							                          
			                        	</tr>
			                    	</table>
			                    </td>
			             		<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">납기내기한</td>
			                    <td bgcolor="eaeaea" class="table_bl_left" >
			                    	<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
			                        	<tr>
				                        	<td>
											<spring:bind path="product.INDATE">
			                          			<input name="INDATE" id="INDATE" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value="${product.INDATE}"  onKeyDown="onlyNumberInput();"   onKeyDown="onlyNumberInput();" maxlength=10>
											</spring:bind>
				                          	</td>
				                          	<td>
					                          	<img src="/img/calendar_icon.gif" onclick="popUpCalendar(this, document.getElementById('FROMDATE'), 'yyyymmdd');"  style="cursor:pointer" >
				                          	</td>							                          
			                        	</tr>
			                    	</table>
			                    </td>
			             	</tr>
			             	<tr id="taxationCheck2" style="display:none;">
			             		<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">납기후일자</td>
			                    <td bgcolor="eaeaea" class="table_bl_left" >
			                    	<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
			                        	<tr>
				                        	<td>
											<spring:bind path="product.OVERDATE">
			                          			<input name="OVERDATE" id="OVERDATE" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value="${product.OVERDATE}"  onKeyDown="onlyNumberInput();"   onKeyDown="onlyNumberInput();" maxlength=10>
											</spring:bind>
				                          	</td>
				                          	<td>
					                          	<img src="/img/calendar_icon.gif" onclick="popUpCalendar(this, document.getElementById('FROMDATE'), 'yyyymmdd');"  style="cursor:pointer" >
				                          	</td>							                          
			                        	</tr>
			                    	</table>
			                    </td>
			             		<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">납기후금액</td>
			                    <td bgcolor="eaeaea" class="table_bl_left" >
			                    	<spring:bind path="product.OVERTAX">
	                          			<input name="OVERTAX" id="OVERTAX" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value="${rnic:insertComma2(product.OVERTAX)}"  onKeyDown="onlyNumberInput();"   onKeyDown="onlyNumberInput();" maxlength=10>
									</spring:bind>
			                    </td>
			             	</tr>
			            
	                  	<!-- 해당 object 가 다 계산 되었을때 taxation_info 에 저장할수 있도록 보여지게 변경 end-->
				        
		                   	<tr>
		                    	<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">기본 산출식</td>
		                    	<td colspan="3" bgcolor="eaeaea" class="table_bl_left" >
										<spring:bind path="product.FORM">																		                    
											<input name="FORM" ID="FORM" type="text" class="input_form1" style="width:600px" value="${product.FORM}">
										</spring:bind>														
								</td>
		                  	</tr> 
		                  	<tr>	
			                  	<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">조정 산출식</td>
			                    <td colspan="3" bgcolor="eaeaea" class="table_bl_left" >
									<spring:bind path="product.FORM_ADJUST">													
										<input name="FORM_ADJUST" id="FORM_ADJUST" type="text" class="input_form1" style="width:600px" value="${product.FORM_ADJUST}" >
									</spring:bind>
								</td>
	                  	 	</tr>
						
						</table>
					</td>
				</tr>
					                
 				<tr>              
                	<td height="40" align="right">                		
	                	<img src="/img/accou_icon.gif" alt="계산" width="56" height="18" border="0" onclick="javascript:Calculate();" style="cursor:pointer">
	                	<img src="/img/save_icon2.gif" alt="저장" width="56" height="18" border="0" onClick="javascript:submitClick();" style="cursor:pointer" >
		            	<img src="/img/can_icon.gif" alt="취소" width="56" height="18" border="0" onClick="javascript:history.back();" style="cursor:pointer">
		            </td>
				</tr>
	            <tr> 
					<td height="40" align="right"></td>
				</tr>
			</table>
		</td>
	</tr>					                
</table>
</form>
</body>
</html>

