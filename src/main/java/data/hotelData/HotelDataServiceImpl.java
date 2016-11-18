package data.hotelData;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import java.util.Map;

import dataService.hotelDataService.HotelDataService;
import po.AddressPO;
import po.CheckInPO;
import po.CheckOutPO;
import po.EvaluationPO;
import po.HotelGeneralPO;
import po.HotelPO;
import po.RoomInfoPO;
import utilities.Operation;
import utilities.ResultMessage;
import utilities.RoomType;

public class HotelDataServiceImpl extends UnicastRemoteObject implements HotelDataService{

	private static final long serialVersionUID = 3434060152387200042L;
	
	
	public HotelDataServiceImpl() throws RemoteException {
		super();
	}


	@Override
	public HotelPO getHotelInfo(String hotelID) throws RemoteException {
		return null;
	}


	@Override
	public ResultMessage setHotelInfo(HotelPO hotelPO) throws RemoteException {
		return null;
	}


	@Override
	public List<RoomInfoPO> getHotelRoomInfo(String hotelID) throws RemoteException {
		return null;
	}


	@Override
	public ResultMessage setHotelRoomInfo(List<RoomInfoPO> list) throws RemoteException {
		return null;
	}


	@Override
	public ResultMessage setCheckInInfo(CheckInPO checkInPO) throws RemoteException {
		return null;
	}


	@Override
	public ResultMessage setCheckOutInfo(CheckOutPO checkOutPO) throws RemoteException {
		return null;
	}


	@Override
	public List<RoomInfoPO> getRemainRoomInfo(String hotelID) throws RemoteException {
		return null;
	}


	@Override
	public ResultMessage setRemainRoomInfo(String hotelID, Operation operation, Map<RoomType, Integer> roomInfo)
			throws RemoteException {
		return null;
	}


	@Override
	public ResultMessage add(HotelPO hotelPO) throws RemoteException {
		return null;
	}


	@Override
	public List<HotelGeneralPO> getHotelList(AddressPO addressPO) throws RemoteException {
		return null;
	}


	@Override
	public HotelPO getHotelDetail(String hotelID) throws RemoteException {
		return null;
	}


	@Override
	public ResultMessage addEvaluation(EvaluationPO evaluationPO) throws RemoteException {
		return null;
	}

	
	
}
