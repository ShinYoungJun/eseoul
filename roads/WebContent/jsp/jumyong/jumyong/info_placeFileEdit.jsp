<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/include.jsp"%>
<%@ include file="/jsp/common/loginCheck.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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

.ov {
	text-decoration: underline;
	color: red;
}

.ot {
	text-decoration: none;
	color: black;
}
-->
</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">



<script>

	


	function submitClick()
	{
		var placeFileForm = document.placeFileForm;
		
		var mode = document.getElementById("mode").value;
		
		if(mode != "edit")
			document.getElementById("mode").value = "add";
			
		if(document.getElementById('ATTACH_SIZE').value == "" || document.getElementById('ATTACH_FILE').value =="")
		{
			alert("파일이 첨부되지 않았습니다.");
			return;
		}
		if( document.placeFileForm.DATA_TYPE.value == "" ){
			alert("자료유형이 선택되지 않았습니다.");
			return;
		}
		placeFileForm.submit();
	}
	
	function goDel(seqValue)
	{
		var no = document.getElementById("no").value;						//성공후 돌아올 페이지 위해
		var currentPage = document.getElementById("currentPage").value;		//성공후 돌아올 페이지 위해
		
		if(confirm("정말 삭제하시겠습니까?"))
		location.href("/jumyong/jumyong/deleteFile.do?no="+no+"&filename="+delfile+"&currentPage="+currentPage+"&seq="+seqValue);
	}
	
	
	var MaxFileCnt = 1;
	var TotalFileCnt = 0;
	var TotalFileSize = 0;
		
	var MaxSizeParam = null;
	var MaxSize = 0;
	var DefaultMaxSize = 10240000;//parseInt('<fmt:message key="attachfile.defaultfile.size"/>');	
	
	// max size 지정이 안되어있는 경우 default max size지정
	if(MaxSizeParam == null)
		MaxSize = DefaultMaxSize/1024000;
	else
		MaxSize = MaxSizeParam;
		
	var MaxNormalSize = parseInt('<fmt:message key="attachfile.maxfile.size"/>');	

		
	function remove_item(seq) {

		
		TotalFileCnt = parseInt(TotalFileCnt)-1;		
	   	document.getElementById('total_file_index').value = TotalFileCnt;	    
	    
	    scripts[seq].status = false;
	    document.getElementById('file_item'+(seq+1)).innerHTML = '';
	    item_list();
	}	

	function attach(obj) {
	    var val = obj.value;
		file_size = get_file_check(document.getElementById(obj.id).value);	
		
		if(0 == file_size)
		{
			return;
		}

		document.getElementById('ATTACH_SIZE').value = CutDecimalPoint(file_size/1024);	    
	    document.getElementById('ATTACH_FILE').value = getNoDirFileName(val);
	}
	
	function get_file_check(filename)
	{

		//먼저 확장자 체크부터 한다.
		if(false == check_fileExt(filename))
			return 0;
		
		tmpfilesize = getFileSize(filename);
		
		//파일이름 길이 체크
		if(false == check_fileNameSize(filename))
			return 0;

		/*
		if(tmpfilesize > MaxSize*1024000)
		{
			alert(MaxSize+"MB이상 파일은 첨부할 수 없습니다.");
			return 0;
		}
		
		TotalFileSize = TotalFileSize + parseInt(tmpfilesize);

		// 페이지별로 지정된 max용량 비교
		if(TotalFileSize > MaxSize*1024000)
		{
			alert("첨부파일의 총용량은 "+MaxSize+"MB이상을 초과할 수 없습니다.");
			TotalFileSize = TotalFileSize - parseInt(tmpfilesize);
			document.getElementById('ATTACH_SIZE').value = "";
			document.getElementById('ATTACH_FILE').value ="";
			return 0;
		}

		// 전체 시스템에 지정된 max용량 비교
		if(TotalFileSize > MaxNormalSize)
		{
			alert("첨부파일의 총용량은 "+MaxNormalSize+"MB이상을 초과할 수 없습니다.");
			document.getElementById('ATTACH_SIZE').value = "";
			document.getElementById('ATTACH_FILE').value ="";
			TotalFileSize = TotalFileSize - parseInt(tmpfilesize);
			return 0;
		}	
		*/
		return tmpfilesize;
	}
	
	
	function check_fileNameSize(filename){
		var path = filename.split("\\");
		var fileNameSize = path[path.length - 1].length;
		
		if(fileNameSize > 20){
			alert('파일이름이 20자를 초과할수 없습니다.');
			return false;
			
		}else{
			return true;
		}
		
	}
	
	/**
	* 첨부파일 확장자 체크
	*/
	function check_fileExt(filename)
	{
		var index = filename.lastIndexOf('.');
		fileExpan = filename.substring(parseInt(index)+1 , filename.length );
		fileExpan = fileExpan.toLowerCase();


		if(fileExpan =="jpg"||fileExpan =="gif"||fileExpan =="bmp"
			||fileExpan =="hwp"||fileExpan =="doc"||fileExpan =="xls"||fileExpan =="xlsx"||fileExpan =="txt"
			||fileExpan =="ppt"||fileExpan =="zip"||fileExpan =="wmv"||fileExpan =="mpg"
			||fileExpan =="pdf"){
			return true;
		}
		else{
//			document.getElementById("file_item1").innerHTML = '<input type="file" name="file1" id="file1" onchange="attach(this)" size="100" >';
			alert("실행파일은 첨부할수 없습니다.\n다시 선택하여 주십시오.");
			return false;
		}
		
	}			
	
	
	
	function getFileSize(filename)
	{
		return 1024*1024;
	}
	
	function getNoDirFileName(filename)
	{
		var path = filename.split("\\");
		return path[path.length - 1];		
	}
	
	
	function getFileName(seq) { 
	 return document.getElementById('file'+(seq+1)).value;
	}
	
	
	
	
	function add_item(idx, val) {

	    var seq = scripts.length;
	    var display_script = '<span id=\"display_item'+idx+'\">'+getNoDirFileName(val)+'&nbsp;&nbsp;<img src=\"/images/button/delete.gif\" align=\"absmiddle\" onclick=\"remove_item('+seq+')\" style=\"cursor:pointer\" alt=\"삭제\"><br/>';
	    var file_script = '<span id=\"file_item'+idx+'\"><input type=\"file\" name=\"file'+idx+'\" id=\"file'+idx+'\" onchange=\"attach(this)\" size=\"1\" style=\"width:0;cursor:pointer\"></span>';   
	    scripts[seq] = new make_array(true, display_script);
	    document.getElementById('file_items').insertAdjacentHTML("afterEnd", file_script);
	    
	}
	
	



	var scripts = new Array; 
	function make_array(status, display_script) {
	    this.status = status;
	    this.display_script = display_script;
	}
	
		//소수점 이하 처리 함수 ;소수점 둘째자리까지 표현 
	  function CutDecimalPoint(intTarget) {
	        var intResult = 0;
	        var strTarget = String(intTarget).split('.');
	        if(strTarget[1]!=null && strTarget[1].length > 2) {
	            strTarget[1] = strTarget[1].slice(0, 2);
	        }else{
	            strTarget[1] = "00";
	        }
	        intResult = Number(strTarget[0]+'.'+strTarget[1]);
	        return intResult;
	    } 	
	
	
		function item_list() {
	    var validate_cnt = 0;
	    var display_scripts = '';
	
	    for (var i = 0; i < scripts.length; i++) {
	        if (scripts[i].status){
	            validate_cnt++;
	            display_scripts += '<b>'+validate_cnt+'</b>. '+scripts[i].display_script;
	            

	        }
	    }
	 
		if (validate_cnt == 0)
	        display_scripts = '<img src=\"/images/common/navi_arr.gif\" align=\"absmiddle\">첨부 파일이 없습니다...';
	}
	
		function goDown(attatch_file,saved_file)
		{
			document.fileDownForm.fileName.value = trimStr(attatch_file);
			document.fileDownForm.realFileName.value = trimStr(saved_file);
			document.fileDownForm.submit();
			
		}

		function trimStr(str)
		{	
			re = / /g;
			str = str.replace(re,""); 
			return str;

		}

	

	

