package dataHelperImpl;

import java.time.LocalDate;
import java.util.List;

import dataHelper.OrderDataHelper;
import po.OrderPO;
import utilities.OrderState;
import utilities.ResultMessage;

public class OrderDataHelperImpl implements OrderDataHelper{

	public ResultMessage add(OrderPO orderPO) {
		return null;
	}

	public ResultMessage setState(String orderID, OrderState state) {
		return null;
	}

	public ResultMessage setComment(String orderID, String comment) {
		return null;
	}

	public OrderPO getSingleOrder(String orderID) {
		return null;
	}

	public List<OrderPO> getAllOrderOfGuest(String guestID) {
		return null;
	}

	public List<OrderPO> getAllOrderOfHotel(String hotelID) {
		return null;
	}

	public List<OrderPO> getAbnormal(LocalDate date) {
		return null;
	}

	public List<OrderPO> getUnexecuted(LocalDate date) {
		return null;
	}

	public void close() {
		
	}

	
}
