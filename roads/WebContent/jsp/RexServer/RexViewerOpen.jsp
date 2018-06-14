<%@ 
	page contentType="text/html;charset=EUC-KR"
%>
<HTML>
	<HEAD>
		<SCRIPT LANGUAGE='javascript'>
			function fnOpenRex1() {
				var sURL = "http://" + location.host + "/RexServer/RexViewer.jsp?pDataType=XML&pRptName=test&pRptParams="
						+ "&pLinkPage=" + "http://10.60.176.3:8080/rexSA/RexServer.jsp";
				fnOpenRexViewer(sURL);
			}

			function fnOpenRexViewer(sURL) {
				var sFeatures;
				sFeatures = "center=yes,scrollbars=no,status=no,toolbar=no,resizable=0,location=no,menu=no,width=800,height=600";
				window.open(sURL, "rexveriewer", sFeatures);
			}
		</SCRIPT>
	</HEAD>
	<BODY>
		<button onclick="fnOpenRex1();">Å×½ºÆ®</button><BR>
		
	</BODY>
</HTML>
