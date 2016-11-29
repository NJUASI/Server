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
import dataHelper.GetAllDataHelper;
import po.WebManagerPO;
import utilities.JDBCUtil;
import utilities.ResultMessage;

/**
 * 
 * @author 董金玉
 * lastChangedBy 董金玉
 * updateTime 2016/11/29
 *
 */
public class WebManagerDataHelperImpl implements DataHelper, GetAllDataHelper{

	private Connection conn;
	
	private PreparedStatement ps;
	
	private ResultSet rs;
	
	/**
	 * @author 董金玉
	 * @lastChangedBy 董金玉
	 * @updateTime 2016/11/29
	 * 构造函数，初始化成员变量conn
	 */
	public WebManagerDataHelperImpl(){
		this.conn = JDBCUtil.getConnection();
	}
	
	/**
	 * @author 董金玉
	 * @lastChangedBy 董金玉
	 * @updateTime 2016/11/29
	 * @param 
	 * @return Object 获取所有webManagerInfo载体
	 */
	public Object getAll() {
		String sql = "SELECT * FROM webmanager"; //sql语句，挑选所有webManager数据
		List<Map<String,Object>> list  = new ArrayList<Map<String,Object>>(); //封装多条数据
		
		try {
			ps = conn.prepareStatement(sql); //执行sql语句
			rs = ps.executeQuery(); //获得执行后的结果
			
			while(rs.next()){
				Map<String, Object> map =  new HashMap<String, Object>(); //封装一条数据
				map.put("webManagerID", rs.getString(1));
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
	 * @updateTime 2016/11/29
	 * @param Object 应为webManagerPO-webManagerInfo载体
	 * @return Object webManagerPO是否成功添加到数据库中
	 */
	public Object add(Object object) {
		WebManagerPO webManagerPO = (WebManagerPO)object;
		String sql = "INSERT INTO webmanager(webmanager.webManagerID,webmanager.`password`) VALUES(?,?)";
		
		try {
			ps = conn.prepareStatement(sql); //插入数据的准备工作，1-2对应sql语句中问号的顺序
			ps.setString(1, webManagerPO.getWebManagerID());
			ps.setString(2, webManagerPO.getPassword()); //在使用setObject方法是必须注意，我们应该使用对应数据类型,
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
	 * @updateTime 2016/11/29
	 * @param Object 应为webManagerPO-webManagerInfo载体
	 * @return Object webManagerPO 是否成功修改数据库中的指定webManagerInfo
	 */
	public Object modify(Object object) {
		WebManagerPO webManagerPO = (WebManagerPO)object;
		String sql = "UPDATE webmanager SET webmanager.`password` = ? WHERE webmanager.webManagerID = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, webManagerPO.getPassword());
			ps.setString(2, webManagerPO.getWebManagerID());
			
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
	 * @updateTime 2016/11/29
	 * @param Object 应为webManagerdID
	 * @return Object 数据库中的指定webManagerInfo载体
	 */
	public Object getSingle(Object object) {
		String webManagerID  = (String)object;
		WebManagerPO webManagerPO = null;
		String sql = "SELECT webmanager.`password` FROM webmanager "
				+ "WHERE webmanager.webManagerID = ?"; //获取一条数据根据webManagerID
		
		try {
			ps = conn.prepareStatement(sql); //该处与getAll方法相同
			ps.setString(1, webManagerID);
			rs = ps.executeQuery();
			
			if(rs!=null){
				webManagerPO  = new WebManagerPO(webManagerID,rs.getString(1));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return webManagerPO;
	}

	/**
	 * @author 董金玉
	 * @lastChangedBy 董金玉
	 * @updateTime 2016/11/29
	 * @param 
	 * @return 
	 */
	public void close() { //当决定抛弃该对象的时候，调用该方法
		JDBCUtil.close(rs, ps, conn);
	}

	/**
	 * @author 董金玉
	 * @lastChangedBy 董金玉
	 * @updateTime 2016/11/29
	 * @param 
	 * @return 
	 * 尚未实现，根据需要进行实现
	 */
	public Object getAll(Object object) { //根据是否想要有筛选，实现该方法
		return null;
	}
}
