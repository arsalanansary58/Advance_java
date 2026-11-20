package com.rays.railway;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Search {
	 public static void main(String[] args) throws ClassNotFoundException, SQLException {
		  Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/railway", "root", "root");
			
			Statement stmt = conn.createStatement();
		          
			ResultSet rs = stmt.executeQuery("select * from reservation where passengerName = 'kashif ansari' ");
			
            while(rs.next()) {
		 
    	 System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " +  rs.getInt(3)+ " " + " " + rs.getString(4) );
     }
 } 
}