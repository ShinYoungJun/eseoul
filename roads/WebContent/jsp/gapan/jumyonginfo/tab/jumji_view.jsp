<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/loginCheck.jsp"%>
<%@ include file="/jsp/common/include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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

	function Modify(gapanno)
	{
		var form = document.form;

		form.action = "/gapan/jumyonginfo/jumji_modify.do?GAPAN_NO="+gapanno;
		form.submit();
	}

	function 	Init()
	{
		parent.Tab_Img("jumji");
		//IFRM_PurposeCode.PURPOSE_CD.className="view";

		var tabDown = parent.document.getElementById('tabDown');
		tabDown.contentWindow.location.reload(true);
	}

	
	var w, h;
	var max_w = 150; //â�� ����ũ��, �̹����� �ִ� ũ�Ⱑ �ȴ�.
	img_src = "${filePath }${board.SHOP_IMG_NAME }"; //�̹����� �ּ�, img1�� src�Ӽ��� ���ƾ� �Ѵ�.
	
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


    function jumyongZibun(SIDO, SIGU_CD){

    	var form 	= document.form;
        var	str		= "";

        var url = '/gapan/map/mini_map.do?PNU='+'${WITH_PNU}'+'&X_COORD='+'${X_COORD}'+'&Y_COORD='+'${Y_COORD}'+'&TYPE=view';

        cw=screen.availWidth;	
        ch=screen.availHeight;

        sw=800;
        sh=600;

        ml=(cw-sw)/2;
        mt=(ch-sh)/2;

        var param = 'width='+sw+',height='+sh+',top='+mt+',left='+ml+',resizable=no, status=no, scrollbars=no, toolbar=no, menubar=no';

        window.open(url, "minimap", param);
    }

	
//]]>
</script>

<body onload="Init();">
<form id="form" name="form" method="post">
	<input type="hidden" id="GAPAN_NO" name="GAPAN_NO" value="${GAPAN_NO}">
	<input type="hidden" id="GU_CODE" name="GU_CODE" value="${GU_CODE}">
