package data.hotelWorkerData;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import dataService.hotelWorkerDataService.HotelWorkerDataService;
import po.HotelWorkerPO;
import utilities.ResultMessage;

public class HotelWorkerDataServiceImpl extends UnicastRemoteObject implements HotelWorkerDataService{

	private static final long serialVersionUID = 3434060152387200042L;
	
	
	public HotelWorkerDataServiceImpl() throws RemoteException {
		super();
	}

	@Override
	public HotelWorkerPO getSingleHotelWorker(String hotelWorkerID) throws RemoteException {
		return null;
	}

	@Override
	public List<HotelWorkerPO> getAllHotelWorker() throws RemoteException {
		return null;
	}

	@Override
	public ResultMessage add(HotelWorkerPO newHotelWorkerPO) throws RemoteException {
		return null;
	}

	@Override
	public ResultMessage modify(HotelWorkerPO hotelWorkerPO) throws RemoteException {
		return null;
	}

	@Override
	public ResultMessage initHotelWorker() throws RemoteException {
		return null;
	}

}
