<%@page contentType="text/html;charset=euc-kr" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />
<title>우편번호 찾기</title>
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
	function retrieveZipCode()
	{ 
		var w = document.form;
		
	//	if(!checkStrNVMsg(w.town, "동/읍/면"))
	//		return;

		w.submit();
	}
	
	var close_cnt =0;
/*	
	function selectZip(zipCode, address)
	{
		var w = document.form;
		
		close_cnt++;
		
		if(w.openerPost.value	!= "")
		{
			var	zipCodeValue	= eval("opener.document." + w.openerPost.value);			
			zipCodeValue.value	= zipCode; 
		}

		 
		if(w.openerAddr.value	!= "")
		{
			var	AddrValue		= eval("opener.document." + w.openerAddr.value);
			AddrValue.value		= address; 
		}  

		
		if(close_cnt>=2){
			window.close();
		}
	}*/
	 //********** BEGIN_현진_20120209
	 	function selectZip(zipCode, address, sido, sigungu, emd)
	{
		var w = document.form;
		
		close_cnt++;
		
		if(w.openerPost.value	!= ""){
			var	zipCodeValue	= eval("opener.document." + w.openerPost.value);	
			zipCodeValue.value	= zipCode; 
		}

		if(w.openerAddr.value	!= ""){
			var	AddrValue		= eval("opener.document." + w.openerAddr.value);
			AddrValue.value		= address; 
		}  
		if(w.openerSi.value	!= ""){
			var	siValue	= eval("opener.document." + w.openerSi.value);
			siValue.value	= sido;
		}

		if(w.openerGun.value	!= ""){
			var	guValue		= eval("opener.document." + w.openerGun.value); 
			guValue.value	= sigungu;  

		}

		if(w.openerEmd.value	!= ""){
			var	emdValue	= eval("opener.document." + w.openerEmd.value);
			emdValue.value	= emd; 
		}

		if(w.openerBon.value	!= ""){
			var	openerBonValue	= eval("opener.document." + w.openerBon.value);
			openerBonValue.value= document.getElementById('jibun').value; 

		}
		if(w.openerBu.value	!= ""){	
			var	openerBuValue	= eval("opener.document." + w.openerBu.value);
			openerBuValue.value= document.getElementById('jibu').value; 
		}
		if(close_cnt>=2){
			window.close();
		}
	}
	 //********** END_현진_20120209
	function selectZipNew(zipCode, addressNew, sido, sigungu, doronm, bd)
	{ 
		var w = document.form;
		
		//alert('w.openerPost.value ='+w.openerPost.value);
		 
		
		close_cnt++;

		if(w.openerPost.value	!= "")
		{
			var	zipCodeValue	= eval("opener.document." + w.openerPost.value);
			zipCodeValue.value	= zipCode;
		}

//		alert('selectZipNew');
		
// 		alert('zipCode ='+zipCode);
// 		alert('addressNew ='+addressNew);
// 		alert('sido ='+sido);
// 		alert('sigungu ='+sigungu);
// 		alert('doronm ='+doronm);
// 		alert('bd ='+bd);
		 
		if(w.openerAddrNew.value	!= "")
		{ 
			var	AddrValueNew		= eval("opener.document." + w.openerAddrNew.value); 
			AddrValueNew.value		= addressNew; 
		} 

		if(w.openerSi.value	!= "")
		{ 
			var	siValue	= eval("opener.document." + w.openerSi.value);
			siValue.value	= sido; 
		}
		if(w.openerGun.value	!= "")
		{ 
			var	guValue		= eval("opener.document." + w.openerGun.value); 
			guValue.value	= sigungu;
		}
		if(w.openerDoro.value	!= "")
		{ 
			var	doroValue	= eval("opener.document." + w.openerDoro.value);
			doroValue.value	= doronm; 
		}
		/*
		if(w.openerBd.value	!= "")			
		{ 
			var	bdValue		= eval("opener.document." + w.openerBd.value); 
			bdValue.value	= bd;  			
		}
		*/ 				 
		if(close_cnt>=2){
			window.close();
		}
	}
		
//-->
</script>
</head>

<body onLoad="javascript:document.form.town.focus();">
<form name="form" method="post" action="zipCode_New.do">
<input type="hidden"   name="openerPost" value="${openerPost}">
<input type="hidden"   name="openerAddr" value="${openerAddr}">
<input type="hidden"   name="openerAddrNew" value="${openerAddrNew}">
<input type="hidden"   name="openerSi" value="${openerSi}">
<input type="hidden"   name="openerGun" value="${openerGun}">
<input type="hidden"   name="openerDoro" value="${openerDoro}">
<input type="hidden"   name="openerBd" value="${openerBd}">
<!--  //********** BEGIN_현진_20120209 -->
<input type="hidden"   name="openerEmd" value="${openerEmd}">
<input type="hidden"   name="openerBon" id="openerBon" value="${openerBon}">
<input type="hidden"   name="openerBu" id="openerBu" value="${openerBu}">
<!--   //********** END_현진_20120209 -->



