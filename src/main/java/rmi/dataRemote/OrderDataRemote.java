package rmi.dataRemote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.time.LocalDate;
import java.util.List;

import data.orderData.OrderDataServiceImpl;
import dataService.orderDataService.OrderDataService;
import po.OrderGeneralPO;
import po.OrderPO;
import utilities.ResultMessage;

public class OrderDataRemote extends UnicastRemoteObject implements OrderDataService{

	private static final long serialVersionUID = 3434060152387200042L;
	private OrderDataService orderDataService;
	
	
	protected OrderDataRemote() throws RemoteException {
		this.orderDataService = new OrderDataServiceImpl();
	}

	@Override
	public ResultMessage createOrder(OrderPO order) throws RemoteException {
		return this.orderDataService.createOrder(order);
	}

	@Override
	public ResultMessage executeOrder(String orderID) throws RemoteException {
		return this.orderDataService.executeOrder(orderID);
	}

	@Override
	public OrderPO getOrderDetail(String orderID) throws RemoteException {
		return this.orderDataService.getOrderDetail(orderID);
	}

	@Override
	public List<OrderGeneralPO> getAllGuestOrderGeneral(String GuestID) throws RemoteException {
		return this.orderDataService.getAllGuestOrderGeneral(GuestID);
	}

	@Override
	public List<OrderGeneralPO> getAllHotelOrderGeneral(String GuestID) throws RemoteException {
		return this.orderDataService.getAllHotelOrderGeneral(GuestID);
	}

	@Override
	public List<OrderGeneralPO> getAllAbnormalOrderGeneral(LocalDate date) throws RemoteException {
		return this.orderDataService.getAllAbnormalOrderGeneral(date);
	}

	@Override
	public List<OrderGeneralPO> getAllAbnormalOrderGeneral() throws RemoteException {
		return this.orderDataService.getAllAbnormalOrderGeneral();
	}

	@Override
	public ResultMessage undoAbnormalOrder(String orderID) throws RemoteException {
		return this.orderDataService.undoAbnormalOrder(orderID);
	}

	@Override
	public ResultMessage undoNormalOrder(String orderID) throws RemoteException {
		return this.orderDataService.undoNormalOrder(orderID);
	}

}
