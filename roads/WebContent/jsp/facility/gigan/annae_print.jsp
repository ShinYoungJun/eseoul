<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
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

<script type="text/javascript">
//<![CDATA[

	function fnPreView()
	{
		var oReport;
		
		oReport = RexpertViewCtl.OpenReport("http://localhost:8088/ocx/annae.rex");

		if(oReport == null)
		{
			alert("리포트 파일을 열 수 없습니다!");
			return;
		}

		var form 	= document.forms[0];

		oReport.SetParameterFieldValue("ADMIN_NO" ,form.ADMIN_NO.value);
		oReport.SetParameterFieldValue("YEAR" ,form.YEAR.value);
		oReport.SetParameterFieldValue("MONTH" ,form.MONTH.value);
		oReport.SetParameterFieldValue("FROMDATE" ,form.FROMDATE.value);
		oReport.SetParameterFieldValue("TODATE" ,form.TODATE.value);
		oReport.SetParameterFieldValue("MANAGER" ,form.MANAGER.value);
		oReport.SetParameterFieldValue("TEL" ,form.TEL.value);
		oReport.SetParameterFieldValue("ENDDATE" ,form.ENDDATE.value);
		oReport.SetParameterFieldValue("DEPT" ,form.DEPT.value);
		oReport.SetParameterFieldValue("NOTES" ,form.NOTES.value);
		
		RexpertViewCtl.ShowParameterDialog = false;
		RexpertViewCtl.AutoConnection = true;
		RexpertViewCtl.Run();
	}

//]]>
</script>

<body onload="fnPreView();">
	<form name="form" method="post">
		<input type="hidden" name="ADMIN_NO" value="${ADMIN_NO}">
		<input type="hidden" name="YEAR" value="${YEAR}">
		<input type="hidden" name="MONTH" value="${MONTH}">
		<input type="hidden" name="FROMDATE" value="${FROMDATE}">
		<input type="hidden" name="TODATE" value="${TODATE}">
		<input type="hidden" name="MANAGER" value="${MANAGER}">
		<input type="hidden" name="TEL" value="${TEL}">
		<input type="hidden" name="ENDDATE" value="${ENDDATE}">
		<input type="hidden" name="DEPT" value="${DEPT}">
		<input type="hidden" name="NOTES" value="${NOTES}">
	</form>
	
	<OBJECT ID="RexpertViewCtl" CLASSID="CLSID:9E1F4A27-7EB0-4210-98D8-1CCF6671F483"
		WIDTH="100%" HEIGHT="100%" CODEBASE="http://127.0.0.1:8088/ocx/Rexpert25Viewer.cab#version=2,5,1,50">
	</BODY>
	
</html>