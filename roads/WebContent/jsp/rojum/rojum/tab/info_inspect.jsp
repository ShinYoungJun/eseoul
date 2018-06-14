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
<script>

	function submitClick()
	{
		
		//저장 사항 체크 
		
		if(getChecked('RESULT',0) || getChecked('RESULT',1) || getChecked('RESULT',2))
		{

			var inspectForm = document.inspectForm;
			inspectForm.submit();
		}else
		{
			alert("점검결과를 입력해 주십시오.");
		}
		
		//var radioObj = document.getElementById("RESULT");

	}
	
	function getChecked(nameVal,numVal)
	{
		return document.getElementsByName(nameVal)[numVal].checked
	}
	
	function subTabClick(hiddenSubTabName,visibleSubTabName)
	{	
		document.getElementById(hiddenSubTabName).style.display = 'none';	
		document.getElementById(visibleSubTabName).style.display = 'block';	
	}
	
	
	function InitPage()
	{	

		if(document.getElementById("mode").value == "add"  )
		{
			document.getElementById("edit").style.display = "block";
			document.getElementById("view").style.display = "none";
		}else if(document.getElementById("mode").value == "edit" || document.getElementById("mode").value == "add"  )
		{
			document.getElementById("edit").style.display = "block";
			document.getElementById("view").style.display = "none";
		}else
		{
			document.getElementById("edit").style.display = "none";
			document.getElementById("view").style.display = "block";
		}

	}
	// 등록폼 체크
	function checkForm(){
		var form1 = document.form1;
		alert(form1.year.value);

		form1.submit();
		//	특수문자 입력시 글 끝에 공백과 줄바꿈을 넣어야 깨지지 않음. 이유는 모르겠슴
		//		w.content.value = w.content.value+' '+'\n';	
		
	}
	
	function onlyNumberInput()
	{
		
		
	 var code = window.event.keyCode;
	
	 if ((code > 34 && code < 41) || (code > 47 && code < 58) || (code > 95 && code < 106) || code == 8 || code == 9 || code == 13 || code == 46 || code == 190 || code == 110|| code == 189|| code == 109)
	 {
	  	window.event.returnValue = true;
		return;
	 }else 
	 {	 
	 	window.event.returnValue = false;
	 	return;
 	 }
	}
	
	//confirm 을 확인,취소-> 예,아니오.
	function window.confirm(str) {

	 execScript('n = msgbox("'+str+'","4132")',"vbscript");
	 return(n == 6);
	}
	
	
	function goModify()
	{
		var year = '${product.YEAR}';
		var seq = document.getElementById("SEQ").value;

		location.href = "/jsp/gapan/gapan/tab/info_inspect.jsp?mode=edit";
	
		
//		location.href = "/jumyong/productInsert.do?no=${no}&currentPage=${currentPage}&countPerPage=${countPerPage}"
//		+"&mode=edit&year="+year+"&seq="+seq+"&section=${section}";
	}
	
	function goAdd()
	{
		var year = '${product.YEAR}';
		var seq = document.getElementById("SEQ").value;

		location.href = "/jsp/gapan/gapan/tab/info_inspect.jsp?mode=add";
	
		
//		location.href = "/jumyong/productInsert.do?no=${no}&currentPage=${currentPage}&countPerPage=${countPerPage}"
//		+"&mode=edit&year="+year+"&seq="+seq+"&section=${section}";
	}
	

	
</script>

</head>

<body onload="InitPage();">

<%String mode = request.getParameter("mode");%>	

<form name="inspectForm" id="inspectForm" method="post" action = "/jumyong/inspectEdit.do" >

<input name="no" value="${no}" type="hidden" >
<input name="mode"  id = "mode" value="<%=mode%>" type="hidden" >
<input name="seq"  id = "seq" value="${seq}" type="hidden" >

<div id="view" style="width:100%;">
<table width="780" border="0" cellspacing="0" cellpadding="0">          
          <tr>
            <td align="center" class="contborder_purple">
            
            
            


