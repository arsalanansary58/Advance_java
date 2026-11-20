package com.rays.StudentModule;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
     Connection conn = null;
     try {
		  Class.forName("com.mysql.cj.jdbc.Driver"); 
			 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentModule" , "root", "root");
			conn.setAutoCommit(false);
			System.out.println("connection establish successfully:" +conn.getCatalog());
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("insert into student values(10 , 109 ,'rohit' ,'kashi@gmail,com' , 25 , 'c++' )");
			
			stmt.executeUpdate("insert into student values(12 , 110, 'sahu' ,'jadx@gmail,com' , 28 , 'c')");
			
			stmt.executeUpdate("insert into student values(13 , 111,'rahi' ,'sir@gmail,com' , 27 , 'java' )");
			
			stmt.executeUpdate("insert into student values(13 ,  112 ,'siri ','saci@gmail,com' , 26 , 'python')");

			conn.commit(); 
			
     } catch(Exception e){
     conn.rollback();
     e.printStackTrace();
     }
  }
}