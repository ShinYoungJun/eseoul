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
<!--  //********** BEGIN_현진_20120212 -->
<script language="javascript" src="/js/zipcode.js"></script>
<!--   //********** END_현진_20120212 -->   

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

	function	Cancel(GAPAN_NO)
	{
		var form = document.form;

		form.action = "/gapan/jumyonginfo/jumin_view.do?GAPAN_NO="+GAPAN_NO;
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
			
			form.PTADDR1_NEW.value	= form.ADDR1_NEW.value;
			form.PTSI.value	= form.PSI.value;
			form.PTGUN.value	= form.PGUN.value; 
			form.PTDORO_NM.value	= form.p_DORO_NM.value;
			form.PTBD_NM.value	= form.p_BD_NM.value;
			form.PTBD_DET_NM.value	= form.p_BD_DET_NM.value;
			//********** BEGIN_현진_20120402
			form.PTDONG.value	= form.PDONG.value;
			form.PTRI.value	= form.PRI.value;
			//********** END_현진_20120402
			form.PTBD_BON.value	= form.p_BD_BON.value;
			form.PTBD_BU.value	= form.p_BD_BU.value;
			
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
    //********** BEGIN_현진_20120212
    /*	
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

	
	function openZipcodePopup_new(post, addr, addr_new, si, gu, doro, bd)
	{ 
		var	post1	= post;
		var	addr1	= addr;
		var	addr1_new	= addr_new;
		var	addr1_si	= si;
		var	addr1_gu	= gu;
		var	addr1_doro	= doro;
		var	addr1_bd	= bd;
		
		 
		
		//var url 	= "/zipcode.do?openerPost=" + post1 + "&openerAddr=" + addr1+ "&openerAddrNew=" + addr1_new+ "&openerSi=" + addr1_si+ "&openerGu=" + addr1_gu+ "&openerDoro=" + addr1_doro+"&openerBd=" + addr1_bd;
		var url 	= "/zipCode_New.do?openerPost=" + post1 + "&openerAddr=" + addr1+ "&openerAddrNew=" + addr1_new+ "&openerSi=" + addr1_si+ "&openerGun=" + addr1_gu+ "&openerDoro=" + addr1_doro+"&openerBd=" + addr1_bd;
		
		//alert('url ='+url);
		
		var winName = "우편번호입력";
		//var width 	= 420;
		var width 	= 840;
		var height 	= 305;
		var scroll 	= "yes";
		var resize 	= "no";

		var	option	= "scrollbars=" + scroll + ", ";
		option	+= "resize=" + resize + ", ";
		option	+= "width=" + width + ", ";
		option	+= "height=" + height;

		window.open(url, winName, option);
		 
	}
    */
    //********** END_현진_20120212
     
	//파일업로드 찾아보기 버튼 변경
	function ChangeImg2()
	{
	//  var fileName = document.sender.file.value; //일단 주소부분은 주석처리
		newImg = new Image(); //이미지 객체 생성
		imgFileSize = ""; 
		newImg.src = "";
		maxFileSize = 150*200;
		newImg.src = document.getElementById("file2").value;
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
			};
	
			tmpImage.onload = function () {
	
				if (this.width > W) {
					this.height = this.height / (this.width / W);
					this.width = W;
				}
				if (this.height > H) {
					this.width = this.width / (this.height / H);
					this.height = H;
				}
			};
	        if (ua.indexOf("Firefox/3") > -1) {
				var picData = thisObj.files.item(0).getAsDataURL();
				tmpImage.src = picData;
			} else {
				tmpImage.src = "file://" + thisObj.value;
			}
		}
     }
	//********** BEGIN_현진_20120809
	function InfoDel(){
		var form = document.form;			
		
		form.PARTN_NAME.value	= "";
		form.PARTN_IMG_NAME.value = "";
		form.PARTN_SSN1.value	= "";
		form.PARTN_SSN2.value	= "";
		
		form.PARTN_TEL1.value	= "";
		form.PARTN_TEL2.value	= "";
		form.PARTN_TEL3.value	= "";

		form.PARTN_HP1.value	= "";
		form.PARTN_HP2.value	= "";
		form.PARTN_HP3.value	= "";

		form.PARTN_POST.value		= "";
		form.PARTN_TOPOST.value		= "";
		form.PARTN_ADDR1.value	= "";
		form.PARTN_SAN.checked = false;
		form.PARTN_BONBUN.value	= "";
		form.PARTN_BUBUN.value	= "";
		form.PARTN_ADDR2.value	= "";
		form.PARTN_TOADDR1.value	= "";
		form.PARTN_TOSAN.checked = false;
		form.ADDR_CHECK2.checked = false;
		form.PARTN_TOBONBUN.value	= "";
		form.PARTN_TOBUBUN.value	= "";
		form.PARTN_TOADDR2.value	= "";
		form.ADDR1_NEW.value	= "";
		form.PSI.value	= "";
		form.PGUN.value	= "";
		form.p_DORO_NM.value	= "";
		form.PDONG.value	= "";
		form.PRI.value	= "";
		form.p_BD_BON.value	= "";
		form.p_BD_BU.value	= "";
		form.p_BD_NM.value	= "";
		form.p_BD_DET_NM.value	= "";
		form.PTADDR1_NEW.value	= "";
		form.PTSI.value	= "";
		form.PTGUN.value	= "";
		form.PTDORO_NM.value	= "";
		form.PTDONG.value	= "";
		form.PTRI.value	= "";
		form.PTBD_BON.value	= "";
		form.PTBD_BU.value	= "";
		form.PTBD_NM.value	= "";
		form.PTBD_DET_NM.value	= "";
			
	}
	//********** END_현진_20120809    
