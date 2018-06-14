<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />

<title>::::: 서울시 도로점용관리시스템 :::::</title>
<style type="text/css">

<!--
body {
	margin: 0px;
}
-->

</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
</head>

<script language="javascript" src="/js/PopupCalendar.js"></script> 

<script type="text/javascript">
//<![CDATA[

	function	ModifyPrc()
	{
		var form = document.form;
		
		var	obj	= document.getElementById("SAN_CK");
		
		if(obj.checked	== true)	//	산 체크
			document.getElementById("SAN_CK").value='1';
		else
			document.getElementById("SAN_CK").value='0';

		form.action = "/sisul/sisul/jumji_modify_prc.do";
		form.submit();
	}

	function	Cancel()
	{
		var form = document.form;

		form.action = "/sisul/sisul/jumji_view.do";
		form.submit();
	}

	function	Init_SANCheck(san)
	{
		if(san	== '1')	//	산 체크
			document.getElementById("SAN_CK").checked	= true;
		else
			document.getElementById("SAN_CK").checked	= false;
	}
	

	function	Init_UseType(sel)
	{
		document.getElementById("UseType1").style.display = "none";
		document.getElementById("UseType2").style.display = "none";
		
		if(sel == '2' || sel == '3')
			document.getElementById("UseType2").style.display = "block";	//	하천, 구거
		else						
			document.getElementById("UseType1").style.display = "block";	//	도로	
	}

	function	Init_UseSection(sel)
	{
		if(sel == '1')
			document.getElementById("UseSection").style.display = "block";	//	정기
		else
			document.getElementById("UseSection").style.display = "none";
	}

	function	Select_UseType(sel)
	{
		document.getElementById("UseType1").style.display = "none";
		document.getElementById("UseType2").style.display = "none";
		
		if(sel.value == '2' || sel.value == '3')	
			document.getElementById("UseType2").style.display = "block";	//	하천, 구거
		else						
			document.getElementById("UseType1").style.display = "block";	//	도로		
	}

	function	Select_UseSection(sel)
	{
		if(sel.value == '1')
			document.getElementById("UseSection").style.display = "block";	//	정기
		else
			document.getElementById("UseSection").style.display = "none";
	}

	function 	openZipcodePopup(post, addr)
	{
		var	post1	= post;
		var	addr1	= addr;

		var url 	= "/zipcode.do?openerPost=" + post1 + "&openerAddr=" + addr1;
		var winName = "우편번호입력";
		var width 	= 420;
		var height 	= 305;
		var scroll 	= "yes";
		var resize 	= "no";

		var	option	= "scrollbars=" + scroll + ", ";
		option	+= "resize=" + resize + ", ";
		option	+= "width=" + width + ", ";
		option	+= "height=" + height;

		window.open(url, winName, option);
	}

	function 	Init()
	{
		parent.TabUp_Img("jumji");
	}
	
//]]>
</script>

