<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/loginCheck.jsp" %>
<%@ include file="/jsp/common/include.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />

<title>::::: 서울시 도로점용관리시스템 :::::</title>
<style type="text/css">
<!--
body {
	margin: 0px;
}
-->
</style>
<link href="/css/roads.css" rel="stylesheet" type="text/css">
</head>
<script language="javascript" src="/js/common.js"></script>
<script language="javascript" src="/js/PopupCalendar.js"></script>
<script language='JavaScript' src='/js/Check_inputbox.js'></script>
<script language="javascript" src="/js/Ajax_request.js"></script>
<script language="javascript" src="/js/calculation.js"></script>
<script language="javascript" src="/js/rojumGugan.js"></script>
<!-- #mr 130302 -->
<script language="javascript" src="/js/zipcode.js"></script>    
<script type="text/javascript">
        //<![CDATA[
	//********** BEGIN_현진_20120315
        function changeGugan(){        	
        	document.getElementById("REG_SEQ").value = "";
        	document.getElementById("REG_NAME").value = "";
        }
	//********** END_현진_20120315

        function	ModifyPrc()
        {
            var	result	= DataCheck();

            if(result	==	false)
                return;

            var form 	= document.form;
            var	str		= "";



          	//PNU 파라메터에 값  세팅
		    var form = document.form;
            var BJ_CD = form.BJ_CD.value;
            var SPC_CD = form.SPC_CD.value;
            var BONBUN = form.BONBUN.value;
            var BUBUN = form.BUBUN.value;
            var PNU = '${SIDO}'+'${SIGU_CD}'+BJ_CD+SPC_CD+addZero(BONBUN,4)+addZero(BUBUN,4);;
            form.WITH_PNU.value = PNU;

          	form.action = "/rojum/jumyonginfo/jumji_modify_prc.do";
            form.submit();
        }


        function	DataCheck()
        {
            var form 	= document.form;
            var	str		= "";
          //********** BEGIN_현진_20120315
           if("${board.MANAGE_TYP}" == "0"){
        	var GUGAN_CD = document.getElementById("GUGAN_CD").value;
        	var REG_SEQ = document.getElementById("REG_SEQ").value;
        	
        	if(GUGAN_CD != null && GUGAN_CD != ""){
        		if(REG_SEQ == null || REG_SEQ == ""){
        			str += "구간 등록번호를 생성해주세요!";
        			form.REG_NAME.focus();
        			alert(str);
            	}
        		
        	}
           }
        	//********** END_현진_20120315        
        	
    		if(document.getElementById("MG_TYP").value != '0'){
    			if(getValueSelectTag("MANAGE_TYP") < 1)
        		{
        			str	+= "등록 구분을 선택 하세요\n";
        			alert(str);
        			tabDisplay(tab,content,0);
        			form.MG_TYP.focus();
        		}
    		}
    		else if(form.REG_DATE.value.length	< 1)
            {
            	if(getValueSelectTag("MANAGE_TYP") == "2"){
            		str	+= "수거일자를 선택 하세요\n";
            	}else if(getValueSelectTag("MANAGE_TYP") == "3"){
            		str	+= "계도일자를 선택 하세요\n";
            	}else{
            		str	+= "설치일자를 선택 하세요\n";
            	}
                alert(str);
               //********** BEGIN_KANG_20120419
               // tabDisplay(tab,content,0);
               //********** END_KANG_20120419
                form.REG_DATE.focus();
            }
            else if(form.BJ_CD.value.length	< 1)
            {
                str	+= "점용지 법정동을 선택 하세요\n";
                alert(str);
                form.BJ_CD.focus();
            }
            else if(form.HJ_CD.value.length	< 1)
            {
                str	+= "지 행정동을 선택 하세요\n";
                alert(str);
                form.HJ_CD.focus();
            }
            else if(form.SPC_CD.value.length	< 1)
            {
                str	+= "점용지 번지종류를 선택 하세요\n";
                alert(str);
                form.SPC_CD.focus();
            }
            else if(form.BONBUN.value.length	< 1)
            {
                str	+= "점용지 본번을 입력 하세요\n";
                alert(str);
                form.BONBUN.focus();
            }
            else if(form.FT_TYP.value.length	< 1)
            {
                str	+= "시설물명을 선택하세요\n";
                alert(str);
                form.FT_TYP.focus();
            }
            else if(form.PLACE_L.value.length	< 1)
            {
                str	+= "점용면적 가로를 입력하세요\n";
                alert(str);
                form.PLACE_L.focus();
            }
            else if(form.PLACE_H.value.length	< 1)
            {
                str	+= "점용면적 세로를 입력하세요\n";
                alert(str);
                form.PLACE_H.focus();
            }
            else if(form.FT_TYP.value.length	< 1)
            {
                str	+= "시설물명을 선택하세요\n";
                alert(str);
                form.FT_TYP.focus();
            }
            else if(form.FT_SEL.value.length	< 1)
            {
                str	+= "시설물 규격을 선택하세요\n";
                alert(str);
                form.FT_SEL.focus();
            }
    		else if(form.FT_TYP.value == '021' && form.FT_CAT.value.length	< 1)
    		{
    			str	+= "시설 유형을 선택하세요\n";
    			alert(str);
    			form.FT_CAT.focus();
    		}
    		else if(document.getElementsByName("SPECIAL_ST")[1].checked && form.SPECIAL_DATE.value.length	< 1)
    		{
    			str	+= "특화거리 조성일자를 입력하세요\n";
    			alert(str);
    			form.SPECIAL_DATE.focus();
    		}

            if(str	== "")
            {
                return	true;
            }

            return	false;
        }

        function Cancel(gapanno)
        {
            document.form.action = "/rojum/jumyonginfo/jumji_view.do?GAPAN_NO="+gapanno;
            document.form.submit();
        }

	    function jumyongZibun(SIDO, SIGU_CD){

            var form 	= document.form;
            var	str		= "";

            if(form.BJ_CD.value.length	< 1)
            {
                str	+= "점용지 법정동을 선택 하세요\n";
                alert(str);
                form.BJ_CD.focus();
                return;
            }
           
            var BJ_CD = form.BJ_CD.value;
            var SPC_CD = form.SPC_CD.value;
            var BONBUN = form.BONBUN.value;
            var BUBUN = form.BUBUN.value;
            var addNum = "";

            var PNU = '${SIDO}'+'${SIGU_CD}'+BJ_CD+SPC_CD+addZero(BONBUN,4)+addZero(BUBUN,4);;
            form.WITH_PNU.value = PNU;

            var url = '/rojum/map/mini_map.do?PNU='+PNU+'&X_COORD='+form.X_COORD.value+'&Y_COORD='+form.Y_COORD.value+'&TYPE=edit';

            cw=screen.availWidth;
            ch=screen.availHeight;

            sw=800;
            sh=600;

            ml=(cw-sw)/2;
            mt=(ch-sh)/2;

            var param = 'width='+sw+',height='+sh+',top='+mt+',left='+ml+',resizable=no, status=no, scrollbars=no, toolbar=no, menubar=no';

            window.open(url, "minimap", param);
        }

        function ChangeImg(thisObj, preViewer) {

            if(!/(\.gif|\.jpg|\.jpeg|\.png|\.bmp)$/i.test(thisObj.value)) {
                alert("이미지 형식의 파일을 선택하십시오");
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

        function Jumji_CalPlaceSize()
        {
            var ret = parseFloat(form.PLACE_L.value) * parseFloat(form.PLACE_H.value);
            form.PLACE_A.value = Math.round( ret* Math.pow(10,parseInt(3,10)) ) / Math.pow(10,parseInt(3,10));
        }


        ////////////////////////////////AJAX////////////////////////////////////////////
        ////////////////////////////////AJAX////////////////////////////////////////////
        ////////////////////////////////AJAX////////////////////////////////////////////
        function getXMLHTTPRequest()
        {
            var xRequest = null;
            xRequest = new ActiveXObject("Microsoft.XMLHTTP");

            return xRequest;
        }

        var req;
        var	call;

        function sendRequest(url, params, HttpMethod, callback)
        {
            req = getXMLHTTPRequest();

            call	= callback;
            if(req){
                req.onreadystatechange = onReadyStateChange;
                req.open(HttpMethod, url, true);
                req.setRequestHeader("Content-Type","application/x-www-form-urlencoded;charset=utf-8");
                req.send(params);
            }
        }

        function onReadyStateChange()
        {
            var ready = req.readyState;
            var data = null;
            if(ready == 4){
                if(this.call	!= null)
                {
                    this.call(req.responseText);
                }
            }
        }


        function fncSelectBoxSetting(strParam, selectBoxId, defaultSel, topLabel)
        {
            var xmldoc = new ActiveXObject("Microsoft.XMLDOM");
            var selectBoxLabel;
            var root;
            var selectBoxValue;
            var opt 	= document.getElementById(selectBoxId);
            var tags	= "";
            var	text	= "";

            for(var i = opt.options.length - 1 ; i > -1 ; i--)
            {
                opt.options[i]	= null;
            }

            xmldoc.async	= false;

            xmldoc.loadXML(strParam);


            root = xmldoc.getElementsByTagName("option").length;


            if(root <= 0)
            {
                tags 	= document.createElement("option");
                text	= document.createTextNode("");
                tags.setAttribute("label", "");
                tags.appendChild(text);
                tags.value = 0;
                opt.appendChild(tags);
                return;
            }

            if(topLabel != null && topLabel != "")
            {
                tags 	= document.createElement("option");
                text	= document.createTextNode(topLabel);
                tags.setAttribute("label", topLabel);
                tags.appendChild(text);
                tags.value = '';
                opt.appendChild(tags);
            }

            for(var i = 0; i < root; i++)
            {

                selectBoxValue = xmldoc.getElementsByTagName("option/@value").item(i).text;
                selectBoxLabel = xmldoc.getElementsByTagName("option/@label").item(i).text;

                tags 	= document.createElement("option");
                text	= document.createTextNode(selectBoxLabel);

                tags.setAttribute("label", selectBoxLabel);

                tags.value = selectBoxValue;
                tags.appendChild(text);
                opt.appendChild(tags);
            }

            var ft_sel = '${ft_sel}';
            var ft_typ = '${ft_typ}';
            var ft_cat = '${ft_cat}';

            if(ft_typ.length > 0 && document.getElementById('FLAG').value == '3'){
                setSelectedOption(document.getElementById("FT_TYP"),ft_typ);
            };

            if(ft_sel.length > 0 && document.getElementById('FLAG').value == '2'){
                setSelectedOption(document.getElementById("FT_SEL"),ft_sel);
            };
            
            if(ft_typ ='021' && document.getElementById('FLAG').value == '1'){
            	setSelectedOption(document.getElementById("FT_CAT"),ft_cat);
            };
            
            

            document.getElementById('FLAG').value = parseInt(document.getElementById('FLAG').value) - 1;

        }

        function ChangeFTSEL(obj){
        	var ftSel = getSelectedValue(obj);
        	
        	if(ftSel == '214'){
        		document.getElementById("CAR_NO").style.display = "block";
        		document.getElementById("CAR_NO_SPAN").style.display = "block";
        	}else{
        		document.getElementById("CAR_NO").value = "";
        		document.getElementById("CAR_NO").style.display = "none";
        		document.getElementById("CAR_NO_SPAN").style.display = "none";
        	}
        	
        }


        function	SelectedGPTYP()
        {
            var	param	= "GP_TYP="+'002';
            sendRequest("/rojum/jumyonginfo/get_ft_typ.do", param, "GET", ResultGPTYP);

        }
        function	ResultGPTYP(obj)
        {
            fncSelectBoxSetting(obj, "FT_TYP", "EEE", "::선택::");
            SelectedFTTYP();
        }
        
        function	SelectedFTTYP()
        {
            var	FT_TYP	= document.getElementById("FT_TYP").value;

            var	param	= "FT_TYP="+FT_TYP;

            sendRequest("/rojum/jumyonginfo/get_ft_sel.do", param, "GET", ResultFTSEL);
        }

        function	ResultFTSEL(obj)
        {
            fncSelectBoxSetting(obj, "FT_SEL", "EEE", "::선택::");
            
            var	FT_TYP	= getSelectedValue(document.getElementById("FT_TYP"));
            var	param	= "FT_TYP="+FT_TYP;
            if(FT_TYP == '021'){
            	document.getElementById("FT_CAL_ROW").style.display = "block";
            	sendRequest("/rojum/jumyonginfo/get_ft_cat.do", param, "GET", ResultFTCAT);
            }else{
            	document.getElementById("FT_CAL_ROW").style.display = "none";
            }
        }
        
        function	ResultFTCAT(obj)
        {
            fncSelectBoxSetting(obj, "FT_CAT", "EEE", "::선택::");
        }






        function Init(){
        	
        	if(document.getElementById("MG_TYP").value == '0'){
        		document.getElementById("SURVEY_YEAR").style.display = "block";
        		setYear(document.getElementById("SURVEY_YEAR"),'${board.SURVEY_YEAR}');
        		document.getElementById("REG_DATE_CONTENT").innerHTML = "설치일자";
        		 //********** BEGIN_현진_20120207
        		 document.getElementById("REG_DATE").className = "essential";
        		 //********** END_현진_20120207        		
        	}else{
        		document.getElementById("MANAGE_TYP").style.display = "block";
        		changeMgTyp();
        	}
        	
        	
            var mul_spc_cd = "${mul_spc_cd}";

            if(mul_spc_cd=="산번지")
                mul_spc_cd = "2";
            if(mul_spc_cd=="일반번지")
                mul_spc_cd = "1";
            document.getElementById("SPC_CD").value=mul_spc_cd;
            
            
            if("${board.FT_SEL}" == "214"){
        		document.getElementById("CAR_NO").style.display = "block";
        		document.getElementById("CAR_NO_SPAN").style.display = "block";
            }

          	
            //시설물, 규격 초기화
            SelectedGPTYP();
            
            //특화거리 조성여부 처리
            check_special_st();

	   	 	
            // 이미지 기본 로드
            if(document.getElementById('SHOP_IMG_NAME').value != ''){
	            ChangeImg(document.getElementById('SHOP_IMG_NAME'), 'SHOP_IMG_PREVIEW');
            }
            
            // 이미지 기본 로드
            if(document.getElementById('SHOP_IMG2_NAME').value != ''){
    	        ChangeImg(document.getElementById('SHOP_IMG2_NAME'), 'SHOP_IMG2_PREVIEW');    	  
            }
            
        }


        function changeMgTyp(){

        	var targetTag = getValueSelectTag("MANAGE_TYP");
        	var regdateContent = document.getElementById("REG_DATE_CONTENT");


        	if(targetTag == '1'){
        		regdateContent.innerHTML = "설치일자";
        	}else if(targetTag == '2'){
        		regdateContent.innerHTML = "수거일자";
        	}else if(targetTag == '3'){
        		regdateContent.innerHTML = "계도일자";
        	}else{
        		regdateContent.innerHTML = "";
        	}
        }
        
        function check_special_st(){
        	var specialSt = document.getElementsByName("SPECIAL_ST");
        	if(specialSt[0].checked){
        		document.getElementById("SPECIAL_DATE_SPAN").style.display = "none";
        		document.getElementById("SPECIAL_DATE").value = "";
        	}else{
        		document.getElementById("SPECIAL_DATE_SPAN").style.display = "inline-block";
        	}
        	
        }

        //]]>
    </script>

<body onload="Init();">
<form id="form" name="form" method="post" enctype="multipart/form-data">
<input type="hidden" id="MG_TYP" name="MG_TYP" value="${board.MANAGE_TYP}">
<input type="hidden" id="GAPAN_NO" name="GAPAN_NO" value="${GAPAN_NO}">
<input type="hidden" id="X_COORD" name="X_COORD" value="${X_COORD}"> 
<input type="hidden" id="Y_COORD" name="Y_COORD" value="${Y_COORD}"> 
<input type="hidden" id="WITH_PNU" name="WITH_PNU" value="${WITH_PNU}">
<input type="hidden" id="PURPOSE_CD" name="PURPOSE_CD" value="${board.PURPOSE_CD }">
<input type="hidden" id="SHOP_IMG_NAME" name="SHOP_IMG_NAME" value="${board.SHOP_IMG_NAME}">
<input type="hidden" id="SHOP_IMG2_NAME" name="SHOP_IMG2_NAME" value="${board.SHOP_IMG2_NAME}">
<input type="hidden" id="FLAG" name="FLAG" value="3">
	
<table width="780" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td align="left" class="contborder_blue">
		<table width="100%" border="0" cellspacing="0" cellpadding="0">
			<tr>
				<td>
				<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse: collapse;" cellpadding="0" cellspacing="0" class="sub_table">
					<tr>
						<td height="34px" colspan="4" bgcolor="#FFFFFF" class="table_bl_left">
							<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
								<tr>
									<td width="80" align="center">
										<span class="sub_stan_blue">* 시설정보</span>
									</td>
								</tr>
							</table>
						</td>
					</tr>
					
					<tr>
						<td width="12%" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">
						<c:choose>
							<c:when test="${board.MANAGE_TYP == '0'}">
									조사년도
							</c:when>
							<c:otherwise>
									등록구분
							</c:otherwise>
						</c:choose>
						</td>
						<td colspan="3" bgcolor="f6f6f6" class="table_bl_left">
								<select id="SURVEY_YEAR" name="SURVEY_YEAR" class="essential" style="width:100px;display: none;">
								</select>
								<select id="MANAGE_TYP" name="MANAGE_TYP" class="essential" style="width:100px;display: none;" onchange="changeMgTyp();">
									${mg_typ}
								</select>
						</td>
					</tr>
					<!--  //********** BEGIN_현진_20120313 -->
					<c:if test="${board.MANAGE_TYP == '0'}">
					<tr>
                        	<td width="12%" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">구간번호</td>
                            <td colspan="3" bgcolor="f6f6f6" class="table_bl_left">
                            	<select id="GU_CD" name="GU_CD" class="input_form1" style="width:100px" onchange="changeGuCd(this);">${GU_CODE}</select>
								<select name="GUGAN_CD" id="GUGAN_CD" style="width:200px" class="input_form1"  onchange="changeGugan();">${GUGAN_CD_LIST }</select>
								등록번호 <input type="hidden" name="REG_SEQ" id="REG_SEQ" class="input_form1" readonly value="${board.REG_SEQ }"/>
								<input type="text" name="REG_NAME" id="REG_NAME" class="input_form1" readonly  value="${board.REG_NAME }"/>
								<input type="button" class="input_form1" value="생성" onClick="javascript:regnameCreate();"/>
                            </td>
					</tr>
					</c:if>
					<!--   //********** END_현진_20120313 -->
					<tr>
						<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">인접지 지번<br>(공시지가<br>&nbsp;적용지번)</td>
						<td colspan="3" bgcolor="f6f6f6" class="table_bl_left">
						<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
							<tr>
								<td width="76px">${SIDO_NM}&nbsp;&nbsp;${SIGUNGU}&nbsp;&nbsp;</td>
								<td>
								<select id="BJ_CD" name="BJ_CD" class="essential" style="width: 100px">
									${bjdong_code}
								</select>
								</td>
								<td>&nbsp; <select id="HJ_CD" name="HJ_CD" class="essential" style="width: 100px">
									${hjdong_code}
								</select></td>
								<td width="16px" align="center">/</td>
								<td>
									<select id="SPC_CD" name="SPC_CD" class="essential" style="width: 75px">
										<option value="1">일반번지</option>
										<option value="2">산번지</option>
									</select>
								</td>
								<td width="10px">&nbsp;</td>
								<td>
									<input id="BONBUN" name="BONBUN" value="${BONBUN}" type="text" class="essential" style="width: 50px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);" maxlength="4">
								</td>
								<td width="16px" align="center">-</td>
								<td>
									<input id="BUBUN" name="BUBUN" value="${BUBUN}" type="text" class="input_form1" style="width: 50px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);" maxlength="4">
								</td>
								<td width="30px" align="center">번지</td>
								<td>

								</td>
							</tr>
						</table>
						</td>
					</tr>
<!-- 인접지 도로명주소 추가 #mr-->
					<tr>
						<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">인접지 도로명주소</td>
						<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
							<img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0" onclick="javascript:openZipcodePopup_new('', '', 'form.WITH_DORO_NM', '', '', '', '','','', '');" style="cursor: pointer; vertical-align: middle;">
							<input id="WITH_DORO_NM" name="WITH_DORO_NM" type="text" class="essential" value="${WITH_DORO_NM}" style="width:250px" onclick="javascript:openZipcodePopup_new('', '', 'form.WITH_DORO_NM', '', '', '', '','','', '');" maxlength="120">
							<input id="WITH_BD_BON" name="WITH_BD_BON" type="text" class="essential" value="${WITH_BD_BON}" style="width:25px"/>
							-<input id="WITH_BD_BU" name="WITH_BD_BU" type="text" class="essential" value="${WITH_BD_BU}" style="width:25px"/>
							<br><font color="blue">* 수정 시, 검색  버튼을 클릭 후, 팝업창에서 도로명 주소로 검색 후 해당 도로명 주소를 선택</font>
						</td>
					</tr>					
<!-- #mr --> 					
					<tr>
						<td height="26px" width="15%" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap>점용지 위치</td>
						<td width="35%" bgcolor="f6f6f6" class="table_bl_left" nowrap>
							<img src="/img/loca_icon2.gif" alt="위치등록" id="LocReg" width="64" height="18" border="0" onClick="javascript:jumyongZibun('${SIDO}','${SIGU_CD}');" style="CURSOR:pointer;vertical-align: middle;">
							<input id="WITH_ADDR" name="WITH_ADDR" type="text" class="input_form1" style="width:150px" value="${board.WITH_ADDR}" maxlength="50">
						</td>
						<td width="50%" align="center" bgcolor="f6f6f6" class="table_bl_left" style="border:0px;margin:0px;padding:0px" rowspan="5" nowrap colspan="2">
						<table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0" class="sub_table">
							<tr>
							<td height="26px" width="50%" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap>
								정비전 사진
							</td>
							
							<td width="50%" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap>
								정비후 사진
							</td>
							
							</tr>
							<tr>
								<td height="26px">
									<input type="file" id="SHOP_IMG" name='SHOP_IMG' class="input_form1" size="12" onchange="ChangeImg(this,'SHOP_IMG_PREVIEW');"/>
								</td>
								<td>
									<input type="file" id="SHOP_IMG2" name='SHOP_IMG2'  class="input_form1" size="12" onchange="document.getElementById('SHOP_IMG2_NAME').value = this.value;ChangeImg(this,'SHOP_IMG2_PREVIEW');"/>
								</td>
							</tr>
							<tr>
								<td height="112px" id="SHOP_IMG_PREVIEW" style="background-repeat: no-repeat; background-attachment: inherit;"></td>
								<td id="SHOP_IMG2_PREVIEW" style="background-repeat: no-repeat; background-attachment: inherit;"></td>
							</tr>

						</table>
						</td>

					</tr>
					<tr>
						<td width="15%" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">도로 지번</td>
						<td bgcolor="f6f6f6" class="table_bl_left">
							<input id="JIBUN" name="JIBUN" type="text" class="input_form1" style="width:220px" value="${board.JIBUN}">
						</td>
					</tr>
					<tr>
						<td width="15%" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">주변정보</td>
						<td bgcolor="f6f6f6" class="table_bl_left">
							<input id="WITH_INFO" name="WITH_INFO" type="text" class="input_form1" style="width:220px" value="${board.WITH_INFO}">
						</td>
					</tr>
					<tr>
						<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">
	                        <div id="REG_DATE_CONTENT">
	                        </div>
						</td>
						<td bgcolor="f6f6f6" class="table_bl_left">
							<input id="REG_DATE" name="REG_DATE" type="text" class="input_form1" style="width:120px;" value="${board.REG_DATE}"  readonly>
	                		<img src="/img/calendar_icon.gif" width="19" height="16" border="0" onClick="popUpCalendar(this, document.getElementById('REG_DATE'), 'yyyymmdd')" style="CURSOR:pointer;vertical-align: middle;">
						</td>
					</tr>

					<tr>
						<td height="52px" align="center" bgcolor="e5eff8" class="sub_table_b">시설종류/<br>형태/유형별</td>
						<td bgcolor="f6f6f6" class="table_bl_left" style="vertical-align: top;">
		                    <table border="0" cellpadding="0" cellspacing="0" class="sub_stan" >
                               	<tr>
                                    <td height="26px">
                                    	<select id="FT_TYP" name="FT_TYP" class="essential" style="width: 100px" onchange="SelectedFTTYP();">
										</select>
										<select id="FT_SEL" name="FT_SEL" class="essential" style="width: 130px" onchange="ChangeFTSEL(this);">
										</select>
                                  	</td>
                               	</tr>
                               	<tr id="FT_CAL_ROW" name="FT_CAL_ROW" style="display: none;">
                                    <td height="26px">
                                    	<select id="FT_CAT" name="FT_CAT" class="essential" style="width: 130px">
                                    		${ft_cat}
										</select>
									</td>
                            	</tr>
                            </table>
						</td>
					</tr>
					<tr>
						<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">점용면적</td>
						<td bgcolor="f6f6f6" class="table_bl_left">
						<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
							<tr>
								<td>
									<input id="PLACE_L" name="PLACE_L" value="${board.PLACE_L}" type="text" class="essential" style="width: 40px" onKeyPress="nr_num_float(this),Jumji_CalPlaceSize();" onKeyUp="nr_num_float(this),Jumji_CalPlaceSize();" maxlength="5"></td>
								<td width="16" align="center">m</td>
								<td width="12" align="center">x</td>
								<td>
									<input id="PLACE_H" name="PLACE_H" value="${board.PLACE_H}" type="text" class="essential" style="width: 40px" onKeyPress="nr_num_float(this),Jumji_CalPlaceSize();" onKeyUp="nr_num_float(this),Jumji_CalPlaceSize();" maxlength="5"></td>
								<td width="16" align="center">m</td>
								<td width="12" align="center">=</td>
								<td>
									<input id="PLACE_A" name="PLACE_A" value="${board.PLACE_A}" type="text" class="essential" style="width: 60px" onKeyPress="nr_num_float(this);" onKeyUp="nr_num_float(this);" maxlength="5" readonly="readonly">
								</td>
								<td width="16" align="center">㎡</td>
							</tr>
						</table>
						</td>
					</tr>

					<tr>
						<td width="15%" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">보관장소</td>
						<td width="35%" bgcolor="f6f6f6" class="table_bl_left">
							<select id="DP_SEL" name="DP_SEL" class="input_form1" style="width: 76px">
								${dp_sel}
							</select>
							<input id="DP_TXT" name="DP_TXT" type="text" class="input_form1" style="width: 150px" value="${board.DP_TXT}" maxlength="50">
						</td>
						<td width="15%" align="center" bgcolor="e5eff8" class="sub_table_b">거리조성</td>
						<td width="35%" bgcolor="f6f6f6" class="table_bl_left">
			                <input name="SPECIAL_ST" type="radio" value="1" onclick="check_special_st();" style="vertical-align: middle;" <c:if test="${board.SPECIAL_ST == '1'}">checked</c:if>>일반거리
                            <input name="SPECIAL_ST" type="radio" value="0" onclick="check_special_st();" style="vertical-align: middle;" <c:if test="${board.SPECIAL_ST != '1'}">checked</c:if>>특화거리
                            <span id="SPECIAL_DATE_SPAN" style="display: inline-block;">
                            /조성일자:
                            <input id="SPECIAL_DATE" name="SPECIAL_DATE"  type="text" class="essential" value="${rnic:addDash(board.SPECIAL_DATE)}" style="width:60px;vertical-align: middle;" readonly>
							<img src="/img/calendar_icon.gif" width="19" height="16" border="0" onClick="popUpCalendar(this, document.getElementById('SPECIAL_DATE'), 'yyyymmdd')" style="CURSOR:pointer;vertical-align: middle;">
                            </span>
						</td>
					</tr>
					<tr>
						<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">정비/관리</td>
						<td colspan="1" bgcolor="f6f6f6" class="table_bl_left">
							<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
								<tr>
									<td>
										<input id="MAINTN_OB" name="MAINTN_OB" type="radio" value="1" <c:if test="${board.MAINTN_OB == '1'}">checked</c:if>>
									</td>
									<td width="50px">관리대상</td>
									<td>
										<input id="MAINTN_OB" name="MAINTN_OB" type="radio" value="0" <c:if test="${board.MAINTN_OB != '1'}">checked</c:if>>
									</td>
									<td width="50px">정비대상</td>
									<td>
										<select id="MT_SEL" name="MT_SEL" class="input_form1" style="width: 76px">
											${mt_sel}
										</select>
									</td>
								</tr>
							</table>
						</td>
                    	<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b"><span id="CAR_NO_SPAN" style="display: none;">차량번호</span></td>
                        <td colspan="1" bgcolor="f6f6f6" class="table_bl_left">
                        	<input id="CAR_NO" name="CAR_NO" type="text" value="${board.CAR_NO}" class="input_form1" style="width: 76px;display: none;" maxlength="10">
                    	</td>
					</tr>


					<tr>
						<td height="34px" colspan="4" bgcolor="#FFFFFF" class="table_bl_left">
						<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
							<tr>
								<td width="80" align="center">
									<span class="sub_stan_blue">*	운영정보</span>
								</td>
							</tr>
						</table>
						</td>
					</tr>

					<tr>
						<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">취급품목</td>
						<td colspan="1" bgcolor="f6f6f6" class="table_bl_left">
							<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
								<tr>
									<td>
										<select id="SG_TYP" name="SG_TYP" class="input_form1" style="width: 76px">
											${sg_typ}
										</select>
									</td>
	
									<td>
										<input id="LIQUOR_SL" name="LIQUOR_SL" type="checkbox" <c:if test="${board.LIQUOR_SL == '1'}">value='1' checked</c:if> <c:if test="${board.LIQUOR_SL != '1'}">value='0'</c:if>>
									</td>
									<td width="75px">주류판매</td>
									<td>
										<input id="LPGAS_US" name="LPGAS_US" type="checkbox" <c:if test="${board.LPGAS_US == '1'}">value='1' checked</c:if> <c:if test="${board.LPGAS_US != '1'}">value='0'</c:if>>
									</td>
									<td width="75px">LPG 사용</td>
								</tr>
							</table>
						</td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">영업인원</td>
						<td bgcolor="f6f6f6" class="table_bl_left">
							<input id="MEM_NUM" name="MEM_NUM" value="${board.MEM_NUM}" class="input_form1" style="width: 76px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, OPEN_TIME1, 2);" maxlength="2">(운영자 본인 포함)
						</td>
					</tr>
					<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">일매출액</td>
						<td bgcolor="f6f6f6" class="table_bl_left" colspan='3'>
							<input id="DAY_SALES" name="DAY_SALES" value="${board.DAY_SALES}" type="text" class="input_form1" style="width: 76px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);" maxlength="8"> 원
						</td>
					</tr>
					<tr>
						<td height="26" align="center" bgcolor="e5eff8"
							class="sub_table_b">운영시간</td>
						<td bgcolor="f6f6f6" class="table_bl_left">
						<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
							<tr>
								<td>
									<input id="OPEN_TIME1" name="OPEN_TIME1" value="${board.OPEN_TIME1}" type="text" class="input_form1" style="width: 30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);count_check(this, OPEN_TIME2, 2);" maxlength="2">
								</td>
								<td width="12" align="center">:</td>
								<td width="16" align="center">
									<input id="OPEN_TIME2" name="OPEN_TIME2" value="${board.OPEN_TIME2}" type="text" class="input_form1" style="width: 30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);count_check(this, CLOSE_TIME1, 2);" maxlength="2">
								</td>
								<td width="12" align="center">~</td>
								<td>
									<input id="CLOSE_TIME1" name="CLOSE_TIME1" value="${board.CLOSE_TIME1}" type="text" class="input_form1" style="width: 30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);count_check(this, CLOSE_TIME2, 2);" maxlength="2">
								</td>
								<td width="12" align="center">:</td>
								<td>
									<input id="CLOSE_TIME2" name="CLOSE_TIME2" value="${board.CLOSE_TIME2}" type="text" class="input_form1" style="width: 30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);" maxlength="2">
								</td>
							</tr>
						</table>
						</td>
						<td align="center" bgcolor="e5eff8" class="sub_table_b">가입단체</td>
						<td bgcolor="f6f6f6" class="table_bl_left">
							<select id="UN_TYP" name="UN_TYP" class="input_form1" style="width: 76px">
							${un_typ}
							</select>
							<input id="UN_TXT" name="UN_TXT" value="${board.UN_TXT}" type="text" class="input_form1" style="width: 158px" maxlength="50">
						</td>

					</tr>
					<tr>
						<td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">기타정보</td>
						<td bgcolor="f6f6f6" class="table_bl_left" colspan="3">
							<input id="NOTES" name="NOTES" value="${board.NOTES}" type="text" class="input_form1" style="width:600px" maxlength="255">
						</td>
					</tr>
				</table>
				</td>
			</tr>
			<tr>
				<td height="40" align="right">
					<img src="/img/can_icon.gif" alt="취소" width="56" height="18" border="0" onclick="javascript:Cancel('${GAPAN_NO}')" style="cursor: pointer;">
					<img src="/img/save_icon2.gif" alt="저장" width="56" height="18" border="0" onclick="javascript:ModifyPrc()" style="cursor: pointer;">
				</td>
			</tr>
		</table>
		</td>
	</tr>
</table>


</form>

</body>
</html>