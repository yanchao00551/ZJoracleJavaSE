package cn.tyit.orderSystem;

/*
 * 订单实体类
 */
public class OrderingSet {
	//数据主体 ： 一组订单信息 
	String[] names = new String[4]; //订餐人姓名
	String[] dishMegs = new String[4];  //所选菜品
	int[] times = new int[4];  //送餐时间
	String[] addresses = new String[4];  //送餐地址
	int[] states = new int[4];  //订单状态：0 已预订  1： 已完成
	double[] sumPrice = new double[4];  //总金额
}
