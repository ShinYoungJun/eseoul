<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="/jsp/common/loginCheck.jsp"%>
<%@ include file="/jsp/common/include.jsp"%>


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
<script language="javascript" src="/js/calculation.js"></script>
<script language="javascript" src="/js/PopupCalendar.js"></script>
<script language="javascript" src="/js/Ajax_request.js"></script>
<script language="javascript" src="/js/Check_inputbox.js"></script>

<body>
	<form id="form" name="form" method="post">
		<input type="hidden" id="GAPAN_NO" name="GAPAN_NO" value="${GAPAN_NO}">
		<table width="780px" border="0" cellspacing="0" cellpadding="0">
						<tr>
							<td align="left" class="contborder_blue">
								<table>
									<tr>
										<td>
											<table>
												<tr>
													<td valign="top">
														<span class="sub_stan_blue">* ����� ����</span>
														<table width="379px" border="1" bordercolor="#c9dfed" style="border-collapse: collapse; table-layout: fixed;" cellpadding="0" cellspacing="0" class="sub_table">
															<tr>
																<td>
																	<table width="360px" border="1" bordercolor="#c9dfed" style="border-collapse: collapse;" cellpadding="0" cellspacing="0" class="sub_table">
																		<tr>
																			<td width="100px" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">������ȣ</td>
																			<td width="60px" align="center" bgcolor="e5eff8" class="sub_table_b">����⵵</td>
																			<td width="70px" align="center" bgcolor="e5eff8" class="sub_table_b">�����</td>
																			<td width="70px" align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
																			<td width="60px" align="center" bgcolor="e5eff8" class="sub_table_b">�ΰ�����</td>
																		</tr>
																	</table>
																	<div style="height: 80px; overflow-y: scroll; scrollbar-face-color: #EEF8FB; scrollbar-3dlight-color: #BBBDB6; scrollbar-highlight-color: #EEF8FB; scrollbar-shadow-color: #BBBDB6; scrollbar-darkshadow-color: #EEF8FB; scrollbar-track-color: #EEF8FB; scrollbar-arrow-color: #BBBDB6;">
																		<table width="360px" border="1" bordercolor="#c9dfed" style="border-collapse: collapse;" cellpadding="0" cellspacing="0" class="sub_table">
																			<c:forEach items="${JumyongList}" var="jumyong" varStatus="idx">
																				<tr>
																					<td width="100px" height="26px" align="center">${jumyong.GAPAN_NO}</td>
																					<td width="60px" align="center">${jumyong.YEAR}</td>
																					<td width="70px" align="center">${rnic:insertComma2(jumyong.BONSE)}</td>
																					<td width="70px" align="center">${rnic:addDash(jumyong.TAX_DATE)}</td>
																					<td width="60px" align="center">
																						<font color="red"> 
																							<c:choose>
																								<c:when test="${jumyong.TAX_YN == '1'}">
																					 				�ΰ�
																								</c:when>
																								<c:otherwise>
																					 				�̺ΰ�
																								</c:otherwise>
																							</c:choose> 
																						</font>
																					</td>
																				</tr>
																			</c:forEach>
																		</table>
																	</div>
																</td>
															</tr>
														</table>
													</td>

													<td valign="top">
														<span class="sub_stan_blue">* �赵 ����</span>
														<table width="355px" border="1" bordercolor="#c9dfed" style="border-collapse: collapse; table-layout: fixed;" cellpadding="0" cellspacing="0" class="sub_table">
															<tr>
																<td>
																	<table width="336px" border="1" bordercolor="#c9dfed" style="border-collapse: collapse;" cellpadding="0" cellspacing="0" class="sub_table">
																		<tr>
																			<td width="100px" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">������ȣ</td>
																			<td width="156px" align="center" bgcolor="e5eff8" class="sub_table_b">�ü�����</td>
																			<td width="80px" align="center" bgcolor="e5eff8" class="sub_table_b">�赵����</td>
																		</tr>
																	</table>
																	<div style="height: 80px; overflow-y: scroll; scrollbar-face-color: #EEF8FB; scrollbar-3dlight-color: #BBBDB6; scrollbar-highlight-color: #EEF8FB; scrollbar-shadow-color: #BBBDB6; scrollbar-darkshadow-color: #EEF8FB; scrollbar-track-color: #EEF8FB; scrollbar-arrow-color: #BBBDB6;">
																		<table width="336px" border="1" bordercolor="#c9dfed" style="border-collapse: collapse;" cellpadding="0" cellspacing="0" class="sub_table">
																			<c:forEach items="${GuideList}" var="guide" varStatus="idx">
																				<tr>
																					<td width="100px" height="26px" align="center">${guide.GAPAN_NO}</td>
																					<td width="156px" align="center">${guide.FT_TYP_NM}/${guide.FT_SEL_NM}</td>
																					<td width="80px" align="center">${rnic:addDash(guide.GUIDE_DATE)}</td>
																				</tr>
																			</c:forEach>
																		</table>
																	</div>
																</td>
															</tr>
														</table>
													</td>
												</tr>
											</table>
										</td>
									</tr>
								
								
								
									<tr>
										<td height="10px"></td>
									</tr>
									<tr>
										<td><span class="sub_stan_blue">* ���� ����</span></td>

									</tr>
									<tr>
										<td>
											<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse: collapse; table-layout: fixed;" cellpadding="0" cellspacing="0" class="sub_table">
												<tr>
													<td>
														<table width="725px" border="1" bordercolor="#c9dfed" style="border-collapse: collapse;" cellpadding="0" cellspacing="0" class="sub_table">
															<tr>
																<td width="90px" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">������ȣ</td>
																<td width="70px" align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
																<td width="70px" align="center" bgcolor="e5eff8" class="sub_table_b">�ݳ�����</td>
																<td align="center" bgcolor="e5eff8" class="sub_table_b">����ǰ��</td>
																<td width="70px" align="center" bgcolor="e5eff8" class="sub_table_b">���·�</td>
																<td width="50px" align="center" bgcolor="e5eff8" class="sub_table_b">���·�<br />�ΰ�</td>
																<td width="70px" align="center" bgcolor="e5eff8" class="sub_table_b">���·�<br />��������</td>
																<td width="70px" align="center" bgcolor="e5eff8" class="sub_table_b">�����</td>
																<td width="50px" align="center" bgcolor="e5eff8" class="sub_table_b">�����<br />�ΰ�</td>
																<td width="70px" align="center" bgcolor="e5eff8" class="sub_table_b">�����<br />��������</td>

															</tr>
														</table>
														<div style="height: 80px; overflow-y: scroll; scrollbar-face-color: #EEF8FB; scrollbar-3dlight-color: #BBBDB6; scrollbar-highlight-color: #EEF8FB; scrollbar-shadow-color: #BBBDB6; scrollbar-darkshadow-color: #EEF8FB; scrollbar-track-color: #EEF8FB; scrollbar-arrow-color: #BBBDB6;">
															<table width="725px" border="1" bordercolor="#c9dfed" style="border-collapse: collapse;" cellpadding="0" cellspacing="0" class="sub_table">
																<c:forEach items="${PickupList}" var="Pickup" varStatus="idx">
																	<tr>
																		<td width="90px" height="26" align="center">${Pickup.GAPAN_NO}</td>
																		<td width="70px" align="center">${rnic:addDash(Pickup.PICKUP_DATE)}</td>
																		<td width="70px" align="center">${rnic:addDash(Pickup.RETURN_DATE)}</td>
																		<td align="center">${Pickup.FT_ITEM}</td>
																		<td width="70px" align="center">${rnic:insertComma2(Pickup.RETURN_BONSE)}</td>
																		<td width="50px" align="center">
																			<font color="red">
																				<c:choose>
																					<c:when test="${Pickup.RETURN_TAX_YN == '1'}">
																			 			�ΰ�
																					</c:when>
																					<c:otherwise>
																			 			�̺ΰ�
																					</c:otherwise>
																				</c:choose> 
																			</font>
																		</td>
																		<td width="70px" align="center">
																			${rnic:addDash(Pickup.RETURN_SUNAP_DATE)}
																		</td>
																		<td width="70px" align="center">${rnic:insertComma2(Pickup.NO_BONSE)}</td>
																		<td width="50px" align="center">
																			<font color="red">
																				<c:choose>
																					<c:when test="${Pickup.NO_TAX_YN == '1'}">
																			 			�ΰ�
																					</c:when>
																					<c:otherwise>
																						 �̺ΰ�
																					</c:otherwise>
																				</c:choose>
																			</font>
																		</td>
																		<td width="70px" align="center">
																			${rnic:addDash(Pickup.NO_SUNAP_DATE)}
																		</td>
																	</tr>
																</c:forEach>
															</table>
														</div></td>
												</tr>
											</table>
										</td>
									</tr>
									<tr>
										<td height="10px"></td>
									</tr>
									<tr>
										<td><span class="sub_stan_blue">* ���/�Ű� ����</span></td>

									</tr>
									<tr>
										<td>
											<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse: collapse; table-layout: fixed;" cellpadding="0" cellspacing="0" class="sub_table">
												<tr>
													<td>
														<table width="725px" border="1" bordercolor="#c9dfed" style="border-collapse: collapse;" cellpadding="0" cellspacing="0" class="sub_table">
															<tr>
																<td width="110px" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">������ȣ</td>
																<td width="120px" align="center" bgcolor="e5eff8" class="sub_table_b">����ǰ��</td>
																<td width="90px" align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
																<td width="80px" align="center" bgcolor="e5eff8" class="sub_table_b">�����ȣ</td>
																<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">ó������</td>
																<td width="135px" align="center" bgcolor="e5eff8" class="sub_table_b">ó����ü��</td>
																<td width="90px" align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
															</tr>
														</table>
														<div style="height: 80px; overflow-y: scroll; scrollbar-face-color: #EEF8FB; scrollbar-3dlight-color: #BBBDB6; scrollbar-highlight-color: #EEF8FB; scrollbar-shadow-color: #BBBDB6; scrollbar-darkshadow-color: #EEF8FB; scrollbar-track-color: #EEF8FB; scrollbar-arrow-color: #BBBDB6;">
															<table width="725px" border="1" bordercolor="#c9dfed" style="border-collapse: collapse;" cellpadding="0" cellspacing="0" class="sub_table">
																<c:forEach items="${SaleList}" var="Sale" varStatus="idx">
																	<tr>
																		<td width="110px" height="26" align="center">${Sale.GAPAN_NO}</td>
																		<td width="120px" align="center">${Sale.FT_TYP_NM} / ${Sale.FT_SEL_NM}</td>
																		<td width="90px" align="center">${rnic:addDash(Sale.SALE_DATE)}</td>
																		<td width="80px" align="center">${Sale.SALE_NO}</td>
																		<td width="100px" align="center">
																			<c:choose>
																				<c:when test="${Sale.SALE_STATUS == '1'}">
																				��� ����
																				</c:when>
																				<c:when test="${Sale.SALE_STATUS == '2'}">
																				�Ű� ����																
																				</c:when>
																				<c:when test="${Sale.SALE_STATUS == '3'}">
																				��� �Ϸ�
																				</c:when>
																				<c:when test="${Sale.SALE_STATUS == '4'}">
																				�Ű� �Ϸ�
																				</c:when>
																			</c:choose>
																		</td>
																		<td width="135px" align="center">${Sale.HND_OFFICE}</td>
																		<td width="90px" align="center">${rnic:addDash(Sale.HND_OPEDATE)}</td>
																	</tr>
																</c:forEach>
															</table>
														</div>
													</td>
												</tr>
											</table>
										</td>
									</tr>
									<tr>
										<td>
											<table>
												<tr>
													<td valign="top">
														<span class="sub_stan_blue">* ��� ����</span>
														<table width="367px" border="1" bordercolor="#c9dfed" style="border-collapse: collapse; table-layout: fixed;" cellpadding="0" cellspacing="0" class="sub_table">
															<tr>
																<td>
																	<table width="348px" border="1" bordercolor="#c9dfed" style="border-collapse: collapse;" cellpadding="0" cellspacing="0" class="sub_table">
																		<tr>
																			<td width="100px" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">�������</td>
																			<td width="248px" align="center" bgcolor="e5eff8" class="sub_table_b">��߳���</td>
																		</tr>
																	</table>
																	<div style="height: 80px; overflow-y: scroll; scrollbar-face-color: #EEF8FB; scrollbar-3dlight-color: #BBBDB6; scrollbar-highlight-color: #EEF8FB; scrollbar-shadow-color: #BBBDB6; scrollbar-darkshadow-color: #EEF8FB; scrollbar-track-color: #EEF8FB; scrollbar-arrow-color: #BBBDB6;">
																		<table width="348px" border="1" bordercolor="#c9dfed" style="border-collapse: collapse;" cellpadding="0" cellspacing="0" class="sub_table">
																			<c:forEach items="${AccuseList}" var="Accuse" varStatus="idx">
																				<tr>
																					<td width="100px" height="26px" align="center">${rnic:addDash(Accuse.ACCUSE_DATE)}</td>
																					<td width="248px" align="center">${Accuse.ACCUSE_DATA}</td>
																				</tr>
																			</c:forEach>
																		</table>
																	</div>
																</td>
															</tr>
														</table>
													</td>

													<td valign="top">
														<span class="sub_stan_blue">* �������� ����</span>
														<table width="367px" border="1" bordercolor="#c9dfed" style="border-collapse: collapse; table-layout: fixed;" cellpadding="0" cellspacing="0" class="sub_table">
															<tr>
																<td>
																	<table width="348px" border="1" bordercolor="#c9dfed" style="border-collapse: collapse;" cellpadding="0" cellspacing="0" class="sub_table">
																		<tr>
																			<td width="100px" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
																			<td width="60px" align="center" bgcolor="e5eff8" class="sub_table_b">����</td>
																			<td width="188px" align="center" bgcolor="e5eff8" class="sub_table_b">����</td>
																		</tr>
																	</table>
																	<div style="height: 80px; overflow-y: scroll; scrollbar-face-color: #EEF8FB; scrollbar-3dlight-color: #BBBDB6; scrollbar-highlight-color: #EEF8FB; scrollbar-shadow-color: #BBBDB6; scrollbar-darkshadow-color: #EEF8FB; scrollbar-track-color: #EEF8FB; scrollbar-arrow-color: #BBBDB6;">
																		<table width="348px" border="1" bordercolor="#c9dfed" style="border-collapse: collapse;" cellpadding="0" cellspacing="0" class="sub_table">
																			<c:forEach items="${ChangeJobList}" var="ChangeJob" varStatus="idx">
																				<tr>
																					<td width="100px" height="26px" align="center">${rnic:addDash(ChangeJob.CHANGE_JOB_DATE)}</td>
																					<td width="60px" align="center">${ChangeJob.CHANGE_JOB_SECTION_NM}</td>
																					<td width="188px" align="center">${ChangeJob.CHANGE_JOB_TYPE_NM}</td>
																				</tr>
																			</c:forEach>
																		</table>
																	</div>
																</td>
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
					</table>
	</form>
</body>
</html>