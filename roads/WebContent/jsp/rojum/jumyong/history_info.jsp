<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="/jsp/common/loginCheck.jsp"%>
<%@ include file="/jsp/common/include.jsp"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />

<title>::::: 서울시 도로점용관리시스템 :::::</title>
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
<script language="javascript" src="/js/calculation.js"></script>
<script language="javascript" src="/js/PopupCalendar.js"></script>
<script language="javascript" src="/js/Ajax_request.js"></script>
<script language="javascript" src="/js/Check_inputbox.js"></script>
<script language="javascript" src="/jsp/RexServer/rexscript/rexpert.js"></script>
<script language="javascript"
	src="/jsp/RexServer/rexscript/rexpert_properties.js"></script>

<script type="text/javascript">
	//         

	function iFrameResize(obj) {
		var iFrm = obj;
		var the_height = iFrm.contentWindow.document.body.scrollHeight;
		iFrm.style.height = the_height + "px";
	}

	function Init() {
		historyBack = document.referrer;

	}

	var historyBack = '';
	var w, h;
	var max_w = 150; //창의 가로크기, 이미지의 최대 크기가 된다.
	img_src = "${filePath }${jumin.OWNER_IMG_NAME}"; //이미지의 주소, img1의 src속성과 같아야 한다.

	function img_resize()
	{
		var i = eval(document.all.img1);
	 	w = i.width;
	 	h = i.height;
		if(w > max_w)
	 	{
	  		i.width = max_w;
	 	}
	}
	
	function 	Tab_Img(Tab_Value)
	{
		var	img2	= document.getElementById("unyong_img");
		var	img4	= document.getElementById("jumji_img");
	
		img2.src	= "/img/sub_gapan_title4_off.gif";
		img4.src	= "/img/sub_petition_title10_off.gif";
		
		if(Tab_Value	== "unyong")
		{
			img2.src		= "/img/sub_gapan_title4_on.gif";
		}
		else if(Tab_Value	== "jumji")
		{
			img4.src		= "/img/sub_petition_title10_on.gif";
		}

		var tab	= document.getElementById("CURRENT_TABUP");

		tab.value	= Tab_Value;
	}

	function Tab_Unyong(gapanno) {
		var tab = document.getElementById("CURRENT_TABUP");
		var section = document.getElementById("SECTION").value;

		if (tab.value == "unyong")
			return;
		else
			tab.value = "unyong";

		var tabs = document.getElementById("tabUp");
		tabs.src = "/rojum/jumyonginfo/unyong_view.do?GAPAN_NO=" + gapanno
				+ "&SECTION=" + section;
	}

	function Tab_Jumji(gapanno) {
		var tab = document.getElementById("CURRENT_TABUP");

		if (tab.value == "jumji")
			return;
		else
			tab.value = "jumji";

		var tabs = document.getElementById("tabUp");
		tabs.src = "/rojum/jumyonginfo/jumji_view.do?GAPAN_NO=" + gapanno;
	}

	function PopupDisUse() {
		if (document.getElementById("DlgDisuse").style.display == "none") {
			document.getElementById("DisFrm").src = "/rojum/jumyong/disUse.do?ADMIN_NO=${GAPAN_NO}&SECTION=${section}";
			MessageDisplay('DlgDisuse', 'DlgDisuseMain', 1);
		} else {
			MessageDisplay('DlgDisuse', 'DlgDisuseMain', 0);
		}
	}

	//
</script>

