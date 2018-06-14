/*******************************************************************************
	*최초작성일 : 2006.06.20
	*최초작성자 : mylee
	*주요처리내용 : 폼 체크용 공통 함수
	*수정일 :
	*수정자 :
	*수정내용 :	각자 필요한 내용을 수정,등록해 사용하시면 됩니다
 ******************************************************************************/
/*
 *	global variable 선언
 */
var KEY_ENTER = 13;
var HOST_URL = 'www.juso.go.kr';
var MAP_VERSION = '1,0,0,73';

/* add/remove handler */
var addHandler = document.addEventListener ? 
	function (target, eventType, handler) {
		target.addEventListener(eventType, handler, false);
	} :
	function (target, eventType, handler) {
		target.attachEvent('on' + eventType, handler);
		
	};

var removeHandler = document.removeEventListener ?
	function (target, eventType, handler) {
		target.removeEventListener(eventType, handler, false);
	} :
	function (target, eventType, handler) {
		target.detachEvent('on' + eventType, handler);
	};

var setPosition = function(element) {
	var dx = parseInt(document.body.clientWidth/2)+parseInt(element.offsetWidth/2);
	var dy = parseInt(document.body.clientHeight/2)-parseInt(element.offsetHeight/2);

	if(ie){
		element.style.pixelTop = document.body.scrollTop + dy;
		element.style.pixelLeft = 300;
	}
	else if(moz){
		element.style.top = window.pageYOffset + dy + 'px';
		element.style.left = window.innerWidth - dx + 'px';
	}
};

/*
	자리수만큼 자르기
	size : 소수점이하 자리수
*/
function isAllow(code) {
	rejectCode = new Array ("'","\"","/","\\",";",":","-","+");

	for(var i=0; i<rejectCode.length; i++) {
		element = rejectCode[i];
		if(element == code){	
			alert("허용하지 않는 문자를 입력하셨습니다.");
			return false;
		}
	}
	return true;
}

function isBizArea(code) {
	
	if(code.length < 5)
		return true;
	else if(code.length>5)
		code = code.substring(0,5);
		
	areaCode = new Array( "27140",	"41281", "11680", "11740", "11305", "11500", "11620",
							"11215", "11530", "11545", "11350", "11320",
							"11230", "11590", "11440", "11410", "11650",
							"11200", "11290", "11710", "11470", "11560",
							"11170", "11380", "11110", "11140", "11260",
							"26440", "26410", "26290", "26170", "26260",
							"26230", "26320", "26530", "26380", "26140",
							"26500", "26710", "26200", "26470", "26110",
							"26350", "27200", "27290", "27710", "27410",
							"27230", "27170", "27260", "27100", "28245",
							"28170", "28200", "28140", "28237", "28260",
							"28185", "28110", "29200", "29155", "29110",
							"29170", "29140", "30230", "30110", "30170",
							"30200", "30140", "31140", "31170", "31200",
							"31110", "42150", "42170", "42210", "42130",
							"42110", "42720", "42190", "41282", "41285",
							"41287", "41290", "41210", "41610", "41310",
							"41360", "41250", "41197", "41199", "41195",
							"41135", "41131", "41133", "41113", "41117",
							"41111", "41115", "41273", "41271", "41550",
							"27110", "", "41370", "41463", "41465",
							"41461", "41430", "41150", "41500", "41480",
							"41450", "41590", "41570", "43150", "43111",
							"43113", "43130", "44150", "44710", "44230",
							"44180", "44131", "44200", "45130", "45210",
							"45190", "45730", "45140", "45111", "45113",
							"45180", "46230", "46110", "46150", "46130",
							"47130", "47150", "47170", "47210", "48310",
							"48240", "48110", "48190", "50130", "50110",
							"41173", "41171", "41410", "41390", "41630",
							"41460", "41220", "41650", "41830", "41730",
							"42230", "42830", "42810", "42770", "42730",
							"43760", "43720", "43770", "43745", "43750",
							"44210", "44250", "44730", "44760", "44810",
							"44790", "45710", "46170", "46710", "46840",
							"46870", "46830", "46880", "46860", "47290",
							"47190", "47230", "47110", "47280", "48160",
							"48270", "48330", "48170", "48220", "48870",
							"44133", "44130"); //44130_컨버팅후삭제
							
	for(var i=0; i<areaCode.length; i++) {
		element = areaCode[i];
		if(element == code){			
			return true;
		}
	}
	
	return false;
}

function isExceptArea(code){
	//areaCode = new Array("41280", "41190", "41130", "41110", "41270", "41170", "41460", "47110", "45110", "43110", "43130");
	areaCode = new Array("고양시", "부천시", "성남시", "수원시", "안산시", "안양시", "용인시", "포항시", "전주시", "청주시","천안시");
	for(var i=0; i<areaCode.length; i++){
		element = areaCode[i];
		if(element == code){
			return true;
		}
	}
	return false;
}

function isEngExceptArea(code){
	//areaCode = new Array("41280", "41190", "41130", "41110", "41270", "41170", "41460", "47110", "45110", "43110", "43130");
	areaCode = new Array("Goyang-si", "Bucheon-si", "Seongnam-si", "Suwon-si", "Ansan-si", "Anyang-si", "Yongin-si", "Pohang-si", "Jeonju-si", "Cheongju-si", "Cheonan-si");
	for(var i=0; i<areaCode.length; i++){
		element = areaCode[i];
		if(element == code){
			return true;
		}
	}
	return false;
}

