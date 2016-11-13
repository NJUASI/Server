package dataService.hotelWorkerDataService;

import java.util.List;

import po.HotelWorkerPO;
import utilities.ResultMessage;

public interface HotelWorkerDataService {

	public HotelWorkerPO getSingle (String hotelWorkerID);
	
	public List<HotelWorkerPO> getAllHotelWorker();
	
	public ResultMessage add(HotelWorkerPO newHotelWorkerPO);

	public ResultMessage modify (HotelWorkerPO hotelWorkerPO);
	
	public ResultMessage init();


}
