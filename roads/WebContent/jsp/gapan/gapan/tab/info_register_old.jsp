<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/loginCheck.jsp" %>
<%@ include file="/jsp/common/include.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />

<title>::::: ����� ������������ý��� :::::</title>
<style type="text/css">
<!--
body {
	margin: 0px;
	background-image: url/img/left_back.gif);
}
-->
</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
</head>
<script language="javascript" src="/js/PopupCalendar.js"></script>
<script language='JavaScript' src='/js/Check_inputbox.js'></script>
<script language="javascript" src="/js/Ajax_request.js"></script>
<script language='JavaScript' src='/jsp/gapan/gapan/tab/info_register.js'></script>

<script type="text/javascript">
//<![CDATA[
	function file_browse1()
	{
		document.form.OWNER_IMG.click();
		alert(document.form.OWNER_IMG.value);
		//document.form.OWNER_TEXT1.value = document.form.OWNER_IMG.value;
	}
	
	function file_browse2()
	{
		document.form.PARTN_IMG.click();
		alert(document.form.PARTN_IMG.value);
		//document.form.PARTN_TEXT1.value = document.form.PARTN_IMG.value;
	}
	
	//Ŭ���� �ź��� Ȯ�� üũ �� ����
	function click_idchk(obj)
	{
		if(obj.checked == true)
		{
			obj.value = "1";
		}
		else
		{
			obj.value = "0";
		}
	}
	
	//���Ͼ��ε� ã�ƺ��� ��ư ����
	function ChangeImg()
	{
	//     var fileName = document.sender.file.value; //�ϴ� �ּҺκ��� �ּ�ó��
		newImg = new Image(); //�̹��� ��ü ����
		imgFileSize = ""; 
		newImg.src = "";
		maxFileSize = 150*200;
		newImg.src = document.getElementById("file1").value
		var imgpath = document.form.OWNER_IMG.value;
		document.all["tblview"].style.backgroundImage="url(" + imgpath + ")";
		document.all["tblview"].style.backgroundRepeat="no-repeat";
		imgFileSize = newImg.fileSize;
	}
	
	//���Ͼ��ε� ã�ƺ��� ��ư ����
	function ChangeImg2()
	{
	//  var fileName = document.sender.file.value; //�ϴ� �ּҺκ��� �ּ�ó��
		newImg = new Image(); //�̹��� ��ü ����
		imgFileSize = ""; 
		newImg.src = "";
		maxFileSize = 150*200;
		newImg.src = document.getElementById("file2").value
		var imgpath = document.form.PARTN_IMG.value;
		document.all["tblview2"].style.backgroundImage="url(" + imgpath + ")";
		document.all["tblview2"].style.backgroundRepeat="no-repeat";
		imgFileSize = newImg.fileSize;
	}
	
	//���Ͼ��ε� ã�ƺ��� ��ư ����
	function ChangeImg3()
	{
	//  var fileName = document.sender.file.value; //�ϴ� �ּҺκ��� �ּ�ó��
		newImg = new Image(); //�̹��� ��ü ����
		imgFileSize = ""; 
		newImg.src = "";
		maxFileSize = 150*200;
		newImg.src = document.getElementById("file3").value
		var imgpath = document.form.SHOP_IMG.value;
		document.all["tblview3"].style.backgroundImage="url(" + imgpath + ")";
		document.all["tblview3"].style.backgroundRepeat="no-repeat";
		imgFileSize = newImg.fileSize;
	}

	//���� ��ư �� üũ ��ư�� �׵θ� ���ִ� �Լ�
	function RemoveOutline()
	{
		for(i=0;i<document.getElementsByTagName("input").length;i++)
		{
			objinput = document.getElementsByTagName("input");
			if(objinput[i].type == "radio" || objinput[i].type == "checkbox")
			{
				objinput[i].style.border = 0;
			}
		}
	}
	
	function jumyongZibun(SIDO, SIGU_CD){
		alert(SIDO);
		alert(SIGU_CD);
		alert(document.form.BJ_CD.value);
		alert(document.form.SPC_CD.value);
		alert(document.form.BONBUN.value);
		alert(document.form.BUBUN.value);
	}
	
	//###################################################################################################################
	function attach(obj) {
		
	    var val = obj.value;
	    //alert(obj.id);
	    //alert(document.getElementById(obj.id).value);	    
		file_size = get_file_check(document.getElementById(obj.id).value);	
		
		if(0 == file_size)
		{
			alert(file_size);
			alert(document.getElementById('file1').value);
			return;
		}

		document.getElementById('ATTACH_SIZE').value = CutDecimalPoint(file_size/1024);	    
	    document.getElementById('ATTACH_FILE').value = getNoDirFileName(val);
	}
	
	function get_file_check(filename)
	{
		
		//���� Ȯ���� üũ���� �Ѵ�.
		if(false == check_fileExt(filename))
			return 0;
		
		tmpfilesize = getFileSize(filename);

		if(tmpfilesize > MaxSize*1024000)
		{
			alert(MaxSize+"MB�̻� ������ ÷���� �� �����ϴ�.");
			return 0;
		}
		
		TotalFileSize = TotalFileSize + parseInt(tmpfilesize);

		// ���������� ������ max�뷮 ��
		if(TotalFileSize > MaxSize*1024000)
		{
			alert("÷�������� �ѿ뷮�� "+MaxSize+"MB�̻��� �ʰ��� �� �����ϴ�.");
			TotalFileSize = TotalFileSize - parseInt(tmpfilesize);
			document.getElementById('ATTACH_SIZE').value = "";
			document.getElementById('ATTACH_FILE').value ="";
			alert("aaaa");
			return 0;
		}

		// ��ü �ý��ۿ� ������ max�뷮 ��
		if(TotalFileSize > MaxNormalSize)
		{
			alert("÷�������� �ѿ뷮�� "+MaxNormalSize+"MB�̻��� �ʰ��� �� �����ϴ�.");
			document.getElementById('ATTACH_SIZE').value = "";
			document.getElementById('ATTACH_FILE').value ="";
			alert("aaaa");
			TotalFileSize = TotalFileSize - parseInt(tmpfilesize);
			return 0;
		}	
		
		return tmpfilesize;
	}
	
	//�Ҽ��� ���� ó�� �Լ� ;�Ҽ��� ��°�ڸ����� ǥ�� 
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
    
    function getNoDirFileName(filename)
	{
		var path = filename.split("\\");
		return path[path.length - 1];		
	}
	
	/**
	* ÷������ Ȯ���� üũ
	*/
	function check_fileExt(filename)
	{
		var index = filename.lastIndexOf('.');
		fileExpan = filename.substring(parseInt(index)+1 , filename.length );
		fileExpan = fileExpan.toLowerCase();

		//||fileExpan =="hwp"||fileExpan =="doc"||fileExpan =="xls"||fileExpan =="txt"||fileExpan =="ppt"||fileExpan =="zip"||fileExpan =="wmv"||fileExpan =="mpg"||fileExpan =="pdf"
		if(fileExpan =="jpg"||fileExpan =="gif"||fileExpan =="bmp"){
			return true;
		}
		else
		{
//			document.getElementById("file_item1").innerHTML = '<input type="file" name="file1" id="file1" onchange="attach(this)" size="100" >';
			alert("�̹��� ������ �ƴϸ� ÷���Ҽ� �����ϴ�.\n�ٽ� �����Ͽ� �ֽʽÿ�.");
			return false;
		}
	
	}
	
	/**
	* ÷������ ������ üũ
	*/
	function getFileSize(filename)
	{
		//alert(filename);
		if(navigator.userAgent.indexOf('MSIE') > 0 && navigator.appVersion.indexOf('MSIE 7.') > 0)
		{
			//alert('11');
		 ����// MSIE 7�� ���
		  	var fso = new ActiveXObject("Scripting.FileSystemObject");
		  	//alert('22');
		  	var f = fso.GetFile(filename);
		  	var fileSize = f.size;
		  	f = null;
		  	fso = null; 
		 	return fileSize;
		}		
		else
		{
			var fso = new ActiveXObject("Scripting.FileSystemObject");
			var f = fso.GetFile(filename);
			var fileSize = f.size;
			f = null;
			fso = null; 
			
			return fileSize;��
		 ��// MSIE 7 ������ ���
		��/*��var img = new Image();
			img.dynsrc = filename;
			tmpfilesize = img.fileSize;	
			return tmpfilesize;
		*/
		}
	}		
	//###################################################################################################################
