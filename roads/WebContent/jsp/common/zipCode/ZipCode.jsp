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
	
	function selectZip(zipCode, address)
	{
		var w = document.form;
		
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

		window.close();
	}
		
//-->
</script>
</head>

<body onLoad="javascript:document.form.town.focus();">
<form name="form" method="post" action="zipcode.do">
<input type="hidden" name="openerPost" value="${openerPost}">
<input type="hidden" name="openerAddr" value="${openerAddr}">

<table width="400" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td background="/img/zipcode/border_bg.gif" style="padding:6">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>
			<td background="/img/zipcode/title_bg.gif" style="font-size:14px; font-weight:bold; color:#FFFFFF"><img src="/img/zipcode/title_po.gif" align="absmiddle"> 우편번호찾기</td>
		  </tr>
		  <tr>
			<td align="center" bgcolor="#FFFFFF" style="padding:20 5 20 5">
				<table border="0" cellpadding="0" cellspacing="0">
				  <tr>
				    <td style="padding:10 10 10 5"><img src="/img/zipcode/pop_icon.gif"></td>
			        <td style="padding:5">
					  <table border="0" cellspacing="0" cellpadding="0">
						  <tr>
							<td width="3" bgcolor="#053e8a"></td>
							<td style="padding-left:5; line-height:15px"><b>찾고자하는 주소의 동/읍/면 이름을 입력하세요.</b><br>
 
<font color="#FF6600">(예: 서울시 강남구 역삼 1동 → '역삼1' 입력)</font></td>
						  </tr>
						  <tr>
						    <td></td>
						    <td height="12"></td>
					    </tr>
						  
						  <tr>
						    <td></td>
						    <td style="padding-left:5; line-height:15px">지역명: 
						      <input type="text" name="town" class="text_box" style="width:120px;height:19px" maxlength="20" value="${town}" title="지역명" style="ime-mode:active">
						      <a href="javascript:retrieveZipCode();"><img src="/img/zipcode/pop_search.gif" align="absmiddle" border="0"></a>
					    </tr>
					  </table>					</td>
				  </tr>
				  <tr>
					<td colspan="2" height="1" background="/img/zipcode/dot.gif"></td>
				  </tr>
				  <tr>
				    <td colspan="2" align="center" style="padding:10 10 0 10">
					<table width="100%" border="0" cellspacing="1" cellpadding="0" bgcolor="#D8E2EB">
                      <tr>
                        <td colspan="3" bgcolor="#3A77A9" height="2"></td>
                      </tr>
					  <c:choose>
					  <c:when test="${mode == 'result'}">
                      <!-- choose start -->
					  <c:choose>
					  <c:when test="${zipCode!= null && !empty zipCode}">
                      <tr>
                        <td width="80" height="22" align="center" bgcolor="#F8FBFE"><strong>우편번호</strong></td>
                        <td align="center" bgcolor="#F8FBFE"><strong>주 소</strong> </td>
                        <td width="60" align="center" bgcolor="#F8FBFE"><strong>선 택</strong></td>
                      </tr>
                      <!--  loop start -->
					  <c:forEach items="${zipCode}" var="zipCode">
                      <tr>
                         <td height="22" align="center" bgcolor="#FFFFFF"><span class="style3">${zipCode.ZIP_CL}</span></td>
	                        <td bgcolor="#FFFFFF" style="padding-right:5; padding-left:5"><span class="style1">
	                        	${zipCode.SI_NM} ${zipCode.SGG_NM} ${zipCode.EMD_NM} ${zipCode.RI_NM} ${zipCode.ISLAND_NM} ${zipCode.ISLAND_NM} ${zipCode.LNDN_CM} ${zipCode.BD_NM}</span></td>
	                        <td align="center" bgcolor="#FFFFFF">
	                        <a href="javascript:selectZip('${zipCode.ZIP_CL}', '${zipCode.SI_NM} ${zipCode.SGG_NM} ${zipCode.EMD_NM} ${zipCode.BD_NM}');"><img src="/img/zipcode/select.gif" align="absmiddle" border="0"></a></td>
                      </tr>
                      </c:forEach>
					   <!-- loop end -->
					  </c:when>
					  
		   			  <c:otherwise>
				  	   <tr>
	                    <td align="center" bgcolor="#FFFFFF" colspan="3" height="85">검색된 내용이 없습니다</td>
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
                    </table></td>
			      </tr>
				  <tr>
					<td colspan="2" align="right" style="padding:10 10 0 10">
					<a href="javascript:window.close();"><img src="/img/zipcode/pop_close.gif" align="absmiddle" border="0"></a></td>
				  </tr>
			  </table></td>
		  </tr>
		</table></td>
  </tr>
</table>
</form>
</body>
</html>
