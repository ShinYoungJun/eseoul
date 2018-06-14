<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
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
<script language="javascript" src="/js/PopupCalendar.js"></script> 
<script>
<!--	

	var savable = 0;

	function InitPage()
	{

	}

	
	-->
	
	
	
</script>

</head>

<body onload="javascript:InitPage();"  border="0">
<form name="productForm" id="productForm" method="post" action = "/jumyong/productInsert.do" >
				
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
								                   		${rnic:insertComma2(product.PRICE)}원                
												</td>
							                  </tr>
							                  <tr>
							                    <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용면적/</td>
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
							                    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">개월수</td>
							                    <td bgcolor="eaeaea" class="table_bl_left" >${product.PERIOD}개월</td>
							                  </tr>
							                  <tr>
							                    <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">감면사유</td>
							                    <td bgcolor="eaeaea" class="table_bl_left" >${product.REDUCTION_REASON}</td>
												<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">감면율</td>
							                    <td bgcolor="eaeaea" class="table_bl_left" >${product.REDUCTION_RATE}%</td>
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
							                  
							                </table></td>
							              </tr>
							            
							              <tr>              
							                <td height="40" align="right">
								                <table border="0" width="100%">
								                	<tr>

								                	 <td width="80%" align="right" class="sub_table_b"  onclick="goSubtract('${no}','${currentPage}');" style="cursor:pointer">
									                	면적감소
									                </td>
								                	
								                	<td >
									                	<img src="/img/add_icon.gif" alt="추가" border="0" onclick="goAdd('${no}','${currentPage}')" style="cursor:pointer" >  									                
									                </td>
										            <c:if test="${listSize != '0'}">     
										                <td width="50">
										                	<img src="/img/mod_icon.gif" alt="수정" border="0" onclick="javascript:goModify()" style="cursor:pointer" >
										                </td>
										            </c:if>
									                </tr>
									               
									             </table>
											</td>
							              </tr>
								</table>
							</div>
							<div id="edit" style="width:100%;display:none;">
		  					<table width="100%" border="0" cellspacing="0" cellpadding="0">
					              <tr>
					                <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
					                   <tr>
					                    <td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b"  style="direction:rtl" >기준년도</td>
					                    <td width="42%" bgcolor="eaeaea" class="table_bl_left" >
					                    <spring:bind path="product.YEAR">                    
											<input name="YEAR" id="YEAR" type="text" value = "${product.YEAR}" style="width:50px;ime-mode:disabled;"  class="input_form1"  onKeyDown="onlyNumberInput();" style="text-align:right">&nbsp년 
					                    </spring:bind>
						                
										</td>                     
										<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">공시지가</td>
					                    <td width="32%" bgcolor="eaeaea" class="table_bl_left" >
					                       <spring:bind path="product.PRICE" >
						                   		<!-- input name="PRICE" ID="PRICE" value="${product.PRICE}" type="text" class="input_form1" style="width:80px" onkeypress="javascript:checkWon(this);"-->
						                   		<input name="PRICE" ID="PRICE" value="${product.PRICE}" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" onkeyup="javascript:fn_addComma(this)"  onKeyDown="onlyNumberInput();" style="text-align:right">원	 
						                   		
						                   </spring:bind>
						                   

						                   <img src="/img/landPrice.gif" alt="공시지가조회" height="18" border="0" style="cursor:pointer" onclick="javascript:openLandPricePopUp()"; >

										</td> 
					                  </tr> 
					                  
					                  
					                  
					                  <tr>
					                    <td width="100" height="26" align="center" bgcolor="e5eff8" class="input_form1"  >점용면적/개</td>
					                    <td bgcolor="eaeaea" class="table_bl_left" >
					                    
					                    <input id="year1" type="text" value="2009" class="input_form1" style="width:50px;ime-mode:disabled;" value="2009" >
					                    
					                    
					                        <spring:bind path="product.AREA_AFTER">
							                    <input name="AREA_AFTER" id="AREA_AFTER" type="text" class="input_form1" style="width:50px;ime-mode:disabled;" value="${product.AREA_AFTER}"   onKeyDown="onlyNumberInput();" style="text-align:right" onblur="showProductList();">㎡
											</spring:bind>
											
										</td>                     
										<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">요율/단가</td>
					                    <td bgcolor="eaeaea" class="table_bl_left" >
					                        <spring:bind path="product.RATE">
												<input name="RATE"  id="RATE" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value="${product.RATE}"  onKeyDown="onlyNumberInput();" style="text-align:right">
											</spring:bind>
										</td> 
					                  </tr>                   
					                  
					                  
									<tr>
					                    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">산출기간</td>
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
					                     		
					                     													<img src="/img/cal_month.gif" alt="달수계산" height="18" border="0" style="cursor:pointer" onClick="javascript:calDate();">
					                     		
					                          </td>
					                        </tr>
					                    </table></td>
					                    
					                    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">개월수</td>
					                    <td bgcolor="eaeaea" class="table_bl_left" >
					                    	<spring:bind path="product.PERIOD">
						                    	<input name="PERIOD" id ="PERIOD" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value = "${product.PERIOD}"   onKeyDown="onlyNumberInput();" style="text-align:right">개월
						                    </spring:bind>
										</td>
					                 
					                  </tr>
					                   <tr>
					                    <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">감면사유</td>
					                    <td bgcolor="eaeaea" class="table_bl_left" >
					                        <spring:bind path="product.REDUCTION_REASON">
						                    <input name="REDUCTION_REASON" id="REDUCTION_REASON" type="text" class="input_form1" style="width:300px;ime-mode:disabled;" value="${product.REDUCTION_REASON}"   >
											</spring:bind>
											
										</td>                     
										<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">감면율</td>
					                    <td bgcolor="eaeaea" class="table_bl_left" >
					                        <spring:bind path="product.REDUCTION_RATE">
												<input name="REDUCTION_RATE"  id="REDUCTION_RATE" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value="${product.REDUCTION_RATE}"  onKeyDown="onlyNumberInput();" style="text-align:right">%
											</spring:bind>
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
					                    <td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">조정 계수</td>
					                    <td width="42%" bgcolor="eaeaea" class="table_bl_left" >
					                    	<spring:bind path="product.ADJUSTMENT">
												<input name="ADJUSTMENT" id="ADJUSTMENT" type="text" class="input_form1" style="width:120px;ime-mode:disabled;" value="${product.ADJUSTMENT}"   onKeyDown="onlyNumberInput();" style="text-align:right">
												
											</spring:bind>
										</td>                     
					                    	<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">작년도 점용료</td>
						                    <td width="32%" bgcolor="eaeaea" class="table_bl_left" >
							                    <spring:bind path="product.SUM_LASTYEAR">
								                    <input name="SUM_LASTYEAR" id="SUM_LASTYEAR" type="text"  class="input_form1" style="width:80px;ime-mode:disabled;" value="${product.SUM_LASTYEAR}"   onKeyDown="onlyNumberInput();" onkeyup="javascript:fn_addComma(this)" style="text-align:right">원
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
							                    <spring:bind path="product.SUM_YEAR">
													<input name="SUM_YEAR" id="SUM_YEAR" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value="${product.SUM_YEAR}"   onKeyDown="onlyNumberInput();" onkeyup="javascript:fn_addComma(this)" style="text-align:right">원
												</spring:bind>
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
												<input name="SUM_ADJUST" id="SUM_ADJUST" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value="${product.SUM_ADJUST}"  onKeyDown="onlyNumberInput();" onkeyup="javascript:fn_addComma(this)" style="text-align:right">원
											</spring:bind>
										</td> 
										
					                  </tr>               
												<input name="RATE1" id = "RATE1" type="hidden" class="input_form1" style="width:120px;ime-mode:disabled;" value=""   onKeyDown="onlyNumberInput();" >
					                  
					                </table></td>
					              </tr>
					            
					              <tr>              
					                <td height="40" align="right">
				                	<img src="/img/can_icon.gif" alt="취소" border="0" onclick="javascript:history.back();" style="cursor:pointer" >
					                <img src="/img/save_icon2.gif" alt="저장" width="56" height="18" border="0"
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