<table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                  <tr>
                    <td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">번호</td>
                    <td align="center" bgcolor="e5eff8" class="sub_table_b">점검결과</td>
                    <td align="center" bgcolor="e5eff8" class="sub_table_b">조사일자</td>
                    <td align="center" bgcolor="e5eff8" class="sub_table_b">조사자</td>
                    <td align="center" bgcolor="e5eff8" class="sub_table_b">현장조사 의견</td>
                    <td align="center" bgcolor="e5eff8" class="sub_table_b">담당자 의견</td>
                    <td align="center" bgcolor="e5eff8" class="sub_table_b">허가조건 </td>
                    </tr>
                    <c:forEach items="${iList}" var="board" varStatus="idx">
                      <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" 
                      onclick="javascript:location.href('/jumyong/inspectEdit.do?no=${no}&seq=${board.SEQ}&currentPage=${currentPage}&countPerPage=${countPerPage}');" style="cursor:pointer" >                     
                        <td height="26" align="center">${idx.count}</td>
                        <td align="center">${board.NAME}</td>
                        <td align="center">${rnic:addDash(board.INSPECT_DATE)}</td>
                        <td align="center">${board.INSPECTOR}</td>
                        <td align="center">${board.INSPECT_OPINION}</td>
                        <td align="center">${board.MANAGER_OPINION}</td>
                        <td align="center">${board.APPROVAL_CONDITION}</td>
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
              
              <tr>
                <td>
                <table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                  <tr>
                    <td width="15%" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">점검결과</td>
                    <td bgcolor="eaeaea" class="table_bl_left" colspan="3" align="left">
                        <input type="radio" name="RESULT_VIEW" id="RESULT_VIEW" disabled="true" value="1" <c:if test="${inspect.RESULT == '1' }"> checked </c:if>  > 허가
	                	<input type="radio" name="RESULT_VIEW" id="RESULT_VIEW" disabled="true" value="2" <c:if test="${inspect.RESULT == '2' }"> checked </c:if>  > 불허
	                	<input type="radio" name="RESULT_VIEW" id="RESULT_VIEW" disabled="true" value="3" <c:if test="${inspect.RESULT == '3' }"> checked </c:if>  > 보류
					</td>                    
                  </tr>
                  <tr>
                    <td width="15%" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">조사자</td>
                    <td width="35%" bgcolor="eaeaea" class="table_bl_left" align="left">${inspect.INSPECTOR}</td>
                    <td width="15%" align="center" bgcolor="e5eff8" class="sub_table_b">조사일자</td>
                    <td width="35%" bgcolor="eaeaea" class="table_bl_left" align="left">${inspect.INSPECT_DATE}</td>
                  </tr>
                 <tr>
                    <td height="60" align="center" bgcolor="e5eff8" class="sub_table_b">현장조사 의견</td>
                    <td bgcolor="eaeaea" class="table_bl_left" colspan="3" align="left">${inspect.INSPECT_OPINION}</td>                    
                  </tr>  
                  <tr>
                    <td height="60" align="center" bgcolor="e5eff8" class="sub_table_b">담당자 의견</td>
                    <td bgcolor="eaeaea" class="table_bl_left" colspan="3" align="left">${inspect.MANAGER_OPINION}</td>                     
                  </tr> 
                  <tr>
                    <td height="60" align="center" bgcolor="e5eff8" class="sub_table_b">허가조건</td>
                    <td bgcolor="eaeaea" class="table_bl_left" colspan="3" align="left">${inspect.APPROVAL_CONDITION}</td>                     
                  </tr>                                
                </table></td>
              </tr>
              
              <tr>              
                <td height="40" align="right">
	                <table border="0" width="100%">
	                	<tr>
	                	<td >
			               	<img src="/img/add_icon.gif" alt="추가" border="0" onclick="javascript:goAdd()" style="cursor:pointer" >
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

            </td>
          </tr>
        
</table>
            
            
</div>



<div id="edit" style="width:100%;display:none;">
<table width="780" border="0" cellspacing="0" cellpadding="0">          
          <tr>
            <td align="center" class="contborder_purple">
            


