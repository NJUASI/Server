package dataService.promotionDataService;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import po.HotelPromotionPO;
import po.WebPromotionPO;

public interface PromotionDataService extends Remote{
	
	public List<HotelPromotionPO> getHotelPromotions(String hotelWorkerID) throws RemoteException;

	public List<WebPromotionPO> getWebPromotions() throws RemoteException;

	public boolean setHotelPromotions(String hotelWorkerID,List<HotelPromotionPO> list) throws RemoteException;

	public boolean setWebPromotions(List<WebPromotionPO> list) throws RemoteException;

}
