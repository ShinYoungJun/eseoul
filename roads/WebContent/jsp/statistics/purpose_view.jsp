<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/include.jsp"%>
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

<script language="javascript" src="/js/common.js"></script> 
<script language="javascript" src="/js/PopupCalendar.js"></script>
<script language="javascript" src="/js/Check_inputbox.js"></script>
<script language="javascript" src="/jsp/RexServer/rexscript/rexpert.js"></script>
<script language="javascript" src="/jsp/RexServer/rexscript/rexpert_properties.js"></script>
<script language="javascript">
	function DisplayMenu(index) 
	{
        for (i=1; i<=2; i++)
        	if (index == i) 
        	{
        		thisMenu = eval("menu" + index + ".style");
        		thisMenu.display = "";
        	} 
        	else 
        	{
        		otherMenu = eval("menu" + i + ".style"); 
        		otherMenu.display = "none"; 
			}
	}
	
	function fnPreView()
	{	
		var oRptMainParam;
		oRptMainParam = rex_GetgoDictionay(); 

		// 필수 - 레포트명
		oRptMainParam.put("rex_rptname", "purpose_view");

		// 필수 - 데이터 타입 설정
		oRptMainParam.put("rex_datatype", "XML");  // XML, CSV

		// 옵션 - 다른 DB를 연결시
		oRptMainParam.put("rex_userservice", "oracle_jndi");

		// 옵션 - 파라메터 설정
		var fromDate = document.form.fromDate.value;
		var toDate = document.form.toDate.value;
		var siguCd = document.form.guCd.value;
		var type   = document.form.type.value;
		var section = document.form.SECTION.value;
		var tax_yn = document.form.TAX_YN.value;
		var purposeCd = IFRM_PurposeCode.PURPOSE_CD.value;
		var classCd = "";
		var sortCd  = "";
		var kindCd = "";

		var all="";

		if(IFRM_PurposeCode.PURPOSE1.selectedIndex != -1){
			all = IFRM_PurposeCode.PURPOSE1.options[IFRM_PurposeCode.PURPOSE1.selectedIndex].innerHTML;
		}

		
		if(all != '::선택::' && all != '')
		{	
			classCd = purposeCd.substr(0,1);
			sortCd  = purposeCd.substr(1,1);
			kindCd = purposeCd.substr(2,1);
			
			if(sortCd == '0')
				sortCd = "%";
			if(kindCd == '0')
				kindCd = "%";
			
		}else{
			classCd = "%";
			sortCd = "%";
			kindCd = "%";
		}
		
		fromDate = nr_Date_Cut(fromDate);	
		toDate   = nr_Date_Cut(toDate);

		if(siguCd == '0000000')
			siguCd = '';

		oRptMainParam.put("FROM_DATE", fromDate);
		oRptMainParam.put("TO_DATE", toDate);
		oRptMainParam.put("SIGU_CD", siguCd);
		oRptMainParam.put("TYPE", type);
		oRptMainParam.put("SECTION", section);
		oRptMainParam.put("TAX_YN", tax_yn);
		oRptMainParam.put("CLASS_CD", classCd);
		oRptMainParam.put("SORT_CD", sortCd);
		oRptMainParam.put("KIND_CD", kindCd);

		//alert(":fromDate:"+fromDate+":toDate:"+toDate+":siguCd:"+siguCd+":type:"+type+":section:"+section+":tax_yn:"+tax_yn+":classCd:"+classCd+":sortCd:"+sortCd+":kindCd:"+kindCd+"::");
		
		
		oRptMainParam.put("rex_init", "ToolBarVisible=1;ShowProcessDialog=0");
		oRptMainParam.put("rex_open_window", "center=no,scrollbars=no,status=no,toolbar=no,resizable=0,location=no,menu=no,width=100%,height=600");
		
		return oRptMainParam;
				
	}
	
	function fnPreView_gp()
	{	
		var oRptMainParam;
		oRptMainParam = rex_GetgoDictionay(); 

		// 필수 - 레포트명
		oRptMainParam.put("rex_rptname", "purpose_gp");

		// 필수 - 데이터 타입 설정
		oRptMainParam.put("rex_datatype", "XML");  // XML, CSV

		// 옵션 - 다른 DB를 연결시
		oRptMainParam.put("rex_userservice", "oracle_jndi");

		// 옵션 - 파라메터 설정
		var fromDate = document.form.fromDate.value;
		var toDate = document.form.toDate.value;
		var siguCd = document.form.guCd.value;
		var type   = document.form.type.value;
		var purposeCd = IFRM_PurposeCode.PURPOSE_CD.value;
		var classCd = "";
		var sortCd  = "";
		var kindCd = "";


		
		if(purposeCd != '000')
		{	
			classCd = purposeCd.substr(0,1);
			sortCd  = purposeCd.substr(1,1);
			
			if(sortCd == '0')
				sortCd = "";
		}
		
		fromDate = nr_Date_Cut(fromDate);	
		toDate   = nr_Date_Cut(toDate);

		oRptMainParam.put("FROM_DATE", fromDate);
		oRptMainParam.put("TO_DATE", toDate);
		oRptMainParam.put("SIGU_CD", siguCd);
		oRptMainParam.put("TYPE", type);
		oRptMainParam.put("CLASS_CD", classCd);
		oRptMainParam.put("SORT_CD", sortCd);
		
		oRptMainParam.put("rex_init", "ToolBarVisible=1;ShowProcessDialog=0");
		oRptMainParam.put("rex_open_window", "center=no,scrollbars=no,status=no,toolbar=no,resizable=0,location=no,menu=no,width=100%,height=600");
		oRptMainParam.put("rex_openreport_end", "javaOpenReportEndFunction");
		// javaOpenReportEndFunction 실행함 (인자는 oReport)
		
		return oRptMainParam;
	}
	
	function fn_search()
	{	
		rex_gfRexRptOpen("iframepush", ifrmRexPreview, fnPreView());
		//rex_gfRexRptOpen("iframepush", ifrmRexPreview_gp, fnPreView_gp());
		rex_gfRexRptOpen("iframeall", "", "");		
	}
	
	// rex_openreport_end 정의시 실행되는 프로시져
	function javaOpenReportEndFunction(oReport) {
		
		var oTeeChart = null;

		try
		{	
			oTeeChart = oReport.OpenChart("chart3").GetChart();
		}
		catch(e)
		{
			alert("챠트를 찾을 수 없습니다.");
			return;
		}

		//////////////////////////////////////////////////////////////
		//  * 챠트 종류
		//
		//	scLine = 0;
		//	scBar = 1;
		//	scHorizBar = 2;
		//	scArea = 3;
		//	scPoint = 4;
		//	scPie = 5;
		//	scFastLine = 6;
		//	scShape = 7;
		//	scGantt = 8;
		//	scBubble = 9;
		//	scArrow = 10;
		//	scCandle = 11;
		//	scPolar = 12;
		//	scSurface = 13;
		//	scVolume = 14;
		//	scErrorBar = 15;
		//	scBezier = 16;
		//	scContour = 17;
		//	scError = 18;
		//	scPoint3D = 19;
		//	scRadar = 20;
		//	scClock = 21;
		//	scWindRose = 22;
		//	scBar3D = 23;
		//	scImageBar = 24;
		//////////////////////////////////////////////////////////////
		
		oTeeChart.ChangeSeriesType(1, form.gpType.value);
		
		//////////////////////////////////////////////////////////////
		//  * 바챠트에서 사용할 수 있는 타입
		//
		//	bsRectangle = 0
		//	bsPyramid = 1
		//	bsInvPyramid = 2
		//	bsCilinder = 3
		//	bsEllipse = 4
		//	bsArrow = 5
		//	bsRectangleGradient = 6
		////////////////////////////////////////////////////////////// 
		//oTeeChart.Series(0).asBar.BarStyle = 0;
	}
	
	// 점용 종류 선택시 점용 목적 코드 나오게 함.
	function	Select_UseType(sel)
	{	
		document.getElementById("IFRM_PurposeCode").src="/jsp/common/purposeCode/purposeCode4.jsp?SectionCode="+sel.value;

//		/jsp/common/purposeCode/purposeCode2.jsp?SectionCode=${TYPE}&PURPOSE_CD=${PURPOSE_CD}
	}
	
	function init()
	{	
		if(document.getElementById("guCd").value == "")	
			document.getElementById("guCd").disabled = false;

		fn_search();

		
	}	

