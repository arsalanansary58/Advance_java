package com.rays.StudentModule;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
public static void main(String[] args) throws SQLException {
	  
  Connection conn = null;
  try {
  Class.forName("com.mysql.cj.jdbc.Driver");
  conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentModule" , "root", "root");
  conn.setAutoCommit(false);
	System.out.println("connection establish successfully:" +conn.getCatalog());
	Statement stmt = conn.createStatement();
 	
	 int i= stmt.executeUpdate("update student set id = 5  where id = 2");
	 System.out.println(i);
		
		  stmt.executeUpdate("update student set id = 13 where id = 5");
		  
		
	 conn.commit();

     }
      catch(Exception e) {
	  conn.rollback();
	  e.printStackTrace();
  }
	
  } 
}