<table width="800" border="0" cellspacing="0" cellpadding="0">
	<tr>
		<td background="/img/zipcode/border_bg.gif" style="padding:6">
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
					<td background="/img/zipcode/title_bg.gif" style="font-size:14px; font-weight:bold; color:#FFFFFF">
						<img src="/img/zipcode/title_po.gif" align="absmiddle">우편번호찾기
					</td>
				</tr>
				<tr>
					<td align="center" bgcolor="#FFFFFF" style="padding:20 5 20 5">
						<table border="0" cellpadding="0" cellspacing="0">
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
												<font color="#FF6600">(예: 서울시 강남구 역삼 1동 → '역삼' 입력)</font>
											</td>
										</tr>
										<tr>
											<td></td>
											<td height="12"></td>
										</tr>
										<tr>
											<td></td>
											<td width="500px" style="padding-left:5; line-height:15px">
												<table width="100%" border="0" cellspacing="0" cellpadding="0">												
													<tr>
														<td width="50%" valign="top">
															읍면동 :
															<input type="text" name="town" class="text_box" style="width:120px;height:19px" maxlength="20" value="${town}" title="지역명" style="ime-mode:active">
															<a href="javascript:retrieveZipCode();"><img src="/img/zipcode/pop_search.gif" align="absmiddle" border="0"></a>
														</td>
														<td valign="top" style="padding-left:5;">
															도로명 :
															<input type="text" name="doro_nm" class="text_box" style="width:120px;height:19px" maxlength="20" value="${doro_nm}" title="도로명" style="ime-mode:active">
															<a href="javascript:retrieveZipCode();"><img src="/img/zipcode/pop_search.gif" align="absmiddle" border="0"></a>
														</td>
													</tr>
													<tr>
														<td valign="top">
															지 &nbsp; 번 : 
															<input type="text" name="jibun" id="jibun" class="text_box" style="width:30px;height:19px" maxlength="5" value="${jibun}" title="지번" style="ime-mode:active">
															- <input type="text" name="jibu" id="jibu" class="text_box" style="width:30px;height:19px" maxlength="5" value="${jibu}" title="지번" style="ime-mode:active">
														</td>
														<td> </td>
													</tr>
												</table>
											</td>
										</tr>
									</table>
								</td>
							</tr>

							<tr>
								<td width="750" colspan="2" height="1" background="/img/zipcode/dot.gif"></td>
							</tr>

							<tr>
							<!--  내용 출력  -->
								<td colspan="2" align="center" style="padding:10 10 0 10" >
									<table width="760" border="0">
										<tr>
										<!-- 구도로주소 -->
											<td valign="top" >
												<table align="center" width="380">
													<tr>
														<td align="left" valign="top">
															<!-- 원래 colspan2 -->
															<table width="100%" border="0" cellspacing="1" cellpadding="0" bgcolor="#D8E2EB">
																<tr>
																	<td colspan="3" bgcolor="#3A77A9" height="2"></td>
																</tr>
																<c:choose>
																<c:when test="${mode == 'result'}">
																	<!-- choose start -->
																	<c:choose>
																		<c:when test="${zipCode_New!= null && !empty zipCode_New}">
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
																		<!-- loop start -->
																		<!-- //********** BEGIN_현진_20120208 수정-->
																		<c:set var="osinm" value="" />
																		<c:set var="osggnm" value="" />
																		<c:set var="oemdnm" value="" />
																		<c:set var="orinm" value="" />
																		<c:set var="obdnm" value="" />
																		<c:forEach items="${zipCode_New}" var="zipCode_New">
																			<c:choose>
																				<c:when test="${!(orinm==''||orinm==null)&&osinm==zipCode_New.SI_NM&&osggnm==zipCode_New.SGG_NM&&oemdnm==zipCode_New.EMD_NM&&orinm==zipCode_New.RI_NM}"></c:when>
																				<c:when test="${(orinm==''||orinm==null)&&osinm==zipCode_New.SI_NM&&osggnm==zipCode_New.SGG_NM&&oemdnm==zipCode_New.EMD_NM&&obdnm==zipCode_New.BD_NM}"></c:when>
																				<c:otherwise>
																					<tr>
																						<td height="22" align="center" bgcolor="#FFFFFF">
																							<span class="style3">${zipCode_New.ZIP_CL}</span>
																						</td>
																						<td bgcolor="#FFFFFF" style="padding-right:5; padding-left:5">
																							<span class="style1">${zipCode_New.SI_NM} ${zipCode_New.SGG_NM} ${zipCode_New.EMD_NM} ${zipCode_New.RI_NM}${zipCode_New.BD_NM}</span>
																						</td>
																						<!--  //********** BEGIN_현진_20120209 -->
																						<td align="center" bgcolor="#FFFFFF">
																							<a href="javascript:selectZip('${zipCode_New.ZIP_CL}', '${zipCode_New.SI_NM} ${zipCode_New.SGG_NM} ${zipCode_New.EMD_NM} ${zipCode_New.RI_NM}','${zipCode_New.SI_NM}', '${zipCode_New.SGG_NM}', '${zipCode_New.EMD_NM}');"><img src="/img/zipcode/select.gif" align="absmiddle" border="0"></a>
																						</td>
																						<!--   //********** END_현진_20120209 -->
																						
																						
																						
																					</tr>
																				</c:otherwise>
																		</c:choose>
																		<c:set var="osinm" value="${zipCode_New.SI_NM}" />
																		<c:set var="osggnm" value="${zipCode_New.SGG_NM}" />
																		<c:set var="oemdnm" value="${zipCode_New.EMD_NM}" />
																		<c:set var="orinm" value="${zipCode_New.RI_NM}" />
																		<c:set var="obdnm" value="${zipCode_New.BD_NM}" /></c:forEach>
																		<!-- //********** END_현진_20120208 -->
																		<!-- loop end -->
																</c:when>
																<c:otherwise>
																	<tr>
																		<td width="500" align="center" bgcolor="#FFFFFF" colspan="3" height="85">검색된 내용이 없습니다</td>
																	</tr>
																</c:otherwise>
															</c:choose>
															<!-- choose end -->
															</c:when>
															<c:otherwise>
																<tr>
																	<td align="center" bgcolor="#FFFFFF" colspan="3" height="85">검색해 주세요</td>
																</tr>
															</c:otherwise>
															</c:choose>																
															</table>
														</td>
													</tr>
												</table>
											</td>
											<!-- 새도로주소 -->
											<td valign="top">
												<table align="center" width="380">
													<tr>
														<td>
															<!-- 원래 colspan2 -->
															<table width="100%" border="0" cellspacing="1" cellpadding="0" bgcolor="#D8E2EB">
																<tr>
																	<td colspan="3" bgcolor="#3A77A9" height="2"></td>
																</tr>
																<c:choose>
																	<c:when test="${mode == 'result'}">
																		<!-- choose start -->
																		<c:choose>
																			<c:when test="${zipCode_New!= null && !empty zipCode_New}">
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
																				<!-- loop start -->
																				<!-- //********** BEGIN_현진_20120208 -->
																				<c:set var="osinm" value="" />
																				<c:set var="osggnm" value="" />
																				<c:set var="odonm" value="" />
																				<c:forEach items="${zipCode_New}" var="zipCode_New">
																					<c:choose>
																						<c:when test="${osinm==zipCode_New.SI_NM&&osggnm==zipCode_New.SGG_NM&&odonm==zipCode_New.DORO_NM}"></c:when>
																						<c:otherwise>
																							<tr>
																								<td height="22" align="center" bgcolor="#FFFFFF">
																									<span class="style3">${zipCode_New.ZIP_CL}</span>
																								</td>
																								<td bgcolor="#FFFFFF" style="padding-right:5; padding-left:5">
																									<span class="style1">${zipCode_New.SI_NM} ${zipCode_New.SGG_NM} ${zipCode_New.DORO_NM}</span>
																								</td>
																								<td align="center" bgcolor="#FFFFFF">
																									<a href="javascript:selectZipNew('${zipCode_New.ZIP_CL}', '${zipCode_New.SI_NM} ${zipCode_New.SGG_NM} ${zipCode_New.DORO_NM}', '${zipCode_New.SI_NM}', '${zipCode_New.SGG_NM}', '${zipCode_New.DORO_NM}', '${zipCode_New.BD_NM}');"><img src="/img/zipcode/select.gif" align="absmiddle" border="0"></a>
																								</td>
																							</tr>
																						</c:otherwise>
																					</c:choose>
																					<c:set var="osinm" value="${zipCode_New.SI_NM}" />
																					<c:set var="osggnm" value="${zipCode_New.SGG_NM}" />
																					<c:set var="odonm" value="${zipCode_New.DORO_NM}" />
																				</c:forEach>
																				<!-- //********** END_현진_20120208 -->
																				<!-- loop end -->
																			</c:when>
																		<c:otherwise>
																			<tr>
																				<td width="500" align="center" bgcolor="#FFFFFF" colspan="3" height="85">검색된 내용이 없습니다</td>
																			</tr>
																		</c:otherwise>
																	</c:choose>
																<!-- choose end -->
															</c:when>
															<c:otherwise>
																<tr>
																	<td width="500" align="center" bgcolor="#FFFFFF" colspan="3" height="85">검색해 주세요</td>
																</tr>
															</c:otherwise>
														</c:choose>
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
			