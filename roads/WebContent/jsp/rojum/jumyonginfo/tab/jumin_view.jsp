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

<script type="text/javascript">
//<![CDATA[
	function 	Init()
	{
		parent.Tab_Img("jumin");
	}
	
	function	Modify(gapanno, gpTyp)
	{
		var form = document.form;

		form.action = "/gapan/jumyonginfo/jumin_modify.do?GAPAN_NO="+gapanno+"&GP_TYP="+gpTyp;
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
	var max_w = 150; //â�� ����ũ��, �̹����� �ִ� ũ�Ⱑ �ȴ�.
	img_src = "${filePath }${board.PARTN_IMG_NAME }"; //�̹����� �ּ�, img1�� src�Ӽ��� ���ƾ� �Ѵ�.
	
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
	
</script>

<body onload="Init()">

<form name="form" method="post">
	<input type="hidden" name="GAPAN_NO" value="${GAPAN_NO}">
	<input type="hidden" name="CORP_CD" value="${CORP_CD}">
	<input type="hidden" name="GU_CODE" value="${GU_CODE}">
	<input type="hidden" name="GP_TYP" value="${GP_TYP}">
	

	

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
									<td width="15%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">�����ڸ�</td>
									<td width="35%" bgcolor="eaeaea" class="table_bl_left" nowrap="nowrap">${board.PARTN_NAME}</td>
									<td width="15%" align="center" bgcolor="e5eff8" class="sub_table_b" rowspan="4" nowrap="nowrap">
										<table>
											<tr><td>������ ����</td></tr>
											<tr>
												<td>
													<br><br>
													<span onclick="javascript:document.getElementById('file2').click();" style="overflow:hidden; background-repeat:no-repeat; cursor: pointer;">
														<!-- img src="/img/file_icon.gif" align="absmiddle" alt="����÷���ϱ�">
														<input type='file' id="file2" name='PARTN_IMG' value="${board.PARTN_IMG}" style="width:0;height:5;filter:alpha(opacity=0); CURSOR:hand;" onchange='ChangeImg2(); attach(this);'-->
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
													<img src="/filedown/${board.PARTN_IMG_NAME }" name="img1" onload="img_resize();" onclick="resize_popup();" style="cursor:hand">
													</c:if>
												</td>
											</tr>
										</table>
									</td>
								</tr>
								<tr>
									<td height="26" height="28" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">��������</td>
									<td width="37%" bgcolor="eaeaea" class="table_bl_left" nowrap="nowrap">${board.PT_SEL_NM}</td>
								</tr>
								<tr>
									<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">�ֹι�ȣ</td>
									<td bgcolor="eaeaea" class="table_bl_left" nowrap="nowrap">${board.PARTN_SSN}</td>
								</tr>
								<tr>
								  	<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">����(����)</td>
									<td bgcolor="eaeaea" class="table_bl_left">
										<c:if test="${board.PARTN_GENDER == '1'}">��</c:if>
										<c:if test="${board.PARTN_GENDER == '2'}">��</c:if>
										<c:if test="${board.PARTN_AGE != null}">&nbsp;(${board.PARTN_AGE} ��)</c:if>
									</td>
								</tr>
								<tr>
								  	<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">��ȭ��ȣ</td>
									<td bgcolor="eaeaea" class="table_bl_left">${board.PARTN_TEL}</td>
									<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�޴���ȭ</td>
									<td bgcolor="eaeaea" class="table_bl_left" colspan='3'>${board.PARTN_HP}</td>
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
											  	<c:if test="${board.ADDR_CHECK2 == '1'}">
											  		�ֹε���� �ּ� ������ ���� 
											  	</c:if>
											  	<c:if test="${board.ADDR_CHECK2 != '1'}">
											  		�ֹε���� �ּ� ������ �������� ����
											  	</c:if>
											  </td>
											</tr>
										</table>
									</td>
							  	</tr>
								<tr>
									<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�����ȣ</td>
									<td bgcolor="eaeaea" class="table_bl_left">
										<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
											<tr>
											  <td>${board.PARTN_POST}</td>
											</tr>
										</table>
									</td>
									<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�����ȣ</td>
									<td bgcolor="eaeaea" class="table_bl_left">
										<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
											<tr>
		  									  <td>${board.PARTN_TOPOST}</td>
											</tr>
										</table>
									</td>
							  	</tr>
							  	<tr>
									<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�⺻ �ּ�</td>
									<td bgcolor="eaeaea" class="table_bl_left">
										${board.PARTN_ADDR1}<br>
										<c:if test="${board.PARTN_SAN == '1'}">
											��
										</c:if>
										<!-- PARTN_BONBUN + PARTN_BUBUN = PARTN_JIBUN -->
										${board.PARTN_JIBUN} ${board.PARTN_ADDR2}
									</td>
									<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�⺻ �ּ�</td>
									<td bgcolor="eaeaea" class="table_bl_left">
										${board.PARTN_TOADDR1}<br>
										<c:if test="${board.PARTN_TOSAN == '1'}">
											��
										</c:if>
										<!-- PARTN_TOBONBUN + PARTN_TOBUBUN = PARTN_TOJIBUN -->
										${board.PARTN_TOJIBUN} ${board.PARTN_TOADDR2}
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
					<table width="0" border="0" cellspacing="0" cellpadding="0" align="right">
				  		<td height="40" align="right"><a href="javascript:Modify('${GAPAN_NO}','${GP_TYP}')"><img src="/img/mod_icon.gif" alt="����" width="56" height="18" border="0"></a>
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
