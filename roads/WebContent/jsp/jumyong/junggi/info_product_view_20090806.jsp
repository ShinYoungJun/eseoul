<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/include.jsp" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />
<title>::::: ����� ������������ý��� :::::</title>
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
	
	}
	
	
	

	
	
	
	//[ , ] ����
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
	
	
	
	// �޸� ����
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
	
	
		// �޸� ���� - ��ȯ
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
	
	
	
	//view ȭ�� �̵�
	function goView(adminNo,sum_seq,seq,currentPage,countPage,year,usesection)
	{
		location.href("/jumyong/junggi/junggi_view.do?ADMIN_NO="+adminNo+"&seq="+seq+"&sum_seq="+sum_seq+"&currentPage="+currentPage+"&year="+year+"&usesectoin="+usesection);
		
	}
	

	
	 function openwin(){
	 
		var year = document.getElementById("year1").value;
		
		year = Number(year)- Number(1);
		

	 
	 	var x= "dialogwidth:700px;dialogHeight:600px;status:no;help:no";
  
//		window.showModalDialog("/jumyong/jumyong/productAddList.do?ADMIN_NO=${no}", window,x);	
		window.showModalDialog("/jumyong/junggi/productAddList.do?ADMIN_NO=${no}&year="+year+"&gourl="+"/jumyong/junggi/productAddList.do", window,x);			
//		window.open("/jumyong/junggi/productAddList.do?ADMIN_NO=${no}&year=2009");			
			
    }
	
	
	//edit ȭ�� �̵�
	function goModify(adminNo,seq,currentPage,countPage,year)
	{
		location.href("/jumyong/junggi/junggi_product.do?ADMIN_NO="+adminNo+"&SEQ="+seq+"&currentPage="+currentPage+"&year="+year+"&mode=edit");
	}
	
	function goTempInsert()
	{
	
		var admin_no = document.getElementById("ADMIN_NO").value;
		
		var year = document.getElementById("YEAR").value;
		if(year == '')
			alert("������ �־��ּ���");
		else
		 	location.href("/jumyong/junggi/product_temp_insert.do?admin_no="+admin_no+"&year="+year);	
		
		//alert("/facility/junggi/product_temp_insert.do?gu_code="+gu_code+"&corp_cd="+corp_cd+"&year="+year);
		
	
	

//		location.href("/facility/junggi/product_temp_insert.do?gu_code="+gu_code+"&corp_cd="+corp_cd+"&year="+year);
		//alert("!111");
	}
	
	-->
	
</script>

</head>

<body onload="javascript:InitPage();"  border="0">



