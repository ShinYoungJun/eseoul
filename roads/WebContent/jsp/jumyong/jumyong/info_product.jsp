<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/loginCheck.jsp" %>
<%@ include file="/jsp/common/include.jsp" %>    
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
        <script>
            var savable = 0;
            var savable_v = 0;
            function InitPage()
            {

                if(document.getElementById("CK_DEL").value == 'true'){
                    location.href = "/jumyong/productInsert.do?no=${no}";
                }


		
                setParentYear('${product.YEAR}');
                var check_yn ="${product.CHECK_YN}";
                parent.document.getElementById("SEQ").value = document.getElementById("SEQ").value;
		
                if(document.getElementById("mode").value == "edit" || document.getElementById("mode").value == "add"  )
                {
                    document.getElementById("view").style.display = "none";
						
                    document.getElementById("edit").style.display= "block";
                    document.getElementById("edit").style.pixelTop = 0;

                    if(check_yn=="1"){	
                        document.getElementById("price_view3").style.display="none";
                    }
			
                    if(document.getElementById("mode").value == "add")
                    {
                        var date = new Date();
                        var year = date.getFullYear();	
                        document.getElementById("YEAR").value = year;
                    }
			
                }else
                {
                    document.getElementById("edit").style.display = "none";
                    document.getElementById("view").style.display = "block";
                    if(check_yn=="1"){	
                        document.getElementById("price_view3").style.display="none";
                    }
                }

                if(check_yn=="1"){	
                    document.getElementById("price_img").style.display="none";
                    document.getElementById("PRICE").value="1";		//단가쪽에 공시지가가 표시되기 때문에 공시지가는 1로 표시	
                    document.getElementById("price_view2").style.display="none";
                    document.getElementById("price_view3").style.display="none";
                }
		
                var cal_type = "${product.FORM}";		//월단위 계산인지 일단위 계산인지 여부 알아내기
                for(var i=1;i<cal_type.length;i++){
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
            }


            function submitClick()
            {
                var check_yn ="${product.CHECK_YN}";

                var form =  document.getElementById("FORM").value;

                for(var i=1;i<form.length+1;i++){
                    if(form.substring(i-1,i)=="일"){
                        if(document.getElementById("date_type").value=="month"){
                            alert("산출이 일수로 되어있지만 기준은 개월수로 되어 있습니다.");
                            return;
                        }
                    }		
                    if(form.substring(i-1,i)=="월"){
                        if(document.getElementById("date_type").value=="day"){
                            alert("산출이 개월수로 되어있지만 기준은 일수로 되어 있습니다.");
                            return;
                        }
                    }	
                }
		
                // 수정일때는 산출내역 계산여부 체크 안하도록..
                if(document.getElementById("mode").value == "edit"){
                    savable_v = 4;
                }
		
                if(check_yn == "1"){
                    if(savable_v == 3 || savable_v == 4){
                        var productForm = document.productForm;
		
                        //comma제거
                        removeComma2("PRICE");
                        removeComma2("SUM_LASTYEAR");
                        removeComma2("SUM_YEAR");
                        removeComma2("SUM_ADJUST");
                        removeComma2("REDUCTION_SUM");
				
		
                        productForm.submit();
                    }else {
                        alert("산출 내역을 먼저 계산해 주십시오.");
                        return;
                    }
                }else if(savable_v == 4){
                    var productForm = document.productForm;
			
                    //comma제거
                    removeComma2("PRICE");
                    removeComma2("SUM_LASTYEAR");
                    removeComma2("SUM_YEAR");
                    removeComma2("SUM_ADJUST");
                    removeComma2("REDUCTION_SUM");
	
                    productForm.submit();
                }else {
                    alert("산출 내역을 먼저 계산해 주십시오.");
                    return;
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
                        +"&mode=del&year="+year+"&seq="+seq+"&section=${section}"+"&TYPE="+document.getElementById("TYPE").value;
                }

            }
            
            function Calculate()
            {
                savable = 0;
                
                var check_yn ="${product.CHECK_YN}";
                var area_after = document.getElementById("AREA_AFTER").value;
                var rate = document.getElementById("RATE").value;
                var price = removeComma(document.getElementById("PRICE").value);
                var type = document.getElementById("TYPE").value;
	    
                if(check_yn!="1"){
                    if(price=="0" || price==""){
                        alert("공시지가를 넣으세요.");
                        document.getElementById("PRICE").focus();
                        document.getElementById("saveCheck").value="0";
                        return;
                    }
                }
                
                savable++;		//각 점검을 지날때마다 savable에 +1을 해준다.
                
                if(Number(area_after)==0 || area_after==""){
                    alert("점용면적을 넣어주세요.");
                    document.getElementById("AREA_AFTER").focus();
                    document.getElementById("saveCheck").value="0";
                    return;
                }
                
                savable++;
                
                if(area_after.substring(area_after.indexOf(".")+1, area_after.indexOf(".")+5).length>3){
                    alert("점용면적을 소수점 3자리까지 표기 해 주세요");
                    document.getElementById("AREA_AFTER").focus();
                    document.getElementById("saveCheck").value="0";
                    return;
                }
                
                savable++;
                
                if(document.getElementById("PERIOD").value=="0" || document.getElementById("PERIOD").value==""){
                    document.getElementById("saveCheck").value="0";			
                    if(document.getElementById("FROMDATE").value=="" || trim(document.getElementById("FROMDATE").value)==""){
                        alert("산출 시작일을 설정해 주세요.");
                        document.getElementById("saveCheck").value="0";
                        return;
                    }
                    if(document.getElementById("TODATE").value=="" || trim(document.getElementById("TODATE").value)==""){
                        alert("산출 종료일을 설정해 주세요.");
                        document.getElementById("saveCheck").value="0";
                        return;
                    }
                    if(confirm("개월수를 넣지 않았습니다. 개월수를 자동 계산하시겠습니까?")){
                        calDate();
                    }
                }
                
                savable++;
                
                var period = document.getElementById("PERIOD").value;
                if(document.getElementById("date_type").value=="month"){
			   
                    var sum_year = Math.floor(fixFloatCal(parseFloat(area_after)*(parseFloat(period)/12)*parseFloat(rate)*parseFloat(price)));

                    if(check_yn!="1"){	
                        document.getElementById("FORM").value = area_after+"㎡ X " + period + "/12개월 X " +rate +" X " +insertComma2(price);
                    }else{
                        document.getElementById("FORM").value = area_after+"㎡ X " + period + "/12개월 X " +rate;
                    }
			
                }else if(document.getElementById("date_type").value=="day"){
		    
                    var leafYear = f_leapyear(document.getElementById("YEAR").value);
                    var sum_year = Math.floor(fixFloatCal(parseFloat(area_after)*(parseFloat(period)/(365+leafYear))*parseFloat(rate)*parseFloat(price)));

                    if(check_yn!="1"){	
                        document.getElementById("FORM").value = area_after+"㎡ X " + period + "/"+Number(365+leafYear)+"일 X " +rate +" X " +insertComma2(price);
                    }else{
                        document.getElementById("FORM").value = area_after+"㎡ X " + period + "/"+Number(365+leafYear)+"일 X " +rate;
                    }
                }

        		if(type == '1'){	// type == "1" 도로
					var gongyu = "${gongyu_yn}";

					if(gongyu == "0") {	// 공유재산물품관리법은 10원 단위 절삭 2014.11.14
						sum_year = parseInt(sum_year/10)*10;		//10원 절삭
					}else{
	        			sum_year = parseInt(sum_year/100)*100;		//100원 절삭
					}
					
        		}else{	// type != "1" 하천, 구거
        			sum_year = parseInt(sum_year/10)*10;		//10원 절삭
        		}
        		
                document.getElementById("SUM_YEAR").value = insertComma2(sum_year);
	   	
		 
              	//조정 계수 및 조정 점용료 계산		
                var sum_lastyear = removeComma(document.getElementById("SUM_LASTYEAR").value);		// 작년도 점용료
                var adjust = 1;
                var sum_adjust;
                
               	var rate1 = Math.floor(((sum_year - sum_lastyear ) / sum_lastyear) *100 ); // 현년도 작년도 점용료 비율
                
               	if(type == '1'){
                    ////// 2015.01.21 공물법 시행령 개정안 반영 
					var gongyu_yn = "${gongyu_yn}";
					if( gongyu_yn == 0 && rate1 >= 5 && rate1 <=3000 && check_yn == '2') {
						// 작년 점용료 대비 현년도 적용료가 100분의 5 이상이면
						// 증가분의 100분의 30을 조정계수로 하여 작년도 점용료와 더한다.
						//var adjust_gongyu_yn = (sum_year - sum_lastyear ) * `;
						var adjust_gongyu = (sum_year - (sum_lastyear + (sum_lastyear * 0.05))) * 0.3;
						adjust = adjust_gongyu;
	
						sum_adjust = Number((sum_lastyear +  (sum_lastyear * 0.05))) + Number(adjust);
                       sum_adjust = parseInt(Math.floor(sum_adjust/10)*10);	//공물법은 10원 절삭
                       
                       document.getElementById("SUM_ADJUST").value = insertComma2(sum_adjust);
                       var sum_lastyear_comma = sum_lastyear + (sum_lastyear * 0.05);
                       sum_lastyear_comma = Math.floor( sum_lastyear_comma / 10 ) * 10 ;
                       var adjust_comma = adjust;
                       document.getElementById("FORM_ADJUST").value = insertComma2(sum_lastyear_comma) + " + "+ insertComma2(adjust_comma.toFixed());
					}else if( rate1 >= 10 && rate1 <=3000 && check_yn == '2')//비율이 허용 범위내에 있을때
                    {	
                        //adjust = calJojung(rate1);
                        // 개정 2012.11.27 제 44조 관련하여 calJojungNew함수를 추가하여 점용료 조정산식을 적용함.
                        //adjust = calJojungNew(rate1);
                        adjust = calJojung2015(rate1); // 시행령69조에의해 수정 #ny(2016.01.)
                        
                        sum_adjust = Number(sum_lastyear)*Number(adjust);
                        sum_adjust = parseInt(Math.floor(sum_adjust/100)*100);
                        
                        document.getElementById("SUM_ADJUST").value = insertComma2(sum_adjust);
                        document.getElementById("FORM_ADJUST").value = sum_lastyear + " X "+ adjust;

                    }else{
                    	sum_adjust = sum_year;
                    	document.getElementById("SUM_ADJUST").value = insertComma2(sum_adjust);
                        document.getElementById("FORM_ADJUST").value = document.getElementById("FORM").value;
                    }
               	}else{  
	               	//********** BEGIN_KANG_20120627
               		//			if( rate1 >= 5 && check_yn == '2'){
               		var sw = false;
               		if( sum_lastyear != 0 && sum_lastyear != '0' && sum_lastyear != "0"){
               			sw = true;
               		}
               		
					if( sw && rate1 >= 5 && check_yn == '2'){

						var gongyu_yn = "${gongyu_yn}";
						var temp = "${product.PURPOSE_CD}";
						var purpose_cd = temp.substring(0, 2);
						//var purpose_cd = "${product.PURPOSE_CD}";
						////// 2015.01.21 공물법 시행령 개정안 반영 
						if( purpose_cd == 01) {
							// 작년 점용료 대비 현년도 적용료가 100분의 5 이상이면
							// 증가분의 100분의 30을 조정계수로 하여 작년도 점용료와 더한다.
							//var adjust_gongyu = (sum_year - sum_lastyear ) * 0.7;
							var adjust_gongyu = (sum_year - (sum_lastyear + (sum_lastyear * 0.05))) * 0.3;
							adjust = adjust_gongyu;

							sum_adjust = Number((sum_lastyear + (sum_lastyear * 0.05))) + Number(adjust);
	                        sum_adjust = parseInt(Math.floor(sum_adjust/10)*10);
	                        
	                        document.getElementById("SUM_ADJUST").value = insertComma2(sum_adjust);
	                        var sum_lastyear_comma = sum_lastyear + (sum_lastyear * 0.05);
	                        sum_lastyear_comma = Math.floor( sum_lastyear_comma / 10 ) * 10 ;
	                        var adjust_comma = adjust;
	                        document.getElementById("FORM_ADJUST").value = insertComma2(sum_lastyear_comma) + " + "+ insertComma2(adjust_comma.toFixed());
						}else{
							//********** END_KANG_20120627
							
							var temp = "${product.PURPOSE_CD}";
							var purpose_cd = temp.substring(0, 2);

							// 공유수면법(하천, 구거)
							/*
							if(purpose_cd == "02" && rate1 >= 10){
	               				
								adjust = calJojungHachun(rate1);

								sum_adjust = Number(sum_lastyear) + Number(sum_lastyear) * adjust;
                sum_adjust = parseInt(Math.floor(sum_adjust/10)*10);

                document.getElementById("SUM_ADJUST").value = insertComma2(sum_adjust);
								document.getElementById("FORM_ADJUST").value = sum_lastyear + " X ( 1 + "+ adjust + " )";
							}else if(rate1 >= 5){
                      adjust = 1.05;
                      
                      sum_adjust = Number(sum_lastyear)*Number(adjust);
                      sum_adjust = parseInt(Math.floor(sum_adjust/10)*10);
                      
                      document.getElementById("SUM_ADJUST").value = insertComma2(sum_adjust);
                      document.getElementById("FORM_ADJUST").value = sum_lastyear + " X "+ adjust;
         			}*/

							//2016_0622 서초구청 민원으로 확인결과 구거의 경우 전년도점용료와 현년도점용료가 10프로 이상 차이날때만 조정계수를 부과
							if(purpose_cd == "02"){
								if(rate1 >= 10){
	               				
									adjust = calJojungHachun(rate1);
	
									sum_adjust = Number(sum_lastyear) + Number(sum_lastyear) * adjust;
		                            sum_adjust = parseInt(Math.floor(sum_adjust/10)*10);
	
                  document.getElementById("SUM_ADJUST").value = insertComma2(sum_adjust);
           				document.getElementById("FORM_ADJUST").value = sum_lastyear + " X ( 1 + "+ adjust + " )";
								}else{
									adjust = 1.00;
		                          
                  //sum_adjust = Number(sum_lastyear)*Number(adjust);		//작년도랑 연산하면 안된다고..서초구청
                  sum_adjust = Number(sum_year)*Number(adjust);
                  sum_adjust = parseInt(Math.floor(sum_adjust/10)*10);
                  
                  document.getElementById("SUM_ADJUST").value = insertComma2(sum_adjust);
                  //document.getElementById("FORM_ADJUST").value = sum_lastyear + " X "+ adjust;
                  document.getElementById("FORM_ADJUST").value = sum_year + " X "+ adjust;
									}
	               			//}else if(rate1 >= 10){
           			}
					
							/*
	                        adjust = 1.05;
	                        
	                        sum_adjust = Number(sum_lastyear)*Number(adjust);
	                        sum_adjust = parseInt(Math.floor(sum_adjust/10)*10);
	                        
	                        document.getElementById("SUM_ADJUST").value = insertComma2(sum_adjust);
	                        document.getElementById("FORM_ADJUST").value = sum_lastyear + " X "+ adjust;
	                        */
						}
               		
               		}else{
               			sum_adjust = sum_year;
                    document.getElementById("SUM_ADJUST").value = insertComma2(sum_adjust);
                    document.getElementById("FORM_ADJUST").value = document.getElementById("FORM").value;
               		}
               		
               	}
               	
               	var temp = "${product.PURPOSE_CD}";
								var purpose_cd = temp.substring(0, 2);
								if(type != '1' && purpose_cd == "02" && rate1 >= 10 ){
									adjust = parseFloat(adjust) + 1;
									adjust = adjust.toFixed(2);
									document.getElementById("ADJUSTMENT").value = adjust;
								}else{
									document.getElementById("ADJUSTMENT").value = adjust;
								}
                
                var percentRate = document.getElementById("PERCENT_RATE").value;
                var reductionRate = document.getElementById("REDUCTION_RATE").value;
                
                if(percentRate == '0.0'){
                	percentRate = '100.0';
                }
                
                
                // 최종 계산
                var reduction_sum = parseFloat(sum_adjust) * ((parseFloat(percentRate))/100) * ((100 - parseFloat(reductionRate))/100);
              	//alert("점용료 절삭 테스트 sum: " + parseFloat(sum_adjust));
                 //부동소수점 오류 수정
                reduction_sum = fixFloatCal(reduction_sum);


        		if(type == '1'){	// type == "1" 도로
					var gongyu = "${gongyu_yn}";

					if(gongyu == "0") {	// 공유재산물품관리법은 10원 단위 절삭 2014.11.14
						reduction_sum = parseInt(reduction_sum/10)*10;		//10원 절삭
					}else{
						reduction_sum = parseInt(reduction_sum/100)*100;		//100원 절삭
					}
					
        		}else{	// type != "1" 하천, 구거
        			//alert("점용료 절삭 테스트1: " + reduction_sum);
					reduction_sum = parseInt(reduction_sum/10)*10;		//10원 절삭
					//alert("점용료 절삭 테스트2: " + reduction_sum);
        		}

        		
                document.getElementById("REDUCTION_SUM").value = insertComma2(reduction_sum);
                var reductionForm = document.getElementById("FORM_ADJUST").value;
                
                if(percentRate != '0.0' && percentRate != '100.0'){
                	reductionForm += " X (("+percentRate+")/100)";
                }
                if(reductionRate != '0.0'){
                	//********** BEGIN_현진_20120320
                	/*
									reductionForm += " X ((1-"+reductionRate+")/100)";
                	*/
                	reductionForm += " X ((100-"+reductionRate+")/100)";
                	//********** END_현진_20120320
                	                    
                	
                }
                
                document.getElementById("REDUCTION_FORM").value = reductionForm;

                document.getElementById("saveCheck").value="1";
		 	
                savable_v = savable;
                savable = 0;
            }
	
            
       
            // 추가 화면 이동
            function goAdd(adminNo,currentPage)
            {
                location.href("/jumyong/productInsert.do?no="+adminNo+"&currentPage="+currentPage+"&mode=add&check_yn=${product.CHECK_YN}");
                //	<a href="/jumyong/productInsert.do?no=${no}&year=${board.YEAR}&currentPage=${currentPage}&countPerPage=${countPerPage}&mode=add&section=${section}">
            }
    
    
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
		
                tab1.src	= "/jumyong/inspectEdit.do?no=" + adminno + "&seq=" + seq;
                tab2.src	= "/jumyong/confEdit.do?no=" + adminno + "&seq=" + seq;
            }
	
	
            function trim(str){

                str = str.replace(/(^\s*)|(\s*$)/g,"");
	
                return str;
	
            }

            function ShowMsgJumjiInsert(obj){

                var target = obj;
                if(target.name == 'AREA_AFTER'){
                    alert("점용면적은 점용지 정보에서 수정하세요.");
                }else if(target.name == 'REDUCTION_RATE'){
                    alert("감면율은 점용지 정보에서 수정하세요.");
                }else if(target.name == 'REDUCTION_REASON'){
                    alert("감면율 사유는 점용지 정보에서 수정하세요.");
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
            <input id="CAL_SUM_SEQ" name="CAL_SUM_SEQ" value="${product.CAL_SUM_SEQ}" type="hidden" >
            <input id="no" name="no" value="${no}" type="hidden" >
            <input id="mode" name="mode" value="${mode}" type="hidden" >
            <input id="SEQ" name="SEQ" value="${seq}" type="hidden" >
            <input id="saveCheck" name="saveCheck" value="0" type="hidden">
            <input id = "SECTION" name="SECTION" value="${section}" type="hidden" >
            <input id="CK_DEL" name="CK_DEL" value="${CK_DEL}" type="hidden">
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
                                            <td align="center" bgcolor="e5eff8" class="sub_table_b">기준연도</td>
                                            <td align="center" bgcolor="e5eff8" class="sub_table_b">공시지가</td>
                                            <td align="center" bgcolor="e5eff8" class="sub_table_b">면적</td>
                                            <td align="center" bgcolor="e5eff8" class="sub_table_b">요율/단가</td>
                                            <td align="center" bgcolor="e5eff8" class="sub_table_b">산출기간</td>
                                            <td align="center" bgcolor="e5eff8" class="sub_table_b">작년도 점용료 </td>
                                            <td align="center" bgcolor="e5eff8" class="sub_table_b">현년도 점용료 </td>
                                            <td align="center" bgcolor="e5eff8" class="sub_table_b">조정 점용료 </td>
                                            <td align="center" bgcolor="e5eff8" class="sub_table_b">최종 점용료 </td>
                                        </tr>
                                        <c:forEach items="${productList}" var="board" varStatus="idx">
                                            <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" 
                                                onclick="javascript:setParentYear('${board.YEAR}');Tab_Src('${no}','${board.SEQ}');location.href('/jumyong/productInsert.do?no=${no}&year=${board.YEAR}&currentPage=${currentPage}&countPerPage=${countPerPage}&year=${board.YEAR}&seq=${board.SEQ}&section=${section}');" style="cursor:pointer" >
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
                                                    <span id="price_view2" style="display:block;">${rnic:insertComma2(product.PRICE)}원 </span>              
                                                </td> 
                                            </tr>
                                            <tr>
                                                <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용면적</td>
                                                <td bgcolor="eaeaea" class="table_bl_left" >
                                                    ${product.AREA_AFTER} m / ㎡ / 개
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
                                                <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">최종 점용료</td>
                                                <td bgcolor="eaeaea" class="table_bl_left" >
                                                    ${rnic:insertComma2(product.REDUCTION_SUM)} 원				
                                                </td> 

                                            </tr> 
                                        </table></td>
                                </tr>

                                <tr>              
                                    <td height="40" align="right">
                                <c:if test="${section != '4'}">
                                    <table border="0" width="100%">
                                        <tr>
                                            <td >
                                                <img src="/img/add_icon.gif" alt="추가" border="0" onclick="goAdd('${no}','${currentPage}')" style="cursor:pointer" >  									                
                                            </td>
                                        <c:if test="${listSize != '0'}">     
                                            <c:if test="${defineTax != 'true'}">
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
                                    <td><input style="float:right; font-size: 10.5px;" class="sub_table_b" type="button" onclick="goLanprice()" value="공시지가조회(서울 부동산정보조회 시스템)">
                                    	<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                                            <tr>
                                                <td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b"  style="direction:rtl" >기준년도</td>
                                                <td width="42%" bgcolor="eaeaea" class="table_bl_left" >
                                                <input id="YEAR" name="YEAR" type="text" value = "${product.YEAR}" style="width:50px;ime-mode:disabled;"  class="input_form1"  onKeyDown="onlyNumberInput();" style="text-align:right">&nbsp년</td>                     
                                    <td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b"><span id="price_view3" style="display:block;">공시지가</span></td>
                                    <td width="32%" bgcolor="eaeaea" class="table_bl_left" >					                       						                   						                   
                                        <table border="0" cellpadding="0" cellspacing="0" class="table_bl_left">
                                            <tr>
                                                <td>
                                                    <span id="price_img" style="display:block;">
                                                    	<input  id="PRICE" name="PRICE" value="${product.PRICE}" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" onkeyup="javascript:fn_addComma(this)"  onKeyDown="onlyNumberInput();" style="text-align:right">원	 
                                                    	<img src="/img/landPrice.gif" alt="공시지가조회" height="18" border="0" style="cursor:pointer" onclick="javascript:openLandPricePopUp()"; align="absmiddle">
                                                    </span>
                                                </td>
                                            </tr>
                                        </table>
                                    </td> 
                                </tr> 



                                <tr>
                                    <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b"  >점용면적</td>
                                    <td bgcolor="eaeaea" class="table_bl_left" ><input id="AREA_AFTER" name="AREA_AFTER" type="text" class="essential" style="width:50px;ime-mode:disabled;" value="${product.AREA_AFTER}"   onfocus="javascript:ShowMsgJumjiInsert(this)" style="text-align:right" readonly="readonly">m / ㎡ / 개</td>                     
                                <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">요율/단가</td>
                                <td bgcolor="eaeaea" class="table_bl_left" ><input id="RATE" name="RATE" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value="${product.RATE}"  onKeyDown="onlyNumberInput();" style="text-align:right"></td> 
                                </tr>                   


                                <tr>
                                    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">산출기간</td>
                                    <td bgcolor="eaeaea" class="table_bl_left" >
                                    	<input id="FROMDATE" name="FROMDATE" type="text" class="input_form1" style="width:60px;ime-mode:disabled;" value="${product.FROMDATE}"  onKeyDown="onlyNumberInput();"   onKeyDown="onlyNumberInput();" maxlength=8>
                                    	<img src="/img/calendar_icon.gif" onclick="popUpCalendar(this, document.getElementById('FROMDATE'), 'yyyymmdd');" style="vertical-align:middle;cursor:pointer" >
			                            &nbsp;~&nbsp;
			                            <input id="TODATE" name="TODATE" type="text" class="input_form1" style="width:60px;ime-mode:disabled;" value="${product.TODATE}"  onKeyDown="onlyNumberInput();" maxlength=8>
			                            <img src="/img/calendar_icon.gif" onclick="popUpCalendar(this, document.getElementById('TODATE'), 'yyyymmdd');" style="vertical-align:middle;cursor:pointer" >
			                            <img src="/img/cal_month.gif" alt="달수계산" height="18" border="0" style="vertical-align:middle;cursor:pointer" onClick="javascript:calDate();">
                            		</td>

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
        	<td colspan="4" height="24" align="right" bgcolor="e5eff8"><a style="font-weight: bold;">↓작년도 조정점용료를 입력한 뒤 계산 해 주세요.</a></td>
        </tr>
        <tr>
            <td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">조정 계수</td>
            <td width="42%" bgcolor="eaeaea" class="table_bl_left" >
            <input name="ADJUSTMENT" id="ADJUSTMENT" type="text" class="input_form1" style="width:120px;ime-mode:disabled;" value="${product.ADJUSTMENT}"   onKeyDown="onlyNumberInput();" style="text-align:right">
        </td>                     
        <td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">작년도 점용료</td>
        <td width="32%" bgcolor="eaeaea" class="table_bl_left" >
    <spring:bind path="product.SUM_LASTYEAR">
        <input name="SUM_LASTYEAR" id="SUM_LASTYEAR" type="text"  class="input_form1" style="width:80px;ime-mode:disabled;" value="${product.SUM_LASTYEAR}"   onKeyDown="onlyNumberInput();" onkeyup="javascript:fn_addComma(this)" style="text-align:right">원
        <br><a style="font-size: 11px;">(작년도 조정점용료를 직접 입력해 주세요.)</a></br>
    </spring:bind>
</td>  


</tr>  



<tr>
    <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">기본 산출식</td>
    <td bgcolor="eaeaea" class="table_bl_left" >
<spring:bind path="product.FORM">                                        
    <input name="FORM" ID="FORM" type="text" class="input_form1" style="width:300px" value="${product.FORM}">
</spring:bind>
</td>
<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">현년도 점용료</td>
<td width="32%" bgcolor="eaeaea" class="table_bl_left" >
    <input name="SUM_YEAR" id="SUM_YEAR" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value="${rnic:insertComma2(product.SUM_YEAR)}"   onKeyDown="onlyNumberInput();" onkeyup="javascript:fn_addComma(this)" style="text-align:right">원
</td>                   


</tr> 

<tr>
    <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">조정 산출식</td>
    <td bgcolor="eaeaea" class="table_bl_left" >
<spring:bind path="product.FORM_ADJUST">                                                            
    <input name="FORM_ADJUST" id="FORM_ADJUST" type="text" class="input_form1" style="width:300px" value="${product.FORM_ADJUST}">
</spring:bind>
</td> 

<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">조정 점용료</td>
<td bgcolor="eaeaea" class="table_bl_left" >
<spring:bind path="product.SUM_ADJUST">                    
    <input name="SUM_ADJUST" id="SUM_ADJUST" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value="${rnic:insertComma2(product.SUM_ADJUST)}"  onKeyDown="onlyNumberInput();" onkeyup="javascript:fn_addComma(this)" style="text-align:right">원
</spring:bind>
</td> 
</tr>
<tr>
    <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">지분율 사유</td>
    <td bgcolor="eaeaea" class="table_bl_left" >
        <input name="PERCENT_REASON" id="PERCENT_REASON" type="text" class="essential" style="width:300px" value="${product.PERCENT_REASON}" onfocus="javascript:ShowMsgJumjiInsert(this)" readonly="readonly">
    </td> 
    
    <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">지분율</td>
    <td bgcolor="eaeaea" class="table_bl_left" >
        <input name="PERCENT_RATE" id="PERCENT_RATE" type="text" class="essential" style="width:50px;text-align:right" value="${product.PERCENT_RATE}" onfocus="javascript:ShowMsgJumjiInsert(this)" readonly="readonly">%
    </td> 
</tr>
<tr>
    <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">감면율 사유</td>
    <td bgcolor="eaeaea" class="table_bl_left" >
        <input name="REDUCTION_REASON" id="REDUCTION_REASON" type="text" class="essential" style="width:300px" value="${product.REDUCTION_REASON}" onfocus="javascript:ShowMsgJumjiInsert(this)" readonly="readonly">
    </td> 
    
    <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">감면율</td>
    <td bgcolor="eaeaea" class="table_bl_left" >
        <input name="REDUCTION_RATE" id="REDUCTION_RATE" type="text" class="essential" style="width:50px;text-align:right" value="${product.REDUCTION_RATE}" onfocus="javascript:ShowMsgJumjiInsert(this)" readonly="readonly">%
    </td> 
</tr>

<tr>
    <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">최종 산출식</td>
    <td bgcolor="eaeaea" class="table_bl_left" >
        <input name="REDUCTION_FORM" id="REDUCTION_FORM" type="text" class="input_form1" style="width:300px" value="${product.REDUCTION_FORM}">
    </td> 

    <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">최종 점용료</td>
    <td bgcolor="eaeaea" class="table_bl_left" >
        <input name="REDUCTION_SUM" id="REDUCTION_SUM" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value="${rnic:insertComma2(product.REDUCTION_SUM)}" onKeyDown="onlyNumberInput();" onkeyup="javascript:fn_addComma(this)" style="text-align:right" >원
    </td> 
</tr>  
</table></td>
</tr>

<tr>              
    <td height="40" align="right">
<c:if test="${section != '4'}">
    <img src="/img/can_icon.gif" alt="취소" border="0" onclick="javascript:history.back();" style="cursor:pointer" >
    <img src="/img/save_icon2.gif" alt="저장" width="56" height="18" border="0"
         onClick="javascript:submitClick();"  style="cursor:pointer">
</c:if>
</td>
</tr>
</table>	</div>


</td>
</tr>
<tr>
    <td height="10">
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

<script>
    parent.document.getElementById('GONGSI_PRICE').value = '${rnic:insertComma2(product.PRICE)}';
</script>