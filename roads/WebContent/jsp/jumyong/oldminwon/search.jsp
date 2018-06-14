<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
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
</head>

<script language="javascript" src="/js/PopupCalendar.js"></script> 
<script language='JavaScript' src='/js/Check_inputbox.js'></script>

<script type="text/javascript">
//<![CDATA[

	function	Page(page)
	{
		if(page	==	"")
			return;
		
		var form = document.form;

		form.currentPage.value	= page;

		form.action = "search.do";
		form.submit();
	}
	
	function	Search()
	{
		var form 		= document.form;
		var	LISTVIEW	= document.getElementById("LISTVIEW");
			LISTVIEW.value	= "1";
		
		form.currentPage.value	= 1;

		form.action = "search.do";
		form.submit();
	}
	
	function	excel_Search()
	{
		var form 		= document.form;
		var	LISTVIEW	= document.getElementById("LISTVIEW");
			LISTVIEW.value	= "1";
		
		form.currentPage.value	= 1;

		form.action = "excel_search.do";
		form.submit();
	}

	function	View(SERIAL_NBR, GU_CODE)
	{
		var form = document.form;
		form.action = "view.do?SERIAL_NBR=" + SERIAL_NBR + "&GU_CODE=" + GU_CODE+"&currentPage=1";
		form.submit();
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

	
	function fncSelectBoxSetting(strParam, selectBoxId, defaultSel, topLabel)
	{
        var xmldoc = new ActiveXObject("Microsoft.XMLDOM");
        var selectBoxLabel;
        var root;
        var selectBoxValue;
        var opt 	= document.getElementById(selectBoxId);
        var tags	= "";
        var	text	= "";

        for(var i = opt.options.length - 1 ; i > -1 ; i--)
        {
        	opt.options[i]	= null;
        }

        xmldoc.async	= false;

		xmldoc.loadXML(strParam);


		root = xmldoc.getElementsByTagName("option").length;


        if(root <= 0)
        {
            tags 	= document.createElement("option");
            text	= document.createTextNode("");
            tags.setAttribute("label", "");
            tags.appendChild(text);
            tags.value = 0;
            opt.appendChild(tags);
            return;
        }

        if(topLabel != null && topLabel != "")
		{
            tags 	= document.createElement("option");
            text	= document.createTextNode(topLabel);
            tags.setAttribute("label", topLabel);
            tags.appendChild(text);
            tags.value = '';
            opt.appendChild(tags);
        }
    	
        for(var i = 0; i < root; i++)
        {
        	
        	selectBoxValue = xmldoc.getElementsByTagName("option/@value").item(i).text;
        	selectBoxLabel = xmldoc.getElementsByTagName("option/@label").item(i).text;

            tags 	= document.createElement("option");
       		text	= document.createTextNode(selectBoxLabel);

            tags.setAttribute("label", selectBoxLabel);
      //      if(search_flag != '1'){
        //    	if(selectBoxValue == defaultSel) tags.setAttribute("selected", "true"); // 코드에 이빨이 빠진경우 처리
          //  }

            tags.value = selectBoxValue;
            tags.appendChild(text);
            opt.appendChild(tags);
        }

        var jummok = '${JUMMOK}';

        if(jummok.length > 0 && document.getElementById('FLAG').value == 'true'){
        	opt.options.value = jummok;
        };

        document.getElementById('FLAG').value = 'false';

        
    }


	function	Selected()
	{
		var	JIMOK	= document.getElementById("JIMOK").value;
		
		var	param	= "JIMOK="+JIMOK;
		
		sendRequest("/jumyong/oldminwon/get_jummok.do", param, "GET", Result);
	}

	function	Result(obj)
	{
		fncSelectBoxSetting(obj, "JUMMOK", "EEE", "::선택::");
	}

	function init(){
		Selected();


	}

	function checkKeySearch(){
		if(event.keyCode == "13")
			Search();
	}


	

//]]>
</script>

<body onload="init();">
	
<form id="form" name="form" method="post" action="search.jsp">
<input type="hidden" id="currentPage" name="currentPage" value="${currentPage}">
<input type="hidden" id="LISTVIEW" name="LISTVIEW" value="1">
<input type="hidden" id="GU_CODE" name="GU_CODE">
<input type="hidden" id="FLAG" name="FLAG" value = "true">

<table width="800" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td height="43"><img src="/img/sub1_petition_title.gif" width="800" height="43"></td>
	</tr>
	<tr>
		<td>
		<table width="780" border="0" cellspacing="0" cellpadding="0">
	      <tr>
	        <td height="1" bgcolor="eaeaea"></td>
	      </tr>
	      <tr>
	        <td height="14"></td>
	      </tr>     
	      <tr>
	        <td><table width="780" border="0" cellspacing="0" cellpadding="0">
	          <tr>
	            <td align="left" height="22" background="/img/tab_line_blue.gif">
	            <table border="0" cellspacing="0" cellpadding="0">
	                <tr >
	                  <td ><img src="/img/sub_petition_title15.gif" width="110" height="22"></td>
	                </tr>
	            </table></td>
	          </tr>
			<tr>
	            <td  class="contborder_purple">
	            
	            <table width="100%" border="0" cellspacing="0" cellpadding="0">
	              <tr>
	                <td>
	                
	                <table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
	                     <tr>
						  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b" >민원행정관리번호</td>
	                      <td bgcolor="eaeaea" class="table_bl_left" width="35%">
						  	<input id="SERIAL_NBR" name="SERIAL_NBR" type="text" class="input_form1" style="width:130px" value="${SERIAL_NBR}" onKeyDown="javascript:checkKeySearch();" >
						  </td>
						  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">점용인/법인명</td>
	                      <td bgcolor="eaeaea" class="table_bl_left">
							  <table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
		                        <tr>
		                          <td><input id="JUMNM" name="JUMNM" type="text" class="input_form1" style="width:130px" value="${JUMNM}" onKeyDown="javascript:checkKeySearch();" ></td>
		                        </tr>
		                      </table>
	                      </td>
	                    </tr>
	                    <tr>
						  	<td height="32" align="center" bgcolor="e5eff8" class="sub_table_b">허가여부</td>
						  	<td bgcolor="eaeaea" class="table_bl_left">
						  		<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
			                          <td>
			                          <select id="HEOGA" name="HEOGA" class="input_form1" style="width:130px">
			                          	<option value="" <c:if test="${HEOGA == ''}">selected</c:if> >::전체::</option>
			                          	<option value="1" <c:if test="${HEOGA == '1'}">selected</c:if> >허가</option>
			                          	<option value="2" <c:if test="${HEOGA == '2'}">selected</c:if> >직권</option>
			                          	<option value="3" <c:if test="${HEOGA == '3'}">selected</c:if> >폐쇄</option>
			                          </select>
			                          </td>
								  	</tr>
						  		</table>
						  	</td>
						  	<td height="32" align="center" bgcolor="e5eff8" class="sub_table_b">행정동</td>
						  	<td bgcolor="eaeaea" class="table_bl_left">
						  		<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
			                          <td>
			                          <select id="HJCD" name="HJCD" class="input_form1" style="width:130px">${hjdong_code}
			                          </select>
			                          </td>
								  	</tr>
						  		</table>
						  	</td>
						 </tr>
						 <tr>
							  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">도로 번지</td>
		                      <td bgcolor="eaeaea" class="table_bl_left" width="35%">
								  	<input id="BUN" name="BUN" type="text" class="input_form1" style="width:50px" value="${BUN}" onKeyDown="javascript:checkKeySearch();" > - 
								  	<input id="JI" name="JI" type="text" class="input_form1" style="width:40px" value="${JI}" onKeyDown="javascript:checkKeySearch();" >
							  </td>
							  <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">건물 지번</td>
		                      <td bgcolor="eaeaea" class="table_bl_left">
	                        	 	<input id="JIBUN" name="JIBUN" type="text" class="input_form1" style="width:130px" value="${JIBUN}" onKeyDown="javascript:checkKeySearch();" >
		                      </td>
	                    </tr>
	                    	                    <tr>
						  	<td height="32" align="center" bgcolor="e5eff8" class="sub_table_b">점용구분</td>
						  	<td bgcolor="eaeaea" class="table_bl_left">
						  		<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
			                          <td>
			                          <select id="JIMOK" name="JIMOK" class="input_form1" style="width:130px" OnChange="Selected();">
			                          	<option value="" <c:if test="${JIMOK == ''}">selected</c:if> >::전체::</option>
			                          	<option value="1" <c:if test="${JIMOK == '1'}">selected</c:if> >도로</option>
			                          	<option value="2" <c:if test="${JIMOK == '2'}">selected</c:if> >하천</option>
			                          	<option value="3" <c:if test="${JIMOK == '3'}">selected</c:if> >구거</option>
			                          </select>
			                          </td>
								  	</tr>
						  		</table>
						  	</td>
						  	<td height="32" align="center" bgcolor="e5eff8" class="sub_table_b">점용목적</td>
						  	<td bgcolor="eaeaea" class="table_bl_left">
						  		<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
			                          <td>
			                          	<select id="JUMMOK" name="JUMMOK" class="input_form1" style="width:230px">
										</select>
			                          </td>
								  	</tr>
						  		</table>
						  	</td>
						 </tr>
	                </table>
	                </td>
	              </tr>

	              <tr>
                    <td height="40" align="right"><img src="/img/inquiry_icon2.gif" alt="조회" width="56" height="18" border="0" onclick="javascript:Search();" style="cursor:pointer"></td>
                  </tr>
	              <tr>
	                <td height="1" bgcolor="#EAEAEA"></td>
	              </tr>
	              <tr>
	                <td height="34" class="sub_stan">전체건수 : <span class="sub_stan_blue">${listCount}</span>건 </td>
	              </tr>
	              <tr>
	                <td>
	                	<table width="780" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
	              	      <tr>
	                        <td height="35" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">관리번호</td>
	                        <td align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">점용자명</td>	                        
	                        <td align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">허가<br/>여부</td>
	                        <td align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">점용<br/>구분</td>
	                        <td align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">점용목적</td>
	                        <td align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">요율</td>
	                        <td align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">면적<br/>㎡</td>
	                        <td align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">점용기간</td>
	                        <td align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">행정동</td>
	                        <td align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">건물<br/>지번</td>
	                        <td align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">도로<br/>번지</td>
	                      </tr>
	                      <c:choose>
						  	<c:when test='${blist != null && !empty blist}'>
	                      		<c:forEach items="${blist}" var="board" varStatus="idx">
				                      <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" style="cursor:pointer" onClick="javascript:View('${board.SERIAL_NBR}','${board.GU_CODE}');">
										<td height="26" align="center">${board.SERIAL_NBR}</td>
				                        <td align="center">${board.JUMNM}</td>
				                        <td align="center">${board.HEOGA_NM}</td>
				                        <td align="center">${board.JIMOK_NM}</td>
				            			<td align="center">${board.JUMMOK_NM}</td>     
				                        <td align="center">${board.JUMYO}</td>
				                        <td align="center">${board.JUMDAN}</td>
				                        <td align="center">${board.HH_DATE}</td>   
				                        <td align="center">${board.HJNM}</td>         
				                        <td align="center">${board.JIBUN}</td>
				                        <td align="center">
				                        	${board.BUN}<c:if test="${board.JI != null}">-</c:if>${board.JI}
				                        </td>
				                      </tr>
								 </c:forEach>
							</c:when>
							<c:otherwise>
								<tr>
									<td align="center" class="sub_table" colspan="11" height="85">검색된 내용이 없습니다</td>
								</tr>
							</c:otherwise>
						 </c:choose>
	                    </table>
					  </td>
	               </tr>
	                
	               <tr>
	                  <td height="30" align="center"><table border="0" cellspacing="0" cellpadding="0">
	                      <tr>
							${pageing}
	                      </tr>
	                  </table></td>
	                </tr>
		              
		              <tr>              
		                <td height="40" align="right">
			                <table border="0" width="100%">
			                	<tr>
				                	<td >
					                	<img src="../../../img/excel_icon.gif" alt="EXCEL 변환" border="0" onclick="javascript:excel_Search();" style="cursor:hand">
					                </td>						                
				                </tr>
				             </table>
						</td>
		              </tr>
	                
	            </table></td>
	          </tr>
	          
	        </table></td>
	      </tr>
	      <tr>
	        <td height="30"></td>
	      </tr>
		</table>
		</td>
	</tr>
</table>


</form>
	
</body>
</html>