function trunc(num,size){
	
	var str = num+'';
	var idx = str.indexOf('.');
	var positiveNum = '';
	var decimalNum = '';

	if(idx != -1){
		positiveNum = str.substring(0,idx);
		decimalNum = str.substring(idx+1,(idx+1)+size);
		
		if(decimalNum != '00')
			return positiveNum+'.'+decimalNum;
		else
			return positiveNum;
	}
	else
		return str;
}

/*
	기능 : status bar에 링크 표시 없애고 title세팅
*/
//function setHideStatus()
//{
//    window.status="::: 보다쉽게 목적지로 안내해드립니다. - 알기쉬운 새주소 :::";
//    return true;
//}

//if (document.layers)
//document.captureEvents(Event.mouseover | Event.mouseout);
//document.onmouseover=setHideStatus;
//document.onmouseout=setHideStatus;

/*
	기능 : 입력데이터가 올바른 전화번호인지 확인 (-포함)
	----------------------------------------------
	인자 : theField 입력데이터
	반환값 : boolean
*/
function isTelNum(theField){
	 var str = theField.value;
	 var isNum = /^[0-9-]+$/;
     if( !isNum.test(str) ) {
     	  alert('전화번호를 확인해주세요!');
     	  theField.focus();
          return false; 
     }else {
		 return true;
	 }
}


/*
	기능 : 입력받은 이메일이 형식에 맞는지 확인
	--------------------------------------
	인자 : theField 입력문자열
	반환값 : boolean
*/
function isEmail(theField)
{
  var s = theField.value;
  if(s != ''){
	  if(s.search(/^\s*[\w\~\-\.]+\@[\w\~\-]+(\.[\w\~\-]+)+\s*$/g)>=0) {
		  return true;
	  }
	  else {
		  alert('이메일주소를 확인해주세요!');
		  theField.select();
		  theField.focus();
		  return false;
	  }
  }
  else
   	return true;
}

/*
문자열 trim함수
*/
function trim(strSource) {
 
	return strSource.replace(/(^\s*)|(\s*$)/g, ""); 

}

/*
All 문자치환
*/
String.prototype.replaceAll = function( searchStr, replaceStr )
{
	var temp = this;

	while( temp.indexOf( searchStr ) != -1 )
	{
		temp = temp.replace( searchStr, replaceStr );
	}

	return temp;
}

/*
널 스트링 체크  
*/
function checkStrNVMsg(form_nm,ele_nm) {	
	if (trim(form_nm.value)=="") {
		alert(ele_nm+'을(를) 입력해주세요!     ');
		
//		var msg = '<fmt: key="errors.required">	<fmt:param value="'+ele_nm+'"/></fmt:message>';
//		alert(msg);
		
		form_nm.value="";
		
		form_nm.focus();
		return false;
		
	}
	return true;
}

function isCheckPW(form_nm,ele_nm) {
	
	if (trim(form_nm.value)=="") {
		alert(ele_nm+'을(를) 입력해주세요!     ');
				
		form_nm.value="";
		
		form_nm.focus();
		return false;
	}
	if (form_nm.value.length<8)
	{
		alert("비밀번호는 8자리 이상이어야 합니다.");
		form_nm.focus();
		return false;
	}
	
	return true;
	
}

/*
	입력칸의 숫자만 입력받기
	target	: 	html object(text,textarea)
*/
function isNum(form_nm, ele_nm){
	var inText = form_nm.value;
	var ret;

		for (var i = 0; i < inText.length; i++) {
			ret = inText.charCodeAt(i);
				if (!((ret > 47) && (ret < 58))) {
					alert(ele_nm+'란에는 숫자만 입력하세요');
					form_nm.value = "";
					form_nm.focus();
					return false;
				}
		}
		return true;
}

/*
	날짜입력받기
	target	: 	html object(text,textarea)
*/
function isDate(form_nm, ele_nm){
	var inText = form_nm.value;
	var ret;

	if(inText == "")
		return true;
		
	for (var i = 0; i < inText.length; i++) {
		ret = inText.charCodeAt(i);
			if (!((ret > 47) && (ret < 58))) {
				alert(ele_nm+'란에는 숫자만 입력하세요');
				form_nm.value = "";
				form_nm.focus();
				return false;
			}
	}

	if(inText.length != 8 ){
		
		alert('yyyymmdd 형태로 입력하세요');
		form_nm.focus();
		return false;
	}

	var yyyy	= inText.substring(0,4);
	var mm 		= inText.substring(4,6);
	var dd 		= inText.substring(6,8);

	if(yyyy < 1900){
		alert('날짜를 확인하세요');
		form_nm.focus();
		return false;
	}
	else if(mm > 12){
		
		alert('날짜를 확인하세요');
		form_nm.focus();
		return false;
	}
	else if(dd < 1){
		alert('날짜를 확인하세요');
		form_nm.focus();
		return false;
	}
	else{
	
		var endDay = new Array(31,28,31,30,31,30,31,31,30,31,30,31);
		//윤달
    	if ((yyyy % 4 == 0 && yyyy % 100 != 0) || yyyy % 400 == 0) {
        	endDay[1] = 29;
  		}

    	if(dd > endDay[mm-1]){
    		alert('날짜를 확인하세요');
			form_nm.focus();
			return false;
    	}
    	else
    		return true;
    }
}

/*
	입력칸에 숫자&영문만 입력받기
	target	: 	html object(text,textarea)
*/
function isNumOrEngChar(form_nm, ele_nm){
	var inText = form_nm.value;
	var ret;

		for (var i = 0; i < inText.length; i++) {
			ret = inText.charCodeAt(i);

				if (!((ret>47 && ret<58) || (ret>64 && ret<91) || (ret>96&&ret<123)))
				{
					alert(ele_nm+'란에는 숫자와 영문만 입력하세요');
					form_nm.value = "";
					form_nm.focus();
					return false;
				}
		}
		return true;
}

