<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title></title>
<style type="text/css">
<!--
body {
	margin: 0px;
	background-image: url(/img/left_back.gif);
}
-->
</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
<script language="javascript" src="/js/jquery-1.6.1.js"></script> 
<script type="text/javascript">

$( document ).ready(function() {
	var myDate = new Date();
	var years = myDate.getFullYear();
	
	var optionsElement = "";
	optionsElement += "<option value='"+years+"' selected='selected'>"+years+"</option>";
	  
	for(var idx=parseInt(years-1); idx>2008; idx--){
		optionsElement += "<option value='"+idx+"'>"+idx+"</option>";
	}
	  
	$("#term").html(optionsElement);
});

function checkLength(objname, maxlength) {
	  var objstr = objname.value; // 입력된 문자열을 담을 변수 
	  var objstrlen = objstr.length; // 전체길이
	  // 변수초기화 
	  var maxlen = maxlength; // 제한할 글자수 최대크기 
	  var i = 0; // for문에 사용 
	  var bytesize = 0; // 바이트크기 
	  var strlen = 0; // 입력된 문자열의 크기
	  var onechar = ""; // char단위로 추출시 필요한 변수 
	  var objstr2 = ""; // 허용된 글자수까지만 포함한 최종문자열
	  // 입력된 문자열의 총바이트수 구하기
	  for (i = 0; i < objstrlen; i++) {
	   // 한글자추출 
	   onechar = objstr.charAt(i);
	   if (escape(onechar).length > 4) {
	    bytesize += 2; // 한글이면 2를 더한다. 
	   } else {
	    bytesize++; // 그밗의 경우는 1을 더한다.
	   }
	   if (bytesize <= maxlen) { // 전체 크기가 maxlen를 넘지않으면 
	    strlen = i + 1; // 1씩 증가
	   }
	  }
	  // 총바이트수가 허용된 문자열의 최대값을 초과하면 
	  if (bytesize > maxlen) {
	   alert("입력 가능한 최대문자수 "+maxlen+"자(영문)을 초과했습니다. \n초과된 내용은 자동으로 삭제 됩니다.");  // match를 이용해서 영어로된 name을 한글로 변환해서 출력한다. 
	   objstr2 = objstr.substr(0, strlen);
	   objname.value = objstr2;
	  }
	  objname.focus();
	 }
</script>
</head>

