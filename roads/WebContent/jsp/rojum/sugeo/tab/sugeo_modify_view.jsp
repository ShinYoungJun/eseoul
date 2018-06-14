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
	background-image: url/img/left_back.gif);
}
-->

</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
</head>

<script language="javascript" src="/js/PopupCalendar.js"></script>
<script language='JavaScript' src='/js/Check_inputbox.js'></script>
<script language='JavaScript' src='/jsp/gapan/sugeo/tab/sugeo_register.js'></script>

<script type="text/javascript">
//<![CDATA[
    
    
    //select의 option을 선택된 값으로 지정
    function setSelectedOption(obj, val){
		for(i = 0 ; i < obj.options.length ; i++){
			if(obj.options[i].value == val){
				obj.options[i].selected = true;
				return;
			}
		}
	}
	
	
	
	function InitPage()
	{


		setSelectedOption(document.form.REM_BAD_YN, '${sugeo.REM_BAD_YN}');
		setSelectedOption(document.form.REM_SPCCD, '${sugeo.REM_SPCCD}');

	}

	function goSubmit(){

		var f = document.form;

		var str = "";


		if(form.CHG_ORG.value.length	< 1){
			str	+= "소속을 입력하세요\n";
			form.CHG_ORG.focus();
		}
		else if(form.CHG_NM.value.length	< 1){
			str	+= "직급/성명을 입력하세요\n";
			form.CHG_NM.focus();
		}
		if(form.TAX_SET.value.length	< 1){
			str	+= "세입구분을 선택하세요\n";
			form.TAX_SET.focus();
		}
		else if(form.REM_DATE.value.length	< 1){
			str	+= "수거날짜를 입력하세요\n";
			form.REM_DATE.focus();
		}
		else if(form.REM_DATE_HH.value.length	< 1){
			str	+= "수거시간을 입력하세요\n";
			form.REM_DATE_HH.focus();
		}
		else if(form.REM_DATE_MM.value.length	< 1){
			str	+= "수거 시간을 입력하세요\n";
			form.REM_DATE_MM.focus();
		}
		else if(form.REM_MULCD.value.length	< 1){
			str	+= "수거물품 유형을 입력하세요\n";
			form.REM_MULCD.focus();
		}
		else if(form.REM_MULNM.value.length	< 1){
			str	+= "수거물품명을 입력하세요\n";
			form.REM_MULNM.focus();
		}
		else if(form.REM_BJCD.value.length	< 1){
			str	+= "인접지 법정동을 선택하세요\n";
			form.REM_BJCD.focus();
		}
		else if(form.REM_HJCD.value.length	< 1){
			str	+= "인접지 행정동을 선택하세요\n";
			form.REM_HJCD.focus();
		}
		else if(form.REM_SPCCD.value.length	< 1){
			str	+= "번지 유형을 선택하세요\n";
			form.REM_SPCCD.focus();
		}
		else if(form.REM_BONBUN.value.length	< 1){
			str	+= "인접지 본번을 입력하세요\n";
			form.REM_BONBUN.focus();
		}
		else if(form.REM_AREA.value.length	< 1){
			str	+= "점용면적을 입력하세요\n";
			form.REM_AREA.focus();
		}
		else if(form.REM_SVFROM.value.length	< 1){
			str	+= "보관시작일을 입력하세요\n";
			form.REM_SVFROM.focus();
		}
		else if(form.REM_SVTO.value.length	< 1){
			str	+= "보관만료일을 입력하세요\n";
			form.REM_SVTO.focus();
		}
		else if(form.REM_BAD_YN.value.length	< 1){
			str	+= "변질물 유무를 입력하세요\n";
			form.REM_BAD_YN.focus();
		}

		if(str.length !=""){
			alert(str);
			return;
		}
        f.action = "/rojum/sugeo/sugeo_modify_prc.do?mul_no="+"${mul_no}";
        f.submit();
	}
    


			

//]]>
</script>


<body onload="InitPage();">

<form name="form" method="post">
<input type="hidden" name="mul_no" value="${mul_no}">
<input type="hidden" name="message" value="${message}">