<table width="780" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td align="left" class="contborder_blue">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td>
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td>
						<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse: collapse;" cellpadding="0" cellspacing="0" class="sub_table">
							<tr>
								<td height="34" colspan="4" align="left" bgcolor="#FFFFFF" class="sub_table_b" nowrap="nowrap">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan" nowrap="nowrap">
									<tr>
										<td><span class="sub_stan_blue">* �ü� ����</span></td>
									</tr>
								</table>
								</td>
							</tr>
							<tr>
								<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">���Ա���</td>
								<td bgcolor="eaeaea" class="table_bl_left" nowrap="nowrap" colspan="3">${board.TAX_SET_NM}</td>
							</tr>
							<tr>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">����Ⱓ</td>
								<td bgcolor="f6f6f6" class="table_bl_left" colspan="3">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
										<td>${board.MUL_FROMDATE} ~ ${board.MUL_TODATE}</td>
									</tr>
								</table>
								</td>
							</tr>
							
							
							<tr>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">������ �ּ�</td>
								<td bgcolor="f6f6f6" class="table_bl_left">${ADDR}</td>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">������<br>���θ��ּ�</td>
								<td bgcolor="f6f6f6" class="table_bl_left">
									<c:if test="${board.WITH_DORO_NM != null && board.WITH_DORO_NM != ''}">
								 		${board.WITH_DORO_NM}
								 		${board.WITH_BD_BON}
								 		<c:if test="${board.WITH_BD_BU != '0' && board.WITH_BD_BU != null}">-${board.WITH_BD_BU}</c:if>
									</c:if>
								</td>
							</tr>
							 
							
							<tr>
								<td align="center" bgcolor="e5eff8" class="sub_table_b" width="100" height="26" nowrap>������ �ּ�</td>
								<td bgcolor="eaeaea" class="table_bl_left" width="37%" nowrap>
									<table>
										<tr>
											<td width="80%">
												${board.WITH_ADDR}
											</td>
											<td width="100px">
												<img src="/img/loca_icon.gif" alt="��ġȮ��" id="LocReg" width="64" height="18" border="0" onClick="javascript:jumyongZibun('${SIDO}','${SIGU_CD}');" style="CURSOR:pointer;">
											</td>
										</tr>
									</table>
								</td>
								<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b" rowspan="5" nowrap>
								<table>
									<tr>
										<td>�ü��� ����</td>
									</tr>
									<tr>
										<td>
										<br>
										<br>
										<span onclick="javascript:document.getElementById('file3').click();" style="overflow: hidden; background-repeat: no-repeat; cursor: pointer;">
										</span>
										</td>
									</tr>
								</table>
								</td>
								<td bgcolor="eaeaea" class="table_bl_left" rowspan="5" nowrap="nowrap" align="center">
								<table>
									<tr>
										<td width="100" height="130" style="background-position: 50% 50%;">
											<c:if test="${board.SHOP_IMG_NAME != null }">
												<img src="${filePath }${board.SHOP_IMG_NAME }" id="img1" name="img1" onload="img_resize();" onclick="resize_popup();" style="cursor: hand">
											</c:if>
										</td>
									</tr>
								</table>
								</td>
							</tr>
							<tr>
								<td align="center" bgcolor="e5eff8" class="sub_table_b" height="26">�ֺ�����</td>
								<td bgcolor="eaeaea" class="table_bl_left">${board.WITH_INFO}</td>
							</tr>
							<tr>
								<td align="center" bgcolor="e5eff8" class="sub_table_b" height="26">��������</td>
								<td bgcolor="eaeaea" class="table_bl_left">${board.ROAD_INFO}</td>
							</tr>
							<tr>
								<td align="center" bgcolor="e5eff8" class="sub_table_b" height="26">��������</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									${board.AR_SEL_NM}
									<c:if test="${board.AR_SEL_NM != null && board.AR_TXT != null}"> / </c:if>
									${board.AR_TXT}
								</td>
							</tr>
							<tr>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">��ġ����</td>
								<td bgcolor="eaeaea" class="table_bl_left">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
										<td>${board.FOUND_DATE}</td>
									</tr>
								</table>
								</td>
							</tr>
							<tr>
								<td align="center" bgcolor="e5eff8" class="sub_table_b" height="26">�����ü�</td>
								<td bgcolor="eaeaea" class="table_bl_left">
								${board.UC_SEL_NM} <c:if test="${board.UC_SEL_NM != null && board.UC_TXT != null}"> / </c:if>${board.UC_TXT}
								</td>
								<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">�ü����� ����</td>
								<td bgcolor="eaeaea" class="table_bl_left">
								${rnic:insertComma2(board.SF_VALUE)}��</td>
							</tr>
							<tr>
								<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">�ü�����/�԰�</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									${board.FT_TYP_NM} <c:if test="${board.FT_SEL_NM != null && board.FT_SEL_NM != null}"> / </c:if>${board.FT_SEL_NM}
								</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">�������</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									<c:if test="${board.PLACE_L != null}">
						  				${board.PLACE_L} m �� ${board.PLACE_H} m = ${board.PLACE_A} ��
						  			</c:if>
					  			</td>
							</tr>
							<!--  //********** BEGIN_KANG_20120423 -->
							<!-- 
							<tr>
								<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">��ü�⵵</td>
								<td bgcolor="eaeaea" class="table_bl_left" colspan="3">
									${board.CHANGE_YM}
								</td>
							</tr>
							-->
							<tr>
								<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">�ü��� ��ȣ</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									<c:if test="${board.facility_No!= null && board.facility_No != ''}">${board.FT_TYP_NM} - ${board.facility_No}</c:if>
								</td>
								<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">��ü�⵵</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									${board.CHANGE_YM}
								</td>
							</tr>
							<!--   //********** END_KANG_20120423 -->							
							
							<tr>
								<td height="34" colspan="4" align="left" bgcolor="#FFFFFF" class="">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
										<td><span class="sub_stan_blue">* �����</span></td>
									</tr>
								</table>
								</td>
							</tr>
							<tr>
								<td align="center" bgcolor="e5eff8" class="sub_table_b" height="26">���ǰ��</td>
								<td bgcolor="eaeaea" class="table_bl_left" colspan="3">
									${board.SG_TYP_NM}
								</td>
							</tr>
							<tr>
								<td align="center" bgcolor="e5eff8" class="sub_table_b" height="26">��ǰ�з�</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									${board.SG_ITM_NM}
									<c:if test="${board.SG_SEL_NM != null}"> / ${board.SG_SEL_NM}
									</c:if>
								</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b" height="26">�����ο�</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									${board.MEM_NUM}
									<c:if test="${board.MEM_NUM != null}"> (��� ���� ����)
									</c:if>
								</td>
							</tr>
							<tr>
								<td align="center" bgcolor="e5eff8" class="sub_table_b" height="26">��ð�</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									${board.OPEN_TIME}
									<c:if test="${board.OPEN_TIME != null}"> ~ ${board.CLOSE_TIME}</c:if>
								</td>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b" height="26">�㰡����</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
										<tr>
											<td>${board.PERMIT_DATE}</td>
										</tr>
									</table>
								</td>
							</tr>
							<tr>
								<td align="center" bgcolor="e5eff8" class="sub_table_b" height="26">�ϸ����</td>
								<td bgcolor="eaeaea" class="table_bl_left">${board.DAY_SALES}</td>
								<td bgcolor="f6f6f6" class="table_bl_left" colspan="2"></td>
							</tr>
							<tr>
								<td align="center" bgcolor="e5eff8" class="sub_table_b" height="26">��Ÿ����</td>
								<td bgcolor="eaeaea" class="table_bl_left" colspan="3">
									<textarea id="NOTES" name="NOTES" class="input_form1" style="width: 620px" rows="10" cols="200">${board.NOTES}</textarea>
								</td>
							</tr>
						</table>

						</td>
					</tr>
					<tr>
						<td height="40" align="right">
						<c:if test="${board.SECTION != '���'}">
							<table width="0" border="0" cellspacing="0" cellpadding="0" align="right">
								<tr>
									<td height="40" align="right">
										<a href="javascript:Modify('${GAPAN_NO}')"> 
											<img src="/img/mod_icon.gif" alt="����" width="56" height="18" border="0">
										</a>
									</td>
								</tr>
							</table>
							</c:if>
						</td>
					</tr>
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