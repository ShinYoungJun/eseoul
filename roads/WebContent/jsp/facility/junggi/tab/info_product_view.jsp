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
<script language="javascript" src="/js/PopupCalendar.js"></script> 
<script>
<!--	

	function InitPage()
	{

	}
	
	function goview(seq , year, cal_status)
	{
		var gu_code= document.getElementById("gu_code").value;
		var corp_cd = document.getElementById("corp_cd").value;
		
		var ADMIN_NO = document.getElementById("ADMIN_NO").value;

		var currentPage= document.getElementById("currentPage").value;
		var cal_sum_seq = document.getElementById("cal_sum_seq").value;
		
		//var year = document.getElementById("year").value;
		var tax_set = document.getElementById("tax_set").value;

		location.href="/facility/junggi/product_view.do?GU_CODE="+gu_code+"&CORP_CD="+corp_cd
		+"&ADMIN_NO="+ADMIN_NO+"&currentPage="+currentPage+"&SEQ="+seq+"&cal_sum_seq="+cal_sum_seq+"&year="+year
		+"&tax_set="+tax_set+"&cal_status="+cal_status;
	}
	
	function goSumview(seq,year)
	{
		var gu_code= document.getElementById("gu_code").value;
		var corp_cd = document.getElementById("corp_cd").value;
		var admin_no= document.getElementById("ADMIN_NO").value;

		var currentPage= document.getElementById("currentPage").value;
		
		//var year = document.getElementById("year").value;
		var tax_set = document.getElementById("tax_set").value;

		location.href="/facility/junggi/product_view.do?GU_CODE="+gu_code+"&CORP_CD="+corp_cd
		+"&ADMIN_NO="+admin_no+"&currentPage="+currentPage+"&cal_sum_seq="+seq+"&year="+year+"&tax_set="+tax_set;
	}
	
	// mode ==  add:정기분산출, edit: 수정하기
	function goModify(mode)
	{
		
		if( mode == 'add' ){
			if( document.productForm.YEAR.value >= '${yearAdd}' ){
				alert("정기분 산출은 다음년도만 부과 가능합니다. 확인해주세요. ");			
				return;
			}
			if( document.productForm.cal_status.value != '' && document.productForm.cal_status.value != '0' && document.productForm.cal_status.value != 'null' ){
				alert("이미 산출된 항목입니다. 확인해주세요. ");
				return;
			}

			if(document.productForm.InputTaxationCount.value != document.productForm.WriteCalSumCount.value){
				alert("세외수입관리에서 작성하지 않은 항목이 있습니다. 확인해 주세요");
				return;
			}
			
		}
		if( mode == 'edit' ){
			if( document.productForm.TAX_YN.value == '1' ) {
				alert("이미 부과된 정기분은 수정 불가합니다. 확인해주세요.");
				return;
			}
		}		
		
		var gu_code= document.getElementById("gu_code").value;
		var corp_cd = document.getElementById("corp_cd").value;
		var admin_no= document.getElementById("ADMIN_NO").value;
		var currentPage= document.getElementById("currentPage").value;
		var object_no = document.getElementById("object_no").value;
		var seq = document.getElementById("SEQ").value;
		var cal_sum_seq = document.getElementById("cal_sum_seq").value;
		
		var year = document.getElementById("YEAR").value;
		var tax_set = document.getElementById("tax_set").value;
		var sigu_cd = document.getElementById("sigu_cd").value;
		
		
		//alert(object_no);

//		location.href="/facility/jumyong/productInsert.do?GU_CODE="+gu_code+"&CORP_CD="+corp_cd
//		+"&REQUEST_NO="+request_no+"&currentPage="+currentPage+"&OBJECT_NO="+object_no+"&mode="+mode;
		
		location.href="/facility/junggi/product_insert.do?GU_CODE="+gu_code+"&CORP_CD="+corp_cd
		+"&ADMIN_NO="+admin_no+"&currentPage="+currentPage+"&OBJECT_NO="+object_no+"&mode="+mode+"&SEQ="+seq+"&cal_sum_seq="+cal_sum_seq+"&year="+year
		+"&tax_set="+tax_set+"&sigu_cd="+sigu_cd;
	}


	function submitClick()
	{
		var productForm = document.productForm;

		productForm.submit();
	}
	
	
	function goTempInsert()
	{
	
		var gu_code = document.getElementById("gu_code").value;
		var corp_cd = document.getElementById("corp_cd").value;
		var request_no = document.getElementById("request_no").value;
		//var year = document.getElementById("YEAR").value;
	
		location.href("/facility/junggi/product_temp_insert.do?gu_code="+gu_code+"&corp_cd="+corp_cd+"&year="+year+"&request_no="+request_no);
	}
	-->
	
</script>

</head>

<body onload="javascript:InitPage();"  border="0">

<form name="productForm" id="productForm" method="post" action = "/facility/jumyong/productInsert.do" >

