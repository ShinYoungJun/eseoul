<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/include.jsp" %>
<%@ include file="/jsp/common/loginCheck.jsp" %>

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
</head>

<script language="javascript" src="/js/PopupCalendar.js"></script>
<script language="javascript" src="/js/Check_inputbox.js"></script>
<script language="javascript" src="/js/common.js"></script>
<script language="javascript" src="/jsp/RexServer/rexscript/rexpert.js"></script>
<script language="javascript" src="/jsp/RexServer/rexscript/rexpert_properties.js"></script>

<script type="text/javascript">
//<![CDATA[
	
	function	Page(page)
	{
		if(page	==	"")
			return;
		
		var form = document.form;
		
		form.action = "search.do?currentPage=" + page;
		form.submit();
	}

	function	View(adminno)
	{
		var form = document.form;

		form.action = "view.do?ADMIN_NO=" + adminno;
		form.submit();
	}

	function	Search()
	{
		var form = document.form;

		if(document.getElementById("beforeGiganCheck").checked){
			if(document.getElementById("giganRegdate").value=="" || document.getElementById("giganRegdate").value==null){
				alert("�Ⱓ ������ �⵵�� �־��ּ���!");
				return;
			}
			if(document.getElementById("AfterGigan1").value=="" || document.getElementById("AfterGigan1").value==null){
				alert("���� ����Ⱓ�� �־��ּ���!");
				return;
			}
			if(document.getElementById("AfterGigan2").value=="" || document.getElementById("AfterGigan2").value==null){
				alert("���� ����Ⱓ�� �־��ּ���!");
				return;
			}
			if(document.getElementById("AfterGigan1").value>document.getElementById("AfterGigan2").value){
				alert("���� ����Ⱓ�� �������ڰ� �������ں��� �ʰ� ������ �� �����ϴ�.");
				return;
			}
		}
		
		var purpose1 = IFRM_PurposeCode.document.getElementById("PURPOSE1");
		
		form.currentPage.value	= 1;
		form.PURPOSE_CD.value	= IFRM_PurposeCode.document.getElementById("PURPOSE_CD").value;

		if(purpose1[0].text.length!=0){
			if(purpose1[purpose1.selectedIndex].text == "::����::"){
				form.PURPOSE_CD.value = "";
			}
		}else{
			form.PURPOSE_CD.value = "";		
		}
			
			
		var type = document.getElementById("TYPE").value;
		if(type.length==0)		//���������� ������ �ȵǸ� ��������� ���õ��� �ʵ��� purpose���� ���� 
			purpose="";
		
		form.action = "search.do";
		form.submit();
	}
	
	function	excel_Search()
	{
		var form = document.form;

		form.currentPage.value	= 1;
		form.PURPOSE_CD.value	= IFRM_PurposeCode.document.getElementById("PURPOSE_CD").value;

		if(form.TYPE.value=="")
			form.PURPOSE_CD.value = "";

		form.action = "excel_search.do";
		form.submit();

		
	}

	function	Select_UseType(sel)
	{
		document.getElementById("IFRM_PurposeCode").src="/jsp/common/purposeCode/purposeCode2.jsp?SectionCode="+sel.value+"&PURPOSE_CD=&search_flag=1";
	}

	function	Init()
	{
		if(document.form.PURPOSE_CD.value.length<1){
			document.getElementById("IFRM_PurposeCode").src="/jsp/common/purposeCode/purposeCode2.jsp?SectionCode="+document.getElementById("TYPE").value+"&PURPOSE_CD=000"+"&search_flag=1";
		}else{
			document.getElementById("IFRM_PurposeCode").src="/jsp/common/purposeCode/purposeCode2.jsp?SectionCode="+document.getElementById("TYPE").value+"&PURPOSE_CD="+document.form.PURPOSE_CD.value;	
		}

		var getDate_ = "${giganRegdate}";
		var getDate = new Date();		
		if(getDate_.length==0){
			document.getElementById("giganRegdate").value = getDate.getFullYear();
		}else{
			document.getElementById("giganRegdate").value = getDate_;		
		}
		if(document.getElementById("check_gigan").value=="1"){
			document.getElementById("beforeGiganCheck").checked = true;
			checkGigan();
		}

		setSelectedOption(document.getElementById("SECTION"), "${SECTION}");
	}
	
	function checkKeySearch()
	{
		if(event.keyCode == 13) Search();
	}
	
	//�ϰ� ��� ��ȸ
	function	View_Ilwal()
	{
		var form = document.form;
		
		if(form.TOTALCNT.value <= 0)
		{
			alert("�ϰ�ó���� �����Ͱ� �����ϴ�");
			return;
		}
		
		form.action = "view_ilgwal.do";
		form.submit();
	}

	function checkGigan(){
		if(document.getElementById("beforeGiganCheck").checked){

			if("${SECTION}" == 1){
				document.getElementById("beforeGigan").style.display="block";
				document.getElementById("complateGigan").style.display="none";
				document.getElementById("check_gigan").value="1";	
				document.getElementById("Ilwal_span1").style.display="none";
				document.getElementById("Ilwal_span2").style.display="block";
				document.getElementById("Ilwal_span3").style.display="none";
			}else{
				document.getElementById("beforeGigan").style.display="block";
				document.getElementById("complateGigan").style.display="none";
				document.getElementById("check_gigan").value="1";	
				document.getElementById("Ilwal_span1").style.display="none";
				document.getElementById("Ilwal_span2").style.display="none";
				document.getElementById("Ilwal_span3").style.display="block";
			}
				
		}else{
			document.getElementById("beforeGigan").style.display="none";
			document.getElementById("complateGigan").style.display="block";
			document.getElementById("check_gigan").value="0";
			document.getElementById("Ilwal_span1").style.display="block";
			document.getElementById("Ilwal_span2").style.display="none";
			document.getElementById("Ilwal_span3").style.display="none";	
		}
	}
	
	function Ilgwal_license(){
		var count = "${totalcnt}";
		if(count==0){
			alert("���õ� �ڷᰡ �����ϴ�.");
			return;
		}
	
		var oRptMainParam;
		oRptMainParam = rex_GetgoDictionay(); 

		// �ɼ� - viewer	
		oRptMainParam.put("rex_open_window", "center=yes,scrollbars=no,status=no,toolbar=no,resizable=1,location=no,menu=no,width=1000,height=1000");
		
		// �ʼ� - ����Ʈ��
		oRptMainParam.put("rex_rptname", "license_gigan2");

		// �ʼ� - ������ Ÿ�� ����
		oRptMainParam.put("rex_datatype", "XML");  // XML, CSV

		// �ɼ� - �ٸ� DB�� �����
		oRptMainParam.put("rex_userservice", "oracle_jndi");

		// �ɼ� - �Ķ���� ����
		var form 	= document.form;
		
		var purpose = form.PURPOSE_CD.value;
		var str1 = "";
    	var str2 = "";
    	var str3 = "";
    	if(purpose.length>1){
	    	str1 = purpose.substring(0,1);
	    	str2 = purpose.substring(1,2);
	    	str3 = purpose.substring(2,3);
    	}

    	if(purpose == ""	||	purpose == null || purpose.length == 0){
    		purpose = "%";    		
    	}else if(str3=="0"){
    		if(str2=="0"){
    			purpose = str1+"%";
    		}else{
    			purpose = str1+str2+"%";
    		}
    	}
    	
		if(form.TYPE.value=="" || form.TYPE.value==null)
			oRptMainParam.put("TYPE" ,"%");
		else
			oRptMainParam.put("TYPE" ,form.TYPE.value);
		
		oRptMainParam.put("PURPOSE_CD" ,purpose);
		
		if(form.ADMINNO.value=="" || form.ADMINNO.value==null)
			oRptMainParam.put("ADMIN_NO" ,"%");
		else
			oRptMainParam.put("ADMIN_NO" ,"%"+form.ADMINNO.value+"%");
			
		if(form.NAME.value=="" || form.NAME.value==null)
			oRptMainParam.put("NAME" ,"%");
		else
			oRptMainParam.put("NAME" ,"%"+form.NAME.value+"%");
			
		if(form.BJ_CD.value=="" || form.BJ_CD.value==null)
			oRptMainParam.put("BJ_CD" ,"%");
		else
			oRptMainParam.put("BJ_CD" ,form.BJ_CD.value);
			
		if(form.BONBUN.value=="" || form.BONBUN.value==null)
			oRptMainParam.put("BONBUN" ,"%");
		else
			oRptMainParam.put("BONBUN" ,"%"+form.BONBUN.value+"%");
			
		if(form.BUBUN.value=="" || form.BUBUN.value==null)
			oRptMainParam.put("BUBUN" ,"%");
		else
			oRptMainParam.put("BUBUN" ,"%"+form.BUBUN.value+"%");
			
		oRptMainParam.put("REGDATE" ,form.giganRegdate.value+"%");
		oRptMainParam.put("AFTER_FROMDATE" ,nr_Date_Cut(form.AfterGigan1.value));
		oRptMainParam.put("AFTER_TODATE" ,nr_Date_Cut(form.AfterGigan2.value));
		oRptMainParam.put("SIDO" ,form.SIDO.value);
		oRptMainParam.put("SIGUNGU" ,form.SIGUNGU.value);
		oRptMainParam.put("USER_ID" ,form.userId.value);




		// preview �˾� ����
		rex_gfRexRptOpen("popup", oRptMainParam);

		//return oRptMainParam;	
	}

	function Ilgwal_license2(){
		var count = "${totalcnt}";
		if(count==0){
			alert("���õ� �ڷᰡ �����ϴ�.");
			return;
		}
	
		var oRptMainParam;
		oRptMainParam = rex_GetgoDictionay(); 

		// �ɼ� - viewer	
		oRptMainParam.put("rex_open_window", "center=yes,scrollbars=no,status=no,toolbar=no,resizable=1,location=no,menu=no,width=1000,height=1000");
		
		// �ʼ� - ����Ʈ��
		oRptMainParam.put("rex_rptname", "license_gigan2_doro_151008");

		// �ʼ� - ������ Ÿ�� ����
		oRptMainParam.put("rex_datatype", "XML");  // XML, CSV

		// �ɼ� - �ٸ� DB�� �����
		oRptMainParam.put("rex_userservice", "oracle_jndi");

		// �ɼ� - �Ķ���� ����
		var form 	= document.form;
		
		var purpose = form.PURPOSE_CD.value;
		var str1 = "";
    	var str2 = "";
    	var str3 = "";
    	if(purpose.length>1){
	    	str1 = purpose.substring(0,1);
	    	str2 = purpose.substring(1,2);
	    	str3 = purpose.substring(2,3);
    	}

    	if(purpose == ""	||	purpose == null || purpose.length == 0){
    		purpose = "%";    		
    	}else if(str3=="0"){
    		if(str2=="0"){
    			purpose = str1+"%";
    		}else{
    			purpose = str1+str2+"%";
    		}
    	}
    	
		if(form.TYPE.value=="" || form.TYPE.value==null)
			oRptMainParam.put("TYPE" ,"%");
		else
			oRptMainParam.put("TYPE" ,form.TYPE.value);
		
		oRptMainParam.put("PURPOSE_CD" ,purpose);
		
		if(form.ADMINNO.value=="" || form.ADMINNO.value==null)
			oRptMainParam.put("ADMIN_NO" ,"%");
		else
			oRptMainParam.put("ADMIN_NO" ,"%"+form.ADMINNO.value+"%");
			
		if(form.NAME.value=="" || form.NAME.value==null)
			oRptMainParam.put("NAME" ,"%");
		else
			oRptMainParam.put("NAME" ,"%"+form.NAME.value+"%");
			
		if(form.BJ_CD.value=="" || form.BJ_CD.value==null)
			oRptMainParam.put("BJ_CD" ,"%");
		else
			oRptMainParam.put("BJ_CD" ,form.BJ_CD.value);
			
		if(form.BONBUN.value=="" || form.BONBUN.value==null)
			oRptMainParam.put("BONBUN" ,"%");
		else
			oRptMainParam.put("BONBUN" ,"%"+form.BONBUN.value+"%");
			
		if(form.BUBUN.value=="" || form.BUBUN.value==null)
			oRptMainParam.put("BUBUN" ,"%");
		else
			oRptMainParam.put("BUBUN" ,"%"+form.BUBUN.value+"%");
			
		oRptMainParam.put("REGDATE" ,form.giganRegdate.value+"%");
		oRptMainParam.put("AFTER_FROMDATE" ,nr_Date_Cut(form.AfterGigan1.value));
		oRptMainParam.put("AFTER_TODATE" ,nr_Date_Cut(form.AfterGigan2.value));
		oRptMainParam.put("SIDO" ,form.SIDO.value);
		oRptMainParam.put("SIGUNGU" ,form.SIGUNGU.value);
		oRptMainParam.put("USER_ID" ,form.userId.value);




		// preview �˾� ����
		rex_gfRexRptOpen("popup", oRptMainParam);

		//return oRptMainParam;	
	}
