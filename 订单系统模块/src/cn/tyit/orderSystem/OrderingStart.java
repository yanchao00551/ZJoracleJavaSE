package cn.tyit.orderSystem;


/*
 * 系统主入口类
 */
public class OrderingStart {
	public static void main(String[] args){
		OrderingUtil om = new OrderingUtil();
		om.initial();     //初始化订单数据
		om.startMenu();   //启动菜单
	}
}
