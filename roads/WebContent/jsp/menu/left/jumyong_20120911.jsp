<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
   <%@ include file="/jsp/common/loginCheck.jsp" %>
<%@ include file="/jsp/common/include.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String menu_param = request.getParameter("menu_param");
	//********** BEGIN_KANG_20120418
	String grade = request.getParameter("grade");
	//********** END_KANG_20120418
	if(menu_param == null){ menu_param = ""; }
%>
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
    function Init(menu_param)
    {
    	if(menu_param != "")
    	{
    		document.getElementById("minwon").className = "leftM2";
			document.getElementById("jumyong").className = "leftM1";
			document.getElementById("junggi").className = "leftM2";
			document.getElementById("saewe").className = "leftM2";
			document.getElementById("gigan").className = "leftM2";
			document.getElementById("oldminwon").className = "leftM2";
			document.getElementById("bbs").className = "leftM2";
			//********** BEGIN_KANG_20120417
			document.getElementById("statistics").className = "leftM2";
			document.getElementById("stat0").className = "leftM2";
			document.getElementById("stat1").className = "leftM2";
			document.getElementById("stat2").className = "leftM2";
			document.getElementById("stat3").className = "leftM2";
			//********** END_KANG_20120417
    	}
    }
    
	function	menuBtn_chk(o)
	{
		document.getElementById("minwon").className = "leftM2";
		document.getElementById("jumyong").className = "leftM2";
		document.getElementById("junggi").className = "leftM2";
		document.getElementById("saewe").className = "leftM2";
		document.getElementById("gigan").className = "leftM2";
		document.getElementById("oldminwon").className = "leftM2";
		document.getElementById("bbs").className = "leftM2";
		//********** BEGIN_KANG_20120417		
		if(o.id.substr(0,4) != "stat"){
			document.getElementById("statistics").className = "leftM2";
			document.getElementById("statisticsSub").style.display = "none";
			check = 0;
		}		
		document.getElementById("stat0").className = "leftM2";
		document.getElementById("stat1").className = "leftM2";
		document.getElementById("stat2").className = "leftM2";
		document.getElementById("stat3").className = "leftM2";
		//********** END_KANG_20120417
		document.getElementById(o.id).className = "leftM1";
	}
	
	//********** BEGIN_KANG_20120417
	var check = 0;
	function	subMenuClick(){
		if(check == 0){
			document.getElementById("statisticsSub").style.display = "block";
			menuBtn_chk(document.getElementById("statistics"));			
			check = 1;			
		}else{
			document.getElementById("statisticsSub").style.display = "none";			
			menuBtn_chk(document.getElementById("statistics"));	
			check = 0;
		}
	}
	//********** END_KANG_20120417

	function popGeoInfo(){
	/** 지도페이지 사이즈 **/
		  var winW = screen.availWidth - 10;	
		  var winH = screen.availHeight - 50;
		  /** 지도페이지 옵션 **/
		  var mapWinOpt = "toolbar=no,location=no,directories=no,status=yes,menubar=no,scrollbars=no,resizable=yes,left=0px,top=0px,width="+winW+"px,height="+winH+"px";
		  var mapWin = null;   
		
		var url = "/jumyong/map/MapIndex.do";
	    	mapWin = window.open(url,"mapWin",mapWinOpt);
	    	mapWin.focus();
	}
	
//]]>
</script>

