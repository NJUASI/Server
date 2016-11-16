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

	public HotelPO getHotelInfo (String hotelID);
	
	public ResultMessage setHotelInfo(HotelPO hotelPO);
	
	public List<RoomInfoPO> getHotelRoomInfo(String hotelID);
	
	public ResultMessage setHotelRoomInfo(List<RoomInfoPO> list);
	
	public ResultMessage setCheckInInfo (CheckInPO checkInPO);
	
	public ResultMessage setCheckOutInfo (CheckOutPO checkOutPO);
	
	public List<RoomInfoPO> getRemainRoomInfo(String hotelID);
	
	public ResultMessage setRemainRoomInfo(String hotelID, Operation operation, Map<RoomType, Integer> roomInfo);
	
	public ResultMessage add (HotelPO hotelPO);
	
	
	
	public List<HotelGeneralPO> getHotelList(AddressPO addressPO);
	
	public HotelPO getHotelDetail(String hotelID);

	public ResultMessage addEvaluation (EvaluationPO evaluationPO);
}
