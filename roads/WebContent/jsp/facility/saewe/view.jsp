<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
    
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

<script type="text/javascript"><!--
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
		img2.src	= "/img/sub_petition_title2_off_b.gif";
		//img3.src	= "/img/sub_petition_title3_off.gif";
		img3.src	= "/img/sub_facility_title3_off.gif";
		
		if(Tab_Value	== "sanchul")
		{
			img1.src		= "/img/sub_petition_title16_on.gif";
		}
		else if(Tab_Value	== "jumin")
		{
			img2.src		= "/img/sub_petition_title2_on_b.gif";
		}
		else if(Tab_Value	== "jumji")
		{
			//img3.src		= "/img/sub_petition_title3_on.gif";
			img3.src = "/img/sub_facility_title3_on.gif";
		}		

		var tab	= document.getElementById("CURRENT_TABUP");
		tab.value	= Tab_Value;
	}

	function 	TabDown_Img(Tab_Value)
	{
		var	img1	= document.getElementById("bugwa_img");
		//var	img2	= document.getElementById("sunap_img");

		img1.src	= "/img/sub_petition_title12_off.gif";
		//img2.src	= "/img/sub_petition_title14_off.gif";
		
		if(Tab_Value	== "bugwa")
		{
			img1.src		= "/img/sub_petition_title12_on.gif";
		}
		else if(Tab_Value	== "sunap")
		{
			//img2.src		= "/img/sub_petition_title14_on.gif";
		}

		var tab	= document.getElementById("CURRENT_TABDOWN");
		tab.value	= Tab_Value;
	}
	
	
	
	
	function Tab_Sanchul(adminNo, guCode, corpCd, requestNo, seq)
	{	
		var tab	= document.getElementById("CURRENT_TABUP");
		
		if(tab.value	== "sanchul")
			return;
		else
			tab.value	= "sanchul";
		
		var tabs 	= document.getElementById("tabUp");
		tabs.src	= "/facility/saewe/sanchul_view.do?ADMIN_NO="+adminNo+"&GU_CODE="+guCode+"&CORP_CD="+corpCd+"&REQUEST_NO="+requestNo+"&SEQ="+seq;
	}

	function Tab_Jumin(adminNo, guCode, corpCd)
	{
		var tab	= document.getElementById("CURRENT_TABUP");
		if(tab.value	== "jumin")
			return;
		else
			tab.value	= "jumin";
		
		var tabs 	= document.getElementById("tabUp");
		tabs.src	= "/facility/saewe/jumin_view.do?ADMIN_NO="+adminNo+"&GU_CODE="+guCode+"&CORP_CD="+corpCd;
	}
	
	function Tab_Jumji(adminNo, guCode, corpCd, tax_set)
	{
		var tab	= document.getElementById("CURRENT_TABUP");
		if(tab.value	== "jumji")
			return;
		else
			tab.value	= "jumji";

		var tabs	= document.getElementById("tabUp");
		
		tabs.src	= "/facility/saewe/jumji_view.do?ADMIN_NO="+adminNo+"&GU_CODE="+guCode+"&CORP_CD="+corpCd+"&TAX_SET="+tax_set;
	}
	
	function Tab_Bugwa(guCode,corpCd,requestNo)
	{
		var tab	= document.getElementById("CURRENT_TABDOWN");
		if(tab.value	== "bugwa")
			return;
		else
			tab.value	= "bugwa";

		
		
		var	seq	= document.getElementById("SEQ").value;
		
		var tabs	= document.getElementById("tabDown");
		tabs.src	= "/facility/saewe/bugwa_view.do?GU_CODE="+guCode+"&CORP_CD="+corpCd+"&REQUEST_NO="+requestNo+"&SEQ="+seq;
	}
	
	function Tab_Sunap(adminno)
	{
		var tab	= document.getElementById("CURRENT_TABDOWN");
		if(tab.value	== "sunap")
			return;
		else
			tab.value	= "sunap";
		
		var tabs	= document.getElementById("tabDown");
		tabs.src	= "/facility/saewe/sunap_view.do?ADMIN_NO=" + adminno;
	}

	
	
	function 	Bugwa_On()
	{
		//var	VIEWPAGE	= tabDown.document.getElementById("VIEWPAGE");

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
	
	//	alert(document.getElementById("TAX_NO").value);
	}

	function	BugwaView(guCode,corpCd,admin_no,seq)	//	산출조건 클릭시 부과정보 데이터 변경 (Sanchul_view.jsp 호출)
	{		
		var tab	= document.getElementById("CURRENT_TABDOWN");
		if(tab.value	!= "bugwa")
			return;
		
		
		
		var tabs	= document.getElementById("tabDown");
		tabs.src	= "/facility/saewe/bugwa_view.do?GU_CODE="+guCode+"&CORP_CD="+corpCd+"&ADMIN_NO="+admin_no+"&SEQ="+seq;
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
		
		var	guCode	= document.getElementById("GU_CODE").value;
		var	corpCd	= document.getElementById("CORP_CD").value;
		var	adminNo = document.getElementById("ADMIN_NO").value;
		var	seq = document.getElementById("SEQ").value;
		
		var	param	= "GU_CODE=" + guCode + "&CORP_CD=" + corpCd + "&ADMIN_NO=" + adminNo + "&SEQ=" + seq;
		
		sendRequest("/facility/saewe/saewesuipbugwa.do", param, "GET", Result_SaeweSuipBugwa);
	}

	function	Result_SaeweSuipBugwa(obj)
	{
		if(obj != ""){
			alert(obj);
		}
		
		var	child	= tabDown.document.getElementById("VIEWPAGE");
		if(child)	//	뷰화면일 경우..
		{
			location.href="/facility/saewe/view.do?GU_CODE=${GU_CODE}&CORP_CD=${CORP_CD}&REQUEST_NO=${REQUEST_NO}&SEQ=${SEQ}";
		}
	}

	function Init(){



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
		var user_id   =  tabDown.form.user_id.value;
		
		
		
		if(tax_yn == null || tax_yn == "0")
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
		
		
		
		var URL = "http://98.33.4.82:8082/jsp/IECall/Bu04BugaOneSearchCW.jsp"+ pGoji;
		
		window.open(URL,"세외수입고지서출력","width=800, height=600, left=150, top=150, toolbar=no,location=no,directories=no,status=yes,menubar=no,scrollbars=no,resizable=no");	  
	} 
	
	
