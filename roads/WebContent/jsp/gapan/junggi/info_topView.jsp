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

<script type="text/javascript">
//<![CDATA[
           
	function	Search()
	{
		var form = document.form;

		form.action = "search.do";
		form.submit();
	}
	

	function iFrameResize(obj)
	{
		var iFrm = obj;
		var the_height = iFrm.contentWindow.document.body.scrollHeight;

		iFrm.style.height = the_height;
	}

	function Tab_Img_off()
	{
		var	img1	= document.getElementById("jumin_img");
		var	img2	= document.getElementById("jumji_img");
		var img3 	= document.getElementById("imposition_img");
		
		img1.src	= "/img/sub_petition_title2_off.gif";
		img2.src	= "/img/sub_petition_title3_off.gif";
		img3.src    = "/img/sub_periodi_title2_off.gif";
		
	}
	
	function Tab_Imposition(adminno)
	{
		var tab	= document.getElementById("CURRENT_TAB");
		if(tab.value	== "imposition"	||	tab.value	== "back")
			return;
		else
			tab.value	= "imposition";
				
		var tabs 	= document.getElementById("tab");
		var	img		= document.getElementById("imposition_img");
		
		Tab_Img_off();

		img.src		= "/img/sub_periodi_title2.gif";
//		tabs.src	= "/gapan/minwon/minwon_view.do?ADMIN_NO=" + adminno;		
		tabs.src	= "/jsp/gapan/junggi/info_product.jsp?ADMIN_NO=" + adminno;				

	}

	function Tab_Jumin(adminno)
	{
		var tab	= document.getElementById("CURRENT_TAB");
		if(tab.value	== "jumin"	||	tab.value	== "back")
			return;
		else
			tab.value	= "jumin";
				
		var tabs 	= document.getElementById("tab");
		var	img		= document.getElementById("jumin_img");
		
		Tab_Img_off();

		img.src		= "/img/sub_petition_title2_on_b.gif";
		tabs.src	= "/gapan/minwon/jumin_view.do?ADMIN_NO=" + adminno;
	}

	function Tab_Jumji(adminno)
	{
		var tab	= document.getElementById("CURRENT_TAB");
		if(tab.value	== "jumji"	||	tab.value	== "back")
			return;
		else
			tab.value	= "jumji";

		var tabs	= document.getElementById("tab");
		var	img		= document.getElementById("jumji_img");
		
		Tab_Img_off();

		img.src		= "/img/sub_petition_title3_on_b.gif";
		tabs.src	= "/gapan/jumyong/jumji_view.do?ADMIN_NO=" + adminno;
	}

	function Back(val)
	{
	//	alert("조회화면으로 이동됩니다.");
		
	//	var tab		= document.getElementById("CURRENT_TAB");
	//	tab.value	= "back";
		
		if(val == "8")
			Search();//window.location.replace('/gapan/minwon/search.do');
	}
	

//]]>
</script>
<%String no = request.getParameter("ADMIN_NO");%>
<%String year = request.getParameter("year");%>
<body onkeyup=Back(event.keyCode)>
<table width="800" border="0" cellpadding="0" cellspacing="0">
<form name="form" method="post">
<input type="hidden" name="ADMIN_NO" value=<%=no%>>
<input type="hidden" name="CURRENT_TAB" value="minwon">

  <tr>
    <td height="43"><img src="/img/sub1_cont2_title.gif" width="800" height="43"></td>
  </tr>
  
  <tr>
    <td align="center">
    <table width="780" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td height="40" align="right">
	<!--상단 기안문상신,도움말 메뉴-->
		<table border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td height="8" colspan="2"></td>
            </tr>
          <tr>
            <td><a href="#"><img src="/img/report_icon.gif" alt="기안문 상신11" width="92" height="18" border="0"></a></td>
            <td><a href="#"><img src="/img/help_icon.gif" alt="도움말" width="65" height="18" border="0"></a></td>
            </tr>
        </table>
	<!--상단 기안문상신,도움말 메뉴-->		
		</td>
      </tr>
      
      <tr>
        <td height="1" bgcolor="eaeaea"></td>
      </tr>
 
      <tr>
        <td height="14"></td>
      </tr>
      <tr>
	      <td align="right" class="sub_table_b">관리번호 : <%=no.substring(9,19)%></td>   
 	  </tr>
      <tr>
        <td align="left">
        <table width="780" border="0" cellspacing="0" cellpadding="0">
        
        <tr>
            <td height="22" background="/img/tab_line_purple.gif">
            <table border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td>
                  	<a href="javascript:Tab_Imposition('<%=no%>')">
                  		<img name="imposition_img" src="/img/sub_periodi_title2.gif" alt="부과 정보" width="110" height="22" border="0"></a></td>
                  <td width="111">
                  	<a href="javascript:Tab_Jumin('<%=no%>')">
                  		<img name="jumin_img" src="/img/sub_petition_title2_off.gif" alt="점용인 정보" width="110" height="22" border="0"></a><td>
                  <td>
                  	<a href="javascript:Tab_Jumji('<%=no%>')">
                  		<img name="jumji_img" src="/img/sub_petition_title3_off.gif" alt="점용지 정보" width="110" height="22" border="0"></a></td> 
                </tr>
            </table>
            </td>
		</tr>
		<td>
		  	<iframe width="100%" height="100%" name="tab" frameborder="0" onload="iFrameResize(this)" scrolling="no" 	src="/gapan/junggi/junggi_product.do?ADMIN_NO=<%=no%>&year=<%=year%>"></iframe>
		</td>		
		</table>																											
		</td>
	</tr>
	
	</table>
  </td>
 </tr>
	
</table>

</body>
</html>

<div id='popCal' style='POSITION:absolute;visibility:hidden;border:2px ridge;width:10'>
       <iframe name="popFrame" src="/js/calendar.html" frameborder="0" scrolling="no" width=183 height=188></iframe>
</div>
