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
}
-->

</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
</head>
<script language='JavaScript' src='/js/Check_inputbox.js'></script>
<script type="text/javascript">
//<![CDATA[
	function 	Init()
	{
		parent.Tab_Img("unyong");

		if( '${board.OWNER_IMG_NAME }' != '' ){
			img_resize();
		}
	}
	
	function	Modify(gapanno)
	{
		var form = document.form;

		form.action = "/gapan/jumyonginfo/unyong_modify.do?GAPAN_NO="+gapanno;
		form.submit();
	}


	var w, h;
	var max_w = 150; //창의 가로크기, 이미지의 최대 크기가 된다.
	img_src = "${filePath }${board.OWNER_IMG_NAME }"; //이미지의 주소, img1의 src속성과 같아야 한다.
	
	function img_resize()
	{
		var i = eval(document.all.img1);
	 	w = i.width;
	 	h = i.height;
		if(w > max_w)
	 	{
	  		i.width = max_w;
	 	}
	}
	
	
	function resize_popup()
	{
	 	w_dummy = w + 20; //스크롤바를 위해서 팝업창의 가로길이를 20픽셀 추가한다.
	 	with( window.open("","madi_image",'height='+h+',width='+w_dummy+',scrollbars=yes,resizable=yes') )
	 	{
	  	document.write("<body topmargin=0 rightmargin=0 bottommargin=0 leftmargin=0>","<a href='#' alt='클릭하시면 창이 닫힙니다.'><img src='"+img_src+"' hspace=0 vspace=0 border=0 onclick='window.close();'></a>","</body>");
	  	focus();
	 	}
	}


//]]>
</script>

<body onload="Init()">

