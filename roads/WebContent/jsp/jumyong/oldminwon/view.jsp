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
           
           
    function iFrameResize(obj)
	{
		var iFrm = obj;
		var the_height = iFrm.contentWindow.document.body.scrollHeight;
		iFrm.style.height = the_height + "px";
	}
    
    
	function	Page(page)
	{
		if(page	==	"")
			return;
		
		var form = document.form;

		form.currentPage.value	= page;

		form.action = "view.do";
		form.submit();
	}
	
	function View(SERIAL_NBR, GU_CODE, ILKWAL_NBR, YY)
	{
		//var form = document.form;
		
		//form.action = "sangse_view.do?SERIAL_NBR=" + SERIAL_NBR + "&GU_CODE=" + GU_CODE + "&ILKWAL_NBR=" + ILKWAL_NBR + "&YY=" + YY;
		//form.submit();
		var	param	= "SERIAL_NBR=" + SERIAL_NBR + "&GU_CODE=" + GU_CODE + "&ILKWAL_NBR=" + ILKWAL_NBR + "&YY=" + YY;

		sendRequest("/jumyong/oldminwon/sangse_view.do", param, "GET", Result_SangseView);
	}
	
	function	Result_SangseView(obj)
	{
		if(obj != null)
		{
	        var xmldoc 	= new ActiveXObject("Microsoft.XMLDOM");
	        var form 	= document.form;
			
	        xmldoc.async	= false;
			xmldoc.loadXML(obj);
	
			var YY = xmldoc.getElementsByTagName("YY").item(0).text;
			var GUBUN = xmldoc.getElementsByTagName("GUBUN").item(0).text;
			var HEOGA = xmldoc.getElementsByTagName("HEOGA").item(0).text;
			var SEGUBUN = xmldoc.getElementsByTagName("SEGUBUN").item(0).text;
			var HF_DATE = xmldoc.getElementsByTagName("HF_DATE").item(0).text;
			
			var HL_DATE = xmldoc.getElementsByTagName("HL_DATE").item(0).text;
			var JUN_JUMACK = xmldoc.getElementsByTagName("JUN_JUMACK").item(0).text;
			var CUR_JUMACK = xmldoc.getElementsByTagName("CUR_JUMACK").item(0).text;
			var SANCHUL1 = xmldoc.getElementsByTagName("SANCHUL1").item(0).text;
			var SANCHUL2 = xmldoc.getElementsByTagName("SANCHUL2").item(0).text;
			
			var BUKWA_NBR = xmldoc.getElementsByTagName("BUKWA_NBR").item(0).text;
			var BUKWA_AMT = xmldoc.getElementsByTagName("BUKWA_AMT").item(0).text;
			var BUKWA_DATE = xmldoc.getElementsByTagName("BUKWA_DATE").item(0).text;
			var ACC = xmldoc.getElementsByTagName("ACC").item(0).text;
			var MOK = xmldoc.getElementsByTagName("MOK").item(0).text;
			
			var SEMOK = xmldoc.getElementsByTagName("SEMOK").item(0).text;
			
			var sangse_view_title = document.getElementById("sangse_view_title");
				sangse_view_title.style.display = "block";
			var sangse_view = document.getElementById("sangse_view");
				sangse_view.style.display = "block";
			
			document.getElementById("SANGSE_YY").innerHTML = YY;
			document.getElementById("SANGSE_GUBUN").innerHTML = GUBUN;
			document.getElementById("SANGSE_HEOGA").innerHTML = HEOGA;
			document.getElementById("SANGSE_SEGUBUN").innerHTML = SEGUBUN;
			document.getElementById("SANGSE_HF_DATE").innerHTML = HF_DATE;
			document.getElementById("SANGSE_HL_DATE").innerHTML = HL_DATE;
			document.getElementById("SANGSE_JUN_JUMACK").innerHTML = JUN_JUMACK;
			document.getElementById("SANGSE_CUR_JUMACK").innerHTML = CUR_JUMACK;
			document.getElementById("SANGSE_SANCHUL1").innerHTML = SANCHUL1;
			document.getElementById("SANGSE_SANCHUL2").innerHTML = SANCHUL2;
			document.getElementById("SANGSE_BUKWA_NBR").innerHTML = BUKWA_NBR;
			document.getElementById("SANGSE_BUKWA_AMT").innerHTML = BUKWA_AMT;
			document.getElementById("SANGSE_BUKWA_DATE").innerHTML = BUKWA_DATE;
			document.getElementById("SANGSE_ACC_MOK_SEMOK").innerHTML = ACC+MOK+SEMOK;
		}
		else
		{
			var sangse_view_title = document.getElementById("sangse_view_title");
				sangse_view_title.style.display = "none";
			var sangse_view = document.getElementById("sangse_view");
				sangse_view.style.display = "none";
		}
	}
