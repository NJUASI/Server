package rmi.dataRemote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import data.hotelWorkerData.HotelWorkerDataServiceImpl;
import dataService.hotelWorkerDataService.HotelWorkerDataService;
import po.HotelWorkerPO;
import utilities.ResultMessage;

public class HotelWorkerDataRemote extends UnicastRemoteObject implements HotelWorkerDataService{

	private static final long serialVersionUID = 3434060152387200042L;
	private HotelWorkerDataService hotelWorkerDataService;
	
	
	protected HotelWorkerDataRemote() throws RemoteException {
		this.hotelWorkerDataService= new HotelWorkerDataServiceImpl();
	}

	@Override
	public HotelWorkerPO getSingle(String hotelWorkerID) throws RemoteException {
		return this.hotelWorkerDataService.getSingle(hotelWorkerID);
	}

	@Override
	public List<HotelWorkerPO> getAllHotelWorker() throws RemoteException {
		return this.hotelWorkerDataService.getAllHotelWorker();
	}

	@Override
	public ResultMessage add(HotelWorkerPO newHotelWorkerPO) throws RemoteException {
		return this.hotelWorkerDataService.add(newHotelWorkerPO);
	}

	@Override
	public ResultMessage modify(HotelWorkerPO hotelWorkerPO) throws RemoteException {
		return this.hotelWorkerDataService.modify(hotelWorkerPO);
	}

	@Override
	public ResultMessage init() throws RemoteException {
		return this.hotelWorkerDataService.init();
	}

}
