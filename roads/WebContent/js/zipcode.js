        function openZipcodePopup_new(post, addr, addr_new, si, gu, doro, bd, emd, bon, bu)
        { 
        	var	post1	= post;
        	var	addr1	= addr;
        	var	addr1_new	= addr_new;
        	var	addr1_si	= si;
        	var	addr1_gu	= gu;
        	var	addr1_doro	= doro;
        	var	addr1_bd	= bd;
        	var	addr1_emd	= emd;
        	
        	var url 	= "/zipCode_New.do?openerPost=" + post1 + "&openerAddr=" + addr1+ "&openerAddrNew=" + addr1_new+ "&openerSi=" + addr1_si+ "&openerGun=" + addr1_gu+ "&openerDoro=" + addr1_doro+"&openerBd=" + addr1_bd +"&openerEmd="+addr1_emd;
        	url += "&openerBon="+bon+"&openerBu="+bu;
        	
        	var winName = "";        	
        	var width 	= 840;
        	var height 	= 305;
        	var scroll 	= "yes";
        	var resize 	= "no";

        	var	option	= "scrollbars=" + scroll + ", ";
        	option	+= "resize=" + resize + ", ";
        	option	+= "width=" + width + ", ";
        	option	+= "height=" + height;

        	window.open(url, winName, option);
        	 
        }

        
        function addrConfirm(ZIP_CL,SI_NM,SGG_NM,EMD_NM,DORO_NM,BON,BU,BD_BON,BD_BU,BD_NM,BD_DET_NM,ADDR1,ADDR2,ADDR1_NEW,FRM){
     		var form 	= document.form; 	
			var aZIP_CL		= document.getElementById(ZIP_CL).value;
			var aSI_NM		= document.getElementById(SI_NM).value;
			var aSGG_NM		= document.getElementById(SGG_NM).value;
			var aEMD_NM		= document.getElementById(EMD_NM).value;
			var aDORO_NM		= document.getElementById(DORO_NM).value;     		     		
			var aBON			= document.getElementById(BON).value;
			var aBU			= document.getElementById(BU).value;
			var aBD_BON		= document.getElementById(BD_BON).value;
			var aBD_BU		= document.getElementById(BD_BU).value;			        	
			var aBD_NM		= document.getElementById(BD_NM).value;
			var aBD_DET_NM	= document.getElementById(BD_DET_NM).value;
			
			var url 	= "/zipCode_jibun.do?ZIP_CL="+aZIP_CL+"&SI_NM="+aSI_NM+"&SGG_NM="+aSGG_NM;
			url +="&EMD_NM="+aEMD_NM+"&BON="+aBON+"&BU="+aBU;
			url +="&DORO_NM="+aDORO_NM+"&BD_BON="+aBD_BON+"&BD_BU="+aBD_BU+"&BD_NM="+aBD_NM;
			url +="&BD_DET_NM="+aBD_DET_NM;
			url +="&oADDR1="+ADDR1+"&oBON="+BON+"&oBU="+BU+"&oADDR2="+ADDR2+"&oADDR1_NEW="+ADDR1_NEW+"&oBD_BON="+BD_BON+"&oBD_BU="+BD_BU+"&oBD_NM="+BD_NM+"&oBD_DET_NM="+BD_DET_NM;
			url +="&oZIP_CL="+ZIP_CL+"&oSI_NM="+SI_NM+"&oSGG_NM="+SGG_NM+"&oDORO_NM="+DORO_NM+"&FRM="+FRM+"&oEMD_NM="+EMD_NM;
			
			var winName = "";        	
        	var width 	= 600;
        	var height 	= 305;
        	var scroll 	= "yes";
        	var resize 	= "no";

        	var	option	= "scrollbars=" + scroll + ", ";
        	option	+= "resize=" + resize + ", ";
        	option	+= "width=" + width + ", ";
        	option	+= "height=" + height;

        	addr2_bdDetNm(ADDR2, BD_DET_NM);
        	window.open(url, winName, option);     		
     	}
     	
	   	 function addr2_bdDetNm(ADDR2, BD_DET_NM){
	   		
	   		var aADDR2 		= document.getElementById(ADDR2).value;
	   		var aBD_DET_NM 	= document.getElementById(BD_DET_NM).value;

			if(aADDR2 =='' && aBD_DET_NM != ''){
				document.getElementById(ADDR2).value = aBD_DET_NM;
			}else if(aADDR2 !=''&& aBD_DET_NM == ''){
				document.getElementById(BD_DET_NM).value = aADDR2;
			}
	   	 }     	