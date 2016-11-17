package rmi.dataRemote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import java.util.Map;

import data.hotelData.HotelDataServiceImpl;
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

public class HotelDataRemote extends UnicastRemoteObject implements HotelDataService{

	private static final long serialVersionUID = 3434060152387200042L;
	private HotelDataService hotelDataService;
	
	protected HotelDataRemote() throws RemoteException {
		this.hotelDataService= new HotelDataServiceImpl();
	}

	@Override
	public HotelPO getHotelInfo(String hotelID) throws RemoteException {
		return this.hotelDataService.getHotelInfo(hotelID);
	}

	@Override
	public ResultMessage setHotelInfo(HotelPO hotelPO) throws RemoteException {
		return this.hotelDataService.setHotelInfo(hotelPO);
	}

	@Override
	public List<RoomInfoPO> getHotelRoomInfo(String hotelID) throws RemoteException {
		return this.hotelDataService.getHotelRoomInfo(hotelID);
	}

	@Override
	public ResultMessage setHotelRoomInfo(List<RoomInfoPO> list) throws RemoteException {
		return this.hotelDataService.setHotelRoomInfo(list);
	}

	@Override
	public ResultMessage setCheckInInfo(CheckInPO checkInPO) throws RemoteException {
		return this.hotelDataService.setCheckInInfo(checkInPO);
	}

	@Override
	public ResultMessage setCheckOutInfo(CheckOutPO checkOutPO) throws RemoteException {
		return this.hotelDataService.setCheckOutInfo(checkOutPO);
	}

	@Override
	public List<RoomInfoPO> getRemainRoomInfo(String hotelID) throws RemoteException {
		return this.hotelDataService.getRemainRoomInfo(hotelID);
	}

	@Override
	public ResultMessage setRemainRoomInfo(String hotelID, Operation operation, Map<RoomType, Integer> roomInfo)
			throws RemoteException {
		return this.hotelDataService.setRemainRoomInfo(hotelID, operation, roomInfo);
	}

	@Override
	public ResultMessage add(HotelPO hotelPO) throws RemoteException {
		return this.hotelDataService.add(hotelPO);
	}

	@Override
	public List<HotelGeneralPO> getHotelList(AddressPO addressPO) {
		return this.hotelDataService.getHotelList(addressPO);
	}

	@Override
	public HotelPO getHotelDetail(String hotelID) {
		return this.hotelDataService.getHotelDetail(hotelID);
	}

	@Override
	public ResultMessage addEvaluation(EvaluationPO evaluationPO) {
		return this.hotelDataService.addEvaluation(evaluationPO);
	}

}