function Check_AlphaNumericSpecial(checkStr, value) {
	var checkOK = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	var checkNUM = "0123456789";
	var result = 0;
	var resultOK = 0;
	
	for (i = 0;  i < checkStr.value.length;  i++) {
		var ch = checkStr.value.charAt(i);
		
		for (j = 0;  j < checkOK.length;  j++){
			//alert(ch+","+checkOK.charAt(j));
			if (ch == checkOK.charAt(j)){
				//alert(ch+","+checkOK.charAt(j)+"|");
				result = 1;
			}
		}
		
	}
	if (result==1)
	{
		for (k = 0;  k < checkStr.value.length;  k++) {
			var ch = checkStr.value.charAt(k);
			
			for (n = 0;  n < checkNUM.length;  n++){				
				if (ch == checkNUM.charAt(n)){
					result = 2;					
				}				
					//return true;
			}			
		}
		if (result==2)
		{
			return true;
		}
		else 
		{
			alert(value+"는 영문/숫자 혼합이여야 합니다.");
			return false;
		}
	}
	else{	
		alert(value+"는 영문/숫자 혼합이여야 합니다.");
		return false;
	}
}

function AlphaNumericSpecial(checkStr, value) {
	var checkOK = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	var checkNUM = "0123456789";
	var result = 0;
	var resultOK = 0;
	
	for (i = 0;  i < checkStr.value.length;  i++) {
		var ch = checkStr.value.charAt(i);
		
		for (j = 0;  j < checkOK.length;  j++){
			//alert(ch+","+checkOK.charAt(j));
			if (ch == checkOK.charAt(j)){
				//alert(ch+","+checkOK.charAt(j)+"|");
				result = 1;
			}
		}
		
	}
	if (result==1)
	{
		for (k = 0;  k < checkStr.value.length;  k++) {
			var ch = checkStr.value.charAt(k);
			
			for (n = 0;  n < checkNUM.length;  n++){				
				if (ch == checkNUM.charAt(n)){
					//alert(ch+","+checkNUM.charAt(n)+"|");
					return true;
				}
					//return true;
			}
			
		}
	}
	else{	
		alert(value+"는 영문/숫자 혼합이여야 합니다.");
		return false;
	}
}

//체크박스 전체선택, 선택해제
function checkAll(formname,checkname,thestate){
	var el_collection=eval("document.forms."+formname+"."+checkname)

	if(el_collection != null)	{
		if(el_collection.length){
			for (c=0;c<el_collection.length;c++)
				el_collection[c].checked=thestate
		}
		else{
			el_collection.checked=thestate;
		}
	}
}

/**
* 입력필드의 유효성 검사를 해준다
* @param obj     : input 객체
* @param objname : 필드명 (ex) 제목
* @param astr    : 입력값의 제한을 둔다(STRING_DEF_ALPHA,STRING_DEF_NUMBER,STRING_DEF_TELDIGIT를 이용하면 편합니다)
*                  지정해 준 값만 허용하는 것이다
* @param lmin    : 최소 입력길이(byte 수)
* @param lmax    : 최대 입력길이(byte 수)
* @param showmsg : true이거나 아예 넘기지 않으면 alert를 한다
*                   false 이면 check하고 결과만 true,false로 return 한다
*/
function isString( obj , objname, astr, lmin, lmax , showmsg ){
	var i
	var t = obj.value;
	var lng = GetByteLength(obj);

	if (lng < lmin || lng > lmax) {
		if(showmsg!=null && showmsg) {
			if (lmin == lmax) alert(objname + '는 ' + lmin + ' 자 이어야 합니다');
			else alert(objname + '는 ' + lmin + ' ~ ' + lmax + ' 자 이내로 입력하셔야 합니다');
			obj.focus()
		}
		return false
	}
	if (astr.length > 1) {
		for (i=0; i < lng; i++){
			if(astr.indexOf(t.substring(i,i+1))<0) {
				if(showmsg!=null && showmsg) {
					alert(objname + '에 허용할 수 없는 문자가 입력되었습니다');
					obj.focus()
				}
				return false
			}
		}
	}
	return true
}

/**
* 스트링의 바이트 수를 센다(length를 하면 한글도 길이1로 나오는데 바이트 수는 2가 된다)
* @param obj   : textfield ,textarea objec
* @return 바이트 수
*/
function getByteLength( obj ){
	var msg = obj.value;
	var str = new String(msg);
	var len = str.length;
	var count = 0;
	for (k=0 ; k<len ; k++){
		temp = str.charAt(k);

		if (escape(temp).length > 4) {
			count += 2;
		}
		else if (temp == '\r' && str.charAt(k+1) == '\n') { // \r\n일 경우
			count += 2;
		}
		else if (temp != '\n') {
			count++;
		}
        else {
            count++;
        }
    }
	return count;	
}

/**
* 입력필드에 공백만 입력되었는지 검사를 해준다
* @param obj     : input 객체
* @param objname : 필드명 (ex) 제목
* @param showmsg : true이거나 아예 넘기지 않으면 alert를 한다
*                   false 이면 check하고 결과만 true,false로 return 한다
*/
function isBlank( obj , objname , showmsg){
	if(obj.value.replace(/ /ig,"")==""){
		if(showmsg!=null && showmsg) {
			alert(objname + "을(를) 입력하세요!");
			obj.focus();
		}
		return false;
	}
	return true;
}

