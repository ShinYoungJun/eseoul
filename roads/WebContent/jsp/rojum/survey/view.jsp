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
//		var	img2	= document.getElementById("noPermission_img");
//		var	img3	= document.getElementById("penalty_img");
//		var	img4	= document.getElementById("sale_img");
		//var	img5	= document.getElementById("place_img");
		//var img6	= document.getElementById("violation");


		img1.src	= "/img/rojum_cal1_title_off.gif";
//		img2.src	= "/img/rojum_cal2_title_off.gif";
//		img3.src	= "/img/rojum_cal3_title_off.gif";
//		img4.src	= "/img/rojum_cal4_title_off.gif";
		//img5.src	= "/img/sub_petition_title7_off.gif";				
		//img6.src	= "/img/sub_petition_title18_off.gif";

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
		var section = document.getElementById("SECTION").value;
		
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
		tabs.src	= "/rojum/jumyong/rojumCal1.do?GAPAN_NO=" + gapanno + "&SEQ=" + seq+"&TAX_SET1=${TAX_SET1}";		
		
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
		tabs.src	= "/rojum/jumyong/rojumCal2.do?GAPAN_NO=" + gapanno + "&SEQ=" + seq;		
		
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
	
	function Tab_Violation(gapanno)
	{		
	
		var tab	= document.getElementById("CURRENT_TABDOWN");
		if(tab.value	== "violation")
			return;
		else
			tab.value	= "violation";
		
		TabDown_Img("violation");
		var tabs	= document.getElementById("tabDown");
		tabs.src	= "/rojum/jumyong/info_violation.do?GAPAN_NO=" + gapanno;
	}

	function Tab_Documents(gapanno)
	{		
	
		var tab	= document.getElementById("CURRENT_TABDOWN");
		if(tab.value	== "documents")
			return;
		else
			tab.value	= "documents";
		
		TabDown_Img("documents");
		var tabs	= document.getElementById("tabDown");
		tabs.src	= "/rojum/jumyong/info_documents.do?GAPAN_NO=" + gapanno;
	}
	
	function 	Init()
	{

		if('${cal_mode}' == 'cal1'){
			document.getElementById("tabDown").src="/rojum/jumyong/rojumCal1.do?GAPAN_NO=${ADMIN_NO}&SECTION=${use_section}&TAX_SET1=${TAX_SET1}";		
		}

//		else if('${cal_mode}' == 'cal4'){
//			TabDown_Img("product_sale");
//			document.getElementById("tabDown").src="/rojum/jumyong/rojumSale.do?GAPAN_NO=${ADMIN_NO}&SECTION=${use_section}";
//		}

		TabUp_Img("jumji");
		document.getElementById("tabUp").src= "/rojum/jumyonginfo/jumji_view.do?GAPAN_NO=${ADMIN_NO}";

	}
	
	function goSearch()
	{
		var section = document.getElementById("SECTION").value;
		var tax_set = document.getElementById("TAX_SET").value;
		var bj_cd = document.getElementById("BJ_CD").value;
		var bonbun = document.getElementById("BONBUN").value;
		var bubun = document.getElementById("BUBUN").value;
		var jumyongName = document.getElementById("jumyongName").value;
		var numberValue = document.getElementById("numberValue").value;
		var taxtation_at = document.getElementById("taxtation_at").value;
		var fromDate = document.getElementById("fromDate").value;
		var toDate = document.getElementById("toDate").value;
		var maintn_ob = document.getElementById("MAINTN_OB").value;

		location.href="/rojum/accept/search.do?tax_set="+tax_set+"&bj_cd="+bj_cd+"&bonbun="+bonbun+"&bubun="+bubun
		+"&jumyongName="+jumyongName+"&numberValue="+numberValue+"&taxtation_at="+taxtation_at
		+"&fromDate="+fromDate+"&toDate="+toDate+"&maintn_ob="+maintn_ob+"&section="+section;
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
		
		oRptMainParam.put("GAPAN_NO" ,form.ADMIN_NO.value);
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

		oRptMainParam.put("ADMIN_NO" ,form.ADMIN_NO.value);
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
		
		oRptMainParam.put("GAPAN_NO" ,form.ADMIN_NO.value);
		oRptMainParam.put("YEAR" ,form.year.value);
		oRptMainParam.put("SEQ" ,form.SEQ.value);
		oRptMainParam.put("GP_TYP" ,'002');

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
		
		oRptMainParam.put("GAPAN_NO" ,form.ADMIN_NO.value);
		oRptMainParam.put("GP_TYP" ,'002');
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
			document.getElementById("DisFrm").src="/rojum/jumyong/disUse.do?ADMIN_NO=${ADMIN_NO}&SECTION=${use_section}";
			Message_Display('DlgDisuse','DlgDisuseMain',1);
		}else{
			Message_Display('DlgDisuse','DlgDisuseMain',0);
		}
	}
	
//]]>
--></script>

<body onload="Init();">
<form name="form" method="post">
<input type="hidden" name="ADMIN_NO" value="${ADMIN_NO}">
<input type=hidden name="SEQ" id="seq" value="${SEQ}">
<input type=hidden name=USER_ID id="USER_ID" value="${userId}">

