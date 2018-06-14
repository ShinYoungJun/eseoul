<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/loginCheck.jsp" %>
<%@ include file="/jsp/common/include.jsp" %>


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

<script language='JavaScript' src='/js/Check_inputbox.js'></script>
<script language="javascript" src="/js/Ajax_request.js"></script>


<script type="text/javascript">
//<![CDATA[

	function	Page(page)
	{
		if(page	==	"")
			return;
		
		var form = document.form;

		form.action = "minwon_view.do?currentPage=" + page;
		form.submit();
	}

	function	Result_InfoView(obj)
	{
		//document.write(obj);
        var xmldoc 	= new ActiveXObject("Microsoft.XMLDOM");
        var form 	= document.form;
		
        xmldoc.async	= false;
		xmldoc.loadXML(obj);

		form.ADMIN_NO.value		=	xmldoc.getElementsByTagName("ADMIN_NO").item(0).text;
		form.SEQ.value			=	xmldoc.getElementsByTagName("SEQ").item(0).text;
		form.REQ_NO.value		=	xmldoc.getElementsByTagName("REQ_NO").item(0).text;
		form.GUBUN.value		=	xmldoc.getElementsByTagName("GUBUN").item(0).text;
		form.REQ_DATE.value		=	xmldoc.getElementsByTagName("REQ_DATE").item(0).text;
		form.PREDATE.value		=	xmldoc.getElementsByTagName("PREDATE").item(0).text;
		form.REQ_DEP.value		=	xmldoc.getElementsByTagName("REQ_DEP").item(0).text;
		form.MANAGE_DEP.value	=	xmldoc.getElementsByTagName("MANAGE_DEP").item(0).text;
		form.REQ_NM.value		=	xmldoc.getElementsByTagName("REQ_NM").item(0).text;
		form.MANAGER.value		=	xmldoc.getElementsByTagName("MANAGER").item(0).text;
		form.NOTES.value		=	xmldoc.getElementsByTagName("NOTES").item(0).text;
		form.AGENT_NM.value		=	xmldoc.getElementsByTagName("AGENT_NM").item(0).text;
		form.AGENT_TEL.value	=	xmldoc.getElementsByTagName("AGENT_TEL").item(0).text;
		form.NAME.value			=	xmldoc.getElementsByTagName("NAME").item(0).text;

		/* 2014.08.06 주민번호 * 적용 */
		var ssn = xmldoc.getElementsByTagName("SSN").item(0).text;
		var ssnAsterisk = ssn.substring(7).replace(/./g, '*');
		form.SSN.value = ssn.substring(0, 7) + ssnAsterisk;
		
		//form.SSN.value			=	xmldoc.getElementsByTagName("SSN").item(0).text;
		
		form.POST.value			=	xmldoc.getElementsByTagName("POST").item(0).text;
		form.ADDR1.value		=	xmldoc.getElementsByTagName("ADDR1").item(0).text;
		form.ADDR2.value		=	xmldoc.getElementsByTagName("ADDR2").item(0).text;
		form.TEL.value			=	xmldoc.getElementsByTagName("TEL").item(0).text;
		form.HP.value			=	xmldoc.getElementsByTagName("HP").item(0).text;
		form.DORO_ADDR1.value	=	xmldoc.getElementsByTagName("DORO_ADDR1").item(0).text;
		form.DORO_ADDR2.value	=	xmldoc.getElementsByTagName("DORO_ADDR2").item(0).text;
	}

	function	View(adminno, seq)
	{	
		params	= "ADMIN_NO=" + adminno + "&SEQ=" + seq;
		
		sendRequest("/jumyong/jumyonginfo/minwon_view_search.do", params, "GET", Result_InfoView);

	//	document.getElementById("SEQ").value	= seq;

	//	parent.BugwaView(seq);
	}

	function	Register()
	{
		var form = document.form;

		form.action = "/jumyong/jumyonginfo/minwon_register.do";
		form.submit();
	}
	
	function	Modify()
	{
		var form = document.form;
		
		if(form.REQ_DATE.value	== "")
		{
			alert("수정할 데이터를 선택하세요.");
			return;
		}

		form.action = "/jumyong/jumyonginfo/minwon_modify.do";
		form.submit();
	}

	function 	Init()
	{
		var ADMIN_NO = document.getElementById("ADMIN_NO").value;
		var SEQ = document.getElementById("SEQ").value;
		
		if(SEQ !="") View(ADMIN_NO, SEQ);
//		View("200911680101-2-0019","6");
		parent.Tab_Img("minwon");
	}

