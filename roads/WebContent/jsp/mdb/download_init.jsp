<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="java.io.*"%>

<!--%@ page contentType="application;charset=utf-8" %>-->

<html>
<head>
<script>

var ie = parent.document.all;
var moz = parent.document.getElementById && !parent.document.all;
var intr;

function Message_UpdatePos(msg,dy){
 var el = parent.document.getElementById(msg);
	   if(ie){
		el.style.pixelTop = parent.document.body.scrollTop+dy;

	   }
	   else if(moz){
		el.style.top = window.pageYOffset + dy + 'px';

	   }
 }
function Message_Display(msg,msgMain,vis){
	var _msg = parent.document.getElementById(msg);
	
	var dx = parseInt(parent.document.body.clientWidth/2)+parseInt(parent.document.getElementById(msgMain).width/2);
	var dy = parseInt(parent.document.body.clientHeight/2)-parseInt(parent.document.getElementById(msgMain).height/2);
		
	if(ie){
		_msg.style.pixelTop = parent.document.body.scrollTop + dy;
		_msg.style.pixelLeft = parent.document.body.clientWidth - dx;
	}
	else if(moz){
		_msg.style.top = window.pageYOffset + dy + 'px';
		_msg.style.left = window.innerWidth - dx + 'px';
	}


	if(vis){
		_msg.style.visibility = "visible";
		intr = setInterval("Message_UpdatePos('" + msg + "', " + dy + ")",1);
	}else{
		_msg.style.visibility = "hidden";
		if(intr)
			clearInterval(intr);
	}
}

function init(){

	Message_Display('filedown','FILEDOWNValue',0);
	document.location.href="/jsp/mdb/download.jsp?fileName=${fileName}";
}
</script>
</head>
<body onload="javascript:init();">

${fileName}

</body>
</html>
<%
//	String filename = request.getAttribute("fileName").toString();

	
//	request.setAttribute("fileName",filename);
//	RequestDispatcher dis = request.getRequestDispatcher("download.jsp");
	
//	dis.forward(request,response);
	//response.sendRedirect("download.jsp?fileName="+filename);
%>


