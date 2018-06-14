<%@page contentType="text/html;charset=euc-kr" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />
<title>구간명 설정</title>
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
 		var w = document.form;
 		
 	 		
		if(siguCheck(w.GU_CD.value)){
			if(w.GUGAN_CD.value ==""){
				alert("구간번호를 입력해주세요");
				w.GUGAN_CD.focus();
				return
			}
			if(w.GUGAN_CD.value <= 0 ){
				alert("구간번호는 0 보다 큰 정수를 입력하셔야 합니다.");
				w.GUGAN_CD.focus();
				return
			}
			if(getByteLength(w.GUGAN_NAME)>20){
				alert("구간명은 20Byte 를 초과할 수 없습니다.\r\n(한글2byte, 영문/숫자 1byte)");
				w.GUGAN_NAME.focus();
				return
			}			
			w.submit();
		}else{
			w.GU_CD.focus();
			return
		}		
		
	}

	function cancel(){
		window.close();
	}
		
	function InitPage(){		
		if('${MSG}'.length > 0){
            alert('${MSG}');
        }
		if('${YN}'== 'true'){
			opener.location.reload('/admin/section/list.do'); 
			window.close();
        }	
    }
	function  siguCheck(gu_cd)
	{	
		if(gu_cd=="000"){
			alert("시군구명을 선택해주세요.");
			return false;
		}else{
			return true;
		}
	}
    
	
//-->
</script>
</head>

<body onload="javascript:InitPage();">
<form name="form" method="post" action="/admin/section/register.do">
<input type="hidden" id="mode" name="mode" value="${mode}"/>
<input type="hidden" id="MSG" name="MSG" value="${MSG}"/>
<input type="hidden" id="modyGU_CD" name="modyGU_CD" value="${modyGU_CD}"/>
<input type="hidden" id="modyGUGAN_CD" name="modyGUGAN_CD" value="${modyGUGAN_CD}"/>	
<table width="580" height="130" border="0" cellspacing="0" cellpadding="0">

	<tr>
		<td height="30px" style="padding:6" valign="bottom"><span class="sub_stan_blue"><b>* 구간명 설정 </b></span></td>
	</tr>
	<tr>
		<td style="padding:6" valign="top">
			<table width="100%" border="1" bordercolor="#c9dfed"
				style="border-collapse:collapse;" cellpadding="0" cellspacing="0"
				class="sub_table">
				<tr>
					<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">시군구명</td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">구간번호</td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">구간명</td>								
				</tr>
				 <tr>												
					<td height="26" align="center">
						<select id="GU_CD" name="GU_CD" class="input_form1" style="width:130px">
							${GU_CODE}
						</select>
					</td>
					<td align="center">
						제 <input type="text" name="GUGAN_CD" id="GUGAN_CD" size="5" maxlength="3" class="input_form1" value="${SectionBean.GUGAN_CD}" onchange="isNum(this,'구간번호')"/> 구간
					</td>
					<td align="center">
						<input type="text" name="GUGAN_NAME" id="GUGAN_NAME" size="20"  maxlength="20" class="input_form1" value="${SectionBean.GUGAN_NAME}"/>					 
					</td>																			
				</tr>
			</table>
		</td>
	</tr>
	<tr>
		<td align="center">
			<c:if test="${mode=='add'}">
			<img src="/img/register_icon2.gif" alt="등록" width="56" height="18" border="0" style="cursor: pointer;" onclick="javascript:register()">
			</c:if>
			<c:if test="${mode=='modify'}">
			<img src="/img/mod_icon.gif" alt="수정" width="56" height="18" border="0" style="cursor: pointer;" onclick="javascript:register()">
			</c:if>
			<img src="/img/can_icon.gif" alt="취소" width="56" height="18" border="0" style="cursor: pointer;" onclick="javascript:cancel()">
		</td>
	</tr>
</table>

</form>
</body>
</html>
			