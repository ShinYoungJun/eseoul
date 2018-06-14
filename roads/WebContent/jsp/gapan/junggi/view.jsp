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

		iFrm.style.height = the_height;
	}

	function 	TabUp_Img(Tab_Value)
	{
		var	img1	= document.getElementById("sanchul_img");
		var	img2	= document.getElementById("jumin_img");
		var	img3	= document.getElementById("jumji_img");
	
		img1.src	= "/img/sub_petition_title16_off.gif";
		img2.src	= "/img/sub_petition_title2_off.gif";
		img3.src	= "/img/sub_petition_title3_off.gif";
		
		if(Tab_Value	== "sanchul")
		{
			img1.src		= "/img/sub_petition_title16_on.gif";
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
	
	function 	TabDown_Img(Tab_Value)
	{
		var	img1	= document.getElementById("bugwa_img");
		var	img2	= document.getElementById("history_img");

		img1.src	= "/img/sub_petition_title12_off.gif";
		img2.src	= "/img/sub_petition_title8_off.gif";
		
		if(Tab_Value	== "bugwa")
		{
			img1.src		= "/img/sub_petition_title12_on.gif";
		}
		else if(Tab_Value	== "sunap")
		{
			img2.src		= "/img/sub_petition_title8_on.gif";
		}

		var tab	= document.getElementById("CURRENT_TABDOWN");
		tab.value	= Tab_Value;
	}

	
	function Tab_Sanchul(gapan_no)
	{
		var tab	= document.getElementById("CURRENT_TABUP");
		if(tab.value	== "sanchul")
			return;
		else
			tab.value	= "sanchul";

		var year	= document.getElementById("year").value;
	//	var	seq		= document.getElementById("TAX_NO").value;

		var tabs 	= document.getElementById("tabUp");
		tabs.src	= "/gapan/junggi/junggi_view.do?gapan_no=" + gapan_no + "&year=" + year;// + "&SEQ=" + seq;
	}

	function Tab_Jumin(adminno)
	{
		var tab	= document.getElementById("CURRENT_TABUP");
		if(tab.value	== "jumin")
			return;
		else
			tab.value	= "jumin";
		
		var tabs 	= document.getElementById("tabUp");
		tabs.src	= "/gapan/saewe/jumin_view.do?ADMIN_NO=" + adminno;
	}

	function Tab_Jumji(adminno)
	{
		var tab	= document.getElementById("CURRENT_TABUP");
		if(tab.value	== "jumji")
			return;
		else
			tab.value	= "jumji";

		var tabs	= document.getElementById("tabUp");
		tabs.src	= "/gapan/saewe/jumji_view.do?ADMIN_NO=" + adminno;
	}

	function Tab_Bugwa(adminno)
	{		
		var tab	= document.getElementById("CURRENT_TABDOWN");
		if(tab.value	== "bugwa")
			return;
		else
			tab.value	= "bugwa";

	//	var	adminno	= document.getElementById("ADMIN_NO").value;
		var	seq	= document.getElementById("SEQ").value;
		
		var tabs	= document.getElementById("tabDown");
//		tabs.src	= "/gapan/saewe/bugwa_view.do?ADMIN_NO=" + adminno + "&SEQ=" + seq;
		tabs.src	= "/gapan/junggi/bugwa_view.do?ADMIN_NO=" + adminno + "&SEQ=" + seq;		
		
	}

	function Tab_Sunap(adminno)
	{
		var tab	= document.getElementById("CURRENT_TABDOWN");
		if(tab.value	== "sunap")
			return;
		else
			tab.value	= "sunap";
		
		var tabs	= document.getElementById("tabDown");
//		tabs.src	= "/gapan/saewe/sunap_view.do?ADMIN_NO=" + adminno;
	}

	function 	Init()
	{	
	//	var tab		= document.getElementById("CURRENT_TAB");
	//	tab.value	= "back";
	}

	function	BugwaCatch(year, seq)
	{
		document.getElementById("YEAR").value 		= year;
	
	//	alert(document.getElementById("TAX_NO").value);
	}

	function	BugwaView(seq)	//	산출조건 클릭시 부과정보 데이터 변경 (Sanchul_view.jsp 호출)
	{

		var	adminno		= document.getElementById("ADMIN_NO").value;
		
		document.getElementById("SEQ").value 	= seq;
		
		var tab	= document.getElementById("CURRENT_TABDOWN");
		if(tab.value	!= "bugwa")
			return;
		
		var tabs	= document.getElementById("tabDown");
		tabs.src	= "/gapan/saewe/bugwa_view.do?ADMIN_NO=" + adminno + "&SEQ=" + seq;
		tabs.src	= "/gapan/junggi/bugwa_view.do?ADMIN_NO=" + adminno + "&SEQ=" + seq;		
	}
	
	function	SaeweSuipBugwa()
	{
		var	child	= tabDown.document.getElementById("VIEWPAGE");

		if(!child)	//	뷰화면이 아닐 경우..
		{
			alert("먼저 화면을 저장해 주세요.");
			return;
		}
		
		//	alert(child.value);
		
		var	adminno	= document.getElementById("ADMIN_NO").value;
		var	seq		= document.getElementById("SEQ").value;
		var	param	= "ADMIN_NO=" + adminno + "&SEQ=" + seq;

		sendRequest("/gapan/saewe/saewesuipbugwa.do", param, "GET", Result_SaeweSuipBugwa);
	}

	function	Result_SaeweSuipBugwa(obj)
	{
		if(obj == "0")			
			alert("데이터가 없습니다.");
		else if(obj == "1")			
			alert("부과 되었습니다.");
		else if(obj == "2")			
			alert("부과된 정보입니다.");
	}
	
//]]>
</script>

<body onload="Init();">
<table width="800" border="0" cellpadding="0" cellspacing="0">
<form name="form" method="post">
<input type="hidden" name="gapan_no" value="${gapan_no}">
<input type="hidden" name="year" value="${year }">

<input type="hidden" name="CURRENT_TABUP" value="sanchul">
<input type="hidden" name="CURRENT_TABDOWN" value="bugwa">

  <tr>
    <td height="43"><img src="/img/sub2_cont1_title.gif" width="800" height="43"></td>
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
          <!-- tr>
            <td><a href="#"><img src="/img/report_icon.gif" alt="기안문 상신" width="92" height="18" border="0"></a></td>
            <td><a href="#"><img src="/img/help_icon.gif" alt="도움말" width="65" height="18" border="0"></a></td>
            </tr-->
        </table>
	<!--상단 기안문상신,도움말 메뉴-->		
		</td>
      </tr>
      
      
           
      <td align="right" class="sub_table_b">관리번호 : <script>var adminno = nr_Adminno_Cut("${gapan_no}"); document.write(adminno);</script></td>
      
      <tr>
        <td align="left">
        <table width="780" border="0" cellspacing="0" cellpadding="0">
        
        <tr>
            <td height="22" background="/img/tab_line_purple.gif">
            <table border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td width="111"><a href="javascript:Tab_Sanchul('${gapan_no}')"><img name="sanchul_img" src="/img/sub_petition_title16_on.gif" alt="산출 정보" width="110" height="22" border="0"></a></td>
                  <!-- td width="111"><a href="javascript:Tab_Jumin('${gapan_no}')"><img name="jumin_img" src="/img/sub_petition_title2_off.gif" alt="점용인 정보" width="110" height="22" border="0"></a></td>
                  <td><a href="javascript:Tab_Jumji('${gapan_no}')"><img name="jumji_img" src="/img/sub_petition_title3_off.gif" alt="점용지 정보" width="110" height="22" border="0"></a></td-->
                </tr>
            </table>
            </td>
		</tr>
		<td>
		  	<iframe width="100%" height="100%" name="tabUp" frameborder="0" onload="iFrameResize(this)" scrolling="no" src="/gapan/junggi/junggi_view.do?gapan_no=${gapan_no}&year=${year }"></iframe>
		</td>
		<tr>
			<td height="40" align="right">
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