<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="/jsp/common/loginCheck.jsp" %>

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
		var url = "/jsp/map/index.jsp";
	    	mapWin = window.open(url,"mapWin",mapWinOpt);
	    	mapWin.focus();  
	}
	
	function confirmLogout()
	{
		if(confirm("로그아웃하시겠습니까?"))
			parent.location.href='/admin/user/logout.do';
	}

	//사용자정보 수정 팝업오픈
	function userUpdate(obj)
	{	
		var param = "/admin/user/userDetail.do?userId="+obj+"&input_type=text";		//id_type은 정보변경 팝업에서 개인정보 id의 input type을 정해줌 
	    var winPosLeft = 'left='+(screen.width - 520) / 2;  // 새창 x 좌표 
  		var winPosTop = 'top='+(screen.height - 500 - 100) / 2;  // 새창 y 좌표 
  		var param1 = "resizable=no, status=no, scrollbars=no, toolbar=no, menubar=no, "+winPosLeft+","+ winPosTop+", width=520, height=626";
		
		window.open( param, "상세정보2", param1);	
	}
	
	function init()
	{	
		//alert(document.getElementById("GRADE_MENU").value);
		var w = document.listForm;
		//alert(w.section.value);

		if(w.section.value != '1')
			w.admin.style.visibility = "hidden";
	}
	
	// 관리자메뉴활성
	function admin_open()
	{
		var w = document.listForm;
		
		if(w.section.value == '1')
		{
			goUrl('/jsp/menu/left/admin.jsp','/admin/user/user.do');
		}	
	}


</script>
<script type="text/JavaScript">
<!--

var clickImgNm = "Image5";

function MM_swapImgRestore() { //v3.0
	  var i,x,a=document.MM_sr; 
	  for(i=0;a&&i<a.length&&(x=a[i])&&x.oSrc;i++)
	  	  x.src=x.oSrc;	 
	  
}

function MM_preloadImages() { //v3.0
	var d=document; 
	if(d.images)
	{ 
		if(!d.MM_p) d.MM_p=new Array();
		var i,j=d.MM_p.length,a=MM_preloadImages.arguments; 
		for(i=0; i<a.length; i++)
			if (a[i].indexOf("#")!=0)
			{ 
				d.MM_p[j]=new Image; 
				d.MM_p[j++].src=a[i];
			}
	}
}

function MM_findObj(n, d) { //v4.01
  var p,i,x;  if(!d) d=document; if((p=n.indexOf("?"))>0&&parent.frames.length) {
    d=parent.frames[n.substring(p+1)].document; n=n.substring(0,p);}
  if(!(x=d[n])&&d.all) x=d.all[n]; for (i=0;!x&&i<d.forms.length;i++) x=d.forms[i][n];
  for(i=0;!x&&d.layers&&i<d.layers.length;i++) x=MM_findObj(n,d.layers[i].document);
  if(!x && d.getElementById) x=d.getElementById(n); return x;
}

function MM_swapImage() { //v3.0
	var i,j=0,x,a=MM_swapImage.arguments;
	document.MM_sr=new Array;
	for(i=0;i<(a.length-2);i+=3)
	if ((x=MM_findObj(a[i]))!=null)
	{
		document.MM_sr[j++]=x; 
		if(!x.oSrc) x.oSrc=x.src; 
		x.src=a[i+2];
	}
}


function mouseOverFn(imgNm,blank,gifNm,num)
{
	MM_swapImage(imgNm,blank,gifNm,num);
}


function mouseOutFn()
{
	
	img5 = document.getElementById("Image5");
	img7 = document.getElementById("Image7");
	img8 = document.getElementById("Image8");
	img9 = document.getElementById("Image9");
	img10 = document.getElementById("Image10");
	img15 = document.getElementById("Image15");					
	
	if(clickImgNm !="Image5")
		imgRestore(img5,'/img/submenu1_off.gif');
	if(clickImgNm !="Image7")		
		imgRestore(img7,'/img/submenu3_off.gif');
	if(clickImgNm !="Image8")		
		imgRestore(img8,'/img/submenu7_off.gif');
	if(clickImgNm !="Image10")		
		imgRestore(img10,'/img/submenu8_off.gif');
	if(clickImgNm !="Image9")		
		imgRestore(img9,'/img/submenu5_off.gif');
	if(clickImgNm !="Image15")		
		imgRestore(img15,'/img/submenu6_off.gif');
	
}


function changePw(){
	var idcheck = "${userId}";
	if(idcheck == "cgpark2"){
		top.frames[2].location='/admin/user/changePwdView.do?userId='+idcheck;
		//goUrl('/jsp/menu/left/admin.jsp','/admin/user/changePwd.do');
		//goUrl('/jsp/menu/left/admin.jsp', '/jsp/admin/user/changePwd.jsp');
	}
}

