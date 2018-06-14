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
	
		img1.src	= "/img/sub_petition_title16_off.gif";

		
		if(Tab_Value	== "sanchul")
		{
			img1.src		= "/img/sub_petition_title16_on.gif";
		}

		var tab	= document.getElementById("CURRENT_TABUP");
		tab.value	= Tab_Value;
	}
	
	function 	TabDown_Img(Tab_Value)
	{
		var	img1	= document.getElementById("bugwa_img");

		img1.src		= "/img/sub_petition_title12_on.gif";

		var tab	= document.getElementById("CURRENT_TABDOWN");
		tab.value	= Tab_Value;
	}
	
	
	function Tab_Sanchul(gapanNo)
	{
		var tab	= document.getElementById("CURRENT_TABUP");
		
		if(tab.value	== "sanchul")
			return;
		else
			tab.value	= "sanchul";
		
		var	seq	= document.getElementById("SEQ").value;
		
		var tabs 	= document.getElementById("tabUp");
		tabs.src	= "/gapan/saewe/sanchul_view.do?GAPAN_NO=" + gapanNo + "&SEQ=" + seq;
	}

	function Tab_Jumin(gapanNo)
	{
		var tab	= document.getElementById("CURRENT_TABUP");
		if(tab.value	== "jumin")
			return;
		else
			tab.value	= "jumin";
		
		var tabs 	= document.getElementById("tabUp");
		tabs.src	= "/gapan/saewe/jumin_view.do?GAPAN_NO=" + gapanNo;
	}
	
	function Tab_Jumji(gapanNo)
	{
		var tab	= document.getElementById("CURRENT_TABUP");
		if(tab.value	== "jumji")
			return;
		else
			tab.value	= "jumji";

		var tabs	= document.getElementById("tabUp");
		tabs.src	= "/gapan/saewe/jumji_view.do?GAPAN_NO=" + gapanNo;
	}
	
	function Tab_Bugwa(gapanNo)
	{
		var tab	= document.getElementById("CURRENT_TABDOWN");
		if(tab.value	== "bugwa")
			return;
		else
			tab.value	= "bugwa";

		var	seq	= document.getElementById("SEQ").value;
		var tabs	= document.getElementById("tabDown");
		tabs.src	= "/gapan/saewe/bugwa_view.do?GAPAN_NO=" + gapanNo + "&SEQ=" + seq;
	}


	function	BugwaView(seq)	//	산출조건 클릭시 부과정보 데이터 변경 (Sanchul_view.jsp 호출)
	{
		var	gapanNo		= document.getElementById("GAPAN_NO").value;
		
		document.getElementById("SEQ").value 	= seq;
		
		var tab	= document.getElementById("CURRENT_TABDOWN");
		if(tab.value	!= "bugwa")
			return;
		
		var tabs	= document.getElementById("tabDown");
		tabs.src	= "/gapan/saewe/bugwa_view.do?GAPAN_NO=" + gapanNo + "&SEQ=" + seq;
	}





	
	
	function 	Init()
	{		
		historyBack = document.referrer;
	}

	var historyBack = '';
	
	function 	Bugwa_On()
	{
		var	VIEWPAGE	= tabDown.document.getElementById("VIEWPAGE");

		document.getElementById("Bugwa_On").style.display = "block";
		document.getElementById("Bugwa_Off").style.display = "none";
	}
	
	function 	Bugwa_Off()
	{
		document.getElementById("Bugwa_On").style.display = "none";
		document.getElementById("Bugwa_Off").style.display = "block";

	}
	
	function	BugwaCatch(year, seq)
	{
		document.getElementById("YEAR").value 		= year;
	
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
		
		var	adminno	= document.getElementById("GAPAN_NO").value;
		var	seq		= document.getElementById("SEQ").value;
		var	param	= "GAPAN_NO=" + adminno + "&SEQ=" + seq;
		
		sendRequest("/gapan/saewe/saewesuipbugwa.do", param, "GET", Result_SaeweSuipBugwa);
	}

	function	Result_SaeweSuipBugwa(obj)
	{
		if(obj != ""){
			alert(obj);
		}
		var	child	= tabDown.document.getElementById("VIEWPAGE");
		if(child)	//	뷰화면일 경우..
		{
			location.href="/gapan/saewe/view.do?GAPAN_NO=${GAPAN_NO}&SEQ=${SEQ}";
		}
	}
	
	// 고지서 발급
	function fGoji()
	{	
		var pGoji;
		var tax_yn    =  tabDown.form.TAX_YN.value;
		var sigu_cd   =  tabDown.form.sigu_cd.value;
		var buseo_cd  =  tabDown.form.buseo_cd.value;
		var semok_cd  =  tabDown.form.semok_cd.value;
		var tax_ym    =  tabDown.form.tax_ym.value;
		var tax_gubun =  tabDown.form.tax_gubun.value;
		var tax_no    =  tabDown.form.tax_no.value;
		var user_id   =  tabDown.form.bukwa_id.value;
		
		if(tax_yn != "1")
		{
			alert("부과된 정보가 없습니다.");
			return;
		}
		
		pGoji = "?sigu_cd="+sigu_cd; 
		pGoji = pGoji + "&buseo_cd="+buseo_cd;
		pGoji = pGoji + "&semok_cd="+semok_cd; 
		pGoji = pGoji + "&tax_ym="+tax_ym;
		pGoji = pGoji + "&tax_gubun="+tax_gubun;
		pGoji = pGoji + "&tax_no="+tax_no;
		pGoji = pGoji + "&user_id="+user_id;
		
		


		//var URL = "http://98.33.4.5/jsp/IECall/Bu04BugaOneSearchCW.jsp"+ pGoji;
		var URL = "http://98.33.4.164/jsp/IECall/Bu04BugaOneSearchCW.jsp"+ pGoji;
		
		window.open(URL,"세외수입고지서출력","width=800, height=600, left=150, top=150, toolbar=no,location=no,directories=no,status=yes,menubar=no,scrollbars=no,resizable=no");	  
	} 
	
