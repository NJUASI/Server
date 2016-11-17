package data.marketData;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import dataService.marketDataService.MarketDataService;
import po.MarketPO;
import utilities.ResultMessage;

public class MarketDataServiceImpl extends UnicastRemoteObject implements  MarketDataService{

	private static final long serialVersionUID = 3434060152387200042L;
	
	
	public MarketDataServiceImpl() throws RemoteException {
		super();
	}

	@Override
	public List<MarketPO> getMemberFormulation() throws RemoteException {
		return null;
	}

	@Override
	public ResultMessage setMemberFormulation(List<MarketPO> marketPOList) throws RemoteException {
		return null;
	}

}
