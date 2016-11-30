package dataHelperImpl;

import java.util.List;

import dataHelper.AddressDataHelper;
import po.AddressPO;

//import java.sql.Connection;


public class AddressDataHelperImpl implements AddressDataHelper{

//	private Connection conn;
	
//	private static AddressDataHelperImpl addressHelper;
	
	private AddressDataHelperImpl(){
//		this.conn = JDBCUtil.getConnection();
	}

	public List<String> getCity() {
		return null;
	}

	public List<AddressPO> getCycle(String city) {
		return null;
	}

	public double getDiscout(String city, String cycle) {
		return 0;
	}

	public List<AddressPO> getAll() {
		return null;
	}

	public void close() {
		
	}

}
