<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script language="javascript" src="/js/jquery-1.6.1.js"></script>
<script type="text/javascript">

	function getXml() {
		//var tbName = "LP_PA_CBND_ALL";
		//var column = "JIBUN";
		//var attribute = "polygon";

		xmlRequest();
	}


	function xmlRequest(){
		
		$.ajax({ 
			type: "GET",
			//url: "http://98.33.0.62:1521/IntraMap/MapService?=WFS&VERSION=1.0.0",
			url: "http://98.33.1.87:8080/IntraMap/MapService?SERVICE=WFS&VERSION=1.0.0&REQUEST=GetFeature&TYPENAME=LP_PA_CBND_ALL&PROPERTYNAME=XID&FILTER=<ogc:Filter><ogc:PropertyIsEqualTo><ogc:PropertyName>XID</ogc:PropertyName><ogc:Literal>137</ogc:Literal></ogc:PropertyIsEqualTo></ogc:Filter>",
			//crossDomain: true, 
			data: "data",
			
			cache: false,
			contentType: "application/x-www-form-urlencoded; charset=utf-8",
			dataType: "xml",
			//error: function(xhr) {
			error: function(request, status, error) {
				console.log("code: "+request.status+"\n"+"message: "+request.responseText+"\n"+"error: "+error);
			},
			success: function(xml){
				console.log("xml");
				console.log(xml);
			} 
		});
	}
 
</script>

<body>
	<h5>지번 가져오기</h5>
	<input type="button" value="getXml" onclick="getXml();">
</body>
</html>