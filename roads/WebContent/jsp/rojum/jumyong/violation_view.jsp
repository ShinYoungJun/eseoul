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

	// ����� üũ
	function checkForm(){
		var form1 = document.form1;
		alert(form1.year.value);

		form1.submit();
		//	Ư������ �Է½� �� ���� ����� �ٹٲ��� �־�� ������ ����. ������ �𸣰ڽ�
		//		w.content.value = w.content.value+' '+'\n';	
		
	}

	// �߰��� �̵�
	function goAdd(GAPAN_NO){
	
		document.form.action = "/rojum/jumyong/violation_register.do?GAPAN_NO="+GAPAN_NO+"&mode=add";
		document.form.submit();
	}

	// �������̵�
	function	Page(page)
	{
		if(page	==	"")
			return;
		
		var GAPAN_NO = document.getElementById("GAPAN_NO").value;
		
		location.href="/rojum/jumyong/violation_view.do?currentPage="+page+"&GAPAN_NO="+GAPAN_NO;
	}

	// �󼼺���
	function goView(seq){
		
		var page = document.form.currentPage.value;
		var GAPAN_NO = document.getElementById("GAPAN_NO").value;
		
		location.href="/rojum/jumyong/violation_view.do?currentPage="+page+"&SEQ="+seq+"&GAPAN_NO="+GAPAN_NO;
	}

	// �����ϱ�
	function goModify(seq){
		document.form.action = "/rojum/jumyong/violation_register.do?SEQ="+seq+"&mode=edit";
		document.form.submit();
	}

	
	function InitPage()
	{	
		var obj = document.form.message.value;
		
		if(obj != "")	
			alert(obj);
			return;

	}
	
</script>

</head>

<body onload="InitPage();">

<form name="form" id="form" method="post">
<input type="hidden" name="GAPAN_NO" value="${GAPAN_NO}">
<input type="hidden" name="message" value="${message}">
<input type="hidden" name="mode"  id = "mode" value="${mode}">
<input type="hidden" name="currentPage" value="${currentPage }">


<table width="780" border="0" cellspacing="0" cellpadding="0">
	<tr>
		<td class="contborder_purple">	
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
               		<td>
               			<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                 			<tr>
		                   		<td  width="15%" height="25" align="center" bgcolor="e5eff8" class="sub_table_b">����</td>
		                   		<td width="20%" align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
		                   		<td width="20%" align="center" bgcolor="e5eff8" class="sub_table_b">��ġ����</td>
		                   		<td width="20%" align="center" bgcolor="e5eff8" class="sub_table_b">��ġ����</td>
		                   		<td width="25%" align="center" bgcolor="e5eff8" class="sub_table_b">��ġ����</td>
		                   	</tr>
                 			
                 			<c:choose>
							<c:when test='${list != null && !empty list}'>  
		                   	<c:forEach items="${list}" var="vio" varStatus="idx">
                    		
                    		
                    		<c:choose>
							<c:when test="${vio.SEQ != violation.SEQ}">
                    		<tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" 
                    			onclick="goView('${vio.SEQ}')" style="cursor:pointer">
							</c:when>
							<c:otherwise>
							<tr onclick="goView('${vio.SEQ }')" bgcolor="#f6f7f8">
							</c:otherwise>
							</c:choose>
							
								<td height="26" align="center">${vio.VIO_DEG }</td>
		                       	<td align="center">${vio.VIO_DATE }</td>
		                       	<td align="center">${vio.VIO_ACTDATE }</td>
		                       	<td align="center">${vio.NAME }</td>
		                       	<td align="center" style="padding:5px">${vio.VIO_ACTCONTENT }</td>
                     		</tr> 
							</c:forEach>
							</c:when>
							<c:otherwise>
								<tr>
									<td align="center" class="sub_table" colspan="5" height="85"> ������ �����ϴ�</td>
								</tr>
							</c:otherwise>
							</c:choose>
					
               			</table>
               		</td>
             	</tr>
             	<tr>
               		<td height="40" align="center">
               			<table width="100%" border="0" cellspacing="0" cellpadding="0">
                   			<tr>
                     			<td align="center">
                     				<table border="0" cellpadding="0" cellspacing="0">
                       				<!-- ${pageing }-->
                     				</table>
                     			</td>
                     		</tr>
                 		</table>
                 	</td>
				</tr>
				<tr><td height="20"></td></tr>
				
				<c:if test="${ violation != null }">
				<tr>
	            	<td>
	                	<table width="100%" border="0"  cellpadding="0" cellspacing="0"  class="sub_table">
							<tr>
						    	<td width="10%" height="26" align="left"  class="sub_table_b">* ���ݻ��� ���� ����</td>		
						    </tr>
						</table>	
	                </td>
	        	</tr>					              
				<tr>
                	<td>
                		<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
			                <tr>
			                    <td height="26" width="13%" align="center" bgcolor="e5eff8" class="sub_table_b">����</td>
			                    <td width="32%" bgcolor="eaeaea" class="table_bl_left">
			                    	${violation.VIO_DEG } ��
			                    </td>
			                    
			                    <td height="26" width="13%" align="center" bgcolor="e5eff8" class="sub_table_b">��ġ����</td>
			                    <td width="32%" bgcolor="eaeaea" class="table_bl_left">
			                    	${violation.NAME } 
			                    </td>
                  			</tr>
                  			<tr>
                  				<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
			                    <td width="32%" bgcolor="eaeaea" class="table_bl_left" colspan="3">
			                    	${violation.VIO_DATE }
			                    </td> 
                  			</tr>
                  			<tr>
			                	<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b" >���ݳ���</td>
			                    <td bgcolor="eaeaea" class="table_bl_left" style="padding:5px" colspan="3">
			                    	${violation.VIO_CONTENT }
			                    </td>
                  			</tr>
                  			<tr>
			                	<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b" >��ġ����</td>
			                    <td bgcolor="eaeaea" class="table_bl_left" colspan="3">
			                    	${violation.VIO_ACTDATE }
			                    </td>
                  			</tr>
                  			<tr>
			                	<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b" >��ġ����</td>
			                    <td bgcolor="eaeaea" class="table_bl_left" style="padding:5px" colspan="3">
			                    	${violation.VIO_ACTCONTENT }
			                    </td>
                  			</tr>
                  			
                  			<tr>
			                	<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b" >����</td>
			                    <td bgcolor="eaeaea" class="table_bl_left" colspan="3">
			                    	${violation.VIO_AREA }
			                    </td>
                  			</tr>
                  			<tr>
			                    <td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">����</td>
			                    <td width="32%" width="13%"bgcolor="eaeaea" class="table_bl_left">
			                    	${violation.VIO_POINTS }
			                    </td>
								<td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
			                    <td width="32%" bgcolor="eaeaea" class="table_bl_left">
			                    	${violation.VIO_ACCPOINTS }
			                    </td>
                  			</tr>
						</table>
					</td>
				</tr>
				</c:if>
				
				
				<tr>              
                	<td height="40" align="right">
		                <img src="/img/add_icon.gif" alt="�߰�" width="56" height="18" border="0" onClick="javascript:goAdd('${GAPAN_NO}');"  style="cursor:pointer">
	                	<c:if test="${ violation != null }">
	                		<img src="/img/mod_icon.gif" alt="����" width="56" height="18" border="0" onClick="javascript:goModify('${violation.SEQ}');"  style="cursor:pointer">
	                	</c:if>
	                </td>
              	</tr>
              	
			</table>
		</td>
	</tr>
</table>
            
</form>
</body>
</html>
