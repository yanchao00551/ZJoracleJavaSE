package demo;

public class OrderService {
	
	/**
	 * 生成订单 V1.0
	 * 当下次升级版本
	 * add方法进行改变，以前的OrderDaoImpl实现类的save
	 * 已经部门满足我的需求了，如果改动很多，
	 * service层的改动巨大的
	 * 
	 * service层高度依赖dao层实现类
	 * 
	 * 工厂设计模式能够将 service层和dao实现类解耦
	 */
	public void add() {
		//处理订单信息的业务逻辑  
		//....
		
		//处理完成，把订单数据保存数据库

		//业务逻辑层 调  DAO层
		OrderDao orderDao = new OrderDaoImpl();
		orderDao.save2();   
	}
}
