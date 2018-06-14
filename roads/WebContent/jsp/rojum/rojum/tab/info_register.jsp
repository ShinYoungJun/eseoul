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
                background-image: url/img/left_back.gif);
            }
            -->
        </style>
        <link href="/css/roads.css" rel="stylesheet" type="text/css">
    </head>
    
	<script language="javascript" src="/js/common.js"></script>
	<script language="javascript" src="/js/calculation.js"></script>
	<script language="javascript" src="/js/selectItem.js"></script>
    <script language="javascript" src="/js/PopupCalendar.js"></script>
    <script language='JavaScript' src='/js/Check_inputbox.js'></script>
    <script language="javascript" src="/js/Ajax_request.js"></script>
    <script language='JavaScript' src='/jsp/rojum/rojum/tab/info_register.js'></script>

    <script type="text/javascript">
        //<![CDATA[

        function	RegisterPrc()
        {
            if(!DataCheckRegister())
                return false;

            var form = document.form;
            var BJ_CD = form.BJ_CD.value;
            var SPC_CD = form.SPC_CD.value;
            var BONBUN = form.BONBUN.value;
            var BUBUN = form.BUBUN.value;


            var PNU = '${SIDO}'+'${SIGU_CD}'+BJ_CD+SPC_CD+addZero(BONBUN,4)+addZero(BUBUN,4);;

            form.WITH_PNU.value = PNU;	//PNU 파라메터에 값  세팅

            form.action = "/rojum/jumyong/info_registerprc.do";
            form.submit();
        }


        //라디오 버튼 및 체크 버튼의 테두리 없애는 함수
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
            var form 	= document.form;
            var	str		= "";
            var tabs = document.getElementById('tabmenu');
            var tab = tabs.getElementsByTagName('a'); // 탭 요소
            var contents = document.getElementById('tabcontents');
            var content = getElementsByClassName('tabcontent',contents); // 컨텐츠 요소 class

            if(form.BJ_CD.value.length	< 1)
            {
                str	+= "점용지 동을 선택 하세요\n";
                alert(str);
                form.BJ_CD.focus();
                return;
            }
            else if(form.SPC_CD.value.length	< 1)
            {
                str	+= "점용지 번지종류를 선택 하세요\n";
                alert(str);
                form.SPC_CD.focus();
                return;
            }
         

            var BJ_CD = form.BJ_CD.value;
            var SPC_CD = form.SPC_CD.value;
            var BONBUN = form.BONBUN.value;
            var BUBUN = form.BUBUN.value;
            var FLAG = "GAPAN";
            var addNum = "";

            var PNU = SIDO+SIGU_CD+BJ_CD+SPC_CD+addZero(BONBUN,4)+addZero(BUBUN,4);		//PNU값 생성

            //ADDR 생성
            var ADDR = '${SIDO_NM}' + ' ' + '${SIGUNGU}' + ' ' + form.BJ_CD.options[form.BJ_CD.selectedIndex].text + ' ';

            if(form.SPC_CD.options[form.SPC_CD.selectedIndex].text == "산번지"){
                ADDR = ADDR + '산'  + ' ';
            }

            ADDR = ADDR + BONBUN;

            if(BUBUN.length > 0){
                ADDR = ADDR + '-' + BUBUN;
            }

            form.WITH_PNU.value = PNU;	//PNU 파라메터에 값  세팅

            //		alert(ADDR);
            //		alert(form.OWNER_NAME.value);
            //		alert(PNU);
            
            var url = "/map/miniMap.do?ADDR="+ADDR+"&PNU="+PNU+"&FLAG="+FLAG+"&OWNER_NAME=${board.OWNER_NAME}&X="+form.X_COORD.value+"&Y="+form.Y_COORD.value;
            //		alert(url);

            cw=screen.availWidth; // 화면 너비
            ch=screen.availHeight; // 화면 높이

            sw=850;// 띄울 창의 너비
            sh=780;// 띄울 창의 높이

            ml=(cw-sw)/2;// 가운데 띄우기위한 창의 x위치
            mt=(ch-sh)/2;// 가운데 띄우기위한 창의 y위치

            var param = 'width='+sw+',height='+sh+',top='+mt+',left='+ml+',resizable=no, status=no, scrollbars=no, toolbar=no, menubar=no';

            window.open(url, "minimap", param);
        }


        function owner_list(owner_name)
        {

    	    if(owner_name == ''){
    		    alert('검색해야할 운영자명를 입력하세요');
    		    return;
    	    }
    	    var winH = 340;
            var winW = 480;
            var top = parseInt(screen.height-winH)/2;
    		var left = parseInt(screen.width-winW)/2;
            var status ="toolbar=no, location=no, directories=no, status=no, menubar=no, resizable=no, scrollbars=no, width="+winW+", height="+winH+", left="+left+", top="+top;
            window.open('/rojum/jumyong/owner_list.do?OWNER_NAME='+owner_name+'&mode=full', 'win', status);
        }

        function Click_OwnerChk(obj){
	        if(obj.checked == true)
	        {

		        // 운영자 미확인
		        document.getElementById('OWNER_NAME').value = '미확인';
		        document.getElementById('OWNER_SSN1').value = '111111';
		        document.getElementById('OWNER_SSN2').value = '1111111';
		        document.getElementById('OWNER_HP1').value = '111';
		        document.getElementById('OWNER_HP2').value = '1111';
		        document.getElementById('OWNER_HP3').value = '1111';


		        document.getElementById('OWNER_NAME').style.color = 'blue';
		        document.getElementById('OWNER_SSN1').style.color = 'blue';
		        document.getElementById('OWNER_SSN2').style.color = 'blue';
		        document.getElementById('OWNER_HP1').style.color = 'blue';
		        document.getElementById('OWNER_HP2').style.color = 'blue';
		        document.getElementById('OWNER_HP3').style.color = 'blue';
		        


		        document.getElementById('OWNER_NAME').readOnly = true;
		        document.getElementById('OWNER_SSN1').readOnly = true;
		        document.getElementById('OWNER_SSN2').readOnly = true;
		        document.getElementById('OWNER_HP1').readOnly = true;
		        document.getElementById('OWNER_HP2').readOnly = true;
		        document.getElementById('OWNER_HP3').readOnly = true;

	        }
	        else
	        {
		        // 운영자 확인
		        document.getElementById('OWNER_NAME').value = '';
		        document.getElementById('OWNER_SSN1').value = '';
		        document.getElementById('OWNER_SSN2').value = '';
		        document.getElementById('OWNER_HP1').value = '';
		        document.getElementById('OWNER_HP2').value = '';
		        document.getElementById('OWNER_HP3').value = '';

		        document.getElementById('OWNER_NAME').style.color = 'gray';
		        document.getElementById('OWNER_SSN1').style.color = 'gray';
		        document.getElementById('OWNER_SSN2').style.color = 'gray';
		        document.getElementById('OWNER_HP1').style.color = 'gray';
		        document.getElementById('OWNER_HP2').style.color = 'gray';
		        document.getElementById('OWNER_HP3').style.color = 'gray';

		        document.getElementById('OWNER_NAME').readOnly = false;
		        document.getElementById('OWNER_SSN1').readOnly = false;
		        document.getElementById('OWNER_SSN2').readOnly = false;
		        document.getElementById('OWNER_HP1').readOnly = false;
		        document.getElementById('OWNER_HP2').readOnly = false;
		        document.getElementById('OWNER_HP3').readOnly = false;
	        }
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

            if(ft_typ.length > 0 && document.getElementById('FLAG').value == '2'){
                document.getElementById("FT_TYP").options.value = ft_typ;
            };

            if(ft_sel.length > 0 && document.getElementById('FLAG').value == '1'){
                document.getElementById("FT_SEL").options.value = ft_sel;
            };

            document.getElementById('FLAG').value = parseInt(document.getElementById('FLAG').value) - 1;

        }

        function	SelectedFTTYP()
        {
            var	FT_TYP	= getValueSelectTag("FT_TYP");

            var	param	= "FT_TYP="+FT_TYP;

            sendRequest("/gapan/jumyonginfo/get_ft_sel.do", param, "GET", ResultFTTYP);
        }

        function	SelectedGPTYP()
        {
            var	param	= "GP_TYP="+'002';
            sendRequest("/gapan/jumyonginfo/get_ft_typ.do", param, "GET", ResultGPTYP);

        }




        function	ResultFTTYP(obj)
        {
            fncSelectBoxSetting(obj, "FT_SEL", "EEE", "::선택::");
        }

        function	ResultGPTYP(obj)
        {
            fncSelectBoxSetting(obj, "FT_TYP", "EEE", "::선택::");
            SelectedFTTYP();
        }


        function changePickupYn(){

        	var targetTag = getValueSelectTag("PICKUP_YN");

        	var _pickupYnContent = document.getElementById("PICKUP_YN_CONTENT");
            var _pickupYnDate = document.getElementById("PICKUP_YN_DATE");
        	var _pickupFoundDate = document.getElementById("PICKUP_FOUND_DATE");


        	if(targetTag == '0'){
        		_pickupYnContent.innerHTML = "설치일자";
        		_pickupFoundDate.style.visibility = "visible";
        		_pickupFoundDate.value = "";
        		_pickupYnDate.style.visibility = "visible";
        	}else if(targetTag == '1'){
        		_pickupYnContent.innerHTML = "수거일자";
        		_pickupFoundDate.style.visibility = "visible";
        		_pickupFoundDate.value = "";
        		_pickupYnDate.style.visibility = "visible";
        	}else{
        		_pickupYnContent.innerHTML = "";
        		_pickupFoundDate.style.visibility = "hidden";
        		_pickupFoundDate.value = "";
        		_pickupYnDate.style.visibility = "hidden";
        	}
        }
        
        //]]>
    </script>


