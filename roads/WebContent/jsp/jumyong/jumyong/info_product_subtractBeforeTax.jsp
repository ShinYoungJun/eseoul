<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/include.jsp" %> 
<%@ include file="/jsp/common/loginCheck.jsp" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />
<title>::::: ����� ������������ý��� :::::</title>
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
		
	}


	function submitClick()
	{
		if(savable == 1)
		{
		var productForm = document.productForm;
		
		//comma����

		removeComma2("PRICE");
		removeComma2("SUM_LASTYEAR");
		removeComma2("SUM_YEAR");
		removeComma2("SUM_ADJUST");

		productForm.submit();
		}else
		alert("���� ������ ���� ����� �ֽʽÿ�.");
	}


	function subTabClick(hiddenSubTabName,visibleSubTabName)
	{	
		document.getElementById(hiddenSubTabName).style.display = 'none';	
		document.getElementById(visibleSubTabName).style.display = 'block';	
	}

	function goModify()
	{
		var area = document.getElementById("AREA_AFTER").value;
		var year = '${product.YEAR}';
		var seq = document.getElementById("SEQ").value;
		
		if(area>=0)
		{
			location.href = "/jumyong/productInsert.do?no=${no}&currentPage=${currentPage}&countPerPage=${countPerPage}"
			+"&mode=edit&year="+year+"&seq="+seq+"&section=${section}";
		}else
		{
			location.href = "/jumyong/productSubtractInsert.do?no=${no}&currentPage=${currentPage}&countPerPage=${countPerPage}"
			+"&mode=edit&year="+year+"&seq="+seq+"&section=${section}&area="+area;
		}
	}
	
	//confirm �� Ȯ��,���-> ��,�ƴϿ�.
	function window.confirm(str) {

	 execScript('n = msgbox("'+str+'","4132")',"vbscript");
	 return(n == 6);
	}



	
	function Calculate()
	{
		savable = 1;
		if(confirm("�������� �ڵ� ����Ͻðڽ��ϱ�?"))
			calDate();
		var area_after = document.getElementById("AREA_AFTER").value;
		var period = document.getElementById("period").value;
		var rate = document.getElementById("RATE").value;
	    var price = removeComma(document.getElementById("PRICE").value);

	    
	    if(price <= 0) 
	    {
		    price = 1;
		    document.getElementById("FORM").value = area_after+"�� X " + period + "/12���� X " +rate   ;
			//���⵵ ����� ���
			var sum_year = Number(area_after)*Number(period)/12*Number(rate);
		}else
		{
		    document.getElementById("FORM").value = area_after+"�� X " + period + "/12���� X " +rate +" X " +insertComma2(price);
			//���⵵ ����� ���
			var sum_year = Number(area_after)*Number(period)/12*Number(rate)*Number(price)*-1;
		}
		
        var strSUM_ADJUST = String( Math.floor(sum_year)); // �Ҽ��� ����        

			
		document.getElementById("sum_year").value = strSUM_ADJUST;
		
		insertComma("sum_year");
		
		//���⵵ ����� ��� ��
		
		//���� ��� �� ���� ����� ���		
		var sum_lastyear = removeComma(document.getElementById("SUM_LASTYEAR").value);		// �۳⵵ �����
		
		var tempval = 0;
		

		
		if(sum_lastyear >0)//�۳⵵ ����ᰡ ������
		{

			var rate1 = Math.floor((sum_year - sum_lastyear ) / sum_lastyear *100 ); // ���⵵ �۳⵵ ����� ����
			
			if( rate1 >= 10 && rate1 <=1000)//������ ��� �������� ������
			{			
				
				document.getElementById("rate1").value = rate1;			
//				alert(sum_lastyear);			
				getRateAjax(rate1);
				
				tempval = 1;
			}
		}

		
		if(tempval == 0) // �۳⵵ ����ᰡ ���ų� ������ �ش����� ������
		{	 
			 document.getElementById("ADJUSTMENT").value = "1";
			 document.getElementById("FORM_ADJUST").value = document.getElementById("FORM").value+" X 1"
			 document.getElementById("sum_adjust").value = strSUM_ADJUST;		
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
        var a = sendRequest(url, params, rateFromServer, "Post");  // rateFromServer �Լ��� rate �� �޾ƿ�����
     } 

       function rateFromServer()
       {      
           if(httpRequest.readyState == 4)
           {
               if(httpRequest.status == 200)
               {
				   var adjust = httpRequest.responseText; //���� ����� �޾ƿ�.
				   
//				   alert("�ϴܿ���"+adjust);

	               document.getElementById("adjustment").value = adjust;
	               
	               var sum_year = removeComma(document.getElementById("sum_year").value);
	               


	               var SUM_ADJUST =  Math.floor(Number(sum_year)*Number(adjust));
	               var strSUM_ADJUST = String( Math.floor(SUM_ADJUST));
				   document.getElementById("SUM_ADJUST").value = strSUM_ADJUST;

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
       
       
       
		
	//xml js�κ�
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
	
	//�Ű�����: ������ ������, ������ ������, �������� ������ �ڷḦ �޴� �Լ�, ���۹��
	
	function sendRequest(url, params, callback, method)	
	{	
	   httpRequest = getXMLRequest();
	
	    //������ ���޹���� ������ �Ǿ����� Ȯ���Ѵ�. ���� ������ �ȵǾ��ٸ�	
	    //GET������� �����ϵ��� �Ѵ�.
	
	    var httpMethod =  method ? method:"GET";
	
	    if(httpMethod != "GET" && httpMethod !="POST")	
	    {
	       httpMethod = "GET";
	    }

	    //���� ������ ������ �ּҸ� �޴´�.	
	    var httpParams = (params==null || params =="")?null:params;	
	    var httpUrl = url;	
	    if(httpMethod =="GET" && params !=null)	
	    {	
	       httpUrl =httpUrl +"?"+httpParams;
	    }
	    httpRequest.open(httpMethod,httpUrl,true);
	    httpRequest.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
	
	    //onreadystatechange�� ������ Ŭ����Ʈ�� ���¸� �����Ͽ� ��ȭ�� ������
	
	    httpRequest.onreadystatechange = callback;
	
	    httpRequest.send(httpMethod=="POST" ? httpParams:null);   	
	}	
	
	
	
	//ajax js ��
	
		
	//[ , ] ����
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
	
	// �޸� ����
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
	
	
	
		// �޸� ���� - ��ȯ
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
	
	
	
	//�� ���� ���
	function getDiffMon(val1,val2)
	{
	
	    var sdate = new Date(Number(val1.substr(0,4)),Number(val1.substr(4,2))-1,Number(val1.substr(6,2)));
	    var edate = new Date(Number(val2.substr(0,4)),Number(val2.substr(4,2))-1,Number(val2.substr(6,2)));
	    
	   
	
	    var sDate  = sdate.getDate();     	
	    var count=0;
	    
	    edate.setDate(edate.getDate()+1);
	    
//	     alert(sdate+"   "+edate);
	    
	    while (Date.parse(edate)>=Date.parse(sdate)) {
	        if(sdate.getDate() == sDate){ //�ش� ���ϰ� ���ٸ�...
	          count++;
	        }
	      sdate.setDate(sdate.getDate()+1); //������ ��� ����
	    }
	    return count-1;
	}
	
	
	
	// �뽬 ����
	function removeDash(numValue)
	{
		return numValue.split('-').join("");
	}
	
	
	//��¥�� dash(-) ����
	function addDash2(num1)
	{
		num = document.getElementById(num1).value;
		document.getElementById(num1).value =  (num.substr(0,4)+"-"+num.substr(4,2)+"-"+num.substr(6,2));
	}
	
	function setParentYear(yearVal)
	{
		parent.document.getElementById("year").value = yearVal;
	}
	
	//�������� �˾�
	function openLandPricePopUp()
	{
		var winW = 320;
		var winH = 133;
		var status ="toolbar=no, location=no, directories=no, status=no, menubar=no, resizable=no, scrollbars=no, width="+winW+", height="+winH+", left=0, top=0"
		window.open('/jsp/jumyong/jumyong/officialLandPrice.html', 'win', status);	
	}
	
	
	// �߰� ȭ�� �̵�
	function goAdd(adminNo,currentPage)
	{
		location.href("/jumyong/productInsert.do?no="+adminNo+"&currentPage="+currentPage+"&mode=add")
//	<a href="/jumyong/productInsert.do?no=${no}&year=${board.YEAR}&currentPage=${currentPage}&countPerPage=${countPerPage}&mode=add&section=${section}">
	}
	
	// ���� ���� ȭ�� �̵�
	function goSubtract(adminNo,currentPage)
	{
		var area = document.getElementById("AREA_AFTER").value;
		
		location.href("/jumyong/productSubtractInsert.do?no="+adminNo+"&currentPage="+currentPage+"&mode=add&seq="+"${seq}"+"&area="+area);
//	<a href="/jumyong/productInsert.do?no=${no}&year=${board.YEAR}&currentPage=${currentPage}&countPerPage=${countPerPage}&mode=add&section=${section}">
	}
	
	
	
	-->
	
</script>

</head>

<body onload="javascript:InitPage();"  border="0">
<form name="productForm" id="productForm" method="post" action = "/jumyong/productSubtractBeforeTaxInsert.do" >
			<input name="CAL_SUM_SEQ" value="${product.CAL_SUM_SEQ}" type="hidden" >
			<input name="no" value="${no}" type="hidden" >
			<input name="mode"  id = "mode" value="${mode}" type="hidden" >
			<input name="area"  id = "area" value="${area}" type="text" >
			<input name="year"  id = "year" value="${year}" type="text" >			
				<input name="SEQ"  id = "SEQ" value="${seq}" type="hidden" >
                <spring:bind path="product.FIRST_SEQ">
					<input name="FIRST_SEQ"  id = ""FIRST_SEQ"" value="${seq}" type="text" >			
				</spring:bind>

				
				<table width="780" border="0" cellspacing="0" cellpadding="0">
		          <tr>
		
		            <td class="contborder_purple">							            
							<table width="100%" border="0" cellspacing="0" cellpadding="0">
							              <tr>
							                <td>
							                <table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
							                  <tr>
							                    <td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">��ȣ</td>
							                    <td align="center" bgcolor="e5eff8" class="sub_table_b">���ؿ���</td>
							                    <td align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
							                    <td align="center" bgcolor="e5eff8" class="sub_table_b">����</td>
							                    <td align="center" bgcolor="e5eff8" class="sub_table_b">����</td>
							                    <td align="center" bgcolor="e5eff8" class="sub_table_b">����Ⱓ</td>
							                    <td align="center" bgcolor="e5eff8" class="sub_table_b">�۳⵵ ����� </td>
							                    <td align="center" bgcolor="e5eff8" class="sub_table_b">���⵵ ����� </td>
							                    <td align="center" bgcolor="e5eff8" class="sub_table_b">���� ����� </td>
							                    <td align="center" bgcolor="e5eff8" class="sub_table_b">���� ���� ����� </td>							                    
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
										
									
							<div id="edit" style="width:100%;">
		  					<table width="100%" border="0" cellspacing="0" cellpadding="0">
					              <tr>
					                <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
					                   <tr>
					                    <td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b"  style="direction:rtl" >���س⵵</td>
					                    <td width="42%" bgcolor="eaeaea" class="table_bl_left" >
					                    <spring:bind path="product.YEAR">                    
											<input name="YEAR" id="YEAR" type="text" value = "${product.YEAR}" style="width:50px;ime-mode:disabled;"  class="input_form1"  onKeyDown="onlyNumberInput();" style="text-align:right">&nbsp�� 
					                    </spring:bind>
						                
										</td>                     
										<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
					                    <td width="32%" bgcolor="eaeaea" class="table_bl_left" >
					                       <spring:bind path="product.PRICE" >
						                   		<!-- input name="PRICE" ID="PRICE" value="${product.PRICE}" type="text" class="input_form1" style="width:80px" onkeypress="javascript:checkWon(this);"-->
						                   		<input name="PRICE" ID="PRICE" value="${product.PRICE}" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" onkeyup="javascript:fn_addComma(this)"  onKeyDown="onlyNumberInput();" style="text-align:right">��	 
						                   		
						                   </spring:bind>
						                   

						                   <img src="/img/landPrice.gif" alt="����������ȸ" height="18" border="0" style="cursor:pointer" onclick="javascript:openLandPricePopUp()"; >

										</td> 
					                  </tr> 
					                  
					                  
					                  
					                  <tr>
					                    <td width="100" height="26" align="center" bgcolor="e5eff8" class="input_form1"  >�������/��</td>
					                    <td bgcolor="eaeaea" class="table_bl_left" >
					                    
					                        <spring:bind path="product.AREA_AFTER">
							                    <input name="AREA_AFTER" id="AREA_AFTER" type="text" class="input_form1" style="width:50px;ime-mode:disabled;" value="${product.AREA_AFTER}"   onKeyDown="onlyNumberInput();" style="text-align:right" >��
											</spring:bind>
											
										</td>                     
										<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">����/�ܰ�</td>
					                    <td bgcolor="eaeaea" class="table_bl_left" >
					                        <spring:bind path="product.RATE">
												<input name="RATE"  id="RATE" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value="${product.RATE}"  onKeyDown="onlyNumberInput();" style="text-align:right">
											</spring:bind>
										</td> 
					                  </tr>                   
					                  
					                  
									<tr>
					                    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">����Ⱓ</td>
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
					                     		
					                     													<img src="/img/cal_month.gif" alt="�޼����" height="18" border="0" style="cursor:pointer" onClick="javascript:calDate();">
					                     		
					                          </td>
					                        </tr>
					                    </table></td>
					                    
					                    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
					                    <td bgcolor="eaeaea" class="table_bl_left" >
					                    	<spring:bind path="product.PERIOD">
						                    	<input name="PERIOD" id ="PERIOD" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value = "${product.PERIOD}"   onKeyDown="onlyNumberInput();" style="text-align:right">����
						                    </spring:bind>
										</td>
					                 
					                  </tr>
					                   
					                  
					                  
					                  
					                  </table>
					                  </td></tr>
					                  
					                  <tr>              
					                <td height="40" align="right">
					                
					                <img src="/img/accou_icon.gif" alt="���" width="56" height="18" border="0" onclick="javascript:Calculate();" style="cursor:pointer">
						                </td>
					              </tr>
					                  
					                  <tr><td>
					                  <table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
					                     <tr>
					                    <td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">���� ���</td>
					                    <td width="42%" bgcolor="eaeaea" class="table_bl_left" >
					                    	<spring:bind path="product.ADJUSTMENT">
												<input name="ADJUSTMENT" id="ADJUSTMENT" type="text" class="input_form1" style="width:120px;ime-mode:disabled;" value="${product.ADJUSTMENT}"   onKeyDown="onlyNumberInput();" style="text-align:right">
												
											</spring:bind>
										</td>                     
					                    	<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�۳⵵ �����</td>
						                    <td width="32%" bgcolor="eaeaea" class="table_bl_left" >
							                    <spring:bind path="product.SUM_LASTYEAR">
								                    <input name="SUM_LASTYEAR" id="SUM_LASTYEAR" type="text"  class="input_form1" style="width:80px;ime-mode:disabled;" value="${product.SUM_LASTYEAR}"   onKeyDown="onlyNumberInput();" onkeyup="javascript:fn_addComma(this)" style="text-align:right">��
						        	            </spring:bind>
											</td>  
										
										
										</tr>  
					
										
					
					                  <tr>
					                   <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�⺻ �����</td>
					                    <td bgcolor="eaeaea" class="table_bl_left" >
											<spring:bind path="product.FORM">                                        
												<input name="FORM" ID="FORM" type="text" class="input_form1" style="width:300px" value="${product.FORM}">
											</spring:bind>
										</td>
											<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">���⵵ �����</td>
						                    <td width="32%" bgcolor="eaeaea" class="table_bl_left" >
							                    <spring:bind path="product.SUM_YEAR">
													<input name="SUM_YEAR" id="SUM_YEAR" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value="${product.SUM_YEAR}"   onKeyDown="onlyNumberInput();" onkeyup="javascript:fn_addComma(this)" style="text-align:right">��
												</spring:bind>
											</td>                   
					                  
					                 
					                  </tr> 
					               
					                   <tr>
					                   <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">���� �����</td>
					                    <td bgcolor="eaeaea" class="table_bl_left" >
											<spring:bind path="product.FORM_ADJUST">                                                            
											<input name="FORM_ADJUST" id="FORM_ADJUST" type="text" class="input_form1" style="width:300px" value="${product.FORM_ADJUST}">
											</spring:bind>
										</td> 
					                    
										<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">���� �����</td>
					                    <td bgcolor="eaeaea" class="table_bl_left" >
					                    	<spring:bind path="product.SUM_ADJUST">                    
												<input name="SUM_ADJUST" id="SUM_ADJUST" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value="${product.SUM_ADJUST}"  onKeyDown="onlyNumberInput();" onkeyup="javascript:fn_addComma(this)" style="text-align:right">��
											</spring:bind>
										</td> 
										
					                  </tr>               
												<input name="RATE1" id = "RATE1" type="hidden" class="input_form1" style="width:120px;ime-mode:disabled;" value=""   onKeyDown="onlyNumberInput();" >
					                  
					                </table></td>
					              </tr>
					            
					              <tr>              
					                <td height="40" align="right">
				                	<img src="/img/can_icon.gif" alt="���" border="0" onclick="javascript:history.back();" style="cursor:pointer" >
					                <img src="/img/save_icon2.gif" alt="����" width="56" height="18" border="0"
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

