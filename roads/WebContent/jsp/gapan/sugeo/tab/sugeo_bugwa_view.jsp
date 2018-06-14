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
	background-image: url/img/left_back.gif);
}
-->

</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
</head>

<script language="javascript" src="/js/PopupCalendar.js"></script>
<script language='JavaScript' src='/js/Check_inputbox.js'></script>
<script language='JavaScript' src='/jsp/gapan/sugeo/tab/sugeo_bugwa_register.js'></script>

<script type="text/javascript">
//<![CDATA[
			
	// 체크 값 세팅
	function click_idchk(obj)
	{
		if(obj.checked == true)
		{
			obj.value = "1";
		}
		else
		{
			obj.value = "0";
		}
	}
	
	
	//라디오 버튼 및 체크 버튼의 테두리 없애는 함수
	function RemoveOutline()
	{
		for(i=0;i<document.getElementsByTagName("input").length;i++)
		{
			objinput = document.getElementsByTagName("input");
			if(objinput[i].type == "radio" || objinput[i].type == "checkbox")
			{
				objinput[i].style.border = 0;
			}
		}
	}
	
	//기간 계산하기 
	function showDate(id){
		//alert(id);
		var f = document.form;
		if( id == '1' ){
			var rem_svfrom = document.getElementById("rem_svfrom"); //시작일
			var rem_svto = document.getElementById("rem_svto"); 	//만료일
			var rem_sv_date = document.getElementById("rem_sv_date");
			
			rem_sv_date.innerHTML = "";
			
			if( rem_svfrom != '' && rem_svto != '' ){
				v1=f.rem_svfrom.value.split("-");
				v2=f.rem_svto.value.split("-");
				
				a1=new Date(v1[0],v1[1]-1,v1[2]).getTime();
				a2=new Date(v2[0],v2[1]-1,v2[2]).getTime();
				b=(a2-a1)/(1000*60*60*24);
				//f.t2.value=b;
				rem_sv_date.innerHTML = "("+b+"일)";
			}
		
		}
		else if( id == '2'){
		
			var rem_badfrom = document.getElementById("rem_badfrom"); //시작일
			var rem_badto = document.getElementById("rem_badto"); 		//만료일
			var rem_bad_date = document.getElementById("rem_bad_date");
			
			rem_sv_date.innerHTML = "";
			
			if( rem_badfrom != '' && rem_badto != '' ){
				v1=f.rem_badfrom.value.split("-");
				v2=f.rem_badto.value.split("-");
				
				a1=new Date(v1[0],v1[1]-1,v1[2]).getTime();
				a2=new Date(v2[0],v2[1]-1,v2[2]).getTime();
				b=(a2-a1)/(1000*60*60*24);
				//f.t2.value=b;
				rem_bad_date.innerHTML = "("+b+"일)";
			}
		
		}
	}
	
	
	// 과태료 계산 (식이 없어 일단 보류.. 2009.7.29 )
	function goCal(){
		var f = document.form;
		
		//alert(f.bugwa_yn.value);
		if( f.bugwa_yn.value == '1' ){
			alert("과태료 미부과에 체크하였습니다. 확인하세요. ");
			f.bugwa_yn.focus();
			return;
		}
		if( f.bugwa_area.value == '' ){
			alert("점용면적을 입력하세요 ");
			f.bugwa_area.focus();
			return;
		}
		if( f.bugwa_danga.value == '' ){
			alert("기준금액을 입력하세요 ");
			f.bugwa_danga.focus();
			return;
		}
		if( f.bugwa_tax.value == '' ){
			alert("기본 과태료를 입력하세요 ");
			f.bugwa_tax.focus();
			return;
		}
		if( f.bugwa_red_rate.value == '' ){
			alert("감면율을 입력하세요 ");
			f.bugwa_red_rate.focus();
			return;
		}
		var bugwa_area = f.bugwa_area.value;
		var bugwa_danga = f.bugwa_danga.value;
		var bugwa_tax = f.bugwa_tax.value;
		var bugwa_red_rate = f.bugwa_red_rate.value;
		
		var bugwa_red_tax = Number(bugwa_danga) * Number(bugwa_area) * (Number(bugwa_red_rate)*0.01);
		//alert(bugwa_red_tax);
		
	}
	window.onload = tabMenu;
	function tabMenu() {
		var tabs = document.getElementById('tabmenu');
		var tab = tabs.getElementsByTagName('a'); // 탭 요소
		var contents = document.getElementById('tabcontents');
		var content = getElementsByClassName('tabcontent',contents); // 컨텐츠 요소 class
		var type = true; // 롤오버의 true / false 
		for (var i=0; i<tab.length; i++) {
			tabDisplay(tab,content,0,true);
			tabAct(tab,content,i,type);
		}
		var showTab = '${showTab}';
		if( showTab != '' ){
			tabDisplay(tab,content,1);
		}
		//check();
	}
	
	// 체크박스 체크
	function check(){
		var f = document.form;
		var bugwa_yn = f.bugwa_yn;		
		if( bugwa_yn.value == '1' ){
			f.bugwa_yn.checked = 'true';
		}
	}
	
	
	// 탭이동
	function tabMove(sale){	
		var mul_no = document.form.mul_no.value;		
		location.href = "/gapan/sugeo/sugeo_bugwa_view.do?showTab="+sale+"&mul_no="+mul_no;
	}
	
	// 수정화면 이동
	function	goModify(mul_no, showTab)
	{
		var form = document.form;
		//form.action = "sugeo_bugwa_modify.do?showTab=showTab&goods_seq="+goods_seq+"&mul_no="+mul_no;
		form.action = "sugeo_bugwa_register_view.do?mul_no="+mul_no+"&showTab="+showTab;
		form.submit();
	}
	
