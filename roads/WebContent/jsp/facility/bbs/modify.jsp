<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title></title>
<style type="text/css">
<!--
body {
	margin: 0px;
	background-image: url(/img/left_back.gif);
}
-->
</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
<script type="text/javascript">
function checkLength(objname, maxlength) {
	  var objstr = objname.value; // �Էµ� ���ڿ��� ���� ���� 
	  var objstrlen = objstr.length; // ��ü����
	  // �����ʱ�ȭ 
	  var maxlen = maxlength; // ������ ���ڼ� �ִ�ũ�� 
	  var i = 0; // for���� ��� 
	  var bytesize = 0; // ����Ʈũ�� 
	  var strlen = 0; // �Էµ� ���ڿ��� ũ��
	  var onechar = ""; // char������ ����� �ʿ��� ���� 
	  var objstr2 = ""; // ���� ���ڼ������� ������ �������ڿ�
	  // �Էµ� ���ڿ��� �ѹ���Ʈ�� ���ϱ�
	  for (i = 0; i < objstrlen; i++) {
	   // �ѱ������� 
	   onechar = objstr.charAt(i);
	   if (escape(onechar).length > 4) {
	    bytesize += 2; // �ѱ��̸� 2�� ���Ѵ�. 
	   } else {
	    bytesize++; // �׹��� ���� 1�� ���Ѵ�.
	   }
	   if (bytesize <= maxlen) { // ��ü ũ�Ⱑ maxlen�� ���������� 
	    strlen = i + 1; // 1�� ����
	   }
	  }
	  // �ѹ���Ʈ���� ���� ���ڿ��� �ִ밪�� �ʰ��ϸ� 
	  if (bytesize > maxlen) {
	   alert("�Է� ������ �ִ빮�ڼ� "+maxlen+"��(����)�� �ʰ��߽��ϴ�. \n�ʰ��� ������ �ڵ����� ���� �˴ϴ�.");  // match�� �̿��ؼ� ����ε� name�� �ѱ۷� ��ȯ�ؼ� ����Ѵ�. 
	   objstr2 = objstr.substr(0, strlen);
	   objname.value = objstr2;
	  }
	  objname.focus();
	 }
</script>
</head>

<body>
<table width="800" border="0" cellpadding="0" cellspacing="0">
<form action="facility_update.action" method="post"	enctype="multipart/form-data">
<input type="hidden" name="mode" value="uploadOk">
<input type="hidden" name="sid" value="${dto.sid }">
<input type="hidden" name="saveFileName" value="${dto.saveFileName }">
	<tr>
		<td height="43"><img src="/img/sub3_cont5_title.gif" width="800" height="43"></td>
	</tr>
	<tr>
        <td height="14"></td>
    </tr>
	<tr>
		<td>
			<table border="0" cellpadding="0" cellspacing="0">
				<tr>
					<td><img src="/img/sub_bbs_title_on.gif" width="110" height="22"></td>
					<td width="1" background="/img/tab_line_blue.gif"></td>
					<td width="689" hight="22" background="/img/tab_line_blue.gif">&nbsp;</td>
				</tr>
			</table>
		</td>
	</tr>
	<tr>
		<td class="contborder_blue">
		<!--  //********** BEGIN_����_20120219 -->
		<!-- 
		<table>
				<tr>
					<td>
						<table width="760" border="2" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0" width="760" border="2" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0">
							<tr>
								<td height="28" width="100" align="center" bgcolor="e5eff8" class="sub_table_b">��&nbsp;&nbsp;��</td>
								<td width="660" colspan="3" bgcolor="eaeaea" class="table_bl_left"><input type="text" name="title" value="${dto.title }" size="92" maxlength="100"/></td>
							</tr>
							<tr>
								<td height="28" width="100" align="center" bgcolor="e5eff8" class="sub_table_b">��&nbsp;&nbsp;��</td>
								<td width="330" bgcolor="eaeaea" class="table_bl_left"><input type="file" name="upload"/></td>
								<td height="28" width="100" align="center" bgcolor="e5eff8" class="sub_table_b">÷������</td>
								<td width="330" bgcolor="eaeaea" class="table_bl_left" align="center" name="originalFileName">${dto.originalFileName}</td>
							</tr>
							<tr>
								<td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">��&nbsp;&nbsp;��</td>
								<td bgcolor="eaeaea" colspan="3" class="table_bl_left"><textarea name="content" cols="90" rows="12" onkeyup="checkLength(this,2000)">${dto.content }</textarea></td>
							</tr>
						</table>
						</td>
				</tr>
				<tr>
					<td height="5"></td>
				</tr>
				<tr>
  					<td align="right" colspan="2" class="sub_table_b">�Է� ������ �ִ빮�ڼ��� 1000��(�ѱ�)�Դϴ�.</td>
  				</tr>
  			</table>	
		-->
		<table>
				<tr>
					<td>
						<table width="760" border="2" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
							<tr>
								<td height="28" width="100" align="center" bgcolor="e5eff8" class="sub_table_b">��&nbsp;&nbsp;��</td>
								<td width="660" colspan="3" bgcolor="eaeaea" class="table_bl_left"><input type="text" name="title" value="${dto.title }" size="92" maxlength="100" class="input_form1"/></td>
							</tr>
							<tr>
								<td height="28" width="100" align="center" bgcolor="e5eff8" class="sub_table_b">��&nbsp;&nbsp;��</td>
								<td width="330" bgcolor="eaeaea" class="table_bl_left"><input type="file" name="upload" class="input_form1"/></td>
								<td height="28" width="100" align="center" bgcolor="e5eff8" class="sub_table_b">÷������</td>
								<td width="330" bgcolor="eaeaea" class="table_bl_left" align="center" name="originalFileName">${dto.originalFileName}</td>
							</tr>
							<tr>
								<td height="170" align="center" bgcolor="e5eff8" class="sub_table_b">��&nbsp;&nbsp;��</td>
								<td bgcolor="eaeaea" colspan="3" class="table_bl_left"><textarea name="content" cols="90" rows="12" onkeyup="checkLength(this,2000)" class="input_form1">${dto.content }</textarea></td>
							</tr>
						</table>
						</td>
				</tr>
				<tr>
					<td height="5"></td>
				</tr>
				<tr>
  					<td align="right" colspan="2" class="sub_table_b">�Է� ������ �ִ빮�ڼ��� 1000��(�ѱ�)�Դϴ�.</td>
  				</tr>
  			</table>	
		<!--   //********** END_����_20120219 -->		
			
  			<tr>
				<td height="5"></td>
			</tr>
			<tr>
				<td align="right">
					<input type="submit" value=" ���� ">
					<input type="button" value=" ���" onclick="location.href='facility_content.action?sid=${dto.sid }'">
				</td>
			</tr>
		</td>
	</tr>
</form>
</table>
</body>

</html>