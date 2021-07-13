package demo;

/**
 * 系统入口类
 * @author 10947
 *
 */
public class OrderingStart {
	public static void main(String[] args) {
		OrderingUtil om = new OrderingUtil();
		om.initial();   //初始化订单数据
		om.startMenu();   //启动菜单
	}
}