<input type="hidden" name="CURRENT_TABUP" value="minwon">
<input type="hidden" name="CURRENT_TABDOWN" id="CURRENT_TABDOWN" value="product">
<input type="hidden" name="year" id="year" value="">


<input name="SECTION" id="SECTION" value="${section}" type="hidden"> 
<input name="TAX_SET" id="TAX_SET" value="${tax_set}" type="hidden"> 
<input name="BJ_CD" id="BJ_CD" value="${SearchBean.BJ_CD}" type="hidden"> 
<input name="BONBUN" id="BONBUN" value="${bonbun}" type="hidden"> 
<input name="BUBUN" id="BUBUN" value="${bubun}" type="hidden"> 
<input name="jumyongName" id="jumyongName" value="${jumyongName}" type="hidden"> 
<input name="numberValue" id="numberValue" value="${numberValue}" type="hidden"> 
<input name="taxtation_at" id="taxtation_at" value="${SearchBean.TAXTAXION_AT}" type="hidden">
<input name="fromDate" id="fromDate" value="${fromDate}" type="hidden">
<input name="toDate" id="toDate" value="${toDate}" type="hidden">
<input name="MAINTN_OB" id="MAINTN_OB" value="${SearchBean.MAINTN_OB}" type="hidden">


<span id="DlgDisuse" style="position: absolute; visibility: hidden;">
	<table id="DlgDisuseMain" width="510" height="110px" border="2" bordercolor="#c9dfed" style="border-collapse: collapse; background-color:white;" cellpadding="0" cellspacing="0" class="sub_table">
		<tr>
		<td height="20px" align="center">
		<font color="red"> 닫으실려면 폐쇄버튼을 다시 눌러주세요.</font>
		
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
      	<td align="right" class="sub_table_b">관리번호 : ${ADMIN_NO}</td>
      
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
		  	<iframe width="100%" height="100%" id="tabUp" name="tabUp" frameborder="0" onload="iFrameResize(this)" scrolling="no" src="/rojum/jumyonginfo/unyong_view.do?GAPAN_NO=${ADMIN_NO}&SECTION=${use_section}"></iframe>
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
                	<td width="111" onclick ="javascript:Tab_Product('${ADMIN_NO}')"><img id="product_img" name="product_img" src="/img/rojum_cal1_title_on.gif" alt="점용료 산출내역" width="110" height="22" border="0" style="cursor:pointer" ></td>
                 <!--
                  <c:choose>
	                  <c:when test="${tax_at == '1'}">
	                  	<td width="111" onclick ="javascript:Tab_Product('${ADMIN_NO}')"><img id="product_img" name="product_img" src="/img/rojum_cal1_title_on.gif" alt="점용료 산출내역" width="110" height="22" border="0" style="cursor:pointer" ></td>
	                  </c:when>
	                  <c:otherwise>
	                  <td width="111" onclick ="alert('점용료 대상이 아닙니다.');"><img id="product_img" name="product_img" src="/img/rojum_cal1_title_on.gif" alt="점용료 산출내역" width="110" height="22" border="0" style="cursor:pointer" ></td>
	                  </c:otherwise>
                  </c:choose>
                 
                  <td width="111" onclick ="javascript:Tab_Product_noPermission('${ADMIN_NO}')"><img id="noPermission_img" name="noPermission_img" src="/img/rojum_cal2_title_on.gif" alt="변상금 산출내역" width="110" height="22" border="0" style="cursor:pointer" ></td>
                  <td width="111" onclick ="javascript:Tab_Product_penalty('${ADMIN_NO}')"><img id="penalty_img" name="penalty_img" src="/img/rojum_cal3_title_off.gif" alt="과태료 산출내역" width="110" height="22" border="0" style="cursor:pointer" ></td>
                  <c:choose>
	                  <c:when test="${tax_at == '1'}">
	                  	<td width="111" onclick ="alert('폐기/매각 대상이 아닙니다.')"><img id="sale_img" name="sale_img" src="/img/rojum_cal4_title_off.gif" alt="폐기/매각 내역" width="110" height="22" border="0" style="cursor:pointer" ></td>
	                  </c:when>
	                  <c:otherwise>
	                  <td width="111" onclick ="javascript:Tab_Product_sale('${ADMIN_NO}')"><img id="sale_img" name="sale_img" src="/img/rojum_cal4_title_off.gif" alt="폐기/매각 내역" width="110" height="22" border="0" style="cursor:pointer" ></td>
	                  </c:otherwise>
                  </c:choose>
                                
		          <td width="111" onclick ="javascript:Tab_Place('${ADMIN_NO}')"><img id="place_img"  name="place_img" src="/img/sub_petition_title7_off.gif" alt="첨부자료" width="110" height="22" border="0" style="cursor:pointer" ></td>
--><!--		          <td width="111" onclick ="javascript:Tab_Violation('${ADMIN_NO}')"><img id="violation"  name="violation" src="/img/sub_petition_title18_off.gif" alt="위반조치내역" width="110" height="22" border="0" style="cursor:pointer" ></td>-->
		          </tr>
            </table></td>
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