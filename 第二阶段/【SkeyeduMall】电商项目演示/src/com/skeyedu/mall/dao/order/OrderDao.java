package com.skeyedu.mall.dao.order;

import java.util.List;

import com.skeyedu.mall.dao.IBaseDao;
import com.skeyedu.mall.entity.Order;
import com.skeyedu.mall.param.OrderParams;

public interface OrderDao extends IBaseDao {

	public void saveOrder(Order order) ;

	public void deleteById(Integer id);
	
	public Order getOrderById(Integer id) ;
	
	public List<Order> queryOrderList(OrderParams params) ;
	
	public Integer queryOrderCount(OrderParams params);
}