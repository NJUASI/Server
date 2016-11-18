package po;

import java.io.Serializable;

public class EvaluationPO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7207366321921809864L;

	//	订单编号
	private String orderID;
	
	//	评分
	private double score;
	
	//	评价
	private String comment;
	
	public EvaluationPO(String orderID, double score, String comment) {
		this.orderID = orderID;
		this.score = score;
		this.comment = comment;
	}

	public String getOrderID() {
		return orderID;
	}
	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}

	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
}
