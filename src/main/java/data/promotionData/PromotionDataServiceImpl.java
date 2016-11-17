package data.promotionData;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import dataService.promotionDataService.PromotionDataService;
import po.HotelPromotionPO;
import po.WebPromotionPO;

public class PromotionDataServiceImpl extends UnicastRemoteObject implements PromotionDataService{

	private static final long serialVersionUID = 3434060152387200042L;
	
	
	public PromotionDataServiceImpl() throws RemoteException {
		super();
	}

	@Override
	public List<HotelPromotionPO> getHotelPromotions(String hotelWorkerID) throws RemoteException {
		return null;
	}

	@Override
	public List<WebPromotionPO> getWebPromotions() throws RemoteException {
		return null;
	}

	@Override
	public boolean setHotelPromotions(String hotelWorkerID, List<HotelPromotionPO> list) throws RemoteException {
		return false;
	}

	@Override
	public boolean setWebPromotions(List<WebPromotionPO> list) throws RemoteException {
		return false;
	}

}
