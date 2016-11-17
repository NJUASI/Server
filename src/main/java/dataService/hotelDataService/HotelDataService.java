package dataService.hotelDataService;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import java.util.Map;

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

public interface HotelDataService extends Remote{

	public HotelPO getHotelInfo (String hotelID) throws RemoteException;
	
	public ResultMessage setHotelInfo(HotelPO hotelPO) throws RemoteException;
	
	public List<RoomInfoPO> getHotelRoomInfo(String hotelID) throws RemoteException;
	
	public ResultMessage setHotelRoomInfo(List<RoomInfoPO> list) throws RemoteException;
	
	public ResultMessage setCheckInInfo (CheckInPO checkInPO) throws RemoteException;
	
	public ResultMessage setCheckOutInfo (CheckOutPO checkOutPO) throws RemoteException;
	
	public List<RoomInfoPO> getRemainRoomInfo(String hotelID) throws RemoteException;
	
	public ResultMessage setRemainRoomInfo(String hotelID, Operation operation, Map<RoomType, Integer> roomInfo) throws RemoteException;
	
	public ResultMessage add (HotelPO hotelPO) throws RemoteException;
	
	
	
	public List<HotelGeneralPO> getHotelList(AddressPO addressPO);
	
	public HotelPO getHotelDetail(String hotelID);

	public ResultMessage addEvaluation (EvaluationPO evaluationPO);
}
