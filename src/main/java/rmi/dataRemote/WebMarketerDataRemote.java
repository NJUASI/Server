package rmi.dataRemote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import data.webMarketerData.WebMarketerDataServiceImpl;
import dataService.webMarketerDataService.WebMarketerDataService;
import po.WebMarketerPO;
import utilities.ResultMessage;

public class WebMarketerDataRemote extends UnicastRemoteObject implements WebMarketerDataService{

	private static final long serialVersionUID = 3434060152387200042L;
	private WebMarketerDataService webMarketerDataService;
	
	
	protected WebMarketerDataRemote() throws RemoteException {
		this.webMarketerDataService = new WebMarketerDataServiceImpl();
	}

	@Override
	public WebMarketerPO getSingle(String webMarketID) throws RemoteException {
		return this.webMarketerDataService.getSingle(webMarketID);
	}

	@Override
	public List<WebMarketerPO> getAllWebMarketer() throws RemoteException {
		return this.webMarketerDataService.getAllWebMarketer();
	}

	@Override
	public ResultMessage add(WebMarketerPO newWebMarketerPO) throws RemoteException {
		return this.webMarketerDataService.add(newWebMarketerPO);
	}

	@Override
	public ResultMessage modify(WebMarketerPO webMarketerPO) throws RemoteException {
		return this.webMarketerDataService.modify(webMarketerPO);
	}

	@Override
	public ResultMessage init() throws RemoteException {
		return this.webMarketerDataService.init();
	}

}