<body onload="Init('<%=menu_param %>')">
<table width="200px" height="100%" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td align="center" valign="top">
		<table width="170px" height="100%" border="0" cellpadding="0" cellspacing="0">
		<tr>
			<td height="17px">&nbsp;</td>
		</tr>
		<tr>
			<td height="35px"><img src="/img/sub1_title.gif" alt="점용관리" width="170px" height="35px"></td>
		</tr>
		<tr>
			<td align="center" valign="top" bgcolor="f8f8f8" class="leftborder">
			<!--좌측 메뉴시작-->
			<table width="150px" border="0" cellspacing="0" cellpadding="0">
				<tr>
					<td height="12px" colspan="2"></td>
				</tr>
				<tr>
					<td width="29px" height="27px"><img src="/img/sub_menuicon.gif" width="29px" height="27px"/></td>
					<td align="left"><a href="/jumyong/minwon/search.do" class="leftM1" target="cont" id="minwon" onclick="javascript:menuBtn_chk(this);">민원접수 및 등록</a> </td>
				</tr>
				<tr>
					<td height="1px" colspan="2" bgcolor="e0e0df"></td>
				</tr>
				<tr>
					<td height="27px"><img src="/img/sub_menuicon.gif" width="29px" height="27px"/></td>
					<td align="left"><a href="/jumyong/jumyong/search.do" class="leftM2" target="cont" id="jumyong" onclick="javascript:menuBtn_chk(this);">점용허가 및 관리</a> </td>
				</tr>
				<tr>
					<td height="1px" colspan="2" bgcolor="e0e0df"></td>
				</tr>
				<tr>
					<td height="27px"><img src="/img/sub_menuicon.gif" width="29px" height="27px"/></td>
					<td align="left"><a href="/jumyong/saewe/search.do" class="leftM2" target="cont" id="saewe" onclick="javascript:menuBtn_chk(this);">세외수입 관리</a> </td>
				</tr>
				<tr>
					<td height="1px" colspan="2" bgcolor="e0e0df"></td>
				</tr>
				<tr>
					<td height="27px"><img src="/img/sub_menuicon.gif" width="29px" height="27px"/></td>
					<td align="left"><a href="/jumyong/gigan/search.do" class="leftM2" target="cont" id="gigan" onclick="javascript:menuBtn_chk(this);">기간 연장</a> </td>
				</tr>
				<tr>
					<td height="1px" colspan="2" bgcolor="e0e0df"></td>
				</tr>
				<tr>
					<td height="27px"><img src="/img/sub_menuicon.gif" width="29px" height="27px"/></td>
					<td align="left"><a href="/jumyong/junggi/search.do" class="leftM2" target="cont" id="junggi" onclick="javascript:menuBtn_chk(this);">정기분 관리</a> </td>
				</tr>
				<tr>
					<td height="1px" colspan="2" bgcolor="e0e0df"></td>
				</tr>
				<!--  //********** BEGIN_KANG_20120418 -->
				<tr>
					<td colspan="2" height="0">
						<div id="staticMenu" style="display:none">
							<table border="0" cellspacing="0" cellpadding="0" width="100%" align="center">
								<tr>
									<td width="29px" height="27px">
										<img src="/img/sub_menuicon.gif" width="29px" height="27px"/>
									</td>
									<td align="left">
										<a href="javascript:subMenuClick();" class="leftM2" id="statistics">통계관리</a>
									</td>
								</tr>
								<tr>
									<td height="0"></td>
									<td>
										<div id="statisticsSub" style="display:none">
											<table border="0" cellspacing="0" cellpadding="0" width="100%" align="center">
												<tr>
													<td align="left" height="20">
														<a href="/statistics/statistics.do?mode=all" class="leftM2" target="cont" id="stat0" onclick="javascript:menuBtn_chk(this);">- 전체</a>
													</td>
												</tr>
												<tr>
													<td align="left">
														<a href="/statistics/statistics.do?mode=stat" class="leftM2" target="cont" id="stat1" onclick="javascript:menuBtn_chk(this);">- 법정동별</a>
													</td>
												</tr>
												<tr>
													<td align="left" height="20">
														<a href="/statistics/statistics.do?mode=purpose" class="leftM2" target="cont"id="stat2" onclick="javascript:menuBtn_chk(this);">- 점용목적별</a>
													</td>
												</tr>
												<tr>
													<td align="left" height="20">
														<a href="/statistics/statistics.do?mode=semok" class="leftM2" target="cont" id="stat3" onclick="javascript:menuBtn_chk(this);">- 세목코드별</a>
													</td>
												</tr>
												<tr>
													<td height="5"></td>
												</tr>
											</table>
										</div>
									</td>
								</tr>
								<tr>
									<td height="1px" colspan="2" bgcolor="e0e0df"></td>
								</tr>
							</table>
						</div>	
					</td>
				</tr>
				<!--   //********** END_KANG_20120418 -->
				<tr>
					<td height="27px"><img src="/img/sub_menuicon.gif" width="29px" height="27px"/></td>
					<td align="left">
						<div id="geoInfo" onclick="javascript:menuBtn_chk(this);popGeoInfo();" style="font-family돋움;font-size:12px;color:#858585;cursor:pointer;">
						지리정보
						</div>
					</td>
				</tr>
				<tr>
					<td height="1px" colspan="2" bgcolor="e0e0df"></td>
				</tr>
				<tr>
					<td height="27px"><img src="/img/sub_menuicon.gif" width="29px" height="27px"/></td>
					<td align="left"><a href="/jumyong/oldminwon/search.do" class="leftM2" target="cont" id="oldminwon" onclick="javascript:menuBtn_chk(this);">(구)민원행정 조회 </a> </td>
				</tr>
				<tr>
					<td height="1px" colspan="2" bgcolor="e0e0df"></td>
				</tr>
				<tr>
					<td height="27px"><img src="/img/sub_menuicon.gif" width="29px" height="27px"/></td>
					<td align="left"><a href="/bbs/bbs_jumyong.jsp" class="leftM2" target="cont" id="bbs" onClick="javascript:menuBtn_chk(this);">게시판 및 연락처 </a> </td>
				</tr>
				<tr>
					<td height="12px" colspan="2"></td>
				</tr>
			</table>
			<!--좌측 메뉴시작-->
			</td>
		</tr>
	</table>
	</td>
