package com.rays.hotel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MobileModule {

	public void create() throws SQLException {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
			PreparedStatement pstmt = conn.prepareStatement(
			"create table mobile (id int primary key , brand varchar(45), model varchar(45), battery int , operatingsystem varchar(45))");
			pstmt.executeUpdate();
			System.out.println("Record updated successfully");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			conn.close();

		}
	}

	public void add(int id, String brand, String model, int battery, String operatingsystem) throws SQLException {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
			conn.setAutoCommit(false);
			PreparedStatement pstmt = conn.prepareStatement("insert into mobile values(? , ? , ? , ? ,?)");

			pstmt.setInt(1, id);
			pstmt.setString(2, brand);
			pstmt.setString(3, model);
			pstmt.setInt(4, battery);
			pstmt.setString(5, operatingsystem);

			pstmt.executeUpdate();
			conn.commit();
			System.out.println("data insert successfully");

		} catch (Exception e) {
			conn.rollback();
			e.printStackTrace();
		} finally {
			conn.close();
		}
	}

	public void update(int id, String brand, String model, int battery, String operatingsystem) throws SQLException {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
			conn.setAutoCommit(false);
			PreparedStatement pstmt = conn.prepareStatement(
					"update mobile set brand = ? , model = ? , battery = ? , operatingsystem = ? where id = ?");
			pstmt.setString(1, brand);
			pstmt.setString(2, model);
			pstmt.setInt(3, battery);
			pstmt.setString(4, operatingsystem);
			pstmt.setInt(5, id);
			pstmt.executeUpdate();
			conn.commit();
			System.out.println("updated");

			System.out.println("table update successfully");
		} catch (Exception e) {
			conn.rollback();
			e.printStackTrace();
		} finally {
			conn.close();
		}
	}

	public void delete(int id) throws SQLException {
		Connection conn = null;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
			conn.setAutoCommit(false);
			PreparedStatement pstmt = conn.prepareStatement("delete from mobile where id = ?");
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
			System.out.println("table delete");
			conn.commit();

		} catch (Exception e) {
			conn.rollback();
			e.printStackTrace();
		} 	finally {
			conn.close();

		}

	}

}