<body>
<form id="form" action="jumyong_update_inquiry.action" method="post" enctype="multipart/form-data">
<input type="hidden" name="mode" value="uploadOk">
<input type="hidden" name="sid" value="${dto.sid }">
<input type="hidden" name="saveFileName" value="${dto.saveFileName }">
<table width="800" border="0" cellpadding="0" cellspacing="0">

	<tr>
		<td height="43"><img src="/img/sub1_cont5_title.gif" width="800" height="43"></td>
	</tr>
	<tr>
        <td height="14"></td>
    </tr>
	<tr>
		<td>
			<table border="0" cellpadding="0" cellspacing="0">
				<tr>
					<td><img src="/img/sub_inquiry_title_on.gif" width="110" height="22"></td>
					<td width="1" background="/img/tab_line_blue.gif"></td>
					<td width="689" hight="22" background="/img/tab_line_blue.gif">&nbsp;</td>
				</tr>
			</table>
		</td>
	</tr>
	<tr>
		<td class="contborder_blue">
		<table>
				<tr>
					<td>
						<table width="760" border="2" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
							<tr>
								<td height="28" width="100" align="center" bgcolor="e5eff8" class="sub_table_b">제&nbsp;&nbsp;목</td>
								<td width="660" colspan="3" bgcolor="eaeaea" class="table_bl_left">
									<input type="text" name="title" value="${dto.title }" size="92" maxlength="100" class="input_form1"/>
								</td>
							</tr>
							<tr>
								<td height="28" width="80" align="center" bgcolor="e5eff8" class="sub_table_b">수&nbsp;신&nbsp;처</td>
								<td width="30" bgcolor="eaeaea" class="table_bl_left">
									<input type="text" name="reception" value="${dto.reception }" size="45" maxlength="100" class="input_form1"/>
								</td>
								<td height="28" width="80" align="center" bgcolor="e5eff8" class="sub_table_b">기안일</td>
								<td width="30" bgcolor="eaeaea" class="table_bl_left">
									<select name="term" id="term" style="width: 146px;"></select>
								</td>
							</tr>
							<tr id="files1">
								<td height="28" width="100" align="center" bgcolor="e5eff8" class="sub_table_b">파&nbsp;&nbsp;일</td>
								<td width="330" bgcolor="eaeaea" class="table_bl_left"><input type="file" name="upload1" class="input_form1"/></td>
								<td height="28" width="100" align="center" bgcolor="e5eff8" class="sub_table_b">첨부파일1</td>
								<td width="330px" style="word-break:break-all" bgcolor="eaeaea" class="table_bl_left" align="center" name="originalFileName">${dto.originalFileName1}</td>
							</tr>
							<tr id="files2" style="display: none;">
								<td height="28" width="100" align="center" bgcolor="e5eff8" class="sub_table_b">파&nbsp;&nbsp;일</td>
								<td width="330" bgcolor="eaeaea" class="table_bl_left"><input type="file" name="upload2" class="input_form1"/></td>
								<td height="28" width="100" align="center" bgcolor="e5eff8" class="sub_table_b">첨부파일2</td>
								<td width="330px" style="word-break:break-all" bgcolor="eaeaea" class="table_bl_left" align="center" name="originalFileName">${dto.originalFileName2}</td>
							</tr>
							<tr id="files3" style="display: none;">
								<td height="28" width="100" align="center" bgcolor="e5eff8" class="sub_table_b">파&nbsp;&nbsp;일</td>
								<td width="330" bgcolor="eaeaea" class="table_bl_left"><input type="file" name="upload3" class="input_form1"/></td>
								<td height="28" width="100" align="center" bgcolor="e5eff8" class="sub_table_b">첨부파일3</td>
								<td width="330px" style="word-break:break-all" bgcolor="eaeaea" class="table_bl_left" align="center" name="originalFileName">${dto.originalFileName3}</td>
							</tr>
							<tr>
								<td height="28" width="80" align="center" bgcolor="e5eff8" class="sub_table_b">문서&nbsp;&nbsp;번호</td>
								<td width="300" colspan="3" bgcolor="eaeaea" class="table_bl_left">
									<input type="text" name="docnum" value="${dto.docnum }" size="45" maxlength="100" class="input_form1"/>
								</td>
							</tr>
							<tr>
								<td height="170" align="center" bgcolor="e5eff8" class="sub_table_b">내&nbsp;&nbsp;용</td>
								<td bgcolor="eaeaea" colspan="3" class="table_bl_left"><textarea name="content" cols="100" rows="30" class="input_form1">${dto.content }</textarea></td>
							</tr>
						</table>
						</td>
				</tr>
				<tr>
					<td height="5"></td>
				</tr>
				<tr>
  					<td align="right" colspan="2" class="sub_table_b"></td>
  				</tr>
  			</table>	
		<!--   //********** END_현진_20120219 -->
			
  			<tr>
				<td height="5"></td>
			</tr>
			<tr>
				<td align="right">
					<input type="image" value="수정 " src="/img/mod_icon.gif">
					<a href="#"><img src="/img/can_icon.gif" alt="취소" width="56" height="18" border="0" onclick="location.href='jumyong_content_inquiry.action?sid=${dto.sid }'"></a>
				</td>
			</tr>
		</td>
	</tr>
</table>
</form>
</body>

<script type="text/javascript">
	var term = "${dto.term }";
	document.getElementById("term").value = term;

	var originalFileName1 = "${dto.originalFileName1}";
	var originalFileName2 = "${dto.originalFileName2}";
	var originalFileName3 = "${dto.originalFileName3}";

	var originalFileName = ["${dto.originalFileName1}", "${dto.originalFileName2}", "${dto.originalFileName3}"];

	if(originalFileName[1] != "") {
		$("#files2").css("display", "");
	}

	if(originalFileName[2] != "") {
		$("#files3").css("display", "");
	}
</script>

</html>