/**
* 스트링의 바이트 수를 센다(length를 하면 한글도 길이1로 나오는데 바이트 수는 2가 된다)
* @param obj   : textfield ,textarea objec
* @return 바이트 수
*/
function getBytes( str ){
	var str = new String(str);
	var len = str.length;
	var count = 0;

	for (k=0 ; k<len ; k++){
		temp = str.charAt(k);
		
		if (escape(temp).length > 4) {
			count += 2;
		}
		else if (temp == '\r' && str.charAt(k+1) == '\n') { // \r\n일 경우
			count += 2;
		}
		else if (temp == '\r') { // \r일 경우
			count++;
		}
		else if (temp != '\n') {
			count++;
		} else {
			count++;
		}	
	}
	return count;	
}

/**
* 스트링을 바이트 수만큼 자른다. 물론 한글을 깨지지 않게 잘라준다(한글이 짤릴경우 버림을 취한다)
* maxlength만큼 자른 후 obj의 값을 자른 결과로 setting한다
* @param obj       : textfield ,textarea objec
* @param mexlength : 최대길이
*/
function cutBytesString( str, maxlength) {
	var len=0;
	var temp;
	var count;
	count = 0;
		
	len = str.length;

	for(k=0 ; k<len ; k++) {
		temp = str.charAt(k);

		if (escape(temp).length > 4) {
			count += 2;
		}
		else if (temp == '\r' && str.charAt(k+1) == '\n') { // \r\n일 경우
			count += 2;
		}
		else if (temp == '\r') { // \r일 경우
			count++;
		}
		else if (temp != '\n') {
			count++;
		} else {
			count++;
		}	
		if(count > maxlength) {
			str = str.substring(0,k);
			break;
		}
	}
	return str;
}

/**
* 팝업윈도우를 띄운다
* @param pop       : url
* @param winName   : 팝업 윈도우 이름
* @param width, height : 너비, 높이
* @param scroll	: scroll여부(yes/no)
* @param resize	: 마우스 드래그로 윈도우 크기 조정 가능 여부(yes/no)
*/
function popWindow(pop,winName,width,height,scroll,resize)
{
	var url = pop;  
	var openWin;
	if (scroll == "" || scroll == null) {
		scroll = "no";
	} else{
		scroll = scroll;
	}
	if (resize == "" || resize == null) {
		resize = "no";
	} else{
		resize = resize;
	}
	window.open(url,winName,'menubar=no,scrollbars='+scroll+',resizable='+resize+',width='+width+',height='+height+',left=100,top=100');
	
	if(openWin && !openWin.closed)
	{
		openWin.focus();
	}
}	

/**
* select의 선택된 값을 리턴
* @param obj       : select객체
*/
function getSelectedValue(obj)
{
	return obj.options[obj.selectedIndex].value;

}

/**
* select의 선택된 텍스트를 리턴
* @param obj       : select객체
*/
function getSelectedText(obj)
{
	return obj.options[obj.selectedIndex].innerHTML;

}


/**
* select의 option을 선택된 값으로 지정
* @param obj       : select객체
* @param val       : 선택시킬 option의 value
*/
function setSelectedOption(obj, val)
{

	for(i = 0 ; i < obj.options.length ; i++){
		if(obj.options[i].value == val){

			obj.options[i].selected = true;
			return;
		}
	}
}

/**
* select의 option을 선택된 값으로 지정 (name으로)
* @param obj       : select객체
* @param val       : 선택시킬 option의 value
*/
function setSelectedOptionByName(obj, val)
{

	for(i = 0 ; i < obj.options.length ; i++){
		if(obj.options[i].name == val){

			obj.options[i].selected = true;
			return;
		}
	}
}

/**
* 파일 갯수 체크
* @param form       : 입력폼객체
*/
	function checkFileCount(form, cnt){

		var w = form;
		
		if(document.all("ch_file") != null){
		
			// 기존 첨부된 파일갯수 체크
			// uncheck된 체크박스 갯수+파일인풋갯수 <= 3
			var chObj = w.ch_file;
			var chCount = chObj.length;
			var fileCount = 0 ;			// 파일 갯수
			
			// 기존파일이 한개일 경우
			if(chCount == undefined ){
				if(chObj.checked == false)
					fileCount = fileCount + 1;
			} 
			// 기존파일이 두개 이상일 경우
			else if (chCount > 1){
				for(i = 0 ; i < chCount ; i++){
					if(chObj[i].checked == false)
						fileCount = fileCount + 1;	// 기존파일갯수 합산
				}
			}
		}

		// 새로 첨부된 파일갯수 체크
		fileCount = fileCount+parseInt(w.total_file_index.value);

		if(fileCount > cnt){
			alert("파일은 "+cnt+"개까지 업로드할 수 있습니다");
			return false;
		}	
		
		return true;

	}
	

/**
* checkbox array 선택된 값이 있는지 확인
*/
		function isCheckboxChecked(obj, ele_nm)
		{ 
			var chCount = obj.length;
			
			if(chCount == undefined ){
				return true;
			} 
			else if (chCount > 1){
				for(i = 0 ; i < chCount ; i++){
					if(obj[i].checked == true)
						return true;
				}
				alert(ele_nm+'을(를) 선택해주세요!     ');
				//obj.focus();
				return false;
			}
			return true;
		} 
		
/**
* select 선택된 값이 있는지 확인
*/
		function isSelectSelected(obj, ele_nm)
		{ 
			if(getSelectedValue(obj) == ''){
				alert(ele_nm+'을(를) 선택해주세요!     ');
				obj.focus();
				return false;
			}
			return true;			
		} 
		
/**
* radio array 선택된 값이 있는지 확인
*/
		function isRadioChecked(obj, ele_nm)
		{ 
			var chCount = obj.length;
			
			if(chCount == undefined ){
				return true;
			} 
			else if (chCount > 1){
				for(i = 0 ; i < chCount ; i++){
					if(obj[i].checked == true)
						return true;
				}
				alert(ele_nm+'을(를) 선택해주세요!     ');
				return false;
			}
			return true;
		} 

