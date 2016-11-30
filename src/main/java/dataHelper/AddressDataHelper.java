package dataHelper;

import java.util.List;

import po.AddressPO;

/**
 * 
 * @author 董金玉
 * lastChangedBy 董金玉
 * updateTime 2016/11/29
 *
 */
public interface AddressDataHelper {

	/**
	 * @author 董金玉
	 * @lastChangedBy 董金玉
	 * @updateTime 2016/11/29
	 * @param 
	 * @return List<String> 获取所有city
	 */
	List<String> getCity();
	
	/**
	 * @author 董金玉
	 * @lastChangedBy 董金玉
	 * @updateTime 2016/11/29
	 * @param city 城市
	 * @return List<AddressPO> 获取所有指定city的商圈
	 */
	List<AddressPO> getCycle(String city);
	
	/**
	 * @author 董金玉
	 * @lastChangedBy 董金玉
	 * @updateTime 2016/11/29
	 * @param city 城市
	 * @param cycle 商圈
	 * @return List<AddressPO> 获取所有指定city和指定商圈的折扣
	 */
	double getDiscout(String city, String cycle);
	
	/**
	 * @author 董金玉
	 * @lastChangedBy 董金玉
	 * @updateTime 2016/11/29
	 * @return List<AddressPO> 获取所有商圈和城市
	 */
	List<AddressPO> getAll();
	
	/**
	 * @author 董金玉
	 * @lastChangedBy 董金玉
	 * @updateTime 2016/11/29
	 * @param 
	 * @return 
	 */
	void close();
}
