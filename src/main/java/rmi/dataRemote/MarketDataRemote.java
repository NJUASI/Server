package rmi.dataRemote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import data.marketData.MarketDataServiceImpl;
import dataService.marketDataService.MarketDataService;
import po.MarketPO;
import utilities.ResultMessage;

public class MarketDataRemote extends UnicastRemoteObject implements MarketDataService{

	private static final long serialVersionUID = 3434060152387200042L;
	private MarketDataService marketDataService;
	
	
	protected MarketDataRemote() throws RemoteException {
		this.marketDataService = new MarketDataServiceImpl();
	}

	@Override
	public List<MarketPO> getMemberFormulation() throws RemoteException {
		return this.marketDataService.getMemberFormulation();
	}

	@Override
	public ResultMessage setMemberFormulation(List<MarketPO> marketPOList) throws RemoteException {
		return this.marketDataService.setMemberFormulation(marketPOList);
	}

}
