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

		form.target	= "_self";
		form.action = "/facility/gigan/search.do";

		form.submit();
	}

	function iFrameResize(obj)
	{
		var iFrm = obj;
		var the_height = iFrm.contentWindow.document.body.scrollHeight;

		iFrm.style.height = the_height;
	}

	
	function 	TabDown_Img(Tab_Value)
	{
		var	img1	= document.getElementById("bugwa_img");
		var	img2	= document.getElementById("sunap_img");

		img1.src	= "/img/sub_periodi_title6_off.gif";
		img2.src	= "/img/sub_periodi_title5_off.gif";
		
		if(Tab_Value	== "annae")
		{
			img1.src		= "/img/sub_periodi_title6_on.gif";
		}
		else if(Tab_Value	== "giganilgwal")
		{
			img2.src		= "/img/sub_periodi_title5_on.gif";
		}

		var tab	= document.getElementById("CURRENT_TABDOWN");
		tab.value	= Tab_Value;
	}

	function Tab_Ilgwal()
	{
		var form = document.form;
		
		form.target	= 'tabUp';
		form.action = "/facility/gigan/ilgwal_view.do";
		
		form.submit();

		form.target	= "_self";
	}

	function Tab_Annae()
	{		
		var tab	= document.getElementById("CURRENT_TABDOWN");
		if(tab.value	== "annae")
			return;
		else
			tab.value	= "annae";

	//	var	adminno	= document.getElementById("ADMIN_NO").value;
	//	var	seq	= document.getElementById("SEQ").value;
		
//		var tabs	= document.getElementById("tabDown");
//		tabs.src	= "/facility/gigan/annae_view.do";

		var form = document.form;
		
		form.target	= 'tabDown';
		form.action = "/facility/gigan/annae_view.do";
	
		form.submit();

		form.target	= "_self";
	}

	function Tab_Gigan()
	{		
		var tab	= document.getElementById("CURRENT_TABDOWN");
		if(tab.value	== "giganilgwal")
			return;
		else
			tab.value	= "giganilgwal";

	//	var	adminno	= document.getElementById("ADMIN_NO").value;
	//	var	seq	= document.getElementById("SEQ").value;
		
	//	var tabs	= document.getElementById("tabDown");
	//	tabs.src	= "/facility/gigan/giganilgwal_view.do";//?ADMIN_NO=" + adminno + "&SEQ=" + seq;'

		var form = document.form;
		
		form.target	= 'tabDown';
		form.action = "/facility/gigan/giganilgwal_view.do";
	
		form.submit();

		form.target	= "_self";
	}

	function 	Init()
	{
	//	var tab		= document.getElementById("CURRENT_TAB");
	//	tab.value	= "back";

	//	var str	= document.getElementById("GIGAN1");
	//	alert(str.value);
	
		var tab	= document.getElementById("CURRENT_TABDOWN");
		tab.value	= "";

		Tab_Ilgwal();
		Tab_Annae();
	}
	
//]]>
</script>

<body onload="javascript:Init();">
<form name="form" method="post">
<input type="hidden" name="CURRENT_TABDOWN" value="annae">
<input type="hidden" name="GIGAN1" value="${GIGAN1}">
<input type="hidden" name="GIGAN2" value="${GIGAN2}">
<input type="hidden" name="PURPOSE_CD" value="${PURPOSE_CD}">
<input type="hidden" name="BONBUN" value="${BONBUN}">
<input type="hidden" name="BUBUN" value="${BUBUN}">
<input type="hidden" name="NAME" value="${NAME}">
<input type="hidden" name="ADMINNO" value="${ADMINNO}">
<input type="hidden" name="TYPE" value="${TYPE}">
<input type="hidden" name="OWNER_SET" value="${OWNER_SET}">
<input type="hidden" name="TAX_SET" value="${TAX_SET}">
<input type="hidden" name="BJ_CD" value="${BJ_CD}">
<input type="hidden" name="HJ_CD" value="${HJ_CD}">

<table width="800" border="0" cellpadding="0" cellspacing="0">

  <tr>
    <td height="43"><img src="/img/sub2_cont2_title.gif" width="800" height="43"></td>
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
      
      <td> </td>
 <!--           
      <td align="right" class="sub_table_b">관리번호 : <script>var adminno = nr_Adminno_Cut("${ADMIN_NO}"); document.write(adminno);</script></td>
  -->     
      <tr>
        <td align="left">
        <table width="780" border="0" cellspacing="0" cellpadding="0">
        
        <tr>
            <td height="22" background="/img/tab_line_purple.gif">
            <table border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td width="111"><img name="jumin_img" src="/img/sub_periodi_title4.gif" alt="일괄 처리" width="110" height="22" border="0"></td>
                </tr>
            </table>
            </td>
		</tr>
		
		<td>
		  	<iframe width="100%" height="100%" name="tabUp" frameborder="0" onload="iFrameResize(this);" src="" scrolling="no"></iframe>
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
                  <td width="111"><a href="javascript:Tab_Annae()"><img name="bugwa_img" src="/img/sub_periodi_title6_on.gif" alt="안내문" width="110" height="22" border="0"></a></td>
                  <td width="111"><a href="javascript:Tab_Gigan()"><img name="sunap_img" src="/img/sub_periodi_title5_off.gif" alt="기간 연장" width="110" height="22" border="0"></a></td>
                </tr>
            </table></td>
          </tr>
		  
          <tr>
  			<TD>
  				<iframe width="100%" height="150" name="tabDown" frameborder="0" onload="iFrameResize(this);" scrolling="no" src=""></iframe><!-- /jumyong/saewe/bugwa_view.do?ADMIN_NO=${ADMIN_NO} -->
  			</TD>
          </tr>
          
        </table>
        </td>
      </tr>

		<tr>
			<td height="40" align="right">
		<!-- 	<a href="javascript:SaeweSuipBugwa()"><img src="/img/levy_icon.gif" alt="세외수입부과" width="94" height="22" border="0"></a> -->
			<a href="javascript:Search()"><img src="/img/list_icon.gif" alt="리스트" width="66" height="22" border="0"></a></td>
		</tr>
		
		</table>
		</td>
	</tr>
	
	</table>
  </td>
 </tr>

</table>
</form>

</body>
</html>