package po;

import utilities.RoomType;

public class RoomInfoPO {
	
	// 酒店编号
	private String hotelID;
	
	// 房间类型
	private RoomType roomType;
	
	// 房间数
	private int roomNumCount;
	
	// 价格
	private double price;
	
	public RoomInfoPO(String hotelID, RoomType roomType, int roomNumCount, double price) {
		super();
		this.hotelID = hotelID;
		this.roomType = roomType;	
		this.roomNumCount = roomNumCount;
		this.price = price;
	}
	public String getHotelID() {
		return hotelID;
	}
	public void setHotelID(String hotelID) {
		this.hotelID = hotelID;	
	}
	public RoomType getRoomType() {
		return roomType;
	}
	public void setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}
	public int getRoomNumCount() {
		return roomNumCount;
	}
	public void setRoomNumCount(int roomNumCount) {
		this.roomNumCount = roomNumCount;
	}
	public double getPrice() {			
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
