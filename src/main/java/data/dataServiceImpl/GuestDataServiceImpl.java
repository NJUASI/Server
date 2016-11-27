package data.dataServiceImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import dataService.guestDataService.GuestDataService;
import po.CreditPO;
import po.GuestPO;
import po.MemberPO;
import utilities.ResultMessage;

public class GuestDataServiceImpl extends UnicastRemoteObject implements GuestDataService{

	private static final long serialVersionUID = 3434060152387200042L;
	
	
	public GuestDataServiceImpl() throws RemoteException {
		super();	
	}

	@Override
	public GuestPO getSingleGuest(String guestID) throws RemoteException {
		return null;
	}

	@Override
	public List<GuestPO> getAllGuest() throws RemoteException {
		return null;
	}

	@Override
	public List<CreditPO> getAllCreditDetail(String guestID) throws RemoteException {
		return null;
	}

	@Override
	public ResultMessage add(GuestPO newGuestPO) throws RemoteException {
		return null;
	}

	@Override
	public ResultMessage modifyMember(MemberPO memberPO) throws RemoteException {
		return null;
	}

	@Override
	public ResultMessage modify(GuestPO guestPO) throws RemoteException {
		return null;
	}

}
