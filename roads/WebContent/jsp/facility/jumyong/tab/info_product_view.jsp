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
<script language="javascript" src="/js/PopupCalendar.js"></script> 
<script>
<!--	

	function InitPage()
	{

	}
	

	function goview(object_no, tax_set)
	{
		var gu_code= document.getElementById("gu_code").value;
		var corp_cd = document.getElementById("corp_cd").value;
		var admin_no= document.getElementById("admin_no").value;
		var currentPage= document.getElementById("currentPage").value;
		
		var year = "${year}";

		location.href="/facility/jumyong/product_view.do?GU_CODE="+gu_code+"&CORP_CD="+corp_cd
		+"&ADMIN_NO="+admin_no+"&currentPage="+currentPage+"&OBJECT_NO="+object_no+"&YEAR="+year+"&TAX_SET="+tax_set;
	}
	
	function goviewhan(tax_set,year)
	{
		var gu_code= document.getElementById("gu_code").value;
		var corp_cd = document.getElementById("corp_cd").value;
		var admin_no= document.getElementById("admin_no").value;
		var currentPage= document.getElementById("currentPage").value;
		
		//var year = "${year}";

		location.href="/facility/jumyong/product_view.do?GU_CODE="+gu_code+"&CORP_CD="+corp_cd
		+"&ADMIN_NO="+admin_no+"&currentPage="+currentPage+"&TAX_SET="+tax_set+"&YEAR="+year;
	}
	
	function goModify(mode, direct)
	{
		var gu_code= document.getElementById("gu_code").value;
		var corp_cd = document.getElementById("corp_cd").value;
		var admin_no= document.getElementById("admin_no").value;
		var currentPage= document.getElementById("currentPage").value;
		var object_no = document.getElementById("OBJECT_NO").value;
		var year = document.getElementById("year").value;
		var quantity = '${quantity}';
		var tax_set = document.getElementById("tax_set").value;

		// 수정시 직접산출, 간접산출 여부 확인
		if( mode == 'edit' ){
			if( confirm("직접산출 하시겠습니까? ") ){
				direct = "direct";
			}else{
				direct = "indirect";
			}
		}
		//alert("direct = " + direct);
		
		location.href="/facility/jumyong/productGo.do?GU_CODE="+gu_code+"&CORP_CD="+corp_cd
		+"&ADMIN_NO="+admin_no+"&currentPage="+currentPage+"&OBJECT_NO="+object_no+"&mode="+mode+"&YEAR="+year+"&quantity="+quantity+"&direct="+direct+"&TAX_SET="+tax_set;
		
	}

	

	function submitClick()
	{
		var productForm = document.productForm;
		productForm.action = "/facility/jumyong/productInsert.do";
		productForm.submit();
	}
	
	function IlgwalCalculate(){
		
		var gu_code = document.productForm.gu_code.value;
		var corp_cd = document.productForm.corp_cd.value;
		var admin_no = document.productForm.admin_no.value;
		var year = document.productForm.YEAR.value;
		
		
		location.href="/facility/jumyong/productIlgwalInsert.do?GU_CODE="+gu_code+"&CORP_CD="+corp_cd+"&ADMIN_NO="+admin_no+"&YEAR="+year;
	}
	
	function Page(page)
	{
		if(page	==	"")
			return;
		
		var form = document.productForm;
		var gu_code= document.getElementById("gu_code").value;
		var corp_cd = document.getElementById("corp_cd").value;
		var admin_no= document.getElementById("admin_no").value;
		var tax_set= document.getElementById("tax_set").value;
		var year= document.getElementById("year").value;
		
	//form.action = "product_view.do?currentPage=" + page;
	
		form.action = "/facility/jumyong/product_view.do?GU_CODE="+gu_code+"&CORP_CD="+corp_cd
		+"&ADMIN_NO="+admin_no+"&currentPage="+page+"&TAX_SET="+tax_set+"&YEAR="+year;
		
	form.submit();
	}	

-->
</script>

</head>

<body onload="javascript:InitPage();"  border="0">

