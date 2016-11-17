package rmi.dataRemote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import data.guestData.GuestDataServiceImpl;
import dataService.guestDataService.GuestDataService;
import po.CreditPO;
import po.GuestPO;
import po.MemberPO;
import utilities.ResultMessage;

public class GuestDataRemote extends UnicastRemoteObject implements GuestDataService{
	
	private static final long serialVersionUID = 3434060152387200042L;
	private GuestDataService guestDataService;

	protected GuestDataRemote() throws RemoteException {
		this.guestDataService= new GuestDataServiceImpl();
	}

	@Override
	public GuestPO getSingle(String guestID) throws RemoteException {
		return this.guestDataService.getSingle(guestID);
	}

	@Override
	public List<GuestPO> getAllGuest() throws RemoteException {
		return this.guestDataService.getAllGuest();
	}

	@Override
	public List<CreditPO> getAllCreditDetail(String guestID) throws RemoteException {
		return this.guestDataService.getAllCreditDetail(guestID);
	}

	@Override
	public ResultMessage add(GuestPO newGuestPO) throws RemoteException {
		return this.guestDataService.add(newGuestPO);
	}

	@Override
	public ResultMessage modifyMember(MemberPO memberPO) throws RemoteException {
		return this.guestDataService.modifyMember(memberPO);
	}

	@Override
	public ResultMessage modify(GuestPO guestPO) throws RemoteException {
		return this.guestDataService.modify(guestPO);
	}

}
