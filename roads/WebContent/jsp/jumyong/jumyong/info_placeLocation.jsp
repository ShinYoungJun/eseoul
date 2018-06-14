<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/include.jsp" %>    
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
<script language='JavaScript' src='/js/Check_inputbox.js'></script>
<script>

	function submitClick()
	{
		var placeLocationForm = document.placeLocationForm;

		if(placeLocationForm.Locate_x.value==null || placeLocationForm.Locate_x.value=="" || placeLocationForm.Locate_x.value.length==0){
			alert("위치 정보가 필요합니다.\n위치등록을 해 주세요");
			return;
		}
		if(placeLocationForm.Locate_y.value==null || placeLocationForm.Locate_y.value=="" || placeLocationForm.Locate_y.value.length==0){
			alert("위치 정보가 필요합니다.\n위치등록을 해 주세요");
			return;
		}

		if(placeLocationForm.AREA.value==null || placeLocationForm.AREA.value=="" || placeLocationForm.AREA.value.length==0){			
			alert("면적값이  필요합니다.");
			placeLocationForm.AREA.value="";
			placeLocationForm.AREA.focus();
			return;
		}
		if(placeLocationForm.AREA.value<=0){
			alert("면적값을 올바르게 넣어주세요");
			placeLocationForm.AREA.value="";
			placeLocationForm.AREA.focus();
			return;
		}
		if(placeLocationForm.WIDTH.value.length>0)
		if(placeLocationForm.WIDTH.value<=0){
			alert("가로값을 올바르게 넣어주세요");
			placeLocationForm.WIDTH.value="";
			placeLocationForm.WIDTH.focus();
			return;
		}
		if(placeLocationForm.HEIGHT.value.length>0)
		if(placeLocationForm.HEIGHT.value<=0){
			alert("가로값을 올바르게 넣어주세요");
			placeLocationForm.HEIGHT.value="";
			placeLocationForm.HEIGHT.focus();
			return;
		}
		if(placeLocationForm.EXPLAIN.value.length==0){
			placeLocationForm.EXPLAIN.value="-";
		}
		
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
	
	  
	function popGeoInfo(flag, x, y)
	{
		var form = document.placeLocationForm;
		var addr = document.getElementById("Addr").value;
	    var name = document.getElementById("Name").value;
	    var no = document.getElementById("no").value;
	    var pnu = document.getElementById("PNU").value;
	    var url = "";
		    
		if(flag == "check"){ //위치확인
			url = '/jumyong/map/mini_map.do?PNU='+pnu+'&X_COORD='+x+'&Y_COORD='+y+'&TYPE=view';
		}
		else{
			if(document.getElementById("PNU").value=="0"){
		    	alert("PNU 정보가 없습니다.\관리자에게 연락하세요.");
		    }
		    else{	    	
				url = '/jumyong/map/mini_map.do?PNU='+pnu+'&TYPE=edit';
		    }
		}

		
   	   
		cw=screen.availWidth; // 화면 너비
		ch=screen.availHeight; // 화면 높이
		
		sw=800;// 띄울 창의 너비
		sh=600;// 띄울 창의 높이
		
		ml=(cw-sw)/2;// 가운데 띄우기위한 창의 x위치
		mt=(ch-sh)/2;// 가운데 띄우기위한 창의 y위치

  		var param = 'width='+sw+',height='+sh+',top='+mt+',left='+ml+',resizable=no, status=no, scrollbars=no, toolbar=no, menubar=no';

		window.open(url, "minimap", param);
	}
	
	

	
</script>

</head>

<body >

<form id="placeLocationForm" name="placeLocationForm" method="post" action = "/jumyong/placeLocationEdit.do" >

<input id="no" name="no" value="${no}" type="hidden" >
<input id = "mode" name="mode" value="${mode}" type="hidden" >
<input id="seq" name="seq" value="${seq}" type="hidden" >
<input id="currentPage" name="currentPage" value="${currentPage}" type="hidden" >
<input id="PNU" name="PNU" value="${PNU}" type="hidden">
<input id="Addr" name="Addr" value="${Addr}" type="hidden">
<input id="Name" name="Name" value="${Name}" type="hidden">
<input id="Locate_x" name="Locate_x" value="${Locate_x }" type="hidden">
<input id="Locate_y" name="Locate_y" value="${Locate_y }" type="hidden">
<input id="SECTION" name="SECTION" value="${SECTION }" type="hidden">

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
                      	<input id="AREA" name="AREA" type="text" class="input_form1" style="width:40px" onKeyPress="nr_num_float(this);" onKeyUp="nr_num_float(this);" value="${place.AREA}">
                      </td>
                      <td align="center">
	                      <input id="WIDTH" name="WIDTH" type="text" class="input_form1" style="width:40px" onKeyPress="nr_num_float(this);" onKeyUp="nr_num_float(this);" value="${place.WIDTH}">
	                  </td>
                      <td align="center">
    	                  <input id="HEIGHT" name="HEIGHT" type="text" class="input_form1" style="width:40px" onKeyPress="nr_num_float(this);" onKeyUp="nr_num_float(this);" value="${place.HEIGHT}">
    	              </td>
                      <td align="center">
        	              <input id="EXPLAIN" name="EXPLAIN" type="text" class="input_form1" style="width:220px" maxlength="100" value="${place.EXPLAIN}">
        	          </td>
                      <td align="center">
                      	<c:if test="${SECTION != '4'}">
                      	<a href="javascript:popGeoInfo('write')" class="inqu"><img src="/img/loca_icon2.gif" alt="위치등록" width="64" height="18" border="0"></a>
                      	</c:if>
                      </td>
                      <td align="center">
	                    <c:if test="${SECTION != '4'}">
	                    <img src="/img/save_icon2.gif" alt="저장" width="56" height="18" border="0" onClick="javascript:submitClick();"  style="cursor:pointer"></img>
	                    </c:if>
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
                        <td align="center"><a href="javascript:popGeoInfo('check','${board.LOCATE_X}','${board.LOCATE_Y}')" class="inqu"><img src="/img/loca_icon.gif" alt="위치확인!!" width="64" height="18" border="0"></a></td>
                      	<td align="center">
                      		<c:if test="${SECTION != '4'}">
                      		<img src="/img/mod_icon2.gif" alt="수정" width="34" height="18" border="0" 
                      			onClick="javascript:location.href('/jumyong/placeLocationEdit.do?mode=edit&no=${no}&seq=${board.SEQ}&currentPage=${currentPage}&countPerPage=${countPerPage}'  );" style="cursor:pointer" >
                      		<img src="/img/del_icon.gif" onClick="javascript:goDel('${board.SEQ}'  );" alt="삭제" width="34" height="18" border="0"  style="cursor:pointer" >
                      		</c:if>
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

