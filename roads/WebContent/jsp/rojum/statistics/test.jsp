<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
function TipOn(obj,txt){
	var TipMain = document.getElementById('TipMain');

	TipMain.innerHTML = txt;
	TipMain.style.visibility = 'visible';
	TipMain.style.posLeft = event.x;
	TipMain.style.posTop = event.y-20;

}


function TipDown(){
	var TipMain = document.getElementById('TipMain');
	TipMain.innerHTML = '';
	TipMain.style.visibility = 'hidden';
}







</script>
</head>

<body>
<div id="TipMain" style="border:2px;border-color:yellow;background-color:yellow;position:absolute;visibility:hidden;">

</div>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/><br/>
<br/>
<br/>
<br/><br/>
<br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<img src="D:/workspace/roads/WebContent/img/write_icon.gif" height="10px" width="10px" onmouseover="TipOn(this,'test');" onmouseout="TipDown();" style="cursor:pointer;">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<img src="D:/workspace/roads/WebContent/img/write_icon.gif" height="10px" width="10px" onmouseover="TipOn(this,'test');" onmouseout="TipDown();" style="cursor:pointer;">
</body>
</html>