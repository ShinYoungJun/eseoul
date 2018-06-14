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
<script language="javascript" src="/js/Ajax_request.js"></script>
<script>
<!--
	function InitPage()
	{	
		setYear();
		//insertComma("PRICE_VIEW");	
		//insertComma("SUM_LASTYEAR_VIEW");
		//insertComma("SUM_YEAR_VIEW");
		//insertComma("SUM_ADJUST_VIEW");
		
		
		//insertComma("PRICE");
		//insertComma("SUM_LASTYEAR");
		//insertComma("SUM_YEAR");
		//insertComma("SUM_ADJUST");
		//parent.TabUp_Img("sanchul");

		var	adminno	= document.getElementById("ADMIN_NO").value;
		var	seq		= document.getElementById("seq").value;	
		
	
	}

	function	View(adminno, seq)
	{
	//	parent.BugwaCatch(year, seq);	//	산출 정보의 데이터를 뷰파일로 보낸다.
		params	= "ADMIN_NO=" + adminno + "&SEQ=" + seq;

		sendRequest("/jumyong/saewe/sanchulinfo_view.do", params, "GET", Result_InfoView);

		parent.BugwaView(seq);
	}


	function	Result_InfoView(obj)
	{
		//document.write(obj);

        var xmldoc 	= new ActiveXObject("Microsoft.XMLDOM");
        var form 	= document.form;

        xmldoc.async	= false;
		xmldoc.loadXML(obj);

//		form.YEAR.value			=	xmldoc.getElementsByTagName("YEAR").item(0).text;
//		form.PRICE.value		=	xmldoc.getElementsByTagName("PRICE").item(0).text;
//		form.AREA_AFTER.value	=	xmldoc.getElementsByTagName("AREA_AFTER").item(0).text;
//		form.RATE.value			=	xmldoc.getElementsByTagName("RATE").item(0).text;
//		form.FROMDATE.value		=	xmldoc.getElementsByTagName("FROMDATE").item(0).text;
//		form.TODATE.value		=	xmldoc.getElementsByTagName("TODATE").item(0).text;
//		form.SUM_LASTYEAR.value	=	xmldoc.getElementsByTagName("SUM_LASTYEAR").item(0).text;
//		form.SUM_YEAR.value		=	xmldoc.getElementsByTagName("SUM_YEAR").item(0).text;
//		form.ADJUSTMENT.value	=	xmldoc.getElementsByTagName("ADJUSTMENT").item(0).text;
//		form.SUM_ADJUST.value	=	xmldoc.getElementsByTagName("SUM_ADJUST").item(0).text;
//		form.FORM.value			=	xmldoc.getElementsByTagName("FORM").item(0).text;
//		form.FORM_ADJUST.value	=	xmldoc.getElementsByTagName("FORM_ADJUST").item(0).text;
	}


	function submitClick()
	{
		var productForm = document.productForm;
		
		//comma제거

		removeComma2("PRICE");
		removeComma2("SUM_LASTYEAR");
		removeComma2("SUM_YEAR");
		removeComma2("SUM_ADJUST_EDIT");
		productForm.submit();
	}


	function subTabClick(hiddenSubTabName,visibleSubTabName)
	{	
		document.getElementById(hiddenSubTabName).style.display = 'none';	
		document.getElementById(visibleSubTabName).style.display = 'block';	
	}

	function goModify()
	{
		var year = document.getElementById("year1").value;
		var seq = document.getElementById("SEQ").value;
		
		location.href = "/jumyong/junggi/junggi_product.do?ADMIN_NO=${no}&year=${year}&currentPage=${currentPage}&countPerPage=${countPerPage}"
		+"&mode=edit";
//		location.href = "/jumyong/productInsert.do?no=${no}&currentPage=${currentPage}&countPerPage=${countPerPage}"
//		+"&mode=edit&year="+year+"&seq="+seq+"&section=${section}";
	}
	
	

	
	
	//add 화면 이동
	function goAdd(adminNo,currentPage,countPage)
	{
		var seq = document.getElementById("SEQ").value;
		location.href("/jumyong/junggi/junggi_product.do?ADMIN_NO="+adminNo+"&SEQ="+seq+"&currentPage="+currentPage+"&mode=add");
	}
	
	
	//edit 화면 이동
	function goModify(adminNo,currentPage,countPage)
	{
		var seq = document.getElementById("SEQ").value;
		location.href("/jumyong/junggi/junggi_product.do?ADMIN_NO="+adminNo+"&SEQ="+seq+"&currentPage="+currentPage+"&mode=edit");
	}
	
	
	function Calculate()
	{
		calDate();
		var area_after = document.getElementById("AREA_AFTER_EDIT").value;
		var period = document.getElementById("PERIOD_EDIT").value;
		var rate = document.getElementById("RATE").value;
	    var price = removeComma(document.getElementById("PRICE").value);
	    
	    document.getElementById("FORM").value = area_after+"㎡ X " + period + "/12 개월 X " +rate +" X " +insertComma2(price) ;

		//현년도 점용료 계산

		var sum_year = Number(area_after)*Number(period)/12*Number(rate)*Number(price);			

        var strSUM_ADJUST = String( Math.floor(sum_year)); // 소수점 제거        
	    sum_year = parseInt(strSUM_ADJUST.substr(0, strSUM_ADJUST.length - 2) * 100); //100원 절삭			   
			
		document.getElementById("sum_year").value = sum_year;
		
		insertComma("sum_year");
		
		//현년도 점용료 계산 끝
		
		//조정 계수 및 조정 점용료 계산		
		var sum_lastyear = removeComma(document.getElementById("SUM_LASTYEAR").value);		// 작년도 점용료
		
		var tempval = 0;
		
		
		

		if(sum_lastyear >0)//작년도 점용료가 있을때
		{


			var rate1 = Math.floor((sum_year - sum_lastyear ) / sum_lastyear *100 ); // 현년도 작년도 점용료 비율
			
			alert(sum_year+"  "+sum_lastyear);

			if( rate1 >= 10 && rate1 <=1000)//비율이 허용 범위내에 있을때
			{
			
				document.getElementById("rate1").value = rate1;			
				
				alert("rate1="+rate1);

				getRateAjax(rate1);
				
				tempval = 1;
			}else
				document.getElementById("sum_old").value = sum_year;
		}
		
		if(tempval == 0) // 작년도 점용료가 없거나 비율에 해당하지 않을때
		{
			 document.getElementById("ADJUSTMENT").value = "1";
			 document.getElementById("FORM_ADJUST_EDIT").value = document.getElementById("FORM").value+" X 1"
			 document.getElementById("SUM_ADJUST_EDIT").value = sum_year;		
			 insertComma("SUM_ADJUST_EDIT");
		}
		
		

		
		
		
	}
	
	function calDate()
	{

		var fromDate = removeDash(document.getElementById("FROMDATE_EDIT").value);
		var toDate = removeDash(document.getElementById("TODATE_EDIT").value);
		var period = getDiffMon(fromDate,toDate)  ;
		document.getElementById("PERIOD_EDIT").value = period;
		var fromDay1 = new Date(fromDate.substr(0,4),fromDate.substr(4,2),fromDate.substr(6,2));
		var toDay1 = new Date(toDate.substr(0,4),toDate.substr(4,2),toDate.substr(6,2));
	}
	
	
	function calDate_sub()
	{

		var fromDate = removeDash(document.getElementById("FROMDATE").value);
		var toDate = removeDash(document.getElementById("TODATE").value);
		var period = getDiffMon(fromDate,toDate)  ;
		document.getElementById("PERIOD").value = period;
		var fromDay1 = new Date(fromDate.substr(0,4),fromDate.substr(4,2),fromDate.substr(6,2));
		var toDay1 = new Date(toDate.substr(0,4),toDate.substr(4,2),toDate.substr(6,2));
	}
	
	function fun1()
	{
			alert(" adjust= "+document.getElementById("adjust111").value);
		
		
	               var adjust = document.getElementById("ADJUSTMENT").value;
	               
               		alert('${old_use_section}');
               		
               		if('${old_use_section}' == '1')
               		{
	               
		         //    var sum_year = removeComma(document.getElementById("sum_year").value);
		           	   var sum_lastyear =document.getElementById("sum_lastyear").value;
		               var SUM_ADJUST = Number( removeComma(sum_lastyear))*Number(adjust);
		               var strSUM_ADJUST = String( Math.floor(SUM_ADJUST));
					   SUM_ADJUST = parseInt(strSUM_ADJUST.substr(0, strSUM_ADJUST.length - 2) * 100); //100원 절삭
					   document.getElementById("SUM_ADJUST_EDIT").value = SUM_ADJUST;


					   document.getElementById("FORM_ADJUST_EDIT").value = sum_lastyear + "원 X "+ adjust;
				   }else if('${old_use_section}' == '2')
				   {
				   		//작년도 1년치 점용료가 없으므로 새로 구함

		               	var rate = '${old_rate}';
	    				var price = '${old_price}';
						var area_after = document.getElementById("AREA_AFTER_EDIT").value;
						
						var strSUM_ADJUST = String( Math.floor(SUM_ADJUST));

						//현년도 점용료 계산

						var SUM_ADJUST = Number(area_after)*12/12*Number(rate)*Number(price)*Number(adjust);
						
				        var strSUM_ADJUST = String( Math.floor(SUM_ADJUST)); // 소수점 제거        
				        
					    SUM_ADJUST = parseInt(strSUM_ADJUST.substr(0, strSUM_ADJUST.length - 2) * 100); //100원 절삭
						document.getElementById("SUM_ADJUST_EDIT").value = SUM_ADJUST;
						

						

						
						

					   document.getElementById("FORM_ADJUST_EDIT").value = area_after+"㎡ X 12/12 개월 X " +rate +" X " +insertComma2(price)+" X "+adjust ;
					   alert("1111111111111111");
				   }
				   
				   document.getElementById("sum_old").value = SUM_ADJUST;
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
				   
				   
				   document.getElementById("adjust111").value = adjust;
				   document.getElementById("ADJUSTMENT").value = adjust;
				   
				   alert(adjust);
				   
				  fun1();
				   
				   
					
	               delete httpRequest;
               }else
               {

	               document.getElementById("FORM_ADJUST_EDIT").value = document.getElementById("FORM").value;

	               document.getElementById("SUM_ADJUST_EDIT").value = document.getElementById("sum_year").value;
	               
	               document.getElementById("adjustment").value = "0";

				   delete httpRequest;
               }
               
               insertComma("SUM_ADJUST_EDIT");
               
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
	
	
		//view 화면 이동
	function goView(adminNo,seq,currentPage,countPage,year)
	{
		location.href("/jumyong/junggi/junggi_view.do?ADMIN_NO="+adminNo+"&SEQ="+seq+"&currentPage="+currentPage+"&year="+year);
		
	}
	
	
	
	
	
	function setYear()
	{
		now = new Date();
		//Y = now.getYear();	// 더이상 지원 안함
		Y = now.getFullYear();
		var date = new Date();
		
		
		strYear = "${product.YEAR}";
		
		for(var i = 0 ; i < 10 ; i++){
			  newItem = new Option(i);
			  document.getElementById("YEAR_EDIT").options[i]  = newItem;
			  document.getElementById("YEAR_EDIT").options[i].text = Y+(10-i);
			  document.getElementById("YEAR_EDIT").options[i].value = Y+(10-i);
			  if(strYear == Y+(10-i)) document.getElementById("YEAR_EDIT").options[i].selected = true;
		}
		

		for(var i = 0 ; i < 10 ; i++){
			  newItem = new Option(i);
			  document.getElementById("YEAR_EDIT").options[i+10]  = newItem;
			  document.getElementById("YEAR_EDIT").options[i+10].text = Y-i;
			  document.getElementById("YEAR_EDIT").options[i+10].value = Y-i;
			  if(strYear == Y-i) document.getElementById("YEAR_EDIT").options[i+10].selected = true;
		} 	
	}
	
	
	function changeYear(yearVal)
	{
		document.getElementById("FROMDATE_EDIT").value = yearVal+"-01-01";
		document.getElementById("TODATE_EDIT").value = yearVal+"-12-31";
	}
	
	//공시지가 팝업
	function openLandPricePopUp()
	{
		var winW = 320;
		var winH = 133;
		var status ="toolbar=no, location=no, directories=no, status=no, menubar=no, resizable=no, scrollbars=no, width="+winW+", height="+winH+", left=0, top=0"
		window.open('/jsp/jumyong/jumyong/officialLandPrice.html', 'win', status);	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	function Calculate_Sub()
	{
		savable = 1;
		if(confirm("개월수를 자동 계산하시겠습니까?"))
			calDate_sub();
		var area_after = document.getElementById("AREA_AFTER").value;
		area_after = area_after * -1;
		var period = document.getElementById("period").value;
		
		var old_area_after = "${old_area_after}";
		var old_period = "12";
		var old_sum_adjust = document.getElementById("sum_old").value;
		
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
		
		//old_area_after = Number(old_area_after) * -1;
		
		
		//점용료 계산
		var result = (Number(area_after)/Number(old_area_after)*Number(period)/Number(old_period)*Number(old_sum_adjust));
		
		
		//소수점 없애기
		result = Math.floor(result);
		
		//100원 절삭 & -추가
		if(Number(result) < 100)
			strResult = "0";
		else
		{
			var strResult = result+"";
			strResult = strResult.substr(0,strResult.length - 2)+"00";
		}
		
		alert(strResult);
		
		document.getElementById("sum_adjust").value= strResult;
		
		//산출식
		document.getElementById("FORM_ADJUST").value = "( "+document.getElementById("FORM_ADJUST_EDIT").value+") * ("+period+"개월/"+old_period +"개월) * (-"+area_after+"㎡/"+old_area_after+"㎡) * -1";
//		document.getElementById("FORM").value = document.getElementById("FORM_ADJUST").value;
		document.getElementById("sum_year").value = strResult;
		document.getElementById("sum_lastyear").value = "0";		
		document.getElementById("adjustment").value = "1";
		
	}
	
	
	
	
	-->
	
	
	
	
</script>

</head>

<body onload="javascript:InitPage();"  border="0">



<form name="productForm" id="productForm" method="post" action = "/jumyong/productSubtractBeforeTaxInsert.do" >
			<input name="no" id="no" value="${no}" type="hidden" >
			<input name="area" id="area" value="${area}" type="hidden" >			
		<input name="adjust111" id="adjust111" value="" type="text" >				
						<spring:bind path="product.ADMIN_NO">
							<input name="ADMIN_NO" id="ADMIN_NO" value="${no}" type="hidden" >
						</spring:bind>
						
						<spring:bind path="product.FIRST_SEQ">
							<input name="FIRST_SEQ" id="FIRST_SEQ" value="${product.FIRST_SEQ}" type="text" >
						</spring:bind>
						
						<input name="mode"  id = "mode" value="${mode}" type="hidden" >
						
						<spring:bind path="product.SEQ">
							<input name="SEQ"  id = "SEQ" value="${product.SEQ}" type="hidden" >
						</spring:bind>
						<input name="RATE1" id = "RATE1" type="hidden"  value="" >
		      <tr>
		        <td><table width="780" border="0" cellspacing="0" cellpadding="0">
		          <tr>
		            <td class="contborder_purple">							            
							<table width="100%" border="0" cellspacing="0" cellpadding="0">
								<tr>
					                <td>
					                	 <table width="100%" border="0"  cellpadding="0" cellspacing="0"  class="sub_table">
											<tr>
										    	<td width="10%" height="26" align="left"  class="sub_table_b">* 산출 정보 리스트</td>		
										    </tr>
										</table>	
					                </td></tr>
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
							                    </tr>
							                  <c:forEach items="${productList}" var="board" varStatus="idx">
							                      <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" 
							                      onclick="javascript:goView('${board.YEAR}','${board.SEQ}');" style="cursor:pointer" >
							                        <td height="26" align="center">${idx.count}</td>
							                        <td align="center">${board.YEAR}</td>
							                        <td align="center">${rnic:insertComma2(board.PRICE)}</td>
							                        <td align="center">${board.AREA_AFTER}</td>
							                        <td align="center">${board.RATE}</td>
							                        
							                        <td align="center">${rnic:addDash(board.FROMDATE)}~${rnic:addDash(board.TODATE)}</td>
							                        <td align="center">${rnic:insertComma2(board.SUM_LASTYEAR) }</td>
							                        <td align="center">${rnic:insertComma2(board.SUM_YEAR) }</td>
							                        <td align="center">${rnic:insertComma2(board.SUM_ADJUST) }</td>
							                    
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

							<div id="edit" style="width:100%;">
		  					<table width="100%" border="0" cellspacing="0" cellpadding="0">
		  					<tr>
				                <td>
				                	 <table width="100%" border="0"  cellpadding="0" cellspacing="0"  class="sub_table">
										<tr>
									    	<td width="10%" height="26" align="left"  class="sub_table_b">* 세부 내역</td>		
									    </tr>
										<tr>
									    	<td width="10%" height="26" align="left"  class="sub_table_b">- 현년도 정기분 산출</td>		
									    </tr>									    
									</table>	
				                </td></tr>
					              <tr>
					                <td>
					                	<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
						                   <tr>
						                    <td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">부과년도</td>
						                    <td width="42%" bgcolor="eaeaea" class="table_bl_left" >
						                      <select name="YEAR_EDIT" id="YEAR_EDIT" class="input_form1" style="width:130px" onchange="changeYear(this.value);">
						                      </select>							                
											</td>                     
											<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">공시지가</td>
						                    <td width="32%" bgcolor="eaeaea" class="table_bl_left" >
							                   	<input name="PRICE" ID="PRICE" value="${product.PRICE}" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" onkeyup="javascript:fn_addComma(this)"  onKeyDown="onlyNumberInput();" >원	 
							                  <img src="/img/landPrice.gif" alt="공시지가조회" height="18" border="0" style="cursor:pointer" onclick="javascript:openLandPricePopUp()"; >
											</td> 
						                  </tr> 
						                  <tr>
						                    <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용면적</td>
						                    <td bgcolor="eaeaea" class="table_bl_left" >
							                    <input name="AREA_AFTER_EDIT" id="AREA_AFTER_EDIT" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value="${old_area_after}"   onKeyDown="onlyNumberInput();" >㎡
											</td>                     
											<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">산출요율</td>
						                    <td bgcolor="eaeaea" class="table_bl_left" >
													<input name="RATE"  id="RATE" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value="${product.RATE}"  onKeyDown="onlyNumberInput();" >
											</td> 
						                  </tr>     
											<tr>
							                    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">현년도기간</td>
							                    <td bgcolor="eaeaea" class="table_bl_left" ><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
							                        <tr>
							                          <td>
							                          			<input name="FROMDATE_EDIT" id="FROMDATE_EDIT" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value="${product.FROMDATE}"  onKeyDown="onlyNumberInput();"   onKeyDown="onlyNumberInput();" maxlength=10>
							                          </td>
							                          <td>
								                          <img src="/img/calendar_icon.gif" onclick="popUpCalendar(this, document.getElementById('FROMDATE'), 'yyyymmdd');"  style="cursor:pointer" >
							                          </td>
							                          
							                          <td width="16" align="center">~</td>
							                          <td>
									                          	<input name="TODATE_EDIT" id="TODATE_EDIT" type="text" class="input_form1" style="width:80px;ime-mode:disabled;"  value="${product.TODATE}"  onKeyDown="onlyNumberInput();" maxlength=10>
							                          </td>
							                          <td>
							                     		<img src="/img/calendar_icon.gif" onclick="popUpCalendar(this, document.getElementById('TODATE'), 'yyyymmdd');"  style="cursor:pointer" >
							                          </td>
							                        </tr>
							                    </table></td>
							                    <td bgcolor="eaeaea" class="table_bl_left" colspan="2">
							                    	<!--
							                    	 일수 : <input name="dateCount" id="dateCount" type="text" class="input_form1" style="width:60px;ime-mode:disabled;"  onKeyDown="onlyNumberInput();" >-->
							                    	달수 : 
								                    	<input name="PERIOD_EDIT" id ="PERIOD_EDIT" type="text" class="input_form1" style="width:60px;ime-mode:disabled;" value = "${product.PERIOD}"   onKeyDown="onlyNumberInput();" >
													<img src="/img/detail_icon.gif" alt="날짜 계산" width="56" height="18" border="0" style="cursor:pointer" onClick="javascript:calDate();">
												</td>
							                 
							                  </tr>
					                  	</table>
					                  </td>
					                </tr>
					                  
					                <tr>              
					                	<td height="40" align="right">
							                <img src="/img/accou_icon.gif" alt="계산" width="56" height="18" border="0" onclick="javascript:Calculate();" style="cursor:pointer">
						                </td>
									</tr>
									<tr>
										<td>
					                  		<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
						                  		<tr>
							                    	<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">작년도 점용료 구분</td>
								                    <td width="42%" bgcolor="eaeaea" class="table_bl_left" >${product.USE_SECTIONNAME}</td>  
													<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">작년도 점용료식</td>
								                    <td width="32%" bgcolor="eaeaea" class="table_bl_left" >${old_form}</td>                   
												</tr>  
					                  			<tr>
							                    	<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">작년도 점용료</td>
								                    <td width="42%" bgcolor="eaeaea" class="table_bl_left" >
																<input name="SUM_LASTYEAR" id="SUM_LASTYEAR" type="text"  class="input_form1" style="width:80px;ime-mode:disabled;" value="${product.SUM_LASTYEAR}"   onKeyDown="onlyNumberInput();" onkeyup="javascript:fn_addComma(this)" style="text-align:right">원
													</td>  
													<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">현년도 점용료</td>
								                    <td width="32%" bgcolor="eaeaea" class="table_bl_left" >
																<input name="SUM_YEAR" id="SUM_YEAR" type="text" class="input_form1" style="width:120px;ime-mode:disabled;" value="${product.SUM_YEAR}"   onKeyDown="onlyNumberInput();" onkeyup="javascript:fn_addComma(this)" >원
													</td>                   
												</tr>  
								                  <tr>
								                    <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">조정 계수</td>
								                    <td bgcolor="eaeaea" class="table_bl_left" >
																	<input name="ADJUSTMENT" id="ADJUSTMENT" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value="${product.ADJUSTMENT}"   onKeyDown="onlyNumberInput();" >
													</td>                     
													<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">조정 점용료</td>
								                    <td bgcolor="eaeaea" class="table_bl_left" >
																	<input name="SUM_ADJUST_EDIT" id="SUM_ADJUST_EDIT" type="text" class="input_form1" style="width:120px;ime-mode:disabled;" value="${product.SUM_ADJUST}"  onKeyDown="onlyNumberInput();" onkeyup="javascript:fn_addComma(this)" >원
													</td> 
								                  </tr>
								                   <tr>
								                    <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">기본 산출식</td>
								                    <td colspan="3" bgcolor="eaeaea" class="table_bl_left" >
																	<input name="FORM" ID="FORM" type="text" class="input_form1" style="width:600px" value="${product.FORM}">
													</td>
													
								                  </tr> 
								                  					                  
					                  
					                  
								                  <tr>	
									                  	<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">조정 산출식</td>
									                    <td colspan="3" bgcolor="eaeaea" class="table_bl_left" >
																		<input name="FORM_ADJUST_EDIT" id="FORM_ADJUST_EDIT" type="text" class="input_form1" style="width:600px" value="${product.FORM_ADJUST}" >
														</td>
							                  	 </tr>
							                  
							                </table>
							              </td>
							            </tr>
						             <tr>              
						             	<td  height="26" align="left"  class="sub_table_b">- 감소분 계산</td>		
									</tr>
									</table>

									

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
					                    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">산출기간</td>
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
												<img src="/img/cal_month.gif" alt="달수계산" height="18" border="0" style="cursor:pointer" onClick="javascript:calDate_sub();">
					                     		
					                          </td>
					                        </tr>
					                    </table></td>
					                  </tr>
					                     <tr>
					                  <td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">부과기간</td>
					                    <td width="37%" bgcolor="eaeaea" class="table_bl_left" >12
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
					                    <td bgcolor="eaeaea" class="table_bl_left" ><input id="sum_old" type="text" class="input_form1">원
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
					                
					                <img src="/img/accou_icon.gif" alt="계산" width="56" height="18" border="0" onclick="javascript:Calculate_Sub();" style="cursor:pointer">
						                </td>
					              </tr>
					              
					                
					                  
					                  <tr><td>
					                  <table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
					                  
					                   <tr>
					                   <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">조정 산출식</td>
					                    <td bgcolor="eaeaea" class="table_bl_left" >
											<spring:bind path="product.FORM_ADJUST">                                                            
											<input name="FORM_ADJUST" id="FORM_ADJUST" type="text" value="${product.FORM_ADJUST}"class="input_form1" style="width:600px" value="">
											</spring:bind>
										</td>
					                  </tr>      
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
					</td>
				</tr>
			</form>
		</body>
	</html>            
