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
        <script language="javascript" src="/js/calculation.js"></script> 
        <script language="javascript" src="/js/Check_inputbox.js"></script> 
        <script language="javascript">
            var savable = 0;
            var savable_v = 0;
            function InitPage()
            {
            	document.getElementById("TYPE").value = parent.document.getElementById("TYPE").value;

                if(document.getElementById("CK_DEL").value == 'true'){
                    location.href = "/jumyong/productInsert.do?no=${no}";
                }
		
                setParentYear('${product.YEAR}');
                //YEAR 셀렉트 박스 만듬
                makeYear("YEAR");
                var check_yn ="${product.CHECK_YN}";
                parent.document.getElementById("SEQ").value = document.getElementById("SEQ").value;
		
                if(document.getElementById("mode").value == "edit" || document.getElementById("mode").value == "add"  )
                {
                    document.getElementById("view").style.display = "none";
						
                    document.getElementById("edit_1").style.display= "block";
                    document.getElementById("edit_1").style.pixelTop = 0;

                    if(check_yn=="1"){	
                        document.getElementById("price_view4").style.display="none";
                    }
			
                    if(document.getElementById("mode").value == "add")
                    {
                        var date = new Date();
                        var year = date.getFullYear();	
                    }
			
                }else
                {
			
                    document.getElementById("edit_1").style.display = "none";
                    document.getElementById("view").style.display = "block";
                    if(check_yn=="1"){	
                        document.getElementById("price_view4").style.display="none";
                    }
                }

                if(check_yn=="1"){	
                    document.getElementById("price_img").style.display="none";
                    document.getElementById("PRICE").value="1";		//단가쪽에 공시지가가 표시되기 때문에 공시지가는 1로 표시	
                    //document.getElementById("price_view1").style.display="none";
                    document.getElementById("price_view2").style.display="none";
                }
                //과징율이 없을때 정의
                if('${product.SURCHARGE_RATE}'=='' || '${product.SURCHARGE_RATE}' == '0.0')
                document.getElementById("SURCHARGE_RATE").value = 1.2;
		
                var first_area = parseFloat(document.getElementById("firstArea").value);
		
                //if(first_area>0)
                //document.getElementById("AREA_AFTER").value=first_area;
                //if(first_area>0){
                //document.getElementById("AREA_AFTER").disabled=true;
                //}

                var cal_type = "${product.FORM}";		//월단위 계산인지 일단위 계산인지 여부 알아내기
                for(var i=1;i<cal_type.length;i++){
                    if(cal_type.substring(i-1,i)=="일"){
                        document.getElementById("date_type").value="day";
                    }
                }

                var obj = document.productForm.message.value;
		
                if(obj != "")	
                    alert(obj);
                return;
            }


            function submitClick()
            {
                document.getElementById("AREA_AFTER").disabled=false;

                if(Number(document.getElementById("AREA_AFTER").value)!=Number(document.getElementById("AREA_AFTER").value)){
                    alert("점용면적은 전년도랑 같이 입력 하셔야 합니다.");
                    return;	
                }
		
                // 수정일때는 산출내역 계산여부 체크 안하도록..
                if(document.getElementById("mode").value == "edit"){
                    savable_v = 4;
                }
		
                var check_yn ="${product.CHECK_YN}";
                if(check_yn == "1"){
                    if(savable_v == 3 || savable_v == 4){
                        var productForm = document.productForm;
		
                        //comma제거
                        removeComma2("PRICE");
                        removeComma2("SUM_YEAR");
                        removeComma2("SUM_ADJUST");
                       // removeComma2("REDUCTION_SUM");
                    	

                        // 직접 일반점용료를 입력하는 경우때문에 넣어줌
                        document.getElementById("SUM_ADJUST").value = document.getElementById("SUM_YEAR").value;
                        document.getElementById("FORM_ADJUST").value = document.getElementById("FORM").value;
				
                        productForm.submit();
                    }else {
                        alert("산출 내역을 먼저 계산해 주십시오.");
                        return;
                    }
                }else if(savable_v == 4)
                {
                    var productForm = document.productForm;
			
                    //comma제거
	
                    removeComma2("PRICE");
                    removeComma2("SUM_YEAR");
                    removeComma2("SUM_ADJUST");
                   // removeComma2("REDUCTION_SUM");
                	

                    // 직접 일반점용료를 입력하는 경우때문에 넣어줌
                    document.getElementById("SUM_ADJUST").value = document.getElementById("SUM_YEAR").value;
                    document.getElementById("FORM_ADJUST").value = document.getElementById("FORM").value;
			
                    productForm.submit();
                }else
                    alert("산출 내역을 먼저 계산해 주십시오.");
            }


            function subTabClick(hiddenSubTabName,visibleSubTabName)
            {	
                document.getElementById(hiddenSubTabName).style.display = 'none';	
                document.getElementById(visibleSubTabName).style.display = 'block';	
            }

            function goModify()
            {
                var year = '${product.YEAR}';
                var seq = document.getElementById("SEQ").value;
		
                location.href = "/jumyong/productInsert.do?no=${no}&currentPage=${currentPage}&countPerPage=${countPerPage}&check_yn=${product.CHECK_YN}"
                    +"&mode=edit&year="+year+"&seq="+seq+"&section=${section}";
            }

            function goDelete()
            {
                var year = '${product.YEAR}';
                var seq = document.getElementById("SEQ").value;
		
                var result = confirm("산출내역을 삭제하시겠습니까?");
                if(result){
                	location.href = "/jumyong/productInsert.do?no=${no}&currentPage=${currentPage}&countPerPage=${countPerPage}&check_yn=${product.CHECK_YN}"
                        +"&mode=del&year="+year+"&seq="+seq+"&section=${section}"+"&TYPE="+parent.document.getElementById("TYPE").value;

                    }

            }
	
            function Calculate()
            {
                savable = 0;
                
                var check_yn ="${product.CHECK_YN}";
                var area_after = document.getElementById("AREA_AFTER").value;
		
                var rate = document.getElementById("RATE").value;
                var price = removeComma(document.getElementById("PRICE").value);
                var surcharge_rate = document.getElementById("SURCHARGE_RATE").value;
                var strYear = document.getElementById("YEAR").value;
	
                if(check_yn!="1"){
                    if(document.getElementById("PRICE").value=="0" || document.getElementById("PRICE").value==""){
                        alert("공시지가를 넣으세요.");
                        document.getElementById("PRICE").value="";
                        document.getElementById("PRICE").focus();
                        return;
                    }
                }
                savable++;
                if(Number(area_after)==0 || area_after==""){
                    alert("점용면적을 넣어주세요.");
                    document.getElementById("AREA_AFTER").value = "";
                    document.getElementById("AREA_AFTER").focus();
                    return;
                } 
                savable++;
                if(area_after.substring(area_after.indexOf(".")+1, area_after.indexOf(".")+5).length>3){
                    alert("점용면적을 소수점 3자리까지 표기 해 주세요");
                    document.getElementById("AREA_AFTER").value = "";
                    document.getElementById("AREA_AFTER").focus();
                    return;
                }
                savable++;
                if(document.getElementById("PERIOD").value=="0" || document.getElementById("PERIOD").value==""){
                    if(confirm("개월수를 넣지 않았습니다. 개월수를 자동 계산하시겠습니까?")){
                        calDate();
                    }
                }
                savable++;
                var period = document.getElementById("PERIOD").value;
	    
                //현년도 점용료 계산
                if(document.getElementById("date_type").value=="month"){
                    var sum_year = parseFloat(area_after)*(parseFloat(period)/12)*parseFloat(rate)*parseFloat(price)*(surcharge_rate);


                    //부동소수점 오류 수정
                    sum_year = fixFloatCal(sum_year);
		   
                    if(check_yn!="1"){
                        document.getElementById("FORM").value = strYear+"년 : "+area_after+"㎡ X " + period + "/12개월 X " +rate +" X " +insertComma2(price)    +" X "+surcharge_rate*100+"/100" ;
                    }else{
                        document.getElementById("FORM").value = strYear+"년 : "+area_after+"㎡ X " + period + "/12개월 X " +rate +" X " +surcharge_rate*100+"/100" ;
                    }
                    
                }else if(document.getElementById("date_type").value=="day"){

                    var leafYear = f_leapyear(document.getElementById("YEAR").value);
			
                    var sum_year = parseFloat(area_after)*(parseFloat(period)/(365+leafYear))*parseFloat(rate)*parseFloat(price)*(surcharge_rate);

                    //부동소수점 오류 수정
                    sum_year = fixFloatCal(sum_year);
			   
                    if(check_yn!="1"){
                        document.getElementById("FORM").value = strYear+"년 : "+area_after+"㎡ X " + period + "/"+Number(365+leafYear)+"일 X " +rate +" X " +insertComma2(price)    +" X "+surcharge_rate*100+"/100" ;
                    }else{
                        document.getElementById("FORM").value = strYear+"년 : "+area_after+"㎡ X " + period + "/"+Number(365+leafYear)+"일 X " +rate +" X " +surcharge_rate*100+"/100" ;
                    }
                }
		
                var strSUM_ADJUST = String( Math.floor(sum_year)); // 소수점 제거        
                sum_year = parseInt(strSUM_ADJUST);

      /*  		if(parent.document.getElementById("TYPE").value != '1'){
        			 sum_year = parseInt(sum_year/10)*10;		//10원 절삭
        		}else{
        			 sum_year = parseInt(sum_year/100)*100;		//100원 절삭
        		}
        */       
                document.getElementById("SUM_YEAR").value = sum_year;
		
                insertComma("SUM_YEAR");
		
                //현년도 점용료 계산 끝
		
                //조정 계수 및 조정 점용료 계산		
	
                document.getElementById("FORM_ADJUST").value = document.getElementById("FORM").value;
                document.getElementById("SUM_ADJUST").value = sum_year;		
                insertComma("SUM_ADJUST");

                savable_v = savable;
                savable = 0;
	
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
	
	
            function makeYear(selectId){
                var date = new Date();
                var year = date.getFullYear();
                var productYear = '${year}';
		
                var highYear = 5;
                var lowYear = 10;
		
                for(var i=0;i<highYear;i++)
                {
                    document.getElementById(selectId).options[i]= new Option(year+highYear-i);
                    document.getElementById(selectId).options[i].value = year+highYear-i;
			
                    if(productYear != null && productYear == year+highYear-i)
                    {
                        document.getElementById(selectId).options[i].selected = true;
                    }
                }
		
		
                for(var i=0;i<lowYear;i++)
                {
                    document.getElementById(selectId).options[highYear+i]= new Option(year-i);
                    document.getElementById(selectId).options[highYear+i].value = year-i;
			
                    if(productYear != null && productYear == year-i)
                    {
                        document.getElementById(selectId).options[highYear+i].selected = true;
                    }
                }
		
                if(productYear=="")
                    document.getElementById(selectId).value = year;
		
		
                //FROMDATE, TODATE 값이 없을때 값 입력		
                if(document.getElementById("FROMDATE").value == "" || document.getElementById("TODATE").value == ""  )
                    setDate(document.getElementById(selectId).value);
		
		
            }
	
	
            function setDate(yearVal)
            {
		
                document.getElementById("FROMDATE").value = yearVal+"0101";
                document.getElementById("TODATE").value = yearVal+"1231";
                addDash2("TODATE");
                addDash2("FROMDATE");
            }

	
            //공시지가 팝업
            /*
                function openLandPricePopUp()
                {
                        var winW = 320;
                        var winH = 133;
                        var status ="toolbar=no, location=no, directories=no, status=no, menubar=no, resizable=no, scrollbars=no, width="+winW+", height="+winH+", left=0, top=0"
                        window.open('/jsp/jumyong/jumyong/officialLandPrice.html', 'win', status);	
                }
             */
	
	    
            //공시지가 팝업
            function openLandPricePopUp()
            {
                 var winW = 320;
                 var winH = 240;
                 var status ="toolbar=no, location=no, directories=no, status=no, menubar=no, resizable=no, scrollbars=no, width="+winW+", height="+winH+", left=0, top=0";

                 var admin_no = document.getElementById("no").value;
                 var year = document.getElementById("YEAR").value;
                 window.open('/land_price.do?ADMIN_NO='+admin_no+'&year='+year, 'win', status);
            }
	
            function iFrameResize(obj)
            {
                var iFrm = obj;
                var the_height = iFrm.contentWindow.document.body.scrollHeight;
                iFrm.style.height = the_height + "px";
            }
	
            function Tab_Src(adminno, seq)
            {		
                var tab1	= document.getElementById("tabUpSub1");
                var tab2	= document.getElementById("tabUpSub2");
		
                //var tabs	= document.getElementById("tabDown");
		
                tab1.src	= "/jumyong/inspectEdit.do?no=" + adminno;
                tab2.src	= "/jumyong/confEdit.do?no=" + adminno;
                //alert("무단"+tab1.src);
            }
            function add_product(){

                if( document.getElementById("TAX_YN").value == '1' ){
                    if( confirm("이미 부과된 내역이므로 새로 산출됩니다. 산출 하시겠습니까? ") ){
                        javascript:location.href='/jumyong/productInsert.do?no=${no}&year=${product.YEAR}&currentPage=${currentPage}&countPerPage=${countPerPage}&mode=add&section=${section}&seq=${sum_seq}&check_yn=${product.CHECK_YN}&TAX_YN=${product.TAX_YN}';
                    }
                }
                else{
                    javascript:location.href='/jumyong/productInsert.do?no=${no}&year=${product.YEAR}&currentPage=${currentPage}&countPerPage=${countPerPage}&mode=add&section=${section}&seq=${sum_seq}&check_yn=${product.CHECK_YN}&TAX_YN=${product.TAX_YN}';
                }
		
            }

            function ShowMsgJumjiInsert(obj){

                var target = obj;
                if(target.name == 'AREA_AFTER'){
                    alert("점용면적은 점용지 정보에서 수정하세요.");
                }else if(target.name == 'REDUCTION_RATE'){
                    alert("지분율은 점용지 정보에서 수정하세요.");
                }else if(target.name == 'REDUCTION_REASON'){
                    alert("지분율 사유는 점용지 정보에서 수정하세요.");
                }else if(target.name == 'PERCENT_RATE'){
                    alert("지분율은 점용지 정보에서 수정하세요.");
                }else if(target.name == 'PERCENT_REASON'){
                    alert("지분율 사유는 점용지 정보에서 수정하세요.");
                }
            }

          function goLanprice(){
        		var url = "http://kras.seoul.go.kr/land_info/info/landprice/landprice.do";
        		var name = "공시지가열람";
        		var size = "width=800, height=900, scrollbars=yes, resizable=yes";
        		window.open(url, name, size);
        	}
        </script>

    </head>

    <body onload="javascript:InitPage();"  border="0">
        <form id="productForm" name="productForm" method="post" action = "/jumyong/productInsert.do" >
            <input id="ADMIN_NO" name="ADMIN_NO" value="${no}" type="hidden" >
            <input id="no" name="no" value="${no}" type="hidden" >
            <input id = "mode" name="mode" value="${mode}" type="hidden" >
            <input id = "SEQ" name="SEQ"  value="${seq}" type="hidden" >
            <input id = "mudanForm" name="mudanForm" value="${mudanForm}" type="hidden" >
            <input id = "mudanPrice" name="mudanPrice" value="${mudanPrice}" type="hidden" >
            <input id = "mudanTotalSum" name="mudanTotalSum" value="${rnic:insertComma2(totalSum)}원" type="hidden" >	
            <input id="firstArea" name="firstArea" value="${firstArea}" type="hidden">
            <input id="message" name="message" value="${message}" type="hidden">
            <input id="TAX_NO" name="TAX_NO" value="${product.TAX_NO}" type="hidden">
            <input id="TAX_YN" name="TAX_YN" value="${product.TAX_YN}" type="hidden">
            <input id="FIRST_SEQ" name="FIRST_SEQ" value="${product.FIRST_SEQ}" type="hidden">
            <input id="CK_DEL" name="CK_DEL" value="${CK_DEL}" type="hidden">
            <input id="SECTION" name="SECTION" value="${section}" type="hidden">
            <input id="TYPE" name="TYPE" value="${type}" type="hidden">

            <table width="780" border="0" cellspacing="0" cellpadding="0">
                <tr>
                    <td class="contborder_purple">							            
                        <table width="100%" border="0" cellspacing="0" cellpadding="0">
                            <tr>
                                <td>
                                    <table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                                        <tr>
                                            <td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">번호</td>
                                            <td align="center" bgcolor="e5eff8" class="sub_table_b">산출년도</td>
                                            <td align="center" bgcolor="e5eff8" class="sub_table_b">공시지가</td>
                                            <td align="center" bgcolor="e5eff8" class="sub_table_b">면적</td>
                                            <td align="center" bgcolor="e5eff8" class="sub_table_b">요율/단가</td>
                                            <td align="center" bgcolor="e5eff8" class="sub_table_b">산출기간</td>


                                            <td align="center" bgcolor="e5eff8" class="sub_table_b">변상금 </td>
                                        </tr>
                                        <c:forEach items="${productList}" var="board" varStatus="idx">
                                            <c:choose>
                                                <c:when test="${board.SEQ != sum_seq }">
                                                    <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" onclick="javascript:setParentYear('${board.YEAR}');Tab_Src('${no}','${board.SEQ}');location.href('/jumyong/productInsert.do?no=${no}&year=${board.YEAR}&currentPage=${currentPage}&countPerPage=${countPerPage}&year=${board.YEAR}&seq=${board.SEQ}&section=${section}');" style="cursor:pointer" >
                                                </c:when>
                                                <c:otherwise>
                                                    <tr onclick="javascript:setParentYear('${board.YEAR}');Tab_Src('${no}','${board.SEQ}');location.href('/jumyong/productInsert.do?no=${no}&year=${board.YEAR}&currentPage=${currentPage}&countPerPage=${countPerPage}&year=${board.YEAR}&seq=${board.SEQ}&section=${section}');" bgcolor="#f6f7f8">
                                                </c:otherwise>
                                            </c:choose>							                      
                                            <td height="26" align="center">${idx.count}</td>
                                            <td align="center">${board.YEAR}</td>
                                            <td align="center"><!-- span id="price_view1" style="display:block;"></span-->
                                            <c:choose>
                                                <c:when test="${product.CHECK_YN != '1'}">
                                                    ${rnic:insertComma2(board.PRICE)}
                                                </c:when>
                                                <c:otherwise>
															-
                                                </c:otherwise>
                                            </c:choose>	
                                            </td>
                                            <td align="center">${board.AREA_AFTER}</td>
                                            <td align="center">${board.RATE}</td>

                                            <td align="center">${rnic:addDash(board.FROMDATE)}~${rnic:addDash(board.TODATE)}</td>
                                            <td align="center">${rnic:insertComma2(board.SUM_ADJUST) }</td>

                                            </tr> 
                                        </c:forEach>

                                        <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''"  >
                                            <td height="26" align="right" colspan="7">변상금 합계 = ${rnic:insertComma2(totalSum)}원&nbsp&nbsp</td>							                        

                                        </tr> 
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
                                                <td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b" >산출년도</td>
                                                <td width="42%" bgcolor="eaeaea" class="table_bl_left" >
                                                    ${product.YEAR}년
                                                </td>                     
                                                <td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">공시지가</td>
                                                <td width="32%" bgcolor="eaeaea" class="table_bl_left" >
                                                    <span id="price_view2" style="display:block;">${rnic:insertComma2(product.PRICE)}원</span>
                                                </td> 
                                            </tr>
                                            <tr>
                                                <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용면적/개</td>
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
                                                <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">개월(일)수</td>
                                                <td bgcolor="eaeaea" class="table_bl_left" >${product.PERIOD}개월(일)</td>
                                            </tr>
                                            <tr>
                                                <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">과징율</td>
                                                <td bgcolor="eaeaea" class="table_bl_left" colspan="3">${product.SURCHARGE_RATE}</td>                     
                                            </tr>       



                                            <tr>
                                                <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">기본 산출식</td>
                                                <td bgcolor="eaeaea" class="table_bl_left" >
                                                    ${product.FORM}
                                                </td>

                                                <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">일반 변상금</td>
                                                <td bgcolor="eaeaea" class="table_bl_left" >
                                                    ${rnic:insertComma2(product.SUM_YEAR)} 원
                                                </td>    

                                            </tr>
                                            <tr>
                                            <td height="26" align="left" bgcolor="eaeaea" class="table_bl_left" colspan="4">
                                           		◎ 개별 변상금 총합
                                            </td>
                                            </tr>
                                            <tr>
                                                <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">지분율 사유</td>
                                                <td bgcolor="eaeaea" class="table_bl_left" >
                                                    ${product.PERCENT_REASON}
                                                </td> 
                                                
                                                <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">지분율</td>
                                                <td bgcolor="eaeaea" class="table_bl_left" >
                                                    ${product.PERCENT_RATE} %
                                                </td> 
                                            </tr>
                                            <tr>
                                                <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">감면율 사유</td>
                                                <td bgcolor="eaeaea" class="table_bl_left" >
                                                    ${product.REDUCTION_REASON}
                                                </td> 
                                                
                                                <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">감면율</td>
                                                <td bgcolor="eaeaea" class="table_bl_left" >
                                                    ${product.REDUCTION_RATE} %
                                                </td> 
                                            </tr>
                                            <tr>
                                                <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">최종 산출식</td>
                                                <td bgcolor="eaeaea" class="table_bl_left" >
                                                    ${product.REDUCTION_FORM}
                                                </td>
                                                <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">변상금 합계</td>
                                                <td bgcolor="eaeaea" class="table_bl_left" >
                                                    ${rnic:insertComma2(product.REDUCTION_SUM)} 원				
                                                </td> 

                                            </tr> 


                                        </table></td>
                                </tr>

                                <tr >              
                                    <td height="40" align="right" >
                                        <table border="0" width="100%" >
                                            <tr>
                                                <td>

                                            <c:if test="${listSize != '0' }">
                                                <c:if test="${defineTax != 'true'}">
                                                    <img src="/img/mod_icon.gif" alt="수정" border="0" onclick="javascript:goModify()" style="cursor:pointer" >
                                                    <img src="/img/del_icon3.gif" alt="삭제" border="0" onclick="javascript:goDelete()" style="cursor:pointer" >

                                                </c:if>
                                            </c:if>
                                            <img src="/img/add_icon.gif" alt="추가" border="0" onclick="javascript:add_product();"  style="cursor:pointer" >

                                            </td>

                                            </tr>



                                        </table>
                                    </td>
                                </tr>
                            </table>
                        </div>


                        <div id="edit_1" style="width:100%;display:none;">
                            <table width="100%" border="0" cellspacing="0" cellpadding="0">
                                <tr>
                                    <td><input style="float:right; font-size: 10.5px;" class="sub_table_b" type="button" onclick="goLanprice()" value="공시지가조회(서울 부동산정보조회 시스템)">
                                    	<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                                            <tr>
                                                <td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b"  style="direction:rtl" >산출년도</td>
                                                <td width="42%" bgcolor="eaeaea" class="table_bl_left" >
                                            <spring:bind path="product.YEAR">                    
                                                <select id="YEAR" name="YEAR" class="input_form1" onChange="javascript:setDate(this.value)">
                                                </select>년
                                            </spring:bind>


                                    </td>                     
                                    <td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b"><span id="price_view4" style="display:block;">공시지가</span></td>
                                    <td width="32%" bgcolor="eaeaea" class="table_bl_left" >
                                        <table border="0" cellpadding="0" cellspacing="0" class="table_bl_left">
                                            <tr>
                                                <td>
                                                    <span id="price_img" style="display:block;">
                                                        <input id="PRICE" name="PRICE" value="${product.PRICE}" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" onkeyup="javascript:fn_addComma(this)"  onKeyDown="onlyNumberInput();" style="text-align:right">원	 
                                                        <img src="/img/landPrice.gif" alt="공시지가조회" height="18" border="0" style="cursor:pointer" onclick="javascript:openLandPricePopUp()"; align="absmiddle">	
                                                    </span>
                                                </td>
                                            </tr>
                                        </table>

                                    </td> 
                                </tr> 



                                <tr>
                                    <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용면적/개</td>
                                    <td bgcolor="eaeaea" class="table_bl_left" >
                                    <input id="AREA_AFTER" name="AREA_AFTER" type="text" class="essential" style="width:50px;ime-mode:disabled;" value="${product.AREA_AFTER}"  onfocus="javascript:ShowMsgJumjiInsert(this)" onKeyDown="nr_num_float(this);" style="direction: rtl" readonly="readonly" >㎡
                                	</td>                     
	                                <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">요율/단가</td>
	                                <td bgcolor="eaeaea" class="table_bl_left" >
                                    <input id="RATE" name="RATE" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value="${product.RATE}"  onKeyDown="onlyNumberInput();" style="direction: rtl">
                                </td> 
                                </tr>                   


                                <tr>
                                    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">산출기간</td>
                                    <td bgcolor="eaeaea" class="table_bl_left" >
                                        <input id="FROMDATE" name="FROMDATE" type="text" class="input_form1" style="width:70px;ime-mode:disabled;" value="${product.FROMDATE}"  maxlength="8" readonly>
                                        <img src="/img/calendar_icon.gif" onclick="popUpCalendar(this, document.getElementById('FROMDATE'), 'yyyymmdd');" style="vertical-align: middle;cursor:pointer;">
                                        &nbsp;~&nbsp;
                                 		<input id="TODATE" name="TODATE" type="text" class="input_form1" style="width:70px;ime-mode:disabled;" value="${product.TODATE}"  maxlength="8" readonly>
	                                    <img src="/img/calendar_icon.gif" onclick="popUpCalendar(this, document.getElementById('TODATE'), 'yyyymmdd');" style="vertical-align: middle;cursor:pointer;">
	                                    <img src="/img/cal_month.gif" alt="달수계산" height="18" border="0" style="vertical-align: middle;cursor:pointer;" onClick="javascript:calDate();">
                            		</td>

                    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">
                        <select id="date_type" class="input_form1" onchange="javascript:calDate();">
                            <option value="month">개월</option>
                            <option value="day">일</option>
                        </select>수
                    </td>
                    <td bgcolor="eaeaea" class="table_bl_left" >
                    <input name="PERIOD" id ="PERIOD" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value = "${product.PERIOD}"   onKeyDown="onlyNumberInput();" style="direction: rtl">개월(일)
               		&nbsp;&nbsp;&nbsp;&nbsp;
                </td>

                </tr>


                <tr>
                    <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">과징율</td>
                    <td bgcolor="eaeaea" class="table_bl_left" colspan="3">
                    <input name="SURCHARGE_RATE" id="SURCHARGE_RATE" type="text" class="input_form1" style="width:50px;ime-mode:disabled;" value="${product.SURCHARGE_RATE}"   onKeyDown="onlyNumberInput();" style="direction: rtl">
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
                    <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">기본 산출식</td>
                    <td bgcolor="eaeaea" class="table_bl_left" >
                    <input name="FORM" ID="FORM" type="text" class="input_form1" style="width:350px" value="${product.FORM}">
        			</td>
        			<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">일반 변상금</td>
        			<td width="20%" bgcolor="eaeaea" class="table_bl_left" >
				        <input name="SUM_YEAR" id="SUM_YEAR" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value="${product.SUM_YEAR}"   onKeyDown="onlyNumberInput();" onkeyup="javascript:fn_addComma(this)" style="direction: rtl">원
				        <input name="REDUCTION_REASON" id="REDUCTION_REASON" type="hidden" class="essential" style="width:350px" value="${product.REDUCTION_REASON}" onfocus="javascript:ShowMsgJumjiInsert(this)" readonly="readonly">
				   		<input name="REDUCTION_RATE" id="REDUCTION_RATE" type="hidden" class="essential" style="width:50px;text-align:right" value="${product.REDUCTION_RATE}" onfocus="javascript:ShowMsgJumjiInsert(this)" readonly="readonly">
				   		<input name="PERCENT_REASON" id="PERCENT_REASON" type="hidden" class="essential" style="width:350px" value="${product.PERCENT_REASON}" onfocus="javascript:ShowMsgJumjiInsert(this)" readonly="readonly">
				   		<input name="PERCENT_RATE" id="PERCENT_RATE" type="hidden" class="essential" style="width:50px;text-align:right" value="${product.PERCENT_RATE}" onfocus="javascript:ShowMsgJumjiInsert(this)" readonly="readonly">
				    	<input name="FORM_ADJUST" id="FORM_ADJUST" type="hidden" class="input_form1" style="width:300px" value="${product.FORM_ADJUST}">
				    	<input name="SUM_ADJUST" id="SUM_ADJUST" type="hidden" class="input_form1" style="width:80px;ime-mode:disabled;" value="${product.SUM_ADJUST}"  onKeyDown="onlyNumberInput();" onkeyup="javascript:fn_addComma(this)" style="direction: rtl">
						<input name="RATE1" id = "RATE1" type="hidden" class="input_form1" style="width:120px;ime-mode:disabled;" value=""   onKeyDown="onlyNumberInput();" >
					</td>                   
				</tr>
			</table>
		</td>
	</tr>
	<tr>              
	    <td height="40" align="right" colspan="4">
	        <img src="/img/can_icon.gif" alt="취소" border="0" onclick="javascript:history.back();" style="cursor:pointer" >					                
	        <img src="/img/save_icon2.gif" alt="저장" width="56" height="18" border="0" onClick="javascript:submitClick();"  style="cursor:pointer">
	    </td>
	</tr>
</table>	
	
</div>


</td>
</tr>
<tr>
    <td>
        <iframe width="100%" height="100%" id="tabUpSub1" name="tabUpSub1" frameborder="0" onload="iFrameResize(this)" scrolling="no" src="/jumyong/inspectEdit.do?no=${no}&seq=${seq }&SECTION=${section}"></iframe>
    </td>
</tr>
<tr>
    <td height="10">
    </td>
</tr>
<tr>
    <td>
        <iframe width="100%" height="100%" id="tabUpSub2" name="tabUpSub2" frameborder="0" onload="iFrameResize(this)" scrolling="no" src="/jumyong/confEdit.do?no=${no}&seq=${seq }&SECTION=${section}"></iframe>
    </td>
</tr>

</table>
</form>
</body>
</html>
