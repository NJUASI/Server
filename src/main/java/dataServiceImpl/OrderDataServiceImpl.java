package dataServiceImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.time.LocalDate;
import java.util.List;

import dataHelper.DataFactory;
import dataHelper.OrderDataHelper;
import dataHelperImpl.DataFactoryImpl;
import dataService.orderDataService.OrderDataService;
import po.OrderGeneralPO;
import po.OrderPO;
import utilities.ResultMessage;

/**
 * 
 * @author charles
 * lastChangedBy charles
 * updateTime 2016/11/29
 *
 */
public class OrderDataServiceImpl extends UnicastRemoteObject implements OrderDataService {

	private static final long serialVersionUID = 3434060152387200042L;
	
	private static OrderDataHelper orderDataHelper;
	
	/**
	 * @author charles
	 * @lastChangedBy charles
	 * @updateTime 2016/11/29
	 * @throws RemoteException RMI
	 */
	public OrderDataServiceImpl() throws RemoteException {
		if (orderDataHelper == null) {
			init();
		}
	}

	/**
	 * 
	 * @author charles
	 * @lastChangedBy charles
	 * @updateTime 2016/11/27
	 * 
	 * 单例初始化 orderDataHelper
	 */
	private void init() {
		DataFactory dataFactory = DataFactoryImpl.getInstance();
		orderDataHelper = dataFactory.getOrderDataHelper();
	}
	
	/**
	 * 
	 * @author charles
	 * @lastChangedBy charles
	 * @updateTime 2016/11/27
	 * @param order 从逻辑层层传下来的Order载体
	 * @return 客户是否成功创建此订单
	 * @throws RemoteException RMI
	 */
	@Override
	public ResultMessage createOrder(final OrderPO order) throws RemoteException {
		return orderDataHelper.add(order);
	}

	/**
	 * @author charles
	 * @lastChangedBy charles
	 * @updateTime 2016/11/27
	 * @param orderID 酒店工作人员当前需要执行订单的订单号
	 * @return 酒店工作人员是否成功执行此订单
	 * @throws RemoteException RMI
	 */
	@Override
	public ResultMessage executeOrder(final String orderID) throws RemoteException {
		return null;
	}

	/**
	 * @author charles
	 * @lastChangedBy charles
	 * @updateTime 2016/11/27
	 * @param orderID 网站营销人员当前需要撤销的异常订单的订单号
	 * @return 网站营销人员是否成功撤销此异常订单
	 * @throws RemoteException RMI
	 */
	@Override
	public ResultMessage undoAbnormalOrder(final String orderID) throws RemoteException {
		return null;
	}

	/**
	 * @author charles
	 * @lastChangedBy charles
	 * @updateTime 2016/11/27
	 * @param orderID 客户当前需要撤销的正常订单的订单号
	 * @return 客户是否成功撤销此正常订单
	 * @throws RemoteException RMI
	 */
	@Override
	public ResultMessage undoNormalOrder(final String orderID) throws RemoteException {
		return null;
	}
	
	/**
	 * @author charles
	 * @lastChangedBy charles
	 * @updateTime 2016/11/27
	 * @param orderID 用户当前需要查看的订单的订单号
	 * @return 此被需要订单的详情载体
	 * @throws RemoteException RMI
	 */
	@Override
	public OrderPO getOrderDetail(final String orderID) throws RemoteException {
		return null;
	}

	/**
	 * @author charles
	 * @lastChangedBy charles
	 * @updateTime 2016/11/27
	 * @param guestID 客户要查看个人所有订单时，客户的编号
	 * @return 客户个人所有订单
	 * @throws RemoteException RMI
	 */
	@Override
	public List<OrderGeneralPO> getAllGuestOrderGeneral(final String guestID) throws RemoteException {
		return null;
	}

	/**
	 * @author charles
	 * @lastChangedBy charles
	 * @updateTime 2016/11/27
	 * @param hotelID 酒店要查看本酒店所有订单时，酒店的编号
	 * @return 此酒店所有的所有订单
	 * @throws RemoteException RMI
	 */
	@Override
	public List<OrderGeneralPO> getAllHotelOrderGeneral(final String hotelID) throws RemoteException {
		return null;
	}

	/**
	 * @author charles
	 * @lastChangedBy charles
	 * @updateTime 2016/11/27
	 * @param date 网站营销人员撤销异常订单时输入的指定日期
	 * @return 网站营销人员需要查看的当天所有的异常订单
	 * @throws RemoteException RMI
	 */
	@Override
	public List<OrderGeneralPO> getAllAbnormalOrderGeneral(final LocalDate date) throws RemoteException {
		return null;
	}

	/**
	 * @author charles
	 * @lastChangedBy charles
	 * @updateTime 2016/11/27
	 * @return 网站营销人员需要查看的所有的异常订单，按倒序排列
	 * @throws RemoteException RMI
	 */
	@Override
	public List<OrderGeneralPO> getAllAbnormalOrderGeneral() throws RemoteException {
		return null;
	}

	/**
	 * @author charles
	 * @lastChangedBy charles
	 * @updateTime 2016/11/29
	 * @param date 网站营销人员查看未执行订单时输入的指定日期
	 * @return 网站营销人员需要查看的当天所有的未执行订单
	 * @throws RemoteException RMI
	 */
	@Override
	public List<OrderGeneralPO> getAllUnexecutedOrderGeneral(final LocalDate date) throws RemoteException {
		return null;
	}
	
	/**
	 * @author charles
	 * @lastChangedBy charles
	 * @updateTime 2016/11/27
	 * @param guestID 客户需要查看个人定过的酒店时依照的客户个人编号
	 * @return 客户定过的酒店列表
	 * @throws RemoteException RMI
	 */
	@Override
	public List<String> getBookedHotels(final String guestID) throws RemoteException {
		return null;
	}

}
