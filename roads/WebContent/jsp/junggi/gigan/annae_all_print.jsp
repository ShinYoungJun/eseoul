<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
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

<script type="text/javascript">
//<![CDATA[

	function fnPreView()
	{
		var oReport;

		oReport = RexpertViewCtl.OpenReport("http://localhost:8088/ocx/annae_all.rex");
		
		if(oReport == null)
		{
			alert("리포트 파일을 열 수 없습니다!");
			return;
		}
		
		var form 	= document.forms[0];
		
	//	oReport.SetParameterFieldValue("ADMIN_NO" ,form.ADMIN_NO.value);
		oReport.SetParameterFieldValue("YEAR" ,form.YEAR.value);
		oReport.SetParameterFieldValue("MONTH" ,form.MONTH.value);
		oReport.SetParameterFieldValue("FROMDATE" ,form.FROMDATE.value);
		oReport.SetParameterFieldValue("TODATE" ,form.TODATE.value);
		oReport.SetParameterFieldValue("MANAGER" ,form.MANAGER.value);
		oReport.SetParameterFieldValue("TEL" ,form.TEL.value);
		oReport.SetParameterFieldValue("ENDDATE" ,form.ENDDATE.value);
		oReport.SetParameterFieldValue("DEPT" ,form.DEPT.value);
		oReport.SetParameterFieldValue("NOTES" ,form.NOTES.value);


		oReport.SetParameterFieldValue("GIGAN1" ,form.GIGAN1.value);
		oReport.SetParameterFieldValue("GIGAN2" ,form.GIGAN2.value);
		oReport.SetParameterFieldValue("PURPOSE_CD" ,form.PURPOSE_CD.value);
		oReport.SetParameterFieldValue("BONBUN" ,form.BONBUN.value);
		oReport.SetParameterFieldValue("BUBUN" ,form.BUBUN.value);
		oReport.SetParameterFieldValue("NAME" ,form.NAME.value);
		oReport.SetParameterFieldValue("ADMIN_NO" ,form.ADMIN_NO.value);
		oReport.SetParameterFieldValue("TYPE" ,form.TYPE.value);
		oReport.SetParameterFieldValue("OWNER_SET" ,form.OWNER_SET.value);
		oReport.SetParameterFieldValue("TAX_SET" ,form.TAX_SET.value);
		oReport.SetParameterFieldValue("BJ_CD" ,form.BJ_CD.value);
		oReport.SetParameterFieldValue("HJ_CD" ,form.HJ_CD.value);
		
		RexpertViewCtl.ShowParameterDialog = false;
		RexpertViewCtl.AutoConnection = true;
		RexpertViewCtl.Run();
	}

//]]>
</script>

<body onload="fnPreView();">
	<form name="form" method="post">
	<!-- 	<input type="hidden" name="ADMIN_NO" value="${ADMIN_NO}"> -->
		<input type="hidden" name="YEAR" value="${YEAR}">
		<input type="hidden" name="MONTH" value="${MONTH}">
		<input type="hidden" name="FROMDATE" value="${FROMDATE}">
		<input type="hidden" name="TODATE" value="${TODATE}">
		<input type="hidden" name="MANAGER" value="${MANAGER}">
		<input type="hidden" name="TEL" value="${TEL}">
		<input type="hidden" name="ENDDATE" value="${ENDDATE}">
		<input type="hidden" name="DEPT" value="${DEPT}">
		<input type="hidden" name="NOTES" value="${NOTES}">
				
		<input type="hidden" name="GIGAN1" value="${GIGAN1}">
		<input type="hidden" name="GIGAN2" value="${GIGAN2}">
		<input type="hidden" name="PURPOSE_CD" value="${PURPOSE_CD}">
		<input type="hidden" name="BONBUN" value="${BONBUN}">
		<input type="hidden" name="BUBUN" value="${BUBUN}">
		<input type="hidden" name="NAME" value="${NAME}">
		<input type="hidden" name="ADMIN_NO" value="${ADMIN_NO}">
		<input type="hidden" name="TYPE" value="${TYPE}">
		<input type="hidden" name="OWNER_SET" value="${OWNER_SET}">
		<input type="hidden" name="TAX_SET" value="${TAX_SET}">
		<input type="hidden" name="BJ_CD" value="${BJ_CD}">
		<input type="hidden" name="HJ_CD" value="${HJ_CD}">
	</form>
	
	<OBJECT ID="RexpertViewCtl" CLASSID="CLSID:9E1F4A27-7EB0-4210-98D8-1CCF6671F483"
		WIDTH="100%" HEIGHT="100%" CODEBASE="http://127.0.0.1:8088/ocx/Rexpert25Viewer.cab#version=2,5,1,50">
	</BODY>
	


</body>
</html>