<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String menu_param = request.getParameter("menu_param");
	if (menu_param == null) {
		menu_param = "";
	}
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />

<title>::::: ����� ������������ý��� :::::</title>
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
    function Init(menu_param)
    {
    	if(menu_param != "")
    	{
			document.getElementById("jumyong").className = "leftM1";
			document.getElementById("saewe").className = "leftM2";
			document.getElementById("geoInfo").className = "leftM2";
			document.getElementById("oldminwon").className = "leftM2";		
			//********** BEGIN_����_20120220
			document.getElementById("statistics").className = "leftM2";
			document.getElementById("bbs").className = "leftM2";
			//********** END_����_20120220
    	}
    }

	function	menuBtn_chk(o)
	{
		document.getElementById("jumyong").className = "leftM2";
		document.getElementById("saewe").className = "leftM2";
		document.getElementById("geoInfo").className = "leftM2";
		document.getElementById("oldminwon").className = "leftM2";	
		//********** BEGIN_����_20120220
		document.getElementById("statistics").className = "leftM2";
		document.getElementById("bbs").className = "leftM2";
		//********** END_����_20120220
		document.getElementById(o.id).className = "leftM1";
	}

	function popGeoInfo()
	{

	/** ���������� ������ **/
		  var winW = screen.availWidth - 10;	
		  var winH = screen.availHeight - 50;
		  /** ���������� �ɼ� **/
		  var mapWinOpt = "toolbar=no,location=no,directories=no,status=yes,menubar=no,scrollbars=no,resizable=yes,left=0px,top=0px,width="+winW+"px,height="+winH+"px";
		  var mapWin = null;   
		
		var url = "/gapan/map/MapIndex.do";
	    	mapWin = window.open(url,"mapWin",mapWinOpt);
	    	mapWin.focus();
	}
	
//]]>
</script>

<body onload="Init('<%=menu_param%>')">
<table width="200px" height="100%" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td align="center" valign="top">
		<table width="170px" height="100%" border="0" cellpadding="0" cellspacing="0">
			<tr>
				<td height="17">&nbsp;</td>
			</tr>
			<tr>
				<td height="35"><img src="/img/sub9_title.gif" alt="�����󿵾��ü�����" width="170" height="35"></td>
			</tr>

			<tr>
				<td align="center" valign="top" bgcolor="f8f8f8" class="leftborder">
				<table width="150" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td height="12" colspan="2"></td>
					</tr>
					<tr>
						<td width="29px" height="29px">
							<img src="/img/sub_menuicon.gif" width="29px" height="27px"/></td>
						<td align="left">
							<a href="/gapan/jumyong/search.do" class="leftM2" target="cont" id="jumyong" onClick="javascript:menuBtn_chk(this);">�����㰡 �� ����</a>
						</td>
					</tr>
					<tr>
						<td height="1px" colspan="2" bgcolor="e0e0df"></td>
					</tr>
					<tr>
						<td height="27px">
							<img src="/img/sub_menuicon.gif" width="29px" height="27px"/>
						</td>
						<td align="left">
							<a href="/gapan/saewe/search.do" class="leftM2" target="cont" id="saewe" onclick="javascript:menuBtn_chk(this);">���ܼ��� ����</a>
						</td>
					</tr>
					<tr>
					<td height="1px" colspan="2" bgcolor="e0e0df"></td>
					</tr>
					
					<tr>
						<td height="27px">
							<img src="/img/sub_menuicon.gif" width="29px" height="27px"/>
						</td>
						<td align="left">
							<a href="/gapan/statistics/statistics.do" class="leftM2" target="cont" id="statistics" onclick="javascript:menuBtn_chk(this);">
								������
							</a>
						</td>
					</tr>
					<tr>
						<td height="1px" colspan="2" bgcolor="e0e0df"></td>
					</tr>
					
					
					
					<tr>
						<td height="27px"><img src="/img/sub_menuicon.gif" width="29"
							height="27"></td>
						<td align="left">
							<div id="geoInfo" onclick="javascript:menuBtn_chk(this);popGeoInfo();" style="font-family����;font-size:12px;color:#858585;cursor:pointer;">
								��������
							</div>
						</td>
					</tr>
					<tr>
						<td height="1px" colspan="2" bgcolor="e0e0df"></td>
					</tr>
					<tr>
						<td height="27px">
							<img src="/img/sub_menuicon.gif" width="29px" height="27px"/></td>
						<td align="left"><a href="/jumyong/oldminwon/search.do" class="leftM2" target="cont" id="oldminwon" onclick="javascript:menuBtn_chk(this);">(��)�ο����� ��ȸ </a></td>
					</tr>
					<tr>
        			   <td height="1px" colspan="2" bgcolor="e0e0df"></td>
   				       </tr>
   			       <tr>
   			         <td height="27px"><img src="/img/sub_menuicon.gif" width="29px" height="27px"/></td>
    		        <td align="left"><a href="/bbs/bbs_gapan.jsp" class="leftM2" target="cont" id="bbs" onClick="javascript:menuBtn_chk(this);">�Խ��� �� ����ó </a> </td>
       			   </tr>
					<tr>
						<td height="12px" colspan="2"></td>
					</tr>
					
				</table>
				<!--���� �޴�����--></td>
			</tr>

		</table>
		</td>
	</tr>
	<tr>
    <td height="174" align="center" valign="bottom">
<!--�����ϴ� ���-->
	<table border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td><a href="http://98.33.4.164" target="_blank"><img src="/img/left_banner1.gif" alt="����ü��ܼ�������¡���ý���" width="176" height="58" border="0"></a></td>
      </tr>
      <tr>
        <td><a href="http://98.33.5.30" target="_blank"><img src="/img/left_banner2.gif" alt="����ùο����������ý���" width="176" height="47" border="0"></a></td>
      </tr>
      <tr>
        <td><a href="http://98.33.1.136:8080" target="_blank"><img src="/img/left_banner3.gif" alt="�ο�ó���¶��ΰ����ý���" width="176" height="52" border="0"></a></td>
      </tr>
		<!--  //********** BEGIN_KANG_21020524 -->
		<tr>
			<td><a href="http://www.juso.go.kr/openIndexPage.do" target="_blank"><img src="/img/left_banner_juso.gif" alt="���θ��ּ� �ȳ��ý���" border="0"></a></td>
		</tr>
		<!--   //********** END_KANG_21020524 -->
		<!-- sungh83 20131129 -->
		<tr><td height ='3'></td>
		</tr>
		<tr>
			<td><a href="http://road.cpermit.go.kr/cap/discussion/index.jsp" target="_blank"><img src="/img/left_banner_roadinfo.gif" alt="���������������� �ȳ��ý���" border="0"></a></td>
		</tr>
		<!-- sungh83 20131129 -->          
    </table>
<!--�����ϴ� ��� ��-->
    </td>
  </tr>
	<tr>
		<td height="60" align="center"></td>
	</tr>
</table>
</body>
</html>