//]]>
</script>

<body onload="javascript:Init();">
<form id="form" name="form" method="post" action="search.jsp">
<input type="hidden" id="currentPage" name="currentPage" value="${currentPage}">
<input type="hidden" id="PURPOSE_CD" name="PURPOSE_CD" value="${PURPOSE_CD}">
<input type="hidden" id="excel" name="excel" value="">
<input id="search" name="search"  type="hidden" value="${search}">
<input id="search_flag" name="search_flag" type="hidden" value="${search_flag}">
<input type="hidden" id="TOTALCNT" name="TOTALCNT" value="${totalcnt}">
<input type="hidden" id="check_gigan" name="check_gigan" value="${check_gigan}">
<input type="hidden" id="userId" name="userId" value="${userId}">
<input type="hidden" id="SIDO" name="SIDO" value="${SIDO}">
<input type="hidden" id="SIGUNGU" name="SIGUNGU" value="${SIGUNGU}">

<table width="800" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td height="43"><img src="/img/jumyong_gigan_title.gif" width="800" height="43"></td>
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
                  <td><img src="/img/sub_periodi_title3.gif" width="110" height="22"></td>
                </tr>
            </table></td>
          </tr>
          
          <tr>
            <td class="contborder_purple"><table width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
          
					<tr>
					  <td width="15%" align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
					  <td width="35%" bgcolor="eaeaea" class="table_bl_left">
						  <select id="TYPE" name="TYPE" class="input_form1" style="width:100px" OnChange="Select_UseType(this);">
							${use_type}
						  </select>
					  </td>
					  <td width="15%" align="center" bgcolor="e5eff8" class="sub_table_b">���뱸��</td>
					  <td width="35%" bgcolor="eaeaea" class="table_bl_left">
						  <select id="SECTION" name="SECTION" class="input_form1" style="width:100px">
						  	<option value="">::��ü::</option>
                            <option value="1">���</option>
                            <option value="3">����</option>			
                          </select>
					  </td>
					  
					</tr>  
					<tr>
					  
					  <td width="15%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">���븸������</td>
					  <td width="35%" colspan="3" bgcolor="eaeaea" class="table_bl_left">
					  <table border="0" cellpadding="0" cellspacing="0" class="sub_stan"><tr><td>
						<span id="complateGigan"><input id="GIGAN1" name="GIGAN1" type="text" class="input_form1" style="width:70px" value="${GIGAN1}"><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" align="absmiddle" onclick="popUpCalendar(this, document.getElementById('GIGAN1'), 'yyyymmdd')" style="CURSOR: Hand;"></a>
						~ <input id="GIGAN2" name="GIGAN2" type="text" class="input_form1" style="width:70px" value="${GIGAN2}"><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" align="absmiddle" onclick="popUpCalendar(this, document.getElementById('GIGAN2'), 'yyyymmdd')" style="CURSOR: Hand;"></a></span>
					  </td></tr></table></td>
					</tr>
					
					<tr>
					  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�������</td>
					  <td colspan="7" bgcolor="" class="">
					  <table width="100%" border="0" cellpadding="0" cellspacing="0" class="">
						<iframe id="IFRM_PurposeCode" align="absmiddle" scrolling="no" frameborder="0" framespacing="0" width="100%" height="25"></iframe>
					  </table>
					  </td>
				    </tr>
                    
					<tr>
					  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">������ȣ</td>
	                  <td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
	                    <tr>
	                      <td><input id="ADMINNO" name="ADMINNO" type="text" class="input_form1" style="width:100px" onKeyDown="javascript:checkKeySearch();" value="${ADMINNO}"></td>
	                    </tr>
	                  </table></td>  
					  
	                  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">������/���θ�</td>
	                  <td colspan="3"bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
	                    <tr>
	                      <td><input id="NAME" name="NAME" type="text" class="input_form1" style="width:100px" onKeyDown="javascript:checkKeySearch();" value="${NAME}"></td>
	                    </tr>
	                  </table></td>
					</tr>
					
			        <tr>
	                  <td align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
	                  <td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
	                  	<tr><td><select id="BJ_CD" name="BJ_CD" class="input_form1" style="width:100px">
	                            ${bjdong_code}
	                        </select></td>
						</tr>
						</table></td>
	                  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">����</td>
	                  <td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
	                    <tr>
	                      <td><input id="BONBUN" name="BONBUN" type="text" class="input_form1" style="width:40px" value="${BONBUN}"> -
							  <input id="BUBUN" name="BUBUN" type="text" class="input_form1" style="width:40px" value="${BUBUN}"> 
						  </td>
	                    </tr>
	                  </table></td>
	                </tr>
	                <tr>
	                	<td bgcolor="eaeaea" class="table_bl_left" colspan="6" height="26">
	                		<input type="checkbox" id="beforeGiganCheck" name="beforeGiganCheck" onclick="checkGigan();">(�ϰ�)�Ⱓ���� �� �ڷ� ��ȸ
	                	</td>
	                </tr>	             
					
                  </table></td>
                </tr>
                <tr>
                	<td><span id="beforeGigan" style="display:none;">
                		<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
							<tr>
							  <td width="15%" align="center" bgcolor="e5eff8" class="sub_table_b" height="40">�Ⱓ ������<br>�⵵</td>
							  <td width="35%" bgcolor="eaeaea" class="table_bl_left">
							  	<input id="giganRegdate" name="giganRegdate" type="text" class="input_form1" style="width:70px" value="">�⵵							  	
							  </td>
							  
							  <td width="15%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">���� ����Ⱓ</td>
							  <td width="35%" colspan="3" bgcolor="eaeaea" class="table_bl_left">
							  <table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
								<input id="AfterGigan1" name="AfterGigan1" type="text" class="input_form1" style="width:70px" value="${AfterGigan1}"><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" align="absmiddle" onclick="popUpCalendar(this, document.getElementById('AfterGigan1'), 'yyyymmdd')" style="CURSOR: Hand;"></a>
								~ <input id="AfterGigan2" name="AfterGigan2" type="text" class="input_form1" style="width:70px" value="${AfterGigan2}"><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" align="absmiddle" onclick="popUpCalendar(this, document.getElementById('AfterGigan2'), 'yyyymmdd')" style="CURSOR: Hand;"></a>
							  </table></td>
							</tr>
                		</table></span>
                	</td>
                </tr>
                <tr>
                  <td height="32" align="right"><a href="javascript:Search()"><img src="/img/inquiry_icon2.gif" alt="��ȸ" width="56" height="18" border="0"></a></td>
                </tr>

                <tr>
                  <td height="1" bgcolor="#EAEAEA"></td>
                </tr>
                <tr>
                  <td height="34" class="sub_stan">��ü�Ǽ� : <span class="sub_stan_blue">${totalcnt}</span> �� </td>
                </tr>
                <tr>        
                  <td>
                	<div style=" width:780;  padding:10px;overflow-x:scroll; scrollbar-face-color:#EEF8FB;  scrollbar-3dlight-color:#BBBDB6; 
					scrollbar-highlight-color:#EEF8FB;scrollbar-shadow-color:#BBBDB6; scrollbar-darkshadow-color:#EEF8FB;  scrollbar-track-color:#EEF8FB; scrollbar-arrow-color:#BBBDB6; "--> 
                 <table width="1300" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                    <tr>
                        <td align="center" height="28"bgcolor="e5eff8" class="sub_table_b">��ȣ</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">������ȣ</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">����<br/>����</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">����<br/>����</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">����<br/>��ȣ</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">������ �ּ�</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">������ ���ּ�</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">���� �۴���<br/>�����ȣ</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">���� �۴��� ���θ��ּ�</td>
     									  <td align="center" bgcolor="e5eff8" class="sub_table_b">�ǹ�(��) ����</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">����<br/>(��)</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">�ֹι�ȣ</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">�������</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">����Ⱓ</td>         
                      </tr>
                      
					<c:choose>
						<c:when test="${blist!= null && !empty blist}">
	                      <c:forEach items="${blist}" var="board" varStatus="idx">
		                     <tr onClick="javascript:View('${board.ADMIN_NO}')" onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" style="CURSOR: Hand;" >
		                     	<td height="26" align="center">${board.RN}</td>
	        					<td align="center">${board.CUT_ADMIN_NO}</td>
	        					<td align="center">${board.TYPE}</td>
	        					<td align="center">${board.SECTION_NAME}</td>
	        					<td align="center">${board.NAME}</td>
	        					<td align="center">${board.POST}</td>
	        					<td align="center">${board.APPEAL_ADDR}</td>
	        					<td align="center">${board.SI} ${board.GUN} ${board.DORO_NM} ${board.BD_BON} ${board.BD_BU} ${board.BD_NM} ${board.BD_DET_NM}</td>
	        					<td align="center">${board.TOPOST}</td>
	        					<td align="center">${board.SONGDALGI}</td>
	        					<td align="center">${board.BD_NM_JUMJI}</td>
	        					<td align="center">${board.AREA_SIZE}</td>
	        					<td align="center">${board.SSN}</td>
	        					<td align="center">${board.JUMYONGJI}</td>
	        					<td align="center">${board.PURPOSE_CLASS} ${board.PURPOSE_SORT} ${board.PURPOSE_KIND}</td>
	        					<td align="center">${board.GIGAN}</td>
		                     </tr>
						</c:forEach>
						</c:when>
						<c:otherwise>
							<tr>
								<td align="center" class="sub_table" colspan="11" height="85">�˻��� ������ �����ϴ�</td>
							</tr>
						</c:otherwise>
					 </c:choose>
					 </table>
					 </div>
					</td>
                </tr>

                <tr>
                  <td height="30" align="center">
                  <table border="0" cellspacing="0" cellpadding="0">
                      <tr>
                      <td>${pageing}</td>
						
                      </tr>
                  </table>
                  </td>
                </tr>

            </table></td>
          </tr>
          <tr>
            <td height="40" align="right">
            	<span id="Ilwal_span1" style="display:block;">
            		<a href="javascript:View_Ilwal()"><img src="../../../img/levy_icon4.gif" alt="�ϰ� ó��" border="0"></a>
            		<a href="javascript:alert('�ϰ� �Ⱓ ���� �� �ڷ���ȸ�� üũ �ϼ���. ');"><img src="/img/jumyongjugaOFF.gif" alt="�ϰ������㰡��" border="0"></a>            		
            		<img src="../../../img/excel_icon.gif" alt="EXCEL ��ȯ" border="0" onclick="javascript:excel_Search();" style="cursor:hand"> 
            	</span>
            	<span id="Ilwal_span2" style="display:none;">
            		<a href="javascript:Ilgwal_license();"><img src="../../../img/jumyongjugaON.gif" border="0" align="absmiddle" alt="�ϰ������㰡��"></a>
            		<a href="javascript:Ilgwal_license2();"><img src="../../../img/occu_icon2.gif" border="0" align="absmiddle" alt="�ϰ������㰡��(���ι�)"></a>
            		<img src="../../../img/excel_icon.gif" alt="EXCEL ��ȯ" border="0" onclick="javascript:excel_Search();" style="cursor:hand">  
            	</span>      
            	<span id="Ilwal_span3" style="display:none;">
            		<a href="javascript:alert('���뱸����  ������� �˻��ϼ���.');"><img src="/img/jumyongjugaOFF.gif" alt="�ϰ������㰡��" border="0"></a>            		
            		<img src="../../../img/excel_icon.gif" alt="EXCEL ��ȯ" border="0" onclick="javascript:excel_Search();" style="cursor:hand"> 
            	</span>        	           	           		
            </td>
          </tr>
        </table></td>
      </tr>

  	<tr><td>
  	</td>
  	</tr>
</table></td>         
</form>

</body>
</html>