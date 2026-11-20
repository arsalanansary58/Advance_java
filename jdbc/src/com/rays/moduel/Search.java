package com.rays.moduel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Search {
	 public static void main(String[] args) throws ClassNotFoundException, SQLException {
		  Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/moduel", "root", "root");
			
			Statement stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery("select * from atmsystemi where location = 'tokiyo'");
				
            while(rs.next()) {
		 
    	 System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " +  rs.getString(3)+ " " + " " + rs.getDouble(4) + " "  + rs.getString(5) );
      }
   } 
}