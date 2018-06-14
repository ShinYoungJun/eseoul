<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
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
<script language="javascript" src="/js/Ajax_request.js"></script>
<script>
<!--	


	function InitPage()
	{	
		insertComma("PRICE_VIEW");	
		insertComma("SUM_LASTYEAR_VIEW");
		insertComma("SUM_YEAR_VIEW");
		insertComma("SUM_ADJUST_VIEW");
		
		
		insertComma("PRICE");
		insertComma("SUM_LASTYEAR");
		insertComma("SUM_YEAR");
		insertComma("SUM_ADJUST");
		parent.TabUp_Img("sanchul");

		var	adminno	= document.getElementById("ADMIN_NO").value;
		var	seq		= document.getElementById("tseq").value;	
		if(seq != "")
			View(adminno, seq);
		
		if(document.getElementById("mode").value == "edit" || document.getElementById("mode").value == "add"  )
		{
			document.getElementById("view").style.display = "none";
						
			document.getElementById("edit_1").style.display= "block";
			document.getElementById("edit_1").style.pixelTop = 0;
			
			
			if(document.getElementById("mode").value == "add")
			{
				Calculate();
			}			
			
			
		}else
		{
			document.getElementById("edit_1").style.display = "none";
			document.getElementById("view").style.display = "block";
		}
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
		removeComma2("SUM_ADJUST");
		
		alert(document.getElementById("ADJUSTMENT").value);

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
		var seq = document.getElementById("seq").value;
		
		location.href = "/junggi/imposition/imposition.do?ADMIN_NO=${no}&year=${year}&currentPage=${currentPage}&countPerPage=${countPerPage}"
		+"&mode=edit";
//		location.href = "/jumyong/productInsert.do?no=${no}&currentPage=${currentPage}&countPerPage=${countPerPage}"
//		+"&mode=edit&year="+year+"&seq="+seq+"&section=${section}";
	}
	
	function Calculate()
	{
		calDate();
		var area_after = document.getElementById("AREA_AFTER").value;
		var period = document.getElementById("period").value;
		var rate = document.getElementById("RATE").value;
	    var price = removeComma(document.getElementById("PRICE").value);
	    
	    alert(price);
	    
	    document.getElementById("FORM").value = area_after+"㎡ X " + period + "/12 개월 X " +rate +" X " +insertComma2(price) ;

		//현년도 점용료 계산

		var sum_year = Number(area_after)*Number(period)/12*Number(rate)*Number(price);	
		
		alert(Number(area_after)+" "+Number(period)+" "+12*Number(rate)+" "+Number(price));
		
		alert(sum_year);
		
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
				alert(sum_lastyear);			
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
		
		var fromDay1 = new Date(fromDate.substr(0,4),fromDate.substr(4,2),fromDate.substr(6,2))
		
		var toDay1 = new Date(toDate.substr(0,4),toDate.substr(4,2),toDate.substr(6,2))		
		
//		var dateCount =(toDay1 - fromDay1)/(1000*3600*24);  
		
//		document.getElementById("dateCount").value = dateCount+1;
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
               	   alert("222+22");
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
	
	    var sdate = new Date(Number(val1.substr(0,4)),Number(val1.substr(4,2)),Number(val1.substr(6,2)));
	    var edate = new Date(Number(val2.substr(0,4)),Number(val2.substr(4,2)),Number(val2.substr(6,2)));
	
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
	
	-->
	
	
	
	
</script>

</head>

<body onload="javascript:InitPage();"  border="0">
<form name="productForm" id="productForm" method="post" action = "/junggi/imposition/imposition.do" >

<spring:bind path="imposition.ADMIN_NO">
	<input name="ADMIN_NO" id="ADMIN_NO" value="${no}" type="hidden" >
</spring:bind>

<input name="mode"  id = "mode" value="${mode}" type="hidden" >

<spring:bind path="imposition.CSEQ">
	<input name="CSEQ"  id = "SEQ" value="${seq}" type="hidden" >
</spring:bind>
<spring:bind path="imposition.TSEQ">
	<input name="TSEQ"  id = "tseq" value="${imposition.TSEQ}" type="hidden" >
</spring:bind>
<input name="RATE1" id = "RATE1" type="hidden"  value="" >
		      <tr>
		        <td><table width="780" border="0" cellspacing="0" cellpadding="0">
		          
		          <tr>
		
		            <td class="contborder_purple">							            
							<table width="100%" border="0" cellspacing="0" cellpadding="0">
							              <tr>
							                <td>
							                <table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
							                  <tr>
							                    <td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">번호</td>
							                    <td align="center" bgcolor="e5eff8" class="sub_table_b">부과년도</td>
							                    <td align="center" bgcolor="e5eff8" class="sub_table_b">면적</td>
							                    <td align="center" bgcolor="e5eff8" class="sub_table_b">요율</td>
							                    <td align="center" bgcolor="e5eff8" class="sub_table_b">산출기간</td>
							                    <td align="center" bgcolor="e5eff8" class="sub_table_b">작년도 점용료 </td>
							                    <td align="center" bgcolor="e5eff8" class="sub_table_b">현년도 점용료 </td>
							                    <td align="center" bgcolor="e5eff8" class="sub_table_b">조정 점용료 </td>
							                    <td align="center" bgcolor="e5eff8" class="sub_table_b">부과여부 </td>
							                    </tr>
							                    
							                    
							                  <c:forEach items="${impositionList}" var="board" varStatus="idx">
							                      <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" 
							                      onclick="javascript:location.href('/junggi/imposition/imposition.do?ADMIN_NO=${no}&year=${board.YEAR}&currentPage=${currentPage}&countPerPage=${countPerPage}}');" style="cursor:pointer" >
							                        <td height="26" align="center">${idx.count}</td>
							                        <td align="center">${board.YEAR}</td>
							                        <td align="center">${board.AREA_AFTER}</td>
							                        <td align="center">${board.RATE }</td>
							                        <td align="center">${rnic:addDash(board.FROMDATE)}~${rnic:addDash(board.TODATE)}</td>
							                        <td align="center">${rnic:insertComma2(board.SUM_LASTYEAR) }</td>
							                        <td align="center">${rnic:insertComma2(board.SUM_YEAR) }</td>
							                        <td align="center">${rnic:insertComma2(board.SUM_ADJUST) }</td>
							                        <td align="center">${board.TAX_YN_NAME}</td>							                        
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
							                    <td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">부과년도</td>
							                    <td width="42%" bgcolor="eaeaea" class="table_bl_left" >
							                    	<input name="YEAR1" type="text" value = "${imposition.YEAR}" disabled="true" style="width:80px"  class="input_form1">
												</td>                     
												<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">공시지가</td>
							                    <td width="32%" bgcolor="eaeaea" class="table_bl_left" >
								                   		<input name="PRICE_VIEW" id="PRICE_VIEW" value="${imposition.PRICE}" disabled="true" type="text" class="input_form1" style="width:120px"  >원                
												</td> 
							                  </tr>
							                  <tr>
							                    <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용면적</td>
							                    <td bgcolor="eaeaea" class="table_bl_left" >
								                    <input name="AREA_AFTER_VIEW" id="AREA_AFTER_VIEW" type="text" disabled="true" class="input_form1" style="width:120px" value="${imposition.AREA_AFTER}">㎡
												</td>                     
												<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">산출요율</td>
							                    <td bgcolor="eaeaea" class="table_bl_left" >
														<input name="RATE_VIEW"  id="RATE_VIEW" type="text" class="input_form1" style="width:120px" value="${imposition.RATE}" disabled="true" >
												</td> 
							                  </tr>                   
							                  
							                  
											<tr>
							                    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">현년도기간</td>
							                    <td bgcolor="eaeaea" class="table_bl_left" colspan="3">
							                    <table border="0" cellpadding="0" cellspacing="0" class="sub_stan" >
							
							                        <tr>
							                          <td width="80">
							                          		<input name="FROMDATE_VIEW" id="FROMDATE_VIEW" type="text" class="input_form1" style="width:80px" value="${imposition.FROMDATE}" disabled="true" >
							                          </td>
							                          <td width="50" align="center">~</td>
							                          <td width="150">
								                          	<input name="TODATEE_VIEW" id="TODATE_VIEW" type="text" class="input_form1" style="width:80px" value="${imposition.TODATE}" disabled="true" >
							                          </td>
							                        </tr>
							                    </table>
							                    </td>  
							                 
							                  </tr>
							
												<tr>
							                    	<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">작년도 점용료</td>
								                    <td bgcolor="eaeaea" class="table_bl_left" >
							
										                    <input name="SUM_LASTYEAR_VIEW" id="SUM_LASTYEAR_VIEW" type="text"  class="input_form1" style="width:120px"  value="${imposition.LAST_SUM}" disabled="true" >원
							
													</td>  
													<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">현년도 점용료</td>
								                    <td bgcolor="eaeaea" class="table_bl_left" >
							
															<input name="SUM_YEAR_VIEW" id=SUM_YEAR_VIEW" type="text" class="input_form1" style="width:120px" value="${imposition.SUM_YEAR}"  disabled="true" >원
							
													</td>                   
												</tr>  
							
							                  <tr>
							                    <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">조정 계수</td>
							                    <td bgcolor="eaeaea" class="table_bl_left" >
							
														<input name="ADJUSTMENT_VIEW" id="ADJUSTMENT_VIEW" type="text" class="input_form1" style="width:120px" value="${imposition.ADJUSTMENT}"  disabled="true" >
							
												</td>                     
												<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">조정 점용료</td>
							                    <td bgcolor="eaeaea" class="table_bl_left" >
							
														<input name="SUM_ADJUST_VIEW" id="SUM_ADJUST_VIEW" type="text" class="input_form1" style="width:120px" value="${imposition.SUM_ADJUST}"  disabled="true" >원
							
												</td> 
							                  </tr> 
							                   <tr>
							                    <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">기본 산출식</td>
							                    <td bgcolor="eaeaea" class="table_bl_left" >
							
														<input name="FORM_VIEW" id="FORM_VIEW" type="text" class="input_form1" style="width:300px" value="${imposition.FORM}"  disabled="true" >
							
												</td>
												
												<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">납기내 기한</td>
							                    <td bgcolor="eaeaea" class="table_bl_left" >
							
													<input name="INDATE_VIEW" id="INDATE_VIEW" type="text" class="input_form1" style="width:120px" value="${imposition.INDATE}"  disabled="true" >
							
												</td> 
												
							                  </tr> 
							                  
							                  
							                  
							                  
							                  <tr>
								                <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">조정 산출식</td>
							                    <td bgcolor="eaeaea" class="table_bl_left" >
							
													<input name="FORM_ADJUST_VIEW" id="FORM_ADJUST_VIEW" type="text" class="input_form1" style="width:300px" value="${imposition.FORM_ADJUST}"  disabled="true" >
							
												</td> 
							                    
												
												
												
												
												 <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">납기후 기한</td>
							                    <td bgcolor="eaeaea" class="table_bl_left" >
							
														<input name="OVERDATE_VIEW" id="OVERDATE_VIEW" type="text" class="input_form1" style="width:120px" value="${imposition.OVERDATE}"  disabled="true" >
							
												</td>
							                  </tr>
							                  <tr>
							                  
							                  <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">전년도기간</td>
							                   <td bgcolor="eaeaea" class="table_bl_left" >
							                    <table border="0" cellpadding="0" cellspacing="0" class="sub_stan" >
							
							                        <tr>
							                          <td width="80">
							                          		<input name="FROMDATE_LASTYEAR_VIEW" id="FROMDATE_LASTYEAR_VIEW" type="text" class="input_form1" style="width:80px" value="${imposition.LASTFROMDATE}" disabled="true" >
							                          </td>
							                          <td width="50" align="center">~</td>
							                          <td width="150">
								                          	<input name="TODATE_LASTYEAR_VIEW" id="TODATE_LASTYEAR_VIEW" type="text" class="input_form1" style="width:80px" value="${imposition.LASTTODATE}" disabled="true" >
							                          </td>
							                        </tr>
							                    </table>
							                    </td>  
							                  
							                   
							                   <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">부과일자</td>
							                    <td bgcolor="eaeaea" class="table_bl_left" >
														<input name="TAX_DATE_VIEW" id="TAX_DATE_VIEW" type="text" class="input_form1" style="width:120px" value="${imposition.TAX_DATE}"  disabled="true" >
												</td>
												
							                  </tr> 
							                  
							                  
							                </table></td>
							              </tr>
							            
							              <tr>              
							                <td height="40" align="right">
								                <table border="0" width="100%">
								                	<tr>
								                	<td >
  									                <c:if test="${showAdd == 'true'}"> 								                	
										                <a href="/junggi/imposition/imposition.do?ADMIN_NO=${no}&year=${year}&currentPage=${currentPage}&countPerPage=${countPerPage}&mode=add";">
										                	<img src="/img/add_icon.gif" alt="추가" border="0" >
										                </a>
										            </c:if>
									                </td>
  									                <c:if test="${showEdit == 'true'}"> 
										                <td width="50">
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
					                <td>
					                	<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
						                   <tr>
						                    <td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">부과년도</td>
						                    <td width="42%" bgcolor="eaeaea" class="table_bl_left" >
											<spring:bind path="imposition.YEAR">
												<input name="YEAR" id="YEAR" type="text" value = "${imposition.YEAR}" style="width:80px;ime-mode:disabled;"  class="input_form1"  onKeyDown="onlyNumberInput();" >
											</spring:bind>
							                
											</td>                     
											<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">공시지가</td>
						                    <td width="32%" bgcolor="eaeaea" class="table_bl_left" >
	
							                   		<!-- input name="PRICE" ID="PRICE" value="${imposition.PRICE}" type="text" class="input_form1" style="width:120px" onkeypress="javascript:checkWon(this);"-->
							                <spring:bind path="imposition.PRICE">   		
							                   	<input name="PRICE" ID="PRICE" value="${imposition.PRICE}" type="text" class="input_form1" style="width:120px;ime-mode:disabled;" onkeyup="javascript:fn_addComma(this)"  onKeyDown="onlyNumberInput();" >원	 
											</spring:bind>
	
							                   
							                   <a href="#">
							                   <img src="/img/inquiry_icon2.gif" alt="상세" width="56" height="18" border="0">
							                   </a>
											</td> 
						                  </tr> 
						                  <tr>
						                    <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용면적</td>
						                    <td bgcolor="eaeaea" class="table_bl_left" >
											<spring:bind path="imposition.AREA_AFTER">
							                    <input name="AREA_AFTER" id="AREA_AFTER" type="text" class="input_form1" style="width:120px;ime-mode:disabled;" value="${imposition.AREA_AFTER}"   onKeyDown="onlyNumberInput();" >㎡
											</spring:bind>
												
											</td>                     
											<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">산출요율</td>
						                    <td bgcolor="eaeaea" class="table_bl_left" >
											<spring:bind path="imposition.RATE">
													<input name="RATE"  id="RATE" type="text" class="input_form1" style="width:120px;ime-mode:disabled;" value="${imposition.RATE}"  onKeyDown="onlyNumberInput();" >
											</spring:bind>
											</td> 
						                  </tr>     
											<tr>
							                    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">현년도기간</td>
							                    <td bgcolor="eaeaea" class="table_bl_left" ><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
							                        <tr>
							                          <td>
															<spring:bind path="imposition.FROMDATE">
							                          			<input name="FROMDATE" id="FROMDATE" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value="${imposition.FROMDATE}"  onKeyDown="onlyNumberInput();"   onKeyDown="onlyNumberInput();" maxlength=10>
															</spring:bind>
							                          </td>
							                          <td>
								                          <img src="/img/calendar_icon.gif" onclick="popUpCalendar(this, document.getElementById('FROMDATE'), 'yyyymmdd');"  style="cursor:pointer" >
							                          </td>
							                          
							                          <td width="16" align="center">~</td>
							                          <td>
															<spring:bind path="imposition.TODATE">													
									                          	<input name="TODATE" id="TODATE" type="text" class="input_form1" style="width:80px;ime-mode:disabled;"  value="${imposition.TODATE}"  onKeyDown="onlyNumberInput();" maxlength=10>
															</spring:bind>
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
													<spring:bind path="imposition.PERIOD">																		                    	
								                    	<input name="PERIOD" id ="PERIOD" type="text" class="input_form1" style="width:60px;ime-mode:disabled;" value = "${imposition.PERIOD}"   onKeyDown="onlyNumberInput();" >
													</spring:bind>						                    	
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
							                    	<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">작년도 점용료</td>
								                    <td width="42%" bgcolor="eaeaea" class="table_bl_left" >
															<spring:bind path="imposition.LAST_SUM">													
											                    <input name="SUM_LASTYEAR" id="SUM_LASTYEAR" type="text"  class="input_form1" style="width:120px;ime-mode:disabled;"  value="${imposition.LAST_SUM}"   onKeyDown="onlyNumberInput();" onkeyup="javascript:fn_addComma(this)" >원
															</spring:bind>
													</td>  
													<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">현년도 점용료</td>
								                    <td width="32%" bgcolor="eaeaea" class="table_bl_left" >
															<spring:bind path="imposition.SUM_YEAR">
																<input name="SUM_YEAR" type="text" class="input_form1" style="width:120px;ime-mode:disabled;" value="${imposition.SUM_YEAR}"   onKeyDown="onlyNumberInput();" onkeyup="javascript:fn_addComma(this)" >원
															</spring:bind>
													</td>                   
												</tr>  
								                  <tr>
								                    <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">조정 계수</td>
								                    <td bgcolor="eaeaea" class="table_bl_left" >
																<spring:bind path="imposition.ADJUSTMENT">													
																	<input name="ADJUSTMENT" id="ADJUSTMENT" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value="${imposition.ADJUSTMENT}"   onKeyDown="onlyNumberInput();" >
																</spring:bind>
													</td>                     
													<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">조정 점용료</td>
								                    <td bgcolor="eaeaea" class="table_bl_left" >
																<spring:bind path="imposition.SUM_ADJUST">													
																	<input name="SUM_ADJUST" id="SUM_ADJUST" type="text" class="input_form1" style="width:120px;ime-mode:disabled;" value="${imposition.SUM_ADJUST}"  onKeyDown="onlyNumberInput();" onkeyup="javascript:fn_addComma(this)" >원
																</spring:bind>
													</td> 
								                  </tr>
								                   <tr>
								                    <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">기본 산출식</td>
								                    <td bgcolor="eaeaea" class="table_bl_left" >
																<spring:bind path="imposition.FORM">																		                    
																	<input name="FORM" ID="FORM" type="text" class="input_form1" style="width:300px" value="${imposition.FORM}">
																</spring:bind>														
													</td>
													
													<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">납기내 기한</td>
									                    <td bgcolor="eaeaea" class="table_bl_left" >
															<spring:bind path="imposition.YEAR">																				
																<input name="INDATE" id="INDATE" type="text" class="input_form1" style="width:120px" 
																value="${imposition.INDATE}" >
															</spring:bind>						
													</td> 
													
								                  </tr> 
								                  					                  
					                  
					                  
								                  <tr>	
									                  	<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">조정 산출식</td>
									                    <td bgcolor="eaeaea" class="table_bl_left" >
																	<spring:bind path="imposition.FORM_ADJUST">													
																		<input name="FORM_ADJUST" id="FORM_ADJUST" type="text" class="input_form1" style="width:300px" value="${imposition.FORM_ADJUST}" >
																		
																	
																	</spring:bind>
														</td> 														
														
														<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">납기후 기한</td>
									                    <td bgcolor="eaeaea" class="table_bl_left" >
															<spring:bind path="imposition.OVERDATE">	
															<input name="OVERDATE" id="OVERDATE" type="text" class="input_form1" style="width:120px" 
																value="${imposition.OVERDATE}" >
															</spring:bind>							
														</td>
							                  	 </tr>
							                  <tr>
								                  <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">전년도기간</td>
								                  <td bgcolor="eaeaea" class="table_bl_left" >
								                    <table border="0" cellpadding="0" cellspacing="0" class="sub_stan" >
								                        <tr>
								                          <td width="80">
															<spring:bind path="imposition.LASTFROMDATE">
								                          		<input name="LASTFROMDATE" id="LASTFROMDATE" type="text" class="input_form1" style="width:80px" 
								                          		value="${imposition.LASTFROMDATE}" >
															</spring:bind>
								                          </td>
								                          <td width="50" align="center">~</td>
								                          <td width="150">
															<spring:bind path="imposition.LASTTODATE">								                          
									                          	<input name="LASTTODATE" id="LASTTODATE" type="text" class="input_form1" style="width:80px" 
									                          	value="${imposition.LASTTODATE}" >
									                        </spring:bind>
								                          </td>
								                        </tr>
								                    </table>
								                    </td>
								                   <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">부과일자</td>
								                    <td bgcolor="eaeaea" class="table_bl_left" >
														<spring:bind path="imposition.TAX_DATE">																																		
															<input name="TAX_DATE" id="TAX_DATE" type="text" class="input_form1" style="width:120px" value="${imposition.TAX_DATE}"   >
														</spring:bind>							
													</td>
							                  </tr>
							                </table>
							              </td>
							            </tr>
							            <tr> 
											<td height="40" align="right">
												<img src="/img/save_icon2.gif" alt="저장" width="56" height="18" border="0" onClick="javascript:submitClick();" style="cursor:pointer" >
											</td>
										</tr>
									</table>
									</div>
								</td>
							</tr>
						</table>
					</td>
				</tr>
			</form>
		</body>
	</html>            
