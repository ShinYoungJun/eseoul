<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/loginCheck.jsp" %>
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
        <script language="javascript" src="/js/common.js"></script>
        <script language="javascript" src="/js/PopupCalendar.js"></script>
        <script language="javascript" src="/js/calculation.js"></script>
        <script language="javascript" src="/js/selectItem.js"></script>
        <script language="javascript" src="/js/Ajax_request.js"></script>

        <script>
            function goSearch()
            {
			
                var BJ_CD = document.getElementById("BJ_CD").value;
                var BONBUN = document.getElementById("BONBUN").value;
                var BUBUN = document.getElementById("BUBUN").value;
                var OWNER_NAME = document.getElementById("OWNER_NAME").value;
                var TAXTATION_AT = document.getElementById("taxtation_at").value;
                var SECTION = document.getElementById("View_Disuse").value;
                var GU_CD = getValueSelectTag("GU_CD");
		
                location.href="/rojum/accept/search.do?BJ_CD="+BJ_CD+"&GU_CD="+GU_CD+"&BONBUN="+BONBUN+"&BUBUN="+BUBUN+"&OWNER_NAME="+OWNER_NAME+"&TAXTATION_AT="+TAXTATION_AT+"&SECTION="+SECTION;
            }
			
            function InitPage()
            {		
        		if('${message}'.length > 0){
                    alert('${message}');
                }

        		changeSelectTag('View_Disuse','${SECTION}');
            }
		
            function removeDash(num)
            {	
                return num.split('-').join("");
            }
			
            function addDash(num)
            {
                return (num.substr(0,4)+"-"+num.substr(4,2)+"-"+num.substr(6,2));
            }
			
            function checkKeySearch(){
                if(event.keyCode == "13")
                    goSearch();
            }

            function rojum_History(idx){
                var f = document.jumyongForm;
                var gapan_no = document.getElementsByName("GAPAN_NO_ARR");
                var param = "/rojum/jumyong/owner_histroy.do?GAPAN_NO="+gapan_no[idx].value;

                location.href=param;
            }


            function excel_Search()
            {
            	var BJ_CD = document.getElementById("BJ_CD").value;
                var BONBUN = document.getElementById("BONBUN").value;
                var BUBUN = document.getElementById("BUBUN").value;
                var OWNER_NAME = document.getElementById("OWNER_NAME").value;
                var TAXTATION_AT = document.getElementById("taxtation_at").value;
                var SECTION = document.getElementById("View_Disuse").value;
                var GU_CD = getValueSelectTag("GU_CD");
		
                location.href="/rojum/accept/search.do?BJ_CD="+BJ_CD+"&GU_CD="+GU_CD+"&BONBUN="+BONBUN+"&BUBUN="+BUBUN+"&OWNER_NAME="+OWNER_NAME+"&TAXTATION_AT="+TAXTATION_AT+"&SECTION="+SECTION+"&MODE=EXCEL";
		    }

            function rojum_change_job(){
                var f = document.jumyongForm;
                var select_item = document.getElementsByName("SELECT_ITEM");
                var item_check = document.getElementsByName("ITEM_CHECK");

                var name = document.getElementsByName("NAME");
                var owner_ssn = document.getElementsByName("OWNER_SSN");
                var count = 0;
                var hitFlag;

                for(var i = 0 ; i < select_item.length ; i++){
                    item_check[i].value = select_item[i].checked;
                    if(select_item[i].checked == true){
                        count++;
                        hitFlag = i;
                    }
                }

                if(count == 1){
                    f.CHANGE_OWNER_NAME.value = name[hitFlag].value;
                    f.CHANGE_OWNER_SSN.value = addSSNDash(owner_ssn[hitFlag].value);
                    Message_Display('Dlg_ChangeJob','Dlg_ChangeJobMain',1);
                }else if(count == 0){
                    f.CHANGE_OWNER_NAME.value = "";
                    f.CHANGE_OWNER_SSN.value = "";
                    Message_Display('Dlg_ChangeJob','Dlg_ChangeJobMain',1);
                }else{
                    alert("전업지원은 일괄선택이 안됩니다. 한건만 선택해 주세요.");

                }

            }

            function rojum_accuse(){

                var f = document.jumyongForm;
                var select_item = document.getElementsByName("SELECT_ITEM");
                var item_check = document.getElementsByName("ITEM_CHECK");

                var name = document.getElementsByName("NAME");
                var owner_ssn = document.getElementsByName("OWNER_SSN");
                var count = 0;
                var hitFlag;

                for(var i = 0 ; i < select_item.length ; i++){
                    item_check[i].value = select_item[i].checked;
                    if(select_item[i].checked == true){
                        count++;
                        hitFlag = i;
                    }
                }

                if(count == 1){
                    f.ACCUSE_OWNER_NAME.value = name[hitFlag].value;
                    f.ACCUSE_OWNER_SSN.value = addSSNDash(owner_ssn[hitFlag].value);
                    Message_Display('Dlg_Accuse','Dlg_AccuseMain',1);
                }else if(count == 0){
                    f.ACCUSE_OWNER_NAME.value = "";
                    f.ACCUSE_OWNER_SSN.value = "";
                    Message_Display('Dlg_Accuse','Dlg_AccuseMain',1);
                }else{
                    alert("고발등록은 일괄선택이 안됩니다. 한건만 선택해 주세요.");

                }
            }

            function file_down(){

                Message_Display('filedown','FILEDOWNValue',1);

                document.getElementById("FildDownIco").onclick = function(){
                    alert("잠시만 기다리세요.");
                };
					
                document.jumyongForm.action = "/mdb/execute_download.do";
                document.jumyongForm.target = "ifrm";
                document.jumyongForm.submit();
				  
            }

            function owner_list(owner_name,mode,target_name,target_ssn)
            {
                if(owner_name == ''){
                    alert('검색해야할 운영자명을 입력하세요');
                    return;
                }
                var winH = 340;
                var winW = 480;
                var top = parseInt(screen.height-winH)/2;
                var left = parseInt(screen.width-winW)/2;
                var status ="toolbar=no, location=no, directories=no, status=no, menubar=no, resizable=no, scrollbars=no, width="+winW+", height="+winH+", left="+left+", top="+top;
                window.open('/rojum/jumyong/owner_list.do?OWNER_NAME='+owner_name+'&mode='+mode+'&target_name='+target_name+'&target_ssn='+target_ssn, 'win', status);
            }

            function file_upload(){
				
                document.uploadForm.action = "/mdb/executeUpload.do";
           
                document.uploadForm.submit();
 				  
             }
			
        </script>
    </head>

    <body onload="javascript:InitPage();">

		<form name="uploadForm" action="/mdb/executeUpload.do" method="post" enctype="multipart/form-data">
		<div id="fileupload" style="position: absolute; visibility: hidden;">
		<table id="FILEUPValue" width="300px" height="150px" border="3" bordercolor="#c9afed" style="border-collapse: collapse; background-color: white;" cellpadding="0" cellspacing="0" class="sub_table">
			<tr>
				<td align="center">
				<table width="290px" height="120px" border="0" style="border-collapse: collapse; background-color: white;" cellpadding="0" cellspacing="0" class="sub_table">
					<tr>
						<td align="center"><font color="red">현장조사시스템 MDB파일 업로드</font></td>
					</tr>
					<tr>
						<td><input type="file" name="mdbFile" size="15" class="input_form1"></td>
					</tr>
					<tr>
						<td align="center"><img src="/img/save_icon2.gif" alt="등록" border="0" onclick="javascript:file_upload();" style="cursor: pointer"> 
							<img src="/img/can_icon.gif" alt="취소" border="0" onclick="Message_Display('fileupload','FILEUPValue',0);" style="cursor: pointer">
						</td>
					</tr>
				</table>
				</td>
			</tr>
		
		
		</table>
		</div>
		</form>

		<form id="jumyongForm" name="jumyongForm" method="post">

            <div id="filedown" style="position:absolute;visibility:hidden;">
                <img src="/img/wait.gif" id="FILEDOWNValue">
            </div>
            <div id="Dlg_Return" style="position:absolute;visibility:hidden;">
                <table id="Dlg_ReturnMain" width="300px" height="150px" border="3" bordercolor="#c9afed" style="border-collapse:collapse;background-color:white;" cellpadding="0" cellspacing="0" class="sub_table">
                    <tr>
                        <td align="center">
                            <table width="290px" height="140px" border="0" style="border-collapse:collapse;background-color:white;" cellpadding="0" cellspacing="0" class="sub_table">
                                <tr>
                                    <td height="5px">
                                    </td>
                                </tr>
                                <tr>
                                    <td align="center">
                                        <textarea rows="2" cols="1" name="ReturnMsg" id ="ReturnMsg" class="input_form1" style="width:280px;overflow:hidden;text-align:center;border:0px;color:red;" readonly></textarea>
                                    </td>
                                </tr>
                                <tr>
                                    <td align="center">
										반환일자
                                        <input name="ReturnDate" id ="ReturnDate" value="${thisDate}" type="text" class="input_form1" style="width:80px" readonly>
                                        <img src="/img/calendar_icon.gif" style="cursor:pointer" onclick="popUpCalendar(this, document.getElementById('ReturnDate'),'yyyymmdd');">
                                    </td>
                                </tr>
                                <tr>
                                    <td align="center" >
                                        <img src="/img/return_icon.gif" alt="반환" width="56" height="18" border="0" onClick="document.jumyongForm.action = '/rojum/jumyong/returnProduct.do';document.jumyongForm.submit();"  style="cursor:pointer">
                                        <img src="/img/can_icon.gif" alt="취소" border="0" onclick="Message_Display('Dlg_Return','Dlg_ReturnMain',0);" style="cursor:pointer" >
                                    </td>
                                </tr>
                            </table>
                        </td>
                    </tr>
                </table>
            </div>


            <div id="Dlg_Accuse" style="position:absolute;visibility:hidden;">
                <table id="Dlg_AccuseMain" width="300px" height="150px" border="3" bordercolor="#c9afed" style="border-collapse:collapse;background-color:white;" cellpadding="0" cellspacing="0" class="sub_table">
                    <tr>
                        <td align="center">
                            <table width="290px" height="140px" border="0" style="border-collapse:collapse;background-color:white;" cellpadding="0" cellspacing="0" class="sub_table">
                                <tr>
                                    <td height="5px">
                                    </td>
                                </tr>
                                <tr>
                                    <td align="center" colspan="2">
                                        <font color="red">고발등록 대상자를 검색해 주세요</font>
                                    </td>
                                </tr>
                                <tr>
                                    <td align="center"  width="100px">
										운영자명
                                    </td>
                                    <td  width="190x" align="left">
                                        <input name="ACCUSE_OWNER_NAME" id ="ACCUSE_OWNER_NAME" value="" type="text" class="input_form1" style="width:80px">
                                        <img src="/img/search_icon.gif" style="cursor:pointer" onclick="owner_list(document.jumyongForm.ACCUSE_OWNER_NAME.value,'short','ACCUSE_OWNER_NAME','ACCUSE_OWNER_SSN');">
                                    </td>
                                </tr>
                                <tr>
                                    <td align="center">
										주민번호
                                    </td>
                                    <td align="left">
                                        <input name="ACCUSE_OWNER_SSN" id ="ACCUSE_OWNER_SSN" value="" type="text" class="input_form1" style="width:130px" readonly="readonly">
                                    </td>
                                </tr>

                                <tr>
                                    <td align="center">
										고발일자
                                    </td>
                                    <td  align="left">
                                        <input name="AccuseDate" id ="ReturnDate" value="${thisDate}" type="text" class="input_form1" style="width:80px" readonly>
                                        <img src="/img/calendar_icon.gif" style="cursor:pointer" onclick="popUpCalendar(this, document.getElementById('AccuseDate'), 'yyyymmdd');">
                                    </td>
                                </tr>
                                <tr>
                                    <td align="center" colspan="2">
                                        <img src="/img/register_icon2.gif" alt="등록" width="56" height="18" border="0" onClick="document.jumyongForm.action = '/rojum/jumyong/owner_accuse.do';document.jumyongForm.submit();"  style="cursor:pointer">
                                        <img src="/img/can_icon.gif" alt="취소" border="0" onclick="Message_Display('Dlg_Accuse','Dlg_AccuseMain',0);" style="cursor:pointer" >
                                    </td>
                                </tr>
                            </table>
                        </td>
                    </tr>
                </table>
            </div>

            <div id="Dlg_ChangeJob" style="position:absolute;visibility:hidden;">
                <table id="Dlg_ChangeJobMain" width="300px" height="190px" border="3" bordercolor="#c9afed" style="border-collapse:collapse;background-color:white;" cellpadding="0" cellspacing="0" class="sub_table">
                    <tr>
                        <td align="center">
                            <table width="100%" height="100%" border="0" style="border-collapse:collapse;background-color:white;" cellpadding="0" cellspacing="0" class="sub_table">
                                <tr>
                                    <td height="5px">
                                    </td>
                                </tr>
                                <tr height="26px">
                                    <td align="center" colspan="2">
                                        <font color="red">전업지원 대상자를 검색해 주세요</font>
                                    </td>
                                </tr>
                                <tr height="26px">
                                    <td align="center"  width="100px">
										운영자명
                                    </td>
                                    <td  width="190x" align="left">
                                        <input name="CHANGE_OWNER_NAME" id ="CHANGE_OWNER_NAME" value="" type="text" class="input_form1" style="width:80px">
                                        <img src="/img/search_icon.gif" style="cursor:pointer" onclick="owner_list(document.jumyongForm.CHANGE_OWNER_NAME.value,'short','CHANGE_OWNER_NAME','CHANGE_OWNER_SSN');">
                                    </td>
                                </tr>
                                <tr height="26px">
                                    <td align="center">
										주민번호
                                    </td>
                                    <td align="left">
                                        <input name="CHANGE_OWNER_SSN" id ="CHANGE_OWNER_SSN" value="" type="text" class="input_form1" style="width:130px" readonly="readonly">
                                    </td>
                                </tr>

                                <tr height="26px">
                                    <td align="center">
										전업지원일자
                                    </td>
                                    <td  align="left">
                                        <input name="ChangeJobDate" id ="ChangeJobDate" value="${thisDate}" type="text" class="input_form1" style="width:80px" readonly>
                                        <img src="/img/calendar_icon.gif" style="cursor:pointer" onclick="popUpCalendar(this, document.getElementById('ChangeJobDate'), 'yyyymmdd');">
                                    </td>
                                </tr>
                                <tr height="26px">
                                    <td align="center">
										전업지원방식
                                    </td>
                                    <td  align="left">
                                        <select name="CHANGE_JOB_TYPE" class="essential" style="width: 130px">
                                            <option value="0">취업알선 기관등록</option>
                                            <option value="1">취업교육 기관등록</option>
                                            <option value="2">사업자금 융자지원</option>
                                            <option value="3">생계지원</option>
                                        </select>
                                    </td>
                                </tr>
                                <tr height="26px">
                                    <td align="center" colspan="2">
                                        <img src="/img/register_icon2.gif" alt="등록" width="56" height="18" border="0" onClick="document.jumyongForm.action = '/rojum/jumyong/owner_change_job.do';document.jumyongForm.submit();"  style="cursor:pointer">
                                        <img src="/img/can_icon.gif" alt="취소" border="0" onclick="Message_Display('Dlg_ChangeJob','Dlg_ChangeJobMain',0);" style="cursor:pointer" >
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
                                                                <tr>
                                                                    <td height="26px" width="100px"  align="center" bgcolor="e5eff8" class="sub_table_b">시군구</td>
                                                                    <td width="35%" bgcolor="eaeaea" class="table_bl_left" align="left" >
                                                                        <select id="GU_CD" name="GU_CD" class="input_form1" style="width: 130px">
                                                                            ${gu_code}
                                                                        </select>
                                                                    </td>
                                                                    <td width="100px"  align="center" bgcolor="e5eff8" class="sub_table_b">법정동</td>
                                                                    <td bgcolor="eaeaea" class="table_bl_left" align="left">
                                                                        <select id="BJ_CD" name="BJ_CD" class="input_form1" style="width: 130px">
                                                                            ${bjdong_code}
                                                                        </select>
                                                                    </td>
                                                                </tr>		
                                                                <tr>
                                                                    <td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">번 지</td>
                                                                    <td bgcolor="eaeaea" class="table_bl_left" align="left" width="36%">
                                                                        <input id="BONBUN" name="BONBUN" type="text" class="input_form1" value="${bonbun}" style="width: 40px">
																		- <input id="BUBUN" name="BUBUN" type="text" class="input_form1" value="${bubun}" style="width: 40px">
                                                                    </td>											
                                                                    
                                                                    
                                                                    <td align="center" bgcolor="e5eff8" class="sub_table_b">운영자명</td>
                                                                    <td bgcolor="eaeaea" class="table_bl_left" align="left">
                                                                        <table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                                                                            <tr>
                                                                                <td>
                                                                                    <input name="OWNER_NAME" id="OWNER_NAME" type="text" class="input_form1" style="width: 130px" onKeyDown="javascript:checkKeySearch();" value="${owner_name}">
                                                                                </td>
                                                                            </tr>
                                                                        </table>
                                                                    </td>
                                                                </tr>
                                                                <tr>
                                                                	<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">관리번호</td>
                                                                    <td bgcolor="eaeaea" class="table_bl_left" align="left">
                                                                        <input id="GAPAN_NO" type="text" class="input_form1" style="width: 130px" onKeyDown="javascript:checkKeySearch();" value="${gapan_no}">
                                                                    </td>											
																	<td align="center" bgcolor="e5eff8" class="sub_table_b" height="26">점용료부과</td>
                                                                    <td bgcolor="eaeaea" class="table_bl_left" align="left">
                                                                        <select name="taxtation_at" id="taxtation_at" class="input_form1" style="width:130px">
                                                                            ${taxtation_at}
                                                                        </select>											
                                                                    </td>
                                                                </tr>
                                                                <tr>
                                                                	<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">폐쇄목록</td>
																	<td bgcolor="eaeaea" class="table_bl_left" colspan="3" align="left">
																		<select name="View_Disuse" class="input_form1" style="width:100px">
																			<option value="1">감춤</option>
																			<option value="4">보기</option>
																		</select>
																	</td>
                                                                
                                                                </tr>
                                                            </table>


                                                        </td>
                                                    </tr>

                                                    <tr>
                                                        <td height="40" align="right">
                                                            <img src="/img/inquiry_icon2.gif" alt="조회" width="56" height="18" border="0" onclick="javascript:goSearch();" style="cursor: pointer">
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td height="1" bgcolor="#EAEAEA"></td>
                                                    </tr>

                                                    <tr>
                                                        <td height="34" class="sub_stan" align="left">전체건수 : <span class="sub_stan_blue">${listCount}</span>건
                                                        </td>

                                                    </tr>
                                                    <tr>
                                                        <td>
                                                            <table width="780px" cellpadding="0" cellspacing="0" border="0" class="sub_table" bordercolor="#c9dfed" style="border-collapse: collapse;">
                                                                <TR>
                                                                    <TD width="26px" valign="top">
                                                                        <TABLE cellpadding="0" cellspacing="0" border="1" class="sub_table" bordercolor="#c9dfed" style="border-collapse:collapse;">
                                                                            <TR height="26px">
                                                                                <td width="35px" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">
                                                                                    <INPUT TYPE="checkbox" ID="SELECT_ALL" onclick="javascript:selectAll(this);">
                                                                                </td>
                                                                            </TR>
                                                                        </TABLE>
                                                                    </TD>
                                                                    <TD width="754px" valign="top"  align="left">
                                                                        <DIV id="topLine2" style="width:737px;overflow:hidden;">
                                                                            <TABLE width="820px" cellpadding="0" cellspacing="0" border="1" class="sub_table" bordercolor="#c9dfed" style="border-collapse:collapse;">
                                                                                <tr height="26px">																								
                                                                                    <td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">관리번호</td>
                                                                                    <td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">운영인</td>
                                                                                    <td width="140px" align="center" bgcolor="e5eff8" class="sub_table_b">점용지</td>
                                                                                    <td width="80px" align="center" bgcolor="e5eff8" class="sub_table_b">면적(㎡)</td>
                                                                                    <td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">정비/관리</td>														
                                                                                    <td width="120px" align="center" bgcolor="e5eff8" class="sub_table_b">점용료</td>
                                                                                    <td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">수거일</td>
                                                                                    <td width="80px" align="center" bgcolor="e5eff8" class="sub_table_b">보관일</td>
                                                                                </tr>
                                                                            </TABLE>
                                                                        </DIV>
                                                                    </TD>
                                                                </TR>
                                                                <tr>

                                                                    <TD width="26px" valign="top">
                                                                        <DIV id="leftDisplay2" style="width:26px;height:303px;overflow:hidden;">
                                                                            <TABLE cellpadding="0" cellspacing="0" border="1" class="sub_table" bordercolor="#c9dfed" style="border-collapse:collapse;">
                                                                                <c:forEach items="${blist}" var="board" varStatus="idx">
                                                                                    <tr height="26px" onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''"	style="cursor: pointer">
                                                                                        <td width="35px" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">
                                                                                            <INPUT TYPE="checkbox" NAME="SELECT_ITEM">
                                                                                            <INPUT TYPE="hidden" NAME="GAPAN_NO" value="${board.GAPAN_NO}"> 
                                                                                            <INPUT TYPE="hidden" NAME="ITEM_CHECK" value="">
                                                                                            <INPUT TYPE="hidden" NAME="OWNER_SSN" value="${board.OWNER_SSN}">
                                                                                            <INPUT TYPE="hidden" NAME="NAME" value="${board.OWNER_NAME}">
                                                                                        </td>
                                                                                    </tr>
                                                                                </c:forEach>
                                                                            </TABLE>
                                                                        </DIV>
                                                                    </TD>
                                                                    <TD width="754px" valign="top">

                                                                        <DIV id="mainDisplay2" style="width:754px;height:320px; overflow: scroll; scrollbar-face-color: #EEF8FB; scrollbar-3dlight-color: #BBBDB6; scrollbar-highlight-color: #EEF8FB; scrollbar-shadow-color: #BBBDB6; scrollbar-darkshadow-color: #EEF8FB; scrollbar-track-color: #EEF8FB; scrollbar-arrow-color: #BBBDB6;" onScroll="scrollAll()">
                                                                            <TABLE cellpadding="0" width="820px" cellspacing="0" border="1" class="sub_table" bordercolor="#c9dfed" style="border-collapse: collapse;">
                                                                                <c:forEach items="${blist}" var="board" varStatus="idx">
                                                                                    <tr height="26px" onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" style="cursor: pointer" onclick="rojum_History('${idx.count-1}');">
                                                                                        <td width="100px" align="center">${board.GAPAN_NO} 
                                                                                            <input name="GAPAN_NO_ARR" type="hidden" value="${board.GAPAN_NO}">
                                                                                        </td>
                                                                                        <td width="100px" align="center">${board.OWNER_NAME}</td>
                                                                                        <td width="140px" align="center">${board.ADDR}</td>
                                                                                        <td width="80px" align="center">${board.PLACE_A}</td>
                                                                                        <td width="100px" align="center">
                                                                                    <c:choose>
                                                                                        <c:when test="${board.MAINTN_OB == '1'}">
																							관리대상
                                                                                        </c:when>
                                                                                        <c:otherwise>
																							정비대상
                                                                                        </c:otherwise>
                                                                                    </c:choose>
                                                                                    </td>
                                                                                    <td width="120px" align="center">
                                                                                    <c:choose>
                                                                                        <c:when test="${board.TAXTATION_AT == '1'}">
																							부과
                                                                                        </c:when>
                                                                                        <c:otherwise>
																							미부과
                                                                                        </c:otherwise>
                                                                                    </c:choose>
                                                                                    </td>
                                                                                    <td width="100px" align="center">${rnic:addDash(board.PICKUP_DATE)}</td>
                                                                                    <td width="80px" align="center">${board.PASS_DAY}</td>
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
                                                        <td height="40px" align="right">
                                                            <img src="/img/rojum_change_job.gif" alt="전업지원" border="0" onclick="javascript:rojum_change_job();" style="cursor:pointer;">
                                                            <img src="/img/rojum_accuse.gif" alt="고발등록" border="0" onclick="javascript:rojum_accuse();" style="cursor:pointer;">
                                                            <img src="/img/excel_icon.gif" alt="EXCEL 변환" border="0" onclick="javascript:excel_Search();" style="cursor:pointer;">
                                                            

                                                        </td>
                                                    </tr>
                                                    <tr>
	                                                    <td align="right">
	                                                    	<img id="FildDownIco" src="/img/data_down.gif" alt="현장조사파일다운" border="0" onclick="javascript:file_down();" style="cursor:pointer;">
															<img id="FildDownIco" src="/img/data_upload.gif" alt="현장조사파일업로드" border="0" onclick="Message_Display('fileupload','FILEUPValue',1);" style="cursor:pointer;">
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
</html>
