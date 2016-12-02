package po;

import utilities.PromotionType;

public class HotelFixedPromotionPO {

	private String hotelID;
	private PromotionType promotionType;
	private double discount;

	public String getHotelID() {
		return hotelID;
	}

	public void setHotelID(String hotelID) {
		this.hotelID = hotelID;
	}

	public PromotionType getPromotionType() {
		return promotionType;
	}

	public void setPromotionType(PromotionType prmotionType) {
		this.promotionType = prmotionType;
	}

	public double getDiscout() {
		return discount;
	}

	public void setDiscout(double discout) {
		this.discount = discout;
	}
	
}
