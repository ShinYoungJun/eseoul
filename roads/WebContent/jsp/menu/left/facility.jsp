<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String menu_param = request.getParameter("menu_param");
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
    	if(menu_param != ""){
        	
    		document.getElementById("adminBiz").className = "leftM2";
    		document.getElementById("minwon").className = "leftM2";
			document.getElementById("jumyong").className = "leftM1";
			document.getElementById("junggi").className = "leftM2";		
			document.getElementById("saewe").className = "leftM2";
//			document.getElementById("gigan").className = "leftM2";
			
			//top.frames[1].location=url1;	왼쪽 메뉴 링크
			top.frames[2].location="/facility/jumyong/search.do";	//오른쪽 페이지 링크
    	}
    }
    
	function	menuBtn_chk(o){
		
		document.getElementById("adminBiz").className = "leftM2";
		document.getElementById("minwon").className = "leftM2";
		document.getElementById("jumyong").className = "leftM2";
		document.getElementById("junggi").className = "leftM2";
		document.getElementById("saewe").className = "leftM2";
//		document.getElementById("gigan").className = "leftM2";
		//********** BEGIN_KANG_20120416
		document.getElementById("bbs").className = "leftM2";
		//********** END_KANG_20120416					
		document.getElementById(o.id).className = "leftM1";

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
				<td height="35"><img src="/img/sub3_title.gif" alt="시설물관리" width="170" height="35"></td>
			</tr>

			<tr>
				<td align="center" valign="top" bgcolor="f8f8f8" class="leftborder">
					<!--좌측 메뉴시작-->
					<table width="150" border="0" cellspacing="0" cellpadding="0">
						<tr>
							<td height="12" colspan="2"></td>
						</tr>
						<tr>
							<td width="29px" height="27px"><img src="/img/sub_menuicon.gif" width="29px" height="27px"/></td>
							<td class="leftM1" align="left">
							<!--  //********** BEGIN_KANG_20120416 -->
							<!-- 
							<a href="/facility/adminbiz/search.do" class="leftM2" target="cont" id="adminBiz" onclick="javascript:menuBtn_chk(this);">관리업체등록</a>				
							-->
							<a href="/facility/adminbiz/search.do" class="leftM1" target="cont" id="adminBiz" onclick="javascript:menuBtn_chk(this);">관리업체등록</a>
							<!--   //********** END_KANG_20120416 -->            
							</td>
						</tr>
						<tr>
							<td height="1px" colspan="2" bgcolor="e0e0df"></td>
						</tr>     
						<tr>
							<td width="29px" height="27px"><img src="/img/sub_menuicon.gif" width="29px" height="27px"/></td>
							<td class="leftM1" align="left">
							<!--  //********** BEGIN_KANG_20120416 -->
							<!-- 
							<a href="/facility/minwon/search.do" class="leftM1" target="cont" id="minwon" onclick="javascript:menuBtn_chk(this);">민원접수 및 등록</a>
							-->
							<a href="/facility/minwon/search.do" class="leftM2" target="cont" id="minwon" onclick="javascript:menuBtn_chk(this);">민원접수 및 등록</a>
							<!--   //********** END_KANG_20120416 -->           
							</td>
						</tr>
						<tr>
							<td height="1px" colspan="2" bgcolor="e0e0df"></td>
						</tr>     
						<tr>
							<td width="29px" height="27px"><img src="/img/sub_menuicon.gif" width="29px" height="27px"/></td>
							<td class="leftM1" align="left">
							<a href="/facility/jumyong/search.do" class="leftM2" target="cont" id="jumyong" onclick="javascript:menuBtn_chk(this);">점용조회 및 관리</a>             
							</td>
						</tr>
						<tr>
							<td height="1px" colspan="2" bgcolor="e0e0df"></td>
						</tr>          
						<tr>
							<td width="29px" height="27px"><img src="/img/sub_menuicon.gif" width="29px" height="27px"/></td>
							<td class="leftM1" align="left">
							<a href="/facility/saewe/search.do" class="leftM2" target="cont" id="saewe" onclick="javascript:menuBtn_chk(this);">세외수입 관리</a>             
							</td>
						</tr> 
						<!--tr>
						<td height="1px" colspan="2" bgcolor="e0e0df"></td>
						</tr>         
						<tr>
						<td width="29px" height="27px"><img src="/img/sub_menuicon.gif" width="29px" height="27px"/></td>
						<td class="leftM1" target="cont" align="left">
						<a href="/facility/gigan/search.do" class="leftM2" target="cont" id="gigan" onclick="javascript:menuBtn_chk(this);">기간 연장</a>
						</td>
						</tr-->
						<tr>
							<td height="1px" colspan="2" bgcolor="e0e0df"></td>
						</tr>
						<tr>
							<td width="29px" height="27px"><img src="/img/sub_menuicon.gif" width="29px" height="27px"/></td>
							<td class="leftM1" align="left">
							<a href="/facility/junggi/search.do" class="leftM2" target="cont" id="junggi" onclick="javascript:menuBtn_chk(this);">정기분 관리</a>             
							</td>
						</tr>
						<tr>
							<td height="1px" colspan="2" bgcolor="e0e0df"></td>
						</tr>
						<tr>
							<td height="27"><img src="/img/sub_menuicon.gif" width="29px" height="27px"/></td>
							<td align="left"><a href="/bbs/bbs_facility.jsp" class="leftM2" target="cont" id="bbs" onClick="javascript:menuBtn_chk(this);">게시판 및 연락처 </a> </td>
						</tr>
						<tr>
							<td height="12" colspan="2"></td>
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
</table>
</body>
</html>
