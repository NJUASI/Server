package data.dataServiceImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.time.LocalDate;
import java.util.List;

import dataService.orderDataService.OrderDataService;
import po.OrderGeneralPO;
import po.OrderPO;
import utilities.ResultMessage;

public class OrderDataServiceImpl extends UnicastRemoteObject implements OrderDataService{

	private static final long serialVersionUID = 3434060152387200042L;
	
	
	public OrderDataServiceImpl() throws RemoteException {
		super();
	}

	@Override
	public ResultMessage createOrder(OrderPO order) throws RemoteException {
		return null;
	}

	@Override
	public ResultMessage executeOrder(String orderID) throws RemoteException {
		return null;
	}

	@Override
	public OrderPO getOrderDetail(String orderID) throws RemoteException {
		return null;
	}

	@Override
	public List<OrderGeneralPO> getAllGuestOrderGeneral(String GuestID) throws RemoteException {
		return null;
	}

	@Override
	public List<OrderGeneralPO> getAllHotelOrderGeneral(String GuestID) throws RemoteException {
		return null;
	}

	@Override
	public List<OrderGeneralPO> getAllAbnormalOrderGeneral(LocalDate date) throws RemoteException {
		return null;
	}

	@Override
	public List<OrderGeneralPO> getAllAbnormalOrderGeneral() throws RemoteException {
		return null;
	}

	@Override
	public ResultMessage undoAbnormalOrder(String orderID) throws RemoteException {
		return null;
	}

	@Override
	public ResultMessage undoNormalOrder(String orderID) throws RemoteException {
		return null;
	}

	@Override
	public List<String> getBookedHotels(String guestID) throws RemoteException {
		return null;
	}

}
