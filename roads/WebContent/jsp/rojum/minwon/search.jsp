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
                var GU_CODE = document.getElementById("GU_LIST").value;
                var FROMDATE = removeDash(document.getElementById("FROMDATE").value);
                var TODATE = removeDash(document.getElementById("TODATE").value);
		
                location.href="/rojum/minwon/search.do?GU_CODE="+GU_CODE+"&FROMDATE="+FROMDATE+"&TODATE="+TODATE;
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

            function excel_Search()
            {
            	 var GU_CODE = document.getElementById("GU_LIST").value;
                 var FROMDATE = removeDash(document.getElementById("FROMDATE").value);
                 var TODATE = removeDash(document.getElementById("TODATE").value);
 		
                 location.href="/rojum/minwon/search.do?GU_CODE="+GU_CODE+"&FROMDATE="+FROMDATE+"&TODATE="+TODATE+"&EXCEL=Y";
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
            	
            	document.getElementById("DATE_BTN").style.visibility = "visible";
            	
            	document.getElementById("REGIST_DATE").value = '';
            	document.getElementById("COL1").value = '';
            	document.getElementById("COL2").value = '';
            	document.getElementById("COL3").value = '';
            	document.getElementById("COL4").value = '';
            	document.getElementById("COL5").value = '';
            	document.getElementById("COL6").value = '';
            	document.getElementById("COL7").value = '';
            	document.getElementById("COL8").value = '';
            	MessageDisplay('DlgMinwonEdit','MinWonEdit',1);
            	document.getElementById("MINWON_SAVE").onclick = function(){
            		if(document.getElementById("REGIST_DATE").value == ''){
            			alert("등록일자를 선택해주세요");
            			return;
            		}
            		document.getElementById("FROMDATE").value = removeDash(document.getElementById("FROMDATE").value);
                    document.getElementById("TODATE").value = removeDash(document.getElementById("TODATE").value);
            		document.getElementById("REGIST_DATE").value = removeDash(document.getElementById("REGIST_DATE").value);
            		
            		var form = document.searchForm;
            		form.action = "/rojum/minwon/new.do";
            		form.submit();
            	};
            }
            
            function fn_modify(){
            	if(checkNum != null){
            		
            		document.getElementById("DATE_BTN").style.visibility = "hidden";
            		
            		var tbl = document.getElementById("DATA_TABLE");
            		
            		document.getElementById("REGIST_DATE").value = tbl.rows[checkNum+1].cells[1].outerText;
                	document.getElementById("COL1").value  = tbl.rows[checkNum+1].cells[3].outerText;
                	document.getElementById("COL2").value  = tbl.rows[checkNum+1].cells[4].outerText;
                	document.getElementById("COL3").value  = tbl.rows[checkNum+1].cells[5].outerText;
                	document.getElementById("COL4").value  = tbl.rows[checkNum+1].cells[6].outerText;
                	document.getElementById("COL5").value  = tbl.rows[checkNum+1].cells[7].outerText;
                	document.getElementById("COL6").value  = tbl.rows[checkNum+1].cells[8].outerText;
                	document.getElementById("COL7").value  = tbl.rows[checkNum+1].cells[9].outerText;
                	document.getElementById("COL8").value  = tbl.rows[checkNum+1].cells[10].outerText;
                	MessageDisplay('DlgMinwonEdit','MinWonEdit',1);
                	
                	
                	document.getElementById("MINWON_SAVE").onclick = function(){
                		document.getElementById("FROMDATE").value = removeDash(document.getElementById("FROMDATE").value);
                        document.getElementById("TODATE").value = removeDash(document.getElementById("TODATE").value);
                		document.getElementById("REGIST_DATE").value = removeDash(document.getElementById("REGIST_DATE").value);
                		
                		var form = document.searchForm;
                		form.action = "/rojum/minwon/modify.do";
                		form.submit();
                	};
                	
                	
            	}else{
            		alert('수정하시고자 하는 현황을 선택해 주세요.');
            		return;
            	}
            }
            
            function fn_del(){
            	if(checkNum != null){
            		
            		document.getElementById("FROMDATE").value = removeDash(document.getElementById("FROMDATE").value);
                    document.getElementById("TODATE").value = removeDash(document.getElementById("TODATE").value);
            		
                    var tbl = document.getElementById("DATA_TABLE");
                    document.getElementById("REGIST_DATE").value = removeDash(tbl.rows[checkNum+1].cells[1].outerText);
                    
                	var form = document.searchForm;
                	form.action = "/rojum/minwon/del.do";
                	form.submit();
            	}else{
            		alert('삭제하시고자 하는 현황을 선택해 주세요.');
            		return;
            	}
            }
        </script>
    </head>

    <body onload="javascript:InitPage();">
		<form id="searchForm" name="searchForm" method="post">
			<input name="GU_CODE" value="${GU_CODE}" type="hidden" >
			<div id="DlgMinwonEdit" style="position:absolute; display:none;">
                <table id="MinWonEdit" width="670px" height="140px" border="2" bordercolor="#A0A0FF" style="border-collapse:collapse;background-color:white;" cellpadding="0" cellspacing="0" class="sub_table">
                    <tr>
                        <td align="center">
                            <table width="660px" height="130px" border="0" style="border-collapse:collapse;background-color:white;" cellpadding="0" cellspacing="0" class="sub_table">
                                <tr>
                                    <td height="32px">
                                    	<span style="font-weight: bold;color: #6060FF"> 민원현황 등록/수정</span>
                                    </td>
                                </tr>
                                <tr>
                                    <td align="center"  width="100%">
										<table width="660px" cellpadding="0" cellspacing="0" border="1" class="sub_table" bordercolor="#c9dfed" style="border-collapse: collapse;">
										    <tr height="26px">
										        <td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">등록일자</td>
										        <td width="70px" align="center" bgcolor="e5eff8" class="sub_table_b">서신</td>
										        <td width="70px" align="center" bgcolor="e5eff8" class="sub_table_b">인터넷</td>
										        <td width="70px" align="center" bgcolor="e5eff8" class="sub_table_b">120살피미</td>
										        <td width="70px" align="center" bgcolor="e5eff8" class="sub_table_b">해피콜</td>
										        <td width="70px" align="center" bgcolor="e5eff8" class="sub_table_b">전화</td>
										        <td width="70px" align="center" bgcolor="e5eff8" class="sub_table_b">방문</td>
										        <td width="70px" align="center" bgcolor="e5eff8" class="sub_table_b">진정ㆍ건의</td>
										        <td width="70px" align="center" bgcolor="e5eff8" class="sub_table_b">기타</td>
										    </tr>
										    <tr height="26px" onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" style="cursor: pointer">
										        <td width="100px" align="center">
										        	<input name="REGIST_DATE" id="REGIST_DATE" value="" type="text" class="input_form1" style="width:60px" readonly>
													<img src="/img/calendar_icon.gif" id="DATE_BTN" style="cursor:pointer;vertical-align: middle;" onclick="popUpCalendar(this, document.getElementById('REGIST_DATE'), 'yyyymmdd');">
										        </td>
										        <td width="70px" align="center">
										        	<input name="COL1" id="COL1" value="" type="text" class="input_form1" style="width:50px;text-align:right;" onKeyDown="onlyNumberInput();" maxlength="3">건
										        </td>
										        <td width="70px" align="center">
										        	<input name="COL2" id="COL2" value="" type="text" class="input_form1" style="width:50px;text-align:right;" onKeyDown="onlyNumberInput();" maxlength="3">건
										        </td>
										        <td width="70px" align="center">
										        	<input name="COL3" id="COL3" value="" type="text" class="input_form1" style="width:50px;text-align:right;" onKeyDown="onlyNumberInput();" maxlength="3">건
										        </td>
										        <td width="70px" align="center">
										        	<input name="COL4" id="COL4" value="" type="text" class="input_form1" style="width:50px;text-align:right;" onKeyDown="onlyNumberInput();" maxlength="3">건
										        </td>
										        <td width="70px" align="center">
										        	<input name="COL5" id="COL5" value="" type="text" class="input_form1" style="width:50px;text-align:right;" onKeyDown="onlyNumberInput();" maxlength="3">건
										        </td>
										        <td width="70px" align="center">
										        	<input name="COL6" id="COL6" value="" type="text" class="input_form1" style="width:50px;text-align:right;" onKeyDown="onlyNumberInput();" maxlength="3">건
										        </td>
										        <td width="70px" align="center">
										        	<input name="COL7" id="COL7" value="" type="text" class="input_form1" style="width:50px;text-align:rightf;" onKeyDown="onlyNumberInput();" maxlength="3">건
										        </td>
										        <td width="70px" align="center">
										        	<input name="COL8" id="COL8" value="" type="text" class="input_form1" style="width:50px;text-align:rightf;" onKeyDown="onlyNumberInput();" maxlength="3">건
										        </td>
										    </tr>
										</table>
									<td>
                                </tr>
                                 <tr>
                                    <td align="center" colspan="2">
                                        <img src="/img/save_icon2.gif" id="MINWON_SAVE" alt="저장" width="56" height="18" border="0" onClick=""  style="cursor:pointer">
                                        <img src="/img/can_icon.gif" alt="취소" border="0" onclick="MessageDisplay('DlgMinwonEdit','MinWonEdit',0);" style="cursor:pointer" >
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
                        <img src="/img/sub7_cont3_title.gif" width="800px" height="43">
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
                                                                        <select id="GU_LIST" name="GU_LIST" class="input_form1" style="width: 130px">
                                                                            ${GU_LIST}
                                                                        </select>
                                                                    </td>
                                                                    <td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">등록기간</td>
                                                                    <td bgcolor="eaeaea" class="table_bl_left" align="left">
																		<input name="FROMDATE" id="FROMDATE" value="${rnic:addDash(FROMDATE)}" type="text" class="input_form1" style="width:80px" readonly>
																		<img src="/img/calendar_icon.gif" style="cursor:pointer;vertical-align: middle;" onclick="popUpCalendar(this, document.getElementById('FROMDATE'), 'yyyymmdd');">
																		&nbsp;~&nbsp;
																		<input name="TODATE" id ="TODATE" value="${rnic:addDash(TODATE)}" type="text" class="input_form1" style="width:80px" readonly>
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
                                                                    <td width="90px" align="center" bgcolor="e5eff8" class="sub_table_b">등록일자</td>
                                                                    <td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">계</td>
                                                                    <td width="70px" align="center" bgcolor="e5eff8" class="sub_table_b">서신</td>
                                                                    <td width="70px" align="center" bgcolor="e5eff8" class="sub_table_b">인터넷</td>
                                                                    <td width="70px" align="center" bgcolor="e5eff8" class="sub_table_b">120살피미</td>
                                                                    <td width="70px" align="center" bgcolor="e5eff8" class="sub_table_b">해피콜</td>
                                                                    <td width="70px" align="center" bgcolor="e5eff8" class="sub_table_b">전화</td>
                                                                    <td width="70px" align="center" bgcolor="e5eff8" class="sub_table_b">방문</td>
                                                                    <td width="70px" align="center" bgcolor="e5eff8" class="sub_table_b">진정ㆍ건의</td>
                                                                    <td width="70px" align="center" bgcolor="e5eff8" class="sub_table_b">기타</td>
                                                                </tr>
																<c:forEach items="${blist}" var="board" varStatus="idx">
                                                                <tr height="26px" onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" style="cursor: pointer">
                                                                	 <td width="30px" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">
                                                                          <INPUT TYPE="checkbox" NAME="SELECT_ITEM" onclick="checkItem(this);">
                                                                    </td>
                                                                    <td width="90px" align="center">${rnic:addDash(board.REGIST_DATE)}</td>
                                                                    <td width="100px" align="center">${board.COL_SUM}</td>
                                                                    <td width="70px" align="center">${board.COL1}</td>
                                                                    <td width="70px" align="center">${board.COL2}</td>
                                                                    <td width="70px" align="center">${board.COL3}</td>
                                                                    <td width="70px" align="center">${board.COL4}</td>
                                                                    <td width="70px" align="center">${board.COL5}</td>
                                                                    <td width="70px" align="center">${board.COL6}</td>
                                                                    <td width="70px" align="center">${board.COL7}</td>
                                                                    <td width="70px" align="center">${board.COL8}</td>
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
                                                    <tr>
                                                        <td height="40px" align="right">
                                                            <img src="/img/excel_icon.gif" alt="EXCEL 변환" border="0" onclick="javascript:excel_Search();" style="cursor:pointer;">
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
