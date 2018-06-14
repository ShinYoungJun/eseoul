<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/loginCheck.jsp" %>
<%@ include file="/jsp/common/include.jsp" %>    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
		location.href("/gapan/jumyong/deleteLocation.do?no="+no+"&currentPage="+currentPage+"&seq="+seqValue);
	}
	

	
</script>

</head>

<body>

<form name="placeLocationForm" id="placeLocationForm" method="post" action = "/gapan/jumyong/placeLocationEdit.do" >

<input name="no" value="${no}" type="hidden" >
<input name="mode"  id = "mode" value="${mode}" type="hidden" >
<input name="seq"  id = "seq" value="${seq}" type="hidden" >
<input name="currentPage"  id = "currentPage" value="${currentPage}" type="hidden" >



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
                        
                        <a href="#" class="inqu"><img src="/img/loca_icon.gif" alt="��ġȮ��" width="64" height="18" border="0"></a></td>
                      	<td align="center">
                      	
                      	<a href="/gapan/jumyong/placeLocationEdit.do?mode=edit&no=${no}&seq=${board.SEQ}&currentPage=${currentPage}&countPerPage=${countPerPage}">
                      		<img src="/img/mod_icon2.gif" alt="����" width="34" height="18" border="0" >
						</a> 
						<a href="#" class="inqu"><img src="/img/del_icon.gif" alt="����" width="34" height="18" border="0"></a></td>
                      </tr>                      
					</c:when>
					<c:otherwise>
					<tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''">
                      <td height="26" align="center">${idx.count}</td>
                      
                      
                      <td align="center">
                      <spring:bind path="place.AREA">
                      	<input name="AREA" id="AREA1" type="text" class="input_form1" style="width:40px" value = "${board.AREA}">
                      </spring:bind>
                      </td>
                      <td align="center">
                      <spring:bind path="place.WIDTH">
	                      <input name="WIDTH" id="WIDTH" type="text" class="input_form1" style="width:40px" value = "${board.WIDTH}">
	                  </spring:bind>
	                  </td>
                      <td align="center">
                      <spring:bind path="place.HEIGHT">
    	                  <input name="HEIGHT" id="HEIGHT" type="text" class="input_form1" style="width:40px" value = "${board.HEIGHT}">
    	              </spring:bind>
    	              </td>
                      <td align="center">
                      <spring:bind path="place.EXPLAIN">
        	              <input name="EXPLAIN" id="EXPLAIN"  type="text" class="input_form1" style="width:220px" value = "${board.EXPLAIN}">
        	          </spring:bind>
        	          </td>
                      <td align="center"><a href="#" class="inqu"><img src="/img/loca_icon2.gif" alt="��ġ���" width="64" height="18" border="0"></a></td>
                      <td align="center">
                      <img src="/img/can_icon.gif" alt="���" border="0" onclick="javascript:history.back();" style="cursor:pointer" >
                      <img src="/img/save_icon2.gif" alt="����" width="56" height="18" border="0"
							                onClick="javascript:submitClick();"  style="cursor:pointer">
                      
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
