package dataHelper;

import java.util.List;

import po.WebManagerPO;
import utilities.ResultMessage;

public interface WebManagerDataHelper {

	public WebManagerPO getSingleWebManager(String webManagerID);

	public List<WebManagerPO> getAllWebManager();

	public ResultMessage add(WebManagerPO newWebManagerPO);

	public ResultMessage modify(WebManagerPO webManagerPO);
	
}
