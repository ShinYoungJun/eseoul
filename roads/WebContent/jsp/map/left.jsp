<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/include.jsp"%>
<%
	String 		userId	= (String)session.getAttribute("sessionUserId");
	
	if(userId == null)
	{ 
%>
		<script language="javascript">
			alert('������ ���� �Ǿ����ϴ�.');

			opener.parent.location.href="/admin/user/login.do"
			window.self.close();
			
		</script>
<%
	}
%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR" />
<title>:::::  :::::</title>
<link href="/css/Mroads.css" rel="stylesheet" type="text/css">
<style type="text/css">
<!--
body {
	margin: 0px;
	background-image: url(/img/mapImg/left_background.gif);
}
-->
</style>

<script language="javaScript" type="text/javascript">
<!--
//----------------  ajax start ------------------------------------------------------------//
	var xmlHttp;
	var from, to;
	var type;
	
	

	function createXMLHttpRequest() {
	  if (window.ActiveXObject) {
	       xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
	  } 
	  else if (window.XMLHttpRequest) {
	       xmlHttp = new XMLHttpRequest();
	  }
	}
	
	/*
	 *	 �������� ����Ʈ ����
	 */
   function getBJDong(){
		from	= 'gu_cd';
		to		= 'bj_cd';
		
		var w = document.check;
		
		var selectedValue = document.getElementById(from).value;

		if(selectedValue == ''){
			clearAllList();
			return;
		}
		
		var url = "/getAreaCode.do?" + createParameter(from, to);

	  	createXMLHttpRequest();
	 	xmlHttp.onreadystatechange = handleStateChange;
	  	xmlHttp.open("GET", url, true);
	  	xmlHttp.send(null);
	}
	
	/*
	 *	������ ����� �Ķ���Ͱ� ����
	 */
	function createParameter(from, to) {
	 	
	 	var valFrom = document.getElementById('gu_cd').value;
	 	var valTo = document.getElementById('bj_cd').value;
	 	
	  	var queryString = "from=gu&to=bjdong&valFrom="+valFrom+"&valTo="+valTo;
	  	
	  	return queryString;
	}
	
	/*
	 *	������ �޾� ����Ʈ�� update
	 */
	function handleStateChange() {

	  if(xmlHttp.readyState == 4) {
	       if(xmlHttp.status == 200) {
		           	updateList(to);
	       }
	  }
	}
	
	/*
	 *	��� ����Ʈ�� �ʱ�ȭ
	 */
	function clearAllList() {
	
	  var bjdongObj = document.getElementById('bj_cd');
	  
	  while(bjdongObj.childNodes.length > 0) {
	       bjdongObj.removeChild(bjdongObj.childNodes[0]);
	  }
	  bjdongObj.options[0] = new Option('::����::', '');
	}
	
	/*
	 *	�������� ����Ʈ�� �ʱ�ȭ
	 */
	function clearList(to) {
	
	  var toObject = document.getElementById(to);

	  while(toObject.childNodes.length > 0) {
	       toObject.removeChild(toObject.childNodes[0]);
	  }
	}
		
	/*
	 *	�������� ����Ʈ�� update
	 */
	function updateList(to) {

	  clearList(to);
	  
	  var toObj = document.getElementById(to);
	  var values = xmlHttp.responseXML.getElementsByTagName('value');
	  var names = xmlHttp.responseXML.getElementsByTagName('name');
	  var j = 1;
	   
	   // ���� ǥ�� option ����

	  if(values.length>0){
	  	var option = new Option('::����::', '');
	  	toObj.options[0]= option;
	  }
	  else{
	  var option = new Option('����', '');
	  	toObj.options[0]= option;
	  }
	  
	  //  ����Ʈ ����ŭ option�� �޾��ش�)
	  
	  for(var i = 0; i < values.length; i++) {
	 
				//var option = new Option(names[i].firstChild.nodeValue, values[i].firstChild.nodeValue);
	       			//toObj.options[i+j] = option;
				var opt = document.createElement('option');
		       		opt.value = values[i].firstChild.nodeValue;
		       		opt.text = names[i].firstChild.nodeValue;
	       			opt.title = names[i].firstChild.nodeValue;
	       			toObj.add(opt);
	  }

	}

	//----------------  ajax end ------------------------------------------------------------//
	
		// ���� ���� ���ý� ���� ���� �ڵ� ������ ��.
	function	select_searchType()
	{
		var form = document.check;
		var searchType1 = form.searchType1.options[form.searchType1.selectedIndex].value;
		
		document.getElementById("IFRM_searchType").src="/map/searchType.do?searchType1="+searchType1;
	}
	
	function jumsearch()
	{
		var form = document.check;
		
		var searchType1 = form.searchType1.options[form.searchType1.selectedIndex].value;
		
		var iFrm = document.getElementById("IFRM_searchType");
		var type = iFrm.contentWindow.document.getElementById("type").value;;
		var type_name = iFrm.contentWindow.document.getElementById('type').options[iFrm.contentWindow.document.getElementById('type').selectedIndex].text;
		
		var gu_cd = form.gu_cd.value;
		var bj_cd = form.bj_cd.value;
		var bj_nm = document.getElementById('bj_cd').options[document.getElementById('bj_cd').selectedIndex].text;
		var spc_cd = "";
		var bonbun = form.bonbun.value;
		var bubun = form.bubun.value;
		var jumyongName = form.jumyongName.value;

		if(type == ""){
			alert("���뱸���� �����ϼ���");
			iFrm.contentWindow.document.getElementById("type").focus();
			return;
		}
		else if(gu_cd == ""){
			alert("�ñ����� �����ϼ���");
			form.gu_cd.focus();
			return;
		}
		else if(bj_cd == ""){
			alert("���鵿�� �����ϼ���");
			form.bj_cd.focus();
			return;
		}
		else if(form.spc_cd.checked == true){
			spc_cd = '2';
		}
		result.location.href="/map/searchresult.do?searchType1="+searchType1+"&type="+type+"&type_name="+type_name+"&gu_cd="+gu_cd+"&bj_cd="+bj_cd+"&bj_nm="+bj_nm+"&spc_cd="+spc_cd+"&bonbun="+bonbun+"&bubun="+bubun+"&jumyongName="+jumyongName;
		result.document.getElementById("search").innerHTML = "<img src='/img/mapImg/sing.gif'> �˻���";
		result.result_show.style.display = "none";
		
	}
		
	
