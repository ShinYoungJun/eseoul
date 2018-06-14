      //********** BEGIN_현진_20120312
		function changeGuCd(obj){		

	    	var guCd = getSelectedValue(obj);	    	
	        var	param	= "guCd="+guCd;
	        	        
	        sendRequest("/rojum/survey/getSectionCode.do", param, "GET", ResultChangeGuCd);
	    	
	    	
	    }
	
	    function	ResultChangeGuCd(obj)
	    {
	    	select_innerHTML(document.getElementById("GUGAN_CD"),obj);
	    }

	    function	regnameCreate()
	    {
	    	var w = document.form;
	    	var GU_CD = document.getElementById("GU_CD").value;
	    	var GUGAN_CD = document.getElementById("GUGAN_CD").value;
	    	var SURVEY_YEAR = document.getElementById("SURVEY_YEAR").value;	
	    	
			if(GU_CD=="000"){
				alert("시군구명을 선택해주세요.");
				w.GU_CD.focus();
				return;
			}
			if(GUGAN_CD==""){
				alert("구간을 선택해주세요.");
				w.GUGAN_CD.focus();
				return;
			}
		    	    
		    var	param	= "GU_CD="+GU_CD+"&SURVEY_YEAR="+SURVEY_YEAR+"&GUGAN_CD="+GUGAN_CD;
		    
		    sendRequest("/rojum/survey/getSectionRegName.do", param, "GET", ResultRegName);
	    }

	    function	ResultRegName(obj)
	    {   
	    	var array_data = obj.split("/"); 
	    	
	    	document.getElementById("REG_SEQ").value = array_data[0];
	    	document.getElementById("REG_NAME").value = array_data[1];
	    }


      //********** END_현진_20120312
