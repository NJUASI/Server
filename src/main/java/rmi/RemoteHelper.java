package rmi;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import data.guestData.GuestDataServiceImpl;
import data.hotelData.HotelDataServiceImpl;
import data.hotelWorkerData.HotelWorkerDataServiceImpl;
import data.marketData.MarketDataServiceImpl;
import data.orderData.OrderDataServiceImpl;
import data.promotionData.PromotionDataServiceImpl;
import data.webManagerData.WebManagerDataServiceImpl;
import data.webMarketerData.WebMarketerDataServiceImpl;

public class RemoteHelper {

	String url = "rmi://localhost:8888/";
	
	public RemoteHelper() {
		initServer();
	}
	
	public void initServer(){
		try {
			System.out.println("link");
			LocateRegistry.createRegistry(8888);
			Naming.bind(url+"GuestDataService", new GuestDataServiceImpl());
			Naming.bind(url+"HotelDataService", new HotelDataServiceImpl());
			Naming.bind(url+"HotelWorkerDataService", new HotelWorkerDataServiceImpl());
			Naming.bind(url+"MarketDataService", new MarketDataServiceImpl());
			Naming.bind(url+"OrderDataService", new OrderDataServiceImpl());
			Naming.bind(url+"PromotionDataService", new PromotionDataServiceImpl());
			Naming.bind(url+"WebManagerDataService", new WebManagerDataServiceImpl());
			Naming.bind(url+"WebMarketerDataService", new WebMarketerDataServiceImpl());
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (AlreadyBoundException e) {
			e.printStackTrace();
		}
	}
}