/**
* 법인번호 확인
*/
function isValidCorpNum(obj1, obj2, ele_nm){

	var corpNum = obj1.value+''+obj2.value;
	
	if(corpNum.length != 13){
		alert('법인등록번호를 확인해주세요');
		obj1.focus();
		return false;
	}
	else if(!isNum(obj1, ele_nm)){
		
		return false;
	}
	else if(!isNum(obj2, ele_nm)){
		
		return false;
	}
	else if(Math.abs((10-(corpNum.charAt(0)*1+corpNum.charAt(1)*2+corpNum.charAt(2)*1+
                               corpNum.charAt(3)*2+corpNum.charAt(4)*1+
                               corpNum.charAt(5)*2+corpNum.charAt(6)*1+
                               corpNum.charAt(7)*2+corpNum.charAt(8)*1+
                               corpNum.charAt(9)*2+corpNum.charAt(10)*1+
                               corpNum.charAt(11)*2)%10)%10) == corpNum.charAt(12)){
		return true;
	}
	else{
		alert('법인등록번호가 유효하지 않습니다');
		obj1.focus();
		return false;
	}
}

/**
* radio array 선택된 값 리턴
*/
		function getRadioChecked(obj)
		{ 
			var chCount = obj.length;

			if(chCount == undefined ){
				return null;
			} 
			else if (chCount > 1){
				for(i = 0 ; i < chCount ; i++){
					if(obj[i].checked == true)
						return obj[i].value;
				}
				return null;
			}
			return null;
		} 
		
/**
*checkbox, radiobutton disabled로 전환
*/
		function setRadioDisabled(obj, flag)
		{ 
			var chCount = obj.length;
			
			if(chCount == undefined ){
				return ;
			} 
			else if (chCount > 1){
				for(i = 0 ; i < chCount ; i++){
					obj[i].disabled = flag;
				}
			}
		} 

/**
*브라우져 내 컨트롤 활성화 
*/
function ObjectLoad(objTag)
{
	document.write(objTag);
}

function isValidSsn(obj1, obj2){
	
	var chk =0;
	
	for (var i = 0; i <=5 ; i++){
		chk = chk + ((i%8+2) * parseInt(obj1.value.substring(i,i+1)))
		}
		
		for (var i = 6; i <=11 ; i++){
		chk = chk + ((i%8+2) * parseInt(obj2.value.substring(i-6,i-5)))
		}
		
		chk = 11 - (chk %11)
		chk = chk % 10
		
		if (chk != obj2.value.substring(6,7))
		{
			alert ("주민등록번호가 유효하지 않습니다.");
			obj1.focus();
			return false;
		}
		return true;
}

/**
* 사업자번호 유효성 체크
*/
function isValidBusNum(obj1,obj2,obj3) {
	if(obj1.value+''+obj2.value+''+obj3.value != ''){
		if (obj1.value+''+obj2.value+''+obj3.value == '0000000000')
		{
			alert("사업자등록번호가 유효하지 않습니다.");
			obj1.focus(); 
			return false; 
		}

		if (BizCheck(obj1,obj2,obj3) == false) { 
			alert( "사업자등록번호가 유효하지 않습니다." ); 
			obj1.focus(); 
			return false; 
		} else { 
			return true; 
		} 
	}
	else
		return true;
}

//사업자 등록번호 체크 
function BizCheck(obj1, obj2, obj3) 
{ 
	biz_value = new Array(10); 
	
	var objstring = obj1.value +"-"+ obj2.value +"-"+ obj3.value; 
	var li_temp, li_lastid; 
	
	if ( objstring.length == 12 ) { 
	biz_value[0] = ( parseFloat(objstring.substring(0 ,1)) * 1 ) % 10; 
	biz_value[1] = ( parseFloat(objstring.substring(1 ,2)) * 3 ) % 10; 
	biz_value[2] = ( parseFloat(objstring.substring(2 ,3)) * 7 ) % 10; 
	biz_value[3] = ( parseFloat(objstring.substring(4 ,5)) * 1 ) % 10; 
	biz_value[4] = ( parseFloat(objstring.substring(5 ,6)) * 3 ) % 10; 
	biz_value[5] = ( parseFloat(objstring.substring(7 ,8)) * 7 ) % 10; 
	biz_value[6] = ( parseFloat(objstring.substring(8 ,9)) * 1 ) % 10; 
	biz_value[7] = ( parseFloat(objstring.substring(9,10)) * 3 ) % 10; 
	li_temp = parseFloat(objstring.substring(10,11)) * 5 + "0"; 
	biz_value[8] = parseFloat(li_temp.substring(0,1)) + parseFloat(li_temp.substring(1,2)); 
	biz_value[9] = parseFloat(objstring.substring(11,12)); 
	li_lastid = (10 - ( ( biz_value[0] + biz_value[1] + biz_value[2] + biz_value[3] + biz_value[4] + biz_value[5] + biz_value[6] + biz_value[7] + biz_value[8] ) % 10 ) ) % 10; 
	if (biz_value[9] != li_lastid) { 
	obj1.focus(); 
	obj1.select(); 
	return false; 
	} 
	else 
	return true; 
	} 
	else { 
	obj1.focus(); 
	obj1.select(); 
	return false; 
	} 
} 


function MM_preloadImages() { //v3.0
  var d=document; if(d.images){ if(!d.MM_p) d.MM_p=new Array();
    var i,j=d.MM_p.length,a=MM_preloadImages.arguments; for(i=0; i<a.length; i++)
    if (a[i].indexOf("#")!=0){ d.MM_p[j]=new Image; d.MM_p[j++].src=a[i];}}
}

