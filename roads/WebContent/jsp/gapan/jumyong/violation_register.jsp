<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/loginCheck.jsp"%>
<%@ include file="/jsp/common/include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />
<title>::::: ����� ������������ý��� :::::</title>
<style type="text/css">
<!--
body {
	margin: 0px;
	background-image: url(/img/left_back.gif);
}
-->
</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
<script language='JavaScript' src='/js/common.js'></script>
<script language='JavaScript' src='/js/Check_inputbox.js'></script>
<script language="javascript" src="/js/PopupCalendar.js"></script>
<script language="javascript" src="/js/calculation.js"></script>
<script>


	
	// ����� üũ
	function checkForm(){
		var form1 = document.form1;
		alert(form1.year.value);

		form1.submit();
		//	Ư������ �Է½� �� ���� ����� �ٹٲ��� �־�� ������ ����. ������ �𸣰ڽ�
		//		w.content.value = w.content.value+' '+'\n';	
		
	}

	// �����ϱ�
	function goSave(){

		var f = document.form;
		
	
		if( f.VIO_POINTS.value == "" ){
			f.VIO_POINTS.value = "0.0";
		}
		
		if( confirm("�����Ͻðڽ��ϱ�? ") ){
			
			f.action = "/gapan/jumyong/violation_registerPrc.do";
			f.submit();
		}
	}

	// ����Ʈ��
	function goList(){
		
		var f = document.form;
		var GAPAN_NO = document.getElementById("GAPAN_NO").value;
		var GP_TYP = document.getElementById("GP_TYP").value;
		var SEQ = document.getElementById("SEQ").value;

		f.action = "/gapan/jumyong/info_violation.do?GAPAN_NO="+GAPAN_NO+"&GP_TYP="+GP_TYP+"&SEQ="+SEQ;
		f.submit();
	}




    function ChangeImg(thisObj, preViewer) {

        if(!/(\.gif|\.jpg|\.jpeg|\.png|\.bmp)$/i.test(thisObj.value)) {
            alert("�̹��� ������ ������ �����Ͻʽÿ�");
            return;
        }

        preViewer = (typeof(preViewer) == "object") ? preViewer : document.getElementById(preViewer);
        var ua = window.navigator.userAgent;

        if (ua.indexOf("MSIE") > -1) {
            var img_path = "";
            if (thisObj.value.indexOf("\\fakepath\\") < 0) {
                img_path = thisObj.value;
            } else {
                thisObj.select();
                var selectionRange = document.selection.createRange();
                img_path = selectionRange.text.toString();
                thisObj.blur();
            }
                      
            img_path = img_path.split('%').join('%25');
            
            preViewer.style.filter = "progid:DXImageTransform.Microsoft.AlphaImageLoader(src='" + img_path + "', sizingMethod='scale')";
            
            
        } else {
            preViewer.innerHTML = "";
            var W = preViewer.offsetWidth;
            var H = preViewer.offsetHeight;
            var tmpImage = document.createElement("img");
            preViewer.appendChild(tmpImage);

            tmpImage.onerror = function () {
                return preViewer.innerHTML = "";
            };

            tmpImage.onload = function () {

                if (this.width > W) {
                    this.height = this.height / (this.width / W);
                    this.width = W;
                }
                if (this.height > H) {
                    this.width = this.width / (this.height / H);
                    this.height = H;
                }
            };
            if (ua.indexOf("Firefox/3") > -1) {
                var picData = thisObj.files.item(0).getAsDataURL();
                tmpImage.src = picData;
            } else {
                tmpImage.src = "file://" + thisObj.value;
            }
        }
    }

	
	function InitPage()
	{

		// �����϶� ���� ���� ���ϵ��� 
		if( document.getElementById("mode").value == 'edit' ){			
			document.getElementById("VIO_DEG").disabled = "true";
		}

        // �̹��� �⺻ �ε�
        if(document.getElementById('VIO_IMG1_NAME').value != ''){
        	ChangeImg(document.getElementById('VIO_IMG1_NAME'), 'VIO_IMG1_PREVIEW');
        }
        
        // �̹��� �⺻ �ε�
        if(document.getElementById('VIO_IMG2_NAME').value != ''){
        	ChangeImg(document.getElementById('VIO_IMG2_NAME'), 'VIO_IMG2_PREVIEW');
        }

        // �̹��� �⺻ �ε�
        if(document.getElementById('VIO_ACTIMG1_NAME').value != ''){
        	ChangeImg(document.getElementById('VIO_ACTIMG1_NAME'), 'VIO_ACTIMG1_PREVIEW');
        }
        
        // �̹��� �⺻ �ε�
        if(document.getElementById('VIO_ACTIMG2_NAME').value != ''){
        	ChangeImg(document.getElementById('VIO_ACTIMG2_NAME'), 'VIO_ACTIMG2_PREVIEW');
        }
        
        
		var _vioSel = document.getElementsByName('VIO_SEL');
		var _vioActSel = document.getElementsByName('VIO_ActSEL');
		
		var _vioSelArray = ['${violation.VIO_SEL1}',
		                    '${violation.VIO_SEL2}',
		                    '${violation.VIO_SEL3}',
		                    '${violation.VIO_SEL4}',
		                    '${violation.VIO_SEL5}',
		                    '${violation.VIO_SEL6}',
		                    '${violation.VIO_SEL7}'];
		
		var _vioActSelArray = ['${violation.VIO_ACTSEL1}',
		                    '${violation.VIO_ACTSEL2}',
		                    '${violation.VIO_ACTSEL3}',
		                    '${violation.VIO_ACTSEL4}',
		                    '${violation.VIO_ACTSEL5}'];
		
		
		
		
		for(var i = 0;i < _vioSel.length ;i++){
			if(_vioSelArray[i] == '1')
				_vioSel[i].checked = true;
		}
		
		for(var i = 0;i < _vioActSel.length ;i++){
			if(_vioActSelArray[i] == '1')
			_vioActSel[i].checked = true;
		}
		

		turnValidation(_vioSel[6],'VIO_CONTENT');
		turnValidation(_vioActSel[3],'VIO_POINTS');
		turnValidation(_vioActSel[4],'VIO_ACTCONTENT');
		
		
	
	}
	
	function turnValidation(org,obj){
		
		if(org.checked){
			document.getElementById(obj).disabled = false;
			document.getElementById(obj).focus();
		}else{
			document.getElementById(obj).value = '';
			document.getElementById(obj).disabled = true;
			
		}
		
	}

