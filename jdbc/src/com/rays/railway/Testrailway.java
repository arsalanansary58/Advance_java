package com.rays.railway;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Testrailway {

	 public static void main(String[] args) throws ClassNotFoundException, SQLException {
		  Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/railway", "root", "root");
			System.out.println("connection establish successfully:" +conn.getCatalog());
			Statement stmt = conn.createStatement();
		          
			   stmt.executeUpdate(
		                "INSERT INTO reservation VALUES " +
		                "(1, 'Rahul Sharma', 12, '2026-11-01')," +
		                "(2, 'Aman Khan', 15, '2026-11-02')," +
		                "(3, 'Priya Singh', 18, '2026-11-03')," +
		                "(4, 'Arjun Verma', 20, '2026-11-04')," +
		                "(5, 'Neha Patel', 25, '2026-11-05')," +
		                "(6, 'Rohit Gupta', 30, '2026-11-06')," +
		                "(7, 'Anjali Jain', 35, '2026-11-07')," +
		                "(8, 'Vikas Yadav', 40, '2026-11-08')," +
		                "(9, 'Sneha Mehta', 45, '2026-11-09')," +
		                "(10, 'Karan Khan', 50, '2026-11-10')");
		             
	 } 
	 
}
