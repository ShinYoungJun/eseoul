	function selectAll(obj){
		
		var select_all = obj.document.getElementById("SELECT_ALL").checked;
		var select_item = obj.document.getElementsByName("SELECT_ITEM");
		

		for(var i = 0;i<select_item.length;i++){
			select_item[i].checked = select_all;
		}
		
	}
	
    function scrollAll() {
  	  document.all.leftDisplay2.scrollTop = document.all.mainDisplay2.scrollTop;
  	  document.all.topLine2.scrollLeft = document.all.mainDisplay2.scrollLeft;
    }
    
    function scrollColumn() {
    	  document.all.topLine2.scrollLeft = document.all.mainDisplay2.scrollLeft;
      }
    
    function selectRow(idx){
    	var select_item = document.getElementsByName("SELECT_ITEM");
    	select_item[idx-1].checked = !select_item[idx-1].checked;
    }
    
    
    function selectRowOne(idx){
    	var select_item = document.getElementsByName("SELECT_ITEM");
    	for(var i = 0; i < select_item.length ; i++){
    		select_item[i].checked = false;
    	}
    	
    	select_item[idx-1].checked = !select_item[idx-1].checked;
    	
    	
    	
    }