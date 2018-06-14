<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
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
            #tr_fixed_header
            {
                position: relative;
                top: expression(this.offsetParent.scrollTop);
                z-index: 20;
            }

            -->
        </style>
        <link href="/css/roads.css" rel="stylesheet" type="text/css">
        <script language="javascript" src="/js/PopupCalendar.js"></script>
        <script language="javascript" src="/js/Ajax_request.js"></script>
        <script language="javascript" src="/js/calculation.js"></script>
        <script>

    	function onlyNumberInput()
    	{
    	 var code = window.event.keyCode;
    	
    	 if ((code > 34 && code < 41) || (code > 47 && code < 58) || (code > 95 && code < 106) || code == 8 || code == 9 || code == 13 || code == 46 || code == 190 || code == 110)
    	 {
    	  	window.event.returnValue = true;
    		return;
    	 }else 
    	 {	 
    	 	window.event.returnValue = false;
    	 	return;
     	 }
    	}
      


    	function jumyong_calDate()
    	{
    		var fromDate = removeDash(document.getElementById("FROMDATE").value);
    		var toDate = removeDash(document.getElementById("TODATE").value);
    		var date_type = document.getElementById("date_type").value;
//    		var dateCount = 0;
    		if(fromDate>toDate){
    			alert("시작날짜 종료날짜보다 더늦게 설정 할 수 없습니다.");
    			document.getElementById("FROMDATE").value="";
    			document.getElementById("TODATE").value="";
    			return;
    		}
    		if(date_type == "month"){
    		var period = getDiffMon(fromDate,toDate)  ;
    		}else{
    		var period = getDiffDay(fromDate,toDate)  ;
    		}		
    		document.getElementById("PERIOD").value = period;
    		
    		var fromDay1 = new Date(fromDate.substr(0,4),Number(fromDate.substr(4,2))-1,fromDate.substr(6,2))
    		
    		var toDay1 = new Date(toDate.substr(0,4),Number(toDate.substr(4,2))-1,toDate.substr(6,2))		
    		

    	}	

    	

    	function Calculate()
    	{
    		
    		
    		var listCount = document.getElementById("listCount").value;
    		
    		if(document.getElementById("FROMDATE").value==""){
    			alert("산출시작 날짜을 넣어주세요.");
    			document.getElementById("FROMDATE").focus();
    			return;
    		}
    		if(document.getElementById("TODATE").value==""){
    			alert("산출종료 날짜을 넣어주세요.");
    			document.getElementById("TODATE").focus();
    			return;
    		}
    		if(document.getElementById("FROMDATE").value> document.getElementById("TODATE").value){
    			alert("산출시작 날짜는 산출종료 날짜보다 늦게 설정할수 없습니다.");
    			document.getElementById("FROMDATE").value="";
    			document.getElementById("TODATE").value="";
    			return;
    		}
    		
    		if(document.getElementById("PERIOD").value=="" || document.getElementById("PERIOD").value=="0"){
    			alert("개월수를 설정해 주세요");			
    			return;
    		}
    		
    		jumyong_calDate();
    		
    		if(listCount != null){
    			listCount = Number(listCount);
    		}
    		
    		for(var i=1; i<listCount+1 ;i++){
    			
    		if(document.getElementById("momey"+i).value=="" || document.getElementById("momey"+i).value=="0" || document.getElementById("momey"+i).value=="0.0"){
    			alert("산출단가를 넣어주세요.");
    			document.getElementById("momey"+i).focus();
    			return;
    		}
    		
    		var date_type = document.getElementById("date_type").value;
    		var quantity = document.getElementById("quantity"+i).value;
    		var depth_rate = document.getElementById("depth_num"+i).value;
    		var momey = document.getElementById("momey"+i).value;
    		var period = document.getElementById("PERIOD").value;
    	
				
	    		if(date_type=="month"){	    			
		    		document.getElementById("jumyong"+i).value = Math.floor(Number(quantity) * (100-Number(depth_rate))/100*Number(momey)*Number(period)/12);
		    		document.getElementById("calculation"+i).value = quantity+ " * " + " (100-"+Number(depth_rate)+" )/100*"+ Number(momey)+" * "+ Number(period)+" /12 ";
	    		}else{
	    			
	    			document.getElementById("jumyong"+i).value = Math.floor(Number(quantity) * (100-Number(depth_rate))/100*Number(momey)*Number(period)/365);
	    			document.getElementById("calculation"+i).value = quantity+ " * " + " (100-"+Number(depth_rate)+" )/100*"+ Number(momey)+" * "+ Number(period)+" /365 ";    			
	    			
	    		}
    	}
    }
    	
    
    	//	데이터 추가
    	function 	insertNode()
    	{
    		var	obj		= document.getElementById("XMLDATA").value;
            var xmlDom 	= new ActiveXObject("Microsoft.XMLDOM");
            var form 	= document.form;
    		var	Node;
    		var	value;
    		
            xmlDom.async	= false;
    		xmlDom.loadXML(obj);
    		
    		var objRoot	= xmlDom.documentElement;
    	
    		var objNode = xmlDom.createElement("DATA");
    		objRoot.appendChild(objNode);
    		
//    		var	DEPTH_CK	= "0";
 //   		if(document.getElementById("DEPTH_CK").checked	== true)
  //  			DEPTH_CK	= "1";
    
 			listCount = document.getElementById('listCount').value;
    		
    		if(listCount != null){
    			listCount =  Number(listCount);	
    		}
    		
    		for(var i = 1; i<listCount+1;i++){
    			
    			
    			objNode.appendChild(setNode(xmlDom, "quantity"+i));
    			objNode.appendChild(setNode(xmlDom, "depth_num"+i));
    			objNode.appendChild(setNode(xmlDom, "momey"+i));
    			objNode.appendChild(setNode(xmlDom, "calculation"+i));
    			objNode.appendChild(setNode(xmlDom, "jumyong"+i));
    			objNode.appendChild(setNode(xmlDom, "object_no"+i));
    		
    		
    		}
    	
    		alert(xmlDom.xml);
    		document.getElementById("XMLDATA").value = xmlDom.xml;
    		alert(xmlDom.xml);
    		
    	}

    	function	setNode(xmlDom, Name)
    	{
    		var	Node 	= xmlDom.createElement(Name);
    		Node.text	= document.getElementById(Name).value;
    			
    		return	Node;
    	}
    	
    	function 	Init()
    	{
//    		parent.Tab_Img("jumji");
    		
    		MakeXML();
    	}
    	
    	function 	MakeXML()
    	{     
    		var xmlDom = new ActiveXObject("Microsoft.XMLDOM"); 

    		var objRoot = xmlDom.createElement("ROOT"); 
    		xmlDom.appendChild(objRoot);

    		document.getElementById("XMLDATA").value = xmlDom.xml;  
    	}
    	
    	
        </script>
    </head>

    <body onload="Init()">
        <form id="frm" name="frm" method="post">

