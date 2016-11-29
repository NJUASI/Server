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
import po.WebMarketerPO;
import utilities.JDBCUtil;
import utilities.ResultMessage;

/**
 * 
 * @author 董金玉
 * lastChangedBy 董金玉
 * updateTime 2016/11/28
 *
 */
public class WebMarketerDataHelperImpl implements DataHelper, GetAllDataHelper, DeleteDataHelper{

	private Connection conn;
	
	private PreparedStatement ps;
	
	private ResultSet rs;
	
	/**
	 * @author 董金玉
	 * @lastChangedBy 董金玉
	 * @updateTime 2016/11/28
	 * 构造函数，初始化成员变量conn
	 */
	public WebMarketerDataHelperImpl(){
		this.conn  = JDBCUtil.getConnection();
	}
	
	/**
	 * @author 董金玉
	 * @lastChangedBy 董金玉
	 * @updateTime 2016/11/28
	 * @param 
	 * @return Object 获取所有webMarketerInfo载体
	 */
	public Object getAll() {
		String sql = "SELECT * FROM webmarketer"; //sql语句，挑选所有webMarketer数据
		List<Map<String,Object>> list  = new ArrayList<Map<String,Object>>(); //封装多条数据
		
		try {
			ps = conn.prepareStatement(sql); //执行sql语句
			rs = ps.executeQuery(); //获得执行后的结果
			
			while(rs.next()){
				Map<String, Object> map =  new HashMap<String, Object>(); //封装一条数据
				map.put("webMarketerID", rs.getString(1));
				map.put("password", rs.getString(2));
				list.add(map);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return list;
	}
	
	/**
	 * @author 董金玉
	 * @lastChangedBy 董金玉
	 * @updateTime 2016/11/28
	 * @param Object 应为webMarketerPO-webMarketerInfo载体
	 * @return Object webMarketerPO是否成功添加到数据库中
	 */
	public Object add(Object object) {
		WebMarketerPO webMarketerPO = (WebMarketerPO)object;
		String sql = "INSERT INTO webmarketer(webmarketer.webMarketerID,webmarketer.`password`) VALUES(?,?)";
		
		try {
			ps = conn.prepareStatement(sql); //插入数据的准备工作，1-2对应sql语句中问号的顺序
			ps.setString(1, webMarketerPO.getWebMarketerID());
			ps.setString(2, webMarketerPO.getPassword()); //在使用setObject方法是必须注意，我们应该使用对应数据类型,
			                                              //虽然Object可以替代所有该set方法，但会影响效率所以尽量使用对应数据类型的set方法
			
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
	 * @param Object 应为webMarketerPO-webMarketerInfo载体
	 * @return Object webMarketerPO 是否成功修改数据库中的指定webMarketerInfo
	 */
	public Object modify(Object object) {
		WebMarketerPO webMarketerPO = (WebMarketerPO)object;
		String sql = "UPDATE webmarketer SET webmarketer.`password` = ? WHERE webmarketer.webMarketerID = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, webMarketerPO.getPassword());
			ps.setString(2, webMarketerPO.getWebMarketerID());
			
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
	 * @param Object 应为webMarketerID
	 * @return Object 是否成功删除指定网站营销人员信息
	 */
	public Object delete(Object object) {
		String webMarketerID = (String)object;
		String sql = "DELETE FROM webmarketer WHERE webmarketer.webMarketerID = ?;";
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1,webMarketerID);
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
	 * @param Object 应为webMarketerID
	 * @return Object 数据库中的指定webMarketerInfo载体
	 */
	public Object getSingle(Object object) {
		String webMarketerID  = (String)object;
		WebMarketerPO webMarketerPO = null;
		String sql = "SELECT webmarketer.`password` FROM webmarketer "
				+ "WHERE webmarketer.webMarketerID = ?"; //获取一条数据根据webMarketerID
		
		try {
			ps = conn.prepareStatement(sql); //该处与getAll方法相同
			ps.setString(1, webMarketerID);
			rs = ps.executeQuery();
			
			if(rs!=null){
				webMarketerPO  = new WebMarketerPO(webMarketerID,rs.getString(1));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return webMarketerPO;
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
	public Object getAll(Object object) { //根据是否想要有筛选，实现该方法
		return null;
	}
}
