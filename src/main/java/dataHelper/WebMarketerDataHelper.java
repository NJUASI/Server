package dataHelper;

import java.util.List;

import po.WebMarketerPO;
import utilities.ResultMessage;

public interface WebMarketerDataHelper {
	
	public WebMarketerPO getSingleWebMarketer(String webMarketID);

	public List<WebMarketerPO> getAllWebMarketer();

	public ResultMessage add(WebMarketerPO newWebMarketerPO);

	public ResultMessage modify(WebMarketerPO webMarketerPO);

	public ResultMessage initWebMarketer();
	
}
