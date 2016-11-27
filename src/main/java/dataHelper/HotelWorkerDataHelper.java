package dataHelper;

import java.util.List;

import po.HotelWorkerPO;
import utilities.ResultMessage;

public interface HotelWorkerDataHelper {
	
	public HotelWorkerPO getSingle(String hotelWorkerID);

	public List<HotelWorkerPO> getAll();

	public ResultMessage add(HotelWorkerPO newHotelWorkerPO);

	public ResultMessage modify(HotelWorkerPO hotelWorkerPO);

	public ResultMessage init();
	
}
