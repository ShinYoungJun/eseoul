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
	background-image: url/img/left_back.gif);
}
-->
</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
</head>
<script type="text/javascript" src="/js/jquery-1.6.1.js"></script>
<script language="javascript" src="/js/PopupCalendar.js"></script>
<script language='JavaScript' src='/js/Check_inputbox.js'></script>
<script language="javascript" src="/js/Ajax_request.js"></script>
<script language='JavaScript' src='/jsp/gapan/jumyong/tab/info_register.js'></script>
<script language="javascript" src="/js/zipcode.js"></script>
<script language="javascript" src="/js/common.js"></script>
<!-- 20140424 DORO_NM  -->
<script language="javascript" src="/js/zipcode.js"></script>
<script type="text/javascript">

function	RegisterPrc()
{
	var	result	= DataCheck();
	//var result	=	"true";

	if(result	==	false)
		return false;
	
	var form = document.form;
	
	//수정 끝
	
	//form.action = "info_registerprc.do";
	form.action = "/gapan/jumyong/info_registerprc.do";
	form.submit();

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

</script>


<body>
<form id="form" name="form" method="post" enctype="multipart/form-data">
<table width="800" border="0" cellpadding="0" cellspacing="0">
<tr>
	<td align="left">
		<table width="780" border="0" cellspacing="0" cellpadding="0">
   			<tr>
	        	<td height="22" background="/img/tab_line_purple.gif">
	        		<table border="0" cellspacing="0" cellpadding="0">
						<tr>
						<ul id="tabmenu">
							<td width="111"><a><img src="/img/sub_gapan_title4_on.gif" alt="운영자 정보" width="110" height="22" border="0" onclick="Init(); " style="CURSOR: Hand;"></a></td>
						</ul>
						</tr>
					</table>
				</td>
			</tr>
		
		<tr>
            <td align="left" class="contborder_purple">
	
	
		<div id="tabcontents">
			<div class="tabcontent" id="tab2">
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
	                <tr>
	                  	<td>
	                  	<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
					  	<tr>
							<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">운영자명</td>
							<td width="37%" bgcolor="eaeaea" class="table_bl_left">
								<input name="OWNER_NAME" type="text" class="essential" style="width:150px" value="${NAME}" maxlength="35">
								<input name="OWNER_IDCHK" type="checkbox" value="1" checked onclick="javascript:click_idchk(this);">신분증 확인
							</td>
							<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b" rowspan="3">
								<table>
									<tr><td>운영자 사진</td></tr>
									<tr>
										<td>
											<br><br>
											<!-- span onclick="javascript:document.getElementById('file1').click();" style="overflow:hidden; background-repeat:no-repeat; cursor: pointer;"-->
											<span style="overflow:hidden; background-repeat:no-repeat; cursor: pointer;">
												<!-- img src="/img/file_icon.gif" align="absmiddle" alt="파일첨부하기"-->
												<!-- input type='file' id="file1" name='OWNER_IMG' style="width:0;height:5;filter:alpha(opacity=0); CURSOR:hand;" onchange='ChangeImg(); attach(this);'-->
											</span>
											
										</td>
									</tr>
								</table>
							</td>
							<td bgcolor="eaeaea" class="table_bl_left" rowspan="3" align="center">
								<table>
									<tr>
										<td><input type='file' id="file1" name='OWNER_IMG' 	style="width:10;" onchange='ChangeImg(); attach(this);'></td>
									</tr>
									<tr>
										<td width=100 height=130 id="tblview" style="background-image:url(1.jpg); background-repeat:no-repeat; background-attachment:scroll; background-position:50% 50%;"></td>
									</tr>
								</table>
							</td>
						</tr>
						<tr>
							<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">주민등록번호</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<input id="OWNER_SSN1" name="OWNER_SSN1" type="text" class="essential" style="width:40px; ime-mode:disabled" value="${OWNER_SSN1}" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, OWNER_SSN2, 6);" maxlength="6">
							  - <input id="OWNER_SSN2" name="OWNER_SSN2" type="password" class="essential" style="width:90px; ime-mode:disabled" value="${OWNER_SSN2}" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);" maxlength="7">
							</td>
					  	</tr>
					  	<tr>
							<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">성별(나이)</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<input name="OWNER_GENDER" type="radio" value="1" checked>남
								<input name="OWNER_GENDER" type="radio" value="2" >여
								&nbsp;( <input name="OWNER_AGE" class="input_form1" type="text" style="width:20px" maxlength="3" value="${OWNER_AGE}" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);"> 세)
							</td>
					  	</tr>
					  	<tr>
							<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">전화번호</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<input name="OWNER_TEL1" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, OWNER_TEL2, 3);" maxlength="3"> - 
								<input name="OWNER_TEL2" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, OWNER_TEL3, 4);" maxlength="4"> - 
								<input name="OWNER_TEL3" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, OWNER_HP1, 4);" maxlength="4">
							</td>
							<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">휴대전화</td>
							<td bgcolor="eaeaea" class="table_bl_left" colspan="3">
								<input name="OWNER_HP1" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, OWNER_HP2, 3);" maxlength="3"> - 
								<input name="OWNER_HP2" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, OWNER_HP3, 4);" maxlength="4"> - 
								<input name="OWNER_HP3" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);" maxlength="4">
							</td>
					  	</tr>
					  	<tr>
					  		<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">담당 구청</td>
					  		<td bgcolor="eaeaea" class="table_bl_left" colspan="3">
					  			<select id="GU_CD" name="GU_CD" class="essential" style="width:140px" nowrap="nowrap">
									${GU_CD}
								</select>
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
									  	<input name="ADDR_CHECK1" type="checkbox" value="1" onclick="javascript:Jumin_toaddr_Check()" checked>
									  	주민등록지 주소 정보와 동일 
									  </td>
									</tr>
								</table>
							</td>
					  	</tr>
					  	<tr>
							<!-- 20140602 gapan register kny -->
							<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
							<td bgcolor="eaeaea" class="table_bl_left">
							   <table width="100%" border="0" cellpadding="0" cellspacing="0" class="sub_stan">                                            
									<tr>
										<td width="50px"><input id="OWNER_POST" name="OWNER_POST" type="text" style="width:50px" onFocus="Jumin_toaddr_Check();" onKeyPress="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" onchange="Jumin_toaddr_Check();"  readonly class="input_form1"></td>
										<td width="50px"><a href="javascript:openZipcodePopup_new('form.OWNER_POST', 'form.OWNER_ADDR1', 'form.ADDR1_NEW', 'form.SI', 'form.GUN', 'form.DORO_NM', 'form.BD_NM','form.EMD_NM','form.OWNER_BONBUN', 'form.OWNER_BUBUN' );"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td>
										<td align="right"><a href="javascript:addrConfirm('OWNER_POST','SI','GUN','EMD_NM','DORO_NM','OWNER_BONBUN','OWNER_BUBUN','BD_BON','BD_BU','BD_NM','BD_DET_NM','OWNER_ADDR1','OWNER_ADDR2','ADDR1','form')"><img src="/img/ok_icon.gif" alt="확인" width="56" height="18" border="0"></a></td>
									</tr>
								    </table>							
							</td>
							
							<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
							<td bgcolor="eaeaea" class="table_bl_left">
						
							    <table  width="100%" border="0" cellpadding="0" cellspacing="0" class="sub_stan">
								<tr>
									<td width="50px"><input id="OWNER_TOPOST" name="OWNER_TOPOST" type="text" style="width:50px" onFocus="Jumin_toaddr_Check();" onKeyPress="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  onchange="Jumin_toaddr_Check();"  readonly class="input_form1"></td>                                                    
									<td width="50px"><a href="javascript:openZipcodePopup_new('form.OWNER_TOPOST', 'form.OWNER_TOADDR1', 'form.TOADDR1_NEW', 'form.TOSI', 'form.TOGUN', 'form.TODORO_NM', 'form.TOBD_NM','form.TOEMD_NM', 'form.OWNER_TOBONBUN', 'form.OWNER_TOBUBUN');"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td>
									<td align="right"><a href="javascript:addrConfirm('OWNER_TOPOST','TOSI','TOGUN','TOEMD_NM','TODORO_NM','OWNER_TOBONBUN','OWNER_TOBUBUN','TOBD_BON','TOBD_BU','TOBD_NM','TOBD_DET_NM','OWNER_TOADDR1','OWNER_TOADDR2','TOADDR1','form')"><img src="/img/ok_icon.gif" alt="확인" width="56" height="18" border="0"></a></td>																		   
								</tr>
							    </table>								
							</td>
					  	</tr>
					  	<tr>
 					<!-- 주민등록지 기본 주소 -->                                    
                       <td align="center" bgcolor="e5eff8" class="sub_table_b">기본 주소</td>
                       <td bgcolor="eaeaea" class="table_bl_left">
                           <input id="OWNER_ADDR1" name="OWNER_ADDR1" type="text" class="input_form1" style="width:245px" onFocus="Jumin_toaddr_Check();" onKeyPress="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  readonly>
                           <br>산<input id="OWNER_SAN" name="OWNER_SAN" type="checkbox"  onclick="Jumin_toaddr_Check();"  onFocus="Jumin_toaddr_Check();" onKeyPress="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();">&nbsp;<input id="OWNER_BONBUN" name="OWNER_BONBUN"  type="text" class="input_form1" style="width:27px" style="ime-mode:disabled" onFocus="Jumin_toaddr_Check(); nr_num_int(this); count_check(this, OWNER_BUBUN, 4);" onKeyUp="Jumin_toaddr_Check(); nr_num_int(this); count_check(this, OWNER_BUBUN, 4);" onKeyPress="Jumin_toaddr_Check(); nr_num_int(this); count_check(this, OWNER_BUBUN, 4);" maxlength="4">&nbsp;-&nbsp;<input id="OWNER_BUBUN" name="OWNER_BUBUN"  type="text" class="input_form1" style="width:27px" style="ime-mode:disabled" onFocus="Jumin_toaddr_Check(); nr_num_int(this); count_check(this, OWNER_BUBUN, 4);" onKeyUp="Jumin_toaddr_Check(); nr_num_int(this); count_check(this, OWNER_ADDR2, 4);" onKeyPress="Jumin_toaddr_Check(); nr_num_int(this); count_check(this, OWNER_ADDR2, 4);" maxlength="4">&nbsp;<input id="OWNER_ADDR2" name="OWNER_ADDR2" type="text" class="input_form1" style="width:100px" onFocus="Jumin_toaddr_Check();" onKeyPress="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  maxlength="50">
						<!--  //********** BEGIN_현진_20120212 -->
						<input type="hidden" id="SI" name="SI">
						<input type="hidden" id="GUN" name="GUN">
						<input type="hidden" id="DORO_NM" name="DORO_NM">
								      
						<input type="hidden" id="TOSI" name="TOSI">
						<input type="hidden" id="TOGUN" name="TOGUN">
						<input type="hidden" id="TODORO_NM" name="TODORO_NM">
						                                            
						<input type="hidden" id="EMD_NM" name="EMD_NM">
						<input type="hidden" id="TOEMD_NM" name="TOEMD_NM">
						<!--   //********** END_현진_20120212 -->						

						<!-- 실제거주지 기본 주소 -->  
                            <td align="center" bgcolor="e5eff8" class="sub_table_b">기본 주소</td>
                            <td bgcolor="eaeaea" class="table_bl_left">
                                <input id="OWNER_TOADDR1" name="OWNER_TOADDR1" type="text" class="input_form1" style="width:245px" onFocus="Jumin_toaddr_Check();" onKeyPress="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  readonly>
                                <br>산<input type="checkbox"  id="OWNER_TOSAN" name="OWNER_TOSAN"  onclick="Jumin_toaddr_Check();"  onFocus="Jumin_toaddr_Check();" onKeyPress="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();">&nbsp;<input id="OWNER_TOBONBUN" name="OWNER_TOBONBUN"  type="text" class="input_form1" style="width:27px" style="ime-mode:disabled" onFocus="Jumin_toaddr_Check(); nr_num_int(this);" onKeyUp="Jumin_toaddr_Check(); nr_num_int(this); count_check(this, OWNER_TOBUBUN, 4);" onKeyPress="Jumin_toaddr_Check(); nr_num_int(this); count_check(this, OWNER_TOBUBUN, 4);" maxlength="4">&nbsp;-&nbsp;<input id="OWNER_TOBUBUN" name="OWNER_TOBUBUN"  type="text" class="input_form1" style="width:27px" style="ime-mode:disabled" onFocus="Jumin_toaddr_Check(); nr_num_int(this);" onKeyUp="Jumin_toaddr_Check(); nr_num_int(this); count_check(this, OWNER_TOADDR2, 4);" onKeyPress="Jumin_toaddr_Check(); nr_num_int(this); count_check(this, OWNER_TOADDR2, 4);" maxlength="4">&nbsp;<input id="OWNER_TOADDR2" name="OWNER_TOADDR2" type="text" class="input_form1" style="width:100px"  onFocus="Jumin_toaddr_Check();" onKeyPress="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" maxlength="50">
                            </td>
					  	</tr>
					  	<tr>
                            <!-- 주민등록지 도로명 주소 -->
							<td height="45px" align="center" bgcolor="e5eff8" class="sub_table_b">도로명 주소</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<input id="ADDR1" name="ADDR1_NEW" type="text" class="essential" style="width:250px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  readonly>
	 							<input id="BD_BON" name="BD_BON" type="text" class="essential" style="width:25px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" >
								-
								<input id="BD_BU" name="BD_BU" type="text" class="input_form1" style="width:25px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  >
								<input id="BD_NM" name="BD_NM" type="text" class="input_form1" style="width:135px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  maxlength="50">
								<input id="BD_DET_NM" name="BD_DET_NM" type="text" class="input_form1" style="width:135px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  maxlength="50">
								
							</td>
							<!-- 실제거주지 도로명 주소 -->
							<td align="center" bgcolor="e5eff8" class="sub_table_b">도로명 주소</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<input id="TOADDR1" name="TOADDR1_NEW" type="text" class="essential" style="width:250px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  readonly>
	 							<input id="TOBD_BON" name="TOBD_BON" type="text" class="essential" style="width:25px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" >
								-
								<input id="TOBD_BU" name="TOBD_BU" type="text" class="input_form1" style="width:25px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  >
								<input id="TOBD_NM" name="TOBD_NM" type="text" class="input_form1" style="width:135px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  maxlength="50">
								<input id="TOBD_DET_NM" name="TOBD_DET_NM" type="text" class="input_form1" style="width:135px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  maxlength="50">
							</td>
					  	</tr>
					  	<tr>
						  	<td height="34" colspan="4" align="left" bgcolor="#FFFFFF" class="">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
									  <td width="50%">
									  	<span class="sub_stan_blue">* 생활정도</span>
									  </td>
									</tr>
								</table>
							</td>
						</tr>
						<tr>
							<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">생활정도</td>
							<td width="37%" bgcolor="eaeaea" class="table_bl_left" nowrap="nowrap">
								<select name="LC_SEL" style="width:70px" class="input_form1">
									${lc_sel}
								</select>
								<input name="LC_TXT" type="text" class="input_form1" style="width:180px" value="${LC_TXT}" maxlength="25">
							</td>
							<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">주거정보</td>
							<td width="36%" bgcolor="eaeaea" class="table_bl_left">
								<select name="RT_SEL" style="width:70px" class="input_form1">
									${rt_sel}
								</select>
								<input name="RT_TXT" type="text" class="input_form1" style="width:180px" value="${RT_TXT}" maxlength="25">
							</td>
						</tr>
						<tr>
							<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">동산/부동산</td>
							<td width="37%" bgcolor="eaeaea" class="table_bl_left" nowrap="nowrap">
								<input name="ESTATE_MOVE" type="text" class="input_form1" style="width:90px" value="${ESTATE_MOVE}" maxlength="15" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);  comma_paste(this);" onKeyPress="nr_num_int(this);"> 원 / 
								<input name="ESTATE_REAL" type="text" class="input_form1" style="width:90px" value="${ESTATE_REAL}" maxlength="15" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);  comma_paste(this);" onKeyPress="nr_num_int(this);"> 원
							</td>
							<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">가판종류</td>
							<td width="36%" bgcolor="eaeaea" class="table_bl_left">
								<select id="GP_TYP" name="GP_TYP" class="essential" style="width:150px" nowrap="nowrap" disabled="disabled">
									<option value="001"> 보도상영업시설관리
									</option>
								</select>
							</td>
						</tr>
						<tr>
							<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">비고</td>
							<td width="37%" bgcolor="eaeaea" class="table_bl_left" nowrap="nowrap" colspan="3">
								<textarea name="NOTE" id="NOTE" class="input_form1" style="width:98%" onkeyup="displayBytes(500, 'NOTE');"></textarea> 
							</td>
						</tr>
						
	                  	</table>
	                  	</td>
				  	</tr>
				</table>
			</div>
		</div>
		</td>
		</tr>
	</table></td>
	</tr>
</table>

</form>

</body>
</html>


