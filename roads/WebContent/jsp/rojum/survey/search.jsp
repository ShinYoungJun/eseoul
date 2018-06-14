<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
        <script language="javascript" src="/js/common.js"></script>
        <script language="javascript" src="/js/PopupCalendar.js"></script>
        <script language="javascript" src="/js/calculation.js"></script>
        <script language="javascript" src="/js/selectItem.js"></script>
        <script language="javascript" src="/js/Ajax_request.js"></script>

        <script>
	        function InitPage()
	        {		
	    		if('${MSG}'.length > 0){
	                alert('${MSG}');
	            }
	    		
	    		setYear(document.getElementById("YEAR"),"${YEAR}");
	    		setSelectedOptionByName(document.getElementById("SECTION"),'${SECTION}');
	        }
	
	        function checkKeySearch(){
	            if(event.keyCode == "13")
	                goSearch();
	        }
	        
            function rojum_History(idx){
                var f = document.jumyongForm;
                var gapan_no = document.getElementsByName("GAPAN_NO_ARR");
                var param = "/rojum/jumyong/history_info.do?GAPAN_NO="+gapan_no[idx].value;

                location.href=param;
            }
	        
            function goSearch()
            {
            	var YEAR = document.getElementById("YEAR").value;
				var GU_CD = document.getElementById("GU_CD").value;
                var BJ_CD = document.getElementById("BJ_CD").value;
                var BONBUN = document.getElementById("BONBUN").value;
                var BUBUN = document.getElementById("BUBUN").value;
                var OWNER_NAME = document.getElementById("OWNER_NAME").value;
                var GAPAN_NO = document.getElementById("GAPAN_NO").value;
                var SECTION = document.getElementById("SECTION").value;
                //********** BEGIN_����_20120313
                var GUGAN_CD = document.getElementById("GUGAN_CD").value;
                var FT_TYP = document.getElementById("FT_TYP").value;

                
//                location.href="/rojum/survey/search.do?YEAR="+YEAR+"&GU_CD="+GU_CD+"&BJ_CD="+BJ_CD+"&BONBUN="+BONBUN+
//				"&BUBUN="+BUBUN+"&OWNER_NAME="+OWNER_NAME+"&GAPAN_NO="+GAPAN_NO+"&SECTION="+SECTION+"&EXCEL=N";

                location.href="/rojum/survey/search.do?YEAR="+YEAR+"&GU_CD="+GU_CD+"&BJ_CD="+BJ_CD+"&BONBUN="+BONBUN+
				"&BUBUN="+BUBUN+"&OWNER_NAME="+OWNER_NAME+"&GAPAN_NO="+GAPAN_NO+"&SECTION="+SECTION+"&EXCEL=N"+
				"&GUGAN_CD="+GUGAN_CD+"&FT_TYP="+FT_TYP;
                //********** END_����_20120313
              
            }
            
            //function excel_Search()
            //{
            //	var YEAR = document.getElementById("YEAR").value;
			//	var GU_CD = document.getElementById("GU_CD").value;
            //    var BJ_CD = document.getElementById("BJ_CD").value;
            //    var BONBUN = document.getElementById("BONBUN").value;
            //    var BUBUN = document.getElementById("BUBUN").value;
            //    var OWNER_NAME = document.getElementById("OWNER_NAME").value;
            //    var GAPAN_NO = document.getElementById("GAPAN_NO").value;
            //    var SECTION = document.getElementById("SECTION").value;
		
            //    location.href="/rojum/survey/search.do?YEAR="+YEAR+"&GU_CD="+GU_CD+"&BJ_CD="+BJ_CD+"&BONBUN="+BONBUN+
			//		"&BUBUN="+BUBUN+"&OWNER_NAME="+OWNER_NAME+"&GAPAN_NO="+GAPAN_NO+"&SECTION="+SECTION+"&EXCEL=Y";
		    //}
            
            
            function	excel_Search()
        	{ 
            	var YEAR = document.getElementById("YEAR").value;
				var GU_CD = document.getElementById("GU_CD").value;
                var BJ_CD = document.getElementById("BJ_CD").value;
                var BONBUN = document.getElementById("BONBUN").value;
                var BUBUN = document.getElementById("BUBUN").value;
                var OWNER_NAME = document.getElementById("OWNER_NAME").value;
                var GAPAN_NO = document.getElementById("GAPAN_NO").value;
                var SECTION = document.getElementById("SECTION").value;
                var form = document.surveyForm;

                //********** BEGIN_����_20120313
                var GUGAN_CD = document.getElementById("GUGAN_CD").value;
                //********** END_����_20120313
                
                var FT_TYP = document.getElementById("FT_TYP").value;
                
                //form.action = "excel_search.do";
                //********** BEGIN_����_20120313
//                location.href = "/rojum/survey/excel_search.do?YEAR="+YEAR+"&GU_CD="+GU_CD+"&BJ_CD="+BJ_CD+"&BONBUN="+BONBUN+
//    						"&BUBUN="+BUBUN+"&OWNER_NAME="+OWNER_NAME+"&GAPAN_NO="+GAPAN_NO+"&SECTION="+SECTION+"&EXCEL=Y";

  location.href = "/rojum/survey/excel_search.do?YEAR="+YEAR+"&GU_CD="+GU_CD+"&BJ_CD="+BJ_CD+"&BONBUN="+BONBUN+
    						"&BUBUN="+BUBUN+"&OWNER_NAME="+OWNER_NAME+"&GAPAN_NO="+GAPAN_NO+"&SECTION="+SECTION+"&EXCEL=Y"+
    						"&GUGAN_CD="+GUGAN_CD+"&FT_TYP="+FT_TYP;
                //********** END_����_20120313

        		//location.href="/rojum/jumyong/excel_search.do"; // ���� �Ǵ°�.. ��� 404�� ���� url�̶�°ǰ�..
        		
                //form.submit();
                
                //location.href= "/excel_search.jsp?YEAR="+YEAR+"&GU_CD="+GU_CD+"&BJ_CD="+BJ_CD+"&BONBUN="+BONBUN+
    			//			"&BUBUN="+BUBUN+"&OWNER_NAME="+OWNER_NAME+"&GAPAN_NO="+GAPAN_NO+"&SECTION="+SECTION+"&EXCEL=Y";
        		//form.submit();
        	}
            
            
            function surveyRegister(){
        		var form = document.surveyForm;
        		form.action = "/rojum/survey/register.do";
        		form.submit();
            }
            
            function unPickup(){
                var select_item = document.getElementsByName("SELECT_ITEM");
                var item_check = document.getElementsByName("ITEM_CHECK");
                
                var count = 0;

                for(var i = 0 ; i < select_item.length ; i++){
                    if(select_item[i].checked == true){
                        item_check[i].value = select_item[i].checked;
                        count++;
                    }
                }
                
               	if(count > 0){
                	if(confirm("�ΰ��� ���� �ش� �ǿ� ���Ͽ� ����޴��� ����Ͻðڽ��ϱ�?")){
                		var form = document.surveyForm;
                		form.action = "/rojum/survey/un_pickup.do";
                		form.submit();
                	}
               	}else{
               		alert("ó���� �����Ͱ� �����ϴ�.");
               	}
            }
            
            function setSpecial(){
            	MessageDisplay('SpecialDiv','SpecialDivValue',1);
            }
            
            function file_down(){
            	
            	if(confirm("${YEAR}"+"�⵵ �������� �ڷḦ �����ްڽ��ϱ�?")){
                    
            		MessageDisplay('filedown','FILEDOWNValue',1);

                    document.getElementById("FildDownIco").onclick = function(){
                        alert("��ø� ��ٸ�����.");
                    };
    					
                    document.surveyForm.action = "/mdb/execute_download.do";
                    document.surveyForm.target = "ifrm";
                    document.surveyForm.submit();
            	}
            }
            <%--
            	��¥ :2013/05/10 �ۼ��� : sungh83
            	�������� �ڷ� �ø��� ����� Ȯ���� ó�� �Լ� 
            --%>
            function file_upload(){
				var file = document.uploadForm.mdbFile.value;
				var mdbFile = file.lastIndexOf(".");
				var extnm = file.substring(mdbFile+1);
					if(extnm == "mdb")
					{				
			    	document.uploadForm.action = "/mdb/executeUpload.do";
			    	document.uploadForm.submit();
					}else{
						alert("÷���Ҽ� ���� �����Դϴ�.\�ٽ� �����Ͽ� �ֽʽÿ�.");
					}
				}
			/*
			function file_upload(){
			    document.uploadForm.action = "/mdb/executeUpload.do";
			    document.uploadForm.submit();
			}
			*/
            
            function check_special_st(){
            	var specialSt = document.getElementsByName("SPECIAL_ST");
            	if(specialSt[0].checked){
            		document.getElementById("SPECIAL_DATE_SPAN").style.display = "none";
            		document.getElementById("SPECIAL_DATE").value = "";
            	}else{
            		document.getElementById("SPECIAL_DATE_SPAN").style.display = "inline-block";
            	}
            }
            
            function SubmitSpecialRoad(){
            	
            	if(document.getElementsByName("SPECIAL_ST")[1].checked){
            		
            		if(document.getElementById("SPECIAL_DATE").value.length < 1){
            			alert("�������ڸ� �Է��ϼ���.");
            			document.getElementById("SPECIAL_DATE").focus();
            			return;
            		}
            	}
            	
                var select_item = document.getElementsByName("SELECT_ITEM");
                var item_check = document.getElementsByName("ITEM_CHECK");
                
                var count = 0;

                for(var i = 0 ; i < select_item.length ; i++){
                    if(select_item[i].checked == true){
                        item_check[i].value = select_item[i].checked;
                        count++;
                    }
                }
                
               	if(count > 0){
                	if(confirm("�ش� �ǿ� ���Ͽ� �Ÿ������� �����Ͻðڽ��ϱ�?")){
                		var form = document.surveyForm;
                		form.action = "/rojum/survey/batch_mod_special.do";
                		form.submit();
                	}
               	}else{
               		alert("ó���� �����Ͱ� �����ϴ�.");
               	}
            }
            
            
            function changeGuCd(obj){
            	var guCd = getSelectedValue(obj);
                var	param	= "guCd="+guCd;
                sendRequest("/get_bjdong_code.do", param, "GET", ResultChangeGuCd);
            	
            	
            }

            function	ResultChangeGuCd(obj)
            {
            	select_innerHTML(document.getElementById("BJ_CD"),obj);
            	//********** BEGIN_����_20120315
            	changeGuCdGuGan();
            	//********** END_����_20120315
            	
            }


            ////////////////////////////////AJAX////////////////////////////////////////////
            function getXMLHTTPRequest()
            {
                var xRequest = null;
                xRequest = new ActiveXObject("Microsoft.XMLHTTP");

                return xRequest;
            }

            var req;
            var	call;

            function sendRequest(url, params, HttpMethod, callback)
            {
                req = getXMLHTTPRequest();

                call	= callback;
                if(req){
                    req.onreadystatechange = onReadyStateChange;
                    req.open(HttpMethod, url, true);
                    req.setRequestHeader("Content-Type","application/x-www-form-urlencoded;charset=utf-8");
                    req.send(params);
                }
            }

            function onReadyStateChange()
            {
                var ready = req.readyState;
                var data = null;
                if(ready == 4){
                    if(this.call	!= null)
                    {
                        this.call(req.responseText);
                    }
                }
            }
          //********** BEGIN_����_20120315
		function changeGuCdGuGan(){		
			var guCd = document.getElementById("GU_CD").value;	    	
			var	param	= "guCd="+guCd;
			sendRequest("/rojum/survey/getSectionCode.do", param, "GET", ResultChangeGuCdGuGan);
		}

		function	ResultChangeGuCdGuGan(obj)
		{
			select_innerHTML(document.getElementById("GUGAN_CD"),obj);
		}
          //********** END_����_20120315
        </script>
    </head>

    <body onload="javascript:InitPage();">
    <iframe id="ifrm" name="ifrm" width="70%" height="0px" style="visibility: hidden;"></iframe>

		<form name="uploadForm" action="/mdb/executeUpload.do" method="post" enctype="multipart/form-data">
		<div id="fileupload" style="position: absolute; display: none;">
		<table id="FILEUPValue" width="300px" height="150px" border="3" bordercolor="#c9afed" style="border-collapse: collapse; background-color: white;" cellpadding="0" cellspacing="0" class="sub_table">
			<tr>
				<td align="center">
				<table width="290px" height="120px" border="0" style="border-collapse: collapse; background-color: white;" cellpadding="0" cellspacing="0" class="sub_table">
					<tr>
						<td align="center"><font color="red">��������ý��� MDB���� ���ε�</font></td>
					</tr>
					<tr>
						<td><input type="file" name="mdbFile" size="15" class="input_form1"></td>
					</tr>
					<tr>
						<td align="center"><img src="/img/save_icon2.gif" alt="���" border="0" onclick="javascript:file_upload();" style="cursor: pointer"> 
							<img src="/img/can_icon.gif" alt="���" border="0" onclick="MessageDisplay('fileupload','FILEUPValue',0);" style="cursor: pointer">
						</td>
					</tr>
				</table>
				</td>
			</tr>
		</table>
		</div>
		</form>

		<form id="surveyForm" name="surveyForm" method="post">
            <div id="filedown" style="position:absolute;display:none;">
            	<table id="FILEDOWNValue" width="213px" height="59px">
            	<tr>
            		<td>
            			<img src="/img/loadingBar.gif">
            		</td>
            	</tr>
            	</table>
            </div>
            <div id="SpecialDiv" style="position:absolute;display:none;">
				<table id="SpecialDivValue" width="210px" height="70px" border="3" bordercolor="#c9afed" style="border-collapse:collapse;background-color:white;" cellpadding="0" cellspacing="0" class="sub_table">
				<tr>
					<td align="center">
						<table width="200px" height="60px" border="0" style="border-collapse:collapse;background-color:white;" cellpadding="0" cellspacing="0" class="sub_table">
							<tr>
							<td height="5px">
							</td>
							</tr>
							<tr>
							<td>
							<font color="#5624A2">�Ÿ����� ����</font>
							</td>
							</tr>
							<tr>
								<td height="60px" style="vertical-align: top;">
									<input name="SPECIAL_ST" type="radio" value="1" checked onclick="check_special_st();" style="vertical-align: middle;">
									�ϹݰŸ�
									<input name="SPECIAL_ST" type="radio" value="0" onclick="check_special_st();" style="vertical-align: middle;">
									Ưȭ�Ÿ�
									<br>
									<span id="SPECIAL_DATE_SPAN" style="display:none;">
									��������:
									<input id="SPECIAL_DATE" name="SPECIAL_DATE"  type="text" class="input_form1" style="width:60px;vertical-align: middle;" readonly>
									<img src="/img/calendar_icon.gif" width="19" height="16" border="0" onClick="popUpCalendar(this, document.getElementById('SPECIAL_DATE'), 'yyyymmdd')" style="CURSOR:pointer;vertical-align: middle;">
									</span>
								</td>
							</tr>
							<tr>
								<td align="center" >
									<img src="/img/mod_icon.gif" alt="����" width="56" height="18" border="0" onClick="SubmitSpecialRoad();"  style="cursor:pointer">
									<img src="/img/can_icon.gif" alt="���" border="0" onclick="MessageDisplay('SpecialDiv','SpecialDivValue',0);" style="cursor:pointer" >
								</td>
							</tr>
						</table>
					</td>
				</tr>
				</table>
            </div>
            <table width="780px" border="0" cellpadding="0" cellspacing="0">

                <tr>
                    <td height="43">
                        <img src="/img/sub7_cont0_title.gif" width="800" height="43">
                    </td>
                </tr>
                <tr>
                    <td align="center">
                        <table width="780px" border="0" cellspacing="0" cellpadding="0">
                            <tr>
                                <td>
                                    <table width="780px" border="0" cellspacing="0" cellpadding="0">
                                        <tr>
                                            <td align="left" height="22" background="/img/tab_line_blue.gif">
                                            </td>
                                        </tr>
                                        <tr>
                                            <td class="contborder_purple">
                                                <table width="100%" border="0" cellspacing="0" cellpadding="0">
                                                    <tr>
                                                        <td>
                                                            <table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse: collapse;" cellpadding="0" cellspacing="0" class="sub_table">
                                                               <!--  //********** BEGIN_����_20120312 -->
																<!-- 
																<tr>
                                                                    <td height="26px" width="100px"  align="center" bgcolor="e5eff8" class="sub_table_b">����⵵</td>
                                                                    <td colspan="3" bgcolor="eaeaea" class="table_bl_left" align="left" >
                                                                        <select  id="YEAR" name="YEAR" class="input_form1" style="width:130px">
                                                            			</select>
                                                                    </td>
                                                                </tr>
																-->
																<tr>
                                                                    <td height="26px" width="100px"  align="center" bgcolor="e5eff8" class="sub_table_b">����⵵</td>
                                                                    <td bgcolor="eaeaea" class="table_bl_left" align="left" >
                                                                        <select  id="YEAR" name="YEAR" class="input_form1" style="width:100%">
                                                            			</select>
                                                                    </td>
                                                                    <td height="26px" width="100px"  align="center" bgcolor="e5eff8" class="sub_table_b">������ȣ</td>
                                                                    <td bgcolor="eaeaea" class="table_bl_left" align="left" >
                                                                        <select  id="GUGAN_CD" name="GUGAN_CD" class="input_form1" style="width:100%">
                                                                        ${GUGAN }
                                                            			</select>
                                                                    </td>
                                                                </tr>
																<!--   //********** END_����_20120312 -->
																                                                               
                                                                	
                                                                
                                                                <tr>
                                                                    <td height="26px" width="100px"  align="center" bgcolor="e5eff8" class="sub_table_b">�ñ���</td>
                                                                    <td width="35%" bgcolor="eaeaea" class="table_bl_left" align="left" >
                                                                        <select id="GU_CD" name="GU_CD" class="input_form1" style="width: 100%" onchange="changeGuCd(this);">
                                                                            ${GU_CODE}
                                                                        </select>
                                                                    </td>
                                                                    <td width="100px"  align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
                                                                    <td bgcolor="eaeaea" class="table_bl_left" align="left">
                                                                        <select id="BJ_CD" name="BJ_CD" class="input_form1" style="width: 100%">
                                                                            ${BJ_CODE}
                                                                        </select>
                                                                    </td>
                                                                </tr>		
                                                                <tr>
                                                                    <td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">�� ��</td>
                                                                    <td bgcolor="eaeaea" class="table_bl_left" align="left" width="36%">
                                                                        <input id="BONBUN" name="BONBUN" type="text" class="input_form1" value="${BONBUN}" style="width: 45%">
																		- <input id="BUBUN" name="BUBUN" type="text" class="input_form1" value="${BUBUN}" style="width: 45%">
                                                                    </td>											
                                                                    <td align="center" bgcolor="e5eff8" class="sub_table_b">��ڸ�</td>
                                                                    <td bgcolor="eaeaea" class="table_bl_left" align="left">
                                                                    	<input name="OWNER_NAME" id="OWNER_NAME" type="text" class="input_form1" style="width: 97%" onKeyDown="javascript:checkKeySearch();" value="${OWNER_NAME}">
                                                                    </td>
                                                                </tr>
                                                                <tr>
                                                                	<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">������ȣ</td>
                                                                    <td bgcolor="eaeaea" class="table_bl_left" align="left">
                                                                        <input id="GAPAN_NO" name="GAPAN_NO" type="text" class="input_form1" style="width: 97%" onKeyDown="javascript:checkKeySearch();" value="${GAPAN_NO}">
                                                                    </td>											
                                                                	<td align="center" bgcolor="e5eff8" class="sub_table_b">�����</td>
																	<td bgcolor="eaeaea" class="table_bl_left" colspan="3" align="left">
																		<select id="SECTION" name="SECTION" class="input_form1" style="width: 100%">
																			<option value="1">����</option>
																			<option value="4">����</option>
																		</select>
																	</td>
                                                                </tr>
                                                                <tr>
                                                                	<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">�ü� ����</td>
																	<td bgcolor="eaeaea" class="table_bl_left" colspan="3" align="left">
																		<select id="FT_TYP" name="FT_TYP" class="input_form1" style="width: 130px">
																			<option value="">��ü</option>
																			<option value="021">�Ÿ�����</option>
																			<option value="022">��ġ��</option>
																		</select>
																	</td>
                                                                </tr>
                                                                <tr>

                                                                
                                                                </tr>
                                                            </table>


                                                        </td>
                                                    </tr>

                                                    <tr>
                                                        <td height="40" align="right">
                                                            <img src="/img/inquiry_icon2.gif" alt="��ȸ" width="56" height="18" border="0" onclick="javascript:goSearch();" style="cursor: pointer">
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td height="1" bgcolor="#EAEAEA"></td>
                                                    </tr>

                                                    <tr>
                                                    	<td>
															<table width="100%">
																<tr>
			                                                        <td height="34" class="sub_stan" align="left">��ü�Ǽ�&nbsp;:&nbsp;<span class="sub_stan_blue">${listCount}</span>��&nbsp;/&nbsp;��� ��Ȯ��&nbsp;:&nbsp;<span class="sub_stan_blue">${unconfirmListCount}</span>��
			                                                        </td>
			                                                        <td align="right">
																		<img src="/img/excel_icon.gif" alt="EXCEL ��ȯ(�ü� ������ ���е��� �ʰ� ��ȯ�˴ϴ�)" border="0" onclick="javascript:excel_Search();" style="cursor:pointer;">
																	</td>
																</tr>
															</table>
														</td>
                                                    </tr>
                                                    <tr>
                                                        <td>
															<table width="780px" cellpadding="0" cellspacing="0" border="0" class="sub_table" bordercolor="#c9dfed" style="border-collapse:collapse;">
															  <TR>
															    <TD width="26px"  valign="top">
															      <TABLE cellpadding="0" cellspacing="0" border="1" class="sub_table" bordercolor="#c9dfed" style="border-collapse:collapse;">
															        <TR>
															              <td width="26px" height="32px" align="center" bgcolor="e5eff8" class="sub_table_b">
																			<INPUT TYPE="checkbox" ID="SELECT_ALL" onclick="javascript:selectAll(this);">
																		  </td>
															        </TR>
															      </TABLE>
															    </TD>
															    <TD width="754px" valign="top">
															      <DIV id="topLine2" style="width:754px;overflow:hidden;">
															        <!-- //********** BEGIN_����_20120207	: width="2300px" ���� width="2450px"���� ����-->
          															<TABLE width="1900px" cellpadding="0" cellspacing="0" border="1" class="sub_table" bordercolor="#c9dfed" style="border-collapse:collapse;">
          															<!-- //********** END_����_20120207 -->															        
															          <tr>
													  					<td height="32px" width="100" align="center" bgcolor="e5eff8" class="sub_table_b">������ȣ</td>
													  					<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">�ü� ����</td>
																		<td width="80px" align="center" bgcolor="e5eff8" class="sub_table_b">���</td>
																		<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">������ �ּ�</td>
																		<td width="300px" align="center" bgcolor="e5eff8" class="sub_table_b">���θ� �ּ�</td>
																		<!--  //********** BEGIN_����_20120312 -->
																		<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">����</td>
																		<!--   //********** END_����_20120312 -->
																		
																		<td width="80px" align="center" bgcolor="e5eff8" class="sub_table_b">����(��)</td>														
																		<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">����/����</td>
																		<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">�Ÿ�����</td>
																		<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">Ưȭ�Ÿ�<br>��������</td>
																		<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">��ġ����</td>
																		<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">�������</td>
																		<td width="110px" align="center" bgcolor="e5eff8" class="sub_table_b">�ֹι�ȣ</td>
																		<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">��ȭ��ȣ</td>
																		<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">���ǰ��</td>
																		<td width="80px" align="center" bgcolor="e5eff8" class="sub_table_b">���Դ�ü</td>
															          </tr>
															        </TABLE>
															      </DIV>
															    </TD>
															  </TR>
															  <TR>
															    <TD width="26px" valign="top">
															        <TABLE cellpadding="0" cellspacing="0" border="1" class="sub_table" bordercolor="#c9dfed" style="border-collapse:collapse;">
													          			<c:forEach items="${blist}" var="board" varStatus="idx">
													  					<tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''"	style="cursor: pointer">
													  						<td height="26px" width="35px" align="center" bgcolor="e5eff8" class="sub_table_b">
																				<INPUT TYPE="checkbox" NAME="SELECT_ITEM">
																				<INPUT TYPE="hidden" NAME="ITEM_CHECK" value="">
																				<INPUT TYPE="hidden" NAME="GAPAN_NO_ARR" value="${board.GAPAN_NO}"> 
													  						</td>
													  					</tr>
																		</c:forEach>
															        </TABLE>
															    </TD>
															    <TD width="754px" valign="top">
															      <DIV id="mainDisplay2" style="width:754px;overflow-y:hidden;overflow-x:scroll;scrollbar-face-color:#EEF8FB;scrollbar-3dlight-color:#BBBDB6; scrollbar-highlight-color:#EEF8FB;scrollbar-shadow-color:#BBBDB6; scrollbar-darkshadow-color:#EEF8FB;scrollbar-track-color:#EEF8FB;scrollbar-arrow-color:#BBBDB6;" onScroll="scrollColumn()">
															      <!-- //********** BEGIN_����_20120207	: width="2300px" ���� width="2450px"���� ����-->
															        <TABLE width="1900px" cellpadding="0" cellspacing="0" border="1" class="sub_table" bordercolor="#c9dfed" style="border-collapse:collapse;">
															          <c:forEach items="${blist}" var="board" varStatus="idx">
															          <!-- //********** END_����_20120207 -->		
																			<tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''"	style="cursor:pointer;" onclick="rojum_History('${idx.count-1}');">
																				<td height="26px" width="100px" align="center" >${board.GAPAN_NO}</td>
																				<td width="100px" align="center" >${board.FT_TYP_NM}&nbsp;/&nbsp;${board.FT_SEL_NM}</td>
																				<td width="80px" align="center" >${board.OWNER_NAME}</td>
																				<td width="100px" align="center" >${board.WITH_ADDR}</td>
																				<!--  //********** BEGIN_KANG_20120424 -->
																				<!-- <td width="300px" align="center" >${board.SI}&nbsp;${board.GUN}&nbsp;${board.DORO_NM}&nbsp;${board.BD_BON}&nbsp;${board.BD_BU}&nbsp;${board.BD_NM}&nbsp;${board.BD_DET_NM}</td> -->
																				<td width="300px" align="center" ><c:if test="${board.DORO_NM != null && board.DORO_NM != ''}">${board.SI} ${board.GUN} ${board.DORO_NM} ${board.BD_BON}<c:if test="${board.BD_BU != '0' && board.BD_BU != null}">-${board.BD_BU}</c:if> ${board.BD_NM} ${board.BD_DET_NM}</c:if></td>
																				<!--   //********** END_KANG_20120424 -->																				
																				
																				<!--  //********** BEGIN_����_20120312 -->
																				<td width="100px" align="center" >
																					<!--  //********** BEGIN_����_20120315 -->
																					<c:if test="${board.GUGAN_CD!=0 && board.GUGAN_CD!=null}">
																						�� ${board.GUGAN_CD} ����
																					</c:if>
																					<!--   //********** END_����_20120315 -->
																				</td>
																				<!--   //********** END_����_20120312 -->																			
																				
																				<td width="80px" align="center" >${board.PLACE_A}</td>
																				<td width="100px" align="center" >
																				<c:choose>
																				<c:when test="${board.MAINTN_OB == '1'}">�������</c:when>
																				<c:otherwise>������</c:otherwise>
																				</c:choose>
																				</td>
																				<td width="100px" align="center">
																					<c:choose>
																					<c:when test="${board.SPECIAL_ST == '1'}">�ϹݰŸ�</c:when>
																					<c:otherwise>Ưȭ�Ÿ�</c:otherwise>
																					</c:choose>
																				</td>
																				<td width="100px" align="center" >${rnic:addDash(board.SPECIAL_DATE)}</td>
																				<td width="100px" align="center" >${rnic:addDash(board.FOUND_DATE)}</td>
																				<td width="100px" align="center" >${rnic:addDash(board.REG_DATE)}</td>
																				<td width="110px" align="center" >${board.OWNER_SSN}</td>
																				<td width="100px" align="center" >${board.OWNER_HP}</td>
																				<td width="100px" align="center" >${board.SG_TYP}</td>
																				<td width="80px" align="center" >${board.UN_TYP}</td> 
																			</tr>
																		</c:forEach>	
															        </TABLE>
															      </DIV>
															    </TD>
															  </TR>
															</table>
                                                        </td>
                                                    </tr>
													<tr>
													  <td height="40" align="center">
													   <table width="100%" border="0" cellspacing="0" cellpadding="0">
													       <tr>
													         <td align="center">
													         	<table border="0" cellpadding="0" cellspacing="0">
													            <tr>
													            	${strPageDivideForm}
													            </tr>
													         	</table>
													         </td>
													       </tr>
													     </table>
													    </td>
													</tr>
                                                    <tr>
	                                                    <td>
	                                                    <table width="100%">
		                                                    <tr>
			                                                    <td width="50%" align="left">
			                                                    	<img src="/img/rojum_register.gif" alt="�űԵ��" border="0" onclick="javascript:surveyRegister();" style="cursor:pointer;">
		                                                            <img src="/img/rojum_unpickup.gif" alt="�̼��� ������" border="0" onclick="javascript:unPickup();" style="cursor:pointer;">
		                                                            <img src="/img/rojum_special.gif" alt="�Ÿ���������" border="0" onclick="javascript:setSpecial();" style="cursor:pointer;">
			                                                    </td>
			                                                    <td align="right">
			                                                    	<img id="FildDownIco" src="/img/data_down.gif" alt="�����������ϴٿ�" border="0" onclick="javascript:file_down();" style="cursor:pointer;">
																	<img id="FildUpIco" src="/img/data_upload.gif" alt="�����������Ͼ��ε�" border="0" onclick="MessageDisplay('fileupload','FILEUPValue',1);" style="cursor:pointer;">
			                                                    </td>
		                                                    </tr>
	                                                    </table>
	                                                    </td>
                                                    </tr>
                                                </table>
                                            </td>
                                        </tr>

                                    </table>
                                </td>
                            </tr>
                            <tr>
                                <td height="30"></td>
                            </tr>
                        </table>
                    </td>
                </tr>
            </table>
        </form>
        <iframe id="ifrm" name="ifrm" width="70%" height="0px"></iframe>
    </body>
    
<script type="text/javascript">
var ft_type = "${FT_TYP}";
//alert(ft_type);
if(ft_type == null)
	document.getElementById("FT_TYP").value = "";
else 
	 document.getElementById("FT_TYP").value = ft_type;
</script>
    
</html>