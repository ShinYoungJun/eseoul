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
}
-->
</style>
<script language="javascript" type="text/javascript">
<!--
	function showTime()
	{
	    if (!document.all&&!document.getElementById) return;
	
	    thelement = document.getElementById ? document.getElementById("clock") : document.all.clock;
	
	    var montharray=new Array("1월","2월","3월","4월","5월","6월","7월","8월","9월","10월","11월","12월");
	
	    var Digital = new Date();
	
	    var months  = Digital.getMonth();
	    var days    = Digital.getDate();
	    var hours   = Digital.getHours();
	    var minutes = Digital.getMinutes();
	
	    if (hours > 12) 
	    	hours  = "오후 "+String(Number(hours)-Number(12));
	    else 
	    	hours = "오전 "+hours;
	    
	    if (minutes < 10) minutes="0"+minutes;
	
	    var ctime = montharray[months]+" "+days+"일 "+hours+":"+minutes;
	
	        thelement.innerHTML=ctime;
	        setTimeout("showTime()",1000);
	}


	function goUrl(url1,url2)
	{	
		top.frames[1].location=url1;	
		top.frames[2].location=url2;
	}

	/** 지도페이지 사이즈 **/
	  var winW = screen.availWidth - 10;	
	  var winH = screen.availHeight - 50;
	  /** 지도페이지 옵션 **/
	  var mapWinOpt = "toolbar=no,location=no,directories=no,status=yes,menubar=no,scrollbars=no,resizable=yes,left=0px,top=0px,width="+winW+"px,height="+winH+"px";
	  var mapWin = null;          
	  
	function popGeoInfo()
	{
		var url = "/jsp/map/index.html";
	    	mapWin = window.open(url,"mapWin",mapWinOpt);
	    	mapWin.focus();  
	}
	
	function confirmLogout()
	{
		if(confirm("로그아웃하시겠습니까?"))
			parent.location.href='/admin/user/logout.do';
	}

-->
</script>
<script type="text/JavaScript">
<!--
	function MM_swapImgRestore() { //v3.0
	  var i,x,a=document.MM_sr; for(i=0;a&&i<a.length&&(x=a[i])&&x.oSrc;i++) x.src=x.oSrc;
	}
	
	function MM_preloadImages() { //v3.0
	  var d=document; if(d.images){ if(!d.MM_p) d.MM_p=new Array();
	    var i,j=d.MM_p.length,a=MM_preloadImages.arguments; for(i=0; i<a.length; i++)
	    if (a[i].indexOf("#")!=0){ d.MM_p[j]=new Image; d.MM_p[j++].src=a[i];}}
	}
	
	function MM_findObj(n, d) { //v4.01
	  var p,i,x;  if(!d) d=document; if((p=n.indexOf("?"))>0&&parent.frames.length) {
	    d=parent.frames[n.substring(p+1)].document; n=n.substring(0,p);}
	  if(!(x=d[n])&&d.all) x=d.all[n]; for (i=0;!x&&i<d.forms.length;i++) x=d.forms[i][n];
	  for(i=0;!x&&d.layers&&i<d.layers.length;i++) x=MM_findObj(n,d.layers[i].document);
	  if(!x && d.getElementById) x=d.getElementById(n); return x;
	}
	
	function MM_swapImage() { //v3.0
	  var i,j=0,x,a=MM_swapImage.arguments; document.MM_sr=new Array; for(i=0;i<(a.length-2);i+=3)
	   if ((x=MM_findObj(a[i]))!=null){document.MM_sr[j++]=x; if(!x.oSrc) x.oSrc=x.src; x.src=a[i+2];}
	}
	

//-->
</script>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
</head>

<body
	onLoad="showTime(); MM_preloadImages('/img/submenu2_on.gif','/img/submenu3_on.gif','/img/submenu4_on.gif','/img/submenu5_on.gif')">