//]]>
-->
</script>



<body>

<form name="form" method="post">
<input type="hidden" name="SEQ" value="${SEQ}">
<input type="hidden" name="GIGAN1" value="${GIGAN1}">
<input type="hidden" name="GIGAN2" value="${GIGAN2}">
<input type="hidden" name="GU_CODE" value="${GU_CODE}">
<input type="hidden" name="CORP_CD" value="${CORP_CD}">
<input type="hidden" name="REQUEST_NO" value="${REQUEST_NO}">
<input type="hidden" name="NAME" value="${NAME}">
<input type="hidden" name="SECTION" value="${USE_SECTION}">
<input type="hidden" name="TAX_SET" value="${TAX_SET}">
<input type="hidden" name="TAX_YN" value="${TAX_YN}">
<input type="hidden" name="currentPage" value="${currentPage}">
<input type="hidden" name="ADMIN_NO" value="${ADMIN_NO}">
<input type="hidden" name="year" value="">
<input type="hidden" name="CURRENT_TABUP" value="sanchul">
<input type="hidden" name="CURRENT_TABDOWN" value="bugwa">

<table width="800" border="0" cellpadding="0" cellspacing="0">


  <tr>
    <td height="43"><img src="/img/sub3_cont3_title.gif" width="800" height="43"></td>
  </tr>
  
  <tr>
    <td align="center">
    <table width="780" border="0" cellspacing="0" cellpadding="0">
