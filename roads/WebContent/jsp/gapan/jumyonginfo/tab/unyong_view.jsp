<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/loginCheck.jsp" %>    
<%@ include file="/jsp/common/include.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />

<title>::::: ����� ������������ý��� :::::</title>
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
	var max_w = 150; //â�� ����ũ��, �̹����� �ִ� ũ�Ⱑ �ȴ�.
	img_src = "${filePath }${board.OWNER_IMG_NAME }"; //�̹����� �ּ�, img1�� src�Ӽ��� ���ƾ� �Ѵ�.
	
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
	 	w_dummy = w + 20; //��ũ�ѹٸ� ���ؼ� �˾�â�� ���α��̸� 20�ȼ� �߰��Ѵ�.
	 	with( window.open("","madi_image",'height='+h+',width='+w_dummy+',scrollbars=yes,resizable=yes') )
	 	{
	  	document.write("<body topmargin=0 rightmargin=0 bottommargin=0 leftmargin=0>","<a href='#' alt='Ŭ���Ͻø� â�� �����ϴ�.'><img src='"+img_src+"' hspace=0 vspace=0 border=0 onclick='window.close();'></a>","</body>");
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
							<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">��ڸ�</td>
							<td width="37%" bgcolor="eaeaea" class="table_bl_left">${board.OWNER_NAME}
								<c:if test="${board.OWNER_IDCHK == '1'}"> 
									(�ź��� Ȯ��)
								</c:if>
							</td>
							<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b" rowspan="3">
								<table>
									<tr><td>��� ����</td></tr>
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
							<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">�ֹε�Ϲ�ȣ</td>
							<td bgcolor="eaeaea" class="table_bl_left">${board.OWNER_SSN}</td>
					  	</tr>
					  	<tr>
							<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">����(����)</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<c:if test="${board.OWNER_GENDER == '1'}">��</c:if>
								<c:if test="${board.OWNER_GENDER == '2'}">��</c:if>
								<c:if test="${board.OWNER_AGE != null}">&nbsp;(${board.OWNER_AGE} ��)</c:if>
							</td>
					  	</tr>
					  	<tr>
							<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">��ȭ��ȣ</td>
							<td bgcolor="eaeaea" class="table_bl_left">${board.OWNER_TEL}</td>
							<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�޴���ȭ</td>
							<td bgcolor="eaeaea" class="table_bl_left">${board.OWNER_HP}</td>
					  	</tr>
					  	<tr>
							<td height="34" colspan="2" align="left" bgcolor="#FFFFFF" class="">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
									  <td width="50%">
									  	<span class="sub_stan_blue">* �ֹε���� �ּ�</span>
									  </td>
									</tr>
								</table>
							</td>
							<td height="34" colspan="2" align="left" bgcolor="#FFFFFF" class="">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
									  <td width="50%">
									  	<span class="sub_stan_blue">* ���������� : </span>
									  	<c:if test="${board.ADDR_CHECK1 == '1'}">
									  		�ֹε���� �ּ� ������ ����
									  	</c:if>
									  	<c:if test="${board.ADDR_CHECK1 != '1'}">
									  		�ֹε���� �ּ� ������ �������� ����
									  	</c:if>
									  </td>
									</tr>
								</table>
							</td>
					  	</tr>
					  	<tr>
							<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">������ȣ</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
									  <td>${board.OWNER_POST}</td>
									</tr>
								</table>
							</td>
							<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">������ȣ</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
									  <td>${board.OWNER_TOPOST}</td>
									</tr>
								</table>
							</td>
					  	</tr>
					  	<tr>
							<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�⺻ �ּ�</td>
							<td bgcolor="eaeaea" class="table_bl_left" height="40px">
								${board.OWNER_ADDR1}<br>	
								<c:if test="${board.OWNER_SAN == '1'}">
									��
								</c:if>
								<!-- OWNER_BONBUN + OWNER_BUBUN = OWNER_JIBUN -->
								${board.OWNER_JIBUN} ${board.OWNER_ADDR2}
							</td>
							<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�⺻ �ּ�</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								${board.OWNER_TOADDR1}<br> 
								<c:if test="${board.OWNER_TOSAN == '1'}">
									��
								</c:if>
								<!-- OWNER_TOBONBUN + OWNER_TOBUBUN = OWNER_TOJIBUN -->
								${board.OWNER_TOJIBUN} ${board.OWNER_TOADDR2}
							</td>
					  	</tr>
					  	<tr>
							<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">���θ� �ּ�</td>
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
										<!--  //********** BEGIN_����_20120330 -->
										<!-- 
									  	<td>${board.SI}&nbsp;${board.GUN}&nbsp;${board.DORO_NM}&nbsp;${board.BD_BON}&nbsp;${board.BD_BU}&nbsp;${board.BD_NM}&nbsp;${board.BD_DET_NM}</td>
									  	-->
									 <!--  	<td height="18px">${board.SI} ${board.GUN} ${board.DORO_NM}</td> -->
									</tr>
									<tr>
									 <!--  <td height="18px">${board.BD_BON}<c:if test="${board.BD_BU != '0' && board.BD_BU != null }">-${board.BD_BU}</c:if> ${board.BD_NM} ${board.BD_DET_NM}</td>  -->
									 <!--   //********** END_����_20120330 -->
										<td height ="18px">${board.BD_NM} ${board.BD_DET_NM}</td>
									<!-- sungh83 20131107 -->
									</tr>
								</table>
								</c:if>
								<!--   //********** END_KANG_20120424 -->							
								
							</td>
							<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">���θ� �ּ�</td>
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
									<!--  //********** BEGIN_����_20120330 -->
									<!-- 
										<td>${board.TOSI}&nbsp;${board.TOGUN}&nbsp;${board.TODORO_NM}&nbsp;${board.TOBD_BON}&nbsp;${board.TOBD_BU}&nbsp;${board.TOBD_NM}&nbsp;${board.TOBD_DET_NM}</td>										
									 -->
										
									<!--<td height="18px">${board.TOSI} ${board.TOGUN} ${board.TODORO_NM}</td> -->
										<td height="18px">${board.TOSI} ${board.TOGUN} ${board.TODORO_NM} ${board.TOBD_BON}<c:if test="${board.TOBD_BU != '0' && board.TOBD_BU != null }">-${board.TOBD_BU}</c:if></td>
									</tr>
									<tr>
									<!--<td height="18px">${board.TOBD_BON}<c:if test="${board.TOBD_BU != '0' && board.TOBD_BU != null }">-${board.TOBD_BU}</c:if> ${board.TOBD_NM} ${board.TOBD_DET_NM}</td> -->
										<td height="18px">${board.TOBD_NM} ${board.TOBD_DET_NM}</td>
									<!--   //********** END_����_20120330 -->
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
									  	<span class="sub_stan_blue">* ��Ȱ����</span>
									  </td>
									</tr>
								</table>
							</td>
						</tr>
						<tr>
							<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">��Ȱ����</td>
							<td width="37%" bgcolor="eaeaea" class="table_bl_left" nowrap="nowrap">${board.LC_SEL_NM} ${board.LC_TXT}</td>
							<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">�ְ�����</td>
							<td width="36%" bgcolor="eaeaea" class="table_bl_left">${board.RT_SEL_NM} ${board.RT_TXT}</td>
						</tr>
						<tr>
							<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">����/�ε���</td>
							<td colspan="3" bgcolor="eaeaea" class="table_bl_left" nowrap="nowrap">
								<c:if test="${board.ESTATE_MOVE != null}">${board.ESTATE_MOVE} ��</c:if>
								<c:if test="${board.ESTATE_REAL != null}">/ ${board.ESTATE_REAL} ��</c:if>
							</td>
						</tr>
						
						<tr>
							<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">���</td>
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
					<a href="javascript:Modify('${GAPAN_NO}')"><img src="/img/mod_icon.gif" alt="����" width="56" height="18" border="0"></a>
				  	</c:if>
				  	</td>
				</tr>
			</table></td>
		</tr>
	</table>

</form>
</body>
</html>