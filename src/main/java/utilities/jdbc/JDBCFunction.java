package utilities.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCFunction {

//	private String insertSql = "insert into";
//	private String selectSql = "select * from";
//	private String deleteSql = "delete from";
//	private String updateSql = "update";
	private Connection conn = JDBCUtil.getConnection();
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	
	
	public void insert(String tableName){
		
	}
	
	public void delete(String tableName){
		
	}
	
	public void select(String tableName){
		
	}
	
	public void update(String tableName){
		
	}
}
