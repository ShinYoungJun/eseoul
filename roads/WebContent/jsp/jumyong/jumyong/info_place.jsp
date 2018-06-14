<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/include.jsp" %>    
<%@ include file="/jsp/common/loginCheck.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />
<title>::::: 서울시 도로점용관리시스템 :::::</title>
<style type="text/css">
<!--
body {
	margin: 0px;
	background-image: url(/img/left_back.gif);
}
-->
</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">

<script>

	function submitClick()
	{
		var placeDetailForm = document.placeDetailForm;
		alert("FSAFDDF");
		placeDetailForm.submit();
	}
	
	
	
	
	// 등록폼 체크
	function checkForm(){
		var form1 = document.form1;
		alert(form1.year.value);

		form1.submit();
		//	특수문자 입력시 글 끝에 공백과 줄바꿈을 넣어야 깨지지 않음. 이유는 모르겠슴
		//		w.content.value = w.content.value+' '+'\n';	
		
	}
	
	
	

	
</script>

</head>

<body >



<form id="placeDetailForm" name="placeDetailForm" method="post" action = "/jumyong/inspectEdit.do" >

<input id="no" name="no" value="${no}" type="hidden" >

<input id="mode1" name="mode1" value="${mode1}" type="hidden" >

<input id="InspectDate" name="InspectDate" value="${InspectDate}" type="hidden" >

<%
	String no = request.getParameter("no");
	String SECTION = request.getParameter("SECTION");
%>

<table width="780" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td class="contborder_purple">							            
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
		            <tr>
        			    <td>
        			    <iframe id='iframe1' name='iframe1' frameborder="NO" border="0" framespacing="0" 
				        src="/jumyong/placeLocationEdit.do?no=<%=no%>&SECTION=<%=SECTION %>" width="100%" height="220" scrolling="NO"></iframe>
	        		    </td>
		            </tr>
        		    <tr>
			            <td>
			            <iframe id='iframe2' name='iframe2' frameborder="NO" border="0" framespacing="0" 
				        src="/jumyong/placeFileEdit.do?no=<%=no%>&SECTION=<%=SECTION %>" width="100%" height="240" scrolling="NO"></iframe>
			            </td>
					</tr>
					<tr>
						<td height="10" class="sub_table"> * 파일 첨부가 안될 시에는 Internet Explorer 의 도구 > 인터넷 옵션 > 보안  > 사용자 지정수준을 클릭하여 <br>
							<font color="red">'스크립팅하기 안전하지 않는 것으로 표시된 ActiveX 컨트롤 초기화 및 스크립팅'</font> 항목을 <font color="red">'확인'</font>으로 변경하여 주십시요. 
						</td>
					</tr>
				</table>
            </td>
		  </tr>     
</table>
</body>
</html>

