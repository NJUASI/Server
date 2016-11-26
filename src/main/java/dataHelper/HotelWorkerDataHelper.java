package dataHelper;

import java.util.List;

import po.HotelWorkerPO;
import utilities.ResultMessage;

public interface HotelWorkerDataHelper {
	
	public HotelWorkerPO getSingleHotelWorker(String hotelWorkerID);

	public List<HotelWorkerPO> getAllHotelWorker();

	public ResultMessage add(HotelWorkerPO newHotelWorkerPO);

	public ResultMessage modify(HotelWorkerPO hotelWorkerPO);

	public ResultMessage initHotelWorker();
	
}
