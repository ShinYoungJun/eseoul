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
</head>

<script language="javascript" src="/js/PopupCalendar.js"></script>
<script language='JavaScript' src='/js/Check_inputbox.js'></script>
<script language="javascript" src="/js/Ajax_request.js"></script>
<!--  script language='JavaScript' src='/jsp/gapan/gapan/tab/info_register.js'></script-->
<script type="text/javascript">
//<![CDATA[
	function 	Init()
	{
		parent.Tab_Img("jumin");
	}

	function	ModifyPrc()
	{
		var form = document.form;

		form.action = "/gapan/jumyonginfo/jumin_modify_prc.do";
		form.submit();
	}

	function	Cancel(GAPAN_NO, GP_TYP)
	{
		var form = document.form;

		form.action = "/gapan/jumyonginfo/jumin_view.do?GAPAN_NO="+GAPAN_NO+"&GP_TYP="+GP_TYP;
		form.submit();
	}

	function	Jumin_toaddr_Check()
	{
		var form = document.form;
		var	chk	= document.form.ADDR_CHECK2.checked;
		
		if(chk	== true)
		{
			
			form.PARTN_TOPOST.value		= form.PARTN_POST.value;
			form.PARTN_TOADDR1.value	= form.PARTN_ADDR1.value;
			form.PARTN_TOADDR2.value	= form.PARTN_ADDR2.value;
			
			if(form.PARTN_SAN.checked == true){
				form.PARTN_SAN.value = "1";
				form.PARTN_TOSAN.checked = true;
				form.PARTN_TOSAN.value = "1";
			}else{
				form.PARTN_SAN.value = "0";
				form.PARTN_TOSAN.checked = false;
				form.PARTN_TOSAN.value = "0";
			}
			form.PARTN_TOBONBUN.value	= form.PARTN_BONBUN.value;
			form.PARTN_TOBUBUN.value	= form.PARTN_BUBUN.value;
			
			form.ADDR_CHECK2.value = "1";
		}
		else
		{
			form.ADDR_CHECK2.value = "0";
			
			if(form.PARTN_TOSAN.checked == true){
				form.PARTN_TOSAN.value = "1";
			}else{
				form.PARTN_TOSAN.value = "0";
			}
		}
	}
	
	function 	openZipcodePopup(post, addr)
	{
		var	post1	= post;
		var	addr1	= addr;

		var url 	= "/zipcode.do?openerPost=" + post1 + "&openerAddr=" + addr1;
		var winName = "우편번호입력";
		var width 	= 420;
		var height 	= 305;
		var scroll 	= "yes";
		var resize 	= "no";

		var	option	= "scrollbars=" + scroll + ", ";
		option	+= "resize=" + resize + ", ";
		option	+= "width=" + width + ", ";
		option	+= "height=" + height;

		window.open(url, winName, option);
	}

	//파일업로드 찾아보기 버튼 변경
	function ChangeImg2()
	{
	//  var fileName = document.sender.file.value; //일단 주소부분은 주석처리
		newImg = new Image(); //이미지 객체 생성
		imgFileSize = ""; 
		newImg.src = "";
		maxFileSize = 150*200;
		newImg.src = document.getElementById("file2").value
		var imgpath = document.form.PARTN_IMG.value;
		document.all["tblview2"].style.backgroundImage="url(" + imgpath + ")";
		document.all["tblview2"].style.backgroundRepeat="no-repeat";
		imgFileSize = newImg.fileSize;
	}
	
	function attach(obj) {
		/*
	    var val = obj.value;
	    //alert(obj.id);
	    //alert(document.getElementById(obj.id).value);	    
		file_size = get_file_check(document.getElementById(obj.id).value);	
		
		if(0 == file_size)
		{
			alert(file_size);
			alert(document.getElementById('file1').value);
			return;
		}

		document.getElementById('ATTACH_SIZE').value = CutDecimalPoint(file_size/1024);	    
	    document.getElementById('ATTACH_FILE').value = getNoDirFileName(val);
	    */
	}

	function ChangeImg(thisObj, preViewer) {
		
		if(!/(\.gif|\.jpg|\.jpeg|\.png)$/i.test(thisObj.value)) {
			alert("이미지 형식의 파일을 선택하십시오");
			return;
		}

		preViewer = (typeof(preViewer) == "object") ? preViewer : document.getElementById(preViewer);
		var ua = window.navigator.userAgent;

		if (ua.indexOf("MSIE") > -1) {
			var img_path = "";
			if (thisObj.value.indexOf("\\fakepath\\") < 0) {                 
				img_path = thisObj.value;
			} else {
				thisObj.select();
				var selectionRange = document.selection.createRange();
				img_path = selectionRange.text.toString();
				thisObj.blur();
			}
				preViewer.style.filter = "progid:DXImageTransform.Microsoft.AlphaImageLoader(src='fi" + "le://" + img_path + "', sizingMethod='scale')";
		} else {
			preViewer.innerHTML = "";
			var W = preViewer.offsetWidth;
			var H = preViewer.offsetHeight;
			var tmpImage = document.createElement("img");
			preViewer.appendChild(tmpImage);
	
			tmpImage.onerror = function () {
				return preViewer.innerHTML = "";
			}
	
			tmpImage.onload = function () {
	
				if (this.width > W) {
					this.height = this.height / (this.width / W);
					this.width = W;
				}
				if (this.height > H) {
					this.width = this.width / (this.height / H);
					this.height = H;
				}
			}
	        if (ua.indexOf("Firefox/3") > -1) {
				var picData = thisObj.files.item(0).getAsDataURL();
				tmpImage.src = picData;
			} else {
				tmpImage.src = "file://" + thisObj.value;
			}
		}
     }
    
