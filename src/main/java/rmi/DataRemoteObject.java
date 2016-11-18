package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import data.guestData.GuestDataServiceImpl;
import data.hotelData.HotelDataServiceImpl;
import data.marketData.MarketDataServiceImpl;
import data.orderData.OrderDataServiceImpl;
import data.promotionData.PromotionDataServiceImpl;
import data.webManagerData.WebManagerDataServiceImpl;
import data.webMarketerData.WebMarketerDataServiceImpl;
import dataService.guestDataService.GuestDataService;
import dataService.hotelDataService.HotelDataService;
import dataService.hotelWorkerDataService.HotelWorkerDataService;
import dataService.marketDataService.MarketDataService;
import dataService.orderDataService.OrderDataService;
import dataService.promotionDataService.PromotionDataService;
import dataService.webManagerDataService.WebManagerDataService;
import dataService.webMarketerDataService.WebMarketerDataService;
import po.AddressPO;
import po.CheckInPO;
import po.CheckOutPO;
import po.CreditPO;
import po.EvaluationPO;
import po.GuestPO;
import po.HotelGeneralPO;
import po.HotelPO;
import po.HotelPromotionPO;
import po.HotelWorkerPO;
import po.MarketPO;
import po.MemberPO;
import po.OrderGeneralPO;
import po.OrderPO;
import po.RoomInfoPO;
import po.WebManagerPO;
import po.WebMarketerPO;
import po.WebPromotionPO;
import utilities.Operation;
import utilities.ResultMessage;
import utilities.RoomType;

