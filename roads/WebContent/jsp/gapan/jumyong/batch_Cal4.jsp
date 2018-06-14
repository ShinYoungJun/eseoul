<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
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
            #tr_fixed_header
            {
                position: relative;
                top: expression(this.offsetParent.scrollTop);
                z-index: 20;
            }
            -->
        </style>
        <link href="/css/roads.css" rel="stylesheet" type="text/css">
        <script language="javascript" src="/js/common.js"></script>
        <script language="javascript" src="/js/calculation.js"></script>
        <script language="javascript" src="/js/PopupCalendar.js"></script>
        <script language="javascript" src="/js/Ajax_request.js"></script>
        <script>

            function checkKeySearch()
            {
                if(event.keyCode == 13) goSearch();
            }



            function InitPage()
            {
            	changeTAXDATE();
            	taxCdDelete('TAX_CD','212');

            	//********** BEGIN_현진_20120305
                var tmp_year = "${YEAR}";

               
               	if(tmp_year=="1980"||tmp_year=="1984"||tmp_year=="1988"||tmp_year=="1992"||tmp_year=="1996"||tmp_year=="2000"||tmp_year=="2004"||tmp_year=="2008"||tmp_year=="2012"||tmp_year=="2016"||tmp_year=="2020"||tmp_year=="2024"){
             		perDay =366;
             	}else{
             		perDay =365;
             	}
                	perDayStr ="일"; 
                	if(document.getElementById("date_type").value!='day'){
                		perDay =12;
                		perDayStr ="월"; 
               	}
                document.getElementById("PERIOD").value = perDay;                
              //********** END_현진_20120305
 
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




            // 부과년도 검색 셋팅
            function change_value(val)
            {
                if(val.value.length == 4)
                {

                    document.frm.FROMDATE.value = val.value + "-01-01";
                    document.frm.TODATE.value = val.value + "-12-31";

                }
            }


            // 계산
            function Calculate(){

                var f = document.frm;

                if(f.TOTALCNT.value <= 0){
                    alert("처리할 데이터가 없습니다. ");
                    return;
                }
                if(f.TAX_CD.value == ''){
                	alert("세목코드를 골라주세요.");
                    return;
                }
                
                calDate();

                var gapan_no = document.getElementsByName("GAPAN_NO");
                var owner_name = document.getElementsByName("OWNER_NAME");
                var addr = document.getElementsByName("ADDR");
                var price = document.getElementsByName("PRICE");
                var reduction_rate = document.getElementsByName("REDUCTION_RATE");
                var reduction_reason = document.getElementsByName("REDUCTION_REASON");
                var sum_year = document.getElementsByName("SUM_YEAR");
                var sum_adjust = document.getElementsByName("SUM_ADJUST");
                var vat = document.getElementsByName("VAT");
                var overtax = document.getElementsByName("OVERTAX");
                var form = document.getElementsByName("FORM");
                var form_adjust = document.getElementsByName("FORM_ADJUST");

                var period = document.getElementById("PERIOD");
                var allCnt = 0;

                for( var i = 0; i < price.length; i++ ){
                    if(price[i].value == '0' || price[i].value == ''){
                        alert("시설물 가액을 넣고 계산해주세요. ");
                        price[i].focus();
                        return;
                    }
                }

                if(Number(period) > 365){
                    alert("산출일이 365일을 초과할수 없습니다.");
                    f.PERIOD.focus();
                    return;
                }

                if(Number(period) < 0){
                    alert("산출일이 입력이 잘못되었습니다.");
                    f.PERIOD.focus();
                    return;
                }

                Message_Display('MSG','MSGValue',1);

                
                for( var i = 0; i < gapan_no.length; i++){
                    /******************    1 기본산출식 및 현년도 점용료 계산    **************************/
                	//********** BEGIN_현진_20120305
                  //sum_year[i].value = fixFloatCal(parseFloat(removeComma(price[i].value))*0.07*parseFloat(period.value)/365);
                  //form[i].value = price[i].value +"원 X 0.07 X " + period.value + "일/365일 ";
                  var period2 = document.getElementById("PERIOD").value;
                  sum_year[i].value = fixFloatCal(parseFloat(removeComma(price[i].value))*0.07*parseFloat(period.value)/period2);
                  form[i].value = price[i].value +"원 X 0.07 X " + period.value + "일/"+period2+"일 ";              
                  //********** END_현진_20120305
                    

                    
                    if(reduction_rate[i].value == "0.0" ||reduction_rate[i].value == "0" || reduction_rate[i].value == ""){
                    	form_adjust[i].value = form[i].value;
                    	sum_adjust[i].value = sum_year[i].value;
                    }else{
                        form_adjust[i].value = form[i].value+"X (100-"+reduction_rate[i].value+")/100";
                        sum_adjust[i].value = parseFloat(sum_year[i].value)*parseFloat(100-parseFloat(reduction_rate[i].value))/100;
                        
                    	
                    }

                  <%-- 20130429 보도 상영업시설 감면 임대료 , 임대료 절삭 단워 10 ->100 단위로 절삭 수정[강서구 요청사항] --%>
                    sum_year[i].value = insertComma2(Math.floor(fixFloatCal(parseFloat(sum_year[i].value)/100))*100);
                    sum_adjust[i].value = insertComma2(Math.floor(fixFloatCal(parseFloat(sum_adjust[i].value)/100))*100);

                    vat[i].value = '0';

                  	//납기후금액(10원단위절삭) = 본세 * 가산율 + 본세
            		overtax[i].value = fixFloatCal(parseFloat(removeComma(sum_adjust[i].value))/100) * parseFloat(document.getElementById("gasanRate").value) + parseFloat(removeComma(sum_adjust[i].value));

            		if(overtax[i].value == 'NaN'){
            			overtax[i].value ='0' ;
            		}else{
            			overtax[i].value = insertComma2(Math.floor(fixFloatCal(parseFloat(removeComma(overtax[i].value))/10))*10);
            		}
                    
                } // for문 end

                Message_Display('MSG','MSGValue',0);

                alert("계산이 완료되었습니다.");
            }

            // 저장
            function submitClick(){

                var f = document.frm;
                var year = document.getElementById("YEAR").value;

                if(f.TOTALCNT.value <= 0){
                    alert("처리할 데이터가 없습니다. ");
                    return;
                }
                if( f.TAX_GUBUN.value == ''){
                    alert("과세구분을 선택하세요.");
                    f.TAX_GUBUN.focus();
                    return;
                }
                if( f.TAX_CD.value == ''){
                    alert("세목코드를 선택하세요.");
                    f. TAX_CD.focus();
                    return;
                }
                if( f.LIVE.value == ''){
                    alert("거주상태를 선택하세요.");
                    f.LIVE.focus();
                    return;
                }
                if( f.TAXPAYER_SET.value == ''){
                    alert("납세자구분을 선택하세요.");
                    f.TAXPAYER_SET.focus();
                    return;
                }
                if( f.OBJ_SET.value == ''){
                    alert("물건구분을 선택하세요.");
                    f.OBJ_SET.focus();
                    return;
                }
                if( f.YEAR.value == ''){
                    alert("부과년도를 넣어주세요.");
                    f.YEAR.focus();
                    return;
                }
                if(	f.FROMDATE.value == ''){
                    alert("산출기간을 넣어주세요.");
                    f.FROMDATE.focus();
                    return;
                }
                if(f.TODATE.value == ''){
                    alert("산출기간을 넣어주세요.");
                    f.TODATE.focus();
                    return;
                }
                
                var price = document.getElementsByName("PRICE");
                var sum_year = document.getElementsByName("SUM_YEAR");
                var sum_adjust = document.getElementsByName("SUM_ADJUST");
                var vat = document.getElementsByName("VAT");
                var overtax = document.getElementsByName("OVERTAX");
                var gapan_no = document.getElementsByName("GAPAN_NO");


                for(var i = 0;i < gapan_no.length ;i++) {

                    if( sum_year[i].value == '' ){
                        alert("현년도 점용료를 다시 계산해주세요.");
                        sum_year[i].focus();
                        return;
                    }else{
                        sum_year[i].value = removeComma(sum_year[i].value);
                    }
                    
                    if( sum_adjust[i].value == '' ){
                        alert("조정 점용료를 다시 계산해주세요.");
                        sum_adjust[i].focus();
                        return;
                    }else{
                        sum_adjust[i].value = removeComma(sum_adjust[i].value);
                    }

                    
                    vat[i].value = removeComma(vat[i].value);
                    overtax[i].value = removeComma(overtax[i].value);
                    price[i].value = removeComma(price[i].value);
                
                    
                }

                if(!confirm("저장하시기 전에 정확하게 산출 및 입력되었는지 확인하셔야 합니다."))
                    return;

                Message_Display('MSG','MSGValue',1);

                f.action = "/gapan/jumyong/batch_cal4_prc.do";
                f.submit();
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
                var form 	= document.frm;
                 
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
            
            
            

        </script>
    </head>

    <body onload="InitPage()">
        <form id="frm"  name="frm" method="post">
        
        	 <span id="MSG" style="position:absolute;visibility:hidden;">
        	 	<img src="/img/wait.gif" id="MSGValue">
        	 </span>

            <input type="hidden" name="TOTALCNT" id="TOTALCNT" value="${listCount}">
            
            
            <input type="hidden" name="SIGU_CD" id="SIGU_CD" value="${ORG_CD}">
            <input type="hidden" name="DEPT_CD" id="DEPT_CD" value="${DEPT_CD}">
            
			<!--ajax 리턴값-->
            <input type="hidden" name="ADD_SET"  id="ADD_SET" value="">
			<input type="hidden" name="ADD_SET_NM"  id="ADD_SET_NM" value="">
			<input type="hidden" name="ADD_YN"  id="ADD_YN" value="">
			<input type="hidden" name="SUBUSEO_CD"  id="SUBUSEO_CD" value="">
			<input type="hidden" name="gasanRate"  id="gasanRate" value="">
			<input type="hidden" name="OCR_BUSEO_CD"  id="OCR_BUSEO_CD" value="">
			<input type="hidden" name="OCR_SIGU_CD"  id="OCR_SIGU_CD" value="">
			<input type="hidden" name="CAL_MODE" id="CAL_MODE" value ="${CAL_MODE}">
            

            <table width="780" border="0" cellpadding="0" cellspacing="0">
                <tr>
                    <td height="43">
                    	<img src="/img/jumyong_junggi_title.gif" width="800" height="43"></td>
                </tr>
                <tr>
                    <td >
                        <table width="780" border="0" cellspacing="0" cellpadding="0">
                            <tr>
                                <td height="1" bgcolor="eaeaea"></td>
                            </tr>
                            <tr>
                                <td height="14"></td>
                            </tr>
                            <tr>
                                <td>
                                    <table width="780" border="0" cellspacing="0" cellpadding="0">
                                        <tr>
                                            <td align="left" height="22" background="/img/tab_line_blue.gif">
                                                <table border="0" cellspacing="0" cellpadding="0">
                                                    <tr>
                                                        <td><img src="/img/sub_petition_title15.gif" width="110" height="22"></td>
                                                    </tr>
                                                </table>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td  class="contborder_purple">
                                                <table width="100%" border="0" cellspacing="0" cellpadding="0">
                                                    <tr>
                                                        <td height="34" class="sub_stan">
						                         			전체건수 : <span class="sub_stan_blue">${listCount}</span>건
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td colspan="2">
															<table width="780px" cellpadding="0" cellspacing="0" border="0" class="sub_table" bordercolor="#c9dfed" style="border-collapse:collapse;">
															  <TR>
															    <TD width="110px"  valign="top">
															      <TABLE cellpadding="0" cellspacing="0" border="1" class="sub_table" bordercolor="#c9dfed" style="border-collapse:collapse;">
															        <TR height="26">
							  								        <td width="110px" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">
							                           					관리번호
					  											  	</td>
															        </TR>
															      </TABLE>
															    </TD>
															    <TD width="754px" valign="top">
															      <DIV id="topLine2" style="width:737px;overflow:hidden;">
															        <TABLE width="1350px" cellpadding="0" cellspacing="0" border="1" class="sub_table" bordercolor="#c9dfed" style="border-collapse:collapse;">
															          <TR height="26px">
												                            <td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">운영자명</td>
												                            <td width="120px" align="center" bgcolor="e5eff8" class="sub_table_b">점용지 주소</td>
												                            <td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">시설물 가액</td>
												                            <td width="220px" align="center" bgcolor="e5eff8" class="sub_table_b">기본 산출식</td>
												                            <td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">임대료</td>
												                            <td width="220px" align="center" bgcolor="e5eff8" class="sub_table_b">감면 산출식</td>
												                            <td width="110px" align="center" bgcolor="e5eff8" class="sub_table_b">감면 임대료</td>
												                            <td width="80px" align="center" bgcolor="e5eff8" class="sub_table_b">부가세</td>
												                            <td width="80px" align="center" bgcolor="e5eff8" class="sub_table_b">납기후금액</td>
												                            <td width="70px" align="center" bgcolor="e5eff8" class="sub_table_b">감면율</td>
												                            <td width="150px" align="center" bgcolor="e5eff8" class="sub_table_b">감면사유</td>
															          </TR>
															        </TABLE>
															      </DIV>
															    </TD>
															  </TR>
															  <TR>
															    <TD width="110px" valign="top">
															      <DIV id="leftDisplay2" style="width:110px;height:337px;overflow:hidden;">
															        <TABLE width="100%" cellpadding="0" cellspacing="0" border="1" class="sub_table" bordercolor="#c9dfed" style="border-collapse:collapse;">
											                          <c:forEach items="${productList}" var="board" varStatus="idx">
											                          <tr height="20px" onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''">
											                              <td align="center">
											                                  <input type="text" class="input_form1" name="GAPAN_NO" value="${board.GAPAN_NO}" style="width:100%;border:0px;text-align:center"  readonly="readonly">
											                                  <input type="hidden" name="RATE" value="0">
											                                  <input type="hidden" name="AREA_AFTER" value="0">
											                                  <input type="hidden" name="SUM_LASTYEAR" value="0">
											                                  <input type="hidden" name="ADJUSTMENT" value="1">
											                              </td>
											                          </tr>
											                          </c:forEach>
															        </TABLE>
															      </DIV>
															    </TD>
															    <TD width="754px" valign="top">
															      <DIV id="mainDisplay2" style="width:754px;height:354px;overflow:scroll;;scrollbar-face-color:#EEF8FB;scrollbar-3dlight-color:#BBBDB6; scrollbar-highlight-color:#EEF8FB;scrollbar-shadow-color:#BBBDB6; scrollbar-darkshadow-color:#EEF8FB;scrollbar-track-color:#EEF8FB;scrollbar-arrow-color:#BBBDB6;" onscroll="scrollAll()">
															        <TABLE width="1350px" cellpadding="0" cellspacing="0" border="1" class="sub_table" bordercolor="#c9dfed" style="border-collapse:collapse;">
											                          <c:forEach items="${productList}" var="board" varStatus="idx">
											                          <tr height="20px" onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''">
											  
											                              <td width="100px" align="center">
											                                  <input type="text" class="input_form1" name="OWNER_NAME" value="${board.OWNER_NAME}" style="width:100%;border:0px;text-align:center;padding:0px"  readonly="readonly">
											                              </td>
											                              <td width="120px" align="center">
											                                  <input type="text" class="input_form1" name="ADDR" value="${board.ADDR}" style="width:100%;border:0px;text-align:center;padding:0px"  readonly="readonly">
											                              </td>
											                              <td width="100px" align="center">
											                                  <input type="text" class="input_form1" name="PRICE" value="${rnic:insertComma2(board.SF_VALUE)}" style="height20px;width:100%;text-align:center;padding:0px;border:0px;" onkeyup="javascript:fn_addComma(this);" onkeydown="javascript:onlyNumberInput();">
											                              </td>
											                              <td width="220px" align="center">
											                                  <input type="text" class="input_form1" name="FORM" value="" style="width:100%;text-align:center;padding:0px;border:0px;" >
											                              </td>
											                              <td width="100px" align="center">
											                                  <input type="text" class="input_form1" name="SUM_YEAR" value="" style="width:100%;text-align:center;padding:0px;border:0px;" onkeyup="javascript:fn_addComma(this);" onkeydown="javascript:onlyNumberInput();">
											                              </td>
											                              <td width="220px" align="center">
											                                  <input type="text" class="input_form1" name="FORM_ADJUST" value="" style="width:100%;text-align:center;padding:0px;border:0px;" >
											                              </td>
											                              <td width="110px" align="center">
											                                  <input type="text" class="input_form1" name="SUM_ADJUST" value="" style="width:100%;text-align:center;padding:0px;border:0px;" onkeyup="javascript:fn_addComma(this);" onkeydown="javascript:onlyNumberInput();">
											                              </td>
											                              <td width="80px" align="center">
											                                  <input type="text" class="input_form1" name="VAT" value="" style="width:100%;text-align:center;padding:0px;border:0px;" onkeyup="javascript:fn_addComma(this);" onkeydown="javascript:onlyNumberInput();">
											                              </td>
											                              <td width="80px" align="center">
											                                  <input type="text" class="input_form1" name="OVERTAX" value="" style="width:100%;text-align:center;padding:0px;border:0px;" onkeyup="javascript:fn_addComma(this);" onkeydown="javascript:onlyNumberInput();">
											                              </td>
											                              <td width="70px" align="center">
											                                  <input type="text" class="input_form1" name="REDUCTION_RATE" value="${board.REDUCTION_RATE}" style="width:100%;text-align:center;padding:0px;border:0px;"  onkeydown="javascript:onlyNumberInput();">
											                              </td>
											                              <td width="150px" align="center">
											                                  <input type="text" class="input_form1" name="REDUCTION_REASON" value="${board.REDUCTION_REASON}" style="width:100%;text-align:center;padding:0px;border:0px;" maxlength="100">
											                              </td>
											                          </tr>
											                          </c:forEach>
															        </TABLE>
															      </DIV>
															    </TD>
															  </TR>
															</table>
                                                        </td>
                                                    </tr>
                                                    <tr height="20">
                                                        <td>
                                                        	

                                                        </td>
                                                    </tr>

                                                    <tr>
                                                        <td align="center" colspan="2">
                                                            <table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                                                                <tr>
                                                                    <td colspan="6" height="26" align="left"  class="sub_table_b">&nbsp;* 산출 내역</td>
                                                                </tr>
                                                                <tr>
                                                                    <td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">산출년도</td>
                                                                    <td class="table_bl_left" align="left">
                                                                        <input id="YEAR" name="YEAR" type="text" style="width:100px;ime-mode:disabled;" class="input_form1"  onKeyDown="onlyNumberInput();" value="${YEAR}" maxlength="4" onKeyUp="change_value(this)">
                                                                    </td>
                                                                    <td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">산출기간</td>
                                                                    <td class="table_bl_left" colspan="3" align="left">
                                                                        <input name="FROMDATE" id="FROMDATE" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value="${FROMDATE}"  onKeyDown="onlyNumberInput();"   onKeyDown="onlyNumberInput();" maxlength=10>
                                                                        	<img src="/img/calendar_icon.gif" onclick="popUpCalendar(this, document.getElementById('FROMDATE'),'yyyymmdd');"  style="cursor:pointer" >
                                                                        <input name="TODATE" id="TODATE" type="text" class="input_form1" style="width:80px;ime-mode:disabled;"  value="${TODATE}"  onKeyDown="onlyNumberInput();" maxlength=10>
                                                                        	<img src="/img/calendar_icon.gif" onclick="popUpCalendar(this, document.getElementById('TODATE'),'yyyymmdd');"  style="cursor:pointer" >
                                                                        	
                                                                        	<input name="date_type" id="date_type" type="hidden" value="day">

					                                                    <img src="/img/cal_month.gif" align="middle" alt="날짜 계산" width="64" height="18" border="0" style="cursor:pointer" onClick="javascript:calDate();">
					                                                    
                                                                        &nbsp;&nbsp; 일수 :
                                                                        <input name="PERIOD" id ="PERIOD" type="text" class="input_form1" style="width:60px;ime-mode:disabled;" value = "${PERIOD}" onKeyDown="onlyNumberInput();" >
                                                                    </td>
                                                                </tr>
                                                                <tr>
                                                                    <td colspan="6" height="26" align="left"  class="sub_table_b">&nbsp;* 부과 내역</td>
                                                                </tr>
                                                                <tr>
                                                                    <td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">과세구분</td>
                                                                    <td bgcolor="eaeaea" class="table_bl_left" align="left">
                                                                        <select name="TAX_GUBUN" id="TAX_GUBUN" class="essential" style="width:100px">
                                                                            ${taxation_part}
                                                                        </select>
                                                                    </td>
                                                                    <td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">세목코드</td>
                                                                    <td bgcolor="eaeaea" class="table_bl_left" colspan="3" align="left">			
                                                                        <select name="TAX_CD" id="TAX_CD" class="essential" style="width:220px" onchange="SemokInfo();">
                                                                            ${taxcode}
                                                                        </select>
                                                                    </td>
                                                                </tr>

                                                                <tr>
                                                                    <td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">거주상태</td>
                                                                    <td width="100" bgcolor="eaeaea" class="table_bl_left" align="left">
                                                                        <select name="LIVE" id="LIVE" class="essential" style="width:100px">
                                                                            ${taxpayer_residence}
                                                                        </select>

                                                                    </td>
                                                                    <td height="26" width="100" align="center" bgcolor="e5eff8" class="sub_table_b">납세자구분</td>
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
                                                                    <td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">과세일자</td>
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
                                                        <td height="40" align="right" colspan="2">
                                                            <table border="0" width="100%">
                                                                <tr>
                                                                    <td height="40" align="right">
                                                                        <img src="/img/accou_icon.gif" alt="계산" width="56" height="18" border="0" onclick="javascript:Calculate();" style="cursor:pointer">
                                                                        <img src="/img/save_icon2.gif" alt="저장" width="56" height="18" border="0" onClick="javascript:submitClick();" style="cursor:pointer" >
                                                                        <img src="/img/can_icon.gif" alt="취소" border="0" onclick="javascript:history.back();" style="cursor:pointer" >
                                                                    </td>
                                                                </tr>
                                                            </table>
                                                        </td>
                                                    </tr>
                                                </table>
                                            </td>
                                        </tr>
                                    </table>
                                </td>
                            </tr>
                            <tr>
                                <td height="30">

                                </td>
                            </tr>
                        </table>

                    </td>
                </tr>
            </table>
        </form>
    </body>

</html>

