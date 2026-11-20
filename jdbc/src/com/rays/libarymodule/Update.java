package com.rays.libarymodule;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
	public static void main(String[] args) throws SQLException {
		   Connection conn =  null;
		   
			try {  
				 
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/libarymodule", "root", "root");
			conn.setAutoCommit(false);
			System.out.println("connection establish successfully:" +conn.getCatalog());
			Statement stmt = conn.createStatement();
		   stmt.executeUpdate("update book set id = 1 where id = 0");
		   stmt.executeUpdate("update book set id = 2 where id = 1 ");
		   stmt.executeUpdate("update book set id = 3 where id = 2");
		   stmt.executeUpdate("update book set id = 3 where id = 2");
			
			
		}catch(Exception e) {
			conn.rollback();
		   e.printStackTrace();


		}
	}
}