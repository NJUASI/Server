package dataServiceImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import dataService.webManagerDataService.WebManagerDataService;
import po.WebManagerPO;
import utilities.ResultMessage;

public class WebManagerDataServiceImpl extends UnicastRemoteObject implements WebManagerDataService{

	private static final long serialVersionUID = 3434060152387200042L;
	
	
	public WebManagerDataServiceImpl() throws RemoteException {
		super();
	}

	@Override
	public WebManagerPO getSingleWebManager(String webManagerID) throws RemoteException {
		return null;
	}

	@Override
	public List<WebManagerPO> getAllWebManager() throws RemoteException {
		return null;
	}

	@Override
	public ResultMessage add(WebManagerPO newWebManagerPO) throws RemoteException {
		return null;
	}

	@Override
	public ResultMessage modify(WebManagerPO webManagerPO) throws RemoteException {
		return null;
	}

}
