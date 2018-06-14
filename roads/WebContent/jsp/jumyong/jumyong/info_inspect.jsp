<%@ page language="java" contentType="text/html; charset=EUC-KR"
         pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/include.jsp" %>    
<%@ include file="/jsp/common/loginCheck.jsp" %>
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
        <script language="javascript" >

            function submitClick()
            {
                var form = document.inspectForm;
		
                if (getByteLength(form.INSPECT_OPINION) > 500) {
                    alert("현장조사 의견은 한글 500자(영문 1000자) 이상 입력할 수 없습니다.\n현재 글자수:"+getByteLength(form.INSPECT_OPINION));
                    return false;
                }
    	
                if (getByteLength(form.MANAGER_OPINION) > 500) {
                    alert("담당자 의견은 한글 500자(영문 1000자) 이상 입력할 수 없습니다.\n현재 글자수:"+getByteLength(form.MANAGER_OPINION));
                    return false;
                }
    	
                if (getByteLength(form.APPROVAL_CONDITION) > 500) {
                    alert("허가조건은 한글 500자(영문 1000자) 이상 입력할 수 없습니다.\n현재 글자수:"+getByteLength(form.APPROVAL_CONDITION));
                    return false;
                }


		
                //저장 사항 체크 
		
                if(getChecked('RESULT',0) || getChecked('RESULT',1) || getChecked('RESULT',2))
                {

                    var inspectForm = document.inspectForm;

                    inspectForm.submit();
                }else
                {
                    alert("점검결과를 입력해 주십시오.");
                }
                //parent.parent.location.reload();
                //var radioObj = document.getElementById("RESULT");

            }
	
            function getChecked(nameVal,numVal)
            {
                return document.getElementsByName(nameVal)[numVal].checked;
            }
	
            function subTabClick(hiddenSubTabName,visibleSubTabName)
            {	
                document.getElementById(hiddenSubTabName).style.display = 'none';	
                document.getElementById(visibleSubTabName).style.display = 'block';	
            }
	
	
            function InitPage()
            {	

                if(document.getElementById("mode").value == "add"  )
                {
                    document.getElementById("edit").style.display = "block";
                    document.getElementById("view").style.display = "none";
                }else if(document.getElementById("mode").value == "edit" || document.getElementById("mode").value == "add"  )
                {
                    document.getElementById("edit").style.display = "block";
                    document.getElementById("view").style.display = "none";
                }else
                {
                    document.getElementById("edit").style.display = "none";
                    document.getElementById("view").style.display = "block";
                }
            }
            // 등록폼 체크
            function checkForm(){
                var form1 = document.form1;
                //alert(form1.year.value);

                form1.submit();
                //	특수문자 입력시 글 끝에 공백과 줄바꿈을 넣어야 깨지지 않음. 이유는 모르겠슴
                //		w.content.value = w.content.value+' '+'\n';	
		
            }
	
            function onlyNumberInput()
            {
		
		
                var code = window.event.keyCode;
	
                if ((code > 34 && code < 41) || (code > 47 && code < 58) || (code > 95 && code < 106) || code == 8 || code == 9 || code == 13 || code == 46 || code == 190 || code == 110|| code == 189|| code == 109)
                {
                    window.event.returnValue = true;
                    return;
                }else 
                {	 
                    window.event.returnValue = false;
                    return;
                }
            }
	

	
            function goDel(seq)
            {
                var admin_no = "${no}";
	
                if(confirm("정말 삭제하시겠습니까?"))
                    location.href("/jumyong/jumyong/inspectDel.do?admin_no="+admin_no+"&seq="+seq);
            }
	

        </script>

    </head>

    <body onload="InitPage();">



        <form id="inspectForm" name="inspectForm" method="post" action = "/jumyong/inspectEdit.do" >

            <input id="no" name="no" value="${no}" type="hidden" >
            <input id = "mode" name="mode"  value="${mode}" type="hidden" >
            <input id="seq" name="seq" value="${seq }" type="hidden">
            <input id="SECTION" name="SECTION" value="${SECTION }" type="hidden">

            <div id="view" style="width:100%;">
                <table width="780" border="0" cellspacing="0" cellpadding="0">   
                    <tr>
                        <td background="/img/tab_line_blue.gif">
                        	<img id="conf_img" name="conf_img" src="/img/sub_petition_title5_on.gif" alt="현장조사" width="110" height="22" border="0"  >
                        </td>
                    </tr>        
                    <tr>
                        <td align="center" class="contborder_purple">

                            <table width="100%" border="0" cellspacing="0" cellpadding="0">
                                <tr>
                                    <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                                            <tr>
                                                <td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">번호</td>
                                                <td align="center" bgcolor="e5eff8" class="sub_table_b">점검결과</td>
                                                <td align="center" bgcolor="e5eff8" class="sub_table_b">조사일자</td>
                                                <td align="center" bgcolor="e5eff8" class="sub_table_b">조사자</td>
                                                <td align="center" bgcolor="e5eff8" class="sub_table_b">현장조사 의견</td>
                                                <td align="center" bgcolor="e5eff8" class="sub_table_b">담당자 의견</td>
                                                <td align="center" bgcolor="e5eff8" class="sub_table_b">허가조건 </td>
                                            <c:if test="${SECTION != '4'}">
                                                <td align="center" bgcolor="e5eff8" class="sub_table_b">삭제여부</td>
                                            </c:if>                    
                                </tr>
                                <c:forEach items="${iList}" var="board" varStatus="idx">
                                    <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" >                     
                                        <td height="26" align="center">${idx.count}</td>
                                        <td align="center">${board.NAME}</td>
                                        <td align="center">${rnic:addDash(board.INSPECT_DATE)}</td>
                                        <td align="center">${board.INSPECTOR}</td>
                                        <td align="center"
                                            onclick="javascript:location.href('/jumyong/inspectEdit.do?no=${no}&seq=${board.SEQ}&currentPage=${currentPage}&countPerPage=${countPerPage}');" style="cursor:pointer" >
                                        ${board.INSPECT_OPINION}</td>
                                        <td align="center">${board.MANAGER_OPINION}</td>
                                        <td align="center">${board.APPROVAL_CONDITION}</td>
                                    <c:if test="${SECTION != '4'}">
                                        <td align="center"  onclick="javascript:goDel('${board.SEQ}')";" style="cursor:pointer" >
                                            <font color="red">삭제</font></td>
                                    </c:if>


                                    </tr>
                                </c:forEach>
                            </table></td>
                    </tr>
                    <tr>
                        <td height="40" align="center"></td>
                    </tr>

                    <tr>
                        <td>
                            <table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                                <tr>
                                    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">점검결과</td>
                                    <td bgcolor="eaeaea" class="table_bl_left" colspan="3" align="left">
                                <input type="radio" name="RESULT_VIEW" disabled="true" value="1" <c:if test="${inspect.RESULT == '1' }"> checked </c:if>  > 허가
                                <input type="radio" name="RESULT_VIEW" disabled="true" value="2" <c:if test="${inspect.RESULT == '2' }"> checked </c:if>  > 불허
                                <input type="radio" name="RESULT_VIEW" disabled="true" value="3" <c:if test="${inspect.RESULT == '3' }"> checked </c:if>  > 보류
                        </td>                    
                    </tr>
                    <tr>
                        <td width="15%" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">조사자</td>
                        <td width="35%" bgcolor="eaeaea" class="table_bl_left" align="left">${inspect.INSPECTOR}</td>
                        <td width="15%" align="center" bgcolor="e5eff8" class="sub_table_b">조사일자</td>
                        <td width="35%" bgcolor="eaeaea" class="table_bl_left" align="left">${inspect.INSPECT_DATE}</td>
                    </tr>
                    <tr>
                        <td width="100" height="60" align="center" bgcolor="e5eff8" class="sub_table_b">현장조사 의견</td>
                        <td bgcolor="eaeaea" class="table_bl_left" colspan="3" align="left">${inspect.INSPECT_OPINION}</td>                    
                    </tr>  
                    <tr>
                        <td width="100" height="60" align="center" bgcolor="e5eff8" class="sub_table_b">담당자 의견</td>
                        <td bgcolor="eaeaea" class="table_bl_left" colspan="3" align="left">${inspect.MANAGER_OPINION}</td>                     
                    </tr> 
                    <tr>
                        <td width="100" height="60" align="center" bgcolor="e5eff8" class="sub_table_b">허가조건</td>
                        <td bgcolor="eaeaea" class="table_bl_left" colspan="3" align="left">${inspect.APPROVAL_CONDITION}</td>                     
                    </tr>                                
                </table></td>
                </tr>

                <tr>              
                    <td height="40" align="right">
                        <table border="0" width="100%">
                            <tr>
                                <td>
                            <c:if test="${SECTION != '4'}">
                                <c:if test="${listSize == '0'}">
                                    <a href="/jumyong/inspectEdit.do?no=${no}&mode=add&currentPage=${currentPage}&countPerPage=${countPerPage}">
                                        <img src="/img/add_icon.gif" alt="추가" border="0">
                                    </a>
                                </c:if>
                            </c:if>
                    </td>
                <c:if test="${SECTION != '4'}">
                    <c:if test="${listSize != '0'}"> 
                        <td width="50">
                            <a href="/jumyong/inspectEdit.do?no=${no}&mode=edit&seq=${seq}&currentPage=${currentPage}&countPerPage=${countPerPage}">
                                <img src="/img/mod_icon.gif" alt="수정" border="0">
                            </a>	 		                
                        </td>
                    </c:if>
                </c:if>
                </tr>
                </table>
                </td>
                </tr>

                </table>

                </td>
                </tr>

                </table>


            </div>



            <div id="edit" style="width:100%;display:none;">
                <table width="780" border="0" cellspacing="0" cellpadding="0">  
                    <tr>
                        <td background="/img/tab_line_blue.gif"><img id="conf_img" name="conf_img" src="/img/sub_petition_title5_on.gif" alt="현장조사" width="110" height="22" border="0"  ></td>
                    </tr>         
                    <tr>
                        <td align="center" class="contborder_purple">



                            <table width="100%" border="0" cellspacing="0" cellpadding="0">
                                <tr>
                                    <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                                            <tr>
                                                <td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">번호</td>
                                                <td align="center" bgcolor="e5eff8" class="sub_table_b">점검결과</td>
                                                <td align="center" bgcolor="e5eff8" class="sub_table_b">조사일자</td>
                                                <td align="center" bgcolor="e5eff8" class="sub_table_b">조사자</td>
                                                <td align="center" bgcolor="e5eff8" class="sub_table_b">현장조사 의견</td>
                                                <td align="center" bgcolor="e5eff8" class="sub_table_b">담당자 의견</td>
                                                <td align="center" bgcolor="e5eff8" class="sub_table_b">허가조건 </td>
                                            <c:if test="${SECTION != '4'}">
                                                <td align="center" bgcolor="e5eff8" class="sub_table_b">삭제여부</td>
                                            </c:if>
                                </tr>
                                <c:forEach items="${iList}" var="board" varStatus="idx">
                                    <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" >                     
                                        <td height="26" align="center">${idx.count}</td>
                                        <td align="center">${board.NAME}</td>
                                        <td align="center">${rnic:addDash(board.INSPECT_DATE)}</td>
                                        <td align="center">${board.INSPECTOR}</td>
                                        <td align="center"
                                            onclick="javascript:location.href('/jumyong/inspectEdit.do?no=${no}&seq=${board.SEQ}&currentPage=${currentPage}&countPerPage=${countPerPage}');" style="cursor:pointer" >
                                        ${board.INSPECT_OPINION}</td>
                                        <td align="center">${board.MANAGER_OPINION}</td>
                                        <td align="center">${board.APPROVAL_CONDITION}</td>
                                    <c:if test="${SECTION != '4'}">                    
                                        <td align="center"  onclick="javascript:goDel('${board.SEQ}')";" style="cursor:pointer" >
                                            <font color="red">삭제</font></td>
                                    </c:if>
                                    </tr>
                                </c:forEach>
                            </table></td>
                    </tr>
                    <tr>
                        <td height="40" align="center">
                        </td>                    
                    </tr>

                    <tr>
                        <td>


                            <table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                                <tr>
                                    <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">점검결과</td>

                                    <td bgcolor="eaeaea" class="table_bl_left" colspan="3" align="left">
                                <spring:bind path="inspect.RESULT">
                                    <input type="radio" name="RESULT" value="1"	<c:if test="${inspect.RESULT == '1' }"> checked </c:if>  > 허가
                                    <input type="radio" name="RESULT" value="2" <c:if test="${inspect.RESULT == '2' }"> checked </c:if>  > 불허
                                    <input type="radio" name="RESULT" value="3" <c:if test="${inspect.RESULT == '3' }"> checked </c:if>  > 보류
                                </spring:bind>
                        </td>                    
                    </tr>                             

                    <tr>
                        <td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">조사자</td>
                        <td bgcolor="eaeaea" class="table_bl_left" align="left">
                        <input id="INSPECTOR" name="INSPECTOR" type="text" class="input_form1" style="width:120px" value="${inspect.INSPECTOR}">
                    </td>
                    <td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">조사일자</td>
                    <td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan" align="left">
                            <tr>
                                <td>
                                	<input id="INSPECT_DATE" name="INSPECT_DATE" type="text" class="input_form1" style="width:120px" value="${inspect.INSPECT_DATE}"  style="ime-mode:disabled;" onKeyDown="onlyNumberInput();" maxlength=10 readonly>
                    			</td>
                    <td>
                        <img src="/img/calendar_icon.gif" width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('INSPECT_DATE'), 'yyyymmdd');" style="cursor:pointer" >
                    </td>
                    </tr>
                </table></td>
                </tr>
                <tr>
                    <td width="100" height="60" align="center" bgcolor="e5eff8" class="sub_table_b">현장조사 의견</td>
                    <td bgcolor="eaeaea" class="table_bl_left" colspan="3"  align="left">
                    <textarea id="INSPECT_OPINION" name="INSPECT_OPINION"  class="input_form1" style="width:600px"  cols="70" rows="3"  wrap="VIRTUAL" style="ime-mode:active;" >${inspect.INSPECT_OPINION}</textarea>
                </td>                    
                </tr>  
                <tr>
                    <td width="100" height="60" align="center" bgcolor="e5eff8" class="sub_table_b">담당자 의견</td>
                    <td bgcolor="eaeaea" class="table_bl_left" colspan="3"  align="left">
                    <textarea id="MANAGER_OPINION" name="MANAGER_OPINION"class="input_form1" style="width:600px"  cols="70" rows="3" wrap="VIRTUAL" style="ime-mode:active;" >${inspect.MANAGER_OPINION}</textarea>
                </td>
                </tr> 
                <tr>
                    <td width="100" height="60" align="center" bgcolor="e5eff8" class="sub_table_b">허가조건</td>
                    <td bgcolor="eaeaea" class="table_bl_left" colspan="3"  align="left">
                    <textarea  id="APPROVAL_CONDITION" name="APPROVAL_CONDITION" class="input_form1" style="width:600px"  cols="70" rows="3" wrap="VIRTUAL" style="ime-mode:active;" >${inspect.APPROVAL_CONDITION}</textarea>
                </td>                     
                </tr>                                
                </table></td>
                </tr>



                <tr>
                    <td height="40" align="right">
                <c:if test="${SECTION != '4'}">
                    <img src="/img/can_icon.gif" alt="취소" border="0" onclick="javascript:history.back();" style="cursor:pointer" >                
                    <img src="/img/save_icon2.gif" alt="저장" width="56" height="18" border="0" onClick="javascript:submitClick();"  style="cursor:pointer">
                </c:if>

                </td>
                </tr>
                </table>



                </td>
                </tr>

                </table>



            </div>

        </form>

    </body>
</html>

