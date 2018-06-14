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
<script language="javascript" src="/jsp/RexServer/rexscript/rexpert.js"></script>
<script language="javascript" src="/jsp/RexServer/rexscript/rexpert_properties.js"></script>

<script type="text/javascript">

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
		var	img1	= document.getElementById("product_img");
		var	img2	= document.getElementById("noPermission_img");
		var	img3	= document.getElementById("penalty_img");
		var	img4	= document.getElementById("sale_img");


		img1.src	= "/img/rojum_cal1_title_off.gif";
		img2.src	= "/img/rojum_cal2_title_off.gif";
		img3.src	= "/img/rojum_cal3_title_off.gif";
		img4.src	= "/img/rojum_cal4_title_off.gif";

		if(Tab_Value	== "product")
		{
			img1.src		= "/img/rojum_cal1_title_on.gif";
		}
		if(Tab_Value	== "product_noPermission")
		{
			img2.src		= "/img/rojum_cal2_title_on.gif";
		}
		if(Tab_Value	== "product_penalty")
		{
			img3.src		= "/img/rojum_cal3_title_on.gif";
		}
		if(Tab_Value	== "product_sale")
		{
			img4.src		= "/img/rojum_cal4_title_on.gif";
		}


		var tab	= document.getElementById("CURRENT_TABDOWN");
		tab.value	= Tab_Value;

	}

	function Tab_Unyong(gapanno)
	{
		var tab	= document.getElementById("CURRENT_TABUP");
		var section = '${use_section}';
		
		if(tab.value	== "unyong")
			return;
		else
			tab.value	= "unyong";
		
		var tabs 	= document.getElementById("tabUp");
		tabs.src	= "/rojum/jumyonginfo/unyong_view.do?GAPAN_NO=" + gapanno+"&SECTION="+section;
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
		tabs.src	= "/rojum/jumyong/rojumCal1.do?GAPAN_NO=" + gapanno + "&SEQ=" + seq;		
		
	}


	function Tab_Product_noPermission(gapanno)
	{		
		var tab	= document.getElementById("CURRENT_TABDOWN");
		if(tab.value	== "product_noPermission")
			return;
		else
			tab.value	= "product_noPermission";

		var	seq	= document.getElementById("SEQ").value;
		
		 
		
		TabDown_Img("product_noPermission");		
		var tabs	= document.getElementById("tabDown");
		//tabs.src	= "/rojum/jumyong/rojumCal2.do?GAPAN_NO=" + gapanno + "&SEQ=" + seq + "&YEAR=" + tabDown.document.getElementById("YEAR").value + "&PRICE="+ tabDown.document.getElementById("PRICE").value +"&AREA_AFTER="+ tabDown.document.getElementById("AREA_AFTER").value +"&RATE="+ tabDown.document.getElementById("RATE").value +"&FROMDATE="+ tabDown.document.getElementById("FROMDATE").value+"&TODATE=" + tabDown.document.getElementById("TODATE").value +"&PERIOD="+tabDown.document.getElementById("PERIOD").value +"&REDUCTION_REASON="+tabDown.document.getElementById("REDUCTION_REASON").value +"&REDUCTION_RATE="+tabDown.document.getElementById("REDUCTION_RATE").value+"&ADJUSTMENT="+tabDown.document.getElementById("ADJUSTMENT").value+"&SUM_ADJUST="+tabDown.document.getElementById("SUM_ADJUST").value+"&SUM_YEAR="+tabDown.document.getElementById("SUM_YEAR").value;		
		tabs.src	= "/rojum/jumyong/rojumCal2.do?GAPAN_NO=" + gapanno + "&SEQ=" + seq +"&SUM_ADJUST="+tabDown.document.getElementById("SUM_YEAR").value;
		
	}
	function Tab_Product_penalty(gapanno)
	{		
		var tab	= document.getElementById("CURRENT_TABDOWN");
		if(tab.value	== "product_penalty")
			return;
		else
			tab.value	= "product_penalty";

		var	seq	= document.getElementById("SEQ").value;

		TabDown_Img("product_penalty");		
		var tabs	= document.getElementById("tabDown");
		tabs.src	= "/rojum/jumyong/rojumCal3.do?GAPAN_NO=" + gapanno + "&SEQ=" + seq;		
		
	}
	function Tab_Product_sale(gapanno)
	{		
		var tab	= document.getElementById("CURRENT_TABDOWN");
		if(tab.value	== "product_sale")
			return;
		else
			tab.value	= "product_sale";

		var	seq	= document.getElementById("SEQ").value;

		TabDown_Img("product_sale");		
		var tabs	= document.getElementById("tabDown");
		tabs.src	= "/rojum/jumyong/rojumSale.do?GAPAN_NO=" + gapanno + "&SEQ=" + seq;		
		
	}
	
	function 	Init()
	{
		if('${cal_mode}' == 'cal1'){
			TabDown_Img("product");	
			document.getElementById("tabDown").src="/rojum/jumyong/rojumCal1.do?GAPAN_NO=${GAPAN_NO}&SECTION=${use_section}";
		}
		if('${cal_mode}' == 'cal2'){
			TabDown_Img("product_noPermission");	
			document.getElementById("tabDown").src="/rojum/jumyong/rojumCal2.do?GAPAN_NO=${GAPAN_NO}&SECTION=${use_section}";
		}else if('${cal_mode}' == 'cal3'){
			TabDown_Img("product_penalty");
			document.getElementById("tabDown").src="/rojum/jumyong/rojumCal3.do?GAPAN_NO=${GAPAN_NO}&SECTION=${use_section}";
		}else if('${cal_mode}' == 'cal4'){
			TabDown_Img("product_sale");
			document.getElementById("tabDown").src="/rojum/jumyong/rojumSale.do?GAPAN_NO=${GAPAN_NO}&SECTION=${use_section}";
		}

		TabUp_Img("jumji");
		document.getElementById("tabUp").src= "/rojum/jumyonginfo/jumji_view.do?GAPAN_NO=${GAPAN_NO}";

	}
	
	function goSearch()
	{
		var section = document.getElementById("section").value;
		var bj_cd = document.getElementById("bj_cd").value;
		var jumyongName = document.getElementById("jumyongName").value;
		var bonbun = document.getElementById("bonbun").value;
		var bubun = document.getElementById("bubun").value;
		var numberValue = document.getElementById("numberValue").value;
		var taxtation_at = document.getElementById("taxtation_at").value;
		var maintn_ob = document.getElementById("maintn_ob").value;
		var gu_cd = document.getElementById("gu_cd").value;
		var mg_typ = document.getElementById("mg_typ").value;
		var fromDate = document.getElementById("fromDate").value;
		var toDate = document.getElementById("toDate").value;
		

		location.href="/rojum/jumyong/search.do?gu_cd="+gu_cd+"&bj_cd="+bj_cd+"&bonbun="+bonbun+"&bubun="+bubun
		+"&jumyongName="+jumyongName+"&numberValue="+numberValue
		+"&fromDate="+fromDate+"&toDate="+toDate+"&maintn_ob="+maintn_ob+"&section="+section+"&mg_typ="+mg_typ;
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
	
</script>

<body onload="Init();">
<form id="form" name="form" method="post">
<input type="hidden" id="GAPAN_NO" name="GAPAN_NO" value="${GAPAN_NO}">
<input type=hidden id="SEQ" name="SEQ" value="${SEQ}">
<input type=hidden id="USER_ID" name=USER_ID value="${userId}">

<input type="hidden" id="CURRENT_TABUP" name="CURRENT_TABUP" value="minwon">
<input type="hidden" id="CURRENT_TABDOWN" name="CURRENT_TABDOWN" value="product">
<input type="hidden" id="year" name="year" value="">


<input type="hidden" id="section" name="section" value="${section}" >
<input type="hidden" id="bj_cd" name="bj_cd" value="${bj_cd}" >
<input type="hidden" id="jumyongName" name="jumyongName" value="${jumyongName}" >
<input type="hidden" id="bonbun" name="bonbun" value="${bonbun}" >
<input type="hidden" id="bubun" name="bubun" value="${bubun}" >
<input type="hidden" id="numberValue" name="numberValue" value="${numberValue}" >
<input type="hidden" id="taxtation_at" name="taxtation_at" value="${taxtation_at}" >
<input type="hidden" id="maintn_ob" name="maintn_ob" value="${maintn_ob}" >
<input type="hidden" id="gu_cd" name="gu_cd" value="${gu_cd}" >
<input type="hidden" id="mg_typ" name="mg_typ" value="${mg_typ}" >
<input type="hidden" id="toDate" name="toDate" value="${toDate}" >
<input type="hidden" id="fromDate" name="fromDate" value="${fromDate}" >

<table width="800" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td height="43"><img src="/img/sub7_cont1_title.gif" width="800" height="43"></td>
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
                  <td width="111"><a href="javascript:Tab_Jumji('${GAPAN_NO}')"><img id="jumji_img" name="jumji_img" src="/img/sub_petition_title10_off.gif" alt="시설/운영 정보" width="110" height="22" border="0"></a></td>
                  <td width="111"><a href="javascript:Tab_Unyong('${GAPAN_NO}')"><img id="unyong_img" name="unyong_img" src="/img/sub_gapan_title4_off.gif" alt="운영자 정보" width="110" height="22" border="0"></a></td>
                </tr>
            </table>
            </td>
		</tr>
	  <tr>
		<td>
		  	<iframe width="100%" height="100%" id="tabUp" name="tabUp" frameborder="0" onload="iFrameResize(this)" scrolling="no" src="/rojum/jumyonginfo/unyong_view.do?GAPAN_NO=${GAPAN_NO}&SECTION=${use_section}"></iframe>
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
                  
	              <td width="111" onclick ="javascript:Tab_Product('${GAPAN_NO}')"><img id="product_img" name="product_img" src="/img/rojum_cal1_title_on.gif" alt="점용료 산출내역" width="110" height="22" border="0" style="cursor:pointer" ></td>
                  <td width="111" onclick ="javascript:Tab_Product_noPermission('${GAPAN_NO}')"><img id="noPermission_img" name="noPermission_img" src="/img/rojum_cal2_title_on.gif" alt="변상금 산출내역" width="110" height="22" border="0" style="cursor:pointer" ></td>
                  <td width="111" onclick ="javascript:Tab_Product_penalty('${GAPAN_NO}')"><img id="penalty_img" name="penalty_img" src="/img/rojum_cal3_title_off.gif" alt="과태료 산출내역" width="110" height="22" border="0" style="cursor:pointer" ></td>
	              <td width="111" onclick ="javascript:Tab_Product_sale('${GAPAN_NO}')"><img id="sale_img" name="sale_img" src="/img/rojum_cal4_title_off.gif" alt="폐기/매각 내역" width="110" height="22" border="0" style="cursor:pointer" ></td>
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
      <td height="40" align="right">

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
</form>
</body>
</html>