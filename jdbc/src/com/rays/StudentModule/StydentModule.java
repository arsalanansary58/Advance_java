package com.rays.StudentModule;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StydentModule {
public static void main(String[] args) throws ClassNotFoundException, SQLException {

  Class.forName("com.mysql.cj.jdbc.Driver"); 
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentModule" , "root", "root");
	System.out.println("connection establish successfully:" +conn.getCatalog());
	Statement stmt = conn.createStatement();
	
	int i=stmt.executeUpdate("create table Student(id int primary key , studentid int , name varchar(45) , email varchar(45) , age int , course varchar(45))");
System.out.println(i);
	
	
	
	
	
	
	
	
 }
}