//]]>
</script>


<body>

<form name="form" method="post">
<input type="hidden" name="UserType">
<input type="hidden" name="UserSection">
<input type="hidden" name="PURPOSE_CD" value="${PURPOSE_CD}">
<input type="hidden" name="MIN_CHECK" value="${MIN_CHECK}">
<input type="hidden" name="MIN_PROCESS" value="${MIN_PROCESS}">
<input type="hidden" name="GIGAN1" value="${GIGAN1}">
<input type="hidden" name="GIGAN2" value="${GIGAN2}">
<input type="hidden" name="MIN_NAME" value="${MIN_NAME}">
<input type="hidden" name="MIN_REQNO" value="${MIN_REQNO}">
<input type="hidden" name="NOWTAB" value="0">
<input type="hidden" name="X_COORD" value="${X_COORD}">
<input type="hidden" name="Y_COORD" value="${Y_COORD}" >
<input type="hidden" name="WITH_PNU" value="${WITH_PNU}">
<input name="ATTACH_FILE" id="ATTACH_FILE" type="hidden" class="input_form1" style="width:140px" >
<input name="ATTACH_SIZE" id="ATTACH_SIZE" type="hidden" class="input_form1" style="width:45px" >

<table width="800" border="0" cellpadding="0" cellspacing="0">
<tr>
	<td align="left">
		<table width="780" border="0" cellspacing="0" cellpadding="0">
   		<tr>
         		<td height="22" background="/img/tab_line_purple.gif"><table border="0" cellspacing="0" cellpadding="0">
				<tr>
				<ul id="tabmenu">
					<td width="111"><a><img src="/img/sub_petition_title9_on.gif" alt="�ο�����" width="110" height="22" border="0" onClick="Init();" style="CURSOR: Hand;"></a></td>
					<td width="111"><a><img src="/img/sub_gapan_title4_on.gif" alt="��� ����" width="110" height="22" border="0" onClick="Init(); " style="CURSOR: Hand;"></a></td>
					<td width="111"><a><img src="/img/sub_petition_title3_off.gif" alt="������ ����" width="110" height="22" border="0" onClick="Init();" style="CURSOR: Hand;"></a></td>
					<td width="111"><a><img src="/img/sub_petition_title10_off.gif" alt="�ü�/� ����" width="110" height="22" border="0" onClick="Init();" style="CURSOR: Hand;"></a></td>
				</ul>
               </tr>
			</table></td>
		</tr>
		
		<tr>
            <td align="left" class="contborder_purple">
	
	
		<div id="tabcontents">
		
			<div class="tabcontent" id="tab1">
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
					<td><table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
				  	<tr>
						<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">������ȣ</td>
						<td width="37%" bgcolor="eaeaea" class="table_bl_left"><input name="REQ_NO_MIN" type="text" class="input_form1" style="width:120px" readonly></td>
						<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">�ο�����</td>
						<td bgcolor="eaeaea" class="table_bl_left"><input name="GUBUN_MIN" type="text" class="input_form1" style="width:120px"></td>
				  	</tr>
				  	<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
						<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					  	<tr>
							<td><input name="REQ_DATE_MIN" type="text" class="input_form1" style="width:120px" value="${REQ_DATE_MIN}" readonly></td>
							<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onClick="popUpCalendar(this, document.getElementById('REQ_DATE_MIN'), 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
					  	</tr>
						</table></td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">ó����������</td>
						<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
					  	<tr>
							<td><input name="PREDATE_MIN" type="text" class="input_form1" style="width:120px" readonly></td>
							<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onClick="popUpCalendar(this, document.getElementById('PREDATE_MIN'), 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
					  	</tr>
						</table></td>
				  	</tr>
				  	<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�����μ�</td>
						<td bgcolor="eaeaea" class="table_bl_left"><input name="REQ_DEP_MIN" type="text" class="input_form1" style="width:120px" value="${REQ_DEP_MIN}"></td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">���μ�</td>
						<td bgcolor="eaeaea" class="table_bl_left"><input name="MANAGE_DEP_MIN" type="text" class="input_form1" style="width:120px" value="${MANAGE_DEP_MIN}"></td>
				  	</tr>
					<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�����ڸ�</td>
						<td bgcolor="eaeaea" class="table_bl_left"><input name="REQ_NM_MIN" type="text" class="input_form1" style="width:120px"></td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">����ڸ�</td>
						<td bgcolor="eaeaea" class="table_bl_left"><input name="MANAGER_MIN" type="text" class="input_form1" style="width:120px" value="${MANAGER_MIN}"></td>
					</tr>
					<tr>
						<td width="100" height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�ο�����</td>
						<td colspan="3" bgcolor="eaeaea" class="table_bl_left"><table width="100%" border="0" cellpadding="0" cellspacing="0" class="sub_stan">
							<input name="NOTES_MIN" type="text" class="input_form1" style="width:98%">
						</table></td>
					</tr>
					<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�븮��</td>
						<td bgcolor="eaeaea" class="table_bl_left"><input name="AGENT_NM_MIN" type="text" class="input_form1" style="width:120px"></td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">�븮�� ����ó</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input name="min_agent_tel1" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, min_agent_tel2, 3);" maxlength="3"> - 
							<input name="min_agent_tel2" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, min_agent_tel3, 4);" maxlength="4"> - 
							<input name="min_agent_tel3" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, min_agent_tel3, 4);" maxlength="4">
						</td>
					</tr>
				   <tr>
				  	 <td height="34" colspan="4" align="left" bgcolor="#FFFFFF" class=""><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
							<tr>
						  		<td width="75" align="right"><img src="/img/0811_t1.gif" width="58" height="21" border="0"></td>
							</tr>
					  	</table></td>
				    </tr>
					<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�ο��θ�</td>
						<td bgcolor="eaeaea" class="table_bl_left"><input name="NAME_MIN" type="text" class="input_form1" style="width:120px" value="${NAME_MIN}"></td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">�ο��� �ֹι�ȣ</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input name="min_ssn1" type="text" class="essential" style="width:40px; ime-mode:disabled" value="${min_ssn1}" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this); count_check(this, min_ssn2, 6);" maxlength="6">
							 - <input name="min_ssn2" type="text" class="essential" style="width:45px; ime-mode:disabled" value="${min_ssn2}" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);" maxlength="7">
						</td>
					</tr>
				 	<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�ο��� ������ȣ</td>
						<td bgcolor="eaeaea" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
							<tr>
							  	<td><input name="POST_MIN" type="text" class="input_form1" style="width:50px" value="${POST_MIN}" readonly></td>
							  	<td><img src="/img/search_icon.gif" alt="�˻�" width="56" height="18" border="0" onClick="javascript:openZipcodePopup('form.POST_MIN', 'form.ADDR1_MIN');" style="CURSOR:Hand"></td>
							</tr>
						</table></td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">�ο��� �ּ�</td>
						<td bgcolor="eaeaea" class="table_bl_left"><input name="ADDR1_MIN" type="text" class="input_form1" style="width:250px" value="${ADDR1_MIN}" readonly>
							<input name="ADDR2_MIN" type="text" class="input_form1" style="width:250px" value="${ADDR2_MIN}"></td>
				  	</tr>
				  	<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�ο��� ��ȭ</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input name="min_tel1" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, min_tel2, 3);" maxlength="3"> - 
							<input name="min_tel2" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, min_tel3, 4);" maxlength="4"> - 
							<input name="min_tel3" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, min_tel3, 4);" maxlength="4">
						</td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">�ο��� �޴���</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input name="min_hp1" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, min_hp2, 3);" maxlength="3"> - 
							<input name="min_hp2" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, min_hp3, 4);" maxlength="4"> - 
							<input name="min_hp3" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, min_hp3, 4);" maxlength="4">
						</td>
				  	</tr>
                  	</table></td>
                </tr>
				</table>
			</div>
			<div class="tabcontent" style="display:none" id="tab2">
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
	                <tr>
	                  	<td>
	                  	<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
					  	<tr>
							<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b">��ڸ�</td>
							<td width="37%" bgcolor="eaeaea" class="table_bl_left">
								<input name="OWNER_NAME" type="text" class="essential" style="width:150px" value="${NAME}" maxlength="5">
								<input name="OWNER_IDCHK" type="checkbox" value="1" checked onClick="javascript:click_idchk(this);">�ź��� Ȯ��
							</td>
							<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b" rowspan="3">
								<table>
									<tr><td>��� ����</td></tr>
									<tr>
										<td>
											<br><br>
											<span onClick="javascript:document.getElementById('file1').click();" style="overflow:hidden; background-repeat:no-repeat; cursor: pointer;">
												<img src="/img/file_icon.gif" align="absmiddle" alt="����÷���ϱ�">
												<input type='file' id="file1" name='OWNER_IMG' style="width:0;height:5;filter:alpha(opacity=0); CURSOR:hand;" onchange='ChangeImg(); attach(this);'>
											</span>
											
										</td>
									</tr>
								</table>
							</td>
							<td bgcolor="eaeaea" class="table_bl_left" rowspan="3" align="center">
								<table>
									<tr>
										<td width=100 height=130 id="tblview" style="background-image:url(1.jpg); background-repeat:no-repeat; background-attachment:scroll;"></td>
									</tr>
								</table>
							</td>
						</tr>
						<tr>
							<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">�ֹε�Ϲ�ȣ</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<input name="OWNER_SSN1" type="text" class="essential" style="width:40px; ime-mode:disabled" value="${OWNER_SSN1}" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, OWNER_SSN2, 6);" maxlength="6">
							  - <input name="OWNER_SSN2" type="text" class="essential" style="width:45px; ime-mode:disabled" value="${OWNER_SSN2}" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);" maxlength="7">
							</td>
					  	</tr>
					  	<tr>
							<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">����(����)</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<input name="OWNER_GENDER" type="radio" value="1" checked>��
								<input name="OWNER_GENDER" type="radio" value="2" >��
								&nbsp;( <input name="OWNER_AGE" class="input_form1" type="text" style="width:20px" maxlength="3" value="${OWNER_AGE}" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);"> ��)
							</td>
					  	</tr>
					  	<tr>
							<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">��ȭ��ȣ</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<input name="OWNER_TEL1" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, OWNER_TEL2, 3);" maxlength="3"> - 
								<input name="OWNER_TEL2" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, OWNER_TEL3, 4);" maxlength="4"> - 
								<input name="OWNER_TEL3" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, OWNER_HP1, 4);" maxlength="4">
							</td>
							<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�޴���ȭ</td>
							<td bgcolor="eaeaea" class="table_bl_left" colspan="3">
								<input name="OWNER_HP1" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, OWNER_HP2, 3);" maxlength="3"> - 
								<input name="OWNER_HP2" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, OWNER_HP3, 4);" maxlength="4"> - 
								<input name="OWNER_HP3" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);" maxlength="4">
							</td>
					  	</tr>
					  	<tr>
							<td height="34" colspan="2" align="left" bgcolor="#FFFFFF" class="">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
									  <td width="50%">
									  	<span class="sub_stan_blue">* �ֹε���� �ּ�</span>
									  </td>
									</tr>
								</table>
							</td>
							<td height="34" colspan="2" align="left" bgcolor="#FFFFFF" class="">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
									  <td width="50%">
									  	<span class="sub_stan_blue">* ���������� : </span>
									  	<input name="checkbox1" type="checkbox" value="true" onClick="javascript:Jumin_toaddr_Check()" checked>
									  	�ֹε���� �ּ� ������ ���� 
									  </td>
									</tr>
								</table>
							</td>
					  	</tr>
					  	<tr>
							<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">������ȣ</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
									  <td><input name="OWNER_POST" type="text" style="width:50px" onFocus="Jumin_toaddr_Check();" value="${POST}" readonly class="input_form1"></td>
									  <td><a href="javascript:openZipcodePopup('form.OWNER_POST', 'form.OWNER_ADDR1');"><img src="/img/search_icon.gif" alt="�˻�" width="56" height="18" border="0"></a></td>
									</tr>
								</table>
							</td>
							<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">������ȣ</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
									  <td><input name="OWNER_TOPOST" type="text" style="width:50px" onFocus="Jumin_toaddr_Check();" value="${POST}" readonly class="input_form1"></td>
									  <td><a href="javascript:openZipcodePopup('form.OWNER_TOPOST', 'form.OWNER_TOADDR1');"><img src="/img/search_icon.gif" alt="�˻�" width="56" height="18" border="0"></a></td>
									</tr>
								</table>
							</td>
					  	</tr>
					  	<tr>
							<td align="center" bgcolor="e5eff8" class="sub_table_b">�⺻ �ּ�</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<input name="OWNER_ADDR1" type="text" class="input_form1" style="width:250px" value="${OWNER_ADDR1}" readonly>
								��<input type="checkbox"  class="input_form1" name="OWNER_SAN" onClick="Jumin_toaddr_Check();">
								<input name="OWNER_BONBUN" value="${OWNER_BONBUN}" type="text" class="input_form1" style="width:27px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="Jumin_toaddr_Check();nr_num_int(this);count_check(this, OWNER_BUBUN, 4);" onKeyPress="nr_num_int(this);" maxlength="4">
								- <input name="OWNER_BUBUN" value="${OWNER_BUBUN}" type="text" class="input_form1" style="width:27px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="Jumin_toaddr_Check();nr_num_int(this);count_check(this, OWNER_ADDR2, 4);" onKeyPress="nr_num_int(this);" maxlength="4">
								<input name="OWNER_ADDR2" type="text" class="input_form1" style="width:130px" value="${OWNER_ADDR2}" onKeyUp="Jumin_toaddr_Check();" maxlength="50">
							</td>
							<td align="center" bgcolor="e5eff8" class="sub_table_b">�⺻ �ּ�</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<input name="OWNER_TOADDR1" type="text" class="input_form1" style="width:250px" value="${OWNER_TOADDR1}" readonly>
								��<input type="checkbox"  class="input_form1" name="OWNER_TOSAN" onClick="Jumin_toaddr_Check();">
								<input name="OWNER_TOBONBUN" value="${OWNER_TOBONBUN}" type="text" class="input_form1" style="width:27px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);count_check(this, OWNER_TOBUBUN, 4);" onKeyPress="nr_num_int(this);" maxlength="4">
								- <input name="OWNER_TOBUBUN" value="${OWNER_TOBUBUN}" type="text" class="input_form1" style="width:27px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);count_check(this, OWNER_TOADDR2, 4);" onKeyPress="nr_num_int(this);" maxlength="4">
								<input name="OWNER_TOADDR2" type="text" class="input_form1" style="width:130px" value="${OWNER_TOADDR2}"  maxlength="50">
							</td>
					  	</tr>
					  	<tr>
						  	<td height="34" colspan="4" align="left" bgcolor="#FFFFFF" class="">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
									  <td width="50%">
									  	<span class="sub_stan_blue">* ��Ȱ����</span>
									  </td>
									</tr>
								</table>
							</td>
						</tr>
						<tr>
							<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">��Ȱ����</td>
							<td width="37%" bgcolor="eaeaea" class="table_bl_left" nowrap="nowrap">
								<select name="LC_SEL" style="width:70px" class="input_form1">
									${lc_sel}
								</select>
								<input name="LC_TXT" type="text" class="input_form1" style="width:180px" value="${LC_TXT}" maxlength="25">
							</td>
							<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">�ְ�����</td>
							<td width="36%" bgcolor="eaeaea" class="table_bl_left">
								<select name="RT_SEL" style="width:70px" class="input_form1">
									${rt_sel}
								</select>
								<input name="RT_TXT" type="text" class="input_form1" style="width:180px" value="${RT_TXT}" maxlength="25">
							</td>
						</tr>
						<tr>
							<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">����/�ε���</td>
							<td width="37%" bgcolor="eaeaea" class="table_bl_left" nowrap="nowrap">
								<input name="ESTATE_MOVE" type="text" class="input_form1" style="width:80px" value="${ESTATE_MOVE}" maxlength="50" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);  comma_paste(this);" onKeyPress="nr_num_int(this);"> �� / 
								<input name="ESTATE_REAL" type="text" class="input_form1" style="width:80px" value="${ESTATE_REAL}" maxlength="100" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);  comma_paste(this);" onKeyPress="nr_num_int(this);"> ��
							</td>
							<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">��������</td>
							<td width="36%" bgcolor="eaeaea" class="table_bl_left">
								<select name="GP_TYP" class="essential" style="width:150px" nowrap="nowrap">
									${gp_typ}
								</select>
							</td>
						</tr>
						
	                  	</table>
	                  	</td>
				  	</tr>
				</table>
			</div>
			<div class="tabcontent" style="display:none" id="tab3">
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
	                <td>
	                <table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0" class="sub_table">
						<tr>
							<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">�����ڸ�</td>
							<td width="37%" bgcolor="eaeaea" class="table_bl_left" nowrap="nowrap">
								<input name="PARTN_NAME" type="text" class="input_form1" style="width:80px" value="${PARTN_NAME}" maxlength="10">
							</td>
							<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b" rowspan="4" nowrap="nowrap">
								<table>
									<tr><td>������ ����</td></tr>
									<tr>
										<td>
											<br><br>
											<span onClick="javascript:document.getElementById('file2').click();" style="overflow:hidden; background-repeat:no-repeat; cursor: pointer;">
												<img src="/img/file_icon.gif" align="absmiddle" alt="����÷���ϱ�">
												<input type='file' id="file2" name='PARTN_IMG' style="width:0;height:5;filter:alpha(opacity=0); CURSOR:hand;" onchange='ChangeImg2(); attach(this);'>
											</span>
										</td>
									</tr>
								</table>
							</td>
							<td bgcolor="eaeaea" class="table_bl_left" rowspan="4" nowrap="nowrap" align="center">
								<table>
									<tr><td width=100 height=130 id="tblview2" style="background-repeat:no-repeat; background-attachment:scroll;"></td></tr>
								</table>
							</td>
						</tr>
						<tr>
							<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">��������</td>
							<td width="37%" bgcolor="eaeaea" class="table_bl_left" nowrap="nowrap">
								<select name="PT_SEL" style="width:70px" class="input_form1">
									${pt_sel}
								</select>
							</td>
						</tr>
						<tr>
							<td align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">�ֹι�ȣ</td>
							<td bgcolor="eaeaea" class="table_bl_left" nowrap="nowrap">
								<input name="PARTN_SSN1" type="text" class="input_form1" style="width:40px; ime-mode:disabled" value="${PARTN_SSN1}" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, PARTN_SSN2, 6);" maxlength="6">
								 - <input name="PARTN_SSN2" type="text" class="input_form1" style="width:45px; ime-mode:disabled" value="${PARTN_SSN2}" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);" maxlength="7"></td>
						</tr>
						<tr>
						  	<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">����(����)</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<input name="PARTN_GENDER" type="radio" value="1" checked>��
								<input name="PARTN_GENDER" type="radio" value="2">��
								&nbsp;( <input name="PARTN_AGE" type="text" class="input_form1" style="width:20px" maxlength="3" value="${PARTN_AGE}"  onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);"> ��)
							</td>
						</tr>
						<tr>
						  	<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">��ȭ��ȣ</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<input name="PARTN_TEL1" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, PARTN_TEL2, 3);" maxlength="3"> - 
								<input name="PARTN_TEL2" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, PARTN_TEL3, 4);" maxlength="4"> - 
								<input name="PARTN_TEL3" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, PARTN_HP1, 4);" maxlength="4">
							</td>
							<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">�޴���ȭ</td>
							<td bgcolor="eaeaea" class="table_bl_left" colspan='3'>
								<input name="PARTN_HP1" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, PARTN_HP2, 3);" maxlength="3"> - 
								<input name="PARTN_HP2" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, PARTN_HP3, 4);" maxlength="4"> - 
								<input name="PARTN_HP3" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);" maxlength="4">
							</td>
						</tr>
						<tr>
							<td height="34" colspan="2" align="left" bgcolor="#FFFFFF" class="">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
									  <td width="50%">
									  	<span class="sub_stan_blue">* �ֹε���� �ּ�</span>
									  </td>
									</tr>
								</table>
							</td>
							<td height="34" colspan="2" align="left" bgcolor="#FFFFFF" class="">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
									  <td width="50%">
									  	<span class="sub_stan_blue">* ���������� : </span>
									  	<input name="checkbox2" type="checkbox" value="true" onClick="javascript:Jumin_toaddr_Check()" checked>
									  	�ֹε���� �ּ� ������ ���� 
									  </td>
									</tr>
								</table>
							</td>
					  	</tr>
						<tr>
							<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">������ȣ</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
									  <td><input name="PARTN_POST" type="text" class="input_form1" style="width:50px" onFocus="Jumin_toaddr_Check();" value="${POST}" onchange="Jumin_toaddr_Check();" value="${POST}" readonly></td>
									  <td><a href="javascript:openZipcodePopup('form.PARTN_POST', 'form.PARTN_ADDR1');"><img src="/img/search_icon.gif" alt="�˻�" width="56" height="18" border="0"></a></td>
									</tr>
								</table>
							</td>
							<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">������ȣ</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
									<tr>
									  <td><input name="PARTN_TOPOST" type="text" class="input_form1" style="width:50px" readonly></td>
									  <td><a href="javascript:openZipcodePopup('form.PARTN_TOPOST', 'form.PARTN_TOADDR1');"><img src="/img/search_icon.gif" alt="�˻�" width="56" height="18" border="0"></a></td>
									</tr>
								</table>
							</td>
					  	</tr>
					  	<tr>
							<td align="center" bgcolor="e5eff8" class="sub_table_b">�⺻ �ּ�</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<input name="PARTN_ADDR1" type="text" class="input_form1" style="width:250px" value="${PARTN_ADDR1}" readonly onFocus="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();">
								��<input type="checkbox" name="PARTN_SAN" class="input_form1" onClick="Jumin_toaddr_Check();">
								<input name="PARTN_BONBUN" value="${PARTN_BONBUN}" type="text" class="input_form1" style="width:27px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);Jumin_toaddr_Check();count_check(this, PARTN_BUBUN, 4);" onKeyPress="nr_num_int(this);" maxlength="4">
								- <input name="PARTN_BUBUN" value="${PARTN_BUBUN}" type="text" class="input_form1" style="width:27px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);Jumin_toaddr_Check();count_check(this, PARTN_ADDR2, 4);" onKeyPress="nr_num_int(this);" maxlength="4">
								<input name="PARTN_ADDR2" type="text" class="input_form1" style="width:130px" value="${PARTN_ADDR2}" onKeyUp="Jumin_toaddr_Check();" maxlength="50">
							</td>
							<td align="center" bgcolor="e5eff8" class="sub_table_b">�⺻ �ּ�</td>
							<td bgcolor="eaeaea" class="table_bl_left">
								<input name="PARTN_TOADDR1" type="text" class="input_form1" style="width:250px" value="${PARTN_TOADDR1}" readonly>
								 ��<input type="checkbox" name="PARTN_TOSAN" class="input_form1" onClick="Jumin_toaddr_Check();">
								<input name="PARTN_TOBONBUN" value="${PARTN_TOBONBUN}" type="text" class="input_form1" style="width:27px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);count_check(this, PARTN_TOBUBUN, 4);" onKeyPress="nr_num_int(this);" maxlength="4">
								- <input name="PARTN_TOBUBUN" value="${PARTN_TOBUBUN}" type="text" class="input_form1" style="width:27px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);count_check(this, PARTN_TOADDR2, 4);" onKeyPress="nr_num_int(this);" maxlength="4">
								<input name="PARTN_TOADDR2" type="text" class="input_form1" style="width:130px" value="${PARTN_TOADDR2}"  maxlength="50">
							</td>
					  	</tr>
                	</table>
                	</td>
				</tr>
				</table>
			</div>
			<div class="tabcontent" style="display:none" id="tab4">
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
				<tr>
	                <td>
	                <table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0" class="sub_table">
					<tr>
					  	<td height="34" colspan="4" align="left" bgcolor="#FFFFFF" class="sub_table_b" nowrap="nowrap">
						  	<table border="0" cellpadding="0" cellspacing="0" class="sub_stan"  nowrap="nowrap">
								<tr>
							  		<td><span class="sub_stan_blue">* �ü� ����</span></td>
								</tr>
						  	</table>
					  	</td>
				    </tr>
				    <tr>
						<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">��������</td>
						<td width="37%" bgcolor="eaeaea" class="table_bl_left" nowrap="nowrap">
							<input type="hidden" name="TYPE" value="1">����
						</td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">���뱸��</td>
						<td width="36%" bgcolor="eaeaea" class="table_bl_left" nowrap="nowrap">
							<input type="hidden" name="SECTION" value="1">���
						</td>
					</tr>
					<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">������</td>
						<td bgcolor="eaeaea" class="table_bl_left" nowrap="nowrap">
							<select name="OWNER_SET" class="essential" style="width:70px">
							${use_owner_Group}
							</select>
						</td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">���Ա���</td>
						<td bgcolor="eaeaea" class="table_bl_left" nowrap="nowrap">
							<select name="TAX_SET" class="essential" style="width:70px">
							${taxation_section}
							</select>
						</td>
					</tr>
					<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">����Ⱓ</td>
						<td bgcolor="eaeaea" class="table_bl_left" colspan="3" nowrap="nowrap">
							<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
							<tr>
								<td>
									<input name="MUL_FROMDATE" type="text" class="essential" style="width:70px" readonly><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" align="absmiddle" onClick="popUpCalendar(this, document.getElementById('MUL_FROMDATE'), 'yyyymmdd')" style="CURSOR: Hand;"></a>
									~ <input name="MUL_TODATE" type="text" class="essential" style="width:70px" readonly><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" align="absmiddle" onClick="popUpCalendar(this, document.getElementById('MUL_TODATE'), 'yyyymmdd')" style="CURSOR: Hand;"></a>
								</td>
							</tr>
							</table>
						</td>
					</tr>
					<tr>
					  	<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">������ ���� </td>
					  	<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
						  	<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
								<tr>
								  	<td>${SIDO_NM}&nbsp;&nbsp;${SIGUNGU}&nbsp;&nbsp;</td>
			                    	<td width="72"><select name="BJ_CD" class="essential" style="width:100px">
			                        	${bjdong_code}
			                      	</select></td>
			                 		<td>&nbsp;/&nbsp;<select name="SPC_CD" class="essential" style="width:75px">
			                           	${mul_spc_cd}
			                    	</select></td>
								  	<td>
								  	&nbsp;<input name="BONBUN" value="${BONBUN}" type="text" class="essential" style="width:40px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);" maxlength="4">
										- <input name="BUBUN" value="${BUBUN}" type="text" class="input_form1" style="width:40px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);" maxlength="4">
										���� <img src="/img/loca_icon2.gif" alt="��ġ���" border="0" onClick="javascript:jumyongZibun('${SIDO}','${SIGU_CD}');" style="CURSOR:Hand;" align="top">
									</td>
								</tr>
							</table>
						</td>
					</tr>
					<tr>
						<td align="center" bgcolor="e5eff8" class="sub_table_b" width="100" height="26" nowrap>������ �ּ�</td>
						<td bgcolor="eaeaea" class="table_bl_left" width="37%" nowrap>
							<input name="WITH_ADDR" type="text" class="essential" style="width:150px" value="${WITH_ADDR}" maxlength="50">
						</td>
					  	<td width="100" align="center" bgcolor="e5eff8" class="sub_table_b" rowspan="5" nowrap>
					  		<table>
								<tr><td>�ü��� ����</td></tr>
								<tr>
									<td>
										<br><br>
										<span onClick="javascript:document.getElementById('file3').click();" style="overflow:hidden; background-repeat:no-repeat; cursor: pointer;">
											<img src="/img/file_icon.gif" align="absmiddle" alt="����÷���ϱ�">
											<input type='file' id="file3" name='SHOP_IMG' style="width:0;height:5;filter:alpha(opacity=0); CURSOR:hand;" onchange='ChangeImg3(); attach(this);'>
										</span>
									</td>
								</tr>
							</table>
					  	</td>
						<td bgcolor="eaeaea" class="table_bl_left" rowspan="5" nowrap="nowrap" align="center">
							<table>
								<tr><td width=100 height=130 id="tblview3" style="background-image:url(1.jpg); background-repeat:no-repeat; background-attachment:scroll;"></td></tr>
							</table>
						</td>
					</tr>
					<!-- 
					<tr>
						<td colspan="2" height="26" align="center">
							��<input type="checkbox" name="GAPAN_SAN" class="input_form1" onclick="Jumin_toaddr_Check();" border="0" style="border:0px;">
							<input name="" type="text" class="input_form1" style="width:30px" value="${WITH_ADDR}"> - 
							<input name="WITH_INFO" type="text" class="input_form1" style="width:30px" value="${WITH_ADDR}">
						</td>
					</tr>
					 -->
					<tr>
					  	<td align="center" bgcolor="e5eff8" class="sub_table_b" height="26">�ֺ�����</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input name="WITH_INFO" type="text" class="input_form1" style="width:200px" value="${WITH_ADDR}">
						</td>
					</tr>
					<tr>
						<td align="center" bgcolor="e5eff8" class="sub_table_b" height="26">��������</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input name="ROAD_INFO" type="text" class="input_form1" style="width:200px" value="${ROAD_INFO}">
						</td>
					</tr>
					<tr>
						<td align="center" bgcolor="e5eff8" class="sub_table_b" height="26">��������</td>
					  	<td bgcolor="eaeaea" class="table_bl_left">
					  		<select name="AR_SEL" class="input_form1" style="width:70px">
								${ar_sel}
						  	</select>
						  	<input name="AR_TXT" type="text" class="input_form1" style="width:80px" value="${AR_TXT}" maxlength="50">
					  	</td>
					</tr>
					<tr>
					 	<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">��ġ����</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
							  	<tr>
									<td><input name="FOUND_DATE" type="text" class="input_form1" style="width:120px" value="${FOUND_DATE}" readonly></td>
									<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onClick="popUpCalendar(this, document.getElementById('FOUND_DATE'), 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
							  	</tr>
							</table>
						</td>
					</tr>
					<tr>
					  	<td align="center" bgcolor="e5eff8" class="sub_table_b" height="26">�����ü�</td>
					  	<td bgcolor="eaeaea" class="table_bl_left">
					  		<select name="UC_SEL" class="input_form1" style="width:100px">
								${uc_sel}
						  	</select>
						  	<input name="UC_TXT" type="text" class="input_form1" style="width:100px" value="${UC_TXT}" maxlength="50">
					  	</td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b" height="26">�ü�����/����</td>
					  	<td bgcolor="eaeaea" class="table_bl_left">
					  		<select name="FT_TYP" class="essential" style="width:100px">
								${ft_typ}
						  	</select> / 
						  	<select name="FT_SEL" class="input_form1" style="width:100px">
								${ft_sel}
						  	</select>
					  	</td>
					</tr>
					<tr>
						<td align="center" bgcolor="e5eff8" class="sub_table_b" height="26">�ü��԰�</td>
					  	<td bgcolor="eaeaea" class="table_bl_left">
					  		<input name="FACIL_L" type="text" class="input_form1" style="width:40px" onKeyPress="nr_num_float(this);" onKeyUp="nr_num_float(this);" maxlength="5">m �� 
					  		<input name="FACIL_W" type="text" class="input_form1" style="width:40px" onKeyPress="nr_num_float(this);" onKeyUp="nr_num_float(this);" maxlength="5">m �� 
					  		<input name="FACIL_H" type="text" class="input_form1" style="width:40px" onKeyPress="nr_num_float(this);" onKeyUp="nr_num_float(this);" maxlength="5">m
					  	</td>
					  	<td align="center" bgcolor="e5eff8" class="sub_table_b">�������</td>
					  	<td bgcolor="eaeaea" class="table_bl_left">
					  		<input name="PLACE_L" type="text" class="input_form1" style="width:40px" onKeyPress="nr_num_float(this);" onKeyUp="nr_num_float(this);" maxlength="5">m �� 
					  		<input name="PLACE_H" type="text" class="input_form1" style="width:40px" onKeyPress="nr_num_float(this);" onKeyUp="nr_num_float(this);" maxlength="5">m = 
					  		<input name="PLACE_A" type="text" class="input_form1" style="width:40px" onKeyPress="nr_num_float(this);" onKeyUp="nr_num_float(this);" maxlength="5">��
					  	</td>
					</tr>
					<tr>
						<td align="center" bgcolor="e5eff8" class="sub_table_b" height="26">�������</td>
					  	<td bgcolor="eaeaea" class="table_bl_left">
					  		<select name="DP_SEL" class="input_form1" style="width:70px">
								${dp_sel}
						  	</select>
						  	<input name="DP_TXT" type="text" class="input_form1" style="width:80px" value="${DP_TXT}" maxlength="50">
					  	</td>
					  	<td align="center" bgcolor="e5eff8" class="sub_table_b">Ưȭ�Ÿ�����</td>
					  	<td bgcolor="eaeaea" class="table_bl_left">
					  		<input type="radio" name="SPECIAL_ST" value="1" class="input_form1" checked> �ϹݰŸ�
					  		<input type="radio" name="SPECIAL_ST" value="0" class="input_form1"> Ưȭ�Ÿ�
					  	</td>
					</tr>
					<tr>
						<td align="center" bgcolor="e5eff8" class="sub_table_b" height="26">�����󿩺�</td>
					  	<td bgcolor="eaeaea" class="table_bl_left" colspan="3">
					  		<input type="radio" name="MAINTN_OB" value="1" class="input_form1" checked> �������
					  		<input type="radio" name="MAINTN_OB" value="2" class="input_form1"> ������
					  		<select name="MT_SEL" class="input_form1" style="width:70px">
								${mt_sel}
						  	</select>
					  	</td>
					</tr>
					<tr>
					  	<td height="34" colspan="4" align="left" bgcolor="#FFFFFF" class="">
						  	<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
								<tr>
							  		<td><span class="sub_stan_blue">* �����</span></td>
								</tr>
						  	</table>
					  	</td>
				    </tr>
					<tr>
						<td align="center" bgcolor="e5eff8" class="sub_table_b" height="26">���ǰ��</td>
					  	<td bgcolor="eaeaea" class="table_bl_left" colspan="3">
							<select name="SG_TYP" class="input_form1" style="width:70px">
								${sg_typ}
						  	</select>
						  	<input type="checkbox" class="input_form1" name="LIQUOR_SL" value="0"> �ַ��Ǹ�
						  	<input type="checkbox" class="input_form1" name="LPGAS_US"  value="0"> LPG ���
					  	</td>						
					</tr>
					<tr>
						<td align="center" bgcolor="e5eff8" class="sub_table_b" height="26">��ǰ�з�</td>
					  	<td bgcolor="eaeaea" class="table_bl_left">
							<select name="SG_ITM" class="input_form1" style="width:70px">
								${sg_itm}
						  	</select> / 
						  	<select name="SG_SEL" class="input_form1" style="width:70px">
								${sg_sel}
						  	</select>
					  	</td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b" height="26">�����ο�</td>
					  	<td bgcolor="eaeaea" class="table_bl_left">
					  		<input name="MEM_NUM" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, OPEN_TIME1, 2);" maxlength="2"> (��� ���� ����)
					  	</td>
					</tr>
					<tr>
						<td align="center" bgcolor="e5eff8" class="sub_table_b" height="26">��ð�</td>
					  	<td bgcolor="eaeaea" class="table_bl_left">
					  		<input name="OPEN_TIME1" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);count_check(this, OPEN_TIME2, 2);" maxlength="2"> : 
					  		<input name="OPEN_TIME2" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);count_check(this, CLOSE_TIME1, 2);" maxlength="2"> ~
					  		<input name="CLOSE_TIME1" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);count_check(this, CLOSE_TIME2, 2);" maxlength="2"> :
					  		<input name="CLOSE_TIME2" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);" maxlength="2">
					  	</td>
					 	<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b" height="26">�㰡����</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
							  	<tr>
									<td><input name="PERMIT_DATE" type="text" class="input_form1" style="width:120px" value="${PERMIT_DATE}" readonly></td>
									<td><a><img src="/img/calendar_icon.gif" width="19" height="16" border="0" onClick="popUpCalendar(this, document.getElementById('PERMIT_DATE'), 'yyyymmdd')" style="CURSOR: Hand;"></a></td>
							  	</tr>
							</table>
						</td>
					</tr>
					<tr>
						<td align="center" bgcolor="e5eff8" class="sub_table_b" height="26">�ϸ����</td>
					  	<td bgcolor="eaeaea" class="table_bl_left">
					  		<input name="DAY_SALES" type="text" class="input_form1" style="width:100px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);" maxlength="8"> ��
					  	</td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b" height="26">���Դ�ü</td>
					  	<td bgcolor="eaeaea" class="table_bl_left">
					  		<select name="UN_TYP" class="input_form1" style="width:70px">
								${un_typ}
						  	</select>
					  		<input name="UN_TXT" type="text" class="input_form1" style="width:100px" style="ime-mode:disabled" maxlength="50">
					  	</td>
					</tr>
					<tr>
						<td align="center" bgcolor="e5eff8" class="sub_table_b" height="26">��Ÿ����</td>
					  	<td bgcolor="eaeaea" class="table_bl_left" colspan="3">
					  		<input name="NOTES" type="text" class="input_form1" style="width:600px" style="ime-mode:disabled" maxlength="255">
					  	</td>
					</tr>
				</table>
			</div>
			
			
		</div>
		</td>
		</tr>
	</table></td>
	</tr>
</form>
</table>
</body>
</html>

<script language="javascript">
	//HTML�Ǵ� JSP �������� ������ �κп� ������ ���� ��������.
	RemoveOutline();
</script>