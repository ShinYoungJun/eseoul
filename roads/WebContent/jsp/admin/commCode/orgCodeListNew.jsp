<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/include.jsp"%>
<%@ include file="/jsp/common/loginCheck.jsp"%>
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
<script type="text/javascript" src="/js/jquery-1.6.1.js"></script>
<script language="javascript" src="/js/PopupCalendar.js"></script>
<script language="javascript" src="/js/common.js"></script>
<script language="javascript" src="/js/admin.js"></script>
<script type="text/javascript">
//<![CDATA[
	           
	function search() {
		var w = document.searchForm;

		w.action = "/admin/commCode/orgCode.do";
		w.submit();
	}

	function registerPop(action) {
		var title = "";
		var param = "";
		var url = "/admin/commCode/orgCodeRegisterView.do";
		var window = null;

		switch (action) {
		case 'add': {
			url += '?act=add';
			window = popUp(url, title, 580, 200)
			var id = setInterval(
				function() {
					if (window.document.readyState == 'complete') {
						window.document.getElementById('imgRegister').style.display='inline';						
						clearInterval(id);
					}
				},
				1000);
			break;
		}
		case 'mod': { // ������ ó�� �ϳ��� ó��.
			url += '?act=mod';
			var $checkedItems = $('[name="SELECT_ITEM"]:checked');
			if($checkedItems.length > 1){
				alert('�ϳ��� �μ��� ���� �ϼ���.');
				return;
			}
			var list = document.getElementsByName('SELECT_ITEM');
			var len = list.length;
			var isChecked = false;
			for ( var i = 0; i < len; i++) {
				if (list[i].checked == true) {
					window = popUp(url, title, 580, 200);
					var id = setInterval(
							function() {
								if (window.document.readyState == 'complete') {
									var doc = window.document;
									var guNMs = document.getElementsByName('GU_NM_ARR');
									var deptCDs = document.getElementsByName('DEPT_CD_ARR');
									var deptNMs = document.getElementsByName('DEPT_NM_ARR');
									var manageWorks = document.getElementsByName('MANAGE_WORK_ARR');
									for ( var i = 0; i < len; i++) {
										if (list[i].checked == true) {
											isChecked = true;
											var orgs = doc.getElementById('GU_CD_SELECT');
											var selectedGuNM = guNMs[i].innerText;
											if (orgs.length > 1) {
												var orgLen = orgs.options.length;
												orgs.options[orgs.selectedIndex].selected = false;
												for (var j = 0; j < orgLen; j++) {
													if (orgs.options[j].innerText === selectedGuNM) {
														orgs.options[j].selected = true;
														orgs.value = orgs.options[j].value;
													}
												}
											}
											doc.getElementById('DEPT_CD').value = deptCDs[i].value;
											doc.getElementById('DEPT_NM').value = deptNMs[i].innerText;
											doc.getElementById('MANAGE_WORK').value = manageWorks[i].innerText;
											break;
										}
									}
									doc.getElementById('imgModify').style.display='inline';
									clearInterval(id);
								}
							}, 
						1000);
					isChecked = true;
					break;			
				}
			}
			if (!isChecked) {
				alert('���� ����� �����ϴ�.');
				return;
			}
			break;
		}
		}

		var closeId = setInterval( 
			function () {
				if (window && window.closed) {
					clearInterval(closeId);
					search();
				}
			},
			2000
		);
	}

	function deletePop() {
		var w = document.orgCodeForm;
		var cnt = cntCheck();
		if (cnt <= 0) {
			alert("ó�� ����� �����ϴ�.");
			return;
		} else {
			if (confirm(cnt + "���� �����Ͻðڽ��ϱ�?")) {
				w.action = "/admin/commCode/orgCodeDelete.do";
				w.submit();
			} else {
				return;
			}
		}

	}

	function cntCheck() {
		var w = document.orgCodeForm;
		var select_item = document.getElementsByName("SELECT_ITEM");
		var item_check = document.getElementsByName("ITEM_CHECK");
		var org_cd_arr = document.getElementsByName("ORG_CD_ARR");
		var dept_cd_arr = document.getElementsByName("DEPT_CD_ARR");

		var cnt = 0;

		for ( var i = 0; i < select_item.length; i++) {
			if (select_item[i].checked == true) {
				item_check[i].value = select_item[i].checked;
				cnt++;
			}
		}
		return cnt;
	}
	function InitPage() {
		if ('${MSG}'.length > 0) {
			alert('${MSG}');
		}
	}
	
