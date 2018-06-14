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
<script language='JavaScript' src='/jsp/gapan/sugeo/tab/sugeo_register.js'></script>

<script type="text/javascript">
//<![CDATA[

	
			
	// 클릭시 체크 값 세팅
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
		alert(id);
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
	}
	
//]]>
</script>


<body>

<form name="form" method="post">
<input type="hidden" name="currentPage" value="${currentPage}">
<input type="hidden" name="TOTALCNT" value="${totalcnt }">

<table width="800" border="0" cellpadding="0" cellspacing="0">
<tr>
<td align="left">
	<table width="780" border="0" cellspacing="0" cellpadding="0">
		<tr>
       		<td height="22" background="/img/tab_line_purple.gif">
       			<table border="0" cellspacing="0" cellpadding="0">
					<tr>
						<ul id="tabmenu">
						<td width="111"><a><img src="/img/sugeo_on.gif" alt="수거정보" width="110" height="22" border="0" onclick="Init();" style="CURSOR: Hand;"></a></td>
						<td width="111"><a><img src="/img/sugeo_goods_off.gif" alt="수거물품" width="110" height="22" border="0" onclick="Init(); " style="CURSOR: Hand;"></a></td>
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
								<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">수거일시</td>
								<td width="37%" bgcolor="eaeaea" class="table_bl_left">
									<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									  	<tr>
											<td><input name="rem_date" type="text" class="input_form1" style="width:120px" value="${today }" readonly></td>
											<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, rem_date, 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
											<td>&nbsp;<input name="rem_date_hh" type="text" style="width:15px" value="" maxlength="2" class="essential"> 시</td>
											<td><input name="rem_date_mm" type="text" style="width:15px" value="" maxlength="2" class="essential"> 분</td>
									  	</tr>
									</table>
								</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">수거물품</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									<select name="rem_mulcd" style="width:80px" class="essential">
										${re_typ }
									</select>
									<input type="text" name="rem_mulnm" style="width:120px" value="" maxlength="50" class="essential">
								</td>
						  	</tr>
				  			<tr>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">수거위치</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									${gu_nm } &nbsp;
									<select name="rem_bjcd" style="width:80px" class="essential">
										${bjdong_code }
									</select>
									<!-- select name="rem_hjcd" style="width:80px" class="essential">
										${hjdong_code }
									</select-->
								</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">주변정보</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									<input name="rem_addr" type="text" class="essential" style="width:120px" maxlength="25">
								</td>
						  	</tr>
						  	<tr>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">소유자명</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									<input name="rem_nm" type="text" class="input_form1" style="width:120px" value="" maxlength="10">
								</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">점용면적</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									<input name="rem_area" type="text" class="input_form1" style="width:120px" value=""  onKeyDown="nr_num_float(this);" onKeyUp="nr_num_float(this);" onKeyPress="nr_num_float(this);" maxlength="10"> ㎡
								</td>
						  	</tr>
							<tr>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">보관기간</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									  	<tr>
											<td><input name="rem_svfrom" type="text" class="input_form1" style="width:80px" value="" readonly onChange="showDate('1')"></td>
											<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, rem_svfrom, 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
											<td><input name="rem_svto" type="text" class="input_form1" style="width:80px" value="" readonly onChange="showDate('1')"></td>
											<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, rem_svto, 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
											<td><span id="rem_sv_date"></span></td>
									  	</tr>
									</table>
								</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">보관장소</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									<input name="rem_svplace" type="text" class="input_form1" style="width:120px" value="" maxlength="25">
								</td>
							</tr>
							<tr>
								<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">변질물 보관일시</td>
								<td bgcolor="eaeaea" class="table_bl_left" colspan="3">
									<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									  	<tr>
											<td><input name="rem_badfrom" type="text" class="input_form1" style="width:80px" value="" readonly></td>
											<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, rem_badfrom, 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
											<td><input name="rem_badto" type="text" class="input_form1" style="width:80px" value="" readonly></td>
											<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, rem_badto, 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
											<td><span id="rem_bad_date"></span></td>
									  	</tr>
									</table>
								</td>
								<!-- td align="center" bgcolor="e5eff8" class="sub_table_b">(변질물품)</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									<input name="" type="text" class="input_form1" style="width:120px" value="">
								</td-->
							</tr>
							<tr>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">특이사항</td>
								<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
									<input name="rem_bigo" type="text" class="input_form1" style="width:500px" maxlength="50">
								</td>
							</tr>
						   	<tr>
							  	<td height="30" colspan="2" align="left" bgcolor="#FFFFFF" class="">
							  		<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
										<tr>
									  		<td><span class="sub_stan_blue">&nbsp; * 담당정보</span></td>
										</tr>
								  	</table>
								</td>
								<td height="30" colspan="2" align="left" bgcolor="#FFFFFF" class="">
							  		<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
										<tr>
									  		<td><span class="sub_stan_blue">&nbsp; * 공고정보</span></td>
										</tr>
								  	</table>
								</td>
						    </tr>
							<tr>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">소속</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									<input name="chg_org" type="text" class="input_form1" style="width:120px" value="${dept_nm }">
								</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">공고일자</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									  	<tr>
											<td><input name="ann_date" type="text" class="input_form1" style="width:80px" value="${today }" readonly></td>
											<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, ann_date, 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
									  	</tr>
									</table>
								</td>
							</tr>
						 	<tr>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">직급/성명</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									<!-- input name="chg" type="text" class="input_form1" style="width:120px" value=""-->
									<input name="chg_nm" type="text" class="input_form1" style="width:120px" value="${chg_nm }" maxlength="10">	
								</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">공고번호</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									<input name="ann_no" type="text" class="input_form1" style="width:120px" value="" maxlength="20">
								</td>
						  	</tr>						  	
		                  	</table></td>
		                </tr>
				</table>
			</div>
			
			<div class="tabcontent" style="display:none" id="tab2">
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td>
							<!-- iframe width="100%" height="100%" frameborder="0" scrolling="no" src="/gapan/sugeo/goods_search.do"></iframe-->
							<table width="100%" border="0" cellspacing="0" cellpadding="0">
								<tr>
							    	<td>
										<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
											<tr>
												<td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">번호</td>
												<td align="center" bgcolor="e5eff8" class="sub_table_b">물품명</td>
												<td align="center" bgcolor="e5eff8" class="sub_table_b">수량</td>
												<td align="center" bgcolor="e5eff8" class="sub_table_b">보관기간</td>
												<td align="center" bgcolor="e5eff8" class="sub_table_b">보관장소</td>
												<td align="center" bgcolor="e5eff8" class="sub_table_b">진행상황</td>
											</tr>
										                   
										<c:choose>
										<c:when test='${blist != null && !empty blist}'>
											<c:forEach items="${blist}" var="board" varStatus="idx">
											<tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" style="cursor:pointer"
												onclick="goodsView('${board.goods_seq }')">
												<td height="26" align="center">${board.RN}</td>
												<td align="center">${board.goods_nm}</td>
												<td align="center">${board.goods_cnt}</td>
												<td align="center">${board.goods_svfrom} <c:if test="${ board.goods_svto != null }"> ~ ${board.goods_svto }</c:if></td>
												<td align="center">${board.goods_svnm}</td>
												<td align="center">${board.goods_status}</td>
											</tr>
											</c:forEach>
										</c:when>
										<c:otherwise>
											<tr>
												<td align="center" class="sub_table" colspan="6" height="75"> 내용이 없습니다</td>
											</tr>
											<tr>
										</c:otherwise>
										</c:choose>
										</table>
									</td>
								</tr>
								<tr>
							    	<td height="30" align="center">
							    		<table border="0" cellspacing="0" cellpadding="0">
							            	<tr>
												${pageing}
							                </tr>
							            </table>
									</td>
								</tr>
							</table>
						</td>
					</tr>
					
					<tr><td height="28"></td></tr>
	                <tr>
	                  	<td>
	                  	<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
						  	<tr>
								<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">물품명</td>
								<td bgcolor="eaeaea" class="table_bl_left" colspan="3">
									<input name="goods_nm" type="text"  class="essential" style="width:350px" value="" maxlength="25">
								</td>							
							</tr>
							<tr>
								<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">수량</td>
								<td width="37%" bgcolor="eaeaea" class="table_bl_left">
									<input name="goods_cnt" type="text" class="essential" style="width:40px; ime-mode:disabled" value="" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, goods_cnt, 5);" maxlength="5">
								</td>
								<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">변질가능여부</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									<input name="goods_cqyn" type="checkbox" value="0" onclick="javascript:click_idchk(this);"> 변질가능
								</td>
						  	</tr>
						  	<tr>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">보관기간</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									  	<tr>
											<td><input name="goods_svfrom" type="text" class="input_form1" style="width:120px" value=""></td>
											<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, goods_svfrom, 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
											<td><input name="goods_svto" type="text" class="input_form1" style="width:120px" value=""></td>
											<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, goods_svto, 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
									  	</tr>
									</table>
								</td>
								<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">보관장소</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									<input name="goods_svnm" type="text" class="input_form1" style="width:120px" maxlength="25">
								</td>
						  	</tr>
						  	<tr>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">진행상황</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									<select name="goods_status" class="essential" style="width:100px">
										${gd_sta}
									</select>
								</td>
								<td align="center" bgcolor="e5eff8" class="sub_table_b">처리일자</td>
								<td bgcolor="eaeaea" class="table_bl_left">
									<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									  	<tr>
											<td><input name="goods_date" type="text" class="input_form1" style="width:120px" value="${today }"></td>
											<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, goods_date, 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
									  	</tr>
									</table>
								</td>
						  	</tr>					  	
							<tr>
								<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">특이사항</td>
								<td width="37%" colspan="3" bgcolor="eaeaea" class="table_bl_left" nowrap="nowrap">
									<input name="goods_bigo" type="text" class="input_form1" style="width:95%" value="" maxlength="50">
								</td>
							</tr>
						
	                  	</table>
	                  	</td>
				  	</tr>
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
</script>
