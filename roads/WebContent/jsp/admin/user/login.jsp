<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/include.jsp"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />
<title>::::: 서울시 도로점용관리시스템 :::::</title>
<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}
-->
</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">

<script language="javascript" src="/js/common.js"></script> 
<script language="javascript">
<!--
	function goFocus()
	{
		if(document.loginForm.userId.value == '')
			document.loginForm.userId.focus();
		else
			document.loginForm.password.focus();
	}
	
	// 폼 체크
	function checkForm()
	{
		var w = document.loginForm;
		for(var i=0; i<w.userId.value.length; i++)
		{
			code = w.userId.value.substr(i,1);
			if(!isAllow(code))
			{
				return;
			}
		}
		for(var i=0; i<w.password.value.length; i++)
		{
			code = w.password.value.substr(i,1);
			if(!isAllow(code))
			{
				return;
			}
		}		
		if(!checkStrNVMsg(w.userId,"아이디"))return;
		if(!checkStrNVMsg(w.password,"비밀번호"))	return;
		w.submit();				
	}
	
	function cancelForm()
	{
		var w = document.loginForm;
			w.userId.value = ""; 
			w.password.value = "";
			w.userId.focus();
	}
	
	function fn_focus(obj)
	{			
		if(event.keyCode == 9) 
		{	
			window.event.returnValue = false;
			obj.focus();
		}	
	}
	
	function checkKeySearch()
	{	
		if(event.keyCode == KEY_ENTER)
			checkForm();
	}

	function init()
	{
		window.open('/admin/user/noticePop.do?popup=1',"공지사항", "resizable=no, status=no, scrollbars=no, toolbar=no, menubar=no, left=200,top=200,width=300, height=393");	
	}
	
    function fn_regist()
    {	
 	    var winPosLeft = 'left='+(screen.width - 520) / 2; // 새창 x 좌표 
  		var winPosTop = 'top='+(screen.height - 500 - 100) / 2; // 새창 y 좌표 
  		var param = "resizable=no, status=no, scrollbars=no, toolbar=no, menubar=no, "+winPosLeft+","+ winPosTop+", width=520, height=600";
  		
    	window.open('/admin/user/userReg.do?input_type=text',"상세정보1", param);	
    }
    
    //공지사항 상세view
	function boardDetailPop(obj)
	{	
		var param = "/admin/boardDetail.do?seq="+obj+"&modeType=login";
	    var winPosLeft = 'left='+(screen.width - 800) / 2; // 새창 x 좌표 
  		var winPosTop = 'top='+(screen.height - 500 - 100) / 2; // 새창 y 좌표 
  		var param1 = "resizable=no, status=no, scrollbars=no, toolbar=no, menubar=no, "+winPosLeft+","+ winPosTop+", width=800, height=500";
		
		window.open( param, "상세정보2", param1);	
	}
	
	//게시판  view
	function boardListPop()
	{	
		var param = "/admin/noticeBoardList.do";
	    var winPosLeft = 'left='+(screen.width - 800) / 2; // 새창 x 좌표 
  		var winPosTop = 'top='+(screen.height - 580 - 100) / 2; // 새창 y 좌표 
  		var param1 = "resizable=no, status=no, scrollbars=no, toolbar=no, menubar=no, "+winPosLeft+","+ winPosTop+", width=800, height=580";
		
		window.open( param, "상세정보1", param1);	
	}	

	function popup()
	{
		window.open('/jsp/admin/user/popup.jsp',"공지사항", "resizable=no, status=no, scrollbars=no, toolbar=no, menubar=no, left=200,top=200,width=300, height=360");
	}

	function popupOpen()
	{
	   window.open("popup.htm","Notice",'width=500,height=670,scrollbars=no,top=25,left=30');
	}  

	function GetCookie(name){
	    var arg = name + "=";
	    var alen = arg.length;
	    var clen = document.cookie.length;
	    var i = 0;
	    
	    while(i < clen)
	 {
	        var j = i + alen;
	        if(document.cookie.substring(i, j) == arg)
	        return getCookieVal(j)
	        i = document.cookie.indexOf(" ", i) + 1
	        if(i == 0) break
	    }
	    return null
	}
	function getCookieVal(offset){
	    var endstr = document.cookie.indexOf(";", offset)
	    if(endstr == -1)
	        endstr = document.cookie.length
	    return unescape(document.cookie.substring(offset, endstr))
	}

	function expire()
	{ 
	 //alert(document.cookie);
	 if(GetCookie("Notice") != "done"){ 
		 //popup();
		 init(); 
	 } 
	}

	function checkColor(seq,retVal){
		if(seq == 'seq1'){
			
			document.write('<FONT color=#FF0000>' + retVal + '</FONT>');
		}else{
			document.write(retVal);
		}
		
	}
	
