<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ 
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	import javax.servlet.http.HttpSession;
	
	HttpSession session = request.getSession();
%>        
<%
	String PNU = (String)session.getAttribute("PNU");	
	String Addr = (String)session.getAttribute("ADDR");	
%>