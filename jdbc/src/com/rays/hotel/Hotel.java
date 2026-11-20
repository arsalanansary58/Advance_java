package com.rays.hotel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Hotel {

	public void Create(HotelBean bean) throws SQLException {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
			PreparedStatement pstmt = conn.prepareStatement(
					"create table room (RoomNo int primary key , RoomType varchar(45) , Floor int , PricePerNight double , Availability boolean )");
			pstmt.executeUpdate();
			System.out.println("Table created successfully");

		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			conn.close();
		}

	}

	public void insert(HotelBean bean) throws SQLException {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
			conn.setAutoCommit(false);
			PreparedStatement pstmt = conn.prepareStatement("insert into room values(?,?,?,?,?)");
			pstmt.setInt(1, bean.getRoomNo());
			pstmt.setString(2, bean.getRoomType());
			pstmt.setInt(3, bean.getFloor());
			pstmt.setDouble(4, bean.getPricePerNight());
			pstmt.setBoolean(5, bean.isAvaliability());
			pstmt.executeUpdate();

			System.out.println("data intered successfully");

			conn.commit();

		} catch (Exception e) {
			conn.rollback();
			e.printStackTrace();
		} finally {
			conn.close();
		}
	}

	public void update(HotelBean bean) throws SQLException {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
			conn.setAutoCommit(false);
			PreparedStatement pstmt = conn.prepareStatement(
					"update room set RoomType = ? ,Floor = ? , PricePerNight = ? ,Availability = ? where RoomNo = ?");

			pstmt.setString(1, bean.getRoomType());
			pstmt.setInt(2, bean.getFloor());
			pstmt.setDouble(3, bean.getPricePerNight());
			pstmt.setBoolean(4, bean.isAvaliability());
			pstmt.setInt(5, bean.getRoomNo());
			pstmt.executeUpdate();
			conn.commit();
			System.out.println("Data update successfully");

		} catch (Exception e) {
			conn.rollback();
			e.printStackTrace();
		} finally {
			conn.close();
		}

	}

	public void delete(HotelBean bean) throws SQLException {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
			conn.setAutoCommit(false);
			PreparedStatement pstmt = conn.prepareStatement("delete from room where RoomNo = ?");
			pstmt.setInt(1, bean.getRoomNo());
			pstmt.executeUpdate();
			System.out.println("Data delete successfully");
			conn.commit();

		} catch (Exception e) {
			conn.rollback();
			e.printStackTrace();
		} finally {
			conn.isClosed();
	  }
	}
 }    

