<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/loginCheck.jsp" %>
<%@ include file="/jsp/common/include.jsp" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />
<title>::::: ����� ������������ý��� :::::</title>
<style type="text/plain">
<!--
body {
	margin: 0px;
	background-image: url(/img/left_back.gif);
}
-->
</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
<script>
	
	function initPage()
	{
		setYear();
	}

	function setYear()
	{
		now = new Date();
		Y = now.getYear();
		
		var strYear = "${year}";
		
		 newItem = new Option(0);
		 document.getElementById("year").options[0]  = newItem;
		 document.getElementById("year").options[0].text = "��ü";
		 document.getElementById("year").options[0].value = "";



		var j = 0;
		var k = 0;
		
		for(var i = 1 ; i<=11 ; i++){

			   newItem = new Option(i);

			   document.getElementById("year").options[i]  = newItem;
					if(i<=5){
						if(i==1){
							k=5;
						}
						else if(i==2){
							k=4;
						}
						else if(i==3){
							k=3;
						}
						else if(i==4){
							k=2;
						}
						else if(i==5){
							k=1;
						}else{
							k=0;
						}
							  
						  document.getElementById("year").options[i].text = Y+k;
						  document.getElementById("year").options[i].value = Y+k;
						  if(strYear == Y+k)document.getElementById("year").options[i].selected = true;								

								}
					else{
						  
						  document.getElementById("year").options[i].text = Y-i+5+1;
						  document.getElementById("year").options[i].value = Y-i+5+1;				  
						  if(strYear == Y-i+5+1)document.getElementById("year").options[i].selected = true; 
						
				  }				  
					 
				
			} 
	
		 
		 	
	}
	
	function goSearch()
	{
		//var year = document.getElementById("year").value;
		//var req_nm = document.getElementById("req_nm").value;
		//location.href="/facility/jumyong/search.do?year="+year+"&req_nm="+req_nm;
		var form = document.form;
		form.submit();
	}
	
	function goView(gu_cd,corp_cd,req_no,year)
	{
		location.href="/facility/jumyong/view.do?gu_code="+gu_cd+"&corp_cd="+corp_cd+"&admin_no="+req_no+"&YEAR="+year;
	}

</script>
</head>
<body onload="initPage();">
<!-- 

	for(var i = 1 ; i < 10 ; i++){
			  newItem = new Option(i);
			  document.getElementById("year").options[i]  = newItem;
			  document.getElementById("year").options[i].text = Y-i+1;
			  document.getElementById("year").options[i].value = Y-i+1;
			  if(strYear == Y-i+1) document.getElementById("year").options[i].selected = true;
		}

 -->

<table width="800" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td height="43"><img src="/img/facility_jumyong_top.gif" width="800" height="43"></td>
  </tr>
  <tr>
    <td align="center"><table width="780" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td height="40" align="right">
		</td>
      </tr>
      <tr>
        <td><table width="780" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td height="22" background="/img/tab_line_blue.gif"><table border="0" cellspacing="0" cellpadding="0">
                <tr>
                  <td><img src="/img/sub_facility_title1.gif" alt ="�ü�����ȸ"width="110" height="22"></td>
                </tr>
            </table></td>
          </tr>
		<tr>
            <td align="center" class="contborder_purple"><table width="100%" border="0" cellspacing="0" cellpadding="0">
           
           
              <tr>
                <td>
                <form action="/facility/jumyong/search.do" method="post" name="form">
                <table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                    <tr>
                      <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�ش�⵵</td>
                      <td bgcolor="eaeaea" class="table_bl_left">
					  <select name="year" id="year" class="input_form1" style="width:100px">
                       <option></option>
                      </select></td>
                      <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">���θ�/������</td>
                      <td bgcolor="eaeaea" class="table_bl_left">
					  <table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                        <tr>
                          <td><input name="req_nm" id="req_nm" type="text" class="input_form1" style="width:130px" value="${req_nm}"></td>
                        </tr>
                      </table>          
                      </td>
                    </tr>
                </table>
               </form>
                </td>
              </tr>
                <tr>
                  <td height="40" align="right">
                  <img src="/img/inquiry_icon2.gif" alt="��ȸ" width="56" height="18" border="0" style="cursor:pointer" onClick="javascript:goSearch()"></td>
                </tr>
               
                <tr>
                  <td height="1" bgcolor="#EAEAEA"></td>
                </tr>
                <tr>
                  <td height="34" class="sub_stan">��ü�Ǽ� : <span class="sub_stan_blue">${searchlistCount}</span>�� </td>
                </tr>
                <tr>
                  <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                      <tr>
                        <td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">��ȣ</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">����</td>                        
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">���θ�/������</td>                        
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">���Ǽ�</td>
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">�ֱٵ������</td>                        
                        <td align="center" bgcolor="e5eff8" class="sub_table_b">���俩��</td>
					  </tr>
                      
                      <c:forEach items="${searchList}" var="board" varStatus="idx">	                          
                      <tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''" style="cursor:pointer"
                      onclick="javascript:goView('${board.GU_CODE}','${board.CORP_CD}','${board.REQUEST_NO}','${board.YEAR}');">
                        <td height="26" align="center"> ${idx.count}</td>
                        <td align="center">${board.YEAR }</td>                        
                        <td align="center">${board.NAME}</td>                                        
                        <td align="center">${board.OBJECT_COUNT}</td>         
                        <td align="center">${board.REGDATE}</td>                                       
                        <td align="center"><font color="red">${board.CHECK_YN_NAME}</font></td>
                        
                      </tr>
                      </c:forEach>
                  </table></td>
                </tr>
                <tr>
					<td height="40" align="center">
						<table border="0" cellpadding="0" cellspacing="0">
							<tr>
	                        ${strPageDivideForm}
	                        </tr>
	                    </table>
                    </td>
               </tr>
            </table></td>
          </tr>
          <!--
          <tr>
            <td height="40" align="right">
            
            <a href="#"><img src="/img/newregi_icon.gif" alt="�űԵ��" height="22" border="0"></a>            
            <a href="#"><img src="/img/levy_icon.gif" alt="���ܼ��Ժΰ�"  height="22" border="0"></a>
            <a href="#"><img src="/img/occu_icon.gif" alt="�����㰡��"  height="22" border="0"></a>
            <a href="#"><img src="/img/notice_icon.gif" alt="�������߱�"  height="22" border="0"></a>                                    
            <a href="#"><img src="/img/excel_icon.gif" alt="EXCEL ��ȯ" border="0"></a>
            
            
            </td>
          </tr>
       
        -->
        </table></td>
      </tr>
      <tr>
        <td height="30"></td>
      </tr>


</table></td></tr></table>
</body>
</html>
