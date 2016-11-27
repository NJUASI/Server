package data.dataHelper;

import java.util.List;

import po.WebMarketerPO;
import utilities.ResultMessage;

public interface WebMarketerDataHelper {
	
	public WebMarketerPO getSingle(String webMarketID);

	public List<WebMarketerPO> getAll();

	public ResultMessage add(WebMarketerPO newWebMarketerPO);

	public ResultMessage modify(WebMarketerPO webMarketerPO);

	public ResultMessage init();
	
}
