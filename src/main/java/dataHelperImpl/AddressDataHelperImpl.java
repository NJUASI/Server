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
import utilities.ResultMessage;

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
	public AddressDataHelperImpl() {
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
		return this.deletDuplicate(result);
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
	 * @param discout 需要修改的折扣
	 * @param city  城市
	 * @param cycle 商圈
	 * @return ResultMessage 是否成功修改折扣
	 */
	public ResultMessage modifyDiscout(final double discout, final String city, final String cycle) {
		sql = "UPDATE address SET address.discout = ? WHERE address.city = ? AND address.cycle = ?;";

		try {
			ps = conn.prepareStatement(sql);
			ps.setDouble(1, discout);
			ps.setString(2, city);
			ps.setString(3, cycle);

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

	/**
	 * @author 董金玉
	 * @lastChangedBy 董金玉
	 * @updateTime 2016/11/30
	 * @param list 含有重复字符串的list
	 * @return List<String> 去除重复字符串的list
	 */
	private List<String> deletDuplicate(List<String> list) {

		for (int i = 0; i < list.size() - 1;) {
			if (list.get(i).equals(list.get(i + 1))) {
				list.remove(i + 1);
			} else {
				i++;
			}
		}
		return list;
	}
}