<form name="productForm" id="productForm" method="post">
	<input type="hidden" name="YEAR" id="year" value="${year}">
	<input type="hidden" name="GU_CODE" id="gu_code" value="${gu_code}" >
	<input type="hidden" name="CORP_CD" id="corp_cd" value="${corp_cd}" >
	<input type="hidden" name="ADMIN_NO" id="admin_no" value="${admin_no}" >
	<input type="hidden" name="OBJECT_NO" id="OBJECT_NO" value="${object_no}" >
	<input type="hidden" name="currentPage" id="currentPage" value="${currentPage}">
	<input type="hidden" NAME="direct" ID="direct" value="${direct}">
	<input type="hidden" name="tax_set" id="tax_set" value="${product.TAX_SET}">
	

	<table width="780" border="0" cellspacing="0" cellpadding="0">
		<tr>
			<td class="contborder_purple">							            
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td>
						
							<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
								<tr>
				                    <td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">년도</td>								
				                    <td align="center" bgcolor="e5eff8" class="sub_table_b">세입구분</td>
				                    <td align="center" bgcolor="e5eff8" class="sub_table_b">일반 점용료 </td>
				                    <td align="center" bgcolor="e5eff8" class="sub_table_b">부과 점용료(감면적용)</td>			
				                    <td align="center" bgcolor="e5eff8" class="sub_table_b">감면율</td>				                    	                    
			                    </tr>
   			                    <c:choose>
									<c:when test="${calSumList!= null && !empty calSumList}">
										<c:forEach items="${calSumList}" var="board" varStatus="idx">
											<tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" 
											onclick="javascript:goviewhan('${board.TAX_SET}','${board.YEAR}');" style="cursor:pointer" >
												<td align="center">${board.YEAR}</td>
												<td height="28" align="center">${board.TAX_SET_NAME}</td>
												<td align="center">${board.SUM_ADJUST_WON }원</td>
												<td align="center">${board.SUM_WON }원</td>					
												<td height="28" align="center">${board.REDUCTION_RATE}%</td>															
											</tr> 
										</c:forEach>
									</c:when>
								<c:otherwise>
									<tr>
										<td align="center" class="sub_table" colspan="5" height="85">검색된 내용이 없습니다</td>
									</tr>
								</c:otherwise>
							 </c:choose>
							</table></td>
					</tr>
					<tr>
						<td height="40" align="left"><table width="100%" border="0" cellspacing="0" cellpadding="0">
						<br><br>
						</td>
					</tr>
					<tr>
						<td>
							<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
								<tr>
				                    <td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">번호</td>
				                    <td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">&nbsp년도&nbsp</td>				                    
				                    <td  align="center" bgcolor="e5eff8" class="sub_table_b">점용목적</td>
				                    <td  align="center" bgcolor="e5eff8" class="sub_table_b">상세</br>시설물</td>				                    
				                    <td align="center" bgcolor="e5eff8" class="sub_table_b">일반 점용료</td>				                    				                    				                    
				                    <td align="center" bgcolor="e5eff8" class="sub_table_b">연장</br>(수량)</td>
				                    <td align="center" bgcolor="e5eff8" class="sub_table_b">심도</br>감액율</td>				                    
				                    <td align="center" bgcolor="e5eff8" class="sub_table_b">세입구분</td>
				                    <td align="center" bgcolor="e5eff8" class="sub_table_b">산출여부</td>				                    
			                    </tr>
			                    <c:choose>
									<c:when test="${placeList!= null && !empty placeList}">
										<c:forEach items="${placeList}" var="board" varStatus="idx">
											<tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" 
											onclick="javascript:goview('${board.OBJECT_NO}' , '${board.TAX_SET}');" style="cursor:pointer" >
												<td height="26" align="center">${idx.count}</td>
												<td height="26" align="center">${board.YEAR}</td>										
												<td align="center">${board.SORT_NM} ${board.KIND_NM}</td>										
												<td align="center">
												  <c:if test="${board.SEBU_NM == null}"> - </c:if>	
									              <c:if test="${board.SEBU_NM != null}">${board.SEBU_NM}</c:if>	
												</td>										
												<td align="center">${board.SUM_ADJUST_WON} 원</td>										
												<td align="center">${board.QUANTITY}</td>
												<td align="center">${board.DEPTH_NUM}%</td>
												<td align="center">${board.TAX_SET_NAME}</td>
												<td align="center"><font color='red'>${board.CAL_STATUS_NAME}</font></td>										
											</tr>
										</c:forEach>
									</c:when>
									<c:otherwise>
										<tr>
											<td align="center" class="sub_table" colspan="9" height="85">검색된 내용이 없습니다</td>
										</tr>
									</c:otherwise>
								</c:choose>
							</table></td>
						</tr>
						<tr>
							<td height="40" align="center"><table width="100%" border="0" cellspacing="0" cellpadding="0">
								<tr>
									<td align="center"><table border="0" cellpadding="0" cellspacing="0">
								    	<tr>${pageing}</tr>
								    	</table>
								    </td>
			                    </tr></table>
			                </td>
						</tr>
						<tr>
							<td class="sub_table_b" align="left">
								<img src="/img/facility_view11.gif" alt="점용료 산출">
							</td>
						</tr>
					<tr>
						<td>
							<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
								<tr>
									<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">기준 년도</td>
								    <td width="40%" bgcolor="eaeaea" class="table_bl_left" >
										${product.YEAR} 년
									</td> 
									<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">연장(수량)</td>
								    <td width="40%" bgcolor="eaeaea" class="table_bl_left" >
										${product.QUANTITY}m(개수)
									</td> 
							    </tr>						   
							     	<tr>
								    <td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b" >산출단가</td>
								    <td width="42%" bgcolor="eaeaea" class="table_bl_left">
										${product.RATE}원
									</td>
									<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">심도 감액율</td>
								    <td width="26%" bgcolor="eaeaea" class="table_bl_left" >
										${product.DEPTH_RATE}%								    
									</td>
							    </tr>
								<tr>
				                    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">산출기간</td>
				                    <td bgcolor="eaeaea" class="table_bl_left" >  ${product.FROMDATE} ~ ${product.TODATE} </td>  
				                    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">개월수</td>
				                    <td bgcolor="eaeaea" class="table_bl_left" >${product.PERIOD}
									</td>
								</tr>
							   <tr>
									<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">일반 산출식</td>
							        <td bgcolor="eaeaea" class="table_bl_left" >${product.FORM_ADJUST}
									</td> 
									<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">일반 점용료</td>
							        <td bgcolor="eaeaea" class="table_bl_left" >${product.SUM_ADJUST_WON}원
									</td> 
								</tr> 
							</table>
						</td>
					</tr>
					<tr>              
						<td height="40" align="right">
							<table border="0" width="100%">
								<tr>
					                <td height="40" align="right">
						                <!--
						                	<c:if test="${cal_status == '1'}">
						                	<img src="/img/direct.gif" alt="직접산출" border="0" onclick="javascript:goModify('add', 'direct')" style="cursor:pointer" >
						                	<img src="/img/indirect.gif" alt="간접산출" border="0" onclick="javascript:goModify('add', 'indirect')" style="cursor:pointer" >
											</c:if>
						                -->
						                <c:if test="${cal_status == '2'}">
											<!--  //********** BEGIN_KANG_20120416 -->
											<!-- 
											일괄<img src="/img/accou_icon.gif" alt="일괄계산" width="56" height="18" border="0" onclick="javascript:IlgwalCalculate();" style="cursor:pointer">
											-->
											<img src="/img/batch_calculation.gif" alt="일괄계산" border="0" onclick="javascript:IlgwalCalculate();" style="cursor:pointer">
											<!--   //********** END_KANG_20120416 -->						                
						                	
							                <img src="/img/mod_icon.gif" alt="수정" border="0" onclick="javascript:goModify('edit','${direct }')" style="cursor:pointer" >
										</c:if>
					                </td>
					            </tr>
							</table>
						</td>
					</tr>
					
		           <tr>
					<td>
			              <iframe name='iframe1' frameborder="NO" border="0" framespacing="0" 
			              src="/facility/junggi/reduction.do?cal_sum_seq=${product.CAL_SUM_SEQ}" width="100%" height="100" scrolling="NO"></iframe>
			        </td>
	   		 	   </tr>		
				</table>
			</td>
		</tr>		          
	</table>
</form>



</body>
</html>

