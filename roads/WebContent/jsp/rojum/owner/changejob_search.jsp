<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="/jsp/common/loginCheck.jsp" %>
<%@ include file="/jsp/common/include.jsp" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />
        <title>::::: 서울시 도로점용관리시스템 :::::</title>
        <style type="text/css">
            <!--
            body {
                margin: 0px;
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
                var gu_cd = document.getElementById("GU_LIST").value;
                var owner_name = document.getElementById("NAME").value;
                var toDate = document.getElementById("TODATE").value;
                var fromDate = document.getElementById("FROMDATE").value;
		
                location.href="/rojum/owner/changejob_search.do?gu_cd="+gu_cd+"&owner_name="+owner_name+"&toDate="+toDate+"&fromDate="+fromDate;
            }
			
            function InitPage()
            {		
        		if('${MSG}'.length > 0){
                    alert('${MSG}');
                }
            }
			
            function checkKeySearch(){
                if(event.keyCode == "13")
                    goSearch();
            }
            
            var checkNum;
            
            function checkItem(obj){
            	var selectItems = document.getElementsByName("SELECT_ITEM");
            	
            	for(var i = 0 ; i < selectItems.length ; i++){
            		if(selectItems[i] == obj){
            			if(selectItems[i].checked){
            				checkNum = i;	
            			}else{
            				checkNum = null;
            			}
            		}else{
            			selectItems[i].checked = false;
            		}
            	}
            	
            }
            
            
            function fn_new(){
            	
            	document.getElementById("CHANGE_JOB_DATE").value = '';
            	document.getElementById("OWNER_NAME").value = '';
            	document.getElementById("OWNER_SSN1").value = '';
            	document.getElementById("OWNER_SSN2").value = '';
            	setSelectedOption(document.getElementById("CHANGE_JOB_SECTION"),'');
            	setSelectedOption(document.getElementById("CHANGE_JOB_TYPE"),'');
            	MessageDisplay('DlgChangejobEdit','ChangejobEdit',1);
            	document.getElementById("CHANGE_JOB_SAVE").onclick = function(){
            		if(document.getElementById("CHANGE_JOB_DATE").value == ''){
            			alert("등록일자를 선택해주세요");
            			return;
            		}
            		if(document.getElementById("OWNER_NAME").value == ''){
            			alert("운영인 이름을 입력해주세요");
            			return;
            		}
            		if(document.getElementById("OWNER_SSN1").value.length < 6){
            			alert("주민번호를 입력해주세요");
            			return;
            		}
            		if(document.getElementById("OWNER_SSN2").value.length < 7){
            			alert("주민번호를 입력해주세요");
            			return;
            		}
            		if(getSelectedValue(document.getElementById("CHANGE_JOB_SECTION")) == ''){
            			alert("구분을 선택 해주세요");
            			return;
            		}
            		if(getSelectedValue(document.getElementById("CHANGE_JOB_TYPE")) == ''){
            			alert("내용을 선택 해주세요");
            			return;
            		}
            		
            		var form = document.insertForm;
            		form.action = "/rojum/owner/new_changejob.do";
            		form.submit();
            	};
            }
            
            function fn_modify(){
            	if(checkNum != null){
            		
            		var tbl = document.getElementById("DATA_TABLE");
            		
            		document.getElementById("SEQ").value = document.getElementsByName("SEQ_ARR")[checkNum].value;
                	document.getElementById("CHANGE_JOB_DATE").value = tbl.rows[checkNum+1].cells[5].outerText;
                	document.getElementById("OWNER_NAME").value = tbl.rows[checkNum+1].cells[1].outerText;
                	var ssn = document.getElementsByName("OWNER_SSN_ARR")[checkNum].value;
                	document.getElementById("OWNER_SSN1").value = ssn.substring(0,6);
                	document.getElementById("OWNER_SSN2").value = ssn.substring(6,13);
                	setSelectedOption(document.getElementById("CHANGE_JOB_SECTION"),document.getElementsByName("CHANGE_JOB_SECTION_ARR")[checkNum].value);
                	setSelectedOption(document.getElementById("CHANGE_JOB_TYPE"),document.getElementsByName("CHANGE_JOB_TYPE_ARR")[checkNum].value);
            		
                	MessageDisplay('DlgChangejobEdit','ChangejobEdit',1);
                	
                	
                	document.getElementById("CHANGE_JOB_SAVE").onclick = function(){
                		if(document.getElementById("CHANGE_JOB_DATE").value == ''){
                			alert("등록일자를 선택해주세요");
                			return;
                		}
                		if(document.getElementById("OWNER_NAME").value == ''){
                			alert("운영인 이름을 입력해주세요");
                			return;
                		}
                		if(document.getElementById("OWNER_SSN1").value.length < 6){
                			alert("주민번호를 입력해주세요");
                			return;
                		}
                		if(document.getElementById("OWNER_SSN2").value.length < 7){
                			alert("주민번호를 입력해주세요");
                			return;
                		}
                		if(getSelectedValue(document.getElementById("CHANGE_JOB_SECTION")) == ''){
                			alert("구분을 선택 해주세요");
                			return;
                		}
                		if(getSelectedValue(document.getElementById("CHANGE_JOB_TYPE")) == ''){
                			alert("내용을 선택 해주세요");
                			return;
                		}
                		
                		var form = document.insertForm;
                		form.action = "/rojum/owner/modify_changejob.do";
                		form.submit();
                	};
                	
                	
            	}else{
            		alert('수정하시고자 하는 내역을 선택해 주세요.');
            		return;
            	}
            }
            
            function fn_del(){
            	if(checkNum != null){
            		
            		document.getElementById("SEQ").value = document.getElementsByName("SEQ_ARR")[checkNum].value;
            		
            		var form = document.insertForm;
            		form.action = "/rojum/owner/del_changejob.do";
            		form.submit();
            	}else{
            		alert('삭제하시고자 하는 내역을 선택해 주세요.');
            		return;
            	}
            }
        </script>
    </head>

    <body onload="javascript:InitPage();">
		<form id="insertForm" name="insertForm" method="post">
			<input id="SEQ" name="SEQ" type="hidden" >
			<div id="DlgChangejobEdit" style="position:absolute; display:none;">
                <table id="ChangejobEdit" width="670px" height="140px" border="2" bordercolor="#A0A0FF" style="border-collapse:collapse;background-color:white;" cellpadding="0" cellspacing="0" class="sub_table">
                    <tr>
                        <td align="center">
                            <table width="660px" height="130px" border="0" style="border-collapse:collapse;background-color:white;" cellpadding="0" cellspacing="0" class="sub_table">
                                <tr>
                                    <td height="32px">
                                    	<span style="font-weight: bold;color: #6060FF"> 전업지원 등록/수정</span>
                                    </td>
                                </tr>
                                <tr>
                                    <td align="center"  width="100%">
										<table width="660px" cellpadding="0" cellspacing="0" border="1" class="sub_table" bordercolor="#c9dfed" style="border-collapse: collapse;">
										    <tr height="26px">
										        <td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">등록일자</td>
										        <td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">운영자</td>
										        <td width="150px" align="center" bgcolor="e5eff8" class="sub_table_b">주민번호</td>
										        <td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">구분</td>
										        <td width="200px" align="center" bgcolor="e5eff8" class="sub_table_b">내용</td>
										    </tr>
										    <tr height="26px" onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" style="cursor: pointer">
										        <td width="100px" align="center">
										        	<input name="CHANGE_JOB_DATE" id="CHANGE_JOB_DATE" value="" type="text" class="input_form1" style="width:60px">
													<img src="/img/calendar_icon.gif" style="cursor:pointer;vertical-align: middle;" onclick="popUpCalendar(this, document.getElementById('CHANGE_JOB_DATE'), 'yyyymmdd');">
										        </td>
										        <td width="100px" align="center">
										        	<input name="OWNER_NAME" id="OWNER_NAME" value="" type="text" class="input_form1" style="width:80px;" maxlength="40">
										        </td>
										        <td width="150px" align="center">
										        	<input name="OWNER_SSN1" id="OWNER_SSN1" value="" type="text" class="input_form1" style="width:60px;" onKeyDown="onlyNumberInput();" maxlength="6">-<input name="OWNER_SSN2" id="OWNER_SSN2" value="" type="text" class="input_form1" style="width:60px;" onKeyDown="onlyNumberInput();" maxlength="7">
										        </td>
										        <td width="100px" align="center">
										        	<select id="CHANGE_JOB_SECTION" name="CHANGE_JOB_SECTION" class="input_form1" style="width:80px">
	                                                	${cj_sec}
	                                            	</select>
										        </td>
										        <td width="200px" align="center">
										        	<select id="CHANGE_JOB_TYPE" name="CHANGE_JOB_TYPE" class="input_form1" style="width: 180px">
	                                                	${cj_typ}
	                                            	</select>
										        </td>
										    </tr>
										</table>
									<td>
                                </tr>
                                 <tr>
                                    <td align="center" colspan="2">
                                        <img src="/img/save_icon2.gif" id="CHANGE_JOB_SAVE" alt="저장" width="56" height="18" border="0" onClick=""  style="cursor:pointer">
                                        <img src="/img/can_icon.gif" alt="취소" border="0" onclick="MessageDisplay('DlgChangejobEdit','ChangejobEdit',0);" style="cursor:pointer" >
                                    </td>
                                </tr>
                            </table>
                        </td>
                    </tr>
                </table>
            </div>
			
            <table width="780px" border="0" cellpadding="0" cellspacing="0">
                <tr>
                   <td class="contborder_purple">
                       <table width="100%" border="0" cellspacing="0" cellpadding="0">
                           <tr>
                               <td>
                                   <table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse: collapse;" cellpadding="0" cellspacing="0" class="sub_table">
                                       <tr>
                                           <td width="15%"  height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">시군구</td>
                                           <td colspan="3" bgcolor="eaeaea" class="table_bl_left" align="left" >
                                               <select id="GU_LIST" name="GU_LIST" class="input_form1" style="width: 130px">
                                                   ${gu_list}
                                               </select>
                                           </td>
                                       </tr>
                                       <tr>
                                           <td width="15%"  height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">운영자명</td>
                                           <td width="35%" bgcolor="eaeaea" class="table_bl_left" align="left" >
                                                  <input name="NAME" id="NAME" value="${owner_name}" type="text" class="input_form1" style="width:130px">
                                           </td>
                                           <td width="15%" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">등록기간</td>
                                           <td width="35%" bgcolor="eaeaea" class="table_bl_left" align="left">
												<input name="FROMDATE" id="FROMDATE" value="${rnic:addDash(fromDate)}" type="text" class="input_form1" style="width:80px" readonly>
												<img src="/img/calendar_icon.gif" style="cursor:pointer;vertical-align: middle;" onclick="popUpCalendar(this, document.getElementById('FROMDATE'), 'yyyymmdd');">
												&nbsp;~&nbsp;
												<input name="TODATE" id ="TODATE" value="${rnic:addDash(toDate)}" type="text" class="input_form1" style="width:80px" readonly>
												<img src="/img/calendar_icon.gif" style="cursor:pointer;vertical-align: middle;" onclick="popUpCalendar(this, document.getElementById('TODATE'), 'yyyymmdd');">
                                           </td>											
                                       </tr>	
                                       <tr>
                                   </table>
                               </td>
                           </tr>
                           <tr>
                               <td height="40px" align="right">
                                   <img src="/img/inquiry_icon2.gif" alt="조회" width="56" height="18" border="0" onclick="javascript:goSearch();" style="cursor: pointer">
                               </td>
                           </tr>
                           <tr>
                               <td height="1px" bgcolor="#EAEAEA"></td>
                           </tr>

                           <tr>
                               <td height="34px" class="sub_stan">
                               <table width="100%">
                               <tr>
                               <td width="50%" align="left">
                               	전체건수 : <span class="sub_stan_blue">${listCount}</span>건
                               </td>
                               <td width="50%" align="right">
                               	<img src="/img/new_icon3.gif" alt="신규" border="0" onclick="javascript:fn_new();" style="cursor:pointer;">
                               	<img src="/img/mod_icon2.gif" alt="수정" border="0" onclick="javascript:fn_modify();" style="cursor:pointer;">
                               	<img src="/img/del_icon.gif" alt="삭제" border="0" onclick="javascript:fn_del();" style="cursor:pointer;">
                               </td>
                               </tr>
                               </table>
                               </td>

                           </tr>
                           <tr>
                               <td>
                                   <table id="DATA_TABLE" width="780px" cellpadding="0" cellspacing="0" border="1" class="sub_table" bordercolor="#c9dfed" style="border-collapse: collapse;">
                                       <tr height="26px">
                                           <td width="30px" align="center" bgcolor="e5eff8" class="sub_table_b">선택</td>																								
                                           <td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">이름</td>
                                           <td width="150px" align="center" bgcolor="e5eff8" class="sub_table_b">주민번호</td>
                                           <td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">구분</td>
                                           <td align="center" bgcolor="e5eff8" class="sub_table_b">내용</td>
                                           <td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">등록일자</td>
                                       </tr>
										<c:forEach items="${blist}" var="board" varStatus="idx">
                                       <tr height="26px" onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" style="cursor: pointer">
                                       	<td width="30px" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">
                                               <INPUT TYPE="checkbox" NAME="SELECT_ITEM" onclick="checkItem(this);">
                                           	<input name="SEQ_ARR" value="${board.SEQ}" type="hidden">
                                           	<input name="OWNER_SSN_ARR" value="${board.OWNER_SSN}" type="hidden">
                                           	<input name="CHANGE_JOB_SECTION_ARR" value="${board.CHANGE_JOB_SECTION}" type="hidden">
                                           	<input name="CHANGE_JOB_TYPE_ARR" value="${board.CHANGE_JOB_TYPE}" type="hidden">
                                           </td>
                                           <td width="100px" align="center">${rnic:addDash(board.OWNER_NAME)}</td>
                                           <td width="150px" align="center">${fn:substring(board.OWNER_SSN,0,6)}-*******</td>
                                           <td width="100px" align="center">${board.CHANGE_JOB_SECTION_NM}</td>
                                           <td align="center">${board.CHANGE_JOB_TYPE_NM}</td>
                                           <td width="100px" align="center">${rnic:addDash(board.CHANGE_JOB_DATE)}</td>
                                       </tr>
                                       </c:forEach>
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
                       </table>
                   </td>
                </tr>
            </table>
        </form>
        <iframe id="ifrm" name="ifrm" width="70%" height="0px"></iframe>
    </body>
</html>
