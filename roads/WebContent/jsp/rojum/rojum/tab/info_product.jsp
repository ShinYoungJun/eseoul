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
<script language="javascript" src="/js/PopupCalendar.js"></script> 
<script>
<!--	

	var savable = 0;

	function InitPage()
	{		
		if(document.getElementById("mode").value == "edit" || document.getElementById("mode").value == "add"  )
		{
			document.getElementById("view").style.display = "none";
						
			document.getElementById("edit_1").style.display= "block";
			document.getElementById("edit_1").style.pixelTop = 0;
			
			if(document.getElementById("mode").value == "add")
			{
				var date = new Date();
				var year = date.getFullYear();	
				document.getElementById("YEAR").value = year;
			}
			
		}else
		{
			document.getElementById("edit_1").style.display = "none";
			document.getElementById("view").style.display = "block";
		}
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

		productForm.submit();
		}else
		alert("산출 내역을 먼저 계산해 주십시오.");
	}


	function subTabClick(hiddenSubTabName,visibleSubTabName)
	{	
		document.getElementById(hiddenSubTabName).style.display = 'none';	
		document.getElementById(visibleSubTabName).style.display = 'block';	
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
		var period = document.getElementById("period").value;
		var rate = document.getElementById("RATE").value;
	    var price = removeComma(document.getElementById("PRICE").value);
	    var reduction_rate = document.getElementById("REDUCTION_RATE").value;
	    
	    alert(reduction_rate );
	    
	    if(price <= 0) 
	    {
		    price = 1;
		    document.getElementById("FORM").value = area_after+"㎡ X " + period + "/12개월 X " +rate +" X (100-"+reduction_rate+")/100" ;
			//현년도 점용료 계산
			var sum_year = Number(area_after)*Number(period)/12*Number(rate)*(100-Number(reduction_rate))/100;
		}else
		{
		    document.getElementById("FORM").value = area_after+"㎡ X " + period + "/12개월 X " +rate +" X " +insertComma2(price)
		    +" X (100 - "+reduction_rate+")/100" ;
			//현년도 점용료 계산
			var sum_year = Number(area_after)*Number(period)/12*Number(rate)*Number(price)*(100-Number(reduction_rate))/100;
		}
		
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

			var rate1 = Math.round((sum_year - sum_lastyear ) / sum_lastyear *100 ); // 현년도 작년도 점용료 비율
			
			if( rate1 >= 10 && rate1 <=1000)//비율이 허용 범위내에 있을때
			{			
				
				document.getElementById("rate1").value = rate1;			
//				alert(sum_lastyear);			
				getRateAjax(rate1);
				
				tempval = 1;
			}
		}

		
		if(tempval == 0) // 작년도 점용료가 없거나 비율에 해당하지 않을때
		{	 
			 document.getElementById("ADJUSTMENT").value = "1";
			 document.getElementById("FORM_ADJUST").value = document.getElementById("FORM").value+" X 1"
			 document.getElementById("sum_adjust").value = sum_year;		
			 insertComma("SUM_ADJUST");
		}
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
	
	
	 function getRateAjax(addSum)
     {

        var params = 'addsum='+addSum;
		var url = "/getRate.do" ;
        var a = sendRequest(url, params, rateFromServer, "Post");  // rateFromServer 함수에 rate 를 받아오게함
     } 

       function rateFromServer()
       {      
           if(httpRequest.readyState == 4)
           {
               if(httpRequest.status == 200)
               {
				   var adjust = httpRequest.responseText; //조정 계수를 받아옴.
				   
//				   alert("일단여기"+adjust);

	               document.getElementById("adjustment").value = adjust;
	               
	               var sum_year = removeComma(document.getElementById("sum_year").value);

	               var SUM_ADJUST = Number(sum_year)*Number(adjust);
	               var strSUM_ADJUST = String( Math.floor(SUM_ADJUST));			
				   SUM_ADJUST = parseInt(strSUM_ADJUST.substr(0, strSUM_ADJUST.length - 2) * 100); //100원 절삭
				   document.getElementById("SUM_ADJUST").value = SUM_ADJUST;

	               document.getElementById("FORM_ADJUST").value = document.getElementById("FORM").value + " X "+ adjust;

	               delete httpRequest;
               }else
               {

	               document.getElementById("FORM_ADJUST").value = document.getElementById("FORM").value;

	               document.getElementById("SUM_ADJUST").value = document.getElementById("sum_year").value;
	               
	               document.getElementById("adjustment").value = "0";
				   delete httpRequest;
               }
               
               insertComma("SUM_ADJUST");
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
	
	
	function goModify()
	{
		var year = '${product.YEAR}';
		var seq = document.getElementById("SEQ").value;

		location.href = "/jsp/gapan/gapan/tab/info_product.jsp?mode=edit";
	
		
//		location.href = "/jumyong/productInsert.do?no=${no}&currentPage=${currentPage}&countPerPage=${countPerPage}"
//		+"&mode=edit&year="+year+"&seq="+seq+"&section=${section}";
	}
	
	function goAdd()
	{
		var year = '${product.YEAR}';
		var seq = document.getElementById("SEQ").value;

		location.href = "/jsp/gapan/gapan/tab/info_product.jsp?mode=add";
	
		
//		location.href = "/jumyong/productInsert.do?no=${no}&currentPage=${currentPage}&countPerPage=${countPerPage}"
//		+"&mode=edit&year="+year+"&seq="+seq+"&section=${section}";
	}
	
	
	
	-->
	
	
	
	
</script>

</head>

<%String mode = request.getParameter("mode");%>	

<body onload="javascript:InitPage();"  border="0">
<form name="productForm" id="productForm" method="post" action = "/jumyong/productInsert.do" >
<input name="no" value="${no}" type="hidden" >
<input name="mode"  id = "mode" value="<%=mode%>" type="hidden" >
<input name="seq"  id = "SEQ" value="${seq}" type="hidden" >
				
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
							                    <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용면적/</td>
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
									                
									                
  										                	<img src="/img/add_icon.gif" alt="추가" border="0" onclick="javascript:goAdd()" style="cursor:pointer" >
									                
									                
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
							

							<div id="edit_1" style="width:100%;display:none;">
		  					<table width="100%" border="0" cellspacing="0" cellpadding="0">
					              <tr>
					                <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
					                   <tr>
					                    <td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b"  style="direction:rtl" >기준년도</td>
					                    <td width="42%" bgcolor="eaeaea" class="table_bl_left" >

											<input name="YEAR" id="YEAR" type="text" value = "${product.YEAR}" style="width:50px;ime-mode:disabled;"  class="input_form1"  onKeyDown="onlyNumberInput();" style="direction: rtl">&nbsp년 

						                
										</td>                     
										<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">공시지가</td>
					                    <td width="32%" bgcolor="eaeaea" class="table_bl_left" >
						                   		<input name="PRICE" ID="PRICE" value="${product.PRICE}" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" onkeyup="javascript:fn_addComma(this)"  onKeyDown="onlyNumberInput();" style="direction: rtl">원	 
						                   <img src="/img/landPrice.gif" alt="공시지가조회" height="18" border="0" style="cursor:pointer" onclick="javascript:openLandPricePopUp()"; >
										</td> 
					                  </tr> 
					                  
					                  
					                  
					                  <tr>
					                    <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용면적/개</td>
					                    <td bgcolor="eaeaea" class="table_bl_left" >

						                    <input name="AREA_AFTER" id="AREA_AFTER" type="text" class="input_form1" style="width:50px;ime-mode:disabled;" value="${product.AREA_AFTER}"   onKeyDown="onlyNumberInput();" style="direction: rtl">㎡

											
										</td>                     
										<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">요율/단가</td>
					                    <td bgcolor="eaeaea" class="table_bl_left" >

												<input name="RATE"  id="RATE" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value="${product.RATE}"  onKeyDown="onlyNumberInput();" style="direction: rtl">

										</td> 
					                  </tr>                   
					                  
					                  
									<tr>
					                    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">산출기간</td>
					                    <td bgcolor="eaeaea" class="table_bl_left" ><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					                        <tr>
					                          <td>

					                          		<input name="FROMDATE" id="FROMDATE" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value="${product.FROMDATE}"  onKeyDown="onlyNumberInput();"   onKeyDown="onlyNumberInput();" maxlength=8>

					                          </td>
					                          <td>
					                          <img src="/img/calendar_icon.gif" onclick="popUpCalendar(this, document.getElementById('FROMDATE'), 'yyyymmdd');">
					                          
					                          </td>
					                          
					                          
					                          
					                          <td width="16" align="center">~</td>
					                          <td>

						                          	<input name="TODATE" id="TODATE" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value="${product.TODATE}"  onKeyDown="onlyNumberInput();" maxlength=8>

					                          </td>
					                          <td>
					                     		<img src="/img/calendar_icon.gif" onclick="popUpCalendar(this, document.getElementById('TODATE'), 'yyyymmdd');">
					                     		
					                     													<img src="/img/cal_month.gif" alt="달수계산" height="18" border="0" style="cursor:pointer" onClick="javascript:calDate();">
					                     		
					                          </td>
					                        </tr>
					                    </table></td>
					                    
					                    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">개월수</td>
					                    <td bgcolor="eaeaea" class="table_bl_left" >

						                    	<input name="PERIOD" id ="PERIOD" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value = "${product.PERIOD}"   onKeyDown="onlyNumberInput();" style="direction: rtl">개월

										</td>
					                 
					                  </tr>
					                   <tr>
					                    <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">감면사유</td>
					                    <td bgcolor="eaeaea" class="table_bl_left" >

						                    <input name="REDUCTION_REASON" id="REDUCTION_REASON" type="text" class="input_form1" style="width:300px;ime-mode:disabled;" value="${product.REDUCTION_REASON}"   >

											
										</td>                     
										<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">감면율</td>
					                    <td bgcolor="eaeaea" class="table_bl_left" >

												<input name="REDUCTION_RATE"  id="REDUCTION_RATE" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value="${product.REDUCTION_RATE}"  onKeyDown="onlyNumberInput();" style="direction: rtl">%

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
					                    <td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">조정 계수</td>
					                    <td width="42%" bgcolor="eaeaea" class="table_bl_left" >
												<input name="ADJUSTMENT" id="ADJUSTMENT" type="text" class="input_form1" style="width:120px;ime-mode:disabled;" value="${product.ADJUSTMENT}"   onKeyDown="onlyNumberInput();" style="direction: rtl">
										</td>                     
					                    	<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">작년도 점용료</td>
						                    <td width="32%" bgcolor="eaeaea" class="table_bl_left" >
								                    <input name="SUM_LASTYEAR" id="SUM_LASTYEAR" type="text"  class="input_form1" style="width:80px;ime-mode:disabled;" value="${product.SUM_LASTYEAR}"   onKeyDown="onlyNumberInput();" onkeyup="javascript:fn_addComma(this)" style="direction: rtl">원
											</td>  
										
										
										</tr>  
					
										
					
					                  <tr>
					                   <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">기본 산출식</td>
					                    <td bgcolor="eaeaea" class="table_bl_left" >

												<input name="FORM" ID="FORM" type="text" class="input_form1" style="width:300px" value="${product.FORM}">

										</td>
											<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">현년도 점용료</td>
						                    <td width="32%" bgcolor="eaeaea" class="table_bl_left" >

													<input name="SUM_YEAR" id="SUM_YEAR" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value="${product.SUM_YEAR}"   onKeyDown="onlyNumberInput();" onkeyup="javascript:fn_addComma(this)" style="direction: rtl">원

											</td>                   
					                  
					                 
					                  </tr> 
					               
					                   <tr>
					                   <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">조정 산출식</td>
					                    <td bgcolor="eaeaea" class="table_bl_left" >

											<input name="FORM_ADJUST" id="FORM_ADJUST" type="text" class="input_form1" style="width:300px" value="${product.FORM_ADJUST}">

										</td> 
					                    
										<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">조정 점용료</td>
					                    <td bgcolor="eaeaea" class="table_bl_left" >

												<input name="SUM_ADJUST" id="SUM_ADJUST" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value="${product.SUM_ADJUST}"  onKeyDown="onlyNumberInput();" onkeyup="javascript:fn_addComma(this)" style="direction: rtl">원

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

