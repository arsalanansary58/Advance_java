package com.rays.PreparedStatement;

import java.sql.SQLException;

public class TestMobile {
	public static void main(String[] args) throws SQLException {
	
		//testmobile();
	    //  testadd();
		//testupdate();
	   //  testdelete();
	     
	  }

	private static void testdelete() throws SQLException {
		  MobileModule m = new MobileModule();
		  m.delete(10);
	}

	private static void testupdate() throws SQLException{
          MobileModule m = new MobileModule();
       m.update(5, "samsung", "Galaxy", 8000, "ios");
	}

	private static void testadd() throws SQLException {
       MobileModule m = new MobileModule();
       m.add(1, "Samsung", "Galaxy S24", 5000, "Android");
    
	}

	private static void testmobile() throws SQLException {
		MobileModule m = new MobileModule();
		m.create();
		

	}

}
