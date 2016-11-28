package dataHelperImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dataHelper.DataHelper;
import dataHelper.GetAllDataHelper;
import po.GuestPO;
import utilities.JDBCUtil;
import utilities.ResultMessage;

/**
 * 
 * @author 董金玉
 * lastChangedBy 董金玉
 * updateTime 2016/11/28
 *
 */
public class GuestDataHelperImpl implements DataHelper, GetAllDataHelper{

	private Connection conn;
	
	private PreparedStatement ps;
	
	private ResultSet rs;
	
	/**
	 * @author 董金玉
	 * @lastChangedBy 董金玉
	 * @updateTime 2016/11/28
	 * 构造函数，初始化成员变量conn
	 */
	public GuestDataHelperImpl(){
		this.conn = JDBCUtil.getConnection(); 
	}
	
	/**
	 * @author 董金玉
	 * @lastChangedBy 董金玉
	 * @updateTime 2016/11/28
	 * @param 
	 * @return Object 获取所有guestInfo载体
	 */
	public Object getAll() {
		String sql = "SELECT * FROM guest"; //sql语句，挑选所有guest数据
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>(); //封装多条数据
		
		try {
			ps = conn.prepareStatement(sql); //获取数据的准备工作
			rs = ps.executeQuery(); //得到执行语句后的结果集合
			
			while(rs.next()){
				Map<String,Object> result = new HashMap<String,Object>(); //封装一条数据
				result.put("guestID", rs.getObject(1)); //1-8的硬编码对应表中的表项
				result.put("birthday", rs.getObject(2));
				result.put("enterPrise", rs.getObject(3));
				result.put("name", rs.getObject(4));
				result.put("nickName", rs.getObject(5));
				result.put("password", rs.getObject(6));
				result.put("credit", rs.getObject(7));
				result.put("phone", rs.getObject(8));
				list.add(result);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	/**
	 * @author 董金玉
	 * @lastChangedBy 董金玉
	 * @updateTime 2016/11/28
	 * @param Object 应为guestPO-guestInfo载体
	 * @return Object guestPO是否成功添加到数据库中
	 */
	public Object add(Object object) {
		GuestPO guestPO = (GuestPO)object;
		String sql = "INSERT INTO guest(guest.guestID,guest.birthday,guest.enterprise,"
				+ "guest.`name`,guest.nickName,guest.`password`,"
				+ "guest.credit,guest.phone))"
				+ "values(?,?,?,?,?,?,?,?)";
		
		try {
			ps = conn.prepareStatement(sql); //插入数据的准备工作，1-8对应sql语句中问号的顺序
			ps.setString(1, guestPO.getGuestID());
			ps.setObject(2, guestPO.getBirthday()); //在使用setObject方法是必须注意，
			ps.setString(3, guestPO.getEnterprise()); //我们应该使用对应数据类型
			ps.setString(4, guestPO.getName()); //虽然Object可以替代所有该set方法，但会影响效率
			ps.setString(5, guestPO.getNickName()); //所以尽量使用对应数据类型的set方法
			ps.setString(6, guestPO.getPassword());
			ps.setDouble(7, guestPO.getCredit());
			ps.setString(8, guestPO.getPhone());
			
			ps.execute(); //执行sql语句，返回值为boolean
		} catch (SQLException e) {
			e.printStackTrace();
			return ResultMessage.FAIL;
		}
		 return ResultMessage.SUCCESS;
	}

	
	/**
	 * @author 董金玉
	 * @lastChangedBy 董金玉
	 * @updateTime 2016/11/28
	 * @param Object 应为guestPO-guestInfo载体
	 * @return Object guestPO是否成功修改数据库中的指定guestInfo
	 */
	public Object modify(Object object) {
		GuestPO guestPO = (GuestPO)object;
		String sql = "UPDATE guest SET guest.birthday= ?,guest.enterprise = ?,guest.`name`= ?,guest.nickName = ?,"
                     +"guest.`password` = ?,guest.credit = ?,guest.phone = ? "
                     + "WHERE guest.guestID = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setObject(1, guestPO.getBirthday());
			ps.setString(2, guestPO.getEnterprise());
			ps.setString(3, guestPO.getName());
			ps.setString(4, guestPO.getNickName());
			ps.setString(5, guestPO.getPassword());
			ps.setDouble(6, guestPO.getCredit());
			ps.setString(7, guestPO.getPhone());
			ps.setString(8, guestPO.getGuestID());
			
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
	 * @updateTime 2016/11/28
	 * @param Object 应为guestID
	 * @return Object 据库中的指定guestInfo载体
	 */
	public Object getSingle(Object object) {
		String guestID  = (String)object;
		GuestPO guestPO = null;
		String sql = "SELECT guest.birthday,guest.enterPrise,guest.`name`,"
				+ "guest.nickName,guest.`password`,guest.credit,guest.phone "
				+ "FROM guest WHERE guest.guestID = ?"; //获取一条数据根据guestID
		
		try {
			ps = conn.prepareStatement(sql); //该处与getAll方法相同
			ps.setString(1, guestID);
			rs = ps.executeQuery();
			
			if(rs!=null){
				guestPO  = new GuestPO();
				guestPO.setGuestID(guestID);
				guestPO.setBirthday((LocalDate)rs.getObject(1)); //此处硬编码1-7对应sql语句中元素
				guestPO.setEnterprise(rs.getString(2));
				guestPO.setName(rs.getString(3));
				guestPO.setNickName(rs.getString(4));
				guestPO.setPassword(rs.getString(5));
				guestPO.setCredit(rs.getDouble(6));
				guestPO.setPhone(rs.getString(7));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
		return guestPO;
	}
	
	/**
	 * @author 董金玉
	 * @lastChangedBy 董金玉
	 * @updateTime 2016/11/28
	 * @param 
	 * @return 
	 */
	public void close() {  //当决定抛弃该对象的时候，调用该方法
		JDBCUtil.close(rs, ps, conn);
	}

	/**
	 * @author 董金玉
	 * @lastChangedBy 董金玉
	 * @updateTime 2016/11/28
	 * @param 
	 * @return 
	 * 尚未实现，根据需要进行实现
	 */
	public Object getAll(Object object) {  //根据是否想要有筛选，实现该方法
		return null;
	}

}
