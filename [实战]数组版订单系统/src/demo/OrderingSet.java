package demo;

/**
 * 订单实体类
 * @author 10947
 *
 */
public class OrderingSet {
	//数据主体 一组订单信息
	String[] names = new String[4];   //订餐人姓名
	String[] dishMsg = new String[4]; //所选菜品
	Integer[] times = new Integer[4]; //送餐时间
	String[] addresses = new String[4];  //送餐地址
	int[] states = new int[4];   //订单状态：已预定  1：已完成
	Double[] sumPrices = new Double[4];   //总金额
}
