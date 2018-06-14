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
                iFrm.style.height = the_height + "px";
            }
            function InitPage()
            {
                if((document.getElementById("mode").value == "edit" || document.getElementById("mode").value == "add") && '${existOwner}' == 'false'){
                	alert("운영자 정보가 부족합니다. 운영자 정보에서 부족한 정보를 추가해 주세요.");
            	}

                if('${TAX_GUBUN}' == '3'){
                	document.productForm.BEFORE_TAX_YN[0].checked = true;
                }else if(('${TAX_GUBUN}' == '1') || ('${TAX_GUBUN}' == '2')){
                	document.productForm.BEFORE_TAX_YN[1].checked = true;
                }            	

            	changeTAXDATE();


                if('${ck_del}' == '1'){
                    location.href = "/rojum/jumyong/rojumCal3.do?GAPAN_NO=${GAPAN_NO}";
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

                taxCdDelete('TAX_CD','288');

              //********** BEGIN_현진_20120307
              selectBeforeTaxYN('before');
              //********** END_현진_20120307

                
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


            function submitClick()
            {
                var productForm = document.productForm;

            	if(!DataCheck()){
                	return;
            	}

                if(savable == 1)
                {
                    //comma제거
                    removeComma2("PRICE");
                    removeComma2("SUM_YEAR");
                    removeComma2("SUM_ADJUST");
                    removeComma2("VAT");
                    productForm.TAX_DATE.value = removeDash(productForm.TAX_DATE.value);
                    productForm.OVERDATE.value = removeDash(productForm.OVERDATE.value);
                    productForm.INDATE.value = removeDash(productForm.INDATE.value);

                    productForm.submit();
                }else{
                    alert("산출 내역을 계산해 주십시오.");
                }
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
                var sum_adjust = Number(removeComma(document.getElementById("SUM_ADJUST").value));

                if(area>=0)
                {
                    location.href = "/rojum/jumyong/rojumCal3.do?GAPAN_NO=${GAPAN_NO}&currentPage=${currentPage}&countPerPage=${countPerPage}"
                        +"&mode=edit&year="+year+"&seq="+seq+"&SECTION=${SECTION}";
                }else if(sum_adjust <0)
                {
                    location.href = "/rojum/jumyong/productSubtractInsert.do?GAPAN_NO=${GAPAN_NO}&currentPage=${currentPage}&countPerPage=${countPerPage        }"
                        +"&mode=edit&year="+year+"&seq="+seq+"&SECTION=${SECTION}&area="+area;
                }else
                {
                    location.href = "/rojum/jumyong/productSubtractBeforeTaxInsert.do?GAPAN_NO=${GAPAN_NO}&currentPage=${currentPage}&countPerPage=${countPerPage        }"
                        +"&mode=edit&year="+year+"&seq="+seq+"&gp_typ=${gp_typ}&SECTION=${SECTION}&area="+area;
                }
            }
            function Calculate()
            {
                var price = removeComma(document.getElementById("PRICE").value);
                var reduction_rate = document.getElementById("REDUCTION_RATE").value;
                var reduction_reason = document.getElementById("REDUCTION_REASON").value;
				//********** BEGIN_현진_20120214
				 var area_after = document.getElementById("AREA_AFTER").value;
				//********** BEGIN_현진_20120307
				if(area_after == "" || typeof(area_after) == "undefined" || area_after == null || area_after < 1 ){
				  document.getElementById("AREA_AFTER").value = 1;
				  area_after = 1;		              
				}
				//********** END_현진_20120307
				//********** END_현진_20120214
				
                var lt_sel_yn = document.getElementById("LT_SEL_YN").value;

                if(reduction_rate == "")
                    reduction_rate = 0;

                var sum_year = document.getElementById("SUM_YEAR");
                var sum_adjust = document.getElementById("SUM_ADJUST");
                var form = document.getElementById("FORM");
                var form_adjust = document.getElementById("FORM_ADJUST");
                var vat = document.getElementById("VAT");

                if(price<=0){
                    alert("기준금액을 넣어주세요.");
                    document.getElementById("PRICE").value = "";
                    document.getElementById("PRICE").focus();
                    return;
                }
                
                
                if(lt_sel_yn == 'Y' && reduction_rate == 0){
                    reduction_rate = 50;
                    reduction_reason = '과태료감경대상 50%감경';
                	
                }
                
              //********** BEGIN_KANG_20120925
              // 과태료 부과기준(제9조의 2관련) 초과 점용면적 1제곱미터 이하 50,000원 1미터제곱을 초과하는 매 1제곱미터 이내마다 100,000원씩 추가
              // 과태료 상한 금액 1,500,000
              //area_after_floor = Math.floor(area_after);
              //sum_year.value = Math.floor(fixFloatCal(parseFloat(price)*parseFloat(area_after_floor)*parseFloat((100-parseFloat(reduction_rate))/100)));
              area_after_floor = Math.ceil(area_after);
              sum_year.value = parseFloat(price)+ (area_after_floor-1) * 100000;
              if( sum_year.value > 1500000){
            	  sum_year.value = 1500000;
              }
              sum_year.value = sum_year.value * parseFloat((100-parseFloat(reduction_rate))/100);
			  //********** END_KANG_20120925
                form.value = insertComma2(price);
                if(reduction_rate == "0.0" || reduction_rate == "0" || reduction_rate == ""){                    
                    //********** BEGIN_KANG_20120925
                    //form.value = form.value+" X "+ area_after_floor;
                    form.value = form.value+ " + ("+area_after_floor+ "-1) X 100,000";
					//********** END_KANG_20120925                   

                }else{
                	//********** BEGIN_KANG_20120925
                	//form.value = form.value+" X "+ area_after_floor +" X(100-"+reduction_rate+")/100";
                	 form.value = "("+form.value+ " + ("+area_after_floor+ "-1) X 100,000) X (100-"+reduction_rate+")/100";
                	//********** END_KANG_20120925  
                }

                sum_year.value = insertComma2(Math.floor(sum_year.value/100)*100);		//100원 절삭

                sum_adjust.value = sum_year.value;
                form_adjust.value = form.value;
                
                vat.value = "0";
                savable = 1;

            }
            
		    function selectBeforeTaxYN(chkVal){
	    		var form 	= document.productForm;
	    		
	    		
	    		if(form.LT_SEL_YN.value == 'Y'){

				    if(chkVal == 'before'){
				    	savable = 0;
						form.REDUCTION_RATE.value = "60";
						form.REDUCTION_REASON.value = "과태료감경대상 50%+사전통지에 의한 20%감경";
						form.TAX_GUBUN.value = "3";
						
				    }else{
				    	savable = 0;
						form.REDUCTION_RATE.value = "50";
						form.REDUCTION_REASON.value = "과태료감경대상 50%감경";
						form.TAX_GUBUN.value = "2";
					}
	    		}else{
				    if(chkVal == 'before'){
				    	savable = 0;
						form.REDUCTION_RATE.value = "20";
						form.REDUCTION_REASON.value = "사전통지에 의한 20%감경";
						form.TAX_GUBUN.value = "3";
						
				    }else{
				    	savable = 0;
						form.REDUCTION_RATE.value = "0";
						form.REDUCTION_REASON.value = "";
						form.TAX_GUBUN.value = "2";
					}
	    		}
	    		//********** BEGIN_KANG_20120720
	    		changeTAXDATE();
	    		//********** END_KANG_20120720
	    	}

            // 추가 화면 이동
            function goAdd(gapanNo,currentPage)
            {
                location.href("/rojum/jumyong/rojumCal3.do?GAPAN_NO="+gapanNo+"&currentPage="+currentPage+"&mode=add");
            }

            function goDelete(){
                location.href("/rojum/jumyong/rojumCal3.do?GAPAN_NO=${GAPAN_NO}&seq=${seq}&mode=del");

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

                window.showModalDialog("/rojum/jumyong/junggi/productSubList.do?ADMIN_NO=${GAPAN_NO}&area="+area+"&year="+year+"&mode="+mode, window,x);
            }


            function changeTAXDATE(){
            	//********** BEGIN_KANG_20120720
            	/*
            	//과세날짜, 납기일내일자, 납기후일자 구하기  2009.08.31 pkh
                var taxdate = document.getElementById("TAX_DATE").value;
                document.getElementById("INDATE").value = addDate('d',15,taxdate,'-');
                document.getElementById("OVERDATE").value = addDate('m',1,document.getElementById("INDATE").value,'-');
            	*/
            	//과세날짜, 납기일내일자, 납기후일자 구하기  2009.08.31 pkh
            	
            	var taxdate = document.getElementById("TAX_DATE").value;
                document.getElementById("INDATE").value = addDate('d',15,taxdate,'-');
            	
         		var	TAX_GUBUN	= document.getElementById("TAX_GUBUN");
         		
         		if(TAX_GUBUN.value == '3'){
             		document.getElementById("OVERDATE").value = addDate('d',15,taxdate,'-');             		
         		}else if(TAX_GUBUN.value == '2'){
         			document.getElementById("OVERDATE").value = addDate('m',1,document.getElementById("INDATE").value,'-');
         		}
                
            	//********** END_KANG_20120720
            }


            function	SemokInfo()
        	{
        		var	TAX_CD	= document.getElementById("TAX_CD").value;
        		var	SIGU_CD	= document.getElementById("SIGU_CD").value;
        		var	DEPT_CD	= document.getElementById("DEPT_CD").value;

        		if(!taxCdCheck()){
            		return;
        		}

        		if(TAX_CD != ''){
        			MessageDisplay('MSG','MSGValue',1);
	        		var	params	= "TAX_CD=" + TAX_CD + "&SIGU_CD=" + SIGU_CD + "&DEPT_CD=" + DEPT_CD;
	        		sendRequest("/rojum/saewe/semokinfo.do", params, "GET", Result_SemokInfo);
        		}
        	}
        	
        	function	Result_SemokInfo(obj)
        	{
        		var xmldoc 	= new ActiveXObject("Microsoft.XMLDOM");
                var form 	= document.productForm;
                 
        		if(obj == "")
        		{		
        			MessageDisplay('MSG','MSGValue',0);
        			alert("세목코드 실패!!");
        			return;
        		}
        		
                xmldoc.async	= false;
        		xmldoc.loadXML(obj);
        		form.ADD_SET.value		= 	xmldoc.getElementsByTagName("gasanRateGubun").item(0).text;
        		form.ADD_SET_NM.value	= 	xmldoc.getElementsByTagName("gasanRateGubunNm").item(0).text;
        		form.SUBUSEO_CD.value	=	xmldoc.getElementsByTagName("suBuseoCd").item(0).text;
        		form.gasanRate.value	=	xmldoc.getElementsByTagName("gasanRate").item(0).text;
        		form.OCR_BUSEO_CD.value	=	xmldoc.getElementsByTagName("ocrBuseoCd").item(0).text;
        		form.OCR_SIGU_CD.value	=	xmldoc.getElementsByTagName("ocrSiguCd").item(0).text;
	
        		if(form.ADD_SET.value == '7'){
            		form.ADD_YN.value = 1;
        		}else{
        			form.ADD_YN.value = 0;
        		}
        		
        		MessageDisplay('MSG','MSGValue',0);
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
         		}else if(form.BEFORE_TAX_YN[0].checked == false && form.BEFORE_TAX_YN[1].checked == false){
         			str	+= "사전통지 여부를 선택하세요\n";
         			form.BEFORE_TAX_YN[0].focus();
         		}

         		if(str	== "")
         		{
         			return	true;
         		}
         		
         		alert(str);
         		return	false;		
         	}

         	function taxCdCheck(){
         		var	TAX_CD	= document.getElementById("TAX_CD");
         		

				if(TAX_CD.value.substring(2,5) != '288'){
             		alert("과태료만 선택하실수 있습니다. 다시 선택하세요.");
             		TAX_CD.value = '';
             		TAX_CD.focus();
             		return false;
         		}
         		return true;

         	}

         	function taxGubunCheck(){
         		var	TAX_GUBUN	= document.getElementById("TAX_GUBUN");


         		var before_tax_yn = document.productForm.BEFORE_TAX_YN;
        		
         		if(before_tax_yn[0].checked && TAX_GUBUN.value != '3'){
         			alert("신고분만 선택할수 있습니다.");
         			TAX_GUBUN.value = '3';
         			TAX_GUBUN.focus();
             		return false;
         		}else if(before_tax_yn[1].checked && TAX_GUBUN.value != '2'){
         			alert("수시분만 선택할수 있습니다.");
         			TAX_GUBUN.value = '2';
         			TAX_GUBUN.focus();
             		return false;
         		}
         		return true;
         	}

        </script>

    </head>

    <body onload="javascript:InitPage();"  border="0">
        <form name="productForm" id="productForm" method="post" action = "/rojum/jumyong/rojumCal3.do" >
        
			<span id="MSG" style="position:absolute;display:none; ">
				<img src="/img/loadingBar.gif" id="MSGValue">
			</span>
        	 
            <input name="CAL_SUM_SEQ" value="${product.CAL_SUM_SEQ}" type="hidden" >
            <input name="GAPAN_NO" id = "GAPAN_NO" value="${GAPAN_NO}" type="hidden" >
            <input name="mode"  id = "mode" value="${mode}" type="hidden" >
            <input name="SEQ"  id = "SEQ" value="${seq}" type="hidden" >
            
            <input type="hidden" name="SIGU_CD" id="SIGU_CD" value="${ORG_CD}">
            <input type="hidden" name="DEPT_CD" id="DEPT_CD" value="${DEPT_CD}">
            <input type="hidden" name="LT_SEL_YN" id="LT_SEL_YN" value="${product.LT_SEL_YN}">
            
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
                                            <td width="40px" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">번호</td>
                                            <td align="center" bgcolor="e5eff8" class="sub_table_b">산출년도</td>
                                            <td align="center" bgcolor="e5eff8" class="sub_table_b">면적</td>
                                           
                                            <td align="center" bgcolor="e5eff8" class="sub_table_b">기준금액</td>
                                            <td align="center" bgcolor="e5eff8" class="sub_table_b">과태료</td>

                                        </tr>
                                        <c:forEach items="${productList}" var="board" varStatus="idx">
                                            <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''"
                                                onclick="javascript:setParentYear('${board.YEAR}');location.href('/rojum/jumyong/rojumCal3.do?GAPAN_NO=${GAPAN_NO}&year=${board.YEAR}&currentPage=${currentPage}&countPerPage=${countPerPage}&year=${board.YEAR}&seq=${board.SEQ}&SECTION=${SECTION}');" style="cursor:pointer" >
                                                <td height="26" align="center">${idx.count}</td>
                                                <td align="center">${board.YEAR}</td>                                                                                                
	                                            <td align="center">${board.AREA_AFTER}</td>
	                                       
                                                <td align="center">${rnic:insertComma2(board.PRICE)}</td>
                                                <td align="center">${rnic:insertComma2(board.SUM_YEAR) }</td>

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
                                                </table>
                                            </td>
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
                                                <td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b" >산출년도</td>
                                                <td width="42%" bgcolor="eaeaea" class="table_bl_left" >
                                                    ${product.YEAR}년
                                                </td>
                                                <td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">기준금액</td>
                                                <td width="32%" bgcolor="eaeaea" class="table_bl_left" >
                                                    ${rnic:insertComma2(product.PRICE)}원
                                                </td>
                                            </tr>
                                            <tr>
                                                <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">감경 사유</td>
                                                <td bgcolor="eaeaea" class="table_bl_left" >
                                                    ${product.REDUCTION_REASON}
                                                </td>
                                                <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">감경율</td>
                                                <td bgcolor="eaeaea" class="table_bl_left" >
                                                    ${product.REDUCTION_RATE} %
                                                </td>
                                            </tr>

                                            <tr>
                                                <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">산출식</td>
                                                <td bgcolor="eaeaea" class="table_bl_left" >

                                                    ${product.FORM}

                                                </td>

                                                <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">과태료</td>
                                                <td bgcolor="eaeaea" class="table_bl_left" >
                                                    ${rnic:insertComma2(product.SUM_YEAR)} 원
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
                                                <td width="100px" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">과세구분</td>
                                                <td bgcolor="eaeaea" class="table_bl_left" align="left">
                                                    ${TAX_GUBUN}
                                                </td>
                                                <td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">세목코드</td>
                                                <td bgcolor="eaeaea" class="table_bl_left" colspan="3" align="left">
                                                	${TAX_CD}
                                                </td>
                                            </tr>

                                            <tr>
                                                <td width="100px" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">거주상태</td>
                                                <td width="100px" bgcolor="eaeaea" class="table_bl_left" align="left">
                                                    ${LIVE}

                                                </td>
                                                <td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">납세자구분</td>
                                                <td bgcolor="eaeaea" class="table_bl_left"  align="left">
                                                    ${TAXPAYER_SET}
                                                </td>
                                                <td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">물건구분</td>
                                                <td width="100px" bgcolor="eaeaea" class="table_bl_left" align="left">
                                                    ${OBJ_SET}
                                                </td>
                                            </tr>

                                            <tr>
                                                <td height="26px" width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">과세일자</td>
                                                <td bgcolor="eaeaea" class="table_bl_left" align="left">
                                                    ${rnic:addDash(product.TAX_DATE)}
                                                </td>


                                                <td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">납기일자</td>
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
                                                    <span class="sub_stan_blue">&nbsp; * 산출정보 </span>
                                                </td>
                                            </tr>

                                            <tr>
                                                <td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b"  style="direction:rtl" >산출년도</td>
                                                <td width="42%" bgcolor="eaeaea" class="table_bl_left" >
                                                    <input name="YEAR" id="YEAR" type="text" value = "${product.YEAR}" style="width:50px;ime-mode:disabled;"  class="input_form1"  onKeyDown="onlyNumberInput();" style="text-align:right">&nbsp년
                                                </td>
                                                <td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">기준금액</td>
                                                <td width="32%" bgcolor="eaeaea" class="table_bl_left" >
                                                    <input name="PRICE" ID="PRICE" value="${rnic:insertComma2(product.PRICE)}" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" onkeyup="javascript:fn_addComma(this)"  onKeyDown="onlyNumberInput();" style="text-align:right">원
                                                </td>
                                            </tr>

                                            <tr>
                                                <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용면적</td>
                                                <td bgcolor="eaeaea" class="table_bl_left" colspan="3" >
                                                    <input name="AREA_AFTER" id="AREA_AFTER" type="text" class="input_form1" style="width:50px;ime-mode:disabled;" value="${product.AREA_AFTER}"   onKeyDown="onlyNumberInput();" style="text-align:right" onblur="showProductList();" >㎡
                                                </td>
                                            </tr>

                                            <tr>
                                                <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">감경사유</td>
                                                <td bgcolor="eaeaea" class="table_bl_left" >
                                                    <input name="REDUCTION_REASON" id="REDUCTION_REASON" type="text" class="input_form1" style="width:300px" value="${product.REDUCTION_REASON}">
                                                </td>
                                                <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">감경율</td>
                                                <td bgcolor="eaeaea" class="table_bl_left" >
                                                    <input name="REDUCTION_RATE" id="REDUCTION_RATE" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value="${product.REDUCTION_RATE}"  onKeyDown="onlyNumberInput();" style="text-align:right">%
                                                </td>
                                            </tr>

                                            <tr>
                                                <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">산출식</td>
                                                <td bgcolor="eaeaea" class="table_bl_left" >
                                                    <input name="FORM" ID="FORM" type="text" class="input_form1" style="width:300px" value="${product.FORM}">
                                                </td>
                                                <td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">과태료</td>
                                                <td width="32%" bgcolor="eaeaea" class="table_bl_left" >
                                                    <input name="SUM_YEAR" id="SUM_YEAR" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value="${product.SUM_YEAR}"   onKeyDown="onlyNumberInput();" onkeyup="javascript:fn_addComma(this)" style="text-align:right">원
                                                    <input name="SUM_ADJUST" id="SUM_ADJUST" type="hidden" value="${product.SUM_ADJUST}">
													<input name="FORM_ADJUST" id="FORM_ADJUST" type="hidden" value="${product.FORM_ADJUST}">
													<input name="VAT" id="VAT" type="hidden" value="${product.VAT}">
                                                </td>
                                            </tr>
                                            
                                        </table>
                                    </td>
                                </tr>
                                <tr>
                                    <td height="26" align="right" class="sub_table_b">
                                    	<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
							              <tr>
							               <!--  //********** BEGIN_현진_20120305 -->
							                <td>
							                	<input name="BEFORE_TAX_YN" id="BEFORE_TAX_YN" type="radio" value="before" onclick="selectBeforeTaxYN('before')" checked>
							                </td>
							                <td width="100px" align="left">사전통지 과태료</td>
							                <td>							               
							                	<input name="BEFORE_TAX_YN" id="BEFORE_TAX_YN" type="radio" value="original" onclick="selectBeforeTaxYN('original')">																		                						                
							                </td>
							                <td width="60px" align="left">과태료</td>
							                <!--   //********** END_현진_20120305 -->
							                <td align="right">
							                	<img src="/img/accou_icon.gif" alt="계산" width="56" height="18" border="0" onclick="javascript:Calculate();" style="cursor:pointer">
							                </td>
							                </tr>
							            </table>
                                        
                                    </td>

                                </tr>

                                <tr>
                                    <td>
                                        <table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                                            <tr>
                                                <td colspan="6" height="26" align="left"  class="sub_table_b">&nbsp;* 부과 정보</td>
                                            </tr>
                                            <tr>
                                                <td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">과세구분</td>
                                                <td bgcolor="eaeaea" class="table_bl_left" align="left">
                                                    <select name="TAX_GUBUN" id="TAX_GUBUN" class="essential" style="width:100px" onChange="taxGubunCheck();">
                                                        ${taxation_part}
                                                    </select>
                                                </td>
                                                <td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">세목코드</td>
                                                <td bgcolor="eaeaea" class="table_bl_left" colspan="3" align="left">
                                                    <select name="TAX_CD" id="TAX_CD" class="essential" style="width:220px"  OnChange="SemokInfo();">
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
                                    <td height="40" align="right">
                                <c:if test="${SECTION != '4'}">
                                    <img src="/img/can_icon.gif" alt="취소" border="0" onclick="javascript:history.back();" style="cursor:pointer" >
                                    <c:if test="${existOwner == 'false'}">
                                    	<img src="/img/save_icon2.gif" alt="저장" width="56" height="18" border="0" onClick="alert('운영자 정보가 부족합니다. 운영자 정보에서 부족한 정보를 추가해 주세요.');"  style="cursor:pointer">
                                    </c:if>
                                    <c:if test="${existOwner == 'true'}">
                                    	<img src="/img/save_icon2.gif" alt="저장" width="56" height="18" border="0" onClick="javascript:submitClick();"  style="cursor:pointer">
                                    </c:if>
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

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            