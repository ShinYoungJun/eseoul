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
	var savable = 0;
	
	function InitPage()
	{	
		setParentYear('${product.YEAR}');
	
	

//		insertComma("SUM_LASTYEAR_VIEW");
//		insertComma("SUM_YEAR_VIEW");
//		insertComma("SUM_ADJUST_VIEW");

		insertComma("SUM_YEAR");		
		insertComma("SUM_LASTYEAR");
		insertComma("SUM_ADJUST");		
		insertComma("LICENSE_TAX");				
		
		parent.document.getElementById("seq").value = document.getElementById("seq").value;
	
		if(document.getElementById("mode").value == "edit" || document.getElementById("mode").value == "add"  )
		{
			document.getElementById("view").style.display = "none";			
			document.getElementById("edit").style.display= "block";
			
			var date = new Date();
			var year = date.getFullYear();	
			
			document.getElementById("YEAR").value = year;
			
		}else
		{		
			document.getElementById("edit").style.display = "none";
			document.getElementById("view").style.display = "block";
		}
	}
		
	// 입력, 수정시 저장 
	function submitClick()
	{	
		if(savable == 1)
		{
			var productForm = document.productForm;
			
			//comma 처리
			removeComma("LICENSE_TAX");		
			removeComma("SUM_ADJUST");		
			removeComma("SUM_YEAR");		
			removeComma("SUM_LASTYEAR");		
	
			productForm.submit();
		}else
			alert("산출 내역을 먼저 계산해 주십시오.");
	}
	
	// info 하단  Tab 클릭
	function subTabClick(hiddenSubTabName,visibleSubTabName)
	{					
		document.getElementById(hiddenSubTabName).style.visibility = 'hidden';	
		document.getElementById(visibleSubTabName).style.visibility = 'visible';	
		
		
		document.getElementById(hiddenSubTabName).style.display = 'none';	
		document.getElementById(visibleSubTabName).style.display = 'block';			
	}
	
	//일시 산출물 계산////////////////////////////////////////////////////////////////////////////////////////////////
	function Calculate2() 
	{
		var area = document.getElementById("AREA_AFTER").value;		
		getLicense_TaxAjax(area);	// 면허세 계산
		
		
		
		var area_after = document.getElementById("AREA_AFTER").value;
		var period = document.getElementById("period").value;
		var rate = document.getElementById("RATE").value;
	    
	    document.getElementById("FORM").value = area_after+"㎡ X " + period + "일 X 400원";
		var SUM_YEAR1 = Math.floor(Number(area_after)*Number(period)*Number("400"));
		document.getElementById("sum_year").value = SUM_YEAR1;
		document.getElementById("SUM_ADJUST").value = SUM_YEAR1;
		
		insertComma("sum_year");// 현년도 점용료 콤마 삽입
		insertComma("SUM_ADJUST");
		
		document.getElementById("FORM_ADJUST").value = area_after+"㎡ X " + period + "일 X 400원";
		
		//var sum_lastyear = document.getElementById("SUM_LASTYEAR").value;

		//var rate1 = Math.floor((SUM_YEAR1 - sum_lastyear ) / sum_lastyear *100 );
			
		//if( rate1 >= 10 && rate1 <= 1000)
		//{
		//	getRateAjax2(rate1);	
		//}else
		//{
//			document.getElementById("SUM_ADJUST").value = SUM_YEAR1;
			
			
//			insertComma("SUM_ADJUST");
//		    document.getElementById("FORM_ADJUST").value = area_after+"㎡ X " + period + "일 X 400원";
	//	}
		
		savable = 1;
	}
	
	
	//  산출 요율 계산/////////////////////////////////////////////////////////////////////
	function getRateAjax2(addSum)
    {
		var params = 'addsum='+addSum;
		var url = "/getRate.do" ;
		var adjust = sendRequest(url, params, rateFromServer, "Post");
	} 
	
	function rateFromServer()
       {      
           if(httpRequest.readyState == 4)
           {
               if(httpRequest.status == 200)
               {
				   var adjust = httpRequest.responseText;	
				   	
				   	var area_after = document.getElementById("AREA_AFTER").value;
					var period = document.getElementById("period2").value;
					var SUM_YEAR1 = Number(area_after)*Number(period)*Number("400");
					if(adjust != 0.0)
						document.getElementById("SUM_ADJUST2").value = adjust*SUM_YEAR1;
					else
						document.getElementById("SUM_ADJUST2").value = SUM_YEAR1;

	               delete httpRequest;
				   return null;
               }else
               {

					delete httpRequest;
					return null;
               }
           }else
           {

           }
       }
		//  산출 요율 계산끝/////////////////////////////////////////////////////////////////////
	
       	//  면허세        계산/////////////////////////////////////////////////////////////////////
        function getLicense_TaxAjax(area)
       {   

       //encodeURIComponent은 +기호와 같이 자바스크립트상에서 문자로 취급되지 않는 문자를

       //문자로 취급되게 해주는 함수이다.  document.getElementById("Text1")는 현재 페이지에서

       //ID값이 Text1인 컨트롤 찾아 낸다. .Net Ajax에서는 $get을 쓴기도 한다.    

        //  var params ="name="+encodeURIComponent(document.getElementById("Text1").value);
        var params = 'area='+area;

		var url = "/getLicenseTax.do" ;
      

       //hello.aspx 페이지에 params 쿼리를 Post방식으로 보내어 서버응답을 helloFromServer에서 받는다.

          var a = sendRequest(url, params, getLicense_TaxfromServer, "Post");
       }
       
       function getLicense_TaxfromServer()
       {
       		if(httpRequest.readyState == 4)
           {
               if(httpRequest.status == 200)
               {               
				   var LicenseTax = httpRequest.responseText;

	               document.getElementById("License_Tax").value = LicenseTax;
	               
	               insertComma("License_Tax");// 면허세 점용료 콤마 삽입

	               delete httpRequest;
               }else
               {
				   delete httpRequest;
               }
           }else
           {
           }
       }

   	//  면허세       계산끝/////////////////////////////////////////////////////////////////////
       
	//xml js부분	//////////////////////////////////////////////////////////////////////////
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
	//ajax js 끝 //////////////////////////////////////////////////////////////////////////////
	
	
	
	
       
    //금액단위  [ , ] 자동 추가   
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
	
	//[ , ] 삭제
	function removeComma(numValue)
	{	
		num = document.getElementById(numValue).value;		
		document.getElementById(numValue).value = Number(num.split(',').join(""));
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
	
	
	function setParentYear(yearVal)
	{
		parent.document.getElementById("year").value = yearVal;
	}

	-->
	
	
	
	
</script>

</head>

<body onload="javascript:InitPage();"  border="0">

<form name="productForm" id="productForm" method="post" action = "/gapan/jumyong/productInsert.do" >
<spring:bind path="product.ADMIN_NO">                    
<input name="ADMIN_NO" value="${no}" type="hidden" >
</spring:bind>
<input name="no" value="${no}" type="hidden" >
<input name="mode"  id = "mode" value="${mode}" type="hidden" >
<input name="seq"  id = "seq" value="${seq}" type="hidden" >
				<table width="780" border="0" cellspacing="0" cellpadding="0">
		          <tr>
		
		            <td class="contborder_purple">							            
							<table width="100%" border="0" cellspacing="0" cellpadding="0">
							              <tr>
							                <td>
							                <table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
							                  <tr>
	                    <td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">번호</td>
	                    <td align="center" bgcolor="e5eff8" class="sub_table_b">갱신연월</td>
	                    <td align="center" bgcolor="e5eff8" class="sub_table_b">면적</td>
	                    <td align="center" bgcolor="e5eff8" class="sub_table_b">전체기간(일수)</td>
	                    <td align="center" bgcolor="e5eff8" class="sub_table_b">점용료(일)</td>
	                    <td align="center" bgcolor="e5eff8" class="sub_table_b">면허세</td>
	                    <td align="center" bgcolor="e5eff8" class="sub_table_b">일시점용료 </td>
	                    </tr>
	                    
	                  <c:forEach items="${productList}" var="board" varStatus="idx">
	                      <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" 
	                      onclick="javascript:setParentYear('${board.YEAR}');location.href('/gapan/jumyong/productInsert.do?no=${no}&year=${board.YEAR}&currentPage=${currentPage}&countPerPage=${strCountPerPage}&section=${section}&seq=${board.SEQ}');" style="cursor:pointer" >
	                        <td height="26" align="center">${idx.count}</td>
	                        <td align="center">${board.UP_DATE}</td>
	                        <td align="center">${board.AREA_AFTER}</td>
	                        <td align="center">${board.PERIOD}</td>							                        
	                        <td align="center">${board.RATE}</td>
	                        <td align="center">${board.LICENSE_TAX}</td>
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
				                    <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용면적</td>
				                    <td bgcolor="eaeaea" class="table_bl_left"   >${product.AREA_AFTER}㎡</td>      
									
									<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">전체기간(일수)</td>
				                    <td bgcolor="eaeaea" class="table_bl_left" ><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
				                        <tr>
				                          <td>${product.PERIOD} 일</td>
				                        </tr>
				                    </table></td>     
				                  </tr>
				                  <tr>                
									<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">면허세</td>
				                    <td bgcolor="eaeaea" class="table_bl_left" >${rnic:insertComma2(product.LICENSE_TAX)}원	</td> 
									<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용료(일)</td>
				                    <td bgcolor="eaeaea" class="table_bl_left" >${product.RATE}원

									</td> 
				                  </tr>                   
								
				                  <tr>
				                   
									
									<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">조정 점용료</td>
				                    <td bgcolor="eaeaea" class="table_bl_left" >${rnic:insertComma2(product.SUM_ADJUST)}원

									</td>
									<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">조정 산출식</td>
				                    <td bgcolor="eaeaea" class="table_bl_left" >${product.FORM_ADJUST}

									</td> 
				                  </tr> 
				                </table></td>
				              </tr>
				              <tr>              
				                <td height="40" align="right">
					                <table border="0" width="100%">
					                	<tr>
					                	<td >								                	
						                <a href="/gapan/jumyong/productInsert.do?no=${no}&year=${year}&currentPage=${currentPage}&countPerPage=${strCountPerPage}&mode=add&section=${section}">
						                	<img src="/img/add_icon.gif" alt="추가" border="0">
						                </a>
						                </td>
  							                <c:if test="${listSize != '0'}"> 
  							                <td width="50">
							                <a href="/gapan/jumyong/productInsert.do?no=${no}&year=${board.YEAR}&currentPage=${currentPage}&seq=${seq}&mode=edit">
							                	<img src="/img/mod_icon.gif" alt="수정" border="0">
							                </a>	 		                
							            </td>
						                </c:if> 
						                </tr>
						             </table>
								</td>
				              </tr>				               
							</table>
						</div>							
						
						<div id="edit" style="width:100%;display:none;">
						<spring:bind path="product.FROMDATE" >
                   			<input name="FROMDATE" ID="FROMDATE"  type="hidden" value="${mul_Fromdate}" >
						</spring:bind>
						<spring:bind path="product.TODATE" >
                   			<input name="TODATE" ID="TODATE"  type="hidden" value="${mul_Todate}" >
						</spring:bind>
						<spring:bind path="product.YEAR" >
                   			<input name="YEAR" ID="YEAR"  type="hidden" value="" >
						</spring:bind>
						<spring:bind path="product.PRICE" >
                   			<input name="PRICE" ID="PRICE"  type="hidden" value="0" >
						</spring:bind>
		  					<table width="100%" border="0" cellspacing="0" cellpadding="0">
					              <tr>
					                <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
					                   <tr>
					                    <td width="15%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용면적</td>  
					                    <td bgcolor="eaeaea" class="table_bl_left" width="35%">
					                        <spring:bind path="product.AREA_AFTER">
							                    <input name="AREA_AFTER" id="AREA_AFTER" type="text" class="essential" style="width:60px" value="${product.AREA_AFTER}"  style="ime-mode:disabled;direction:rtl;" onKeyDown="onlyNumberInput();" >㎡
											</spring:bind>
											
										</td> 
										
										<td width="15%" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">전체기간(일수)</td>
					                    <td bgcolor="eaeaea" class="table_bl_left" width="35%" ><table border="0" cellpadding="0" cellspacing="0" class="sub_stan" >
					                        <tr>
					                          <td>
					                          	<spring:bind path="product.PERIOD">
					                          		<input name="PERIOD" id="PERIOD" type="text" class="essential" style="width:60px" value="${product.PERIOD}"  onKeyDown="onlyNumberInput();" style="ime-mode:disabled;direction:rtl;" onKeyDown="onlyNumberInput();" > 일
					                          	</spring:bind>
					                          </td>
					                        </tr>
					                    </table></td>	
					                  </tr> 
					                  
					                  </table>
					                  </td></tr>
					                  
					                  
					                   <tr>              
					                <td height="40" align="right">					                
						                <img src="/img/accou_icon.gif" alt="계산" width="56" height="18" border="0" onclick="javascript:Calculate2();" style="cursor:pointer">
						            </td>
					              </tr>
					                  
					                  
					                  
					                  
					                  <tr><td>
					                  
					                  <table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
					                  
					                  <tr>
					                    
					                    
					                    <td width="15%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">면허세</td>
					                    <td width="35%" bgcolor="eaeaea" class="table_bl_left" >
					                       <spring:bind path="product.LICENSE_TAX" >
						                   		<input name="LICENSE_TAX" ID="LICENSE_TAX"  type="text" class="input_form1" value="${product.LICENSE_TAX}" style="width:120px;ime-mode:disabled;direction:rtl;" onclick="javascript:getLicense_TaxAjax(document.getElementById('AREA_AFTER').value);" onkeyup="javascript:fn_addComma(this);"  onKeyDown="onlyNumberInput();" >원	 
						                   </spring:bind>						                   
										</td> 
					                    
					                    
					                    
					                    
					                    
					                    
					                                       
										<td width="15%"  width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용료(일)</td>
					                    <td width="35%" bgcolor="eaeaea" class="table_bl_left" >
					                        <spring:bind path="product.RATE">					                        
												<input name="RATE"  id="RATE" type="text" class="input_form1" style="width:120px" value="${product.RATE}"  style="ime-mode:disabled;direction:rtl;" onKeyDown="onlyNumberInput();" >원						                        	
											</spring:bind>
										</td>
					                  </tr>					
										
							                    <spring:bind path="product.SUM_LASTYEAR">
								                    <input name="SUM_LASTYEAR" id="SUM_LASTYEAR" type="hidden"  class="input_form1" style="width:120px" value="${product.SUM_LASTYEAR}"style="ime-mode:disabled;direction:rtl;" onKeyDown="onlyNumberInput();" onkeyup="javascript:fn_addComma(this);" >
						        	            </spring:bind>
										
							                    <spring:bind path="product.SUM_YEAR">
													<input name="SUM_YEAR" id="SUM_YEAR" type="hidden" class="input_form1" style="width:120px" value="${product.SUM_YEAR}"style="ime-mode:disabled;direction:rtl;" onKeyDown="onlyNumberInput();" onkeyup="javascript:fn_addComma(this);" >
												</spring:bind>
											<spring:bind path="product.FORM">                                        
												<input name="FORM" id="FORM" type="hidden" class="input_form1" style="width:200px" value="${product.FORM}">
											</spring:bind>
					                    	<spring:bind path="product.ADJUSTMENT">
												<input name="ADJUSTMENT" id="ADJUSTMENT" type="hidden" class="input_form1" style="width:120px" value="${product.ADJUSTMENT}"style="ime-mode:disabled;direction:rtl;" onKeyDown="onlyNumberInput();" >
											</spring:bind>
										
					
					                  <tr>

										<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">조정 점용료</td>
					                    <td bgcolor="eaeaea" class="table_bl_left" >
					                    	<spring:bind path="product.SUM_ADJUST">                    
												<input name="SUM_ADJUST" id="SUM_ADJUST" type="text" class="input_form1" style="width:120px" value="${product.SUM_ADJUST}"style="ime-mode:disabled;direction:rtl;" onKeyDown="onlyNumberInput();" onkeyup="javascript:fn_addComma(this);" >원
											</spring:bind>
										</td> 

										<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">조정 산출식</td>
					                    <td bgcolor="eaeaea" class="table_bl_left" >
											<spring:bind path="product.FORM_ADJUST">                                                            
											<input name="FORM_ADJUST" id="FORM_ADJUST" type="text" class="input_form1" style="width:200px" value="${product.FORM_ADJUST}">
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
						</table>
						</div>	
							
							
							
							
							
							
							
							
		            </td>
		          </tr>
		         
		          
		          
		        </table>

</form>
</body>
</html>

