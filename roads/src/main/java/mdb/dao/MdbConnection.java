package main.java.mdb.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
  
public class MdbConnection {      
	//String DB_URL = "Jdbc:Odbc:GAPAN";
	//String filename = "/mdb/GAPAN.mdb";
	
	//String filename = "D:/workspace/roads/WebContent/mdb\\GAPAN_160.mdb";
	private String filename; 
		
	public void setFilename(String filename) {
		this.filename = filename;
		System.out.println("-----filename-----");
		System.out.println(this.filename);
	}

    public Connection getConnection() {
    	
    	String DB_URL = "jdbc:odbc:driver={Microsoft Access Driver (*.mdb)};DBQ="+this.filename.trim();
    	String DB_USER = "admin";
    	String DB_PASSWORD = "roadsdb";
    	Connection conn = null;
    	
        try {   
        	
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");   
        } catch (ClassNotFoundException e1) {   
            e1.printStackTrace();   
        }   
           
        try {   
            Properties props = new Properties();   
            props.put("charSet", "8859_1" );    
            props.put("user", DB_USER);   
            props.put("password", DB_PASSWORD);   
            
            System.out.println("----------");
            System.out.println(DB_URL);
            conn = DriverManager.getConnection(DB_URL, props);   
        } catch (SQLException e) {   
            e.printStackTrace();   
        }   
        return conn;   
   }   
}   