<form name="listForm">
<table width="100%" height="115" border="0" cellpadding="0"
	cellspacing="0">
	<tr>
		<td background="/img/sub_topback.gif">
		<table width="1000" height="115" border="0" cellpadding="0"
			cellspacing="0">
			<tr>
				<td width="200" rowspan="4"><img
					src="/img/sub_logo.gif" width="200" height="115"></td>
				<td height="38" align="right"
					background="/img/sub_topimg.gif"><!--최상단메뉴-->
				<table border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td><a href="#"><img src="/img/sub_topm1.gif"
							alt="홈" width="21" height="18" border="0"></a></td>
			            <td onClick="goUrl('/jsp/menu/left/admin.jsp','/admin/user/user.do');" style="cursor:pointer"><img src="/img/sub_topm2.gif" alt="관리자" width="40" height="18" border="0"></td>
						<td><a href="#"><img src="/img/sub_topm3.gif"
							alt="게시판" width="32" height="18" border="0"></a></td>
					</tr>
				</table>
				<!--최상단메뉴 끝--></td>
			</tr>
			<tr>
				<td height="35"><!--서브메뉴-->
				<table width="100" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td onClick="goUrl('/jsp/menu/left/jumyong.jsp','/jumyong/minwon/search.do');">
							<a href="#" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image5','','/img/submenu1_on.gif',1)" >
							<img src="/img/submenu1_off.gif" alt="점용 관리" name="Image5" "width="128" height="35" border="0"></a>
						</td>
						<td onClick="goUrl('/jsp/menu/left/junggi.jsp','/junggi/imposition/search.do');">
							<a href="#" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image6','','/img/submenu2_on.gif',1)" >
							<img src="/img/submenu2_off.gif" alt="정기분 관리" name="Image6" width="126" height="35" border="0"></a>
						</td>
						<td onClick="goUrl('/jsp/menu/left/facility.jsp','/jsp/facility/imposition/search.jsp');">
							<a href="#" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image7','','/img/submenu3_on.gif',1)" >
							<img src="/img/submenu3_off.gif" alt="시설물 관리" name="Image7" width="127" height="35" border="0"></a>
						</td>
						<td onClick="goUrl('/jsp/menu/left/gapan.jsp','/jsp/gapan/gapan/search.jsp');">
							<a href="#" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image8','','/img/submenu7_on.gif',1)" >
			            	<img src="/img/submenu7_off.gif" alt="노점 관리" name="Image8" width="115" height="35" border="0"></a>
			            </td>
			            <td onClick="goUrl('/jsp/menu/left/tonggae.jsp','/jsp/tonggae/tonggae.jsp');">
			            	<a href="#" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image9','','/img/submenu5_on.gif',1)" >
			            	<img src="/img/submenu5_off.gif" alt="통계 관리" name="Image9" width="118" height="35" border="0"></a>
			            </td>
			            <td onClick="popGeoInfo();">
							<a href="#" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('Image15','','/img/submenu6_on.gif',1)">
			            	<img src="/img/submenu6_off.gif" alt="지리정보" name="Image15" width="114" height="35" border="0"></a>
			            </td>
			          </tr>
				</table>
				<!--서브메뉴 끝--></td>
			</tr>
			<tr>
				<td height="28">
				<table width="800" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td width="35" height="28"
							background="/img/sub_timeback1.gif"></td>
						<td width="750" valign="bottom"
							background="/img/sub_timeback2.gif"><!--상단 로그인정보-->
						<table width="750" border="0" cellpadding="0" cellspacing="0"
							class="sub_stan">
							<tr>
								<td width="70" height="26" align="right"><span
									class="sub_stan_blue">${guNm}청</span> </td>
								<td width="19"><img src="/img/time_line.gif"
									width="19" height="11"></td>
								<td width="125"><span class="sub_stan_b">${name}</span>님 환영합니다</td>
								<td><a href="#"><img src="/img/info_mod.gif"
									alt="정보변경" width="68" height="14" border="0"></a><a href="javascript:confirmLogout();"><img
									src="/img/logout.gif" alt="로그아웃" width="53" height="14"
									border="0"></a></td>
								<td width="12"><img src="/img/time_img.gif"
									width="9" height="11"></td>
								<td width="120" class="sub_stan"><span id="clock"></span></td>
							</tr>
						</table>
						<!--상단 로그인정보 끝--></td>
						<td width="15" background="/img/sub_timeback3.gif"></td>
					</tr>
				</table>
				</td>
			</tr>
			<tr>
				<td height="14"><img src="/img/sub_topimg2.gif"
					width="290" height="14"></td>
			</tr>
		</table>
		</td>
	</tr>
</table>
</form>
</body>
</html>
