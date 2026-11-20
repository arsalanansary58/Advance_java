package com.rays.patient;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PatientModule {
	public void create() throws SQLException {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
			PreparedStatement pstmt = conn.prepareStatement(
					"create table Patient (id int primary key , name varchar(45) , age int , bloodgroup varchar(45) , disease varchar(45))");
			pstmt.executeUpdate();
			System.out.println("Record updated successfully");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			conn.close();

		}
	}

	public void add(PatientBean bean) throws SQLException {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
			conn.setAutoCommit(false);
			PreparedStatement pstmt = conn.prepareStatement("insert into patient values (? , ? , ? , ? , ?)");

			pstmt.setInt(1,bean.getId());
			pstmt.setString(2, bean.getName());
			pstmt.setInt(3, bean.getAge());
			pstmt.setString(4, bean.getBloodgroup());
			pstmt.setString(5, bean.getDisease());
			pstmt.executeUpdate();

			conn.commit();
			System.out.println("Record add successfully");

		} catch (Exception e) {
			conn.rollback();
			e.printStackTrace();
		} finally {
			conn.close();
		}
	}

	public void update(PatientBean bean) throws SQLException {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
			conn.setAutoCommit(false);
			PreparedStatement pstmt = conn.prepareStatement(
					"update patient set name = ? , age = ? , bloodgroup = ? , disease = ? where id = ? ");

			pstmt.setString(1, bean.getName());
			pstmt.setInt(2, bean.getAge());
			pstmt.setString(3, bean.getBloodgroup());
			pstmt.setString(4, bean.getDisease());
			pstmt.setInt(5, bean.getId());

			pstmt.executeUpdate();
			conn.commit();
			System.out.println("record up successfully");

		} catch (Exception e) {
			conn.rollback();
			e.printStackTrace();
		} finally {
			conn.close();

		}
	}

	public void delete(PatientBean bean) throws SQLException {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
			conn.setAutoCommit(false);
			PreparedStatement pstmt = conn.prepareStatement("delete from patient where id = ?");
			pstmt.setInt(1, bean.getId());
			pstmt.executeUpdate();

			conn.commit();
			System.out.println("record deleted successfully");

		} catch (Exception e) {
			conn.rollback();
			e.printStackTrace();
		} finally {
			conn.close();
		}
	}

	public void search(PatientBean bean) throws SQLException {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
			conn.setAutoCommit(false);
			PreparedStatement pstmt = conn.prepareStatement("select * from patient where id = ?");
			pstmt.setInt(1, bean.getId());
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				bean.setId(rs.getInt("id"));
				bean.setName(rs.getString("name"));
				bean.setAge(rs.getInt("age"));
				bean.setBloodgroup(rs.getString("bloodgroup"));
				bean.setDisease(rs.getString("disease"));

				System.out.println("id:" + bean.getId());
				System.out.println("name:" + bean.getName());
				System.out.println("age:" + bean.getAge());
				System.out.println("bloodgroup:" + bean.getBloodgroup());
				System.out.println("disease:" + bean.getDisease());

			} else {
				System.out.println("rocord not found");
			}
		} catch (Exception e) {
			conn.rollback();
			e.printStackTrace();
		} finally {
			conn.close();
		}
	}
}
