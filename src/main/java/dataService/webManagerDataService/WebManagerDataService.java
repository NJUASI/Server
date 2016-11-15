package dataService.webManagerDataService;

import java.util.List;

import po.WebManagerPO;
import utilities.ResultMessage;

public interface WebManagerDataService {

	public WebManagerPO getSingle (String webManagerID);
	
	public List<WebManagerPO> getAllWebManager ();

	public ResultMessage add(WebManagerPO newWebManagerPO);

	public ResultMessage modify (WebManagerPO webManagerPO);
}
