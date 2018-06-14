<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
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
<script language="javascript" src="/js/common.js"></script>
<script language="javascript" src="/js/PopupCalendar.js"></script>
<script language="javascript" src="/js/Check_inputbox.js"></script>
<script language="javascript" src="/jsp/RexServer/rexscript/rexpert.js"></script>
<script language="javascript" src="/jsp/RexServer/rexscript/rexpert_properties.js"></script>
<script language="javascript">
<!--
	function fnPreView()
	{	
		var oRptMainParam;
		oRptMainParam = rex_GetgoDictionay(); 


		//********** BEGIN_현진_20120322
		 var screenHeight = screen.availHeight;
         var screenWidth = 1024;
		//********** END_현진_20120322

		// 필수 - 데이터 타입 설정
		oRptMainParam.put("rex_datatype", "XML");  // XML, CSV

		// 옵션 - 다른 DB를 연결시
		oRptMainParam.put("rex_userservice", "oracle_jndi");
		// 옵션 - 파라메터 설정
		
		var fromDate = document.getElementById("fromDate").value;
		var toDate = document.getElementById("toDate").value;
		var siguCd = document.getElementById("guCd").value;

		
		var obj = document.getElementsByName("SEARCH_TYPE");

		fromDate = nr_Date_Cut(fromDate);	
		toDate   = nr_Date_Cut(toDate);

		if(siguCd == '000'){
			siguCd = '%';
			// 필수 - 레포트명
			oRptMainParam.put("rex_rptname", "gapan_statics_all");

		}else{
			// 필수 - 레포트명
			oRptMainParam.put("rex_rptname", "gapan_statics");
		}

			oRptMainParam.put("FROM_DATE", fromDate);
			oRptMainParam.put("TO_DATE", toDate);

		oRptMainParam.put("SIGU_CD", siguCd);

		oRptMainParam.put("rex_init", "ToolBarVisible=1;ShowProcessDialog=0");
		
		//********** BEGIN_현진_20120322
		//oRptMainParam.put("rex_open_window", "center=no,scrollbars=no,status=no,toolbar=no,resizable=0,location=no,menu=no,width=100%,height=2734");
		oRptMainParam.put("rex_open_window", "center=no,scrollbars=no,status=no,toolbar=no,resizable=0,location=no,menu=no,width="+screenWidth+",height="+screenHeight);
		rex_gfRexRptOpen("popup", oRptMainParam);
		//********** END_현진_20120322

		return oRptMainParam;
				
	}

	function fnPreView2()
	{	
	var oRptMainParam;
	oRptMainParam = rex_GetgoDictionay(); 

	//********** BEGIN_현진_20120322
	var screenHeight = screen.availHeight;
    var screenWidth = 1024;
	//********** END_현진_20120322
	
	// 필수 - 레포트명
	oRptMainParam.put("rex_rptname", "rojum_owner_sum");

	// 필수 - 데이터 타입 설정
	oRptMainParam.put("rex_datatype", "XML");  // XML, CSV	

	// 옵션 - 다른 DB를 연결시
	oRptMainParam.put("rex_userservice", "oracle_jndi");

	oRptMainParam.put("rex_init", "ToolBarVisible=1;ShowProcessDialog=0");	
	//********** BEGIN_현진_20120322	
	//oRptMainParam.put("rex_open_window", "center=no,scrollbars=no,status=no,toolbar=no,resizable=0,location=no,menu=no,width=100%,height=100%");
	oRptMainParam.put("rex_open_window", "center=no,scrollbars=no,status=no,toolbar=no,resizable=0,location=no,menu=no,width="+screenWidth+",height="+screenHeight);
	rex_gfRexRptOpen("popup", oRptMainParam);
	//********** END_현진_20120322
	
	return oRptMainParam;
			
}
	function fn_search(obj)
	{	
		if(obj == '1'){
			//********** BEGIN_현진_20120322
			//rex_gfRexRptOpen("iframepush", ifrmRexPreview, fnPreView());
			//rex_gfRexRptOpen("iframeall", "", "");
			fnPreView();
			//********** END_현진_20120322			
		}else{
			//********** BEGIN_현진_20120322			
			//rex_gfRexRptOpen("iframepush", ifrmRexPreview, fnPreView2());
			//rex_gfRexRptOpen("iframeall", "", "");
			fnPreView2();
			//********** END_현진_20120322
		}		
	}

	function init()
	{
		var gu_cd = document.getElementById("guCd");
		var obj = gu_cd.options;

		for(var i = 0 ; i < obj.length ; i++){
			if(obj[i].value == '${siguCode}'){
				obj[i].selected = true;
			}
		}

		if('${siguCode}' != '000'){
			gu_cd.disabled="disabled";
		}

	}

  		    
