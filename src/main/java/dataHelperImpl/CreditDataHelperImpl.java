package dataHelperImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import dataHelper.CreditDataHelper;
import po.CreditPO;
import utilities.JDBCUtil;
import utilities.ResultMessage;

/**
 * 
 * @author 董金玉 lastChangedBy 董金玉 updateTime 2016/11/30
 *
 */
public class CreditDataHelperImpl implements CreditDataHelper {

	private Connection conn;

	private PreparedStatement ps;

	private ResultSet rs;
	
	private String sql;
	

	/**
	 * @author 董金玉
	 * @lastChangedBy 董金玉
	 * @updateTime 2016/11/30 构造函数，初始化成员变量conn
	 */
	public CreditDataHelperImpl() {
		this.conn = JDBCUtil.getConnection();
	}
	
	/**
	 * @author 董金玉
	 * @lastChangedBy 董金玉
	 * @updateTime 2016/11/30
	 * @param guestID 客户ID
	 * @return List<CreditPO> 所有creditInfo载体
	 */
	public List<CreditPO> getAll(final String guestID) {
		sql = "SELECT credit.time, credit.orderID, credit.previousCredit, "
				+ "credit.afterCredit,credit.reason FROM credit WHERE credit.guestID = ?";
		final List<CreditPO> result = new ArrayList<CreditPO>();
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, guestID);
			rs = ps.executeQuery();
			
			while (rs.next()) {
				final CreditPO creditPO = new CreditPO();
				creditPO.setGuestID(guestID);
				creditPO.setTime((LocalDateTime) rs.getObject(1));
				creditPO.setOrderID(rs.getString(2));
				creditPO.setPreCredit(rs.getDouble(3));
				creditPO.setCredit(rs.getDouble(4));
				creditPO.setReason(rs.getString(5));
				
				result.add(creditPO);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * @author 董金玉
	 * @lastChangedBy 董金玉
	 * @updateTime 2016/11/30
	 * @param creditPO creditInfo载体
	 * @return ResultMessage 是否成功添加creditInfo
	 */
	public ResultMessage add(final CreditPO creditPO) {
		sql = "INSERT INTO credit(credit.guestID,credit.orderID,credit.time,"
				+ "credit.previousCredit,credit.afterCredit,credit.reason) "
				+ "VALUES(?,?,?,?,?,?)";
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, creditPO.getGuestID());
			ps.setString(2, creditPO.getOrderID());
			ps.setObject(3, creditPO.getTime());
			ps.setDouble(4, creditPO.getPreCredit()); 
			ps.setDouble(5, creditPO.getCredit());
			ps.setString(6, creditPO.getReason());
			
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
			return ResultMessage.FAIL;
		}
		return ResultMessage.SUCCESS;
	}

	/**
	 * @author 董金玉
	 * @lastChangedBy 董金玉
	 * @updateTime 2016/11/30
	 * @param
	 * @return
	 */
	public void close() {
		JDBCUtil.close(rs, ps, conn);
		this.sql = null;
	}

	
}
