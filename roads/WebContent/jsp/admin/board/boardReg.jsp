<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/include.jsp"%>
<%@ include file="/jsp/common/loginCheck.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

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

<script language="javascript" src="/js/common.js"></script> 
<script language="javascript" src="/js/PopupCalendar.js"></script> 
<script type="text/javascript">
           
	function submitClick()
	{	
		var w = document.regForm;

		if(w.PUBLIC_YN.value=="5"){
			if(!confirm("�˾� ������ �Ⱓ�� �ߺ����� �ʰ� ��� �ϼž� �մϴ�.\n����Ͻðڽ��ϱ�?")){
				return;
			}
		}
		
		if(!checkStrNVMsg(w.TITLE,"����")) return;
		if(!checkStrNVMsg(w.USER_ID,"�ۼ���")) return;
		if(!checkStrNVMsg(w.CONTENT,"����")) return;
		if(!checkStrNVMsg(w.PUBLIC_YN,"��������")) return;
		if(!checkStrNVMsg(w.NOTICE_FROMDATE,"�������� ��¥")) return;
		if(!checkStrNVMsg(w.NOTICE_TODATE,"�������� ��¥")) return;

	    if(w.NOTICE_FROMDATE.value > w.NOTICE_TODATE.value)
		{ 
			alert("�������ڴ� �������ں��� Ŭ�������ϴ�!");
			w.NOTICE_FROMDATE.select();
			return;
		}
		
		w.action = "/admin/boardReg.do";		
		w.submit();					
	}
	
	//���ڸ� �Է�
	function onlyNumberInput()
	{	
		var code = window.event.keyCode;
	
	 	if ((code > 34 && code < 41) || (code > 47 && code < 58) || (code > 95 && code < 106) || code == 8 || code == 9 || code == 13 || code == 46)
	 	{
		  	window.event.returnValue = true;
			return;
	 	}else {	 
	 		window.event.returnValue = false;
	 		return;
 	 	}
	}
	
</script>

<body>
<form name="regForm" id="regForm" method="post">
<input name="modeType" type="hidden">

<table width="800" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td height="43"><img src="/img/admin_cont7_title.gif" width="800" height="43"></td>
  </tr>
  <tr>
    <td align="center"><table width="780" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td height="40" align="right">
	<!--��� ��ȹ����,���� �޴�-->
		<table border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td height="8"></td>
            </tr>
          <tr>
            <td><a href="#"><img src="/img/help_icon.gif" alt="����" width="65" height="18" border="0"></a></td>
            </tr>
        </table>
	<!--��� ��ȹ����,���� �޴�-->		</td>
      </tr>
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
                  <td><img src="/img/sub_admin_title15.gif" width="110" height="22"></td>
                </tr>
            </table></td>
          </tr>
          <tr>
            <td align="left" class="contborder_blue">
           
            <table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                    <tr>
                      <td width="15%" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">�� ��</td>
                      <td width="30%" bgcolor="eaeaea" class="table_bl_left">
                      	<spring:bind path="boardReg.TITLE">
                        	<input name="TITLE" type="text" class="input_form1" style="width:120px" value="${boardReg.TITLE}"></spring:bind></td>
                      <td width="15%" align="center" bgcolor="e5eff8" class="sub_table_b">�ۼ���</td>
                      <td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                        <tr>
                          <td>
                          <spring:bind path="boardReg.USER_ID">
                          	<input name="USER_ID" type="text" class="input_form1" style="width:80px" value="${boardReg.USER_ID}"></spring:bind></td>
                        </tr>
                      </table></td>
                    </tr>
                    									<table width="100%" border="1" bordercolor="#c9dfed"
										style="border-collapse:collapse;" cellpadding="0"
										cellspacing="0" class="sub_table">
                    <tr>
                      <td width="15%" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
                      <td width="30%" colspan="3" bgcolor="eaeaea" class="table_bl_left">
                      <spring:bind path="boardReg.PUBLIC_YN">
	                      <select name="PUBLIC_YN" class="input_form1" style="width:100px">
	                        <option value="">�����ϼ���</option>
	                        <option value="1">����ð���</option>
	                        <option value="2">��ġ������</option>
	                        <option value="3">��ü����</option>
	                        <option value="4">�����</option>
	                        <option value="5">�˾�����</option>
	                      </select></spring:bind></td>
											<td width="15%" align="center" bgcolor="e5eff8"
												class="sub_table_b">��������</td>
											<td bgcolor="eaeaea" class="table_bl_left">
											<table border="0" cellpadding="0" cellspacing="0"
												class="sub_stan">
												<td>
												<spring:bind path="boardReg.NOTICE_FROMDATE">
												<input name="NOTICE_FROMDATE" type="text"
													class="input_form1" style="width:80px;ime-mode:disabled" onkeydown="onlyNumberInput();")>
													</spring:bind></td>
												<td><a href="#"><img src="/img/calendar_icon.gif"
													width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('NOTICE_FROMDATE'), 'yyyymmdd');"></a></td>
												<td width="16" align="center">~</td>
												<td>
												<spring:bind path="boardReg.NOTICE_TODATE">
												<input name="NOTICE_TODATE" type="text"
													class="input_form1" style="width:80px;ime-mode:disabled" onkeydown="onlyNumberInput();">
													</spring:bind></td>
												<td><a href="#"><img src="/img/calendar_icon.gif"
													width="19" height="16" border="0" onclick="popUpCalendar(this, document.getElementById('NOTICE_TODATE'), 'yyyymmdd');"></a>
											</table>
											</td>
										</tr>
									</table>
								</table>
								</td>
							</tr>
              <tr>
    		  	<td height="15"></td>
  			  </tr>
              <tr>
              	<td colspan="10" align="center" valign="top">
              		<spring:bind path="boardReg.CONTENT">
         				<textarea name="CONTENT" class="text_box" style="width:97%;height:300px" >${boardReg.CONTENT}</textarea>
           	  		</spring:bind>
           	  	</td>
              </tr>
            </table>
          
            </td>
          </tr>
          
        </table></td>
      </tr>
      <tr>
        <td height="10"></td>
      </tr>
      <tr>
        <td><table width="780" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td  align="right">
        	<a href="#"><img src="/img/save_icon2.gif" alt="����" width="56" height="18" border="0" onClick="javascript:submitClick();"></a>
        	 <a href="/admin/board.do"><img src="/img/can_icon.gif" alt="���" width="56" height="18" border="0"></a>
        </td>
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