//]]>
</script>

<body onload="Init()">
<table width="780" border="0" cellpadding="0" cellspacing="0">
<form id="form" name="form" method="post">
<input type="hidden" id="ADMIN_NO" name="ADMIN_NO" value=${ADMIN_NO}>
<input type="hidden" id="SEQ" name="SEQ" value="${SEQ}">
<input type="hidden" id="SECTION" name="SECTION" value="${SECTION}">

	  <tr>
		<td align="left" class="contborder_blue">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">

        <tr>
          <td height="34" class="sub_stan">전체건수 : <span class="sub_stan_blue">${totalcnt}</span> 건 </td>
        </tr>
		<tr>
			<td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
			<tr>
		        <td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">번호</td>
		        <td align="center" bgcolor="e5eff8" class="sub_table_b">접수번호</td>
		        <td align="center" bgcolor="e5eff8" class="sub_table_b">접수자</td>
		        <td align="center" bgcolor="e5eff8" class="sub_table_b">민원구분</td>
		        <td align="center" bgcolor="e5eff8" class="sub_table_b">민원인</td>
		        <td align="center" bgcolor="e5eff8" class="sub_table_b">접수일자</td>
		        <td align="center" bgcolor="e5eff8" class="sub_table_b">처리일자</td>
		        <td align="center" bgcolor="e5eff8" class="sub_table_b">담당자</td>
			</tr>
      
			<c:choose>
				<c:when test="${blist!= null && !empty blist}">
                      <c:forEach items="${blist}" var="board" varStatus="idx">
	                     <tr onClick="javascript:View('${board.ADMIN_NO}','${board.SEQ}')" onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" style="CURSOR: Hand;" >
	                     	<td height="26" align="center">${board.RN}</td>
        					<td align="center">${board.REQ_NO}</td>
        					<td align="center">${board.REQ_NM}</td>
        					<td align="center">${board.GUBUN}</td>
        					<td align="center">${board.NAME}</td>
        					<td align="center">${rnic:addDash(board.REQ_DATE)}</td>
        					<td align="center">${rnic:addDash(board.PREDATE)}</td>
        					<td align="center">${board.MANAGER}</td>
	                     </tr>
					 </c:forEach>
				</c:when>
				<c:otherwise>
					<tr>
						<td align="center" class="sub_table" colspan="11" height="26">검색된 내용이 없습니다</td>
					</tr>
				</c:otherwise>
			 </c:choose>
			  
			</table></td>
		</tr>
		
		<tr>
		  <td height="30" align="center"><table border="0" cellspacing="0" cellpadding="0">
			<tr>
				${pageing}
			</tr>
		  </table></td>
		</tr>

			<tr>
				<td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
			  	<tr>
					<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">접수번호</td>
					<td width="37%" bgcolor="eaeaea" class="table_bl_left"><input id="REQ_NO" name="REQ_NO" type="text" class="view" style="width:120px" readonly></td>
					<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">민원구분</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input id="GUBUN" name="GUBUN" type="text" class="view" style="width:120px" readonly></td>
			  	</tr>
				
			  	<tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">접수일자</td>
					<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
				  	<tr>
						<td><input id="REQ_DATE" name="REQ_DATE" type="text" class="view" style="width:120px" readonly></td>
				  	</tr>
					</table></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">처리예정일자</td>
					<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
				  	<tr>
						<td><input id="PREDATE" name="PREDATE" type="text" class="view" style="width:120px" readonly></td>
				  	</tr>
					</table></td>
			  	</tr>
			  
			  	<tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">접수부서</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input id="REQ_DEP" name="REQ_DEP" type="text" class="view" style="width:250px" readonly></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">담당부서</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input id="MANAGE_DEP" name="MANAGE_DEP" type="text" class="view" style="width:120px" readonly></td>
			  	</tr>
			  
				<tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">접수자명</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input id="REQ_NM" name="REQ_NM" type="text" class="view" style="width:120px" readonly></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">담당자명</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input id="MANAGER" name="MANAGER" type="text" class="view" style="width:120px" readonly></td>
				</tr>
				  
				<tr>
					<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">민원요지</td>
					<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
					<table width="100%" border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<input id="NOTES" name="NOTES" type="text" class="view" style="width:98%" readonly>
					</table></td>
				</tr>
				
				<tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">대리인</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input id="AGENT_NM" name="AGENT_NM" type="text" class="view" style="width:120px" readonly></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">대리인 연락처</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input id="AGENT_TEL" name="AGENT_TEL" type="text" class="view" style="width:120px" readonly></td>
				</tr>

				<tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">민원인명</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input id="NAME" name="NAME" type="text" class="view" style="width:120px" readonly></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">민원인 주민번호</td>
					<td bgcolor="eaeaea" class="table_bl_left">
						<input id="SSN" name="SSN" type="text" class="view" style="width:120px" readonly>
					</td>
				</tr>
			  	<!--  //********** BEGIN_현진_20120215 -->
			  	<!-- 
			  	<tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">민원인 우편번호</td>
					<td bgcolor="eaeaea" class="table_bl_left">
						<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
							<tr>
							  	<td><input id="POST" name="POST" type="text" class="view" style="width:50px" readonly></td>
							</tr>
						</table>
					</td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">민원인 주소</td>
					<td bgcolor="eaeaea" class="table_bl_left">
						<input id="ADDR1" name="ADDR1" type="text" class="view" style="width:250px" readonly>
						<input id="ADDR2" name="ADDR2" type="text" class="view" style="width:250px" value="" readonly>
					</td>
			  	</tr>
			  	 -->
			  	<tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
					<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
					<table width="100%" border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<input id="POST" name="POST" type="text" class="view" style="width:50px" readonly>
					</table></td>
				</tr>
			  	<tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">기본 주소</td>
					<td bgcolor="eaeaea" class="table_bl_left">
						<input id="ADDR1" name="ADDR1" type="text" class="view" style="width:250px" readonly>
						<input id="ADDR2" name="ADDR2" type="text" class="view" style="width:250px" value="" readonly>
					</td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">도로명 주소</td>
					<td bgcolor="eaeaea" class="table_bl_left">
						<input id="DORO_ADDR1" name="DORO_ADDR1" type="text" class="view" style="width:250px" readonly>
						<input id="DORO_ADDR2" name="DORO_ADDR2" type="text" class="view" style="width:250px" value="" readonly>
					</td>
			  	</tr>				
				<!--   //********** END_현진_20120215 -->
				<tr>
					<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">민원인 전화</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input id="TEL"  name="TEL" type="text" class="view" style="width:120px" readonly></td>
					<td align="center" bgcolor="e5eff8" class="sub_table_b">민원인 휴대폰</td>
					<td bgcolor="eaeaea" class="table_bl_left"><input id="HP" name="HP" type="text" class="view" style="width:120px" readonly></td>
			  	</tr>
		   	    <tr>
        			<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">비고</td>
      				<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
	       			${REFERENCE}
      				</td>
        		</tr> 
			  </table></td>
			</tr>

			<tr>
			  <td height="40" align="right">
			  	<c:if test="${SECTION != '4'}">
			  		<c:choose>
					<c:when test="${blist!= null && !empty blist}">
					<a href="javascript:Modify()"><img src="/img/mod_icon.gif" alt="수정" border="0"></a>
					</c:when>
					<c:otherwise>
						<a href="javascript:Register()"><img src="/img/add_icon.gif" alt="추가" border="0"></a>
					</c:otherwise>
				 	</c:choose>				
		 		</c:if> 
			  </td>
			</tr>
			
		</table></td>
	  </tr>

</table>

</body>
</html>