//]]>
</script>

<body>
<form id="form" name="form" method="post">
	<input type="hidden" id="currentPage" name="currentPage" value="${currentPage}">
	<input type="hidden" id="SERIAL_NBR" name="SERIAL_NBR" value="${SERIAL_NBR}">
	<input type="hidden" id="GU_CODE" name="GU_CODE" value="${GU_CODE}">
	<input type="hidden" id="ILKWAL_NBR" name="ILKWAL_NBR" value="${ILKWAL_NBR}">
	<input type="hidden" id="YY" name="YY" value="${YY}">

<table width="800" border="0" cellpadding="0" cellspacing="0">
	<tr>
    	<td height="43"><img src="/img/sub1_petition_title.gif" width="800" height="43"></td>
  	</tr>

	<tr>
		<td height="1" bgcolor="eaeaea"></td>
	</tr>
 
	<tr>
        <td height="14"></td>
	</tr>    
    <tr>
        <td height="22" background="/img/tab_line_purple.gif">
        <table border="0" cellspacing="0" cellpadding="0">
            <tr>
              <td width="111"><a href="javascript:Tab_Sanchul('${ADMIN_NO}')"><img id="sanchul_img" name="sanchul_img" src="/img/sub_petition_title17_on.gif" alt="점용기본 정보" width="110" height="22" border="0"></a></td>
            </tr>
        </table>
        </td>
	</tr>
     <tr>
		<td align="left" class="contborder_purple">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>
			<td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
				<tr>
				  <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">관리번호</td>
				  <td width="37%" bgcolor="eaeaea" class="table_bl_left">${apjy20mr1Bean.SERIAL_NBR}</td>
				  <td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">점용인/법인명</td>
				  <td width="36%" bgcolor="eaeaea" class="table_bl_left">${apjy20mr1Bean.JUMNM}</td>
				</tr>
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">주민/법인번호</td>
				  <td bgcolor="eaeaea" class="table_bl_left" id="ssn">
				  	<script type="text/javascript">
								var ssn = "${apjy20mr1Bean.ID_NO}";
								var ssnAsterisk = ssn.substring(7).replace(/./g, '*');
								document.getElementById("ssn").innerHTML = ssn.substring(0, 7) + ssnAsterisk;
							</script>
				  </td>
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">주소</td>
				  <td bgcolor="eaeaea" class="table_bl_left">(${apjy20mr1Bean.POST1}-${apjy20mr1Bean.POST2}) ${zipBean.SI_NM} ${zipBean.SGG_NM} ${zipBean.EMD_NM} ${zipBean.RI_NM} 
				  											  ${zipBean.ISLAND_NM} ${zipBean.LNDN_CM} ${zipBean.BD_NM} ${apjy20mr1Bean.JUMADDR}</td>
				</tr>
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">전화번호</td>
				  <td bgcolor="eaeaea" class="table_bl_left">${apjy20mr1Bean.JUMTEL}</td>
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">지목</td>
				  <td bgcolor="eaeaea" class="table_bl_left">
				  	<c:if test="${apjy20mr1Bean.JIMOK == '1'}">도로</c:if>
				  	<c:if test="${apjy20mr1Bean.JIMOK == '2'}">하천</c:if>
				  	<c:if test="${apjy20mr1Bean.JIMOK == '3'}">구분</c:if>
				  </td>
				</tr>
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용목적</td>
				  <td bgcolor="eaeaea" class="table_bl_left">(${apjy20mr1Bean.JUMMOK}) ${apjy20mr1Bean.JUMMOK_NAME}</td>
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">소재지</td>
				  <td bgcolor="eaeaea" class="table_bl_left">
				  	(${apjy20mr1Bean.JIBUN}) ${bjdong_code} (${hjdong_code}) <c:if test="${apjy20mr1Bean.SAN == '1'}">산</c:if> ${apjy20mr1Bean.BUN} - ${apjy20mr1Bean.JI}
				  </td>
				</tr>
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">면적</td>
				  <td bgcolor="eaeaea" class="table_bl_left">${apjy20mr1Bean.JUMDAN}</td>
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">소유자</td>
				  <td bgcolor="eaeaea" class="table_bl_left">
				  	<c:if test="${apjy20mr1Bean.SOYU == '1'}">국유지</c:if>
				  	<c:if test="${apjy20mr1Bean.SOYU == '2'}">시유지</c:if>
				  	<c:if test="${apjy20mr1Bean.SOYU == '3'}">구유지</c:if>
				  	<c:if test="${apjy20mr1Bean.SOYU == '4'}">사유지</c:if>
				  	<c:if test="${apjy20mr1Bean.SOYU == '5'}">기타</c:if>
				  </td>
				</tr>
				
				<tr style="display:block" id="UseType1">
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">허가구분 </td>
				  <td bgcolor="eaeaea" class="table_bl_left">
				  	<c:if test="${apjy20mr1Bean.HEOGA == '1'}">허가</c:if>
				  	<c:if test="${apjy20mr1Bean.HEOGA == '2'}">직권</c:if>
				  	<c:if test="${apjy20mr1Bean.HEOGA == '3'}">폐쇄</c:if>
				  </td>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">허가번호</td>
				  <td bgcolor="eaeaea" class="table_bl_left">${apjy20mr1Bean.HEO_NBR}</td>
				</tr>
				
				<tr style="display:block" id="UseType2">
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">점용시작일</td>
				  <td bgcolor="eaeaea" class="table_bl_left">${apjy20mr1Bean.HF_DATE}</td>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용종료일</td>
				  <td bgcolor="eaeaea" class="table_bl_left">${apjy20mr1Bean.HL_DATE}</td>
				</tr>
				
				<tr style="display:block" id="UseType2">
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">산정요율</td>
				  <td bgcolor="eaeaea" class="table_bl_left">${apjy20mr1Bean.JUMYO}</td>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">공시지가(단가)</td>
				  <td bgcolor="eaeaea" class="table_bl_left">${apjy20mr1Bean.GSAMT}</td>
				</tr>
			
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">참고사항</td>
				  <td colspan="3" bgcolor="eaeaea" class="table_bl_left">${apjy20mr1Bean.REMARKS}</td>
			    </tr>
				
			</table></td>
		  </tr>

		</table></td>
	</tr>
	<tr>
        <td height="14"></td>
	</tr>
	
	
	<tr>
		<td>
			<iframe width="100%" height="100%" id="tabCenter" name="tabCenter" frameborder="0" onload="iFrameResize(this)" scrolling="no" src="/jumyong/oldminwon/get_history_list.do?SERIAL_NBR=${SERIAL_NBR}&GU_CODE=${GU_CODE}"></iframe>
		</td>
	</tr>

	<tr>
		<td height="14"></td>
	</tr>
    
    <tr>
        <td height="1" bgcolor="#EAEAEA"></td>
    </tr>
    <tr>
        <td height="34" class="sub_stan">전체건수 : <span class="sub_stan_blue">${listCount}</span>건 </td>
    </tr>
    <tr>
        <td>
        	<table width="780" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
      	      <tr>
                <td height="35" align="center" bgcolor="e5eff8" class="sub_table_b" width="50" nowrap="nowrap">년도</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b" width="50" nowrap="nowrap">부과<br/>구분</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b" width="70" nowrap="nowrap">부과번호</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b" width="50" nowrap="nowrap">허가<br/>구분</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">납세자명</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b" width="60" nowrap="nowrap">점용<br/>면적</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b" width="80" nowrap="nowrap">부과금액</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b" width="100" nowrap="nowrap">부과일</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b" width="100" nowrap="nowrap">산출점용시작일</td>
                <td align="center" bgcolor="e5eff8" class="sub_table_b" width="100" nowrap="nowrap">산출점용끝일</td>
              </tr>
			<c:choose>
			  	<c:when test='${blist != null && !empty blist}'>
              		<c:forEach items="${blist}" var="board" varStatus="idx">
	                      <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" style="cursor:pointer" onClick="javascript:View('${SERIAL_NBR}','${GU_CODE}','${board.ILKWAL_NBR}','${board.YY}');">
							<td height="26" align="center">${board.YY}</td>
	                        <td align="center">
	                        	<c:if test="${board.GUBUN == '1'}">정기</c:if>
							  	<c:if test="${board.GUBUN == '2'}">수시</c:if>
	                        </td>
	                        <td align="center">${board.BUKWA_NBR}</td>        
	                        <td align="center">
	                        	<c:if test="${board.HEOGA == '1'}">허가</c:if>
							  	<c:if test="${board.HEOGA == '2'}">직권</c:if>
							  	<c:if test="${board.HEOGA == '3'}">폐쇄</c:if>
	                        </td>
	                        <td align="center">${board.JUMNM} </td>
	                        <td align="center">${board.JUMDAN} </td>
	                        <td align="center">${board.BUKWA_AMT}</td>
	                        <td align="center">${board.BUKWA_DATE}</td>
	                        <td align="center">${board.HF_DATE}</td>
	                        <td align="center">${board.HL_DATE}</td>
	                      </tr>
					 </c:forEach>
				</c:when>
				<c:otherwise>
					<tr>
						<td align="center" class="sub_table" colspan="11" height="85">검색된 내용이 없습니다</td>
					</tr>
				</c:otherwise>
			</c:choose>
            </table>
		  </td>
       </tr>

		<tr>
			<td height="30" align="center">
	          	<table border="0" cellspacing="0" cellpadding="0">
					<tr>${pageing}</tr>
				</table>
			</td>
		</tr>
		
		<tr>
			<td height="30"></td>
		</tr>
		
				
		<tr id="sangse_view_title" style="display:none;">
		   <td height='22' background='/img/tab_line_purple.gif'>
			   	<table border='0' cellspacing='0' cellpadding='0'>
			       	<tr>
			         	<td width='111'><img id='sanchul_img' name='sanchul_img' src='/img/sub_petition_title16_on.gif' alt='산출 정보' width='110' height='22' border='0'></td>
			       	</tr>
				</table>
		   </td>
		</tr>
		<tr id="sangse_view" style="display:none;">
			<td align='left' class='contborder_purple'>
				<table width='100%' border='0' cellspacing='0' cellpadding='0'>
			  		<tr>
						<td>
							<table width='100%' border='1' bordercolor='#c9dfed' style='border-collapse:collapse;' cellpadding='0' cellspacing='0'  class='sub_table'>
								<tr>
								  <td width='100' height='28' align='center' bgcolor='e5eff8' class='sub_table_b'>년도</td>
								  <td width='37%' bgcolor='eaeaea' class='table_bl_left'><div id="SANGSE_YY"></td>
								  <td width='100' align='center' bgcolor='e5eff8' class='sub_table_b'>부과구분</td>
								  <td width='36%' bgcolor='eaeaea' class='table_bl_left'><div id="SANGSE_GUBUN"></td>
								</tr>
								<tr>
								  <td height='26' align='center' bgcolor='e5eff8' class='sub_table_b'>허가구분</td>
								  <td bgcolor='eaeaea' class='table_bl_left'><div id="SANGSE_HEOGA"></td>
								  <td align='center' bgcolor='e5eff8' class='sub_table_b'>세입구분</td>
								  <td bgcolor='eaeaea' class='table_bl_left'><div id="SANGSE_SEGUBUN"></td>
								</tr>
								<tr>
								  <td height='26' align='center' bgcolor='e5eff8' class='sub_table_b'>부과점용시작일</td>
								  <td bgcolor='eaeaea' class='table_bl_left'><div id="SANGSE_HF_DATE"></td>
								  <td align='center' bgcolor='e5eff8' class='sub_table_b'>부과점용끝일</td>
								  <td bgcolor='eaeaea' class='table_bl_left'><div id="SANGSE_HL_DATE"></td>
								</tr>
								<tr>
								  <td height='26' align='center' bgcolor='e5eff8' class='sub_table_b'>전년도점용액</td>
								  <td bgcolor='eaeaea' class='table_bl_left'><div id="SANGSE_JUN_JUMACK"></td>
								  <td align='center' bgcolor='e5eff8' class='sub_table_b'>조정점용액</td>
								  <td bgcolor='eaeaea' class='table_bl_left'><div id="SANGSE_CUR_JUMACK"></td>
								</tr>
								<tr>
								  <td height='26' align='center' bgcolor='e5eff8' class='sub_table_b'>현년도점용산출식</td>
								  <td bgcolor='eaeaea' class='table_bl_left'><div id="SANGSE_SANCHUL1"></td>
								  <td align='center' bgcolor='e5eff8' class='sub_table_b'>현년도조정산출식</td>
								  <td bgcolor='eaeaea' class='table_bl_left'><div id="SANGSE_SANCHUL2"></td>
								</tr>
								<tr style='display:block' id='UseType1'>
								  <td align='center' bgcolor='e5eff8' class='sub_table_b'>부과번호 </td>
								  <td bgcolor='eaeaea' class='table_bl_left'><div id="SANGSE_BUKWA_NBR"></td>
								  <td height='26' align='center' bgcolor='e5eff8' class='sub_table_b'>부과금액</td>
								  <td bgcolor='eaeaea' class='table_bl_left'><div id="SANGSE_BUKWA_AMT"></td>
								</tr>
								<tr style='display:block' id='UseType2'>
								  <td align='center' bgcolor='e5eff8' class='sub_table_b'>부과일</td>
								  <td bgcolor='eaeaea' class='table_bl_left'><div id="SANGSE_BUKWA_DATE"></td>
								  <td height='26' align='center' bgcolor='e5eff8' class='sub_table_b'>회계과목</td>
								  <td bgcolor='eaeaea' class='table_bl_left'><div id="SANGSE_ACC_MOK_SEMOK"></td>
								</tr>
							</table>
						</td>
			  		</tr>
				</table>
			</td>
		</tr>
					
		<tr>
			<td height="60"></td>
		</tr>
</table>

</form>
</body>
</html>
