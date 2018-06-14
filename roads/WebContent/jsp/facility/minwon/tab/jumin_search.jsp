<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
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
	background-image: url(/img/left_back.gif);
}
-->
</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
</head>

<script language="javascript" src="/js/PopupCalendar.js"></script> 
<script language='JavaScript' src='/js/Check_inputbox.js'></script>
<script language='JavaScript' src='/js/Ajax_request.js'></script>

<script type="text/javascript">
//<![CDATA[

	function	Page(page)
	{
		if(page	==	"")
			return;
		
		var form1 = document.form1;
	//	var	LISTVIEW	= document.getElementById("LISTVIEW");
	//	LISTVIEW.value	= "1";
		
		form1.currentPage.value	= page;

		form1.action = "/facility/minwon/jumin_search.do";
		form1.submit();
	}
	
	function	Search()
	{
		var form1 		= document.form1;
//		var	LISTVIEW	= document.getElementById("LISTVIEW");
//		LISTVIEW.value	= "1";
		
//		var	date	= DateCheck();
//		if(date	== true)
//			return;
	
		form1.currentPage.value	= 1;

		form1.action = "/facility/minwon/jumin_search.do";
		form1.submit();
	}
	
	function onCheck(){
		var form1 	= document.form1;
		
		if(form1.MIN_REQNO.value.length == '18'){
			form1.MIN_NAME.focus();
		}
	}	
	
