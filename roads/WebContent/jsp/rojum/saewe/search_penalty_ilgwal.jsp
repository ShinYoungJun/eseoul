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
            #tr_fixed_header
            {
                position: relative;
                top: expression(this.offsetParent.scrollTop);
                z-index: 20;
            }

            -->
        </style>
        <link href="/css/roads.css" rel="stylesheet" type="text/css">
        <script language="javascript" src="/js/common.js"></script>
        <script language="javascript" src="/js/calculation.js"></script>
        <script language="javascript" src="/js/PopupCalendar.js"></script>
        <script language="javascript" src="/js/Ajax_request.js"></script>
     	<script language="javascript" src="/js/selectItem.js"></script>
		<script language="javascript" src="/js/Check_inputbox.js"></script>
        <script>

            function checkKeySearch()
            {
                if(event.keyCode == 13) goSearch();
            }



            function InitPage()
            {
            	changeTAXDATE();
            	
            	document.getElementById("SELECT_ALL").checked = true;
            	
        		var select_item = document.getElementsByName("SELECT_ITEM");
        		

        		for(var i = 0;i<select_item.length;i++){
        			select_item[i].checked = true;
        		}
            	
            	
            }
            
            //부과동작
            function submitBugwa(){
                var form = document.frm;
                
				document.getElementById("Bugwa_Ilgwal").onclick = function(){
					alert("잠시만 기다리세요.");
				};

				var select_item = document.getElementsByName("SELECT_ITEM");
				var item_check = document.getElementsByName("ITEM_CHECK");
				var gapan_no_arr = document.getElementsByName("GAPAN_NO_ARR");
				var count = 0;
		
				for(var i = 0 ; i < select_item.length ; i++){
					if(select_item[i].checked == true){
						item_check[i].value = select_item[i].checked;
						count++;
					}
				}
			
				if(count <= 0){
					alert("처리 대상이 없습니다.");
					return;
				}else{
					if(!confirm('선택하신 사전통지 미납분 '+count+'건에 대해서\n과태료 부과하시겠습니까?'))
						return;
					
					document.getElementById("Bugwa_Ilgwal").onclick = function(){
						alert("잠시만 기다리세요.");
					};
					form.action = "/rojum/saewe/search_penalty_ilgwal_prc.do";
					form.submit();
				}
				
				
            	
            }

            function changeTAXDATE(){
                
                //과세날짜, 납기일내일자, 납기후일자 구하기  2009.08.31 pkh
                var taxdate = document.getElementById("TAX_DATE").value;
                document.getElementById("INDATE").value = addDate('d',15,taxdate,'-');
                document.getElementById("OVERDATE").value = addDate('m',1,document.getElementById("INDATE").value,'-');

            }
            
		    function scrollAll() {
		    	  document.all.leftDisplay2.scrollTop = document.all.mainDisplay2.scrollTop;
		    	  document.all.topLine2.scrollLeft = document.all.mainDisplay2.scrollLeft;
		    }
        </script>
    </head>

    <body onload="InitPage()" >
        <form id="frm" name="frm" method="post">
        	 <div id="MSG" style="position:absolute;height:100%;display: none;">
        	 	<img src="/img/loadingBar.gif" id="MSGValue">
        	 </div>

            <input type="hidden" name="TOTALCNT" id="TOTALCNT" value="${listCount}">
            
            <table width="780" border="0" cellpadding="0" cellspacing="0">
                <tr>
                    <td height="43">
                    	<img src="/img/sub7_cont2_title.gif" width="800" height="43">
                   	</td>
                </tr>
                <tr>
                    <td >
                        <table width="780" border="0" cellspacing="0" cellpadding="0">
                            <tr>
                                <td height="1" bgcolor="eaeaea"></td>
                            </tr>
                            <tr>
                                <td height="14"></td>
                            </tr>
                            <tr>
                                <td>
                                    <table width="780" border="0" cellspacing="0" cellpadding="0">
                                        <tr>
                                            <td align="left" height="22" background="/img/tab_line_blue.gif">
                                                <table border="0" cellspacing="0" cellpadding="0">
                                                    <tr>
                                                        <td><img src="/img/sub_nopay_title.gif" width="110" height="22"></td>
                                                    </tr>
                                                </table>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td  class="contborder_purple">
                                                <table width="100%" border="0" cellspacing="0" cellpadding="0">
                                                    <tr>
                                                        <td height="34" class="sub_stan">
						                         			전체건수 : <span class="sub_stan_blue">${listCount}</span>건
                                                        </td>
                                                        <td class="sub_stan">
                                                        <font color="red">의견제출이 신청 및 승인일 경우 과태료대상조회에서 제외됩니다.</font>
                                                        </td>
                                                        
                                                    </tr>
                                                    <tr>
                                                        <td colspan="2">
															<table width="780px" cellpadding="0" cellspacing="0" border="0" class="sub_table" bordercolor="#c9dfed" style="border-collapse:collapse;">
															  <TR>
															    <TD width="110px"  valign="top">
															      <TABLE cellpadding="0" cellspacing="0" border="1" class="sub_table" bordercolor="#c9dfed" style="border-collapse:collapse;">
											                          <tr height="28px" onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''">
															              <td width="35px" height="28px" align="center" bgcolor="e5eff8" class="sub_table_b">
																			<INPUT TYPE="checkbox" ID="SELECT_ALL" onclick="javascript:selectAll(this);">
																		  </td>
											                          </tr>
															      </TABLE>
															    </TD>
															    <TD width="754px" valign="top">
															      <DIV id="topLine2" style="width:737px;overflow:hidden;">
															        <TABLE width="880px" cellpadding="0" cellspacing="0" border="1" class="sub_table" bordercolor="#c9dfed" style="border-collapse:collapse;">
															          <TR height="28px">
															            <td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">관리번호</td>
											                            <td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">운영자명</td>
											                            <td width="150px" align="center" bgcolor="e5eff8" class="sub_table_b">점용지 주소</td>
											                            <td width="60px" align="center" bgcolor="e5eff8" class="sub_table_b">초과일수</td>
											                            <td width="80px" align="center" bgcolor="e5eff8" class="sub_table_b">납기내일자</td>
											                            <td width="60px" align="center" bgcolor="e5eff8" class="sub_table_b">면적(㎡)</td>
											                            <td width="90px" align="center" bgcolor="e5eff8" class="sub_table_b">사전통지<br/>감경금액</td>
											                            <td width="90px" align="center" bgcolor="e5eff8" class="sub_table_b">과태료<br/>부과금액</td>
											                            <td width="150px" align="center" bgcolor="e5eff8" class="sub_table_b">감경대상</td>

															          </TR>
															        </TABLE>
															      </DIV>
															    </TD>
															  </TR>
															  <TR>
															    <TD width="26px" valign="top">
															      <DIV id="leftDisplay2" style="width:26px;height:337px;overflow:hidden;">
															        <TABLE width="100%" cellpadding="0" cellspacing="0" border="1" class="sub_table" bordercolor="#c9dfed" style="border-collapse:collapse;">
											                          <c:forEach items="${blist}" var="board" varStatus="idx">
											                          	<tr height="26px" onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''"	style="cursor: pointer">
													  						<td width="35px" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">
													  							<INPUT TYPE="checkbox" NAME="SELECT_ITEM">
													  							<INPUT TYPE="hidden" NAME="GAPAN_NO_ARR" value="${board.GAPAN_NO}">
													  							<INPUT TYPE="hidden" NAME="SEQ_ARR" value="${board.SEQ}">
													  							<INPUT TYPE="hidden" NAME="ITEM_CHECK" value="">
													  						</td>
													  					</tr>
											                          </c:forEach>
															        </TABLE>
															      </DIV>
															    </TD>
															    <TD width="754px" valign="top">
															      <DIV id="mainDisplay2" style="width:754px;height:354px;overflow:scroll;;scrollbar-face-color:#EEF8FB;scrollbar-3dlight-color:#BBBDB6; scrollbar-highlight-color:#EEF8FB;scrollbar-shadow-color:#BBBDB6; scrollbar-darkshadow-color:#EEF8FB;scrollbar-track-color:#EEF8FB;scrollbar-arrow-color:#BBBDB6;" onscroll="scrollAll()">
															        <TABLE width="880px" cellpadding="0" cellspacing="0" border="1" class="sub_table" bordercolor="#c9dfed" style="border-collapse:collapse;">
											                          <c:forEach items="${blist}" var="board" varStatus="idx">
											                          <tr height="26px" onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''">
											                          	  <td width="100px" align="center">
											                          	  	${board.GAPAN_NO}
											                              </td>
											                              <td width="100px" align="center">
											                              	${board.OWNER_NAME}
											                              </td>
											                              <td width="150px" align="center">
											                              	${board.ROJUM_ADDR}
											                              </td>
											                              <td width="60px" align="center">
											                             	${board.FAILTOPAY}
											                              </td>
											                              <td width="80px" align="center">
											                             	${rnic:addDash(board.INDATE)}
											                              </td>
											                              <td width="60px" align="center">
											                              	${board.AREA_AFTER}
											                              </td>
																		  <td width="90px" align="center">
																		      ${rnic:insertComma2(board.SUM_ADJUST)}
											                              </td>
											                              <td width="90px" align="center">
											                              	<font color="red">
	                                                                      	${board.ORG_PRICE}
											                              	</font>
											                              </td>
											                              <td width="150px" align="center">
	                                                                      	${board.LT_SEL_NM}
											                              </td>

											                          </tr>
											                          </c:forEach>
															        </TABLE>
															      </DIV>
															    </TD>
															  </TR>
															</table>
                                                        </td>
                                                    </tr>
                                                    <tr height="20">
                                                        <td>
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td align="center" colspan="2">
                                                            <table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                                                                <tr>
                                                                    <td colspan="6" height="26" align="left"  class="sub_table_b">&nbsp;* 부과 내역</td>
                                                                </tr>
                                                                <tr>
                                                                    <td width="100px" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">과세구분</td>
                                                                    <td bgcolor="eaeaea" class="table_bl_left" align="left">
                                                                    	수시분
                                                                    </td>
                                                                    <td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">세목코드</td>
                                                                    <td bgcolor="eaeaea" class="table_bl_left" colspan="3" align="left">
					                                                	[구일반]도로법위반과태료
                                                                    </td>
                                                                </tr>
                                                                <tr>
                                                                    <td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">과세일자</td>
                                                                    <td bgcolor="eaeaea" class="table_bl_left" align="left">
                                                                        <table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                                                                            <tr>
                                                                                <td>
                                                                                    <input name="TAX_DATE" id="TAX_DATE" type="text" class="essential" style="width:80px" value="${TAX_DATE}" onfocus="changeTAXDATE();" onselect="changeTAXDATE();">
                                                                                </td>
                                                                                <td>
                                                                                    <a>
                                                                                        <img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('TAX_DATE'), 'yyyymmdd')" style="CURSOR: Hand;">
                                                                                    </a>
                                                                                </td>
                                                                            </tr>
                                                                        </table>
                                                                    </td>


                                                                    <td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">납기일자</td>
                                                                    <td bgcolor="eaeaea" class="table_bl_left" colspan="3" align="left">
                                                                        <table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                                                                            <tr>
                                                                                <td>
                                                                                	납기내일자&nbsp;:&nbsp;<input name="INDATE" id="INDATE" type="text" class="essential" style="width:80px" value="" onFocus="" readonly>
                                                                               	</td>
                                                                                <td>
                                                                                	<a>
                                                                                		<img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('INDATE'), 'yyyymmdd')" style="CURSOR: Hand;">
                                                                                	</a>
                                                                               	</td>
                                                                                <td>
                                                                                	&nbsp;/&nbsp;납기후일자&nbsp;:&nbsp;<input name="OVERDATE" id="OVERDATE" type="text" class="essential" style="width:80px" value="" readonly>
                                                                               	</td>
                                                                                <td>
                                                                                	<a>
                                                                                		<img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('OVERDATE'), 'yyyymmdd')" style="CURSOR: Hand;">
                                                                               		</a>
                                                                           		</td>
                                                                            </tr>
                                                                        </table>
                                                                    </td>
                                                                </tr>
                                                            </table>
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td height="40" align="right" colspan="2">
                                                            <table border="0" width="100%">
                                                                <tr>
                                                                    <td height="40" align="right">
                                                                        <img src="/img/levy_icon2.gif" name="Bugwa_Ilgwal" id="Bugwa_Ilgwal" alt="부과" width="56" height="18" border="0" onClick="javascript:submitBugwa();" style="cursor:pointer" >
                                                                        <img src="/img/can_icon.gif" alt="취소" border="0" onclick="javascript:history.back();" style="cursor:pointer" >
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
                                <td height="30">

                                </td>
                            </tr>
                        </table>

                    </td>
                </tr>
            </table>
        </form>
    </body>

</html>

