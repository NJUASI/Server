package dataService.promotionDataService;

import java.util.List;

import po.HotelPromotionPO;
import po.WebPromotionPO;

public interface PromotionDataService {
	
	public List<HotelPromotionPO> getHotelPromotions(String hotelWorkerID);

	public List<WebPromotionPO> getWebPromotions(String webMarketerID);

	public boolean setHotelPromotions(String hotelWorkerID,List<HotelPromotionPO> list);

	public boolean setWebPromotions(String webMarketerID,List<WebPromotionPO> list);

}
