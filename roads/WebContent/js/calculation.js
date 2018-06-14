

            function junggi_calDate()
            {

                var fromDate = removeDash(document.getElementById("FROMDATE").value);
                var toDate = removeDash(document.getElementById("TODATE").value);


                var period = junggi_getDiffMon(fromDate,toDate)  ;

                document.getElementById("PERIOD").value = period;

                var fromDay1 = new Date(fromDate.substr(0,4),fromDate.substr(4,2),fromDate.substr(6,2));

                var toDay1 = new Date(toDate.substr(0,4),toDate.substr(4,2),toDate.substr(6,2));

            }



	function calDate()
	{
		var fromDate = removeDash(document.getElementById("FROMDATE").value);
		var toDate = removeDash(document.getElementById("TODATE").value);
		
		if(document.getElementById("date_type").value=="month"){		
			var period = getDiffMon(fromDate,toDate);
		}else if(document.getElementById("date_type").value=="day"){
			var period = getDiffDay(fromDate,toDate);
		}else{
			var period = getDiffMon(fromDate,toDate);
		}
		document.getElementById("PERIOD").value = period;
	}	
	
	////////////////////////////////////////////////////////////////
	// 날짜사이의 일수 계산 함수(pkh 2009.10.15)
	
	// Check how many days there are on the inputted year and month
	// 년과 달을 입력하면, 한달에 몇일이 있는지 확인하는 함수입니다.
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


	function day_cal(yy, mm, dd){	//해당년도만의 일수 계산

		var tot = 0;
		for(var i=1;i<mm;i++){
			tot += f_dayofmonth(yy,i);
		}
		return tot+dd;
	}
	
	function f_leapyear(yy)		//윤년 구하는 함수
	{
		if (yy%4==0 && yy%100!=0 || yy%400==0)
		return 1;
		else
		return 0;
	}
	
	
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

	/////////////////////////////////////////////////////////////////////////////////////
	
    //달 차이 계산
    function junggi_getDiffMon(val1,val2)
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
	
	//달 차이 계산
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
	    
	    if(/*sdate_month==2 && */edate_month==2 && sdate_day<edate_day && sdate_day==1){	// 2월이 좀 특수한 관계로 2월1일부터 2월 말일 일때 달계산
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
	
	function sendRequest(url, params, callback, method)	
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
	 
	 if ((code > 34 && code < 41) || (code > 47 && code < 58) || (code > 95 && code < 106) || code == 8 || code == 9 || code == 13 || code == 46 || code == 190 || code == 110 || code == 189 || code == 109   )
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
		
		if(Number(value1) < 0)
			length1 = length1 - 1;
		
				
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
	
	function fixFloatCal(val){
		return  Math.round( parseFloat(val) *1000) /1000;
		
	}
	
    function calJojung(addSum){

    	var ret;
        if(addSum >= 10 && addSum < 20){
		
            ret = (1.1+((addSum/100-10/100)*3/10));
        }else if(addSum >= 20 && addSum < 50){
        	ret = 1.13+((addSum/100-20/100)*1/10);
        }else if(addSum >= 50 && addSum < 100){
        	ret = 1.16+((addSum/100-50/100)*6/100);
        }else if(addSum >= 100 && addSum < 200){
        	ret = 1.19+((addSum/100-100/100)*3/100);
        }else if(addSum >= 200 && addSum < 500){
        	ret = 1.22+((addSum/100-200/100)*1/100);
        }else if(addSum >= 500){
        	ret = 1.25+((addSum/100-500/100)*5/1000);
        }

		ret = Math.round( parseFloat(ret) *10000) /10000;

		return ret;
		
    }
    function calJojungNew(addSum){
    	var ret;
        if(addSum >= 10 && addSum < 20){
            ret = 1.10;
        }else if(addSum >= 20 && addSum < 50){
        	ret = 1.14;
        }else if(addSum >= 50 && addSum < 100){
        	ret = 1.18;
        }else if(addSum >= 100 && addSum < 200){
        	ret = 1.22;
        }else if(addSum >= 200 && addSum < 500){
        	ret = 1.26;
        }else if(addSum >= 500){
        	ret = 1.30;
        }

		//ret = Math.round( parseFloat(ret) *10000) /10000;

		return ret;
		
    }

    function calJojung2015(addSum){
    	/*
    	 * 도로를 계속하여 2개 연도 이상 점용하는 경우로서 제1항에 따라 
    	 * 산정한 연간 점용료가 전년도에 납부한 연간 점용료보다 100분의 10 이상 증가하게 되는 경우에는
    	 * 전년도에 납부한 연간 점용료보다 100분의 10이 증가된 금액으로 한다. [개정 2015.12.22] 
    	 */
    	var ret = 1.10; // (10 * 0.01 + 1)
		return ret;
    }
    
    function calJojungHachun(rate) {
    	var adjustment;
    	
    	if(10 <= rate && rate < 20){
    		adjustment = 0.1 + ( (rate * 0.01) - 0.1 ) * 3 / 10;
    		
    	}else if(20 <= rate && rate < 50){
    		adjustment = 0.13 + ( (rate * 0.01) - 0.2 ) * 1 / 10;
    		
    	}else if(50 <= rate && rate < 100){
    		adjustment = 0.16 + ( (rate * 0.01) - 0.5 ) * 6 / 100;
    		
    	}else if(100 <= rate && rate < 200){
    		adjustment = 0.19 + ( (rate * 0.01) - 1 ) * 3 / 100;
    		
    	}else if(200 <= rate && rate < 500){
    		adjustment = 0.22 + ( (rate * 0.01) - 2 ) * 1/ 100;
    		
    	}else{
    		adjustment = 0.25 + ( (rate * 0.01) - 5 ) * 5 / 1000;
    	}
    	adjustment = adjustment.toFixed(2);
    	return adjustment; 
		
    }
    
    
    function setFROMTO(num,ifnum,tonum){
    	if(num == ifnum){
    		return tonum;
    	}else{
    		return num;
    	}
    }
    
    
    
    function inquiryVatYN(section,type,purposecd,sum){

		var retVal =String(section)+String(type)+String(purposecd);
		
    	// 무단일때 
    	if(retVal.substring(0,1) == "3"){
    		return 0;
    	// 무단 아닐때
    	}else{
    		// 무단 아니면서 특정 목정일떄
    		if(
    				retVal.substring(1,5) == "1010" ||
    				retVal.substring(1,5) == "1030" ||
    				retVal.substring(1,5) == "1040" ||
    				//retVal.substring(1,5) == "1921" ||
    				//retVal.substring(1,5) == "1922" ||
    				retVal.substring(1,5) == "1B20" ||
    				retVal.substring(1,5) == "1B50" ||
    				retVal.substring(1,5) == "2011" ||
    				retVal.substring(1,5) == "2013" ||
    				retVal.substring(1,5) == "2014" ||
    				retVal.substring(1,5) == "2021" ||
    				retVal.substring(1,5) == "2127" ||
        			retVal.substring(1,5) == "2227" ||
        			retVal.substring(1,5) == "2327" ||
        			retVal.substring(1,5) == "2427" ||
        			retVal.substring(1,5) == "2121" ||
        			retVal.substring(1,5) == "2221" ||
        			retVal.substring(1,5) == "2321" ||
        			retVal.substring(1,5) == "2421" ||
        			retVal.substring(1,5) == "3011" ||
        			retVal.substring(1,5) == "3013" ||
        			retVal.substring(1,5) == "3014" ||
        			retVal.substring(1,5) == "3021" ||
        			retVal.substring(1,5) == "3128"){
    			
    			return 0;
    		// vat 그대로
    		}else{
    			return Math.floor(parseFloat(sum)/100)*10;
    		}
    	}
    }
	