function MM_swapImgRestore() { //v3.0
  var i,x,a=document.MM_sr; for(i=0;a&&i<a.length&&(x=a[i])&&x.oSrc;i++) x.src=x.oSrc;
}

function MM_findObj(n, d) { //v4.01
  var p,i,x;  if(!d) d=document; if((p=n.indexOf("?"))>0&&parent.frames.length) {
    d=parent.frames[n.substring(p+1)].document; n=n.substring(0,p);}
  if(!(x=d[n])&&d.all) x=d.all[n]; for (i=0;!x&&i<d.forms.length;i++) x=d.forms[i][n];
  for(i=0;!x&&d.layers&&i<d.layers.length;i++) x=MM_findObj(n,d.layers[i].document);
  if(!x && d.getElementById) x=d.getElementById(n); return x;
}

function MM_swapImage() { //v3.0
  var i,j=0,x,a=MM_swapImage.arguments; document.MM_sr=new Array; for(i=0;i<(a.length-2);i+=3)
   if ((x=MM_findObj(a[i]))!=null){document.MM_sr[j++]=x; if(!x.oSrc) x.oSrc=x.src; x.src=a[i+2];}
}

function isNullPoint(obj){
	if(obj == 'null' || obj == ""){
		obj = "-";
	}
	return obj;
}

// 시도MAP 코드,레이어 매핑

function getLayerID(cd){
	
	var retValue;

	if(cd.substring(0,2) == '42')	retValue = 1;	//강원도
	if(cd.substring(0,2) == '43')	retValue = 3;	//충청북도
	if(cd.substring(0,2) == '30')	retValue = 4;	//대전
	if(cd.substring(0,2) == '11')	retValue = 2;	//서울
	if(cd.substring(0,2) == '27')	retValue = 5;	//대구
	if(cd.substring(0,2) == '31')	retValue = 6;	//울산
	if(cd.substring(0,2) == '29')	retValue = 7;	//광주
	if(cd.substring(0,2) == '41')	retValue = 8;	//경기도
	if(cd.substring(0,2) == '44')	retValue = 9;	//충남
	if(cd.substring(0,2) == '50')	retValue = 10;	//제주
	if(cd.substring(0,2) == '45')	retValue = 11;	//전북
	if(cd.substring(0,2) == '46')	retValue = 12;	//전남
	if(cd.substring(0,2) == '28')	retValue = 13;	//인천
	if(cd.substring(0,2) == '26')	retValue = 14;	//부산
	if(cd.substring(0,2) == '47')	retValue = 15;	//경북
	if(cd.substring(0,2) == '48')	retValue = 16;	//경남
	
	retValue = ( 2 + ( (retValue - 1) * 4) ) + 1;
	
	return retValue;
		
	
}

// 시도MAP 코드,레이어 매핑

function getLayerIDByEngName(engName){

	if(engName == 'busan')			return 14;
	if(engName == 'chungbuk')		return 3;
	if(engName == 'chungnam')		return 9;
	if(engName == 'daegu')			return 5;
	if(engName == 'dagjeon')		return 4;
	if(engName == 'gangwon')		return 1;
	if(engName == 'gyeonggi')		return 8;
	if(engName == 'gyeongnam')		return 16;
	if(engName == 'gyungbuk')		return 15;
	if(engName == 'incheon')		return 13;
	if(engName == 'jeju')			return 10;
	if(engName == 'jeonbuk')		return 11;
	if(engName == 'jeonnam')		return 12;
	if(engName == 'kwangju')		return 7;
	if(engName == 'seoul')			return 2;
	if(engName == 'ulsan')			return 6;
}

//맵안내 문구 쿠키이용
function setCookie(name, value) 
{ 
	var todayDate = new Date(); 
	todayDate.setDate( todayDate.getDate() + 365 ); 
	document.cookie = name + "=" + escape( value ) + "; path=/; expires=" + todayDate.toGMTString() + ";" 
} 

//맵안내 문구 쿠키이용
function setCookies(name, value, days) 
{ 
	var todayDate = new Date(); 
	todayDate.setDate( todayDate.getDate() + days ); 
	document.cookie = name + "=" + escape( value ) + "; path=/; expires=" + todayDate.toGMTString() + ";" 
} 

//쿠키 소멸 함수 
function clearCookie(name) { 
    var today = new Date() 
    //어제 날짜를 쿠키 소멸 날짜로 설정한다. 
    var expire_date = new Date(today.getTime() - 60*60*24*1000) 
    document.cookie = name + "= " + "; expires=" + expire_date.toGMTString() 
} 

function getCookieVal(name)
{
	var nameOfCookie = name + "=";
	var x = 0;
	while ( x <= document.cookie.length )
	{
			var y = (x+nameOfCookie.length);
			if ( document.cookie.substring( x, y ) == nameOfCookie ) {
					if ( (endOfCookie=document.cookie.indexOf( ";", y )) == -1 )
							endOfCookie = document.cookie.length;
					return unescape( document.cookie.substring( y, endOfCookie ) );
			}
			x = document.cookie.indexOf( " ", x ) + 1;
			if ( x == 0 )
					break;
	}
	return "";
}

function setCenterLayer(name){
	var xMax = document.body.clientWidth, yMax = document.body.clientHeight;

	var xOffset = (xMax-210)/2, yOffset = (yMax-150)/2+50; 
	//중심에서 오른쪽으로 20, 아래로 40픽셀에 항상 위치하는 레이어
	
	return xOffset+"^"+yOffset;

}

