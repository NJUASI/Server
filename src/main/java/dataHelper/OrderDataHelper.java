package dataHelper;

import java.rmi.RemoteException;
import java.time.LocalDate;
import java.util.List;

import po.OrderGeneralPO;
import po.OrderPO;
import utilities.ResultMessage;

public interface OrderDataHelper {

	public ResultMessage createOrder(OrderPO order);
	
	public ResultMessage executeOrder(String orderID);

	public OrderPO getOrderDetail(String orderID);

	public List<OrderGeneralPO> getAllGuestOrderGeneral(String GuestID);

	public List<OrderGeneralPO> getAllHotelOrderGeneral(String GuestID);

	public List<OrderGeneralPO> getAllAbnormalOrderGeneral(LocalDate date);

	public List<OrderGeneralPO> getAllAbnormalOrderGeneral();

	public ResultMessage undoAbnormalOrder(String orderID);

	public ResultMessage undoNormalOrder(String orderID);

	public List<String> getBookedHotels(String guestID);
	
}
