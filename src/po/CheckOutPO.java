package po;

import java.time.LocalDateTime;

public class CheckOutPO {

	//	订单编号
	private String orderID;
	
	//	退房时间
	private LocalDateTime checkOutTime;
	
	public CheckOutPO(String orderID,LocalDateTime checkOutTime) {
		this.orderID = orderID;
		this.checkOutTime = checkOutTime;
	}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public LocalDateTime getCheckOutTime() {
		return checkOutTime;
	}

	public void setCheckOutTime(LocalDateTime checkOutTime) {
		this.checkOutTime = checkOutTime;
	}

}
