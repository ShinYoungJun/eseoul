<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
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
<script type="text/javascript">

	function Page(page)
	{
		if(page	==	"")
			return;
		
		var form = document.form;
		//var	LISTVIEW	= document.getElementById("LISTVIEW");
		//LISTVIEW.value	= "1";

		form.currentPage.value	= page;

		form.action = "/gapan/sugeo/goods_search.do";
		form.submit();
	}
	
	// ������ ����
	function goodsView(goods_seq){
	alert("goods_seq== "  +goods_seq);
		var form = document.form;
		top.frames[1].location="/jsp/menu/left/gapan.jsp?MENU_PARAM=sugeo";	//���� �޴� ��ũ
		//top.frames[2].location="/gapan/sugeo/search_view.do?mul_no=680103_5_0001";		//������ ������ ��ũ
		form.action = "goods_view.do?goods_seq="+goods_seq;
		form.submit();
	
	}
</script>
</head>

<body>
<form name="form" method="post">
<input type="hidden" name="currentPage" value="${currentPage}">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
	<tr>
    	<td>
			<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
				<tr>
					<td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">��ȣ</td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">��ǰ��</td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">����</td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">�����Ⱓ</td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">�������</td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">�����Ȳ</td>
				</tr>
			                   
			<c:choose>
			<c:when test='${blist != null && !empty blist}'>
				<c:forEach items="${blist}" var="board" varStatus="idx">
				<tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" style="cursor:pointer"
					onclick="goodsView('${board.goods_seq }')">
					<td height="26" align="center">${board.RN}</td>
					<td align="center">${board.goods_nm}</td>
					<td align="center">${board.goods_cnt}</td>
					<td align="center">${board.goods_svfrom} <c:if test="${ board.goods_svto != null }"> ~ ${board.goods_svto }</c:if></td>
					<td align="center">${board.goods_svnm}</td>
					<td align="center">
						<c:if test="${ board.goods_status != null }">
							<select disabled>${board.goods_status}</select>
						</c:if>
					</td>
				</tr>
				</c:forEach>
			</c:when>
			<c:otherwise>
				<tr>
					<td align="center" class="sub_table" colspan="6" height="75"> ������ �����ϴ�</td>
				</tr>
				<tr>
			</c:otherwise>
			</c:choose>
			</table>
		</td>
	</tr>
	<tr>
    	<td height="30" align="center">
    		<table border="0" cellspacing="0" cellpadding="0">
            	<tr>
					${strPageDivideForm}
                </tr>
            </table>
		</td>
	</tr>
</table>
							
</body>
</form>
</html>