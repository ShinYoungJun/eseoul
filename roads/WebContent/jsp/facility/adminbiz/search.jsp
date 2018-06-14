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

<script type="text/javascript">
//<![CDATA[

	function	Page(page)
	{
		if(page	==	"")
			return;
		
		var form = document.form;
	//	var	LISTVIEW	= document.getElementById("LISTVIEW");
	//	LISTVIEW.value	= "1";
		
		form.currentPage.value	= page;

		form.action = "search.do";
		form.submit();
	}
	
	function	Search()
	{
		var form 		= document.form;
//		var	LISTVIEW	= document.getElementById("LISTVIEW");
//		LISTVIEW.value	= "1";
		
//		var	date	= DateCheck();
//		if(date	== true)
//			return;
	
		form.currentPage.value	= 1;

		form.action = "search.do";
		form.submit();
	}

	function	View(corp_cd)
	{
		var form = document.form;
		var currentPage = document.getElementById("currentPage").value;
		var adminBiz = form.adminBiz.value ;
		var MIN_NAME = form.MIN_NAME.value;
		
		form.action = "view.do?CORP_CD=" + corp_cd+"&currentPage="+currentPage+"&adminBiz="+adminBiz+"&MIN_NAME="+MIN_NAME;
		form.submit();
	}

	function	Register()
	{
		var form = document.form;

		form.action = "register.do";
		form.submit();
	}
	
	
	function onCheck(){
		var form 	= document.form;
		
		if(form.MIN_REQNO.value.length == '18'){
			form.MIN_NAME.focus();
		}
	}		
//]]>
</script>

<body>
<form name="form" method="post" action="search.jsp">
 <input type="hidden" name="currentPage" id="currentPage" value="${currentPage}"> 
 
<table width="800" border="0" cellpadding="0" cellspacing="0">
  <tr>
	<!--  //********** BEGIN_KANG_20120416 -->
	<!-- 
	<td height="43"><img src="/img/sub3_cont1_title.gif" width="800" height="43"></td>	
	-->
	<td height="43"><img src="/img/sub2_sisul_title.gif" width="800" height="43"></td>
	<!--   //********** END_KANG_20120416 -->  
  </tr>
  <tr>
    <td align="center"><table width="780" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td height="1" bgcolor="eaeaea"></td>
      </tr>
      <tr>
        <td height="14"></td>
      </tr>
      
      <tr>
        <td align="left"><table width="780" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td height="22" background="/img/tab_line_blue.gif"><table border="0" cellspacing="0" cellpadding="0">
                <tr>
	                <!--  //********** BEGIN_KANG_20120416 -->
					<!-- 
					<td><img src="/img/sub_petition_title1.gif" width="110" height="22"></td>
					-->
					<td><img src="/img/management_company_register.gif" width="110" height="22"></td>
					<!--   //********** END_KANG_20120416 -->
                </tr>
            </table></td>
          </tr>
          
          <tr>
            <td class="contborder_blue"><table width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                  
                      <tr>
                        <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">관리업체명</td>
                        <td bgcolor="eaeaea" class="table_bl_left"><input type="text" class="input_form1" style="width:200px" name="adminBiz"  value="${adminBiz}"> 
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">담당자명</td>
                        <td bgcolor="eaeaea" class="table_bl_left">
                        	<input name="MIN_NAME" type="text" class="input_form1" style="width:200px"  onkeypress="if(event.keyCode == 13) Search();" value="${MIN_NAME }">
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
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">담당자명</td>
                      </tr>
                      
					<c:choose>
						<c:when test="${blist!= null && !empty blist}">
		                      <c:forEach items="${blist}" var="board" varStatus="idx">
			                     <tr onClick="javascript:View('${board.CORP_CD}')" onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" style="CURSOR: Hand;" >
									<td height="26" align="center">${board.RNUM}</td>
			                     	<td height="26" align="center">${board.NAME}</td>
		        					<td align="center">${board.OFFICE}</td>		        					
		        					<td align="center">${board.CORP_CD}</td>
		        					<td align="center">${board.MANAGER}</td>		        					
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
          <tr>
            <td height="40" align="right">
          	  	<a href="javascript:Register()"><img src="/img/newregi_icon.gif" alt="신규등록" width="74" height="22" border="0"></a>
	  	        <!-- 
           		<a href="#"><img src="../../../img/excel_icon.gif" alt="EXCEL 변환" border="0"></a>
           		-->
            </td>
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