function getByteLength(input) {
    var byteLength = 0;
    for (var inx = 0; inx < input.value.length; inx++) {
        var oneChar = escape(input.value.charAt(inx));
        if ( oneChar.length == 1 ) {
            byteLength ++;
        } else if (oneChar.indexOf("%u") != -1) {
            byteLength += 2;
        } else if (oneChar.indexOf("%") != -1) {
            byteLength += oneChar.length/3;
        }
    }
    return byteLength;
}

//잠시만 기다리세요 만들기~

var ie = document.all;
var moz = document.getElementById && !document.all;
var intr;

function Message_UpdatePos(msg,dy){
 var el = document.getElementById(msg);
	   if(ie){
		el.style.pixelTop = document.body.scrollTop+dy;

	   }
	   else if(moz){
		el.style.top = window.pageYOffset + dy + 'px';


	   }
 }

/** 
 * 메세지 보이기
 * @param dlgId  	dialog id (div id)
 * @param msgId 	dialog main context id
 * @param vis		0, 1 visible
 * @param background dialog bg div id
 * @param message	message div text
 * @param init		dialog init func(상태값 초기화용)
 * @param positive	button positive (option) 
 * @param negative	button negative (option)
 * @param neutral	button neutral  (option)
 */
function Message_Display(dlgId, msgId, vis, background, message, init, positive, negative, neutral){
	var div = document.getElementById(dlgId);
	var len = 0;
	if (background != null) {
		div.background = document.getElementById(background);		
	}
	
	if (init) {
		init.call(this, div);
	}
	
	if (vis) {
		var cxt = document.getElementById(msgId);
		
		var dx = parseInt(document.body.clientWidth/2)+parseInt(cxt.width/2);
		var dy = parseInt(document.body.clientHeight/2)-parseInt(cxt.height/2);
			
		if(ie){
			div.style.pixelTop = document.body.scrollTop + dy;
			div.style.pixelLeft = 300;
		}
		else if(moz){
			div.style.top = window.pageYOffset + dy + 'px';
			div.style.left = window.innerWidth - dx + 'px';
		}
		
		/* set Message */
		if (message != null) {
			var spans = cxt.getElementsByTagName('span');
			len = spans.length;
			for (var i = 0; i < len; i++) {
				var span = spans[i];
				if (span.id === 'message') {
					span.innerText = message;
				}
			}
		}
		
		
		/* reset img button onclick */
		var imgs = div.getElementsByTagName('img');
		len = imgs.length;
		for (var i = 0; i < len; i++) {
			var img = imgs[i];
			if (img.onclickCb) {
				removeHandler(img, 'click', img.onclickCb);				
			}
		}			
		
		/* button positive */
		if (positive != null) {
			for (var i = 0; i < len; i++) {
				var img = imgs[i];
				if (positive.id != null && positive.id === img.id  ) {
					if (positive.title != null ) {
						img.alt = positive.title;
					}
					if (positive.src != null) {
						img.src = positive.src;
					}
					img.onclickCb = function() {
						Message_Display(dlgId, msgId, 0);
						if (positive.func != null) {
							positive.func.call(this, document.getElementById('msg'));							
						}
					};
					addHandler(img, 'click', img.onclickCb);
				}
			}
		}
		/* button negative */
		if (negative != null) {
			for (var i = 0; i < len; i++) {
				var img = imgs[i];
				if (negative.id != null && negative.id === img.id  ) {
					if (negative.title != null ) {
						img.alt = negative.title;
					}
					if (negative.src != null) {
						img.src = negative.src;
					}
					img.onclickCb = function() {
						Message_Display(dlgId, msgId, 0);
						if (negative.func != null) {
							negative.func.call(this, document.getElementById('msg'));							
						}
					};
					addHandler(img, 'click', img.onclickCb);
				}
			}
		}
		/* button neutral */
		if (neutral != null) {
			for (var i = 0; i < len; i++) {
				var img = imgs[i];
				if (neutral.id != null && neutral.id === img.id  ) {
					if (neutral.title != null ) {
						img.alt = neutral.title;
					}
					if (neutral.src != null) {
						img.src = neutral.src;
					}
					img.onclickCb = function() {
						Message_Display(dlgId, msgId, 0);
						if (neutral.func != null) {
							neutral.func.call(this, document.getElementById('msg'));							
						}						
					};
					addHandler(img, 'click', img.onclickCb);
				}
			}
		}
		
		if (div.background) {
			div.background.style.visibility = 'visible';
		}
		div.style.visibility = "visible";
		div.intr = setInterval("Message_UpdatePos('" + dlgId + "', " + dy + ")",1);	
	} else {
		div.style.visibility = "hidden";
		if (div.background) {
			div.background.style.visibility = 'hidden';
		}
		if(div.intr)
			clearInterval(intr);
	}

}
// 메세지 보이기 신형
function MessageDisplay(msg,msgMain,vis){
	var _msg = document.getElementById(msg);
	
	var dx = parseInt(780/2)-parseInt(document.getElementById(msgMain).width/2);
	var dy = parseInt(document.body.clientHeight/2)-parseInt(document.getElementById(msgMain).height/2);
	
	if(ie){
		_msg.style.pixelTop = document.body.scrollTop + dy;
		_msg.style.pixelLeft = dx;
	}
	else if(moz){
		_msg.style.top = window.pageYOffset + dy + 'px';
		_msg.style.left = dx + 'px';
	}


	if(vis){
		_msg.style.display = "block";
		intr = setInterval("Message_UpdatePos('" + msg + "', " + dy + ")",1);
	}else{
		_msg.style.display = "none";
		if(intr)
			clearInterval(intr);
	}
}

