package po;

public class WebManagerPO {
	
	//	管理人员编号
	private String userID;
	
	//	密码
	private String password;
	
	public WebManagerPO(String userID, String password) {
		super();
		this.userID = userID;
		this.password = password;
	}
	
	
	public String getUserID() {
		return userID;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


}