</tr>
<tr>
	<td height="174" align="center" valign="bottom">
		<!--좌측하단 배너-->
		<table border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td><a href="http://98.33.4.164" target="_blank"><img src="/img/left_banner1.gif" alt="서울시세외수입종합징수시스템" width="176" height="58" border="0"></a></td>
			</tr>
			<tr>
				<td><a href="http://98.33.5.30" target="_blank"><img src="/img/left_banner2.gif" alt="서울시민원행정정보시스템" width="176" height="47" border="0"></a></td>
			</tr>
			<tr>
				<td><a href="http://98.33.1.136:8080" target="_blank"><img src="/img/left_banner3.gif" alt="민원처리온라인공개시스템" width="176" height="52" border="0"></a></td>
			</tr>
			<!--  //********** BEGIN_KANG_21020524 -->
			<tr>
				<td><a href="http://www.juso.go.kr/openIndexPage.do" target="_blank"><img src="/img/left_banner_juso.gif" alt="도로명주소 안내시스템" border="0"></a></td>
			</tr>
			<!--   //********** END_KANG_21020524 -->
		</table>
		<!--좌측하단 배너 끝-->
	</td>
</tr>
<!--관련사이트-->
<!-- 
	<tr>
		<td height="60" align="center">
		<select name="select2" class="related" style="width:170px; background:f1f2f2">
		<option selected>관련사이트</option>
		</select>
		</td>
	</tr>
-->
<!--관련사이트 끝-->
</table>
<!--  //********** BEGIN_KANG_20120418 -->
<script>
var grade_menu = <%=grade%>;		// 사용자 등급 점수
var org_cd = ${org_cd};			//사용자 시군구 기관 코드
var dept_cd = ${dept_cd};			//사용자 부서코드
var square = 1;
var now = 0;
for(i=8;i>0;i--){

	for(j=0;j<i;j++){		//2의 제곱값 구하기
		square =  square*2;
	}
	
	grade_menu = grade_menu - square;
	if(grade_menu>=0){
		if(i == 4)	
			document.getElementById("staticMenu").style.display = "block";
	}
	square = 1;	
}
</script>
<!--   //********** END_KANG_20120418 -->


</body>
</html>
