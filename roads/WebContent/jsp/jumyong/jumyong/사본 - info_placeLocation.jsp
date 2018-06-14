<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
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

<script>

	function submitClick()
	{
		var placeLocationForm = document.placeLocationForm;
		
		var mode = document.getElementById("mode").value;
		
		//alert(document.getElementById("AREA1").value);
		
		if(mode != "edit")
			document.getElementById("mode").value = "add";
		
		placeLocationForm.submit();
	}
	
	function goDel(seqValue)
	{
		var no = document.getElementById("no").value;						//성공후 돌아올 페이지 위해
		var currentPage = document.getElementById("currentPage").value;		//성공후 돌아올 페이지 위해
		
		//seqValue - 삭제할 번호를 찾음
		
		if(confirm("정말 삭제하시겠습니까?"))
		location.href("/jumyong/jumyong/deleteLocation.do?no="+no+"&currentPage="+currentPage+"&seq="+seqValue);
	}
	
	  
	function popGeoInfo()
	{
	    if(document.getElementById("PNU").value=="0"){
	    	alert("PNU 정보가 없습니다.\관리자에게 연락하세요.");
	    }
	    var pnu = document.getElementById("PNU").value;
   	    var addr = document.getElementById("Addr").value;
	    var name = document.getElementById("Name").value;
	    var no = document.getElementById("no").value;
	    var param = "/jsp/map/mappop.jsp?pnu="+pnu+"&addr="+addr+"&name="+name+"&flag=jumyong&admin_no="+no;
	    var winPosLeft = 'left='+(screen.width - 560) / 2; // 새창 x 좌표 
  		var winPosTop = 'top='+(screen.height - 500 - 300) / 2; // 새창 y 좌표 
  		var param1 = "resizable=no, status=no, scrollbars=no, toolbar=no, menubar=no, "+winPosLeft+","+ winPosTop+", width=850, height=720";

		window.open( param, "", param1);
		//form.action = "/map/searchview.do?ADMIN_NO=" + ADMIN_NO;
		//form.submit();
	}
	
	

	
</script>

</head>

<body >

<form name="placeLocationForm" id="placeLocationForm" method="post" action = "/jumyong/placeLocationEdit.do" >

<input name="no" value="${no}" type="hidden" >
<input name="mode"  id = "mode" value="${mode}" type="hidden" >
<input name="seq"  id = "seq" value="${seq}" type="hidden" >
<input name="currentPage"  id = "currentPage" value="${currentPage}" type="hidden" >
<input name="PNU" id="PNU" value="${PNU}" type="hidden">
<input name="Addr" id="Addr" value="${Addr}" type="hidden">
<input name="Name" id="Name" value="${Name}" type="hidden">
<input name="Locate_x" id="Locate_x" value="${Locate_x }" type="hidden">
<input name="Locate_y" id="Locate_y" value="${Locate_y }" type="hidden">

<div id="view" style="width:100%;">
<table width="100%"   >

            <tr>
                <td>
                <table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                    <tr>
                      <td height="28" colspan="7" bgcolor="#FFFFFF" class="table_bl_left"><span class="sub_stan_blue">* 위치정보</span>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp총 ${listNum}건
                      </td>
                      </tr>
                    <tr>
                      <td width="5%" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">번호</td>
                      <td width="10%" align="center" bgcolor="e5eff8" class="sub_table_b">면적</td>
                      <td width="10%" align="center" bgcolor="e5eff8" class="sub_table_b">가로</td>
                      <td width="10%" align="center" bgcolor="e5eff8" class="sub_table_b">세로</td>
                      <td width="35%" align="center" bgcolor="e5eff8" class="sub_table_b">점용지 상세설명 </td>
                      <td width="15%" align="center" bgcolor="e5eff8" class="sub_table_b">점용위치</td>
                      <td width="15%" align="center" bgcolor="e5eff8" class="sub_table_b">기능 </td>
                      </tr>
                      <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''">
                      <td height="26" align="center">-</td>
                      
                      <td align="center">
                      <spring:bind path="place.AREA">
                      	<input name="AREA" type="text" class="input_form1" style="width:40px" >
                      </spring:bind>
                      </td>
                      <td align="center">
                      <spring:bind path="place.WIDTH">
	                      <input name="WIDTH" type="text" class="input_form1" style="width:40px" >
	                  </spring:bind>
	                  </td>
                      <td align="center">
                      <spring:bind path="place.HEIGHT">
    	                  <input name="HEIGHT" type="text" class="input_form1" style="width:40px" >
    	              </spring:bind>
    	              </td>
                      <td align="center">
                      <spring:bind path="place.EXPLAIN">
        	              <input name="EXPLAIN" type="text" class="input_form1" style="width:220px" >
        	          </spring:bind>
        	          </td>
                      <td align="center"><a href="javascript:popGeoInfo()" class="inqu"><img src="/img/loca_icon2.gif" alt="위치등록" width="64" height="18" border="0"></a></td>
                      <td align="center">
                      
                      <img src="/img/save_icon2.gif" alt="저장" width="56" height="18" border="0"
							                onClick="javascript:submitClick();"  style="cursor:pointer">
                      
                     </td>
                      </tr>
                      
                      
                    <c:forEach items="${Llist}" var="board" varStatus="idx">
                      <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" >
                      <!-- onclick="javascript:location.href('/jumyong/placeLocationEdit.do?no=${no}&seq=${board.SEQ}&currentPage=${currentPage}&countPerPage=${countPerPage}');" style="cursor:pointer" -->
                        <td height="26" align="center">${idx.count}</td>
                        <td align="center">${board.AREA}</td>
                        <td align="center">${board.WIDTH}</td>
                        <td align="center">${board.HEIGHT}</td>
                        <td align="center">${board.EXPLAIN}</td>
                        <td align="center"><a href="#" class="inqu"><img src="/img/loca_icon.gif" alt="위치확인!!" width="64" height="18" border="0"></a></td>
                      	<td align="center">
                      	<img src="/img/mod_icon2.gif" alt="수정" width="34" height="18" border="0" 
                      		onClick="javascript:location.href('/jumyong/placeLocationEdit.do?mode=edit&no=${no}&seq=${board.SEQ}&currentPage=${currentPage}&countPerPage=${countPerPage}'  );" style="cursor:pointer" >
                      		<img src="/img/del_icon.gif" onClick="javascript:goDel('${board.SEQ}'  );" alt="삭제" width="34" height="18" border="0"  style="cursor:pointer" >
                      	
                      		</td>
                      </tr>
					</c:forEach>

                </table>
                
                </td>
              </tr>
             <tr>
                <td height="40" align="center"><table width="100%" border="0" cellspacing="0" cellpadding="0">
                    <tr>
                      <td align="center"><table border="0" cellpadding="0" cellspacing="0">
                        <tr>
                        ${strPageDivideForm}
                        </tr>
                        
                      </table></td>

                    </tr>
                    <tr>
                    </tr>
                  </table></td>
              </tr>
            </table>
</div>            


<div id="edit" style="width:100%;display:none;">

</div>    

</form>

</body>
</html>

