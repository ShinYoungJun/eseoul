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
	
	
	
	
	function InitPage()
	{	
		if(document.getElementById("mode1").value == "add"  )
		{
			document.getElementById("edit").style.visibility = "visible";
			document.getElementById("view").style.visibility = "hidden";
		
		}else if(document.getElementById("mode1").value == "edit" || document.getElementById("mode1").value == "add"  )
		{
			document.getElementById("edit").style.visibility = "visible";
			document.getElementById("view").style.visibility = "hidden";
		}else
		{
			document.getElementById("edit").style.visibility = "hidden";
			document.getElementById("view").style.visibility = "visible";
		}

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

<body onload="InitPage();">



<form name="placeDetailForm" id="placeDetailForm" method="post" action = "/jumyong/inspectEdit.do" >

<input name="no" value="${no}" type="hidden" >

<input name="mode1"  id = "mode1" value="${mode1}" type="hidden" >

<input name="InspectDate"  id = "InspectDate" value="${InspectDate}" type="hidden" >



<div id="view" style="position:absolute;width:100%;">
<table width="780" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td><table width="780" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td height="22" background="/img/tab_line_purple.gif"><table border="0" cellspacing="0" cellpadding="0">
                <tr>
                
                
                  <td width="111" onclick ="javascript:location.href='/jumyong/productInsert.do?no=${no}'"> <img src="/img/sub_petition_title4_off.gif" alt="���⳻��" width="110" height="22" border="0" style="cursor:pointer" > </td>
                  <td width="111" onclick ="javascript:location.href='/jumyong/inspectEdit.do?no=${no}'"> <img src="/img/sub_petition_title5_off.gif" alt="��������" width="110" height="22" border="0" style="cursor:pointer" >  </td>  
                  <td width="111" onclick ="javascript:location.href='/jumyong/confEdit.do?no=${no}'"><img src="/img/sub_petition_title6_off.gif" alt="��������" width="110" height="22" border="0" style="cursor:pointer" > </td>
                  <td width="111" onclick ="javascript:location.href='/jsp/jumyong/jumyong/info_placeDetail.jsp?no=${no}'"><img src="/img/sub_petition_title7_off.gif" alt="÷���ڷ�" width="110" height="22" border="0" style="cursor:pointer" > </td>
                  <td width="111" onclick ="javascript:location.href='/jsp/jumyong/jumyong/info_history.jsp?no=${no}'"><img src="/img/sub_petition_title8_on.gif" alt="�̷�����" width="110" height="22" border="0" style="cursor:pointer" > </td>
                 </tr>
            </table></td>
          </tr>

          <tr>
            <td height="40" align="right"><a href="#"><img src="/img/produ_icon.gif" alt="�������缭" width="84" height="22" border="0"></a><a href="#"><img src="/img/occu_icon.gif" alt="�����㰡��" width="84" height="22" border="0"></a><a href="#"><img src="/img/save_icon.gif" alt="��ü����" width="74" height="22" border="0"></a><a href="#"><img src="/img/list_icon.gif" alt="����Ʈ" width="66" height="22" border="0"></a></td>
          </tr>
        </table></td>
      </tr>
</table>
            
            
</div>



<div id="edit" style="position:absolute;width:100%;visibility:hidden;">
<table width="780" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td><table width="780" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td height="22" background="/img/tab_line_purple.gif"><table border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td width="111" onclick ="javascript:location.href='/jumyong/productInsert.do?no=${no}'"> <img src="/img/sub_petition_title4_off.gif" alt="���⳻��" width="110" height="22" border="0" style="cursor:pointer" > </td>
                  <td width="111" onclick ="javascript:location.href='/jumyong/inspectEdit.do?no=${no}'"> <img src="/img/sub_petition_title5_off.gif" alt="��������" width="110" height="22" border="0" style="cursor:pointer" >  </td>  
                  <td width="111" onclick ="javascript:location.href='/jumyong/confEdit.do?no=${no}'"><img src="/img/sub_petition_title6_off.gif" alt="��������" width="110" height="22" border="0" style="cursor:pointer" > </td>
                  <td width="111" onclick ="javascript:location.href='/jsp/jumyong/jumyong/info_placeDetail.jsp?no=${no}'"><img src="/img/sub_petition_title7_off.gif" alt="÷���ڷ�" width="110" height="22" border="0" style="cursor:pointer" > </td>
                  <td width="111" onclick ="javascript:location.href='/jsp/jumyong/jumyong/info_history.jsp?no=${no}'"><img src="/img/sub_petition_title8_on.gif" alt="�̷�����" width="110" height="22" border="0" style="cursor:pointer" > </td>
                </tr>
            </table></td>
          </tr>

          <tr>
            <td height="40" align="right"><a href="#"><img src="/img/produ_icon.gif" alt="�������缭" width="84" height="22" border="0"></a><a href="#"><img src="/img/occu_icon.gif" alt="�����㰡��" width="84" height="22" border="0"></a><a href="#"><img src="/img/save_icon.gif" alt="��ü����" width="74" height="22" border="0"></a><a href="#"><img src="/img/list_icon.gif" alt="����Ʈ" width="66" height="22" border="0"></a></td>
          </tr>
        </table></td>
      </tr>
</table>
            
</div>

</form>

</body>
</html>