<body onload="Init();">
	<form id="form" name="form" method="post">
		<input type="hidden" id="GAPAN_NO" name="GAPAN_NO" value="${GAPAN_NO}">
		<input id="SECTION" name="SECTION" value="${section}" type="hidden">
		<input type="hidden" id="CURRENT_TABUP" name="CURRENT_TABUP" value="minwon"> 
		<input type="hidden" id="CURRENT_TABDOWN" name="CURRENT_TABDOWN" value="product"> 
		<div id="DlgDisuse" style="position: absolute;display: none;">
			<table id="DlgDisuseMain" width="500" height="100px" border="2" bordercolor="#f05175" style="border-collapse: collapse; background-color: white;" cellpadding="0" cellspacing="0" class="sub_table">
				<tr>
					<td height="20px" align="center">
						<font color="red">
							닫으실려면 폐쇄버튼을 다시 눌러주세요.
						</font>
					</td>
				</tr>
				<tr>
					<td align="center">
						<table width="510" height="90px" border="0" style="border-collapse: collapse; background-color: white;" cellpadding="0" cellspacing="0" class="sub_table">
							<tr>
								<td align="center">
									<iframe width="100%" height="100%" id="DisFrm" name="DisFrm" align="middle" frameborder="0" onload="iFrameResize(this)" scrolling="no"></iframe>
								</td>
							</tr>
						</table>
					</td>
				</tr>
			</table>
		</div>

		<table width="800" border="0" cellpadding="0" cellspacing="0">
			<tr>
				<td height="43">
					<img src="/img/sub7_cont1_title.gif" width="800" height="43">
				</td>
			</tr>

			<tr>
				<td align="center">
					<table width="780" border="0" cellspacing="0" cellpadding="0">
						<tr>
							<td height="1" bgcolor="eaeaea"></td>
						</tr>

						<tr>
							<td height="14"></td>
						</tr>
						<tr>
							<td align="right" class="sub_table_b">관리번호 : ${GAPAN_NO}</td>
						</tr>
						<tr>
							<td align="left">
								<table width="780" border="0" cellspacing="0" cellpadding="0">
									        <tr>
								            <td height="22" background="/img/tab_line_purple.gif">
								            <table border="0" cellspacing="0" cellpadding="0">
								                <tr>                 
								                  <td width="111"><a href="javascript:Tab_Jumji('${GAPAN_NO}')"><img id="jumji_img" name="jumji_img" src="/img/sub_petition_title10_off.gif" alt="시설/운영 정보" width="110" height="22" border="0"></a></td>
								                  <td width="111"><a href="javascript:Tab_Unyong('${GAPAN_NO}')"><img id="unyong_img" name="unyong_img" src="/img/sub_gapan_title4_off.gif" alt="운영자 정보" width="110" height="22" border="0"></a></td>
								                </tr>
								            </table>
								            </td>
										</tr>
									  <tr>
										<td>
										  	<iframe width="100%" height="100%" id="tabUp" name="tabUp" frameborder="0" onload="iFrameResize(this)" scrolling="no" src="/rojum/jumyonginfo/unyong_view.do?GAPAN_NO=${GAPAN_NO}&SECTION=${use_section}"></iframe>
										</td>
									  </tr>
									<tr>
										<td height="60" align="right">
											<img src="/img/popup_disuse.gif" alt="폐쇄처리" border="0" onclick="javascript:PopupDisUse();" style="cursor: pointer">
											<img src="/img/list_icon.gif" alt="리스트" width="66" height="22" border="0" onclick="history.back();" style="cursor: pointer">
										</td>
									</tr>
									<tr>
										<td height="22" background="/img/tab_line_blue.gif">
											<table border="0" cellspacing="0" cellpadding="0">
												<tr>
													<td width="111">
														<img src="/img/sub_rojum_title1_on.gif" alt="이력조회" width="110" height="22" border="0">
													</td>
												</tr>
											</table>
										</td>
									</tr>
									<tr>
										<td>
											<iframe width="100%" height="100%" id="tabDown" name="tabDown" frameborder="0" onload="iFrameResize(this)" scrolling="no" src="/rojum/jumyong/owner_history.do?GAPAN_NO=${GAPAN_NO}&SECTION=${use_section}"></iframe>
										</td>
									</tr>
								</table></td>
						</tr>
					</table></td>
			</tr>
		</table>






	</form>

</body>
</html>