</script>

</head>

<body onload="InitPage();">

<form id="form" name="form" method="post" enctype="multipart/form-data">
<input type="hidden" name="GAPAN_NO" value="${GAPAN_NO}"> 
	<input type="hidden" id="GP_TYP" name="GP_TYP" value="001"> 
	<input type="hidden" id="SEQ" name="SEQ" value="${SEQ}"> 
	<input type="hidden" id="mode" name="mode" value="${mode}"> 
	<input type="hidden" id="currentPage" name="currentPage" value="${currentPage }">
	<input type="hidden" id="VIO_IMG1_NAME" name="VIO_IMG1_NAME" value="${violation.VIO_IMG1_NAME}">
	<input type="hidden" id="VIO_IMG2_NAME" name="VIO_IMG2_NAME" value="${violation.VIO_IMG2_NAME}">
	<input type="hidden" id="VIO_ACTIMG1_NAME" name="VIO_ACTIMG1_NAME" value="${violation.VIO_ACTIMG1_NAME}">
	<input type="hidden" id="VIO_ACTIMG2_NAME" name="VIO_ACTIMG2_NAME" value="${violation.VIO_ACTIMG2_NAME}">
	
<table width="780" border="0" cellspacing="0" cellpadding="0">
	<tr>
		<td class="contborder_purple">

		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td>
				<table width="100%" border="0" cellpadding="0" cellspacing="0" class="sub_table">
					<tr>
						<td height="52px" align="left" class="sub_table_b">
							���ݳ��� ������ȣ : <input type="text" id="VIO_DEG" name="VIO_DEG" class="input_form1" value="${violation.VIO_DEG}" style="width: 30px; border: 0px; text-decoration: none" readonly>
						</td>
					</tr>
				</table>
				</td>
			</tr>
			<tr>
				<td>
				<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse: collapse;" cellpadding="0" cellspacing="0" class="sub_table">
					<tr>
						<td height="26px" align="left" class="sub_table_b" colspan="4">
						* ���ݻ���
						</td>
					</tr>
					<tr>
						<td width="10%" height="32px" align="center" bgcolor="e5eff8" class="sub_table_b">���˱��</td>
						<td width="35%" bgcolor="eaeaea" class="table_bl_left">
							<input type="text" id="VIO_DEPT" name="VIO_DEPT" class="input_form1" maxlength="55" value="${violation.VIO_DEPT}">
						</td>
						<td width="55%" bgcolor="eaeaea" class="table_bl_left" colspan="2" rowspan="3">
						
							<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0" class="sub_table">
								<tr>
								<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b" width="50%" nowrap>
									���ݻ���1
								</td>
								
								<td align="center" bgcolor="e5eff8" class="sub_table_b" width="50%" nowrap>
									���ݻ���2
								</td>
								
								</tr>
								<tr>
									<td height="26px">
										<input type="file" id="VIO_IMG1" name='VIO_IMG1' class="input_form1" size="15" onchange="ChangeImg(this,'VIO_IMG1_PREVIEW');"/>
									</td>
									<td>
										<input type="file" id="VIO_IMG2" name='VIO_IMG2'  class="input_form1" size="15" onchange="document.getElementById('VIO_IMG2_NAME').value = this.value;ChangeImg(this,'VIO_IMG2_PREVIEW');"/>
									</td>
								</tr>
								<tr>
									<td height="78px" id="VIO_IMG1_PREVIEW" style="background-repeat:no-repeat; background-attachment:inherit;"></td>
									<td id="VIO_IMG2_PREVIEW" style="background-repeat: no-repeat; background-attachment: inherit;"></td>
								</tr>
							</table>
							
						</td>
					</tr>

					<tr>
						<td height="32px" align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<input type="text" id="VIO_DATE"  name="VIO_DATE" class="input_form1" value="${violation.VIO_DATE}" readonly> 
							<img src="/img/calendar_icon.gif" onclick="popUpCalendar(this, document.getElementById('VIO_DATE'), 'yyyymmdd');" style="vertical-align:middle;cursor: pointer">
						</td>
					</tr>
					<tr>
						<td height="110px" align="center" bgcolor="e5eff8" class="sub_table_b">���ݳ���</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<table>
								<tr>
									<td>
										<input type="checkbox" name="VIO_SEL" value="1">����/����</input>
									</td>
									<td>
										<input type="checkbox" name="VIO_SEL" value="2">�븮�</input>							
									</td>
									<td>
										<input type="checkbox" name="VIO_SEL" value="3">�ҹ�����</input>							
									</td>
								</tr>
								<tr>
									<td>
										<input type="checkbox" name="VIO_SEL" value="4">��������</input>							
									</td>
									<td>
										<input type="checkbox" name="VIO_SEL" value="5">�ҹ���ġ��</input>
									</td>
									<td>
										<input type="checkbox" name="VIO_SEL" value="6">�ü����Ѽ�</input>							
									</td>
								</tr>
								<tr>
									<td colspan="3">
										<input type="checkbox" name="VIO_SEL" value="7" onclick="turnValidation(this,'VIO_CONTENT')">
											��Ÿ
											<input type="text" id="VIO_CONTENT" name="VIO_CONTENT" class="input_form1" style="width:190px" maxlength="100" value='${violation.VIO_CONTENT}' disabled="disabled">
											</input>
										</input>							
									</td>
								</tr>
							</table>
						</td>
					</tr>
					<tr>
					<td height="26px" align="left" class="sub_table_b" colspan="4">
					* ��ġ����
					</td>
					</tr>
					<tr>
						<td height="32px" align="center" bgcolor="e5eff8" class="sub_table_b">��ġ����</td>
						<td bgcolor="eaeaea" class="table_bl_left" colspan="1">
							<input type="text" id="VIO_ACTDATE"  name="VIO_ACTDATE" class="input_form1" value="${violation.VIO_ACTDATE }" readonly> 
							<img src="/img/calendar_icon.gif" onclick="popUpCalendar(this, document.getElementById('VIO_ACTDATE'), 'yyyymmdd');" style="vertical-align:middle;cursor: pointer">
						</td>
						<td bgcolor="eaeaea" class="table_bl_left" colspan="2" rowspan="3">
						
							<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0" class="sub_table">
								<tr>
								<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b" width="50%" nowrap>
									��ġ����1
								</td>
								
								<td align="center" bgcolor="e5eff8" class="sub_table_b" width="50%" nowrap>
									��ġ����2
								</td>
								
								</tr>
								<tr>
									<td height="26px">
										<input type="file" id="VIO_ACTIMG1" name='VIO_ACTIMG1' class="input_form1" size="15" onchange="ChangeImg(this,'VIO_ACTIMG1_PREVIEW');"/>
									</td>
									<td>
										<input type="file" id="VIO_ACTIMG2" name='VIO_ACTIMG2'  class="input_form1" size="15" onchange="document.getElementById('VIO_ACTIMG2_NAME').value = this.value;ChangeImg(this,'VIO_ACTIMG2_PREVIEW');"/>
									</td>
								</tr>
								<tr>
									<td height="78px" id="VIO_ACTIMG1_PREVIEW" style="background-repeat: no-repeat; background-attachment: inherit;"></td>
									<td id="VIO_ACTIMG2_PREVIEW" style="background-repeat: no-repeat; background-attachment: inherit;"></td>
								</tr>
							</table>
						</td>
					</tr>
					<tr>
						<td height="110px" align="center" bgcolor="e5eff8" class="sub_table_b">��ġ����</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<table>
								<tr>
									<td>
										<input type="checkbox" name="VIO_ACTSEL" value="1">�㰡���</input>
									</td>
									<td>
										<input type="checkbox" name="VIO_ACTSEL" value="2">�������</input>							
									</td>
									<td>
										<input type="checkbox" name="VIO_ACTSEL" value="3">���·�ΰ�</input>
									</td>
								</tr>
								<tr>
									<td colspan="3">
										<input type="checkbox" name="VIO_ACTSEL" value="4" onclick="turnValidation(this,'VIO_POINTS')">
											�����ΰ�
											<input type="text" id="VIO_POINTS" name="VIO_POINTS" class="input_form1" style="width:50px" maxlength="20" value="${violation.VIO_POINTS}" onKeyDown="onlyNumberInput();" disabled="disabled">��
											</input>
										</input>							
									</td>
								</tr>
								<tr>
									<td colspan="3">
										<input type="checkbox" name="VIO_ACTSEL" value="5" onclick="turnValidation(this,'VIO_ACTCONTENT')">
											��Ÿ
											<input type="text" id="VIO_ACTCONTENT" name="VIO_ACTCONTENT" class="input_form1" style="width:100px" maxlength="150" value='${violation.VIO_ACTCONTENT}' disabled="disabled">
											</input>
										</input>							
									</td>
								</tr>
							</table>
							

						</td>
					</tr>
				</table>
				</td>
			</tr>
			<tr>
				<td height="40" align="right"><img src="/img/save_icon2.gif" alt="����" width="56" height="18" border="0" onClick="javascript:goSave();" style="cursor: pointer"> 
					<img src="/img/list_icon2.gif" alt="����Ʈ" width="56" height="18" border="0" onClick="javascript:goList();" style="cursor: pointer">
				</td>
			</tr>
		</table>
		</td>
	</tr>
</table>


</form>

</body>
</html>
