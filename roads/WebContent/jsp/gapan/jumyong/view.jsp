<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
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
<script language="javascript" src="/jsp/RexServer/rexscript/rexpert.js"></script>
<script language="javascript" src="/jsp/RexServer/rexscript/rexpert_properties.js"></script>

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

	function 	TabUp_Img(Tab_Value)
	{
		var	img1	= document.getElementById("minwon_img");
		var	img2	= document.getElementById("unyong_img");
		var	img3	= document.getElementById("jumin_img");
		var	img4	= document.getElementById("jumji_img");

		img1.src	= "/img/sub_petition_title9_off.gif";
		img2.src	= "/img/sub_gapan_title4_off.gif";
		img3.src	= "/img/sub_gapan_title5_off.gif";
		img4.src	= "/img/sub_petition_title10_off.gif";

		if(Tab_Value	== "minwon")
		{
			img1.src		= "/img/sub_petition_title9_on.gif";
		}
		else if(Tab_Value	== "unyong")
		{
			img2.src		= "/img/sub_gapan_title4_on.gif";
		}
		else if(Tab_Value	== "jumin")
		{
			img3.src		= "/img/sub_petition_title3_on.gif";
		}
		else if(Tab_Value	== "jumji")
		{
			img4.src		= "/img/sub_petition_title10_on.gif";
		}

		var tab	= document.getElementById("CURRENT_TABUP");
		tab.value	= Tab_Value;
	}
	
	function 	Tab_Img(Tab_Value)
	{
		var	img2	= document.getElementById("unyong_img");
		var	img3	= document.getElementById("jumin_img");
		var	img4	= document.getElementById("jumji_img");
	
		img2.src	= "/img/sub_gapan_title4_off.gif";
		img3.src	= "/img/sub_gapan_title5_off.gif";
		img4.src	= "/img/sub_petition_title10_off.gif";
		
		if(Tab_Value	== "unyong")
		{
			img2.src		= "/img/sub_gapan_title4_on.gif";
		}
		else if(Tab_Value	== "jumin")
		{
			img3.src		= "/img/sub_gapan_title5_on.gif";
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
		var	img1	= document.getElementById("product_img");
		//var	img2	= document.getElementById("place_img");
		var img3	= document.getElementById("violation");
       	var img4	= document.getElementById("documents");
    	var img5	= document.getElementById("rental_img");


		img1.src	= "/img/rojum_cal1_title_off.gif";
		//img2.src	= "/img/sub_petition_title7_off.gif";				
		img3.src	= "/img/sub_petition_title18_off.gif";
    	img4.src	= "/img/sub_petition_title19_off.gif";
		img5.src	= "/img/gapan_cal4_title_off.gif";
		
		
		if(Tab_Value	== "product")
		{
			img1.src		= "/img/rojum_cal1_title_on.gif";
		}
		else if(Tab_Value	== "rental")
		{
			img5.src		= "/img/gapan_cal4_title_on.gif";
		}
		//else if(Tab_Value	== "place")
		//{
		//	img2.src		= "/img/sub_petition_title7_on.gif";
		//}
		else if(Tab_Value	== "history")
		{
			img3.src		= "/img/sub_petition_title8_on.gif";
		}
		else if(Tab_Value	== "violation")
		{
			img3.src		= "/img/sub_petition_title18_on.gif";
		}
        else if(Tab_Value	== "documents")
		{
			img4.src		= "/img/sub_petition_title19_on.gif";
		}
		

		var tab	= document.getElementById("CURRENT_TABDOWN");
		tab.value	= Tab_Value;

	}

	function Tab_Minwon(adminno)
	{
		var tab	= document.getElementById("CURRENT_TABUP");
		var section = document.getElementById("SECTION").value;
		
		if(tab.value	== "minwon")
			return;
		else
			tab.value	= "minwon";

		var tabs 	= document.getElementById("tabUp");
		TabUp_Img("minwon");
		tabs.src	= "/gapan/jumyonginfo/minwon_view.do?GAPAN_NO=" + adminno+"&SECTION="+section;		
	}

	function Tab_Unyong(gapanno)
	{
		var tab	= document.getElementById("CURRENT_TABUP");
		var section = document.getElementById("SECTION").value;
		
		if(tab.value	== "unyong")
			return;
		else
			tab.value	= "unyong";
		
		var tabs 	= document.getElementById("tabUp");
		tabs.src	= "/gapan/jumyonginfo/unyong_view.do?GAPAN_NO=" + gapanno+"&SECTION="+section;
	}

	function Tab_Jumin(gapanno)
	{
		var tab	= document.getElementById("CURRENT_TABUP");
		var section = document.getElementById("SECTION").value; 
		
		if(tab.value	== "jumin")
			return;
		else
			tab.value	= "jumin";
		
		var tabs 	= document.getElementById("tabUp");
		tabs.src	= "/gapan/jumyonginfo/jumin_view.do?GAPAN_NO="+gapanno+"&SECTION="+section;
	}
	
	function Tab_Jumji(gapanno)
	{
		var tab	= document.getElementById("CURRENT_TABUP");

		if(tab.value	== "jumji")
			return;
		else
			tab.value	= "jumji";

		var tabs	= document.getElementById("tabUp");
		tabs.src	= "/gapan/jumyonginfo/jumji_view.do?GAPAN_NO=" + gapanno;
	}

	function Tab_Product(gapanno)
	{		
		var tab	= document.getElementById("CURRENT_TABDOWN");
		if(tab.value	== "product")
			return;
		else
			tab.value	= "product";

		var	seq	= document.getElementById("SEQ").value;

		TabDown_Img("product");		
		var tabs	= document.getElementById("tabDown");
		tabs.src	= "/gapan/jumyong/productInsert.do?GAPAN_NO=" + gapanno + "&SEQ=" + seq;		
		
	}

	function Tab_Rental(gapanno)
	{		
		var tab	= document.getElementById("CURRENT_TABDOWN");
		if(tab.value	== "rental")
			return;
		else
			tab.value	= "rental";

		var	seq	= document.getElementById("SEQ").value;

		TabDown_Img("rental");		
		var tabs	= document.getElementById("tabDown");
		tabs.src	= "/gapan/jumyong/rentalInsert.do?GAPAN_NO=" + gapanno + "&SEQ=" + seq;		
		
	}
	
	
	function Tab_Inspect(gapanno)
	{		
		var tab	= document.getElementById("CURRENT_TABDOWN");
		if(tab.value	== "inspect")
			return;
		else
			tab.value	= "inspect";
		
		TabDown_Img("inspect");
		var tabs	= document.getElementById("tabDown");
		tabs.src	= "/jumyong/inspectEdit.do?no=" + gapanno;
	}
	
	function Tab_Conf(gapanno)
	{
		var tab	= document.getElementById("CURRENT_TABDOWN");
		
		if(tab.value	== "conf")
			return;
		else if(tab.value == null)
			tab.value	= "conf";
		
		TabDown_Img("conf");
		var tabs	= document.getElementById("tabDown");
		tabs.src	= "/jumyong/confEdit.do?no=" + gapanno;

	}

	function Tab_Place(gapanno,gpTyp)
	{		
	
		var tab	= document.getElementById("CURRENT_TABDOWN");
		if(tab.value	== "place")
			return;
		else
			tab.value	= "place";
		
		TabDown_Img("place");
		var tabs	= document.getElementById("tabDown");
		tabs.src	= "/jsp/jumyong/jumyong/info_place.jsp?no=" + gapanno+"&gp_typ="+gpTyp+"&GP_TYP="+gpTyp;
	}
	
	function Tab_History(gapanno)
	{
		var tab	= document.getElementById("CURRENT_TABDOWN");
		if(tab.value	== "history")
			return;
		else
			tab.value	= "history";
		
		TabDown_Img("history");		
		var tabs	= document.getElementById("tabDown");
		
		tabs.src	= "/jumyong/saewe/sunap_view.do?GAPAN_NO=" + gapanno;
	}

	function Tab_Violation(gapanno, gptyp)
	{		
	
		var tab	= document.getElementById("CURRENT_TABDOWN");
		if(tab.value	== "violation")
			return;
		else
			tab.value	= "violation";
		
		TabDown_Img("violation");
		var tabs	= document.getElementById("tabDown");
		tabs.src	= "/gapan/jumyong/info_violation.do?GAPAN_NO=" + gapanno + "&GP_TYP=" + gptyp;
	}

	function Tab_Documents(gapanno, gptyp)
	{		
	
		var tab	= document.getElementById("CURRENT_TABDOWN");
		if(tab.value	== "documents")
			return;
		else
			tab.value	= "documents";
		
		TabDown_Img("documents");
		var tabs	= document.getElementById("tabDown");
		tabs.src	= "/gapan/jumyong/info_documents.do?GAPAN_NO=" + gapanno + "&GP_TYP=" + gptyp;
	}

	var historyBack;
	function 	Init()
	{
		historyBack = document.referrer;
	}


	
	
	function fnPreView()
	{	
		var oRptMainParam;
		oRptMainParam = rex_GetgoDictionay(); 

		// 옵션 - viewer	
		oRptMainParam.put("rex_open_window", "center=yes,scrollbars=no,status=no,toolbar=no,resizable=0,location=no,menu=no,width=1000,height=1000");
		
		// 필수 - 레포트명
		oRptMainParam.put("rex_rptname", "Rojum_examin");

		// 필수 - 데이터 타입 설정
		oRptMainParam.put("rex_datatype", "XML");  // XML, CSV

		// 옵션 - 다른 DB를 연결시
		oRptMainParam.put("rex_userservice", "oracle_jndi");

		// 옵션 - 파라메터 설정
		var form 	= document.form;
		
		oRptMainParam.put("GAPAN_NO" ,form.GAPAN_NO.value);
		oRptMainParam.put("YEAR" ,form.year.value);
		oRptMainParam.put("SEQ" ,form.SEQ.value);
		oRptMainParam.put("USER_ID" ,form.USER_ID.value);
	
		// preview 팝업 열기
		rex_gfRexRptOpen("popup", oRptMainParam);
			
		return oRptMainParam;			
	}

	function fnPreView_pay()
	{	
		var oRptMainParam;
		oRptMainParam = rex_GetgoDictionay(); 

		// 옵션 - viewer	
		oRptMainParam.put("rex_open_window", "center=yes,scrollbars=no,status=no,toolbar=no,resizable=0,location=no,menu=no,width=1000,height=1000");
		
		// 필수 - 레포트명
		oRptMainParam.put("rex_rptname", "examination_pay");

		// 필수 - 데이터 타입 설정
		oRptMainParam.put("rex_datatype", "XML");  // XML, CSV

		// 옵션 - 다른 DB를 연결시
		oRptMainParam.put("rex_userservice", "oracle_jndi");

		// 옵션 - 파라메터 설정
		var form 	= document.form;
		var mudanForm  = tabDown.productForm.mudanForm.value;
		var mudanPrice = tabDown.productForm.mudanPrice.value;
		var mudanTotalSum = tabDown.productForm.mudanTotalSum.value;
			mudanForm = mudanForm.split('-').join("\n -");
			mudanPrice = mudanPrice.split('-').join("\n");

		oRptMainParam.put("GAPAN_NO" ,form.GAPAN_NO.value);
		oRptMainParam.put("SEQ" ,form.SEQ.value);
		oRptMainParam.put("CAL_INFO" ,mudanForm);
		oRptMainParam.put("PRICE" ,mudanPrice);
		oRptMainParam.put("TOTAL_SUM" ,mudanTotalSum);
	
		// preview 팝업 열기
		rex_gfRexRptOpen("popup", oRptMainParam);
			
		return oRptMainParam;			
	}
	
	function fnOccupancyLicense()
	{
		var oRptMainParam;
		oRptMainParam = rex_GetgoDictionay(); 

		// 옵션 - viewer	
		oRptMainParam.put("rex_open_window", "center=yes,scrollbars=no,status=no,toolbar=no,resizable=0,location=no,menu=no,width=1000,height=1000");
		
		// 필수 - 레포트명
		oRptMainParam.put("rex_rptname", "Rojum_license");

		// 필수 - 데이터 타입 설정
		oRptMainParam.put("rex_datatype", "XML");  // XML, CSV

		// 옵션 - 다른 DB를 연결시
		oRptMainParam.put("rex_userservice", "oracle_jndi");

		// 옵션 - 파라메터 설정
		var form 	= document.form;
		
		oRptMainParam.put("GAPAN_NO" ,form.GAPAN_NO.value);
		oRptMainParam.put("YEAR" ,form.year.value);
		oRptMainParam.put("SEQ" ,form.SEQ.value);
		oRptMainParam.put("GP_TYP" ,form.GP_TYP.value);

		// preview 팝업 열기
		rex_gfRexRptOpen("popup", oRptMainParam);
			
		return oRptMainParam;	
	}

	function fnRojumContract()
	{
		var oRptMainParam;
		oRptMainParam = rex_GetgoDictionay(); 

		// 옵션 - viewer	
		oRptMainParam.put("rex_open_window", "center=yes,scrollbars=no,status=no,toolbar=no,resizable=0,location=no,menu=no,width=1000,height=1000");
		
		// 필수 - 레포트명
		oRptMainParam.put("rex_rptname", "Rojum_contract");
	
		// 필수 - 데이터 타입 설정
		oRptMainParam.put("rex_datatype", "XML");  // XML, CSV

		// 옵션 - 다른 DB를 연결시
		oRptMainParam.put("rex_userservice", "oracle_jndi");

		// 옵션 - 파라메터 설정
		var form 	= document.form;
		
		oRptMainParam.put("GAPAN_NO" ,form.GAPAN_NO.value);
		oRptMainParam.put("GP_TYP" ,form.GP_TYP.value);
		oRptMainParam.put("USER_ID" ,form.USER_ID.value);
		oRptMainParam.put("GU_MANAGER" ,"김권태");
		oRptMainParam.put("SERVICE_ITEM" ,"디스,디스플러스,레종,타임");
		oRptMainParam.put("LOAN_PRICE" ,"9999999");
	
		// preview 팝업 열기
		rex_gfRexRptOpen("popup", oRptMainParam);
			
		return oRptMainParam;	
	}
	
	var i = 0;
	
	function resizeTabup(value)
	{
		if(i%2 == 0)
		iFrameResize(document.getElementById(value));	
		else
		{		
			var iFrm = document.getElementById("tabUp1");
			var the_height = 0;
			iFrm.style.height = the_height;
		}	
		i=i+1;
	}

	function PopupDisUse(){
		if(document.getElementById("DlgDisuse").style.visibility == "hidden"){
			document.getElementById("DisFrm").src="/gapan/jumyong/disUse.do?GAPAN_NO=${GAPAN_NO}&SECTION=${use_section}";
			Message_Display('DlgDisuse','DlgDisuseMain',1);
		}else{
			Message_Display('DlgDisuse','DlgDisuseMain',0);
		}
	}
	
//]]>
</script>

<body onload="Init();">
<form id="form"  name="form" method="post">


<input type="hidden" id="GAPAN_NO" name="GAPAN_NO" value="${GAPAN_NO}">
<input type=hidden id="SEQ" name="SEQ" value="${SEQ}">
<input type="hidden" id="year" name="year" value="">
<input type=hidden id="USER_ID" name=USER_ID value="${userId}">

<input type="hidden" id="CURRENT_TABUP" name="CURRENT_TABUP" value="minwon">
<input type="hidden" id="CURRENT_TABDOWN" name="CURRENT_TABDOWN" value="product">
<input type="hidden" id="TYPE" name="TYPE" value="${use_type}">
<input type="hidden" id="SECTION" name="SECTION" value="${use_section}">
<input type="hidden" id="GP_TYP" name="GP_TYP" value="001">


<span id="DlgDisuse" style="position: absolute; visibility: hidden;">
	<table id="DlgDisuseMain" width="510" height="110px" border="2" bordercolor="#c9dfed" style="border-collapse: collapse; background-color:white;" cellpadding="0" cellspacing="0" class="sub_table">
		<tr>
		<td height="20px" align="center">
		<font color="red"> '폐쇄' 또는 '폐쇄 해지' 버튼을 다시 누르시면 이 창이 닫힙니다.</font>
		
		</td>
		
		</tr>
		<tr>
			<td align="center">
			<table width="510" height="90px" border="0" style="border-collapse: collapse; background-color: white;" cellpadding="0" cellspacing="0" class="sub_table">
				<tr>
					<td align="center">
						<iframe width="100%" height="100%" id="DisFrm" name="DisFrm" align="middle" frameborder="0" onload="iFrameResize(this)" scrolling="no" ></iframe>
					</td>
				</tr>
			</table>
			</td>
		</tr>
	</table>
</span>


<table width="800" border="0" cellpadding="0" cellspacing="0">

  <tr>
    <td height="43">
    	<img src="/img/sub9_cont1_title.gif" width="800" height="43"></td>
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
      	<td align="right" class="sub_table_b">관리번호 : ${GAPAN_NO}</td>
      </tr>
      
      
      
      <tr>
        <td align="left">
        <table width="780" border="0" cellspacing="0" cellpadding="0">
        
        <tr>
            <td height="22" background="/img/tab_line_purple.gif">
            <table border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td width="111"><a href="javascript:Tab_Unyong('${GAPAN_NO}')"><img id="unyong_img" name="unyong_img" src="/img/sub_gapan_title4_off.gif" alt="운영자 정보" width="110" height="22" border="0"></a></td>
                  <td width="111"><a href="javascript:Tab_Jumin('${GAPAN_NO}')"><img id="jumin_img" name="jumin_img" src="/img/sub_gapan_title5_off.gif" alt="동업자 정보" width="110" height="22" border="0"></a></td>
                  <td width="111"><a href="javascript:Tab_Jumji('${GAPAN_NO}')"><img id="jumji_img" name="jumji_img" src="/img/sub_petition_title10_off.gif" alt="시설/운영 정보" width="110" height="22" border="0"></a></td>
                </tr>
            </table>
            </td>
		</tr>
	  <tr>
		<td>
		  	<iframe width="100%" height="100%" id="tabUp" name="tabUp" frameborder="0" onload="iFrameResize(this)" scrolling="no" src="/gapan/jumyonginfo/unyong_view.do?GAPAN_NO=${GAPAN_NO}&SECTION=${use_section}"></iframe>
		</td>
	  </tr>
      <tr>
        <td height="30"></td>
      </tr>

      <tr>
        <td align="left">
        <table width="780" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td height="22" background="/img/tab_line_blue.gif">
            <table border="0" cellspacing="0" cellpadding="0">
                <tr>
				  <c:choose>
				  <c:when test="${CAL_MODE == 'cal4'}">
					<td width="111" onclick ="javascript:Tab_Product('${GAPAN_NO}')"><img id="product_img" name="product_img" src="/img/rojum_cal1_title_off.gif" alt="점용료 산출내역" width="110" height="22" border="0" style="cursor:pointer" ></td>
					<td width="111" onclick ="javascript:Tab_Rental('${GAPAN_NO}')"><img id="rental_img" name="rental_img" src="/img/gapan_cal4_title_on.gif" alt="임대료 산출내역" width="110" height="22" border="0" style="cursor:pointer" ></td>
				  </c:when>
				  <c:otherwise>
					<td width="111" onclick ="javascript:Tab_Product('${GAPAN_NO}')"><img id="product_img" name="product_img" src="/img/rojum_cal1_title_on.gif" alt="점용료 산출내역" width="110" height="22" border="0" style="cursor:pointer" ></td>
					<td width="111" onclick ="javascript:Tab_Rental('${GAPAN_NO}')"><img id="rental_img" name="rental_img" src="/img/gapan_cal4_title_off.gif" alt="임대료 산출내역" width="110" height="22" border="0" style="cursor:pointer" ></td>
				  </c:otherwise>
				  </c:choose>
<!--		          <td width="111" onclick ="javascript:Tab_Place('${GAPAN_NO}','001')"><img id="place_img"  name="place_img" src="/img/sub_petition_title7_off.gif" alt="첨부자료" width="110" height="22" border="0" style="cursor:pointer" ></td>-->
		          <td width="111" onclick ="javascript:Tab_Violation('${GAPAN_NO}','001')"><img id="violation"  name="violation" src="/img/sub_petition_title18_off.gif" alt="위반조치내역" width="110" height="22" border="0" style="cursor:pointer" ></td>
		          <td width="111" onclick ="javascript:Tab_Documents('${GAPAN_NO}','001')"><img id="documents"  name="documents" src="/img/sub_petition_title19_off.gif" alt="증서 발급" width="110" height="22" border="0" style="cursor:pointer" ></td>
                </tr>
            </table>
            </td>
          </tr>		  
          <tr>
  			<td>
  				<c:choose>
  				<c:when test="${CAL_MODE == 'cal4'}">
  					<iframe width="100%" id = "tabDown" name="tabDown" frameborder="0" onload="iFrameResize(this);" scrolling="no" src="/gapan/jumyong/rentalInsert.do?GAPAN_NO=${GAPAN_NO}&SECTION=${use_section}"></iframe>
  				</c:when>
  				<c:otherwise>
	  				<iframe width="100%" id = "tabDown" name="tabDown" frameborder="0" onload="iFrameResize(this);" scrolling="no" src="/gapan/jumyong/productInsert.do?GAPAN_NO=${GAPAN_NO}&SECTION=${use_section}"></iframe>
  				</c:otherwise>
  				</c:choose>
  				
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
			<c:if test="${ use_section == 1 }"> 	
				<img src="/img/popup_disuse.gif" alt="폐쇄처리" id="disuse_img"  border="0" onclick="javascript:PopupDisUse();" style="cursor:pointer">
		  </c:if>
		  <c:if test="${ use_section == 4 }"> 	
				<img src="/img/popup_undisuse.gif" alt="폐쇄해지" id="disuse_img"  border="0" onclick="javascript:PopupDisUse();" style="cursor:pointer">
		  </c:if>
			<c:if test="${showExamination == 'true'}"> 								                	
				<img src="/img/produ_icon.gif" alt="산출조사서" width="84" height="22" border="0" onclick="javascript:fnPreView();" style="cursor:pointer">
			</c:if>
				<img src="/img/occu_icon.gif" alt="점용허가증" width="84" height="22" onclick="javascript:fnOccupancyLicense();"  border="0" style="cursor:pointer">
	      <img src="/img/list_icon.gif" alt="리스트" width="66" height="22" border="0" onclick="document.location.href = historyBack;" style="cursor:pointer" >
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