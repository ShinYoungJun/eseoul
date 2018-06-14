<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/include.jsp" %>  

<%
	if((String)session.getAttribute("sessionUserId") == null)
	{
%>
		<script language="javascript">
			alert('사용자의 사용시간이 종료되었습니다. 다시 접속 해주시기 바랍니다.');
			opener.parent.parent.parent.location.href="/admin/user/login.do";
			window.close();
		</script>
<%
	}
%>
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

<script>
	
	

function MM_preloadImages() { //v3.0
  var d=document; if(d.images){ if(!d.MM_p) d.MM_p=new Array();
    var i,j=d.MM_p.length,a=MM_preloadImages.arguments; for(i=0; i<a.length; i++)
    if (a[i].indexOf("#")!=0){ d.MM_p[j]=new Image; d.MM_p[j++].src=a[i];}}
}


function close2()
{
	var giga = document.getElementById("giga").value;
	opener.document.getElementById("price").value=giga;
	self.close();
}
	
function	Page(page)
{
	if(page	==	"")
		return;
	
	var form = document.form1;

	var year = document.getElementById("YEAR").value;
	var type = document.getElementById("TYPE").value;
	var tax_set = document.getElementById("TAX_SET").value;
	var tax_yn = document.getElementById("TAX_YN").value;		
	var mul_fromdate = document.getElementById("mul_fromdate").value;
	var mul_todate = document.getElementById("mul_todate").value;
	var purpose = document.getElementById("PURPOSE").value;
	var bj_cd = document.getElementById("BJ_CD").value;
	var hj_cd = document.getElementById("HJ_CD").value;
	var jumyongName = document.getElementById("jumyongName").value;
	var section = document.getElementById("SECTION").value;
	
	
	form.currentPage.value	= page;
	//alert(tax_set);
	//form.action = "search.do?year="+year+"&type="+type+"&tax_set="+tax_set+"&tax_yn="+tax_yn+"&mul_fromdate="+mul_fromdate
	//										+"&mul_todate="+mul_todate+"&purpose_cd="+purpose+"&bj_cd="+bj_cd+"&jumyongName="+jumyongName+"&cal_status="+cal_status;
	//form.submit();
	location.href="/jumyong/junggi/landPriceAllAplly.do?currentPage="+page+"&year="+year+"&type="+type+"&tax_set="+tax_set+"&tax_yn="+tax_yn+"&mul_fromdate="+mul_fromdate
					+"&mul_todate="+mul_todate+"&purpose_cd="+purpose+"&bj_cd="+bj_cd+"&hj_cd="+hj_cd+"&jumyongName="+jumyongName+"&section="+section;
}

function apply()
{
	var form1 = document.form1;
	alert("적용 건수가 많으면 시간이 약간 걸릴 수 있습니다.");
	form1.submit();
		
}

</script>
<link href="/css/pop.css" rel="stylesheet" type="text/css">

</head>
<body>

<script type="text/javascript">
var result = "${result}";
if(result=="1"){
	alert("일괄처리가 끝났습니다.");
 	window.close();
}
</script>
<form name="form1" id="form1" action="/jumyong/junggi/priceApplyUpdate.do">
<input type="hidden" name="currentPage" value="${currentPage}">
<input id="YEAR" type="hidden" value="${year}">
<input id="TYPE" type="hidden" value="${type}">
<input id="TAX_SET" type="hidden" value="${tax_set}">
<input id="TAX_YN" type="hidden" value="${tax_yn}">
<input id="MUL_FROMDATE" type="hidden" value="${mul_fromdate}">
<input id="MUL_TODATE" type="hidden" value="${mul_todate}">
<input id="PURPOSE" type="hidden" value="${purpose}">
<input id="BJ_CD" type="hidden" value="${bj_cd}">
<input id="HJ_CD" type="hidden" value="${hj_cd}">
<input id="jumyongName" type="hidden" value="${jumyongName}">
<input id="SECTION" type="hidden" value="${SECTION}">
<input id="RESULT" type="hidden" value="${result}">

<table width="100%" height="100%" border="0" cellpadding="0" cellspacing="0">
	<tr>
  		<td height="12"><img src="/img/box_top_left.gif" width="12" height="12"></td>
  		<td background="/img/box_top_mid.gif"></td>
  		<td><img src="/img/box_top_right.gif" width="12" height="12"></td>
	</tr>
	<tr>
  		<td width="12" background="/img/box_left.gif"></td>
  		<td align="center" valign="top">
  			<table width="100%" border="0" cellspacing="0" cellpadding="0">
	  			<tr>
			        <td>
			        	<table width="100%" border="0" cellpadding="0" cellspacing="0" class="admin_w">
			          		<tr>
			            		<td width="40"><img src="/img/admin_pop_left.gif" width="40" height="40"></td>
			            		<td background="/img/admin_pop_cen.gif" class="admin_w_b" style="padding-top:3">공시지가 일괄 적용</td>
			            		<td width="33"><a href="#"><img src="/img/close.gif" alt="닫기" width="33" height="40" border="0" onClick="self.close();" style="cursor:pointer;" /></a></td>
			          		</tr>
			          		<tr>
			            		<td height="5" colspan="3"></td>
			            	</tr>
			            	<tr class="sub_table_b">&nbsp;&nbsp;전체건수:${listCount}</tr>
			        	</table>
			        </td>
		      	</tr>		      	
		      	<tr>
	        		<td>
	        			<table width="100%" border="2" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
	        				<tr>
	        					<td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">번호</td>
	        					<td align="center" bgcolor="e5eff8" class="sub_table_b">관리번호</td>
                        		<td align="center" bgcolor="e5eff8" class="sub_table_b">점용인</td>
                        		<td align="center" bgcolor="e5eff8" class="sub_table_b">점용지</td>
                        		<td align="center" bgcolor="e5eff8" class="sub_table_b">적용 예정 공시지가</td>
                        		<td align="center" bgcolor="e5eff8" class="sub_table_b">면적</td>
	        				</tr>
	          				<c:forEach items="${blist}" var="board" varStatus="idx">
                    		<tr>
                    			<td height="26" align="center">${board.NO}</td>
                    			<td align="center">${board.ADMIN_NO}</td>
                    			<td align="center">${board.NAME}</td>
                    			<td align="center">${board.BJ_NM} ${board.BONBUN}<c:if test="${board.BUBUN != null}">-</c:if>${board.BUBUN}</td>
                    			<td align="center">${board.JIGA}원</td>
                    			<td align="center">${board.AREA_SIZE}</td>                            			
							</tr>
							</c:forEach>
							
				        </table>
				 	</td>
	      		</tr>
  			</table>
  		</td>
	    <td width="12" background="/img/box_right.gif"></td>
	  </tr>
	  
	  <tr>
	    <td height="12"><img src="/img/box_bottom_left.gif" width="12" height="12"></td>
	    <td background="/img/box_bottom_mid.gif"></td>
	    <td><img src="/img/box_bottom_right.gif" width="12" height="12"></td>
	  </tr>	
</table>
<table width="100%" height="100%" border="0" cellpadding="0" cellspacing="0">
      <tr>
		<td align="center"><table border="0" cellpadding="0" cellspacing="0">
          <tr>
          			${pageing}
          </tr>         
        </table>        
        </td>
        
      </tr>
      <tr>
      	<td align="right"><a href="javascript:apply();"><img src="/img/gonsi_prc.gif" alt="공시지가 적용" border="0"></a></td>
      </tr>
</table>
</form>

</body>
</html>