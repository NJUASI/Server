package data.dataHelper;

import java.util.List;

import po.CreditPO;
import po.GuestPO;
import utilities.ResultMessage;

public interface GuestDataHelper {
	
	public GuestPO getSingle(String guestID);

	public List<GuestPO> getAll();
	
	public List<CreditPO> getAllCreditDetail(String guestID);
	
	public ResultMessage add(GuestPO newGuestPO);

	public ResultMessage modify(GuestPO guestPO);

}