/*

ajax 함수

*/	

	function Appeal_Modify(corp_cd){

		var param = "&CORP_CD="+corp_cd;

		sendRequest("/facility/minwon/jumin_ajax_tab.do", param, "GET", ResultAdminBizView);
	}

	function	ResultAdminBizView(obj)
	{
		
		  var xmldoc = new ActiveXObject("Microsoft.XMLDOM");

		  xmldoc.async	= false;
		  
		  xmldoc.loadXML(obj);
		  
		  
		  
		  if(xmldoc.getElementsByTagName("NAME").length >0 && xmldoc.getElementsByTagName("NAME").item(0).firstChild != null)  parent.tab1.document.getElementById("NAME").value 	  = xmldoc.getElementsByTagName("NAME").item(0).firstChild.nodeValue; 			 		    
		  else parent.tab1.document.getElementById("NAME").value = "";  
		  if(xmldoc.getElementsByTagName("CORP_CD").length >0 && xmldoc.getElementsByTagName("CORP_CD").item(0).firstChild != null)  parent.tab1.document.getElementById("CORP_CD").value 	  = xmldoc.getElementsByTagName("CORP_CD").item(0).firstChild.nodeValue;			 		    
		  else parent.tab1.document.getElementById("CORP_CD").value = "";	  
		  //  parent.tab1.document.getElementById("GU_CODE").value 	 = xmldoc.getElementsByTagName("GU_CODE").item(0).firstChild.nodeValue;
		   if(xmldoc.getElementsByTagName("OFFICE").length >0 && xmldoc.getElementsByTagName("OFFICE").item(0).firstChild != null)  parent.tab1.document.getElementById("OFFICE").value 	 = xmldoc.getElementsByTagName("OFFICE").item(0).firstChild.nodeValue;
		   else parent.tab1.document.getElementById("OFFICE").value = "";
		   if(xmldoc.getElementsByTagName("jumin_ssn1").length >0 && xmldoc.getElementsByTagName("jumin_ssn1").item(0).firstChild != null) parent.tab1.document.getElementById("jumin_ssn1").value 	 = xmldoc.getElementsByTagName("jumin_ssn1").item(0).firstChild.nodeValue;
		   else parent.tab1.document.getElementById("jumin_ssn1").value = "";
		   if(xmldoc.getElementsByTagName("jumin_ssn2").length >0 && xmldoc.getElementsByTagName("jumin_ssn2").item(0).firstChild != null) parent.tab1.document.getElementById("jumin_ssn2").value 	 = xmldoc.getElementsByTagName("jumin_ssn2").item(0).firstChild.nodeValue;
		   else parent.tab1.document.getElementById("jumin_ssn2").value = ""; 
		   if(xmldoc.getElementsByTagName("jumin_bizssn1").length >0 && xmldoc.getElementsByTagName("jumin_bizssn1").item(0).firstChild != null) parent.tab1.document.getElementById("jumin_bizssn1").value 	 = xmldoc.getElementsByTagName("jumin_bizssn1").item(0).firstChild.nodeValue;
		   else parent.tab1.document.getElementById("jumin_bizssn1").value = ""; 
		   if(xmldoc.getElementsByTagName("jumin_bizssn2").length >0 && xmldoc.getElementsByTagName("jumin_bizssn2").item(0).firstChild != null) parent.tab1.document.getElementById("jumin_bizssn2").value 	 = xmldoc.getElementsByTagName("jumin_bizssn2").item(0).firstChild.nodeValue;
		   else parent.tab1.document.getElementById("jumin_bizssn2").value = ""; 
		   if(xmldoc.getElementsByTagName("jumin_bizssn3").length >0 && xmldoc.getElementsByTagName("jumin_bizssn3").item(0).firstChild != null) parent.tab1.document.getElementById("jumin_bizssn3").value 	 = xmldoc.getElementsByTagName("jumin_bizssn3").item(0).firstChild.nodeValue;
		   else parent.tab1.document.getElementById("jumin_bizssn3").value = ""; 
		   if(xmldoc.getElementsByTagName("jumin_tel1").length >0 && xmldoc.getElementsByTagName("jumin_tel1").item(0).firstChild != null) parent.tab1.document.getElementById("jumin_tel1").value 	 = xmldoc.getElementsByTagName("jumin_tel1").item(0).firstChild.nodeValue;
		   else parent.tab1.document.getElementById("jumin_tel1").value = "";
		   if(xmldoc.getElementsByTagName("jumin_tel2").length >0 && xmldoc.getElementsByTagName("jumin_tel2").item(0).firstChild != null) parent.tab1.document.getElementById("jumin_tel2").value 	 = xmldoc.getElementsByTagName("jumin_tel2").item(0).firstChild.nodeValue;
		   else parent.tab1.document.getElementById("jumin_tel2").value = "";
		   if(xmldoc.getElementsByTagName("jumin_tel3").length >0 && xmldoc.getElementsByTagName("jumin_tel3").item(0).firstChild != null) parent.tab1.document.getElementById("jumin_tel3").value 	 = xmldoc.getElementsByTagName("jumin_tel3").item(0).firstChild.nodeValue;
		   else parent.tab1.document.getElementById("jumin_tel3").value = "";
		   if(xmldoc.getElementsByTagName("jumin_fax1").length >0 && xmldoc.getElementsByTagName("jumin_fax1").item(0).firstChild != null) parent.tab1.document.getElementById("jumin_fax1").value 	 = xmldoc.getElementsByTagName("jumin_fax1").item(0).firstChild.nodeValue;
		   else parent.tab1.document.getElementById("jumin_fax1").value = "";
		   if(xmldoc.getElementsByTagName("jumin_fax2").length >0 && xmldoc.getElementsByTagName("jumin_fax2").item(0).firstChild != null) parent.tab1.document.getElementById("jumin_fax2").value 	 = xmldoc.getElementsByTagName("jumin_fax2").item(0).firstChild.nodeValue;
		   else parent.tab1.document.getElementById("jumin_fax2").value = "";
		   if(xmldoc.getElementsByTagName("jumin_fax3").length >0 && xmldoc.getElementsByTagName("jumin_fax3").item(0).firstChild != null) parent.tab1.document.getElementById("jumin_fax3").value 	  = xmldoc.getElementsByTagName("jumin_fax3").item(0).firstChild.nodeValue;
		   else parent.tab1.document.getElementById("jumin_fax3").value = "";
		   if(xmldoc.getElementsByTagName("jumin_hp1").length >0 && xmldoc.getElementsByTagName("jumin_hp1").item(0).firstChild != null) parent.tab1.document.getElementById("jumin_hp1").value 	  = xmldoc.getElementsByTagName("jumin_hp1").item(0).firstChild.nodeValue;
		   else parent.tab1.document.getElementById("jumin_hp1").value = "";
		   if(xmldoc.getElementsByTagName("jumin_hp2").length >0 && xmldoc.getElementsByTagName("jumin_hp2").item(0).firstChild != null) parent.tab1.document.getElementById("jumin_hp2").value 	  = xmldoc.getElementsByTagName("jumin_hp2").item(0).firstChild.nodeValue;
		   else parent.tab1.document.getElementById("jumin_hp2").value = "";
		   if(xmldoc.getElementsByTagName("jumin_hp3").length >0 && xmldoc.getElementsByTagName("jumin_hp3").item(0).firstChild != null) parent.tab1.document.getElementById("jumin_hp3").value 	  = xmldoc.getElementsByTagName("jumin_hp3").item(0).firstChild.nodeValue;
		   else parent.tab1.document.getElementById("jumin_hp3").value = "";
		   if(xmldoc.getElementsByTagName("POST").length >0 && xmldoc.getElementsByTagName("POST").item(0).firstChild != null) parent.tab1.document.getElementById("BON_POST").value    = xmldoc.getElementsByTagName("POST").item(0).firstChild.nodeValue;
		   else parent.tab1.document.getElementById("BON_POST").value = "";
	  	   if(xmldoc.getElementsByTagName("ADDR1").length >0 && xmldoc.getElementsByTagName("ADDR1").item(0).firstChild != null) parent.tab1.document.getElementById("ADDR1").value    = xmldoc.getElementsByTagName("ADDR1").item(0).firstChild.nodeValue;
	  	   else parent.tab1.document.getElementById("ADDR1").value = "";
		   if(xmldoc.getElementsByTagName("ADDR2").length >0 && xmldoc.getElementsByTagName("ADDR2").item(0).firstChild != null) parent.tab1.document.getElementById("ADDR2").value    = xmldoc.getElementsByTagName("ADDR2").item(0).firstChild.nodeValue;
		   else parent.tab1.document.getElementById("ADDR2").value = "";
		   if(xmldoc.getElementsByTagName("BIZ_STATUS").length >0 && xmldoc.getElementsByTagName("BIZ_STATUS").item(0).firstChild != null) parent.tab1.document.getElementById("BIZ_STATUS").value    = xmldoc.getElementsByTagName("BIZ_STATUS").item(0).firstChild.nodeValue;
		   else parent.tab1.document.getElementById("BIZ_STATUS").value = "";
		   if(xmldoc.getElementsByTagName("BIZ_TYPES").length >0 && xmldoc.getElementsByTagName("BIZ_TYPES").item(0).firstChild != null) parent.tab1.document.getElementById("BIZ_TYPES").value    = xmldoc.getElementsByTagName("BIZ_TYPES").item(0).firstChild.nodeValue;
		   else parent.tab1.document.getElementById("BIZ_TYPES").value = "";
		   if(xmldoc.getElementsByTagName("TOPOST").length >0 && xmldoc.getElementsByTagName("TOPOST").item(0).firstChild != null) parent.tab1.document.getElementById("TO_POST").value    = xmldoc.getElementsByTagName("TOPOST").item(0).firstChild.nodeValue;
		   else parent.tab1.document.getElementById("TO_POST").value = "";
		   if(xmldoc.getElementsByTagName("TOADDR1").length >0 && xmldoc.getElementsByTagName("TOADDR1").item(0).firstChild != null) parent.tab1.document.getElementById("TOADDR1").value    = xmldoc.getElementsByTagName("TOADDR1").item(0).firstChild.nodeValue;
		   else parent.tab1.document.getElementById("TOADDR1").value = "";
		   if(xmldoc.getElementsByTagName("TOADDR2").length >0 && xmldoc.getElementsByTagName("TOADDR2").item(0).firstChild != null) parent.tab1.document.getElementById("TOADDR2").value    = xmldoc.getElementsByTagName("TOADDR2").item(0).firstChild.nodeValue;
		   else parent.tab1.document.getElementById("TOADDR2").value = "";
		   if(xmldoc.getElementsByTagName("TOTEL_EXT").length >0 && xmldoc.getElementsByTagName("TOTEL_EXT").item(0).firstChild != null) parent.tab1.document.getElementById("TEL_EXT").value    = xmldoc.getElementsByTagName("TOTEL_EXT").item(0).firstChild.nodeValue;
		   else parent.tab1.document.getElementById("TEL_EXT").value = "";
		   if(xmldoc.getElementsByTagName("TOPOST_NM").length >0 && xmldoc.getElementsByTagName("TOPOST_NM").item(0).firstChild != null) parent.tab1.document.getElementById("TOPOST_NM").value    = xmldoc.getElementsByTagName("TOPOST_NM").item(0).firstChild.nodeValue;
		   else parent.tab1.document.getElementById("TOPOST_NM").value = "";
		   if(xmldoc.getElementsByTagName("MANAGER").length >0 && xmldoc.getElementsByTagName("MANAGER").item(0).firstChild != null) parent.tab1.document.getElementById("MANAGER").value    = xmldoc.getElementsByTagName("MANAGER").item(0).firstChild.nodeValue;
		   else parent.tab1.document.getElementById("MANAGER").value = "";
		   if(xmldoc.getElementsByTagName("LNBR1").length >0 && xmldoc.getElementsByTagName("LNBR1").item(0).firstChild != null) parent.tab1.document.getElementById("BON").value    = xmldoc.getElementsByTagName("LNBR1").item(0).firstChild.nodeValue;
		   else parent.tab1.document.getElementById("BON").value = "";
		   if(xmldoc.getElementsByTagName("LNBR2").length >0 && xmldoc.getElementsByTagName("LNBR2").item(0).firstChild != null) parent.tab1.document.getElementById("BU").value    = xmldoc.getElementsByTagName("LNBR2").item(0).firstChild.nodeValue;
		   else parent.tab1.document.getElementById("BU").value = "";
		   if(xmldoc.getElementsByTagName("TO_LNBR1").length >0 && xmldoc.getElementsByTagName("TO_LNBR1").item(0).firstChild != null) parent.tab1.document.getElementById("TOBON").value    = xmldoc.getElementsByTagName("TO_LNBR1").item(0).firstChild.nodeValue;
		   else parent.tab1.document.getElementById("TOBON").value = "";
		   if(xmldoc.getElementsByTagName("TO_LNBR2").length >0 && xmldoc.getElementsByTagName("TO_LNBR2").item(0).firstChild != null) parent.tab1.document.getElementById("TOBU").value    = xmldoc.getElementsByTagName("TO_LNBR2").item(0).firstChild.nodeValue;
		   else parent.tab1.document.getElementById("TOBU").value = "";
		   if(xmldoc.getElementsByTagName("ROAD_BON").length >0 && xmldoc.getElementsByTagName("ROAD_BON").item(0).firstChild != null) parent.tab1.document.getElementById("BD_BON").value    = xmldoc.getElementsByTagName("ROAD_BON").item(0).firstChild.nodeValue;
		   else parent.tab1.document.getElementById("BD_BON").value = "";
		   if(xmldoc.getElementsByTagName("ROAD_BU").length >0 && xmldoc.getElementsByTagName("ROAD_BU").item(0).firstChild != null) parent.tab1.document.getElementById("BD_BU").value    = xmldoc.getElementsByTagName("ROAD_BU").item(0).firstChild.nodeValue;
		   else parent.tab1.document.getElementById("BD_BU").value = "";
		   if(xmldoc.getElementsByTagName("BD_NM").length >0 && xmldoc.getElementsByTagName("BD_NM").item(0).firstChild != null) parent.tab1.document.getElementById("BD_NM").value    = xmldoc.getElementsByTagName("BD_NM").item(0).firstChild.nodeValue;
		   else parent.tab1.document.getElementById("BD_NM").value = "";
		   if(xmldoc.getElementsByTagName("BD_DET_NM").length >0 && xmldoc.getElementsByTagName("BD_DET_NM").item(0).firstChild != null) parent.tab1.document.getElementById("BD_DET_NM").value    = xmldoc.getElementsByTagName("BD_DET_NM").item(0).firstChild.nodeValue;
		   else parent.tab1.document.getElementById("BD_DET_NM").value = "";
		   if(xmldoc.getElementsByTagName("TO_BD_BON").length >0 && xmldoc.getElementsByTagName("TO_BD_BON").item(0).firstChild != null) parent.tab1.document.getElementById("TO_BD_BON").value    = xmldoc.getElementsByTagName("TO_BD_BON").item(0).firstChild.nodeValue;
		   else parent.tab1.document.getElementById("TO_BD_BON").value = "";
		   if(xmldoc.getElementsByTagName("TO_BD_BU").length >0 && xmldoc.getElementsByTagName("TO_BD_BU").item(0).firstChild != null) parent.tab1.document.getElementById("TO_BD_BU").value    = xmldoc.getElementsByTagName("TO_BD_BU").item(0).firstChild.nodeValue;
		   else parent.tab1.document.getElementById("TO_BD_BU").value = "";
		   if(xmldoc.getElementsByTagName("TO_BD_NM").length >0 && xmldoc.getElementsByTagName("TO_BD_NM").item(0).firstChild != null) parent.tab1.document.getElementById("TO_BD_NM").value    = xmldoc.getElementsByTagName("TO_BD_NM").item(0).firstChild.nodeValue;
		   else parent.tab1.document.getElementById("TO_BD_NM").value = "";
		   if(xmldoc.getElementsByTagName("TO_BD_DET_NM").length >0 && xmldoc.getElementsByTagName("TO_BD_DET_NM").item(0).firstChild != null) parent.tab1.document.getElementById("TO_BD_DET_NM").value    = xmldoc.getElementsByTagName("TO_BD_DET_NM").item(0).firstChild.nodeValue;
		   else parent.tab1.document.getElementById("TO_BD_DET_NM").value = "";
		   if(xmldoc.getElementsByTagName("ROAD_ADDR").length >0 && xmldoc.getElementsByTagName("ROAD_ADDR").item(0).firstChild != null) parent.tab1.document.getElementById("ADDR1_NEW").value    = xmldoc.getElementsByTagName("ROAD_ADDR").item(0).firstChild.nodeValue;
		   else parent.tab1.document.getElementById("ADDR1_NEW").value = "";
		   if(xmldoc.getElementsByTagName("TO_ROAD_ADDR").length >0 && xmldoc.getElementsByTagName("TO_ROAD_ADDR").item(0).firstChild != null) parent.tab1.document.getElementById("TOADDR1_NEW").value    = xmldoc.getElementsByTagName("TO_ROAD_ADDR").item(0).firstChild.nodeValue;
		   else parent.tab1.document.getElementById("TOADDR1_NEW").value = "";
		    
		   if(xmldoc.getElementsByTagName("SPC_CD").length >0 && xmldoc.getElementsByTagName("SPC_CD").item(0).firstChild != null) parent.tab1.document.getElementById("SAN").check    = xmldoc.getElementsByTagName("SPC_CD").item(0).firstChild.nodeValue;
		   else parent.tab1.document.getElementById("SAN").check = "0";
		   if(xmldoc.getElementsByTagName("TO_SPC_CD").length >0 && xmldoc.getElementsByTagName("TO_SPC_CD").item(0).firstChild != null) parent.tab1.document.getElementById("TOSAN").check    = xmldoc.getElementsByTagName("TO_SPC_CD").item(0).firstChild.nodeValue;
		   else parent.tab1.document.getElementById("TOSAN").check = "0";
		   
		      
		  //탭 전환 
		   parent.tab1.selectTabMenu();
		



	}
	
