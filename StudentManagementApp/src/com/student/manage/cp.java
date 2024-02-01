package com.student.manage;
import java.sql.Connection;
import java.sql.DriverManager;

public class cp {
	
	static Connection con;
	public static Connection createC() {
		
		try {
			//load the driver
			Class.forName("com.mysql.jdbc.Driver");
			
			// create connection.....
			String user = "root";
			String password = "root123";
			String url = "jdbc:mysql://localhost:3306/students";
			con = DriverManager.getConnection(url, user, password);
	}
		
		
		
		
		
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;
}}
