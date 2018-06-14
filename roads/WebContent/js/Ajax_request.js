//	2009		Kim Yun Seo

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
		req.setRequestHeader("Content-Type","application/x-www-form-urlencoded;charset=UTF-8");
		req.send(params);
	}
}

function onReadyStateChange()
{
	var ready = req.readyState;
	var data = null;
	if(ready == 4){
		if(this.call	!= null)
			this.call(req.responseText);
	}
}