<input type="hidden" NAME="GU_CODE" ID="gu_code" value="${gu_code}" >
<input type="hidden" NAME="CORP_CD" ID="corp_cd" value="${corp_cd}" >
<input type="hidden" NAME="ADMIN_NO" ID="ADMIN_NO" value="${product.ADMIN_NO}" >
<input type="hidden" NAME="OBJECT_NO" ID="object_no" value="${product.OBJECT_NO}" >
<input type="hidden" NAME="cal_sum_seq" ID="cal_sum_seq" value="${cal_sum_seq}" >	

<input type="hidden" NAME="SEQ" ID="SEQ" value="${SEQ}" >		

<input type="hidden" NAME="currentPage" ID="currentPage" value="${currentPage}" >
<input name="YEAR"  id = "YEAR" value="${product.YEAR}" type="hidden" >
<!-- 2009.8.17 추가 start -->
<input type="hidden" name="year" value="${year }">
<input type="hidden" name="tax_set" value="${tax_set }">
<input type="hidden" name="message" value="${message}">
<input type="hidden" name="sigu_cd" value="${sigu_cd }">
<input type="hidden" name="TAX_YN" value="${product.TAX_YN }">
<input type="hidden" name="cal_status" value="${cal_status }">
<input type="hidden" name="use_section" value="${product.USE_SECTION }">
<input type="hidden" name="InputTaxationCount" value="${InputTaxationCount }"/>
<input type="hidden" name="WriteCalSumCount" value="${WriteCalSumCount }" />



<!-- 2009.8.17 추가 end -->

<table width="780" border="0" cellspacing="0" cellpadding="0">
	<tr>
		<td class="contborder_purple">							            
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
					<td>
						<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
							<tr>
			                    <td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">년도 </td>
			                    <td align="center" bgcolor="e5eff8" class="sub_table_b">일반 점용료 </td>
			                    <td align="center" bgcolor="e5eff8" class="sub_table_b">조정 점용료</td>
			                    <td align="center" bgcolor="e5eff8" class="sub_table_b">정기/수시</td>			                    
			                    <td align="center" bgcolor="e5eff8" class="sub_table_b">구분</td>
		                    </tr>
							<c:forEach items="${calSumList}" var="board" varStatus="idx">
							
							<c:choose>
							<c:when test="${board.SEQ != cal_sum_seq }">
							<tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" 
								onclick="javascript:goSumview('${board.SEQ}','${board.YEAR }');" style="cursor:pointer" >
									
							</c:when>
							<c:otherwise>
							<tr onclick="javascript:goSumview('${board.SEQ}','${board.YEAR }');" bgcolor="#f6f7f8">
							</c:otherwise>
							</c:choose>
								
								<td height="28" align="center">${board.YEAR }</td>
								<td align="center">${rnic:insertComma2(board.SUM_ADJUST) }</td>
								<td align="center">${rnic:insertComma2(board.SUM) }</td>
								<td align="center">${board.USE_SECTION_NAME }</td>							
								<td align="center">${board.TAX_SET_NAME }</td>
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
							    			<tr>${pageing}</tr>
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
				                    <td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">번호</td>
				                    <td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">과세구분</td>
				                    <td align="center" bgcolor="e5eff8" class="sub_table_b">점용목적</td>
				                    <td align="center" bgcolor="e5eff8" class="sub_table_b">연장(개소)</td>
				                    <td align="center" bgcolor="e5eff8" class="sub_table_b">구분 </td>				                    
<!--			                    <td align="center" bgcolor="e5eff8" class="sub_table_b">심도 </td>-->
<!--			                    <td align="center" bgcolor="e5eff8" class="sub_table_b">감액율</td>-->
<!--			                    <td align="center" bgcolor="e5eff8" class="sub_table_b">산출단가</td>-->
			                    	<td align="center" bgcolor="e5eff8" class="sub_table_b">조정점용료</td>
<!--			                    <td align="center" bgcolor="e5eff8" class="sub_table_b">구분 </td>-->
									<td align="center" bgcolor="e5eff8" class="sub_table_b">산출여부 </td>
									<td align="center" bgcolor="e5eff8" class="sub_table_b">정기분<br>산출</td>
			                    
		                    </tr>
							<c:forEach items="${CalculationList}" var="board" varStatus="idx">
								
								<c:choose>
								<c:when test="${board.SEQ != SEQ }">
								<tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" 
								onclick="javascript:goview('${board.SEQ}','${board.YEAR }','${board.CAL_STATUS}');" style="cursor:pointer" >
								</c:when>
								<c:otherwise>
								<tr onclick="javascript:goview('${board.SEQ}','${board.YEAR }','${board.CAL_STATUS}');" bgcolor="#f6f7f8">								
								</c:otherwise>
								</c:choose>
								
								
									<td height="26" align="center">${idx.count}</td>
<!--								<td height="26" align="center">${board.GU_CODE}-${board.CORP_CD}</td>-->
									<c:choose>
									<c:when test="${board.USE_SECTION == '2' }">
									<td height="26" align="center">${board.YEAR }년도 ${board.REQUEST_NO} 차 ${board.USE_SECTION_NAME}분 </td>
									</c:when>
									<c:otherwise>
									<td height="26" align="center">${board.YEAR }년도 ${board.USE_SECTION_NAME}분 </td>
									</c:otherwise>
									</c:choose>
									<td align="center">${board.SORT_NM} ${board.KIND_NM}</td>
									<td align="center">${board.QUANTITY} m(개)</td>
									<td align="center">${board.TAX_SET_NAME}</td>																
