<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%String org_cd = (String)session.getAttribute("org_cd"); %>
<%String user_id = (String)session.getAttribute("sessionUserId"); %>
<html>
<head>
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
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<script language="javascript" src="/js/PopupCalendar.js"></script>
<script language="javascript" src="/js/common.js"></script>
<script>
//���Ѱ˻�
window.onload = function(){
	var i = <%=org_cd%>;
	if(i != 0000000){
		document.getElementById("register").style.display='none';
	}
}

//�Խù� �˻�
function goSearch(){
	var tx, se;
		se = document.getElementById("searchTG").value;	//�˻��� Ÿ�� ����
		tx = document.getElementById("boardSearchText").value;	//�˻��� ������
		location.href="rojum_search.action?"+se+"="+tx;
}
</script>
</head>
<body>
<table width="800" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td height="43"><img src="/img/sub7_cont5_title.gif" width="800" height="43"></td>
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
					<td><img src="/img/sub_adress_title_off.gif" width="110" height="22" onclick="location.href='rojum_adlist.action'" style="cursor:Pointer;"></td>
					<td width="579" hight="22" background="/img/tab_line_blue.gif">&nbsp;</td>
				</tr>
			</table>
		</td>
	</tr>
	<tr>
		<td class="contborder_blue">
			<table>
				<tr>
					<td>
						<table width="760" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0" class="sub_table">
							<tr>
								<td width="5%" height="28" style="text-align:-moz-center; text-align:center;" bgcolor="e5eff8" class="sub_table_b">��ȣ</td>
								<td width="66%" style="text-align:-moz-center; text-align:center;" bgcolor="e5eff8" class="sub_table_b">����</td>
								<td width="10%" style="text-align:-moz-center; text-align:center;" bgcolor="e5eff8" class="sub_table_b">�ۼ���</td>
								<td width="12%" style="text-align:-moz-center; text-align:center;" bgcolor="e5eff8" class="sub_table_b">�ۼ���</td>
								<td width="7%" style="text-align:-moz-center; text-align:center;" bgcolor="e5eff8" class="sub_table_b">��ȸ��</td>
							</tr>
							<c:forEach var="dto" items="${noticelists}">
							<!--  //********** BEGIN_����_20120219 -->
							<!-- 
								<tr>
									<td height="25" align="center" bgcolor="eaeaea" class="input_form1">����</td>
									<td align="center" bgcolor="eaeaea" class="input_form1"><a href="rojum_content.action?sid=${dto.sid }" id="title" name="title">${dto.title }</a></td>
									<td align="center" bgcolor="eaeaea" class="input_form1">${dto.name }</td>
									<td align="center" bgcolor="eaeaea" class="input_form1">${dto.created }</td>
									<td align="center" bgcolor="eaeaea" class="input_form1">${dto.hitcount }</td>
								</tr>							
							-->
								<tr  bgcolor="#eaeaea" onMouseOver="this.style.backgroundColor='#'" onMouseOut="this.style.backgroundColor='#eaeaea'" onclick="javascript:location.href('rojum_content.action?sid=${dto.sid }');" style="cursor: pointer">
									<td height="25" align="center">����</td>
									<td align="center">${dto.title }</td>
									<td align="center">${dto.name }</td>
									<td align="center">${dto.created }</td>
									<td align="center">${dto.hitcount }</td>
								</tr>							
							<!--   //********** END_����_20120219 -->							

							</c:forEach>
							<c:forEach var="dto" items="${lists}">
							<!--  //********** BEGIN_����_20120219 -->
							<!-- 
								<tr>
									<td height="25" align="center" class="input_form1">${dto.div_sid}</td>
									<td align="center" class="input_form1"><a href="rojum_content.action?sid=${dto.sid }" id="title" name="title">${dto.title }</a></td>
									<td align="center" class="input_form1">${dto.name }</td>
									<td align="center" class="input_form1">${dto.created }</td>
									<td align="center" class="input_form1">${dto.hitcount }</td>
								</tr>							
							-->
								<tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" onclick="javascript:location.href('rojum_content.action?sid=${dto.sid }');" style="cursor: pointer">
									<td height="25" align="center">${dto.div_sid}</td>									
									<td align="center" >${dto.title }</a></td>
									<td align="center" >${dto.name }</td>
									<td align="center" >${dto.created }</td>
									<td align="center" >${dto.hitcount }</td>
								</tr>							
							<!--   //********** END_����_20120219 -->							

							</c:forEach>
						</table>
						<table width="100%" border="0" cellpadding="0" cellspacing="1">
							<tr>
								<td height="5"></td>
							</tr>
							<tr>
								<td align="center" class="sub_table">
									<p>
									${pageIndexList}
									</p>
								</td>
							</tr>
						</table>
						<table width="100%" border="0" cellpadding="0" cellspacing="0">
							<tr>
								<td align="right">
									<select name="searchTG" id="searchTG">
									<option value="title" selected>����</option>
									<option value="name">�ۼ���</option>
								</select>
								</td>
								<td align="center" height="25" width="35">
								<input id="boardSearchText" type="text" name="boardSearchText" size="30" maxlength="30"/>
								</td>
								<td align="left" style="padding:5px 0px;">
								<img src="/img/search_icon.gif" alt="�˻�" width="56" height="18" border="0" onclick="javascript:goSearch()" style="cursor:Pointer;">
								</td>
							</tr>
						</table>
					</td>
				</tr>
			</table>
		</td>
	</tr>
	<tr>
		<td height="5"></td>
	</tr>
	<tr>
		<td align="right"><img src="/img/bbs_register.gif" id="register" name="register" alt="�۾���" width="66" height="22" border="0" onclick="location.href='rojum_upload_list.action?user_id=<%=user_id%>'" style="cursor:Pointer;"><img src="/img/list_icon.gif" alt="����Ʈ" width="66" height="22" border="0" onclick="location.href='rojum_list.action'" style="cursor:Pointer;"></td>
	</tr>
</table>
</body>

</html>