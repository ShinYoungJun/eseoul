<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/include.jsp" %>    
<%@ include file="/jsp/common/loginCheck.jsp" %>
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
						<td height="10" class="sub_table"> * ���� ÷�ΰ� �ȵ� �ÿ��� Internet Explorer �� ���� > ���ͳ� �ɼ� > ����  > ����� ���������� Ŭ���Ͽ� <br>
							<font color="red">'��ũ�����ϱ� �������� �ʴ� ������ ǥ�õ� ActiveX ��Ʈ�� �ʱ�ȭ �� ��ũ����'</font> �׸��� <font color="red">'Ȯ��'</font>���� �����Ͽ� �ֽʽÿ�. 
						</td>
					</tr>
				</table>
            </td>
		  </tr>     
</table>
</body>
</html>

