<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
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

<script language="javascript" src="/js/PopupCalendar.js"></script>
<script language="javascript" src="/js/common.js"></script>
<script language="javascript" src="/js/admin.js"></script>
<script type="text/javascript">
//<![CDATA[
	           
	function  search(){
		var w = document.searchForm;

		w.action = "/admin/commCode/jojungCode.do";	
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
			title="조정계수추가";
		}else{
			var cnt = cntCheck();
			if(cnt <=0){
				alert("처리 대상이 없습니다.");
				return;
			}else if(cnt > 1){
				alert("수정은 1건씩만 가능합니다.");
				return;
				
			}
			param += "&modyADD_SUM=" + document.getElementById("modyADD_SUM").value;
			param += "&modyCNT=" + document.getElementById("modyCNT").value;
			title="조정계수수정";
		}
		
		var url = "/admin/commCode/jojungCodeRegisterView.do?mode=" + mode + param;
  		popUp(url, title, 580, 200);	
	}

	function deletePop(){
		var w = document.orgCodeForm;
		var cnt = cntCheck();
		if(cnt <= 0){
			alert("처리 대상이 없습니다.");
			return;
		}else{
			if (confirm(cnt + "건을 삭제하시겠습니까?")){
				w.action = "/admin/commCode/jojungCodeDelete.do";
				w.submit();
			}else{
				return;
			}
		}
		
	}

	function cntCheck(){
		var w = document.orgCodeForm;
		var select_item = document.getElementsByName("SELECT_ITEM");
		var item_check = document.getElementsByName("ITEM_CHECK");
		var add_sum_arr = document.getElementsByName("ADD_SUM_ARR");
		var cnt_arr = document.getElementsByName("CNT_ARR");

		var modyADD_SUM =  document.getElementById("modyADD_SUM");
		var modyCNT =  document.getElementById("modyCNT");

		var cnt = 0;		

		for(var i = 0 ; i < select_item.length ; i++){
			if(select_item[i].checked == true){
				item_check[i].value = select_item[i].checked;
				modyADD_SUM.value=add_sum_arr[i].value;
				modyCNT.value=cnt_arr[i].value;
				cnt++;
			}
		}
		return cnt;
	}

//]]>
</script>

<body>
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
							src="/img/sub_admin_title4_off.gif" alt="지역코드" width="110"
							height="22" border="0"></a></td>
						<td width="111"><a href="/admin/commCode/orgCode.do"><img
							src="/img/sub_admin_title5_off.gif" alt="부서코드" width="110"
							height="22" border="0"></a></td>
						<td width="111"><a
							href="/admin/commCode/purposeCode.do"><img
							src="/img/sub_admin_title6_off.gif" alt="점용목적코드" width="110"
							height="22" border="0"></a></td>
						<td width="111"><a href="/admin/commCode/taxCode.do"><img
							src="/img/sub_admin_title7_off.gif" alt="과세구분코드" width="110"
							height="22" border="0"></a></td>
						<!--  //********** BEGIN_현진_20120315 -->
						<!-- 
						<td width="111"><a href="/jsp/admin/commCode/zipCodeList.jsp"><img
							src="/img/sub_admin_title8_off.gif" alt="우편번호코드" width="110"
							height="22" border="0"></a></td>
						-->
						<td width="111"><a href="/admin/commCode/seal.do"><img
							src="/img/sub_admin_seal_off.gif" alt="직인등록" width="110"							         
							height="22" border="0"></a></td>
						<!--   //********** END_현진_20120315 -->
						<td width="111"><a
							href="#"><img
							src="/img/sub_admin_title9_on.gif" alt="조정계수" width="110"
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
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td height="20px"></td>
					</tr>
					<!-- 조회 조건 시작 -->										
					<tr>
						<td align="center">						
							<table width="100%" border="1" bordercolor="#c9dfed"
								style="border-collapse:collapse;" cellpadding="0" cellspacing="0"
								class="sub_table">
								<tr>
									<td width="150px" height="28px" align="center" bgcolor="e5eff8" class="sub_table_b">산출사용료 증가율</td>
									<td bgcolor="eaeaea" class="table_bl_left" >
										<form id="searchForm" name="searchForm">
										<table border="0" align="left">
											<tr>
												<td>
													<input type="text" id="ADD_SUM" name="ADD_SUM" value="${ADD_SUM}"  maxlength="4" onchange="isNum(this,'산출사용료 증가율')"/>
												</td>
												<td>
													<a href="#"><img src="/img/inquiry_icon2.gif" alt="조회" border="0" onClick="javascript:search();"></a>		
												</td>
											</tr>
										</table>
										</form>								
									</td>																		
								</tr>
							</table>
						</td>						
					</tr>				
					<!-- 조회  조건 끝-->
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
					     <td height="34" class="sub_stan" align="left">전체건수 : <span class="sub_stan_blue">${totalCount}</span> 건 </td>
					</tr>
					<tr>
					<td align="left">
						<form id="orgCodeForm" name="orgCodeForm">					
						<input type="hidden" id="modyADD_SUM" name="modyADD_SUM" value=""/>
						<input type="hidden" id="modyCNT" name="modyCNT" value=""/>	
						<table width="100%" border="1" bordercolor="#c9dfed"
							style="border-collapse:collapse;" cellpadding="0" cellspacing="0"
							class="sub_table">
							<tr>
								<td width="35px" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">
									<input type="checkbox" id="SELECT_ALL" name="SELECT_ALL" onclick="javascript:selectAll(this);">
								</td>
								<td width="50%" align="center" bgcolor="e5eff8" class="sub_table_b">산출사용료 증가율</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">조정계수</td>
							</tr>
							<c:forEach items="${jojungList}" var="jojungList" varStatus="idx">
								 <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''">
								 	<td width="35px" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">
								 		<input type="checkbox" id="SELECT_ITEM" name="SELECT_ITEM"/>
								 		<input type="hidden" id="ITEM_CHECK" name="ITEM_CHECK" value=""/>
								 		<input type="hidden" id="ADD_SUM_ARR" name="ADD_SUM_ARR" value="${jojungList.ADD_SUM}"/>
								 		<input type="hidden" id="CNT_ARR" name="CNT_ARR" value="${jojungList.CNT}"/>								 		
								 	</td>							
									<td height="26" align="center">${jojungList.ADD_SUM}</td>
									<td align="center">${jojungList.CNT}</td>
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
										<!-- 페이징시작 -->${strPageDivideForm}<!-- 페이징끝 -->	
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
					<c:if test="${SIGU_CD == '000'}">
					<tr>
						<td>
							<img src="/img/add_icon.gif" alt="추가" width="56" height="18" border="0" style="cursor: pointer;" onclick="javascript:registerPop('add')">
							<img src="/img/mod_icon.gif" alt="수정" width="56" height="18" border="0" style="cursor: pointer;" onclick="javascript:registerPop('modify')">
							<img src="/img/del_icon3.gif" alt="삭제" width="56" height="18" border="0" style="cursor: pointer;" onclick="javascript:deletePop()">
						</td>
					</tr>
					</c:if>
				</table>
				
				</td>
			</tr>

		</table>
		</td>
	</tr>
</table>
</body>
</html>