<form id="form" name="form" method="post">
	<input type="hidden" id="GAPAN_NO" name="GAPAN_NO" value="${GAPAN_NO}">
	<input type="hidden" id="GU_CODE" name="GU_CODE" value="${GU_CODE}">

	<table width="780" border="0" cellpadding="0" cellspacing="0">
		<tr>
			<td align="left" class="contborder_purple">
			
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
				  <td>
				  
					<table width="100%" border="0" cellspacing="0" cellpadding="0">
	                <tr>
	                  	<td>
	                  	<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;table-layout:fixed;" cellpadding="0" cellspacing="0"  class="sub_table">
					  	<tr>
							<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">운영자명</td>
							<td width="37%" bgcolor="eaeaea" class="table_bl_left">${board.OWNER_NAME}
								<c:if test="${board.OWNER_IDCHK == '1'}"> 
									(신분증 확인)
								</c:if>
							</td>
							<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b" rowspan="3">
								<table>
									<tr><td>운영자 사진</td></tr>
									<tr>
										<td>
											<br><br>
											<span onclick="javascript:document.getElementById('file1').click();" style="overflow:hidden; background-repeat:no-repeat; cursor: pointer;">
											</span>
										</td>
									</tr>
								</table>
							</td>
							<td bgcolor="eaeaea" class="table_bl_left" rowspan="3" align="center">
								<table>
									<tr>
										<td width="100" height="130" style="background-position:50% 50%;" >
											<c:if test="${board.OWNER_IMG_NAME != null }">
												<img src="${filePath }${board.OWNER_IMG_NAME }" id="img1" name="img1" onload="img_resize();" onclick="resize_popup();" style="cursor:hand">
											</c:if>
										</td>
									</tr>
								</table>
							</td>
						</tr>
						<tr>
							<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">주민등록번호</td>
							<td bgcolor="eaeaea" class="table_bl_left">${board.OWNER_SSN}</td>
					  	</tr>
					  	<tr>
							<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">성별(나이)</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<c:if test="${board.OWNER_GENDER == '1'}">남</c:if>
								<c:if test="${board.OWNER_GENDER == '2'}">여</c:if>
								<c:if test="${board.OWNER_AGE != null}">&nbsp;(${board.OWNER_AGE} 세)</c:if>
							</td>
					  	</tr>
					  	<tr>
							<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">전화번호</td>
							<td bgcolor="eaeaea" class="table_bl_left">${board.OWNER_TEL}</td>
							<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">휴대전화</td>
							<td bgcolor="eaeaea" class="table_bl_left">${board.OWNER_HP}</td>
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
									  	<c:if test="${board.ADDR_CHECK1 == '1'}">
									  		주민등록지 주소 정보와 동일
									  	</c:if>
									  	<c:if test="${board.ADDR_CHECK1 != '1'}">
									  		주민등록지 주소 정보와 동일하지 않음
									  	</c:if>
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
									  <td>${board.OWNER_POST}</td>
									</tr>
								</table>
							</td>
							<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
									  <td>${board.OWNER_TOPOST}</td>
									</tr>
								</table>
							</td>
					  	</tr>
					  	<tr>
							<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">기본 주소</td>
							<td bgcolor="eaeaea" class="table_bl_left" height="40px">
								${board.OWNER_ADDR1}<br>	
								<c:if test="${board.OWNER_SAN == '1'}">
									산
								</c:if>
								<!-- OWNER_BONBUN + OWNER_BUBUN = OWNER_JIBUN -->
								${board.OWNER_JIBUN} ${board.OWNER_ADDR2}
							</td>
							<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">기본 주소</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								${board.OWNER_TOADDR1}<br> 
								<c:if test="${board.OWNER_TOSAN == '1'}">
									산
								</c:if>
								<!-- OWNER_TOBONBUN + OWNER_TOBUBUN = OWNER_TOJIBUN -->
								${board.OWNER_TOJIBUN} ${board.OWNER_TOADDR2}
							</td>
					  	</tr>
					  	<tr>
							<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">도로명 주소</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<!--  //********** BEGIN_KANG_20120424 -->
								<!-- 
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>										
									  	<td>${board.SI} ${board.GUN} ${board.DORO_NM} ${board.BD_BON}<c:if test="${board.BD_BU != '0' && board.BD_BU != null }">-${board.BD_BU}</c:if> ${board.BD_NM} ${board.BD_DET_NM}</td>
									</tr>
								</table>
								 -->
								 <c:if test="${board.DORO_NM != null && board.DORO_NM != ''}">
								 <table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
									<!--  sungh83 20131107 -->
										<td height ="18px">${board.SI} ${board.GUN} ${board.DORO_NM} ${board.BD_BON}<c:if test="${board.BD_BU != '0' && board.BD_BU != null }">-${board.BD_BU}</c:if></td>	
										<!--  //********** BEGIN_현진_20120330 -->
										<!-- 
									  	<td>${board.SI}&nbsp;${board.GUN}&nbsp;${board.DORO_NM}&nbsp;${board.BD_BON}&nbsp;${board.BD_BU}&nbsp;${board.BD_NM}&nbsp;${board.BD_DET_NM}</td>
									  	-->
									 <!--  	<td height="18px">${board.SI} ${board.GUN} ${board.DORO_NM}</td> -->
									</tr>
									<tr>
									 <!--  <td height="18px">${board.BD_BON}<c:if test="${board.BD_BU != '0' && board.BD_BU != null }">-${board.BD_BU}</c:if> ${board.BD_NM} ${board.BD_DET_NM}</td>  -->
									 <!--   //********** END_현진_20120330 -->
										<td height ="18px">${board.BD_NM} ${board.BD_DET_NM}</td>
									<!-- sungh83 20131107 -->
									</tr>
								</table>
								</c:if>
								<!--   //********** END_KANG_20120424 -->							
								
							</td>
							<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">도로명 주소</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<!--  //********** BEGIN_KANG_20120424 -->
								<!-- 
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
										<td>${board.TOSI} ${board.TOGUN} ${board.TODORO_NM} ${board.TOBD_BON}<c:if test="${board.TOBD_BU != '0' && board.TOBD_BU != null }">-${board.TOBD_BU}</c:if> ${board.TOBD_NM} ${board.TOBD_DET_NM}</td>
									</tr>
								</table>
								 -->
								 <c:if test="${board.TODORO_NM != null && board.TODORO_NM != ''}">
								 <table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
									<!-- sungh83 20131114 -->
									<!--  //********** BEGIN_현진_20120330 -->
									<!-- 
										<td>${board.TOSI}&nbsp;${board.TOGUN}&nbsp;${board.TODORO_NM}&nbsp;${board.TOBD_BON}&nbsp;${board.TOBD_BU}&nbsp;${board.TOBD_NM}&nbsp;${board.TOBD_DET_NM}</td>										
									 -->
										
									<!--<td height="18px">${board.TOSI} ${board.TOGUN} ${board.TODORO_NM}</td> -->
										<td height="18px">${board.TOSI} ${board.TOGUN} ${board.TODORO_NM} ${board.TOBD_BON}<c:if test="${board.TOBD_BU != '0' && board.TOBD_BU != null }">-${board.TOBD_BU}</c:if></td>
									</tr>
									<tr>
									<!--<td height="18px">${board.TOBD_BON}<c:if test="${board.TOBD_BU != '0' && board.TOBD_BU != null }">-${board.TOBD_BU}</c:if> ${board.TOBD_NM} ${board.TOBD_DET_NM}</td> -->
										<td height="18px">${board.TOBD_NM} ${board.TOBD_DET_NM}</td>
									<!--   //********** END_현진_20120330 -->
									<!-- sungh83 20131114 -->

									</tr>
								</table>
								</c:if>
								<!--   //********** END_KANG_20120424 -->							
								
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
							<td width="37%" bgcolor="eaeaea" class="table_bl_left" nowrap="nowrap">${board.LC_SEL_NM} ${board.LC_TXT}</td>
							<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">주거정보</td>
							<td width="36%" bgcolor="eaeaea" class="table_bl_left">${board.RT_SEL_NM} ${board.RT_TXT}</td>
						</tr>
						<tr>
							<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">동산/부동산</td>
							<td colspan="3" bgcolor="eaeaea" class="table_bl_left" nowrap="nowrap">
								<c:if test="${board.ESTATE_MOVE != null}">${board.ESTATE_MOVE} 원</c:if>
								<c:if test="${board.ESTATE_REAL != null}">/ ${board.ESTATE_REAL} 원</c:if>
							</td>
						</tr>
						
						<tr>
							<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">비고</td>
							<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
						        ${board.NOTE }
		     				</td>
						</tr>
						
	                  	</table>
	                  	</td>
				  	</tr>
				</table>
				</td>
				</tr>
				
				<tr>
					<td height="40" align="right">
					<c:if test="${SECTION != '4'}">
					<a href="javascript:Modify('${GAPAN_NO}')"><img src="/img/mod_icon.gif" alt="수정" width="56" height="18" border="0"></a>
				  	</c:if>
				  	</td>
				</tr>
			</table></td>
		</tr>
	</table>

</form>
</body>
</html>
