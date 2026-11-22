package com.rays.collablestatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestCollableStatement {
public static void main(String[] args) throws Exception {
	
	
   Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
	CallableStatement cbst = conn.prepareCall("{call searchBid(?)}");
	
	
	
	
	
  }
}
