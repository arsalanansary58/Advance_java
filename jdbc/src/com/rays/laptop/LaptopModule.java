package com.rays.laptop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LaptopModule {

	public void create(LaptopBean bean) throws SQLException {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306//demo","root","root");
			PreparedStatement pstmt = conn.prepareStatement("create ");
			
			
			
		}catch(Exception e) {
			
		}finally {
			conn.close();
		}
	}
	
	
	
}
