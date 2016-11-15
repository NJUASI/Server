package po;

import java.time.LocalDate;

import utilities.PromotionType;

public abstract class PromotionPO {
	
	//	折扣类型
	private PromotionType promotionType;
	
	//	折扣率
	private double discount;
	
	//	开始日期
	private LocalDate startDate;
	
	//	结束日期
	private LocalDate endDate;
	
	public PromotionPO(PromotionType promotionType, double discount, LocalDate startDate, LocalDate endDate) {
		this.promotionType = promotionType;
		this.discount = discount;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	public PromotionType getPromotionType() {
		return promotionType;
	}
	
	public double getDiscount() {
		return discount;
	}
	
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	public LocalDate getStartDate() {
		return startDate;
	}
	
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	
	public LocalDate getEndDate() {
		return endDate;
	}
	
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

}
