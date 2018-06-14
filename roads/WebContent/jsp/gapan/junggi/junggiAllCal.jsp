<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/include.jsp" %>
<%@ include file="/jsp/common/loginCheck.jsp" %>

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
 #tr_fixed_header 
    {
        position: relative;
        top: expression(this.offsetParent.scrollTop);
        z-index: 20;
    }

-->
</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
<script language="javascript" src="/js/PopupCalendar.js"></script> 
<script language="javascript" src="/js/Ajax_request.js"></script>
<script>
	///////////////////////////////////////////////////////////////////
	var dateUtil = function() {
	    this.startObject = null;
	    this.endObject = null;
	    this.args = null;
	}
	
	dateUtil.prototype.formatLen = function(str) {
	    return str = (""+str).length<2 ? "0"+str : str;
	}
	
	dateUtil.prototype.formatDate = function(dateObject, delimiter) {
	    delimiter = delimiter || "-";
	    return dateObject.getFullYear() + delimiter + this.formatLen(dateObject.getMonth() + 1) + delimiter + this.formatLen(dateObject.getDate());
	}
	
	dateUtil.prototype.toDay = function(delimiter) {
	    return this.formatDate(new Date(), "-");
	}
	
	dateUtil.prototype.calDate = function() {
	    var year = this.args.year == null ? 0 : Number(this.args.year);
	    var month = this.args.month == null ? 0 : Number(this.args.month);
	    var day = this.args.day == null ? 0 : Number(this.args.day);
	    var result = new Date();
	
	    result.setYear(result.getFullYear() + year);
	    result.setMonth(result.getMonth() + month);
	    result.setDate(result.getDate() + day-1);
	    return this.formatDate(result, "-");
	}
	
	dateUtil.prototype.setDate = function(startObject, endObject, args) {
	    this.startObject = startObject;
	    this.endObject = endObject;
	    this.args = args;
	
	    document.getElementById(this.startObject).value = this.calDate();
	    document.getElementById(this.endObject).value = this.toDay();
	}
	
	
	var dateUtilObj = new dateUtil();
	///////////////////////////////////////////////////////////////////		2009.09.03  과세일자와 납기내 일자 구하기 위해 쓴 함수 
	//////////////////////////////////////////////////////////////////		하지만 안쓴다고 하기에 내버려두지만 언제 또 변덕을 부릴지 몰라 그냥 둡니다.
	/////////////////////////////////////////////////////////////////		(*과세일자 :현재일자   *납기내일자:과세일자로부터 한달      *납기후일자:납기내일자로부터 담달 말일)

	function checkKeySearch()
	{
		if(event.keyCode == 13) goSearch();
	}
	
	
	function onlyNumberInput(){
		
		 var code = window.event.keyCode;
		
		 if ((code > 34 && code < 41) || (code > 47 && code < 58) || (code > 95 && code < 106) || code == 8 || code == 9 || code == 13 || code == 46 || code == 190 || code == 110 || code == 189 || code == 109){
	
			window.event.returnValue = true;
			return;
		 }else 
		 {	 
			window.event.returnValue = false;
			return;
		}
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
	    
	    while (Date.parse(edate)>=Date.parse(sdate)) {
	        if(sdate.getDate() == sDate){ //해당 요일과 같다면...
	          count++;
	        }
	      sdate.setDate(sdate.getDate()+1); //요일을 계속 증가
	    }
	    return count-1;
	}


	function InitPage()
	{	

		//과세날짜, 납기일내일자, 납기후일자 구하기  2009.08.31 pkh
		var dateUtilObj = new dateUtil();
		//dateUtilObj.setDate('INDATE', 'TAX_DATE', {month: +1});			//기준변경으로 주석처리 
		
		var taxdate = document.getElementById("TAX_DATE").value;
		var taxdate_year = Number(taxdate.substr(0,4));
		var taxdate_month = Number(taxdate.substr(5,2));
		var indate_f = new Date(new Date(taxdate_year, taxdate_month, 1)-86400000).getDate();
		
		document.getElementById("INDATE").value = taxdate.substr(0,4)+"-"+taxdate.substr(5,2)+"-"+indate_f;
		
		var indate = document.getElementById("INDATE").value;
		
		var indate_year = Number(indate.substr(0,4));
		var indate_month = Number(indate.substr(5,2));
		if(indate_month==12){
			indate_year = indate_year+1;
			indate_month = 1;
		}else{
			indate_month++;
		}
		
		if(indate_month<10){
			indate_month = "0"+indate_month;
		}
		var over_date = new Date(new Date(indate_year, indate_month, 1)-86400000).getDate();
		
		document.getElementById("OVERDATE").value = indate_year+"-"+indate_month+"-"+over_date;
	
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


	// 부과년도 검색 셋팅
	function change_value(val)
	{
		if(val.value.length == 4)
		{	
			
			document.frm.FROMDATE.value = val.value + "-01-01";
			document.frm.TODATE.value = val.value + "-12-31";
						
		}	
	}
	
	
	function calDate()
	{

		var fromDate = removeDash(document.getElementById("FROMDATE").value);
		var toDate = removeDash(document.getElementById("TODATE").value);


		var period = getDiffMon(fromDate,toDate)  ;
			
		document.getElementById("PERIOD").value = period;
		
		var fromDay1 = new Date(fromDate.substr(0,4),fromDate.substr(4,2),fromDate.substr(6,2));
		
		var toDay1 = new Date(toDate.substr(0,4),toDate.substr(4,2),toDate.substr(6,2));
		
	}
	
	// 계산
	function Calculate(){

		var f = document.frm;

		if(f.TOTALCNT.value <= 0){
			alert("처리할 데이터가 없습니다. ");
			return;
		}

		calDate();

		var check_yn = document.getElementsByName("CHECK_YN");
		var price = document.getElementsByName("PRICE");
		var allCnt = 0;
		
		for( var i = 0; i < check_yn.length; i++ ){
			if( check_yn[i].value == '2' ){
				if(price[i].value == '0' || price[i].value == ''){
					alert("공시지가를 넣고 계산해주세요. ");
					price[i].focus();
					return;
				}
			}
		}
		var area_after = document.getElementsByName("AREA_AFTER");
		var period = document.getElementById("PERIOD").value;
		var rate = document.getElementsByName("RATE");
		var reduction_rate = document.getElementsByName("REDUCTION_RATE");
		
		//var sum_year = new Array(${listCount});
		


		// 무단인 경우 과징율
		var surcharge_rate = "";
		if( '${SECTION}' == '3' ){
			surcharge_rate = document.getElementById("SURCHARGE_RATE").value;

			if( surcharge_rate == '' ){
				/*alert("과징율을 넣어주세요. ");
				document.getElementById("SURCHARGE_RATE").focus();
				return;*/
				surcharge_rate = 1.2;
				document.getElementById("SURCHARGE_RATE").value = surcharge_rate;
			}
		}

		var price = document.getElementsByName("PRICE");
		var form = document.getElementsByName("FORM");
		var sum_year = document.getElementsByName("SUM_YEAR");				
		var sum_lastyear = document.getElementsByName("SUM_LASTYEAR");		// 작년도 점용료
		var form_adjust = document.getElementsByName("FORM_ADJUST");
		var adjustment = document.getElementsByName("ADJUSTMENT");
		var sum_adjust = document.getElementsByName("SUM_ADJUST");
		var overtax = document.getElementsByName("OVERTAX");
		
		for( var i = 0; i < check_yn.length; i++){
			
			var reduction_rate_cal = ""; // 계산에 사용할 감면율(지분율)
			var reduction_rate_form = "";
			// 감면율, 지분율
			if( reduction_rate[i].value == '' || reduction_rate[i].value == '0'){ 
				
				if( '${SECTION}' == '3' ){
					reduction_rate[i].value = "";	// 지분율(무단)
					reduction_rate_cal = "100";
					reduction_rate_form = "";

				}
				else{
					reduction_rate[i].value = "";
					reduction_rate_cal = "";
					reduction_rate_form = "";							
				}
							
			}else{
				reduction_rate_cal = reduction_rate[i].value;
				if( '${SECTION}' == '3' ){
					reduction_rate_form = " X ("+reduction_rate[i].value+"/100)";	// 지분율(무단)
				}else{
					reduction_rate_form = " X ((100-"+reduction_rate[i].value+")/100)";	// 감면율(계속)
				}
			}
			
			
			var sum_year_cal = "";	// 값 셋팅하기전 계산시 필요한 변수 새로 선언
			var price1 = removeComma(price[i].value);
			var sum_lastyear1 = removeComma(sum_lastyear[i].value);
		
			if( check_yn[i].value == '2' ){

				form[i].value = area_after[i].value+"㎡ X " + period + "/12 개월 X " +rate[i].value +" X " +insertComma2(price1);
				
				if( '${SECTION}' == '3' ){
					sum_year_cal = parseFloat(Number(area_after[i].value)*Number(period)/12*Number(rate[i].value)*Number(price1)*(surcharge_rate)*(reduction_rate_cal/100)).toFixed(3);
				}else{
					sum_year_cal = parseFloat(Number(area_after[i].value)*Number(period)/12*Number(rate[i].value)*Number(price1)*((100-reduction_rate[i].value)/100)).toFixed(3);
				}

			}else{
				
				form[i].value = area_after[i].value+"㎡ X " + period + "/12 개월 X " +rate[i].value;

				if( '${SECTION}' == '3' ){
					sum_year_cal = parseFloat(Number(area_after[i].value)*Number(period)/12*Number(rate[i].value)*(surcharge_rate)*(reduction_rate_cal/100)).toFixed(3);
				}else{
					sum_year_cal = parseFloat(Number(area_after[i].value)*Number(period)/12*Number(rate[i].value)*((100-reduction_rate[i].value)/100)).toFixed(3);
				}

			}
		
			var strSUM_ADJUST = String( Math.floor(parseFloat(sum_year_cal).toFixed(3))); // 소수점 제거        
		    sum_year_cal = (Math.floor(Number(strSUM_ADJUST)/100))* 100; //100원 절삭
			sum_year[i].value = insertComma2(sum_year_cal);	// 현년도 점용료
			
			var tempval = 0;

			if(sum_lastyear1 > 0 && '${SECTION}' != '3' )//작년도 점용료가 있을때 (무단인 경우는 전년 점용료 관계없음)
			{

				var rate1 = Math.floor((sum_year_cal - sum_lastyear1 ) / sum_lastyear1 *100 ); // 현년도 작년도 점용료 비율
				
				//alert("rate1 == " + rate1);

				if( rate1 >= 10 && rate1 <=1000)//비율이 허용 범위내에 있을때
				{
				
					document.getElementById("rate1").value = rate1;			
					//alert("rate1="+rate1);
					getRateAjax(rate1, i);
					tempval = 1;
				}
			}

			if(tempval == 0 || '${SECTION}' == '3' ) // 작년도 점용료가 없거나 비율에 해당하지 않을때
			{
				//alert("작년도 점용료가 없거나 비율에 해당하지 않거나 무단인경우");
				if( '${SECTION}' == '3' ){
					form_adjust[i].value = form[i].value+" X "+surcharge_rate*100+"/100"+reduction_rate_form;
				}else{
					form_adjust[i].value = form[i].value+" X 1"+reduction_rate_form;
					adjustment[i].value = "1";
				}
						
				sum_adjust[i].value = insertComma2(sum_year_cal);
				
				
				// 납기후 금액
				var overtax1 =  Math.floor((  Number(sum_year_cal) * 3.0 / 100 + Number(sum_year_cal) ) /100 ) * 100;				
			 	overtax[i].value = insertComma2(overtax1);
			}
			

		} // for문 end

		alert("조정점용료나 산출식이 계산이 안될 시 '계산'버튼을 다시 눌러주십시요. ");
	}
	
	
	function getRateAjax(addSum, idx)
    {
		var params = ''; //'addsum='+addSum+'&idx='+idx;
		var url = "/getRate.do?addsum="+addSum+"&idx="+idx;		
		var a = sendRequest1(url, params, rateFromServer, "Post");  // rateFromServer 함수에 rate 를 받아오게함

    } 

	
	function rateFromServer(idx)
	{
		
		var form_adjust = document.getElementsByName("FORM_ADJUST");
		var sum_adjust = document.getElementsByName("SUM_ADJUST");
		var adjustment = document.getElementsByName("ADJUSTMENT");
		
		if(httpRequest.readyState == 4)
		{

			if(httpRequest.status == 200)
			{
              
				//조정점용료 계산
				var adjust_arr = httpRequest.responseText; //조정 계수를 받아옴. + idx 
				//alert(adjust_arr);
				
					
				if (adjust_arr.indexOf("@@")>=0) {

					var temp = adjust_arr.split("@@");
					var adjust = temp[0];
					var idx = temp[1];
					document.getElementById("adjust111").value = adjust;
					adjustment[idx].value = adjust;
					fun1(idx);
				}
								
					
				delete httpRequest;
			}else
			{

				Calculate();
				/*form_adjust[idx].value = form[idx].value;
				sum_adjust[idx].value = insertComma2(sum_year[idx].value);
				adjustment[idx].value = "0";*/

				delete httpRequest;
			}
              
		}
	}


	function fun1(idx)
	{
		//alert(" adjust= "+document.getElementById("adjust111").value);
		
		var sum_adjust = document.getElementsByName("SUM_ADJUST");
		var adjustment = document.getElementsByName("ADJUSTMENT");
		//var adjust = document.getElementById("ADJUSTMENT").value;
		var sum_lastyear = document.getElementsByName("SUM_LASTYEAR");
		var form_adjust = document.getElementsByName("FORM_ADJUST");
		var old_use_section =  document.getElementsByName("old_use_section");
		var overtax = document.getElementsByName("OVERTAX");
		var check_yn = document.getElementsByName("CHECK_YN");
		var price = document.getElementsByName("PRICE");
		var sum_year = document.getElementsByName("SUM_YEAR");
		var reduction_rate = document.getElementsByName("REDUCTION_RATE");
		var reduction_rate_form = "";
	               
		//alert(old_use_section[idx].value);
		var reduction_rate_cal = ""; // 계산에 사용할 감면율(지분율)
		var reduction_rate_form = "";
		// 감면율, 지분율
		if( reduction_rate[idx].value == '' || reduction_rate[idx].value == '0'){ 
			
			if( '${SECTION}' == '3' ){
				reduction_rate[idx].value = "";	// 지분율(무단)
				reduction_rate_cal = "100";
				reduction_rate_form = "";

			}
			else{
				reduction_rate[idx].value = "";
				reduction_rate_cal = "";
				reduction_rate_form = "";							
			}
						
		}else{
			reduction_rate_cal = reduction_rate[idx].value;
			if( '${SECTION}' == '3' ){
				reduction_rate_form = " X ("+reduction_rate[idx].value+"/100)";	// 지분율(무단)
			}else{
				reduction_rate_form = " X ((100-"+reduction_rate[idx].value+")/100)";	// 감면율(계속)
			}
		}
               		
		if( old_use_section[idx].value == '1' ){
			
			var adjust = adjustment[idx].value;
			var sum_lastyear = sum_lastyear[idx].value;
			var SUM_ADJUST = Number( removeComma(sum_lastyear))*Number(adjust);
			//var strSUM_ADJUST = String( Math.floor(SUM_ADJUST));
			SUM_ADJUST = Math.floor( Number(SUM_ADJUST)*((100-reduction_rate_cal)/100) / 100 ) * 100 ; //100원 절삭
			sum_adjust[idx].value = insertComma2(SUM_ADJUST);
			form_adjust[idx].value = sum_lastyear + "원 X "+ adjust+reduction_rate_form;
			sum_year[idx].value = insertComma2(SUM_ADJUST);

			// 납기후 금액
			var overtax1 =  Math.floor((  Number(SUM_ADJUST) * 3.0 / 100 + Number(SUM_ADJUST) ) /100 ) * 100 ;
			overtax[idx].value = insertComma2(overtax1);

		}
		else if( old_use_section[idx].value == '2' ){
			
			//작년도 1년치 점용료가 없으므로 새로 구함
			var old_rate = document.getElementsByName("RATE");
			var area_after = document.getElementsByName("AREA_AFTER");
			var adjust = adjustment[idx].value;
			var SUM_ADJUST = "";
			
			if( check_yn[idx].value == '2'){				
				var price1 = removeComma(price[idx].value);
			}

			//현년도 점용료 계산
			if( check_yn[idx].value == '2'){
				
				SUM_ADJUST = Number(area_after[idx].value)*12/12*Number(old_rate[idx].value)*Number(price1)*Number(adjust)*((100-reduction_rate_cal)/100);
				form_adjust[idx].value = area_after[idx].value+"㎡ X 12/12 개월 X " + old_rate[idx].value +" X " +insertComma2(price1)+" X "+adjust+ reduction_rate_form;

			}else{
				
				SUM_ADJUST = parseFloat(Number(area_after[idx].value)*12/12*Number(old_rate[idx].value)*Number(adjust)*((100-reduction_rate_cal)/100)).toFixed(3);
				form_adjust[idx].value = area_after[idx].value+"㎡ X 12/12 개월 X " + old_rate[idx].value +" X " +adjust+ reduction_rate_form;
			}

			//var SUM_ADJUST = (Math.floor(Number(SUM_ADJUST)/100))*100;
			var sum_adjust1 = (Math.floor(Number(SUM_ADJUST)/100))*100;
			sum_adjust[idx].value = insertComma2(sum_adjust1);
			sum_year[idx].value = insertComma2(sum_adjust1);

			// 납기후 금액
			var overtax1 = Math.floor((  Number(sum_adjust1) * 3.0 / 100 + Number(sum_adjust1) ) /100 ) * 100 ;
			overtax[idx].value = insertComma2(overtax1);
			
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
	
	    //onreadystatechange로 서버와 클라이언트의 상태를 감지하여 변화가 있을시
	
	    httpRequest.onreadystatechange = callback;
	
	    httpRequest.send(httpMethod=="POST" ? httpParams:null);
	}	
	
	//ajax js 끝
	
	
	
	
	// 저장
	function submitClick(){

		var f = document.frm;
		var year = document.getElementById("YEAR").value;
		
		if(f.TOTALCNT.value <= 0){
			alert("처리할 데이터가 없습니다. ");
			return;
		}
		if( document.getElementById("YEAR").value == '' ){
			alert("부과년도를 넣어주세요. ");
			document.getElementById("YEAR").focus();
			return;
		}
		if(	document.getElementById("FROMDATE").value == '' ){
			alert("산출기간을 넣어주세요.");
			document.getElementById("FROMDATE").focus();
			return;
		}
		if(document.getElementById("TODATE").value == '' ){
			alert("산출기간을 넣어주세요.");
			document.getElementById("TODATE").focus();
			return;
		}
		if(	document.getElementById("TAX_DATE").value == '' ){
			alert("부과일자를 넣어주세요.");
			document.getElementById("TAX_DATE").focus();
			return;
		}

		var sum_lastyear = document.getElementsByName("SUM_LASTYEAR");
		var sum_year = document.getElementsByName("SUM_YEAR");
		var sum_adjust = document.getElementsByName("SUM_ADJUST");
		var overtax = document.getElementsByName("OVERTAX");
		var form_adjust = document.getElementsByName("FORM_ADJUST");
		var check_yn = document.getElementsByName("CHECK_YN");
		var price = document.getElementsByName("PRICE");

		for( var i = 0 ; i < sum_adjust.length ; i++) {

			if( sum_year[i].value == '' ){
				alert("현년도점용료를 다시 계산해주세요. ");
				sum_year[i].focus();
				return;
			}else{
				sum_year[i].value = removeComma(sum_year[i].value);
			}
			if( sum_adjust[i].value == '' ){
				alert("조정점용료를 다시 계산해주세요. ");
				sum_adjust[i].focus();
				return;
			}else{
				sum_adjust[i].value = removeComma(sum_adjust[i].value);
			}
			if( overtax[i].value == '' ){
				alert("납기후 금액을 다시 계산해주세요. ");
				overtax[i].focus();
				return;
			}else{
				overtax[i].value = removeComma(overtax[i].value);
			}
			if( form_adjust[i].value == '' ){
				alert("계산을 다시 해주세요. ");
				form_adjust[i].focus();
				return;
			}
			if( check_yn[i].value == '2' ){
				if(	price[i].value == '0' || price[i].value == '' ){
					alert("공시지가를 넣고 계산해주세요. ");
					price[i].focus();
					return;
				}
			}
			price[i].value = removeComma(price[i].value);
			sum_lastyear[i].value = removeComma(sum_lastyear[i].value);
		}

		
		if(!confirm("저장하시기 전에 정확하게 산출 및 입력되었는지 확인하셔야 합니다. \n\n 해당 건들에 대하여 저장 하시겠습니까?"))			
			return;

		f.action = "/gapan/junggi/junggiAllCal_Prc.do?year="+year;
		f.submit();
	}


	
</script>
</head>

<body onload="InitPage()">
<form name="frm" method="post">

<input type="hidden" name="search" value="${search }">
<input type="hidden" name="toDateValue" id="toDateValue" value="${toDate}" >
<input type="hidden" name="fromDateValue" id="fromDateValue" value="${fromDate}">
<input type="hidden" name="jumyongNameValue" id="jumyongNameValue" value="${jumyongName}">
<input type="hidden" name="numberValueValue" id="numberValueValue" value="${numberValue}">
<input type="hidden" name="yearVal" id="yearVal" value="${year}">
<input type="hidden" name="currentPage" value="${currentPage}">
<input type="hidden" name="PURPOSE_CD" value="${PURPOSE_CD}">
<input type="hidden" name="search" id="search" value="${search}">
<input type="hidden" name="search_flag" id="search_flag" value="${search_flag}">
<input type="hidden" name="TOTALCNT" value="${listCount}">
<input type="hidden" name="gubun" value="junggi">
<input type="hidden" name="RATE1" id = "RATE1" value="" >
<input type="hidden" name="adjust111" id="adjust111" value="">

<!-- 리스트 검색 hidden 값 -->
<input type="hidden" name="YEAR_search" id="YEAR_search" value="${year}">
<input type="hidden" name="TYPE" id="TYPE" value="${TYPE}">
<input type="hidden" name="TAX_SET" id="TAX_SET" value="${TAX_SET}">
<input type="hidden" name="TAX_YN" id="TAX_YN" value="${TAX_YN}">
<input type="hidden" name="BJ_CD" id="BJ_CD" value="${BJ_CD}">
<input type="hidden" name="jumyongName" id="jumyongName" value="${jumyongName}">
<input type="hidden" name="search" id="search" value="${search}">
<input type="hidden" name="mul_fromdate" value="${mul_fromdate }">
<input type="hidden" name="mul_todate" value="${mul_todate }">

<table width="780" border="0" cellpadding="0" cellspacing="0">
	<tr>
    	<td height="43"><img src="/img/jumyong_junggi_title.gif" width="800" height="43"></td>
	</tr>
	<tr>
    	<td >
    		<table width="780" border="0" cellspacing="0" cellpadding="0">
				<tr>
        			<td height="1" bgcolor="eaeaea"></td>
      			</tr>
      			<tr>
        			<td height="14"></td>
      			</tr>     
      			<tr>
        			<td>
        				<table width="780" border="0" cellspacing="0" cellpadding="0">
          					<tr>
            					<td align="left" height="22" background="/img/tab_line_blue.gif">
            						<table border="0" cellspacing="0" cellpadding="0">
                						<tr>
                  							<td><img src="/img/sub_petition_title15.gif" width="110" height="22"></td>
               	 						</tr>
            						</table>
            					</td>
          					</tr>
							<tr>
            					<td  class="contborder_purple">
            						<table width="100%" border="0" cellspacing="0" cellpadding="0">
                						<tr>
                  							<td height="34" class="sub_stan">전체건수 : <span class="sub_stan_blue">${listCount}</span>건 </td>
                						</tr>
                						<tr>
                  							<td>
												<div style=" width:780; height:500px; padding:10px;overflow-x:auto;overflow-y:auto; scrollbar-face-color:#EEF8FB;  scrollbar-3dlight-color:#BBBDB6; 
													scrollbar-highlight-color:#EEF8FB;scrollbar-shadow-color:#BBBDB6; scrollbar-darkshadow-color:#EEF8FB;  scrollbar-track-color:#EEF8FB; scrollbar-arrow-color:#BBBDB6; "> 
                  								<table width="2000" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
			      									<!-- tr  id="tr_fixed_header"-->
			      									<tr>
								                        <td width="70px" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">관리번호</td>
								                        <td width="70px" align="center" bgcolor="e5eff8" class="sub_table_b">점용인/법인명</td>
								                        <td align="center" bgcolor="e5eff8" class="sub_table_b">과세<br/>구분</td>
								                        <td align="center" bgcolor="e5eff8" class="sub_table_b">점용지</td>
								                        <td align="center" bgcolor="e5eff8" class="sub_table_b">점용면적</td>
                        								<td align="center" bgcolor="e5eff8" class="sub_table_b">점용목적</td>
								                        <td align="center" bgcolor="e5eff8" class="sub_table_b"></td>
								                        
								                        <td align="center" bgcolor="e5eff8" class="sub_table_b">전년도점용료</td>
								                        <td align="center" bgcolor="e5eff8" class="sub_table_b">공시지가</td>
								                        <td align="center" bgcolor="e5eff8" class="sub_table_b">요율(단가)</td>
								                        <td align="center" bgcolor="e5eff8" class="sub_table_b">현년도점용료</td>
								                        <td align="center" bgcolor="e5eff8" class="sub_table_b">조정점용료</td>
								                        <td align="center" bgcolor="e5eff8" class="sub_table_b">조정계수</td>
								                        <td align="center" bgcolor="e5eff8" class="sub_table_b">기본 산출식</td>
								                        <td align="center" bgcolor="e5eff8" class="sub_table_b">조정 산출식</td>
								                        <td align="center" bgcolor="e5eff8" class="sub_table_b">납기후금액</td>
								                        <td align="center" bgcolor="e5eff8" class="sub_table_b">${REDUCTION_NAME }</td>
								                        <td align="center" bgcolor="e5eff8" class="sub_table_b">${REDUCTION_REASON_NAME }</td>
								                        
								                   	</tr>
								                    
								                    <c:choose>
													<c:when test='${blist != null && !empty blist}'>  
								                   	<c:forEach items="${blist}" var="board" varStatus="idx">
								                   	
								                    <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''">
								                        <td width="70px" height="28" align="center">${board.GAPAN_NO}</td>								                        
								                        <td width="70px" align="center">${board.OWNER_NAME}</td>
								                        <td align="center">${board.SECTION_NAME}</td>
								                        <td align="center">${board.SIDO} ${board.SIGUNGU} ${board.BJ_NM} ${board.BONBUN }</td>
								                        <td align="center">${board.PLACE_A }</td>
														<td align="center">${board.SORT_NM }</td>
														<td align="center"></td>
														
														
														
														<td width="80px" align="center"><input type="text" class="input_form1" name="SUM_LASTYEAR" value="${board.SUM_ADJUST}" style="width:70px" onkeyup="javascript:fn_addComma(this)"></td>
														<td width="80px" align="center"><input type="text" class="input_form1" name="PRICE" value="${board.PRICE}" style="width:70px" onkeyup="javascript:fn_addComma(this)"></td>
														<td width="80px" align="center"><input type="text" class="input_form1" name="RATE" value="${board.RATE}" style="width:60px" ></td>
														<td width="80px" align="center"><input type="text" class="input_form1" name="SUM_YEAR" value="" style="width:70px" onkeyup="javascript:fn_addComma(this)"></td>
														<td width="80px" align="center"><input type="text" class="input_form1" name="SUM_ADJUST" value="" style="width:70px" onkeyup="javascript:fn_addComma(this)"></td>
														<td width="50px" align="center"><input type="text" class="input_form1" name="ADJUSTMENT" value="" style="width:40px"></td>
														<td width="280px" align="center"><input type="text" class="input_form1" name="FORM" value="" style="width:270px"></td>
														<td width="310px" align="center"><input type="text" class="input_form1" name="FORM_ADJUST" value="" style="width:300px"></td>
														<td width="80px" align="center"><input type="text" class="input_form1" name="OVERTAX" value="" style="width:70px" onkeyup="javascript:fn_addComma(this)"></td>
														<td width="50px" align="center"><input type="text" class="input_form1" name="REDUCTION_RATE" value="${board.REDUCTION_RATE }" style="width:40px"></td>
														<td width="100px" align="center"><input type="text" class="input_form1" name="REDUCTION_REASON" value="${board.REDUCTION_REASON}" style="width:90px"></td>
														
														<!-- 계산시 필요한 값들 -->
														<input type="hidden" name="GAPAN_NO" value="${board.GAPAN_NO}">
														<input type="hidden" name="GP_TYP" value="${board.GP_TYP}">
														<input type="hidden" name="CHECK_YN" value="${board.CHECK_YN}">
														<input type="hidden" name="AREA_AFTER" value="${board.PLACE_A}">														
														<input type="hidden" name="OLD_RATE" value="${board.OLD_RATE}">
														<input type="hidden" name="old_use_section" value="${board.TAX_GUBUN}">
														<input type="hidden" name="SUM" value="">
														<input type="hidden" name="SECTION" value="${board.SECTION }">
														
														<!-- 디비 입력시 필요한 값들 -->
														<input type="hidden" name="SIGU_CD" value="${board.SIGU_CD}">
														<input type="hidden" name="BJ_CD_ARR" value="${board.BJ_CD}">
														<input type="hidden" name="DEPT_CD" value="${board.DEPT_CD}">
														<input type="hidden" name="TAX_GUBUN" value="${board.TAX_GUBUN}">
														<input type="hidden" name="OBJ_SET" value="${board.OBJ_SET}">
														<input type="hidden" name="TAXPAYER_ID" value="${board.TAXPAYER_ID}">
														<input type="hidden" name="TAXPAYER_SET" value="${board.TAXPAYER_SET}">
														<input type="hidden" name="OCR_SIGU_CD" value="${board.OCR_SIGU_CD}">
														<input type="hidden" name="OCR_BUSEO_CD" value="${board.OCR_BUSEO_CD}">
														<input type="hidden" name="TAX_CD" value="${board.TAX_CD}">
														<input type="hidden" name="LIVE" value="${board.LIVE}">
														<input type="hidden" name="ADD_SET" value="${board.ADD_SET}">
														<input type="hidden" name="ADD_YN" value="${board.ADD_YN}">
														<input type="hidden" name="SUBUSEO_CD" value="${board.SUBUSEO_CD}">
														
                      								</tr>
				 									</c:forEach>
					 								</c:when>
													<c:otherwise>
													<tr>
														<td align="center" class="sub_table" colspan="18" height="85"> 내용이 없습니다</td>
													</tr>
													</c:otherwise>
													</c:choose>
					 
                  								</table>
                  								</br>
                  								</div>
                  							</td>
               							</tr>
                						<tr height="20"><td></td></tr>
                						<!-- tr>
	                						<td height="40" align="center">
	                							<table width="100%" border="0" cellspacing="0" cellpadding="0">
		                    						<tr>
		                    							<td align="center">
		                    								<table border="0" cellpadding="0" cellspacing="0">
						                        				<tr>
									                       			${pageing}
									                        	</tr>
									                      	</table>
									                	</td>
						                    		</tr>
						                  		</table>
						                  	</td>
						              	</tr-->
		              					<tr>
		              						<td align="center">
		              							<table width="100%" border="0" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
									            	<tr>
										            	<td>
										                	<table width="100%" border="0"  cellpadding="0" cellspacing="0"  class="sub_table">
																<tr>
															    	<td width="10%" height="26" align="left"  class="sub_table_b">&nbsp;* 세부 내역</td>		
															    </tr>
															</table>	
										                </td>
										        	</tr>
										        </table>
								            	<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
									            	<tr>
									            		<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">부과년도</td>
									                	<td width="100%" class="table_bl_left" colspan="3">
															<input name="YEAR" type="text" style="width:80px;ime-mode:disabled;" class="input_form1"  onKeyDown="onlyNumberInput();" value="${YEAR }" maxlength="4" onKeyUp="change_value(this)">
														</td>
					              					</tr>
					              					<tr>
					              						<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">산출기간</td>
									                	<td class="table_bl_left" colspan="3">
															<input name="FROMDATE" id="FROMDATE" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value="${FROMDATE }"  onKeyDown="onlyNumberInput();"   onKeyDown="onlyNumberInput();" maxlength=10>
							                          		<img src="/img/calendar_icon.gif" onclick="popUpCalendar(this, document.getElementById('FROMDATE'), 'yyyymmdd');"  style="cursor:pointer" >
								                          	<input name="TODATE" id="TODATE" type="text" class="input_form1" style="width:80px;ime-mode:disabled;"  value="${TODATE }"  onKeyDown="onlyNumberInput();" maxlength=10>
							                     			<img src="/img/calendar_icon.gif" onclick="popUpCalendar(this, document.getElementById('TODATE'), 'yyyymmdd');"  style="cursor:pointer" >
							                     			
							                     			&nbsp;&nbsp; 달수 : 
										                    <input name="PERIOD" id ="PERIOD" type="text" class="input_form1" style="width:60px;ime-mode:disabled;" value = "${PERIOD}"   onKeyDown="onlyNumberInput();" >
															<img src="/img/cal_month.gif" align="absmiddle" alt="날짜 계산" width="64" height="18" border="0" style="cursor:pointer" onClick="javascript:calDate();">
						                        			
							                          	</td>
						                        	</tr>
						                        	<tr>
					              						<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">과세일자</td>
									                	<td width="25%" class="table_bl_left" colspan="3">
															<input name="TAX_DATE" id="TAX_DATE" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value="${TAX_DATE }"  onKeyDown="onlyNumberInput();"   onKeyDown="onlyNumberInput();" maxlength=10>
							                          		<img src="/img/calendar_icon.gif" onclick="popUpCalendar(this, document.getElementById('TAX_DATE'), 'yyyymmdd');"  style="cursor:pointer" >
							                          	</td>
					              						
							                        </tr>
						                        	<tr>
						                        		<!-- td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">과징율(무단)</td>
									                	<td width="42%" class="table_bl_left">
															<input name="SURCHARGE_RATE" type="text" style="width:80px;ime-mode:disabled;"  class="input_form1"  onKeyDown="onlyNumberInput();" value="1.2">
														</td-->
														<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">납기내일자</td>
									                	<td width="" class="table_bl_left">
															<input name="INDATE" id="INDATE" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value="${TODATE }"  onKeyDown="onlyNumberInput();"   onKeyDown="onlyNumberInput();" maxlength=10>
							                          		<img src="/img/calendar_icon.gif" onclick="popUpCalendar(this, document.getElementById('INDATE'), 'yyyymmdd');"  style="cursor:pointer" >
							                          	</td>
					              						<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">납기후일자</td>
									                	<td width="42%" class="table_bl_left">
															<input name="OVERDATE" id="OVERDATE" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value=""  onKeyDown="onlyNumberInput();"   onKeyDown="onlyNumberInput();" maxlength=10>
							                          		<img src="/img/calendar_icon.gif" onclick="popUpCalendar(this, document.getElementById('OVERDATE'), 'yyyymmdd');"  style="cursor:pointer" >
							                          	</td>
						                        	</tr>
					              				</table>
					              			</td>
		              					<tr>              
			          						<td height="40" align="right">
				        						<table border="0" width="100%">
				            						<tr>
				                						<td height="40" align="right">
											                <img src="/img/accou_icon.gif" alt="계산" width="56" height="18" border="0" onclick="javascript:Calculate();" style="cursor:pointer">
											                <img src="/img/save_icon2.gif" alt="저장" width="56" height="18" border="0" onClick="javascript:submitClick();" style="cursor:pointer" >
										                </td>
					             					</tr>
					     						</table>
											</td>
		              					</tr>
	            					</table>
	            				</td>
	          				</tr>
	        			</table>
	        		</td>
	      		</tr>
	      		<tr>
			        <td height="30"></td>
		      	</tr>
			</table>
		</td>
	</tr>
</table>
</form>
</body>
</html>