//]]>
</script>

<body onkeyup="Init();">
<form id="form" name="form" method="post" enctype="multipart/form-data">

<input type="hidden" id="GAPAN_NO" name="GAPAN_NO" value="${GAPAN_NO}">
<input type="hidden" id="GU_CODE" name="GU_CODE" value="${GU_CODE}">
<input type="hidden" id="PARTN_IMG_NAME" name="PARTN_IMG_NAME" value="${board.PARTN_IMG_NAME }">
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
								<input id="PARTN_NAME" name="PARTN_NAME" type="text" class="input_form1" style="width:80px" value="${board.PARTN_NAME}" maxlength="10">
							</td>
							<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b" rowspan="4" nowrap="nowrap">
								<table>
									<tr><td>동업자 사진</td></tr>
									<tr>
										<td>
											<br><br>
											<span onclick="javascript:document.getElementById('file2').click();" style="overflow:hidden; background-repeat:no-repeat; cursor: pointer;">
											</span>
										</td>
									</tr>
								</table>
							</td>
							<td bgcolor="eaeaea" class="table_bl_left" rowspan="4" nowrap="nowrap" align="center">
								<table>
									<tr>
										<td><input type='file' id="PARTN_IMG" name='PARTN_IMG' 	style="width:10;" onchange="ChangeImg(this, 'tblview2'); attach(this);"></td>
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
								<select id="PT_SEL" name="PT_SEL" style="width:70px" class="input_form1">
									${pt_sel}
								</select>
							</td>
						</tr>
						<tr>
							<td align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">주민번호</td>
							<td bgcolor="eaeaea" class="table_bl_left" nowrap="nowrap">
								<input id="PARTN_SSN1" name="PARTN_SSN1" type="text" class="input_form1" style="width:40px; ime-mode:disabled" value="${board.PARTN_SSN1}" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, PARTN_SSN2, 6);" maxlength="6">
								 - <input id="PARTN_SSN2" name="PARTN_SSN2" type="text" class="input_form1" style="width:45px; ime-mode:disabled" value="${board.PARTN_SSN2}" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);" maxlength="7"></td>
						</tr>
						<tr>
						  	<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">성별(나이)</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<c:if test="${board.PARTN_GENDER == '1'}"><input name="PARTN_GENDER" type="radio" value="1" checked>남<input name="PARTN_GENDER" type="radio" value="2">여</c:if>
								<c:if test="${board.PARTN_GENDER == '2'}"><input name="PARTN_GENDER" type="radio" value="1">남<input name="PARTN_GENDER" type="radio" value="2" checked>여</c:if>
								&nbsp;( <input id="PARTN_AGE" name="PARTN_AGE" class="input_form1" type="text" style="width:20px" maxlength="3" value="${board.PARTN_AGE}" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);"> 세)
							</td>
						</tr>
						<tr>
						  	<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">전화번호</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<input id="PARTN_TEL1" name="PARTN_TEL1" value="${board.PARTN_TEL1}" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, PARTN_TEL2, 3);" maxlength="3"> - 
								<input id="PARTN_TEL2" name="PARTN_TEL2" value="${board.PARTN_TEL2}" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, PARTN_TEL3, 4);" maxlength="4"> - 
								<input id="PARTN_TEL3" name="PARTN_TEL3" value="${board.PARTN_TEL3}" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, PARTN_HP1, 4);" maxlength="4">
							</td>
							<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">휴대전화</td>
							<td bgcolor="eaeaea" class="table_bl_left" colspan='3'>
								<input id="PARTN_HP1" name="PARTN_HP1" value="${board.PARTN_HP1}" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, PARTN_HP2, 3);" maxlength="3"> - 
								<input id="PARTN_HP2" name="PARTN_HP2" value="${board.PARTN_HP2}" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, PARTN_HP3, 4);" maxlength="4"> - 
								<input id="PARTN_HP3" name="PARTN_HP3" value="${board.PARTN_HP3}" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);" maxlength="4">
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
									  		<input id="ADDR_CHECK2"  name="ADDR_CHECK2" type="checkbox" onclick="javascript:Jumin_toaddr_Check()"  value="1" checked>
									  	</c:if>
									  	<c:if test="${board.ADDR_CHECK2 != '1'}">
									  		<input id="ADDR_CHECK2" name="ADDR_CHECK2" type="checkbox" onclick="javascript:Jumin_toaddr_Check()" value="0">
									  	</c:if>
									  	주민등록지 주소 정보와 동일 
									  </td>
									</tr>
								</table>
							</td>
					  	</tr>
					  	<!--  //********** BEGIN_현진_20120212 -->
                        <!-- 
						<tr>
							<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
									  <td><input id="PARTN_POST" name="PARTN_POST" type="text" class="input_form1" style="width:50px" onFocus="Jumin_toaddr_Check();" value="${board.PARTN_POST}" onchange="Jumin_toaddr_Check();"  value="${board.PARTN_POST}" readonly></td>
									  <td><a href="javascript:openZipcodePopup_new('form.PARTN_POST', 'form.PARTN_ADDR1', 'form.ADDR1_NEW', 'form.PSI', 'form.PGUN', 'form.p_DORO_NM', 'form.p_BD_NM');"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td>
									</tr>
								</table>
							</td>
							<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
   									  <td><input id="PARTN_TOPOST" name="PARTN_TOPOST" type="text" style="width:50px" onFocus="Jumin_toaddr_Check();" value="${board.PARTN_TOPOST}" readonly class="input_form1"></td>
									  <td><a href="javascript:openZipcodePopup_new('form.PARTN_TOPOST', 'form.PARTN_TOADDR1', 'form.PTADDR1_NEW', 'form.PTSI', 'form.PTGUN', 'form.PTDORO_NM', 'form.PTBD_NM');"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td>
									</tr>
								</table>
							</td>
					  	</tr>
					  	 -->
						<!--   //********** END_현진_20120212 -->
						<tr>
							<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<table width="100%" border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
										<td width="50px"><input id="PARTN_POST" name="PARTN_POST" type="text" class="input_form1" style="width:50px" onFocus="Jumin_toaddr_Check();" value="${board.PARTN_POST}" onchange="Jumin_toaddr_Check();"  value="${board.PARTN_POST}" readonly></td>
										<td width="50px"><a href="javascript:openZipcodePopup_new('form.PARTN_POST', 'form.PARTN_ADDR1', 'form.ADDR1_NEW', 'form.PSI', 'form.PGUN', 'form.p_DORO_NM', 'form.p_BD_NM','form.PDONG','form.PARTN_BONBUN', 'form.PARTN_BUBUN');"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td>
										<!--  sungh83 20131105 -->
										<td height ="13">%도로명주소건물본번,부번을입력시확인클릭</td>
							     		<!--  sungh83 20131105 --> 
										<td align="right"><a href="javascript:addrConfirm('PARTN_POST','PSI','PGUN','PDONG','p_DORO_NM','PARTN_BONBUN','PARTN_BUBUN','p_BD_BON','p_BD_BU','p_BD_NM','p_BD_DET_NM','PARTN_ADDR1','PARTN_ADDR2','ADDR1_NEW','form')"><img src="/img/ok_icon.gif" alt="확인" width="56" height="18" border="0"></a></td>								
									</tr>
								</table>
							</td>
							<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<table width="100%" border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
   									  	<td><input id="PARTN_TOPOST" name="PARTN_TOPOST" type="text" style="width:50px" onFocus="Jumin_toaddr_Check();" value="${board.PARTN_TOPOST}" readonly class="input_form1"></td>
									 	<td width="50px"><a href="javascript:openZipcodePopup_new('form.PARTN_TOPOST', 'form.PARTN_TOADDR1', 'form.PTADDR1_NEW', 'form.PTSI', 'form.PTGUN', 'form.PTDORO_NM', 'form.PTBD_NM','form.PTDONG', 'form.PARTN_TOBONBUN', 'form.PARTN_TOBUBUN' );"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td>
										<!--  sungh83 20131105 -->
										<td height ="13">%도로명주소건물본번,부번을입력시확인클릭</td>
							     		<!--  sungh83 20131105 --> 
										<td align="right"><a href="javascript:addrConfirm('PARTN_TOPOST','PTSI','PTGUN','PTDONG','PTDORO_NM','PARTN_TOBONBUN','PARTN_TOBUBUN','PTBD_BON','PTBD_BU','PTBD_NM','PTBD_DET_NM','PARTN_TOADDR1','PARTN_TOADDR2','PTADDR1_NEW','form')"><img src="/img/ok_icon.gif" alt="확인" width="56" height="18" border="0"></a></td>																				   									
									</tr>
								</table>
							</td>
					  	</tr>	
					  	<tr>
					  	<!-- 주민등록지 기본 주소 -->  
							<td align="center" bgcolor="e5eff8" class="sub_table_b">기본 주소</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<input id="PARTN_ADDR1" name="PARTN_ADDR1" type="text" class="input_form1" style="width:250px" value="${board.PARTN_ADDR1}" readonly>
								산
								<c:if test="${board.PARTN_SAN == '1'}">
									<input type="checkbox"  class="input_form1" id="PARTN_SAN" name="PARTN_SAN" onclick="Jumin_toaddr_Check();" value="${board.PARTN_SAN}" checked="checked">
								</c:if>
								<c:if test="${board.PARTN_SAN != '1'}">
									<input type="checkbox"  class="input_form1" id="PARTN_SAN" name="PARTN_SAN" onclick="Jumin_toaddr_Check();" value="${board.PARTN_SAN}">
								</c:if>
								<input id="PARTN_BONBUN" name="PARTN_BONBUN" value="${board.PARTN_BONBUN}" type="text" class="input_form1" style="width:27px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="Jumin_toaddr_Check();nr_num_int(this);count_check(this, PARTN_BUBUN, 4);" onKeyPress="nr_num_int(this);" maxlength="4">
								- <input id="PARTN_BUBUN" name="PARTN_BUBUN" value="${board.PARTN_BUBUN}" type="text" class="input_form1" style="width:27px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="Jumin_toaddr_Check();nr_num_int(this);count_check(this, PARTN_ADDR2, 4);" onKeyPress="nr_num_int(this);" maxlength="4">
								<input id="PARTN_ADDR2" name="PARTN_ADDR2" type="text" class="input_form1" style="width:130px" value="${board.PARTN_ADDR2}" onKeyUp="Jumin_toaddr_Check();" maxlength="50">
							</td>
							 <!-- 실제거주지 기본 주소 --> 
							<td align="center" bgcolor="e5eff8" class="sub_table_b">기본 주소</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<input id="PARTN_TOADDR1" name="PARTN_TOADDR1" type="text" class="input_form1" style="width:250px" value="${board.PARTN_TOADDR1}" readonly>
								산
								<c:if test="${board.PARTN_TOSAN == '1'}">
									<input type="checkbox"  class="input_form1" id="PARTN_TOSAN" name="PARTN_TOSAN" onclick="Jumin_toaddr_Check();" value="${board.PARTN_TOSAN}" checked="checked">
								</c:if>
								<c:if test="${board.PARTN_TOSAN != '1'}">
									<input type="checkbox"  class="input_form1" id="PARTN_TOSAN" name="PARTN_TOSAN" onclick="Jumin_toaddr_Check();" value="${board.PARTN_TOSAN}">
								</c:if>
								<input id="PARTN_TOBONBUN" name="PARTN_TOBONBUN" value="${board.PARTN_TOBONBUN}" type="text" class="input_form1" style="width:27px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="Jumin_toaddr_Check();nr_num_int(this);count_check(this, PARTN_BUBUN, 4);" onKeyPress="nr_num_int(this);" maxlength="4">
								- <input id="PARTN_TOBUBUN" name="PARTN_TOBUBUN" value="${board.PARTN_TOBUBUN}" type="text" class="input_form1" style="width:27px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="Jumin_toaddr_Check();nr_num_int(this);count_check(this, PARTN_ADDR2, 4);" onKeyPress="nr_num_int(this);" maxlength="4">
								<input id="PARTN_TOADDR2" name="PARTN_TOADDR2" type="text" class="input_form1" style="width:130px" value="${board.PARTN_TOADDR2}" onKeyUp="Jumin_toaddr_Check();" maxlength="50">
							</td>
					  	</tr>
					  	<tr>
					  	<!-- 주민등록지 도로명 새주소 -->
							<td height="45px" align="center" bgcolor="e5eff8" class="sub_table_b">도로명 주소</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<input id="ADDR1_NEW" name="ADDR1_NEW" type="text" value="${board.PSI}&nbsp;${board.PGUN}&nbsp;${board.p_DORO_NM}" class="essential" style="width:250px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  readonly>
	 							<!--  //********** BEGIN_현진_20120213 -->
	 							<input type="hidden"id="PSI" name="PSI" value="${board.PSI}">
								<input type="hidden"id="PGUN" name="PGUN" value="${board.PGUN}">
								<input type="hidden"id="p_DORO_NM" name="p_DORO_NM" value="${board.p_DORO_NM}">
								<!--   //********** END_현진_20120213 -->
								<!--  //********** BEGIN_현진_20120402 -->
								<input type="hidden" id="PDONG" name="PDONG" value="${board.PDONG}">
								<input type="hidden" id="PRI" name="PRI" value="${board.PRI}">
								<!--   //********** END_현진_20120402 -->
	 							<input id="p_BD_BON" name="p_BD_BON" type="text" VALUE="${board.p_BD_BON}" class="essential" style="width:25px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" >
								-
								<input id="p_BD_BU" name="p_BD_BU" type="text" VALUE="${board.p_BD_BU}" class="input_form1" style="width:25px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  >
								<input id="p_BD_NM" name="p_BD_NM" type="text" VALUE="${board.p_BD_NM}" class="input_form1" style="width:135px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  maxlength="50">
								<input id="p_BD_DET_NM" name="p_BD_DET_NM" type="text" VALUE="${board.p_BD_DET_NM}" class="input_form1" style="width:135px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  maxlength="50">
							</td>
							<!-- 실제거주지 도로명 새주소 -->
							<td align="center" bgcolor="e5eff8" class="sub_table_b">도로명 주소</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<input id="PTADDR1_NEW" name="PTADDR1_NEW" type="text" value="${board.PTSI}&nbsp;${board.PTGUN}&nbsp;${board.PTDORO_NM}&nbsp;" class="essential" style="width:250px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  readonly>
	 							<!--  //********** BEGIN_현진_20120213 -->
								<input type="hidden" id="PTSI" name="PTSI" value="${board.PTSI}">
								<input type="hidden" id="PTGUN" name="PTGUN" value="${board.PTGUN}">
								<input type="hidden" id="PTDORO_NM" name="PTDORO_NM" value="${board.PTDORO_NM}">
								<input type="hidden" id="PTDONG" name="PTDONG" value="${board.PTDONG}">	 							
								<input type="hidden" id="PTRI" name="PTRI" value="${board.PTRI}">
								<!--   //********** END_현진_20120213 -->
	 							<input id="PTBD_BON" name="PTBD_BON" type="text" value="${board.PTBD_BON}" class="essential" style="width:25px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" >
								-
								<input id="PTBD_BU" name="PTBD_BU" type="text" value="${board.PTBD_BU}" class="input_form1" style="width:25px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  >
								<input id="PTBD_NM" name="PTBD_NM" type="text" value="${board.PTBD_NM}" class="input_form1" style="width:135px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  maxlength="50">
								<input id="PTBD_DET_NM" name="PTBD_DET_NM" type="text" value="${board.PTBD_DET_NM}" class="input_form1" style="width:135px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  maxlength="50">
							</td>
					  	</tr>
                	</table>
                	</td>
				</tr>
				<tr>
					<td height="40" align="right">
						<!--  //********** BEGIN_현진_20120809 -->
						<a href="javascript:InfoDel()"><img src="/img/infoDel.gif" alt="정보삭제" width="64" height="18" border="0"></a>
				  		<!--   //********** END_현진_20120809 -->
				  		<a href="javascript:Cancel('${board.GAPAN_NO}')"><img src="/img/can_icon.gif" alt="취소" width="56" height="18" border="0"></a>
				  		<a href="javascript:ModifyPrc()"><img src="/img/save_icon2.gif" alt="저장" width="56" height="18" border="0"></a>
				  	</td>
				</tr>
			</table>
		</td>
	</tr>
	</table>
</form>
</body>
</html>