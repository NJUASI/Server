package dataHelperImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dataHelper.DataHelper;
import dataHelper.DeleteDataHelper;
import dataHelper.GetAllDataHelper;
import po.HotelWorkerPO;
import utilities.JDBCUtil;
import utilities.ResultMessage;

/**
 * 
 * @author 董金玉
 * lastChangedBy 董金玉
 * updateTime 2016/11/28
 *
 */
public class HotelWorkerDataHelperImpl implements DataHelper, GetAllDataHelper, DeleteDataHelper{

	private Connection conn;
	
	private PreparedStatement ps;
	
	private ResultSet rs;
	
	/**
	 * @author 董金玉
	 * @lastChangedBy 董金玉
	 * @updateTime 2016/11/28
	 * 构造函数，初始化成员变量conn
	 */
	public HotelWorkerDataHelperImpl(){
		this.conn = JDBCUtil.getConnection();
	}

	/**
	 * @author 董金玉
	 * @lastChangedBy 董金玉
	 * @updateTime 2016/11/28
	 * @param 
	 * @return Object 获取所有hotelWorkerInfo载体
	 */
	public Object getAll() {
		String sql = "SELECT * FROM hotelworker"; //sql语句，挑选所有hotelWorker数据
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>(); //封装多条数据
		
		try {
			ps = conn.prepareStatement(sql); //获取数据的准备工作
			rs = ps.executeQuery(); //得到执行语句后的结果集合
			
			while(rs.next()){
				Map<String,Object> result = new HashMap<String,Object>(); //封装一条数据
				result.put("hotelWorkerID", rs.getObject(1)); //1-3的硬编码对应表中的表项
				result.put("hotelName", rs.getObject(2));
				result.put("password", rs.getObject(3));
				
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
	 * @param Object 应为hotelWorkerPO-hotelWorkerInfo载体
	 * @return Object hotelWorkerPO是否成功添加到数据库中
	 */
	public Object add(Object object) {
		HotelWorkerPO hotelWorkerPO = (HotelWorkerPO)object;
		String sql = "INSERT INTO hotelworker(hotelworker.hotelWorkerID,hotelworker.hotelName,hotelworker.`password`) "
				     + "values (?,?,?)";
		
		try {
			ps = conn.prepareStatement(sql); //插入数据的准备工作，1-3对应sql语句中问号的顺序
			ps.setString(1, hotelWorkerPO.getHotelWorkerID());
			ps.setString(2, hotelWorkerPO.getHotelName()); //在使用setObject方法是必须注意，我们应该使用对应数据类型
			ps.setString(3, hotelWorkerPO.getPassword()); //虽然Object可以替代所有该set方法，但会影响效率所以尽量使用对应数据类型的set方法
			
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
	 * @param Object 应为hotelWorkerPO-hotelWorkerInfo载体
	 * @return Object hotelWorkerPO是否成功修改数据库中的指定hotelWorkerInfo
	 */
	public Object modify(Object object) {
		HotelWorkerPO hotelWorkerPO = (HotelWorkerPO)object;
		String sql = "UPDATE hotelworker SET "
				+ "hotelworker.hotelName = ?,hotelworker.`password` = ? "
				+ "WHERE hotelworker.hotelWorkerID = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, hotelWorkerPO.getHotelName());
			ps.setString(2, hotelWorkerPO.getPassword());
			ps.setString(3, hotelWorkerPO.getHotelWorkerID());
			
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
	 * @param Object 应为hotelWorkerID
	 * @return Object 是否成功删除指定酒店工作人员信息
	 */
	public Object delete(Object object) {
		String hotelWorkerID = (String)object;
		String sql = "DELETE FROM hotelworker WHERE hotelworker.hotelWorkerID = ?";
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1,hotelWorkerID);
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
	 * @param Object 应为hotelWorkerID
	 * @return Object 数据库中的指定hotelWorkerInfo载体
	 */
	public Object getSingle(Object object) {
		String hotelWorkerID  = (String)object;
		HotelWorkerPO hotelWorkerPO = null;
		String sql = "SELECT hotelworker.hotelName,hotelworker.`password` "
				+ "FROM hotelworker WHERE hotelworker.hotelWorkerID = ?"; //获取一条数据根据hotelWorkerID
		
		try {
			ps = conn.prepareStatement(sql); //该处与getAll方法相同
			ps.setString(1, hotelWorkerID);
			rs = ps.executeQuery();
			
			if(rs!=null){
				hotelWorkerPO  = new HotelWorkerPO();
				hotelWorkerPO.setHotelWorkerID(hotelWorkerID);
				hotelWorkerPO.setHotelName(rs.getString(1)); //此处硬编码1-2对应sql语句中元素
				hotelWorkerPO.setPassword(rs.getString(2));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return hotelWorkerPO;
	}

	/**
	 * @author 董金玉
	 * @lastChangedBy 董金玉
	 * @updateTime 2016/11/28
	 * @param 
	 * @return 
	 */
	public void close() { //当决定抛弃该对象的时候，调用该方法
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
