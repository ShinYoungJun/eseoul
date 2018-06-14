
<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/loginCheck.jsp" %>
<%@ include file="/jsp/common/include.jsp" %>    

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />
<title>::::: ����� ������������ý��� :::::</title>
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
		var no = document.getElementById("no").value;						//������ ���ƿ� ������ ����
		var currentPage = document.getElementById("currentPage").value;		//������ ���ƿ� ������ ����
		
		//seqValue - ������ ��ȣ�� ã��
		
		if(confirm("���� �����Ͻðڽ��ϱ�?"))
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
		    
		if(flag == "check"){ //��ġȮ��
			url = '/jumyong/map/mini_map.do?PNU='+pnu+'&X_COORD='+x+'&Y_COORD='+y+'&TYPE=view';
		}
		else{
			if(document.getElementById("PNU").value=="0"){
		    	alert("PNU ������ �����ϴ�.\�����ڿ��� �����ϼ���.");
		    }
		    else{	    	
				url = '/jumyong/map/mini_map.do?PNU='+pnu+'&TYPE=edit';
		    }
		}

		
   	   
		cw=screen.availWidth; // ȭ�� �ʺ�
		ch=screen.availHeight; // ȭ�� ����
		
		sw=800;// ��� â�� �ʺ�
		sh=600;// ��� â�� ����
		
		ml=(cw-sw)/2;// ��� �������� â�� x��ġ
		mt=(ch-sh)/2;// ��� �������� â�� y��ġ

  		var param = 'width='+sw+',height='+sh+',top='+mt+',left='+ml+',resizable=no, status=no, scrollbars=no, toolbar=no, menubar=no';

		window.open(url, "minimap", param);
	}
	

		
</script>

</head>

<body>

<form id="placeLocationForm" name="placeLocationForm" method="post" action = "/jumyong/placeLocationEdit.do" >

<input id="no" name="no" value="${no}" type="hidden" >
<input id="mode" name="mode" value="${mode}" type="hidden" >
<input id = "seq" name="seq" value="${seq}" type="hidden" >
<input id="currentPage" name="currentPage" value="${currentPage}" type="hidden" >
<input id="PNU" name="PNU" value="${PNU}" type="hidden">
<input id="Addr" name="Addr" value="${Addr}" type="hidden">
<input id="Name" name="Name" value="${Name}" type="hidden">
<input id="Locate_x" name="Locate_x" value="${Locate_x }" type="hidden">
<input id="Locate_y" name="Locate_y" value="${Locate_y }" type="hidden">
<input id="SECTION" name="SECTION" value="${SECTION }" type="hidden">


<table width="100%"   >

            <tr>
                <td>
                <table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                    <tr>
                      <td height="28" colspan="7" bgcolor="#FFFFFF" class="table_bl_left"><span class="sub_stan_blue">* ��ġ����</span>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp�� ${listNum}��
                      </td>
                      </tr>
                    <tr>
                    <td width="5%" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">��ȣ</td>
                      <td width="10%" align="center" bgcolor="e5eff8" class="sub_table_b">����</td>
                      <td width="10%" align="center" bgcolor="e5eff8" class="sub_table_b">����</td>
                      <td width="10%" align="center" bgcolor="e5eff8" class="sub_table_b">����</td>
                      <td width="35%" align="center" bgcolor="e5eff8" class="sub_table_b">������ �󼼼��� </td>
                      <td width="15%" align="center" bgcolor="e5eff8" class="sub_table_b">������ġ</td>
                      <td width="15%" align="center" bgcolor="e5eff8" class="sub_table_b">��� </td>
                      </tr>
                      
                      
                    <c:forEach items="${Llist}" var="board" varStatus="idx">
                    <c:choose>
                    <c:when test="${board.SEQ != seq}">
                      <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" >
                        <td height="26" align="center">${idx.count}</td>
                        <td align="center">${board.AREA}</td>
                        <td align="center">${board.WIDTH}</td>
                        <td align="center">${board.HEIGHT}</td>
                        <td align="center">${board.EXPLAIN}</td>
                        <td align="center">
	                        <c:if test="${SECTION != '4'}">
	                        <a href="javascript:popGeoInfo('check','${board.LOCATE_X}','${board.LOCATE_Y}')" class="inqu"><img src="/img/loca_icon.gif" alt="��ġȮ��" width="64" height="18" border="0"></a>
	                        </c:if>
                        </td>
                      	<td align="center">
	                      	<c:if test="${SECTION != '4'}">
	                      	<a href="/jumyong/placeLocationEdit.do?mode=edit&no=${no}&seq=${board.SEQ}&currentPage=${currentPage}&countPerPage=${countPerPage}">
	                      		<img src="/img/mod_icon2.gif" alt="����" width="34" height="18" border="0" >
							</a> 
							<a href="#" class="inqu"><img src="/img/del_icon.gif" alt="����" width="34" height="18" border="0"></a>
							</c:if>
						</td>
                      </tr>                      
					</c:when>
					<c:otherwise>
					<tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''">
                      <td height="26" align="center">${idx.count}</td>
                      
                      
                      <td align="center">
                      	<input id="AREA" name="AREA" type="text" class="input_form1" style="width:40px" value = "${board.AREA}">
                      </td>
                      <td align="center">
	                      <input id="WIDTH" name="WIDTH" type="text" class="input_form1" style="width:40px" value = "${board.WIDTH}">
	                  </td>
                      <td align="center">
    	                  <input id="HEIGHT" name="HEIGHT" type="text" class="input_form1" style="width:40px" value = "${board.HEIGHT}">
    	              </td>
                      <td align="center">
        	              <input id="EXPLAIN" name="EXPLAIN"  type="text" class="input_form1" style="width:220px" value = "${board.EXPLAIN}">
        	          </td>
                      <td align="center">
                      	<c:if test="${SECTION != '4'}">
                      	<a href="javascript:popGeoInfo('write')" class="inqu"><img src="/img/loca_icon2.gif" alt="��ġ���" width="64" height="18" border="0"></a>
                      	</c:if>
                      </td>
                      <td align="center">
	                      <c:if test="${SECTION != '4'}">
	                      	<img src="/img/can_icon.gif" alt="���" border="0" onclick="javascript:history.back();" style="cursor:pointer" >
	                      	<img src="/img/save_icon2.gif" alt="����" width="56" height="18" border="0" onClick="javascript:submitClick();"  style="cursor:pointer">
						  </c:if>
                     </td>
                      </tr>
		   			</c:otherwise>
					</c:choose>
					
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


</form>

</body>
</html>

