package com.rays.MovieTicketBooking.copy.copy;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
	
		  public static void main(String[] args) throws ClassNotFoundException, SQLException {
			  Class.forName("com.mysql.cj.jdbc.Driver");
				
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/movieticketbooking" , "root", "root");
				System.out.println("connection establish successfully:" +conn.getCatalog());
				Statement stmt = conn.createStatement();
	          stmt.executeUpdate("INSERT INTO MovieTicket VALUES\r\n"
	          		+ "(1, 'Avengers', 'A12', '10:00 AM', 250),\r\n"
	          		+ "(2, 'Inception', 'B05', '12:30 PM', 300),\r\n"
	          		+ "(3, 'Interstellar', 'C10', '3:00 PM', 350),\r\n"
	          		+ "(4, 'Titanic', 'D08', '6:00 PM', 200),\r\n"
	          		+ "(5, 'Joker', 'A15', '9:00 PM', 280),\r\n"
	          		+ "(6, 'Batman', 'B12', '11:00 AM', 320),\r\n"
	          		+ "(7, 'Avatar', 'C05', '2:00 PM', 400),\r\n"
	          		+ "(8, 'Spider-Man', 'D10', '5:30 PM', 300),\r\n"
	          		+ "(9, 'Iron Man', 'E04', '7:00 PM', 250),\r\n"
	          		+ "(10, 'Frozen', 'F06', '8:30 PM', 220); ");
				
  }
}