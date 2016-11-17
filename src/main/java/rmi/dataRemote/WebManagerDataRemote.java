package rmi.dataRemote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import data.webManagerData.WebManagerDataServiceImpl;
import dataService.webManagerDataService.WebManagerDataService;
import po.WebManagerPO;
import utilities.ResultMessage;

public class WebManagerDataRemote extends UnicastRemoteObject implements WebManagerDataService{

	private static final long serialVersionUID = 3434060152387200042L;
	private WebManagerDataService webManagerDataService;
	
	
	protected WebManagerDataRemote() throws RemoteException {
		this.webManagerDataService = new WebManagerDataServiceImpl();
	}

	@Override
	public WebManagerPO getSingle(String webManagerID) throws RemoteException {
		return this.webManagerDataService.getSingle(webManagerID);
	}

	@Override
	public List<WebManagerPO> getAllWebManager() throws RemoteException {
		return this.webManagerDataService.getAllWebManager();
	}

	@Override
	public ResultMessage add(WebManagerPO newWebManagerPO) throws RemoteException {
		return this.webManagerDataService.add(newWebManagerPO);
	}

	@Override
	public ResultMessage modify(WebManagerPO webManagerPO) throws RemoteException {
		return this.webManagerDataService.modify(webManagerPO);
	}

}
