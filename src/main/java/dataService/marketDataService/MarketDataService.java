package dataService.marketDataService;

import java.util.List;

import po.MarketPO;
import utilities.ResultMessage;

public interface MarketDataService {
	
	public List<MarketPO> getMemberFormulation();
	
	public ResultMessage setMemberFormulation (List<MarketPO> marketPOList);
}
