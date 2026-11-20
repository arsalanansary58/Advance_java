package com.rays.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Testconnector {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	

	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student" , "root", "root");
	System.out.println("connection establish successfully:" +conn.getCatalog());
	Statement stmt = conn.createStatement();
	
	int i = stmt.executeUpdate(
		    "insert into number values(21,'khan',885,99,99,99)"
		);
  }	
}
