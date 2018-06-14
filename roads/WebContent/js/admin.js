function popUp(url, title, width, height ) {
	var winPosLeft = 'left='+(screen.width - 520) / 2; // x
	var winPosTop = 'top='+(screen.height - 500 - 100) / 2; //  y  
  	//var param = "resizable=no, status=no, scrollbars=no, toolbar=no, menubar=no, "+winPosLeft+","+ winPosTop+", width=580, height=130";
  	var param = "resizable=no, status=no, scrollbars=no, toolbar=no, menubar=no, "+winPosLeft+","+ winPosTop+", width="+width+", height="+height;
  	return window.open(url,title, param);	
}