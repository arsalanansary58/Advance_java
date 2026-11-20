package com.rays.hotel;

public class HotelBean {

 	private int RoomNo;
	private String RoomType;
	private int Floor;
	private double PricePerNight;
	private boolean Avaliability;
	public int getRoomNo() {
		return RoomNo;
	}
	public void setRoomNo(int roomNo) {
		RoomNo = roomNo;
	}
	public String getRoomType() {
		return RoomType;
	}
	public void setRoomType(String roomType) {
		RoomType = roomType;
	}
	public int getFloor() {
		return Floor;
	}
	public void setFloor(int floor) {
		Floor = floor;
	}
	public double getPricePerNight() {
		return PricePerNight;
	}
	public void setPricePerNight(double pricePerNight) {
		PricePerNight = pricePerNight;
	}
	public boolean isAvaliability() {
		return Avaliability;
	}
	public void setAvaliability(boolean avaliability) {
		Avaliability = avaliability;
	}
	
	
}
