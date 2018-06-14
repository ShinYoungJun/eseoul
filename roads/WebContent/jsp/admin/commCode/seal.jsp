<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR" %>
<%@ include file="/jsp/common/include.jsp"%>
<%@ include file="/jsp/common/loginCheck.jsp" %>

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

	function checkKeySearch(){
		if(event.keyCode == KEY_ENTER)
			register();
	}	


	function  register(){
		var w = document.Form;
		
		if(siguCheck(w.GU_CD.value)){
			if(w.Upload.value==""){
				alert("파일을 선택해주세요");
				w.Upload.focus();
				return;
			}
			
			w.action = "/admin/commCode/sealRegister.do";	
			w.submit();
		}else{
			w.GU_CD.focus();
			return
		}
		
			
	}
	
	function InitPage(){		
		if('${MSG}'.length > 0){
            alert('${MSG}');
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

	
//]]>
</script>

<body onload="javascript:InitPage();">
<form name="Form" id="Form" action="/admin/commCode/sealRegister.do" method="post" enctype="multipart/form-data">
<table width="800" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td height="43"><img src="/img/admin_cont3_title.gif"
			width="800" height="43"></td>
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
		</table>

		<table width="780" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td align="left" height="22" background="/img/tab_line_blue.gif">
				<table border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td width="111"><a href="/admin/commCode/areaCode.do"><img
							src="/img/sub_admin_title4_off.gif" alt="지역코드" width="110"
							height="22" border="0"></a></td>
						<td  width="111"><a href="/admin/commCode/orgCode.do"><img
							src="/img/sub_admin_title5_off.gif" alt="부서코드" width="110"
							height="22" border="0"></a></td>
						<td width="111"><a href="/admin/commCode/purposeCode.do"><img
							src="/img/sub_admin_title6_off.gif" alt="점용목적코드" width="110"
							height="22" border="0"></a></td>
						<td width="111"><a href="/admin/commCode/taxCode.do"><img
							src="/img/sub_admin_title7_off.gif" alt="과세구분코드" width="110"
							height="22" border="0"></a></td>
						<td width="111"><a href="#"><img
							src="/img/sub_admin_seal_on.gif" alt="직인등록" width="110"							         
							height="22" border="0"></a></td>
						<td width="111"><a href="/admin/commCode/jojungCode.do"><img
							src="/img/sub_admin_title9_off.gif" alt="조정계수" width="110"
							height="22" border="0"></a></td>
						<td width="111"><a href="/admin/commCode/gradeCode.do"><img
							src="/img/sub_admin_title12_off.gif" alt="등급코드" width="110"
							height="22" border="0"></a></td>
						<td width="111"><a href="/admin/commCode/officeCode.do"><img
							src="/img/sub_admin_title13_off.gif" alt="업체코드" width="110"
							height="22" border="0"></a></td>							
					</tr>
				</table>
				</td>
			</tr>
			<tr>
				<td align="center" class="contborder_blue">
					<table width="60%" border="0" cellspacing="0" cellpadding="0">
						<tr>
							<td height="20px"></td>
						</tr>
						<tr>
							<td height="30px" style="padding:6" align="left"><span class="sub_stan_blue"><b>* 직인 등록 </b></span></td>
						</tr>
						<tr>
							<td align="center">						
								<table width="100%" border="1" bordercolor="#c9dfed"
									style="border-collapse:collapse;" cellpadding="0" cellspacing="0"
									class="sub_table">
									<tr>
										<td width="150px" height="40px" align="center" bgcolor="e5eff8" class="sub_table_b">
										시군구
										</td>
										<td height="40px" align="center" bgcolor="e5eff8" class="sub_table_b">
											교체할 직인 파일을 올려주세요.<br/>
											파일 확장자는 반드시 png여야 합니다.
										</td>																		
									</tr>
									<tr>									
										<td height="80px" align="center">
											<select id="GU_CD" name="GU_CD" class="input_form1" style="width:130px">
												${GU_CODE}
											</select>
										</td>
										<td>
											<table border="0">
												<tr>
													<td>
														<input type="file" id="Upload" name="Upload" size="20" class="input_form1" />		
													</td>
													<td>
														<img src="/img/register_icon2.gif" alt="등록" width="56" height="18" border="0" style="cursor: pointer;" onclick="javascript:register()">		
													</td>
												</tr>									
											</table>
										</td>																		
									</tr>
								</table>
							</td>						
						</tr>
						<tr>
							<td height="30px"></td>
						</tr>
					</table>				
				</td>
			</tr>			
		</table>
		</td>
	</tr>
</table>
</form>
</body>
</html>

