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
<script language="javascript" src="/js/PopupCalendar.js"></script> 
<script>
<!--	

function gosub(seq,year,taxyn,first_seq)
{

	
	var year1 = '${year}';
	
	alert(year1);
	
	var sData = dialogArguments;
	

	
	if(taxyn == "Y")	
		sData.document.location.href ="/jumyong/productSubtractInsert.do?no="+"${ADMIN_NO}"+"&mode=add&SEQ="+seq+"&area=${area}";
	else
	{
		alert("�ΰ��� ����");
		sData.document.location.href ="/jumyong/productSubtractBeforeTaxInsert.do?no="+"${ADMIN_NO}"+"&mode=add&SEQ="+seq+"&area=${area}&year="+year1;	
		}
		/*
	else
	{
		year1 = Number(year1)-Number(1);
		
		alert(getSeqAjax(year1,first_seq));
		
		seq = document.getElementById("server_seq").value;
		
		
		
		if(seq == 0)
			alert("�۳⵵ ����ᰡ �����ϴ�.");
		else
			sData.document.location.href ="/jumyong/productSubtractBeforeTaxInsert.do?no="+"${ADMIN_NO}"+"&mode=add&SEQ="+seq+"&area=${area}";	
	}
	*/
	window.close();
}

	 function getSeqAjax(year,first_seq)
     {
     	alert("!11");
		alert(year+" dd  "+first_seq);
        var params = 'year='+year+"&first_seq="+first_seq;
		var url = "/getSeqByFirstSeq.do" ;
        var a = sendRequest(url, params, seqFromServer, "Post");  // rateFromServer �Լ��� rate �� �޾ƿ�����
     } 
     
     
      function seqFromServer()
       {      
           if(httpRequest.readyState == 4)
           {
               if(httpRequest.status == 200)
               {
				   var server_seq = httpRequest.responseText; //���� ����� �޾ƿ�.
				   alert("server_seq"+server_seq);
	               document.getElementById("server_seq").value = server_seq;
	               delete httpRequest;
               }else
               {
               	   alert("���� �����ϴ�.");
               	   delete httpRequest;
               }
           }else
           {

           }
       }
     
     	//xml js�κ�
	function getXMLRequest()
	{	
	    if(window.ActiveXObject)	
	    {	
	       try	
	       {	
	           return new ActiveXObject("MSXML2.XMLHttp");	
	       }	
	       catch(e)	
	       {
	           try{
	              return new ActiveXObject("Microsoft.XMLHttp");	
	            }
	           catch(e)
	           {
	              return null;
	           }
	       }
	    }
	    else if(window.XMLHttpRequest)	
	    {	
	       return new XMLHttpRequest();	
	    }	
	    else	
	    {	
	       return null;	
	    }	
	}	 
	
	var httpRequest = null;	 
	
	//�Ű�����: ������ ������, ������ ������, �������� ������ �ڷḦ �޴� �Լ�, ���۹��
	
	function sendRequest(url, params, callback, method)	
	{	
	   httpRequest = getXMLRequest();
	
	    //������ ���޹���� ������ �Ǿ����� Ȯ���Ѵ�. ���� ������ �ȵǾ��ٸ�	
	    //GET������� �����ϵ��� �Ѵ�.
	
	    var httpMethod =  method ? method:"GET";
	
	    if(httpMethod != "GET" && httpMethod !="POST")	
	    {
	       httpMethod = "GET";
	    }

	    //���� ������ ������ �ּҸ� �޴´�.	
	    var httpParams = (params==null || params =="")?null:params;	
	    var httpUrl = url;	
	    if(httpMethod =="GET" && params !=null)	
	    {	
	       httpUrl =httpUrl +"?"+httpParams;
	    }
	    httpRequest.open(httpMethod,httpUrl,true);
	    httpRequest.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
	
	    //onreadystatechange�� ������ Ŭ����Ʈ�� ���¸� �����Ͽ� ��ȭ�� ������
	
	    httpRequest.onreadystatechange = callback;
	
	    httpRequest.send(httpMethod=="POST" ? httpParams:null);   	
	}	
	
	
	
	//ajax js ��


	-->
</script>

</head>

<body border="0">
<form name="productForm" id="productForm" method="post" action = "/jumyong/productInsert.do" >	


<input id="server_seq" type="hidden">
<table width="100%" border="1">
<tr>
<td align="center">
	<table  border="0" cellspacing="0" cellpadding="0">
        <tr>

          <td class="contborder_purple">							            
			<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
					<td>
						<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
							<tr>
								<td width="55" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">���س⵵</td>
								<td width="40" align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
								<td width="2" align="center" class="sub_table_b"></td>								
								<td width="40" align="center" bgcolor="e5eff8" class="sub_table_b">�⵵</td>
								<td width="40" align="center" bgcolor="e5eff8" class="sub_table_b">�����</td>
								<td width="40" align="center" bgcolor="e5eff8" class="sub_table_b">����</td>
								<td width="55" align="center" bgcolor="e5eff8" class="sub_table_b">�ΰ�����</td>								
							</tr>
							<c:forEach items="${productList}" var="board" varStatus="idx">
							<tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" 
							onclick="javascript:gosub('${board.SEQ}','${board.YEAR}','${board.TAX_YNNAME}','${board.FIRST_SEQ}');" style="cursor:pointer" >
								<td height="26" align="center">${board.CAL_YEAR}</td>
								<td align="center">${board.AREA}</td>
								<td align="center"></td>
								<td align="center">${board.YEAR}</td>
								<td align="center">${board.SUM_ADJUST}</td>
								<td align="center">${board.USE_SECTIONNAME}</td>
								<td align="center">${board.TAX_YNNAME}</td>								
				                </tr> 
							</c:forEach>
				          </table>
						</td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
	</td></tr></table>
</form>
</body>
</html>



