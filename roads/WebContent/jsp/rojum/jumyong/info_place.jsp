<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
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
	
	
	
	
	// ����� üũ
	function checkForm(){
		var form1 = document.form1;
		alert(form1.year.value);

		form1.submit();
		//	Ư������ �Է½� �� ���� ����� �ٹٲ��� �־�� ������ ����. ������ �𸣰ڽ�
		//		w.content.value = w.content.value+' '+'\n';	
		
	}
	
	
	

	
</script>

</head>

<body >



<form name="placeDetailForm" id="placeDetailForm" method="post" action = "/gapan/jumyong/inspectEdit.do" >

<input name="no" value="${no}" type="hidden" >

<input name="mode1"  id = "mode1" value="${mode1}" type="hidden" >

<input name="InspectDate"  id = "InspectDate" value="${InspectDate}" type="hidden" >


<%String no = request.getParameter("no");%>

<table width="780" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td class="contborder_purple">							            
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
		           <!-- <tr>
        			    <td>
        			    <iframe name='iframe1' frameborder="NO" border="0" framespacing="0" 
				        src="/gapan/jumyong/placeLocationEdit.do?no=<%=no%>" width="100%" height="220" scrolling="NO"></iframe>
	        		    </td>
		            </tr>-->
        		    <tr>
			            <td>
			            <iframe name='iframe1' frameborder="NO" border="0" framespacing="0" 
				        src="/gapan/jumyong/placeFileEdit.do?no=<%=no%>" width="100%" height="240" scrolling="NO"></iframe>
			            </td>
					</tr>
				</table>
            </td>
		  </tr>      
</table>
</body>
</html>

