<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/loginCheck.jsp" %>
<%@ include file="/jsp/common/include.jsp" %>    
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
<script language="javascript" src="/js/Ajax_request.js"></script>
<script>
<!--	

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
///////////////////////////////////////////////////////////////////		2009.09.03  �������ڿ� ���⳻ ���� ���ϱ� ���� �� �Լ� 
//////////////////////////////////////////////////////////////////		������ �Ⱦ��ٰ� �ϱ⿡ ������������ ���� �� ������ �θ��� ���� �׳� �Ӵϴ�.
/////////////////////////////////////////////////////////////////		(*�������� :��������   *���⳻����:�������ڷκ��� �Ѵ�      *����������:���⳻���ڷκ��� ��� ����)


	
	function	Page(page)
	{
		if(page	==	"")
			return;
		
		var form = document.productForm;
		
		var gapan_no = document.getElementById("GAPAN_NO").value;
		//var year = document.getElementById("YEAR").value;
		var mode = document.getElementById("mode").value;
		
		//form.currentPage.value	= page;
		//form.action = "search.do";
		//form.submit();
		location.href="junggi_view.do?currentPage="+page+"&gapan_no="+gapan_no+"&mode="+mode;
	}

	function InitPage()
	{	
		//setYear();
		//������¥, �����ϳ�����, ���������� ���ϱ�  2009.08.31 pkh
		var dateUtilObj = new dateUtil();
		//dateUtilObj.setDate('INDATE', 'TAX_DATE', {month: +1});			//���غ������� �ּ�ó�� 
		
		var taxdate = document.getElementById("TAX_DATE").value
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

	function	View(adminno, seq)
	{
	//	parent.BugwaCatch(year, seq);	//	���� ������ �����͸� �����Ϸ� ������.
		params	= "gapan_no=" + adminno + "&seq=" + seq;

		sendRequest("/gapan/saewe/sanchulinfo_view.do", params, "GET", Result_InfoView);

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
		
		if( productForm.mode.value == 'add' ){
			if( productForm.YEAR.value > '${yearAdd}' ){
				alert("����� ����� �ڷ��Դϴ�. ����� ������ ������ �����մϴ�. ");
				productForm.YEAR.focus();
				return;
				/*if( confirm("�ش�⵵�� �����Ͻðڽ��ϱ�? ") ){
					location.href = "/gapan/junggi/junggi_view.do?gapan_no="+productForm.gapan_no.value+"&year=";
				}*/
			}	
		}
		if(	productForm.YEAR.value == '0' || productForm.YEAR.value == '' ){
			alert("�ΰ��⵵�� �־��ּ���.");
			productForm.YEAR.focus();
			return;
		}
		if(	productForm.OVERTAX.value == '' || productForm.OVERTAX.value == '0' ){
			alert("������ �ݾ��� �־��ּ���.");
			productForm.OVERTAX.focus();
			return;
		}
		if( productForm.FORM_ADJUST.value == '' ){
			alert("����� ���� ���ּ���. ");
			return;
		}
		if(	productForm.PRICE.value == '0' || productForm.PRICE.value == '' ){
			alert("���������� �ְ� ������ּ���.");
			productForm.PRICE.focus();
			return;
		}
		if(	productForm.TAX_DATE.value == '' ){
			alert("�ΰ����ڸ� �־��ּ���.");
			productForm.TAX_DATE.focus();
			return;
		}

		if( confirm("�����Ͻðڽ��ϱ�? " ) ){
			//document.productForm.year.value = document.productForm.YEAR.value;
			//document.productForm.mode_proc.value = "addProc";
			//alert(productForm.GAPAN_NO.value);
			//comma����
			removeComma2("PRICE");
			removeComma2("SUM_LASTYEAR");
			removeComma2("SUM_YEAR");
			removeComma2("SUM_ADJUST");
			removeComma2("OVERTAX");
			productForm.submit();
		}
		
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
		
		location.href = "/gapan/junggi/junggi_product.do?gapan_no=${gapan_no}&year=${year}&currentPage=${currentPage}&countPerPage=${countPerPage}"
		+"&mode=edit";
//		location.href = "/gapan/jumyong/productInsert.do?gapan_no=${gapan_no}&currentPage=${currentPage}&countPerPage=${countPerPage}"
//		+"&mode=edit&year="+year+"&seq="+seq+"&section=${section}";
	}
	

	function Calculate()
	{

		var productForm = document.productForm;
		if(	productForm.PRICE.value == '0' || productForm.PRICE.value == '' ){
			alert("���������� �ְ� ������ּ���. ");
			productForm.PRICE.focus();
			return;
		}
		calDate();
		var area_after = document.getElementById("AREA_AFTER").value;
		var period = document.getElementById("period").value;
		var rate = document.getElementById("RATE").value;
	    var price = removeComma(document.getElementById("PRICE").value);
	    var reduction_rate = document.getElementById("REDUCTION_RATE").value;
		var reduction_rate_form = "";
		
	    document.getElementById("FORM").value = area_after+"�� X " + period + "/12 ���� X " +rate +" X " +insertComma2(price) ;

		// ������, ������
		if( reduction_rate == '' || reduction_rate == '0'){
			
			reduction_rate = "";
			reduction_rate_form = "";							
						
		}else{
			reduction_rate_form = " X ((100-"+reduction_rate+")/100)";	// ������(���)
		}
		//���⵵ ����� ���

		var sum_year = parseFloat(Number(area_after)*Number(period)/12*Number(rate)*Number(price)*((100-reduction_rate)/100)).toFixed(3);
        var strSUM_ADJUST = String( Math.floor(parseFloat(sum_year).toFixed(3))); // �Ҽ��� ����
        	    	
	    sum_year = (Math.floor(Number(strSUM_ADJUST)/100))* 100; //100�� ����
			
		document.getElementById("sum_year").value = sum_year;
		
		insertComma("sum_year");
		
		//���⵵ ����� ��� ��
		
		//���� ��� �� ���� ����� ���		
		var sum_lastyear = removeComma(document.getElementById("SUM_LASTYEAR").value);		// �۳⵵ �����
		
		var tempval = 0;
		
		

		if(sum_lastyear >0)//�۳⵵ ����ᰡ ������
		{


			var rate1 = Math.floor((sum_year - sum_lastyear ) / sum_lastyear *100 ); // ���⵵ �۳⵵ ����� 			
			//alert(sum_year+"  "+sum_lastyear);

			if( rate1 >= 10 && rate1 <=1000)//������ ��� �������� ������
			{
			
				document.getElementById("rate1").value = rate1;			
				
				//alert("rate1="+rate1);

				getRateAjax(rate1);
				
				tempval = 1;
			}
		}
		
		if(tempval == 0) // �۳⵵ ����ᰡ ���ų� ������ �ش����� ������
		{
			 document.getElementById("ADJUSTMENT").value = "1";
			 document.getElementById("FORM_ADJUST").value = document.getElementById("FORM").value+" X 1"+reduction_rate_form;
			 document.getElementById("sum_adjust").value = sum_year;		
			 insertComma("SUM_ADJUST");
			 
			 // ������ �ݾ�
		   	 document.getElementById("OVERTAX").value =  Math.floor((  Number(sum_year) * 3.0 / 100 + Number(sum_year) ) /100 ) * 100 ;
		   	 insertComma("OVERTAX");
		}
	}
	
	function calDate()
	{

		var fromDate = removeDash(document.getElementById("FROMDATE").value);
		var toDate = removeDash(document.getElementById("TODATE").value);


		var period = getDiffMon(fromDate,toDate)  ;
			
		document.getElementById("period").value = period;
		
		var fromDay1 = new Date(fromDate.substr(0,4),fromDate.substr(4,2),fromDate.substr(6,2));
		var toDay1 = new Date(toDate.substr(0,4),toDate.substr(4,2),toDate.substr(6,2));
		
	}	
	
	function fun1()
	{
		//alert(" adjust= "+document.getElementById("adjust111").value);
		
		
		var adjust = document.getElementById("ADJUSTMENT").value;

		var reduction_rate = document.getElementById("REDUCTION_RATE").value;
		var reduction_rate_form = "";

		// ������
		if( reduction_rate == '' || reduction_rate == '0'){			
			reduction_rate = "";
			reduction_rate_form = "";	// ������(���)

		}else{
		
			reduction_rate_form = " X ((100-"+reduction_rate+")/100)";	// ������(���)
		}
          
		//alert('${old_use_section}');
         		
		if('${old_use_section}' == '1')
		{
          
			//    var sum_year = removeComma(document.getElementById("sum_year").value);
			var sum_lastyear =document.getElementById("sum_lastyear").value;
           	var SUM_ADJUST = Number( removeComma(sum_lastyear))*Number(adjust);
           	var strSUM_ADJUST = String( Math.floor(SUM_ADJUST));
  			//SUM_ADJUST = Math.floor( Number(SUM_ADJUST) / 100 ) * 100 ; //100�� ����
  			SUM_ADJUST = Math.floor( Number(SUM_ADJUST)*((100-reduction_rate)/100) / 100 ) * 100 ; //100�� ����
  			document.getElementById("SUM_ADJUST").value = SUM_ADJUST;
  			document.getElementById("FORM_ADJUST").value = sum_lastyear + "�� X "+ adjust+reduction_rate_form;
  			document.getElementById("SUM_YEAR").value = insertComma2(SUM_ADJUST);
  
  			// ������ �ݾ�
			document.getElementById("OVERTAX").value =  Math.floor((  Number(SUM_ADJUST) * 3.0 / 100 + Number(SUM_ADJUST) ) /100 ) * 100 ;
			insertComma("OVERTAX");
  
 		}else if('${old_use_section}' == '2')
 		{
 	 		
 			//�۳⵵ 1��ġ ����ᰡ �����Ƿ� ���� ����
			var rate = '${old_rate}';
			//var price = '${old_price}';
			var price = removeComma(document.getElementById("PRICE").value);
			var area_after = document.getElementById("AREA_AFTER").value;

			var strSUM_ADJUST = String( Math.floor(SUM_ADJUST));

			//���⵵ ����� ���
			var SUM_ADJUST = Number(area_after)*12/12*Number(rate)*Number(price)*Number(adjust)*((100-reduction_rate)/100);
      		var strSUM_ADJUST = String( Math.floor(SUM_ADJUST)); // �Ҽ��� ����        
      
   			SUM_ADJUST = Math.floor( Number(SUM_ADJUST) / 100 ) * 100 ; //100�� ����
			document.getElementById("SUM_ADJUST").value = SUM_ADJUST;
  			document.getElementById("FORM_ADJUST").value = area_after+"�� X 12/12 ���� X " +rate +" X " +insertComma2(price)+" X "+adjust + reduction_rate_form;
  			document.getElementById("SUM_YEAR").value = insertComma2(SUM_ADJUST);
  	
  			// ������ �ݾ�
  			document.getElementById("OVERTAX").value =  Math.floor((  Number(SUM_ADJUST) * 3.0 / 100 + Number(SUM_ADJUST) ) /100 ) * 100 ;
  			insertComma("OVERTAX");

		}
	}
	
	 function getRateAjax(addSum)
     {

        //var params = 'addsum='+addSum;
        var params = 'addsum='+addSum+'&idx=0';
		var url = "/gapan/getRate.do" ;
        var a = sendRequest1(url, params, rateFromServer, "Post");  // rateFromServer �Լ��� rate �� �޾ƿ�����
     } 

       function rateFromServer()
       {      
           if(httpRequest.readyState == 4)
           {

               if(httpRequest.status == 200)
               {
               
	               //��������� ���
				   var adjust = httpRequest.responseText; //���� ����� �޾ƿ�.
				   
				   
				   document.getElementById("adjust111").value = adjust;
				   document.getElementById("ADJUSTMENT").value = adjust;
				   
				   //alert(adjust);
				   
				  fun1();
				   
				   
					
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
	
	function sendRequest1(url, params, callback, method)	
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
	
	
	
		//view ȭ�� �̵�
	function goView(gapan_no,sum_seq,seq,currentPage,countPage,year,usesection)
	{
		location.href("/gapan/junggi/junggi_view.do?gapan_no="+gapan_no+"&seq="+seq+"&sum_seq="+sum_seq+"&currentPage="+currentPage+"&year="+year+"&usesectoin="+usesection);
		
	}
	
	
	
	
	
	function setYear()
	{
		now = new Date();
		Y = now.getFullYear();
		
		var date = new Date();
		
		
		strYear = "${product.YEAR}";
		
		for(var i = 0 ; i < 10 ; i++){
			  newItem = new Option(i);
			  document.getElementById("YEAR").options[i]  = newItem;
			  document.getElementById("YEAR").options[i].text = Y+(10-i);
			  document.getElementById("YEAR").options[i].value = Y+(10-i);
			  if(strYear == Y+(10-i)) document.getElementById("YEAR").options[i].selected = true;
		}
		

		for(var i = 0 ; i < 10 ; i++){
			  newItem = new Option(i);
			  document.getElementById("YEAR").options[i+10]  = newItem;
			  document.getElementById("YEAR").options[i+10].text = Y-i;
			  document.getElementById("YEAR").options[i+10].value = Y-i;
			  if(strYear == Y-i) document.getElementById("YEAR").options[i+10].selected = true;
		} 	
	}
	
	
	function changeYear(yearVal)
	{
		document.getElementById("FROMDATE").value = yearVal+"-01-01";
		document.getElementById("TODATE").value = yearVal+"-12-31";
	}
	
	//�������� �˾�
	function openLandPricePopUp()
	{
		var winW = 320;
		var winH = 133;
		var status ="toolbar=no, location=no, directories=no, status=no, menubar=no, resizable=no, scrollbars=no, width="+winW+", height="+winH+", left=0, top=0"
		//window.open('/jsp/jumyong/jumyong/officialLandPrice.html', 'win', status);	

		var admin_no = document.getElementById("GAPAN_NO").value;
		var year = document.getElementById("YEAR").value;
		var gp_typ = document.getElementById("GP_TYP").value;
		window.open('/gapan/officialLandPrice.do?ADMIN_NO='+admin_no+'&year='+year+'&gp_typ='+gp_typ, 'win', status);
	}
	-->
	
	
	
	
</script>

</head>

<body onload="javascript:InitPage();"  border="0">

<form name="productForm" id="productForm" method="post" action = "/gapan/junggi/junggi_product.do" >
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

<input name="adjust111" id="adjust111" value="" type="hidden" >		
<input name="seq"  id="seq" value="${seq}" type="hidden" >
<input name="FIRST_SEQ" id="FIRST_SEQ" value="${product.FIRST_SEQ}" type="hidden" >
<input name="mode"  id="mode" value="${mode}" type="hidden" >
<input name="RATE1" id="RATE1" type="hidden"  value="" >
<spring:bind path="product.GAPAN_NO">		
<input name="GAPAN_NO" id="GAPAN_NO" value="${gapan_no}" type="hidden" >
</spring:bind>
<input name="gapan_no" id="gapan_no" value="${gapan_no}" type="hidden" >
<input type="hidden" name="GP_TYP" value="${product.GP_TYP}">
<input type="hidden" name="ADD_SET" value="${product.ADD_SET}">
<input type="hidden" name="ADD_YN" value="${product.ADD_YN}">
<input type="hidden" name="SUBUSEO_CD" value="${product.SUBUSEO_CD}">
	<tr>
		<td>
			<table width="780" border="0" cellspacing="0" cellpadding="0">
		    	<tr>
		        	<td class="contborder_purple">		
				            					            
						<table width="100%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td>
							    	<table width="100%" border="0"  cellpadding="0" cellspacing="0"  class="sub_table">
										<tr>
											<td width="10%" height="26" align="left"  class="sub_table_b">* ���� ���� ����Ʈ</td>		
										</tr>
									</table>	
							 	</td>
							 </tr>
							 <tr>
							 	<td>
							    	<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
							        	<tr>
							            	<td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">�ΰ��⵵</td>
							                <td align="center" bgcolor="e5eff8" class="sub_table_b">����</td>
							                <td align="center" bgcolor="e5eff8" class="sub_table_b">�Ϲ� �����</br>(���� ������) </td>							                    
							                <td align="center" bgcolor="e5eff8" class="sub_table_b">���� ����� </br>(���� ����)</td>
							                <td align="center" bgcolor="e5eff8" class="sub_table_b"> ������ </td>
							                <td align="center" bgcolor="e5eff8" class="sub_table_b"> ���Ա��� </td>
							                <td align="center" bgcolor="e5eff8" class="sub_table_b"> ���� ���� </td>							                    							                    
							            </tr>

										<c:forEach items="${cal_sum_infoList}" var="board" varStatus="idx">
										
										
										<c:choose>
										<c:when test="${board.SEQ != cal_sum_seq }">
											<tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" 
						                	onclick="javascript:goView('${gapan_no}','${board.SEQ}','','${currentPage}','${countPerPage}','${board.YEAR}','${board.USE_SECTION}');" style="cursor:pointer" >
										</c:when>
										<c:otherwise>
											<tr onclick="javascript:goView('${gapan_no}','${board.SEQ}','','${currentPage}','${countPerPage}','${board.YEAR}','${board.USE_SECTION}','${board.SUM_ADJUST }');" bgcolor="#f6f7f8">
										</c:otherwise>
										</c:choose>
						             	
						                	<td height="26" align="center">${board.YEAR}</td>
						                	<td align="center">${board.AREA}</td>
						                    <td align="center">${rnic:insertComma2(board.SUM_ADJUST) }</td>
						                    <td align="center">${rnic:insertComma2(board.SUM) }</td>
						                    <td align="center">${board.REDUCTION_RATE}%</td>
						                    <td align="center">${board.TAX_SET_NAME}</td>							                        							                        
						                    <td align="center">${board.USE_SECTIONNAME}</td>
						                </tr> 
										</c:forEach>
									</table>
								</td>
							</tr>
							<tr>
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
					                    <tr>
					                	</tr>
									</table>
								</td>
							</tr>
							<tr>
								<td>
							    	<table width="100%" border="0"  cellpadding="0" cellspacing="0"  class="sub_table">
										<tr>
											<td width="10%" height="26" align="left"  class="sub_table_b">* �⵵�� ���� ����</td>		
										</tr>
									</table>	
							   	</td>
							</tr>
							             
							<tr>
								<td>
							    	<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
							        	<tr>
						                    <td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">�ΰ��⵵</td>
						                    <td align="center" bgcolor="e5eff8" class="sub_table_b">����</td>
						                    <td align="center" bgcolor="e5eff8" class="sub_table_b">����</td>
						                    <td align="center" bgcolor="e5eff8" class="sub_table_b">����Ⱓ</td>
						                    <td align="center" bgcolor="e5eff8" class="sub_table_b">���� ���� ����� </td>
						                    <td align="center" bgcolor="e5eff8" class="sub_table_b">���⵵ ����� </td>
						                    <td align="center" bgcolor="e5eff8" class="sub_table_b">���� ����� </td>
						                    <td align="center" bgcolor="e5eff8" class="sub_table_b">���� ���� </td>							                    
							         	</tr>
							                    
							                    
							            <c:forEach items="${ImpositionInfoByCalSumList}" var="board" varStatus="idx">
							            
							            <c:choose>
										<c:when test="${board.SEQ != seq }">
											 <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" 
							                onclick="javascript:goView('${gapan_no}','${cal_sum_seq}',${board.SEQ},'${currentPage}','${countPerPage}','${board.YEAR}','${board.USE_SECTION}');" style="cursor:pointer" >
										</c:when>
										<c:otherwise>
											<tr onclick="javascript:goView('${gapan_no}','${cal_sum_seq}',${board.SEQ},'${currentPage}','${countPerPage}','${board.YEAR}','${board.USE_SECTION}');" bgcolor="#f6f7f8">
										</c:otherwise>
										</c:choose>
							            
							           
							            	<td height="26" align="center">${board.YEAR}</td>
							                <td align="center">${board.AREA_AFTER}</td>
					                        <td align="center">${board.RATE }</td>
					                        <td align="center">${rnic:addDash(board.FROMDATE)}~${rnic:addDash(board.TODATE)}</td>
					                        <td align="center">${rnic:insertComma2(board.SUM_LASTYEAR) }</td>
					                        <td align="center">${rnic:insertComma2(board.SUM_YEAR) }</td>
					                        <td align="center">${rnic:insertComma2(board.SUM_ADJUST) }</td>
					                        <td align="center">
					                        
					                        <c:if test="${rnic:insertComma2(board.SUM_ADJUST) == '0'}">
					                        	�̻���
								            </c:if>	
					                        <c:if test="${rnic:insertComma2(board.SUM_ADJUST) != '0'}">
					                        	����
								            </c:if>	
					                        
					                        
					                        </td>							                        
																	                        
					                        
					                  	</tr> 
									  	</c:forEach>
					                </table>
					            </td>
					        </tr>
							<tr>
								<td height="40" align="center">
									<table width="100%" border="0" cellspacing="0" cellpadding="0">
							        	<tr>
							            	<td align="center">
							            		<table border="0" cellpadding="0" cellspacing="0">
							                    	<tr>
							                        <!-- ����¡ ���� -->
							                        </tr>
							               		</table>
							               	</td>
					                    </tr>							                   
					             	</table>
					           	</td>
							</tr>
						</table>
						
						<div id="edit" style="width:100%;">
		  				<table width="100%" border="0" cellspacing="0" cellpadding="0">
		  					<tr>
				            	<td>
				                	<table width="100%" border="0"  cellpadding="0" cellspacing="0"  class="sub_table">
										<tr>
									    	<td width="10%" height="26" align="left"  class="sub_table_b">* ���� ����</td>		
									    </tr>
									</table>	
				                </td>
				        	</tr>
					        <tr>
					        	<td>
					            	<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
						            	<tr>
						                	<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�ΰ��⵵</td>
						                	<td width="42%" bgcolor="eaeaea" class="table_bl_left" >
												<spring:bind path="product.YEAR">
						                      	<!-- select name="YEAR" id="YEAR" class="input_form1" style="width:130px" onchange="changeYear(this.value);">
						                      	</select-->
												<input name="YEAR" id="YEAR" type="text" value = "${product.YEAR}" style="width:80px;ime-mode:disabled;"  class="input_form1"  onKeyDown="onlyNumberInput();">
												</spring:bind>
							                
											</td>                     
											<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
					                    	<td width="32%" bgcolor="eaeaea" class="table_bl_left" >

					                   		<!-- input name="PRICE" ID="PRICE" value="${product.PRICE}" type="text" class="input_form1" style="width:120px" onkeypress="javascript:checkWon(this);"-->
						                	<spring:bind path="product.PRICE">   		
						                   		<input name="PRICE" ID="PRICE" value="${rnic:insertComma2(product.PRICE)}" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" onkeyup="javascript:fn_addComma(this)"  onKeyDown="onlyNumberInput();" >��	 
											</spring:bind>
						                  	<img src="/img/landPrice.gif" alt="����������ȸ" height="18" border="0" style="cursor:pointer" onclick="javascript:openLandPricePopUp()"; >
											</td> 
					                  	</tr> 
					                  	<tr>
					                    	<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�������</td>
					                    	<td bgcolor="eaeaea" class="table_bl_left" >
											<spring:bind path="product.AREA_AFTER">
						                    	<input name="AREA_AFTER" id="AREA_AFTER" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value="${product.PLACE_A}"   onKeyDown="onlyNumberInput();" readonly>��
											</spring:bind>
											
											</td>                     
											<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�������</td>
					                    	<td bgcolor="eaeaea" class="table_bl_left" >
											<spring:bind path="product.RATE">
												<input name="RATE"  id="RATE" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value="${product.RATE}"  onKeyDown="onlyNumberInput();" readonly>
											</spring:bind>
											</td> 
					                  	</tr>     
										<tr height="50">
						                    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">���� �Ⱓ</td>
						                    <td bgcolor="eaeaea" class="table_bl_left" >
						                    	<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						                        	<tr>
							                        	<td>
														<spring:bind path="product.FROMDATE">
						                          			<input name="FROMDATE" id="FROMDATE" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value="${rnic:addDash(product.FROMDATE)}"  onKeyDown="onlyNumberInput();"   onKeyDown="onlyNumberInput();" maxlength=10>
														</spring:bind>
							                          	</td>
							                          	<td>
								                          	<img src="/img/calendar_icon.gif" onclick="popUpCalendar(this, document.getElementById('FROMDATE'), 'yyyymmdd');"  style="cursor:pointer" >
							                          	</td>
							                          
							                          	<td width="16" align="center">~</td>
							                          	<td>
														<spring:bind path="product.TODATE">													
								                          	<input name="TODATE" id="TODATE" type="text" class="input_form1" style="width:80px;ime-mode:disabled;"  value="${rnic:addDash(product.TODATE)}"  onKeyDown="onlyNumberInput();" maxlength=10>
														</spring:bind>
							                          	</td>
							                          	<td>
							                     			<img src="/img/calendar_icon.gif" onclick="popUpCalendar(this, document.getElementById('TODATE'), 'yyyymmdd');"  style="cursor:pointer" >
							                          	</td>
						                          	
						                        	</tr>
						                        	<tr><td height="3"></td></tr>
						                        	<tr>
						                        		<td colspan="5">
						                        			�޼� : 
															<spring:bind path="product.PERIOD">																		                    	
										                    	<input name="PERIOD" id ="PERIOD" type="text" class="input_form1" style="width:60px;ime-mode:disabled;" value = "${product.PERIOD}"   onKeyDown="onlyNumberInput();" >
															</spring:bind>						                    	
															<img src="/img/cal_month.gif" align="absmiddle" alt="��¥ ���" width="56" height="18" border="0" style="cursor:pointer" onClick="javascript:calDate();">
						                        			
						                        		</td>
						                        	</tr>
						                    	</table>
						                    </td>
						                    <!-- td bgcolor="eaeaea" class="table_bl_left" colspan="2">
						                    	<!--
						                    	 �ϼ� : <input name="dateCount" id="dateCount" type="text" class="input_form1" style="width:60px;ime-mode:disabled;"  onKeyDown="onlyNumberInput();" >-->
						                    	<!-- �޼� : 
												<spring:bind path="product.PERIOD">																		                    	
							                    	<input name="PERIOD" id ="PERIOD" type="text" class="input_form1" style="width:60px;ime-mode:disabled;" value = "${product.PERIOD}"   onKeyDown="onlyNumberInput();" >
												</spring:bind>						                    	
												<img src="/img/detail_icon.gif" alt="��¥ ���" width="56" height="18" border="0" style="cursor:pointer" onClick="javascript:calDate();">
											</td-->
						                 	<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">���� ���� </br>���� �����</td>
						                    <td width="42%" bgcolor="eaeaea" class="table_bl_left" >
													<spring:bind path="product.SUM_LASTYEAR">													
														<input name="SUM_LASTYEAR" id="SUM_LASTYEAR" type="text"  class="input_form1" style="width:80px;ime-mode:disabled;" value="${rnic:insertComma2(product.SUM_LASTYEAR)}"   onKeyDown="onlyNumberInput();" onkeyup="javascript:fn_addComma(this)">��
													</spring:bind>
											</td> 
						             	</tr>
						             	<tr>
						             		<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">���⵵ �����</td>
						                    <td width="32%" bgcolor="eaeaea" class="table_bl_left" >
													<spring:bind path="product.SUM_YEAR">
														<input name="SUM_YEAR" id="SUM_YEAR" type="text" class="input_form1" style="width:120px;ime-mode:disabled;" value="${rnic:insertComma2(product.SUM_YEAR)}"   onKeyDown="onlyNumberInput();" onkeyup="javascript:fn_addComma(this)" >��
													</spring:bind>
											</td> 
						             		<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">���� �����</td>
						                    <td bgcolor="eaeaea" class="table_bl_left" >
													<spring:bind path="product.SUM_ADJUST">													
														<input name="SUM_ADJUST" id="SUM_ADJUST" type="text" class="input_form1" style="width:120px;ime-mode:disabled;" value="${rnic:insertComma2(product.SUM_ADJUST)}"  onKeyDown="onlyNumberInput();" onkeyup="javascript:fn_addComma(this)" >��
													</spring:bind>
											</td>																			             	
						             	</tr>
						             	<tr>
						             		<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">���� ���</td>
						                    <td bgcolor="eaeaea" class="table_bl_left" colspan="3">
													<spring:bind path="product.ADJUSTMENT">													
														<input name="ADJUSTMENT" id="ADJUSTMENT" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value="${product.ADJUSTMENT}"   onKeyDown="onlyNumberInput();" >
													</spring:bind>
											</td>
						             	</tr>
						             	<tr>
						             		<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">�ΰ�����</td>
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
						             		<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">���⳻����</td>
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
						             	<tr>
						             		<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">����������</td>
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
						             		<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">�����ıݾ�</td>
						                    <td bgcolor="eaeaea" class="table_bl_left" >
						                    	<spring:bind path="product.OVERTAX">
				                          			<input name="OVERTAX" id="OVERTAX" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value="${rnic:insertComma2(product.OVERTAX)}"  onKeyDown="onlyNumberInput();"   onKeyDown="onlyNumberInput();" maxlength=10>
												</spring:bind>
						                    </td>
						             	</tr>
						             	<tr>
						                	<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�⺻ �����</td>
						                    <td colspan="3" bgcolor="eaeaea" class="table_bl_left" >
												<spring:bind path="product.FORM">																		                    
													<input name="FORM" ID="FORM" type="text" class="input_form1" style="width:600px" value="${product.FORM}">
												</spring:bind>														
											</td>
						            	</tr>
						             	<tr>	
						                  	<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">���� �����</td>
						                    <td colspan="3" bgcolor="eaeaea" class="table_bl_left" >
												<spring:bind path="product.FORM_ADJUST">													
													<input name="FORM_ADJUST" id="FORM_ADJUST" type="text" class="input_form1" style="width:600px" value="${product.FORM_ADJUST}" >
												</spring:bind>
											</td>
				                  	 	</tr>
				                  	 	<tr>	
						                  	<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">������ (%)</td>
						                    <td width="32%" bgcolor="eaeaea" class="table_bl_left" colspan="3">
												<spring:bind path="product.REDUCTION_RATE">
													<input name="REDUCTION_RATE" id="REDUCTION_RATE" type="text" class="input_form1" style="width:80px" value="${product.REDUCTION_RATE}" >
												</spring:bind>
											</td>
				                  	 	</tr>
				                  	 	<tr>
				                  	 		<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">���鳻��</td>
						                    <td bgcolor="eaeaea" class="table_bl_left"  colspan="3">
												<spring:bind path="product.REDUCTION_REASON">
													<input name="REDUCTION_REASON" id="REDUCTION_REASON" type="text" class="input_form1" style="width:70%" value="${product.REDUCTION_REASON}" >
												</spring:bind>
											</td>
				                  	 	
				                  	 	</tr>
				                  	</table>
				                  </td>
				                </tr>
								<tr>              
				                	<td height="40" align="right">
						                <img src="/img/accou_icon.gif" alt="���" width="56" height="18" border="0" onclick="javascript:Calculate();" style="cursor:pointer">
						                <img src="/img/save_icon2.gif" alt="����" width="56" height="18" border="0" onClick="javascript:submitClick();" style="cursor:pointer" >
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
								