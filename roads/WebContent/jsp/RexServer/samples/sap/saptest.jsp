<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.lang.*,com.sap.mw.jco.*, java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>

<%
	//out.println("33333--");
	
	String pjt_cd = "IN";
	JCO.Client mConnection = null;

	// Connecting to SAP R/3 System
	
	//System.out.println("start--");
	
    try {
        mConnection =
        JCO.createClient("100",                 // SAP client
                         "bmt01",            // userid
                         "init00",            // password
                         "ko",                  // language
                         "172.16.1.12",             // host name
                         "00"                 // system number
                         ,"");                 // group
        mConnection.connect();

        out.println("success!!");
	}
    catch (JCO.Exception ex) {
            ex.printStackTrace();
			out.println(ex.toString());
    }
%>
</head>
<body>
   

</body>
</html>