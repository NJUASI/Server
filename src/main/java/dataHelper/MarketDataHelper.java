package dataHelper;

import java.util.List;

import po.MarketPO;
import utilities.ResultMessage;

public interface MarketDataHelper {

	public List<MarketPO> getMemberFormulation();

	public ResultMessage setMemberFormulation(List<MarketPO> marketPOList);

}
