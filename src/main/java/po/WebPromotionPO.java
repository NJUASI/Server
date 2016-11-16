package po;

import java.time.LocalDate;

import utilities.PromotionType;

public class WebPromotionPO extends PromotionPO{

	//	指定商圈
	private String cycle;
	
	public WebPromotionPO(PromotionType promotionType, String cycle, double discount, 
			LocalDate startDate, LocalDate endDate) {
		super(promotionType, discount, startDate, endDate);
		this.cycle = cycle;
	}

	public String getCycle() {
		return cycle;
	}

	public void setCycle(String cycle) {
		this.cycle = cycle;
	}
	
}
