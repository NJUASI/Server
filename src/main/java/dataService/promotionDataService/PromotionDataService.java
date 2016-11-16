package dataService.promotionDataService;

import java.util.List;

import po.HotelPromotionPO;
import po.WebPromotionPO;

public interface PromotionDataService {
	
	public List<HotelPromotionPO> getHotelPromotions(String hotelWorkerID);

	public List<WebPromotionPO> getWebPromotions();

	public boolean setHotelPromotions(String hotelWorkerID,List<HotelPromotionPO> list);

	public boolean setWebPromotions(List<WebPromotionPO> list);

}
