<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="/jsp/common/loginCheck.jsp" %>
<%@ include file="/jsp/common/include.jsp" %>


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
<script language="javascript" src="/js/common.js"></script>
<script language="javascript" src="/js/PopupCalendar.js"></script>
<script language="javascript" src="/js/calculation.js"></script>
<script language="javascript" src="/js/selectItem.js"></script>
<script language="javascript" src="/js/Check_inputbox.js"></script>
<script language="javascript" src="/js/Ajax_request.js"></script>
<script type="text/javascript">
	function iFrameResize(obj)
	{
		var iFrm = obj;
		var the_height = iFrm.contentWindow.document.body.scrollHeight;
		iFrm.style.height = the_height;
	}
	function 	TabDown_Img(Tab_Value)
	{
		var	img1	= document.getElementById("accuse_img");
		var	img2	= document.getElementById("changejob_img");


		img1.src	= "/img/sub_rojum_accuse_off.gif";
		img2.src	= "/img/sub_rojum_changejob_off.gif";

		if(Tab_Value	== "accuse")
		{
			img1.src		= "/img/sub_rojum_accuse_on.gif";
		}
		if(Tab_Value	== "changejob")
		{
			img2.src		= "/img/sub_rojum_changejob_on.gif";
		}

		var tab	= document.getElementById("CURRENT_TABDOWN");
		tab.value	= Tab_Value;

	}

	function Tab_Accuse()
	{		
		var tab	= document.getElementById("CURRENT_TABDOWN");
		if(tab.value	== "accuse")
			return;
		else
			tab.value	= "accuse";

		TabDown_Img("accuse");		
		var tabs	= document.getElementById("tabDown");
		tabs.src	= "/rojum/owner/accuse_search.do";		
		
	}
	
	function Tab_Changejob()
	{		
		var tab	= document.getElementById("CURRENT_TABDOWN");
		if(tab.value	== "changejob")
			return;
		else
			tab.value	= "changejob";

		TabDown_Img("changejob");		
		var tabs	= document.getElementById("tabDown");
		tabs.src	= "/rojum/owner/changejob_search.do";		
		
	}
	
	function 	Init()
	{
		TabDown_Img("accuse");	
		document.getElementById("tabDown").src="/rojum/owner/accuse_search.do";

	}
	
</script>

<body onload="Init();">
<form id="form" name="form" method="post">
<input type="hidden" id="CURRENT_TABDOWN" name="CURRENT_TABDOWN" value="accuse">
<table width="810" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td height="43"><img src="/img/sub7_cont4_title.gif" width="800" height="43"></td>
  </tr>
  
  <tr>
    <td align="center">
    <table width="810" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td height="1" bgcolor="eaeaea"></td>
      </tr>
 
      <tr>
        <td height="14"></td>
      </tr>
      <tr>
        <td align="left">
        <table width="810" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td height="22" background="/img/tab_line_blue.gif">
            <table border="0" cellspacing="0" cellpadding="0">
                <tr>
                  
	              <td width="111" onclick ="javascript:Tab_Accuse()"><img id="accuse_img" name="accuse_img" src="/img/sub_rojum_accuse_on.gif" alt="고발내역" width="110" height="22" border="0" style="cursor:pointer" ></td>
                  <td width="111" onclick ="javascript:Tab_Changejob()"><img id="changejob_img" name="changejob_img" src="/img/sub_rojum_changejob_off.gif" alt="전업지원내역" width="110" height="22" border="0" style="cursor:pointer" ></td>
	              </tr>
            </table>
            </td>
          </tr>		  
          <tr>
  			<td>
  				<iframe width="100%" id = "tabDown" name="tabDown" frameborder="0" onload="iFrameResize(this);" scrolling="no" src=""></iframe>
  			</td>
          </tr>
        </table>
        </td>
      </tr>		
		
	</table>
	</td>
	</tr>
	<tr>
      <td height="20" ></td>
	</tr>
	</table>
  </td>
 </tr>

</table>
</form>
</body>
</html>