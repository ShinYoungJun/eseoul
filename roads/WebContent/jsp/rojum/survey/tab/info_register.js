/**********************************************************************************************************************************/
	function 	openZipcodePopup(post, addr)
	{
		var	post1	= post;
		var	addr1	= addr;

		var url 	= "/zipcode.do?openerPost=" + post1 + "&openerAddr=" + addr1;
		var winName = "�����ȣ�Է�";
		var width 	= 420;
		var height 	= 305;
		var scroll 	= "yes";
		var resize 	= "no";

		var	option	= "scrollbars=" + scroll + ", ";
		option	+= "resize=" + resize + ", ";
		option	+= "width=" + width + ", ";
		option	+= "height=" + height;

		window.open(url, winName, option);
	}

	function	Init()
	{
		parent.iFrameResizeTab("tab1"); 
	}
	
/////////////////////////////////////////////////////////////////////////////////�ű� �ʿ��� ��鸸 ///////////////////////////////////////////////////////////////////////////////////
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
             preViewer.style.filter = "progid:DXImageTransform.Microsoft.AlphaImageLoader(src='" + img_path + "', sizingMethod='scale')";
         } else {
             preViewer.innerHTML = "";
             var W = preViewer.offsetWidth;
             var H = preViewer.offsetHeight;
             var tmpImage = document.createElement("img");
             preViewer.appendChild(tmpImage);

             tmpImage.onerror = function () {
                 return preViewer.innerHTML = "";
             }

             tmpImage.onload = function () {

                 if (this.width > W) {
                     this.height = this.height / (this.width / W);
                     this.width = W;
                 }
                 if (this.height > H) {
                     this.width = this.width / (this.height / H);
                     this.height = H;
                 }
             }
             if (ua.indexOf("Firefox/3") > -1) {
                 var picData = thisObj.files.item(0).getAsDataURL();
                 tmpImage.src = picData;
             } else {
                 tmpImage.src = "file://" + thisObj.value;
             }
         }
     }

     function	Jumin_toaddr_Check()
 	{
 		var form 	= document.form;
 		var	chk1		= form.ADDR_CHECK1.checked;

 		if(chk1	== true)
 		{
 			form.OWNER_TOPOST.value		= form.OWNER_POST.value;
 			form.OWNER_TOADDR1.value	= form.OWNER_ADDR1.value;
 			form.OWNER_TOADDR2.value	= form.OWNER_ADDR2.value;
 			//form.TOADDR1_NEW.value		= form.ADDR1_NEW.value;
 			//form.TOADDR2_NEW.value		= form.ADDR2_NEW.value;
 			
 			//form.TOADDR1_NEW.value		= form.ADDR2_NEW.value; 
 			if(form.OWNER_SAN.checked == true){
 				form.OWNER_SAN.value = "1";
 				form.OWNER_TOSAN.checked = true;
 				form.OWNER_TOSAN.value = "1";
 			}else{
 				form.OWNER_SAN.value = "0";
 				form.OWNER_TOSAN.checked = false;
 				form.OWNER_TOSAN.value = "0";
 			}
 			form.OWNER_TOBONBUN.value	= form.OWNER_BONBUN.value;
 			form.OWNER_TOBUBUN.value	= form.OWNER_BUBUN.value;
 			
 			
 			
 			//form.TOBD_BON.value	= form.BD_BON.value;
 			//form.TOBD_BU.value	= form.BD_BU.value;
 			
 			
 		 	//********** BEGIN_20120305
 			form.TOSI.value             	= form.SI.value
 			form.TOGUN.value            	= form.GUN.value
 			form.TODORO_NM.value        	= form.DORO_NM.value
 			form.TOEMD_NM.value       		= form.EMD_NM.value
 			form.TOADDR1.value            	= form.ADDR1.value
 			form.TOBD_BON.value           	= form.BD_BON.value
 			form.TOBD_BU.value            	= form.BD_BU.value
 			form.TOBD_NM.value              = form.BD_NM.value
 			form.TOBD_DET_NM.value          = form.BD_DET_NM.value
 			//********** END_20120305	
 			
 			
 			
 			
 			form.ADDR_CHECK1.value = "1";
 		}
 		else
 		{
 			form.ADDR_CHECK1.value = "0";
 		}

 	}
 
 // getElementsByClassName
	function getElementsByClassName(clsName,parentNode) {
		var arr = new Array();
		var elems;
		
		if (parentNode == null) {
			elems = document.getElementsByTagName("*");
		} else {
			elems = parentNode.getElementsByTagName("*");
		}
		for ( var cls, i = 0; ( elem = elems[i] ); i++ ) {
			if ( elem.className == clsName ) {
				arr[arr.length] = elem;
			}
		}
		return arr;
	}
	
	function tabDisplay(tab,content,num,type) {
		for (var i=0; i<content.length; i++) {
			var tab_off = tab[i].childNodes[0].getAttribute('src').replace(/_on|_off|_chk/i,'_off');
			var tab_on = tab[num].getElementsByTagName('img')[0].getAttribute('src').replace(/_on|_off|_chk/i,'_off');
			var tab_chk = tab[num].getElementsByTagName('img')[0].getAttribute('src').replace(/_on|_off|_chk/i,'_on');
			tab[i].getElementsByTagName('img')[0].setAttribute('src',tab_off);
			tab[num].getElementsByTagName('img')[0].setAttribute('src',tab_chk);
			content[i].style.display = 'none';
			content[num].style.display = 'block';

			parent.iFrameResizeTab("tab1");	// ȭ�� RESIZE
		}

//		document.getElementById('NOWTAB').value	= num;
		return true;
	}
	
	function tabAct(tab,content,num,type) {
		tab[num].onclick = function() {
			tabDisplay(tab,content,num);
			return false;
		}
		if (type == true) {
			var tabimg = tab[num].getElementsByTagName('img')[0];
			var tab_off = tabimg.getAttribute('src').replace(/_on|_off|_chk/i,'_on');
			var tab_on = tabimg.getAttribute('src').replace(/_on|_off|_chk/i,'_off');
			tab[num].onmouseover = function() {
				if (tabimg.getAttribute('src').indexOf('_on') == -1) {
					tabimg.setAttribute('src',tab_on);
				}
			}
			tab[num].onmouseout = function() {
				if (tabimg.getAttribute('src').indexOf('_on') != -1) {
					tabimg.setAttribute('src',tab_off);
				}
			}
		}
	}
	
	window.onload = tabMenu;
	function tabMenu() {
		
		setYear(document.getElementById('SURVEY_YEAR'),'');
		Jumin_toaddr_Check();
		
		var tabs = document.getElementById('tabmenu');
		var tab = tabs.getElementsByTagName('a'); // �� ���
		var contents = document.getElementById('tabcontents');
		var content = getElementsByClassName('tabcontent',contents); // ������ ��� class
		var type = true; // �ѿ����� true / false
		for (var i=0; i<tab.length; i++) {
			tabDisplay(tab,content,0,true);
			tabAct(tab,content,i,type);
		}
	}
	
	function Jumji_CalPlaceSize()
	{
		var ret = parseFloat(form.PLACE_L.value) * parseFloat(form.PLACE_H.value);
		form.PLACE_A.value = Math.round( ret* Math.pow(10,parseInt(3,10)) ) / Math.pow(10,parseInt(3,10));

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
    
    function check_special_st(){
    	var specialSt = document.getElementsByName("SPECIAL_ST");
    	if(specialSt[0].checked){
    		document.getElementById("SPECIAL_DATE_SPAN").style.display = "none";
    		document.getElementById("SPECIAL_DATE").value = "";
    	}else{
    		document.getElementById("SPECIAL_DATE_SPAN").style.display = "inline-block";
    	}
    	
    }
    
	function	DataCheckRegister()
	{

		var form 	= document.form;
		var	str		= "";
		
		var tabs = document.getElementById('tabmenu');
		var tab = tabs.getElementsByTagName('a'); // �� ���
		var contents = document.getElementById('tabcontents');
		var content = getElementsByClassName('tabcontent',contents); // ������ ��� class
		
		if(form.FOUND_DATE.value.length	< 1)
        {
        	str	+= "��ġ���ڸ� ���� �ϼ���\n";
            alert(str);
            tabDisplay(tab,content,0);
            form.FOUND_DATE.focus();
        }
		else if(form.BJ_CD.value.length	< 1)
		{
			str	+= "������ �������� ���� �ϼ���\n";
			alert(str);
			tabDisplay(tab,content,0);
			form.BJ_CD.focus();
		}
		else if(form.HJ_CD.value.length	< 1)
		{
			str	+= "������ �������� ���� �ϼ���\n";
			alert(str);
			tabDisplay(tab,content,0);
			form.HJ_CD.focus();
		}
		else if(form.SPC_CD.value.length	< 1)
		{
			str	+= "������ ���������� ���� �ϼ���\n";
			alert(str);
			tabDisplay(tab,content,0);
			form.SPC_CD.focus();
		}
		else if(form.BONBUN.value.length	< 1)
		{
			str	+= "������ ������ �Է� �ϼ���\n";
			alert(str);
			tabDisplay(tab,content,0);
			form.BONBUN.focus();
		}/*
		else if(form.X_COORD.value.length	< 1)
		{
			str	+= "������ ��ġ����� ���ּ���\n";
			alert(str);
			tabDisplay(tab,content,0);
			form.LocReg.focus();
		}
		else if(form.Y_COORD.value.length	< 1)
		{
			str	+= "������ ��ġ����� ���ּ���\n";
			alert(str);
			tabDisplay(tab,content,0);
			form.LocReg.focus();
		}*/
		else if(form.PLACE_L.value.length	< 1)
		{
			str	+= "������� ���θ� �Է��ϼ���\n";
			alert(str);
			tabDisplay(tab,content,0);
			form.PLACE_L.focus();
		}
		else if(form.PLACE_H.value.length	< 1)
		{
			str	+= "������� ���θ� �Է��ϼ���\n";
			alert(str);
			tabDisplay(tab,content,0);
			form.PLACE_H.focus();
		}
		else if(form.FT_TYP.value.length	< 1)
		{
			str	+= "�ü� ������ �����ϼ���\n";
			alert(str);
			tabDisplay(tab,content,0);
			form.FT_TYP.focus();
		}
		else if(form.FT_SEL.value.length	< 1)
		{
			str	+= "�ü� �԰��� �����ϼ���\n";
			alert(str);
			tabDisplay(tab,content,0);
			form.FT_SEL.focus();
		}
		else if(form.FT_TYP.value == '021' && form.FT_CAT.value.length	< 1)
		{
			str	+= "�ü� ������ �����ϼ���\n";
			alert(str);
			tabDisplay(tab,content,0);
			form.FT_CAT.focus();
		}
		else if(document.getElementsByName("SPECIAL_ST")[1].checked && form.SPECIAL_DATE.value.length	< 1)
		{
			str	+= "Ưȭ�Ÿ� �������ڸ� �Է��ϼ���\n";
			alert(str);
			tabDisplay(tab,content,0);
			form.SPECIAL_DATE.focus();
		}
		else if(form.OWNER_NAME.value.length	< 1)
		{
			str	+= "��ڸ��� �Է��ϼ���\n";
			alert(str);
			tabDisplay(tab,content,1);
			form.OWNER_NAME.focus();
		}
		else if(form.OWNER_SSN1.value.length	< 1)
		{
			str	+= "��� �ֹε�Ϲ�ȣ�� �Է��ϼ���\n";
			alert(str);
			tabDisplay(tab,content,1);
			form.OWNER_SSN1.focus();
		}
		else if(form.OWNER_SSN2.value.length	< 1)
		{
			str	+= "��� �ֹε�Ϲ�ȣ�� �Է��ϼ���\n";
			alert(str);
			tabDisplay(tab,content,1);
			form.OWNER_SSN2.focus();
		}
		 
		
	
		if(str	== "")
		{
			return	true;
		}
		
		return	false;
	}
    
    
    
    
	
	