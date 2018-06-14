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
<table width="800" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td height="43"><img src="/img/sub1_cont4_title.gif" width="800" height="43"></td>
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
		<!--  //********** BEGIN_현진_20120219 -->
		<!-- 
			<table>
						<tr>
							<td>
								<table width="760" border="2" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0" width="760" border="2" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0">
		  							<tr>
		    							<td height="28" width="100" align="center" bgcolor="e5eff8" class="sub_table_b">제&nbsp;&nbsp;목</td>
		    							<td width="660" bgcolor="eaeaea" class="table_bl_left" colspan="3">&nbsp;&nbsp;${dto.title}</td>
		  							</tr>
		  							<tr>
		    							<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">작성자</td>
		    							<td width="330" align="center" bgcolor="eaeaea" class="table_bl_left">${dto.name }</td>
		    							<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">첨부파일</td>
		    							<td width="330" align="center" bgcolor="eaeaea" class="table_bl_left"><a href="jumyong_download.action?saveFileName=${dto.saveFileName}&originalFileName=${dto.originalFileName}">${dto.originalFileName}</a></td>
		  							</tr>
		  							<tr>
		    							<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">등록일</td>
		    							<td width="330" align="center" bgcolor="eaeaea" class="table_bl_left">${dto.created }</td>
		    							<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">조회수</td>
		    							<td width="330" align="center" bgcolor="eaeaea" class="table_bl_left">${dto.hitcount }</td>
		  							</tr>
		  							<tr>
		    							<td colspan="4" width="760" height="100" bgcolor="eaeaea" class="table_bl_left">${dto.content }</td>
		  							</tr>
								</table>
							</td>
						</tr>
					</table>
		-->
		<!--   //********** END_현진_20120219 -->		
			<table>
				<tr>
					<td>
						<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
  							<tr>
    							<td height="28" width="100" align="center" bgcolor="e5eff8" class="sub_table_b">제&nbsp;&nbsp;목</td>
    							<td width="660" colspan="3">&nbsp;&nbsp;${dto.title}</td>
  							</tr>
  							<tr>
    							<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">작성자</td>
    							<td width="330" align="center">${dto.name}</td>
    							<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">첨부파일</td>		    					
		    					<td width="330" align="center" ><a href="javascript:location.href('jumyong_download.action?saveFileName=${dto.saveFileName}&originalFileName=${dto.originalFileName}')"  class="sub_table">${dto.originalFileName}</a></td>
		    					
  							</tr>
  							<tr>
    							<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">등록일</td>
    							<td width="330" align="center" >${dto.created }</td>
    							<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">조회수</td>
    							<td width="330" align="center">${dto.hitcount }</td>
  							</tr>
  							<tr>
    							<!--  //********** BEGIN_현진_20120229 -->								
    							<td colspan="4" width="760" height="100" style="padding:10px" valign="top">
	    							  <textarea style="border:0px; width:100%; overflow-x:hidden; overflow-y:auto; background-color:transparent; height:250px"  class="input_form1" onFocus="this.blur()">${dto.content}</textarea>
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
			<img src="/img/del_icon5.gif" id="delete" name="delete" alt="삭제" width="66" height="22" border="0" onclick="location.href='jumyong_delete.action?sid=${dto.sid}&saveFileName=${dto.saveFileName}'" style="cursor:Pointer;" align="left">
			<img src="/img/list_icon.gif" alt="리스트" width="66" height="22" border="0" onclick="location.href='jumyong_list.action'" style="cursor:Pointer;" align="right">
			<img src="/img/mod_icon5.gif" id="modify" name="modify" alt="수정" width="66" height="22" border="0" onclick="location.href='jumyong_update.action?sid=${dto.sid}'" style="cursor:Pointer;" align="right">
		</td>
   	</tr>
   
</table>
</body>

</html>