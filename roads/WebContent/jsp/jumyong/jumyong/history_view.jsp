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

<script>

	// 등록폼 체크
	function checkForm(){
		var form1 = document.form1;
		alert(form1.year.value);

		form1.submit();
		
	}

	// 추가폼 이동
	function goAdd(admin_no){
		
		document.form.action = "/jumyong/jumyong/history_register.do?ADMIN_NO="+admin_no+"&mode=add";
		document.form.submit();
	}

	// 페이지이동
	function	Page(page)
	{
		if(page	==	"")
			return;
		
		var ADMIN_NO = document.getElementById("ADMIN_NO").value;
		
		location.href="history_view.do?currentPage="+page+"&ADMIN_NO="+ADMIN_NO;
	}

	// 상세보기
	function goView(seq){
		
		var page = document.form.currentPage.value;
		var ADMIN_NO = document.getElementById("ADMIN_NO").value;
		location.href="history_view.do?currentPage="+page+"&SEQ="+seq+"&ADMIN_NO="+ADMIN_NO;
	}

	// 수정하기
	function goModify(seq){
		document.form.action = "/jumyong/jumyong/history_register.do?SEQ="+seq+"&mode=edit";
		document.form.submit();
	}
	
	// 삭제하기
	function goDelete(seq){
		if( confirm("삭제하시겠습니까? ") ){
			document.form.action = "/jumyong/jumyong/history_del.do?SEQ="+seq+"&mode=del";
			document.form.submit();
		}

	}
			
</script>

</head>

<body onload="InitPage();">

<form id="form" name="form" method="post">
<input type="hidden" id="ADMIN_NO" name="ADMIN_NO" value="${ADMIN_NO}">
<input type="hidden" id="message" name="message" value="${message}">
<input type="hidden" id = "mode" name="mode1" value="${mode}">
<input type="hidden" id="currentPage" name="currentPage" value="${currentPage }">
<input type="hidden" id="SECTION" name="SECTION" value="${SECTION}">


<table width="780" border="0" cellspacing="0" cellpadding="0">
	<tr>
		<td class="contborder_purple">	
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
               		<td>
               			<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                 			<tr>
		                   		<td height="30px" width="20%" align="center" bgcolor="e5eff8" class="sub_table_b">등록날짜</td>
		                   		<td width="300px" align="center" bgcolor="e5eff8" class="sub_table_b">근거</td>
		                   		<td align="center" bgcolor="e5eff8" class="sub_table_b">사유</td>
		                   	</tr>
                 			
                 			<c:choose>
							<c:when test='${historyList != null && !empty historyList}'>  
		                   	<c:forEach items="${historyList}" var="history" varStatus="idx">
                    		
                    		
                    		<c:choose>
							<c:when test="${history.SEQ != product.SEQ}">
                    		<tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" 
                    			onclick="goView('${history.SEQ}')" style="cursor:pointer">
							</c:when>
							<c:otherwise>
							<tr onclick="goView('${history.SEQ }')" bgcolor="#f6f7f8">
							</c:otherwise>
							</c:choose>
								<td height="26px" align="center">${history.WRITEDATE }</td>
		                       	<td align="center" title="${history.GUNGE }">${history.GUNGE_FIX }</td>
		                       	<td align="center" title="${history.SAYU }">${history.SAYU_FIX }</td>
                     		</tr> 
							</c:forEach>
							</c:when>
							<c:otherwise>
								<tr>
									<td align="center" class="sub_table" colspan="4" height="85"> 내용이 없습니다</td>
								</tr>
							</c:otherwise>
							</c:choose>
					
               			</table>
               		</td>
             	</tr>
             	<tr>
               		<td height="40" align="center">
               			<table width="100%" border="0" cellspacing="0" cellpadding="0">
                   			<tr>
                     			<td align="center">
                     				<table border="0" cellpadding="0" cellspacing="0">
                       				${pageing }
                     				</table>
                     			</td>
                     		</tr>
                 		</table>
                 	</td>
				</tr>
				<tr><td height="20"></td></tr>
				
				<c:if test="${ product != null }">
				<tr>
	            	<td>
	                	<table width="100%" border="0"  cellpadding="0" cellspacing="0"  class="sub_table">
							<tr>
						    	<td width="10%" height="26" align="left"  class="sub_table_b">* 변경 세부 내역</td>		
						    </tr>
						</table>	
	                </td>
	        	</tr>					              
				<tr>
                	<td>
                		<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                  			<!-- tr>
			                	<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b" >구분</td>
			                    <td width="42%" bgcolor="eaeaea" class="table_bl_left" colspan="3">
			                    	${product.GUBUN }
			                    </td>
                  			</tr-->
                  			<tr>
			                	<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b" >등록일자</td>
			                    <td width="42%" bgcolor="eaeaea" class="table_bl_left">
			                    	${product.WRITEDATE }
			                    </td>                  			
			                    <td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b" >담당자명</td>
			                    <td width="42%" bgcolor="eaeaea" class="table_bl_left" >
			                    	${product.WORK_NM }
			                    </td>
                  			</tr>
                  			<tr>
			                	<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b" >근거</td>
			                    <td width="42%" bgcolor="eaeaea" class="table_bl_left" colspan="3">
			                    	${product.GUNGE }
			                    </td>
                  			</tr>
                  			<tr>
			                	<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b" >사유</td>
			                    <td width="42%" bgcolor="eaeaea" class="table_bl_left" colspan="3">
			                    	${product.SAYU }
			                    </td>
                  			</tr>
                  			
                  			<tr>
			                	<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b" >수정일자</td>
			                    <td width="42%" bgcolor="eaeaea" class="table_bl_left" colspan="3">
			                    	${product.UP_DATE }
			                    </td>
                  			</tr>
						</table>
					</td>
				</tr>
				</c:if>
				
				<tr>              
                	<td height="40" align="right">
                		<c:if test="${SECTION != '4'}">
	                		<img src="/img/add_icon.gif" alt="추가" width="56" height="18" border="0" onClick="javascript:goAdd('${ADMIN_NO}');"  style="cursor:pointer">
	                		
	                		<c:if test="${ product.SEQ != null }">
	                			<img src="/img/mod_icon.gif" alt="수정" width="56" height="18" border="0" onClick="javascript:goModify('${product.SEQ}');"  style="cursor:pointer">
	                			<img src="/img/del_icon3.gif" alt="삭제" width="56" height="18" border="0" onClick="javascript:goDelete('${product.SEQ}');"  style="cursor:pointer">
		                	</c:if>
	                	</c:if>
	                </td>
              	</tr>
			</table>
		</td>
	</tr>
</table>
            
            
</form>

</body>
<script>

	function InitPage()
	{	
		var obj = document.form.message.value;
		
		if(obj != "")	
			alert(obj);
			return;

	}
</script>
</html>

