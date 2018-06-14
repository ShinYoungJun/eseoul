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
<script language='JavaScript' src='/js/Check_inputbox.js'></script>
<script language="javascript" src="/js/PopupCalendar.js"></script>
<script>

	
	function InitPage()
	{	
		/*if(document.getElementById("mode1").value == "add"  )
		{
			document.getElementById("edit").style.visibility = "visible";
			document.getElementById("view").style.visibility = "hidden";
		
		}else if(document.getElementById("mode1").value == "edit" || document.getElementById("mode1").value == "add"  )
		{
			document.getElementById("edit").style.visibility = "visible";
			document.getElementById("view").style.visibility = "hidden";
		}else
		{
			document.getElementById("edit").style.visibility = "hidden";
			document.getElementById("view").style.visibility = "visible";
		}*/

	}
	
	// 등록폼 체크
	function checkForm(){
		var form1 = document.form1;
		alert(form1.year.value);

		form1.submit();
		//	특수문자 입력시 글 끝에 공백과 줄바꿈을 넣어야 깨지지 않음. 이유는 모르겠슴
		//		w.content.value = w.content.value+' '+'\n';	
		
	}

	// 저장하기
	function goSave(){

		/*if( document.form.GUBUN.value == "" ){
			alert("구분값을 선택하세요. ");
			return;
		}
		if( document.form.WORK_ID.value == "" ){
			alert("주민번호를 넣으세요. ");
			return;
		}
		if( document.form.WORK_ID.value.length < 13 ){
			alert("주민번호를 확인하세요. ");
			return;
		}*/
		if( confirm("저장하시겠습니까? ") ){
			var f = document.form;
			f.action = "/jumyong/jumyong/history_registerPrc.do";
			f.submit();
		}
	}

	// 리스트로
	function goList(){
		var f = document.form;
		f.action = "/jumyong/jumyong/history_view.do";
		f.submit();
	}

	
</script>

</head>

<body onload="InitPage();">



<form id="form" name="form" method="post">
<input type="hidden" id="ADMIN_NO" name="ADMIN_NO" value="${ADMIN_NO}">
<input type="hidden" id="SEQ" name="SEQ" value="${SEQ}">
<input type="hidden" id="mode" name="mode"  value="${mode}">
<input type="hidden" id="currentPage" name="currentPage" value="${currentPage }">

<table width="780" border="0" cellspacing="0" cellpadding="0">
	<tr>
		<td class="contborder_purple">	
			
			<table width="100%" border="0" cellspacing="0" cellpadding="0">		
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
			                <tr>
			                    <td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">등록날짜</td>
			                    <td width="32%" bgcolor="eaeaea" class="table_bl_left">
			                    	<input type="text" id="WRITEDATE" name="WRITEDATE" class="input_form1" value="${date }" readonly>
			                    	<img src="/img/calendar_icon.gif" onclick="popUpCalendar(this, document.getElementById('WRITEDATE'), 'yyyymmdd');" style="cursor:pointer" >
			                    </td>
								<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">담당자명</td>
			                    <td width="32%" bgcolor="eaeaea" class="table_bl_left" >
			                    	<input type="text" id="WORK_NM" name="WORK_NM" class="input_form1" value="${product.WORK_NM }">
			                    </td> 
                  			</tr>
                  			<tr>
			                	<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b" >근거</td>
			                    <td bgcolor="eaeaea" class="table_bl_left" colspan="3">
			                    	<input type="text" id="GUNGE" name="GUNGE" value="${product.GUNGE }" size="83%" class="input_form1" maxlength="55">
			                    </td>
                  			</tr>
                  			<tr>
			                	<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b" >사유</td>
			                    <td bgcolor="eaeaea" class="table_bl_left" colspan="3">
			                    	<input type="text" id="SAYU"  name="SAYU" value="${product.SAYU }" size="83%" class="input_form1" maxlength="55">
			                    </td>
                  			</tr>
						</table>
					</td>
				</tr>
				<tr>
                	<td height="40" align="right">
                		<img src="/img/save_icon2.gif" alt="저장" width="56" height="18" border="0" onClick="javascript:goSave();"  style="cursor:pointer">
                		<img src="/img/list_icon2.gif" alt="리스트" width="56" height="18" border="0" onClick="javascript:goList();"  style="cursor:pointer">
	                </td>
              	</tr>
			</table>
		</td>
	</tr>
</table>
            
            
</form>

</body>
</html>