</script>

</head>

<body>
	<input type="hidden" id="total_file_index" name="total_file_index">
	
	<form id="fileDownForm" name="fileDownForm" method="post" action="/vodownload.do">
		<input id="fileName" name="fileName" type="hidden" >
		<input id="realFileName" name="realFileName" type="hidden" >
	</form>

	<form id="placeFileForm" name="placeFileForm" method="post" action="/jumyong/placeFileEdit.do" enctype="multipart/form-data">
		<input id="no" name="no" value="${no}" type="hidden"> 
		<input id="mode" name="mode" value="${mode}" type="hidden"> 
		<input id="seq" name="seq" value="${seq}" type="hidden"> 
		<input id="currentPage" name="currentPage" value="${currentPage}" type="hidden">

		<table width="100%">
			<tr>
				<td>
					<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse: collapse;" cellpadding="0" cellspacing="0" class="sub_table">
						<tr>
							<td height="28" colspan="7" bgcolor="#FFFFFF" class="table_bl_left">
								<span class="sub_stan_blue">*파일정보</span> &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp 총 ${listNum}건
							</td>
						</tr>
						<tr>
							<td width="5%" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">번호</td>
							<td width="15%" align="center" bgcolor="e5eff8" class="sub_table_b">자료유형</td>
							<td width="23%" align="center" bgcolor="e5eff8" class="sub_table_b">자료설명</td>
							<td width="23%" align="center" bgcolor="e5eff8" class="sub_table_b">첨부파일명</td>
							<td width="10%" align="center" bgcolor="e5eff8" class="sub_table_b">등록날짜</td>
							<td width="14%" align="center" bgcolor="e5eff8" class="sub_table_b">기능</td>
						</tr>

						<c:forEach items="${Llist}" var="board" varStatus="idx">
							<c:choose>
								<c:when test="${board.SEQ == seq}">
									<tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''">
										<td height="26" align="center">${idx.count}</td>
										<td align="center">
											<select id="DATA_TYPE" name="DATA_TYPE" class="input_form1" style="width: 90px">
												${attatched_type}
											</select>
										</td>
										<td align="center"><input name="DATA_EXPLAIN" type="text" class="input_form1" style="width: 140px" value="${board.DATA_EXPLAIN}" maxlength="150"></td>
										<td align="center">
											<input name="ATTACH_FILE" id="ATTACH_FILE" type="text" class="input_form1" style="width: 140px" value="${board.ATTACH_FILE}">
											<input id="ATTACH_SIZE" name="ATTACH_SIZE" type="hidden" class="input_form1" style="width:45px" >
										</td>
										<td align="center"><input name="REGDATE" id="REGDATE" type="hidden" class="input_form1" style="width: 55px" value="${board.REGDATE}"> 
											<span onclick="javascript:document.getElementById('file1').click();" style="cursor: pointer; position: relative; top: 10px;">
												<img src="/img/file2.gif" align="absmiddle" alt="파일첨부하기">&nbsp;파일첨부
											</span>
											<div style="width: 10; height: 16; overflow: hidden; position: relative; top: -5px; filter: alpha(opacity = 0); -moz-opacity: 0">
												<div id="file_items">
													<table width="100%" border="0" cellpadding="0" cellspacing="0">
													</table>
												</div>
												<span id="file_item1"><input type="file" id="file1" name="file1"  onchange="attach(this)" size="1" style="width: 50; cursor: pointer">
												</span>
											</div>
										</td>

										<td align="center">
											<img src="/img/can_icon.gif" alt="취소" border="0" onclick="javascript:history.back();" style="cursor: pointer"> 
											<img src="/img/save_icon2.gif" alt="저장" width="56" height="18" border="0" onClick="javascript:submitClick();" style="cursor: pointer">
										</td>
									</tr>
								</c:when>
								<c:otherwise>
									<tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''">
										<td height="26" align="center">${idx.count}</td>
										<td align="center">${board.DATA_TYPE_NAME}</td>
										<td align="center">${board.DATA_EXPLAIN}</td>
										<td align="center">
											<span style="cursor: pointer;" onmouseover="this.className='ov'" onmouseout="this.className='ot'" class="ot" onclick="goDown('${board.ATTACH_FILE}','${board.ATTACH_SAVED_FILE}')">${board.ATTACH_FILE} </span>
										</td>
										<td align="center">${rnic:addDash(board.REGDATE)}</td>
										<td align="center"><img src="/img/mod_icon2.gif" alt="수정" width="34" height="18" border="0" onClick="javascript:location.href='/jumyong/placeFileEdit.do?mode=edit&no=${no}&seq=${board.SEQ}&currentPage=${currentPage}&countPerPage=${countPerPage}'" style="cursor: pointer"> 
											<img src="/img/del_icon.gif" onClick="javascript:goDel('${board.SEQ}','${board.ATTACH_SAVED_FILE}');" alt="삭제" width="34" height="18" border="0" style="cursor: pointer">
										</td>
									</tr>
								</c:otherwise>
							</c:choose>
						</c:forEach>

					</table></td>
			</tr>
			<tr>
				<td height="40" align="center"><table width="100%" border="0" cellspacing="0" cellpadding="0">
						<tr>
							<td align="center">
								<table border="0" cellpadding="0" cellspacing="0">
									<tr>
										${strPageDivideForm}
									</tr>
								</table>
							</td>

						</tr>
						<tr>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</form>

</body>
</html>

