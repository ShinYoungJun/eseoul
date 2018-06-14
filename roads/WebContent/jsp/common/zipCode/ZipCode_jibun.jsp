<%@page contentType="text/html;charset=euc-kr" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />
<title>지번 찾기</title>
<style type="text/css">
<!--
body,td,th {
	font-family: 돋움;
	font-size: 12px;
	color: #053e8a;
}
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}
.style1 {color: #000000}
.style3 {color: #FF6600; font-weight: bold; }

-->
</style>
<script language="JavaScript" src="/js/common.js"></script>
<script language="javascript">
//<!--

 	function selectBefore(zipCode, addr1, bon, bu, emd_nm)
	 {
		var w = document.form;		
		var odoc = "opener.document." + w.FRM.value + ".";

		if(w.oZIP_CL.value	!= ""){	
			var mPost = eval(odoc + w.oZIP_CL.value);
			mPost.value = zipCode;			
		}
		if(w.oADDR1.valu	!= ""){
			var mAddr1 = eval(odoc + w.oADDR1.value);
			mAddr1.value = addr1;
		}
		if(w.oBON.value	!= ""){	
			var mBon  = eval(odoc + w.oBON.value);
			mBon.value  = bon;
		}
		if(w.oBU.value	!= ""){
			var mBu   = eval(odoc + w.oBU.value);
			mBu.value   = bu;
		}
		if(w.oADDR2.value	!= ""){
			var mAddr2 = eval(odoc + w.oADDR2.value);
			//mAddr2.value = addr2;
		}
		if(w.oEMD_NM.value	!= ""){
			var mEmd_nm 	= eval(odoc + w.oEMD_NM.value);
			mEmd_nm.value = emd_nm;	
		}		
		
		window.close();
		
	}

 	function selectTobe(zipCode, bd_bon, bd_bu, bd_nm, si, gun, doro_nm)
	 {
		var w = document.form;
		var odoc = "opener.document." + w.FRM.value + ".";
	 
		if(w.oZIP_CL.value	!= ""){
			var mPost 		= eval(odoc + w.oZIP_CL.value);
			mPost.value = zipCode;
		}
		if(w.oADDR1_NEW.value	!= ""){
			var mADDR1_NEW   = eval(odoc + w.oADDR1_NEW.value);
			mADDR1_NEW.value = si + " " + gun + " " + doro_nm;
		}
		if(w.oBD_BON.value	!= ""){
			var mBD_BON       = eval(odoc + w.oBD_BON.value);
			mBD_BON.value = bd_bon;
		}
		if(w.oBD_BU.value	!= ""){
			var mBD_BU       = eval(odoc + w.oBD_BU.value);
			mBD_BU.value = bd_bu;
		}
		if(w.oBD_NM.value	!= ""){	
			var mBD_NM       = eval(odoc + w.oBD_NM.value);
			mBD_NM.value = bd_nm;
		}
		if(w.oSI_NM.value	!= ""){			
			var mSI_NM       = eval(odoc + w.oSI_NM.value);
			mSI_NM.value = si;
		}
		if(w.oSGG_NM.value	!= ""){
			var mSGG_NM      = eval(odoc + w.oSGG_NM.value);
			mSGG_NM.value = gun;
		}
		if(w.oDORO_NM.value	!= ""){	
			var mDORO_NM      = eval(odoc + w.oDORO_NM.value);
			mDORO_NM.value = doro_nm;  
		}

		//var mBD_DET_NM   = eval(odoc + w.oBD_DET_NM.value);
		//mBD_DET_NM.value =
		window.close();		
	}

//-->
</script>
</head>

<body>
<form name="form" method="post" action="/zipCode_jibun.do">
<input type="hidden" name="oZIP_CL" id="oZIP_CL" value="${oZIP_CL}">
<input type="hidden" name="oADDR1" id="oADDR1" value="${oADDR1}">
<input type="hidden" name="oBON" id="oBON" value="${oBON}">
<input type="hidden" name="oBU" id="oBU" value="${oBU}">
<input type="hidden" name="oADDR2" id="oADDR2" value="${oADDR2}">
<input type="hidden" name="oADDR1_NEW " id="oADDR1_NEW" value="${oADDR1_NEW}">
<input type="hidden" name="oBD_BON" id="oBD_BON" value="${oBD_BON}">
<input type="hidden" name="oBD_BU" id="oBD_BU" value="${oBD_BU}">
<input type="hidden" name="oBD_NM" id="oBD_NM" value="${oBD_NM}">
<input type="hidden" name="oBD_DET_NM " id="oBD_DET_NM" value="${oBD_DET_NM}">
<input type="hidden" name="oSI_NM" id="oSI_NM" value="${oSI_NM}">
<input type="hidden" name="oSGG_NM" id="oSGG_NM" value="${oSGG_NM}">
<input type="hidden" name="oDORO_NM" id="oDORO_NM" value="${oDORO_NM}">
<input type="hidden" name="oEMD_NM" id="oEMD_NM" value="${oEMD_NM}">



<input type="hidden" name="FRM" id="FRM" value="${FRM}">
<table width="580" height="300" border="0" cellspacing="0" cellpadding="0">
	<tr>
		<td background="/img/zipcode/border_bg.gif" style="padding:6" valign="top">
			<table width="100%" height="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
					<td height="40px" background="/img/zipcode/title_bg.gif" style="font-size:14px; font-weight:bold; color:#FFFFFF">
						<img src="/img/zipcode/title_po.gif" align="absmiddle">우편번호찾기
					</td>
				</tr>
				<tr>
					<td align="center" bgcolor="#FFFFFF" style="padding:20 5 20 5">
						<table border="0" cellpadding="0" cellspacing="0">
						<!--
							<tr>
								<td style="padding:10 10 10 5" align="center">
									<img src="/img/zipcode/pop_icon.gif">
								</td>
								<td style="padding:5">
									<table border="0" cellspacing="0" cellpadding="0">
										<tr>
											<td width="3" bgcolor="#053e8a"></td>
											<td style="padding-left:5; line-height:15px">
												<b>찾고자하는 주소의 동/읍/면 이름을 입력하세요.</b><br/>                                            
												<font color="#FF6600">(예: 서울시 강남구 역삼 1동 → '역삼1' 입력)</font>
											</td>
										</tr>
										<tr>
											<td></td>
											<td height="12"></td>
										</tr>
										<tr>
											<td></td>
											<td style="padding-left:5; line-height:15px">지역명:
												<input type="text" name="town" class="text_box" style="width:120px;height:19px" maxlength="20" value="${town}" title="지역명" style="ime-mode:active">
												<a href="javascript:retrieveZipCode();"><img src="/img/zipcode/pop_search.gif" align="absmiddle" border="0"></a>&nbsp;도로명
												<input type="text" name="doro_nm" class="text_box" style="width:120px;height:19px" maxlength="20" value="${doro_nm}" title="도로명" style="ime-mode:active">
												<a href="javascript:retrieveZipCode();"><img src="/img/zipcode/pop_search.gif" align="absmiddle" border="0"></a>
										</tr>
									</table>
								</td>
							</tr>

							<tr>
								<td width="750" colspan="2" height="1" background="/img/zipcode/dot.gif"></td>
							</tr>
							-->	
							<c:if test="${mode != 'null'}">						
							<tr>
								<td colspan="2" align="left" height="22" bgcolor="#FFFFFF" style="padding-right:10; padding-left:10">
									<table width="480" border="0" cellspacing="1" cellpadding="0" bgcolor="#D8E2EB">
										<tr>
											<td width="80" height="22" align="left">
												<strong>기본 주소  :</strong>
											</td>
											<td align="left" bgcolor="#F8FBFE">
												${ZIP_CL} ${SI_NM} ${SGG_NM} ${EMD_NM} ${RI_NM} ${BON}-${BU} ${ADDR2}
											</td>
										</tr>
										<tr>
											<td width="80" height="22" align="left">
												<strong>도로명 주소  :</strong>
											</td>
											<td align="left" bgcolor="#F8FBFE">
												${ZIP_CL} ${SI_NM} ${SGG_NM} ${DORO_NM} ${BD_BON} ${BD_BU}${BD_NM}${BD_DET_NM}
											</td>
										</tr>																				
									</table>
								</td>
							</tr>
							</c:if>
							<tr>
							<!--  내용 출력  -->
								<td height="180" valign="top" colspan="2" align="center" style="padding:10 10 0 10" >
									<table width="480" border="0" cellspacing="1" cellpadding="0" bgcolor="#D8E2EB">
										<tr>
											<td colspan="3" bgcolor="#3A77A9" height="2"></td>
										</tr>
										<c:if test="${mode == 'null'}">										
											<tr>
												<td align="center" bgcolor="#FFFFFF" colspan="3" height="85">입력된 내용이 없거나<br/>수정시 입력 후에 처리해주세요.</td>
											</tr>
										</c:if>
										
										<c:if test="${mode != 'null'}">												
											<!-- loop start -->
											<c:if test="${mode == 'before'}">												
											<tr>
												<td colspan="3" height="22" align="center" bgcolor="#F8FBFE">
													<strong>도로명 새주소</strong>
												</td>												
											</tr>
											<tr>
												<td width="80" height="22" align="center" bgcolor="#F8FBFE">
													<strong>우편번호</strong>
												</td>
												<td align="center" bgcolor="#F8FBFE">
													<strong>주 소</strong>
												</td>
												<td width="60" align="center" bgcolor="#F8FBFE">
													<strong>선 택</strong>
												</td>
											</tr>
												<c:set var="osinm" value="" />
												<c:set var="osggnm" value="" />
												<c:set var="odonm" value="" />
												<c:if test="${!(empty ZipCode_jibun)}">
												<c:forEach items="${ZipCode_jibun}" var="ZipCode_jibun">
												<c:choose>
												<c:when test="${osinm==ZipCode_jibun.SI_NM&&osggnm==ZipCode_jibun.SGG_NM&&odonm==ZipCode_jibun.DORO_NM}"></c:when>
												<c:otherwise>
													<tr>
														<td height="22" align="center" bgcolor="#FFFFFF">
															<span class="style3">${ZipCode_jibun.ZIP_CL}</span>
														</td>													
														<td bgcolor="#FFFFFF" style="padding-right:5; padding-left:5">														
															<span class="style1">${ZipCode_jibun.SI_NM} ${ZipCode_jibun.SGG_NM} ${ZipCode_jibun.DORO_NM} ${ZipCode_jibun.BD_BON}-${ZipCode_jibun.BD_BU} ${ZipCode_jibun.BD_NM}</span>
														</td>
														<td align="center" bgcolor="#FFFFFF">
															<a href="javascript:selectTobe('${ZipCode_jibun.ZIP_CL}','${ZipCode_jibun.BD_BON}','${ZipCode_jibun.BD_BU}','${ZipCode_jibun.BD_NM}','${ZipCode_jibun.SI_NM}','${ZipCode_jibun.SGG_NM}','${ZipCode_jibun.DORO_NM}')">	
															<img src="/img/zipcode/select.gif" align="absmiddle" border="0"></a>
														</td>										
													</tr>
												</c:otherwise>
												</c:choose>
												<c:set var="osinm" value="${ZipCode_jibun.SI_NM}" />
												<c:set var="osggnm" value="${ZipCode_jibun.SGG_NM}" />
												<c:set var="odonm" value="${ZipCode_jibun.DORO_NM}" />												
												</c:forEach>
												</c:if>
												<c:if test="${empty ZipCode_jibun}">
												<tr>
													<td align="center" bgcolor="#FFFFFF" colspan="3" height="85">검색결과가 없습니다.</td>
												</tr>
												</c:if>
											</c:if>
											<!-- loop end -->		
											
											
											<!-- loop start -->
											<c:if test="${mode == 'toBe'}">
											<tr>
												<td colspan="3" height="22" align="center" bgcolor="#F8FBFE">
													<strong>기본 주소</strong>
												</td>												
											</tr>
											<tr>
												<td width="80" height="22" align="center" bgcolor="#F8FBFE">
													<strong>우편번호</strong>
												</td>
												<td align="center" bgcolor="#F8FBFE">
													<strong>주 소</strong>
												</td>
												<td width="60" align="center" bgcolor="#F8FBFE">
													<strong>선 택</strong>
												</td>
											</tr>
												<c:set var="osinm" value="" />
												<c:set var="osggnm" value="" />
												<c:set var="oemdnm" value="" />
												<c:set var="orinm" value="" />
												<c:set var="obdnm" value="" />
												<c:if test="${!(empty ZipCode_jibun)}">
												<c:forEach items="${ZipCode_jibun}" var="ZipCode_jibun">
													<c:choose>
													<c:when test="${!(orinm==''||orinm==null)&&osinm==ZipCode_jibun.SI_NM&&osggnm==ZipCode_jibun.SGG_NM&&oemdnm==ZipCode_jibun.EMD_NM&&orinm==ZipCode_jibun.RI_NM}"></c:when>
													<c:when test="${(orinm==''||orinm==null)&&osinm==ZipCode_jibun.SI_NM&&osggnm==ZipCode_jibun.SGG_NM&&oemdnm==ZipCode_jibun.EMD_NM&&obdnm==ZipCode_jibun.BD_NM}"></c:when>
														<c:otherwise>
															<tr>
																<td height="22" align="center" bgcolor="#FFFFFF">
																	<span class="style3">${ZipCode_jibun.ZIP_CL}</span>
																</td>													
																<td bgcolor="#FFFFFF" style="padding-right:5; padding-left:5">														
																	<span class="style1">${ZipCode_jibun.SI_NM} ${ZipCode_jibun.SGG_NM} ${ZipCode_jibun.EMD_NM} ${ZipCode_jibun.RI_NM}${ZipCode_jibun.BD_NM} ${ZipCode_jibun.BON}-${ZipCode_jibun.BU}</span>
																</td>
																<td align="center" bgcolor="#FFFFFF">
																	<a href="javascript:selectBefore('${ZipCode_jibun.ZIP_CL}','${ZipCode_jibun.SI_NM} ${ZipCode_jibun.SGG_NM} ${ZipCode_jibun.EMD_NM} ${ZipCode_jibun.RI_NM}','${ZipCode_jibun.BON}','${ZipCode_jibun.BU}','${ZipCode_jibun.EMD_NM}')">
																	<img src="/img/zipcode/select.gif" align="absmiddle" border="0"></a>
																</td>										
															</tr>
														</c:otherwise>
													</c:choose>
												<c:set var="osinm" value="${ZipCode_jibun.SI_NM}" />
												<c:set var="osggnm" value="${ZipCode_jibun.SGG_NM}" />
												<c:set var="oemdnm" value="${ZipCode_jibun.EMD_NM}" />
												<c:set var="orinm" value="${ZipCode_jibun.RI_NM}" />
												<c:set var="obdnm" value="${ZipCode_jibun.BD_NM}" />
												</c:forEach>
												</c:if>
												<c:if test="${empty ZipCode_jibun}">
												<tr>
													<td align="center" bgcolor="#FFFFFF" colspan="3" height="85">검색결과가 없습니다.</td>
												</tr>
												</c:if>
											</c:if>
											<!-- loop end -->																				
											<c:if test="${mode == 'all' && empty ZipCode_jibun}">
												<tr>
													<td align="center" bgcolor="#FFFFFF" colspan="3" height="85">주소가 일치하지 않습니다.</td>
												</tr>
											</c:if>
											<c:if test="${mode == 'all' && !(empty ZipCode_jibun)}">
												<tr>
													<td align="center" bgcolor="#FFFFFF" colspan="3" height="85">주소가 일치합니다.</td>
												</tr>
											</c:if>
											<c:if test="${mode == 'notJibun'}">
												<tr>
													<td align="center" bgcolor="#FFFFFF" colspan="3" height="85">지번을 입력해주세요</td>
												</tr>
											</c:if>										
										</c:if>										
																			
									</table>
								</td>
							</tr>
							<tr>
								<td colspan="2" align="right" style="padding:10 10 0 10">
									<a href="javascript:window.close();"><img src="/img/zipcode/pop_close.gif" align="absmiddle" border="0"></a>
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
			