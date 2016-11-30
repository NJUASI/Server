package dataHelperImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dataHelper.AddressDataHelper;
import po.AddressPO;
import utilities.JDBCUtil;

/**
 * 
 * @author 董金玉 lastChangedBy 董金玉 updateTime 2016/11/30
 *
 */
public class AddressDataHelperImpl implements AddressDataHelper {

	private Connection conn;

	private PreparedStatement ps;

	private ResultSet rs;
	
	private String sql;

	/**
	 * @author 董金玉
	 * @lastChangedBy 董金玉
	 * @updateTime 2016/11/30 构造函数，初始化成员变量conn
	 */
	private AddressDataHelperImpl() {
		this.conn = JDBCUtil.getConnection();
	}

	/**
	 * @author 董金玉
	 * @lastChangedBy 董金玉
	 * @updateTime 2016/11/30
	 * @return List<String> 所有城市
	 */
	public List<String> getCity() {
		sql = "SELECT address.city FROM `address`";
		final List<String> result = new ArrayList<String>();

		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();

			while (rs.next()) {
				result.add(rs.getString(1));
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
	 * @param city 城市
	 * @return List<String> 指定城市的所有商圈
	 */
	public List<String> getCycle(final String city) {
		sql = "SELECT address.cycle FROM `address` WHERE city = ?";
		final List<String> result = new ArrayList<String>();
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, city);
			rs = ps.executeQuery();
			
			while (rs.next()) {
				result.add(rs.getString(1));
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
	 * @param city 城市
	 * @param cycle 商圈
	 * @return double 指定城市和商圈的折扣
	 */
	public double getDiscout(final String city, final String cycle) {
		sql = "SELECT address.discout FROM `address` WHERE city = ? AND cycle = ?";
		double discout = 0;
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, city);
			ps.setString(2, cycle);
			rs = ps.executeQuery();
			
			if (rs.next()) {
				discout = rs.getDouble(1);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return discout;
	}

	/**
	 * @author 董金玉
	 * @lastChangedBy 董金玉
	 * @updateTime 2016/11/30
	 * @return List<AddressPO> 所有addressInfo载体
	 */
	public List<AddressPO> getAll() {
		sql = "SELECT * FROM address";
		final List<AddressPO> result = new ArrayList<AddressPO>();
		
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while (rs.next()) {
				final AddressPO addressPO = new AddressPO(rs.getString(1), rs.getString(2), rs.getDouble(3));
				result.add(addressPO);
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
	 * @param
	 * @return
	 */
	public void close() {
		JDBCUtil.close(rs, ps, conn);
		this.sql = null;
	}

}
