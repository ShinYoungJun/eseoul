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
<script language="javascript" src="/js/calculation.js"></script>
<script>

	
	function InitPage()
	{	

		// 수정일때 차수 수정 못하도록 
		if( document.getElementById("mode").value == 'edit' ){			
			document.getElementById("VIO_DEG").disabled = "true";
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

	// 저장하기
	function goSave(){

		var f = document.form;

		if( f.VIO_DEG.value == "" ){
			alert("조치 차수를 선택하세요. ");
			f.VIO_DEG.focus();
			return;
		}
		if( f.VIO_ACTCD.value == "" ){
			alert("조치 구분을 선택하세요. ");
			f.VIO_ACTCD.focus();
			return;
		}
		if( f.VIO_AREA.value == "" ){
			alert("면적을 넣어주세요. ");
			f.VIO_AREA.focus();
			return;
		}
		if( f.VIO_POINTS.value == "" ){
			f.VIO_POINTS.value = "0.0";
		}
		if( f.VIO_ACCPOINTS.value == "" ){
			f.VIO_ACCPOINTS.value = "0.0";
		}
		
		if( confirm("저장하시겠습니까? ") ){
			
			f.action = "/rojum/jumyong/violation_registerPrc.do";
			f.submit();
		}
	}

	// 리스트로
	function goList(){
		
		var f = document.form;
		var GAPAN_NO = document.getElementById("GAPAN_NO").value;
		var SEQ = document.getElementById("SEQ").value;
		f.action = "/rojum/jumyong/info_violation.do?GAPAN_NO="+GAPAN_NO+"&SEQ="+SEQ;
		f.submit();
	}

	
</script>

</head>

<body onload="InitPage();">



<form name="form" id="form" method="post">
<input type="hidden" name="GAPAN_NO" value="${GAPAN_NO}">
<input type="hidden" name="SEQ" value="${SEQ}">
<input type="hidden" name="mode"  value="${mode}">
<input type="hidden" name="currentPage" value="${currentPage }">
<input type="hidden" name="VIO_ACCPOINTS" value="${violation.VIO_ACCPOINTS }">

<table width="780" border="0" cellspacing="0" cellpadding="0">
	<tr>
		<td class="contborder_purple">	
			
			<table width="100%" border="0" cellspacing="0" cellpadding="0">		
				<tr>
	            	<td>
	                	<table width="100%" border="0"  cellpadding="0" cellspacing="0"  class="sub_table">
							<tr>
						    	<td width="10%" height="26" align="left"  class="sub_table_b">* 위반사항 </td>		
						    </tr>
						</table>	
	                </td>
	        	</tr>					              
				<tr>
                	<td>
                		<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
			                <tr>
			                    <td height="26" width="13%" align="center" bgcolor="e5eff8" class="sub_table_b">차수</td>
			                    <td width="32%" bgcolor="eaeaea" class="table_bl_left">
			                    	<select name="VIO_DEG" class="input_form1">
			                    		<option value="">::선택::</option>
			                    		<option value="1">1차</option>
			                    		<option value="2">2차</option>
			                    		<option value="3">3차</option>
			                    		<option value="4">4차</option>
			                    		<option value="5">5차</option>
			                    	</select>
			                    </td>
			                    
			                    <td height="26" width="13%" align="center" bgcolor="e5eff8" class="sub_table_b">조치구분</td>
			                    <td width="32%" bgcolor="eaeaea" class="table_bl_left">
			                    	<select name="VIO_ACTCD" class="input_form1">
			                    		${VI_SEL }
			                    	</select>
			                    </td>
                  			</tr>
                  			<tr>
                  				<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">위반일자</td>
			                    <td width="32%" bgcolor="eaeaea" class="table_bl_left" colspan="3">
			                    	<input type="text" name="VIO_DATE" class="input_form1" value="${violation.VIO_DATE }" readonly>
			                    	<img src="/img/calendar_icon.gif" onclick="popUpCalendar(this, document.getElementById('VIO_DATE'), 'yyyymmdd');" style="cursor:pointer" >
			                    </td> 
                  			</tr>
                  			<tr>
			                	<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b" >위반내용</td>
			                    <td bgcolor="eaeaea" class="table_bl_left" colspan="3">
			                    	<textarea name="VIO_CONTENT" style="width:90%;height:60px" class="input_form1">${violation.VIO_CONTENT }</textarea>
			                    </td>
                  			</tr>
                  			<tr>
			                	<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b" >조치일자</td>
			                    <td bgcolor="eaeaea" class="table_bl_left" colspan="3">
			                    	<input type="text" name="VIO_ACTDATE" class="input_form1" value="${violation.VIO_ACTDATE }" readonly>
			                    	<img src="/img/calendar_icon.gif" onclick="popUpCalendar(this, document.getElementById('VIO_ACTDATE'), 'yyyymmdd');" style="cursor:pointer" >
			                    </td>
                  			</tr>
                  			<tr>
			                	<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b" >조치내용</td>
			                    <td bgcolor="eaeaea" class="table_bl_left" colspan="3">
			                    	<textarea name="VIO_ACTCONTENT" style="width:90%;height:60px" class="input_form1">${violation.VIO_ACTCONTENT }</textarea>
			                    </td>
                  			</tr>
                  			
                  			<tr>
			                	<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b" >면적</td>
			                    <td bgcolor="eaeaea" class="table_bl_left" colspan="3">
			                    	<input type="text" name="VIO_AREA" size="20%" class="input_form1" maxlength="" value="${violation.VIO_AREA }" onKeyDown="onlyNumberInput();">
			                    </td>
                  			</tr>
                  			<tr>
			                    <td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">벌점</td>
			                    <td width="32%" width="13%"bgcolor="eaeaea" class="table_bl_left">
			                    	<input type="text" name="VIO_POINTS" class="input_form1" maxlength="55" value="${violation.VIO_POINTS }" onKeyDown="onlyNumberInput();">
			                    </td>
								<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">누적벌점</td>
			                    <td width="32%" bgcolor="eaeaea" class="table_bl_left">
			                    	${violation.VIO_ACCPOINTS }
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
<script language="javascript">
	function setSelectedOption(obj, val){
		for(i = 0 ; i < obj.options.length ; i++){
			if(obj.options[i].value == val){
				obj.options[i].selected = true;
				return;
			}
		}
	}
	setSelectedOption(document.form.VIO_DEG, '${violation.VIO_DEG}');
	setSelectedOption(document.form.VIO_ACTCD, '${violation.VIO_ACTCD}');

</script>

</html>
