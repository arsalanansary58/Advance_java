package com.rays.bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BankModule {

	public void create() throws SQLException {

		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
			PreparedStatement pstmt = conn.prepareStatement("create table bank (id int primary key , accountno long , holdername varchar(45) , balance double , branch varchar(45))");
			 pstmt.executeUpdate();
			 conn.commit();
			 System.out.println("table created successfully");
			
		} catch (Exception e) {
         e.printStackTrace();
		} finally {
			conn.close();
		}

	} public void insert(BankBean bean) throws SQLException {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
			conn.setAutoCommit(false);
			 PreparedStatement pstmt = conn.prepareStatement("insert into bank values(? , ? , ? , ? , ? )");
		     pstmt.setInt(1 ,bean.getId() ); 
		     pstmt.setLong(2, bean.getAccountno());
             pstmt.setString(3, bean.getHoldername());
 		     pstmt.setDouble(4, bean.getBalance());
		     pstmt.setString(5, bean.getBranch());
			
			pstmt.executeUpdate();
			
			conn.commit();
			System.out.println("Data insert successfully");
		}catch(Exception e) {
			conn.rollback();
			e.printStackTrace();
		} finally {
			conn.close();
		}
	}
	
	public void update(BankBean bean) throws SQLException {
		Connection conn = null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn.setAutoCommit(false);
		PreparedStatement pstmt = conn.prepareStatement("select bank set accountno = ? ,holdername = ? ,balance = ?,branch = ? where id = ?  ");
	    pstmt.setLong(1, bean.getAccountno());
	    pstmt.setString(2, bean.getHoldername());
	    pstmt.setDouble(3,bean.getBalance());
	    pstmt.setString(4, bean.getBranch());
	    pstmt.setInt(4, bean.getId());
	    
		pstmt.executeUpdate();
		
		conn.commit();
		System.out.println("Data update successfully");
	}catch(Exception e){
		conn.rollback();
		e.printStackTrace();
	}finally {
		conn.close();
	      }
       }
         public void delete(BankBean bean) throws SQLException{
        	 
        	 Connection conn = null;
        	 
        	 try {        		
        		 Class.forName("com.mysql.cj.jdbc.Driver");
     			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
     			conn.setAutoCommit(false);
     			PreparedStatement pstmt = conn.prepareStatement("delete from bank where id = ?");
     			pstmt.setInt(1, bean.getId());
     			pstmt.executeUpdate();
             conn.commit();
        	System.out.println("Data delete successfully");
        		 
        	 }catch(Exception e) {
         		 conn.rollback();
         		 e.printStackTrace();
          	 }finally {
        		 conn.close();
        }
         }
        public void Search(BankBean bean) throws SQLException {
        	Connection conn = null;
        	try {
        		 Class.forName("com.mysql.cj.jdbc.Driver");
      			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
        		PreparedStatement pstmt = conn.prepareStatement("select * from bank where id = ?");	
        		pstmt.setInt(1, bean.getId());
        		ResultSet rs = pstmt.executeQuery();
        		 while(rs.next()) {
        			 bean.setAccountno(rs.getLong("accountno"));
        			 bean.setBalance(rs.getDouble("balance"));
        			 bean.setBranch(rs.getString("branch"));
        			 bean.setHoldername(rs.getString("holdername"));
        			 bean.setId(rs.getInt("id"));
        		 }
        		
        		} catch(Exception e) {
        			
        	}finally {
        		conn.close();
        	}
        }





}
