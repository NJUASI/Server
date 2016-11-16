package po;

import java.time.LocalDateTime;
import java.util.List;

public class CheckInPO {

	//	订单编号
	private String orderID;
	
	//	房间号的集合
	private List<String> roomNumberList;
	
	//	入住时间
	private LocalDateTime checkInTime;	
	
	//	预计离开时间
	private LocalDateTime expectLeaveTime;
	
	public CheckInPO(String orderID, List<String> roomNumberList, LocalDateTime checkInTime, LocalDateTime expectLeaveTime) {
		this.orderID = orderID;
		this.roomNumberList = roomNumberList;
		this.checkInTime = checkInTime;
		this.expectLeaveTime = expectLeaveTime;
	}
	
	public String getOrderID() {
		return orderID;
	}
	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}
	public List<String> getRoomNumber() {
		return roomNumberList;
	}
	public void setRoomNumber(List<String> roomNumberList) {
		this.roomNumberList = roomNumberList;
	}
	public LocalDateTime getCheckInTime() {
		return checkInTime;
	}
	public void setCheckInTime(LocalDateTime checkInTime) {
		this.checkInTime = checkInTime;
	}
	public LocalDateTime getExpectLeaveTime() {
		return expectLeaveTime;
	}
	public void setExpectLeaveTime(LocalDateTime expectLeaveTime) {
		this.expectLeaveTime = expectLeaveTime;
	}
	
	
}
