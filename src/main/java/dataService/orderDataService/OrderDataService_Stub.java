package dataService.orderDataService;

import java.time.LocalDateTime;
import java.util.List;

import po.OrderGeneralPO;
import po.OrderPO;
import utilities.OrderState;
import utilities.ResultMessage;
import utilities.RoomType;

public class OrderDataService_Stub implements OrderDataService {

	
	public ResultMessage createOrder(OrderPO order) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCESS;
	}

	
	public OrderPO getOrderDetail(String orderID) {
		// TODO Auto-generated method stub
		LocalDateTime createTime = LocalDateTime.of(2016, 2, 2, 18, 20);
		LocalDateTime checkInTime = LocalDateTime.of(2016, 2, 3, 11, 23);
		LocalDateTime checkOutTime = LocalDateTime.of(2016, 2, 4, 10, 58);
		LocalDateTime expectExecuteTime = LocalDateTime.of(2016, 2, 3, 14, 00);
		LocalDateTime expectLeaveTime = LocalDateTime.of(2016, 2, 4, 12, 00);

		OrderState orderState = OrderState.EXECUTED;
		RoomType roomType = RoomType.AMBASSADOR;
		
		
		return new OrderPO("123456789012", "1234567890", "12345678", "thisHotel", "address", 200, 200,
				createTime, checkInTime, checkOutTime, expectExecuteTime, expectLeaveTime, orderState, 
				roomType, 2, "301  302", 2, "zhangsan","13554321234", "no");

	}

	
	public List<OrderGeneralPO> getAllGuestOrderGeneral(String GuestID) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<OrderGeneralPO> getAllHotelOrderGeneral(String GuestID) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public ResultMessage executeOrder(String orderID) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCESS;
	}

	
	public ResultMessage undoAbnormalOrder(String orderID) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCESS;
	}

	
	public ResultMessage undoNormalOrder(String orderID) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCESS;
	}

}
