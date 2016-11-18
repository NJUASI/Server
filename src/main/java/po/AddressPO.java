package po;

import java.io.Serializable;

public class AddressPO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3626389844005279945L;

	//	酒店所属城市
	public String city;
	
	//	酒店商圈
	public String cycle;
	
	public AddressPO(String city, String cycle) {
		this.city = city;
		this.cycle = cycle;
	}
}