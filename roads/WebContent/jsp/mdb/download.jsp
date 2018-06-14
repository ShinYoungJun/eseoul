<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="java.io.*"%>

<!--%@ page contentType="application;charset=utf-8" %>-->
<%!
	public String toKor(String str)
	{	
		try
		{
			return new String(str.getBytes("8859_1"),"utf-8");
		}
		catch(Exception e)
		{
			return str;
		}
	}
%><%
out.clear();
request.setCharacterEncoding("utf-8");
String filename =toKor(request.getParameter("fileName"));	

String files = request.getSession().getServletContext().getRealPath("/mdb")+"/"+filename;
File file = new File(files);  
byte b[] = new byte[1024]; 
files = java.net.URLEncoder.encode(files, "UTF-8");
files = files.replace('+', ' '); // for space
response.setHeader("Content-Disposition", "attachment;filename=" + "GAPAN.mdb" + ";");
response.setHeader("Content-Length", ""+file.length() );
if (file.isFile()) { 
	
	BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file)); 
	BufferedOutputStream bos = new BufferedOutputStream(response.getOutputStream());    
	int read = 0; 
	while ((read = bis.read(b)) != -1) 	{ 
		bos.write(b,0,read);		
	} 	

	bos.close(); 
	bis.close(); 
	out.clear();
	out = pageContext.pushBody();
}
%>

