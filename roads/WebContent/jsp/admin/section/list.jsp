<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR" %>
<%@ include file="/jsp/common/include.jsp"%>
<%@ include file="/jsp/common/loginCheck.jsp" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />
<title>::::: ����� ������������ý��� :::::</title>
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
<script language="javascript" src="/js/selectItem.js"></script>
<script language="javascript" src="/js/admin.js"></script>
<script type="text/javascript">
//<![CDATA[
	           
	function  search(){
		var w = document.searchForm;

		w.action = "/admin/section/list.do";	
		w.submit();
	}
		
	function InitPage(){		
		if('${MSG}'.length > 0){
            alert('${MSG}');
        }		
    }


	function registerPop(mod){
		var mode = mod;
		var title ="";
		var param ="";
		
		if(mod == "add"){
			title="�������߰�";
		}else{
			var cnt = cntCheck();
			if(cnt <=0){
				alert("ó�� ����� �����ϴ�.");
				return;
			}else if(cnt > 1){
				alert("������ 1�Ǿ��� �����մϴ�.");
				return;
				
			}
			param += "&modyGU_CD=" + document.getElementById("modyGU_CD").value;
			param += "&modyGUGAN_CD=" + document.getElementById("modyGUGAN_CD").value;
			title="���������";
		}
		
		var url = "/admin/section/registerView.do?mode=" + mode + param;
  		popUp(url, title, 580, 130);	
	}

	function deletePop(){
		var w = document.sectionForm;
		var cnt = cntCheck();
		if(cnt <= 0){
			alert("ó�� ����� �����ϴ�.");
			return;
		}else{
			if (confirm(cnt + "���� �����Ͻðڽ��ϱ�?")){
				w.action = "/admin/section/delete.do";
				w.submit();
			}else{
				return;
			}
		}
		
	}

	function cntCheck(){
		var w = document.sectionForm;
		var select_item = document.getElementsByName("SELECT_ITEM");
		var item_check = document.getElementsByName("ITEM_CHECK");
		var gu_cd_arr = document.getElementsByName("GU_CD_ARR");
		var gagan_cd_arr = document.getElementsByName("GUGAN_CD_ARR");

		var modyGU_CD =  document.getElementById("modyGU_CD");
		var modyGUGAN_CD =  document.getElementById("modyGUGAN_CD");

		var cnt = 0;		

		for(var i = 0 ; i < select_item.length ; i++){
			if(select_item[i].checked == true){
				item_check[i].value = select_item[i].checked;
				modyGU_CD.value=gu_cd_arr[i].value;
				modyGUGAN_CD.value=gagan_cd_arr[i].value;
				cnt++;
			}
		}
		return cnt;
	}
	
//]]>
</script>

<body onload="javascript:InitPage();">

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
							<td width="111"><a href="#"><img
								src="/img/sub_admin_section_on.gif " alt="������ ����" width="110"
								height="22" border="0"></a>
							</td>
							<!-- c:if test="${MenuCheck == '000'}"> -->
							<td width="111"><a href="/admin/deleteMove/list.do"><img
								src="/img/sub_admin_deleteCopy_off.gif" alt="�ϰ���� �� ����" width="110"
								height="22" border="0"></a>
							</td>
							<!-- /c:if> -->
						</tr>
					</table>
				</td>
			</tr>
			<tr>
				<td align="center" class="contborder_blue">
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td height="20px"></td>
					</tr>
					<!-- �ñ����� ��ȸ -->										
					<tr>
						<td align="center">						
							<table width="100%" border="1" bordercolor="#c9dfed"
								style="border-collapse:collapse;" cellpadding="0" cellspacing="0"
								class="sub_table">
								<tr>
									<td width="100px" height="28px" align="center" bgcolor="e5eff8" class="sub_table_b">�ñ�����</td>
									<td bgcolor="eaeaea" class="table_bl_left" >
										<form id="searchForm" name="searchForm">
										<table border="0" align="left">
											<tr>
												<td>
													<select id="GU_CD" name="GU_CD" class="input_form1" style="width:130px">
														${MenuCheck}
													</select>
												</td>
												<td>
													<a href="#"><img src="/img/inquiry_icon2.gif" alt="��ȸ" border="0" onClick="javascript:search();"></a>		
												</td>
											</tr>
										</table>
										</form>								
									</td>																		
								</tr>
							</table>
						</td>						
					</tr>				
					<!-- �ñ����� ��ȸ ��-->
					<tr>
						<td height="30px"></td>
					</tr>			
					<tr>
						<td height="1" bgcolor="#EAEAEA"></td>
					</tr>
					<tr>
						<td height="30px"></td>
					</tr>
					<tr>
					     <td height="34" class="sub_stan" align="left">��ü�Ǽ� : <span class="sub_stan_blue">${totalCount}</span> �� </td>
					</tr>
					<tr>
					<td align="left">
						<form id="sectionForm" name="sectionForm">					
						<input type="hidden" id="modyGU_CD" name="modyGU_CD" value=""/>
						<input type="hidden" id="modyGUGAN_CD" name="modyGUGAN_CD" value=""/>	
						<table width="100%" border="1" bordercolor="#c9dfed"
							style="border-collapse:collapse;" cellpadding="0" cellspacing="0"
							class="sub_table">
							<tr>
								<td width="35px" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">
									<input type="checkbox" id="SELECT_ALL" name="SELECT_ALL" onclick="javascript:selectAll(this);">
								</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">�ñ�����</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">������ȣ</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">������</td>								
							</tr>
							<c:forEach items="${sectionList}" var="sectionList" varStatus="idx">
								 <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''">
								 	<td width="35px" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">
								 		<input type="checkbox" id="SELECT_ITEM" name="SELECT_ITEM"/>
								 		<input type="hidden" id="ITEM_CHECK" name="ITEM_CHECK" value=""/>
								 		<input type="hidden" id="GU_CD_ARR" name="GU_CD_ARR" value="${sectionList.GU_CD}"/>
								 		<input type="hidden" id="GUGAN_CD_ARR" name="GUGAN_CD_ARR" value="${sectionList.GUGAN_CD}"/>								 		
								 	</td>							
									<td height="26" align="center">${sectionList.GU_NM}</td>
									<td align="center">${sectionList.GUGAN_CD}</td>
									<td align="center">${sectionList.GUGAN_NAME}</td>																			
								</tr>
							</c:forEach>
						</table>
						</form>
						</td>
					</tr>
					<tr>
					<td height="40" align="center">
						<table width="100%" border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td align="center">
								<table border="0" cellpadding="0" cellspacing="0">
									<tr>
										<!-- ����¡���� -->${strPageDivideForm}<!-- ����¡�� -->	
									</tr>
								</table>
								</td>
							</tr>
						</table>
						</td>
					</tr>	
					
					<tr>
						<td height="10px"></td>
					</tr>					
					
					<tr>
						<td>
							<img src="/img/add_icon.gif" alt="�߰�" width="56" height="18" border="0" style="cursor: pointer;" onclick="javascript:registerPop('add')">
							<img src="/img/mod_icon.gif" alt="����" width="56" height="18" border="0" style="cursor: pointer;" onclick="javascript:registerPop('modify')">
							<img src="/img/del_icon3.gif" alt="����" width="56" height="18" border="0" style="cursor: pointer;" onclick="javascript:deletePop()">
						</td>
					</tr>
				</table>
				
				</td>
			</tr>
			
		</table>
		</td>
	</tr>
</table>

</body>
</html>

