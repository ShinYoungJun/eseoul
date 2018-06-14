<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>도로점용 질의회신 등록</title>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
<script language="javascript" src="/js/jquery-1.6.1.js"></script> 
</head>
<body>

<script type="text/javascript">

$( document ).ready(function() {
	var myDate = new Date();
  var years = myDate.getFullYear();

  var optionsElement = "";
  optionsElement += "<option value='"+years+"' selected='selected'>"+years+"</option>";
  
  for(var idx=parseInt(years-1); idx>2008; idx--){
	  optionsElement += "<option value='"+idx+"'>"+idx+"</option>";
  }
  
  $("#termSelect").html(optionsElement);
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
	   alert("입력 가능한 최대문자수 "+maxlen+"자(한글)을 초과했습니다. \n초과된 내용은 자동으로 삭제 됩니다.");  // match를 이용해서 영어로된 name을 한글로 변환해서 출력한다. 
	   objstr2 = objstr.substr(0, strlen);
	   objname.value = objstr2;
	  }
	  objname.focus();
}


var addfile = false;

function addFile() {
	$("#file2").css("display", "");
	$("#doc1").css("vertical-align", "baseline");
	$("#doc2").css("vertical-align", "baseline");

	if(addfile) {
		$("#file3").css("display", "");
	}
	
	addfile = true;
	//$("#file3").css("display", "");
}

</script>
<form action="jumyong_upload_inquiry.action" method="post" enctype="multipart/form-data">
<input type="hidden" name="mode" value="uploadOk">
<input type="hidden" name="name" value="${namedata.name }">
<table width="800" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td height="30"><img src="/img/sub1_cont5_title.gif" width="800" height="43"></td>
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
					<td width="689" height="22" background="/img/tab_line_blue.gif">&nbsp;</td>
				</tr>
			</table>
		</td>
	</tr>
	<tr>
		<td class="contborder_blue">
		<table>
				<tr>
					<td>
						<table width="750px;" border="2" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
						<tr>
    						<td height="28" width="100" align="center" bgcolor="e5eff8" class="sub_table_b">제&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;목</td>
    						<td colspan="3" width="660" colspan="3" bgcolor="eaeaea" class="table_bl_left">
    							<input type="text" name="title" style="width: 600px;" maxlength="100"  class="input_form1"/>
    						</td>
  						</tr>
						<tr>
    						<td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">수&nbsp;&nbsp;신&nbsp;&nbsp;처</td>
    						<td bgcolor="eaeaea" class="table_bl_left">
    							<input type="text" name="reception" id="reception" style="width: 230px;" class="input_form1"/>
    						</td>
    						<td height="28" width="100" align="center" bgcolor="e5eff8" class="sub_table_b">기&nbsp;&nbsp;안&nbsp;&nbsp;일</td>
    						<td width="300" bgcolor="eaeaea" class="table_bl_left">
    							<!--<input type="text" name="term" id="term" style="width: 230px;" class="input_form1"/> -->
    							<select name="term" style="width: 146px;" id="termSelect"></select>
    						</td>
  						</tr>
  						<tr>
  							<td height="28" width="100" align="center" bgcolor="e5eff8" id="doc1" class="sub_table_b" >문서번호</td>
    						<td width="280" bgcolor="eaeaea" id="doc2" class="table_bl_left">
    							<input type="text" name="docnum" id="docnum" style="width: 230px;" class="input_form1"/>
    						</td>
    						<td height="28" align="center" bgcolor="e5eff8" class="sub_table_b">파&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;일</td>
    						<td id="filetr" width="280" bgcolor="eaeaea" class="table_bl_left">
    							<input type="file" id="file1" name="upload1" style="width: 235px;" class="input_form1"/>
    							<a><input type="button" class="sub_table_b" style="font-size: 11px; height: 18px;" onclick="addFile();" value="추가"></a>
    							<input type="file" id="file2" name="upload2" style="width: 235px; display: none;" class="input_form1"/>
    							<input type="file" id="file3" name="upload3" style="width: 235px; display: none;" class="input_form1"/>
    						</td>
  						</tr>
  						<tr>
    						<td align="center" bgcolor="e5eff8" class="sub_table_b">내&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;용</td>
    						<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
    							<textarea name="content" cols="100" rows="30" class="input_form1"></textarea>
    						</td>
  						</tr>
					</table>
				</tr>
				<tr>
					<td height="5"></td>
				</tr>
				<tr>
  					<td align="right" colspan="2" class="sub_table_b"></td>
  				</tr>
			</table>
		</td>
	</tr>
	<tr>
		<td height="5"></td>
	</tr>
	<tr>
		<td align="right">
		<!--<input type="image" value=" 저장 " src="/img/save_icon2.gif" onclick="location.href='jumyong_upload_inquiry.action'">-->
		<input type="image" value=" 저장 " src="/img/save_icon2.gif" onclick="javascript:'form.submit()'">
		<a href="#"><img src="/img/can_icon.gif" alt="취소" width="56" height="18" border="0" onClick="location.href='jumyong_list_inquiry.action'"></a>
		</td>
	</tr>
</table>
</form>

</body>
</html>