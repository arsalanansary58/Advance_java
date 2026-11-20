package com.rays.libarymodule;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
	public static void main(String[] args) throws SQLException {
		   Connection conn =  null;
		   
			try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/libarymodule", "root", "root");
			conn.setAutoCommit(false);
			System.out.println("connection establish successfully:" +conn.getCatalog());
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("insert into book values(11, 111, 'The Psychology of Money', 'Morgan Housel', 420, 'Available')");
			stmt.executeUpdate("insert into book values(12, 112, 'Zero to One', 'Peter Thiel', 350, 'Issued')");
			stmt.executeUpdate("insert into book values(13, 113, 'The 5 AM Club', 'Robin Sharma', 400, 'Available')");
			stmt.executeUpdate("insert into book values(13, 114, 'The Monk Who Sold His Ferrari', 'Robin Sharma', 300, 'Available')");
			
		}catch(Exception e) {
			conn.rollback();
		   e.printStackTrace();


		}
			}

}
