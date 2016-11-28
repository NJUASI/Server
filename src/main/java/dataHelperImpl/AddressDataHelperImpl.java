package dataHelperImpl;

//import java.sql.Connection;

import dataHelper.DataHelper;
import dataHelper.GetAllDataHelper;
//import po.AddressPO;
//import utilities.JDBCUtil;

public class AddressDataHelperImpl implements DataHelper, GetAllDataHelper{

//	private Connection conn;
	
//	private static AddressDataHelperImpl addressHelper;
	
	private AddressDataHelperImpl(){
//		this.conn = JDBCUtil.getConnection();
	}

	public Object getAll(Object object) {
//		String city = (String)object;
//		String selectAllSql="SELECT city, cycle FROM 'address' where city = ?";
		return null;
	}				

	public Object add(Object object) {
//		AddressPO addressPO = (AddressPO)object;
//		String insertSql="";
		return null;
	}

	public Object modify(Object object) {
//		AddressPO addressPO = (AddressPO)object;
//		String updateSql="";
		return null;
	}

	public Object getSingle(Object object) {
//		String selectSingleSql="";
		return null;
	}

	@Override
	public Object getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

}