//]]>
</script>

<body>
<form name="form1" id="form1" method="post" action="search.jsp">
 <input type="hidden" name="currentPage" id="currentPage" value="${currentPage}"> 
 
<table width="780" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td align="center"><table width="780" border="0" cellspacing="0" cellpadding="0">      
      <tr>
        <td align="left"><table width="780" border="0" cellspacing="0" cellpadding="0">
      
          
          <tr>
            <td class="contborder_purple"><table width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                  
                      <tr>
                        <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">관리업체명</td>
                        <td bgcolor="eaeaea" class="table_bl_left"><input type="text" class="input_form1" style="width:200px" name="adminBiz" id="adminBiz"  value="${adminBiz}"> 
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">담당자명</td>
                        <td bgcolor="eaeaea" class="table_bl_left">
                        	<input name="MIN_NAME" id="MIN_NAME" type="text" class="input_form1" style="width:200px"  onkeypress="if(event.keyCode == 13) Search();" value="${MIN_NAME }">
                        </td>
                  </table></td>
                </tr>
                <tr>
                  <td height="32" align="right"><a href="javascript:Search();"><img src="/img/inquiry_icon2.gif" alt="조회" width="56" height="18" border="0"></a></td>
                </tr>

                <tr>
                  <td height="1" bgcolor="#EAEAEA"></td>
                </tr>
                <tr>
                  <td height="34" class="sub_stan">전체건수 : <span class="sub_stan_blue">${totalcnt}</span> 건 </td>
                </tr>
                <tr>
                  <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                      <tr>
                        <td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">번호</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">관리업체명</td>						
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">지점명</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">업체코드</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">주소</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">도로명주소</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">등록</td>
                      </tr>
                      
					<c:choose>
						<c:when test="${blist!= null && !empty blist}">
		                      <c:forEach items="${blist}" var="board" varStatus="idx">
			                     <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" >
									<td height="26" align="center">${board.RNUM}</td>
			                     	<td height="26" align="center">${board.NAME}</td>
		        					<td align="center">${board.OFFICE}</td>		        					
		        					<td align="center">${board.CORP_CD}</td>
		        					<td align="center">${board.POST}</td>
		        					<td align="center">${board.ADDR1}</td>
		        					<td align="center">${board.ROADADDR}</td>
		        					<td align="center"><img src="/img/select_icon.gif" alt="수정" border="0" onclick="javaScript:Appeal_Modify('${board.CORP_CD}');" style="CURSOR:Hand;"></td>				        					
<!-- 		        				<td align="center"><img src="/img/select_icon.gif" alt="수정" border="0" onclick="javaScript:Appeal_Modify('${board.CORP_CD}','${gu_code}');" style="CURSOR:Hand;"></td>				        					-->
			                     </tr>
							 </c:forEach>
						</c:when>						
						<c:otherwise>
							<tr>
								<td align="center" class="sub_table" colspan="11" height="85">검색된 내용이 없습니다</td>
							</tr>
						</c:otherwise>
					 </c:choose>
					 
					 </table>
					 </td>
                </tr>
                <tr>
                  <td height="30" align="center"><table border="0" cellspacing="0" cellpadding="0">
                      <tr>
						${pageing }
                      </tr>
                  </table></td>
                </tr>

            </table></td>
          </tr>      
        </table></td>
      </tr>

  	<tr><td>
  	</td>
  	</tr>
</table></td>         
</tr>
</table>


</body>
</html>

