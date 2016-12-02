package dataHelper;

/**
 * 
 * @author charles
 * lastChangedBy charles
 * updateTime 2016/11/30
 * 
 * 以工厂的方式得到每个DataHelper的实例
 * Factory 单例化
 */
public interface DataFactory {

	/**
	 * @author charles
	 * @lastChangedBy charles
	 * @updateTime 2016/11/30
	 * @return 单例化的AddressDataHelper
	 */
	AddressDataHelper getAddressDataHelper();
	
	/**
	 * @author charles
	 * @lastChangedBy charles
	 * @updateTime 2016/11/30
	 * @return 单例化的CreditDataHelper
	 */
	CreditDataHelper getCreditDataHelper();
	
	/**
	 * @author charles
	 * @lastChangedBy charles
	 * @updateTime 2016/11/30
	 * @return 单例化的GuestDataHelper
	 */
	GuestDataHelper getGuestDataHelper();
	
	/**
	 * @author charles
	 * @lastChangedBy charles
	 * @updateTime 2016/11/30
	 * @return 单例化的HotelWorkerDataHelper
	 */
	HotelWorkerDataHelper getHotelWorkerDataHelper();
	
	/**
	 * @author charles
	 * @lastChangedBy charles
	 * @updateTime 2016/11/30
	 * @return 单例化的MarketDataHelper
	 */
	MarketDataHelper getMarketDataHelper();
	
	/**
	 * @author charles
	 * @lastChangedBy charles
	 * @updateTime 2016/11/30
	 * @return 单例化的OrderDataHelper
	 */
	OrderDataHelper getOrderDataHelper();
	
	/**
	 * @author charles
	 * @lastChangedBy charles
	 * @updateTime 2016/11/30
	 * @return 单例化的WebManagerDataHelper
	 */
	WebManagerDataHelper getWebManagerDataHelper();
	
	/**
	 * @author charles
	 * @lastChangedBy charles
	 * @updateTime 2016/11/30
	 * @return 单例化的WebMarketerDataHelper
	 */
	WebMarketerDataHelper getWebMarketerDataHelper();
}
