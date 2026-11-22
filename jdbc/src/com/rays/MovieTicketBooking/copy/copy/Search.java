package com.rays.MovieTicketBooking.copy.copy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Search {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/movieticketbooking","root","root");
	System.out.println("connection establish successfully");
	Statement stmt = conn.createStatement();
   
	ResultSet rs = stmt.executeQuery("select * from movieticket where MovieName = 'dune'");
	
	while(rs.next()) {
		System.out.print("result:");
		System.out.println(rs.getInt(1) + " " + rs.getString(2) +" "+rs.getString(3) +" "+ rs.getString(4) +" "+ rs.getBoolean(5));
	}

	
	
  } 
}
