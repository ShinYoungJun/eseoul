<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
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

	function 	TabUp_Img(Tab_Value)
	{
		var	img1	= document.getElementById("jumin_img");
		var	img2	= document.getElementById("jumji_img");
	//	var	img3	= document.getElementById("mulgun_img");
		
		img1.src	= "/img/sub_petition_title2_off.gif";
		img2.src	= "/img/sub_petition_title3_off.gif";
	//	img3.src	= "/img/sub_petition_title15_off.gif";
		
		if(Tab_Value	== "jumin")
		{
			img1.src		= "/img/sub_petition_title2_on.gif";
		}
		else if(Tab_Value	== "jumji")
		{
			img2.src		= "/img/sub_petition_title3_on.gif";
		}
	//	else if(Tab_Value	== "mulgun")
	//	{
	//		img3.src		= "/img/sub_petition_title15_on.gif";
	//	}

		var tab	= document.getElementById("CURRENT_TABUP");
		tab.value	= Tab_Value;
	}
	
	function 	TabDown_Img(Tab_Value)
	{
		var	img1	= document.getElementById("sanchul_img");
		var	img2	= document.getElementById("bugwa_img");
		var	img3	= document.getElementById("sunap_img");

		img1.src	= "/img/sub_petition_title11_off.gif";
		img2.src	= "/img/sub_petition_title12_off.gif";
		img3.src	= "/img/sub_petition_title14_off.gif";

		if(Tab_Value	== "sanchul")
		{
			img1.src		= "/img/sub_petition_title11_on.gif";
		}	
		else if(Tab_Value	== "bugwa")
		{
			img2.src		= "/img/sub_petition_title12_on.gif";
		}
		else if(Tab_Value	== "sunap")
		{
			img3.src		= "/img/sub_petition_title14_on.gif";
		}

		var tab	= document.getElementById("CURRENT_TABDOWN");
		tab.value	= Tab_Value;
	}

	function Tab_Jumin(adminno)
	{
		var tab	= document.getElementById("CURRENT_TABUP");
		if(tab.value	== "jumin")
			return;
		else
			tab.value	= "jumin";
		
		var tabs 	= document.getElementById("tabUp");
		tabs.src	= "/sisul/sisul/jumin_view.do?ADMIN_NO=" + adminno;
	}

	function Tab_Jumji(adminno)
	{
		var tab	= document.getElementById("CURRENT_TABUP");
		if(tab.value	== "jumji")
			return;
		else
			tab.value	= "jumji";

		var tabs	= document.getElementById("tabUp");
		tabs.src	= "/sisul/sisul/jumji_view.do?ADMIN_NO=" + adminno;
	}

	function Tab_Sanchul(adminno)
	{
		var tab	= document.getElementById("CURRENT_TABUP");
		if(tab.value	== "sanchul")
			return;
		else
			tab.value	= "sanchul";

		var tabs 	= document.getElementById("tabUp");
		tabs.src	= "/sisul/sisul/sanchul_view.do?ADMIN_NO=" + adminno;
	}

	function Tab_Mulgun(adminno)
	{
		var tab	= document.getElementById("CURRENT_TABUP");
		if(tab.value	== "mulgun")
			return;
		else
			tab.value	= "mulgun";
		
		var tabs	= document.getElementById("tabUp");
		tabs.src	= "/sisul/sisul/mulgun_view.do?ADMIN_NO=" + adminno;
	}

	function Tab_Sanchul(adminno)
	{
		var tab	= document.getElementById("CURRENT_TABDOWN");
		if(tab.value	== "sanchul")
			return;
		else
			tab.value	= "sanchul";
				
		var tabs 	= document.getElementById("tabDown");
		tabs.src	= "/sisul/sisul/sanchul_view.do?ADMIN_NO=" + adminno;
	}

	function Tab_Bugwa(adminno)
	{
		var tab	= document.getElementById("CURRENT_TABDOWN");
		if(tab.value	== "bugwa")
			return;
		else
			tab.value	= "bugwa";
		
		var tabs	= document.getElementById("tabDown");
		tabs.src	= "/sisul/sisul/bugwa_view.do?ADMIN_NO=" + adminno;
	}

	function Tab_Sunap(adminno)
	{
		var tab	= document.getElementById("CURRENT_TABDOWN");
		if(tab.value	== "sunap")
			return;
		else
			tab.value	= "sunap";
		
		var tabs	= document.getElementById("tabDown");
		tabs.src	= "/jumyong/saewe/sunap_view.do?ADMIN_NO=" + adminno;
	}

