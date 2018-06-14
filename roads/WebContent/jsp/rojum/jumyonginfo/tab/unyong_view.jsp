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
<script language="javascript" src="/js/common.js"></script>
<script language="javascript" src="/js/PopupCalendar.js"></script>
<script language="javascript" src="/js/calculation.js"></script>
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

		form.action = "/rojum/jumyonginfo/unyong_modify.do?GAPAN_NO="+gapanno;
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
		MessageDisplay('IMG_FULL','IMG_FULLValue',1);
	}


//]]>
</script>

<body onload="Init()">

<form id="form" name="form" method="post">
	<input type="hidden" id="GAPAN_NO" name="GAPAN_NO" value="${GAPAN_NO}">
	<input type="hidden" id="GU_CODE" name="GU_CODE" value="${GU_CODE}">
	
	<div id="IMG_FULL" name="IMG_FULL" style="position: absolute; display:none;">
	<table id="IMG_FULLValue" name="IMG_FULLValue" width="380px" height="400px" border="2" bordercolor="#c9dfed" style="border-collapse:collapse;background-color:white;" cellpadding="0" cellspacing="0">
		<tr>
			<td height="20px" align="center" bgcolor="e5eff8" class="sub_table_b">
				이미지를 클릭하면 닫힘
			</td>
		</tr>
		<tr>
			<td height="380px" align="center" onclick="MessageDisplay('IMG_FULL','IMG_FULLValue',0);">
				<img src="${filePath}${board.OWNER_IMG_NAME}" onload="javascript:fitImageSize(this,'${filePath}${board.OWNER_IMG_NAME}',380,380)" style="cursor: pointer;">
			</td>
		</tr>
	</table>
	</div>

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
							<td width="15%" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">운영자명</td>
							<td width="35%" bgcolor="eaeaea" class="table_bl_left">${board.OWNER_NAME}
								<c:if test="${board.OWNER_IDCHK == '1'}"> 
									(신분증 확인)
								</c:if>
							</td>
							<td width="15%" align="center" bgcolor="e5eff8" class="sub_table_b" rowspan="3">
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
							<td width="35%" bgcolor="eaeaea" class="table_bl_left" rowspan="3" align="center">
								<table>
									<tr>
										<td width="100%" height="130px" style="background-position:50% 50%;" >
											<c:if test="${board.OWNER_IMG_NAME != null }">
												<img src="${filePath }${board.OWNER_IMG_NAME }" id="img1" name="img1" onload="img_resize();" onclick="resize_popup();" style="cursor:hand">
											</c:if>
										</td>
									</tr>
								</table>
							</td>
						</tr>
						<tr>
							<td width="15%" align="center" bgcolor="e5eff8" class="sub_table_b">주민등록번호</td>
							<td bgcolor="eaeaea" class="table_bl_left">${board.OWNER_SSN}</td>
					  	</tr>
					  	<tr>
							<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">성별(나이)</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<c:if test="${board.OWNER_GENDER == '1'}">남</c:if>
								<c:if test="${board.OWNER_GENDER == '2'}">여</c:if>
								<c:if test="${board.OWNER_AGE != null}">&nbsp;(${board.OWNER_AGE} 세)</c:if>
							</td>
					  	</tr>
					  	<tr>
							<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">전화번호</td>
							<td bgcolor="eaeaea" class="table_bl_left">${board.OWNER_TEL}</td>
							<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">휴대전화</td>
							<td bgcolor="eaeaea" class="table_bl_left">${board.OWNER_HP}</td>
					  	</tr>
					  	<tr>
							<td height="34px" colspan="2" align="left" bgcolor="#FFFFFF" class="">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
									  <td width="50%">
									  	<span class="sub_stan_blue">* 주민등록지 주소</span>
									  </td>
									</tr>
								</table>
							</td>
							<td height="34px" colspan="2" align="left" bgcolor="#FFFFFF" class="">
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
							<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
									  <td>${board.OWNER_POST}</td>
									</tr>
								</table>
							</td>
							<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
									  <td>${board.OWNER_TOPOST}</td>
									</tr>
								</table>
							</td>
					  	</tr>
					  	<tr>
							<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">기본 주소</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								${board.OWNER_ADDR1}<br>	
								<c:if test="${board.OWNER_SAN == '1'}">
									산
								</c:if>
								<!-- OWNER_BONBUN + OWNER_BUBUN = OWNER_JIBUN -->
								${board.OWNER_JIBUN} ${board.OWNER_ADDR2}
							</td>
							<td height="35px" align="center" bgcolor="e5eff8" class="sub_table_b">기본 주소</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								${board.OWNER_TOADDR1}<br> 
								<c:if test="${board.OWNER_TOSAN == '1'}">
									산
								</c:if>
								<!-- OWNER_TOBONBUN + OWNER_TOBUBUN = OWNER_TOJIBUN -->
								${board.OWNER_TOJIBUN} ${board.OWNER_TOADDR2}
							</td>
					  	</tr>
					  	<!--  //********** BEGIN_KANG_20120424 -->
						<!-- 
						<tr>
							<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">도로명 주소</td>
														
							<td bgcolor="eaeaea" class="table_bl_left">
								 ${board.SI}&nbsp; ${board.GUN}&nbsp;${board.DORO_NM}&nbsp;${board.BD_BON}&nbsp;${board.BD_BU}&nbsp;${board.BD_NM}&nbsp;${board.BD_DET_NM}
							</td>
							<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">도로명 주소</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								 ${board.TOSI}&nbsp; ${board.GUN}&nbsp;${board.TODORO_NM}&nbsp;${board.TOBD_BON}&nbsp;${board.TOBD_BU}&nbsp;${board.TOBD_NM}&nbsp;${board.TOBD_DET_NM}
							</td>
					  	</tr>
						 -->	
					  	<tr>
							<td height="35x" align="center" bgcolor="e5eff8" class="sub_table_b">도로명 주소</td>
														
							<td bgcolor="eaeaea" class="table_bl_left">
								<c:if test="${board.DORO_NM != null && board.DORO_NM != ''}">
								<!-- sungh83 20131107 -->
								<!--  
								 ${board.SI} ${board.GUN} ${board.DORO_NM}<br/>
								 ${board.BD_BON}<c:if test="${board.BD_BU != '0' && board.BD_BU != null}">-${board.BD_BU}</c:if> ${board.BD_NM}${board.BD_DET_NM}
								-->
								${board.SI} ${board.GUN} ${board.DORO_NM} ${board.BD_BON}<c:if test="${board.BD_BU != '0' && board.BD_BU != null}">-${board.BD_BU}</c:if><br/>
								${board.BD_NM}${board.BD_DET_NM}
								<!-- sungh83 20131107 -->
								</c:if>
							</td>
							<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">도로명 주소</td>
							<td bgcolor="eaeaea" class="table_bl_left">
							 <c:if test="${board.TODORO_NM != null && board.TODORO_NM != ''}">
							 <!-- sungh83 20131107 -->
								 <!--
								 ${board.TOSI} ${board.GUN} ${board.TODORO_NM}<br/>
								 ${board.TOBD_BON}<c:if test="${board.TOBD_BU != '0' && board.TOBD_BU != null}">-${board.TOBD_BU}</c:if> ${board.TOBD_NM} ${board.TOBD_DET_NM}
								 --> 
								 ${board.TOSI} ${board.GUN} ${board.TODORO_NM} ${board.TOBD_BON}<c:if test="${board.TOBD_BU != '0' && board.TOBD_BU != null}">-${board.TOBD_BU}</c:if><br/> 	
								 ${board.TOBD_NM} ${board.TOBD_DET_NM}
								 <!-- sungh83 20131107 -->
							 </c:if>
							</td>
					  	</tr>
					  	<!--   //********** END_KANG_20120424 -->
						<tr>
						  	<td height="34px" colspan="4" align="left" bgcolor="#FFFFFF" class="">
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
							<td width="15%" height="28px" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">감면대상</td>
							<td colspan="3" bgcolor="eaeaea" class="table_bl_left" nowrap="nowrap">${board.LT_SEL_NM}</td>
						</tr>
						<tr>
							<td width="15%" height="28px" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">비고</td>
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
					<td height="40px" align="right">
					<c:if test="${SECTION != '4'}">
					<table width="0" border="0" cellspacing="0" cellpadding="0" align="right">
				  		<td height="40" align="right"><a href="javascript:Modify('${GAPAN_NO}')"><img src="/img/mod_icon.gif" alt="수정" width="56" height="18" border="0"></a>
				  	</table>
				  	</c:if>
				  	</td>
				</tr>
			</table></td>
		</tr>
	</table>

</form>
</body>
</html>
