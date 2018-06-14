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

}
-->
</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
<script language="javascript" src="/js/PopupCalendar.js"></script> 
<script language="javascript" src="/js/Ajax_request.js"></script>
<script>

	function	Page(page)
	{
		if(page	==	"")
			return;
		
		var form = document.productForm;
		form.currentPage.value	= page;
		form.action = "/jumyong/junggi/junggi_view.do";
		form.submit();
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
	
	
	
	//view 화면 이동
	function goView(adminNo,sum_seq,seq,currentPage,countPage,year,usesection,modeCheck)
	{
		if( modeCheck == '0' ){
			//location.href("/jumyong/junggi/junggi_view.do?ADMIN_NO="+adminNo+"&seq="+seq+"&sum_seq="+sum_seq+"&currentPage="+currentPage+"&year="+year+"&usesectoin="+usesection);
			location.href("/jumyong/junggi/junggi_product.do?ADMIN_NO="+adminNo+"&SEQ="+seq+"&sum_seq="+sum_seq+"&currentPage="+currentPage+"&year="+year+"&mode=add");
		}
		else{
			location.href("/jumyong/junggi/junggi_view.do?ADMIN_NO="+adminNo+"&seq="+seq+"&sum_seq="+sum_seq+"&currentPage="+currentPage+"&year="+year+"&usesectoin="+usesection);
		}
	}
	

	
	 function openwin(){
	 
		var year = document.getElementById("year1").value;
		
		year = Number(year)- Number(1);
		

	 
	 	var x= "dialogwidth:700px;dialogHeight:600px;status:no;help:no";
  
		window.showModalDialog("/jumyong/junggi/productAddList.do?ADMIN_NO=${ADMIN_NO}&year="+year+"&gourl="+"/jumyong/junggi/productAddList.do", window,x);
			
    }
	
	
	//edit 화면 이동
	function goModify(adminNo,seq,currentPage,countPage,year,mode,cnt,sum_seq)
	{
		
		if( mode == 'add' ){
			if( document.productForm.YEAR.value > '${yearAdd}' ){
				alert("정기분 산출은 다음년도만 부과 가능합니다. 확인해주세요. ");			
				return;
			}
		}
		if( mode == 'edit' ){
			if( document.productForm.TAX_YN.value == '1' ) {
				alert("이미 부과된 정기분은 수정 불가합니다. 확인해주세요.");
				return;
			}
		}
		if( cnt < 2){
			location.href("/jumyong/junggi/junggi_product.do?ADMIN_NO="+adminNo+"&SEQ="+seq+"&currentPage="+currentPage+"&year="+year+"&mode="+mode+"&sum_seq="+sum_seq);
		}
		// 여러개일 경우 
		else{
			location.href("/jumyong/junggi/junggi_product.do?ADMIN_NO="+adminNo+"&SEQ="+seq+"&currentPage="+currentPage+"&year="+year+"&mode="+mode+"&sum_seq="+sum_seq);
			//location.href("/jumyong/junggi/junggi_product_multi.do?ADMIN_NO="+adminNo+"&SEQ="+seq+"&currentPage="+currentPage+"&year="+year+"&mode="+mode);
		}
	}
	
	function goTempInsert()
	{
	
		var admin_no = document.getElementById("ADMIN_NO").value;
		
		var year = document.getElementById("YEAR").value;
		if(year == '')
			alert("연도를 넣어주세요");
		else
		 	location.href("/jumyong/junggi/product_temp_insert.do?admin_no="+admin_no+"&year="+year);	
		
	}
	
	
</script>

</head>

<body onload="javascript:InitPage();"  border="0">


<form id="productForm" name="productForm" method="post" action = "/jumyong/junggi/junggi_view.do" >
<input type="hidden" id="message" name="message" value="${message}">
<input id="mode" name="mode"  value="${mode}" type="hidden" >						
<input id="ADMIN_NO" name="ADMIN_NO" value="${ADMIN_NO}" type="hidden" >
<input id="SEQ" name="SEQ"  value="${seq}" type="hidden" >
<input id="RATE1" name="RATE1" type="hidden"  value="" >
<input id="YEAR" name="YEAR" value="${product.YEAR}" type="hidden" >
<input id="TAX_YN" name="TAX_YN" type="hidden" value="${product.TAX_YN }">
<input id="currentPage" name="currentPage" type="hidden" value="${currentPage}">
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
											<td width="10%" height="26" align="left"  class="sub_table_b">* 산출 정보 리스트</td>
										</tr>
									</table>
								</td>
							</tr>
							<tr>
								<td>
							    	<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
							        	<tr>
							            	<td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">산출년도</td>
							                <td align="center" bgcolor="e5eff8" class="sub_table_b">면적</td>
							                <td align="center" bgcolor="e5eff8" class="sub_table_b">조정 ${PRICE_NAME}</td>
							                <td align="center" bgcolor="e5eff8" class="sub_table_b">최종 ${PRICE_NAME}</td>
							                <td align="center" bgcolor="e5eff8" class="sub_table_b">지분율 </td>
							                <td align="center" bgcolor="e5eff8" class="sub_table_b">감면율 </td>
							                <td align="center" bgcolor="e5eff8" class="sub_table_b"> 세입구분 </td>
							                <td align="center" bgcolor="e5eff8" class="sub_table_b"> 과세 구분 </td>							                    							                    
							            </tr>
							                    
							                    
							            <c:forEach items="${cal_sum_infoList}" var="board" varStatus="idx">
							                  
								        <c:choose>
										<c:when test="${board.SEQ != sum_seq }">
										<tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" 
							                onclick="javascript:goView('${ADMIN_NO}','${board.SEQ}','','${currentPage}','${countPerPage}','${board.YEAR}','${board.USE_SECTION}','${board.SUM_ADJUST }');" style="cursor:pointer" >
										</c:when>
										<c:otherwise>
										<tr onclick="javascript:goView('${ADMIN_NO}','${board.SEQ}','','${currentPage}','${countPerPage}','${board.YEAR}','${board.USE_SECTION}','${board.SUM_ADJUST }');" bgcolor="#f6f7f8">
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
							                        	${pageing}
							                        </tr>							                        
							                    </table>
							                </td>
	
										</tr>
							   		</table>
							   	</td>
							</tr>
							<tr>
								<td>
							    	<table width="100%" border="0"  cellpadding="0" cellspacing="0"  class="sub_table">
										<tr>
											<td width="10%" height="26" align="left"  class="sub_table_b">* 년도별 산출 내역</td>		
										</tr>
									</table>	
								</td>
							</tr>
							<tr>
								<td>
							    	<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
							        	<tr>
<!--							            	<td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">산출년도</td>-->
						                    <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">면적</td>
						                    <td align="center" bgcolor="e5eff8" class="sub_table_b">요율(단가)</td>
						                    <td align="center" bgcolor="e5eff8" class="sub_table_b">산출기간</td>
						                    <td align="center" bgcolor="e5eff8" class="sub_table_b">전년 연간 ${PRICE_NAME}</td>
						                    <td align="center" bgcolor="e5eff8" class="sub_table_b">현년도 ${PRICE_NAME}</td>
						                    <td align="center" bgcolor="e5eff8" class="sub_table_b">조정 ${PRICE_NAME}</td>
						                    <td align="center" bgcolor="e5eff8" class="sub_table_b">부과 여부 </td>
					                    </tr>
							                    
							                    
							         	<c:forEach items="${ImpositionInfoByCalSumList}" var="board" varStatus="idx">
							                        
							         	<c:choose>
										<c:when test="${board.SEQ != seq }">
										<tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" 
							            	onclick="javascript:goView('${ADMIN_NO}','${sum_seq}',${board.SEQ},'${currentPage}','${countPerPage}','${board.YEAR}','${board.USE_SECTION}','${board.SUM_ADJUST }');" style="cursor:pointer" >
										</c:when>
										<c:otherwise>
										<tr onclick="javascript:goView('${ADMIN_NO}','${sum_seq}',${board.SEQ},'${currentPage}','${countPerPage}','${board.YEAR}','${board.USE_SECTION}','${board.SUM_ADJUST }');" bgcolor="#f6f7f8">
										</c:otherwise>
										</c:choose>
							                        
<!--					                        <td height="26" align="center">${board.YEAR}</td>-->
					                        <td height="26" align="center">${board.AREA_AFTER}</td>
					                        <td align="center">
					                        	<c:choose>
												<c:when test="${product.CHECK_YN == '1'}">
													${rnic:insertComma2(product.MOMEY)}
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
					                       
					                        <!--<c:if test="${board.CAL_STATUS == null}">
					                        	미산출
								            </c:if>	
					                        <c:if test="${board.CAL_STATUS != null}">
					                        	산출
								            </c:if>	-->
										            
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
						    		</table>
						    	</td>
							</tr>
							              
						</table>	
										
						<div id="view" style="width:100%;">
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
							            	<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">산출년도</td>
							            	<td width="42%" bgcolor="eaeaea" class="table_bl_left" >${product.YEAR} 년</td>
							                    		
				                    		<c:choose>
											<c:when test="${product.CHECK_YN != '1'}">
												<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">공시지가</td>
				                    			<td width="32%" bgcolor="eaeaea" class="table_bl_left" >${rnic:insertComma2(product.PRICE)} 원 </td>
											</c:when>
											<c:otherwise>
												<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b"></td>
												<td width="32%" bgcolor="eaeaea" class="table_bl_left" ></td>
											</c:otherwise>
											</c:choose>
														 
				                  		</tr>
				                  		<tr>
				                    		<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용면적</td>
				                    		<td bgcolor="eaeaea" class="table_bl_left" >${product.AREA_AFTER}㎡
											</td>                     
											<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">요율(단가)</td>
				                    		<td bgcolor="eaeaea" class="table_bl_left" >
				                    			<c:choose>
												<c:when test="${product.CHECK_YN == '1'}">
													${rnic:insertComma2(product.MOMEY)}
												</c:when>
												<c:otherwise>
													${product.YOYUL}
												</c:otherwise>
												</c:choose>
											</td> 
				                  		</tr>                   
				                  
										<tr>
				                    		<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">산출 기간</td>
				                    		<td bgcolor="eaeaea" class="table_bl_left">
				                    			<table border="0" cellpadding="0" cellspacing="0" class="sub_stan" >
				
					                        		<tr>
					                          			<td width="60">
						                          			${rnic:addDash(product.FROMDATE)}
						                          		</td>
						                          		<td width="50" align="center">~</td>
						                          		<td width="150">
							                          		${rnic:addDash(product.TODATE)}
						                          		</td>
						                        	</tr>
						                    	</table>
					                    	</td>  
					                    	<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">전년 조정 ${PRICE_NAME}</td>
					                    	<td bgcolor="eaeaea" class="table_bl_left" >
				                     		${rnic:insertComma2(product.SUM_LASTYEAR)} 원
				                     		</td>
					                    		
					                 		
				                  		</tr>
				
								  		<tr>
								  			<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">조정 계수</td>
					                    	<td bgcolor="eaeaea" class="table_bl_left" colspan="3">${product.ADJUSTMENT}
											</td>
					                  	</tr>
				                  
				                  		<tr>
											<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">부과일자</td>
						                    <td bgcolor="eaeaea" class="table_bl_left" >${product.TAX_DATE} 
											</td>
											<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">납기내기한</td>
					                    	<td bgcolor="eaeaea" class="table_bl_left" >${product.INDATE}
											</td>
										</tr>
										<tr>
											<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">납기후일자</td>
				                    		<td bgcolor="eaeaea" class="table_bl_left" >${product.OVERDATE}
											</td>
											<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">납기후금액</td>
			                    			<td bgcolor="eaeaea" class="table_bl_left" >${rnic:insertComma2(product.OVERTAX)} 원
											</td>
								  		</tr>
				                 	 	<c:if test="${product.SECTION == '3'}">
						             	<tr>
						             		<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">과징율</td>
						                    <td bgcolor="eaeaea" class="table_bl_left" colspan="3">${product.SURCHARGE_RATE }
						                    </td>
						             	</tr>
						             	</c:if>
				                   		<tr>
				                    		<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">기본 산출식</td>
				                    		<td bgcolor="eaeaea" class="table_bl_left" > ${product.FORM}
											</td>
											<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">현년도 ${PRICE_NAME}</td>
						                    <td bgcolor="eaeaea" class="table_bl_left" >
						                    ${rnic:insertComma2(product.SUM_YEAR)} 원
											</td>
				                  		</tr> 
				                  
				                  		<tr>
					                		<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">조정 산출식</td>
				                    		<td bgcolor="eaeaea" class="table_bl_left" >${product.FORM_ADJUST}
											</td> 
											<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">조정 ${PRICE_NAME}</td>
			                    			<td bgcolor="eaeaea" class="table_bl_left" >${rnic:insertComma2(product.SUM_ADJUST)} 원
											</td>
				                  		</tr>
				                  		<tr>	
				                  			<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">지분율 사유</td>
						                    <td bgcolor="eaeaea" class="table_bl_left">${product.OLD_PERCENT_REASON}
											</td>
						                  	<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">지분율 (%)</td>
						                    <td bgcolor="eaeaea" class="table_bl_left">
						                    	<c:if test="${product.OLD_PERCENT_RATE != '0' }">${product.OLD_PERCENT_RATE}</c:if>
											</td>
				                  	 	</tr>
				                  		<tr>	
				                  			<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">감면율 사유</td>
						                    <td bgcolor="eaeaea" class="table_bl_left">${product.OLD_REDUCTION_REASON}
											</td>
						                  	<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">감면율 (%)</td>
						                    <td bgcolor="eaeaea" class="table_bl_left">
						                    	<c:if test="${product.OLD_REDUCTION_RATE != '0' }">${product.OLD_REDUCTION_RATE}</c:if>
											</td>
				                  	 	</tr>
				                  	 	
				                  	 	<tr>
										    <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">최종 산출식</td>
										    <td bgcolor="eaeaea" class="table_bl_left" >${product.REDUCTION_FORM}
										    </td> 
										
										    <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">최종 ${PRICE_NAME}</td>
										    <td bgcolor="eaeaea" class="table_bl_left" >${rnic:insertComma2(product.REDUCTION_SUM)} 원
										    </td> 
										</tr>
										<tr>
											<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b"></td>
			                    			<td bgcolor="eaeaea" class="table_bl_left" ></td>
											<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">부가가치세</td>
			                    			<td bgcolor="eaeaea" class="table_bl_left" >${rnic:insertComma2(product.VAT)} 원
											</td>
										
										</tr> 
			                		</table>
			                	</td>
							</tr>
				            
							<tr>              
				            	<td height="40" align="right">
					                <table border="0" width="100%">
					                	<tr>								                		
							            	<td width="100%" align="right">
							                	<c:if test="${product.TAX_GUBUN == '1'}">
				                        		<img src="/img/mod_icon5.gif" alt="수정" width="66" height="22" border="0" onclick="javascript:goModify('${ADMIN_NO}','${seq}','${currentPage}','${countPerPage}','${product.YEAR}','edit','${listSize }','${sum_seq }');" style="cursor:pointer" >
							            		</c:if>
											</td>
											<td>													
												<img src="/img/junggibun_calculation.gif" alt="정기분 산출" width="84" height="22" border="0" onclick="javascript:goModify('${ADMIN_NO}','${seq}','${currentPage}','${countPerPage}','${year}','add','${listSize }','${sum_seq }');" style="cursor:pointer">
											</td>
					                	</tr>
					             	</table>
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
		
<script language="javascript">
	function InitPage()
	{
		var obj = document.productForm.message.value;
		
		if(obj != "")	
			alert(obj);
			return;
	}
</script>

</html>            