<body onload="Init(); Init_UseType('${board.TYPE}'); Init_UseSection('${board.SECTION}'); Init_SANCheck('${board.SAN_CK}'); Init_PurposeCode();">
<table width="780" border="0" cellpadding="0" cellspacing="0">
<form name="form" method="post">
<input type="hidden" name="ADMIN_NO" value="${ADMIN_NO}">

	<tr>
		<td align="left" class="contborder_purple">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>
			<td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
				<tr>
				  <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">점용종류</td>
				  <td bgcolor="eaeaea" class="table_bl_left"><select name="TYPE" class="input_form1" style="width:130px" OnChange="Select_UseType(this);">
					${use_type}
			      </select></td>
				  <td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">점용구분</td>
				  <td bgcolor="eaeaea" class="table_bl_left"><select name="SECTION" class="input_form1" style="width:130px" OnChange="Select_UseSection(this);">
					${occupancy_type}
				  </select></td>
				</tr>
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">소유자</td>
				  <td bgcolor="eaeaea" class="table_bl_left"><select name="OWNER_SET" class="input_form1" style="width:130px">
					${use_owner_Group}
				  </select></td>
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">세입구분</td>
				  <td bgcolor="eaeaea" class="table_bl_left"><select name="TAX_SET" class="input_form1" style="width:130px">
					${taxation_section}
				  </select></td>
				</tr>
				
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용지 지번 </td>
				  <td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					<tr>
					  <td width="64">ㅇㅇㅇ <span class="sub_stan_b">구 </span> </td>
                          <td width="72"><select name="BJ_CD" class="input_form1" style="width:70px">
                            ${bjdong_code}
                          </select></td>
                          <td><select name="HJ_CD" class="input_form1" style="width:90px">
                            ${hjdong_code}
                          </select></td>
					  <td width="20" align="right">산</td>
					  <td width="30"><input name="SAN_CK" type="checkbox"></td>
					  <td><input name="BONBUN" type="text" class="input_form1" style="width:40px" value="${board.BONBUN}">
						- <input name="BUBUN" type="text" class="input_form1" style="width:40px" value="${board.BUBUN}">
						번지 <input name="TONG" type="text" class="input_form1" style="width:30px" value="${board.TONG}">
						통 <input name="BAN" type="text" class="input_form1" style="width:30px" value="${board.BAN}"> 
						반 </td>
					  </tr>
				  </table></td>
				</tr>
				
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
				  <td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					<tr>
					  <td><input name="MUL_POST" type="text" class="input_form1" style="width:120px" value="${board.MUL_POST}"></td>
					  <td><a href="javascript:openZipcodePopup('form.MUL_POST', '');"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td>
					</tr>
				  </table></td>
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">건물(명) 정보 </td>
				  <td bgcolor="eaeaea" class="table_bl_left"><input name="BD_NM" type="text" class="input_form1" style="width:120px" value="${board.BD_NM}">
					<input name="BD_DONG" type="text" class="input_form1" style="width:30px" value="${board.BD_DONG}">
					동 <input name="BD_HO" type="text" class="input_form1" style="width:30px" value="${board.BD_HO}">
					호 </td>
				</tr>
				
                <tr style="display:none" id="UseType1">
                  <td align="center" bgcolor="e5eff8" class="sub_table_b">도로명 주소</td>
                  <td bgcolor="eaeaea" class="table_bl_left"><input name="textfield222272322" type="text" class="input_form1" style="width:100px" value="${board.SAN_CK}">
                    <input name="textfield2222722242" type="text" class="input_form1" style="width:40px" value="${board.SAN_CK}">
					- <input name="textfield22227222232" type="text" class="input_form1" style="width:40px" value="${board.SAN_CK}"></td>
                  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">주차면수</td>
                  <td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                    <tr>
                      <td><input name="PARKING_NUM" type="text" class="input_form1" style="width:100px" value="${board.PARKING_NUM}"></td>
                      <td><a href="#"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td>
                    </tr>
                  </table></td>
                </tr>
                
                <tr style="display:none" id="UseType2">
                  <td align="center" bgcolor="e5eff8" class="sub_table_b">도로명 주소</td>
                  <td bgcolor="eaeaea" class="table_bl_left"><input name="textfield222272322" type="text" class="input_form1" style="width:100px" value="${board.TYPE}">
                    <input name="textfield2222722242" type="text" class="input_form1" style="width:40px" value="${board.TYPE}">
					- <input name="textfield22227222232" type="text" class="input_form1" style="width:40px" value="${board.TYPE}"></td>
                  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">하전/구거명</td>
                  <td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                    <tr>
                      <td><input name="RIVER_NM" type="text" class="input_form1" style="width:100px" value="${board.RIVER_NM}"></td>
                      <td><a href="#"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td>
                    </tr>
                  </table></td>
                </tr>
				
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용목적</td>
				  <td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					<tr>
						<jsp:include page="/jsp/common/purposeCode/purposeCode.jsp" flush="true"/>
					</tr>
				  </table></td>
			    </tr>
			    
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용기간</td>
				  <td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					<tr>
					<td>
					  <input name="MUL_FROMDATE" type="text" class="input_form1" style="width:70px" value="${board.MUL_FROMDATE}"><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" align="absmiddle" onclick="popUpCalendar(this, document.getElementById('MUL_FROMDATE'), 'yyyymmdd')" style="CURSOR: Hand;"></a>
					   ~ <input name="MUL_TODATE" type="text" class="input_form1" style="width:70px" value="${board.MUL_TODATE}"><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" align="absmiddle" onclick="popUpCalendar(this, document.getElementById('MUL_TODATE'), 'yyyymmdd')" style="CURSOR: Hand;"></a></tr>
					</td>
					
	                <tr style="display:none" id="UseSection">
					  <td>일시점용<input name="PARTLY_PERIOD" type="text" class="input_form1" style="width:300px" value="${board.PARTLY_PERIOD}">
					  &nbsp;&nbsp;총<input name="TOTAL_PERIOD" type="text" class="input_form1" style="width:30px" value="${board.TOTAL_PERIOD}">일</td>
					</tr>
				  </table></td>
				</tr>
				
			</table></td>
		  </tr>
		  <tr>
			<td height="40" align="right">
			<table width="0" border="0" cellspacing="0" cellpadding="0" align="right">
				<a href="javascript:Cancel()"><img src="/img/can_icon.gif" alt="취소" width="56" height="18" border="0"></a>
				<a href="javascript:ModifyPrc()"><img src="/img/save_icon2.gif" alt="저장" width="56" height="18" border="0"></a>
			</table>
			</td>
		  </tr>
		</table></td>
	</tr>

</table>
</body>
</html>
