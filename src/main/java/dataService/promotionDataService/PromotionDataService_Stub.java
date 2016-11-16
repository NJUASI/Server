package dataService.promotionDataService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import po.HotelPromotionPO;
import po.WebPromotionPO;
import utilities.PromotionType;

public class PromotionDataService_Stub implements PromotionDataService {

	
	public List<HotelPromotionPO> getHotelPromotions(String hotelWorkerID) {
		// TODO Auto-generated method stub
		List<HotelPromotionPO> list = new ArrayList<HotelPromotionPO>();
		list.add(new HotelPromotionPO(PromotionType.HOTEL__BIRTHDAY, "12345678", 0.9, 
				LocalDate.of(2016, 2, 2), LocalDate.of(2016, 3, 9)));
		return list;
	}

	
	public List<WebPromotionPO> getWebPromotions() {
		// TODO Auto-generated method stub
		List<WebPromotionPO> list = new ArrayList<WebPromotionPO>();
		list.add(new WebPromotionPO(PromotionType.WEB__HOLIDAY, "ALL_CYCLE", 0.9, 
				LocalDate.of(2016, 2, 2), LocalDate.of(2016, 3, 9)));
		return list;
	}

	
	public boolean setHotelPromotions(String hotelWorkerID, List<HotelPromotionPO> list) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean setWebPromotions(List<WebPromotionPO> list) {
		// TODO Auto-generated method stub
		return false;
	}

}