//]]>
</script>

<body onload="javascript:InitPage();">
<input type="hidden" name="excel" value="">
<table width="800" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td height="43"><img src="/img/admin_cont3_title.gif" width="800"
			height="43"></td>
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
						<td width="111"><a
							href="/admin/commCode/areaCode.do"><img
							src="/img/sub_admin_title4_off.gif" alt="�����ڵ�" width="110"
							height="22" border="0"></a></td>
						<td width="111"><a
							href="#"><img
							src="/img/sub_admin_title5_on.gif" alt="�μ��ڵ�" width="110"
							height="22" border="0"></a></td>
						<td width="111"><a
							href="/admin/commCode/purposeCode.do"><img
							src="/img/sub_admin_title6_off.gif" alt="��������ڵ�" width="110"
							height="22" border="0"></a></td>
						<td width="111"><a href="/admin/commCode/taxCode.do"><img
							src="/img/sub_admin_title7_off.gif" alt="���������ڵ�" width="110"
							height="22" border="0"></a></td>
						<!--  //********** BEGIN_����_20120315 -->
						<!-- 
						<td width="111"><a href="/jsp/admin/commCode/zipCodeList.jsp"><img
							src="/img/sub_admin_title8_off.gif" alt="�����ȣ�ڵ�" width="110"
							height="22" border="0"></a></td>
						-->
						<td width="111"><a href="/admin/commCode/seal.do"><img
							src="/img/sub_admin_seal_off.gif" alt="���ε��" width="110"							         
							height="22" border="0"></a></td>
						<!--   //********** END_����_20120315 -->
						<td width="111"><a
							href="/admin/commCode/jojungCode.do"><img
							src="/img/sub_admin_title9_off.gif" alt="�������" width="110"
							height="22" border="0"></a></td>
						<td width="111"><a href="/admin/commCode/gradeCode.do"><img
							src="/img/sub_admin_title12_off.gif" alt="����ڵ�" width="110"
							height="22" border="0"></a></td>
						<td width="111"><a href="/admin/commCode/officeCode.do"><img
							src="/img/sub_admin_title13_off.gif" alt="��ü�ڵ�" width="110"
							height="22" border="0"></a></td>						
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
														${GU_CODE}
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
						<td height="34" class="sub_stan" align="left">
  						<table width="100%">
								<tr>
									<td>��ü�Ǽ� : <span class="sub_stan_blue">${totalCount}</span> ��</td>
									<td align="right">
										<img src="/img/mod_icon2.gif" alt="����" width="34" height="18" border="0" onClick="javascript:registerPop('mod');" style="cursor: pointer">
									</td>
								</tr>
							</table>
				    </td>
					</tr>
					<tr>
					<td align="left">
						<form id="orgCodeForm" name="orgCodeForm">					
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
								<td align="center" bgcolor="e5eff8" class="sub_table_b">�μ��ڵ�</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">�μ���</td>								
								<td align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
							</tr>
							<c:forEach items="${orgCodelist}" var="orgCodelist" varStatus="idx">
								 <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''">
								 	<td width="35px" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">
								 		<input type="checkbox" id="SELECT_ITEM" name="SELECT_ITEM"/>
								 		<input type="hidden" id="ITEM_CHECK" name="ITEM_CHECK" value=""/>
								 		<input type="hidden" id="ORG_CD_ARR" name="ORG_CD_ARR" value="${orgCodelist.ORG_CD}"/>
								 		<input type="hidden" id="DEPT_CD_ARR" name="DEPT_CD_ARR" value="${orgCodelist.DEPT_CD}"/>								 		
								 	</td>
								 	<td id="GU_NM_ARR" name="GU_NM_ARR" height="26" align="center">${orgCodelist.GU_NM}</td>
									<td align="center">${orgCodelist.DEPT_CD}</td>
									<td id="DEPT_NM_ARR" name="DEPT_NM_ARR" align="center">${orgCodelist.DEPT_NM}</td>
									<td id="MANAGE_WORK_ARR" name="MANAGE_WORK_ARR" align="center">${orgCodelist.MANAGE_WORK}</td>																				
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

