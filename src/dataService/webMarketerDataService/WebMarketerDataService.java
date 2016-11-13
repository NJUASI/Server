package dataService.webMarketerDataService;

import java.util.List;

import po.WebMarketerPO;
import utilities.ResultMessage;

public interface WebMarketerDataService {

	public WebMarketerPO getSingle (String webMarketID);
	
	public List<WebMarketerPO> getAllWebMarketer ();

	public ResultMessage add(WebMarketerPO newWebMarketerPO);

	public ResultMessage modify (WebMarketerPO webMarketerPO);

	public ResultMessage init();
}
