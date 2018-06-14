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
<!--	
	

	function InitPage()
	{
		var obj = document.productForm.message.value;
		
		if(obj != "")	
			alert(obj);
			return;
	}
	
	function	Page(page)
	{
		if(page	==	"")
			return;
		
		var form = document.productForm;
		
		var gapan_no = document.getElementById("gapan_no").value;
		var year = document.getElementById("YEAR").value;
		var mode = document.getElementById("mode").value;
		
		//form.currentPage.value	= page;
		//form.action = "search.do";
		//form.submit();
		location.href="junggi_view.do?currentPage="+page+"&gapan_no="+gapan_no+"&year="+year+"&mode="+mode;
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
	function goView(gapan_no,cal_sum_seq,seq,currentPage,countPage,year,usesection)
	{
		location.href("/gapan/junggi/junggi_view.do?gapan_no="+gapan_no+"&seq="+seq+"&cal_sum_seq="+cal_sum_seq+"&currentPage="+currentPage+"&year="+year+"&usesectoin="+usesection);
		
	}
	

	//edit 화면 이동
	function goModify(gapan_no,seq,currentPage,countPage,year,mode)
	{
		if( mode == 'add' ){
			if( document.productForm.YEAR.value >= '${yearAdd}' ){
				alert("정기분 산출된 자료입니다. 산출된 정보는 수정만 가능합니다. ");			
				return;
			}
		}
		if( mode == 'edit' ){
			if( document.productForm.TAX_YN.value == '1' ) {
				alert("이미 부과된 정기분은 수정 불가합니다. 확인해주세요.");
				return;
			}
		}
		location.href("/gapan/junggi/junggi_product.do?gapan_no="+gapan_no+"&seq="+seq+"&currentPage="+currentPage+"&year="+year+"&mode="+mode);
	}
	
	
	function goTempInsert()
	{
	
		var admin_no = document.getElementById("ADMIN_NO").value;
		
		var year = document.getElementById("YEAR").value;
		if(year == '')
			alert("연도를 넣어주세요");
		else
		 	location.href("junggi/product_temp_insert.do?admin_no="+admin_no+"&year="+year);	
		
		//alert("/facility/junggi/product_temp_insert.do?gu_code="+gu_code+"&corp_cd="+corp_cd+"&year="+year);
		
	
	

//		location.href("/facility/junggi/product_temp_insert.do?gu_code="+gu_code+"&corp_cd="+corp_cd+"&year="+year);
		//alert("!111");
	}
	
	-->
	
</script>

</head>

<body onload="javascript:InitPage();"  border="0">



<form name="productForm" id="productForm" method="post" action = "junggi/junggi_view.do" >
						
<spring:bind path="product.GAPAN_NO">
	<input name="gapan_no" id="gapan_no" value="${gapan_no}" type="hidden" >
</spring:bind>
<input name="mode"  id = "mode" value="${mode}" type="hidden" >

<spring:bind path="product.SEQ">
	<input name="CSEQ"  id = "SEQ" value="${seq}" type="hidden" >
</spring:bind>
<input name="RATE1" id = "RATE1" type="hidden"  value="" >
<spring:bind path="product.YEAR">
	<input name="YEAR"  id = "YEAR" value="${product.YEAR}" type="hidden" >
</spring:bind>
<input type="hidden" name="TAX_YN" value="${product.TAX_YN }">
<input type="hidden" name="use_section" value="${product.USE_SECTION }">
<input type="hidden" name="message" value="${message }">

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
							            	<td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">부과년도</td>
							                <td align="center" bgcolor="e5eff8" class="sub_table_b">면적</td>
							                <td align="center" bgcolor="e5eff8" class="sub_table_b">일반 점용료</br>(감면 미적용) </td>							                    
							                <td align="center" bgcolor="e5eff8" class="sub_table_b">조정 점용료 </br>(감면 적용)</td>
							                <td align="center" bgcolor="e5eff8" class="sub_table_b"> 감면율 </td>
							                <td align="center" bgcolor="e5eff8" class="sub_table_b"> 세입구분 </td>
							                <td align="center" bgcolor="e5eff8" class="sub_table_b"> 과세 구분 </td>							                    							                    
							            </tr>
							                    
							                    
										<c:forEach items="${cal_sum_infoList}" var="board" varStatus="idx">
										
										
										<c:choose>
										<c:when test="${board.SEQ != cal_sum_seq }">
											<tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" 
						                	onclick="javascript:goView('${gapan_no}','${board.SEQ}','','${currentPage}','${countPerPage}','${board.YEAR}','${board.USE_SECTION}');" style="cursor:pointer" >
										</c:when>
										<c:otherwise>
											<tr onclick="javascript:goView('${gapan_no}','${board.SEQ}','','${currentPage}','${countPerPage}','${board.YEAR}','${board.USE_SECTION}');" bgcolor="#f6f7f8">
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
											<td width="10%" height="26" align="left"  class="sub_table_b">* 년도별 산출 내역</td>		
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
						                    <td align="center" bgcolor="e5eff8" class="sub_table_b">요율</td>
						                    <td align="center" bgcolor="e5eff8" class="sub_table_b">산출기간</td>
						                    <td align="center" bgcolor="e5eff8" class="sub_table_b">전년 연간 점용료 </td>
						                    <td align="center" bgcolor="e5eff8" class="sub_table_b">현년도 점용료 </td>
						                    <td align="center" bgcolor="e5eff8" class="sub_table_b">조정 점용료 </td>
						                    <td align="center" bgcolor="e5eff8" class="sub_table_b">산출 여부 </td>							                    
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
					                        <td align="center"><font color="red">
					                        
					                        <c:if test="${rnic:insertComma2(board.SUM_ADJUST) == '0'}">
					                        	미산출
								            </c:if>	
					                        <c:if test="${rnic:insertComma2(board.SUM_ADJUST) != '0'}">
					                        	산출
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
							                        <!-- 페이징 없음 -->
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
				                    		<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">부과년도</td>
				                    		<td width="42%" bgcolor="eaeaea" class="table_bl_left" >${product.YEAR} 년</td>                     
											<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">공시지가</td>
				                    		<td width="32%" bgcolor="eaeaea" class="table_bl_left" >${rnic:insertComma2(product.PRICE)} 원                
											</td> 
				                  		</tr>
				                  		<tr>
				                    		<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용면적</td>
				                    		<td bgcolor="eaeaea" class="table_bl_left" >${product.AREA_AFTER}㎡
											</td>                     
											<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">산출요율</td>
				                    		<td bgcolor="eaeaea" class="table_bl_left" >${product.RATE}
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
					                 		<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">전년 연간</br>산출 점용료</td>
					                    	<td bgcolor="eaeaea" class="table_bl_left" >
				                     		${rnic:insertComma2(product.SUM_LASTYEAR)} 원
				                  		</tr>
				
								  		<tr>
											</td>  
											<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">현년도 점용료</td>
						                    <td bgcolor="eaeaea" class="table_bl_left" >
						                    ${rnic:insertComma2(product.SUM_YEAR)} 원
			
											</td>
											<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">조정 점용료</td>
			                    			<td bgcolor="eaeaea" class="table_bl_left" >${rnic:insertComma2(product.SUM_ADJUST)} 원
											</td>
								  		</tr>
				
					                  <!-- tr>
					                    <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">조정 계수</td>
					                    <td bgcolor="eaeaea" class="table_bl_left" >${product.ADJUSTMENT}
										</td>                     
					                  </tr-->
					                  	<tr>
					                    	<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">조정 계수</td>
					                    	<td bgcolor="eaeaea" class="table_bl_left">${product.ADJUSTMENT}
											</td>											
											<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">부가가치세</td>
			                    			<td bgcolor="eaeaea" class="table_bl_left" >${rnic:insertComma2(product.VAT)} 원
											</td>
					                  	</tr>
				                  
				                  		<tr>
											<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">부과일자</td>
						                    <td bgcolor="eaeaea" class="table_bl_left" >${rnic:addDash(product.TAX_DATE)}
											</td>
											<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">납기내기한</td>
					                    	<td bgcolor="eaeaea" class="table_bl_left" >${rnic:addDash(product.INDATE)}
											</td>
										</tr>
										<tr>
											<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">납기후일자</td>
				                    		<td bgcolor="eaeaea" class="table_bl_left" >${rnic:addDash(product.OVERDATE)}
											</td>
											<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">납기후금액</td>
			                    			<td bgcolor="eaeaea" class="table_bl_left" >${rnic:insertComma2(product.OVERTAX)} 원
											</td>
								  		</tr>
				                  
				                   		<tr>
				                    		<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">기본 산출식</td>
				                    		<td colspan="3" bgcolor="eaeaea" class="table_bl_left" > ${product.FORM}
											</td>
				                  		</tr> 
				                  
				                  		<tr>
					                		<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">조정 산출식</td>
				                    		<td colspan="3"  bgcolor="eaeaea" class="table_bl_left" >${product.FORM_ADJUST}
											</td> 
				                  		</tr>
				                  		<tr>	
						                  	<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">감면율 (%)</td>
						                    <td width="32%" bgcolor="eaeaea" class="table_bl_left" colspan="3">${product.REDUCTION_RATE}
											</td>
				                  	 	</tr>
				                  	 	<tr>
				                  	 		<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">감면내역</td>
						                    <td bgcolor="eaeaea" class="table_bl_left"  colspan="3">${product.REDUCTION_REASON}
											</td>				                  	 	
				                  	 	</tr>
			                		</table>
			                	</td>
				              </tr>
				            
							<tr>              
								<td height="40" align="right">
									<table border="0" width="100%">
								    	<tr>
											<td>
												<c:if test="${product.TAX_GUBUN == '1'}"> <!-- 정기분일때만 수정 가능 -->
								                <img src="/img/mod_icon.gif" alt="수정" border="0" onclick="javascript:goModify('${gapan_no}','${seq}','${currentPage}','${countPerPage}','${year}','edit');" style="cursor:pointer" >
											    </c:if>														
											</td>
							                <td width="50">
										    	<!-- img src="/img/junggibun_calculation.gif" alt="정기분 산출" border="0" onclick="javascript:goTempInsert()" style="cursor:pointer" -->
												<img src="/img/junggibun_calculation.gif" alt="정기분 산출" border="0" onclick="javascript:goModify('${gapan_no}','${seq}','${currentPage}','${countPerPage}','${year}','add');" style="cursor:pointer">       
							                </td>
						                </tr>
						            </table>
								</td>
							</tr>
							<!-- tr>
								<td>
							    	<iframe name='iframe1' frameborder="NO" border="0" framespacing="0" 
							          src="/gapan/junggi/reduction.do?cal_sum_seq=${cal_sum_seq}" width="100%" height="100" scrolling="NO"></iframe>
							    </td>
	        		 		</tr-->
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