function clickImgFn(img) { 
	clickImgNm = img;
	mouseOutFn();
}


function imgRestore(img,srcParam) {
	img.src=srcParam;
}

//-->
</script>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
</head>

<body
	onLoad="showTime(); MM_preloadImages('/img/submenu2_on.gif','/img/submenu3_on.gif','/img/submenu7_on.gif','/img/submenu5_on.gif');init();">
<form id="listForm" name="listForm">
<input type="hidden" id="section" name="section" value="${section}">
<input type="hidden" id="grade_menu" name="grade_menu" value="${grade_menu}">
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
				<!--  	<td><a href="#"><img src="/img/sub_topm1.gif"
							alt="홈" width="21" height="18" border="0"></a></td>  -->
			            <td id="menu7" style="display:block;"><img id="admin" name="admin" src="/img/sub_topm2.gif" alt="관리자" width="40" height="18" border="0" onClick="admin_open();" style="cursor:pointer" ></td>
		<!-- 			<td><a href="#"><img src="/img/sub_topm3.gif"
							alt="게시판" width="32" height="18" border="0"></a></td>  -->
					</tr>
				</table>
				<!--최상단메뉴 끝--></td>
			</tr>
			<tr>
				<td height="35"><!--서브메뉴-->
				<table width="100" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<!--  //********** BEGIN_KANG_20120418 -->
						<!-- 
						<td id="menu1" style="display:block;" onClick="goUrl('/jsp/menu/left/jumyong.jsp','/jumyong/minwon/search.do');" >							
							<img src="/img/submenu1_on.gif" alt="점용 관리" id="Image5" name="Image5" height="35" border="0" onclick="javascript:clickImgFn('Image5')";
							onMouseOut="mouseOutFn()" onMouseOver="mouseOverFn('Image5','','/img/submenu1_on.gif',1);" style="cursor:pointer">
						</td>
						 -->
						 <td id="menu1" style="display:block;" onClick="goUrl('/jsp/menu/left/jumyong.jsp?grade=${grade_menu}','/jumyong/minwon/search.do');" >														
							<img src="/img/submenu1_on.gif" alt="점용 관리" id="Image5" name="Image5" height="35" border="0" onclick="javascript:clickImgFn('Image5')";
							onMouseOut="mouseOutFn()" onMouseOver="mouseOverFn('Image5','','/img/submenu1_on.gif',1);" style="cursor:pointer">
						</td>
						<!--   //********** END_KANG_20120418 -->
