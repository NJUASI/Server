package dataService.hotelDataService;

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

public interface HotelDataService {

	public List<HotelGeneralPO> getHotelList(AddressPO addressPO);
	
	public HotelPO getHotelDetail(String hotelID);

	public ResultMessage addEvaluation (EvaluationPO evaluationPO);
	
	public HotelPO getHotelInfo (String hotelID);
	
	public ResultMessage setHotelInfo(HotelPO hotelInfoPO);
	
	public RoomInfoPO getHotelRoomInfo(String hotelID);
	
	public ResultMessage setHotelRoomInfo(RoomInfoPO hotelRoomInfoPO);
	
	public ResultMessage setCheckInInfo (CheckInPO checkInInfo);
	
	public ResultMessage setCheckOutInfo (CheckOutPO checkOutInfo);
	
	public List<RoomInfoPO> getRemainRoomInfo(String hotelID);
	
	public ResultMessage setRemainRoomInfo(String hotelID, Operation operation, Map<RoomType, Integer> roomInfo);
	
	public ResultMessage add (HotelPO hotelInfoPO);
}
