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

<script type="text/javascript">
//<![CDATA[
	function 	Init()
	{
		parent.Tab_Img("jumin");
	}
	
	function	Modify(gapanno)
	{
		var form = document.form;

		form.action = "/gapan/jumyonginfo/jumin_modify.do?GAPAN_NO="+gapanno;
		form.submit();
	}
/*
	function	View(gapanno, seq)
	{
		params	= "GAPAN_NO=" + gapanno + "&SEQ=" + seq;
		
		sendRequest("/gapan/minwoninfo/minwon_view_search.do", params, "GET", Result_InfoView);

	}
*/
//]]>

	var w, h;
	var max_w = 150; //창의 가로크기, 이미지의 최대 크기가 된다.
	img_src = "${filePath }${board.PARTN_IMG_NAME }"; //이미지의 주소, img1의 src속성과 같아야 한다.
	
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
			                <table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0" class="sub_table">
								<tr>
									<td width="15%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">동업자명</td>
									<td width="35%" bgcolor="eaeaea" class="table_bl_left" nowrap="nowrap">${board.PARTN_NAME}</td>
									<td width="15%" align="center" bgcolor="e5eff8" class="sub_table_b" rowspan="4" nowrap="nowrap">
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
											<tr><!-- td width=100 height=130 id="tblview2" style="background-repeat:no-repeat; background-attachment:scroll;"></td-->
												<td width="100" height="130" style="background-position:50% 50%;">
													<c:if test="${board.PARTN_IMG_NAME != null }">
													<img src="${filePath}${board.PARTN_IMG_NAME }" id="img1" name="img1" onload="img_resize();" onclick="resize_popup();" style="cursor:pointer;">
													</c:if>
												</td>
											</tr>
										</table>
									</td>
								</tr>
								<tr>
									<td height="26" height="28" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">동업관계</td>
									<td width="37%" bgcolor="eaeaea" class="table_bl_left" nowrap="nowrap">${board.PT_SEL_NM}</td>
								</tr>
								<tr>
									<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">주민번호</td>
									<td bgcolor="eaeaea" class="table_bl_left" nowrap="nowrap">${board.PARTN_SSN}</td>
								</tr>
								<tr>
								  	<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">성별(나이)</td>
									<td bgcolor="eaeaea" class="table_bl_left">
										<c:if test="${board.PARTN_GENDER == '1'}">남</c:if>
										<c:if test="${board.PARTN_GENDER == '2'}">여</c:if>
										<c:if test="${board.PARTN_AGE != null}">&nbsp;(${board.PARTN_AGE} 세)</c:if>
									</td>
								</tr>
								<tr>
								  	<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">전화번호</td>
									<td bgcolor="eaeaea" class="table_bl_left">${board.PARTN_TEL}</td>
									<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">휴대전화</td>
									<td bgcolor="eaeaea" class="table_bl_left" colspan='3'>${board.PARTN_HP}</td>
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
											  		주민등록지 주소 정보와 동일 
											  	</c:if>
											  	<c:if test="${board.ADDR_CHECK2 != '1'}">
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
											  <td>${board.PARTN_POST}</td>
											</tr>
										</table>
									</td>
									<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
									<td bgcolor="eaeaea" class="table_bl_left">
										<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
											<tr>
		  									  <td>${board.PARTN_TOPOST}</td>
											</tr>
										</table>
									</td>
							  	</tr>
							  	<tr>
									<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">기본 주소</td>
									<td bgcolor="eaeaea" class="table_bl_left">
										${board.PARTN_ADDR1}<br>
										<c:if test="${board.PARTN_SAN == '1'}">
											산
										</c:if>
										<!-- PARTN_BONBUN + PARTN_BUBUN = PARTN_JIBUN -->
										<!--  //********** BEGIN_현진_20120402 -->
										<!-- ${board.PARTN_JIBUN} ${board.PARTN_ADDR2} -->
										<c:if test="${board.PARTN_JIBUN != '-'}">${board.PARTN_JIBUN}</c:if> ${board.PARTN_ADDR2}
										<!--   //********** END_현진_20120402 -->
									</td>
									<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">기본 주소</td>
									<td bgcolor="eaeaea" class="table_bl_left">
										${board.PARTN_TOADDR1}<br>
										<c:if test="${board.PARTN_TOSAN == '1'}">
											산
										</c:if>
										<!-- PARTN_TOBONBUN + PARTN_TOBUBUN = PARTN_TOJIBUN -->
										<!--  //********** BEGIN_현진_20120402 -->
										<!-- ${board.PARTN_TOJIBUN} ${board.PARTN_TOADDR2} -->
										<c:if test="${board.PARTN_TOJIBUN != '-'}">${board.PARTN_TOJIBUN}</c:if> ${board.PARTN_TOADDR2}
										<!--   //********** END_현진_20120402 -->
									</td>
							  	</tr>
							  	<tr>
									<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">도로명 주소</td>
									<td bgcolor="eaeaea" class="table_bl_left">
										<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
											<tr>
												<!--  //********** BEGIN_현진_20120330 -->
												<!-- 
												<td>${board.PSI}&nbsp;${board.PGUN}&nbsp;${board.p_DORO_NM}&nbsp;${board.p_BD_BON}&nbsp;${board.p_BD_BU}&nbsp;${board.p_BD_NM}&nbsp;${board.p_BD_DET_NM}</td>
												-->
												<td>${board.PSI} ${board.PGUN} ${board.p_DORO_NM} ${board.p_BD_BON}<c:if test="${board.p_BD_BU != '0' && board.p_BD_BU != null}">-${board.p_BD_BU}</c:if> ${board.p_BD_NM} ${board.p_BD_DET_NM}</td>
												<!--   //********** END_현진_20120330 -->
											</tr>
										</table>
									</td>
									<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">도로명 주소</td>
									<td bgcolor="eaeaea" class="table_bl_left">
										<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
											<tr>
												<!--  //********** BEGIN_현진_20120330 -->
												<!-- 
												<td>${board.PTSI}&nbsp;${board.PTGUN}&nbsp;${board.PTDORO_NM}&nbsp;${board.PTBD_BON}&nbsp;${board.PTBD_BU}&nbsp;${board.PTBD_NM}&nbsp;${board.PTBD_DET_NM}</td>
												-->
												<td>${board.PTSI} ${board.PTGUN} ${board.PTDORO_NM} ${board.PTBD_BON}<c:if test="${board.PTBD_BU != '0' && board.PTBD_BU != null}">-${board.PTBD_BU}</c:if> ${board.PTBD_NM} ${board.PTBD_DET_NM}</td>
												<!--   //********** END_현진_20120330 -->											
											</tr>
										</table>
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