<!-- 					<td onClick="goUrl('/jsp/menu/left/junggi.jsp','/junggi/imposition/search.do');">
							<img src="/img/submenu2_off.gif" alt="정기분 관리" name="Image6" height="35" border="0"  onclick="javascript:clickImgFn('Image6')";
							onMouseOut="mouseOutFn()" onMouseOver="mouseOverFn('Image6','','/img/submenu2_on.gif',1);" 
							onclick="clikImgNm='Image6'"style="cursor:pointer">
						</td>
 -->						
						<!--  //********** BEGIN_KANG_20120416 -->
						<!-- 
						<td id="menu2" style="display:block;" onClick="goUrl('/jsp/menu/left/facility.jsp','/facility/minwon/search.do');">
							<img src="/img/submenu3_off.gif" alt="시설물 관리" id="Image7" name="Image7" height="35" border="0"  onclick="javascript:clickImgFn('Image7')";
							onMouseOut="mouseOutFn()" onMouseOver="mouseOverFn('Image7','','/img/submenu3_on.gif',1)"
							onclick="clikImgNm='Image7'"style="cursor:pointer">
						</td>
						-->
						<td id="menu2" style="display:block;" onClick="goUrl('/jsp/menu/left/facility.jsp','/facility/adminbiz/search.do');">
							<img src="/img/submenu3_off.gif" alt="시설물 관리" id="Image7" name="Image7" height="35" border="0"  onclick="javascript:clickImgFn('Image7')";
							onMouseOut="mouseOutFn()" onMouseOver="mouseOverFn('Image7','','/img/submenu3_on.gif',1)"
							onclick="clikImgNm='Image7'"style="cursor:pointer">
						</td>
						<!--   //********** END_KANG_20120416 -->
						
						<td id="menu3" style="display:block;" onClick="goUrl('/jsp/menu/left/gapan.jsp','/gapan/jumyong/search.do');">
							<img src="/img/submenu7_off.gif" alt="보도상영업시설물 관리" id="Image8" name="Image8" height="35" border="0" onclick="javascript:clickImgFn('Image8')";
							onMouseOut="mouseOutFn()" onMouseOver="mouseOverFn('Image8','','/img/submenu7_on.gif',1)"
							onclick="clikImgNm='Image8'"style="cursor:pointer">
			            </td>
			            <td id="menu8" style="display:block;" onClick="goUrl('/jsp/menu/left/rojum.jsp','/rojum/survey/search.do?doSearch=none');">
							<img src="/img/submenu8_off.gif" alt="거리가게 적치물 관리" id="Image10" name="Image10" height="35" border="0" onclick="javascript:clickImgFn('Image10')";
							onMouseOut="mouseOutFn()" onMouseOver="mouseOverFn('Image10','','/img/submenu8_on.gif',1)"
							onclick="clikImgNm='Image10'"style="cursor:pointer">
			            </td>
			           <td id="menu4" style="display:block;" onClick="goUrl('/jsp/menu/left/statistics.jsp','/statistics/statistics.do?mode=all');">			 
			            	<img src="/img/submenu5_off.gif" alt="통계 관리" id="Image9" name="Image9"  height="35" border="0" onclick="javascript:clickImgFn('Image9')";
							onMouseOut="mouseOutFn()" onMouseOver="mouseOverFn('Image9','','/img/submenu5_on.gif',1)"
							onclick="clikImgNm='Image9'"style="cursor:pointer">
			            </td>
			            <td id="menu5" style="display:block;" onClick="popGeoInfo();">
			    	        <img src="/img/submenu6_off.gif" alt="지리정보" id="Image15" name="Image15" height="35" border="0"  onclick="javascript:clickImgFn('Image15')";
			    	        onMouseOut="mouseOutFn()" onMouseOver="mouseOverFn('Image15','','/img/submenu6_on.gif',1)" onclick="clikImgNm='Image15'"style="cursor:pointer">
			    	    </td>
			          </tr>
				</table>
				<!--서브메뉴 끝-->
				</td>
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
								<td><a href="javascript:userUpdate('${userId}');"><img src="/img/info_mod.gif"
									alt="정보변경" width="68" height="14" border="0"></a>
									
									<a id="pwch" href="javascript:changePw();"><img 
									src="/img/changepw_mod.gif" alt="로그아웃" width="53" height="14"
									border="0"></a>
									
									
									<a href="javascript:confirmLogout();"><img
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
<div id="menu6"></div>
</form>
<script>
var grade_menu = ${grade_menu};		// 사용자 등급 점수
var org_cd = ${org_cd};				//사용자 시군구 기관 코드
var dept_cd = ${dept_cd};			//사용자 부서코드
//var grade_menu = 202;
var square = 1;
var now = 0;


for(i=8;i>0;i--){

	for(j=0;j<i;j++){		//2의 제곱값 구하기
		square =  square*2;
	}
	
	grade_menu = grade_menu - square;
	if(grade_menu>=0){  	
		document.getElementById("menu"+i).style.display = "block";
		if(i == 1 || i == 2 || i == 3 || i == 8)	
			now=i;
	}else if(grade_menu<0){				
			document.getElementById("menu"+i).style.display = "none";
			grade_menu = grade_menu + square;
	}
	square = 1;	
}
//********** BEGIN_현진_20120306
document.getElementById("menu5").style.display = "none";	
//********** END_현진_20120306
//********** BEGIN_KANG_20120417
document.getElementById("menu4").style.display = "none";	
//********** END_KANG_20120417

if(now==1){
//********** BEGIN_KANG_20120418
//goUrl('/jsp/menu/left/jumyong.jsp','/jumyong/minwon/search.do');
goUrl('/jsp/menu/left/jumyong.jsp?grade=${grade_menu}','/jumyong/minwon/search.do');
//********** END_KANG_20120418
}else if(now==2){
goUrl('/jsp/menu/left/facility.jsp','/facility/minwon/search.do');
}else if(now==3){
goUrl('/jsp/menu/left/gapan.jsp','/gapan/jumyong/search.do');
}else if(now==8){
goUrl('/jsp/menu/left/rojum.jsp','/rojum/accept/search.do');
}/*else if(now==5){
goUrl('/jsp/menu/left/statistics.jsp','/statistics/statistics.do?mode=stat');
}*/

</script>
</body>

<script type="text/javascript">

var idcheck = "${userId}";
if(idcheck != "cgpark2"){
	document.getElementById("pwch").style.display="none";
}
var insarangKey = '${insarangKey}';
if(insarangKey == ""){
	window.open("/admin/user/getInsarangKey.do", "gongji", "width=770,height=700,left=20,top=20,scrollbars=yes");
}
</script>

</html>
