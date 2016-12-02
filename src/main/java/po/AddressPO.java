package po;

import java.io.Serializable;

public class AddressPO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3626389844005279945L;

	//	酒店所属城市
	private String city;
	
	//	酒店商圈
	private String circle;
	
	// 折扣
	private Double discount;
	
	public AddressPO(String city, String circle,Double discout) {
		this.city = city;
		this.circle = circle;
		this.discount = discout;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discout) {
		this.discount = discout;
	}

	public String getCircle() {
		return circle;
	}
}