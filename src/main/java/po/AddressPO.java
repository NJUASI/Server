package po;

import java.io.Serializable;

public class AddressPO implements Serializable{

	private static final long serialVersionUID = 3626389844005279945L;

	//	酒店所属城市
	private String city;
	
	//	酒店商圈
	private String cycle;
	
	// 折扣
	private Double discout;
	
	public AddressPO(String city, String cycle,Double discout) {
		this.city = city;
		this.cycle = cycle;
		this.discout = discout;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCycle() {
		return cycle;
	}

	public void setCycle(String cycle) {
		this.cycle = cycle;
	}

	public Double getDiscout() {
		return discout;
	}

	public void setDiscout(Double discout) {
		this.discout = discout;
	}
}