//-->
</script>
</head>
<body onload="getBJDong()">
<form name="check" method="post">
<input type="hidden" name="countPerPage" value="${countPerPage}">
<input type="hidden" name="currentPage" value="${currentPage}"/>

<table width="260" height="100%" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td width="10"></td>
		<td class="Map_stan" background="/img/mapImg/tab_a.gif" width="240" height="37" align="center"><!-- span class="sub_stan_blue" --><font color="#ffffff"><b>${guNm}û<!-- /span --> <!-- span class="sub_stan_b" -->${name}</b><!-- /span -->�� ȯ���մϴ�</font></td>
		<td width="10"></td>
	</tr>
	<tr>
		<td width="10" height="250"></td>
		<td valign="top" align="center" valign="top" bgcolor="f9f9f9" class="M_leftborder">
			<table border="0" cellspacing="0" cellpadding="0">
							<tr>
								<td valign="top">
									<table width="220" border="0" cellspacing="0" cellpadding="0">
										<tr>
											<td height="33"><img src="/img/mapImg/left_title1.gif" alt="������ �˻�" width="220" height="33"></td>
										</tr>
										<tr>
											<td align="center" valign="top" class="M_leftborder2">
												<table width="198" border="0" cellpadding="0" cellspacing="0" class="Map_stan">
													<tr>
														<td width="59" height="22" class="Map_stan_b">�������</td>
														<td><select id="searchType1" name="searchType1" class="input_form1" style="width:139px; background:e0eaf7" onchange="javascript:select_searchType();">
																<option value="jumyong" selected>�Ϲ� ����</option>
																<option value="gapan">������ ���� �� �Ÿ����� �ü�</option>															
															</select>
														</td>
													</tr>
													<tr>
														<td width="59" height="22" class="Map_stan_b">���뱸��</td>
														<td>
															<table width="100%" border="0" cellpadding="0" cellspacing="0" class="sub_stan">
																<iframe id="IFRM_searchType" align="absmiddle" scrolling="no" frameborder="0" framespacing="0" width="100%" height="25" src="/map/searchType.do?searchType1=jumyong"></iframe>
															</table>
														</td>
													</tr>
													<tr>
														<td height="22">��/��/��</td>
														<td>
															<select id="gu_cd" name="GU_CD" class="input_form1" style="width:139px" onchange="javascript:getBJDong();">
																		<option value="">::����::</option>
																	<c:forEach items="${guCdList}" var="list">
																		<option value="${list.GU_CD}" <c:if test="${guNm == list.GU_NM}">selected</c:if>>${list.GU_NM}</option>
																	</c:forEach>
															</select>
														</td>
													</tr>
													<tr>
														<td height="22">��/��/��</td>
														<td>
															<select id="bj_cd" name="BJ_CD" class="input_form1" style="width:139px">
																<option>::����::</option>
															</select>
														</td>
													</tr>
													<tr>
														<td height="22">��/����</td>
														<td><input id="spc_cd" name="SAN" type="checkbox" value="2">
															<input id="bonbun" name="bun1" type="text" class="input_form1" style="width:48px">
															-
															<input id="bubun" name="bun2" type="text" class="input_form1" style="width:48px">
														</td>
													</tr>
												</table></td>
										</tr>
										<tr>
											<td height="9" background="/img/mapImg/left_bott_line.gif"></td>
										</tr>
									</table></td>
							</tr>
							<tr>
								<td valign="top">
									<table width="220" border="0" cellspacing="0" cellpadding="0">
										<tr>
											<td height="32"><img src="/img/mapImg/left_title2.gif" alt="������ �˻�" width="220" height="32"></td>
										</tr>
										<tr>
											<td align="center" valign="top" class="M_leftborder2">
												<table width="198" border="0" cellpadding="0" cellspacing="0" class="Map_stan">
													<tr>
														<td width="59" height="22">������</td>
														<td><input name="jumyongName" type="text" class="input_form1" style="width:139px"></td>
													</tr>
												</table></td>
										</tr>
										<tr>
											<td height="9" background="/img/mapImg/left_bott_line.gif"></td>
										</tr>
									</table></td>
							</tr>
							<tr>
								<td height="40" align="center"><a href="#"><img src="/img/mapImg/search_icon.gif" onClick="javascript:jumsearch();" onkeypress="javascript:jumsearch();" alt="�˻�" width="220" height="20" border="0"></a></td>
							</tr>
						</table>
		</td>
		<td width="10"></td>
	</tr>
	<tr valign="bottom">
		<td width="10" height="38" ></td>
		<td><img src="/img/mapImg/result_title.gif" width="240" height="31"></td>
		<td width="10"></td>
	</tr>
	<tr>
		<td width="10"></td>
    	<td height="100%" valign="top" align="center">
	      	<table height="100%" border="0" cellspacing="0" cellpadding="0">
	      		<tr><td width="100%" height="100%" bgcolor="f9f9f9" class="M_leftborder" style="padding-left:3px">
			      		<iframe name="result" width="100%" height="100%" scrolling="auto" marginwidth="0" marginheight="no" frameborder="no" src="/jsp/map/jumyong_result.jsp" allowtransparency="True" title="�˻����"></iframe>
		   	      		</td>
	      		</tr>
	      	</table></td>
	      <td width="10"></td>
   	</tr>

</form>
</table>

</body>
</html>
