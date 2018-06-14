function keyCheck(eventType, event) {
	if (window.event) {
		event = window.event;
	}
	if (event.keyCode == 123) {
		return false;
	} else if (event.keyCode == 44) {
		window.clipboardData.clearData("Text");
		return false;
	}
}

processKeyUp = function(event) {
	return keyCheck(event);
};

processKeyDown = function(event) {
	return keyCheck(event);
};

document.oncontextmenu = function() {
	return false;
};
document.onkeyup = function() {
	return processKeyUp();
};
document.onkeydown = function() {
	return processKeyDown();
};
document.ondragstart = function() {
	return false;
};
document.onkeyup = function() {
	return processKeyUp();
};
document.ondragend = function() {
	return false;
};
document.onselectstart = function() {
	return false;
};
//alert(1);