<form name="productForm" id="productForm" method="post" action = "/jumyong/junggi/junggi_view.do" >
						
						<spring:bind path="product.ADMIN_NO">
							<input name="ADMIN_NO" id="ADMIN_NO" value="${no}" type="hidden" >
						</spring:bind>
						
						<input name="mode"  id = "mode" value="${mode}" type="hidden" >
						
						<spring:bind path="product.SEQ">
							<input name="CSEQ"  id = "SEQ" value="${seq}" type="hidden" >
						</spring:bind>
						<input name="RATE1" id = "RATE1" type="hidden"  value="" >
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
												    	<td width="10%" height="26" align="left"  class="sub_table_b">* ���� ���� ����Ʈ</td>		
												    </tr>
												</table>	
							                </td></tr>
							                <tr>
							                <td>
							                <table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
							                  <tr>
							                    <td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">�ΰ��⵵</td>
							                    <td align="center" bgcolor="e5eff8" class="sub_table_b">����</td>
							                    <td align="center" bgcolor="e5eff8" class="sub_table_b">�Ϲ� �����</br>(���� ������) </td>							                    
							                    <td align="center" bgcolor="e5eff8" class="sub_table_b">���� ����� </br>(���� ����)</td>
							                    <td align="center" bgcolor="e5eff8" class="sub_table_b"> ������ </td>
							                    <td align="center" bgcolor="e5eff8" class="sub_table_b"> ���Ա��� </td>
							                    <td align="center" bgcolor="e5eff8" class="sub_table_b"> ���� ���� </td>							                    							                    
							                    </tr>
							                    
							                    
							                  <c:forEach items="${cal_sum_infoList}" var="board" varStatus="idx">
							                      <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" 
							                      onclick="javascript:goView('${no}','${board.SEQ}','','${currentPage}','${countPerPage}','${board.YEAR}','${board.USE_SECTION}');" style="cursor:pointer" >
							                        <td height="26" align="center">${board.YEAR}</td>
							                        <td align="center">${board.AREA}</td>

							                        <td align="center">${rnic:insertComma2(board.SUM_ADJUST) }</td>
							                        <td align="center">${rnic:insertComma2(board.SUM) }</td>
							                        <td align="center">${board.REDUCTION_RATE}%</td>
							                        <td align="center">${board.TAX_SET_NAME}</td>							                        							                        
							                        <td align="center">${board.USE_SECTIONNAME}</td>
							                      </tr> 
											  </c:forEach>
							                </table></td>
							              </tr>
							              <tr>
							                <td height="40" align="center"><table width="100%" border="0" cellspacing="0" cellpadding="0">
							                    <tr>
							                      <td align="center"><table border="0" cellpadding="0" cellspacing="0">
							                        <tr>
							                        ${strPageDivideForm_sum}
							                        </tr>
							                        
							                      </table></td>
	
							                    </tr>
							                    <tr>
		
		
							                    </tr>
							                  </table></td>
							              </tr>
										<tr>
							                <td>
							                	 <table width="100%" border="0"  cellpadding="0" cellspacing="0"  class="sub_table">
													<tr>
												    	<td width="10%" height="26" align="left"  class="sub_table_b">* �⵵�� ���� ����</td>		
												    </tr>
												</table>	
							                </td></tr>
							              
										<tr>
							                <td>
							                <table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
							                  <tr>
							                    <td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">�ΰ��⵵</td>
							                    <td align="center" bgcolor="e5eff8" class="sub_table_b">����</td>
							                    <td align="center" bgcolor="e5eff8" class="sub_table_b">����</td>
							                    <td align="center" bgcolor="e5eff8" class="sub_table_b">����Ⱓ</td>
							                    <td align="center" bgcolor="e5eff8" class="sub_table_b">���� ���� ����� </td>
							                    <td align="center" bgcolor="e5eff8" class="sub_table_b">���⵵ ����� </td>
							                    <td align="center" bgcolor="e5eff8" class="sub_table_b">���� ����� </td>
							                    <td align="center" bgcolor="e5eff8" class="sub_table_b">���� ���� </td>							                    
							                   						                    
							                    </tr>
							                    
							                    
							                  <c:forEach items="${ImpositionInfoByCalSumList}" var="board" varStatus="idx">
							                      <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" 
							                      onclick="javascript:goView('${no}','${sum_seq}',${board.SEQ},'${currentPage}','${countPerPage}','${board.YEAR}','${board.USE_SECTION}');" style="cursor:pointer" >
							                        <td height="26" align="center">${board.YEAR}</td>
							                        <td align="center">${board.AREA_AFTER}</td>
							                        <td align="center">${board.RATE }</td>
							                        <td align="center">${rnic:addDash(board.FROMDATE)}~${rnic:addDash(board.TODATE)}</td>
							                        <td align="center">${rnic:insertComma2(board.SUM_LASTYEAR) }</td>
							                        <td align="center">${rnic:insertComma2(board.SUM_YEAR) }</td>
							                        <td align="center">${rnic:insertComma2(board.SUM_ADJUST) }</td>
							                        <td align="center">
							                        
							                        <c:if test="${rnic:insertComma2(board.SUM_ADJUST) == '0'}">
							                        	�̻���
										            </c:if>	
							                        <c:if test="${rnic:insertComma2(board.SUM_ADJUST) != '0'}">
							                        	����
										            </c:if>	
							                        
							                        
							                        </td>							                        
							                        
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
							                  </table></td>
							              </tr>
							              
										</table>	
										
									<div id="view" style="width:100%;">
		              					<table width="100%" border="0" cellspacing="0" cellpadding="0">
							              <tr>
							                <td>
							                	 <table width="100%" border="0"  cellpadding="0" cellspacing="0"  class="sub_table">
													<tr>
												    	<td width="10%" height="26" align="left"  class="sub_table_b">* ���� ����</td>		
												    </tr>
												</table>	
							                </td></tr>
							              <tr>
							                <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
							                   <tr>
							                    <td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�ΰ��⵵</td>
							                    <td width="42%" bgcolor="eaeaea" class="table_bl_left" >${product.YEAR} ��</td>                     
												<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
							                    <td width="32%" bgcolor="eaeaea" class="table_bl_left" >${rnic:insertComma2(product.PRICE)} ��                
												</td> 
							                  </tr>
							                  <tr>
							                    <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�������</td>
							                    <td bgcolor="eaeaea" class="table_bl_left" >${product.AREA_AFTER}��
												</td>                     
												<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�������</td>
							                    <td bgcolor="eaeaea" class="table_bl_left" >${product.RATE}
												</td> 
							                  </tr>                   
							                  
							                  
											<tr>
							                    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">���� �Ⱓ</td>
							                    <td bgcolor="eaeaea" class="table_bl_left" colspan="3">
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
							                 
							                  </tr>
							
												<tr>
							                    	<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">���� ����</br>���� �����</td>
								                    <td bgcolor="eaeaea" class="table_bl_left" >
								                     ${rnic:insertComma2(product.SUM_LASTYEAR)} ��
								                    
								                    
							
													</td>  
													<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">���⵵ �����</td>
								                    <td bgcolor="eaeaea" class="table_bl_left" >
								                    ${rnic:insertComma2(product.SUM_YEAR)} ��
							
													</td>                   
												</tr>  
							
							                  <tr>
							                    <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">���� ���</td>
							                    <td bgcolor="eaeaea" class="table_bl_left" >${product.ADJUSTMENT}
							
												</td>                     
												<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">���� �����</td>
							                    <td bgcolor="eaeaea" class="table_bl_left" >${rnic:insertComma2(product.SUM_ADJUST)} ��
							
												</td> 
							                  </tr> 
							                   <tr>
							                    <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�⺻ �����</td>
							                    <td colspan="3" bgcolor="eaeaea" class="table_bl_left" > ${product.FORM}
							
												</td>
												
							                  </tr> 
							                  
							                  
							                  
							                  
							                  <tr>
								                <td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">���� �����</td>
							                    <td colspan="3"  bgcolor="eaeaea" class="table_bl_left" >${product.FORM_ADJUST}
							
												</td> 
												
							                  </tr>
							                  
							                  
							                </table></td>
							              </tr>
							            
							              <tr>              
							                <td height="40" align="right">
								                <table border="0" width="100%">
								                	<tr>
								                	<td >
								                	
								                	<td >
														<input type="text" NAME="YEAR" ID="YEAR"  >
							
														</td>
														
														<td >													
														<img src="/img/junggibun_calculation.gif" alt="����� ����" border="0" onclick="javascript:goTempInsert()" style="cursor:pointer" >
																				</td>
									                </td>

										                <td width="50">
										                
										                <!-- c:if test="${showModify == 'true'}"-->
							                        		<img src="/img/mod_icon.gif" alt="����" border="0" onclick="javascript:goModify('${no}','${seq}','${currentPage}','${countPerPage}','${year}');" style="cursor:pointer" >
										            	<!-- /c:if-->	
										                
										                
										                </td>

									                </tr>
									                
									                
									             </table>
											</td>
							              </tr>
							              <tr>
							              <td>
							              <iframe name='iframe1' frameborder="NO" border="0" framespacing="0" 
							              src="/jumyong/junggi/reduction.do?cal_sum_seq=${sum_seq}" width="100%" height="100" scrolling="NO"></iframe></td>
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
	</html>            
