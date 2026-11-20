package com.rays.MovieTicketBooking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	  Class.forName("com.mysql.cj.jdbc.Driver");
	   Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/movieticketbooking" , "root", "root");
       System.out.println("connection establish successfully :" + conn.getCatalog());	  
       Statement stmt = conn.createStatement();
	
       stmt.executeUpdate("update MovieTicket set MovieName = 'Dune' where id = 4 ");
 }	
}