//]]>
</script>

<body onkeyup=Back(event.keyCode)>
<table width="800" border="0" cellpadding="0" cellspacing="0">
<form name="form" method="post">
<input type="hidden" name="ADMIN_NO" value="${ADMIN_NO}">
<input type="hidden" name="CURRENT_TABUP" value="jumin">
<input type="hidden" name="CURRENT_TABDOWN" value="sanchul">

  <tr>
    <td height="43"><img src="/img/sub3_cont1_title.gif" width="800" height="43"></td>
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
        <td align="left">
        <table width="780" border="0" cellspacing="0" cellpadding="0">
        
        <tr>
            <td height="22" background="/img/tab_line_purple.gif">
            <table border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td width="111"><a href="javascript:Tab_Jumin('${ADMIN_NO}')"><img name="jumin_img" src="/img/sub_petition_title2_on_b.gif" alt="점용인 정보" width="110" height="22" border="0"></a></td>
                  <td width="111"><a href="javascript:Tab_Jumji('${ADMIN_NO}')"><img name="jumji_img" src="/img/sub_petition_title3_off.gif" alt="점용지 정보" width="110" height="22" border="0"></a></td>
            <!--  <td><a href="javascript:Tab_Mulgun('${ADMIN_NO}')"><img name="mulgun_img" src="/img/sub_petition_title15_off.gif" alt="물건 정보" width="110" height="22" border="0"></a></td> -->
                </tr>
            </table>
            </td>
		</tr>
		
		<td>
		  	<iframe width="100%" height="100%" name="tabUp" frameborder="0" onload="iFrameResize(this)" scrolling="no" src="/sisul/sisul/jumin_view.do?ADMIN_NO=${ADMIN_NO}"></iframe>
		</td>
		
      <tr>
        <td height="30"></td>
      </tr>

      <tr>
        <td align="left">
        <table width="780" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td height="22" background="/img/tab_line_blue.gif"><table border="0" cellspacing="0" cellpadding="0">
                <tr>
                	<td width="111"><a href="javascript:Tab_Sanchul('${ADMIN_NO}')"><img name="sanchul_img" src="/img/sub_petition_title11_on.gif" alt="산출 내역" width="110" height="22" border="0"></a></td>
                  	<td width="111"><a href="javascript:Tab_Bugwa('${ADMIN_NO}')"><img name="bugwa_img" src="/img/sub_petition_title12_off.gif" alt="부과 정보" width="110" height="22" border="0"></a></td>
                  	<td width="111"><a href="javascript:Tab_Sunap('${ADMIN_NO}')"><img name="sunap_img" src="/img/sub_petition_title14_off.gif" alt="수납 정보" width="110" height="22" border="0"></a></td>
                </tr>
            </table></td>
          </tr>
		  
          <tr>
  			<TD>
  				<iframe width="100%" height="150" name="tabDown" frameborder="0" onload="iFrameResize(this)" scrolling="no" src="/sisul/sisul/sanchul_view.do?ADMIN_NO=${ADMIN_NO}"></iframe>
  			</TD>
          </tr>
          
        </table>
        </td>
      </tr>

		<tr>
			<td height="40" align="right"><a href="#"><img src="/img/save_icon.gif" alt="전체 저장" width="74" height="22" border="0"></a>
			<a href="javascript:Search()"><img src="/img/list_icon.gif" alt="리스트" width="66" height="22" border="0"></a></td>
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