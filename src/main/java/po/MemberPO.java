package po;

import java.time.LocalDate;

public class MemberPO {
	
	//	用户编号	
	private String guestID;
	
	//	会员生日
	private LocalDate birthday;
	
	//	会员企业名称
	private String enterprise;
	
	public MemberPO(String guestID, LocalDate birthday, String enterprise) {
		super();
		this.guestID = guestID;
		this.birthday = birthday;
		this.enterprise = enterprise;
	}
	
	public String getGuestID() {
		return guestID;
	}
	
	public LocalDate getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	
	public String getEnterprise() {
		return enterprise;
	}
	public void setEnterprise(String enterprise) {
		this.enterprise = enterprise;
	}	

}
