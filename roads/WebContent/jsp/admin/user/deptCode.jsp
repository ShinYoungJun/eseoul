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
<script type="text/javascript">
//<![CDATA[

	function getDeptCode(cd,obj)
	{	
		var w = document.listForm;
		w.siguCode.value = cd;
		w.modeType.value = obj;
		
		w.action = "/admin/user/deptCode.do";		
		w.submit();			
	} 
	
	//부서코드 리스트를 update
	function fn_init()
	{ 	
		var val = "";
		var obj = document.listForm.deptCode;;
		var modeType = document.listForm.modeType.value;
		
		if("list" == modeType)	
			val = parent.document.listForm.deptCode.value;
		else if("insert" == modeType)
			val = parent.document.regForm.deptCode.value;	
		else if("update" == modeType)
			val = parent.document.regForm.deptCode.value;	
		else
			return;
		
		for(i = 0 ; i < obj.options.length ; i++)
		{
			if(obj.options[i].value == val)
			{
				obj.options[i].selected = true;
				return;
			}	
		}
	}  


	function setDeptcd()
	{
		var obj = document.listForm.deptCode.value;
		parent.document.getElementById("dept_cd").innerHTML = obj;
	
	}
	          
//]]>
</script>

<body onload="fn_init();">
<form name="listForm" method="post">
<input name="siguCode" id="siguCode" value="" type="hidden">
<input name="modeType" type="hidden" value="${modeType}">
<input name="deptCd" id="deptCd" value="" type="hidden">
	
	<select name="deptCode" class="essential" style="width:150px" onchange="setDeptcd();">
		<option value ="">부서선택</option>
		<c:forEach items="${deptCdList}" var="list">
		<option value="${list.DEPT_CD}">${list.DEPT_NM}</option>
		</c:forEach>			
	</select>
		
</form>
</body>
</html>
				