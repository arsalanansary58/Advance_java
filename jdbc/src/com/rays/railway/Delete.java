package com.rays.railway;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
	 public static void main(String[] args) throws ClassNotFoundException, SQLException {
		  Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/railway", "root", "root");
			System.out.println("connection establish successfully:" +conn.getCatalog());
			Statement stmt = conn.createStatement();
		          
			stmt.executeUpdate("delete from reservation where id = 9");
 }
}