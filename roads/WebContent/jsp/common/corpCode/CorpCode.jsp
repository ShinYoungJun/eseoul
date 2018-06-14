<%@page contentType="text/html;charset=euc-kr" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />
<title>점용 업체 찾기</title>
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
	function retrieveCorpCode()
	{
	
		var w = document.form;
		
	//	if(!checkStrNVMsg(w.corpNm, "업체명"))
	//		return;

		w.submit();
	}
	
	function selectCorp(corpNm, jijumNm, office_code, jijum_code)
	{
		var w = document.form;
		
		if(w.openerCorpNm.value	!= "")
		{
			var	officeNmValue	= eval("opener.document." + w.openerCorpNm.value);
			officeNmValue.value	= corpNm;
		}
		if(w.openerOffice.value	!= "")
		{
			var	jijumNmValue		= eval("opener.document." + w.openerOffice.value);
			jijumNmValue.value		= jijumNm;
		}
		if(w.openerCorpCd.value	!= "")
		{
			var	codeValue		= eval("opener.document." + w.openerCorpCd.value);
			codeValue.value		= trim(office_code)+trim(jijum_code);
		}
		window.close();
	}
		
//-->
</script>
</head>

<body onLoad="javascript:document.form.corpNm.focus();">
<form name="form" method="post" action="corpcode.do">
<input type="hidden" name=openerCorpNm value="${openerCorpNm}">
<input type="hidden" name="openerOffice" value="${openerOffice}">
<input type="hidden" name="openerCorpCd" value="${openerCorpCd}">

<table width="400" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td background="/img/zipcode/border_bg.gif" style="padding:6">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>
			<td background="/img/zipcode/title_bg.gif" style="font-size:14px; font-weight:bold; color:#FFFFFF"><img src="/img/zipcode/title_po.gif" align="absmiddle"> 업체찾기</td>
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
							<td style="padding-left:5; line-height:15px"><b>찾고자하는 업체명을 입력하세요.</b><br>
								<font color="#FF6600">(예: 한국전력공사)</font></td>
						  </tr>
						  <tr>
						    <td></td>
						    <td height="12"></td>
					    </tr>
						  
						  <tr>
						    <td></td>
						    <td style="padding-left:5; line-height:15px">업체명: 
						      <input type="text" name="corpNm" class="text_box" style="width:120px;height:19px" maxlength="20" value="" title="지역명" style="ime-mode:active">
						      <a href="javascript:retrieveCorpCode();"><img src="/img/zipcode/pop_search.gif" align="absmiddle" border="0"></a>
					    </tr>
					  </table>					</td>
				  </tr>
				  <tr>
					<td colspan="2" height="1" background="/img/zipcode/dot.gif"></td>
				  </tr>
				  <tr>
				  <td colspan="2" align="center" style="color: red">※존재하지 않는 업체에 경우 관리자에게 문의하세요.</td>
				  </tr>
				  <tr>
				    <td colspan="2" align="center" style="padding:10 10 0 10">
					<table width="100%" border="0" cellspacing="1" cellpadding="0" bgcolor="#D8E2EB">
                      <tr>
                        <td colspan="5" bgcolor="#3A77A9" height="2"></td>
                      </tr>
					  <c:choose>
					  <c:when test="${mode == 'result'}">
                      <!-- choose start -->
					  <c:choose>
					  <c:when test="${corpCode!= null && !empty corpCode}">
                      <tr>
                        <td width="30" height="22" align="center" bgcolor="#F8FBFE"><strong>번호</strong></td>
                        <td width="120" height="22" align="center" bgcolor="#F8FBFE"><strong>시설물 관련 업체명</strong></td>
                        <td width="90" height="22" align="center" bgcolor="#F8FBFE"><strong>지사 및 지점명</strong> </td>
                        <td width="50" height="22" align="center" bgcolor="#F8FBFE"><strong>코드값</strong> </td>
                        <td width="50" height="22" align="center" bgcolor="#F8FBFE"><strong>선 택</strong></td>
                      </tr>
                      <!--  loop start -->
					  <c:forEach items="${corpCode}" var="corpCode">
                      <tr>
                         <td height="22" align="center" bgcolor="#FFFFFF"><span class="style1">${corpCode.RN}</span></td>
                         <td bgcolor="#FFFFFF" style="padding-right:5; padding-left:5">
                        	<span class="style1">
                        	${corpCode.OFFICE_NM}
                        	</span>
                         </td>
                         <td bgcolor="#FFFFFF" style="padding-right:5; padding-left:5">
                        	<span class="style1">
                        	${corpCode.JIJUM_NM}
                        	</span>
                         </td>
                         <td bgcolor="#FFFFFF" align="center" style="padding-right:5; padding-left:5">
                        	<span class="style3">
                        	${corpCode.OFFICE_CD}${corpCode.JIJUM_CD}
                        	</span>
                         </td>
                         <td align="center" bgcolor="#FFFFFF">
                        	<a href="javascript:selectCorp('${corpCode.OFFICE_NM}', '${corpCode.JIJUM_NM}', '${corpCode.OFFICE_CD}','${corpCode.JIJUM_CD}');"><img src="/img/zipcode/select.gif" align="absmiddle" border="0">
                        	</a>
                         </td>
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
