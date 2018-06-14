<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
}
-->

</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
</head>

<script type="text/javascript">
//<![CDATA[
	function	Modify()
	{
		var form = document.form;

		form.action = "/jumyong/jumyonginfo/jumji_modify.do";
		form.submit();
	}

	function	Init_UseType(sel)
	{
		document.getElementById("UseType1").style.display = "none";
		document.getElementById("UseType2").style.display = "none";
		document.getElementById("UseType3").style.display 	= "none";
		
		if(sel.value == '2')
		{
			document.getElementById("UseTypeName").innerHTML		= "��õ��/���";
			document.getElementById("UseType2").style.display 	= "inline-block";	// ��õ��
			document.getElementById("UseType3").style.display 	= "inline-block"; // ��õ���
			
		}
		else if(sel.value == '3')
		{
			document.getElementById("UseTypeName").innerHTML		= "��õ��";
			document.getElementById("UseType2").style.display 	= "inline-block";	// ��õ��
		}
		else
		{
			document.getElementById("UseTypeName").innerHTML		= "�������";
			document.getElementById("UseType1").style.display 	= "inline-block";	//	����
		}
	}

	function 	Init()
	{
		parent.Tab_Img("jumji");

		IFRM_PurposeCode.PURPOSE_CD.className="view";

		var tabDown = parent.document.getElementById('tabDown');
		tabDown.contentWindow.location.href = tabDown.contentWindow.location.href;
		
		<c:forEach items="${priceAddrList}" var="addr" varStatus="idx">
			addWithAddr('${addr.ADDR}');
		</c:forEach>
		
		
	}
	
	function addWithAddr(text){
		
		var tbody = document.getElementById("WITH_ADDR_LIST");
		  
		var tr,td,Elem;
		
		tr = document.createElement('tr');
		td = document.createElement('td');
		td.setAttribute("height", "18px");
		
		txtElem = document.createTextNode(text);
		td.appendChild(txtElem);
		
		tr.appendChild(td);
		tbody.appendChild(tr);
	}

//]]>
</script>

<body onload="Init(); Init_UseType('${board.TYPE}');">

<form id="form" name="form" method="post">
<input type="hidden" id="ADMIN_NO" name="ADMIN_NO" value="${ADMIN_NO}">
<input type="hidden" id="SECTION" name="SECTION" value="${SECTION}">
<table width="780" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td align="left" class="contborder_purple">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
		  <tr>
			<td><table id="table1" width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
				<tr>
				  <td width="14%" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
				  <td width="36%" bgcolor="eaeaea" class="table_bl_left">${use_type}</td>
				  <td width="14%" align="center" bgcolor="e5eff8" class="sub_table_b">���뱸��</td>
				  <td width="36%" bgcolor="eaeaea" class="table_bl_left">${occupancy_type}</td>
				</tr>
				<tr>
				  <td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
				  <td bgcolor="eaeaea" class="table_bl_left">${use_owner_Group}</td>
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">���Ա���</td>
				  <td bgcolor="eaeaea" class="table_bl_left">${taxation_section}</td>
				</tr>
				<tr>
				  <td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">�����ȣ</td>
				  <td bgcolor="eaeaea" class="table_bl_left">${board.MUL_POST}</td>
				  <td align="center" bgcolor="e5eff8" class="sub_table_b">�ǹ�(��) ���� </td>
				  <td bgcolor="eaeaea" class="table_bl_left">${board.BD_NM}</td>
				</tr>
				<tr>
				  <td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">����������</td>
				  <td colspan="3" bgcolor="eaeaea" class="table_bl_left">
				  	<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<tr>
							  <td>${board.SIGUNGU}&nbsp;</td>
							  <td>${bjdong_code}&nbsp;</td>
							  <td>(${hjdong_code})&nbsp;&nbsp;</td>
							  <td>${mul_spc_cd}&nbsp;</td>
							  <td>${board.BONBUN}${board.BUBUN}&nbsp;&nbsp;${board.TONG}${board.BAN} </td>
						</tr>
				  	</table>
				  </td>
				</tr>
<!-- ������ ���θ� �ּ� #mr -->
				<tr>
				  <td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">���������θ��ּ�</td>
				  <td colspan="3" bgcolor="eaeaea" class="table_bl_left">
				  	<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<tr>
							<td>${board.JYADDR_NEW}&nbsp;${board.JYADDR_BON}
			      				<c:if test="${board.JYADDR_BU != null}">-${board.JYADDR_BU}</c:if>					
      						</td>	
						</tr>
				  	</table>
				  </td>
				</tr>
