package com.rays.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.rays.perparedstatement.UserBean;

/*
 * public class Student {
 * 
 * public void add(UserBean bean) throws SQLException {
 * 
 * Connection conn = null; try {
 * 
 * Class.forName("com.mysql.cj.jdbc.Driver"); conn =
 * DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root",
 * "root"); conn.setAutoCommit(false); PreparedStatement pstmt =
 * conn.prepareStatement("insert into studentid values (? , ? , ? , ? , ?, ?)");
 * 
 * pstmt.setInt(1, bean.getId()); pstmt.setInt(2, bean.getRoll_no());
 * pstmt.setString(3,bean.getName()); pstmt.setInt(4, bean.getPhy());
 * pstmt.setInt(5, bean.getChem()); pstmt.setInt(6, bean.getMaths());
 * 
 * int i = pstmt.executeUpdate();
 * 
 * conn.commit(); System.out.println("record inserted successfully");
 * 
 * } catch (Exception e) { conn.rollback(); e.printStackTrace();
 * 
 * } finally { conn.close(); }
 * 
 * }
 * 
 * public void create() throws SQLException { Connection conn = null;
 * 
 * try { Class.forName("com.mysql.cj.jdbc.Driver");
 * 
 * conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo",
 * "root", "root");
 * 
 * System.out.println("connection establish successfully:" + conn.getCatalog());
 * 
 * PreparedStatement pstmt = conn.prepareStatement(
 * "create table studentid(id int primary key , roll_no int ,name varchar(45), phy int , chem int , maths int)"
 * ); pstmt.executeUpdate(); System.out.println("table created"); } catch
 * (Exception e)
 * 
 * { e.printStackTrace(); } finally { conn.close(); }
 * 
 * }
 * 
 * public void update(UserBean bean) throws SQLException { Connection conn =
 * null;
 * 
 * try {
 * 
 * Class.forName("com.mysql.cj.jdbc.Driver"); conn =
 * DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root",
 * "root"); conn.setAutoCommit(false);
 * 
 * PreparedStatement pstmt = conn.prepareStatement(
 * "update studentid set roll_no = ?, name = ?, phy = ?, chem = ?, maths = ? where id = ?"
 * );
 * 
 * pstmt.setInt(1, bean.getRoll_no()); pstmt.setString(2, bean.getName());
 * pstmt.setInt(3, bean.getPhy()); pstmt.setInt(4, bean.getChem());
 * pstmt.setInt(5, bean.getMaths()); pstmt.setInt(6, bean.getId());
 * 
 * pstmt.executeUpdate(); System.out.println("Record updated successfully");
 * conn.commit();
 * 
 * } catch (Exception e) { conn.rollback(); e.printStackTrace(); } finally {
 * conn.close(); } }
 * 
 * public void delete(UserBean bean) throws SQLException { Connection conn =
 * null; try {
 * 
 * Class.forName("com.mysql.cj.jdbc.Driver"); conn =
 * DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root",
 * "root"); conn.setAutoCommit(false); PreparedStatement pstmt =
 * conn.prepareStatement("delete from studentid where id = ?");
 * pstmt.setInt(1,bean.getId()); pstmt.executeUpdate();
 * System.out.println("Record updated successfully"); conn.commit(); } catch
 * (Exception e) { conn.rollback(); e.printStackTrace(); } finally {
 * conn.close(); }
 * 
 * }
 * 
 * }
 */