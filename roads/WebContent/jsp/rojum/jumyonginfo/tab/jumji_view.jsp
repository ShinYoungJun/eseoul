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

<script language="javascript" src="/js/common.js"></script>
<script language="javascript" src="/js/PopupCalendar.js"></script>
<script language="javascript" src="/js/calculation.js"></script>
<script language="javascript" src="/js/selectItem.js"></script>
<script type="text/javascript">
//<![CDATA[

	function	Modify(gapanno)
	{
		var form = document.form;

		form.action = "/rojum/jumyonginfo/jumji_modify.do?GAPAN_NO="+gapanno;
		form.submit();
	}

	function 	Init()
	{
		parent.Tab_Img("jumji");
	}

	function resize_popup(obj)
	{
		if(obj == '1'){
           MessageDisplay('IMG_FULL','IMG_FULLValue',1);
		}else if(obj == '2'){
			MessageDisplay('IMG2_FULL','IMG2_FULLValue',1);
		}
	}


    function jumyongZibun(){

        var form 	= document.form;
        var	str		= "";

        var url = '/rojum/map/mini_map.do?PNU='+'${WITH_PNU}'+'&X_COORD='+'${X_COORD}'+'&Y_COORD='+'${Y_COORD}'+'&TYPE=view';

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
	<input type="hidden" id="JIBUN" name="JIBUN" value="${JIBUN}"> 
	
<div id="IMG_FULL" name="IMG_FULL" style="position: absolute; display:none;">
<table id="IMG_FULLValue" name="IMG_FULLValue" width="380px" height="400px" border="2" bordercolor="#c9dfed" style="border-collapse:collapse;background-color:white;" cellpadding="0" cellspacing="0">
	<tr>
		<td height="20px" align="center" bgcolor="e5eff8" class="sub_table_b">
			�̹����� Ŭ���ϸ� ����
		</td>
	</tr>
	<tr>
		<td height="380px" align="center" onclick="MessageDisplay('IMG_FULL','IMG_FULLValue',0);">
			<img src="${filePath}${board.SHOP_IMG_NAME}" onload="javascript:fitImageSize(this,'${filePath}${board.SHOP_IMG_NAME}',380,380)" style="cursor: pointer;">
		</td>
	</tr>
</table>
</div>

<div id="IMG2_FULL" name="IMG2_FULL" style="position: absolute; display:none;">
<table id="IMG2_FULLValue" name="IMG2_FULLValue" width="380px" height="400px" border="2" bordercolor="#c9dfed" style="border-collapse:collapse;background-color:white;" cellpadding="0" cellspacing="0">
	<tr>
		<td height="20px" align="center" bgcolor="e5eff8" class="sub_table_b">
			�̹����� Ŭ���ϸ� ����
		</td>
	</tr>
	<tr>
		<td height="380px" align="center" onclick="MessageDisplay('IMG2_FULL','IMG2_FULLValue',0);">
			<img src="${filePath}${board.SHOP_IMG2_NAME}" onload="javascript:fitImageSize(this,'${filePath}${board.SHOP_IMG2_NAME}',380,380)" style="cursor: pointer;">
		</td>
	</tr>
</table>
</div>


<table width="780px" border="0" cellpadding="0" cellspacing="0">
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
								<td height="26px" width="15%" align="center" bgcolor="e5eff8" class="sub_table_b">
									<c:choose>
										<c:when test="${board.MANAGE_TYP == '0'}">
												����⵵
										</c:when>
										<c:otherwise>
												��ϱ���
										</c:otherwise>
									</c:choose>
								</td>
								<td bgcolor="eaeaea" class="table_bl_left" colspan="3">
									<c:choose>
										<c:when test="${board.MANAGE_TYP == '0'}">
												${board.SURVEY_YEAR}
										</c:when>
										<c:when test="${board.MANAGE_TYP == '1'}">
												�̼���
										</c:when>
										<c:when test="${board.MANAGE_TYP == '2'}">
												����
										</c:when>
										<c:when test="${board.MANAGE_TYP == '3'}">
												�赵
										</c:when>
										<c:otherwise>
										</c:otherwise>
									</c:choose>
									
								</td>
							</tr>
							<!--  //********** BEGIN_����_20120313 -->
							<c:if test="${board.MANAGE_TYP == '0'}">
							<tr>
		                        	<td width="12%" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">������ȣ</td>
		                            <td colspan="3" bgcolor="f6f6f6" class="table_bl_left">
		                            <!--  //********** BEGIN_����_20120315 -->
			                            <c:if test="${board.GUGAN_CD!=0 && board.GUGAN_CD!=null}">
			                            	�� ${board.GUGAN_CD}����  ${board.REG_NAME }
			                            </c:if>
			                        <!--   //********** END_����_20120315 -->
		                            </td>
							</tr>
							</c:if>
							<!--   //********** END_����_20120313 -->
							<tr>
								<td height="26px" width="15%" align="center" bgcolor="e5eff8" class="sub_table_b">������ �ּ�</td>
								<td bgcolor="f6f6f6" class="table_bl_left" colspan="3">${ADDR}</td>
							</tr>
<!-- #mr 2014.03.25-->
							<tr>
								<td height="26px" width="15%" align="center" bgcolor="e5eff8" class="sub_table_b">������ ���θ��ּ�</td>
								<td bgcolor="f6f6f6" class="table_bl_left" colspan="3">
									<c:if test="${board.WITH_DORO_NM != null && board.WITH_DORO_NM != ''}">
								 		${board.WITH_DORO_NM}
								 		${board.WITH_BD_BON}
								 		<c:if test="${board.WITH_BD_BU != '0' && board.WITH_BD_BU != null}">-${board.WITH_BD_BU}</c:if>
									</c:if>
								</td>
							</tr>	
<!-- #mr -->														
							<tr>
								<td height="26px" width="15%" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap>������ �ּ�</td>
								<td width="35%" bgcolor="eaeaea" class="table_bl_left" nowrap>
									<table>
										<tr>
											<td width="80%">
												${board.WITH_ADDR}
											</td>
											<td width="100px">
												<img src="/img/loca_icon.gif" alt="��ġȮ��" id="LocReg" width="64" height="18" border="0" onClick="javascript:jumyongZibun();" style="CURSOR:pointer;">
											</td>
										</tr>
									</table>
								</td>
								<td align="center" bgcolor="e5eff8" class="table_bl_left" rowspan="5" colspan="2" style="padding: 0px; margin: 0px">
								<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse: collapse;" cellpadding="0" cellspacing="0" class="sub_table">
									<tr>
										<td width="50%" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">������ ����</td>
										<td width="50%" align="center" bgcolor="e5eff8" class="sub_table_b">
											������ ����
										</td>
									</tr>
									<tr>
										<td height="104px">
											<c:if test="${board.SHOP_IMG_NAME != null }">
												<img src="${filePath }${board.SHOP_IMG_NAME }" id="img1" name="img1" onclick="resize_popup('1');" style="cursor: pointer; width: 80px; height: 104px">
											</c:if>
										</td>
										<td>
											<c:if test="${board.SHOP_IMG2_NAME != null }">
												<img src="${filePath }${board.SHOP_IMG2_NAME }" id="img2" name="img2" onclick="resize_popup('2');" style="cursor: pointer; width: 80px; height: 104px">
											</c:if>
										</td>
									</tr>
								</table>

								</td>
							</tr>
							<tr>
								<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b" >���� ����</td>
								<td bgcolor="eaeaea" class="table_bl_left">${board.JIBUN}</td>
							</tr>
							<tr>
								<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b" >�ֺ�����</td>
								<td bgcolor="eaeaea" class="table_bl_left">${board.WITH_INFO}</td>
							</tr>
							<tr>
								<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">
									<c:choose>
										<c:when test="${board.MANAGE_TYP == '2'}">
												��������
										</c:when>
										<c:when test="${board.MANAGE_TYP == '3'}">
												�赵����
										</c:when>
										<c:otherwise>
												��ġ����
										</c:otherwise>
									</c:choose>
								</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									<c:choose>
										<c:when test="${board.MANAGE_TYP == '2'}">
												${rnic:addDash(board.PICKUP_DATE)}
										</c:when>
										<c:when test="${board.MANAGE_TYP == '3'}">
												${rnic:addDash(board.GUIDE_DATE)}
										</c:when>
										<c:otherwise>
												${rnic:addDash(board.FOUND_DATE)}
										</c:otherwise>
									</c:choose>
								</td>
							</tr>

							<tr>
								<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">
									�ü�����/�԰�/����
								</td>
								<td bgcolor="f6f6f6" class="table_bl_left">
									${board.FT_TYP_NM}&nbsp;/&nbsp;${board.FT_SEL_NM}
									<c:if test="${board.FT_CAT_NM != null}">
									&nbsp;/&nbsp;${board.FT_CAT_NM}
									</c:if> 
								</td>
							</tr>

							<tr>
								<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">�������</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									<c:if test="${board.PLACE_L != null}">
						  				${board.PLACE_L} m �� ${board.PLACE_H} m = ${board.PLACE_A} ��
						  			</c:if>
					  			</td>
							</tr>
							<tr>
								<td height="26px" width="15%" align="center" bgcolor="e5eff8" class="sub_table_b">�������</td>
								<td width="35%" bgcolor="eaeaea" class="table_bl_left">
									${board.DP_SEL_NM} 
									<c:if test="${board.DP_TXT != null && board.DP_TXT != null}">
									/ 
									</c:if>
									${board.DP_TXT}
								</td>
								<td width="15%" align="center" bgcolor="e5eff8" class="sub_table_b">Ưȭ�Ÿ�����</td>
								<td width="35%" bgcolor="eaeaea" class="table_bl_left">
									<c:if test="${board.SPECIAL_ST == '1'}">�ϹݰŸ�</c:if> 
									<c:if test="${board.SPECIAL_ST != '1'}">Ưȭ�Ÿ� / ��������: ${rnic:addDash(board.SPECIAL_DATE)}</c:if>
								</td>
							</tr>
							<tr>
								<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">�����󿩺�</td>
								<td bgcolor="eaeaea" class="table_bl_left" colspan="1">
									<c:if test="${board.MAINTN_OB == '1'}">�������</c:if> 
									<c:if test="${board.MAINTN_OB != '1'}">������</c:if> 
									<c:if test="${board.MT_SEL_NM != null && board.MT_SEL_NM != null}"> / </c:if>
									${board.MT_SEL_NM}
								</td>
                            	<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">
                            	<c:if test="${board.FT_SEL == '214'}">������ȣ</c:if>
                            	</td>
                                <td colspan="1" bgcolor="f6f6f6" class="table_bl_left">
                                	${board.CAR_NO}
                            	</td>
							</tr>
							<tr>
								<td height="34" colspan="4" align="left" bgcolor="#FFFFFF" class="">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
										<td>
											<span class="sub_stan_blue">* �����</span>
										</td>
									</tr>
								</table>
								</td>
							</tr>
							<tr>
								<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">���ǰ��</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									${board.SG_TYP_NM} 
									<c:if test="${board.PURPOSE_CD != '710'}">
										<c:if test="${board.LIQUOR_SL == '1'}">�ַ��Ǹ�</c:if>
										<c:if test="${board.LPGAS_US == '1'}">LPG ���</c:if>
									</c:if>
								</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">�����ο�</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									${board.MEM_NUM}
									<c:if test="${board.MEM_NUM != null}">
										(��� ���� ����)
									</c:if>
								</td>
							</tr>
							<tr>
								<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">�ϸ����</td>
								<td bgcolor="eaeaea" class="table_bl_left">${board.DAY_SALES}</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">�㰡����</td>
								<td bgcolor="eaeaea" class="table_bl_left">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
										<td>${board.PERMIT_DATE}</td>
									</tr>
								</table>
								</td>
							</tr>
							<tr>
								<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">��ð�</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									${board.OPEN_TIME}
									<c:if test="${board.OPEN_TIME != null}">
									 	~ ${board.CLOSE_TIME}
									 </c:if>
								</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">���Դ�ü</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									${board.UN_TYP_NM} 
									<c:if test="${board.UN_TYP_NM != null && board.UN_TXT != null}">
									/ ${board.UN_TXT}
									</c:if>
								</td>
							</tr>
							<tr height="26px">
								<td align="center" bgcolor="e5eff8" class="sub_table_b">��Ÿ����</td>
								<td bgcolor="eaeaea" class="table_bl_left" colspan="3">${board.NOTES}</td>
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
											<img src="/img/mod_icon.gif" alt="����" width="56" height="18" border="0" onclick="javascript:Modify('${board.GAPAN_NO}')" style="cursor: pointer;">
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