<!-- #mr -->				
				<tr>
				  <td align="center" bgcolor="e5eff8" class="sub_table_b" height="25">����(��õ)����</td>
				  <td bgcolor="eaeaea" class="table_bl_left">
				  	${board.ROAD_ADDR}&nbsp;${board.ROAD_BON}<c:if test="${board.ROAD_BU != null}">-${board.ROAD_BU}</c:if>
				  </td>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">
				  <span id="UseTypeName">
		          </span>
				  </td>
				  <td bgcolor="eaeaea" class="table_bl_left">
				  <span id="UseType1" style="display:none">
				  	${board.PARKING_NUM}
		          </span>
		       	  <span id="UseType2" style="display:none">
		       	    ${board.RIVER_NM}
		          </span>
		          <span id="UseType3" style="display:none;">
					${board.RIVER_RANK}
				  </span>
				  </td>
				</tr>
				<tr>
					  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b" colspan="1">��������<br>��������<br>���</td>
					  <td bgcolor="eaeaea" class="table_bl_left" colspan="3">
						  <div style="height: 60px;overflow-y:scroll;">
							  <table width="90%">
								  <tbody id="WITH_ADDR_LIST" >
								  </tbody>
							  </table>
						  </div>
					  </td>						  
				</tr>
			
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�������</td>
				  <td colspan="3" bgcolor="F6F6F6" class=""><table width="100%" border="0" cellpadding="0" cellspacing="0" class="">
					<iframe id="IFRM_PurposeCode" align="absmiddle" scrolling="no" frameborder="0" framespacing="0" width="100%" height="22" src="/jsp/common/purposeCode/purposeCode_view.jsp?SectionCode=${board.TYPE}&PURPOSE_CD=${board.PURPOSE_CD}"></iframe>
				  </table></td>
			    </tr>
			    
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">����Ⱓ</td>
				  <td bgcolor="eaeaea" class="table_bl_left" colspan="3">
				  	<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
				  	<c:choose>
					    <c:when test="${board.SECTION == '1' || board.SECTION == '3'}">
					        <tr>
								<td>
									${board.MUL_FROMDATE} ~ ${board.MUL_TODATE}
								</td>
							</tr>
					    </c:when>
					    <c:otherwise>
					        <tr>
								<td>�Ͻ�����&nbsp; ${board.PARTLY_PERIOD}&nbsp;&nbsp;�� ${board.TOTAL_PERIOD}&nbsp;��</td>
							</tr>
					    </c:otherwise>
					</c:choose>
				  </table></td>
				  	
				</tr>
				<tr>
        			<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�������</td>
				    <td bgcolor="eaeaea" class="table_bl_left" colspan="3">
      					${board.AREA_SIZE} m / �� / ��  
				    </td>
        		</tr>
        		<tr>
        			<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">
	        			������
        			</td>
				    <td bgcolor="eaeaea" class="table_bl_left">
      					${board.PERCENT_RATE}% 
				    </td>
				    <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">
						������ ����
				    </td>
				    <td bgcolor="eaeaea" class="table_bl_left">
      					${board.PERCENT_REASON}       
				    </td>
        		</tr>
        		
        		<tr>
        			<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">
	        			������
        			</td>
				    <td bgcolor="eaeaea" class="table_bl_left">
      					${board.REDUCTION_RATE}% 
				    </td>
				    <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">
						������ ����
				    </td>
				    <td bgcolor="eaeaea" class="table_bl_left">
      					${board.REDUCTION_REASON}       
				    </td>
        		</tr>
        		        		
				<tr height="45px">
        			<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">���</td>
				    <td colspan="3" bgcolor="eaeaea" class="table_bl_left">
						<textarea type="text" class="view" style="width:99%;overflow-y: scroll ;" readonly>${board.REFERENCE}</textarea>
				    </td>
        		</tr>
			    <tr>
				  <td height="34" colspan="4" align="left" bgcolor="#FFFFFF" class=""><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					<tr>
					  <td><span class="sub_stan_blue">* ����(����) ����</span></td>
					</tr>
				  </table></td>
			    </tr>
			    <tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">����Ⱓ </td>
				  <td colspan="3" bgcolor="eaeaea" class="table_bl_left">${board.WORK_FROMDATE}</td>
			    </tr>
				<tr>
				  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">���系��</td>
				  <td colspan="3" bgcolor="eaeaea" class="table_bl_left">${board.EXE_INFO}</td>
			    </tr>
			</table>
			</td>
		  </tr>
		  <tr>
			<td height="40" align="right">
				<c:if test="${SECTION != '4'}">
					<img src="/img/mod_icon.gif" alt="����" width="56" height="18" border="0" style="cursor:pointer;" onclick="javascript:Modify()">
				</c:if>
			</td>
		  </tr>
		</table></td>
	</tr>
</table>
</body>
</html>