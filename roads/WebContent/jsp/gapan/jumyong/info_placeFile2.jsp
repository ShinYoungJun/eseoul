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



<form name="placeDetailForm" id="placeDetailForm" method="post" action = "/jumyong/inspectEdit.do" >

<input name="no" value="${no}" type="hidden" >

<input name="mode1"  id = "mode1" value="${mode1}" type="hidden" >


<table width = "100%">
              <tr>
                <td>
                <table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                  <tr>
                    <td height="28" colspan="6" bgcolor="#FFFFFF" class="table_bl_left"><span class="sub_stan_blue">* ÷������</span></td>
                    </tr>
                  <tr>
                    <td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">��ȣ</td>
                    <td align="center" bgcolor="e5eff8" class="sub_table_b">�ڷ�����</td>
                    <td align="center" bgcolor="e5eff8" class="sub_table_b">�ڷἳ��</td>
                    <td align="center" bgcolor="e5eff8" class="sub_table_b">÷�����ϸ�</td>
                    <td width="90" align="center" bgcolor="e5eff8" class="sub_table_b">����ũ��</td>
                    <td width="90" align="center" bgcolor="e5eff8" class="sub_table_b">���</td>
                    </tr> 
                  <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''">
                    <td height="26" align="center"><a href="#" class="inqu">2</a></td>
                    <td align="center"><a href="#" class="inqu">�������</a></td>
                    <td align="center"><a href="#" class="inqu">������ ������� </a></td>
                    <td align="center"><a href="#" class="inqu">54511324112345.jpg</a></td>
                    <td align="center"><a href="#" class="inqu">1,024 KB </a></td>
                    <td align="center"><a href="#" class="inqu"><img src="/img/mod_icon2.gif" alt="����" width="34" height="18" border="0"></a><a href="#" class="inqu"><img src="/img/del_icon.gif" alt="����" width="34" height="18" border="0"></a></td>
                    </tr>
                  <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''">
                    <td height="26" align="center">&nbsp;</td>
                    <td align="center">&nbsp;</td>
                    <td align="center">&nbsp;</td>
                    <td align="center">&nbsp;</td>
                    <td align="center">&nbsp;</td>
                    <td align="center">&nbsp;</td>
                    </tr>
                  <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''">
                    <td height="26" align="center">-</td>
                    <td align="center"><span class="table_bl_left">
                      <select name="select7" class="related" style="width:80px" >
                        <option>����</option>
                                            </select>
                    </span></td>
                    <td align="center"><input name="textfield222232322353" type="text" class="input_form1" style="width:120px"></td>
                    <td align="center"><input name="textfield222232322352" type="text" class="input_form1" style="width:150px"></td>
                    <td align="center"><a href="#" class="inqu"><img src="/img/file_icon.gif" alt="����ã��" width="64" height="18" border="0"></a></td>
                    <td align="center"><a href="#" class="inqu"><img src="/img/save_icon2.gif" alt="����" width="56" height="18" border="0"></a></td>
                    </tr>
                </table>
                </td>
              </tr>
              <tr>
                <td height="40" align="center"><table border="0" cellpadding="0" cellspacing="0">
                  <tr>
                    <td><a href="#"><img src="/img/prev_icon2.gif" width="13" height="11" border="0"></a></td>
                    <td><a href="#"><img src="/img/prev_icon.gif" width="12" height="11" border="0"></a></td>
                    <td width="15"></td>
                    <td align="center"><a href="#" class="list">1</a> <a href="#" class="list">2</a> <a href="#" class="list">3</a> <a href="#" class="list">4</a> <a href="#" class="list">5</a> <a href="#" class="list">6</a> <a href="#" class="list">7</a> <a href="#" class="list">8</a> <a href="#" class="list">9</a> </td>
                    <td width="15">&nbsp;</td>
                    <td><a href="#"><img src="/img/next_icon.gif" width="12" height="11" border="0"></a></td>
                    <td><a href="#"><img src="/img/next_icon2.gif" width="13" height="11" border="0"></a></td>
                    <td align="right"><a href="#"></a></td>
                  </tr>
                </table></td>
              </tr>
            </table>
    



</body>
</html>