</script>

<body onload="init();">
<form id="form" name="form" method="post">
<table width="800" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td height="43"><img src="/img/sub4_cont1_title.gif" width="800" height="43"></td>
	</tr>
	<tr>
		<td align="left">
		<table width="780" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td height="1" bgcolor="eaeaea"></td>
			</tr>
			<tr>
				<td height="14"></td>
			</tr>
			<tr>
				<td>
				<table width="780" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td height="22" background="/img/tab_line_blue.gif">
						<table border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td><img src="/img/sub_stat_title1.gif" alt="통계설정"
									width="110" height="22"></td>
							</tr>
						</table>
						</td>
					</tr>
					<tr>
						<td align="left" class="contborder_blue">
						<table width="100%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td>
								<table width="100%" border="1" bordercolor="#c9dfed"
									style="border-collapse:collapse;" cellpadding="0"
									cellspacing="0" class="sub_table">
									<tr>
			  							<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">부과일자</td>
								  		<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
										<input id="fromDate" name="fromDate" type="text" class="input_form1" style="width:70px" value="${fromDate}"><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" align="absmiddle" onclick="popUpCalendar(this, document.getElementById('fromDate'), 'yyyymmdd')" style="vertical-align:middle;CURSOR: pointer;"></a>
										~ <input id="toDate" name="toDate" type="text" class="input_form1" style="width:70px" value="${toDate}"><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" align="absmiddle" onclick="popUpCalendar(this, document.getElementById('toDate'), 'yyyymmdd')" style="vertical-align:middle;CURSOR: pointer;"></a>
								  		</td>
									</tr>	
									<tr>
										<td width="15%" height="28" align="center" bgcolor="e5eff8"
											class="sub_table_b">시군구별</td>
										<td bgcolor="eaeaea" class="table_bl_left">
										<select id="guCd" name="guCd" class="related" style="width:100px">
											<c:forEach items="${guCdList}" var="list">
												<option value="${list.GU_CD}">${list.GU_NM}</option>
											</c:forEach>	
										</select></td>
										<td height="26" align="center" bgcolor="e5eff8"
											class="sub_table_b">점용종류</td>
										<td bgcolor="eaeaea" class="table_bl_left">
										<select id="type" name="type" class="related" style="width:100px" OnChange="javascript:Select_UseType(this);">
											${type} 
										</select>
										</td>
									</tr>
									<tr>
										<td width="15%" height="28" align="center" bgcolor="e5eff8"
											class="sub_table_b">점용구분</td>
										<td bgcolor="eaeaea" class="table_bl_left">
											<select id="SECTION" name="SECTION" class="related" style="width:100px">
												<option value="">::전체::</option>
												<option value="1">계속</option>
												<option value="3">무단</option>
											</select>
										</td>
										
										<td width="15%" height="28" align="center" bgcolor="e5eff8"
											class="sub_table_b">부과여부</td>
										<td bgcolor="eaeaea" class="table_bl_left">
											<select id="TAX_YN" name="TAX_YN" class="related" style="width:100px">
												<option value="">::전체::</option>
												<option value="0">미부과</option>
												<option value="1">부과</option>
											</select>
										</td>
										
									</tr>
				    				<tr>
										<td height="30" align="center" bgcolor="e5eff8" class="sub_table_b">점용목적</td>
										<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
											<table width="100%" border="0" cellpadding="0" cellspacing="0" class="sub_stan">
												<tr><td>
													<iframe id="IFRM_PurposeCode" align="absmiddle" scrolling="no" frameborder="0" framespacing="0" width="100%" height="25" src="/jsp/common/purposeCode/purposeCode4.jsp?SectionCode=${TYPE}&PURPOSE_CD=${PURPOSE_CD}"></iframe>
												</td></tr>
										  	</table>
										</td>
					                </tr>
								</table>
								</td>
							</tr>
						
							<tr>
								<td height="40" align="right"><a href="javascript:fn_search();"><img
									src="/img/search_icon.gif" alt="검색" width="56" height="18" onclick="DisplayMenu(1);"
									border="0"></a></td>
							</tr>

						</table>
						</td>
					</tr>

				</table>
				</td>
			</tr>
			<tr>
				<td height="30"></td>
			</tr>

			<tr>
				<td>
				<div id="menu1" style="display:;">
				<table width="780" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td height="22" background="/img/tab_line_purple.gif">
						<table border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td onClick="DisplayMenu(1)" width="111"><a href="#"><img
									src="/img/sub_stat_title2_on.gif" alt="통계 결과" width="110"
									height="22" border="0"></a></td>
