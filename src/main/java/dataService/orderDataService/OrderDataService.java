package dataService.orderDataService;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.time.LocalDate;
import java.util.List;

import po.OrderGeneralPO;
import po.OrderPO;
import utilities.ResultMessage;

public interface OrderDataService extends Remote{
	
	public ResultMessage createOrder (OrderPO order) throws RemoteException;
	
	public ResultMessage executeOrder (String orderID) throws RemoteException;
	
	public OrderPO getOrderDetail (String orderID) throws RemoteException;
	
	public List<OrderGeneralPO> getAllGuestOrderGeneral (String guestID) throws RemoteException;
	
	public List<OrderGeneralPO> getAllHotelOrderGeneral (String hotelID) throws RemoteException;
	
	public List<OrderGeneralPO> getAllAbnormalOrderGeneral (LocalDate date) throws RemoteException;
	
	public List<OrderGeneralPO> getAllAbnormalOrderGeneral () throws RemoteException;
	
	public ResultMessage undoAbnormalOrder (String orderID) throws RemoteException;
	
	public ResultMessage undoNormalOrder (String orderID) throws RemoteException;
	
	public List<String> getBookedHotels(String guestID) throws RemoteException;
}
