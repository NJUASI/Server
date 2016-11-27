package dataHelper;

import java.util.List;

import po.WebManagerPO;
import utilities.ResultMessage;

public interface WebManagerDataHelper {

	public WebManagerPO getSingle(String webManagerID);

	public List<WebManagerPO> getAll();

	public ResultMessage add(WebManagerPO newWebManagerPO);

	public ResultMessage modify(WebManagerPO webManagerPO);
	
}