<input type='hidden' name='XMLDATA' id='XMLDATA'>
<table width="100%" border="0" cellspacing="0" cellpadding="0">
                                                    <tr>
                                                        <td height="34" width='2%'>                                                        	

                                                        </td>

                                                        <td height="34" class="sub_stan" align="left">
                                                            전체건수 : <span class="sub_stan_blue">${listCount}</span>건
                                                            <input type='hidden' id='listCount' name ='listCount' value='${listCount}'>
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td colspan="2">
                                                            <div style="width:780px;height:500px; padding:10px;overflow:scroll; scrollbar-face-color:#EEF8FB;  scrollbar-3dlight-color:#BBBDB6;scrollbar-highlight-color:#EEF8FB;scrollbar-shadow-color:#BBBDB6; scrollbar-darkshadow-color:#EEF8FB;  scrollbar-track-color:#EEF8FB; scrollbar-arrow-color:#BBBDB6;">
                                                                <table width="1200px" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">

                                                                    <tr>
                                                                        <td width="3%" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">물건<br />번호</td>
                                                                        <td width="3%" align="center" bgcolor="e5eff8" class="sub_table_b">기준<br />년도</td>
                                                                        <td width="27%" align="center" bgcolor="e5eff8" class="sub_table_b">점용목적</td>
                                                                        <td width="5%" align="center" bgcolor="e5eff8" class="sub_table_b">상세<br />시설물</td>                                                                        
                                                                        <td width="5%" align="center" bgcolor="e5eff8" class="sub_table_b">연장<br />(수량)</td>
                                                                        <td width="5%" align="center" bgcolor="e5eff8" class="sub_table_b">심도 <br />감액률</td>
                                                                        <td width="3%" align="center" bgcolor="e5eff8" class="sub_table_b">세입<br />구분</td>
                                                                        <td width="10%" align="center" bgcolor="e5eff8" class="sub_table_b">산출단가</td>
                                                                        <td width="28%" align="center" bgcolor="e5eff8" class="sub_table_b">일반산출식</td>
                                                                        <td width="19%" align="center" bgcolor="e5eff8" class="sub_table_b">일반점용료</td>                                                                        

                                                                    </tr>

                                                                    <c:choose>
                                                                        <c:when test='${blist != null && !empty blist}'>
                                                                            <c:forEach items="${blist}" var="board" varStatus="idx">
                                                                                
                                                                                    <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''">
                                                                                        <td align="center" class="sub_table_b">${board.OBJECT_NO}</td>
				                                                                        <td align="center" class="sub_table_b">${board.YEAR }</td>
				                                                                        <td align="center" class="sub_table_b">${board.SORT_NM} ${board.KIND_NM }</td>
				                                                                        <td align="center" class="sub_table_b">
				                                                                        	<c:if test="${board.SEBU_NM == null}"> - </c:if>	
									              											<c:if test="${board.SEBU_NM != null}">${board.SEBU_NM}</c:if>	
									              										</td>				                                                                        
				                                                                        <td align="center" class="sub_table_b"><input id='quantity${idx.count}' name='quantity${idx.count}' type='text' value='${board.QUANTITY}'size='5' class="sub_table_b"></td>
				                                                                        <td align="center" class="sub_table_b"><input id='depth_num${idx.count}' name='depth_num${idx.count}' type='text' value='${board.DEPTH_NUM}'size='2' class="sub_table_b">%</td>
				                                                                        <td align="center" class="sub_table_b">${board.TAX_SET_NAME}</td>
				                                                                        <td align="center" class="sub_table_b"><input id='momey${idx.count}' name='momey${idx.count}' type='text' value='${board.MOMEY }'size='10' class="sub_table_b"></td>
				                                                                        <td align="center" class="sub_table_b"><input id='calculation${idx.count}' name='calculation${idx.count}' type='text' value=''size='50' class="sub_table_b"></td>
				                                                                        <td align="center" class="sub_table_b"><input id='jumyong${idx.count}' name='jumyong${idx.count}' type='text' value='' class="sub_table_b"></td> 
                                                                                    </tr>
                                                                                		<input id='object_no${idx.count}' name='object_no${idx.count}' type='hidden' value='${board.OBJECT_NO}' >	
                                                                            </c:forEach>
                                                                        </c:when>
                                                                        <c:otherwise>
                                                                            <tr>
                                                                                <td align="center" class="sub_table" colspan="18" height="85"> 내용이 없습니다</td>
                                                                            </tr>
                                                                        </c:otherwise>
                                                                    </c:choose>

                                                                </table>
                                                            </div>
                                                        </td>
                                                    </tr>
                                                    <tr height="20">
                                                        <td>

                                                        </td>
                                                    </tr>

                                                    <tr>
                                                        <td align="left" colspan="2">
                                                            <table width="770" border="0" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                                                                <tr>
                                                                    <td>
                                                                        <table width="100%" border="0"  cellpadding="0" cellspacing="0"  class="sub_table">
                                                                            <tr>
                                                                                <td width="10%" height="26" align="left"  class="sub_table_b">&nbsp;* 세부 내역</td>
                                                                            </tr>
                                                                        </table>
                                                                    </td>
                                                                </tr>
                                                            </table>
                                                            <table width="770" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                                                                <tr>
                                                                    <td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">기준년도</td>
                                                                    <td width="100%" class="table_bl_left" colspan="3" align="left">
                                                                        <input id="YEAR"  name="YEAR" type="text" style="width:80px;ime-mode:disabled;" class="input_form1"  onKeyDown="onlyNumberInput();" value="${year}" maxlength="4" onKeyUp="">
                                                                    </td>
                                                                </tr>
                                                                <tr>
                                                                    <td width="13%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">산출기간</td>
                                                                    <td class="table_bl_left" colspan="3" align="left">
                                                                        <input name="FROMDATE" id="FROMDATE" type="text" class="input_form1" style="width:80px;ime-mode:disabled;" value=""  onKeyDown="onlyNumberInput();"   onKeyDown="onlyNumberInput();" maxlength=10>
                                                                        <img src="/img/calendar_icon.gif" onclick="popUpCalendar(this, document.getElementById('FROMDATE'), 'yyyymmdd');"  style="vertical-align:middle;cursor:pointer" >
                                                                        <input name="TODATE" id="TODATE" type="text" class="input_form1" style="width:80px;ime-mode:disabled;"  value=""  onKeyDown="onlyNumberInput();" maxlength=10>
                                                                        <img src="/img/calendar_icon.gif" onclick="popUpCalendar(this, document.getElementById('TODATE'), 'yyyymmdd');"  style="vertical-align:middle;cursor:pointer" >
                                                                        &nbsp;&nbsp; 
                                    
												                    	 <select id="date_type" class="input_form1" onchange="javascript:calDate();">
								                            				<option value="month">개월</option>
								                            				<option value="day">일</option>
								                        				</select>수											                    
                                                                    
                                                                        <input name="PERIOD" id ="PERIOD" type="text" class="input_form1" style="width:60px;ime-mode:disabled;" value = ""   onKeyDown="onlyNumberInput();" >
                                                                        <img src="/img/cal_month.gif" align="absmiddle" alt="날짜 계산" width="64" height="18" border="0" style="vertical-align:middle;cursor:pointer" onClick="javascript:jumyong_calDate();">

                                                                    </td>
                                                                </tr>                                                                                                                               
                                					    </table>
                                </td>
                            </tr>
                            <tr>
                                <td height="40" align="right" colspan="2">
                                    <table border="0" width="700">
                                        <tr>
                                            <td height="40" align="right">
                                                <img src="/img/accou_icon.gif" alt="계산" width="56" height="18" border="0" onclick="javascript:Calculate();" style="vertical-align:middle;cursor:pointer">
                                                <img src="/img/save_icon2.gif" alt="저장" width="56" height="18" border="0" onClick="javascript:insertNode();" style="vertical-align:middle;cursor:pointer">
                                                <img src="/img/can_icon.gif" alt="취소" border="0" onclick="javascript:history.back();" style="vertical-align:middle;cursor:pointer">
                                                &nbsp;&nbsp;&nbsp;&nbsp;
                                            </td>
                                        </tr>
                                    </table>
                                </td>
                            </tr>
                        </table>
           
		</form>
</body>
</html>

