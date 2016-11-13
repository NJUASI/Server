package dataService.orderDataService;

import java.util.List;

import po.OrderGeneralPO;
import po.OrderPO;
import utilities.ResultMessage;

public interface OrderDataService {
	
	public ResultMessage createOrder (OrderPO order);
	
	public OrderPO  getOrderDetail (String orderID);
	
	public List<OrderGeneralPO> getAllGuestOrderGeneral (String GuestID);
	
	public List<OrderGeneralPO> getAllHotelOrderGeneral (String GuestID);
	
	public ResultMessage executeOrder (String orderID);
	
	public ResultMessage undoAbnormalOrder (String orderID);
	
	public ResultMessage undoNormalOrder (String orderID);
}