function fitImageSize(obj, href, maxWidth, maxHeight) {
	var image = new Image(); 
	image.onload = function(){ 
    	var width = image.width; 
    	var height = image.height; 
    	var scalex = maxWidth / width; 
    	var scaley = maxHeight / height; 
    	var scale = (scalex < scaley) ? scalex : scaley; 
    	if (scale > 1)  
    		scale = 1; 
    	obj.width = scale * width; 
    	obj.height = scale * height; 
    	obj.style.display = ""; 
	};
	
	image.src = href; 
}


/**
 * 년도 생성
 * @param obj
 * @param strYear
 */
function setYear(obj,strYear)
{
    now = new Date();
    Y = now.getFullYear();
    
    if(strYear == '' || strYear == null){
    	strYear = Y;
    }

    for(var i = 0 ; i < 10 ; i++){
        newItem = new Option(i);
        obj.options[i]  = newItem;
        obj.options[i].text = Y+1-i;
        obj.options[i].value = Y+1-i;
        if(strYear == Y+1-i) obj.options[i].selected = true;
    }
}

/**
 * 앞자리에 0 붙이기
 * @param txt
 * @param count
 * @returns {String}
 */ 
function addZero(txt,count){
    var temp = '';
    for(var i = 0; i < count-txt.length;i++){
        temp = '0'+temp;
    }
    return temp+txt;
}

function addSSNDash(txt){
	
	if(txt.indexOf('-') == '-1' && txt.length > 0)
	{
		txt = txt.substring(0,6)+'-'+txt.substring(6,13);
	}
	
	return txt;
}

function changeSelectTag(target,value){
	var obj = document.getElementById(target).options;

	for(var i = 0 ; i < obj.length ; i++){
		if(obj[i].value == value){
			obj[i].selected = true;
		} 
	}
}

function getValueSelectTag(target){
	var obj = document.getElementById(target).options;

	for(var i = 0 ; i < obj.length ; i++){
		if(obj[i].selected == true){
			return obj[i].value;
		} 
	}
}

function addDate(pInterval, pAddVal, pYyyymmdd, pDelimiter)
{
 var yyyy;
 var mm;
 var dd;
 var cDate;
 var oDate;
 var cYear, cMonth, cDay;
 
 if (pDelimiter != "") {
  pYyyymmdd = pYyyymmdd.replace(eval("/\\" + pDelimiter + "/g"), "");
 }
 

 yyyy = pYyyymmdd.substr(0, 4);
 mm  = pYyyymmdd.substr(4, 2);
 dd  = pYyyymmdd.substr(6, 2);
 
 if (pInterval == "yyyy") {
  yyyy = (yyyy * 1) + (pAddVal * 1); 
 } else if (pInterval == "m") {
  mm  = (mm * 1) + (pAddVal * 1);
 } else if (pInterval == "d") {
  dd  = (dd * 1) + (pAddVal * 1);
 }
 

 cDate = new Date(yyyy, mm - 1, dd) // 12월, 31일을 초과하는 입력값에 대해 자동으로 계산된 날짜가 만들어짐.
 cYear = cDate.getFullYear();
 cMonth = cDate.getMonth() + 1;
 cDay = cDate.getDate();
 
 cMonth = cMonth < 10 ? "0" + cMonth : cMonth;
 cDay = cDay < 10 ? "0" + cDay : cDay;

 

 if (pDelimiter != "") {
  return cYear + pDelimiter + cMonth + pDelimiter + cDay;
 } else {
  return cYear + cMonth + cDay;
 }
 
}

function select_innerHTML(objeto,innerHTML){ 

    objeto.innerHTML = "";
    var selTemp = document.createElement("micoxselect");
    var opt;
    selTemp.id="micoxselect1";
    document.body.appendChild(selTemp);
    selTemp = document.getElementById("micoxselect1");
    selTemp.style.display="none";

    if(innerHTML.toLowerCase().indexOf("<option")<0){ 

        innerHTML = "<option>" + innerHTML + "</option>";

    }

    innerHTML = innerHTML.toLowerCase().replace(/<option/g,"<span").replace(/<\/option/g,"</span");
    selTemp.innerHTML = innerHTML;
          
    for(var i=0;i<selTemp.childNodes.length;i++){

      var spantemp = selTemp.childNodes[i];
  
      if(spantemp.tagName){     

           opt = document.createElement("OPTION");
    
           if(document.all){ //IE

            objeto.add(opt);

           }else{

            objeto.appendChild(opt);

           }       
    
       //getting attributes
       for(var j=0; j<spantemp.attributes.length ; j++){

        var attrName = spantemp.attributes[j].nodeName;
        var attrVal = spantemp.attributes[j].nodeValue;

        if(attrVal){

         try{

          opt.setAttribute(attrName,attrVal);
          opt.setAttributeNode(spantemp.attributes[j].cloneNode(true));

         }catch(e){}

        }

       }

       //getting styles
       if(spantemp.style){

        for(var y in spantemp.style){

         try{opt.style[y] = spantemp.style[y];}catch(e){};

        }

       }

       //value and text
       opt.value = spantemp.getAttribute("value");
       opt.text = spantemp.innerHTML;
       //IE
       opt.selected = spantemp.getAttribute('selected');
       opt.className = spantemp.className;

      }
      
    }    

     document.body.removeChild(selTemp);
     selTemp = null;

}

function getUrlParameter() {
	var vars = [], hash;
	if (!location.search) return null;
	var hashes = location.search.slice(location.search.indexOf('?') + 1).split('&');
	for ( var i = 0; i < hashes.length; i++) {
		hash = hashes[i].split('=');
		vars.push(hash[0]);
		vars[hash[0]] = hash[1];
	}
	return vars;
}