<!--      <tr>
        <td height="40" align="right">
		<table border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td height="8" colspan="2"></td>
            </tr>
          <tr>
            <td><a href="#"><img src="/img/report_icon.gif" alt="기안문 상신11" width="92" height="18" border="0"></a></td>
            <td><a href="#"><img src="/img/help_icon.gif" alt="도움말" width="65" height="18" border="0"></a></td>
            </tr>
        </table>	
		</td>
      </tr>
 -->     
      <tr>
        <td height="1" bgcolor="eaeaea"></td>
      </tr>
		
      <tr>
        <td height="14"></td>
      </tr>
           
      <td align="right" class="sub_table_b">관리번호 : ${ADMIN_NO }</td>
      
      <tr>
        <td align="left">
        <table width="780" border="0" cellspacing="0" cellpadding="0">
        
        <tr>
            <td height="22" background="/img/tab_line_purple.gif">
            <table border="0" cellspacing="0" cellpadding="0">
                <tr>
                
                  <td width="111"><a href="javascript:Tab_Sanchul('${ADMIN_NO}','${GU_CODE}','${CORP_CD}','${REQUEST_NO}','${SEQ}')"><img name="sanchul_img" src="/img/sub_petition_title16_on.gif" alt="산출 정보" width="110" height="22" border="0"></a></td>
                  <td width="111"><a href="javascript:Tab_Jumin('${ADMIN_NO}','${GU_CODE}','${CORP_CD}')"><img name="jumin_img" src="/img/sub_petition_title2_off_b.gif" alt="점용인 정보" width="110" height="22" border="0"></a></td>
                  <td><a href="javascript:Tab_Jumji('${ADMIN_NO}','${GU_CODE}','${CORP_CD}','${TAX_SET}')"><img name="jumji_img" src="/img/sub_petition_title3_off.gif" alt="시설물 정보" width="110" height="22" border="0"></a></td>
                </tr>
            </table>
            </td>
		</tr>
		
		<td>
		  	<iframe width="100%" height="100%" name="tabUp" frameborder="0" onload="iFrameResize(this)" scrolling="no" src="/facility/saewe/sanchul_view.do?GU_CODE=${GU_CODE}&CORP_CD=${CORP_CD}&ADMIN_NO=${ADMIN_NO}&SEQ=${SEQ}"></iframe>
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
                  <td width="111"><!--<a href="javascript:Tab_Bugwa('${GU_CODE}','${CORP_CD}','${REQUEST_NO}')"></a>--><img name="bugwa_img" src="/img/sub_petition_title12_on.gif" alt="부과 정보" width="110" height="22" border="0"></td>
                 <td width="111"><!--  <a href="javascript:Tab_Sunap()"><img name="sunap_img" src="/img/sub_petition_title14_off.gif" alt="수납 정보" width="110" height="22" border="0"></a>--></td>
                </tr>
            </table></td>
          </tr>
		  
          <tr>
  			<TD>
  				<iframe width="100%" height="150" name="tabDown" frameborder="0" onload="iFrameResize(this)" scrolling="no" src=""></iframe><!-- /facility/saewe/bugwa_view.do?ADMIN_NO=${ADMIN_NO} -->
  			</TD>
          </tr>
          
        </table>
        </td>
        </tr>
		
		<tr>
			<td colspan="0" bgcolor="F6F6F6" class="table_bl_left"  align="right">
				<span style="display:none" id="Bugwa_On">
					<table width="100%" border="0">
					<td>
						<img src="../../../img/notice_icon.gif" alt="고지서 발급" border="0"  onclick="javascript:fGoji()"  style="cursor:hand">
						<a href="javascript:SaeweSuipBugwa()"><img src="/img/levy_icon.gif" alt="세외수입부과" width="94" height="22" border="0"></a>
						<a href="javascript:Search()"><img src="/img/list_icon.gif" alt="리스트" width="66" height="22" border="0"></a>
					</td>
					</table>
				</span>
				
				<span style="display:none" id="Bugwa_Off">
					<table width="100%" border="0">
					<td><a href="javascript:Search()"><img src="/img/list_icon.gif" alt="리스트" width="66" height="22" border="0"></a></td>
					</table>
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

</body>
</html>