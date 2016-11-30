package dataHelperImpl;

import dataHelper.AddressDataHelper;
import dataHelper.CreditDataHelper;
import dataHelper.DataFactory;
import dataHelper.GuestDataHelper;
import dataHelper.HotelWorkerDataHelper;
import dataHelper.MarketDataHelper;
import dataHelper.OrderDataHelper;
import dataHelper.WebManagerDataHelper;
import dataHelper.WebMarketerDataHelper;

/**
 * 
 * @author charles
 * lastChangedBy charles
 * updateTime 2016/11/30
 * 
 * 以工厂的方式得到每个DataHelper的实例
 * Factory 单例化
 */
public final class DataFactoryImpl implements DataFactory {

	private static DataFactory dataFactory = new DataFactoryImpl();
	
	private AddressDataHelper addressDataHelper = new AddressDataHelperImpl(); 
	
	private CreditDataHelper creditDataHelper = new CreditDataHelperImpl();
	
	private GuestDataHelper guestDataHelper = new GuestDataHelperImpl();
	
	private HotelWorkerDataHelper hotelWorkerDataHelper = new HotelWorkerDataHelperImpl();
	
	private MarketDataHelper marketDataHelper = new MarketDataHelperImpl();
	
	private OrderDataHelper orderDataHelper = new OrderDataHelperImpl();
	
	private WebManagerDataHelper webManagerDataHelper = new WebManagerDataHelperImpl();
	
	private WebMarketerDataHelper webMarketerDataHelper = new WebMarketerDataHelperImpl();
	
	/**
	 * @author charles
	 * @lastChangedBy charles
	 * @updateTime 2016/11/30
	 * 
	 * 为了单例化，私有化构造方法
	 */
	private DataFactoryImpl() {	

	}
	
	/**
	 * @author charles
	 * @lastChangedBy charles
	 * @updateTime 2016/11/30
	 * @return 单例化的DataFactory
	 * 
	 * 单例化，提供访问唯一对象的接口
	 */
	public static DataFactory getInstance() {
		return dataFactory;
	}
	
	/**
	 * @author charles
	 * @lastChangedBy charles
	 * @updateTime 2016/11/30
	 * @return 单例化的AddressDataHelper
	 */
	@Override
	public AddressDataHelper getAddressDataHelper() {
		return addressDataHelper;
	}

	/**
	 * @author charles
	 * @lastChangedBy charles
	 * @updateTime 2016/11/30 
	 * @return 单例化的CreditDataHelper
	 */
	@Override
	public CreditDataHelper getCreditDataHelper() {
		return creditDataHelper;
	}

	/**
	 * 
	 * @return 单例化的GuestDataHelper
	 */
	@Override
	public GuestDataHelper getGuestDataHelper() {
		return guestDataHelper;
	}

	/**
	 * @author charles
	 * @lastChangedBy charles
	 * @updateTime 2016/11/30
	 * @return 单例化的HotelWorkerDataHelper
	 */
	@Override
	public HotelWorkerDataHelper getHotelWorkerDataHelper() {
		return hotelWorkerDataHelper;
	}

	/**
	 * @author charles
	 * @lastChangedBy charles
	 * @updateTime 2016/11/30
	 * @return 单例化的MarketDataHelper
	 */
	@Override
	public MarketDataHelper getMarketDataHelper() {
		return marketDataHelper;
	}

	/**
	 * @author charles
	 * @lastChangedBy charles
	 * @updateTime 2016/11/30
	 * @return 单例化的OrderDataHelper
	 */
	@Override
	public OrderDataHelper getOrderDataHelper() {
		return orderDataHelper;
	}

	/**
	 * @author charles
	 * @lastChangedBy charles
	 * @updateTime 2016/11/30
	 * @return 单例化的WebManagerDataHelper
	 */
	@Override
	public WebManagerDataHelper getWebManagerDataHelper() {
		return webManagerDataHelper;
	}

	/**
	 * @author charles
	 * @lastChangedBy charles
	 * @updateTime 2016/11/30
	 * @return 单例化的WebMarketerDataHelper
	 */
	@Override
	public WebMarketerDataHelper getWebMarketerDataHelper() {
		return webMarketerDataHelper;
	}

}
