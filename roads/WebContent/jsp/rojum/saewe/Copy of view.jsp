<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="/jsp/common/loginCheck.jsp"%>
<%@ include file="/jsp/common/include.jsp"%>


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

	function 	Tab_Img(Tab_Value)
	{
		var	img2	= document.getElementById("unyong_img");
		var	img4	= document.getElementById("jumji_img");
	
		img2.src	= "/img/sub_gapan_title4_off.gif";
		img4.src	= "/img/sub_petition_title10_off.gif";
		
		if(Tab_Value	== "unyong")
		{
			img2.src		= "/img/sub_gapan_title4_on.gif";
		}
		else if(Tab_Value	== "jumji")
		{
			img4.src		= "/img/sub_petition_title10_on.gif";
		}

		var tab	= document.getElementById("CURRENT_TABUP");

		tab.value	= Tab_Value;
	}

	function 	TabDown_Img(Tab_Value)
	{
		var	img1	= document.getElementById("bugwa_img");
		img1.src	= "/img/sub_petition_title12_off.gif";
	

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
		tabs.src	= "/rojum/saewe/sanchul_view.do?ADMIN_NO=gapanNo" + adminno + "&SEQ=" + seq;
	}

	function Tab_Unyong(gapanno)
	{
		var tab	= document.getElementById("CURRENT_TABUP");
		if(tab.value	== "unyong")
			return;
		else
			tab.value	= "unyong";
		
		var tabs 	= document.getElementById("tabUp");
		tabs.src	= "/rojum/jumyonginfo/unyong_view.do?GAPAN_NO=" + gapanno;
	}

	function Tab_Jumji(gapanno)
	{
		var tab	= document.getElementById("CURRENT_TABUP");

		if(tab.value	== "jumji")
			return;
		else
			tab.value	= "jumji";

		var tabs	= document.getElementById("tabUp");
		tabs.src	= "/rojum/jumyonginfo/jumji_view.do?GAPAN_NO=" + gapanno;
	}
	
	function Tab_Bugwa(adminno)
	{
		var tab	= document.getElementById("CURRENT_TABDOWN");
		if(tab.value	== "bugwa")
			return;
		else
			tab.value	= "bugwa";

	
		var	seq	= document.getElementById("SEQ").value;
		var	gp_typ	= document.getElementById("GP_TYP").value;
		
		var tabs	= document.getElementById("tabDown");
		tabs.src	= "/rojum/saewe/bugwa_view.do?ADMIN_NO=" + adminno + "&SEQ=" + seq;
	}
	
	function Tab_Sunap(adminno)
	{
		var tab	= document.getElementById("CURRENT_TABDOWN");
		if(tab.value	== "sunap")
			return;
		else
			tab.value	= "sunap";
		
		var tabs	= document.getElementById("tabDown");
		tabs.src	= "/rojum/saewe/sunap_view.do?ADMIN_NO=" + adminno;
	}

	function 	Init()
	{
		BugwaView('${SEQ}');

	}
	
	function 	Bugwa_On()
	{
		var	VIEWPAGE	= tabDown.document.getElementById("VIEWPAGE");

		document.getElementById("Bugwa_On").style.display = "block";
		document.getElementById("Bugwa_Off").style.display = "none";

	}
	
	function 	Bugwa_Off()
	{
	//	var	VIEWPAGE	= tabDown.document.getElementById("VIEWPAGE").value;
		document.getElementById("Bugwa_On").style.display = "none";
		document.getElementById("Bugwa_Off").style.display = "block";

	}
	
	function	BugwaCatch(year, seq)
	{
		document.getElementById("YEAR").value 		= year;
	
	}

	function	BugwaView(seq)	//	산출조건 클릭시 부과정보 데이터 변경 (Sanchul_view.jsp 호출)
	{
		var	adminno		= document.getElementById("ADMIN_NO").value;
		var gp_typ = document.getElementById("GP_TYP").value;
		
		document.getElementById("SEQ").value 	= seq;
		
		var tab	= document.getElementById("CURRENT_TABDOWN");
		if(tab.value	!= "bugwa")
			return;
		
		var tabs	= document.getElementById("tabDown");
		tabs.src	= "/rojum/saewe/bugwa_view.do?ADMIN_NO=" + adminno + "&SEQ=" + seq;
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
		
		sendRequest("/rojum/saewe/saewesuipbugwa.do", param, "GET", Result_SaeweSuipBugwa);
	}

	function	Result_SaeweSuipBugwa(obj)
	{
		if(obj != ""){
			alert(obj);
		}
		var	child	= tabDown.document.getElementById("VIEWPAGE");
		if(child)	//	뷰화면일 경우..
		{
			location.href="/rojum/saewe/view.do?ADMIN_NO=${ADMIN_NO}&SEQ=${SEQ}";
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
		
		
		
		
		
		var URL = "http://98.33.4.5/jsp/IECall/Bu04BugaOneSearchCW.jsp"+ pGoji;
		
		window.open(URL,"세외수입고지서출력","width=800, height=600, left=150, top=150, toolbar=no,location=no,directories=no,status=yes,menubar=no,scrollbars=no,resizable=no");
	} 
	
//]]>
</script>

<body onload="Init();" >
<form name="form" method="post">
<input type="hidden" name="ADMIN_NO" value="${ADMIN_NO}">
<input type="hidden" name="SEQ" value="${SEQ}">
<input type="hidden" name="GP_TYP" value="${GP_TYP}">

<input type="hidden" name="CURRENT_TABUP" value="sanchul">
<input type="hidden" name="CURRENT_TABDOWN" value="bugwa">

<input type="hidden" name="GIGAN1" value="${GIGAN1}">
<input type="hidden" name="GIGAN2" value="${GIGAN2}">
<input type="hidden" name="PURPOSE_CD" value="${PURPOSE_CD}">
<input type="hidden" name="BONBUN" value="${BONBUN}">
<input type="hidden" name="BUBUN" value="${BUBUN}">
<input type="hidden" name="NAME" value="${NAME}">
<input type="hidden" name="ADMINNO" value="${ADMINNO}">
<input type="hidden" name="TYPE" value="${TYPE}">
<input type="hidden" name="SECTION" value="${SECTION}">
<input type="hidden" name="OWNER_SET" value="${OWNER_SET}">
<input type="hidden" name="BJ_CD" value="${BJ_CD}">
<input type="hidden" name="HJ_CD" value="${HJ_CD}">
<input type="hidden" name="TAX_YN" value="${TAX_YN}">
<input type="hidden" name="currentPage" value="${currentPage}">

<table width="800" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td height="43"><img src="/img/sub1_cont3_title.gif" width="800" height="43"></td>
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
	      <td align="right" class="sub_table_b">관리번호 : <script>var adminno = nr_Adminno_Cut("${ADMIN_NO}"); document.write(adminno);</script></td>
      </tr>
      <tr>
        <td align="left">
        <table width="780" border="0" cellspacing="0" cellpadding="0">
        
    	<tr>
            <td height="22" background="/img/tab_line_purple.gif">
            <table border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td width="111"><a href="javascript:Tab_Jumji('${ADMIN_NO}')"><img name="jumji_img" src="/img/sub_petition_title10_off.gif" alt="시설/운영 정보" width="110" height="22" border="0"></a></td>
                  <td width="111"><a href="javascript:Tab_Unyong('${ADMIN_NO}')"><img name="unyong_img" src="/img/sub_gapan_title4_off.gif" alt="운영자 정보" width="110" height="22" border="0"></a></td>				             
                </tr>
            </table>
            </td>
		</tr>
		
		  <tr>
			<td>
			  	<iframe width="100%" height="100%" id="tabUp" name="tabUp" frameborder="0" onload="iFrameResize(this)" scrolling="no" src="/rojum/jumyonginfo/jumji_view.do?GAPAN_NO=${ADMIN_NO}"></iframe>
			</td> 
		  </tr>
		  
		  <tr>
			<td height="30px">
			</td> 
		  </tr>
	
        <tr>
        <td align="left">
        <table width="780" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td height="22" background="/img/tab_line_blue.gif"><table border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td width="111"><a href="javascript:Tab_Bugwa('${ADMIN_NO}')"><img name="bugwa_img" src="/img/sub_petition_title12_on.gif" alt="부과 정보" width="110" height="22" border="0"></a></td>
                </tr>
            </table></td>
          </tr>
		  
          <tr>
  			<TD>
  				<iframe width="100%" height="150" name="tabDown" frameborder="0" onload="iFrameResize(this)" scrolling="no" src=""></iframe><!-- /gapan/saewe/bugwa_view.do?ADMIN_NO=${ADMIN_NO} -->
  			</TD>
          </tr>
          
        </table>
        </td>
        </tr>
        <tr>
        <td height="10px">
        </td>
        </tr>
		
		<tr>
			<td colspan="0" bgcolor="F6F6F6" class="table_bl_left"  align="right">
				<span style="display:none" id="Bugwa_On">
						<img src="../../../img/notice_icon.gif" alt="고지서 발급" border="0" onclick="javascript:fGoji();" style="cursor:hand">
						<a href="javascript:SaeweSuipBugwa()"><img src="/img/levy_icon.gif" alt="세외수입부과" width="94" height="22" border="0"></a>
						<a href="javascript:Search()"><img src="/img/list_icon.gif" alt="리스트" width="66" height="22" border="0"></a>
				</span>
				
				<span style="display:none" id="Bugwa_Off">
					<a href="javascript:Search()"><img src="/img/list_icon.gif" alt="리스트" width="66" height="22" border="0"></a>
				</span>
			<td>
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