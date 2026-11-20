package com.rays.libarymodule;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
public static void main(String[] args) throws SQLException {
   Connection conn =  null;
   
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/libarymodule", "root", "root");
	System.out.println("connection establish successfully:" +conn.getCatalog());
	Statement stmt = conn.createStatement();
    stmt.executeUpdate("create table book (id int primary key , bookid int , title varchar(45) , author varchar(45) , price double , availability varchar(45))");      	
	
	
	
}catch(Exception e) {
   e.printStackTrace();

}
 
	
	
	
  }	
}
