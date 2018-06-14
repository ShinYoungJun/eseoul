<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/loginCheck.jsp" %>
<%@ include file="/jsp/common/include.jsp" %>
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
</head>

<script language="javascript" src="/js/Check_inputbox.js"></script>


<script type="text/javascript">
//<![CDATA[

	
	function	Search()
	{	
		var form = document.form;

		form.action = "search.do";
		form.submit();
	}
	
	function 	Init()
	{

		if(3 <= '${status_code}' && '${status_code}' <= 8 ){
			document.getElementById("sugeo_bottom").src = "/rojum/sugeo/sugeo_fine_view.do?mul_no=${mul_no}";
		}else if(9 <= '${status_code}' && '${status_code}' <= 13 ){
			document.getElementById("sugeo_bottom").src = "/rojum/sugeo/sugeo_sale_view.do?mul_no=${mul_no}";
		}else{
			
		}

		
	}

	function iFrameResize(obj)
	{
		var iFrm = obj;
		var the_height = iFrm.contentWindow.document.body.scrollHeight;

		iFrm.style.height = the_height;
	}

	function iFrameResizeTab(obj)
	{
		var iFrm = document.getElementById(obj);
		var the_height = iFrm.contentWindow.document.body.scrollHeight;

		iFrm.style.height = the_height;
	}
	
	function InitPage()
	{
		var obj = document.form.message.value;
		
		if(obj != "")	
			alert(obj);
			return;
	}

	function refreshCenter(){

		document.getElementById("sugeo_center").src = document.getElementById("sugeo_center").src;

		
	}
	

//]]>
</script>

<body onload="Init();">
	
<form name="form" method="post">
<input type="hidden" name="mul_no" value="${mul_no }">
<!-- 리스트 검색파라미터 start -->
<input type="hidden" name="rem_date_from" value="${param.rem_date_from }">
<input type="hidden" name="rem_date_to" value="${param.rem_date_to }">
<input type="hidden" name="rem_mulcd" value="${param.rem_mulcd }">
<input type="hidden" name="rem_mulnm" value="${param.rem_mulnm }">
<input type="hidden" name="rem_bjcd" value="${param.rem_bjcd }">
<input type="hidden" name="rem_hjcd" value="${param.rem_hjcd }">
<input type="hidden" name="rem_addr" value="${param.rem_addr }">
<input type="hidden" name="rem_nm" value="${param.rem_nm }">
<input type="hidden" name="goods_status" value="${param.goods_status }">
<input type="hidden" name="message" value="${message }">
<!-- 리스트 검색파라미터 end -->

<table width="800" border="0" cellpadding="0" cellspacing="0">
	<tr>
    	<td height="43"><img src="/img/sugeo_title.gif" width="800" height="43"></td>
  	</tr>
  	<tr>
		<td align="center">
	    	<table width="780" border="0" cellspacing="0" cellpadding="0">
				<tr>
		        	<td height="40" align="right">
					</td>
				</tr>
		       
				
				<tr>
					<td align="right" class="sub_table_b">관리번호 : ${mul_no}</td>
				</tr>
				
				<tr>
					<td align="left">
			          	<tr>
			  				<td>
			  				<iframe width="100%" height="100%" name="sugeo_top" frameborder="0" onload="iFrameResize(this);refreshCenter();" scrolling="no" src="/rojum/sugeo/sugeo_view.do?mul_no=${mul_no}"></iframe>
			  				</td>
			          	</tr>
					</td>
				</tr>
				<tr>
					<td align="left">
			          	<tr>
			  				<td>
			  				<iframe width="100%" height="100%" name="sugeo_center" frameborder="0" onload="iFrameResize(this)" scrolling="no" src="/rojum/sugeo/sugeo_status.do?mul_no=${mul_no}"></iframe>
			  				</td>
			          	</tr>
					</td>
				</tr>
				
				<tr>
					<td height="10"></td>
				</tr>
				
				<tr>
					<td align="left">
			          	<tr>
			  				<td>
			  					<iframe width="100%" height="100%" name="sugeo_bottom" frameborder="0" onload="iFrameResize(this);refreshCenter();" scrolling="no" src=""></iframe>
			  				</td>
			          	</tr>
					</td>
				</tr>
			 
				<tr>
					<td height="40" align="right">
						<img src="/img/list_icon.gif" alt="리스트" border="0" onClick="Search()" style="CURSOR:hand">
					</td>
				</tr>
				
				<tr>
					<td height="30"></td>
				</tr>
				
			</table>
		</td>
	</tr>
	
</table>

</body>
<script type="text/javascript">
//<![CDATA[


</script>
</html>