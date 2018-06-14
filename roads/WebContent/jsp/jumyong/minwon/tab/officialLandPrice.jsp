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
	
	

function MM_preloadImages() { //v3.0
  var d=document; if(d.images){ if(!d.MM_p) d.MM_p=new Array();
    var i,j=d.MM_p.length,a=MM_preloadImages.arguments; for(i=0; i<a.length; i++)
    if (a[i].indexOf("#")!=0){ d.MM_p[j]=new Image; d.MM_p[j++].src=a[i];}}
}


function close2()
{
	var giga = document.getElementById("giga").value;
	opener.document.getElementById("price").value=giga;
	self.close();
}
	
	
</script>
<link href="/css/pop.css" rel="stylesheet" type="text/css">

</head>

<body>
	<table width="100%" height="100%" border="0" cellpadding="0" cellspacing="0">
	  <tr>
	    <td height="12"><img src="/img/box_top_left.gif" width="12" height="12"></td>
	    <td background="/img/box_top_mid.gif"></td>
	    <td><img src="/img/box_top_right.gif" width="12" height="12"></td>
	  </tr>
	  <tr>
	    <td width="12" background="/img/box_left.gif"></td>
	    <td align="center" valign="top"><table width="100%" border="0" cellspacing="0" cellpadding="0">
	      <tr>
	        <td><table width="100%" border="0" cellpadding="0" cellspacing="0" class="admin_w">
	          <tr>
	            <td width="40"><img src="/img/admin_pop_left.gif" width="40" height="40"></td>
	            <td background="/img/admin_pop_cen.gif" class="admin_w_b" style="padding-top:3">공시지가</td>
	            <td width="33"><img src="/img/close.gif" alt="닫기" width="33" height="40" border="0" onClick="self.close();" style="cursor:pointer" ></td>
	          </tr>
	          <tr>
	            <td height="5" colspan="3"></td>
	            </tr>
	        </table></td>
	      </tr>
	      <tr>
	        <td><table width="100%" border="2" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
	          <tr>
	            <td width="12%" height="30" align="center" bgcolor="#D6E6F3" class="sub_table_b">주소</td>
	            <td height="28" colspan="3" bgcolor="#F6F6F6" class="table_bl_left"><span class="sub_stan_blue">
				${SI_NM}&nbsp ${GU_NM}&nbsp ${BJ_NM}&nbsp ${BUNJI}
	            </span></td>
	            </tr>
	          <tr>
	            <td height="30" align="center" bgcolor="e5eff8" class="sub_table_b">년도</td>
	            <td height="28" bgcolor="#F6F6F6" class="table_bl_left"><span class="sub_stan_blue">${YEAR} </span>년</td>
	            <td align="center" bgcolor="e5eff8" class="sub_table_b">공시지가</td>
	            <td bgcolor="#F6F6F6" class="table_bl_left"><span class="sub_stan_blue">
	            
					<input name="giga" id="giga" type="text" value = "${giga}" style="width:50px;ime-mode:disabled;"  class="input_form1" >
	            
	            
	            </span> 원&nbsp&nbsp 
	            <span class="sub_stan_blue" style="cursor:pointer" onclick="javascript:close2();">적용</span> </td>
	          </tr>
	
	        </table>
	          </td>
	      </tr>
	    </table></td>
	    <td width="12" background="/img/box_right.gif"></td>
	  </tr>
	  <tr>
	    <td height="12"><img src="/img/box_bottom_left.gif" width="12" height="12"></td>
	    <td background="/img/box_bottom_mid.gif"></td>
	    <td><img src="/img/box_bottom_right.gif" width="12" height="12"></td>
	  </tr>
	</table>
</body>
</html>

