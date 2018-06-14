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
			document.getElementById("survey").className = "leftM2";
			document.getElementById("jumyong").className = "leftM2";
			document.getElementById("saewe").className = "leftM2";
			document.getElementById("minwon").className = "leftM2";
			document.getElementById("owner").className = "leftM2";
			document.getElementById("statistics").className = "leftM2";
			//********** BEGIN_현진_20120222
			document.getElementById("bbs").className = "leftM2";
			document.getElementById("misunap").className = "leftM2";
			//********** END_현진_20120222
			document.getElementById(menu_param).className = "leftM1";

		}else{
			document.getElementById("survey").className = "leftM1";
			document.getElementById("jumyong").className = "leftM2";
			document.getElementById("saewe").className = "leftM2";
			document.getElementById("minwon").className = "leftM2";
			document.getElementById("owner").className = "leftM2";
			//********** BEGIN_현진_20120222
			document.getElementById("bbs").className = "leftM2";
			document.getElementById("misunap").className = "leftM2";
			//********** END_현진_20120222
			document.getElementById("statistics").className = "leftM2";
		}
	}

	function	menuBtn_chk(o)
	{
		document.getElementById("survey").className = "leftM2";
		document.getElementById("jumyong").className = "leftM2";
		document.getElementById("saewe").className = "leftM2";
		document.getElementById("minwon").className = "leftM2";
		document.getElementById("owner").className = "leftM2";
		document.getElementById("statistics").className = "leftM2";
		//********** BEGIN_현진_20120222
		document.getElementById("bbs").className = "leftM2";
		document.getElementById("misunap").className = "leftM2";
		//********** END_현진_20120222		

		document.getElementById(o.id).className = "leftM1";
	}

	function popGeoInfo()
	{

	/** 지도페이지 사이즈 **/
		  var winW = screen.availWidth - 10;	
		  var winH = screen.availHeight - 50;
		  /** 지도페이지 옵션 **/
		  var mapWinOpt = "toolbar=no,location=no,directories=no,status=yes,menubar=no,scrollbars=no,resizable=yes,left=0px,top=0px,width="+winW+"px,height="+winH+"px";
		  var mapWin = null;   
		
		var url = "/rojum/map/MapIndex.do";
	    	mapWin = window.open(url,"mapWin",mapWinOpt);
	    	mapWin.focus();
	}
	

//]]>
</script>

<body onload="Init('<%=menu_param%>')">
<table width="200px" height="100%" border="0" cellpadding="0"	cellspacing="0">
	<tr>
		<td align="center" valign="top">
		<table width="170px" height="100%" border="0" cellpadding="0" cellspacing="0">
			<tr>
				<td height="17">&nbsp;</td>
			</tr>
			<tr>
				<td height="35"><img src="/img/sub7_title.gif" alt="거리가게 적치물 관리" width="170" height="35"></td>
			</tr>

			<tr>
				<td align="center" valign="top" bgcolor="f8f8f8" class="leftborder">
				<table width="150" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td height="12" colspan="2"></td>
					</tr>				
					<tr>
						<td height="27px">
							<img src="/img/sub_menuicon.gif" width="29px" height="27px" />
						</td>
						<td align="left">
							<a href="/rojum/survey/search.do" class="leftM1" target="cont" id="survey" onClick="javascript:menuBtn_chk(this);">
								실태조사
							</a>
						</td>
					</tr>
					<tr>
						<td height="1px" colspan="2" bgcolor="e0e0df"></td>
					</tr>
					<tr>
						<td height="27px">
							<img src="/img/sub_menuicon.gif" width="29px" height="27px" />
						</td>
						<td align="left">
							<a href="/rojum/jumyong/search.do" class="leftM2" target="cont" id="jumyong" onClick="javascript:menuBtn_chk(this);">
								수거 / 계도 / 산출
							</a>
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
							<a href="/rojum/saewe/search.do" class="leftM2" target="cont" id="saewe" onclick="javascript:menuBtn_chk(this);">
								부과 관리 및 수납
							</a>
						</td>
					</tr>
					<tr>
						<td height="1px" colspan="2" bgcolor="e0e0df"></td>
					</tr>
					<!--  //********** BEGIN_현진_20120222 -->
					<tr>
						<td height="27px">
							<img src="/img/sub_menuicon.gif" width="29px" height="27px"/>
						</td>
						<td align="left">
							<a href="/rojum/saewe/misunap.do" class="leftM2" target="cont" id="misunap" onclick="javascript:menuBtn_chk(this);">
								미수납과태료 조회
							</a>
						</td>
					</tr>
					<tr>
						<td height="1px" colspan="2" bgcolor="e0e0df"></td>
					</tr>
					<!--   //********** END_현진_20120222 -->			
					
					
					<tr>
						<td height="27px">
							<img src="/img/sub_menuicon.gif" width="29px" height="27px" />
						</td>
						<td align="left">
							<a href="/rojum/minwon/search.do" class="leftM2" target="cont" id="minwon" onClick="javascript:menuBtn_chk(this);">
								민원현황관리
							</a>
						</td>
					</tr>
					<tr>
						<td height="1px" colspan="2" bgcolor="e0e0df"></td>
					</tr>
					<tr>
						<td height="27px">
							<img src="/img/sub_menuicon.gif" width="29px" height="27px" />
						</td>
						<td align="left">
							<a href="/rojum/owner/search.do" class="leftM2" target="cont" id="owner" onClick="javascript:menuBtn_chk(this);">
								고발 / 전업지원
							</a>
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
							<a href="/rojum/statistics/statistics.do" class="leftM2" target="cont" id="statistics" onclick="javascript:menuBtn_chk(this);">
								통계관리
							</a>
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
   				         <td align="left"><a href="/bbs/bbs_rojum.jsp" class="leftM2" target="cont" id="bbs" onClick="javascript:menuBtn_chk(this);">게시판 및 연락처 </a> </td>
   				       </tr>
    			      <tr>
						<td height="12px" colspan="2"></td>
					</tr>
				</table>
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
    <!-- sungh83 20131129 -->
		<tr><td height ='3'></td>
		</tr>
		<tr>
			<td><a href="http://road.cpermit.go.kr/cap/discussion/index.jsp" target="_blank"><img src="/img/left_banner_roadinfo.gif" alt="도로점용정보마당 안내시스템" border="0"></a></td>
		</tr>
		<!-- sungh83 20131129 -->    
    </table>
<!--좌측하단 배너 끝-->
    </td>
  </tr>
	<tr>
		<td height="174px" align="center" valign="bottom"></td>
	</tr>

	<tr>
		<td height="60px" align="center">
	</tr>
</table>
</body>
</html>
