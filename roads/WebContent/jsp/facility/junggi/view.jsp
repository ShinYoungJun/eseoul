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
	
	function 	TabDown_Img(Tab_Value)
	{
		var	img1	= document.getElementById("product_img");

		var	img5	= document.getElementById("history_img");
		


		img1.src	= "/img/sub_petition_title4_off.gif";

		img5.src	= "/img/sub_petition_title8_off.gif";
		
		
		
		
		if(Tab_Value	== "product")
		{
			img1.src		= "/img/sub_petition_title4_on.gif";
		}
		else if(Tab_Value	== "inspect")
		{
			img2.src		= "/img/sub_petition_title5_on.gif";
		}else if(Tab_Value	== "conf")
		{
			img3.src		= "/img/sub_petition_title6_on.gif";
		}else if(Tab_Value	== "history")
		{
			img5.src		= "/img/sub_petition_title8_on.gif";
		}
		

		var tab	= document.getElementById("CURRENT_TABDOWN");
		tab.value	= Tab_Value;

	}
	
	
	function 	Tab_ImgChange(Tab_Value,Tab_Src,tabsValue)
	{
		var tab	= document.getElementById("CURRENT_TABUP");
		if(tab.value	== Tab_Value)
			return;
		else
			tab.value	= Tab_Value;
	
		var tabs 	= document.getElementById(tabsValue);
		
		if(tabsValue == 'tabUp')
			TabUp_Img(Tab_Value);
		else
			TabDown_Img(Tab_Value);
			
		var adminno = document.getElementById("adminno").value;
		var gu_code = document.getElementById("GU_CODE").value;
		var corp_cd = document.getElementById("CORP_CD").value;
		var request_no = document.getElementById("REQUEST_NO").value;
		
		
		if(Tab_Src != " ")
			tabs.src	= Tab_Src+"?ADMIN_NO="+ adminno +"&GU_CODE=" + gu_code+"&CORP_CD="+corp_cd+"&REQUEST_NO="+request_no;
	
	}

	function 	Init()
	{	
		/*var iFrm = document.getElementById("tabUp1");
		var the_height = 0;
		iFrm.style.height = the_height;*/
	}

	function	BugwaCatch(year, seq)
	{
		document.getElementById("YEAR").value 		= year;
	}

	function	BugwaView(seq)	//	산출조건 클릭시 부과정보 데이터 변경 (Minwon_view.jsp 호출)
	{

		var	adminno		= document.getElementById("ADMIN_NO").value;
		
		document.getElementById("SEQ").value 	= seq;
		
		var tab	= document.getElementById("CURRENT_TABDOWN");
		if(tab.value	!= "bugwa")
			return;
		
		var tabs	= document.getElementById("tabDown");
		tabs.src	= "/jumyong/saewe/bugwa_view.do?ADMIN_NO=" + adminno + "&SEQ=" + seq;
		tabs.src	= "/jumyong/junggi/bugwa_view.do?ADMIN_NO=" + adminno + "&SEQ=" + seq;		
	}
	
	function	SaeweSuipBugwa()
	{
		var	child	= tabDown.document.getElementById("VIEWPAGE");

		if(!child)	//	뷰화면이 아닐 경우..
		{
			alert("먼저 화면을 저장해 주세요.");
			return;
		}
		
		var	adminno	= document.getElementById("ADMIN_NO").value;
		var	seq		= document.getElementById("SEQ").value;
		var	param	= "ADMIN_NO=" + adminno + "&SEQ=" + seq;

		sendRequest("/jumyong/saewe/saewesuipbugwa.do", param, "GET", Result_SaeweSuipBugwa);
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
	
	function goSearch()
	{
		var toDate = document.getElementById("searchToDate").value;
		var fromDate = document.getElementById("searchFromDate").value;
		var type = document.getElementById("TYPE").value;
		var section = document.getElementById("SECTION").value;
		var purpose = document.getElementById("PURPOSE_CD").value;		
		var tax_set = document.getElementById("TAX_SET").value;
		var bj_cd = document.getElementById("BJ_CD").value;
		var hj_cd = document.getElementById("HJ_CD").value;
		var bonbun = document.getElementById("BONBUN").value;
		var bubun = document.getElementById("BUBUN").value;
		var jumyongName = document.getElementById("jumyongName").value;
		var check_type = document.getElementById("check_type").value;
		var numberValue = document.getElementById("numberValue").value;				

		location.href="/facility/junggi/search.do?tDate="+toDate+"&fDate="+fromDate+"&type="+type+"&section="+section
		+"&tax_set="+tax_set+"&purpose="+purpose+"&bj_cd="+bj_cd+"&hj_cd="+hj_cd
		+"&bonbun="+bonbun+"&bubun="+bubun+"&jumyongName="+jumyongName+"&check_type="+check_type+"&numberValue="+numberValue;
	}
	
	function fnPreView()
	{
		window.open('/jsp/jumyong/jumyong/examination.html', "도로점용_산출조사서", "resizable=no, status=no, scrollbars=no, toolbar=no, menubar=no, width=880, height=800");	
	}
	
	function fnOccupancyLicense()
	{
		window.open('/jsp/jumyong/jumyong/occupancyLicense.html', "점용허가증", "resizable=no, status=no, scrollbars=no, toolbar=no, menubar=no, width=880, height=800");	
	}
	
	//	관리자 번호 앞에 9자리 삭제
	function	nr_Adminno_Cut2(adminno)
	{
		if(adminno.length != 20)
			return	adminno
	
		adminno	= adminno.substr(9, 10);
		
		return	adminno;
	}
//]]>
</script>

<body onload="Init();">
<table width="800" border="0" cellpadding="0" cellspacing="0">
<form name="form" method="post">
<input type="hidden" name="CORP_CD" value="${corp_cd}">
<input type="hidden" name="GU_CODE" value="${gu_code}">
<input type="hidden" name="REQUEST_NO" value="${request_no}">
<input type="hidden" name="SEQ" id="SEQ" value="${SEQ}">
<input type="hidden" name="CURRENT_TABUP" value="minwon">
<input type="hidden" name="CURRENT_TABDOWN" id="CURRENT_TABDOWN" value="product">
<input type="hidden" name="year" value="">
<input name="searchToDate" id = "searchToDate" value="${toDate}" type="hidden">
<input name="searchFromDate" id = "searchFromDate" value="${fromDate}" type="hidden">
<input name="TYPE" id = "TYPE" value="${use_type}" type="hidden">
<input name="SECTION" id = "SECTION" value="${use_section}" type="hidden">
<input name="PURPOSE_CD" id = "PURPOSE_CD" value="${purpose}" type="hidden">
<input name="TAX_SET" id = "TAX_SET" value="${taxation_section}" type="hidden">
<input name="BJ_CD" id = "BJ_CD" value="${bjdong_code}" type="hidden">
<input name="HJ_CD" id = "HJ_CD" value="${hjdong_code}" type="hidden">		
<input name="BONBUN" id = "BONBUN" value="${bonbun}" type="hidden">
<input name="BUBUN" id = "BUBUN" value="${bubun}" type="hidden">
<input name="jumyongName" id = "jumyongName" value="${jumyongName}" type="hidden">
<input name="check_type" id = "check_type" value="${check_type}" type="hidden">
<input name="numberValue" id = "numberValue" value="${numberValue}" type="hidden">

<input name="adminNo" id = "adminNo" value="${admin_no}" type="hidden">

  <tr>
    <td height="43"><img src="/img/sub2_cont1_title.gif" width="800" height="43"></td>
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
        <td align="left">
        <table width="780" border="0" cellspacing="0" cellpadding="0">
        
        <!-- <tr>
            <td height="22" background="/img/tab_line_purple.gif">
            <table border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td width="111"><a href="javascript:Tab_ImgChange('minwon','/facility/junggiinfo/minwon_view.do','tabUp')"><img name="minwon_img" src="/img/sub_petition_title9_on.gif" alt="민원 정보" width="110" height="22" border="0"></a></td>
                  <td width="111"><a href="javascript:Tab_ImgChange('jumin','/facility/junggiinfo/jumin_view.do','tabUp')"><img name="jumin_img" src="/img/sub_petition_title2_off.gif" alt="점용인 정보" width="110" height="22" border="0"></a></td>
                  <td width="111"><a href="javascript:Tab_ImgChange('jumji','/facility/junggiinfo/jumji_view.do','tabUp')"><img name="jumji_img" src="/img/sub_petition_title3_off.gif" alt="점용지 정보" width="110" height="22" border="0"></a></td>
                </tr>
            </table>
            </td>
		</tr>
	  <tr>
		<td>
		  	<iframe width="100%" height="100%" name="tabUp" frameborder="0" onload="iFrameResize(this)" scrolling="no" src="/facility/junggiinfo/minwon_view.do?ADMIN_NO=${ADMIN_NO}"></iframe>
		</td>
	  </tr>
      <tr>
        <td height="30"></td>
      </tr>
      <tr>
		<td>
		  	<span onclick="iFrameResize(document.getElementById('tabUp1'));" class="sub_table" style="cursor:pointer">해지 등록</span>
		</td>
	  </tr>
      
      <tr>
		<td>
		  	<iframe width="100%" height="100%" id="tabUp1" name="tabUp1" frameborder="0" onload="iFrameResize(this)" scrolling="no" src=" "></iframe>
		</td>
	  </tr>
	  
	   <tr>
        <td height="30"></td>
      </tr> -->

      <tr>
        <td align="left">
        <table width="780" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td height="22" background="/img/tab_line_blue.gif"><table border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td width="111" onclick ="javascript:Tab_ImgChange('product','/facility/junggi/product_view.do','tabDown')"><img id="product_img" name="product_img" src="/img/sub_petition_title4_on.gif" alt="산출내역" width="110" height="22" border="0" style="cursor:pointer" ></td>
		          <!-- td width="111" onclick ="javascript:Tab_ImgChange('history',' ','tabDown')"><img id="history_img" name="history_img" src="/img/sub_petition_title8_off.gif" alt="이력정보" width="110" height="22" border="0" style="cursor:pointer" ></td-->
                </tr>
            </table></td>
          </tr>
          <tr>
  			<td>
  				<!-- iframe width="100%" height="150" id = "tabDown" name="tabDown" frameborder="0" onload="iFrameResize(this);" scrolling="no" src="/facility/junggi/productInsert.do?GU_CODE=${gu_code}&CORP_CD=${corp_cd}&REQUEST_NO=${request_no}"--></iframe><!-- /jumyong/saewe/bugwa_view.do?ADMIN_NO=${ADMIN_NO} -->
  				<iframe width="100%" height="150" id = "tabDown" name="tabDown" frameborder="0" onload="iFrameResize(this);" scrolling="no" src="/facility/junggi/product_view.do?GU_CODE=${gu_code}&CORP_CD=${corp_cd}&ADMIN_NO=${admin_no}&year=${year}&tax_set=${tax_set }"></iframe><!-- /jumyong/saewe/bugwa_view.do?ADMIN_NO=${ADMIN_NO} -->  				
  			</td>
          </tr>
        </table>
        </td>
      </tr>
		
		</table>
		</td>
	</tr>
	<tr>
      <td height="40" align="right">
			<c:if test="${showExamination == 'true'}"> 								                	
				<img src="/img/produ_icon.gif" alt="산출조사서" width="84" height="22" border="0" onclick="javascript:fnPreView();" style="cursor:pointer">
			</c:if>

			<c:if test="${showLicense == 'true'}"> 								                	
				<img src="/img/occu_icon.gif" alt="점용허가증" width="84" height="22" onclick="javascript:fnOccupancyLicense();"  border="0" style="cursor:pointer">
			</c:if>
		  
	      <img src="/img/list_icon.gif" alt="리스트" width="66" height="22" border="0" onclick="javascript:goSearch();" style="cursor:pointer" >
      </td>
	</tr>
	<tr>
      <td height="20" ></td>
	</tr>
	</table>
  </td>
 </tr>
	
</table>
</body>
</html>