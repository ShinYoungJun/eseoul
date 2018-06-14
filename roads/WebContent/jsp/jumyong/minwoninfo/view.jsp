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
<script language="javascript" src="/js/Ajax_request.js"></script>

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

		iFrm.style.height = the_height + "px";
	}

	function 	Tab_Img(Tab_Value)
	{
		var	img1	= document.getElementById("minwon_img");
		var	img2	= document.getElementById("jumin_img");
		var	img3	= document.getElementById("jumji_img");
	
		img1.src	= "/img/sub_petition_title9_off.gif";
		img2.src	= "/img/sub_petition_title2_off.gif";
		img3.src	= "/img/sub_petition_title3_off.gif";
		
		if(Tab_Value	== "minwon")
		{
			img1.src		= "/img/sub_petition_title9_on.gif";
		}
		else if(Tab_Value	== "jumin")
		{
			img2.src		= "/img/sub_petition_title2_on.gif";
		}
		else if(Tab_Value	== "jumji")
		{
			img3.src		= "/img/sub_petition_title3_on.gif";
		}		

		var tab	= document.getElementById("CURRENT_TABUP");
		tab.value	= Tab_Value;
	}
	
	
	function Tab_Minwon(adminno)
	{
		var tab	= document.getElementById("CURRENT_TABUP");
		if(tab.value	== "minwon")
			return;
		else
			tab.value	= "minwon";

		var	seq	= document.getElementById("SEQ").value;
	//	var	seq		= document.getElementById("TAX_NO").value;

		var tabs 	= document.getElementById("tabUp");
		tabs.src	= "/jumyong/minwoninfo/minwon_view.do?ADMIN_NO=" + adminno + "&SEQ=" + seq;// + "&SEQ=" + seq;
	}

	function Tab_Jumin(adminno)
	{
		var tab	= document.getElementById("CURRENT_TABUP");
		if(tab.value	== "jumin")
			return;
		else
			tab.value	= "jumin";
		
		var tabs 	= document.getElementById("tabUp");
		tabs.src	= "/jumyong/minwoninfo/jumin_view.do?ADMIN_NO=" + adminno;
	}

	function Tab_Jumji(adminno)
	{
		var tab	= document.getElementById("CURRENT_TABUP");
		if(tab.value	== "jumji")
			return;
		else
			tab.value	= "jumji";

		var tabs	= document.getElementById("tabUp");
		tabs.src	= "/jumyong/minwoninfo/jumji_view.do?ADMIN_NO=" + adminno;
	}

	
//]]>
</script>

<body>
<table width="800" border="0" cellpadding="0" cellspacing="0">
<form name="form" method="post">
<input type="hidden" name="ADMIN_NO" value="${ADMIN_NO}">
<input type="hidden" name="SEQ" value="${SEQ}">

<input type="hidden" name="CURRENT_TABUP" value="minwon">

  <tr>
    <td height="43"><img src="/img/sub1_cont3_title.gif" width="800" height="43"></td>
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
           
      <td align="right" class="sub_table_b">관리번호 : <script>var adminno = nr_Adminno_Cut("${ADMIN_NO}"); document.write(adminno);</script></td>
      
      <tr>
        <td align="left">
        <table width="780" border="0" cellspacing="0" cellpadding="0">
        
        <tr>
            <td height="22" background="/img/tab_line_purple.gif">
            <table border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td width="111"><a href="javascript:Tab_Minwon('${ADMIN_NO}')"><img name="minwon_img" src="/img/sub_petition_title9_on.gif" alt="민원 정보" width="110" height="22" border="0"></a></td>
                  <td width="111"><a href="javascript:Tab_Jumin('${ADMIN_NO}')"><img name="jumin_img" src="/img/sub_petition_title2_off.gif" alt="점용인 정보" width="110" height="22" border="0"></a></td>
                  <td><a href="javascript:Tab_Jumji('${ADMIN_NO}')"><img name="jumji_img" src="/img/sub_petition_title3_off.gif" alt="점용지 정보" width="110" height="22" border="0"></a></td>
                </tr>
            </table>
            </td>
		</tr>
		
		<td>
		  	<iframe width="100%" height="100%" name="tabUp" frameborder="0" onload="iFrameResize(this)" scrolling="no" src="/jumyong/minwoninfo/minwon_view.do?ADMIN_NO=${ADMIN_NO}"></iframe>
		</td>
		
      <tr>
        <td height="30"></td>
      </tr>

		
		</table>
		</td>
	</tr>
	
	</table>
  </td>
 </tr>
	
</table>

</body>
</html>