//]]>
</script>

<body onkeyup="Init();">
<form name="form" method="post" enctype="multipart/form-data">
<table width="780" border="0" cellpadding="0" cellspacing="0">
<input type="hidden" name="GAPAN_NO" value="${GAPAN_NO}">
<input type="hidden" name="CORP_CD"  value="${CORP_CD}">
<input type="hidden" name="GU_CODE"  value="${GU_CODE}">
<input type="hidden" name="GP_TYP" value="${GP_TYP}">
<input type="hidden" name="PARTN_IMG_NAME" value="${board.PARTN_IMG_NAME}">

	<table width="780" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td align="left" class="contborder_purple">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
	                <td>
	                <table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0" class="sub_table">
						<tr>
							<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">동업자명</td>
							<td width="37%" bgcolor="eaeaea" class="table_bl_left" nowrap="nowrap">
								<input name="PARTN_NAME" type="text" class="input_form1" style="width:80px" value="${board.PARTN_NAME}" maxlength="10">
							</td>
							<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b" rowspan="4" nowrap="nowrap">
								<table>
									<tr><td>동업자 사진</td></tr>
									<tr>
										<td>
											<br><br>
											<span onclick="javascript:document.getElementById('file2').click();" style="overflow:hidden; background-repeat:no-repeat; cursor: pointer;">
												<!-- img src="/img/file_icon.gif" align="absmiddle" alt="파일첨부하기">
												<input type='file' id="file2" name='PARTN_IMG' style="width:0;height:5;filter:alpha(opacity=0); CURSOR:hand;" onchange='ChangeImg2(); attach(this);' value="${board.PARTN_IMG}"-->
											</span>
										</td>
									</tr>
								</table>
							</td>
							<td bgcolor="eaeaea" class="table_bl_left" rowspan="4" nowrap="nowrap" align="center">
								<table>
									<tr>
										<td><input type='file' id="file2" name='PARTN_IMG' 	style="width:10;" onchange="ChangeImg(this, 'tblview2'); attach(this);"></td>
									</tr>
									<tr>
										<td width=100 height=130 id="tblview2" style="background-image:url('${board.PARTN_IMG_NAME}'); background-repeat:no-repeat; background-attachment:scroll; background-position:50% 50%;"></td>
									</tr>
								</table>
							</td>
						</tr>
						<tr>
							<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">동업관계</td>
							<td width="37%" bgcolor="eaeaea" class="table_bl_left" nowrap="nowrap">
								<select name="PT_SEL" style="width:70px" class="input_form1">
									${pt_sel}
								</select>
							</td>
						</tr>
						<tr>
							<td align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">주민번호</td>
							<td bgcolor="eaeaea" class="table_bl_left" nowrap="nowrap">
								<input name="PARTN_SSN1" type="text" class="input_form1" style="width:40px; ime-mode:disabled" value="${board.PARTN_SSN1}" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, PARTN_SSN2, 6);" maxlength="6">
								 - <input name="PARTN_SSN2" type="text" class="input_form1" style="width:45px; ime-mode:disabled" value="${board.PARTN_SSN2}" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);" maxlength="7"></td>
						</tr>
						<tr>
						  	<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">성별(나이)</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<c:if test="${board.PARTN_GENDER == '1'}"><input name="PARTN_GENDER" type="radio" value="1" checked>남<input name="PARTN_GENDER" type="radio" value="2">여</c:if>
								<c:if test="${board.PARTN_GENDER == '2'}"><input name="PARTN_GENDER" type="radio" value="1">남<input name="PARTN_GENDER" type="radio" value="2" checked>여</c:if>
								&nbsp;( <input name="PARTN_AGE" class="input_form1" type="text" style="width:20px" maxlength="3" value="${board.PARTN_AGE}" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);"> 세)
							</td>
						</tr>
						<tr>
						  	<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">전화번호</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<input name="PARTN_TEL1" value="${board.PARTN_TEL1}" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, PARTN_TEL2, 3);" maxlength="3"> - 
								<input name="PARTN_TEL2" value="${board.PARTN_TEL2}" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, PARTN_TEL3, 4);" maxlength="4"> - 
								<input name="PARTN_TEL3" value="${board.PARTN_TEL3}" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, PARTN_HP1, 4);" maxlength="4">
							</td>
							<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">휴대전화</td>
							<td bgcolor="eaeaea" class="table_bl_left" colspan='3'>
								<input name="PARTN_HP1" value="${board.PARTN_HP1}" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, PARTN_HP2, 3);" maxlength="3"> - 
								<input name="PARTN_HP2" value="${board.PARTN_HP2}" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, PARTN_HP3, 4);" maxlength="4"> - 
								<input name="PARTN_HP3" value="${board.PARTN_HP3}" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);" maxlength="4">
							</td>
						</tr>
						<tr>
							<td height="34" colspan="2" align="left" bgcolor="#FFFFFF" class="">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
									  <td width="50%">
									  	<span class="sub_stan_blue">* 주민등록지 주소</span>
									  </td>
									</tr>
								</table>
							</td>
							<td height="34" colspan="2" align="left" bgcolor="#FFFFFF" class="">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
									  <td width="50%">
									  	<span class="sub_stan_blue">* 실제거주지 : </span>
									  	<c:if test="${board.ADDR_CHECK2 == '1'}">
									  		<input name="ADDR_CHECK2" type="checkbox" onclick="javascript:Jumin_toaddr_Check()"  value="1" checked>
									  	</c:if>
									  	<c:if test="${board.ADDR_CHECK2 != '1'}">
									  		<input name="ADDR_CHECK2" type="checkbox" onclick="javascript:Jumin_toaddr_Check()" value="0">
									  	</c:if>
									  	주민등록지 주소 정보와 동일 
									  </td>
									</tr>
								</table>
							</td>
					  	</tr>
						<tr>
							<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
									  <td><input name="PARTN_POST" type="text" class="input_form1" style="width:50px" onFocus="Jumin_toaddr_Check();" value="${board.PARTN_POST}" onchange="Jumin_toaddr_Check();"  value="${board.PARTN_POST}" readonly></td>
									  <td><a href="javascript:openZipcodePopup('form.PARTN_POST', 'form.PARTN_ADDR1');"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td>
									</tr>
								</table>
							</td>
							<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
   									  <td><input name="PARTN_TOPOST" type="text" style="width:50px" onFocus="Jumin_toaddr_Check();" value="${board.PARTN_TOPOST}" readonly class="input_form1"></td>
									  <td><a href="javascript:openZipcodePopup('form.PARTN_TOPOST', 'form.PARTN_TOADDR1');"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td>
									</tr>
								</table>
							</td>
					  	</tr>
					  	<tr>
							<td align="center" bgcolor="e5eff8" class="sub_table_b">기본 주소</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<input name="PARTN_ADDR1" type="text" class="input_form1" style="width:250px" value="${board.PARTN_ADDR1}" readonly>
								산
								<c:if test="${board.PARTN_SAN == '1'}">
									<input type="checkbox"  class="input_form1" name="PARTN_SAN" onclick="Jumin_toaddr_Check();" value="${board.PARTN_SAN}" checked="checked">
								</c:if>
								<c:if test="${board.PARTN_SAN != '1'}">
									<input type="checkbox"  class="input_form1" name="PARTN_SAN" onclick="Jumin_toaddr_Check();" value="${board.PARTN_SAN}">
								</c:if>
								<input name="PARTN_BONBUN" value="${board.PARTN_BONBUN}" type="text" class="input_form1" style="width:27px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="Jumin_toaddr_Check();nr_num_int(this);count_check(this, PARTN_BUBUN, 4);" onKeyPress="nr_num_int(this);" maxlength="4">
								- <input name="PARTN_BUBUN" value="${board.PARTN_BUBUN}" type="text" class="input_form1" style="width:27px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="Jumin_toaddr_Check();nr_num_int(this);count_check(this, PARTN_ADDR2, 4);" onKeyPress="nr_num_int(this);" maxlength="4">
								<input name="PARTN_ADDR2" type="text" class="input_form1" style="width:130px" value="${board.PARTN_ADDR2}" onKeyUp="Jumin_toaddr_Check();" maxlength="50">
							</td>
							<td align="center" bgcolor="e5eff8" class="sub_table_b">기본 주소</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<input name="PARTN_TOADDR1" type="text" class="input_form1" style="width:250px" value="${board.PARTN_TOADDR1}" readonly>
								산
								<c:if test="${board.PARTN_TOSAN == '1'}">
									<input type="checkbox"  class="input_form1" name="PARTN_TOSAN" onclick="Jumin_toaddr_Check();" value="${board.PARTN_TOSAN}" checked="checked">
								</c:if>
								<c:if test="${board.PARTN_TOSAN != '1'}">
									<input type="checkbox"  class="input_form1" name="PARTN_TOSAN" onclick="Jumin_toaddr_Check();" value="${board.PARTN_TOSAN}">
								</c:if>
								<input name="PARTN_TOBONBUN" value="${board.PARTN_TOBONBUN}" type="text" class="input_form1" style="width:27px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="Jumin_toaddr_Check();nr_num_int(this);count_check(this, PARTN_BUBUN, 4);" onKeyPress="nr_num_int(this);" maxlength="4">
								- <input name="PARTN_TOBUBUN" value="${board.PARTN_TOBUBUN}" type="text" class="input_form1" style="width:27px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="Jumin_toaddr_Check();nr_num_int(this);count_check(this, PARTN_ADDR2, 4);" onKeyPress="nr_num_int(this);" maxlength="4">
								<input name="PARTN_TOADDR2" type="text" class="input_form1" style="width:130px" value="${board.PARTN_TOADDR2}" onKeyUp="Jumin_toaddr_Check();" maxlength="50">
							</td>
					  	</tr>
                	</table>
                	</td>
				</tr>
				<tr>
					<td height="40" align="right">
					<table width="0" border="0" cellspacing="0" cellpadding="0" align="right">
				  		<a href="javascript:Cancel('${board.GAPAN_NO}', '${board.GP_TYP}')"><img src="/img/can_icon.gif" alt="취소" width="56" height="18" border="0"></a>
				  		<a href="javascript:ModifyPrc()"><img src="/img/save_icon2.gif" alt="저장" width="56" height="18" border="0"></a>
				  	</table>
				  	</td>
				</tr>
			</table>
		</td>
	</tr>
	</table>
</form>
</body>
</html>