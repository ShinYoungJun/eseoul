<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

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
	background-image: url(../../img/left_back.gif);
}
-->
</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
</head>

<script type="text/javascript">
//<![CDATA[
           
	function	menuBtn_chk(o)
	{
		document.getElementById("imposition").className = "leftM2";
		document.getElementById("extention").className = "leftM2";
		document.getElementById(o.id).className = "leftM1";
	}
	
//]]>
</script>

<body>
<table width="200" height="100%" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td align="center" valign="top"><table width="170" height="100%" border="0" cellpadding="0" cellspacing="0">
      <tr>
        <td height="17">&nbsp;</td>
      </tr>
      <tr>
        <td height="35"><img src="/img/sub2_title.gif" alt="정기분관리" width="170" height="35"></td>
      </tr>
      
      <tr>
        <td align="center" valign="top" bgcolor="f8f8f8" class="leftborder">
	<!--좌측 메뉴시작-->
		<table width="150" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td height="12" colspan="2"></td>
            </tr>
          <tr>
            <td width="29" height="27"><img src="/img/sub_menuicon.gif" width="29" height="27"></td>
            <td><a href="/junggi/imposition/search.do" class="leftM1" target="cont" id="imposition" onclick="javascript:menuBtn_chk(this);">정기분 부과</a> </td>
          </tr>
          <tr>
            <td height="1" colspan="2" bgcolor="e0e0df"></td>
            </tr>
          <tr>
            <td height="27"><img src="/img/sub_menuicon.gif" width="29" height="27"></td>
            <td><a href="/junggi/gigan/search.do" class="leftM2" target="cont" id="extention" onclick="javascript:menuBtn_chk(this);">기간연장처리</a> </td>
          </tr>
          <tr>
            <td height="1" colspan="2" bgcolor="e0e0df"></td>
            </tr>          
        </table>
	<!--좌측 메뉴시작-->
		</td>
      </tr>

    </table></td>
  </tr>
  <tr>
    <td height="174" align="center" valign="bottom">
<!--좌측하단 배너-->
	<table border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td><a href="#"><img src="/img/left_banner1.gif" alt="서울시세외수입 종합징수시스템" width="176" height="58" border="0"></a></td>
      </tr>
      <tr>
        <td><a href="#"><img src="/img/left_banner2.gif" alt="실시간민원통보시스템" width="176" height="47" border="0"></a></td>
      </tr>
      <tr>
        <td><a href="#"><img src="/img/left_banner3.gif" alt="새올민원행정시스템" width="176" height="52" border="0"></a></td>
      </tr>
    </table>
<!--좌측하단 배너 끝-->
    </td>
  </tr>
  <tr>
    <td height="60" align="center">
<!--관련사이트-->
	  <select name="select2" class="related" style="width:170px; background:f1f2f2">
      <option selected>관련사이트</option>
                      </select></td>
<!--관련사이트 끝-->
  </tr>
</table>
</body>
</html>
