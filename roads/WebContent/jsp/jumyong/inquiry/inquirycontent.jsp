<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%String org_cd = (String)session.getAttribute("org_cd"); %>
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
<script language="javascript" src="/js/jquery-1.6.1.js"></script> 
<script type="text/javascript">
window.onload = function(){
	var i = <%=org_cd%>;
	if(i != 0000000){
		document.getElementById("delete").style.display='none';
		document.getElementById("modify").style.display='none';
	}
}
</script>
</head>

<body>
<table width="800px" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td height="43"><img src="/img/sub1_cont5_title.gif" width="800" height="43"></td>
	</tr>
	<tr>
        <td height="14"></td>
    </tr>
	<tr>
		<td>
			<table border="0" cellpadding="0" cellspacing="0">
				<tr>
					<td><img src="/img/sub_inquiry_title_on.gif" width="110" height="22"></td>
					<td width="1" background="/img/tab_line_blue.gif"></td>
					<td width="689" height="22" background="/img/tab_line_blue.gif">&nbsp;</td>
				</tr>
			</table>
		</td>
	</tr>
	<tr>
		<td class="contborder_blue">		
			<table>
				<tr>
					<td>
						<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
  							<tr>
    							<td height="28px" width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">제&nbsp;&nbsp;목</td>
    							<td width="660px" colspan="3">&nbsp;&nbsp;${dto.title}</td>
  							</tr>
  							<tr>
  								<td width="100px" height="28px" align="center" bgcolor="e5eff8" class="sub_table_b">수신처</td>
    							<td width="330px" align="center">${dto.reception}</td>
    							<td width="100px" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">기안일</td>
    							<td width="300px" align="center">${dto.term}</td>
    						</tr>
    						<tr>
    							<td width="15%" height="28px" align="center" bgcolor="e5eff8" class="sub_table_b">작성자</td>
    							<td width="35%" align="center">${dto.name}</td>
    							<td width="15%" align="center" bgcolor="e5eff8" class="sub_table_b">첨부파일</td>		    					
		    					<td width="380px" align="center">
		    						<a id="files1" href="javascript:location.href('jumyong_download_inquiry.action?saveFileName=${dto.saveFileName1}&originalFileName=${dto.originalFileName1}')" class="sub_table"></a>
		    						<a id="files2" href="javascript:location.href('jumyong_download_inquiry.action?saveFileName=${dto.saveFileName2}&originalFileName=${dto.originalFileName2}')" class="sub_table"></a>
		    						<a id="files3" href="javascript:location.href('jumyong_download_inquiry.action?saveFileName=${dto.saveFileName3}&originalFileName=${dto.originalFileName3}')" class="sub_table"></a>
		    					</td>
  							</tr>
  							<tr>
    							<td width="100px" height="28px" align="center" bgcolor="e5eff8" class="sub_table_b">등록일</td>
    							<td width="330px" align="center" >${dto.created }</td>
    							<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">조회수</td>
    							<td width="300px" align="center">${dto.hitcount }</td>
  							</tr>
  							<tr>
    							<!--  //********** BEGIN_현진_20120229 -->								
    							<td colspan="4" width="760px" height="100px" style="padding:10px" valign="top">
	    							  <textarea style="border:0px; width:100%; overflow-x:hidden; overflow-y:auto; background-color:transparent; height:440px"  class="input_form1" onFocus="this.blur()">${dto.content}</textarea>
    							</td>
    							<!--   //********** END_현진_20120229 -->
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
			<img src="/img/del_icon5.gif" id="delete" name="delete" alt="삭제" width="66" height="22" border="0" onclick="deleteContent();" style="cursor:Pointer;" align="left">
			<img src="/img/list_icon.gif" alt="리스트" width="66" height="22" border="0" onclick="location.href='/bbs/jumyong_term_inquiry.action?from=${dto.term}&isTerm=${isTerm}'" style="cursor:Pointer;" align="right">
			<img src="/img/mod_icon5.gif" id="modify" name="modify" alt="수정" width="66" height="22" border="0" onclick="location.href='jumyong_update_inquiry.action?sid=${dto.sid}'" style="cursor:Pointer;" align="right">
		</td>
   	</tr>
   
</table>
</body>

<script type="text/javascript">
	var isTerm = "${isTerm}";
	var originalFileName1 = "${dto.originalFileName1}";
	var originalFileName2 = "${dto.originalFileName2}";
	var originalFileName3 = "${dto.originalFileName3}";

	var originalFileName = ["${dto.originalFileName1}", "${dto.originalFileName2}", "${dto.originalFileName3}"];

	if(originalFileName[0] != "") {
		$("#files1").html(originalFileName[0] + "<br>");
	}

	if(originalFileName[1] != "") {
		$("#files2").html(originalFileName[1] + "<br>");
	}

	if(originalFileName[2] != "") {
		$("#files3").html(originalFileName[2]);
	}

	function deleteContent() {
		if (confirm("게시물을 삭제하시겠습니까?")){
			location.href='jumyong_delete_inquiry.action?sid=${dto.sid}&saveFileName=${dto.saveFileName}'
		}
	}
</script>

</html>