<!--								<td align="center">${board.DEPTH_NUM}</td>-->
<!--								<td align="center">${board.DEPTH_RATE}%</td>-->
<!--								<td align="center">${board.TAX_SET_NAME}</td>-->
									<td align="center">${rnic:insertComma2(board.SUM_ADJUST)}</td>
<!--								<td align="center">${board.USE_SECTION_NAME}</td>-->
									<td align="center"><font color="red">
										<c:if test="${board.SUM_ADJUST != null }">
											산출
										</c:if>
										<c:if test="${board.SUM_ADJUST == null }">
											미산출
										</c:if>
									</font>
									</td>
									<td align="center">
									<font color="red">${board.TYPE}</font>
									</td>
								</tr>
								</c:forEach>
							</table></td>
					</tr>
					<tr>
						<td height="40" align="center"><table width="100%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td align="center"><table border="0" cellpadding="0" cellspacing="0">
							    	<tr>${strPageDivideForm}</tr></table></td>	
		                    </tr></table></td>
					</tr>
					<tr>
						<td class="sub_table_b"> ※ 점용료 산출
						</td></tr>
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
									<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">연장(개소)</td>
								    <td width="40%" bgcolor="eaeaea" class="table_bl_left" >
										${product.QUANTITY} m(개)
									</td> 
									<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">감액율</td>
								    <td width="26%" bgcolor="eaeaea" class="table_bl_left" >
										${product.DEPTH_RATE}%
									</td> 
							    </tr>						   
							    <tr>
								    <td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b" >산출단가</td>
								    <td width="42%" bgcolor="eaeaea" class="table_bl_left" colspan="3">
										${product.RATE}
									</td>
									
							    </tr>
							    <tr>
				                    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">산출기간</td>
				                    <td bgcolor="eaeaea" class="table_bl_left" >  ${rnic:addDash(product.FROMDATE)} ~ ${rnic:addDash(product.TODATE)} </td>  
				                    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">개월수</td>
				                    <td bgcolor="eaeaea" class="table_bl_left" >${product.PERIOD}
									</td>
								</tr>
							   	<tr>
									<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">조정 산출식</td>
							        <td bgcolor="eaeaea" class="table_bl_left" >${product.FORM_ADJUST}
									</td> 
									<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">조정 점용료</td>
							        <td bgcolor="eaeaea" class="table_bl_left" >${rnic:insertComma2(product.SUM_ADJUST)}
									</td> 
								</tr>
								
								<tr><td height="10" colspan="4"></td></tr>
								
							    <tr>
									</td>  
									<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">부과일자</td>
				                    <td bgcolor="eaeaea" class="table_bl_left" >${rnic:addDash(product.TAX_DATE)}
									</td>
									<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">납기내기한</td>
			                    	<td bgcolor="eaeaea" class="table_bl_left" >${rnic:addDash(product.INDATE)}
									</td>
								</tr>
								<tr>
									</td>  
									<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">납기후일자</td>
		                    		<td bgcolor="eaeaea" class="table_bl_left" >${rnic:addDash(product.OVERDATE)}
									</td>
									<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">납기후금액</td>
	                    			<td bgcolor="eaeaea" class="table_bl_left" >${rnic:insertComma2(product.OVERTAX)} 원
									</td>
						  		</tr>
			                  
		                   		<tr>
		                    		<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">기본 산출식</td>
		                    		<td bgcolor="eaeaea" class="table_bl_left" > ${product.FORM}</td>
		                    		<td width="100'" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용료 합계</td>
		                    		<td bgcolor="eaeaea" class="table_bl_left" > ${rnic:insertComma2(SumAdjust)}</td>
									
		                  		</tr> 
		                  
		                  		<tr>
			                		<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">조정 산출식</td>
		                    		<td colspan="3"  bgcolor="eaeaea" class="table_bl_left" >${product.FORM_ADJUST}
									</td> 
		                  		</tr>
				                  		
							</table>
						</td>
					</tr>
					
					<tr>              
						<td height="40" align="right">
							<table border="0" width="100%">
								<tr>   
									<!--td>
										<input type="text" NAME="YEAR" ID="YEAR"  >
									</td>
									< td onclick="javascript:goTempInsert()">
										정기 산출 입력
									</td-->
									<td> 
										<c:if test="${product.USE_SECTION == '1'}"> <!-- 정기분일때만 수정 가능 -->
						                <img src="/img/mod_icon.gif" alt="수정" border="0" onclick="javascript:goModify('edit')" style="cursor:pointer" >
					                	</c:if>	
									</td>
					                <td width="50">
					                	<img src="/img/junggibun_calculation.gif" alt="정기분 산출" border="0" onclick="javascript:goModify('add');" style="cursor:pointer">
					                </td>
					            </tr>
								
							</table>
						</td>
					</tr>
				</table>
			</td>
		</tr>		          
	</table>
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

