package rmi.dataRemote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import data.promotionData.PromotionDataServiceImpl;
import dataService.promotionDataService.PromotionDataService;
import po.HotelPromotionPO;
import po.WebPromotionPO;

public class PromotionDataRemote extends UnicastRemoteObject implements PromotionDataService{

	private static final long serialVersionUID = 3434060152387200042L;
	private PromotionDataService promotionDataService;
	
	
	protected PromotionDataRemote() throws RemoteException {
		this.promotionDataService= new PromotionDataServiceImpl();
	}

	@Override
	public List<HotelPromotionPO> getHotelPromotions(String hotelWorkerID) throws RemoteException {
		return this.getHotelPromotions(hotelWorkerID);
	}

	@Override
	public List<WebPromotionPO> getWebPromotions() throws RemoteException {
		return this.getWebPromotions();
	}

	@Override
	public boolean setHotelPromotions(String hotelWorkerID, List<HotelPromotionPO> list) throws RemoteException {
		return this.promotionDataService.setHotelPromotions(hotelWorkerID, list);
	}

	@Override
	public boolean setWebPromotions(List<WebPromotionPO> list) throws RemoteException {
		return this.promotionDataService.setWebPromotions(list);
	}

}
