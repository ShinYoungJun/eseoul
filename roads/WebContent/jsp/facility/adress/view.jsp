<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%String org_cd = (String)session.getAttribute("org_cd"); %>
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
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<link href="/css/roads.css" rel="stylesheet" type="text/css">
<script language="javascript" src="/js/PopupCalendar.js"></script>
<script language="javascript" src="/js/common.js"></script>
<script>
//�Խù� �˻�
function goSearch(){
	var gu, or, te, dam;
		gu = document.getElementById("gu").value;	//�˻��� ������
		or = document.getElementById("or").value;
		te = document.getElementById("te").value;	
		dam = document.getElementById("dam").value;	
		//********** BEGIN_����_20120323
		/*
		if(gu == ""||or == ""||te == ""||dam == ""){
			alert("�˻�� ���� �Է��� �ּ���.");
		}else{
		location.href="facility_adsearch.action?gu_nm="+gu+"&or_nm="+or+"&t_nm="+te+"&dam_nm="+dam;
		}
		*/
		//********** END_����_20120323
		location.href="facility_adsearch.action?gu_nm="+gu+"&or_nm="+or+"&t_nm="+te+"&dam_nm="+dam;
}
function chk_check(val){
	 var chk = chk_ck.chk;
	 var conf=   false;
	 var sid = 0;
	 if(val == "del"){
	 for(i=0;i<chk.length;i++){
	  if(chk[i].checked == true){
	   conf=true;
	   sid = chk[i].value;
	   location.href="facility_addelete.action?sid="+sid;
	  }  
	 }
	 if(conf == false){
	  alert("������ ����� ������ �ּ���.");
	 }
	 }else if(val == "mod"){
		 for(i=0;i<chk.length;i++){
			  if(chk[i].checked == true){
			   conf=true;
			   sid = chk[i].value;
			   location.href="facility_adupdate.action?sid="+sid;
			  }  
			 }
			 if(conf == false){
			  alert("������ ����� ������ �ּ���.");
			 }
			 }
}
//üũ�ڽ� 1���� ���� ����
function check_only(chk){
    var obj = document.getElementsByName("chk");
    for(var i=0; i<obj.length; i++){
        if(obj[i] != chk){
            obj[i].checked = false;
        }
    }
}
</script>
</head>
<body>
<table width="800" border="0" cellpadding="0" cellspacing="0">
<form name="chk_ck">
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
					<td><img src="/img/sub_bbs_title_off.gif" width="110" height="22" onclick="location.href='facility_list.action'" style="cursor:Pointer;"></td>
					<td width="1" background="/img/tab_line_blue.gif"></td>
					<td><img src="/img/sub_adress_title_on.gif" width="110" height="22"></td>
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
								<td width="100" height="28" style="text-align:-moz-center; text-align:center;" bgcolor="e5eff8" class="sub_table_b">�ñ�����</td>
								<td width="330" bgcolor="eaeaea" class="table_bl_left"><input type="text" style="width:130px" maxlength="20" id="gu" name="gu" value="" class="input_form1"/></td>
								<td width="100" style="text-align:-moz-center; text-align:center;" bgcolor="e5eff8" class="sub_table_b">��&nbsp;��&nbsp;��</td>
								<td width="330" bgcolor="eaeaea" class="table_bl_left"><input type="text" style="width:130px" maxlength="20" id="or" name="or" value="" class="input_form1"/></td>
							</tr>
							<tr>
								<td width="100" height="28" style="text-align:-moz-center; text-align:center;" bgcolor="e5eff8" class="sub_table_b">��&nbsp;&nbsp;&nbsp;��</td>
								<td width="330" bgcolor="eaeaea" class="table_bl_left"><input type="text" style="width:130px" maxlength="20" id="te" name="te" value="" class="input_form1"/></td>
								<td width="100" style="text-align:-moz-center; text-align:center;" bgcolor="e5eff8" class="sub_table_b">����ڸ�</td>
								<td width="330" bgcolor="eaeaea" class="table_bl_left"><input type="text" style="width:130px" maxlength="20" id="dam" name="dam" value="" class="input_form1"/></td>
							</tr>
						</table>
					</td>
				</tr>
				<tr>
                	<td height="1"></td>
          		</tr>
				<tr>
                	<td align="right">
                		<img src="/img/inquiry_icon2.gif" alt="��ȸ" width="56" height="18" border="0" onclick="javascript:goSearch()" style="cursor:Pointer;">
                	</td>
          		</tr>
				<tr>
                	<td height="1" bgcolor="#EAEAEA"></td>
          		</tr>
          		<tr>
                	<td height="20"></td>
          		</tr>
				<tr>
					<td>
						<div style="width:760px; overflow-x:scroll; scrollbar-face-color:#EEF8FB; scrollbar-3dlight-color:#BBBDB6; scrollbar-highlight-color:#EEF8FB; scrollbar-shadow-color:#BBBDB6; scrollbar-darkshadow-color:#EEF8FB; scrollbar-track-color:#EEF8FB; scrollbar-arrow-color:#BBBDB6">
						<table width="1330" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
			 				<tr>
								<td width="10" height="45" rowspan="2" style="text-align:-moz-center; text-align:center;" bgcolor="e5eff8" class="sub_table_b"><input type="checkbox" name="chk" style="display:none;"/></td>
								<td width="100" rowspan="2" style="text-align:-moz-center; text-align:center;" bgcolor="e5eff8" class="sub_table_b">�ñ�����</td>
								<td width="100" rowspan="2" style="text-align:-moz-center; text-align:center;" bgcolor="e5eff8" class="sub_table_b">��&nbsp;��&nbsp;��</td>
								<td width="100" rowspan="2" style="text-align:-moz-center; text-align:center;" bgcolor="e5eff8" class="sub_table_b">��&nbsp;&nbsp;&nbsp;��</td>
								<td colspan="3" style="text-align:-moz-center; text-align:center;" bgcolor="e5eff8" class="sub_table_b">��&nbsp;��&nbsp;��</td>
								<td colspan="2" style="text-align:-moz-center; text-align:center;" bgcolor="e5eff8" class="sub_table_b">��&nbsp;&nbsp;&nbsp;��</td>
								<td colspan="2" style="text-align:-moz-center; text-align:center;" bgcolor="e5eff8" class="sub_table_b">��&nbsp;&nbsp;&nbsp;��</td>
								<td width="120"rowspan="2" style="text-align:-moz-center; text-align:center;" bgcolor="e5eff8" class="sub_table_b">FAX</td>
								<td width="200"rowspan="2" style="text-align:-moz-center; text-align:center;" bgcolor="e5eff8" class="sub_table_b">��&nbsp;&nbsp;&nbsp;��</td>
							</tr>
							<tr>
								<td width="90" style="text-align:-moz-center; text-align:center;" bgcolor="e5eff8" class="sub_table_b">����</td>
								<td width="120" style="text-align:-moz-center; text-align:center;" bgcolor="e5eff8" class="sub_table_b">��ȭ</td>
		    					<td width="170" style="text-align:-moz-center; text-align:center;" bgcolor="e5eff8" class="sub_table_b">E-mail</td>
								<td width="90" style="text-align:-moz-center; text-align:center;" bgcolor="e5eff8" class="sub_table_b">����</td>
								<td width="120" style="text-align:-moz-center; text-align:center;" bgcolor="e5eff8" class="sub_table_b">��ȭ</td>
								<td width="90" style="text-align:-moz-center; text-align:center;" bgcolor="e5eff8" class="sub_table_b">����</td>
								<td width="120" style="text-align:-moz-center; text-align:center;" bgcolor="e5eff8" class="sub_table_b">��ȭ</td>
							</tr>
							<c:forEach items="${adlists }" var="dto">
								<tr>
									<td height="28" align="left" class="input_form1"><input type="checkbox" name="chk" value="${dto.sid}" onclick="check_only(this)"/></td>
									<td align="center" class="input_form1">${dto.gu_nm }</td>
									<td align="center" class="input_form1">${dto.or_nm }</td>
									<td align="center" class="input_form1">${dto.t_nm }</td>
									<td align="center" class="input_form1">${dto.dam_nm }</td>
									<td align="center" class="input_form1">${dto.dam_ph }</td>
									<td align="center" class="input_form1">${dto.dam_em }</td>
									<td align="center" class="input_form1">${dto.teem_nm }</td>
									<td align="center" class="input_form1">${dto.teem_ph }</td>
									<td align="center" class="input_form1">${dto.goa_nm }</td>
									<td align="center" class="input_form1">${dto.goa_ph }</td>
									<td align="center" class="input_form1">${dto.fax }</td>
									<td align="center" class="input_form1">${dto.memo }</td>
								</tr>
							</c:forEach>
						</table>
						</div>
						<table width="100%" border="0" cellpadding="0" cellspacing="1">
							<tr>
								<td height="5"></td>
							</tr>
							<tr>
								<td align="center" class="sub_table">
									<p>${pageIndexList}</p>
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
		<td>
			<img src="/img/del_icon5.gif" name="delete" alt="����" width="66" height="22" border="0" onclick="javascript:chk_check('del')" style="cursor:Pointer;" align="left">
			<img src="/img/mod_icon5.gif" name="modify" alt="����" width="66" height="22" border="0" onclick="javascript:chk_check('mod')" style="cursor:Pointer;" align="left">
			<img src="/img/list_icon.gif" alt="����Ʈ" width="66" height="22" border="0" onclick="location.href='facility_adlist.action'" style="cursor:Pointer;" align="right">
			<img src="/img/rojum_register.gif" alt="�űԵ��" width="88" height="22" border="0" onclick="location.href='facility_adupload.action'" style="cursor:Pointer;" align="right">
		</td>
	</tr>
</form>
</table>
</body>

</html>