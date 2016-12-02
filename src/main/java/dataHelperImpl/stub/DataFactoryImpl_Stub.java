package dataHelperImpl.stub;

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
public final class DataFactoryImpl_Stub implements DataFactory {

	private static DataFactory dataFactory = new DataFactoryImpl_Stub();
	
	private AddressDataHelper addressDataHelper = new AddressDataHelperImpl_Stub(); 
	
	private CreditDataHelper creditDataHelper = new CreditDataHelperImpl_Stub();
	
	private GuestDataHelper guestDataHelper = new GuestDataHelperImpl_Stub();
	
	private HotelWorkerDataHelper hotelWorkerDataHelper = new HotelWorkerDataHelperImpl_Stub();
	
	private MarketDataHelper marketDataHelper = new MarketDataHelperImpl_Stub();
	
	private OrderDataHelper orderDataHelper = new OrderDataHelperImpl_Stub();
	
	private WebManagerDataHelper webManagerDataHelper = new WebManagerDataHelperImpl_Stub();
	
	private WebMarketerDataHelper webMarketerDataHelper = new WebMarketerDataHelperImpl_Stub();
	
	/**
	 * @author charles
	 * @lastChangedBy charles
	 * @updateTime 2016/11/30
	 * 
	 * 为了单例化，私有化构造方法
	 */
	private DataFactoryImpl_Stub() {	

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