//-->
</script>
</head>

<body onLoad="javascript:goFocus();expire();" >
<form name="loginForm" method="post" action="/admin/user/login.do" >
<input name="modeType" type="hidden" value="login">

<table width="100%" height="100%" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td align="center"><table width="879" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td align="right"><img src="/img/intro_top.gif" width="235" height="20"></td>
      </tr>
      <tr>
        <td height="372" align="right" background="/img/intro_img.jpg"><table width="879" height="372" border="0" cellpadding="0" cellspacing="0">
          <tr>
            <td width="453" rowspan="3"></td>
            <td width="364" height="27"></td>
            <td width="62" rowspan="3"></td>
          </tr>
          <tr>
            <td height="153" valign="top"><table width="364" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td><table border="0" cellspacing="0" cellpadding="0">
                  <tr>
                    <td><img src="/img/int_title.gif" width="234" height="56"></td>
                    <td><img src="/img/id_but.gif" alt="아이디 신청" width="98" height="56" border="0" onclick="fn_regist();" style="cursor:pointer"></td>
                    </tr>
                </table></td>
              </tr>
              <tr>
                <td height="93" align="center"><table width="288" border="0" cellspacing="0" cellpadding="0">
                  <tr>
                    <td width="56"><img src="/img/id.gif" width="56" height="19"></td>
                    <td width="131"><input name="userId" type="text" class="login_form" style="width:131px" onKeyDown="javascript:fn_focus(document.loginForm.password);checkKeySearch();"></td>
                    <td width="51" rowspan="2"><img src="/img/login_but.gif" alt="로그인" width="51" height="42" border="0" onclick="javascript:checkForm();" style="cursor:pointer"></td>
                    <td width="50" rowspan="2"><img src="/img/login_but2.gif" alt="취소" width="50" height="42" border="0" onclick="javascript:cancelForm();" style="cursor:pointer"></td>
                  </tr>
                  <tr>
                    <td><img src="/img/pw.gif" width="56" height="19"></td>
                    <td><input name="password" type="password" class="login_form" style="width:131px" onKeyDown="javascript:fn_focus(document.loginForm.userId);checkKeySearch();">                    </td>
                  </tr>
                  
                </table></td>
              </tr>
              
            </table></td>
          </tr>
          
          <tr>
            <td align="left" valign="top"><table width="364" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td height="58" valign="top">
                  <table width="364" border="0" cellspacing="0" cellpadding="0">
                    <tr>
                      <td><img src="/img/notice_title.gif" width="281" height="47"></td>
                      <td><img src="/img/notice_more.gif" alt="더보기" width="83" height="47" border="0" onclick="boardListPop();" style="cursor:pointer"></td>
                    </tr>
                  </table></td>
              </tr>
              <tr>
                <td align="center"><table id="MINI_BOARD" width="313" border="0" cellspacing="0" cellpadding="0">
					<c:forEach items="${notice}" var="board" varStatus="idx">
						<tr>
							<td>	
								<input name="seq${idx.count}" id="seq${idx.count}" value="${board.BOARD_ID}" type="hidden">
							</td>
							<td width="40" height="20" class="int_blue">[공지]</td>
							<td align="left" class="list"><a href="javascript:boardDetailPop('${board.BOARD_ID}')" class="list" ><script>checkColor('seq${idx.count}','${board.TITLE}');</script></a></td>
							<td width="70" align="right"  class="int_d" onClick="javascript:boardDetailPop('${board.BOARD_ID}');" style="cursor:pointer">${board.REGDATE}</td>										
						</tr>
					</c:forEach>
                    
                </table></td>
              </tr>
              <tr>
                <td height="12"></td>
              </tr>
            </table></td>
          </tr>
        </table></td>
      </tr>
      <tr>
        <td height="58" background="/img/intro_copy.gif"></td>
      </tr>
    </table>
    </td>
  </tr>
</table>

<c:if test="${message != null}">
<script language="javascript">
<!--
		alert('${message}');
//-->
</script>
</c:if>

</form>
</body>
</html>
