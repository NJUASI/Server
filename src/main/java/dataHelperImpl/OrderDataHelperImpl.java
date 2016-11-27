package dataHelperImpl;

import java.time.LocalDate;
import java.util.List;

import dataHelper.OrderDataHelper;
import po.OrderGeneralPO;
import po.OrderPO;
import utilities.ResultMessage;

public class OrderDataHelperImpl implements OrderDataHelper{

	@Override
	public ResultMessage createOrder(OrderPO order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage executeOrder(String orderID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderPO getOrderDetail(String orderID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderGeneralPO> getAllGuestOrderGeneral(String GuestID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderGeneralPO> getAllHotelOrderGeneral(String GuestID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderGeneralPO> getAllAbnormalOrderGeneral(LocalDate date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderGeneralPO> getAllAbnormalOrderGeneral() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage undoAbnormalOrder(String orderID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultMessage undoNormalOrder(String orderID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getBookedHotels(String guestID) {
		// TODO Auto-generated method stub
		return null;
	}

}
