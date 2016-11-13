package po;

import java.time.LocalDate;

import utilities.PromotionType;

public class HotelPromotionPO extends PromotionPO{

	//	折扣酒店编号
	private String hotelID;

	public HotelPromotionPO(PromotionType promotionType, String hotelID, double discount,
			LocalDate startDate, LocalDate endDate) {
		super(promotionType, discount, startDate, endDate);
		this.hotelID = hotelID;
	}
	
	public String getHotelID() {
		return hotelID;
	}
	
}
