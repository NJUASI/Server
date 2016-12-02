package dataHelperImpl.stub;

import java.util.ArrayList;
import java.util.List;

import dataHelper.AddressDataHelper;
import po.AddressPO;
import utilities.ResultMessage;

/**
 * 
 * @author 董金玉 lastChangedBy 董金玉 updateTime 2016/11/30
 *
 */
public class AddressDataHelperImpl_Stub implements AddressDataHelper {

	/**
	 * @author 董金玉
	 * @lastChangedBy 董金玉
	 * @updateTime 2016/12/1
	 * @return List<String> 所有城市
	 */
	public List<String> getCity() {
		List<String> list = new ArrayList<String>();
		list.add("南京");
		list.add("南京");
		list.add("南京");
		list.add("武汉");
		list.add("北京");
		list.add("北京");

		return this.deletDuplicate(list);
	}

	/**
	 * @author 董金玉
	 * @lastChangedBy 董金玉
	 * @updateTime 2016/12/1
	 * @param city
	 *            城市
	 * @return List<String> 指定城市的所有商圈
	 */
	public List<String> getCycle(final String city) {
		List<String> list = new ArrayList<String>();
		list.add("新街口");
		list.add("仙林");
		list.add("玄武");
		list.add("汉庭");
		list.add("九龙");
		list.add("浦口");

		return list;
	}

	/**
	 * @author 董金玉
	 * @lastChangedBy 董金玉
	 * @updateTime 2016/12/1
	 * @param city
	 *            城市
	 * @param cycle
	 *            商圈
	 * @return double 指定城市和商圈的折扣
	 */
	public double getDiscout(final String city, final String cycle) {

		return 0.9;
	}

	/**
	 * @author 董金玉
	 * @lastChangedBy 董金玉
	 * @updateTime 2016/12/1
	 * @return List<AddressPO> 所有addressInfo载体
	 */
	public List<AddressPO> getAll() {
		List<AddressPO> list = new ArrayList<AddressPO>();
		list.add(new AddressPO("南京", "新街口", 0.9));
		list.add(new AddressPO("武汉", "汉庭", 0.9));
		return list;
	}

	/**
	 * @author 董金玉
	 * @lastChangedBy 董金玉
	 * @updateTime 2016/12/1
	 * @param discout
	 *            需要修改的折扣
	 * @param city
	 *            城市
	 * @param cycle
	 *            商圈
	 * @return ResultMessage 是否成功修改折扣
	 */
	public ResultMessage modifyDiscout(final double discout, final String city, final String cycle) {
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
	}

	/**
	 * @author 董金玉
	 * @lastChangedBy 董金玉
	 * @updateTime 2016/11/30
	 * @param list
	 *            含有重复字符串的list
	 * @return List<String> 去除重复字符串的list
	 */
	private List<String> deletDuplicate(List<String> list) {

		// 判断相邻元素是否重复，重复则删除
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
