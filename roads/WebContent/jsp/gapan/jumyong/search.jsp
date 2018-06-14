<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/loginCheck.jsp" %>
<%@ include file="/jsp/common/include.jsp" %>
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
<script type="text/javascript" src="/js/jquery-1.6.1.js"></script>
<script type="text/javascript" src="/js/jquery.json-2.4.js"></script>
<script language="javascript" src="/js/common.js"></script>
<script language="javascript" src="/js/PopupCalendar.js"></script>
<script language="javascript" src="/js/calculation.js"></script>
<script language="javascript" src="/js/selectItem.js"></script>
<script>

	function gapanRegister(){

   		var form = document.jumyongForm;
   		form.action = "/gapan/jumyong/register.do";
   		form.submit();
		
	}
	var user = "${sessionUserId}"; //k00000013

	<%-- BEGIN_KANG_20120423 --%>
	function selectFT_TYP(init){		
		var FT_TYP = document.getElementById("FT_TYP").value;
		if(init != "init"){
			document.getElementById("FACILITY_NO").value = "";
		}
		var Facility = "";

		if(FT_TYP == "%"){
			/* BEGIN_KANG_20120426 */
			<%--document.getElementById("FacilityView").style.display="none"; --%>				
			document.getElementById("FacilityView").style.display="block";
			Facility = "�ü�����";
			<%--********** END_KANG_20120426 --%>		
		}else{
			document.getElementById("FacilityView").style.display="block";			
			if(FT_TYP == "011"){
				Facility = "�����ǸŴ�";
			}else if(FT_TYP == "012"){
				Facility = "���μ�����";
			}
		}
		document.getElementById("Facility").innerHTML=Facility;

	};
	<%-- END_KANG_20120423 --%>
	
	function goSearch()
	{
		<%-- BEGIN_KANG_20120423
		/*
		var type = document.getElementById("TYPE").value;
		var section = document.getElementById("SECTION").value;
		var tax_set = document.getElementById("TAX_SET").value;
		var bj_cd = document.getElementById("BJ_CD").value;
		var bonbun = document.getElementById("BONBUN").value;
		var bubun = document.getElementById("BUBUN").value;
		var jumyongName = document.getElementById("jumyongName").value;
		var numberValue = document.getElementById("numberValue").value;
		var ft_typ = document.getElementById("FT_TYP").value;
		var gu_cd = getValueSelectTag("GU_CD");
		
		location.href="/gapan/jumyong/search.do?type="+type+"&section="+section
		+"&tax_set="+tax_set+"&ft_typ="+ft_typ+"&gu_cd="+gu_cd+"&bj_cd="+bj_cd+"&bonbun="+bonbun+"&bubun="+bubun+"&jumyongName="
		+jumyongName+"&numberValue="+numberValue;		
		var FACILITY_NO = document.getElementById("FACILITY_NO").value;		
		*/
		 --%>
		Search("/gapan/jumyong/search.do");
		<%-- END_KANG_20120423 --%>
	};
	
	function	excel_Search()
	{
		<%-- BEGIN_KANG_20120423
		/*
		var type = document.getElementById("TYPE").value;
		var section = document.getElementById("SECTION").value;
		var tax_set = document.getElementById("TAX_SET").value;
		var bj_cd = document.getElementById("BJ_CD").value;
		var bonbun = document.getElementById("BONBUN").value;
		var bubun = document.getElementById("BUBUN").value;
		var jumyongName = document.getElementById("jumyongName").value;
		var numberValue = document.getElementById("numberValue").value;
		var ft_typ = document.getElementById("FT_TYP").value;
		var gu_cd = getValueSelectTag("GU_CD");		
		
		location.href="/gapan/jumyong/excel_search.do?type="+type+"&section="+section
		+"&tax_set="+tax_set+"&ft_typ="+ft_typ+"&gu_cd="+gu_cd+"&bj_cd="+bj_cd+"&bonbun="+bonbun+"&bubun="+bubun+"&jumyongName="
		+jumyongName+"&numberValue="+numberValue;			
		*/
		//********** END_KANG_20120423
		 --%>
		Search("/gapan/jumyong/excel_search.do");
		
	}

	<%-- BEGIN_KANG_20120423 --%>
	function Search(url)
	{
		var type = document.getElementById("TYPE").value;
		var section = document.getElementById("SECTION").value;
		var tax_set = document.getElementById("TAX_SET").value;
		var bj_cd = document.getElementById("BJ_CD").value;
		var bonbun = document.getElementById("BONBUN").value;
		var bubun = document.getElementById("BUBUN").value;
		var jumyongName = document.getElementById("jumyongName").value;
		var numberValue = document.getElementById("numberValue").value;
		var ft_typ = document.getElementById("FT_TYP").value;
		var gu_cd = getValueSelectTag("GU_CD");				
		var FACILITY_NO = document.getElementById("FACILITY_NO").value;
		
		location.href= url + "?type="+type+"&section="+section
		+"&tax_set="+tax_set+"&ft_typ="+ft_typ+"&gu_cd="+gu_cd+"&bj_cd="+bj_cd+"&bonbun="+bonbun+"&bubun="+bubun+"&jumyongName="
		+jumyongName+"&numberValue="+numberValue+"&FACILITY_NO="+FACILITY_NO;
		
		<%-- END_KANG_20120423 --%>
		
	}
	<%-- END_KANG_20120423 --%>

	
	
	function goView(adminVal)
	{		
		var type = document.getElementById("TYPE").value;
		var section = document.getElementById("SECTION").value;
		var tax_set = document.getElementById("TAX_SET").value;
		var bj_cd = document.getElementById("BJ_CD").value;
		var bonbun = document.getElementById("BONBUN").value;
		var bubun = document.getElementById("BUBUN").value;
		var jumyongName = document.getElementById("jumyongName").value;
		var numberValue = document.getElementById("numberValue").value;
		var ft_typ = document.getElementById("FT_TYP").value;		
		
		var param = "/gapan/jumyong/view.do?GAPAN_NO="+adminVal+"&type="+type+"&section="+section
			+"&tax_set="+tax_set+"&ft_typ="+ft_typ+"&bj_cd="+bj_cd+"&bonbun="+bonbun+"&bubun="+bubun+"&jumyongName="
			+jumyongName+"&numberValue="+numberValue;

		location.href=param;
	}
	
	function InitPage()
	{
    	if('${message}'.length > 0){
			alert('${message}');					
    	}
		setSelectedOption(document.jumyongForm.SECTION, '${SECTION}');
		document.getElementById("FT_TYP").options.value = '${ft_typ}';
		<%-- BEGIN_KANG_20120423 --%>
		selectFT_TYP("init");
		<%-- END_KANG_20120423 --%>
		setYear('${yearVal}','YEAR1');
		setYear('${yearVal}','YEAR10');
		setYear('${yearVal}','YEAR4');
<%--		setYear('${yearVal}','YEAR40');		--%>
	}

	<%-- select�� option�� ���õ� ������ ���� --%>
	function setSelectedOption(obj, val){
		for(i = 0 ; i < obj.options.length ; i++){
			if(obj.options[i].value == val){
				obj.options[i].selected = true;
				return;
			}
		}
	};
	
	function setYear(data,targetId) {
  	now = new Date();
    Y = now.getFullYear();

    var strYear = data;
		var target = document.getElementById(targetId);
    for(var i = 0 ; i < 10 ; i++){
    	option = new Option(i);
    	option.text = Y+2-i;
    	option.value = Y+2-i;
      target.add(option);
      if(strYear == Y+2-i) { 
    	  option.selected = true;
    	  target.defaultIdx = i;
      }
    }
    
    target.options.value = strYear;
  };
  	
  function setDefaultSelect(targetId) {
	  var target = document.getElementById(targetId);
	  if (target != null && target.defaultIdx != null) {
		  target.options[target.defaultIdx].selected = true;
		  target.options.value = target.options[target.defaultIdx].value;
	  }
  };
  
	function getDateType1(date1)
	{
		var year= date1.getFullYear();
	    var mon = (date1.getMonth()+1)>9 ? ''+(date1.getMonth()+1) : '0'+(date1.getMonth()+1);
	    var day = date1.getDate()>9 ? ''+date1.getDate() : '0'+date1.getDate();
		
		return (year+"-"+mon+"-"+day);
	};
	
	function add_date(i) <%-- �ż��尡 �� �Լ� ���� --%>
	{
	   var currentDate; <%-- ���� �� --%>
	   currentDate = this.getDate() + i*1; <%-- ���� ��¥�� ����(��)�� ��¥�� ��� --%>
	   this.setDate(currentDate); <%-- ���� ��¥�� �ٽ� ���� --%>
	};
	
	function checkKeySearch(){
		if(event.keyCode == "13")
			goSearch();
	};
	

	function changeGuCd(obj){
    	var guCd = getSelectedValue(obj);
        var	param	= "guCd="+guCd;
        
        sendRequest("/get_bjdong_code.do", param, "GET", ResultChangeGuCd);
    }
	
	 function	ResultChangeGuCd(obj)
     {
     	select_innerHTML(document.getElementById("BJ_CD"), obj);
     	//********** BEGIN_����_20120315 kny
     	changeGuCdGuGan();
     	//********** END_����_20120315 kny
     	
     }

	 function changeGuCdGuGan(){		
			var guCd = document.getElementById("GU_CD").value;	    	
			var	param	= "guCd="+guCd;
			sendRequest("/rojum/survey/getSectionCode.do", param, "GET", ResultChangeGuCdGuGan);
		}

	 function	ResultChangeGuCdGuGan(obj)
	{
		//select_innerHTML(document.getElementById("GUGAN_CD"),obj);
	}

	////////////////////////////////AJAX////////////////////////////////////////////
     function getXMLHTTPRequest()
     {
         var xRequest = null;
         xRequest = new ActiveXObject("Microsoft.XMLHTTP");

         return xRequest;
     }	
	 
	 var req;
     var call;
	 
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

     


		
	function calcJumyong(){
		var f = document.jumyongForm;
		var select_item = document.getElementsByName("SELECT_ITEM");
		var item_check = document.getElementsByName("ITEM_CHECK");
		var gapan_no = document.getElementsByName("GAPAN_NO");
		var section_name = document.getElementsByName("SECTION_NAME");
		var count = 0;
		var hitFlag;

		for(var i = 0 ; i < select_item.length ; i++){
			item_check[i].value = select_item[i].checked;
			if(select_item[i].checked == true){
				count++;
				hitFlag = i;
			}
		}
		if(count <= 0){
			alert("ó���� �����Ͱ� �����ϴ�. ");
			return;
		}else if(count == 1){
			var type = f.TYPE.value;
			var section = f.SECTION.value;
			var tax_set = f.TAX_SET.value;
			var bj_cd = f.BJ_CD.value;
			var bonbun  = f.BONBUN.value;
			var bubun = f.BUBUN.value;
			var jumyongName = f.jumyongName.value;
			var numberValue = f.numberValue.value;
			var ft_typ = f.FT_TYP.value;

			var param = "/gapan/jumyong/view.do?GAPAN_NO="+gapan_no[hitFlag].value+"&type="+type+"&section="+section
								+"&tax_set="+tax_set+"&ft_typ="+ft_typ+"&bj_cd="+bj_cd+"&bonbun="+bonbun+"&bubun="+bubun
								+"&jumyongName="+jumyongName+"&numberValue="+numberValue
								+"&CAL_MODE=cal1&section_name="+section_name[hitFlag].value;

			location.href=param;

		}else{

			var tax_set = '${tax_set}';
			if(tax_set == '%' || tax_set == ''){
				alert('���Ա����� �����Ͽ� ��ȸ�� �������ּ���');
				return;
			}
			f.CAL_MODE.value = "cal1";
      Message_Display('Dlg_BatchCal1','Dlg_BatchCal1Main',1, 'dialog-background', null,
				function () {
					setDefaultSelect('YEAR1');	
				}
     	);
		}
	};
	
	<%-- [201305.20 yjmoon ����� �ϰ� ����. --%>
	function removeJumyong( pYear, pList) {
		var message = { year : pYear, list : pList};
		$.ajax({
			type: 'POST',
		  url: '/gapan/jumyong/batch_removeJumyong.do',
		  data: {msg : $.toJSON(message)},
		  contentType: 'application/x-www-form-urlencoded; charset=utf-8',
		  dataType: 'json',
		  success: function(data,textStatus,jqXHR){
			  var message = "�̺ΰ��� ����� ���⳻�� �����ϴ�.";
			  switch(data.result) {
			  case 'success': {
				  message = data.status.year + '�⵵ ���⳻���� ���� ��û' + data.status.total + '�� ��  ' + data.status.success + '�� ���� �Ϸ� �Ǿ����ϴ�.';
				  break;
			  }
			  case 'error': {
				  break;
			  }
			  default:
				  break;
			  }
			  alert(message);
			  Message_Display('waitbar', 'img-wait', 0);
			},
		  error: function(jqXHR, textStatus, errorThrown ){
		  	alert(textStatus);
		  	Message_Display('waitbar', 'img-wait', 0); 
			}
	  });
	};
	
	<%-- [201305.20 yjmoon ����� �ϰ� ���� onclick. --%>
	function onclickRemoveJumyong() {
		var taxSet = '${tax_set}';

		var list = new Array();
		if(taxSet == '%' || taxSet == ''){
			alert('���Ա����� �����Ͽ� ��ȸ�� �������ּ���');
			return;
		}
		
		var f = document.jumyongForm;
		var $checkedtems = $('[name="SELECT_ITEM"]:checked');
		var len = $checkedtems.length;
		
		if (len > 0) {
			Message_Display('year-selector', 'year-selector-main', 1, 
					'dialog-background',
					'����� �ϰ������� ���� ����⵵�� �����ϼ���.',
					function () {
						setDefaultSelect('YEAR10');	
					},
					{
						id 		: 'positive-button',
						title : '����',
						src		: '/img/del_icon3.gif',
						func 	: function() { <%-- positive button --%>							
							Message_Display('waitbar', 'img-wait', 1, 'dialog-background');
							var year = $('#YEAR10').val();
							var $selectItems = $('[name="SELECT_ITEM"]');
							var $gapanNos = $('[name="GAPAN_NO"]');
							var $sectionNames = $('[name="SECTION_NAME"]');
							var len = $checkedtems.length;
	
							for (var i = 0; i < len; i++) {
								var item = {};
								if ($selectItems.eq(i).is(":checked")) {
									item.no = $gapanNos.eq(i).val();
									item.secton = $sectionNames.eq(i).val();
									list.push(item);
								}
							}
							removeJumyong(year, list);
						}
					},
					{
						id		: 'negative-button',
						title	: '���',
						func 	: function() { <%-- negative button --%>
						}
					}
			);
		} else {
			alert("ó���� �����Ͱ� �����ϴ�. ");
			return;
		}		
	};
	
	function calcRent(){
		var f = document.jumyongForm;
		var select_item = document.getElementsByName("SELECT_ITEM");
		var item_check = document.getElementsByName("ITEM_CHECK");
		var gapan_no = document.getElementsByName("GAPAN_NO");
		var section_name = document.getElementsByName("SECTION_NAME");
		var count = 0;
		var hitFlag;

		for(var i = 0 ; i < select_item.length ; i++){
			item_check[i].value = select_item[i].checked;
			if(select_item[i].checked == true){
				count++;
				hitFlag = i;
			}
		}
		if(count <= 0){
			alert("ó���� �����Ͱ� �����ϴ�. ");
			return;
		}else if(count == 1){
			var type = f.TYPE.value;
			var section = f.SECTION.value;
			var tax_set = f.TAX_SET.value;
			var bj_cd = f.BJ_CD.value;
			var bonbun  = f.BONBUN.value;
			var bubun = f.BUBUN.value;
			var jumyongName = f.jumyongName.value;
			var numberValue = f.numberValue.value;
			var ft_typ = f.FT_TYP.value;
			var param = "/gapan/jumyong/view.do?GAPAN_NO="+gapan_no[hitFlag].value+"&type="+type+"&section="+section
				+"&tax_set="+tax_set+"&ft_typ="+ft_typ+"&bj_cd="+bj_cd+"&bonbun="+bonbun+"&bubun="+bubun
				+"&jumyongName="+jumyongName+"&numberValue="+numberValue
				+"&CAL_MODE=cal4&section_name="+section_name[hitFlag].value;
			location.href=param;
		}else{
			f.CAL_MODE.value = "cal4";
      Message_Display('Dlg_BatchCal4','Dlg_BatchCal4Main',1,'dialog-background', null,
    		function () {
					setDefaultSelect('YEAR1');	
				}
      );
		}

	};
	
	<%-- [201305.20 yjmoon ��η� �ϰ� ����. --%>
	function removeRent( pYear, pList) {
		var message = { year : pYear, list : pList};
		$.ajax({
			type: 'POST',
		  url: '/gapan/jumyong/batch_removeRental.do',
		  data: {msg : $.toJSON(message)},
		  contentType: 'application/x-www-form-urlencoded; charset=utf-8',
		  dataType: 'json',
		  success: function(data,textStatus,jqXHR){
			  var message = '�̺ΰ��� ��η� ���⳻�� �� ���� ������ �����ϴ�.';
			  switch(data.result) {
			  case 'success': {
				  message = data.status.year + '�⵵ ���⳻���� ���� ��û' + data.status.total + '�� ��  ' + data.status.success + '�� ���� �Ϸ� �Ǿ����ϴ�.';
				  break;
			  }
			  case 'error': {
				  break;
			  }
			  default:
				  break;
			  }
			  alert(message);
			  Message_Display('waitbar', 'img-wait', 0);
			},
		  error: function(jqXHR, textStatus, errorThrown ){
		  	alert(textStatus);
		  	Message_Display('waitbar', 'img-wait', 0); 
			}
	  });
	};

	<%-- [201305.20 yjmoon ��η� �ϰ� ���� onclick --%>
	function onclickRemoveRent() {
		var taxSet = '${tax_set}';

		var list = new Array();
		if(taxSet == '%' || taxSet == ''){
			alert('���Ա����� �����Ͽ� ��ȸ�� �������ּ���');
			return;
		}
		
		var f = document.jumyongForm;
		var $checkedtems = $('[name="SELECT_ITEM"]:checked');
		var len = $checkedtems.length;
		
		if (len > 0) {
			Message_Display('year-selector', 'year-selector-main', 1, 
				'dialog-background',
				'��η� �ϰ������� ���� ����⵵�� �����ϼ���.',
				function() {
					setDefaultSelect('YEAR10');
				},
				{
					id 		: 'positive-button',
					title : '����',
					src		: '/img/del_icon3.gif',
					func 	: function() { <%-- positive button --%>							
						Message_Display('waitbar', 'img-wait', 1, 'dialog-background');
						var year = $('#YEAR10').val();
						var $selectItems = $('[name="SELECT_ITEM"]');
						var $gapanNos = $('[name="GAPAN_NO"]');
						var $sectionNames = $('[name="SECTION_NAME"]');
						var len = $checkedtems.length;
		
						for (var i = 0; i < len; i++) {
							var item = {};
							if ($selectItems.eq(i).is(":checked")) {
								item.no = $gapanNos.eq(i).val();
								item.secton = $sectionNames.eq(i).val();
								list.push(item);
							}
						}
						removeRent(year, list);
					}
				},
				{
					id		: 'negative-button',
					title	: '���',
					func 	: function() { <%-- negative button --%>
					}
				}
			);
		} else {
			alert("ó���� �����Ͱ� �����ϴ�. ");
			return;
		}		
	};
	    
	function goExtension(){
		var f = document.jumyongForm;
		var select_item = document.getElementsByName("SELECT_ITEM");
		var item_check = document.getElementsByName("ITEM_CHECK");
		var gapan_no = document.getElementsByName("GAPAN_NO");
		var count = 0;
		var hitFlag;

		for(var i = 0 ; i < select_item.length ; i++){
			item_check[i].value = select_item[i].checked;
			if(select_item[i].checked == true){
				count++;
				hitFlag = i;
			}
		}
		if(count <= 0){
			alert("ó���� �����Ͱ� �����ϴ�. ");
			return;
		}else{
			Message_Display('Dlg_BatchExtention','Dlg_BatchExtentionMain',1,'dialog-background');
		}
	};
	
	function goExtentionSubmit(){
		var form 	= document.jumyongForm;
		var	str		= "";
    		
		if(form.NEW_MUL_FROMDATE.value.length	< 1){
    	str	+= "�����㰡 �������� �����ϼ���.\n";
    	form.NEW_MUL_FROMDATE.focus();
    }else if(form.NEW_MUL_TODATE.value.length	< 1){
    	str	+= "�����㰡 �������� �����ϼ���.\n";
    	form.NEW_MUL_TODATE.focus();
    }else if((Number(removeDash(form.NEW_MUL_TODATE.value))-Number(removeDash(form.NEW_MUL_FROMDATE.value))) < 2){
    	str	+= "�����㰡 �����Ϻ��� �������� ������ �����ϴ�.\n";
    }

    if(str	== "") {
			if(!confirm('�����㰡�Ⱓ�� �����Ͻðڽ��ϱ�?')){
      	return;
      }
    	document.jumyongForm.action = '/gapan/jumyong/batch_extention.do';
    	document.jumyongForm.submit();
    } else {
    	alert(str);
    	return;
    }
	};
			
</script>
</head>

<body onload="javascript:InitPage();">
<form id="jumyongForm" name="jumyongForm" action="/mdb/executeUpload.do" method="post" enctype="multipart/form-data">
<input name="toDateValue" id = "toDateValue" value="${toDate}" type="hidden">
<input name="fromDateValue" id = "fromDateValue" value="${fromDate}" type="hidden">
<input name="TYPE" id="TYPE" value="1" type="hidden">
<input name="CAL_MODE" id="CAL_MODE" type="hidden" >
<div id="dialog-background" class="dialog-background"></div>
<div id="waitbar" style="position: absolute;z-index: 100;visibility: hidden;">
<img src="/img/wait.gif" id="img-wait">
</div>
<div id="year-selector" style="position:absolute;z-index: 100;visibility:hidden;">
	<table id="year-selector-main" width="300px" height="150px" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;background-color:#c9dfed;filter:Alpha(Opacity=90)" cellpadding="0" cellspacing="0" class="sub_table">
		<tr>
			<td align="center">
				<table width="290px" height="140px" border="0" style="border-collapse:collapse;background-color:white;" cellpadding="0" cellspacing="0" class="sub_table">
					<tr>
					<td height="5px">
					</td>
					</tr>
					<tr>
						<td align="center">
							<font color="red"><span id="message">empty</span></font>
						</td>
					</tr>
					<tr>
						<td align="center">
							����⵵
							<select name="YEAR10" id="YEAR10" class="input_form1" style="width:60px">
							</select>
						</td>
					</tr>
					<tr>
						<td align="center" >
							<img id="positive-button" src="/img/cal_icon.gif" alt="����" width="56" height="18" border="0" style="cursor:pointer">
							<img id="negative-button" src="/img/can_icon.gif" alt="���" border="0" style="cursor:pointer" >
						</td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
</div>


<div id="Dlg_BatchExtention" style="position:absolute;visibility:hidden;z-index: 100;">
	<table id="Dlg_BatchExtentionMain" width="300px" height="150px" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;background-color:#c9dfed;filter:Alpha(Opacity=90)" cellpadding="0" cellspacing="0" class="sub_table">
		<tr>
			<td align="center">
				<table width="290px" height="140px" border="0" style="border-collapse:collapse;background-color:white;" cellpadding="0" cellspacing="0" class="sub_table">
					<tr>
					<td height="5px">
					</td>
					</tr>
					<tr>
						<td align="center">
							<font color="red">���ο� �����㰡�Ⱓ�� �����ϼ���.</font>
						</td>
					</tr>
					<tr>
						<td  align="center">
							<input name="NEW_MUL_FROMDATE" id ="NEW_MUL_FROMDATE" value="" type="text" class="input_form1" style="width:80px" readonly>
							<img src="/img/calendar_icon.gif" style="cursor:pointer" onclick="popUpCalendar(this, document.getElementById('NEW_MUL_FROMDATE'), 'yyyymmdd');">
							&nbsp;~&nbsp;
							<input name="NEW_MUL_TODATE" id ="NEW_MUL_TODATE" value="" type="text" class="input_form1" style="width:80px" readonly>
							<img src="/img/calendar_icon.gif" style="cursor:pointer" onclick="popUpCalendar(this, document.getElementById('NEW_MUL_TODATE'), 'yyyymmdd');">
						</td>
					</tr>
		
					<tr>
						<td align="center" >
							<img src="/img/ok_icon.gif" alt="Ȯ��" width="56" height="18" border="0" onClick="goExtentionSubmit();"  style="cursor:pointer">
							<img src="/img/can_icon.gif" alt="���" border="0" onclick="Message_Display('Dlg_BatchExtention','Dlg_BatchExtentionMain',0);" style="cursor:pointer" >
						</td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
</div>

<div id="Dlg_BatchCal1" style="position:absolute;visibility:hidden;z-index: 100;">
	<table id="Dlg_BatchCal1Main" width="300px" height="150px" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;background-color:#c9dfed;filter:Alpha(Opacity=90)" cellpadding="0" cellspacing="0" class="sub_table">
		<tr>
			<td align="center">
				<table width="290px" height="140px" border="0" style="border-collapse:collapse;background-color:white;" cellpadding="0" cellspacing="0" class="sub_table">
					<tr>
					<td height="5px">
					</td>
					</tr>
					<tr>
						<td align="center">
							<font color="red">�ϰ� ��������� ���� ����⵵�� �����ϼ���.</font>
						</td>
					</tr>
					<tr>
						<td align="center">
							����⵵
							<select name="YEAR1" id="YEAR1" class="input_form1" style="width:60px">
							</select>
						</td>
					</tr>
		
					<tr>
						<td align="center" >
							<img src="/img/cal_icon.gif" alt="����" width="56" height="18" border="0" onClick="document.jumyongForm.action = '/gapan/jumyong/batch_cal1.do';document.jumyongForm.submit();"  style="cursor:pointer">
							<img src="/img/can_icon.gif" alt="���" border="0" onclick="Message_Display('Dlg_BatchCal1','Dlg_BatchCal1Main',0);" style="cursor:pointer" >
						</td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
</div>

<div id="Dlg_BatchCal4" style="position:absolute;visibility:hidden;z-index: 100;">
	<table id="Dlg_BatchCal4Main" width="300px" height="150px" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;background-color:#c9dfed;filter:Alpha(Opacity=90)" cellpadding="0" cellspacing="0" class="sub_table">
		<tr>
			<td align="center">
				<table width="290px" height="140px" border="0" style="border-collapse:collapse;background-color:white;" cellpadding="0" cellspacing="0" class="sub_table">
					<tr>
					<td height="5px">
					</td>
					</tr>
					<tr>
						<td align="center">
							<font color="red">�ϰ� �Ӵ�� ����� ���� ����⵵�� �����ϼ���.</font>
						</td>
					</tr>
					<tr>
						<td align="center">
							����⵵
							<select name="YEAR4" id="YEAR4" class="input_form1" style="width:60px">
							</select>
						</td>
					</tr>
		
					<tr>
						<td align="center" >
							<img src="/img/cal_icon.gif" alt="����" width="56" height="18" border="0" onClick="document.jumyongForm.action = '/gapan/jumyong/batch_cal4.do';document.jumyongForm.submit();"  style="cursor:pointer">
							<img src="/img/can_icon.gif" alt="���" border="0" onclick="Message_Display('Dlg_BatchCal4','Dlg_BatchCal4Main',0);" style="cursor:pointer" >
						</td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
</div>

<table width="800" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td height="43"><img src="/img/sub9_cont1_title.gif" width="800" height="43"></td>
  </tr>
  <tr>
    <td ><table width="780" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td height="1" bgcolor="eaeaea"></td>
      </tr>
      <tr>
        <td height="14"></td>
      </tr>     
      <tr>
        <td><table width="780" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td align="left" height="22" background="/img/tab_line_blue.gif">
            <table border="0" cellspacing="0" cellpadding="0">
                <tr >
                  <td ><img src="/img/sub_petition_title15.gif" width="110" height="22"></td>
                </tr>
            </table></td>
          </tr>
		<tr>
            <td  class="contborder_purple"><table width="100%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                <td>
                <table width="100%" border="1" bordercolor="#c9dfed" style="border-collapse:collapse;" cellpadding="0" cellspacing="0"  class="sub_table">

                    <tr>
                      <td height="26px" width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">���Ա���</td>
					  <td width="35%" bgcolor="eaeaea" class="table_bl_left">
					  <select id="TAX_SET" name="TAX_SET" class="essential" style="width:130px">
						${taxation_section}
					  </select>
					  </td>
					<%--  BEGIN_KANG_20120426 --%>
					<%-- 
					  <td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">�ü�����</td>
					  <td bgcolor="eaeaea" class="table_bl_left">
						
						<select name="FT_TYP" ID="FT_TYP" class="input_form1" style="width:150px" onchange="javascript:selectFT_TYP(this)">
							<option value="%">::����::</option>
							<option value="011">�����ǸŴ�</option>
							<option value="012">���μ�����</option>
						</select>											  
					  </td>				
					 --%>
					 <td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b" >������ȣ</td>
                      <td bgcolor="eaeaea" class="table_bl_left">
					  	<input id="numberValue" name="numberValue" type="text" class="input_form1" style="width:130px"  onKeyDown="javascript:checkKeySearch();" value="${numberValue}">
					  </td>
					<%-- END_KANG_20120426 --%>
                    </tr>
                    <tr>
                      <td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">�ñ���</td>
					  <td bgcolor="eaeaea" class="table_bl_left">
					  <table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<tr>
							<td>
								<!--
								<select id="GU_CD" name="GU_CD" class="input_form1" style="width:130px">${gu_code}
								</select>
								-->
								<select id="GU_CD" name="GU_CD" class="input_form1" style="width: 130px" onchange="javascript:changeGuCd(this);">
                                    ${gu_code}
                                </select>
							</td>
						</tr>
					  </table>
					  </td>
					  <td align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
					  <td bgcolor="eaeaea" class="table_bl_left">
					  <table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
						<tr>
	                      <td>
	                      <select id="BJ_CD" name="BJ_CD" class="input_form1" style="width:130px">${bjdong_code}
	                      </select>
	                      </td>
						 </tr>
					  </table>
					  </td>
					</tr> 
                    <tr>
           			  <td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b">�� �� </td>
	                      <td bgcolor="eaeaea" class="table_bl_left">
						  <table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
	                        <tr>
	                          <td>
	                          <input id="BONBUN" name="BONBUN" type="text" class="input_form1" style="width:40px" >
							- <input id="BUBUN" name="BUBUN" type="text" class="input_form1" style="width:40px" >
	                          </td>
	                        </tr>
	                      </table>
                      </td>
					   <td align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
                      <td bgcolor="eaeaea" class="table_bl_left">
					  <table border="0" cellpadding="0" cellspacing="0" class="sub_stan">
                        <tr>
                          <td><input name="jumyongName" id="jumyongName" type="text" class="input_form1" style="width:130px" onKeyDown="javascript:checkKeySearch();" value="${jumyongName}"></td>
                        </tr>
                      </table></td>
                    </tr>
                	<tr>
					<%-- BEGIN_KANG_20120426 --%>
					<%-- 
					<td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b" >������ȣ</td>
                      <td bgcolor="eaeaea" class="table_bl_left">
					  	<input id="numberValue" name="numberValue" type="text" class="input_form1" style="width:130px"  onKeyDown="javascript:checkKeySearch();" value="${numberValue}">
					  </td>                	
					 --%>
					<td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">�ü�����</td>
					  <td height="26px" bgcolor="eaeaea" class="table_bl_left">
						
						<select name="FT_TYP" id="FT_TYP" class="input_form1" style="width:150px" onchange="javascript:selectFT_TYP(this)">
							<option value="%">::����::</option>
							<option value="011">�����ǸŴ�</option>
							<option value="012">���μ�����</option>
						</select>											  
					  </td>		
					<%-- END_KANG_20120426 --%>                	
						<td align="center" bgcolor="e5eff8" class="sub_table_b">�����</td>
						<td bgcolor="eaeaea" class="table_bl_left">
							<select id="SECTION" name="SECTION" class="input_form1" style="width:100px">
								<option value="1">����</option>
								<option value="4">����</option>
							</select>
						</td>
					</tr>
					<%-- BEGIN_KANG_20120423 --%>
					<tr>
                	  <td height="26px" align="center" bgcolor="e5eff8" class="sub_table_b" >�ü��� ��ȣ</td>
                      <td bgcolor="eaeaea" class="table_bl_left" colspan="3">
                      <div id="FacilityView" style="display:none">                      
                      	<table width="300px" border="0" cellpadding="0" cellspacing="0" align="left">
                      		<tr>
                      			<td align="left" class="sub_stan" >                      				
                      				<span id="Facility" class="sub_stan"></span>&nbsp;-&nbsp;
                      				<input id="FACILITY_NO" name="FACILITY_NO" type="text" class="input_form1" style="width:50px" onchange="isNum(this,'�ü��� ��ȣ')" maxlength="5" value="${FACILITY_NO}"/> 
                      			</td>                      			
                      		</tr>
                      	</table>
                      </div>
					  </td>
					</tr>
					<%-- END_KANG_20120423 --%>
                </table>
                </td>
              </tr>
                <tr>
                  <td height="40" align="right">
                  	<img src="/img/inquiry_icon2.gif" alt="��ȸ" width="56" height="18" border="0" onclick="javascript:goSearch();" style="cursor:pointer" >
                  </td>
                </tr>
                <tr>
                  <td height="1" bgcolor="#EAEAEA"></td>
                </tr>
                <tr>
                  <td height="34" class="sub_stan">��ü�Ǽ� : <span class="sub_stan_blue">${listCount}</span>�� </td>
                </tr>
                <tr>
                  <td>
                  	<table width="780px" cellpadding="0" cellspacing="0" border="0" class="sub_table" bordercolor="#c9dfed" style="border-collapse:collapse;">
								  <TR> <!-- 
								    <TD width="26px"  valign="top">
								      <TABLE cellpadding="0" cellspacing="0" border="1" class="sub_table" bordercolor="#c9dfed" style="border-collapse:collapse;">
								        <TR>
								              <td width="35px" height="30px" align="center" bgcolor="e5eff8" class="sub_table_b">
												<INPUT TYPE="checkbox" ID="SELECT_ALL" onclick="javascript:selectAll(this);">
											  </td>
								        </TR>
								      </TABLE>
								    </TD> -->
								    <TD width="2000px" valign="top">
								      <DIV id="topLine2" style="width:737px;overflow:hidden;">
								        <TABLE width="1530px" cellpadding="0" cellspacing="0" border="1" class="sub_table" bordercolor="#c9dfed" style="border-collapse:collapse;">
								          <TR>
								          
								          	<td width="35px" height="30px" align="center" bgcolor="e5eff8" class="sub_table_b">
															<INPUT TYPE="checkbox" ID="SELECT_ALL" onclick="javascript:selectAll(this);">
											  		</td>
								          
														<td width="40px" height="30px" align="center" bgcolor="e5eff8" class="sub_table_b">��ȣ</td>
					                  <td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">������ȣ</td>
											<%-- BEGIN_KANG_20120423 --%>
											<td width="130px" align="center" bgcolor="e5eff8" class="sub_table_b">�ü��� ��ȣ</td>
											<%-- END_KANG_20120423 --%>					                        
					                        <td width="80px" align="center" bgcolor="e5eff8" class="sub_table_b">���Ա���</td>
					                        <td width="80px" align="center" bgcolor="e5eff8" class="sub_table_b">���</td>
					                        <td width="150px" align="center" bgcolor="e5eff8" class="sub_table_b">������</td>
					                        <%-- BEGIN_DORO_NM 20140424 --%>
					                        <td width="250px" align="center" bgcolor="e5eff8" class="sub_table_b">���θ��ּ�</td>
					                        <%-- END_DORO_NM 20140424 --%>
					                        <%--  BEGIN_KANG_20120420 --%>
					                        <td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">��ȭ��ȣ</td>
					                        <td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">�޴���ȭ</td>
											<%-- END_KANG_20120420 --%>
					                        <%-- BEGIN_����_20120218 --%>
											<%-- 
											 <td width="250px" align="center" bgcolor="e5eff8" class="sub_table_b">���������ּ�</td>
											 --%>											
											<%-- END_����_20120218 --%>					                       
					                        <td width="100px" align="center" bgcolor="e5eff8" class="sub_table_b">�ü�����</td>
					                        <td width="50px" align="center" bgcolor="e5eff8" class="sub_table_b">����</td>
					                        
					                        <td width="150px" align="center" bgcolor="e5eff8" class="sub_table_b">���ݳ���</td>
					                        <td width="150px" align="center" bgcolor="e5eff8" class="sub_table_b">ó������</td>
					                        
					                        <td width="150px" align="center" bgcolor="e5eff8" class="sub_table_b">����Ⱓ</td>
					                        <td width="50px" align="center" bgcolor="e5eff8" class="sub_table_b">����(��)</td>                       
					                        <td width=100px align="center" bgcolor="e5eff8" class="sub_table_b">��������</td>                                                 
								          </TR>
								        </TABLE>
								      </DIV>
								    </TD>
								  </TR>
								  <TR><!-- 
								    <TD width="26px" valign="top">
								      <DIV id="leftDisplay2" style="width:26px;height:257px;overflow:hidden;">
								        <TABLE cellpadding="0" cellspacing="0" border="1" class="sub_table" bordercolor="#c9dfed" style="border-collapse:collapse;">
						          			<c:forEach items="${blist1}" var="board" varStatus="idx">
						  					<tr onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''"	style="cursor: pointer">
						  						<td width="35px" height="29px" align="center" bgcolor="e5eff8" class="sub_table_b">
						  							<INPUT TYPE="checkbox" id="SELECT_ITEM" NAME="SELECT_ITEM">
						  							<INPUT TYPE="hidden" id="GAPAN_NO" NAME="GAPAN_NO" value="${board.GAPAN_NO}"> 
						  							<INPUT TYPE="hidden" id="SECTION_NAME" NAME="SECTION_NAME" value="${board.SECTION_NAME}">
						  							<INPUT TYPE="hidden" id="ITEM_CHECK" NAME="ITEM_CHECK" value="">
						  						</td>
						  					</tr>
											</c:forEach>
								        </TABLE>
								      </DIV>
								    </TD> -->
								    <TD width="754px" valign="top">
								    <%-- END_KANG_20120420 --%>
								      <DIV id="mainDisplay2" style="width:754px;height:274px;overflow-x:scroll;overflow-y:scroll;scrollbar-face-color:#EEF8FB;scrollbar-3dlight-color:#BBBDB6; scrollbar-highlight-color:#EEF8FB;scrollbar-shadow-color:#BBBDB6; scrollbar-darkshadow-color:#EEF8FB;scrollbar-track-color:#EEF8FB;scrollbar-arrow-color:#BBBDB6;" onscroll="scrollColumn()">
										 <TABLE width="1530px" cellpadding="0" cellspacing="0" border="1" class="sub_table" bordercolor="#c9dfed" style="border-collapse:collapse;">
								          <c:forEach items="${blist1}" var="board" varStatus="idx">
								          
								          <tr>
								          	<td rowspan="2" width="35px" height="29px" align="center" bgcolor="e5eff8" class="sub_table_b">
							  							<INPUT TYPE="checkbox" id="SELECT_ITEM" NAME="SELECT_ITEM">
							  							<INPUT TYPE="hidden" id="GAPAN_NO" NAME="GAPAN_NO" value="${board.GAPAN_NO}"> 
							  							<INPUT TYPE="hidden" id="SECTION_NAME" NAME="SECTION_NAME" value="${board.SECTION_NAME}">
							  							<INPUT TYPE="hidden" id="ITEM_CHECK" NAME="ITEM_CHECK" value="">
							  						</td>
								          </tr>
								          
													<tr height="26px" onMouseOver="this.style.backgroundColor='#f6f7f8'" onMouseOut="this.style.backgroundColor=''"	style="cursor: pointer" onclick="goView('${board.GAPAN_NO}');">
													<td width="40px" align="center"> ${board.NO}</td>
							                        <td width="100px" align="center" >${board.GAPAN_NO}</td>
													<%-- BEGIN_KANG_20120423 --%>
													<td width="130px" align="center" ><c:if test="${board.FACILITY_NO != null && board.FACILITY_NO != ''}">${board.FT_TYP} - ${board.FACILITY_NO}</c:if></td>
													<%-- END_KANG_20120423 --%>							                        
							                        <td width="80px" align="center">${board.TAX_SET_NAME}</td>                        
							                        <td width="80px" align="center">${board.NAME}</td>
							                        <td width="150px" align="center">${board.ADDR}</td>
							                        <%-- BEGIN_DORO_NM_2014424 --%>
							                        <td width="300px" align="center" ><c:if test="${board.DORO_NM != null && board.DORO_NM != ''}">${board.SI} ${board.GUN} ${board.DORO_NM} ${board.BD_BON}<c:if test="${board.BD_BU != '0' && board.BD_BU != null}">-${board.BD_BU}</c:if> ${board.BD_NM} ${board.BD_DET_NM}</c:if></td>
							                        <%-- END_DORO_NM_2014424 --%>	
							                        <!--  //********** BEGIN_KANG_20120420 -->
							                        <td width="100px" align="center"><c:if test="${board.OWNER_TEL != '--' }">${board.OWNER_TEL}</c:if></td>
							                        <td width="100px" align="center">${board.OWNER_HP}</td>
													<%-- END_KANG_20120420 --%>
							            <%-- BEGIN_����_20120218 --%>
													<%-- 
													<td width="250px" align="center">${board.SI}&nbsp;${board.GUN}&nbsp;${board.DORO_NM}&nbsp;${board.BD_BON}&nbsp;${board.BD_BU}&nbsp;</td>
													--%>
													<%-- END_����_20120218 --%>							                        
							                        <td width="100px" align="center">${board.FT_TYP}</td>    
							                        <td width="50px" align="center">
					                        		<c:choose>
					                        		<c:when test="${board.VIO_ACCPOINTS >= 100}">
					                        		<font color="red">${board.VIO_ACCPOINTS}</font>
					                        		</c:when>
					                        		<c:otherwise>
					                        		${board.VIO_ACCPOINTS}
					                        		</c:otherwise>
					                        		</c:choose>
					                        		</td>
					                        		<td width="150px" align="center">${board.VIO_CD_NAME}</td>
					                        		<td width="150px" align="center">${board.VIO_ACTCD_NAME}</td>
							                        <td width="150px" align="center">${rnic:addDash(board.MUL_FROMDATE)} ~ ${rnic:addDash(board.MUL_TODATE)}</td>
					                        		<td width="50px" align="center">${board.PLACE_A}</td>                                                                 	                        
							                        <td width="100px" align="center">${rnic:addDash(board.UP_DATE)}</td>                                                                           
												</tr>
											</c:forEach>	
								        </TABLE>																		        
								      </DIV>
								    </TD>
								    <%-- END_KANG_20120420 --%>
								  </TR>
								</table>
				 			 </td>
                </tr>
	              <tr>              
		                <td height="40" align="right">
			                <table border="0" width="100%">
			                	<tr>
				                	<td align="right">
				                	<%-- [20130523] yjmoon �׽�Ʈ�� 
				                		<img src="/img/gapan_cal1.gif" alt="����� ����" border="0" onclick="javascript:calcJumyong();" style="cursor: pointer;">
				                		<img src="/img/del_icon5.gif" alt="����� ����" border="0" onclick="javascript:onclickRemoveJumyong();" style="cursor: pointer;">
				                		<img src="/img/gapan_cal4.gif" alt="�Ӵ�� ����" border="0" onclick="javascript:calcRent();" style="cursor: pointer;">
				                		<img src="/img/del_icon5.gif" alt="�Ӵ�� ����" border="0" onclick="javascript:onclickRemoveRent();" style="cursor: pointer;">
				                		<img src="/img/extension.gif" alt="�㰡�Ⱓ ����" border="0" onclick="javascript:goExtension();" style="cursor:pointer;">
					                	<img src="/img/excel_icon.gif" alt="EXCEL ��ȯ" border="0" onclick="javascript:excel_Search();" style="cursor:pointer;">					              
					                 --%>
					                 <%-- ����� �� ��η� �ϰ� ���� ��� �߰�. --%>
			                            <img src="/img/rojum_register.gif" id="register" alt="�űԵ��" border="0" onclick="javascript:gapanRegister();">
				                		<img src="/img/gapan_cal1_n_del.gif" alt="����� ���� | ����" border="0" style="cursor: pointer;" usemap="#cal1map">
				                		<map name="cal1map">
				                			<area shape="rect" coords="5,2,81,20" onclick="javascript:calcJumyong();" alt="����� ����" />
				                			<area shape="rect" coords="83,2,115,20" onclick="javascript:onclickRemoveJumyong();" alt="����� ����" />
				                		</map>
				                		<img src="/img/gapan_cal4_n_del.gif" alt="��η� ���� | ����" border="0" style="cursor: pointer;" usemap="#cal4map">
				                		<map name="cal4map">
				                			<area shape="rect" coords="7,2,84,20" onclick="javascript:calcRent();" alt="��η� ����" />
				                			<area shape="rect" coords="86,2,114,20" onclick="javascript:onclickRemoveRent();" alt="��η� ����" />
				                		</map>
				                		<img src="/img/extension.gif" alt="�㰡�Ⱓ ����" border="0" onclick="javascript:goExtension();" style="cursor:pointer;">
					                	<img src="/img/excel_icon.gif" alt="EXCEL ��ȯ" border="0" onclick="javascript:excel_Search();" style="cursor:pointer;">					              
					                </td>						                
				                </tr>
				             </table>
										</td>
		              </tr>
            </table></td>
          </tr>
        </table></td>
      </tr>
      <tr>
        <td height="30"></td>
      </tr>
</table>
</td></tr></table>
</form>
</body>

<script type="text/javascript">

var org_cd = ${org_cd};				//����� �ñ��� ��� �ڵ�
var dept_cd = ${dept_cd};			//����� �μ��ڵ�
	if(org_cd==0 && user == 'k00000013'){
		//$("#register").show();
		///$("#register").show();
		$("#register").show();
	}else if(user == 'roadsdb'){
		$("#register").show();
	}else{
		//$("#register").hide();
		$("#register").hide();
	}
</script>

</html>