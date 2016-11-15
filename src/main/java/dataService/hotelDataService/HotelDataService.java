package dataService.hotelDataService;


import java.util.List;

import po.AddressPO;
import po.CheckInPO;
import po.CheckOutPO;
import po.EvaluationPO;
import po.HotelGeneralPO;
import po.HotelPO;
import po.RoomInfoPO;

public interface HotelDataService {

	public List<HotelGeneralPO> getHotelList(AddressPO addressPO);
	
	public HotelPO getHotelDetail(String hotelID);

	public boolean addEvaluation (EvaluationPO evaluationPO);
	
	public HotelPO getHotelInfo (String hotelID);
	
	public boolean setHotelInfo(HotelPO hotelInfoPO);
	
	public RoomInfoPO getHotelRoomInfo(String hotelID);
	
	public boolean setHotelRoomInfo(RoomInfoPO hotelRoomInfoPO);
	
	public boolean setCheckInInfo (CheckInPO checkInInfo);
	
	public boolean setCheckOutInfo (CheckOutPO checkOutInfo);
	
	public RoomInfoPO getRemainRoomInfo(String hotelID);
	
	public boolean setRemainRoomInfo(RoomInfoPO remainRoomInfoPO);
	
	public boolean add (HotelPO hotelInfoPO);
}
