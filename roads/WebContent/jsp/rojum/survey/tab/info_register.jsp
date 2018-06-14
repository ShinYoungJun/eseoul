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
    <!--  //********** BEGIN_현진_20120212 -->
	<script language="javascript" src="/js/zipcode.js"></script>
	<!--   //********** END_현진_20120212 -->   
    <!--  //********** BEGIN_현진_20120312 -->
    <script language="javascript" src="/js/rojumGugan.js"></script>
	<!--   //********** END_현진_20120312 -->
    <script language='JavaScript' src='/jsp/rojum/survey/tab/info_register.js'></script>

    <script type="text/javascript"><!--
        //<![CDATA[

	//********** BEGIN_현진_20120315
        function changeGugan(){        	
        	document.getElementById("REG_SEQ").value = "";
        	document.getElementById("REG_NAME").value = "";
        }
	//********** END_현진_20120315


        function	RegisterPrc()
        {
        	//********** BEGIN_현진_20120315
        	var GUGAN_CD = document.getElementById("GUGAN_CD").value;
        	var REG_SEQ = document.getElementById("REG_SEQ").value;
        	
        	if(GUGAN_CD != null && GUGAN_CD != ""){
        		if(REG_SEQ == null || REG_SEQ == ""){
        			alert("구간 등록번호를 생성해주세요!");        			
        			return;
            	}
        		
        	}
        	//********** END_현진_20120315            
            //********** BEGIN_현진_20120317
            var SG_TYP = document.getElementById("SG_TYP").value;
            
        	if(SG_TYP == null || SG_TYP == ""){
        		alert("취급품목을 입력해주세요.");        		
        		document.getElementById("SG_TYP").focus();     
        		return;			
        	}
			//********** END_현진_20120317
            
            if(!DataCheckRegister())
                return false;

            var form = document.form;
            var BJ_CD = form.BJ_CD.value;
            var SPC_CD = form.SPC_CD.value;
            var BONBUN = form.BONBUN.value;
            var BUBUN = form.BUBUN.value;

            


            var PNU = '${SIDO}'+'${SIGU_CD}'+BJ_CD+SPC_CD+addZero(BONBUN,4)+addZero(BUBUN,4);

            form.WITH_PNU.value = PNU;	//PNU 파라메터에 값  세팅

            form.action = "/rojum/survey/info_registerprc.do";
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
        

        function	SelectedFTTYP()
        {
            var	FT_TYP	= getSelectedValue(document.getElementById("FT_TYP"));

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


        //]]>
    -->    
   </script>

<!--  //********** BEGIN_현진_20120317 -->
<body>
<!--   //********** END_현진_20120317 -->


        <form id="form" name="form" method="post" enctype="multipart/form-data">
            <input type="hidden" id="UserType" name="UserType">
            <input type="hidden" id="UserSection" name="UserSection">
            <input type="hidden" id="PURPOSE_CD" name="PURPOSE_CD" >
            <input type="hidden" id="MIN_CHECK" name="MIN_CHECK" >
            <input type="hidden" id="MIN_PROCESS" name="MIN_PROCESS" >
            <input type="hidden" id="GIGAN1" name="GIGAN1" >
            <input type="hidden" id="GIGAN2" name="GIGAN2" >
            <input type="hidden" id="MIN_NAME" name="MIN_NAME" >
            <input type="hidden" id="MIN_REQNO" name="MIN_REQNO" value="}">
            <input type="hidden" id="NOWTAB" name="NOWTAB" value="0">
            <input type="hidden" id="WITH_PNU" name="WITH_PNU" >
            <input id="ATTACH_FILE" name="ATTACH_FILE" type="hidden" class="input_form1" style="width:140px" >
            <input id="ATTACH_SIZE" name="ATTACH_SIZE" type="hidden" class="input_form1" style="width:45px" >
            <input id="TAX_SET" name="TAX_SET" type="hidden" value="50">
            <input type="hidden" id="FLAG" name="FLAG" value="2">
            

<table width="780px" border="0" cellpadding="0" cellspacing="0">
    <tr>
        <td align="left">
            <table width="780px" border="0" cellspacing="0" cellpadding="0">
                <tr>
                    <td height="22px" background="/img/tab_line_purple.gif">
                        <table border="0" cellspacing="0" cellpadding="0">
                            <tr>
                            <ul id="tabmenu">
	                             <td width="111px"><a><img src="/img/sub_petition_title10_off.gif" alt="시설/운영 정보" width="110" height="22" border="0" onclick="Init();" style="CURSOR: Hand;"></a></td>
	                             <td width="111px"><a><img src="/img/sub_gapan_title4_on.gif" alt="운영자 정보" width="110" height="22" border="0" onclick="Init(); " style="CURSOR: Hand;"></a></td>
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
										<td height="34px" colspan="4" bgcolor="#FFFFFF" class="table_bl_left">
										<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
											<tr>
												<td width="80px" align="center">
													<span class="sub_stan_blue">* 시설정보</span>
												</td>
											</tr>
										</table>
										</td>
									</tr>
									
									<tr>
                                        <td width="15%" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">조사년도</td>
                                        <td colspan="3" bgcolor="f6f6f6" class="table_bl_left">
                                        	<select id="SURVEY_YEAR" name="SURVEY_YEAR" class="essential" style="width:100px">
                                            </select>
                                        </td>
                                    </tr>
                                    
									<!--  //********** BEGIN_현진_20120312 -->
									<tr>
                                        <td width="15%" height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">구간번호</td>
                                        <td colspan="3" bgcolor="f6f6f6" class="table_bl_left">
                                        	<select id="GU_CD" name="GU_CD" class="input_form1" style="width:100px" onchange="changeGuCd(this);">${GU_CODE}</select>
											<!--  //********** BEGIN_현진_20120315 -->
											<!-- <select name="GUGAN_CD" id="GUGAN_CD" style="width:200px" class="input_form1"></select> -->
											<select name="GUGAN_CD" id="GUGAN_CD" style="width:200px" class="input_form1" onchange="changeGugan();">
											${GUGAN_CD_LIST }
											</select>
											<!--   //********** END_현진_20120315 -->
											등록번호 <input type="hidden" name="REG_SEQ" id="REG_SEQ" class="input_form1" readonly/>
											<input type="text" name="REG_NAME" id="REG_NAME" class="input_form1" readonly/>
											<input type="button" class="input_form1" value="생성" onClick="javascript:regnameCreate();"/>
                                        </td>
                                    </tr>
									<!--   //********** END_현진_20120312 -->

                                    <tr>
                                        <td height="50px" align="center" bgcolor="e5eff8" class="sub_table_b">인접지 지번<br>(공시지가<br>&nbsp;적용지번)</td>
                                        <td colspan="3" bgcolor="f6f6f6" class="table_bl_left">
                                        	<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                                                <tr>
                                                    <td width="76">${SIDO_NM}&nbsp;&nbsp;${SIGUNGU}&nbsp;&nbsp;</td>
                                                    <td>
                                                    	<select id="BJ_CD" name="BJ_CD" class="essential" style="width:100px">
                                                            ${bjdong_code}
                                                        </select>
                                                    </td>
                                                    <td>&nbsp;
                                                        <select id="HJ_CD" name="HJ_CD" class="essential" style="width:100px">
                                                            ${hjdong_code}
                                                        </select>
                                                    </td>
                                                    <td width="16" align="center">/</td>
                                                    <td>
                                                        <select id="SPC_CD" name="SPC_CD" class="essential" style="width:75px">${mul_spc_cd}
                                                        </select>
                                                    </td>
                                                    <td width="10">&nbsp;</td>
                                                    <td><input id="BONBUN" name="BONBUN"  type="text" class="essential" style="width:50px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);" maxlength="4"></td>
                                                    <td width="16" align="center">-</td>
                                                    <td><input id="BUBUN" name="BUBUN"  type="text" class="input_form1" style="width:50px" style="ime-mode:disabled" onKeyDown="nr_num_int(this);" onKeyUp="nr_num_int(this);" onKeyPress="nr_num_int(this);" maxlength="4"></td>
                                                    <td width="30" align="center">번지</td>
                                                    <td>
                                                    
                                                </tr>
                                            </table>
                                        </td>
                                    </tr>
<!-- 인접지 도로명주소 추가 #mr-->
					<tr>
						<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">인접지 도로명주소</td>
						<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
							<img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0" onclick="javascript:openZipcodePopup_new('', '', 'form.WITH_DORO_NM', '', '', '', '','','', '');" style="cursor: pointer; vertical-align: middle;">
							<input id="WITH_DORO_NM" name="WITH_DORO_NM" type="text" class="essential" style="width:250px" onclick="javascript:openZipcodePopup_new('', '', 'form.WITH_DORO_NM', '', '', '', '','','', '');" maxlength="120">
							<input id="WITH_BD_BON" name="WITH_BD_BON" type="text" class="essential" style="width:25px"/>
							-<input id="WITH_BD_BU" name="WITH_BD_BU" type="text" class="essential" style="width:25px"/>
							<br><font color="blue">* 확인 버튼을 클릭 후, 팝업창에서 도로명 주소로 검색 후 해당 도로명 주소를 선택</font>
						</td>
					</tr>					
<!-- #mr -->        <tr>
                                        <td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap>점용지 위치</td>
                                        <td width="35%" bgcolor="f6f6f6" class="table_bl_left" nowrap>
                                        	<img src="/img/loca_icon2.gif" alt="위치등록" id="LocReg" width="64" height="18" border="0" onClick="javascript:jumyongZibun('${SIDO}','${SIGU_CD}');" style="CURSOR:Hand;vertical-align: middle;">
                                            <input id="WITH_ADDR" name="WITH_ADDR" type="text" class="input_form1" style="width:195px"  maxlength="50">
<!-- #mr 실서버용 -->
<input type="hidden" id="X_COORD" name="X_COORD"  class="input_form1" style="width:10px">
<input type="hidden" id="Y_COORD" name="Y_COORD"  class="input_form1" style="width:10px">

<!-- #mr 테스트용!!! -->
<!--<input type="hidden" id="X_COORD" name="X_COORD"  value="100.10" class="input_form1" style="width:10px">
<input type="hidden" id="Y_COORD" name="Y_COORD"  value="100.10" class="input_form1" style="width:10px">-->
                                            
                                        </td>
                                        <td align="center" bgcolor="e5eff8" class="sub_table_b" rowspan="5" colspan="2" nowrap>
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
													<td height="104px" id="SHOP_IMG_PREVIEW" style="background-repeat: no-repeat; background-attachment: inherit;"></td>
													<td id="SHOP_IMG2_PREVIEW" style="background-repeat: no-repeat; background-attachment: inherit;"></td>
												</tr>
					
											</table>
					                                        
                                            
                                        </td>

                                    </tr>
                                    <tr>
                                    	<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">도로 지번</td>
                                        <td width="35%" bgcolor="f6f6f6" class="table_bl_left">
                                        	<input id="JIBUN" name="JIBUN" type="text" class="input_form1" style="width:130px" >
                                        	(위치등록을 통해 입력)
                                       	</td>
                                    </tr>
                                    <tr>
                                        <td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">주변정보</td>
                                        <td width="35%" bgcolor="f6f6f6" class="table_bl_left">
                                        	<input id="WITH_INFO" name="WITH_INFO" type="text" class="input_form1" style="width:264px" >
                                       	</td>
                                    </tr>
                                    <tr>
                                        <td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">설치일자
                                       	</td>
                                        <td bgcolor="f6f6f6" class="table_bl_left">
                                        	<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                                                <tr>
                                                    <td>
                                                   		<input id="FOUND_DATE" name="FOUND_DATE" type="text" class="essential" style="width:120px;"  readonly>&nbsp;<img src="/img/calendar_icon.gif" width="19" height="16" border="0" onClick="popUpCalendar(this, document.getElementById('FOUND_DATE'), 'yyyymmdd')" style="CURSOR:pointer;vertical-align: middle;">
                                                    </td>
                                                </tr>
                                            </table>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td height="52px" align="center" bgcolor="e5eff8" class="sub_table_b">시설종류/<br>형태/유형별 </td>
                                        <td bgcolor="f6f6f6" class="table_bl_left" style="vertical-align: top;">
                                        	<table border="0" cellpadding="0" cellspacing="0" class="sub_stan" >
                                        	<tr>
                                        	<td height="26px">
                                        	<select id="FT_TYP" name="FT_TYP" class="essential" style="width: 100px" onchange="SelectedFTTYP();">
												<option value="">::선택::</option>
												<!--  //********** BEGIN_현진_20120317 -->
												<option value="021" selected>거리가게</option>
												<!--   //********** END_현진_20120317 -->												
												<option value="022">적치물</option>
											</select>
											<select id="FT_SEL" name="FT_SEL" class="essential" style="width: 130px" onchange="ChangeFTSEL(this);">
											</select>
                                        	</td>
                                        	</tr>
                                        	<tr id="FT_CAL_ROW" name="FT_CAL_ROW" style="display: none;">
                                        	<td height="26px">
                                        	<select id="FT_CAT" name="FT_CAT" class="essential" style="width: 130px">
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
                                                    <td><input id="PLACE_L" name="PLACE_L" type="text" class="essential" style="width:40px" onKeyPress="nr_num_float(this),Jumji_CalPlaceSize();" onKeyUp="nr_num_float(this),Jumji_CalPlaceSize();" maxlength="5"></td>
                                                    <td width="16px" align="center">m</td>
                                                    <td width="12px" align="center">x</td>
                                                    <td><input id="PLACE_H" name="PLACE_H" type="text" class="essential" style="width:40px" onKeyPress="nr_num_float(this),Jumji_CalPlaceSize();" onKeyUp="nr_num_float(this),Jumji_CalPlaceSize();" maxlength="5"></td>
                                                    <td width="16px" align="center">m</td>
                                                    <td width="12px" align="center">=</td>
                                                    <td><input id="PLACE_A" name="PLACE_A" type="text" class="essential" style="width:40px" onKeyPress="nr_num_float(this);" onKeyUp="nr_num_float(this);" maxlength="5" readonly="readonly"></td>
                                                    <td width="16px" align="center">㎡</td>
                                                </tr>
                                            </table>
                                         </td>
                                    </tr>

                                    <tr>
                                        <td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">보관장소</td>
                                        <td bgcolor="f6f6f6" class="table_bl_left">
                                        	<select id="DP_SEL" name="DP_SEL" class="input_form1" style="width:76px">
                                                ${dp_sel}
                                            </select>
                                            <input id="DP_TXT" name="DP_TXT" type="text" class="input_form1" style="width:184px"  maxlength="50"></td>
                                        <td width="15%" align="center" bgcolor="e5eff8" class="sub_table_b">거리조성</td>
                                        <td width="35%" bgcolor="f6f6f6" class="table_bl_left">
                                        	<input name="SPECIAL_ST" type="radio" value="1" checked onclick="check_special_st();" style="vertical-align: middle;">
                                        	일반거리
                                            <input name="SPECIAL_ST" type="radio" value="0" onclick="check_special_st();" style="vertical-align: middle;">
                                            특화거리
                                            <span id="SPECIAL_DATE_SPAN" style="display:none;">
                                            	/조성일자:
	                                            <input id="SPECIAL_DATE" name="SPECIAL_DATE"  type="text" class="essential" style="width:60px;vertical-align: middle;" readonly>
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
                                                    	<input name="MAINTN_OB" type="radio" value="0" checked>
                                                   	</td>
                                                    <td width="50px">정비대상</td>
                                                    <td>
                                                    	<select id="MT_SEL"  name="MT_SEL" class="input_form1" style="width:76px">
                                                            ${mt_sel}
                                                        </select>
													</td>
													<td>
                                                    	<input name="MAINTN_OB" type="radio" value="1">
                                                   	</td>
                                                    <td width="50px">관리대상</td>
                                                </tr>
                                            </table>
                                    	 </td>
                                    	<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b"><span id="CAR_NO_SPAN" style="display: none;">차량번호</span></td>
                                        <td colspan="1" bgcolor="f6f6f6" class="table_bl_left">
                                        	<input id="CAR_NO" name="CAR_NO" type="text" value="${CAR_NO}" class="input_form1" style="width: 76px;display: none;" maxlength="10">
                                    	</td>
                                    	 
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
													<select id="SG_TYP" name="SG_TYP" class="essential" style="width: 76px">
														${sg_typ}
													</select>
												</td>
				
												<td>
													<input id="LIQUOR_SL" name="LIQUOR_SL" type="checkbox" <c:if test="${board.LIQUOR_SL == '1'}">value='1' checked</c:if> <c:if test="${board.LIQUOR_SL != '1'}">value='0'</c:if>>
												</td>
												<td width="50px">주류판매</td>
												<td>
													<input id="LPGAS_US" name="LPGAS_US" type="checkbox" <c:if test="${board.LPGAS_US == '1'}">value='1' checked</c:if> <c:if test="${board.LPGAS_US != '1'}">value='0'</c:if>>
												</td>
												<td width="100px">LPG 사용</td>
											</tr>
										</table>
										</td>
										<td align="center" bgcolor="e5eff8" class="sub_table_b">영업인원</td>
										<td bgcolor="f6f6f6" class="table_bl_left">
											<input id="MEM_NUM" name="MEM_NUM"  class="input_form1" style="width: 76px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, OPEN_TIME1, 2);" maxlength="2">(운영자 본인 포함)
										</td>
									</tr>
									<tr>
										<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">일매출액</td>
										<td bgcolor="f6f6f6" class="table_bl_left" colspan="3">
											<input id="DAY_SALES" name="DAY_SALES"  type="text" class="input_form1" style="width: 76px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);" maxlength="8"> 원
										</td>
									</tr>
									<tr>
										<td height="26px" align="center" bgcolor="e5eff8"
											class="sub_table_b">운영시간</td>
										<td bgcolor="f6f6f6" class="table_bl_left">
										<table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
											<tr>
												<td>
													<input id="OPEN_TIME1" name="OPEN_TIME1"  type="text" class="input_form1" style="width: 30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);count_check(this, OPEN_TIME2, 2);" maxlength="2">
												</td>
												<td width="12px" align="center">:</td>
												<td width="16px" align="center">
													<input id="OPEN_TIME2" name="OPEN_TIME2"  type="text" class="input_form1" style="width: 30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);count_check(this, CLOSE_TIME1, 2);" maxlength="2">
												</td>
												<td width="12px" align="center">~</td>
												<td>
													<input id="CLOSE_TIME1" name="CLOSE_TIME1"  type="text" class="input_form1" style="width: 30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);count_check(this, CLOSE_TIME2, 2);" maxlength="2">
												</td>
												<td width="12px" align="center">:</td>
												<td>
													<input id="CLOSE_TIME2" name="CLOSE_TIME2"  type="text" class="input_form1" style="width: 30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);" maxlength="2">
												</td>
											</tr>
										</table>
										</td>
										<td align="center" bgcolor="e5eff8" class="sub_table_b">가입단체</td>
										<td bgcolor="f6f6f6" class="table_bl_left">
											<select id="UN_TYP" name="UN_TYP" class="input_form1" style="width: 76px">
											${un_typ}
											</select>
											<input id="UN_TXT" name="UN_TXT"  type="text" class="input_form1" style="width: 158px" maxlength="50">
										</td>
				
									</tr>
									<tr>
										<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">기타정보</td>
										<td bgcolor="f6f6f6" class="table_bl_left" colspan="3">
											<input id="NOTES" name="NOTES"  type="text" class="input_form1" style="width:630px" maxlength="255">
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
                                        <td width="15%" height="28px" align="center" bgcolor="e5eff8" class="sub_table_b">운영자명</td>
                                        <td width="35%" bgcolor="eaeaea" class="table_bl_left">
                                            <input id="OWNER_NAME" name="OWNER_NAME" type="text" class="input_form1" style="width:100px"  maxlength="35">
                                            <img src="/img/search_icon.gif" style="cursor:pointer;vertical-align: middle;" onclick="owner_list(document.form.OWNER_NAME.value);">
                                            <input id="OWNER_IDCHK" name="OWNER_IDCHK" type="checkbox" value="1" checked onclick="javascript:click_idchk(this);">신분증 확인
                                        </td>
                                        <td width="15%" align="center" bgcolor="e5eff8" class="sub_table_b" rowspan="3">
											운영자 사진
                                        </td>
                                        <td width="35%" bgcolor="eaeaea" class="table_bl_left" rowspan="3" align="center">
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
                                        <td align="center" bgcolor="e5eff8" class="sub_table_b">주민등록번호</td>
                                        <td bgcolor="eaeaea" class="table_bl_left">
                                            <input id="OWNER_SSN1"  name="OWNER_SSN1" type="text" class="input_form1" style="width:40px; ime-mode:disabled"  onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, OWNER_SSN2, 6);" maxlength="6">
                                            - <input id="OWNER_SSN2" name="OWNER_SSN2" type="text" class="input_form1" style="width:45px; ime-mode:disabled"  onKeyPress="nr_num_int(this);" maxlength="7">
                                            <input id="OWNER_CHK" name="OWNER_CHK" type="checkbox" onclick="javascript:Click_OwnerChk(this);">운영자 미확인                                        
                                        </td>
                                    </tr>
                                    <tr>
                                        <td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">성별(나이)</td>
                                        <td bgcolor="eaeaea" class="table_bl_left">
                                            <input name="OWNER_GENDER" type="radio" value="1" checked>남
                                            <input name="OWNER_GENDER" type="radio" value="2" >여
                                            &nbsp;(
                                            <input id="OWNER_AGE" name="OWNER_AGE" class="input_form1" type="text" style="width:20px" maxlength="3"  onKeyPress="nr_num_int(this);"> 세)
                                        </td>
                                    </tr>
                                    <tr>
                                        <td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">전화번호</td>
                                        <td bgcolor="eaeaea" class="table_bl_left">
                                            <input id="OWNER_TEL1" name="OWNER_TEL1" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, OWNER_TEL2, 3);" maxlength="3"> -
                                            <input id="OWNER_TEL2" name="OWNER_TEL2" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, OWNER_TEL3, 4);" maxlength="4"> -
                                            <input id="OWNER_TEL3" name="OWNER_TEL3" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, OWNER_HP1, 4);" maxlength="4">
                                        </td>
                                        <td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">휴대전화</td>
                                        <td bgcolor="eaeaea" class="table_bl_left" colspan="3">
                                            <input id="OWNER_HP1" name="OWNER_HP1" type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, OWNER_HP2, 3);" maxlength="3" > -
                                            <input id="OWNER_HP2" name="OWNER_HP2" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="count_check(this, OWNER_HP3, 4);" maxlength="4"> -
                                            <input id="OWNER_HP3" name="OWNER_HP3" type="text" class="input_form1" style="width:30px" style="ime-mode:disabled" onKeyPress="nr_num_int(this);" onKeyUp="nr_num_int(this);" maxlength="4">
                                        </td>
                                    </tr>
                                    <tr>
                                        <td height="34px" colspan="2" align="left" bgcolor="#FFFFFF" class="">
                                            <table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                                                <tr>
                                                    <td width="50%">
                                                        <span class="sub_stan_blue">* 주민등록지 주소</span>
                                                    </td>
                                                </tr>
                                            </table>
                                        </td>
                                        <td height="34px" colspan="2" align="left" bgcolor="#FFFFFF" class="">
                                            <table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                                                <tr>
                                                    <td width="50%">
                                                        <span class="sub_stan_blue">* 실제거주지 : </span>
                                                        <input id="ADDR_CHECK1"  name="ADDR_CHECK1" type="checkbox" value="1" onclick="javascript:Jumin_toaddr_Check()" checked> 주민등록지 주소 정보와 동일
                                                    </td>
                                                </tr>
                                            </table>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
                                        <td bgcolor="eaeaea" class="table_bl_left">
                                            <table width="100%" border="0" cellpadding="0" cellspacing="0" class="sub_stan">                                            
                                                <tr>
                                                    <td width="50px"><input id="OWNER_POST" name="OWNER_POST" type="text" style="width:50px" onFocus="Jumin_toaddr_Check();" onKeyPress="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" onchange="Jumin_toaddr_Check();"  readonly class="input_form1"></td>
                                                    <!--  //********** BEGIN_현진_20120209 -->
                                                    <!-- <td width="50px"><a href="javascript:openZipcodePopup_new('form.OWNER_POST', 'form.OWNER_ADDR1', 'form.ADDR1_NEW', 'form.SI', 'form.GUN', 'form.DORO_NM', 'form.BD_NM');"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td>-->
													<td width="50px"><a href="javascript:openZipcodePopup_new('form.OWNER_POST', 'form.OWNER_ADDR1', 'form.ADDR1_NEW', 'form.SI', 'form.GUN', 'form.DORO_NM', 'form.BD_NM','form.EMD_NM','form.OWNER_BONBUN', 'form.OWNER_BUBUN' );"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td>
													<td align="right"><a href="javascript:addrConfirm('OWNER_POST','SI','GUN','EMD_NM','DORO_NM','OWNER_BONBUN','OWNER_BUBUN','BD_BON','BD_BU','BD_NM','BD_DET_NM','OWNER_ADDR1','OWNER_ADDR2','ADDR1','form')"><img src="/img/ok_icon.gif" alt="확인" width="56" height="18" border="0"></a></td>
													<!--   //********** END_현진_20120209 -->
                                                </tr>
                                            </table>
                                        </td>
                                        <td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">우편번호</td>
                                        <td bgcolor="eaeaea" class="table_bl_left">
                                            <!--  //********** BEGIN_현진_20120212 -->
                                            <table  width="100%" border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                                                <tr>
                                                    <td width="50px"><input id="OWNER_TOPOST" name="OWNER_TOPOST" type="text" style="width:50px" onFocus="Jumin_toaddr_Check();" onKeyPress="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  onchange="Jumin_toaddr_Check();"  readonly class="input_form1"></td>                                                    
													<!-- <td><a href="javascript:openZipcodePopup_new('form.OWNER_TOPOST', 'form.OWNER_TOADDR1', 'form.TOADDR1_NEW', 'form.TOSI', 'form.TOGUN', 'form.TODORO_NM', 'form.TOBD_NM', 'form.OWNER_BONBUN', 'form.OWNER_BUBUN');"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td> -->                                                    
													<td width="50px"><a href="javascript:openZipcodePopup_new('form.OWNER_TOPOST', 'form.OWNER_TOADDR1', 'form.TOADDR1_NEW', 'form.TOSI', 'form.TOGUN', 'form.TODORO_NM', 'form.TOBD_NM','form.TOEMD_NM', 'form.OWNER_TOBONBUN', 'form.OWNER_TOBUBUN');"><img src="/img/search_icon.gif" alt="검색" width="56" height="18" border="0"></a></td>
													<td align="right"><a href="javascript:addrConfirm('OWNER_TOPOST','TOSI','TOGUN','TOEMD_NM','TODORO_NM','OWNER_TOBONBUN','OWNER_TOBUBUN','TOBD_BON','TOBD_BU','TOBD_NM','TOBD_DET_NM','OWNER_TOADDR1','OWNER_TOADDR2','TOADDR1','form')"><img src="/img/ok_icon.gif" alt="확인" width="56" height="18" border="0"></a></td>									
													           
                                                </tr>
                                            </table>
                                            <!--   //********** END_현진_20120212 -->
                                        </td>
                                    </tr>
                                    <tr>
                                    <!-- 주민등록지 기본 주소 -->
                                        <td align="center" height="40px" bgcolor="e5eff8" class="sub_table_b">기본 주소</td>
                                        <td bgcolor="eaeaea" class="table_bl_left" >
                                            <input id="OWNER_ADDR1" name="OWNER_ADDR1" type="text" class="input_form1" style="width:245px" onFocus="Jumin_toaddr_Check();" onKeyPress="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  readonly>
                                            <br>산<input id="OWNER_SAN" name="OWNER_SAN" type="checkbox" style="vertical-align: middle;" onclick="Jumin_toaddr_Check();"  onFocus="Jumin_toaddr_Check();" onKeyPress="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();">
                                            <input type="hidden" id="SI" name="SI">
                                            <input type="hidden" id="GUN" name="GUN">
                                            <input type="hidden" id="DORO_NM" name="DORO_NM">
                                            <input type="hidden" id="TOSI" name="TOSI">
                                            <input type="hidden" id="TOGUN" name="TOGUN">
                                            <input type="hidden" id="TODORO_NM" name="TODORO_NM">
                                            
                                            <!--  //********** BEGIN_현진_20120209 -->
											<input type="hidden" id="EMD_NM" name="EMD_NM">
											<input type="hidden" id="TOEMD_NM" name="TOEMD_NM">
											<!--   //********** END_현진_20120209 -->  
                                            <!--  //********** BEGIN_현진_20120212 -->
											<input id="OWNER_BONBUN" name="OWNER_BONBUN"  type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onFocus="Jumin_toaddr_Check(); nr_num_int(this);" onKeyUp="Jumin_toaddr_Check(); nr_num_int(this); count_check(this, OWNER_BUBUN, 4);" onKeyPress="Jumin_toaddr_Check(); nr_num_int(this); count_check(this, OWNER_BUBUN, 4);" maxlength="4">&nbsp;-&nbsp;<input id="OWNER_BUBUN" name="OWNER_BUBUN"  type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onFocus="Jumin_toaddr_Check(); nr_num_int(this); count_check(this, OWNER_BUBUN, 4);" onKeyUp="Jumin_toaddr_Check(); nr_num_int(this); count_check(this, OWNER_ADDR2, 4);" onKeyPress="Jumin_toaddr_Check(); nr_num_int(this); count_check(this, OWNER_ADDR2, 4);" maxlength="4">&nbsp;<input id="OWNER_ADDR2" name="OWNER_ADDR2" type="text" class="input_form1" style="width:100px" onFocus="Jumin_toaddr_Check();" onKeyPress="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  maxlength="50">
                                             <!--   //********** END_현진_20120212 -->
                                        </td>
									<!-- 실제거주지 기본 주소 -->   
                                        <td align="center" bgcolor="e5eff8" class="sub_table_b">기본 주소</td>
                                        <td bgcolor="eaeaea" class="table_bl_left">
                                            <input id="OWNER_TOADDR1" name="OWNER_TOADDR1" type="text" class="input_form1" style="width:245px" onFocus="Jumin_toaddr_Check();" onKeyPress="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  readonly>
                                            <br>산<input id="OWNER_TOSAN" name="OWNER_TOSAN" type="checkbox"  style="vertical-align: middle;" onclick="Jumin_toaddr_Check();"  onFocus="Jumin_toaddr_Check();" onKeyPress="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();">
                                            <!--  //********** BEGIN_현진_20120212 -->
                                            <!-- <input id="OWNER_TOBONBUN" name="OWNER_TOBONBUN"  type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onFocus="Jumin_toaddr_Check(); nr_num_int(this);" onKeyUp="Jumin_toaddr_Check(); nr_num_int(this); count_check(this, OWNER_TOBUBUN, 4);" onKeyPress="Jumin_toaddr_Check(); nr_num_int(this); count_check(this, OWNER_TOBUBUN, 4);" maxlength="4">&nbsp;-&nbsp;<input id="OWNER_TOBUBUN" name="OWNER_TOBUBUN"  type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onFocus="Jumin_toaddr_Check(); nr_num_int(this);" onKeyUp="Jumin_toaddr_Check(); nr_num_int(this); count_check(this, OWNER_TOADDR2, 4);" onKeyPress="Jumin_toaddr_Check(); nr_num_int(this); count_check(this, OWNER_TOADDR2, 4);" maxlength="4">&nbsp;<input id="OWNER_TOADDR2" name="OWNER_TOADDR2" type="text" class="input_form1" style="width:130px"  onFocus="Jumin_toaddr_Check();" onKeyPress="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" maxlength="50"> -->
                                             <input id="OWNER_TOBONBUN" name="OWNER_TOBONBUN"  type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onFocus="Jumin_toaddr_Check(); nr_num_int(this);" onKeyUp="Jumin_toaddr_Check(); nr_num_int(this); " onKeyPress="Jumin_toaddr_Check(); nr_num_int(this); count_check(this, OWNER_TOBUBUN, 4);" maxlength="4">&nbsp;-&nbsp;<input id="OWNER_TOBUBUN" name="OWNER_TOBUBUN"  type="text" class="input_form1" style="width:25px" style="ime-mode:disabled" onFocus="Jumin_toaddr_Check(); nr_num_int(this);" onKeyUp="Jumin_toaddr_Check(); nr_num_int(this); count_check(this, OWNER_TOADDR2, 4);" onKeyPress="Jumin_toaddr_Check(); nr_num_int(this); count_check(this, OWNER_TOADDR2, 4);" maxlength="4">&nbsp;<input id="OWNER_TOADDR2" name="OWNER_TOADDR2" type="text" class="input_form1" style="width:100px"  onFocus="Jumin_toaddr_Check();" onKeyPress="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" maxlength="50"> 
                                       		 <!--   //********** END_현진_20120212 -->
                                        </td>
                                    </tr>
                                    <tr>
                                    	<!-- 주민등록지 도로명 주소 -->
										<td height="45px" align="center" bgcolor="e5eff8" class="sub_table_b">도로명 주소</td>
										<td bgcolor="eaeaea" class="table_bl_left">
											<input id="ADDR1" name="ADDR1_NEW" type="text" class="essential" style="width:250px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  readonly>
				 							<input id="BD_BON" name="BD_BON" type="text" class="essential" style="width:25px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" >
											-
											<input id="BD_BU" name="BD_BU" type="text" class="input_form1" style="width:25px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  >
											<input id="BD_NM" name="BD_NM" type="text" class="input_form1" style="width:135px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  maxlength="50">
											<input id="BD_DET_NM" name="BD_DET_NM" type="text" class="input_form1" style="width:135px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  maxlength="50">											
										</td>
										<!-- 실제거주지 도로명 주소 -->  
										<td align="center" bgcolor="e5eff8" class="sub_table_b">도로명 주소</td>
										<td bgcolor="eaeaea" class="table_bl_left">
											<input id="TOADDR1" name="TOADDR1_NEW" type="text" class="essential" style="width:250px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  readonly>
				 							<input id="TOBD_BON" name="TOBD_BON" type="text" class="essential" style="width:25px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();" >
											-
											<input id="TOBD_BU" name="TOBD_BU" type="text" class="input_form1" style="width:25px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  >
											<input id="TOBD_NM" name="TOBD_NM" type="text" class="input_form1" style="width:135px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  maxlength="50">
											<input id="TOBD_DET_NM" name="TOBD_DET_NM" type="text" class="input_form1" style="width:135px" onClick="Jumin_toaddr_Check();" onChange="Jumin_toaddr_Check();" onFocus="Jumin_toaddr_Check();" onKeyUp="Jumin_toaddr_Check();"  maxlength="50">
										</td>
								  	</tr>
	                                <tr>
										<td height="28px" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">감면대상</td>
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
										<td height="40px" align="center" bgcolor="e5eff8" class="sub_table_b" nowrap="nowrap">비고</td>
										<td colspan="3" bgcolor="eaeaea" class="table_bl_left">
									        <textarea name="NOTE" id="NOTE" class="input_form1" style="width:98%" onkeyup="displayBytes(500, 'NOTE');">${board.NOTE }</textarea>
					     				</td>
									</tr>

                                </table>
                            </td>
                        </tr>
                    </table>
                </div>
            </div>
        </td>
    </tr>
</table>

</form>
<!--  //********** BEGIN_현진_20120312 -->
<script type="text/javascript">
	//changeGuCd(document.getElementById("GU_CD"));
	SelectedFTTYP();

</script>
<!--   //********** END_현진_20120312 -->
</body>
</html>
