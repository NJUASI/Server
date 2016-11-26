package dataHelper;

import java.util.List;

import po.CreditPO;
import po.GuestPO;
import po.MemberPO;
import utilities.ResultMessage;

public interface GuestDataHelper {
	public GuestPO getSingleGuest(String guestID);

	public List<GuestPO> getAllGuest();
	
	public List<CreditPO> getAllCreditDetail(String guestID);

	public ResultMessage add(GuestPO newGuestPO);

	public ResultMessage modifyMember(MemberPO memberPO);

	public ResultMessage modify(GuestPO guestPO);

}