//]]>
</script>


<body>

<form name="form" method="post">
<input type="hidden" name="mul_no" value="${mul_no }">
<input type="hidden" name="owner_ssn" value="">
<input type="hidden" name="owner_tel" value="">
<input type="hidden" name="owner_hp" value="">
<input type="hidden" name="message" value="${message }">

<table width="800" border="0" cellpadding="0" cellspacing="0">
<tr>
<td align="left">
	<table width="780" border="0" cellspacing="0" cellpadding="0">
		<tr>
       		<td height="22" background="/img/tab_line_purple.gif">
       			<table border="0" cellspacing="0" cellpadding="0">
					<tr>
						<ul id="tabmenu">
						<td width="111"><a><img src="/img/bugwa_on.gif" alt="과태료정보" width="110" height="22" border="0" onclick="Init();" style="CURSOR: Hand;"></a></td>
						<td width="111"><a><img src="/img/sale_off.gif" alt="폐기/매각" width="110" height="22" border="0" onclick="Init();" style="CURSOR: Hand;"></a></td>
						</ul>
   			        </tr>
				</table>
			</td>
		</tr>
		
		<tr>
           	<td align="left" class="contborder_purple">
	
	
		<div id="tabcontents">
		
			<div class="tabcontent" id="tab1">
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
					<td>
						<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
						  	<tr>
								<td height="30" colspan="4" align="left" bgcolor="#FFFFFF" class="">
							  		<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
										<tr>
									  		<td><span class="sub_stan_blue">&nbsp; * 소유자 정보</span></td>
										</tr>
								  	</table>
								</td>
						  	</tr>
				  			<tr>
								<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">소유자명</td>
								<td width="37%" bgcolor="eaeaea" class="table_bl_left">
									${sugeo.owner_nm }
								</td>
								<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">주민등록번호</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									${sugeo.owner_ssn1 } - 
									${sugeo.owner_ssn2 }
								</td>
						  	</tr>
						  	<tr>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									${sugeo.owner_zip }
								</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">주소</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									${sugeo.owner_zip_addr1 }
									${sugeo.owner_zip_addr2 }
								</td>
						  	</tr>
						  	
						  	<tr>
								<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">전화번호</td>
								<td width="37%" bgcolor="eaeaea" class="table_bl_left">
									${sugeo.owner_tel1 }
									${sugeo.owner_tel2 }
									${sugeo.owner_tel3 }
								</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">휴대전화</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									${sugeo.owner_hp1 }
									${sugeo.owner_hp2 }
									${sugeo.owner_hp3 }
								</td>
						  	</tr>
				  			<tr>
								<td height="30" colspan="4" align="left" bgcolor="#FFFFFF" class="">
							  		<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
										<tr>
									  		<td><span class="sub_stan_blue">&nbsp; * 과태료 부과 : </span>
									  			${sugeo.bugwa_yn_name }
									  		</td>
										</tr>
								  	</table>
								</td>						
						  	</tr>
						  	<tr>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용면적</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									${sugeo.bugwa_area }
								</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">기준금액 </td>
								<td bgcolor="eaeaea" class="table_bl_left">
									${sugeo.bugwa_danga }
								</td>
						  	</tr>
							<tr>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">기본 과태료</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									${sugeo.bugwa_tax }
								</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">감면율</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									${sugeo.bugwa_red_rate }
									<!--  input type="checkbox" name="bugwa" value="0" onclick="javascript:click_idchk(this);"> 미반영-->
								</td>
							</tr>
							<tr>
								<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">감면 과태료</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									${sugeo.bugwa_red_tax }
								</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">최종 산출식</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									${sugeo.bugwa_form }
								</td>
							</tr>
							<tr>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">특이사항 </td>
								<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
									${sugeo.bugwa_bigo }
								</td>
							</tr>
						   							  	
		                  	</table></td>
		                </tr>
		                <tr>
		                	<c:choose>
			                	<c:when test="${fine_cnt == '0'  }">
			                		<td height="40" align="right"><a href="javascript:goModify('${mul_no }','');"><img src="/img/add_icon.gif" alt="추가 " width="56" height="18" border="0"></a>
			                	</c:when>
			                	<c:otherwise>
									<td height="40" align="right"><a href="javascript:goModify('${mul_no }','');"><img src="/img/mod_icon.gif" alt="수정 " width="56" height="18" border="0"></a>
								</c:otherwise>
							</c:choose>
							<!-- td height="40" align="right"><a href="javascript:goModify('${mul_no }','');"><img src="/img/mod_icon.gif" alt="수정 " width="56" height="18" border="0"></a-->
						</td>
					</table>
			</div>
			
			<div class="tabcontent" style="display:none" id="tab2">
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
	                <tr>
	                  	<td>
	                  	<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
						  	<tr>
								<td height="30" colspan="2" align="left" bgcolor="#FFFFFF" class="">
							  		<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
										<tr>
									  		<td><span class="sub_stan_blue">&nbsp; * 처리정보 </span>
									  		</td>
										</tr>
								  	</table>
								</td>
								<td height="30" colspan="2" align="left" bgcolor="#FFFFFF" class="">
							  		<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
										<tr>
									  		<td><span class="sub_stan_blue">&nbsp; * 공고정보 </span>
									  		</td>
										</tr>
								  	</table>
								</td>
							</tr>
							<tr>
								<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">처리방향</td>
								<td width="37%" bgcolor="eaeaea" class="table_bl_left">
									${sugeo.sale_type_name }
								</td>
								<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">공고일자</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									  	<tr>
											<td>${sugeo.sale_date }</td>
											<td></td>
									  	</tr>
									</table>
								</td>
						  	</tr>
						  	<tr>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">처리사유</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									${sugeo.sale_bigo}
								</td>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">공고번호</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									${sugeo.sale_no }
								</td>
						  	</tr>
						  	<tr>
								<td height="30" align="left" class="sub_table_b" colspan="4">
									<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
										<tr>
									  		<td><span class="sub_stan_blue">&nbsp; * 처리결과 </span>
									  		</td>
										</tr>
								  	</table>
								</td>
							</tr>
							<tr>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">처리결과</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									${sugeo.hnd_type_name }
								</td>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">결정일자</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									  	<tr>
											<td>${sugeo.hnd_desdate }</td>
											<td></td>
									  	</tr>
									</table>
								</td>
						  	</tr>
						  	<tr>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">처리업체명</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									${sugeo.hnd_office }
								</td>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">시행일자</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									  	<tr>
											<td>${sugeo.hnd_opedate }</td>
											<td></td>
									  	</tr>
									</table>
								</td>
						  	</tr>	
							<tr>
								<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">특이사항</td>
								<td width="37%" colspan="3" bgcolor="eaeaea" class="table_bl_left" nowrap="nowrap">
									${sugeo.hnd_bigo }
								</td>
							</tr>
						
	                  	</table>
	                  	</td>
				  	</tr>
				  	<tr>
				  		<c:choose>
			                <c:when test="${sale_cnt == '0'  }">
							<td height="40" align="right"><a href="javascript:goModify('${mul_no }','showTab');"><img src="/img/add_icon.gif" alt="추가 " width="56" height="18" border="0"></a></td>
							</c:when>
							<c:otherwise>
							<td height="40" align="right"><a href="javascript:goModify('${mul_no }','showTab');"><img src="/img/mod_icon.gif" alt="수정 " width="56" height="18" border="0"></a></td>
							</c:otherwise>
						</c:choose>						
					</tr>
					<tr><td height="40"></td></tr>
				</table>
			</div>
			
		</div>
		</td>
		</tr>
	</table></td>
	</tr>
</form>
</table>
</body>
</html>

<script language="javascript">
	//HTML또는 JSP 페이지의 마지막 부분에 다음과 같이 삽입하자.
	RemoveOutline();
	
	//select의 option을 선택된 값으로 지정
	function setSelectedOption(obj, val){
		for(i = 0 ; i < obj.options.length ; i++){
			if(obj.options[i].value == val){
				obj.options[i].selected = true;
				return;
			}
		}
	}
	//setSelectedOption(document.form.sale_type, '${sugeo.sale_type}');
	//setSelectedOption(document.form.hnd_type, '${sugeo.hnd_type}');
	
	function InitPage()
	{
		var obj = document.form.message.value;
		
		if(obj != "")	
			alert(obj);
			return;
	}
</script>