-->
</script>
</head>

<body onload="init();">
<form name="form" method="post">
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
								<td><img src="/img/sub_stat_title1.gif" alt="통계설정" width="110" height="22"></td>
							</tr>
						</table>
						</td>
					</tr>
					<tr>
						<td align="left" class="contborder_blue">
						<table width="100%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td>
								<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse: collapse;" cellpadding="0" cellspacing="0" class="sub_table">
									<tr>
	                                    <td height="26" align="left" colspan="2">
	                                        <span class="sub_stan_blue">&nbsp; * 가로정비 결과 조회 </span>
	                                    </td>
									</tr>
									<tr>
										<td width="100px" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">위반일자</td>
										<td bgcolor="eaeaea" class="table_bl_left">
											<input id="fromDate" name="fromDate" type="text" class="input_form1" style="width: 70px" value="${fromDate}">
											<img src="/img/calendar_icon.gif" width="19" height="16" border="0" align="absmiddle" onclick="popUpCalendar(this, document.getElementById('fromDate'), 'yyyymmdd')" style="CURSOR: Hand;">
											 ~ <input id="toDate" name="toDate" type="text" class="input_form1" style="width: 70px" value="${toDate}">
											<img src="/img/calendar_icon.gif" width="19" height="16" border="0" align="absmiddle" onclick="popUpCalendar(this, document.getElementById('toDate'), 'yyyymmdd')" style="CURSOR: Hand;">
										</td>
									</tr>

									<tr>
										<td width="100px" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">시군구별</td>
										<td bgcolor="eaeaea" class="table_bl_left">
											<select id="guCd" name="guCd" class="input_form1" style="width:100px">
												<c:forEach items="${guCdList}" var="list">
													<option value="${list.GU_CD}">${list.GU_NM}</option>
												</c:forEach>
											</select>
										</td>
									</tr>
									<tr>
	                                    <td height="26px" align="right"  colspan="2">
		                                    <img src="/img/inquiry_icon2.gif" alt="검색" width="56" height="18" onclick="fn_search(1);"  border="0" style="cursor:pointer;">
	                                    </td>
									</tr>
								</table>
								</td>
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
<!--  //********** BEGIN_현진_20120322 -->
<!-- 
			<tr>
				<td>
				<table width="780" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td height="22" background="/img/tab_line_purple.gif">
						<table border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td onClick="DisplayMenu(1)" width="111">
									<a href="#">
										<img src="/img/sub_stat_title2_on.gif" alt="통계 결과" width="110" height="22" border="0">
									</a>
								</td>
							</tr>
						</table>
						</td>
					</tr>
					<tr>
						<td align="center" class="contborder_purple">
						<table width="100%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td>
								<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse: collapse;" cellpadding="0" cellspacing="0" class="sub_table">
									<tr>
										<td>
											<iframe id="ifrmRexPreview" width="100%" height="350" frameborder=0 scrolling=no></iframe>
										</td>
									</tr>
								</table>
								</td>
							</tr>
						</table>
						</td>
					</tr>
				</table>
				</td>
			</tr>
-->
<!--   //********** END_현진_20120322 -->			
		</table>
		</td>
	</tr>
</table>
</form>

</body>
</html>