<table width="800" border="0" cellpadding="0" cellspacing="0">
<tr>
<td align="left">
	<table width="780" border="0" cellspacing="0" cellpadding="0">
		<tr>
       		<td height="22" background="/img/tab_line_purple.gif">
       			<table border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td width="111"><a><img src="/img/sugeo_on.gif" alt="수거정보" width="110" height="22" border="0" onclick="Init();" style="CURSOR: Hand;"></a></td>
					
   			        </tr>
				</table>
			</td>
		</tr>
		
		<tr>
           	<td align="left" class="contborder_purple">
	
	
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td>
						<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse: collapse;" cellpadding="0" cellspacing="0" class="sub_table">
							<tr>
								<td height="30" colspan="4" align="left" bgcolor="#FFFFFF" class="">
									<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
										<tr>
											<td><span class="sub_stan_blue">&nbsp; * 담당정보</span></td>
										</tr>
									</table>
								</td>
							</tr>
							<tr>
								<td width="100" height="26" align="center" bgcolor="e5eff8"	class="sub_table_b">소속</td>
								<td width="250"  bgcolor="eaeaea" class="table_bl_left">
									<input name="CHG_ORG" type="text" class="essential" style="width: 120px" value="${sugeo.CHG_ORG}">
								</td>
								<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">직급/성명</td>
								<td width="250"  bgcolor="eaeaea" class="table_bl_left">
									<input name="CHG_NM" type="text" class="essential" style="width: 120px" value="${sugeo.CHG_NM}" maxlength="10">
								</td>
							</tr>

							<tr>
								<td height="30" colspan="4" align="left" bgcolor="#FFFFFF" class="">
								<table border="0" cellpadding="0" cellspacing="0"
									class="sub_stan">
									<tr>
										<td><span class="sub_stan_blue">&nbsp; * 수거정보</span></td>
									</tr>
								</table>
								</td>
							</tr>
							
							<tr>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">세입구분</td>
								<td bgcolor="eaeaea" class="table_bl_left" colspan="3">
									<select name="TAX_SET" style="width: 80px" class="essential">
										${taxation_section}
									</select> 
								</td>
							</tr>

							<tr>
								<td height="28" align="center" bgcolor="e5eff8"	class="sub_table_b">수거일시</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
										<tr>
											<td>
												<input id="REM_DATE" name="REM_DATE" type="text" class="essential" style="width: 120px" value="${sugeo.REM_DATE}" readonly>
											</td>
											<td>
												<a>
													<img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('REM_DATE'), 'yyyymmdd')" style="CURSOR: Hand;">
												</a>
											</td>
											<td>
												&nbsp;
												<input id="REM_DATE_HH" name="REM_DATE_HH" type="text" style="width: 15px" value="${sugeo.REM_DATE_HH}" maxlength="2" class="essential"> 시
											</td>
											<td>
												<input id="REM_DATE_MM" name="REM_DATE_MM" type="text" style="width: 15px" value="${sugeo.REM_DATE_MM}" maxlength="2" class="essential"> 분
											</td>
										</tr>
									</table>
								</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">수거물품</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									<select	name="REM_MULCD" style="width: 80px" class="essential">
										${re_typ}
									</select>
									<input type="text" name="REM_MULNM" style="width: 120px" value="${sugeo.REM_MULNM}" maxlength="50" class="essential">
								</td>
							</tr>
							<tr>
								<td height="26" align="center" bgcolor="e5eff8"	class="sub_table_b">수거위치</td>
								<td bgcolor="eaeaea" class="table_bl_left" colspan="3">${gu_nm } &nbsp;
									<select name="REM_BJCD" style="width: 80px" class="essential">
										${bjdong_code}
									</select> 
									<select name="REM_HJCD" style="width: 80px" class="essential">
										${hjdong_code}
									</select>
									/
									<select name="REM_SPCCD" style="width: 80px" class="essential">
										<option value="">::전체::</option>
										<option value="1">일반번지</option>
										<option value="2">산번지</option>
									</select>
									
									<input name="REM_BONBUN" type="text" class="essential" value="${sugeo.REM_BONBUN}" style="width:40px" maxlength="4">
									-
									<input name="REM_BUBUN" type="text" class="input_form1" value="${sugeo.REM_BUBUN}" style="width:40px" maxlength="4">
									번지
									
								</td>
							</tr>
							<tr>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">주변정보</td>
								<td bgcolor="eaeaea" class="table_bl_left" colspan="1">
									<input name="REM_ADDR_INFO" type="text" class="input_form1" value="${sugeo.REM_ADDR_INFO}" style="width:250px" maxlength="50">
								</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">점용면적</td>
								<td bgcolor="eaeaea" class="table_bl_left" colspan="1">
									<input name="REM_AREA" type="text" class="essential" style="width: 120px" value="${sugeo.REM_AREA}" onKeyDown="nr_num_float(this);" onKeyUp="nr_num_float(this);" onKeyPress="nr_num_float(this);" maxlength="10"> ㎡
								</td>
							</tr>
							<tr>
								<td height="26" align="center" bgcolor="e5eff8"	class="sub_table_b">보관기간</td>
								<td bgcolor="eaeaea" class="table_bl_left">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
										<td>
											<input name="REM_SVFROM" type="text" class="essential" style="width: 80px" value="${sugeo.REM_SVFROM}" readonly onChange="showDate('1')">
										</td>
										<td>
											<a>
												<img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('REM_SVFROM'), 'yyyymmdd')" style="CURSOR: Hand;">
											</a>
										</td>
										<td>
											<input name="REM_SVTO" type="text" class="essential" style="width: 80px" value="${sugeo.REM_SVTO}" readonly onChange="showDate('1')">
										</td>
										<td>
										<a>
										<img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('REM_SVTO'), 'yyyymmdd')"	style="CURSOR: Hand;">
										</a>
										</td>
										<td><span id="REM_SV_DATE"></span></td>
									</tr>
								</table>
								</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">보관장소</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									<input name="REM_SVPLACE" type="text" class="input_form1" style="width: 120px" value="${sugeo.REM_SVPLACE}" maxlength="25">
								</td>
							</tr>
							<tr>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">변질물 보관유무</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									<select id="REM_BAD_YN" name="REM_BAD_YN" style="width: 80px" class="essential">
										<option value="0">미대상</option>
										<option value="1">대상</option>
									</select>
								</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">변질물 내용</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									<input name="REM_BAD_BIGO" id="REM_BAD_BIGO" type="text" value="${sugeo.REM_BAD_BIGO}" class="input_form1" style="width:240px">
								</td>
							</tr>
							<tr>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">특이사항</td>
								<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
									<input name="REM_BIGO" type="text" value="${sugeo.REM_BIGO}" class="input_form1" style="width:500px" maxlength="50">
								</td>
							</tr>

							<tr>
								<td height="30" colspan="4" align="left" bgcolor="#FFFFFF" class="">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
										<td><span class="sub_stan_blue">&nbsp; * 소유자 정보</span></td>
									</tr>
								</table>
								</td>
							</tr>
							
							<tr>
								<td height="26" align="center" bgcolor="e5eff8"	class="sub_table_b">소유자명</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									<input name="REM_OWNER_NM" type="text" class="input_form1" style="width: 120px" value="${sugeo.REM_OWNER_NM}">
								</td>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">주민번호</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									<input name="REM_OWNER_SSN1" type="text" class="input_form1" style="width:40px" onkeydown="javascript:nr_num_int(this);" value="${sugeo.REM_OWNER_SSN1}" maxlength="6">
									-
									<input name="REM_OWNER_SSN2" type="text" class="input_form1" style="width:46px" onkeydown="javascript:nr_num_int(this);" value="${sugeo.REM_OWNER_SSN2}" maxlength="7">
								</td>
							</tr>
							
							<tr>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
										<tr>
								  			<td>
								  				<input name="REM_OWNER_ZIP" type="text" class="input_form1" style="width:45px" value="${sugeo.REM_OWNER_ZIP}" readonly>
							  					<a href="javascript:openZipcodePopup('form.REM_OWNER_ZIP', 'form.REM_OWNER_ADDR1');">
							  					<img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a>
						  					</td>
										</tr>
									</table>
								</td>
							<td align="center" bgcolor="e5eff8" class="sub_table_b">주소</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<input name="REM_OWNER_ADDR1" type="text" class="input_form1" style="width:250px" onFocus="Jumin_toaddr_Check();" value="${sugeo.REM_OWNER_ADDR1}" readonly>
								<input name="REM_OWNER_ADDR2" type="text" class="input_form1" style="width:250px" value="${sugeo.REM_OWNER_ADDR2}">
							</td>
						  </tr>
						  
						  <tr>
								<td height="26" align="center" bgcolor="e5eff8"	class="sub_table_b">전화번호</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									<input name="REM_OWNER_TEL" type="text" class="input_form1" style="width: 120px" value="${sugeo.REM_OWNER_TEL}" maxlength="20">
								</td>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">핸드폰번호</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									<input name="REM_OWNER_HP" type="text" class="input_form1" style="width:120px" value="${sugeo.REM_OWNER_HP}" maxlength="20">
								</td>
							</tr>


						</table>
						</td>
					</tr>
					<tr>
						<td height="40" align="right">
							<img src="/img/save_icon2.gif" alt="저장 " border="0" onclick="javascript:goSubmit();" style="cursor:pointer" >
							<img src="/img/can_icon.gif" alt="취소" border="0" onclick="javascript:history.back();" style="cursor:pointer" >
						</td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
	</td>
	</tr>
</form>
</table>
</body>
</html>

