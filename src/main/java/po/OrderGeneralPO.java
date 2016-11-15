package po;

import java.time.LocalDateTime;

import utilities.OrderState;

public class OrderGeneralPO {
	
	// 订单编号
	private String orderID;
	
	// 客户编号
	private String guestID;
	
	// 酒店编号
	private String hotelID;
	
	// 酒店名
	private String hotelName;
	
	// 酒店地址
	private String hotelAddress;
	
	// 最后预定价格
	private double price;
	
	// 最晚订单执行时间
	private LocalDateTime expectExecuteTime;
	
	// 预计离开时间
	private LocalDateTime expectLeaveTime;
	
	// 订单状态
	private OrderState state;

	public OrderGeneralPO(String orderID, String guestID, String hotelID, String hotelName, String hotelAddress,
			double price, LocalDateTime expectExecuteTime, LocalDateTime expectLeaveTime, OrderState state) {
		super();
		this.orderID = orderID;
		this.guestID = guestID;
		this.hotelID = hotelID;
		this.hotelName = hotelName;
		this.hotelAddress = hotelAddress;
		this.price = price;
		this.expectExecuteTime = expectExecuteTime;
		this.expectLeaveTime = expectLeaveTime;
		this.state = state;
	}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public String getGuestID() {
		return guestID;
	}

	public void setGuestID(String guestID) {
		this.guestID = guestID;
	}

	public String getHotelID() {
		return hotelID;
	}

	public void setHotelID(String hotelID) {
		this.hotelID = hotelID;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getHotelAddress() {
		return hotelAddress;
	}

	public void setHotelAddress(String hotelAddress) {
		this.hotelAddress = hotelAddress;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDateTime getExpectExecuteTime() {
		return expectExecuteTime;
	}

	public void setExpectExecuteTime(LocalDateTime expectExecuteTime) {
		this.expectExecuteTime = expectExecuteTime;
	}

	public LocalDateTime getExpectLeaveTime() {
		return expectLeaveTime;
	}

	public void setExpectLeaveTime(LocalDateTime expectLeaveTime) {
		this.expectLeaveTime = expectLeaveTime;
	}

	public OrderState getState() {
		return state;
	}

	public void setState(OrderState state) {
		this.state = state;
	}

}
