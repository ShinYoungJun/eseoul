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
        <script language="javascript" src="/js/common.js"></script>
        <script language="javascript" src="/js/calculation.js"></script>
        <script language="javascript" src="/js/PopupCalendar.js"></script>
        <script language="javascript" src="/js/Ajax_request.js"></script>
        <script>
            var savable = 0;
            function iFrameResize(obj)
            {
                var iFrm = obj;
                var the_height = iFrm.contentWindow.document.body.scrollHeight;
                iFrm.style.height = the_height;
            }
            function InitPage()
            {
            	changeTAXDATE();

            	if('${message}'.length > 0){
						alert('${message}');					
                	}

            	if('${ck_del}' == '1'){
                    location.href = "/gapan/jumyong/productInsert.do?GAPAN_NO=${GAPAN_NO}";
                }
                setParentYear('${product.YEAR}');

                parent.document.getElementById("SEQ").value = document.getElementById("SEQ").value;

                if(document.getElementById("mode").value == "edit" || document.getElementById("mode").value == "add"  )
                {
                    document.getElementById("view").style.display = "none";

                    document.getElementById("edit").style.display= "block";
                    document.getElementById("edit").style.pixelTop = 0;
                }else
                {
                    document.getElementById("edit").style.display = "none";
                    document.getElementById("view").style.display = "block";
                }

                var cal_type = "${product.FORM}";		//월단위 계산인지 일단위 계산인지 여부 알아내기
                for(var i=1;i<cal_type.length+1;i++){
                    if(cal_type.substring(i-1,i)=="일"){
                        document.getElementById("date_type").value="day";
                        document.getElementById("date_type1").innerHTML = "일수";
                        document.getElementById("date_type2").innerHTML = "일";
                        return;
                    }else{
                        document.getElementById("date_type1").innerHTML = "개월수";
                        document.getElementById("date_type2").innerHTML = "개월";
                    }
                }

                taxCdDelete('TAX_CD','212');
            }


            function submitClick()
            {
                var productForm = document.productForm;

                if(productForm.PERIOD.value.length<1 || productForm.PERIOD.value=="0"){
                    alert("개월수를 입력해주세요.");
                    if(confirm("개월수를 자동 계산하시겠습니까?")){
                        calDate();
                        return;
                    }else{
                        productForm.PERIOD.value="";
                        productForm.PERIOD.focus();
                        return;
                    }
                }
                if(savable == 1)
                {
                	if(!DataCheck()){
                    	return;
                	}
                    //comma제거
                    removeComma2("PRICE");
                    removeComma2("SUM_LASTYEAR");
                    removeComma2("SUM_YEAR");
                    removeComma2("SUM_ADJUST");
                    removeComma2("VAT");
                    productForm.TAX_DATE.value = removeDash(productForm.TAX_DATE.value);
                    productForm.OVERDATE.value = removeDash(productForm.OVERDATE.value);
                    productForm.INDATE.value = removeDash(productForm.INDATE.value);

                    productForm.submit();
                }else{
                    alert("산출 내역을 먼저 계산해 주십시오.");
                }
            }

             function subTabClick(hiddenSubTabName,visibleSubTabName)
            {
                document.getElementById(hiddenSubTabName).style.display = 'none';
                document.getElementById(visibleSubTabName).style.display = 'block';
            }

            function goModify()
            {
                var area = document.getElementById("AREA_AFTER").value        ;
                var year = '${product.YEAR}';
                var seq = document.getElementById("SEQ").value;
                var sum_adjust = Number(removeComma(document.getElementById("SUM_ADJUST").value));

                if(area>=0)
                {
                    location.href = "/gapan/jumyong/productInsert.do?GAPAN_NO=${GAPAN_NO}&currentPage=${currentPage}&countPerPage=${countPerPage}"
                        +"&mode=edit&year="+year+"&seq="+seq+"&SECTION=${SECTION}";
                }
            }

            function Calculate()
            {
                calDate();
                        	
                var area_after = document.getElementById("AREA_AFTER").value;
                var period = document.getElementById("PERIOD").value;
                var rate = document.getElementById("RATE").value;
                var price = removeComma(document.getElementById("PRICE").value);
                var sum_lastyear = document.getElementById("SUM_LASTYEAR").value;
                var last_area_after = document.getElementById("LAST_AREA_AFTER").value;
                var reduction_rate = document.getElementById("REDUCTION_RATE").value;

                if(reduction_rate == "")
                    reduction_rate = 0;

                var sum_year = document.getElementById("SUM_YEAR");
                var sum_adjust = document.getElementById("SUM_ADJUST");
                var form = document.getElementById("FORM");
                var form_adjust = document.getElementById("FORM_ADJUST");
                var adjustment = document.getElementById("ADJUSTMENT");
                var vat = document.getElementById("VAT");

                if(price<=0){
                    alert("공시지가를 넣어주세요.");
                    document.getElementById("PRICE").value = "";
                    document.getElementById("PRICE").focus();
                    return;
                }

                if(area_after<=0){
                    alert("점용면적을 넣어주세요.");
                    document.getElementById("AREA_AFTER").value = "";
                    document.getElementById("AREA_AFTER").focus();
                    return;
                }
                if(document.getElementById("FROMDATE").value=="" || document.getElementById("TODATE").value==""){
                    if(confirm("개월수를 자동 계산하시겠습니까?"))
                        calDate();
                }


                if(document.getElementById("date_type").value=="month"){
                    sum_year.value = Math.floor(fixFloatCal(parseFloat(area_after)*fixFloatCal(parseFloat(period)/12)*parseFloat(rate)*parseFloat(price)*parseFloat((100-parseFloat(reduction_rate))/100)));
                    form.value = area_after+"㎡ X "  +rate +" X " +insertComma2(price) +" X " + period + "/12개월";

                }else if(document.getElementById("date_type").value=="day"){
                    var leafYear = f_leapyear(document.getElementById("YEAR").value);
                    sum_year.value = Math.floor(fixFloatCal(parseFloat(area_after)*fixFloatCal(parseFloat(period)/(365+leafYear))*parseFloat(rate)*parseFloat(price)*parseFloat((100-parseFloat(reduction_rate))/100)));
                    form.value = area_after + "㎡ X " + rate +" X " +insertComma2(price)+" X "+ period + "/"+Number(365+leafYear)+"일";
                }

                if(reduction_rate == "0.0" || reduction_rate == "0" || reduction_rate == ""){
                    form.value = form.value;
                }else{
                    form.value = form.value+" X (100-"+reduction_rate+")/100";
                }

                sum_year.value = insertComma2(Math.floor(sum_year.value/100)*100);		//100원 절삭




                var bak_sum_year;
                if(last_area_after == '' || last_area_after == 0){
                    bak_sum_year = Math.floor(fixFloatCal(parseFloat(area_after)*parseFloat(rate)*parseFloat(price)*parseFloat((100-parseFloat(reduction_rate))/100)));
                }else{
                    bak_sum_year = Math.floor(fixFloatCal(parseFloat(last_area_after)*parseFloat(rate)*parseFloat(price)*parseFloat((100-parseFloat(reduction_rate))/100)));
                }

                bak_sum_year = Math.floor(bak_sum_year/100)*100;
                var jojung_rate = Math.floor(fixFloatCal((parseFloat(bak_sum_year) - parseFloat(removeComma(sum_lastyear)))/parseFloat(removeComma(sum_lastyear)))*100); // 현년도 작년도 점용료 비율
                if(jojung_rate >= 10 && jojung_rate <=10000)//비율이 허용 범위내에 있을때
                {
                	  //adjustment.value = calJojung(jojung_rate);
                    //adjustment.value = calJojungNew(jojung_rate); //시행령44조에의해 수정 #mr(2014.03.12)
                	adjustment.value = calJojung2015(jojung_rate);	// 시행령69조에의해 수정 #mh(2016.01)
                }else{
                    adjustment.value = 1;
                }

                if(adjustment.value == 1){
                    sum_adjust.value = sum_year.value;
                    form_adjust.value = form.value;
                }else{

                    if(document.getElementById("date_type").value=="month"){

                        sum_adjust.value = fixFloatCal(parseFloat(removeComma(sum_lastyear))*parseFloat(adjustment.value)*fixFloatCal(parseFloat(period)/12));
                        form_adjust.value = sum_lastyear + "원 X " +adjustment.value +" X "+ period + "/12개월";

                    }else if(document.getElementById("date_type").value=="day"){

                        var leafYear = f_leapyear(document.getElementById("YEAR").value);

                        sum_adjust.value = fixFloatCal(parseFloat(removeComma(sum_lastyear))*parseFloat(adjustment.value)*fixFloatCal(parseFloat(period)/(365+leafYear)));
                        form_adjust.value = sum_lastyear + "원 X " +adjustment.value +" X "+ period +Number(365+leafYear)+"일";
                    }


                    if(last_area_after == '' || last_area_after == 0){
                        sum_adjust.value = insertComma2(Math.floor(sum_adjust.value/100)*100);

                    }else{
                        sum_adjust.value = insertComma2(Math.floor(fixFloatCal(parseFloat(sum_adjust.value)*fixFloatCal(parseFloat(area_after)/parseFloat(last_area_after)))/100)*100);
                        form_adjust.value = form_adjust.value + " X " + area_after +"㎡/"+ last_area_after+"㎡";

                    }
                }


                vat.value = insertComma2(Math.floor(fixFloatCal(parseFloat(removeComma(sum_adjust.value))/100))*10);
                savable = 1;



            }

            // 추가 화면 이동
            function goAdd(gapanNo,currentPage)
            {
                location.href("/gapan/jumyong/productInsert.do?GAPAN_NO="+gapanNo+"&currentPage="+currentPage+"&mode=add");
            }

            function goDelete()        {
                location.href("/gapan/jumyong/productInsert.do?GAPAN_NO=${GAPAN_NO}&seq=${seq}&mode=del");

            }


            function showProductList()
            {
                var area = document.getElementById("AREA_AFTER").value;
                if(Number(area) < 0)
                    openwin();
            }


            function openwin(){

                var area = document.getElementById("AREA_AFTER").value;

                var year = document.getElementById("YEAR").value;

                var x= "dialogwidth:700px;dialogHeight:600px;status:no;help:no";

                var mode = document.getElementById("mode").value;

                window.showModalDialog("/gapan/jumyong/junggi/productSubList.do?ADMIN_NO=${GAPAN_NO}&area="+area+"&year="+year+"&mode="+mode, window,x);
            }


            //공시지가 팝업
            function openLandPricePopUp()
            {
                var winW = 320;
                var winH = 133;
                var status ="toolbar=no, location=no, directories=no, status=no, menubar=no, resizable=no, scrollbars=no, width="+winW+", height="+winH+", left=0, top=0";
                var gapanNo = document.getElementById("GAPAN_NO").value;
                var year = document.getElementById("YEAR").value;
                window.open('/gapan/officialLandPrice.do?GAPAN_NO='+gapanNo+'&year='+year, 'win', status);
            }


			function changeTAXDATE(){
                //과세날짜, 납기일내일자, 납기후일자 구하기  2009.08.31 pkh
                var dateUtilObj = new dateUtil();
        		
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


            function	SemokInfo()
        	{
        		var	TAX_CD	= document.getElementById("TAX_CD").value;
        		var	SIGU_CD	= document.getElementById("SIGU_CD").value;
        		var	DEPT_CD	= document.getElementById("DEPT_CD").value;

        		if(TAX_CD != ''){
        			Message_Display('MSG','MSGValue',1);
	        		var	params	= "TAX_CD=" + TAX_CD + "&SIGU_CD=" + SIGU_CD + "&DEPT_CD=" + DEPT_CD;
	        		sendRequest("/gapan/saewe/semokinfo.do", params, "GET", Result_SemokInfo);
        		}
        	}
        	
        	function	Result_SemokInfo(obj)
        	{
        		var xmldoc 	= new ActiveXObject("Microsoft.XMLDOM");
                var form 	= document.productForm;
                 
        		if(obj == "")
        		{		
        			Message_Display('MSG','MSGValue',0);
        			alert("세목코드 실패!!");

        			return;
        		}
        		
               

                xmldoc.async	= false;
        		xmldoc.loadXML(obj);

        		form.ADD_SET.value		= 	xmldoc.getElementsByTagName("gasanRateGubun").item(0).text;
        		form.ADD_SET_NM.value	= 	xmldoc.getElementsByTagName("gasanRateGubunNm").item(0).text;
        		//form.ADD_YN.value		=	xmldoc.getElementsByTagName("vatYn").item(0).text;
        		form.SUBUSEO_CD.value	=	xmldoc.getElementsByTagName("suBuseoCd").item(0).text;
        		form.gasanRate.value	=	xmldoc.getElementsByTagName("gasanRate").item(0).text;
        		form.OCR_BUSEO_CD.value	=	xmldoc.getElementsByTagName("ocrBuseoCd").item(0).text;
        		form.OCR_SIGU_CD.value	=	xmldoc.getElementsByTagName("ocrSiguCd").item(0).text;

        		if(form.ADD_SET.value == '7'){
            		form.ADD_YN.value = 1;
        		}else{
        			form.ADD_YN.value = 0;
        		}
	
        		
        		Message_Display('MSG','MSGValue',0);
        	}



            function DataCheck()
        	{
        		var form 	= document.productForm;
        		var	str		= "";
        		
        		if(form.TAX_GUBUN.value.length	< 1){
        			str	+= "과세구분을 선택하세요\n";
        			form.TAX_GUBUN.focus();
        		}else if(form.TAX_CD.value.length	< 1){
        			str	+= "세목코드를 선택하세요\n";
        			form.TAX_CD.focus();
        		}else if(form.TAXPAYER_SET.value.length	< 1){
        			str	+= "납세자 구분을 선택하세요\n";
        			form.TAXPAYER_SET.focus();
        		}else if(form.LIVE.value.length	< 1){
        			str	+= "거주상태를 선택하세요\n";
        			form.LIVE.focus();
        		}else if(form.OBJ_SET.value.length	< 1){
        			str	+= "물건구분을 선택하세요.\n";
        			form.OBJ_SET.focus();
        		}else if(form.TAX_DATE.value.length	< 1){
        			str	+= "과세일자를 입력하세요\n";
        			form.TAX_DATE.focus();
        		}else if(form.INDATE.value.length	< 1){
        			str	+= "납기내일자를 입력하세요\n";
        			form.INDATE.focus();
        		}else if(form.OVERDATE.value < 110){
        			str	+= "납기후일자를 입력하세요\n";
        			form.OVERDATE.focus();
        		}

        		if(str	== "")
        		{
        			return	true;
        		}
        		
        		alert(str);
        		return	false;		
        	}

        	function taxCdDelete(target,code){
        		var	targetObj = document.getElementById(target);
        		for(var i = 1; i < targetObj.options.length ; i++){
            		if(targetObj.options[i].value.substring(2,5) != code){
            			targetObj.options[i] = null;
            			i = 0;
            		}
        		}
        	}


         	function taxGubunCheck(){
         		var	TAX_GUBUN	= document.getElementById("TAX_GUBUN");
         		if(TAX_GUBUN.value == '3'){
         			alert("신고분은 선택하실수 없습니다. 다시 선택하세요.");
         			TAX_GUBUN.value = '';
         			TAX_GUBUN.focus();
             		return false;
         		}
         		return true;
         	}
        	

            ///////////////////////////////////////////////////////////////////
            var dateUtil = function() {
                this.startObject = null;
                this.endObject = null;
                this.args = null;
            };

            dateUtil.prototype.formatLen = function(str) {
                return str = (""+str).length<2 ? "0"+str : str;
            };

            dateUtil.prototype.formatDate = function(dateObject, delimiter) {
                delimiter = delimiter || "-";
                return dateObject.getFullYear() + delimiter + this.formatLen(dateObject.getMonth() + 1) + delimiter + this.formatLen(dateObject.getDate());
            };

            dateUtil.prototype.toDay = function(delimiter) {
                return this.formatDate(new Date(), "-");
            };

            dateUtil.prototype.calDate = function() {
                var year = this.args.year == null ? 0 : Number(this.args.year);
                var month = this.args.month == null ? 0 : Number(this.args.month);
                var day = this.args.day == null ? 0 : Number(this.args.day);
                var result = new Date();

                result.setYear(result.getFullYear() + year);
                result.setMonth(result.getMonth() + month);
                result.setDate(result.getDate() + day-1);
                return this.formatDate(result, "-");
            };

            dateUtil.prototype.setDate = function(startObject, endObject, args) {
                this.startObject = startObject;
                this.endObject = endObject;
                this.args = args;

                document.getElementById(this.startObject).value = this.calDate();
                document.getElementById(this.endObject).value = this.toDay();
            };


            var dateUtilObj = new dateUtil();
            ///////////////////////////////////////////////////////////////////
            
		    function scrollAll() {
		    	  document.all.leftDisplay2.scrollTop = document.all.mainDisplay2.scrollTop;
		    	  document.all.topLine2.scrollLeft = document.all.mainDisplay2.scrollLeft;
		    }

		    function goLanprice(){
        		var url = "http://kras.seoul.go.kr/land_info/info/landprice/landprice.do";
        		var name = "공시지가열람";
        		var size = "width=800, height=900, scrollbars=yes, resizable=yes";
        		window.open(url, name, size);
        	}
        </script>

    </head>

    <body onload="javascript:InitPage();">
        <form id="productForm" name="productForm" method="post" action = "/gapan/jumyong/productInsert.do" >
        
			<span id="MSG" style="position:absolute;visibility:hidden;">
				<img src="/img/wait.gif" id="MSGValue">
			</span>
        	 
            <input id="CAL_SUM_SEQ" name="CAL_SUM_SEQ" value="${product.CAL_SUM_SEQ}" type="hidden" >
            <input id = "GAPAN_NO" name="GAPAN_NO" value="${GAPAN_NO}" type="hidden" >
            <input id="mode" name="mode" value="${mode}" type="hidden" >
            <input id="SEQ" name="SEQ" value="${seq}" type="hidden" >
            
            <input type="hidden" id="SIGU_CD" name="SIGU_CD" value="${ORG_CD}">
            <input type="hidden" id="DEPT_CD" name="DEPT_CD" value="${DEPT_CD}">
            
            
            
			<!--ajax 리턴값-->
      <input type="hidden" name="ADD_SET"  id="ADD_SET" value="">
			<input type="hidden" name="ADD_SET_NM"  id="ADD_SET_NM" value="">
			<input type="hidden" name="ADD_YN"  id="ADD_YN" value="">
			<input type="hidden" name="SUBUSEO_CD"  id="SUBUSEO_CD" value="">
			<input type="hidden" name="gasanRate"  id="gasanRate" value="">
			<input type="hidden" name="OCR_BUSEO_CD"  id="OCR_BUSEO_CD" value="">
			<input type="hidden" name="OCR_SIGU_CD"  id="OCR_SIGU_CD" value="">
            
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
                                                onclick="javascript:setParentYear('${board.YEAR}');location.href('/gapan/jumyong/productInsert.do?GAPAN_NO=${GAPAN_NO}&year=${board.YEAR}&currentPage=${currentPage}&countPerPage=${countPerPage}&year=${board.YEAR}&seq=${board.SEQ}&SECTION=${SECTION}');" style="cursor:pointer" >
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
                                    <td>
                                    
                                    	<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                                    	    <tr>
                                                <td height="26" align="left" colspan="4">
                                                    <span class="sub_stan_blue">&nbsp; * 산출정보 </span>
                                                </td>
                                            </tr>
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
                                                <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용면적</td>
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
                                                <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b"><span id="date_type1"></span></td>
                                                <td bgcolor="eaeaea" class="table_bl_left" >${product.PERIOD}<span id="date_type2"></span></td>
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
                                            <tr>
                                                <td bgcolor="eaeaea" class="table_bl_left" colspan="2">
                                                </td>
                                                <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">부가가치세</td>
                                                <td bgcolor="eaeaea" class="table_bl_left" >
                                                    ${rnic:insertComma2(product.VAT)} 원
                                                </td>
                                            </tr>



                                        </table>
                                        
                                        
                                	</td>
                                </tr>
                                
                                <tr>
                                <td>
                                </td>
                                
                                
                                </tr>
                                <tr>
                                <td>
                                <table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                                            <tr>
                                                <td colspan="6" height="26px" align="left"  class="sub_table_b">
                                                <span class="sub_stan_blue">&nbsp; * 부과정보 </span>
                                            </tr>
                                            <tr>
                                                <td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">과세구분</td>
                                                <td bgcolor="eaeaea" class="table_bl_left" align="left">
                                                    ${TAX_GUBUN}
                                                </td>
                                                <td align="center" bgcolor="e5eff8" class="sub_table_b">세목코드</td>
                                                <td bgcolor="eaeaea" class="table_bl_left" colspan="5" align="left">
                                                	${TAX_CD}
                                                </td>
                                            </tr>

                                            <tr>
                                                <td width="100px" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">거주상태</td>
                                                <td width="150px" bgcolor="eaeaea" class="table_bl_left" align="left">
                                                    ${LIVE}

                                                </td>
                                                <td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">납세자구분</td>
                                                <td width="150px" bgcolor="eaeaea" class="table_bl_left"  align="left">
                                                    ${TAXPAYER_SET}
                                                </td>
                                                <td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">물건구분</td>
                                                <td bgcolor="eaeaea" class="table_bl_left" align="left">
                                                    ${OBJ_SET}
                                                </td>
                                            </tr>

                                            <tr>
                                                <td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">과세일자</td>
                                                <td bgcolor="eaeaea" class="table_bl_left" align="left">
                                                    ${rnic:addDash(product.TAX_DATE)}
                                                </td>


                                                <td align="center" bgcolor="e5eff8" class="sub_table_b">납기일자</td>
                                                <td bgcolor="eaeaea" class="table_bl_left" colspan="3" align="left">
                                                    <table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                                                        <tr>
                                                            <td>
                                                            	납기내일자&nbsp;:&nbsp;${rnic:addDash(product.INDATE)}                                                    
                                                            </td>
                                                            <td>
                                                            </td>
                                                            <td>
                                                                &nbsp;/&nbsp;납기후일자&nbsp;:&nbsp;${rnic:addDash(product.OVERDATE)}
                                                            </td>
                                                            <td>
                                                            </td>
                                                        </tr>
                                                    </table>
                                                </td>
                                            </tr>
                                        </table>
                                
                                </td>
                                
                                
                                </tr>

                                <tr>
                                    <td height="40" align="right">
                                <c:if test="${SECTION != '4'}">
                                    <table border="0" width="100%">
                                        <tr>



                                            <td >
                                                <img src="/img/add_icon.gif" alt="추가" border="0" onclick="goAdd('${GAPAN_NO}','${currentPage}')" style="cursor:pointer">
                                            </td>
                                        <c:if test="${listSize != '0'}">
                                            <c:if test="${bugwa_yn != '1'}">
                                                <td width="50">
                                                    <img src="/img/mod_icon.gif" alt="수정" border="0" onclick="javascript:goModify()" style="cursor:pointer" >
                                                </td>
                                                <td width="50">
                                                    <img src="/img/del_icon3.gif" alt="삭제" border="0" onclick="javascript:goDelete()" style="cursor:pointer" >
                                                </td>
                                            </c:if>
                                        </c:if>
                                        </tr>

                                    </table>
                                </c:if>
                                </td>
                                </tr>


                            </table>
                        </div>
                        <div id="edit" style="width:100%;display:none;">
                            <table width="100%" border="0" cellspacing="0" cellpadding="0">
                                <tr>

                                    <td>
                                        <table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                                            <tr>
                                                <td height="26" align="left" colspan="4">
                                                    <span class="sub_stan_blue">
                                                    &nbsp; * 산출정보
                                                    </span>
                                                    <input style="float:right; font-size: 10.5px;" class="sub_table_b" type="button" onclick="goLanprice()" value="공시지가조회(서울 부동산정보조회 시스템)">
                                                </td>
                                            </tr>

                                            <tr>
                                                <td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b"  style="direction:rtl" >기준년도</td>
                                                <td width="42%" bgcolor="eaeaea" class="table_bl_left" >
                                                    <input name="YEAR" id="YEAR" type="text" value = "${product.YEAR}" style="width:50px;ime-mode:disabled;"  class="input_form1"  onKeyDown="onlyNumberInput();" style="text-align:right">&nbsp년
                                                </td>
                                                <td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">공시지가</td>
                                                <td width="32%" bgcolor="eaeaea" class="table_bl_left" >
                                                    <input name="PRICE" ID="PRICE" value="${product.PRICE}" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" onkeyup="javascript:fn_addComma(this)"  onKeyDown="onlyNumberInput();" style="text-align:right">원
                                                    <img src="/img/landPrice.gif" alt="공시지가조회" height="18" border="0" style="cursor:pointer;padding-top:0px" onclick="javascript:openLandPricePopUp()";>
                                                </td>
                                            </tr>

                                            <tr>
                                                <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용면적</td>
                                                <td bgcolor="eaeaea" class="table_bl_left" >
                                                    <input name="AREA_AFTER" id="AREA_AFTER" type="text" class="input_form1" style="width:50px;ime-mode:disabled;" value="${product.AREA_AFTER}"   onKeyDown="onlyNumberInput();" style="text-align:right" onblur="showProductList();" >㎡
                                                </td>

                                                <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">요율/단가</td>
                                                <td bgcolor="eaeaea" class="table_bl_left" >
                                                    <input name="RATE"  id="RATE" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value="${product.RATE}"  onKeyDown="onlyNumberInput();" style="text-align:right">
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
                                                                <img src="/img/calendar_icon.gif" onclick="popUpCalendar(this, document.getElementById('FROMDATE'), 'yyyymmdd');" style="cursor:pointer" >
                                                            </td>
                                                            <td width="16" align="center">~</td>
                                                            <td>
                                                                <input name="TODATE" id="TODATE" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value="${product.TODATE}"  onKeyDown="onlyNumberInput();" maxlength=8>
                                                            </td>
                                                            <td>
                                                                <img src="/img/calendar_icon.gif" onclick="popUpCalendar(this, document.getElementById('TODATE'), 'yyyymmdd');" style="cursor:pointer" >
                                                                <img src="/img/cal_month.gif" alt="달수계산" height="18" border="0" style="cursor:pointer" onClick="javascript:calDate();">

                                                            </td>
                                                        </tr>
                                                    </table></td>

                                                <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">
                                                    <select id="date_type" class="input_form1" onchange="javascript:calDate();">
                                                        <option value="month">개월</option>
                                                        <option value="day">일</option>
                                                    </select>수
                                                </td>
                                                <td bgcolor="eaeaea" class="table_bl_left" >
                                                    <input name="PERIOD" id ="PERIOD" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value = "${product.PERIOD}"   onKeyDown="onlyNumberInput();" style="text-align:right">개월(일)
                                                </td>

                                            </tr>
                                            <tr>
                                                <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">감면율 사유</td>
                                                <td bgcolor="eaeaea" class="table_bl_left" >
                                                    <input name="REDUCTION_REASON" id="REDUCTION_REASON" type="text" class="input_form1" style="width:300px" value="${product.REDUCTION_REASON}">
                                                </td>
                                                <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">감면율</td>
                                                <td bgcolor="eaeaea" class="table_bl_left" >
                                                    <input name="REDUCTION_RATE" id="REDUCTION_RATE" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value="${product.REDUCTION_RATE}"  onKeyDown="onlyNumberInput();" style="text-align:right">%
                                                </td>
                                            </tr>
                                            <tr>
                                                <td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">조정 계수</td>
                                                <td width="42%" bgcolor="eaeaea" class="table_bl_left" >
                                                    <input name="ADJUSTMENT" id="ADJUSTMENT" type="text" class="input_form1" style="width:60px;ime-mode:disabled;" value="${product.ADJUSTMENT}"   onKeyDown="onlyNumberInput();" style="text-align:right">
                                                </td>
                                                <td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">작년도 점용료</td>
                                                <td width="32%" bgcolor="eaeaea" class="table_bl_left" >
                                                    <input name="LAST_AREA_AFTER" id="LAST_AREA_AFTER" type="hidden" value="${product.LAST_AREA_AFTER}">
                                                    <input name="SUM_LASTYEAR" id="SUM_LASTYEAR" type="text"  class="input_form1" style="width:80px;ime-mode:disabled;" value="${rnic:insertComma2(product.SUM_LASTYEAR)}"   onKeyDown="onlyNumberInput();" onkeyup="javascript:fn_addComma(this)" style="text-align:right">원
                                                </td>
                                            </tr>



                                            <tr>
                                                <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">기본 산출식</td>
                                                <td bgcolor="eaeaea" class="table_bl_left" >
                                                    <input name="FORM" id="FORM" type="text" class="input_form1" style="width:300px" value="${product.FORM}">
                                                </td>
                                                <td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">현년도 점용료</td>
                                                <td width="32%" bgcolor="eaeaea" class="table_bl_left" >
                                                    <input name="SUM_YEAR" id="SUM_YEAR" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value="${product.SUM_YEAR}"   onKeyDown="onlyNumberInput();" onkeyup="javascript:fn_addComma(this)" style="text-align:right">원
                                                </td>
                                            </tr>

                                            <tr>
                                                <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">조정 산출식</td>
                                                <td bgcolor="eaeaea" class="table_bl_left" >
                                                    <input name="FORM_ADJUST" id="FORM_ADJUST" type="text" class="input_form1" style="width:300px" value="${product.FORM_ADJUST}">
                                                </td>
                                                <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">조정 점용료</td>
                                                <td bgcolor="eaeaea" class="table_bl_left" >
                                                    <input name="SUM_ADJUST" id="SUM_ADJUST" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value="${product.SUM_ADJUST}"  onKeyDown="onlyNumberInput();" onkeyup="javascript:fn_addComma(this)" style="text-align:right">원
                                                    
                                                </td>
                                                


                                            </tr>


                                            <tr>
                                                <td bgcolor="eaeaea" class="table_bl_left" colspan="2">
                                                </td>
                                                <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">부가세</td>
                                                <td bgcolor="eaeaea" class="table_bl_left" >
                                                    <input name="VAT" id="VAT" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value="${product.VAT}"  onKeyDown="onlyNumberInput();" onkeyup="javascript:fn_addComma(this)" style="text-align:right">원
                                                </td>
                                            </tr>



                                        </table>
                                    </td>
                                </tr>
                                <tr>
                                    <td height="26" align="right">
                                        <img src="/img/accou_icon.gif" alt="계산" width="56" height="18" border="0" onclick="javascript:Calculate();" style="cursor:pointer">
                                    </td>

                                </tr>

                                <tr>
                                    <td>
                                        <table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                                            <tr>
                                                <td colspan="6" height="26px" align="left"  class="sub_table_b">
                                                    <span class="sub_stan_blue">&nbsp; * 부과정보 </span>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td width="100px" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">과세구분</td>
                                                <td bgcolor="eaeaea" class="table_bl_left" align="left">
                                                    <select name="TAX_GUBUN" id="TAX_GUBUN" class="essential" style="width:100px" onChange="taxGubunCheck();">
                                                        ${taxation_part}
                                                    </select>
                                                </td>
                                                <td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">세목코드</td>
                                                <td bgcolor="eaeaea" class="table_bl_left" colspan="3" align="left">
                                                    <select name="TAX_CD" id="TAX_CD" class="essential" style="width:220px"  OnChange="SemokInfo();">
                                                        ${taxcode}
                                                    </select>
                                                </td>
                                            </tr>

                                            <tr>
                                                <td width="100px" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">거주상태</td>
                                                <td width="100" bgcolor="eaeaea" class="table_bl_left" align="left">
                                                    <select name="LIVE" id="LIVE" class="essential" style="width:100px">
                                                        ${taxpayer_residence}
                                                    </select>

                                                </td>
                                                <td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">납세자구분</td>
                                                <td bgcolor="eaeaea" class="table_bl_left"  align="left">
                                                    <select name="TAXPAYER_SET" id="TAXPAYER_SET" class="essential" style="width:220px">
                                                        ${taxpayer_group}
                                                    </select>

                                                </td>
                                                <td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">물건구분</td>
                                                <td width="100" bgcolor="eaeaea" class="table_bl_left" align="left">
                                                    <select name="OBJ_SET" id="OBJ_SET" class="essential" style="width:70px">
                                                        ${object_type}
                                                    </select>
                                                </td>
                                            </tr>

                                            <tr>
                                                <td height="26px" width="100" align="center" bgcolor="e5eff8" class="sub_table_b">과세일자</td>
                                                <td bgcolor="eaeaea" class="table_bl_left" align="left">
                                                    <table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                                                        <tr>
                                                            <td>
                                                                <input name="TAX_DATE" id="TAX_DATE" type="text" class="essential" style="width:80px" value="${TAX_DATE}" onfocus="changeTAXDATE();" onselect="changeTAXDATE();">
                                                            </td>
                                                            <td>
                                                                <a>
                                                                    <img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('TAX_DATE'), 'yyyymmdd')" style="CURSOR: Hand;">
                                                                </a>
                                                            </td>
                                                        </tr>
                                                    </table>
                                                </td>


                                                <td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">납기일자</td>
                                                <td bgcolor="eaeaea" class="table_bl_left" colspan="3" align="left">
                                                    <table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                                                        <tr>
                                                            <td>
                                                            	납기내일자&nbsp;:&nbsp;<input name="INDATE" id="INDATE" type="text" class="essential" style="width:80px" value="" onFocus="" readonly>
                                                            </td>
                                                            <td>
                                                                <a>
                                                                    <img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('INDATE'), 'yyyymmdd')" style="CURSOR: Hand;">
                                                                </a>
                                                            </td>
                                                            <td>
                                                                &nbsp;/&nbsp;납기후일자&nbsp;:&nbsp;<input name="OVERDATE" id="OVERDATE" type="text" class="essential" style="width:80px" value="" readonly>
                                                            </td>
                                                            <td>
                                                                <a>
                                                                    <img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('OVERDATE'), 'yyyymmdd')" style="CURSOR: Hand;">
                                                                </a>
                                                            </td>
                                                        </tr>
                                                    </table>
                                                </td>
                                            </tr>





                                        </table>
                                    </td>
                                </tr>
                                <tr>
                                    <td height="40" align="right">
                                <c:if test="${SECTION != '4'}">
                                    <img src="/img/can_icon.gif" alt="취소" border="0" onclick="javascript:history.back();" style="cursor:pointer" >
                                    <img src="/img/save_icon2.gif" alt="저장" width="56" height="18" border="0" onClick="javascript:submitClick();"  style="cursor:pointer">
                                </c:if>
                                </td>
                                </tr>
                            </table>
                        </div>
                    </td>
                </tr>
                <tr>
                    <td height="10">
                    </td>
                </tr>

            </table>

        </form>
    </body>
</html>

