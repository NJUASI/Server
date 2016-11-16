package dataService.hotelDataService;

import java.util.ArrayList;
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

public class HotelDataService_Stub implements HotelDataService  {

	
	public List<HotelGeneralPO> getHotelList(AddressPO addressPO) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public HotelPO getHotelDetail(String hotelID) {
		// TODO Auto-generated method stub
		return new HotelPO("12345678", "thisHotel", "NanJing", "center", "address", "4",
				5,"5", "good", "allEquipment");
	}

	
	public ResultMessage addEvaluation(EvaluationPO evaluationPO) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCESS;
	}

	
	public HotelPO getHotelInfo(String hotelID) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public ResultMessage setHotelInfo(HotelPO hotelInfoPO) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCESS;
	}

	
	public RoomInfoPO getHotelRoomInfo(String hotelID) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public ResultMessage setHotelRoomInfo(RoomInfoPO hotelRoomInfoPO) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCESS;
	}

	
	public ResultMessage setCheckInInfo(CheckInPO checkInInfo) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCESS;
	}

	
	public ResultMessage setCheckOutInfo(CheckOutPO checkOutInfo) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCESS;
	}

	
	public List<RoomInfoPO> getRemainRoomInfo(String hotelID) {
		// TODO Auto-generated method stub
		List<RoomInfoPO> list = new ArrayList<RoomInfoPO>();
		list.add(new RoomInfoPO("12345678", RoomType.AMBASSADOR, 2, 200));
		return list;
	}

	
	public ResultMessage setRemainRoomInfo(String hotelID, Operation operation, Map<RoomType, Integer> roomInfo) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCESS;
	}

	
	public ResultMessage add(HotelPO hotelInfoPO) {
		// TODO Auto-generated method stub
		return ResultMessage.SUCCESS;
	}
	
}
