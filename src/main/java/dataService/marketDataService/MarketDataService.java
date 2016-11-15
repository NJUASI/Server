package dataService.marketDataService;

import po.HotelPO;
import po.MarketPO;
import utilities.ResultMessage;

public interface MarketDataService {
	
	public MarketPO getMemberFormulation();
	
	public ResultMessage setMemberFormulation (HotelPO hotelInfoPO);
}
