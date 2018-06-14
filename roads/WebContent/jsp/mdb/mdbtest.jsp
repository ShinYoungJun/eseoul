<%@ page import="java.sql.*" %>


<%
	String DB_URL = "Jdbc:Odbc:GAPAN";
	String DB_USER = "gapan";
	String DB_PASSWORD = "1234";
	
	Connection conn;
	Statement stmt;
	String query = "create table phonebook(aaa varchar2(10), bbb varchar2(20))";
	//String query = "drop table phonebook";
	
	try{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		
		conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
		
		stmt = conn.createStatement();
		
		stmt.executeUpdate(query);
		
		conn.commit();
		out.println("table created!!");
		stmt.close();
		conn.close();
	}catch(Exception e){e.printStackTrace();
	out.println("ex process");
	}

%>
