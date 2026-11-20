package com.rays.hotel;

import java.sql.SQLException;

public class TestHotel {
    public static void main(String[] args) throws SQLException {
	// testinsert();
   //  testcreate();
   //    testupdate();
    	testdelete();
	}
	private static void testdelete() throws SQLException {
      Hotel h = new Hotel();
      HotelBean b = new HotelBean();
      b.setRoomNo(102);
      h.delete(b);
	}
	private static void testupdate() throws SQLException {
		Hotel h = new Hotel();
        HotelBean b = new HotelBean();

      b.setAvaliability(false);
      b.setFloor(66);
      b.setPricePerNight(5676.00);
      b.setRoomNo(102);
      b.setRoomType("AC");
      h.update(b);
      
	
	}
	private static void testinsert() throws SQLException {
		Hotel h = new Hotel();
        HotelBean b = new HotelBean();
        b.setAvaliability(true);
        b.setFloor(5);
        b.setPricePerNight(1700.00);
        b.setRoomNo(105);
        b.setRoomType("Deluxe");
        h.insert(b);
      
	}	
	private static void testcreate() throws SQLException {
		Hotel h = new Hotel();
        HotelBean b = new HotelBean();
        h.Create(b);
	}
}