//]]>
</script>

<body >
<form id="form" name="form" method="post">
<input type="hidden" id="GAPAN_NO" name="GAPAN_NO" value="${GAPAN_NO}">
<input type="hidden" id="SEQ" name="SEQ" value="${SEQ}">

<input type="hidden" id="CURRENT_TABUP" name="CURRENT_TABUP" value="sanchul">
<input type="hidden" id="CURRENT_TABDOWN" name="CURRENT_TABDOWN" value="bugwa">

<input type="hidden" id="GIGAN1" name="GIGAN1" value="${SEARCH_OPTIONS['GIGAN1']}">
<input type="hidden" id="GIGAN2" name="GIGAN2" value="${SEARCH_OPTIONS['GIGAN2']}">
<input type="hidden" id="PURPOSE_CD" name="PURPOSE_CD" value="${SEARCH_OPTIONS['PURPOSE_CD']}">
<input type="hidden" id="BONBUN" name="BONBUN" value="${SEARCH_OPTIONS['BONBUN']}">
<input type="hidden" id="BUBUN" name="BUBUN" value="${SEARCH_OPTIONS['BUBUN']}">
<input type="hidden" id="NAME" name="NAME" value="${SEARCH_OPTIONS['NAME']}">
<input type="hidden" id="ADMINNO" name="ADMINNO" value="${SEARCH_OPTIONS['ADMINNO']}">
<input type="hidden" id="TYPE" name="TYPE" value="${SEARCH_OPTIONS['TYPE']}">
<input type="hidden" id="SECTION" name="SECTION" value="${SEARCH_OPTIONS['SECTION']}">
<input type="hidden" id="OWNER_SET" name="OWNER_SET" value="${SEARCH_OPTIONS['OWNER_SET']}">
<input type="hidden" id="BJ_CD" name="BJ_CD" value="${SEARCH_OPTIONS['BJ_CD']}">
<input type="hidden" id="HJ_CD" name="HJ_CD" value="${SEARCH_OPTIONS['HJ_CD']}">
<input type="hidden" id="TAX_YN" name="TAX_YN" value="${SEARCH_OPTIONS['TAX_YN']}">
<input type="hidden" id="currentPage" name="currentPage" value="${SEARCH_OPTIONS['currentPage']}">

<table width="800" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td height="43"><img src="/img/sub9_cont3_title.gif" width="800" height="43"></td>
  </tr>
  
  <tr>
    <td align="center">
    <table width="780" border="0" cellspacing="0" cellpadding="0">

      <tr>
        <td height="1" bgcolor="eaeaea"></td>
      </tr>
		
      <tr>
        <td height="14"></td>
      </tr>
      <tr>
      	<td align="right" class="sub_table_b">관리번호 : <script>var adminno = nr_Adminno_Cut("${GAPAN_NO}"); document.write(adminno);</script></td>
      </tr>
           
      
      
      <tr>
        <td align="left">
        <table width="780" border="0" cellspacing="0" cellpadding="0">
        
        <tr>
            <td height="22" background="/img/tab_line_purple.gif">
            <table border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td width="111"><a href="javascript:Tab_Sanchul('${GAPAN_NO}')"><img id="sanchul_img" src="/img/sub_petition_title16_on.gif" alt="산출 정보" width="110" height="22" border="0"></a></td>
                </tr>
            </table>
            </td>
		</tr>
		<tr>
			<td>
			  	<iframe width="100%" height="100%" id="tabUp" frameborder="0" onload="iFrameResize(this)" scrolling="no" src="/gapan/saewe/sanchul_view.do?GAPAN_NO=${GAPAN_NO}&SEQ=${SEQ}"></iframe>
			</td>
		</tr>
		
		
		
      <tr>
        <td height="30"></td>
      </tr>
		
        <tr>
        <td align="left">
        <table width="780" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td height="22" background="/img/tab_line_blue.gif"><table border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td width="111">
                  	<img id="bugwa_img" src="/img/sub_petition_title12_on.gif" onclick="Tab_Bugwa('${GAPAN_NO}');" alt="부과 정보" width="110" height="22" border="0">
                  </td>
                </tr>
            </table></td>
          </tr>
		  
          <tr>
  			<TD>
  				<iframe width="100%" height="150" id="tabDown" frameborder="0" onload="iFrameResize(this)" scrolling="no" src=""></iframe>
  			</TD>
          </tr>
          
        </table>
        </td>
        </tr>
		
		<tr>
			<td colspan="0" bgcolor="F6F6F6" class="table_bl_left"  align="right">
				<span style="display:none" id="Bugwa_On">
					<table width="100%" border="0">
					<tr>
					<td>
						<img src="../../../img/notice_icon.gif" alt="고지서 발급" border="0" onclick="javascript:fGoji();" style="cursor:hand">
						<a href="javascript:SaeweSuipBugwa()"><img src="/img/levy_icon.gif" alt="세외수입부과" width="94" height="22" border="0"></a>
						<a href="javascript:Search()"><img src="/img/list_icon.gif" alt="리스트" width="66" height="22" border="0"></a>
					</td>
					
					</tr>
					
					</table>
				</span>
				
				<span style="display:none" id="Bugwa_Off">
					<table width="100%" border="0">
					<tr>
						<td>
							<img src="/img/list_icon.gif" onclick="document.location.href = historyBack;" alt="리스트" width="66" height="22" border="0">
						</td>
					</tr>
					
					</table>
				</span>
			</td>
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