<table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                  <tr>
                    <td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">번호</td>
                    <td align="center" bgcolor="e5eff8" class="sub_table_b">점검결과</td>
                    <td align="center" bgcolor="e5eff8" class="sub_table_b">조사일자</td>
                    <td align="center" bgcolor="e5eff8" class="sub_table_b">조사자</td>
                    <td align="center" bgcolor="e5eff8" class="sub_table_b">현장조사 의견</td>
                    <td align="center" bgcolor="e5eff8" class="sub_table_b">담당자 의견</td>
                    <td align="center" bgcolor="e5eff8" class="sub_table_b">허가조건 </td>
                    </tr>
                    <c:forEach items="${iList}" var="board" varStatus="idx">	                      
                      <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''">
                      <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" 
                      onclick="javascript:location.href('/jumyong/inspectEdit.do?no=${no}&seq=${board.SEQ}');" style="cursor:pointer" >                     
                        <td height="26" align="center">${idx.count}</td>
                        <td align="center">${board.RESULT}</td>
                        <td align="center">${rnic:addDash(board.INSPECT_DATE)}</td>
                        <td align="center">${board.INSPECTOR}</td>
                        <td align="center">${board.INSPECT_OPINION}</td>
                        <td align="center">${board.MANAGER_OPINION}</td>
                        <td align="center">${board.APPROVAL_CONDITION}</td>
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
              
              <tr>
                <td>
                
                
                <table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                  <tr>
                    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">점검결과</td>

                    <td bgcolor="eaeaea" class="table_bl_left" colspan="3" align="left">

                        <input type="radio" name="RESULT" id="RESULT" value="1"	<c:if test="${inspect.RESULT == '1' }"> checked </c:if>  > 허가
	                	<input type="radio" name="RESULT" id="RESULT" value="2" <c:if test="${inspect.RESULT == '2' }"> checked </c:if>  > 불허
	                	<input type="radio" name="RESULT" id="RESULT" value="3" <c:if test="${inspect.RESULT == '3' }"> checked </c:if>  > 보류

					</td>                    
                  </tr>                             
                  
                  <tr>
                    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">조사자</td>
                    <td bgcolor="eaeaea" class="table_bl_left" align="left">

	                   <input name="INSPECTOR" type="text" class="input_form1" style="width:120px" value="${inspect.INSPECTOR}">

	                </td>
                    <td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">조사일자</td>
                    <td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan" align="left">
                        <tr>
                          <td>

        	                  	<input name="INSPECT_DATE" type="text" class="input_form1" style="width:120px" value="${inspect.INSPECT_DATE}"  style="ime-mode:disabled;" onKeyDown="onlyNumberInput();" maxlength=10 >

                          </td>
							<td>
                    			<img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('INSPECT_DATE'), 'yyyymmdd');" style="cursor:pointer" >
                    		</td>
                        </tr>
                    </table></td>
                  </tr>
                 <tr>
                    <td width="100" height="60" align="center" bgcolor="e5eff8" class="sub_table_b">현장조사 의견</td>
                    <td bgcolor="eaeaea" class="table_bl_left" colspan="3"  align="left">

	                    	<textarea name="INSPECT_OPINION" id="INSPECT_OPINION"  class="input_form1" style="width:600px"  cols="70" rows="3"  wrap="VIRTUAL" style="ime-mode:active;" >${inspect.INSPECT_OPINION}</textarea>

					</td>                    
                  </tr>  
                  <tr>
                    <td width="100" height="60" align="center" bgcolor="e5eff8" class="sub_table_b">담당자 의견</td>
                    <td bgcolor="eaeaea" class="table_bl_left" colspan="3"  align="left">

                    	<textarea name="MANAGER_OPINION" id="MANAGER_OPINION" class="input_form1" style="width:600px"  cols="70" rows="3" wrap="VIRTUAL" style="ime-mode:active;" >${inspect.MANAGER_OPINION}</textarea>

					</td>
                  </tr> 
                  <tr>
                    <td width="100" height="60" align="center" bgcolor="e5eff8" class="sub_table_b">허가조건</td>
                    <td bgcolor="eaeaea" class="table_bl_left" colspan="3"  align="left">

                    	<textarea name="APPROVAL_CONDITION" id="APPROVAL_CONDITION" class="input_form1" style="width:600px"  cols="70" rows="3" wrap="VIRTUAL" style="ime-mode:active;" >${inspect.APPROVAL_CONDITION}</textarea>

					</td>                     
                  </tr>                                
                </table></td>
              </tr>
              
              
              
              <tr>
                <td height="40" align="right">
                	<img src="/img/can_icon.gif" alt="취소" border="0" onclick="javascript:history.back();" style="cursor:pointer" >                
					<img src="/img/save_icon2.gif" alt="저장" width="56" height="18" border="0"
	                onClick="javascript:submitClick();"  style="cursor:pointer">
                
                
                </td>
              </tr>
            </table>
            
            
            
            </td>
          </tr>
          
</table>
            
            
            
</div>

</form>

</body>
</html>

