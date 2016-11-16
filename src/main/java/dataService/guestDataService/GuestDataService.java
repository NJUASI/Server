package dataService.guestDataService;

import java.util.List;

import po.GuestPO;
import po.MemberPO;
import utilities.ResultMessage;

public interface GuestDataService {

	public ResultMessage add(GuestPO newGuestPO);
	
	public ResultMessage modify(GuestPO guestPO);
	
	public GuestPO getSingle(String guestID);
	
	public List<GuestPO> getAllGuest();

	public ResultMessage modifyMember(MemberPO memberPO);
	
	public ResultMessage init();
}
