<%@page contentType="text/html;charset=euc-kr" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />
<title>점용별 목적코드 설정</title>
<style type="text/css">
<!--
body,td,th {
	font-family: 돋움;
	font-size: 12px;
	color: #053e8a;
}
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}
.style1 {color: #000000}
.style3 {color: #FF6600; font-weight: bold; }

-->
</style>
<script language="JavaScript" src="/js/common.js"></script>
<script language="javascript">
//<!--
 	function register()
	{ 		
 		var w = document.addForm;
 		w.action = "/admin/commCode/purposeRegister.do";	
 		w.submit();

	}
 	function modify()
	{ 		
 		if(!(confirm("현재 데이터와  같은 카테고리의 대분류, 중분류의 데이터도 함께 변경됩니다. 진행하시겠습니까?"))){
			return;
		}
 		var w = document.modyForm;
 		w.action = "/admin/commCode/purposeRegister.do";	
 		w.submit();

	}
 	
	function cancel(){
		window.close();
	}
		
	function InitPage(){		
		if('${MSG}'.length > 0){
            alert('${MSG}');
        }
		if('${YN}'== 'true'){
			opener.location.reload('/admin/commCode/purposeCode.do'); 
			window.close();
        }	
    }

    
	
//-->
</script>
</head>

<body onload="javascript:InitPage();">
<table width="800" height="130" border="0" cellspacing="0" cellpadding="0">

	<tr>
		<td height="30px" style="padding:6" valign="bottom"><span class="sub_stan_blue"><b>* 점용 목적 설정 </b></span></td>
	</tr>
	<tr>
		<td style="padding:6" valign="top">
			<table width="788px" border="1" bordercolor="#c9dfed"
				style="border-collapse:collapse;" cellpadding="0" cellspacing="0"
				class="sub_table">
				<tr>
					<td width="80px" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">점용구분</td>
					<td width="80px" align="center" bgcolor="e5eff8" class="sub_table_b">분류코드</td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b" colspan="3">점용물 종류</td>								
				</tr>
				
				<c:if test="${mode=='add' || mode=='add2'}" >
				<form id="addForm" name="addForm">
				<input type="hidden" name="CODE" id="CODE" value="${list.CODE}"/>
				<input type="hidden" name="SECTION" id="SECTION" value="${SECTION}"/>
				<tr>
					<td height="26px" align="center">${list.SECTION_NAME}</td>
					<td align="center">${list.CODE}</td>
					<td width="200px" align="center">
						<c:if test="${list.CLASS_NM == null || list.CLASS_NM == ''}">
							<input type="text" name="CLASS_NM" id="CLASS_NM" size="20"  maxlength="25" class="input_form1" value=""/>
						</c:if>
						<c:if test="${list.CLASS_NM != null && list.CLASS_NM != ''}">
							${list.CLASS_NM}
							<input type="hidden" name="CLASS_NM" id="CLASS_NM" size="20"  maxlength="25" class="input_form1" value="${list.CLASS_NM}"/>
						</c:if>
					</td>
					<td width="200px" align="center">						
						<c:if test="${list.SORT_NM == null || list.SORT_NM == ''}">
							<input type="text" name="SORT_NM" id="SORT_NM" size="25"  maxlength="50" class="input_form1" value="${list.SORT_NM}"/>
						</c:if>
						<c:if test="${list.SORT_NM != null && list.SORT_NM != ''}">
							${list.SORT_NM }
							<input type="hidden" name="SORT_NM" id="SORT_NM" size="25"  maxlength="50" class="input_form1" value="${list.SORT_NM}"/>
						</c:if>
					</td>
					<td  width="228px" align="center"><input type="text" name="KIND_NM" id="KIND_NM" size="25"  maxlength="50" class="input_form1" value=""/></td>
				</tr>
				</form>
				</c:if>
				
				<form id="modyForm" name="modyForm">
				<input type="hidden" id="mode" name="mode" value="${mode}"/>
				<input type="hidden" id="MSG" name="MSG" value="${MSG}"/>
				<input type="hidden" id="modySECTION" name="modySECTION" value="${modySECTION}"/>
				<input type="hidden" id="modyCODE" name="modyCODE" value="${modyCODE}"/>	
				<c:if test="${mode=='modify'}">
				<tr>
					<td height="26px" align="center">${list.SECTION_NAME}</td>
					<td align="center">${list.CODE}</td>
					<td width="200px" align="center"><input type="text" name="CLASS_NM" id="CLASS_NM" size="20"  maxlength="20" class="input_form1" value="${list.CLASS_NM}"/></td>
					<td width="250px" align="center"><input type="text" name="SORT_NM" id="SORT_NM" size="20"  maxlength="20" class="input_form1" value="${list.SORT_NM}"/></td>
					<td align="center"><input type="text" name="KIND_NM" id="KIND_NM" size="20"  maxlength="20" class="input_form1" value="${list.KIND_NM}"/></td>
				</tr>
				</form>
				</c:if>
			</table>
		</td>
	</tr>
	<tr>
		<td align="center">
			<c:if test="${mode=='add' || mode=='add2'}" >
			<img src="/img/register_icon2.gif" alt="등록" width="56" height="18" border="0" style="cursor: pointer;" onclick="javascript:register()">
			</c:if>
			<c:if test="${mode=='modify'}">
			<img src="/img/mod_icon.gif" alt="수정" width="56" height="18" border="0" style="cursor: pointer;" onclick="javascript:modify()">
			</c:if>
			<img src="/img/can_icon.gif" alt="취소" width="56" height="18" border="0" style="cursor: pointer;" onclick="javascript:cancel()">
		</td>
	</tr>
</table>

</body>
</html>
			