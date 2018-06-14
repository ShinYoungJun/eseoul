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
        <script language="javascript" src="/js/calculation.js"></script> 

        <script>
            function InitPage()
            {
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


            function	Page(page)
            {
                if(page	==	"")
                    return;

                var form = document.productForm;

                var admin_no = document.getElementById("ADMIN_NO").value;
                var mode = document.getElementById("mode").value;

                location.href="junggi_view.do?currentPage="+page+"&ADMIN_NO="+admin_no+"&mode="+mode;
            }


            function	View(adminno, seq)
            {
                params	= "ADMIN_NO=" + adminno + "&SEQ=" + seq;

                sendRequest("/jumyong/saewe/sanchulinfo_view.do", params, "GET", Result_InfoView);

                parent.BugwaView(seq);
            }


            function	Result_InfoView(obj)
            {

                var xmldoc 	= new ActiveXObject("Microsoft.XMLDOM");
                var form 	= document.form;

                xmldoc.async	= false;
                xmldoc.loadXML(obj);

            }


            function submitClick()
            {
                var productForm = document.productForm;

                if( productForm.mode.value == 'add' ){
                }
                if(	productForm.YEAR.value == '0' || productForm.YEAR.value == '' ){
                    alert("부과년도를 넣어주세요.");
                    productForm.YEAR.focus();
                    return;
                }
                if(	productForm.OVERTAX.value == '' || productForm.OVERTAX.value == '0' ){
                    alert("납기후 금액을 넣어주세요.");
                    productForm.OVERTAX.focus();
                    return;
                }
                if( productForm.FORM_ADJUST.value == '' ){
                    alert("계산을 먼저 해주세요. ");
                    return;
                }
                if('${product.CHECK_YN}' == '2'){
                    if(	productForm.PRICE.value == '0' || productForm.PRICE.value == '' ){
                        alert("공시지가를 넣고 계산해주세요. ");
                        productForm.PRICE.focus();
                        return;
                    }
                }
                if(	productForm.TAX_DATE.value == '' ){
                    alert("부과일자를 넣어주세요.");
                    productForm.TAX_DATE.focus();
                    return;
                }
                //alert("year=== " + document.productForm.YEAR.value);
                if( confirm("저장하시겠습니까? " ) ){
                    document.productForm.year.value = document.productForm.YEAR.value;
                    document.productForm.mode_proc.value = "addProc";
                    //comma제거
                    if( '${product.CHECK_YN}' == '2'){
                        removeComma2("PRICE");
                    }
                    removeComma2("SUM_LASTYEAR");
                    removeComma2("SUM_YEAR");
                    removeComma2("SUM_ADJUST");
                    removeComma2("OVERTAX");
                    removeComma2("REDUCTION_SUM");
                    removeComma2("VAT");


                    if( document.getElementById("REDUCTION_RATE").value == '' ){
                        document.getElementById("REDUCTION_RATE").value = '0';
                    }
                    if( document.getElementById("PERCENT_RATE").value == '' ){
                        document.getElementById("PERCENT_RATE").value = '0';
                    }
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

                location.href = "/jumyong/junggi/junggi_product.do?ADMIN_NO=${no}&year=${year}&currentPage=${currentPage}&countPerPage=${countPerPage}"
                    +"&mode=edit";
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
                var productForm = document.productForm;
                var checkYn = '${product.CHECK_YN}'; 
                                
                if( checkYn == '2' ){
                    if(	productForm.PRICE.value == '0' || productForm.PRICE.value == '' ){
                        alert("공시지가를 넣고 계산해주세요. ");
                        productForm.PRICE.focus();
                        return;
                    }
                }

                junggi_calDate();

                var period = document.getElementById("PERIOD").value;

                if(Number(period) > 12){
                	   alert("기간이 12개월을 초과할수 없습니다.");
                       productForm.PERIOD.focus();
                       return;
                }

                if(Number(period) < 0){
             	   alert("기간이 입력이 잘못되었습니다.");
                    productForm.PERIOD.focus();
                    return;
				}

                var area_after = document.getElementById("AREA_AFTER").value;
                var rate = document.getElementById("RATE").value;

                var reduction_rate = document.getElementById("REDUCTION_RATE").value;
                var percent_rate = document.getElementById("PERCENT_RATE").value;
                var reduction_rate_form = "";
                
                var section = '${product.SECTION}';
                var checkYn = '${product.CHECK_YN}'; 
                var type = "${product.TYPE}";
                
                if( percent_rate == '' || percent_rate == '0' || percent_rate == '0.0'){
                	percent_rate = '100.0';
                }
                
                if(percent_rate != '0.0' && percent_rate != '100.0'){
                	reduction_rate_form += " X (("+percent_rate+")/100)";
                }
                if(reduction_rate != '0.0'){
                	reduction_rate_form += " X ((100-"+reduction_rate+")/100)";
                }

                // 무단인 경우 과징율
                var surcharge_rate = "";
                if( section == '3' ){
                    surcharge_rate = document.getElementById("SURCHARGE_RATE").value;
                }

                if('${product.SURCHARGE_RATE}'=='' || '${product.SURCHARGE_RATE}' == '0.0')
                surcharge_rate = 1.2;
                
                
                var sum_year = "";
                if( checkYn == '2' ){
                    var price = removeComma(document.getElementById("PRICE").value);
                    document.getElementById("FORM").value = area_after+"㎡ X " +rate +" X " +insertComma2(price)+" X " + period + "/12 개월 ";

                    
                    if( section == '3' ){
                        sum_year = fixFloatCal(parseFloat(area_after)*parseFloat(period)/12*parseFloat(rate)*parseFloat(price)*(surcharge_rate));
                    }else{
                        sum_year = fixFloatCal(parseFloat(area_after)*parseFloat(period)/12*parseFloat(rate)*parseFloat(price));
                    }
                }else{

                    document.getElementById("FORM").value = area_after+"㎡  X " +rate + " X " + period + "/12개월";

                    //현년도 점용료 계산
                    if( section == '3' ){
                        sum_year = fixFloatCal(parseFloat(area_after)*parseFloat(period)/12*parseFloat(rate)*(surcharge_rate));
                    }else{
                        sum_year = fixFloatCal(parseFloat(area_after)*parseFloat(period)/12*parseFloat(rate));
                    }
                }

                //부동소수점 오류 수정
                sum_year = fixFloatCal(sum_year);

                //감면 / 지분율 계산을 위해 백업
                var sum = sum_year;
                var gongyu = "${product.PURPOSE_CD}".charAt(0); // 점용목적. 공물법이면 0으로 시작

                var strSUM_ADJUST = String( Math.floor(sum_year)); // 소수점 제거

                if(section != '3'){
                
                	if(type != '1'){
                        sum_year = (Math.floor(Number(strSUM_ADJUST)/10))* 10; //10원 절삭
                    }else{
                        if(gongyu == '0'){
                        	sum_year = (Math.floor(Number(strSUM_ADJUST)/10))* 10; //10원 절삭
                        }else{
                        	sum_year = (Math.floor(Number(strSUM_ADJUST)/100))* 100; //100원 절삭
                        }
                    }
                }else{
                    sum_year = (Math.floor(Number(strSUM_ADJUST)));
                }
                
                document.getElementById("SUM_YEAR").value = sum_year;

                insertComma("SUM_YEAR");

                //현년도 점용료 계산 끝


                if(section != '3' )//작년도 점용료가 있을때 (무단인 경우는 전년 점용료 관계없음)
                {
                 	continueProduct();
                    
                }else{
                    document.getElementById("FORM_ADJUST").value = document.getElementById("FORM").value+" X "+surcharge_rate;
                    document.getElementById("REDUCTION_FORM").value = document.getElementById("FORM").value+" X "+surcharge_rate + reduction_rate_form;
                    
                    document.getElementById("SUM_ADJUST").value = sum_year;
                    
                    var reduction_sum = parseFloat(sum) * ((parseFloat(percent_rate))/100) * ((100 - parseFloat(reduction_rate))/100);
                    //부동소수점 오류 수정
                    reduction_sum = fixFloatCal(reduction_sum);

            		if(type != '1'){
            			document.getElementById("REDUCTION_SUM").value = parseInt(Math.floor(reduction_sum/10)*10); //10원 절삭
            		}else{
            			if(gongyu == '0'){	// 공물법적용 10원 절삭
            				document.getElementById("REDUCTION_SUM").value = parseInt(Math.floor(reduction_sum/10)*10); //10원 절삭
                        }else{
                        	document.getElementById("REDUCTION_SUM").value = parseInt(Math.floor(reduction_sum/100)*100); //100원 절삭
                        }
                	}
            		
                    // 납기후 금액
                    if(type != '1' && "${product.PURPOSE_CD}".substr(0,2) == '02'){
                        var overtax = parseFloat(document.getElementById("REDUCTION_SUM").value);
                    }else{
                        var overtax = parseFloat(document.getElementById("REDUCTION_SUM").value)*3/100 + parseFloat(document.getElementById("REDUCTION_SUM").value);
                    }
                    
                    overtax = Math.floor(overtax/10)*10;
                   	document.getElementById("OVERTAX").value = overtax;

                   	// 부가가치세
                   	document.getElementById("VAT").value = inquiryVatYN('${product.SECTION}','${product.TYPE}','${product.PURPOSE_CD}',Number(document.getElementById("REDUCTION_SUM").value));
                   	
                    insertComma("SUM_ADJUST");
                    insertComma("REDUCTION_SUM");
                    insertComma("OVERTAX");
                    insertComma("VAT");

                }
            }

            function continueProduct()
            {
            	var checkYn = '${product.CHECK_YN}';
            	var type = "${product.TYPE}";


                if(checkYn == '2'){
                	var price = removeComma(document.getElementById("PRICE").value);
                    var old_price = "${old_price}";
                }else{
                    var price = 1;
                    var old_price = 1;

                }
                
               
                var period = document.getElementById("PERIOD").value;


                var area_after = setFROMTO(document.getElementById("AREA_AFTER").value,0,1);
                var rate = setFROMTO(document.getElementById("RATE").value,0,1);
                
                var old_area = setFROMTO("${old_area_after}",0,1);
                var old_rate = setFROMTO("${old_rate}",0,1);


                var rateSumyear = fixFloatCal(parseFloat(old_area)*parseFloat(rate)*parseFloat(price));
                var rateLastyear = removeComma(document.getElementById("SUM_LASTYEAR").value);

                var rate1 = Math.floor((rateSumyear - rateLastyear ) / rateLastyear *100 ); // 현년도 작년도 점용료 비율
                var gongyu = "${product.PURPOSE_CD}".charAt(0); // 점용목적. 공물법이면 0으로 시작
                //console.log("gongyu: " + 	gongyu);
                //console.log("rate1: " + 	rate1);
                //console.log("checkYn: " + 	checkYn);
                //console.log("type: " + 	type);
                if(gongyu == '0' && rate1 >= 5 && rate1 <=3000 && checkYn == '2' && type == '1'){
                	var adjust = (rateSumyear - (rateLastyear + (rateLastyear * 0.05))) * 0.3;	// jojung_rate가 5이상이면 증가율의 70%가 조정계수가 됨
                	//console.log("adjust: " + adjust);
                }
                else if( rate1 >= 10 && rate1 <=3000 && checkYn == '2' && type == '1')//비율이 허용 범위내에 있을때
                {	
                    //var adjust = calJojungNew(rate1);
                	var adjust = calJojung2015(rate1); // 수정(2016.01)
                }else if( rate1 >= 5 && checkYn == '2' && type != '1')//비율이 허용 범위내에 있을때
                {	
                	if(gongyu != 0){
                		var adjust = 1.05;
                    }else{
                    	var adjust = (rateSumyear - (rateLastyear + (rateLastyear * 0.05))) * 0.3;
                    }
                }else{
                	var adjust = 1;
                }

                if(old_area != area_after){
					//isAreaChange = true;
					var adjust = 1;
				}
				
                document.getElementById("ADJUSTMENT").value = adjust;
                
                var percent_rate = document.getElementById("PERCENT_RATE").value;
                var reduction_rate = document.getElementById("REDUCTION_RATE").value;
                var reduction_rate_form = "";

                if( percent_rate == '' || percent_rate == '0' || percent_rate == '0.0'){
                	percent_rate = '100.0';
                }
                
                if(percent_rate != '0.0' && percent_rate != '100.0'){
                	reduction_rate_form += " X (("+percent_rate+")/100)";
                }
                if(reduction_rate != '0.0'){
                	reduction_rate_form += " X ((100-"+reduction_rate+")/100)";
                }

                if(adjust == 1){

                	   var SUM_ADJUST = fixFloatCal(parseFloat(area_after)*parseFloat(rate)*parseFloat(price)*parseFloat(adjust)*parseFloat(period)/12);
                       var REDUCTION_SUM = fixFloatCal(SUM_ADJUST*((percent_rate)/100)*((100-reduction_rate)/100));                 

                       if(type != '1'){
                          //10원 절삭
                          SUM_ADJUST = Math.floor(SUM_ADJUST / 10 ) * 10 ; //10원 절삭
                          REDUCTION_SUM = Math.floor( REDUCTION_SUM / 10 ) * 10 ; //10원 절삭
                       }else{
                    	 //100원 절삭
                    	   if(gongyu == '0'){	// 공물법적용 10원 절삭
                    		   SUM_ADJUST = Math.floor(SUM_ADJUST / 10 ) * 10 ; //10원 절삭
                               REDUCTION_SUM = Math.floor( REDUCTION_SUM / 10 ) * 10 ; //10원 절삭
                           }else{
                        	   SUM_ADJUST = Math.floor(SUM_ADJUST / 100 ) * 100 ; //100원 절삭
                               REDUCTION_SUM = Math.floor( REDUCTION_SUM / 100 ) * 100 ; //100원 절삭
                           }
       				}
                       document.getElementById("SUM_ADJUST").value = insertComma2(SUM_ADJUST);
                       if(checkYn == '2'){
                      		document.getElementById("FORM_ADJUST").value = area_after+"㎡  X " +rate +" X " + insertComma2(price)+" X " + period + "/12 개월 X "+adjust;
                       }else{
                      		document.getElementById("FORM_ADJUST").value = area_after+"㎡  X " +rate +" X " + period + "/12 개월 ";
                       }
                       document.getElementById("REDUCTION_SUM").value = insertComma2(REDUCTION_SUM);
                       document.getElementById("REDUCTION_FORM").value = document.getElementById("FORM_ADJUST").value + reduction_rate_form;
                       

                }else{

                    var sum_lastyear =document.getElementById("SUM_LASTYEAR").value;
                    if(gongyu != 0){
	                    var SUM_ADJUST = fixFloatCal((parseFloat(removeComma(sum_lastyear))  * parseFloat(adjust)) * (parseFloat(area_after)/parseFloat(old_area)));
	                    var REDUCTION_SUM = fixFloatCal(SUM_ADJUST*((percent_rate)/100)*((100-reduction_rate)/100));                 

	                    //console.log("SUM_ADJUST: " + SUM_ADJUST);
	                    //console.log("REDUCTION_SUM: " + REDUCTION_SUM);
	                    
	                    if(type != '1'){
	                       //10원 절삭
	                       SUM_ADJUST = Math.floor(SUM_ADJUST / 10 ) * 10 ; //10원 절삭
	                       REDUCTION_SUM = Math.floor( REDUCTION_SUM / 10 ) * 10 ; //10원 절삭
	                    }else{
                        	//100원 절삭
                            SUM_ADJUST = Math.floor(SUM_ADJUST / 100 ) * 100 ; //100원 절삭
                            REDUCTION_SUM = Math.floor( REDUCTION_SUM / 100 ) * 100 ; //100원 절삭
	    				}
	                    document.getElementById("SUM_ADJUST").value = insertComma2(SUM_ADJUST);
	                    var formAdujst = sum_lastyear + "원 X " + period + "/12개월  X " + adjust;
	                   // if(area_after != old_area){
	                   // 	formAdujst += " X " + area_after + "㎡/"+old_area + "㎡";
	                   // }
	                    document.getElementById("FORM_ADJUST").value = formAdujst;
	                    document.getElementById("REDUCTION_SUM").value = insertComma2(REDUCTION_SUM);
	                    document.getElementById("REDUCTION_FORM").value = document.getElementById("FORM_ADJUST").value + reduction_rate_form;
                	}else{	// 공물법 적용
                		//var SUM_ADJUST = fixFloatCal((parseFloat(removeComma(sum_lastyear))  + parseFloat(adjust)) * (parseFloat(area_after)/parseFloat(old_area)));
                		var SUM_ADJUST = fixFloatCal((parseFloat(removeComma(sum_lastyear) * (removeComma(sum_lastyear)*0.05))  + parseFloat(adjust)) * (parseFloat(area_after)/parseFloat(old_area)));
	                    var REDUCTION_SUM = fixFloatCal(SUM_ADJUST*((percent_rate)/100)*((100-reduction_rate)/100));

	                    SUM_ADJUST = Math.floor( SUM_ADJUST / 10 ) * 10 ; //10원 절삭
                        REDUCTION_SUM = Math.floor( REDUCTION_SUM / 10 ) * 10 ; //10원 절삭
						var tempSum = parseFloat(removeComma(sum_lastyear) + (removeComma(sum_lastyear)*0.05));
                        var formAdujst = tempSum + "원 + "+ Math.floor(adjust);
	                    
	                    document.getElementById("FORM_ADJUST").value = formAdujst;
	                    document.getElementById("REDUCTION_SUM").value = insertComma2(REDUCTION_SUM);
	                    //document.getElementById("REDUCTION_FORM").value = document.getElementById("FORM_ADJUST").value + reduction_rate_form;

	                    if(reduction_rate_form != ""){
	                    	document.getElementById("REDUCTION_FORM").value = "(" + formAdujst + ")" + reduction_rate_form;
	                    }else{
	                    	document.getElementById("REDUCTION_FORM").value = formAdujst;
	                    }
                	}

                    

                }

                    // 납기후 금액
                    
	                if(type != '1' && "${product.PURPOSE_CD}".substr(0,2) == '02'){
	                    var overtax = (parseFloat(REDUCTION_SUM));
	                }else{
	                    var overtax = Math.floor(parseFloat(REDUCTION_SUM)*3.0/100 + parseFloat(REDUCTION_SUM));
	                }
	                
                    overtax = Math.floor(overtax/10)*10;
                    document.getElementById("OVERTAX").value = overtax;
                    insertComma("OVERTAX");


                	// 부가가치세
                   	document.getElementById("VAT").value = inquiryVatYN('${product.SECTION}','${product.TYPE}','${product.PURPOSE_CD}',Number(REDUCTION_SUM));
                   	insertComma("VAT");
                    

            }

            //view 화면 이동
            function goView(adminNo,sum_seq,seq,currentPage,countPage,year,usesection,modeCheck)
            {
                if( modeCheck == '0' ){
                    location.href("/jumyong/junggi/junggi_product.do?ADMIN_NO="+adminNo+"&SEQ="+seq+"&currentPage="+currentPage+"&year="+year+"&mode=edit");
                }
                else{
                    location.href("/jumyong/junggi/junggi_view.do?ADMIN_NO="+adminNo+"&seq="+seq+"&sum_seq="+sum_seq+"&currentPage="+currentPage+"&year="+year+"&usesectoin="+usesection);
                }
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

            //공시지가 팝업
            function openLandPricePopUp()
            {
                var winW = 320;
                var winH = 240;
                var status ="toolbar=no, location=no, directories=no, status=no, menubar=no, resizable=no, scrollbars=no, width="+winW+", height="+winH+", left=0, top=0";

                var admin_no = document.getElementById("ADMIN_NO").value;
                var year = document.productForm.YEAR.value;
                window.open('/land_price.do?ADMIN_NO='+admin_no+'&year='+year, 'win', status);
            }

        </script>
    </head>

    <body onload="javascript:InitPage();"  border="0">
        <form id="productForm" name="productForm" method="post" action = "/jumyong/junggi/junggi_product.do" >
            <input type="hidden" id="SIGU_CD" name="SIGU_CD" value="${product.SIGU_CD}">
            <input type="hidden" id="BJ_CD" name="BJ_CD" value="${product.BJ_CD}">
            <input type="hidden" id="TAX_NO" name="TAX_NO" value="${product.TAX_NO}">
            <input type="hidden" id="DEPT_CD" name="DEPT_CD" value="${product.DEPT_CD}">
            <input type="hidden" id="TAX_GUBUN" name="TAX_GUBUN" value="${product.TAX_GUBUN}">
            <input type="hidden" id="OBJ_SET" name="OBJ_SET" value="${product.OBJ_SET}">
            <input type="hidden" id="TAXPAYER_ID" name="TAXPAYER_ID" value="${product.TAXPAYER_ID}">
            <input type="hidden" id="TAXPAYER_SET" name="TAXPAYER_SET" value="${product.TAXPAYER_SET}">
            <input type="hidden" id="OCR_SIGU_CD" name="OCR_SIGU_CD" value="${product.OCR_SIGU_CD}">
            <input type="hidden" id="OCR_BUSEO_CD" name="OCR_BUSEO_CD" value="${product.OCR_BUSEO_CD}">
            <input type="hidden" id="TAX_CD" name="TAX_CD" value="${product.TAX_CD}">
            <input type="hidden" id="LIVE" name="LIVE" value="${product.LIVE}">
            <input type="hidden" id="ADD_SET" name="ADD_SET" value="${product.ADD_SET}">
            <input type="hidden" id="ADD_YN" name="ADD_YN" value="${product.ADD_YN}">

            <input type="hidden" id="listSize" name="listSize" value="${listSize }"><!-- 년도별 정기,수시 갯수  -->
            <input type="hidden" id="year_multi" name="year_multi" value="${year }">
            <input type="hidden" id="year" name="year" value="">
            <input type="hidden" id="mode_proc" name="mode_proc" value="">
            <input type="hidden" id="ADMIN_NO" name="ADMIN_NO" value="${no}">
            <input type="hidden" id="FIRST_SEQ" name="FIRST_SEQ" value="${product.FIRST_SEQ}">
            <input type="hidden" id="SEQ" name="SEQ"   value="${product.SEQ}">
            <input type="hidden" id="RATE1" name="RATE1" value="" >
            <input type="hidden" id="mode" name="mode"  value="${mode}">
            <input type="hidden" id="taxation_check" name="taxation_check" value="${taxation_check }">
            <input type="hidden" id="SUBUSEO_CD" name="SUBUSEO_CD" value="${product.SUBUSEO_CD }">
            <input type="hidden" id="SECTION" name="SECTION" value="${product.SECTION }">
            
            <table width="780" border="0" cellspacing="0" cellpadding="0">
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
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                                        <tr>
                                            <td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">부과년도</td>
                                            <td align="center" bgcolor="e5eff8" class="sub_table_b">면적</td>
                                            <td align="center" bgcolor="e5eff8" class="sub_table_b">${PRICE_NAME}</td>
                                            <td align="center" bgcolor="e5eff8" class="sub_table_b">최종 ${PRICE_NAME}</td>
                                            <td align="center" bgcolor="e5eff8" class="sub_table_b">지분율 </td>
                                            <td align="center" bgcolor="e5eff8" class="sub_table_b">감면율 </td>
                                            <td align="center" bgcolor="e5eff8" class="sub_table_b"> 세입구분 </td>
                                            <td align="center" bgcolor="e5eff8" class="sub_table_b"> 과세 구분 </td>
                                        </tr>


                                        <c:forEach items="${cal_sum_infoList}" var="board" varStatus="idx">
                                        <c:choose>
                                        <c:when test="${board.SEQ != sum_seq }">
                                        <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" onclick="javascript:goView('${no}','${board.SEQ}','','${currentPage}','${countPerPage}','${board.YEAR}','${board.USE_SECTION}');" style="cursor:pointer" >
                                        </c:when>
                                        <c:otherwise>
                                        <tr onclick="javascript:goView('${no}','${board.SEQ}','','${currentPage}','${countPerPage}','${board.YEAR}','${board.USE_SECTION}');" bgcolor="#f6f7f8">
                                        </c:otherwise>
                                        </c:choose>
                                        	<td height="26" align="center">${board.YEAR}</td>
                                            <td align="center">${board.AREA}</td>

                                            <td align="center">${rnic:insertComma2(board.SUM_ADJUST) }</td>
                                            <td align="center">${rnic:insertComma2(board.REDUCTION_SUM) }</td>
                                            <td align="center">${board.PERCENT_RATE}%</td>
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
                                                        ${strPageDivideForm_sum}
                                                    </tr>
                                                </table>
                                            </td>
                                        </tr>
                                    </table>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                                        <tr>
                                            <td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">부과년도</td>
                                            <td align="center" bgcolor="e5eff8" class="sub_table_b">면적</td>
                                            <td align="center" bgcolor="e5eff8" class="sub_table_b">요율(단가)</td>
                                            <td align="center" bgcolor="e5eff8" class="sub_table_b">산출기간</td>
                                            <td align="center" bgcolor="e5eff8" class="sub_table_b">전년 연간 ${PRICE_NAME}</td>
                                            <td align="center" bgcolor="e5eff8" class="sub_table_b">현년도 ${PRICE_NAME}</td>
                                            <td align="center" bgcolor="e5eff8" class="sub_table_b">조정 ${PRICE_NAME}</td>
                                            <td align="center" bgcolor="e5eff8" class="sub_table_b">부과 여부</td>
                                        </tr>
                                        <c:forEach items="${ImpositionInfoByCalSumList}" var="board" varStatus="idx">
                                        <c:choose>
                                        <c:when test="${board.SEQ != seq }">
                                        <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" onclick="javascript:goView('${no}','${sum_seq}',${board.SEQ},'${currentPage}','${countPerPage}','${board.YEAR}','${board.USE_SECTION}','${board.SUM_ADJUST }');" style="cursor:pointer" >
                                        </c:when>
                                        <c:otherwise>
                                        <tr onclick="javascript:goView('${no}','${sum_seq}',${board.SEQ},'${currentPage}','${countPerPage}','${board.YEAR}','${board.USE_SECTION}','${board.SUM_ADJUST }');" bgcolor="#f6f7f8">
                                        </c:otherwise>
                                        </c:choose>
                                            <td height="26" align="center">${board.YEAR}</td>
                                            <td align="center">${board.AREA_AFTER}</td>
                                            <td align="center">
                                        		<c:choose>
                                        		<c:when test="${product.CHECK_YN == '1'}">
                                        		${product.MOMEY}
                                        		</c:when>
                                                <c:otherwise>
                                                ${product.YOYUL}
                                                </c:otherwise>
                                            	</c:choose>
                                            </td>
                                            <td align="center">${rnic:addDash(board.FROMDATE)}~${rnic:addDash(board.TODATE)}</td>
                                            <td align="center">${rnic:insertComma2(board.SUM_LASTYEAR) }</td>
                                            <td align="center">${rnic:insertComma2(board.SUM_YEAR) }</td>
                                            <td align="center">${rnic:insertComma2(board.SUM_ADJUST) }</td>
                                            <td align="center"><font color="red">
                                            	<c:if test="${product.TAX_YN == '0'}">
	                    							미부과
                                                </c:if>
                                                <c:if test="${product.TAX_YN == '1'}">
	                    							부과
                                                </c:if>
                                                </font>
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
                                                        <!-- 페이징 삭제 strPageDivideForm-->
                                                    </tr>

                                                </table>
                                            </td>
                                        </tr>
                                        <tr>
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
                                                <td width="10%" height="26" align="left"  class="sub_table_b">* 세부 내역</td>
                                            </tr>
                                        </table>
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                             <table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                                                 <tr>
                                                     <td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">부과년도</td>
                                                     <td width="42%" bgcolor="eaeaea" class="table_bl_left" >
                                                     	<input id="YEAR" name="YEAR" type="text" value = "${product.YEAR}" style="width:80px;ime-mode:disabled;text-align:right"  class="input_form1"  onKeyDown="onlyNumberInput();">
                                         			</td>
                                    					<c:choose>
                                    					<c:when test="${product.CHECK_YN != '1'}">
                                    					<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">현년 공시지가</td>
                                    					<td width="32%" bgcolor="eaeaea" class="table_bl_left" >
                                    						<input id="PRICE" name="PRICE" value="${rnic:insertComma2(product.PRICE)}" type="text" class="input_form1" style="width:80px;ime-mode:disabled;text-align:right" onkeyup="javascript:fn_addComma(this)"  onKeyDown="onlyNumberInput();" >원
                                                     		<img src="/img/landPrice.gif" alt="공시지가조회" height="18" border="0" style="cursor:pointer" onclick="javascript:openLandPricePopUp()"; >
                                            			</td>
                                            </c:when>
         			                                <c:otherwise>
											<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b"></td>
											<td width="32%" bgcolor="eaeaea" class="table_bl_left" ></td>
											</c:otherwise>
											</c:choose>
										</tr>
                                        <tr>
                                            <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">현년 점용면적</td>
                                            <td bgcolor="eaeaea" class="table_bl_left" >
                                            	<input id="AREA_AFTER" name="AREA_AFTER" type="text" class="input_form1" style="width:80px;ime-mode:disabled;text-align:right" value="${product.AREA_SIZE}"   onKeyDown="onlyNumberInput();" readonly>㎡
                                           	</td>
	                                        <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">현년 요율(단가)</td>
	                                        <td bgcolor="eaeaea" class="table_bl_left" >
	                                        <c:choose>
	                                        <c:when test="${product.CHECK_YN == '1'}">
	                                        	<input id="RATE" name="RATE"  type="text" class="input_form1" style="width:80px;ime-mode:disabled;text-align:right" value="${product.MOMEY}"  onKeyDown="onlyNumberInput();">
	                                        </c:when>
	                                        <c:otherwise>
	                                        	<input id="RATE" name="RATE" type="text" class="input_form1" style="width:80px;ime-mode:disabled;text-align:right" value="${product.YOYUL}"  onKeyDown="onlyNumberInput();">
	                                        </c:otherwise>
	                                        </c:choose>
	                                        </td>
                                        </tr>
                                       <tr height="50">
                                           <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">산출 기간</td>
                                           <td bgcolor="eaeaea" class="table_bl_left" >
                                               <table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                                                   <tr>
                                                       <td>
                                                       	<input id="FROMDATE" name="FROMDATE" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value="${rnic:addDash(product.FROMDATE)}"  onKeyDown="onlyNumberInput();"   onKeyDown="onlyNumberInput();" maxlength=10>
		                                            </td>
		                                            <td>
		                                                <img src="/img/calendar_icon.gif" onclick="popUpCalendar(this, document.getElementById('FROMDATE'), 'yyyymmdd');"  style="cursor:pointer" >
		                                            </td>
		
		                                            <td width="16" align="center">~</td>
		                                            <td>
		                                            	<input id="TODATE" name="TODATE" type="text" class="input_form1" style="width:80px;ime-mode:disabled;"  value="${rnic:addDash(product.TODATE)}"  onKeyDown="onlyNumberInput();" maxlength=10>
		                                        	</td>
			                                        <td>
			                                            <img src="/img/calendar_icon.gif" onclick="popUpCalendar(this, document.getElementById('TODATE'), 'yyyymmdd');"  style="cursor:pointer" >
			                                        </td>
                                       			</tr>
		                                        <tr><td height="3"></td></tr>
		                                        <tr>
		                                            <td colspan="5">
		                                            	달수 :
		                                            	<input id ="PERIOD" name="PERIOD" type="text" class="input_form1" style="width:60px;ime-mode:disabled" value = "${product.PERIOD}"   onKeyDown="onlyNumberInput();" >
		                                        		<img src="/img/cal_month.gif" align="absmiddle" alt="날짜 계산" width="64" height="18" border="0" style="cursor:pointer" onClick="javascript:junggi_calDate();">
	                                        		</td>
		                                        </tr>
                                   			</table>
                           				</td>
			                         	<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">전년 조정 ${PRICE_NAME}</td>
					                    <td width="42%" bgcolor="eaeaea" class="table_bl_left" >
					                    	<input id="SUM_LASTYEAR" name="SUM_LASTYEAR" type="text"  class="input_form1" style="width:80px;ime-mode:disabled;text-align:right" value="${rnic:insertComma2(product.SUM_LASTYEAR)}"   onKeyDown="onlyNumberInput();" onkeyup="javascript:fn_addComma(this)">원
					               		</td>
				               		</tr>
				               		<c:if test="${product.SECTION != '3' }">
				               		<tr>
					                    <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">조정 계수</td>
					                    <td bgcolor="eaeaea" class="table_bl_left">
					    	                <input id="ADJUSTMENT" name="ADJUSTMENT" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value="${product.ADJUSTMENT}"   onKeyDown="onlyNumberInput();" >
						                </td>
					                 	
					                    
					                    <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">전년 공시지가</td>
					                    <td bgcolor="eaeaea" class="table_bl_left">
						                    <c:choose>
						                        <c:when test="${product.CHECK_YN == '2'}">
						                        	<input id="OLD_PRICE" name="OLD_PRICE" type="text" class="input_form1" style="width:80px;ime-mode:disabled;text-align:right" value="${rnic:insertComma2(old_price)}"  readonly="readonly">원
						                        </c:when>
						                        <c:otherwise>
						                        	<input id="OLD_PRICE" name="OLD_PRICE" type="text" class="input_form1" style="width:80px;ime-mode:disabled;text-align:right" value="0"  readonly="readonly">원
						                        </c:otherwise>
						                    </c:choose>
					               		</td>
					                </tr>
					                <tr>
					                    <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">전년 점용면적</td>
					                    <td bgcolor="eaeaea" class="table_bl_left">
					                	   <input id="OLD_AREA_SIZE" name="OLD_AREA_SIZE" type="text" class="input_form1" style="width:80px;ime-mode:disabled;text-align:right" value="${old_area_after}"  readonly="readonly">㎡
					               		</td>
					                    
					               		<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">전년 요율(단가)</td>
					                    <td bgcolor="eaeaea" class="table_bl_left">
					                	   <input id="OLD_RATE" name="OLD_RATE" type="text" class="input_form1" style="width:80px;ime-mode:disabled;text-align:right" value="${old_rate}"  readonly="readonly">
					               		</td>
					                </tr>
			            			</c:if>
						            <tr>
						                <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">부과일자</td>
						                <td bgcolor="eaeaea" class="table_bl_left" >
						                    <table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						                        <tr>
						                            <td>
						                            	<input id="TAX_DATE" name="TAX_DATE" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value="${product.TAX_DATE}"  onKeyDown="onlyNumberInput();"   onKeyDown="onlyNumberInput();" maxlength=10>
									                </td>
									                <td>
									                    <img src="/img/calendar_icon.gif" onclick="popUpCalendar(this, document.getElementById('TAX_DATE'), 'yyyymmdd');"  style="cursor:pointer" >
									                </td>
									            </tr>
									        </table>
						    			</td>
									    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">납기내기한</td>
									    <td bgcolor="eaeaea" class="table_bl_left" >
									        <table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									            <tr>
									                <td>
									                	<input id="INDATE" name="INDATE" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value="${product.INDATE}"  onKeyDown="onlyNumberInput();"   onKeyDown="onlyNumberInput();" maxlength=10>
												    </td>
												    <td>
												        <img src="/img/calendar_icon.gif" onclick="popUpCalendar(this, document.getElementById('INDATE'), 'yyyymmdd');"  style="cursor:pointer" >
												    </td>
												</tr>
											</table>
										</td>
									</tr>
									<tr>
									    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">납기후일자</td>
									    <td bgcolor="eaeaea" class="table_bl_left" >
									        <table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									            <tr>
									                <td>
									                	<input id="OVERDATE" name="OVERDATE" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value="${product.OVERDATE}"  onKeyDown="onlyNumberInput();"   onKeyDown="onlyNumberInput();" maxlength=10>
												    </td>
												    <td>
												        <img src="/img/calendar_icon.gif" onclick="popUpCalendar(this, document.getElementById('OVERDATE'), 'yyyymmdd');"  style="cursor:pointer" >
												    </td>
												</tr>
											</table>
										</td>
										<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">납기후금액</td>
										<td bgcolor="eaeaea" class="table_bl_left" >
										    <input id="OVERTAX" name="OVERTAX" type="text" class="input_form1" style="width:80px;ime-mode:disabled;text-align:right" value="${rnic:insertComma2(product.OVERTAX)}"  onKeyDown="onlyNumberInput();"   onKeyDown="onlyNumberInput();" maxlength=10>원
										</td>
									</tr>
									<c:if test="${product.SECTION == '3'}">
								    <tr>
								        <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">과징율</td>
								        <td bgcolor="eaeaea" class="table_bl_left" colspan="3">
								            <input id="SURCHARGE_RATE" name="SURCHARGE_RATE" type="text" class="input_form1" style="width:80px;ime-mode:disabled" value="1.2"  onKeyDown="onlyNumberInput();"   onKeyDown="onlyNumberInput();" maxlength=10>
								        </td>
								    </tr>
									</c:if>
									<tr>
									    <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">기본 산출식</td>
									    <td bgcolor="eaeaea" class="table_bl_left" >
									    	<input ID="FORM" name="FORM"  type="text" class="input_form1" style="width:300px" value="${product.FORM}">
										</td>
										<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">현년도 ${PRICE_NAME}</td>
										<td bgcolor="eaeaea" class="table_bl_left" >
										    <input name="SUM_YEAR" id="SUM_YEAR" type="text" class="input_form1" style="width:80px;ime-mode:disabled;text-align:right" value="${rnic:insertComma2(product.SUM_YEAR)}"   onKeyDown="onlyNumberInput();" onkeyup="javascript:fn_addComma(this)" >원
										</td>
									</tr>
									<tr>
									    <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">조정 산출식</td>
									    <td bgcolor="eaeaea" class="table_bl_left" >
									        <input id="FORM_ADJUST" name="FORM_ADJUST" type="text" class="input_form1" style="width:300px" value="${product.FORM_ADJUST}" >
									    </td>
									    <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">조정 ${PRICE_NAME}</td>
									    <td bgcolor="eaeaea" class="table_bl_left" >
									        <input id="SUM_ADJUST" name="SUM_ADJUST" type="text" class="input_form1" style="width:80px;ime-mode:disabled;text-align:right" value="${rnic:insertComma2(product.SUM_ADJUST)}"  onKeyDown="onlyNumberInput();" onkeyup="javascript:fn_addComma(this)" >원
									    </td>
									</tr>
									<tr>
									    <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">지분율 사유</td>
									    <td bgcolor="eaeaea" class="table_bl_left">
									        <input id="PERCENT_REASON" name="PERCENT_REASON" type="text" class="input_form1" style="width:300px" value="${product.PERCENT_REASON}" readonly="readonly" >
									    </td>
									    <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">지분율 (%)</td>
									    <td bgcolor="eaeaea" class="table_bl_left">
									        <input id="PERCENT_RATE" name="PERCENT_RATE"  type="text" class="input_form1" style="width:80px;text-align:right" value="${product.PERCENT_RATE}" readonly="readonly" >
									    </td>
									</tr>
									<tr>
									    <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">감면율 사유</td>
									    <td bgcolor="eaeaea" class="table_bl_left">
									        <input id="REDUCTION_REASON" name="REDUCTION_REASON" type="text" class="input_form1" style="width:300px" value="${product.REDUCTION_REASON}" readonly="readonly" >
									    </td>
									    <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">감면율 (%)</td>
									    <td bgcolor="eaeaea" class="table_bl_left">
									        <input id="REDUCTION_RATE" name="REDUCTION_RATE"  type="text" class="input_form1" style="width:80px;text-align:right" value="${product.REDUCTION_RATE}" readonly="readonly" >
									    </td>
									</tr>
									<tr>
									    <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">최종 산출식</td>
									    <td bgcolor="eaeaea" class="table_bl_left" >
									        <input id="REDUCTION_FORM" name="REDUCTION_FORM" type="text" class="input_form1" style="width:300px" value="${product.REDUCTION_FORM}">
									    </td>
									
									    <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">최종 ${PRICE_NAME}</td>
									    <td bgcolor="eaeaea" class="table_bl_left" >
									        <input id="REDUCTION_SUM" name="REDUCTION_SUM" type="text" class="input_form1" style="width:80px;ime-mode:disabled;text-align:right" value="${rnic:insertComma2(product.REDUCTION_SUM)}" onKeyDown="onlyNumberInput();" onkeyup="javascript:fn_addComma(this)">원
									    </td>
									</tr>
									<tr>
									    <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b"></td>
									    <td bgcolor="eaeaea" class="table_bl_left" >
									    </td>
									
									    <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">부가가치세</td>
									    <td bgcolor="eaeaea" class="table_bl_left" >
									        <input id="VAT" name="VAT" type="text" class="input_form1" style="width:80px;ime-mode:disabled;text-align:right" value="0" readonly="readonly">원
									    </td>
									</tr>
								</table>
							</td>
						</tr>
						<tr>
						    <td height="40" align="right">
						       	<img src="/img/accou_icon.gif" alt="계산" width="56" height="18" border="0" onclick="javascript:Calculate();" style="cursor:pointer">
						        <img src="/img/save_icon2.gif" alt="저장" width="56" height="18" border="0" onClick="javascript:submitClick();" style="cursor:pointer" >
						        <img src="/img/can_icon.gif" alt="취소" border="0" style="cursor:pointer" onclick="javascript:history.back();">
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