public class DataRemoteObject extends UnicastRemoteObject implements HotelDataService, OrderDataService, 
	MarketDataService, PromotionDataService, GuestDataService, HotelWorkerDataService,
	WebMarketerDataService, WebManagerDataService{

	private static final long serialVersionUID = 4118320068780099430L;
	
	private HotelDataService hotelDataService;
	private OrderDataService orderDataService;
	private MarketDataService marketDataService;
	private PromotionDataService promotionDataService;
	private GuestDataService guestDataService;
	private HotelWorkerDataService hotelWorkerDataService;
	private WebMarketerDataService webMarketerDataService;
	private WebManagerDataService webManagerDataService;
	
	
	protected DataRemoteObject() throws RemoteException {
		hotelDataService = new HotelDataServiceImpl();
		orderDataService = new OrderDataServiceImpl();
		marketDataService = new MarketDataServiceImpl();
		promotionDataService = new PromotionDataServiceImpl();
		guestDataService = new GuestDataServiceImpl();
		hotelDataService = new HotelDataServiceImpl();
		webMarketerDataService = new WebMarketerDataServiceImpl();
		webManagerDataService = new WebManagerDataServiceImpl();
	}

	
	
	/**
	 * interfaces for WebManagerDataService
	 * @throws RemoteException 
	 */
	@Override
	public WebManagerPO getSingleWebManager(String webManagerID) throws RemoteException {
		return webManagerDataService.getSingleWebManager(webManagerID);
	}

	@Override
	public List<WebManagerPO> getAllWebManager() throws RemoteException {
		return webManagerDataService.getAllWebManager();
	}

	@Override
	public ResultMessage add(WebManagerPO newWebManagerPO) throws RemoteException {
		return webManagerDataService.add(newWebManagerPO);
	}

	@Override
	public ResultMessage modify(WebManagerPO webManagerPO) throws RemoteException {
		return webManagerDataService.modify(webManagerPO);
	}

	
	
	/**
	 * interfaces for WebMarketerDataService
	 */
	@Override
	public WebMarketerPO getSingleWebMarketer(String webMarketID) throws RemoteException {
		return webMarketerDataService.getSingleWebMarketer(webMarketID);
	}

	@Override
	public List<WebMarketerPO> getAllWebMarketer() throws RemoteException {
		return webMarketerDataService.getAllWebMarketer();
	}

	@Override
	public ResultMessage add(WebMarketerPO newWebMarketerPO) throws RemoteException {
		return webMarketerDataService.add(newWebMarketerPO);
	}

	@Override
	public ResultMessage modify(WebMarketerPO webMarketerPO) throws RemoteException {
		return webMarketerDataService.modify(webMarketerPO);
	}

	@Override
	public ResultMessage initWebMarketer() throws RemoteException {
		return webMarketerDataService.initWebMarketer();
	}

	
	
	/**
	 * interfaces for HotelWorkerDataService
	 */
	@Override
	public HotelWorkerPO getSingleHotelWorker(String hotelWorkerID) throws RemoteException {
		return hotelWorkerDataService.getSingleHotelWorker(hotelWorkerID);
	}

	@Override
	public List<HotelWorkerPO> getAllHotelWorker() throws RemoteException {
		return hotelWorkerDataService.getAllHotelWorker();
	}

	@Override
	public ResultMessage add(HotelWorkerPO newHotelWorkerPO) throws RemoteException {
		return hotelWorkerDataService.add(newHotelWorkerPO);
	}

	@Override
	public ResultMessage modify(HotelWorkerPO hotelWorkerPO) throws RemoteException {
		return hotelWorkerDataService.modify(hotelWorkerPO);
	}

	@Override
	public ResultMessage initHotelWorker() throws RemoteException {
		return hotelWorkerDataService.initHotelWorker();
	}

	
	
	/**
	 * interfaces for GuestDataService
	 */
	@Override
	public GuestPO getSingleGuest(String guestID) throws RemoteException {
		return guestDataService.getSingleGuest(guestID);
	}
	
	@Override
	public List<GuestPO> getAllGuest() throws RemoteException {
		return guestDataService.getAllGuest();
	}

	@Override
	public List<CreditPO> getAllCreditDetail(String guestID) throws RemoteException {
		return guestDataService.getAllCreditDetail(guestID);
	}

	@Override
	public ResultMessage add(GuestPO newGuestPO) throws RemoteException {
		return guestDataService.add(newGuestPO);
	}

	@Override
	public ResultMessage modifyMember(MemberPO memberPO) throws RemoteException {
		return guestDataService.modifyMember(memberPO);
	}

	@Override
	public ResultMessage modify(GuestPO guestPO) throws RemoteException {
		return guestDataService.modify(guestPO);
	}

	
	
	/**
	 * interfaces for PromotionDataService
	 * @throws RemoteException 
	 */
	@Override
	public List<HotelPromotionPO> getHotelPromotions(String hotelWorkerID) throws RemoteException {
		return promotionDataService.getHotelPromotions(hotelWorkerID);
	}

	@Override
	public List<WebPromotionPO> getWebPromotions() throws RemoteException {
		return promotionDataService.getWebPromotions();
	}

	@Override
	public boolean setHotelPromotions(String hotelWorkerID, List<HotelPromotionPO> list) throws RemoteException {
		return promotionDataService.setHotelPromotions(hotelWorkerID, list);
	}

	@Override
	public boolean setWebPromotions(List<WebPromotionPO> list) throws RemoteException {
		return promotionDataService.setWebPromotions(list);
	}

	
	
	/**
	 * interfaces for MarketDataService
	 * @throws RemoteException 
	 */
	@Override
	public List<MarketPO> getMemberFormulation() throws RemoteException {
		return marketDataService.getMemberFormulation();
	}

	@Override
	public ResultMessage setMemberFormulation(List<MarketPO> marketPOList) throws RemoteException {
		return marketDataService.setMemberFormulation(marketPOList);
	}

	
	
	/**
	 * interfaces for OrderDataService
	 * @throws RemoteException 
	 */
	@Override
	public ResultMessage createOrder(OrderPO order) throws RemoteException {
		return orderDataService.createOrder(order);
	}

	@Override
	public ResultMessage executeOrder(String orderID) throws RemoteException {
		return orderDataService.executeOrder(orderID);
	}

	@Override
	public OrderPO getOrderDetail(String orderID) throws RemoteException {
		return orderDataService.getOrderDetail(orderID);
	}

	@Override
	public List<OrderGeneralPO> getAllGuestOrderGeneral(String GuestID) throws RemoteException {
		return orderDataService.getAllGuestOrderGeneral(GuestID);
	}

	@Override
	public List<OrderGeneralPO> getAllHotelOrderGeneral(String GuestID) throws RemoteException {
		return orderDataService.getAllHotelOrderGeneral(GuestID);
	}

	@Override
	public List<OrderGeneralPO> getAllAbnormalOrderGeneral(LocalDate date) throws RemoteException {
		return orderDataService.getAllAbnormalOrderGeneral(date);
	}

	@Override
	public List<OrderGeneralPO> getAllAbnormalOrderGeneral() throws RemoteException {
		return orderDataService.getAllAbnormalOrderGeneral();
	}

	@Override
	public ResultMessage undoAbnormalOrder(String orderID) throws RemoteException {
		return orderDataService.undoAbnormalOrder(orderID);
	}

	@Override
	public ResultMessage undoNormalOrder(String orderID) throws RemoteException {
		return orderDataService.undoNormalOrder(orderID);
	}

	
	
	/**
	 * interfaces for HotelDataService
	 * @throws RemoteException 
	 */
	@Override
	public HotelPO getHotelInfo(String hotelID) throws RemoteException {
		return hotelDataService.getHotelInfo(hotelID);
	}

	@Override
	public ResultMessage setHotelInfo(HotelPO hotelPO) throws RemoteException {
		return hotelDataService.setHotelInfo(hotelPO);
	}

	@Override
	public List<RoomInfoPO> getHotelRoomInfo(String hotelID) throws RemoteException {
		return hotelDataService.getHotelRoomInfo(hotelID);
	}

	@Override
	public ResultMessage setHotelRoomInfo(List<RoomInfoPO> list) throws RemoteException {
		return hotelDataService.setHotelRoomInfo(list);
	}

	@Override
	public ResultMessage setCheckInInfo(CheckInPO checkInPO) throws RemoteException {
		return hotelDataService.setCheckInInfo(checkInPO);
	}

	@Override
	public ResultMessage setCheckOutInfo(CheckOutPO checkOutPO) throws RemoteException {
		return hotelDataService.setCheckOutInfo(checkOutPO);
	}

	@Override
	public List<RoomInfoPO> getRemainRoomInfo(String hotelID) throws RemoteException {
		return hotelDataService.getRemainRoomInfo(hotelID);
	}

	@Override
	public ResultMessage setRemainRoomInfo(String hotelID, Operation operation, Map<RoomType, Integer> roomInfo) throws RemoteException {
		return hotelDataService.setRemainRoomInfo(hotelID, operation, roomInfo);
	}

	@Override
	public ResultMessage add(HotelPO hotelPO) throws RemoteException {
		return hotelDataService.add(hotelPO);
	}

	@Override
	public List<HotelGeneralPO> getHotelList(AddressPO addressPO) throws RemoteException {
		return hotelDataService.getHotelList(addressPO);
	}

	@Override
	public HotelPO getHotelDetail(String hotelID) throws RemoteException {
		return hotelDataService.getHotelDetail(hotelID);
	}

	@Override
	public ResultMessage addEvaluation(EvaluationPO evaluationPO) throws RemoteException {
		return hotelDataService.addEvaluation(evaluationPO);
	}

	
}
