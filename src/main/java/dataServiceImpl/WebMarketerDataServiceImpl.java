package dataServiceImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import dataService.webMarketerDataService.WebMarketerDataService;
import po.WebMarketerPO;
import utilities.ResultMessage;

public class WebMarketerDataServiceImpl extends UnicastRemoteObject implements WebMarketerDataService{

	private static final long serialVersionUID = 3434060152387200042L;
	
	
	public WebMarketerDataServiceImpl() throws RemoteException {
		super();
	}

	@Override
	public WebMarketerPO getSingleWebMarketer(String webMarketID) throws RemoteException {
		return null;
	}

	@Override
	public List<WebMarketerPO> getAllWebMarketer() throws RemoteException {
		return null;
	}

	@Override
	public ResultMessage add(WebMarketerPO newWebMarketerPO) throws RemoteException {
		return null;
	}

	@Override
	public ResultMessage modify(WebMarketerPO webMarketerPO) throws RemoteException {
		return null;
	}

	@Override
	public ResultMessage initWebMarketer() throws RemoteException {
		return null;
	}

}
