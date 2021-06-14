package com.skeyedu.mall.service.order;

import java.util.List;

import com.skeyedu.mall.entity.Order;
import com.skeyedu.mall.entity.OrderDetail;
import com.skeyedu.mall.entity.User;
import com.skeyedu.mall.param.OrderDetailParam;
import com.skeyedu.mall.param.OrderParams;
import com.skeyedu.mall.utils.Pager;
import com.skeyedu.mall.utils.ShoppingCart;

public interface OrderService {
	Order payShoppingCart(ShoppingCart cart, User user,String adress);//购物

	List<Order> queryOrderList(Integer id,Pager pager);

	public int getOrderRowCount(OrderParams params);

	List<OrderDetail> queryOrderDetailList(OrderDetailParam params);

	Order findById(String parameter);//根据ID获取订单
	//查询全部订单
	List<Order> queryOrderList(Pager pager);
}