<!--								<td onClick="DisplayMenu(2)" ><a href="#"><img-->
<!--									src="/img/sub_stat_title3_off.gif" alt="통계 그래프" width="110"-->
<!--									height="22" border="0"></a></td>-->
							</tr>
						</table>
						</td>
					</tr>
					<tr>
						<td align="center" class="contborder_purple">
						<table width="100%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td>
								<table width="100%" border="1" bordercolor="#c9dfed"
									style="border-collapse:collapse;" cellpadding="0"
									cellspacing="0" class="sub_table">
									<tr>
										<td>						
											<iframe id="ifrmRexPreview" width="100%" height="350" scrolling="no" frameborder=0></iframe>
										</td>
									</tr>
								</table>
								</td>
							</tr>
						</table>
						</td>
					</tr>
				</table>
				</div>
				</td>
				
			</tr>

			<tr>
				<td>
				<div id="menu2" style="display:none;">
				<table width="780" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td height="22" background="/img/tab_line_purple.gif">
						<table border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td onClick="DisplayMenu(1)" width="111"><a href="#"><img
									src="/img/sub_stat_title2_off.gif" alt="통계 결과" width="110"
									height="22" border="0"></a></td>
								<td onClick="DisplayMenu(2)" ><a href="#"><img
									src="/img/sub_stat_title3_on.gif" alt="통계 그래프" width="110"
									height="22" border="0"></a></td>
								<td width=2></td>	
								<td align="right">
								<select id="gpType" id="gpType" name="gpType" class="related" style="width:120px" onchange="fn_search();">
									<option value=0>Line</option>
									<option value=1>Bar</option>
									<option value=2>HorizBar</option>
									<option value=3>Area</option>
									<option value=4>Point</option>
									<option value=5>Pie</option>
									<option value=6>FastLine</option>
									<option value=7>Shape</option>
									<option value=8>Gantt</option>
									<option value=9>Bubble</option>
									<option value=0>Arrow</option>
									<option value=11>Candle</option>
									<option value=12>Polar</option>
									<option value=13>Surface</option>
									<option value=14>Volume</option>
									<option value=15>ErrorBar</option>
									<option value=16>Bezier</option>
									<option value=17>Contour</option>
									<option value=18>Error</option>
									<option value=19>Point3D</option>
									<option value=20>Radar</option>
									<option value=21>Clock</option>
									<option value=22>WindRose</option>
									<option value=23>Bar3D</option>
									<option value=24>ImageBar</option>
								</select>
								</td>		
							</tr>
						</table>
						</td>
					<tr>
						<td align="center" class="contborder_purple">
						<table width="100%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td>
								<table width="100%" border="1" bordercolor="#c9dfed"
									style="border-collapse:collapse;" cellpadding="0"
									cellspacing="0" class="sub_table">
									<tr>
										<td>						
											<iframe id="ifrmRexPreview_gp" width="100%" height="350" scrolling="no" frameborder=0></iframe>
										</td>
									</tr>	
								</table>
								</td>
							</tr>
						</table>
						</td>
					</tr>
					<tr>
						<td height="40" align="right"><a href="#"><img
							src="/img/graph_icon.gif" alt="그래프 출력" width="84" height="22"
							border="0"></a></td>
					</tr>
				</table>
				</div>
				</td>
			</tr>
		</table>
		
		</td>
	</tr>

</table>
<script language="javascript">
<!--
	setSelectedOption(document.form.guCd, "${siguCode}");
//-->
</script> 
</form>
</body>
</html>