<body >

        <form name="form" method="post" enctype="multipart/form-data">
            <input type="hidden" name="UserType">
            <input type="hidden" name="UserSection">
            <input type="hidden" name="PURPOSE_CD" >
            <input type="hidden" name="MIN_CHECK" >
            <input type="hidden" name="MIN_PROCESS" >
            <input type="hidden" name="GIGAN1" >
            <input type="hidden" name="GIGAN2" >
            <input type="hidden" name="MIN_NAME" >
            <input type="hidden" name="MIN_REQNO" value="}">
            <input type="hidden" name="NOWTAB" value="0">
            <input type="hidden" name="WITH_PNU" >
            <input type="hidden" name="GP_TYP" value="002"> 
            <input name="ATTACH_FILE" id="ATTACH_FILE" type="hidden" class="input_form1" style="width:140px" >
            <input name="ATTACH_SIZE" id="ATTACH_SIZE" type="hidden" class="input_form1" style="width:45px" >
            <input name="TAX_SET"  id="TAX_SET" type="hidden" value="50">
            <input type="hidden" name="FLAG" value="2">
            

<table width="780" border="0" cellpadding="0" cellspacing="0">
    <tr>
        <td align="left">
            <table width="780" border="0" cellspacing="0" cellpadding="0">
                <tr>
                    <td height="22" background="/img/tab_line_purple.gif">
                        <table border="0" cellspacing="0" cellpadding="0">
                            <tr>
                            <ul id="tabmenu">
	                             <td width="111"><a><img src="/img/sub_petition_title10_off.gif" alt="시설/운영 정보" width="110" height="22" border="0" onclick="Init();" style="CURSOR: Hand;"></a></td>
	                             <td width="111"><a><img src="/img/sub_gapan_title4_on.gif" alt="운영자 정보" width="110" height="22" border="0" onclick="Init(); " style="CURSOR: Hand;"></a></td>
                            </ul>
                            </tr>
                        </table>
                    </td>
                </tr>
            </table>
        </td>
    </tr>
    <tr>
        <td align="left" class="contborder_purple">
            <div id="tabcontents">
				<div class="tabcontent" id="tab1">
                    <table width="100%" border="0" cellspacing="0" cellpadding="0">
                        <tr>
                            <td>
                                <table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                                	<tr>
										<td height="34" colspan="4" bgcolor="#FFFFFF" class="table_bl_left">
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
                                        <td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">등록구분</td>
                                        <td colspan="3" bgcolor="f6f6f6" class="table_bl_left">
                                        	<select name="PICKUP_YN" class="essential" style="width:100px" onchange="changePickupYn();">
                                            	 ${yn_pkp}
                                            </select>
                                        </td>
                                    </tr>
                                    

                                    <tr>
                                        <td height="50px" align="center" bgcolor="e5eff8" class="sub_table_b">인접지 지번<br>(공시지가<br>&nbsp;적용지번)</td>
                                        <td colspan="3" bgcolor="f6f6f6" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                                                <tr>
                                                    <td width="76">${SIDO_NM}&nbsp;&nbsp;${SIGUNGU}&nbsp;&nbsp;</td>
                                                    <td>
                                                    	<select name="BJ_CD" class="essential" style="width:100px">
                                                            ${bjdong_code}
                                                        </select>
                                                    </td>
                                                    <td>&nbsp;
                                                        <select name="HJ_CD" class="essential" style="width:100px">
                                                            ${hjdong_code}
                                                        </select>
                                                    </td>
                                                    <td width="16" align="center">/</td>
                                                    <td>
                                                        <select name="SPC_CD" class="essential" style="width:75px">${mul_spc_cd}
                                                        </select>
                                                    </td>
                                                    <td width="10">&nbsp;</td>
                                                    <td><input name="BONBUN"  type="text" class="essential" style="width:50px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);" maxlength="4"></td>
                                                    <td width="16" align="center">-</td>
                                                    <td><input name="BUBUN"  type="text" class="input_form1" style="width:50px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);" maxlength="4"></td>
                                                    <td width="30" align="center">번지</td>
                                                    <td>
                                                    
                                                </tr>
                                            </table>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b" width="100" nowrap>점용지 위치</td>
                                        <td bgcolor="f6f6f6" class="table_bl_left" nowrap>
                                        	<img src="/img/loca_icon2.gif" alt="위치등록" id="LocReg" width="64" height="18" border="0" onClick="javascript:jumyongZibun('${SIDO}','${SIGU_CD}');" style="CURSOR:Hand;">
                                            <input name="WITH_ADDR" type="text" class="input_form1" style="width:195px"  maxlength="50">
                                            <input type="hidden" name="X_COORD"  class="input_form1" style="width:10px">
            								<input type="hidden" name="Y_COORD"  class="input_form1" style="width:10px">
                                            
                                        </td>
                                        <td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b" rowspan="5" colspan="2" nowrap>
				                            <table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0" class="sub_table">
												<tr>
												<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b" width="50%" nowrap>
													정비전 사진
												</td>
												
												<td align="center" bgcolor="e5eff8" class="sub_table_b" width="50%" nowrap>
													정비후 사진
												</td>
												
												</tr>
												<tr>
													<td height="26px">
														<input type="file" id="SHOP_IMG" name='SHOP_IMG' class="input_form1" size="12" onchange="ChangeImg(this,'SHOP_IMG_PREVIEW');"/>
													</td>
													<td>
														<input type="file" id="SHOP_IMG2" name='SHOP_IMG2'  class="input_form1" size="12" onchange="ChangeImg(this,'SHOP_IMG2_PREVIEW');"/>
													</td>
												</tr>
												<tr>
													<td height="78px" id="SHOP_IMG_PREVIEW" style="background-repeat: no-repeat; background-attachment: inherit;"></td>
													<td id="SHOP_IMG2_PREVIEW" style="background-repeat: no-repeat; background-attachment: inherit;"></td>
												</tr>
					
											</table>
					                                        
                                            
                                        </td>

                                    </tr>
                                    <tr>
                                        <td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">주변정보</td>
                                        <td bgcolor="f6f6f6" class="table_bl_left">
                                        	<input name="WITH_INFO" type="text" class="input_form1" style="width:264px" >
                                       	</td>
                                    </tr>
                                    <tr>
                                        <td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">
	                                        <div id="PICKUP_YN_CONTENT">
	                                        </div>
                                       	</td>
                                        <td bgcolor="f6f6f6" class="table_bl_left">
                                        	<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                                                <tr>
                                                    <td>
                                                    <div id="PICKUP_YN_DATE" style="visibility:hidden;">
                                                   		<input id="PICKUP_FOUND_DATE" name="PICKUP_FOUND_DATE" type="text" class="input_form1" style="width:120px;visibility:hidden;"  readonly>
                                                   		<img src="/img/calendar_icon.gif" width="19" height="16" border="0" onClick="popUpCalendar(this, document.getElementById('PICKUP_FOUND_DATE'), 'yyyymmdd')" style="CURSOR:pointer;">
                                                 	</div>
                                                    </td>
                                                </tr>
                                            </table>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td align="center" bgcolor="e5eff8" class="sub_table_b">시설물명/형태 </td>
                                        <td bgcolor="f6f6f6" class="table_bl_left">
                                        	<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                                                <tr>
													<td>
														<select id="FT_TYP" name="FT_TYP" class="essential" style="width: 100px" onchange="SelectedFTTYP();">
															<option value="">::선택::</option>
															<option value="021">거리가게</option>
															<option value="022">적치물</option>
															
														</select>
													</td>
													<td width="16" align="center">/</td>
													<td>
														<select id="FT_SEL" name="FT_SEL" class="essential" style="width: 100px">
														</select>
													</td>
                                                </tr>
                                            </table>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td align="center" bgcolor="e5eff8" class="sub_table_b">점용면적</td>
                                        <td bgcolor="f6f6f6" class="table_bl_left">
                                      		<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                                                <tr>
                                                    <td><input name="PLACE_L" type="text" class="essential" style="width:40px" onKeyPress="nr_num_float(this),Jumji_CalPlaceSize();" onKeyUp="nr_num_float(this),Jumji_CalPlaceSize();" maxlength="5"></td>
                                                    <td width="16px" align="center">m</td>
                                                    <td width="12px" align="center">x</td>
                                                    <td><input name="PLACE_H" type="text" class="essential" style="width:40px" onKeyPress="nr_num_float(this),Jumji_CalPlaceSize();" onKeyUp="nr_num_float(this),Jumji_CalPlaceSize();" maxlength="5"></td>
                                                    <td width="16px" align="center">m</td>
                                                    <td width="12px" align="center">=</td>
                                                    <td><input name="PLACE_A" type="text" class="essential" style="width:40px" onKeyPress="nr_num_float(this);" onKeyUp="nr_num_float(this);" maxlength="5" readonly="readonly"></td>
                                                    <td width="16px" align="center">㎡</td>
                                                </tr>
                                            </table>
                                         </td>
                                    </tr>

                                    <tr>
                                        <td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">보관장소</td>
                                        <td bgcolor="f6f6f6" class="table_bl_left">
                                        	<select name="DP_SEL" class="input_form1" style="width:76px">
                                                ${dp_sel}
                                            </select>
                                            <input name="DP_TXT" type="text" class="input_form1" style="width:184px"  maxlength="50"></td>
                                        <td align="center" bgcolor="e5eff8" class="sub_table_b">특화거리조성</td>
                                        <td bgcolor="f6f6f6" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                                                <tr>
                                                    <td><input name="SPECIAL_ST" type="radio" value="1" checked></td>
                                                    <td width="50px">일반거리</td>
                                                    <td><input name="SPECIAL_ST" type="radio" value="0"></td>
                                                    <td width="50px">특화거리</td>
                                                </tr>
                                            </table></td>
                                    </tr>
                                    <tr>
                                        <td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">정비대상여부</td>
                                        <td colspan="3" bgcolor="f6f6f6" class="table_bl_left"><table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                                                <tr>
                                                    <td>
                                                    	<input name="MAINTN_OB" type="radio" value="0" checked>
                                                   	</td>
                                                    <td width="50px">정비대상</td>
                                                    <td>
                                                    	<select name="MT_SEL" class="input_form1" style="width:76px">
                                                            ${mt_sel}
                                                        </select>
													</td>
													<td>
                                                    	<input name="MAINTN_OB" type="radio" value="1">
                                                   	</td>
                                                    <td width="50px">관리대상</td>
                                                </tr>
                                            </table></td>
                                    </tr>
                                    
									<tr>
										<td height="34px" colspan="4" bgcolor="#FFFFFF" class="table_bl_left">
										<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
											<tr>
												<td width="80px" align="center">
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
													<select name="SG_TYP" class="input_form1" style="width: 76px">
														${sg_typ}
													</select>
												</td>
				
												<td>
													<input name="LIQUOR_SL" type="checkbox" <c:if test="${board.LIQUOR_SL == '1'}">value='1' checked</c:if> <c:if test="${board.LIQUOR_SL != '1'}">value='0'</c:if>>
												</td>
												<td width="50px">주류판매</td>
												<td>
													<input name="LPGAS_US" type="checkbox" <c:if test="${board.LPGAS_US == '1'}">value='1' checked</c:if> <c:if test="${board.LPGAS_US != '1'}">value='0'</c:if>>
												</td>
												<td width="100px">LPG 사용</td>
											</tr>
										</table>
										</td>
										<td align="center" bgcolor="e5eff8" class="sub_table_b">영업인원</td>
										<td bgcolor="f6f6f6" class="table_bl_left">
											<input name="MEM_NUM"  class="input_form1" style="width: 76px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, OPEN_TIME1, 2);" maxlength="2">(운영자 본인 포함)
										</td>
									</tr>
									<tr>
										<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">일매출액</td>
										<td bgcolor="f6f6f6" class="table_bl_left">
											<input name="DAY_SALES"  type="text" class="input_form1" style="width: 76px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);" maxlength="8"> 원
										</td>
										<td align="center" bgcolor="e5eff8" class="sub_table_b">허가일자</td>
										<td bgcolor="f6f6f6" class="table_bl_left">
										<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
											<tr>
												<td>
													<input name="PERMIT_DATE"  type="text" class="input_form1" style="width: 76px" readonly>
												</td>
												<td>
													<img src="/img/calendar_icon.gif" width="19" height="16" border="0" onClick="popUpCalendar(this, document.getElementById('PERMIT_DATE'), 'yyyymmdd')" style="CURSOR:pointer;">
												</td>
											</tr>
										</table>
										</td>
									</tr>
									<tr>
										<td height="26px" align="center" bgcolor="e5eff8"
											class="sub_table_b">운영시간</td>
										<td bgcolor="f6f6f6" class="table_bl_left">
										<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
											<tr>
												<td>
													<input name="OPEN_TIME1"  type="text" class="input_form1" style="width: 30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);count_check(this, OPEN_TIME2, 2);" maxlength="2">
												</td>
												<td width="12px" align="center">:</td>
												<td width="16px" align="center">
													<input name="OPEN_TIME2"  type="text" class="input_form1" style="width: 30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);count_check(this, CLOSE_TIME1, 2);" maxlength="2">
												</td>
												<td width="12px" align="center">~</td>
												<td>
													<input name="CLOSE_TIME1"  type="text" class="input_form1" style="width: 30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);count_check(this, CLOSE_TIME2, 2);" maxlength="2">
												</td>
												<td width="12px" align="center">:</td>
												<td>
													<input name="CLOSE_TIME2"  type="text" class="input_form1" style="width: 30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);" maxlength="2">
												</td>
											</tr>
										</table>
										</td>
										<td align="center" bgcolor="e5eff8" class="sub_table_b">가입단체</td>
										<td bgcolor="f6f6f6" class="table_bl_left">
											<select name="UN_TYP" class="input_form1" style="width: 76px">
											${un_typ}
											</select>
											<input name="UN_TXT"  type="text" class="input_form1" style="width: 158px" maxlength="50">
										</td>
				
									</tr>
									<tr>
										<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">기타정보</td>
										<td bgcolor="f6f6f6" class="table_bl_left" colspan="3">
											<input name="NOTES"  type="text" class="input_form1" style="width:630px" maxlength="255">
										</td>
									</tr>
                                </table>
                            </td>
                        </tr>
                    </table>
                </div>
				<div class="tabcontent" style="display:none" id="tab2">
                    <table width="100%" border="0" cellspacing="0" cellpadding="0">
                        <tr>
                            <td>
                                <table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">
                                    <tr>
                                        <td width="100px" height="28px" align="center" bgcolor="e5eff8" class="sub_table_b">운영자명</td>
                                        <td width="37%" bgcolor="eaeaea" class="table_bl_left">
                                            <input name="OWNER_NAME" type="text" class="input_form1" style="width:100px"  maxlength="35">
                                            <img src="/img/search_icon.gif" style="cursor:pointer" onclick="owner_list(document.form.OWNER_NAME.value);">
                                            <input name="OWNER_IDCHK" type="checkbox" value="1" checked onclick="javascript:click_idchk(this);">신분증 확인
                                        </td>
                                        <td width="100" align="center" bgcolor="e5eff8" class="sub_table_b" rowspan="3">
											운영자 사진
                                        </td>
                                        <td bgcolor="eaeaea" class="table_bl_left" rowspan="3" align="center">
                                            <table>
                                                <tr>
                                                    <td>
                                                    <input type='file' id="OWNER_IMG" name='OWNER_IMG' class="input_form1" size="25" onchange="ChangeImg(this,'OWNER_IMG_PREVIEW');"/>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td width=100 height=130 id="OWNER_IMG_PREVIEW" style="background-repeat:no-repeat; background-attachment:scroll; background-position:50% 50%;"></td>
                                                    
                                                </tr>
                                            </table>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td width="100" align="center" bgcolor="e5eff8" class="sub_table_b">주민등록번호</td>
                                        <td bgcolor="eaeaea" class="table_bl_left">
                                            <input name="OWNER_SSN1" type="text" class="input_form1" style="width:40px; ime-mode:disabled"  onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, OWNER_SSN2, 6);" maxlength="6">
                                            - <input name="OWNER_SSN2" type="text" class="input_form1" style="width:45px; ime-mode:disabled"  onKeyPress="nr_num_int(this);" maxlength="7">
                                            <input name="OWNER_CHK" type="checkbox" onclick="javascript:Click_OwnerChk(this);">운영자 미확인                                        
                                        </td>
                                    </tr>
                                    <tr>
                                        <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">성별(나이)</td>
                                        <td bgcolor="eaeaea" class="table_bl_left">
                                            <input name="OWNER_GENDER" type="radio" value="1" checked>남
                                            <input name="OWNER_GENDER" type="radio" value="2" >여
                                            &nbsp;(
                                            <input name="OWNER_AGE" class="input_form1" type="text" style="width:20px" maxlength="3"  onKeyPress="nr_num_int(this);"> 세)
                                        </td>
                                    </tr>
                                    <tr>
                                        <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">전화번호</td>
                                        <td bgcolor="eaeaea" class="table_bl_left">
                                            <input name="OWNER_TEL1" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, OWNER_TEL2, 3);" maxlength="3"> -
                                            <input name="OWNER_TEL2" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, OWNER_TEL3, 4);" maxlength="4"> -
                                            <input name="OWNER_TEL3" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, OWNER_HP1, 4);" maxlength="4">
                                        </td>
                                        <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">휴대전화</td>
                                        <td bgcolor="eaeaea" class="table_bl_left" colspan="3">
                                            <input name="OWNER_HP1" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, OWNER_HP2, 3);" maxlength="3" > -
                                            <input name="OWNER_HP2" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, OWNER_HP3, 4);" maxlength="4"> -
                                            <input name="OWNER_HP3" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);" maxlength="4">
                                        </td>
                                    </tr>
                                    <tr>
                                        <td height="34" colspan="2" align="left" bgcolor="#FFFFFF" class="">
                                            <table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                                                <tr>
                                                    <td width="50%">
                                                        <span class="sub_stan_blue">* 주민등록지 주소</span>
                                                    </td>
                                                </tr>
                                            </table>
                                        </td>
                                        <td height="34" colspan="2" align="left" bgcolor="#FFFFFF" class="">
                                            <table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                                                <tr>
                                                    <td width="50%">
                                                        <span class="sub_stan_blue">* 실제거주지 : </span>
                                                        <input name="ADDR_CHECK1" type="checkbox" value="1" onclick="javascript:Jumin_toaddr_Check()" checked> 주민등록지 주소 정보와 동일
                                                    </td>
                                                </tr>
                                            </table>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
                                        <td bgcolor="eaeaea" class="table_bl_left">
                                            <table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                                                <tr>
                                                    <td><input name="OWNER_POST" type="text" style="width:50px" onFocus="Jumin_toaddr_Check();" onKeyPress="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  readonly class="input_form1"></td>
                                                    <td><a href="javascript:openZipcodePopup('form.OWNER_POST', 'form.OWNER_ADDR1');"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td>
                                                </tr>
                                            </table>
                                        </td>
                                        <td height="26" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
                                        <td bgcolor="eaeaea" class="table_bl_left">
                                            <table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                                                <tr>
                                                    <td><input name="OWNER_TOPOST" type="text" style="width:50px" onFocus="Jumin_toaddr_Check();" onKeyPress="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  readonly class="input_form1"></td>
                                                    <td><a href="javascript:openZipcodePopup('form.OWNER_TOPOST', 'form.OWNER_TOADDR1');"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td>
                                                </tr>
                                            </table>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td align="center" bgcolor="e5eff8" class="sub_table_b">기본 주소</td>
                                        <td bgcolor="eaeaea" class="table_bl_left">
                                            <input name="OWNER_ADDR1" type="text" class="input_form1" style="width:250px" onFocus="Jumin_toaddr_Check();" onKeyPress="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  readonly>
                                                       	산
                                            <input type="checkbox"  class="input_form1" name="OWNER_SAN" onclick="Jumin_toaddr_Check();"  onFocus="Jumin_toaddr_Check();" onKeyPress="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();">
                                            <input name="OWNER_BONBUN"  type="text" class="input_form1" style="width:27px" style="ime-mode:disabled" onFocus="Jumin_toaddr_Check(); nr_num_int(this); count_check(this, OWNER_BUBUN, 4);" onKeyUp="Jumin_toaddr_Check(); nr_num_int(this); count_check(this, OWNER_BUBUN, 4);" onKeyPress="Jumin_toaddr_Check(); nr_num_int(this); count_check(this, OWNER_BUBUN, 4);" maxlength="4">
														-
                                            <input name="OWNER_BUBUN"  type="text" class="input_form1" style="width:27px" style="ime-mode:disabled" onFocus="Jumin_toaddr_Check(); nr_num_int(this); count_check(this, OWNER_BUBUN, 4);" onKeyUp="Jumin_toaddr_Check(); nr_num_int(this); count_check(this, OWNER_ADDR2, 4);" onKeyPress="Jumin_toaddr_Check(); nr_num_int(this); count_check(this, OWNER_ADDR2, 4);" maxlength="4">
                                            <input name="OWNER_ADDR2" type="text" class="input_form1" style="width:130px" onFocus="Jumin_toaddr_Check();" onKeyPress="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  maxlength="50">
                                        </td>
                                        <td align="center" bgcolor="e5eff8" class="sub_table_b">기본 주소</td>
                                        <td bgcolor="eaeaea" class="table_bl_left">
                                            <input name="OWNER_TOADDR1" type="text" class="input_form1" style="width:250px" onFocus="Jumin_toaddr_Check();" onKeyPress="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  readonly>
														산<input type="checkbox"  class="input_form1" name="OWNER_TOSAN" onclick="Jumin_toaddr_Check();"  onFocus="Jumin_toaddr_Check();" onKeyPress="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();">
                                            <input name="OWNER_TOBONBUN"  type="text" class="input_form1" style="width:27px" style="ime-mode:disabled" onFocus="Jumin_toaddr_Check(); nr_num_int(this);" onKeyUp="Jumin_toaddr_Check(); nr_num_int(this); count_check(this, OWNER_TOBUBUN, 4);" onKeyPress="Jumin_toaddr_Check(); nr_num_int(this); count_check(this, OWNER_TOBUBUN, 4);" maxlength="4">
														- <input name="OWNER_TOBUBUN"  type="text" class="input_form1" style="width:27px" style="ime-mode:disabled" onFocus="Jumin_toaddr_Check(); nr_num_int(this);" onKeyUp="Jumin_toaddr_Check(); nr_num_int(this); count_check(this, OWNER_TOADDR2, 4);" onKeyPress="Jumin_toaddr_Check(); nr_num_int(this); count_check(this, OWNER_TOADDR2, 4);" maxlength="4">
                                            <input name="OWNER_TOADDR2" type="text" class="input_form1" style="width:130px"  onFocus="Jumin_toaddr_Check();" onKeyPress="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" maxlength="50">
                                        </td>
                                    </tr>
	                                <tr>
										<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">감면대상</td>
										<td bgcolor="eaeaea" class="table_bl_left" nowrap="nowrap" colspan="3">
											<select id="LT_SEL" name="LT_SEL" style="width:150px" class="input_form1">
												<option value="0">비대상자</option>
												<option value="1">기초생활수급자</option>
												<option value="2">한부모가족 보호대상자</option>
												<option value="3">장애인</option>
												<option value="4">국가유공자</option>
												<option value="5">미성년자</option>
											</select>
										</td>
									</tr>
									<tr>
										<td width="100" height="28" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">비고</td>
										<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
									        <textarea name="NOTE" id="NOTE" class="input_form1" style="width:98%" onkeyup="displayBytes(500, 'NOTE');">${board.NOTE }</textarea>
					     				</td>
									</tr>

                                </table>
                            </td>
                        </tr>
                    </table>
                </div>

<!--                @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@시설운영 정보@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@					-->
<!--                @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@시설운영 정보@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@					-->
<!--                @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@시설운영 정보@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@					-->
                
  


            </div>
        </td>
    </tr>
</table>

</form>

</body>
</html>
