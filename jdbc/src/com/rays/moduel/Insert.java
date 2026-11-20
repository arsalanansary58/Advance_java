package com.rays.moduel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
	 public static void main(String[] args) throws ClassNotFoundException, SQLException {
		  Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/moduel" , "root", "root");
			System.out.println("connection establish successfully:" +conn.getCatalog());
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("update atmsystemi set location = 'tokiyo' where id = 1");

	 
	 
	 
	 }
}
